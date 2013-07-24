package mods.new_stuff.biome;

import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class Glacier extends BiomeGenBase{

	public Glacier(int par1) {
		super(par1);
		this.topBlock = (byte) Block.snow.blockID;
		this.fillerBlock = (byte) Block.ice.blockID;
		this.setMinMaxHeight(1.7F, 1.7F);
		this.theBiomeDecorator.ironGen = new WorldGenMinable(Block.oreIron.blockID, 10);;
		this.theBiomeDecorator.diamondGen = new WorldGenMinable(Block.oreDiamond.blockID, 6);;
		this.spawnableMonsterList.add(new SpawnListEntry(EntityCreeper.class, 2, 5, 9));
		this.setEnableSnow();
		this.theBiomeDecorator.coalGen = new WorldGenMinable(Block.oreCoal.blockID, 10);;
		this.spawnableMonsterList.add(new SpawnListEntry(EntitySkeleton.class, 2, 1, 3 ));
		
	}

}
