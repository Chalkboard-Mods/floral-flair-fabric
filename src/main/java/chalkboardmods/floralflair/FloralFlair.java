package chalkboardmods.floralflair;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.Block;
import net.minecraft.block.FlowerBlock;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraft.util.registry.*;
public class FloralFlair implements ModInitializer {

	public static final String MOD_ID = "floral_flair";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	// Foxnip
	public static final Block FOXNIP = new FlowerBlock(StatusEffects.SLOWNESS, 8,FabricBlockSettings.copyOf(Blocks.POPPY).strength(0.0F).nonOpaque());
	public static final Block POTTED_FOXNIP = new FlowerPotBlock(FOXNIP,FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());
	// Frosted Foxnip
	public static final Block FROSTED_FOXNIP = new FlowerBlock(StatusEffects.SLOWNESS, 5,FabricBlockSettings.copyOf(Blocks.POPPY).strength(0.0F).nonOpaque());
	public static final Block POTTED_FROSTED_FOXNIP = new FlowerPotBlock(FROSTED_FOXNIP,FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());
	// Rose
	public static final Block ROSE = new FlowerBlock(StatusEffects.REGENERATION, 9,FabricBlockSettings.copyOf(Blocks.POPPY).strength(0.0F).nonOpaque());
	public static final Block POTTED_ROSE = new FlowerPotBlock(ROSE,FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());
	// Sunset Poppy
	public static final Block SUNSET_POPPY = new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 11,FabricBlockSettings.copyOf(Blocks.POPPY).strength(0.0F).nonOpaque());
	public static final Block POTTED_SUNSET_POPPY = new FlowerPotBlock(SUNSET_POPPY,FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());
	// Jungle Gem
	public static final Block JUNGLE_GEM = new FlowerBlock(StatusEffects.GLOWING, 10,FabricBlockSettings.copyOf(Blocks.DANDELION).strength(0.0F).nonOpaque());
	public static final Block POTTED_JUNGLE_GEM = new FlowerPotBlock(JUNGLE_GEM,FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());
	// Pulse Petal
	public static final Block PULSE_PETAL = new FlowerBlock(StatusEffects.HEALTH_BOOST, 8,FabricBlockSettings.copyOf(Blocks.POPPY).strength(0.0F).nonOpaque());
	public static final Block POTTED_PULSE_PETAL = new FlowerPotBlock(PULSE_PETAL,FabricBlockSettings.copyOf(Blocks.FLOWER_POT).strength(0.0F).nonOpaque());
	// Fairy Blossom
	public static final Block FAIRY_BLOSSOM = new TallFlowerBlock(FabricBlockSettings.of(Material.REPLACEABLE_PLANT).noCollision().strength(0.0f).sounds(BlockSoundGroup.GRASS).strength(0.0F).nonOpaque());
	// Muscari
	public static final Block MUSCARI = new TallFlowerBlock(FabricBlockSettings.of(Material.REPLACEABLE_PLANT).noCollision().strength(0.0f).sounds(BlockSoundGroup.GRASS).strength(0.0F).nonOpaque());

	@Override
	public void onInitialize() {
		// Foxnip
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "foxnip"), FOXNIP);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "foxnip"), new BlockItem(FOXNIP, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "potted_foxnip"),POTTED_FOXNIP);
		// Frosted Foxnip
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "frosted_foxnip"), FROSTED_FOXNIP);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "frosted_foxnip"), new BlockItem(FROSTED_FOXNIP, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "potted_frosted_foxnip"),POTTED_FROSTED_FOXNIP);
		// Rose
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "rose"), ROSE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rose"), new BlockItem(ROSE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "potted_rose"),POTTED_ROSE);
		// Sunset Poppy
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "sunset_poppy"), SUNSET_POPPY);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sunset_poppy"), new BlockItem(SUNSET_POPPY, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "potted_sunset_poppy"),POTTED_SUNSET_POPPY);
		// Jungle Gem
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "gem_of_the_jungle"), JUNGLE_GEM);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "gem_of_the_jungle"), new BlockItem(JUNGLE_GEM, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "potted_gem_of_the_jungle"),POTTED_JUNGLE_GEM);
		// Pulse Petal
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "pulse_petal"), PULSE_PETAL);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pulse_petal"), new BlockItem(PULSE_PETAL, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "potted_pulse_petal"),POTTED_PULSE_PETAL);
		// Fairy Blossom
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "fairy_blossom"), FAIRY_BLOSSOM);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fairy_blossom"), new BlockItem(FAIRY_BLOSSOM, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		// Muscari
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "muscari"), MUSCARI);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "muscari"), new BlockItem(MUSCARI, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
		// Config
		AutoConfig.register(FloralConfig.class, GsonConfigSerializer::new);
		FloralConfig floralconfig = AutoConfig.getConfigHolder(FloralConfig.class).getConfig();
	}
}