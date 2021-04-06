package com.Yusuf.bentenmobmod.client.model;

import com.Yusuf.bentenmobmod.Main;
import com.Yusuf.bentenmobmod.entity.VilgaxEntity;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import software.bernie.geckolib3.model.AnimatedGeoModel;

@OnlyIn(Dist.CLIENT)
public class VilgaxModel<B extends CreatureEntity> extends AnimatedGeoModel<VilgaxEntity> {

	@Override
	    public ResourceLocation getModelLocation(VilgaxEntity object)
	    {
	        return new ResourceLocation(Main.MOD_ID, "geo/vilgax.geo.json");
	    }


	@Override
	    public ResourceLocation getAnimationFileLocation(VilgaxEntity object)
	    {
	        return new ResourceLocation(Main.MOD_ID, "animations/vilgax.animation.json");
	    }

	@Override
	    public ResourceLocation getTextureLocation(VilgaxEntity object)
	    {
		return new ResourceLocation(Main.MOD_ID, "textures/model/entities/vilgax/vilgax_entity.png");
	    }
}
