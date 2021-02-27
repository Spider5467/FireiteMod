package com.example.fireitemod.setup;

import com.example.fireitemod.setup.blocks.ModSimpleBlocks;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.RegistryObject;

public class FireiteDragonEgg
{
    public static EntityType<?> FIREITE_DRAGON_EGG_ENTITY_TYPE;
    public static RegistryObject<Item> FIREITE_DRAGON_EGG = registerEntitySpawnEgg(FIREITE_DRAGON_EGG_ENTITY_TYPE, 0xff0000, 0xfc8c03);

    public static RegistryObject<Item> registerEntitySpawnEgg(EntityType<?> type, int color1, int color2)
    {
        SpawnEggItem item = new SpawnEggItem(type, color1, color2, new Item.Properties().group(ModItemGroups.FIREITE_ITEMS));
        return Registration.ITEMS.register("fireite_dragon_egg", () -> item);
    }

    public static void initialize() {

    }
}
