package Sorting;
import java.util.Collections;
import java.util.ArrayList;

public class BucketSort {

    static void bucket(float[] arr){
        int n=arr.length;
        //Creating Buckets
        ArrayList<Float>[] buckets =new ArrayList[n];   //creating array of Arraylist
        //Create empty buckets
        for (int i=0;i<n;i++){
            buckets[i]=new ArrayList<Float>();
        }

        //Add elements into our buckets
        for (int i=0;i<n;i++){
            int bucketIndex=(int) arr[i]*n;
            buckets[bucketIndex].add(arr[i]);
        }

        //sort each bucket individually
        for (int i=0;i<buckets.length;i++){
            Collections.sort(buckets[i]);
        }

        //Merge all buckets to get final sorted array
        int idx=0;
        for (int i=0;i<buckets.length;i++){
            ArrayList<Float> currBucket=buckets[i];
            for (int j=0;j<currBucket.size();j++){
                arr[idx++]= currBucket.get(j);
            }
        }
    }


    public static void main(String[] args) {
        float []a={0.5f,0.4f,0.3f,0.5f,0.1f};
        bucket(a);
        for (float val:a){
            System.out.print(val+" ");
        }
    }
}
