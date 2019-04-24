package net.tslat.aoa3.client.model.entities.mobs.lunalus;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelRefluct extends ModelBase {
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer head2;
	ModelRenderer head3;
	ModelRenderer head4;
	ModelRenderer head5;
	ModelRenderer head6;
	ModelRenderer head7;
	ModelRenderer head8;
	ModelRenderer head9;
	ModelRenderer head10;
	ModelRenderer head11;
	ModelRenderer rightleg2;
	ModelRenderer leftleg2;
	ModelRenderer leftarm3;
	ModelRenderer rightarm3;
	ModelRenderer head12;
	ModelRenderer leftarm2;
	ModelRenderer rightarm2;
	ModelRenderer leftarm4;
	ModelRenderer rightarm4;
	ModelRenderer rightleg3;
	ModelRenderer leftleg3;
	ModelRenderer rightleg4;
	ModelRenderer leftleg4;

	public ModelRefluct() {
		textureWidth = 64;
		textureHeight = 64;
		(head = new ModelRenderer(this, 12, 44)).addBox(0.0f, 0.0f, -4.0f, 4, 18, 1);
		head.setRotationPoint(0.0f, 0.0f, 0.0f);
		head.setTextureSize(64, 64);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 16, 16)).addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4);
		body.setRotationPoint(0.0f, 0.0f, 0.0f);
		body.setTextureSize(64, 64);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(rightarm = new ModelRenderer(this, 29, 53)).addBox(-0.5f, 8.0f, -4.5f, 1, 3, 7);
		rightarm.setRotationPoint(-5.0f, 2.0f, 0.0f);
		rightarm.setTextureSize(64, 64);
		rightarm.mirror = true;
		setRotation(rightarm, 0.0f, 0.0f, 0.0f);
		(leftarm = new ModelRenderer(this, 29, 53)).addBox(1.5f, 8.0f, -4.5f, 1, 3, 7);
		leftarm.setRotationPoint(5.0f, 2.0f, 0.0f);
		leftarm.setTextureSize(64, 64);
		leftarm.mirror = true;
		setRotation(leftarm, 0.0f, 0.0f, 0.0f);
		(rightleg = new ModelRenderer(this, 33, 54)).addBox(0.5f, 9.5f, -6.0f, 1, 2, 4);
		rightleg.setRotationPoint(-2.0f, 12.0f, 0.0f);
		rightleg.setTextureSize(64, 64);
		rightleg.mirror = true;
		setRotation(rightleg, 0.0f, 0.0f, 0.0f);
		(leftleg = new ModelRenderer(this, 33, 54)).addBox(0.5f, 9.5f, -6.0f, 1, 2, 4);
		leftleg.setRotationPoint(2.0f, 12.0f, 0.0f);
		leftleg.setTextureSize(64, 64);
		leftleg.mirror = true;
		setRotation(leftleg, 0.0f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 25, 2)).addBox(-1.0f, -5.0f, -5.0f, 2, 1, 1);
		head2.setRotationPoint(0.0f, 0.0f, 0.0f);
		head2.setTextureSize(64, 64);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		(head3 = new ModelRenderer(this, 0, 34)).addBox(-4.0f, 0.0f, -4.0f, 4, 18, 1);
		head3.setRotationPoint(0.0f, 0.0f, 0.0f);
		head3.setTextureSize(64, 64);
		head3.mirror = true;
		setRotation(head3, 0.0f, 0.0f, 0.0f);
		(head4 = new ModelRenderer(this, 37, 41)).addBox(-4.5f, -5.0f, 3.0f, 9, 1, 4);
		head4.setRotationPoint(0.0f, 0.0f, 0.0f);
		head4.setTextureSize(64, 64);
		head4.mirror = true;
		setRotation(head4, 0.0f, 0.0f, 0.0f);
		(head5 = new ModelRenderer(this, 25, 5)).addBox(-2.0f, -4.0f, -5.0f, 4, 1, 1);
		head5.setRotationPoint(0.0f, 0.0f, 0.0f);
		head5.setTextureSize(64, 64);
		head5.mirror = true;
		setRotation(head5, 0.0f, 0.0f, 0.0f);
		(head6 = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8);
		head6.setRotationPoint(0.0f, 0.0f, 0.0f);
		head6.setTextureSize(64, 64);
		head6.mirror = true;
		setRotation(head6, 0.0f, 0.0f, 0.0f);
		(head7 = new ModelRenderer(this, 33, 5)).addBox(-3.5f, -8.6f, -1.0f, 7, 1, 8);
		head7.setRotationPoint(0.0f, 0.0f, 0.0f);
		head7.setTextureSize(64, 64);
		head7.mirror = true;
		setRotation(head7, 0.0f, 0.0f, 0.0f);
		(head8 = new ModelRenderer(this, 36, 47)).addBox(-5.0f, -1.4f, 3.0f, 10, 1, 4);
		head8.setRotationPoint(0.0f, 0.0f, 0.0f);
		head8.setTextureSize(64, 64);
		head8.mirror = true;
		setRotation(head8, 0.0f, 0.0f, 0.0f);
		(head9 = new ModelRenderer(this, 37, 0)).addBox(-4.0f, -6.2f, 4.0f, 8, 1, 3);
		head9.setRotationPoint(0.0f, 0.0f, 0.0f);
		head9.setTextureSize(64, 64);
		head9.mirror = true;
		setRotation(head9, 0.0f, 0.0f, 0.0f);
		(head10 = new ModelRenderer(this, 37, 41)).addBox(-4.5f, -3.8f, 3.0f, 9, 1, 4);
		head10.setRotationPoint(0.0f, 0.0f, 0.0f);
		head10.setTextureSize(64, 64);
		head10.mirror = true;
		setRotation(head10, 0.0f, 0.0f, 0.0f);
		(head11 = new ModelRenderer(this, 37, 0)).addBox(-4.0f, -7.4f, 4.0f, 8, 1, 3);
		head11.setRotationPoint(0.0f, 0.0f, 0.0f);
		head11.setTextureSize(64, 64);
		head11.mirror = true;
		setRotation(head11, 0.0f, 0.0f, 0.0f);
		(rightleg2 = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4);
		rightleg2.setRotationPoint(-2.0f, 12.0f, 0.0f);
		rightleg2.setTextureSize(64, 64);
		rightleg2.mirror = true;
		setRotation(rightleg2, 0.0f, 0.0f, 0.0f);
		(leftleg2 = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4);
		leftleg2.setRotationPoint(2.0f, 12.0f, 0.0f);
		leftleg2.setTextureSize(64, 64);
		leftleg2.mirror = true;
		setRotation(leftleg2, 0.0f, 0.0f, 0.0f);
		(leftarm3 = new ModelRenderer(this, 40, 16)).addBox(-1.0f, -2.0f, -2.0f, 4, 12, 4);
		leftarm3.setRotationPoint(5.0f, 2.0f, 0.0f);
		leftarm3.setTextureSize(64, 64);
		leftarm3.mirror = true;
		setRotation(leftarm3, 0.0f, 0.0f, 0.0f);
		(rightarm3 = new ModelRenderer(this, 40, 16)).addBox(-3.0f, -2.0f, -2.0f, 4, 12, 4);
		rightarm3.setRotationPoint(-5.0f, 2.0f, 0.0f);
		rightarm3.setTextureSize(64, 64);
		rightarm3.mirror = true;
		setRotation(rightarm3, 0.0f, 0.0f, 0.0f);
		(head12 = new ModelRenderer(this, 36, 47)).addBox(-5.0f, -2.6f, 3.0f, 10, 1, 4);
		head12.setRotationPoint(0.0f, 0.0f, 0.0f);
		head12.setTextureSize(64, 64);
		head12.mirror = true;
		setRotation(head12, 0.0f, 0.0f, 0.0f);
		(leftarm2 = new ModelRenderer(this, 40, 33)).addBox(-1.0f, 6.0f, -4.0f, 4, 4, 2);
		leftarm2.setRotationPoint(5.0f, 2.0f, 0.0f);
		leftarm2.setTextureSize(64, 64);
		leftarm2.mirror = true;
		setRotation(leftarm2, 0.0f, 0.0f, 0.0f);
		(rightarm2 = new ModelRenderer(this, 40, 33)).addBox(-3.0f, 6.0f, -4.0f, 4, 4, 2);
		rightarm2.setRotationPoint(-5.0f, 2.0f, 0.0f);
		rightarm2.setTextureSize(64, 64);
		rightarm2.mirror = true;
		setRotation(rightarm2, 0.0f, 0.0f, 0.0f);
		(leftarm4 = new ModelRenderer(this, 29, 53)).addBox(-0.5f, 8.0f, -4.5f, 1, 3, 7);
		leftarm4.setRotationPoint(5.0f, 2.0f, 0.0f);
		leftarm4.setTextureSize(64, 64);
		leftarm4.mirror = true;
		setRotation(leftarm4, 0.0f, 0.0f, 0.0f);
		(rightarm4 = new ModelRenderer(this, 29, 53)).addBox(-2.5f, 8.0f, -4.5f, 1, 3, 7);
		rightarm4.setRotationPoint(-5.0f, 2.0f, 0.0f);
		rightarm4.setTextureSize(64, 64);
		rightarm4.mirror = true;
		setRotation(rightarm4, 0.0f, 0.0f, 0.0f);
		(rightleg3 = new ModelRenderer(this, 12, 33)).addBox(-2.0f, 10.0f, -5.0f, 4, 2, 3);
		rightleg3.setRotationPoint(-2.0f, 12.0f, 0.0f);
		rightleg3.setTextureSize(64, 64);
		rightleg3.mirror = true;
		setRotation(rightleg3, 0.0f, 0.0f, 0.0f);
		(leftleg3 = new ModelRenderer(this, 12, 33)).addBox(-2.0f, 10.0f, -5.0f, 4, 2, 3);
		leftleg3.setRotationPoint(2.0f, 12.0f, 0.0f);
		leftleg3.setTextureSize(64, 64);
		leftleg3.mirror = true;
		setRotation(leftleg3, 0.0f, 0.0f, 0.0f);
		(rightleg4 = new ModelRenderer(this, 33, 54)).addBox(-1.5f, 9.5f, -6.0f, 1, 2, 4);
		rightleg4.setRotationPoint(-2.0f, 12.0f, 0.0f);
		rightleg4.setTextureSize(64, 64);
		rightleg4.mirror = true;
		setRotation(rightleg4, 0.0f, 0.0f, 0.0f);
		(leftleg4 = new ModelRenderer(this, 33, 54)).addBox(-1.5f, 9.5f, -6.0f, 1, 2, 4);
		leftleg4.setRotationPoint(2.0f, 12.0f, 0.0f);
		leftleg4.setTextureSize(64, 64);
		leftleg4.mirror = true;
		setRotation(leftleg4, 0.0f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		head.render(par7);
		body.render(par7);
		rightarm.render(par7);
		leftarm.render(par7);
		rightleg.render(par7);
		leftleg.render(par7);
		head2.render(par7);
		head3.render(par7);
		head4.render(par7);
		head5.render(par7);
		head6.render(par7);
		head7.render(par7);
		head8.render(par7);
		head9.render(par7);
		head10.render(par7);
		head11.render(par7);
		rightleg2.render(par7);
		leftleg2.render(par7);
		leftarm3.render(par7);
		rightarm3.render(par7);
		head12.render(par7);
		leftarm2.render(par7);
		rightarm2.render(par7);
		leftarm4.render(par7);
		rightarm4.render(par7);
		rightleg3.render(par7);
		leftleg3.render(par7);
		rightleg4.render(par7);
		leftleg4.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		rightarm.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm.rotateAngleZ = 0.0f;
		rightarm2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm2.rotateAngleZ = 0.0f;
		rightarm3.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm3.rotateAngleZ = 0.0f;
		rightarm4.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm4.rotateAngleZ = 0.0f;
		leftarm.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm.rotateAngleZ = 0.0f;
		leftarm2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm2.rotateAngleZ = 0.0f;
		leftarm3.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm3.rotateAngleZ = 0.0f;
		leftarm4.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm4.rotateAngleZ = 0.0f;
		rightleg.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		rightleg.rotateAngleY = 0.0f;
		rightleg2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		rightleg2.rotateAngleY = 0.0f;
		rightleg3.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		rightleg3.rotateAngleY = 0.0f;
		rightleg4.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		rightleg4.rotateAngleY = 0.0f;
		leftleg.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leftleg2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leftleg3.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leftleg4.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
	}
}
