package net.neel.moretridentenchantments.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.neel.moretridentenchantments.MoreTridentEnchantments;

public class ModItemGroup {
	public static ItemGroup newTridentEnchantments;

	public static void registerItemGroups() {
		newTridentEnchantments = FabricItemGroup.builder(new Identifier(MoreTridentEnchantments.MOD_ID, "newtridentenchantments"))
				.displayName(Text.translatable("itemgroup.newtridentenchantments")).icon(() -> new ItemStack(ModItems.LEECH)).build();
	}
}
