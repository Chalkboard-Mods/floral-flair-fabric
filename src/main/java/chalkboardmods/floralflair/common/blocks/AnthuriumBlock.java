package chalkboardmods.floralflair.common.blocks;

import static net.minecraft.state.property.Properties.FACING;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FlowerBlock;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;

public class AnthuriumBlock extends FlowerBlock {

	public AnthuriumBlock(StatusEffect suspiciousStewEffect, int effectDuration, Settings settings) {
		super(suspiciousStewEffect, effectDuration, settings);
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		return this.getDefaultState().with(FACING, ctx.getPlayerFacing().getOpposite());
	}

//	@Override
//	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
//		Vec3d vec3d = state.getModelOffset(world, pos);
//		VoxelShape SHAPE = makeShape();
//		return SHAPE.offset(vec3d.x, vec3d.y, vec3d.z);
//	}
}
