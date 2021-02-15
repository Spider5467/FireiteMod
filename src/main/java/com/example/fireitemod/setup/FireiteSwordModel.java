package com.example.fireitemod.setup;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Rarity;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.ToolType;

public class FireiteSwordModel extends SwordItem {

    public static IItemTier Fireite1tier = new IItemTier() {


        @Override
        public int getMaxUses() {
            return 1000;
        }

        @Override
        public float getEfficiency() {
            return 100;
        }

        @Override
        public float getAttackDamage() {
            return 1000;
        }

        @Override
        public int getHarvestLevel() {
            return 0;
        }

        @Override
        public int getEnchantability() {
            return 25;
        }

        @Override
        public Ingredient getRepairMaterial() {return Ingredient.fromItems(ModItems.FIREITE_INGOT.get()); }
    };

    public FireiteSwordModel() {
        super(Fireite1tier, Fireite1tier.getMaxUses(), 9, new Properties()
                .group(ModItemGroups.FIREITE_ITEMS)
                .maxStackSize(1).maxDamage(1000)
                .isImmuneToFire()
                .rarity(Rarity.EPIC)
        );
    }
}
