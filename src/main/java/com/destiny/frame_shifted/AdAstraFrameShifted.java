package com.destiny.frame_shifted;

import com.destiny.frame_shifted.server.FSCreativeTabRegistry;
import com.destiny.frame_shifted.server.FSItemRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
@Mod(com.destiny.frame_shifted.AdAstraFrameShifted.MODID)
public class AdAstraFrameShifted
{
    public static final String MODID = "ad_astra_frame_shifted";

    public AdAstraFrameShifted()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);
        FSItemRegistry.DEF_REG.register(modEventBus);
        FSCreativeTabRegistry.DEF_REG.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {}
}
