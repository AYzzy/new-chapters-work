package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class example3 {
    public static void main(String[] args) {
        try {
//        step1
            Path path = Paths.get("C:\\Users\\DELL\\IdeaProjects\\StringDemo\\src\\sample.txt");
//        step2
            Files.deleteIfExists(path);
        }catch(IOException exception){
            exception.printStackTrace();
        }

        }
}
