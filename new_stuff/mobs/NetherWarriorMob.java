package mods.new_stuff.mobs;

import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.world.World;

public class NetherWarriorMob extends EntityMob {

	private String texture;
	public NetherWarriorMob(World par1World) {
		super(par1World);
this.texture = "new_stuff:NetherWarriorMob";
this.getNavigator().setBreakDoors(true);
this.getNavigator().setAvoidsWater(true);
this.tasks.addTask(0, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
this.tasks.addTask(1, new EntityAIWander(this, 1F));
this.tasks.addTask(2, new EntityAILookIdle(this));
this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
this.tasks.addTask(7, new EntityAILookIdle(this));
	this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
	this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
	 this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityVillager.class, 0, false));
	this.setAIMoveSpeed(3F) ;
this.setCanPickUpLoot(onGround);	
this.setEntityHealth(60);
	
		}
	 public boolean IsAIEnabled(){
	 	return true;
	}
	 	public EnumCreatureAttribute getCreatureAttribute(){
	 		return EnumCreatureAttribute.UNDEAD;
	 	}
	 	


}