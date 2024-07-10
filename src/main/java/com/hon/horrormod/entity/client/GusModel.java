package com.hon.horrormod.entity.client;

import com.hon.horrormod.HorrorMod;
import com.hon.horrormod.entity.custom.GusEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GusModel extends AnimatedGeoModel<GusEntity> {
    @Override
    public ResourceLocation getModelResource(GusEntity object) {
        return new ResourceLocation(HorrorMod.MOD_ID, "geo/gus.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GusEntity object) {
        return new ResourceLocation(HorrorMod.MOD_ID, "textures/entity/gus_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GusEntity animatable) {
        return new ResourceLocation(HorrorMod.MOD_ID, "animations/gus.animation.json");
    }
}
