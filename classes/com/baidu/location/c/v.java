package com.baidu.location.c;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

final class v
{
  private static final double[] b = { 45.0D, 135.0D, 225.0D, 315.0D };
  private final i a;
  private final int c;
  private final SQLiteDatabase d;
  private int e;
  private int f;
  
  v(i parami, SQLiteDatabase paramSQLiteDatabase, int paramInt)
  {
    this.a = parami;
    this.e = -1;
    this.f = -1;
    this.d = paramSQLiteDatabase;
    this.c = paramInt;
    if ((this.d != null) && (this.d.isOpen()))
    {
      this.d.execSQL("CREATE TABLE IF NOT EXISTS RGCAREA(gridkey VARCHAR(10) PRIMARY KEY, country VARCHAR(100),countrycode VARCHAR(100), province VARCHAR(100), city VARCHAR(100), citycode VARCHAR(100), district VARCHAR(100), timestamp INTEGER, version VARCHAR(50))");
      this.d.execSQL("CREATE TABLE IF NOT EXISTS RGCROAD(_id INTEGER PRIMARY KEY AUTOINCREMENT, gridkey VARCHAR(10), street VARCHAR(100), x1 DOUBLE, y1 DOUBLE, x2 DOUBLE, y2 DOUBLE)");
      this.d.execSQL("CREATE TABLE IF NOT EXISTS RGCSITE(_id INTEGER PRIMARY KEY AUTOINCREMENT, gridkey VARCHAR(10), street VARCHAR(100), streetnumber VARCHAR(100), x DOUBLE, y DOUBLE)");
      this.d.execSQL("CREATE TABLE IF NOT EXISTS RGCPOI(pid VARCHAR(50) PRIMARY KEY , gridkey VARCHAR(10), name VARCHAR(100), type VARCHAR(50), x DOUBLE, y DOUBLE, rank INTEGER)");
      this.d.execSQL("CREATE TABLE IF NOT EXISTS RGCUPDATE(gridkey VARCHAR(10), version VARCHAR(50), type INTEGER, timestamp INTEGER, PRIMARY KEY(gridkey, type))");
    }
  }
  
  private double a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6)
  {
    double d1 = (paramDouble5 - paramDouble3) * (paramDouble1 - paramDouble3) + (paramDouble6 - paramDouble4) * (paramDouble2 - paramDouble4);
    if (d1 <= 0.0D) {
      return Math.sqrt((paramDouble1 - paramDouble3) * (paramDouble1 - paramDouble3) + (paramDouble2 - paramDouble4) * (paramDouble2 - paramDouble4));
    }
    double d2 = (paramDouble5 - paramDouble3) * (paramDouble5 - paramDouble3) + (paramDouble6 - paramDouble4) * (paramDouble6 - paramDouble4);
    if (d1 >= d2) {
      return Math.sqrt((paramDouble1 - paramDouble5) * (paramDouble1 - paramDouble5) + (paramDouble2 - paramDouble6) * (paramDouble2 - paramDouble6));
    }
    d1 /= d2;
    paramDouble3 = (paramDouble5 - paramDouble3) * d1 + paramDouble3;
    paramDouble4 = d1 * (paramDouble6 - paramDouble4) + paramDouble4;
    return Math.sqrt((paramDouble4 - paramDouble2) * (paramDouble4 - paramDouble2) + (paramDouble1 - paramDouble3) * (paramDouble1 - paramDouble3));
  }
  
  private static int a(int paramInt1, int paramInt2)
  {
    double d1;
    int i;
    if (100 > paramInt2)
    {
      d1 = -0.1D;
      i = 60000;
    }
    for (;;)
    {
      double d2 = paramInt2;
      return (int)(i + d1 * d2) + paramInt1;
      if (500 > paramInt2)
      {
        d1 = -0.75D;
        i = 55500;
      }
      else
      {
        d1 = -0.5D;
        i = 0;
      }
    }
  }
  
  private static String b(int paramInt, double paramDouble1, double paramDouble2)
  {
    char[] arrayOfChar = new char[paramInt + 1];
    w localw1 = new w(90.0D, -90.0D, null);
    w localw2 = new w(180.0D, -180.0D, null);
    int k = 1;
    int j = 1;
    int i = 0;
    Object localObject;
    double d1;
    label68:
    double d2;
    if (k <= paramInt * 5) {
      if (j != 0)
      {
        localObject = localw2;
        d1 = paramDouble1;
        d2 = (w.a((w)localObject) + w.b((w)localObject)) / 2.0D;
        i <<= 1;
        if ((int)(d1 * 1000000.0D) <= (int)(1000000.0D * d2)) {
          break label175;
        }
        w.a((w)localObject, d2);
        i |= 0x1;
        label122:
        if (k % 5 != 0) {
          break label241;
        }
        arrayOfChar[(k / 5 - 1)] = "0123456789bcdefghjkmnpqrstuvwxyz".charAt(i);
        i = 0;
      }
    }
    label175:
    label241:
    for (;;)
    {
      if (j == 0) {}
      for (j = 1;; j = 0)
      {
        k += 1;
        break;
        localObject = localw1;
        d1 = paramDouble2;
        break label68;
        w.b((w)localObject, d2);
        break label122;
      }
      arrayOfChar[paramInt] = '\000';
      localObject = new StringBuffer();
      i = 0;
      while (i < paramInt)
      {
        ((StringBuffer)localObject).append(arrayOfChar[i]);
        i += 1;
      }
      return ((StringBuffer)localObject).toString();
    }
  }
  
  private static double[] b(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    paramDouble1 = Math.toRadians(paramDouble1);
    paramDouble2 = Math.toRadians(paramDouble2);
    double d1 = Math.toRadians(paramDouble4);
    paramDouble4 = Math.asin(Math.sin(paramDouble1) * Math.cos(paramDouble3 / 6378137.0D) + Math.cos(paramDouble1) * Math.sin(paramDouble3 / 6378137.0D) * Math.cos(d1));
    paramDouble1 = Math.atan2(Math.sin(d1) * Math.sin(paramDouble3 / 6378137.0D) * Math.cos(paramDouble1), Math.cos(paramDouble3 / 6378137.0D) - Math.sin(paramDouble1) * Math.sin(paramDouble4));
    return new double[] { Math.toDegrees(paramDouble4), Math.toDegrees(paramDouble1 + paramDouble2) };
  }
  
  private double c(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
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
  
  /* Error */
  com.baidu.location.a a(double paramDouble1, double paramDouble2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 11
    //   3: getstatic 160	com/baidu/location/c/x:c	Lcom/baidu/location/c/x;
    //   6: aload_0
    //   7: getfield 41	com/baidu/location/c/v:c	I
    //   10: dload_1
    //   11: dload_3
    //   12: invokestatic 163	com/baidu/location/c/x:a	(Lcom/baidu/location/c/x;IDD)Ljava/lang/String;
    //   15: astore 9
    //   17: aload_0
    //   18: getfield 39	com/baidu/location/c/v:d	Landroid/database/sqlite/SQLiteDatabase;
    //   21: aload 9
    //   23: aconst_null
    //   24: invokevirtual 167	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   27: astore 9
    //   29: aload 9
    //   31: astore 11
    //   33: aload 11
    //   35: invokeinterface 172 1 0
    //   40: istore 25
    //   42: iload 25
    //   44: ifeq +1421 -> 1465
    //   47: ldc2_w 173
    //   50: dstore 5
    //   52: aconst_null
    //   53: astore 10
    //   55: aconst_null
    //   56: astore 9
    //   58: aload 11
    //   60: invokeinterface 177 1 0
    //   65: ifne +107 -> 172
    //   68: aload 11
    //   70: iconst_2
    //   71: invokeinterface 181 2 0
    //   76: astore 12
    //   78: aload 11
    //   80: iconst_3
    //   81: invokeinterface 181 2 0
    //   86: astore 13
    //   88: aload_0
    //   89: dload_3
    //   90: dload_1
    //   91: aload 11
    //   93: iconst_5
    //   94: invokeinterface 185 2 0
    //   99: aload 11
    //   101: iconst_4
    //   102: invokeinterface 185 2 0
    //   107: invokespecial 187	com/baidu/location/c/v:c	(DDDD)D
    //   110: dstore 7
    //   112: dload 7
    //   114: dload 5
    //   116: dcmpg
    //   117: ifge +1333 -> 1450
    //   120: getstatic 160	com/baidu/location/c/x:c	Lcom/baidu/location/c/x;
    //   123: invokestatic 190	com/baidu/location/c/x:d	(Lcom/baidu/location/c/x;)I
    //   126: istore 24
    //   128: dload 7
    //   130: iload 24
    //   132: i2d
    //   133: dcmpg
    //   134: ifgt +1316 -> 1450
    //   137: aload 13
    //   139: astore 9
    //   141: aload 12
    //   143: astore 10
    //   145: dload 7
    //   147: dstore 5
    //   149: aload 11
    //   151: invokeinterface 193 1 0
    //   156: pop
    //   157: aload 10
    //   159: astore 12
    //   161: aload 9
    //   163: astore 10
    //   165: aload 12
    //   167: astore 9
    //   169: goto -111 -> 58
    //   172: aload 10
    //   174: astore 13
    //   176: aload 9
    //   178: astore 12
    //   180: aload 11
    //   182: ifnull +1261 -> 1443
    //   185: aload 11
    //   187: invokeinterface 196 1 0
    //   192: aload 10
    //   194: astore 13
    //   196: aload 9
    //   198: astore 11
    //   200: aload 13
    //   202: ifnonnull +315 -> 517
    //   205: getstatic 198	com/baidu/location/c/x:b	Lcom/baidu/location/c/x;
    //   208: aload_0
    //   209: getfield 41	com/baidu/location/c/v:c	I
    //   212: dload_1
    //   213: dload_3
    //   214: invokestatic 163	com/baidu/location/c/x:a	(Lcom/baidu/location/c/x;IDD)Ljava/lang/String;
    //   217: astore 10
    //   219: aload_0
    //   220: getfield 39	com/baidu/location/c/v:d	Landroid/database/sqlite/SQLiteDatabase;
    //   223: aload 10
    //   225: aconst_null
    //   226: invokevirtual 167	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   229: astore 11
    //   231: aload 9
    //   233: astore 10
    //   235: aload 11
    //   237: invokeinterface 172 1 0
    //   242: ifeq +251 -> 493
    //   245: ldc2_w 173
    //   248: dstore 5
    //   250: aload 9
    //   252: astore 10
    //   254: dload_1
    //   255: dload_3
    //   256: ldc -56
    //   258: invokestatic 205	com/baidu/location/Jni:a	(DDLjava/lang/String;)[D
    //   261: astore 12
    //   263: aload 9
    //   265: astore 10
    //   267: aload 11
    //   269: invokeinterface 177 1 0
    //   274: ifne +223 -> 497
    //   277: aload 11
    //   279: iconst_2
    //   280: invokeinterface 181 2 0
    //   285: astore 10
    //   287: aload 11
    //   289: iconst_3
    //   290: invokeinterface 185 2 0
    //   295: aload 11
    //   297: iconst_4
    //   298: invokeinterface 185 2 0
    //   303: ldc -56
    //   305: invokestatic 205	com/baidu/location/Jni:a	(DDLjava/lang/String;)[D
    //   308: astore 14
    //   310: aload 11
    //   312: iconst_5
    //   313: invokeinterface 185 2 0
    //   318: aload 11
    //   320: bipush 6
    //   322: invokeinterface 185 2 0
    //   327: ldc -56
    //   329: invokestatic 205	com/baidu/location/Jni:a	(DDLjava/lang/String;)[D
    //   332: astore 15
    //   334: aload_0
    //   335: aload 12
    //   337: iconst_0
    //   338: daload
    //   339: aload 12
    //   341: iconst_1
    //   342: daload
    //   343: aload 14
    //   345: iconst_0
    //   346: daload
    //   347: aload 14
    //   349: iconst_1
    //   350: daload
    //   351: aload 15
    //   353: iconst_0
    //   354: daload
    //   355: aload 15
    //   357: iconst_1
    //   358: daload
    //   359: invokespecial 207	com/baidu/location/c/v:a	(DDDDDD)D
    //   362: dstore 7
    //   364: dload 7
    //   366: dload 5
    //   368: dcmpg
    //   369: ifge +1071 -> 1440
    //   372: getstatic 198	com/baidu/location/c/x:b	Lcom/baidu/location/c/x;
    //   375: invokestatic 190	com/baidu/location/c/x:d	(Lcom/baidu/location/c/x;)I
    //   378: istore 24
    //   380: dload 7
    //   382: iload 24
    //   384: i2d
    //   385: dcmpg
    //   386: ifgt +1054 -> 1440
    //   389: dload 7
    //   391: dstore 5
    //   393: aload 10
    //   395: astore 9
    //   397: aload 9
    //   399: astore 10
    //   401: aload 11
    //   403: invokeinterface 193 1 0
    //   408: pop
    //   409: goto -146 -> 263
    //   412: astore 11
    //   414: aload 10
    //   416: astore 13
    //   418: goto -222 -> 196
    //   421: astore 9
    //   423: aconst_null
    //   424: astore 11
    //   426: aconst_null
    //   427: astore 9
    //   429: aconst_null
    //   430: astore 10
    //   432: aload 9
    //   434: astore 13
    //   436: aload 10
    //   438: astore 12
    //   440: aload 11
    //   442: ifnull +1001 -> 1443
    //   445: aload 11
    //   447: invokeinterface 196 1 0
    //   452: aload 9
    //   454: astore 13
    //   456: aload 10
    //   458: astore 9
    //   460: goto -264 -> 196
    //   463: astore 11
    //   465: aload 9
    //   467: astore 13
    //   469: aload 10
    //   471: astore 9
    //   473: goto -277 -> 196
    //   476: astore 9
    //   478: aload 11
    //   480: ifnull +10 -> 490
    //   483: aload 11
    //   485: invokeinterface 196 1 0
    //   490: aload 9
    //   492: athrow
    //   493: aload 9
    //   495: astore 10
    //   497: aload 10
    //   499: astore 12
    //   501: aload 11
    //   503: ifnull +930 -> 1433
    //   506: aload 11
    //   508: invokeinterface 196 1 0
    //   513: aload 10
    //   515: astore 11
    //   517: getstatic 209	com/baidu/location/c/x:a	Lcom/baidu/location/c/x;
    //   520: aload_0
    //   521: getfield 41	com/baidu/location/c/v:c	I
    //   524: dload_1
    //   525: dload_3
    //   526: invokestatic 163	com/baidu/location/c/x:a	(Lcom/baidu/location/c/x;IDD)Ljava/lang/String;
    //   529: astore 9
    //   531: aconst_null
    //   532: astore 16
    //   534: aload_0
    //   535: getfield 39	com/baidu/location/c/v:d	Landroid/database/sqlite/SQLiteDatabase;
    //   538: aload 9
    //   540: aconst_null
    //   541: invokevirtual 167	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   544: astore 17
    //   546: aload 17
    //   548: astore 16
    //   550: aload 17
    //   552: invokeinterface 172 1 0
    //   557: ifeq +855 -> 1412
    //   560: aload 17
    //   562: astore 16
    //   564: aload 17
    //   566: invokeinterface 177 1 0
    //   571: ifne +841 -> 1412
    //   574: aload 17
    //   576: astore 16
    //   578: aload 17
    //   580: aload 17
    //   582: ldc -45
    //   584: invokeinterface 215 2 0
    //   589: invokeinterface 181 2 0
    //   594: astore 15
    //   596: aload 17
    //   598: aload 17
    //   600: ldc -39
    //   602: invokeinterface 215 2 0
    //   607: invokeinterface 181 2 0
    //   612: astore 14
    //   614: aload 17
    //   616: aload 17
    //   618: ldc -37
    //   620: invokeinterface 215 2 0
    //   625: invokeinterface 181 2 0
    //   630: astore 12
    //   632: aload 17
    //   634: aload 17
    //   636: ldc -35
    //   638: invokeinterface 215 2 0
    //   643: invokeinterface 181 2 0
    //   648: astore 10
    //   650: aload 17
    //   652: aload 17
    //   654: ldc -33
    //   656: invokeinterface 215 2 0
    //   661: invokeinterface 181 2 0
    //   666: astore 9
    //   668: aload 17
    //   670: aload 17
    //   672: ldc -31
    //   674: invokeinterface 215 2 0
    //   679: invokeinterface 181 2 0
    //   684: astore 18
    //   686: aload 15
    //   688: astore 23
    //   690: aload 14
    //   692: astore 22
    //   694: aload 12
    //   696: astore 21
    //   698: aload 10
    //   700: astore 20
    //   702: aload 9
    //   704: astore 19
    //   706: aload 18
    //   708: astore 9
    //   710: aload 19
    //   712: astore 10
    //   714: aload 20
    //   716: astore 12
    //   718: aload 21
    //   720: astore 14
    //   722: aload 22
    //   724: astore 15
    //   726: aload 23
    //   728: astore 16
    //   730: aload 17
    //   732: ifnull +34 -> 766
    //   735: aload 17
    //   737: invokeinterface 196 1 0
    //   742: aload 23
    //   744: astore 16
    //   746: aload 22
    //   748: astore 15
    //   750: aload 21
    //   752: astore 14
    //   754: aload 20
    //   756: astore 12
    //   758: aload 19
    //   760: astore 10
    //   762: aload 18
    //   764: astore 9
    //   766: aload 16
    //   768: astore 17
    //   770: aload 16
    //   772: ifnull +20 -> 792
    //   775: new 112	java/lang/String
    //   778: dup
    //   779: aload 16
    //   781: invokevirtual 229	java/lang/String:getBytes	()[B
    //   784: invokestatic 234	com/baidu/location/f/b/b:a	([B)[B
    //   787: invokespecial 237	java/lang/String:<init>	([B)V
    //   790: astore 17
    //   792: aload 15
    //   794: astore 16
    //   796: aload 15
    //   798: ifnull +20 -> 818
    //   801: new 112	java/lang/String
    //   804: dup
    //   805: aload 15
    //   807: invokevirtual 229	java/lang/String:getBytes	()[B
    //   810: invokestatic 234	com/baidu/location/f/b/b:a	([B)[B
    //   813: invokespecial 237	java/lang/String:<init>	([B)V
    //   816: astore 16
    //   818: aload 14
    //   820: astore 15
    //   822: aload 14
    //   824: ifnull +20 -> 844
    //   827: new 112	java/lang/String
    //   830: dup
    //   831: aload 14
    //   833: invokevirtual 229	java/lang/String:getBytes	()[B
    //   836: invokestatic 234	com/baidu/location/f/b/b:a	([B)[B
    //   839: invokespecial 237	java/lang/String:<init>	([B)V
    //   842: astore 15
    //   844: aload 12
    //   846: astore 14
    //   848: aload 12
    //   850: ifnull +20 -> 870
    //   853: new 112	java/lang/String
    //   856: dup
    //   857: aload 12
    //   859: invokevirtual 229	java/lang/String:getBytes	()[B
    //   862: invokestatic 234	com/baidu/location/f/b/b:a	([B)[B
    //   865: invokespecial 237	java/lang/String:<init>	([B)V
    //   868: astore 14
    //   870: aload 10
    //   872: astore 12
    //   874: aload 10
    //   876: ifnull +20 -> 896
    //   879: new 112	java/lang/String
    //   882: dup
    //   883: aload 10
    //   885: invokevirtual 229	java/lang/String:getBytes	()[B
    //   888: invokestatic 234	com/baidu/location/f/b/b:a	([B)[B
    //   891: invokespecial 237	java/lang/String:<init>	([B)V
    //   894: astore 12
    //   896: aload 9
    //   898: astore 10
    //   900: aload 9
    //   902: ifnull +20 -> 922
    //   905: new 112	java/lang/String
    //   908: dup
    //   909: aload 9
    //   911: invokevirtual 229	java/lang/String:getBytes	()[B
    //   914: invokestatic 234	com/baidu/location/f/b/b:a	([B)[B
    //   917: invokespecial 237	java/lang/String:<init>	([B)V
    //   920: astore 10
    //   922: aload 11
    //   924: astore 9
    //   926: aload 11
    //   928: ifnull +20 -> 948
    //   931: new 112	java/lang/String
    //   934: dup
    //   935: aload 11
    //   937: invokevirtual 229	java/lang/String:getBytes	()[B
    //   940: invokestatic 234	com/baidu/location/f/b/b:a	([B)[B
    //   943: invokespecial 237	java/lang/String:<init>	([B)V
    //   946: astore 9
    //   948: aload 13
    //   950: ifnull +429 -> 1379
    //   953: new 112	java/lang/String
    //   956: dup
    //   957: aload 13
    //   959: invokevirtual 229	java/lang/String:getBytes	()[B
    //   962: invokestatic 234	com/baidu/location/f/b/b:a	([B)[B
    //   965: invokespecial 237	java/lang/String:<init>	([B)V
    //   968: astore 11
    //   970: new 239	com/baidu/location/c
    //   973: dup
    //   974: invokespecial 240	com/baidu/location/c:<init>	()V
    //   977: aload 17
    //   979: invokevirtual 243	com/baidu/location/c:a	(Ljava/lang/String;)Lcom/baidu/location/c;
    //   982: aload 16
    //   984: invokevirtual 245	com/baidu/location/c:b	(Ljava/lang/String;)Lcom/baidu/location/c;
    //   987: aload 15
    //   989: invokevirtual 247	com/baidu/location/c:c	(Ljava/lang/String;)Lcom/baidu/location/c;
    //   992: aload 14
    //   994: invokevirtual 249	com/baidu/location/c:d	(Ljava/lang/String;)Lcom/baidu/location/c;
    //   997: aload 12
    //   999: invokevirtual 251	com/baidu/location/c:e	(Ljava/lang/String;)Lcom/baidu/location/c;
    //   1002: aload 10
    //   1004: invokevirtual 253	com/baidu/location/c:f	(Ljava/lang/String;)Lcom/baidu/location/c;
    //   1007: aload 9
    //   1009: invokevirtual 256	com/baidu/location/c:g	(Ljava/lang/String;)Lcom/baidu/location/c;
    //   1012: aload 11
    //   1014: invokevirtual 259	com/baidu/location/c:h	(Ljava/lang/String;)Lcom/baidu/location/c;
    //   1017: invokevirtual 262	com/baidu/location/c:a	()Lcom/baidu/location/a;
    //   1020: areturn
    //   1021: astore 9
    //   1023: aload 10
    //   1025: astore 11
    //   1027: goto -510 -> 517
    //   1030: astore 10
    //   1032: aconst_null
    //   1033: astore 10
    //   1035: aload 9
    //   1037: astore 12
    //   1039: aload 10
    //   1041: ifnull +392 -> 1433
    //   1044: aload 10
    //   1046: invokeinterface 196 1 0
    //   1051: aload 9
    //   1053: astore 11
    //   1055: goto -538 -> 517
    //   1058: astore 10
    //   1060: aload 9
    //   1062: astore 11
    //   1064: goto -547 -> 517
    //   1067: astore 9
    //   1069: aconst_null
    //   1070: astore 11
    //   1072: aload 11
    //   1074: ifnull +10 -> 1084
    //   1077: aload 11
    //   1079: invokeinterface 196 1 0
    //   1084: aload 9
    //   1086: athrow
    //   1087: astore 9
    //   1089: aconst_null
    //   1090: astore 9
    //   1092: aconst_null
    //   1093: astore 10
    //   1095: aconst_null
    //   1096: astore 12
    //   1098: aconst_null
    //   1099: astore 14
    //   1101: aconst_null
    //   1102: astore 15
    //   1104: aload 16
    //   1106: ifnull +280 -> 1386
    //   1109: aload 16
    //   1111: invokeinterface 196 1 0
    //   1116: aload 15
    //   1118: astore 16
    //   1120: aload 14
    //   1122: astore 15
    //   1124: aload 12
    //   1126: astore 14
    //   1128: aload 10
    //   1130: astore 12
    //   1132: aload 9
    //   1134: astore 10
    //   1136: aconst_null
    //   1137: astore 9
    //   1139: goto -373 -> 766
    //   1142: astore 16
    //   1144: aload 15
    //   1146: astore 16
    //   1148: aload 14
    //   1150: astore 15
    //   1152: aload 12
    //   1154: astore 14
    //   1156: aload 10
    //   1158: astore 12
    //   1160: aload 9
    //   1162: astore 10
    //   1164: aconst_null
    //   1165: astore 9
    //   1167: goto -401 -> 766
    //   1170: astore 9
    //   1172: aconst_null
    //   1173: astore 17
    //   1175: aload 17
    //   1177: ifnull +10 -> 1187
    //   1180: aload 17
    //   1182: invokeinterface 196 1 0
    //   1187: aload 9
    //   1189: athrow
    //   1190: astore 10
    //   1192: goto -702 -> 490
    //   1195: astore 10
    //   1197: goto -113 -> 1084
    //   1200: astore 9
    //   1202: aload 18
    //   1204: astore 9
    //   1206: aload 19
    //   1208: astore 10
    //   1210: aload 20
    //   1212: astore 12
    //   1214: aload 21
    //   1216: astore 14
    //   1218: aload 22
    //   1220: astore 15
    //   1222: aload 23
    //   1224: astore 16
    //   1226: goto -460 -> 766
    //   1229: astore 10
    //   1231: goto -44 -> 1187
    //   1234: astore 9
    //   1236: goto -61 -> 1175
    //   1239: astore 9
    //   1241: aconst_null
    //   1242: astore 9
    //   1244: aconst_null
    //   1245: astore 10
    //   1247: aconst_null
    //   1248: astore 12
    //   1250: aconst_null
    //   1251: astore 14
    //   1253: aload 17
    //   1255: astore 16
    //   1257: goto -153 -> 1104
    //   1260: astore 9
    //   1262: aconst_null
    //   1263: astore 9
    //   1265: aconst_null
    //   1266: astore 10
    //   1268: aconst_null
    //   1269: astore 12
    //   1271: aload 17
    //   1273: astore 16
    //   1275: goto -171 -> 1104
    //   1278: astore 9
    //   1280: aconst_null
    //   1281: astore 9
    //   1283: aconst_null
    //   1284: astore 10
    //   1286: aload 17
    //   1288: astore 16
    //   1290: goto -186 -> 1104
    //   1293: astore 9
    //   1295: aconst_null
    //   1296: astore 9
    //   1298: aload 17
    //   1300: astore 16
    //   1302: goto -198 -> 1104
    //   1305: astore 16
    //   1307: aload 17
    //   1309: astore 16
    //   1311: goto -207 -> 1104
    //   1314: astore 9
    //   1316: goto -244 -> 1072
    //   1319: astore 9
    //   1321: aload 10
    //   1323: astore 9
    //   1325: aload 11
    //   1327: astore 10
    //   1329: goto -294 -> 1035
    //   1332: astore 10
    //   1334: aload 11
    //   1336: astore 10
    //   1338: goto -303 -> 1035
    //   1341: astore 9
    //   1343: goto -865 -> 478
    //   1346: astore 9
    //   1348: aconst_null
    //   1349: astore 9
    //   1351: aconst_null
    //   1352: astore 10
    //   1354: goto -922 -> 432
    //   1357: astore 12
    //   1359: goto -927 -> 432
    //   1362: astore 12
    //   1364: aload 9
    //   1366: astore 12
    //   1368: aload 10
    //   1370: astore 9
    //   1372: aload 12
    //   1374: astore 10
    //   1376: goto -944 -> 432
    //   1379: aload 13
    //   1381: astore 11
    //   1383: goto -413 -> 970
    //   1386: aload 15
    //   1388: astore 16
    //   1390: aload 14
    //   1392: astore 15
    //   1394: aload 12
    //   1396: astore 14
    //   1398: aload 10
    //   1400: astore 12
    //   1402: aload 9
    //   1404: astore 10
    //   1406: aconst_null
    //   1407: astore 9
    //   1409: goto -643 -> 766
    //   1412: aconst_null
    //   1413: astore 18
    //   1415: aconst_null
    //   1416: astore 19
    //   1418: aconst_null
    //   1419: astore 20
    //   1421: aconst_null
    //   1422: astore 21
    //   1424: aconst_null
    //   1425: astore 22
    //   1427: aconst_null
    //   1428: astore 23
    //   1430: goto -724 -> 706
    //   1433: aload 12
    //   1435: astore 11
    //   1437: goto -920 -> 517
    //   1440: goto -1043 -> 397
    //   1443: aload 12
    //   1445: astore 9
    //   1447: goto -1251 -> 196
    //   1450: aload 9
    //   1452: astore 12
    //   1454: aload 10
    //   1456: astore 9
    //   1458: aload 12
    //   1460: astore 10
    //   1462: goto -1313 -> 149
    //   1465: aconst_null
    //   1466: astore 10
    //   1468: aconst_null
    //   1469: astore 9
    //   1471: goto -1299 -> 172
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1474	0	this	v
    //   0	1474	1	paramDouble1	double
    //   0	1474	3	paramDouble2	double
    //   50	342	5	d1	double
    //   110	280	7	d2	double
    //   15	383	9	localObject1	Object
    //   421	1	9	localException1	Exception
    //   427	45	9	localObject2	Object
    //   476	18	9	localObject3	Object
    //   529	479	9	localObject4	Object
    //   1021	40	9	localException2	Exception
    //   1067	18	9	localObject5	Object
    //   1087	1	9	localException3	Exception
    //   1090	76	9	localObject6	Object
    //   1170	18	9	localObject7	Object
    //   1200	1	9	localException4	Exception
    //   1204	1	9	localObject8	Object
    //   1234	1	9	localObject9	Object
    //   1239	1	9	localException5	Exception
    //   1242	1	9	localObject10	Object
    //   1260	1	9	localException6	Exception
    //   1263	1	9	localObject11	Object
    //   1278	1	9	localException7	Exception
    //   1281	1	9	localObject12	Object
    //   1293	1	9	localException8	Exception
    //   1296	1	9	localObject13	Object
    //   1314	1	9	localObject14	Object
    //   1319	1	9	localException9	Exception
    //   1323	1	9	localObject15	Object
    //   1341	1	9	localObject16	Object
    //   1346	1	9	localException10	Exception
    //   1349	121	9	localObject17	Object
    //   53	971	10	localObject18	Object
    //   1030	1	10	localException11	Exception
    //   1033	12	10	localObject19	Object
    //   1058	1	10	localException12	Exception
    //   1093	70	10	localObject20	Object
    //   1190	1	10	localException13	Exception
    //   1195	1	10	localException14	Exception
    //   1208	1	10	localObject21	Object
    //   1229	1	10	localException15	Exception
    //   1245	83	10	localObject22	Object
    //   1332	1	10	localException16	Exception
    //   1336	131	10	localObject23	Object
    //   1	401	11	localObject24	Object
    //   412	1	11	localException17	Exception
    //   424	22	11	localObject25	Object
    //   463	44	11	localException18	Exception
    //   515	921	11	localObject26	Object
    //   76	1194	12	localObject27	Object
    //   1357	1	12	localException19	Exception
    //   1362	1	12	localException20	Exception
    //   1366	93	12	localObject28	Object
    //   86	1294	13	localObject29	Object
    //   308	1089	14	localObject30	Object
    //   332	1061	15	localObject31	Object
    //   532	587	16	localObject32	Object
    //   1142	1	16	localException21	Exception
    //   1146	155	16	localObject33	Object
    //   1305	1	16	localException22	Exception
    //   1309	80	16	localObject34	Object
    //   544	764	17	localObject35	Object
    //   684	730	18	str	String
    //   704	713	19	localObject36	Object
    //   700	720	20	localObject37	Object
    //   696	727	21	localObject38	Object
    //   692	734	22	localObject39	Object
    //   688	741	23	localObject40	Object
    //   126	257	24	i	int
    //   40	3	25	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   185	192	412	java/lang/Exception
    //   3	29	421	java/lang/Exception
    //   445	452	463	java/lang/Exception
    //   3	29	476	finally
    //   506	513	1021	java/lang/Exception
    //   205	231	1030	java/lang/Exception
    //   1044	1051	1058	java/lang/Exception
    //   205	231	1067	finally
    //   534	546	1087	java/lang/Exception
    //   550	560	1087	java/lang/Exception
    //   564	574	1087	java/lang/Exception
    //   578	596	1087	java/lang/Exception
    //   1109	1116	1142	java/lang/Exception
    //   534	546	1170	finally
    //   483	490	1190	java/lang/Exception
    //   1077	1084	1195	java/lang/Exception
    //   735	742	1200	java/lang/Exception
    //   1180	1187	1229	java/lang/Exception
    //   550	560	1234	finally
    //   564	574	1234	finally
    //   578	596	1234	finally
    //   596	614	1234	finally
    //   614	632	1234	finally
    //   632	650	1234	finally
    //   650	668	1234	finally
    //   668	686	1234	finally
    //   596	614	1239	java/lang/Exception
    //   614	632	1260	java/lang/Exception
    //   632	650	1278	java/lang/Exception
    //   650	668	1293	java/lang/Exception
    //   668	686	1305	java/lang/Exception
    //   235	245	1314	finally
    //   254	263	1314	finally
    //   267	364	1314	finally
    //   372	380	1314	finally
    //   401	409	1314	finally
    //   235	245	1319	java/lang/Exception
    //   254	263	1319	java/lang/Exception
    //   401	409	1319	java/lang/Exception
    //   267	364	1332	java/lang/Exception
    //   372	380	1332	java/lang/Exception
    //   33	42	1341	finally
    //   58	112	1341	finally
    //   120	128	1341	finally
    //   149	157	1341	finally
    //   33	42	1346	java/lang/Exception
    //   149	157	1357	java/lang/Exception
    //   58	112	1362	java/lang/Exception
    //   120	128	1362	java/lang/Exception
  }
  
  void a(JSONObject paramJSONObject)
  {
    if ((this.d != null) && (this.d.isOpen())) {}
    try
    {
      this.d.beginTransaction();
      arrayOfx = x.a();
      j = arrayOfx.length;
      i = 0;
    }
    catch (Exception paramJSONObject)
    {
      for (;;)
      {
        int i;
        try
        {
          x[] arrayOfx;
          int j;
          Object localObject2;
          Object localObject1;
          ArrayList localArrayList;
          JSONObject localJSONObject;
          this.d.endTransaction();
          return;
        }
        catch (Exception paramJSONObject) {}
        i += 1;
      }
      this.d.setTransactionSuccessful();
      this.e = -1;
      this.f = -1;
      try
      {
        this.d.endTransaction();
        return;
      }
      catch (Exception paramJSONObject)
      {
        return;
      }
    }
    finally
    {
      try
      {
        this.d.endTransaction();
        throw paramJSONObject;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
    if (i < j)
    {
      localObject2 = arrayOfx[i];
      if (paramJSONObject.has(x.a((x)localObject2)))
      {
        localObject1 = "";
        if (paramJSONObject.has(x.b((x)localObject2))) {
          localObject1 = paramJSONObject.getString(x.b((x)localObject2));
        }
        localArrayList = new ArrayList();
        localJSONObject = paramJSONObject.getJSONObject(x.a((x)localObject2));
        localArrayList.add(x.a((x)localObject2, localJSONObject));
        localArrayList.addAll(((x)localObject2).a(localJSONObject, (String)localObject1, x.c((x)localObject2)));
        localObject1 = localArrayList.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (String)((Iterator)localObject1).next();
          this.d.execSQL((String)localObject2);
        }
      }
    }
  }
  
  /* Error */
  boolean a()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 7
    //   3: aconst_null
    //   4: astore_2
    //   5: aconst_null
    //   6: astore 4
    //   8: aconst_null
    //   9: astore 5
    //   11: aconst_null
    //   12: astore_3
    //   13: aload_0
    //   14: getfield 33	com/baidu/location/c/v:a	Lcom/baidu/location/c/i;
    //   17: invokevirtual 335	com/baidu/location/c/i:l	()Lcom/baidu/location/c/s;
    //   20: invokevirtual 339	com/baidu/location/c/s:l	()Z
    //   23: ifeq +151 -> 174
    //   26: aload_0
    //   27: getfield 37	com/baidu/location/c/v:f	I
    //   30: iconst_m1
    //   31: if_icmpne +143 -> 174
    //   34: aload_0
    //   35: getfield 35	com/baidu/location/c/v:e	I
    //   38: iconst_m1
    //   39: if_icmpne +135 -> 174
    //   42: aload_0
    //   43: getfield 39	com/baidu/location/c/v:d	Landroid/database/sqlite/SQLiteDatabase;
    //   46: ifnull +128 -> 174
    //   49: aload_0
    //   50: getfield 39	com/baidu/location/c/v:d	Landroid/database/sqlite/SQLiteDatabase;
    //   53: invokevirtual 47	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   56: ifeq +118 -> 174
    //   59: aload_0
    //   60: getfield 39	com/baidu/location/c/v:d	Landroid/database/sqlite/SQLiteDatabase;
    //   63: ldc_w 341
    //   66: aconst_null
    //   67: invokevirtual 167	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   70: astore_1
    //   71: aload 4
    //   73: astore_2
    //   74: aload 5
    //   76: astore_3
    //   77: aload_1
    //   78: invokeinterface 172 1 0
    //   83: pop
    //   84: aload 4
    //   86: astore_2
    //   87: aload 5
    //   89: astore_3
    //   90: aload_0
    //   91: aload_1
    //   92: iconst_0
    //   93: invokeinterface 345 2 0
    //   98: putfield 37	com/baidu/location/c/v:f	I
    //   101: aload 4
    //   103: astore_2
    //   104: aload 5
    //   106: astore_3
    //   107: aload_0
    //   108: getfield 39	com/baidu/location/c/v:d	Landroid/database/sqlite/SQLiteDatabase;
    //   111: ldc_w 347
    //   114: aconst_null
    //   115: invokevirtual 167	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   118: astore 4
    //   120: aload 4
    //   122: astore_2
    //   123: aload 4
    //   125: astore_3
    //   126: aload 4
    //   128: invokeinterface 172 1 0
    //   133: pop
    //   134: aload 4
    //   136: astore_2
    //   137: aload 4
    //   139: astore_3
    //   140: aload_0
    //   141: aload 4
    //   143: iconst_0
    //   144: invokeinterface 345 2 0
    //   149: putfield 35	com/baidu/location/c/v:e	I
    //   152: aload_1
    //   153: ifnull +9 -> 162
    //   156: aload_1
    //   157: invokeinterface 196 1 0
    //   162: aload 4
    //   164: ifnull +10 -> 174
    //   167: aload 4
    //   169: invokeinterface 196 1 0
    //   174: iload 7
    //   176: istore 6
    //   178: aload_0
    //   179: getfield 37	com/baidu/location/c/v:f	I
    //   182: ifne +17 -> 199
    //   185: iload 7
    //   187: istore 6
    //   189: aload_0
    //   190: getfield 35	com/baidu/location/c/v:e	I
    //   193: ifne +6 -> 199
    //   196: iconst_1
    //   197: istore 6
    //   199: iload 6
    //   201: ireturn
    //   202: astore_1
    //   203: aconst_null
    //   204: astore_1
    //   205: aload_1
    //   206: ifnull +9 -> 215
    //   209: aload_1
    //   210: invokeinterface 196 1 0
    //   215: aload_3
    //   216: ifnull -42 -> 174
    //   219: aload_3
    //   220: invokeinterface 196 1 0
    //   225: goto -51 -> 174
    //   228: astore_1
    //   229: goto -55 -> 174
    //   232: astore_3
    //   233: aconst_null
    //   234: astore_1
    //   235: aload_1
    //   236: ifnull +9 -> 245
    //   239: aload_1
    //   240: invokeinterface 196 1 0
    //   245: aload_2
    //   246: ifnull +9 -> 255
    //   249: aload_2
    //   250: invokeinterface 196 1 0
    //   255: aload_3
    //   256: athrow
    //   257: astore_1
    //   258: goto -96 -> 162
    //   261: astore_1
    //   262: goto -88 -> 174
    //   265: astore_1
    //   266: goto -51 -> 215
    //   269: astore_1
    //   270: goto -25 -> 245
    //   273: astore_1
    //   274: goto -19 -> 255
    //   277: astore_3
    //   278: goto -43 -> 235
    //   281: astore_2
    //   282: goto -77 -> 205
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	285	0	this	v
    //   70	87	1	localCursor1	android.database.Cursor
    //   202	1	1	localException1	Exception
    //   204	6	1	localObject1	Object
    //   228	1	1	localException2	Exception
    //   234	6	1	localObject2	Object
    //   257	1	1	localException3	Exception
    //   261	1	1	localException4	Exception
    //   265	1	1	localException5	Exception
    //   269	1	1	localException6	Exception
    //   273	1	1	localException7	Exception
    //   4	246	2	localObject3	Object
    //   281	1	2	localException8	Exception
    //   12	208	3	localObject4	Object
    //   232	24	3	localObject5	Object
    //   277	1	3	localObject6	Object
    //   6	162	4	localCursor2	android.database.Cursor
    //   9	96	5	localObject7	Object
    //   176	24	6	bool1	boolean
    //   1	185	7	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   59	71	202	java/lang/Exception
    //   219	225	228	java/lang/Exception
    //   59	71	232	finally
    //   156	162	257	java/lang/Exception
    //   167	174	261	java/lang/Exception
    //   209	215	265	java/lang/Exception
    //   239	245	269	java/lang/Exception
    //   249	255	273	java/lang/Exception
    //   77	84	277	finally
    //   90	101	277	finally
    //   107	120	277	finally
    //   126	134	277	finally
    //   140	152	277	finally
    //   77	84	281	java/lang/Exception
    //   90	101	281	java/lang/Exception
    //   107	120	281	java/lang/Exception
    //   126	134	281	java/lang/Exception
    //   140	152	281	java/lang/Exception
  }
  
  /* Error */
  List b(double paramDouble1, double paramDouble2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 10
    //   3: new 287	java/util/ArrayList
    //   6: dup
    //   7: invokespecial 288	java/util/ArrayList:<init>	()V
    //   10: astore 11
    //   12: getstatic 350	com/baidu/location/c/x:d	Lcom/baidu/location/c/x;
    //   15: aload_0
    //   16: getfield 41	com/baidu/location/c/v:c	I
    //   19: dload_1
    //   20: dload_3
    //   21: invokestatic 163	com/baidu/location/c/x:a	(Lcom/baidu/location/c/x;IDD)Ljava/lang/String;
    //   24: astore 9
    //   26: new 352	java/util/HashMap
    //   29: dup
    //   30: invokespecial 353	java/util/HashMap:<init>	()V
    //   33: astore 12
    //   35: new 287	java/util/ArrayList
    //   38: dup
    //   39: invokespecial 288	java/util/ArrayList:<init>	()V
    //   42: astore 13
    //   44: aload_0
    //   45: getfield 39	com/baidu/location/c/v:d	Landroid/database/sqlite/SQLiteDatabase;
    //   48: aload 9
    //   50: aconst_null
    //   51: invokevirtual 167	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   54: astore 9
    //   56: aload 9
    //   58: invokeinterface 172 1 0
    //   63: ifeq +262 -> 325
    //   66: aload 9
    //   68: invokeinterface 177 1 0
    //   73: ifne +252 -> 325
    //   76: aload 9
    //   78: iconst_0
    //   79: invokeinterface 181 2 0
    //   84: astore 10
    //   86: aload 9
    //   88: iconst_2
    //   89: invokeinterface 181 2 0
    //   94: astore 14
    //   96: aload 9
    //   98: iconst_4
    //   99: invokeinterface 185 2 0
    //   104: dstore 5
    //   106: aload 9
    //   108: iconst_5
    //   109: invokeinterface 185 2 0
    //   114: dstore 7
    //   116: aload 9
    //   118: bipush 6
    //   120: invokeinterface 345 2 0
    //   125: istore 15
    //   127: aload_0
    //   128: dload_3
    //   129: dload_1
    //   130: dload 7
    //   132: dload 5
    //   134: invokespecial 187	com/baidu/location/c/v:c	(DDDD)D
    //   137: dstore 5
    //   139: dload 5
    //   141: getstatic 350	com/baidu/location/c/x:d	Lcom/baidu/location/c/x;
    //   144: invokestatic 190	com/baidu/location/c/x:d	(Lcom/baidu/location/c/x;)I
    //   147: i2d
    //   148: dcmpg
    //   149: ifge +63 -> 212
    //   152: aload 12
    //   154: new 355	com/baidu/location/Poi
    //   157: dup
    //   158: new 112	java/lang/String
    //   161: dup
    //   162: aload 10
    //   164: invokevirtual 229	java/lang/String:getBytes	()[B
    //   167: invokestatic 234	com/baidu/location/f/b/b:a	([B)[B
    //   170: invokespecial 237	java/lang/String:<init>	([B)V
    //   173: new 112	java/lang/String
    //   176: dup
    //   177: aload 14
    //   179: invokevirtual 229	java/lang/String:getBytes	()[B
    //   182: invokestatic 234	com/baidu/location/f/b/b:a	([B)[B
    //   185: invokespecial 237	java/lang/String:<init>	([B)V
    //   188: dconst_0
    //   189: invokespecial 358	com/baidu/location/Poi:<init>	(Ljava/lang/String;Ljava/lang/String;D)V
    //   192: iload 15
    //   194: dload 5
    //   196: d2f
    //   197: invokestatic 362	java/lang/Math:round	(F)I
    //   200: invokestatic 364	com/baidu/location/c/v:a	(II)I
    //   203: invokestatic 370	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   206: invokeinterface 376 3 0
    //   211: pop
    //   212: aload 9
    //   214: invokeinterface 193 1 0
    //   219: pop
    //   220: goto -154 -> 66
    //   223: astore 10
    //   225: aload 9
    //   227: ifnull +10 -> 237
    //   230: aload 9
    //   232: invokeinterface 196 1 0
    //   237: aload 13
    //   239: aload 12
    //   241: invokeinterface 380 1 0
    //   246: invokeinterface 310 2 0
    //   251: pop
    //   252: aload 13
    //   254: new 382	com/baidu/location/c/y
    //   257: dup
    //   258: aload_0
    //   259: invokespecial 385	com/baidu/location/c/y:<init>	(Lcom/baidu/location/c/v;)V
    //   262: invokestatic 391	java/util/Collections:sort	(Ljava/util/List;Ljava/util/Comparator;)V
    //   265: aload 13
    //   267: invokeinterface 395 1 0
    //   272: ifle +50 -> 322
    //   275: aload 13
    //   277: iconst_0
    //   278: invokeinterface 399 2 0
    //   283: checkcast 401	java/util/Map$Entry
    //   286: invokeinterface 404 1 0
    //   291: checkcast 355	com/baidu/location/Poi
    //   294: astore 9
    //   296: aload 11
    //   298: new 355	com/baidu/location/Poi
    //   301: dup
    //   302: aload 9
    //   304: invokevirtual 406	com/baidu/location/Poi:a	()Ljava/lang/String;
    //   307: aload 9
    //   309: invokevirtual 408	com/baidu/location/Poi:c	()Ljava/lang/String;
    //   312: dconst_1
    //   313: invokespecial 358	com/baidu/location/Poi:<init>	(Ljava/lang/String;Ljava/lang/String;D)V
    //   316: invokeinterface 301 2 0
    //   321: pop
    //   322: aload 11
    //   324: areturn
    //   325: aload 9
    //   327: ifnull -90 -> 237
    //   330: aload 9
    //   332: invokeinterface 196 1 0
    //   337: goto -100 -> 237
    //   340: astore 9
    //   342: goto -105 -> 237
    //   345: astore 9
    //   347: aload 10
    //   349: ifnull +10 -> 359
    //   352: aload 10
    //   354: invokeinterface 196 1 0
    //   359: aload 9
    //   361: athrow
    //   362: astore 9
    //   364: goto -127 -> 237
    //   367: astore 10
    //   369: goto -10 -> 359
    //   372: astore 11
    //   374: aload 9
    //   376: astore 10
    //   378: aload 11
    //   380: astore 9
    //   382: goto -35 -> 347
    //   385: astore 9
    //   387: aconst_null
    //   388: astore 9
    //   390: goto -165 -> 225
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	393	0	this	v
    //   0	393	1	paramDouble1	double
    //   0	393	3	paramDouble2	double
    //   104	91	5	d1	double
    //   114	17	7	d2	double
    //   24	307	9	localObject1	Object
    //   340	1	9	localException1	Exception
    //   345	15	9	localObject2	Object
    //   362	13	9	localException2	Exception
    //   380	1	9	localObject3	Object
    //   385	1	9	localException3	Exception
    //   388	1	9	localObject4	Object
    //   1	162	10	str1	String
    //   223	130	10	localException4	Exception
    //   367	1	10	localException5	Exception
    //   376	1	10	localObject5	Object
    //   10	313	11	localArrayList1	ArrayList
    //   372	7	11	localObject6	Object
    //   33	207	12	localHashMap	java.util.HashMap
    //   42	234	13	localArrayList2	ArrayList
    //   94	84	14	str2	String
    //   125	68	15	i	int
    // Exception table:
    //   from	to	target	type
    //   56	66	223	java/lang/Exception
    //   66	212	223	java/lang/Exception
    //   212	220	223	java/lang/Exception
    //   330	337	340	java/lang/Exception
    //   44	56	345	finally
    //   230	237	362	java/lang/Exception
    //   352	359	367	java/lang/Exception
    //   56	66	372	finally
    //   66	212	372	finally
    //   212	220	372	finally
    //   44	56	385	java/lang/Exception
  }
  
  /* Error */
  JSONObject b()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 10
    //   3: aconst_null
    //   4: astore 12
    //   6: aconst_null
    //   7: astore 8
    //   9: aconst_null
    //   10: astore 11
    //   12: aconst_null
    //   13: astore 13
    //   15: aconst_null
    //   16: astore 7
    //   18: new 274	org/json/JSONObject
    //   21: dup
    //   22: invokespecial 410	org/json/JSONObject:<init>	()V
    //   25: astore 9
    //   27: new 120	java/lang/StringBuffer
    //   30: dup
    //   31: invokespecial 121	java/lang/StringBuffer:<init>	()V
    //   34: astore 14
    //   36: new 120	java/lang/StringBuffer
    //   39: dup
    //   40: invokespecial 121	java/lang/StringBuffer:<init>	()V
    //   43: astore 15
    //   45: invokestatic 416	java/lang/System:currentTimeMillis	()J
    //   48: ldc2_w 417
    //   51: ldiv
    //   52: l2i
    //   53: istore 17
    //   55: aload 7
    //   57: astore 5
    //   59: aload 8
    //   61: astore_3
    //   62: aload 11
    //   64: astore 6
    //   66: aload 10
    //   68: astore 4
    //   70: aload 13
    //   72: astore_2
    //   73: aload 12
    //   75: astore_1
    //   76: aload_0
    //   77: getfield 39	com/baidu/location/c/v:d	Landroid/database/sqlite/SQLiteDatabase;
    //   80: ifnull +1369 -> 1449
    //   83: aload 7
    //   85: astore 5
    //   87: aload 8
    //   89: astore_3
    //   90: aload 11
    //   92: astore 6
    //   94: aload 10
    //   96: astore 4
    //   98: aload 13
    //   100: astore_2
    //   101: aload 12
    //   103: astore_1
    //   104: aload_0
    //   105: getfield 39	com/baidu/location/c/v:d	Landroid/database/sqlite/SQLiteDatabase;
    //   108: invokevirtual 47	android/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   111: ifeq +1338 -> 1449
    //   114: aload 7
    //   116: astore 5
    //   118: aload 8
    //   120: astore_3
    //   121: aload 11
    //   123: astore 6
    //   125: aload 10
    //   127: astore 4
    //   129: new 420	org/json/JSONArray
    //   132: dup
    //   133: invokespecial 421	org/json/JSONArray:<init>	()V
    //   136: astore 12
    //   138: aload 7
    //   140: astore 5
    //   142: aload 8
    //   144: astore_3
    //   145: aload 11
    //   147: astore 6
    //   149: aload 10
    //   151: astore 4
    //   153: new 420	org/json/JSONArray
    //   156: dup
    //   157: invokespecial 421	org/json/JSONArray:<init>	()V
    //   160: astore 13
    //   162: aload 7
    //   164: astore 5
    //   166: aload 8
    //   168: astore_3
    //   169: aload 11
    //   171: astore 6
    //   173: aload 10
    //   175: astore 4
    //   177: new 420	org/json/JSONArray
    //   180: dup
    //   181: invokespecial 421	org/json/JSONArray:<init>	()V
    //   184: astore_1
    //   185: aload 7
    //   187: astore 5
    //   189: aload 8
    //   191: astore_3
    //   192: aload 11
    //   194: astore 6
    //   196: aload 10
    //   198: astore 4
    //   200: new 420	org/json/JSONArray
    //   203: dup
    //   204: invokespecial 421	org/json/JSONArray:<init>	()V
    //   207: astore_2
    //   208: aload 7
    //   210: astore 5
    //   212: aload 8
    //   214: astore_3
    //   215: aload 11
    //   217: astore 6
    //   219: aload 10
    //   221: astore 4
    //   223: aload_0
    //   224: getfield 39	com/baidu/location/c/v:d	Landroid/database/sqlite/SQLiteDatabase;
    //   227: ldc_w 423
    //   230: iconst_3
    //   231: anewarray 4	java/lang/Object
    //   234: dup
    //   235: iconst_0
    //   236: iconst_0
    //   237: invokestatic 370	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   240: aastore
    //   241: dup
    //   242: iconst_1
    //   243: iload 17
    //   245: invokestatic 370	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   248: aastore
    //   249: dup
    //   250: iconst_2
    //   251: aload_0
    //   252: getfield 33	com/baidu/location/c/v:a	Lcom/baidu/location/c/i;
    //   255: invokevirtual 335	com/baidu/location/c/i:l	()Lcom/baidu/location/c/s;
    //   258: invokevirtual 426	com/baidu/location/c/s:p	()I
    //   261: invokestatic 370	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   264: aastore
    //   265: invokestatic 430	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   268: aconst_null
    //   269: invokevirtual 167	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   272: astore 7
    //   274: aload 7
    //   276: astore 5
    //   278: aload 8
    //   280: astore_3
    //   281: aload 7
    //   283: astore 6
    //   285: aload 10
    //   287: astore 4
    //   289: aload_0
    //   290: getfield 39	com/baidu/location/c/v:d	Landroid/database/sqlite/SQLiteDatabase;
    //   293: ldc_w 423
    //   296: iconst_3
    //   297: anewarray 4	java/lang/Object
    //   300: dup
    //   301: iconst_0
    //   302: iconst_1
    //   303: invokestatic 370	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   306: aastore
    //   307: dup
    //   308: iconst_1
    //   309: iload 17
    //   311: invokestatic 370	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   314: aastore
    //   315: dup
    //   316: iconst_2
    //   317: aload_0
    //   318: getfield 33	com/baidu/location/c/v:a	Lcom/baidu/location/c/i;
    //   321: invokevirtual 335	com/baidu/location/c/i:l	()Lcom/baidu/location/c/s;
    //   324: invokevirtual 433	com/baidu/location/c/s:q	()I
    //   327: invokestatic 370	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   330: aastore
    //   331: invokestatic 430	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   334: aconst_null
    //   335: invokevirtual 167	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   338: astore 8
    //   340: aload 7
    //   342: astore 5
    //   344: aload 8
    //   346: astore_3
    //   347: aload 7
    //   349: astore 6
    //   351: aload 8
    //   353: astore 4
    //   355: aload 7
    //   357: invokeinterface 172 1 0
    //   362: ifeq +418 -> 780
    //   365: aload 7
    //   367: astore 5
    //   369: aload 8
    //   371: astore_3
    //   372: aload 7
    //   374: astore 6
    //   376: aload 8
    //   378: astore 4
    //   380: new 435	java/util/HashSet
    //   383: dup
    //   384: invokespecial 436	java/util/HashSet:<init>	()V
    //   387: astore 10
    //   389: aload 7
    //   391: astore 5
    //   393: aload 8
    //   395: astore_3
    //   396: aload 7
    //   398: astore 6
    //   400: aload 8
    //   402: astore 4
    //   404: aload 7
    //   406: invokeinterface 177 1 0
    //   411: ifne +261 -> 672
    //   414: aload 7
    //   416: astore 5
    //   418: aload 8
    //   420: astore_3
    //   421: aload 7
    //   423: astore 6
    //   425: aload 8
    //   427: astore 4
    //   429: aload 7
    //   431: iconst_0
    //   432: invokeinterface 181 2 0
    //   437: astore 11
    //   439: aload 7
    //   441: astore 5
    //   443: aload 8
    //   445: astore_3
    //   446: aload 7
    //   448: astore 6
    //   450: aload 8
    //   452: astore 4
    //   454: aload 7
    //   456: iconst_1
    //   457: invokeinterface 181 2 0
    //   462: astore 16
    //   464: aload 7
    //   466: astore 5
    //   468: aload 8
    //   470: astore_3
    //   471: aload 7
    //   473: astore 6
    //   475: aload 8
    //   477: astore 4
    //   479: aload_1
    //   480: aload 11
    //   482: invokevirtual 439	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   485: pop
    //   486: aload 7
    //   488: astore 5
    //   490: aload 8
    //   492: astore_3
    //   493: aload 7
    //   495: astore 6
    //   497: aload 8
    //   499: astore 4
    //   501: aload 10
    //   503: aload 16
    //   505: invokevirtual 440	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   508: pop
    //   509: aload 7
    //   511: astore 5
    //   513: aload 8
    //   515: astore_3
    //   516: aload 7
    //   518: astore 6
    //   520: aload 8
    //   522: astore 4
    //   524: aload 15
    //   526: invokevirtual 443	java/lang/StringBuffer:length	()I
    //   529: ifle +27 -> 556
    //   532: aload 7
    //   534: astore 5
    //   536: aload 8
    //   538: astore_3
    //   539: aload 7
    //   541: astore 6
    //   543: aload 8
    //   545: astore 4
    //   547: aload 15
    //   549: ldc_w 445
    //   552: invokevirtual 448	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   555: pop
    //   556: aload 7
    //   558: astore 5
    //   560: aload 8
    //   562: astore_3
    //   563: aload 7
    //   565: astore 6
    //   567: aload 8
    //   569: astore 4
    //   571: aload 15
    //   573: ldc_w 450
    //   576: invokevirtual 448	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   579: aload 11
    //   581: invokevirtual 448	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   584: ldc_w 450
    //   587: invokevirtual 448	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   590: pop
    //   591: aload 7
    //   593: astore 5
    //   595: aload 8
    //   597: astore_3
    //   598: aload 7
    //   600: astore 6
    //   602: aload 8
    //   604: astore 4
    //   606: aload 7
    //   608: invokeinterface 193 1 0
    //   613: pop
    //   614: goto -225 -> 389
    //   617: astore_1
    //   618: aload 5
    //   620: ifnull +10 -> 630
    //   623: aload 5
    //   625: invokeinterface 196 1 0
    //   630: aload_3
    //   631: ifnull +9 -> 640
    //   634: aload_3
    //   635: invokeinterface 196 1 0
    //   640: aload 9
    //   642: astore_1
    //   643: aload 9
    //   645: ldc_w 452
    //   648: invokevirtual 278	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   651: ifne +19 -> 670
    //   654: aload 9
    //   656: astore_1
    //   657: aload 9
    //   659: ldc_w 454
    //   662: invokevirtual 278	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   665: ifne +5 -> 670
    //   668: aconst_null
    //   669: astore_1
    //   670: aload_1
    //   671: areturn
    //   672: aload 7
    //   674: astore 5
    //   676: aload 8
    //   678: astore_3
    //   679: aload 7
    //   681: astore 6
    //   683: aload 8
    //   685: astore 4
    //   687: aload 10
    //   689: invokevirtual 455	java/util/HashSet:size	()I
    //   692: anewarray 112	java/lang/String
    //   695: astore 11
    //   697: aload 7
    //   699: astore 5
    //   701: aload 8
    //   703: astore_3
    //   704: aload 7
    //   706: astore 6
    //   708: aload 8
    //   710: astore 4
    //   712: aload 10
    //   714: aload 11
    //   716: invokevirtual 459	java/util/HashSet:toArray	([Ljava/lang/Object;)[Ljava/lang/Object;
    //   719: pop
    //   720: iconst_0
    //   721: istore 17
    //   723: aload 7
    //   725: astore 5
    //   727: aload 8
    //   729: astore_3
    //   730: aload 7
    //   732: astore 6
    //   734: aload 8
    //   736: astore 4
    //   738: iload 17
    //   740: aload 11
    //   742: arraylength
    //   743: if_icmpge +37 -> 780
    //   746: aload 7
    //   748: astore 5
    //   750: aload 8
    //   752: astore_3
    //   753: aload 7
    //   755: astore 6
    //   757: aload 8
    //   759: astore 4
    //   761: aload_2
    //   762: aload 11
    //   764: iload 17
    //   766: aaload
    //   767: invokevirtual 439	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   770: pop
    //   771: iload 17
    //   773: iconst_1
    //   774: iadd
    //   775: istore 17
    //   777: goto -54 -> 723
    //   780: aload 7
    //   782: astore 5
    //   784: aload 8
    //   786: astore_3
    //   787: aload 7
    //   789: astore 6
    //   791: aload 8
    //   793: astore 4
    //   795: aload 8
    //   797: invokeinterface 172 1 0
    //   802: ifeq +392 -> 1194
    //   805: aload 7
    //   807: astore 5
    //   809: aload 8
    //   811: astore_3
    //   812: aload 7
    //   814: astore 6
    //   816: aload 8
    //   818: astore 4
    //   820: new 435	java/util/HashSet
    //   823: dup
    //   824: invokespecial 436	java/util/HashSet:<init>	()V
    //   827: astore 10
    //   829: aload 7
    //   831: astore 5
    //   833: aload 8
    //   835: astore_3
    //   836: aload 7
    //   838: astore 6
    //   840: aload 8
    //   842: astore 4
    //   844: aload 8
    //   846: invokeinterface 177 1 0
    //   851: ifne +234 -> 1085
    //   854: aload 7
    //   856: astore 5
    //   858: aload 8
    //   860: astore_3
    //   861: aload 7
    //   863: astore 6
    //   865: aload 8
    //   867: astore 4
    //   869: aload 8
    //   871: iconst_0
    //   872: invokeinterface 181 2 0
    //   877: astore 11
    //   879: aload 7
    //   881: astore 5
    //   883: aload 8
    //   885: astore_3
    //   886: aload 7
    //   888: astore 6
    //   890: aload 8
    //   892: astore 4
    //   894: aload 8
    //   896: iconst_1
    //   897: invokeinterface 181 2 0
    //   902: astore 16
    //   904: aload 7
    //   906: astore 5
    //   908: aload 8
    //   910: astore_3
    //   911: aload 7
    //   913: astore 6
    //   915: aload 8
    //   917: astore 4
    //   919: aload 12
    //   921: aload 11
    //   923: invokevirtual 439	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   926: pop
    //   927: aload 7
    //   929: astore 5
    //   931: aload 8
    //   933: astore_3
    //   934: aload 7
    //   936: astore 6
    //   938: aload 8
    //   940: astore 4
    //   942: aload 10
    //   944: aload 16
    //   946: invokevirtual 440	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   949: pop
    //   950: aload 7
    //   952: astore 5
    //   954: aload 8
    //   956: astore_3
    //   957: aload 7
    //   959: astore 6
    //   961: aload 8
    //   963: astore 4
    //   965: aload 14
    //   967: invokevirtual 443	java/lang/StringBuffer:length	()I
    //   970: ifle +27 -> 997
    //   973: aload 7
    //   975: astore 5
    //   977: aload 8
    //   979: astore_3
    //   980: aload 7
    //   982: astore 6
    //   984: aload 8
    //   986: astore 4
    //   988: aload 14
    //   990: ldc_w 445
    //   993: invokevirtual 448	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   996: pop
    //   997: aload 7
    //   999: astore 5
    //   1001: aload 8
    //   1003: astore_3
    //   1004: aload 7
    //   1006: astore 6
    //   1008: aload 8
    //   1010: astore 4
    //   1012: aload 14
    //   1014: ldc_w 450
    //   1017: invokevirtual 448	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1020: aload 11
    //   1022: invokevirtual 448	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1025: ldc_w 450
    //   1028: invokevirtual 448	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1031: pop
    //   1032: aload 7
    //   1034: astore 5
    //   1036: aload 8
    //   1038: astore_3
    //   1039: aload 7
    //   1041: astore 6
    //   1043: aload 8
    //   1045: astore 4
    //   1047: aload 8
    //   1049: invokeinterface 193 1 0
    //   1054: pop
    //   1055: goto -226 -> 829
    //   1058: astore_1
    //   1059: aload 6
    //   1061: ifnull +10 -> 1071
    //   1064: aload 6
    //   1066: invokeinterface 196 1 0
    //   1071: aload 4
    //   1073: ifnull +10 -> 1083
    //   1076: aload 4
    //   1078: invokeinterface 196 1 0
    //   1083: aload_1
    //   1084: athrow
    //   1085: aload 7
    //   1087: astore 5
    //   1089: aload 8
    //   1091: astore_3
    //   1092: aload 7
    //   1094: astore 6
    //   1096: aload 8
    //   1098: astore 4
    //   1100: aload 10
    //   1102: invokevirtual 455	java/util/HashSet:size	()I
    //   1105: anewarray 112	java/lang/String
    //   1108: astore 11
    //   1110: aload 7
    //   1112: astore 5
    //   1114: aload 8
    //   1116: astore_3
    //   1117: aload 7
    //   1119: astore 6
    //   1121: aload 8
    //   1123: astore 4
    //   1125: aload 10
    //   1127: aload 11
    //   1129: invokevirtual 459	java/util/HashSet:toArray	([Ljava/lang/Object;)[Ljava/lang/Object;
    //   1132: pop
    //   1133: iconst_0
    //   1134: istore 17
    //   1136: aload 7
    //   1138: astore 5
    //   1140: aload 8
    //   1142: astore_3
    //   1143: aload 7
    //   1145: astore 6
    //   1147: aload 8
    //   1149: astore 4
    //   1151: iload 17
    //   1153: aload 11
    //   1155: arraylength
    //   1156: if_icmpge +38 -> 1194
    //   1159: aload 7
    //   1161: astore 5
    //   1163: aload 8
    //   1165: astore_3
    //   1166: aload 7
    //   1168: astore 6
    //   1170: aload 8
    //   1172: astore 4
    //   1174: aload 13
    //   1176: aload 11
    //   1178: iload 17
    //   1180: aaload
    //   1181: invokevirtual 439	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   1184: pop
    //   1185: iload 17
    //   1187: iconst_1
    //   1188: iadd
    //   1189: istore 17
    //   1191: goto -55 -> 1136
    //   1194: aload 7
    //   1196: astore 5
    //   1198: aload 8
    //   1200: astore_3
    //   1201: aload 7
    //   1203: astore 6
    //   1205: aload 8
    //   1207: astore 4
    //   1209: aload_1
    //   1210: invokevirtual 460	org/json/JSONArray:length	()I
    //   1213: ifeq +103 -> 1316
    //   1216: aload 7
    //   1218: astore 5
    //   1220: aload 8
    //   1222: astore_3
    //   1223: aload 7
    //   1225: astore 6
    //   1227: aload 8
    //   1229: astore 4
    //   1231: new 274	org/json/JSONObject
    //   1234: dup
    //   1235: invokespecial 410	org/json/JSONObject:<init>	()V
    //   1238: astore 10
    //   1240: aload 7
    //   1242: astore 5
    //   1244: aload 8
    //   1246: astore_3
    //   1247: aload 7
    //   1249: astore 6
    //   1251: aload 8
    //   1253: astore 4
    //   1255: aload 10
    //   1257: ldc_w 462
    //   1260: aload_1
    //   1261: invokevirtual 465	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   1264: pop
    //   1265: aload 7
    //   1267: astore 5
    //   1269: aload 8
    //   1271: astore_3
    //   1272: aload 7
    //   1274: astore 6
    //   1276: aload 8
    //   1278: astore 4
    //   1280: aload 10
    //   1282: ldc_w 467
    //   1285: aload_2
    //   1286: invokevirtual 465	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   1289: pop
    //   1290: aload 7
    //   1292: astore 5
    //   1294: aload 8
    //   1296: astore_3
    //   1297: aload 7
    //   1299: astore 6
    //   1301: aload 8
    //   1303: astore 4
    //   1305: aload 9
    //   1307: ldc_w 454
    //   1310: aload 10
    //   1312: invokevirtual 465	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   1315: pop
    //   1316: aload 7
    //   1318: astore 5
    //   1320: aload 8
    //   1322: astore_3
    //   1323: aload 7
    //   1325: astore 6
    //   1327: aload 8
    //   1329: astore 4
    //   1331: aload 7
    //   1333: astore_2
    //   1334: aload 8
    //   1336: astore_1
    //   1337: aload 12
    //   1339: invokevirtual 460	org/json/JSONArray:length	()I
    //   1342: ifeq +107 -> 1449
    //   1345: aload 7
    //   1347: astore 5
    //   1349: aload 8
    //   1351: astore_3
    //   1352: aload 7
    //   1354: astore 6
    //   1356: aload 8
    //   1358: astore 4
    //   1360: new 274	org/json/JSONObject
    //   1363: dup
    //   1364: invokespecial 410	org/json/JSONObject:<init>	()V
    //   1367: astore_1
    //   1368: aload 7
    //   1370: astore 5
    //   1372: aload 8
    //   1374: astore_3
    //   1375: aload 7
    //   1377: astore 6
    //   1379: aload 8
    //   1381: astore 4
    //   1383: aload_1
    //   1384: ldc_w 462
    //   1387: aload 12
    //   1389: invokevirtual 465	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   1392: pop
    //   1393: aload 7
    //   1395: astore 5
    //   1397: aload 8
    //   1399: astore_3
    //   1400: aload 7
    //   1402: astore 6
    //   1404: aload 8
    //   1406: astore 4
    //   1408: aload_1
    //   1409: ldc_w 467
    //   1412: aload 13
    //   1414: invokevirtual 465	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   1417: pop
    //   1418: aload 7
    //   1420: astore 5
    //   1422: aload 8
    //   1424: astore_3
    //   1425: aload 7
    //   1427: astore 6
    //   1429: aload 8
    //   1431: astore 4
    //   1433: aload 9
    //   1435: ldc_w 452
    //   1438: aload_1
    //   1439: invokevirtual 465	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   1442: pop
    //   1443: aload 8
    //   1445: astore_1
    //   1446: aload 7
    //   1448: astore_2
    //   1449: aload_2
    //   1450: astore 5
    //   1452: aload_1
    //   1453: astore_3
    //   1454: aload_2
    //   1455: astore 6
    //   1457: aload_1
    //   1458: astore 4
    //   1460: aload 15
    //   1462: invokevirtual 443	java/lang/StringBuffer:length	()I
    //   1465: ifle +64 -> 1529
    //   1468: aload_2
    //   1469: astore 5
    //   1471: aload_1
    //   1472: astore_3
    //   1473: aload_2
    //   1474: astore 6
    //   1476: aload_1
    //   1477: astore 4
    //   1479: getstatic 473	java/util/Locale:US	Ljava/util/Locale;
    //   1482: ldc_w 475
    //   1485: iconst_2
    //   1486: anewarray 4	java/lang/Object
    //   1489: dup
    //   1490: iconst_0
    //   1491: iconst_0
    //   1492: invokestatic 370	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1495: aastore
    //   1496: dup
    //   1497: iconst_1
    //   1498: aload 15
    //   1500: invokevirtual 129	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   1503: aastore
    //   1504: invokestatic 478	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1507: astore 7
    //   1509: aload_2
    //   1510: astore 5
    //   1512: aload_1
    //   1513: astore_3
    //   1514: aload_2
    //   1515: astore 6
    //   1517: aload_1
    //   1518: astore 4
    //   1520: aload_0
    //   1521: getfield 39	com/baidu/location/c/v:d	Landroid/database/sqlite/SQLiteDatabase;
    //   1524: aload 7
    //   1526: invokevirtual 53	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   1529: aload_2
    //   1530: astore 5
    //   1532: aload_1
    //   1533: astore_3
    //   1534: aload_2
    //   1535: astore 6
    //   1537: aload_1
    //   1538: astore 4
    //   1540: aload 14
    //   1542: invokevirtual 443	java/lang/StringBuffer:length	()I
    //   1545: ifle +64 -> 1609
    //   1548: aload_2
    //   1549: astore 5
    //   1551: aload_1
    //   1552: astore_3
    //   1553: aload_2
    //   1554: astore 6
    //   1556: aload_1
    //   1557: astore 4
    //   1559: getstatic 473	java/util/Locale:US	Ljava/util/Locale;
    //   1562: ldc_w 475
    //   1565: iconst_2
    //   1566: anewarray 4	java/lang/Object
    //   1569: dup
    //   1570: iconst_0
    //   1571: iconst_1
    //   1572: invokestatic 370	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1575: aastore
    //   1576: dup
    //   1577: iconst_1
    //   1578: aload 14
    //   1580: invokevirtual 129	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   1583: aastore
    //   1584: invokestatic 478	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1587: astore 7
    //   1589: aload_2
    //   1590: astore 5
    //   1592: aload_1
    //   1593: astore_3
    //   1594: aload_2
    //   1595: astore 6
    //   1597: aload_1
    //   1598: astore 4
    //   1600: aload_0
    //   1601: getfield 39	com/baidu/location/c/v:d	Landroid/database/sqlite/SQLiteDatabase;
    //   1604: aload 7
    //   1606: invokevirtual 53	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   1609: aload_2
    //   1610: ifnull +9 -> 1619
    //   1613: aload_2
    //   1614: invokeinterface 196 1 0
    //   1619: aload_1
    //   1620: ifnull -980 -> 640
    //   1623: aload_1
    //   1624: invokeinterface 196 1 0
    //   1629: goto -989 -> 640
    //   1632: astore_1
    //   1633: goto -993 -> 640
    //   1636: astore_2
    //   1637: goto -18 -> 1619
    //   1640: astore_1
    //   1641: goto -1011 -> 630
    //   1644: astore_1
    //   1645: goto -1005 -> 640
    //   1648: astore_2
    //   1649: goto -578 -> 1071
    //   1652: astore_2
    //   1653: goto -570 -> 1083
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1656	0	this	v
    //   75	405	1	localJSONArray1	org.json.JSONArray
    //   617	1	1	localException1	Exception
    //   642	29	1	localJSONObject1	JSONObject
    //   1058	203	1	localObject1	Object
    //   1336	288	1	localObject2	Object
    //   1632	1	1	localException2	Exception
    //   1640	1	1	localException3	Exception
    //   1644	1	1	localException4	Exception
    //   72	1542	2	localObject3	Object
    //   1636	1	2	localException5	Exception
    //   1648	1	2	localException6	Exception
    //   1652	1	2	localException7	Exception
    //   61	1533	3	localObject4	Object
    //   68	1531	4	localObject5	Object
    //   57	1534	5	localObject6	Object
    //   64	1532	6	localObject7	Object
    //   16	1589	7	localObject8	Object
    //   7	1437	8	localCursor	android.database.Cursor
    //   25	1409	9	localJSONObject2	JSONObject
    //   1	1310	10	localObject9	Object
    //   10	1167	11	localObject10	Object
    //   4	1384	12	localJSONArray2	org.json.JSONArray
    //   13	1400	13	localJSONArray3	org.json.JSONArray
    //   34	1545	14	localStringBuffer1	StringBuffer
    //   43	1456	15	localStringBuffer2	StringBuffer
    //   462	483	16	str	String
    //   53	1137	17	i	int
    // Exception table:
    //   from	to	target	type
    //   76	83	617	java/lang/Exception
    //   104	114	617	java/lang/Exception
    //   129	138	617	java/lang/Exception
    //   153	162	617	java/lang/Exception
    //   177	185	617	java/lang/Exception
    //   200	208	617	java/lang/Exception
    //   223	274	617	java/lang/Exception
    //   289	340	617	java/lang/Exception
    //   355	365	617	java/lang/Exception
    //   380	389	617	java/lang/Exception
    //   404	414	617	java/lang/Exception
    //   429	439	617	java/lang/Exception
    //   454	464	617	java/lang/Exception
    //   479	486	617	java/lang/Exception
    //   501	509	617	java/lang/Exception
    //   524	532	617	java/lang/Exception
    //   547	556	617	java/lang/Exception
    //   571	591	617	java/lang/Exception
    //   606	614	617	java/lang/Exception
    //   687	697	617	java/lang/Exception
    //   712	720	617	java/lang/Exception
    //   738	746	617	java/lang/Exception
    //   761	771	617	java/lang/Exception
    //   795	805	617	java/lang/Exception
    //   820	829	617	java/lang/Exception
    //   844	854	617	java/lang/Exception
    //   869	879	617	java/lang/Exception
    //   894	904	617	java/lang/Exception
    //   919	927	617	java/lang/Exception
    //   942	950	617	java/lang/Exception
    //   965	973	617	java/lang/Exception
    //   988	997	617	java/lang/Exception
    //   1012	1032	617	java/lang/Exception
    //   1047	1055	617	java/lang/Exception
    //   1100	1110	617	java/lang/Exception
    //   1125	1133	617	java/lang/Exception
    //   1151	1159	617	java/lang/Exception
    //   1174	1185	617	java/lang/Exception
    //   1209	1216	617	java/lang/Exception
    //   1231	1240	617	java/lang/Exception
    //   1255	1265	617	java/lang/Exception
    //   1280	1290	617	java/lang/Exception
    //   1305	1316	617	java/lang/Exception
    //   1337	1345	617	java/lang/Exception
    //   1360	1368	617	java/lang/Exception
    //   1383	1393	617	java/lang/Exception
    //   1408	1418	617	java/lang/Exception
    //   1433	1443	617	java/lang/Exception
    //   1460	1468	617	java/lang/Exception
    //   1479	1509	617	java/lang/Exception
    //   1520	1529	617	java/lang/Exception
    //   1540	1548	617	java/lang/Exception
    //   1559	1589	617	java/lang/Exception
    //   1600	1609	617	java/lang/Exception
    //   76	83	1058	finally
    //   104	114	1058	finally
    //   129	138	1058	finally
    //   153	162	1058	finally
    //   177	185	1058	finally
    //   200	208	1058	finally
    //   223	274	1058	finally
    //   289	340	1058	finally
    //   355	365	1058	finally
    //   380	389	1058	finally
    //   404	414	1058	finally
    //   429	439	1058	finally
    //   454	464	1058	finally
    //   479	486	1058	finally
    //   501	509	1058	finally
    //   524	532	1058	finally
    //   547	556	1058	finally
    //   571	591	1058	finally
    //   606	614	1058	finally
    //   687	697	1058	finally
    //   712	720	1058	finally
    //   738	746	1058	finally
    //   761	771	1058	finally
    //   795	805	1058	finally
    //   820	829	1058	finally
    //   844	854	1058	finally
    //   869	879	1058	finally
    //   894	904	1058	finally
    //   919	927	1058	finally
    //   942	950	1058	finally
    //   965	973	1058	finally
    //   988	997	1058	finally
    //   1012	1032	1058	finally
    //   1047	1055	1058	finally
    //   1100	1110	1058	finally
    //   1125	1133	1058	finally
    //   1151	1159	1058	finally
    //   1174	1185	1058	finally
    //   1209	1216	1058	finally
    //   1231	1240	1058	finally
    //   1255	1265	1058	finally
    //   1280	1290	1058	finally
    //   1305	1316	1058	finally
    //   1337	1345	1058	finally
    //   1360	1368	1058	finally
    //   1383	1393	1058	finally
    //   1408	1418	1058	finally
    //   1433	1443	1058	finally
    //   1460	1468	1058	finally
    //   1479	1509	1058	finally
    //   1520	1529	1058	finally
    //   1540	1548	1058	finally
    //   1559	1589	1058	finally
    //   1600	1609	1058	finally
    //   1623	1629	1632	java/lang/Exception
    //   1613	1619	1636	java/lang/Exception
    //   623	630	1640	java/lang/Exception
    //   634	640	1644	java/lang/Exception
    //   1064	1071	1648	java/lang/Exception
    //   1076	1083	1652	java/lang/Exception
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\c\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */