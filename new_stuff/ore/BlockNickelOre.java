package mods.new_stuff.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockNickelOre extends Block{
	
	public BlockNickelOre(int id, Material mat){
		super(id, mat);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
	@Override
	public void registerIcons(IconRegister reg){
		this.blockIcon = reg.registerIcon("new_stuff:NickelOre");
	}

}