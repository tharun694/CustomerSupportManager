package Strings;


public class SwapToString {
    public static void main(String[] args) {
        System.out.println(removeDigit("1231",'1'));
    }
    static public String removeDigit(String number, char digit) {
                String maxNumber = "";
                for(int i=0; i<number.length(); i++){
                    if (number.charAt(i) == digit) {
                        String currNum = number.substring(0, i)+number.substring(i+1);
                        if(currNum.compareTo(maxNumber) > 0) maxNumber = currNum;
                    }
                }
                return maxNumber;
            }
        }

