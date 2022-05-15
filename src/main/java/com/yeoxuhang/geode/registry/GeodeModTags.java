package com.yeoxuhang.geode.registry;

import com.yeoxuhang.geode.GeodeMod;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;


public class GeodeModTags {
    public static final TagKey<Biome> HAS_QUARTZ_GEODE
            = tag("has_quartz_geode");

    public static final TagKey<Biome> HAS_BASALT_QUARTZ_GEODE
            = tag("has_basalt_quartz_geode");

    public static final TagKey<Biome> HAS_WRAPPIST_GEODE
            = tag("has_wrappist_geode");
    private static TagKey<Biome> tag(String name)
    {
        return TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(GeodeMod.MOD_ID, name));
    }
}
