package net.wyatt.companionmod.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.wyatt.companionmod.CompanionMod;
import net.wyatt.companionmod.entity.ModEntities;
import net.wyatt.companionmod.entity.client.ModModelLayers;
import net.wyatt.companionmod.entity.client.SteveModel;
import net.wyatt.companionmod.entity.custom.SpeedrunnerEntity;

@Mod.EventBusSubscriber(modid = CompanionMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.SPEEDRUNNER.get(), SpeedrunnerEntity.createAttributes().build());
    }
}
