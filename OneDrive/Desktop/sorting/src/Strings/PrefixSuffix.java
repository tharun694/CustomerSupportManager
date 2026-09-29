package Strings;

import java.util.Arrays;

public class PrefixSuffix {
    public static void main(String[]args){
        String[]words={"a","aba","ababa","aa"};
        System.out.println(countPrefixSuffixPairs(words));
    }
  static  public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(i!=j&&prefixSuffix(words[i],words[j])){
                    count++;
                }
            }
        }
        return count;
    }
   static Boolean prefixSuffix(String str1,String str2){
        int n=str1.length()-1;
        int m=str2.length()-1;
        if(n>m){
            return false;
        }
        for(int i=0;i<=n;i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
        }
        for(int i=0;i<=n;i++){
            if(str1.charAt(n-i)!=str2.charAt(m-i)){
                return false;
            }
        }
        return true;
    }
}
