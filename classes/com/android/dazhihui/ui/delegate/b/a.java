package com.android.dazhihui.ui.delegate.b;

import java.lang.reflect.Array;
import javax.crypto.Cipher;

public class a
{
  private static byte[] a;
  private static byte[] b;
  private static byte[] c;
  private static int[] d;
  private static int[] e;
  private static Cipher f;
  private static Cipher g;
  private static Cipher h;
  private static Cipher i;
  
  private static int a(int paramInt1, int paramInt2)
  {
    if ((paramInt1 != 0) && (paramInt2 != 0)) {
      return e[((d[(paramInt1 & 0xFF)] + d[(paramInt2 & 0xFF)]) % 255)];
    }
    return 0;
  }
  
  public static void a()
  {
    f = null;
    g = null;
  }
  
  private static void a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[][] paramArrayOfByte)
  {
    byte[][] arrayOfByte = (byte[][])Array.newInstance(Byte.TYPE, new int[] { 4, 4 });
    int j = 0;
    int k;
    while (j < 4)
    {
      k = 0;
      while (k < 4)
      {
        arrayOfByte[j][k] = paramArrayOfByte1[(k * 4 + j)];
        k += 1;
      }
      j += 1;
    }
    a(arrayOfByte, paramArrayOfByte, 0);
    j = 1;
    while (j <= 9)
    {
      a(arrayOfByte);
      c(arrayOfByte);
      e(arrayOfByte);
      a(arrayOfByte, paramArrayOfByte, j);
      j += 1;
    }
    a(arrayOfByte);
    c(arrayOfByte);
    a(arrayOfByte, paramArrayOfByte, 10);
    j = 0;
    while (j < 4)
    {
      k = 0;
      while (k < 4)
      {
        paramArrayOfByte2[(k * 4 + j)] = arrayOfByte[j][k];
        k += 1;
      }
      j += 1;
    }
  }
  
  private static void a(byte[][] paramArrayOfByte)
  {
    int j = 0;
    while (j < 4)
    {
      int k = 0;
      while (k < 4)
      {
        paramArrayOfByte[j][k] = a[(paramArrayOfByte[j][k] & 0xFF)];
        k += 1;
      }
      j += 1;
    }
  }
  
  private static void a(byte[][] paramArrayOfByte1, byte[][] paramArrayOfByte2, int paramInt)
  {
    int j = 0;
    while (j < 4)
    {
      int k = 0;
      while (k < 4)
      {
        byte[] arrayOfByte = paramArrayOfByte1[j];
        arrayOfByte[k] = ((byte)(arrayOfByte[k] ^ paramArrayOfByte2[(paramInt * 4 + k)][j]));
        k += 1;
      }
      j += 1;
    }
  }
  
  public static byte[] a(int paramInt)
  {
    byte[] arrayOfByte = new byte[4];
    int k = 0;
    int j = 3;
    while (k < 4)
    {
      arrayOfByte[k] = ((byte)(paramInt >> 24 - j * 8));
      k += 1;
      j -= 1;
    }
    return arrayOfByte;
  }
  
  /* Error */
  public static byte[] a(byte[] paramArrayOfByte, int paramInt)
  {
    // Byte code:
    //   0: getstatic 66	com/android/dazhihui/ui/delegate/b/a:h	Ljavax/crypto/Cipher;
    //   3: ifnonnull +11 -> 14
    //   6: ldc 68
    //   8: invokestatic 74	javax/crypto/Cipher:getInstance	(Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   11: putstatic 66	com/android/dazhihui/ui/delegate/b/a:h	Ljavax/crypto/Cipher;
    //   14: new 76	javax/crypto/spec/SecretKeySpec
    //   17: dup
    //   18: invokestatic 81	com/android/dazhihui/ui/delegate/newtrade/a/b:g	()[B
    //   21: ldc 83
    //   23: invokespecial 87	javax/crypto/spec/SecretKeySpec:<init>	([BLjava/lang/String;)V
    //   26: astore_2
    //   27: invokestatic 90	com/android/dazhihui/ui/delegate/newtrade/a/b:h	()Ljava/lang/String;
    //   30: invokestatic 90	com/android/dazhihui/ui/delegate/newtrade/a/b:h	()Ljava/lang/String;
    //   33: invokevirtual 96	java/lang/String:length	()I
    //   36: bipush 12
    //   38: isub
    //   39: invokestatic 90	com/android/dazhihui/ui/delegate/newtrade/a/b:h	()Ljava/lang/String;
    //   42: invokevirtual 96	java/lang/String:length	()I
    //   45: invokevirtual 100	java/lang/String:substring	(II)Ljava/lang/String;
    //   48: astore 4
    //   50: bipush 16
    //   52: newarray <illegal type>
    //   54: astore_3
    //   55: aload 4
    //   57: invokevirtual 103	java/lang/String:getBytes	()[B
    //   60: astore 4
    //   62: iload_1
    //   63: invokestatic 105	com/android/dazhihui/ui/delegate/b/a:a	(I)[B
    //   66: iconst_0
    //   67: aload_3
    //   68: iconst_0
    //   69: iconst_4
    //   70: invokestatic 111	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   73: aload 4
    //   75: iconst_0
    //   76: aload_3
    //   77: iconst_4
    //   78: aload 4
    //   80: arraylength
    //   81: invokestatic 111	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   84: new 113	javax/crypto/spec/IvParameterSpec
    //   87: dup
    //   88: aload_3
    //   89: invokespecial 116	javax/crypto/spec/IvParameterSpec:<init>	([B)V
    //   92: astore_3
    //   93: getstatic 66	com/android/dazhihui/ui/delegate/b/a:h	Ljavax/crypto/Cipher;
    //   96: iconst_1
    //   97: aload_2
    //   98: aload_3
    //   99: invokevirtual 120	javax/crypto/Cipher:init	(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    //   102: getstatic 66	com/android/dazhihui/ui/delegate/b/a:h	Ljavax/crypto/Cipher;
    //   105: aload_0
    //   106: invokevirtual 124	javax/crypto/Cipher:update	([B)[B
    //   109: areturn
    //   110: astore_2
    //   111: aload_2
    //   112: invokevirtual 127	java/security/NoSuchAlgorithmException:printStackTrace	()V
    //   115: goto -101 -> 14
    //   118: astore_2
    //   119: aload_2
    //   120: invokevirtual 128	javax/crypto/NoSuchPaddingException:printStackTrace	()V
    //   123: goto -109 -> 14
    //   126: astore_2
    //   127: aload_2
    //   128: invokevirtual 129	java/security/InvalidKeyException:printStackTrace	()V
    //   131: goto -29 -> 102
    //   134: astore_2
    //   135: aload_2
    //   136: invokevirtual 130	java/security/InvalidAlgorithmParameterException:printStackTrace	()V
    //   139: goto -37 -> 102
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	142	0	paramArrayOfByte	byte[]
    //   0	142	1	paramInt	int
    //   26	72	2	localSecretKeySpec	javax.crypto.spec.SecretKeySpec
    //   110	2	2	localNoSuchAlgorithmException	java.security.NoSuchAlgorithmException
    //   118	2	2	localNoSuchPaddingException	javax.crypto.NoSuchPaddingException
    //   126	2	2	localInvalidKeyException	java.security.InvalidKeyException
    //   134	2	2	localInvalidAlgorithmParameterException	java.security.InvalidAlgorithmParameterException
    //   54	45	3	localObject1	Object
    //   48	31	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   6	14	110	java/security/NoSuchAlgorithmException
    //   6	14	118	javax/crypto/NoSuchPaddingException
    //   93	102	126	java/security/InvalidKeyException
    //   93	102	134	java/security/InvalidAlgorithmParameterException
  }
  
  public static byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    c();
    paramArrayOfByte2 = a(paramArrayOfByte2);
    int n = paramArrayOfByte1.length / 16;
    int m = paramArrayOfByte1.length % 16;
    if (m > 0) {}
    byte[] arrayOfByte1;
    byte[] arrayOfByte2;
    byte[] arrayOfByte3;
    int k;
    for (int j = 1;; j = 0)
    {
      arrayOfByte1 = new byte[(j + n) * 16];
      arrayOfByte2 = new byte[16];
      arrayOfByte3 = new byte[16];
      k = 0;
      j = 0;
      while (k < n)
      {
        System.arraycopy(paramArrayOfByte1, j, arrayOfByte2, 0, 16);
        a(arrayOfByte2, arrayOfByte3, paramArrayOfByte2);
        System.arraycopy(arrayOfByte3, 0, arrayOfByte1, j, 16);
        j += 16;
        k += 1;
      }
    }
    if (m > 0)
    {
      System.arraycopy(paramArrayOfByte1, j, arrayOfByte2, 0, m);
      k = m;
      while (k < 16)
      {
        arrayOfByte2[k] = 0;
        k += 1;
      }
      a(arrayOfByte2, arrayOfByte3, paramArrayOfByte2);
      System.arraycopy(arrayOfByte3, 0, arrayOfByte1, j, 16);
    }
    return arrayOfByte1;
  }
  
  private static byte[][] a(byte[] paramArrayOfByte)
  {
    byte[][] arrayOfByte = (byte[][])Array.newInstance(Byte.TYPE, new int[] { 44, 4 });
    int j = 0;
    int k;
    while (j < 4)
    {
      k = 0;
      while (k < 4)
      {
        arrayOfByte[j][k] = paramArrayOfByte[(j * 4 + k)];
        k += 1;
      }
      j += 1;
    }
    j = 4;
    while (j < 44)
    {
      paramArrayOfByte = new byte[arrayOfByte[(j - 1)].length];
      k = 0;
      while (k < paramArrayOfByte.length)
      {
        paramArrayOfByte[k] = arrayOfByte[(j - 1)][k];
        k += 1;
      }
      if (j % 4 == 0)
      {
        b(paramArrayOfByte);
        c(paramArrayOfByte);
        paramArrayOfByte[0] = ((byte)(paramArrayOfByte[0] ^ c[(j / 4 - 1)]));
      }
      k = 0;
      while (k < arrayOfByte[j].length)
      {
        arrayOfByte[j][k] = ((byte)(arrayOfByte[(j - 4)][k] ^ paramArrayOfByte[k]));
        k += 1;
      }
      j += 1;
    }
    return arrayOfByte;
  }
  
  public static void b()
  {
    h = null;
    i = null;
  }
  
  private static void b(byte[] paramArrayOfByte)
  {
    int j = paramArrayOfByte[0];
    paramArrayOfByte[0] = paramArrayOfByte[1];
    paramArrayOfByte[1] = paramArrayOfByte[2];
    paramArrayOfByte[2] = paramArrayOfByte[3];
    paramArrayOfByte[3] = j;
  }
  
  private static void b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[][] paramArrayOfByte)
  {
    byte[][] arrayOfByte = (byte[][])Array.newInstance(Byte.TYPE, new int[] { 4, 4 });
    int j = 0;
    int k;
    while (j < 4)
    {
      k = 0;
      while (k < 4)
      {
        arrayOfByte[j][k] = paramArrayOfByte1[(k * 4 + j)];
        k += 1;
      }
      j += 1;
    }
    a(arrayOfByte, paramArrayOfByte, 10);
    j = 9;
    while (j > 0)
    {
      d(arrayOfByte);
      b(arrayOfByte);
      a(arrayOfByte, paramArrayOfByte, j);
      f(arrayOfByte);
      j -= 1;
    }
    b(arrayOfByte);
    d(arrayOfByte);
    a(arrayOfByte, paramArrayOfByte, 0);
    j = 0;
    while (j < 4)
    {
      k = 0;
      while (k < 4)
      {
        paramArrayOfByte2[(k * 4 + j)] = arrayOfByte[j][k];
        k += 1;
      }
      j += 1;
    }
  }
  
  private static void b(byte[][] paramArrayOfByte)
  {
    int j = 0;
    while (j < 4)
    {
      int k = 0;
      while (k < 4)
      {
        paramArrayOfByte[j][k] = b[(paramArrayOfByte[j][k] & 0xFF)];
        k += 1;
      }
      j += 1;
    }
  }
  
  /* Error */
  public static byte[] b(byte[] paramArrayOfByte, int paramInt)
  {
    // Byte code:
    //   0: getstatic 25	com/android/dazhihui/ui/delegate/b/a:f	Ljavax/crypto/Cipher;
    //   3: ifnonnull +11 -> 14
    //   6: ldc 68
    //   8: invokestatic 74	javax/crypto/Cipher:getInstance	(Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   11: putstatic 25	com/android/dazhihui/ui/delegate/b/a:f	Ljavax/crypto/Cipher;
    //   14: new 76	javax/crypto/spec/SecretKeySpec
    //   17: dup
    //   18: invokestatic 158	com/android/dazhihui/ui/delegate/b/u:i	()[B
    //   21: ldc 83
    //   23: invokespecial 87	javax/crypto/spec/SecretKeySpec:<init>	([BLjava/lang/String;)V
    //   26: astore_2
    //   27: invokestatic 161	com/android/dazhihui/ui/delegate/b/u:j	()Ljava/lang/String;
    //   30: invokestatic 161	com/android/dazhihui/ui/delegate/b/u:j	()Ljava/lang/String;
    //   33: invokevirtual 96	java/lang/String:length	()I
    //   36: bipush 12
    //   38: isub
    //   39: invokestatic 161	com/android/dazhihui/ui/delegate/b/u:j	()Ljava/lang/String;
    //   42: invokevirtual 96	java/lang/String:length	()I
    //   45: invokevirtual 100	java/lang/String:substring	(II)Ljava/lang/String;
    //   48: astore 4
    //   50: bipush 16
    //   52: newarray <illegal type>
    //   54: astore_3
    //   55: aload 4
    //   57: invokevirtual 103	java/lang/String:getBytes	()[B
    //   60: astore 4
    //   62: iload_1
    //   63: invokestatic 105	com/android/dazhihui/ui/delegate/b/a:a	(I)[B
    //   66: iconst_0
    //   67: aload_3
    //   68: iconst_0
    //   69: iconst_4
    //   70: invokestatic 111	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   73: aload 4
    //   75: iconst_0
    //   76: aload_3
    //   77: iconst_4
    //   78: aload 4
    //   80: arraylength
    //   81: invokestatic 111	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   84: new 113	javax/crypto/spec/IvParameterSpec
    //   87: dup
    //   88: aload_3
    //   89: invokespecial 116	javax/crypto/spec/IvParameterSpec:<init>	([B)V
    //   92: astore_3
    //   93: getstatic 25	com/android/dazhihui/ui/delegate/b/a:f	Ljavax/crypto/Cipher;
    //   96: iconst_1
    //   97: aload_2
    //   98: aload_3
    //   99: invokevirtual 120	javax/crypto/Cipher:init	(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    //   102: getstatic 25	com/android/dazhihui/ui/delegate/b/a:f	Ljavax/crypto/Cipher;
    //   105: aload_0
    //   106: invokevirtual 124	javax/crypto/Cipher:update	([B)[B
    //   109: areturn
    //   110: astore_2
    //   111: aload_2
    //   112: invokevirtual 127	java/security/NoSuchAlgorithmException:printStackTrace	()V
    //   115: goto -101 -> 14
    //   118: astore_2
    //   119: aload_2
    //   120: invokevirtual 128	javax/crypto/NoSuchPaddingException:printStackTrace	()V
    //   123: goto -109 -> 14
    //   126: astore_2
    //   127: aload_2
    //   128: invokevirtual 129	java/security/InvalidKeyException:printStackTrace	()V
    //   131: goto -29 -> 102
    //   134: astore_2
    //   135: aload_2
    //   136: invokevirtual 130	java/security/InvalidAlgorithmParameterException:printStackTrace	()V
    //   139: goto -37 -> 102
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	142	0	paramArrayOfByte	byte[]
    //   0	142	1	paramInt	int
    //   26	72	2	localSecretKeySpec	javax.crypto.spec.SecretKeySpec
    //   110	2	2	localNoSuchAlgorithmException	java.security.NoSuchAlgorithmException
    //   118	2	2	localNoSuchPaddingException	javax.crypto.NoSuchPaddingException
    //   126	2	2	localInvalidKeyException	java.security.InvalidKeyException
    //   134	2	2	localInvalidAlgorithmParameterException	java.security.InvalidAlgorithmParameterException
    //   54	45	3	localObject1	Object
    //   48	31	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   6	14	110	java/security/NoSuchAlgorithmException
    //   6	14	118	javax/crypto/NoSuchPaddingException
    //   93	102	126	java/security/InvalidKeyException
    //   93	102	134	java/security/InvalidAlgorithmParameterException
  }
  
  public static byte[] b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    c();
    paramArrayOfByte2 = a(paramArrayOfByte2);
    int m = paramArrayOfByte1.length / 16;
    byte[] arrayOfByte1 = new byte[m * 16];
    byte[] arrayOfByte2 = new byte[16];
    byte[] arrayOfByte3 = new byte[16];
    int j = 0;
    int k = 0;
    while (j < m)
    {
      System.arraycopy(paramArrayOfByte1, k, arrayOfByte2, 0, 16);
      b(arrayOfByte2, arrayOfByte3, paramArrayOfByte2);
      System.arraycopy(arrayOfByte3, 0, arrayOfByte1, k, 16);
      k += 16;
      j += 1;
    }
    return arrayOfByte1;
  }
  
  private static void c()
  {
    if (a == null) {
      a = new byte[] { 99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, 49, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, -128, -30, -21, 39, -78, 117, 9, -125, 44, 26, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, 127, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, -68, -74, -38, 33, 16, -1, -13, -46, -51, 12, 19, -20, 95, -105, 68, 23, -60, -89, 126, 61, 100, 93, 25, 115, 96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, -32, 50, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, 30, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, -65, -26, 66, 104, 65, -103, 45, 15, -80, 84, -69, 22 };
    }
    if (b == null) {
      b = new byte[] { 82, 9, 106, -43, 48, 54, -91, 56, -65, 64, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, 50, -90, -62, 35, 61, -18, 76, -107, 11, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 108, 112, 72, 80, -3, -19, -71, -38, 94, 21, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, -68, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, 30, -113, -54, 63, 15, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, 79, 103, -36, -22, -105, -14, -49, -50, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, 28, 117, -33, 110, 71, -15, 26, 113, 29, 41, -59, -119, 111, -73, 98, 14, -86, 24, -66, 27, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, -64, -2, 120, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, 49, -79, 18, 16, 89, 39, -128, -20, 95, 96, 81, 127, -87, 25, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, -17, -96, -32, 59, 77, -82, 42, -11, -80, -56, -21, -69, 60, -125, 83, -103, 97, 23, 43, 4, 126, -70, 119, -42, 38, -31, 105, 20, 99, 85, 33, 12, 125 };
    }
    if (d == null) {
      d = new int[] { 0, 0, 25, 1, 50, 2, 26, 198, 75, 199, 27, 104, 51, 238, 223, 3, 100, 4, 224, 14, 52, 141, 129, 239, 76, 113, 8, 200, 248, 105, 28, 193, 125, 194, 29, 181, 249, 185, 39, 106, 77, 228, 166, 114, 154, 201, 9, 120, 101, 47, 138, 5, 33, 15, 225, 36, 18, 240, 130, 69, 53, 147, 218, 142, 150, 143, 219, 189, 54, 208, 206, 148, 19, 92, 210, 241, 64, 70, 131, 56, 102, 221, 253, 48, 191, 6, 139, 98, 179, 37, 226, 152, 34, 136, 145, 16, 126, 110, 72, 195, 163, 182, 30, 66, 58, 107, 40, 84, 250, 133, 61, 186, 43, 121, 10, 21, 155, 159, 94, 202, 78, 212, 172, 229, 243, 115, 167, 87, 175, 88, 168, 80, 244, 234, 214, 116, 79, 174, 233, 213, 231, 230, 173, 232, 44, 215, 117, 122, 235, 22, 11, 245, 89, 203, 95, 176, 156, 169, 81, 160, 127, 12, 246, 111, 23, 196, 73, 236, 216, 67, 31, 45, 164, 118, 123, 183, 204, 187, 62, 90, 251, 96, 177, 134, 59, 82, 161, 108, 170, 85, 41, 157, 151, 178, 135, 144, 97, 190, 220, 252, 188, 149, 207, 205, 55, 63, 91, 209, 83, 57, 132, 60, 65, 162, 109, 71, 20, 42, 158, 93, 86, 242, 211, 171, 68, 17, 146, 217, 35, 32, 46, 137, 180, 124, 184, 38, 119, 153, 227, 165, 103, 74, 237, 222, 197, 49, 254, 24, 13, 99, 140, 128, 192, 247, 112, 7 };
    }
    if (e == null) {
      e = new int[] { 1, 3, 5, 15, 17, 51, 85, 255, 26, 46, 114, 150, 161, 248, 19, 53, 95, 225, 56, 72, 216, 115, 149, 164, 247, 2, 6, 10, 30, 34, 102, 170, 229, 52, 92, 228, 55, 89, 235, 38, 106, 190, 217, 112, 144, 171, 230, 49, 83, 245, 4, 12, 20, 60, 68, 204, 79, 209, 104, 184, 211, 110, 178, 205, 76, 212, 103, 169, 224, 59, 77, 215, 98, 166, 241, 8, 24, 40, 120, 136, 131, 158, 185, 208, 107, 189, 220, 127, 129, 152, 179, 206, 73, 219, 118, 154, 181, 196, 87, 249, 16, 48, 80, 240, 11, 29, 39, 105, 187, 214, 97, 163, 254, 25, 43, 125, 135, 146, 173, 236, 47, 113, 147, 174, 233, 32, 96, 160, 251, 22, 58, 78, 210, 109, 183, 194, 93, 231, 50, 86, 250, 21, 63, 65, 195, 94, 226, 61, 71, 201, 64, 192, 91, 237, 44, 116, 156, 191, 218, 117, 159, 186, 213, 100, 172, 239, 42, 126, 130, 157, 188, 223, 122, 142, 137, 128, 155, 182, 193, 88, 232, 35, 101, 175, 234, 37, 111, 177, 200, 67, 197, 84, 252, 31, 33, 99, 165, 244, 7, 9, 27, 45, 119, 153, 176, 203, 70, 202, 69, 207, 74, 222, 121, 139, 134, 145, 168, 227, 62, 66, 198, 81, 243, 14, 18, 54, 90, 238, 41, 123, 141, 140, 143, 138, 133, 148, 167, 242, 13, 23, 57, 75, 221, 124, 132, 151, 162, 253, 28, 36, 108, 180, 199, 82, 246, 1 };
    }
    if (c == null) {
      c = new byte[] { 1, 2, 4, 8, 16, 32, 64, -128, 27, 54, 108, -40, -85, 77, -102, 47, 94, -68, 99, -58, -105, 53, 106, -44, -77, 125, -6, -17, -59, -111 };
    }
  }
  
  private static void c(byte[] paramArrayOfByte)
  {
    int j = 0;
    while (j < paramArrayOfByte.length)
    {
      paramArrayOfByte[j] = a[(paramArrayOfByte[j] & 0xFF)];
      j += 1;
    }
  }
  
  private static void c(byte[][] paramArrayOfByte)
  {
    byte[][] arrayOfByte = (byte[][])Array.newInstance(Byte.TYPE, new int[] { 4, 4 });
    int j = 0;
    int k;
    while (j < 4)
    {
      k = 0;
      while (k < 4)
      {
        arrayOfByte[j][k] = paramArrayOfByte[j][k];
        k += 1;
      }
      j += 1;
    }
    j = 0;
    while (j < 4)
    {
      k = 0;
      while (k < 4)
      {
        paramArrayOfByte[j][k] = arrayOfByte[j][((j + k) % 4)];
        k += 1;
      }
      j += 1;
    }
  }
  
  /* Error */
  public static byte[] c(byte[] paramArrayOfByte, int paramInt)
  {
    // Byte code:
    //   0: getstatic 146	com/android/dazhihui/ui/delegate/b/a:i	Ljavax/crypto/Cipher;
    //   3: ifnonnull +11 -> 14
    //   6: ldc 68
    //   8: invokestatic 74	javax/crypto/Cipher:getInstance	(Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   11: putstatic 146	com/android/dazhihui/ui/delegate/b/a:i	Ljavax/crypto/Cipher;
    //   14: new 76	javax/crypto/spec/SecretKeySpec
    //   17: dup
    //   18: invokestatic 81	com/android/dazhihui/ui/delegate/newtrade/a/b:g	()[B
    //   21: ldc 83
    //   23: invokespecial 87	javax/crypto/spec/SecretKeySpec:<init>	([BLjava/lang/String;)V
    //   26: astore_2
    //   27: invokestatic 90	com/android/dazhihui/ui/delegate/newtrade/a/b:h	()Ljava/lang/String;
    //   30: invokestatic 90	com/android/dazhihui/ui/delegate/newtrade/a/b:h	()Ljava/lang/String;
    //   33: invokevirtual 96	java/lang/String:length	()I
    //   36: bipush 12
    //   38: isub
    //   39: invokestatic 90	com/android/dazhihui/ui/delegate/newtrade/a/b:h	()Ljava/lang/String;
    //   42: invokevirtual 96	java/lang/String:length	()I
    //   45: invokevirtual 100	java/lang/String:substring	(II)Ljava/lang/String;
    //   48: astore 4
    //   50: bipush 16
    //   52: newarray <illegal type>
    //   54: astore_3
    //   55: aload 4
    //   57: invokevirtual 103	java/lang/String:getBytes	()[B
    //   60: astore 4
    //   62: iload_1
    //   63: invokestatic 105	com/android/dazhihui/ui/delegate/b/a:a	(I)[B
    //   66: iconst_0
    //   67: aload_3
    //   68: iconst_0
    //   69: iconst_4
    //   70: invokestatic 111	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   73: aload 4
    //   75: iconst_0
    //   76: aload_3
    //   77: iconst_4
    //   78: aload 4
    //   80: arraylength
    //   81: invokestatic 111	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   84: new 113	javax/crypto/spec/IvParameterSpec
    //   87: dup
    //   88: aload_3
    //   89: invokespecial 116	javax/crypto/spec/IvParameterSpec:<init>	([B)V
    //   92: astore_3
    //   93: getstatic 146	com/android/dazhihui/ui/delegate/b/a:i	Ljavax/crypto/Cipher;
    //   96: iconst_2
    //   97: aload_2
    //   98: aload_3
    //   99: invokevirtual 120	javax/crypto/Cipher:init	(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    //   102: getstatic 146	com/android/dazhihui/ui/delegate/b/a:i	Ljavax/crypto/Cipher;
    //   105: aload_0
    //   106: invokevirtual 124	javax/crypto/Cipher:update	([B)[B
    //   109: areturn
    //   110: astore_2
    //   111: aload_2
    //   112: invokevirtual 127	java/security/NoSuchAlgorithmException:printStackTrace	()V
    //   115: goto -101 -> 14
    //   118: astore_2
    //   119: aload_2
    //   120: invokevirtual 128	javax/crypto/NoSuchPaddingException:printStackTrace	()V
    //   123: goto -109 -> 14
    //   126: astore_2
    //   127: aload_2
    //   128: invokevirtual 129	java/security/InvalidKeyException:printStackTrace	()V
    //   131: goto -29 -> 102
    //   134: astore_2
    //   135: aload_2
    //   136: invokevirtual 130	java/security/InvalidAlgorithmParameterException:printStackTrace	()V
    //   139: goto -37 -> 102
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	142	0	paramArrayOfByte	byte[]
    //   0	142	1	paramInt	int
    //   26	72	2	localSecretKeySpec	javax.crypto.spec.SecretKeySpec
    //   110	2	2	localNoSuchAlgorithmException	java.security.NoSuchAlgorithmException
    //   118	2	2	localNoSuchPaddingException	javax.crypto.NoSuchPaddingException
    //   126	2	2	localInvalidKeyException	java.security.InvalidKeyException
    //   134	2	2	localInvalidAlgorithmParameterException	java.security.InvalidAlgorithmParameterException
    //   54	45	3	localObject1	Object
    //   48	31	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   6	14	110	java/security/NoSuchAlgorithmException
    //   6	14	118	javax/crypto/NoSuchPaddingException
    //   93	102	126	java/security/InvalidKeyException
    //   93	102	134	java/security/InvalidAlgorithmParameterException
  }
  
  private static void d(byte[][] paramArrayOfByte)
  {
    byte[][] arrayOfByte = (byte[][])Array.newInstance(Byte.TYPE, new int[] { 4, 4 });
    int j = 0;
    int k;
    while (j < 4)
    {
      k = 0;
      while (k < 4)
      {
        arrayOfByte[j][k] = paramArrayOfByte[j][k];
        k += 1;
      }
      j += 1;
    }
    j = 0;
    while (j < 4)
    {
      k = 0;
      while (k < 4)
      {
        paramArrayOfByte[j][((j + k) % 4)] = arrayOfByte[j][k];
        k += 1;
      }
      j += 1;
    }
  }
  
  /* Error */
  public static byte[] d(byte[] paramArrayOfByte, int paramInt)
  {
    // Byte code:
    //   0: getstatic 27	com/android/dazhihui/ui/delegate/b/a:g	Ljavax/crypto/Cipher;
    //   3: ifnonnull +11 -> 14
    //   6: ldc 68
    //   8: invokestatic 74	javax/crypto/Cipher:getInstance	(Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   11: putstatic 27	com/android/dazhihui/ui/delegate/b/a:g	Ljavax/crypto/Cipher;
    //   14: new 76	javax/crypto/spec/SecretKeySpec
    //   17: dup
    //   18: invokestatic 158	com/android/dazhihui/ui/delegate/b/u:i	()[B
    //   21: ldc 83
    //   23: invokespecial 87	javax/crypto/spec/SecretKeySpec:<init>	([BLjava/lang/String;)V
    //   26: astore_2
    //   27: invokestatic 161	com/android/dazhihui/ui/delegate/b/u:j	()Ljava/lang/String;
    //   30: invokestatic 161	com/android/dazhihui/ui/delegate/b/u:j	()Ljava/lang/String;
    //   33: invokevirtual 96	java/lang/String:length	()I
    //   36: bipush 12
    //   38: isub
    //   39: invokestatic 161	com/android/dazhihui/ui/delegate/b/u:j	()Ljava/lang/String;
    //   42: invokevirtual 96	java/lang/String:length	()I
    //   45: invokevirtual 100	java/lang/String:substring	(II)Ljava/lang/String;
    //   48: astore 4
    //   50: bipush 16
    //   52: newarray <illegal type>
    //   54: astore_3
    //   55: aload 4
    //   57: invokevirtual 103	java/lang/String:getBytes	()[B
    //   60: astore 4
    //   62: iload_1
    //   63: invokestatic 105	com/android/dazhihui/ui/delegate/b/a:a	(I)[B
    //   66: iconst_0
    //   67: aload_3
    //   68: iconst_0
    //   69: iconst_4
    //   70: invokestatic 111	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   73: aload 4
    //   75: iconst_0
    //   76: aload_3
    //   77: iconst_4
    //   78: aload 4
    //   80: arraylength
    //   81: invokestatic 111	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   84: new 113	javax/crypto/spec/IvParameterSpec
    //   87: dup
    //   88: aload_3
    //   89: invokespecial 116	javax/crypto/spec/IvParameterSpec:<init>	([B)V
    //   92: astore_3
    //   93: getstatic 27	com/android/dazhihui/ui/delegate/b/a:g	Ljavax/crypto/Cipher;
    //   96: iconst_2
    //   97: aload_2
    //   98: aload_3
    //   99: invokevirtual 120	javax/crypto/Cipher:init	(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    //   102: getstatic 27	com/android/dazhihui/ui/delegate/b/a:g	Ljavax/crypto/Cipher;
    //   105: aload_0
    //   106: invokevirtual 124	javax/crypto/Cipher:update	([B)[B
    //   109: areturn
    //   110: astore_2
    //   111: aload_2
    //   112: invokevirtual 127	java/security/NoSuchAlgorithmException:printStackTrace	()V
    //   115: goto -101 -> 14
    //   118: astore_2
    //   119: aload_2
    //   120: invokevirtual 128	javax/crypto/NoSuchPaddingException:printStackTrace	()V
    //   123: goto -109 -> 14
    //   126: astore_2
    //   127: aload_2
    //   128: invokevirtual 129	java/security/InvalidKeyException:printStackTrace	()V
    //   131: goto -29 -> 102
    //   134: astore_2
    //   135: aload_2
    //   136: invokevirtual 130	java/security/InvalidAlgorithmParameterException:printStackTrace	()V
    //   139: goto -37 -> 102
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	142	0	paramArrayOfByte	byte[]
    //   0	142	1	paramInt	int
    //   26	72	2	localSecretKeySpec	javax.crypto.spec.SecretKeySpec
    //   110	2	2	localNoSuchAlgorithmException	java.security.NoSuchAlgorithmException
    //   118	2	2	localNoSuchPaddingException	javax.crypto.NoSuchPaddingException
    //   126	2	2	localInvalidKeyException	java.security.InvalidKeyException
    //   134	2	2	localInvalidAlgorithmParameterException	java.security.InvalidAlgorithmParameterException
    //   54	45	3	localObject1	Object
    //   48	31	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   6	14	110	java/security/NoSuchAlgorithmException
    //   6	14	118	javax/crypto/NoSuchPaddingException
    //   93	102	126	java/security/InvalidKeyException
    //   93	102	134	java/security/InvalidAlgorithmParameterException
  }
  
  private static void e(byte[][] paramArrayOfByte)
  {
    byte[][] arrayOfByte = (byte[][])Array.newInstance(Byte.TYPE, new int[] { 4, 4 });
    int j = 0;
    while (j < 4)
    {
      int k = 0;
      while (k < 4)
      {
        arrayOfByte[j][k] = paramArrayOfByte[j][k];
        k += 1;
      }
      j += 1;
    }
    j = 0;
    while (j < 4)
    {
      paramArrayOfByte[0][j] = ((byte)(a(2, arrayOfByte[0][j]) ^ a(3, arrayOfByte[1][j]) ^ arrayOfByte[2][j] ^ arrayOfByte[3][j]));
      paramArrayOfByte[1][j] = ((byte)(a(2, arrayOfByte[1][j]) ^ a(3, arrayOfByte[2][j]) ^ arrayOfByte[0][j] ^ arrayOfByte[3][j]));
      paramArrayOfByte[2][j] = ((byte)(a(2, arrayOfByte[2][j]) ^ a(3, arrayOfByte[3][j]) ^ arrayOfByte[1][j] ^ arrayOfByte[0][j]));
      paramArrayOfByte[3][j] = ((byte)(a(2, arrayOfByte[3][j]) ^ a(3, arrayOfByte[0][j]) ^ arrayOfByte[2][j] ^ arrayOfByte[1][j]));
      j += 1;
    }
  }
  
  private static void f(byte[][] paramArrayOfByte)
  {
    byte[][] arrayOfByte = (byte[][])Array.newInstance(Byte.TYPE, new int[] { 4, 4 });
    int j = 0;
    while (j < 4)
    {
      int k = 0;
      while (k < 4)
      {
        arrayOfByte[j][k] = paramArrayOfByte[j][k];
        k += 1;
      }
      j += 1;
    }
    j = 0;
    while (j < 4)
    {
      paramArrayOfByte[0][j] = ((byte)(a(14, arrayOfByte[0][j]) ^ a(11, arrayOfByte[1][j]) ^ a(13, arrayOfByte[2][j]) ^ a(9, arrayOfByte[3][j])));
      paramArrayOfByte[1][j] = ((byte)(a(9, arrayOfByte[0][j]) ^ a(14, arrayOfByte[1][j]) ^ a(11, arrayOfByte[2][j]) ^ a(13, arrayOfByte[3][j])));
      paramArrayOfByte[2][j] = ((byte)(a(13, arrayOfByte[0][j]) ^ a(9, arrayOfByte[1][j]) ^ a(14, arrayOfByte[2][j]) ^ a(11, arrayOfByte[3][j])));
      paramArrayOfByte[3][j] = ((byte)(a(11, arrayOfByte[0][j]) ^ a(13, arrayOfByte[1][j]) ^ a(9, arrayOfByte[2][j]) ^ a(14, arrayOfByte[3][j])));
      j += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */