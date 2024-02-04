package com.destiny.ad_astra_frame_shifted.server.recipe;

import com.destiny.ad_astra_frame_shifted.AdAstraFrameShifted;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import org.jetbrains.annotations.NotNull;

public class NuclearRecipe extends AbstractCookingRecipe implements SimpleCookingSerializer.CookieBaker<NuclearRecipe>{

    public NuclearRecipe(ResourceLocation pId, String pGroup, CookingBookCategory pCategory, Ingredient pIngredient, ItemStack pResult, float pExperience, int pCookingTime) {
        super(RecipeType.simple(new ResourceLocation(AdAstraFrameShifted.MODID, "nuclear")), pId, pGroup, pCategory, pIngredient, pResult, pExperience, pCookingTime);
    }

    @Override
    public @NotNull RecipeSerializer<NuclearRecipe> getSerializer() {
        return FSRecipeRegistry.NUCLEAR.get();
    }

    @Override
    public RecipeType<?> getType() {
        return super.getType();
    }

    @Override
    public NuclearRecipe create(ResourceLocation resource, String name, CookingBookCategory cook, Ingredient ingred, ItemStack stack, float f1, int i1) {
        return new NuclearRecipe(resource, name, cook, ingred, stack, f1, i1);
    }
}
