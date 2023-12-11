package com.karadyauran._2023_09_26_lesson;

class Solution {
  public static void main(String[] args) {
    System.out.println(longestCommonPrefix(new String[] {"abca","abc"}));
    System.out.println(longestCommonPrefix(new String[] {"cir", "car"}));
    System.out.println(longestCommonPrefix(new String[] {"flower","flow","flight"}));
    System.out.println(longestCommonPrefix(new String[] {"abb","abc"}));
  }
  public static String longestCommonPrefix(String[] strs) {
    if (strs[0].isEmpty()) return "";
    int index = 0;

    for (int i = 0; i < strs.length + 1; i++) {
      index = i;
      for (int j = 1; j < strs.length; j++) {
        if (strs[0].length() <= i || strs[j].length() <= i) return strs[0].substring(0, i);
        if (strs[0].charAt(i) != strs[j].charAt(i)) return strs[0].substring(0, i);
      }
    }

    return strs[index - 1];
  }
}

// ["a","ac"]
// ["flower","flow","flight"]