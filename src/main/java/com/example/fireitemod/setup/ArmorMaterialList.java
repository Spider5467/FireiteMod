package com.example.fireitemod.setup;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

import java.util.function.Supplier;

import static com.example.fireitemod.ExampleMod.MOD_ID;

public enum ArmorMaterialList implements IArmorMaterial
{
    fireite("fireite", 400, new int[] {10, 11, 17, 8}, 25, "entity.blaze.shoot", 5.0f, 10, ModItems.FIREITE_INGOT.get());

    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final String equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Item repairMaterial;

    ArmorMaterialList(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, String equipSound, float toughness, float knockbackResistance, Item repairMaterial) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getDurability(EquipmentSlotType slot) {
        return MAX_DAMAGE_ARRAY[slot.getIndex()] + this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slot) {
        return this.damageReductionAmountArray[slot.getIndex()];
    }

    @Override
    public int getEnchantability() {
     return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return new SoundEvent(new ResourceLocation(this.equipSound));
    }

    @Override
    public Ingredient getRepairMaterial() {
        return Ingredient.fromItems(this.repairMaterial);
    }

    @Override
    public String getName() {
        return MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
