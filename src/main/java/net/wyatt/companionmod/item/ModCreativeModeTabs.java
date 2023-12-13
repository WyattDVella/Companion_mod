package net.wyatt.companionmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.wyatt.companionmod.CompanionMod;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CompanionMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> COMPANION_TAB = CREATIVE_MODE_TABS.register("companion_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SPEEDRUNNER.get()))
                    .title(Component.translatable("creativetab.companion_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SPEEDRUNNER.get() );
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
