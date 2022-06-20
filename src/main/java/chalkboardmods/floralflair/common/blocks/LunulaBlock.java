package chalkboardmods.floralflair.common.blocks;

import org.jetbrains.annotations.Nullable;

import chalkboardmods.floralflair.common.FloralProperties;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FlowerBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class LunulaBlock extends FlowerBlock {

	public static final IntProperty TIME = FloralProperties.TIME;

	public LunulaBlock(StatusEffect suspiciousStewEffect, int effectDuration, Settings settings) {
		super(suspiciousStewEffect, effectDuration, settings);
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
		super.appendProperties(stateManager);
		stateManager.add(TIME);
	}

	@Override
	public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
		world.setBlockState(pos, state.with(TIME, getLunulaState(world)));
	}

	@Override
	public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
		world.setBlockState(pos, state.with(TIME, getLunulaState(world)));
	}

	public static int getLunulaState(World world) {
		long i = world.getTimeOfDay();
		int state = 0;
		if (i > 24000L) {
			i = i % 24000L;
		}
		if (i > 0L && i < 8200L) {
			state = 0;
		} else if (i > 8200L && i < 12786L) {
			state = 1;
		} else if (i > 12786L && i < 13670L) {
			state = 2;
		} else if (i > 13670L && i < 22331L) {
			state = 3;
		} else if (i > 22331L && i < 23300L) {
			state = 2;
		} else if (i > 23300L && i < 23900L) {
			state = 1;
		} else if (i > 23900L && i < 24000L) {
			state = 0;
		}
		return state;
	}

}
