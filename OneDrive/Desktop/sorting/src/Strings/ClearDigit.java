package Strings;

public class ClearDigit {
    public static void main(String[]args){
      String  firstWord = "aaa", secondWord = "a", targetWord = "aab";
        System.out.println(isSumEqual(firstWord,secondWord, targetWord));
    }

   static public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int FistValue=0;
        int SecondValue=0;
        int ThirdValue=0;
for (int index1=0; index1<firstWord.length();index1++){
    int value1=(char)firstWord.charAt(index1)-'a';
      FistValue=(FistValue*10)+value1;
}
        for (int index2 = 0; index2 < secondWord.length(); index2++) {
            int value2=(char)secondWord.charAt(index2)-'a';
            SecondValue=(SecondValue*10)+value2;
        }
        for (int index3 = 0; index3 <targetWord.length(); index3++) {
            int value3=(char)targetWord.charAt(index3)-'a';
            ThirdValue=(ThirdValue*10)+value3;
        }
       int values= FistValue+SecondValue;
        return values==ThirdValue;
    }
}
