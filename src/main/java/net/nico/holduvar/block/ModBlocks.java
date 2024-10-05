package net.nico.holduvar.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.nico.holduvar.Holduvar;

public class ModBlocks {
    public static final Block ALUMINIUM_BLOCK = registerBlock("aluminium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).sounds(BlockSoundGroup.METAL)));
    public static final Block RAW_ALUMINIUM_BLOCK = registerBlock("raw_aluminium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_COPPER_BLOCK).sounds(BlockSoundGroup.CALCITE)));
    public static final Block ALUMINIUM_ORE = registerBlock("aluminium_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.COPPER_ORE)));

    public static final Block ALUMINIUM_BRONZE_BLOCK = registerBlock("aluminium_bronze_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block IRONWOOD_LOG = registerBlock("ironwood_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_LOG)));
    public static final Block IRONWOOD_WOOD = registerBlock("ironwood_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_WOOD)));
    public static final Block STRIPPED_IRONWOOD_LOG = registerBlock("stripped_ironwood_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_BIRCH_LOG)));
    public static final Block STRIPPED_IRONWOOD_WOOD = registerBlock("stripped_ironwood_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_BIRCH_WOOD)));

    public static final Block IRONWOOD_PLANKS = registerBlock("ironwood_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.BIRCH_PLANKS)));
    public static final Block IRONWOOD_LEAVES = registerBlock("ironwood_leaves",
            new Block(FabricBlockSettings.copyOf(Blocks.BIRCH_LEAVES).nonOpaque()));









    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Holduvar.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Holduvar.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }


    public static void registerModBlocks() {
        Holduvar.LOGGER.info("Registering ModBlocks for " + Holduvar.MOD_ID);
    }
}
