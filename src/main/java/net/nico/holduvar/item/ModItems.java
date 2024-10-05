package net.nico.holduvar.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.nico.holduvar.Holduvar;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item THORNS = registerItem("thorns", new Item(new FabricItemSettings()));
    public static final Item ALUMINIUM_INGOT = registerItem("aluminium_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_ALUMINIUM = registerItem("raw_aluminium", new Item(new FabricItemSettings()));
    public static final Item ALUMINIUM_BRONZE_INGOT = registerItem("aluminium_bronze_ingot", new Item(new FabricItemSettings()));
    public static final Item ONION = registerItem("onion", new Item(new FabricItemSettings()));
    public static final Item RED_ONION = registerItem("red_onion", new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Holduvar.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Holduvar.LOGGER.info("Registering Mod Items for " + Holduvar.MOD_ID);


    }
}