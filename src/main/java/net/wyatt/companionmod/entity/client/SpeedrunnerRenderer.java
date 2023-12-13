package net.wyatt.companionmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.wyatt.companionmod.CompanionMod;
import net.wyatt.companionmod.entity.custom.SpeedrunnerEntity;

public class SpeedrunnerRenderer extends MobRenderer<SpeedrunnerEntity, SteveModel<SpeedrunnerEntity>> {
    public SpeedrunnerRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new SteveModel<>(pContext.bakeLayer(ModModelLayers.SPEEDRUNNER_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(SpeedrunnerEntity pEntity) {
        return new ResourceLocation(CompanionMod.MOD_ID, "textures/entity/steve.png");
    }

    @Override
    public void render(SpeedrunnerEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
            MultiBufferSource pBuffer, int pPackedLight) {

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
