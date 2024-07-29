import java.io.File;
import java.util.Scanner;

public class DirectoryListing {
    
    static void listFilesAndDirectories(File directory){
        File[] fileList = directory.listFiles();
        if (fileList != null){
            for (File file : fileList){
                System.out.println(file.getName());
                if (file.isDirectory()){
                    listFilesAndDirectories(file);
                }
            }
        }
    }

    static void searchFile(File directory, String fileName){
        File[] fileList = directory.listFiles();
        if (fileList != null){
            for (File file : fileList){
                if (file.isFile() && file.getName().equals(fileName)){
                    System.out.println("File found at " + file.getAbsolutePath());
                    return;
                } else if (file.isDirectory()){
                    searchFile(file, fileName);
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter directory path:");
        String directoryPath = sc.nextLine();
        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()){
            System.out.println("Files and directories in the specified directory:");
            listFilesAndDirectories(directory);

            System.out.println("Enter file name to search:");
            String fileName = sc.nextLine();

            System.out.println("Searching for file " + fileName);
            searchFile(directory, fileName);
        } else {
            System.out.println("Invalid directory path");
        }

        sc.close();
    }
}
