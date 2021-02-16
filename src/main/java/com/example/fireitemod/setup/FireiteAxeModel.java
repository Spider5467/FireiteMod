package com.example.fireitemod.setup;

import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.ToolType;

public class FireiteAxeModel extends AxeItem {


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
            return 100;
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
        public Ingredient getRepairMaterial() {
            return Ingredient.fromItems(ModItems.FIREITE_INGOT.get());
        }
    };

    public FireiteAxeModel() {
        super(Fireite1tier, Fireite1tier.getMaxUses(), 9, new Properties()
                .group(ModItemGroups.FIREITE_ITEMS)
                .maxStackSize(1).maxDamage(100)
                .addToolType(ToolType.AXE, Fireite1tier.getHarvestLevel())
                .isImmuneToFire()
                .rarity(Rarity.EPIC)
        );
    }
}
