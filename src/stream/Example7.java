package stream;

import java.io.*;
import java.util.stream.Collectors;

public class Example7 {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\StringDemo\\src\\sample4.txt";

        try (FileInputStream fileInputStream = new FileInputStream(fileLocation);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader reader = new BufferedReader(inputStreamReader)){
            System.out.println(reader.lines().collect(Collectors.joining("\n")));
        }catch (IOException exception){
            System.err.println("ERROR: "+ exception.getMessage());

        }
    }
}
