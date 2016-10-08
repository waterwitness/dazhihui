package qalsdk;

import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.qalsdk.base.remote.FromServiceMsg;
import com.tencent.qalsdk.core.NetConnInfoCenter;
import com.tencent.qalsdk.core.j;
import com.tencent.qalsdk.core.m;
import com.tencent.qalsdk.sdk.MsfSdkUtils;
import com.tencent.qalsdk.util.QLog;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class u
{
  public static volatile boolean a = false;
  static long b = 0L;
  static long c = 0L;
  private static AtomicInteger f = new AtomicInteger(1);
  private static int g = 50;
  private static ConcurrentHashMap<Long, Long> h = new ConcurrentHashMap();
  private static r k = new r(j.a().r);
  private static SQLiteDatabase l;
  Runnable d = new v(this);
  private ArrayList<s> e = new ArrayList();
  private volatile Handler i;
  private int j = 0;
  
  public u()
  {
    HandlerThread localHandlerThread = new HandlerThread("NetInfoCollection", 5);
    localHandlerThread.start();
    this.i = new Handler(localHandlerThread.getLooper());
  }
  
  public static boolean a()
  {
    return !MsfSdkUtils.isTopActivity(j.a().r);
  }
  
  private s e()
  {
    if ((m.e()) || ((!m.d()) && (m.l() == null))) {}
    for (int m = 1; m != 0; m = 0) {
      return ak.e();
    }
    s locals = new s();
    locals.a = ak.b();
    locals.f = ak.c();
    if (NetConnInfoCenter.isGSM()) {}
    for (m = NetConnInfoCenter.getGsmStrength();; m = NetConnInfoCenter.getCdmaStrength())
    {
      locals.g = m;
      return locals;
    }
  }
  
  /* Error */
  public void a(int paramInt1, long paramLong, ArrayList<al> paramArrayList, int paramInt2)
  {
    // Byte code:
    //   0: invokestatic 165	java/lang/System:currentTimeMillis	()J
    //   3: ldc2_w 166
    //   6: ldiv
    //   7: lstore 15
    //   9: lload_2
    //   10: l2i
    //   11: istore 14
    //   13: getstatic 172	android/os/Build$VERSION:RELEASE	Ljava/lang/String;
    //   16: astore 9
    //   18: invokestatic 174	qalsdk/u:a	()Z
    //   21: ifeq +195 -> 216
    //   24: iconst_1
    //   25: istore 11
    //   27: iconst_0
    //   28: istore 13
    //   30: iload_1
    //   31: istore 12
    //   33: iload 13
    //   35: aload_0
    //   36: getfield 75	qalsdk/u:e	Ljava/util/ArrayList;
    //   39: invokevirtual 177	java/util/ArrayList:size	()I
    //   42: if_icmpge +26 -> 68
    //   45: aload_0
    //   46: getfield 75	qalsdk/u:e	Ljava/util/ArrayList;
    //   49: iload 13
    //   51: invokevirtual 181	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   54: checkcast 133	qalsdk/s
    //   57: getfield 183	qalsdk/s:e	I
    //   60: bipush -70
    //   62: if_icmpgt +160 -> 222
    //   65: iconst_3
    //   66: istore 12
    //   68: aload_0
    //   69: getfield 75	qalsdk/u:e	Ljava/util/ArrayList;
    //   72: invokevirtual 177	java/util/ArrayList:size	()I
    //   75: iconst_1
    //   76: if_icmplt +678 -> 754
    //   79: new 185	qalsdk/t
    //   82: dup
    //   83: invokespecial 186	qalsdk/t:<init>	()V
    //   86: astore 6
    //   88: aload 6
    //   90: aload_0
    //   91: getfield 75	qalsdk/u:e	Ljava/util/ArrayList;
    //   94: invokevirtual 189	qalsdk/t:a	(Ljava/util/ArrayList;)V
    //   97: aload 6
    //   99: ifnull +655 -> 754
    //   102: aload 6
    //   104: invokevirtual 192	qalsdk/t:a	()Ljava/util/ArrayList;
    //   107: invokevirtual 177	java/util/ArrayList:size	()I
    //   110: ifle +644 -> 754
    //   113: new 194	com/qq/taf/jce/JceOutputStream
    //   116: dup
    //   117: invokespecial 195	com/qq/taf/jce/JceOutputStream:<init>	()V
    //   120: astore 7
    //   122: aload 6
    //   124: aload 7
    //   126: invokevirtual 199	qalsdk/t:writeTo	(Lcom/qq/taf/jce/JceOutputStream;)V
    //   129: aload 7
    //   131: invokevirtual 203	com/qq/taf/jce/JceOutputStream:toByteArray	()[B
    //   134: invokestatic 209	com/qq/taf/jce/HexUtil:bytes2HexStr	([B)Ljava/lang/String;
    //   137: astore 7
    //   139: aload_0
    //   140: getfield 75	qalsdk/u:e	Ljava/util/ArrayList;
    //   143: invokevirtual 212	java/util/ArrayList:clear	()V
    //   146: new 214	java/lang/StringBuilder
    //   149: dup
    //   150: invokespecial 215	java/lang/StringBuilder:<init>	()V
    //   153: astore 6
    //   155: aload 4
    //   157: invokevirtual 219	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   160: astore 4
    //   162: aload 4
    //   164: invokeinterface 224 1 0
    //   169: ifeq +62 -> 231
    //   172: aload 4
    //   174: invokeinterface 228 1 0
    //   179: checkcast 230	qalsdk/al
    //   182: astore 8
    //   184: aload 6
    //   186: new 214	java/lang/StringBuilder
    //   189: dup
    //   190: invokespecial 215	java/lang/StringBuilder:<init>	()V
    //   193: aload 8
    //   195: getfield 232	qalsdk/al:b	Ljava/lang/String;
    //   198: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   201: ldc -18
    //   203: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: invokevirtual 241	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   209: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   212: pop
    //   213: goto -51 -> 162
    //   216: iconst_2
    //   217: istore 11
    //   219: goto -192 -> 27
    //   222: iload 13
    //   224: iconst_1
    //   225: iadd
    //   226: istore 13
    //   228: goto -198 -> 30
    //   231: aload 6
    //   233: invokevirtual 241	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   236: astore 8
    //   238: aload 8
    //   240: ldc -18
    //   242: invokevirtual 247	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   245: ifeq +506 -> 751
    //   248: aload 8
    //   250: iconst_0
    //   251: aload 8
    //   253: invokevirtual 250	java/lang/String:length	()I
    //   256: iconst_1
    //   257: isub
    //   258: invokevirtual 254	java/lang/String:substring	(II)Ljava/lang/String;
    //   261: astore 8
    //   263: invokestatic 259	com/tencent/qalsdk/core/o:m	()Ljava/lang/String;
    //   266: astore 10
    //   268: iload 12
    //   270: iconst_1
    //   271: if_icmpeq +475 -> 746
    //   274: iload 5
    //   276: ifne +373 -> 649
    //   279: iconst_1
    //   280: istore_1
    //   281: ldc_w 261
    //   284: iconst_1
    //   285: new 214	java/lang/StringBuilder
    //   288: dup
    //   289: invokespecial 215	java/lang/StringBuilder:<init>	()V
    //   292: ldc_w 263
    //   295: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   298: lload 15
    //   300: invokevirtual 266	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   303: ldc_w 268
    //   306: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   309: iload 14
    //   311: invokevirtual 271	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   314: ldc_w 268
    //   317: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   320: iload 12
    //   322: invokevirtual 271	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   325: ldc_w 268
    //   328: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   331: iconst_1
    //   332: invokevirtual 271	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   335: ldc_w 268
    //   338: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   341: aload 9
    //   343: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   346: ldc_w 268
    //   349: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   352: ldc_w 273
    //   355: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   358: ldc_w 268
    //   361: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   364: iload 11
    //   366: invokevirtual 271	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   369: ldc_w 268
    //   372: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   375: aload 8
    //   377: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   380: ldc_w 268
    //   383: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   386: aload 10
    //   388: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   391: ldc_w 268
    //   394: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   397: iload_1
    //   398: invokevirtual 271	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   401: ldc_w 268
    //   404: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   407: aload_0
    //   408: getfield 75	qalsdk/u:e	Ljava/util/ArrayList;
    //   411: invokevirtual 177	java/util/ArrayList:size	()I
    //   414: invokevirtual 271	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   417: invokevirtual 241	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   420: invokestatic 278	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   423: getstatic 280	qalsdk/u:l	Landroid/database/sqlite/SQLiteDatabase;
    //   426: ifnonnull +12 -> 438
    //   429: getstatic 68	qalsdk/u:k	Lqalsdk/r;
    //   432: invokevirtual 284	qalsdk/r:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   435: putstatic 280	qalsdk/u:l	Landroid/database/sqlite/SQLiteDatabase;
    //   438: getstatic 280	qalsdk/u:l	Landroid/database/sqlite/SQLiteDatabase;
    //   441: ldc_w 286
    //   444: iconst_2
    //   445: anewarray 243	java/lang/String
    //   448: dup
    //   449: iconst_0
    //   450: ldc_w 288
    //   453: aastore
    //   454: dup
    //   455: iconst_1
    //   456: ldc_w 290
    //   459: aastore
    //   460: aconst_null
    //   461: aconst_null
    //   462: aconst_null
    //   463: aconst_null
    //   464: aconst_null
    //   465: invokevirtual 296	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   468: astore 6
    //   470: aload 6
    //   472: ifnull +69 -> 541
    //   475: aload 6
    //   477: astore 4
    //   479: aload 6
    //   481: invokeinterface 301 1 0
    //   486: getstatic 40	qalsdk/u:g	I
    //   489: if_icmple +52 -> 541
    //   492: aload 6
    //   494: astore 4
    //   496: ldc_w 261
    //   499: new 214	java/lang/StringBuilder
    //   502: dup
    //   503: invokespecial 215	java/lang/StringBuilder:<init>	()V
    //   506: ldc_w 303
    //   509: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   512: aload 6
    //   514: invokeinterface 301 1 0
    //   519: invokevirtual 271	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   522: invokevirtual 241	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   525: invokestatic 306	com/tencent/qalsdk/util/QLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   528: aload 6
    //   530: astore 4
    //   532: getstatic 280	qalsdk/u:l	Landroid/database/sqlite/SQLiteDatabase;
    //   535: ldc_w 308
    //   538: invokevirtual 312	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   541: aload 6
    //   543: astore 4
    //   545: getstatic 280	qalsdk/u:l	Landroid/database/sqlite/SQLiteDatabase;
    //   548: ldc_w 314
    //   551: bipush 11
    //   553: anewarray 4	java/lang/Object
    //   556: dup
    //   557: iconst_0
    //   558: lload 15
    //   560: invokestatic 320	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   563: aastore
    //   564: dup
    //   565: iconst_1
    //   566: iload 14
    //   568: invokestatic 325	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   571: aastore
    //   572: dup
    //   573: iconst_2
    //   574: iload 12
    //   576: invokestatic 325	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   579: aastore
    //   580: dup
    //   581: iconst_3
    //   582: iconst_1
    //   583: invokestatic 325	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   586: aastore
    //   587: dup
    //   588: iconst_4
    //   589: aload 9
    //   591: aastore
    //   592: dup
    //   593: iconst_5
    //   594: ldc_w 273
    //   597: aastore
    //   598: dup
    //   599: bipush 6
    //   601: iload 11
    //   603: invokestatic 325	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   606: aastore
    //   607: dup
    //   608: bipush 7
    //   610: aload 8
    //   612: aastore
    //   613: dup
    //   614: bipush 8
    //   616: aload 10
    //   618: aastore
    //   619: dup
    //   620: bipush 9
    //   622: iload_1
    //   623: invokestatic 325	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   626: aastore
    //   627: dup
    //   628: bipush 10
    //   630: aload 7
    //   632: aastore
    //   633: invokevirtual 328	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   636: aload 6
    //   638: ifnull +10 -> 648
    //   641: aload 6
    //   643: invokeinterface 331 1 0
    //   648: return
    //   649: iload 5
    //   651: iconst_1
    //   652: if_icmpne +8 -> 660
    //   655: iconst_0
    //   656: istore_1
    //   657: goto -376 -> 281
    //   660: iload 5
    //   662: iconst_2
    //   663: if_icmpne +8 -> 671
    //   666: iconst_3
    //   667: istore_1
    //   668: goto -387 -> 281
    //   671: iload 5
    //   673: iconst_3
    //   674: if_icmpne +72 -> 746
    //   677: iconst_2
    //   678: istore_1
    //   679: goto -398 -> 281
    //   682: astore 7
    //   684: aconst_null
    //   685: astore 6
    //   687: aload 6
    //   689: astore 4
    //   691: ldc_w 261
    //   694: iconst_1
    //   695: ldc_w 333
    //   698: aload 7
    //   700: invokestatic 336	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   703: aload 6
    //   705: ifnull -57 -> 648
    //   708: aload 6
    //   710: invokeinterface 331 1 0
    //   715: return
    //   716: astore 6
    //   718: aconst_null
    //   719: astore 4
    //   721: aload 4
    //   723: ifnull +10 -> 733
    //   726: aload 4
    //   728: invokeinterface 331 1 0
    //   733: aload 6
    //   735: athrow
    //   736: astore 6
    //   738: goto -17 -> 721
    //   741: astore 7
    //   743: goto -56 -> 687
    //   746: iconst_0
    //   747: istore_1
    //   748: goto -467 -> 281
    //   751: goto -488 -> 263
    //   754: aconst_null
    //   755: astore 7
    //   757: goto -618 -> 139
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	760	0	this	u
    //   0	760	1	paramInt1	int
    //   0	760	2	paramLong	long
    //   0	760	4	paramArrayList	ArrayList<al>
    //   0	760	5	paramInt2	int
    //   86	623	6	localObject1	Object
    //   716	18	6	localObject2	Object
    //   736	1	6	localObject3	Object
    //   120	511	7	localObject4	Object
    //   682	17	7	localException1	Exception
    //   741	1	7	localException2	Exception
    //   755	1	7	localObject5	Object
    //   182	429	8	localObject6	Object
    //   16	574	9	str1	String
    //   266	351	10	str2	String
    //   25	577	11	m	int
    //   31	544	12	n	int
    //   28	199	13	i1	int
    //   11	556	14	i2	int
    //   7	552	15	l1	long
    // Exception table:
    //   from	to	target	type
    //   423	438	682	java/lang/Exception
    //   438	470	682	java/lang/Exception
    //   423	438	716	finally
    //   438	470	716	finally
    //   479	492	736	finally
    //   496	528	736	finally
    //   532	541	736	finally
    //   545	636	736	finally
    //   691	703	736	finally
    //   479	492	741	java/lang/Exception
    //   496	528	741	java/lang/Exception
    //   532	541	741	java/lang/Exception
    //   545	636	741	java/lang/Exception
  }
  
  public void a(FromServiceMsg paramFromServiceMsg)
  {
    if (l == null) {
      l = k.getWritableDatabase();
    }
    if (paramFromServiceMsg.isSuccess())
    {
      l.execSQL("DELETE FROM conntime");
      QLog.d("MSF.C.StatReport", "delete all conntime record");
    }
  }
  
  public void b()
  {
    this.e.clear();
    this.i.post(this.d);
  }
  
  public void c()
  {
    this.j = 0;
    this.i.removeCallbacks(this.d);
  }
  
  /* Error */
  public void d()
  {
    // Byte code:
    //   0: getstatic 280	qalsdk/u:l	Landroid/database/sqlite/SQLiteDatabase;
    //   3: ifnonnull +12 -> 15
    //   6: getstatic 68	qalsdk/u:k	Lqalsdk/r;
    //   9: invokevirtual 284	qalsdk/r:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   12: putstatic 280	qalsdk/u:l	Landroid/database/sqlite/SQLiteDatabase;
    //   15: getstatic 280	qalsdk/u:l	Landroid/database/sqlite/SQLiteDatabase;
    //   18: ldc_w 286
    //   21: bipush 11
    //   23: anewarray 243	java/lang/String
    //   26: dup
    //   27: iconst_0
    //   28: ldc_w 288
    //   31: aastore
    //   32: dup
    //   33: iconst_1
    //   34: ldc_w 290
    //   37: aastore
    //   38: dup
    //   39: iconst_2
    //   40: ldc_w 358
    //   43: aastore
    //   44: dup
    //   45: iconst_3
    //   46: ldc_w 360
    //   49: aastore
    //   50: dup
    //   51: iconst_4
    //   52: ldc_w 362
    //   55: aastore
    //   56: dup
    //   57: iconst_5
    //   58: ldc_w 364
    //   61: aastore
    //   62: dup
    //   63: bipush 6
    //   65: ldc_w 366
    //   68: aastore
    //   69: dup
    //   70: bipush 7
    //   72: ldc_w 368
    //   75: aastore
    //   76: dup
    //   77: bipush 8
    //   79: ldc_w 370
    //   82: aastore
    //   83: dup
    //   84: bipush 9
    //   86: ldc_w 372
    //   89: aastore
    //   90: dup
    //   91: bipush 10
    //   93: ldc_w 374
    //   96: aastore
    //   97: aconst_null
    //   98: aconst_null
    //   99: aconst_null
    //   100: aconst_null
    //   101: aconst_null
    //   102: invokevirtual 296	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   105: astore_2
    //   106: aload_2
    //   107: ifnull +19 -> 126
    //   110: aload_2
    //   111: astore_1
    //   112: aload_2
    //   113: invokeinterface 301 1 0
    //   118: istore 8
    //   120: iload 8
    //   122: iconst_1
    //   123: if_icmpge +14 -> 137
    //   126: aload_2
    //   127: ifnull +9 -> 136
    //   130: aload_2
    //   131: invokeinterface 331 1 0
    //   136: return
    //   137: aload_2
    //   138: astore_1
    //   139: aload_2
    //   140: invokeinterface 377 1 0
    //   145: pop
    //   146: aload_2
    //   147: astore_1
    //   148: new 379	com/tencent/qalsdk/im_open/QalMonitor$Request
    //   151: dup
    //   152: invokespecial 380	com/tencent/qalsdk/im_open/QalMonitor$Request:<init>	()V
    //   155: astore_3
    //   156: iconst_0
    //   157: istore 8
    //   159: aload_2
    //   160: astore_1
    //   161: aload_2
    //   162: invokeinterface 383 1 0
    //   167: ifne +653 -> 820
    //   170: aload_2
    //   171: astore_1
    //   172: new 385	com/tencent/qalsdk/im_open/QalMonitor$Request$Conn
    //   175: dup
    //   176: invokespecial 386	com/tencent/qalsdk/im_open/QalMonitor$Request$Conn:<init>	()V
    //   179: astore 4
    //   181: aload_2
    //   182: astore_1
    //   183: aload 4
    //   185: getfield 389	com/tencent/qalsdk/im_open/QalMonitor$Request$Conn:timestamp	Lcom/tencent/mobileqq/pb/PBUInt32Field;
    //   188: aload_2
    //   189: iconst_0
    //   190: invokeinterface 393 2 0
    //   195: invokevirtual 398	com/tencent/mobileqq/pb/PBUInt32Field:set	(I)V
    //   198: aload_2
    //   199: astore_1
    //   200: aload 4
    //   202: getfield 401	com/tencent/qalsdk/im_open/QalMonitor$Request$Conn:cost_time	Lcom/tencent/mobileqq/pb/PBInt32Field;
    //   205: aload_2
    //   206: iconst_1
    //   207: invokeinterface 393 2 0
    //   212: invokevirtual 404	com/tencent/mobileqq/pb/PBInt32Field:set	(I)V
    //   215: aload_2
    //   216: astore_1
    //   217: aload 4
    //   219: getfield 407	com/tencent/qalsdk/im_open/QalMonitor$Request$Conn:result	Lcom/tencent/mobileqq/pb/PBEnumField;
    //   222: aload_2
    //   223: iconst_2
    //   224: invokeinterface 393 2 0
    //   229: invokevirtual 410	com/tencent/mobileqq/pb/PBEnumField:set	(I)V
    //   232: aload_2
    //   233: astore_1
    //   234: aload 4
    //   236: getfield 412	com/tencent/qalsdk/im_open/QalMonitor$Request$Conn:os	Lcom/tencent/mobileqq/pb/PBEnumField;
    //   239: aload_2
    //   240: iconst_3
    //   241: invokeinterface 393 2 0
    //   246: invokevirtual 410	com/tencent/mobileqq/pb/PBEnumField:set	(I)V
    //   249: aload_2
    //   250: astore_1
    //   251: aload 4
    //   253: getfield 415	com/tencent/qalsdk/im_open/QalMonitor$Request$Conn:os_version	Lcom/tencent/mobileqq/pb/PBStringField;
    //   256: aload_2
    //   257: iconst_4
    //   258: invokeinterface 419 2 0
    //   263: invokevirtual 423	com/tencent/mobileqq/pb/PBStringField:set	(Ljava/lang/String;)V
    //   266: aload_2
    //   267: astore_1
    //   268: aload 4
    //   270: getfield 425	com/tencent/qalsdk/im_open/QalMonitor$Request$Conn:sdk_version	Lcom/tencent/mobileqq/pb/PBStringField;
    //   273: aload_2
    //   274: iconst_5
    //   275: invokeinterface 419 2 0
    //   280: invokevirtual 423	com/tencent/mobileqq/pb/PBStringField:set	(Ljava/lang/String;)V
    //   283: aload_2
    //   284: astore_1
    //   285: aload 4
    //   287: getfield 427	com/tencent/qalsdk/im_open/QalMonitor$Request$Conn:process_status	Lcom/tencent/mobileqq/pb/PBEnumField;
    //   290: aload_2
    //   291: bipush 6
    //   293: invokeinterface 393 2 0
    //   298: invokevirtual 410	com/tencent/mobileqq/pb/PBEnumField:set	(I)V
    //   301: aload_2
    //   302: astore_1
    //   303: aload 4
    //   305: getfield 429	com/tencent/qalsdk/im_open/QalMonitor$Request$Conn:server_ip_port	Lcom/tencent/mobileqq/pb/PBStringField;
    //   308: aload_2
    //   309: bipush 7
    //   311: invokeinterface 419 2 0
    //   316: invokevirtual 423	com/tencent/mobileqq/pb/PBStringField:set	(Ljava/lang/String;)V
    //   319: aload_2
    //   320: astore_1
    //   321: aload 4
    //   323: getfield 431	com/tencent/qalsdk/im_open/QalMonitor$Request$Conn:gateway_ip	Lcom/tencent/mobileqq/pb/PBStringField;
    //   326: aload_2
    //   327: bipush 8
    //   329: invokeinterface 419 2 0
    //   334: invokevirtual 423	com/tencent/mobileqq/pb/PBStringField:set	(Ljava/lang/String;)V
    //   337: aload_2
    //   338: astore_1
    //   339: aload 4
    //   341: getfield 433	com/tencent/qalsdk/im_open/QalMonitor$Request$Conn:errcode	Lcom/tencent/mobileqq/pb/PBInt32Field;
    //   344: aload_2
    //   345: bipush 9
    //   347: invokeinterface 393 2 0
    //   352: invokevirtual 404	com/tencent/mobileqq/pb/PBInt32Field:set	(I)V
    //   355: aload_2
    //   356: astore_1
    //   357: aload_2
    //   358: bipush 10
    //   360: invokeinterface 419 2 0
    //   365: astore 5
    //   367: aload 5
    //   369: ifnull +221 -> 590
    //   372: aload_2
    //   373: astore_1
    //   374: aload 5
    //   376: invokevirtual 250	java/lang/String:length	()I
    //   379: ifeq +211 -> 590
    //   382: aload_2
    //   383: astore_1
    //   384: new 435	com/qq/taf/jce/JceInputStream
    //   387: dup
    //   388: aload 5
    //   390: invokestatic 439	com/qq/taf/jce/HexUtil:hexStr2Bytes	(Ljava/lang/String;)[B
    //   393: invokespecial 442	com/qq/taf/jce/JceInputStream:<init>	([B)V
    //   396: astore 6
    //   398: aload_2
    //   399: astore_1
    //   400: new 185	qalsdk/t
    //   403: dup
    //   404: invokespecial 186	qalsdk/t:<init>	()V
    //   407: astore 5
    //   409: aload_2
    //   410: astore_1
    //   411: aload 5
    //   413: aload 6
    //   415: invokevirtual 446	qalsdk/t:readFrom	(Lcom/qq/taf/jce/JceInputStream;)V
    //   418: iconst_0
    //   419: istore 9
    //   421: aload_2
    //   422: astore_1
    //   423: iload 9
    //   425: aload 5
    //   427: invokevirtual 192	qalsdk/t:a	()Ljava/util/ArrayList;
    //   430: invokevirtual 177	java/util/ArrayList:size	()I
    //   433: if_icmpge +157 -> 590
    //   436: aload_2
    //   437: astore_1
    //   438: aload 5
    //   440: invokevirtual 192	qalsdk/t:a	()Ljava/util/ArrayList;
    //   443: iload 9
    //   445: invokevirtual 181	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   448: checkcast 133	qalsdk/s
    //   451: astore 6
    //   453: aload_2
    //   454: astore_1
    //   455: new 448	com/tencent/qalsdk/im_open/QalMonitor$Request$Environment
    //   458: dup
    //   459: invokespecial 449	com/tencent/qalsdk/im_open/QalMonitor$Request$Environment:<init>	()V
    //   462: astore 7
    //   464: aload_2
    //   465: astore_1
    //   466: aload 7
    //   468: getfield 452	com/tencent/qalsdk/im_open/QalMonitor$Request$Environment:apn	Lcom/tencent/mobileqq/pb/PBStringField;
    //   471: aload 6
    //   473: getfield 139	qalsdk/s:a	Ljava/lang/String;
    //   476: invokevirtual 423	com/tencent/mobileqq/pb/PBStringField:set	(Ljava/lang/String;)V
    //   479: aload_2
    //   480: astore_1
    //   481: aload 7
    //   483: getfield 455	com/tencent/qalsdk/im_open/QalMonitor$Request$Environment:wifi_supplicant_state	Lcom/tencent/mobileqq/pb/PBStringField;
    //   486: aload 6
    //   488: getfield 456	qalsdk/s:b	Ljava/lang/String;
    //   491: invokevirtual 423	com/tencent/mobileqq/pb/PBStringField:set	(Ljava/lang/String;)V
    //   494: aload_2
    //   495: astore_1
    //   496: aload 7
    //   498: getfield 459	com/tencent/qalsdk/im_open/QalMonitor$Request$Environment:wifi_ssid	Lcom/tencent/mobileqq/pb/PBStringField;
    //   501: aload 6
    //   503: getfield 461	qalsdk/s:c	Ljava/lang/String;
    //   506: invokevirtual 423	com/tencent/mobileqq/pb/PBStringField:set	(Ljava/lang/String;)V
    //   509: aload_2
    //   510: astore_1
    //   511: aload 7
    //   513: getfield 464	com/tencent/qalsdk/im_open/QalMonitor$Request$Environment:wifi_bssid	Lcom/tencent/mobileqq/pb/PBStringField;
    //   516: aload 6
    //   518: getfield 466	qalsdk/s:d	Ljava/lang/String;
    //   521: invokevirtual 423	com/tencent/mobileqq/pb/PBStringField:set	(Ljava/lang/String;)V
    //   524: aload_2
    //   525: astore_1
    //   526: aload 7
    //   528: getfield 469	com/tencent/qalsdk/im_open/QalMonitor$Request$Environment:wifi_rssi	Lcom/tencent/mobileqq/pb/PBInt32Field;
    //   531: aload 6
    //   533: getfield 183	qalsdk/s:e	I
    //   536: invokevirtual 404	com/tencent/mobileqq/pb/PBInt32Field:set	(I)V
    //   539: aload_2
    //   540: astore_1
    //   541: aload 7
    //   543: getfield 472	com/tencent/qalsdk/im_open/QalMonitor$Request$Environment:rat	Lcom/tencent/mobileqq/pb/PBInt32Field;
    //   546: aload 6
    //   548: getfield 144	qalsdk/s:f	I
    //   551: invokevirtual 404	com/tencent/mobileqq/pb/PBInt32Field:set	(I)V
    //   554: aload_2
    //   555: astore_1
    //   556: aload 7
    //   558: getfield 475	com/tencent/qalsdk/im_open/QalMonitor$Request$Environment:rat_ss	Lcom/tencent/mobileqq/pb/PBInt32Field;
    //   561: aload 6
    //   563: getfield 153	qalsdk/s:g	I
    //   566: invokevirtual 404	com/tencent/mobileqq/pb/PBInt32Field:set	(I)V
    //   569: aload_2
    //   570: astore_1
    //   571: aload 4
    //   573: getfield 479	com/tencent/qalsdk/im_open/QalMonitor$Request$Conn:env	Lcom/tencent/mobileqq/pb/PBRepeatMessageField;
    //   576: aload 7
    //   578: invokevirtual 485	com/tencent/mobileqq/pb/PBRepeatMessageField:add	(Lcom/tencent/mobileqq/pb/MessageMicro;)V
    //   581: iload 9
    //   583: iconst_1
    //   584: iadd
    //   585: istore 9
    //   587: goto -166 -> 421
    //   590: aload_2
    //   591: astore_1
    //   592: aload_3
    //   593: getfield 488	com/tencent/qalsdk/im_open/QalMonitor$Request:conn	Lcom/tencent/mobileqq/pb/PBRepeatMessageField;
    //   596: aload 4
    //   598: invokevirtual 485	com/tencent/mobileqq/pb/PBRepeatMessageField:add	(Lcom/tencent/mobileqq/pb/MessageMicro;)V
    //   601: aload_2
    //   602: astore_1
    //   603: ldc_w 261
    //   606: iconst_4
    //   607: new 214	java/lang/StringBuilder
    //   610: dup
    //   611: invokespecial 215	java/lang/StringBuilder:<init>	()V
    //   614: ldc_w 490
    //   617: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   620: ldc -18
    //   622: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   625: aload 4
    //   627: getfield 389	com/tencent/qalsdk/im_open/QalMonitor$Request$Conn:timestamp	Lcom/tencent/mobileqq/pb/PBUInt32Field;
    //   630: invokevirtual 492	com/tencent/mobileqq/pb/PBUInt32Field:get	()I
    //   633: invokevirtual 271	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   636: ldc -18
    //   638: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   641: aload 4
    //   643: getfield 401	com/tencent/qalsdk/im_open/QalMonitor$Request$Conn:cost_time	Lcom/tencent/mobileqq/pb/PBInt32Field;
    //   646: invokevirtual 493	com/tencent/mobileqq/pb/PBInt32Field:get	()I
    //   649: invokevirtual 271	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   652: ldc -18
    //   654: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   657: aload 4
    //   659: getfield 407	com/tencent/qalsdk/im_open/QalMonitor$Request$Conn:result	Lcom/tencent/mobileqq/pb/PBEnumField;
    //   662: invokevirtual 494	com/tencent/mobileqq/pb/PBEnumField:get	()I
    //   665: invokevirtual 271	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   668: ldc -18
    //   670: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   673: aload 4
    //   675: getfield 412	com/tencent/qalsdk/im_open/QalMonitor$Request$Conn:os	Lcom/tencent/mobileqq/pb/PBEnumField;
    //   678: invokevirtual 494	com/tencent/mobileqq/pb/PBEnumField:get	()I
    //   681: invokevirtual 271	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   684: ldc -18
    //   686: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   689: aload 4
    //   691: getfield 415	com/tencent/qalsdk/im_open/QalMonitor$Request$Conn:os_version	Lcom/tencent/mobileqq/pb/PBStringField;
    //   694: invokevirtual 496	com/tencent/mobileqq/pb/PBStringField:get	()Ljava/lang/String;
    //   697: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   700: ldc -18
    //   702: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   705: aload 4
    //   707: getfield 425	com/tencent/qalsdk/im_open/QalMonitor$Request$Conn:sdk_version	Lcom/tencent/mobileqq/pb/PBStringField;
    //   710: invokevirtual 496	com/tencent/mobileqq/pb/PBStringField:get	()Ljava/lang/String;
    //   713: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   716: ldc -18
    //   718: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   721: aload 4
    //   723: getfield 427	com/tencent/qalsdk/im_open/QalMonitor$Request$Conn:process_status	Lcom/tencent/mobileqq/pb/PBEnumField;
    //   726: invokevirtual 494	com/tencent/mobileqq/pb/PBEnumField:get	()I
    //   729: invokevirtual 271	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   732: ldc -18
    //   734: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   737: aload 4
    //   739: getfield 429	com/tencent/qalsdk/im_open/QalMonitor$Request$Conn:server_ip_port	Lcom/tencent/mobileqq/pb/PBStringField;
    //   742: invokevirtual 496	com/tencent/mobileqq/pb/PBStringField:get	()Ljava/lang/String;
    //   745: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   748: ldc -18
    //   750: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   753: aload 4
    //   755: getfield 431	com/tencent/qalsdk/im_open/QalMonitor$Request$Conn:gateway_ip	Lcom/tencent/mobileqq/pb/PBStringField;
    //   758: invokevirtual 496	com/tencent/mobileqq/pb/PBStringField:get	()Ljava/lang/String;
    //   761: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   764: ldc -18
    //   766: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   769: aload 4
    //   771: getfield 433	com/tencent/qalsdk/im_open/QalMonitor$Request$Conn:errcode	Lcom/tencent/mobileqq/pb/PBInt32Field;
    //   774: invokevirtual 493	com/tencent/mobileqq/pb/PBInt32Field:get	()I
    //   777: invokevirtual 271	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   780: ldc -18
    //   782: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   785: aload 4
    //   787: getfield 479	com/tencent/qalsdk/im_open/QalMonitor$Request$Conn:env	Lcom/tencent/mobileqq/pb/PBRepeatMessageField;
    //   790: invokevirtual 497	com/tencent/mobileqq/pb/PBRepeatMessageField:size	()I
    //   793: invokevirtual 271	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   796: invokevirtual 241	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   799: invokestatic 278	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   802: aload_2
    //   803: astore_1
    //   804: aload_2
    //   805: invokeinterface 500 1 0
    //   810: pop
    //   811: iload 8
    //   813: iconst_1
    //   814: iadd
    //   815: istore 8
    //   817: goto -658 -> 159
    //   820: aload_2
    //   821: astore_1
    //   822: getstatic 38	qalsdk/u:f	Ljava/util/concurrent/atomic/AtomicInteger;
    //   825: invokevirtual 503	java/util/concurrent/atomic/AtomicInteger:incrementAndGet	()I
    //   828: istore 9
    //   830: aload_2
    //   831: astore_1
    //   832: aload_3
    //   833: getfield 506	com/tencent/qalsdk/im_open/QalMonitor$Request:seqno	Lcom/tencent/mobileqq/pb/PBUInt32Field;
    //   836: iload 9
    //   838: invokevirtual 398	com/tencent/mobileqq/pb/PBUInt32Field:set	(I)V
    //   841: aload_2
    //   842: astore_1
    //   843: aload_3
    //   844: invokevirtual 507	com/tencent/qalsdk/im_open/QalMonitor$Request:toByteArray	()[B
    //   847: astore_3
    //   848: aload_2
    //   849: astore_1
    //   850: new 509	com/tencent/qalsdk/base/remote/ToServiceMsg
    //   853: dup
    //   854: ldc_w 511
    //   857: invokestatic 59	com/tencent/qalsdk/core/j:a	()Lcom/tencent/qalsdk/core/j;
    //   860: invokevirtual 514	com/tencent/qalsdk/core/j:b	()Lcom/tencent/qalsdk/core/a;
    //   863: invokevirtual 518	com/tencent/qalsdk/core/a:c	()Ljava/lang/String;
    //   866: ldc_w 520
    //   869: invokespecial 523	com/tencent/qalsdk/base/remote/ToServiceMsg:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   872: astore 4
    //   874: aload_2
    //   875: astore_1
    //   876: aload 4
    //   878: aload_3
    //   879: invokestatic 526	com/tencent/qalsdk/core/o:b	([B)[B
    //   882: invokevirtual 529	com/tencent/qalsdk/base/remote/ToServiceMsg:putWupBuffer	([B)V
    //   885: aload_2
    //   886: astore_1
    //   887: aload 4
    //   889: bipush 20
    //   891: invokevirtual 532	com/tencent/qalsdk/base/remote/ToServiceMsg:setUinType	(I)V
    //   894: aload_2
    //   895: astore_1
    //   896: aload 4
    //   898: getstatic 538	com/tencent/qalsdk/sdk/MsfCommand:qal_reportEvent	Lcom/tencent/qalsdk/sdk/MsfCommand;
    //   901: invokevirtual 542	com/tencent/qalsdk/base/remote/ToServiceMsg:setMsfCommand	(Lcom/tencent/qalsdk/sdk/MsfCommand;)V
    //   904: aload_2
    //   905: astore_1
    //   906: aload 4
    //   908: ldc_w 543
    //   911: invokevirtual 546	com/tencent/qalsdk/base/remote/ToServiceMsg:setAppId	(I)V
    //   914: aload_2
    //   915: astore_1
    //   916: aload 4
    //   918: ldc2_w 547
    //   921: invokevirtual 552	com/tencent/qalsdk/base/remote/ToServiceMsg:setTimeout	(J)V
    //   924: aload_2
    //   925: astore_1
    //   926: invokestatic 59	com/tencent/qalsdk/core/j:a	()Lcom/tencent/qalsdk/core/j;
    //   929: getfield 63	com/tencent/qalsdk/core/j:r	Landroid/content/Context;
    //   932: invokestatic 556	com/tencent/qalsdk/sdk/MsfSdkUtils:getProcessName	(Landroid/content/Context;)Ljava/lang/String;
    //   935: aload 4
    //   937: invokestatic 560	com/tencent/qalsdk/sdk/MsfSdkUtils:addToMsgProcessName	(Ljava/lang/String;Lcom/tencent/qalsdk/base/remote/ToServiceMsg;)V
    //   940: aload_2
    //   941: astore_1
    //   942: invokestatic 59	com/tencent/qalsdk/core/j:a	()Lcom/tencent/qalsdk/core/j;
    //   945: aload 4
    //   947: invokevirtual 563	com/tencent/qalsdk/core/j:a	(Lcom/tencent/qalsdk/base/remote/ToServiceMsg;)I
    //   950: pop
    //   951: aload_2
    //   952: astore_1
    //   953: iload 8
    //   955: getstatic 40	qalsdk/u:g	I
    //   958: if_icmple +44 -> 1002
    //   961: aload_2
    //   962: astore_1
    //   963: ldc_w 261
    //   966: iconst_4
    //   967: new 214	java/lang/StringBuilder
    //   970: dup
    //   971: invokespecial 215	java/lang/StringBuilder:<init>	()V
    //   974: ldc_w 565
    //   977: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   980: iload 8
    //   982: invokevirtual 271	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   985: invokevirtual 241	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   988: invokestatic 278	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   991: aload_2
    //   992: astore_1
    //   993: getstatic 280	qalsdk/u:l	Landroid/database/sqlite/SQLiteDatabase;
    //   996: ldc_w 308
    //   999: invokevirtual 312	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   1002: aload_2
    //   1003: ifnull -867 -> 136
    //   1006: aload_2
    //   1007: invokeinterface 331 1 0
    //   1012: return
    //   1013: astore_3
    //   1014: aconst_null
    //   1015: astore_2
    //   1016: aload_2
    //   1017: astore_1
    //   1018: ldc_w 261
    //   1021: iconst_1
    //   1022: new 214	java/lang/StringBuilder
    //   1025: dup
    //   1026: invokespecial 215	java/lang/StringBuilder:<init>	()V
    //   1029: ldc_w 567
    //   1032: invokevirtual 236	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1035: aload_3
    //   1036: invokevirtual 570	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1039: invokevirtual 241	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1042: aload_3
    //   1043: invokestatic 336	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   1046: aload_2
    //   1047: ifnull -911 -> 136
    //   1050: aload_2
    //   1051: invokeinterface 331 1 0
    //   1056: return
    //   1057: astore_2
    //   1058: aconst_null
    //   1059: astore_1
    //   1060: aload_1
    //   1061: ifnull +9 -> 1070
    //   1064: aload_1
    //   1065: invokeinterface 331 1 0
    //   1070: aload_2
    //   1071: athrow
    //   1072: astore_2
    //   1073: goto -13 -> 1060
    //   1076: astore_3
    //   1077: goto -61 -> 1016
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1080	0	this	u
    //   111	954	1	localCursor1	android.database.Cursor
    //   105	946	2	localCursor2	android.database.Cursor
    //   1057	14	2	localObject1	Object
    //   1072	1	2	localObject2	Object
    //   155	724	3	localObject3	Object
    //   1013	30	3	localException1	Exception
    //   1076	1	3	localException2	Exception
    //   179	767	4	localObject4	Object
    //   365	74	5	localObject5	Object
    //   396	166	6	localObject6	Object
    //   462	115	7	localEnvironment	com.tencent.qalsdk.im_open.QalMonitor.Request.Environment
    //   118	863	8	m	int
    //   419	418	9	n	int
    // Exception table:
    //   from	to	target	type
    //   15	106	1013	java/lang/Exception
    //   15	106	1057	finally
    //   112	120	1072	finally
    //   139	146	1072	finally
    //   148	156	1072	finally
    //   161	170	1072	finally
    //   172	181	1072	finally
    //   183	198	1072	finally
    //   200	215	1072	finally
    //   217	232	1072	finally
    //   234	249	1072	finally
    //   251	266	1072	finally
    //   268	283	1072	finally
    //   285	301	1072	finally
    //   303	319	1072	finally
    //   321	337	1072	finally
    //   339	355	1072	finally
    //   357	367	1072	finally
    //   374	382	1072	finally
    //   384	398	1072	finally
    //   400	409	1072	finally
    //   411	418	1072	finally
    //   423	436	1072	finally
    //   438	453	1072	finally
    //   455	464	1072	finally
    //   466	479	1072	finally
    //   481	494	1072	finally
    //   496	509	1072	finally
    //   511	524	1072	finally
    //   526	539	1072	finally
    //   541	554	1072	finally
    //   556	569	1072	finally
    //   571	581	1072	finally
    //   592	601	1072	finally
    //   603	802	1072	finally
    //   804	811	1072	finally
    //   822	830	1072	finally
    //   832	841	1072	finally
    //   843	848	1072	finally
    //   850	874	1072	finally
    //   876	885	1072	finally
    //   887	894	1072	finally
    //   896	904	1072	finally
    //   906	914	1072	finally
    //   916	924	1072	finally
    //   926	940	1072	finally
    //   942	951	1072	finally
    //   953	961	1072	finally
    //   963	991	1072	finally
    //   993	1002	1072	finally
    //   1018	1046	1072	finally
    //   112	120	1076	java/lang/Exception
    //   139	146	1076	java/lang/Exception
    //   148	156	1076	java/lang/Exception
    //   161	170	1076	java/lang/Exception
    //   172	181	1076	java/lang/Exception
    //   183	198	1076	java/lang/Exception
    //   200	215	1076	java/lang/Exception
    //   217	232	1076	java/lang/Exception
    //   234	249	1076	java/lang/Exception
    //   251	266	1076	java/lang/Exception
    //   268	283	1076	java/lang/Exception
    //   285	301	1076	java/lang/Exception
    //   303	319	1076	java/lang/Exception
    //   321	337	1076	java/lang/Exception
    //   339	355	1076	java/lang/Exception
    //   357	367	1076	java/lang/Exception
    //   374	382	1076	java/lang/Exception
    //   384	398	1076	java/lang/Exception
    //   400	409	1076	java/lang/Exception
    //   411	418	1076	java/lang/Exception
    //   423	436	1076	java/lang/Exception
    //   438	453	1076	java/lang/Exception
    //   455	464	1076	java/lang/Exception
    //   466	479	1076	java/lang/Exception
    //   481	494	1076	java/lang/Exception
    //   496	509	1076	java/lang/Exception
    //   511	524	1076	java/lang/Exception
    //   526	539	1076	java/lang/Exception
    //   541	554	1076	java/lang/Exception
    //   556	569	1076	java/lang/Exception
    //   571	581	1076	java/lang/Exception
    //   592	601	1076	java/lang/Exception
    //   603	802	1076	java/lang/Exception
    //   804	811	1076	java/lang/Exception
    //   822	830	1076	java/lang/Exception
    //   832	841	1076	java/lang/Exception
    //   843	848	1076	java/lang/Exception
    //   850	874	1076	java/lang/Exception
    //   876	885	1076	java/lang/Exception
    //   887	894	1076	java/lang/Exception
    //   896	904	1076	java/lang/Exception
    //   906	914	1076	java/lang/Exception
    //   916	924	1076	java/lang/Exception
    //   926	940	1076	java/lang/Exception
    //   942	951	1076	java/lang/Exception
    //   953	961	1076	java/lang/Exception
    //   963	991	1076	java/lang/Exception
    //   993	1002	1076	java/lang/Exception
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\qalsdk\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */