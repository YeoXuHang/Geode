package com.yeoxuhang.geode.registry;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;
import java.util.function.Supplier;

public class GeodeModNetherGeodesGeneration {
    public static void generateNetherGeodeFeatures(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        ResourceKey<Biome> biomeKey = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        BiomeGenerationSettingsBuilder builder = event.getGeneration();

        if (doesBiomeMatch(event.getName(), Biomes.BASALT_DELTAS)){
            base.add(GeodeModPlacedFeatures.BASALT_QUARTZ_GEODE_PLACED);
        }
        if (doesBiomeMatch(event.getName(), Biomes.NETHER_WASTES)){
            base.add(GeodeModPlacedFeatures.QUARTZ_GEODE_PLACED);
        }
        if (doesBiomeMatch(event.getName(), Biomes.CRIMSON_FOREST)){
            base.add(GeodeModPlacedFeatures.QUARTZ_GEODE_PLACED);
        }
        if (doesBiomeMatch(event.getName(), Biomes.WARPED_FOREST)){
            base.add(GeodeModPlacedFeatures.QUARTZ_GEODE_PLACED);
        }
        if (doesBiomeMatch(event.getName(), Biomes.SOUL_SAND_VALLEY)){
            base.add(GeodeModPlacedFeatures.QUARTZ_GEODE_PLACED);
        }
        /**
        if (BiomeDictionary.hasType(biomeKey, BiomeDictionary.Type.NETHER)){
            base.add(GeodeModPlacedFeatures.QUARTZ_GEODE_PLACED);
        }**/
    }
    public static boolean doesBiomeMatch(ResourceLocation biomeNameIn, ResourceKey<Biome> biomeIn)
    {
        return biomeNameIn.getPath().matches(biomeIn.location().getPath());
    }
}
