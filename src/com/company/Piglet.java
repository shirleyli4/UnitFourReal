//Shirley Shuzhou Li 11/12/19
//This program is a piglet game
//Not a perfect program but works fine
package com.company;
import java.util.Scanner;
public class Piglet {
    public static void main (String[] args){
        System.out.println("Welcome to Piglet!");
        int sum=0;
        //roll the dicce for the first time
        int num = userRoll();
        //add to the sum
        sum+=num;
        System.out.println("You rolled a  "+num+"!");
        //the rolled number effects the decision
        boolean deci = decision(num).equals(" ");
        //if the dicision is yes and didn't roll a 1
        while(deci&&num!=1){
            //contiue rolling, revalue "num", repeat the whole process
            num=userRoll();
            sum+=num;
            System.out.println("You rolled a  "+num+"!");
            deci = decision(num).equals(" ");
        }
       //after rounds and round, when finished get the sum
        // (only if didn't roll one though)
        System.out.println(sum(deci,sum));
    }

    //the roll absolutely has no error!!
    public static int userRoll(){
        int num = (int)(Math.random()*5);
        if(num==1){
            return 2;
        }else if(num==2){
            return 3;
        }else if(num==3){
            return 4;
        }else if(num==4){
            return 5;
        }else if(num==5){
            return 6;
        }else{
            return 1;
        }
    }


    public static String decision(int num){
        if(num==1){
            System.out.println("You got 0 points.");
        }else {
            System.out.println("Roll again?");
            Scanner input = new Scanner(System.in);
            String in = input.nextLine();
            if (in.equals("yes")) {
                //return one space
                return " ";
            } else {
                //return two space
                return "  ";
            }
        }
        return null;
    }

    public static String sum(boolean deci,int sum){
        if(deci!=true){
            return "You got "+sum+" points.";
        }else{
            //when rolled one
            return "";
        }
    }

}
