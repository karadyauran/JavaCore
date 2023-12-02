package org.example.regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx2 {
  public static void main(String[] args) {
    String text = "La tablet Lenovo Tab M10 Plus de " +
            "tercera@gmail.com generación de 64 GB con procesador " +
            "Snapdragon 680 y una pantalla de 10,6 pulgadas " +
            "está en ofer_ta@yahoo.com por 139 euros, " +
            "su precio más bajo@mail.ru.uk hasta@mail,ru el momento";
    String patt = "\\w+@\\w+\\.(ru\\.uk|com\\.uk|com|ru|)";

    Pattern pattern = Pattern.compile(patt);
    Matcher matcher = pattern.matcher(text);

    while (matcher.find()) {
      System.out.println(matcher.group());
    }
  }
}
