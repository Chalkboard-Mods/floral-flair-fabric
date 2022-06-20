package chalkboardmods.floralflair.core.init;

import java.util.function.ToIntFunction;

import chalkboardmods.floralflair.common.FloralProperties;
import chalkboardmods.floralflair.common.blocks.AnthuriumBlock;
import chalkboardmods.floralflair.common.blocks.LunulaBlock;
import chalkboardmods.floralflair.common.blocks.PottedAnthuriumBlock;
import chalkboardmods.floralflair.common.blocks.PottedLunulaBlock;
import chalkboardmods.floralflair.common.blocks.ScillaBlock;
import chalkboardmods.floralflair.common.blocks.SpikedTulipBlock;
import chalkboardmods.floralflair.common.blocks.StonetteBlock;
import chalkboardmods.floralflair.core.FloralFlair;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.block.Material;
import net.minecraft.block.TallFlowerBlock;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FloralBlocks {

	public static final Block FOXNIP = new FlowerBlock(StatusEffects.SLOWNESS, 8, FabricBlockSettings.copyOf(Blocks.POPPY).strength(0.0F).nonOpaque());
	public static final Block POTTED_FOXNIP = new FlowerPotBlock(FOXNIP, FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());

	public static final Block FROSTED_FOXNIP = new FlowerBlock(StatusEffects.SLOWNESS, 5, FabricBlockSettings.copyOf(Blocks.POPPY).strength(0.0F).nonOpaque());
	public static final Block POTTED_FROSTED_FOXNIP = new FlowerPotBlock(FROSTED_FOXNIP, FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());

	public static final Block ROSE = new FlowerBlock(StatusEffects.REGENERATION, 9, FabricBlockSettings.copyOf(Blocks.POPPY).strength(0.0F).nonOpaque());
	public static final Block POTTED_ROSE = new FlowerPotBlock(ROSE, FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());

	public static final Block SUNSET_POPPY = new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 11, FabricBlockSettings.copyOf(Blocks.POPPY).strength(0.0F).nonOpaque());
	public static final Block POTTED_SUNSET_POPPY = new FlowerPotBlock(SUNSET_POPPY, FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());

	public static final Block JUNGLE_GEM = new FlowerBlock(StatusEffects.GLOWING, 10, FabricBlockSettings.copyOf(Blocks.DANDELION).strength(0.0F).nonOpaque());
	public static final Block POTTED_JUNGLE_GEM = new FlowerPotBlock(JUNGLE_GEM, FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());

	public static final Block PULSE_PETAL = new FlowerBlock(StatusEffects.HEALTH_BOOST, 8, FabricBlockSettings.copyOf(Blocks.POPPY).strength(0.0F).nonOpaque());
	public static final Block POTTED_PULSE_PETAL = new FlowerPotBlock(PULSE_PETAL, FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());

	public static final Block FAIRY_BLOSSOM = new TallFlowerBlock(FabricBlockSettings.of(Material.REPLACEABLE_PLANT).noCollision().strength(0.0f).sounds(BlockSoundGroup.GRASS).strength(0.0F).nonOpaque());

	public static final Block MUSCARI = new TallFlowerBlock(FabricBlockSettings.of(Material.REPLACEABLE_PLANT).noCollision().strength(0.0f).sounds(BlockSoundGroup.GRASS).strength(0.0F).nonOpaque());

	public static final Block PURPUREUM = new TallFlowerBlock(FabricBlockSettings.of(Material.REPLACEABLE_PLANT).noCollision().strength(0.0f).sounds(BlockSoundGroup.GRASS).strength(0.0F).nonOpaque());

	public static final Block MIDNIGHT_ORCHID = new FlowerBlock(StatusEffects.RESISTANCE, 8, FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().strength(0.0f));
	public static final Block POTTED_MIDNIGHT_ORCHID = new FlowerPotBlock(MIDNIGHT_ORCHID, FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());

	public static final Block HYACINTH = new FlowerBlock(StatusEffects.RESISTANCE, 8, FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().strength(0.0f));
	public static final Block POTTED_HYACINTH = new FlowerPotBlock(HYACINTH, FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());

	public static final Block ANTHURIUM = new AnthuriumBlock(StatusEffects.RESISTANCE, 8, FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().strength(0.0f));
	public static final Block POTTED_ANTHURIUM = new PottedAnthuriumBlock(ANTHURIUM, FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());

	public static final Block SNOW_FALL_FLOWER = new FlowerBlock(StatusEffects.RESISTANCE, 8, FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().strength(0.0f));
	public static final Block POTTED_SNOW_FALL_FLOWER = new FlowerPotBlock(SNOW_FALL_FLOWER, FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());

	public static final Block SPIKED_TULIP = new SpikedTulipBlock(StatusEffects.RESISTANCE, 8, FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().strength(0.0f));
	public static final Block POTTED_SPIKED_TULIP = new FlowerPotBlock(SPIKED_TULIP, FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());

	public static final Block SCILLA = new ScillaBlock(StatusEffects.WEAKNESS, 11, FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().strength(0.0f));
	public static final Block POTTED_SCILLA = new FlowerPotBlock(SCILLA, FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());

	public static final Block STONNETE = new StonetteBlock(StatusEffects.RESISTANCE, 8, FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().strength(0.0f));
	public static final Block POTTED_STONNETE = new FlowerPotBlock(STONNETE, FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());

	public static final Block LUNULA = new LunulaBlock(StatusEffects.RESISTANCE, 8, FabricBlockSettings.copyOf(Blocks.POPPY).ticksRandomly().nonOpaque().strength(0.0f).luminance(createLightLevelFromTimeBlockState(5)));
	public static final Block POTTED_LUNULA = new PottedLunulaBlock(LUNULA, FabricBlockSettings.copyOf(Blocks.FLOWER_POT).ticksRandomly().nonOpaque().strength(0.0f).luminance(createLightLevelFromTimeBlockState(5)));

	private static ToIntFunction<BlockState> createLightLevelFromTimeBlockState(int litLevel) {
		return (state) -> state.get(FloralProperties.TIME) == 3 ? litLevel : 0;
	}

	public static void init() {
		Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "foxnip"), FOXNIP);
		Registry.register(Registry.ITEM, new Identifier(FloralFlair.MOD_ID, "foxnip"), new BlockItem(FOXNIP, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "potted_foxnip"), POTTED_FOXNIP);

		Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "frosted_foxnip"), FROSTED_FOXNIP);
		Registry.register(Registry.ITEM, new Identifier(FloralFlair.MOD_ID, "frosted_foxnip"), new BlockItem(FROSTED_FOXNIP, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "potted_frosted_foxnip"), POTTED_FROSTED_FOXNIP);

		Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "rose"), ROSE);
		Registry.register(Registry.ITEM, new Identifier(FloralFlair.MOD_ID, "rose"), new BlockItem(ROSE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "potted_rose"), POTTED_ROSE);

		Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "sunset_poppy"), SUNSET_POPPY);
		Registry.register(Registry.ITEM, new Identifier(FloralFlair.MOD_ID, "sunset_poppy"), new BlockItem(SUNSET_POPPY, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "potted_sunset_poppy"), POTTED_SUNSET_POPPY);

		Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "gem_of_the_jungle"), JUNGLE_GEM);
		Registry.register(Registry.ITEM, new Identifier(FloralFlair.MOD_ID, "gem_of_the_jungle"), new BlockItem(JUNGLE_GEM, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "potted_gem_of_the_jungle"), POTTED_JUNGLE_GEM);

		Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "pulse_petal"), PULSE_PETAL);
		Registry.register(Registry.ITEM, new Identifier(FloralFlair.MOD_ID, "pulse_petal"), new BlockItem(PULSE_PETAL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "potted_pulse_petal"), POTTED_PULSE_PETAL);

		Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "fairy_blossom"), FAIRY_BLOSSOM);
		Registry.register(Registry.ITEM, new Identifier(FloralFlair.MOD_ID, "fairy_blossom"), new BlockItem(FAIRY_BLOSSOM, new FabricItemSettings().group(ItemGroup.DECORATIONS)));

		Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "muscari"), MUSCARI);
		Registry.register(Registry.ITEM, new Identifier(FloralFlair.MOD_ID, "muscari"), new BlockItem(MUSCARI, new FabricItemSettings().group(ItemGroup.DECORATIONS)));

		Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "purpureum"), PURPUREUM);
		Registry.register(Registry.ITEM, new Identifier(FloralFlair.MOD_ID, "purpureum"), new BlockItem(PURPUREUM, new FabricItemSettings().group(ItemGroup.DECORATIONS)));

		Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "midnight_orchid"), MIDNIGHT_ORCHID);
		Registry.register(Registry.ITEM, new Identifier(FloralFlair.MOD_ID, "midnight_orchid"), new BlockItem(MIDNIGHT_ORCHID, new FabricItemSettings().group(ItemGroup.DECORATIONS)));

		Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "hyacinth"), HYACINTH);
		Registry.register(Registry.ITEM, new Identifier(FloralFlair.MOD_ID, "hyacinth"), new BlockItem(HYACINTH, new FabricItemSettings().group(ItemGroup.DECORATIONS)));

		Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "anthurium"), ANTHURIUM);
		Registry.register(Registry.ITEM, new Identifier(FloralFlair.MOD_ID, "anthurium"), new BlockItem(ANTHURIUM, new FabricItemSettings().group(ItemGroup.DECORATIONS)));

		Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "snow_fall_flower"), SNOW_FALL_FLOWER);
		Registry.register(Registry.ITEM, new Identifier(FloralFlair.MOD_ID, "snow_fall_flower"), new BlockItem(SNOW_FALL_FLOWER, new FabricItemSettings().group(ItemGroup.DECORATIONS)));

		Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "spiked_tulip"), SPIKED_TULIP);
		Registry.register(Registry.ITEM, new Identifier(FloralFlair.MOD_ID, "spiked_tulip"), new BlockItem(SPIKED_TULIP, new FabricItemSettings().group(ItemGroup.DECORATIONS)));

		Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "stonnete"), STONNETE);
		Registry.register(Registry.ITEM, new Identifier(FloralFlair.MOD_ID, "stonnete"), new BlockItem(STONNETE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));

		Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "lunula"), LUNULA);
		Registry.register(Registry.ITEM, new Identifier(FloralFlair.MOD_ID, "lunula"), new BlockItem(LUNULA, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "potted_lunula"), POTTED_LUNULA);

		Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "scilla"), SCILLA);
		Registry.register(Registry.ITEM, new Identifier(FloralFlair.MOD_ID, "scilla"), new BlockItem(SCILLA, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "potted_scilla"), POTTED_SCILLA);

		Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "potted_midnight_orchid"), POTTED_MIDNIGHT_ORCHID);
		Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "potted_hyacinth"), POTTED_HYACINTH);
		Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "potted_snow_fall_flower"), POTTED_SNOW_FALL_FLOWER);
		Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "potted_spiked_tulip"), POTTED_SPIKED_TULIP);
		Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "potted_stonnete"), POTTED_STONNETE);
		Registry.register(Registry.BLOCK, new Identifier(FloralFlair.MOD_ID, "potted_anthurium"), POTTED_ANTHURIUM);

		CompostingChanceRegistry.INSTANCE.add(FOXNIP, 0.65F);
		CompostingChanceRegistry.INSTANCE.add(FROSTED_FOXNIP, 0.65F);
		CompostingChanceRegistry.INSTANCE.add(PULSE_PETAL, 0.65F);
		CompostingChanceRegistry.INSTANCE.add(JUNGLE_GEM, 0.65F);
		CompostingChanceRegistry.INSTANCE.add(ROSE, 0.65F);
		CompostingChanceRegistry.INSTANCE.add(SUNSET_POPPY, 0.65F);
		CompostingChanceRegistry.INSTANCE.add(FAIRY_BLOSSOM, 0.65F);
		CompostingChanceRegistry.INSTANCE.add(MUSCARI, 0.65F);
		CompostingChanceRegistry.INSTANCE.add(PURPUREUM, 0.65F);
		CompostingChanceRegistry.INSTANCE.add(MIDNIGHT_ORCHID, 0.65F);
		CompostingChanceRegistry.INSTANCE.add(HYACINTH, 0.65F);
		CompostingChanceRegistry.INSTANCE.add(ANTHURIUM, 0.65F);
		CompostingChanceRegistry.INSTANCE.add(SNOW_FALL_FLOWER, 0.65F);
		CompostingChanceRegistry.INSTANCE.add(LUNULA, 0.65F);
		CompostingChanceRegistry.INSTANCE.add(SCILLA, 0.65F);

		FlammableBlockRegistry.getDefaultInstance().add(FOXNIP, 100, 60);
		FlammableBlockRegistry.getDefaultInstance().add(FROSTED_FOXNIP, 100, 60);
		FlammableBlockRegistry.getDefaultInstance().add(PULSE_PETAL, 100, 60);
		FlammableBlockRegistry.getDefaultInstance().add(JUNGLE_GEM, 100, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ROSE, 100, 60);
		FlammableBlockRegistry.getDefaultInstance().add(SUNSET_POPPY, 100, 60);
		FlammableBlockRegistry.getDefaultInstance().add(FAIRY_BLOSSOM, 100, 60);
		FlammableBlockRegistry.getDefaultInstance().add(MUSCARI, 100, 60);
		FlammableBlockRegistry.getDefaultInstance().add(PURPUREUM, 100, 60);
		FlammableBlockRegistry.getDefaultInstance().add(MIDNIGHT_ORCHID, 100, 60);
		FlammableBlockRegistry.getDefaultInstance().add(HYACINTH, 100, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ANTHURIUM, 100, 60);
		FlammableBlockRegistry.getDefaultInstance().add(SNOW_FALL_FLOWER, 100, 60);
		FlammableBlockRegistry.getDefaultInstance().add(LUNULA, 100, 60);
		FlammableBlockRegistry.getDefaultInstance().add(SCILLA, 100, 60);
	}
}
