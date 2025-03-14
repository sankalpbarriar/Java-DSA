package BInaryTree;

public class Program {
    static int alternateAddSub(int n , int opt){
        int sum = 1;
        if(opt == 1){
            for(int i = 2 ; i <= n ; i++){
                if(i % 2 == 0){
                    sum += i;
                }
                else sum -= i;
            }
        }
        else if(opt == 2){
            for(int i = 2 ; i <= n ; i++){
                if(i % 2 == 0){
                    sum -= i;
                }
                else sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(alternateAddSub(10,2));
    }
}
