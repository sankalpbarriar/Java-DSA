package HashMaps;

import java.util.LinkedList;

public class HashMapImplementation {
    static class HashMap<K, V>  //use of generics to determine the data type
    {
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;
        //Linked list wala node
        public class Node {
            K key;
            V value;

            //constructor to initialize the Node
            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }

            public int n;  // the no. of entries in Map
            private LinkedList<Node>[] buckets;  //array of linked list which contains nodes

            //initializing each index of bucket array with empty linked list
            private void initBuckets(int N){
                buckets=new LinkedList[N];
                for(int i=0;i< buckets.length;i++){
                    buckets[i]=new LinkedList<>();
                }
            }
        }
    }
    public static void main(String[] args) {

    }
}
