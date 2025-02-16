package org.hiedacamellia.mystiasizakaya.content.common.block.entities;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.state.BlockState;
import org.hiedacamellia.mystiasizakaya.registries.MIBlockEntitiy;
import org.jetbrains.annotations.NotNull;

public class BoilingPot extends KitchenwaresEntity{
    public BoilingPot(BlockPos position, BlockState state) {
        super(MIBlockEntitiy.BOILING_POT.get(), position, state);
    }

    @Override
    public @NotNull Component getDefaultName() {
        return Component.literal("boiling_pot");
    }

    @Override
    public @NotNull Component getDisplayName() {
        return Component.literal("boiling_pot");
    }

}
