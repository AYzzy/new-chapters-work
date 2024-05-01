package stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example8 {
    public static void main(String[] args) {
        try(InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(inputStreamReader)){

            System.out.print("Enter your data: ");
            String data= reader.readLine();
            System.out.println("You Entered: "+ data);
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
