package Strings;

public class ShuffleString{
    public static void main(String[] args) {
String s="is2 sentence4 This1 a3";

        System.out.println(sortSentence(s));
    }

   static  public String sortSentence(String s) {
        String orginal="";
       String[]sentence=s.split("\\s");
String[]arr=new String[sentence.length];
       for (int i = 0; i < sentence.length; i++) {
           int wordPosition=sentence[i].charAt(sentence[i].length()-1)-'0';
           arr[wordPosition-1]=sentence[i].substring(0, sentence[i].length()-1);
       }
       for (String word:arr){
           orginal+=word;
           orginal=orginal.concat(" ");

       }
       orginal=orginal.trim();
       return orginal;
    }
    }

