package net.tslat.aoa3.structure.barathos;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class BaronRock5 extends AoAStructure { //StructureSize: 10x11x11
	private static final IBlockState baronStone = BlockRegister.stoneBaron.getDefaultState();
	private static final IBlockState baronGround = BlockRegister.baronGround.getDefaultState();

	public BaronRock5() {
		super("BaronRock5");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 0, 0, 3, baronGround);
		addBlock(world, basePos, 0, 0, 4, baronGround);
		addBlock(world, basePos, 0, 0, 5, baronGround);
		addBlock(world, basePos, 0, 0, 6, baronGround);
		addBlock(world, basePos, 0, 0, 7, baronGround);
		addBlock(world, basePos, 1, 0, 2, baronGround);
		addBlock(world, basePos, 1, 0, 3, baronStone);
		addBlock(world, basePos, 1, 0, 4, baronStone);
		addBlock(world, basePos, 1, 0, 5, baronStone);
		addBlock(world, basePos, 1, 0, 6, baronStone);
		addBlock(world, basePos, 1, 0, 7, baronStone);
		addBlock(world, basePos, 1, 0, 8, baronGround);
		addBlock(world, basePos, 2, 0, 1, baronGround);
		addBlock(world, basePos, 2, 0, 2, baronStone);
		addBlock(world, basePos, 2, 0, 3, baronStone);
		addBlock(world, basePos, 2, 0, 4, baronStone);
		addBlock(world, basePos, 2, 0, 5, baronStone);
		addBlock(world, basePos, 2, 0, 6, baronStone);
		addBlock(world, basePos, 2, 0, 7, baronStone);
		addBlock(world, basePos, 2, 0, 8, baronStone);
		addBlock(world, basePos, 2, 0, 9, baronGround);
		addBlock(world, basePos, 3, 0, 0, baronGround);
		addBlock(world, basePos, 3, 0, 1, baronStone);
		addBlock(world, basePos, 3, 0, 2, baronStone);
		addBlock(world, basePos, 3, 0, 3, baronStone);
		addBlock(world, basePos, 3, 0, 4, baronStone);
		addBlock(world, basePos, 3, 0, 5, baronStone);
		addBlock(world, basePos, 3, 0, 6, baronStone);
		addBlock(world, basePos, 3, 0, 7, baronStone);
		addBlock(world, basePos, 3, 0, 8, baronStone);
		addBlock(world, basePos, 3, 0, 9, baronStone);
		addBlock(world, basePos, 3, 0, 10, baronGround);
		addBlock(world, basePos, 4, 0, 0, baronGround);
		addBlock(world, basePos, 4, 0, 1, baronStone);
		addBlock(world, basePos, 4, 0, 2, baronStone);
		addBlock(world, basePos, 4, 0, 3, baronStone);
		addBlock(world, basePos, 4, 0, 4, baronStone);
		addBlock(world, basePos, 4, 0, 5, baronStone);
		addBlock(world, basePos, 4, 0, 6, baronStone);
		addBlock(world, basePos, 4, 0, 7, baronStone);
		addBlock(world, basePos, 4, 0, 8, baronStone);
		addBlock(world, basePos, 4, 0, 9, baronStone);
		addBlock(world, basePos, 4, 0, 10, baronGround);
		addBlock(world, basePos, 5, 0, 0, baronGround);
		addBlock(world, basePos, 5, 0, 1, baronStone);
		addBlock(world, basePos, 5, 0, 2, baronStone);
		addBlock(world, basePos, 5, 0, 3, baronStone);
		addBlock(world, basePos, 5, 0, 4, baronStone);
		addBlock(world, basePos, 5, 0, 5, baronStone);
		addBlock(world, basePos, 5, 0, 6, baronStone);
		addBlock(world, basePos, 5, 0, 7, baronStone);
		addBlock(world, basePos, 5, 0, 8, baronStone);
		addBlock(world, basePos, 5, 0, 9, baronStone);
		addBlock(world, basePos, 5, 0, 10, baronGround);
		addBlock(world, basePos, 6, 0, 0, baronGround);
		addBlock(world, basePos, 6, 0, 1, baronStone);
		addBlock(world, basePos, 6, 0, 2, baronStone);
		addBlock(world, basePos, 6, 0, 3, baronStone);
		addBlock(world, basePos, 6, 0, 4, baronStone);
		addBlock(world, basePos, 6, 0, 5, baronStone);
		addBlock(world, basePos, 6, 0, 6, baronStone);
		addBlock(world, basePos, 6, 0, 7, baronStone);
		addBlock(world, basePos, 6, 0, 8, baronStone);
		addBlock(world, basePos, 6, 0, 9, baronStone);
		addBlock(world, basePos, 6, 0, 10, baronGround);
		addBlock(world, basePos, 7, 0, 1, baronGround);
		addBlock(world, basePos, 7, 0, 2, baronStone);
		addBlock(world, basePos, 7, 0, 3, baronStone);
		addBlock(world, basePos, 7, 0, 4, baronStone);
		addBlock(world, basePos, 7, 0, 5, baronStone);
		addBlock(world, basePos, 7, 0, 6, baronStone);
		addBlock(world, basePos, 7, 0, 7, baronStone);
		addBlock(world, basePos, 7, 0, 8, baronStone);
		addBlock(world, basePos, 7, 0, 9, baronGround);
		addBlock(world, basePos, 8, 0, 3, baronGround);
		addBlock(world, basePos, 8, 0, 4, baronStone);
		addBlock(world, basePos, 8, 0, 5, baronStone);
		addBlock(world, basePos, 8, 0, 6, baronStone);
		addBlock(world, basePos, 8, 0, 7, baronStone);
		addBlock(world, basePos, 8, 0, 8, baronGround);
		addBlock(world, basePos, 9, 0, 4, baronGround);
		addBlock(world, basePos, 9, 0, 5, baronGround);
		addBlock(world, basePos, 9, 0, 6, baronGround);
		addBlock(world, basePos, 9, 0, 7, baronGround);
		addBlock(world, basePos, 1, 1, 3, baronStone);
		addBlock(world, basePos, 1, 1, 4, baronStone);
		addBlock(world, basePos, 1, 1, 5, baronStone);
		addBlock(world, basePos, 1, 1, 6, baronStone);
		addBlock(world, basePos, 1, 1, 7, baronStone);
		addBlock(world, basePos, 2, 1, 2, baronStone);
		addBlock(world, basePos, 2, 1, 3, baronStone);
		addBlock(world, basePos, 2, 1, 4, baronStone);
		addBlock(world, basePos, 2, 1, 5, baronStone);
		addBlock(world, basePos, 2, 1, 6, baronStone);
		addBlock(world, basePos, 2, 1, 7, baronStone);
		addBlock(world, basePos, 2, 1, 8, baronStone);
		addBlock(world, basePos, 2, 1, 9, baronGround);
		addBlock(world, basePos, 3, 1, 1, baronStone);
		addBlock(world, basePos, 3, 1, 2, baronStone);
		addBlock(world, basePos, 3, 1, 3, baronStone);
		addBlock(world, basePos, 3, 1, 4, baronStone);
		addBlock(world, basePos, 3, 1, 5, baronStone);
		addBlock(world, basePos, 3, 1, 6, baronStone);
		addBlock(world, basePos, 3, 1, 7, baronStone);
		addBlock(world, basePos, 3, 1, 8, baronStone);
		addBlock(world, basePos, 3, 1, 9, baronStone);
		addBlock(world, basePos, 4, 1, 1, baronStone);
		addBlock(world, basePos, 4, 1, 2, baronStone);
		addBlock(world, basePos, 4, 1, 3, baronStone);
		addBlock(world, basePos, 4, 1, 4, baronStone);
		addBlock(world, basePos, 4, 1, 5, baronStone);
		addBlock(world, basePos, 4, 1, 6, baronStone);
		addBlock(world, basePos, 4, 1, 7, baronStone);
		addBlock(world, basePos, 4, 1, 8, baronStone);
		addBlock(world, basePos, 4, 1, 9, baronStone);
		addBlock(world, basePos, 4, 1, 10, baronGround);
		addBlock(world, basePos, 5, 1, 1, baronStone);
		addBlock(world, basePos, 5, 1, 2, baronStone);
		addBlock(world, basePos, 5, 1, 3, baronStone);
		addBlock(world, basePos, 5, 1, 4, baronStone);
		addBlock(world, basePos, 5, 1, 5, baronStone);
		addBlock(world, basePos, 5, 1, 6, baronStone);
		addBlock(world, basePos, 5, 1, 7, baronStone);
		addBlock(world, basePos, 5, 1, 8, baronStone);
		addBlock(world, basePos, 5, 1, 9, baronStone);
		addBlock(world, basePos, 5, 1, 10, baronGround);
		addBlock(world, basePos, 6, 1, 1, baronStone);
		addBlock(world, basePos, 6, 1, 2, baronStone);
		addBlock(world, basePos, 6, 1, 3, baronStone);
		addBlock(world, basePos, 6, 1, 4, baronStone);
		addBlock(world, basePos, 6, 1, 5, baronStone);
		addBlock(world, basePos, 6, 1, 6, baronStone);
		addBlock(world, basePos, 6, 1, 7, baronStone);
		addBlock(world, basePos, 6, 1, 8, baronStone);
		addBlock(world, basePos, 6, 1, 9, baronGround);
		addBlock(world, basePos, 7, 1, 2, baronStone);
		addBlock(world, basePos, 7, 1, 3, baronStone);
		addBlock(world, basePos, 7, 1, 4, baronStone);
		addBlock(world, basePos, 7, 1, 5, baronStone);
		addBlock(world, basePos, 7, 1, 6, baronStone);
		addBlock(world, basePos, 7, 1, 7, baronStone);
		addBlock(world, basePos, 7, 1, 8, baronStone);
		addBlock(world, basePos, 8, 1, 4, baronStone);
		addBlock(world, basePos, 8, 1, 5, baronStone);
		addBlock(world, basePos, 8, 1, 6, baronStone);
		addBlock(world, basePos, 8, 1, 7, baronStone);
		addBlock(world, basePos, 1, 2, 3, baronGround);
		addBlock(world, basePos, 1, 2, 4, baronStone);
		addBlock(world, basePos, 1, 2, 5, baronStone);
		addBlock(world, basePos, 1, 2, 6, baronStone);
		addBlock(world, basePos, 2, 2, 2, baronStone);
		addBlock(world, basePos, 2, 2, 3, baronStone);
		addBlock(world, basePos, 2, 2, 4, baronStone);
		addBlock(world, basePos, 2, 2, 5, baronStone);
		addBlock(world, basePos, 2, 2, 6, baronStone);
		addBlock(world, basePos, 2, 2, 7, baronStone);
		addBlock(world, basePos, 2, 2, 8, baronStone);
		addBlock(world, basePos, 3, 2, 1, baronStone);
		addBlock(world, basePos, 3, 2, 2, baronStone);
		addBlock(world, basePos, 3, 2, 3, baronStone);
		addBlock(world, basePos, 3, 2, 4, baronStone);
		addBlock(world, basePos, 3, 2, 5, baronStone);
		addBlock(world, basePos, 3, 2, 6, baronStone);
		addBlock(world, basePos, 3, 2, 7, baronStone);
		addBlock(world, basePos, 3, 2, 8, baronStone);
		addBlock(world, basePos, 3, 2, 9, baronGround);
		addBlock(world, basePos, 4, 2, 1, baronStone);
		addBlock(world, basePos, 4, 2, 2, baronStone);
		addBlock(world, basePos, 4, 2, 3, baronStone);
		addBlock(world, basePos, 4, 2, 4, baronStone);
		addBlock(world, basePos, 4, 2, 5, baronStone);
		addBlock(world, basePos, 4, 2, 6, baronStone);
		addBlock(world, basePos, 4, 2, 7, baronStone);
		addBlock(world, basePos, 4, 2, 8, baronStone);
		addBlock(world, basePos, 4, 2, 9, baronStone);
		addBlock(world, basePos, 5, 2, 1, baronStone);
		addBlock(world, basePos, 5, 2, 2, baronStone);
		addBlock(world, basePos, 5, 2, 3, baronStone);
		addBlock(world, basePos, 5, 2, 4, baronStone);
		addBlock(world, basePos, 5, 2, 5, baronStone);
		addBlock(world, basePos, 5, 2, 6, baronStone);
		addBlock(world, basePos, 5, 2, 7, baronStone);
		addBlock(world, basePos, 5, 2, 8, baronStone);
		addBlock(world, basePos, 5, 2, 9, baronStone);
		addBlock(world, basePos, 6, 2, 1, baronStone);
		addBlock(world, basePos, 6, 2, 2, baronStone);
		addBlock(world, basePos, 6, 2, 3, baronStone);
		addBlock(world, basePos, 6, 2, 4, baronStone);
		addBlock(world, basePos, 6, 2, 5, baronStone);
		addBlock(world, basePos, 6, 2, 6, baronStone);
		addBlock(world, basePos, 6, 2, 7, baronStone);
		addBlock(world, basePos, 6, 2, 8, baronStone);
		addBlock(world, basePos, 7, 2, 2, baronStone);
		addBlock(world, basePos, 7, 2, 3, baronStone);
		addBlock(world, basePos, 7, 2, 4, baronStone);
		addBlock(world, basePos, 7, 2, 5, baronStone);
		addBlock(world, basePos, 7, 2, 6, baronStone);
		addBlock(world, basePos, 7, 2, 7, baronStone);
		addBlock(world, basePos, 7, 2, 8, baronStone);
		addBlock(world, basePos, 8, 2, 4, baronGround);
		addBlock(world, basePos, 8, 2, 5, baronStone);
		addBlock(world, basePos, 8, 2, 6, baronStone);
		addBlock(world, basePos, 8, 2, 7, baronStone);
		addBlock(world, basePos, 2, 3, 2, baronStone);
		addBlock(world, basePos, 2, 3, 3, baronStone);
		addBlock(world, basePos, 2, 3, 4, baronStone);
		addBlock(world, basePos, 2, 3, 5, baronStone);
		addBlock(world, basePos, 2, 3, 6, baronStone);
		addBlock(world, basePos, 2, 3, 7, baronStone);
		addBlock(world, basePos, 2, 3, 8, baronStone);
		addBlock(world, basePos, 3, 3, 1, baronGround);
		addBlock(world, basePos, 3, 3, 2, baronStone);
		addBlock(world, basePos, 3, 3, 3, baronStone);
		addBlock(world, basePos, 3, 3, 4, baronStone);
		addBlock(world, basePos, 3, 3, 5, baronStone);
		addBlock(world, basePos, 3, 3, 6, baronStone);
		addBlock(world, basePos, 3, 3, 7, baronStone);
		addBlock(world, basePos, 3, 3, 8, baronStone);
		addBlock(world, basePos, 4, 3, 1, baronStone);
		addBlock(world, basePos, 4, 3, 2, baronStone);
		addBlock(world, basePos, 4, 3, 3, baronStone);
		addBlock(world, basePos, 4, 3, 4, baronStone);
		addBlock(world, basePos, 4, 3, 5, baronStone);
		addBlock(world, basePos, 4, 3, 6, baronStone);
		addBlock(world, basePos, 4, 3, 7, baronStone);
		addBlock(world, basePos, 4, 3, 8, baronStone);
		addBlock(world, basePos, 4, 3, 9, baronStone);
		addBlock(world, basePos, 5, 3, 1, baronStone);
		addBlock(world, basePos, 5, 3, 2, baronStone);
		addBlock(world, basePos, 5, 3, 3, baronStone);
		addBlock(world, basePos, 5, 3, 4, baronStone);
		addBlock(world, basePos, 5, 3, 5, baronStone);
		addBlock(world, basePos, 5, 3, 6, baronStone);
		addBlock(world, basePos, 5, 3, 7, baronStone);
		addBlock(world, basePos, 5, 3, 8, baronStone);
		addBlock(world, basePos, 5, 3, 9, baronStone);
		addBlock(world, basePos, 6, 3, 1, baronStone);
		addBlock(world, basePos, 6, 3, 2, baronStone);
		addBlock(world, basePos, 6, 3, 3, baronStone);
		addBlock(world, basePos, 6, 3, 4, baronStone);
		addBlock(world, basePos, 6, 3, 5, baronStone);
		addBlock(world, basePos, 6, 3, 6, baronStone);
		addBlock(world, basePos, 6, 3, 7, baronStone);
		addBlock(world, basePos, 6, 3, 8, baronStone);
		addBlock(world, basePos, 7, 3, 2, baronStone);
		addBlock(world, basePos, 7, 3, 3, baronStone);
		addBlock(world, basePos, 7, 3, 4, baronStone);
		addBlock(world, basePos, 7, 3, 5, baronStone);
		addBlock(world, basePos, 7, 3, 6, baronStone);
		addBlock(world, basePos, 7, 3, 7, baronStone);
		addBlock(world, basePos, 7, 3, 8, baronStone);
		addBlock(world, basePos, 8, 3, 5, baronStone);
		addBlock(world, basePos, 8, 3, 6, baronStone);
		addBlock(world, basePos, 8, 3, 7, baronStone);
		addBlock(world, basePos, 2, 4, 2, baronStone);
		addBlock(world, basePos, 2, 4, 3, baronStone);
		addBlock(world, basePos, 2, 4, 4, baronStone);
		addBlock(world, basePos, 2, 4, 5, baronStone);
		addBlock(world, basePos, 2, 4, 6, baronStone);
		addBlock(world, basePos, 2, 4, 7, baronStone);
		addBlock(world, basePos, 2, 4, 8, baronStone);
		addBlock(world, basePos, 3, 4, 2, baronStone);
		addBlock(world, basePos, 3, 4, 3, baronStone);
		addBlock(world, basePos, 3, 4, 4, baronStone);
		addBlock(world, basePos, 3, 4, 5, baronStone);
		addBlock(world, basePos, 3, 4, 6, baronStone);
		addBlock(world, basePos, 3, 4, 7, baronStone);
		addBlock(world, basePos, 3, 4, 8, baronStone);
		addBlock(world, basePos, 4, 4, 2, baronStone);
		addBlock(world, basePos, 4, 4, 3, baronStone);
		addBlock(world, basePos, 4, 4, 4, baronStone);
		addBlock(world, basePos, 4, 4, 5, baronStone);
		addBlock(world, basePos, 4, 4, 6, baronStone);
		addBlock(world, basePos, 4, 4, 7, baronStone);
		addBlock(world, basePos, 4, 4, 8, baronStone);
		addBlock(world, basePos, 4, 4, 9, baronGround);
		addBlock(world, basePos, 5, 4, 2, baronStone);
		addBlock(world, basePos, 5, 4, 3, baronStone);
		addBlock(world, basePos, 5, 4, 4, baronStone);
		addBlock(world, basePos, 5, 4, 5, baronStone);
		addBlock(world, basePos, 5, 4, 6, baronStone);
		addBlock(world, basePos, 5, 4, 7, baronStone);
		addBlock(world, basePos, 5, 4, 8, baronStone);
		addBlock(world, basePos, 5, 4, 9, baronGround);
		addBlock(world, basePos, 6, 4, 2, baronStone);
		addBlock(world, basePos, 6, 4, 3, baronStone);
		addBlock(world, basePos, 6, 4, 4, baronStone);
		addBlock(world, basePos, 6, 4, 5, baronStone);
		addBlock(world, basePos, 6, 4, 6, baronStone);
		addBlock(world, basePos, 6, 4, 7, baronStone);
		addBlock(world, basePos, 6, 4, 8, baronStone);
		addBlock(world, basePos, 7, 4, 2, baronStone);
		addBlock(world, basePos, 7, 4, 3, baronStone);
		addBlock(world, basePos, 7, 4, 4, baronStone);
		addBlock(world, basePos, 7, 4, 5, baronStone);
		addBlock(world, basePos, 7, 4, 6, baronStone);
		addBlock(world, basePos, 7, 4, 7, baronStone);
		addBlock(world, basePos, 7, 4, 8, baronStone);
		addBlock(world, basePos, 2, 5, 2, baronStone);
		addBlock(world, basePos, 2, 5, 6, baronStone);
		addBlock(world, basePos, 2, 5, 7, baronStone);
		addBlock(world, basePos, 2, 5, 8, baronStone);
		addBlock(world, basePos, 3, 5, 2, baronStone);
		addBlock(world, basePos, 3, 5, 6, baronStone);
		addBlock(world, basePos, 3, 5, 7, baronStone);
		addBlock(world, basePos, 3, 5, 8, baronStone);
		addBlock(world, basePos, 4, 5, 2, baronStone);
		addBlock(world, basePos, 4, 5, 6, baronStone);
		addBlock(world, basePos, 4, 5, 7, baronStone);
		addBlock(world, basePos, 4, 5, 8, baronStone);
		addBlock(world, basePos, 5, 5, 2, baronStone);
		addBlock(world, basePos, 5, 5, 6, baronStone);
		addBlock(world, basePos, 5, 5, 7, baronStone);
		addBlock(world, basePos, 5, 5, 8, baronStone);
		addBlock(world, basePos, 6, 5, 2, baronStone);
		addBlock(world, basePos, 6, 5, 6, baronStone);
		addBlock(world, basePos, 6, 5, 7, baronStone);
		addBlock(world, basePos, 6, 5, 8, baronStone);
		addBlock(world, basePos, 7, 5, 2, baronStone);
		addBlock(world, basePos, 7, 5, 6, baronStone);
		addBlock(world, basePos, 7, 5, 7, baronStone);
		addBlock(world, basePos, 7, 5, 8, baronStone);
		addBlock(world, basePos, 2, 6, 2, baronStone);
		addBlock(world, basePos, 2, 6, 6, baronStone);
		addBlock(world, basePos, 2, 6, 7, baronStone);
		addBlock(world, basePos, 2, 6, 8, baronStone);
		addBlock(world, basePos, 3, 6, 2, baronStone);
		addBlock(world, basePos, 3, 6, 6, baronStone);
		addBlock(world, basePos, 3, 6, 7, baronStone);
		addBlock(world, basePos, 3, 6, 8, baronStone);
		addBlock(world, basePos, 4, 6, 2, baronStone);
		addBlock(world, basePos, 4, 6, 6, baronStone);
		addBlock(world, basePos, 4, 6, 7, baronStone);
		addBlock(world, basePos, 4, 6, 8, baronStone);
		addBlock(world, basePos, 5, 6, 2, baronStone);
		addBlock(world, basePos, 5, 6, 6, baronStone);
		addBlock(world, basePos, 5, 6, 7, baronStone);
		addBlock(world, basePos, 5, 6, 8, baronStone);
		addBlock(world, basePos, 6, 6, 2, baronStone);
		addBlock(world, basePos, 6, 6, 6, baronStone);
		addBlock(world, basePos, 6, 6, 7, baronStone);
		addBlock(world, basePos, 6, 6, 8, baronStone);
		addBlock(world, basePos, 7, 6, 2, baronStone);
		addBlock(world, basePos, 7, 6, 6, baronStone);
		addBlock(world, basePos, 7, 6, 7, baronStone);
		addBlock(world, basePos, 7, 6, 8, baronStone);
		addBlock(world, basePos, 2, 7, 2, baronStone);
		addBlock(world, basePos, 2, 7, 5, baronStone);
		addBlock(world, basePos, 2, 7, 6, baronStone);
		addBlock(world, basePos, 2, 7, 7, baronStone);
		addBlock(world, basePos, 2, 7, 8, baronStone);
		addBlock(world, basePos, 3, 7, 2, baronStone);
		addBlock(world, basePos, 3, 7, 5, baronStone);
		addBlock(world, basePos, 3, 7, 6, baronStone);
		addBlock(world, basePos, 3, 7, 7, baronStone);
		addBlock(world, basePos, 3, 7, 8, baronStone);
		addBlock(world, basePos, 4, 7, 2, baronStone);
		addBlock(world, basePos, 4, 7, 5, baronStone);
		addBlock(world, basePos, 4, 7, 6, baronStone);
		addBlock(world, basePos, 4, 7, 7, baronStone);
		addBlock(world, basePos, 4, 7, 8, baronStone);
		addBlock(world, basePos, 5, 7, 2, baronStone);
		addBlock(world, basePos, 5, 7, 5, baronStone);
		addBlock(world, basePos, 5, 7, 6, baronStone);
		addBlock(world, basePos, 5, 7, 7, baronStone);
		addBlock(world, basePos, 5, 7, 8, baronStone);
		addBlock(world, basePos, 6, 7, 2, baronStone);
		addBlock(world, basePos, 6, 7, 5, baronStone);
		addBlock(world, basePos, 6, 7, 6, baronStone);
		addBlock(world, basePos, 6, 7, 7, baronStone);
		addBlock(world, basePos, 6, 7, 8, baronStone);
		addBlock(world, basePos, 7, 7, 2, baronStone);
		addBlock(world, basePos, 7, 7, 5, baronStone);
		addBlock(world, basePos, 7, 7, 6, baronStone);
		addBlock(world, basePos, 7, 7, 7, baronStone);
		addBlock(world, basePos, 7, 7, 8, baronStone);
		addBlock(world, basePos, 2, 8, 2, baronStone);
		addBlock(world, basePos, 2, 8, 3, baronStone);
		addBlock(world, basePos, 2, 8, 4, baronStone);
		addBlock(world, basePos, 2, 8, 5, baronStone);
		addBlock(world, basePos, 2, 8, 6, baronStone);
		addBlock(world, basePos, 2, 8, 7, baronStone);
		addBlock(world, basePos, 2, 8, 8, baronStone);
		addBlock(world, basePos, 3, 8, 2, baronStone);
		addBlock(world, basePos, 3, 8, 3, baronStone);
		addBlock(world, basePos, 3, 8, 4, baronStone);
		addBlock(world, basePos, 3, 8, 5, baronStone);
		addBlock(world, basePos, 3, 8, 6, baronStone);
		addBlock(world, basePos, 3, 8, 7, baronStone);
		addBlock(world, basePos, 3, 8, 8, baronStone);
		addBlock(world, basePos, 4, 8, 2, baronStone);
		addBlock(world, basePos, 4, 8, 3, baronStone);
		addBlock(world, basePos, 4, 8, 4, baronStone);
		addBlock(world, basePos, 4, 8, 5, baronStone);
		addBlock(world, basePos, 4, 8, 6, baronStone);
		addBlock(world, basePos, 4, 8, 7, baronStone);
		addBlock(world, basePos, 4, 8, 8, baronStone);
		addBlock(world, basePos, 5, 8, 2, baronStone);
		addBlock(world, basePos, 5, 8, 3, baronStone);
		addBlock(world, basePos, 5, 8, 4, baronStone);
		addBlock(world, basePos, 5, 8, 5, baronStone);
		addBlock(world, basePos, 5, 8, 6, baronStone);
		addBlock(world, basePos, 5, 8, 7, baronStone);
		addBlock(world, basePos, 5, 8, 8, baronStone);
		addBlock(world, basePos, 6, 8, 2, baronStone);
		addBlock(world, basePos, 6, 8, 3, baronStone);
		addBlock(world, basePos, 6, 8, 4, baronStone);
		addBlock(world, basePos, 6, 8, 5, baronStone);
		addBlock(world, basePos, 6, 8, 6, baronStone);
		addBlock(world, basePos, 6, 8, 7, baronStone);
		addBlock(world, basePos, 6, 8, 8, baronStone);
		addBlock(world, basePos, 7, 8, 2, baronStone);
		addBlock(world, basePos, 7, 8, 3, baronStone);
		addBlock(world, basePos, 7, 8, 4, baronStone);
		addBlock(world, basePos, 7, 8, 5, baronStone);
		addBlock(world, basePos, 7, 8, 6, baronStone);
		addBlock(world, basePos, 7, 8, 7, baronStone);
		addBlock(world, basePos, 7, 8, 8, baronStone);
		addBlock(world, basePos, 2, 9, 2, baronStone);
		addBlock(world, basePos, 2, 9, 3, baronStone);
		addBlock(world, basePos, 2, 9, 4, baronStone);
		addBlock(world, basePos, 3, 9, 2, baronStone);
		addBlock(world, basePos, 3, 9, 3, baronStone);
		addBlock(world, basePos, 3, 9, 4, baronStone);
		addBlock(world, basePos, 4, 9, 2, baronStone);
		addBlock(world, basePos, 4, 9, 3, baronStone);
		addBlock(world, basePos, 4, 9, 4, baronStone);
		addBlock(world, basePos, 5, 9, 2, baronStone);
		addBlock(world, basePos, 5, 9, 3, baronStone);
		addBlock(world, basePos, 5, 9, 4, baronStone);
		addBlock(world, basePos, 6, 9, 2, baronStone);
		addBlock(world, basePos, 6, 9, 3, baronStone);
		addBlock(world, basePos, 6, 9, 4, baronStone);
		addBlock(world, basePos, 7, 9, 2, baronStone);
		addBlock(world, basePos, 7, 9, 3, baronStone);
		addBlock(world, basePos, 7, 9, 4, baronStone);
		addBlock(world, basePos, 2, 10, 2, baronStone);
		addBlock(world, basePos, 3, 10, 2, baronStone);
		addBlock(world, basePos, 4, 10, 2, baronStone);
		addBlock(world, basePos, 5, 10, 2, baronStone);
		addBlock(world, basePos, 6, 10, 2, baronStone);
		addBlock(world, basePos, 7, 10, 2, baronStone);
	}
}
