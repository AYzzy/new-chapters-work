package stream;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Example9 {
    public static void main(String[] args) {
        try(OutputStreamWriter writer = new OutputStreamWriter(System.out);
            BufferedWriter bufferedWriter = new BufferedWriter(writer)){
            bufferedWriter.write("Hello World");

        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
