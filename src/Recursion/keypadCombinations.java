package Recursion;
// Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the no. could represent. Return the answer in any order
public class keypadCombinations {
    static void combinations(String dig, String[] kp, String res){
        //BASE CASE
        if (dig.length()==0){
            System.out.print(res+" ");     // at last stage dig string is empty
            return;
        }

        int currNum=dig.charAt(0)-'0';    //to convert char 2 to integer 2 (-'0')
        String currChoices=kp[currNum];   //"abc"

        for (int i=0;i<currChoices.length();i++){   // "abc"
            combinations(dig.substring(1),kp,res+currChoices.charAt(i));
        }
    }

    public static void main(String[] args) {
        String dig = "253";
        String[] kp = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        //           0   1   2     3     4     5     6     7      8     9
        combinations(dig,kp,"");

    }
}
