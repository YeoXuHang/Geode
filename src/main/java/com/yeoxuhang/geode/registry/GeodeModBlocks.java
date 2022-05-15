package com.yeoxuhang.geode.registry;

import com.yeoxuhang.geode.GeodeMod;
import com.yeoxuhang.geode.block.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class GeodeModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, GeodeMod.MOD_ID);

    public static final RegistryObject<Block> SMOOTH_END_STONE = registerBlock("smooth_end_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.5f).sound(SoundType.BASALT)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> GALCITE = registerBlock("galcite",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.5f).sound(SoundType.CALCITE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WRAPPIST_BLOCK = registerBlock("wrappist_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.5f).sound(SoundType.BASALT)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> BUDDING_WRAPPIST = registerBlock("budding_wrappist",
            () -> new BuddingWrappistBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WRAPPIST_CLUSTER = registerBlock("wrappist_cluster",
            () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel( (p_60929_) ->{
                return 8;
            } )), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> LARGE_WRAPPIST_BUD = registerBlock("large_wrappist_bud",
            () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_60929_) -> {
        return 6;
    })), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MEDIUM_WRAPPIST_BUD = registerBlock("medium_wrappist_bud",
            () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((p_60929_) -> {
        return 3;
    })), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SMALL_WRAPPIST_BUD = registerBlock("small_wrappist_bud",
            () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((p_60929_) -> {
        return 2;
    })), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> BUDDING_NETHER_QUARTZ = registerBlock("budding_nether_quartz",
            () -> new BuddingNetherQuartzBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(1.5F).sound(SoundType.NETHER_ORE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> BUDDING_BASALT_QUARTZ = registerBlock("budding_basalt_quartz",
            () -> new BuddingNetherQuartzBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(1.5F).sound(SoundType.BASALT).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> QUARTZ_CRYSTAL = registerBlock("quartz_crystal",
            () -> new QuartzCrystalBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel( (p_60929_) ->{
                return 8;
            } )), CreativeModeTab.TAB_BUILDING_BLOCKS);

    /**public static final RegistryObject<Block> PRISMARINE_CRYSTAL = registerBlock("prismarine_crystal",
            () -> new PrismarineCrystalBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel( (p_60929_) ->{
                return 8;
            } )), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> BUDDING_PRISMARINE = registerBlock("budding_prismarine",
            () -> new BuddingPrismarineBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(1.5F).sound(SoundType.BASALT).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);**/
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return GeodeModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
