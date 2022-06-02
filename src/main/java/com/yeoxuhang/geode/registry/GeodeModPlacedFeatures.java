package com.yeoxuhang.geode.registry;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

public class GeodeModPlacedFeatures {

    public static final Holder<PlacedFeature> WRAPPIST_GEODE_PLACED = PlacementUtils.register("wrappist_geode_placed", GeodeModConfiguredFeatures.WRAPPIST_GEODE, RarityFilter.onAverageOnceEvery(GeodeModCommonConfigs.WRAPPIST_GEODE_PER_CHUNK.get()), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(GeodeModCommonConfigs.WRAPPIST_GEODE_MINIMAL_HEIGHT.get()), VerticalAnchor.absolute(GeodeModCommonConfigs.WRAPPIST_GEODE_MAXIMAL_HEIGHT.get())), BiomeFilter.biome());

    public static final Holder<PlacedFeature> QUARTZ_GEODE_PLACED = PlacementUtils.register("quartz_geode_placed", GeodeModConfiguredFeatures.QUARTZ_GEODE, RarityFilter.onAverageOnceEvery(GeodeModCommonConfigs.NETHER_QUARTZ_GEODE_PER_CHUNK.get()), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(GeodeModCommonConfigs.NETHER_QUARTZ_GEODE_MINIMAL_HEIGHT.get()), VerticalAnchor.absolute(GeodeModCommonConfigs.NETHER_QUARTZ_GEODE_MAXIMAL_HEIGHT.get())), BiomeFilter.biome());

    public static final Holder<PlacedFeature> BASALT_QUARTZ_GEODE_PLACED = PlacementUtils.register("basalt_quartz_geode_placed", GeodeModConfiguredFeatures.BASALT_QUARTZ_GEODE, RarityFilter.onAverageOnceEvery(GeodeModCommonConfigs.NETHER_BASALT_QUARTZ_GEODE_PER_CHUNK.get()), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(GeodeModCommonConfigs.NETHER_BASALT_QUARTZ_GEODE_MINIMAL_HEIGHT.get()), VerticalAnchor.absolute(GeodeModCommonConfigs.NETHER_BASALT_QUARTZ_GEODE_MAXIMAL_HEIGHT.get())), BiomeFilter.biome());

    /**public static final Holder<PlacedFeature> PRISMARINE_GEODE_PLACED = PlacementUtils.register("prismarine_geode_placed", GeodeModConfiguredFeatures.PRISMARINE_GEODE, RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(32), VerticalAnchor.absolute(64)), BiomeFilter.biome());
    **/
}
