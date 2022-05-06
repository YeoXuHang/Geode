package com.yeoxuhang.geode.registry;

import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

public class GeodeModPlacedFeatures {
    public static final PlacedFeature ENDER_GEODE_PLACED = PlacementUtils.register("ender_geode_placed", GeodeModConfiguredFeatures.ENDER_GEODE.placed(RarityFilter.onAverageOnceEvery(24), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)), BiomeFilter.biome()));
}
