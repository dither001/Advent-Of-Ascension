package net.tslat.aoa3.structure.precasia;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class DomiguousTree1 extends AoAStructure { //StructureSize: 11x25x11
	private static final IBlockState domiguousLeaves = BlockRegister.leavesDomiguous.getDefaultState();
	private static final IBlockState domiguousLog = BlockRegister.logDomiguous.getDefaultState();

	public DomiguousTree1() {
		super("DomiguousTree1");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 5, 0, 5, domiguousLog);
		addBlock(world, basePos, 5, 1, 5, domiguousLog);
		addBlock(world, basePos, 5, 2, 5, domiguousLog);
		addBlock(world, basePos, 5, 3, 5, domiguousLog);
		addBlock(world, basePos, 5, 4, 5, domiguousLog);
		addBlock(world, basePos, 5, 5, 5, domiguousLog);
		addBlock(world, basePos, 5, 6, 5, domiguousLog);
		addBlock(world, basePos, 5, 7, 5, domiguousLog);
		addBlock(world, basePos, 5, 8, 5, domiguousLog);
		addBlock(world, basePos, 5, 9, 5, domiguousLog);
		addBlock(world, basePos, 5, 10, 5, domiguousLog);
		addBlock(world, basePos, 5, 11, 5, domiguousLog);
		addBlock(world, basePos, 5, 12, 5, domiguousLog);
		addBlock(world, basePos, 5, 13, 5, domiguousLog);
		addBlock(world, basePos, 5, 14, 5, domiguousLog);
		addBlock(world, basePos, 5, 15, 5, domiguousLog);
		addBlock(world, basePos, 5, 16, 5, domiguousLog);
		addBlock(world, basePos, 5, 17, 5, domiguousLog);
		addBlock(world, basePos, 5, 18, 5, domiguousLog);
		addBlock(world, basePos, 5, 19, 5, domiguousLog);
		addBlock(world, basePos, 4, 20, 5, domiguousLog);
		addBlock(world, basePos, 5, 20, 4, domiguousLog);
		addBlock(world, basePos, 5, 20, 5, domiguousLog);
		addBlock(world, basePos, 5, 20, 6, domiguousLog);
		addBlock(world, basePos, 6, 20, 5, domiguousLog);
		addBlock(world, basePos, 3, 21, 5, domiguousLog);
		addBlock(world, basePos, 5, 21, 3, domiguousLog);
		addBlock(world, basePos, 5, 21, 5, domiguousLog);
		addBlock(world, basePos, 5, 21, 7, domiguousLog);
		addBlock(world, basePos, 7, 21, 5, domiguousLog);
		addBlock(world, basePos, 0, 22, 0, domiguousLeaves);
		addBlock(world, basePos, 0, 22, 1, domiguousLeaves);
		addBlock(world, basePos, 0, 22, 2, domiguousLeaves);
		addBlock(world, basePos, 0, 22, 3, domiguousLeaves);
		addBlock(world, basePos, 0, 22, 4, domiguousLeaves);
		addBlock(world, basePos, 0, 22, 5, domiguousLeaves);
		addBlock(world, basePos, 0, 22, 6, domiguousLeaves);
		addBlock(world, basePos, 0, 22, 7, domiguousLeaves);
		addBlock(world, basePos, 0, 22, 8, domiguousLeaves);
		addBlock(world, basePos, 0, 22, 9, domiguousLeaves);
		addBlock(world, basePos, 0, 22, 10, domiguousLeaves);
		addBlock(world, basePos, 1, 22, 0, domiguousLeaves);
		addBlock(world, basePos, 1, 22, 1, domiguousLeaves);
		addBlock(world, basePos, 1, 22, 2, domiguousLeaves);
		addBlock(world, basePos, 1, 22, 3, domiguousLeaves);
		addBlock(world, basePos, 1, 22, 4, domiguousLeaves);
		addBlock(world, basePos, 1, 22, 5, domiguousLeaves);
		addBlock(world, basePos, 1, 22, 6, domiguousLeaves);
		addBlock(world, basePos, 1, 22, 7, domiguousLeaves);
		addBlock(world, basePos, 1, 22, 8, domiguousLeaves);
		addBlock(world, basePos, 1, 22, 9, domiguousLeaves);
		addBlock(world, basePos, 1, 22, 10, domiguousLeaves);
		addBlock(world, basePos, 2, 22, 0, domiguousLeaves);
		addBlock(world, basePos, 2, 22, 1, domiguousLeaves);
		addBlock(world, basePos, 2, 22, 9, domiguousLeaves);
		addBlock(world, basePos, 2, 22, 10, domiguousLeaves);
		addBlock(world, basePos, 3, 22, 0, domiguousLeaves);
		addBlock(world, basePos, 3, 22, 1, domiguousLeaves);
		addBlock(world, basePos, 3, 22, 5, domiguousLog);
		addBlock(world, basePos, 3, 22, 9, domiguousLeaves);
		addBlock(world, basePos, 3, 22, 10, domiguousLeaves);
		addBlock(world, basePos, 4, 22, 0, domiguousLeaves);
		addBlock(world, basePos, 4, 22, 1, domiguousLeaves);
		addBlock(world, basePos, 4, 22, 9, domiguousLeaves);
		addBlock(world, basePos, 4, 22, 10, domiguousLeaves);
		addBlock(world, basePos, 5, 22, 0, domiguousLeaves);
		addBlock(world, basePos, 5, 22, 1, domiguousLeaves);
		addBlock(world, basePos, 5, 22, 3, domiguousLog);
		addBlock(world, basePos, 5, 22, 5, domiguousLog);
		addBlock(world, basePos, 5, 22, 7, domiguousLog);
		addBlock(world, basePos, 5, 22, 9, domiguousLeaves);
		addBlock(world, basePos, 5, 22, 10, domiguousLeaves);
		addBlock(world, basePos, 6, 22, 0, domiguousLeaves);
		addBlock(world, basePos, 6, 22, 1, domiguousLeaves);
		addBlock(world, basePos, 6, 22, 9, domiguousLeaves);
		addBlock(world, basePos, 6, 22, 10, domiguousLeaves);
		addBlock(world, basePos, 7, 22, 0, domiguousLeaves);
		addBlock(world, basePos, 7, 22, 1, domiguousLeaves);
		addBlock(world, basePos, 7, 22, 5, domiguousLog);
		addBlock(world, basePos, 7, 22, 9, domiguousLeaves);
		addBlock(world, basePos, 7, 22, 10, domiguousLeaves);
		addBlock(world, basePos, 8, 22, 0, domiguousLeaves);
		addBlock(world, basePos, 8, 22, 1, domiguousLeaves);
		addBlock(world, basePos, 8, 22, 9, domiguousLeaves);
		addBlock(world, basePos, 8, 22, 10, domiguousLeaves);
		addBlock(world, basePos, 9, 22, 0, domiguousLeaves);
		addBlock(world, basePos, 9, 22, 1, domiguousLeaves);
		addBlock(world, basePos, 9, 22, 2, domiguousLeaves);
		addBlock(world, basePos, 9, 22, 3, domiguousLeaves);
		addBlock(world, basePos, 9, 22, 4, domiguousLeaves);
		addBlock(world, basePos, 9, 22, 5, domiguousLeaves);
		addBlock(world, basePos, 9, 22, 6, domiguousLeaves);
		addBlock(world, basePos, 9, 22, 7, domiguousLeaves);
		addBlock(world, basePos, 9, 22, 8, domiguousLeaves);
		addBlock(world, basePos, 9, 22, 9, domiguousLeaves);
		addBlock(world, basePos, 9, 22, 10, domiguousLeaves);
		addBlock(world, basePos, 10, 22, 0, domiguousLeaves);
		addBlock(world, basePos, 10, 22, 1, domiguousLeaves);
		addBlock(world, basePos, 10, 22, 2, domiguousLeaves);
		addBlock(world, basePos, 10, 22, 3, domiguousLeaves);
		addBlock(world, basePos, 10, 22, 4, domiguousLeaves);
		addBlock(world, basePos, 10, 22, 5, domiguousLeaves);
		addBlock(world, basePos, 10, 22, 6, domiguousLeaves);
		addBlock(world, basePos, 10, 22, 7, domiguousLeaves);
		addBlock(world, basePos, 10, 22, 8, domiguousLeaves);
		addBlock(world, basePos, 10, 22, 9, domiguousLeaves);
		addBlock(world, basePos, 10, 22, 10, domiguousLeaves);
		addBlock(world, basePos, 2, 23, 2, domiguousLeaves);
		addBlock(world, basePos, 2, 23, 3, domiguousLeaves);
		addBlock(world, basePos, 2, 23, 4, domiguousLeaves);
		addBlock(world, basePos, 2, 23, 5, domiguousLeaves);
		addBlock(world, basePos, 2, 23, 6, domiguousLeaves);
		addBlock(world, basePos, 2, 23, 7, domiguousLeaves);
		addBlock(world, basePos, 2, 23, 8, domiguousLeaves);
		addBlock(world, basePos, 3, 23, 2, domiguousLeaves);
		addBlock(world, basePos, 3, 23, 3, domiguousLeaves);
		addBlock(world, basePos, 3, 23, 4, domiguousLeaves);
		addBlock(world, basePos, 3, 23, 5, domiguousLeaves);
		addBlock(world, basePos, 3, 23, 6, domiguousLeaves);
		addBlock(world, basePos, 3, 23, 7, domiguousLeaves);
		addBlock(world, basePos, 3, 23, 8, domiguousLeaves);
		addBlock(world, basePos, 4, 23, 2, domiguousLeaves);
		addBlock(world, basePos, 4, 23, 3, domiguousLeaves);
		addBlock(world, basePos, 4, 23, 7, domiguousLeaves);
		addBlock(world, basePos, 4, 23, 8, domiguousLeaves);
		addBlock(world, basePos, 5, 23, 2, domiguousLeaves);
		addBlock(world, basePos, 5, 23, 3, domiguousLeaves);
		addBlock(world, basePos, 5, 23, 5, domiguousLog);
		addBlock(world, basePos, 5, 23, 7, domiguousLeaves);
		addBlock(world, basePos, 5, 23, 8, domiguousLeaves);
		addBlock(world, basePos, 6, 23, 2, domiguousLeaves);
		addBlock(world, basePos, 6, 23, 3, domiguousLeaves);
		addBlock(world, basePos, 6, 23, 7, domiguousLeaves);
		addBlock(world, basePos, 6, 23, 8, domiguousLeaves);
		addBlock(world, basePos, 7, 23, 2, domiguousLeaves);
		addBlock(world, basePos, 7, 23, 3, domiguousLeaves);
		addBlock(world, basePos, 7, 23, 4, domiguousLeaves);
		addBlock(world, basePos, 7, 23, 5, domiguousLeaves);
		addBlock(world, basePos, 7, 23, 6, domiguousLeaves);
		addBlock(world, basePos, 7, 23, 7, domiguousLeaves);
		addBlock(world, basePos, 7, 23, 8, domiguousLeaves);
		addBlock(world, basePos, 8, 23, 2, domiguousLeaves);
		addBlock(world, basePos, 8, 23, 3, domiguousLeaves);
		addBlock(world, basePos, 8, 23, 4, domiguousLeaves);
		addBlock(world, basePos, 8, 23, 5, domiguousLeaves);
		addBlock(world, basePos, 8, 23, 6, domiguousLeaves);
		addBlock(world, basePos, 8, 23, 7, domiguousLeaves);
		addBlock(world, basePos, 8, 23, 8, domiguousLeaves);
		addBlock(world, basePos, 4, 24, 4, domiguousLeaves);
		addBlock(world, basePos, 4, 24, 5, domiguousLeaves);
		addBlock(world, basePos, 4, 24, 6, domiguousLeaves);
		addBlock(world, basePos, 5, 24, 4, domiguousLeaves);
		addBlock(world, basePos, 5, 24, 5, domiguousLeaves);
		addBlock(world, basePos, 5, 24, 6, domiguousLeaves);
		addBlock(world, basePos, 6, 24, 4, domiguousLeaves);
		addBlock(world, basePos, 6, 24, 5, domiguousLeaves);
		addBlock(world, basePos, 6, 24, 6, domiguousLeaves);
	}
}
