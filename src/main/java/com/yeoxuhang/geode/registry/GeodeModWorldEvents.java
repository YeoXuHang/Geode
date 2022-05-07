package com.yeoxuhang.geode.registry;

import com.yeoxuhang.geode.GeodeMod;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GeodeMod.MOD_ID)
public class GeodeModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        GeodeModEndGeodesGeneration.generateEndGeodeFeatures(event);
        GeodeModNetherGeodesGeneration.generateNetherGeodeFeatures(event);
    }
}
