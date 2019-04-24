package net.tslat.aoa3.structure.haven;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.entity.npcs.lottoman.EntityTwinklingLottoman;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class FloatingLottoFountain extends AoAStructure { //StructureSize: 7x17x7
	private static final IBlockState crystalliteBricks = BlockRegister.bricksCrystallite.getDefaultState();
	private static final IBlockState glass = Blocks.GLASS.getDefaultState();
	private static final IBlockState water = Blocks.FLOWING_WATER.getDefaultState();

	public FloatingLottoFountain() {
		super("FloatingLottoFountain");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 0, 0, 0, crystalliteBricks);
		addBlock(world, basePos, 0, 0, 1, crystalliteBricks);
		addBlock(world, basePos, 0, 0, 2, crystalliteBricks);
		addBlock(world, basePos, 0, 0, 3, crystalliteBricks);
		addBlock(world, basePos, 0, 0, 4, crystalliteBricks);
		addBlock(world, basePos, 0, 0, 5, crystalliteBricks);
		addBlock(world, basePos, 0, 0, 6, crystalliteBricks);
		addBlock(world, basePos, 1, 0, 0, crystalliteBricks);
		addBlock(world, basePos, 1, 0, 1, glass);
		addBlock(world, basePos, 1, 0, 2, glass);
		addBlock(world, basePos, 1, 0, 3, glass);
		addBlock(world, basePos, 1, 0, 4, glass);
		addBlock(world, basePos, 1, 0, 5, glass);
		addBlock(world, basePos, 1, 0, 6, crystalliteBricks);
		addBlock(world, basePos, 2, 0, 0, crystalliteBricks);
		addBlock(world, basePos, 2, 0, 1, glass);
		addBlock(world, basePos, 2, 0, 2, crystalliteBricks);
		addBlock(world, basePos, 2, 0, 3, crystalliteBricks);
		addBlock(world, basePos, 2, 0, 4, crystalliteBricks);
		addBlock(world, basePos, 2, 0, 5, glass);
		addBlock(world, basePos, 2, 0, 6, crystalliteBricks);
		addBlock(world, basePos, 3, 0, 0, crystalliteBricks);
		addBlock(world, basePos, 3, 0, 1, glass);
		addBlock(world, basePos, 3, 0, 2, crystalliteBricks);
		addBlock(world, basePos, 3, 0, 3, crystalliteBricks);
		addBlock(world, basePos, 3, 0, 4, crystalliteBricks);
		addBlock(world, basePos, 3, 0, 5, glass);
		addBlock(world, basePos, 3, 0, 6, crystalliteBricks);
		addBlock(world, basePos, 4, 0, 0, crystalliteBricks);
		addBlock(world, basePos, 4, 0, 1, glass);
		addBlock(world, basePos, 4, 0, 2, crystalliteBricks);
		addBlock(world, basePos, 4, 0, 3, crystalliteBricks);
		addBlock(world, basePos, 4, 0, 4, crystalliteBricks);
		addBlock(world, basePos, 4, 0, 5, glass);
		addBlock(world, basePos, 4, 0, 6, crystalliteBricks);
		addBlock(world, basePos, 5, 0, 0, crystalliteBricks);
		addBlock(world, basePos, 5, 0, 1, glass);
		addBlock(world, basePos, 5, 0, 2, glass);
		addBlock(world, basePos, 5, 0, 3, glass);
		addBlock(world, basePos, 5, 0, 4, glass);
		addBlock(world, basePos, 5, 0, 5, glass);
		addBlock(world, basePos, 5, 0, 6, crystalliteBricks);
		addBlock(world, basePos, 6, 0, 0, crystalliteBricks);
		addBlock(world, basePos, 6, 0, 1, crystalliteBricks);
		addBlock(world, basePos, 6, 0, 2, crystalliteBricks);
		addBlock(world, basePos, 6, 0, 3, crystalliteBricks);
		addBlock(world, basePos, 6, 0, 4, crystalliteBricks);
		addBlock(world, basePos, 6, 0, 5, crystalliteBricks);
		addBlock(world, basePos, 6, 0, 6, crystalliteBricks);
		addBlock(world, basePos, 0, 1, 0, crystalliteBricks);
		addBlock(world, basePos, 0, 1, 1, crystalliteBricks);
		addBlock(world, basePos, 0, 1, 2, crystalliteBricks);
		addBlock(world, basePos, 0, 1, 3, crystalliteBricks);
		addBlock(world, basePos, 0, 1, 4, crystalliteBricks);
		addBlock(world, basePos, 0, 1, 5, crystalliteBricks);
		addBlock(world, basePos, 0, 1, 6, crystalliteBricks);
		addBlock(world, basePos, 1, 1, 0, crystalliteBricks);
		addBlock(world, basePos, 1, 1, 6, crystalliteBricks);
		addBlock(world, basePos, 2, 1, 0, crystalliteBricks);
		addBlock(world, basePos, 2, 1, 6, crystalliteBricks);
		addBlock(world, basePos, 3, 1, 0, crystalliteBricks);
		addBlock(world, basePos, 3, 1, 3, crystalliteBricks);
		addBlock(world, basePos, 3, 1, 4, water);
		addBlock(world, basePos, 3, 1, 5, water);
		addBlock(world, basePos, 3, 1, 6, crystalliteBricks);
		addBlock(world, basePos, 4, 1, 0, crystalliteBricks);
		addBlock(world, basePos, 4, 1, 6, crystalliteBricks);
		addBlock(world, basePos, 5, 1, 0, crystalliteBricks);
		addBlock(world, basePos, 5, 1, 6, crystalliteBricks);
		addBlock(world, basePos, 6, 1, 0, crystalliteBricks);
		addBlock(world, basePos, 6, 1, 1, crystalliteBricks);
		addBlock(world, basePos, 6, 1, 2, crystalliteBricks);
		addBlock(world, basePos, 6, 1, 3, crystalliteBricks);
		addBlock(world, basePos, 6, 1, 4, crystalliteBricks);
		addBlock(world, basePos, 6, 1, 5, crystalliteBricks);
		addBlock(world, basePos, 6, 1, 6, crystalliteBricks);
		addBlock(world, basePos, 3, 2, 3, crystalliteBricks);
		addBlock(world, basePos, 3, 3, 3, crystalliteBricks);
		addBlock(world, basePos, 3, 4, 3, crystalliteBricks);
		addBlock(world, basePos, 3, 5, 3, crystalliteBricks);
		addBlock(world, basePos, 3, 6, 3, crystalliteBricks);
		addBlock(world, basePos, 3, 7, 3, crystalliteBricks);
		addBlock(world, basePos, 3, 8, 3, crystalliteBricks);
		addBlock(world, basePos, 2, 9, 3, water);
		addBlock(world, basePos, 3, 9, 2, water);
		addBlock(world, basePos, 3, 9, 3, crystalliteBricks);
		addBlock(world, basePos, 3, 9, 4, water);
		addBlock(world, basePos, 4, 9, 3, water);
		addBlock(world, basePos, 0, 10, 0, crystalliteBricks);
		addBlock(world, basePos, 0, 10, 1, crystalliteBricks);
		addBlock(world, basePos, 0, 10, 2, crystalliteBricks);
		addBlock(world, basePos, 0, 10, 3, crystalliteBricks);
		addBlock(world, basePos, 0, 10, 4, crystalliteBricks);
		addBlock(world, basePos, 0, 10, 5, crystalliteBricks);
		addBlock(world, basePos, 0, 10, 6, crystalliteBricks);
		addBlock(world, basePos, 1, 10, 0, crystalliteBricks);
		addBlock(world, basePos, 1, 10, 1, glass);
		addBlock(world, basePos, 1, 10, 2, glass);
		addBlock(world, basePos, 1, 10, 3, glass);
		addBlock(world, basePos, 1, 10, 4, glass);
		addBlock(world, basePos, 1, 10, 5, glass);
		addBlock(world, basePos, 1, 10, 6, crystalliteBricks);
		addBlock(world, basePos, 2, 10, 0, crystalliteBricks);
		addBlock(world, basePos, 2, 10, 1, glass);
		addBlock(world, basePos, 2, 10, 2, crystalliteBricks);
		addBlock(world, basePos, 2, 10, 3, crystalliteBricks);
		addBlock(world, basePos, 2, 10, 4, crystalliteBricks);
		addBlock(world, basePos, 2, 10, 5, glass);
		addBlock(world, basePos, 2, 10, 6, crystalliteBricks);
		addBlock(world, basePos, 3, 10, 0, crystalliteBricks);
		addBlock(world, basePos, 3, 10, 1, glass);
		addBlock(world, basePos, 3, 10, 2, crystalliteBricks);
		addBlock(world, basePos, 3, 10, 3, crystalliteBricks);
		addBlock(world, basePos, 3, 10, 4, crystalliteBricks);
		addBlock(world, basePos, 3, 10, 5, glass);
		addBlock(world, basePos, 3, 10, 6, crystalliteBricks);
		addBlock(world, basePos, 4, 10, 0, crystalliteBricks);
		addBlock(world, basePos, 4, 10, 1, glass);
		addBlock(world, basePos, 4, 10, 2, crystalliteBricks);
		addBlock(world, basePos, 4, 10, 3, crystalliteBricks);
		addBlock(world, basePos, 4, 10, 4, crystalliteBricks);
		addBlock(world, basePos, 4, 10, 5, glass);
		addBlock(world, basePos, 4, 10, 6, crystalliteBricks);
		addBlock(world, basePos, 5, 10, 0, crystalliteBricks);
		addBlock(world, basePos, 5, 10, 1, glass);
		addBlock(world, basePos, 5, 10, 2, glass);
		addBlock(world, basePos, 5, 10, 3, glass);
		addBlock(world, basePos, 5, 10, 4, glass);
		addBlock(world, basePos, 5, 10, 5, glass);
		addBlock(world, basePos, 5, 10, 6, crystalliteBricks);
		addBlock(world, basePos, 6, 10, 0, crystalliteBricks);
		addBlock(world, basePos, 6, 10, 1, crystalliteBricks);
		addBlock(world, basePos, 6, 10, 2, crystalliteBricks);
		addBlock(world, basePos, 6, 10, 3, crystalliteBricks);
		addBlock(world, basePos, 6, 10, 4, crystalliteBricks);
		addBlock(world, basePos, 6, 10, 5, crystalliteBricks);
		addBlock(world, basePos, 6, 10, 6, crystalliteBricks);
		addBlock(world, basePos, 0, 11, 0, crystalliteBricks);
		addBlock(world, basePos, 0, 11, 1, glass);
		addBlock(world, basePos, 0, 11, 2, glass);
		addBlock(world, basePos, 0, 11, 3, glass);
		addBlock(world, basePos, 0, 11, 4, glass);
		addBlock(world, basePos, 0, 11, 5, glass);
		addBlock(world, basePos, 0, 11, 6, crystalliteBricks);
		addBlock(world, basePos, 1, 11, 0, glass);
		addBlock(world, basePos, 1, 11, 6, glass);
		addBlock(world, basePos, 2, 11, 0, glass);
		addBlock(world, basePos, 2, 11, 6, glass);
		addBlock(world, basePos, 3, 11, 0, glass);
		addBlock(world, basePos, 3, 11, 3, crystalliteBricks);
		addBlock(world, basePos, 3, 11, 6, glass);
		addBlock(world, basePos, 4, 11, 0, glass);
		addBlock(world, basePos, 4, 11, 6, glass);
		addBlock(world, basePos, 5, 11, 0, glass);
		addBlock(world, basePos, 5, 11, 6, glass);
		addBlock(world, basePos, 6, 11, 0, crystalliteBricks);
		addBlock(world, basePos, 6, 11, 1, glass);
		addBlock(world, basePos, 6, 11, 2, glass);
		addBlock(world, basePos, 6, 11, 3, glass);
		addBlock(world, basePos, 6, 11, 4, glass);
		addBlock(world, basePos, 6, 11, 5, glass);
		addBlock(world, basePos, 6, 11, 6, crystalliteBricks);
		addBlock(world, basePos, 3, 12, 3, crystalliteBricks);
		addBlock(world, basePos, 3, 13, 3, crystalliteBricks);
		addBlock(world, basePos, 2, 14, 2, glass);
		addBlock(world, basePos, 2, 14, 3, glass);
		addBlock(world, basePos, 2, 14, 4, glass);
		addBlock(world, basePos, 3, 14, 2, glass);
		addBlock(world, basePos, 3, 14, 3, crystalliteBricks);
		addBlock(world, basePos, 3, 14, 4, glass);
		addBlock(world, basePos, 4, 14, 2, glass);
		addBlock(world, basePos, 4, 14, 3, glass);
		addBlock(world, basePos, 4, 14, 4, glass);
		addBlock(world, basePos, 1, 15, 1, crystalliteBricks);
		addBlock(world, basePos, 1, 15, 2, crystalliteBricks);
		addBlock(world, basePos, 1, 15, 3, crystalliteBricks);
		addBlock(world, basePos, 1, 15, 4, crystalliteBricks);
		addBlock(world, basePos, 1, 15, 5, crystalliteBricks);
		addBlock(world, basePos, 2, 15, 1, crystalliteBricks);
		addBlock(world, basePos, 2, 15, 5, crystalliteBricks);
		addBlock(world, basePos, 3, 15, 1, crystalliteBricks);
		addBlock(world, basePos, 3, 15, 3, crystalliteBricks);
		addBlock(world, basePos, 3, 15, 5, crystalliteBricks);
		addBlock(world, basePos, 4, 15, 1, crystalliteBricks);
		addBlock(world, basePos, 4, 15, 5, crystalliteBricks);
		addBlock(world, basePos, 5, 15, 1, crystalliteBricks);
		addBlock(world, basePos, 5, 15, 2, crystalliteBricks);
		addBlock(world, basePos, 5, 15, 3, crystalliteBricks);
		addBlock(world, basePos, 5, 15, 4, crystalliteBricks);
		addBlock(world, basePos, 5, 15, 5, crystalliteBricks);
		addBlock(world, basePos, 3, 16, 3, water);
	}

	@Override
	protected void spawnEntities(World world, Random rand, BlockPos basePos) {
		EntityTwinklingLottoman lottoman = new EntityTwinklingLottoman(world);

		lottoman.setLocationAndAngles(basePos.getX() + 2, basePos.getY() + 11, basePos.getZ() + 2, rand.nextFloat() * 360, 0);
		world.spawnEntity(lottoman);
	}
}
