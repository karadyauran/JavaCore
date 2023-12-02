package org.example.JUnit_Testing.lesson_2023_11_08;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class StringUtil {
  public boolean checkStrings(String a, String b) {
    Stack<Character> s = new Stack<>();
    for (char c : b.toCharArray()) {
      if (c != '#') s.push(c);
      else if (!s.isEmpty()) s.pop();
    }
    return a.length() == s.size();
  }

  public boolean getFirstPosition(String str) {
    int res = 0;

    for (char c : str.toCharArray()) {
      if (c == 'L' || c == 'D') res--;
      else res++;
    }

    return res == 0;
  }

  public int countChars(String a, String b) {
    Set<Character> charSet = new HashSet<>();
    for (char aChar : a.toCharArray()) {
      charSet.add(aChar);
    }

    int count = 0;

    for (char bChar : b.toCharArray()) {
      if (charSet.contains(bChar)) {
        count++;
      }
    }

    return count;
  }
}
