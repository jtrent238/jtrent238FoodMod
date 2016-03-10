package com.jtrent238.foodmod;

import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.IFluidTank;

public class PotionTankInfo {
    public final FluidStack fluid;
    public final int capacity;

    public PotionTankInfo(FluidStack fluid, int capacity)
    {
        this.fluid = fluid;
        this.capacity = capacity;
    }

    public PotionTankInfo(IFluidTank tank)
    {
        this.fluid = tank.getFluid();
        this.capacity = tank.getCapacity();
    }
}