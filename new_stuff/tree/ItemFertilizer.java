package mods.new_stuff.tree;

import mods.new_stuff.common.New_Stuff;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.BonemealEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.src.*;

public class ItemFertilizer extends Item
{
		

		public ItemFertilizer(int par1) {
		super(par1);

	}

		@ForgeSubscribe
        public void onUseBonemeal(BonemealEvent event)
        {
                if (event.ID == New_Stuff.LemonSapling.blockID)
                {
                        if (!event.world.isRemote)
                        {
                                ((BlockLemonSapling)New_Stuff.LemonSapling).growTree(event.world, event.X, event.Y, event.Z, event.world.rand);
                        }
                }

        }


}