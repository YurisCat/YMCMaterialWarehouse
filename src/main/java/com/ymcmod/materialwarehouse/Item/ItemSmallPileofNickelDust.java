package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemSmallPileofNickelDust extends Item 
{
    public ItemSmallPileofNickelDust()
    {
        super();
        
        OreDictionary.registerOre("dustSmallNickel", this);
        
        this.setUnlocalizedName("smallPileofNickelDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}
