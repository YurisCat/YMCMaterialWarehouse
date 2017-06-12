package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemNickelDust extends Item 
{
    public ItemNickelDust()
    {
    	super();
    	
    	OreDictionary.registerOre("dustNickel", this);

        this.setUnlocalizedName("nickelDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}