package com.hon.horrormod.event;

import com.hon.horrormod.HorrorMod;
import com.hon.horrormod.entity.ModEntityTypes;
import com.hon.horrormod.entity.custom.GusEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ModEvents {

    @Mod.EventBusSubscriber(modid = HorrorMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents {
        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
            event.put(ModEntityTypes.GUS.get(), GusEntity.setAttributes());
        }
    }
}
