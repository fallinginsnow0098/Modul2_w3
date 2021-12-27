package bai17.thuchanh.copyfile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class CopyFileUsingStream {
    public static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    public static void copyFileUsingStream(File source, File dest) throws IOException{
        try (InputStream is = new FileInputStream(source); OutputStream os = new FileOutputStream(dest)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read()) > 0) {
                os.write(buffer, 0, length);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter source file: ");
        String sourcePath = in.nextLine();
        System.out.print("Enter destination file: ");
        String destPath = in.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);
        try {
           copyFileUsingJava7Files(sourceFile, destFile);
            System.out.println("Copy completed");
        } catch (IOException e){
            System.out.println("Can't copy last file");
            System.out.printf(e.getMessage());
        }
    }
}
