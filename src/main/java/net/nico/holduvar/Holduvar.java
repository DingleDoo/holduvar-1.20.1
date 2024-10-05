package net.nico.holduvar;

import net.fabricmc.api.ModInitializer;

import net.nico.holduvar.block.ModBlocks;
import net.nico.holduvar.item.ModItemGroups;
import net.nico.holduvar.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Holduvar implements ModInitializer {
	public static final String MOD_ID = "holduvar";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}