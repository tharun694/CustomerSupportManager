package Strings;

import java.math.*;
import java.util.HashSet;

class Binary {

    public static void main(String[] args) {
//        String s = "codeleet";
//        int[] arr = {4,5,6,7,0,2,1,3};
//        System.out.println(restoreString(s,arr));
        String s="au 123";
        System.out.println(vowelConsonantScore(s));
    }

    public  static String addSpaces(String s, int[] spaces) {
        StringBuilder sb=new StringBuilder();
        int space1=0;
        for(int i=0;i<s.length();i++){
            if(space1<spaces.length && i==spaces[space1]){
                sb.append(' ');
                space1++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
   static public String restoreString(String s, int[] indices) {
        char arr[] = new char[s.length()];
        for(int i=0;i<indices.length;i++){
            arr[indices[i]] = s.charAt(i);
        }
        return new String(arr);
    }

  static public int vowelConsonantScore(String s) {
        HashSet<Character> map=new HashSet<>();
        int c=0,v=0,score=0;
        map.add('a');
        map.add('e');
        map.add('i');
        map.add('o');
        map.add('u');

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.contains(ch)){
                v++;
            }else if(!Character.isDigit(ch)&& ch!=' '){
                c++;
            }
        }
        if(c==0)return 0;
        return score=v/c;
    }

    }


