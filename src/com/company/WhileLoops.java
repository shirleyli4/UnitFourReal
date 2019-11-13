package com.company;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        int a =20;
        int b=30;
        System.out.println(fromHereToThere(a, b));
        System.out.println(facotrs(a));
        System.out.println(countPosAndNed());
    }

    public static String fromHereToThere(int a, int b) {
        String list ="";
        int num=a;
       if(a>=b){
           return "Invalid input";
       }else{
           while(num<=b){
               list+=num+" ";
               num++;
           }
       }return list;
    }

    public static String facotrs(int a){
        int num = 1;
        String list ="";
        while(num<=a){
            if(a%num==0){
                list+=num+" ";
                num++;
            }else{
                num++;
            }
        }return list;
    }

    public static String countPosAndNed(){
        Scanner input = new Scanner (System.in);
        int posCount=0;
        int negCount=0;
        System.out.print("Enter a positive or negative number or 0 to quit: ");
        int num = input.nextInt();
        if(num>0){
            posCount++;
        }else if(num<0){
            negCount++;
        }
        //if the first num is 0
        if(num==0){
            return "You entered 0. There were 0 positive and 0 negative numbers.\n";
        }else {
            //other regular situation
            while (num != 0) {
                System.out.print("Enter a positive or negative number or 0 to quit: ");
                num = input.nextInt();
                if (num > 0) {
                    posCount++;
                } else if (num < 0) {
                    negCount++;
                }
            }
        }
        return "There were "+ posCount+" positive and "+negCount+" negative numbers.";
    }
}
