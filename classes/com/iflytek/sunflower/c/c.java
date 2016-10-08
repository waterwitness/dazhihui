package com.iflytek.sunflower.c;

import java.security.MessageDigest;

public class c
{
  public static String a(String paramString)
  {
    int j = 0;
    try
    {
      Object localObject = MessageDigest.getInstance("MD5");
      paramString = paramString.toCharArray();
      byte[] arrayOfByte = new byte[paramString.length];
      int i = 0;
      while (i < paramString.length)
      {
        arrayOfByte[i] = ((byte)paramString[i]);
        i += 1;
      }
      paramString = ((MessageDigest)localObject).digest(arrayOfByte);
      localObject = new StringBuffer();
      i = j;
      while (i < paramString.length)
      {
        j = paramString[i] & 0xFF;
        if (j < 16) {
          ((StringBuffer)localObject).append("0");
        }
        ((StringBuffer)localObject).append(Integer.toHexString(j));
        i += 1;
      }
      paramString = ((StringBuffer)localObject).toString();
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
        paramString = "";
      }
    }
    finally {}
    return paramString;
  }
  
  /* Error */
  public static byte[] a(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore 4
    //   5: aconst_null
    //   6: astore_2
    //   7: aload_0
    //   8: ifnonnull +7 -> 15
    //   11: aload_2
    //   12: astore_1
    //   13: aload_1
    //   14: areturn
    //   15: new 58	java/io/ByteArrayOutputStream
    //   18: dup
    //   19: invokespecial 59	java/io/ByteArrayOutputStream:<init>	()V
    //   22: astore 5
    //   24: new 61	java/util/zip/GZIPOutputStream
    //   27: dup
    //   28: aload 5
    //   30: invokespecial 64	java/util/zip/GZIPOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   33: astore_3
    //   34: aload_3
    //   35: astore_1
    //   36: aload 4
    //   38: astore_2
    //   39: aload_3
    //   40: aload_0
    //   41: invokevirtual 68	java/util/zip/GZIPOutputStream:write	([B)V
    //   44: aload_3
    //   45: astore_1
    //   46: aload 4
    //   48: astore_2
    //   49: aload_3
    //   50: invokevirtual 71	java/util/zip/GZIPOutputStream:finish	()V
    //   53: aload_3
    //   54: astore_1
    //   55: aload 4
    //   57: astore_2
    //   58: getstatic 77	android/os/Build$VERSION:SDK_INT	I
    //   61: bipush 19
    //   63: if_icmpge +12 -> 75
    //   66: aload_3
    //   67: astore_1
    //   68: aload 4
    //   70: astore_2
    //   71: aload_3
    //   72: invokevirtual 80	java/util/zip/GZIPOutputStream:flush	()V
    //   75: aload_3
    //   76: astore_1
    //   77: aload 4
    //   79: astore_2
    //   80: aload 5
    //   82: invokevirtual 84	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   85: astore_0
    //   86: iconst_0
    //   87: istore 6
    //   89: aload_3
    //   90: astore_1
    //   91: aload_0
    //   92: astore_2
    //   93: iload 6
    //   95: aload_0
    //   96: arraylength
    //   97: if_icmpge +23 -> 120
    //   100: aload_0
    //   101: iload 6
    //   103: aload_0
    //   104: iload 6
    //   106: baload
    //   107: iconst_5
    //   108: ixor
    //   109: i2b
    //   110: bastore
    //   111: iload 6
    //   113: iconst_1
    //   114: iadd
    //   115: istore 6
    //   117: goto -28 -> 89
    //   120: aload_3
    //   121: ifnull +7 -> 128
    //   124: aload_3
    //   125: invokevirtual 87	java/util/zip/GZIPOutputStream:close	()V
    //   128: aload_0
    //   129: astore_1
    //   130: aload 5
    //   132: ifnull -119 -> 13
    //   135: aload 5
    //   137: invokevirtual 88	java/io/ByteArrayOutputStream:close	()V
    //   140: aload_0
    //   141: areturn
    //   142: astore_1
    //   143: aload_1
    //   144: invokevirtual 89	java/io/IOException:printStackTrace	()V
    //   147: aload_0
    //   148: areturn
    //   149: astore 4
    //   151: aconst_null
    //   152: astore_2
    //   153: aload_1
    //   154: astore_0
    //   155: aload_2
    //   156: astore_1
    //   157: aload 4
    //   159: invokevirtual 89	java/io/IOException:printStackTrace	()V
    //   162: aload_2
    //   163: ifnull +7 -> 170
    //   166: aload_2
    //   167: invokevirtual 87	java/util/zip/GZIPOutputStream:close	()V
    //   170: aload_0
    //   171: astore_1
    //   172: aload 5
    //   174: ifnull -161 -> 13
    //   177: aload 5
    //   179: invokevirtual 88	java/io/ByteArrayOutputStream:close	()V
    //   182: aload_0
    //   183: areturn
    //   184: astore_1
    //   185: aload_1
    //   186: invokevirtual 89	java/io/IOException:printStackTrace	()V
    //   189: aload_0
    //   190: areturn
    //   191: astore_0
    //   192: aconst_null
    //   193: astore_1
    //   194: aload_1
    //   195: ifnull +7 -> 202
    //   198: aload_1
    //   199: invokevirtual 87	java/util/zip/GZIPOutputStream:close	()V
    //   202: aload 5
    //   204: ifnull +8 -> 212
    //   207: aload 5
    //   209: invokevirtual 88	java/io/ByteArrayOutputStream:close	()V
    //   212: aload_0
    //   213: athrow
    //   214: astore_1
    //   215: aload_1
    //   216: invokevirtual 89	java/io/IOException:printStackTrace	()V
    //   219: goto -7 -> 212
    //   222: astore_0
    //   223: goto -29 -> 194
    //   226: astore 4
    //   228: aload_2
    //   229: astore_0
    //   230: aload_3
    //   231: astore_2
    //   232: goto -77 -> 155
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	235	0	paramArrayOfByte	byte[]
    //   1	129	1	localObject1	Object
    //   142	12	1	localIOException1	java.io.IOException
    //   156	16	1	localObject2	Object
    //   184	2	1	localIOException2	java.io.IOException
    //   193	6	1	localObject3	Object
    //   214	2	1	localIOException3	java.io.IOException
    //   6	226	2	localObject4	Object
    //   33	198	3	localGZIPOutputStream	java.util.zip.GZIPOutputStream
    //   3	75	4	localObject5	Object
    //   149	9	4	localIOException4	java.io.IOException
    //   226	1	4	localIOException5	java.io.IOException
    //   22	186	5	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   87	29	6	i	int
    // Exception table:
    //   from	to	target	type
    //   124	128	142	java/io/IOException
    //   135	140	142	java/io/IOException
    //   24	34	149	java/io/IOException
    //   166	170	184	java/io/IOException
    //   177	182	184	java/io/IOException
    //   24	34	191	finally
    //   198	202	214	java/io/IOException
    //   207	212	214	java/io/IOException
    //   39	44	222	finally
    //   49	53	222	finally
    //   58	66	222	finally
    //   71	75	222	finally
    //   80	86	222	finally
    //   93	100	222	finally
    //   157	162	222	finally
    //   39	44	226	java/io/IOException
    //   49	53	226	java/io/IOException
    //   58	66	226	java/io/IOException
    //   71	75	226	java/io/IOException
    //   80	86	226	java/io/IOException
    //   93	100	226	java/io/IOException
  }
  
  public static String b(String paramString)
  {
    return a(paramString).substring(8, 24);
  }
  
  /* Error */
  public static byte[] b(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 6
    //   3: aload_0
    //   4: ifnonnull +7 -> 11
    //   7: aconst_null
    //   8: astore_1
    //   9: aload_1
    //   10: areturn
    //   11: iload 6
    //   13: aload_0
    //   14: arraylength
    //   15: if_icmpge +23 -> 38
    //   18: aload_0
    //   19: iload 6
    //   21: aload_0
    //   22: iload 6
    //   24: baload
    //   25: iconst_5
    //   26: ixor
    //   27: i2b
    //   28: bastore
    //   29: iload 6
    //   31: iconst_1
    //   32: iadd
    //   33: istore 6
    //   35: goto -24 -> 11
    //   38: new 98	java/io/ByteArrayInputStream
    //   41: dup
    //   42: aload_0
    //   43: invokespecial 100	java/io/ByteArrayInputStream:<init>	([B)V
    //   46: astore 5
    //   48: new 58	java/io/ByteArrayOutputStream
    //   51: dup
    //   52: invokespecial 59	java/io/ByteArrayOutputStream:<init>	()V
    //   55: astore 4
    //   57: new 102	java/util/zip/GZIPInputStream
    //   60: dup
    //   61: aload 5
    //   63: invokespecial 105	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   66: astore_3
    //   67: aload_3
    //   68: astore_1
    //   69: sipush 1024
    //   72: newarray <illegal type>
    //   74: astore_0
    //   75: aload_3
    //   76: astore_1
    //   77: aload_3
    //   78: aload_0
    //   79: iconst_0
    //   80: aload_0
    //   81: arraylength
    //   82: invokevirtual 109	java/util/zip/GZIPInputStream:read	([BII)I
    //   85: istore 6
    //   87: iload 6
    //   89: iconst_m1
    //   90: if_icmpeq +65 -> 155
    //   93: aload_3
    //   94: astore_1
    //   95: aload 4
    //   97: aload_0
    //   98: iconst_0
    //   99: iload 6
    //   101: invokevirtual 112	java/io/ByteArrayOutputStream:write	([BII)V
    //   104: goto -29 -> 75
    //   107: astore_2
    //   108: aconst_null
    //   109: astore_0
    //   110: aload_3
    //   111: astore_1
    //   112: aload_2
    //   113: invokevirtual 89	java/io/IOException:printStackTrace	()V
    //   116: aload_3
    //   117: ifnull +7 -> 124
    //   120: aload_3
    //   121: invokevirtual 113	java/util/zip/GZIPInputStream:close	()V
    //   124: aload 5
    //   126: ifnull +8 -> 134
    //   129: aload 5
    //   131: invokevirtual 114	java/io/ByteArrayInputStream:close	()V
    //   134: aload_0
    //   135: astore_1
    //   136: aload 4
    //   138: ifnull -129 -> 9
    //   141: aload 4
    //   143: invokevirtual 88	java/io/ByteArrayOutputStream:close	()V
    //   146: aload_0
    //   147: areturn
    //   148: astore_1
    //   149: aload_1
    //   150: invokevirtual 89	java/io/IOException:printStackTrace	()V
    //   153: aload_0
    //   154: areturn
    //   155: aload_3
    //   156: astore_1
    //   157: aload 4
    //   159: invokevirtual 84	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   162: astore_0
    //   163: aload_3
    //   164: astore_1
    //   165: aload 4
    //   167: invokevirtual 115	java/io/ByteArrayOutputStream:flush	()V
    //   170: aload_3
    //   171: ifnull +7 -> 178
    //   174: aload_3
    //   175: invokevirtual 113	java/util/zip/GZIPInputStream:close	()V
    //   178: aload 5
    //   180: ifnull +8 -> 188
    //   183: aload 5
    //   185: invokevirtual 114	java/io/ByteArrayInputStream:close	()V
    //   188: aload_0
    //   189: astore_1
    //   190: aload 4
    //   192: ifnull -183 -> 9
    //   195: aload 4
    //   197: invokevirtual 88	java/io/ByteArrayOutputStream:close	()V
    //   200: aload_0
    //   201: areturn
    //   202: astore_1
    //   203: aload_1
    //   204: invokevirtual 89	java/io/IOException:printStackTrace	()V
    //   207: aload_0
    //   208: areturn
    //   209: astore_0
    //   210: aconst_null
    //   211: astore_1
    //   212: aload_1
    //   213: ifnull +7 -> 220
    //   216: aload_1
    //   217: invokevirtual 113	java/util/zip/GZIPInputStream:close	()V
    //   220: aload 5
    //   222: ifnull +8 -> 230
    //   225: aload 5
    //   227: invokevirtual 114	java/io/ByteArrayInputStream:close	()V
    //   230: aload 4
    //   232: ifnull +8 -> 240
    //   235: aload 4
    //   237: invokevirtual 88	java/io/ByteArrayOutputStream:close	()V
    //   240: aload_0
    //   241: athrow
    //   242: astore_1
    //   243: aload_1
    //   244: invokevirtual 89	java/io/IOException:printStackTrace	()V
    //   247: goto -7 -> 240
    //   250: astore_0
    //   251: goto -39 -> 212
    //   254: astore_2
    //   255: aconst_null
    //   256: astore_3
    //   257: aconst_null
    //   258: astore_0
    //   259: goto -149 -> 110
    //   262: astore_2
    //   263: goto -153 -> 110
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	266	0	paramArrayOfByte	byte[]
    //   8	128	1	localObject1	Object
    //   148	2	1	localIOException1	java.io.IOException
    //   156	34	1	localObject2	Object
    //   202	2	1	localIOException2	java.io.IOException
    //   211	6	1	localObject3	Object
    //   242	2	1	localIOException3	java.io.IOException
    //   107	6	2	localIOException4	java.io.IOException
    //   254	1	2	localIOException5	java.io.IOException
    //   262	1	2	localIOException6	java.io.IOException
    //   66	191	3	localGZIPInputStream	java.util.zip.GZIPInputStream
    //   55	181	4	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   46	180	5	localByteArrayInputStream	java.io.ByteArrayInputStream
    //   1	99	6	i	int
    // Exception table:
    //   from	to	target	type
    //   69	75	107	java/io/IOException
    //   77	87	107	java/io/IOException
    //   95	104	107	java/io/IOException
    //   157	163	107	java/io/IOException
    //   120	124	148	java/io/IOException
    //   129	134	148	java/io/IOException
    //   141	146	148	java/io/IOException
    //   174	178	202	java/io/IOException
    //   183	188	202	java/io/IOException
    //   195	200	202	java/io/IOException
    //   57	67	209	finally
    //   216	220	242	java/io/IOException
    //   225	230	242	java/io/IOException
    //   235	240	242	java/io/IOException
    //   69	75	250	finally
    //   77	87	250	finally
    //   95	104	250	finally
    //   112	116	250	finally
    //   157	163	250	finally
    //   165	170	250	finally
    //   57	67	254	java/io/IOException
    //   165	170	262	java/io/IOException
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\sunflower\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */