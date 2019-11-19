package com.company;

public class ForLoops {
    public static void main(String[] args){
        int a =7;
        int b=12;
        System.out.println(printingHashTags(a));
        System.out.println(countDown(a,b));
        System.out.println(countDown2(a,b));
        System.out.println(countDown2(b,a));
        System.out.println(sumNumbers(a,b));
        System.out.println(sumNumbers(b,a));
    }
    public static String printingHashTags(int a){
        String hash="";
        for(int i=0;i<a;i++){
            hash+="#";
        }
        return hash;
    }

    public static String countDown(int a,int b){
        String ret= "";
        int num;
        if(a>b){
            return "";
        }else{
            for(int i=0;i<b-a+1;i++){
                    num=b-i;
                    ret+=num+" ";
            }
            return ret;
        }
    }

    public static String countDown2(int a,int b){
        String ret= "";
        int num;
        if(a>b){
            for(int i=0;i<a-b+1;i++){
                num=a-i;
                ret+=num+" ";
            }
            return ret;
        }else{
            for(int i=0;i<b-a+1;i++){
                num=b-i;
                ret+=num+" ";
            }
            return ret;
        }
    }

    public static int sumNumbers(int num1,int num2){
        int sum=0;
        if(num1<num2) {
            for (int i = num1; i <= num2; i++) {
                sum += i;
            }
            return sum;
        }else{
            for(int i=num1;i>=num2;i--){
                sum+=i;
            }
            return sum;
        }
    }
}
