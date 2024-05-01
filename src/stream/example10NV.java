package stream;

import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class example10NV {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\stringDemo\\src\\sample2.txt";
        Path path = Paths.get(fileLocation);
        try {
            BufferedWriter writer = Files.newBufferedWriter(path);
            writer.write("Happy Birthday, Bolaji");
            writer.close();
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
