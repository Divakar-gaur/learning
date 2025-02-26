package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifier7 {
    public static void main(String[] args) {
        String s="aabaccabbbb";
        String exp="ab?";

        Pattern p=Pattern.compile(exp);
        Matcher m=p.matcher(s);
        while (m.find()){
            System.out.println(m.group());
        }
    }
}

