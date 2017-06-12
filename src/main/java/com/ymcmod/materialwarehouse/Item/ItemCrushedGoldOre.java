
package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemCrushedGoldOre extends Item 
{
    public ItemCrushedGoldOre()
    {
        super();
        
        OreDictionary.registerOre("crushedGold", this);
        
        this.setUnlocalizedName("crushedGoldOre");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}
