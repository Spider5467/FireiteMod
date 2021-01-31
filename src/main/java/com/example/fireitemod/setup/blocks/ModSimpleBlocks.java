package com.example.fireitemod.setup.blocks;

import com.example.fireitemod.setup.ModBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

import java.util.ArrayList;

public class ModSimpleBlocks {
    public static final RegistryObject<Block> FIREITE_ORE = ModBlocks.register("fireite_ore", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(10f)
                    .harvestLevel(3)
                    .setLightLevel((light) -> 10)
                    .harvestTool(ToolType.PICKAXE)));

    public static final RegistryObject<Block> FIREITE_BLOCK = ModBlocks.register("fireite_block", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(10f)
                    .harvestLevel(4)
                    .setLightLevel((light) -> 15)
                    .harvestTool(ToolType.PICKAXE)));

    public static final ArrayList<RegistryObject<Block>> ALL_SIMPLE_BLOCKS = getAllSimpleBlocks();

    private static ArrayList<RegistryObject<Block>> getAllSimpleBlocks() {
        ArrayList<RegistryObject<Block>> all = new ArrayList<>();
        all.add(FIREITE_ORE);
        all.add(FIREITE_BLOCK);
        return all;
    }

    public ModSimpleBlocks() {

    }
}
