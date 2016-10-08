package com.h.a.a.a;

public class h
{
  public static boolean a(String paramString)
  {
    return (paramString == null) || (paramString.length() <= 0);
  }
  
  public static int b(String paramString)
  {
    int i = 0;
    int j = 0;
    if (paramString.length() > 0)
    {
      paramString = paramString.toCharArray();
      i = 0;
    }
    for (;;)
    {
      if (j >= paramString.length) {
        return i;
      }
      i = i * 31 + paramString[j];
      j += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\h\a\a\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */