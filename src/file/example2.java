package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class example2 {
    public static void main(String[] args) {
        try {
//        step1
            Path path = Paths.get("C:\\Users\\DELL\\IdeaProjects\\StringDemo\\src\\sample1.txt");
//        step2
            Files.createFile(path);
            System.out.println("created successfully");
        }catch(IOException exception){
            exception.printStackTrace();
        }

        }
}
