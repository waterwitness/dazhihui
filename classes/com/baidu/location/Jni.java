package com.baidu.location;

public class Jni
{
  private static int a = 0;
  private static int b = 1;
  private static int c = 2;
  private static int d = 11;
  private static int e = 12;
  private static int f = 13;
  private static int g = 14;
  private static int h = 15;
  private static int i = 1024;
  private static boolean j = false;
  
  static
  {
    try
    {
      System.loadLibrary("locSDK6a");
      return;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      localUnsatisfiedLinkError.printStackTrace();
      j = true;
    }
  }
  
  public static String a()
  {
    if (j) {
      return "err!";
    }
    try
    {
      String str = sky();
      return str;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      localUnsatisfiedLinkError.printStackTrace();
    }
    return "err!";
  }
  
  public static String a(String paramString)
  {
    if (j) {
      return "err!";
    }
    return b(paramString) + "|tp=3";
  }
  
  private static native String a(byte[] paramArrayOfByte, int paramInt);
  
  public static double[] a(double paramDouble1, double paramDouble2, String paramString)
  {
    double[] arrayOfDouble = new double[2];
    double[] tmp7_5 = arrayOfDouble;
    tmp7_5[0] = 0.0D;
    double[] tmp11_7 = tmp7_5;
    tmp11_7[1] = 0.0D;
    tmp11_7;
    if (j) {
      return tmp7_5;
    }
    int k = -1;
    if (paramString.equals("bd09")) {
      k = a;
    }
    try
    {
      for (;;)
      {
        paramString = b(paramDouble1, paramDouble2, k, 132456).split(":");
        tmp7_5[0] = Double.parseDouble(paramString[0]);
        tmp7_5[1] = Double.parseDouble(paramString[1]);
        return tmp7_5;
        if (paramString.equals("bd09ll")) {
          k = b;
        } else if (paramString.equals("gcj02")) {
          k = c;
        } else if (paramString.equals("gps2gcj")) {
          k = d;
        } else if (paramString.equals("bd092gcj")) {
          k = e;
        } else if (paramString.equals("bd09ll2gcj")) {
          k = f;
        } else if (paramString.equals("wgs842mc")) {
          k = h;
        }
      }
    }
    catch (UnsatisfiedLinkError paramString)
    {
      for (;;) {}
    }
  }
  
  private static native String b(double paramDouble1, double paramDouble2, int paramInt1, int paramInt2);
  
  public static String b(String paramString)
  {
    int k = 740;
    int m = 0;
    if (j) {
      return "err!";
    }
    if (paramString == null) {
      return "null";
    }
    paramString = paramString.getBytes();
    byte[] arrayOfByte = new byte[i];
    int n = paramString.length;
    if (n > 740) {}
    for (;;)
    {
      int i1;
      for (n = 0; m < k; n = i1)
      {
        i1 = n;
        if (paramString[m] != 0)
        {
          arrayOfByte[n] = paramString[m];
          i1 = n + 1;
        }
        m += 1;
      }
      try
      {
        paramString = a(arrayOfByte, 132456);
        return paramString;
      }
      catch (UnsatisfiedLinkError paramString)
      {
        paramString.printStackTrace();
        return "err!";
      }
      k = n;
    }
  }
  
  public static String c(String paramString)
  {
    if (j) {
      return "err!";
    }
    if (paramString == null) {
      return "null";
    }
    paramString = paramString.getBytes();
    try
    {
      paramString = c(paramString, 132456);
      return paramString;
    }
    catch (UnsatisfiedLinkError paramString)
    {
      paramString.printStackTrace();
    }
    return "err!";
  }
  
  private static native String c(byte[] paramArrayOfByte, int paramInt);
  
  public static Long d(String paramString)
  {
    if (j) {
      return null;
    }
    try
    {
      paramString = new String(paramString.getBytes(), "UTF-8");
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        try
        {
          long l = murmur(paramString);
          return Long.valueOf(l);
        }
        catch (UnsatisfiedLinkError paramString)
        {
          paramString.printStackTrace();
        }
        paramString = paramString;
        paramString = "";
      }
    }
    return null;
  }
  
  public static String e(String paramString)
  {
    if (j) {
      return "err!";
    }
    try
    {
      paramString = new String(paramString.getBytes(), "UTF-8");
    }
    catch (Exception paramString)
    {
      try
      {
        for (;;)
        {
          paramString = encodeNotLimit(paramString, 132456);
          return paramString + "|tp=3";
          paramString = paramString;
          paramString = "";
        }
      }
      catch (UnsatisfiedLinkError paramString)
      {
        for (;;)
        {
          paramString.printStackTrace();
          paramString = "err!";
        }
      }
    }
  }
  
  private static native String ee(String paramString, int paramInt);
  
  private static native String encodeNotLimit(String paramString, int paramInt);
  
  public static String f(String paramString)
  {
    if (j) {
      return "err!";
    }
    try
    {
      paramString = new String(paramString.getBytes(), "UTF-8");
    }
    catch (Exception paramString)
    {
      try
      {
        for (;;)
        {
          paramString = ee(paramString, 132456);
          return paramString + "|tp=4";
          paramString = paramString;
          paramString = "";
        }
      }
      catch (UnsatisfiedLinkError paramString)
      {
        for (;;)
        {
          paramString.printStackTrace();
          paramString = "err!";
        }
      }
    }
  }
  
  private static native long murmur(String paramString);
  
  private static native String sky();
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\Jni.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */