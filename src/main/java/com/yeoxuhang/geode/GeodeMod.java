package com.yeoxuhang.geode;

import com.yeoxuhang.geode.registry.GeodeModBlocks;
import com.yeoxuhang.geode.registry.GeodeModItems;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

@Mod(GeodeMod.MOD_ID)
public class GeodeMod
{
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
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocks.ENDERETHYST_CLUSTER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocks.LARGE_ENDERETHYST_BUD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocks.MEDIUM_ENDERETHYST_BUD.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GeodeModBlocks.SMALL_ENDERETHYST_BUD.get(), RenderType.cutout());
    }
}
