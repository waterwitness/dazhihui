package com.baidu.location.c;

import com.baidu.location.Jni;
import com.baidu.location.b.b;
import com.baidu.location.b.n;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

final class c
  extends n
{
  private String k;
  private final String l;
  private String m;
  private a n;
  private boolean o = false;
  private int p = 0;
  private long q = -1L;
  private long r = -1L;
  private long s = -1L;
  private long t = -1L;
  
  c(a parama1, a parama2, boolean paramBoolean)
  {
    this.n = parama2;
    if (paramBoolean) {}
    for (this.l = "load";; this.l = "update")
    {
      this.f = new ArrayList();
      this.k = i.a;
      return;
    }
  }
  
  private void a(String paramString1, String paramString2, String paramString3)
  {
    this.m = paramString3;
    this.k = String.format("http://%s/%s", new Object[] { paramString1, paramString2 });
    f();
  }
  
  private void c()
  {
    this.p += 1;
    this.q = System.currentTimeMillis();
  }
  
  private boolean j()
  {
    if (this.p < 2) {
      return true;
    }
    if (this.q + 43200000L < System.currentTimeMillis())
    {
      this.p = 0;
      this.q = -1L;
      return true;
    }
    return false;
  }
  
  private void k()
  {
    this.m = null;
    if (p())
    {
      if ((this.r == -1L) || (this.r + 86400000L <= System.currentTimeMillis())) {
        this.m = l();
      }
      if ((this.m == null) && ((this.s == -1L) || (this.s + 86400000L <= System.currentTimeMillis()))) {
        if (!a.a(this.a).k().a()) {
          break label126;
        }
      }
    }
    label126:
    for (this.m = n();; this.m = o())
    {
      if (this.m != null) {
        f();
      }
      return;
      this.m = m();
      break;
    }
  }
  
  private String l()
  {
    String str = null;
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("type", "0");
      localJSONObject.put("cuid", b.a().b);
      localJSONObject.put("ver", "1");
      localJSONObject.put("prod", b.d + ":" + b.c);
      if (localJSONObject != null) {
        str = Jni.e(localJSONObject.toString());
      }
      return str;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject = null;
      }
    }
  }
  
  /* Error */
  private String m()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 8
    //   3: aconst_null
    //   4: astore_2
    //   5: new 128	org/json/JSONObject
    //   8: dup
    //   9: invokespecial 129	org/json/JSONObject:<init>	()V
    //   12: astore 5
    //   14: new 128	org/json/JSONObject
    //   17: dup
    //   18: invokespecial 129	org/json/JSONObject:<init>	()V
    //   21: astore_1
    //   22: aload_0
    //   23: getfield 24	com/baidu/location/c/c:a	Lcom/baidu/location/c/a;
    //   26: invokestatic 179	com/baidu/location/c/a:c	(Lcom/baidu/location/c/a;)Landroid/database/sqlite/SQLiteDatabase;
    //   29: ldc -75
    //   31: iconst_3
    //   32: anewarray 75	java/lang/Object
    //   35: dup
    //   36: iconst_0
    //   37: ldc -73
    //   39: aastore
    //   40: dup
    //   41: iconst_1
    //   42: iconst_5
    //   43: invokestatic 189	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   46: aastore
    //   47: dup
    //   48: iconst_2
    //   49: bipush 50
    //   51: invokestatic 189	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   54: aastore
    //   55: invokestatic 81	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   58: aconst_null
    //   59: invokevirtual 195	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   62: astore_3
    //   63: aload_3
    //   64: ifnull +496 -> 560
    //   67: aload_3
    //   68: invokeinterface 200 1 0
    //   73: ifeq +487 -> 560
    //   76: aload_3
    //   77: invokeinterface 204 1 0
    //   82: istore 6
    //   84: new 206	org/json/JSONArray
    //   87: dup
    //   88: invokespecial 207	org/json/JSONArray:<init>	()V
    //   91: astore 4
    //   93: aload_3
    //   94: invokeinterface 210 1 0
    //   99: ifne +132 -> 231
    //   102: aload 4
    //   104: aload_3
    //   105: iconst_1
    //   106: invokeinterface 214 2 0
    //   111: invokevirtual 217	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   114: pop
    //   115: aload_3
    //   116: invokeinterface 220 1 0
    //   121: pop
    //   122: goto -29 -> 93
    //   125: astore_2
    //   126: aconst_null
    //   127: astore_2
    //   128: aload_2
    //   129: ifnull +9 -> 138
    //   132: aload_2
    //   133: invokeinterface 223 1 0
    //   138: aload_1
    //   139: astore_2
    //   140: aload_3
    //   141: ifnull +414 -> 555
    //   144: aload_3
    //   145: invokeinterface 223 1 0
    //   150: aload_1
    //   151: ifnull +399 -> 550
    //   154: aload_1
    //   155: ldc -31
    //   157: invokevirtual 229	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   160: ifne +390 -> 550
    //   163: aload_0
    //   164: getfield 41	com/baidu/location/c/c:t	J
    //   167: ldc2_w 32
    //   170: lcmp
    //   171: ifeq +18 -> 189
    //   174: aload_0
    //   175: getfield 41	com/baidu/location/c/c:t	J
    //   178: ldc2_w 102
    //   181: ladd
    //   182: invokestatic 95	java/lang/System:currentTimeMillis	()J
    //   185: lcmp
    //   186: ifge +364 -> 550
    //   189: aload_1
    //   190: invokevirtual 170	org/json/JSONObject:toString	()Ljava/lang/String;
    //   193: invokestatic 176	com/baidu/location/Jni:e	(Ljava/lang/String;)Ljava/lang/String;
    //   196: astore_2
    //   197: aload_0
    //   198: invokestatic 95	java/lang/System:currentTimeMillis	()J
    //   201: putfield 41	com/baidu/location/c/c:t	J
    //   204: aload_2
    //   205: astore_3
    //   206: aload_1
    //   207: ifnull +22 -> 229
    //   210: aload_2
    //   211: astore_3
    //   212: aload_1
    //   213: ldc -31
    //   215: invokevirtual 229	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   218: ifeq +11 -> 229
    //   221: aload_1
    //   222: invokevirtual 170	org/json/JSONObject:toString	()Ljava/lang/String;
    //   225: invokestatic 176	com/baidu/location/Jni:e	(Ljava/lang/String;)Ljava/lang/String;
    //   228: astore_3
    //   229: aload_3
    //   230: areturn
    //   231: aload 5
    //   233: ldc -25
    //   235: aload 4
    //   237: invokevirtual 137	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   240: pop
    //   241: aload_0
    //   242: getfield 24	com/baidu/location/c/c:a	Lcom/baidu/location/c/a;
    //   245: invokestatic 179	com/baidu/location/c/a:c	(Lcom/baidu/location/c/a;)Landroid/database/sqlite/SQLiteDatabase;
    //   248: ldc -75
    //   250: iconst_3
    //   251: anewarray 75	java/lang/Object
    //   254: dup
    //   255: iconst_0
    //   256: ldc -23
    //   258: aastore
    //   259: dup
    //   260: iconst_1
    //   261: iconst_5
    //   262: invokestatic 189	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   265: aastore
    //   266: dup
    //   267: iconst_2
    //   268: bipush 50
    //   270: invokestatic 189	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   273: aastore
    //   274: invokestatic 81	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   277: aconst_null
    //   278: invokevirtual 195	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   281: astore 4
    //   283: aload 4
    //   285: astore_2
    //   286: iload 8
    //   288: istore 7
    //   290: aload_2
    //   291: ifnull +75 -> 366
    //   294: iload 8
    //   296: istore 7
    //   298: aload_2
    //   299: invokeinterface 200 1 0
    //   304: ifeq +62 -> 366
    //   307: aload_2
    //   308: invokeinterface 204 1 0
    //   313: istore 7
    //   315: new 206	org/json/JSONArray
    //   318: dup
    //   319: invokespecial 207	org/json/JSONArray:<init>	()V
    //   322: astore 4
    //   324: aload_2
    //   325: invokeinterface 210 1 0
    //   330: ifne +26 -> 356
    //   333: aload 4
    //   335: aload_2
    //   336: iconst_1
    //   337: invokeinterface 214 2 0
    //   342: invokevirtual 217	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   345: pop
    //   346: aload_2
    //   347: invokeinterface 220 1 0
    //   352: pop
    //   353: goto -29 -> 324
    //   356: aload 5
    //   358: ldc -21
    //   360: aload 4
    //   362: invokevirtual 137	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   365: pop
    //   366: aload_1
    //   367: ldc -125
    //   369: ldc -106
    //   371: invokevirtual 137	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   374: pop
    //   375: aload_1
    //   376: ldc -117
    //   378: invokestatic 144	com/baidu/location/b/b:a	()Lcom/baidu/location/b/b;
    //   381: getfield 146	com/baidu/location/b/b:b	Ljava/lang/String;
    //   384: invokevirtual 137	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   387: pop
    //   388: aload_1
    //   389: ldc -108
    //   391: ldc -106
    //   393: invokevirtual 137	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   396: pop
    //   397: aload_1
    //   398: ldc -104
    //   400: new 154	java/lang/StringBuilder
    //   403: dup
    //   404: invokespecial 155	java/lang/StringBuilder:<init>	()V
    //   407: getstatic 158	com/baidu/location/b/b:d	Ljava/lang/String;
    //   410: invokevirtual 162	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   413: ldc -92
    //   415: invokevirtual 162	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   418: getstatic 166	com/baidu/location/b/b:c	Ljava/lang/String;
    //   421: invokevirtual 162	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   424: invokevirtual 169	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   427: invokevirtual 137	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   430: pop
    //   431: iload 6
    //   433: ifne +8 -> 441
    //   436: iload 7
    //   438: ifeq +12 -> 450
    //   441: aload_1
    //   442: ldc -31
    //   444: aload 5
    //   446: invokevirtual 137	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   449: pop
    //   450: aload_2
    //   451: ifnull +9 -> 460
    //   454: aload_2
    //   455: invokeinterface 223 1 0
    //   460: aload_1
    //   461: astore_2
    //   462: aload_3
    //   463: ifnull +92 -> 555
    //   466: aload_3
    //   467: invokeinterface 223 1 0
    //   472: goto -322 -> 150
    //   475: astore_2
    //   476: goto -326 -> 150
    //   479: astore_2
    //   480: goto -330 -> 150
    //   483: astore_1
    //   484: aconst_null
    //   485: astore_3
    //   486: aload_2
    //   487: ifnull +9 -> 496
    //   490: aload_2
    //   491: invokeinterface 223 1 0
    //   496: aload_3
    //   497: ifnull +9 -> 506
    //   500: aload_3
    //   501: invokeinterface 223 1 0
    //   506: aload_1
    //   507: athrow
    //   508: astore_2
    //   509: goto -49 -> 460
    //   512: astore_2
    //   513: goto -375 -> 138
    //   516: astore_2
    //   517: goto -21 -> 496
    //   520: astore_2
    //   521: goto -15 -> 506
    //   524: astore_1
    //   525: goto -39 -> 486
    //   528: astore_1
    //   529: goto -43 -> 486
    //   532: astore_1
    //   533: aconst_null
    //   534: astore_1
    //   535: aconst_null
    //   536: astore_3
    //   537: aconst_null
    //   538: astore_2
    //   539: goto -411 -> 128
    //   542: astore_2
    //   543: aconst_null
    //   544: astore_3
    //   545: aconst_null
    //   546: astore_2
    //   547: goto -419 -> 128
    //   550: aconst_null
    //   551: astore_2
    //   552: goto -348 -> 204
    //   555: aload_2
    //   556: astore_1
    //   557: goto -407 -> 150
    //   560: iconst_0
    //   561: istore 6
    //   563: goto -322 -> 241
    //   566: astore 4
    //   568: goto -440 -> 128
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	571	0	this	c
    //   21	440	1	localJSONObject1	JSONObject
    //   483	24	1	localObject1	Object
    //   524	1	1	localObject2	Object
    //   528	1	1	localObject3	Object
    //   532	1	1	localException1	Exception
    //   534	23	1	localObject4	Object
    //   4	1	2	localObject5	Object
    //   125	1	2	localException2	Exception
    //   127	335	2	localObject6	Object
    //   475	1	2	localException3	Exception
    //   479	12	2	localException4	Exception
    //   508	1	2	localException5	Exception
    //   512	1	2	localException6	Exception
    //   516	1	2	localException7	Exception
    //   520	1	2	localException8	Exception
    //   538	1	2	localObject7	Object
    //   542	1	2	localException9	Exception
    //   546	10	2	localObject8	Object
    //   62	483	3	localObject9	Object
    //   91	270	4	localObject10	Object
    //   566	1	4	localException10	Exception
    //   12	433	5	localJSONObject2	JSONObject
    //   82	480	6	i	int
    //   288	149	7	j	int
    //   1	294	8	i1	int
    // Exception table:
    //   from	to	target	type
    //   67	93	125	java/lang/Exception
    //   93	122	125	java/lang/Exception
    //   231	241	125	java/lang/Exception
    //   241	283	125	java/lang/Exception
    //   466	472	475	java/lang/Exception
    //   144	150	479	java/lang/Exception
    //   5	22	483	finally
    //   22	63	483	finally
    //   454	460	508	java/lang/Exception
    //   132	138	512	java/lang/Exception
    //   490	496	516	java/lang/Exception
    //   500	506	520	java/lang/Exception
    //   67	93	524	finally
    //   93	122	524	finally
    //   231	241	524	finally
    //   241	283	524	finally
    //   298	324	528	finally
    //   324	353	528	finally
    //   356	366	528	finally
    //   366	431	528	finally
    //   441	450	528	finally
    //   5	22	532	java/lang/Exception
    //   22	63	542	java/lang/Exception
    //   298	324	566	java/lang/Exception
    //   324	353	566	java/lang/Exception
    //   356	366	566	java/lang/Exception
    //   366	431	566	java/lang/Exception
    //   441	450	566	java/lang/Exception
  }
  
  /* Error */
  private String n()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 128	org/json/JSONObject
    //   5: dup
    //   6: invokespecial 129	org/json/JSONObject:<init>	()V
    //   9: astore_1
    //   10: aload_1
    //   11: ldc -125
    //   13: ldc -19
    //   15: invokevirtual 137	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   18: pop
    //   19: aload_1
    //   20: ldc -108
    //   22: ldc -106
    //   24: invokevirtual 137	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   27: pop
    //   28: aload_1
    //   29: ldc -117
    //   31: invokestatic 144	com/baidu/location/b/b:a	()Lcom/baidu/location/b/b;
    //   34: getfield 146	com/baidu/location/b/b:b	Ljava/lang/String;
    //   37: invokevirtual 137	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   40: pop
    //   41: aload_1
    //   42: ldc -104
    //   44: new 154	java/lang/StringBuilder
    //   47: dup
    //   48: invokespecial 155	java/lang/StringBuilder:<init>	()V
    //   51: getstatic 158	com/baidu/location/b/b:d	Ljava/lang/String;
    //   54: invokevirtual 162	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   57: ldc -92
    //   59: invokevirtual 162	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: getstatic 166	com/baidu/location/b/b:c	Ljava/lang/String;
    //   65: invokevirtual 162	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: invokevirtual 169	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   71: invokevirtual 137	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   74: pop
    //   75: aload_0
    //   76: invokestatic 95	java/lang/System:currentTimeMillis	()J
    //   79: putfield 39	com/baidu/location/c/c:s	J
    //   82: aload_1
    //   83: ifnull +11 -> 94
    //   86: aload_1
    //   87: invokevirtual 170	org/json/JSONObject:toString	()Ljava/lang/String;
    //   90: invokestatic 176	com/baidu/location/Jni:e	(Ljava/lang/String;)Ljava/lang/String;
    //   93: astore_2
    //   94: aload_2
    //   95: areturn
    //   96: astore_1
    //   97: aconst_null
    //   98: astore_1
    //   99: goto -17 -> 82
    //   102: astore_3
    //   103: goto -21 -> 82
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	this	c
    //   9	78	1	localJSONObject	JSONObject
    //   96	1	1	localException1	Exception
    //   98	1	1	localObject	Object
    //   1	94	2	str	String
    //   102	1	3	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   2	10	96	java/lang/Exception
    //   10	82	102	java/lang/Exception
  }
  
  /* Error */
  private String o()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: getfield 24	com/baidu/location/c/c:a	Lcom/baidu/location/c/a;
    //   6: invokestatic 111	com/baidu/location/c/a:a	(Lcom/baidu/location/c/a;)Lcom/baidu/location/c/i;
    //   9: invokevirtual 114	com/baidu/location/c/i:k	()Lcom/baidu/location/c/v;
    //   12: invokevirtual 240	com/baidu/location/c/v:b	()Lorg/json/JSONObject;
    //   15: astore_3
    //   16: aload_3
    //   17: ifnull +115 -> 132
    //   20: new 128	org/json/JSONObject
    //   23: dup
    //   24: invokespecial 129	org/json/JSONObject:<init>	()V
    //   27: astore_1
    //   28: aload_1
    //   29: ldc -125
    //   31: ldc -14
    //   33: invokevirtual 137	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   36: pop
    //   37: aload_1
    //   38: ldc -108
    //   40: ldc -106
    //   42: invokevirtual 137	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   45: pop
    //   46: aload_1
    //   47: ldc -117
    //   49: invokestatic 144	com/baidu/location/b/b:a	()Lcom/baidu/location/b/b;
    //   52: getfield 146	com/baidu/location/b/b:b	Ljava/lang/String;
    //   55: invokevirtual 137	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   58: pop
    //   59: aload_1
    //   60: ldc -104
    //   62: new 154	java/lang/StringBuilder
    //   65: dup
    //   66: invokespecial 155	java/lang/StringBuilder:<init>	()V
    //   69: getstatic 158	com/baidu/location/b/b:d	Ljava/lang/String;
    //   72: invokevirtual 162	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: ldc -92
    //   77: invokevirtual 162	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: getstatic 166	com/baidu/location/b/b:c	Ljava/lang/String;
    //   83: invokevirtual 162	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: invokevirtual 169	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   89: invokevirtual 137	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   92: pop
    //   93: aload_1
    //   94: ldc -12
    //   96: aload_3
    //   97: invokevirtual 137	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   100: pop
    //   101: aload_0
    //   102: invokestatic 95	java/lang/System:currentTimeMillis	()J
    //   105: putfield 39	com/baidu/location/c/c:s	J
    //   108: aload_1
    //   109: ifnull +11 -> 120
    //   112: aload_1
    //   113: invokevirtual 170	org/json/JSONObject:toString	()Ljava/lang/String;
    //   116: invokestatic 176	com/baidu/location/Jni:e	(Ljava/lang/String;)Ljava/lang/String;
    //   119: astore_2
    //   120: aload_2
    //   121: areturn
    //   122: astore_1
    //   123: aconst_null
    //   124: astore_1
    //   125: goto -17 -> 108
    //   128: astore_3
    //   129: goto -21 -> 108
    //   132: aconst_null
    //   133: astore_1
    //   134: goto -26 -> 108
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	137	0	this	c
    //   27	86	1	localJSONObject1	JSONObject
    //   122	1	1	localException1	Exception
    //   124	10	1	localObject	Object
    //   1	120	2	str	String
    //   15	82	3	localJSONObject2	JSONObject
    //   128	1	3	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   2	16	122	java/lang/Exception
    //   20	28	122	java/lang/Exception
    //   28	108	128	java/lang/Exception
  }
  
  /* Error */
  private boolean p()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore 5
    //   5: aconst_null
    //   6: astore 4
    //   8: aconst_null
    //   9: astore_3
    //   10: iconst_1
    //   11: istore 9
    //   13: iconst_1
    //   14: istore 8
    //   16: aload_0
    //   17: getfield 24	com/baidu/location/c/c:a	Lcom/baidu/location/c/a;
    //   20: invokestatic 246	com/baidu/location/c/a:b	(Lcom/baidu/location/c/a;)Landroid/database/sqlite/SQLiteDatabase;
    //   23: ldc -8
    //   25: aconst_null
    //   26: invokevirtual 195	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   29: astore_1
    //   30: aload 5
    //   32: astore_2
    //   33: aload 4
    //   35: astore_3
    //   36: aload_0
    //   37: getfield 24	com/baidu/location/c/c:a	Lcom/baidu/location/c/a;
    //   40: invokestatic 246	com/baidu/location/c/a:b	(Lcom/baidu/location/c/a;)Landroid/database/sqlite/SQLiteDatabase;
    //   43: ldc -6
    //   45: aconst_null
    //   46: invokevirtual 195	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   49: astore 4
    //   51: iload 8
    //   53: istore 7
    //   55: aload_1
    //   56: ifnull +95 -> 151
    //   59: iload 8
    //   61: istore 7
    //   63: aload 4
    //   65: astore_2
    //   66: aload 4
    //   68: astore_3
    //   69: aload_1
    //   70: invokeinterface 200 1 0
    //   75: ifeq +76 -> 151
    //   78: iload 8
    //   80: istore 7
    //   82: aload 4
    //   84: ifnull +67 -> 151
    //   87: iload 8
    //   89: istore 7
    //   91: aload 4
    //   93: astore_2
    //   94: aload 4
    //   96: astore_3
    //   97: aload 4
    //   99: invokeinterface 200 1 0
    //   104: ifeq +47 -> 151
    //   107: aload 4
    //   109: astore_2
    //   110: aload 4
    //   112: astore_3
    //   113: aload_1
    //   114: iconst_0
    //   115: invokeinterface 254 2 0
    //   120: ifne +28 -> 148
    //   123: aload 4
    //   125: astore_2
    //   126: aload 4
    //   128: astore_3
    //   129: aload 4
    //   131: iconst_0
    //   132: invokeinterface 254 2 0
    //   137: istore 6
    //   139: iload 8
    //   141: istore 7
    //   143: iload 6
    //   145: ifeq +6 -> 151
    //   148: iconst_0
    //   149: istore 7
    //   151: aload_1
    //   152: ifnull +9 -> 161
    //   155: aload_1
    //   156: invokeinterface 223 1 0
    //   161: iload 7
    //   163: istore 8
    //   165: aload 4
    //   167: ifnull +14 -> 181
    //   170: aload 4
    //   172: invokeinterface 223 1 0
    //   177: iload 7
    //   179: istore 8
    //   181: iload 8
    //   183: ireturn
    //   184: astore_1
    //   185: aconst_null
    //   186: astore_1
    //   187: aload_1
    //   188: ifnull +9 -> 197
    //   191: aload_1
    //   192: invokeinterface 223 1 0
    //   197: iload 9
    //   199: istore 8
    //   201: aload_3
    //   202: ifnull -21 -> 181
    //   205: aload_3
    //   206: invokeinterface 223 1 0
    //   211: iconst_1
    //   212: ireturn
    //   213: astore_1
    //   214: iconst_1
    //   215: ireturn
    //   216: astore_3
    //   217: aconst_null
    //   218: astore_1
    //   219: aload_1
    //   220: ifnull +9 -> 229
    //   223: aload_1
    //   224: invokeinterface 223 1 0
    //   229: aload_2
    //   230: ifnull +9 -> 239
    //   233: aload_2
    //   234: invokeinterface 223 1 0
    //   239: aload_3
    //   240: athrow
    //   241: astore_1
    //   242: goto -81 -> 161
    //   245: astore_1
    //   246: iload 7
    //   248: ireturn
    //   249: astore_1
    //   250: goto -53 -> 197
    //   253: astore_1
    //   254: goto -25 -> 229
    //   257: astore_1
    //   258: goto -19 -> 239
    //   261: astore_3
    //   262: goto -43 -> 219
    //   265: astore_2
    //   266: goto -79 -> 187
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	269	0	this	c
    //   29	127	1	localCursor1	android.database.Cursor
    //   184	1	1	localException1	Exception
    //   186	6	1	localObject1	Object
    //   213	1	1	localException2	Exception
    //   218	6	1	localObject2	Object
    //   241	1	1	localException3	Exception
    //   245	1	1	localException4	Exception
    //   249	1	1	localException5	Exception
    //   253	1	1	localException6	Exception
    //   257	1	1	localException7	Exception
    //   1	233	2	localObject3	Object
    //   265	1	2	localException8	Exception
    //   9	197	3	localCursor2	android.database.Cursor
    //   216	24	3	localObject4	Object
    //   261	1	3	localObject5	Object
    //   6	165	4	localCursor3	android.database.Cursor
    //   3	28	5	localObject6	Object
    //   137	7	6	i	int
    //   53	194	7	bool1	boolean
    //   14	186	8	bool2	boolean
    //   11	187	9	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   16	30	184	java/lang/Exception
    //   205	211	213	java/lang/Exception
    //   16	30	216	finally
    //   155	161	241	java/lang/Exception
    //   170	177	245	java/lang/Exception
    //   191	197	249	java/lang/Exception
    //   223	229	253	java/lang/Exception
    //   233	239	257	java/lang/Exception
    //   36	51	261	finally
    //   69	78	261	finally
    //   97	107	261	finally
    //   113	123	261	finally
    //   129	139	261	finally
    //   36	51	265	java/lang/Exception
    //   69	78	265	java/lang/Exception
    //   97	107	265	java/lang/Exception
    //   113	123	265	java/lang/Exception
    //   129	139	265	java/lang/Exception
  }
  
  public void a()
  {
    this.o = true;
    this.c = this.k;
    this.f.clear();
    this.f.add(new BasicNameValuePair("qt", this.l));
    this.f.add(new BasicNameValuePair("req", this.m));
  }
  
  public void a(boolean paramBoolean)
  {
    if ((paramBoolean) && (this.e != null))
    {
      new m(this).start();
      return;
    }
    this.o = false;
    c();
  }
  
  void b()
  {
    if ((j()) && (!this.o)) {
      a.d(this.a).k();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */