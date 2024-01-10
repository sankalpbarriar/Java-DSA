package consditions;
import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=1;
        int y=0;
        System.out.println("enter x1:");;
        int x1=sc.nextInt();
        System.out.println("enter y1:");;
        int y1=sc.nextInt();
        int r=5;
        int dis=((x1-x)*(x1-x))-((y1-y)*(y1-y));
        if (dis>r*r){
            System.out.println("point lies outside");
        }
        else if (dis==r*r){
            System.out.println("point in the circle");
        }
        else if (dis<r*r){
            System.out.println("point lies inside the circle");
        }
    }
}
