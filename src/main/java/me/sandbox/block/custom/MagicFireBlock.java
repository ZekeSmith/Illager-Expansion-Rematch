package me.sandbox.block.custom;

import me.sandbox.block.BlockRegistry;
import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.IllagerEntity;
import net.minecraft.entity.mob.RavagerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.*;

import java.util.Random;

public class MagicFireBlock extends AbstractFireBlock {
    public static final IntProperty AGE = Properties.AGE_15;
    public MagicFireBlock(Settings settings, float damage) {
        super(settings.nonOpaque(), 0.0f);
    }


    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
            if (!(entity instanceof IllagerEntity || entity instanceof RavagerEntity) ) {
                entity.damage(DamageSource.MAGIC, 3.0f);
            } else {
                return;
            }
            if (entity.getFireTicks() == 0) {
                entity.setFireTicks(0);
            }
        super.onEntityCollision(state, world, pos, entity);
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        world.removeBlock(pos, false);
        world.createAndScheduleBlockTick(pos, this, 180);
    }

    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        super.onBlockAdded(state, world, pos, oldState, notify);
        world.createAndScheduleBlockTick(pos, this, 180);
    }
    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (this.canPlaceAt(state, world, pos)) {
            return this.getDefaultState();
        }
        return Blocks.AIR.getDefaultState();
    }
    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockPos = pos.down();
        return world.getBlockState(blockPos).isSideSolidFullSquare(world, blockPos, Direction.UP);
    }

    @Override
    protected boolean isFlammable(BlockState state) {
        return true;
    }
}

