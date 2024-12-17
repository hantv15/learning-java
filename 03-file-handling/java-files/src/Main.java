import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String pathName = "./public/java_files.txt";
        File myObj = new File(pathName);

        // Create a File
        try {
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName()); // File created: java_files.txt
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Write to a file
        try {
            FileWriter myWriter = new FileWriter(pathName);
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file"); // Successfully wrote to the file
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Read a File
        try {
            File myRead = new File(pathName);
            Scanner myReader = new Scanner(myRead);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data); // Files in Java might be tricky, but it is fun enough!
            }
        } catch(FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Get File Information
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName()); // File name: java_files.txt
            System.out.println("Absolute path: " + myObj.getAbsolutePath()); // Absolute path: /Users/zindesss/intellij-workspace/learning-java/03-file-handling/java-files/./public/java_files.txt
            System.out.println("Writeable: " + myObj.canWrite()); // Writeable: true
            System.out.println("Readable " + myObj.canRead()); // Readable true
            System.out.println("File size in bytes " + myObj.length()); // File size in bytes 52
        } else {
            System.out.println("File does not exist.");
        }

        // Java Delete Files - Java can delete folder
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName()); // Deleted the file: java_files.txt
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}