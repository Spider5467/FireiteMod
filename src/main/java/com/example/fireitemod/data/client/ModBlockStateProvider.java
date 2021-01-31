package com.example.fireitemod.data.client;

import com.example.fireitemod.setup.blocks.ModSimpleBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.example.fireitemod.ExampleMod.MOD_ID;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        ModSimpleBlocks.ALL_SIMPLE_BLOCKS.forEach(sb -> simpleBlock(sb.get()));
    }
}
