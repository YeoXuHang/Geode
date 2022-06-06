package com.yeoxuhang.geode.registry;

import net.minecraftforge.common.ForgeConfigSpec;

public class GeodeModCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_QUARTZ_GEODE_PER_CHUNK;

    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_QUARTZ_GEODE_MINIMAL_HEIGHT;

    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_QUARTZ_GEODE_MAXIMAL_HEIGHT;

    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_BASALT_QUARTZ_GEODE_PER_CHUNK;

    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_BASALT_QUARTZ_GEODE_MINIMAL_HEIGHT;

    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_BASALT_QUARTZ_GEODE_MAXIMAL_HEIGHT;

    public static final ForgeConfigSpec.ConfigValue<Integer> WRAPPIST_GEODE_PER_CHUNK;

    public static final ForgeConfigSpec.ConfigValue<Integer> WRAPPIST_GEODE_MINIMAL_HEIGHT;

    public static final ForgeConfigSpec.ConfigValue<Integer> WRAPPIST_GEODE_MAXIMAL_HEIGHT;

    static {
        BUILDER.comment("Geode+ Mod configuration settings");
        BUILDER.push("Configs for Geode+ Mod");


        BUILDER.comment("Configs for Geode Height");
        NETHER_QUARTZ_GEODE_MINIMAL_HEIGHT = BUILDER.comment("This control Nether Quartz Geode spawn minimal height!")
                .define("Nether Geodes Minimal Height", 6);
        NETHER_QUARTZ_GEODE_MAXIMAL_HEIGHT = BUILDER.comment("This control Nether Quartz Geode spawn maximal height!")
                .define("Nether Geodes Maximal Height", 30);
        NETHER_BASALT_QUARTZ_GEODE_MINIMAL_HEIGHT = BUILDER.comment("This control Nether Basalt Quartz Geode spawn minimal height!")
                .define("Nether Basalt Geodes Minimal Height", 6);
        NETHER_BASALT_QUARTZ_GEODE_MAXIMAL_HEIGHT = BUILDER.comment("This control Nether Basalt Quartz Geode spawn maximal height!")
                .define("Nether Basalt Geodes Maximal Height", 30);
        WRAPPIST_GEODE_MINIMAL_HEIGHT = BUILDER.comment("This control Wrappist Geode spawn minimal height!")
                .define("Wrappsit Geodes Minimal Height", 0);
        WRAPPIST_GEODE_MAXIMAL_HEIGHT = BUILDER.comment("This control Wrappist Geode spawn maximal height!")
                .define("Wrappist Geodes Maximal Height", 32);

        BUILDER.comment("Configs for Geode Per Chunk");
        NETHER_QUARTZ_GEODE_PER_CHUNK = BUILDER.comment("This control Nether Quartz Geode spawn per chunk!")
                .define("Nether Geodes Per Chunk", 16);
        NETHER_BASALT_QUARTZ_GEODE_PER_CHUNK = BUILDER.comment("This control Nether Basalt Quartz Geode spawn per chunk!")
                .define("Nether Basalt Geodes Per Chunk", 16);
        WRAPPIST_GEODE_PER_CHUNK = BUILDER.comment("This control Wrappist Geode spawn per chunk!")
                .define("Wrappist Geodes Per Chunk", 32);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
