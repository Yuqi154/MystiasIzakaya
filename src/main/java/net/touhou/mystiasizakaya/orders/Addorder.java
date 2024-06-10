package net.touhou.mystiasizakaya.orders;

import net.minecraft.world.entity.player.Player;
import net.minecraftforge.registries.ForgeRegistries;
import net.touhou.mystiasizakaya.network.Variables;

import net.minecraft.world.item.ItemStack;

import java.util.List;

public class Addorder {
	public static void execute(ItemStack beverages, ItemStack cuisines, double id, Player player) {
		List<String> orders_list = player.getCapability(Variables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Variables.PlayerVariables()).orders;
		List<String> ordersbeverages_list = player.getCapability(Variables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new Variables.PlayerVariables()).ordersbeverages;
		String cuisines_str = ForgeRegistries.ITEMS.getKey(cuisines.getItem()).toString();
		String beverages_str = ForgeRegistries.ITEMS.getKey(beverages.getItem()).toString();
		orders_list.set((int) id, cuisines_str);
		ordersbeverages_list.set((int) id, beverages_str);
		player.getCapability(Variables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
			capability.orders = orders_list;
			capability.ordersbeverages = ordersbeverages_list;
			capability.syncPlayerVariables(player);
		});
	}
}
