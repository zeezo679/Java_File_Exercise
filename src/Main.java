import jdk.jshell.spi.ExecutionControlProvider;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.sql.Array;
import java.util.*;
import java.time.Month;

public class Main{
    public static void main (String[] args) throws FileNotFoundException, IOException {

    }

    //start of file functions.
    public static void showFileContent(String file) throws FileNotFoundException, IOException{
        File f = new File(file);
        FileInputStream fis = new FileInputStream(f);
        byte[] msg = new byte[(int)f.length()];
        fis.read(msg);
        String strMsg = new String(msg); //convert byte array to string
        System.out.println(strMsg);
    }



    //warning: this functions deletes all file content then writes your message
    public static void writeMessageIn(String file, String msg) throws FileNotFoundException, IOException{
        FileOutputStream fos = new FileOutputStream(file);
        byte[] byteMsg = msg.getBytes();
        fos.write(byteMsg);
        fos.close();
    }

    public static int countNumberOfBytes(String file) throws FileNotFoundException, IOException{
        FileInputStream fis = new FileInputStream(file);

        int bytes = 0;
        while(fis.read() != -1) bytes++;
        System.out.print("Number of existing bytes is ");
        return bytes; //it returns the number of letters which is equivalent to the number of bytes.
    }

    public static void copyFileToDirectory(String file, String outputName) throws FileNotFoundException, IOException{
        File f = new File(file);

        FileInputStream fis = new FileInputStream(f);
        byte[] byteArray = new byte[(int)f.length()];
        fis.read(byteArray);

        FileOutputStream fos = new FileOutputStream(outputName);
        fos.write(byteArray);
        fos.flush();
        fos.close();
    }
}