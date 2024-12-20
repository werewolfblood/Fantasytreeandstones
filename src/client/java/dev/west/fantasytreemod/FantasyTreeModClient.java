package dev.west.fantasytreemod;

import dev.west.fantasytreemod.init.InitBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class FantasyTreeModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		BlockRenderLayerMap.INSTANCE.putBlock(InitBlocks.ELDER_LEAVES, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(InitBlocks.SILVER_LEAVES, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(InitBlocks.SUNELF_LEAVES, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(InitBlocks.DARKELF_LEAVES, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(InitBlocks.MITHRIL_LEAVES, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(InitBlocks.EVIL_LEAVES, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(InitBlocks.AEKLOOD_LEAVES, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(InitBlocks.CRYSTALICE_LEAVES, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(InitBlocks.BLUETRUE_LEAVES, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(InitBlocks.DIRE_LEAVES, RenderLayer.getCutout());
	}
}