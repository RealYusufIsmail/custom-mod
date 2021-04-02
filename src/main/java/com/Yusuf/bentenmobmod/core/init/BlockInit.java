package com.Yusuf.bentenmobmod.core.init;

import com.Yusuf.bentenmobmod.Main;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			Main.MOD_ID);

	public static final RegistryObject<Block> LEGENDARY_BLOCK = BLOCKS
			.register("legendary_block",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.NETHERITE_BLOCK)));
	
	public static final RegistryObject<Block> LEGENDARY_ORE_BLOCK = BLOCKS
			.register("legendary_ore_block",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.NETHERITE_BLOCK)));
	
	public static final RegistryObject<Block> OMNITRIX_BLOCK = BLOCKS
			.register("omnitrix_block",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.ANCIENT_DEBRIS)));
	
	public static final RegistryObject<Block> FIRE_BLOCK = BLOCKS
			.register("fire_block",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.ANCIENT_DEBRIS)));
	
	/* Black for ores */
	
	public static final RegistryObject<Block> RUBY_ORE = BLOCKS
			.register("ruby_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.ANCIENT_DEBRIS)));
	
	public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS
			.register("ruby_block",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.ANCIENT_DEBRIS)));
	
	public static final RegistryObject<Block> OMNITRIX_ORE = BLOCKS
			.register("omnitrix_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.ANCIENT_DEBRIS)));
	
	public static final RegistryObject<Block> FIRE_ORE = BLOCKS
			.register("fire_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.ANCIENT_DEBRIS)));
	

	/* ore blocks */
	
	
	public static final RegistryObject<Block> VILGAX_BLOCK = BLOCKS
			.register("vilgax_block",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.STONE)));
	/* other blocks */
	

}
