package com.example.fireitemod.data;

import com.example.fireitemod.data.client.ModBlockStateProvider;
import com.example.fireitemod.data.client.ModItemModelProvider;
import com.example.fireitemod.data.loot.ModLootTables;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

import static com.example.fireitemod.ExampleMod.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenerators {
    private DataGenerators() {}

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();

        generator.addProvider(new ModBlockStateProvider(generator, event.getExistingFileHelper()));
        generator.addProvider(new ModItemModelProvider(generator, event.getExistingFileHelper()));
        generator.addProvider(new ModLootTables(generator));
    }
}
