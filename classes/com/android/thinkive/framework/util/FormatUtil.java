package com.android.thinkive.framework.util;

import android.net.Uri;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormatUtil
{
  public static double formatDecimal(double paramDouble, int paramInt)
  {
    return new BigDecimal(paramDouble).setScale(paramInt, 4).doubleValue();
  }
  
  public static String formatUrlToDomain(String paramString)
  {
    paramString = Pattern.compile("[^//]*?(\\.(com|cn|net|org|biz|info|cc|tv)){1,2}", 2).matcher(paramString);
    if (paramString.find()) {
      return paramString.group();
    }
    return null;
  }
  
  public static String formatUrlToHost(String paramString)
  {
    String str2 = formatUrlToIp(paramString);
    String str1 = str2;
    if (str2 == null) {
      str1 = formatUrlToDomain(paramString);
    }
    return str1;
  }
  
  public static String formatUrlToIp(String paramString)
  {
    paramString = Pattern.compile("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}").matcher(paramString);
    if (paramString.find()) {
      return paramString.group();
    }
    return null;
  }
  
  public static String formatUrlToKey(String paramString)
  {
    paramString = Uri.parse(paramString);
    String str = paramString.getHost();
    int j = paramString.getPort();
    int i = j;
    if (j < 0) {
      i = 80;
    }
    return str + ":" + i;
  }
  
  public static int formatUrlToPort(String paramString)
  {
    int i = 80;
    paramString = Pattern.compile("\\:\\d{1,5}").matcher(paramString);
    if (paramString.find()) {
      i = Integer.parseInt(paramString.group().replace(":", ""));
    }
    return i;
  }
  
  public static CharSequence getAppSize(long paramLong)
  {
    if (paramLong <= 0L) {
      return "0M";
    }
    if (paramLong >= 1048576L) {
      return new StringBuilder(16).append(Constant.DOUBLE_DECIMAL_FORMAT.format(paramLong / 1048576.0D)).append("M");
    }
    if (paramLong >= 1024L) {
      return new StringBuilder(16).append(Constant.DOUBLE_DECIMAL_FORMAT.format(paramLong / 1024.0D)).append("K");
    }
    return paramLong + "B";
  }
  
  public static String getPercent(long paramLong1, long paramLong2)
  {
    int i;
    if ((paramLong1 <= 0L) || (paramLong2 <= 0L)) {
      i = 0;
    }
    for (;;)
    {
      return 16 + i + "%";
      if (paramLong1 > paramLong2) {
        i = 100;
      } else {
        i = (int)(paramLong1 / paramLong2 * 100.0D);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\util\FormatUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */