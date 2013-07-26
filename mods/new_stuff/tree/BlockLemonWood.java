package mods.new_stuff.tree;

import java.util.List;
import java.util.Random;

import mods.new_stuff.common.New_Stuff;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

import com.jcraft.jorbis.Block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLemonWood extends BlockRotatedPillar
{
    /** The type of tree this log came from. */
    public static final String[] LemonwoodType = new String[] {"Lemon"};
    @SideOnly(Side.CLIENT)
    private Icon[] field_111052_c;
    @SideOnly(Side.CLIENT)
    private Icon[] tree_top;
	private int blockIndexInTexture;
	private int field_94394_cP;

    public BlockLemonWood(int par1)
    {
        super(par1, Material.wood);
        this.blockIndexInTexture = 1;
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random par1Random)
    {
        return 1;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return this.blockID;
    }

    /**
     * ejects contained items into the world, and notifies neighbors of an update, as appropriate
     */
   

    @SideOnly(Side.CLIENT)
    protected Icon func_111048_c(int par1)
    {
        return this.field_111052_c[par1];
    }

    @SideOnly(Side.CLIENT)
    protected Icon func_111049_d(int par1)
    {
        return this.tree_top[par1];
    }

    /**
     * returns a number between 0 and 3
     */
    public static int limitToValidMetadata(int par0)
    {
        return par0 & 3;
    }

    @SideOnly(Side.CLIENT)

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(new ItemStack(par1, 1, 0));
        
    }



    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.field_111052_c = new Icon[LemonwoodType.length];
        this.tree_top = new Icon[LemonwoodType.length];
        
        for (int i = 0; i < this.field_111052_c.length; ++i)
        {
            this.field_111052_c[i] = par1IconRegister.registerIcon("new_stuff:LemonWood_side");
            this.tree_top[i] = par1IconRegister.registerIcon("new_stuff:LemonWood_top");
        }
    }

    

    @Override
    public boolean canSustainLeaves(World world, int x, int y, int z)
    {
        return true;
    }

    @Override
    public boolean isWood(World world, int x, int y, int z)
    {
        return true;
    }
}
