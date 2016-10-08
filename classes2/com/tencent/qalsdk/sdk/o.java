package com.tencent.qalsdk.sdk;

import android.content.Context;
import com.tencent.mobileqq.pb.InvalidProtocolBufferMicroException;
import com.tencent.qalsdk.base.remote.FromServiceMsg;
import com.tencent.qalsdk.core.m;
import com.tencent.qalsdk.im_open.logParams.LogParams;
import com.tencent.qalsdk.service.QalService;
import com.tencent.qalsdk.util.QLog;

public class o
{
  static String b = o.class.getSimpleName();
  static final String c = "-------qalsdklogios";
  static String d = "report.zip";
  static String e = QLog.getLogBasePath() + "/logzip/";
  static String f = "--";
  static String g = "\r\n";
  Context a = QalService.context;
  
  /* Error */
  private void a(long paramLong1, long paramLong2, int paramInt, String paramString)
  {
    // Byte code:
    //   0: lload_1
    //   1: ldc2_w 73
    //   4: ldiv
    //   5: ldc2_w 73
    //   8: lmul
    //   9: lstore_1
    //   10: lload_3
    //   11: ldc2_w 73
    //   14: ldiv
    //   15: lconst_1
    //   16: ladd
    //   17: ldc2_w 73
    //   20: lmul
    //   21: lstore 9
    //   23: aconst_null
    //   24: astore 8
    //   26: new 76	java/io/File
    //   29: dup
    //   30: aload 6
    //   32: invokespecial 79	java/io/File:<init>	(Ljava/lang/String;)V
    //   35: astore 7
    //   37: aload 7
    //   39: invokevirtual 83	java/io/File:exists	()Z
    //   42: ifne +9 -> 51
    //   45: aload 7
    //   47: invokevirtual 86	java/io/File:mkdir	()Z
    //   50: pop
    //   51: new 88	java/util/zip/ZipOutputStream
    //   54: dup
    //   55: new 90	java/io/FileOutputStream
    //   58: dup
    //   59: new 31	java/lang/StringBuilder
    //   62: dup
    //   63: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   66: aload 6
    //   68: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: getstatic 29	com/tencent/qalsdk/sdk/o:d	Ljava/lang/String;
    //   74: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   80: invokespecial 91	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   83: invokespecial 94	java/util/zip/ZipOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   86: astore 7
    //   88: iload 5
    //   90: iconst_1
    //   91: if_icmpeq +9 -> 100
    //   94: iload 5
    //   96: iconst_3
    //   97: if_icmpne +320 -> 417
    //   100: lload_1
    //   101: lstore_3
    //   102: lload_3
    //   103: lload 9
    //   105: lcmp
    //   106: ifge +311 -> 417
    //   109: ldc2_w 95
    //   112: lload_3
    //   113: lmul
    //   114: invokestatic 100	com/tencent/qalsdk/util/QLog:getLogFileName	(J)Ljava/lang/String;
    //   117: astore 6
    //   119: new 31	java/lang/StringBuilder
    //   122: dup
    //   123: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   126: invokestatic 103	com/tencent/qalsdk/util/QLog:getFilePath	()Ljava/lang/String;
    //   129: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: aload 6
    //   134: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   140: astore 6
    //   142: new 76	java/io/File
    //   145: dup
    //   146: aload 6
    //   148: invokespecial 79	java/io/File:<init>	(Ljava/lang/String;)V
    //   151: astore 8
    //   153: aload 8
    //   155: invokevirtual 83	java/io/File:exists	()Z
    //   158: ifeq +250 -> 408
    //   161: getstatic 25	com/tencent/qalsdk/sdk/o:b	Ljava/lang/String;
    //   164: new 31	java/lang/StringBuilder
    //   167: dup
    //   168: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   171: ldc 105
    //   173: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   176: aload 6
    //   178: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   181: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   184: invokestatic 108	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   187: aload_0
    //   188: aload 8
    //   190: aload 7
    //   192: invokevirtual 111	com/tencent/qalsdk/sdk/o:a	(Ljava/io/File;Ljava/util/zip/ZipOutputStream;)V
    //   195: goto +213 -> 408
    //   198: lload_1
    //   199: lload 9
    //   201: lcmp
    //   202: ifge +98 -> 300
    //   205: ldc2_w 95
    //   208: lload_1
    //   209: lmul
    //   210: invokestatic 114	com/tencent/qalsdk/util/ALog:getLogFileName	(J)Ljava/lang/String;
    //   213: astore 6
    //   215: new 31	java/lang/StringBuilder
    //   218: dup
    //   219: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   222: invokestatic 115	com/tencent/qalsdk/util/ALog:getFilePath	()Ljava/lang/String;
    //   225: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   228: aload 6
    //   230: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   233: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   236: astore 6
    //   238: new 76	java/io/File
    //   241: dup
    //   242: aload 6
    //   244: invokespecial 79	java/io/File:<init>	(Ljava/lang/String;)V
    //   247: astore 8
    //   249: aload 8
    //   251: invokevirtual 83	java/io/File:exists	()Z
    //   254: ifeq +37 -> 291
    //   257: getstatic 25	com/tencent/qalsdk/sdk/o:b	Ljava/lang/String;
    //   260: new 31	java/lang/StringBuilder
    //   263: dup
    //   264: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   267: ldc 105
    //   269: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   272: aload 6
    //   274: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   277: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   280: invokestatic 108	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   283: aload_0
    //   284: aload 8
    //   286: aload 7
    //   288: invokevirtual 111	com/tencent/qalsdk/sdk/o:a	(Ljava/io/File;Ljava/util/zip/ZipOutputStream;)V
    //   291: lload_1
    //   292: ldc2_w 73
    //   295: ladd
    //   296: lstore_1
    //   297: goto -99 -> 198
    //   300: aload 7
    //   302: ifnull +8 -> 310
    //   305: aload 7
    //   307: invokevirtual 118	java/util/zip/ZipOutputStream:close	()V
    //   310: return
    //   311: astore 6
    //   313: aload 6
    //   315: invokevirtual 121	java/io/IOException:printStackTrace	()V
    //   318: return
    //   319: astore 7
    //   321: aload 8
    //   323: astore 6
    //   325: aload 7
    //   327: invokevirtual 122	java/io/FileNotFoundException:printStackTrace	()V
    //   330: aload 6
    //   332: ifnull -22 -> 310
    //   335: aload 6
    //   337: invokevirtual 118	java/util/zip/ZipOutputStream:close	()V
    //   340: return
    //   341: astore 6
    //   343: aload 6
    //   345: invokevirtual 121	java/io/IOException:printStackTrace	()V
    //   348: return
    //   349: astore 6
    //   351: aconst_null
    //   352: astore 7
    //   354: aload 7
    //   356: ifnull +8 -> 364
    //   359: aload 7
    //   361: invokevirtual 118	java/util/zip/ZipOutputStream:close	()V
    //   364: aload 6
    //   366: athrow
    //   367: astore 7
    //   369: aload 7
    //   371: invokevirtual 121	java/io/IOException:printStackTrace	()V
    //   374: goto -10 -> 364
    //   377: astore 6
    //   379: goto -25 -> 354
    //   382: astore 8
    //   384: aload 6
    //   386: astore 7
    //   388: aload 8
    //   390: astore 6
    //   392: goto -38 -> 354
    //   395: astore 8
    //   397: aload 7
    //   399: astore 6
    //   401: aload 8
    //   403: astore 7
    //   405: goto -80 -> 325
    //   408: lload_3
    //   409: ldc2_w 73
    //   412: ladd
    //   413: lstore_3
    //   414: goto -312 -> 102
    //   417: iload 5
    //   419: iconst_2
    //   420: if_icmpeq +9 -> 429
    //   423: iload 5
    //   425: iconst_3
    //   426: if_icmpne -126 -> 300
    //   429: goto -231 -> 198
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	432	0	this	o
    //   0	432	1	paramLong1	long
    //   0	432	3	paramLong2	long
    //   0	432	5	paramInt	int
    //   0	432	6	paramString	String
    //   35	271	7	localObject1	Object
    //   319	7	7	localFileNotFoundException1	java.io.FileNotFoundException
    //   352	8	7	localObject2	Object
    //   367	3	7	localIOException	java.io.IOException
    //   386	18	7	localObject3	Object
    //   24	298	8	localFile	java.io.File
    //   382	7	8	localObject4	Object
    //   395	7	8	localFileNotFoundException2	java.io.FileNotFoundException
    //   21	179	9	l	long
    // Exception table:
    //   from	to	target	type
    //   305	310	311	java/io/IOException
    //   26	51	319	java/io/FileNotFoundException
    //   51	88	319	java/io/FileNotFoundException
    //   335	340	341	java/io/IOException
    //   26	51	349	finally
    //   51	88	349	finally
    //   359	364	367	java/io/IOException
    //   109	195	377	finally
    //   205	291	377	finally
    //   325	330	382	finally
    //   109	195	395	java/io/FileNotFoundException
    //   205	291	395	java/io/FileNotFoundException
  }
  
  /* Error */
  private void a(logParams.LogParams paramLogParams)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore_3
    //   5: aload_1
    //   6: getfield 131	com/tencent/qalsdk/im_open/logParams$LogParams:url	Lcom/tencent/mobileqq/pb/PBStringField;
    //   9: invokevirtual 136	com/tencent/mobileqq/pb/PBStringField:get	()Ljava/lang/String;
    //   12: astore 6
    //   14: aload_1
    //   15: getfield 139	com/tencent/qalsdk/im_open/logParams$LogParams:authorization	Lcom/tencent/mobileqq/pb/PBStringField;
    //   18: invokevirtual 136	com/tencent/mobileqq/pb/PBStringField:get	()Ljava/lang/String;
    //   21: astore_2
    //   22: aload_1
    //   23: getfield 143	com/tencent/qalsdk/im_open/logParams$LogParams:begtime	Lcom/tencent/mobileqq/pb/PBUInt32Field;
    //   26: invokevirtual 148	com/tencent/mobileqq/pb/PBUInt32Field:get	()I
    //   29: i2l
    //   30: lstore 11
    //   32: aload_1
    //   33: getfield 151	com/tencent/qalsdk/im_open/logParams$LogParams:endtime	Lcom/tencent/mobileqq/pb/PBUInt32Field;
    //   36: invokevirtual 148	com/tencent/mobileqq/pb/PBUInt32Field:get	()I
    //   39: i2l
    //   40: lstore 13
    //   42: aload_0
    //   43: aload_1
    //   44: getfield 155	com/tencent/qalsdk/im_open/logParams$LogParams:apn	Lcom/tencent/mobileqq/pb/PBEnumField;
    //   47: invokevirtual 158	com/tencent/mobileqq/pb/PBEnumField:get	()I
    //   50: invokespecial 161	com/tencent/qalsdk/sdk/o:a	(I)Z
    //   53: ifne +12 -> 65
    //   56: getstatic 25	com/tencent/qalsdk/sdk/o:b	Ljava/lang/String;
    //   59: ldc -93
    //   61: invokestatic 108	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   64: return
    //   65: aload_0
    //   66: lload 11
    //   68: lload 13
    //   70: aload_1
    //   71: getfield 166	com/tencent/qalsdk/im_open/logParams$LogParams:logtype	Lcom/tencent/mobileqq/pb/PBEnumField;
    //   74: invokevirtual 158	com/tencent/mobileqq/pb/PBEnumField:get	()I
    //   77: invokespecial 169	com/tencent/qalsdk/sdk/o:a	(JJI)[B
    //   80: astore 4
    //   82: aload 4
    //   84: ifnonnull +12 -> 96
    //   87: getstatic 25	com/tencent/qalsdk/sdk/o:b	Ljava/lang/String;
    //   90: ldc -85
    //   92: invokestatic 108	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   95: return
    //   96: new 173	java/net/URL
    //   99: dup
    //   100: aload 6
    //   102: invokespecial 174	java/net/URL:<init>	(Ljava/lang/String;)V
    //   105: astore 6
    //   107: aload 6
    //   109: invokevirtual 178	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   112: checkcast 180	java/net/HttpURLConnection
    //   115: astore 7
    //   117: aload 7
    //   119: iconst_1
    //   120: invokevirtual 184	java/net/HttpURLConnection:setDoInput	(Z)V
    //   123: aload 7
    //   125: iconst_1
    //   126: invokevirtual 187	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   129: aload 7
    //   131: sipush 15000
    //   134: invokevirtual 191	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   137: aload 7
    //   139: sipush 15000
    //   142: invokevirtual 194	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   145: aload 7
    //   147: ldc -60
    //   149: invokevirtual 199	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   152: aload 7
    //   154: ldc -55
    //   156: ldc -53
    //   158: invokevirtual 206	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   161: aload 7
    //   163: ldc -48
    //   165: aload_2
    //   166: invokevirtual 206	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   169: aload 7
    //   171: ldc -46
    //   173: ldc -44
    //   175: invokevirtual 206	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   178: new 31	java/lang/StringBuilder
    //   181: dup
    //   182: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   185: astore 8
    //   187: aload 8
    //   189: getstatic 58	com/tencent/qalsdk/sdk/o:g	Ljava/lang/String;
    //   192: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   195: pop
    //   196: aload 8
    //   198: new 31	java/lang/StringBuilder
    //   201: dup
    //   202: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   205: getstatic 54	com/tencent/qalsdk/sdk/o:f	Ljava/lang/String;
    //   208: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   211: ldc 9
    //   213: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: getstatic 58	com/tencent/qalsdk/sdk/o:g	Ljava/lang/String;
    //   219: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   222: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   225: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   228: pop
    //   229: aload 8
    //   231: ldc -42
    //   233: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   236: pop
    //   237: aload 8
    //   239: new 31	java/lang/StringBuilder
    //   242: dup
    //   243: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   246: getstatic 58	com/tencent/qalsdk/sdk/o:g	Ljava/lang/String;
    //   249: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   252: getstatic 58	com/tencent/qalsdk/sdk/o:g	Ljava/lang/String;
    //   255: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   258: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   261: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   264: pop
    //   265: aload 8
    //   267: ldc -40
    //   269: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   272: pop
    //   273: aload 8
    //   275: getstatic 58	com/tencent/qalsdk/sdk/o:g	Ljava/lang/String;
    //   278: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   281: pop
    //   282: aload 8
    //   284: new 31	java/lang/StringBuilder
    //   287: dup
    //   288: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   291: getstatic 54	com/tencent/qalsdk/sdk/o:f	Ljava/lang/String;
    //   294: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   297: ldc 9
    //   299: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   302: getstatic 58	com/tencent/qalsdk/sdk/o:g	Ljava/lang/String;
    //   305: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   308: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   311: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   314: pop
    //   315: aload 8
    //   317: ldc -38
    //   319: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   322: pop
    //   323: aload 8
    //   325: new 31	java/lang/StringBuilder
    //   328: dup
    //   329: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   332: getstatic 58	com/tencent/qalsdk/sdk/o:g	Ljava/lang/String;
    //   335: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   338: getstatic 58	com/tencent/qalsdk/sdk/o:g	Ljava/lang/String;
    //   341: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   344: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   347: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   350: pop
    //   351: new 31	java/lang/StringBuilder
    //   354: dup
    //   355: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   358: getstatic 54	com/tencent/qalsdk/sdk/o:f	Ljava/lang/String;
    //   361: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   364: ldc 9
    //   366: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   369: getstatic 58	com/tencent/qalsdk/sdk/o:g	Ljava/lang/String;
    //   372: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   375: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   378: astore 9
    //   380: aload 7
    //   382: ldc -36
    //   384: aload 8
    //   386: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   389: invokevirtual 226	java/lang/String:getBytes	()[B
    //   392: arraylength
    //   393: aload 4
    //   395: arraylength
    //   396: iadd
    //   397: getstatic 58	com/tencent/qalsdk/sdk/o:g	Ljava/lang/String;
    //   400: invokevirtual 229	java/lang/String:length	()I
    //   403: iadd
    //   404: aload 9
    //   406: invokevirtual 229	java/lang/String:length	()I
    //   409: iadd
    //   410: invokestatic 233	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   413: invokevirtual 206	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   416: aload 7
    //   418: invokevirtual 237	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   421: astore_1
    //   422: aload_1
    //   423: aload 8
    //   425: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   428: invokevirtual 226	java/lang/String:getBytes	()[B
    //   431: invokevirtual 243	java/io/OutputStream:write	([B)V
    //   434: aload_1
    //   435: aload 4
    //   437: invokevirtual 243	java/io/OutputStream:write	([B)V
    //   440: aload_1
    //   441: getstatic 58	com/tencent/qalsdk/sdk/o:g	Ljava/lang/String;
    //   444: invokevirtual 226	java/lang/String:getBytes	()[B
    //   447: invokevirtual 243	java/io/OutputStream:write	([B)V
    //   450: aload_1
    //   451: aload 9
    //   453: invokevirtual 226	java/lang/String:getBytes	()[B
    //   456: invokevirtual 243	java/io/OutputStream:write	([B)V
    //   459: aload_1
    //   460: invokevirtual 246	java/io/OutputStream:flush	()V
    //   463: getstatic 25	com/tencent/qalsdk/sdk/o:b	Ljava/lang/String;
    //   466: new 31	java/lang/StringBuilder
    //   469: dup
    //   470: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   473: ldc -8
    //   475: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   478: aload 6
    //   480: invokevirtual 251	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   483: ldc -3
    //   485: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   488: aload_2
    //   489: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   492: ldc -1
    //   494: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   497: aload 8
    //   499: invokevirtual 256	java/lang/StringBuilder:length	()I
    //   502: invokevirtual 259	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   505: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   508: invokestatic 262	com/tencent/qalsdk/util/QLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   511: aload 7
    //   513: invokevirtual 265	java/net/HttpURLConnection:getResponseCode	()I
    //   516: istore 10
    //   518: getstatic 25	com/tencent/qalsdk/sdk/o:b	Ljava/lang/String;
    //   521: new 31	java/lang/StringBuilder
    //   524: dup
    //   525: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   528: ldc_w 267
    //   531: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   534: iload 10
    //   536: invokevirtual 259	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   539: ldc_w 269
    //   542: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   545: aload 7
    //   547: invokevirtual 272	java/net/HttpURLConnection:getResponseMessage	()Ljava/lang/String;
    //   550: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   553: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   556: invokestatic 262	com/tencent/qalsdk/util/QLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   559: iload 10
    //   561: sipush 200
    //   564: if_icmpne +361 -> 925
    //   567: aload 7
    //   569: invokevirtual 276	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   572: astore_2
    //   573: new 278	java/io/ByteArrayOutputStream
    //   576: dup
    //   577: invokespecial 279	java/io/ByteArrayOutputStream:<init>	()V
    //   580: astore 4
    //   582: sipush 1024
    //   585: newarray <illegal type>
    //   587: astore_3
    //   588: aload_2
    //   589: aload_3
    //   590: invokevirtual 285	java/io/InputStream:read	([B)I
    //   593: istore 10
    //   595: iload 10
    //   597: iconst_1
    //   598: if_icmplt +62 -> 660
    //   601: aload 4
    //   603: aload_3
    //   604: iconst_0
    //   605: iload 10
    //   607: invokevirtual 288	java/io/ByteArrayOutputStream:write	([BII)V
    //   610: goto -22 -> 588
    //   613: astore 5
    //   615: aload_1
    //   616: astore_3
    //   617: aload 4
    //   619: astore_1
    //   620: aload 5
    //   622: astore 4
    //   624: aload 4
    //   626: invokevirtual 289	java/lang/Exception:printStackTrace	()V
    //   629: aload_2
    //   630: ifnull +7 -> 637
    //   633: aload_2
    //   634: invokevirtual 290	java/io/InputStream:close	()V
    //   637: aload_3
    //   638: ifnull +7 -> 645
    //   641: aload_3
    //   642: invokevirtual 291	java/io/OutputStream:close	()V
    //   645: aload_1
    //   646: ifnull -582 -> 64
    //   649: aload_1
    //   650: invokevirtual 292	java/io/ByteArrayOutputStream:close	()V
    //   653: return
    //   654: astore_1
    //   655: aload_1
    //   656: invokevirtual 121	java/io/IOException:printStackTrace	()V
    //   659: return
    //   660: new 294	org/json/JSONObject
    //   663: dup
    //   664: new 222	java/lang/String
    //   667: dup
    //   668: aload 4
    //   670: invokevirtual 297	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   673: invokespecial 299	java/lang/String:<init>	([B)V
    //   676: invokespecial 300	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   679: astore 6
    //   681: aload 6
    //   683: ldc_w 302
    //   686: invokevirtual 306	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   689: astore_3
    //   690: aload 6
    //   692: ldc_w 308
    //   695: invokevirtual 306	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   698: astore 5
    //   700: new 294	org/json/JSONObject
    //   703: dup
    //   704: aload 6
    //   706: ldc_w 310
    //   709: invokevirtual 306	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   712: invokespecial 300	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   715: astore 6
    //   717: getstatic 25	com/tencent/qalsdk/sdk/o:b	Ljava/lang/String;
    //   720: new 31	java/lang/StringBuilder
    //   723: dup
    //   724: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   727: ldc_w 267
    //   730: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   733: aload_3
    //   734: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   737: ldc_w 269
    //   740: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   743: aload 5
    //   745: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   748: ldc_w 269
    //   751: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   754: aload 6
    //   756: ldc_w 312
    //   759: invokevirtual 306	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   762: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   765: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   768: invokestatic 108	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   771: aload_2
    //   772: ifnull +7 -> 779
    //   775: aload_2
    //   776: invokevirtual 290	java/io/InputStream:close	()V
    //   779: aload_1
    //   780: ifnull +7 -> 787
    //   783: aload_1
    //   784: invokevirtual 291	java/io/OutputStream:close	()V
    //   787: aload 4
    //   789: ifnull -725 -> 64
    //   792: aload 4
    //   794: invokevirtual 292	java/io/ByteArrayOutputStream:close	()V
    //   797: return
    //   798: astore_1
    //   799: aload_1
    //   800: invokevirtual 121	java/io/IOException:printStackTrace	()V
    //   803: return
    //   804: astore_3
    //   805: aconst_null
    //   806: astore_1
    //   807: aconst_null
    //   808: astore_2
    //   809: aload 5
    //   811: astore 4
    //   813: aload_2
    //   814: ifnull +7 -> 821
    //   817: aload_2
    //   818: invokevirtual 290	java/io/InputStream:close	()V
    //   821: aload_1
    //   822: ifnull +7 -> 829
    //   825: aload_1
    //   826: invokevirtual 291	java/io/OutputStream:close	()V
    //   829: aload 4
    //   831: ifnull +8 -> 839
    //   834: aload 4
    //   836: invokevirtual 292	java/io/ByteArrayOutputStream:close	()V
    //   839: aload_3
    //   840: athrow
    //   841: astore_1
    //   842: aload_1
    //   843: invokevirtual 121	java/io/IOException:printStackTrace	()V
    //   846: goto -7 -> 839
    //   849: astore_3
    //   850: aconst_null
    //   851: astore_2
    //   852: aload 5
    //   854: astore 4
    //   856: goto -43 -> 813
    //   859: astore_3
    //   860: aload 5
    //   862: astore 4
    //   864: goto -51 -> 813
    //   867: astore_3
    //   868: goto -55 -> 813
    //   871: astore 6
    //   873: aload_3
    //   874: astore 5
    //   876: aload_1
    //   877: astore 4
    //   879: aload 6
    //   881: astore_3
    //   882: aload 5
    //   884: astore_1
    //   885: goto -72 -> 813
    //   888: astore 4
    //   890: aconst_null
    //   891: astore_1
    //   892: aconst_null
    //   893: astore_2
    //   894: goto -270 -> 624
    //   897: astore 4
    //   899: aconst_null
    //   900: astore 5
    //   902: aconst_null
    //   903: astore_2
    //   904: aload_1
    //   905: astore_3
    //   906: aload 5
    //   908: astore_1
    //   909: goto -285 -> 624
    //   912: astore 4
    //   914: aconst_null
    //   915: astore 5
    //   917: aload_1
    //   918: astore_3
    //   919: aload 5
    //   921: astore_1
    //   922: goto -298 -> 624
    //   925: aconst_null
    //   926: astore 4
    //   928: aconst_null
    //   929: astore_2
    //   930: goto -159 -> 771
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	933	0	this	o
    //   0	933	1	paramLogParams	logParams.LogParams
    //   21	909	2	localObject1	Object
    //   4	730	3	localObject2	Object
    //   804	36	3	localObject3	Object
    //   849	1	3	localObject4	Object
    //   859	1	3	localObject5	Object
    //   867	7	3	localObject6	Object
    //   881	38	3	localObject7	Object
    //   80	798	4	localObject8	Object
    //   888	1	4	localException1	Exception
    //   897	1	4	localException2	Exception
    //   912	1	4	localException3	Exception
    //   926	1	4	localObject9	Object
    //   1	1	5	localObject10	Object
    //   613	8	5	localException4	Exception
    //   698	222	5	localObject11	Object
    //   12	743	6	localObject12	Object
    //   871	9	6	localObject13	Object
    //   115	453	7	localHttpURLConnection	java.net.HttpURLConnection
    //   185	313	8	localStringBuilder	StringBuilder
    //   378	74	9	str	String
    //   516	90	10	i	int
    //   30	37	11	l1	long
    //   40	29	13	l2	long
    // Exception table:
    //   from	to	target	type
    //   582	588	613	java/lang/Exception
    //   588	595	613	java/lang/Exception
    //   601	610	613	java/lang/Exception
    //   660	771	613	java/lang/Exception
    //   633	637	654	java/io/IOException
    //   641	645	654	java/io/IOException
    //   649	653	654	java/io/IOException
    //   775	779	798	java/io/IOException
    //   783	787	798	java/io/IOException
    //   792	797	798	java/io/IOException
    //   96	422	804	finally
    //   817	821	841	java/io/IOException
    //   825	829	841	java/io/IOException
    //   834	839	841	java/io/IOException
    //   422	559	849	finally
    //   567	573	849	finally
    //   573	582	859	finally
    //   582	588	867	finally
    //   588	595	867	finally
    //   601	610	867	finally
    //   660	771	867	finally
    //   624	629	871	finally
    //   96	422	888	java/lang/Exception
    //   422	559	897	java/lang/Exception
    //   567	573	897	java/lang/Exception
    //   573	582	912	java/lang/Exception
  }
  
  private boolean a(int paramInt)
  {
    QLog.d(b, "network:" + m.e() + ":" + m.f());
    return (m.e()) || (paramInt == 8);
  }
  
  /* Error */
  private byte[] a(long paramLong1, long paramLong2, int paramInt)
  {
    // Byte code:
    //   0: new 76	java/io/File
    //   3: dup
    //   4: new 31	java/lang/StringBuilder
    //   7: dup
    //   8: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   11: getstatic 50	com/tencent/qalsdk/sdk/o:e	Ljava/lang/String;
    //   14: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   17: getstatic 29	com/tencent/qalsdk/sdk/o:d	Ljava/lang/String;
    //   20: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   26: invokespecial 79	java/io/File:<init>	(Ljava/lang/String;)V
    //   29: astore 6
    //   31: aload 6
    //   33: invokevirtual 83	java/io/File:exists	()Z
    //   36: ifeq +9 -> 45
    //   39: aload 6
    //   41: invokevirtual 329	java/io/File:delete	()Z
    //   44: pop
    //   45: aload_0
    //   46: lload_1
    //   47: lload_3
    //   48: iload 5
    //   50: getstatic 50	com/tencent/qalsdk/sdk/o:e	Ljava/lang/String;
    //   53: invokespecial 331	com/tencent/qalsdk/sdk/o:a	(JJILjava/lang/String;)V
    //   56: new 333	java/io/FileInputStream
    //   59: dup
    //   60: new 31	java/lang/StringBuilder
    //   63: dup
    //   64: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   67: getstatic 50	com/tencent/qalsdk/sdk/o:e	Ljava/lang/String;
    //   70: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: getstatic 29	com/tencent/qalsdk/sdk/o:d	Ljava/lang/String;
    //   76: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   82: invokespecial 334	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   85: astore 6
    //   87: new 278	java/io/ByteArrayOutputStream
    //   90: dup
    //   91: invokespecial 279	java/io/ByteArrayOutputStream:<init>	()V
    //   94: astore 7
    //   96: sipush 1024
    //   99: newarray <illegal type>
    //   101: astore 8
    //   103: aload 6
    //   105: aload 8
    //   107: invokevirtual 335	java/io/FileInputStream:read	([B)I
    //   110: istore 5
    //   112: iload 5
    //   114: ifle +25 -> 139
    //   117: aload 7
    //   119: aload 8
    //   121: iconst_0
    //   122: iload 5
    //   124: invokevirtual 288	java/io/ByteArrayOutputStream:write	([BII)V
    //   127: goto -24 -> 103
    //   130: astore 6
    //   132: aload 6
    //   134: invokevirtual 122	java/io/FileNotFoundException:printStackTrace	()V
    //   137: aconst_null
    //   138: areturn
    //   139: aload 6
    //   141: invokevirtual 336	java/io/FileInputStream:close	()V
    //   144: aload 7
    //   146: invokevirtual 297	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   149: astore 6
    //   151: aload 6
    //   153: areturn
    //   154: astore 6
    //   156: aload 6
    //   158: invokevirtual 121	java/io/IOException:printStackTrace	()V
    //   161: goto -24 -> 137
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	164	0	this	o
    //   0	164	1	paramLong1	long
    //   0	164	3	paramLong2	long
    //   0	164	5	paramInt	int
    //   29	75	6	localObject	Object
    //   130	10	6	localFileNotFoundException	java.io.FileNotFoundException
    //   149	3	6	arrayOfByte1	byte[]
    //   154	3	6	localIOException	java.io.IOException
    //   94	51	7	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   101	19	8	arrayOfByte2	byte[]
    // Exception table:
    //   from	to	target	type
    //   0	45	130	java/io/FileNotFoundException
    //   45	103	130	java/io/FileNotFoundException
    //   103	112	130	java/io/FileNotFoundException
    //   117	127	130	java/io/FileNotFoundException
    //   139	151	130	java/io/FileNotFoundException
    //   0	45	154	java/io/IOException
    //   45	103	154	java/io/IOException
    //   103	112	154	java/io/IOException
    //   117	127	154	java/io/IOException
    //   139	151	154	java/io/IOException
  }
  
  public void a(FromServiceMsg paramFromServiceMsg)
  {
    logParams.LogParams localLogParams = new logParams.LogParams();
    try
    {
      localLogParams.mergeFrom(e.a(paramFromServiceMsg));
      new p(this, localLogParams).start();
      return;
    }
    catch (InvalidProtocolBufferMicroException paramFromServiceMsg)
    {
      paramFromServiceMsg.printStackTrace();
    }
  }
  
  /* Error */
  void a(java.io.File paramFile, java.util.zip.ZipOutputStream paramZipOutputStream)
  {
    // Byte code:
    //   0: new 333	java/io/FileInputStream
    //   3: dup
    //   4: aload_1
    //   5: invokespecial 360	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   8: astore 5
    //   10: new 362	java/io/DataInputStream
    //   13: dup
    //   14: new 364	java/io/BufferedInputStream
    //   17: dup
    //   18: aload 5
    //   20: invokespecial 367	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   23: invokespecial 368	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   26: astore 4
    //   28: aload 4
    //   30: astore_3
    //   31: aload_2
    //   32: new 370	java/util/zip/ZipEntry
    //   35: dup
    //   36: aload_1
    //   37: invokevirtual 373	java/io/File:getName	()Ljava/lang/String;
    //   40: invokespecial 374	java/util/zip/ZipEntry:<init>	(Ljava/lang/String;)V
    //   43: invokevirtual 378	java/util/zip/ZipOutputStream:putNextEntry	(Ljava/util/zip/ZipEntry;)V
    //   46: aload 4
    //   48: astore_3
    //   49: sipush 1024
    //   52: newarray <illegal type>
    //   54: astore_1
    //   55: aload 4
    //   57: astore_3
    //   58: aload 5
    //   60: aload_1
    //   61: invokevirtual 335	java/io/FileInputStream:read	([B)I
    //   64: istore 6
    //   66: iload 6
    //   68: iconst_m1
    //   69: if_icmpeq +65 -> 134
    //   72: aload 4
    //   74: astore_3
    //   75: aload_2
    //   76: aload_1
    //   77: iconst_0
    //   78: iload 6
    //   80: invokevirtual 379	java/util/zip/ZipOutputStream:write	([BII)V
    //   83: aload 4
    //   85: astore_3
    //   86: aload_2
    //   87: invokevirtual 380	java/util/zip/ZipOutputStream:flush	()V
    //   90: goto -35 -> 55
    //   93: astore_1
    //   94: aload 4
    //   96: astore_3
    //   97: getstatic 25	com/tencent/qalsdk/sdk/o:b	Ljava/lang/String;
    //   100: new 31	java/lang/StringBuilder
    //   103: dup
    //   104: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   107: ldc_w 382
    //   110: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   113: aload_1
    //   114: invokevirtual 251	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   117: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   120: invokestatic 384	com/tencent/qalsdk/util/QLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   123: aload 4
    //   125: ifnull +8 -> 133
    //   128: aload 4
    //   130: invokevirtual 385	java/io/DataInputStream:close	()V
    //   133: return
    //   134: aload 4
    //   136: ifnull -3 -> 133
    //   139: aload 4
    //   141: invokevirtual 385	java/io/DataInputStream:close	()V
    //   144: return
    //   145: astore_1
    //   146: getstatic 25	com/tencent/qalsdk/sdk/o:b	Ljava/lang/String;
    //   149: new 31	java/lang/StringBuilder
    //   152: dup
    //   153: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   156: ldc_w 382
    //   159: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: aload_1
    //   163: invokevirtual 251	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   166: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   169: invokestatic 384	com/tencent/qalsdk/util/QLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   172: return
    //   173: astore_1
    //   174: getstatic 25	com/tencent/qalsdk/sdk/o:b	Ljava/lang/String;
    //   177: new 31	java/lang/StringBuilder
    //   180: dup
    //   181: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   184: ldc_w 382
    //   187: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   190: aload_1
    //   191: invokevirtual 251	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   194: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   197: invokestatic 384	com/tencent/qalsdk/util/QLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   200: return
    //   201: astore_1
    //   202: aconst_null
    //   203: astore 4
    //   205: aload 4
    //   207: astore_3
    //   208: getstatic 25	com/tencent/qalsdk/sdk/o:b	Ljava/lang/String;
    //   211: new 31	java/lang/StringBuilder
    //   214: dup
    //   215: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   218: ldc_w 382
    //   221: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   224: aload_1
    //   225: invokevirtual 251	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   228: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   231: invokestatic 384	com/tencent/qalsdk/util/QLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   234: aload 4
    //   236: ifnull -103 -> 133
    //   239: aload 4
    //   241: invokevirtual 385	java/io/DataInputStream:close	()V
    //   244: return
    //   245: astore_1
    //   246: getstatic 25	com/tencent/qalsdk/sdk/o:b	Ljava/lang/String;
    //   249: new 31	java/lang/StringBuilder
    //   252: dup
    //   253: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   256: ldc_w 382
    //   259: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   262: aload_1
    //   263: invokevirtual 251	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   266: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   269: invokestatic 384	com/tencent/qalsdk/util/QLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   272: return
    //   273: astore_1
    //   274: aconst_null
    //   275: astore_3
    //   276: aload_3
    //   277: ifnull +7 -> 284
    //   280: aload_3
    //   281: invokevirtual 385	java/io/DataInputStream:close	()V
    //   284: aload_1
    //   285: athrow
    //   286: astore_2
    //   287: getstatic 25	com/tencent/qalsdk/sdk/o:b	Ljava/lang/String;
    //   290: new 31	java/lang/StringBuilder
    //   293: dup
    //   294: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   297: ldc_w 382
    //   300: invokevirtual 43	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   303: aload_2
    //   304: invokevirtual 251	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   307: invokevirtual 48	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   310: invokestatic 384	com/tencent/qalsdk/util/QLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   313: goto -29 -> 284
    //   316: astore_1
    //   317: goto -41 -> 276
    //   320: astore_1
    //   321: goto -116 -> 205
    //   324: astore_1
    //   325: aconst_null
    //   326: astore 4
    //   328: goto -234 -> 94
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	331	0	this	o
    //   0	331	1	paramFile	java.io.File
    //   0	331	2	paramZipOutputStream	java.util.zip.ZipOutputStream
    //   30	251	3	localDataInputStream1	java.io.DataInputStream
    //   26	301	4	localDataInputStream2	java.io.DataInputStream
    //   8	51	5	localFileInputStream	java.io.FileInputStream
    //   64	15	6	i	int
    // Exception table:
    //   from	to	target	type
    //   31	46	93	java/io/FileNotFoundException
    //   49	55	93	java/io/FileNotFoundException
    //   58	66	93	java/io/FileNotFoundException
    //   75	83	93	java/io/FileNotFoundException
    //   86	90	93	java/io/FileNotFoundException
    //   139	144	145	java/io/IOException
    //   128	133	173	java/io/IOException
    //   0	28	201	java/io/IOException
    //   239	244	245	java/io/IOException
    //   0	28	273	finally
    //   280	284	286	java/io/IOException
    //   31	46	316	finally
    //   49	55	316	finally
    //   58	66	316	finally
    //   75	83	316	finally
    //   86	90	316	finally
    //   97	123	316	finally
    //   208	234	316	finally
    //   31	46	320	java/io/IOException
    //   49	55	320	java/io/IOException
    //   58	66	320	java/io/IOException
    //   75	83	320	java/io/IOException
    //   86	90	320	java/io/IOException
    //   0	28	324	java/io/FileNotFoundException
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\sdk\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */