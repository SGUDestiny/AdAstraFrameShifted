package com.destiny.ad_astra_frame_shifted.server.item;

import com.destiny.ad_astra_frame_shifted.client.render.TritiumTankItemRenderer;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;

import java.util.function.Consumer;

public class TritiumTankItem extends Item implements GeoItem {
    public TritiumTankItem(Properties properties){
        super(properties);
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            private TritiumTankItemRenderer renderer;

            @Override
            public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                if (this.renderer == null)
                    this.renderer = new TritiumTankItemRenderer();

                return this.renderer;
            }
        });
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return null;
    }
}
