package binarysearch;

public class infintearray {
    public static void main(String[]args){
        int []arr={3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        System.out.println(ans(arr,target));
    }
  static  int ans(int []arr,int target){
        int start=0;
        int end=1;
        while (target>arr[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return infintesearch(arr,target,start,end);
  }

   static  int infintesearch(int []arr,int target,int start,int end){

        while(start<end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
            else{
               return mid;
            }
        }
        return -1;
    }

    public static class peakarray {
        public static void main(String []args){
            int[]arr={1,4,3,8,5};
            System.out.println();
            System.out.println(display(arr));
        }
        static int display(int[]arr){
            int start=0;
            int end=arr.length-1;
            while(start<end){
                int mid=start+(end-start)/2;
                if(arr[mid]<arr[mid+1]){
                    start=mid+1;
                   // return start;

                } else if (arr[mid-1]>arr[mid]){
                    end=mid-1;
                    //return end;
                }
            }
            return -1 ;
        }
    }
}
