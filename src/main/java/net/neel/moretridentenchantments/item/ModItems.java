package net.neel.moretridentenchantments.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.neel.moretridentenchantments.MoreTridentEnchantments;



public class ModItems {

	public static final Item LEECH = registerItem("leech", new Item(new FabricItemSettings()));

	public static final Item enchantingStone = registerItem("enchantingstone", new Item(new FabricItemSettings()));

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(MoreTridentEnchantments.MOD_ID, name), item);
	}

	public static void addItemsToGroups() {
		addToItemGroup(ItemGroups.INGREDIENTS, LEECH);
		addToItemGroup(ItemGroups.INGREDIENTS, enchantingStone);

		addToItemGroup(ModItemGroup.newTridentEnchantments, LEECH);
		addToItemGroup(ModItemGroup.newTridentEnchantments, enchantingStone);
	}

	private static void addToItemGroup(ItemGroup itemGroup, Item item) {
		ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(item));
	}

	public static void registerModItems() {
		MoreTridentEnchantments.LOGGER.debug("Registering Mod Items for " + MoreTridentEnchantments.MOD_ID);
		addItemsToGroups();
	}
}
