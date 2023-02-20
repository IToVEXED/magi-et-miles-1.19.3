package net.vexed.magimiles;

import net.fabricmc.api.ModInitializer;

import net.vexed.magimiles.item.ModItemGroup;
import net.vexed.magimiles.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MagiMiles implements ModInitializer {
	public static final String MOD_ID = "magimiles";
	public static final Logger LOGGER = LoggerFactory.getLogger("magimiles");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
	}
}