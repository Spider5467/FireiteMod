package com.example.fireitemod.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {


    public static final RegistryObject<Item> FIREITE_INGOT = Registration.ITEMS.register("fireite_ingot", () ->
            new Item(new Item.Properties().group(ModItemGroups.FIREITE_ITEMS)));

    public static void initialize() {
    }
}
