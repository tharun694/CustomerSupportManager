package recursion;

import java.util.ArrayList;

public class Sequence {

    static void main() {
int []arr={3,1,2};
        System.out.println(subsequence(arr,new ArrayList<>(),0));
    }
    static ArrayList<ArrayList<Integer>> subsequence(int []arr,ArrayList<Integer> list,int index){
        if(index>= arr.length){
            ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
            ans.add(list);
            return ans;
        }

        list.add(arr[index]);
        ArrayList<ArrayList<Integer>>  untake=new ArrayList<>();
        ArrayList<ArrayList<Integer>> take=subsequence(arr,list,index+1);
        untake.addAll(take);
          list.remove(list.size()-1);

                 untake=subsequence(arr,list,index+1);
                 take.addAll(untake);
                 return take;

    }
    static void subsequencePrint(int []arr, ArrayList<Integer> list, int index){
        if(index>= arr.length){
            System.out.println(list);
            return;
        }

        list.add(arr[index]);

        subsequencePrint(arr,list,index+1);

         list.remove(list.size()-1);

       subsequencePrint(arr,list,index+1);


    }


}
