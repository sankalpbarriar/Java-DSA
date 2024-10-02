package slidingWIndow;

import java.util.LinkedList;
import java.util.Queue;

public class findFirstNegative {
    static int[] findFirstNeg(int[] arr,int K){
        int N=arr.length;
        Queue<Integer>queue=new LinkedList<>();
        //calculate for 1st window
        int idx=0;
        while(idx<K){
            if(arr[idx]<0){
                queue.offer(arr[idx]);
            }
            idx++;
        }
        // calculating for other windows based on 1st one
        int[] res=new int[N-K+1];
        res[0]=queue.isEmpty()?0:queue.peek();
        for(int i=1;i<N-K+1;i++){
            if(arr[i-1]<0){
                queue.poll();
            }
            if(arr[i+K-1]<0){
                queue.offer(arr[i+K-1]);
            }
            res[i]=queue.isEmpty()? 0:queue.peek();
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={-8,2,3,-6,10};
        int K=2;
        int[] res=findFirstNeg(arr,K);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
