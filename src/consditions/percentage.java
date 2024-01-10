package consditions;
import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        System.out.println("enter percentage");
        Scanner sc= new Scanner(System.in);
        int per= sc.nextInt();
        if(per>90){
            System.out.println("excellent");
        } else if (per>80) {
            System.out.println("very good");
        }
        else if (per>70) {
            System.out.println("good");
        }
        else if (per>60) {
            System.out.println("better");
        }
    }
    }
