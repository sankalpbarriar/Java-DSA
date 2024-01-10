package Strings;

public class longestPalString {
    static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static String longestSub(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (isPalindrome(s, i, j - 1)) {
                    String longSubstring = s.substring(i, j);
                    ans = longSubstring.length() > ans.length() ? longSubstring : ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "anagrams";
        System.out.println(longestSub(s));
    }
}
