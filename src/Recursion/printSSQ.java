package Recursion;

public class printSSQ {
    static void printSSQ(String s, String currAns){   //s="abc"

       if (s.length()==0){
           System.out.println(currAns);
           return;
       }
        char curr=s.charAt(0);   //a
        String remString=s.substring(1);  //bc

        //Curr char--> chooses to be a part of currAns
        printSSQ(remString ,currAns+curr);   //bc,a (add current)

        //Curr char--> chooses to be a part of currAns
        printSSQ(remString,currAns);   //bc,""  (do not add current)
    }

    public static void main(String[] args) {
         printSSQ("abc","");
    }
}
