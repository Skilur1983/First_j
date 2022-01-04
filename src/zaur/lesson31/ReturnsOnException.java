package zaur.lesson31;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReturnsOnException {

    public static void main(String[] args) {
        System.out.println(A.abc());
    }
}

class A{

    static int abc(){
        int a; // declare variable
        FileInputStream fis = null; // has to be initialized

        try{
            File f = new File("test.txt");
            fis = new FileInputStream(f);
        }
        catch (FileNotFoundException e){
            a = 5; // in case exception is caught a will be initialized
            System.out.println("No such file " + a);
            return a;
        }
        finally {
            a = 10; // initialize its value finally. Will work only in case try was completed successfully
            try{
                fis.close();
            } catch (IOException e){
                System.out.println("Unable to close");
            }
            System.out.println("Finally a = " + a);
        }
        return a; // method will return value from catch block
    }
}