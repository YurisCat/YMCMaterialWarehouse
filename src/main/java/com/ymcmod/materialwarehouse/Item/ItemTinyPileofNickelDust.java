package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemTinyPileofNickelDust extends Item 
{
    public ItemTinyPileofNickelDust()
    {
        super();
        
        OreDictionary.registerOre("dustTinyNickel", this);
        
        this.setUnlocalizedName("tinyPileofNickelDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}