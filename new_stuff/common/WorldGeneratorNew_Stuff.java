package mods.new_stuff.common;

import java.util.Random;

import mods.new_stuff.biome.VolcanicWasteland;
import mods.new_stuff.tree.WorldGenLemonTrees;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenJungle;
import net.minecraft.world.biome.BiomeGenRiver;
import net.minecraft.world.biome.BiomeGenSwamp;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorNew_Stuff implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
			
		}
	}

	private void generateEnd(World world, Random random, int chunkX, int chunkZ) {
		for(int i = 0; i < 5; i++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(55);
			int zCoord = chunkZ + random.nextInt(16);
			 
			(new WorldGenMinable(New_Stuff.EndDiamondOre.blockID, 12, Block.whiteStone.blockID)).generate(world, random, xCoord, yCoord, zCoord);
		}
		
		for(int i = 0; i < 6; i++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(55);
			int zCoord = chunkZ + random.nextInt(16);
			 
			(new WorldGenMinable(New_Stuff.EnderiteOre.blockID, 15, Block.whiteStone.blockID)).generate(world, random, xCoord, yCoord, zCoord);
	
		}
	}		

	private void generateSurface(World world, Random random, int chunkX, int chunkZ) {
		for(int i = 0; i < 5; i++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(30);
			int zCoord = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(New_Stuff.TitaniumOre.blockID, 2)).generate(world, random, xCoord, yCoord, zCoord);
		
		}		
		{
		
		}
		for(int i = 0; i < 8; i++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(50);
			int zCoord = chunkZ + random.nextInt(16);
			
			(new WorldGenMinable(New_Stuff.NickelOre.blockID, 7)).generate(world, random, xCoord, yCoord, zCoord);
		}
		
		
			for(int i = 0; i < 3; i++){
				int xCoord = chunkX + random.nextInt(16);
				int yCoord = random.nextInt(15);
				int zCoord = chunkZ + random.nextInt(16);
				
				(new WorldGenMinable(New_Stuff.UraniumOre.blockID, 2)).generate(world,  random, xCoord, yCoord, zCoord);}
	
		
	
			for(int i = 0; i < 2; i++){
				int xCoord = chunkX + random.nextInt(16);
				int yCoord = random.nextInt(17);
				int zCoord = chunkZ + random.nextInt(16);
				
				(new WorldGenMinable(New_Stuff.AmethystOre.blockID, 3)).generate(world, random, xCoord, yCoord, zCoord);} 
			
			
			
			
			BiomeGenBase biome1 = world.getWorldChunkManager().getBiomeGenAt(chunkX, chunkZ);
			if ( (biome1 instanceof VolcanicWasteland))
			for(int i1 = 0; i1 <6; i1++){
				int xCoord2 = chunkX + random.nextInt(16);
				int yCoord2 = random.nextInt(100);
				int zCoord2 = chunkZ + random.nextInt(16);
				
				(new WorldGenMinable(New_Stuff.PyroclasticMaterial.blockID, 20)).generate(world, random, xCoord2, yCoord2, zCoord2);} 
		
			BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(chunkX, chunkZ);
			if ( (biome instanceof BiomeGenJungle) || (biome instanceof BiomeGenRiver))
			for(int i11 = 0; i11 <6; i11++){
				int xCoord1 = chunkX + random.nextInt(16);
				int yCoord1 = random.nextInt(90);
				int zCoord1 = chunkZ + random.nextInt(16);
				
				(new WorldGenLemonTrees(false, 14, 0, 0, false)).generate(world, random , xCoord1, yCoord1, zCoord1);
				
			
			for(int i = 0; i < 5; i++){
				int xCoord = chunkX + random.nextInt(16);
				int yCoord = random.nextInt(48);
				int zCoord = chunkZ + random.nextInt(16);
				
				(new WorldGenMinable(New_Stuff.RubyOre.blockID, 3)).generate(world, random, xCoord, yCoord, zCoord);}		
		
			for(int i = 0; i < 8; i++){
				int xCoord = chunkX + random.nextInt(16);
				int yCoord = random.nextInt(48);
				int zCoord = chunkZ + random.nextInt(16);
			
				(new WorldGenMinable(New_Stuff.AluminumOre.blockID, 6)).generate(world, random, xCoord, yCoord, zCoord);}}}
	
	
		
	

	private void generateNether(World world, Random random, int chunkX, int chunkZ) {
		for(int i = 0; i < 7; i++){
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(120);
			int zCoord = chunkZ + random.nextInt(16);
			 
			(new WorldGenMinable(New_Stuff.NetherGoldOre.blockID, 14, Block.netherrack.blockID)).generate(world, random, xCoord, yCoord, zCoord);
	}
	
		
}
	
}
