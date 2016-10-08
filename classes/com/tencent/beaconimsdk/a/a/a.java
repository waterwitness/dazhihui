package com.tencent.beaconimsdk.a.a;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

public final class a
{
  public long a = -1L;
  public byte[] b = null;
  private int c = -1;
  private int d = -1;
  private long e = -1L;
  private long f = 0L;
  
  public a() {}
  
  public a(long paramLong, byte[] paramArrayOfByte)
  {
    this.c = 1;
    this.d = 3;
    this.e = paramLong;
    this.b = paramArrayOfByte;
    if (paramArrayOfByte != null) {
      this.f = paramArrayOfByte.length;
    }
  }
  
  public static int a(Context paramContext, int[] paramArrayOfInt)
  {
    int i = -1;
    int j = 0;
    for (;;)
    {
      try
      {
        com.tencent.beaconimsdk.c.a.b(" AnalyticsDAO.delete() start", new Object[0]);
        if (paramContext == null)
        {
          com.tencent.beaconimsdk.c.a.a(" delete() context is null arg", new Object[0]);
          return i;
        }
        if (-1L > Long.MAX_VALUE)
        {
          i = 0;
        }
        else if ((paramArrayOfInt != null) && (paramArrayOfInt.length > 0))
        {
          String str = "";
          i = j;
          if (i < paramArrayOfInt.length)
          {
            str = str + " or _type = " + paramArrayOfInt[i];
            i += 1;
          }
          else
          {
            paramArrayOfInt = str.substring(4);
            paramArrayOfInt = "_time >= -1 and _time <= 9223372036854775807" + " and ( " + paramArrayOfInt + " )";
            com.tencent.beaconimsdk.c.a.b(" delete where: " + paramArrayOfInt, new Object[0]);
            try
            {
              i = c.a(paramContext).getWritableDatabase().delete("t_event", paramArrayOfInt, null);
              com.tencent.beaconimsdk.c.a.b(" deleted num: " + i, new Object[0]);
              com.tencent.beaconimsdk.c.a.b(" AnalyticsDAO.delete() end", new Object[0]);
              continue;
            }
            catch (Throwable paramContext)
            {
              com.tencent.beaconimsdk.c.a.b(paramContext.getMessage(), new Object[0]);
              com.tencent.beaconimsdk.c.a.b(" AnalyticsDAO.delete() end", new Object[0]);
              i = -1;
              continue;
            }
            finally
            {
              com.tencent.beaconimsdk.c.a.b(" AnalyticsDAO.delete() end", new Object[0]);
            }
          }
        }
        else
        {
          paramArrayOfInt = "_time >= -1 and _time <= 9223372036854775807";
        }
      }
      finally {}
    }
  }
  
  /* Error */
  public static int a(Context paramContext, Long[] paramArrayOfLong)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: iconst_0
    //   4: istore 5
    //   6: iconst_0
    //   7: istore 6
    //   9: ldc 2
    //   11: monitorenter
    //   12: ldc 111
    //   14: iconst_0
    //   15: anewarray 4	java/lang/Object
    //   18: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   21: aload_0
    //   22: ifnonnull +19 -> 41
    //   25: ldc 113
    //   27: iconst_0
    //   28: anewarray 4	java/lang/Object
    //   31: invokestatic 115	com/tencent/beaconimsdk/c/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   34: iconst_m1
    //   35: istore_3
    //   36: ldc 2
    //   38: monitorexit
    //   39: iload_3
    //   40: ireturn
    //   41: iload 6
    //   43: istore_3
    //   44: aload_1
    //   45: ifnull -9 -> 36
    //   48: aload_1
    //   49: arraylength
    //   50: istore 7
    //   52: iload 6
    //   54: istore_3
    //   55: iload 7
    //   57: ifle -21 -> 36
    //   60: iload 5
    //   62: istore_3
    //   63: aload_0
    //   64: invokestatic 89	com/tencent/beaconimsdk/a/a/c:a	(Landroid/content/Context;)Lcom/tencent/beaconimsdk/a/a/c;
    //   67: invokevirtual 93	com/tencent/beaconimsdk/a/a/c:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   70: astore_0
    //   71: iload 5
    //   73: istore_3
    //   74: new 117	java/lang/StringBuffer
    //   77: dup
    //   78: invokespecial 118	java/lang/StringBuffer:<init>	()V
    //   81: astore_2
    //   82: iconst_0
    //   83: istore 5
    //   85: iload 4
    //   87: istore_3
    //   88: iload 5
    //   90: aload_1
    //   91: arraylength
    //   92: if_icmpge +147 -> 239
    //   95: iload 4
    //   97: istore_3
    //   98: aload_1
    //   99: iload 5
    //   101: aaload
    //   102: invokevirtual 124	java/lang/Long:longValue	()J
    //   105: lstore 8
    //   107: iload 4
    //   109: istore_3
    //   110: aload_2
    //   111: new 53	java/lang/StringBuilder
    //   114: dup
    //   115: ldc 126
    //   117: invokespecial 84	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   120: lload 8
    //   122: invokevirtual 129	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   125: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   128: invokevirtual 132	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   131: pop
    //   132: iload 4
    //   134: istore_3
    //   135: iload 5
    //   137: ifle +235 -> 372
    //   140: iload 4
    //   142: istore_3
    //   143: iload 5
    //   145: bipush 25
    //   147: irem
    //   148: ifne +224 -> 372
    //   151: iload 4
    //   153: istore_3
    //   154: new 53	java/lang/StringBuilder
    //   157: dup
    //   158: ldc -122
    //   160: invokespecial 84	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   163: iload 5
    //   165: invokevirtual 63	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   168: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   171: iconst_0
    //   172: anewarray 4	java/lang/Object
    //   175: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   178: iload 4
    //   180: istore_3
    //   181: iload 4
    //   183: aload_0
    //   184: ldc 95
    //   186: aload_2
    //   187: iconst_4
    //   188: invokevirtual 135	java/lang/StringBuffer:substring	(I)Ljava/lang/String;
    //   191: aconst_null
    //   192: invokevirtual 101	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   195: iadd
    //   196: istore 4
    //   198: iload 4
    //   200: istore_3
    //   201: aload_2
    //   202: iconst_0
    //   203: invokevirtual 139	java/lang/StringBuffer:setLength	(I)V
    //   206: iload 4
    //   208: istore_3
    //   209: new 53	java/lang/StringBuilder
    //   212: dup
    //   213: ldc -115
    //   215: invokespecial 84	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   218: iload 4
    //   220: invokevirtual 63	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   223: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   226: iconst_0
    //   227: anewarray 4	java/lang/Object
    //   230: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   233: iload 4
    //   235: istore_3
    //   236: goto +136 -> 372
    //   239: iload 4
    //   241: istore 5
    //   243: iload 4
    //   245: istore_3
    //   246: aload_2
    //   247: invokevirtual 145	java/lang/StringBuffer:length	()I
    //   250: ifle +34 -> 284
    //   253: iload 4
    //   255: istore_3
    //   256: aload_0
    //   257: ldc 95
    //   259: aload_2
    //   260: iconst_4
    //   261: invokevirtual 135	java/lang/StringBuffer:substring	(I)Ljava/lang/String;
    //   264: aconst_null
    //   265: invokevirtual 101	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   268: istore 5
    //   270: iload 5
    //   272: iload 4
    //   274: iadd
    //   275: istore_3
    //   276: aload_2
    //   277: iconst_0
    //   278: invokevirtual 139	java/lang/StringBuffer:setLength	(I)V
    //   281: iload_3
    //   282: istore 5
    //   284: iload 5
    //   286: istore_3
    //   287: new 53	java/lang/StringBuilder
    //   290: dup
    //   291: ldc -109
    //   293: invokespecial 84	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   296: iload 5
    //   298: invokevirtual 63	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   301: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   304: iconst_0
    //   305: anewarray 4	java/lang/Object
    //   308: invokestatic 47	com/tencent/beaconimsdk/c/a:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   311: ldc -107
    //   313: iconst_0
    //   314: anewarray 4	java/lang/Object
    //   317: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   320: iload 5
    //   322: istore_3
    //   323: goto -287 -> 36
    //   326: astore_0
    //   327: ldc 2
    //   329: monitorexit
    //   330: aload_0
    //   331: athrow
    //   332: astore_0
    //   333: aload_0
    //   334: invokevirtual 108	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   337: iconst_0
    //   338: anewarray 4	java/lang/Object
    //   341: invokestatic 115	com/tencent/beaconimsdk/c/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   344: ldc -107
    //   346: iconst_0
    //   347: anewarray 4	java/lang/Object
    //   350: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   353: goto -317 -> 36
    //   356: astore_0
    //   357: ldc -107
    //   359: iconst_0
    //   360: anewarray 4	java/lang/Object
    //   363: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   366: aload_0
    //   367: athrow
    //   368: astore_0
    //   369: goto -36 -> 333
    //   372: iload 5
    //   374: iconst_1
    //   375: iadd
    //   376: istore 5
    //   378: iload_3
    //   379: istore 4
    //   381: goto -296 -> 85
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	384	0	paramContext	Context
    //   0	384	1	paramArrayOfLong	Long[]
    //   81	196	2	localStringBuffer	StringBuffer
    //   35	344	3	i	int
    //   1	379	4	j	int
    //   4	373	5	k	int
    //   7	46	6	m	int
    //   50	6	7	n	int
    //   105	16	8	l	long
    // Exception table:
    //   from	to	target	type
    //   12	21	326	finally
    //   25	34	326	finally
    //   48	52	326	finally
    //   311	320	326	finally
    //   344	353	326	finally
    //   357	368	326	finally
    //   63	71	332	java/lang/Throwable
    //   74	82	332	java/lang/Throwable
    //   88	95	332	java/lang/Throwable
    //   98	107	332	java/lang/Throwable
    //   110	132	332	java/lang/Throwable
    //   154	178	332	java/lang/Throwable
    //   181	198	332	java/lang/Throwable
    //   201	206	332	java/lang/Throwable
    //   209	233	332	java/lang/Throwable
    //   246	253	332	java/lang/Throwable
    //   256	270	332	java/lang/Throwable
    //   287	311	332	java/lang/Throwable
    //   63	71	356	finally
    //   74	82	356	finally
    //   88	95	356	finally
    //   98	107	356	finally
    //   110	132	356	finally
    //   154	178	356	finally
    //   181	198	356	finally
    //   201	206	356	finally
    //   209	233	356	finally
    //   246	253	356	finally
    //   256	270	356	finally
    //   276	281	356	finally
    //   287	311	356	finally
    //   333	344	356	finally
    //   276	281	368	java/lang/Throwable
  }
  
  /* Error */
  public static List a(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 2
    //   4: monitorenter
    //   5: ldc -102
    //   7: iconst_0
    //   8: anewarray 4	java/lang/Object
    //   11: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   14: aload_0
    //   15: ifnonnull +19 -> 34
    //   18: ldc -100
    //   20: iconst_0
    //   21: anewarray 4	java/lang/Object
    //   24: invokestatic 115	com/tencent/beaconimsdk/c/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   27: aconst_null
    //   28: astore_0
    //   29: ldc 2
    //   31: monitorexit
    //   32: aload_0
    //   33: areturn
    //   34: aload_0
    //   35: invokestatic 89	com/tencent/beaconimsdk/a/a/c:a	(Landroid/content/Context;)Lcom/tencent/beaconimsdk/a/a/c;
    //   38: invokevirtual 93	com/tencent/beaconimsdk/a/a/c:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   41: ldc -98
    //   43: aconst_null
    //   44: aconst_null
    //   45: aconst_null
    //   46: aconst_null
    //   47: aconst_null
    //   48: ldc -96
    //   50: ldc -94
    //   52: invokevirtual 166	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   55: astore_0
    //   56: aload_0
    //   57: invokeinterface 172 1 0
    //   62: ifeq +275 -> 337
    //   65: new 174	java/util/ArrayList
    //   68: dup
    //   69: invokespecial 175	java/util/ArrayList:<init>	()V
    //   72: astore_1
    //   73: aload_1
    //   74: astore_2
    //   75: aload_1
    //   76: aload_0
    //   77: aload_0
    //   78: ldc -79
    //   80: invokeinterface 181 2 0
    //   85: invokeinterface 185 2 0
    //   90: invokestatic 191	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   93: invokeinterface 197 2 0
    //   98: pop
    //   99: aload_1
    //   100: astore_2
    //   101: aload_1
    //   102: aload_0
    //   103: aload_0
    //   104: ldc -57
    //   106: invokeinterface 181 2 0
    //   111: invokeinterface 202 2 0
    //   116: invokeinterface 197 2 0
    //   121: pop
    //   122: aload_1
    //   123: astore_2
    //   124: aload_1
    //   125: aload_0
    //   126: aload_0
    //   127: ldc -52
    //   129: invokeinterface 181 2 0
    //   134: invokeinterface 208 2 0
    //   139: invokestatic 211	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   142: invokeinterface 197 2 0
    //   147: pop
    //   148: aload_1
    //   149: astore_2
    //   150: aload_1
    //   151: aload_0
    //   152: aload_0
    //   153: ldc -43
    //   155: invokeinterface 181 2 0
    //   160: invokeinterface 217 2 0
    //   165: invokeinterface 197 2 0
    //   170: pop
    //   171: aload_1
    //   172: astore_2
    //   173: aload_1
    //   174: aload_0
    //   175: aload_0
    //   176: ldc -37
    //   178: invokeinterface 181 2 0
    //   183: invokeinterface 185 2 0
    //   188: invokestatic 191	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   191: invokeinterface 197 2 0
    //   196: pop
    //   197: aload_1
    //   198: ifnull +14 -> 212
    //   201: aload_1
    //   202: astore_2
    //   203: ldc -35
    //   205: iconst_0
    //   206: anewarray 4	java/lang/Object
    //   209: invokestatic 47	com/tencent/beaconimsdk/c/a:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   212: aload_0
    //   213: ifnull +18 -> 231
    //   216: aload_0
    //   217: invokeinterface 224 1 0
    //   222: ifne +9 -> 231
    //   225: aload_0
    //   226: invokeinterface 227 1 0
    //   231: ldc -27
    //   233: iconst_0
    //   234: anewarray 4	java/lang/Object
    //   237: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   240: aload_1
    //   241: astore_0
    //   242: goto -213 -> 29
    //   245: astore_0
    //   246: ldc 2
    //   248: monitorexit
    //   249: aload_0
    //   250: athrow
    //   251: astore_0
    //   252: aconst_null
    //   253: astore_0
    //   254: aload_1
    //   255: ifnull +18 -> 273
    //   258: aload_1
    //   259: invokeinterface 224 1 0
    //   264: ifne +9 -> 273
    //   267: aload_1
    //   268: invokeinterface 227 1 0
    //   273: ldc -27
    //   275: iconst_0
    //   276: anewarray 4	java/lang/Object
    //   279: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   282: goto -253 -> 29
    //   285: aload_0
    //   286: ifnull +18 -> 304
    //   289: aload_0
    //   290: invokeinterface 224 1 0
    //   295: ifne +9 -> 304
    //   298: aload_0
    //   299: invokeinterface 227 1 0
    //   304: ldc -27
    //   306: iconst_0
    //   307: anewarray 4	java/lang/Object
    //   310: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   313: aload_1
    //   314: athrow
    //   315: astore_1
    //   316: goto -31 -> 285
    //   319: astore_1
    //   320: aconst_null
    //   321: astore_2
    //   322: aload_0
    //   323: astore_1
    //   324: aload_2
    //   325: astore_0
    //   326: goto -72 -> 254
    //   329: astore_1
    //   330: aload_0
    //   331: astore_1
    //   332: aload_2
    //   333: astore_0
    //   334: goto -80 -> 254
    //   337: aconst_null
    //   338: astore_1
    //   339: goto -142 -> 197
    //   342: astore_1
    //   343: aconst_null
    //   344: astore_0
    //   345: goto -60 -> 285
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	348	0	paramContext	Context
    //   1	313	1	localArrayList1	ArrayList
    //   315	1	1	localObject1	Object
    //   319	1	1	localException1	Exception
    //   323	1	1	localContext1	Context
    //   329	1	1	localException2	Exception
    //   331	8	1	localContext2	Context
    //   342	1	1	localObject2	Object
    //   74	259	2	localArrayList2	ArrayList
    // Exception table:
    //   from	to	target	type
    //   5	14	245	finally
    //   18	27	245	finally
    //   216	231	245	finally
    //   231	240	245	finally
    //   258	273	245	finally
    //   273	282	245	finally
    //   289	304	245	finally
    //   304	315	245	finally
    //   34	56	251	java/lang/Exception
    //   56	73	315	finally
    //   75	99	315	finally
    //   101	122	315	finally
    //   124	148	315	finally
    //   150	171	315	finally
    //   173	197	315	finally
    //   203	212	315	finally
    //   56	73	319	java/lang/Exception
    //   75	99	329	java/lang/Exception
    //   101	122	329	java/lang/Exception
    //   124	148	329	java/lang/Exception
    //   150	171	329	java/lang/Exception
    //   173	197	329	java/lang/Exception
    //   203	212	329	java/lang/Exception
    //   34	56	342	finally
  }
  
  public static List<a> a(Context paramContext, int[] paramArrayOfInt, int paramInt)
  {
    try
    {
      paramContext = b(paramContext, paramArrayOfInt, paramInt);
      return paramContext;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  private static List<a> a(Cursor paramCursor)
  {
    com.tencent.beaconimsdk.c.a.b(" in AnalyticsDAO.paserCursor() start", new Object[0]);
    if (paramCursor == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    int i = paramCursor.getColumnIndex("_id");
    int j = paramCursor.getColumnIndex("_prority");
    int k = paramCursor.getColumnIndex("_time");
    int m = paramCursor.getColumnIndex("_type");
    int n = paramCursor.getColumnIndex("_datas");
    int i1 = paramCursor.getColumnIndex("_length");
    while (paramCursor.moveToNext())
    {
      a locala = new a();
      locala.a = paramCursor.getLong(i);
      locala.b = paramCursor.getBlob(n);
      locala.d = paramCursor.getInt(j);
      locala.e = paramCursor.getLong(k);
      locala.c = paramCursor.getInt(m);
      locala.f = paramCursor.getLong(i1);
      localArrayList.add(locala);
    }
    com.tencent.beaconimsdk.c.a.b(" in AnalyticsDAO.paserCursor() end", new Object[0]);
    return localArrayList;
  }
  
  /* Error */
  public static boolean a(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 5
    //   3: iconst_0
    //   4: istore 4
    //   6: ldc 2
    //   8: monitorenter
    //   9: ldc -6
    //   11: iconst_0
    //   12: anewarray 4	java/lang/Object
    //   15: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   18: aload_0
    //   19: ifnonnull +20 -> 39
    //   22: ldc 45
    //   24: iconst_0
    //   25: anewarray 4	java/lang/Object
    //   28: invokestatic 47	com/tencent/beaconimsdk/c/a:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   31: iload 4
    //   33: istore_3
    //   34: ldc 2
    //   36: monitorexit
    //   37: iload_3
    //   38: ireturn
    //   39: iload 4
    //   41: istore_3
    //   42: aload_1
    //   43: ifnull -9 -> 34
    //   46: iload 4
    //   48: istore_3
    //   49: aload_1
    //   50: invokevirtual 253	java/lang/String:trim	()Ljava/lang/String;
    //   53: ldc 51
    //   55: invokevirtual 256	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   58: ifne -24 -> 34
    //   61: new 53	java/lang/StringBuilder
    //   64: dup
    //   65: ldc_w 258
    //   68: invokespecial 84	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   71: aload_1
    //   72: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: ldc_w 260
    //   78: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   84: astore_1
    //   85: new 53	java/lang/StringBuilder
    //   88: dup
    //   89: ldc 81
    //   91: invokespecial 84	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   94: aload_1
    //   95: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   101: iconst_0
    //   102: anewarray 4	java/lang/Object
    //   105: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   108: aload_0
    //   109: invokestatic 89	com/tencent/beaconimsdk/a/a/c:a	(Landroid/content/Context;)Lcom/tencent/beaconimsdk/a/a/c;
    //   112: invokevirtual 93	com/tencent/beaconimsdk/a/a/c:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   115: ldc -98
    //   117: aload_1
    //   118: aconst_null
    //   119: invokevirtual 101	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   122: istore_2
    //   123: new 53	java/lang/StringBuilder
    //   126: dup
    //   127: ldc 103
    //   129: invokespecial 84	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   132: iload_2
    //   133: invokevirtual 63	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   136: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   139: iconst_0
    //   140: anewarray 4	java/lang/Object
    //   143: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   146: iload 5
    //   148: istore_3
    //   149: iload_2
    //   150: iconst_1
    //   151: if_icmpne +5 -> 156
    //   154: iconst_1
    //   155: istore_3
    //   156: ldc_w 262
    //   159: iconst_0
    //   160: anewarray 4	java/lang/Object
    //   163: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   166: goto -132 -> 34
    //   169: astore_0
    //   170: ldc 2
    //   172: monitorexit
    //   173: aload_0
    //   174: athrow
    //   175: astore_0
    //   176: aload_0
    //   177: invokevirtual 108	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   180: iconst_0
    //   181: anewarray 4	java/lang/Object
    //   184: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   187: ldc_w 262
    //   190: iconst_0
    //   191: anewarray 4	java/lang/Object
    //   194: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   197: iload 4
    //   199: istore_3
    //   200: goto -166 -> 34
    //   203: astore_0
    //   204: ldc_w 262
    //   207: iconst_0
    //   208: anewarray 4	java/lang/Object
    //   211: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   214: aload_0
    //   215: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	216	0	paramContext	Context
    //   0	216	1	paramString	String
    //   122	30	2	i	int
    //   33	167	3	bool1	boolean
    //   4	194	4	bool2	boolean
    //   1	146	5	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   9	18	169	finally
    //   22	31	169	finally
    //   49	108	169	finally
    //   156	166	169	finally
    //   187	197	169	finally
    //   204	216	169	finally
    //   108	146	175	java/lang/Throwable
    //   108	146	203	finally
    //   176	187	203	finally
  }
  
  /* Error */
  public static boolean a(Context paramContext, List<a> paramList)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 7
    //   3: ldc 2
    //   5: monitorenter
    //   6: ldc_w 265
    //   9: iconst_0
    //   10: anewarray 4	java/lang/Object
    //   13: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   16: aload_0
    //   17: ifnull +7 -> 24
    //   20: aload_1
    //   21: ifnonnull +22 -> 43
    //   24: ldc_w 267
    //   27: iconst_0
    //   28: anewarray 4	java/lang/Object
    //   31: invokestatic 115	com/tencent/beaconimsdk/c/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   34: iconst_0
    //   35: istore 7
    //   37: ldc 2
    //   39: monitorexit
    //   40: iload 7
    //   42: ireturn
    //   43: aload_1
    //   44: invokeinterface 270 1 0
    //   49: ifgt +22 -> 71
    //   52: ldc_w 272
    //   55: iconst_0
    //   56: anewarray 4	java/lang/Object
    //   59: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   62: goto -25 -> 37
    //   65: astore_0
    //   66: ldc 2
    //   68: monitorexit
    //   69: aload_0
    //   70: athrow
    //   71: aconst_null
    //   72: astore_2
    //   73: aload_0
    //   74: invokestatic 89	com/tencent/beaconimsdk/a/a/c:a	(Landroid/content/Context;)Lcom/tencent/beaconimsdk/a/a/c;
    //   77: invokevirtual 93	com/tencent/beaconimsdk/a/a/c:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   80: astore_0
    //   81: aload_0
    //   82: invokevirtual 275	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   85: iconst_0
    //   86: istore 4
    //   88: iload 4
    //   90: aload_1
    //   91: invokeinterface 270 1 0
    //   96: if_icmpge +150 -> 246
    //   99: aload_1
    //   100: iload 4
    //   102: invokeinterface 279 2 0
    //   107: checkcast 2	com/tencent/beaconimsdk/a/a/a
    //   110: astore_2
    //   111: new 281	android/content/ContentValues
    //   114: dup
    //   115: invokespecial 282	android/content/ContentValues:<init>	()V
    //   118: astore_3
    //   119: aload_2
    //   120: getfield 21	com/tencent/beaconimsdk/a/a/a:a	J
    //   123: lconst_0
    //   124: lcmp
    //   125: ifle +16 -> 141
    //   128: aload_3
    //   129: ldc -79
    //   131: aload_2
    //   132: getfield 21	com/tencent/beaconimsdk/a/a/a:a	J
    //   135: invokestatic 211	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   138: invokevirtual 286	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   141: aload_3
    //   142: ldc -17
    //   144: aload_2
    //   145: getfield 25	com/tencent/beaconimsdk/a/a/a:d	I
    //   148: invokestatic 191	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   151: invokevirtual 289	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   154: aload_3
    //   155: ldc -52
    //   157: aload_2
    //   158: getfield 27	com/tencent/beaconimsdk/a/a/a:e	J
    //   161: invokestatic 211	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   164: invokevirtual 286	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   167: aload_3
    //   168: ldc -15
    //   170: aload_2
    //   171: getfield 23	com/tencent/beaconimsdk/a/a/a:c	I
    //   174: invokestatic 191	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   177: invokevirtual 289	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   180: aload_3
    //   181: ldc -43
    //   183: aload_2
    //   184: getfield 29	com/tencent/beaconimsdk/a/a/a:b	[B
    //   187: invokevirtual 292	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   190: aload_3
    //   191: ldc -13
    //   193: aload_2
    //   194: getfield 31	com/tencent/beaconimsdk/a/a/a:f	J
    //   197: invokestatic 211	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   200: invokevirtual 286	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   203: aload_0
    //   204: ldc 95
    //   206: ldc -79
    //   208: aload_3
    //   209: invokevirtual 296	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   212: lstore 5
    //   214: lload 5
    //   216: lconst_0
    //   217: lcmp
    //   218: ifge +13 -> 231
    //   221: ldc_w 298
    //   224: iconst_0
    //   225: anewarray 4	java/lang/Object
    //   228: invokestatic 115	com/tencent/beaconimsdk/c/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   231: aload_2
    //   232: lload 5
    //   234: putfield 21	com/tencent/beaconimsdk/a/a/a:a	J
    //   237: iload 4
    //   239: iconst_1
    //   240: iadd
    //   241: istore 4
    //   243: goto -155 -> 88
    //   246: aload_0
    //   247: invokevirtual 301	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   250: aload_0
    //   251: invokevirtual 304	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   254: ldc_w 306
    //   257: iconst_0
    //   258: anewarray 4	java/lang/Object
    //   261: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   264: iconst_1
    //   265: istore 7
    //   267: goto -230 -> 37
    //   270: astore_0
    //   271: aload_2
    //   272: astore_0
    //   273: ldc_w 308
    //   276: iconst_0
    //   277: anewarray 4	java/lang/Object
    //   280: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   283: aload_0
    //   284: invokevirtual 304	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   287: ldc_w 306
    //   290: iconst_0
    //   291: anewarray 4	java/lang/Object
    //   294: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   297: iconst_0
    //   298: istore 7
    //   300: goto -33 -> 267
    //   303: aload_0
    //   304: invokevirtual 304	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   307: ldc_w 306
    //   310: iconst_0
    //   311: anewarray 4	java/lang/Object
    //   314: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   317: aload_1
    //   318: athrow
    //   319: astore_1
    //   320: goto -17 -> 303
    //   323: astore_1
    //   324: goto -21 -> 303
    //   327: astore_1
    //   328: goto -55 -> 273
    //   331: astore_1
    //   332: aconst_null
    //   333: astore_0
    //   334: goto -31 -> 303
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	337	0	paramContext	Context
    //   0	337	1	paramList	List<a>
    //   72	200	2	locala	a
    //   118	91	3	localContentValues	android.content.ContentValues
    //   86	156	4	i	int
    //   212	21	5	l	long
    //   1	298	7	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   6	16	65	finally
    //   24	34	65	finally
    //   43	62	65	finally
    //   250	264	65	finally
    //   283	297	65	finally
    //   303	319	65	finally
    //   73	81	270	java/lang/Throwable
    //   81	85	319	finally
    //   88	141	319	finally
    //   141	214	319	finally
    //   221	231	319	finally
    //   231	237	319	finally
    //   246	250	319	finally
    //   273	283	323	finally
    //   81	85	327	java/lang/Throwable
    //   88	141	327	java/lang/Throwable
    //   141	214	327	java/lang/Throwable
    //   221	231	327	java/lang/Throwable
    //   231	237	327	java/lang/Throwable
    //   246	250	327	java/lang/Throwable
    //   73	81	331	finally
  }
  
  /* Error */
  public static boolean a(Context paramContext, byte[] paramArrayOfByte, String paramString, int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 6
    //   3: iconst_0
    //   4: istore 5
    //   6: ldc 2
    //   8: monitorenter
    //   9: ldc_w 312
    //   12: iconst_0
    //   13: anewarray 4	java/lang/Object
    //   16: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   19: aload_0
    //   20: ifnull +11 -> 31
    //   23: aload_1
    //   24: ifnull +7 -> 31
    //   27: aload_2
    //   28: ifnonnull +19 -> 47
    //   31: ldc_w 314
    //   34: iconst_0
    //   35: anewarray 4	java/lang/Object
    //   38: invokestatic 115	com/tencent/beaconimsdk/c/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   41: ldc 2
    //   43: monitorexit
    //   44: iload 5
    //   46: ireturn
    //   47: aload_0
    //   48: invokestatic 89	com/tencent/beaconimsdk/a/a/c:a	(Landroid/content/Context;)Lcom/tencent/beaconimsdk/a/a/c;
    //   51: invokevirtual 93	com/tencent/beaconimsdk/a/a/c:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   54: astore_0
    //   55: new 281	android/content/ContentValues
    //   58: dup
    //   59: invokespecial 282	android/content/ContentValues:<init>	()V
    //   62: astore 4
    //   64: aload 4
    //   66: ldc -57
    //   68: aload_2
    //   69: invokevirtual 317	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
    //   72: aload 4
    //   74: ldc -52
    //   76: new 319	java/util/Date
    //   79: dup
    //   80: invokespecial 320	java/util/Date:<init>	()V
    //   83: invokevirtual 323	java/util/Date:getTime	()J
    //   86: invokestatic 211	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   89: invokevirtual 286	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   92: aload 4
    //   94: ldc -37
    //   96: iload_3
    //   97: invokestatic 191	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   100: invokevirtual 289	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   103: aload 4
    //   105: ldc -43
    //   107: aload_1
    //   108: invokevirtual 292	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   111: aload_0
    //   112: ldc -98
    //   114: aconst_null
    //   115: aload 4
    //   117: invokevirtual 296	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   120: lconst_0
    //   121: lcmp
    //   122: ifge +36 -> 158
    //   125: ldc_w 325
    //   128: iconst_0
    //   129: anewarray 4	java/lang/Object
    //   132: invokestatic 115	com/tencent/beaconimsdk/c/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   135: iload 6
    //   137: istore 5
    //   139: ldc_w 327
    //   142: iconst_0
    //   143: anewarray 4	java/lang/Object
    //   146: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   149: goto -108 -> 41
    //   152: astore_0
    //   153: ldc 2
    //   155: monitorexit
    //   156: aload_0
    //   157: athrow
    //   158: iconst_1
    //   159: istore 5
    //   161: goto -22 -> 139
    //   164: astore_0
    //   165: ldc_w 329
    //   168: iconst_0
    //   169: anewarray 4	java/lang/Object
    //   172: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   175: ldc_w 327
    //   178: iconst_0
    //   179: anewarray 4	java/lang/Object
    //   182: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   185: goto -144 -> 41
    //   188: astore_0
    //   189: ldc_w 327
    //   192: iconst_0
    //   193: anewarray 4	java/lang/Object
    //   196: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   199: aload_0
    //   200: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	201	0	paramContext	Context
    //   0	201	1	paramArrayOfByte	byte[]
    //   0	201	2	paramString	String
    //   0	201	3	paramInt	int
    //   62	54	4	localContentValues	android.content.ContentValues
    //   4	156	5	bool1	boolean
    //   1	135	6	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   9	19	152	finally
    //   31	41	152	finally
    //   139	149	152	finally
    //   175	185	152	finally
    //   189	201	152	finally
    //   47	135	164	java/lang/Throwable
    //   47	135	188	finally
    //   165	175	188	finally
  }
  
  /* Error */
  public static int b(Context paramContext, int[] paramArrayOfInt)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: istore 4
    //   3: iconst_0
    //   4: istore 5
    //   6: ldc 2
    //   8: monitorenter
    //   9: ldc_w 331
    //   12: iconst_0
    //   13: anewarray 4	java/lang/Object
    //   16: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   19: aload_0
    //   20: ifnonnull +19 -> 39
    //   23: ldc_w 333
    //   26: iconst_0
    //   27: anewarray 4	java/lang/Object
    //   30: invokestatic 47	com/tencent/beaconimsdk/c/a:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   33: ldc 2
    //   35: monitorexit
    //   36: iload 4
    //   38: ireturn
    //   39: ldc2_w 18
    //   42: ldc2_w 48
    //   45: lcmp
    //   46: ifle +9 -> 55
    //   49: iconst_0
    //   50: istore 4
    //   52: goto -19 -> 33
    //   55: ldc 75
    //   57: astore_3
    //   58: aload_3
    //   59: astore_2
    //   60: aload_1
    //   61: ifnull +96 -> 157
    //   64: aload_3
    //   65: astore_2
    //   66: aload_1
    //   67: arraylength
    //   68: ifle +89 -> 157
    //   71: ldc 51
    //   73: astore_2
    //   74: iload 5
    //   76: istore 4
    //   78: iload 4
    //   80: aload_1
    //   81: arraylength
    //   82: if_icmpge +39 -> 121
    //   85: new 53	java/lang/StringBuilder
    //   88: dup
    //   89: invokespecial 54	java/lang/StringBuilder:<init>	()V
    //   92: aload_2
    //   93: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: ldc 60
    //   98: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: aload_1
    //   102: iload 4
    //   104: iaload
    //   105: invokevirtual 63	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   108: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   111: astore_2
    //   112: iload 4
    //   114: iconst_1
    //   115: iadd
    //   116: istore 4
    //   118: goto -40 -> 78
    //   121: aload_2
    //   122: iconst_4
    //   123: invokevirtual 73	java/lang/String:substring	(I)Ljava/lang/String;
    //   126: astore_1
    //   127: new 53	java/lang/StringBuilder
    //   130: dup
    //   131: invokespecial 54	java/lang/StringBuilder:<init>	()V
    //   134: ldc 75
    //   136: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: ldc 77
    //   141: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: aload_1
    //   145: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: ldc 79
    //   150: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   156: astore_2
    //   157: new 53	java/lang/StringBuilder
    //   160: dup
    //   161: ldc_w 335
    //   164: invokespecial 84	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   167: aload_2
    //   168: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   174: iconst_0
    //   175: anewarray 4	java/lang/Object
    //   178: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   181: aload_0
    //   182: invokestatic 89	com/tencent/beaconimsdk/a/a/c:a	(Landroid/content/Context;)Lcom/tencent/beaconimsdk/a/a/c;
    //   185: invokevirtual 93	com/tencent/beaconimsdk/a/a/c:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   188: ldc 95
    //   190: iconst_1
    //   191: anewarray 69	java/lang/String
    //   194: dup
    //   195: iconst_0
    //   196: ldc_w 337
    //   199: aastore
    //   200: aload_2
    //   201: aconst_null
    //   202: aconst_null
    //   203: aconst_null
    //   204: aconst_null
    //   205: invokevirtual 340	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   208: astore_1
    //   209: aload_1
    //   210: astore_0
    //   211: aload_1
    //   212: invokeinterface 172 1 0
    //   217: pop
    //   218: aload_1
    //   219: astore_0
    //   220: aload_1
    //   221: aload_1
    //   222: ldc_w 342
    //   225: invokeinterface 181 2 0
    //   230: invokeinterface 185 2 0
    //   235: istore 4
    //   237: aload_1
    //   238: astore_0
    //   239: new 53	java/lang/StringBuilder
    //   242: dup
    //   243: ldc_w 344
    //   246: invokespecial 84	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   249: iload 4
    //   251: invokevirtual 63	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   254: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   257: iconst_0
    //   258: anewarray 4	java/lang/Object
    //   261: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   264: aload_1
    //   265: ifnull +18 -> 283
    //   268: aload_1
    //   269: invokeinterface 224 1 0
    //   274: ifne +9 -> 283
    //   277: aload_1
    //   278: invokeinterface 227 1 0
    //   283: ldc_w 346
    //   286: iconst_0
    //   287: anewarray 4	java/lang/Object
    //   290: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   293: goto -260 -> 33
    //   296: astore_2
    //   297: aconst_null
    //   298: astore_1
    //   299: aload_1
    //   300: astore_0
    //   301: aload_2
    //   302: invokevirtual 108	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   305: iconst_0
    //   306: anewarray 4	java/lang/Object
    //   309: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   312: aload_1
    //   313: ifnull +18 -> 331
    //   316: aload_1
    //   317: invokeinterface 224 1 0
    //   322: ifne +9 -> 331
    //   325: aload_1
    //   326: invokeinterface 227 1 0
    //   331: ldc_w 346
    //   334: iconst_0
    //   335: anewarray 4	java/lang/Object
    //   338: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   341: iconst_m1
    //   342: istore 4
    //   344: goto -51 -> 293
    //   347: aload_0
    //   348: ifnull +18 -> 366
    //   351: aload_0
    //   352: invokeinterface 224 1 0
    //   357: ifne +9 -> 366
    //   360: aload_0
    //   361: invokeinterface 227 1 0
    //   366: ldc_w 346
    //   369: iconst_0
    //   370: anewarray 4	java/lang/Object
    //   373: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   376: aload_1
    //   377: athrow
    //   378: astore_0
    //   379: ldc 2
    //   381: monitorexit
    //   382: aload_0
    //   383: athrow
    //   384: astore_1
    //   385: goto -38 -> 347
    //   388: astore_2
    //   389: goto -90 -> 299
    //   392: astore_1
    //   393: aconst_null
    //   394: astore_0
    //   395: goto -48 -> 347
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	398	0	paramContext	Context
    //   0	398	1	paramArrayOfInt	int[]
    //   59	142	2	str1	String
    //   296	6	2	localThrowable1	Throwable
    //   388	1	2	localThrowable2	Throwable
    //   57	8	3	str2	String
    //   1	342	4	i	int
    //   4	71	5	j	int
    // Exception table:
    //   from	to	target	type
    //   181	209	296	java/lang/Throwable
    //   9	19	378	finally
    //   23	33	378	finally
    //   66	71	378	finally
    //   78	112	378	finally
    //   121	157	378	finally
    //   157	181	378	finally
    //   268	283	378	finally
    //   283	293	378	finally
    //   316	331	378	finally
    //   331	341	378	finally
    //   351	366	378	finally
    //   366	378	378	finally
    //   211	218	384	finally
    //   220	237	384	finally
    //   239	264	384	finally
    //   301	312	384	finally
    //   211	218	388	java/lang/Throwable
    //   220	237	388	java/lang/Throwable
    //   239	264	388	java/lang/Throwable
    //   181	209	392	finally
  }
  
  private static List<a> b(Context paramContext, int[] paramArrayOfInt, int paramInt)
  {
    try
    {
      paramContext = c(paramContext, paramArrayOfInt, paramInt);
      return paramContext;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  /* Error */
  private static List<a> c(Context paramContext, int[] paramArrayOfInt, int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: iconst_0
    //   4: istore 6
    //   6: ldc 2
    //   8: monitorenter
    //   9: ldc_w 350
    //   12: iconst_0
    //   13: anewarray 4	java/lang/Object
    //   16: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   19: aload_0
    //   20: ifnull +86 -> 106
    //   23: ldc2_w 18
    //   26: lconst_0
    //   27: lcmp
    //   28: ifle +13 -> 41
    //   31: ldc2_w 18
    //   34: ldc2_w 18
    //   37: lcmp
    //   38: ifgt +68 -> 106
    //   41: ldc 51
    //   43: astore 5
    //   45: aload 5
    //   47: astore_3
    //   48: aload_1
    //   49: ifnull +98 -> 147
    //   52: aload 5
    //   54: astore_3
    //   55: aload_1
    //   56: arraylength
    //   57: ifle +90 -> 147
    //   60: ldc 51
    //   62: astore_3
    //   63: iload 6
    //   65: aload_1
    //   66: arraylength
    //   67: if_icmpge +56 -> 123
    //   70: new 53	java/lang/StringBuilder
    //   73: dup
    //   74: invokespecial 54	java/lang/StringBuilder:<init>	()V
    //   77: aload_3
    //   78: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: ldc 60
    //   83: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: aload_1
    //   87: iload 6
    //   89: iaload
    //   90: invokevirtual 63	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   93: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   96: astore_3
    //   97: iload 6
    //   99: iconst_1
    //   100: iadd
    //   101: istore 6
    //   103: goto -40 -> 63
    //   106: ldc_w 352
    //   109: iconst_0
    //   110: anewarray 4	java/lang/Object
    //   113: invokestatic 115	com/tencent/beaconimsdk/c/a:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   116: aconst_null
    //   117: astore_0
    //   118: ldc 2
    //   120: monitorexit
    //   121: aload_0
    //   122: areturn
    //   123: new 53	java/lang/StringBuilder
    //   126: dup
    //   127: invokespecial 54	java/lang/StringBuilder:<init>	()V
    //   130: ldc 51
    //   132: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   135: aload_3
    //   136: iconst_4
    //   137: invokevirtual 73	java/lang/String:substring	(I)Ljava/lang/String;
    //   140: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   146: astore_3
    //   147: aload_3
    //   148: invokevirtual 353	java/lang/String:length	()I
    //   151: ifle +359 -> 510
    //   154: new 53	java/lang/StringBuilder
    //   157: dup
    //   158: ldc_w 355
    //   161: invokespecial 84	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   164: aload_3
    //   165: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   168: ldc_w 357
    //   171: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   177: astore_3
    //   178: aload_3
    //   179: astore_1
    //   180: ldc2_w 18
    //   183: lconst_0
    //   184: lcmp
    //   185: iflt +43 -> 228
    //   188: new 53	java/lang/StringBuilder
    //   191: dup
    //   192: invokespecial 54	java/lang/StringBuilder:<init>	()V
    //   195: aload_3
    //   196: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   199: astore 5
    //   201: aload_3
    //   202: invokevirtual 353	java/lang/String:length	()I
    //   205: ifle +443 -> 648
    //   208: ldc_w 359
    //   211: astore_1
    //   212: aload 5
    //   214: aload_1
    //   215: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   218: ldc_w 361
    //   221: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   224: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   227: astore_1
    //   228: aload_1
    //   229: astore_3
    //   230: ldc2_w 18
    //   233: lconst_0
    //   234: lcmp
    //   235: iflt +41 -> 276
    //   238: new 53	java/lang/StringBuilder
    //   241: dup
    //   242: invokespecial 54	java/lang/StringBuilder:<init>	()V
    //   245: aload_1
    //   246: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   249: astore_3
    //   250: aload_1
    //   251: invokevirtual 353	java/lang/String:length	()I
    //   254: ifle +262 -> 516
    //   257: ldc_w 359
    //   260: astore_1
    //   261: aload_3
    //   262: aload_1
    //   263: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   266: ldc_w 363
    //   269: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   272: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   275: astore_3
    //   276: new 53	java/lang/StringBuilder
    //   279: dup
    //   280: invokespecial 54	java/lang/StringBuilder:<init>	()V
    //   283: ldc 51
    //   285: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   288: ldc_w 365
    //   291: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   294: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   297: astore_1
    //   298: new 53	java/lang/StringBuilder
    //   301: dup
    //   302: invokespecial 54	java/lang/StringBuilder:<init>	()V
    //   305: aload_1
    //   306: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   309: ldc -96
    //   311: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   314: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   317: astore 5
    //   319: aload 5
    //   321: astore_1
    //   322: aload 5
    //   324: ldc_w 367
    //   327: invokevirtual 371	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   330: ifeq +17 -> 347
    //   333: aload 5
    //   335: iconst_0
    //   336: aload 5
    //   338: invokevirtual 353	java/lang/String:length	()I
    //   341: iconst_3
    //   342: isub
    //   343: invokevirtual 374	java/lang/String:substring	(II)Ljava/lang/String;
    //   346: astore_1
    //   347: ldc_w 376
    //   350: iconst_1
    //   351: anewarray 4	java/lang/Object
    //   354: dup
    //   355: iconst_0
    //   356: aload_3
    //   357: aastore
    //   358: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   361: aload_0
    //   362: invokestatic 89	com/tencent/beaconimsdk/a/a/c:a	(Landroid/content/Context;)Lcom/tencent/beaconimsdk/a/a/c;
    //   365: invokevirtual 93	com/tencent/beaconimsdk/a/a/c:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   368: astore 5
    //   370: iload_2
    //   371: iflt +151 -> 522
    //   374: iload_2
    //   375: invokestatic 378	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   378: astore_0
    //   379: aload 5
    //   381: ldc 95
    //   383: aconst_null
    //   384: aload_3
    //   385: aconst_null
    //   386: aconst_null
    //   387: aconst_null
    //   388: aload_1
    //   389: aload_0
    //   390: invokevirtual 166	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   393: astore_0
    //   394: new 53	java/lang/StringBuilder
    //   397: dup
    //   398: ldc_w 380
    //   401: invokespecial 84	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   404: aload_0
    //   405: invokeinterface 383 1 0
    //   410: invokevirtual 63	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   413: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   416: iconst_0
    //   417: anewarray 4	java/lang/Object
    //   420: invokestatic 47	com/tencent/beaconimsdk/c/a:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   423: aload_0
    //   424: invokeinterface 383 1 0
    //   429: ifle +214 -> 643
    //   432: aload_0
    //   433: invokestatic 385	com/tencent/beaconimsdk/a/a/a:a	(Landroid/database/Cursor;)Ljava/util/List;
    //   436: astore_1
    //   437: aload_1
    //   438: ifnull +32 -> 470
    //   441: new 53	java/lang/StringBuilder
    //   444: dup
    //   445: ldc_w 387
    //   448: invokespecial 84	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   451: aload_1
    //   452: invokeinterface 270 1 0
    //   457: invokevirtual 63	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   460: invokevirtual 67	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   463: iconst_0
    //   464: anewarray 4	java/lang/Object
    //   467: invokestatic 47	com/tencent/beaconimsdk/c/a:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   470: aload_0
    //   471: ifnull +18 -> 489
    //   474: aload_0
    //   475: invokeinterface 224 1 0
    //   480: ifne +9 -> 489
    //   483: aload_0
    //   484: invokeinterface 227 1 0
    //   489: ldc_w 389
    //   492: iconst_0
    //   493: anewarray 4	java/lang/Object
    //   496: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   499: aload_1
    //   500: astore_0
    //   501: goto -383 -> 118
    //   504: astore_0
    //   505: ldc 2
    //   507: monitorexit
    //   508: aload_0
    //   509: athrow
    //   510: ldc 51
    //   512: astore_3
    //   513: goto -335 -> 178
    //   516: ldc 51
    //   518: astore_1
    //   519: goto -258 -> 261
    //   522: aconst_null
    //   523: astore_0
    //   524: goto -145 -> 379
    //   527: astore_3
    //   528: aconst_null
    //   529: astore_0
    //   530: aload 4
    //   532: astore_1
    //   533: aload_3
    //   534: invokevirtual 108	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   537: iconst_0
    //   538: anewarray 4	java/lang/Object
    //   541: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   544: aload_1
    //   545: ifnull +18 -> 563
    //   548: aload_1
    //   549: invokeinterface 224 1 0
    //   554: ifne +9 -> 563
    //   557: aload_1
    //   558: invokeinterface 227 1 0
    //   563: ldc_w 389
    //   566: iconst_0
    //   567: anewarray 4	java/lang/Object
    //   570: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   573: goto -455 -> 118
    //   576: aload_0
    //   577: ifnull +18 -> 595
    //   580: aload_0
    //   581: invokeinterface 224 1 0
    //   586: ifne +9 -> 595
    //   589: aload_0
    //   590: invokeinterface 227 1 0
    //   595: ldc_w 389
    //   598: iconst_0
    //   599: anewarray 4	java/lang/Object
    //   602: invokestatic 43	com/tencent/beaconimsdk/c/a:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   605: aload_1
    //   606: athrow
    //   607: astore_1
    //   608: goto -32 -> 576
    //   611: astore_3
    //   612: aload_1
    //   613: astore_0
    //   614: aload_3
    //   615: astore_1
    //   616: goto -40 -> 576
    //   619: astore_3
    //   620: aconst_null
    //   621: astore 4
    //   623: aload_0
    //   624: astore_1
    //   625: aload 4
    //   627: astore_0
    //   628: goto -95 -> 533
    //   631: astore_3
    //   632: aload_0
    //   633: astore 4
    //   635: aload_1
    //   636: astore_0
    //   637: aload 4
    //   639: astore_1
    //   640: goto -107 -> 533
    //   643: aconst_null
    //   644: astore_1
    //   645: goto -208 -> 437
    //   648: ldc 51
    //   650: astore_1
    //   651: goto -439 -> 212
    //   654: astore_1
    //   655: aconst_null
    //   656: astore_0
    //   657: goto -81 -> 576
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	660	0	paramContext	Context
    //   0	660	1	paramArrayOfInt	int[]
    //   0	660	2	paramInt	int
    //   47	466	3	localObject1	Object
    //   527	7	3	localThrowable1	Throwable
    //   611	4	3	localObject2	Object
    //   619	1	3	localThrowable2	Throwable
    //   631	1	3	localThrowable3	Throwable
    //   1	637	4	localContext	Context
    //   43	337	5	localObject3	Object
    //   4	98	6	i	int
    // Exception table:
    //   from	to	target	type
    //   9	19	504	finally
    //   55	60	504	finally
    //   63	97	504	finally
    //   106	116	504	finally
    //   123	147	504	finally
    //   147	178	504	finally
    //   188	208	504	finally
    //   212	228	504	finally
    //   238	257	504	finally
    //   261	276	504	finally
    //   276	319	504	finally
    //   322	347	504	finally
    //   347	361	504	finally
    //   474	489	504	finally
    //   489	499	504	finally
    //   548	563	504	finally
    //   563	573	504	finally
    //   580	595	504	finally
    //   595	607	504	finally
    //   361	370	527	java/lang/Throwable
    //   374	379	527	java/lang/Throwable
    //   379	394	527	java/lang/Throwable
    //   394	437	607	finally
    //   441	470	607	finally
    //   533	544	611	finally
    //   394	437	619	java/lang/Throwable
    //   441	470	631	java/lang/Throwable
    //   361	370	654	finally
    //   374	379	654	finally
    //   379	394	654	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beaconimsdk\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */