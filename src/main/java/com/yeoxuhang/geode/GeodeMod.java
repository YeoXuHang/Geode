package com.yeoxuhang.geode;

import com.yeoxuhang.geode.registry.GeodeModBlocks;
import com.yeoxuhang.geode.registry.GeodeModItems;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(GeodeMod.MOD_ID)
public class GeodeMod {
    public static final String MOD_ID = "geode";

    public GeodeMod() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        GeodeModItems.register(eventBus);
        GeodeModBlocks.register(eventBus);
        //Client setup
        eventBus.addListener(this::clientSetup);
        MinecraftForge.EVENT_BUS.register(this);
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
