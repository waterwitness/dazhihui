package com.baidu.location.c;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.baidu.location.BDLocation;
import com.baidu.location.Jni;
import com.baidu.location.Poi;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

final class a
{
  private final i a;
  private int b;
  private double c;
  private double d;
  private Long e;
  private final c f;
  private final c g;
  private final SQLiteDatabase h;
  private final SQLiteDatabase i;
  private StringBuffer j;
  private StringBuffer k;
  private HashSet l;
  private ConcurrentHashMap m;
  private ConcurrentHashMap n;
  private StringBuffer o;
  private boolean p;
  
  /* Error */
  a(i parami)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: invokespecial 37	java/lang/Object:<init>	()V
    //   6: aload_0
    //   7: aload_1
    //   8: putfield 39	com/baidu/location/c/a:a	Lcom/baidu/location/c/i;
    //   11: aload_0
    //   12: iconst_0
    //   13: putfield 41	com/baidu/location/c/a:p	Z
    //   16: aload_0
    //   17: new 43	com/baidu/location/c/c
    //   20: dup
    //   21: aload_0
    //   22: aload_0
    //   23: iconst_1
    //   24: invokespecial 46	com/baidu/location/c/c:<init>	(Lcom/baidu/location/c/a;Lcom/baidu/location/c/a;Z)V
    //   27: putfield 48	com/baidu/location/c/a:f	Lcom/baidu/location/c/c;
    //   30: aload_0
    //   31: new 43	com/baidu/location/c/c
    //   34: dup
    //   35: aload_0
    //   36: aload_0
    //   37: iconst_0
    //   38: invokespecial 46	com/baidu/location/c/c:<init>	(Lcom/baidu/location/c/a;Lcom/baidu/location/c/a;Z)V
    //   41: putfield 50	com/baidu/location/c/a:g	Lcom/baidu/location/c/c;
    //   44: aload_0
    //   45: new 52	java/lang/StringBuffer
    //   48: dup
    //   49: invokespecial 53	java/lang/StringBuffer:<init>	()V
    //   52: putfield 55	com/baidu/location/c/a:o	Ljava/lang/StringBuffer;
    //   55: aload_0
    //   56: aconst_null
    //   57: putfield 57	com/baidu/location/c/a:j	Ljava/lang/StringBuffer;
    //   60: aload_0
    //   61: aconst_null
    //   62: putfield 59	com/baidu/location/c/a:k	Ljava/lang/StringBuffer;
    //   65: aload_0
    //   66: new 61	java/util/HashSet
    //   69: dup
    //   70: invokespecial 62	java/util/HashSet:<init>	()V
    //   73: putfield 64	com/baidu/location/c/a:l	Ljava/util/HashSet;
    //   76: aload_0
    //   77: new 66	java/util/concurrent/ConcurrentHashMap
    //   80: dup
    //   81: invokespecial 67	java/util/concurrent/ConcurrentHashMap:<init>	()V
    //   84: putfield 69	com/baidu/location/c/a:m	Ljava/util/concurrent/ConcurrentHashMap;
    //   87: aload_0
    //   88: new 66	java/util/concurrent/ConcurrentHashMap
    //   91: dup
    //   92: invokespecial 67	java/util/concurrent/ConcurrentHashMap:<init>	()V
    //   95: putfield 71	com/baidu/location/c/a:n	Ljava/util/concurrent/ConcurrentHashMap;
    //   98: new 73	java/io/File
    //   101: dup
    //   102: aload_0
    //   103: getfield 39	com/baidu/location/c/a:a	Lcom/baidu/location/c/i;
    //   106: invokevirtual 78	com/baidu/location/c/i:c	()Ljava/io/File;
    //   109: ldc 80
    //   111: invokespecial 83	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   114: astore_1
    //   115: aload_1
    //   116: invokevirtual 87	java/io/File:exists	()Z
    //   119: ifne +8 -> 127
    //   122: aload_1
    //   123: invokevirtual 90	java/io/File:createNewFile	()Z
    //   126: pop
    //   127: aload_1
    //   128: aconst_null
    //   129: invokestatic 96	android/database/sqlite/SQLiteDatabase:openOrCreateDatabase	(Ljava/io/File;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;
    //   132: astore_1
    //   133: aload_0
    //   134: aload_1
    //   135: putfield 98	com/baidu/location/c/a:h	Landroid/database/sqlite/SQLiteDatabase;
    //   138: aload_0
    //   139: getfield 98	com/baidu/location/c/a:h	Landroid/database/sqlite/SQLiteDatabase;
    //   142: ifnull +21 -> 163
    //   145: aload_0
    //   146: getfield 98	com/baidu/location/c/a:h	Landroid/database/sqlite/SQLiteDatabase;
    //   149: ldc 100
    //   151: invokevirtual 104	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   154: aload_0
    //   155: getfield 98	com/baidu/location/c/a:h	Landroid/database/sqlite/SQLiteDatabase;
    //   158: ldc 106
    //   160: invokevirtual 104	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   163: new 73	java/io/File
    //   166: dup
    //   167: aload_0
    //   168: getfield 39	com/baidu/location/c/a:a	Lcom/baidu/location/c/i;
    //   171: invokevirtual 78	com/baidu/location/c/i:c	()Ljava/io/File;
    //   174: ldc 108
    //   176: invokespecial 83	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   179: astore_1
    //   180: aload_1
    //   181: invokevirtual 87	java/io/File:exists	()Z
    //   184: ifne +8 -> 192
    //   187: aload_1
    //   188: invokevirtual 90	java/io/File:createNewFile	()Z
    //   191: pop
    //   192: aload_1
    //   193: aconst_null
    //   194: invokestatic 96	android/database/sqlite/SQLiteDatabase:openOrCreateDatabase	(Ljava/io/File;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;
    //   197: astore_1
    //   198: aload_0
    //   199: aload_1
    //   200: putfield 110	com/baidu/location/c/a:i	Landroid/database/sqlite/SQLiteDatabase;
    //   203: aload_0
    //   204: getfield 110	com/baidu/location/c/a:i	Landroid/database/sqlite/SQLiteDatabase;
    //   207: ifnull +21 -> 228
    //   210: aload_0
    //   211: getfield 110	com/baidu/location/c/a:i	Landroid/database/sqlite/SQLiteDatabase;
    //   214: ldc 112
    //   216: invokevirtual 104	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   219: aload_0
    //   220: getfield 110	com/baidu/location/c/a:i	Landroid/database/sqlite/SQLiteDatabase;
    //   223: ldc 114
    //   225: invokevirtual 104	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   228: return
    //   229: astore_1
    //   230: aconst_null
    //   231: astore_1
    //   232: goto -99 -> 133
    //   235: astore_1
    //   236: return
    //   237: astore_1
    //   238: aload_2
    //   239: astore_1
    //   240: goto -42 -> 198
    //   243: astore_1
    //   244: goto -81 -> 163
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	247	0	this	a
    //   0	247	1	parami	i
    //   1	238	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   98	127	229	java/lang/Exception
    //   127	133	229	java/lang/Exception
    //   210	228	235	java/lang/Exception
    //   163	192	237	java/lang/Exception
    //   192	198	237	java/lang/Exception
    //   145	163	243	java/lang/Exception
  }
  
  private double a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    double d2 = Math.toRadians(paramDouble1);
    Math.toRadians(paramDouble2);
    double d1 = Math.toRadians(paramDouble3);
    Math.toRadians(paramDouble4);
    paramDouble2 = Math.toRadians(paramDouble4 - paramDouble2);
    paramDouble3 = Math.toRadians(paramDouble3 - paramDouble1);
    paramDouble1 = Math.sin(paramDouble3 / 2.0D);
    paramDouble3 = Math.sin(paramDouble3 / 2.0D);
    paramDouble4 = Math.cos(d2);
    d1 = Math.cos(d1);
    d2 = Math.sin(paramDouble2 / 2.0D);
    paramDouble1 = Math.sin(paramDouble2 / 2.0D) * (paramDouble4 * d1 * d2) + paramDouble3 * paramDouble1;
    return Math.atan2(Math.sqrt(paramDouble1), Math.sqrt(1.0D - paramDouble1)) * 2.0D * 6378137.0D;
  }
  
  private int a(ArrayList paramArrayList, double paramDouble)
  {
    int i3;
    if (paramArrayList.size() == 0)
    {
      i3 = 0;
      return i3;
    }
    int i1 = 0;
    label16:
    double d1;
    int i2;
    if (paramArrayList.size() >= 3)
    {
      double d2 = 0.0D;
      d1 = 0.0D;
      i2 = 0;
      while (i2 < paramArrayList.size())
      {
        d2 += ((d)paramArrayList.get(i2)).a;
        d1 += ((d)paramArrayList.get(i2)).b;
        i2 += 1;
      }
      double d3 = d2 / paramArrayList.size();
      double d4 = d1 / paramArrayList.size();
      i2 = 0;
      i3 = -1;
      d1 = -1.0D;
      label116:
      if (i2 < paramArrayList.size())
      {
        d2 = a(d4, d3, ((d)paramArrayList.get(i2)).b, ((d)paramArrayList.get(i2)).a);
        if (d2 <= d1) {
          break label240;
        }
        i3 = i2;
        d1 = d2;
      }
    }
    label240:
    for (;;)
    {
      i2 += 1;
      break label116;
      if ((d1 > paramDouble) && (i3 >= 0) && (i3 < paramArrayList.size()))
      {
        paramArrayList.remove(i3);
        i2 = 1;
        i1 += 1;
      }
      for (;;)
      {
        i3 = i1;
        if (i2 != 1) {
          break;
        }
        break label16;
        i2 = 0;
      }
    }
  }
  
  /* Error */
  private BDLocation a(Long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: putfield 41	com/baidu/location/c/a:p	Z
    //   5: iconst_0
    //   6: istore 21
    //   8: iconst_0
    //   9: istore 20
    //   11: dconst_0
    //   12: dstore 12
    //   14: dconst_0
    //   15: dstore 10
    //   17: iconst_0
    //   18: istore 23
    //   20: iconst_0
    //   21: istore 22
    //   23: aload_0
    //   24: getfield 166	com/baidu/location/c/a:e	Ljava/lang/Long;
    //   27: ifnull +81 -> 108
    //   30: aload_0
    //   31: getfield 166	com/baidu/location/c/a:e	Ljava/lang/Long;
    //   34: aload_1
    //   35: invokevirtual 172	java/lang/Long:equals	(Ljava/lang/Object;)Z
    //   38: ifeq +70 -> 108
    //   41: iconst_1
    //   42: istore 21
    //   44: aload_0
    //   45: getfield 174	com/baidu/location/c/a:c	D
    //   48: dstore 10
    //   50: aload_0
    //   51: getfield 176	com/baidu/location/c/a:d	D
    //   54: dstore 12
    //   56: aload_0
    //   57: getfield 178	com/baidu/location/c/a:b	I
    //   60: istore 20
    //   62: iload 21
    //   64: ifeq +704 -> 768
    //   67: new 180	com/baidu/location/BDLocation
    //   70: dup
    //   71: invokespecial 181	com/baidu/location/BDLocation:<init>	()V
    //   74: astore_1
    //   75: aload_1
    //   76: iload 20
    //   78: i2f
    //   79: invokevirtual 184	com/baidu/location/BDLocation:b	(F)V
    //   82: aload_1
    //   83: dload 12
    //   85: invokevirtual 187	com/baidu/location/BDLocation:a	(D)V
    //   88: aload_1
    //   89: dload 10
    //   91: invokevirtual 189	com/baidu/location/BDLocation:b	(D)V
    //   94: aload_1
    //   95: ldc -65
    //   97: invokevirtual 193	com/baidu/location/BDLocation:e	(Ljava/lang/String;)V
    //   100: aload_1
    //   101: bipush 66
    //   103: invokevirtual 196	com/baidu/location/BDLocation:a	(I)V
    //   106: aload_1
    //   107: areturn
    //   108: aconst_null
    //   109: astore 15
    //   111: getstatic 202	java/util/Locale:US	Ljava/util/Locale;
    //   114: ldc -52
    //   116: iconst_3
    //   117: anewarray 4	java/lang/Object
    //   120: dup
    //   121: iconst_0
    //   122: aload_1
    //   123: aastore
    //   124: dup
    //   125: iconst_1
    //   126: ldc -51
    //   128: invokestatic 211	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   131: aastore
    //   132: dup
    //   133: iconst_2
    //   134: invokestatic 217	java/lang/System:currentTimeMillis	()J
    //   137: ldc2_w 218
    //   140: ldiv
    //   141: invokestatic 222	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   144: aastore
    //   145: invokestatic 228	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   148: astore 14
    //   150: iload 23
    //   152: istore 18
    //   154: dload 10
    //   156: dstore_2
    //   157: dload 12
    //   159: dstore 4
    //   161: iload 21
    //   163: istore 17
    //   165: aload_0
    //   166: getfield 98	com/baidu/location/c/a:h	Landroid/database/sqlite/SQLiteDatabase;
    //   169: aload 14
    //   171: aconst_null
    //   172: invokevirtual 232	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   175: astore 14
    //   177: iload 22
    //   179: istore 19
    //   181: dload 10
    //   183: dstore 8
    //   185: dload 12
    //   187: dstore 6
    //   189: iload 20
    //   191: istore 16
    //   193: aload 14
    //   195: ifnull +403 -> 598
    //   198: iload 22
    //   200: istore 19
    //   202: dload 10
    //   204: dstore 8
    //   206: dload 12
    //   208: dstore 6
    //   210: iload 20
    //   212: istore 16
    //   214: aload 14
    //   216: astore 15
    //   218: iload 23
    //   220: istore 18
    //   222: dload 10
    //   224: dstore_2
    //   225: dload 12
    //   227: dstore 4
    //   229: iload 21
    //   231: istore 17
    //   233: aload 14
    //   235: invokeinterface 237 1 0
    //   240: ifeq +358 -> 598
    //   243: iload 22
    //   245: istore 19
    //   247: dload 10
    //   249: dstore 8
    //   251: dload 12
    //   253: dstore 6
    //   255: iload 20
    //   257: istore 16
    //   259: aload 14
    //   261: astore 15
    //   263: iload 23
    //   265: istore 18
    //   267: dload 10
    //   269: dstore_2
    //   270: dload 12
    //   272: dstore 4
    //   274: iload 21
    //   276: istore 17
    //   278: aload 14
    //   280: aload 14
    //   282: ldc -65
    //   284: invokeinterface 241 2 0
    //   289: invokeinterface 245 2 0
    //   294: dconst_0
    //   295: dcmpl
    //   296: ifle +302 -> 598
    //   299: iconst_1
    //   300: istore 22
    //   302: iconst_1
    //   303: istore 20
    //   305: aload 14
    //   307: astore 15
    //   309: iload 22
    //   311: istore 18
    //   313: dload 10
    //   315: dstore_2
    //   316: dload 12
    //   318: dstore 4
    //   320: iload 21
    //   322: istore 17
    //   324: aload 14
    //   326: aload 14
    //   328: ldc -9
    //   330: invokeinterface 241 2 0
    //   335: invokeinterface 245 2 0
    //   340: dstore 6
    //   342: aload 14
    //   344: astore 15
    //   346: iload 22
    //   348: istore 18
    //   350: dload 10
    //   352: dstore_2
    //   353: dload 6
    //   355: dstore 4
    //   357: iload 21
    //   359: istore 17
    //   361: aload 14
    //   363: aload 14
    //   365: ldc -7
    //   367: invokeinterface 241 2 0
    //   372: invokeinterface 245 2 0
    //   377: dstore 8
    //   379: aload 14
    //   381: astore 15
    //   383: iload 22
    //   385: istore 18
    //   387: dload 8
    //   389: dstore_2
    //   390: dload 6
    //   392: dstore 4
    //   394: iload 21
    //   396: istore 17
    //   398: aload 14
    //   400: aload 14
    //   402: ldc -5
    //   404: invokeinterface 241 2 0
    //   409: invokeinterface 255 2 0
    //   414: istore 19
    //   416: aload 14
    //   418: astore 15
    //   420: iload 22
    //   422: istore 18
    //   424: dload 8
    //   426: dstore_2
    //   427: dload 6
    //   429: dstore 4
    //   431: iload 19
    //   433: istore 17
    //   435: aload 14
    //   437: aload 14
    //   439: ldc_w 257
    //   442: invokeinterface 241 2 0
    //   447: invokeinterface 255 2 0
    //   452: ldc_w 258
    //   455: iadd
    //   456: i2l
    //   457: invokestatic 217	java/lang/System:currentTimeMillis	()J
    //   460: ldc2_w 218
    //   463: ldiv
    //   464: lcmp
    //   465: ifge +314 -> 779
    //   468: aload 14
    //   470: astore 15
    //   472: iload 22
    //   474: istore 18
    //   476: dload 8
    //   478: dstore_2
    //   479: dload 6
    //   481: dstore 4
    //   483: iload 19
    //   485: istore 17
    //   487: aload_0
    //   488: iconst_1
    //   489: putfield 41	com/baidu/location/c/a:p	Z
    //   492: goto +287 -> 779
    //   495: aload 14
    //   497: astore 15
    //   499: iload 22
    //   501: istore 18
    //   503: dload 8
    //   505: dstore_2
    //   506: dload 6
    //   508: dstore 4
    //   510: iload 16
    //   512: istore 17
    //   514: aload_0
    //   515: dload 6
    //   517: putfield 174	com/baidu/location/c/a:c	D
    //   520: aload 14
    //   522: astore 15
    //   524: iload 22
    //   526: istore 18
    //   528: dload 8
    //   530: dstore_2
    //   531: dload 6
    //   533: dstore 4
    //   535: iload 16
    //   537: istore 17
    //   539: aload_0
    //   540: dload 8
    //   542: putfield 176	com/baidu/location/c/a:d	D
    //   545: aload 14
    //   547: astore 15
    //   549: iload 22
    //   551: istore 18
    //   553: dload 8
    //   555: dstore_2
    //   556: dload 6
    //   558: dstore 4
    //   560: iload 16
    //   562: istore 17
    //   564: aload_0
    //   565: iload 16
    //   567: putfield 178	com/baidu/location/c/a:b	I
    //   570: aload 14
    //   572: astore 15
    //   574: iload 22
    //   576: istore 18
    //   578: dload 8
    //   580: dstore_2
    //   581: dload 6
    //   583: dstore 4
    //   585: iload 16
    //   587: istore 17
    //   589: aload_0
    //   590: aload_1
    //   591: putfield 166	com/baidu/location/c/a:e	Ljava/lang/Long;
    //   594: iload 20
    //   596: istore 19
    //   598: iload 19
    //   600: istore 21
    //   602: dload 8
    //   604: dstore 12
    //   606: dload 6
    //   608: dstore 10
    //   610: iload 16
    //   612: istore 20
    //   614: aload 14
    //   616: ifnull -554 -> 62
    //   619: aload 14
    //   621: invokeinterface 261 1 0
    //   626: iload 19
    //   628: istore 21
    //   630: dload 8
    //   632: dstore 12
    //   634: dload 6
    //   636: dstore 10
    //   638: iload 16
    //   640: istore 20
    //   642: goto -580 -> 62
    //   645: astore_1
    //   646: iload 19
    //   648: istore 21
    //   650: dload 8
    //   652: dstore 12
    //   654: dload 6
    //   656: dstore 10
    //   658: iload 16
    //   660: istore 20
    //   662: goto -600 -> 62
    //   665: iload 19
    //   667: istore 16
    //   669: sipush 2000
    //   672: iload 19
    //   674: if_icmpge -179 -> 495
    //   677: sipush 2000
    //   680: istore 16
    //   682: goto -187 -> 495
    //   685: astore_1
    //   686: iload 18
    //   688: istore 21
    //   690: dload_2
    //   691: dstore 12
    //   693: dload 4
    //   695: dstore 10
    //   697: iload 17
    //   699: istore 20
    //   701: aload 15
    //   703: ifnull -641 -> 62
    //   706: aload 15
    //   708: invokeinterface 261 1 0
    //   713: iload 18
    //   715: istore 21
    //   717: dload_2
    //   718: dstore 12
    //   720: dload 4
    //   722: dstore 10
    //   724: iload 17
    //   726: istore 20
    //   728: goto -666 -> 62
    //   731: astore_1
    //   732: iload 18
    //   734: istore 21
    //   736: dload_2
    //   737: dstore 12
    //   739: dload 4
    //   741: dstore 10
    //   743: iload 17
    //   745: istore 20
    //   747: goto -685 -> 62
    //   750: astore_1
    //   751: aconst_null
    //   752: astore 14
    //   754: aload 14
    //   756: ifnull +10 -> 766
    //   759: aload 14
    //   761: invokeinterface 261 1 0
    //   766: aload_1
    //   767: athrow
    //   768: aconst_null
    //   769: areturn
    //   770: astore 14
    //   772: goto -6 -> 766
    //   775: astore_1
    //   776: goto -22 -> 754
    //   779: iload 19
    //   781: sipush 300
    //   784: if_icmpge -119 -> 665
    //   787: sipush 300
    //   790: istore 16
    //   792: goto -297 -> 495
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	795	0	this	a
    //   0	795	1	paramLong	Long
    //   156	581	2	d1	double
    //   159	581	4	d2	double
    //   187	468	6	d3	double
    //   183	468	8	d4	double
    //   15	727	10	d5	double
    //   12	726	12	d6	double
    //   148	612	14	localObject1	Object
    //   770	1	14	localException	Exception
    //   109	598	15	localObject2	Object
    //   191	600	16	i1	int
    //   163	581	17	i2	int
    //   152	581	18	i3	int
    //   179	606	19	i4	int
    //   9	737	20	i5	int
    //   6	729	21	i6	int
    //   21	554	22	i7	int
    //   18	246	23	i8	int
    // Exception table:
    //   from	to	target	type
    //   619	626	645	java/lang/Exception
    //   165	177	685	java/lang/Exception
    //   233	243	685	java/lang/Exception
    //   278	299	685	java/lang/Exception
    //   324	342	685	java/lang/Exception
    //   361	379	685	java/lang/Exception
    //   398	416	685	java/lang/Exception
    //   435	468	685	java/lang/Exception
    //   487	492	685	java/lang/Exception
    //   514	520	685	java/lang/Exception
    //   539	545	685	java/lang/Exception
    //   564	570	685	java/lang/Exception
    //   589	594	685	java/lang/Exception
    //   706	713	731	java/lang/Exception
    //   165	177	750	finally
    //   759	766	770	java/lang/Exception
    //   233	243	775	finally
    //   278	299	775	finally
    //   324	342	775	finally
    //   361	379	775	finally
    //   398	416	775	finally
    //   435	468	775	finally
    //   487	492	775	finally
    //   514	520	775	finally
    //   539	545	775	finally
    //   564	570	775	finally
    //   589	594	775	finally
  }
  
  /* Error */
  private BDLocation a(LinkedHashMap paramLinkedHashMap, BDLocation paramBDLocation, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 55	com/baidu/location/c/a:o	Ljava/lang/StringBuffer;
    //   4: iconst_0
    //   5: invokevirtual 265	java/lang/StringBuffer:setLength	(I)V
    //   8: dconst_0
    //   9: dstore 10
    //   11: dconst_0
    //   12: dstore 8
    //   14: aload_2
    //   15: ifnull +1376 -> 1391
    //   18: aload_2
    //   19: invokevirtual 268	com/baidu/location/BDLocation:c	()D
    //   22: dstore 8
    //   24: aload_2
    //   25: invokevirtual 270	com/baidu/location/BDLocation:d	()D
    //   28: dstore 10
    //   30: iconst_1
    //   31: istore 33
    //   33: new 52	java/lang/StringBuffer
    //   36: dup
    //   37: invokespecial 53	java/lang/StringBuffer:<init>	()V
    //   40: astore 26
    //   42: aload_1
    //   43: invokevirtual 276	java/util/LinkedHashMap:entrySet	()Ljava/util/Set;
    //   46: invokeinterface 282 1 0
    //   51: astore 27
    //   53: iconst_0
    //   54: istore 30
    //   56: iconst_1
    //   57: istore 29
    //   59: iload 30
    //   61: aload_1
    //   62: invokevirtual 283	java/util/LinkedHashMap:size	()I
    //   65: bipush 30
    //   67: invokestatic 287	java/lang/Math:min	(II)I
    //   70: if_icmpge +131 -> 201
    //   73: aload 27
    //   75: invokeinterface 293 1 0
    //   80: checkcast 295	java/util/Map$Entry
    //   83: astore_2
    //   84: aload_2
    //   85: invokeinterface 298 1 0
    //   90: checkcast 224	java/lang/String
    //   93: astore 28
    //   95: aload_2
    //   96: invokeinterface 301 1 0
    //   101: checkcast 207	java/lang/Integer
    //   104: astore 25
    //   106: aload 25
    //   108: astore_2
    //   109: aload 25
    //   111: invokevirtual 304	java/lang/Integer:intValue	()I
    //   114: ifge +13 -> 127
    //   117: aload 25
    //   119: invokevirtual 304	java/lang/Integer:intValue	()I
    //   122: ineg
    //   123: invokestatic 211	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   126: astore_2
    //   127: aload 28
    //   129: invokestatic 309	com/baidu/location/Jni:d	(Ljava/lang/String;)Ljava/lang/Long;
    //   132: astore 25
    //   134: aload 25
    //   136: ifnonnull +12 -> 148
    //   139: iload 30
    //   141: iconst_1
    //   142: iadd
    //   143: istore 30
    //   145: goto -86 -> 59
    //   148: aload_0
    //   149: getfield 71	com/baidu/location/c/a:n	Ljava/util/concurrent/ConcurrentHashMap;
    //   152: aload 25
    //   154: aload 28
    //   156: invokevirtual 313	java/util/concurrent/ConcurrentHashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   159: pop
    //   160: iload 29
    //   162: ifeq +28 -> 190
    //   165: iconst_0
    //   166: istore 29
    //   168: aload_0
    //   169: getfield 69	com/baidu/location/c/a:m	Ljava/util/concurrent/ConcurrentHashMap;
    //   172: aload 25
    //   174: aload_2
    //   175: invokevirtual 313	java/util/concurrent/ConcurrentHashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   178: pop
    //   179: aload 26
    //   181: aload 25
    //   183: invokevirtual 317	java/lang/StringBuffer:append	(Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   186: pop
    //   187: goto -48 -> 139
    //   190: aload 26
    //   192: bipush 44
    //   194: invokevirtual 320	java/lang/StringBuffer:append	(C)Ljava/lang/StringBuffer;
    //   197: pop
    //   198: goto -30 -> 168
    //   201: getstatic 202	java/util/Locale:US	Ljava/util/Locale;
    //   204: ldc_w 322
    //   207: iconst_3
    //   208: anewarray 4	java/lang/Object
    //   211: dup
    //   212: iconst_0
    //   213: aload 26
    //   215: aastore
    //   216: dup
    //   217: iconst_1
    //   218: ldc_w 323
    //   221: invokestatic 211	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   224: aastore
    //   225: dup
    //   226: iconst_2
    //   227: invokestatic 217	java/lang/System:currentTimeMillis	()J
    //   230: ldc2_w 218
    //   233: ldiv
    //   234: invokestatic 222	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   237: aastore
    //   238: invokestatic 228	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   241: astore 25
    //   243: aconst_null
    //   244: astore_2
    //   245: aload_0
    //   246: getfield 98	com/baidu/location/c/a:h	Landroid/database/sqlite/SQLiteDatabase;
    //   249: aload 25
    //   251: aconst_null
    //   252: invokevirtual 232	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   255: astore 25
    //   257: aload 25
    //   259: astore_2
    //   260: aload_2
    //   261: ifnull +1116 -> 1377
    //   264: aload_2
    //   265: invokeinterface 237 1 0
    //   270: ifeq +1107 -> 1377
    //   273: new 142	java/util/ArrayList
    //   276: dup
    //   277: invokespecial 324	java/util/ArrayList:<init>	()V
    //   280: astore 25
    //   282: aload_2
    //   283: invokeinterface 327 1 0
    //   288: ifne +477 -> 765
    //   291: aload_2
    //   292: iconst_0
    //   293: invokeinterface 331 2 0
    //   298: invokestatic 222	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   301: astore 26
    //   303: aload_2
    //   304: iconst_1
    //   305: invokeinterface 245 2 0
    //   310: dstore 6
    //   312: aload_2
    //   313: iconst_2
    //   314: invokeinterface 245 2 0
    //   319: dstore 12
    //   321: aload_2
    //   322: iconst_3
    //   323: invokeinterface 255 2 0
    //   328: istore 29
    //   330: aload_2
    //   331: iconst_4
    //   332: invokeinterface 245 2 0
    //   337: dstore 4
    //   339: aload_2
    //   340: iconst_5
    //   341: invokeinterface 255 2 0
    //   346: istore 30
    //   348: aload_0
    //   349: getfield 64	com/baidu/location/c/a:l	Ljava/util/HashSet;
    //   352: aload 26
    //   354: invokevirtual 334	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   357: pop
    //   358: iload 30
    //   360: ldc_w 258
    //   363: iadd
    //   364: i2l
    //   365: invokestatic 217	java/lang/System:currentTimeMillis	()J
    //   368: ldc2_w 218
    //   371: ldiv
    //   372: lcmp
    //   373: ifge +71 -> 444
    //   376: aload_0
    //   377: getfield 55	com/baidu/location/c/a:o	Ljava/lang/StringBuffer;
    //   380: invokevirtual 337	java/lang/StringBuffer:length	()I
    //   383: ifle +14 -> 397
    //   386: aload_0
    //   387: getfield 55	com/baidu/location/c/a:o	Ljava/lang/StringBuffer;
    //   390: ldc_w 339
    //   393: invokevirtual 342	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   396: pop
    //   397: aload_0
    //   398: getfield 55	com/baidu/location/c/a:o	Ljava/lang/StringBuffer;
    //   401: getstatic 202	java/util/Locale:US	Ljava/util/Locale;
    //   404: ldc_w 344
    //   407: iconst_3
    //   408: anewarray 4	java/lang/Object
    //   411: dup
    //   412: iconst_0
    //   413: aload 26
    //   415: aastore
    //   416: dup
    //   417: iconst_1
    //   418: aload_0
    //   419: getfield 71	com/baidu/location/c/a:n	Ljava/util/concurrent/ConcurrentHashMap;
    //   422: aload 26
    //   424: invokevirtual 347	java/util/concurrent/ConcurrentHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   427: aastore
    //   428: dup
    //   429: iconst_2
    //   430: ldc_w 348
    //   433: invokestatic 211	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   436: aastore
    //   437: invokestatic 228	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   440: invokevirtual 342	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   443: pop
    //   444: dload 4
    //   446: dconst_0
    //   447: dcmpg
    //   448: ifgt +114 -> 562
    //   451: aload_2
    //   452: invokeinterface 351 1 0
    //   457: pop
    //   458: goto -176 -> 282
    //   461: astore_1
    //   462: aload_2
    //   463: astore_1
    //   464: iconst_0
    //   465: istore_3
    //   466: dconst_0
    //   467: dstore 6
    //   469: dconst_0
    //   470: dstore 4
    //   472: iconst_0
    //   473: istore 29
    //   475: iload_3
    //   476: istore 30
    //   478: iload 29
    //   480: istore 31
    //   482: dload 4
    //   484: dstore 8
    //   486: dload 6
    //   488: dstore 10
    //   490: aload_1
    //   491: ifnull +24 -> 515
    //   494: aload_1
    //   495: invokeinterface 261 1 0
    //   500: dload 6
    //   502: dstore 10
    //   504: dload 4
    //   506: dstore 8
    //   508: iload 29
    //   510: istore 31
    //   512: iload_3
    //   513: istore 30
    //   515: iload 30
    //   517: ifeq +740 -> 1257
    //   520: new 180	com/baidu/location/BDLocation
    //   523: dup
    //   524: invokespecial 181	com/baidu/location/BDLocation:<init>	()V
    //   527: astore_1
    //   528: aload_1
    //   529: iload 31
    //   531: i2f
    //   532: invokevirtual 184	com/baidu/location/BDLocation:b	(F)V
    //   535: aload_1
    //   536: dload 10
    //   538: invokevirtual 187	com/baidu/location/BDLocation:a	(D)V
    //   541: aload_1
    //   542: dload 8
    //   544: invokevirtual 189	com/baidu/location/BDLocation:b	(D)V
    //   547: aload_1
    //   548: ldc_w 353
    //   551: invokevirtual 193	com/baidu/location/BDLocation:e	(Ljava/lang/String;)V
    //   554: aload_1
    //   555: bipush 66
    //   557: invokevirtual 196	com/baidu/location/BDLocation:a	(I)V
    //   560: aload_1
    //   561: areturn
    //   562: dload 6
    //   564: dconst_0
    //   565: dcmpg
    //   566: ifle +23 -> 589
    //   569: dload 12
    //   571: dconst_0
    //   572: dcmpg
    //   573: ifle +16 -> 589
    //   576: iload 29
    //   578: ifle +11 -> 589
    //   581: iload 29
    //   583: sipush 1000
    //   586: if_icmplt +26 -> 612
    //   589: aload_2
    //   590: invokeinterface 351 1 0
    //   595: pop
    //   596: goto -314 -> 282
    //   599: astore_1
    //   600: aload_2
    //   601: ifnull +9 -> 610
    //   604: aload_2
    //   605: invokeinterface 261 1 0
    //   610: aload_1
    //   611: athrow
    //   612: iload 33
    //   614: iconst_1
    //   615: if_icmpne +32 -> 647
    //   618: aload_0
    //   619: dload 8
    //   621: dload 10
    //   623: dload 12
    //   625: dload 6
    //   627: invokespecial 160	com/baidu/location/c/a:a	(DDDD)D
    //   630: ldc2_w 354
    //   633: dcmpl
    //   634: ifle +13 -> 647
    //   637: aload_2
    //   638: invokeinterface 351 1 0
    //   643: pop
    //   644: goto -362 -> 282
    //   647: bipush 100
    //   649: bipush 30
    //   651: aload_0
    //   652: getfield 69	com/baidu/location/c/a:m	Ljava/util/concurrent/ConcurrentHashMap;
    //   655: aload 26
    //   657: invokevirtual 347	java/util/concurrent/ConcurrentHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   660: checkcast 207	java/lang/Integer
    //   663: invokevirtual 304	java/lang/Integer:intValue	()I
    //   666: invokestatic 358	java/lang/Math:max	(II)I
    //   669: invokestatic 287	java/lang/Math:min	(II)I
    //   672: istore 30
    //   674: iload 30
    //   676: bipush 70
    //   678: if_icmple +70 -> 748
    //   681: iload 30
    //   683: bipush 70
    //   685: isub
    //   686: i2d
    //   687: ldc2_w 359
    //   690: ddiv
    //   691: dconst_1
    //   692: dadd
    //   693: dstore 4
    //   695: aload 25
    //   697: new 152	com/baidu/location/c/d
    //   700: dup
    //   701: dload 6
    //   703: dload 12
    //   705: dload 4
    //   707: ldc2_w 361
    //   710: iload 29
    //   712: i2d
    //   713: invokestatic 364	java/lang/Math:max	(DD)D
    //   716: ldc2_w 365
    //   719: invokestatic 369	java/lang/Math:pow	(DD)D
    //   722: ldc2_w 370
    //   725: dmul
    //   726: dmul
    //   727: invokestatic 374	java/lang/Math:exp	(D)D
    //   730: aconst_null
    //   731: invokespecial 377	com/baidu/location/c/d:<init>	(DDDLcom/baidu/location/c/h;)V
    //   734: invokevirtual 378	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   737: pop
    //   738: aload_2
    //   739: invokeinterface 351 1 0
    //   744: pop
    //   745: goto -463 -> 282
    //   748: iload 30
    //   750: bipush 70
    //   752: isub
    //   753: i2d
    //   754: ldc2_w 361
    //   757: ddiv
    //   758: dconst_1
    //   759: dadd
    //   760: dstore 4
    //   762: goto -67 -> 695
    //   765: aload_0
    //   766: aload 25
    //   768: ldc2_w 379
    //   771: invokespecial 382	com/baidu/location/c/a:a	(Ljava/util/ArrayList;D)I
    //   774: pop
    //   775: dconst_0
    //   776: dstore 12
    //   778: dconst_0
    //   779: dstore 4
    //   781: dconst_0
    //   782: dstore 6
    //   784: iconst_0
    //   785: istore 29
    //   787: iload 29
    //   789: aload 25
    //   791: invokevirtual 146	java/util/ArrayList:size	()I
    //   794: if_icmpge +113 -> 907
    //   797: aload 25
    //   799: iload 29
    //   801: invokevirtual 150	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   804: checkcast 152	com/baidu/location/c/d
    //   807: astore 26
    //   809: aload 26
    //   811: getfield 383	com/baidu/location/c/d:c	D
    //   814: dconst_0
    //   815: dcmpg
    //   816: ifgt +18 -> 834
    //   819: dload 4
    //   821: dstore 14
    //   823: dload 6
    //   825: dstore 4
    //   827: dload 14
    //   829: dstore 6
    //   831: goto +566 -> 1397
    //   834: aload 26
    //   836: getfield 154	com/baidu/location/c/d:a	D
    //   839: dstore 16
    //   841: aload 26
    //   843: getfield 383	com/baidu/location/c/d:c	D
    //   846: dstore 18
    //   848: aload 26
    //   850: getfield 156	com/baidu/location/c/d:b	D
    //   853: dstore 14
    //   855: aload 26
    //   857: getfield 383	com/baidu/location/c/d:c	D
    //   860: dstore 20
    //   862: aload 26
    //   864: getfield 383	com/baidu/location/c/d:c	D
    //   867: dstore 22
    //   869: dload 22
    //   871: dload 6
    //   873: dadd
    //   874: dstore 6
    //   876: dload 14
    //   878: dload 20
    //   880: dmul
    //   881: dload 4
    //   883: dadd
    //   884: dstore 14
    //   886: dload 16
    //   888: dload 18
    //   890: dmul
    //   891: dload 12
    //   893: dadd
    //   894: dstore 12
    //   896: dload 6
    //   898: dstore 4
    //   900: dload 14
    //   902: dstore 6
    //   904: goto +493 -> 1397
    //   907: dload 6
    //   909: dconst_0
    //   910: dcmpl
    //   911: ifle +451 -> 1362
    //   914: dload 12
    //   916: dconst_0
    //   917: dcmpl
    //   918: ifle +444 -> 1362
    //   921: dload 4
    //   923: dconst_0
    //   924: dcmpl
    //   925: ifle +437 -> 1362
    //   928: dload 12
    //   930: dload 6
    //   932: ddiv
    //   933: dstore 12
    //   935: dload 4
    //   937: dload 6
    //   939: ddiv
    //   940: dstore 6
    //   942: iconst_1
    //   943: istore 30
    //   945: fconst_0
    //   946: fstore 24
    //   948: iconst_0
    //   949: istore 29
    //   951: iload 29
    //   953: aload 25
    //   955: invokevirtual 146	java/util/ArrayList:size	()I
    //   958: if_icmpge +57 -> 1015
    //   961: fload 24
    //   963: f2d
    //   964: dstore 4
    //   966: aload_0
    //   967: dload 12
    //   969: dload 6
    //   971: aload 25
    //   973: iload 29
    //   975: invokevirtual 150	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   978: checkcast 152	com/baidu/location/c/d
    //   981: getfield 154	com/baidu/location/c/d:a	D
    //   984: aload 25
    //   986: iload 29
    //   988: invokevirtual 150	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   991: checkcast 152	com/baidu/location/c/d
    //   994: getfield 156	com/baidu/location/c/d:b	D
    //   997: invokespecial 160	com/baidu/location/c/a:a	(DDDD)D
    //   1000: dload 4
    //   1002: dadd
    //   1003: d2f
    //   1004: fstore 24
    //   1006: iload 29
    //   1008: iconst_1
    //   1009: iadd
    //   1010: istore 29
    //   1012: goto -61 -> 951
    //   1015: fload 24
    //   1017: aload 25
    //   1019: invokevirtual 146	java/util/ArrayList:size	()I
    //   1022: i2f
    //   1023: fdiv
    //   1024: invokestatic 387	java/lang/Math:round	(F)I
    //   1027: istore 29
    //   1029: iload 29
    //   1031: bipush 30
    //   1033: if_icmpge +199 -> 1232
    //   1036: iconst_1
    //   1037: istore 30
    //   1039: dload 6
    //   1041: dstore 4
    //   1043: bipush 30
    //   1045: istore 29
    //   1047: dload 12
    //   1049: dstore 6
    //   1051: iload 30
    //   1053: istore 31
    //   1055: iload 33
    //   1057: ifne +23 -> 1080
    //   1060: iload 30
    //   1062: istore 31
    //   1064: iload 30
    //   1066: istore 32
    //   1068: aload 25
    //   1070: invokevirtual 146	java/util/ArrayList:size	()I
    //   1073: iconst_1
    //   1074: if_icmpgt +6 -> 1080
    //   1077: iconst_0
    //   1078: istore 31
    //   1080: iload 31
    //   1082: istore 30
    //   1084: iload 31
    //   1086: istore 32
    //   1088: aload 25
    //   1090: invokevirtual 146	java/util/ArrayList:size	()I
    //   1093: iload_3
    //   1094: if_icmpge +35 -> 1129
    //   1097: iload 31
    //   1099: istore 30
    //   1101: iload 31
    //   1103: istore 32
    //   1105: dconst_1
    //   1106: aload 25
    //   1108: invokevirtual 146	java/util/ArrayList:size	()I
    //   1111: i2d
    //   1112: dmul
    //   1113: aload_1
    //   1114: invokevirtual 283	java/util/LinkedHashMap:size	()I
    //   1117: i2d
    //   1118: ddiv
    //   1119: ldc2_w 388
    //   1122: dcmpg
    //   1123: ifge +6 -> 1129
    //   1126: iconst_0
    //   1127: istore 30
    //   1129: iload 33
    //   1131: iconst_1
    //   1132: if_icmpne +210 -> 1342
    //   1135: iload 30
    //   1137: iconst_1
    //   1138: if_icmpne +204 -> 1342
    //   1141: iload 30
    //   1143: istore 32
    //   1145: aload_0
    //   1146: dload 8
    //   1148: dload 10
    //   1150: dload 4
    //   1152: dload 6
    //   1154: invokespecial 160	com/baidu/location/c/a:a	(DDDD)D
    //   1157: dstore 8
    //   1159: dload 8
    //   1161: ldc2_w 354
    //   1164: dcmpl
    //   1165: ifle +177 -> 1342
    //   1168: iconst_0
    //   1169: istore_3
    //   1170: iload_3
    //   1171: istore 30
    //   1173: iload 29
    //   1175: istore 31
    //   1177: dload 6
    //   1179: dstore 8
    //   1181: dload 4
    //   1183: dstore 10
    //   1185: aload_2
    //   1186: ifnull -671 -> 515
    //   1189: aload_2
    //   1190: invokeinterface 261 1 0
    //   1195: iload_3
    //   1196: istore 30
    //   1198: iload 29
    //   1200: istore 31
    //   1202: dload 6
    //   1204: dstore 8
    //   1206: dload 4
    //   1208: dstore 10
    //   1210: goto -695 -> 515
    //   1213: astore_1
    //   1214: iload_3
    //   1215: istore 30
    //   1217: iload 29
    //   1219: istore 31
    //   1221: dload 6
    //   1223: dstore 8
    //   1225: dload 4
    //   1227: dstore 10
    //   1229: goto -714 -> 515
    //   1232: bipush 100
    //   1234: iload 29
    //   1236: if_icmpge +112 -> 1348
    //   1239: iconst_1
    //   1240: istore 30
    //   1242: dload 6
    //   1244: dstore 4
    //   1246: bipush 100
    //   1248: istore 29
    //   1250: dload 12
    //   1252: dstore 6
    //   1254: goto -203 -> 1051
    //   1257: aconst_null
    //   1258: areturn
    //   1259: astore_1
    //   1260: iload_3
    //   1261: istore 30
    //   1263: iload 29
    //   1265: istore 31
    //   1267: dload 4
    //   1269: dstore 8
    //   1271: dload 6
    //   1273: dstore 10
    //   1275: goto -760 -> 515
    //   1278: astore_2
    //   1279: goto -669 -> 610
    //   1282: astore_1
    //   1283: aconst_null
    //   1284: astore_2
    //   1285: goto -685 -> 600
    //   1288: astore_1
    //   1289: iconst_0
    //   1290: istore_3
    //   1291: dconst_0
    //   1292: dstore 6
    //   1294: dconst_0
    //   1295: dstore 4
    //   1297: iconst_0
    //   1298: istore 29
    //   1300: aload_2
    //   1301: astore_1
    //   1302: goto -827 -> 475
    //   1305: astore_1
    //   1306: aload_2
    //   1307: astore_1
    //   1308: iconst_0
    //   1309: istore 29
    //   1311: iload 30
    //   1313: istore_3
    //   1314: dload 12
    //   1316: dstore 4
    //   1318: goto -843 -> 475
    //   1321: astore_1
    //   1322: iload 32
    //   1324: istore_3
    //   1325: dload 4
    //   1327: dstore 8
    //   1329: aload_2
    //   1330: astore_1
    //   1331: dload 6
    //   1333: dstore 4
    //   1335: dload 8
    //   1337: dstore 6
    //   1339: goto -864 -> 475
    //   1342: iload 30
    //   1344: istore_3
    //   1345: goto -175 -> 1170
    //   1348: iconst_1
    //   1349: istore 30
    //   1351: dload 6
    //   1353: dstore 4
    //   1355: dload 12
    //   1357: dstore 6
    //   1359: goto -308 -> 1051
    //   1362: iconst_0
    //   1363: istore 30
    //   1365: dconst_0
    //   1366: dstore 4
    //   1368: dconst_0
    //   1369: dstore 6
    //   1371: iconst_0
    //   1372: istore 29
    //   1374: goto -323 -> 1051
    //   1377: iconst_0
    //   1378: istore_3
    //   1379: dconst_0
    //   1380: dstore 4
    //   1382: dconst_0
    //   1383: dstore 6
    //   1385: iconst_0
    //   1386: istore 29
    //   1388: goto -218 -> 1170
    //   1391: iconst_0
    //   1392: istore 33
    //   1394: goto -1361 -> 33
    //   1397: iload 29
    //   1399: iconst_1
    //   1400: iadd
    //   1401: istore 29
    //   1403: dload 6
    //   1405: dstore 14
    //   1407: dload 4
    //   1409: dstore 6
    //   1411: dload 14
    //   1413: dstore 4
    //   1415: goto -628 -> 787
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1418	0	this	a
    //   0	1418	1	paramLinkedHashMap	LinkedHashMap
    //   0	1418	2	paramBDLocation	BDLocation
    //   0	1418	3	paramInt	int
    //   337	1077	4	d1	double
    //   310	1100	6	d2	double
    //   12	1324	8	d3	double
    //   9	1265	10	d4	double
    //   319	1037	12	d5	double
    //   821	591	14	d6	double
    //   839	48	16	d7	double
    //   846	43	18	d8	double
    //   860	19	20	d9	double
    //   867	3	22	d10	double
    //   946	70	24	f1	float
    //   104	1003	25	localObject1	Object
    //   40	823	26	localObject2	Object
    //   51	23	27	localIterator	Iterator
    //   93	62	28	str	String
    //   57	1345	29	i1	int
    //   54	1310	30	i2	int
    //   480	786	31	i3	int
    //   1066	257	32	i4	int
    //   31	1362	33	i5	int
    // Exception table:
    //   from	to	target	type
    //   264	282	461	java/lang/Exception
    //   282	397	461	java/lang/Exception
    //   397	444	461	java/lang/Exception
    //   451	458	461	java/lang/Exception
    //   589	596	461	java/lang/Exception
    //   618	644	461	java/lang/Exception
    //   647	674	461	java/lang/Exception
    //   681	695	461	java/lang/Exception
    //   695	745	461	java/lang/Exception
    //   748	762	461	java/lang/Exception
    //   765	775	461	java/lang/Exception
    //   787	819	461	java/lang/Exception
    //   834	869	461	java/lang/Exception
    //   264	282	599	finally
    //   282	397	599	finally
    //   397	444	599	finally
    //   451	458	599	finally
    //   589	596	599	finally
    //   618	644	599	finally
    //   647	674	599	finally
    //   681	695	599	finally
    //   695	745	599	finally
    //   748	762	599	finally
    //   765	775	599	finally
    //   787	819	599	finally
    //   834	869	599	finally
    //   951	961	599	finally
    //   966	1006	599	finally
    //   1015	1029	599	finally
    //   1068	1077	599	finally
    //   1088	1097	599	finally
    //   1105	1126	599	finally
    //   1145	1159	599	finally
    //   1189	1195	1213	java/lang/Exception
    //   494	500	1259	java/lang/Exception
    //   604	610	1278	java/lang/Exception
    //   245	257	1282	finally
    //   245	257	1288	java/lang/Exception
    //   951	961	1305	java/lang/Exception
    //   966	1006	1305	java/lang/Exception
    //   1015	1029	1305	java/lang/Exception
    //   1068	1077	1321	java/lang/Exception
    //   1088	1097	1321	java/lang/Exception
    //   1105	1126	1321	java/lang/Exception
    //   1145	1159	1321	java/lang/Exception
  }
  
  private void a(BDLocation paramBDLocation1, BDLocation paramBDLocation2, BDLocation paramBDLocation3, String paramString, Long paramLong)
  {
    if ((paramBDLocation1 != null) && (paramBDLocation1.h() == 161)) {
      if ((paramBDLocation2 != null) && (paramBDLocation1.r().equals("cl")) && (a(paramBDLocation2.c(), paramBDLocation2.d(), paramBDLocation1.c(), paramBDLocation1.d()) > 300.0D))
      {
        paramBDLocation2 = String.format(Locale.US, "UPDATE CL SET cl = 0 WHERE id = %d;", new Object[] { paramLong });
        paramString = String.format(Locale.US, "INSERT OR REPLACE INTO CL VALUES (%d,\"%s\",%d);", new Object[] { paramLong, paramString, Integer.valueOf(100000) });
      }
    }
    try
    {
      this.h.execSQL(paramBDLocation2);
      this.i.execSQL(paramString);
      if ((paramBDLocation3 != null) && (paramBDLocation1.r().equals("wf")) && (a(paramBDLocation3.c(), paramBDLocation3.d(), paramBDLocation1.c(), paramBDLocation1.d()) > 100.0D))
      {
        paramBDLocation1 = String.format("UPDATE AP SET cl = 0 WHERE id In (%s);", new Object[] { this.j.toString() });
        paramBDLocation2 = String.format("INSERT OR REPLACE INTO AP VALUES %s;", new Object[] { this.k.toString() });
      }
      try
      {
        this.h.execSQL(paramBDLocation1);
        this.i.execSQL(paramBDLocation2);
        return;
      }
      catch (Exception paramBDLocation1) {}
    }
    catch (Exception paramBDLocation2)
    {
      for (;;) {}
    }
  }
  
  private void a(String paramString, Long paramLong, BDLocation paramBDLocation)
  {
    if (paramString != null)
    {
      if (paramBDLocation == null) {
        break label81;
      }
      paramBDLocation = String.format(Locale.US, "UPDATE CL SET frequency=frequency+1 WHERE id = %d;", new Object[] { paramLong });
    }
    try
    {
      this.h.execSQL(paramBDLocation);
      for (;;)
      {
        if (this.p) {
          paramString = String.format(Locale.US, "INSERT OR IGNORE INTO CL VALUES (%d,\"%s\",%d);", new Object[] { paramLong, paramString, Integer.valueOf(100000) });
        }
        try
        {
          this.i.execSQL(paramString);
          return;
        }
        catch (Exception paramString)
        {
          label81:
          String str;
          return;
        }
        paramBDLocation = String.format(Locale.US, "INSERT OR IGNORE INTO CL VALUES (%d,\"%s\",0);", new Object[] { paramLong, paramString });
        str = String.format(Locale.US, "UPDATE CL SET frequency=frequency+1 WHERE id = %d;", new Object[] { paramLong });
        try
        {
          this.i.execSQL(paramBDLocation);
          this.i.execSQL(str);
        }
        catch (Exception paramBDLocation) {}
      }
    }
    catch (Exception paramBDLocation)
    {
      for (;;) {}
    }
  }
  
  private void a(String paramString1, String paramString2, String paramString3)
  {
    c.a(this.f, paramString1, paramString2, paramString3);
  }
  
  private void a(LinkedHashMap paramLinkedHashMap)
  {
    StringBuffer localStringBuffer;
    Object localObject1;
    int i1;
    int i2;
    if ((paramLinkedHashMap != null) && (paramLinkedHashMap.size() > 0))
    {
      this.j = new StringBuffer();
      this.k = new StringBuffer();
      paramLinkedHashMap = new StringBuffer();
      localStringBuffer = new StringBuffer();
      localObject1 = this.m.keySet().iterator();
      i1 = 1;
      i2 = 1;
    }
    for (;;)
    {
      int i4;
      int i3;
      if (((Iterator)localObject1).hasNext())
      {
        i4 = i1;
        i3 = i2;
      }
      try
      {
        Object localObject2 = (Long)((Iterator)localObject1).next();
        i4 = i1;
        i3 = i2;
        if (this.l.contains(localObject2))
        {
          if (i2 != 0) {
            i2 = 0;
          }
          for (;;)
          {
            i4 = i1;
            i3 = i2;
            this.j.append(localObject2);
            i4 = i1;
            i3 = i2;
            str = (String)this.n.get(localObject2);
            i4 = i1;
            i3 = i2;
            this.k.append('(').append(localObject2).append(',').append('"').append(str).append('"').append(',').append(100000).append(')');
            break;
            i4 = i1;
            i3 = i2;
            this.j.append(',');
            i4 = i1;
            i3 = i2;
            this.k.append(',');
          }
        }
        i4 = i1;
        i3 = i2;
        String str = (String)this.n.get(localObject2);
        if (i1 != 0) {
          i1 = 0;
        }
        for (;;)
        {
          i4 = i1;
          i3 = i2;
          paramLinkedHashMap.append(localObject2);
          i4 = i1;
          i3 = i2;
          localStringBuffer.append('(').append(localObject2).append(',').append('"').append(str).append('"').append(",0)");
          break;
          i4 = i1;
          i3 = i2;
          paramLinkedHashMap.append(',');
          i4 = i1;
          i3 = i2;
          localStringBuffer.append(',');
        }
        localObject1 = String.format(Locale.US, "UPDATE AP SET frequency=frequency+1 WHERE id IN(%s)", new Object[] { this.j.toString() });
        try
        {
          this.h.execSQL((String)localObject1);
          if (this.o.length() > 0)
          {
            if (localStringBuffer.length() > 0) {
              localStringBuffer.append(",");
            }
            localStringBuffer.append(this.o);
          }
          localObject1 = String.format("INSERT OR IGNORE INTO AP VALUES %s;", new Object[] { localStringBuffer.toString() });
          localObject2 = String.format("UPDATE AP SET frequency=frequency+1 WHERE id in (%s);", new Object[] { paramLinkedHashMap.toString() });
          try
          {
            if (localStringBuffer.length() > 0) {
              this.i.execSQL((String)localObject1);
            }
            if (paramLinkedHashMap.length() > 0) {
              this.i.execSQL((String)localObject2);
            }
            return;
          }
          catch (Exception paramLinkedHashMap)
          {
            return;
          }
        }
        catch (Exception localException1)
        {
          for (;;) {}
        }
      }
      catch (Exception localException2)
      {
        i1 = i4;
        i2 = i3;
      }
    }
  }
  
  private void a(String[] paramArrayOfString)
  {
    this.a.l().a(paramArrayOfString);
  }
  
  Cursor a(q paramq)
  {
    Object localObject3 = new BDLocation();
    ((BDLocation)localObject3).a(67);
    int i2 = 0;
    int i1;
    Object localObject1;
    Object localObject2;
    Object localObject5;
    Object localObject6;
    Object localObject4;
    Object localObject7;
    int i3;
    if (paramq.c)
    {
      String str = paramq.b;
      LinkedHashMap localLinkedHashMap = paramq.i;
      i1 = paramq.f;
      BDLocation localBDLocation = paramq.g;
      localObject1 = null;
      localObject2 = Long.valueOf(Long.MIN_VALUE);
      Object localObject8 = localObject2;
      localObject5 = localObject1;
      if (str != null)
      {
        localObject8 = localObject2;
        localObject5 = localObject1;
        if (this.h != null)
        {
          localObject2 = Jni.d(str);
          localObject8 = localObject2;
          localObject5 = localObject1;
          if (localObject2 != null)
          {
            localObject5 = a((Long)localObject2);
            localObject8 = localObject2;
          }
        }
      }
      localObject1 = null;
      localObject6 = localObject1;
      if (localLinkedHashMap != null)
      {
        localObject6 = localObject1;
        if (localLinkedHashMap.size() > 0)
        {
          localObject6 = localObject1;
          if (this.h != null)
          {
            this.m.clear();
            this.l.clear();
            this.n.clear();
            localObject6 = a(localLinkedHashMap, (BDLocation)localObject5, i1);
          }
        }
      }
      localObject1 = null;
      localObject2 = null;
      localObject4 = null;
      localObject7 = null;
      Object localObject9;
      if (localObject5 != null)
      {
        localObject1 = Double.valueOf(((BDLocation)localObject5).d());
        localObject2 = Double.valueOf(((BDLocation)localObject5).c());
        localObject9 = Jni.a(((BDLocation)localObject5).d(), ((BDLocation)localObject5).c(), "bd09ll2gcj");
        ((BDLocation)localObject5).b("gcj");
        ((BDLocation)localObject5).a(localObject9[1]);
        ((BDLocation)localObject5).b(localObject9[0]);
        ((BDLocation)localObject5).e("cl");
      }
      if (localObject6 != null)
      {
        localObject4 = Double.valueOf(((BDLocation)localObject6).d());
        localObject7 = Double.valueOf(((BDLocation)localObject6).c());
        localObject9 = Jni.a(((BDLocation)localObject6).d(), ((BDLocation)localObject6).c(), "bd09ll2gcj");
        ((BDLocation)localObject6).b("gcj");
        ((BDLocation)localObject6).a(localObject9[1]);
        ((BDLocation)localObject6).b(localObject9[0]);
        ((BDLocation)localObject6).e("wf");
      }
      if ((localObject5 != null) && (localObject6 == null))
      {
        i1 = 1;
        if (paramq.f <= 0) {
          break label849;
        }
        i3 = 1;
        label357:
        if ((localLinkedHashMap != null) && (localLinkedHashMap.size() > 0)) {
          break label855;
        }
        i2 = 1;
        label373:
        if (i3 == 0) {
          break label880;
        }
        if (localObject6 == null) {
          break label861;
        }
        localObject1 = localObject4;
        localObject2 = localObject6;
        localObject4 = localObject7;
        label393:
        if ((paramq.e) && (this.a.l().l()) && (localObject4 != null) && (localObject1 != null)) {
          ((BDLocation)localObject2).a(this.a.k().a(((Double)localObject1).doubleValue(), ((Double)localObject4).doubleValue()));
        }
        i2 = i1;
        Object localObject10 = localObject4;
        localObject9 = localObject1;
        localObject7 = localObject2;
        if (i3 != 0)
        {
          i2 = i1;
          localObject10 = localObject4;
          localObject9 = localObject1;
          localObject7 = localObject2;
          if (paramq.e)
          {
            i2 = i1;
            localObject10 = localObject4;
            localObject9 = localObject1;
            localObject7 = localObject2;
            if (((BDLocation)localObject2).m() == null)
            {
              localObject10 = null;
              localObject9 = null;
              i2 = 0;
              localObject7 = localObject3;
            }
          }
        }
        if (((!paramq.d) && (!paramq.h)) || (localObject10 == null) || (localObject9 == null)) {
          break label919;
        }
        localObject1 = this.a.k().b(((Double)localObject9).doubleValue(), ((Double)localObject10).doubleValue());
        if (paramq.d) {
          ((BDLocation)localObject7).a((List)localObject1);
        }
        label577:
        if ((i3 == 0) || (!paramq.d) || ((localObject1 != null) && (((List)localObject1).size() > 0))) {
          break label912;
        }
        i1 = 0;
        localObject7 = localObject3;
        label609:
        localObject4 = null;
        localObject2 = localObject4;
        if (paramq.h)
        {
          localObject2 = localObject4;
          if (localObject1 != null)
          {
            localObject2 = localObject4;
            if (((List)localObject1).size() > 0)
            {
              localObject2 = String.format(Locale.CHINA, "在%s附近", new Object[] { ((Poi)((List)localObject1).get(0)).c() });
              ((BDLocation)localObject7).d((String)localObject2);
            }
          }
        }
        i2 = i1;
        localObject1 = localObject7;
        if (i3 != 0)
        {
          i2 = i1;
          localObject1 = localObject7;
          if (paramq.h)
          {
            i2 = i1;
            localObject1 = localObject7;
            if (localObject2 == null)
            {
              i2 = 0;
              localObject1 = localObject3;
            }
          }
        }
        localObject3 = new StringBuffer();
        localObject2 = null;
        if (paramq.a != null)
        {
          ((StringBuffer)localObject3).append(paramq.a);
          ((StringBuffer)localObject3).append(p.a((BDLocation)localObject6, (BDLocation)localObject5, paramq));
          ((StringBuffer)localObject3).append(p.a((BDLocation)localObject1, i2));
          localObject2 = ((StringBuffer)localObject3).toString();
        }
        new h(this, str, (Long)localObject8, (BDLocation)localObject5, (BDLocation)localObject6, localBDLocation, (String)localObject2, localLinkedHashMap).start();
      }
    }
    for (;;)
    {
      return p.a((BDLocation)localObject1);
      if ((localObject5 == null) && (localObject6 != null))
      {
        i1 = 2;
        break;
      }
      i1 = i2;
      if (localObject5 == null) {
        break;
      }
      i1 = i2;
      if (localObject6 == null) {
        break;
      }
      i1 = 4;
      break;
      label849:
      i3 = 0;
      break label357;
      label855:
      i2 = 0;
      break label373;
      label861:
      if ((i2 != 0) && (localObject5 != null))
      {
        localObject4 = localObject2;
        localObject2 = localObject5;
        break label393;
        label880:
        if (localObject6 != null)
        {
          localObject1 = localObject4;
          localObject2 = localObject6;
          localObject4 = localObject7;
          break label393;
        }
        if (localObject5 != null)
        {
          localObject4 = localObject2;
          localObject2 = localObject5;
          break label393;
          label912:
          i1 = i2;
          break label609;
          label919:
          localObject1 = null;
          break label577;
        }
      }
      localObject4 = null;
      localObject1 = null;
      localObject2 = localObject3;
      break label393;
      localObject1 = localObject3;
    }
  }
  
  SQLiteDatabase a()
  {
    return this.i;
  }
  
  void b()
  {
    this.g.b();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */