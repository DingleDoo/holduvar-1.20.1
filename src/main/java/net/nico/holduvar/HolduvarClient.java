package net.nico.holduvar;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.nico.holduvar.block.ModBlocks;

public class HolduvarClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.IRONWOOD_LEAVES, RenderLayer.getCutout());

    }
}
