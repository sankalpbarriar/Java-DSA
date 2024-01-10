//Find the last occurence of element x;

package Arrays;
import java.util.Scanner;
public class lastOccurence {
    static int last(int[]arr,int x){
        int lstIndex=-1;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==x){
                lstIndex=i;
            }
        }
        return lstIndex;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of elements:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of Array");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter x:");
        int x=sc.nextInt();
        int result=last(arr,x);
        System.out.println("THE LAST OCCURRENCE IS "+ result);
    }
}
