package mods.new_stuff.common;

import static cpw.mods.fml.relauncher.Side.CLIENT;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.src.ModLoader;
import mods.new_stuff.armor.ItemAluminumBoots;
import mods.new_stuff.armor.ItemAluminumChestplate;
import mods.new_stuff.armor.ItemAluminumHelmet;
import mods.new_stuff.armor.ItemAluminumLeggings;
import mods.new_stuff.armor.ItemEnderiteBoots;
import mods.new_stuff.armor.ItemEnderiteChestplate;
import mods.new_stuff.armor.ItemEnderiteHelmet;
import mods.new_stuff.armor.ItemEnderiteLeggings;
import mods.new_stuff.armor.ItemNickelBoots;
import mods.new_stuff.armor.ItemNickelChestplate;
import mods.new_stuff.armor.ItemNickelHelmet;
import mods.new_stuff.armor.ItemNickelLeggings;
import mods.new_stuff.armor.ItemRubyBoots;
import mods.new_stuff.armor.ItemRubyChestplate;
import mods.new_stuff.armor.ItemRubyHelmet;
import mods.new_stuff.armor.ItemRubyLeggings;
import mods.new_stuff.armor.ItemStoneBoots;
import mods.new_stuff.armor.ItemStoneChestplate;
import mods.new_stuff.armor.ItemStoneHelmet;
import mods.new_stuff.armor.ItemStoneLeggings;
import mods.new_stuff.armor.ItemSuperAlloyBoots;
import mods.new_stuff.armor.ItemSuperAlloyChestplate;
import mods.new_stuff.armor.ItemSuperAlloyHelmet;
import mods.new_stuff.armor.ItemSuperAlloyLeggings;
import mods.new_stuff.armor.ItemTitaniumBoots;
import mods.new_stuff.armor.ItemTitaniumChestplate;
import mods.new_stuff.armor.ItemTitaniumHelmet;
import mods.new_stuff.armor.ItemTitaniumLeggings;
import mods.new_stuff.explosive.BlockNuclearExplosive;

public class CommonProxyNew_Stuff {
	
	public void registerRenderInformation(){
		ModLoader.addArmor(toString());
	}
	
	
    public static int addArmor(String armor)
    {
        return RenderingRegistry.addNewArmourRendererPrefix(armor);
    }
		
		}
