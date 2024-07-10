package com.hon.horrormod.item;

import com.hon.horrormod.HorrorMod;
import com.hon.horrormod.entity.ModEntityTypes;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HorrorMod.MOD_ID);
    public static final RegistryObject<Item> GUS_SPAWN_EGG = ITEMS.register("gus_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.GUS, 0x22b341, 0x19732e,
                    new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
