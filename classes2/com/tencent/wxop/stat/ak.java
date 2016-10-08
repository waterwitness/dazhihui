package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.a.d;
import com.tencent.wxop.stat.b.b;
import com.tencent.wxop.stat.b.f;
import com.tencent.wxop.stat.b.l;
import java.util.Arrays;
import java.util.List;
import org.apache.http.impl.client.DefaultHttpClient;

class ak
{
  private static b cx = ;
  private static ak dj = null;
  private static Context dk = null;
  private long cv;
  DefaultHttpClient dg;
  f dh;
  StringBuilder di;
  
  /* Error */
  private ak(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 39	java/lang/Object:<init>	()V
    //   4: aload_0
    //   5: aconst_null
    //   6: putfield 41	com/tencent/wxop/stat/ak:dg	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   9: aload_0
    //   10: aconst_null
    //   11: putfield 43	com/tencent/wxop/stat/ak:dh	Lcom/tencent/wxop/stat/b/f;
    //   14: aload_0
    //   15: new 45	java/lang/StringBuilder
    //   18: dup
    //   19: sipush 4096
    //   22: invokespecial 48	java/lang/StringBuilder:<init>	(I)V
    //   25: putfield 50	com/tencent/wxop/stat/ak:di	Ljava/lang/StringBuilder;
    //   28: aload_0
    //   29: lconst_0
    //   30: putfield 52	com/tencent/wxop/stat/ak:cv	J
    //   33: aload_1
    //   34: invokevirtual 58	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   37: putstatic 32	com/tencent/wxop/stat/ak:dk	Landroid/content/Context;
    //   40: aload_0
    //   41: invokestatic 64	java/lang/System:currentTimeMillis	()J
    //   44: ldc2_w 65
    //   47: ldiv
    //   48: putfield 52	com/tencent/wxop/stat/ak:cv	J
    //   51: aload_0
    //   52: new 68	com/tencent/wxop/stat/b/f
    //   55: dup
    //   56: invokespecial 69	com/tencent/wxop/stat/b/f:<init>	()V
    //   59: putfield 43	com/tencent/wxop/stat/ak:dh	Lcom/tencent/wxop/stat/b/f;
    //   62: invokestatic 75	com/tencent/wxop/stat/c:k	()Z
    //   65: istore_2
    //   66: iload_2
    //   67: ifeq +65 -> 132
    //   70: ldc 77
    //   72: invokestatic 83	java/util/logging/Logger:getLogger	(Ljava/lang/String;)Ljava/util/logging/Logger;
    //   75: getstatic 89	java/util/logging/Level:FINER	Ljava/util/logging/Level;
    //   78: invokevirtual 93	java/util/logging/Logger:setLevel	(Ljava/util/logging/Level;)V
    //   81: ldc 95
    //   83: invokestatic 83	java/util/logging/Logger:getLogger	(Ljava/lang/String;)Ljava/util/logging/Logger;
    //   86: getstatic 89	java/util/logging/Level:FINER	Ljava/util/logging/Level;
    //   89: invokevirtual 93	java/util/logging/Logger:setLevel	(Ljava/util/logging/Level;)V
    //   92: ldc 97
    //   94: ldc 99
    //   96: invokestatic 103	java/lang/System:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   99: pop
    //   100: ldc 105
    //   102: ldc 107
    //   104: invokestatic 103	java/lang/System:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   107: pop
    //   108: ldc 109
    //   110: ldc 111
    //   112: invokestatic 103	java/lang/System:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   115: pop
    //   116: ldc 113
    //   118: ldc 111
    //   120: invokestatic 103	java/lang/System:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   123: pop
    //   124: ldc 115
    //   126: ldc 111
    //   128: invokestatic 103	java/lang/System:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   131: pop
    //   132: new 117	org/apache/http/params/BasicHttpParams
    //   135: dup
    //   136: invokespecial 118	org/apache/http/params/BasicHttpParams:<init>	()V
    //   139: astore_1
    //   140: aload_1
    //   141: iconst_0
    //   142: invokestatic 124	org/apache/http/params/HttpConnectionParams:setStaleCheckingEnabled	(Lorg/apache/http/params/HttpParams;Z)V
    //   145: aload_1
    //   146: sipush 10000
    //   149: invokestatic 128	org/apache/http/params/HttpConnectionParams:setConnectionTimeout	(Lorg/apache/http/params/HttpParams;I)V
    //   152: aload_1
    //   153: sipush 10000
    //   156: invokestatic 131	org/apache/http/params/HttpConnectionParams:setSoTimeout	(Lorg/apache/http/params/HttpParams;I)V
    //   159: aload_0
    //   160: new 133	org/apache/http/impl/client/DefaultHttpClient
    //   163: dup
    //   164: aload_1
    //   165: invokespecial 136	org/apache/http/impl/client/DefaultHttpClient:<init>	(Lorg/apache/http/params/HttpParams;)V
    //   168: putfield 41	com/tencent/wxop/stat/ak:dg	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   171: aload_0
    //   172: getfield 41	com/tencent/wxop/stat/ak:dg	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   175: new 138	com/tencent/wxop/stat/al
    //   178: dup
    //   179: aload_0
    //   180: invokespecial 141	com/tencent/wxop/stat/al:<init>	(Lcom/tencent/wxop/stat/ak;)V
    //   183: invokevirtual 145	org/apache/http/impl/client/DefaultHttpClient:setKeepAliveStrategy	(Lorg/apache/http/conn/ConnectionKeepAliveStrategy;)V
    //   186: return
    //   187: astore_1
    //   188: getstatic 28	com/tencent/wxop/stat/ak:cx	Lcom/tencent/wxop/stat/b/b;
    //   191: aload_1
    //   192: invokevirtual 151	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Throwable;)V
    //   195: return
    //   196: astore_1
    //   197: goto -65 -> 132
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	200	0	this	ak
    //   0	200	1	paramContext	Context
    //   65	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   33	66	187	java/lang/Throwable
    //   132	186	187	java/lang/Throwable
    //   70	132	196	java/lang/Throwable
  }
  
  static ak Z(Context paramContext)
  {
    if (dj == null) {}
    try
    {
      if (dj == null) {
        dj = new ak(paramContext);
      }
      return dj;
    }
    finally {}
  }
  
  static Context aB()
  {
    return dk;
  }
  
  static void j(Context paramContext)
  {
    dk = paramContext.getApplicationContext();
  }
  
  final void a(d paramd, aj paramaj)
  {
    b(Arrays.asList(new String[] { paramd.af() }), paramaj);
  }
  
  /* Error */
  final void a(List<?> paramList, aj paramaj)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 8
    //   3: aload_1
    //   4: ifnull +12 -> 16
    //   7: aload_1
    //   8: invokeinterface 181 1 0
    //   13: ifeq +4 -> 17
    //   16: return
    //   17: aload_1
    //   18: invokeinterface 185 1 0
    //   23: istore 9
    //   25: aload_1
    //   26: iconst_0
    //   27: invokeinterface 189 2 0
    //   32: pop
    //   33: aload_0
    //   34: getfield 50	com/tencent/wxop/stat/ak:di	Ljava/lang/StringBuilder;
    //   37: iconst_0
    //   38: aload_0
    //   39: getfield 50	com/tencent/wxop/stat/ak:di	Ljava/lang/StringBuilder;
    //   42: invokevirtual 192	java/lang/StringBuilder:length	()I
    //   45: invokevirtual 196	java/lang/StringBuilder:delete	(II)Ljava/lang/StringBuilder;
    //   48: pop
    //   49: aload_0
    //   50: getfield 50	com/tencent/wxop/stat/ak:di	Ljava/lang/StringBuilder;
    //   53: ldc -58
    //   55: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: pop
    //   59: iconst_0
    //   60: istore 7
    //   62: iload 7
    //   64: iload 9
    //   66: if_icmpge +44 -> 110
    //   69: aload_0
    //   70: getfield 50	com/tencent/wxop/stat/ak:di	Ljava/lang/StringBuilder;
    //   73: aload_1
    //   74: iload 7
    //   76: invokeinterface 189 2 0
    //   81: invokevirtual 205	java/lang/Object:toString	()Ljava/lang/String;
    //   84: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: pop
    //   88: iload 7
    //   90: iload 9
    //   92: iconst_1
    //   93: isub
    //   94: if_icmpeq +1231 -> 1325
    //   97: aload_0
    //   98: getfield 50	com/tencent/wxop/stat/ak:di	Ljava/lang/StringBuilder;
    //   101: ldc -49
    //   103: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: pop
    //   107: goto +1218 -> 1325
    //   110: aload_0
    //   111: getfield 50	com/tencent/wxop/stat/ak:di	Ljava/lang/StringBuilder;
    //   114: ldc -47
    //   116: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: pop
    //   120: aload_0
    //   121: getfield 50	com/tencent/wxop/stat/ak:di	Ljava/lang/StringBuilder;
    //   124: invokevirtual 210	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   127: astore_1
    //   128: aload_1
    //   129: invokevirtual 211	java/lang/String:length	()I
    //   132: istore 10
    //   134: new 45	java/lang/StringBuilder
    //   137: dup
    //   138: invokespecial 212	java/lang/StringBuilder:<init>	()V
    //   141: invokestatic 215	com/tencent/wxop/stat/c:y	()Ljava/lang/String;
    //   144: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: ldc -39
    //   149: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: aload_0
    //   153: getfield 52	com/tencent/wxop/stat/ak:cv	J
    //   156: invokevirtual 220	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   159: invokevirtual 210	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   162: astore_3
    //   163: aload_0
    //   164: aload_0
    //   165: getfield 52	com/tencent/wxop/stat/ak:cv	J
    //   168: lconst_1
    //   169: ladd
    //   170: putfield 52	com/tencent/wxop/stat/ak:cv	J
    //   173: invokestatic 75	com/tencent/wxop/stat/c:k	()Z
    //   176: ifeq +44 -> 220
    //   179: getstatic 28	com/tencent/wxop/stat/ak:cx	Lcom/tencent/wxop/stat/b/b;
    //   182: new 45	java/lang/StringBuilder
    //   185: dup
    //   186: ldc -58
    //   188: invokespecial 223	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   191: aload_3
    //   192: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   195: ldc -31
    //   197: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   200: iload 10
    //   202: invokevirtual 228	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   205: ldc -26
    //   207: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   210: aload_1
    //   211: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   214: invokevirtual 210	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   217: invokevirtual 233	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Object;)V
    //   220: new 235	org/apache/http/client/methods/HttpPost
    //   223: dup
    //   224: aload_3
    //   225: invokespecial 236	org/apache/http/client/methods/HttpPost:<init>	(Ljava/lang/String;)V
    //   228: astore 5
    //   230: aload 5
    //   232: ldc -18
    //   234: ldc -16
    //   236: invokevirtual 244	org/apache/http/client/methods/HttpPost:addHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   239: aload 5
    //   241: ldc -10
    //   243: ldc -8
    //   245: invokevirtual 251	org/apache/http/client/methods/HttpPost:setHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   248: aload 5
    //   250: ldc -3
    //   252: invokevirtual 256	org/apache/http/client/methods/HttpPost:removeHeaders	(Ljava/lang/String;)V
    //   255: getstatic 32	com/tencent/wxop/stat/ak:dk	Landroid/content/Context;
    //   258: invokestatic 262	com/tencent/wxop/stat/g:r	(Landroid/content/Context;)Lcom/tencent/wxop/stat/g;
    //   261: invokevirtual 266	com/tencent/wxop/stat/g:V	()Lorg/apache/http/HttpHost;
    //   264: astore 6
    //   266: aload 5
    //   268: ldc_w 268
    //   271: ldc_w 270
    //   274: invokevirtual 244	org/apache/http/client/methods/HttpPost:addHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   277: aload 6
    //   279: ifnonnull +410 -> 689
    //   282: aload_0
    //   283: getfield 41	com/tencent/wxop/stat/ak:dg	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   286: invokevirtual 274	org/apache/http/impl/client/DefaultHttpClient:getParams	()Lorg/apache/http/params/HttpParams;
    //   289: ldc_w 276
    //   292: invokeinterface 282 2 0
    //   297: pop
    //   298: new 284	java/io/ByteArrayOutputStream
    //   301: dup
    //   302: iload 10
    //   304: invokespecial 285	java/io/ByteArrayOutputStream:<init>	(I)V
    //   307: astore 4
    //   309: aload_1
    //   310: ldc_w 287
    //   313: invokevirtual 291	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   316: astore_3
    //   317: aload_3
    //   318: arraylength
    //   319: istore 9
    //   321: iload 8
    //   323: istore 7
    //   325: iload 10
    //   327: getstatic 295	com/tencent/wxop/stat/c:aA	I
    //   330: if_icmple +6 -> 336
    //   333: iconst_1
    //   334: istore 7
    //   336: aload_3
    //   337: astore_1
    //   338: iload 7
    //   340: ifeq +161 -> 501
    //   343: aload 5
    //   345: ldc_w 268
    //   348: invokevirtual 256	org/apache/http/client/methods/HttpPost:removeHeaders	(Ljava/lang/String;)V
    //   351: new 45	java/lang/StringBuilder
    //   354: dup
    //   355: invokespecial 212	java/lang/StringBuilder:<init>	()V
    //   358: ldc_w 270
    //   361: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   364: ldc_w 297
    //   367: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   370: invokevirtual 210	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   373: astore_1
    //   374: aload 5
    //   376: ldc_w 268
    //   379: aload_1
    //   380: invokevirtual 244	org/apache/http/client/methods/HttpPost:addHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   383: aload 6
    //   385: ifnull +20 -> 405
    //   388: aload 5
    //   390: ldc_w 299
    //   393: invokevirtual 256	org/apache/http/client/methods/HttpPost:removeHeaders	(Ljava/lang/String;)V
    //   396: aload 5
    //   398: ldc_w 299
    //   401: aload_1
    //   402: invokevirtual 244	org/apache/http/client/methods/HttpPost:addHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   405: aload 4
    //   407: iconst_4
    //   408: newarray <illegal type>
    //   410: invokevirtual 303	java/io/ByteArrayOutputStream:write	([B)V
    //   413: new 305	java/util/zip/GZIPOutputStream
    //   416: dup
    //   417: aload 4
    //   419: invokespecial 308	java/util/zip/GZIPOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   422: astore_1
    //   423: aload_1
    //   424: aload_3
    //   425: invokevirtual 309	java/util/zip/GZIPOutputStream:write	([B)V
    //   428: aload_1
    //   429: invokevirtual 312	java/util/zip/GZIPOutputStream:close	()V
    //   432: aload 4
    //   434: invokevirtual 316	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   437: astore_3
    //   438: aload_3
    //   439: iconst_0
    //   440: iconst_4
    //   441: invokestatic 322	java/nio/ByteBuffer:wrap	([BII)Ljava/nio/ByteBuffer;
    //   444: iload 9
    //   446: invokevirtual 326	java/nio/ByteBuffer:putInt	(I)Ljava/nio/ByteBuffer;
    //   449: pop
    //   450: aload_3
    //   451: astore_1
    //   452: invokestatic 75	com/tencent/wxop/stat/c:k	()Z
    //   455: ifeq +46 -> 501
    //   458: getstatic 28	com/tencent/wxop/stat/ak:cx	Lcom/tencent/wxop/stat/b/b;
    //   461: new 45	java/lang/StringBuilder
    //   464: dup
    //   465: ldc_w 328
    //   468: invokespecial 223	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   471: iload 9
    //   473: invokevirtual 228	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   476: ldc_w 330
    //   479: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   482: aload_3
    //   483: arraylength
    //   484: invokevirtual 228	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   487: ldc_w 332
    //   490: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   493: invokevirtual 210	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   496: invokevirtual 335	com/tencent/wxop/stat/b/b:e	(Ljava/lang/Object;)V
    //   499: aload_3
    //   500: astore_1
    //   501: aload 5
    //   503: new 337	org/apache/http/entity/ByteArrayEntity
    //   506: dup
    //   507: aload_1
    //   508: invokestatic 342	com/tencent/wxop/stat/b/g:b	([B)[B
    //   511: invokespecial 344	org/apache/http/entity/ByteArrayEntity:<init>	([B)V
    //   514: invokevirtual 348	org/apache/http/client/methods/HttpPost:setEntity	(Lorg/apache/http/HttpEntity;)V
    //   517: aload_0
    //   518: getfield 41	com/tencent/wxop/stat/ak:dg	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   521: aload 5
    //   523: invokevirtual 352	org/apache/http/impl/client/DefaultHttpClient:execute	(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //   526: astore_1
    //   527: aload_1
    //   528: invokeinterface 358 1 0
    //   533: astore_3
    //   534: aload_1
    //   535: invokeinterface 362 1 0
    //   540: invokeinterface 367 1 0
    //   545: istore 7
    //   547: aload_3
    //   548: invokeinterface 372 1 0
    //   553: lstore 11
    //   555: invokestatic 75	com/tencent/wxop/stat/c:k	()Z
    //   558: ifeq +38 -> 596
    //   561: getstatic 28	com/tencent/wxop/stat/ak:cx	Lcom/tencent/wxop/stat/b/b;
    //   564: new 45	java/lang/StringBuilder
    //   567: dup
    //   568: ldc_w 374
    //   571: invokespecial 223	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   574: iload 7
    //   576: invokevirtual 228	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   579: ldc_w 376
    //   582: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   585: lload 11
    //   587: invokevirtual 220	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   590: invokevirtual 210	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   593: invokevirtual 233	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Object;)V
    //   596: lload 11
    //   598: lconst_0
    //   599: lcmp
    //   600: ifgt +190 -> 790
    //   603: getstatic 28	com/tencent/wxop/stat/ak:cx	Lcom/tencent/wxop/stat/b/b;
    //   606: ldc_w 378
    //   609: invokevirtual 381	com/tencent/wxop/stat/b/b:d	(Ljava/lang/Object;)V
    //   612: aload_2
    //   613: ifnull +9 -> 622
    //   616: aload_2
    //   617: invokeinterface 386 1 0
    //   622: aload_3
    //   623: invokestatic 391	org/apache/http/util/EntityUtils:toString	(Lorg/apache/http/HttpEntity;)Ljava/lang/String;
    //   626: pop
    //   627: return
    //   628: astore_1
    //   629: aload_1
    //   630: ifnull -614 -> 16
    //   633: getstatic 28	com/tencent/wxop/stat/ak:cx	Lcom/tencent/wxop/stat/b/b;
    //   636: aload_1
    //   637: invokevirtual 393	com/tencent/wxop/stat/b/b:a	(Ljava/lang/Throwable;)V
    //   640: aload_2
    //   641: ifnull +9 -> 650
    //   644: aload_2
    //   645: invokeinterface 386 1 0
    //   650: aload_1
    //   651: instanceof 395
    //   654: ifeq +25 -> 679
    //   657: invokestatic 398	java/lang/System:gc	()V
    //   660: aload_0
    //   661: aconst_null
    //   662: putfield 50	com/tencent/wxop/stat/ak:di	Ljava/lang/StringBuilder;
    //   665: aload_0
    //   666: new 45	java/lang/StringBuilder
    //   669: dup
    //   670: sipush 2048
    //   673: invokespecial 48	java/lang/StringBuilder:<init>	(I)V
    //   676: putfield 50	com/tencent/wxop/stat/ak:di	Ljava/lang/StringBuilder;
    //   679: getstatic 32	com/tencent/wxop/stat/ak:dk	Landroid/content/Context;
    //   682: invokestatic 262	com/tencent/wxop/stat/g:r	(Landroid/content/Context;)Lcom/tencent/wxop/stat/g;
    //   685: invokevirtual 400	com/tencent/wxop/stat/g:I	()V
    //   688: return
    //   689: invokestatic 75	com/tencent/wxop/stat/c:k	()Z
    //   692: ifeq +30 -> 722
    //   695: getstatic 28	com/tencent/wxop/stat/ak:cx	Lcom/tencent/wxop/stat/b/b;
    //   698: new 45	java/lang/StringBuilder
    //   701: dup
    //   702: ldc_w 402
    //   705: invokespecial 223	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   708: aload 6
    //   710: invokevirtual 407	org/apache/http/HttpHost:toHostString	()Ljava/lang/String;
    //   713: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   716: invokevirtual 210	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   719: invokevirtual 335	com/tencent/wxop/stat/b/b:e	(Ljava/lang/Object;)V
    //   722: aload 5
    //   724: ldc_w 299
    //   727: ldc_w 270
    //   730: invokevirtual 244	org/apache/http/client/methods/HttpPost:addHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   733: aload_0
    //   734: getfield 41	com/tencent/wxop/stat/ak:dg	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   737: invokevirtual 274	org/apache/http/impl/client/DefaultHttpClient:getParams	()Lorg/apache/http/params/HttpParams;
    //   740: ldc_w 276
    //   743: aload 6
    //   745: invokeinterface 411 3 0
    //   750: pop
    //   751: aload 5
    //   753: ldc_w 413
    //   756: getstatic 417	com/tencent/wxop/stat/c:al	Ljava/lang/String;
    //   759: invokevirtual 244	org/apache/http/client/methods/HttpPost:addHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   762: aload 5
    //   764: ldc_w 419
    //   767: ldc_w 421
    //   770: invokevirtual 244	org/apache/http/client/methods/HttpPost:addHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   773: aload 5
    //   775: ldc_w 423
    //   778: ldc_w 425
    //   781: invokevirtual 244	org/apache/http/client/methods/HttpPost:addHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   784: goto -486 -> 298
    //   787: astore_1
    //   788: aload_1
    //   789: athrow
    //   790: lload 11
    //   792: lconst_0
    //   793: lcmp
    //   794: ifle +512 -> 1306
    //   797: aload_3
    //   798: invokeinterface 429 1 0
    //   803: astore 5
    //   805: new 431	java/io/DataInputStream
    //   808: dup
    //   809: aload 5
    //   811: invokespecial 434	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   814: astore 6
    //   816: aload_3
    //   817: invokeinterface 372 1 0
    //   822: l2i
    //   823: newarray <illegal type>
    //   825: astore_3
    //   826: aload 6
    //   828: aload_3
    //   829: invokevirtual 437	java/io/DataInputStream:readFully	([B)V
    //   832: aload 5
    //   834: invokevirtual 440	java/io/InputStream:close	()V
    //   837: aload 6
    //   839: invokevirtual 441	java/io/DataInputStream:close	()V
    //   842: aload_1
    //   843: ldc_w 268
    //   846: invokeinterface 445 2 0
    //   851: astore 6
    //   853: aload_3
    //   854: astore_1
    //   855: aload 6
    //   857: ifnull +27 -> 884
    //   860: aload 6
    //   862: invokeinterface 450 1 0
    //   867: ldc_w 452
    //   870: invokevirtual 455	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   873: ifeq +271 -> 1144
    //   876: aload_3
    //   877: invokestatic 456	com/tencent/wxop/stat/b/l:b	([B)[B
    //   880: invokestatic 459	com/tencent/wxop/stat/b/g:c	([B)[B
    //   883: astore_1
    //   884: new 161	java/lang/String
    //   887: dup
    //   888: aload_1
    //   889: ldc_w 287
    //   892: invokespecial 462	java/lang/String:<init>	([BLjava/lang/String;)V
    //   895: astore_3
    //   896: invokestatic 75	com/tencent/wxop/stat/c:k	()Z
    //   899: ifeq +26 -> 925
    //   902: getstatic 28	com/tencent/wxop/stat/ak:cx	Lcom/tencent/wxop/stat/b/b;
    //   905: new 45	java/lang/StringBuilder
    //   908: dup
    //   909: ldc_w 464
    //   912: invokespecial 223	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   915: aload_3
    //   916: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   919: invokevirtual 210	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   922: invokevirtual 233	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Object;)V
    //   925: new 466	org/json/JSONObject
    //   928: dup
    //   929: aload_3
    //   930: invokespecial 467	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   933: astore_3
    //   934: iload 7
    //   936: sipush 200
    //   939: if_icmpne +310 -> 1249
    //   942: aload_3
    //   943: ldc_w 469
    //   946: invokevirtual 473	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   949: astore_1
    //   950: aload_1
    //   951: invokestatic 477	com/tencent/a/a/a/a/h:e	(Ljava/lang/String;)Z
    //   954: ifeq +42 -> 996
    //   957: invokestatic 75	com/tencent/wxop/stat/c:k	()Z
    //   960: ifeq +26 -> 986
    //   963: getstatic 28	com/tencent/wxop/stat/ak:cx	Lcom/tencent/wxop/stat/b/b;
    //   966: new 45	java/lang/StringBuilder
    //   969: dup
    //   970: ldc_w 479
    //   973: invokespecial 223	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   976: aload_1
    //   977: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   980: invokevirtual 210	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   983: invokevirtual 233	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Object;)V
    //   986: getstatic 32	com/tencent/wxop/stat/ak:dk	Landroid/content/Context;
    //   989: invokestatic 484	com/tencent/a/a/a/a/g:a	(Landroid/content/Context;)Lcom/tencent/a/a/a/a/g;
    //   992: aload_1
    //   993: invokevirtual 486	com/tencent/a/a/a/a/g:b	(Ljava/lang/String;)V
    //   996: aload_3
    //   997: ldc_w 488
    //   1000: invokevirtual 491	org/json/JSONObject:isNull	(Ljava/lang/String;)Z
    //   1003: ifne +18 -> 1021
    //   1006: aload_3
    //   1007: ldc_w 488
    //   1010: invokevirtual 495	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   1013: astore_1
    //   1014: getstatic 32	com/tencent/wxop/stat/ak:dk	Landroid/content/Context;
    //   1017: aload_1
    //   1018: invokestatic 498	com/tencent/wxop/stat/c:a	(Landroid/content/Context;Lorg/json/JSONObject;)V
    //   1021: aload_3
    //   1022: ldc_w 500
    //   1025: invokevirtual 491	org/json/JSONObject:isNull	(Ljava/lang/String;)Z
    //   1028: ifne +81 -> 1109
    //   1031: aload_3
    //   1032: ldc_w 500
    //   1035: invokevirtual 504	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   1038: istore 7
    //   1040: iload 7
    //   1042: i2l
    //   1043: invokestatic 64	java/lang/System:currentTimeMillis	()J
    //   1046: ldc2_w 65
    //   1049: ldiv
    //   1050: lsub
    //   1051: l2i
    //   1052: istore 8
    //   1054: invokestatic 75	com/tencent/wxop/stat/c:k	()Z
    //   1057: ifeq +38 -> 1095
    //   1060: getstatic 28	com/tencent/wxop/stat/ak:cx	Lcom/tencent/wxop/stat/b/b;
    //   1063: new 45	java/lang/StringBuilder
    //   1066: dup
    //   1067: ldc_w 506
    //   1070: invokespecial 223	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1073: iload 7
    //   1075: invokevirtual 228	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1078: ldc_w 508
    //   1081: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1084: iload 8
    //   1086: invokevirtual 228	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1089: invokevirtual 210	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1092: invokevirtual 233	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Object;)V
    //   1095: getstatic 32	com/tencent/wxop/stat/ak:dk	Landroid/content/Context;
    //   1098: invokestatic 511	com/tencent/wxop/stat/b/l:Q	(Landroid/content/Context;)V
    //   1101: getstatic 32	com/tencent/wxop/stat/ak:dk	Landroid/content/Context;
    //   1104: iload 8
    //   1106: invokestatic 514	com/tencent/wxop/stat/b/l:a	(Landroid/content/Context;I)V
    //   1109: aload_2
    //   1110: ifnull +19 -> 1129
    //   1113: aload_3
    //   1114: ldc_w 516
    //   1117: invokevirtual 519	org/json/JSONObject:optInt	(Ljava/lang/String;)I
    //   1120: ifne +111 -> 1231
    //   1123: aload_2
    //   1124: invokeinterface 522 1 0
    //   1129: aload 5
    //   1131: invokevirtual 440	java/io/InputStream:close	()V
    //   1134: aload 4
    //   1136: invokevirtual 523	java/io/ByteArrayOutputStream:close	()V
    //   1139: aconst_null
    //   1140: astore_1
    //   1141: goto -512 -> 629
    //   1144: aload 6
    //   1146: invokeinterface 450 1 0
    //   1151: ldc_w 525
    //   1154: invokevirtual 455	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   1157: ifeq +14 -> 1171
    //   1160: aload_3
    //   1161: invokestatic 459	com/tencent/wxop/stat/b/g:c	([B)[B
    //   1164: invokestatic 456	com/tencent/wxop/stat/b/l:b	([B)[B
    //   1167: astore_1
    //   1168: goto -284 -> 884
    //   1171: aload 6
    //   1173: invokeinterface 450 1 0
    //   1178: ldc -16
    //   1180: invokevirtual 455	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   1183: ifeq +11 -> 1194
    //   1186: aload_3
    //   1187: invokestatic 456	com/tencent/wxop/stat/b/l:b	([B)[B
    //   1190: astore_1
    //   1191: goto -307 -> 884
    //   1194: aload_3
    //   1195: astore_1
    //   1196: aload 6
    //   1198: invokeinterface 450 1 0
    //   1203: ldc_w 270
    //   1206: invokevirtual 455	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   1209: ifeq -325 -> 884
    //   1212: aload_3
    //   1213: invokestatic 459	com/tencent/wxop/stat/b/g:c	([B)[B
    //   1216: astore_1
    //   1217: goto -333 -> 884
    //   1220: astore_1
    //   1221: getstatic 28	com/tencent/wxop/stat/ak:cx	Lcom/tencent/wxop/stat/b/b;
    //   1224: aload_1
    //   1225: invokevirtual 527	com/tencent/wxop/stat/b/b:c	(Ljava/lang/Object;)V
    //   1228: goto -119 -> 1109
    //   1231: getstatic 28	com/tencent/wxop/stat/ak:cx	Lcom/tencent/wxop/stat/b/b;
    //   1234: ldc_w 529
    //   1237: invokevirtual 532	com/tencent/wxop/stat/b/b:error	(Ljava/lang/Object;)V
    //   1240: aload_2
    //   1241: invokeinterface 386 1 0
    //   1246: goto -117 -> 1129
    //   1249: getstatic 28	com/tencent/wxop/stat/ak:cx	Lcom/tencent/wxop/stat/b/b;
    //   1252: new 45	java/lang/StringBuilder
    //   1255: dup
    //   1256: ldc_w 534
    //   1259: invokespecial 223	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1262: iload 7
    //   1264: invokevirtual 228	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1267: ldc_w 536
    //   1270: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1273: new 161	java/lang/String
    //   1276: dup
    //   1277: aload_1
    //   1278: ldc_w 287
    //   1281: invokespecial 462	java/lang/String:<init>	([BLjava/lang/String;)V
    //   1284: invokevirtual 202	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1287: invokevirtual 210	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1290: invokevirtual 532	com/tencent/wxop/stat/b/b:error	(Ljava/lang/Object;)V
    //   1293: aload_2
    //   1294: ifnull -165 -> 1129
    //   1297: aload_2
    //   1298: invokeinterface 386 1 0
    //   1303: goto -174 -> 1129
    //   1306: aload_3
    //   1307: invokestatic 391	org/apache/http/util/EntityUtils:toString	(Lorg/apache/http/HttpEntity;)Ljava/lang/String;
    //   1310: pop
    //   1311: goto -177 -> 1134
    //   1314: astore_2
    //   1315: getstatic 28	com/tencent/wxop/stat/ak:cx	Lcom/tencent/wxop/stat/b/b;
    //   1318: aload_2
    //   1319: invokevirtual 151	com/tencent/wxop/stat/b/b:b	(Ljava/lang/Throwable;)V
    //   1322: goto -672 -> 650
    //   1325: iload 7
    //   1327: iconst_1
    //   1328: iadd
    //   1329: istore 7
    //   1331: goto -1269 -> 62
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1334	0	this	ak
    //   0	1334	1	paramList	List<?>
    //   0	1334	2	paramaj	aj
    //   162	1145	3	localObject1	Object
    //   307	828	4	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   228	902	5	localObject2	Object
    //   264	933	6	localObject3	Object
    //   60	1270	7	i	int
    //   1	1104	8	j	int
    //   23	449	9	k	int
    //   132	199	10	m	int
    //   553	238	11	l	long
    // Exception table:
    //   from	to	target	type
    //   33	59	628	java/lang/Throwable
    //   69	88	628	java/lang/Throwable
    //   97	107	628	java/lang/Throwable
    //   110	220	628	java/lang/Throwable
    //   220	277	628	java/lang/Throwable
    //   282	298	628	java/lang/Throwable
    //   298	321	628	java/lang/Throwable
    //   325	333	628	java/lang/Throwable
    //   343	383	628	java/lang/Throwable
    //   388	405	628	java/lang/Throwable
    //   405	450	628	java/lang/Throwable
    //   452	499	628	java/lang/Throwable
    //   501	596	628	java/lang/Throwable
    //   603	612	628	java/lang/Throwable
    //   616	622	628	java/lang/Throwable
    //   622	627	628	java/lang/Throwable
    //   689	722	628	java/lang/Throwable
    //   722	784	628	java/lang/Throwable
    //   797	853	628	java/lang/Throwable
    //   860	884	628	java/lang/Throwable
    //   884	925	628	java/lang/Throwable
    //   925	934	628	java/lang/Throwable
    //   1113	1129	628	java/lang/Throwable
    //   1129	1134	628	java/lang/Throwable
    //   1134	1139	628	java/lang/Throwable
    //   1144	1168	628	java/lang/Throwable
    //   1171	1191	628	java/lang/Throwable
    //   1196	1217	628	java/lang/Throwable
    //   1221	1228	628	java/lang/Throwable
    //   1231	1246	628	java/lang/Throwable
    //   1249	1293	628	java/lang/Throwable
    //   1297	1303	628	java/lang/Throwable
    //   1306	1311	628	java/lang/Throwable
    //   33	59	787	finally
    //   69	88	787	finally
    //   97	107	787	finally
    //   110	220	787	finally
    //   220	277	787	finally
    //   282	298	787	finally
    //   298	321	787	finally
    //   325	333	787	finally
    //   343	383	787	finally
    //   388	405	787	finally
    //   405	450	787	finally
    //   452	499	787	finally
    //   501	596	787	finally
    //   603	612	787	finally
    //   616	622	787	finally
    //   622	627	787	finally
    //   689	722	787	finally
    //   722	784	787	finally
    //   797	853	787	finally
    //   860	884	787	finally
    //   884	925	787	finally
    //   925	934	787	finally
    //   942	986	787	finally
    //   986	996	787	finally
    //   996	1021	787	finally
    //   1021	1095	787	finally
    //   1095	1109	787	finally
    //   1113	1129	787	finally
    //   1129	1134	787	finally
    //   1134	1139	787	finally
    //   1144	1168	787	finally
    //   1171	1191	787	finally
    //   1196	1217	787	finally
    //   1221	1228	787	finally
    //   1231	1246	787	finally
    //   1249	1293	787	finally
    //   1297	1303	787	finally
    //   1306	1311	787	finally
    //   942	986	1220	java/lang/Throwable
    //   986	996	1220	java/lang/Throwable
    //   996	1021	1220	java/lang/Throwable
    //   1021	1095	1220	java/lang/Throwable
    //   1095	1109	1220	java/lang/Throwable
    //   644	650	1314	java/lang/Throwable
  }
  
  final void b(List<?> paramList, aj paramaj)
  {
    if (this.dh != null) {
      this.dh.a(new am(this, paramList, paramaj));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\wxop\stat\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */