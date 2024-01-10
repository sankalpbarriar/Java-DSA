package Patterns;

public class pat18 {
    public static void main(String[] args) {
        int n=4;
        for (int i=1;i<=2*n-1;i++){
            for (int j=1;j<=2*n-1;j++){
                if(i==1||j==1||i==2*n-1||j==2*n-1){
                    System.out.print(n);
                }
                else if (i==2||j==2||i==2*n-2||j==2*n-2) {
                    System.out.print(n-1);
                }
                else if (i==3||j==3||i==2*n-3||j==2*n-3) {
                    System.out.print(n-2);
                }
                else if (i==4||j==4||i==2*n-4||j==2*n-4) {
                    System.out.print(n-3);
                }
                else if (i==5||j==5||i==2*n-5||j==2*n-5) {
                    System.out.print(n-4);
                }
                else System.out.print(" ");

            }
            System.out.println();
        }
    }
}
