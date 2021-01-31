package com.example.fireitemod.world;

import com.example.fireitemod.setup.blocks.ModSimpleBlocks;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.example.fireitemod.ExampleMod.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID)
public class ModWorldFeatures {

    private static final ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

    @SubscribeEvent
    public static void addFeaturesToBiomes(BiomeLoadingEvent biome) {
        ForgeConfigSpec.IntValue rock_per_chunk = builder.comment("Veins of rock per chunk")
                .defineInRange("rock.count", 8, 0, 1000);
        builder.build();
        ConfiguredFeature<?, ?> ROCK_BLOCK = Feature.ORE
                .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                        ModSimpleBlocks.FIREITE_ORE.get().getDefaultState(), 8))
                .withPlacement(Placement.RANGE.configure(topSolidRange(1, 16))
                        .square()
                        .func_242731_b(rock_per_chunk.get()));

        biome.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ROCK_BLOCK);
    }

    private static TopSolidRangeConfig topSolidRange(int bottom, int top) {
        return new TopSolidRangeConfig(bottom, 0, top - bottom);
    }

}
