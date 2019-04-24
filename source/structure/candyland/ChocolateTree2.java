package net.tslat.aoa3.structure.candyland;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class ChocolateTree2 extends AoAStructure { //StructureSize: 7x25x7
	private static final IBlockState chocolate = BlockRegister.chocolateBlock.getDefaultState();
	private static final IBlockState darkChocolate = BlockRegister.chocolateBlockDark.getDefaultState();

	public ChocolateTree2() {
		super("ChocolateTree2");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 3, 0, 3, darkChocolate);
		addBlock(world, basePos, 3, 1, 3, darkChocolate);
		addBlock(world, basePos, 3, 2, 3, darkChocolate);
		addBlock(world, basePos, 3, 3, 3, darkChocolate);
		addBlock(world, basePos, 3, 4, 3, darkChocolate);
		addBlock(world, basePos, 3, 5, 3, darkChocolate);
		addBlock(world, basePos, 0, 6, 0, chocolate);
		addBlock(world, basePos, 0, 6, 1, chocolate);
		addBlock(world, basePos, 0, 6, 2, chocolate);
		addBlock(world, basePos, 0, 6, 3, chocolate);
		addBlock(world, basePos, 0, 6, 4, chocolate);
		addBlock(world, basePos, 0, 6, 5, chocolate);
		addBlock(world, basePos, 0, 6, 6, chocolate);
		addBlock(world, basePos, 1, 6, 0, chocolate);
		addBlock(world, basePos, 1, 6, 1, chocolate);
		addBlock(world, basePos, 1, 6, 2, chocolate);
		addBlock(world, basePos, 1, 6, 3, chocolate);
		addBlock(world, basePos, 1, 6, 4, chocolate);
		addBlock(world, basePos, 1, 6, 5, chocolate);
		addBlock(world, basePos, 1, 6, 6, chocolate);
		addBlock(world, basePos, 2, 6, 0, chocolate);
		addBlock(world, basePos, 2, 6, 1, chocolate);
		addBlock(world, basePos, 2, 6, 2, chocolate);
		addBlock(world, basePos, 2, 6, 3, chocolate);
		addBlock(world, basePos, 2, 6, 4, chocolate);
		addBlock(world, basePos, 2, 6, 5, chocolate);
		addBlock(world, basePos, 2, 6, 6, chocolate);
		addBlock(world, basePos, 3, 6, 0, chocolate);
		addBlock(world, basePos, 3, 6, 1, chocolate);
		addBlock(world, basePos, 3, 6, 2, chocolate);
		addBlock(world, basePos, 3, 6, 3, darkChocolate);
		addBlock(world, basePos, 3, 6, 4, chocolate);
		addBlock(world, basePos, 3, 6, 5, chocolate);
		addBlock(world, basePos, 3, 6, 6, chocolate);
		addBlock(world, basePos, 4, 6, 0, chocolate);
		addBlock(world, basePos, 4, 6, 1, chocolate);
		addBlock(world, basePos, 4, 6, 2, chocolate);
		addBlock(world, basePos, 4, 6, 3, chocolate);
		addBlock(world, basePos, 4, 6, 4, chocolate);
		addBlock(world, basePos, 4, 6, 5, chocolate);
		addBlock(world, basePos, 4, 6, 6, chocolate);
		addBlock(world, basePos, 5, 6, 0, chocolate);
		addBlock(world, basePos, 5, 6, 1, chocolate);
		addBlock(world, basePos, 5, 6, 2, chocolate);
		addBlock(world, basePos, 5, 6, 3, chocolate);
		addBlock(world, basePos, 5, 6, 4, chocolate);
		addBlock(world, basePos, 5, 6, 5, chocolate);
		addBlock(world, basePos, 5, 6, 6, chocolate);
		addBlock(world, basePos, 6, 6, 0, chocolate);
		addBlock(world, basePos, 6, 6, 1, chocolate);
		addBlock(world, basePos, 6, 6, 2, chocolate);
		addBlock(world, basePos, 6, 6, 3, chocolate);
		addBlock(world, basePos, 6, 6, 4, chocolate);
		addBlock(world, basePos, 6, 6, 5, chocolate);
		addBlock(world, basePos, 6, 6, 6, chocolate);
		addBlock(world, basePos, 1, 7, 1, chocolate);
		addBlock(world, basePos, 1, 7, 2, chocolate);
		addBlock(world, basePos, 1, 7, 3, chocolate);
		addBlock(world, basePos, 1, 7, 4, chocolate);
		addBlock(world, basePos, 1, 7, 5, chocolate);
		addBlock(world, basePos, 2, 7, 1, chocolate);
		addBlock(world, basePos, 2, 7, 2, chocolate);
		addBlock(world, basePos, 2, 7, 3, chocolate);
		addBlock(world, basePos, 2, 7, 4, chocolate);
		addBlock(world, basePos, 2, 7, 5, chocolate);
		addBlock(world, basePos, 3, 7, 1, chocolate);
		addBlock(world, basePos, 3, 7, 2, chocolate);
		addBlock(world, basePos, 3, 7, 3, darkChocolate);
		addBlock(world, basePos, 3, 7, 4, chocolate);
		addBlock(world, basePos, 3, 7, 5, chocolate);
		addBlock(world, basePos, 4, 7, 1, chocolate);
		addBlock(world, basePos, 4, 7, 2, chocolate);
		addBlock(world, basePos, 4, 7, 3, chocolate);
		addBlock(world, basePos, 4, 7, 4, chocolate);
		addBlock(world, basePos, 4, 7, 5, chocolate);
		addBlock(world, basePos, 5, 7, 1, chocolate);
		addBlock(world, basePos, 5, 7, 2, chocolate);
		addBlock(world, basePos, 5, 7, 3, chocolate);
		addBlock(world, basePos, 5, 7, 4, chocolate);
		addBlock(world, basePos, 5, 7, 5, chocolate);
		addBlock(world, basePos, 2, 8, 2, chocolate);
		addBlock(world, basePos, 2, 8, 3, chocolate);
		addBlock(world, basePos, 2, 8, 4, chocolate);
		addBlock(world, basePos, 3, 8, 2, chocolate);
		addBlock(world, basePos, 3, 8, 3, darkChocolate);
		addBlock(world, basePos, 3, 8, 4, chocolate);
		addBlock(world, basePos, 4, 8, 2, chocolate);
		addBlock(world, basePos, 4, 8, 3, chocolate);
		addBlock(world, basePos, 4, 8, 4, chocolate);
		addBlock(world, basePos, 3, 9, 3, darkChocolate);
		addBlock(world, basePos, 0, 10, 0, chocolate);
		addBlock(world, basePos, 0, 10, 1, chocolate);
		addBlock(world, basePos, 0, 10, 2, chocolate);
		addBlock(world, basePos, 0, 10, 3, chocolate);
		addBlock(world, basePos, 0, 10, 4, chocolate);
		addBlock(world, basePos, 0, 10, 5, chocolate);
		addBlock(world, basePos, 0, 10, 6, chocolate);
		addBlock(world, basePos, 1, 10, 0, chocolate);
		addBlock(world, basePos, 1, 10, 1, chocolate);
		addBlock(world, basePos, 1, 10, 2, chocolate);
		addBlock(world, basePos, 1, 10, 3, chocolate);
		addBlock(world, basePos, 1, 10, 4, chocolate);
		addBlock(world, basePos, 1, 10, 5, chocolate);
		addBlock(world, basePos, 1, 10, 6, chocolate);
		addBlock(world, basePos, 2, 10, 0, chocolate);
		addBlock(world, basePos, 2, 10, 1, chocolate);
		addBlock(world, basePos, 2, 10, 2, chocolate);
		addBlock(world, basePos, 2, 10, 3, chocolate);
		addBlock(world, basePos, 2, 10, 4, chocolate);
		addBlock(world, basePos, 2, 10, 5, chocolate);
		addBlock(world, basePos, 2, 10, 6, chocolate);
		addBlock(world, basePos, 3, 10, 0, chocolate);
		addBlock(world, basePos, 3, 10, 1, chocolate);
		addBlock(world, basePos, 3, 10, 2, chocolate);
		addBlock(world, basePos, 3, 10, 3, darkChocolate);
		addBlock(world, basePos, 3, 10, 4, chocolate);
		addBlock(world, basePos, 3, 10, 5, chocolate);
		addBlock(world, basePos, 3, 10, 6, chocolate);
		addBlock(world, basePos, 4, 10, 0, chocolate);
		addBlock(world, basePos, 4, 10, 1, chocolate);
		addBlock(world, basePos, 4, 10, 2, chocolate);
		addBlock(world, basePos, 4, 10, 3, chocolate);
		addBlock(world, basePos, 4, 10, 4, chocolate);
		addBlock(world, basePos, 4, 10, 5, chocolate);
		addBlock(world, basePos, 4, 10, 6, chocolate);
		addBlock(world, basePos, 5, 10, 0, chocolate);
		addBlock(world, basePos, 5, 10, 1, chocolate);
		addBlock(world, basePos, 5, 10, 2, chocolate);
		addBlock(world, basePos, 5, 10, 3, chocolate);
		addBlock(world, basePos, 5, 10, 4, chocolate);
		addBlock(world, basePos, 5, 10, 5, chocolate);
		addBlock(world, basePos, 5, 10, 6, chocolate);
		addBlock(world, basePos, 6, 10, 0, chocolate);
		addBlock(world, basePos, 6, 10, 1, chocolate);
		addBlock(world, basePos, 6, 10, 2, chocolate);
		addBlock(world, basePos, 6, 10, 3, chocolate);
		addBlock(world, basePos, 6, 10, 4, chocolate);
		addBlock(world, basePos, 6, 10, 5, chocolate);
		addBlock(world, basePos, 6, 10, 6, chocolate);
		addBlock(world, basePos, 1, 11, 1, chocolate);
		addBlock(world, basePos, 1, 11, 2, chocolate);
		addBlock(world, basePos, 1, 11, 3, chocolate);
		addBlock(world, basePos, 1, 11, 4, chocolate);
		addBlock(world, basePos, 1, 11, 5, chocolate);
		addBlock(world, basePos, 2, 11, 1, chocolate);
		addBlock(world, basePos, 2, 11, 2, chocolate);
		addBlock(world, basePos, 2, 11, 3, chocolate);
		addBlock(world, basePos, 2, 11, 4, chocolate);
		addBlock(world, basePos, 2, 11, 5, chocolate);
		addBlock(world, basePos, 3, 11, 1, chocolate);
		addBlock(world, basePos, 3, 11, 2, chocolate);
		addBlock(world, basePos, 3, 11, 3, darkChocolate);
		addBlock(world, basePos, 3, 11, 4, chocolate);
		addBlock(world, basePos, 3, 11, 5, chocolate);
		addBlock(world, basePos, 4, 11, 1, chocolate);
		addBlock(world, basePos, 4, 11, 2, chocolate);
		addBlock(world, basePos, 4, 11, 3, chocolate);
		addBlock(world, basePos, 4, 11, 4, chocolate);
		addBlock(world, basePos, 4, 11, 5, chocolate);
		addBlock(world, basePos, 5, 11, 1, chocolate);
		addBlock(world, basePos, 5, 11, 2, chocolate);
		addBlock(world, basePos, 5, 11, 3, chocolate);
		addBlock(world, basePos, 5, 11, 4, chocolate);
		addBlock(world, basePos, 5, 11, 5, chocolate);
		addBlock(world, basePos, 2, 12, 2, chocolate);
		addBlock(world, basePos, 2, 12, 3, chocolate);
		addBlock(world, basePos, 2, 12, 4, chocolate);
		addBlock(world, basePos, 3, 12, 2, chocolate);
		addBlock(world, basePos, 3, 12, 3, darkChocolate);
		addBlock(world, basePos, 3, 12, 4, chocolate);
		addBlock(world, basePos, 4, 12, 2, chocolate);
		addBlock(world, basePos, 4, 12, 3, chocolate);
		addBlock(world, basePos, 4, 12, 4, chocolate);
		addBlock(world, basePos, 3, 13, 3, darkChocolate);
		addBlock(world, basePos, 1, 14, 1, chocolate);
		addBlock(world, basePos, 1, 14, 2, chocolate);
		addBlock(world, basePos, 1, 14, 3, chocolate);
		addBlock(world, basePos, 1, 14, 4, chocolate);
		addBlock(world, basePos, 1, 14, 5, chocolate);
		addBlock(world, basePos, 2, 14, 1, chocolate);
		addBlock(world, basePos, 2, 14, 2, chocolate);
		addBlock(world, basePos, 2, 14, 3, chocolate);
		addBlock(world, basePos, 2, 14, 4, chocolate);
		addBlock(world, basePos, 2, 14, 5, chocolate);
		addBlock(world, basePos, 3, 14, 1, chocolate);
		addBlock(world, basePos, 3, 14, 2, chocolate);
		addBlock(world, basePos, 3, 14, 3, darkChocolate);
		addBlock(world, basePos, 3, 14, 4, chocolate);
		addBlock(world, basePos, 3, 14, 5, chocolate);
		addBlock(world, basePos, 4, 14, 1, chocolate);
		addBlock(world, basePos, 4, 14, 2, chocolate);
		addBlock(world, basePos, 4, 14, 3, chocolate);
		addBlock(world, basePos, 4, 14, 4, chocolate);
		addBlock(world, basePos, 4, 14, 5, chocolate);
		addBlock(world, basePos, 5, 14, 1, chocolate);
		addBlock(world, basePos, 5, 14, 2, chocolate);
		addBlock(world, basePos, 5, 14, 3, chocolate);
		addBlock(world, basePos, 5, 14, 4, chocolate);
		addBlock(world, basePos, 5, 14, 5, chocolate);
		addBlock(world, basePos, 2, 15, 2, chocolate);
		addBlock(world, basePos, 2, 15, 3, chocolate);
		addBlock(world, basePos, 2, 15, 4, chocolate);
		addBlock(world, basePos, 3, 15, 2, chocolate);
		addBlock(world, basePos, 3, 15, 3, darkChocolate);
		addBlock(world, basePos, 3, 15, 4, chocolate);
		addBlock(world, basePos, 4, 15, 2, chocolate);
		addBlock(world, basePos, 4, 15, 3, chocolate);
		addBlock(world, basePos, 4, 15, 4, chocolate);
		addBlock(world, basePos, 3, 16, 3, darkChocolate);
		addBlock(world, basePos, 1, 17, 1, chocolate);
		addBlock(world, basePos, 1, 17, 2, chocolate);
		addBlock(world, basePos, 1, 17, 3, chocolate);
		addBlock(world, basePos, 1, 17, 4, chocolate);
		addBlock(world, basePos, 1, 17, 5, chocolate);
		addBlock(world, basePos, 2, 17, 1, chocolate);
		addBlock(world, basePos, 2, 17, 2, chocolate);
		addBlock(world, basePos, 2, 17, 3, chocolate);
		addBlock(world, basePos, 2, 17, 4, chocolate);
		addBlock(world, basePos, 2, 17, 5, chocolate);
		addBlock(world, basePos, 3, 17, 1, chocolate);
		addBlock(world, basePos, 3, 17, 2, chocolate);
		addBlock(world, basePos, 3, 17, 3, darkChocolate);
		addBlock(world, basePos, 3, 17, 4, chocolate);
		addBlock(world, basePos, 3, 17, 5, chocolate);
		addBlock(world, basePos, 4, 17, 1, chocolate);
		addBlock(world, basePos, 4, 17, 2, chocolate);
		addBlock(world, basePos, 4, 17, 3, chocolate);
		addBlock(world, basePos, 4, 17, 4, chocolate);
		addBlock(world, basePos, 4, 17, 5, chocolate);
		addBlock(world, basePos, 5, 17, 1, chocolate);
		addBlock(world, basePos, 5, 17, 2, chocolate);
		addBlock(world, basePos, 5, 17, 3, chocolate);
		addBlock(world, basePos, 5, 17, 4, chocolate);
		addBlock(world, basePos, 5, 17, 5, chocolate);
		addBlock(world, basePos, 2, 18, 2, chocolate);
		addBlock(world, basePos, 2, 18, 3, chocolate);
		addBlock(world, basePos, 2, 18, 4, chocolate);
		addBlock(world, basePos, 3, 18, 2, chocolate);
		addBlock(world, basePos, 3, 18, 3, darkChocolate);
		addBlock(world, basePos, 3, 18, 4, chocolate);
		addBlock(world, basePos, 4, 18, 2, chocolate);
		addBlock(world, basePos, 4, 18, 3, chocolate);
		addBlock(world, basePos, 4, 18, 4, chocolate);
		addBlock(world, basePos, 3, 19, 3, darkChocolate);
		addBlock(world, basePos, 1, 20, 1, chocolate);
		addBlock(world, basePos, 1, 20, 2, chocolate);
		addBlock(world, basePos, 1, 20, 3, chocolate);
		addBlock(world, basePos, 1, 20, 4, chocolate);
		addBlock(world, basePos, 1, 20, 5, chocolate);
		addBlock(world, basePos, 2, 20, 1, chocolate);
		addBlock(world, basePos, 2, 20, 2, chocolate);
		addBlock(world, basePos, 2, 20, 3, chocolate);
		addBlock(world, basePos, 2, 20, 4, chocolate);
		addBlock(world, basePos, 2, 20, 5, chocolate);
		addBlock(world, basePos, 3, 20, 1, chocolate);
		addBlock(world, basePos, 3, 20, 2, chocolate);
		addBlock(world, basePos, 3, 20, 3, darkChocolate);
		addBlock(world, basePos, 3, 20, 4, chocolate);
		addBlock(world, basePos, 3, 20, 5, chocolate);
		addBlock(world, basePos, 4, 20, 1, chocolate);
		addBlock(world, basePos, 4, 20, 2, chocolate);
		addBlock(world, basePos, 4, 20, 3, chocolate);
		addBlock(world, basePos, 4, 20, 4, chocolate);
		addBlock(world, basePos, 4, 20, 5, chocolate);
		addBlock(world, basePos, 5, 20, 1, chocolate);
		addBlock(world, basePos, 5, 20, 2, chocolate);
		addBlock(world, basePos, 5, 20, 3, chocolate);
		addBlock(world, basePos, 5, 20, 4, chocolate);
		addBlock(world, basePos, 5, 20, 5, chocolate);
		addBlock(world, basePos, 2, 21, 2, chocolate);
		addBlock(world, basePos, 2, 21, 3, chocolate);
		addBlock(world, basePos, 2, 21, 4, chocolate);
		addBlock(world, basePos, 3, 21, 2, chocolate);
		addBlock(world, basePos, 3, 21, 3, darkChocolate);
		addBlock(world, basePos, 3, 21, 4, chocolate);
		addBlock(world, basePos, 4, 21, 2, chocolate);
		addBlock(world, basePos, 4, 21, 3, chocolate);
		addBlock(world, basePos, 4, 21, 4, chocolate);
		addBlock(world, basePos, 3, 22, 3, darkChocolate);
		addBlock(world, basePos, 2, 23, 2, chocolate);
		addBlock(world, basePos, 2, 23, 3, chocolate);
		addBlock(world, basePos, 2, 23, 4, chocolate);
		addBlock(world, basePos, 3, 23, 2, chocolate);
		addBlock(world, basePos, 3, 23, 3, chocolate);
		addBlock(world, basePos, 3, 23, 4, chocolate);
		addBlock(world, basePos, 4, 23, 2, chocolate);
		addBlock(world, basePos, 4, 23, 3, chocolate);
		addBlock(world, basePos, 4, 23, 4, chocolate);
		addBlock(world, basePos, 3, 24, 3, chocolate);
	}
}
