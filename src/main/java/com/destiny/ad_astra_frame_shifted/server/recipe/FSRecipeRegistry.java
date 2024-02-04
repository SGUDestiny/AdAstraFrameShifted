package com.destiny.ad_astra_frame_shifted.server.recipe;

import com.destiny.ad_astra_frame_shifted.AdAstraFrameShifted;
import com.github.alexmodguy.alexscaves.server.recipe.RecipeCaveMap;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FSRecipeRegistry {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, AdAstraFrameShifted.MODID);

    public static final RegistryObject<RecipeSerializer<NuclearRecipe>> NUCLEAR =
            SERIALIZERS.register("nuclear", () -> new SimpleCookingSerializer<>(NuclearRecipe::new, 500));

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
