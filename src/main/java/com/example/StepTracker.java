package com.example;

public class StepTracker
{
    private final int minStepsActive;
    private int activeDays;
    private int days;
    private int totalSteps;

    public StepTracker(int minStepsActive)
    {
        this.minStepsActive = minStepsActive;
        activeDays = 0;
        days = 0;
        totalSteps = 0;
    }

    public void addDailySteps(int steps)
    {
        if(steps >= minStepsActive)
            activeDays++;

        days++;
        totalSteps += steps;
    }

    public int activeDays()
    {
        return activeDays;
    }

    public double averageSteps()
    {
        if(days == 0)
            return 0;

        return totalSteps / (double) days;
    }
}