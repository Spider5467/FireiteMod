package com.example.fireitemod.setup;

import com.example.fireitemod.setup.blocks.ModSimpleBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static <T extends Block> RegistryObject<T> register(String name, Supplier<T> sup) {
        RegistryObject<T> block = Registration.BLOCKS.register(name, sup);
        Registration.ITEMS.register(name,
                () -> new BlockItem(block.get(), new Item.Properties().group(ModItemGroups.FIREITE_ITEMS)));
        return block;
    }

    public static void initialize() {
        new ModSimpleBlocks();
    }
}
