package net.tslat.aoa3.client.render.entities.boss.skeletalarmy;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.tslat.aoa3.client.gui.render.BossBarRenderer;
import net.tslat.aoa3.client.model.entities.boss.skeletalarmy.ModelSkeletron;
import net.tslat.aoa3.entity.boss.skeletalarmy.EntitySkeletron;

import javax.annotation.Nullable;

@SideOnly(Side.CLIENT)
public class SkeletronRenderer extends RenderLiving<EntitySkeletron> {
	private final ResourceLocation texture;

	public SkeletronRenderer(RenderManager renderManager, final ResourceLocation resource) {
		super(renderManager, new ModelSkeletron(), EntitySkeletron.entityWidth / 3);
		texture = resource;
	}

	@Override
	public void doRender(EntitySkeletron entity, double x, double y, double z, float entityYaw, float partialTicks) {
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
		BossBarRenderer.boss = entity;
	}

	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(EntitySkeletron entity) {
		return texture;
	}
}