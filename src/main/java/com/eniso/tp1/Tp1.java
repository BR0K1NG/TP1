/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eniso.tp1;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

/**
 *
 * @author eniso2020-2023
 */
public class Tp1 {

    public static void main(String[] args) {
        System.out.println("Hello,mon premier TP en POO");
        System.out.println("Quelle est votre nom?");
        Scanner read = new Scanner(System.in);
        String name = read.next();
        
        System.out.println();
        System.out.println("Bonjour " + name);
        System.out.println("Quelle est votre age " + name + "?");
        read = new Scanner(System.in);
        int a;
        a = read.nextInt();
        System.out.println( name + " votre age est "+ a); 
        
        int[][] image= {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(calculteProbability(image)));
        double entropy= calculteEntropy(image);
        System.out.println(entropy);
        
        

    }
    public static double[] calculteProbability(int[][] image) {
        int occ = 0;
        double[] T = new double [256];
        for (int i =0;i<256;i++){
            for (int k=0;k<image.length;k++){
                for(int j=0;j<image[0].length;j++){
                    if (image[k][j]==i) {
                        occ+=1;
                    }
                }
            }
            T[i] =   occ/ (image.length*image[0].length);
        }
        return T;
       
           
       }
    
    public static double calculteEntropy(int[][] image) {
        double H=0;
        double[] T = calculteProbability(image);
        for (int i=0;i<256;i++){
            if (T[i]!=0) {
            H += T[i]*(Math.log(T[i])/Math.log(2)) ;}
        }
        return H;    
        }
    
    }
