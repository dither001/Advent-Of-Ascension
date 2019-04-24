package net.tslat.aoa3.structure.precasia;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class StranglewoodTree3 extends AoAStructure { //StructureSize: 16x32x16
	private static final IBlockState stranglewoodLeaves = BlockRegister.leavesStranglewood.getDefaultState();
	private static final IBlockState stranglewoodLog = BlockRegister.logStranglewood.getDefaultState();

	public StranglewoodTree3() {
		super("StranglewoodTree3");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 7, 0, 7, stranglewoodLog);
		addBlock(world, basePos, 7, 0, 8, stranglewoodLog);
		addBlock(world, basePos, 8, 0, 7, stranglewoodLog);
		addBlock(world, basePos, 8, 0, 8, stranglewoodLog);
		addBlock(world, basePos, 7, 1, 7, stranglewoodLog);
		addBlock(world, basePos, 7, 1, 8, stranglewoodLog);
		addBlock(world, basePos, 8, 1, 7, stranglewoodLog);
		addBlock(world, basePos, 8, 1, 8, stranglewoodLog);
		addBlock(world, basePos, 7, 2, 7, stranglewoodLog);
		addBlock(world, basePos, 7, 2, 8, stranglewoodLog);
		addBlock(world, basePos, 8, 2, 7, stranglewoodLog);
		addBlock(world, basePos, 8, 2, 8, stranglewoodLog);
		addBlock(world, basePos, 7, 3, 7, stranglewoodLog);
		addBlock(world, basePos, 7, 3, 8, stranglewoodLog);
		addBlock(world, basePos, 8, 3, 7, stranglewoodLog);
		addBlock(world, basePos, 8, 3, 8, stranglewoodLog);
		addBlock(world, basePos, 7, 4, 7, stranglewoodLog);
		addBlock(world, basePos, 7, 4, 8, stranglewoodLog);
		addBlock(world, basePos, 8, 4, 7, stranglewoodLog);
		addBlock(world, basePos, 8, 4, 8, stranglewoodLog);
		addBlock(world, basePos, 7, 5, 7, stranglewoodLog);
		addBlock(world, basePos, 7, 5, 8, stranglewoodLog);
		addBlock(world, basePos, 8, 5, 7, stranglewoodLog);
		addBlock(world, basePos, 8, 5, 8, stranglewoodLog);
		addBlock(world, basePos, 7, 6, 7, stranglewoodLog);
		addBlock(world, basePos, 7, 6, 8, stranglewoodLog);
		addBlock(world, basePos, 8, 6, 7, stranglewoodLog);
		addBlock(world, basePos, 8, 6, 8, stranglewoodLog);
		addBlock(world, basePos, 7, 7, 7, stranglewoodLog);
		addBlock(world, basePos, 7, 7, 8, stranglewoodLog);
		addBlock(world, basePos, 8, 7, 7, stranglewoodLog);
		addBlock(world, basePos, 8, 7, 8, stranglewoodLog);
		addBlock(world, basePos, 7, 8, 7, stranglewoodLog);
		addBlock(world, basePos, 7, 8, 8, stranglewoodLog);
		addBlock(world, basePos, 8, 8, 7, stranglewoodLog);
		addBlock(world, basePos, 8, 8, 8, stranglewoodLog);
		addBlock(world, basePos, 7, 9, 7, stranglewoodLog);
		addBlock(world, basePos, 7, 9, 8, stranglewoodLog);
		addBlock(world, basePos, 8, 9, 7, stranglewoodLog);
		addBlock(world, basePos, 8, 9, 8, stranglewoodLog);
		addBlock(world, basePos, 7, 10, 7, stranglewoodLog);
		addBlock(world, basePos, 7, 10, 8, stranglewoodLog);
		addBlock(world, basePos, 8, 10, 7, stranglewoodLog);
		addBlock(world, basePos, 8, 10, 8, stranglewoodLog);
		addBlock(world, basePos, 7, 11, 7, stranglewoodLog);
		addBlock(world, basePos, 7, 11, 8, stranglewoodLog);
		addBlock(world, basePos, 8, 11, 7, stranglewoodLog);
		addBlock(world, basePos, 8, 11, 8, stranglewoodLog);
		addBlock(world, basePos, 7, 12, 7, stranglewoodLog);
		addBlock(world, basePos, 7, 12, 8, stranglewoodLog);
		addBlock(world, basePos, 8, 12, 7, stranglewoodLog);
		addBlock(world, basePos, 8, 12, 8, stranglewoodLog);
		addBlock(world, basePos, 7, 13, 7, stranglewoodLog);
		addBlock(world, basePos, 7, 13, 8, stranglewoodLog);
		addBlock(world, basePos, 8, 13, 7, stranglewoodLog);
		addBlock(world, basePos, 8, 13, 8, stranglewoodLog);
		addBlock(world, basePos, 7, 14, 7, stranglewoodLog);
		addBlock(world, basePos, 7, 14, 8, stranglewoodLog);
		addBlock(world, basePos, 8, 14, 7, stranglewoodLog);
		addBlock(world, basePos, 8, 14, 8, stranglewoodLog);
		addBlock(world, basePos, 7, 15, 7, stranglewoodLog);
		addBlock(world, basePos, 7, 15, 8, stranglewoodLog);
		addBlock(world, basePos, 8, 15, 7, stranglewoodLog);
		addBlock(world, basePos, 8, 15, 8, stranglewoodLog);
		addBlock(world, basePos, 7, 16, 7, stranglewoodLog);
		addBlock(world, basePos, 7, 16, 8, stranglewoodLog);
		addBlock(world, basePos, 8, 16, 7, stranglewoodLog);
		addBlock(world, basePos, 8, 16, 8, stranglewoodLog);
		addBlock(world, basePos, 7, 17, 7, stranglewoodLog);
		addBlock(world, basePos, 7, 17, 8, stranglewoodLog);
		addBlock(world, basePos, 8, 17, 7, stranglewoodLog);
		addBlock(world, basePos, 8, 17, 8, stranglewoodLog);
		addBlock(world, basePos, 7, 18, 7, stranglewoodLog);
		addBlock(world, basePos, 7, 18, 8, stranglewoodLog);
		addBlock(world, basePos, 8, 18, 7, stranglewoodLog);
		addBlock(world, basePos, 8, 18, 8, stranglewoodLog);
		addBlock(world, basePos, 7, 19, 7, stranglewoodLog);
		addBlock(world, basePos, 7, 19, 8, stranglewoodLog);
		addBlock(world, basePos, 8, 19, 7, stranglewoodLog);
		addBlock(world, basePos, 8, 19, 8, stranglewoodLog);
		addBlock(world, basePos, 7, 20, 7, stranglewoodLog);
		addBlock(world, basePos, 7, 20, 8, stranglewoodLog);
		addBlock(world, basePos, 8, 20, 7, stranglewoodLog);
		addBlock(world, basePos, 8, 20, 8, stranglewoodLog);
		addBlock(world, basePos, 7, 21, 7, stranglewoodLog);
		addBlock(world, basePos, 7, 21, 8, stranglewoodLog);
		addBlock(world, basePos, 8, 21, 7, stranglewoodLog);
		addBlock(world, basePos, 8, 21, 8, stranglewoodLog);
		addBlock(world, basePos, 7, 22, 7, stranglewoodLog);
		addBlock(world, basePos, 7, 22, 8, stranglewoodLog);
		addBlock(world, basePos, 8, 22, 7, stranglewoodLog);
		addBlock(world, basePos, 8, 22, 8, stranglewoodLog);
		addBlock(world, basePos, 7, 23, 7, stranglewoodLog);
		addBlock(world, basePos, 7, 23, 8, stranglewoodLog);
		addBlock(world, basePos, 8, 23, 7, stranglewoodLog);
		addBlock(world, basePos, 8, 23, 8, stranglewoodLog);
		addBlock(world, basePos, 7, 24, 7, stranglewoodLog);
		addBlock(world, basePos, 7, 24, 8, stranglewoodLog);
		addBlock(world, basePos, 8, 24, 7, stranglewoodLog);
		addBlock(world, basePos, 8, 24, 8, stranglewoodLog);
		addBlock(world, basePos, 7, 25, 7, stranglewoodLog);
		addBlock(world, basePos, 7, 25, 8, stranglewoodLog);
		addBlock(world, basePos, 8, 25, 7, stranglewoodLog);
		addBlock(world, basePos, 8, 25, 8, stranglewoodLog);
		addBlock(world, basePos, 7, 26, 7, stranglewoodLog);
		addBlock(world, basePos, 7, 26, 8, stranglewoodLog);
		addBlock(world, basePos, 8, 26, 7, stranglewoodLog);
		addBlock(world, basePos, 8, 26, 8, stranglewoodLog);
		addBlock(world, basePos, 1, 27, 7, stranglewoodLeaves);
		addBlock(world, basePos, 1, 27, 8, stranglewoodLeaves);
		addBlock(world, basePos, 1, 27, 9, stranglewoodLeaves);
		addBlock(world, basePos, 2, 27, 7, stranglewoodLeaves);
		addBlock(world, basePos, 2, 27, 8, stranglewoodLeaves);
		addBlock(world, basePos, 2, 27, 9, stranglewoodLeaves);
		addBlock(world, basePos, 3, 27, 7, stranglewoodLeaves);
		addBlock(world, basePos, 3, 27, 8, stranglewoodLeaves);
		addBlock(world, basePos, 3, 27, 9, stranglewoodLeaves);
		addBlock(world, basePos, 6, 27, 1, stranglewoodLeaves);
		addBlock(world, basePos, 6, 27, 2, stranglewoodLeaves);
		addBlock(world, basePos, 6, 27, 3, stranglewoodLeaves);
		addBlock(world, basePos, 7, 27, 1, stranglewoodLeaves);
		addBlock(world, basePos, 7, 27, 2, stranglewoodLeaves);
		addBlock(world, basePos, 7, 27, 3, stranglewoodLeaves);
		addBlock(world, basePos, 7, 27, 7, stranglewoodLog);
		addBlock(world, basePos, 7, 27, 8, stranglewoodLog);
		addBlock(world, basePos, 7, 27, 12, stranglewoodLeaves);
		addBlock(world, basePos, 7, 27, 13, stranglewoodLeaves);
		addBlock(world, basePos, 7, 27, 14, stranglewoodLeaves);
		addBlock(world, basePos, 8, 27, 1, stranglewoodLeaves);
		addBlock(world, basePos, 8, 27, 2, stranglewoodLeaves);
		addBlock(world, basePos, 8, 27, 3, stranglewoodLeaves);
		addBlock(world, basePos, 8, 27, 7, stranglewoodLog);
		addBlock(world, basePos, 8, 27, 8, stranglewoodLog);
		addBlock(world, basePos, 8, 27, 12, stranglewoodLeaves);
		addBlock(world, basePos, 8, 27, 13, stranglewoodLeaves);
		addBlock(world, basePos, 8, 27, 14, stranglewoodLeaves);
		addBlock(world, basePos, 9, 27, 12, stranglewoodLeaves);
		addBlock(world, basePos, 9, 27, 13, stranglewoodLeaves);
		addBlock(world, basePos, 9, 27, 14, stranglewoodLeaves);
		addBlock(world, basePos, 12, 27, 6, stranglewoodLeaves);
		addBlock(world, basePos, 12, 27, 7, stranglewoodLeaves);
		addBlock(world, basePos, 12, 27, 8, stranglewoodLeaves);
		addBlock(world, basePos, 13, 27, 6, stranglewoodLeaves);
		addBlock(world, basePos, 13, 27, 7, stranglewoodLeaves);
		addBlock(world, basePos, 13, 27, 8, stranglewoodLeaves);
		addBlock(world, basePos, 14, 27, 6, stranglewoodLeaves);
		addBlock(world, basePos, 14, 27, 7, stranglewoodLeaves);
		addBlock(world, basePos, 14, 27, 8, stranglewoodLeaves);
		addBlock(world, basePos, 0, 28, 7, stranglewoodLeaves);
		addBlock(world, basePos, 0, 28, 8, stranglewoodLeaves);
		addBlock(world, basePos, 0, 28, 9, stranglewoodLeaves);
		addBlock(world, basePos, 1, 28, 6, stranglewoodLeaves);
		addBlock(world, basePos, 1, 28, 10, stranglewoodLeaves);
		addBlock(world, basePos, 2, 28, 6, stranglewoodLeaves);
		addBlock(world, basePos, 2, 28, 10, stranglewoodLeaves);
		addBlock(world, basePos, 3, 28, 6, stranglewoodLeaves);
		addBlock(world, basePos, 3, 28, 10, stranglewoodLeaves);
		addBlock(world, basePos, 4, 28, 7, stranglewoodLeaves);
		addBlock(world, basePos, 4, 28, 8, stranglewoodLeaves);
		addBlock(world, basePos, 4, 28, 9, stranglewoodLeaves);
		addBlock(world, basePos, 5, 28, 1, stranglewoodLeaves);
		addBlock(world, basePos, 5, 28, 2, stranglewoodLeaves);
		addBlock(world, basePos, 5, 28, 3, stranglewoodLeaves);
		addBlock(world, basePos, 6, 28, 0, stranglewoodLeaves);
		addBlock(world, basePos, 6, 28, 4, stranglewoodLeaves);
		addBlock(world, basePos, 6, 28, 12, stranglewoodLeaves);
		addBlock(world, basePos, 6, 28, 13, stranglewoodLeaves);
		addBlock(world, basePos, 6, 28, 14, stranglewoodLeaves);
		addBlock(world, basePos, 7, 28, 0, stranglewoodLeaves);
		addBlock(world, basePos, 7, 28, 4, stranglewoodLeaves);
		addBlock(world, basePos, 7, 28, 7, stranglewoodLog);
		addBlock(world, basePos, 7, 28, 8, stranglewoodLog);
		addBlock(world, basePos, 7, 28, 11, stranglewoodLeaves);
		addBlock(world, basePos, 7, 28, 15, stranglewoodLeaves);
		addBlock(world, basePos, 8, 28, 0, stranglewoodLeaves);
		addBlock(world, basePos, 8, 28, 4, stranglewoodLeaves);
		addBlock(world, basePos, 8, 28, 7, stranglewoodLog);
		addBlock(world, basePos, 8, 28, 8, stranglewoodLog);
		addBlock(world, basePos, 8, 28, 11, stranglewoodLeaves);
		addBlock(world, basePos, 8, 28, 15, stranglewoodLeaves);
		addBlock(world, basePos, 9, 28, 1, stranglewoodLeaves);
		addBlock(world, basePos, 9, 28, 2, stranglewoodLeaves);
		addBlock(world, basePos, 9, 28, 3, stranglewoodLeaves);
		addBlock(world, basePos, 9, 28, 11, stranglewoodLeaves);
		addBlock(world, basePos, 9, 28, 15, stranglewoodLeaves);
		addBlock(world, basePos, 10, 28, 12, stranglewoodLeaves);
		addBlock(world, basePos, 10, 28, 13, stranglewoodLeaves);
		addBlock(world, basePos, 10, 28, 14, stranglewoodLeaves);
		addBlock(world, basePos, 11, 28, 6, stranglewoodLeaves);
		addBlock(world, basePos, 11, 28, 7, stranglewoodLeaves);
		addBlock(world, basePos, 11, 28, 8, stranglewoodLeaves);
		addBlock(world, basePos, 12, 28, 5, stranglewoodLeaves);
		addBlock(world, basePos, 12, 28, 9, stranglewoodLeaves);
		addBlock(world, basePos, 13, 28, 5, stranglewoodLeaves);
		addBlock(world, basePos, 13, 28, 9, stranglewoodLeaves);
		addBlock(world, basePos, 14, 28, 5, stranglewoodLeaves);
		addBlock(world, basePos, 14, 28, 9, stranglewoodLeaves);
		addBlock(world, basePos, 15, 28, 6, stranglewoodLeaves);
		addBlock(world, basePos, 15, 28, 7, stranglewoodLeaves);
		addBlock(world, basePos, 15, 28, 8, stranglewoodLeaves);
		addBlock(world, basePos, 0, 29, 7, stranglewoodLeaves);
		addBlock(world, basePos, 0, 29, 8, stranglewoodLeaves);
		addBlock(world, basePos, 0, 29, 9, stranglewoodLeaves);
		addBlock(world, basePos, 1, 29, 6, stranglewoodLeaves);
		addBlock(world, basePos, 1, 29, 10, stranglewoodLeaves);
		addBlock(world, basePos, 2, 29, 6, stranglewoodLeaves);
		addBlock(world, basePos, 2, 29, 7, stranglewoodLog);
		addBlock(world, basePos, 2, 29, 8, stranglewoodLog);
		addBlock(world, basePos, 2, 29, 10, stranglewoodLeaves);
		addBlock(world, basePos, 3, 29, 6, stranglewoodLeaves);
		addBlock(world, basePos, 3, 29, 7, stranglewoodLog);
		addBlock(world, basePos, 3, 29, 8, stranglewoodLog);
		addBlock(world, basePos, 3, 29, 10, stranglewoodLeaves);
		addBlock(world, basePos, 4, 29, 7, stranglewoodLeaves);
		addBlock(world, basePos, 4, 29, 8, stranglewoodLeaves);
		addBlock(world, basePos, 4, 29, 9, stranglewoodLeaves);
		addBlock(world, basePos, 5, 29, 1, stranglewoodLeaves);
		addBlock(world, basePos, 5, 29, 2, stranglewoodLeaves);
		addBlock(world, basePos, 5, 29, 3, stranglewoodLeaves);
		addBlock(world, basePos, 5, 29, 7, stranglewoodLog);
		addBlock(world, basePos, 5, 29, 8, stranglewoodLog);
		addBlock(world, basePos, 6, 29, 0, stranglewoodLeaves);
		addBlock(world, basePos, 6, 29, 4, stranglewoodLeaves);
		addBlock(world, basePos, 6, 29, 7, stranglewoodLog);
		addBlock(world, basePos, 6, 29, 8, stranglewoodLog);
		addBlock(world, basePos, 6, 29, 12, stranglewoodLeaves);
		addBlock(world, basePos, 6, 29, 13, stranglewoodLeaves);
		addBlock(world, basePos, 6, 29, 14, stranglewoodLeaves);
		addBlock(world, basePos, 7, 29, 0, stranglewoodLeaves);
		addBlock(world, basePos, 7, 29, 2, stranglewoodLog);
		addBlock(world, basePos, 7, 29, 3, stranglewoodLog);
		addBlock(world, basePos, 7, 29, 4, stranglewoodLeaves);
		addBlock(world, basePos, 7, 29, 5, stranglewoodLog);
		addBlock(world, basePos, 7, 29, 6, stranglewoodLog);
		addBlock(world, basePos, 7, 29, 7, stranglewoodLog);
		addBlock(world, basePos, 7, 29, 8, stranglewoodLog);
		addBlock(world, basePos, 7, 29, 9, stranglewoodLog);
		addBlock(world, basePos, 7, 29, 10, stranglewoodLog);
		addBlock(world, basePos, 7, 29, 11, stranglewoodLeaves);
		addBlock(world, basePos, 7, 29, 12, stranglewoodLog);
		addBlock(world, basePos, 7, 29, 13, stranglewoodLog);
		addBlock(world, basePos, 7, 29, 15, stranglewoodLeaves);
		addBlock(world, basePos, 8, 29, 0, stranglewoodLeaves);
		addBlock(world, basePos, 8, 29, 2, stranglewoodLog);
		addBlock(world, basePos, 8, 29, 3, stranglewoodLog);
		addBlock(world, basePos, 8, 29, 4, stranglewoodLeaves);
		addBlock(world, basePos, 8, 29, 5, stranglewoodLog);
		addBlock(world, basePos, 8, 29, 6, stranglewoodLog);
		addBlock(world, basePos, 8, 29, 7, stranglewoodLog);
		addBlock(world, basePos, 8, 29, 8, stranglewoodLog);
		addBlock(world, basePos, 8, 29, 9, stranglewoodLog);
		addBlock(world, basePos, 8, 29, 10, stranglewoodLog);
		addBlock(world, basePos, 8, 29, 11, stranglewoodLeaves);
		addBlock(world, basePos, 8, 29, 12, stranglewoodLog);
		addBlock(world, basePos, 8, 29, 13, stranglewoodLog);
		addBlock(world, basePos, 8, 29, 15, stranglewoodLeaves);
		addBlock(world, basePos, 9, 29, 1, stranglewoodLeaves);
		addBlock(world, basePos, 9, 29, 2, stranglewoodLeaves);
		addBlock(world, basePos, 9, 29, 3, stranglewoodLeaves);
		addBlock(world, basePos, 9, 29, 7, stranglewoodLog);
		addBlock(world, basePos, 9, 29, 8, stranglewoodLog);
		addBlock(world, basePos, 9, 29, 11, stranglewoodLeaves);
		addBlock(world, basePos, 9, 29, 15, stranglewoodLeaves);
		addBlock(world, basePos, 10, 29, 7, stranglewoodLog);
		addBlock(world, basePos, 10, 29, 8, stranglewoodLog);
		addBlock(world, basePos, 10, 29, 12, stranglewoodLeaves);
		addBlock(world, basePos, 10, 29, 13, stranglewoodLeaves);
		addBlock(world, basePos, 10, 29, 14, stranglewoodLeaves);
		addBlock(world, basePos, 11, 29, 6, stranglewoodLeaves);
		addBlock(world, basePos, 11, 29, 7, stranglewoodLeaves);
		addBlock(world, basePos, 11, 29, 8, stranglewoodLeaves);
		addBlock(world, basePos, 12, 29, 5, stranglewoodLeaves);
		addBlock(world, basePos, 12, 29, 7, stranglewoodLog);
		addBlock(world, basePos, 12, 29, 8, stranglewoodLog);
		addBlock(world, basePos, 12, 29, 9, stranglewoodLeaves);
		addBlock(world, basePos, 13, 29, 5, stranglewoodLeaves);
		addBlock(world, basePos, 13, 29, 7, stranglewoodLog);
		addBlock(world, basePos, 13, 29, 8, stranglewoodLog);
		addBlock(world, basePos, 13, 29, 9, stranglewoodLeaves);
		addBlock(world, basePos, 14, 29, 5, stranglewoodLeaves);
		addBlock(world, basePos, 14, 29, 9, stranglewoodLeaves);
		addBlock(world, basePos, 15, 29, 6, stranglewoodLeaves);
		addBlock(world, basePos, 15, 29, 7, stranglewoodLeaves);
		addBlock(world, basePos, 15, 29, 8, stranglewoodLeaves);
		addBlock(world, basePos, 0, 30, 7, stranglewoodLeaves);
		addBlock(world, basePos, 0, 30, 8, stranglewoodLeaves);
		addBlock(world, basePos, 0, 30, 9, stranglewoodLeaves);
		addBlock(world, basePos, 1, 30, 6, stranglewoodLeaves);
		addBlock(world, basePos, 1, 30, 10, stranglewoodLeaves);
		addBlock(world, basePos, 2, 30, 6, stranglewoodLeaves);
		addBlock(world, basePos, 2, 30, 10, stranglewoodLeaves);
		addBlock(world, basePos, 3, 30, 6, stranglewoodLeaves);
		addBlock(world, basePos, 3, 30, 10, stranglewoodLeaves);
		addBlock(world, basePos, 4, 30, 7, stranglewoodLeaves);
		addBlock(world, basePos, 4, 30, 8, stranglewoodLeaves);
		addBlock(world, basePos, 4, 30, 9, stranglewoodLeaves);
		addBlock(world, basePos, 5, 30, 1, stranglewoodLeaves);
		addBlock(world, basePos, 5, 30, 2, stranglewoodLeaves);
		addBlock(world, basePos, 5, 30, 3, stranglewoodLeaves);
		addBlock(world, basePos, 6, 30, 0, stranglewoodLeaves);
		addBlock(world, basePos, 6, 30, 4, stranglewoodLeaves);
		addBlock(world, basePos, 6, 30, 12, stranglewoodLeaves);
		addBlock(world, basePos, 6, 30, 13, stranglewoodLeaves);
		addBlock(world, basePos, 6, 30, 14, stranglewoodLeaves);
		addBlock(world, basePos, 7, 30, 0, stranglewoodLeaves);
		addBlock(world, basePos, 7, 30, 4, stranglewoodLeaves);
		addBlock(world, basePos, 7, 30, 11, stranglewoodLeaves);
		addBlock(world, basePos, 7, 30, 15, stranglewoodLeaves);
		addBlock(world, basePos, 8, 30, 0, stranglewoodLeaves);
		addBlock(world, basePos, 8, 30, 4, stranglewoodLeaves);
		addBlock(world, basePos, 8, 30, 11, stranglewoodLeaves);
		addBlock(world, basePos, 8, 30, 15, stranglewoodLeaves);
		addBlock(world, basePos, 9, 30, 1, stranglewoodLeaves);
		addBlock(world, basePos, 9, 30, 2, stranglewoodLeaves);
		addBlock(world, basePos, 9, 30, 3, stranglewoodLeaves);
		addBlock(world, basePos, 9, 30, 11, stranglewoodLeaves);
		addBlock(world, basePos, 9, 30, 15, stranglewoodLeaves);
		addBlock(world, basePos, 10, 30, 12, stranglewoodLeaves);
		addBlock(world, basePos, 10, 30, 13, stranglewoodLeaves);
		addBlock(world, basePos, 10, 30, 14, stranglewoodLeaves);
		addBlock(world, basePos, 11, 30, 6, stranglewoodLeaves);
		addBlock(world, basePos, 11, 30, 7, stranglewoodLeaves);
		addBlock(world, basePos, 11, 30, 8, stranglewoodLeaves);
		addBlock(world, basePos, 12, 30, 5, stranglewoodLeaves);
		addBlock(world, basePos, 12, 30, 9, stranglewoodLeaves);
		addBlock(world, basePos, 13, 30, 5, stranglewoodLeaves);
		addBlock(world, basePos, 13, 30, 9, stranglewoodLeaves);
		addBlock(world, basePos, 14, 30, 5, stranglewoodLeaves);
		addBlock(world, basePos, 14, 30, 9, stranglewoodLeaves);
		addBlock(world, basePos, 15, 30, 6, stranglewoodLeaves);
		addBlock(world, basePos, 15, 30, 7, stranglewoodLeaves);
		addBlock(world, basePos, 15, 30, 8, stranglewoodLeaves);
		addBlock(world, basePos, 1, 31, 7, stranglewoodLeaves);
		addBlock(world, basePos, 1, 31, 8, stranglewoodLeaves);
		addBlock(world, basePos, 1, 31, 9, stranglewoodLeaves);
		addBlock(world, basePos, 2, 31, 7, stranglewoodLeaves);
		addBlock(world, basePos, 2, 31, 8, stranglewoodLeaves);
		addBlock(world, basePos, 2, 31, 9, stranglewoodLeaves);
		addBlock(world, basePos, 3, 31, 7, stranglewoodLeaves);
		addBlock(world, basePos, 3, 31, 8, stranglewoodLeaves);
		addBlock(world, basePos, 3, 31, 9, stranglewoodLeaves);
		addBlock(world, basePos, 6, 31, 1, stranglewoodLeaves);
		addBlock(world, basePos, 6, 31, 2, stranglewoodLeaves);
		addBlock(world, basePos, 6, 31, 3, stranglewoodLeaves);
		addBlock(world, basePos, 7, 31, 1, stranglewoodLeaves);
		addBlock(world, basePos, 7, 31, 2, stranglewoodLeaves);
		addBlock(world, basePos, 7, 31, 3, stranglewoodLeaves);
		addBlock(world, basePos, 7, 31, 12, stranglewoodLeaves);
		addBlock(world, basePos, 7, 31, 13, stranglewoodLeaves);
		addBlock(world, basePos, 7, 31, 14, stranglewoodLeaves);
		addBlock(world, basePos, 8, 31, 1, stranglewoodLeaves);
		addBlock(world, basePos, 8, 31, 2, stranglewoodLeaves);
		addBlock(world, basePos, 8, 31, 3, stranglewoodLeaves);
		addBlock(world, basePos, 8, 31, 12, stranglewoodLeaves);
		addBlock(world, basePos, 8, 31, 13, stranglewoodLeaves);
		addBlock(world, basePos, 8, 31, 14, stranglewoodLeaves);
		addBlock(world, basePos, 9, 31, 12, stranglewoodLeaves);
		addBlock(world, basePos, 9, 31, 13, stranglewoodLeaves);
		addBlock(world, basePos, 9, 31, 14, stranglewoodLeaves);
		addBlock(world, basePos, 12, 31, 6, stranglewoodLeaves);
		addBlock(world, basePos, 12, 31, 7, stranglewoodLeaves);
		addBlock(world, basePos, 12, 31, 8, stranglewoodLeaves);
		addBlock(world, basePos, 13, 31, 6, stranglewoodLeaves);
		addBlock(world, basePos, 13, 31, 7, stranglewoodLeaves);
		addBlock(world, basePos, 13, 31, 8, stranglewoodLeaves);
		addBlock(world, basePos, 14, 31, 6, stranglewoodLeaves);
		addBlock(world, basePos, 14, 31, 7, stranglewoodLeaves);
		addBlock(world, basePos, 14, 31, 8, stranglewoodLeaves);
	}
}
