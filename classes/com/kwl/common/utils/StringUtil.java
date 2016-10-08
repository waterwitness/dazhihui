package com.kwl.common.utils;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil
{
  public static final int TYPE_CHINA = 3;
  public static final int TYPE_ENGLISH = 1;
  public static final int TYPE_FUHAO = 2;
  public static final int TYPE_NUMBER = 0;
  private static final ThreadLocal<SimpleDateFormat> dateFormater = new StringUtil.1();
  private static final ThreadLocal<SimpleDateFormat> dateFormater2 = new StringUtil.2();
  private static final Pattern emailer = Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");
  private static final Pattern userName = Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]*$");
  
  public static String addPrefix(int paramInt, String paramString)
  {
    if (paramInt < 10) {
      return paramString + paramInt;
    }
    return String.valueOf(paramInt);
  }
  
  public static String addPrefix(String paramString1, String paramString2)
  {
    return addPrefix(Integer.parseInt(paramString1), paramString2);
  }
  
  public static String addPrefixHtmlSpace(int paramInt)
  {
    return addPrefix(paramInt, "&nbsp;");
  }
  
  public static String addPrefixHtmlSpace(String paramString)
  {
    return addPrefix(paramString, "&nbsp;");
  }
  
  public static String addPrefixZero(int paramInt)
  {
    return addPrefix(paramInt, "0");
  }
  
  public static String addPrefixZero(String paramString)
  {
    return addPrefix(paramString, "0");
  }
  
  public static String bytesToHexString(byte[] paramArrayOfByte)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 0;
    for (;;)
    {
      if (i >= paramArrayOfByte.length) {
        return localStringBuffer.toString();
      }
      String str = Integer.toHexString(paramArrayOfByte[i] & 0xFF);
      if (str.length() == 1) {
        localStringBuffer.append('0');
      }
      localStringBuffer.append(str);
      i += 1;
    }
  }
  
  public static String capitalizeFirstLetter(String paramString)
  {
    if (isEmpty(paramString)) {}
    char c;
    do
    {
      return paramString;
      c = paramString.charAt(0);
    } while ((!Character.isLetter(c)) || (Character.isUpperCase(c)));
    return paramString.length() + Character.toUpperCase(c) + paramString.substring(1);
  }
  
  public static String commaInt(Object[] paramArrayOfObject)
  {
    return commaInt(paramArrayOfObject, ",");
  }
  
  public static String commaInt(Object[] paramArrayOfObject, String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 0;
    for (;;)
    {
      if (i >= paramArrayOfObject.length) {
        return localStringBuffer.toString();
      }
      localStringBuffer.append(paramArrayOfObject[i]);
      if (i < paramArrayOfObject.length - 1) {
        localStringBuffer.append(paramString);
      }
      i += 1;
    }
  }
  
  public static String friendly_time(String paramString)
  {
    paramString = toDate(paramString);
    if (paramString == null) {
      return "Unknown";
    }
    Calendar localCalendar = Calendar.getInstance();
    if (((SimpleDateFormat)dateFormater2.get()).format(localCalendar.getTime()).equals(((SimpleDateFormat)dateFormater2.get()).format(paramString)))
    {
      i = (int)((localCalendar.getTimeInMillis() - paramString.getTime()) / 3600000L);
      if (i == 0) {
        return Math.max((localCalendar.getTimeInMillis() - paramString.getTime()) / 60000L, 1L) + "分钟前";
      }
      return i + "小时前";
    }
    long l = paramString.getTime() / 86400000L;
    int i = (int)(localCalendar.getTimeInMillis() / 86400000L - l);
    if (i == 0)
    {
      i = (int)((localCalendar.getTimeInMillis() - paramString.getTime()) / 3600000L);
      if (i == 0) {
        return Math.max((localCalendar.getTimeInMillis() - paramString.getTime()) / 60000L, 1L) + "分钟前";
      }
      return i + "小时前";
    }
    if (i == 1) {
      return "昨天";
    }
    if (i == 2) {
      return "前天";
    }
    if ((i > 2) && (i <= 10)) {
      return i + "天前";
    }
    if (i > 10) {
      return ((SimpleDateFormat)dateFormater2.get()).format(paramString);
    }
    return "";
  }
  
  public static String fullWidthToHalfWidth(String paramString)
  {
    if (isEmpty(paramString)) {
      return paramString;
    }
    paramString = paramString.toCharArray();
    int i = 0;
    if (i >= paramString.length) {
      return new String(paramString);
    }
    if (paramString[i] == '　') {
      paramString[i] = 32;
    }
    for (;;)
    {
      i += 1;
      break;
      if ((paramString[i] >= 65281) && (paramString[i] <= 65374)) {
        paramString[i] = ((char)(paramString[i] - 65248));
      } else {
        paramString[i] = paramString[i];
      }
    }
  }
  
  public static String getHrefInnerHtml(String paramString)
  {
    if (isEmpty(paramString)) {
      paramString = "";
    }
    Matcher localMatcher;
    do
    {
      return paramString;
      localMatcher = Pattern.compile(".*<[\\s]*a[\\s]*.*>(.+?)<[\\s]*/a[\\s]*>.*", 2).matcher(paramString);
    } while (!localMatcher.matches());
    return localMatcher.group(1);
  }
  
  public static int getLargestLengthInArray(String[] paramArrayOfString)
  {
    int i = 0;
    int k;
    for (int j = 0;; j = k)
    {
      if (i >= paramArrayOfString.length) {
        return j;
      }
      String str = paramArrayOfString[i];
      k = j;
      if (str.length() > j) {
        k = str.length();
      }
      i += 1;
    }
  }
  
  public static int getLengths(String paramString)
  {
    int j = 0;
    int i = 0;
    if (j >= paramString.length()) {
      return i;
    }
    if (sepMarkNot(paramString.charAt(j)) == 3) {
      i += 2;
    }
    for (;;)
    {
      j += 1;
      break;
      i += 1;
    }
  }
  
  public static long getToday()
  {
    Calendar localCalendar = Calendar.getInstance();
    return Long.parseLong(((SimpleDateFormat)dateFormater2.get()).format(localCalendar.getTime()).replace("-", ""));
  }
  
  public static String halfWidthToFullWidth(String paramString)
  {
    if (isEmpty(paramString)) {
      return paramString;
    }
    paramString = paramString.toCharArray();
    int i = 0;
    if (i >= paramString.length) {
      return new String(paramString);
    }
    if (paramString[i] == ' ') {
      paramString[i] = 12288;
    }
    for (;;)
    {
      i += 1;
      break;
      if ((paramString[i] >= '!') && (paramString[i] <= '~')) {
        paramString[i] = ((char)(paramString[i] + 65248));
      } else {
        paramString[i] = paramString[i];
      }
    }
  }
  
  public static String htmlEscapeCharsToString(String paramString)
  {
    if (isEmpty(paramString)) {
      return paramString;
    }
    return paramString.replaceAll("&lt;", "<").replaceAll("&gt;", ">").replaceAll("&amp;", "&").replaceAll("&quot;", "\"");
  }
  
  public static boolean isBlank(String paramString)
  {
    return (paramString == null) || (paramString.trim().length() == 0);
  }
  
  public static boolean isEmail(String paramString)
  {
    if ((paramString == null) || (paramString.trim().length() == 0)) {
      return false;
    }
    return emailer.matcher(paramString).matches();
  }
  
  public static boolean isEmpty(String paramString)
  {
    boolean bool2 = false;
    boolean bool1;
    if ((paramString == null) || ("".equals(paramString)))
    {
      bool1 = true;
      return bool1;
    }
    int i = 0;
    for (;;)
    {
      if (i >= paramString.length()) {
        return true;
      }
      int j = paramString.charAt(i);
      if ((j != 32) && (j != 9) && (j != 13))
      {
        bool1 = bool2;
        if (j != 10) {
          break;
        }
      }
      i += 1;
    }
  }
  
  public static boolean isNull(String paramString)
  {
    return (paramString == null) || (paramString.length() == 0);
  }
  
  public static boolean isToday(String paramString)
  {
    paramString = toDate(paramString);
    Date localDate = new Date();
    return (paramString != null) && (((SimpleDateFormat)dateFormater2.get()).format(localDate).equals(((SimpleDateFormat)dateFormater2.get()).format(paramString)));
  }
  
  public static boolean isUserName(String paramString)
  {
    if ((paramString == null) || (paramString.trim().length() == 0)) {
      return false;
    }
    return userName.matcher(paramString).matches();
  }
  
  public static String nullStrToEmpty(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    return str;
  }
  
  public static String prettyBytes(long paramLong)
  {
    int i = 0;
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramLong < 1024L) {
      localStringBuilder.append(String.valueOf(paramLong));
    }
    for (;;)
    {
      localStringBuilder.append(' ');
      localStringBuilder.append(new String[] { "B", "KB", "MB", "GB", "TB" }[i]);
      return localStringBuilder.toString();
      if (paramLong < 1048576L)
      {
        localStringBuilder.append(String.format("%.1f", new Object[] { Double.valueOf(paramLong / 1024.0D) }));
        i = 1;
      }
      else if (paramLong < 1073741824L)
      {
        localStringBuilder.append(String.format("%.2f", new Object[] { Double.valueOf(paramLong / 1048576.0D) }));
        i = 2;
      }
      else if (paramLong < 1099511627776L)
      {
        localStringBuilder.append(String.format("%.3f", new Object[] { Double.valueOf(paramLong / 1.073741824E9D) }));
        i = 3;
      }
      else
      {
        localStringBuilder.append(String.format("%.4f", new Object[] { Double.valueOf(paramLong / 1.099511627776E12D) }));
        i = 4;
      }
    }
  }
  
  public static String repeat(String paramString, int paramInt)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 0;
    for (;;)
    {
      if (i >= paramInt) {
        return localStringBuffer.toString();
      }
      localStringBuffer.append(paramString);
      i += 1;
    }
  }
  
  public static String replaceAllByStringBuffer(String paramString1, String paramString2, String paramString3)
  {
    paramString3 = new StringBuffer(paramString3);
    int i = 0;
    int j;
    do
    {
      j = paramString3.indexOf(paramString1, i);
      if (j > -1)
      {
        paramString3.replace(j, paramString1.length() + j, paramString2);
        i = paramString2.length() + j;
      }
    } while (j > -1);
    return paramString3.toString();
  }
  
  public static int sepMarkNot(char paramChar)
  {
    int j = 1;
    int i;
    if ((paramChar > '/') && (paramChar < ':')) {
      i = 0;
    }
    do
    {
      do
      {
        return i;
        if (paramChar <= '@') {
          break;
        }
        i = j;
      } while (paramChar < '[');
      if (paramChar <= '`') {
        break;
      }
      i = j;
    } while (paramChar < 'z');
    if ((paramChar >= '一') && (paramChar <= 40891)) {
      return 3;
    }
    return 2;
  }
  
  public static void setPartTextColor(String paramString, int paramInt1, int paramInt2, TextView paramTextView, int paramInt3)
  {
    if (paramTextView == null) {
      return;
    }
    paramString = new SpannableStringBuilder(paramString);
    paramString.setSpan(new ForegroundColorSpan(paramInt3), paramInt1 - 1, paramInt2, 34);
    paramString.setSpan(new AbsoluteSizeSpan((int)(paramTextView.getTextSize() + 8.0F)), paramInt1 - 1, paramInt2, 33);
    paramTextView.setText(paramString);
  }
  
  public static boolean toBool(String paramString)
  {
    try
    {
      boolean bool = Boolean.parseBoolean(paramString);
      return bool;
    }
    catch (Exception paramString) {}
    return false;
  }
  
  public static String toConvertString(InputStream paramInputStream)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    InputStreamReader localInputStreamReader = new InputStreamReader(paramInputStream);
    BufferedReader localBufferedReader = new BufferedReader(localInputStreamReader);
    for (;;)
    {
      try
      {
        str = localBufferedReader.readLine();
        if (str != null) {}
      }
      catch (IOException localIOException)
      {
        String str;
        localIOException.printStackTrace();
        if (localInputStreamReader != null) {}
        try
        {
          localInputStreamReader.close();
          localInputStreamReader.close();
          if (localBufferedReader != null) {
            localBufferedReader.close();
          }
          if (paramInputStream == null) {
            continue;
          }
          paramInputStream.close();
        }
        catch (IOException paramInputStream) {}
        continue;
      }
      finally
      {
        if (localInputStreamReader == null) {}
      }
      try
      {
        localInputStreamReader.close();
        localInputStreamReader.close();
        if (localBufferedReader != null) {
          localBufferedReader.close();
        }
        if (paramInputStream != null) {
          paramInputStream.close();
        }
      }
      catch (IOException paramInputStream)
      {
        continue;
      }
      return localStringBuffer.toString();
      localStringBuffer.append(str);
      str = localBufferedReader.readLine();
    }
    try
    {
      localInputStreamReader.close();
      localInputStreamReader.close();
      if (localBufferedReader != null) {
        localBufferedReader.close();
      }
      if (paramInputStream != null) {
        paramInputStream.close();
      }
    }
    catch (IOException paramInputStream)
    {
      for (;;) {}
    }
    throw ((Throwable)localObject);
  }
  
  public static Date toDate(String paramString)
  {
    try
    {
      paramString = ((SimpleDateFormat)dateFormater.get()).parse(paramString);
      return paramString;
    }
    catch (ParseException paramString) {}
    return null;
  }
  
  public static Date toDate2(String paramString)
  {
    return new SimpleDateFormat("yyyy-MM-dd").parse(paramString, new ParsePosition(0));
  }
  
  public static String toFormatMoney(double paramDouble)
  {
    return new DecimalFormat("###,###,###").format(paramDouble);
  }
  
  public static int toInt(Object paramObject)
  {
    if (paramObject == null) {
      return 0;
    }
    return toInt(paramObject.toString(), 0);
  }
  
  public static int toInt(String paramString, int paramInt)
  {
    try
    {
      int i = Integer.parseInt(paramString);
      return i;
    }
    catch (Exception paramString) {}
    return paramInt;
  }
  
  public static long toLong(String paramString)
  {
    try
    {
      long l = Long.parseLong(paramString);
      return l;
    }
    catch (Exception paramString) {}
    return 0L;
  }
  
  public static String utf8Encode(String paramString)
  {
    String str = paramString;
    if (!isEmpty(paramString))
    {
      str = paramString;
      if (paramString.getBytes().length == paramString.length()) {}
    }
    try
    {
      str = URLEncoder.encode(paramString, "UTF-8");
      return str;
    }
    catch (UnsupportedEncodingException paramString)
    {
      throw new RuntimeException("UnsupportedEncodingException occurred. ", paramString);
    }
  }
  
  public static String utf8Encode(String paramString1, String paramString2)
  {
    if ((!isEmpty(paramString1)) && (paramString1.getBytes().length != paramString1.length())) {}
    try
    {
      paramString1 = URLEncoder.encode(paramString1, "UTF-8");
      return paramString1;
    }
    catch (UnsupportedEncodingException paramString1) {}
    return paramString1;
    return paramString2;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwl\common\utils\StringUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */