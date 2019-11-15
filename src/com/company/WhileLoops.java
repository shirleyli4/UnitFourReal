package com.company;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        int a =20;
        int b=30;
        System.out.println(fromHereToThere(a, b));
        System.out.println(facotrs(a));
        System.out.println(countPosAndNed());
        System.out.println(findMinAndMax());
        System.out.println(gradePoint());
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

    public static String findMinAndMax(){
        Scanner input = new Scanner(System.in);
        int num = 0;
        int max;
        int min;
        //the first round of asking
        System.out.print("Number: ");
        int val = input.nextInt();
        max=val;
        min=val;
        while (num < 4){
            System.out.print("Number: ");
            val = input.nextInt();
            if (val > max) {
                max = val;
            }
            else if (val<min){
                min = val;
            }
            num++;
        }
        return "Max value is: "+max +"\n"+"Min value is: "+min;
    }

    public static String gradePoint(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter seven letter grades(A,B,C,D, or F)");
        int num = 0;
        double sum =0;
        String a = "A";
        String b = "B";
        String c = "C";
        String d = "D";
        String f = "F";
        String grade;
        double val;
        while(num<=7){
            grade = input.nextLine();
            if(grade.equals(a)){
                val = 4;
            }else if(grade.equals(b)){
                val = 3;
            }else if(grade.equals(c)){
                val=2;
            }else if(grade.equals(d)){
                val=1;
            }else if(grade.equals(f)){
                val=0;
            }else{
                return "Invalid input";
            }
            sum+=val;
            num++;
        }
        double gpa = (int)((sum/7+0.5)*100)/100;
        return "GPA = "+gpa;
    }
}
