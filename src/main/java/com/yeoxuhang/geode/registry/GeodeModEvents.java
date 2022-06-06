package com.yeoxuhang.geode.registry;

import com.yeoxuhang.geode.GeodeMod;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = GeodeMod.MOD_ID)
public class GeodeModEvents {
    /*@SubscribeEvent
    public static void addGeodeTrades(VillagerTradesEvent event) {

        if(event.getType() == GeodeModVillagers.GEOLOGIST.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(GeodeModItems.WRAPPIST_SHARD.get(), 1);
            ItemStack stack1 = new ItemStack(Items.AMETHYST_SHARD, 1);

            int villagerLevel1 = 1;

            trades.get(villagerLevel1).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 3),
                    stack,4,5,0.09F));
            trades.get(villagerLevel1).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    stack1,4,5,0.09F));
        }
    }*/
}
