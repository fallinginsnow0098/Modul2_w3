package bai19.thuchanh;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String REGEX = "^{8,}";
        Pattern pattern ;
        Matcher matcher ;
        do {
            System.out.println("Enter test password");
            String password = scanner.nextLine();
            pattern = Pattern.compile(REGEX);
            matcher = pattern.matcher(password);
        if (matcher.find()){
            System.out.println("True");
        } else {
            System.err.println("False");
        }
        } while (matcher.find()) ;
    }
}
