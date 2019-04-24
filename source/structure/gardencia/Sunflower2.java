package net.tslat.aoa3.structure.gardencia;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class Sunflower2 extends AoAStructure { //StructureSize: 11x16x3
	private static final IBlockState yellowPetals = BlockRegister.petalsYellow.getDefaultState();
	private static final IBlockState stem = BlockRegister.plantStem.getDefaultState();
	private static final IBlockState flowerCore = BlockRegister.flowerCore.getDefaultState();

	public Sunflower2() {
		super("Sunflower2");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 5, 0, 1, stem);
		addBlock(world, basePos, 5, 1, 1, stem);
		addBlock(world, basePos, 5, 2, 1, stem);
		addBlock(world, basePos, 5, 3, 1, stem);
		addBlock(world, basePos, 5, 4, 1, stem);
		addBlock(world, basePos, 4, 5, 1, yellowPetals);
		addBlock(world, basePos, 4, 5, 2, yellowPetals);
		addBlock(world, basePos, 5, 5, 1, stem);
		addBlock(world, basePos, 6, 5, 1, yellowPetals);
		addBlock(world, basePos, 6, 5, 2, yellowPetals);
		addBlock(world, basePos, 3, 6, 1, yellowPetals);
		addBlock(world, basePos, 3, 6, 2, yellowPetals);
		addBlock(world, basePos, 4, 6, 1, yellowPetals);
		addBlock(world, basePos, 4, 6, 2, yellowPetals);
		addBlock(world, basePos, 5, 6, 1, stem);
		addBlock(world, basePos, 5, 6, 2, yellowPetals);
		addBlock(world, basePos, 6, 6, 1, yellowPetals);
		addBlock(world, basePos, 6, 6, 2, yellowPetals);
		addBlock(world, basePos, 7, 6, 1, yellowPetals);
		addBlock(world, basePos, 7, 6, 2, yellowPetals);
		addBlock(world, basePos, 2, 7, 1, yellowPetals);
		addBlock(world, basePos, 2, 7, 2, yellowPetals);
		addBlock(world, basePos, 3, 7, 1, yellowPetals);
		addBlock(world, basePos, 3, 7, 2, yellowPetals);
		addBlock(world, basePos, 4, 7, 0, yellowPetals);
		addBlock(world, basePos, 4, 7, 1, flowerCore);
		addBlock(world, basePos, 5, 7, 0, yellowPetals);
		addBlock(world, basePos, 5, 7, 1, flowerCore);
		addBlock(world, basePos, 6, 7, 0, yellowPetals);
		addBlock(world, basePos, 6, 7, 1, flowerCore);
		addBlock(world, basePos, 7, 7, 1, yellowPetals);
		addBlock(world, basePos, 7, 7, 2, yellowPetals);
		addBlock(world, basePos, 8, 7, 1, yellowPetals);
		addBlock(world, basePos, 8, 7, 2, yellowPetals);
		addBlock(world, basePos, 1, 8, 1, yellowPetals);
		addBlock(world, basePos, 1, 8, 2, yellowPetals);
		addBlock(world, basePos, 2, 8, 1, yellowPetals);
		addBlock(world, basePos, 2, 8, 2, yellowPetals);
		addBlock(world, basePos, 3, 8, 0, yellowPetals);
		addBlock(world, basePos, 3, 8, 1, flowerCore);
		addBlock(world, basePos, 4, 8, 0, yellowPetals);
		addBlock(world, basePos, 4, 8, 1, flowerCore);
		addBlock(world, basePos, 5, 8, 0, yellowPetals);
		addBlock(world, basePos, 5, 8, 1, flowerCore);
		addBlock(world, basePos, 6, 8, 0, yellowPetals);
		addBlock(world, basePos, 6, 8, 1, flowerCore);
		addBlock(world, basePos, 7, 8, 0, yellowPetals);
		addBlock(world, basePos, 7, 8, 1, flowerCore);
		addBlock(world, basePos, 8, 8, 1, yellowPetals);
		addBlock(world, basePos, 8, 8, 2, yellowPetals);
		addBlock(world, basePos, 9, 8, 1, yellowPetals);
		addBlock(world, basePos, 9, 8, 2, yellowPetals);
		addBlock(world, basePos, 0, 9, 1, yellowPetals);
		addBlock(world, basePos, 0, 9, 2, yellowPetals);
		addBlock(world, basePos, 1, 9, 1, yellowPetals);
		addBlock(world, basePos, 1, 9, 2, yellowPetals);
		addBlock(world, basePos, 2, 9, 0, yellowPetals);
		addBlock(world, basePos, 2, 9, 1, flowerCore);
		addBlock(world, basePos, 3, 9, 0, yellowPetals);
		addBlock(world, basePos, 3, 9, 1, flowerCore);
		addBlock(world, basePos, 4, 9, 0, yellowPetals);
		addBlock(world, basePos, 4, 9, 1, flowerCore);
		addBlock(world, basePos, 5, 9, 0, yellowPetals);
		addBlock(world, basePos, 5, 9, 1, flowerCore);
		addBlock(world, basePos, 6, 9, 0, yellowPetals);
		addBlock(world, basePos, 6, 9, 1, flowerCore);
		addBlock(world, basePos, 7, 9, 0, yellowPetals);
		addBlock(world, basePos, 7, 9, 1, flowerCore);
		addBlock(world, basePos, 8, 9, 0, yellowPetals);
		addBlock(world, basePos, 8, 9, 1, flowerCore);
		addBlock(world, basePos, 9, 9, 1, yellowPetals);
		addBlock(world, basePos, 9, 9, 2, yellowPetals);
		addBlock(world, basePos, 10, 9, 1, yellowPetals);
		addBlock(world, basePos, 10, 9, 2, yellowPetals);
		addBlock(world, basePos, 1, 10, 1, yellowPetals);
		addBlock(world, basePos, 1, 10, 2, yellowPetals);
		addBlock(world, basePos, 2, 10, 0, yellowPetals);
		addBlock(world, basePos, 2, 10, 1, flowerCore);
		addBlock(world, basePos, 3, 10, 0, yellowPetals);
		addBlock(world, basePos, 3, 10, 1, flowerCore);
		addBlock(world, basePos, 4, 10, 0, yellowPetals);
		addBlock(world, basePos, 4, 10, 1, flowerCore);
		addBlock(world, basePos, 5, 10, 0, yellowPetals);
		addBlock(world, basePos, 5, 10, 1, flowerCore);
		addBlock(world, basePos, 6, 10, 0, yellowPetals);
		addBlock(world, basePos, 6, 10, 1, flowerCore);
		addBlock(world, basePos, 7, 10, 0, yellowPetals);
		addBlock(world, basePos, 7, 10, 1, flowerCore);
		addBlock(world, basePos, 8, 10, 0, yellowPetals);
		addBlock(world, basePos, 8, 10, 1, flowerCore);
		addBlock(world, basePos, 9, 10, 1, yellowPetals);
		addBlock(world, basePos, 9, 10, 2, yellowPetals);
		addBlock(world, basePos, 0, 11, 1, yellowPetals);
		addBlock(world, basePos, 0, 11, 2, yellowPetals);
		addBlock(world, basePos, 1, 11, 1, yellowPetals);
		addBlock(world, basePos, 1, 11, 2, yellowPetals);
		addBlock(world, basePos, 2, 11, 0, yellowPetals);
		addBlock(world, basePos, 2, 11, 1, flowerCore);
		addBlock(world, basePos, 3, 11, 0, yellowPetals);
		addBlock(world, basePos, 3, 11, 1, flowerCore);
		addBlock(world, basePos, 4, 11, 0, yellowPetals);
		addBlock(world, basePos, 4, 11, 1, flowerCore);
		addBlock(world, basePos, 5, 11, 0, yellowPetals);
		addBlock(world, basePos, 5, 11, 1, flowerCore);
		addBlock(world, basePos, 6, 11, 0, yellowPetals);
		addBlock(world, basePos, 6, 11, 1, flowerCore);
		addBlock(world, basePos, 7, 11, 0, yellowPetals);
		addBlock(world, basePos, 7, 11, 1, flowerCore);
		addBlock(world, basePos, 8, 11, 0, yellowPetals);
		addBlock(world, basePos, 8, 11, 1, flowerCore);
		addBlock(world, basePos, 9, 11, 1, yellowPetals);
		addBlock(world, basePos, 9, 11, 2, yellowPetals);
		addBlock(world, basePos, 10, 11, 1, yellowPetals);
		addBlock(world, basePos, 10, 11, 2, yellowPetals);
		addBlock(world, basePos, 1, 12, 1, yellowPetals);
		addBlock(world, basePos, 1, 12, 2, yellowPetals);
		addBlock(world, basePos, 2, 12, 1, yellowPetals);
		addBlock(world, basePos, 2, 12, 2, yellowPetals);
		addBlock(world, basePos, 3, 12, 0, yellowPetals);
		addBlock(world, basePos, 3, 12, 1, flowerCore);
		addBlock(world, basePos, 4, 12, 0, yellowPetals);
		addBlock(world, basePos, 4, 12, 1, flowerCore);
		addBlock(world, basePos, 5, 12, 0, yellowPetals);
		addBlock(world, basePos, 5, 12, 1, flowerCore);
		addBlock(world, basePos, 6, 12, 0, yellowPetals);
		addBlock(world, basePos, 6, 12, 1, flowerCore);
		addBlock(world, basePos, 7, 12, 0, yellowPetals);
		addBlock(world, basePos, 7, 12, 1, flowerCore);
		addBlock(world, basePos, 8, 12, 1, yellowPetals);
		addBlock(world, basePos, 8, 12, 2, yellowPetals);
		addBlock(world, basePos, 9, 12, 1, yellowPetals);
		addBlock(world, basePos, 9, 12, 2, yellowPetals);
		addBlock(world, basePos, 2, 13, 1, yellowPetals);
		addBlock(world, basePos, 2, 13, 2, yellowPetals);
		addBlock(world, basePos, 3, 13, 1, yellowPetals);
		addBlock(world, basePos, 3, 13, 2, yellowPetals);
		addBlock(world, basePos, 4, 13, 0, yellowPetals);
		addBlock(world, basePos, 4, 13, 1, flowerCore);
		addBlock(world, basePos, 5, 13, 0, yellowPetals);
		addBlock(world, basePos, 5, 13, 1, flowerCore);
		addBlock(world, basePos, 6, 13, 0, yellowPetals);
		addBlock(world, basePos, 6, 13, 1, flowerCore);
		addBlock(world, basePos, 7, 13, 1, yellowPetals);
		addBlock(world, basePos, 7, 13, 2, yellowPetals);
		addBlock(world, basePos, 8, 13, 1, yellowPetals);
		addBlock(world, basePos, 8, 13, 2, yellowPetals);
		addBlock(world, basePos, 3, 14, 1, yellowPetals);
		addBlock(world, basePos, 3, 14, 2, yellowPetals);
		addBlock(world, basePos, 4, 14, 1, yellowPetals);
		addBlock(world, basePos, 4, 14, 2, yellowPetals);
		addBlock(world, basePos, 5, 14, 1, yellowPetals);
		addBlock(world, basePos, 5, 14, 2, yellowPetals);
		addBlock(world, basePos, 6, 14, 1, yellowPetals);
		addBlock(world, basePos, 6, 14, 2, yellowPetals);
		addBlock(world, basePos, 7, 14, 1, yellowPetals);
		addBlock(world, basePos, 7, 14, 2, yellowPetals);
		addBlock(world, basePos, 4, 15, 1, yellowPetals);
		addBlock(world, basePos, 4, 15, 2, yellowPetals);
		addBlock(world, basePos, 6, 15, 1, yellowPetals);
		addBlock(world, basePos, 6, 15, 2, yellowPetals);
	}
}
