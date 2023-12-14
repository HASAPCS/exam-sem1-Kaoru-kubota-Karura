package com.example;

import java.util.List;

public class FuelDepot {
    /** The robot used to move the filling mechanism */
    private FuelRobot filler;

    /** The list of fuel tanks */
    private List<FuelTank> tanks;

    /**
     * Constructs a FuelDepot object.
     *
     * @param filler The robot used to move the filling mechanism.
     * @param tanks  The list of fuel tanks.
     */
    public FuelDepot(FuelRobot filler, List<FuelTank> tanks) {
        this.filler = filler;
        this.tanks = tanks;
    }

    // Method to implement for a)
    public int nextTankToFill(int threshold) {
        // Your implementation here
        int tankWithLeast = 0;
    
        for (int i = 1; i < tanks.size(); i++)
            if (tanks.get(i).getFuelLevel() < tanks.get(tankWithLeast).getFuelLevel())
                tankWithLeast = i;
    
        if (tanks.get(tankWithLeast).getFuelLevel() <= threshold)
            return tankWithLeast;
        else
            return filler.getCurrentIndex();
    }

    // Method to implement for b)
    public void moveToLocation(int locIndex) {
        // Your implementation here
        if (locIndex == filler.getCurrentIndex())
        return;

        if ((locIndex < filler.getCurrentIndex() && filler.isFacingRight())
                || (locIndex > filler.getCurrentIndex() && !filler.isFacingRight()))
            filler.changeDirection();

        filler.moveForward(Math.abs(locIndex - filler.getCurrentIndex()));
    }
}
