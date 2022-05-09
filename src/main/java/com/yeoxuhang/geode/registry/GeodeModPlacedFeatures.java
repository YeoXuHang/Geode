package com.yeoxuhang.geode.registry;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

public class GeodeModPlacedFeatures {

    /**public static final PlacedFeature ENDER_GEODE_PLACED = PlacementUtils.register("ender_geode_placed", GeodeModConfiguredFeatures.ENDER_GEODE.placed(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)), BiomeFilter.biome()));
    **/
    public static final Holder<PlacedFeature> QUARTZ_GEODE_PLACED = PlacementUtils.register("quartz_geode_placed", GeodeModConfiguredFeatures.QUARTZ_GEODE, RarityFilter.onAverageOnceEvery(24), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)), BiomeFilter.biome());

    public static final Holder<PlacedFeature> BASALT_QUARTZ_GEODE_PLACED = PlacementUtils.register("basalt_quartz_geode_placed", GeodeModConfiguredFeatures.BASALT_QUARTZ_GEODE, RarityFilter.onAverageOnceEvery(24), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)), BiomeFilter.biome());
}
