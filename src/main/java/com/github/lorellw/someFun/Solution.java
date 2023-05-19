package com.github.lorellw.someFun;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//int32 max value = 2 147 483 647
//Pattern p = Pattern.compile("^[ ]*[0]*([+\\-]?[1-9]\\d*)");
public class Solution {
    public static int atoi(String s){
        s = s.stripLeading();

        Pattern p = Pattern.compile("^[ ]*[+\\-]?[0]*([0-9]\\d*)");
        Matcher m = p.matcher(s);

        if (m.find()){
            s = s.substring(m.start(),m.end());
            try{
                return Integer.parseInt(s);
            }catch (NumberFormatException e){
                return s.charAt(0) == '-' ? -2147483648 : 2147483647;
            }
        }
        return 0;
    }
}
