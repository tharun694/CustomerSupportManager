package recursion;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {

    }
    static public List<List<Integer>> groupAnagrams(int []nums) {
        List<List<Integer>>outer=new ArrayList<>();
        List<Integer>in=new ArrayList<>();
        outer.add(in);
        for(int num:nums){
            int n=outer.size();
            for(int i=0;i<n;i++){
                in=new ArrayList<>(outer.get(i));
                in.add(num);
                outer.add(in);
            }

        }
        return outer;
    }
}
