package bai19.thuchanh._ValidateEmail;

public class TestEmailExample {
    public static final String[] validEmail = new String[] { "hongnamz1211@gmail.com", "sales08.taybactravel@yahoo.com", "leviethungkm2003@hotmail.com" };
    public static final String[] invalidEmail = new String[]  { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };
    public static void main(String[] args) {
        EmailExample emailExample = new EmailExample();
        for (String email: validEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid: " + isValid);
        }
        for (String email : invalidEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid: " + isValid);
        }
    }
}
