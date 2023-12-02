package org.example.regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx5 {
  public static void main(String[] args) {
    String cardData = "45645463234587640823445";
    String regex = "(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})";

    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(cardData);

    String newString = matcher.replaceAll("CARD NUMBER: $1 $2 $3 $4 DATE: $5/$6 CVV: $7");
    System.out.println(newString);
  }
}
