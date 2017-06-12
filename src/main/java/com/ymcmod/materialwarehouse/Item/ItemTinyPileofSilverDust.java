package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemTinyPileofSilverDust extends Item 
{
    public ItemTinyPileofSilverDust()
    {
        super();
        
        OreDictionary.registerOre("dustTinySilver", this);
        
        this.setUnlocalizedName("tinyPileofSilverDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}
