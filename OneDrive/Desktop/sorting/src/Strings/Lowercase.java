package Strings;

public class Lowercase {
    public  static void main(String[]args){
        String s="HELLO WORLD";
System.out.println(toLowerCase(s));
    }

  static  public String toLowerCase(String s) {
        StringBuilder sb=new StringBuilder();
        sb.append(s.toLowerCase());
        return sb.toString();
    }
}
