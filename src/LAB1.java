import java.io.FileWriter;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB1 {
    public static void main (String[]args) {

        try{
            FileWriter output = new FileWriter("lab1.txt");
            output.write("Hello World");
            output.write("Welcome to JAVA");
            output.close();
        }catch (IOException ex) {
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null,ex);
        }
        try{
            FileReader input = new FileReader("lab1.txt");
            int ch;
            while ((ch = input.read()) != -1)
                System.out.print((char)ch);
            input.close();
        } catch (FileNotFoundException ex){
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null,ex);

        }catch (IOException ex){
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null,ex);
        }
    }

}