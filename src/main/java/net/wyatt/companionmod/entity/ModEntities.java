package net.wyatt.companionmod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.wyatt.companionmod.CompanionMod;
import net.wyatt.companionmod.entity.custom.SpeedrunnerEntity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CompanionMod.MOD_ID);

    public static final RegistryObject<EntityType<SpeedrunnerEntity>> SPEEDRUNNER =
            ENTITY_TYPES.register("speedrunner", () -> EntityType.Builder.of(SpeedrunnerEntity::new, MobCategory.MISC)
                    .sized(0.6f, 1.8f).build("speedrunner"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
