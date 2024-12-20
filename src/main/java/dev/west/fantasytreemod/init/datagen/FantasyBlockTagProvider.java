package dev.west.fantasytreemod.init.datagen;

import dev.west.fantasytreemod.init.InitBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class FantasyBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public FantasyBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(InitBlocks.ELF_LOG)
                .add(InitBlocks.IRONWOOD_LOG)
                .add(InitBlocks.EVILWOOD_LOG)
                .add(InitBlocks.BlACKWILLOW_LOG)
                .add(InitBlocks.MITHRIL_LOG)
                .add(InitBlocks.BLUECRYSTAL_LOG)
                .add(InitBlocks.DROW_LOG)
                .add(InitBlocks.PINE_LOG)
                .add(InitBlocks.SILVER_LOG)
                .add(InitBlocks.SUNELF_LOG)
                .add(InitBlocks.UATHAR_LOG)
                .add(InitBlocks.OUFYEW_LOG)
                .add(InitBlocks.AYIFER_LOG)
                .add(InitBlocks.MITHRIL_LEAVES)
                .add(InitBlocks.IORANY_LOG)
                .add(InitBlocks.SHADOW_FIR_LOG)
                .add(InitBlocks.DARKELF_LOG)
                .add(InitBlocks.YEZHOVE_LOG)
                .add(InitBlocks.EDLIFER_LOG)
                .add(InitBlocks.KLINWOOD_LOG)
                .add(InitBlocks.GREEN_FIR_LOG)
                .add(InitBlocks.ASHRET_LOG)
                .add(InitBlocks.SUNELF_LEAVES)
                .add(InitBlocks.DARKELF_LEAVES)
                .add(InitBlocks.WEEPING_LOG)
                .add(InitBlocks.OTHON_LOG)
                .add(InitBlocks.ALOGRORN_LOG)
                .add(InitBlocks.EIKEW_LOG)
                .add(InitBlocks.ELDER_LOG)
                .add(InitBlocks.DLONET_LOG)
                .add(InitBlocks.DIRE_LOG)
                .add(InitBlocks.BUCKEYE_LOG)
                .add(InitBlocks.DOGWOOD_LOG)
                .add(InitBlocks.DEAD_LOG)
                .add(InitBlocks.SCONET_LOG)
                .add(InitBlocks.OPLOOD_LOG)
                .add(InitBlocks.AEKLOOD_LOG)
                .add(InitBlocks.KRESS_LOG)
                .add(InitBlocks.SMANY_LOG)
                .add(InitBlocks.ICHREAM_LOG)
                .add(InitBlocks.TUFICH_LOG)
                .add(InitBlocks.BLUSHET_LOG)
                .add(InitBlocks.OLEN_LOG)
                .add(InitBlocks.GOLD_ELF_LOG)
                .add(InitBlocks.TREE_ELF_LOG)
                .add(InitBlocks.TEAK_LOG)
                .add(InitBlocks.SILVERELF_LOG)
                .add(InitBlocks.PEACH_LOG)
                .add(InitBlocks.NIGHTELF_LOG)
                .add(InitBlocks.CRYSTALICE_LOG)
                .add(InitBlocks.BLUETRUE_LOG)
                .add(InitBlocks.USK_LOG)
                .add(InitBlocks.IPP_LOG)
                .add(InitBlocks.ELM_LOG)
                .add(InitBlocks.MORDOR_LOG)
                .add(InitBlocks.ANGBAND_LOG)
                .add(InitBlocks.FRER_LOG)
                .add(InitBlocks.BlACKWALNUT_LOG);



        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(InitBlocks.SHADOW_FIR_LOG)
                .add(InitBlocks.SUNELF_LOG)
                .add(InitBlocks.EVILWOOD_LOG)
                .add(InitBlocks.IRONWOOD_LOG)
                .add(InitBlocks.ELF_LOG)
                .add(InitBlocks.SILVER_LOG)
                .add(InitBlocks.PINE_LOG)
                .add(InitBlocks.DROW_LOG)
                .add(InitBlocks.BLUECRYSTAL_LOG)
                .add(InitBlocks.MITHRIL_LOG)
                .add(InitBlocks.BlACKWILLOW_LOG)
                .add(InitBlocks.UATHAR_LOG)
                .add(InitBlocks.OUFYEW_LOG)
                .add(InitBlocks.AYIFER_LOG)
                .add(InitBlocks.IORANY_LOG)
                .add(InitBlocks.DARKELF_LOG)
                .add(InitBlocks.YEZHOVE_LOG)
                .add(InitBlocks.EDLIFER_LOG)
                .add(InitBlocks.KLINWOOD_LOG)
                .add(InitBlocks.GREEN_FIR_LOG)
                .add(InitBlocks.ASHRET_LOG)
                .add(InitBlocks.WEEPING_LOG)
                .add(InitBlocks.OTHON_LOG)
                .add(InitBlocks.ALOGRORN_LOG)
                .add(InitBlocks.EIKEW_LOG)
                .add(InitBlocks.ELDER_LOG)
                .add(InitBlocks.DLONET_LOG)
                .add(InitBlocks.DIRE_LOG)
                .add(InitBlocks.BUCKEYE_LOG)
                .add(InitBlocks.DOGWOOD_LOG)
                .add(InitBlocks.DEAD_LOG)
                .add(InitBlocks.SCONET_LOG)
                .add(InitBlocks.OPLOOD_LOG)
                .add(InitBlocks.AEKLOOD_LOG)
                .add(InitBlocks.KRESS_LOG)
                .add(InitBlocks.SMANY_LOG)
                .add(InitBlocks.ICHREAM_LOG)
                .add(InitBlocks.TUFICH_LOG)
                .add(InitBlocks.TEAK_LOG)
                .add(InitBlocks.BLUSHET_LOG)
                .add(InitBlocks.OLEN_LOG)
                .add(InitBlocks.GOLD_ELF_LOG)
                .add(InitBlocks.TREE_ELF_LOG)
                .add(InitBlocks.SILVERELF_LOG)
                .add(InitBlocks.PEACH_LOG)
                .add(InitBlocks.NIGHTELF_LOG)
                .add(InitBlocks.CRYSTALICE_LOG)
                .add(InitBlocks.BLUETRUE_LOG)
                .add(InitBlocks.USK_LOG)
                .add(InitBlocks.IPP_LOG)
                .add(InitBlocks.ELM_LOG)
                .add(InitBlocks.MORDOR_LOG)
                .add(InitBlocks.ANGBAND_LOG)
                .add(InitBlocks.FRER_LOG)
                .add(InitBlocks.BlACKWALNUT_LOG);

        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(InitBlocks.AEKLOOD_LEAVES)
                .add(InitBlocks.DIRE_LEAVES)
                .add(InitBlocks.CRYSTALICE_LEAVES)
                .add(InitBlocks.BLUETRUE_LEAVES)
                .add(InitBlocks.DEAD_LEAVES)
                .add(InitBlocks.ELDER_LEAVES)
                .add(InitBlocks.DARKELF_LEAVES)
                .add(InitBlocks.SUNELF_LEAVES)
                .add(InitBlocks.EVIL_LEAVES)
                .add(InitBlocks.SILVER_LEAVES)
                .add(InitBlocks.MITHRIL_LEAVES);





        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(InitBlocks.ORC_STONE_FENCE)
                .add(InitBlocks.ORC_STONE_SLAB)
                .add(InitBlocks.ORC_STONE)
                .add(InitBlocks.SILVER_STONE)
                .add(InitBlocks.EVIL_STONE)
                .add(InitBlocks.ANGBAND_BRICK)
                .add(InitBlocks.MORDOR_STONE_SLAB)
                .add(InitBlocks.ANGBAND_STONE_SLAB)
                .add(InitBlocks.ANGBAND_STONE)
                .add(InitBlocks.MORDOR_BRICK)
                .add(InitBlocks.MORDOR_STONE)
                .add(InitBlocks.DWARF_STONE_SLAB)
                .add(InitBlocks.DWARF_BLOCK_SLAB)
                .add(InitBlocks.MORIA_STONE_SLAB)
                .add(InitBlocks.MORIA_BRICK_SLAB)
                .add(InitBlocks.MORIA_BRICK)
                .add(InitBlocks.MORIA_STONE)
                .add(InitBlocks.IRONDWARF_STONE)
                .add(InitBlocks.DWARF_BLOCK)
                .add(InitBlocks.DWARF_BRICK)
                .add(InitBlocks.DWARF_STONE);



        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(InitBlocks.ORC_STONE_SLAB)
                .add(InitBlocks.MORDOR_STONE_SLAB)
                .add(InitBlocks.ANGBAND_STONE_SLAB)
                .add(InitBlocks.DWARF_STONE_SLAB)
                .add(InitBlocks.DWARF_BLOCK_SLAB)
                .add(InitBlocks.MORIA_STONE_SLAB)
                .add(InitBlocks.MORIA_BRICK_SLAB);


        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(InitBlocks.ORC_STONE_FENCE);



        getOrCreateTagBuilder(BlockTags.MOSS_REPLACEABLE)
                .add(InitBlocks.ELF_MOSS)
                .add(InitBlocks.ORC_MOSS);








































    }
}

