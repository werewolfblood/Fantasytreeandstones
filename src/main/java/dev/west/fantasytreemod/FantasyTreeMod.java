package dev.west.fantasytreemod;

import dev.west.fantasytreemod.init.InitBlocks;
import dev.west.fantasytreemod.init.InitItems;
import dev.west.fantasytreemod.init.item.InitItemGroups;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FantasyTreeMod implements ModInitializer {
	public static final String MOD_ID = "fantasytreemod";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		InitBlocks.registerModBlocks();
		InitItemGroups.registerItemGroups();
		InitItems.registerModItems();


		LOGGER.info("Hello Fabric world!");
	}
}