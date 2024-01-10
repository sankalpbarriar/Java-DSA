package array2D;

public class ques {
    public static void main(String[] args) {
        int[] arr={-78,-5,8,4,88};
        int maxIndex=0;
        for (int i=1;i<arr.length;i++){
            if (arr[i]>arr[maxIndex]){
                maxIndex=i;
            }
        }
        System.out.println("Greatest number is "+ arr[maxIndex]+ " at index "+maxIndex);
    }
}
