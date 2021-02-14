package com.example.fireitemod.setup;

import net.minecraft.item.IItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Rarity;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IItemProvider;
import net.minecraftforge.common.ToolType;

public class FireitePickaxeModel extends PickaxeItem {


    public static IItemTier FireiteTier = new IItemTier() {

        @Override
        public int getMaxUses() {
            return 1661;
        }

        @Override
        public float getEfficiency() {
            return 1000;
        }

        @Override
        public float getAttackDamage() {
            return 10;
        }

        @Override
        public int getHarvestLevel() {
            return 1000;
        }

        @Override
        public int getEnchantability() {
            return 10;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromItems(ModItems.FIREITE_INGOT.get());
        }
    };

    public FireitePickaxeModel() {
        super(FireiteTier, FireiteTier.getMaxUses(), 0, new Properties()
                .group(ModItemGroups.FIREITE_ITEMS).maxStackSize(1).addToolType(ToolType.PICKAXE, FireiteTier.getHarvestLevel()).isImmuneToFire().rarity(Rarity.EPIC)
        );
    }
}
