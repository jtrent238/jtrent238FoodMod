package com.jtrent238.foodmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidContainerRegistry.FluidContainerData;

public class BlockPotionTank extends Block{

	protected BlockPotionTank(Material iron) {
		super(iron);
	}
	
	/**
     * Register a new fluid containing item that does not have an empty container.
     *
     * @param stack
     *            FluidStack containing the type and amount of the fluid stored in the item.
     * @param filledContainer
     *            ItemStack representing the container when it is full.
     * @return True if container was successfully registered; false if it already is, or an invalid parameter was passed.
     */
    public static boolean registerFluidContainer(FluidStack stack, ItemStack filledContainer)
    {
        return registerFluidContainer(new FluidContainerData(stack, filledContainer, null, true));
    }
	private static boolean registerFluidContainer(FluidContainerData fluidContainerData) {
		return true;
	}
}
