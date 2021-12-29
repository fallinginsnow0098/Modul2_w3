package bai19.baitap._PhoneNumberValid;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValid {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String PHONE_NUMBER_VALID = "^[(][0-9]{2}[)][-][(][0-9]{10,11}[)]$";
    public PhoneNumberValid(){
        pattern = Pattern.compile(PHONE_NUMBER_VALID);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
