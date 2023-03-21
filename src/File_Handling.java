
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vishal chandravanshi
 */
public class File_Handling {

    public static void main(String[] args) {
//        File file=new File("FileHandlingby.txt");
//        FileWriter fileWriter=new FileWriter("FileHandlingby.txt");
//        try{
//            file.createNewFile();
//            fileWritter.write("this is my first program of file handling");
//            
//        }
//        catch(IOException e)
//          {
//                System.out.println("unable to create this file");  
//          }
/*try{
 FileWriter fileWriter=new FileWriter("FileHandlingby.txt");
 fileWriter.write("this is my first program on file handling ");
 fileWriter.close();
}
catch(IOException e)
{
    System.out.println(e);
}*/

//        File file = new File("FileHandlingby.txt");
//        try {
//            Scanner sc = new Scanner(file);
//            while (sc.hasNextLine()) {
//                String line = sc.nextLine();
//                System.out.println(line);
//            }
//
//        } catch (FileNotFoundException e) {
//            System.out.println(e);
//        }

 File file = new File("FileHandlingby.txt");
 
 if(file.delete())
            System.out.println("i delete my file successfully "+file.getName());
 else
            System.out.println("some error occur ");
    }
}
