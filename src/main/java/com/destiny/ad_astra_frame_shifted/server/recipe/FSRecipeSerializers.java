package com.destiny.ad_astra_frame_shifted.server.recipe;

import com.destiny.ad_astra_frame_shifted.AdAstraFrameShifted;
import com.github.alexmodguy.alexscaves.server.recipe.RecipeCaveMap;
import com.teamresourceful.resourcefullib.common.recipe.CodecRecipeSerializer;
import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import earth.terrarium.adastra.common.recipes.SpaceStationRecipe;
import earth.terrarium.adastra.common.recipes.machines.*;
import earth.terrarium.adastra.common.registry.ModRecipeTypes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class FSRecipeSerializers {


    public static final ResourcefulRegistry<RecipeType<?>> RECIPE_TYPES;
    public static final RegistryEntry<RecipeType<NuclearRecipe>> NUCLEAR;

    public FSRecipeSerializers() {
    }

    private static <T extends Recipe<?>> RegistryEntry<RecipeType<T>> register(String id) {
        return RECIPE_TYPES.register(id, () -> new RecipeType<T>() {
            public String toString() {
                return id;
            }
        });
    }

    static {
        RECIPE_TYPES = ResourcefulRegistries.create(BuiltInRegistries.RECIPE_TYPE, AdAstraFrameShifted.MODID);
        NUCLEAR = register("nuclear");
    }

}


