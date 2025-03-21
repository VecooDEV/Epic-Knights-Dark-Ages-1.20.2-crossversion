package com.magistuarmory.darkages;

import com.magistuarmory.darkages.client.render.model.AddonModels;
import com.magistuarmory.darkages.config.AddonConfig;
import com.magistuarmory.darkages.item.AddonItems;
import com.magistuarmory.darkages.misc.AddonCreativeTabs;
import com.magistuarmory.darkages.misc.AddonMerchOffers;
import dev.architectury.platform.Platform;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import net.fabricmc.api.EnvType;

public class EpicKnightsDarkAges
{
	public static final String ID = "darkagesarmory";
	public static AddonConfig CONFIG;
	
	static
	{
		AutoConfig.register(AddonConfig.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new));
		CONFIG = AutoConfig.getConfigHolder(AddonConfig.class).getConfig();
	}
    
    public static void init()
    {
		System.out.println("Hello from Epic Knights Addon init!");
	    AddonItems.INSTANCE.init();
	    AddonCreativeTabs.init();
	    AddonMerchOffers.init();
		if (Platform.getEnv() == EnvType.CLIENT)
			AddonModels.INSTANCE.init(AddonItems.INSTANCE);
    }
}
