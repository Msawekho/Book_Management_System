import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class DirectoryManager {

    public static void listFilesAndDirectories(String directoryPath) {
        // TODO 1a: Define the directory path and create a File object
        File directory = new File(directoryPath);  // Ensure this directory exists in your project folder
        File[] filesList = directory.listFiles();  // TODO 1b: List all files in the directory

        if (filesList != null) {
            // TODO 1c: Loop through filesList to print each file's name
            System.out.println("List of books available in " + directoryPath + ":");
            for (File file : filesList) {
                System.out.println("Title: " + file.getName());  // TODO 1d: Print the name of each file or directory
            }
        } else {
            // TODO 1e: Handle the case where the directory is empty or does not exist
            System.out.println("The directory is empty or does not exist.");
        }
    }

    public  static  void createDirectory(String directoryPath){
        // TODO 2a: Define the directory and check if it exists
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            // TODO 2b: Attempt to create the directory if it does not exist
            if (directory.mkdirs()) {
                System.out.println("Directory created successfully: " + directoryPath);
            } else {
                // TODO 2c: Handle failure in creating directory
                System.out.println("Failed to create directory");
            }
        }
    }

    public static void renameDirectory(String currentDirectory, String newDirectory) {
        // TODO 3a: Initialize File objects for the current and new directory
        File oldDir = new File(currentDirectory);  // Use variable, not string literal
        File newDir = new File(newDirectory);      // Use variable, not string literal

        // TODO 3b: Ensure the new directory does not already exist
        if (newDir.exists()) {
            System.out.println("Error: The new directory name already exists.");
            return;
        }

        // TODO 3c: Try renaming the directory and provide feedback
        if (!oldDir.renameTo(newDir)) {
            System.out.println("Failed to rename directory.");
        } else {
            System.out.println("Directory has been renamed successfully.");
        }
    }

    public static void copyFiles(String sourceDir, String destDir) {
        try {
            // TODO 4a: Create Path objects from the String parameters
            Path sourcePath = Paths.get(sourceDir);
            Path destPath = Paths.get(destDir);

            // TODO 4b: Create the destination directory if it doesn't exist
            if (!Files.exists(destPath)) {
                Files.createDirectories(destPath);
            }

            // TODO 4c: Iterate through the files in the source directory
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(sourcePath);
            for (Path sourceFilePath : directoryStream) {
                Path destFilePath = destPath.resolve(sourceFilePath.getFileName());

                // TODO 4d: Copy the file to the destination directory
                Files.copy(sourceFilePath, destFilePath, StandardCopyOption.REPLACE_EXISTING);
            }

        } catch (IOException e) {
            // TODO 4e: Handle any IOExceptions that occur during the process
            e.printStackTrace();
        }
    }

    public static void deleteFile(String fileName) {
        // TODO 5a: Create a File object for the file to be deleted
        File file = new File(fileName);
        if (file.delete()) {
            // TODO 5b: Print a message indicating the file has been deleted
            System.out.println(fileName + " has been deleted.");
        } else {
            // TODO 5c: Handle the case where deletion fails
            System.out.println("Failed to delete " + fileName);
        }
    }
}

