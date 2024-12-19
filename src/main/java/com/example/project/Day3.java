package com.example.project;

public class Day3 {
    public static String[][] generateSnowflake(int size) { 
        String[][] grid = new String[size][size];
        
        // creates grid for the snowflake. Creates rows and columns equal to the size.
        for (int i = 0; i < size; i++) { 
            for (int k = 0; k < size; k++) {
                grid[i][k] = " ";
            }
        }

        // inserts asterisks into the grid. Detects if size is an odd number, and gets the center. Then puts the asterisks at the center the on the ouside.
        if (size % 2 == 1) {
            int center = size / 2;
            for (int i = 0; i < size; i++) {
                grid[i][center] = "*";
                grid[center][i] = "*";
                grid[i][i] = "*";
                grid[i][size - i - 1] = "*";
            }
        }

        return grid;
    }

    // Prints the snowflake  will be useful if tests fail (you will not be tested on this method)
    public static void printSnowflake(String[][] snowflake) {
        
    }

    // Test for the snowflake generation
    public static void main(String[] args) {
    }
}
