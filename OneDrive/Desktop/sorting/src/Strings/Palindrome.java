package Strings;
public class Palindrome {
    public static void main(String[] args) {
        String s = "1001";

        System.out.println((checkOnesSegment(s)));
    }
  static   public boolean checkOnesSegment(String s) {
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                 return helper(s);
            }
            else{
                return true;
            }
        }
        return s.charAt(0)=='1';
    }
   static boolean helper(String s){
        char []ch=s.toCharArray();
        int count=0;
        for(int i=0;i<ch.length-1;i++){
            if(ch[i]==ch[i+1]){
                count++;
            }
        }
        return count!=0;
    }
    }
