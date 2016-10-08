package com.baidu.location.c;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.location.Location;
import android.net.wifi.ScanResult;
import android.os.Environment;
import android.os.Handler;
import com.baidu.location.BDLocation;
import com.baidu.location.Jni;
import com.baidu.location.b.b;
import com.baidu.location.e.u;
import com.baidu.location.h.p;
import com.baidu.location.h.r;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

public final class e
{
  private static e a = null;
  private static final String k = Environment.getExternalStorageDirectory().getPath() + "/baidu/tempdata/";
  private static final String l = Environment.getExternalStorageDirectory().getPath() + "/baidu/tempdata/" + "/ls.db";
  private String b = null;
  private boolean c = false;
  private boolean d = false;
  private double e = 0.0D;
  private double f = 0.0D;
  private double g = 0.0D;
  private double h = 0.0D;
  private double i = 0.0D;
  private volatile boolean j = false;
  private Handler m = new Handler();
  
  private e()
  {
    try
    {
      Object localObject = new File(k);
      File localFile = new File(l);
      if (!((File)localObject).exists()) {
        ((File)localObject).mkdirs();
      }
      if (!localFile.exists()) {
        localFile.createNewFile();
      }
      if (localFile.exists())
      {
        localObject = SQLiteDatabase.openOrCreateDatabase(localFile, null);
        ((SQLiteDatabase)localObject).execSQL("CREATE TABLE IF NOT EXISTS bdcltb09(id CHAR(40) PRIMARY KEY,time DOUBLE,tag DOUBLE, type DOUBLE , ac INT);");
        ((SQLiteDatabase)localObject).execSQL("CREATE TABLE IF NOT EXISTS wof(id CHAR(15) PRIMARY KEY,mktime DOUBLE,time DOUBLE, ac INT, bc INT, cc INT);");
        ((SQLiteDatabase)localObject).setVersion(1);
        ((SQLiteDatabase)localObject).close();
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  public static e a()
  {
    if (a == null) {
      a = new e();
    }
    return a;
  }
  
  private void a(com.baidu.location.h.l paraml, BDLocation paramBDLocation, SQLiteDatabase paramSQLiteDatabase)
  {
    if ((paramBDLocation == null) || (paramBDLocation.h() != 161) || ((!"wf".equals(paramBDLocation.r())) && (paramBDLocation.f() >= 300.0F))) {
      break label36;
    }
    label36:
    label675:
    label681:
    for (;;)
    {
      return;
      if (paraml.a != null)
      {
        int i4 = (int)(System.currentTimeMillis() >> 28);
        System.currentTimeMillis();
        paraml = paraml.a.iterator();
        int n = 0;
        for (;;)
        {
          if (!paraml.hasNext()) {
            break label681;
          }
          Object localObject1 = (ScanResult)paraml.next();
          if (((ScanResult)localObject1).level != 0)
          {
            n += 1;
            if (n > 6) {
              break;
            }
            ContentValues localContentValues = new ContentValues();
            localObject1 = Jni.c(((ScanResult)localObject1).BSSID.replace(":", ""));
            do
            {
              try
              {
                Object localObject2 = paramSQLiteDatabase.rawQuery("select * from wof where id = \"" + (String)localObject1 + "\";", null);
                double d2;
                double d1;
                int i1;
                int i2;
                if ((localObject2 != null) && (((Cursor)localObject2).moveToFirst()))
                {
                  d2 = ((Cursor)localObject2).getDouble(1);
                  d1 = ((Cursor)localObject2).getDouble(2);
                  i1 = ((Cursor)localObject2).getInt(4);
                  i3 = ((Cursor)localObject2).getInt(5);
                  d2 -= 113.2349D;
                  i2 = 1;
                }
                for (d1 -= 432.1238D;; d1 = 0.0D)
                {
                  if (localObject2 != null) {
                    ((Cursor)localObject2).close();
                  }
                  if (i2 != 0) {
                    break label675;
                  }
                  localContentValues.put("mktime", Double.valueOf(paramBDLocation.d() + 113.2349D));
                  localContentValues.put("time", Double.valueOf(paramBDLocation.c() + 432.1238D));
                  localContentValues.put("bc", Integer.valueOf(1));
                  localContentValues.put("cc", Integer.valueOf(1));
                  localContentValues.put("ac", Integer.valueOf(i4));
                  localContentValues.put("id", (String)localObject1);
                  paramSQLiteDatabase.insert("wof", null, localContentValues);
                  break;
                  localObject2 = new float[1];
                  Location.distanceBetween(d1, d2, paramBDLocation.c(), paramBDLocation.d(), (float[])localObject2);
                  if (localObject2[0] > 1500.0F)
                  {
                    i2 = i3 + 1;
                    if ((i2 > 10) && (i2 > i1 * 3))
                    {
                      localContentValues.put("mktime", Double.valueOf(paramBDLocation.d() + 113.2349D));
                      localContentValues.put("time", Double.valueOf(paramBDLocation.c() + 432.1238D));
                      localContentValues.put("bc", Integer.valueOf(1));
                      localContentValues.put("cc", Integer.valueOf(1));
                      localContentValues.put("ac", Integer.valueOf(i4));
                    }
                  }
                  try
                  {
                    for (;;)
                    {
                      i1 = paramSQLiteDatabase.update("wof", localContentValues, "id = \"" + (String)localObject1 + "\"", null);
                      if (i1 > 0) {
                        break;
                      }
                      break;
                      localContentValues.put("cc", Integer.valueOf(i2));
                      continue;
                      d2 = (d2 * i1 + paramBDLocation.d()) / (i1 + 1);
                      d1 = (d1 * i1 + paramBDLocation.c()) / (i1 + 1);
                      localContentValues.put("mktime", Double.valueOf(d2 + 113.2349D));
                      localContentValues.put("time", Double.valueOf(d1 + 432.1238D));
                      localContentValues.put("bc", Integer.valueOf(i1 + 1));
                      localContentValues.put("ac", Integer.valueOf(i4));
                    }
                    i3 = 0;
                  }
                  catch (Exception localException1) {}
                  i1 = 0;
                  d2 = 0.0D;
                  i2 = 0;
                }
              }
              catch (Exception localException2)
              {
                int i3;
                for (;;) {}
              }
            } while (i3 != 0);
          }
        }
      }
    }
  }
  
  /* Error */
  private void a(String paramString, SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_1
    //   3: ifnull +14 -> 17
    //   6: aload_1
    //   7: aload_0
    //   8: getfield 64	com/baidu/location/c/e:b	Ljava/lang/String;
    //   11: invokevirtual 155	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   14: ifeq +4 -> 18
    //   17: return
    //   18: aload_0
    //   19: iconst_0
    //   20: putfield 66	com/baidu/location/c/e:c	Z
    //   23: aload_2
    //   24: new 28	java/lang/StringBuilder
    //   27: dup
    //   28: invokespecial 31	java/lang/StringBuilder:<init>	()V
    //   31: ldc_w 298
    //   34: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: aload_1
    //   38: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: ldc -42
    //   43: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   49: aconst_null
    //   50: invokevirtual 218	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   53: astore_2
    //   54: aload_2
    //   55: astore_3
    //   56: aload_0
    //   57: aload_1
    //   58: putfield 64	com/baidu/location/c/e:b	Ljava/lang/String;
    //   61: aload_2
    //   62: astore_3
    //   63: aload_2
    //   64: invokeinterface 223 1 0
    //   69: ifeq +61 -> 130
    //   72: aload_2
    //   73: astore_3
    //   74: aload_0
    //   75: aload_2
    //   76: iconst_1
    //   77: invokeinterface 227 2 0
    //   82: ldc2_w 299
    //   85: dsub
    //   86: putfield 72	com/baidu/location/c/e:f	D
    //   89: aload_2
    //   90: astore_3
    //   91: aload_0
    //   92: aload_2
    //   93: iconst_2
    //   94: invokeinterface 227 2 0
    //   99: ldc2_w 301
    //   102: dsub
    //   103: putfield 70	com/baidu/location/c/e:e	D
    //   106: aload_2
    //   107: astore_3
    //   108: aload_0
    //   109: aload_2
    //   110: iconst_3
    //   111: invokeinterface 227 2 0
    //   116: ldc2_w 303
    //   119: dsub
    //   120: putfield 74	com/baidu/location/c/e:g	D
    //   123: aload_2
    //   124: astore_3
    //   125: aload_0
    //   126: iconst_1
    //   127: putfield 66	com/baidu/location/c/e:c	Z
    //   130: aload_2
    //   131: ifnull -114 -> 17
    //   134: aload_2
    //   135: invokeinterface 236 1 0
    //   140: return
    //   141: astore_1
    //   142: return
    //   143: astore_1
    //   144: aload_3
    //   145: ifnull -128 -> 17
    //   148: aload_3
    //   149: invokeinterface 236 1 0
    //   154: return
    //   155: astore_1
    //   156: return
    //   157: astore_1
    //   158: aconst_null
    //   159: astore_2
    //   160: aload_2
    //   161: ifnull +9 -> 170
    //   164: aload_2
    //   165: invokeinterface 236 1 0
    //   170: aload_1
    //   171: athrow
    //   172: astore_2
    //   173: goto -3 -> 170
    //   176: astore_1
    //   177: goto -17 -> 160
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	180	0	this	e
    //   0	180	1	paramString	String
    //   0	180	2	paramSQLiteDatabase	SQLiteDatabase
    //   1	148	3	localSQLiteDatabase	SQLiteDatabase
    // Exception table:
    //   from	to	target	type
    //   134	140	141	java/lang/Exception
    //   23	54	143	java/lang/Exception
    //   56	61	143	java/lang/Exception
    //   63	72	143	java/lang/Exception
    //   74	89	143	java/lang/Exception
    //   91	106	143	java/lang/Exception
    //   108	123	143	java/lang/Exception
    //   125	130	143	java/lang/Exception
    //   148	154	155	java/lang/Exception
    //   23	54	157	finally
    //   164	170	172	java/lang/Exception
    //   56	61	176	finally
    //   63	72	176	finally
    //   74	89	176	finally
    //   91	106	176	finally
    //   108	123	176	finally
    //   125	130	176	finally
  }
  
  private void a(String paramString, com.baidu.location.h.n paramn, SQLiteDatabase paramSQLiteDatabase)
  {
    int n = 0;
    double d2 = 0.0D;
    if ((!paramn.c()) || (!u.b().g())) {
      return;
    }
    System.currentTimeMillis();
    int i1 = (int)(System.currentTimeMillis() >> 28);
    paramn = paramn.h();
    for (;;)
    {
      try
      {
        paramString = new JSONObject(paramString);
        int i2 = Integer.parseInt(paramString.getJSONObject("result").getString("error"));
        if (i2 == 161)
        {
          paramString = paramString.getJSONObject("content");
          if (!paramString.has("clf")) {
            break label374;
          }
          Object localObject = paramString.getString("clf");
          if (((String)localObject).equals("0"))
          {
            localObject = paramString.getJSONObject("point");
            d2 = Double.parseDouble(((JSONObject)localObject).getString("x"));
            d1 = Double.parseDouble(((JSONObject)localObject).getString("y"));
            f1 = Float.parseFloat(paramString.getString("radius"));
            if (n != 0) {
              break;
            }
            paramString = new ContentValues();
            paramString.put("time", Double.valueOf(d2 + 1235.4323D));
            paramString.put("tag", Float.valueOf(4326.0F + f1));
            paramString.put("type", Double.valueOf(d1 + 2367.3217D));
            paramString.put("ac", Integer.valueOf(i1));
            try
            {
              if (paramSQLiteDatabase.update("bdcltb09", paramString, "id = \"" + paramn + "\"", null) > 0) {
                break;
              }
              paramString.put("id", paramn);
              paramSQLiteDatabase.insert("bdcltb09", null, paramString);
              return;
            }
            catch (Exception paramString)
            {
              return;
            }
          }
          paramString = ((String)localObject).split("\\|");
          d2 = Double.parseDouble(paramString[0]);
          d1 = Double.parseDouble(paramString[1]);
          f1 = Float.parseFloat(paramString[2]);
          continue;
        }
        if (i2 == 167)
        {
          paramSQLiteDatabase.delete("bdcltb09", "id = \"" + paramn + "\"", null);
          return;
        }
      }
      catch (Exception paramString)
      {
        return;
      }
      label374:
      n = 1;
      float f1 = 0.0F;
      double d1 = 0.0D;
    }
  }
  
  private void a(String paramString, List paramList)
  {
    Object localObject;
    if ((paramString != null) && (!paramString.equals(this.b)))
    {
      localObject = SQLiteDatabase.openOrCreateDatabase(l, null);
      a(paramString, (SQLiteDatabase)localObject);
    }
    for (paramString = (String)localObject;; paramString = null)
    {
      localObject = paramString;
      if (paramList != null)
      {
        localObject = paramString;
        if (paramString == null) {
          localObject = SQLiteDatabase.openOrCreateDatabase(l, null);
        }
        a(paramList, (SQLiteDatabase)localObject);
      }
      if ((localObject != null) && (((SQLiteDatabase)localObject).isOpen())) {
        ((SQLiteDatabase)localObject).close();
      }
      return;
    }
  }
  
  /* Error */
  private void a(List paramList, SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: invokestatic 170	java/lang/System:currentTimeMillis	()J
    //   3: pop2
    //   4: aload_0
    //   5: iconst_0
    //   6: putfield 68	com/baidu/location/c/e:d	Z
    //   9: aload_1
    //   10: ifnonnull +4 -> 14
    //   13: return
    //   14: aload_2
    //   15: ifnull -2 -> 13
    //   18: aload_1
    //   19: ifnull -6 -> 13
    //   22: dconst_0
    //   23: dstore 5
    //   25: dconst_0
    //   26: dstore_3
    //   27: iconst_0
    //   28: istore 20
    //   30: iconst_0
    //   31: istore 21
    //   33: bipush 8
    //   35: newarray <illegal type>
    //   37: astore 15
    //   39: iconst_0
    //   40: istore 22
    //   42: iconst_0
    //   43: istore 19
    //   45: new 399	java/lang/StringBuffer
    //   48: dup
    //   49: invokespecial 400	java/lang/StringBuffer:<init>	()V
    //   52: astore 16
    //   54: aload_1
    //   55: invokeinterface 176 1 0
    //   60: astore_1
    //   61: iconst_0
    //   62: istore 18
    //   64: aload_1
    //   65: invokeinterface 181 1 0
    //   70: ifeq +21 -> 91
    //   73: aload_1
    //   74: invokeinterface 185 1 0
    //   79: checkcast 187	android/net/wifi/ScanResult
    //   82: astore 17
    //   84: iload 18
    //   86: bipush 10
    //   88: if_icmple +158 -> 246
    //   91: aconst_null
    //   92: astore_1
    //   93: aload_2
    //   94: new 28	java/lang/StringBuilder
    //   97: dup
    //   98: invokespecial 31	java/lang/StringBuilder:<init>	()V
    //   101: ldc_w 402
    //   104: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: aload 16
    //   109: invokevirtual 403	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   112: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: ldc_w 405
    //   118: invokevirtual 47	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   124: aconst_null
    //   125: invokevirtual 218	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   128: astore_2
    //   129: aload_2
    //   130: astore_1
    //   131: aload_1
    //   132: invokeinterface 223 1 0
    //   137: ifeq +321 -> 458
    //   140: iload 22
    //   142: istore 18
    //   144: iload 20
    //   146: istore 22
    //   148: dload_3
    //   149: dstore 9
    //   151: dload 5
    //   153: dstore 7
    //   155: aload_1
    //   156: invokeinterface 408 1 0
    //   161: ifne +267 -> 428
    //   164: aload_1
    //   165: iconst_1
    //   166: invokeinterface 227 2 0
    //   171: ldc2_w 232
    //   174: dsub
    //   175: dstore 13
    //   177: aload_1
    //   178: iconst_2
    //   179: invokeinterface 227 2 0
    //   184: ldc2_w 234
    //   187: dsub
    //   188: dstore 11
    //   190: aload_1
    //   191: iconst_4
    //   192: invokeinterface 231 2 0
    //   197: istore 22
    //   199: aload_1
    //   200: iconst_5
    //   201: invokeinterface 231 2 0
    //   206: istore 23
    //   208: iload 23
    //   210: bipush 8
    //   212: if_icmple +94 -> 306
    //   215: iload 23
    //   217: iload 22
    //   219: if_icmple +87 -> 306
    //   222: aload_1
    //   223: invokeinterface 411 1 0
    //   228: pop
    //   229: goto -85 -> 144
    //   232: astore_2
    //   233: aload_1
    //   234: ifnull -221 -> 13
    //   237: aload_1
    //   238: invokeinterface 236 1 0
    //   243: return
    //   244: astore_1
    //   245: return
    //   246: iload 18
    //   248: ifle +12 -> 260
    //   251: aload 16
    //   253: ldc_w 413
    //   256: invokevirtual 416	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   259: pop
    //   260: iload 18
    //   262: iconst_1
    //   263: iadd
    //   264: istore 18
    //   266: aload 17
    //   268: getfield 197	android/net/wifi/ScanResult:BSSID	Ljava/lang/String;
    //   271: ldc -57
    //   273: ldc -55
    //   275: invokevirtual 205	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   278: invokestatic 210	com/baidu/location/Jni:c	(Ljava/lang/String;)Ljava/lang/String;
    //   281: astore 17
    //   283: aload 16
    //   285: ldc_w 291
    //   288: invokevirtual 416	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   291: aload 17
    //   293: invokevirtual 416	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   296: ldc_w 291
    //   299: invokevirtual 416	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   302: pop
    //   303: goto -239 -> 64
    //   306: aload_0
    //   307: getfield 66	com/baidu/location/c/e:c	Z
    //   310: ifeq +161 -> 471
    //   313: iconst_1
    //   314: newarray <illegal type>
    //   316: astore_2
    //   317: dload 11
    //   319: dload 13
    //   321: aload_0
    //   322: getfield 74	com/baidu/location/c/e:g	D
    //   325: aload_0
    //   326: getfield 72	com/baidu/location/c/e:f	D
    //   329: aload_2
    //   330: invokestatic 286	android/location/Location:distanceBetween	(DDDD[F)V
    //   333: aload_2
    //   334: iconst_0
    //   335: faload
    //   336: f2d
    //   337: aload_0
    //   338: getfield 70	com/baidu/location/c/e:e	D
    //   341: ldc2_w 417
    //   344: dadd
    //   345: dcmpl
    //   346: ifle +32 -> 378
    //   349: aload_1
    //   350: invokeinterface 411 1 0
    //   355: pop
    //   356: goto -212 -> 144
    //   359: astore 15
    //   361: aload_1
    //   362: astore_2
    //   363: aload 15
    //   365: astore_1
    //   366: aload_2
    //   367: ifnull +9 -> 376
    //   370: aload_2
    //   371: invokeinterface 236 1 0
    //   376: aload_1
    //   377: athrow
    //   378: iconst_1
    //   379: istore 21
    //   381: dload 5
    //   383: dload 13
    //   385: dadd
    //   386: dstore 5
    //   388: dload_3
    //   389: dload 11
    //   391: dadd
    //   392: dstore_3
    //   393: iload 20
    //   395: iconst_1
    //   396: iadd
    //   397: istore 20
    //   399: iload 19
    //   401: istore 22
    //   403: iload 18
    //   405: istore 19
    //   407: iload 22
    //   409: istore 18
    //   411: iload 20
    //   413: iconst_4
    //   414: if_icmple +186 -> 600
    //   417: dload 5
    //   419: dstore 7
    //   421: dload_3
    //   422: dstore 9
    //   424: iload 20
    //   426: istore 22
    //   428: iload 22
    //   430: ifle +28 -> 458
    //   433: aload_0
    //   434: iconst_1
    //   435: putfield 68	com/baidu/location/c/e:d	Z
    //   438: aload_0
    //   439: dload 7
    //   441: iload 22
    //   443: i2d
    //   444: ddiv
    //   445: putfield 76	com/baidu/location/c/e:h	D
    //   448: aload_0
    //   449: dload 9
    //   451: iload 22
    //   453: i2d
    //   454: ddiv
    //   455: putfield 78	com/baidu/location/c/e:i	D
    //   458: aload_1
    //   459: ifnull -446 -> 13
    //   462: aload_1
    //   463: invokeinterface 236 1 0
    //   468: return
    //   469: astore_1
    //   470: return
    //   471: iload 21
    //   473: ifeq +193 -> 666
    //   476: iconst_1
    //   477: newarray <illegal type>
    //   479: astore_2
    //   480: dload 11
    //   482: dload 13
    //   484: dload_3
    //   485: iload 20
    //   487: i2d
    //   488: ddiv
    //   489: dload 5
    //   491: iload 20
    //   493: i2d
    //   494: ddiv
    //   495: aload_2
    //   496: invokestatic 286	android/location/Location:distanceBetween	(DDDD[F)V
    //   499: aload_2
    //   500: iconst_0
    //   501: faload
    //   502: ldc_w 419
    //   505: fcmpl
    //   506: ifle +145 -> 651
    //   509: aload_1
    //   510: invokeinterface 411 1 0
    //   515: pop
    //   516: goto -372 -> 144
    //   519: iload 22
    //   521: iload 19
    //   523: if_icmpge +211 -> 734
    //   526: iconst_1
    //   527: newarray <illegal type>
    //   529: astore_2
    //   530: dload 11
    //   532: dload 13
    //   534: aload 15
    //   536: iload 22
    //   538: iconst_1
    //   539: iadd
    //   540: daload
    //   541: aload 15
    //   543: iload 22
    //   545: daload
    //   546: aload_2
    //   547: invokestatic 286	android/location/Location:distanceBetween	(DDDD[F)V
    //   550: aload_2
    //   551: iconst_0
    //   552: faload
    //   553: ldc_w 419
    //   556: fcmpg
    //   557: ifge +79 -> 636
    //   560: iconst_1
    //   561: istore 21
    //   563: dload 5
    //   565: aload 15
    //   567: iload 22
    //   569: daload
    //   570: dadd
    //   571: dstore 5
    //   573: aload 15
    //   575: iload 22
    //   577: iconst_1
    //   578: iadd
    //   579: daload
    //   580: dload_3
    //   581: dadd
    //   582: dstore_3
    //   583: iload 20
    //   585: iconst_1
    //   586: iadd
    //   587: istore 23
    //   589: iload 21
    //   591: istore 20
    //   593: iload 23
    //   595: istore 21
    //   597: goto +112 -> 709
    //   600: aload_1
    //   601: invokeinterface 411 1 0
    //   606: pop
    //   607: iload 19
    //   609: istore 22
    //   611: iload 18
    //   613: istore 19
    //   615: iload 22
    //   617: istore 18
    //   619: goto -475 -> 144
    //   622: astore_2
    //   623: goto -247 -> 376
    //   626: astore_1
    //   627: aconst_null
    //   628: astore_2
    //   629: goto -263 -> 366
    //   632: astore_2
    //   633: goto -400 -> 233
    //   636: iload 20
    //   638: istore 23
    //   640: iload 21
    //   642: istore 20
    //   644: iload 23
    //   646: istore 21
    //   648: goto +61 -> 709
    //   651: iload 18
    //   653: istore 22
    //   655: iload 19
    //   657: istore 18
    //   659: iload 22
    //   661: istore 19
    //   663: goto -252 -> 411
    //   666: iload 18
    //   668: ifne +35 -> 703
    //   671: iload 19
    //   673: iconst_1
    //   674: iadd
    //   675: istore 18
    //   677: aload 15
    //   679: iload 19
    //   681: dload 13
    //   683: dastore
    //   684: aload 15
    //   686: iload 18
    //   688: dload 11
    //   690: dastore
    //   691: iconst_1
    //   692: istore 19
    //   694: iload 18
    //   696: iconst_1
    //   697: iadd
    //   698: istore 18
    //   700: goto -289 -> 411
    //   703: iconst_0
    //   704: istore 22
    //   706: goto -187 -> 519
    //   709: iload 22
    //   711: iconst_2
    //   712: iadd
    //   713: istore 23
    //   715: iload 21
    //   717: istore 22
    //   719: iload 20
    //   721: istore 21
    //   723: iload 22
    //   725: istore 20
    //   727: iload 23
    //   729: istore 22
    //   731: goto -212 -> 519
    //   734: iload 21
    //   736: ifeq +40 -> 776
    //   739: dload 5
    //   741: dload 13
    //   743: dadd
    //   744: dstore 5
    //   746: dload_3
    //   747: dload 11
    //   749: dadd
    //   750: dstore_3
    //   751: iload 20
    //   753: iconst_1
    //   754: iadd
    //   755: istore 22
    //   757: iload 18
    //   759: istore 20
    //   761: iload 19
    //   763: istore 18
    //   765: iload 20
    //   767: istore 19
    //   769: iload 22
    //   771: istore 20
    //   773: goto -362 -> 411
    //   776: iload 20
    //   778: istore 22
    //   780: dload_3
    //   781: dstore 9
    //   783: dload 5
    //   785: dstore 7
    //   787: iload 19
    //   789: bipush 8
    //   791: if_icmpge -363 -> 428
    //   794: iload 19
    //   796: iconst_1
    //   797: iadd
    //   798: istore 22
    //   800: aload 15
    //   802: iload 19
    //   804: dload 13
    //   806: dastore
    //   807: aload 15
    //   809: iload 22
    //   811: dload 11
    //   813: dastore
    //   814: iload 22
    //   816: iconst_1
    //   817: iadd
    //   818: istore 22
    //   820: iload 18
    //   822: istore 19
    //   824: iload 22
    //   826: istore 18
    //   828: goto -417 -> 411
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	831	0	this	e
    //   0	831	1	paramList	List
    //   0	831	2	paramSQLiteDatabase	SQLiteDatabase
    //   26	755	3	d1	double
    //   23	761	5	d2	double
    //   153	633	7	d3	double
    //   149	633	9	d4	double
    //   188	624	11	d5	double
    //   175	630	13	d6	double
    //   37	1	15	arrayOfDouble	double[]
    //   359	449	15	localObject1	Object
    //   52	232	16	localStringBuffer	StringBuffer
    //   82	210	17	localObject2	Object
    //   62	765	18	n	int
    //   43	780	19	i1	int
    //   28	749	20	i2	int
    //   31	704	21	i3	int
    //   40	785	22	i4	int
    //   206	522	23	i5	int
    // Exception table:
    //   from	to	target	type
    //   131	140	232	java/lang/Exception
    //   155	208	232	java/lang/Exception
    //   222	229	232	java/lang/Exception
    //   306	356	232	java/lang/Exception
    //   433	458	232	java/lang/Exception
    //   476	499	232	java/lang/Exception
    //   509	516	232	java/lang/Exception
    //   526	550	232	java/lang/Exception
    //   600	607	232	java/lang/Exception
    //   237	243	244	java/lang/Exception
    //   131	140	359	finally
    //   155	208	359	finally
    //   222	229	359	finally
    //   306	356	359	finally
    //   433	458	359	finally
    //   476	499	359	finally
    //   509	516	359	finally
    //   526	550	359	finally
    //   600	607	359	finally
    //   462	468	469	java/lang/Exception
    //   370	376	622	java/lang/Exception
    //   93	129	626	finally
    //   93	129	632	java/lang/Exception
  }
  
  private String b(boolean paramBoolean)
  {
    double d1 = 0.0D;
    double d3;
    double d2;
    boolean bool;
    int n;
    if (this.d)
    {
      d3 = this.h;
      d2 = this.i;
      d1 = 246.4D;
      bool = true;
      n = 1;
    }
    for (;;)
    {
      if (n != 0)
      {
        String str;
        if (paramBoolean)
        {
          str = "{\"result\":{\"time\":\"" + com.baidu.location.b.l.a() + "\",\"error\":\"66\"},\"content\":{\"point\":{\"x\":" + "\"%f\",\"y\":\"%f\"},\"radius\":\"%f\",\"isCellChanged\":\"%b\"}}";
          return String.format(Locale.CHINA, str, new Object[] { Double.valueOf(d3), Double.valueOf(d2), Double.valueOf(d1), Boolean.valueOf(true) });
          if (this.c)
          {
            d3 = this.f;
            d2 = this.g;
            d1 = this.e;
            bool = u.b().g();
            n = 1;
          }
        }
        else
        {
          str = "{\"result\":{\"time\":\"" + com.baidu.location.b.l.a() + "\",\"error\":\"66\"},\"content\":{\"point\":{\"x\":" + "\"%f\",\"y\":\"%f\"},\"radius\":\"%f\",\"isCellChanged\":\"%b\"}}";
          return String.format(Locale.CHINA, str, new Object[] { Double.valueOf(d3), Double.valueOf(d2), Double.valueOf(d1), Boolean.valueOf(bool) });
        }
      }
      else
      {
        if (paramBoolean) {
          return "{\"result\":{\"time\":\"" + com.baidu.location.b.l.a() + "\",\"error\":\"67\"}}";
        }
        return "{\"result\":{\"time\":\"" + com.baidu.location.b.l.a() + "\",\"error\":\"63\"}}";
      }
      bool = false;
      n = 0;
      d2 = 0.0D;
      d3 = 0.0D;
    }
  }
  
  private void d()
  {
    boolean bool2 = true;
    SQLiteDatabase localSQLiteDatabase2;
    try
    {
      SQLiteDatabase localSQLiteDatabase1 = SQLiteDatabase.openOrCreateDatabase(l, null);
      if (localSQLiteDatabase1 == null) {
        return;
      }
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        localSQLiteDatabase2 = null;
      }
    }
    for (;;)
    {
      long l2;
      try
      {
        long l1 = DatabaseUtils.queryNumEntries(localSQLiteDatabase2, "wof");
        l2 = DatabaseUtils.queryNumEntries(localSQLiteDatabase2, "bdcltb09");
        if (l1 <= 10000L) {
          break label93;
        }
        bool1 = true;
      }
      catch (Exception localException2)
      {
        return;
      }
      new f(this, null).execute(new Boolean[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      localSQLiteDatabase2.close();
      return;
      label93:
      boolean bool1 = false;
      while (l2 <= 10000L)
      {
        bool2 = false;
        break;
      }
      if (!bool1) {
        if (!bool2) {}
      }
    }
  }
  
  public BDLocation a(String paramString, List paramList, boolean paramBoolean)
  {
    localExecutorService = Executors.newSingleThreadExecutor();
    paramList = (FutureTask)localExecutorService.submit(new o(this, paramString, paramList));
    try
    {
      paramString = (String)paramList.get(2000L, TimeUnit.MILLISECONDS);
    }
    catch (InterruptedException paramString)
    {
      for (;;)
      {
        paramList.cancel(true);
        localExecutorService.shutdown();
        paramString = "{\"result\":\"null\"}";
      }
    }
    catch (ExecutionException paramString)
    {
      for (;;)
      {
        paramList.cancel(true);
        localExecutorService.shutdown();
        paramString = "{\"result\":\"null\"}";
      }
    }
    catch (TimeoutException paramString)
    {
      for (;;)
      {
        if (paramBoolean) {
          com.baidu.location.b.q.a().a("old offlineLocation Timeout Exception!");
        }
        paramList.cancel(true);
        localExecutorService.shutdown();
        paramString = "{\"result\":\"null\"}";
      }
    }
    finally
    {
      localExecutorService.shutdown();
    }
    return new BDLocation(paramString);
  }
  
  public BDLocation a(boolean paramBoolean)
  {
    Object localObject2 = com.baidu.location.h.g.a().f();
    Object localObject1 = null;
    if (localObject2 != null) {
      localObject1 = ((com.baidu.location.h.n)localObject2).h();
    }
    com.baidu.location.h.l locall = r.a().j();
    localObject1 = a((String)localObject1, locall.a, true);
    if ((localObject1 != null) && (((BDLocation)localObject1).h() == 66))
    {
      StringBuffer localStringBuffer = new StringBuffer(1024);
      localStringBuffer.append(String.format(Locale.CHINA, "&ofl=%f|%f|%f", new Object[] { Double.valueOf(((BDLocation)localObject1).c()), Double.valueOf(((BDLocation)localObject1).d()), Float.valueOf(((BDLocation)localObject1).f()) }));
      if ((locall != null) && (locall.a() > 0))
      {
        localStringBuffer.append("&wf=");
        localStringBuffer.append(locall.c(15));
      }
      if (localObject2 != null) {
        localStringBuffer.append(((com.baidu.location.h.n)localObject2).j());
      }
      localStringBuffer.append("&uptype=oldoff");
      localStringBuffer.append(b.a().a(false));
      localStringBuffer.append(com.baidu.location.e.f.a().c());
      localObject2 = localStringBuffer.toString();
      com.baidu.location.b.q.a(com.baidu.location.b.q.a, Jni.a((String)localObject2));
    }
    return (BDLocation)localObject1;
  }
  
  public void a(String paramString, com.baidu.location.h.n paramn, com.baidu.location.h.l paraml, BDLocation paramBDLocation)
  {
    if ((!paramn.c()) || (!u.b().g())) {}
    for (int i1 = 1;; i1 = 0)
    {
      if ((paramBDLocation == null) || (paramBDLocation.h() != 161) || ((!"wf".equals(paramBDLocation.r())) && (paramBDLocation.f() >= 300.0F))) {}
      for (int n = 1;; n = 0)
      {
        if (paraml.a == null) {
          n = 1;
        }
        if ((i1 != 0) && (n != 0)) {}
        while (this.j) {
          return;
        }
        this.j = true;
        new g(this, null).execute(new Object[] { paramString, paramn, paraml, paramBDLocation });
        return;
      }
    }
  }
  
  public void b()
  {
    this.m.postDelayed(new n(this), 3000L);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\c\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */