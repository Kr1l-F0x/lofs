package net.kr1lgema.lofs;

import net.fabricmc.api.ModInitializer;

import net.kr1lgema.lofs.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LightOfStar implements ModInitializer {

	public static final String MOD_ID = "lofs";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}