package search;

public class findpeakelement {

    public static void main(String[] args) {
        int []arr={1,2,1,3,5,6,4};
        System.out.println(search(arr));

    }
    static int search(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
                return start;
            }
            else if (arr[mid]>arr[mid+2]){
                start=mid+2;
                return start;
            }

        }
        return  -1;
    }
}
