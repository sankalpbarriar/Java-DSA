package Methods;
import java.util.Scanner;

class Algebra{
    int sum(int a,int b){
        int add=a+b;
        return add;
    }
}
public class Main {
    public static void main(String[] args) {                  //Main method should be under seperate class
        Scanner sc= new Scanner(System.in);
        Algebra obj=new Algebra();
        System.out.println("Enter a:");
        int x=sc.nextInt();
        System.out.println("Enter b:");
        int y=sc.nextInt();
        int ans=obj.sum(x,y);
        System.out.print("the sum is ");
        System.out.println(ans);

    }
}
