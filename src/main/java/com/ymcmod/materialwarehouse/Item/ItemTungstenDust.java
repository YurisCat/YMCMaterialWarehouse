
package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemTungstenDust extends Item 
{
    public ItemTungstenDust()
    {
    	super();
    	
    	OreDictionary.registerOre("dustTungsten", this);

        this.setUnlocalizedName("tungstenDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}