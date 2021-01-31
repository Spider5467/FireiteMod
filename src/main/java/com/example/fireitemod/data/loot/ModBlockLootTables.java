package com.example.fireitemod.data.loot;

import com.example.fireitemod.setup.blocks.ModSimpleBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraftforge.fml.RegistryObject;

import java.util.stream.Collectors;

public class ModBlockLootTables extends BlockLootTables {

    @Override
    protected void addTables() {
        ModSimpleBlocks.ALL_SIMPLE_BLOCKS.forEach(sb -> registerDropSelfLootTable(sb.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModSimpleBlocks.ALL_SIMPLE_BLOCKS.stream()
                .map(RegistryObject::get)
                .collect(Collectors.toSet());
    }
}
