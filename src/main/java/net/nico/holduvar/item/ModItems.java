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
    public static final Item WHITE_GRAPE = registerItem("white_grape", new Item(new FabricItemSettings()));
    public static final Item RED_GRAPE = registerItem("red_grape", new Item(new FabricItemSettings()));
    public static final Item RICE = registerItem("rice", new Item(new FabricItemSettings()));
    public static final Item GARLIC = registerItem("garlic", new Item(new FabricItemSettings()));
    public static final Item GINGER = registerItem("ginger", new Item(new FabricItemSettings()));
    public static final Item MINT = registerItem("mint", new Item(new FabricItemSettings()));
    public static final Item HOPS = registerItem("hops", new Item(new FabricItemSettings()));
    public static final Item ORANGE = registerItem("orange", new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Holduvar.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Holduvar.LOGGER.info("Registering Mod Items for " + Holduvar.MOD_ID);


    }
}