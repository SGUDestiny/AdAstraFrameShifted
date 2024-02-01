package com.destiny.ad_astra_frame_shifted.client.render;

import com.destiny.ad_astra_frame_shifted.AdAstraFrameShifted;
import com.destiny.ad_astra_frame_shifted.server.item.TritiumTankItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;
import software.bernie.geckolib.renderer.layer.AutoGlowingGeoLayer;

public class TritiumTankItemRenderer extends GeoItemRenderer<TritiumTankItem> {
    public TritiumTankItemRenderer(){
        super(new DefaultedItemGeoModel<>(new ResourceLocation(AdAstraFrameShifted.MODID, "tritium_tank")));
        addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}
