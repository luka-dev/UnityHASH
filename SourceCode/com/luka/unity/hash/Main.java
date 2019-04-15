package com.luka.unity.hash;

import java.io.PrintStream;

public class Main { public Main() {}
  public static void main(String[] args) { if (args.length <= 0)
    {
      System.out.println("Need file name or full path to file.");
      return;
    }
    
    for (int i = 0; i < args.length; i++)
    {
      String path = Utils.fixPath(args[i]);
      String hash = Unity.obbHashCalculator(path);
      
      System.out.println(args[i]);
      if (hash == null)
      {
        System.out.println("Error");
      }
      else
      {
        System.out.println(hash);
      }
    }
  }
}
