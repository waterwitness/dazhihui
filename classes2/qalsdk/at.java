package qalsdk;

import android.os.SystemClock;
import com.tencent.qalsdk.base.CloseConnReason;
import com.tencent.qalsdk.core.NetConnInfoCenter;
import com.tencent.qalsdk.core.c;
import com.tencent.qalsdk.core.j;
import com.tencent.qalsdk.core.m;
import com.tencent.qalsdk.core.o;
import com.tencent.qalsdk.sdk.MsfCommand;
import com.tencent.qalsdk.sdk.MsfSdkUtils;
import com.tencent.qalsdk.util.MsfSocketInputBuffer;
import com.tencent.qalsdk.util.QLog;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;

public class at
{
  public static ArrayList<String> i = new ArrayList();
  InetSocketAddress a;
  c b;
  public Socket c;
  OutputStream d = null;
  an e;
  au f;
  MsfSocketInputBuffer g = null;
  public int h = 0;
  AtomicLong j = new AtomicLong();
  AtomicLong k = new AtomicLong();
  long l = 0L;
  boolean m = false;
  AtomicBoolean n = new AtomicBoolean();
  AtomicBoolean o = new AtomicBoolean();
  ReentrantLock p = new ReentrantLock();
  boolean q;
  j r;
  public c s;
  private String t = "";
  private AtomicInteger u = new AtomicInteger();
  
  public at(j paramj, boolean paramBoolean)
  {
    this.r = paramj;
    this.q = paramBoolean;
  }
  
  public static String a(Throwable paramThrowable)
  {
    if (paramThrowable == null) {
      return "";
    }
    for (Object localObject = paramThrowable; localObject != null; localObject = ((Throwable)localObject).getCause()) {
      if ((localObject instanceof UnknownHostException)) {
        return "";
      }
    }
    localObject = new StringWriter();
    PrintWriter localPrintWriter = new PrintWriter((Writer)localObject);
    paramThrowable.printStackTrace(localPrintWriter);
    localPrintWriter.flush();
    return ((StringWriter)localObject).toString();
  }
  
  private void a(String paramString)
  {
    try
    {
      this.t = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public int a(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, String paramString3, MsfCommand paramMsfCommand, byte[] paramArrayOfByte)
  {
    if ((this.o.get()) || (!this.n.get()) || (this.e == null)) {
      return -100;
    }
    if (paramMsfCommand == MsfCommand.openConn) {}
    for (;;)
    {
      return paramArrayOfByte.length;
      paramString3 = this.e.a(this.b, paramString1, paramString2, paramArrayOfByte);
      if ((paramString2.equals("SSO.LoginMerge")) && (!this.r.c.j))
      {
        paramString1 = (ArrayList)this.r.c.f().remove(Integer.valueOf(paramInt3));
        QLog.d("MSF.C.NetConnTag", 1, "NetChanged devide merge package, " + Arrays.toString(paramString1.toArray()) + " resend.");
        if (paramString1 != null)
        {
          paramString1 = paramString1.iterator();
          while (paramString1.hasNext())
          {
            paramString2 = (Integer)paramString1.next();
            paramString2 = this.r.c.a(paramString2.intValue());
            this.r.c.b(paramString2);
          }
        }
        return 65336;
      }
      this.d.write(paramString3);
      this.d.flush();
      this.j.addAndGet(paramString3.length);
      paramString3 = new StringBuilder();
      if (QLog.isDevelopLevel()) {
        QLog.d("MSF.C.NetConnTag", 1, "netSend appid:" + paramInt1 + " appSeq:" + paramInt2 + " ssoSeq:" + paramInt3 + " uin:" + MsfSdkUtils.getShortUin(paramString1) + " cmd:" + paramString2 + " len:" + paramArrayOfByte.length);
      }
      while (paramString2.equals("SSO.LoginMerge"))
      {
        return paramArrayOfByte.length;
        QLog.i("MSF.C.NetConnTag", 1, "netSend ssoSeq:" + paramInt3 + " appSeq:" + paramInt2 + " uin:" + MsfSdkUtils.getShortUin(paramString1) + " cmd:" + paramString2 + new StringBuilder().append(" ").append(paramArrayOfByte.length + paramInt3).toString());
      }
    }
  }
  
  public String a()
  {
    try
    {
      String str = this.t;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public void a(CloseConnReason paramCloseConnReason)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 95	qalsdk/at:r	Lcom/tencent/qalsdk/core/j;
    //   4: getfield 159	com/tencent/qalsdk/core/j:c	Lcom/tencent/qalsdk/core/o;
    //   7: iconst_0
    //   8: putfield 275	com/tencent/qalsdk/core/o:i	Z
    //   11: aload_0
    //   12: getfield 95	qalsdk/at:r	Lcom/tencent/qalsdk/core/j;
    //   15: getfield 159	com/tencent/qalsdk/core/j:c	Lcom/tencent/qalsdk/core/o;
    //   18: iconst_0
    //   19: putfield 163	com/tencent/qalsdk/core/o:j	Z
    //   22: aload_0
    //   23: getfield 95	qalsdk/at:r	Lcom/tencent/qalsdk/core/j;
    //   26: getfield 159	com/tencent/qalsdk/core/j:c	Lcom/tencent/qalsdk/core/o;
    //   29: lconst_0
    //   30: putfield 277	com/tencent/qalsdk/core/o:h	J
    //   33: aload_0
    //   34: getfield 279	qalsdk/at:c	Ljava/net/Socket;
    //   37: ifnonnull +30 -> 67
    //   40: ldc -76
    //   42: iconst_1
    //   43: new 182	java/lang/StringBuilder
    //   46: dup
    //   47: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   50: ldc_w 281
    //   53: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: aload_1
    //   57: invokevirtual 284	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   60: invokevirtual 201	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   63: invokestatic 206	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   66: return
    //   67: ldc 61
    //   69: astore_3
    //   70: aload_0
    //   71: getfield 279	qalsdk/at:c	Ljava/net/Socket;
    //   74: invokevirtual 287	java/net/Socket:toString	()Ljava/lang/String;
    //   77: astore_2
    //   78: aload_2
    //   79: astore_3
    //   80: aload_0
    //   81: getfield 93	qalsdk/at:p	Ljava/util/concurrent/locks/ReentrantLock;
    //   84: ldc2_w 288
    //   87: getstatic 295	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   90: invokevirtual 299	java/util/concurrent/locks/ReentrantLock:tryLock	(JLjava/util/concurrent/TimeUnit;)Z
    //   93: istore 5
    //   95: iload 5
    //   97: ifeq +452 -> 549
    //   100: aload_0
    //   101: getfield 70	qalsdk/at:u	Ljava/util/concurrent/atomic/AtomicInteger;
    //   104: iconst_0
    //   105: invokevirtual 303	java/util/concurrent/atomic/AtomicInteger:set	(I)V
    //   108: aload_0
    //   109: getfield 95	qalsdk/at:r	Lcom/tencent/qalsdk/core/j;
    //   112: getfield 159	com/tencent/qalsdk/core/j:c	Lcom/tencent/qalsdk/core/o;
    //   115: aconst_null
    //   116: invokevirtual 305	com/tencent/qalsdk/core/o:a	([B)V
    //   119: ldc -76
    //   121: new 182	java/lang/StringBuilder
    //   124: dup
    //   125: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   128: ldc_w 307
    //   131: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: aload_1
    //   135: invokevirtual 284	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   138: invokevirtual 201	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   141: invokestatic 310	com/tencent/qalsdk/util/QLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   144: aload_0
    //   145: getfield 86	qalsdk/at:n	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   148: invokevirtual 131	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   151: istore 5
    //   153: aload_0
    //   154: getfield 312	qalsdk/at:f	Lqalsdk/au;
    //   157: ifnull +14 -> 171
    //   160: aload_0
    //   161: getfield 312	qalsdk/at:f	Lqalsdk/au;
    //   164: getfield 316	qalsdk/au:a	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   167: iconst_0
    //   168: invokevirtual 319	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   171: aload_0
    //   172: getfield 279	qalsdk/at:c	Ljava/net/Socket;
    //   175: invokevirtual 323	java/net/Socket:getInputStream	()Ljava/io/InputStream;
    //   178: ifnull +13 -> 191
    //   181: aload_0
    //   182: getfield 279	qalsdk/at:c	Ljava/net/Socket;
    //   185: invokevirtual 323	java/net/Socket:getInputStream	()Ljava/io/InputStream;
    //   188: invokevirtual 328	java/io/InputStream:close	()V
    //   191: aload_0
    //   192: getfield 57	qalsdk/at:d	Ljava/io/OutputStream;
    //   195: astore_3
    //   196: aload_3
    //   197: ifnull +24 -> 221
    //   200: getstatic 52	qalsdk/at:i	Ljava/util/ArrayList;
    //   203: aload_0
    //   204: getfield 57	qalsdk/at:d	Ljava/io/OutputStream;
    //   207: invokevirtual 329	java/lang/Object:toString	()Ljava/lang/String;
    //   210: invokevirtual 331	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   213: pop
    //   214: aload_0
    //   215: getfield 57	qalsdk/at:d	Ljava/io/OutputStream;
    //   218: invokevirtual 332	java/io/OutputStream:close	()V
    //   221: aload_0
    //   222: aconst_null
    //   223: putfield 312	qalsdk/at:f	Lqalsdk/au;
    //   226: aload_0
    //   227: getfield 279	qalsdk/at:c	Ljava/net/Socket;
    //   230: astore_3
    //   231: aload_3
    //   232: ifnull +16 -> 248
    //   235: aload_0
    //   236: getfield 279	qalsdk/at:c	Ljava/net/Socket;
    //   239: invokevirtual 333	java/net/Socket:close	()V
    //   242: getstatic 52	qalsdk/at:i	Ljava/util/ArrayList;
    //   245: invokevirtual 336	java/util/ArrayList:clear	()V
    //   248: aload_0
    //   249: aconst_null
    //   250: putfield 279	qalsdk/at:c	Ljava/net/Socket;
    //   253: aload_0
    //   254: getfield 86	qalsdk/at:n	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   257: iconst_0
    //   258: invokevirtual 319	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   261: aload_0
    //   262: aconst_null
    //   263: putfield 133	qalsdk/at:e	Lqalsdk/an;
    //   266: aload_0
    //   267: getfield 93	qalsdk/at:p	Ljava/util/concurrent/locks/ReentrantLock;
    //   270: invokevirtual 339	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   273: ldc -76
    //   275: new 182	java/lang/StringBuilder
    //   278: dup
    //   279: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   282: ldc_w 341
    //   285: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   288: aload_0
    //   289: getfield 88	qalsdk/at:o	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   292: invokevirtual 131	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   295: invokevirtual 344	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   298: ldc_w 346
    //   301: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   304: iload 5
    //   306: invokevirtual 344	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   309: ldc_w 346
    //   312: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   315: aload_0
    //   316: getfield 97	qalsdk/at:q	Z
    //   319: invokevirtual 344	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   322: invokevirtual 201	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   325: invokestatic 348	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   328: aload_0
    //   329: getfield 88	qalsdk/at:o	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   332: invokevirtual 131	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   335: ifne +114 -> 449
    //   338: iload 5
    //   340: ifeq +109 -> 449
    //   343: aload_0
    //   344: getfield 97	qalsdk/at:q	Z
    //   347: ifeq +102 -> 449
    //   350: aload_0
    //   351: getfield 79	qalsdk/at:l	J
    //   354: lconst_0
    //   355: lcmp
    //   356: ifle +21 -> 377
    //   359: aload_0
    //   360: lconst_0
    //   361: putfield 79	qalsdk/at:l	J
    //   364: aload_0
    //   365: getfield 95	qalsdk/at:r	Lcom/tencent/qalsdk/core/j;
    //   368: getfield 159	com/tencent/qalsdk/core/j:c	Lcom/tencent/qalsdk/core/o;
    //   371: getfield 351	com/tencent/qalsdk/core/o:a	Lqalsdk/av;
    //   374: invokevirtual 355	qalsdk/av:b	()V
    //   377: ldc -76
    //   379: iconst_1
    //   380: new 182	java/lang/StringBuilder
    //   383: dup
    //   384: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   387: ldc_w 357
    //   390: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   393: aload_2
    //   394: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   397: ldc_w 359
    //   400: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   403: aload_1
    //   404: invokevirtual 284	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   407: invokevirtual 201	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   410: invokestatic 206	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   413: aload_0
    //   414: getfield 95	qalsdk/at:r	Lcom/tencent/qalsdk/core/j;
    //   417: aconst_null
    //   418: putfield 361	com/tencent/qalsdk/core/j:s	Ljava/lang/String;
    //   421: aload_0
    //   422: aconst_null
    //   423: putfield 141	qalsdk/at:b	Lcom/tencent/qalsdk/core/c;
    //   426: aload_0
    //   427: getfield 75	qalsdk/at:j	Ljava/util/concurrent/atomic/AtomicLong;
    //   430: lconst_0
    //   431: invokevirtual 364	java/util/concurrent/atomic/AtomicLong:set	(J)V
    //   434: aload_0
    //   435: getfield 77	qalsdk/at:k	Ljava/util/concurrent/atomic/AtomicLong;
    //   438: lconst_0
    //   439: invokevirtual 364	java/util/concurrent/atomic/AtomicLong:set	(J)V
    //   442: invokestatic 369	com/tencent/qalsdk/util/CodecWarpper:onConnClose	()V
    //   445: aload_1
    //   446: invokestatic 374	com/tencent/qalsdk/core/NetConnInfoCenter:onConnClosed	(Lcom/tencent/qalsdk/base/CloseConnReason;)V
    //   449: aload_0
    //   450: getfield 376	qalsdk/at:s	Lcom/tencent/qalsdk/core/c;
    //   453: ifnull +28 -> 481
    //   456: aload_0
    //   457: getfield 376	qalsdk/at:s	Lcom/tencent/qalsdk/core/c;
    //   460: aload_1
    //   461: invokevirtual 381	com/tencent/qalsdk/core/c:a	(Lcom/tencent/qalsdk/base/CloseConnReason;)Z
    //   464: ifeq +17 -> 481
    //   467: aload_0
    //   468: getfield 95	qalsdk/at:r	Lcom/tencent/qalsdk/core/j;
    //   471: invokevirtual 384	com/tencent/qalsdk/core/j:h	()Lqalsdk/ak;
    //   474: aload_0
    //   475: getfield 376	qalsdk/at:s	Lcom/tencent/qalsdk/core/c;
    //   478: invokevirtual 389	qalsdk/ak:a	(Lcom/tencent/qalsdk/core/c;)V
    //   481: aload_0
    //   482: aconst_null
    //   483: putfield 376	qalsdk/at:s	Lcom/tencent/qalsdk/core/c;
    //   486: ldc_w 346
    //   489: putstatic 391	com/tencent/qalsdk/core/o:p	Ljava/lang/String;
    //   492: ldc_w 393
    //   495: putstatic 395	com/tencent/qalsdk/core/o:q	Ljava/lang/String;
    //   498: return
    //   499: astore_1
    //   500: aload_1
    //   501: invokevirtual 397	java/lang/Exception:printStackTrace	()V
    //   504: return
    //   505: astore_3
    //   506: iconst_1
    //   507: istore 5
    //   509: aload_0
    //   510: getfield 93	qalsdk/at:p	Ljava/util/concurrent/locks/ReentrantLock;
    //   513: invokevirtual 339	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   516: aload_3
    //   517: athrow
    //   518: astore_3
    //   519: ldc -76
    //   521: iconst_1
    //   522: new 182	java/lang/StringBuilder
    //   525: dup
    //   526: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   529: ldc_w 399
    //   532: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   535: aload_3
    //   536: invokevirtual 284	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   539: invokevirtual 201	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   542: aload_3
    //   543: invokestatic 402	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   546: goto -273 -> 273
    //   549: aload_2
    //   550: astore_3
    //   551: aload_0
    //   552: getfield 312	qalsdk/at:f	Lqalsdk/au;
    //   555: ifnull +16 -> 571
    //   558: aload_2
    //   559: astore_3
    //   560: aload_0
    //   561: getfield 312	qalsdk/at:f	Lqalsdk/au;
    //   564: getfield 316	qalsdk/au:a	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   567: iconst_0
    //   568: invokevirtual 319	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   571: aload_2
    //   572: astore_3
    //   573: ldc -76
    //   575: iconst_1
    //   576: ldc_w 404
    //   579: invokestatic 206	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   582: aload_2
    //   583: astore_3
    //   584: aload_0
    //   585: getfield 88	qalsdk/at:o	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   588: iconst_1
    //   589: invokevirtual 319	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   592: aload_2
    //   593: astore_3
    //   594: aload_0
    //   595: getfield 70	qalsdk/at:u	Ljava/util/concurrent/atomic/AtomicInteger;
    //   598: iconst_1
    //   599: invokevirtual 407	java/util/concurrent/atomic/AtomicInteger:addAndGet	(I)I
    //   602: bipush 10
    //   604: if_icmpne +11 -> 615
    //   607: aload_2
    //   608: astore_3
    //   609: invokestatic 412	android/os/Process:myPid	()I
    //   612: invokestatic 415	android/os/Process:killProcess	(I)V
    //   615: iconst_1
    //   616: istore 5
    //   618: goto -345 -> 273
    //   621: astore_2
    //   622: ldc -76
    //   624: iconst_1
    //   625: new 182	java/lang/StringBuilder
    //   628: dup
    //   629: invokespecial 183	java/lang/StringBuilder:<init>	()V
    //   632: ldc_w 417
    //   635: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   638: aload_2
    //   639: invokevirtual 284	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   642: invokevirtual 201	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   645: aload_2
    //   646: invokestatic 402	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   649: goto -204 -> 445
    //   652: astore 4
    //   654: aload_3
    //   655: astore_2
    //   656: iconst_1
    //   657: istore 5
    //   659: aload 4
    //   661: astore_3
    //   662: goto -143 -> 519
    //   665: astore_3
    //   666: goto -147 -> 519
    //   669: astore_3
    //   670: goto -161 -> 509
    //   673: astore_3
    //   674: goto -426 -> 248
    //   677: astore_3
    //   678: goto -457 -> 221
    //   681: astore_3
    //   682: goto -491 -> 191
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	685	0	this	at
    //   0	685	1	paramCloseConnReason	CloseConnReason
    //   77	531	2	str	String
    //   621	25	2	localException1	Exception
    //   655	1	2	localObject1	Object
    //   69	163	3	localObject2	Object
    //   505	12	3	localObject3	Object
    //   518	25	3	localThrowable1	Throwable
    //   550	112	3	localObject4	Object
    //   665	1	3	localThrowable2	Throwable
    //   669	1	3	localObject5	Object
    //   673	1	3	localThrowable3	Throwable
    //   677	1	3	localException2	Exception
    //   681	1	3	localThrowable4	Throwable
    //   652	8	4	localThrowable5	Throwable
    //   93	565	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   449	481	499	java/lang/Exception
    //   481	498	499	java/lang/Exception
    //   100	153	505	finally
    //   509	518	518	java/lang/Throwable
    //   442	445	621	java/lang/Exception
    //   70	78	652	java/lang/Throwable
    //   80	95	652	java/lang/Throwable
    //   551	558	652	java/lang/Throwable
    //   560	571	652	java/lang/Throwable
    //   573	582	652	java/lang/Throwable
    //   584	592	652	java/lang/Throwable
    //   594	607	652	java/lang/Throwable
    //   609	615	652	java/lang/Throwable
    //   266	273	665	java/lang/Throwable
    //   153	171	669	finally
    //   171	191	669	finally
    //   191	196	669	finally
    //   200	221	669	finally
    //   221	231	669	finally
    //   235	248	669	finally
    //   248	266	669	finally
    //   235	248	673	java/lang/Throwable
    //   200	221	677	java/lang/Exception
    //   171	191	681	java/lang/Throwable
  }
  
  public void a(c paramc, int paramInt1, int paramInt2, an paraman, boolean paramBoolean, al paramal)
  {
    if (((this.o.get()) || (!this.n.get())) && (this.o.get()))
    {
      this.o.set(false);
      a(CloseConnReason.closeLastOpened);
    }
    this.b = paramc;
    this.e = paraman;
    this.m = paramBoolean;
    this.r.c.j = false;
    Object localObject4 = bd.b;
    String str = "";
    this.l = 0L;
    long l1;
    Object localObject2;
    label2184:
    label2846:
    do
    {
      Object localObject1;
      Object localObject3;
      for (;;)
      {
        try
        {
          if (this.p.tryLock(3000L, TimeUnit.MILLISECONDS))
          {
            l5 = SystemClock.elapsedRealtime();
            l1 = System.currentTimeMillis();
            System.currentTimeMillis();
            localObject2 = str;
            l2 = l1;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
          }
          try
          {
            this.a = new InetSocketAddress(paramc.c(), paramc.d());
            localObject2 = str;
            l2 = l1;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            StringBuilder localStringBuilder = new StringBuilder();
            localObject2 = str;
            l2 = l1;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            QLog.d("MSF.C.NetConnTag", 1, "try open Conn " + this.a);
            localObject2 = str;
            l2 = l1;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            l3 = System.currentTimeMillis();
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            this.c = new Socket();
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            this.c.setSoTimeout(paramInt2);
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            this.c.setTcpNoDelay(true);
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            this.c.setKeepAlive(true);
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            this.c.connect(this.a, paramc.e());
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            paramal.d = true;
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            paramal.j += 1;
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            this.l = System.currentTimeMillis();
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            long l4 = this.l - l3;
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            av localav = this.r.c.a;
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            localav.j += l4;
            l1 = l4;
            if (l4 < 0L) {
              l1 = 0L;
            }
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            o.y = this.l;
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            this.j.set(0L);
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            this.k.set(0L);
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            this.d = this.c.getOutputStream();
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            if (!i.contains(this.d.toString()))
            {
              localObject2 = str;
              l2 = l3;
              localObject1 = localObject4;
              localObject3 = str;
              paraman = (an)localObject4;
              i.add(this.d.toString());
            }
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            this.g = new MsfSocketInputBuffer(this.c, paramInt1, "US-ASCII", -1);
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            this.f = new au(this);
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            this.f.setName("MsfCoreSocketReader");
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            this.f.start();
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            this.n.set(true);
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            localObject4 = bd.c;
            str = "conSucc";
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            this.s = paramc;
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            o.g();
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            o.p = this.s.c() + ":" + this.s.d();
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            o.q = this.c.getLocalSocketAddress() + "|" + this.c.getLocalPort();
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            if (!m.e()) {
              continue;
            }
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            o.r = 1;
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            this.s.f();
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            localStringBuilder.delete(0, localStringBuilder.length());
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            a(paramc.c());
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            this.h = this.c.getPort();
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            QLog.d("MSF.C.NetConnTag", 1, "open conn at " + this.a + " costTime:" + l1 + " configTimeout: " + paramc.e() + " localSocket:" + this.c.getLocalAddress().getHostAddress() + ":" + this.c.getLocalPort());
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            o.C.set(false);
            localObject2 = str;
            l2 = l3;
            localObject1 = localObject4;
            localObject3 = str;
            paraman = (an)localObject4;
            this.u.set(0);
            this.p.unlock();
            if (localObject4 != bd.c)
            {
              paramal.d = false;
              paramal.k += 1;
            }
            paramal.e = ((bd)localObject4);
            paramal.f = "conSucc";
            paramal.a = (SystemClock.elapsedRealtime() - l5);
            localObject2 = localObject4;
          }
          catch (Throwable localThrowable)
          {
            long l3;
            localObject3 = localObject2;
            paraman = (an)localObject1;
            l1 = System.currentTimeMillis() - l2;
            localObject3 = localObject2;
            paraman = (an)localObject1;
            localObject4 = this.r.c.a;
            localObject3 = localObject2;
            paraman = (an)localObject1;
            ((av)localObject4).j += l1;
            localObject3 = localObject2;
            paraman = (an)localObject1;
            str = localThrowable.toString().toLowerCase();
            localObject3 = str;
            paraman = (an)localObject1;
            if (m.n() != 0) {
              continue;
            }
            localObject3 = str;
            paraman = (an)localObject1;
            localObject2 = bd.m;
            localObject3 = str;
            paraman = (an)localObject2;
            localObject1 = ((bd)localObject2).toString();
            localObject3 = localObject1;
            paraman = (an)localObject2;
            paramal.h = 5000;
            this.p.unlock();
            if (localObject2 == bd.c) {
              continue;
            }
            paramal.d = false;
            paramal.k += 1;
            paramal.e = ((bd)localObject2);
            paramal.f = ((String)localObject1);
            paramal.a = (SystemClock.elapsedRealtime() - l5);
            continue;
            localObject3 = str;
            paraman = (an)localObject1;
            if (str.indexOf("illegal") <= -1) {
              continue;
            }
            localObject3 = str;
            paraman = (an)localObject1;
            localObject2 = bd.g;
            localObject3 = str;
            paraman = (an)localObject2;
            localObject1 = ((bd)localObject2).toString();
            continue;
            localObject3 = str;
            paraman = (an)localObject1;
            if (str.indexOf("route to host") <= -1) {
              continue;
            }
            localObject3 = str;
            paraman = (an)localObject1;
            localObject2 = bd.q;
            localObject3 = str;
            paraman = (an)localObject2;
            localObject1 = ((bd)localObject2).toString();
            continue;
            localObject3 = str;
            paraman = (an)localObject1;
            if (str.indexOf("unreachable") <= -1) {
              break label2184;
            }
            localObject3 = str;
            paraman = (an)localObject1;
            localObject2 = bd.m;
            localObject3 = str;
            paraman = (an)localObject2;
            localObject1 = ((bd)localObject2).toString();
            localObject3 = localObject1;
            paraman = (an)localObject2;
            paramal.h = 5000;
            continue;
          }
          finally
          {
            this.p.unlock();
            if (paraman == bd.c) {
              continue;
            }
            paramal.d = false;
            paramal.k += 1;
            paramal.e = paraman;
            paramal.f = ((String)localObject3);
            paramal.a = (SystemClock.elapsedRealtime() - l5);
          }
          if ((localObject2 != bd.c) || (!this.q)) {
            break label2846;
          }
          if (!m.b()) {
            m.a(true);
          }
          this.r.c.a(null);
          this.r.c.c();
          o.m.set(0);
          if (this.c != null)
          {
            this.r.s = (this.c.getLocalAddress().getHostAddress() + ":" + this.c.getLocalPort());
            NetConnInfoCenter.onConnOpened(this.a.toString(), this.r.s);
            this.r.c.k();
          }
          return;
        }
        catch (InterruptedException paramc)
        {
          long l5;
          long l2;
          paramal.d = false;
          paramal.k += 1;
          paramal.e = bd.f;
          paramal.f = paramc.toString();
          paramal.a = 0L;
          return;
        }
        localObject2 = str;
        l2 = l3;
        localObject1 = localObject4;
        localObject3 = str;
        paraman = (an)localObject4;
        if (m.f())
        {
          localObject2 = str;
          l2 = l3;
          localObject1 = localObject4;
          localObject3 = str;
          paraman = (an)localObject4;
          o.r = m.j() + 100;
        }
      }
      for (;;)
      {
        localObject3 = str;
        paraman = (an)localObject1;
        if (str.indexOf("permission") > -1)
        {
          localObject3 = str;
          paraman = (an)localObject1;
          localObject2 = bd.i;
          localObject3 = str;
          paraman = (an)localObject2;
          localObject1 = ((bd)localObject2).toString();
        }
        else
        {
          localObject3 = str;
          paraman = (an)localObject1;
          if (str.indexOf("refused") > -1)
          {
            localObject3 = str;
            paraman = (an)localObject1;
            localObject2 = bd.s;
            localObject3 = str;
            paraman = (an)localObject2;
            localObject1 = ((bd)localObject2).toString();
          }
          else
          {
            localObject3 = str;
            paraman = (an)localObject1;
            if (str.indexOf("reset") > -1)
            {
              localObject3 = str;
              paraman = (an)localObject1;
              localObject2 = bd.r;
              localObject3 = str;
              paraman = (an)localObject2;
              localObject1 = ((bd)localObject2).toString();
            }
            else
            {
              localObject3 = str;
              paraman = (an)localObject1;
              if (str.indexOf("timeoutexception") <= -1)
              {
                localObject3 = str;
                paraman = (an)localObject1;
                if (str.indexOf(") after") <= -1) {}
              }
              else
              {
                localObject3 = str;
                paraman = (an)localObject1;
                localObject2 = bd.t;
                localObject3 = str;
                paraman = (an)localObject2;
                localObject1 = ((bd)localObject2).toString();
                continue;
              }
              localObject3 = str;
              paraman = (an)localObject1;
              if (str.indexOf("unknownhost") > -1)
              {
                localObject3 = str;
                paraman = (an)localObject1;
                localObject2 = bd.p;
                localObject3 = str;
                paraman = (an)localObject2;
                localObject1 = ((bd)localObject2).toString();
              }
              else
              {
                localObject3 = str;
                paraman = (an)localObject1;
                if (str.indexOf("unresolved") > -1)
                {
                  localObject3 = str;
                  paraman = (an)localObject1;
                  localObject2 = bd.o;
                  localObject3 = str;
                  paraman = (an)localObject2;
                  localObject1 = ((bd)localObject2).toString();
                }
                else
                {
                  localObject3 = str;
                  paraman = (an)localObject1;
                  if (str.indexOf("enotsock") > -1)
                  {
                    localObject3 = str;
                    paraman = (an)localObject1;
                    localObject2 = bd.h;
                    localObject3 = str;
                    paraman = (an)localObject2;
                    localObject1 = ((bd)localObject2).toString();
                  }
                  else
                  {
                    localObject3 = str;
                    paraman = (an)localObject1;
                    if (str.indexOf("enobufs") > -1)
                    {
                      localObject3 = str;
                      paraman = (an)localObject1;
                      localObject2 = bd.l;
                      localObject3 = str;
                      paraman = (an)localObject2;
                      localObject1 = ((bd)localObject2).toString();
                    }
                    else
                    {
                      localObject3 = str;
                      paraman = (an)localObject1;
                      if (str.indexOf("ebadf") > -1)
                      {
                        localObject3 = str;
                        paraman = (an)localObject1;
                        localObject2 = bd.j;
                        localObject3 = str;
                        paraman = (an)localObject2;
                        localObject1 = ((bd)localObject2).toString();
                      }
                      else
                      {
                        localObject3 = str;
                        paraman = (an)localObject1;
                        if (str.indexOf("operation") > -1)
                        {
                          localObject3 = str;
                          paraman = (an)localObject1;
                          localObject2 = bd.t;
                          localObject3 = str;
                          paraman = (an)localObject2;
                          localObject1 = ((bd)localObject2).toString();
                        }
                        else
                        {
                          localObject3 = str;
                          paraman = (an)localObject1;
                          if (str.indexOf("invalid") > -1)
                          {
                            localObject3 = str;
                            paraman = (an)localObject1;
                            localObject2 = bd.n;
                            localObject3 = str;
                            paraman = (an)localObject2;
                            localObject1 = ((bd)localObject2).toString();
                          }
                          else
                          {
                            localObject3 = str;
                            paraman = (an)localObject1;
                            localObject4 = bd.u;
                            localObject3 = str;
                            paraman = (an)localObject4;
                            str = a(localThrowable);
                            localObject1 = str;
                            localObject2 = localObject4;
                            localObject3 = str;
                            paraman = (an)localObject4;
                            if (str.length() > 200)
                            {
                              localObject3 = str;
                              paraman = (an)localObject4;
                              localObject1 = str.substring(0, 200);
                              localObject2 = localObject4;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    } while (localObject2 == bd.c);
    QLog.d("MSF.C.NetConnTag", 1, "open " + this.a + " failed " + paramal.f + " costTime: " + l1 + " configTimeout: " + paramc.e());
  }
  
  public long b()
  {
    return this.l;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\qalsdk\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */