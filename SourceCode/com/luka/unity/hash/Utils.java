package com.luka.unity.hash;

public class Utils
{
  public Utils() {}
  
  public static String fixPath(String path) {
    return path.replaceAll("/+|\\\\+", "\\\\").toString();
  }
  
  public static boolean arrayContain(String[] haystack, String needle) {
    for (int i = 0; i < haystack.length; i++) {
      if (haystack[i] == needle) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean arrayContain(int[] haystack, int needle) {
    for (int i = 0; i < haystack.length; i++) {
      if (haystack[i] == needle) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean arrayContain(float[] haystack, float needle) {
    for (int i = 0; i < haystack.length; i++) {
      if (haystack[i] == needle) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean arrayContain(double[] haystack, double needle) {
    for (int i = 0; i < haystack.length; i++) {
      if (haystack[i] == needle) {
        return true;
      }
    }
    return false;
  }
}
