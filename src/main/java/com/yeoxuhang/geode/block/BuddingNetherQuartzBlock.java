package com.yeoxuhang.geode.block;

import com.yeoxuhang.geode.registry.GeodeModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.PushReaction;

import java.util.Random;

public class BuddingNetherQuartzBlock extends AmethystBlock {
    private static final Direction[] DIRECTIONS = Direction.values();

    public BuddingNetherQuartzBlock(Properties properties) {
        super(properties);
    }

    public PushReaction getPistonPushReaction(BlockState blockState) {
        return PushReaction.DESTROY;
    }

    public void randomTick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, Random random) {
        if (random.nextInt(3) == 0) {
            Direction direction = DIRECTIONS[random.nextInt(DIRECTIONS.length)];
            BlockPos blockpos = blockPos.relative(direction);
            BlockState blockstate = serverLevel.getBlockState(blockpos);
            Block block = null;
            if (canClusterGrowAtState(blockstate)) {
                block = GeodeModBlocks.QUARTZ_CRYSTAL.get();
            }

            if (block != null) {
                BlockState blockstate1 = block.defaultBlockState().setValue(QuartzCrystalBlock.FACING, direction).setValue(QuartzCrystalBlock.WATERLOGGED, Boolean.valueOf(blockstate.getFluidState().getType() == Fluids.WATER));
                serverLevel.setBlockAndUpdate(blockpos, blockstate1);
            }

        }
    }

    public static boolean canClusterGrowAtState(BlockState blockState) {
        return blockState.isAir() || blockState.is(Blocks.WATER) && blockState.getFluidState().getAmount() == 8;
    }
}