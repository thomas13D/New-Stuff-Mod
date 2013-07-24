package mods.new_stuff.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;

public class ItemLemonade extends ItemFood{

	public ItemLemonade(int par1, int par2, boolean par3) {
		super(par1, par2, par3);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg){
		this.itemIcon = reg.registerIcon("new_stuff:Lemonade");

}
}
