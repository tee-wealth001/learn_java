import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileLearning {

    public FileLearning() {

        createFile();

        writeFile();

        readFile();

        deleteFile();

    }

    public void createFile() {
        try {
            // creates a file in an absolute path
            // if in a specific path, use "c:\\xxx\\xxx\\xxx\\filename.txt"
            File myfile = new File("sample1.txt");
            if (myfile.createNewFile()) {
                System.out.println("file created: >>>" + myfile.getName());
            } else {
                System.out.println("File already exist");
            }

        } catch (Exception e) {
            System.out.println("Error occured !!!");
            e.printStackTrace();
        }
    }

    public void writeFile() {

        // writing to a file in java using the filewriter
        // if the text doesnt change, it doesnt duplicate
        try {

            FileWriter fileWriter = new FileWriter("sample1.txt");

            fileWriter.write("look, JAVA is fun, trust me, I know what i am saying");

            fileWriter.close();

            System.out.println("writing to file was successful!!!");

        } catch (IOException e) {
            System.out.println("Error occured!!!");
            e.printStackTrace();
        }
    }

    public void readFile() {
        // reading a file content
        try {

            File myobj = new File("sample1.txt");
            Scanner myReader = new Scanner(myobj);
            while (myReader.hasNextLine()) {
                String word = myReader.nextLine();

                System.out.println("word >>>>" + word);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }

    public void deleteFile() {

        // deleting a file
        // you can also delete a folder but it must be empty
        File myFile = new File("sample1.txt");
        if (myFile.delete()) {

            System.out.println("File successfully deleted!!");
        } else {

            System.out.println("file failed to delete");
        }
    }

}
