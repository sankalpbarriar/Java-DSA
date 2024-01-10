package BinarySearch;

public class DistributeChocklates {
    static boolean isDivisionPossible(int []a, int m, int maxChocAllowed){
        int numberOfStud=1;
        int choc=0;   //no. of choc current stud have
        for (int i=0;i<a.length;i++){
            if (a[i]>maxChocAllowed) return false;
            if(choc+a[i]<=maxChocAllowed){
                choc+=a[i];
            }
            else{
                numberOfStud++;   //going for the next student
                choc=a[i];
            }
        }
        return numberOfStud<=m;
    }
    static int distributeChoc(int []a, int m){
        if(a.length<m) return -1;
        int ans=0,st=1,end=(int)1e9;     // st as 1 and min possible is 10^5 x 10^4

        while(st<=end){
            int mid=st+(end-st)/2;
            if(isDivisionPossible(a,m,mid)){    //mid ko maxChoc allowed rakh ke kya division possible hai
                ans=mid;
                end=mid-1;
            }
            else {
                st=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int []a={12,34,67,90};
        int m=2;   //np. of students
        System.out.println(distributeChoc(a, m));
    }
}
