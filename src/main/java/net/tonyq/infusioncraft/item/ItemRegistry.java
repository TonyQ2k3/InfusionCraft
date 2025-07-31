package net.tonyq.infusioncraft.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tonyq.infusioncraft.InfusionCraft;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, InfusionCraft.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    // Crafting items
    public static final RegistryObject<Item> INFUSION_CORE_TIER_1 = ITEMS.register("infusion_core_tier_1",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INFUSION_CORE_TIER_2 = ITEMS.register("infusion_core_tier_2",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INFUSION_CORE_TIER_3 = ITEMS.register("infusion_core_tier_3",
            () -> new Item(new Item.Properties()));

}
