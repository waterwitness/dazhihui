package com.tencent.qalsdk.core;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.qalsdk.base.CloseConnReason;
import com.tencent.qalsdk.base.a;
import com.tencent.qalsdk.base.remote.FromServiceMsg;
import com.tencent.qalsdk.base.remote.ToServiceMsg;
import com.tencent.qalsdk.config.NativeConfigStore;
import com.tencent.qalsdk.sdk.MsfCommand;
import com.tencent.qalsdk.sdk.MsfSdkUtils;
import com.tencent.qalsdk.sdk.ae;
import com.tencent.qalsdk.util.CodecWarpper;
import com.tencent.qalsdk.util.QLog;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import qalsdk.ah;
import qalsdk.aj;
import qalsdk.aq;
import qalsdk.as;
import qalsdk.at;
import qalsdk.av;

public class o
{
  static int A = -1;
  static AtomicBoolean B = new AtomicBoolean();
  public static AtomicBoolean C = new AtomicBoolean();
  public static final String E = "GrayUinPro.Check";
  public static final String F = "res";
  public static final int I = -10008;
  public static final int J = -302;
  public static final int K = 302;
  static CopyOnWriteArraySet<String> L = new CopyOnWriteArraySet();
  private static final AtomicInteger U = new AtomicInteger();
  private static int X = 0;
  private static String Y;
  private static String[] Z;
  private static AtomicBoolean ad = new AtomicBoolean();
  public static final String b = "__extraTimeoutSeq";
  public static final String k = "MSF.C.NetConnTag";
  public static int l = 0;
  public static AtomicInteger m = new AtomicInteger(0);
  public static String p = ":";
  public static String q = "0";
  public static int r = 0;
  public static long s;
  public static long y;
  static int z;
  HashSet<String> D = new HashSet();
  public int G = -1;
  public AtomicBoolean H = new AtomicBoolean();
  ArrayList<HashMap> M = new ArrayList();
  boolean N = false;
  private ConcurrentHashMap<Integer, ToServiceMsg> O = new ConcurrentHashMap();
  private ConcurrentHashMap<Integer, ArrayList<Integer>> P = new ConcurrentHashMap();
  private ConcurrentHashMap<Integer, ArrayList<ToServiceMsg>> Q = new ConcurrentHashMap();
  private ae<ToServiceMsg> R = new ae(1000);
  private ae<ToServiceMsg> S = new ae();
  private Handler T;
  private int V = 0;
  private String W = "0";
  public av a;
  private byte[] aa = null;
  private long ab = 0L;
  private Random ac = new Random(System.currentTimeMillis());
  public int c = 10;
  public int d = 3072;
  public int e = 0;
  public int f = 500;
  public int g = 60000;
  public long h = 0L;
  public boolean i = false;
  public volatile boolean j = false;
  o.a n = new o.a(this);
  j o;
  o.b t = new o.b(this);
  AtomicBoolean u = new AtomicBoolean();
  int v = 0;
  long w = 0L;
  long x = 0L;
  
  static
  {
    X = 0;
    Y = "";
    Z = new String[] { "StreamSvr.UploadStreamMsg" };
    s = -1L;
    y = 0L;
    z = -1;
  }
  
  public o(j paramj)
  {
    this.o = paramj;
    HandlerThread localHandlerThread = new HandlerThread("mergehandle", 5);
    localHandlerThread.start();
    this.T = new Handler(localHandlerThread.getLooper());
    this.V = paramj.i();
    this.a = new av(paramj);
    this.t.setName("MsfCoreMsgSender");
    try
    {
      paramj = ah.c();
      if (paramj != null)
      {
        this.c = Integer.parseInt(paramj[0]);
        this.d = Integer.parseInt(paramj[1]);
        this.g = Integer.parseInt(paramj[2]);
        this.f = Integer.parseInt(paramj[3]);
        if (QLog.isColorLevel()) {
          QLog.d("MSF.C.NetConnTag", 2, "maxDelaySize: " + this.d + " mergeDuration: " + this.g + " globaldelayTime: " + this.f + " delayWaitSendCount: " + this.c);
        }
      }
      return;
    }
    catch (Exception paramj)
    {
      QLog.e("MSF.C.NetConnTag", 1, " " + paramj, paramj);
    }
  }
  
  public static void a(String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {
      L.add(paramString);
    }
    for (;;)
    {
      CodecWarpper.setUseSimpleHead(paramString, paramBoolean);
      return;
      L.remove(paramString);
    }
  }
  
  public static void b(int paramInt)
  {
    X = paramInt;
  }
  
  public static void b(String paramString)
  {
    Y = paramString;
  }
  
  public static byte[] b(byte[] paramArrayOfByte)
  {
    int i1 = paramArrayOfByte.length;
    ByteBuffer localByteBuffer = ByteBuffer.allocate(i1 + 4);
    localByteBuffer.putInt(i1 + 4).put(paramArrayOfByte).flip();
    return localByteBuffer.array();
  }
  
  private int c(ToServiceMsg paramToServiceMsg)
  {
    Object localObject;
    if (paramToServiceMsg.isNeedCallback())
    {
      this.O.put(Integer.valueOf(paramToServiceMsg.getRequestSsoSeq()), paramToServiceMsg);
      paramToServiceMsg.getAttributes().put("__extraTimeoutSeq", Integer.valueOf(U.incrementAndGet()));
      if (paramToServiceMsg.getTimeout() == -1L)
      {
        paramToServiceMsg.setTimeout(15000L);
        localObject = this.o.k.a(paramToServiceMsg, paramToServiceMsg.getTimeout());
        paramToServiceMsg.addAttribute("to_timeoutCallbacker", localObject);
        label85:
        if (this.R.offer(paramToServiceMsg)) {
          break label361;
        }
        QLog.d("MSF.C.NetConnTag", 1, "error, add " + paramToServiceMsg + " to send queue is full! size: " + this.R.size());
        if (paramToServiceMsg.getServiceCmd().equals("SSO.LoginMerge")) {
          break label285;
        }
        localObject = k.a(paramToServiceMsg);
        ((FromServiceMsg)localObject).setBusinessFail(1008, "send queue is full!");
        this.o.a(paramToServiceMsg, (FromServiceMsg)localObject);
      }
    }
    for (;;)
    {
      if ((!B.get()) && (e.b))
      {
        B.set(true);
        z = paramToServiceMsg.getRequestSsoSeq();
      }
      if (!C.get())
      {
        C.set(true);
        A = paramToServiceMsg.getRequestSsoSeq();
      }
      return paramToServiceMsg.getRequestSsoSeq();
      localObject = this.o.k.a(paramToServiceMsg, paramToServiceMsg.getTimeout());
      break;
      if (!paramToServiceMsg.getServiceCmd().equals("SSO.LoginMerge")) {
        break label85;
      }
      this.o.k.a(paramToServiceMsg.getRequestSsoSeq(), 30000L);
      break label85;
      label285:
      localObject = (ArrayList)this.Q.remove(Integer.valueOf(paramToServiceMsg.getRequestSsoSeq()));
      if (localObject != null)
      {
        localObject = ((ArrayList)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          ToServiceMsg localToServiceMsg = (ToServiceMsg)((Iterator)localObject).next();
          FromServiceMsg localFromServiceMsg = k.a(localToServiceMsg);
          localFromServiceMsg.setBusinessFail(1008, "send queue is full!");
          this.o.a(localToServiceMsg, localFromServiceMsg);
        }
        continue;
        label361:
        if (this.Q.contains(Integer.valueOf(paramToServiceMsg.getRequestSsoSeq()))) {
          this.Q.remove(Integer.valueOf(paramToServiceMsg.getRequestSsoSeq()));
        }
        if (QLog.isDevelopLevel()) {
          QLog.d("MSF.C.NetConnTag", 4, "add " + paramToServiceMsg + " to sendQueue");
        }
      }
    }
  }
  
  /* Error */
  private void c(Context paramContext)
  {
    // Byte code:
    //   0: getstatic 517	com/tencent/qalsdk/base/a:ap	[Ljava/lang/String;
    //   3: ifnull +58 -> 61
    //   6: getstatic 517	com/tencent/qalsdk/base/a:ap	[Ljava/lang/String;
    //   9: arraylength
    //   10: ifle +51 -> 61
    //   13: aload_0
    //   14: getfield 287	com/tencent/qalsdk/core/o:a	Lqalsdk/av;
    //   17: getstatic 517	com/tencent/qalsdk/base/a:ap	[Ljava/lang/String;
    //   20: invokevirtual 520	qalsdk/av:a	([Ljava/lang/String;)V
    //   23: invokestatic 310	com/tencent/qalsdk/util/QLog:isColorLevel	()Z
    //   26: ifeq +34 -> 60
    //   29: ldc 38
    //   31: iconst_2
    //   32: new 312	java/lang/StringBuilder
    //   35: dup
    //   36: invokespecial 313	java/lang/StringBuilder:<init>	()V
    //   39: ldc_w 522
    //   42: invokevirtual 319	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: getstatic 517	com/tencent/qalsdk/base/a:ap	[Ljava/lang/String;
    //   48: invokestatic 527	java/util/Arrays:toString	([Ljava/lang/Object;)Ljava/lang/String;
    //   51: invokevirtual 319	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: invokevirtual 332	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   57: invokestatic 335	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   60: return
    //   61: getstatic 530	com/tencent/qalsdk/base/a:aq	[Ljava/lang/String;
    //   64: ifnull +58 -> 122
    //   67: getstatic 530	com/tencent/qalsdk/base/a:aq	[Ljava/lang/String;
    //   70: arraylength
    //   71: ifle +51 -> 122
    //   74: aload_0
    //   75: getfield 287	com/tencent/qalsdk/core/o:a	Lqalsdk/av;
    //   78: getstatic 530	com/tencent/qalsdk/base/a:aq	[Ljava/lang/String;
    //   81: invokevirtual 532	qalsdk/av:b	([Ljava/lang/String;)V
    //   84: invokestatic 310	com/tencent/qalsdk/util/QLog:isColorLevel	()Z
    //   87: ifeq -27 -> 60
    //   90: ldc 38
    //   92: iconst_2
    //   93: new 312	java/lang/StringBuilder
    //   96: dup
    //   97: invokespecial 313	java/lang/StringBuilder:<init>	()V
    //   100: ldc_w 522
    //   103: invokevirtual 319	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: getstatic 517	com/tencent/qalsdk/base/a:ap	[Ljava/lang/String;
    //   109: invokestatic 527	java/util/Arrays:toString	([Ljava/lang/Object;)Ljava/lang/String;
    //   112: invokevirtual 319	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: invokevirtual 332	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   118: invokestatic 335	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   121: return
    //   122: aload_1
    //   123: invokevirtual 537	android/content/Context:getPackageName	()Ljava/lang/String;
    //   126: astore_1
    //   127: new 539	java/io/File
    //   130: dup
    //   131: new 312	java/lang/StringBuilder
    //   134: dup
    //   135: invokespecial 313	java/lang/StringBuilder:<init>	()V
    //   138: invokestatic 545	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   141: invokevirtual 548	java/io/File:getPath	()Ljava/lang/String;
    //   144: invokevirtual 319	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: ldc_w 550
    //   150: invokevirtual 319	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: aload_1
    //   154: ldc_w 552
    //   157: ldc_w 554
    //   160: invokevirtual 558	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   163: invokevirtual 319	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   166: ldc_w 560
    //   169: invokevirtual 319	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   172: invokevirtual 332	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   175: invokespecial 562	java/io/File:<init>	(Ljava/lang/String;)V
    //   178: astore_1
    //   179: new 564	java/util/Properties
    //   182: dup
    //   183: invokespecial 565	java/util/Properties:<init>	()V
    //   186: astore_3
    //   187: new 567	java/io/FileInputStream
    //   190: dup
    //   191: aload_1
    //   192: invokespecial 570	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   195: astore_2
    //   196: aload_2
    //   197: astore_1
    //   198: aload_3
    //   199: aload_2
    //   200: invokevirtual 574	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   203: aload_2
    //   204: astore_1
    //   205: aload_3
    //   206: ldc_w 576
    //   209: invokevirtual 580	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   212: astore 4
    //   214: aload_2
    //   215: astore_1
    //   216: aload_3
    //   217: ldc_w 582
    //   220: invokevirtual 580	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   223: astore_3
    //   224: aload_2
    //   225: astore_1
    //   226: aload 4
    //   228: ldc_w 584
    //   231: invokevirtual 588	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   234: putstatic 517	com/tencent/qalsdk/base/a:ap	[Ljava/lang/String;
    //   237: aload_2
    //   238: astore_1
    //   239: aload_3
    //   240: ldc_w 584
    //   243: invokevirtual 588	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   246: putstatic 530	com/tencent/qalsdk/base/a:aq	[Ljava/lang/String;
    //   249: aload_2
    //   250: astore_1
    //   251: aload_0
    //   252: getfield 287	com/tencent/qalsdk/core/o:a	Lqalsdk/av;
    //   255: getstatic 517	com/tencent/qalsdk/base/a:ap	[Ljava/lang/String;
    //   258: invokevirtual 520	qalsdk/av:a	([Ljava/lang/String;)V
    //   261: aload_2
    //   262: astore_1
    //   263: invokestatic 310	com/tencent/qalsdk/util/QLog:isColorLevel	()Z
    //   266: ifeq +36 -> 302
    //   269: aload_2
    //   270: astore_1
    //   271: ldc 38
    //   273: iconst_2
    //   274: new 312	java/lang/StringBuilder
    //   277: dup
    //   278: invokespecial 313	java/lang/StringBuilder:<init>	()V
    //   281: ldc_w 590
    //   284: invokevirtual 319	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   287: getstatic 517	com/tencent/qalsdk/base/a:ap	[Ljava/lang/String;
    //   290: invokestatic 527	java/util/Arrays:toString	([Ljava/lang/Object;)Ljava/lang/String;
    //   293: invokevirtual 319	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   296: invokevirtual 332	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   299: invokestatic 335	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   302: aload_2
    //   303: astore_1
    //   304: aload_0
    //   305: getfield 287	com/tencent/qalsdk/core/o:a	Lqalsdk/av;
    //   308: getstatic 530	com/tencent/qalsdk/base/a:aq	[Ljava/lang/String;
    //   311: invokevirtual 532	qalsdk/av:b	([Ljava/lang/String;)V
    //   314: aload_2
    //   315: astore_1
    //   316: invokestatic 310	com/tencent/qalsdk/util/QLog:isColorLevel	()Z
    //   319: ifeq +36 -> 355
    //   322: aload_2
    //   323: astore_1
    //   324: ldc 38
    //   326: iconst_2
    //   327: new 312	java/lang/StringBuilder
    //   330: dup
    //   331: invokespecial 313	java/lang/StringBuilder:<init>	()V
    //   334: ldc_w 590
    //   337: invokevirtual 319	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   340: getstatic 530	com/tencent/qalsdk/base/a:aq	[Ljava/lang/String;
    //   343: invokestatic 527	java/util/Arrays:toString	([Ljava/lang/Object;)Ljava/lang/String;
    //   346: invokevirtual 319	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   349: invokevirtual 332	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   352: invokestatic 335	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   355: aload_2
    //   356: invokevirtual 593	java/io/FileInputStream:close	()V
    //   359: return
    //   360: astore_1
    //   361: aload_1
    //   362: invokevirtual 596	java/io/IOException:printStackTrace	()V
    //   365: return
    //   366: astore_3
    //   367: aconst_null
    //   368: astore_2
    //   369: aload_2
    //   370: astore_1
    //   371: aload_3
    //   372: invokevirtual 597	java/lang/Exception:printStackTrace	()V
    //   375: aload_2
    //   376: invokevirtual 593	java/io/FileInputStream:close	()V
    //   379: return
    //   380: astore_1
    //   381: aload_1
    //   382: invokevirtual 596	java/io/IOException:printStackTrace	()V
    //   385: return
    //   386: astore_2
    //   387: aconst_null
    //   388: astore_1
    //   389: aload_1
    //   390: invokevirtual 593	java/io/FileInputStream:close	()V
    //   393: aload_2
    //   394: athrow
    //   395: astore_1
    //   396: aload_1
    //   397: invokevirtual 596	java/io/IOException:printStackTrace	()V
    //   400: goto -7 -> 393
    //   403: astore_2
    //   404: goto -15 -> 389
    //   407: astore_3
    //   408: goto -39 -> 369
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	411	0	this	o
    //   0	411	1	paramContext	Context
    //   195	181	2	localFileInputStream	java.io.FileInputStream
    //   386	8	2	localObject1	Object
    //   403	1	2	localObject2	Object
    //   186	54	3	localObject3	Object
    //   366	6	3	localException1	Exception
    //   407	1	3	localException2	Exception
    //   212	15	4	str	String
    // Exception table:
    //   from	to	target	type
    //   355	359	360	java/io/IOException
    //   187	196	366	java/lang/Exception
    //   375	379	380	java/io/IOException
    //   187	196	386	finally
    //   389	393	395	java/io/IOException
    //   198	203	403	finally
    //   205	214	403	finally
    //   216	224	403	finally
    //   226	237	403	finally
    //   239	249	403	finally
    //   251	261	403	finally
    //   263	269	403	finally
    //   271	302	403	finally
    //   304	314	403	finally
    //   316	322	403	finally
    //   324	355	403	finally
    //   371	375	403	finally
    //   198	203	407	java/lang/Exception
    //   205	214	407	java/lang/Exception
    //   216	224	407	java/lang/Exception
    //   226	237	407	java/lang/Exception
    //   239	249	407	java/lang/Exception
    //   251	261	407	java/lang/Exception
    //   263	269	407	java/lang/Exception
    //   271	302	407	java/lang/Exception
    //   304	314	407	java/lang/Exception
    //   316	322	407	java/lang/Exception
    //   324	355	407	java/lang/Exception
  }
  
  private void c(String paramString) {}
  
  public static void g()
  {
    Iterator localIterator = L.iterator();
    while (localIterator.hasNext()) {
      CodecWarpper.setUseSimpleHead((String)localIterator.next(), false);
    }
    L.clear();
  }
  
  public static int l()
  {
    return X;
  }
  
  public static String m()
  {
    return Y;
  }
  
  private void o()
  {
    if (this.a.a())
    {
      ToServiceMsg localToServiceMsg = new ToServiceMsg("", "0", "Heartbeat.Alive");
      localToServiceMsg.setMsfCommand(MsfCommand._msf_HeartbeatAlive);
      localToServiceMsg.setRequestSsoSeq(j.f());
      localToServiceMsg.setAppId(this.o.i());
      localToServiceMsg.putWupBuffer(new byte[] { 0, 0, 0, 4 });
      localToServiceMsg.setTimeout(ah.f());
      a(localToServiceMsg);
      this.v += 1;
      if (QLog.isDevelopLevel()) {
        QLog.d("MSF.C.NetConnTag", 4, "send Heartbeat msg ok");
      }
      this.w = System.currentTimeMillis();
      this.u.set(true);
      return;
    }
    if (QLog.isDevelopLevel()) {
      QLog.d("MSF.C.NetConnTag", 4, "conn is also closed.not need send heartbeat msg");
    }
    q();
  }
  
  private void p()
  {
    if (this.a.a())
    {
      ToServiceMsg localToServiceMsg = new ToServiceMsg("", "0", "Heartbeat.Alive");
      localToServiceMsg.setMsfCommand(MsfCommand._msf_HeartbeatAlive);
      localToServiceMsg.setRequestSsoSeq(j.f());
      localToServiceMsg.setAppId(this.o.i());
      localToServiceMsg.putWupBuffer(new byte[] { 0, 0, 0, 4 });
      localToServiceMsg.setTimeout(10000L);
      a(localToServiceMsg);
      this.v = ah.g();
      if (QLog.isDevelopLevel()) {
        QLog.d("MSF.C.NetConnTag", 4, "send fast net detect Heartbeat msg ok");
      }
      this.w = System.currentTimeMillis();
      this.u.set(true);
      return;
    }
    if (QLog.isDevelopLevel()) {
      QLog.d("MSF.C.NetConnTag", 4, "conn is also closed.not need send heartbeat msg");
    }
    q();
  }
  
  private void q()
  {
    this.v = 0;
    this.u.set(false);
  }
  
  public int a(ToServiceMsg paramToServiceMsg)
  {
    if (paramToServiceMsg.getRequestSsoSeq() == -1) {
      paramToServiceMsg.setRequestSsoSeq(j.f());
    }
    paramToServiceMsg.addAttribute("__timestamp_addSendQueue", Long.valueOf(System.currentTimeMillis()));
    Runnable localRunnable;
    if (paramToServiceMsg.isNeedCallback())
    {
      if (QLog.isColorLevel()) {
        QLog.d("MSF.C.NetConnTag", 2, "add " + paramToServiceMsg + " to send");
      }
      this.O.put(Integer.valueOf(paramToServiceMsg.getRequestSsoSeq()), paramToServiceMsg);
      paramToServiceMsg.getAttributes().put("__extraTimeoutSeq", Integer.valueOf(U.incrementAndGet()));
      if (paramToServiceMsg.getTimeout() != -1L) {
        break label165;
      }
      paramToServiceMsg.setTimeout(15000L);
      localRunnable = this.o.k.a(paramToServiceMsg, paramToServiceMsg.getTimeout());
    }
    for (;;)
    {
      paramToServiceMsg.addAttribute("to_timeoutCallbacker", localRunnable);
      try
      {
        this.R.a(paramToServiceMsg);
        return paramToServiceMsg.getRequestSsoSeq();
        label165:
        localRunnable = this.o.k.a(paramToServiceMsg, paramToServiceMsg.getTimeout());
      }
      catch (Exception localException)
      {
        for (;;)
        {
          QLog.d("MSF.C.NetConnTag", 1, "inset heartbeatMsg error. " + localException, localException);
        }
      }
    }
  }
  
  public ToServiceMsg a(int paramInt)
  {
    ToServiceMsg localToServiceMsg = (ToServiceMsg)this.O.get(Integer.valueOf(paramInt));
    if (localToServiceMsg != null)
    {
      Runnable localRunnable = (Runnable)localToServiceMsg.getAttributes().remove("to_timeoutCallbacker");
      if (!localToServiceMsg.isHttpReq())
      {
        this.O.remove(Integer.valueOf(paramInt));
        this.o.k.b().removeCallbacks(localRunnable);
      }
    }
    return localToServiceMsg;
  }
  
  public void a(CloseConnReason paramCloseConnReason)
  {
    this.a.a(paramCloseConnReason);
  }
  
  public void a(FromServiceMsg paramFromServiceMsg, ToServiceMsg paramToServiceMsg)
  {
    if (paramFromServiceMsg.getBusinessFailCode() == 1002)
    {
      QLog.i("MSF.C.NetConnTag", 4, "handleHeartbeat wait " + paramToServiceMsg + " timeout.");
      if (!this.a.a())
      {
        if (QLog.isColorLevel()) {
          QLog.d("MSF.C.NetConnTag", 2, "conn is also closed.");
        }
        q();
      }
      do
      {
        return;
        if (this.v < ah.g()) {
          break;
        }
        try
        {
          if (QLog.isColorLevel()) {
            QLog.d("MSF.C.NetConnTag", 2, "Heartbeat continueTimeoutCount is " + this.v + ",try close conn");
          }
          this.o.c.a.a(CloseConnReason.closeByNetDetectFailed);
          q();
          return;
        }
        catch (Exception paramFromServiceMsg) {}
      } while (!QLog.isColorLevel());
      QLog.d("MSF.C.NetConnTag", 2, paramFromServiceMsg.toString(), paramFromServiceMsg);
      return;
      long l1 = System.currentTimeMillis();
      if (l1 - this.w > ah.g() * ah.f())
      {
        if (QLog.isColorLevel()) {
          QLog.d("MSF.C.NetConnTag", 2, "timenow - firstSendHeartBeatTime is " + (l1 - this.w) + ",try close conn");
        }
        this.o.c.a.a(CloseConnReason.continueWaitRspTimeout);
        q();
        return;
      }
      o();
      return;
    }
    if (QLog.isColorLevel()) {
      QLog.d("MSF.C.NetConnTag", 2, "recv heart resp.now conn is alive.");
    }
    q();
  }
  
  public void a(String paramString)
  {
    CodecWarpper.nateiveRemoveAccountKey(paramString);
  }
  
  public void a(HashMap<String, ArrayList<byte[]>> paramHashMap)
  {
    this.M.add(paramHashMap);
    this.N = true;
    if (QLog.isColorLevel()) {
      QLog.d("MSF.C.NetConnTag", 2, "add waitReportData " + this.M.size());
    }
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    this.aa = paramArrayOfByte;
  }
  
  public boolean a()
  {
    return this.O.isEmpty();
  }
  
  public boolean a(Context paramContext)
  {
    QLog.d("MSF.C.NetConnTag", 1, "noTry loadTestServerConfig by release");
    this.n.init(paramContext, false);
    this.t.start();
    try
    {
      paramContext = l.a().getConfig("LOGLEVEL_");
      if ((paramContext == null) || (paramContext.length() <= 0)) {
        break label162;
      }
      String str = l.a().getConfig("LOGLEVELTIME");
      if ((str != null) && (str.length() > 0))
      {
        long l1 = Long.parseLong(str);
        if (System.currentTimeMillis() - l1 > 259200000L)
        {
          paramContext = new p(this);
          paramContext.setName("resetLogLevelThread");
          paramContext.start();
          return true;
        }
        c(paramContext);
        return true;
      }
    }
    catch (Exception paramContext)
    {
      QLog.e("MSF.C.NetConnTag", 1, "set logLevel error " + paramContext);
      return true;
    }
    l.a().setConfig("LOGLEVELTIME", String.valueOf(System.currentTimeMillis()));
    c(paramContext);
    label162:
    return true;
  }
  
  public boolean a(ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg)
  {
    if ((paramToServiceMsg != null) && (paramToServiceMsg.isNeedRemindSlowNetwork())) {
      aq.a(as.a);
    }
    paramToServiceMsg.addAttribute("_tag_socket_connerror", av.y);
    paramFromServiceMsg.addAttribute("_tag_socket_connerror", av.y);
    if (paramToServiceMsg.getAttributes().containsKey("_tag_socket")) {
      paramFromServiceMsg.addAttribute("_tag_socket", paramToServiceMsg.getAttribute("_tag_socket"));
    }
    if (paramToServiceMsg.getAttributes().containsKey("__timestamp_msf2net")) {}
    for (long l1 = ((Long)paramToServiceMsg.getAttribute("__timestamp_msf2net")).longValue();; l1 = 0L)
    {
      long l3 = System.currentTimeMillis();
      long l2 = 0L;
      if (paramToServiceMsg.getAttributes().containsKey("__timestamp_addSendQueue")) {
        l2 = ((Long)paramToServiceMsg.getAttribute("__timestamp_addSendQueue")).longValue();
      }
      if ((l2 != 0L) && (l3 - l2 > paramToServiceMsg.getTimeout()) && (l3 - l2 > this.o.d.e()))
      {
        if (l2 >= this.a.m().b())
        {
          if (QLog.isColorLevel()) {
            QLog.d("MSF.C.NetConnTag", 2, "xiaomi 2s: " + paramToServiceMsg.getRequestSsoSeq() + " msg timeout , addtoqueueTime is " + (l3 - l2) + ",try close conn");
          }
          this.o.c.a.a(CloseConnReason.closeByNetDetectTooLongForPhoneSleep);
          q();
          return true;
        }
        return true;
      }
      if ((l1 == 0L) || (l1 > this.a.m().b()))
      {
        if (paramToServiceMsg.getMsfCommand() == MsfCommand._msf_HeartbeatAlive)
        {
          QLog.d("MSF.C.NetConnTag", 1, "found timeout heartalive msg " + paramToServiceMsg.getRequestSsoSeq());
          a(paramFromServiceMsg, paramToServiceMsg);
          return false;
        }
        try
        {
          if ((this.u.get()) && (System.currentTimeMillis() - this.w < ah.m() + 120000)) {
            break label598;
          }
          l1 = System.currentTimeMillis();
          if (l1 - this.w <= ah.m()) {
            break label543;
          }
          if (paramToServiceMsg.getRequestSsoSeq() == A)
          {
            A = -1;
            QLog.i("MSF.C.NetConnTag", 1, "[Sender] found conn  first msg timeout ,wifi may fake" + paramToServiceMsg);
            this.o.c.a.c.c();
            this.o.c.a.f();
          }
          if (paramToServiceMsg.getRequestSsoSeq() == z)
          {
            z = -1;
            QLog.d("MSF.C.NetConnTag", 1, "[Sender]found first msg screen on timeout try close conn " + paramToServiceMsg);
            this.o.c.a.a(CloseConnReason.closeForScrrenOnFirstMsgTimeout);
            q();
            return true;
          }
        }
        finally {}
        o();
      }
      for (;;)
      {
        if (paramToServiceMsg.getMsfCommand() != MsfCommand._msf_HeartbeatAlive) {
          break label677;
        }
        return false;
        label543:
        QLog.d("MSF.C.NetConnTag", 1, "found timeout msg check time: timenow = " + l1 + " firstSendHeartBeatTime = " + this.w + " ConfigManager.getHeartBeatTimeInterval() = " + ah.m());
        break;
        label598:
        if (!QLog.isColorLevel()) {
          break;
        }
        QLog.d("MSF.C.NetConnTag", 2, "sendingHeartBeat: " + this.u + "net detect has started, no need sendHeartbeat");
        break;
        QLog.d("MSF.C.NetConnTag", 1, "found timeout msg " + paramToServiceMsg + " before connSucc.");
      }
      for (;;)
      {
        try
        {
          label677:
          if (this.a.a())
          {
            int i3 = 1;
            paramFromServiceMsg = Z;
            int i4 = paramFromServiceMsg.length;
            i1 = 0;
            int i2 = i3;
            if (i1 < i4)
            {
              CharSequence localCharSequence = paramFromServiceMsg[i1];
              if ((TextUtils.isEmpty(localCharSequence)) || (paramToServiceMsg == null) || (!localCharSequence.equals(paramToServiceMsg.getServiceCmd()))) {
                continue;
              }
              i2 = 0;
            }
            if ((i2 != 0) && (m.incrementAndGet() >= ah.h()))
            {
              QLog.d("MSF.C.NetConnTag", 1, "Continue wait resp for bus packets ,try close conn");
              m.set(0);
              this.o.c.a.a(CloseConnReason.continueWaitRspTimeout);
              q();
            }
          }
        }
        catch (Exception paramToServiceMsg)
        {
          int i1;
          QLog.d("MSF.C.NetConnTag", 1, " Continue wait resp for bus packets ,try close conn failed: " + paramToServiceMsg);
          continue;
        }
        return true;
        i1 += 1;
      }
    }
  }
  
  public int b(ToServiceMsg paramToServiceMsg)
  {
    if (paramToServiceMsg == null) {
      return -1;
    }
    FromServiceMsg localFromServiceMsg;
    if (this.o.l())
    {
      localFromServiceMsg = k.a(paramToServiceMsg);
      localFromServiceMsg.setBusinessFail(2009, "MSF is suspeded.");
      this.o.a(paramToServiceMsg, localFromServiceMsg);
      return paramToServiceMsg.getRequestSsoSeq();
    }
    if ((paramToServiceMsg.getAppId() <= 0) && (paramToServiceMsg.getMsfCommand() != MsfCommand.openConn))
    {
      localFromServiceMsg = k.a(paramToServiceMsg);
      localFromServiceMsg.setBusinessFail(1007, "msg appid is " + paramToServiceMsg.getAppId());
      this.o.a(paramToServiceMsg, localFromServiceMsg);
      return paramToServiceMsg.getRequestSsoSeq();
    }
    if (ad.get())
    {
      localFromServiceMsg = k.a(paramToServiceMsg);
      localFromServiceMsg.setBusinessFail(2014, "error");
      this.o.a(paramToServiceMsg, localFromServiceMsg);
      return paramToServiceMsg.getRequestSsoSeq();
    }
    CodecWarpper.getFileStoreKey();
    if (this.V != paramToServiceMsg.getAppId()) {
      this.V = paramToServiceMsg.getAppId();
    }
    if (paramToServiceMsg.getRequestSsoSeq() == -1) {
      paramToServiceMsg.setRequestSsoSeq(j.f());
    }
    if (!paramToServiceMsg.getAttributes().containsKey("__timestamp_app2msf")) {
      paramToServiceMsg.addAttribute("__timestamp_app2msf", Long.valueOf(System.currentTimeMillis()));
    }
    paramToServiceMsg.addAttribute("__timestamp_addSendQueue", Long.valueOf(System.currentTimeMillis()));
    if ((!this.i) && (this.j))
    {
      this.h = SystemClock.elapsedRealtime();
      this.i = true;
    }
    if (((paramToServiceMsg.getServiceCmd().equals("im_open_status.stat_reg")) || (paramToServiceMsg.getServiceCmd().equals(qalsdk.k.d))) && (paramToServiceMsg.getMsfCommand().equals(MsfCommand._msf_RegPush)) && (this.j))
    {
      this.h = SystemClock.elapsedRealtime();
      this.i = true;
    }
    return c(paramToServiceMsg);
  }
  
  /* Error */
  public void b(Context paramContext)
  {
    // Byte code:
    //   0: getstatic 932	com/tencent/qalsdk/base/a:aY	Ljava/lang/String;
    //   3: astore_2
    //   4: aload_2
    //   5: ifnull +73 -> 78
    //   8: aload_2
    //   9: ldc 125
    //   11: invokevirtual 450	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   14: ifne +64 -> 78
    //   17: aload_2
    //   18: invokestatic 937	com/tencent/qalsdk/core/c:a	(Ljava/lang/String;)Lcom/tencent/qalsdk/core/c;
    //   21: astore_1
    //   22: aload_1
    //   23: invokevirtual 939	com/tencent/qalsdk/core/c:c	()Ljava/lang/String;
    //   26: ifnull +10 -> 36
    //   29: aload_1
    //   30: invokevirtual 941	com/tencent/qalsdk/core/c:d	()I
    //   33: ifgt +4 -> 37
    //   36: return
    //   37: aload_0
    //   38: getfield 287	com/tencent/qalsdk/core/o:a	Lqalsdk/av;
    //   41: aload_2
    //   42: invokevirtual 943	qalsdk/av:a	(Ljava/lang/String;)V
    //   45: invokestatic 310	com/tencent/qalsdk/util/QLog:isColorLevel	()Z
    //   48: ifeq -12 -> 36
    //   51: ldc 38
    //   53: iconst_2
    //   54: new 312	java/lang/StringBuilder
    //   57: dup
    //   58: invokespecial 313	java/lang/StringBuilder:<init>	()V
    //   61: ldc_w 945
    //   64: invokevirtual 319	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: aload_2
    //   68: invokevirtual 319	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: invokevirtual 332	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   74: invokestatic 335	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   77: return
    //   78: aload_1
    //   79: invokevirtual 537	android/content/Context:getPackageName	()Ljava/lang/String;
    //   82: astore_1
    //   83: new 539	java/io/File
    //   86: dup
    //   87: new 312	java/lang/StringBuilder
    //   90: dup
    //   91: invokespecial 313	java/lang/StringBuilder:<init>	()V
    //   94: invokestatic 545	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   97: invokevirtual 548	java/io/File:getPath	()Ljava/lang/String;
    //   100: invokevirtual 319	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: ldc_w 550
    //   106: invokevirtual 319	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: aload_1
    //   110: ldc_w 552
    //   113: ldc_w 554
    //   116: invokevirtual 558	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   119: invokevirtual 319	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: ldc_w 947
    //   125: invokevirtual 319	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: invokevirtual 332	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   131: invokespecial 562	java/io/File:<init>	(Ljava/lang/String;)V
    //   134: astore_1
    //   135: new 564	java/util/Properties
    //   138: dup
    //   139: invokespecial 565	java/util/Properties:<init>	()V
    //   142: astore 4
    //   144: aload_1
    //   145: invokevirtual 950	java/io/File:exists	()Z
    //   148: ifeq +252 -> 400
    //   151: new 567	java/io/FileInputStream
    //   154: dup
    //   155: aload_1
    //   156: invokespecial 570	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   159: astore_2
    //   160: aload_2
    //   161: astore_1
    //   162: aload 4
    //   164: aload_2
    //   165: invokevirtual 574	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   168: aload_2
    //   169: astore_1
    //   170: aload_2
    //   171: invokevirtual 593	java/io/FileInputStream:close	()V
    //   174: aload_2
    //   175: ifnull +7 -> 182
    //   178: aload_2
    //   179: invokevirtual 593	java/io/FileInputStream:close	()V
    //   182: iconst_0
    //   183: ifeq +11 -> 194
    //   186: new 952	java/lang/NullPointerException
    //   189: dup
    //   190: invokespecial 953	java/lang/NullPointerException:<init>	()V
    //   193: athrow
    //   194: aload 4
    //   196: ldc_w 955
    //   199: invokevirtual 580	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   202: astore_2
    //   203: aload_2
    //   204: ifnull -168 -> 36
    //   207: aload_2
    //   208: invokevirtual 958	java/lang/String:trim	()Ljava/lang/String;
    //   211: invokevirtual 757	java/lang/String:length	()I
    //   214: ifle -178 -> 36
    //   217: aload_2
    //   218: invokestatic 937	com/tencent/qalsdk/core/c:a	(Ljava/lang/String;)Lcom/tencent/qalsdk/core/c;
    //   221: astore_1
    //   222: aload_1
    //   223: invokevirtual 939	com/tencent/qalsdk/core/c:c	()Ljava/lang/String;
    //   226: ifnull -190 -> 36
    //   229: aload_1
    //   230: invokevirtual 941	com/tencent/qalsdk/core/c:d	()I
    //   233: ifle -197 -> 36
    //   236: aload_2
    //   237: invokevirtual 958	java/lang/String:trim	()Ljava/lang/String;
    //   240: ldc_w 337
    //   243: ldc 125
    //   245: invokevirtual 558	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   248: astore_1
    //   249: aload_0
    //   250: getfield 287	com/tencent/qalsdk/core/o:a	Lqalsdk/av;
    //   253: aload_1
    //   254: invokevirtual 943	qalsdk/av:a	(Ljava/lang/String;)V
    //   257: invokestatic 310	com/tencent/qalsdk/util/QLog:isColorLevel	()Z
    //   260: ifeq -224 -> 36
    //   263: ldc 38
    //   265: iconst_2
    //   266: new 312	java/lang/StringBuilder
    //   269: dup
    //   270: invokespecial 313	java/lang/StringBuilder:<init>	()V
    //   273: ldc_w 960
    //   276: invokevirtual 319	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   279: aload_1
    //   280: invokevirtual 319	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   283: invokevirtual 332	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   286: invokestatic 335	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   289: return
    //   290: astore_1
    //   291: aload_1
    //   292: invokevirtual 596	java/io/IOException:printStackTrace	()V
    //   295: goto -113 -> 182
    //   298: astore_1
    //   299: aload_1
    //   300: invokevirtual 596	java/io/IOException:printStackTrace	()V
    //   303: goto -109 -> 194
    //   306: astore_3
    //   307: aconst_null
    //   308: astore_2
    //   309: aload_2
    //   310: astore_1
    //   311: aload_3
    //   312: invokevirtual 597	java/lang/Exception:printStackTrace	()V
    //   315: aload_2
    //   316: ifnull +7 -> 323
    //   319: aload_2
    //   320: invokevirtual 593	java/io/FileInputStream:close	()V
    //   323: iconst_0
    //   324: ifeq -130 -> 194
    //   327: new 952	java/lang/NullPointerException
    //   330: dup
    //   331: invokespecial 953	java/lang/NullPointerException:<init>	()V
    //   334: athrow
    //   335: astore_1
    //   336: aload_1
    //   337: invokevirtual 596	java/io/IOException:printStackTrace	()V
    //   340: goto -146 -> 194
    //   343: astore_1
    //   344: aload_1
    //   345: invokevirtual 596	java/io/IOException:printStackTrace	()V
    //   348: goto -25 -> 323
    //   351: astore_2
    //   352: aconst_null
    //   353: astore_1
    //   354: aload_1
    //   355: ifnull +7 -> 362
    //   358: aload_1
    //   359: invokevirtual 593	java/io/FileInputStream:close	()V
    //   362: iconst_0
    //   363: ifeq +11 -> 374
    //   366: new 952	java/lang/NullPointerException
    //   369: dup
    //   370: invokespecial 953	java/lang/NullPointerException:<init>	()V
    //   373: athrow
    //   374: aload_2
    //   375: athrow
    //   376: astore_1
    //   377: aload_1
    //   378: invokevirtual 596	java/io/IOException:printStackTrace	()V
    //   381: goto -19 -> 362
    //   384: astore_1
    //   385: aload_1
    //   386: invokevirtual 596	java/io/IOException:printStackTrace	()V
    //   389: goto -15 -> 374
    //   392: astore_2
    //   393: goto -39 -> 354
    //   396: astore_3
    //   397: goto -88 -> 309
    //   400: aconst_null
    //   401: astore_2
    //   402: goto -228 -> 174
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	405	0	this	o
    //   0	405	1	paramContext	Context
    //   3	317	2	localObject1	Object
    //   351	24	2	localObject2	Object
    //   392	1	2	localObject3	Object
    //   401	1	2	localObject4	Object
    //   306	6	3	localException1	Exception
    //   396	1	3	localException2	Exception
    //   142	53	4	localProperties	java.util.Properties
    // Exception table:
    //   from	to	target	type
    //   178	182	290	java/io/IOException
    //   186	194	298	java/io/IOException
    //   144	160	306	java/lang/Exception
    //   327	335	335	java/io/IOException
    //   319	323	343	java/io/IOException
    //   144	160	351	finally
    //   358	362	376	java/io/IOException
    //   366	374	384	java/io/IOException
    //   162	168	392	finally
    //   170	174	392	finally
    //   311	315	392	finally
    //   162	168	396	java/lang/Exception
    //   170	174	396	java/lang/Exception
  }
  
  public byte[] b()
  {
    return this.aa;
  }
  
  public void c() {}
  
  public void c(byte[] paramArrayOfByte)
  {
    this.n.onReceData(paramArrayOfByte);
  }
  
  public ToServiceMsg d()
  {
    return null;
  }
  
  public ConcurrentHashMap<Integer, ToServiceMsg> e()
  {
    return this.O;
  }
  
  public ConcurrentHashMap<Integer, ArrayList<Integer>> f()
  {
    return this.P;
  }
  
  public String h()
  {
    return this.W;
  }
  
  public void i()
  {
    this.W = "0";
  }
  
  public int j()
  {
    return this.V;
  }
  
  public void k()
  {
    Iterator localIterator = this.O.entrySet().iterator();
    label168:
    for (;;)
    {
      Object localObject1;
      int i1;
      if (localIterator.hasNext())
      {
        localObject1 = (Map.Entry)localIterator.next();
        if (localObject1 == null) {
          continue;
        }
        localObject1 = (ToServiceMsg)((Map.Entry)localObject1).getValue();
        if ((localObject1 == null) || (this.R.contains(localObject1))) {
          continue;
        }
        if (((ToServiceMsg)localObject1).isFastResendEnabled()) {
          i1 = 1;
        }
      }
      for (;;)
      {
        if (i1 == 0) {
          break label168;
        }
        Object localObject2 = MsfSdkUtils.constructResponse((ToServiceMsg)localObject1, 2901, "", null);
        ((FromServiceMsg)localObject2).setBusinessFail(2901);
        this.o.a((ToServiceMsg)localObject1, (FromServiceMsg)localObject2);
        localIterator.remove();
        break;
        localObject2 = a.aB;
        int i2 = localObject2.length;
        i1 = 0;
        for (;;)
        {
          if (i1 < i2)
          {
            Object localObject3 = localObject2[i1];
            if (((ToServiceMsg)localObject1).getServiceCmd().equals(localObject3))
            {
              i1 = 1;
              break;
            }
            i1 += 1;
            continue;
            return;
          }
        }
        i1 = 0;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\core\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */