package dev.west.fantasytreemod.init;

import dev.west.fantasytreemod.FantasyTreeMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class InitItems {
    public static final Item MITHRIL = registerItem("mithril", new Item(new FabricItemSettings()));
    public static final Item BLUE = registerItem("blue", new Item(new FabricItemSettings()));
    public static final Item MORDOR = registerItem("mordor", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {

    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FantasyTreeMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FantasyTreeMod.LOGGER.info("Registering Mod Items for " + FantasyTreeMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(InitItems::addItemsToIngredientItemGroup);
    }
}

