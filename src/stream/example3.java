package stream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class example3 {
    public static void main(String[] args) {
//        INPUT STREAM ARE THE ROOT OF THE IO STREAM CLASS
//
        String fileLocation = "C:\\Users\\DELL\\IdeaProjects\\StringDemo\\src\\sample3.txt";
//        try(InputStream inputStream  = new FileInputStream(fileLocation);
//            DataInputStream dataInputStream = new DataInputStream(inputStream)){
//
//            byte[] fileData = dataInputStream.readAllBytes();
//            System.out.println(new String(fileData));
//        }catch (IOException e){
//            System.err.println(e.getMessage());
//        }
        try(var inputStream  = new FileInputStream(fileLocation);
            var dataInputStream = new DataInputStream(inputStream)){

            byte[] fileData = dataInputStream.readAllBytes();
            System.out.println(new String(fileData));
        }catch (IOException e){
            System.err.println("ERROR: " + e.getMessage());
        }
    }
}
