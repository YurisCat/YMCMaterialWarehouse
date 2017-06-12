
package com.ymcinc.vsp;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

	@Mod(modid="vsp", name="Vsp", version="1.0.0")


public class Vsp {
		private static final String MODID = "diracon";
		private static final String DIRACORE = "diracOre";
		public static BlockWhitePanelAlmostTraceless diracBlock;
		
	@EventHandler
	public void preLoad(FMLPreInitializationEvent event)
	{diracBlock = new BlockWhitePanelAlmostTraceless();
	diracBlock.setUnlocalizedName(MODID + "." + DIRACORE);
	diracBlock.setRegistryName(MODID, DIRACORE);
	diracBlock.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	GameRegistry.register(diracBlock);
	GameRegistry.register(new ItemBlock(diracBlock).setRegistryName(MODID, DIRACORE));
	
	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(diracBlock), 0, new ModelResourceLocation(MODID + ":" + DIRACORE, "inventory"));


	}
	 
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		
	}
	 
	@EventHandler
	public void postLoad(FMLPostInitializationEvent event)
	{
		

	}
}
