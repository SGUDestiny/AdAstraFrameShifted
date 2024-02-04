package com.destiny.ad_astra_frame_shifted.mixins;

import com.destiny.ad_astra_frame_shifted.server.recipe.FSRecipeSerializers;
import com.destiny.ad_astra_frame_shifted.server.recipe.NuclearRecipe;
import com.github.alexmodguy.alexscaves.AlexsCaves;
import com.github.alexmodguy.alexscaves.server.block.blockentity.NuclearFurnaceBlockEntity;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.RecipeType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(NuclearFurnaceBlockEntity.class)
public class NuclearFurnaceMixin {

    /**
     * @author mistersecret312
     * @reason need nuclear type
     */
    @Overwrite
    public static RecipeType<? extends AbstractCookingRecipe> getRecipeType() {
        return FSRecipeSerializers.NUCLEAR.get();
    }

}
