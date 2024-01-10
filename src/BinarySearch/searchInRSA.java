package BinarySearch;

public class searchInRSA {
    static int searchTarget(int[] a,int target){
        int n=a.length;
        int st=0,end=n-1;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(a[mid]==target) return mid;
            else if (a[mid]<a[end]) {         //mid to end is sorted
                if(target>a[mid] && target<=a[end])
                    st=mid+1;
                else end=mid-1;

            }
            else{                        //st to mid is sorted
                if(target>=a[st] && target<a[mid]){
                    end=mid-1;
                }
                else st=mid+1;
            }
        }
        return ans;
    }
    static int searchDup(int[ ]a, int target){
        int n=a.length;
        int st=0,end=n-1;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(a[mid]==target) return mid;
            else if(a[st]==a[mid] && a[end]==a[mid]){
                st++;
                end--;
            }
            else if (a[mid]<=a[end]) {         //mid to end is sorted
                if(target>a[mid] && target<=a[end])
                    st=mid+1;

                else end=mid-1;
            }
            else{                        //st to mid is sorted
                if(target>=a[st] && target<a[mid]){
                    end=mid-1;
                }
                else st=mid+1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,2,3,1,1};
        int target=2;
       // System.out.println(searchTarget(arr,target));
        System.out.println(searchDup(arr,target));
    }
}
