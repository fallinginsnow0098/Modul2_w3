package bai16.baitap.copyfile;

import java.io.*;

public class CopyFile {
    public void copyFile(String input, String target){
        try{
            File inputFile = new File(input);
            File targetFile = new File(target);
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile));
            String line;
            int count = 0;
            while ((line = br.readLine()) != null){
                for (int i = 0; i < line.length(); i++) {
                    bw.write((line.charAt(i)));
                    count++;
                }
                bw.write("\n");
            }
            bw.close();
            System.out.println("Character is: " + count);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void checkFile(File fileInput, File fileTarget) throws FileNotFoundException {
        if (!fileInput.exists() || !fileTarget.exists()){
            throw new FileNotFoundException();
        }
    }
}
