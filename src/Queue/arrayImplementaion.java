package Queue;

public class arrayImplementaion {
    public static class queueA{
        //DATA Members
        int f=-1;
        int r=-1;
        int[] arr=new int[100];
        int size=0;
        //Add function
        public  void add(int val){
            //check for full queue
            if(f==arr.length-1){
                System.out.println("Queue is full");
            }
            if(f==-1){//queue is currently emplty
                f=r=0;
                arr[r]=val;

            }
            else{
                arr[++r]=val;
            }
            size++;
        }
        //Remove function
        public int remove(){
            if(size==0){
                System.out.println("Queue is empty! ");
                return -1;
            }
            else{
                int x=arr[f];
                f++;
                size--;
                return x;
            }
        }
        //Peek function
        public int peek(){
            if(size==0){
                System.out.println("Queue is empty ");
                return -1;
            }
            else{
                return arr[f];
            }
        }
        //IsBoolean function
        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        //display function
        public void dispaly(){
            if(size==0){
                System.out.println("Queue is empty ");
                return ;
            }
            else{
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            queueA obj=new queueA();
            obj.add(1);
            obj.dispaly();
            obj.add(2);
            obj.dispaly();
            obj.add(3);
            obj.dispaly();
            obj.add(4);
            obj.dispaly();
            System.out.println(obj.peek());
            obj.add(5);
            obj.dispaly();
            obj.remove();
            obj.dispaly();
            obj.remove();
            obj.dispaly();
            obj.remove();
            obj.dispaly();
            obj.remove();
            obj.dispaly();
            obj.remove();
            obj.dispaly();


        }
    }
}
