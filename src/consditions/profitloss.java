package consditions;
import java.util.Scanner;
public class profitloss {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the SP and CP");
        int CP=sc.nextInt();
        int SP=sc.nextInt();
        
        if(SP>CP){
            System.out.println("Seller made a profit");
            int profit=SP-CP;
            System.out.println("Profit obtained is "+profit);
        }
        if(CP>SP) {
            System.out.println("Seller made a loss");
            int loss = SP - CP;
            System.out.println("Profit obtained is " + loss);
        }
    }
}

