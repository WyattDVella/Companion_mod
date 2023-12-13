package net.wyatt.companionmod.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.wyatt.companionmod.CompanionMod;
import net.wyatt.companionmod.entity.client.ModModelLayers;
import net.wyatt.companionmod.entity.client.SteveModel;

@Mod.EventBusSubscriber(modid = CompanionMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.SPEEDRUNNER_LAYER, SteveModel::createBodyLayer);
    }
}
