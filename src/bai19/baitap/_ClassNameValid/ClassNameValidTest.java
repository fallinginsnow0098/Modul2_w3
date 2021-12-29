package bai19.baitap._ClassNameValid;

public class ClassNameValidTest {
    public static void main(String[] args) {
        ClassNameValid classNameValid = new ClassNameValid();
        String[] testClass = new String[] {"C0318G","M0318G", "P0323A","A1234H","P1133L"};
        for (String className : testClass) {
            boolean isValid = classNameValid.validate(className);
            System.out.println("Class name [" + className + "] is valid: " + isValid);
        }

    }
}
