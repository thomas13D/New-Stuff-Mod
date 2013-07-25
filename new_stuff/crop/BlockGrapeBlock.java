package mods.new_stuff.crop;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.new_stuff.common.New_Stuff;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;

public class BlockGrapeBlock extends BlockCrops
{
    @SideOnly(Side.CLIENT)
    private Icon[] iconArray;

    public BlockGrapeBlock(int par1)
    {
        super(par1);
    }

    @SideOnly(Side.CLIENT)

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getIcon(int par1, int par2)
    {
        if (par2 < 7)
        {
            if (par2 == 6)
            {
                par2 = 5;
            }

            return this.iconArray[par2 >> 1];
        }
        else
        {
            return this.iconArray[3];
        }
    }

    /**
     * Generate a seed ItemStack for this crop.
     */
    protected int getSeedItem()
    {
        return New_Stuff.Grape.itemID;
    }

    /**
     * Generate a crop produce ItemStack for this crop.
     */
    protected int getCropItem()
    {
        return New_Stuff.Grape.itemID;
    }

    @Override
    public int idDropped(int metadata, Random random, int par2) {
        switch (metadata) {
        case 0:
            return -1;
        case 1:
            return New_Stuff.Grape.itemID;
        default: // Error case!
        		return New_Stuff.Grape.itemID;}
        	}
        	public int quantityDropped(Random rand){
        		return rand.nextInt(4);}

@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister par1IconRegister){
	this.iconArray = new Icon[4];
	
	for (int i = 0; i < this.iconArray.length; ++i){
		this.iconArray[i] = par1IconRegister.registerIcon("new_stuff:grape_stage_" + (i + i));
	}
}
}
	
