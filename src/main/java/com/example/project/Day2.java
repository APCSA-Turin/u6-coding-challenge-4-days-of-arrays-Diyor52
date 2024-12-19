
// package com.example.project;
// import java.util.Random;


// public class Day2{
//     public static String[][] nameSort(String[] names){
//         Random rand = new Random();
//         String[][]naughtyOrNice = new String[names.length][names.length];
//         for(int i =0;i<names.length;i++){
//             if(rand.nextInt(1) ==0){
//                 naughtyOrNice[0][i] = names[i];
//             } else{
//                 naughtyOrNice[1][i]=names [i];
//             }
//         }
//         return naughtyOrNice;
//     }
// }
// /*public class Day2{
//     public static String[][] nameSort(String[] names){ // your will be tested on this method
//         String[]nice = new String[names.length];
//         String[]naughty = new String[names.length];
//         int idx = 0;
//         int lengthOfNice = 0;
//         int lengthOfNaughty = 0; 
//         for (int i =0; i <names.length;i++){
//            int random = (int)(Math.random() * 2 + 0);
//            if (random == 0){
//                 naughty[i] = names[i];
//                 lengthOfNaughty++;
//                 idx++;
//            }
//            if (random ==1){
//                 nice[i] = names[i];
//                 lengthOfNice++;
//                 idx++;
//            }
//         }
//         String[] newNice = new String[lengthOfNice];
//         String[] newNaughty = new String[lengthOfNaughty];

//         for(int i =0; i<lengthOfNice;i++){
//             newNice[i] = names[i];
//         }
//         for (int k=0; k<lengthOfNaughty; k++){
//             newNaughty[k]= naughty[k];
//         }
//         String[][] list = {nice,naughty};
//         return list; //you must return a two dimensional string array
//     }
// }*/

// // public class Day2 {
// //     public static String[][] nameSort(String[] names) {
// //         String[] nice = new String[names.length];
// //         String[] naughty = new String[names.length];
// //         int lengthOfNice = 0;
// //         int lengthOfNaughty = 0; 
        
// //         for (int i = 0; i < names.length; i++) {
// //             int random = (int) (Math.random() * 2);
// //             if (random == 0) {
// //                 naughty[lengthOfNaughty] = names[i];
// //                 lengthOfNaughty++;
// //             } else {
// //                 nice[lengthOfNice] = names[i];
// //                 lengthOfNice++;
// //             }
// //         }
        
// //         String[] newNice = new String[lengthOfNice];
// //         String[] newNaughty = new String[lengthOfNaughty];

// //         for (int i = 0; i < lengthOfNice; i++) {
// //             newNice[i] = nice[i];
// //         }
// //         for (int i = 0; i < lengthOfNaughty; i++) {
// //             newNaughty[i] = naughty[i];
// //         }
        
// //         String[][] list = { newNice, newNaughty };
// //         return list;
// //     }
// // }

    
//     // public static String[][] nameSort(String[] names){ 
//     //     int countNaughty;
//     //     int countNice;
//     //     String[][] NaughtOrNice = new String[names.length];
//     //     for (int i = 0; i < names.length; i++){
//     //        int random = (int)(Math.random() * 2);
//     //        if (random == 0){
//     //             NaughtyNice[1][countNaughty] = names[i];
//     //             lengthOfNaughty++;
//     //        }
//     //        if (random == 1){
//     //             NaughtyOrNice[1][countNice] = names[i];
//     //             lengthOfNice++;
//     //        }
//     //     }
//     //     for (j = 0; j < 2; j++) {
//     //     for (int k = 0; k < names.length; k++){
//     //        
//     //        

    
