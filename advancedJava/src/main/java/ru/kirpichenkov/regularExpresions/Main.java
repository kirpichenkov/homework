package ru.kirpichenkov.regularExpresions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        /*
        \\d - одна цифра
        \\d+ - 1 или более цифр
        \\d* - 0 или более цифр
         */
       String s1 = "ABC ABCE ABCFABCGABC";
        Pattern pattern = Pattern.compile("ABC");
        Matcher matcher = pattern.matcher(s1);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }

}
