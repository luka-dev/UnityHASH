package com.luka.unity.hash;

import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Unity
{
  public Unity() {}
  
  public static String obbHashCalculator(String filePath)
  {
    byte[] digest;
    try
    {
      MessageDigest instance = MessageDigest.getInstance("MD5");
      FileInputStream fileInputStream = new FileInputStream(filePath);
      long length = new File(filePath).length();
      fileInputStream.skip(length - Math.min(length, 65558L));
      byte[] bArr = new byte['Ѐ'];
      for (int i2 = 0; i2 != -1; i2 = fileInputStream.read(bArr)) {
        instance.update(bArr, 0, i2);
      }
      digest = instance.digest();
    } catch (NoSuchAlgorithmException|java.io.IOException e) { byte[] digest;
      digest = null;
    }
    if (digest == null) {
      return null;
    }
    
    StringBuilder stringBuffer = new StringBuilder();
    
    for (int i = 0; i < digest.length; i++) {
      stringBuffer.append(Integer.toString((digest[i] & 0xFF) + 256, 16).substring(1));
    }
    
    return stringBuffer.toString();
  }
}
