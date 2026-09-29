package Strings;
import java.util.Arrays;

import static java.util.Collections.swap;

class Solution {
    public static void main(String[] args) {
        String word = "abcdefd";
        System.out.println(reversePrefix(word, 'd'));
    }


    static public String reversePrefix(String word, char ch) {
        char[] charvalues = word.toCharArray();
        for (int i = 0; i <word.length(); i++) {
            if(word.charAt(i)==ch){
                swap(charvalues,0,i);
                return new String(charvalues);
            }
        }
        return word;
    }

    static   void  swap(char[]ch, int start, int end) {
        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }

    }
    }


