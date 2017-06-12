package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemTungstenIngot extends Item 
{
    public ItemTungstenIngot()
    {
    	super();
    	
    	OreDictionary.registerOre("tungstenIngot", this);

        this.setUnlocalizedName("tungstenIngot");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}