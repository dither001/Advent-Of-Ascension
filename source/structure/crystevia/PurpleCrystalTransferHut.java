package net.tslat.aoa3.structure.crystevia;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class PurpleCrystalTransferHut extends AoAStructure { //StructureSize: 11x10x11
	private static final IBlockState crystevianBricks = BlockRegister.bricksCrystevia.getDefaultState();
	private static final IBlockState purpleCrystal = BlockRegister.crystalPurple.getDefaultState();
	private static final IBlockState purpleCrystalPlant = BlockRegister.plantCrystalPurple.getDefaultState();
	private static final IBlockState purpleCrystalCreator = BlockRegister.crystalCreatorPurple.getDefaultState();

	public PurpleCrystalTransferHut() {
		super("PurpleCrystalTransferHut");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		int y = -1;

		while (world.getBlockState(basePos.add(5, y, 5)).getBlock() == Blocks.AIR) {
			addBlock(world, basePos, 5, y,5, purpleCrystal);
			y--;
		}

		addBlock(world, basePos, 0, 0, 0, crystevianBricks);
		addBlock(world, basePos, 0, 0, 1, crystevianBricks);
		addBlock(world, basePos, 0, 0, 2, crystevianBricks);
		addBlock(world, basePos, 0, 0, 3, crystevianBricks);
		addBlock(world, basePos, 0, 0, 4, crystevianBricks);
		addBlock(world, basePos, 0, 0, 5, crystevianBricks);
		addBlock(world, basePos, 0, 0, 6, crystevianBricks);
		addBlock(world, basePos, 0, 0, 7, crystevianBricks);
		addBlock(world, basePos, 0, 0, 8, crystevianBricks);
		addBlock(world, basePos, 0, 0, 9, crystevianBricks);
		addBlock(world, basePos, 0, 0, 10, crystevianBricks);
		addBlock(world, basePos, 1, 0, 0, crystevianBricks);
		addBlock(world, basePos, 1, 0, 1, crystevianBricks);
		addBlock(world, basePos, 1, 0, 2, crystevianBricks);
		addBlock(world, basePos, 1, 0, 3, crystevianBricks);
		addBlock(world, basePos, 1, 0, 4, crystevianBricks);
		addBlock(world, basePos, 1, 0, 5, crystevianBricks);
		addBlock(world, basePos, 1, 0, 6, crystevianBricks);
		addBlock(world, basePos, 1, 0, 7, crystevianBricks);
		addBlock(world, basePos, 1, 0, 8, crystevianBricks);
		addBlock(world, basePos, 1, 0, 9, crystevianBricks);
		addBlock(world, basePos, 1, 0, 10, crystevianBricks);
		addBlock(world, basePos, 2, 0, 0, crystevianBricks);
		addBlock(world, basePos, 2, 0, 1, crystevianBricks);
		addBlock(world, basePos, 2, 0, 2, crystevianBricks);
		addBlock(world, basePos, 2, 0, 3, crystevianBricks);
		addBlock(world, basePos, 2, 0, 4, crystevianBricks);
		addBlock(world, basePos, 2, 0, 5, crystevianBricks);
		addBlock(world, basePos, 2, 0, 6, crystevianBricks);
		addBlock(world, basePos, 2, 0, 7, crystevianBricks);
		addBlock(world, basePos, 2, 0, 8, crystevianBricks);
		addBlock(world, basePos, 2, 0, 9, crystevianBricks);
		addBlock(world, basePos, 2, 0, 10, crystevianBricks);
		addBlock(world, basePos, 3, 0, 0, crystevianBricks);
		addBlock(world, basePos, 3, 0, 1, crystevianBricks);
		addBlock(world, basePos, 3, 0, 2, crystevianBricks);
		addBlock(world, basePos, 3, 0, 3, crystevianBricks);
		addBlock(world, basePos, 3, 0, 4, crystevianBricks);
		addBlock(world, basePos, 3, 0, 5, crystevianBricks);
		addBlock(world, basePos, 3, 0, 6, crystevianBricks);
		addBlock(world, basePos, 3, 0, 7, crystevianBricks);
		addBlock(world, basePos, 3, 0, 8, crystevianBricks);
		addBlock(world, basePos, 3, 0, 9, crystevianBricks);
		addBlock(world, basePos, 3, 0, 10, crystevianBricks);
		addBlock(world, basePos, 4, 0, 0, crystevianBricks);
		addBlock(world, basePos, 4, 0, 1, crystevianBricks);
		addBlock(world, basePos, 4, 0, 2, crystevianBricks);
		addBlock(world, basePos, 4, 0, 3, crystevianBricks);
		addBlock(world, basePos, 4, 0, 4, crystevianBricks);
		addBlock(world, basePos, 4, 0, 5, crystevianBricks);
		addBlock(world, basePos, 4, 0, 6, crystevianBricks);
		addBlock(world, basePos, 4, 0, 7, crystevianBricks);
		addBlock(world, basePos, 4, 0, 8, crystevianBricks);
		addBlock(world, basePos, 4, 0, 9, crystevianBricks);
		addBlock(world, basePos, 4, 0, 10, crystevianBricks);
		addBlock(world, basePos, 5, 0, 0, crystevianBricks);
		addBlock(world, basePos, 5, 0, 1, crystevianBricks);
		addBlock(world, basePos, 5, 0, 2, crystevianBricks);
		addBlock(world, basePos, 5, 0, 3, crystevianBricks);
		addBlock(world, basePos, 5, 0, 4, crystevianBricks);
		addBlock(world, basePos, 5, 0, 5, crystevianBricks);
		addBlock(world, basePos, 5, 0, 6, crystevianBricks);
		addBlock(world, basePos, 5, 0, 7, crystevianBricks);
		addBlock(world, basePos, 5, 0, 8, crystevianBricks);
		addBlock(world, basePos, 5, 0, 9, crystevianBricks);
		addBlock(world, basePos, 5, 0, 10, crystevianBricks);
		addBlock(world, basePos, 6, 0, 0, crystevianBricks);
		addBlock(world, basePos, 6, 0, 1, crystevianBricks);
		addBlock(world, basePos, 6, 0, 2, crystevianBricks);
		addBlock(world, basePos, 6, 0, 3, crystevianBricks);
		addBlock(world, basePos, 6, 0, 4, crystevianBricks);
		addBlock(world, basePos, 6, 0, 5, crystevianBricks);
		addBlock(world, basePos, 6, 0, 6, crystevianBricks);
		addBlock(world, basePos, 6, 0, 7, crystevianBricks);
		addBlock(world, basePos, 6, 0, 8, crystevianBricks);
		addBlock(world, basePos, 6, 0, 9, crystevianBricks);
		addBlock(world, basePos, 6, 0, 10, crystevianBricks);
		addBlock(world, basePos, 7, 0, 0, crystevianBricks);
		addBlock(world, basePos, 7, 0, 1, crystevianBricks);
		addBlock(world, basePos, 7, 0, 2, crystevianBricks);
		addBlock(world, basePos, 7, 0, 3, crystevianBricks);
		addBlock(world, basePos, 7, 0, 4, crystevianBricks);
		addBlock(world, basePos, 7, 0, 5, crystevianBricks);
		addBlock(world, basePos, 7, 0, 6, crystevianBricks);
		addBlock(world, basePos, 7, 0, 7, crystevianBricks);
		addBlock(world, basePos, 7, 0, 8, crystevianBricks);
		addBlock(world, basePos, 7, 0, 9, crystevianBricks);
		addBlock(world, basePos, 7, 0, 10, crystevianBricks);
		addBlock(world, basePos, 8, 0, 0, crystevianBricks);
		addBlock(world, basePos, 8, 0, 1, crystevianBricks);
		addBlock(world, basePos, 8, 0, 2, crystevianBricks);
		addBlock(world, basePos, 8, 0, 3, crystevianBricks);
		addBlock(world, basePos, 8, 0, 4, crystevianBricks);
		addBlock(world, basePos, 8, 0, 5, crystevianBricks);
		addBlock(world, basePos, 8, 0, 6, crystevianBricks);
		addBlock(world, basePos, 8, 0, 7, crystevianBricks);
		addBlock(world, basePos, 8, 0, 8, crystevianBricks);
		addBlock(world, basePos, 8, 0, 9, crystevianBricks);
		addBlock(world, basePos, 8, 0, 10, crystevianBricks);
		addBlock(world, basePos, 9, 0, 0, crystevianBricks);
		addBlock(world, basePos, 9, 0, 1, crystevianBricks);
		addBlock(world, basePos, 9, 0, 2, crystevianBricks);
		addBlock(world, basePos, 9, 0, 3, crystevianBricks);
		addBlock(world, basePos, 9, 0, 4, crystevianBricks);
		addBlock(world, basePos, 9, 0, 5, crystevianBricks);
		addBlock(world, basePos, 9, 0, 6, crystevianBricks);
		addBlock(world, basePos, 9, 0, 7, crystevianBricks);
		addBlock(world, basePos, 9, 0, 8, crystevianBricks);
		addBlock(world, basePos, 9, 0, 9, crystevianBricks);
		addBlock(world, basePos, 9, 0, 10, crystevianBricks);
		addBlock(world, basePos, 10, 0, 0, crystevianBricks);
		addBlock(world, basePos, 10, 0, 1, crystevianBricks);
		addBlock(world, basePos, 10, 0, 2, crystevianBricks);
		addBlock(world, basePos, 10, 0, 3, crystevianBricks);
		addBlock(world, basePos, 10, 0, 4, crystevianBricks);
		addBlock(world, basePos, 10, 0, 5, crystevianBricks);
		addBlock(world, basePos, 10, 0, 6, crystevianBricks);
		addBlock(world, basePos, 10, 0, 7, crystevianBricks);
		addBlock(world, basePos, 10, 0, 8, crystevianBricks);
		addBlock(world, basePos, 10, 0, 9, crystevianBricks);
		addBlock(world, basePos, 10, 0, 10, crystevianBricks);
		addBlock(world, basePos, 0, 1, 0, crystevianBricks);
		addBlock(world, basePos, 0, 1, 1, crystevianBricks);
		addBlock(world, basePos, 0, 1, 2, crystevianBricks);
		addBlock(world, basePos, 0, 1, 3, crystevianBricks);
		addBlock(world, basePos, 0, 1, 7, crystevianBricks);
		addBlock(world, basePos, 0, 1, 8, crystevianBricks);
		addBlock(world, basePos, 0, 1, 9, crystevianBricks);
		addBlock(world, basePos, 0, 1, 10, crystevianBricks);
		addBlock(world, basePos, 1, 1, 0, crystevianBricks);
		addBlock(world, basePos, 1, 1, 10, crystevianBricks);
		addBlock(world, basePos, 2, 1, 0, crystevianBricks);
		addBlock(world, basePos, 2, 1, 10, crystevianBricks);
		addBlock(world, basePos, 3, 1, 0, crystevianBricks);
		addBlock(world, basePos, 3, 1, 5, crystevianBricks);
		addBlock(world, basePos, 3, 1, 10, crystevianBricks);
		addBlock(world, basePos, 5, 1, 3, crystevianBricks);
		addBlock(world, basePos, 5, 1, 5, purpleCrystalCreator);
		addBlock(world, basePos, 5, 1, 7, crystevianBricks);
		addBlock(world, basePos, 7, 1, 0, crystevianBricks);
		addBlock(world, basePos, 7, 1, 5, crystevianBricks);
		addBlock(world, basePos, 7, 1, 10, crystevianBricks);
		addBlock(world, basePos, 8, 1, 0, crystevianBricks);
		addBlock(world, basePos, 8, 1, 10, crystevianBricks);
		addBlock(world, basePos, 9, 1, 0, crystevianBricks);
		addBlock(world, basePos, 9, 1, 10, crystevianBricks);
		addBlock(world, basePos, 10, 1, 0, crystevianBricks);
		addBlock(world, basePos, 10, 1, 1, crystevianBricks);
		addBlock(world, basePos, 10, 1, 2, crystevianBricks);
		addBlock(world, basePos, 10, 1, 3, crystevianBricks);
		addBlock(world, basePos, 10, 1, 7, crystevianBricks);
		addBlock(world, basePos, 10, 1, 8, crystevianBricks);
		addBlock(world, basePos, 10, 1, 9, crystevianBricks);
		addBlock(world, basePos, 10, 1, 10, crystevianBricks);
		addBlock(world, basePos, 0, 2, 0, crystevianBricks);
		addBlock(world, basePos, 0, 2, 1, purpleCrystal);
		addBlock(world, basePos, 0, 2, 2, purpleCrystal);
		addBlock(world, basePos, 0, 2, 3, crystevianBricks);
		addBlock(world, basePos, 0, 2, 7, crystevianBricks);
		addBlock(world, basePos, 0, 2, 8, purpleCrystal);
		addBlock(world, basePos, 0, 2, 9, purpleCrystal);
		addBlock(world, basePos, 0, 2, 10, crystevianBricks);
		addBlock(world, basePos, 1, 2, 0, purpleCrystal);
		addBlock(world, basePos, 1, 2, 10, purpleCrystal);
		addBlock(world, basePos, 2, 2, 0, purpleCrystal);
		addBlock(world, basePos, 2, 2, 10, purpleCrystal);
		addBlock(world, basePos, 3, 2, 0, crystevianBricks);
		addBlock(world, basePos, 3, 2, 5, purpleCrystalPlant);
		addBlock(world, basePos, 3, 2, 10, crystevianBricks);
		addBlock(world, basePos, 5, 2, 3, purpleCrystalPlant);
		addBlock(world, basePos, 5, 2, 7, purpleCrystalPlant);
		addBlock(world, basePos, 7, 2, 0, crystevianBricks);
		addBlock(world, basePos, 7, 2, 5, purpleCrystalPlant);
		addBlock(world, basePos, 7, 2, 10, crystevianBricks);
		addBlock(world, basePos, 8, 2, 0, purpleCrystal);
		addBlock(world, basePos, 8, 2, 10, purpleCrystal);
		addBlock(world, basePos, 9, 2, 0, purpleCrystal);
		addBlock(world, basePos, 9, 2, 10, purpleCrystal);
		addBlock(world, basePos, 10, 2, 0, crystevianBricks);
		addBlock(world, basePos, 10, 2, 1, purpleCrystal);
		addBlock(world, basePos, 10, 2, 2, purpleCrystal);
		addBlock(world, basePos, 10, 2, 3, crystevianBricks);
		addBlock(world, basePos, 10, 2, 7, crystevianBricks);
		addBlock(world, basePos, 10, 2, 8, purpleCrystal);
		addBlock(world, basePos, 10, 2, 9, purpleCrystal);
		addBlock(world, basePos, 10, 2, 10, crystevianBricks);
		addBlock(world, basePos, 0, 3, 0, crystevianBricks);
		addBlock(world, basePos, 0, 3, 1, purpleCrystal);
		addBlock(world, basePos, 0, 3, 2, purpleCrystal);
		addBlock(world, basePos, 0, 3, 3, crystevianBricks);
		addBlock(world, basePos, 0, 3, 7, crystevianBricks);
		addBlock(world, basePos, 0, 3, 8, purpleCrystal);
		addBlock(world, basePos, 0, 3, 9, purpleCrystal);
		addBlock(world, basePos, 0, 3, 10, crystevianBricks);
		addBlock(world, basePos, 1, 3, 0, purpleCrystal);
		addBlock(world, basePos, 1, 3, 10, purpleCrystal);
		addBlock(world, basePos, 2, 3, 0, purpleCrystal);
		addBlock(world, basePos, 2, 3, 10, purpleCrystal);
		addBlock(world, basePos, 3, 3, 0, crystevianBricks);
		addBlock(world, basePos, 3, 3, 10, crystevianBricks);
		addBlock(world, basePos, 7, 3, 0, crystevianBricks);
		addBlock(world, basePos, 7, 3, 10, crystevianBricks);
		addBlock(world, basePos, 8, 3, 0, purpleCrystal);
		addBlock(world, basePos, 8, 3, 10, purpleCrystal);
		addBlock(world, basePos, 9, 3, 0, purpleCrystal);
		addBlock(world, basePos, 9, 3, 10, purpleCrystal);
		addBlock(world, basePos, 10, 3, 0, crystevianBricks);
		addBlock(world, basePos, 10, 3, 1, purpleCrystal);
		addBlock(world, basePos, 10, 3, 2, purpleCrystal);
		addBlock(world, basePos, 10, 3, 3, crystevianBricks);
		addBlock(world, basePos, 10, 3, 7, crystevianBricks);
		addBlock(world, basePos, 10, 3, 8, purpleCrystal);
		addBlock(world, basePos, 10, 3, 9, purpleCrystal);
		addBlock(world, basePos, 10, 3, 10, crystevianBricks);
		addBlock(world, basePos, 0, 4, 0, crystevianBricks);
		addBlock(world, basePos, 0, 4, 1, crystevianBricks);
		addBlock(world, basePos, 0, 4, 2, crystevianBricks);
		addBlock(world, basePos, 0, 4, 3, crystevianBricks);
		addBlock(world, basePos, 0, 4, 4, crystevianBricks);
		addBlock(world, basePos, 0, 4, 5, crystevianBricks);
		addBlock(world, basePos, 0, 4, 6, crystevianBricks);
		addBlock(world, basePos, 0, 4, 7, crystevianBricks);
		addBlock(world, basePos, 0, 4, 8, crystevianBricks);
		addBlock(world, basePos, 0, 4, 9, crystevianBricks);
		addBlock(world, basePos, 0, 4, 10, crystevianBricks);
		addBlock(world, basePos, 1, 4, 0, crystevianBricks);
		addBlock(world, basePos, 1, 4, 10, crystevianBricks);
		addBlock(world, basePos, 2, 4, 0, crystevianBricks);
		addBlock(world, basePos, 2, 4, 10, crystevianBricks);
		addBlock(world, basePos, 3, 4, 0, crystevianBricks);
		addBlock(world, basePos, 3, 4, 10, crystevianBricks);
		addBlock(world, basePos, 4, 4, 0, crystevianBricks);
		addBlock(world, basePos, 4, 4, 10, crystevianBricks);
		addBlock(world, basePos, 5, 4, 0, crystevianBricks);
		addBlock(world, basePos, 5, 4, 10, crystevianBricks);
		addBlock(world, basePos, 6, 4, 0, crystevianBricks);
		addBlock(world, basePos, 6, 4, 10, crystevianBricks);
		addBlock(world, basePos, 7, 4, 0, crystevianBricks);
		addBlock(world, basePos, 7, 4, 10, crystevianBricks);
		addBlock(world, basePos, 8, 4, 0, crystevianBricks);
		addBlock(world, basePos, 8, 4, 10, crystevianBricks);
		addBlock(world, basePos, 9, 4, 0, crystevianBricks);
		addBlock(world, basePos, 9, 4, 10, crystevianBricks);
		addBlock(world, basePos, 10, 4, 0, crystevianBricks);
		addBlock(world, basePos, 10, 4, 1, crystevianBricks);
		addBlock(world, basePos, 10, 4, 2, crystevianBricks);
		addBlock(world, basePos, 10, 4, 3, crystevianBricks);
		addBlock(world, basePos, 10, 4, 4, crystevianBricks);
		addBlock(world, basePos, 10, 4, 5, crystevianBricks);
		addBlock(world, basePos, 10, 4, 6, crystevianBricks);
		addBlock(world, basePos, 10, 4, 7, crystevianBricks);
		addBlock(world, basePos, 10, 4, 8, crystevianBricks);
		addBlock(world, basePos, 10, 4, 9, crystevianBricks);
		addBlock(world, basePos, 10, 4, 10, crystevianBricks);
		addBlock(world, basePos, 0, 5, 1, crystevianBricks);
		addBlock(world, basePos, 0, 5, 2, purpleCrystal);
		addBlock(world, basePos, 0, 5, 3, crystevianBricks);
		addBlock(world, basePos, 0, 5, 4, purpleCrystal);
		addBlock(world, basePos, 0, 5, 5, crystevianBricks);
		addBlock(world, basePos, 0, 5, 6, purpleCrystal);
		addBlock(world, basePos, 0, 5, 7, crystevianBricks);
		addBlock(world, basePos, 0, 5, 8, purpleCrystal);
		addBlock(world, basePos, 0, 5, 9, crystevianBricks);
		addBlock(world, basePos, 1, 5, 0, crystevianBricks);
		addBlock(world, basePos, 1, 5, 10, crystevianBricks);
		addBlock(world, basePos, 2, 5, 0, purpleCrystal);
		addBlock(world, basePos, 2, 5, 10, purpleCrystal);
		addBlock(world, basePos, 3, 5, 0, crystevianBricks);
		addBlock(world, basePos, 3, 5, 10, crystevianBricks);
		addBlock(world, basePos, 4, 5, 0, purpleCrystal);
		addBlock(world, basePos, 4, 5, 10, purpleCrystal);
		addBlock(world, basePos, 5, 5, 0, crystevianBricks);
		addBlock(world, basePos, 5, 5, 10, crystevianBricks);
		addBlock(world, basePos, 6, 5, 0, purpleCrystal);
		addBlock(world, basePos, 6, 5, 10, purpleCrystal);
		addBlock(world, basePos, 7, 5, 0, crystevianBricks);
		addBlock(world, basePos, 7, 5, 10, crystevianBricks);
		addBlock(world, basePos, 8, 5, 0, purpleCrystal);
		addBlock(world, basePos, 8, 5, 10, purpleCrystal);
		addBlock(world, basePos, 9, 5, 0, crystevianBricks);
		addBlock(world, basePos, 9, 5, 10, crystevianBricks);
		addBlock(world, basePos, 10, 5, 1, crystevianBricks);
		addBlock(world, basePos, 10, 5, 2, purpleCrystal);
		addBlock(world, basePos, 10, 5, 3, crystevianBricks);
		addBlock(world, basePos, 10, 5, 4, purpleCrystal);
		addBlock(world, basePos, 10, 5, 5, crystevianBricks);
		addBlock(world, basePos, 10, 5, 6, purpleCrystal);
		addBlock(world, basePos, 10, 5, 7, crystevianBricks);
		addBlock(world, basePos, 10, 5, 8, purpleCrystal);
		addBlock(world, basePos, 10, 5, 9, crystevianBricks);
		addBlock(world, basePos, 0, 6, 2, crystevianBricks);
		addBlock(world, basePos, 0, 6, 3, crystevianBricks);
		addBlock(world, basePos, 0, 6, 4, purpleCrystal);
		addBlock(world, basePos, 0, 6, 5, crystevianBricks);
		addBlock(world, basePos, 0, 6, 6, purpleCrystal);
		addBlock(world, basePos, 0, 6, 7, crystevianBricks);
		addBlock(world, basePos, 0, 6, 8, crystevianBricks);
		addBlock(world, basePos, 1, 6, 1, crystevianBricks);
		addBlock(world, basePos, 1, 6, 9, crystevianBricks);
		addBlock(world, basePos, 2, 6, 0, crystevianBricks);
		addBlock(world, basePos, 2, 6, 10, crystevianBricks);
		addBlock(world, basePos, 3, 6, 0, crystevianBricks);
		addBlock(world, basePos, 3, 6, 10, crystevianBricks);
		addBlock(world, basePos, 4, 6, 0, purpleCrystal);
		addBlock(world, basePos, 4, 6, 10, purpleCrystal);
		addBlock(world, basePos, 5, 6, 0, crystevianBricks);
		addBlock(world, basePos, 5, 6, 10, crystevianBricks);
		addBlock(world, basePos, 6, 6, 0, purpleCrystal);
		addBlock(world, basePos, 6, 6, 10, purpleCrystal);
		addBlock(world, basePos, 7, 6, 0, crystevianBricks);
		addBlock(world, basePos, 7, 6, 10, crystevianBricks);
		addBlock(world, basePos, 8, 6, 0, crystevianBricks);
		addBlock(world, basePos, 8, 6, 10, crystevianBricks);
		addBlock(world, basePos, 9, 6, 1, crystevianBricks);
		addBlock(world, basePos, 9, 6, 9, crystevianBricks);
		addBlock(world, basePos, 10, 6, 2, crystevianBricks);
		addBlock(world, basePos, 10, 6, 3, crystevianBricks);
		addBlock(world, basePos, 10, 6, 4, purpleCrystal);
		addBlock(world, basePos, 10, 6, 5, crystevianBricks);
		addBlock(world, basePos, 10, 6, 6, purpleCrystal);
		addBlock(world, basePos, 10, 6, 7, crystevianBricks);
		addBlock(world, basePos, 10, 6, 8, crystevianBricks);
		addBlock(world, basePos, 0, 7, 4, crystevianBricks);
		addBlock(world, basePos, 0, 7, 5, crystevianBricks);
		addBlock(world, basePos, 0, 7, 6, crystevianBricks);
		addBlock(world, basePos, 1, 7, 2, crystevianBricks);
		addBlock(world, basePos, 1, 7, 3, crystevianBricks);
		addBlock(world, basePos, 1, 7, 7, crystevianBricks);
		addBlock(world, basePos, 1, 7, 8, crystevianBricks);
		addBlock(world, basePos, 2, 7, 1, crystevianBricks);
		addBlock(world, basePos, 2, 7, 9, crystevianBricks);
		addBlock(world, basePos, 3, 7, 1, crystevianBricks);
		addBlock(world, basePos, 3, 7, 9, crystevianBricks);
		addBlock(world, basePos, 4, 7, 0, crystevianBricks);
		addBlock(world, basePos, 4, 7, 10, crystevianBricks);
		addBlock(world, basePos, 5, 7, 0, crystevianBricks);
		addBlock(world, basePos, 5, 7, 10, crystevianBricks);
		addBlock(world, basePos, 6, 7, 0, crystevianBricks);
		addBlock(world, basePos, 6, 7, 10, crystevianBricks);
		addBlock(world, basePos, 7, 7, 1, crystevianBricks);
		addBlock(world, basePos, 7, 7, 9, crystevianBricks);
		addBlock(world, basePos, 8, 7, 1, crystevianBricks);
		addBlock(world, basePos, 8, 7, 9, crystevianBricks);
		addBlock(world, basePos, 9, 7, 2, crystevianBricks);
		addBlock(world, basePos, 9, 7, 3, crystevianBricks);
		addBlock(world, basePos, 9, 7, 7, crystevianBricks);
		addBlock(world, basePos, 9, 7, 8, crystevianBricks);
		addBlock(world, basePos, 10, 7, 4, crystevianBricks);
		addBlock(world, basePos, 10, 7, 5, crystevianBricks);
		addBlock(world, basePos, 10, 7, 6, crystevianBricks);
		addBlock(world, basePos, 1, 8, 4, crystevianBricks);
		addBlock(world, basePos, 1, 8, 5, crystevianBricks);
		addBlock(world, basePos, 1, 8, 6, crystevianBricks);
		addBlock(world, basePos, 2, 8, 2, crystevianBricks);
		addBlock(world, basePos, 2, 8, 3, crystevianBricks);
		addBlock(world, basePos, 2, 8, 4, crystevianBricks);
		addBlock(world, basePos, 2, 8, 5, purpleCrystal);
		addBlock(world, basePos, 2, 8, 6, crystevianBricks);
		addBlock(world, basePos, 2, 8, 7, crystevianBricks);
		addBlock(world, basePos, 2, 8, 8, crystevianBricks);
		addBlock(world, basePos, 3, 8, 2, crystevianBricks);
		addBlock(world, basePos, 3, 8, 3, purpleCrystal);
		addBlock(world, basePos, 3, 8, 4, purpleCrystal);
		addBlock(world, basePos, 3, 8, 5, purpleCrystal);
		addBlock(world, basePos, 3, 8, 6, purpleCrystal);
		addBlock(world, basePos, 3, 8, 7, purpleCrystal);
		addBlock(world, basePos, 3, 8, 8, crystevianBricks);
		addBlock(world, basePos, 4, 8, 1, crystevianBricks);
		addBlock(world, basePos, 4, 8, 2, crystevianBricks);
		addBlock(world, basePos, 4, 8, 3, purpleCrystal);
		addBlock(world, basePos, 4, 8, 4, crystevianBricks);
		addBlock(world, basePos, 4, 8, 5, purpleCrystal);
		addBlock(world, basePos, 4, 8, 6, crystevianBricks);
		addBlock(world, basePos, 4, 8, 7, purpleCrystal);
		addBlock(world, basePos, 4, 8, 8, crystevianBricks);
		addBlock(world, basePos, 4, 8, 9, crystevianBricks);
		addBlock(world, basePos, 5, 8, 1, crystevianBricks);
		addBlock(world, basePos, 5, 8, 2, purpleCrystal);
		addBlock(world, basePos, 5, 8, 3, purpleCrystal);
		addBlock(world, basePos, 5, 8, 4, purpleCrystal);
		addBlock(world, basePos, 5, 8, 5, purpleCrystal);
		addBlock(world, basePos, 5, 8, 6, purpleCrystal);
		addBlock(world, basePos, 5, 8, 7, purpleCrystal);
		addBlock(world, basePos, 5, 8, 8, purpleCrystal);
		addBlock(world, basePos, 5, 8, 9, crystevianBricks);
		addBlock(world, basePos, 6, 8, 1, crystevianBricks);
		addBlock(world, basePos, 6, 8, 2, crystevianBricks);
		addBlock(world, basePos, 6, 8, 3, purpleCrystal);
		addBlock(world, basePos, 6, 8, 4, crystevianBricks);
		addBlock(world, basePos, 6, 8, 5, purpleCrystal);
		addBlock(world, basePos, 6, 8, 6, crystevianBricks);
		addBlock(world, basePos, 6, 8, 7, purpleCrystal);
		addBlock(world, basePos, 6, 8, 8, crystevianBricks);
		addBlock(world, basePos, 6, 8, 9, crystevianBricks);
		addBlock(world, basePos, 7, 8, 2, crystevianBricks);
		addBlock(world, basePos, 7, 8, 3, purpleCrystal);
		addBlock(world, basePos, 7, 8, 4, purpleCrystal);
		addBlock(world, basePos, 7, 8, 5, purpleCrystal);
		addBlock(world, basePos, 7, 8, 6, purpleCrystal);
		addBlock(world, basePos, 7, 8, 7, purpleCrystal);
		addBlock(world, basePos, 7, 8, 8, crystevianBricks);
		addBlock(world, basePos, 8, 8, 2, crystevianBricks);
		addBlock(world, basePos, 8, 8, 3, crystevianBricks);
		addBlock(world, basePos, 8, 8, 4, crystevianBricks);
		addBlock(world, basePos, 8, 8, 5, purpleCrystal);
		addBlock(world, basePos, 8, 8, 6, crystevianBricks);
		addBlock(world, basePos, 8, 8, 7, crystevianBricks);
		addBlock(world, basePos, 8, 8, 8, crystevianBricks);
		addBlock(world, basePos, 9, 8, 4, crystevianBricks);
		addBlock(world, basePos, 9, 8, 5, crystevianBricks);
		addBlock(world, basePos, 9, 8, 6, crystevianBricks);
		addBlock(world, basePos, 2, 9, 4, crystevianBricks);
		addBlock(world, basePos, 2, 9, 6, crystevianBricks);
		addBlock(world, basePos, 3, 9, 4, purpleCrystal);
		addBlock(world, basePos, 3, 9, 6, purpleCrystal);
		addBlock(world, basePos, 4, 9, 2, crystevianBricks);
		addBlock(world, basePos, 4, 9, 3, purpleCrystal);
		addBlock(world, basePos, 4, 9, 4, crystevianBricks);
		addBlock(world, basePos, 4, 9, 5, purpleCrystal);
		addBlock(world, basePos, 4, 9, 6, crystevianBricks);
		addBlock(world, basePos, 4, 9, 7, purpleCrystal);
		addBlock(world, basePos, 4, 9, 8, crystevianBricks);
		addBlock(world, basePos, 5, 9, 4, purpleCrystal);
		addBlock(world, basePos, 5, 9, 6, purpleCrystal);
		addBlock(world, basePos, 6, 9, 2, crystevianBricks);
		addBlock(world, basePos, 6, 9, 3, purpleCrystal);
		addBlock(world, basePos, 6, 9, 4, crystevianBricks);
		addBlock(world, basePos, 6, 9, 5, purpleCrystal);
		addBlock(world, basePos, 6, 9, 6, crystevianBricks);
		addBlock(world, basePos, 6, 9, 7, purpleCrystal);
		addBlock(world, basePos, 6, 9, 8, crystevianBricks);
		addBlock(world, basePos, 7, 9, 4, purpleCrystal);
		addBlock(world, basePos, 7, 9, 6, purpleCrystal);
		addBlock(world, basePos, 8, 9, 4, crystevianBricks);
		addBlock(world, basePos, 8, 9, 6, crystevianBricks);
	}
}
