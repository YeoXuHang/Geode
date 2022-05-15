package com.yeoxuhang.geode.block;

import com.yeoxuhang.geode.registry.GeodeModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.AmethystBlock;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.PushReaction;

import java.util.Random;

public class BuddingWrappistBlock extends AmethystBlock {
    public static final int GROWTH_CHANCE = 10;
    private static final Direction[] DIRECTIONS = Direction.values();

    public BuddingWrappistBlock(BlockBehaviour.Properties properties) {
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
                block = GeodeModBlocks.SMALL_WRAPPIST_BUD.get();
            } else if (blockstate.is(GeodeModBlocks.SMALL_WRAPPIST_BUD.get()) && blockstate.getValue(AmethystClusterBlock.FACING) == direction) {
                block = GeodeModBlocks.MEDIUM_WRAPPIST_BUD.get();
            } else if (blockstate.is(GeodeModBlocks.MEDIUM_WRAPPIST_BUD.get()) && blockstate.getValue(AmethystClusterBlock.FACING) == direction) {
                block = GeodeModBlocks.LARGE_WRAPPIST_BUD.get();
            } else if (blockstate.is(GeodeModBlocks.LARGE_WRAPPIST_BUD.get()) && blockstate.getValue(AmethystClusterBlock.FACING) == direction) {
                block = GeodeModBlocks.WRAPPIST_BLOCK.get();
            }

            if (block != null) {
                BlockState blockstate1 = block.defaultBlockState().setValue(AmethystClusterBlock.FACING, direction).setValue(AmethystClusterBlock.WATERLOGGED, Boolean.valueOf(blockstate.getFluidState().getType() == Fluids.WATER));
                serverLevel.setBlockAndUpdate(blockpos, blockstate1);
            }

        }
    }

    public static boolean canClusterGrowAtState(BlockState blockState) {
        return blockState.isAir() || blockState.is(Blocks.WATER) && blockState.getFluidState().getAmount() == 8;
    }
}