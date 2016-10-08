package com.tencent.feedback.proguard;

import android.content.Context;
import com.tencent.feedback.common.e;
import java.lang.reflect.Array;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class a
{
  protected HashMap<String, HashMap<String, byte[]>> a = new HashMap();
  protected String b;
  h c;
  private HashMap<String, Object> d;
  
  a()
  {
    new HashMap();
    this.d = new HashMap();
    this.b = "GBK";
    this.c = new h();
  }
  
  public static int a(Context paramContext, p[] paramArrayOfp)
  {
    int j = 0;
    int i;
    if ((paramContext == null) || (paramArrayOfp == null) || (paramArrayOfp.length <= 0)) {
      i = -1;
    }
    ArrayList localArrayList;
    do
    {
      return i;
      localArrayList = new ArrayList(paramArrayOfp.length);
      int k = paramArrayOfp.length;
      i = 0;
      while (i < k)
      {
        p localp = paramArrayOfp[i];
        Object localObject = a(localp);
        if (localObject != null)
        {
          localObject = new l(7, 0, 0L, (byte[])localObject);
          ((l)localObject).a(localp.a());
          localArrayList.add(localObject);
        }
        i += 1;
      }
      i = j;
    } while (localArrayList.size() <= 0);
    if (l.b(paramContext, localArrayList)) {
      return localArrayList.size();
    }
    return -1;
  }
  
  public static int a(Context paramContext, q[] paramArrayOfq)
  {
    int j = 0;
    if ((paramContext != null) && (paramArrayOfq != null)) {}
    for (;;)
    {
      ArrayList localArrayList;
      try
      {
        if (paramArrayOfq.length <= 0)
        {
          e.c("rqdp{  args error}", new Object[0]);
          i = j;
          return i;
        }
        localArrayList = new ArrayList(paramArrayOfq.length);
        int k = paramArrayOfq.length;
        i = 0;
        if (i < k)
        {
          q localq = paramArrayOfq[i];
          Object localObject = a(localq);
          if (localObject == null)
          {
            e.c("rqdp{ getSerData error }", new Object[0]);
          }
          else
          {
            localObject = new l(9, 0, localq.a(), (byte[])localObject);
            ((l)localObject).a(localq.c());
            localArrayList.add(localObject);
          }
        }
      }
      finally {}
      int i = j;
      if (localArrayList.size() > 0)
      {
        i = j;
        if (l.a(paramContext, localArrayList))
        {
          i = localArrayList.size();
          continue;
          i += 1;
        }
      }
    }
  }
  
  /* Error */
  public static C a(int paramInt1, com.tencent.feedback.common.c paramc, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    // Byte code:
    //   0: ldc 93
    //   2: iconst_0
    //   3: anewarray 4	java/lang/Object
    //   6: invokestatic 95	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   9: aload_1
    //   10: ifnonnull +14 -> 24
    //   13: ldc 97
    //   15: iconst_0
    //   16: anewarray 4	java/lang/Object
    //   19: invokestatic 99	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   22: aconst_null
    //   23: areturn
    //   24: new 101	com/tencent/feedback/proguard/C
    //   27: dup
    //   28: invokespecial 102	com/tencent/feedback/proguard/C:<init>	()V
    //   31: astore 6
    //   33: aload_1
    //   34: monitorenter
    //   35: aload 6
    //   37: aload_1
    //   38: invokevirtual 106	com/tencent/feedback/common/c:a	()Ljava/lang/String;
    //   41: putfield 109	com/tencent/feedback/proguard/C:h	Ljava/lang/String;
    //   44: aload 6
    //   46: aload_1
    //   47: invokevirtual 112	com/tencent/feedback/common/c:b	()B
    //   50: putfield 115	com/tencent/feedback/proguard/C:a	B
    //   53: aload 6
    //   55: aload_1
    //   56: invokevirtual 118	com/tencent/feedback/common/c:o	()Ljava/lang/String;
    //   59: putfield 119	com/tencent/feedback/proguard/C:b	Ljava/lang/String;
    //   62: aload 6
    //   64: aload_1
    //   65: invokevirtual 121	com/tencent/feedback/common/c:B	()Ljava/lang/String;
    //   68: putfield 123	com/tencent/feedback/proguard/C:c	Ljava/lang/String;
    //   71: aload 6
    //   73: aload_1
    //   74: invokevirtual 125	com/tencent/feedback/common/c:d	()Ljava/lang/String;
    //   77: putfield 127	com/tencent/feedback/proguard/C:d	Ljava/lang/String;
    //   80: aload 6
    //   82: aload_1
    //   83: invokevirtual 130	com/tencent/feedback/common/c:e	()Ljava/lang/String;
    //   86: putfield 132	com/tencent/feedback/proguard/C:e	Ljava/lang/String;
    //   89: aload 6
    //   91: aload_1
    //   92: invokevirtual 134	com/tencent/feedback/common/c:h	()Ljava/lang/String;
    //   95: putfield 137	com/tencent/feedback/proguard/C:i	Ljava/lang/String;
    //   98: aload_1
    //   99: invokevirtual 140	com/tencent/feedback/common/c:l	()Ljava/lang/String;
    //   102: invokevirtual 145	java/lang/String:trim	()Ljava/lang/String;
    //   105: invokevirtual 148	java/lang/String:length	()I
    //   108: ifle +83 -> 191
    //   111: aload_1
    //   112: invokevirtual 140	com/tencent/feedback/common/c:l	()Ljava/lang/String;
    //   115: astore 5
    //   117: aload 6
    //   119: aload 5
    //   121: putfield 150	com/tencent/feedback/proguard/C:l	Ljava/lang/String;
    //   124: aload 6
    //   126: ldc -104
    //   128: putfield 155	com/tencent/feedback/proguard/C:m	Ljava/lang/String;
    //   131: aload 6
    //   133: aload_1
    //   134: invokevirtual 156	com/tencent/feedback/common/c:c	()Ljava/lang/String;
    //   137: putfield 159	com/tencent/feedback/proguard/C:n	Ljava/lang/String;
    //   140: aload 6
    //   142: ldc -104
    //   144: putfield 161	com/tencent/feedback/proguard/C:o	Ljava/lang/String;
    //   147: aload_1
    //   148: monitorexit
    //   149: aload 6
    //   151: iload_0
    //   152: putfield 165	com/tencent/feedback/proguard/C:f	I
    //   155: aload 6
    //   157: iload 4
    //   159: i2b
    //   160: putfield 168	com/tencent/feedback/proguard/C:j	B
    //   163: aload 6
    //   165: iload_3
    //   166: i2b
    //   167: putfield 171	com/tencent/feedback/proguard/C:k	B
    //   170: aload_2
    //   171: astore_1
    //   172: aload_2
    //   173: ifnonnull +9 -> 182
    //   176: ldc -104
    //   178: invokevirtual 175	java/lang/String:getBytes	()[B
    //   181: astore_1
    //   182: aload 6
    //   184: aload_1
    //   185: putfield 179	com/tencent/feedback/proguard/C:g	[B
    //   188: aload 6
    //   190: areturn
    //   191: aload_1
    //   192: invokevirtual 181	com/tencent/feedback/common/c:m	()Ljava/lang/String;
    //   195: astore 5
    //   197: goto -80 -> 117
    //   200: astore_2
    //   201: aload_1
    //   202: monitorexit
    //   203: aload_2
    //   204: athrow
    //   205: astore_1
    //   206: aload_1
    //   207: invokevirtual 184	java/lang/Throwable:printStackTrace	()V
    //   210: aconst_null
    //   211: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	212	0	paramInt1	int
    //   0	212	1	paramc	com.tencent.feedback.common.c
    //   0	212	2	paramArrayOfByte	byte[]
    //   0	212	3	paramInt2	int
    //   0	212	4	paramInt3	int
    //   115	81	5	str	String
    //   31	158	6	localC	C
    // Exception table:
    //   from	to	target	type
    //   35	117	200	finally
    //   117	149	200	finally
    //   191	197	200	finally
    //   24	35	205	java/lang/Throwable
    //   149	170	205	java/lang/Throwable
    //   176	182	205	java/lang/Throwable
    //   182	188	205	java/lang/Throwable
    //   201	205	205	java/lang/Throwable
  }
  
  /* Error */
  public static z a(Context paramContext, int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aload_0
    //   4: ifnonnull +14 -> 18
    //   7: ldc -69
    //   9: iconst_0
    //   10: anewarray 4	java/lang/Object
    //   13: invokestatic 75	com/tencent/feedback/common/e:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   16: aconst_null
    //   17: areturn
    //   18: new 189	com/tencent/feedback/proguard/n
    //   21: dup
    //   22: aload_0
    //   23: invokespecial 192	com/tencent/feedback/proguard/n:<init>	(Landroid/content/Context;)V
    //   26: astore_3
    //   27: aload_3
    //   28: invokevirtual 196	com/tencent/feedback/proguard/n:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   31: astore_0
    //   32: aload_0
    //   33: ifnonnull +33 -> 66
    //   36: ldc -58
    //   38: iconst_0
    //   39: anewarray 4	java/lang/Object
    //   42: invokestatic 75	com/tencent/feedback/common/e:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   45: aload_0
    //   46: ifnull +14 -> 60
    //   49: aload_0
    //   50: invokevirtual 204	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   53: ifeq +7 -> 60
    //   56: aload_0
    //   57: invokevirtual 207	android/database/sqlite/SQLiteDatabase:close	()V
    //   60: aload_3
    //   61: invokevirtual 208	com/tencent/feedback/proguard/n:close	()V
    //   64: aconst_null
    //   65: areturn
    //   66: aload_0
    //   67: ldc -46
    //   69: aconst_null
    //   70: getstatic 216	java/util/Locale:US	Ljava/util/Locale;
    //   73: ldc -38
    //   75: iconst_2
    //   76: anewarray 4	java/lang/Object
    //   79: dup
    //   80: iconst_0
    //   81: ldc -36
    //   83: aastore
    //   84: dup
    //   85: iconst_1
    //   86: iload_1
    //   87: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   90: aastore
    //   91: invokestatic 230	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   94: aconst_null
    //   95: aconst_null
    //   96: aconst_null
    //   97: aconst_null
    //   98: invokevirtual 234	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   101: astore_2
    //   102: aload_2
    //   103: ifnull +281 -> 384
    //   106: aload_2
    //   107: invokeinterface 239 1 0
    //   112: ifeq +272 -> 384
    //   115: aload_2
    //   116: ifnull +433 -> 549
    //   119: aload_2
    //   120: invokeinterface 242 1 0
    //   125: ifne +424 -> 549
    //   128: aload_2
    //   129: invokeinterface 245 1 0
    //   134: ifeq +72 -> 206
    //   137: goto +412 -> 549
    //   140: aload 4
    //   142: ifnull +242 -> 384
    //   145: ldc -9
    //   147: iconst_1
    //   148: anewarray 4	java/lang/Object
    //   151: dup
    //   152: iconst_0
    //   153: aload 4
    //   155: invokevirtual 251	com/tencent/feedback/proguard/z:b	()I
    //   158: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   161: aastore
    //   162: invokestatic 253	com/tencent/feedback/common/e:g	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   165: aload_2
    //   166: ifnull +18 -> 184
    //   169: aload_2
    //   170: invokeinterface 256 1 0
    //   175: ifne +9 -> 184
    //   178: aload_2
    //   179: invokeinterface 257 1 0
    //   184: aload_0
    //   185: ifnull +14 -> 199
    //   188: aload_0
    //   189: invokevirtual 204	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   192: ifeq +7 -> 199
    //   195: aload_0
    //   196: invokevirtual 207	android/database/sqlite/SQLiteDatabase:close	()V
    //   199: aload_3
    //   200: invokevirtual 208	com/tencent/feedback/proguard/n:close	()V
    //   203: aload 4
    //   205: areturn
    //   206: ldc_w 259
    //   209: iconst_0
    //   210: anewarray 4	java/lang/Object
    //   213: invokestatic 95	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   216: new 249	com/tencent/feedback/proguard/z
    //   219: dup
    //   220: invokespecial 260	com/tencent/feedback/proguard/z:<init>	()V
    //   223: astore 4
    //   225: aload 4
    //   227: aload_2
    //   228: aload_2
    //   229: ldc_w 262
    //   232: invokeinterface 266 2 0
    //   237: invokeinterface 270 2 0
    //   242: invokevirtual 273	com/tencent/feedback/proguard/z:a	(J)V
    //   245: aload 4
    //   247: aload_2
    //   248: aload_2
    //   249: ldc -36
    //   251: invokeinterface 266 2 0
    //   256: invokeinterface 277 2 0
    //   261: invokevirtual 279	com/tencent/feedback/proguard/z:a	(I)V
    //   264: aload 4
    //   266: aload_2
    //   267: aload_2
    //   268: ldc_w 281
    //   271: invokeinterface 266 2 0
    //   276: invokeinterface 270 2 0
    //   281: invokevirtual 283	com/tencent/feedback/proguard/z:b	(J)V
    //   284: aload 4
    //   286: aload_2
    //   287: aload_2
    //   288: ldc_w 285
    //   291: invokeinterface 266 2 0
    //   296: invokeinterface 289 2 0
    //   301: invokevirtual 292	com/tencent/feedback/proguard/z:a	([B)V
    //   304: goto -164 -> 140
    //   307: astore 4
    //   309: aload_2
    //   310: astore 5
    //   312: aload_0
    //   313: astore_2
    //   314: aload 5
    //   316: astore_0
    //   317: aload 4
    //   319: invokevirtual 184	java/lang/Throwable:printStackTrace	()V
    //   322: ldc_w 294
    //   325: iconst_1
    //   326: anewarray 4	java/lang/Object
    //   329: dup
    //   330: iconst_0
    //   331: aload 4
    //   333: invokevirtual 297	java/lang/Throwable:toString	()Ljava/lang/String;
    //   336: aastore
    //   337: invokestatic 99	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   340: aload_0
    //   341: ifnull +18 -> 359
    //   344: aload_0
    //   345: invokeinterface 256 1 0
    //   350: ifne +9 -> 359
    //   353: aload_0
    //   354: invokeinterface 257 1 0
    //   359: aload_2
    //   360: ifnull +14 -> 374
    //   363: aload_2
    //   364: invokevirtual 204	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   367: ifeq +7 -> 374
    //   370: aload_2
    //   371: invokevirtual 207	android/database/sqlite/SQLiteDatabase:close	()V
    //   374: aload_3
    //   375: ifnull +7 -> 382
    //   378: aload_3
    //   379: invokevirtual 208	com/tencent/feedback/proguard/n:close	()V
    //   382: aconst_null
    //   383: areturn
    //   384: aload_2
    //   385: ifnull +18 -> 403
    //   388: aload_2
    //   389: invokeinterface 256 1 0
    //   394: ifne +9 -> 403
    //   397: aload_2
    //   398: invokeinterface 257 1 0
    //   403: aload_0
    //   404: ifnull +14 -> 418
    //   407: aload_0
    //   408: invokevirtual 204	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   411: ifeq +7 -> 418
    //   414: aload_0
    //   415: invokevirtual 207	android/database/sqlite/SQLiteDatabase:close	()V
    //   418: aload_3
    //   419: invokevirtual 208	com/tencent/feedback/proguard/n:close	()V
    //   422: goto -40 -> 382
    //   425: astore_0
    //   426: aconst_null
    //   427: astore_2
    //   428: aconst_null
    //   429: astore_3
    //   430: aload_2
    //   431: ifnull +18 -> 449
    //   434: aload_2
    //   435: invokeinterface 256 1 0
    //   440: ifne +9 -> 449
    //   443: aload_2
    //   444: invokeinterface 257 1 0
    //   449: aload 4
    //   451: ifnull +16 -> 467
    //   454: aload 4
    //   456: invokevirtual 204	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   459: ifeq +8 -> 467
    //   462: aload 4
    //   464: invokevirtual 207	android/database/sqlite/SQLiteDatabase:close	()V
    //   467: aload_3
    //   468: ifnull +7 -> 475
    //   471: aload_3
    //   472: invokevirtual 208	com/tencent/feedback/proguard/n:close	()V
    //   475: aload_0
    //   476: athrow
    //   477: astore_0
    //   478: aconst_null
    //   479: astore_2
    //   480: goto -50 -> 430
    //   483: astore 5
    //   485: aconst_null
    //   486: astore_2
    //   487: aload_0
    //   488: astore 4
    //   490: aload 5
    //   492: astore_0
    //   493: goto -63 -> 430
    //   496: astore 5
    //   498: aload_0
    //   499: astore 4
    //   501: aload 5
    //   503: astore_0
    //   504: goto -74 -> 430
    //   507: astore 5
    //   509: aload_2
    //   510: astore 4
    //   512: aload_0
    //   513: astore_2
    //   514: aload 5
    //   516: astore_0
    //   517: goto -87 -> 430
    //   520: astore 4
    //   522: aconst_null
    //   523: astore_0
    //   524: aconst_null
    //   525: astore_2
    //   526: aconst_null
    //   527: astore_3
    //   528: goto -211 -> 317
    //   531: astore 4
    //   533: aconst_null
    //   534: astore_0
    //   535: aconst_null
    //   536: astore_2
    //   537: goto -220 -> 317
    //   540: astore 4
    //   542: aload_0
    //   543: astore_2
    //   544: aconst_null
    //   545: astore_0
    //   546: goto -229 -> 317
    //   549: aconst_null
    //   550: astore 4
    //   552: goto -412 -> 140
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	555	0	paramContext	Context
    //   0	555	1	paramInt	int
    //   101	443	2	localObject1	Object
    //   26	502	3	localn	n
    //   1	284	4	localz	z
    //   307	156	4	localThrowable1	Throwable
    //   488	23	4	localObject2	Object
    //   520	1	4	localThrowable2	Throwable
    //   531	1	4	localThrowable3	Throwable
    //   540	1	4	localThrowable4	Throwable
    //   550	1	4	localObject3	Object
    //   310	5	5	localObject4	Object
    //   483	8	5	localObject5	Object
    //   496	6	5	localObject6	Object
    //   507	8	5	localObject7	Object
    // Exception table:
    //   from	to	target	type
    //   106	115	307	java/lang/Throwable
    //   119	137	307	java/lang/Throwable
    //   145	165	307	java/lang/Throwable
    //   206	304	307	java/lang/Throwable
    //   18	27	425	finally
    //   27	32	477	finally
    //   36	45	483	finally
    //   66	102	483	finally
    //   106	115	496	finally
    //   119	137	496	finally
    //   145	165	496	finally
    //   206	304	496	finally
    //   317	340	507	finally
    //   18	27	520	java/lang/Throwable
    //   27	32	531	java/lang/Throwable
    //   36	45	540	java/lang/Throwable
    //   66	102	540	java/lang/Throwable
  }
  
  /* Error */
  public static String a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +10 -> 11
    //   4: aload_0
    //   5: invokevirtual 148	java/lang/String:length	()I
    //   8: ifne +5 -> 13
    //   11: aconst_null
    //   12: areturn
    //   13: new 304	java/io/File
    //   16: dup
    //   17: aload_0
    //   18: invokespecial 307	java/io/File:<init>	(Ljava/lang/String;)V
    //   21: astore_0
    //   22: aload_0
    //   23: invokevirtual 310	java/io/File:exists	()Z
    //   26: ifeq -15 -> 11
    //   29: aload_0
    //   30: invokevirtual 313	java/io/File:canRead	()Z
    //   33: ifeq -22 -> 11
    //   36: new 315	java/io/FileInputStream
    //   39: dup
    //   40: aload_0
    //   41: invokespecial 318	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   44: astore_1
    //   45: aload_1
    //   46: astore_0
    //   47: ldc_w 320
    //   50: invokestatic 326	java/security/MessageDigest:getInstance	(Ljava/lang/String;)Ljava/security/MessageDigest;
    //   53: astore_2
    //   54: aload_1
    //   55: astore_0
    //   56: sipush 4096
    //   59: newarray <illegal type>
    //   61: astore_3
    //   62: aload_1
    //   63: astore_0
    //   64: aload_1
    //   65: aload_3
    //   66: invokevirtual 330	java/io/FileInputStream:read	([B)I
    //   69: istore 4
    //   71: iload 4
    //   73: iconst_m1
    //   74: if_icmpeq +53 -> 127
    //   77: aload_1
    //   78: astore_0
    //   79: aload_2
    //   80: aload_3
    //   81: iconst_0
    //   82: iload 4
    //   84: invokevirtual 334	java/security/MessageDigest:update	([BII)V
    //   87: goto -25 -> 62
    //   90: astore_2
    //   91: aload_1
    //   92: astore_0
    //   93: aload_2
    //   94: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   97: aload_1
    //   98: astore_0
    //   99: aload_2
    //   100: invokevirtual 338	java/io/IOException:getMessage	()Ljava/lang/String;
    //   103: iconst_0
    //   104: anewarray 4	java/lang/Object
    //   107: invokestatic 99	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   110: aload_1
    //   111: ifnull -100 -> 11
    //   114: aload_1
    //   115: invokevirtual 339	java/io/FileInputStream:close	()V
    //   118: aconst_null
    //   119: areturn
    //   120: astore_0
    //   121: aload_0
    //   122: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   125: aconst_null
    //   126: areturn
    //   127: aload_1
    //   128: astore_0
    //   129: aload_2
    //   130: invokevirtual 342	java/security/MessageDigest:digest	()[B
    //   133: invokestatic 345	com/tencent/feedback/proguard/a:d	([B)Ljava/lang/String;
    //   136: astore_2
    //   137: aload_1
    //   138: invokevirtual 339	java/io/FileInputStream:close	()V
    //   141: aload_2
    //   142: areturn
    //   143: astore_0
    //   144: aload_0
    //   145: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   148: aload_2
    //   149: areturn
    //   150: astore_2
    //   151: aconst_null
    //   152: astore_1
    //   153: aload_1
    //   154: astore_0
    //   155: aload_2
    //   156: invokevirtual 346	java/security/NoSuchAlgorithmException:printStackTrace	()V
    //   159: aload_1
    //   160: astore_0
    //   161: aload_2
    //   162: invokevirtual 347	java/security/NoSuchAlgorithmException:getMessage	()Ljava/lang/String;
    //   165: iconst_0
    //   166: anewarray 4	java/lang/Object
    //   169: invokestatic 99	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   172: aload_1
    //   173: ifnull -162 -> 11
    //   176: aload_1
    //   177: invokevirtual 339	java/io/FileInputStream:close	()V
    //   180: aconst_null
    //   181: areturn
    //   182: astore_0
    //   183: aload_0
    //   184: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   187: aconst_null
    //   188: areturn
    //   189: astore_1
    //   190: aconst_null
    //   191: astore_0
    //   192: aload_0
    //   193: ifnull +7 -> 200
    //   196: aload_0
    //   197: invokevirtual 339	java/io/FileInputStream:close	()V
    //   200: aload_1
    //   201: athrow
    //   202: astore_0
    //   203: aload_0
    //   204: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   207: goto -7 -> 200
    //   210: astore_1
    //   211: goto -19 -> 192
    //   214: astore_2
    //   215: goto -62 -> 153
    //   218: astore_2
    //   219: aconst_null
    //   220: astore_1
    //   221: goto -130 -> 91
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	224	0	paramString	String
    //   44	133	1	localFileInputStream	java.io.FileInputStream
    //   189	12	1	localObject1	Object
    //   210	1	1	localObject2	Object
    //   220	1	1	localObject3	Object
    //   53	27	2	localMessageDigest	MessageDigest
    //   90	40	2	localIOException1	java.io.IOException
    //   136	13	2	str	String
    //   150	12	2	localNoSuchAlgorithmException1	NoSuchAlgorithmException
    //   214	1	2	localNoSuchAlgorithmException2	NoSuchAlgorithmException
    //   218	1	2	localIOException2	java.io.IOException
    //   61	20	3	arrayOfByte	byte[]
    //   69	14	4	i	int
    // Exception table:
    //   from	to	target	type
    //   47	54	90	java/io/IOException
    //   56	62	90	java/io/IOException
    //   64	71	90	java/io/IOException
    //   79	87	90	java/io/IOException
    //   129	137	90	java/io/IOException
    //   114	118	120	java/io/IOException
    //   137	141	143	java/io/IOException
    //   36	45	150	java/security/NoSuchAlgorithmException
    //   176	180	182	java/io/IOException
    //   36	45	189	finally
    //   196	200	202	java/io/IOException
    //   47	54	210	finally
    //   56	62	210	finally
    //   64	71	210	finally
    //   79	87	210	finally
    //   93	97	210	finally
    //   99	110	210	finally
    //   129	137	210	finally
    //   155	159	210	finally
    //   161	172	210	finally
    //   47	54	214	java/security/NoSuchAlgorithmException
    //   56	62	214	java/security/NoSuchAlgorithmException
    //   64	71	214	java/security/NoSuchAlgorithmException
    //   79	87	214	java/security/NoSuchAlgorithmException
    //   129	137	214	java/security/NoSuchAlgorithmException
    //   36	45	218	java/io/IOException
  }
  
  public static String a(ArrayList<String> paramArrayList)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 0;
    String str1;
    if (i < paramArrayList.size())
    {
      String str2 = (String)paramArrayList.get(i);
      if ((str2.equals("java.lang.Integer")) || (str2.equals("int"))) {
        str1 = "int32";
      }
      for (;;)
      {
        paramArrayList.set(i, str1);
        i += 1;
        break;
        if ((str2.equals("java.lang.Boolean")) || (str2.equals("boolean")))
        {
          str1 = "bool";
        }
        else if ((str2.equals("java.lang.Byte")) || (str2.equals("byte")))
        {
          str1 = "char";
        }
        else if ((str2.equals("java.lang.Double")) || (str2.equals("double")))
        {
          str1 = "double";
        }
        else if ((str2.equals("java.lang.Float")) || (str2.equals("float")))
        {
          str1 = "float";
        }
        else if ((str2.equals("java.lang.Long")) || (str2.equals("long")))
        {
          str1 = "int64";
        }
        else if ((str2.equals("java.lang.Short")) || (str2.equals("short")))
        {
          str1 = "short";
        }
        else
        {
          if (str2.equals("java.lang.Character")) {
            throw new IllegalArgumentException("can not support java.lang.Character");
          }
          if (str2.equals("java.lang.String"))
          {
            str1 = "string";
          }
          else if (str2.equals("java.util.List"))
          {
            str1 = "list";
          }
          else
          {
            str1 = str2;
            if (str2.equals("java.util.Map")) {
              str1 = "map";
            }
          }
        }
      }
    }
    Collections.reverse(paramArrayList);
    i = 0;
    if (i < paramArrayList.size())
    {
      str1 = (String)paramArrayList.get(i);
      if (str1.equals("list"))
      {
        paramArrayList.set(i - 1, "<" + (String)paramArrayList.get(i - 1));
        paramArrayList.set(0, (String)paramArrayList.get(0) + ">");
      }
      for (;;)
      {
        i += 1;
        break;
        if (str1.equals("map"))
        {
          paramArrayList.set(i - 1, "<" + (String)paramArrayList.get(i - 1) + ",");
          paramArrayList.set(0, (String)paramArrayList.get(0) + ">");
        }
        else if (str1.equals("Array"))
        {
          paramArrayList.set(i - 1, "<" + (String)paramArrayList.get(i - 1));
          paramArrayList.set(0, (String)paramArrayList.get(0) + ">");
        }
      }
    }
    Collections.reverse(paramArrayList);
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext()) {
      localStringBuffer.append((String)paramArrayList.next());
    }
    return localStringBuffer.toString();
  }
  
  /* Error */
  public static ArrayList<String> a(String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 37	java/util/ArrayList
    //   5: dup
    //   6: invokespecial 461	java/util/ArrayList:<init>	()V
    //   9: astore 4
    //   11: invokestatic 467	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   14: aload_0
    //   15: invokevirtual 471	java/lang/Runtime:exec	([Ljava/lang/String;)Ljava/lang/Process;
    //   18: astore_0
    //   19: new 473	java/io/BufferedReader
    //   22: dup
    //   23: new 475	java/io/InputStreamReader
    //   26: dup
    //   27: aload_0
    //   28: invokevirtual 481	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   31: invokespecial 484	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   34: invokespecial 487	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   37: astore_1
    //   38: aload_1
    //   39: invokevirtual 490	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   42: astore_2
    //   43: aload_2
    //   44: ifnull +44 -> 88
    //   47: aload 4
    //   49: aload_2
    //   50: invokevirtual 60	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   53: pop
    //   54: goto -16 -> 38
    //   57: astore 4
    //   59: aconst_null
    //   60: astore_0
    //   61: aload_0
    //   62: astore_3
    //   63: aload_1
    //   64: astore_2
    //   65: aload 4
    //   67: invokevirtual 184	java/lang/Throwable:printStackTrace	()V
    //   70: aload_1
    //   71: ifnull +7 -> 78
    //   74: aload_1
    //   75: invokevirtual 491	java/io/BufferedReader:close	()V
    //   78: aload_0
    //   79: ifnull +7 -> 86
    //   82: aload_0
    //   83: invokevirtual 491	java/io/BufferedReader:close	()V
    //   86: aconst_null
    //   87: areturn
    //   88: new 473	java/io/BufferedReader
    //   91: dup
    //   92: new 475	java/io/InputStreamReader
    //   95: dup
    //   96: aload_0
    //   97: invokevirtual 494	java/lang/Process:getErrorStream	()Ljava/io/InputStream;
    //   100: invokespecial 484	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   103: invokespecial 487	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   106: astore_0
    //   107: aload_0
    //   108: astore_3
    //   109: aload_1
    //   110: astore_2
    //   111: aload_0
    //   112: invokevirtual 490	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   115: astore 5
    //   117: aload 5
    //   119: ifnull +23 -> 142
    //   122: aload_0
    //   123: astore_3
    //   124: aload_1
    //   125: astore_2
    //   126: aload 4
    //   128: aload 5
    //   130: invokevirtual 60	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   133: pop
    //   134: goto -27 -> 107
    //   137: astore 4
    //   139: goto -78 -> 61
    //   142: aload_1
    //   143: invokevirtual 491	java/io/BufferedReader:close	()V
    //   146: aload_0
    //   147: invokevirtual 491	java/io/BufferedReader:close	()V
    //   150: aload 4
    //   152: areturn
    //   153: astore_0
    //   154: aload_0
    //   155: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   158: aload 4
    //   160: areturn
    //   161: astore_1
    //   162: aload_1
    //   163: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   166: goto -20 -> 146
    //   169: astore_1
    //   170: aload_1
    //   171: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   174: goto -96 -> 78
    //   177: astore_0
    //   178: aload_0
    //   179: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   182: goto -96 -> 86
    //   185: astore_0
    //   186: aconst_null
    //   187: astore_1
    //   188: aload_1
    //   189: ifnull +7 -> 196
    //   192: aload_1
    //   193: invokevirtual 491	java/io/BufferedReader:close	()V
    //   196: aload_3
    //   197: ifnull +7 -> 204
    //   200: aload_3
    //   201: invokevirtual 491	java/io/BufferedReader:close	()V
    //   204: aload_0
    //   205: athrow
    //   206: astore_1
    //   207: aload_1
    //   208: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   211: goto -15 -> 196
    //   214: astore_1
    //   215: aload_1
    //   216: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   219: goto -15 -> 204
    //   222: astore_0
    //   223: goto -35 -> 188
    //   226: astore_0
    //   227: aload_2
    //   228: astore_1
    //   229: goto -41 -> 188
    //   232: astore 4
    //   234: aconst_null
    //   235: astore_0
    //   236: aconst_null
    //   237: astore_1
    //   238: goto -177 -> 61
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	241	0	paramArrayOfString	String[]
    //   37	106	1	localBufferedReader	java.io.BufferedReader
    //   161	2	1	localIOException1	java.io.IOException
    //   169	2	1	localIOException2	java.io.IOException
    //   187	6	1	localObject1	Object
    //   206	2	1	localIOException3	java.io.IOException
    //   214	2	1	localIOException4	java.io.IOException
    //   228	10	1	localObject2	Object
    //   42	186	2	localObject3	Object
    //   1	200	3	arrayOfString	String[]
    //   9	39	4	localArrayList	ArrayList
    //   57	70	4	localThrowable1	Throwable
    //   137	22	4	localThrowable2	Throwable
    //   232	1	4	localThrowable3	Throwable
    //   115	14	5	str	String
    // Exception table:
    //   from	to	target	type
    //   38	43	57	java/lang/Throwable
    //   47	54	57	java/lang/Throwable
    //   88	107	57	java/lang/Throwable
    //   111	117	137	java/lang/Throwable
    //   126	134	137	java/lang/Throwable
    //   146	150	153	java/io/IOException
    //   142	146	161	java/io/IOException
    //   74	78	169	java/io/IOException
    //   82	86	177	java/io/IOException
    //   11	38	185	finally
    //   192	196	206	java/io/IOException
    //   200	204	214	java/io/IOException
    //   38	43	222	finally
    //   47	54	222	finally
    //   88	107	222	finally
    //   65	70	226	finally
    //   111	117	226	finally
    //   126	134	226	finally
    //   11	38	232	java/lang/Throwable
  }
  
  public static List<p> a(Context paramContext)
  {
    if (paramContext == null) {
      return null;
    }
    Object localObject = l.a(paramContext, new int[] { 7 }, -1, -1, Long.MAX_VALUE, 5, null, -1, -1, -1, -1, -1L, Long.MAX_VALUE);
    if ((localObject == null) || (((List)localObject).size() <= 0)) {
      return null;
    }
    paramContext = new ArrayList(((List)localObject).size());
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      l locall = (l)((Iterator)localObject).next();
      try
      {
        p localp = (p)p.class.cast(b(locall.b()));
        localp.a(locall.a());
        paramContext.add(localp);
      }
      catch (Throwable localThrowable)
      {
        localThrowable.printStackTrace();
        e.d("rqdp{  netconsume error }%s", new Object[] { localThrowable.toString() });
      }
    }
    return paramContext;
  }
  
  public static void a(Context paramContext, int paramInt, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return;
    }
    z localz = new z();
    localz.a(paramInt);
    localz.a(paramArrayOfByte);
    localz.b(new Date().getTime());
    a(paramContext, localz);
  }
  
  /* Error */
  public static void a(String paramString1, String paramString2, int paramInt)
  {
    // Byte code:
    //   0: ldc_w 537
    //   3: iconst_1
    //   4: anewarray 4	java/lang/Object
    //   7: dup
    //   8: iconst_0
    //   9: aload_0
    //   10: aastore
    //   11: invokestatic 95	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   14: aload_1
    //   15: ifnull +13 -> 28
    //   18: aload_1
    //   19: invokevirtual 145	java/lang/String:trim	()Ljava/lang/String;
    //   22: invokevirtual 148	java/lang/String:length	()I
    //   25: ifgt +4 -> 29
    //   28: return
    //   29: new 304	java/io/File
    //   32: dup
    //   33: aload_0
    //   34: invokespecial 307	java/io/File:<init>	(Ljava/lang/String;)V
    //   37: astore 6
    //   39: aload 6
    //   41: invokevirtual 310	java/io/File:exists	()Z
    //   44: ifne +26 -> 70
    //   47: aload 6
    //   49: invokevirtual 541	java/io/File:getParentFile	()Ljava/io/File;
    //   52: ifnull +12 -> 64
    //   55: aload 6
    //   57: invokevirtual 541	java/io/File:getParentFile	()Ljava/io/File;
    //   60: invokevirtual 544	java/io/File:mkdirs	()Z
    //   63: pop
    //   64: aload 6
    //   66: invokevirtual 547	java/io/File:createNewFile	()Z
    //   69: pop
    //   70: aconst_null
    //   71: astore 5
    //   73: aconst_null
    //   74: astore_0
    //   75: aload_0
    //   76: astore 4
    //   78: aload 5
    //   80: astore_3
    //   81: aload 6
    //   83: invokevirtual 549	java/io/File:length	()J
    //   86: iload_2
    //   87: i2l
    //   88: lcmp
    //   89: iflt +60 -> 149
    //   92: aload_0
    //   93: astore 4
    //   95: aload 5
    //   97: astore_3
    //   98: new 551	java/io/FileOutputStream
    //   101: dup
    //   102: aload 6
    //   104: iconst_0
    //   105: invokespecial 554	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   108: astore_0
    //   109: aload_0
    //   110: astore 4
    //   112: aload_0
    //   113: astore_3
    //   114: aload_0
    //   115: aload_1
    //   116: ldc_w 556
    //   119: invokevirtual 559	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   122: invokevirtual 562	java/io/FileOutputStream:write	([B)V
    //   125: aload_0
    //   126: astore 4
    //   128: aload_0
    //   129: astore_3
    //   130: aload_0
    //   131: invokevirtual 565	java/io/FileOutputStream:flush	()V
    //   134: aload_0
    //   135: invokevirtual 566	java/io/FileOutputStream:close	()V
    //   138: ldc_w 568
    //   141: iconst_0
    //   142: anewarray 4	java/lang/Object
    //   145: invokestatic 95	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   148: return
    //   149: aload_0
    //   150: astore 4
    //   152: aload 5
    //   154: astore_3
    //   155: new 551	java/io/FileOutputStream
    //   158: dup
    //   159: aload 6
    //   161: iconst_1
    //   162: invokespecial 554	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   165: astore_0
    //   166: goto -57 -> 109
    //   169: astore_0
    //   170: aload 4
    //   172: astore_3
    //   173: aload_0
    //   174: invokevirtual 184	java/lang/Throwable:printStackTrace	()V
    //   177: aload 4
    //   179: astore_3
    //   180: ldc_w 570
    //   183: iconst_0
    //   184: anewarray 4	java/lang/Object
    //   187: invokestatic 99	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   190: aload 4
    //   192: ifnull -54 -> 138
    //   195: aload 4
    //   197: invokevirtual 566	java/io/FileOutputStream:close	()V
    //   200: goto -62 -> 138
    //   203: astore_0
    //   204: aload_0
    //   205: invokevirtual 184	java/lang/Throwable:printStackTrace	()V
    //   208: goto -70 -> 138
    //   211: astore_0
    //   212: aload_3
    //   213: ifnull +7 -> 220
    //   216: aload_3
    //   217: invokevirtual 566	java/io/FileOutputStream:close	()V
    //   220: aload_0
    //   221: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	222	0	paramString1	String
    //   0	222	1	paramString2	String
    //   0	222	2	paramInt	int
    //   80	137	3	localObject1	Object
    //   76	120	4	str	String
    //   71	82	5	localObject2	Object
    //   37	123	6	localFile	java.io.File
    // Exception table:
    //   from	to	target	type
    //   81	92	169	java/lang/Throwable
    //   98	109	169	java/lang/Throwable
    //   114	125	169	java/lang/Throwable
    //   130	134	169	java/lang/Throwable
    //   155	166	169	java/lang/Throwable
    //   39	64	203	java/lang/Throwable
    //   64	70	203	java/lang/Throwable
    //   134	138	203	java/lang/Throwable
    //   195	200	203	java/lang/Throwable
    //   216	220	203	java/lang/Throwable
    //   220	222	203	java/lang/Throwable
    //   81	92	211	finally
    //   98	109	211	finally
    //   114	125	211	finally
    //   130	134	211	finally
    //   155	166	211	finally
    //   173	177	211	finally
    //   180	190	211	finally
  }
  
  private void a(ArrayList<String> paramArrayList, Object paramObject)
  {
    if (paramObject.getClass().isArray())
    {
      if (!paramObject.getClass().getComponentType().toString().equals("byte")) {
        throw new IllegalArgumentException("only byte[] is supported");
      }
      if (Array.getLength(paramObject) > 0)
      {
        paramArrayList.add("java.util.List");
        a(paramArrayList, Array.get(paramObject, 0));
        return;
      }
      paramArrayList.add("Array");
      paramArrayList.add("?");
      return;
    }
    if ((paramObject instanceof Array)) {
      throw new IllegalArgumentException("can not support Array, please use List");
    }
    if ((paramObject instanceof List))
    {
      paramArrayList.add("java.util.List");
      paramObject = (List)paramObject;
      if (((List)paramObject).size() > 0)
      {
        a(paramArrayList, ((List)paramObject).get(0));
        return;
      }
      paramArrayList.add("?");
      return;
    }
    if ((paramObject instanceof Map))
    {
      paramArrayList.add("java.util.Map");
      Object localObject = (Map)paramObject;
      if (((Map)localObject).size() > 0)
      {
        paramObject = ((Map)localObject).keySet().iterator().next();
        localObject = ((Map)localObject).get(paramObject);
        paramArrayList.add(paramObject.getClass().getName());
        a(paramArrayList, localObject);
        return;
      }
      paramArrayList.add("?");
      paramArrayList.add("?");
      return;
    }
    paramArrayList.add(paramObject.getClass().getName());
  }
  
  /* Error */
  public static boolean a(Context paramContext, z paramz)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: aload_0
    //   6: ifnull +7 -> 13
    //   9: aload_1
    //   10: ifnonnull +15 -> 25
    //   13: ldc_w 618
    //   16: iconst_0
    //   17: anewarray 4	java/lang/Object
    //   20: invokestatic 75	com/tencent/feedback/common/e:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   23: iconst_0
    //   24: ireturn
    //   25: new 189	com/tencent/feedback/proguard/n
    //   28: dup
    //   29: aload_0
    //   30: invokespecial 192	com/tencent/feedback/proguard/n:<init>	(Landroid/content/Context;)V
    //   33: astore_2
    //   34: aload_2
    //   35: invokevirtual 196	com/tencent/feedback/proguard/n:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   38: astore_0
    //   39: aload_0
    //   40: ifnonnull +34 -> 74
    //   43: ldc_w 620
    //   46: iconst_0
    //   47: anewarray 4	java/lang/Object
    //   50: invokestatic 99	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   53: aload_0
    //   54: ifnull +14 -> 68
    //   57: aload_0
    //   58: invokevirtual 204	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   61: ifeq +7 -> 68
    //   64: aload_0
    //   65: invokevirtual 207	android/database/sqlite/SQLiteDatabase:close	()V
    //   68: aload_2
    //   69: invokevirtual 208	com/tencent/feedback/proguard/n:close	()V
    //   72: iconst_0
    //   73: ireturn
    //   74: aload_1
    //   75: ifnonnull +60 -> 135
    //   78: aload 4
    //   80: astore_3
    //   81: aload_3
    //   82: ifnull +223 -> 305
    //   85: aload_0
    //   86: ldc -46
    //   88: ldc_w 262
    //   91: aload_3
    //   92: invokevirtual 624	android/database/sqlite/SQLiteDatabase:replace	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   95: lstore 5
    //   97: lload 5
    //   99: lconst_0
    //   100: lcmp
    //   101: ifge +157 -> 258
    //   104: ldc_w 626
    //   107: iconst_0
    //   108: anewarray 4	java/lang/Object
    //   111: invokestatic 75	com/tencent/feedback/common/e:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   114: aload_0
    //   115: ifnull +14 -> 129
    //   118: aload_0
    //   119: invokevirtual 204	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   122: ifeq +7 -> 129
    //   125: aload_0
    //   126: invokevirtual 207	android/database/sqlite/SQLiteDatabase:close	()V
    //   129: aload_2
    //   130: invokevirtual 208	com/tencent/feedback/proguard/n:close	()V
    //   133: iconst_0
    //   134: ireturn
    //   135: new 628	android/content/ContentValues
    //   138: dup
    //   139: invokespecial 629	android/content/ContentValues:<init>	()V
    //   142: astore_3
    //   143: aload_1
    //   144: invokevirtual 630	com/tencent/feedback/proguard/z:a	()J
    //   147: lconst_0
    //   148: lcmp
    //   149: iflt +17 -> 166
    //   152: aload_3
    //   153: ldc_w 262
    //   156: aload_1
    //   157: invokevirtual 630	com/tencent/feedback/proguard/z:a	()J
    //   160: invokestatic 635	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   163: invokevirtual 639	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   166: aload_3
    //   167: ldc -36
    //   169: aload_1
    //   170: invokevirtual 251	com/tencent/feedback/proguard/z:b	()I
    //   173: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   176: invokevirtual 642	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   179: aload_3
    //   180: ldc_w 285
    //   183: aload_1
    //   184: invokevirtual 644	com/tencent/feedback/proguard/z:c	()[B
    //   187: invokevirtual 647	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   190: aload_3
    //   191: ldc_w 281
    //   194: aload_1
    //   195: invokevirtual 649	com/tencent/feedback/proguard/z:d	()J
    //   198: invokestatic 635	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   201: invokevirtual 639	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   204: goto -123 -> 81
    //   207: astore_3
    //   208: aload_2
    //   209: astore_1
    //   210: aload_3
    //   211: astore_2
    //   212: ldc_w 651
    //   215: iconst_1
    //   216: anewarray 4	java/lang/Object
    //   219: dup
    //   220: iconst_0
    //   221: aload_2
    //   222: invokevirtual 297	java/lang/Throwable:toString	()Ljava/lang/String;
    //   225: aastore
    //   226: invokestatic 99	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   229: aload_2
    //   230: invokevirtual 184	java/lang/Throwable:printStackTrace	()V
    //   233: aload_0
    //   234: ifnull +14 -> 248
    //   237: aload_0
    //   238: invokevirtual 204	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   241: ifeq +7 -> 248
    //   244: aload_0
    //   245: invokevirtual 207	android/database/sqlite/SQLiteDatabase:close	()V
    //   248: aload_1
    //   249: ifnull -226 -> 23
    //   252: aload_1
    //   253: invokevirtual 208	com/tencent/feedback/proguard/n:close	()V
    //   256: iconst_0
    //   257: ireturn
    //   258: aload_1
    //   259: lload 5
    //   261: invokevirtual 273	com/tencent/feedback/proguard/z:a	(J)V
    //   264: ldc_w 653
    //   267: iconst_1
    //   268: anewarray 4	java/lang/Object
    //   271: dup
    //   272: iconst_0
    //   273: aload_1
    //   274: invokevirtual 251	com/tencent/feedback/proguard/z:b	()I
    //   277: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   280: aastore
    //   281: invokestatic 655	com/tencent/feedback/common/e:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   284: aload_0
    //   285: ifnull +14 -> 299
    //   288: aload_0
    //   289: invokevirtual 204	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   292: ifeq +7 -> 299
    //   295: aload_0
    //   296: invokevirtual 207	android/database/sqlite/SQLiteDatabase:close	()V
    //   299: aload_2
    //   300: invokevirtual 208	com/tencent/feedback/proguard/n:close	()V
    //   303: iconst_1
    //   304: ireturn
    //   305: aload_0
    //   306: ifnull +14 -> 320
    //   309: aload_0
    //   310: invokevirtual 204	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   313: ifeq +7 -> 320
    //   316: aload_0
    //   317: invokevirtual 207	android/database/sqlite/SQLiteDatabase:close	()V
    //   320: aload_2
    //   321: invokevirtual 208	com/tencent/feedback/proguard/n:close	()V
    //   324: iconst_0
    //   325: ireturn
    //   326: astore_1
    //   327: aconst_null
    //   328: astore_0
    //   329: aconst_null
    //   330: astore_2
    //   331: aload_0
    //   332: ifnull +14 -> 346
    //   335: aload_0
    //   336: invokevirtual 204	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   339: ifeq +7 -> 346
    //   342: aload_0
    //   343: invokevirtual 207	android/database/sqlite/SQLiteDatabase:close	()V
    //   346: aload_2
    //   347: ifnull +7 -> 354
    //   350: aload_2
    //   351: invokevirtual 208	com/tencent/feedback/proguard/n:close	()V
    //   354: aload_1
    //   355: athrow
    //   356: astore_1
    //   357: aconst_null
    //   358: astore_0
    //   359: goto -28 -> 331
    //   362: astore_1
    //   363: goto -32 -> 331
    //   366: astore_3
    //   367: aload_1
    //   368: astore_2
    //   369: aload_3
    //   370: astore_1
    //   371: goto -40 -> 331
    //   374: astore_2
    //   375: aconst_null
    //   376: astore_0
    //   377: aload_3
    //   378: astore_1
    //   379: goto -167 -> 212
    //   382: astore_3
    //   383: aconst_null
    //   384: astore_0
    //   385: aload_2
    //   386: astore_1
    //   387: aload_3
    //   388: astore_2
    //   389: goto -177 -> 212
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	392	0	paramContext	Context
    //   0	392	1	paramz	z
    //   33	336	2	localObject1	Object
    //   374	12	2	localThrowable1	Throwable
    //   388	1	2	localThrowable2	Throwable
    //   1	190	3	localObject2	Object
    //   207	4	3	localThrowable3	Throwable
    //   366	12	3	localObject3	Object
    //   382	6	3	localThrowable4	Throwable
    //   3	76	4	localObject4	Object
    //   95	165	5	l	long
    // Exception table:
    //   from	to	target	type
    //   43	53	207	java/lang/Throwable
    //   85	97	207	java/lang/Throwable
    //   104	114	207	java/lang/Throwable
    //   135	166	207	java/lang/Throwable
    //   166	204	207	java/lang/Throwable
    //   258	284	207	java/lang/Throwable
    //   25	34	326	finally
    //   34	39	356	finally
    //   43	53	362	finally
    //   85	97	362	finally
    //   104	114	362	finally
    //   135	166	362	finally
    //   166	204	362	finally
    //   258	284	362	finally
    //   212	233	366	finally
    //   25	34	374	java/lang/Throwable
    //   34	39	382	java/lang/Throwable
  }
  
  /* Error */
  public static boolean a(java.io.File paramFile1, java.io.File paramFile2, int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: ldc_w 658
    //   6: iconst_0
    //   7: anewarray 4	java/lang/Object
    //   10: invokestatic 95	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   13: aload_0
    //   14: ifnull +15 -> 29
    //   17: aload_1
    //   18: ifnull +11 -> 29
    //   21: aload_0
    //   22: aload_1
    //   23: invokevirtual 659	java/io/File:equals	(Ljava/lang/Object;)Z
    //   26: ifeq +15 -> 41
    //   29: ldc_w 661
    //   32: iconst_0
    //   33: anewarray 4	java/lang/Object
    //   36: invokestatic 75	com/tencent/feedback/common/e:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   39: iconst_0
    //   40: ireturn
    //   41: aload_0
    //   42: invokevirtual 310	java/io/File:exists	()Z
    //   45: ifeq +10 -> 55
    //   48: aload_0
    //   49: invokevirtual 313	java/io/File:canRead	()Z
    //   52: ifne +15 -> 67
    //   55: ldc_w 663
    //   58: iconst_0
    //   59: anewarray 4	java/lang/Object
    //   62: invokestatic 75	com/tencent/feedback/common/e:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   65: iconst_0
    //   66: ireturn
    //   67: aload_1
    //   68: invokevirtual 541	java/io/File:getParentFile	()Ljava/io/File;
    //   71: ifnull +21 -> 92
    //   74: aload_1
    //   75: invokevirtual 541	java/io/File:getParentFile	()Ljava/io/File;
    //   78: invokevirtual 310	java/io/File:exists	()Z
    //   81: ifne +11 -> 92
    //   84: aload_1
    //   85: invokevirtual 541	java/io/File:getParentFile	()Ljava/io/File;
    //   88: invokevirtual 544	java/io/File:mkdirs	()Z
    //   91: pop
    //   92: aload_1
    //   93: invokevirtual 310	java/io/File:exists	()Z
    //   96: ifne +8 -> 104
    //   99: aload_1
    //   100: invokevirtual 547	java/io/File:createNewFile	()Z
    //   103: pop
    //   104: aload_1
    //   105: invokevirtual 310	java/io/File:exists	()Z
    //   108: ifeq -69 -> 39
    //   111: aload_1
    //   112: invokevirtual 313	java/io/File:canRead	()Z
    //   115: ifeq -76 -> 39
    //   118: new 315	java/io/FileInputStream
    //   121: dup
    //   122: aload_0
    //   123: invokespecial 318	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   126: astore_3
    //   127: new 665	java/util/zip/ZipOutputStream
    //   130: dup
    //   131: new 551	java/io/FileOutputStream
    //   134: dup
    //   135: aload_1
    //   136: invokespecial 666	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   139: invokespecial 669	java/util/zip/ZipOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   142: astore 4
    //   144: aload 4
    //   146: bipush 8
    //   148: invokevirtual 672	java/util/zip/ZipOutputStream:setMethod	(I)V
    //   151: aload 4
    //   153: new 674	java/util/zip/ZipEntry
    //   156: dup
    //   157: aload_0
    //   158: invokevirtual 675	java/io/File:getName	()Ljava/lang/String;
    //   161: invokespecial 676	java/util/zip/ZipEntry:<init>	(Ljava/lang/String;)V
    //   164: invokevirtual 680	java/util/zip/ZipOutputStream:putNextEntry	(Ljava/util/zip/ZipEntry;)V
    //   167: sipush 5000
    //   170: newarray <illegal type>
    //   172: astore_0
    //   173: aload_3
    //   174: aload_0
    //   175: invokevirtual 330	java/io/FileInputStream:read	([B)I
    //   178: istore_2
    //   179: iload_2
    //   180: ifle +63 -> 243
    //   183: aload 4
    //   185: aload_0
    //   186: iconst_0
    //   187: iload_2
    //   188: invokevirtual 682	java/util/zip/ZipOutputStream:write	([BII)V
    //   191: goto -18 -> 173
    //   194: astore 5
    //   196: aload_3
    //   197: astore_1
    //   198: aload 4
    //   200: astore_0
    //   201: aload 5
    //   203: astore_3
    //   204: aload_3
    //   205: invokevirtual 184	java/lang/Throwable:printStackTrace	()V
    //   208: aload_1
    //   209: ifnull +7 -> 216
    //   212: aload_1
    //   213: invokevirtual 339	java/io/FileInputStream:close	()V
    //   216: aload_0
    //   217: ifnull +7 -> 224
    //   220: aload_0
    //   221: invokevirtual 683	java/util/zip/ZipOutputStream:close	()V
    //   224: ldc_w 685
    //   227: iconst_0
    //   228: anewarray 4	java/lang/Object
    //   231: invokestatic 95	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   234: iconst_0
    //   235: ireturn
    //   236: astore_0
    //   237: aload_0
    //   238: invokevirtual 184	java/lang/Throwable:printStackTrace	()V
    //   241: iconst_0
    //   242: ireturn
    //   243: aload 4
    //   245: invokevirtual 686	java/util/zip/ZipOutputStream:flush	()V
    //   248: aload 4
    //   250: invokevirtual 689	java/util/zip/ZipOutputStream:closeEntry	()V
    //   253: aload_3
    //   254: invokevirtual 339	java/io/FileInputStream:close	()V
    //   257: aload 4
    //   259: invokevirtual 683	java/util/zip/ZipOutputStream:close	()V
    //   262: ldc_w 685
    //   265: iconst_0
    //   266: anewarray 4	java/lang/Object
    //   269: invokestatic 95	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   272: iconst_1
    //   273: ireturn
    //   274: astore_0
    //   275: aload_0
    //   276: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   279: goto -22 -> 257
    //   282: astore_0
    //   283: aload_0
    //   284: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   287: goto -25 -> 262
    //   290: astore_1
    //   291: aload_1
    //   292: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   295: goto -79 -> 216
    //   298: astore_0
    //   299: aload_0
    //   300: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   303: goto -79 -> 224
    //   306: astore_1
    //   307: aconst_null
    //   308: astore_0
    //   309: aconst_null
    //   310: astore_3
    //   311: aload_3
    //   312: ifnull +7 -> 319
    //   315: aload_3
    //   316: invokevirtual 339	java/io/FileInputStream:close	()V
    //   319: aload_0
    //   320: ifnull +7 -> 327
    //   323: aload_0
    //   324: invokevirtual 683	java/util/zip/ZipOutputStream:close	()V
    //   327: ldc_w 685
    //   330: iconst_0
    //   331: anewarray 4	java/lang/Object
    //   334: invokestatic 95	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   337: aload_1
    //   338: athrow
    //   339: astore_3
    //   340: aload_3
    //   341: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   344: goto -25 -> 319
    //   347: astore_0
    //   348: aload_0
    //   349: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   352: goto -25 -> 327
    //   355: astore_1
    //   356: aconst_null
    //   357: astore_0
    //   358: goto -47 -> 311
    //   361: astore_1
    //   362: aload 4
    //   364: astore_0
    //   365: goto -54 -> 311
    //   368: astore 4
    //   370: aload_1
    //   371: astore_3
    //   372: aload 4
    //   374: astore_1
    //   375: goto -64 -> 311
    //   378: astore_3
    //   379: aconst_null
    //   380: astore_0
    //   381: aload 4
    //   383: astore_1
    //   384: goto -180 -> 204
    //   387: astore 4
    //   389: aconst_null
    //   390: astore_0
    //   391: aload_3
    //   392: astore_1
    //   393: aload 4
    //   395: astore_3
    //   396: goto -192 -> 204
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	399	0	paramFile1	java.io.File
    //   0	399	1	paramFile2	java.io.File
    //   0	399	2	paramInt	int
    //   126	190	3	localObject1	Object
    //   339	2	3	localIOException	java.io.IOException
    //   371	1	3	localFile	java.io.File
    //   378	14	3	localThrowable1	Throwable
    //   395	1	3	localThrowable2	Throwable
    //   1	362	4	localZipOutputStream	java.util.zip.ZipOutputStream
    //   368	14	4	localObject2	Object
    //   387	7	4	localThrowable3	Throwable
    //   194	8	5	localThrowable4	Throwable
    // Exception table:
    //   from	to	target	type
    //   144	173	194	java/lang/Throwable
    //   173	179	194	java/lang/Throwable
    //   183	191	194	java/lang/Throwable
    //   243	253	194	java/lang/Throwable
    //   67	92	236	java/lang/Throwable
    //   92	104	236	java/lang/Throwable
    //   253	257	274	java/io/IOException
    //   257	262	282	java/io/IOException
    //   212	216	290	java/io/IOException
    //   220	224	298	java/io/IOException
    //   118	127	306	finally
    //   315	319	339	java/io/IOException
    //   323	327	347	java/io/IOException
    //   127	144	355	finally
    //   144	173	361	finally
    //   173	179	361	finally
    //   183	191	361	finally
    //   243	253	361	finally
    //   204	208	368	finally
    //   118	127	378	java/lang/Throwable
    //   127	144	387	java/lang/Throwable
  }
  
  /* Error */
  public static boolean a(String[] paramArrayOfString, com.tencent.feedback.eup.a<String> parama)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +8 -> 9
    //   4: aload_0
    //   5: arraylength
    //   6: ifgt +5 -> 11
    //   9: iconst_0
    //   10: ireturn
    //   11: aconst_null
    //   12: astore_3
    //   13: aconst_null
    //   14: astore_2
    //   15: invokestatic 467	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   18: aload_0
    //   19: invokevirtual 471	java/lang/Runtime:exec	([Ljava/lang/String;)Ljava/lang/Process;
    //   22: astore_0
    //   23: aload_1
    //   24: ifnull +147 -> 171
    //   27: aload_0
    //   28: astore_2
    //   29: aload_0
    //   30: astore_3
    //   31: new 473	java/io/BufferedReader
    //   34: dup
    //   35: new 475	java/io/InputStreamReader
    //   38: dup
    //   39: aload_0
    //   40: invokevirtual 481	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   43: invokespecial 484	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   46: invokespecial 487	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   49: astore 4
    //   51: aload_0
    //   52: astore_2
    //   53: aload_0
    //   54: astore_3
    //   55: aload 4
    //   57: invokevirtual 490	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   60: astore 5
    //   62: aload 5
    //   64: ifnull +71 -> 135
    //   67: aload_0
    //   68: astore_2
    //   69: aload_0
    //   70: astore_3
    //   71: aload_1
    //   72: aload 5
    //   74: invokevirtual 693	com/tencent/feedback/eup/a:add	(Ljava/lang/Object;)Z
    //   77: pop
    //   78: goto -27 -> 51
    //   81: astore_0
    //   82: aload_2
    //   83: astore_3
    //   84: aload_0
    //   85: invokevirtual 184	java/lang/Throwable:printStackTrace	()V
    //   88: aload_2
    //   89: astore_3
    //   90: aload_0
    //   91: invokevirtual 694	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   94: iconst_0
    //   95: anewarray 4	java/lang/Object
    //   98: invokestatic 99	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   101: aload_2
    //   102: ifnull -93 -> 9
    //   105: aload_2
    //   106: invokevirtual 698	java/lang/Process:getOutputStream	()Ljava/io/OutputStream;
    //   109: invokevirtual 701	java/io/OutputStream:close	()V
    //   112: aload_2
    //   113: invokevirtual 481	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   116: invokevirtual 704	java/io/InputStream:close	()V
    //   119: aload_2
    //   120: invokevirtual 494	java/lang/Process:getErrorStream	()Ljava/io/InputStream;
    //   123: invokevirtual 704	java/io/InputStream:close	()V
    //   126: iconst_0
    //   127: ireturn
    //   128: astore_0
    //   129: aload_0
    //   130: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   133: iconst_0
    //   134: ireturn
    //   135: aload_0
    //   136: astore_2
    //   137: aload_0
    //   138: astore_3
    //   139: aload 4
    //   141: invokevirtual 491	java/io/BufferedReader:close	()V
    //   144: aload_0
    //   145: ifnull +24 -> 169
    //   148: aload_0
    //   149: invokevirtual 698	java/lang/Process:getOutputStream	()Ljava/io/OutputStream;
    //   152: invokevirtual 701	java/io/OutputStream:close	()V
    //   155: aload_0
    //   156: invokevirtual 481	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   159: invokevirtual 704	java/io/InputStream:close	()V
    //   162: aload_0
    //   163: invokevirtual 494	java/lang/Process:getErrorStream	()Ljava/io/InputStream;
    //   166: invokevirtual 704	java/io/InputStream:close	()V
    //   169: iconst_1
    //   170: ireturn
    //   171: aload_0
    //   172: astore_2
    //   173: aload_0
    //   174: astore_3
    //   175: aload_0
    //   176: invokevirtual 707	java/lang/Process:waitFor	()I
    //   179: pop
    //   180: goto -36 -> 144
    //   183: astore_0
    //   184: aload_3
    //   185: ifnull +24 -> 209
    //   188: aload_3
    //   189: invokevirtual 698	java/lang/Process:getOutputStream	()Ljava/io/OutputStream;
    //   192: invokevirtual 701	java/io/OutputStream:close	()V
    //   195: aload_3
    //   196: invokevirtual 481	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   199: invokevirtual 704	java/io/InputStream:close	()V
    //   202: aload_3
    //   203: invokevirtual 494	java/lang/Process:getErrorStream	()Ljava/io/InputStream;
    //   206: invokevirtual 704	java/io/InputStream:close	()V
    //   209: aload_0
    //   210: athrow
    //   211: astore_1
    //   212: aload_1
    //   213: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   216: goto -61 -> 155
    //   219: astore_1
    //   220: aload_1
    //   221: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   224: goto -62 -> 162
    //   227: astore_0
    //   228: aload_0
    //   229: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   232: goto -63 -> 169
    //   235: astore_0
    //   236: aload_0
    //   237: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   240: goto -128 -> 112
    //   243: astore_0
    //   244: aload_0
    //   245: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   248: goto -129 -> 119
    //   251: astore_1
    //   252: aload_1
    //   253: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   256: goto -61 -> 195
    //   259: astore_1
    //   260: aload_1
    //   261: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   264: goto -62 -> 202
    //   267: astore_1
    //   268: aload_1
    //   269: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   272: goto -63 -> 209
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	275	0	paramArrayOfString	String[]
    //   0	275	1	parama	com.tencent.feedback.eup.a<String>
    //   14	159	2	arrayOfString	String[]
    //   12	191	3	localObject	Object
    //   49	91	4	localBufferedReader	java.io.BufferedReader
    //   60	13	5	str	String
    // Exception table:
    //   from	to	target	type
    //   15	23	81	java/lang/Throwable
    //   31	51	81	java/lang/Throwable
    //   55	62	81	java/lang/Throwable
    //   71	78	81	java/lang/Throwable
    //   139	144	81	java/lang/Throwable
    //   175	180	81	java/lang/Throwable
    //   119	126	128	java/io/IOException
    //   15	23	183	finally
    //   31	51	183	finally
    //   55	62	183	finally
    //   71	78	183	finally
    //   84	88	183	finally
    //   90	101	183	finally
    //   139	144	183	finally
    //   175	180	183	finally
    //   148	155	211	java/io/IOException
    //   155	162	219	java/io/IOException
    //   162	169	227	java/io/IOException
    //   105	112	235	java/io/IOException
    //   112	119	243	java/io/IOException
    //   188	195	251	java/io/IOException
    //   195	202	259	java/io/IOException
    //   202	209	267	java/io/IOException
  }
  
  /* Error */
  public static byte[] a(Object paramObject)
  {
    // Byte code:
    //   0: ldc_w 710
    //   3: iconst_0
    //   4: anewarray 4	java/lang/Object
    //   7: invokestatic 95	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   10: aload_0
    //   11: ifnull +13 -> 24
    //   14: ldc_w 712
    //   17: aload_0
    //   18: invokevirtual 715	java/lang/Class:isInstance	(Ljava/lang/Object;)Z
    //   21: ifne +15 -> 36
    //   24: ldc_w 717
    //   27: iconst_0
    //   28: anewarray 4	java/lang/Object
    //   31: invokestatic 75	com/tencent/feedback/common/e:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   34: aconst_null
    //   35: areturn
    //   36: new 719	java/io/ByteArrayOutputStream
    //   39: dup
    //   40: invokespecial 720	java/io/ByteArrayOutputStream:<init>	()V
    //   43: astore 4
    //   45: new 722	java/io/ObjectOutputStream
    //   48: dup
    //   49: aload 4
    //   51: invokespecial 723	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   54: astore_2
    //   55: aload_2
    //   56: astore_1
    //   57: aload_2
    //   58: aload_0
    //   59: invokevirtual 727	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   62: aload_2
    //   63: astore_1
    //   64: aload_2
    //   65: invokevirtual 728	java/io/ObjectOutputStream:flush	()V
    //   68: aload_2
    //   69: astore_1
    //   70: aload 4
    //   72: invokevirtual 731	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   75: astore_0
    //   76: aload_2
    //   77: invokevirtual 732	java/io/ObjectOutputStream:close	()V
    //   80: aload 4
    //   82: invokevirtual 733	java/io/ByteArrayOutputStream:close	()V
    //   85: aload_0
    //   86: areturn
    //   87: astore_1
    //   88: aload_1
    //   89: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   92: aload_0
    //   93: areturn
    //   94: astore_1
    //   95: aload_1
    //   96: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   99: goto -19 -> 80
    //   102: astore_3
    //   103: aconst_null
    //   104: astore_0
    //   105: aload_0
    //   106: astore_1
    //   107: aload_3
    //   108: invokevirtual 184	java/lang/Throwable:printStackTrace	()V
    //   111: aload_0
    //   112: astore_1
    //   113: aload_3
    //   114: invokevirtual 694	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   117: iconst_0
    //   118: anewarray 4	java/lang/Object
    //   121: invokestatic 99	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   124: aload_0
    //   125: ifnull +7 -> 132
    //   128: aload_0
    //   129: invokevirtual 732	java/io/ObjectOutputStream:close	()V
    //   132: aload 4
    //   134: invokevirtual 733	java/io/ByteArrayOutputStream:close	()V
    //   137: aconst_null
    //   138: areturn
    //   139: astore_0
    //   140: aload_0
    //   141: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   144: aconst_null
    //   145: areturn
    //   146: astore_0
    //   147: aload_0
    //   148: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   151: goto -19 -> 132
    //   154: astore_0
    //   155: aconst_null
    //   156: astore_1
    //   157: aload_1
    //   158: ifnull +7 -> 165
    //   161: aload_1
    //   162: invokevirtual 732	java/io/ObjectOutputStream:close	()V
    //   165: aload 4
    //   167: invokevirtual 733	java/io/ByteArrayOutputStream:close	()V
    //   170: aload_0
    //   171: athrow
    //   172: astore_1
    //   173: aload_1
    //   174: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   177: goto -12 -> 165
    //   180: astore_1
    //   181: aload_1
    //   182: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   185: goto -15 -> 170
    //   188: astore_0
    //   189: goto -32 -> 157
    //   192: astore_3
    //   193: aload_2
    //   194: astore_0
    //   195: goto -90 -> 105
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	198	0	paramObject	Object
    //   56	14	1	localObjectOutputStream1	java.io.ObjectOutputStream
    //   87	2	1	localIOException1	java.io.IOException
    //   94	2	1	localIOException2	java.io.IOException
    //   106	56	1	localObject	Object
    //   172	2	1	localIOException3	java.io.IOException
    //   180	2	1	localIOException4	java.io.IOException
    //   54	140	2	localObjectOutputStream2	java.io.ObjectOutputStream
    //   102	12	3	localThrowable1	Throwable
    //   192	1	3	localThrowable2	Throwable
    //   43	123	4	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    // Exception table:
    //   from	to	target	type
    //   80	85	87	java/io/IOException
    //   76	80	94	java/io/IOException
    //   45	55	102	java/lang/Throwable
    //   132	137	139	java/io/IOException
    //   128	132	146	java/io/IOException
    //   45	55	154	finally
    //   161	165	172	java/io/IOException
    //   165	170	180	java/io/IOException
    //   57	62	188	finally
    //   64	68	188	finally
    //   70	76	188	finally
    //   107	111	188	finally
    //   113	124	188	finally
    //   57	62	192	java/lang/Throwable
    //   64	68	192	java/lang/Throwable
    //   70	76	192	java/lang/Throwable
  }
  
  /* Error */
  public static byte[] a(String paramString, int paramInt)
  {
    // Byte code:
    //   0: new 425	java/lang/StringBuilder
    //   3: dup
    //   4: ldc_w 736
    //   7: invokespecial 428	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   10: iload_1
    //   11: invokevirtual 739	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   14: invokevirtual 433	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   17: iconst_0
    //   18: anewarray 4	java/lang/Object
    //   21: invokestatic 741	com/tencent/feedback/common/e:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   24: new 37	java/util/ArrayList
    //   27: dup
    //   28: invokespecial 461	java/util/ArrayList:<init>	()V
    //   31: astore_2
    //   32: aload_2
    //   33: invokevirtual 744	java/util/ArrayList:clear	()V
    //   36: aload_2
    //   37: ldc_w 746
    //   40: invokevirtual 60	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   43: pop
    //   44: aload_2
    //   45: ldc_w 748
    //   48: invokevirtual 60	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   51: pop
    //   52: aload_2
    //   53: ldc_w 750
    //   56: invokevirtual 60	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   59: pop
    //   60: aload_2
    //   61: ldc_w 752
    //   64: invokevirtual 60	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   67: pop
    //   68: aload_0
    //   69: ifnull +24 -> 93
    //   72: aload_0
    //   73: invokevirtual 148	java/lang/String:length	()I
    //   76: ifle +17 -> 93
    //   79: aload_2
    //   80: ldc_w 754
    //   83: invokevirtual 60	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   86: pop
    //   87: aload_2
    //   88: aload_0
    //   89: invokevirtual 60	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   92: pop
    //   93: aload_2
    //   94: invokevirtual 64	java/util/ArrayList:size	()I
    //   97: anewarray 142	java/lang/String
    //   100: astore_3
    //   101: aload_2
    //   102: aload_3
    //   103: invokevirtual 758	java/util/ArrayList:toArray	([Ljava/lang/Object;)[Ljava/lang/Object;
    //   106: pop
    //   107: new 692	com/tencent/feedback/eup/a
    //   110: dup
    //   111: iload_1
    //   112: invokespecial 759	com/tencent/feedback/eup/a:<init>	(I)V
    //   115: astore_0
    //   116: aload_3
    //   117: aload_0
    //   118: invokestatic 761	com/tencent/feedback/proguard/a:a	([Ljava/lang/String;Lcom/tencent/feedback/eup/a;)Z
    //   121: pop
    //   122: aload_0
    //   123: invokevirtual 762	com/tencent/feedback/eup/a:size	()I
    //   126: ifgt +5 -> 131
    //   129: aconst_null
    //   130: areturn
    //   131: new 425	java/lang/StringBuilder
    //   134: dup
    //   135: ldc_w 764
    //   138: invokespecial 428	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   141: aload_0
    //   142: invokevirtual 762	com/tencent/feedback/eup/a:size	()I
    //   145: invokevirtual 739	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   148: invokevirtual 433	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   151: iconst_0
    //   152: anewarray 4	java/lang/Object
    //   155: invokestatic 741	com/tencent/feedback/common/e:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   158: new 350	java/lang/StringBuffer
    //   161: dup
    //   162: invokespecial 351	java/lang/StringBuffer:<init>	()V
    //   165: astore_2
    //   166: aload_0
    //   167: invokevirtual 765	com/tencent/feedback/eup/a:iterator	()Ljava/util/Iterator;
    //   170: astore_3
    //   171: aload_3
    //   172: invokeinterface 449 1 0
    //   177: ifeq +66 -> 243
    //   180: aload_2
    //   181: new 425	java/lang/StringBuilder
    //   184: dup
    //   185: invokespecial 434	java/lang/StringBuilder:<init>	()V
    //   188: aload_3
    //   189: invokeinterface 453 1 0
    //   194: checkcast 142	java/lang/String
    //   197: invokevirtual 432	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   200: ldc_w 767
    //   203: invokevirtual 432	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: invokevirtual 433	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   209: invokevirtual 456	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   212: pop
    //   213: goto -42 -> 171
    //   216: astore_0
    //   217: aload_0
    //   218: invokevirtual 184	java/lang/Throwable:printStackTrace	()V
    //   221: ldc_w 769
    //   224: iconst_0
    //   225: anewarray 4	java/lang/Object
    //   228: invokestatic 99	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   231: ldc_w 771
    //   234: iconst_0
    //   235: anewarray 4	java/lang/Object
    //   238: invokestatic 741	com/tencent/feedback/common/e:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   241: aconst_null
    //   242: areturn
    //   243: aload_0
    //   244: invokevirtual 772	com/tencent/feedback/eup/a:clear	()V
    //   247: aload_2
    //   248: invokevirtual 457	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   251: ldc_w 774
    //   254: invokevirtual 559	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   257: astore_0
    //   258: aload_2
    //   259: iconst_0
    //   260: invokevirtual 777	java/lang/StringBuffer:setLength	(I)V
    //   263: ldc_w 771
    //   266: iconst_0
    //   267: anewarray 4	java/lang/Object
    //   270: invokestatic 741	com/tencent/feedback/common/e:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   273: aload_0
    //   274: areturn
    //   275: astore_0
    //   276: ldc_w 771
    //   279: iconst_0
    //   280: anewarray 4	java/lang/Object
    //   283: invokestatic 741	com/tencent/feedback/common/e:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   286: aload_0
    //   287: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	288	0	paramString	String
    //   0	288	1	paramInt	int
    //   31	228	2	localObject1	Object
    //   100	89	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   158	171	216	java/lang/Throwable
    //   171	213	216	java/lang/Throwable
    //   243	263	216	java/lang/Throwable
    //   158	171	275	finally
    //   171	213	275	finally
    //   217	231	275	finally
    //   243	263	275	finally
  }
  
  public static byte[] a(byte[] paramArrayOfByte, int paramInt)
  {
    if ((paramArrayOfByte == null) || (paramInt == -1)) {
      return paramArrayOfByte;
    }
    e.b("rqdp{  zp:} %s rqdp{  len:} %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfByte.length) });
    try
    {
      N localN = M.a(paramInt);
      if (localN == null) {
        return null;
      }
      paramArrayOfByte = localN.a(paramArrayOfByte);
      return paramArrayOfByte;
    }
    catch (Throwable paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
      e.d("rqdp{  err zp :} %s", new Object[] { paramArrayOfByte.toString() });
    }
    return null;
  }
  
  public static byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, String paramString)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    try
    {
      paramArrayOfByte = a(a(paramArrayOfByte, paramInt1), paramInt2, paramString);
      return paramArrayOfByte;
    }
    catch (Throwable paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
    }
    return null;
  }
  
  public static byte[] a(byte[] paramArrayOfByte, int paramInt, String paramString)
  {
    if ((paramArrayOfByte == null) || (paramInt == -1)) {
      return paramArrayOfByte;
    }
    e.b("rqdp{  enD:} %d %d", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(paramInt) });
    if (paramInt == 1) {}
    Object localObject;
    try
    {
      localObject = new R();
    }
    catch (Throwable paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
      e.d("rqdp{  err enD: }%s", new Object[] { paramArrayOfByte.toString() });
      return null;
    }
    if (paramInt == 3) {
      localObject = new Q();
    } else {
      localObject = null;
    }
    while (localObject != null)
    {
      ((S)localObject).a(paramString);
      paramArrayOfByte = ((S)localObject).b(paramArrayOfByte);
      return paramArrayOfByte;
    }
    return null;
  }
  
  public static q[] a(Context paramContext, String paramString)
  {
    if ((paramContext == null) || (paramString == null)) {}
    for (;;)
    {
      try
      {
        e.c("rqdp{  args error}", new Object[0]);
        paramContext = null;
        return paramContext;
      }
      finally {}
      paramString = l.a(paramContext, new int[] { 9 }, -1, -1, 10000L, -1, paramString, -1, -1, -1, -1, -1L, Long.MAX_VALUE);
      if ((paramString != null) && (paramString.size() > 0))
      {
        paramContext = new ArrayList(paramString.size());
        paramString = paramString.iterator();
        if (paramString.hasNext())
        {
          l locall = (l)paramString.next();
          Object localObject = b(locall.b());
          if ((localObject != null) && (q.class.isInstance(localObject)))
          {
            localObject = (q)q.class.cast(localObject);
            ((q)localObject).b(locall.a());
            paramContext.add(localObject);
          }
        }
        else if (paramContext.size() > 0)
        {
          paramContext = (q[])paramContext.toArray(new q[0]);
        }
        else
        {
          paramContext = null;
        }
      }
      else
      {
        paramContext = null;
      }
    }
  }
  
  public static Long[] a(LinkedHashMap<Long, Long> paramLinkedHashMap, long paramLong)
  {
    if ((paramLinkedHashMap == null) || (paramLinkedHashMap.size() <= 0) || (paramLong <= 0L)) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramLinkedHashMap.keySet().iterator();
    long l1 = 0L;
    if ((localIterator.hasNext()) && (l1 < paramLong))
    {
      long l2 = ((Long)localIterator.next()).longValue();
      long l3 = ((Long)paramLinkedHashMap.get(Long.valueOf(l2))).longValue();
      if (l1 + l3 > paramLong) {
        break label141;
      }
      localArrayList.add(Long.valueOf(l2));
      l1 = l3 + l1;
    }
    label141:
    for (;;)
    {
      break;
      if (localArrayList.size() > 0) {
        return (Long[])localArrayList.toArray(new Long[1]);
      }
      return null;
    }
  }
  
  /* Error */
  public static int b(Context paramContext, int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore_2
    //   5: aconst_null
    //   6: astore 6
    //   8: aconst_null
    //   9: astore_3
    //   10: aload_0
    //   11: ifnonnull +15 -> 26
    //   14: ldc_w 835
    //   17: iconst_0
    //   18: anewarray 4	java/lang/Object
    //   21: invokestatic 75	com/tencent/feedback/common/e:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   24: iconst_0
    //   25: ireturn
    //   26: new 189	com/tencent/feedback/proguard/n
    //   29: dup
    //   30: aload_0
    //   31: invokespecial 192	com/tencent/feedback/proguard/n:<init>	(Landroid/content/Context;)V
    //   34: astore 4
    //   36: aload_2
    //   37: astore_0
    //   38: aload 4
    //   40: astore_2
    //   41: aload 6
    //   43: astore_3
    //   44: aload 4
    //   46: invokevirtual 196	com/tencent/feedback/proguard/n:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   49: astore 5
    //   51: aload 5
    //   53: ifnonnull +47 -> 100
    //   56: aload 5
    //   58: astore_0
    //   59: aload 4
    //   61: astore_2
    //   62: aload 5
    //   64: astore_3
    //   65: ldc_w 620
    //   68: iconst_0
    //   69: anewarray 4	java/lang/Object
    //   72: invokestatic 99	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   75: aload 5
    //   77: ifnull +16 -> 93
    //   80: aload 5
    //   82: invokevirtual 204	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   85: ifeq +8 -> 93
    //   88: aload 5
    //   90: invokevirtual 207	android/database/sqlite/SQLiteDatabase:close	()V
    //   93: aload 4
    //   95: invokevirtual 208	com/tencent/feedback/proguard/n:close	()V
    //   98: iconst_0
    //   99: ireturn
    //   100: aload 5
    //   102: astore_0
    //   103: aload 4
    //   105: astore_2
    //   106: aload 5
    //   108: astore_3
    //   109: aload 5
    //   111: ldc -46
    //   113: ldc_w 837
    //   116: iconst_2
    //   117: anewarray 4	java/lang/Object
    //   120: dup
    //   121: iconst_0
    //   122: ldc -36
    //   124: aastore
    //   125: dup
    //   126: iconst_1
    //   127: sipush 302
    //   130: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   133: aastore
    //   134: invokestatic 840	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   137: aconst_null
    //   138: invokevirtual 844	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   141: istore_1
    //   142: aload 5
    //   144: astore_0
    //   145: aload 4
    //   147: astore_2
    //   148: aload 5
    //   150: astore_3
    //   151: ldc_w 846
    //   154: iconst_2
    //   155: anewarray 4	java/lang/Object
    //   158: dup
    //   159: iconst_0
    //   160: sipush 302
    //   163: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   166: aastore
    //   167: dup
    //   168: iconst_1
    //   169: iload_1
    //   170: invokestatic 226	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   173: aastore
    //   174: invokestatic 253	com/tencent/feedback/common/e:g	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   177: aload 5
    //   179: ifnull +16 -> 195
    //   182: aload 5
    //   184: invokevirtual 204	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   187: ifeq +8 -> 195
    //   190: aload 5
    //   192: invokevirtual 207	android/database/sqlite/SQLiteDatabase:close	()V
    //   195: aload 4
    //   197: invokevirtual 208	com/tencent/feedback/proguard/n:close	()V
    //   200: iload_1
    //   201: ireturn
    //   202: astore 5
    //   204: aconst_null
    //   205: astore 4
    //   207: aload_3
    //   208: astore_0
    //   209: aload 4
    //   211: astore_2
    //   212: aload 5
    //   214: invokevirtual 184	java/lang/Throwable:printStackTrace	()V
    //   217: aload_3
    //   218: astore_0
    //   219: aload 4
    //   221: astore_2
    //   222: ldc_w 848
    //   225: iconst_1
    //   226: anewarray 4	java/lang/Object
    //   229: dup
    //   230: iconst_0
    //   231: aload 5
    //   233: invokevirtual 297	java/lang/Throwable:toString	()Ljava/lang/String;
    //   236: aastore
    //   237: invokestatic 99	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   240: aload_3
    //   241: ifnull +14 -> 255
    //   244: aload_3
    //   245: invokevirtual 204	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   248: ifeq +7 -> 255
    //   251: aload_3
    //   252: invokevirtual 207	android/database/sqlite/SQLiteDatabase:close	()V
    //   255: aload 4
    //   257: ifnull -233 -> 24
    //   260: aload 4
    //   262: invokevirtual 208	com/tencent/feedback/proguard/n:close	()V
    //   265: iconst_0
    //   266: ireturn
    //   267: astore_3
    //   268: aconst_null
    //   269: astore_2
    //   270: aload 5
    //   272: astore_0
    //   273: aload_0
    //   274: ifnull +14 -> 288
    //   277: aload_0
    //   278: invokevirtual 204	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   281: ifeq +7 -> 288
    //   284: aload_0
    //   285: invokevirtual 207	android/database/sqlite/SQLiteDatabase:close	()V
    //   288: aload_2
    //   289: ifnull +7 -> 296
    //   292: aload_2
    //   293: invokevirtual 208	com/tencent/feedback/proguard/n:close	()V
    //   296: aload_3
    //   297: athrow
    //   298: astore_3
    //   299: goto -26 -> 273
    //   302: astore 5
    //   304: goto -97 -> 207
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	307	0	paramContext	Context
    //   0	307	1	paramInt	int
    //   4	289	2	localObject1	Object
    //   9	243	3	localObject2	Object
    //   267	30	3	localObject3	Object
    //   298	1	3	localObject4	Object
    //   34	227	4	localn	n
    //   1	190	5	localSQLiteDatabase	android.database.sqlite.SQLiteDatabase
    //   202	69	5	localThrowable1	Throwable
    //   302	1	5	localThrowable2	Throwable
    //   6	36	6	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   26	36	202	java/lang/Throwable
    //   26	36	267	finally
    //   44	51	298	finally
    //   65	75	298	finally
    //   109	142	298	finally
    //   151	177	298	finally
    //   212	217	298	finally
    //   222	240	298	finally
    //   44	51	302	java/lang/Throwable
    //   65	75	302	java/lang/Throwable
    //   109	142	302	java/lang/Throwable
    //   151	177	302	java/lang/Throwable
  }
  
  public static int b(Context paramContext, String paramString)
  {
    int i = 0;
    if ((paramContext == null) || (paramString == null)) {}
    for (;;)
    {
      try
      {
        e.c("rqdp{  args error}", new Object[0]);
        return i;
      }
      finally {}
      i = l.a(paramContext, new int[] { 9 }, -1L, Long.MAX_VALUE, paramString);
    }
  }
  
  public static int b(Context paramContext, p[] paramArrayOfp)
  {
    int j = 0;
    int i;
    if (paramContext == null) {
      i = -1;
    }
    ArrayList localArrayList;
    do
    {
      return i;
      if (paramArrayOfp == null) {
        return l.a(paramContext, new int[] { 7 }, -1L, Long.MAX_VALUE);
      }
      localArrayList = new ArrayList();
      int k = paramArrayOfp.length;
      i = 0;
      while (i < k)
      {
        p localp = paramArrayOfp[i];
        if (localp.a() >= 0L) {
          localArrayList.add(Long.valueOf(localp.a()));
        }
        i += 1;
      }
      i = j;
    } while (localArrayList.size() <= 0);
    return l.a(paramContext, (Long[])localArrayList.toArray(new Long[0]));
  }
  
  public static int b(Context paramContext, q[] paramArrayOfq)
  {
    int j = 0;
    if ((paramContext != null) && (paramArrayOfq != null)) {}
    for (;;)
    {
      try
      {
        if (paramArrayOfq.length <= 0)
        {
          e.c("rqdp{  args error}", new Object[0]);
          i = j;
          return i;
        }
        ArrayList localArrayList = new ArrayList(paramArrayOfq.length);
        int k = paramArrayOfq.length;
        int i = 0;
        if (i < k)
        {
          q localq = paramArrayOfq[i];
          if (localq.d() >= 0L) {
            localArrayList.add(Long.valueOf(localq.d()));
          }
        }
        else
        {
          i = j;
          if (localArrayList.size() <= 0) {
            continue;
          }
          i = l.a(paramContext, (Long[])localArrayList.toArray(new Long[0]));
          continue;
        }
        i += 1;
      }
      finally {}
    }
  }
  
  public static long b()
  {
    try
    {
      SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
      long l = localSimpleDateFormat.parse(localSimpleDateFormat.format(new Date())).getTime();
      return l;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
    }
    return -1L;
  }
  
  /* Error */
  public static Object b(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc_w 876
    //   3: iconst_0
    //   4: anewarray 4	java/lang/Object
    //   7: invokestatic 95	com/tencent/feedback/common/e:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   10: aload_0
    //   11: ifnull +8 -> 19
    //   14: aload_0
    //   15: arraylength
    //   16: ifge +5 -> 21
    //   19: aconst_null
    //   20: areturn
    //   21: new 878	java/io/ByteArrayInputStream
    //   24: dup
    //   25: aload_0
    //   26: invokespecial 880	java/io/ByteArrayInputStream:<init>	([B)V
    //   29: astore_3
    //   30: new 882	java/io/ObjectInputStream
    //   33: dup
    //   34: aload_3
    //   35: invokespecial 883	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   38: astore_1
    //   39: aload_1
    //   40: astore_0
    //   41: aload_1
    //   42: invokevirtual 886	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   45: astore_2
    //   46: aload_1
    //   47: invokevirtual 887	java/io/ObjectInputStream:close	()V
    //   50: aload_3
    //   51: invokevirtual 888	java/io/ByteArrayInputStream:close	()V
    //   54: aload_2
    //   55: areturn
    //   56: astore_0
    //   57: aload_0
    //   58: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   61: aload_2
    //   62: areturn
    //   63: astore_0
    //   64: aload_0
    //   65: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   68: goto -18 -> 50
    //   71: astore_2
    //   72: aconst_null
    //   73: astore_1
    //   74: aload_1
    //   75: astore_0
    //   76: aload_2
    //   77: invokevirtual 184	java/lang/Throwable:printStackTrace	()V
    //   80: aload_1
    //   81: astore_0
    //   82: aload_2
    //   83: invokevirtual 694	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   86: iconst_0
    //   87: anewarray 4	java/lang/Object
    //   90: invokestatic 99	com/tencent/feedback/common/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   93: aload_1
    //   94: ifnull +7 -> 101
    //   97: aload_1
    //   98: invokevirtual 887	java/io/ObjectInputStream:close	()V
    //   101: aload_3
    //   102: invokevirtual 888	java/io/ByteArrayInputStream:close	()V
    //   105: aconst_null
    //   106: areturn
    //   107: astore_0
    //   108: aload_0
    //   109: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   112: aconst_null
    //   113: areturn
    //   114: astore_0
    //   115: aload_0
    //   116: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   119: goto -18 -> 101
    //   122: astore_1
    //   123: aconst_null
    //   124: astore_0
    //   125: aload_0
    //   126: ifnull +7 -> 133
    //   129: aload_0
    //   130: invokevirtual 887	java/io/ObjectInputStream:close	()V
    //   133: aload_3
    //   134: invokevirtual 888	java/io/ByteArrayInputStream:close	()V
    //   137: aload_1
    //   138: athrow
    //   139: astore_0
    //   140: aload_0
    //   141: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   144: goto -11 -> 133
    //   147: astore_0
    //   148: aload_0
    //   149: invokevirtual 335	java/io/IOException:printStackTrace	()V
    //   152: goto -15 -> 137
    //   155: astore_1
    //   156: goto -31 -> 125
    //   159: astore_2
    //   160: goto -86 -> 74
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	163	0	paramArrayOfByte	byte[]
    //   38	60	1	localObjectInputStream	java.io.ObjectInputStream
    //   122	16	1	localObject1	Object
    //   155	1	1	localObject2	Object
    //   45	17	2	localObject3	Object
    //   71	12	2	localThrowable1	Throwable
    //   159	1	2	localThrowable2	Throwable
    //   29	105	3	localByteArrayInputStream	java.io.ByteArrayInputStream
    // Exception table:
    //   from	to	target	type
    //   50	54	56	java/io/IOException
    //   46	50	63	java/io/IOException
    //   30	39	71	java/lang/Throwable
    //   101	105	107	java/io/IOException
    //   97	101	114	java/io/IOException
    //   30	39	122	finally
    //   129	133	139	java/io/IOException
    //   133	137	147	java/io/IOException
    //   41	46	155	finally
    //   76	80	155	finally
    //   82	93	155	finally
    //   41	46	159	java/lang/Throwable
  }
  
  public static String b(String paramString)
  {
    if ((paramString == null) || (paramString.trim().equals(""))) {
      return "";
    }
    paramString = a(new String[] { "/system/bin/sh", "-c", "getprop " + paramString });
    if ((paramString != null) && (paramString.size() > 0)) {
      return (String)paramString.get(0);
    }
    return "fail";
  }
  
  public static byte[] b(byte[] paramArrayOfByte, int paramInt)
  {
    if ((paramArrayOfByte == null) || (paramInt == -1)) {
      return paramArrayOfByte;
    }
    e.b("rqdp{  unzp:} %s rqdp{  len:} %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfByte.length) });
    try
    {
      N localN = M.a(paramInt);
      if (localN == null) {
        return null;
      }
      paramArrayOfByte = localN.b(paramArrayOfByte);
      return paramArrayOfByte;
    }
    catch (Throwable paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
      e.d("rqdp{  err unzp}" + paramArrayOfByte.toString(), new Object[0]);
    }
    return null;
  }
  
  public static byte[] b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, String paramString)
  {
    try
    {
      paramArrayOfByte = b(b(paramArrayOfByte, paramInt2, paramString), paramInt1);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
    }
    return null;
  }
  
  public static byte[] b(byte[] paramArrayOfByte, int paramInt, String paramString)
  {
    if ((paramArrayOfByte == null) || (paramInt == -1)) {
      return paramArrayOfByte;
    }
    if (paramInt == 1) {}
    Object localObject;
    try
    {
      localObject = new R();
    }
    catch (Throwable paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
      e.d("rqdp{  err unD:} %s", new Object[] { paramArrayOfByte.toString() });
      return null;
    }
    if (paramInt == 3) {
      localObject = new Q();
    } else {
      localObject = null;
    }
    while (localObject != null)
    {
      ((S)localObject).a(paramString);
      paramArrayOfByte = ((S)localObject).a(paramArrayOfByte);
      return paramArrayOfByte;
    }
    return null;
  }
  
  public static String c()
  {
    try
    {
      String str = UUID.randomUUID().toString();
      return str;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
    }
    return null;
  }
  
  public static String c(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    try
    {
      String str = Pattern.compile("0[xX][0-9a-fA-F]{1,8}").matcher(paramString).replaceAll("[HEX]");
      str = Pattern.compile("\\b[~!@#\\$%\\^&*uU][0-9a-fA-F_]{1,8}\\b").matcher(str).replaceAll("[SPV]");
      str = Pattern.compile("\\b[0-9a-fA-F]{8}\\b|\\b[0-9a-fA-F]{4}\\b").matcher(str).replaceAll("[SHEX]");
      str = Pattern.compile("\\d+").matcher(str).replaceAll("[DIG]");
      return str;
    }
    catch (Throwable localThrowable)
    {
      e.d("remove Str num fail", new Object[0]);
    }
    return paramString;
  }
  
  public static String c(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      return "NULL";
    }
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("SHA-1");
      localMessageDigest.update(paramArrayOfByte);
      paramArrayOfByte = d(localMessageDigest.digest());
      return paramArrayOfByte;
    }
    catch (NoSuchAlgorithmException paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
      e.d(paramArrayOfByte.getMessage(), new Object[0]);
    }
    return null;
  }
  
  private static String d(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return "";
    }
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      String str = Integer.toHexString(paramArrayOfByte[i] & 0xFF);
      if (str.length() == 1) {
        localStringBuffer.append("0");
      }
      localStringBuffer.append(str);
      i += 1;
    }
    return localStringBuffer.toString().toUpperCase();
  }
  
  public <T> void a(String paramString, T paramT)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("put key can not is null");
    }
    if (paramT == null) {
      throw new IllegalArgumentException("put value can not is null");
    }
    if ((paramT instanceof Set)) {
      throw new IllegalArgumentException("can not support Set");
    }
    Object localObject = new i();
    ((i)localObject).a(this.b);
    ((i)localObject).a(paramT, 0);
    localObject = k.a(((i)localObject).a());
    HashMap localHashMap = new HashMap(1);
    ArrayList localArrayList = new ArrayList(1);
    a(localArrayList, paramT);
    localHashMap.put(a(localArrayList), localObject);
    this.d.remove(paramString);
    this.a.put(paramString, localHashMap);
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    this.c.a(paramArrayOfByte);
    this.c.a(this.b);
    paramArrayOfByte = new HashMap(1);
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("", new byte[0]);
    paramArrayOfByte.put("", localHashMap);
    this.a = this.c.a(paramArrayOfByte, 0, false);
  }
  
  public byte[] a()
  {
    i locali = new i(0);
    locali.a(this.b);
    locali.a(this.a, 0);
    return k.a(locali.a());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\proguard\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */