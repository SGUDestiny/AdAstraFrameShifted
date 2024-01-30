package com.destiny.frameshifted.server;

import com.destiny.frameshifted.AdAstraFrameShifted;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class FSCreativeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> DEF_REG = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AdAstraFrameShifted.MODID);

    public static final RegistryObject<CreativeModeTab> FRAME_SHIFTED_TAB = DEF_REG.register("frame_shifted", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.frameshifted.creative_tab"))
            .icon(() -> new ItemStack(FSItemRegistry.LITHIUM_TANK.get()))
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .displayItems((enabledFeatures, output) -> {
                add(output, FSItemRegistry.LITHIUM_TANK.get());
            })
            .build());

    private static void add(CreativeModeTab.Output tab, ItemLike itemLike) {
        if(itemLike instanceof CustomTabBehaviour customTabBehaviour) {
            customTabBehaviour.fillItemCategory(tab);
        }else{
            tab.accept(itemLike);
        }
    }
}
