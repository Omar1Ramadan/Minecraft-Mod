package com.hon.horrormod.entity.client;

import com.hon.horrormod.HorrorMod;
import com.hon.horrormod.entity.custom.GusEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import javax.annotation.Nullable;

public class GusRenderer extends GeoEntityRenderer<GusEntity> {

    public GusRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new GusModel());
        this.shadowRadius = 1.0f;
    }

    @Override
    public ResourceLocation getTextureLocation(GusEntity instance) {
        return new ResourceLocation(HorrorMod.MOD_ID, "textures/entity/gus_texture.png");
    }

    @Override
    public RenderType getRenderType(GusEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer,
                                    @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8f, 0.8f, 0.8f);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
