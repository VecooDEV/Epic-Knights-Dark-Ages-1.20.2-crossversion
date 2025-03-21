package com.magistuarmory.darkages.misc;

import dev.architectury.event.events.common.LifecycleEvent;

public class AddonMerchOffers
{
	public static void init()
	{
		LifecycleEvent.SETUP.register(AddonMerchOffers::setup);
	}
	
	public static void setup()
	{

	}
}
