package recursion;

public class Linearsearch {
    public static void main(String [] args) {
int []arr={5,6,7,8,9,1,2,3};
        System.out.println(search(arr,79,0,arr.length-1));
    }
    static int search(int []arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[m]>=arr[s]){
            if(target>=arr[m]){
                return search(arr,7,0,m-1);
            }
        }
        return search(arr,7,m+1,e);
    }
}
