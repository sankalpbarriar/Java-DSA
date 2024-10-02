package slidingWIndow;

public class smallSubWithSumGreaterX {
    public static int findMinLengthSubArray(int[] arr, int x){
        int WS=0;  //windows start
        int WE=0; // i (windows end)
        int len=0;
        int minLen=Integer.MAX_VALUE;
        int sum=0;
        int n=arr.length;
        while(WE<n){
            // expansion
            sum+=arr[WE];
            if(sum>x){
                len=WE-WS+1;
                minLen=Math.min(len,minLen);

                //shrinking
                while(WS<WE && sum>x){
                    sum-=arr[WS];
                    WS++;
                    if(sum>x){   //shrink hone ke baad bhi agar x se bada ho
                        len=WE-WS+1;
                        minLen=Math.min(len,minLen);
                    }
                }
            }
            WE++;
        }
        return minLen==Integer.MAX_VALUE?0:minLen;
    }

    public static void main(String[] args) {
        int[] arr={1,4,45,6,0,19};
        int x=51;
        System.out.println("The minimum length of subArray is "+ findMinLengthSubArray(arr,x));
    }
}
