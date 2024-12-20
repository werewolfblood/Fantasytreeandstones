package dev.west.fantasytreemod.init.datagen;

import dev.west.fantasytreemod.init.InitBlocks;
import dev.west.fantasytreemod.init.InitItems;
import dev.west.fantasytreemod.init.unit.FantasyTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class FantasyItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public FantasyItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(FantasyTags.Items.TRANSFORMABLE_ITEMS);
        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(InitItems.MITHRIL)
                .add(InitItems.BLUE)
                .add(InitItems.MORDOR)
                .add(InitBlocks.EVIL_LEAVES.asItem())
                .add(InitBlocks.SILVER_LEAVES.asItem())
                .add(InitBlocks.ELDER_LEAVES.asItem())
                .add(InitBlocks.CRYSTALICE_LEAVES.asItem())
                .add(InitBlocks.DIRE_LEAVES.asItem())
                .add(InitBlocks.BLUETRUE_LEAVES.asItem())
                .add(InitBlocks.AEKLOOD_LEAVES.asItem())
                .add(InitBlocks.MITHRIL_LEAVES.asItem());

        getOrCreateTagBuilder(ItemTags.FENCES)
                .add(InitBlocks.ORC_STONE_FENCE.asItem());


        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(InitBlocks.ORC_STONE_SLAB.asItem())
                .add(InitBlocks.MORDOR_STONE_SLAB.asItem())
                .add(InitBlocks.ANGBAND_STONE_SLAB.asItem())
                .add(InitBlocks.DWARF_STONE_SLAB.asItem())
                .add(InitBlocks.DWARF_BLOCK_SLAB.asItem())
                .add(InitBlocks.MORIA_STONE_SLAB.asItem())
                .add(InitBlocks.MORIA_BRICK_SLAB.asItem());



        getOrCreateTagBuilder(ItemTags.LOGS)
                .add(InitBlocks.ELDER_LOG.asItem())
                .add(InitBlocks.DEAD_LOG.asItem())
                .add(InitBlocks.TEAK_LOG.asItem())
                .add(InitBlocks.FRER_LOG.asItem())
                .add(InitBlocks.ANGBAND_LOG.asItem())
                .add(InitBlocks.IPP_LOG.asItem())
                .add(InitBlocks.MORDOR_LOG.asItem())
                .add(InitBlocks.USK_LOG.asItem())
                .add(InitBlocks.ASHRET_LOG.asItem())
                .add(InitBlocks.AYIFER_LOG.asItem())
                .add(InitBlocks.BlACKWALNUT_LOG.asItem())
                .add(InitBlocks.BlACKWILLOW_LOG.asItem())
                .add(InitBlocks.BUCKEYE_LOG.asItem())
                .add(InitBlocks.BLUECRYSTAL_LOG.asItem())
                .add(InitBlocks.BLUETRUE_LOG.asItem())
                .add(InitBlocks.DARKELF_LOG.asItem());










    }
}
