package mods.new_stuff.armor;


import mods.new_stuff.common.New_Stuff;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;



public class ItemRubyHelmet extends ItemArmor{
public ItemRubyHelmet(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4){
super(par1, par2EnumArmorMaterial, par3, par4);
setMaxStackSize(1);
this.setCreativeTab(CreativeTabs.tabCombat);
}

public void registerIcons(IconRegister reg){
	this.itemIcon = reg.registerIcon("new_stuff:RubyHelmet");
}

public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer)
{
if(itemID == New_Stuff.RubyHelmet.itemID || itemID == New_Stuff.RubyChestplate.itemID || itemID == New_Stuff.RubyBoots.itemID)
{
return "new_stuff:textures/models/armor/ruby_layer_1.png";
}
if(itemID == New_Stuff.RubyLeggings.itemID)
{
return "new_stuff:textures/models/armor/ruby_layer_2.png";
}
else return null;
}
}