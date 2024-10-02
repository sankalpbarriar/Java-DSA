package Basicsofjava;
import java.util.*;

public class strictlyGreaterThanX {
    public static void main(String[] args) {
        int[] arr = {1,2,5,2,5,7,3,6,22,5};
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter x");
        int x = sc.nextInt();
        //finding count of element greater than x
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                count++;
            }
        }
        System.out.printf("There are %d elements greater than x",count);
    }
}
