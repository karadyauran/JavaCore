package org.example.regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx1 {
  public static void main(String[] args) {
    String text = "ABCDABCDE ABCD ABAC ABCDAB ABCF ABCDABCDEF AB9F";
    // Pattern pattern = Pattern.compile("AB[C-Y]");
    Pattern pattern = Pattern.compile("AB[^C-Y-0-9]");
    Matcher matcher = pattern.matcher(text);

    while (matcher.find()) {
      System.out.println(matcher.group());
    }
  }
}
