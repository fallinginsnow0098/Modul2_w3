package bai19.baitap._PhoneNumberValid;

public class PhoneNumberValidTest {
    private static final String[] phoneNumbers = {"(84)-(0978489648)","(a8)-(22222222)","(09)-(aljskjasgljh)"};

    public static void main(String[] args) {
        PhoneNumberValid phoneNumberValid = new PhoneNumberValid();
        for (String phoneNumber : phoneNumbers) {
            boolean isValid = phoneNumberValid.validate(phoneNumber);
            System.out.println("Phone number [" + phoneNumber + "] is valid: " + isValid );
        }
    }
}
