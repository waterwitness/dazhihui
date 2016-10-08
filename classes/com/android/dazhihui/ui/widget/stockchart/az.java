package com.android.dazhihui.ui.widget.stockchart;

import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.stock.vr;
import java.text.DecimalFormat;

public class az
{
  public static long a(int paramInt)
  {
    int i = paramInt >>> 30 & 0x3;
    if (i == 0) {
      return paramInt;
    }
    return (0x3FFFFFFF & paramInt) << i * 4;
  }
  
  public static vr a(StockVo paramStockVo)
  {
    vr localvr2 = vr.c;
    vr localvr1 = localvr2;
    int i;
    int j;
    if (paramStockVo != null)
    {
      i = paramStockVo.getMarketType();
      j = paramStockVo.getType();
      if (((j != 1) && (j != 16)) || ((i != 0) && (i != 1))) {
        break label49;
      }
      localvr1 = vr.b;
    }
    label49:
    do
    {
      return localvr1;
      if (n.g(j)) {
        return vr.e;
      }
      if ((j == 0) && ((i == 0) || (i == 1) || (i == 4))) {
        return vr.a;
      }
      if ((i == 12) || (i == 11)) {
        return vr.f;
      }
      if (i == 2) {
        return vr.g;
      }
      localvr1 = localvr2;
    } while (i != 15);
    return vr.h;
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
    return b(paramInt1, paramInt2);
  }
  
  public static String a(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 == 0) || (paramInt2 == 0) || (paramInt1 - paramInt2 == 0)) {
      return "-";
    }
    return "" + b(paramInt1 - paramInt2, paramInt3);
  }
  
  public static String a(long paramLong)
  {
    if (paramLong == 0L) {
      return "--";
    }
    return String.valueOf(paramLong);
  }
  
  public static String a(long paramLong1, long paramLong2)
  {
    if ((paramLong1 == 0L) || (paramLong2 == 0L)) {
      return "--";
    }
    return "" + b(b(paramLong1, paramLong2), 2) + "%";
  }
  
  public static int b(int paramInt)
  {
    if (paramInt == 0) {
      return -8616044;
    }
    if (paramInt > 0) {
      return -1099463;
    }
    return -11753174;
  }
  
  public static int b(long paramLong1, long paramLong2)
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
  
  public static String b(int paramInt1, int paramInt2)
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
  
  public static String c(int paramInt)
  {
    if (paramInt == 0) {
      return "--";
    }
    return String.valueOf(paramInt);
  }
  
  public static String c(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 0) || (paramInt2 == 0)) {
      return "--";
    }
    return "" + b(d(paramInt1, paramInt2), 2);
  }
  
  public static int d(int paramInt1, int paramInt2)
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
  
  public static String d(int paramInt)
  {
    try
    {
      Object localObject2 = String.valueOf(paramInt);
      Object localObject1 = localObject2;
      if (((String)localObject2).length() < 4) {
        localObject1 = "0" + (String)localObject2;
      }
      localObject2 = localObject1;
      if (((String)localObject1).length() > 4)
      {
        localObject2 = localObject1;
        if (((String)localObject1).length() < 6) {
          localObject2 = "0" + (String)localObject1;
        }
      }
      localObject1 = ((String)localObject2).substring(0, 2) + ":" + ((String)localObject2).substring(2, 4);
      return (String)localObject1;
    }
    catch (Exception localException) {}
    return "-";
  }
  
  public static int e(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 0) || (paramInt2 == 0)) {
      paramInt1 = 0;
    }
    for (;;)
    {
      return b(paramInt1);
      paramInt1 -= paramInt2;
    }
  }
  
  public static String f(int paramInt1, int paramInt2)
  {
    if ((paramInt2 == 0) || (paramInt1 == 0)) {
      return "--";
    }
    return b(d(paramInt1 + paramInt2, paramInt2), 2) + "%";
  }
  
  public static String g(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 1)
    {
      if (paramInt1 == 0) {
        return "0.0";
      }
      return b(paramInt1, paramInt2);
    }
    if (paramInt2 == 2)
    {
      if (paramInt1 == 0) {
        return "0.00";
      }
      return b(paramInt1, paramInt2);
    }
    if (paramInt1 == 0) {
      return "0.000";
    }
    return b(paramInt1, paramInt2);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */