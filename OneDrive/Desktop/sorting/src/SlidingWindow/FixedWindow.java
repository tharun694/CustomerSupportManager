package SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FixedWindow {
    static void main() {
        Scanner scan=new Scanner(System.in);

//        int n=scan.nextInt();
//        int []data=new int[n];
//        for(int i=0;i<n;i++){
//            data[i]=scan.nextInt();
//        }
//        System.out.println(window(data,2));
//        scan.nextLine();
        String s=scan.nextLine();
        System.out.println(longestsubstring2(s));
    }

    private static int  window(int[] data, int k) {
        int windowmax=0,result=0;
        for(int i=0;i<k;i++){
            windowmax+=data[i];
        }
        result=windowmax;
        int index=k;
        while(index<data.length){
            windowmax-=data[index-k];
            windowmax+=data[index];
           result= Math.max(result,windowmax);
           index++;        }
        return result;
    }
 static public int longestsubstring(String s) {
    HashSet<Character> set = new HashSet<>();
    int left = 0;
    int maxLength = 0;

    for (int right = 0; right < s.length(); right++) {

        while (set.contains(s.charAt(right))) {
            set.remove(s.charAt(left));
            left++;
        }

        set.add(s.charAt(right));
        maxLength = Math.max(maxLength, right - left + 1);
    }
    return maxLength;
}


    static public int longestsubstring2(String s) {
//        HashSet<Character> set = new HashSet<>();
        HashMap<Character,Integer>map=new HashMap<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            while (map.containsValue(s.charAt(right))) {
                map.remove(s.charAt(left));
                left++;
            }

            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
        maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
