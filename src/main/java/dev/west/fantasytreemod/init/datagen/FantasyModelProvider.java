package dev.west.fantasytreemod.init.datagen;

import dev.west.fantasytreemod.init.InitBlocks;
import dev.west.fantasytreemod.init.InitItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TextureMap;

public class FantasyModelProvider  extends FabricModelProvider {
    public FantasyModelProvider(FabricDataOutput output) {
        super(output);
    }

    private static BlockStateModelGenerator.BlockTexturePool getCubeAllBlockTexturePoolWithoutRegisteringBaseBlock(BlockStateModelGenerator blockStateModelGenerator, Block block) {
        return blockStateModelGenerator.new BlockTexturePool(TextureMap.all(block));
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.ORC_STONE)
                .fence(InitBlocks.ORC_STONE_FENCE)
                .slab(InitBlocks.ORC_STONE_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.MORDOR_STONE)
                .slab(InitBlocks.MORDOR_STONE_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.ANGBAND_STONE)
                .slab(InitBlocks.ANGBAND_STONE_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.DWARF_STONE)
                .slab(InitBlocks.DWARF_STONE_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.DWARF_BLOCK)
                .slab(InitBlocks.DWARF_BLOCK_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.MORIA_STONE)
                .slab(InitBlocks.MORIA_STONE_SLAB);
        blockStateModelGenerator.registerCubeAllModelTexturePool(InitBlocks.MORIA_BRICK)
                .slab(InitBlocks.MORIA_BRICK_SLAB);
        blockStateModelGenerator.registerLog(InitBlocks.MITHRIL_LOG)
                .log(InitBlocks.MITHRIL_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.BlACKWALNUT_LOG)
                .log(InitBlocks.BlACKWALNUT_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.BlACKWILLOW_LOG)
                .log(InitBlocks.BlACKWILLOW_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.BLUECRYSTAL_LOG)
                .log(InitBlocks.BLUECRYSTAL_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.DROW_LOG)
                .log(InitBlocks.DROW_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.PINE_LOG)
                .log(InitBlocks.PINE_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.SILVER_LOG)
                .log(InitBlocks.SILVER_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.ELF_LOG)
                .log(InitBlocks.ELF_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.IRONWOOD_LOG)
                .log(InitBlocks.IRONWOOD_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.EVILWOOD_LOG)
                .log(InitBlocks.EVILWOOD_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.SUNELF_LOG)
                .log(InitBlocks.SUNELF_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.UATHAR_LOG)
                .log(InitBlocks.UATHAR_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.OUFYEW_LOG)
                .log(InitBlocks.OUFYEW_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.AYIFER_LOG)
                .log(InitBlocks.AYIFER_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.IORANY_LOG)
                .log(InitBlocks.IORANY_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.SHADOW_FIR_LOG)
                .log(InitBlocks.SHADOW_FIR_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.DARKELF_LOG)
                .log(InitBlocks.DARKELF_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.YEZHOVE_LOG)
                .log(InitBlocks.YEZHOVE_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.EDLIFER_LOG)
                .log(InitBlocks.EDLIFER_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.KLINWOOD_LOG)
                .log(InitBlocks.KLINWOOD_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.GREEN_FIR_LOG)
                .log(InitBlocks.GREEN_FIR_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.WEEPING_LOG)
                .log(InitBlocks.WEEPING_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.OTHON_LOG)
                .log(InitBlocks.OTHON_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.ALOGRORN_LOG)
                .log(InitBlocks.ALOGRORN_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.EIKEW_LOG)
                .log(InitBlocks.EIKEW_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.DLONET_LOG)
                .log(InitBlocks.DLONET_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.DIRE_LOG)
                .log(InitBlocks.DIRE_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.ASHRET_LOG)
                .log(InitBlocks.ASHRET_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.BUCKEYE_LOG)
                .log(InitBlocks.BUCKEYE_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.DOGWOOD_LOG)
                .log(InitBlocks.DOGWOOD_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.SCONET_LOG)
                .log(InitBlocks.SCONET_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.OPLOOD_LOG)
                .log(InitBlocks.OPLOOD_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.AEKLOOD_LOG)
                .log(InitBlocks.AEKLOOD_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.KRESS_LOG)
                .log(InitBlocks.KRESS_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.SMANY_LOG)
                .log(InitBlocks.SMANY_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.ICHREAM_LOG)
                .log(InitBlocks.ICHREAM_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.TUFICH_LOG)
                .log(InitBlocks.TUFICH_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.BLUSHET_LOG)
                .log(InitBlocks.BLUSHET_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.OTHON_LOG)
                .log(InitBlocks.OLEN_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.GOLD_ELF_LOG)
                .log(InitBlocks.GOLD_ELF_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.TREE_ELF_LOG)
                .log(InitBlocks.TREE_ELF_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.SILVERELF_LOG)
                .log(InitBlocks.SILVERELF_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.PEACH_LOG)
                .log(InitBlocks.PEACH_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.NIGHTELF_LOG)
                .log(InitBlocks.NIGHTELF_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.CRYSTALICE_LOG)
                .log(InitBlocks.CRYSTALICE_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.BLUETRUE_LOG)
                .log(InitBlocks.BLUETRUE_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.USK_LOG)
                .log(InitBlocks.USK_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.IPP_LOG)
                .log(InitBlocks.IPP_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.ELM_LOG)
                .log(InitBlocks.ELM_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.MORDOR_LOG)
                .log(InitBlocks.MORDOR_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.ANGBAND_LOG)
                .log(InitBlocks.ANGBAND_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.FRER_LOG)
                .log(InitBlocks.FRER_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.TEAK_LOG)
                .log(InitBlocks.TEAK_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.DEAD_LOG)
                .log(InitBlocks.DEAD_LOG);
        blockStateModelGenerator.registerLog(InitBlocks.ELDER_LOG)
                .log(InitBlocks.ELDER_LOG);
        blockStateModelGenerator.registerSimpleState(InitBlocks.ORC_MOSS);





        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.ELDER_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.MITHRIL_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.SILVER_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.EVIL_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.SUNELF_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.DARKELF_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.DEAD_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.AEKLOOD_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.CRYSTALICE_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.BLUETRUE_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.DIRE_LEAVES);




        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.DWARF_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.IRONDWARF_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.MORDOR_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.ANGBAND_BRICK);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.EVIL_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(InitBlocks.SILVER_STONE);





    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(InitItems.MITHRIL, Models.GENERATED);
        itemModelGenerator.register(InitItems.BLUE, Models.GENERATED);
        itemModelGenerator.register(InitItems.MORDOR, Models.GENERATED);

    }
}