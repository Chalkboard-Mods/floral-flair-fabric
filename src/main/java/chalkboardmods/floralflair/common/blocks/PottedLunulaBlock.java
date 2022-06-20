package chalkboardmods.floralflair.common.blocks;

import org.jetbrains.annotations.Nullable;

import chalkboardmods.floralflair.common.FloralProperties;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class PottedLunulaBlock extends FlowerPotBlock {

	public static final IntProperty TIME = FloralProperties.TIME;

	public PottedLunulaBlock(Block content, Settings settings) {
		super(content, settings);
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
		super.appendProperties(stateManager);
		stateManager.add(TIME);
	}

	@Override
	public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
		world.setBlockState(pos, state.with(TIME, LunulaBlock.getLunulaState(world)));
	}

	@Override
	public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
		world.setBlockState(pos, state.with(TIME, LunulaBlock.getLunulaState(world)));
	}

}
