package com.example.fireitemod.setup;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Rarity;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.ToolType;

public class FireiteShovelModel extends ShovelItem {


    public static IItemTier Fireite2tier = new IItemTier() {
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
            return 100;
        }

        @Override
        public int getEnchantability() {
            return 25;
        }

        @Override
        public Ingredient getRepairMaterial() {return Ingredient.fromItems(ModItems.FIREITE_INGOT.get());
        }
    };

    public FireiteShovelModel() {
        super(Fireite2tier, Fireite2tier.getMaxUses(), 10, new Properties()
                .group(ModItemGroups.FIREITE_ITEMS)
                .maxStackSize(1)
                .addToolType(ToolType.SHOVEL, Fireite2tier.getHarvestLevel())
                .isImmuneToFire()
                .rarity(Rarity.EPIC)
        );
    }
}
