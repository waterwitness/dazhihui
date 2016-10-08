package com.tencent.feedback.eup;

import android.content.Context;
import com.tencent.feedback.common.c;
import com.tencent.feedback.proguard.C;
import com.tencent.feedback.proguard.E;
import com.tencent.feedback.proguard.F;
import com.tencent.feedback.proguard.H;
import com.tencent.feedback.proguard.I;
import com.tencent.feedback.proguard.a;
import com.tencent.feedback.proguard.l;
import com.tencent.feedback.proguard.o;
import com.tencent.feedback.upload.AbstractUploadDatas;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class g
  extends AbstractUploadDatas
{
  private static g d = null;
  private byte[] e = null;
  private C f = null;
  private List<e> g = null;
  
  private g(Context paramContext)
  {
    super(paramContext, 3, 206);
  }
  
  public static g a(Context paramContext)
  {
    if (paramContext != null) {}
    try
    {
      if (d == null) {
        d = new g(paramContext);
      }
      paramContext = d;
      return paramContext;
    }
    finally {}
  }
  
  /* Error */
  private static F a(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnull +7 -> 8
    //   4: aload_0
    //   5: ifnonnull +14 -> 19
    //   8: ldc 40
    //   10: iconst_0
    //   11: anewarray 42	java/lang/Object
    //   14: invokestatic 48	com/tencent/feedback/common/e:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   17: aconst_null
    //   18: areturn
    //   19: ldc 50
    //   21: iconst_1
    //   22: anewarray 42	java/lang/Object
    //   25: dup
    //   26: iconst_0
    //   27: aload_1
    //   28: aastore
    //   29: invokestatic 52	com/tencent/feedback/common/e:f	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   32: new 54	java/io/File
    //   35: dup
    //   36: aload_1
    //   37: invokespecial 57	java/io/File:<init>	(Ljava/lang/String;)V
    //   40: astore_1
    //   41: new 54	java/io/File
    //   44: dup
    //   45: aload_0
    //   46: invokevirtual 63	android/content/Context:getCacheDir	()Ljava/io/File;
    //   49: ldc 65
    //   51: invokespecial 68	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   54: astore_3
    //   55: aload_1
    //   56: aload_3
    //   57: sipush 5000
    //   60: invokestatic 73	com/tencent/feedback/proguard/a:a	(Ljava/io/File;Ljava/io/File;I)Z
    //   63: ifne +14 -> 77
    //   66: ldc 75
    //   68: iconst_0
    //   69: anewarray 42	java/lang/Object
    //   72: invokestatic 48	com/tencent/feedback/common/e:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   75: aconst_null
    //   76: areturn
    //   77: new 77	java/io/ByteArrayOutputStream
    //   80: dup
    //   81: invokespecial 79	java/io/ByteArrayOutputStream:<init>	()V
    //   84: astore_2
    //   85: new 81	java/io/FileInputStream
    //   88: dup
    //   89: aload_3
    //   90: invokespecial 84	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   93: astore_1
    //   94: aload_1
    //   95: astore_0
    //   96: sipush 1000
    //   99: newarray <illegal type>
    //   101: astore 4
    //   103: aload_1
    //   104: astore_0
    //   105: aload_1
    //   106: aload 4
    //   108: invokevirtual 88	java/io/FileInputStream:read	([B)I
    //   111: istore 5
    //   113: iload 5
    //   115: ifle +61 -> 176
    //   118: aload_1
    //   119: astore_0
    //   120: aload_2
    //   121: aload 4
    //   123: iconst_0
    //   124: iload 5
    //   126: invokevirtual 92	java/io/ByteArrayOutputStream:write	([BII)V
    //   129: aload_1
    //   130: astore_0
    //   131: aload_2
    //   132: invokevirtual 95	java/io/ByteArrayOutputStream:flush	()V
    //   135: goto -32 -> 103
    //   138: astore_2
    //   139: aload_1
    //   140: astore_0
    //   141: aload_2
    //   142: invokevirtual 98	java/lang/Throwable:printStackTrace	()V
    //   145: aload_1
    //   146: ifnull +7 -> 153
    //   149: aload_1
    //   150: invokevirtual 101	java/io/FileInputStream:close	()V
    //   153: aload_3
    //   154: invokevirtual 105	java/io/File:exists	()Z
    //   157: ifeq -140 -> 17
    //   160: ldc 107
    //   162: iconst_0
    //   163: anewarray 42	java/lang/Object
    //   166: invokestatic 52	com/tencent/feedback/common/e:f	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   169: aload_3
    //   170: invokevirtual 110	java/io/File:delete	()Z
    //   173: pop
    //   174: aconst_null
    //   175: areturn
    //   176: aload_1
    //   177: astore_0
    //   178: aload_2
    //   179: invokevirtual 114	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   182: astore_2
    //   183: aload_1
    //   184: astore_0
    //   185: ldc 116
    //   187: iconst_1
    //   188: anewarray 42	java/lang/Object
    //   191: dup
    //   192: iconst_0
    //   193: aload_2
    //   194: arraylength
    //   195: invokestatic 122	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   198: aastore
    //   199: invokestatic 52	com/tencent/feedback/common/e:f	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   202: aload_1
    //   203: astore_0
    //   204: new 124	com/tencent/feedback/proguard/F
    //   207: dup
    //   208: iconst_2
    //   209: aload_3
    //   210: invokevirtual 128	java/io/File:getName	()Ljava/lang/String;
    //   213: aload_2
    //   214: invokespecial 131	com/tencent/feedback/proguard/F:<init>	(BLjava/lang/String;[B)V
    //   217: astore_2
    //   218: aload_1
    //   219: invokevirtual 101	java/io/FileInputStream:close	()V
    //   222: aload_3
    //   223: invokevirtual 105	java/io/File:exists	()Z
    //   226: ifeq +17 -> 243
    //   229: ldc 107
    //   231: iconst_0
    //   232: anewarray 42	java/lang/Object
    //   235: invokestatic 52	com/tencent/feedback/common/e:f	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   238: aload_3
    //   239: invokevirtual 110	java/io/File:delete	()Z
    //   242: pop
    //   243: aload_2
    //   244: areturn
    //   245: astore_0
    //   246: aload_0
    //   247: invokevirtual 132	java/io/IOException:printStackTrace	()V
    //   250: goto -28 -> 222
    //   253: astore_0
    //   254: aload_0
    //   255: invokevirtual 132	java/io/IOException:printStackTrace	()V
    //   258: goto -105 -> 153
    //   261: astore_1
    //   262: aconst_null
    //   263: astore_0
    //   264: aload_0
    //   265: ifnull +7 -> 272
    //   268: aload_0
    //   269: invokevirtual 101	java/io/FileInputStream:close	()V
    //   272: aload_3
    //   273: invokevirtual 105	java/io/File:exists	()Z
    //   276: ifeq +17 -> 293
    //   279: ldc 107
    //   281: iconst_0
    //   282: anewarray 42	java/lang/Object
    //   285: invokestatic 52	com/tencent/feedback/common/e:f	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   288: aload_3
    //   289: invokevirtual 110	java/io/File:delete	()Z
    //   292: pop
    //   293: aload_1
    //   294: athrow
    //   295: astore_0
    //   296: aload_0
    //   297: invokevirtual 132	java/io/IOException:printStackTrace	()V
    //   300: goto -28 -> 272
    //   303: astore_1
    //   304: goto -40 -> 264
    //   307: astore_2
    //   308: aconst_null
    //   309: astore_1
    //   310: goto -171 -> 139
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	313	0	paramContext	Context
    //   0	313	1	paramString	String
    //   84	48	2	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   138	41	2	localThrowable1	Throwable
    //   182	62	2	localObject	Object
    //   307	1	2	localThrowable2	Throwable
    //   54	235	3	localFile	java.io.File
    //   101	21	4	arrayOfByte	byte[]
    //   111	14	5	i	int
    // Exception table:
    //   from	to	target	type
    //   96	103	138	java/lang/Throwable
    //   105	113	138	java/lang/Throwable
    //   120	129	138	java/lang/Throwable
    //   131	135	138	java/lang/Throwable
    //   178	183	138	java/lang/Throwable
    //   185	202	138	java/lang/Throwable
    //   204	218	138	java/lang/Throwable
    //   218	222	245	java/io/IOException
    //   149	153	253	java/io/IOException
    //   85	94	261	finally
    //   268	272	295	java/io/IOException
    //   96	103	303	finally
    //   105	113	303	finally
    //   120	129	303	finally
    //   131	135	303	finally
    //   141	145	303	finally
    //   178	183	303	finally
    //   185	202	303	finally
    //   204	218	303	finally
    //   85	94	307	java/lang/Throwable
  }
  
  private static F a(byte[] paramArrayOfByte, String paramString)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0) || (paramString == null) || (paramString.trim().length() <= 0)) {
      return null;
    }
    try
    {
      F localF = new F();
      localF.a = 1;
      localF.b = paramString;
      localF.c = paramArrayOfByte;
      return localF;
    }
    catch (Throwable paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
    }
    return null;
  }
  
  /* Error */
  private H a(Context paramContext, e parame)
  {
    // Byte code:
    //   0: aload_2
    //   1: ifnonnull +14 -> 15
    //   4: ldc -101
    //   6: iconst_0
    //   7: anewarray 42	java/lang/Object
    //   10: invokestatic 48	com/tencent/feedback/common/e:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   13: aconst_null
    //   14: areturn
    //   15: ldc -99
    //   17: iconst_3
    //   18: anewarray 42	java/lang/Object
    //   21: dup
    //   22: iconst_0
    //   23: aload_2
    //   24: invokevirtual 161	com/tencent/feedback/eup/e:f	()Ljava/lang/String;
    //   27: aastore
    //   28: dup
    //   29: iconst_1
    //   30: aload_2
    //   31: invokevirtual 163	com/tencent/feedback/eup/e:c	()Z
    //   34: invokestatic 168	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   37: aastore
    //   38: dup
    //   39: iconst_2
    //   40: aload_2
    //   41: invokevirtual 170	com/tencent/feedback/eup/e:d	()Z
    //   44: invokestatic 168	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   47: aastore
    //   48: invokestatic 52	com/tencent/feedback/common/e:f	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   51: aload_2
    //   52: invokevirtual 170	com/tencent/feedback/eup/e:d	()Z
    //   55: ifeq +2132 -> 2187
    //   58: aload_2
    //   59: invokevirtual 163	com/tencent/feedback/eup/e:c	()Z
    //   62: ifeq +2118 -> 2180
    //   65: ldc -84
    //   67: astore_3
    //   68: new 174	com/tencent/feedback/proguard/H
    //   71: dup
    //   72: invokespecial 175	com/tencent/feedback/proguard/H:<init>	()V
    //   75: astore 4
    //   77: aload 4
    //   79: aload_2
    //   80: invokevirtual 178	com/tencent/feedback/eup/e:x	()Ljava/lang/String;
    //   83: putfield 181	com/tencent/feedback/proguard/H:s	Ljava/lang/String;
    //   86: aload 4
    //   88: aload_3
    //   89: putfield 184	com/tencent/feedback/proguard/H:q	Ljava/lang/String;
    //   92: aload 4
    //   94: aload_2
    //   95: invokevirtual 188	com/tencent/feedback/eup/e:i	()J
    //   98: putfield 191	com/tencent/feedback/proguard/H:d	J
    //   101: aload 4
    //   103: new 193	java/lang/StringBuilder
    //   106: dup
    //   107: invokespecial 194	java/lang/StringBuilder:<init>	()V
    //   110: aload_2
    //   111: invokevirtual 196	com/tencent/feedback/eup/e:e	()Ljava/lang/String;
    //   114: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   117: invokevirtual 203	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   120: putfield 205	com/tencent/feedback/proguard/H:a	Ljava/lang/String;
    //   123: aload 4
    //   125: new 193	java/lang/StringBuilder
    //   128: dup
    //   129: invokespecial 194	java/lang/StringBuilder:<init>	()V
    //   132: aload_2
    //   133: invokevirtual 207	com/tencent/feedback/eup/e:g	()Ljava/lang/String;
    //   136: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: invokevirtual 203	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   142: putfield 208	com/tencent/feedback/proguard/H:b	Ljava/lang/String;
    //   145: aload 4
    //   147: new 193	java/lang/StringBuilder
    //   150: dup
    //   151: invokespecial 194	java/lang/StringBuilder:<init>	()V
    //   154: aload_2
    //   155: invokevirtual 211	com/tencent/feedback/eup/e:t	()Ljava/lang/String;
    //   158: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: invokevirtual 203	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   164: putfield 213	com/tencent/feedback/proguard/H:f	Ljava/lang/String;
    //   167: aload 4
    //   169: aload_2
    //   170: invokevirtual 215	com/tencent/feedback/eup/e:q	()Ljava/lang/String;
    //   173: putfield 217	com/tencent/feedback/proguard/H:c	Ljava/lang/String;
    //   176: aload 4
    //   178: new 193	java/lang/StringBuilder
    //   181: dup
    //   182: invokespecial 194	java/lang/StringBuilder:<init>	()V
    //   185: aload_2
    //   186: invokevirtual 196	com/tencent/feedback/eup/e:e	()Ljava/lang/String;
    //   189: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   192: ldc -37
    //   194: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   197: aload_2
    //   198: invokevirtual 161	com/tencent/feedback/eup/e:f	()Ljava/lang/String;
    //   201: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: ldc -35
    //   206: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: aload_2
    //   210: invokevirtual 224	com/tencent/feedback/eup/e:h	()Ljava/lang/String;
    //   213: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: invokevirtual 203	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   219: putfield 226	com/tencent/feedback/proguard/H:g	Ljava/lang/String;
    //   222: aload 4
    //   224: ldc -28
    //   226: putfield 230	com/tencent/feedback/proguard/H:h	Ljava/lang/String;
    //   229: aload 4
    //   231: new 193	java/lang/StringBuilder
    //   234: dup
    //   235: invokespecial 194	java/lang/StringBuilder:<init>	()V
    //   238: aload_2
    //   239: invokevirtual 232	com/tencent/feedback/eup/e:s	()Ljava/lang/String;
    //   242: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   245: invokevirtual 203	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   248: putfield 235	com/tencent/feedback/proguard/H:o	Ljava/lang/String;
    //   251: aload 4
    //   253: aload_2
    //   254: invokevirtual 237	com/tencent/feedback/eup/e:o	()I
    //   257: i2l
    //   258: putfield 240	com/tencent/feedback/proguard/H:m	J
    //   261: aload_1
    //   262: invokestatic 245	com/tencent/feedback/common/d:a	(Landroid/content/Context;)Lcom/tencent/feedback/common/d;
    //   265: pop
    //   266: aload 4
    //   268: invokestatic 247	com/tencent/feedback/common/d:d	()Ljava/lang/String;
    //   271: putfield 250	com/tencent/feedback/proguard/H:n	Ljava/lang/String;
    //   274: new 252	java/util/ArrayList
    //   277: dup
    //   278: invokespecial 253	java/util/ArrayList:<init>	()V
    //   281: astore_3
    //   282: aload_2
    //   283: invokevirtual 256	com/tencent/feedback/eup/e:p	()[B
    //   286: ldc_w 258
    //   289: invokestatic 260	com/tencent/feedback/eup/g:a	([BLjava/lang/String;)Lcom/tencent/feedback/proguard/F;
    //   292: astore 5
    //   294: aload 5
    //   296: ifnull +20 -> 316
    //   299: ldc_w 262
    //   302: iconst_0
    //   303: anewarray 42	java/lang/Object
    //   306: invokestatic 52	com/tencent/feedback/common/e:f	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   309: aload_3
    //   310: aload 5
    //   312: invokevirtual 266	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   315: pop
    //   316: aload_2
    //   317: invokevirtual 163	com/tencent/feedback/eup/e:c	()Z
    //   320: ifeq +51 -> 371
    //   323: aload_2
    //   324: invokevirtual 237	com/tencent/feedback/eup/e:o	()I
    //   327: iconst_1
    //   328: if_icmple +43 -> 371
    //   331: aload_2
    //   332: invokevirtual 268	com/tencent/feedback/eup/e:n	()Ljava/lang/String;
    //   335: ldc_w 270
    //   338: invokevirtual 274	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   341: ldc_w 276
    //   344: invokestatic 260	com/tencent/feedback/eup/g:a	([BLjava/lang/String;)Lcom/tencent/feedback/proguard/F;
    //   347: astore 5
    //   349: aload 5
    //   351: ifnull +20 -> 371
    //   354: ldc_w 278
    //   357: iconst_0
    //   358: anewarray 42	java/lang/Object
    //   361: invokestatic 52	com/tencent/feedback/common/e:f	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   364: aload_3
    //   365: aload 5
    //   367: invokevirtual 266	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   370: pop
    //   371: aload_2
    //   372: invokevirtual 170	com/tencent/feedback/eup/e:d	()Z
    //   375: ifeq +42 -> 417
    //   378: aload_2
    //   379: invokevirtual 281	com/tencent/feedback/eup/e:r	()Ljava/lang/String;
    //   382: ifnull +35 -> 417
    //   385: aload_1
    //   386: aload_2
    //   387: invokevirtual 281	com/tencent/feedback/eup/e:r	()Ljava/lang/String;
    //   390: invokestatic 283	com/tencent/feedback/eup/g:a	(Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/feedback/proguard/F;
    //   393: astore 5
    //   395: aload 5
    //   397: ifnull +20 -> 417
    //   400: ldc_w 285
    //   403: iconst_0
    //   404: anewarray 42	java/lang/Object
    //   407: invokestatic 52	com/tencent/feedback/common/e:f	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   410: aload_3
    //   411: aload 5
    //   413: invokevirtual 266	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   416: pop
    //   417: aload_2
    //   418: invokevirtual 170	com/tencent/feedback/eup/e:d	()Z
    //   421: ifeq +63 -> 484
    //   424: aload_0
    //   425: getfield 25	com/tencent/feedback/eup/g:e	[B
    //   428: ifnonnull +15 -> 443
    //   431: aload_1
    //   432: invokestatic 245	com/tencent/feedback/common/d:a	(Landroid/content/Context;)Lcom/tencent/feedback/common/d;
    //   435: pop
    //   436: aload_0
    //   437: invokestatic 287	com/tencent/feedback/common/d:e	()[B
    //   440: putfield 25	com/tencent/feedback/eup/g:e	[B
    //   443: aload_0
    //   444: getfield 25	com/tencent/feedback/eup/g:e	[B
    //   447: ifnull +37 -> 484
    //   450: aload_0
    //   451: getfield 25	com/tencent/feedback/eup/g:e	[B
    //   454: ldc_w 289
    //   457: invokestatic 260	com/tencent/feedback/eup/g:a	([BLjava/lang/String;)Lcom/tencent/feedback/proguard/F;
    //   460: astore 5
    //   462: aload 5
    //   464: ifnull +20 -> 484
    //   467: ldc_w 291
    //   470: iconst_0
    //   471: anewarray 42	java/lang/Object
    //   474: invokestatic 52	com/tencent/feedback/common/e:f	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   477: aload_3
    //   478: aload 5
    //   480: invokevirtual 266	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   483: pop
    //   484: aload_2
    //   485: invokevirtual 294	com/tencent/feedback/eup/e:u	()Ljava/lang/String;
    //   488: ifnull +43 -> 531
    //   491: aload_2
    //   492: invokevirtual 294	com/tencent/feedback/eup/e:u	()Ljava/lang/String;
    //   495: ldc_w 270
    //   498: invokevirtual 274	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   501: ldc_w 296
    //   504: invokestatic 260	com/tencent/feedback/eup/g:a	([BLjava/lang/String;)Lcom/tencent/feedback/proguard/F;
    //   507: astore 5
    //   509: aload 5
    //   511: ifnull +20 -> 531
    //   514: ldc_w 298
    //   517: iconst_0
    //   518: anewarray 42	java/lang/Object
    //   521: invokestatic 52	com/tencent/feedback/common/e:f	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   524: aload_3
    //   525: aload 5
    //   527: invokevirtual 266	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   530: pop
    //   531: aload_2
    //   532: invokevirtual 301	com/tencent/feedback/eup/e:v	()[B
    //   535: ifnull +37 -> 572
    //   538: aload_2
    //   539: invokevirtual 301	com/tencent/feedback/eup/e:v	()[B
    //   542: ldc_w 303
    //   545: invokestatic 260	com/tencent/feedback/eup/g:a	([BLjava/lang/String;)Lcom/tencent/feedback/proguard/F;
    //   548: astore 5
    //   550: aload 5
    //   552: ifnull +20 -> 572
    //   555: ldc_w 305
    //   558: iconst_0
    //   559: anewarray 42	java/lang/Object
    //   562: invokestatic 52	com/tencent/feedback/common/e:f	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   565: aload_3
    //   566: aload 5
    //   568: invokevirtual 266	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   571: pop
    //   572: aload_2
    //   573: invokevirtual 309	com/tencent/feedback/eup/e:F	()Ljava/util/Map;
    //   576: ifnull +178 -> 754
    //   579: aload_2
    //   580: invokevirtual 309	com/tencent/feedback/eup/e:F	()Ljava/util/Map;
    //   583: invokeinterface 314 1 0
    //   588: ifle +166 -> 754
    //   591: new 193	java/lang/StringBuilder
    //   594: dup
    //   595: invokespecial 194	java/lang/StringBuilder:<init>	()V
    //   598: astore 5
    //   600: aload_2
    //   601: invokevirtual 309	com/tencent/feedback/eup/e:F	()Ljava/util/Map;
    //   604: invokeinterface 318 1 0
    //   609: invokeinterface 324 1 0
    //   614: astore 6
    //   616: aload 6
    //   618: invokeinterface 329 1 0
    //   623: ifeq +87 -> 710
    //   626: aload 6
    //   628: invokeinterface 333 1 0
    //   633: checkcast 335	java/util/Map$Entry
    //   636: astore 7
    //   638: aload 5
    //   640: ldc_w 337
    //   643: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   646: aload 7
    //   648: invokeinterface 340 1 0
    //   653: checkcast 135	java/lang/String
    //   656: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   659: ldc_w 342
    //   662: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   665: pop
    //   666: aload 5
    //   668: aload 7
    //   670: invokeinterface 345 1 0
    //   675: checkcast 135	java/lang/String
    //   678: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   681: pop
    //   682: aload 5
    //   684: ldc -35
    //   686: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   689: pop
    //   690: goto -74 -> 616
    //   693: astore 6
    //   695: ldc_w 347
    //   698: iconst_0
    //   699: anewarray 42	java/lang/Object
    //   702: invokestatic 349	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   705: aload 6
    //   707: invokevirtual 98	java/lang/Throwable:printStackTrace	()V
    //   710: aload 5
    //   712: invokevirtual 350	java/lang/StringBuilder:length	()I
    //   715: ifle +39 -> 754
    //   718: aload 5
    //   720: invokevirtual 203	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   723: ldc_w 270
    //   726: invokevirtual 274	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   729: ldc_w 352
    //   732: invokestatic 260	com/tencent/feedback/eup/g:a	([BLjava/lang/String;)Lcom/tencent/feedback/proguard/F;
    //   735: astore 5
    //   737: ldc_w 354
    //   740: iconst_0
    //   741: anewarray 42	java/lang/Object
    //   744: invokestatic 52	com/tencent/feedback/common/e:f	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   747: aload_3
    //   748: aload 5
    //   750: invokevirtual 266	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   753: pop
    //   754: aload_3
    //   755: invokevirtual 355	java/util/ArrayList:size	()I
    //   758: ifle +9 -> 767
    //   761: aload 4
    //   763: aload_3
    //   764: putfield 358	com/tencent/feedback/proguard/H:e	Ljava/util/ArrayList;
    //   767: new 360	com/tencent/feedback/proguard/L
    //   770: dup
    //   771: invokespecial 361	com/tencent/feedback/proguard/L:<init>	()V
    //   774: astore_3
    //   775: aload_3
    //   776: aload_2
    //   777: invokevirtual 365	com/tencent/feedback/eup/e:j	()F
    //   780: putfield 367	com/tencent/feedback/proguard/L:a	F
    //   783: aload_3
    //   784: aload_2
    //   785: invokevirtual 370	com/tencent/feedback/eup/e:k	()F
    //   788: putfield 372	com/tencent/feedback/proguard/L:b	F
    //   791: aload_3
    //   792: aload_2
    //   793: invokevirtual 375	com/tencent/feedback/eup/e:I	()J
    //   796: putfield 377	com/tencent/feedback/proguard/L:c	J
    //   799: aload_3
    //   800: aload_2
    //   801: invokevirtual 379	com/tencent/feedback/eup/e:J	()J
    //   804: putfield 380	com/tencent/feedback/proguard/L:d	J
    //   807: aload_3
    //   808: aload_2
    //   809: invokevirtual 383	com/tencent/feedback/eup/e:K	()J
    //   812: putfield 385	com/tencent/feedback/proguard/L:e	J
    //   815: new 387	java/util/HashMap
    //   818: dup
    //   819: iconst_5
    //   820: invokespecial 390	java/util/HashMap:<init>	(I)V
    //   823: astore 5
    //   825: aload 5
    //   827: ldc_w 392
    //   830: new 193	java/lang/StringBuilder
    //   833: dup
    //   834: invokespecial 194	java/lang/StringBuilder:<init>	()V
    //   837: aload_2
    //   838: invokevirtual 395	com/tencent/feedback/eup/e:O	()J
    //   841: invokevirtual 398	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   844: invokevirtual 203	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   847: invokeinterface 402 3 0
    //   852: pop
    //   853: aload 5
    //   855: ldc_w 404
    //   858: new 193	java/lang/StringBuilder
    //   861: dup
    //   862: invokespecial 194	java/lang/StringBuilder:<init>	()V
    //   865: aload_2
    //   866: invokevirtual 407	com/tencent/feedback/eup/e:P	()J
    //   869: invokevirtual 398	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   872: invokevirtual 203	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   875: invokeinterface 402 3 0
    //   880: pop
    //   881: aload 5
    //   883: ldc_w 409
    //   886: new 193	java/lang/StringBuilder
    //   889: dup
    //   890: invokespecial 194	java/lang/StringBuilder:<init>	()V
    //   893: aload_2
    //   894: invokevirtual 412	com/tencent/feedback/eup/e:Q	()Ljava/lang/String;
    //   897: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   900: invokevirtual 203	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   903: invokeinterface 402 3 0
    //   908: pop
    //   909: aload_3
    //   910: aload 5
    //   912: putfield 415	com/tencent/feedback/proguard/L:f	Ljava/util/Map;
    //   915: ldc_w 417
    //   918: bipush 7
    //   920: anewarray 42	java/lang/Object
    //   923: dup
    //   924: iconst_0
    //   925: aload 4
    //   927: getfield 184	com/tencent/feedback/proguard/H:q	Ljava/lang/String;
    //   930: aastore
    //   931: dup
    //   932: iconst_1
    //   933: aload_3
    //   934: getfield 377	com/tencent/feedback/proguard/L:c	J
    //   937: invokestatic 422	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   940: aastore
    //   941: dup
    //   942: iconst_2
    //   943: aload_3
    //   944: getfield 380	com/tencent/feedback/proguard/L:d	J
    //   947: invokestatic 422	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   950: aastore
    //   951: dup
    //   952: iconst_3
    //   953: aload_3
    //   954: getfield 385	com/tencent/feedback/proguard/L:e	J
    //   957: invokestatic 422	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   960: aastore
    //   961: dup
    //   962: iconst_4
    //   963: aload_2
    //   964: invokevirtual 395	com/tencent/feedback/eup/e:O	()J
    //   967: invokestatic 422	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   970: aastore
    //   971: dup
    //   972: iconst_5
    //   973: aload_2
    //   974: invokevirtual 407	com/tencent/feedback/eup/e:P	()J
    //   977: invokestatic 422	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   980: aastore
    //   981: dup
    //   982: bipush 6
    //   984: aload_2
    //   985: invokevirtual 412	com/tencent/feedback/eup/e:Q	()Ljava/lang/String;
    //   988: aastore
    //   989: invokestatic 424	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   992: aload 4
    //   994: aload_3
    //   995: putfield 427	com/tencent/feedback/proguard/H:j	Lcom/tencent/feedback/proguard/L;
    //   998: aload_1
    //   999: invokestatic 432	com/tencent/feedback/common/c:a	(Landroid/content/Context;)Lcom/tencent/feedback/common/c;
    //   1002: astore 5
    //   1004: new 434	com/tencent/feedback/proguard/J
    //   1007: dup
    //   1008: invokespecial 435	com/tencent/feedback/proguard/J:<init>	()V
    //   1011: astore 6
    //   1013: new 193	java/lang/StringBuilder
    //   1016: dup
    //   1017: invokespecial 194	java/lang/StringBuilder:<init>	()V
    //   1020: aload 5
    //   1022: invokevirtual 438	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1025: invokevirtual 203	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1028: ifnull +1287 -> 2315
    //   1031: aload 5
    //   1033: invokevirtual 440	com/tencent/feedback/common/c:p	()Ljava/lang/String;
    //   1036: astore_3
    //   1037: aload 6
    //   1039: aload_3
    //   1040: putfield 441	com/tencent/feedback/proguard/J:a	Ljava/lang/String;
    //   1043: aload 6
    //   1045: aload 5
    //   1047: invokevirtual 442	com/tencent/feedback/common/c:f	()Ljava/lang/String;
    //   1050: putfield 444	com/tencent/feedback/proguard/J:d	Ljava/lang/String;
    //   1053: aload 6
    //   1055: aload 5
    //   1057: invokevirtual 445	com/tencent/feedback/common/c:x	()Ljava/lang/String;
    //   1060: putfield 447	com/tencent/feedback/proguard/J:i	Ljava/lang/String;
    //   1063: aload 6
    //   1065: aload 5
    //   1067: invokevirtual 450	com/tencent/feedback/common/c:w	()Ljava/lang/String;
    //   1070: putfield 451	com/tencent/feedback/proguard/J:h	Ljava/lang/String;
    //   1073: aload 6
    //   1075: aload 5
    //   1077: invokevirtual 453	com/tencent/feedback/common/c:i	()Ljava/lang/String;
    //   1080: putfield 454	com/tencent/feedback/proguard/J:c	Ljava/lang/String;
    //   1083: aload 6
    //   1085: aload 5
    //   1087: invokevirtual 456	com/tencent/feedback/common/c:t	()J
    //   1090: putfield 458	com/tencent/feedback/proguard/J:f	J
    //   1093: aload 6
    //   1095: aload 5
    //   1097: invokevirtual 460	com/tencent/feedback/common/c:u	()J
    //   1100: putfield 462	com/tencent/feedback/proguard/J:g	J
    //   1103: aload 6
    //   1105: aload 5
    //   1107: invokevirtual 463	com/tencent/feedback/common/c:g	()Ljava/lang/String;
    //   1110: putfield 465	com/tencent/feedback/proguard/J:e	Ljava/lang/String;
    //   1113: aload 6
    //   1115: new 387	java/util/HashMap
    //   1118: dup
    //   1119: iconst_5
    //   1120: invokespecial 390	java/util/HashMap:<init>	(I)V
    //   1123: putfield 467	com/tencent/feedback/proguard/J:j	Ljava/util/Map;
    //   1126: aload 6
    //   1128: getfield 467	com/tencent/feedback/proguard/J:j	Ljava/util/Map;
    //   1131: ldc_w 469
    //   1134: new 193	java/lang/StringBuilder
    //   1137: dup
    //   1138: invokespecial 194	java/lang/StringBuilder:<init>	()V
    //   1141: aload_2
    //   1142: invokevirtual 472	com/tencent/feedback/eup/e:N	()J
    //   1145: invokevirtual 398	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1148: invokevirtual 203	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1151: invokeinterface 402 3 0
    //   1156: pop
    //   1157: aload 6
    //   1159: getfield 467	com/tencent/feedback/proguard/J:j	Ljava/util/Map;
    //   1162: ldc_w 474
    //   1165: aload 5
    //   1167: invokevirtual 440	com/tencent/feedback/common/c:p	()Ljava/lang/String;
    //   1170: invokeinterface 402 3 0
    //   1175: pop
    //   1176: aload 6
    //   1178: getfield 467	com/tencent/feedback/proguard/J:j	Ljava/util/Map;
    //   1181: ldc_w 476
    //   1184: aload 5
    //   1186: invokevirtual 477	com/tencent/feedback/common/c:r	()Ljava/lang/String;
    //   1189: invokeinterface 402 3 0
    //   1194: pop
    //   1195: aload 6
    //   1197: getfield 467	com/tencent/feedback/proguard/J:j	Ljava/util/Map;
    //   1200: ldc_w 479
    //   1203: aload 5
    //   1205: invokevirtual 480	com/tencent/feedback/common/c:s	()Ljava/lang/String;
    //   1208: invokeinterface 402 3 0
    //   1213: pop
    //   1214: aload 6
    //   1216: getfield 467	com/tencent/feedback/proguard/J:j	Ljava/util/Map;
    //   1219: ldc_w 482
    //   1222: aload 5
    //   1224: invokevirtual 483	com/tencent/feedback/common/c:q	()Ljava/lang/String;
    //   1227: invokeinterface 402 3 0
    //   1232: pop
    //   1233: aload 6
    //   1235: getfield 467	com/tencent/feedback/proguard/J:j	Ljava/util/Map;
    //   1238: ldc_w 485
    //   1241: new 193	java/lang/StringBuilder
    //   1244: dup
    //   1245: invokespecial 194	java/lang/StringBuilder:<init>	()V
    //   1248: aload_2
    //   1249: invokevirtual 488	com/tencent/feedback/eup/e:R	()Ljava/lang/String;
    //   1252: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1255: invokevirtual 203	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1258: invokeinterface 402 3 0
    //   1263: pop
    //   1264: aload_2
    //   1265: invokevirtual 491	com/tencent/feedback/eup/e:A	()Ljava/lang/String;
    //   1268: ldc_w 493
    //   1271: invokestatic 499	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1274: astore_3
    //   1275: new 193	java/lang/StringBuilder
    //   1278: dup
    //   1279: invokespecial 194	java/lang/StringBuilder:<init>	()V
    //   1282: astore 7
    //   1284: aload 7
    //   1286: ldc_w 501
    //   1289: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1292: aload 5
    //   1294: invokevirtual 504	com/tencent/feedback/common/c:C	()Z
    //   1297: invokevirtual 507	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   1300: pop
    //   1301: aload 7
    //   1303: ldc_w 509
    //   1306: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1309: ldc_w 511
    //   1312: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1315: aload_3
    //   1316: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1319: pop
    //   1320: aload_2
    //   1321: invokevirtual 170	com/tencent/feedback/eup/e:d	()Z
    //   1324: ifeq +164 -> 1488
    //   1327: aload_2
    //   1328: invokevirtual 513	com/tencent/feedback/eup/e:B	()Ljava/lang/String;
    //   1331: ifnull +35 -> 1366
    //   1334: aload_2
    //   1335: invokevirtual 513	com/tencent/feedback/eup/e:B	()Ljava/lang/String;
    //   1338: invokevirtual 516	java/lang/String:isEmpty	()Z
    //   1341: ifne +25 -> 1366
    //   1344: aload 7
    //   1346: ldc_w 518
    //   1349: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1352: ldc_w 511
    //   1355: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1358: aload_2
    //   1359: invokevirtual 513	com/tencent/feedback/eup/e:B	()Ljava/lang/String;
    //   1362: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1365: pop
    //   1366: aload_2
    //   1367: invokevirtual 521	com/tencent/feedback/eup/e:D	()Ljava/lang/String;
    //   1370: ifnull +35 -> 1405
    //   1373: aload_2
    //   1374: invokevirtual 521	com/tencent/feedback/eup/e:D	()Ljava/lang/String;
    //   1377: invokevirtual 516	java/lang/String:isEmpty	()Z
    //   1380: ifne +25 -> 1405
    //   1383: aload 7
    //   1385: ldc_w 523
    //   1388: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1391: ldc_w 511
    //   1394: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1397: aload_2
    //   1398: invokevirtual 521	com/tencent/feedback/eup/e:D	()Ljava/lang/String;
    //   1401: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1404: pop
    //   1405: aload_2
    //   1406: invokevirtual 525	com/tencent/feedback/eup/e:C	()Ljava/lang/String;
    //   1409: ifnull +35 -> 1444
    //   1412: aload_2
    //   1413: invokevirtual 525	com/tencent/feedback/eup/e:C	()Ljava/lang/String;
    //   1416: invokevirtual 516	java/lang/String:isEmpty	()Z
    //   1419: ifne +25 -> 1444
    //   1422: aload 7
    //   1424: ldc_w 527
    //   1427: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1430: ldc_w 511
    //   1433: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1436: aload_2
    //   1437: invokevirtual 525	com/tencent/feedback/eup/e:C	()Ljava/lang/String;
    //   1440: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1443: pop
    //   1444: aload_2
    //   1445: invokevirtual 530	com/tencent/feedback/eup/e:H	()Z
    //   1448: ifeq +18 -> 1466
    //   1451: aload 7
    //   1453: ldc_w 532
    //   1456: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1459: ldc_w 534
    //   1462: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1465: pop
    //   1466: aload 7
    //   1468: ldc_w 536
    //   1471: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1474: ldc_w 511
    //   1477: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1480: aload_2
    //   1481: invokevirtual 539	com/tencent/feedback/eup/e:E	()Ljava/lang/String;
    //   1484: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1487: pop
    //   1488: aload 6
    //   1490: aload 7
    //   1492: invokevirtual 203	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1495: putfield 540	com/tencent/feedback/proguard/J:b	Ljava/lang/String;
    //   1498: aload 7
    //   1500: iconst_0
    //   1501: invokevirtual 543	java/lang/StringBuilder:setLength	(I)V
    //   1504: aload 4
    //   1506: aload 6
    //   1508: putfield 546	com/tencent/feedback/proguard/H:i	Lcom/tencent/feedback/proguard/J;
    //   1511: ldc_w 548
    //   1514: iconst_1
    //   1515: anewarray 42	java/lang/Object
    //   1518: dup
    //   1519: iconst_0
    //   1520: aload 6
    //   1522: getfield 444	com/tencent/feedback/proguard/J:d	Ljava/lang/String;
    //   1525: aastore
    //   1526: invokestatic 424	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1529: ldc_w 550
    //   1532: iconst_1
    //   1533: anewarray 42	java/lang/Object
    //   1536: dup
    //   1537: iconst_0
    //   1538: aload 6
    //   1540: getfield 444	com/tencent/feedback/proguard/J:d	Ljava/lang/String;
    //   1543: aastore
    //   1544: invokestatic 424	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1547: ldc_w 552
    //   1550: iconst_1
    //   1551: anewarray 42	java/lang/Object
    //   1554: dup
    //   1555: iconst_0
    //   1556: aload 6
    //   1558: getfield 447	com/tencent/feedback/proguard/J:i	Ljava/lang/String;
    //   1561: aastore
    //   1562: invokestatic 424	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1565: ldc_w 554
    //   1568: iconst_1
    //   1569: anewarray 42	java/lang/Object
    //   1572: dup
    //   1573: iconst_0
    //   1574: aload 6
    //   1576: getfield 451	com/tencent/feedback/proguard/J:h	Ljava/lang/String;
    //   1579: aastore
    //   1580: invokestatic 424	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1583: ldc_w 556
    //   1586: iconst_1
    //   1587: anewarray 42	java/lang/Object
    //   1590: dup
    //   1591: iconst_0
    //   1592: aload 6
    //   1594: getfield 454	com/tencent/feedback/proguard/J:c	Ljava/lang/String;
    //   1597: aastore
    //   1598: invokestatic 424	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1601: ldc_w 558
    //   1604: iconst_1
    //   1605: anewarray 42	java/lang/Object
    //   1608: dup
    //   1609: iconst_0
    //   1610: aload 6
    //   1612: getfield 458	com/tencent/feedback/proguard/J:f	J
    //   1615: invokestatic 422	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1618: aastore
    //   1619: invokestatic 424	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1622: ldc_w 560
    //   1625: iconst_1
    //   1626: anewarray 42	java/lang/Object
    //   1629: dup
    //   1630: iconst_0
    //   1631: aload 6
    //   1633: getfield 462	com/tencent/feedback/proguard/J:g	J
    //   1636: invokestatic 422	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1639: aastore
    //   1640: invokestatic 424	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1643: ldc_w 562
    //   1646: iconst_1
    //   1647: anewarray 42	java/lang/Object
    //   1650: dup
    //   1651: iconst_0
    //   1652: aload 6
    //   1654: getfield 465	com/tencent/feedback/proguard/J:e	Ljava/lang/String;
    //   1657: aastore
    //   1658: invokestatic 424	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1661: ldc_w 564
    //   1664: iconst_1
    //   1665: anewarray 42	java/lang/Object
    //   1668: dup
    //   1669: iconst_0
    //   1670: aload 6
    //   1672: getfield 467	com/tencent/feedback/proguard/J:j	Ljava/util/Map;
    //   1675: ldc_w 469
    //   1678: invokeinterface 568 2 0
    //   1683: aastore
    //   1684: invokestatic 424	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1687: ldc_w 570
    //   1690: iconst_1
    //   1691: anewarray 42	java/lang/Object
    //   1694: dup
    //   1695: iconst_0
    //   1696: aload 6
    //   1698: getfield 467	com/tencent/feedback/proguard/J:j	Ljava/util/Map;
    //   1701: ldc_w 485
    //   1704: invokeinterface 568 2 0
    //   1709: aastore
    //   1710: invokestatic 424	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1713: ldc_w 572
    //   1716: iconst_1
    //   1717: anewarray 42	java/lang/Object
    //   1720: dup
    //   1721: iconst_0
    //   1722: aload 6
    //   1724: getfield 467	com/tencent/feedback/proguard/J:j	Ljava/util/Map;
    //   1727: ldc_w 474
    //   1730: invokeinterface 568 2 0
    //   1735: aastore
    //   1736: invokestatic 424	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1739: ldc_w 574
    //   1742: iconst_1
    //   1743: anewarray 42	java/lang/Object
    //   1746: dup
    //   1747: iconst_0
    //   1748: aload 6
    //   1750: getfield 467	com/tencent/feedback/proguard/J:j	Ljava/util/Map;
    //   1753: ldc_w 476
    //   1756: invokeinterface 568 2 0
    //   1761: aastore
    //   1762: invokestatic 424	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1765: ldc_w 576
    //   1768: iconst_1
    //   1769: anewarray 42	java/lang/Object
    //   1772: dup
    //   1773: iconst_0
    //   1774: aload 6
    //   1776: getfield 467	com/tencent/feedback/proguard/J:j	Ljava/util/Map;
    //   1779: ldc_w 479
    //   1782: invokeinterface 568 2 0
    //   1787: aastore
    //   1788: invokestatic 424	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1791: ldc_w 578
    //   1794: iconst_1
    //   1795: anewarray 42	java/lang/Object
    //   1798: dup
    //   1799: iconst_0
    //   1800: aload 6
    //   1802: getfield 467	com/tencent/feedback/proguard/J:j	Ljava/util/Map;
    //   1805: ldc_w 482
    //   1808: invokeinterface 568 2 0
    //   1813: aastore
    //   1814: invokestatic 424	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1817: ldc_w 580
    //   1820: iconst_1
    //   1821: anewarray 42	java/lang/Object
    //   1824: dup
    //   1825: iconst_0
    //   1826: aload 6
    //   1828: getfield 540	com/tencent/feedback/proguard/J:b	Ljava/lang/String;
    //   1831: aastore
    //   1832: invokestatic 424	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1835: new 582	com/tencent/feedback/proguard/G
    //   1838: dup
    //   1839: invokespecial 583	com/tencent/feedback/proguard/G:<init>	()V
    //   1842: astore_3
    //   1843: aload_3
    //   1844: new 193	java/lang/StringBuilder
    //   1847: dup
    //   1848: invokespecial 194	java/lang/StringBuilder:<init>	()V
    //   1851: aload_2
    //   1852: invokevirtual 585	com/tencent/feedback/eup/e:m	()Ljava/lang/String;
    //   1855: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1858: invokevirtual 203	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1861: putfield 586	com/tencent/feedback/proguard/G:a	Ljava/lang/String;
    //   1864: aload_3
    //   1865: new 193	java/lang/StringBuilder
    //   1868: dup
    //   1869: invokespecial 194	java/lang/StringBuilder:<init>	()V
    //   1872: aload_2
    //   1873: invokevirtual 585	com/tencent/feedback/eup/e:m	()Ljava/lang/String;
    //   1876: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1879: invokevirtual 203	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1882: putfield 587	com/tencent/feedback/proguard/G:b	Ljava/lang/String;
    //   1885: aload 4
    //   1887: aload_3
    //   1888: putfield 590	com/tencent/feedback/proguard/H:k	Lcom/tencent/feedback/proguard/G;
    //   1891: aload_2
    //   1892: invokevirtual 170	com/tencent/feedback/eup/e:d	()Z
    //   1895: ifeq +39 -> 1934
    //   1898: aload_1
    //   1899: invokestatic 593	com/tencent/feedback/eup/g:b	(Landroid/content/Context;)Ljava/util/ArrayList;
    //   1902: astore_1
    //   1903: aload 4
    //   1905: aload_1
    //   1906: putfield 596	com/tencent/feedback/proguard/H:l	Ljava/util/ArrayList;
    //   1909: aload_1
    //   1910: ifnonnull +355 -> 2265
    //   1913: iconst_0
    //   1914: istore 8
    //   1916: ldc_w 598
    //   1919: iconst_1
    //   1920: anewarray 42	java/lang/Object
    //   1923: dup
    //   1924: iconst_0
    //   1925: iload 8
    //   1927: invokestatic 122	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1930: aastore
    //   1931: invokestatic 52	com/tencent/feedback/common/e:f	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1934: aload 5
    //   1936: ifnull +386 -> 2322
    //   1939: aload 5
    //   1941: invokevirtual 600	com/tencent/feedback/common/c:l	()Ljava/lang/String;
    //   1944: astore_1
    //   1945: aload 4
    //   1947: aload_1
    //   1948: putfield 602	com/tencent/feedback/proguard/H:p	Ljava/lang/String;
    //   1951: aload_2
    //   1952: invokevirtual 604	com/tencent/feedback/eup/e:w	()Ljava/util/Map;
    //   1955: astore_2
    //   1956: aload_2
    //   1957: ifnonnull +317 -> 2274
    //   1960: iconst_0
    //   1961: istore 8
    //   1963: ldc_w 606
    //   1966: iconst_1
    //   1967: anewarray 42	java/lang/Object
    //   1970: dup
    //   1971: iconst_0
    //   1972: iload 8
    //   1974: invokestatic 122	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1977: aastore
    //   1978: invokestatic 424	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1981: aload_2
    //   1982: ifnull +309 -> 2291
    //   1985: aload_2
    //   1986: invokeinterface 314 1 0
    //   1991: ifle +300 -> 2291
    //   1994: new 252	java/util/ArrayList
    //   1997: dup
    //   1998: invokespecial 253	java/util/ArrayList:<init>	()V
    //   2001: astore_1
    //   2002: aload_2
    //   2003: invokeinterface 318 1 0
    //   2008: invokeinterface 324 1 0
    //   2013: astore_2
    //   2014: aload_2
    //   2015: invokeinterface 329 1 0
    //   2020: ifeq +265 -> 2285
    //   2023: aload_2
    //   2024: invokeinterface 333 1 0
    //   2029: checkcast 335	java/util/Map$Entry
    //   2032: astore_3
    //   2033: new 608	com/tencent/feedback/proguard/K
    //   2036: dup
    //   2037: invokespecial 609	com/tencent/feedback/proguard/K:<init>	()V
    //   2040: astore 5
    //   2042: aload 5
    //   2044: aload_3
    //   2045: invokeinterface 340 1 0
    //   2050: checkcast 135	java/lang/String
    //   2053: putfield 610	com/tencent/feedback/proguard/K:a	Ljava/lang/String;
    //   2056: aload 5
    //   2058: aload_3
    //   2059: invokeinterface 345 1 0
    //   2064: checkcast 612	com/tencent/feedback/common/PlugInInfo
    //   2067: getfield 615	com/tencent/feedback/common/PlugInInfo:plugInVersion	Ljava/lang/String;
    //   2070: putfield 616	com/tencent/feedback/proguard/K:b	Ljava/lang/String;
    //   2073: aload 5
    //   2075: aload_3
    //   2076: invokeinterface 345 1 0
    //   2081: checkcast 612	com/tencent/feedback/common/PlugInInfo
    //   2084: getfield 619	com/tencent/feedback/common/PlugInInfo:plugInUUID	Ljava/lang/String;
    //   2087: putfield 620	com/tencent/feedback/proguard/K:c	Ljava/lang/String;
    //   2090: ldc_w 622
    //   2093: iconst_3
    //   2094: anewarray 42	java/lang/Object
    //   2097: dup
    //   2098: iconst_0
    //   2099: new 193	java/lang/StringBuilder
    //   2102: dup
    //   2103: invokespecial 194	java/lang/StringBuilder:<init>	()V
    //   2106: aload 5
    //   2108: getfield 610	com/tencent/feedback/proguard/K:a	Ljava/lang/String;
    //   2111: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2114: invokevirtual 203	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2117: aastore
    //   2118: dup
    //   2119: iconst_1
    //   2120: new 193	java/lang/StringBuilder
    //   2123: dup
    //   2124: invokespecial 194	java/lang/StringBuilder:<init>	()V
    //   2127: aload 5
    //   2129: getfield 616	com/tencent/feedback/proguard/K:b	Ljava/lang/String;
    //   2132: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2135: invokevirtual 203	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2138: aastore
    //   2139: dup
    //   2140: iconst_2
    //   2141: new 193	java/lang/StringBuilder
    //   2144: dup
    //   2145: invokespecial 194	java/lang/StringBuilder:<init>	()V
    //   2148: aload 5
    //   2150: getfield 620	com/tencent/feedback/proguard/K:c	Ljava/lang/String;
    //   2153: invokevirtual 200	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2156: invokevirtual 203	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2159: aastore
    //   2160: invokestatic 424	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   2163: aload_1
    //   2164: aload 5
    //   2166: invokevirtual 266	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   2169: pop
    //   2170: goto -156 -> 2014
    //   2173: astore_1
    //   2174: aload_1
    //   2175: invokevirtual 98	java/lang/Throwable:printStackTrace	()V
    //   2178: aconst_null
    //   2179: areturn
    //   2180: ldc_w 624
    //   2183: astore_3
    //   2184: goto -2116 -> 68
    //   2187: aload_2
    //   2188: invokevirtual 627	com/tencent/feedback/eup/e:z	()Z
    //   2191: ifeq +17 -> 2208
    //   2194: aload_2
    //   2195: invokevirtual 163	com/tencent/feedback/eup/e:c	()Z
    //   2198: ifeq +96 -> 2294
    //   2201: ldc_w 629
    //   2204: astore_3
    //   2205: goto -2137 -> 68
    //   2208: aload_2
    //   2209: invokevirtual 631	com/tencent/feedback/eup/e:b	()Z
    //   2212: ifeq +17 -> 2229
    //   2215: aload_2
    //   2216: invokevirtual 163	com/tencent/feedback/eup/e:c	()Z
    //   2219: ifeq +82 -> 2301
    //   2222: ldc_w 633
    //   2225: astore_3
    //   2226: goto -2158 -> 68
    //   2229: aload_2
    //   2230: invokevirtual 163	com/tencent/feedback/eup/e:c	()Z
    //   2233: ifeq +75 -> 2308
    //   2236: ldc_w 635
    //   2239: astore_3
    //   2240: goto -2172 -> 68
    //   2243: astore 5
    //   2245: aload 5
    //   2247: invokevirtual 98	java/lang/Throwable:printStackTrace	()V
    //   2250: goto -1496 -> 754
    //   2253: astore_3
    //   2254: aload_3
    //   2255: invokevirtual 98	java/lang/Throwable:printStackTrace	()V
    //   2258: ldc_w 637
    //   2261: astore_3
    //   2262: goto -987 -> 1275
    //   2265: aload_1
    //   2266: invokevirtual 355	java/util/ArrayList:size	()I
    //   2269: istore 8
    //   2271: goto -355 -> 1916
    //   2274: aload_2
    //   2275: invokeinterface 314 1 0
    //   2280: istore 8
    //   2282: goto -319 -> 1963
    //   2285: aload 4
    //   2287: aload_1
    //   2288: putfield 639	com/tencent/feedback/proguard/H:r	Ljava/util/ArrayList;
    //   2291: aload 4
    //   2293: areturn
    //   2294: ldc_w 641
    //   2297: astore_3
    //   2298: goto -2230 -> 68
    //   2301: ldc_w 643
    //   2304: astore_3
    //   2305: goto -2237 -> 68
    //   2308: ldc_w 645
    //   2311: astore_3
    //   2312: goto -2244 -> 68
    //   2315: ldc_w 647
    //   2318: astore_3
    //   2319: goto -1282 -> 1037
    //   2322: ldc_w 647
    //   2325: astore_1
    //   2326: goto -381 -> 1945
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	2329	0	this	g
    //   0	2329	1	paramContext	Context
    //   0	2329	2	parame	e
    //   67	2173	3	localObject1	Object
    //   2253	2	3	localThrowable1	Throwable
    //   2261	58	3	str	String
    //   75	2217	4	localH	H
    //   292	1873	5	localObject2	Object
    //   2243	3	5	localThrowable2	Throwable
    //   614	13	6	localIterator	Iterator
    //   693	13	6	localThrowable3	Throwable
    //   1011	816	6	localJ	com.tencent.feedback.proguard.J
    //   636	863	7	localObject3	Object
    //   1914	367	8	i	int
    // Exception table:
    //   from	to	target	type
    //   600	616	693	java/lang/Throwable
    //   616	690	693	java/lang/Throwable
    //   51	65	2173	java/lang/Throwable
    //   68	282	2173	java/lang/Throwable
    //   754	767	2173	java/lang/Throwable
    //   767	1037	2173	java/lang/Throwable
    //   1037	1264	2173	java/lang/Throwable
    //   1275	1366	2173	java/lang/Throwable
    //   1366	1405	2173	java/lang/Throwable
    //   1405	1444	2173	java/lang/Throwable
    //   1444	1466	2173	java/lang/Throwable
    //   1466	1488	2173	java/lang/Throwable
    //   1488	1909	2173	java/lang/Throwable
    //   1916	1934	2173	java/lang/Throwable
    //   1939	1945	2173	java/lang/Throwable
    //   1945	1956	2173	java/lang/Throwable
    //   1963	1981	2173	java/lang/Throwable
    //   1985	2014	2173	java/lang/Throwable
    //   2014	2170	2173	java/lang/Throwable
    //   2187	2201	2173	java/lang/Throwable
    //   2208	2222	2173	java/lang/Throwable
    //   2229	2236	2173	java/lang/Throwable
    //   2245	2250	2173	java/lang/Throwable
    //   2254	2258	2173	java/lang/Throwable
    //   2265	2271	2173	java/lang/Throwable
    //   2274	2282	2173	java/lang/Throwable
    //   2285	2291	2173	java/lang/Throwable
    //   282	294	2243	java/lang/Throwable
    //   299	316	2243	java/lang/Throwable
    //   316	349	2243	java/lang/Throwable
    //   354	371	2243	java/lang/Throwable
    //   371	395	2243	java/lang/Throwable
    //   400	417	2243	java/lang/Throwable
    //   417	443	2243	java/lang/Throwable
    //   443	462	2243	java/lang/Throwable
    //   467	484	2243	java/lang/Throwable
    //   484	509	2243	java/lang/Throwable
    //   514	531	2243	java/lang/Throwable
    //   531	550	2243	java/lang/Throwable
    //   555	572	2243	java/lang/Throwable
    //   572	600	2243	java/lang/Throwable
    //   695	710	2243	java/lang/Throwable
    //   710	754	2243	java/lang/Throwable
    //   1264	1275	2253	java/lang/Throwable
  }
  
  private I a(Context paramContext, List<e> paramList, String paramString)
  {
    if ((paramContext == null) || (paramList == null) || (paramList.size() <= 0))
    {
      com.tencent.feedback.common.e.c("rqdp{  params!}", new Object[0]);
      paramString = null;
    }
    ArrayList localArrayList;
    Object localObject;
    do
    {
      return paramString;
      for (;;)
      {
        e locale;
        try
        {
          paramString = new ArrayList();
          localArrayList = new ArrayList();
          localObject = paramList.iterator();
          if (!((Iterator)localObject).hasNext()) {
            break;
          }
          locale = (e)((Iterator)localObject).next();
          if (!c.a(paramContext).B().equals(locale.Q()))
          {
            com.tencent.feedback.common.e.c("updated drop it", new Object[0]);
            localArrayList.add(locale);
            continue;
          }
          localH = a(paramContext, locale);
        }
        catch (Throwable paramContext)
        {
          paramContext.printStackTrace();
          return null;
        }
        H localH;
        if (localH != null) {
          paramString.add(localH);
        } else {
          localArrayList.add(locale);
        }
      }
      localObject = new I();
      ((I)localObject).a = paramString;
      paramString = (String)localObject;
    } while (localArrayList.size() <= 0);
    com.tencent.feedback.common.e.c("rqdp{ delete error eup} %d", new Object[] { Integer.valueOf(b.a(paramContext, localArrayList)) });
    paramList.removeAll(localArrayList);
    return (I)localObject;
  }
  
  private static void a(List<e> paramList)
  {
    if (paramList != null)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        e locale = (e)paramList.next();
        locale.a(locale.l() + 1);
      }
    }
  }
  
  private static ArrayList<E> b(Context paramContext)
  {
    try
    {
      Object localObject2 = c.a(paramContext).A();
      Object localObject1 = localObject2;
      if (localObject2 == null)
      {
        com.tencent.feedback.common.e.b("no setted solist from db", new Object[0]);
        localObject1 = l.a(paramContext, null, 1, 50);
      }
      if ((localObject1 != null) && (((List)localObject1).size() > 0))
      {
        paramContext = new ArrayList();
        localObject1 = ((List)localObject1).iterator();
      }
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (o)((Iterator)localObject1).next();
        E localE = new E();
        localE.b = ((o)localObject2).f();
        localE.a = ((o)localObject2).a();
        localE.c = ((o)localObject2).d();
        paramContext.add(localE);
        com.tencent.feedback.common.e.b("up %s %s %s", new Object[] { localE.a, localE.b, localE.c });
        continue;
        return null;
      }
    }
    catch (Throwable paramContext)
    {
      paramContext.printStackTrace();
      com.tencent.feedback.common.e.d("rqdp{  Error: lb pack fail!}", new Object[0]);
    }
    return paramContext;
  }
  
  private List<e> b(Context paramContext, int paramInt)
  {
    com.tencent.feedback.common.e.e("rqdp{  get MN:}%d", new Object[] { Integer.valueOf(paramInt) });
    if ((paramContext == null) || (paramInt <= 0))
    {
      com.tencent.feedback.common.e.c("rqdp{  params!}", new Object[0]);
      return null;
    }
    try
    {
      List localList = b.a(paramContext, paramInt, "desc", 1, null, -1, -1, -1, 3, -1L, -1L, null);
      Object localObject = localList;
      if (localList == null) {
        localObject = new ArrayList();
      }
      if (((List)localObject).size() < paramInt)
      {
        localList = b.a(paramContext, paramInt - ((List)localObject).size(), "desc", 2, null, -1, -1, -1, 3, -1L, -1L, null);
        if ((localList != null) && (localList.size() > 0)) {
          ((List)localObject).addAll(localList);
        }
      }
      a((List)localObject);
      b.b(paramContext, (List)localObject);
      return (List<e>)localObject;
    }
    catch (Throwable paramContext)
    {
      paramContext.printStackTrace();
    }
    return null;
  }
  
  public final C a()
  {
    Object localObject5 = null;
    for (;;)
    {
      boolean bool;
      try
      {
        if (this.f != null)
        {
          localObject1 = this.f;
          return (C)localObject1;
        }
        localObject6 = f.k();
        localObject1 = localObject5;
        if (localObject6 == null) {
          continue;
        }
        bool = ((f)localObject6).a();
        localObject1 = localObject5;
        if (!bool) {
          continue;
        }
      }
      finally
      {
        try
        {
          Object localObject1 = f.k().r();
          this.g = null;
          try
          {
            bool = ((CrashStrategyBean)localObject1).isMerged();
            if (!com.tencent.feedback.common.g.a(this.c)) {
              break label237;
            }
            i = ((CrashStrategyBean)localObject1).getMaxUploadNum_Wifi();
            if (bool) {
              break label246;
            }
            com.tencent.feedback.common.e.f("rqdp{  not merge:}", new Object[0]);
            this.g = b(this.c, i);
            if ((this.g != null) && (this.g.size() > 0)) {
              break label273;
            }
            com.tencent.feedback.common.e.c("rqdp{  empty eup!}", new Object[0]);
            localObject1 = localObject5;
          }
          catch (Throwable localThrowable1)
          {
            localThrowable1.printStackTrace();
            localObject2 = localObject5;
          }
          if (this.g == null) {
            continue;
          }
          Object localObject2 = localObject5;
          if (this.g.size() <= 0) {
            continue;
          }
          com.tencent.feedback.common.e.c("rqdp{ eup error remove} %d", new Object[] { Integer.valueOf(b.a(this.c, this.g)) });
          this.g = null;
          localObject2 = localObject5;
        }
        catch (Throwable localThrowable2)
        {
          localThrowable2.printStackTrace();
          com.tencent.feedback.common.e.d("rqdp{  imposiable} %s", new Object[] { localThrowable2.toString() });
          localObject4 = localObject5;
        }
        localObject3 = finally;
      }
      continue;
      label237:
      int i = ((CrashStrategyBean)localObject4).getMaxUploadNum_GPRS();
      continue;
      label246:
      com.tencent.feedback.common.e.f("rqdp{  in merge:}", new Object[0]);
      this.g = a(this.c, i);
      continue;
      label273:
      com.tencent.feedback.common.e.f("rqdp{  pack n:}%d ,isM:%b", new Object[] { Integer.valueOf(this.g.size()), Boolean.valueOf(bool) });
      Object localObject6 = a(this.c, this.g, null);
      Object localObject4 = localObject5;
      if (localObject6 != null)
      {
        localObject4 = ((I)localObject6).a();
        if (localObject4 == null)
        {
          com.tencent.feedback.common.e.c("rqdp{  empty edatas!}", new Object[0]);
          localObject4 = localObject5;
        }
        else
        {
          this.f = a(this.c, this.a, (byte[])localObject4);
          localObject4 = this.f;
        }
      }
    }
  }
  
  protected final List<e> a(Context paramContext, int paramInt)
  {
    com.tencent.feedback.common.e.e("rqdp{  getEupInMe}", new Object[0]);
    if ((paramContext == null) || (paramInt <= 0))
    {
      com.tencent.feedback.common.e.d("rqdp{  params!}", new Object[0]);
      return null;
    }
    try
    {
      long l = a.b();
      ArrayList localArrayList = new ArrayList();
      List localList = b.a(paramContext, paramInt, "desc", -1, null, -1, -1, -1, 3, l, -1L, Boolean.valueOf(false));
      if ((localList != null) && (localList.size() > 0))
      {
        com.tencent.feedback.common.e.b("rqdp{  tdeup ge c=1, n:}%d", new Object[] { Integer.valueOf(localList.size()) });
        localArrayList.addAll(localList);
        localList.clear();
      }
      if (localArrayList.size() < paramInt)
      {
        localList = b.a(paramContext, paramInt, "desc", -1, null, 2, -1, -1, 3, -1L, l, null);
        if ((localList != null) && (localList.size() > 0))
        {
          com.tencent.feedback.common.e.b("rqdp{  yeseup c>=2,n:}%d" + localList.size(), new Object[0]);
          localArrayList.addAll(localList);
          localList.clear();
        }
      }
      if (localArrayList.size() < paramInt)
      {
        localList = b.a(paramContext, paramInt, "desc", -1, null, 0, 1, -1, -1, 3L, l, Boolean.valueOf(false));
        if ((localList != null) && (localList.size() > 0))
        {
          com.tencent.feedback.common.e.b("rqdp{  yeseup c>=2,n:}%d" + localList.size(), new Object[0]);
          localArrayList.addAll(localList);
          localList.clear();
        }
      }
      a(localArrayList);
      b.b(paramContext, localArrayList);
      return localArrayList;
    }
    catch (Throwable paramContext)
    {
      paramContext.printStackTrace();
    }
    return null;
  }
  
  /* Error */
  public final void done(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload_1
    //   3: ifeq +137 -> 140
    //   6: ldc_w 809
    //   9: astore_2
    //   10: ldc_w 811
    //   13: iconst_1
    //   14: anewarray 42	java/lang/Object
    //   17: dup
    //   18: iconst_0
    //   19: aload_2
    //   20: aastore
    //   21: invokestatic 714	com/tencent/feedback/common/e:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   24: aload_0
    //   25: getfield 29	com/tencent/feedback/eup/g:g	Ljava/util/List;
    //   28: astore_2
    //   29: aload_2
    //   30: ifnull +195 -> 225
    //   33: iload_1
    //   34: ifeq +191 -> 225
    //   37: invokestatic 736	com/tencent/feedback/eup/f:k	()Lcom/tencent/feedback/eup/f;
    //   40: invokevirtual 741	com/tencent/feedback/eup/f:r	()Lcom/tencent/feedback/eup/CrashStrategyBean;
    //   43: invokevirtual 746	com/tencent/feedback/eup/CrashStrategyBean:isMerged	()Z
    //   46: istore_1
    //   47: iload_1
    //   48: ifeq +190 -> 238
    //   51: invokestatic 792	com/tencent/feedback/proguard/a:b	()J
    //   54: lstore 6
    //   56: aload_0
    //   57: getfield 29	com/tencent/feedback/eup/g:g	Ljava/util/List;
    //   60: invokeinterface 652 1 0
    //   65: astore_2
    //   66: new 252	java/util/ArrayList
    //   69: dup
    //   70: invokespecial 253	java/util/ArrayList:<init>	()V
    //   73: astore_3
    //   74: aload_2
    //   75: invokeinterface 329 1 0
    //   80: ifeq +77 -> 157
    //   83: aload_2
    //   84: invokeinterface 333 1 0
    //   89: checkcast 159	com/tencent/feedback/eup/e
    //   92: astore 4
    //   94: aload 4
    //   96: invokevirtual 188	com/tencent/feedback/eup/e:i	()J
    //   99: lload 6
    //   101: lcmp
    //   102: ifle -28 -> 74
    //   105: aload 4
    //   107: iconst_1
    //   108: invokevirtual 813	com/tencent/feedback/eup/e:d	(Z)V
    //   111: aload 4
    //   113: iconst_0
    //   114: invokevirtual 683	com/tencent/feedback/eup/e:a	(I)V
    //   117: aload_3
    //   118: aload 4
    //   120: invokeinterface 814 2 0
    //   125: pop
    //   126: aload_2
    //   127: invokeinterface 817 1 0
    //   132: goto -58 -> 74
    //   135: astore_2
    //   136: aload_0
    //   137: monitorexit
    //   138: aload_2
    //   139: athrow
    //   140: ldc_w 819
    //   143: astore_2
    //   144: goto -134 -> 10
    //   147: astore_2
    //   148: aload_2
    //   149: invokevirtual 98	java/lang/Throwable:printStackTrace	()V
    //   152: iconst_0
    //   153: istore_1
    //   154: goto -107 -> 47
    //   157: aload_0
    //   158: getfield 749	com/tencent/feedback/eup/g:c	Landroid/content/Context;
    //   161: aload_3
    //   162: invokestatic 729	com/tencent/feedback/eup/b:b	(Landroid/content/Context;Ljava/util/List;)Z
    //   165: istore_1
    //   166: ldc_w 821
    //   169: iconst_2
    //   170: anewarray 42	java/lang/Object
    //   173: dup
    //   174: iconst_0
    //   175: aload_0
    //   176: getfield 29	com/tencent/feedback/eup/g:g	Ljava/util/List;
    //   179: invokeinterface 651 1 0
    //   184: invokestatic 122	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   187: aastore
    //   188: dup
    //   189: iconst_1
    //   190: iload_1
    //   191: invokestatic 168	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   194: aastore
    //   195: invokestatic 424	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   198: ldc_w 823
    //   201: iconst_1
    //   202: anewarray 42	java/lang/Object
    //   205: dup
    //   206: iconst_0
    //   207: aload_0
    //   208: getfield 749	com/tencent/feedback/eup/g:c	Landroid/content/Context;
    //   211: aload_0
    //   212: getfield 29	com/tencent/feedback/eup/g:g	Ljava/util/List;
    //   215: invokestatic 672	com/tencent/feedback/eup/b:a	(Landroid/content/Context;Ljava/util/List;)I
    //   218: invokestatic 122	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   221: aastore
    //   222: invokestatic 424	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   225: aload_0
    //   226: aconst_null
    //   227: putfield 27	com/tencent/feedback/eup/g:f	Lcom/tencent/feedback/proguard/C;
    //   230: aload_0
    //   231: aconst_null
    //   232: putfield 29	com/tencent/feedback/eup/g:g	Ljava/util/List;
    //   235: aload_0
    //   236: monitorexit
    //   237: return
    //   238: aload_0
    //   239: getfield 749	com/tencent/feedback/eup/g:c	Landroid/content/Context;
    //   242: aload_0
    //   243: getfield 29	com/tencent/feedback/eup/g:g	Ljava/util/List;
    //   246: invokestatic 672	com/tencent/feedback/eup/b:a	(Landroid/content/Context;Ljava/util/List;)I
    //   249: istore 5
    //   251: new 193	java/lang/StringBuilder
    //   254: dup
    //   255: ldc_w 825
    //   258: invokespecial 800	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   261: iload 5
    //   263: invokevirtual 803	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   266: invokevirtual 203	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   269: iconst_0
    //   270: anewarray 42	java/lang/Object
    //   273: invokestatic 424	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   276: goto -51 -> 225
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	279	0	this	g
    //   0	279	1	paramBoolean	boolean
    //   9	118	2	localObject1	Object
    //   135	4	2	localObject2	Object
    //   143	1	2	str	String
    //   147	2	2	localThrowable	Throwable
    //   73	89	3	localArrayList	ArrayList
    //   92	27	4	locale	e
    //   249	13	5	i	int
    //   54	46	6	l	long
    // Exception table:
    //   from	to	target	type
    //   10	29	135	finally
    //   37	47	135	finally
    //   51	74	135	finally
    //   74	132	135	finally
    //   148	152	135	finally
    //   157	225	135	finally
    //   225	235	135	finally
    //   238	276	135	finally
    //   37	47	147	java/lang/Throwable
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\eup\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */