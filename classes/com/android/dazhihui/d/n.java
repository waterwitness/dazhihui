package com.android.dazhihui.d;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.Base64;
import android.util.Log;
import com.android.dazhihui.a.f;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.a.e;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.model.stock.WarningItem;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public class n
{
  public static int a = -1;
  public static int b = -1;
  public static int c = -1;
  private static SimpleDateFormat d = new SimpleDateFormat("yyyyMMddHHmm");
  
  public static String A(String paramString)
  {
    Calendar localCalendar = Calendar.getInstance();
    Object localObject = null;
    try
    {
      paramString = new SimpleDateFormat("yyyyMMdd").parse(paramString);
      localCalendar.setTime(paramString);
      localCalendar.set(5, localCalendar.get(5) + 1);
      return new SimpleDateFormat("yyyyMMdd").format(localCalendar.getTime());
    }
    catch (ParseException paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
        paramString = (String)localObject;
      }
    }
  }
  
  public static int a(Context paramContext)
  {
    try
    {
      int i = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128).metaData.getInt("channel_id");
      return i;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      paramContext.printStackTrace();
      return 0;
    }
    catch (NullPointerException paramContext)
    {
      for (;;)
      {
        paramContext.printStackTrace();
      }
    }
    catch (NumberFormatException paramContext)
    {
      for (;;)
      {
        paramContext.printStackTrace();
      }
    }
  }
  
  public static String a()
  {
    try
    {
      long l2 = System.currentTimeMillis();
      long l3 = m.a().q();
      long l4 = m.a().r();
      long l1 = l2;
      if (l3 != 0L) {
        l1 = l2 - l4 + l3;
      }
      String str = d.format(new Date(l1 / 300000L * 300000L));
      return str;
    }
    catch (Exception localException) {}
    return "";
  }
  
  public static String a(int paramInt)
  {
    int[] arrayOfInt = new int[5];
    arrayOfInt[0] = (paramInt & 0x3F);
    arrayOfInt[1] = (paramInt >>> 6 & 0x1F);
    arrayOfInt[2] = (paramInt >>> 11 & 0x1F);
    arrayOfInt[3] = (paramInt >>> 16 & 0xF);
    arrayOfInt[4] = (paramInt >>> 20 & 0xFFF);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(b(arrayOfInt[3])).append(b(arrayOfInt[2])).append(" ").append(b(arrayOfInt[1])).append(":").append(b(arrayOfInt[0]));
    return localStringBuffer.toString();
  }
  
  public static String a(long paramLong)
  {
    if (paramLong == 0L) {
      return "--";
    }
    StringBuffer localStringBuffer = new StringBuffer();
    if (paramLong < 0L) {
      localStringBuffer.append("-");
    }
    paramLong = Math.abs(paramLong);
    if (paramLong <= 9999L)
    {
      localStringBuffer.append(String.valueOf(paramLong).trim());
      return localStringBuffer.toString();
    }
    int i;
    if ((paramLong >= 10000L) && (paramLong <= 999999L))
    {
      str = String.valueOf(paramLong + 50L).trim();
      i = str.length();
      localStringBuffer.append(str.substring(0, i - 4)).append(".").append(str.substring(i - 4, i - 2));
      localStringBuffer.append("万");
      return localStringBuffer.toString();
    }
    if ((paramLong >= 1000000L) && (paramLong <= 9999999L))
    {
      str = String.valueOf(paramLong + 500L).trim();
      i = str.length();
      localStringBuffer.append(str.substring(0, i - 4)).append(".").append(str.substring(i - 4, i - 3));
      localStringBuffer.append("万");
      return localStringBuffer.toString();
    }
    if ((paramLong >= 10000000L) && (paramLong <= 99999999L))
    {
      str = String.valueOf(paramLong + 5000L).trim();
      localStringBuffer.append(str.substring(0, str.length() - 4));
      localStringBuffer.append("万");
      return localStringBuffer.toString();
    }
    if ((paramLong >= 100000000L) && (paramLong <= 9999999999L))
    {
      str = String.valueOf(paramLong + 500000L).trim();
      i = str.length();
      localStringBuffer.append(str.substring(0, i - 8)).append(".").append(str.substring(i - 8, i - 6));
      localStringBuffer.append("亿");
      return localStringBuffer.toString();
    }
    if ((paramLong >= 10000000000L) && (paramLong <= 99999999999L))
    {
      str = String.valueOf(paramLong + 5000000L).trim();
      i = str.length();
      localStringBuffer.append(str.substring(0, i - 8)).append(".").append(str.substring(i - 8, i - 7));
      localStringBuffer.append("亿");
      return localStringBuffer.toString();
    }
    String str = String.valueOf(paramLong + 50000000L).trim();
    localStringBuffer.append(str.substring(0, str.length() - 8));
    localStringBuffer.append("亿");
    return localStringBuffer.toString();
  }
  
  /* Error */
  public static String a(Float paramFloat, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 225	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   4: astore_0
    //   5: aload_0
    //   6: ldc -29
    //   8: invokevirtual 231	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   11: astore_3
    //   12: iconst_0
    //   13: istore 4
    //   15: aload_0
    //   16: astore_2
    //   17: iload 4
    //   19: iload_1
    //   20: aload_3
    //   21: iconst_1
    //   22: aaload
    //   23: invokevirtual 185	java/lang/String:length	()I
    //   26: isub
    //   27: if_icmpge +41 -> 68
    //   30: new 233	java/lang/StringBuilder
    //   33: dup
    //   34: invokespecial 234	java/lang/StringBuilder:<init>	()V
    //   37: aload_0
    //   38: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: ldc -17
    //   43: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   49: astore_2
    //   50: iload 4
    //   52: iconst_1
    //   53: iadd
    //   54: istore 4
    //   56: aload_2
    //   57: astore_0
    //   58: goto -43 -> 15
    //   61: astore_2
    //   62: aload_2
    //   63: invokevirtual 241	java/lang/Exception:printStackTrace	()V
    //   66: aload_0
    //   67: astore_2
    //   68: aload_2
    //   69: areturn
    //   70: astore_2
    //   71: goto -9 -> 62
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	paramFloat	Float
    //   0	74	1	paramInt	int
    //   16	41	2	localObject	Object
    //   61	2	2	localException1	Exception
    //   67	2	2	localFloat	Float
    //   70	1	2	localException2	Exception
    //   11	10	3	arrayOfString	String[]
    //   13	42	4	i	int
    // Exception table:
    //   from	to	target	type
    //   5	12	61	java/lang/Exception
    //   17	50	70	java/lang/Exception
  }
  
  public static String a(String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 0;
    while (i < paramString.length())
    {
      char c1 = paramString.charAt(i);
      if (c1 != '\r') {
        localStringBuffer.append(c1);
      }
      i += 1;
    }
    return localStringBuffer.toString();
  }
  
  public static String a(String paramString, int paramInt, boolean paramBoolean)
  {
    if (TextUtils.isEmpty(paramString)) {
      return "";
    }
    String str = paramString.toUpperCase(Locale.getDefault());
    if ((o(paramString) == 11) || (f(paramInt, o(paramString)))) {
      return "http://mnews.gw.com.cn/wap/data/ipad/stock/" + paramString.substring(0, 2) + "/" + paramString.substring(paramString.length() - 2) + "/" + paramString.substring(2, paramString.length()) + "/f10/f10.html";
    }
    if ((paramInt == 7) || (paramInt == 8) || (paramInt == 17))
    {
      if (str.startsWith("FY")) {
        return "http://dwhz.gw.com.cn/wap/data/fy/f10/" + str + "/bzhy_Index.html" + "?keytime=" + a();
      }
      if (str.startsWith("YT")) {
        return "http://dwhz.gw.com.cn/wap/data/yt/f10/" + str + "/bzhy_Index.html" + "?keytime=" + a();
      }
      return "http://mnews.gw.com.cn/wap/html/1/spsc/" + str + "/1.html" + "?keytime=" + a();
    }
    if (paramInt == 0) {
      return "http://mnews.gw.com.cn/wap/news/news/gaoduan/index.html?keytime=" + a();
    }
    if (!paramBoolean) {
      return "http://mnews.gw.com.cn/wap/news/stock/" + paramString.substring(0, 2) + "/" + paramString.substring(2, paramString.length()) + "/trader-index.html" + "?keytime=" + a();
    }
    if (g(paramInt)) {
      return f.O + paramString.substring(paramString.length() - 2) + "/" + paramString.substring(2, paramString.length()) + "/f10/f10.html" + "?keytime=" + a();
    }
    return "http://mnews.gw.com.cn/wap/data/ipad/stock/" + paramString.substring(0, 2) + "/" + paramString.substring(paramString.length() - 2) + "/" + paramString.substring(2, paramString.length()) + "/f10/f10.html" + "?keytime=" + a();
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      String str2 = Integer.toHexString(paramArrayOfByte[i] & 0xFF);
      String str1 = str2;
      if (str2.length() == 1) {
        str1 = "0" + str2;
      }
      localStringBuilder.append(str1);
      i += 1;
    }
    return localStringBuilder.toString().toLowerCase(Locale.getDefault()).trim();
  }
  
  public static String a(String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    Map localMap = e.a().u();
    if (paramArrayOfString != null)
    {
      Log.d("trade", "wta != null :getRandomTradeAddr  wta=" + paramArrayOfString);
      ArrayList localArrayList = new ArrayList();
      int j = g.a().am();
      if (paramArrayOfInt != null)
      {
        if (j != 0)
        {
          i = 0;
          if (i < paramArrayOfString.length)
          {
            String str = paramArrayOfString[i];
            if ((str != null) && (str.length() != 0) && (j == paramArrayOfInt[i]))
            {
              if (localMap.get(str) == null) {
                break label148;
              }
              if (Integer.parseInt((String)localMap.get(str)) < 2) {
                localArrayList.add(str);
              }
            }
            for (;;)
            {
              i += 1;
              break;
              label148:
              localArrayList.add(str);
            }
          }
          if (localArrayList.size() == 0)
          {
            i = 0;
            if (i < paramArrayOfString.length)
            {
              paramArrayOfInt = paramArrayOfString[i];
              if ((paramArrayOfInt != null) && (paramArrayOfInt.length() != 0))
              {
                if (localMap.get(paramArrayOfInt) == null) {
                  break label239;
                }
                if (Integer.parseInt((String)localMap.get(paramArrayOfInt)) < 2) {
                  localArrayList.add(paramArrayOfInt);
                }
              }
              for (;;)
              {
                i += 1;
                break;
                label239:
                localArrayList.add(paramArrayOfInt);
              }
            }
          }
        }
        else
        {
          i = 0;
          if (i < paramArrayOfString.length)
          {
            paramArrayOfInt = paramArrayOfString[i];
            if ((paramArrayOfInt != null) && (paramArrayOfInt.length() != 0))
            {
              if (localMap.get(paramArrayOfInt) == null) {
                break label320;
              }
              if (Integer.parseInt((String)localMap.get(paramArrayOfInt)) < 2) {
                localArrayList.add(paramArrayOfInt);
              }
            }
            for (;;)
            {
              i += 1;
              break;
              label320:
              localArrayList.add(paramArrayOfInt);
            }
          }
        }
      }
      else
      {
        j = paramArrayOfString.length;
        i = 0;
        while (i < j)
        {
          paramArrayOfInt = paramArrayOfString[i];
          if ((paramArrayOfInt != null) && (paramArrayOfInt.length() != 0)) {
            localArrayList.add(paramArrayOfInt);
          }
          i += 1;
        }
      }
      paramArrayOfString = (String[])localArrayList.toArray(new String[0]);
      int i = paramArrayOfString.length;
      if (i == 1) {
        return paramArrayOfString[0];
      }
      if (i > 1) {
        return paramArrayOfString[new Random().nextInt(i)];
      }
    }
    return "";
  }
  
  public static BigDecimal a(String paramString1, String paramString2, int paramInt)
  {
    return new BigDecimal(paramString1).divide(new BigDecimal(paramString2), paramInt, 4);
  }
  
  public static void a(String paramString, int paramInt)
  {
    Object localObject2 = m.a().a(paramString, paramInt);
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = new bi();
    }
    localObject2 = new Date();
    int i = ((Date)localObject2).getHours();
    int j = ((Date)localObject2).getMinutes();
    int k = ((Date)localObject2).getSeconds();
    ((bi)localObject1).c = paramInt;
    ((bi)localObject1).a = b.a(i, j, k);
    ((bi)localObject1).b = paramString;
    ((bi)localObject1).d += 1;
    m.a().a((bi)localObject1);
  }
  
  public static void a(String paramString1, String paramString2)
  {
    if (!TextUtils.isEmpty(paramString2)) {}
    try
    {
      a(paramString1, Integer.parseInt(paramString2));
      return;
    }
    catch (Exception paramString1) {}
  }
  
  public static void a(String paramString1, String paramString2, Context paramContext)
  {
    try
    {
      paramString1 = paramContext.getPackageManager().getPackageInfo(paramString1, 0);
      Object localObject = new Intent("android.intent.action.MAIN", null);
      ((Intent)localObject).addCategory("android.intent.category.LAUNCHER");
      ((Intent)localObject).setPackage(paramString1.packageName);
      localObject = (ResolveInfo)paramContext.getPackageManager().queryIntentActivities((Intent)localObject, 0).iterator().next();
      if (localObject == null) {
        break label145;
      }
      paramString1 = ((ResolveInfo)localObject).activityInfo.packageName;
      localObject = ((ResolveInfo)localObject).activityInfo.name;
      Intent localIntent = new Intent("android.intent.action.MAIN");
      localIntent.addCategory("android.intent.category.LAUNCHER");
      localIntent.setComponent(new ComponentName(paramString1, (String)localObject));
      paramContext.startActivity(localIntent);
      i = 1;
    }
    catch (PackageManager.NameNotFoundException paramString1)
    {
      for (;;)
      {
        paramString1.printStackTrace();
        label145:
        int i = 0;
      }
      paramContext.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString2 + "?keytime=" + System.currentTimeMillis())));
    }
    if ((i != 0) || (TextUtils.isEmpty(paramString2))) {
      return;
    }
  }
  
  public static boolean a(int paramInt1, int paramInt2)
  {
    return paramInt2 == 12;
  }
  
  public static int[][] a(int[][] paramArrayOfInt, int paramInt)
  {
    int i = paramArrayOfInt[0].length;
    int[][] arrayOfInt = (int[][])Array.newInstance(Integer.TYPE, new int[] { paramInt, i });
    System.arraycopy(paramArrayOfInt, 0, arrayOfInt, paramInt - paramArrayOfInt.length, paramArrayOfInt.length);
    return arrayOfInt;
  }
  
  public static String b(int paramInt)
  {
    if (paramInt < 10) {
      return "0" + paramInt;
    }
    return Integer.toString(paramInt);
  }
  
  public static String b(long paramLong)
  {
    if (paramLong == 0L) {
      return "--";
    }
    StringBuffer localStringBuffer = new StringBuffer();
    if (paramLong < 0L) {
      localStringBuffer.append("-");
    }
    paramLong = Math.abs(paramLong);
    if (paramLong <= 9999L)
    {
      localStringBuffer.append(String.valueOf(paramLong).trim());
      return localStringBuffer.toString();
    }
    int i;
    if ((paramLong >= 10000L) && (paramLong <= 999999L))
    {
      str = String.valueOf(paramLong).trim();
      i = str.length();
      localStringBuffer.append(str.substring(0, i - 4)).append(".").append(str.substring(i - 4, i - 2));
      localStringBuffer.append("万");
      return localStringBuffer.toString();
    }
    if ((paramLong >= 1000000L) && (paramLong <= 9999999L))
    {
      str = String.valueOf(paramLong).trim();
      i = str.length();
      localStringBuffer.append(str.substring(0, i - 4)).append(".").append(str.substring(i - 4, i - 3));
      localStringBuffer.append("万");
      return localStringBuffer.toString();
    }
    if ((paramLong >= 10000000L) && (paramLong <= 99999999L))
    {
      str = String.valueOf(paramLong).trim();
      localStringBuffer.append(str.substring(0, str.length() - 4));
      localStringBuffer.append("万");
      return localStringBuffer.toString();
    }
    if ((paramLong >= 100000000L) && (paramLong <= 9999999999L))
    {
      str = String.valueOf(paramLong).trim();
      i = str.length();
      localStringBuffer.append(str.substring(0, i - 8)).append(".").append(str.substring(i - 8, i - 6));
      localStringBuffer.append("亿");
      return localStringBuffer.toString();
    }
    if ((paramLong >= 10000000000L) && (paramLong <= 99999999999L))
    {
      str = String.valueOf(paramLong).trim();
      i = str.length();
      localStringBuffer.append(str.substring(0, i - 8)).append(".").append(str.substring(i - 8, i - 7));
      localStringBuffer.append("亿");
      return localStringBuffer.toString();
    }
    String str = String.valueOf(paramLong).trim();
    localStringBuffer.append(str.substring(0, str.length() - 8));
    localStringBuffer.append("亿");
    return localStringBuffer.toString();
  }
  
  public static String b(String paramString)
  {
    String str2 = new StringBuilder(paramString).reverse().toString();
    String str1 = "";
    int i = 0;
    for (;;)
    {
      paramString = str1;
      if (i < str2.length())
      {
        if (i * 3 + 3 > str2.length()) {
          paramString = str1 + str2.substring(i * 3, str2.length());
        }
      }
      else
      {
        str1 = paramString;
        if (paramString.endsWith(",")) {
          str1 = paramString.substring(0, paramString.length() - 1);
        }
        return new StringBuilder(str1).reverse().toString();
      }
      str1 = str1 + str2.substring(i * 3, i * 3 + 3) + ",";
      i += 1;
    }
  }
  
  public static boolean b(int paramInt1, int paramInt2)
  {
    return (paramInt1 == 7) && (paramInt2 == 10);
  }
  
  public static boolean b(Context paramContext)
  {
    Object localObject = (ActivityManager)paramContext.getSystemService("activity");
    paramContext = paramContext.getPackageName();
    localObject = ((ActivityManager)localObject).getRunningAppProcesses();
    if (localObject == null) {
      return false;
    }
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject).next();
      if ((localRunningAppProcessInfo.processName.equals(paramContext)) && (localRunningAppProcessInfo.importance == 100)) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean b(String paramString1, String paramString2)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    try
    {
      if (!TextUtils.isEmpty(paramString1))
      {
        bool1 = bool2;
        if (!TextUtils.isEmpty(paramString2))
        {
          float f1 = Float.parseFloat(paramString1);
          float f2 = Float.parseFloat(paramString2);
          bool1 = bool2;
          if (f1 < f2) {
            bool1 = true;
          }
        }
      }
      return bool1;
    }
    catch (Exception paramString1) {}
    return false;
  }
  
  public static String c(long paramLong)
  {
    if (paramLong == 0L) {
      return "--";
    }
    StringBuffer localStringBuffer = new StringBuffer();
    if (paramLong < 0L) {
      localStringBuffer.append("-");
    }
    paramLong = Math.abs(paramLong);
    if (paramLong <= 9999L)
    {
      localStringBuffer.append(String.valueOf(paramLong).trim());
      localStringBuffer.append("万");
      return localStringBuffer.toString();
    }
    int i;
    if ((paramLong >= 10000L) && (paramLong <= 999999L))
    {
      str = String.valueOf(paramLong + 50L).trim();
      i = str.length();
      localStringBuffer.append(str.substring(0, i - 4)).append(".").append(str.substring(i - 4, i - 2));
      localStringBuffer.append("亿");
      return localStringBuffer.toString();
    }
    if ((paramLong >= 1000000L) && (paramLong <= 9999999L))
    {
      str = String.valueOf(paramLong + 500L).trim();
      i = str.length();
      localStringBuffer.append(str.substring(0, i - 4)).append(".").append(str.substring(i - 4, i - 3));
      localStringBuffer.append("亿");
      return localStringBuffer.toString();
    }
    String str = String.valueOf(paramLong + 5000L).trim();
    localStringBuffer.append(str.substring(0, str.length() - 4));
    localStringBuffer.append("亿");
    return localStringBuffer.toString();
  }
  
  public static ArrayList<String> c(String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      throw new NullPointerException();
    }
    if ((paramString2 == null) || (paramString2.length() < 1)) {
      throw new IllegalArgumentException();
    }
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    int k = paramString1.length();
    int n = paramString2.length();
    int j;
    do
    {
      int m = paramString1.indexOf(paramString2, i);
      j = m;
      if (m < 0) {
        j = k;
      }
      localArrayList.add(paramString1.substring(i, j).trim());
      if (j == k) {
        return localArrayList;
      }
      j += n;
      i = j;
    } while (j != k);
    localArrayList.add("");
    return localArrayList;
  }
  
  public static void c(String paramString)
  {
    if (g.a().L()) {
      System.out.println(paramString);
    }
  }
  
  public static boolean c(int paramInt)
  {
    return (paramInt == 3) || (paramInt == 12) || (paramInt == 15) || (paramInt == 18);
  }
  
  public static boolean c(int paramInt1, int paramInt2)
  {
    return (paramInt1 == 6) && ((paramInt2 == 5) || (paramInt2 == 10));
  }
  
  public static String d(long paramLong)
  {
    if (paramLong == 0L) {
      return "-";
    }
    return f(String.valueOf(paramLong));
  }
  
  public static void d(String paramString1, String paramString2)
  {
    if (g.a().L()) {
      Log.i(paramString1, paramString2);
    }
  }
  
  public static boolean d(int paramInt)
  {
    return (paramInt == 6) || (paramInt == 3) || (paramInt == 12) || (paramInt == 15) || (paramInt == 18);
  }
  
  public static boolean d(int paramInt1, int paramInt2)
  {
    return (paramInt1 == 0) && (paramInt2 != 1) && (paramInt2 != 0);
  }
  
  public static String[] d(String paramString)
  {
    String[] arrayOfString = new String[2];
    int i = 0;
    if (i < paramString.length()) {
      if (paramString.charAt(i) == ':') {
        i += 1;
      }
    }
    for (;;)
    {
      if (i == 0)
      {
        return arrayOfString;
        i += 1;
        break;
      }
      arrayOfString[0] = paramString.substring(0, i - 1);
      arrayOfString[1] = paramString.substring(i, paramString.length());
      return arrayOfString;
      i = 0;
    }
  }
  
  public static String e(long paramLong)
  {
    if (paramLong == 0L) {
      return "-";
    }
    return g(String.valueOf(paramLong));
  }
  
  public static String e(String paramString)
  {
    String str1 = paramString;
    if (paramString != null)
    {
      str1 = paramString;
      if (paramString.length() > 2)
      {
        String str2 = paramString.substring(0, 2);
        if ((!str2.equals("SZ")) && (!str2.equals("SH")) && (!str2.equals("BI")) && (!str2.equals("SC")) && (!str2.equals("DC")) && (!str2.equals("ZC")) && (!str2.equals("SF")) && (!str2.equals("SG")) && (!str2.equals("FE")) && (!str2.equals("HK")) && (!str2.equals("IX")))
        {
          str1 = paramString;
          if (!str2.equals("OF")) {}
        }
        else
        {
          str1 = paramString.substring(2, paramString.length());
        }
      }
    }
    return str1;
  }
  
  public static void e(String paramString1, String paramString2)
  {
    if (g.a().L()) {
      Log.e(paramString1, paramString2);
    }
  }
  
  public static boolean e(int paramInt)
  {
    return (paramInt == 7) || (paramInt == 8) || (paramInt == 17);
  }
  
  public static boolean e(int paramInt1, int paramInt2)
  {
    return (paramInt1 == 0) && (paramInt2 == 3);
  }
  
  public static String f(long paramLong)
  {
    if (paramLong == 0L) {
      return "0";
    }
    return h(String.valueOf(paramLong));
  }
  
  public static String f(String paramString)
  {
    paramString = paramString.trim();
    int i = paramString.length();
    if (i <= 5) {
      return paramString + "万";
    }
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(paramString.substring(0, i - 4)).append(".").append(paramString.substring(i - 4, i));
    localObject = ((StringBuffer)localObject).toString();
    paramString = new StringBuffer();
    paramString.append(((String)localObject).substring(0, 5));
    localObject = paramString.toString();
    if (((String)localObject).charAt(4) == '.')
    {
      paramString = new StringBuffer();
      paramString.append(((String)localObject).substring(0, 4)).append("亿");
    }
    for (;;)
    {
      return paramString.toString();
      paramString.append("亿");
    }
  }
  
  public static void f(String paramString1, String paramString2)
  {
    if (g.a().L()) {
      Log.v(paramString1, paramString2);
    }
  }
  
  public static boolean f(int paramInt)
  {
    return paramInt == 5;
  }
  
  public static boolean f(int paramInt1, int paramInt2)
  {
    return ((paramInt1 == 1) || (paramInt1 == 16) || (paramInt1 == 0)) && (paramInt2 == 2);
  }
  
  public static String g(String paramString)
  {
    paramString = paramString.trim();
    int i = paramString.length();
    if (i <= 7) {
      return paramString;
    }
    if (i < 10)
    {
      localObject = new StringBuffer();
      ((StringBuffer)localObject).append(paramString.substring(0, i - 4)).append(".").append(paramString.substring(i - 4, i));
      localObject = ((StringBuffer)localObject).toString();
      paramString = new StringBuffer();
      paramString.append(((String)localObject).substring(0, 5));
      localObject = paramString.toString();
      if (((String)localObject).charAt(4) == '.')
      {
        paramString = new StringBuffer();
        paramString.append(((String)localObject).substring(0, 4)).append("万");
      }
      for (;;)
      {
        return paramString.toString();
        paramString.append("万");
      }
    }
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(paramString.substring(0, i - 8)).append(".").append(paramString.substring(i - 8, i));
    localObject = ((StringBuffer)localObject).toString();
    paramString = new StringBuffer();
    paramString.append(((String)localObject).substring(0, 5));
    localObject = paramString.toString();
    if (((String)localObject).charAt(4) == '.')
    {
      paramString = new StringBuffer();
      paramString.append(((String)localObject).substring(0, 4)).append("亿");
    }
    for (;;)
    {
      return paramString.toString();
      paramString.append("亿");
    }
  }
  
  public static String g(String paramString1, String paramString2)
  {
    return URLDecoder.decode(paramString1, paramString2);
  }
  
  public static boolean g(int paramInt)
  {
    return (paramInt == 2) || (paramInt == 10) || (paramInt == 11) || (paramInt == 27) || (paramInt == 28) || (paramInt == 29);
  }
  
  public static boolean g(int paramInt1, int paramInt2)
  {
    return ((paramInt1 == 1) || (paramInt1 == 16) || (paramInt1 == 0)) && (paramInt2 == 15);
  }
  
  public static String h(String paramString)
  {
    paramString.trim();
    int i = paramString.length();
    StringBuffer localStringBuffer = new StringBuffer();
    if (i <= 4) {
      return paramString;
    }
    int k = i / 4;
    int m = i % 4;
    int j = m;
    i = k;
    if (m == 0)
    {
      i = k - 1;
      j = 4;
    }
    localStringBuffer.append(paramString.substring(0, j));
    if (j != 4) {
      localStringBuffer.append(".").append(paramString.substring(j, 4));
    }
    switch (i)
    {
    default: 
      paramString = "";
    }
    for (;;)
    {
      localStringBuffer.append(paramString);
      return localStringBuffer.toString();
      paramString = "万";
      continue;
      paramString = "亿";
    }
  }
  
  public static BigDecimal h(String paramString1, String paramString2)
  {
    return new BigDecimal(paramString1).add(new BigDecimal(paramString2));
  }
  
  public static boolean h(int paramInt)
  {
    return paramInt == 11;
  }
  
  public static boolean h(int paramInt1, int paramInt2)
  {
    return ((paramInt1 == 1) || (paramInt1 == 16) || (paramInt1 == 0)) && ((paramInt2 == 15) || (paramInt2 == 2));
  }
  
  public static String i(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "";
    case 0: 
      return "沪深A股";
    case 1: 
      return "中小板块";
    case 2: 
      return "沪深B股";
    case 3: 
      return "沪深权证";
    case 4: 
      return "上证退市";
    case 5: 
      return "上证风险";
    case 6: 
      return "深证退市";
    case 7: 
      return "深市ST";
    case 8: 
      return "沪深退市整理";
    case 9: 
      return "沪深ST";
    case 10: 
      return "上证小公募";
    case 11: 
      return "上证A股";
    case 12: 
      return "上证B股";
    case 13: 
      return "上证债券";
    case 14: 
      return "上证基金";
    case 15: 
      return "ETF基金";
    case 16: 
      return "LOF基金";
    case 17: 
      return "重点指数";
    case 21: 
      return "深证A股";
    case 22: 
      return "深证B股";
    case 23: 
      return "深证债券";
    case 24: 
      return "深证基金";
    case 25: 
      return "创业板";
    case 26: 
      return "沪深300";
    case 27: 
      return "特定指数";
    case 28: 
      return "两网及退市";
    case 29: 
      return "新三板";
    case 30: 
      return "香港指数";
    case 31: 
      return "国企股";
    case 32: 
      return "红筹股";
    case 33: 
      return "蓝筹股";
    case 34: 
      return "AH股";
    case 35: 
      return "香港主板";
    case 36: 
      return "香港权证";
    case 37: 
      return "香港债券";
    case 38: 
      return "香港信托";
    case 39: 
      return "港股通";
    case 50: 
      return "上证出入库";
    case 51: 
      return "上证转债";
    case 52: 
      return "上证回购";
    case 53: 
      return "深证转债";
    case 54: 
      return "深证回购";
    case 101: 
      return "沪深指数";
    case 102: 
      return "全球指数";
    case 103: 
      return "期货市场";
    case 104: 
      return "全球外汇";
    case 105: 
      return "板块综合";
    case 108: 
      return "中证指数";
    case 109: 
      return "人民币中间价";
    case 110: 
      return "国际贵金属";
    case 111: 
      return "深证H股";
    case 112: 
      return "重要股票";
    case 124: 
      return "基础层";
    case 125: 
      return "创新层";
    case 208: 
      return "标普500";
    case 209: 
      return "Nasdaq中国";
    case 210: 
      return "Nasdaq100";
    case 211: 
      return "NYSE中国";
    case 20296: 
      return "上证期权";
    }
    return "股指期权";
  }
  
  public static String i(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("invalid channel id");
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    int j = paramString.length();
    paramString = new Random();
    int i = 0;
    while (i < 19 - j)
    {
      localStringBuilder.append(paramString.nextInt(10));
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  public static BigDecimal i(String paramString1, String paramString2)
  {
    return new BigDecimal(paramString1).subtract(new BigDecimal(paramString2));
  }
  
  public static boolean i(int paramInt1, int paramInt2)
  {
    return ((paramInt1 == 1) || (paramInt1 == 16)) && ((paramInt2 == 0) || (paramInt2 == 1));
  }
  
  public static String j(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "";
    case 1: 
      return "股票基金";
    case 2: 
      return "债券基金";
    case 3: 
      return "混合基金";
    case 4: 
      return "保本基金";
    }
    return "货币基金";
  }
  
  public static BigDecimal j(String paramString1, String paramString2)
  {
    return new BigDecimal(paramString1).multiply(new BigDecimal(paramString2));
  }
  
  public static boolean j(int paramInt1, int paramInt2)
  {
    return (paramInt1 == 16) && ((paramInt2 == 0) || (paramInt2 == 1));
  }
  
  public static boolean j(String paramString)
  {
    return o(paramString) == 4;
  }
  
  public static boolean k(int paramInt1, int paramInt2)
  {
    return ((paramInt1 == 0) || (paramInt2 == 4)) && (paramInt2 != 3) && (paramInt2 != 2);
  }
  
  public static boolean k(String paramString)
  {
    return (paramString.equals("SH000001")) || (paramString.equals("SZ399001")) || (paramString.equals("399001"));
  }
  
  public static boolean l(int paramInt1, int paramInt2)
  {
    return (paramInt1 != 0) && ((paramInt1 != 1) || (paramInt2 != 11)) && (!g(paramInt1));
  }
  
  public static boolean l(String paramString)
  {
    return (paramString.equals("SH000001")) || (paramString.equals("SZ399001")) || (paramString.equals("399001")) || (paramString.equals("SZ399005")) || (paramString.equals("SZ399006")) || (paramString.equals("SZ399300")) || (paramString.equals("SH000003")) || (paramString.equals("SZ399003")) || (paramString.equals("SH000016")) || (paramString.equals("SH000009")) || (paramString.equals("SH000010")) || (paramString.equals("SZ399004")) || (paramString.equals("SZ399106")) || (paramString.equals("SH000905")) || (paramString.equals("SH000011")) || (paramString.equals("SZ399305"));
  }
  
  public static boolean m(String paramString)
  {
    return (paramString.equals("SZ399006")) || (paramString.equals("SH000001")) || (paramString.equals("SZ399001")) || (paramString.equals("399001"));
  }
  
  public static boolean n(String paramString)
  {
    return (o(paramString) == 0) || (o(paramString) == 1);
  }
  
  public static int o(String paramString)
  {
    try
    {
      paramString = paramString.substring(0, 2);
      if (paramString.equals("SH")) {
        return 0;
      }
      if (paramString.equals("SZ")) {
        return 1;
      }
      if (paramString.equals("FE")) {
        return 5;
      }
      if ((!paramString.equals("SC")) && (!paramString.equals("DC")) && (!paramString.equals("ZC")))
      {
        if (paramString.equals("SF")) {
          return 8;
        }
        if (paramString.equals("SG")) {
          return 9;
        }
        if (paramString.equals("IX")) {
          return 3;
        }
        if (paramString.equals("HK")) {
          return 2;
        }
        if (paramString.equals("BI")) {
          return 4;
        }
        if (paramString.equals("SO")) {
          return 11;
        }
        if (paramString.equals("ZH")) {
          return 12;
        }
        if (!paramString.equals("NY"))
        {
          boolean bool = paramString.equals("NS");
          if (!bool) {}
        }
        else
        {
          return 15;
        }
        return 10;
      }
    }
    catch (Exception paramString)
    {
      return 10;
    }
    return 7;
  }
  
  public static String p(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    for (;;)
    {
      try
      {
        Date localDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(paramString);
        Object localObject = new SimpleDateFormat("MM-dd HH:mm");
        if (DateUtils.isToday(localDate.getTime())) {
          localObject = new SimpleDateFormat("HH:mm");
        }
        localObject = ((DateFormat)localObject).format(localDate);
        return (String)localObject;
      }
      catch (ParseException localParseException)
      {
        return paramString;
      }
    }
  }
  
  public static String q(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    for (;;)
    {
      try
      {
        Date localDate = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(paramString);
        Object localObject = new SimpleDateFormat("MM-dd HH:mm");
        if (DateUtils.isToday(localDate.getTime())) {
          localObject = new SimpleDateFormat("HH:mm");
        }
        localObject = ((DateFormat)localObject).format(localDate);
        return (String)localObject;
      }
      catch (ParseException localParseException)
      {
        return paramString;
      }
    }
  }
  
  public static int r(String paramString)
  {
    List localList = m.a().e();
    int j;
    if ((localList == null) || (localList.size() == 0))
    {
      j = -1;
      return j;
    }
    int i = 0;
    for (;;)
    {
      if (i >= localList.size()) {
        break label65;
      }
      j = i;
      if (((WarningItem)localList.get(i)).getmWarningCode().equals(paramString)) {
        break;
      }
      i += 1;
    }
    label65:
    return -1;
  }
  
  public static boolean s(String paramString)
  {
    boolean bool2 = false;
    int j = paramString.length();
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i < j)
      {
        if (paramString.substring(i, i + 1).matches("[一-龥]+")) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i += 1;
    }
  }
  
  public static String t(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    return str;
  }
  
  public static String u(String paramString)
  {
    int i = paramString.length();
    StringBuffer localStringBuffer = new StringBuffer(paramString);
    if (i > 4)
    {
      localStringBuffer.delete(i - 4, i);
      i = localStringBuffer.length();
      localStringBuffer.append(".");
      localStringBuffer.append(paramString.substring(i, i + 2));
    }
    return localStringBuffer.toString();
  }
  
  public static String v(String paramString)
  {
    int i = paramString.length();
    StringBuffer localStringBuffer = new StringBuffer(paramString);
    String str;
    if ((i >= 5) && (i < 7))
    {
      localStringBuffer.delete(i - 4, i);
      i = localStringBuffer.length();
      localStringBuffer.append(".");
      localStringBuffer.append(paramString.substring(i, i + 2));
      str = localStringBuffer.toString() + "万";
    }
    do
    {
      do
      {
        return str;
        if ((i >= 7) && (i < 8))
        {
          localStringBuffer.delete(i - 4, i);
          i = localStringBuffer.length();
          localStringBuffer.append(".");
          localStringBuffer.append(paramString.substring(i, i + 1));
          return localStringBuffer.toString() + "万";
        }
        if ((i >= 8) && (i < 9))
        {
          localStringBuffer.delete(i - 4, i);
          localStringBuffer.length();
          return localStringBuffer.toString() + "万";
        }
        if ((i >= 9) && (i < 11))
        {
          localStringBuffer.delete(i - 8, i);
          i = localStringBuffer.length();
          localStringBuffer.append(".");
          localStringBuffer.append(paramString.substring(i, i + 2));
          return localStringBuffer.toString() + "亿";
        }
        if ((i >= 11) && (i < 12))
        {
          localStringBuffer.delete(i - 8, i);
          i = localStringBuffer.length();
          localStringBuffer.append(".");
          localStringBuffer.append(paramString.substring(i, i + 1));
          return localStringBuffer.toString() + "亿";
        }
        if ((i >= 12) && (i < 13))
        {
          localStringBuffer.delete(i - 8, i);
          return localStringBuffer.toString() + "亿";
        }
        if ((i >= 13) && (i < 15))
        {
          localStringBuffer.delete(i - 12, i);
          i = localStringBuffer.length();
          localStringBuffer.append(".");
          localStringBuffer.append(paramString.substring(i, i + 2));
          return localStringBuffer.toString() + "万亿";
        }
        str = paramString;
      } while (i >= 5);
      str = paramString;
    } while (i <= 0);
    return localStringBuffer.toString() + "万";
  }
  
  public static float w(String paramString)
  {
    try
    {
      float f = Float.parseFloat(paramString);
      return f;
    }
    catch (Exception paramString) {}
    return 0.0F;
  }
  
  public static int x(String paramString)
  {
    try
    {
      int i = Integer.parseInt(paramString);
      return i;
    }
    catch (Exception paramString) {}
    return 0;
  }
  
  public static double y(String paramString)
  {
    try
    {
      double d1 = Double.parseDouble(paramString);
      return d1;
    }
    catch (Exception paramString) {}
    return 0.0D;
  }
  
  public static String z(String paramString)
  {
    Object localObject = Base64.encodeToString(paramString.toLowerCase(Locale.getDefault()).getBytes(), 0).trim() + "UserCenter";
    paramString = "".getBytes();
    try
    {
      localObject = MessageDigest.getInstance("SHA-1").digest(((String)localObject).getBytes());
      paramString = (String)localObject;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      for (;;)
      {
        localNoSuchAlgorithmException.printStackTrace();
      }
    }
    return a(paramString).toLowerCase(Locale.getDefault());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */