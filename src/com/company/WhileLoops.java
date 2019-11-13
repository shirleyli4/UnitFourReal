package com.company;

public class WhileLoops {
    public static void main(String[] args) {
        int a =20;
        int b=30;
        System.out.println(fromHereToThere(a, b));
        System.out.println(facotrs(a));

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
                list+=num;
                num++;
            }else{
                num++;
            }
        }return list;
    }


}
