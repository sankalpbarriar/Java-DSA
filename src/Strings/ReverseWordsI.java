package Strings;

public class ReverseWordsI {
    static String reverseWordsI(String s){
        String arr[]=s.split(" ");
//        String res="";
        StringBuilder res=new StringBuilder();
        for (int i=arr.length-1;i>=0;i--){
            if (arr[i].length()==0){
                continue;
            }
            if (res.length()==0){
                res.append(arr[i]);
            }
            else{
                res.append(" ");
                res.append(arr[i]);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s=" The God is importal ";
        System.out.println(reverseWordsI(s));
    }
}
