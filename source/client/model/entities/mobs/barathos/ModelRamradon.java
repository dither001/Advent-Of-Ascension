package net.tslat.aoa3.client.model.entities.mobs.barathos;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelRamradon extends ModelBase {
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer leg1;
	ModelRenderer leg2;
	ModelRenderer leg3;
	ModelRenderer leg4;
	ModelRenderer body2;
	ModelRenderer body3;
	ModelRenderer body4;
	ModelRenderer head2;
	ModelRenderer head3;
	ModelRenderer head4;
	ModelRenderer head5;
	ModelRenderer head6;
	ModelRenderer head7;
	ModelRenderer head8;
	ModelRenderer head9;

	public ModelRamradon() {
		textureWidth = 256;
		textureHeight = 32;
		(head = new ModelRenderer(this, 225, 0)).addBox(5.5f, -8.0f, 8.0f, 2, 2, 6);
		head.setRotationPoint(0.0f, 12.0f, -7.0f);
		head.setTextureSize(256, 32);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 43, 19)).addBox(-5.0f, -7.0f, 3.0f, 10, 5, 8);
		body.setRotationPoint(0.0f, 16.0f, 1.0f);
		body.setTextureSize(256, 32);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(leg1 = new ModelRenderer(this, 20, 18)).addBox(-3.0f, 0.0f, -2.0f, 4, 10, 4);
		leg1.setRotationPoint(-6.0f, 14.0f, 17.0f);
		leg1.setTextureSize(256, 32);
		leg1.mirror = true;
		setRotation(leg1, 0.0f, 0.0f, 0.0f);
		(leg2 = new ModelRenderer(this, 20, 18)).addBox(-1.0f, 0.0f, -2.0f, 4, 10, 4);
		leg2.setRotationPoint(6.0f, 14.0f, 15.0f);
		leg2.setTextureSize(256, 32);
		leg2.mirror = true;
		setRotation(leg2, 0.0f, 0.0f, 0.0f);
		(leg3 = new ModelRenderer(this, 0, 16)).addBox(-3.0f, 0.0f, -3.0f, 4, 8, 4);
		leg3.setRotationPoint(-3.0f, 16.0f, -2.0f);
		leg3.setTextureSize(256, 32);
		leg3.mirror = true;
		setRotation(leg3, 0.0f, 0.0f, 0.0f);
		(leg4 = new ModelRenderer(this, 0, 16)).addBox(-1.0f, 0.0f, -3.0f, 4, 8, 4);
		leg4.setRotationPoint(3.0f, 16.0f, -2.0f);
		leg4.setTextureSize(256, 32);
		leg4.mirror = true;
		setRotation(leg4, 0.0f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 83, 0)).addBox(-7.0f, -8.0f, -7.0f, 14, 8, 8);
		body2.setRotationPoint(0.0f, 16.0f, 1.0f);
		body2.setTextureSize(256, 32);
		body2.mirror = true;
		setRotation(body2, 0.3717861f, 0.0f, 0.0f);
		(body3 = new ModelRenderer(this, 40, 4)).addBox(-6.0f, -7.0f, -3.0f, 12, 6, 8);
		body3.setRotationPoint(0.0f, 16.0f, 13.0f);
		body3.setTextureSize(256, 32);
		body3.mirror = true;
		setRotation(body3, -0.1099557f, 0.0f, 0.0f);
		(body4 = new ModelRenderer(this, 87, 18)).addBox(-6.0f, -7.0f, -3.0f, 12, 6, 8);
		body4.setRotationPoint(0.0f, 16.0f, 1.0f);
		body4.setTextureSize(256, 32);
		body4.mirror = true;
		setRotation(body4, 0.1115358f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -4.0f, -6.0f, 8, 8, 6);
		head2.setRotationPoint(0.0f, 12.0f, -7.0f);
		head2.setTextureSize(256, 32);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		(head3 = new ModelRenderer(this, 225, 0)).addBox(-7.5f, -8.0f, 8.0f, 2, 2, 6);
		head3.setRotationPoint(0.0f, 12.0f, -7.0f);
		head3.setTextureSize(256, 32);
		head3.mirror = true;
		setRotation(head3, 0.0f, 0.0f, 0.0f);
		(head4 = new ModelRenderer(this, 200, 0)).addBox(5.0f, -7.5f, 4.0f, 3, 3, 6);
		head4.setRotationPoint(0.0f, 12.0f, -7.0f);
		head4.setTextureSize(256, 32);
		head4.mirror = true;
		setRotation(head4, 0.0872665f, 0.0f, 0.0f);
		(head5 = new ModelRenderer(this, 200, 0)).addBox(-8.0f, -7.5f, 4.0f, 3, 3, 6);
		head5.setRotationPoint(0.0f, 12.0f, -7.0f);
		head5.setTextureSize(256, 32);
		head5.mirror = true;
		setRotation(head5, 0.0872665f, 0.0f, 0.0f);
		(head6 = new ModelRenderer(this, 134, 0)).addBox(4.0f, -6.0f, -4.0f, 5, 5, 6);
		head6.setRotationPoint(0.0f, 12.0f, -7.0f);
		head6.setTextureSize(256, 32);
		head6.mirror = true;
		setRotation(head6, 0.5235988f, 0.0f, 0.0f);
		(head7 = new ModelRenderer(this, 134, 0)).addBox(-9.0f, -6.0f, -4.0f, 5, 5, 6);
		head7.setRotationPoint(0.0f, 12.0f, -7.0f);
		head7.setTextureSize(256, 32);
		head7.mirror = true;
		setRotation(head7, 0.5235988f, 0.0f, 0.0f);
		(head8 = new ModelRenderer(this, 170, 0)).addBox(4.5f, -5.5f, 1.0f, 4, 4, 6);
		head8.setRotationPoint(0.0f, 12.0f, -7.0f);
		head8.setTextureSize(256, 32);
		head8.mirror = true;
		setRotation(head8, 0.5235988f, 0.0f, 0.0f);
		(head9 = new ModelRenderer(this, 170, 0)).addBox(-8.5f, -5.5f, 1.0f, 4, 4, 6);
		head9.setRotationPoint(0.0f, 12.0f, -7.0f);
		head9.setTextureSize(256, 32);
		head9.mirror = true;
		setRotation(head9, 0.5235988f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		head.render(par7);
		body.render(par7);
		leg1.render(par7);
		leg2.render(par7);
		leg3.render(par7);
		leg4.render(par7);
		body2.render(par7);
		body3.render(par7);
		body4.render(par7);
		head2.render(par7);
		head3.render(par7);
		head4.render(par7);
		head5.render(par7);
		head6.render(par7);
		head7.render(par7);
		head8.render(par7);
		head9.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		leg1.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg3.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg4.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
	}
}
