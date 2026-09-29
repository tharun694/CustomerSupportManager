package binarysearch;

class stringsearc{
    public static void main(String[] args) {
        int []arr={22,33,44,55,66,-2,1,3,489};
        int target=-2;
      int ans=  linearsearch(arr,-2,2,7);
        System.out.println(ans);
    }

    static int linearsearch(int []arr,int target,int start,int end){
       // if(arr.length==0){
         //   return-1;
       // }
        for(int i=start;i<=end;i++){
            int element=arr[i];
            if(element==target){
                return element;

            }
        }
        return-1;
    }
}