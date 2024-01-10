// Count the no. of occuence of particular element

package Arrays;
import java.util.Scanner;
public class occurence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        //taking array input
        System.out.println("Enter the elements:");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element whose occurence is need to determined:");
        int x=sc.nextInt();
        int count =0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==x){
                count+=1;
            }
        }
        System.out.println("the occurence of given element is "+ count+" times");

    }
}
