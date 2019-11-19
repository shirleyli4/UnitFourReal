package com.company;

public class StringProblems {
    public static void main(String[] args){
    System.out.println(printTheLetters("Pizza"));
    System.out.println(everyOtherLetter("Computer Science"));
    System.out.println(countTheVowels("COMPUTER science"));
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


}
