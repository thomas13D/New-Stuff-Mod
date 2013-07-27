package mods.new_stuff.armor;



import mods.new_stuff.common.New_Stuff;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;



public class ItemSuperAlloyHelmet extends ItemArmor
 {
public ItemSuperAlloyHelmet(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4){
super(par1, par2EnumArmorMaterial, par3, par4);
setMaxStackSize(1);
this.setCreativeTab(CreativeTabs.tabCombat);
}

public void registerIcons(IconRegister reg){
	this.itemIcon = reg.registerIcon("new_stuff:SuperAlloyHelmet");
}

public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer)
{
if(itemID == New_Stuff.SuperAlloyHelmet.itemID || itemID == New_Stuff.SuperAlloyChestplate.itemID || itemID == New_Stuff.SuperAlloyBoots.itemID)
{
return "new_stuff:textures/models/armor/superalloy_layer_1.png";
}
if(itemID == New_Stuff.SuperAlloyLeggings.itemID)
{
return "new_stuff:textures/models/armor/superalloy_layer_2.png";
}
else return null;
}
}