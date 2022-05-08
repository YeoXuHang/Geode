package com.yeoxuhang.geode.registry;

import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

import java.util.List;

public class GeodeModConfiguredFeatures {
      /**public static final ConfiguredFeature<GeodeConfiguration, ?> ENDER_GEODE =
              FeatureUtils.register("ender_geode", Feature.GEODE.configured(new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR), BlockStateProvider.simple(GeodeModBlocks.ENDERETHYST_BLOCK.get()), BlockStateProvider.simple(GeodeModBlocks.BUDDING_ENDERETHYST.get()), BlockStateProvider.simple(GeodeModBlocks.GALCITE.get()), BlockStateProvider.simple(GeodeModBlocks.SMOOTH_END_STONE.get()), List.of(GeodeModBlocks.SMALL_ENDERETHYST_BUD.get().defaultBlockState(), GeodeModBlocks.MEDIUM_ENDERETHYST_BUD.get().defaultBlockState(), GeodeModBlocks.LARGE_ENDERETHYST_BUD.get().defaultBlockState(), GeodeModBlocks.ENDERETHYST_CLUSTER.get().defaultBlockState()), BlockTags.FEATURES_CANNOT_REPLACE.getName(), BlockTags.GEODE_INVALID_BLOCKS.getName()), new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1)));;
      **/
      public static final ConfiguredFeature<GeodeConfiguration, ?> QUARTZ_GEODE =
              FeatureUtils.register("quartz_geode", Feature.GEODE.configured(new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR), BlockStateProvider.simple(Blocks.NETHERRACK), BlockStateProvider.simple(GeodeModBlocks.BUDDING_NETHER_QUARTZ.get()), BlockStateProvider.simple(Blocks.NETHERRACK), BlockStateProvider.simple(Blocks.NETHERRACK), List.of(GeodeModBlocks.QUARTZ_CRYSTAL.get().defaultBlockState(), GeodeModBlocks.QUARTZ_CRYSTAL.get().defaultBlockState(), GeodeModBlocks.QUARTZ_CRYSTAL.get().defaultBlockState(), GeodeModBlocks.QUARTZ_CRYSTAL.get().defaultBlockState()), BlockTags.FEATURES_CANNOT_REPLACE.getName(), BlockTags.GEODE_INVALID_BLOCKS.getName()), new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1)));;

}
