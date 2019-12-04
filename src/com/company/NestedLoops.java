package com.company;

import java.util.Scanner;

public class NestedLoops {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println(xSquare());
        System.out.println("Enter n:");
        int n=input.nextInt();
        System.out.println(xSquare2(n));

        System.out.println("Enter n:");
        int n2=input.nextInt();
        System.out.println(flippedTriangle(n2));

        System.out.println(multiplicationTable());
    }
    public static String xSquare(){
        String square ="";
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                square+="X";
            }
            square+="\n";
        }
        return square;
    }

    public static String xSquare2(int n){
        String square="";
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                square+="X";
            }
            square+="\n";
        }
        return square;
    }

    public static String flippedTriangle (int n){
        String tri="";
        for(int i=1;i<=n;i++){
            for(int j=n-i+1;j>=1;j--){
                tri+="*";
            }
            tri+="\n";
        }
        return tri;
    }

    public static String multiplicationTable(){
        String tab="";
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                if(i*j<=9){
                    tab+="  "+i*j;
                }else{
                    tab+=" "+i*j;
                }
            }
            tab+="\n";
        }
        return tab;
    }
}
