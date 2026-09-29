package recursion.String;

public class Stream {

    public static void main(String[] args) {
        String s="abcapplecdh";
        System.out.println(skip1(s));
    }

    static String skip(String value){
        if(value.isEmpty()){
            return "";
        }
        char ch=value.charAt(0);
        if(ch=='a'){
            return skip(value.substring(1));
        }
        else{
           return ch+skip(value.substring(1));
        }
    }
    static String skip1(String value){
        if(value.isEmpty()){
            return "";
        }

        if(value.startsWith("apple")){
            return skip(value.substring(4));
        }
        else{
            return value.charAt(0)+skip(value.substring(1));
        }
    }

}
