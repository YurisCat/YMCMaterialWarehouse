
package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemIridiumDust extends Item 
{
    public ItemIridiumDust()
    {
    	super();
    	
    	OreDictionary.registerOre("dustIridium", this);

        this.setUnlocalizedName("iridiumDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}
