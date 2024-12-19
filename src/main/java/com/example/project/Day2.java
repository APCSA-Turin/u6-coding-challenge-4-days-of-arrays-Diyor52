package com.example.project;
import java.util.Random;




public class Day2{
    public static String[][] nameSort(String[] names){
        Random rand = new Random();
        String[][]naughtyOrNice = new String[names.length][names.length];
        for(int i =0;i<names.length;i++){
            if(rand.nextInt(1) ==0){
                naughtyOrNice[0][i] = names[i];
            } else{
                naughtyOrNice[1][i]=names [i];
            }
        }
        return naughtyOrNice;
    }
}

