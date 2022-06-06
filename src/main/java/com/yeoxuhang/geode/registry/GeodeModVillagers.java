package com.yeoxuhang.geode.registry;

import com.google.common.collect.ImmutableSet;
import com.yeoxuhang.geode.GeodeMod;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.InvocationTargetException;

public class GeodeModVillagers {
    /*public static final DeferredRegister<PoiType> POI_TYPES
            = DeferredRegister.create(ForgeRegistries.POI_TYPES, GeodeMod.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS
            = DeferredRegister.create(ForgeRegistries.PROFESSIONS, GeodeMod.MOD_ID);

    public static final RegistryObject<PoiType> GEODE_POI = POI_TYPES.register("geodepoi",
            () -> new PoiType("geodepoi", PoiType.getBlockStates(GeodeModBlocks.TABLE.get()), 1, 1));
    public static final RegistryObject<VillagerProfession> GEOLOGIST = VILLAGER_PROFESSIONS.register("geologist",
            () -> new VillagerProfession("geologist", GEODE_POI.get(),
                    ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_TOOLSMITH));

    public static void registerPOIs() {
        try {
            ObfuscationReflectionHelper.findMethod(PoiType.class,
                    "registerBlockStates", PoiType.class).invoke(null, GEODE_POI.get());
        } catch(InvocationTargetException | IllegalAccessException exception) {
            exception.printStackTrace();
        }
    }

    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }*/
}
