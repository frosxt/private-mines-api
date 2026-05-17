# PrivateMines API

`private-mines-api` is the public contract for integrating external PrisonCore modules with PrivateMines. It contains only stable API types: capability keys, services, value objects, events, and extension interfaces.

External modules should compile against this API artifact and resolve runtime implementations through PrisonCore capabilities. Server installs can use the PrivateMines runtime jar, which bundles these API classes so PrivateMines can publish typed capabilities.

## Runtime Requirement

PrisonCore modules are classloader-isolated. For typed capabilities to work, every module must resolve the same API classes at runtime.

That means:

- PrivateMines bundles `private-mines-api` in its runtime jar.
- Dependent modules compile against the standalone API artifact.
- Do not shade `private-mines-api` into extension modules.
- Do not compile extension modules against implementation classes under `application`, `domain`, `infrastructure`, or `bootstrap`.

If PrisonCore does not expose dependency module classes to dependent module classloaders, then the API jar still needs to be supplied through a platform/shared classpath or moved into a platform-level API artifact. Do not allow each extension module to package its own private copy.

## Gradle Dependency

Use the published API artifact in extension modules:

```kotlin
dependencies {
    compileOnly("com.github.frosxt:private-mines-api:1.0.0")
}
```

The API itself only compiles against PrisonCore `platform-api`.

## Capability Access

Resolve services through PrisonCore's `CapabilityRegistry`:

```java
final PrivateMineBlockMutationService blocks = context.capabilities()
        .resolve(PrivateMineCapabilityKeys.BLOCK_MUTATION_SERVICE);

final PrivateMineQueryService mines = context.capabilities()
        .resolve(PrivateMineCapabilityKeys.QUERY_SERVICE);
```

Main capabilities:

- `MINE_SERVICE`: create, load, unload, and delete mines.
- `QUERY_SERVICE`: read mine views and loaded mine state.
- `ACCESS_SERVICE`: check and mutate visit, mine, teleport, and management access.
- `RESET_SERVICE`: reset mines and query reset state.
- `TEMPLATE_SERVICE`: inspect templates and unlock requirements.
- `UPGRADE_SERVICE`: query and apply mine upgrades.
- `VIEW_SERVICE`: attach or remove packet viewers.
- `BLOCK_MUTATION_SERVICE`: guarded virtual block breaking for drills, enchants, and systems.
- `EXTENSION_REGISTRY`: register break modifiers and reward handlers.
- `PROGRESSION_PROVIDER`, `REWARD_PROVIDER`, `UPGRADE_PRICING`, `BLOCK_DROP_INTERCEPTOR`, and `ECONOMY_BRIDGE`: optional integration hooks.

## Guarded Block Mutation

External modules must not edit virtual mine state or send packet updates directly. Use `PrivateMineBlockMutationService`.

```java
final MineBlockBreakOutcome outcome = blocks.breakBlock(
        drillOwnerId,
        mineOwnerId,
        new MineBlockPosition(localX, localY, localZ),
        MineBreakSource.DRILL
);

if (outcome.changed()) {
    // Count drill progress, grant module-specific rewards, or update visuals.
}
```

PrivateMines owns:

- Mine access validation.
- Virtual block state changes.
- Packet block updates.
- Mine XP and level progression.
- Block monster damage.
- Visitor tax and vault accrual.
- Reset threshold checks.
- Persistence dirty marking.
- Pre/post break events and extension callbacks.

Use `breakBlocks` for drills or enchant effects that affect multiple positions. The returned `MineBlockBreakBatchOutcome` contains one result per requested block.

## Coordinates

The API uses value objects first:

- `UUID` for players and mine owners.
- `MineId` and `MineOwner` for stable identity.
- `MineBlockPosition` for local mine coordinates.
- `MineRegionView` for packet, template, and active mine regions.
- Material values are exposed as Bukkit material names in strings.

Local coordinates are relative to the template anchor, matching PrivateMines template metadata.

## Events And Extensions

Use events for observation and extension registries for cooperative mutation hooks.

Break extension points:

- `PrivateMineBlockBreakPreEvent`: cancellable; can also cancel packet update while allowing state mutation.
- `PrivateMineBlockBreakPostEvent`: contains the final `MineBlockBreakOutcome`.
- `PrivateMineBlockBreakModifier`: register through `EXTENSION_REGISTRY` for before/after break callbacks.
- `PrivateMineBlockRewardProvider`: register through `EXTENSION_REGISTRY` to grant extra rewards after successful guarded breaks.

General events include mine create/delete/unload, viewer add/remove, enter/leave, reset, access changes, level-up, and upgrade application.

Legacy-style fake break coverage is represented by the cancellable pre-break event plus local coordinates and `cancelUpdate`.

## Views

`PrivateMineView` is the main read model. It exposes:

- Owner, id, and template.
- Access state.
- Statistics.
- Composition.
- Progression.
- Monetisation and vault totals.
- Reset state.
- Block monster state.
- Packet, full mine, and active mine regions.
- Loaded state, viewer count, and percent remaining.

Views are snapshots. Do not assume they remain current after a tick or after another module mutates the mine through a service.

## Compatibility Rules

- Treat API types as the only stable integration surface.
- Never cast services to PrivateMines implementation classes.
- Never depend on PacketEvents, runtime session classes, packet snapshots, or domain internals.
- Prefer `BLOCK_MUTATION_SERVICE` over listening to raw packet or Bukkit block events.
- Close `PrivateMineExtensionRegistration` handles when your module disables.

## Build

From the PrivateMines root:

```powershell
.\gradlew.bat :private-mines-api:build
```

The API jar and sources jar are written to:

```text
private-mines-api/build/libs/
```
