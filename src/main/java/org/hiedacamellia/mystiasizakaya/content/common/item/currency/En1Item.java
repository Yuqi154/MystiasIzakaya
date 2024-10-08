
package org.hiedacamellia.mystiasizakaya.content.common.item.currency;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.hiedacamellia.mystiasizakaya.core.event.MIPlayerEvent;

import java.util.List;

public class En1Item extends Item {
	public En1Item() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.BLOCK;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		String[] description = Component.translatable("tooltip.mystias_izakaya.en_1").getString().split("§n");
		for (String line : description) {
			list.add(Component.literal(line));
		}

	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);

		MIPlayerEvent.changeBalance(entity, ar.getObject().getCount());
		MIPlayerEvent.addTurnover(entity, "from_currency", ar.getObject().getCount());
		MIPlayerEvent.deleteOverTurnover(entity);

		ar.getObject().shrink(ar.getObject().getCount());
		ar.getObject().setCount(0);
		return ar;
	}
}
