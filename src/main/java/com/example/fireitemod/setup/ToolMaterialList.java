package com.example.fireitemod.setup;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum ToolMaterialList implements IItemTier
{
    ;

    private ToolMaterialList(float attackDamage, float efficiency, int durability, int harvestLevel)

    @Override
    public int getMaxUses() {
        return 1000;
    }

    @Override
    public float getEfficiency() {
        return 0;
    }

    @Override
    public float getAttackDamage() {
        return 1000;
    }

    @Override
    public int getHarvestLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 100;
    }

    @Override
    public Ingredient getRepairMaterial() {return Ingredient.fromItems(ModItems.FIREITE_INGOT.get())} { ;
    }
}
