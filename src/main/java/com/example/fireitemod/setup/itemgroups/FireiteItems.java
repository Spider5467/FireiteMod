package com.example.fireitemod.setup.itemgroups;

import com.example.fireitemod.ExampleMod;
import com.example.fireitemod.setup.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class FireiteItems extends ItemGroup {

    public FireiteItems() {
        super(ExampleMod.MOD_ID + ".fireite_items");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModItems.FIREITE_INGOT.get());
    }
}
