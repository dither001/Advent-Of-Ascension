package net.tslat.aoa3.entity.projectiles.blaster;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;
import net.tslat.aoa3.entity.projectiles.staff.BaseEnergyShot;
import net.tslat.aoa3.item.weapon.EnergyProjectileWeapon;

public class EntityIceShot extends BaseEnergyShot {
	public EntityIceShot(World world) {
		super(world);
	}

	public EntityIceShot(EntityLivingBase shooter, EnergyProjectileWeapon weapon, int maxAge) {
		super(shooter, weapon, maxAge);
	}

	public EntityIceShot(World world, double x, double y, double z) {
		super(world, x, y, z);
	}
}
