package com.alipay.sdk.d;

public final class c
{
  /* Error */
  public static byte[] a(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 10	java/io/ByteArrayInputStream
    //   5: dup
    //   6: aload_0
    //   7: invokespecial 14	java/io/ByteArrayInputStream:<init>	([B)V
    //   10: astore_0
    //   11: new 16	java/io/ByteArrayOutputStream
    //   14: dup
    //   15: invokespecial 19	java/io/ByteArrayOutputStream:<init>	()V
    //   18: astore_1
    //   19: new 21	java/util/zip/GZIPOutputStream
    //   22: dup
    //   23: aload_1
    //   24: invokespecial 24	java/util/zip/GZIPOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   27: astore 4
    //   29: sipush 4096
    //   32: newarray <illegal type>
    //   34: astore_2
    //   35: aload_0
    //   36: aload_2
    //   37: invokevirtual 28	java/io/ByteArrayInputStream:read	([B)I
    //   40: istore 6
    //   42: iload 6
    //   44: iconst_m1
    //   45: if_icmpeq +53 -> 98
    //   48: aload 4
    //   50: aload_2
    //   51: iconst_0
    //   52: iload 6
    //   54: invokevirtual 32	java/util/zip/GZIPOutputStream:write	([BII)V
    //   57: goto -22 -> 35
    //   60: astore 5
    //   62: aload_0
    //   63: astore_2
    //   64: aload_1
    //   65: astore_3
    //   66: aload 4
    //   68: astore_1
    //   69: aload 5
    //   71: astore_0
    //   72: aload_2
    //   73: ifnull +7 -> 80
    //   76: aload_2
    //   77: invokevirtual 35	java/io/ByteArrayInputStream:close	()V
    //   80: aload_3
    //   81: ifnull +7 -> 88
    //   84: aload_3
    //   85: invokevirtual 36	java/io/ByteArrayOutputStream:close	()V
    //   88: aload_1
    //   89: ifnull +7 -> 96
    //   92: aload_1
    //   93: invokevirtual 37	java/util/zip/GZIPOutputStream:close	()V
    //   96: aload_0
    //   97: athrow
    //   98: aload 4
    //   100: invokevirtual 40	java/util/zip/GZIPOutputStream:flush	()V
    //   103: aload 4
    //   105: invokevirtual 43	java/util/zip/GZIPOutputStream:finish	()V
    //   108: aload_1
    //   109: invokevirtual 47	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   112: astore_2
    //   113: aload_0
    //   114: invokevirtual 35	java/io/ByteArrayInputStream:close	()V
    //   117: aload_1
    //   118: invokevirtual 36	java/io/ByteArrayOutputStream:close	()V
    //   121: aload 4
    //   123: invokevirtual 37	java/util/zip/GZIPOutputStream:close	()V
    //   126: aload_2
    //   127: areturn
    //   128: astore_0
    //   129: goto -12 -> 117
    //   132: astore_0
    //   133: goto -12 -> 121
    //   136: astore_0
    //   137: aload_2
    //   138: areturn
    //   139: astore_2
    //   140: goto -60 -> 80
    //   143: astore_2
    //   144: goto -56 -> 88
    //   147: astore_1
    //   148: goto -52 -> 96
    //   151: astore_0
    //   152: aconst_null
    //   153: astore_1
    //   154: aconst_null
    //   155: astore_2
    //   156: goto -84 -> 72
    //   159: astore 4
    //   161: aconst_null
    //   162: astore_1
    //   163: aload_0
    //   164: astore_2
    //   165: aload 4
    //   167: astore_0
    //   168: goto -96 -> 72
    //   171: astore 5
    //   173: aconst_null
    //   174: astore 4
    //   176: aload_1
    //   177: astore_3
    //   178: aload_0
    //   179: astore_2
    //   180: aload 5
    //   182: astore_0
    //   183: aload 4
    //   185: astore_1
    //   186: goto -114 -> 72
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	189	0	paramArrayOfByte	byte[]
    //   18	100	1	localObject1	Object
    //   147	1	1	localException1	Exception
    //   153	33	1	localObject2	Object
    //   34	104	2	arrayOfByte1	byte[]
    //   139	1	2	localException2	Exception
    //   143	1	2	localException3	Exception
    //   155	25	2	arrayOfByte2	byte[]
    //   1	177	3	localObject3	Object
    //   27	95	4	localGZIPOutputStream	java.util.zip.GZIPOutputStream
    //   159	7	4	localObject4	Object
    //   174	10	4	localObject5	Object
    //   60	10	5	localObject6	Object
    //   171	10	5	localObject7	Object
    //   40	13	6	i	int
    // Exception table:
    //   from	to	target	type
    //   29	35	60	finally
    //   35	42	60	finally
    //   48	57	60	finally
    //   98	113	60	finally
    //   113	117	128	java/lang/Exception
    //   117	121	132	java/lang/Exception
    //   121	126	136	java/lang/Exception
    //   76	80	139	java/lang/Exception
    //   84	88	143	java/lang/Exception
    //   92	96	147	java/lang/Exception
    //   2	11	151	finally
    //   11	19	159	finally
    //   19	29	171	finally
  }
  
  /* Error */
  public static byte[] b(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 10	java/io/ByteArrayInputStream
    //   5: dup
    //   6: aload_0
    //   7: invokespecial 14	java/io/ByteArrayInputStream:<init>	([B)V
    //   10: astore_0
    //   11: new 51	java/util/zip/GZIPInputStream
    //   14: dup
    //   15: aload_0
    //   16: invokespecial 54	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   19: astore_2
    //   20: sipush 4096
    //   23: newarray <illegal type>
    //   25: astore 4
    //   27: new 16	java/io/ByteArrayOutputStream
    //   30: dup
    //   31: invokespecial 19	java/io/ByteArrayOutputStream:<init>	()V
    //   34: astore_1
    //   35: aload_2
    //   36: aload 4
    //   38: iconst_0
    //   39: sipush 4096
    //   42: invokevirtual 57	java/util/zip/GZIPInputStream:read	([BII)I
    //   45: istore 5
    //   47: iload 5
    //   49: iconst_m1
    //   50: if_icmpeq +38 -> 88
    //   53: aload_1
    //   54: aload 4
    //   56: iconst_0
    //   57: iload 5
    //   59: invokevirtual 58	java/io/ByteArrayOutputStream:write	([BII)V
    //   62: goto -27 -> 35
    //   65: astore 4
    //   67: aload_1
    //   68: astore_3
    //   69: aload_0
    //   70: astore_1
    //   71: aload 4
    //   73: astore_0
    //   74: aload_3
    //   75: invokevirtual 36	java/io/ByteArrayOutputStream:close	()V
    //   78: aload_2
    //   79: invokevirtual 59	java/util/zip/GZIPInputStream:close	()V
    //   82: aload_1
    //   83: invokevirtual 35	java/io/ByteArrayInputStream:close	()V
    //   86: aload_0
    //   87: athrow
    //   88: aload_1
    //   89: invokevirtual 60	java/io/ByteArrayOutputStream:flush	()V
    //   92: aload_1
    //   93: invokevirtual 47	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   96: astore_3
    //   97: aload_1
    //   98: invokevirtual 36	java/io/ByteArrayOutputStream:close	()V
    //   101: aload_2
    //   102: invokevirtual 59	java/util/zip/GZIPInputStream:close	()V
    //   105: aload_0
    //   106: invokevirtual 35	java/io/ByteArrayInputStream:close	()V
    //   109: aload_3
    //   110: areturn
    //   111: astore_1
    //   112: goto -11 -> 101
    //   115: astore_1
    //   116: goto -11 -> 105
    //   119: astore_0
    //   120: aload_3
    //   121: areturn
    //   122: astore_3
    //   123: goto -45 -> 78
    //   126: astore_2
    //   127: goto -45 -> 82
    //   130: astore_1
    //   131: goto -45 -> 86
    //   134: astore_0
    //   135: aconst_null
    //   136: astore_2
    //   137: aconst_null
    //   138: astore_1
    //   139: goto -65 -> 74
    //   142: astore 4
    //   144: aconst_null
    //   145: astore_2
    //   146: aload_0
    //   147: astore_1
    //   148: aload 4
    //   150: astore_0
    //   151: goto -77 -> 74
    //   154: astore 4
    //   156: aload_0
    //   157: astore_1
    //   158: aload 4
    //   160: astore_0
    //   161: goto -87 -> 74
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	164	0	paramArrayOfByte	byte[]
    //   34	64	1	localObject1	Object
    //   111	1	1	localException1	Exception
    //   115	1	1	localException2	Exception
    //   130	1	1	localException3	Exception
    //   138	20	1	arrayOfByte1	byte[]
    //   19	83	2	localGZIPInputStream	java.util.zip.GZIPInputStream
    //   126	1	2	localException4	Exception
    //   136	10	2	localObject2	Object
    //   1	120	3	localObject3	Object
    //   122	1	3	localException5	Exception
    //   25	30	4	arrayOfByte2	byte[]
    //   65	7	4	localObject4	Object
    //   142	7	4	localObject5	Object
    //   154	5	4	localObject6	Object
    //   45	13	5	i	int
    // Exception table:
    //   from	to	target	type
    //   35	47	65	finally
    //   53	62	65	finally
    //   88	97	65	finally
    //   97	101	111	java/lang/Exception
    //   101	105	115	java/lang/Exception
    //   105	109	119	java/lang/Exception
    //   74	78	122	java/lang/Exception
    //   78	82	126	java/lang/Exception
    //   82	86	130	java/lang/Exception
    //   2	11	134	finally
    //   11	20	142	finally
    //   20	35	154	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\d\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */