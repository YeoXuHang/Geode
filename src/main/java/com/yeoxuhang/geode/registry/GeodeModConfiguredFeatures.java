package com.yeoxuhang.geode.registry;

import net.minecraft.core.Holder;
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
      public static final Holder<ConfiguredFeature<GeodeConfiguration, ?>> WRAPPIST_GEODE =
              FeatureUtils.register("wrappist_geode", Feature.GEODE,
                      new GeodeConfiguration(
                              new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                                      BlockStateProvider.simple(GeodeModBlocks.WRAPPIST_BLOCK.get()),
                                      BlockStateProvider.simple(GeodeModBlocks.BUDDING_WRAPPIST.get()),
                                      BlockStateProvider.simple(GeodeModBlocks.GALCITE.get()),
                                      BlockStateProvider.simple(GeodeModBlocks.SMOOTH_ENDSTONE.get()),
                                      List.of(GeodeModBlocks.SMALL_WRAPPIST_BUD.get().defaultBlockState(),
                                              GeodeModBlocks.MEDIUM_WRAPPIST_BUD.get().defaultBlockState(),
                                              GeodeModBlocks.LARGE_WRAPPIST_BUD.get().defaultBlockState(),
                                              GeodeModBlocks.WRAPPIST_CLUSTER.get().defaultBlockState()),
                                      BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                              new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                              new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));;

      public static final Holder<ConfiguredFeature<GeodeConfiguration, ?>> QUARTZ_GEODE =
              FeatureUtils.register("quartz_geode", Feature.GEODE ,
                      new GeodeConfiguration(
                              new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                                      BlockStateProvider.simple(Blocks.NETHERRACK),
                                      BlockStateProvider.simple(GeodeModBlocks.BUDDING_NETHER_QUARTZ.get()),
                                      BlockStateProvider.simple(Blocks.NETHERRACK),
                                      BlockStateProvider.simple(Blocks.NETHERRACK),
                                      List.of(GeodeModBlocks.QUARTZ_CRYSTAL.get().defaultBlockState(),
                                              GeodeModBlocks.QUARTZ_CRYSTAL.get().defaultBlockState(),
                                              GeodeModBlocks.QUARTZ_CRYSTAL.get().defaultBlockState(),
                                              GeodeModBlocks.QUARTZ_CRYSTAL.get().defaultBlockState()),
                                      BlockTags.FEATURES_CANNOT_REPLACE ,
                                      BlockTags.GEODE_INVALID_BLOCKS) ,
                              new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                              new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));

      public static final Holder<ConfiguredFeature<GeodeConfiguration, ?>> BASALT_QUARTZ_GEODE =
              FeatureUtils.register("basalt_quartz_geode",
                      Feature.GEODE , new GeodeConfiguration(
                              new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                                      BlockStateProvider.simple(Blocks.NETHERRACK),
                                      BlockStateProvider.simple(GeodeModBlocks.BUDDING_BASALT_QUARTZ.get()),
                                      BlockStateProvider.simple(Blocks.NETHERRACK),
                                      BlockStateProvider.simple(Blocks.NETHERRACK),
                                      List.of(GeodeModBlocks.QUARTZ_CRYSTAL.get().defaultBlockState(),
                                              GeodeModBlocks.QUARTZ_CRYSTAL.get().defaultBlockState(),
                                              GeodeModBlocks.QUARTZ_CRYSTAL.get().defaultBlockState(),
                                              GeodeModBlocks.QUARTZ_CRYSTAL.get().defaultBlockState()),
                                      BlockTags.FEATURES_CANNOT_REPLACE ,
                                      BlockTags.GEODE_INVALID_BLOCKS) ,
                              new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                              new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));

      /**public static final Holder<ConfiguredFeature<GeodeConfiguration, ?>> PRISMARINE_GEODE =
              FeatureUtils.register("prismarine_geode",
                      Feature.GEODE , new GeodeConfiguration(
                              new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                                      BlockStateProvider.simple(Blocks.PRISMARINE),
                                      BlockStateProvider.simple(GeodeModBlocks.BUDDING_PRISMARINE.get()),
                                      BlockStateProvider.simple(Blocks.PRISMARINE),
                                      BlockStateProvider.simple(Blocks.PRISMARINE),
                                      List.of(GeodeModBlocks.PRISMARINE_CRYSTAL.get().defaultBlockState(),
                                              GeodeModBlocks.PRISMARINE_CRYSTAL.get().defaultBlockState(),
                                              GeodeModBlocks.PRISMARINE_CRYSTAL.get().defaultBlockState(),
                                              GeodeModBlocks.PRISMARINE_CRYSTAL.get().defaultBlockState()),
                                      BlockTags.FEATURES_CANNOT_REPLACE ,
                                      BlockTags.GEODE_INVALID_BLOCKS) ,
                              new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                              new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1));
**/
}
