package com.example.fireitemod.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {


    public static final RegistryObject<Item> FIREITE_INGOT = Registration.ITEMS.register("fireite_ingot", () ->
            new Item(new Item.Properties().group(ModItemGroups.FIREITE_ITEMS)));
    public static final RegistryObject<Item> FIREITE_HELMET = Registration.ITEMS.register("fireite_helmet", () ->
            new Item(new Item.Properties().group(ModItemGroups.FIREITE_ITEMS)));
    public static final RegistryObject<Item> FIREITE_CHESTPLATE = Registration.ITEMS.register("fireite_chestplate", () ->
            new Item(new Item.Properties().group(ModItemGroups.FIREITE_ITEMS)));
    public static final RegistryObject<Item> FIREITE_LEGGINGS = Registration.ITEMS.register("fireite_leggings", () ->
            new Item(new Item.Properties().group(ModItemGroups.FIREITE_ITEMS)));
    public static final RegistryObject<Item> FIREITE_BOOTS = Registration.ITEMS.register("fireite_boots", () ->
            new Item(new Item.Properties().group(ModItemGroups.FIREITE_ITEMS)));

    public static void initialize() {
    }
}
