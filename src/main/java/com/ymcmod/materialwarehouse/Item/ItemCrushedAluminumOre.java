
package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemCrushedAluminumOre extends Item 
{
    public ItemCrushedAluminumOre()
    {
        super();
        
        OreDictionary.registerOre("crushedAluminum", this);
        
        this.setUnlocalizedName("crushedAluminumOre");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}