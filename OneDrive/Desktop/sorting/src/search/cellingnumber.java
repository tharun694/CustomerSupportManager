package search;

class cellingnumber {
    public static void main(String[] args) {
        int []arr={11,12,33,44,55,66,77,445,1111};
        int target = 56;
                System.out.println(cellingnumber(arr,target));
    }
  static int  cellingnumber(int []arr,int target) {
      int start = 0;
      int end = arr.length - 1;

      boolean ASC = arr[start] < arr[end];
      while (start <= end) {
          int mid = start + (end - start) / 2;
          if (ASC) {
              if (target < arr[mid]) {
                  end = mid - 1;
              } else {
                  start = mid + 1;
              }
          } else if (target > arr[mid]) {
              start = mid + 1;
          } else {
              end = mid - 1;
          }
          if (target == arr[mid]) {
              return mid;
          }
      }
      return start;
  }

    }

