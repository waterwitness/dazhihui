package com.tencent.qalsdk.service;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.IInterface;
import android.os.RemoteException;
import com.tencent.qalsdk.core.j;
import com.tencent.qalsdk.util.QLog;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Random;

public class h
  implements IBinder.DeathRecipient
{
  private static final int A = 0;
  private static int B = 0;
  private static int C = 3;
  public static final int a = 2;
  public static final int b = 1;
  public static final int c = 0;
  public static final int d = 3;
  public static final boolean e = true;
  private static final int h = 500;
  private static final String i = "GuardManager";
  private static final String j = "gm_history";
  private static final int k = 1;
  private static final int l = 2;
  private static final int m = 3;
  private static final int n = 4;
  private static final int o = 5;
  private static long p = 720000L;
  private static long r = 0L;
  private static final int y = 2;
  private static final int z = 1;
  public boolean f = false;
  public volatile boolean g = false;
  private IBinder q;
  private int s = 1;
  private long t = 0L;
  private h.a u;
  private h.a v;
  private h.a w;
  private j x;
  
  public h(j paramj)
  {
    this.x = paramj;
  }
  
  private void a(long paramLong, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    int i1 = 1;
    paramInt1 = 1;
    Object localObject;
    if (paramInt3 != 0)
    {
      if (paramInt3 == 2) {
        paramInt1 = 2;
      }
      B = paramInt1;
      localObject = Calendar.getInstance(Locale.getDefault());
      ((Calendar)localObject).setTimeInMillis(paramLong - 15000L);
      paramInt1 = ((Calendar)localObject).get(7);
      paramLong = paramLong % 3600000L + ((Calendar)localObject).get(11) * 60 * 60 * 1000;
      if (B != 2) {
        break label150;
      }
      if (!paramBoolean) {
        break label143;
      }
      localObject = "11";
    }
    for (;;)
    {
      a("GM_StartTime", paramLong, (String)localObject);
      C = paramInt2;
      a(0L, paramLong, paramInt1);
      return;
      if (B != 0) {
        break;
      }
      paramInt1 = i1;
      if (new Random().nextInt(2) == 0) {
        paramInt1 = 2;
      }
      B = paramInt1;
      break;
      label143:
      localObject = "10";
      continue;
      label150:
      if (paramBoolean) {
        localObject = "01";
      } else {
        localObject = "00";
      }
    }
  }
  
  private void a(long paramLong1, long paramLong2, int paramInt)
  {
    if (paramLong1 != 0L)
    {
      localObject = Calendar.getInstance(Locale.getDefault());
      ((Calendar)localObject).setTimeInMillis(paramLong1 - 15000L);
      paramInt = ((Calendar)localObject).get(7);
      paramLong2 = ((Calendar)localObject).get(11) * 60 * 60 * 1000 + paramLong1 % 3600000L;
    }
    if (this.w == null) {
      d();
    }
    Object localObject = this.w;
    if (paramLong1 == 0L)
    {
      bool = true;
      ((h.a)localObject).a(paramLong2, bool);
      if ((paramInt == 1) || (paramInt == 7)) {
        break label145;
      }
      localObject = this.u;
      if (paramLong1 != 0L) {
        break label139;
      }
    }
    label139:
    for (boolean bool = true;; bool = false)
    {
      ((h.a)localObject).a(paramLong2, bool);
      e();
      return;
      bool = false;
      break;
    }
    label145:
    localObject = this.v;
    if (paramLong1 == 0L) {}
    for (bool = true;; bool = false)
    {
      ((h.a)localObject).a(paramLong2, bool);
      break;
    }
  }
  
  private void a(String paramString1, long paramLong, String paramString2)
  {
    if (paramString2 != null) {
      new HashMap().put("Tag", paramString2);
    }
  }
  
  /* Error */
  private void d()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 7
    //   3: iconst_0
    //   4: istore 5
    //   6: aload_0
    //   7: monitorenter
    //   8: new 161	java/io/ObjectInputStream
    //   11: dup
    //   12: getstatic 167	com/tencent/qalsdk/service/QalService:context	Landroid/content/Context;
    //   15: ldc 29
    //   17: invokevirtual 173	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   20: invokespecial 176	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   23: astore_2
    //   24: aload_2
    //   25: astore_1
    //   26: aload_2
    //   27: invokevirtual 180	java/io/ObjectInputStream:readByte	()B
    //   30: istore 6
    //   32: iload 6
    //   34: ifeq +79 -> 113
    //   37: bipush 24
    //   39: iload 6
    //   41: irem
    //   42: ifne +71 -> 113
    //   45: aload_2
    //   46: astore_1
    //   47: iload 6
    //   49: newarray <illegal type>
    //   51: astore_3
    //   52: aload_2
    //   53: astore_1
    //   54: iload 6
    //   56: newarray <illegal type>
    //   58: astore 4
    //   60: iload 5
    //   62: iload 6
    //   64: if_icmpge +33 -> 97
    //   67: aload_2
    //   68: astore_1
    //   69: aload 4
    //   71: iload 5
    //   73: aload_2
    //   74: invokevirtual 183	java/io/ObjectInputStream:readLong	()J
    //   77: lastore
    //   78: aload_2
    //   79: astore_1
    //   80: aload_3
    //   81: iload 5
    //   83: aload_2
    //   84: invokevirtual 183	java/io/ObjectInputStream:readLong	()J
    //   87: lastore
    //   88: iload 5
    //   90: iconst_1
    //   91: iadd
    //   92: istore 5
    //   94: goto -34 -> 60
    //   97: aload_2
    //   98: astore_1
    //   99: aload_0
    //   100: new 135	com/tencent/qalsdk/service/h$a
    //   103: dup
    //   104: aload 4
    //   106: aload_3
    //   107: invokespecial 186	com/tencent/qalsdk/service/h$a:<init>	([J[J)V
    //   110: putfield 140	com/tencent/qalsdk/service/h:u	Lcom/tencent/qalsdk/service/h$a;
    //   113: aload_2
    //   114: astore_1
    //   115: aload_2
    //   116: invokevirtual 189	java/io/ObjectInputStream:readInt	()I
    //   119: putstatic 67	com/tencent/qalsdk/service/h:C	I
    //   122: aload_2
    //   123: astore_1
    //   124: aload_2
    //   125: invokevirtual 189	java/io/ObjectInputStream:readInt	()I
    //   128: putstatic 65	com/tencent/qalsdk/service/h:B	I
    //   131: aload_2
    //   132: astore_1
    //   133: aload_2
    //   134: invokevirtual 183	java/io/ObjectInputStream:readLong	()J
    //   137: lstore 8
    //   139: lload 8
    //   141: ldc2_w 190
    //   144: lcmp
    //   145: ifgt +444 -> 589
    //   148: lload 8
    //   150: l2i
    //   151: istore 5
    //   153: iload 5
    //   155: ifeq +97 -> 252
    //   158: bipush 24
    //   160: iload 5
    //   162: irem
    //   163: ifne +89 -> 252
    //   166: aload_2
    //   167: astore_1
    //   168: iload 5
    //   170: newarray <illegal type>
    //   172: astore_3
    //   173: aload_2
    //   174: astore_1
    //   175: iload 5
    //   177: newarray <illegal type>
    //   179: astore 4
    //   181: aload 4
    //   183: iconst_0
    //   184: lload 8
    //   186: lastore
    //   187: aload_2
    //   188: astore_1
    //   189: aload_3
    //   190: iconst_0
    //   191: aload_2
    //   192: invokevirtual 183	java/io/ObjectInputStream:readLong	()J
    //   195: lastore
    //   196: iconst_1
    //   197: istore 6
    //   199: iload 6
    //   201: iload 5
    //   203: if_icmpge +33 -> 236
    //   206: aload_2
    //   207: astore_1
    //   208: aload 4
    //   210: iload 6
    //   212: aload_2
    //   213: invokevirtual 183	java/io/ObjectInputStream:readLong	()J
    //   216: lastore
    //   217: aload_2
    //   218: astore_1
    //   219: aload_3
    //   220: iload 6
    //   222: aload_2
    //   223: invokevirtual 183	java/io/ObjectInputStream:readLong	()J
    //   226: lastore
    //   227: iload 6
    //   229: iconst_1
    //   230: iadd
    //   231: istore 6
    //   233: goto -34 -> 199
    //   236: aload_2
    //   237: astore_1
    //   238: aload_0
    //   239: new 135	com/tencent/qalsdk/service/h$a
    //   242: dup
    //   243: aload 4
    //   245: aload_3
    //   246: invokespecial 186	com/tencent/qalsdk/service/h$a:<init>	([J[J)V
    //   249: putfield 144	com/tencent/qalsdk/service/h:v	Lcom/tencent/qalsdk/service/h$a;
    //   252: aload_2
    //   253: astore_1
    //   254: aload_2
    //   255: invokevirtual 189	java/io/ObjectInputStream:readInt	()I
    //   258: istore 6
    //   260: iload 6
    //   262: ifeq +98 -> 360
    //   265: bipush 24
    //   267: iload 6
    //   269: irem
    //   270: ifne +90 -> 360
    //   273: aload_2
    //   274: astore_1
    //   275: iload 6
    //   277: newarray <illegal type>
    //   279: astore_3
    //   280: aload_2
    //   281: astore_1
    //   282: iload 6
    //   284: newarray <illegal type>
    //   286: astore 4
    //   288: aload 4
    //   290: iconst_0
    //   291: lload 8
    //   293: lastore
    //   294: aload_2
    //   295: astore_1
    //   296: aload_3
    //   297: iconst_0
    //   298: aload_2
    //   299: invokevirtual 183	java/io/ObjectInputStream:readLong	()J
    //   302: lastore
    //   303: iload 7
    //   305: istore 5
    //   307: iload 5
    //   309: iload 6
    //   311: if_icmpge +33 -> 344
    //   314: aload_2
    //   315: astore_1
    //   316: aload 4
    //   318: iload 5
    //   320: aload_2
    //   321: invokevirtual 183	java/io/ObjectInputStream:readLong	()J
    //   324: lastore
    //   325: aload_2
    //   326: astore_1
    //   327: aload_3
    //   328: iload 5
    //   330: aload_2
    //   331: invokevirtual 183	java/io/ObjectInputStream:readLong	()J
    //   334: lastore
    //   335: iload 5
    //   337: iconst_1
    //   338: iadd
    //   339: istore 5
    //   341: goto -34 -> 307
    //   344: aload_2
    //   345: astore_1
    //   346: aload_0
    //   347: new 135	com/tencent/qalsdk/service/h$a
    //   350: dup
    //   351: aload 4
    //   353: aload_3
    //   354: invokespecial 186	com/tencent/qalsdk/service/h$a:<init>	([J[J)V
    //   357: putfield 131	com/tencent/qalsdk/service/h:w	Lcom/tencent/qalsdk/service/h$a;
    //   360: aload_2
    //   361: ifnull +7 -> 368
    //   364: aload_2
    //   365: invokevirtual 194	java/io/ObjectInputStream:close	()V
    //   368: aload_0
    //   369: getfield 131	com/tencent/qalsdk/service/h:w	Lcom/tencent/qalsdk/service/h$a;
    //   372: ifnonnull +51 -> 423
    //   375: aload_0
    //   376: getfield 140	com/tencent/qalsdk/service/h:u	Lcom/tencent/qalsdk/service/h$a;
    //   379: ifnull +203 -> 582
    //   382: aload_0
    //   383: getfield 140	com/tencent/qalsdk/service/h:u	Lcom/tencent/qalsdk/service/h$a;
    //   386: getfield 197	com/tencent/qalsdk/service/h$a:a	[J
    //   389: invokevirtual 202	[J:clone	()Ljava/lang/Object;
    //   392: checkcast 198	[J
    //   395: astore_1
    //   396: aload_0
    //   397: getfield 140	com/tencent/qalsdk/service/h:u	Lcom/tencent/qalsdk/service/h$a;
    //   400: getfield 204	com/tencent/qalsdk/service/h$a:b	[J
    //   403: invokevirtual 202	[J:clone	()Ljava/lang/Object;
    //   406: checkcast 198	[J
    //   409: astore_2
    //   410: aload_0
    //   411: new 135	com/tencent/qalsdk/service/h$a
    //   414: dup
    //   415: aload_1
    //   416: aload_2
    //   417: invokespecial 186	com/tencent/qalsdk/service/h$a:<init>	([J[J)V
    //   420: putfield 131	com/tencent/qalsdk/service/h:w	Lcom/tencent/qalsdk/service/h$a;
    //   423: aload_0
    //   424: getfield 140	com/tencent/qalsdk/service/h:u	Lcom/tencent/qalsdk/service/h$a;
    //   427: ifnonnull +16 -> 443
    //   430: aload_0
    //   431: new 135	com/tencent/qalsdk/service/h$a
    //   434: dup
    //   435: aconst_null
    //   436: aconst_null
    //   437: invokespecial 186	com/tencent/qalsdk/service/h$a:<init>	([J[J)V
    //   440: putfield 140	com/tencent/qalsdk/service/h:u	Lcom/tencent/qalsdk/service/h$a;
    //   443: aload_0
    //   444: getfield 144	com/tencent/qalsdk/service/h:v	Lcom/tencent/qalsdk/service/h$a;
    //   447: ifnonnull +16 -> 463
    //   450: aload_0
    //   451: new 135	com/tencent/qalsdk/service/h$a
    //   454: dup
    //   455: aconst_null
    //   456: aconst_null
    //   457: invokespecial 186	com/tencent/qalsdk/service/h$a:<init>	([J[J)V
    //   460: putfield 144	com/tencent/qalsdk/service/h:v	Lcom/tencent/qalsdk/service/h$a;
    //   463: aload_0
    //   464: monitorexit
    //   465: return
    //   466: astore_1
    //   467: invokestatic 210	com/tencent/qalsdk/util/QLog:isColorLevel	()Z
    //   470: ifeq -102 -> 368
    //   473: ldc 26
    //   475: iconst_2
    //   476: ldc -44
    //   478: aload_1
    //   479: invokestatic 215	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   482: goto -114 -> 368
    //   485: astore_1
    //   486: aload_0
    //   487: monitorexit
    //   488: aload_1
    //   489: athrow
    //   490: astore_3
    //   491: aconst_null
    //   492: astore_2
    //   493: aload_2
    //   494: astore_1
    //   495: invokestatic 210	com/tencent/qalsdk/util/QLog:isColorLevel	()Z
    //   498: ifeq +14 -> 512
    //   501: aload_2
    //   502: astore_1
    //   503: ldc 26
    //   505: iconst_2
    //   506: ldc -39
    //   508: aload_3
    //   509: invokestatic 215	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   512: aload_2
    //   513: ifnull -145 -> 368
    //   516: aload_2
    //   517: invokevirtual 194	java/io/ObjectInputStream:close	()V
    //   520: goto -152 -> 368
    //   523: astore_1
    //   524: invokestatic 210	com/tencent/qalsdk/util/QLog:isColorLevel	()Z
    //   527: ifeq -159 -> 368
    //   530: ldc 26
    //   532: iconst_2
    //   533: ldc -44
    //   535: aload_1
    //   536: invokestatic 215	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   539: goto -171 -> 368
    //   542: astore_2
    //   543: aconst_null
    //   544: astore_1
    //   545: aload_1
    //   546: ifnull +7 -> 553
    //   549: aload_1
    //   550: invokevirtual 194	java/io/ObjectInputStream:close	()V
    //   553: aload_2
    //   554: athrow
    //   555: astore_1
    //   556: invokestatic 210	com/tencent/qalsdk/util/QLog:isColorLevel	()Z
    //   559: ifeq -6 -> 553
    //   562: ldc 26
    //   564: iconst_2
    //   565: ldc -44
    //   567: aload_1
    //   568: invokestatic 215	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   571: goto -18 -> 553
    //   574: astore_2
    //   575: goto -30 -> 545
    //   578: astore_3
    //   579: goto -86 -> 493
    //   582: aconst_null
    //   583: astore_2
    //   584: aconst_null
    //   585: astore_1
    //   586: goto -176 -> 410
    //   589: iload 6
    //   591: istore 5
    //   593: goto -440 -> 153
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	596	0	this	h
    //   25	391	1	localObject1	Object
    //   466	13	1	localIOException1	java.io.IOException
    //   485	4	1	localObject2	Object
    //   494	9	1	localObject3	Object
    //   523	13	1	localIOException2	java.io.IOException
    //   544	6	1	localObject4	Object
    //   555	13	1	localIOException3	java.io.IOException
    //   585	1	1	localObject5	Object
    //   23	494	2	localObject6	Object
    //   542	12	2	localObject7	Object
    //   574	1	2	localObject8	Object
    //   583	1	2	localObject9	Object
    //   51	303	3	arrayOfLong1	long[]
    //   490	19	3	localThrowable1	Throwable
    //   578	1	3	localThrowable2	Throwable
    //   58	294	4	arrayOfLong2	long[]
    //   4	588	5	i1	int
    //   30	560	6	i2	int
    //   1	303	7	i3	int
    //   137	155	8	l1	long
    // Exception table:
    //   from	to	target	type
    //   364	368	466	java/io/IOException
    //   364	368	485	finally
    //   368	410	485	finally
    //   410	423	485	finally
    //   423	443	485	finally
    //   443	463	485	finally
    //   467	482	485	finally
    //   516	520	485	finally
    //   524	539	485	finally
    //   549	553	485	finally
    //   553	555	485	finally
    //   556	571	485	finally
    //   8	24	490	java/lang/Throwable
    //   516	520	523	java/io/IOException
    //   8	24	542	finally
    //   549	553	555	java/io/IOException
    //   26	32	574	finally
    //   47	52	574	finally
    //   54	60	574	finally
    //   69	78	574	finally
    //   80	88	574	finally
    //   99	113	574	finally
    //   115	122	574	finally
    //   124	131	574	finally
    //   133	139	574	finally
    //   168	173	574	finally
    //   175	181	574	finally
    //   189	196	574	finally
    //   208	217	574	finally
    //   219	227	574	finally
    //   238	252	574	finally
    //   254	260	574	finally
    //   275	280	574	finally
    //   282	288	574	finally
    //   296	303	574	finally
    //   316	325	574	finally
    //   327	335	574	finally
    //   346	360	574	finally
    //   495	501	574	finally
    //   503	512	574	finally
    //   26	32	578	java/lang/Throwable
    //   47	52	578	java/lang/Throwable
    //   54	60	578	java/lang/Throwable
    //   69	78	578	java/lang/Throwable
    //   80	88	578	java/lang/Throwable
    //   99	113	578	java/lang/Throwable
    //   115	122	578	java/lang/Throwable
    //   124	131	578	java/lang/Throwable
    //   133	139	578	java/lang/Throwable
    //   168	173	578	java/lang/Throwable
    //   175	181	578	java/lang/Throwable
    //   189	196	578	java/lang/Throwable
    //   208	217	578	java/lang/Throwable
    //   219	227	578	java/lang/Throwable
    //   238	252	578	java/lang/Throwable
    //   254	260	578	java/lang/Throwable
    //   275	280	578	java/lang/Throwable
    //   282	288	578	java/lang/Throwable
    //   296	303	578	java/lang/Throwable
    //   316	325	578	java/lang/Throwable
    //   327	335	578	java/lang/Throwable
    //   346	360	578	java/lang/Throwable
  }
  
  /* Error */
  private void e()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 219	java/io/ObjectOutputStream
    //   5: dup
    //   6: getstatic 167	com/tencent/qalsdk/service/QalService:context	Landroid/content/Context;
    //   9: ldc 29
    //   11: iconst_0
    //   12: invokevirtual 223	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   15: invokespecial 226	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   18: astore_2
    //   19: aload_2
    //   20: astore_1
    //   21: aload_0
    //   22: getfield 140	com/tencent/qalsdk/service/h:u	Lcom/tencent/qalsdk/service/h$a;
    //   25: aload_2
    //   26: iconst_0
    //   27: invokevirtual 229	com/tencent/qalsdk/service/h$a:a	(Ljava/io/ObjectOutputStream;Z)V
    //   30: aload_2
    //   31: astore_1
    //   32: aload_2
    //   33: getstatic 67	com/tencent/qalsdk/service/h:C	I
    //   36: invokevirtual 233	java/io/ObjectOutputStream:writeInt	(I)V
    //   39: aload_2
    //   40: astore_1
    //   41: aload_2
    //   42: getstatic 65	com/tencent/qalsdk/service/h:B	I
    //   45: invokevirtual 233	java/io/ObjectOutputStream:writeInt	(I)V
    //   48: aload_2
    //   49: astore_1
    //   50: aload_0
    //   51: getfield 144	com/tencent/qalsdk/service/h:v	Lcom/tencent/qalsdk/service/h$a;
    //   54: aload_2
    //   55: iconst_1
    //   56: invokevirtual 229	com/tencent/qalsdk/service/h$a:a	(Ljava/io/ObjectOutputStream;Z)V
    //   59: aload_2
    //   60: astore_1
    //   61: aload_0
    //   62: getfield 131	com/tencent/qalsdk/service/h:w	Lcom/tencent/qalsdk/service/h$a;
    //   65: aload_2
    //   66: iconst_0
    //   67: invokevirtual 229	com/tencent/qalsdk/service/h$a:a	(Ljava/io/ObjectOutputStream;Z)V
    //   70: aload_2
    //   71: ifnull +7 -> 78
    //   74: aload_2
    //   75: invokevirtual 234	java/io/ObjectOutputStream:close	()V
    //   78: aload_0
    //   79: monitorexit
    //   80: return
    //   81: astore_1
    //   82: invokestatic 210	com/tencent/qalsdk/util/QLog:isColorLevel	()Z
    //   85: ifeq -7 -> 78
    //   88: ldc 26
    //   90: iconst_2
    //   91: ldc -44
    //   93: aload_1
    //   94: invokestatic 215	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   97: goto -19 -> 78
    //   100: astore_1
    //   101: aload_0
    //   102: monitorexit
    //   103: aload_1
    //   104: athrow
    //   105: astore_3
    //   106: aconst_null
    //   107: astore_2
    //   108: aload_2
    //   109: astore_1
    //   110: invokestatic 210	com/tencent/qalsdk/util/QLog:isColorLevel	()Z
    //   113: ifeq +14 -> 127
    //   116: aload_2
    //   117: astore_1
    //   118: ldc 26
    //   120: iconst_2
    //   121: ldc -44
    //   123: aload_3
    //   124: invokestatic 215	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   127: aload_2
    //   128: ifnull -50 -> 78
    //   131: aload_2
    //   132: invokevirtual 234	java/io/ObjectOutputStream:close	()V
    //   135: goto -57 -> 78
    //   138: astore_1
    //   139: invokestatic 210	com/tencent/qalsdk/util/QLog:isColorLevel	()Z
    //   142: ifeq -64 -> 78
    //   145: ldc 26
    //   147: iconst_2
    //   148: ldc -44
    //   150: aload_1
    //   151: invokestatic 215	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   154: goto -76 -> 78
    //   157: astore_2
    //   158: aconst_null
    //   159: astore_1
    //   160: aload_1
    //   161: ifnull +7 -> 168
    //   164: aload_1
    //   165: invokevirtual 234	java/io/ObjectOutputStream:close	()V
    //   168: aload_2
    //   169: athrow
    //   170: astore_1
    //   171: invokestatic 210	com/tencent/qalsdk/util/QLog:isColorLevel	()Z
    //   174: ifeq -6 -> 168
    //   177: ldc 26
    //   179: iconst_2
    //   180: ldc -44
    //   182: aload_1
    //   183: invokestatic 215	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   186: goto -18 -> 168
    //   189: astore_2
    //   190: goto -30 -> 160
    //   193: astore_3
    //   194: goto -86 -> 108
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	197	0	this	h
    //   20	41	1	localObjectOutputStream1	java.io.ObjectOutputStream
    //   81	13	1	localIOException1	java.io.IOException
    //   100	4	1	localObject1	Object
    //   109	9	1	localObjectOutputStream2	java.io.ObjectOutputStream
    //   138	13	1	localIOException2	java.io.IOException
    //   159	6	1	localObject2	Object
    //   170	13	1	localIOException3	java.io.IOException
    //   18	114	2	localObjectOutputStream3	java.io.ObjectOutputStream
    //   157	12	2	localObject3	Object
    //   189	1	2	localObject4	Object
    //   105	19	3	localThrowable1	Throwable
    //   193	1	3	localThrowable2	Throwable
    // Exception table:
    //   from	to	target	type
    //   74	78	81	java/io/IOException
    //   74	78	100	finally
    //   82	97	100	finally
    //   131	135	100	finally
    //   139	154	100	finally
    //   164	168	100	finally
    //   168	170	100	finally
    //   171	186	100	finally
    //   2	19	105	java/lang/Throwable
    //   131	135	138	java/io/IOException
    //   2	19	157	finally
    //   164	168	170	java/io/IOException
    //   21	30	189	finally
    //   32	39	189	finally
    //   41	48	189	finally
    //   50	59	189	finally
    //   61	70	189	finally
    //   110	116	189	finally
    //   118	127	189	finally
    //   21	30	193	java/lang/Throwable
    //   32	39	193	java/lang/Throwable
    //   41	48	193	java/lang/Throwable
    //   50	59	193	java/lang/Throwable
    //   61	70	193	java/lang/Throwable
  }
  
  private boolean f()
  {
    IBinder localIBinder = this.q;
    return (localIBinder != null) && (localIBinder.isBinderAlive());
  }
  
  public void a(int paramInt, long paramLong1, long paramLong2)
  {
    if (QLog.isColorLevel()) {
      QLog.d("GuardManager", 2, "onEvent:" + paramInt + ", " + paramLong1 + ", " + paramLong2);
    }
    long l1 = System.currentTimeMillis();
    this.t = l1;
    this.g = true;
    switch (paramInt)
    {
    case 6: 
    default: 
      return;
    case 5: 
      paramInt = (int)(paramLong1 >> 8);
      int i1 = (int)(0xFF & paramLong1);
      if ((0xFF & paramLong2) == 1L) {}
      for (boolean bool = true;; bool = false)
      {
        a(l1, paramInt, i1, bool, (int)(paramLong2 >> 8));
        return;
      }
    case 100: 
      r = l1;
      this.s = 1;
      this.g = false;
      return;
    case 1: 
      this.s = 2;
      return;
    case 3: 
      this.s = 4;
      return;
    case 2: 
      this.s = 3;
      p = paramLong1;
      return;
    case 4: 
      this.s = 5;
      p = paramLong1;
      return;
    }
    a(l1, 0L, 0);
  }
  
  public void a(IInterface paramIInterface)
  {
    IBinder localIBinder;
    if (paramIInterface != null) {
      localIBinder = paramIInterface.asBinder();
    }
    for (;;)
    {
      if (QLog.isColorLevel()) {
        QLog.d("GuardManager", 2, "onAppBind with " + paramIInterface);
      }
      paramIInterface = this.q;
      long l1;
      if (paramIInterface != localIBinder)
      {
        l1 = System.currentTimeMillis();
        if (paramIInterface != null)
        {
          paramIInterface.unlinkToDeath(this, 0);
          this.q = null;
          r = l1;
          this.t = l1;
        }
        if ((localIBinder == null) || (!localIBinder.isBinderAlive())) {}
      }
      try
      {
        localIBinder.linkToDeath(this, 0);
        this.q = localIBinder;
        r = l1;
        return;
        localIBinder = null;
      }
      catch (RemoteException paramIInterface)
      {
        while (!QLog.isColorLevel()) {}
        QLog.d("GuardManager", 2, "onAppBind ", paramIInterface);
      }
    }
  }
  
  public boolean a()
  {
    return (this.g) && (f());
  }
  
  public boolean a(int paramInt)
  {
    if (this.f) {}
    long l1;
    int i1;
    do
    {
      return true;
      this.f = true;
      l1 = System.currentTimeMillis();
      l2 = Math.abs(l1 - r);
      if ((this.s == 2) || (this.s == 4)) {}
      for (i1 = 1; ((paramInt == 3) && (l2 > 500L) && (!this.g) && (f())) || ((paramInt == 1) && (l2 > p) && (!f()) && (i1 == 0)) || ((paramInt == 0) && (l2 > 500L) && (!f())); i1 = 0)
      {
        if (QLog.isColorLevel()) {
          QLog.d("GuardManager", 2, "prestart " + paramInt + ", " + l1 + ", " + r + ", " + p);
        }
        localObject = new Intent("com.tencent.mobileqq.broadcast.qq");
        ((Intent)localObject).putExtra("k_start_mode", paramInt);
        QalService.context.sendBroadcast((Intent)localObject);
        r = l1;
        a("GM_LiteStart", 0L, "" + paramInt);
        return true;
      }
    } while ((paramInt != 2) || (l2 <= p) || (f()) || (i1 != 0));
    if (this.w == null) {
      d();
    }
    Object localObject = Calendar.getInstance(Locale.getDefault());
    ((Calendar)localObject).setTimeInMillis(l1);
    long l2 = ((Calendar)localObject).get(11) * 60 * 60 * 1000 + l1 % 3600000L;
    boolean bool;
    if (B == 2)
    {
      paramInt = ((Calendar)localObject).get(7);
      if ((paramInt != 1) && (paramInt != 7))
      {
        bool = this.u.a(l2);
        label366:
        if (!bool) {
          break label452;
        }
        localObject = new Intent("com.tencent.mobileqq.broadcast.qq");
        ((Intent)localObject).putExtra("k_start_mode", 2);
        QalService.context.sendBroadcast((Intent)localObject);
        if (B != 2) {
          break label454;
        }
      }
    }
    label452:
    label454:
    for (localObject = "1";; localObject = "0")
    {
      a("GM_PreStart", l2, (String)localObject);
      r = l1;
      return true;
      bool = this.v.a(l2);
      break label366;
      bool = this.w.a(l2);
      break label366;
      break;
    }
  }
  
  public void binderDied()
  {
    if (QLog.isColorLevel()) {
      QLog.d("GuardManager", 2, "binderDied");
    }
    IBinder localIBinder = this.q;
    if (localIBinder != null)
    {
      localIBinder.unlinkToDeath(this, 0);
      this.q = null;
      r = System.currentTimeMillis();
      this.g = false;
      long l1 = r - this.t;
      if ((l1 > 0L) && (l1 < 86400000L)) {
        a("GM_AliveTime" + this.s, l1, null);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\service\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */