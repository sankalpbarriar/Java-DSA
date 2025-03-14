package Arrays;

public class alternate {
    static int alternateAddSub(int n , int opt){
        int res = 0;
        if(opt == 1){
            for(int i = 1 ; i < n ; i++){
                res = res + i + i+1;
            }
        }
        if(opt == 2){
            for(int i = 1 ; i < n ; i++){
                res = res + i - i+1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(alternateAddSub(10,1));
    }
}
