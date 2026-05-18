# PrivateMines API

Public API for modules that want to work with the PrivateMines PrisonCore module.

Use this for things like pickaxe enchants, drills, boosters, rewards, leaderboards, and analytics. Do not depend on the full PrivateMines module jar in your project.

## Installation

Add the API as a compile-only dependency:

```kotlin
dependencies {
    compileOnly("com.github.frosxt:private-mines-api:1.0.0")
}
```

The server still needs the real PrivateMines module installed. The PrivateMines jar bundles this API and provides the actual services at runtime.

Do not shade this API into your own module.

## Getting Services

Resolve PrivateMines services through PrisonCore capabilities:

```java
final PrivateMineQueryService mines = context.capabilities().resolve(PrivateMineCapabilityKeys.QUERY_SERVICE);

final PrivateMineBlockMutationService blocks = context.capabilities().resolve(PrivateMineCapabilityKeys.BLOCK_MUTATION_SERVICE);
```

Common services:

- `QUERY_SERVICE`: read mine data.
- `MINE_SERVICE`: create, load, unload, and delete mines.
- `ACCESS_SERVICE`: check mine access and visitor permissions.
- `RESET_SERVICE`: reset mines and check reset state.
- `TEMPLATE_SERVICE`: read mine templates.
- `UPGRADE_SERVICE`: read and apply mine upgrades.
- `BLOCK_MUTATION_SERVICE`: break packet mine blocks safely.
- `EXTENSION_REGISTRY`: register break hooks and reward handlers.

## Breaking Mine Blocks

If your module breaks mine blocks, use `PrivateMineBlockMutationService`. This keeps packets, XP, taxes, block monsters, resets, and stats working correctly.

```java
final MineBlockBreakOutcome outcome = blocks.breakBlock(
        playerId,
        mineOwnerId,
        new MineBlockPosition(localX, localY, localZ),
        MineBreakSource.ENCHANT
);

if (outcome.changed()) {
    // Your module can count progress or add extra rewards here.
}
```

Use `breakBlocks` for enchants or drills that break many blocks at once.

## Events And Hooks

Listen to API events if you only need to react to mine activity.

Useful events:

- `PrivateMineBlockBreakPreEvent`
- `PrivateMineBlockBreakPostEvent`
- `PrivateMineCreatedEvent`
- `PrivateMineDeletedEvent`
- `PrivateMineResetEvent`
- `PrivateMineLevelUpEvent`
- `PrivateMineAccessChangedEvent`

Use `EXTENSION_REGISTRY` when you want a clean hook for break modifiers or extra break rewards.

## Package Layout

- `api.capability`: capability keys and optional provider hooks.
- `api.service`: services your module resolves and calls.
- `api.model.*`: small value objects and enums.
- `api.view.*`: read-only mine snapshots.
- `api.event.*`: events grouped by feature area.
- `api.extension`: break hooks and reward hooks.

## Rules

- Use API services instead of PrivateMines implementation classes.
- Do not edit real Bukkit blocks to change packet mines.
- Do not send your own packet mine block updates.
- Do not depend on PacketEvents or PrivateMines internals.
- Close extension registrations when your module disables.

## Build

```powershell
.\gradlew.bat :private-mines-api:build
```

The jar is created in:

```text
private-mines-api/build/libs/
```
