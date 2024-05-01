package file;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static javax.print.attribute.standard.MediaSizeName.C;

public class Example {
    //TODO:java.io and java nio
    public static void main(String[] args) {
//
//        try {
////        step1
//            Path path = Paths.get("C:\\Users\\DELL\\IdeaProjects\\StringDemo\\src\\sample.txt");
////        step2
//            Files.createFile(path);
//
//        }catch(IOException exception){
//            exception.printStackTrace();
//        }

        Path path = Paths.get("C:\\Users\\DELL\\Pictures\\Work work");
        try(DirectoryStream<Path>directoryStream =
                Files.newDirectoryStream(path)){
            directoryStream.forEach(System.out::println);
        }catch(IOException exception){
            System.err.println(exception.getMessage());
            exception.printStackTrace();
        }
    }
}
