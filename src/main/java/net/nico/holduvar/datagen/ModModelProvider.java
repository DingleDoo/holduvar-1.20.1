package net.nico.holduvar.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.nico.holduvar.block.ModBlocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerLog(ModBlocks.IRONWOOD_LOG).log(ModBlocks.IRONWOOD_LOG).wood(ModBlocks.IRONWOOD_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_IRONWOOD_LOG).log(ModBlocks.STRIPPED_IRONWOOD_LOG).wood(ModBlocks.STRIPPED_IRONWOOD_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.IRONWOOD_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.IRONWOOD_LEAVES);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
