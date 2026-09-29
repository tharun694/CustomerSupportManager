package recursion.String;

public class SubSeq {
    public static void main(String[] args) {
        Seq("","abc");
    }
    static void Seq(String p,String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        Seq(p+ch, up.substring(1));
        Seq(p, up.substring(1));
    }
}
