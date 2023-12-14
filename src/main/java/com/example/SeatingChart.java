package com.example;

import java.util.List;

public class SeatingChart {
    private Student[][] seats;

    // Constructor to implement a)
    public SeatingChart(List<Student> studentList, int rows, int cols) {
        // Your Implementation here
        seats = new Student[rows][cols];

        int NoName = 0;

        for(int c = 0; c < seats[0].length; c++)
        {
            for(int r = 0; r < seats.length; r++)
            {
                if(NoName < studentList.size())
                {
                    seats[r][c] = studentList.get(NoName);
                    NoName++;
                }
            }
        }
    }

    // Method to implement b)
    public int removeAbsentStudents(int allowedAbsences) {
        // Your Implementation here
        int removed = 0;

        for(int r = 0; r < seats.length; r++)
        {
            for(int c = 0; c < seats[0].length; c++)
            {
                if(seats[r][c] != null && seats[r][c].getAbsenceCount() > allowedAbsences)
                {
                    seats[r][c] = null;
                    removed++;
                }
            }
        }

        // return;
        return removed;
    }

    public Student[][] getSeats() {
        return seats;
    }
}
