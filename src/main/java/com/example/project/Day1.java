package com.example.project;
import java.util.Random;
public class Day1{
    private static String[] elf_names = {"Glitter", "Chocolate","Tiny","Snowflake","Frosty"};
    
    public static String generateElfName(String name){
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        } else {
            Random random = new Random();
            int num = random.nextInt(elf_names.length);
            return elf_names[num]+ " " + name; 
        }
    }

    }

