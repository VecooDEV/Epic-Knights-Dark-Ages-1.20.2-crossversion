package com.magistuarmory.darkages.forge;

import com.magistuarmory.darkages.EpicKnightsDarkAges;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(EpicKnightsDarkAges.ID)
public class EpicKnightsDarkAgesForge
{
    public EpicKnightsDarkAgesForge()
    {
        EventBuses.registerModEventBus(EpicKnightsDarkAges.ID, FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);

        EpicKnightsDarkAges.init();
    }
}
