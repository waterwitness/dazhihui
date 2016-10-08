package com.squareup.okhttp.internal.http;

final class HeaderParser
{
  public static void parseCacheControl(String paramString, HeaderParser.CacheControlHandler paramCacheControlHandler)
  {
    int i = 0;
    String str2;
    for (;;)
    {
      if (i >= paramString.length()) {
        return;
      }
      j = skipUntil(paramString, i, "=,;");
      str2 = paramString.substring(i, j).trim();
      if ((j != paramString.length()) && (paramString.charAt(j) != ',') && (paramString.charAt(j) != ';')) {
        break;
      }
      i = j + 1;
      paramCacheControlHandler.handle(str2, null);
    }
    int j = skipWhitespace(paramString, j + 1);
    String str1;
    if ((j < paramString.length()) && (paramString.charAt(j) == '"'))
    {
      i = j + 1;
      j = skipUntil(paramString, i, "\"");
      str1 = paramString.substring(i, j);
      i = j + 1;
    }
    for (;;)
    {
      paramCacheControlHandler.handle(str2, str1);
      break;
      i = skipUntil(paramString, j, ",;");
      str1 = paramString.substring(j, i).trim();
    }
  }
  
  public static int parseSeconds(String paramString)
  {
    try
    {
      long l = Long.parseLong(paramString);
      if (l > 2147483647L) {
        return Integer.MAX_VALUE;
      }
      if (l < 0L) {
        return 0;
      }
      return (int)l;
    }
    catch (NumberFormatException paramString) {}
    return -1;
  }
  
  public static int skipUntil(String paramString1, int paramInt, String paramString2)
  {
    for (;;)
    {
      if (paramInt >= paramString1.length()) {}
      while (paramString2.indexOf(paramString1.charAt(paramInt)) != -1) {
        return paramInt;
      }
      paramInt += 1;
    }
  }
  
  public static int skipWhitespace(String paramString, int paramInt)
  {
    for (;;)
    {
      if (paramInt >= paramString.length()) {}
      int i;
      do
      {
        return paramInt;
        i = paramString.charAt(paramInt);
      } while ((i != 32) && (i != 9));
      paramInt += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\http\HeaderParser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */