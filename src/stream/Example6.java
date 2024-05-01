package stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example6 {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\StringDemo\\src\\sample4.txt";
        try (FileWriter fileWriter = new FileWriter(fileLocation)){
            fileWriter.write("Hello World");
        }catch (IOException exception){
            System.err.println("ERROR: "+ exception.getMessage());
        }

    }
}
