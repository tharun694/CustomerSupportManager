package sortingsmethod;


public class prettyprint {
    public static void main(String[] args) {

//System.out.println( "your answer is "+rollno );

//Scanner scan=new Scanner(System.in);
//       System.out.print("Enter temp C: ");
////int rollno=scan.nextInt();


        //
        //  System.out.println(56);
        //
        // System.out.println("kunal");

        // System.out.println( Arrays.toString(new int []{2,3,4,1}));

        //     float num=22.3456333f;
        //
        // System.out.printf(" formated value %.5f ",Math.PI);
        //  System.out.println("c "+22);
        //  System.out.println("11"+ new ArrayList<>(88));
StringBuilder build=new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch=(char) ('a'+i);
            build.append(ch);


        }
        System.out.println(build);
        build.deleteCharAt(18);
        System.out.println(build);
        build.reverse();
        System.out.println(build);

    }

}

