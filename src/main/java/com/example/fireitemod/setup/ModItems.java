package com.example.fireitemod.setup;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {


    public static final RegistryObject<Item> FIREITE_INGOT = Registration.ITEMS.register("fireite_ingot", () ->
            new Item(new Item.Properties().group(ModItemGroups.FIREITE_ITEMS).isImmuneToFire()));
    public static final RegistryObject<Item> FIREITE_HELMET = Registration.ITEMS.register("fireite_helmet", () ->
            new ArmorItem(ArmorMaterialList.fireite, EquipmentSlotType.HEAD, new ArmorItem.Properties().group(ModItemGroups.FIREITE_ITEMS).isImmuneToFire()));
    public static final RegistryObject<Item> FIREITE_CHESTPLATE = Registration.ITEMS.register("fireite_chestplate", () ->
            new ArmorItem(ArmorMaterialList.fireite, EquipmentSlotType.CHEST, new ArmorItem.Properties().group(ModItemGroups.FIREITE_ITEMS).isImmuneToFire()));
    public static final RegistryObject<Item> FIREITE_LEGGINGS = Registration.ITEMS.register("fireite_leggings", () ->
            new ArmorItem(ArmorMaterialList.fireite, EquipmentSlotType.LEGS, new ArmorItem.Properties().group(ModItemGroups.FIREITE_ITEMS).isImmuneToFire()));
    public static final RegistryObject<Item> FIREITE_BOOTS = Registration.ITEMS.register("fireite_boots", () ->
            new ArmorItem(ArmorMaterialList.fireite, EquipmentSlotType.FEET, new ArmorItem.Properties().group(ModItemGroups.FIREITE_ITEMS).isImmuneToFire()));
    public static final RegistryObject<Item> FIREITE_SWORD = Registration.ITEMS.register("fireite_sword", FireiteSwordModel::new);
    public static final RegistryObject<Item> FIREITE_PICKAXE = Registration.ITEMS.register("fireite_pickaxe", FireitePickaxeModel::new);
    public static final RegistryObject<Item> FIREITE_AXE = Registration.ITEMS.register("fireite_axe", FireiteAxeModel::new);
    public static final RegistryObject<Item> FIREITE_SHOVEL = Registration.ITEMS.register("fireite_shovel", FireiteShovelModel::new);
    public static void initialize() {
    }
}
