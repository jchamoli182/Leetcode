/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package jayesh.orcale.certificate;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

/**
 *
 * @author Jayesh
 */
public class Oracle {

    public static void main(String[] args) {
        // Person person = new Person("Jayesh");

        // person.Print();

        // try {
        //     String Filename = Person.name;
        //     String path = "C:\\Users\\Jayesh\\Desktop\\SELENIUM";
        //     File file = new File(path + "\\JAVA" + ".txt");
        //     if(file.createNewFile()){
        //         System.out.println("file created successfully");
        //         System.out.println(file.getAbsoluteFile());
        //     }else{
        //         System.out.println("file already exists");
        //         FileOutputStream fo = new FileOutputStream(file,true);
        //         String s = "Hello\n";
        //         fo.write(s.getBytes());
        //         fo.close();
        //         System.out.println("file writeen successfully");
        //     }
            
        // } catch (Exception e) {
        //     System.out.println("failed due to following exception " + e);
        // }

        System.out.println("Taking the file name as an input from the user: ");
        Scanner sc = new Scanner(System.in);
        String searchFile = sc.next();


        try {
            String dir = "C:\\Users\\Jayesh\\Desktop\\SELENIUM\\ORACLE";
            File file = new File(dir);

            if(!file.isDirectory() || !file.exists()){
                System.out.println("No such directory exists creating the directory");
                if(file.mkdir()){
                    System.out.println("directory was successfully created!");
                }else{
                    System.out.println("Error while creating the dir");
                    return;
                }
            }

            File[] files = file.listFiles();
            if(files == null){
                System.out.println("error reading the folder");
                return;
            }

            boolean flag = false;
            for(File f : files){
                if(f.getName().equals(searchFile)){
                    flag = true;
                    break;
                }
            }

            if(flag == true){
                System.out.println("File is already present");
                FileOutputStream fo = new FileOutputStream(dir + "\\" + searchFile);
                String s = "Writing into the file after searching it";
                fo.write(s.getBytes());
                fo.close();
            }

            else{
                System.out.println("file not found creating the file...");
                File nFile = new File(dir + "\\" + searchFile);
                nFile.createNewFile();
                FileOutputStream fo = new FileOutputStream(nFile);
                String s = "Created a file and written!";
                fo.write(s.getBytes());
                fo.close();
            }


        } catch (Exception e) {
            System.out.println("Error while executing the code" + e);
        }
        finally{
            sc.close();
        }


        
    }
}
