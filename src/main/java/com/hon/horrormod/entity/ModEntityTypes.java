package com.hon.horrormod.entity;

import com.hon.horrormod.HorrorMod;
import com.hon.horrormod.entity.custom.GusEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, HorrorMod.MOD_ID);

    public static final RegistryObject<EntityType<GusEntity>> GUS =
            ENTITY_TYPES.register("gus",
                    () -> EntityType.Builder.of(GusEntity::new, MobCategory.MONSTER)
                            .sized(0.4f, 1.5f)
                            .build(new ResourceLocation(HorrorMod.MOD_ID, "gus").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
