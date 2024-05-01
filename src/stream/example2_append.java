package stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class example2_append {
    public static void main(String[] args) {
        String fileLocation="C:\\Users\\DELL\\IdeaProjects\\stringDemo\\src\\sample3.txt";
        try( FileOutputStream outputStream = new FileOutputStream(fileLocation, true);
                PrintStream printStream =new PrintStream(outputStream)){
            System.setOut(printStream);
            System.out.println("\n Hello World");// it sout into the file created
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
