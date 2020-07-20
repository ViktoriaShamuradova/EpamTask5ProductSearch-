package by.epamtc.shamuradova.appliance_search.dao.dao_file_txt_impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ParserStringLines {

    String findLines(String lines, String regex, String start) {
        StringBuilder res = new StringBuilder();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;

        lines = firstWordToUpperCase(lines);
        if (lines.startsWith(start.toUpperCase())) {
            matcher = pattern.matcher(lines);
            if (matcher.find()) {
                res.append(lines);
            }
        }

        return new String(res);
    }

    private String firstWordToUpperCase(String lines) {
        if (lines.isEmpty()) {
            return "";
        }
        int i = lines.indexOf(" ");
        String word = lines.substring(0, i);
        String s = word.toUpperCase();
        return s + lines.substring(i);
    }
}
