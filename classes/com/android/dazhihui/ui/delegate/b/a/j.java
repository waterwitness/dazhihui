package com.android.dazhihui.ui.delegate.b.a;

import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

public class j
{
  public static X509Certificate a;
  public static X509Certificate b;
  private static final byte[] c = { 6, 3, 85, 4, 3 };
  
  public static void a(InputStream paramInputStream)
  {
    if (paramInputStream == null) {
      return;
    }
    if (a == null) {}
    try
    {
      a = (X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate(paramInputStream);
      try
      {
        paramInputStream.close();
        return;
      }
      catch (IOException paramInputStream)
      {
        paramInputStream.printStackTrace();
        return;
      }
    }
    catch (CertificateException localCertificateException)
    {
      for (;;)
      {
        localCertificateException.printStackTrace();
      }
    }
  }
  
  /* Error */
  public static boolean a(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +8 -> 9
    //   4: aload_0
    //   5: arraylength
    //   6: ifne +5 -> 11
    //   9: iconst_0
    //   10: ireturn
    //   11: new 53	java/io/ByteArrayInputStream
    //   14: dup
    //   15: aload_0
    //   16: invokespecial 57	java/io/ByteArrayInputStream:<init>	([B)V
    //   19: astore_0
    //   20: ldc 27
    //   22: invokestatic 33	java/security/cert/CertificateFactory:getInstance	(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;
    //   25: aload_0
    //   26: invokevirtual 37	java/security/cert/CertificateFactory:generateCertificate	(Ljava/io/InputStream;)Ljava/security/cert/Certificate;
    //   29: checkcast 39	java/security/cert/X509Certificate
    //   32: putstatic 59	com/android/dazhihui/ui/delegate/b/a/j:b	Ljava/security/cert/X509Certificate;
    //   35: aload_0
    //   36: invokevirtual 44	java/io/InputStream:close	()V
    //   39: getstatic 59	com/android/dazhihui/ui/delegate/b/a/j:b	Ljava/security/cert/X509Certificate;
    //   42: invokevirtual 63	java/security/cert/X509Certificate:getSubjectX500Principal	()Ljavax/security/auth/x500/X500Principal;
    //   45: invokevirtual 69	javax/security/auth/x500/X500Principal:getEncoded	()[B
    //   48: astore_0
    //   49: aload_0
    //   50: ifnull -41 -> 9
    //   53: aload_0
    //   54: arraylength
    //   55: ifeq -46 -> 9
    //   58: iconst_0
    //   59: istore_2
    //   60: aload_0
    //   61: iload_2
    //   62: baload
    //   63: getstatic 17	com/android/dazhihui/ui/delegate/b/a/j:c	[B
    //   66: iconst_0
    //   67: baload
    //   68: if_icmpne +138 -> 206
    //   71: aload_0
    //   72: iload_2
    //   73: iconst_1
    //   74: iadd
    //   75: baload
    //   76: getstatic 17	com/android/dazhihui/ui/delegate/b/a/j:c	[B
    //   79: iconst_1
    //   80: baload
    //   81: if_icmpne +125 -> 206
    //   84: aload_0
    //   85: iload_2
    //   86: iconst_2
    //   87: iadd
    //   88: baload
    //   89: getstatic 17	com/android/dazhihui/ui/delegate/b/a/j:c	[B
    //   92: iconst_2
    //   93: baload
    //   94: if_icmpne +112 -> 206
    //   97: aload_0
    //   98: iload_2
    //   99: iconst_3
    //   100: iadd
    //   101: baload
    //   102: getstatic 17	com/android/dazhihui/ui/delegate/b/a/j:c	[B
    //   105: iconst_3
    //   106: baload
    //   107: if_icmpne +99 -> 206
    //   110: aload_0
    //   111: iload_2
    //   112: iconst_4
    //   113: iadd
    //   114: baload
    //   115: getstatic 17	com/android/dazhihui/ui/delegate/b/a/j:c	[B
    //   118: iconst_4
    //   119: baload
    //   120: if_icmpne +86 -> 206
    //   123: iload_2
    //   124: bipush 6
    //   126: iadd
    //   127: istore_2
    //   128: iload_2
    //   129: ifle -120 -> 9
    //   132: aload_0
    //   133: iload_2
    //   134: baload
    //   135: istore_3
    //   136: iload_3
    //   137: newarray <illegal type>
    //   139: astore_1
    //   140: aload_0
    //   141: iload_2
    //   142: iconst_1
    //   143: iadd
    //   144: aload_1
    //   145: iconst_0
    //   146: iload_3
    //   147: invokestatic 75	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   150: new 77	java/lang/String
    //   153: dup
    //   154: aload_1
    //   155: ldc 79
    //   157: invokespecial 82	java/lang/String:<init>	([BLjava/lang/String;)V
    //   160: new 84	java/lang/StringBuilder
    //   163: dup
    //   164: invokespecial 86	java/lang/StringBuilder:<init>	()V
    //   167: getstatic 91	com/android/dazhihui/ui/delegate/newtrade/a/a:b	Ljava/lang/String;
    //   170: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: ldc 97
    //   175: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   181: invokevirtual 105	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   184: istore_2
    //   185: iload_2
    //   186: ifne -177 -> 9
    //   189: iconst_1
    //   190: ireturn
    //   191: astore_0
    //   192: aload_0
    //   193: invokevirtual 48	java/security/cert/CertificateException:printStackTrace	()V
    //   196: iconst_0
    //   197: ireturn
    //   198: astore_0
    //   199: aload_0
    //   200: invokevirtual 47	java/io/IOException:printStackTrace	()V
    //   203: goto -164 -> 39
    //   206: iload_2
    //   207: iconst_1
    //   208: iadd
    //   209: istore_3
    //   210: iload_3
    //   211: istore_2
    //   212: iload_3
    //   213: aload_0
    //   214: arraylength
    //   215: if_icmplt -155 -> 60
    //   218: iconst_0
    //   219: istore_2
    //   220: goto -92 -> 128
    //   223: astore_0
    //   224: aload_0
    //   225: invokevirtual 106	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   228: iconst_0
    //   229: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	230	0	paramArrayOfByte	byte[]
    //   139	16	1	arrayOfByte	byte[]
    //   59	161	2	i	int
    //   135	81	3	j	int
    // Exception table:
    //   from	to	target	type
    //   20	35	191	java/security/cert/CertificateException
    //   35	39	198	java/io/IOException
    //   150	185	223	java/io/UnsupportedEncodingException
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\b\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */