package net.tonyq.infusioncraft;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.tonyq.infusioncraft.item.ItemRegistry;

public class InfusionCraftTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, InfusionCraft.MODID);

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

    public static final RegistryObject<CreativeModeTab> INFUSIONCRAFT_TAB = CREATIVE_MODE_TABS.register("infusioncraft_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ItemRegistry.INFUSION_CORE_TIER_3.get()))
                    .title(Component.translatable("creativetab.infusioncraft_tab"))
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(ItemRegistry.INFUSION_CORE_TIER_1.get());
                        pOutput.accept(ItemRegistry.INFUSION_CORE_TIER_2.get());
                        pOutput.accept(ItemRegistry.INFUSION_CORE_TIER_3.get());
                    }))
                    .build());
}
