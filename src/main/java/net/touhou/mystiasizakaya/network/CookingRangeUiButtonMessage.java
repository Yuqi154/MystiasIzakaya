
package net.touhou.mystiasizakaya.network;

import net.touhou.mystiasizakaya.world.inventory.CookingRangeUiMenu;
import net.touhou.mystiasizakaya.procedures.ConfirmProcedure;
import net.touhou.mystiasizakaya.procedures.SelectTarget;
import net.touhou.mystiasizakaya.MystiasIzakayaMod;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CookingRangeUiButtonMessage {
	private final int buttonID, x, y, z;

	public CookingRangeUiButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public CookingRangeUiButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(CookingRangeUiButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(CookingRangeUiButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = CookingRangeUiMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			ConfirmProcedure.execute(world, x, y, z);
		}
		if (buttonID == 1) {
			SelectTarget.set(world, x, y, z, 7);
		}
		if (buttonID == 2) {

			SelectTarget.set(world, x, y, z, 8);
		}
		if (buttonID == 3) {

			SelectTarget.set(world, x, y, z, 9);
		}
		if (buttonID == 4) {

			SelectTarget.set(world, x, y, z, 10);
		}
		if (buttonID == 5) {

			SelectTarget.set(world, x, y, z, 11);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		MystiasIzakayaMod.addNetworkMessage(CookingRangeUiButtonMessage.class, CookingRangeUiButtonMessage::buffer,
				CookingRangeUiButtonMessage::new, CookingRangeUiButtonMessage::handler);
	}
}
