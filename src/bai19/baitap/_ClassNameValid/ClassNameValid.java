package bai19.baitap._ClassNameValid;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameValid {
    private static Pattern pattern;
    private static final String CLASS_NAME_REGEX = "^[CAP][0-9]{4}[GHIKLM]$";
    public ClassNameValid(){
        pattern = Pattern.compile(CLASS_NAME_REGEX);
    }
    public boolean validate(String regex){
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
