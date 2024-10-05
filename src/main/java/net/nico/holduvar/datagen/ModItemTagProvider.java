package net.nico.holduvar.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.nico.holduvar.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture, @Nullable BlockTagProvider blockTagProvider) {
        super(output, completableFuture, blockTagProvider);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {


        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.IRONWOOD_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.IRONWOOD_LOG.asItem())
                .add(ModBlocks.IRONWOOD_WOOD.asItem())
                .add(ModBlocks.STRIPPED_IRONWOOD_LOG.asItem())
                .add(ModBlocks.STRIPPED_IRONWOOD_WOOD.asItem());

    }
}
