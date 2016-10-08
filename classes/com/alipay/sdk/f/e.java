package com.alipay.sdk.f;

import com.alipay.sdk.b.a;
import com.alipay.sdk.d.d;
import com.alipay.sdk.j.j;

public final class e
{
  private boolean a;
  private String b;
  
  public e(boolean paramBoolean)
  {
    this.a = paramBoolean;
    this.b = j.c();
  }
  
  /* Error */
  private static byte[] a(byte[]... paramVarArgs)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_0
    //   3: arraylength
    //   4: ifne +5 -> 9
    //   7: aconst_null
    //   8: areturn
    //   9: new 29	java/io/ByteArrayOutputStream
    //   12: dup
    //   13: invokespecial 30	java/io/ByteArrayOutputStream:<init>	()V
    //   16: astore_2
    //   17: new 32	java/io/DataOutputStream
    //   20: dup
    //   21: aload_2
    //   22: invokespecial 35	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   25: astore_1
    //   26: iload_3
    //   27: aload_0
    //   28: arraylength
    //   29: if_icmpge +50 -> 79
    //   32: aload_0
    //   33: iload_3
    //   34: aaload
    //   35: arraylength
    //   36: istore 4
    //   38: aload_1
    //   39: invokestatic 41	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   42: ldc 43
    //   44: iconst_1
    //   45: anewarray 4	java/lang/Object
    //   48: dup
    //   49: iconst_0
    //   50: iload 4
    //   52: invokestatic 49	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   55: aastore
    //   56: invokestatic 55	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   59: invokevirtual 59	java/lang/String:getBytes	()[B
    //   62: invokevirtual 63	java/io/DataOutputStream:write	([B)V
    //   65: aload_1
    //   66: aload_0
    //   67: iload_3
    //   68: aaload
    //   69: invokevirtual 63	java/io/DataOutputStream:write	([B)V
    //   72: iload_3
    //   73: iconst_1
    //   74: iadd
    //   75: istore_3
    //   76: goto -50 -> 26
    //   79: aload_1
    //   80: invokevirtual 66	java/io/DataOutputStream:flush	()V
    //   83: aload_2
    //   84: invokevirtual 69	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   87: astore_0
    //   88: aload_2
    //   89: invokevirtual 72	java/io/ByteArrayOutputStream:close	()V
    //   92: aload_1
    //   93: invokevirtual 73	java/io/DataOutputStream:close	()V
    //   96: aload_0
    //   97: areturn
    //   98: astore_1
    //   99: aload_0
    //   100: areturn
    //   101: astore_0
    //   102: aconst_null
    //   103: astore_0
    //   104: aconst_null
    //   105: astore_2
    //   106: aload_2
    //   107: ifnull +7 -> 114
    //   110: aload_2
    //   111: invokevirtual 72	java/io/ByteArrayOutputStream:close	()V
    //   114: aload_0
    //   115: ifnull -108 -> 7
    //   118: aload_0
    //   119: invokevirtual 73	java/io/DataOutputStream:close	()V
    //   122: aconst_null
    //   123: areturn
    //   124: astore_0
    //   125: aconst_null
    //   126: areturn
    //   127: astore_0
    //   128: aconst_null
    //   129: astore_2
    //   130: aconst_null
    //   131: astore_1
    //   132: aload_2
    //   133: ifnull +7 -> 140
    //   136: aload_2
    //   137: invokevirtual 72	java/io/ByteArrayOutputStream:close	()V
    //   140: aload_1
    //   141: ifnull +7 -> 148
    //   144: aload_1
    //   145: invokevirtual 73	java/io/DataOutputStream:close	()V
    //   148: aload_0
    //   149: athrow
    //   150: astore_2
    //   151: goto -59 -> 92
    //   154: astore_1
    //   155: goto -41 -> 114
    //   158: astore_2
    //   159: goto -19 -> 140
    //   162: astore_1
    //   163: goto -15 -> 148
    //   166: astore_0
    //   167: aconst_null
    //   168: astore_1
    //   169: goto -37 -> 132
    //   172: astore_0
    //   173: goto -41 -> 132
    //   176: astore_0
    //   177: aconst_null
    //   178: astore_0
    //   179: goto -73 -> 106
    //   182: astore_0
    //   183: aload_1
    //   184: astore_0
    //   185: goto -79 -> 106
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	188	0	paramVarArgs	byte[][]
    //   25	68	1	localDataOutputStream	java.io.DataOutputStream
    //   98	1	1	localException1	Exception
    //   131	14	1	localObject1	Object
    //   154	1	1	localException2	Exception
    //   162	1	1	localException3	Exception
    //   168	16	1	localObject2	Object
    //   16	121	2	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   150	1	2	localException4	Exception
    //   158	1	2	localException5	Exception
    //   1	75	3	i	int
    //   36	15	4	j	int
    // Exception table:
    //   from	to	target	type
    //   92	96	98	java/lang/Exception
    //   9	17	101	java/lang/Exception
    //   118	122	124	java/lang/Exception
    //   9	17	127	finally
    //   88	92	150	java/lang/Exception
    //   110	114	154	java/lang/Exception
    //   136	140	158	java/lang/Exception
    //   144	148	162	java/lang/Exception
    //   17	26	166	finally
    //   26	72	172	finally
    //   79	88	172	finally
    //   17	26	176	java/lang/Exception
    //   26	72	182	java/lang/Exception
    //   79	88	182	java/lang/Exception
  }
  
  /* Error */
  public final b a(c paramc)
  {
    // Byte code:
    //   0: new 76	java/io/ByteArrayInputStream
    //   3: dup
    //   4: aload_1
    //   5: getfield 81	com/alipay/sdk/f/c:b	[B
    //   8: invokespecial 83	java/io/ByteArrayInputStream:<init>	([B)V
    //   11: astore_3
    //   12: iconst_5
    //   13: newarray <illegal type>
    //   15: astore_2
    //   16: aload_3
    //   17: aload_2
    //   18: invokevirtual 87	java/io/ByteArrayInputStream:read	([B)I
    //   21: pop
    //   22: new 51	java/lang/String
    //   25: dup
    //   26: aload_2
    //   27: invokespecial 88	java/lang/String:<init>	([B)V
    //   30: invokestatic 92	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   33: newarray <illegal type>
    //   35: astore_2
    //   36: aload_3
    //   37: aload_2
    //   38: invokevirtual 87	java/io/ByteArrayInputStream:read	([B)I
    //   41: pop
    //   42: new 51	java/lang/String
    //   45: dup
    //   46: aload_2
    //   47: invokespecial 88	java/lang/String:<init>	([B)V
    //   50: astore 4
    //   52: iconst_5
    //   53: newarray <illegal type>
    //   55: astore_2
    //   56: aload_3
    //   57: aload_2
    //   58: invokevirtual 87	java/io/ByteArrayInputStream:read	([B)I
    //   61: pop
    //   62: new 51	java/lang/String
    //   65: dup
    //   66: aload_2
    //   67: invokespecial 88	java/lang/String:<init>	([B)V
    //   70: invokestatic 92	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   73: istore 6
    //   75: iload 6
    //   77: ifle +159 -> 236
    //   80: iload 6
    //   82: newarray <illegal type>
    //   84: astore 5
    //   86: aload_3
    //   87: aload 5
    //   89: invokevirtual 87	java/io/ByteArrayInputStream:read	([B)I
    //   92: pop
    //   93: aload 5
    //   95: astore_2
    //   96: aload_0
    //   97: getfield 15	com/alipay/sdk/f/e:a	Z
    //   100: ifeq +13 -> 113
    //   103: aload_0
    //   104: getfield 23	com/alipay/sdk/f/e:b	Ljava/lang/String;
    //   107: aload 5
    //   109: invokestatic 97	com/alipay/sdk/d/e:b	(Ljava/lang/String;[B)[B
    //   112: astore_2
    //   113: aload_1
    //   114: getfield 98	com/alipay/sdk/f/c:a	Z
    //   117: ifeq +114 -> 231
    //   120: aload_2
    //   121: invokestatic 103	com/alipay/sdk/d/c:b	([B)[B
    //   124: astore_1
    //   125: new 51	java/lang/String
    //   128: dup
    //   129: aload_1
    //   130: invokespecial 88	java/lang/String:<init>	([B)V
    //   133: astore_1
    //   134: aload_3
    //   135: invokevirtual 104	java/io/ByteArrayInputStream:close	()V
    //   138: aload 4
    //   140: astore_2
    //   141: aload_2
    //   142: ifnonnull +53 -> 195
    //   145: aload_1
    //   146: ifnonnull +49 -> 195
    //   149: aconst_null
    //   150: areturn
    //   151: astore_2
    //   152: aload 4
    //   154: astore_2
    //   155: goto -14 -> 141
    //   158: astore_1
    //   159: aconst_null
    //   160: astore_3
    //   161: aconst_null
    //   162: astore_2
    //   163: aload_3
    //   164: ifnull +62 -> 226
    //   167: aload_3
    //   168: invokevirtual 104	java/io/ByteArrayInputStream:close	()V
    //   171: aconst_null
    //   172: astore_1
    //   173: goto -32 -> 141
    //   176: astore_1
    //   177: aconst_null
    //   178: astore_1
    //   179: goto -38 -> 141
    //   182: astore_1
    //   183: aconst_null
    //   184: astore_3
    //   185: aload_3
    //   186: ifnull +7 -> 193
    //   189: aload_3
    //   190: invokevirtual 104	java/io/ByteArrayInputStream:close	()V
    //   193: aload_1
    //   194: athrow
    //   195: new 106	com/alipay/sdk/f/b
    //   198: dup
    //   199: aload_2
    //   200: aload_1
    //   201: invokespecial 109	com/alipay/sdk/f/b:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   204: areturn
    //   205: astore_2
    //   206: goto -13 -> 193
    //   209: astore_1
    //   210: goto -25 -> 185
    //   213: astore_1
    //   214: aconst_null
    //   215: astore_2
    //   216: goto -53 -> 163
    //   219: astore_1
    //   220: aload 4
    //   222: astore_2
    //   223: goto -60 -> 163
    //   226: aconst_null
    //   227: astore_1
    //   228: goto -87 -> 141
    //   231: aload_2
    //   232: astore_1
    //   233: goto -108 -> 125
    //   236: aconst_null
    //   237: astore_1
    //   238: goto -104 -> 134
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	241	0	this	e
    //   0	241	1	paramc	c
    //   15	127	2	localObject1	Object
    //   151	1	2	localException1	Exception
    //   154	46	2	localObject2	Object
    //   205	1	2	localException2	Exception
    //   215	17	2	localObject3	Object
    //   11	179	3	localByteArrayInputStream	java.io.ByteArrayInputStream
    //   50	171	4	str	String
    //   84	24	5	arrayOfByte	byte[]
    //   73	8	6	i	int
    // Exception table:
    //   from	to	target	type
    //   134	138	151	java/lang/Exception
    //   0	12	158	java/lang/Exception
    //   167	171	176	java/lang/Exception
    //   0	12	182	finally
    //   189	193	205	java/lang/Exception
    //   12	52	209	finally
    //   52	75	209	finally
    //   80	93	209	finally
    //   96	113	209	finally
    //   113	125	209	finally
    //   125	134	209	finally
    //   12	52	213	java/lang/Exception
    //   52	75	219	java/lang/Exception
    //   80	93	219	java/lang/Exception
    //   96	113	219	java/lang/Exception
    //   113	125	219	java/lang/Exception
    //   125	134	219	java/lang/Exception
  }
  
  public final c a(b paramb, boolean paramBoolean)
  {
    arrayOfByte2 = paramb.a.getBytes();
    arrayOfByte1 = paramb.b.getBytes();
    paramb = arrayOfByte1;
    bool = paramBoolean;
    if (paramBoolean) {}
    try
    {
      paramb = com.alipay.sdk.d.c.a(arrayOfByte1);
      bool = paramBoolean;
    }
    catch (Exception paramb)
    {
      for (;;)
      {
        bool = false;
        paramb = arrayOfByte1;
        continue;
        paramb = a(new byte[][] { arrayOfByte2, paramb });
      }
    }
    if (this.a)
    {
      paramb = a(new byte[][] { arrayOfByte2, d.a(this.b, a.b), com.alipay.sdk.d.e.a(this.b, paramb) });
      return new c(bool, paramb);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\f\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */