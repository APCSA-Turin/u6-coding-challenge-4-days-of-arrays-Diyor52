package com.example.project;
import java.util.Random;

public class Day4 {
    
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute
        private String name;
        private int distanceTraveled;
        private int speed;
        private int runDuration;
        private int restDuration;

        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name = name;
            this.speed = speed;
            this.runDuration = runDuration;
            this.restDuration = restDuration;
            distanceTraveled = 0;
        }

        public int getDistanceTraveled(){ // this method is required
            return distanceTraveled;
        }
        

        public void simulateSecond(){ //this method is required but not tested
            if (runDuration > 0) {
                runDuration --;
                distanceTraveled += speed;
            }
            else {
                restDuration --;
            }
        }

        public String getName() {
            return name;
        }

    }

    public static String simulateRace(int time, Reindeer[] reindeers){ //you will be tested on this method
        int maxDistance = 0;
        String winner = null;

        for (int i = 0; i < reindeers.length; i++) {
            for (int k = 0; k< time; k++) {
                reindeers[i].simulateSecond();
            }
            if (reindeers[i].getDistanceTraveled() > maxDistance) {
                maxDistance = reindeers[i].getDistanceTraveled();
                winner = reindeers[i].getName();
            }
        }
        return winner;
    }

    
    public static void main(String[] args) { // for testing purposed
       
    }
}


