package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class InputFile {
    public static void main(String[] args) {
    File obj=new File("note.txt");
    try{
        Scanner scan=new Scanner(obj);
        while(scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }
        scan.close();
    } catch (IOException e) {
        e.printStackTrace();
        throw new RuntimeException(e);

    }
    }


}
