package consditions;
import java.util.Scanner;
public class nestedifelse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 1st number:");
        int a=sc.nextInt();
        System.out.println("enter 2nd number:");
        int b=sc.nextInt();
        System.out.println("enter 3rd number:");
        int c=sc.nextInt();
        if (a>b){
            if(a>c){
                System.out.println(a + "is largest");
            }
            else {
                System.out.println(c + "is the largest");
            }
        }
        else{
            if (b>c){
                System.out.println(b + "is the largest");
            }
            else{
                System.out.println(c + "is the largest");
            }
        }

    }
}
