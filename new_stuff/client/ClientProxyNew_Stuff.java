package mods.new_stuff.client;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.new_stuff.common.CommonProxyNew_Stuff;
import mods.new_stuff.explosive.EntityPrimedNuclearExplosive;

public class ClientProxyNew_Stuff extends CommonProxyNew_Stuff{
	
	@Override
	public void registerRenderInformation(){
		}	
	public static int addArmor(String armor)
	{
	  return ModLoader.addArmor(armor);
	}
	}

            
		
