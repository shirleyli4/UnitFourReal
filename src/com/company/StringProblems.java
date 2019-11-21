package com.company;

public class StringProblems {
    public static void main(String[] args){
    System.out.println(printTheLetters("Pizza"));
    System.out.println(everyOtherLetter("Computer Science"));
    System.out.println(countTheVowels("COMPUTER science"));
    System.out.println(differentStrings("bowl", "bowling"));
    System.out.println(differentStrings("aardvark", "aardvark"));
    System.out.println(differentStrings("tiger", "turtle"));
    System.out.println(isPalindrome("racerar"));
    }
    public static String printTheLetters(String s){
        String ans="";
        for(int i=0;i<=s.length()-1;i++){
            String ret= s.substring(i,i+1);
            ans+=ret+"\n";
        }
        return ans;
    }

    public static String everyOtherLetter(String s){
        String ans="";
        for(int i=0;i<=s.length()-1;i+=2){
            String ret=s.substring(i,i+1);
            ans+=ret;
        }
        return ans;
    }

    public static int countTheVowels(String s){
        int ans=0;
        for(int i=0;i<=s.length()-1;i++){
            String ii=s.substring(i,i+1);
            if(ii.equals("a")||ii.equals("e")||ii.equals("i")||ii.equals("o")||ii.equals("u")||
                    ii.equals("A")||ii.equals("E")||ii.equals("I")||ii.equals("O")||ii.equals("U")){
                ans++;
            }
        }
        return ans;
    }

    public static String differentStrings(String s1, String s2){
        //no problem
        if(s1.equals(s2)){
            return s1+" and "+s2+" are the same";

        }else if(s1.length()>s2.length()){
            String num="";
            for(int i=0;i<=s2.length()-1;i++){
                if(s2.substring(i,i+1).equals(s1.substring(i,i+1))){
                    num=String.valueOf(i+2);
                }else{
                    num=String.valueOf(i+1);
                    break;
                }
            }

            return s1+" and "+s2+" are not the same. "+"They differ at letter number "+ num;
        }else{
            String num="";
            for(int i=0;i<=s1.length()-1;i++){
                if(s1.substring(i,i+1).equals(s2.substring(i,i+1))){
                    num=String.valueOf(i+2);
                }else{
                    num=String.valueOf(i+1);
                    break;
                }
            }
            return s1+" and "+s2+" are not the same. "+"They differ at letter number "+ num;
        }
    }

    public static boolean isPalindrome(String s){
        boolean ret=false;
            for (int i = 0; i <= s.length() - 1; i++) {
                if(s.substring(i,i+1).equals(s.substring(s.length()-i-1,s.length()-i))){
                    ret=true;
                }
            }
            return ret;
    }
}
