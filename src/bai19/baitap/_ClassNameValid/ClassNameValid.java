package bai19.baitap._ClassNameValid;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameValid {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String CLASS_NAME_REGEX = "^[C,A,P][0-9]{4}[G,H,I,K,L,M]$";
    public ClassNameValid(){
        pattern = Pattern.compile(CLASS_NAME_REGEX);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
