package com.tencent.open.b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.tencent.open.utils.Global;

public class f
  extends SQLiteOpenHelper
{
  protected static final String[] a = { "key" };
  protected static f b;
  
  public f(Context paramContext)
  {
    super(paramContext, "sdk_report.db", null, 2);
  }
  
  public static f a()
  {
    try
    {
      if (b == null) {
        b = new f(Global.getContext());
      }
      f localf = b;
      return localf;
    }
    finally {}
  }
  
  /* Error */
  public java.util.List<java.io.Serializable> a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 42	java/util/ArrayList
    //   5: dup
    //   6: invokespecial 44	java/util/ArrayList:<init>	()V
    //   9: invokestatic 50	java/util/Collections:synchronizedList	(Ljava/util/List;)Ljava/util/List;
    //   12: astore 5
    //   14: aload_1
    //   15: invokestatic 56	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   18: istore 7
    //   20: iload 7
    //   22: ifeq +8 -> 30
    //   25: aload_0
    //   26: monitorexit
    //   27: aload 5
    //   29: areturn
    //   30: aload_0
    //   31: invokevirtual 60	com/tencent/open/b/f:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   34: astore 4
    //   36: aload 4
    //   38: ifnonnull +6 -> 44
    //   41: goto -16 -> 25
    //   44: aload 4
    //   46: ldc 62
    //   48: aconst_null
    //   49: ldc 64
    //   51: iconst_1
    //   52: anewarray 12	java/lang/String
    //   55: dup
    //   56: iconst_0
    //   57: aload_1
    //   58: aastore
    //   59: aconst_null
    //   60: aconst_null
    //   61: aconst_null
    //   62: invokevirtual 70	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   65: astore_1
    //   66: aload_1
    //   67: ifnull +99 -> 166
    //   70: aload_1
    //   71: invokeinterface 76 1 0
    //   76: ifle +90 -> 166
    //   79: aload_1
    //   80: invokeinterface 80 1 0
    //   85: pop
    //   86: new 82	java/io/ByteArrayInputStream
    //   89: dup
    //   90: aload_1
    //   91: aload_1
    //   92: ldc 84
    //   94: invokeinterface 88 2 0
    //   99: invokeinterface 92 2 0
    //   104: invokespecial 95	java/io/ByteArrayInputStream:<init>	([B)V
    //   107: astore 6
    //   109: new 97	java/io/ObjectInputStream
    //   112: dup
    //   113: aload 6
    //   115: invokespecial 100	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   118: astore_3
    //   119: aload_3
    //   120: invokevirtual 104	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   123: checkcast 106	java/io/Serializable
    //   126: astore_2
    //   127: aload_3
    //   128: ifnull +7 -> 135
    //   131: aload_3
    //   132: invokevirtual 109	java/io/ObjectInputStream:close	()V
    //   135: aload 6
    //   137: invokevirtual 110	java/io/ByteArrayInputStream:close	()V
    //   140: aload_2
    //   141: ifnull +12 -> 153
    //   144: aload 5
    //   146: aload_2
    //   147: invokeinterface 116 2 0
    //   152: pop
    //   153: aload_1
    //   154: invokeinterface 119 1 0
    //   159: istore 7
    //   161: iload 7
    //   163: ifne -77 -> 86
    //   166: aload_1
    //   167: ifnull +9 -> 176
    //   170: aload_1
    //   171: invokeinterface 120 1 0
    //   176: iconst_0
    //   177: ifeq +11 -> 188
    //   180: new 122	java/lang/NullPointerException
    //   183: dup
    //   184: invokespecial 123	java/lang/NullPointerException:<init>	()V
    //   187: athrow
    //   188: aload 4
    //   190: ifnull +8 -> 198
    //   193: aload 4
    //   195: invokevirtual 124	android/database/sqlite/SQLiteDatabase:close	()V
    //   198: goto -173 -> 25
    //   201: astore_2
    //   202: aconst_null
    //   203: astore_3
    //   204: aload_3
    //   205: ifnull +7 -> 212
    //   208: aload_3
    //   209: invokevirtual 109	java/io/ObjectInputStream:close	()V
    //   212: aload 6
    //   214: invokevirtual 110	java/io/ByteArrayInputStream:close	()V
    //   217: aconst_null
    //   218: astore_2
    //   219: goto -79 -> 140
    //   222: astore_2
    //   223: aconst_null
    //   224: astore_2
    //   225: goto -85 -> 140
    //   228: astore_2
    //   229: aconst_null
    //   230: astore_3
    //   231: aload_3
    //   232: ifnull +7 -> 239
    //   235: aload_3
    //   236: invokevirtual 109	java/io/ObjectInputStream:close	()V
    //   239: aload 6
    //   241: invokevirtual 110	java/io/ByteArrayInputStream:close	()V
    //   244: aload_2
    //   245: athrow
    //   246: astore_2
    //   247: ldc 126
    //   249: ldc -128
    //   251: aload_2
    //   252: invokestatic 133	com/tencent/open/a/f:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   255: aload_1
    //   256: ifnull +9 -> 265
    //   259: aload_1
    //   260: invokeinterface 120 1 0
    //   265: iconst_0
    //   266: ifeq +11 -> 277
    //   269: new 122	java/lang/NullPointerException
    //   272: dup
    //   273: invokespecial 123	java/lang/NullPointerException:<init>	()V
    //   276: athrow
    //   277: aload 4
    //   279: ifnull -81 -> 198
    //   282: aload 4
    //   284: invokevirtual 124	android/database/sqlite/SQLiteDatabase:close	()V
    //   287: goto -89 -> 198
    //   290: astore_1
    //   291: aload_0
    //   292: monitorexit
    //   293: aload_1
    //   294: athrow
    //   295: astore_1
    //   296: aload_1
    //   297: invokevirtual 136	java/io/IOException:printStackTrace	()V
    //   300: goto -112 -> 188
    //   303: astore_1
    //   304: aload_1
    //   305: invokevirtual 136	java/io/IOException:printStackTrace	()V
    //   308: goto -31 -> 277
    //   311: aload_1
    //   312: ifnull +9 -> 321
    //   315: aload_1
    //   316: invokeinterface 120 1 0
    //   321: iconst_0
    //   322: ifeq +11 -> 333
    //   325: new 122	java/lang/NullPointerException
    //   328: dup
    //   329: invokespecial 123	java/lang/NullPointerException:<init>	()V
    //   332: athrow
    //   333: aload 4
    //   335: ifnull +8 -> 343
    //   338: aload 4
    //   340: invokevirtual 124	android/database/sqlite/SQLiteDatabase:close	()V
    //   343: aload_2
    //   344: athrow
    //   345: astore_1
    //   346: aload_1
    //   347: invokevirtual 136	java/io/IOException:printStackTrace	()V
    //   350: goto -17 -> 333
    //   353: astore_3
    //   354: goto -219 -> 135
    //   357: astore_3
    //   358: goto -218 -> 140
    //   361: astore_2
    //   362: goto -150 -> 212
    //   365: astore_3
    //   366: goto -127 -> 239
    //   369: astore_3
    //   370: goto -126 -> 244
    //   373: astore_2
    //   374: goto -63 -> 311
    //   377: astore_2
    //   378: goto -67 -> 311
    //   381: astore_2
    //   382: aconst_null
    //   383: astore_1
    //   384: goto -137 -> 247
    //   387: astore_2
    //   388: goto -157 -> 231
    //   391: astore_2
    //   392: goto -188 -> 204
    //   395: astore_2
    //   396: aconst_null
    //   397: astore_1
    //   398: goto -87 -> 311
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	401	0	this	f
    //   0	401	1	paramString	String
    //   126	21	2	localSerializable	java.io.Serializable
    //   201	1	2	localException1	Exception
    //   218	1	2	localObject1	Object
    //   222	1	2	localIOException1	java.io.IOException
    //   224	1	2	localObject2	Object
    //   228	17	2	localObject3	Object
    //   246	98	2	localException2	Exception
    //   361	1	2	localIOException2	java.io.IOException
    //   373	1	2	localObject4	Object
    //   377	1	2	localObject5	Object
    //   381	1	2	localException3	Exception
    //   387	1	2	localObject6	Object
    //   391	1	2	localException4	Exception
    //   395	1	2	localObject7	Object
    //   118	118	3	localObjectInputStream	java.io.ObjectInputStream
    //   353	1	3	localIOException3	java.io.IOException
    //   357	1	3	localIOException4	java.io.IOException
    //   365	1	3	localIOException5	java.io.IOException
    //   369	1	3	localIOException6	java.io.IOException
    //   34	305	4	localSQLiteDatabase	SQLiteDatabase
    //   12	133	5	localList	java.util.List
    //   107	133	6	localByteArrayInputStream	java.io.ByteArrayInputStream
    //   18	144	7	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   109	119	201	java/lang/Exception
    //   212	217	222	java/io/IOException
    //   109	119	228	finally
    //   70	86	246	java/lang/Exception
    //   86	109	246	java/lang/Exception
    //   131	135	246	java/lang/Exception
    //   135	140	246	java/lang/Exception
    //   144	153	246	java/lang/Exception
    //   153	161	246	java/lang/Exception
    //   208	212	246	java/lang/Exception
    //   212	217	246	java/lang/Exception
    //   235	239	246	java/lang/Exception
    //   239	244	246	java/lang/Exception
    //   244	246	246	java/lang/Exception
    //   2	20	290	finally
    //   30	36	290	finally
    //   170	176	290	finally
    //   180	188	290	finally
    //   193	198	290	finally
    //   259	265	290	finally
    //   269	277	290	finally
    //   282	287	290	finally
    //   296	300	290	finally
    //   304	308	290	finally
    //   315	321	290	finally
    //   325	333	290	finally
    //   338	343	290	finally
    //   343	345	290	finally
    //   346	350	290	finally
    //   180	188	295	java/io/IOException
    //   269	277	303	java/io/IOException
    //   325	333	345	java/io/IOException
    //   131	135	353	java/io/IOException
    //   135	140	357	java/io/IOException
    //   208	212	361	java/io/IOException
    //   235	239	365	java/io/IOException
    //   239	244	369	java/io/IOException
    //   70	86	373	finally
    //   86	109	373	finally
    //   131	135	373	finally
    //   135	140	373	finally
    //   144	153	373	finally
    //   153	161	373	finally
    //   208	212	373	finally
    //   212	217	373	finally
    //   235	239	373	finally
    //   239	244	373	finally
    //   244	246	373	finally
    //   247	255	377	finally
    //   44	66	381	java/lang/Exception
    //   119	127	387	finally
    //   119	127	391	java/lang/Exception
    //   44	66	395	finally
  }
  
  /* Error */
  public void a(String paramString, java.util.List<java.io.Serializable> paramList)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aload_0
    //   4: monitorenter
    //   5: aload_2
    //   6: invokeinterface 142 1 0
    //   11: istore 9
    //   13: iload 9
    //   15: ifne +6 -> 21
    //   18: aload_0
    //   19: monitorexit
    //   20: return
    //   21: iload 9
    //   23: bipush 20
    //   25: if_icmpgt +154 -> 179
    //   28: aload_1
    //   29: invokestatic 56	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   32: ifne -14 -> 18
    //   35: aload_0
    //   36: aload_1
    //   37: invokevirtual 145	com/tencent/open/b/f:b	(Ljava/lang/String;)V
    //   40: aload_0
    //   41: invokevirtual 148	com/tencent/open/b/f:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   44: astore 5
    //   46: aload 5
    //   48: ifnull -30 -> 18
    //   51: aload 5
    //   53: invokevirtual 151	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   56: new 153	android/content/ContentValues
    //   59: dup
    //   60: invokespecial 154	android/content/ContentValues:<init>	()V
    //   63: astore 7
    //   65: iconst_0
    //   66: istore 10
    //   68: iload 10
    //   70: iload 9
    //   72: if_icmpge +187 -> 259
    //   75: aload_2
    //   76: iload 10
    //   78: invokeinterface 158 2 0
    //   83: checkcast 106	java/io/Serializable
    //   86: astore 8
    //   88: aload 8
    //   90: ifnull +75 -> 165
    //   93: aload 7
    //   95: ldc -96
    //   97: aload_1
    //   98: invokevirtual 164	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   101: new 166	java/io/ByteArrayOutputStream
    //   104: dup
    //   105: sipush 512
    //   108: invokespecial 169	java/io/ByteArrayOutputStream:<init>	(I)V
    //   111: astore 6
    //   113: new 171	java/io/ObjectOutputStream
    //   116: dup
    //   117: aload 6
    //   119: invokespecial 174	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   122: astore_3
    //   123: aload_3
    //   124: aload 8
    //   126: invokevirtual 178	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   129: aload_3
    //   130: ifnull +7 -> 137
    //   133: aload_3
    //   134: invokevirtual 179	java/io/ObjectOutputStream:close	()V
    //   137: aload 6
    //   139: invokevirtual 180	java/io/ByteArrayOutputStream:close	()V
    //   142: aload 7
    //   144: ldc 84
    //   146: aload 6
    //   148: invokevirtual 184	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   151: invokevirtual 187	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   154: aload 5
    //   156: ldc 62
    //   158: aconst_null
    //   159: aload 7
    //   161: invokevirtual 191	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   164: pop2
    //   165: aload 7
    //   167: invokevirtual 194	android/content/ContentValues:clear	()V
    //   170: iload 10
    //   172: iconst_1
    //   173: iadd
    //   174: istore 10
    //   176: goto -108 -> 68
    //   179: bipush 20
    //   181: istore 9
    //   183: goto -155 -> 28
    //   186: astore_3
    //   187: aconst_null
    //   188: astore_3
    //   189: aload_3
    //   190: ifnull +7 -> 197
    //   193: aload_3
    //   194: invokevirtual 179	java/io/ObjectOutputStream:close	()V
    //   197: aload 6
    //   199: invokevirtual 180	java/io/ByteArrayOutputStream:close	()V
    //   202: goto -60 -> 142
    //   205: astore_3
    //   206: goto -64 -> 142
    //   209: astore_1
    //   210: aload 4
    //   212: astore_2
    //   213: aload_2
    //   214: ifnull +7 -> 221
    //   217: aload_2
    //   218: invokevirtual 179	java/io/ObjectOutputStream:close	()V
    //   221: aload 6
    //   223: invokevirtual 180	java/io/ByteArrayOutputStream:close	()V
    //   226: aload_1
    //   227: athrow
    //   228: astore_1
    //   229: ldc 126
    //   231: ldc -60
    //   233: invokestatic 199	com/tencent/open/a/f:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   236: aload 5
    //   238: invokevirtual 202	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   241: aload 5
    //   243: ifnull -225 -> 18
    //   246: aload 5
    //   248: invokevirtual 124	android/database/sqlite/SQLiteDatabase:close	()V
    //   251: goto -233 -> 18
    //   254: astore_1
    //   255: aload_0
    //   256: monitorexit
    //   257: aload_1
    //   258: athrow
    //   259: aload 5
    //   261: invokevirtual 205	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   264: aload 5
    //   266: invokevirtual 202	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   269: aload 5
    //   271: ifnull -253 -> 18
    //   274: aload 5
    //   276: invokevirtual 124	android/database/sqlite/SQLiteDatabase:close	()V
    //   279: goto -261 -> 18
    //   282: astore_1
    //   283: aload 5
    //   285: invokevirtual 202	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   288: aload 5
    //   290: ifnull +8 -> 298
    //   293: aload 5
    //   295: invokevirtual 124	android/database/sqlite/SQLiteDatabase:close	()V
    //   298: aload_1
    //   299: athrow
    //   300: astore_3
    //   301: goto -164 -> 137
    //   304: astore_3
    //   305: goto -163 -> 142
    //   308: astore_3
    //   309: goto -112 -> 197
    //   312: astore_2
    //   313: goto -92 -> 221
    //   316: astore_2
    //   317: goto -91 -> 226
    //   320: astore_1
    //   321: aload_3
    //   322: astore_2
    //   323: goto -110 -> 213
    //   326: astore 8
    //   328: goto -139 -> 189
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	331	0	this	f
    //   0	331	1	paramString	String
    //   0	331	2	paramList	java.util.List<java.io.Serializable>
    //   122	12	3	localObjectOutputStream	java.io.ObjectOutputStream
    //   186	1	3	localIOException1	java.io.IOException
    //   188	6	3	localObject1	Object
    //   205	1	3	localIOException2	java.io.IOException
    //   300	1	3	localIOException3	java.io.IOException
    //   304	1	3	localIOException4	java.io.IOException
    //   308	14	3	localIOException5	java.io.IOException
    //   1	210	4	localObject2	Object
    //   44	250	5	localSQLiteDatabase	SQLiteDatabase
    //   111	111	6	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   63	103	7	localContentValues	android.content.ContentValues
    //   86	39	8	localSerializable	java.io.Serializable
    //   326	1	8	localIOException6	java.io.IOException
    //   11	171	9	i	int
    //   66	109	10	j	int
    // Exception table:
    //   from	to	target	type
    //   113	123	186	java/io/IOException
    //   197	202	205	java/io/IOException
    //   113	123	209	finally
    //   56	65	228	java/lang/Exception
    //   75	88	228	java/lang/Exception
    //   93	113	228	java/lang/Exception
    //   133	137	228	java/lang/Exception
    //   137	142	228	java/lang/Exception
    //   142	165	228	java/lang/Exception
    //   165	170	228	java/lang/Exception
    //   193	197	228	java/lang/Exception
    //   197	202	228	java/lang/Exception
    //   217	221	228	java/lang/Exception
    //   221	226	228	java/lang/Exception
    //   226	228	228	java/lang/Exception
    //   259	264	228	java/lang/Exception
    //   5	13	254	finally
    //   28	46	254	finally
    //   51	56	254	finally
    //   236	241	254	finally
    //   246	251	254	finally
    //   264	269	254	finally
    //   274	279	254	finally
    //   283	288	254	finally
    //   293	298	254	finally
    //   298	300	254	finally
    //   56	65	282	finally
    //   75	88	282	finally
    //   93	113	282	finally
    //   133	137	282	finally
    //   137	142	282	finally
    //   142	165	282	finally
    //   165	170	282	finally
    //   193	197	282	finally
    //   197	202	282	finally
    //   217	221	282	finally
    //   221	226	282	finally
    //   226	228	282	finally
    //   229	236	282	finally
    //   259	264	282	finally
    //   133	137	300	java/io/IOException
    //   137	142	304	java/io/IOException
    //   193	197	308	java/io/IOException
    //   217	221	312	java/io/IOException
    //   221	226	316	java/io/IOException
    //   123	129	320	finally
    //   123	129	326	java/io/IOException
  }
  
  /* Error */
  public void b(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokestatic 56	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   6: istore_3
    //   7: iload_3
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: invokevirtual 148	com/tencent/open/b/f:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   18: astore_2
    //   19: aload_2
    //   20: ifnull -9 -> 11
    //   23: aload_2
    //   24: ldc 62
    //   26: ldc 64
    //   28: iconst_1
    //   29: anewarray 12	java/lang/String
    //   32: dup
    //   33: iconst_0
    //   34: aload_1
    //   35: aastore
    //   36: invokevirtual 210	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   39: pop
    //   40: aload_2
    //   41: ifnull -30 -> 11
    //   44: aload_2
    //   45: invokevirtual 124	android/database/sqlite/SQLiteDatabase:close	()V
    //   48: goto -37 -> 11
    //   51: astore_1
    //   52: aload_0
    //   53: monitorexit
    //   54: aload_1
    //   55: athrow
    //   56: astore_1
    //   57: ldc 126
    //   59: ldc -44
    //   61: aload_1
    //   62: invokestatic 133	com/tencent/open/a/f:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   65: aload_2
    //   66: ifnull -55 -> 11
    //   69: aload_2
    //   70: invokevirtual 124	android/database/sqlite/SQLiteDatabase:close	()V
    //   73: goto -62 -> 11
    //   76: astore_1
    //   77: aload_2
    //   78: ifnull +7 -> 85
    //   81: aload_2
    //   82: invokevirtual 124	android/database/sqlite/SQLiteDatabase:close	()V
    //   85: aload_1
    //   86: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	87	0	this	f
    //   0	87	1	paramString	String
    //   18	64	2	localSQLiteDatabase	SQLiteDatabase
    //   6	2	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	51	finally
    //   14	19	51	finally
    //   44	48	51	finally
    //   69	73	51	finally
    //   81	85	51	finally
    //   85	87	51	finally
    //   23	40	56	java/lang/Exception
    //   23	40	76	finally
    //   57	65	76	finally
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS via_cgi_report( _id INTEGER PRIMARY KEY,key TEXT,type TEXT,blob BLOB);");
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS via_cgi_report");
    onCreate(paramSQLiteDatabase);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */