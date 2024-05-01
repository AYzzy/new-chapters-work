package stream;

import java.io.IOException;
import java.io.PrintStream;

public class example1 {
    public static void main(String[] args) {
        String pathFile = "C:\\Users\\DELL\\IdeaProjects\\StringDemo\\src\\sample1.txt";
        try(PrintStream printStream =
                new PrintStream(pathFile);){
            printStream.println("there is a tide in the affairs of men ...");
        }catch (IOException exception){
            System.err.println("ERROR: "+ exception.getMessage());
        }


    }

}
