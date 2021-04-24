package com.Yusuf.bentenmobmod.common.events;

import com.Yusuf.bentenmobmod.core.init.ItemInit;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.minecraftforge.common.extensions.IForgeItem;

public class heatblast_chestplate extends ArmorItem implements IForgeItem {

	public heatblast_chestplate(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder) {
		super(materialIn, slot, builder);		
	}
	@Override
	public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
		if(!player.isOnFire()) {
			EffectInstance effect = new EffectInstance(Effects.FIRE_RESISTANCE, 940000000, 0, false, false, true);
			if (stack.getItem() == ItemInit.HEATBLAST_CHESTPLATE.get()) {
				player.addEffect(effect);
			}
		}
	}
}
