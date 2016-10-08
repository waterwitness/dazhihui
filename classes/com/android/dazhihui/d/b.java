package com.android.dazhihui.d;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import com.android.dazhihui.g;
import java.text.DecimalFormat;

public class b
{
  public static int a = g.a().n() * 14 / 480;
  public static int b = g.a().n() * 14 / 480;
  
  public static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      StringBuffer localStringBuffer = new StringBuffer();
      if (paramInt1 < 10)
      {
        localObject = "0" + paramInt1;
        localStringBuffer.append(localObject);
        if (paramInt2 >= 10) {
          break label125;
        }
        localObject = "0" + paramInt2;
        label68:
        localStringBuffer.append(localObject);
        if (paramInt3 >= 10) {
          break label133;
        }
      }
      label125:
      label133:
      for (Object localObject = "0" + paramInt3;; localObject = Integer.valueOf(paramInt3))
      {
        localStringBuffer.append(localObject);
        return Integer.parseInt(localStringBuffer.toString());
        localObject = Integer.valueOf(paramInt1);
        break;
        localObject = Integer.valueOf(paramInt2);
        break label68;
      }
      return 0;
    }
    catch (Exception localException) {}
  }
  
  public static int a(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString2 == null)) {
      return g(0);
    }
    int i = paramString1.indexOf(".");
    int k = paramString2.indexOf(".");
    int j = i;
    if (i == -1) {
      j = paramString1.length();
    }
    i = k;
    if (k == -1) {
      i = paramString2.length();
    }
    int m = Math.max(j, i);
    String str;
    for (;;)
    {
      k = i;
      str = paramString2;
      if (j >= m) {
        break;
      }
      paramString1 = "0" + paramString1;
      j += 1;
    }
    while (k < m)
    {
      str = "0" + str;
      k += 1;
    }
    return g(paramString1.compareTo(str));
  }
  
  public static long a(int paramInt)
  {
    int i = paramInt >>> 30 & 0x3;
    if (i == 0)
    {
      if ((paramInt >>> 29 & 0x1) == 0) {
        return paramInt;
      }
      return ((((paramInt >>> 30 | 0xC) << 28 | paramInt) ^ 0xFFFFFFFF) + 1 & 0xFFFFFFFF) * -1;
    }
    long l = 0x3FFFFFFF & paramInt;
    if ((paramInt >>> 29 & 0x1) == 0) {}
    for (;;)
    {
      return l << i * 4;
      l = (((l | (paramInt >>> 30 | 0xC) << 28) ^ 0xFFFFFFFFFFFFFFFF) + 1L & 0xFFFFFFFFFFFFFFFF) * -1L;
    }
  }
  
  public static long a(long paramLong)
  {
    long l2 = paramLong / 10L;
    long l1 = l2;
    if (paramLong % 10L > 5L) {
      l1 = l2 + 1L;
    }
    return l1;
  }
  
  public static String a(double paramDouble, int paramInt)
  {
    DecimalFormat localDecimalFormat = new DecimalFormat();
    if (paramInt == 1) {
      localDecimalFormat.applyPattern("0.0");
    }
    for (;;)
    {
      return localDecimalFormat.format(paramDouble);
      if (paramInt == 2) {
        localDecimalFormat.applyPattern("0.00");
      } else {
        localDecimalFormat.applyPattern("0");
      }
    }
  }
  
  public static String a(float paramFloat)
  {
    String str = String.valueOf(paramFloat);
    if (paramFloat < 10000.0F) {
      return a(paramFloat, 0);
    }
    if ((paramFloat >= 10000.0F) && (paramFloat < 1000000.0F))
    {
      d = paramFloat / 10000.0D;
      return a(d, 2) + "万";
    }
    if ((paramFloat >= 1000000.0F) && (paramFloat < 1.0E7F))
    {
      d = paramFloat / 10000.0D;
      return a(d, 1) + "万";
    }
    if ((paramFloat >= 1.0E7F) && (paramFloat < 1.0E8F))
    {
      d = paramFloat / 10000.0D;
      return a(d, 0) + "万";
    }
    if ((paramFloat >= 1.0E8F) && (str.length() < 11))
    {
      d = paramFloat / 1.0E8D;
      return a(d, 2) + "亿";
    }
    if ((str.length() >= 11) && (str.length() < 12))
    {
      d = paramFloat / 1.0E8D;
      return a(d, 1) + "亿";
    }
    double d = paramFloat / 1.0E8D;
    return a(d, 0) + "亿";
  }
  
  public static String a(float paramFloat, int paramInt)
  {
    String str = "###0.00";
    if (paramInt == 3) {
      str = "###0.000";
    }
    for (;;)
    {
      return String.valueOf(new DecimalFormat(str).format(paramFloat));
      if (paramInt == 1) {
        str = "###0.0";
      }
    }
  }
  
  public static String a(int paramInt1, int paramInt2)
  {
    if (paramInt1 == 0) {
      return "--";
    }
    return d(paramInt1, paramInt2);
  }
  
  public static String a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    try
    {
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append(paramInt1);
      localStringBuffer.append("-");
      if (paramInt2 < 10)
      {
        localObject = "0" + paramInt2;
        localStringBuffer.append(localObject);
        localStringBuffer.append("-");
        if (paramInt3 >= 10) {
          break label242;
        }
        localObject = "0" + paramInt3;
        label94:
        localStringBuffer.append(localObject);
        if (paramInt4 >= 10) {
          break label251;
        }
        localObject = " 0" + paramInt4;
        label129:
        localStringBuffer.append((String)localObject);
        localStringBuffer.append(":");
        if (paramInt5 >= 10) {
          break label275;
        }
        localObject = "0" + paramInt5;
        label174:
        localStringBuffer.append(localObject);
        localStringBuffer.append(":");
        if (paramInt6 >= 10) {
          break label285;
        }
      }
      label242:
      label251:
      label275:
      label285:
      for (Object localObject = "0" + paramInt6;; localObject = Integer.valueOf(paramInt6))
      {
        localStringBuffer.append(localObject);
        return localStringBuffer.toString();
        localObject = Integer.valueOf(paramInt2);
        break;
        localObject = Integer.valueOf(paramInt3);
        break label94;
        localObject = " " + paramInt4;
        break label129;
        localObject = Integer.valueOf(paramInt5);
        break label174;
      }
      return "";
    }
    catch (Exception localException) {}
  }
  
  public static String a(int paramInt, String paramString)
  {
    if (paramString.equals("--")) {
      return "--";
    }
    if (paramInt == 0) {
      return "0.00";
    }
    return "" + d(e(paramInt + 10000, 10000), 2);
  }
  
  public static String a(long paramLong, int paramInt)
  {
    if (paramLong == 0L) {
      return "--";
    }
    return b(paramLong, paramInt);
  }
  
  public static String a(long paramLong1, long paramLong2)
  {
    if ((paramLong1 == 0L) || (paramLong2 == 0L)) {
      return "--";
    }
    return "" + d(c(paramLong1, paramLong2), 2) + "%";
  }
  
  public static void a(Canvas paramCanvas, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int j = paramString.length() * paramInt3 / 2;
    int i;
    if ((paramInt4 & 0x8) != 0)
    {
      i = paramInt1 - j;
      if ((paramInt4 & 0x20) == 0) {
        break label92;
      }
      paramInt1 = paramInt2 - paramInt3;
    }
    for (;;)
    {
      String str = paramString;
      if (paramString == null) {
        str = "--";
      }
      a.b.setTextSize(paramInt3);
      a.b(str, i, paramInt1, Paint.Align.LEFT, paramCanvas);
      return;
      i = paramInt1;
      if ((paramInt4 & 0x1) == 0) {
        break;
      }
      i = paramInt1 - j / 2;
      break;
      label92:
      paramInt1 = paramInt2;
      if ((paramInt4 & 0x2) != 0) {
        paramInt1 = paramInt2 - paramInt3 / 2;
      }
    }
  }
  
  public static void a(Canvas paramCanvas, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    a.b.setColor(paramInt3);
    int i = a.b(paramString);
    if ((paramInt5 & 0x8) != 0)
    {
      paramInt3 = paramInt1 - i;
      if ((paramInt5 & 0x20) == 0) {
        break label95;
      }
      paramInt1 = paramInt2 - paramInt4;
    }
    for (;;)
    {
      String str = paramString;
      if (paramString == null) {
        str = "--";
      }
      a.b.setTextSize(paramInt4);
      a.b(str, paramInt3, paramInt1, Paint.Align.LEFT, paramCanvas);
      return;
      paramInt3 = paramInt1;
      if ((paramInt5 & 0x1) == 0) {
        break;
      }
      paramInt3 = paramInt1 - i / 2;
      break;
      label95:
      paramInt1 = paramInt2;
      if ((paramInt5 & 0x2) != 0) {
        paramInt1 = paramInt2 - paramInt4 / 2;
      }
    }
  }
  
  public static long b(int paramInt)
  {
    int i = paramInt >>> 30 & 0x3;
    if (i == 0) {
      return paramInt;
    }
    return (0x3FFFFFFF & paramInt) << i * 4;
  }
  
  public static long b(long paramLong1, long paramLong2)
  {
    if ((paramLong1 == 0L) || (paramLong2 == 0L)) {
      return 0L;
    }
    paramLong1 = (paramLong1 - paramLong2) * 1000000L / paramLong2;
    if (paramLong1 >= 0L) {}
    for (int i = 50;; i = -50) {
      return (i + paramLong1) / 100L;
    }
  }
  
  public static String b(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 0) || (paramInt2 == 0)) {
      return "--";
    }
    return "" + d(e(paramInt1, paramInt2), 2) + "%";
  }
  
  public static String b(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 == 0) || (paramInt2 == 0)) {
      return "--";
    }
    return "" + d(paramInt1 - paramInt2, paramInt3);
  }
  
  public static String b(long paramLong)
  {
    if (paramLong > 0L) {
      return "资金净流入" + n.d(paramLong);
    }
    if (paramLong < 0L) {
      return "资金净流出" + n.d(-1L * paramLong);
    }
    return "资金净流入0万";
  }
  
  public static String b(long paramLong, int paramInt)
  {
    for (String str1 = String.valueOf(Math.abs(paramLong)); str1.length() <= paramInt; str1 = "0" + str1) {}
    String str2 = str1;
    if (paramLong < 0L) {
      str2 = "-" + str1;
    }
    if (paramInt <= 0) {
      return str2;
    }
    return str2.substring(0, str2.length() - paramInt) + "." + str2.substring(str2.length() - paramInt);
  }
  
  public static void b(Canvas paramCanvas, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Paint.Align localAlign = Paint.Align.LEFT;
    int i;
    if ((paramInt3 & 0x8) != 0)
    {
      localAlign = Paint.Align.RIGHT;
      if ((paramInt3 & 0x20) == 0) {
        break label94;
      }
      i = paramInt2 - paramInt4;
    }
    for (;;)
    {
      a.b.setTextSize(paramInt4);
      String str = paramString;
      if (paramString == null) {
        str = "--";
      }
      paramString = str;
      if (str.equals("null")) {
        paramString = "";
      }
      a.b(paramString, paramInt1, i, localAlign, paramCanvas);
      return;
      if ((paramInt3 & 0x1) == 0) {
        break;
      }
      localAlign = Paint.Align.CENTER;
      break;
      label94:
      i = paramInt2;
      if ((paramInt3 & 0x2) != 0) {
        i = paramInt2 - paramInt4 / 2;
      }
    }
  }
  
  public static int c(long paramLong1, long paramLong2)
  {
    if ((paramLong1 == 0L) || (paramLong2 == 0L)) {
      return 0;
    }
    paramLong1 = (paramLong1 - paramLong2) * 1000000L / paramLong2;
    if (paramLong1 >= 0L) {}
    for (int i = 50;; i = -50) {
      return (int)((i + paramLong1) / 100L);
    }
  }
  
  public static String c(int paramInt)
  {
    if (paramInt == 0) {
      return "-";
    }
    if (paramInt == Integer.MIN_VALUE) {
      return "";
    }
    return "" + d(paramInt, 2) + "%";
  }
  
  public static String c(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 0) || (paramInt2 == 0)) {
      return "--";
    }
    return "" + d(e(paramInt1, paramInt2), 2);
  }
  
  public static String c(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 - paramInt2 == 0) {
      return "--";
    }
    return "" + d(paramInt1 - paramInt2, paramInt3);
  }
  
  public static String c(long paramLong)
  {
    if (paramLong > 0L) {
      return "资金净流入金额" + n.d(paramLong);
    }
    if (paramLong < 0L) {
      return "资金净流出金额" + n.d(-1L * paramLong);
    }
    return "资金净流入金额0万";
  }
  
  public static int d(long paramLong)
  {
    if (paramLong == 0L) {
      return -8616044;
    }
    if (paramLong > 0L) {
      return -1099463;
    }
    return -11753174;
  }
  
  public static String d(int paramInt)
  {
    if (paramInt == 0) {
      return "--";
    }
    return "" + d(e(paramInt + 10000, 10000), 2);
  }
  
  public static String d(int paramInt1, int paramInt2)
  {
    for (String str1 = String.valueOf(Math.abs(paramInt1)); str1.length() <= paramInt2; str1 = "0" + str1) {}
    String str2 = str1;
    if (paramInt1 < 0) {
      str2 = "-" + str1;
    }
    if (paramInt2 <= 0) {
      return str2;
    }
    return str2.substring(0, str2.length() - paramInt2) + "." + str2.substring(str2.length() - paramInt2);
  }
  
  public static String d(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 == 0) || (paramInt2 == 0) || (paramInt1 - paramInt2 == 0)) {
      return "-";
    }
    return "" + d(paramInt1 - paramInt2, paramInt3);
  }
  
  public static String d(long paramLong1, long paramLong2)
  {
    if (paramLong2 == 0L) {
      return "--";
    }
    return d(c(paramLong1 + paramLong2, paramLong2), 2) + "%";
  }
  
  public static float e(int paramInt)
  {
    if (paramInt == 0) {
      return 0.0F;
    }
    return Float.valueOf(d(e(paramInt + 10000, 10000), 2)).floatValue();
  }
  
  public static int e(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 0) || (paramInt2 == 0)) {
      return 0;
    }
    long l = (paramInt1 - paramInt2) * 1000000L / paramInt2;
    if (l >= 0L) {}
    for (paramInt1 = 50;; paramInt1 = -50) {
      return (int)((paramInt1 + l) / 100L);
    }
  }
  
  public static String e(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 == 0) || (paramInt2 == 0)) {
      return "--";
    }
    return "" + l(paramInt1 - paramInt2, paramInt3);
  }
  
  public static String e(long paramLong)
  {
    if (paramLong == 0L) {
      return "--";
    }
    return String.valueOf(paramLong);
  }
  
  public static int f(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 0) || (paramInt2 == 0)) {
      paramInt1 = 0;
    }
    for (;;)
    {
      return h(paramInt1);
      paramInt1 -= paramInt2;
    }
  }
  
  public static String f(int paramInt)
  {
    try
    {
      String str2 = String.valueOf(paramInt);
      String str1 = str2;
      if (str2.length() < 4) {
        str1 = "0" + str2;
      }
      str1 = str1.substring(0, 2) + ":" + str1.substring(2, 4);
      return str1;
    }
    catch (Exception localException) {}
    return "-";
  }
  
  public static String f(long paramLong)
  {
    String str = String.valueOf(paramLong);
    if (paramLong < 1L) {
      return a(paramLong * 10000.0D, 0);
    }
    if ((paramLong >= 1L) && (paramLong < 100L))
    {
      d = paramLong;
      return a(d, 2) + "万";
    }
    if ((paramLong >= 100L) && (paramLong < 1000L))
    {
      d = paramLong;
      return a(d, 1) + "万";
    }
    if ((paramLong >= 1000L) && (paramLong < 10000L))
    {
      d = paramLong;
      return a(d, 0) + "万";
    }
    if ((paramLong >= 10000L) && (str.length() < 7))
    {
      d = paramLong / 10000.0D;
      return a(d, 2) + "亿";
    }
    if ((str.length() >= 7) && (str.length() < 8))
    {
      d = paramLong / 10000.0D;
      return a(d, 1) + "亿";
    }
    double d = paramLong / 10000.0D;
    return a(d, 0) + "亿";
  }
  
  public static int g(int paramInt)
  {
    if (paramInt == 0) {
      return -8616044;
    }
    if (paramInt > 0) {
      return -1099463;
    }
    return -11753174;
  }
  
  public static String g(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 1)
    {
      if (paramInt1 == 0) {
        return "0.0";
      }
      return d(paramInt1, paramInt2);
    }
    if (paramInt2 == 2)
    {
      if (paramInt1 == 0) {
        return "0.00";
      }
      return d(paramInt1, paramInt2);
    }
    if (paramInt1 == 0) {
      return "0.000";
    }
    return d(paramInt1, paramInt2);
  }
  
  public static String g(long paramLong)
  {
    String str = String.valueOf(paramLong);
    if (paramLong < 10000L) {
      return a(paramLong, 0);
    }
    if ((paramLong >= 10000L) && (paramLong < 1000000L))
    {
      d = paramLong / 10000.0D;
      return a(d, 2) + "万";
    }
    if ((paramLong >= 1000000L) && (paramLong < 10000000L))
    {
      d = paramLong / 10000.0D;
      return a(d, 1) + "万";
    }
    if ((paramLong >= 10000000L) && (paramLong < 100000000L))
    {
      d = paramLong / 10000.0D;
      return a(d, 0) + "万";
    }
    if ((paramLong >= 100000000L) && (str.length() < 11))
    {
      d = paramLong / 1.0E8D;
      return a(d, 2) + "亿";
    }
    if ((str.length() >= 11) && (str.length() < 12))
    {
      d = paramLong / 1.0E8D;
      return a(d, 1) + "亿";
    }
    double d = paramLong / 1.0E8D;
    return a(d, 0) + "亿";
  }
  
  public static int h(int paramInt)
  {
    if (paramInt == 0) {
      return -8616044;
    }
    if (paramInt > 0) {
      return -1099463;
    }
    return -11753174;
  }
  
  public static int h(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 0) || (paramInt2 == 0)) {
      paramInt1 = 0;
    }
    for (;;)
    {
      return g(paramInt1);
      paramInt1 -= paramInt2;
    }
  }
  
  public static int i(int paramInt)
  {
    if (paramInt == 0) {
      return -6776680;
    }
    if (paramInt > 0) {
      return -2293760;
    }
    return -15878144;
  }
  
  public static int i(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 0) || (paramInt2 == 0)) {
      paramInt1 = 0;
    }
    for (;;)
    {
      return i(paramInt1);
      paramInt1 -= paramInt2;
    }
  }
  
  public static String j(int paramInt)
  {
    if (paramInt == 0) {
      return "--";
    }
    return String.valueOf(paramInt);
  }
  
  public static String j(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return "--";
    }
    return d(e(paramInt1 + paramInt2, paramInt2), 2) + "%";
  }
  
  public static String k(int paramInt)
  {
    if (paramInt > 0)
    {
      if (paramInt < 10000) {
        return String.valueOf(paramInt) + "亿";
      }
      double d = paramInt / 10000.0D;
      DecimalFormat localDecimalFormat = new DecimalFormat();
      localDecimalFormat.applyPattern("0.00");
      return localDecimalFormat.format(d) + "万亿";
    }
    return "--";
  }
  
  public static String k(int paramInt1, int paramInt2)
  {
    if ((paramInt2 == 0) || (paramInt1 == 0)) {
      return "--";
    }
    return d(e(paramInt1 + paramInt2, paramInt2), 2) + "%";
  }
  
  public static String l(int paramInt1, int paramInt2)
  {
    for (String str1 = String.valueOf(Math.abs(paramInt1)); str1.length() <= paramInt2; str1 = "0" + str1) {}
    String str2;
    if (paramInt1 < 0) {
      str2 = "-" + str1;
    }
    while (paramInt2 <= 0)
    {
      return str2;
      str2 = str1;
      if (paramInt1 > 0) {
        str2 = "+" + str1;
      }
    }
    return str2.substring(0, str2.length() - paramInt2) + "." + str2.substring(str2.length() - paramInt2);
  }
  
  public static String m(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 0) || (paramInt2 == 0)) {
      return "--";
    }
    return "" + l(e(paramInt1, paramInt2), 2) + "%";
  }
  
  public static String n(int paramInt1, int paramInt2)
  {
    int i = paramInt2;
    if (paramInt2 == 0) {
      i = 100;
    }
    if (paramInt1 == 0) {
      return "-";
    }
    if (paramInt1 < i) {
      return "0." + paramInt1;
    }
    return "" + paramInt1 / i;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */