package com.android.dazhihui.ui.delegate.c;

public class d
{
  public static String a;
  public static String b;
  public static int c = -1;
  public static String[][] d;
  public static String e;
  public static String[] f = { "资金帐户", "客户号", "上海A股", "上海B股", "深圳A股", "深圳B股", "A股特别转让", "B股特别转让" };
  public static String[] g = { "0", "1", "3", "5", "2", "4", "9", "10" };
  public static String[] h = { "资金帐户", "客户号" };
  public static String[] i = { "1", "6" };
  public static String[] j = { "客户代码", "资金账户", "深A股东", "深B股东", "沪A股东", "沪B股东" };
  public static String[] k = { "1", "2", "3", "4", "5", "6" };
  
  static
  {
    String[] arrayOfString1 = { "0", "资金帐户" };
    String[] arrayOfString2 = { "10", "B股特别转让" };
    d = new String[][] { arrayOfString1, { "1", "客户号" }, { "3", "上海A股" }, { "5", "上海B股" }, { "2", "深圳A股" }, { "4", "深圳B股" }, { "9", "A股特别转让" }, arrayOfString2 };
  }
  
  public static int a(byte[] paramArrayOfByte)
  {
    return paramArrayOfByte[0] & 0xFF | paramArrayOfByte[1] << 8 & 0xFF00 | paramArrayOfByte[2] << 16 & 0xFF0000 | paramArrayOfByte[3] << 24 & 0xFF000000;
  }
  
  public static String a(String paramString)
  {
    int m = 0;
    while (m < d.length)
    {
      if ((d[m][0].equals(paramString)) || (d[m][1].equals(paramString))) {
        return d[m][1];
      }
      m += 1;
    }
    return "无";
  }
  
  public static byte[] a(int paramInt)
  {
    return new byte[] { (byte)(paramInt & 0xFF), (byte)((0xFF00 & paramInt) >> 8), (byte)((0xFF0000 & paramInt) >> 16), (byte)((0xFF000000 & paramInt) >> 24) };
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */