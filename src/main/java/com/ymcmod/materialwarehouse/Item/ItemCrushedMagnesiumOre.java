
package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemCrushedMagnesiumOre extends Item 
{
    public ItemCrushedMagnesiumOre()
    {
        super();
        
        OreDictionary.registerOre("crushedMagnesium", this);
        
        this.setUnlocalizedName("crushedMagnesiumOre");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}