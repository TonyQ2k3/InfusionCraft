package net.tonyq.infusioncraft.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.tonyq.infusioncraft.InfusionCraft;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, InfusionCraft.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
