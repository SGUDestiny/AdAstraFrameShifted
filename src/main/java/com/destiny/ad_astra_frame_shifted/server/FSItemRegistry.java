package com.destiny.ad_astra_frame_shifted.server;

import com.destiny.ad_astra_frame_shifted.AdAstraFrameShifted;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FSItemRegistry {
    public static final DeferredRegister<Item> DEF_REG = DeferredRegister.create(ForgeRegistries.ITEMS, AdAstraFrameShifted.MODID);
    public static final RegistryObject<Item> LITHIUM_TANK = DEF_REG.register("lithium_tank", () -> new Item(new Item.Properties()));
}
