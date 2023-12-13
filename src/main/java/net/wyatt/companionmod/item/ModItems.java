package net.wyatt.companionmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.wyatt.companionmod.CompanionMod;
import net.wyatt.companionmod.entity.ModEntities;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CompanionMod.MOD_ID);

    public static final RegistryObject<Item> SPEEDRUNNER = ITEMS.register("speedrunner",
            () -> new ForgeSpawnEggItem(ModEntities.SPEEDRUNNER, 0x7e9680, 0xc5d1c5, new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
