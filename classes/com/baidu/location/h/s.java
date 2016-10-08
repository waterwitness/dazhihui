package com.baidu.location.h;

import java.util.List;

class s
{
  public static String a = null;
  public int b = 0;
  private boolean c = false;
  private String d = "";
  private boolean e = false;
  private double f = 0.0D;
  private double g = 0.0D;
  
  public s(List paramList, String paramString1, String paramString2, String paramString3)
  {
    this.d = paramString3;
    d();
  }
  
  private boolean a(String paramString)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramString != null)
    {
      bool1 = bool2;
      if (paramString.length() > 8)
      {
        int i = 1;
        int j = 0;
        while (i < paramString.length() - 3)
        {
          j ^= paramString.charAt(i);
          i += 1;
        }
        bool1 = bool2;
        if (Integer.toHexString(j).equalsIgnoreCase(paramString.substring(paramString.length() - 2, paramString.length()))) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  private void d()
  {
    int i = 0;
    Object localObject;
    if (a(this.d))
    {
      localObject = this.d.substring(0, this.d.length() - 3);
      int k;
      for (int j = 0; i < ((String)localObject).length(); j = k)
      {
        k = j;
        if (((String)localObject).charAt(i) == ',') {
          k = j + 1;
        }
        i += 1;
      }
      localObject = ((String)localObject).split(",", j + 1);
      if (localObject.length < 6) {
        return;
      }
      if ((localObject[2].equals("")) || (localObject[(localObject.length - 3)].equals("")) || (localObject[(localObject.length - 2)].equals("")) || (localObject[(localObject.length - 1)].equals(""))) {}
    }
    try
    {
      this.f = Double.valueOf(localObject[(localObject.length - 3)]).doubleValue();
      this.g = Double.valueOf(localObject[(localObject.length - 2)]).doubleValue();
      this.e = true;
      this.c = this.e;
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public boolean a()
  {
    return this.c;
  }
  
  public double b()
  {
    return this.f;
  }
  
  public double c()
  {
    return this.g;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\h\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */