package Arrays;
class maxi{
    void maximum(){
        int max=0;
        int arr[]={745,34,999,10,235};
        for (int i=1;i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("maximum value is "+ max);
    }
}
public class max {
    public static void main(String[] args) {
        maxi obj=new maxi();
        obj.maximum();
    }
}
