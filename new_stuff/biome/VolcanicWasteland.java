package mods.new_stuff.biome;

import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class VolcanicWasteland extends BiomeGenBase{

	public VolcanicWasteland(int par1) {
		super(par1);
		this.topBlock = (byte) Block.stone.blockID;
		this.fillerBlock = (byte) Block.lavaMoving.blockID;
		this.setMinMaxHeight(0.1F, 0.41F);
		this.theBiomeDecorator.deadBushPerChunk = 30;
		this.theBiomeDecorator.ironGen = new WorldGenMinable(Block.oreIron.blockID, 10);;
		this.theBiomeDecorator.diamondGen = new WorldGenMinable(Block.oreDiamond.blockID, 6);;
		this.spawnableMonsterList.add(new SpawnListEntry(EntityCreeper.class, 2, 5, 9));
		this.canSpawnLightningBolt();
		this.theBiomeDecorator.coalGen = new WorldGenMinable(Block.oreCoal.blockID, 10);;
		this.spawnableMonsterList.add(new SpawnListEntry(EntitySkeleton.class, 2, 1, 3 ));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityBlaze.class, 3, 1, 3));
		
	}

}
