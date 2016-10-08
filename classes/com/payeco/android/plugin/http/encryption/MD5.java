package com.payeco.android.plugin.http.encryption;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5
{
  static final byte[] bR;
  private long[] bS = new long[4];
  private long[] bT = new long[2];
  private byte[] bU = new byte[16];
  private byte[] buffer = new byte[64];
  public String digestHexStr;
  
  static
  {
    byte[] arrayOfByte = new byte[64];
    arrayOfByte[0] = Byte.MIN_VALUE;
    bR = arrayOfByte;
  }
  
  public MD5()
  {
    this.bT[0] = 0L;
    this.bT[1] = 0L;
    this.bS[0] = 1732584193L;
    this.bS[1] = 4023233417L;
    this.bS[2] = 2562383102L;
    this.bS[3] = 271733878L;
  }
  
  public static String MungPass(String paramString)
  {
    MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
    paramString = paramString.getBytes();
    localMessageDigest.update(paramString, 0, paramString.length);
    return String.format("%1$032X", new Object[] { new BigInteger(1, localMessageDigest.digest()) });
  }
  
  public static long b2iu(byte paramByte)
  {
    int i = paramByte;
    if (paramByte < 0) {
      i = paramByte & 0xFF;
    }
    return i;
  }
  
  public static String byteHEX(byte paramByte)
  {
    char[] arrayOfChar = new char[16];
    char[] tmp6_5 = arrayOfChar;
    tmp6_5[0] = 48;
    char[] tmp11_6 = tmp6_5;
    tmp11_6[1] = 49;
    char[] tmp16_11 = tmp11_6;
    tmp16_11[2] = 50;
    char[] tmp21_16 = tmp16_11;
    tmp21_16[3] = 51;
    char[] tmp26_21 = tmp21_16;
    tmp26_21[4] = 52;
    char[] tmp31_26 = tmp26_21;
    tmp31_26[5] = 53;
    char[] tmp36_31 = tmp31_26;
    tmp36_31[6] = 54;
    char[] tmp42_36 = tmp36_31;
    tmp42_36[7] = 55;
    char[] tmp48_42 = tmp42_36;
    tmp48_42[8] = 56;
    char[] tmp54_48 = tmp48_42;
    tmp54_48[9] = 57;
    char[] tmp60_54 = tmp54_48;
    tmp60_54[10] = 65;
    char[] tmp66_60 = tmp60_54;
    tmp66_60[11] = 66;
    char[] tmp72_66 = tmp66_60;
    tmp72_66[12] = 67;
    char[] tmp78_72 = tmp72_66;
    tmp78_72[13] = 68;
    char[] tmp84_78 = tmp78_72;
    tmp84_78[14] = 69;
    char[] tmp90_84 = tmp84_78;
    tmp90_84[15] = 70;
    tmp90_84;
    return new String(new char[] { arrayOfChar[(paramByte >>> 4 & 0xF)], arrayOfChar[(paramByte & 0xF)] });
  }
  
  public byte[] getMD5(String paramString)
  {
    localObject2 = null;
    localObject1 = null;
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localObject1 = localMessageDigest;
      localObject2 = localMessageDigest;
      localMessageDigest.reset();
      localObject1 = localMessageDigest;
      localObject2 = localMessageDigest;
      localMessageDigest.update(paramString.getBytes("UTF-8"));
      localObject1 = localMessageDigest;
    }
    catch (NoSuchAlgorithmException paramString)
    {
      for (;;)
      {
        System.out.println("NoSuchAlgorithmException caught!");
        System.exit(-1);
      }
    }
    catch (UnsupportedEncodingException paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
        localObject1 = localObject2;
      }
    }
    return ((MessageDigest)localObject1).digest();
  }
  
  public byte[] getMD5(byte[] paramArrayOfByte)
  {
    Object localObject = null;
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localObject = localMessageDigest;
      localMessageDigest.reset();
      localObject = localMessageDigest;
      localMessageDigest.update(paramArrayOfByte);
      localObject = localMessageDigest;
    }
    catch (NoSuchAlgorithmException paramArrayOfByte)
    {
      for (;;)
      {
        System.out.println("NoSuchAlgorithmException caught!");
        System.exit(-1);
      }
    }
    return ((MessageDigest)localObject).digest();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\http\encryption\MD5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */