package bai17.baitap.optional.copy_binary_file;

import java.io.*;

public class Main {
    private static final String PATH_NAME = "src/bai17/baitap/productmanager/product.txt";
    private static final String PATH_TARGET = "src/bai17/baitap/optional/copy_binary_file/target.txt";
    public static void main(String[] args) {
        try {
            InputStream inputStream = new BufferedInputStream(new FileInputStream(new File(PATH_NAME)));
            OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(new File(PATH_TARGET)));
            byte read;
            int count = 0;
            while ((read = (byte) inputStream.read()) != -1){
                outputStream.write(read);
                count++;
            }
            outputStream.close();
            System.out.println("Byte count = " + count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
