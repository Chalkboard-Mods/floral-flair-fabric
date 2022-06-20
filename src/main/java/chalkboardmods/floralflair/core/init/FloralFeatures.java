package chalkboardmods.floralflair.core.init;

import java.util.List;

import chalkboardmods.floralflair.core.FloralConfig;
import chalkboardmods.floralflair.core.FloralFlair;
import net.minecraft.block.BlockState;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.RandomPatchFeatureConfig;
import net.minecraft.world.gen.feature.SimpleBlockFeatureConfig;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;

public class FloralFeatures {

	private static final WeightedBlockStateProvider ANTHURIUM_WEIGHTS = new WeightedBlockStateProvider(new DataPool.Builder<BlockState>().add(FloralBlocks.ANTHURIUM.getDefaultState().with(Properties.FACING, Direction.NORTH), 4).add(FloralBlocks.ANTHURIUM.getDefaultState().with(Properties.FACING, Direction.EAST), 4).add(FloralBlocks.ANTHURIUM.getDefaultState().with(Properties.FACING, Direction.SOUTH), 4).add(FloralBlocks.ANTHURIUM.getDefaultState().with(Properties.FACING, Direction.WEST), 4));

	public static final ConfiguredFeature<?, ?> FOXNIP_CONFIGURED = new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchFeatureConfig(64, 4, 3, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralBlocks.FOXNIP)))));
	public static final ConfiguredFeature<?, ?> FROSTED_FOXNIP_CONFIGURED = new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchFeatureConfig(64, 4, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralBlocks.FROSTED_FOXNIP)))));
	public static final ConfiguredFeature<?, ?> PULSE_PETAL_CONFIGURED = new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchFeatureConfig(64, 6, 3, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralBlocks.PULSE_PETAL)))));
	public static final ConfiguredFeature<?, ?> FAIRY_BLOSSOM_CONFIGURED = new ConfiguredFeature<>(Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralBlocks.FAIRY_BLOSSOM))));
	public static final ConfiguredFeature<?, ?> JUNGLE_GEM_CONFIGURED = new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchFeatureConfig(64, 5, 4, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralBlocks.JUNGLE_GEM)))));
	public static final ConfiguredFeature<?, ?> ROSE_CONFIGURED = new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchFeatureConfig(64, 4, 1, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralBlocks.ROSE)))));
	public static final ConfiguredFeature<?, ?> SUNSET_POPPY_CONFIGURED = new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchFeatureConfig(64, 7, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralBlocks.SUNSET_POPPY)))));
	public static final ConfiguredFeature<?, ?> MUSCARI_CONFIGURED = new ConfiguredFeature<>(Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralBlocks.MUSCARI))));
	public static final ConfiguredFeature<?, ?> PURPUREUM_CONFIGURED = new ConfiguredFeature<>(Feature.RANDOM_PATCH, ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralBlocks.PURPUREUM))));
	public static final ConfiguredFeature<?, ?> MIDNIGHT_ORCHID_CONFIGURED = new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchFeatureConfig(64, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralBlocks.MIDNIGHT_ORCHID)))));
	public static final ConfiguredFeature<?, ?> HYACINTH_CONFIGURED = new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchFeatureConfig(64, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralBlocks.HYACINTH)))));
	public static final ConfiguredFeature<?, ?> SNOW_FALL_FLOWER_CONFIGURED = new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchFeatureConfig(64, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralBlocks.SNOW_FALL_FLOWER)))));
	public static final ConfiguredFeature<?, ?> SPIKED_TULIP_CONFIGURED = new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchFeatureConfig(64, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralBlocks.SPIKED_TULIP)))));
	public static final ConfiguredFeature<?, ?> STONNETE_CONFIGURED = new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchFeatureConfig(64, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralBlocks.STONNETE)))));
	public static final ConfiguredFeature<?, ?> LUNULA_CONFIGURED = new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchFeatureConfig(64, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralBlocks.LUNULA)))));
	public static final ConfiguredFeature<?, ?> ANTHURIUM_CONFIGURED = new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchFeatureConfig(64, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(ANTHURIUM_WEIGHTS))));
	public static final ConfiguredFeature<?, ?> SCILLA_CONFIGURED = new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchFeatureConfig(64, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(FloralBlocks.SCILLA)))));

	public static final PlacedFeature FOXNIP_PLACED = new PlacedFeature(RegistryEntry.of(FOXNIP_CONFIGURED), List.of(RarityFilterPlacementModifier.of(FloralConfig.get().foxnipDensity), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
	public static final PlacedFeature FROSTED_FOXNIP_PLACED = new PlacedFeature(RegistryEntry.of(FROSTED_FOXNIP_CONFIGURED), List.of(RarityFilterPlacementModifier.of(FloralConfig.get().frostedFoxnipDensity), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
	public static final PlacedFeature PULSE_PETAL_PLACED = new PlacedFeature(RegistryEntry.of(PULSE_PETAL_CONFIGURED), List.of(RarityFilterPlacementModifier.of(FloralConfig.get().pulsePetalDensity), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
	public static final PlacedFeature FAIRY_BLOSSOM_PLACED = new PlacedFeature(RegistryEntry.of(FAIRY_BLOSSOM_CONFIGURED), List.of(RarityFilterPlacementModifier.of(FloralConfig.get().fairyBlossomDensity), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
	public static final PlacedFeature JUNGLE_GEM_PLACED = new PlacedFeature(RegistryEntry.of(JUNGLE_GEM_CONFIGURED), List.of(RarityFilterPlacementModifier.of(FloralConfig.get().jungleGemDensity), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
	public static final PlacedFeature ROSE_PLACED = new PlacedFeature(RegistryEntry.of(ROSE_CONFIGURED), List.of(RarityFilterPlacementModifier.of(FloralConfig.get().roseDensity), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
	public static final PlacedFeature SUNSET_POPPY_PLACED = new PlacedFeature(RegistryEntry.of(SUNSET_POPPY_CONFIGURED), List.of(RarityFilterPlacementModifier.of(FloralConfig.get().sunsetPoppyDensity), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
	public static final PlacedFeature MUSCARI_PLACED = new PlacedFeature(RegistryEntry.of(MUSCARI_CONFIGURED), List.of(RarityFilterPlacementModifier.of(FloralConfig.get().muscariDensity), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
	public static final PlacedFeature PURPUREUM_PLACED = new PlacedFeature(RegistryEntry.of(PURPUREUM_CONFIGURED), List.of(RarityFilterPlacementModifier.of(FloralConfig.get().purpureumDensity), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
	public static final PlacedFeature MIDNIGHT_ORCHID_PLACED = new PlacedFeature(RegistryEntry.of(MIDNIGHT_ORCHID_CONFIGURED), List.of(RarityFilterPlacementModifier.of(FloralConfig.get().midnightOrchidDensity), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
	public static final PlacedFeature HYACINTH_PLACED = new PlacedFeature(RegistryEntry.of(HYACINTH_CONFIGURED), List.of(RarityFilterPlacementModifier.of(FloralConfig.get().hyacinthDensity), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
	public static final PlacedFeature SNOW_FALL_PLACED = new PlacedFeature(RegistryEntry.of(SNOW_FALL_FLOWER_CONFIGURED), List.of(RarityFilterPlacementModifier.of(FloralConfig.get().snowFallFlowerDensity), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
	public static final PlacedFeature SPIKED_TULIP_PLACED = new PlacedFeature(RegistryEntry.of(SPIKED_TULIP_CONFIGURED), List.of(CountPlacementModifier.of(FloralConfig.get().spikedTulipDensity), SquarePlacementModifier.of(), PlacedFeatures.BOTTOM_TO_120_RANGE, BiomePlacementModifier.of()));
	public static final PlacedFeature STONNETE_PLACED = new PlacedFeature(RegistryEntry.of(STONNETE_CONFIGURED), List.of(CountPlacementModifier.of(FloralConfig.get().stonneteDensity), SquarePlacementModifier.of(), PlacedFeatures.BOTTOM_TO_120_RANGE, BiomePlacementModifier.of()));
	public static final PlacedFeature LUNULA_PLACED = new PlacedFeature(RegistryEntry.of(LUNULA_CONFIGURED), List.of(RarityFilterPlacementModifier.of(FloralConfig.get().lunulaDensity), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
	public static final PlacedFeature ANTHURIUM_PLACED = new PlacedFeature(RegistryEntry.of(ANTHURIUM_CONFIGURED), List.of(RarityFilterPlacementModifier.of(FloralConfig.get().anthuriumDensity), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));
	public static final PlacedFeature SCILLA_PLACED = new PlacedFeature(RegistryEntry.of(SCILLA_CONFIGURED), List.of(RarityFilterPlacementModifier.of(FloralConfig.get().scillaDensity), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()));

	public static void init() {
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(FloralFlair.MOD_ID, "flower_foxnip"), FOXNIP_CONFIGURED);
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(FloralFlair.MOD_ID, "flower_frosted_foxnip"), FROSTED_FOXNIP_CONFIGURED);
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(FloralFlair.MOD_ID, "flower_pulse_petal"), PULSE_PETAL_CONFIGURED);
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(FloralFlair.MOD_ID, "flower_fairy_blossom"), FAIRY_BLOSSOM_CONFIGURED);
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(FloralFlair.MOD_ID, "flower_jungle_gem"), JUNGLE_GEM_CONFIGURED);
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(FloralFlair.MOD_ID, "flower_rose"), ROSE_CONFIGURED);
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(FloralFlair.MOD_ID, "flower_sunset_poppy"), SUNSET_POPPY_CONFIGURED);
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(FloralFlair.MOD_ID, "flower_muscari"), MUSCARI_CONFIGURED);
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(FloralFlair.MOD_ID, "flower_purpureum"), PURPUREUM_CONFIGURED);
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(FloralFlair.MOD_ID, "flower_midnight_orchid"), MIDNIGHT_ORCHID_CONFIGURED);
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(FloralFlair.MOD_ID, "flower_hyacinth"), HYACINTH_CONFIGURED);
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(FloralFlair.MOD_ID, "flower_snowfall"), SNOW_FALL_FLOWER_CONFIGURED);
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(FloralFlair.MOD_ID, "flower_spiked_tulip"), SPIKED_TULIP_CONFIGURED);
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(FloralFlair.MOD_ID, "flower_stonnete"), STONNETE_CONFIGURED);
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(FloralFlair.MOD_ID, "flower_lunula"), LUNULA_CONFIGURED);
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(FloralFlair.MOD_ID, "flower_anthurium"), ANTHURIUM_CONFIGURED);
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(FloralFlair.MOD_ID, "flower_scilla"), SCILLA_CONFIGURED);

		Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(FloralFlair.MOD_ID, "flower_foxnip"), FOXNIP_PLACED);
		Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(FloralFlair.MOD_ID, "flower_frosted_foxnip"), FROSTED_FOXNIP_PLACED);
		Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(FloralFlair.MOD_ID, "flower_pulse_petal"), PULSE_PETAL_PLACED);
		Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(FloralFlair.MOD_ID, "flower_fairy_blossom"), FAIRY_BLOSSOM_PLACED);
		Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(FloralFlair.MOD_ID, "flower_jungle_gem"), JUNGLE_GEM_PLACED);
		Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(FloralFlair.MOD_ID, "flower_rose"), ROSE_PLACED);
		Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(FloralFlair.MOD_ID, "flower_sunset_poppy"), SUNSET_POPPY_PLACED);
		Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(FloralFlair.MOD_ID, "flower_muscari"), MUSCARI_PLACED);
		Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(FloralFlair.MOD_ID, "flower_purpureum"), PURPUREUM_PLACED);
		Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(FloralFlair.MOD_ID, "flower_midnight_orchid"), MIDNIGHT_ORCHID_PLACED);
		Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(FloralFlair.MOD_ID, "flower_hyacinth"), HYACINTH_PLACED);
		Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(FloralFlair.MOD_ID, "flower_snowfall"), SNOW_FALL_PLACED);
		Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(FloralFlair.MOD_ID, "flower_spiked_tulip"), SPIKED_TULIP_PLACED);
		Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(FloralFlair.MOD_ID, "flower_stonnete"), STONNETE_PLACED);
		Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(FloralFlair.MOD_ID, "flower_lunula"), LUNULA_PLACED);
		Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(FloralFlair.MOD_ID, "flower_anthurium"), ANTHURIUM_PLACED);
		Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(FloralFlair.MOD_ID, "flower_scilla"), SCILLA_PLACED);
	}

}
