package Recursion;
import java.util.Scanner;
import java.util.ArrayList;
public class self {
    //Function to return subsequences of a string
    static ArrayList<String> returnSsq(String s){
        ArrayList<String> ans=new ArrayList<>();
        //BASE CASE
        if (s.length()==0){
            ans.add("");
            return ans;
        }
        char currChar=s.charAt(0);
        ArrayList<String> smallAns=returnSsq(s.substring(1));

        for (String ss:
             smallAns) {
            ans.add(ss);
            ans.add(currChar+ss);

        }
        return ans;

    }






    public static void main(String[] args) {
        ArrayList<String> ans=returnSsq("bvs");
        for (String ss:ans){
            System.out.println("'"+ss+"'");
        }
    }
}
