package com.yeoxuhang.geode;

import com.yeoxuhang.geode.registry.*;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod(GeodeMod.MOD_ID)
public class GeodeMod {
    public static final String MOD_ID = "geode";

    public GeodeMod() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        GeodeModItems.register(eventBus);
        GeodeModBlocks.register(eventBus);
        /*GeodeModVillagers.register(eventBus);*/
        //Client setup
        eventBus.addListener(this::clientSetup);
        MinecraftForge.EVENT_BUS.register(this);
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, GeodeModClientConfigs.SPEC, "geode+_client_config.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, GeodeModCommonConfigs.SPEC, "geode+_common_config.toml");

    }


    private void clientSetup(final FMLClientSetupEvent event) {
        //wrappist Cluster
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocks.WRAPPIST_CLUSTER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocks.LARGE_WRAPPIST_BUD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocks.MEDIUM_WRAPPIST_BUD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocks.SMALL_WRAPPIST_BUD.get(), RenderType.cutout());
        //Quartz Crystal
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocks.QUARTZ_CRYSTAL.get(), RenderType.cutout());
    }
}
