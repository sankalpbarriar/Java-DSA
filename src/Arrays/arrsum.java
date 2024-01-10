package Arrays;
class sum{
    void sumy(){
        int sum=0;
        int arr[]={1,2,4,53,5};
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
public class arrsum {
    public static void main(String[] args) {
        sum obj=new sum();
        obj.sumy();
    }

}
