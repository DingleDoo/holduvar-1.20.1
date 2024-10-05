package net.nico.holduvar.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.nico.holduvar.Holduvar;
import net.nico.holduvar.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup INGREDIENTS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Holduvar.MOD_ID, "ingredients"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.hold_ing"))
                    .icon(() -> new ItemStack(ModBlocks.IRONWOOD_LOG)).entries((displayContext, entries) -> {
                        entries.add(ModItems.THORNS);

                        entries.add(ModItems.ONION);
                        entries.add(ModItems.RED_ONION);

                        entries.add(ModBlocks.IRONWOOD_LOG);
                        entries.add(ModBlocks.IRONWOOD_WOOD);
                        entries.add(ModBlocks.IRONWOOD_PLANKS);
                        entries.add(ModBlocks.STRIPPED_IRONWOOD_LOG);
                        entries.add(ModBlocks.STRIPPED_IRONWOOD_WOOD);
                        entries.add(ModBlocks.IRONWOOD_LEAVES);

                    }).build());
    public static final ItemGroup METALLURGY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Holduvar.MOD_ID, "metallurgy"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.hold_met"))
                    .icon(() -> new ItemStack(ModBlocks.ALUMINIUM_BLOCK)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ALUMINIUM_INGOT);
                        entries.add(ModItems.RAW_ALUMINIUM);

                        entries.add(ModBlocks.ALUMINIUM_ORE);
                        entries.add(ModBlocks.ALUMINIUM_BLOCK);
                        entries.add(ModBlocks.RAW_ALUMINIUM_BLOCK);

                        entries.add(ModItems.ALUMINIUM_BRONZE_INGOT);
                        entries.add(ModBlocks.ALUMINIUM_BRONZE_BLOCK);

                    }).build());


    public static void registerItemGroups() {
        Holduvar.LOGGER.info("Register ITem Groups" +Holduvar.MOD_ID);
    }
}
