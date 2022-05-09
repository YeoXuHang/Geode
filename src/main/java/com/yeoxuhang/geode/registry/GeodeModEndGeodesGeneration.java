package com.yeoxuhang.geode.registry;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;
import java.util.function.Supplier;

public class GeodeModEndGeodesGeneration {
    public static void generateEndGeodeFeatures(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        ResourceKey<Biome> biomeKey = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        BiomeGenerationSettingsBuilder builder = event.getGeneration();
        /**if (doesBiomeMatch(event.getName(), Biomes.END_HIGHLANDS)){
            base.add(() -> GeodeModPlacedFeatures.ENDER_GEODE_PLACED);
        }
        if (doesBiomeMatch(event.getName(), Biomes.END_MIDLANDS)){
            base.add(() -> GeodeModPlacedFeatures.ENDER_GEODE_PLACED);
        }**/
        /**if (BiomeDictionary.hasType(biomeKey, BiomeDictionary.Type.END)){
            base.add(() -> GeodeModPlacedFeatures.ENDER_GEODE_PLACED);
        }**/
    }
    public static boolean doesBiomeMatch(ResourceLocation biomeNameIn, ResourceKey<Biome> biomeIn)
    {
        return biomeNameIn.getPath().matches(biomeIn.location().getPath());
    }
}
