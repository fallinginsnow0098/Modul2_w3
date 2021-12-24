package bai16.thuchanh.readwritefiletext;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> list = readAndWriteFile.readFile("src/bai16/thuchanh/readwritefiletext/number.txt");
        int maxValue = findMax(list);
        readAndWriteFile.writeFile("src/bai16/thuchanh/readwritefiletext/result.txt", maxValue);
    }
    public static int findMax(List<Integer> listNumbers){
        int max = listNumbers.get(0);
        for (int i = 0; i < listNumbers.size(); i++) {
            if (max < listNumbers.get(i)){
                max = listNumbers.get(i);
            }
        }
        return max;
    }
    public void writeFile(String filePath, int max){
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter br = new BufferedWriter(writer);
            br.write("Maximum number is: " + max);
            br.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public List<Integer> readFile(String path){
        List<Integer> listNumber = new ArrayList<>();
        try {
            File file = new File(path);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ( (line = br.readLine()) != null){
                listNumber.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e){
            System.out.println("File not exists!!");
        }
        return listNumber;
    }
}
