package Strings;

public class ReverseWordIApr2 {
    static String reverse(String s){
    StringBuilder res=new StringBuilder();
        int SI=s.length()-1;
        while (SI>=0){
            //SKIPPING SPACES
        while(SI>=0 && s.charAt(SI)==' ') {
            SI--;
        }
        if (SI<0){
            break;
        }
        // PUTTING SI as EI
        int EI=SI;
            while(SI>=0 && s.charAt(SI)!=' ') {
                SI--;
            }
        if (res.length()==0){
            res.append(s.substring(SI+1,EI+1));
        }
        else{
            res.append(" ");
            res.append(s.substring(SI+1,EI+1));
        }
    }
        return res.toString();
}

    public static void main(String[] args) {
        String s=" The God is importal ";
        System.out.println(reverse(s));

    }
}
