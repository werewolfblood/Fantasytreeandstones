package dev.west.fantasytreemod;

import dev.west.fantasytreemod.init.datagen.FantasyBlockTagProvider;
import dev.west.fantasytreemod.init.datagen.FantasyItemTagProvider;
import dev.west.fantasytreemod.init.datagen.FantasyLootTableProvider;
import dev.west.fantasytreemod.init.datagen.FantasyModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class FantasyTreeModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

pack.addProvider(FantasyBlockTagProvider::new);
pack.addProvider(FantasyItemTagProvider::new);
pack.addProvider(FantasyLootTableProvider::new);
pack.addProvider(FantasyModelProvider::new);
	}
}
