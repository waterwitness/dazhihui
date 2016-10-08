package com.tencent.beacon.b;

import android.content.Context;
import com.tencent.beacon.a.h;
import com.tencent.beacon.e.d;
import com.tencent.beacon.event.UserAction;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.apache.http.util.EncodingUtils;

public class a
{
  private static a s;
  private String a = "";
  private String b = "";
  private String c = "";
  private String d = "";
  private String e = "";
  private String f = "";
  private String g = "";
  private String h = "";
  private String i = "";
  private String j = "";
  private boolean k = false;
  private String l = "";
  private String m = "";
  private String n = "";
  private String o = "";
  private String p = "";
  private String q = "";
  private String r = "";
  
  private a(Context paramContext)
  {
    Object localObject = h.a(paramContext);
    this.c = h.e(paramContext);
    this.d = h.c(paramContext);
    this.e = h.d(paramContext);
    if ("".equals(this.c))
    {
      str = b("/sys/class/net/eth0/address");
      if ((!str.trim().equals("")) && (str.length() >= 17)) {
        break label725;
      }
    }
    for (String str = "";; str = str.toLowerCase().substring(0, 17))
    {
      this.f = str;
      this.g = UserAction.getQQ();
      this.h = h.b();
      this.i = h.m();
      this.j = ((h)localObject).a();
      this.k = com.tencent.beacon.e.e.a().b();
      h.l(paramContext);
      str = com.tencent.beacon.a.b.b(paramContext, "f_non_empty_qimei_v2", "");
      localObject = str.split("\\|\\|\\|");
      if (localObject.length == 7)
      {
        this.l = localObject[0];
        this.m = localObject[1];
        this.n = localObject[2];
        this.o = localObject[3];
        this.p = localObject[4];
        this.q = localObject[5];
        this.r = localObject[6];
      }
      if ((!this.b.equals("")) && (this.l.trim().equals(""))) {
        this.l = this.b;
      }
      if ((!this.c.equals("")) && (this.m.trim().equals(""))) {
        this.m = this.c;
      }
      if ((!this.d.equals("")) && (this.n.trim().equals(""))) {
        this.n = this.d;
      }
      if ((!this.h.equals("")) && (this.o.trim().equals(""))) {
        this.o = this.h;
      }
      if ((!this.f.equals("")) && (this.p.trim().equals(""))) {
        this.p = this.f;
      }
      if ((!this.e.equals("")) && (this.q.trim().equals(""))) {
        this.q = this.e;
      }
      if ((!this.i.equals("")) && (this.r.trim().equals(""))) {
        this.r = this.i;
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(this.l);
      ((StringBuilder)localObject).append("|||");
      ((StringBuilder)localObject).append(this.m);
      ((StringBuilder)localObject).append("|||");
      ((StringBuilder)localObject).append(this.n);
      ((StringBuilder)localObject).append("|||");
      ((StringBuilder)localObject).append(this.o);
      ((StringBuilder)localObject).append("|||");
      ((StringBuilder)localObject).append(this.p);
      ((StringBuilder)localObject).append("|||");
      ((StringBuilder)localObject).append(this.q);
      ((StringBuilder)localObject).append("|||");
      ((StringBuilder)localObject).append(this.r);
      if (!((StringBuilder)localObject).toString().equals(str)) {
        com.tencent.beacon.a.b.a(paramContext, "f_non_empty_qimei_v2", ((StringBuilder)localObject).toString());
      }
      label725:
      try
      {
        paramContext = new d(paramContext).a();
        if ((paramContext != null) && (!"".equals(paramContext))) {
          this.a = paramContext;
        }
        return;
      }
      catch (Exception paramContext) {}
    }
  }
  
  /* Error */
  public static long a(String paramString, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +7 -> 8
    //   4: iload_1
    //   5: ifgt +7 -> 12
    //   8: ldc2_w 177
    //   11: lreturn
    //   12: aconst_null
    //   13: astore_2
    //   14: aconst_null
    //   15: astore 4
    //   17: invokestatic 184	java/lang/System:currentTimeMillis	()J
    //   20: lstore 6
    //   22: new 186	java/net/InetSocketAddress
    //   25: dup
    //   26: aload_0
    //   27: iload_1
    //   28: invokespecial 189	java/net/InetSocketAddress:<init>	(Ljava/lang/String;I)V
    //   31: astore 5
    //   33: new 191	java/net/Socket
    //   36: dup
    //   37: invokespecial 192	java/net/Socket:<init>	()V
    //   40: astore_3
    //   41: aload_3
    //   42: aload 5
    //   44: sipush 30000
    //   47: invokevirtual 196	java/net/Socket:connect	(Ljava/net/SocketAddress;I)V
    //   50: invokestatic 184	java/lang/System:currentTimeMillis	()J
    //   53: lload 6
    //   55: lsub
    //   56: lstore 6
    //   58: new 145	java/lang/StringBuilder
    //   61: dup
    //   62: ldc -58
    //   64: invokespecial 201	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   67: lload 6
    //   69: invokevirtual 204	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   72: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   75: iconst_0
    //   76: anewarray 4	java/lang/Object
    //   79: invokestatic 209	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   82: aload_3
    //   83: invokevirtual 212	java/net/Socket:close	()V
    //   86: lload 6
    //   88: lreturn
    //   89: astore_0
    //   90: aload_0
    //   91: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   94: aload_0
    //   95: invokevirtual 218	java/io/IOException:getMessage	()Ljava/lang/String;
    //   98: iconst_0
    //   99: anewarray 4	java/lang/Object
    //   102: invokestatic 220	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   105: lload 6
    //   107: lreturn
    //   108: astore_2
    //   109: aload 4
    //   111: astore_3
    //   112: aload_2
    //   113: astore 4
    //   115: aload_3
    //   116: astore_2
    //   117: aload 4
    //   119: invokevirtual 221	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   122: iconst_0
    //   123: anewarray 4	java/lang/Object
    //   126: invokestatic 220	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   129: aload_3
    //   130: astore_2
    //   131: new 145	java/lang/StringBuilder
    //   134: dup
    //   135: ldc -33
    //   137: invokespecial 201	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   140: aload_0
    //   141: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: ldc -31
    //   146: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: iload_1
    //   150: invokevirtual 228	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   153: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   156: iconst_0
    //   157: anewarray 4	java/lang/Object
    //   160: invokestatic 230	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   163: aload_3
    //   164: ifnull +7 -> 171
    //   167: aload_3
    //   168: invokevirtual 212	java/net/Socket:close	()V
    //   171: ldc2_w 177
    //   174: lreturn
    //   175: astore_0
    //   176: aload_0
    //   177: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   180: aload_0
    //   181: invokevirtual 218	java/io/IOException:getMessage	()Ljava/lang/String;
    //   184: iconst_0
    //   185: anewarray 4	java/lang/Object
    //   188: invokestatic 220	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   191: ldc2_w 177
    //   194: lreturn
    //   195: astore_0
    //   196: aload_2
    //   197: ifnull +7 -> 204
    //   200: aload_2
    //   201: invokevirtual 212	java/net/Socket:close	()V
    //   204: aload_0
    //   205: athrow
    //   206: astore_2
    //   207: aload_2
    //   208: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   211: aload_2
    //   212: invokevirtual 218	java/io/IOException:getMessage	()Ljava/lang/String;
    //   215: iconst_0
    //   216: anewarray 4	java/lang/Object
    //   219: invokestatic 220	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   222: goto -18 -> 204
    //   225: astore_0
    //   226: aload_3
    //   227: astore_2
    //   228: goto -32 -> 196
    //   231: astore 4
    //   233: goto -118 -> 115
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	236	0	paramString	String
    //   0	236	1	paramInt	int
    //   13	1	2	localObject1	Object
    //   108	5	2	localThrowable1	Throwable
    //   116	85	2	localObject2	Object
    //   206	6	2	localIOException	java.io.IOException
    //   227	1	2	localObject3	Object
    //   40	187	3	localObject4	Object
    //   15	103	4	localThrowable2	Throwable
    //   231	1	4	localThrowable3	Throwable
    //   31	12	5	localInetSocketAddress	java.net.InetSocketAddress
    //   20	86	6	l1	long
    // Exception table:
    //   from	to	target	type
    //   82	86	89	java/io/IOException
    //   33	41	108	java/lang/Throwable
    //   167	171	175	java/io/IOException
    //   33	41	195	finally
    //   117	129	195	finally
    //   131	163	195	finally
    //   200	204	206	java/io/IOException
    //   41	82	225	finally
    //   41	82	231	java/lang/Throwable
  }
  
  /* Error */
  public static a.b a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +12 -> 13
    //   4: aload_0
    //   5: ldc 35
    //   7: invokevirtual 97	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   10: ifeq +5 -> 15
    //   13: aconst_null
    //   14: areturn
    //   15: new 233	com/tencent/beacon/b/a$b
    //   18: dup
    //   19: invokespecial 234	com/tencent/beacon/b/a$b:<init>	()V
    //   22: astore 16
    //   24: aconst_null
    //   25: astore 14
    //   27: aconst_null
    //   28: astore 13
    //   30: aconst_null
    //   31: astore 10
    //   33: aconst_null
    //   34: astore 9
    //   36: aconst_null
    //   37: astore 12
    //   39: aconst_null
    //   40: astore 11
    //   42: aload 11
    //   44: astore 7
    //   46: aload 9
    //   48: astore 5
    //   50: aload 13
    //   52: astore_3
    //   53: aload 12
    //   55: astore 6
    //   57: aload 10
    //   59: astore 4
    //   61: aload 14
    //   63: astore_2
    //   64: new 236	java/net/URL
    //   67: dup
    //   68: aload_0
    //   69: invokespecial 237	java/net/URL:<init>	(Ljava/lang/String;)V
    //   72: astore 17
    //   74: aconst_null
    //   75: astore 15
    //   77: aload 11
    //   79: astore 7
    //   81: aload 9
    //   83: astore 5
    //   85: aload 13
    //   87: astore_3
    //   88: aload 12
    //   90: astore 6
    //   92: aload 10
    //   94: astore 4
    //   96: aload 14
    //   98: astore_2
    //   99: invokestatic 242	android/net/Proxy:getDefaultHost	()Ljava/lang/String;
    //   102: astore 8
    //   104: aload 11
    //   106: astore 7
    //   108: aload 9
    //   110: astore 5
    //   112: aload 13
    //   114: astore_3
    //   115: aload 12
    //   117: astore 6
    //   119: aload 10
    //   121: astore 4
    //   123: aload 14
    //   125: astore_2
    //   126: invokestatic 245	android/net/Proxy:getDefaultPort	()I
    //   129: istore 20
    //   131: aload 8
    //   133: ifnull +45 -> 178
    //   136: aload 11
    //   138: astore 7
    //   140: aload 9
    //   142: astore 5
    //   144: aload 13
    //   146: astore_3
    //   147: aload 12
    //   149: astore 6
    //   151: aload 10
    //   153: astore 4
    //   155: aload 14
    //   157: astore_2
    //   158: aload 8
    //   160: invokevirtual 105	java/lang/String:trim	()Ljava/lang/String;
    //   163: invokevirtual 109	java/lang/String:length	()I
    //   166: ifeq +12 -> 178
    //   169: iload 20
    //   171: istore 19
    //   173: iload 20
    //   175: ifgt +1459 -> 1634
    //   178: aload 11
    //   180: astore 7
    //   182: aload 9
    //   184: astore 5
    //   186: aload 13
    //   188: astore_3
    //   189: aload 12
    //   191: astore 6
    //   193: aload 10
    //   195: astore 4
    //   197: aload 14
    //   199: astore_2
    //   200: ldc -9
    //   202: iconst_0
    //   203: anewarray 4	java/lang/Object
    //   206: invokestatic 209	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   209: aload_1
    //   210: ifnull +1671 -> 1881
    //   213: aload 11
    //   215: astore 7
    //   217: aload 9
    //   219: astore 5
    //   221: aload 13
    //   223: astore_3
    //   224: aload 12
    //   226: astore 6
    //   228: aload 10
    //   230: astore 4
    //   232: aload 14
    //   234: astore_2
    //   235: aload_1
    //   236: invokevirtual 105	java/lang/String:trim	()Ljava/lang/String;
    //   239: invokevirtual 109	java/lang/String:length	()I
    //   242: ifgt +786 -> 1028
    //   245: goto +1636 -> 1881
    //   248: aload_0
    //   249: ifnonnull +1539 -> 1788
    //   252: aload 11
    //   254: astore 7
    //   256: aload 9
    //   258: astore 5
    //   260: aload 13
    //   262: astore_3
    //   263: aload 12
    //   265: astore 6
    //   267: aload 10
    //   269: astore 4
    //   271: aload 14
    //   273: astore_2
    //   274: aload 17
    //   276: invokevirtual 251	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   279: checkcast 253	java/net/HttpURLConnection
    //   282: astore_0
    //   283: aload 11
    //   285: astore 7
    //   287: aload 9
    //   289: astore 5
    //   291: aload_0
    //   292: astore_3
    //   293: aload 12
    //   295: astore 6
    //   297: aload 10
    //   299: astore 4
    //   301: aload_0
    //   302: astore_2
    //   303: aload_0
    //   304: iconst_1
    //   305: invokevirtual 257	java/net/HttpURLConnection:setDoInput	(Z)V
    //   308: aload 11
    //   310: astore 7
    //   312: aload 9
    //   314: astore 5
    //   316: aload_0
    //   317: astore_3
    //   318: aload 12
    //   320: astore 6
    //   322: aload 10
    //   324: astore 4
    //   326: aload_0
    //   327: astore_2
    //   328: aload_0
    //   329: iconst_1
    //   330: invokevirtual 260	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   333: aload 11
    //   335: astore 7
    //   337: aload 9
    //   339: astore 5
    //   341: aload_0
    //   342: astore_3
    //   343: aload 12
    //   345: astore 6
    //   347: aload 10
    //   349: astore 4
    //   351: aload_0
    //   352: astore_2
    //   353: aload_0
    //   354: sipush 30000
    //   357: invokevirtual 264	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   360: aload 11
    //   362: astore 7
    //   364: aload 9
    //   366: astore 5
    //   368: aload_0
    //   369: astore_3
    //   370: aload 12
    //   372: astore 6
    //   374: aload 10
    //   376: astore 4
    //   378: aload_0
    //   379: astore_2
    //   380: aload_0
    //   381: sipush 30000
    //   384: invokevirtual 267	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   387: aload 11
    //   389: astore 7
    //   391: aload 9
    //   393: astore 5
    //   395: aload_0
    //   396: astore_3
    //   397: aload 12
    //   399: astore 6
    //   401: aload 10
    //   403: astore 4
    //   405: aload_0
    //   406: astore_2
    //   407: invokestatic 184	java/lang/System:currentTimeMillis	()J
    //   410: lstore 21
    //   412: aload 11
    //   414: astore 7
    //   416: aload 9
    //   418: astore 5
    //   420: aload_0
    //   421: astore_3
    //   422: aload 12
    //   424: astore 6
    //   426: aload 10
    //   428: astore 4
    //   430: aload_0
    //   431: astore_2
    //   432: aload_0
    //   433: invokevirtual 269	java/net/HttpURLConnection:connect	()V
    //   436: aload 11
    //   438: astore 7
    //   440: aload 9
    //   442: astore 5
    //   444: aload_0
    //   445: astore_3
    //   446: aload 12
    //   448: astore 6
    //   450: aload 10
    //   452: astore 4
    //   454: aload_0
    //   455: astore_2
    //   456: invokestatic 184	java/lang/System:currentTimeMillis	()J
    //   459: lstore 23
    //   461: aload 11
    //   463: astore 7
    //   465: aload 9
    //   467: astore 5
    //   469: aload_0
    //   470: astore_3
    //   471: aload 12
    //   473: astore 6
    //   475: aload 10
    //   477: astore 4
    //   479: aload_0
    //   480: astore_2
    //   481: aload_0
    //   482: invokevirtual 273	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   485: astore_1
    //   486: aload_1
    //   487: astore 7
    //   489: aload 9
    //   491: astore 5
    //   493: aload_0
    //   494: astore_3
    //   495: aload_1
    //   496: astore 6
    //   498: aload 10
    //   500: astore 4
    //   502: aload_0
    //   503: astore_2
    //   504: invokestatic 184	java/lang/System:currentTimeMillis	()J
    //   507: lstore 25
    //   509: aload_1
    //   510: astore 7
    //   512: aload 9
    //   514: astore 5
    //   516: aload_0
    //   517: astore_3
    //   518: aload_1
    //   519: astore 6
    //   521: aload 10
    //   523: astore 4
    //   525: aload_0
    //   526: astore_2
    //   527: aload_0
    //   528: invokevirtual 277	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   531: astore 8
    //   533: aload_1
    //   534: astore 7
    //   536: aload 8
    //   538: astore 5
    //   540: aload_0
    //   541: astore_3
    //   542: aload_1
    //   543: astore 6
    //   545: aload 8
    //   547: astore 4
    //   549: aload_0
    //   550: astore_2
    //   551: invokestatic 184	java/lang/System:currentTimeMillis	()J
    //   554: lstore 27
    //   556: aload_1
    //   557: astore 7
    //   559: aload 8
    //   561: astore 5
    //   563: aload_0
    //   564: astore_3
    //   565: aload_1
    //   566: astore 6
    //   568: aload 8
    //   570: astore 4
    //   572: aload_0
    //   573: astore_2
    //   574: aload 8
    //   576: invokevirtual 282	java/io/InputStream:read	()I
    //   579: iconst_m1
    //   580: if_icmpne -24 -> 556
    //   583: aload_1
    //   584: astore 7
    //   586: aload 8
    //   588: astore 5
    //   590: aload_0
    //   591: astore_3
    //   592: aload_1
    //   593: astore 6
    //   595: aload 8
    //   597: astore 4
    //   599: aload_0
    //   600: astore_2
    //   601: invokestatic 184	java/lang/System:currentTimeMillis	()J
    //   604: lstore 29
    //   606: aload_1
    //   607: astore 7
    //   609: aload 8
    //   611: astore 5
    //   613: aload_0
    //   614: astore_3
    //   615: aload_1
    //   616: astore 6
    //   618: aload 8
    //   620: astore 4
    //   622: aload_0
    //   623: astore_2
    //   624: aload 16
    //   626: ldc2_w 177
    //   629: putfield 285	com/tencent/beacon/b/a$b:a	J
    //   632: aload_1
    //   633: astore 7
    //   635: aload 8
    //   637: astore 5
    //   639: aload_0
    //   640: astore_3
    //   641: aload_1
    //   642: astore 6
    //   644: aload 8
    //   646: astore 4
    //   648: aload_0
    //   649: astore_2
    //   650: aload 16
    //   652: ldc 35
    //   654: putfield 286	com/tencent/beacon/b/a$b:f	Ljava/lang/String;
    //   657: aload_1
    //   658: astore 7
    //   660: aload 8
    //   662: astore 5
    //   664: aload_0
    //   665: astore_3
    //   666: aload_1
    //   667: astore 6
    //   669: aload 8
    //   671: astore 4
    //   673: aload_0
    //   674: astore_2
    //   675: aload 16
    //   677: lload 23
    //   679: lload 21
    //   681: lsub
    //   682: putfield 288	com/tencent/beacon/b/a$b:b	J
    //   685: aload_1
    //   686: astore 7
    //   688: aload 8
    //   690: astore 5
    //   692: aload_0
    //   693: astore_3
    //   694: aload_1
    //   695: astore 6
    //   697: aload 8
    //   699: astore 4
    //   701: aload_0
    //   702: astore_2
    //   703: aload 16
    //   705: lload 25
    //   707: lload 23
    //   709: lsub
    //   710: putfield 290	com/tencent/beacon/b/a$b:c	J
    //   713: aload_1
    //   714: astore 7
    //   716: aload 8
    //   718: astore 5
    //   720: aload_0
    //   721: astore_3
    //   722: aload_1
    //   723: astore 6
    //   725: aload 8
    //   727: astore 4
    //   729: aload_0
    //   730: astore_2
    //   731: aload 16
    //   733: lload 27
    //   735: lload 25
    //   737: lsub
    //   738: putfield 292	com/tencent/beacon/b/a$b:d	J
    //   741: aload_1
    //   742: astore 7
    //   744: aload 8
    //   746: astore 5
    //   748: aload_0
    //   749: astore_3
    //   750: aload_1
    //   751: astore 6
    //   753: aload 8
    //   755: astore 4
    //   757: aload_0
    //   758: astore_2
    //   759: aload 16
    //   761: lload 29
    //   763: lload 27
    //   765: lsub
    //   766: putfield 294	com/tencent/beacon/b/a$b:e	J
    //   769: aload_1
    //   770: astore 7
    //   772: aload 8
    //   774: astore 5
    //   776: aload_0
    //   777: astore_3
    //   778: aload_1
    //   779: astore 6
    //   781: aload 8
    //   783: astore 4
    //   785: aload_0
    //   786: astore_2
    //   787: new 145	java/lang/StringBuilder
    //   790: dup
    //   791: ldc_w 296
    //   794: invokespecial 201	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   797: aload 16
    //   799: getfield 285	com/tencent/beacon/b/a$b:a	J
    //   802: invokevirtual 204	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   805: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   808: iconst_0
    //   809: anewarray 4	java/lang/Object
    //   812: invokestatic 209	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   815: aload_1
    //   816: astore 7
    //   818: aload 8
    //   820: astore 5
    //   822: aload_0
    //   823: astore_3
    //   824: aload_1
    //   825: astore 6
    //   827: aload 8
    //   829: astore 4
    //   831: aload_0
    //   832: astore_2
    //   833: new 145	java/lang/StringBuilder
    //   836: dup
    //   837: ldc_w 298
    //   840: invokespecial 201	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   843: aload 16
    //   845: getfield 288	com/tencent/beacon/b/a$b:b	J
    //   848: invokevirtual 204	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   851: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   854: iconst_0
    //   855: anewarray 4	java/lang/Object
    //   858: invokestatic 209	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   861: aload_1
    //   862: astore 7
    //   864: aload 8
    //   866: astore 5
    //   868: aload_0
    //   869: astore_3
    //   870: aload_1
    //   871: astore 6
    //   873: aload 8
    //   875: astore 4
    //   877: aload_0
    //   878: astore_2
    //   879: new 145	java/lang/StringBuilder
    //   882: dup
    //   883: ldc_w 300
    //   886: invokespecial 201	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   889: aload 16
    //   891: getfield 290	com/tencent/beacon/b/a$b:c	J
    //   894: invokevirtual 204	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   897: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   900: iconst_0
    //   901: anewarray 4	java/lang/Object
    //   904: invokestatic 209	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   907: aload_1
    //   908: astore 7
    //   910: aload 8
    //   912: astore 5
    //   914: aload_0
    //   915: astore_3
    //   916: aload_1
    //   917: astore 6
    //   919: aload 8
    //   921: astore 4
    //   923: aload_0
    //   924: astore_2
    //   925: new 145	java/lang/StringBuilder
    //   928: dup
    //   929: ldc_w 302
    //   932: invokespecial 201	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   935: aload 16
    //   937: getfield 292	com/tencent/beacon/b/a$b:d	J
    //   940: invokevirtual 204	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   943: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   946: iconst_0
    //   947: anewarray 4	java/lang/Object
    //   950: invokestatic 209	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   953: aload_1
    //   954: astore 7
    //   956: aload 8
    //   958: astore 5
    //   960: aload_0
    //   961: astore_3
    //   962: aload_1
    //   963: astore 6
    //   965: aload 8
    //   967: astore 4
    //   969: aload_0
    //   970: astore_2
    //   971: new 145	java/lang/StringBuilder
    //   974: dup
    //   975: ldc_w 304
    //   978: invokespecial 201	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   981: aload 16
    //   983: getfield 294	com/tencent/beacon/b/a$b:e	J
    //   986: invokevirtual 204	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   989: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   992: iconst_0
    //   993: anewarray 4	java/lang/Object
    //   996: invokestatic 209	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   999: aload_1
    //   1000: ifnull +7 -> 1007
    //   1003: aload_1
    //   1004: invokevirtual 307	java/io/OutputStream:close	()V
    //   1007: aload 8
    //   1009: ifnull +8 -> 1017
    //   1012: aload 8
    //   1014: invokevirtual 308	java/io/InputStream:close	()V
    //   1017: aload_0
    //   1018: ifnull +7 -> 1025
    //   1021: aload_0
    //   1022: invokevirtual 311	java/net/HttpURLConnection:disconnect	()V
    //   1025: aload 16
    //   1027: areturn
    //   1028: aload 11
    //   1030: astore 7
    //   1032: aload 9
    //   1034: astore 5
    //   1036: aload 13
    //   1038: astore_3
    //   1039: aload 12
    //   1041: astore 6
    //   1043: aload 10
    //   1045: astore 4
    //   1047: aload 14
    //   1049: astore_2
    //   1050: new 313	com/tencent/beacon/b/a$a
    //   1053: dup
    //   1054: invokespecial 314	com/tencent/beacon/b/a$a:<init>	()V
    //   1057: astore 8
    //   1059: aload 11
    //   1061: astore 7
    //   1063: aload 9
    //   1065: astore 5
    //   1067: aload 13
    //   1069: astore_3
    //   1070: aload 12
    //   1072: astore 6
    //   1074: aload 10
    //   1076: astore 4
    //   1078: aload 14
    //   1080: astore_2
    //   1081: aload_1
    //   1082: invokevirtual 166	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   1085: astore 18
    //   1087: aload 11
    //   1089: astore 7
    //   1091: aload 9
    //   1093: astore 5
    //   1095: aload 13
    //   1097: astore_3
    //   1098: aload 12
    //   1100: astore 6
    //   1102: aload 10
    //   1104: astore 4
    //   1106: aload 14
    //   1108: astore_2
    //   1109: aload 18
    //   1111: ldc_w 316
    //   1114: invokevirtual 320	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   1117: ifeq +167 -> 1284
    //   1120: aload 11
    //   1122: astore 7
    //   1124: aload 9
    //   1126: astore 5
    //   1128: aload 13
    //   1130: astore_3
    //   1131: aload 12
    //   1133: astore 6
    //   1135: aload 10
    //   1137: astore 4
    //   1139: aload 14
    //   1141: astore_2
    //   1142: ldc_w 322
    //   1145: iconst_0
    //   1146: anewarray 4	java/lang/Object
    //   1149: invokestatic 209	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1152: aload 11
    //   1154: astore 7
    //   1156: aload 9
    //   1158: astore 5
    //   1160: aload 13
    //   1162: astore_3
    //   1163: aload 12
    //   1165: astore 6
    //   1167: aload 10
    //   1169: astore 4
    //   1171: aload 14
    //   1173: astore_2
    //   1174: aload 8
    //   1176: ldc_w 324
    //   1179: putfield 325	com/tencent/beacon/b/a$a:a	Ljava/lang/String;
    //   1182: aload 11
    //   1184: astore 7
    //   1186: aload 9
    //   1188: astore 5
    //   1190: aload 13
    //   1192: astore_3
    //   1193: aload 12
    //   1195: astore 6
    //   1197: aload 10
    //   1199: astore 4
    //   1201: aload 14
    //   1203: astore_2
    //   1204: aload 8
    //   1206: bipush 80
    //   1208: putfield 328	com/tencent/beacon/b/a$a:b	I
    //   1211: aload 8
    //   1213: astore_0
    //   1214: goto +669 -> 1883
    //   1217: astore_0
    //   1218: aload 7
    //   1220: astore 6
    //   1222: aload 5
    //   1224: astore 4
    //   1226: aload_3
    //   1227: astore_2
    //   1228: aload_0
    //   1229: invokevirtual 329	java/lang/Throwable:printStackTrace	()V
    //   1232: aload 7
    //   1234: astore 6
    //   1236: aload 5
    //   1238: astore 4
    //   1240: aload_3
    //   1241: astore_2
    //   1242: aload_0
    //   1243: invokevirtual 221	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   1246: iconst_0
    //   1247: anewarray 4	java/lang/Object
    //   1250: invokestatic 220	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1253: aload 7
    //   1255: ifnull +8 -> 1263
    //   1258: aload 7
    //   1260: invokevirtual 307	java/io/OutputStream:close	()V
    //   1263: aload 5
    //   1265: ifnull +8 -> 1273
    //   1268: aload 5
    //   1270: invokevirtual 308	java/io/InputStream:close	()V
    //   1273: aload_3
    //   1274: ifnull -249 -> 1025
    //   1277: aload_3
    //   1278: invokevirtual 311	java/net/HttpURLConnection:disconnect	()V
    //   1281: goto -256 -> 1025
    //   1284: aload 11
    //   1286: astore 7
    //   1288: aload 9
    //   1290: astore 5
    //   1292: aload 13
    //   1294: astore_3
    //   1295: aload 12
    //   1297: astore 6
    //   1299: aload 10
    //   1301: astore 4
    //   1303: aload 14
    //   1305: astore_2
    //   1306: aload 18
    //   1308: ldc_w 331
    //   1311: invokevirtual 320	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   1314: ifeq +131 -> 1445
    //   1317: aload 11
    //   1319: astore 7
    //   1321: aload 9
    //   1323: astore 5
    //   1325: aload 13
    //   1327: astore_3
    //   1328: aload 12
    //   1330: astore 6
    //   1332: aload 10
    //   1334: astore 4
    //   1336: aload 14
    //   1338: astore_2
    //   1339: ldc_w 333
    //   1342: iconst_0
    //   1343: anewarray 4	java/lang/Object
    //   1346: invokestatic 209	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1349: aload 11
    //   1351: astore 7
    //   1353: aload 9
    //   1355: astore 5
    //   1357: aload 13
    //   1359: astore_3
    //   1360: aload 12
    //   1362: astore 6
    //   1364: aload 10
    //   1366: astore 4
    //   1368: aload 14
    //   1370: astore_2
    //   1371: aload 8
    //   1373: ldc_w 335
    //   1376: putfield 325	com/tencent/beacon/b/a$a:a	Ljava/lang/String;
    //   1379: aload 11
    //   1381: astore 7
    //   1383: aload 9
    //   1385: astore 5
    //   1387: aload 13
    //   1389: astore_3
    //   1390: aload 12
    //   1392: astore 6
    //   1394: aload 10
    //   1396: astore 4
    //   1398: aload 14
    //   1400: astore_2
    //   1401: aload 8
    //   1403: bipush 80
    //   1405: putfield 328	com/tencent/beacon/b/a$a:b	I
    //   1408: aload 8
    //   1410: astore_0
    //   1411: goto +472 -> 1883
    //   1414: astore_0
    //   1415: aload 6
    //   1417: ifnull +8 -> 1425
    //   1420: aload 6
    //   1422: invokevirtual 307	java/io/OutputStream:close	()V
    //   1425: aload 4
    //   1427: ifnull +8 -> 1435
    //   1430: aload 4
    //   1432: invokevirtual 308	java/io/InputStream:close	()V
    //   1435: aload_2
    //   1436: ifnull +7 -> 1443
    //   1439: aload_2
    //   1440: invokevirtual 311	java/net/HttpURLConnection:disconnect	()V
    //   1443: aload_0
    //   1444: athrow
    //   1445: aload 11
    //   1447: astore 7
    //   1449: aload 9
    //   1451: astore 5
    //   1453: aload 13
    //   1455: astore_3
    //   1456: aload 12
    //   1458: astore 6
    //   1460: aload 10
    //   1462: astore 4
    //   1464: aload 14
    //   1466: astore_2
    //   1467: aload 8
    //   1469: astore_0
    //   1470: aload 18
    //   1472: ldc_w 337
    //   1475: invokevirtual 320	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   1478: ifeq +405 -> 1883
    //   1481: aload 11
    //   1483: astore 7
    //   1485: aload 9
    //   1487: astore 5
    //   1489: aload 13
    //   1491: astore_3
    //   1492: aload 12
    //   1494: astore 6
    //   1496: aload 10
    //   1498: astore 4
    //   1500: aload 14
    //   1502: astore_2
    //   1503: ldc_w 339
    //   1506: iconst_0
    //   1507: anewarray 4	java/lang/Object
    //   1510: invokestatic 209	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1513: aload 11
    //   1515: astore 7
    //   1517: aload 9
    //   1519: astore 5
    //   1521: aload 13
    //   1523: astore_3
    //   1524: aload 12
    //   1526: astore 6
    //   1528: aload 10
    //   1530: astore 4
    //   1532: aload 14
    //   1534: astore_2
    //   1535: aload 8
    //   1537: ldc_w 335
    //   1540: putfield 325	com/tencent/beacon/b/a$a:a	Ljava/lang/String;
    //   1543: aload 11
    //   1545: astore 7
    //   1547: aload 9
    //   1549: astore 5
    //   1551: aload 13
    //   1553: astore_3
    //   1554: aload 12
    //   1556: astore 6
    //   1558: aload 10
    //   1560: astore 4
    //   1562: aload 14
    //   1564: astore_2
    //   1565: aload 8
    //   1567: bipush 80
    //   1569: putfield 328	com/tencent/beacon/b/a$a:b	I
    //   1572: aload 8
    //   1574: astore_0
    //   1575: goto +308 -> 1883
    //   1578: aload 11
    //   1580: astore 7
    //   1582: aload 9
    //   1584: astore 5
    //   1586: aload 13
    //   1588: astore_3
    //   1589: aload 12
    //   1591: astore 6
    //   1593: aload 10
    //   1595: astore 4
    //   1597: aload 14
    //   1599: astore_2
    //   1600: aload_0
    //   1601: getfield 325	com/tencent/beacon/b/a$a:a	Ljava/lang/String;
    //   1604: astore 8
    //   1606: aload 11
    //   1608: astore 7
    //   1610: aload 9
    //   1612: astore 5
    //   1614: aload 13
    //   1616: astore_3
    //   1617: aload 12
    //   1619: astore 6
    //   1621: aload 10
    //   1623: astore 4
    //   1625: aload 14
    //   1627: astore_2
    //   1628: aload_0
    //   1629: getfield 328	com/tencent/beacon/b/a$a:b	I
    //   1632: istore 19
    //   1634: aload 15
    //   1636: astore_0
    //   1637: aload 8
    //   1639: ifnull -1391 -> 248
    //   1642: aload 15
    //   1644: astore_0
    //   1645: aload 11
    //   1647: astore 7
    //   1649: aload 9
    //   1651: astore 5
    //   1653: aload 13
    //   1655: astore_3
    //   1656: aload 12
    //   1658: astore 6
    //   1660: aload 10
    //   1662: astore 4
    //   1664: aload 14
    //   1666: astore_2
    //   1667: aload 8
    //   1669: invokevirtual 105	java/lang/String:trim	()Ljava/lang/String;
    //   1672: invokevirtual 109	java/lang/String:length	()I
    //   1675: ifle -1427 -> 248
    //   1678: aload 11
    //   1680: astore 7
    //   1682: aload 9
    //   1684: astore 5
    //   1686: aload 13
    //   1688: astore_3
    //   1689: aload 12
    //   1691: astore 6
    //   1693: aload 10
    //   1695: astore 4
    //   1697: aload 14
    //   1699: astore_2
    //   1700: new 186	java/net/InetSocketAddress
    //   1703: dup
    //   1704: aload 8
    //   1706: iload 19
    //   1708: invokespecial 189	java/net/InetSocketAddress:<init>	(Ljava/lang/String;I)V
    //   1711: astore_0
    //   1712: aload 11
    //   1714: astore 7
    //   1716: aload 9
    //   1718: astore 5
    //   1720: aload 13
    //   1722: astore_3
    //   1723: aload 12
    //   1725: astore 6
    //   1727: aload 10
    //   1729: astore 4
    //   1731: aload 14
    //   1733: astore_2
    //   1734: new 145	java/lang/StringBuilder
    //   1737: dup
    //   1738: ldc_w 341
    //   1741: invokespecial 201	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1744: aload_1
    //   1745: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1748: ldc_w 343
    //   1751: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1754: aload 8
    //   1756: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1759: ldc -31
    //   1761: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1764: iload 19
    //   1766: invokevirtual 228	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1769: ldc_w 345
    //   1772: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1775: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1778: iconst_0
    //   1779: anewarray 4	java/lang/Object
    //   1782: invokestatic 209	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1785: goto -1537 -> 248
    //   1788: aload 11
    //   1790: astore 7
    //   1792: aload 9
    //   1794: astore 5
    //   1796: aload 13
    //   1798: astore_3
    //   1799: aload 12
    //   1801: astore 6
    //   1803: aload 10
    //   1805: astore 4
    //   1807: aload 14
    //   1809: astore_2
    //   1810: aload 17
    //   1812: new 347	java/net/Proxy
    //   1815: dup
    //   1816: getstatic 353	java/net/Proxy$Type:HTTP	Ljava/net/Proxy$Type;
    //   1819: aload_0
    //   1820: invokespecial 356	java/net/Proxy:<init>	(Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V
    //   1823: invokevirtual 359	java/net/URL:openConnection	(Ljava/net/Proxy;)Ljava/net/URLConnection;
    //   1826: checkcast 253	java/net/HttpURLConnection
    //   1829: astore_0
    //   1830: goto -1547 -> 283
    //   1833: astore_1
    //   1834: aload_1
    //   1835: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   1838: goto -831 -> 1007
    //   1841: astore_1
    //   1842: aload_1
    //   1843: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   1846: goto -829 -> 1017
    //   1849: astore_0
    //   1850: aload_0
    //   1851: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   1854: goto -591 -> 1263
    //   1857: astore_0
    //   1858: aload_0
    //   1859: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   1862: goto -589 -> 1273
    //   1865: astore_1
    //   1866: aload_1
    //   1867: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   1870: goto -445 -> 1425
    //   1873: astore_1
    //   1874: aload_1
    //   1875: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   1878: goto -443 -> 1435
    //   1881: aconst_null
    //   1882: astore_0
    //   1883: aload_0
    //   1884: ifnonnull -306 -> 1578
    //   1887: aconst_null
    //   1888: astore_0
    //   1889: goto -1641 -> 248
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1892	0	paramString1	String
    //   0	1892	1	paramString2	String
    //   63	1747	2	localObject1	Object
    //   52	1747	3	localObject2	Object
    //   59	1747	4	localObject3	Object
    //   48	1747	5	localObject4	Object
    //   55	1747	6	localObject5	Object
    //   44	1747	7	localObject6	Object
    //   102	1653	8	localObject7	Object
    //   34	1759	9	localObject8	Object
    //   31	1773	10	localObject9	Object
    //   40	1749	11	localObject10	Object
    //   37	1763	12	localObject11	Object
    //   28	1769	13	localObject12	Object
    //   25	1783	14	localObject13	Object
    //   75	1568	15	localObject14	Object
    //   22	1004	16	localb	a.b
    //   72	1739	17	localURL	java.net.URL
    //   1085	386	18	str	String
    //   171	1594	19	i1	int
    //   129	45	20	i2	int
    //   410	270	21	l1	long
    //   459	249	23	l2	long
    //   507	229	25	l3	long
    //   554	210	27	l4	long
    //   604	158	29	l5	long
    // Exception table:
    //   from	to	target	type
    //   64	74	1217	java/lang/Throwable
    //   99	104	1217	java/lang/Throwable
    //   126	131	1217	java/lang/Throwable
    //   158	169	1217	java/lang/Throwable
    //   200	209	1217	java/lang/Throwable
    //   235	245	1217	java/lang/Throwable
    //   274	283	1217	java/lang/Throwable
    //   303	308	1217	java/lang/Throwable
    //   328	333	1217	java/lang/Throwable
    //   353	360	1217	java/lang/Throwable
    //   380	387	1217	java/lang/Throwable
    //   407	412	1217	java/lang/Throwable
    //   432	436	1217	java/lang/Throwable
    //   456	461	1217	java/lang/Throwable
    //   481	486	1217	java/lang/Throwable
    //   504	509	1217	java/lang/Throwable
    //   527	533	1217	java/lang/Throwable
    //   551	556	1217	java/lang/Throwable
    //   574	583	1217	java/lang/Throwable
    //   601	606	1217	java/lang/Throwable
    //   624	632	1217	java/lang/Throwable
    //   650	657	1217	java/lang/Throwable
    //   675	685	1217	java/lang/Throwable
    //   703	713	1217	java/lang/Throwable
    //   731	741	1217	java/lang/Throwable
    //   759	769	1217	java/lang/Throwable
    //   787	815	1217	java/lang/Throwable
    //   833	861	1217	java/lang/Throwable
    //   879	907	1217	java/lang/Throwable
    //   925	953	1217	java/lang/Throwable
    //   971	999	1217	java/lang/Throwable
    //   1050	1059	1217	java/lang/Throwable
    //   1081	1087	1217	java/lang/Throwable
    //   1109	1120	1217	java/lang/Throwable
    //   1142	1152	1217	java/lang/Throwable
    //   1174	1182	1217	java/lang/Throwable
    //   1204	1211	1217	java/lang/Throwable
    //   1306	1317	1217	java/lang/Throwable
    //   1339	1349	1217	java/lang/Throwable
    //   1371	1379	1217	java/lang/Throwable
    //   1401	1408	1217	java/lang/Throwable
    //   1470	1481	1217	java/lang/Throwable
    //   1503	1513	1217	java/lang/Throwable
    //   1535	1543	1217	java/lang/Throwable
    //   1565	1572	1217	java/lang/Throwable
    //   1600	1606	1217	java/lang/Throwable
    //   1628	1634	1217	java/lang/Throwable
    //   1667	1678	1217	java/lang/Throwable
    //   1700	1712	1217	java/lang/Throwable
    //   1734	1785	1217	java/lang/Throwable
    //   1810	1830	1217	java/lang/Throwable
    //   64	74	1414	finally
    //   99	104	1414	finally
    //   126	131	1414	finally
    //   158	169	1414	finally
    //   200	209	1414	finally
    //   235	245	1414	finally
    //   274	283	1414	finally
    //   303	308	1414	finally
    //   328	333	1414	finally
    //   353	360	1414	finally
    //   380	387	1414	finally
    //   407	412	1414	finally
    //   432	436	1414	finally
    //   456	461	1414	finally
    //   481	486	1414	finally
    //   504	509	1414	finally
    //   527	533	1414	finally
    //   551	556	1414	finally
    //   574	583	1414	finally
    //   601	606	1414	finally
    //   624	632	1414	finally
    //   650	657	1414	finally
    //   675	685	1414	finally
    //   703	713	1414	finally
    //   731	741	1414	finally
    //   759	769	1414	finally
    //   787	815	1414	finally
    //   833	861	1414	finally
    //   879	907	1414	finally
    //   925	953	1414	finally
    //   971	999	1414	finally
    //   1050	1059	1414	finally
    //   1081	1087	1414	finally
    //   1109	1120	1414	finally
    //   1142	1152	1414	finally
    //   1174	1182	1414	finally
    //   1204	1211	1414	finally
    //   1228	1232	1414	finally
    //   1242	1253	1414	finally
    //   1306	1317	1414	finally
    //   1339	1349	1414	finally
    //   1371	1379	1414	finally
    //   1401	1408	1414	finally
    //   1470	1481	1414	finally
    //   1503	1513	1414	finally
    //   1535	1543	1414	finally
    //   1565	1572	1414	finally
    //   1600	1606	1414	finally
    //   1628	1634	1414	finally
    //   1667	1678	1414	finally
    //   1700	1712	1414	finally
    //   1734	1785	1414	finally
    //   1810	1830	1414	finally
    //   1003	1007	1833	java/io/IOException
    //   1012	1017	1841	java/io/IOException
    //   1258	1263	1849	java/io/IOException
    //   1268	1273	1857	java/io/IOException
    //   1420	1425	1865	java/io/IOException
    //   1430	1435	1873	java/io/IOException
  }
  
  /* Error */
  public static a.b a(String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aload_0
    //   4: ifnull +38 -> 42
    //   7: aload_0
    //   8: ldc 35
    //   10: invokevirtual 97	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   13: ifne +29 -> 42
    //   16: aload_1
    //   17: ifnull +25 -> 42
    //   20: aload_1
    //   21: ldc 35
    //   23: invokevirtual 97	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   26: ifne +16 -> 42
    //   29: aload_2
    //   30: ifnull +12 -> 42
    //   33: aload_2
    //   34: ldc 35
    //   36: invokevirtual 97	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   39: ifeq +7 -> 46
    //   42: aconst_null
    //   43: astore_0
    //   44: aload_0
    //   45: areturn
    //   46: new 233	com/tencent/beacon/b/a$b
    //   49: dup
    //   50: invokespecial 234	com/tencent/beacon/b/a$b:<init>	()V
    //   53: astore 7
    //   55: new 145	java/lang/StringBuilder
    //   58: dup
    //   59: ldc_w 362
    //   62: invokespecial 201	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   65: aload_1
    //   66: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: aload_2
    //   70: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   76: astore_2
    //   77: new 236	java/net/URL
    //   80: dup
    //   81: aload_2
    //   82: invokespecial 237	java/net/URL:<init>	(Ljava/lang/String;)V
    //   85: astore 5
    //   87: invokestatic 184	java/lang/System:currentTimeMillis	()J
    //   90: lstore 10
    //   92: aload_1
    //   93: invokestatic 368	java/net/InetAddress:getByName	(Ljava/lang/String;)Ljava/net/InetAddress;
    //   96: astore_2
    //   97: aload 7
    //   99: invokestatic 184	java/lang/System:currentTimeMillis	()J
    //   102: lload 10
    //   104: lsub
    //   105: putfield 285	com/tencent/beacon/b/a$b:a	J
    //   108: new 145	java/lang/StringBuilder
    //   111: dup
    //   112: ldc_w 370
    //   115: invokespecial 201	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   118: aload 7
    //   120: getfield 285	com/tencent/beacon/b/a$b:a	J
    //   123: invokevirtual 204	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   126: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   129: iconst_0
    //   130: anewarray 4	java/lang/Object
    //   133: invokestatic 209	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   136: new 372	java/lang/StringBuffer
    //   139: dup
    //   140: invokespecial 373	java/lang/StringBuffer:<init>	()V
    //   143: astore_3
    //   144: aload_2
    //   145: invokevirtual 377	java/net/InetAddress:getAddress	()[B
    //   148: astore_2
    //   149: iconst_0
    //   150: istore 8
    //   152: iload 8
    //   154: aload_2
    //   155: arraylength
    //   156: if_icmpge +165 -> 321
    //   159: new 145	java/lang/StringBuilder
    //   162: dup
    //   163: ldc_w 379
    //   166: invokespecial 201	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   169: astore 6
    //   171: aload_2
    //   172: iload 8
    //   174: baload
    //   175: ifge +137 -> 312
    //   178: aload_2
    //   179: iload 8
    //   181: baload
    //   182: sipush 256
    //   185: iadd
    //   186: istore 9
    //   188: aload_3
    //   189: aload 6
    //   191: iload 9
    //   193: invokevirtual 228	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   196: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   199: invokevirtual 382	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   202: pop
    //   203: iload 8
    //   205: iconst_1
    //   206: iadd
    //   207: istore 8
    //   209: goto -57 -> 152
    //   212: aload 7
    //   214: ldc2_w 177
    //   217: putfield 285	com/tencent/beacon/b/a$b:a	J
    //   220: goto -112 -> 108
    //   223: astore_2
    //   224: aconst_null
    //   225: astore_1
    //   226: aconst_null
    //   227: astore_3
    //   228: aconst_null
    //   229: astore_0
    //   230: aload_0
    //   231: astore 6
    //   233: aload_1
    //   234: astore 5
    //   236: aload_3
    //   237: astore 4
    //   239: aload_2
    //   240: invokevirtual 329	java/lang/Throwable:printStackTrace	()V
    //   243: aload_0
    //   244: astore 6
    //   246: aload_1
    //   247: astore 5
    //   249: aload_3
    //   250: astore 4
    //   252: aload_2
    //   253: invokevirtual 221	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   256: iconst_0
    //   257: anewarray 4	java/lang/Object
    //   260: invokestatic 220	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   263: aload_1
    //   264: ifnull +7 -> 271
    //   267: aload_1
    //   268: invokevirtual 307	java/io/OutputStream:close	()V
    //   271: aload_0
    //   272: ifnull +7 -> 279
    //   275: aload_0
    //   276: invokevirtual 308	java/io/InputStream:close	()V
    //   279: aload 7
    //   281: astore_0
    //   282: aload_3
    //   283: ifnull -239 -> 44
    //   286: aload_3
    //   287: invokevirtual 212	java/net/Socket:close	()V
    //   290: aload 7
    //   292: areturn
    //   293: astore_0
    //   294: aload_0
    //   295: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   298: aload_0
    //   299: invokevirtual 218	java/io/IOException:getMessage	()Ljava/lang/String;
    //   302: iconst_0
    //   303: anewarray 4	java/lang/Object
    //   306: invokestatic 220	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   309: aload 7
    //   311: areturn
    //   312: aload_2
    //   313: iload 8
    //   315: baload
    //   316: istore 9
    //   318: goto -130 -> 188
    //   321: aload 7
    //   323: aload_3
    //   324: iconst_1
    //   325: invokevirtual 385	java/lang/StringBuffer:substring	(I)Ljava/lang/String;
    //   328: putfield 286	com/tencent/beacon/b/a$b:f	Ljava/lang/String;
    //   331: aload_3
    //   332: iconst_0
    //   333: invokevirtual 388	java/lang/StringBuffer:setLength	(I)V
    //   336: aload_0
    //   337: ldc -31
    //   339: invokevirtual 143	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   342: astore_0
    //   343: new 186	java/net/InetSocketAddress
    //   346: dup
    //   347: aload_0
    //   348: iconst_0
    //   349: aaload
    //   350: aload_0
    //   351: iconst_1
    //   352: aaload
    //   353: invokestatic 394	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   356: invokespecial 189	java/net/InetSocketAddress:<init>	(Ljava/lang/String;I)V
    //   359: astore_0
    //   360: invokestatic 184	java/lang/System:currentTimeMillis	()J
    //   363: lstore 10
    //   365: new 191	java/net/Socket
    //   368: dup
    //   369: invokespecial 192	java/net/Socket:<init>	()V
    //   372: astore_3
    //   373: aload_3
    //   374: aload_0
    //   375: sipush 30000
    //   378: invokevirtual 196	java/net/Socket:connect	(Ljava/net/SocketAddress;I)V
    //   381: aload 7
    //   383: invokestatic 184	java/lang/System:currentTimeMillis	()J
    //   386: lload 10
    //   388: lsub
    //   389: putfield 288	com/tencent/beacon/b/a$b:b	J
    //   392: new 145	java/lang/StringBuilder
    //   395: dup
    //   396: ldc_w 396
    //   399: invokespecial 201	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   402: aload 7
    //   404: getfield 288	com/tencent/beacon/b/a$b:b	J
    //   407: invokevirtual 204	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   410: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   413: iconst_0
    //   414: anewarray 4	java/lang/Object
    //   417: invokestatic 209	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   420: new 145	java/lang/StringBuilder
    //   423: dup
    //   424: invokespecial 146	java/lang/StringBuilder:<init>	()V
    //   427: aload 5
    //   429: invokevirtual 399	java/net/URL:getPath	()Ljava/lang/String;
    //   432: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   435: astore_2
    //   436: aload 5
    //   438: invokevirtual 402	java/net/URL:getQuery	()Ljava/lang/String;
    //   441: ifnull +434 -> 875
    //   444: new 145	java/lang/StringBuilder
    //   447: dup
    //   448: ldc_w 404
    //   451: invokespecial 201	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   454: aload 5
    //   456: invokevirtual 402	java/net/URL:getQuery	()Ljava/lang/String;
    //   459: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   462: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   465: astore_0
    //   466: aload_2
    //   467: aload_0
    //   468: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   471: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   474: astore_0
    //   475: new 145	java/lang/StringBuilder
    //   478: dup
    //   479: ldc_w 406
    //   482: invokespecial 201	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   485: aload_0
    //   486: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   489: ldc_w 408
    //   492: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   495: aload_1
    //   496: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   499: ldc_w 410
    //   502: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   505: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   508: astore_2
    //   509: ldc_w 412
    //   512: new 145	java/lang/StringBuilder
    //   515: dup
    //   516: ldc_w 414
    //   519: invokespecial 201	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   522: aload_2
    //   523: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   526: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   529: invokestatic 419	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   532: pop
    //   533: aload_3
    //   534: invokevirtual 420	java/net/Socket:getOutputStream	()Ljava/io/OutputStream;
    //   537: astore_1
    //   538: aload_3
    //   539: invokevirtual 421	java/net/Socket:getInputStream	()Ljava/io/InputStream;
    //   542: astore_0
    //   543: aload_0
    //   544: astore 6
    //   546: aload_1
    //   547: astore 5
    //   549: aload_3
    //   550: astore 4
    //   552: invokestatic 184	java/lang/System:currentTimeMillis	()J
    //   555: lstore 10
    //   557: aload_0
    //   558: astore 6
    //   560: aload_1
    //   561: astore 5
    //   563: aload_3
    //   564: astore 4
    //   566: aload_1
    //   567: aload_2
    //   568: ldc_w 423
    //   571: invokevirtual 427	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   574: invokevirtual 431	java/io/OutputStream:write	([B)V
    //   577: aload_0
    //   578: astore 6
    //   580: aload_1
    //   581: astore 5
    //   583: aload_3
    //   584: astore 4
    //   586: aload_1
    //   587: invokevirtual 434	java/io/OutputStream:flush	()V
    //   590: aload_0
    //   591: astore 6
    //   593: aload_1
    //   594: astore 5
    //   596: aload_3
    //   597: astore 4
    //   599: aload 7
    //   601: invokestatic 184	java/lang/System:currentTimeMillis	()J
    //   604: lload 10
    //   606: lsub
    //   607: putfield 290	com/tencent/beacon/b/a$b:c	J
    //   610: aload_0
    //   611: astore 6
    //   613: aload_1
    //   614: astore 5
    //   616: aload_3
    //   617: astore 4
    //   619: new 145	java/lang/StringBuilder
    //   622: dup
    //   623: ldc_w 436
    //   626: invokespecial 201	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   629: aload 7
    //   631: getfield 290	com/tencent/beacon/b/a$b:c	J
    //   634: invokevirtual 204	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   637: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   640: iconst_0
    //   641: anewarray 4	java/lang/Object
    //   644: invokestatic 209	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   647: aload_0
    //   648: astore 6
    //   650: aload_1
    //   651: astore 5
    //   653: aload_3
    //   654: astore 4
    //   656: invokestatic 184	java/lang/System:currentTimeMillis	()J
    //   659: lstore 10
    //   661: aload_0
    //   662: astore 6
    //   664: aload_1
    //   665: astore 5
    //   667: aload_3
    //   668: astore 4
    //   670: aload_0
    //   671: invokevirtual 282	java/io/InputStream:read	()I
    //   674: pop
    //   675: aload_0
    //   676: astore 6
    //   678: aload_1
    //   679: astore 5
    //   681: aload_3
    //   682: astore 4
    //   684: aload 7
    //   686: invokestatic 184	java/lang/System:currentTimeMillis	()J
    //   689: lload 10
    //   691: lsub
    //   692: putfield 292	com/tencent/beacon/b/a$b:d	J
    //   695: aload_0
    //   696: astore 6
    //   698: aload_1
    //   699: astore 5
    //   701: aload_3
    //   702: astore 4
    //   704: new 145	java/lang/StringBuilder
    //   707: dup
    //   708: ldc_w 438
    //   711: invokespecial 201	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   714: aload 7
    //   716: getfield 292	com/tencent/beacon/b/a$b:d	J
    //   719: invokevirtual 204	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   722: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   725: iconst_0
    //   726: anewarray 4	java/lang/Object
    //   729: invokestatic 209	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   732: aload_0
    //   733: astore 6
    //   735: aload_1
    //   736: astore 5
    //   738: aload_3
    //   739: astore 4
    //   741: sipush 500
    //   744: newarray <illegal type>
    //   746: astore_2
    //   747: aload_0
    //   748: astore 6
    //   750: aload_1
    //   751: astore 5
    //   753: aload_3
    //   754: astore 4
    //   756: invokestatic 184	java/lang/System:currentTimeMillis	()J
    //   759: lstore 10
    //   761: aload_0
    //   762: astore 6
    //   764: aload_1
    //   765: astore 5
    //   767: aload_3
    //   768: astore 4
    //   770: aload_0
    //   771: aload_2
    //   772: invokevirtual 441	java/io/InputStream:read	([B)I
    //   775: pop
    //   776: aload_0
    //   777: astore 6
    //   779: aload_1
    //   780: astore 5
    //   782: aload_3
    //   783: astore 4
    //   785: aload 7
    //   787: invokestatic 184	java/lang/System:currentTimeMillis	()J
    //   790: lload 10
    //   792: lsub
    //   793: putfield 294	com/tencent/beacon/b/a$b:e	J
    //   796: aload_0
    //   797: astore 6
    //   799: aload_1
    //   800: astore 5
    //   802: aload_3
    //   803: astore 4
    //   805: new 145	java/lang/StringBuilder
    //   808: dup
    //   809: ldc_w 443
    //   812: invokespecial 201	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   815: aload 7
    //   817: getfield 294	com/tencent/beacon/b/a$b:e	J
    //   820: invokevirtual 204	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   823: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   826: iconst_0
    //   827: anewarray 4	java/lang/Object
    //   830: invokestatic 209	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   833: aload_1
    //   834: ifnull +7 -> 841
    //   837: aload_1
    //   838: invokevirtual 307	java/io/OutputStream:close	()V
    //   841: aload_0
    //   842: ifnull +7 -> 849
    //   845: aload_0
    //   846: invokevirtual 308	java/io/InputStream:close	()V
    //   849: aload_3
    //   850: invokevirtual 212	java/net/Socket:close	()V
    //   853: aload 7
    //   855: areturn
    //   856: astore_0
    //   857: aload_0
    //   858: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   861: aload_0
    //   862: invokevirtual 218	java/io/IOException:getMessage	()Ljava/lang/String;
    //   865: iconst_0
    //   866: anewarray 4	java/lang/Object
    //   869: invokestatic 220	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   872: aload 7
    //   874: areturn
    //   875: ldc 35
    //   877: astore_0
    //   878: goto -412 -> 466
    //   881: astore_1
    //   882: aload_1
    //   883: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   886: goto -45 -> 841
    //   889: astore_0
    //   890: aload_0
    //   891: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   894: goto -45 -> 849
    //   897: astore_1
    //   898: aload_1
    //   899: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   902: goto -631 -> 271
    //   905: astore_0
    //   906: aload_0
    //   907: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   910: goto -631 -> 279
    //   913: astore_0
    //   914: aconst_null
    //   915: astore_1
    //   916: aconst_null
    //   917: astore_3
    //   918: aload 4
    //   920: astore_2
    //   921: aload_1
    //   922: ifnull +7 -> 929
    //   925: aload_1
    //   926: invokevirtual 307	java/io/OutputStream:close	()V
    //   929: aload_2
    //   930: ifnull +7 -> 937
    //   933: aload_2
    //   934: invokevirtual 308	java/io/InputStream:close	()V
    //   937: aload_3
    //   938: ifnull +7 -> 945
    //   941: aload_3
    //   942: invokevirtual 212	java/net/Socket:close	()V
    //   945: aload_0
    //   946: athrow
    //   947: astore_1
    //   948: aload_1
    //   949: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   952: goto -23 -> 929
    //   955: astore_1
    //   956: aload_1
    //   957: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   960: goto -23 -> 937
    //   963: astore_1
    //   964: aload_1
    //   965: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   968: aload_1
    //   969: invokevirtual 218	java/io/IOException:getMessage	()Ljava/lang/String;
    //   972: iconst_0
    //   973: anewarray 4	java/lang/Object
    //   976: invokestatic 220	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   979: goto -34 -> 945
    //   982: astore_0
    //   983: aconst_null
    //   984: astore_1
    //   985: aload 4
    //   987: astore_2
    //   988: goto -67 -> 921
    //   991: astore_0
    //   992: aload 4
    //   994: astore_2
    //   995: goto -74 -> 921
    //   998: astore_0
    //   999: aload 6
    //   1001: astore_2
    //   1002: aload 5
    //   1004: astore_1
    //   1005: aload 4
    //   1007: astore_3
    //   1008: goto -87 -> 921
    //   1011: astore_2
    //   1012: aconst_null
    //   1013: astore_1
    //   1014: aconst_null
    //   1015: astore_0
    //   1016: goto -786 -> 230
    //   1019: astore_2
    //   1020: aconst_null
    //   1021: astore_0
    //   1022: goto -792 -> 230
    //   1025: astore_2
    //   1026: goto -796 -> 230
    //   1029: astore_3
    //   1030: goto -818 -> 212
    //   1033: astore_2
    //   1034: aconst_null
    //   1035: astore_2
    //   1036: goto -824 -> 212
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1039	0	paramString1	String
    //   0	1039	1	paramString2	String
    //   0	1039	2	paramString3	String
    //   143	865	3	localObject1	Object
    //   1029	1	3	localException	Exception
    //   1	1005	4	localObject2	Object
    //   85	918	5	localObject3	Object
    //   169	831	6	localObject4	Object
    //   53	820	7	localb	a.b
    //   150	164	8	i1	int
    //   186	131	9	i2	int
    //   90	701	10	l1	long
    // Exception table:
    //   from	to	target	type
    //   77	92	223	java/lang/Throwable
    //   92	97	223	java/lang/Throwable
    //   97	108	223	java/lang/Throwable
    //   108	149	223	java/lang/Throwable
    //   152	171	223	java/lang/Throwable
    //   188	203	223	java/lang/Throwable
    //   212	220	223	java/lang/Throwable
    //   321	373	223	java/lang/Throwable
    //   286	290	293	java/io/IOException
    //   849	853	856	java/io/IOException
    //   837	841	881	java/io/IOException
    //   845	849	889	java/io/IOException
    //   267	271	897	java/io/IOException
    //   275	279	905	java/io/IOException
    //   77	92	913	finally
    //   92	97	913	finally
    //   97	108	913	finally
    //   108	149	913	finally
    //   152	171	913	finally
    //   188	203	913	finally
    //   212	220	913	finally
    //   321	373	913	finally
    //   925	929	947	java/io/IOException
    //   933	937	955	java/io/IOException
    //   941	945	963	java/io/IOException
    //   373	466	982	finally
    //   466	538	982	finally
    //   538	543	991	finally
    //   239	243	998	finally
    //   252	263	998	finally
    //   552	557	998	finally
    //   566	577	998	finally
    //   586	590	998	finally
    //   599	610	998	finally
    //   619	647	998	finally
    //   656	661	998	finally
    //   670	675	998	finally
    //   684	695	998	finally
    //   704	732	998	finally
    //   741	747	998	finally
    //   756	761	998	finally
    //   770	776	998	finally
    //   785	796	998	finally
    //   805	833	998	finally
    //   373	466	1011	java/lang/Throwable
    //   466	538	1011	java/lang/Throwable
    //   538	543	1019	java/lang/Throwable
    //   552	557	1025	java/lang/Throwable
    //   566	577	1025	java/lang/Throwable
    //   586	590	1025	java/lang/Throwable
    //   599	610	1025	java/lang/Throwable
    //   619	647	1025	java/lang/Throwable
    //   656	661	1025	java/lang/Throwable
    //   670	675	1025	java/lang/Throwable
    //   684	695	1025	java/lang/Throwable
    //   704	732	1025	java/lang/Throwable
    //   741	747	1025	java/lang/Throwable
    //   756	761	1025	java/lang/Throwable
    //   770	776	1025	java/lang/Throwable
    //   785	796	1025	java/lang/Throwable
    //   805	833	1025	java/lang/Throwable
    //   97	108	1029	java/lang/Exception
    //   92	97	1033	java/lang/Exception
  }
  
  /* Error */
  public static a.b a(String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_0
    //   3: ifnull +12 -> 15
    //   6: aload_0
    //   7: ldc 35
    //   9: invokevirtual 97	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   12: ifeq +7 -> 19
    //   15: aconst_null
    //   16: astore_0
    //   17: aload_0
    //   18: areturn
    //   19: new 233	com/tencent/beacon/b/a$b
    //   22: dup
    //   23: invokespecial 234	com/tencent/beacon/b/a$b:<init>	()V
    //   26: astore 8
    //   28: new 236	java/net/URL
    //   31: dup
    //   32: aload_0
    //   33: invokespecial 237	java/net/URL:<init>	(Ljava/lang/String;)V
    //   36: astore 5
    //   38: aload 5
    //   40: invokevirtual 447	java/net/URL:getHost	()Ljava/lang/String;
    //   43: astore_2
    //   44: invokestatic 184	java/lang/System:currentTimeMillis	()J
    //   47: lstore 12
    //   49: aload_2
    //   50: invokestatic 368	java/net/InetAddress:getByName	(Ljava/lang/String;)Ljava/net/InetAddress;
    //   53: astore 4
    //   55: aload 8
    //   57: invokestatic 184	java/lang/System:currentTimeMillis	()J
    //   60: lload 12
    //   62: lsub
    //   63: putfield 285	com/tencent/beacon/b/a$b:a	J
    //   66: new 145	java/lang/StringBuilder
    //   69: dup
    //   70: ldc_w 449
    //   73: invokespecial 201	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   76: aload 8
    //   78: getfield 285	com/tencent/beacon/b/a$b:a	J
    //   81: invokevirtual 204	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   84: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   87: iconst_0
    //   88: anewarray 4	java/lang/Object
    //   91: invokestatic 209	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   94: new 372	java/lang/StringBuffer
    //   97: dup
    //   98: invokespecial 373	java/lang/StringBuffer:<init>	()V
    //   101: astore_0
    //   102: aload 4
    //   104: invokevirtual 377	java/net/InetAddress:getAddress	()[B
    //   107: astore 6
    //   109: iconst_0
    //   110: istore 10
    //   112: iload 10
    //   114: aload 6
    //   116: arraylength
    //   117: if_icmpge +58 -> 175
    //   120: new 145	java/lang/StringBuilder
    //   123: dup
    //   124: ldc_w 379
    //   127: invokespecial 201	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   130: astore 7
    //   132: aload 6
    //   134: iload 10
    //   136: baload
    //   137: ifge +884 -> 1021
    //   140: aload 6
    //   142: iload 10
    //   144: baload
    //   145: sipush 256
    //   148: iadd
    //   149: istore 11
    //   151: aload_0
    //   152: aload 7
    //   154: iload 11
    //   156: invokevirtual 228	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   159: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   162: invokevirtual 382	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   165: pop
    //   166: iload 10
    //   168: iconst_1
    //   169: iadd
    //   170: istore 10
    //   172: goto -60 -> 112
    //   175: aload 8
    //   177: aload_0
    //   178: iconst_1
    //   179: invokevirtual 385	java/lang/StringBuffer:substring	(I)Ljava/lang/String;
    //   182: putfield 286	com/tencent/beacon/b/a$b:f	Ljava/lang/String;
    //   185: aload_0
    //   186: iconst_0
    //   187: invokevirtual 388	java/lang/StringBuffer:setLength	(I)V
    //   190: aload 8
    //   192: astore_0
    //   193: iload_1
    //   194: ifne -177 -> 17
    //   197: aload 5
    //   199: invokevirtual 452	java/net/URL:getPort	()I
    //   202: istore 10
    //   204: iload 10
    //   206: iflt +565 -> 771
    //   209: new 186	java/net/InetSocketAddress
    //   212: dup
    //   213: aload 4
    //   215: iload 10
    //   217: invokespecial 455	java/net/InetSocketAddress:<init>	(Ljava/net/InetAddress;I)V
    //   220: astore_0
    //   221: invokestatic 184	java/lang/System:currentTimeMillis	()J
    //   224: lstore 12
    //   226: new 191	java/net/Socket
    //   229: dup
    //   230: invokespecial 192	java/net/Socket:<init>	()V
    //   233: astore 4
    //   235: aload 4
    //   237: aload_0
    //   238: sipush 30000
    //   241: invokevirtual 196	java/net/Socket:connect	(Ljava/net/SocketAddress;I)V
    //   244: aload 8
    //   246: invokestatic 184	java/lang/System:currentTimeMillis	()J
    //   249: lload 12
    //   251: lsub
    //   252: putfield 288	com/tencent/beacon/b/a$b:b	J
    //   255: new 145	java/lang/StringBuilder
    //   258: dup
    //   259: ldc_w 396
    //   262: invokespecial 201	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   265: aload 8
    //   267: getfield 288	com/tencent/beacon/b/a$b:b	J
    //   270: invokevirtual 204	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   273: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   276: iconst_0
    //   277: anewarray 4	java/lang/Object
    //   280: invokestatic 209	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   283: new 145	java/lang/StringBuilder
    //   286: dup
    //   287: invokespecial 146	java/lang/StringBuilder:<init>	()V
    //   290: aload 5
    //   292: invokevirtual 399	java/net/URL:getPath	()Ljava/lang/String;
    //   295: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   298: astore 6
    //   300: aload 5
    //   302: invokevirtual 402	java/net/URL:getQuery	()Ljava/lang/String;
    //   305: ifnull +473 -> 778
    //   308: new 145	java/lang/StringBuilder
    //   311: dup
    //   312: ldc_w 404
    //   315: invokespecial 201	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   318: aload 5
    //   320: invokevirtual 402	java/net/URL:getQuery	()Ljava/lang/String;
    //   323: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   326: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   329: astore_0
    //   330: aload 6
    //   332: aload_0
    //   333: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   336: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   339: astore_0
    //   340: new 145	java/lang/StringBuilder
    //   343: dup
    //   344: ldc_w 406
    //   347: invokespecial 201	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   350: aload_0
    //   351: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   354: ldc_w 408
    //   357: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   360: aload_2
    //   361: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   364: ldc_w 410
    //   367: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   370: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   373: astore 9
    //   375: aload 4
    //   377: invokevirtual 420	java/net/Socket:getOutputStream	()Ljava/io/OutputStream;
    //   380: astore_2
    //   381: aload 4
    //   383: invokevirtual 421	java/net/Socket:getInputStream	()Ljava/io/InputStream;
    //   386: astore_0
    //   387: aload_0
    //   388: astore 7
    //   390: aload_2
    //   391: astore 6
    //   393: aload 4
    //   395: astore 5
    //   397: invokestatic 184	java/lang/System:currentTimeMillis	()J
    //   400: lstore 12
    //   402: aload_0
    //   403: astore 7
    //   405: aload_2
    //   406: astore 6
    //   408: aload 4
    //   410: astore 5
    //   412: aload_2
    //   413: aload 9
    //   415: ldc_w 423
    //   418: invokevirtual 427	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   421: invokevirtual 431	java/io/OutputStream:write	([B)V
    //   424: aload_0
    //   425: astore 7
    //   427: aload_2
    //   428: astore 6
    //   430: aload 4
    //   432: astore 5
    //   434: aload_2
    //   435: invokevirtual 434	java/io/OutputStream:flush	()V
    //   438: aload_0
    //   439: astore 7
    //   441: aload_2
    //   442: astore 6
    //   444: aload 4
    //   446: astore 5
    //   448: aload 8
    //   450: invokestatic 184	java/lang/System:currentTimeMillis	()J
    //   453: lload 12
    //   455: lsub
    //   456: putfield 290	com/tencent/beacon/b/a$b:c	J
    //   459: aload_0
    //   460: astore 7
    //   462: aload_2
    //   463: astore 6
    //   465: aload 4
    //   467: astore 5
    //   469: new 145	java/lang/StringBuilder
    //   472: dup
    //   473: ldc_w 436
    //   476: invokespecial 201	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   479: aload 8
    //   481: getfield 290	com/tencent/beacon/b/a$b:c	J
    //   484: invokevirtual 204	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   487: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   490: iconst_0
    //   491: anewarray 4	java/lang/Object
    //   494: invokestatic 209	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   497: aload_0
    //   498: astore 7
    //   500: aload_2
    //   501: astore 6
    //   503: aload 4
    //   505: astore 5
    //   507: invokestatic 184	java/lang/System:currentTimeMillis	()J
    //   510: lstore 12
    //   512: aload_0
    //   513: astore 7
    //   515: aload_2
    //   516: astore 6
    //   518: aload 4
    //   520: astore 5
    //   522: aload_0
    //   523: invokevirtual 282	java/io/InputStream:read	()I
    //   526: pop
    //   527: aload_0
    //   528: astore 7
    //   530: aload_2
    //   531: astore 6
    //   533: aload 4
    //   535: astore 5
    //   537: aload 8
    //   539: invokestatic 184	java/lang/System:currentTimeMillis	()J
    //   542: lload 12
    //   544: lsub
    //   545: putfield 292	com/tencent/beacon/b/a$b:d	J
    //   548: aload_0
    //   549: astore 7
    //   551: aload_2
    //   552: astore 6
    //   554: aload 4
    //   556: astore 5
    //   558: new 145	java/lang/StringBuilder
    //   561: dup
    //   562: ldc_w 438
    //   565: invokespecial 201	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   568: aload 8
    //   570: getfield 292	com/tencent/beacon/b/a$b:d	J
    //   573: invokevirtual 204	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   576: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   579: iconst_0
    //   580: anewarray 4	java/lang/Object
    //   583: invokestatic 209	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   586: aload_0
    //   587: astore 7
    //   589: aload_2
    //   590: astore 6
    //   592: aload 4
    //   594: astore 5
    //   596: sipush 500
    //   599: newarray <illegal type>
    //   601: astore_3
    //   602: aload_0
    //   603: astore 7
    //   605: aload_2
    //   606: astore 6
    //   608: aload 4
    //   610: astore 5
    //   612: invokestatic 184	java/lang/System:currentTimeMillis	()J
    //   615: lstore 12
    //   617: aload_0
    //   618: astore 7
    //   620: aload_2
    //   621: astore 6
    //   623: aload 4
    //   625: astore 5
    //   627: aload_0
    //   628: aload_3
    //   629: invokevirtual 441	java/io/InputStream:read	([B)I
    //   632: istore 10
    //   634: aload_0
    //   635: astore 7
    //   637: aload_2
    //   638: astore 6
    //   640: aload 4
    //   642: astore 5
    //   644: aload 8
    //   646: invokestatic 184	java/lang/System:currentTimeMillis	()J
    //   649: lload 12
    //   651: lsub
    //   652: putfield 294	com/tencent/beacon/b/a$b:e	J
    //   655: aload_0
    //   656: astore 7
    //   658: aload_2
    //   659: astore 6
    //   661: aload 4
    //   663: astore 5
    //   665: new 145	java/lang/StringBuilder
    //   668: dup
    //   669: ldc_w 443
    //   672: invokespecial 201	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   675: aload 8
    //   677: getfield 294	com/tencent/beacon/b/a$b:e	J
    //   680: invokevirtual 204	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   683: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   686: iconst_0
    //   687: anewarray 4	java/lang/Object
    //   690: invokestatic 209	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   693: aload_0
    //   694: astore 7
    //   696: aload_2
    //   697: astore 6
    //   699: aload 4
    //   701: astore 5
    //   703: new 145	java/lang/StringBuilder
    //   706: dup
    //   707: ldc_w 457
    //   710: invokespecial 201	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   713: iload 10
    //   715: invokevirtual 228	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   718: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   721: iconst_0
    //   722: anewarray 4	java/lang/Object
    //   725: invokestatic 209	com/tencent/beacon/e/b:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   728: aload_2
    //   729: ifnull +7 -> 736
    //   732: aload_2
    //   733: invokevirtual 307	java/io/OutputStream:close	()V
    //   736: aload_0
    //   737: ifnull +7 -> 744
    //   740: aload_0
    //   741: invokevirtual 308	java/io/InputStream:close	()V
    //   744: aload 4
    //   746: invokevirtual 212	java/net/Socket:close	()V
    //   749: aload 8
    //   751: areturn
    //   752: astore_0
    //   753: aload_0
    //   754: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   757: aload_0
    //   758: invokevirtual 218	java/io/IOException:getMessage	()Ljava/lang/String;
    //   761: iconst_0
    //   762: anewarray 4	java/lang/Object
    //   765: invokestatic 220	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   768: aload 8
    //   770: areturn
    //   771: bipush 80
    //   773: istore 10
    //   775: goto -566 -> 209
    //   778: ldc 35
    //   780: astore_0
    //   781: goto -451 -> 330
    //   784: astore_2
    //   785: aload_2
    //   786: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   789: goto -53 -> 736
    //   792: astore_0
    //   793: aload_0
    //   794: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   797: goto -53 -> 744
    //   800: astore_3
    //   801: aconst_null
    //   802: astore_2
    //   803: aconst_null
    //   804: astore 4
    //   806: aconst_null
    //   807: astore_0
    //   808: aload_0
    //   809: astore 7
    //   811: aload_2
    //   812: astore 6
    //   814: aload 4
    //   816: astore 5
    //   818: aload_3
    //   819: invokevirtual 329	java/lang/Throwable:printStackTrace	()V
    //   822: aload_0
    //   823: astore 7
    //   825: aload_2
    //   826: astore 6
    //   828: aload 4
    //   830: astore 5
    //   832: aload_3
    //   833: invokevirtual 221	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   836: iconst_0
    //   837: anewarray 4	java/lang/Object
    //   840: invokestatic 220	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   843: aload_2
    //   844: ifnull +7 -> 851
    //   847: aload_2
    //   848: invokevirtual 307	java/io/OutputStream:close	()V
    //   851: aload_0
    //   852: ifnull +7 -> 859
    //   855: aload_0
    //   856: invokevirtual 308	java/io/InputStream:close	()V
    //   859: aload 8
    //   861: astore_0
    //   862: aload 4
    //   864: ifnull -847 -> 17
    //   867: aload 4
    //   869: invokevirtual 212	java/net/Socket:close	()V
    //   872: aload 8
    //   874: areturn
    //   875: astore_0
    //   876: aload_0
    //   877: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   880: aload_0
    //   881: invokevirtual 218	java/io/IOException:getMessage	()Ljava/lang/String;
    //   884: iconst_0
    //   885: anewarray 4	java/lang/Object
    //   888: invokestatic 220	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   891: aload 8
    //   893: areturn
    //   894: astore_2
    //   895: aload_2
    //   896: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   899: goto -48 -> 851
    //   902: astore_0
    //   903: aload_0
    //   904: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   907: goto -48 -> 859
    //   910: astore_0
    //   911: aconst_null
    //   912: astore_2
    //   913: aconst_null
    //   914: astore 4
    //   916: aload_2
    //   917: ifnull +7 -> 924
    //   920: aload_2
    //   921: invokevirtual 307	java/io/OutputStream:close	()V
    //   924: aload_3
    //   925: ifnull +7 -> 932
    //   928: aload_3
    //   929: invokevirtual 308	java/io/InputStream:close	()V
    //   932: aload 4
    //   934: ifnull +8 -> 942
    //   937: aload 4
    //   939: invokevirtual 212	java/net/Socket:close	()V
    //   942: aload_0
    //   943: athrow
    //   944: astore_2
    //   945: aload_2
    //   946: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   949: goto -25 -> 924
    //   952: astore_2
    //   953: aload_2
    //   954: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   957: goto -25 -> 932
    //   960: astore_2
    //   961: aload_2
    //   962: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   965: aload_2
    //   966: invokevirtual 218	java/io/IOException:getMessage	()Ljava/lang/String;
    //   969: iconst_0
    //   970: anewarray 4	java/lang/Object
    //   973: invokestatic 220	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   976: goto -34 -> 942
    //   979: astore_0
    //   980: aconst_null
    //   981: astore_2
    //   982: goto -66 -> 916
    //   985: astore_0
    //   986: goto -70 -> 916
    //   989: astore_0
    //   990: aload 7
    //   992: astore_3
    //   993: aload 6
    //   995: astore_2
    //   996: aload 5
    //   998: astore 4
    //   1000: goto -84 -> 916
    //   1003: astore_3
    //   1004: aconst_null
    //   1005: astore_2
    //   1006: aconst_null
    //   1007: astore_0
    //   1008: goto -200 -> 808
    //   1011: astore_3
    //   1012: aconst_null
    //   1013: astore_0
    //   1014: goto -206 -> 808
    //   1017: astore_3
    //   1018: goto -210 -> 808
    //   1021: aload 6
    //   1023: iload 10
    //   1025: baload
    //   1026: istore 11
    //   1028: goto -877 -> 151
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1031	0	paramString	String
    //   0	1031	1	paramBoolean	boolean
    //   43	690	2	localObject1	Object
    //   784	2	2	localIOException1	java.io.IOException
    //   802	46	2	localObject2	Object
    //   894	2	2	localIOException2	java.io.IOException
    //   912	9	2	localObject3	Object
    //   944	2	2	localIOException3	java.io.IOException
    //   952	2	2	localIOException4	java.io.IOException
    //   960	6	2	localIOException5	java.io.IOException
    //   981	25	2	localObject4	Object
    //   1	628	3	arrayOfByte	byte[]
    //   800	129	3	localThrowable1	Throwable
    //   992	1	3	localObject5	Object
    //   1003	1	3	localThrowable2	Throwable
    //   1011	1	3	localThrowable3	Throwable
    //   1017	1	3	localThrowable4	Throwable
    //   53	946	4	localObject6	Object
    //   36	961	5	localObject7	Object
    //   107	915	6	localObject8	Object
    //   130	861	7	localObject9	Object
    //   26	866	8	localb	a.b
    //   373	41	9	str	String
    //   110	914	10	i1	int
    //   149	878	11	i2	int
    //   47	603	12	l1	long
    // Exception table:
    //   from	to	target	type
    //   744	749	752	java/io/IOException
    //   732	736	784	java/io/IOException
    //   740	744	792	java/io/IOException
    //   28	109	800	java/lang/Throwable
    //   112	132	800	java/lang/Throwable
    //   151	166	800	java/lang/Throwable
    //   175	190	800	java/lang/Throwable
    //   197	204	800	java/lang/Throwable
    //   209	235	800	java/lang/Throwable
    //   867	872	875	java/io/IOException
    //   847	851	894	java/io/IOException
    //   855	859	902	java/io/IOException
    //   28	109	910	finally
    //   112	132	910	finally
    //   151	166	910	finally
    //   175	190	910	finally
    //   197	204	910	finally
    //   209	235	910	finally
    //   920	924	944	java/io/IOException
    //   928	932	952	java/io/IOException
    //   937	942	960	java/io/IOException
    //   235	330	979	finally
    //   330	381	979	finally
    //   381	387	985	finally
    //   397	402	989	finally
    //   412	424	989	finally
    //   434	438	989	finally
    //   448	459	989	finally
    //   469	497	989	finally
    //   507	512	989	finally
    //   522	527	989	finally
    //   537	548	989	finally
    //   558	586	989	finally
    //   596	602	989	finally
    //   612	617	989	finally
    //   627	634	989	finally
    //   644	655	989	finally
    //   665	693	989	finally
    //   703	728	989	finally
    //   818	822	989	finally
    //   832	843	989	finally
    //   235	330	1003	java/lang/Throwable
    //   330	381	1003	java/lang/Throwable
    //   381	387	1011	java/lang/Throwable
    //   397	402	1017	java/lang/Throwable
    //   412	424	1017	java/lang/Throwable
    //   434	438	1017	java/lang/Throwable
    //   448	459	1017	java/lang/Throwable
    //   469	497	1017	java/lang/Throwable
    //   507	512	1017	java/lang/Throwable
    //   522	527	1017	java/lang/Throwable
    //   537	548	1017	java/lang/Throwable
    //   558	586	1017	java/lang/Throwable
    //   596	602	1017	java/lang/Throwable
    //   612	617	1017	java/lang/Throwable
    //   627	634	1017	java/lang/Throwable
    //   644	655	1017	java/lang/Throwable
    //   665	693	1017	java/lang/Throwable
    //   703	728	1017	java/lang/Throwable
  }
  
  public static a a(Context paramContext)
  {
    if (s == null) {
      s = new a(paramContext);
    }
    return s;
  }
  
  /* Error */
  public static com.tencent.beacon.c.a.b a(int paramInt1, com.tencent.beacon.a.f paramf, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    // Byte code:
    //   0: ldc_w 464
    //   3: iconst_0
    //   4: anewarray 4	java/lang/Object
    //   7: invokestatic 230	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   10: aload_1
    //   11: ifnonnull +15 -> 26
    //   14: ldc_w 466
    //   17: iconst_0
    //   18: anewarray 4	java/lang/Object
    //   21: invokestatic 220	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   24: aconst_null
    //   25: areturn
    //   26: new 468	com/tencent/beacon/c/a/b
    //   29: dup
    //   30: invokespecial 469	com/tencent/beacon/c/a/b:<init>	()V
    //   33: astore 6
    //   35: aload_1
    //   36: monitorenter
    //   37: aload 6
    //   39: aload_1
    //   40: invokevirtual 470	com/tencent/beacon/a/f:a	()Ljava/lang/String;
    //   43: putfield 471	com/tencent/beacon/c/a/b:j	Ljava/lang/String;
    //   46: aload 6
    //   48: aload_1
    //   49: invokevirtual 472	com/tencent/beacon/a/f:b	()Ljava/lang/String;
    //   52: putfield 474	com/tencent/beacon/c/a/b:k	Ljava/lang/String;
    //   55: aload 6
    //   57: aload_1
    //   58: invokevirtual 477	com/tencent/beacon/a/f:c	()B
    //   61: putfield 480	com/tencent/beacon/c/a/b:a	B
    //   64: aload 6
    //   66: aload_1
    //   67: invokevirtual 482	com/tencent/beacon/a/f:j	()Ljava/lang/String;
    //   70: putfield 483	com/tencent/beacon/c/a/b:b	Ljava/lang/String;
    //   73: aload 6
    //   75: aload_1
    //   76: invokevirtual 485	com/tencent/beacon/a/f:d	()Ljava/lang/String;
    //   79: putfield 486	com/tencent/beacon/c/a/b:c	Ljava/lang/String;
    //   82: aload 6
    //   84: aload_1
    //   85: invokevirtual 488	com/tencent/beacon/a/f:e	()Ljava/lang/String;
    //   88: putfield 489	com/tencent/beacon/c/a/b:d	Ljava/lang/String;
    //   91: aload 6
    //   93: aload_1
    //   94: invokevirtual 491	com/tencent/beacon/a/f:f	()Ljava/lang/String;
    //   97: putfield 492	com/tencent/beacon/c/a/b:e	Ljava/lang/String;
    //   100: aload 6
    //   102: ldc 35
    //   104: putfield 493	com/tencent/beacon/c/a/b:l	Ljava/lang/String;
    //   107: iload_0
    //   108: bipush 100
    //   110: if_icmpne +383 -> 493
    //   113: new 495	java/util/HashMap
    //   116: dup
    //   117: invokespecial 496	java/util/HashMap:<init>	()V
    //   120: astore 7
    //   122: aload 7
    //   124: ldc_w 498
    //   127: new 145	java/lang/StringBuilder
    //   130: dup
    //   131: invokespecial 146	java/lang/StringBuilder:<init>	()V
    //   134: invokestatic 501	com/tencent/beacon/event/UserAction:getUserID	()Ljava/lang/String;
    //   137: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   143: invokeinterface 507 3 0
    //   148: pop
    //   149: aload 7
    //   151: ldc_w 509
    //   154: new 145	java/lang/StringBuilder
    //   157: dup
    //   158: invokespecial 146	java/lang/StringBuilder:<init>	()V
    //   161: aload_1
    //   162: invokevirtual 79	com/tencent/beacon/a/f:i	()Ljava/lang/String;
    //   165: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   168: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   171: invokeinterface 507 3 0
    //   176: pop
    //   177: aload_1
    //   178: invokevirtual 512	com/tencent/beacon/a/f:l	()Landroid/content/Context;
    //   181: invokestatic 517	com/tencent/beacon/event/e:a	(Landroid/content/Context;)Lcom/tencent/beacon/event/e;
    //   184: astore 5
    //   186: aload 7
    //   188: ldc_w 519
    //   191: new 145	java/lang/StringBuilder
    //   194: dup
    //   195: invokespecial 146	java/lang/StringBuilder:<init>	()V
    //   198: aload 5
    //   200: invokevirtual 521	com/tencent/beacon/event/e:c	()Ljava/lang/String;
    //   203: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   209: invokeinterface 507 3 0
    //   214: pop
    //   215: aload 7
    //   217: ldc_w 523
    //   220: new 145	java/lang/StringBuilder
    //   223: dup
    //   224: invokespecial 146	java/lang/StringBuilder:<init>	()V
    //   227: aload 5
    //   229: invokevirtual 524	com/tencent/beacon/event/e:b	()Ljava/lang/String;
    //   232: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   235: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   238: invokeinterface 507 3 0
    //   243: pop
    //   244: aload 7
    //   246: ldc_w 526
    //   249: new 145	java/lang/StringBuilder
    //   252: dup
    //   253: invokespecial 146	java/lang/StringBuilder:<init>	()V
    //   256: aload 5
    //   258: invokevirtual 527	com/tencent/beacon/event/e:d	()Ljava/lang/String;
    //   261: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   264: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   267: invokeinterface 507 3 0
    //   272: pop
    //   273: new 145	java/lang/StringBuilder
    //   276: dup
    //   277: invokespecial 146	java/lang/StringBuilder:<init>	()V
    //   280: astore 8
    //   282: aload_1
    //   283: invokevirtual 512	com/tencent/beacon/a/f:l	()Landroid/content/Context;
    //   286: astore 9
    //   288: getstatic 460	com/tencent/beacon/b/a:s	Lcom/tencent/beacon/b/a;
    //   291: ifnonnull +15 -> 306
    //   294: new 2	com/tencent/beacon/b/a
    //   297: dup
    //   298: aload 9
    //   300: invokespecial 461	com/tencent/beacon/b/a:<init>	(Landroid/content/Context;)V
    //   303: putstatic 460	com/tencent/beacon/b/a:s	Lcom/tencent/beacon/b/a;
    //   306: aload 7
    //   308: ldc_w 529
    //   311: aload 8
    //   313: getstatic 460	com/tencent/beacon/b/a:s	Lcom/tencent/beacon/b/a;
    //   316: invokevirtual 530	com/tencent/beacon/b/a:a	()Ljava/lang/String;
    //   319: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   322: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   325: invokeinterface 507 3 0
    //   330: pop
    //   331: aload 7
    //   333: ldc_w 532
    //   336: new 145	java/lang/StringBuilder
    //   339: dup
    //   340: invokespecial 146	java/lang/StringBuilder:<init>	()V
    //   343: aload 5
    //   345: invokevirtual 533	com/tencent/beacon/event/e:e	()Ljava/lang/String;
    //   348: invokevirtual 150	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   351: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   354: invokeinterface 507 3 0
    //   359: pop
    //   360: aload_1
    //   361: invokevirtual 512	com/tencent/beacon/a/f:l	()Landroid/content/Context;
    //   364: invokestatic 84	com/tencent/beacon/a/h:a	(Landroid/content/Context;)Lcom/tencent/beacon/a/h;
    //   367: pop
    //   368: aload 7
    //   370: ldc_w 535
    //   373: aload_1
    //   374: invokevirtual 512	com/tencent/beacon/a/f:l	()Landroid/content/Context;
    //   377: invokestatic 130	com/tencent/beacon/a/h:l	(Landroid/content/Context;)Ljava/lang/String;
    //   380: invokeinterface 507 3 0
    //   385: pop
    //   386: aload_1
    //   387: invokevirtual 512	com/tencent/beacon/a/f:l	()Landroid/content/Context;
    //   390: invokestatic 538	com/tencent/beacon/a/b:g	(Landroid/content/Context;)Z
    //   393: ifeq +144 -> 537
    //   396: aload 7
    //   398: ldc_w 540
    //   401: ldc_w 542
    //   404: invokeinterface 507 3 0
    //   409: pop
    //   410: aload 7
    //   412: ldc_w 544
    //   415: aload_1
    //   416: invokevirtual 512	com/tencent/beacon/a/f:l	()Landroid/content/Context;
    //   419: invokestatic 546	com/tencent/beacon/a/b:i	(Landroid/content/Context;)Ljava/lang/String;
    //   422: invokeinterface 507 3 0
    //   427: pop
    //   428: aload 7
    //   430: ldc_w 548
    //   433: new 145	java/lang/StringBuilder
    //   436: dup
    //   437: invokespecial 146	java/lang/StringBuilder:<init>	()V
    //   440: aload_1
    //   441: invokevirtual 512	com/tencent/beacon/a/f:l	()Landroid/content/Context;
    //   444: invokestatic 551	com/tencent/beacon/a/b:h	(Landroid/content/Context;)I
    //   447: invokevirtual 228	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   450: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   453: invokeinterface 507 3 0
    //   458: pop
    //   459: getstatic 553	com/tencent/beacon/a/b:b	Z
    //   462: ifeq +104 -> 566
    //   465: ldc_w 555
    //   468: astore 5
    //   470: aload 7
    //   472: ldc_w 557
    //   475: aload 5
    //   477: invokeinterface 507 3 0
    //   482: pop
    //   483: aload 6
    //   485: aload 7
    //   487: invokestatic 560	com/tencent/beacon/a/h:a	(Ljava/util/Map;)Ljava/lang/String;
    //   490: putfield 493	com/tencent/beacon/c/a/b:l	Ljava/lang/String;
    //   493: aload_1
    //   494: monitorexit
    //   495: aload 6
    //   497: iload_0
    //   498: putfield 562	com/tencent/beacon/c/a/b:f	I
    //   501: aload 6
    //   503: iload 4
    //   505: i2b
    //   506: putfield 564	com/tencent/beacon/c/a/b:h	B
    //   509: aload 6
    //   511: iload_3
    //   512: i2b
    //   513: putfield 566	com/tencent/beacon/c/a/b:i	B
    //   516: aload_2
    //   517: astore_1
    //   518: aload_2
    //   519: ifnonnull +9 -> 528
    //   522: ldc 35
    //   524: invokevirtual 568	java/lang/String:getBytes	()[B
    //   527: astore_1
    //   528: aload 6
    //   530: aload_1
    //   531: putfield 571	com/tencent/beacon/c/a/b:g	[B
    //   534: aload 6
    //   536: areturn
    //   537: aload 7
    //   539: ldc_w 540
    //   542: ldc_w 572
    //   545: invokeinterface 507 3 0
    //   550: pop
    //   551: goto -141 -> 410
    //   554: astore_2
    //   555: aload_1
    //   556: monitorexit
    //   557: aload_2
    //   558: athrow
    //   559: astore_1
    //   560: aload_1
    //   561: invokevirtual 329	java/lang/Throwable:printStackTrace	()V
    //   564: aconst_null
    //   565: areturn
    //   566: ldc_w 574
    //   569: astore 5
    //   571: goto -101 -> 470
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	574	0	paramInt1	int
    //   0	574	1	paramf	com.tencent.beacon.a.f
    //   0	574	2	paramArrayOfByte	byte[]
    //   0	574	3	paramInt2	int
    //   0	574	4	paramInt3	int
    //   184	386	5	localObject	Object
    //   33	502	6	localb	com.tencent.beacon.c.a.b
    //   120	418	7	localHashMap	java.util.HashMap
    //   280	32	8	localStringBuilder	StringBuilder
    //   286	13	9	localContext	Context
    // Exception table:
    //   from	to	target	type
    //   37	107	554	finally
    //   113	306	554	finally
    //   306	410	554	finally
    //   410	465	554	finally
    //   470	493	554	finally
    //   493	495	554	finally
    //   537	551	554	finally
    //   26	37	559	java/lang/Throwable
    //   495	516	559	java/lang/Throwable
    //   522	528	559	java/lang/Throwable
    //   528	534	559	java/lang/Throwable
    //   555	559	559	java/lang/Throwable
  }
  
  /* Error */
  public static Object a(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc_w 577
    //   3: iconst_0
    //   4: anewarray 4	java/lang/Object
    //   7: invokestatic 230	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   10: aload_0
    //   11: ifnull +8 -> 19
    //   14: aload_0
    //   15: arraylength
    //   16: ifge +5 -> 21
    //   19: aconst_null
    //   20: areturn
    //   21: new 579	java/io/ByteArrayInputStream
    //   24: dup
    //   25: aload_0
    //   26: invokespecial 581	java/io/ByteArrayInputStream:<init>	([B)V
    //   29: astore_3
    //   30: new 583	java/io/ObjectInputStream
    //   33: dup
    //   34: aload_3
    //   35: invokespecial 586	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   38: astore_1
    //   39: aload_1
    //   40: astore_0
    //   41: aload_1
    //   42: invokevirtual 590	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   45: astore_2
    //   46: aload_1
    //   47: invokevirtual 591	java/io/ObjectInputStream:close	()V
    //   50: aload_3
    //   51: invokevirtual 592	java/io/ByteArrayInputStream:close	()V
    //   54: aload_2
    //   55: areturn
    //   56: astore_0
    //   57: aload_0
    //   58: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   61: aload_2
    //   62: areturn
    //   63: astore_0
    //   64: aload_0
    //   65: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   68: goto -18 -> 50
    //   71: astore_2
    //   72: aconst_null
    //   73: astore_1
    //   74: aload_1
    //   75: astore_0
    //   76: aload_2
    //   77: invokevirtual 329	java/lang/Throwable:printStackTrace	()V
    //   80: aload_1
    //   81: astore_0
    //   82: aload_2
    //   83: invokevirtual 221	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   86: iconst_0
    //   87: anewarray 4	java/lang/Object
    //   90: invokestatic 220	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   93: aload_1
    //   94: ifnull +7 -> 101
    //   97: aload_1
    //   98: invokevirtual 591	java/io/ObjectInputStream:close	()V
    //   101: aload_3
    //   102: invokevirtual 592	java/io/ByteArrayInputStream:close	()V
    //   105: aconst_null
    //   106: areturn
    //   107: astore_0
    //   108: aload_0
    //   109: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   112: aconst_null
    //   113: areturn
    //   114: astore_0
    //   115: aload_0
    //   116: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   119: goto -18 -> 101
    //   122: astore_1
    //   123: aconst_null
    //   124: astore_0
    //   125: aload_0
    //   126: ifnull +7 -> 133
    //   129: aload_0
    //   130: invokevirtual 591	java/io/ObjectInputStream:close	()V
    //   133: aload_3
    //   134: invokevirtual 592	java/io/ByteArrayInputStream:close	()V
    //   137: aload_1
    //   138: athrow
    //   139: astore_0
    //   140: aload_0
    //   141: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   144: goto -11 -> 133
    //   147: astore_0
    //   148: aload_0
    //   149: invokevirtual 215	java/io/IOException:printStackTrace	()V
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
  
  public static String a(Context paramContext, int paramInt)
  {
    try
    {
      Object localObject = com.tencent.beacon.event.e.a(paramContext);
      paramContext = ((com.tencent.beacon.event.e)localObject).a();
      localObject = ((com.tencent.beacon.event.e)localObject).b();
      paramContext = e(paramContext + "_" + (String)localObject + "_" + new Date().getTime() + "_" + paramInt);
      return paramContext;
    }
    catch (Exception paramContext) {}
    return null;
  }
  
  /* Error */
  public static ArrayList<String> a(String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 607	java/util/ArrayList
    //   5: dup
    //   6: invokespecial 608	java/util/ArrayList:<init>	()V
    //   9: astore 4
    //   11: invokestatic 614	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   14: aload_0
    //   15: invokevirtual 618	java/lang/Runtime:exec	([Ljava/lang/String;)Ljava/lang/Process;
    //   18: astore_0
    //   19: new 620	java/io/BufferedReader
    //   22: dup
    //   23: new 622	java/io/InputStreamReader
    //   26: dup
    //   27: aload_0
    //   28: invokevirtual 625	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   31: invokespecial 626	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   34: invokespecial 629	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   37: astore_1
    //   38: aload_1
    //   39: invokevirtual 632	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   42: astore_2
    //   43: aload_2
    //   44: ifnull +44 -> 88
    //   47: aload 4
    //   49: aload_2
    //   50: invokevirtual 635	java/util/ArrayList:add	(Ljava/lang/Object;)Z
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
    //   67: invokevirtual 329	java/lang/Throwable:printStackTrace	()V
    //   70: aload_1
    //   71: ifnull +7 -> 78
    //   74: aload_1
    //   75: invokevirtual 636	java/io/BufferedReader:close	()V
    //   78: aload_0
    //   79: ifnull +7 -> 86
    //   82: aload_0
    //   83: invokevirtual 636	java/io/BufferedReader:close	()V
    //   86: aconst_null
    //   87: areturn
    //   88: new 620	java/io/BufferedReader
    //   91: dup
    //   92: new 622	java/io/InputStreamReader
    //   95: dup
    //   96: aload_0
    //   97: invokevirtual 639	java/lang/Process:getErrorStream	()Ljava/io/InputStream;
    //   100: invokespecial 626	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   103: invokespecial 629	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   106: astore_0
    //   107: aload_0
    //   108: astore_3
    //   109: aload_1
    //   110: astore_2
    //   111: aload_0
    //   112: invokevirtual 632	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   115: astore 5
    //   117: aload 5
    //   119: ifnull +23 -> 142
    //   122: aload_0
    //   123: astore_3
    //   124: aload_1
    //   125: astore_2
    //   126: aload 4
    //   128: aload 5
    //   130: invokevirtual 635	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   133: pop
    //   134: goto -27 -> 107
    //   137: astore 4
    //   139: goto -78 -> 61
    //   142: aload_1
    //   143: invokevirtual 636	java/io/BufferedReader:close	()V
    //   146: aload_0
    //   147: invokevirtual 636	java/io/BufferedReader:close	()V
    //   150: aload 4
    //   152: areturn
    //   153: astore_0
    //   154: aload_0
    //   155: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   158: aload 4
    //   160: areturn
    //   161: astore_1
    //   162: aload_1
    //   163: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   166: goto -20 -> 146
    //   169: astore_1
    //   170: aload_1
    //   171: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   174: goto -96 -> 78
    //   177: astore_0
    //   178: aload_0
    //   179: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   182: goto -96 -> 86
    //   185: astore_0
    //   186: aconst_null
    //   187: astore_1
    //   188: aload_1
    //   189: ifnull +7 -> 196
    //   192: aload_1
    //   193: invokevirtual 636	java/io/BufferedReader:close	()V
    //   196: aload_3
    //   197: ifnull +7 -> 204
    //   200: aload_3
    //   201: invokevirtual 636	java/io/BufferedReader:close	()V
    //   204: aload_0
    //   205: athrow
    //   206: astore_1
    //   207: aload_1
    //   208: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   211: goto -15 -> 196
    //   214: astore_1
    //   215: aload_1
    //   216: invokevirtual 215	java/io/IOException:printStackTrace	()V
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
  
  public static HashSet<String> a(ArrayList<String> paramArrayList)
  {
    int i1 = paramArrayList.size();
    if ((paramArrayList != null) && (i1 > 0))
    {
      HashSet localHashSet = new HashSet(i1);
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext()) {
        localHashSet.add((String)paramArrayList.next());
      }
      return localHashSet;
    }
    return null;
  }
  
  /* Error */
  public static byte[] a(Object paramObject)
  {
    // Byte code:
    //   0: ldc_w 666
    //   3: iconst_0
    //   4: anewarray 4	java/lang/Object
    //   7: invokestatic 230	com/tencent/beacon/e/b:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   10: aload_0
    //   11: ifnull +13 -> 24
    //   14: ldc_w 668
    //   17: aload_0
    //   18: invokevirtual 673	java/lang/Class:isInstance	(Ljava/lang/Object;)Z
    //   21: ifne +15 -> 36
    //   24: ldc_w 675
    //   27: iconst_0
    //   28: anewarray 4	java/lang/Object
    //   31: invokestatic 677	com/tencent/beacon/e/b:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   34: aconst_null
    //   35: areturn
    //   36: new 679	java/io/ByteArrayOutputStream
    //   39: dup
    //   40: invokespecial 680	java/io/ByteArrayOutputStream:<init>	()V
    //   43: astore 4
    //   45: new 682	java/io/ObjectOutputStream
    //   48: dup
    //   49: aload 4
    //   51: invokespecial 685	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   54: astore_2
    //   55: aload_2
    //   56: astore_1
    //   57: aload_2
    //   58: aload_0
    //   59: invokevirtual 689	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   62: aload_2
    //   63: astore_1
    //   64: aload_2
    //   65: invokevirtual 690	java/io/ObjectOutputStream:flush	()V
    //   68: aload_2
    //   69: astore_1
    //   70: aload 4
    //   72: invokevirtual 693	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   75: astore_0
    //   76: aload_2
    //   77: invokevirtual 694	java/io/ObjectOutputStream:close	()V
    //   80: aload 4
    //   82: invokevirtual 695	java/io/ByteArrayOutputStream:close	()V
    //   85: aload_0
    //   86: areturn
    //   87: astore_1
    //   88: aload_1
    //   89: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   92: aload_0
    //   93: areturn
    //   94: astore_1
    //   95: aload_1
    //   96: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   99: goto -19 -> 80
    //   102: astore_3
    //   103: aconst_null
    //   104: astore_0
    //   105: aload_0
    //   106: astore_1
    //   107: aload_3
    //   108: invokevirtual 329	java/lang/Throwable:printStackTrace	()V
    //   111: aload_0
    //   112: astore_1
    //   113: aload_3
    //   114: invokevirtual 221	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   117: iconst_0
    //   118: anewarray 4	java/lang/Object
    //   121: invokestatic 220	com/tencent/beacon/e/b:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   124: aload_0
    //   125: ifnull +7 -> 132
    //   128: aload_0
    //   129: invokevirtual 694	java/io/ObjectOutputStream:close	()V
    //   132: aload 4
    //   134: invokevirtual 695	java/io/ByteArrayOutputStream:close	()V
    //   137: aconst_null
    //   138: areturn
    //   139: astore_0
    //   140: aload_0
    //   141: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   144: aconst_null
    //   145: areturn
    //   146: astore_0
    //   147: aload_0
    //   148: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   151: goto -19 -> 132
    //   154: astore_0
    //   155: aconst_null
    //   156: astore_1
    //   157: aload_1
    //   158: ifnull +7 -> 165
    //   161: aload_1
    //   162: invokevirtual 694	java/io/ObjectOutputStream:close	()V
    //   165: aload 4
    //   167: invokevirtual 695	java/io/ByteArrayOutputStream:close	()V
    //   170: aload_0
    //   171: athrow
    //   172: astore_1
    //   173: aload_1
    //   174: invokevirtual 215	java/io/IOException:printStackTrace	()V
    //   177: goto -12 -> 165
    //   180: astore_1
    //   181: aload_1
    //   182: invokevirtual 215	java/io/IOException:printStackTrace	()V
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
  
  public static byte[] a(byte[] paramArrayOfByte, int paramInt)
  {
    if ((paramArrayOfByte == null) || (paramInt == -1)) {
      return paramArrayOfByte;
    }
    com.tencent.beacon.e.b.b("zp: %s len: %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfByte.length) });
    try
    {
      paramArrayOfByte = h.a(paramInt, paramArrayOfByte);
      return paramArrayOfByte;
    }
    catch (Throwable paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
      com.tencent.beacon.e.b.d("err zp : %s", new Object[] { paramArrayOfByte.toString() });
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
    com.tencent.beacon.e.b.b("enD:} %d %d", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(paramInt) });
    try
    {
      paramArrayOfByte = h.b(paramInt, paramString, paramArrayOfByte);
      return paramArrayOfByte;
    }
    catch (Throwable paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
      com.tencent.beacon.e.b.d("err enD: %s", new Object[] { paramArrayOfByte.toString() });
    }
    return null;
  }
  
  public static String b(String paramString)
  {
    String str2 = "";
    String str1 = str2;
    try
    {
      FileInputStream localFileInputStream = new FileInputStream(paramString);
      str1 = str2;
      byte[] arrayOfByte = new byte[localFileInputStream.available()];
      str1 = str2;
      localFileInputStream.read(arrayOfByte);
      str1 = str2;
      str2 = EncodingUtils.getString(arrayOfByte, "UTF-8");
      str1 = str2;
      localFileInputStream.close();
      return str2;
    }
    catch (Exception localException)
    {
      com.tencent.beacon.e.b.d("Read file %s failed.", new Object[] { paramString });
    }
    return str1;
  }
  
  public static byte[] b(byte[] paramArrayOfByte, int paramInt)
  {
    if ((paramArrayOfByte == null) || (paramInt == -1)) {
      return paramArrayOfByte;
    }
    com.tencent.beacon.e.b.b("unzp: %s len: %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfByte.length) });
    try
    {
      paramArrayOfByte = h.b(paramInt, paramArrayOfByte);
      return paramArrayOfByte;
    }
    catch (Throwable paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
      com.tencent.beacon.e.b.d("err unzp}" + paramArrayOfByte.toString(), new Object[0]);
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
    try
    {
      paramArrayOfByte = h.a(paramInt, paramString, paramArrayOfByte);
      return paramArrayOfByte;
    }
    catch (Throwable paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
      com.tencent.beacon.e.b.d("err unD: %s", new Object[] { paramArrayOfByte.toString() });
    }
    return null;
  }
  
  public static String c(String paramString)
  {
    try
    {
      paramString = new RandomAccessFile(paramString, "r");
      String str = paramString.readLine();
      if (str != null)
      {
        paramString.close();
        return str;
      }
    }
    catch (Exception paramString) {}
    return null;
  }
  
  public static String d(String paramString)
  {
    int i1 = 0;
    try
    {
      Object localObject = MessageDigest.getInstance("MD5").digest(paramString.getBytes());
      StringBuffer localStringBuffer = new StringBuffer();
      int i2 = localObject.length;
      while (i1 < i2)
      {
        int i3 = localObject[i1] & 0xFF;
        if (i3 < 16) {
          localStringBuffer.append(0);
        }
        localStringBuffer.append(Integer.toHexString(i3));
        i1 += 1;
      }
      localObject = localStringBuffer.toString();
      return (String)localObject;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return paramString;
  }
  
  public static String e(String paramString)
  {
    String str = d(paramString);
    paramString = str;
    if (str != null) {}
    try
    {
      paramString = str.substring(8, 24);
      return paramString;
    }
    catch (Exception paramString) {}
    return str;
  }
  
  public static long s()
  {
    try
    {
      SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
      long l1 = localSimpleDateFormat.parse(localSimpleDateFormat.format(new Date())).getTime();
      return l1;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
    }
    return -1L;
  }
  
  public static String t()
  {
    try
    {
      String str = new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date());
      return str;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
    }
    return "";
  }
  
  public String a()
  {
    if ((this.a == null) || ("".equals(this.a))) {
      return this.b;
    }
    return this.a;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public String b()
  {
    return this.a;
  }
  
  public String c()
  {
    return this.b;
  }
  
  public String d()
  {
    return this.c;
  }
  
  public String e()
  {
    return this.d;
  }
  
  public String f()
  {
    return this.e;
  }
  
  public String g()
  {
    return this.j;
  }
  
  public boolean h()
  {
    return this.k;
  }
  
  public String i()
  {
    return this.l;
  }
  
  public String j()
  {
    return this.m;
  }
  
  public String k()
  {
    return this.n;
  }
  
  public String l()
  {
    return this.o;
  }
  
  public String m()
  {
    return this.p;
  }
  
  public String n()
  {
    return this.q;
  }
  
  public String o()
  {
    return this.r;
  }
  
  public String p()
  {
    return this.g;
  }
  
  public String q()
  {
    return this.h;
  }
  
  public String r()
  {
    return this.i;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */