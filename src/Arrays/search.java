package Arrays;
class find{
    void searching(){
        int ans=-1;
        int x=50;
        int arr[]={1,2,3,50,4,5,6,50,7};
        for (int i=0;i<arr.length;i++){
            if(arr[i]==x){
                ans=i;
                break;
            }
        }
        System.out.println("found "+x+ " at index "+ ans);
    }
}
public class search {
    public static void main(String[] args) {

        find obj = new find();
        obj.searching();
    }
}
