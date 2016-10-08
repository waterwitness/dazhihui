package com.tencent.qalsdk.core;

import android.content.Context;
import com.tencent.qalsdk.base.remote.FromServiceMsg;
import com.tencent.qalsdk.base.remote.ToServiceMsg;
import com.tencent.qalsdk.config.NativeConfigStore;
import com.tencent.qalsdk.sdk.MsfCommand;
import com.tencent.qalsdk.sdk.MsfSdkUtils;
import com.tencent.qalsdk.sdk.ai;
import com.tencent.qalsdk.sdk.w;
import com.tencent.qalsdk.util.QLog;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import qalsdk.aj;
import qalsdk.ak;
import qalsdk.u;

public class j
{
  private static final char[] A = "0123456789abcdef".toCharArray();
  private static final AtomicInteger B = new AtomicInteger(new Random().nextInt(100000));
  static j a;
  public static String q;
  private static final String x = "MSF.C.MsfCore";
  private static final String y = "_key_set_log_level";
  l b;
  public o c;
  public aj d;
  public qalsdk.ah e;
  ak f;
  public String g = null;
  String h = null;
  public String i = null;
  LinkedBlockingQueue<w> j = new LinkedBlockingQueue();
  i k;
  public AtomicBoolean l = new AtomicBoolean();
  public SimpleDateFormat m = new SimpleDateFormat("yy-MM-dd HH:mm:ss", Locale.getDefault());
  AtomicBoolean n = new AtomicBoolean();
  public u o;
  public NetConnInfoCenter p;
  public Context r = null;
  public volatile String s;
  AtomicBoolean t = new AtomicBoolean(false);
  private a u;
  private int v = 537046243;
  private q w;
  private int z = 1;
  
  static
  {
    System.loadLibrary("qalcodecwrapper");
    System.loadLibrary("qalmsfboot");
    a = new j();
    q = null;
  }
  
  public static byte a(char paramChar)
  {
    switch (paramChar)
    {
    case '0': 
    default: 
      return 0;
    case '1': 
      return 1;
    case '2': 
      return 2;
    case '3': 
      return 3;
    case '4': 
      return 4;
    case '5': 
      return 5;
    case '6': 
      return 6;
    case '7': 
      return 7;
    case '8': 
      return 8;
    case '9': 
      return 9;
    case 'A': 
    case 'a': 
      return 10;
    case 'B': 
    case 'b': 
      return 11;
    case 'C': 
    case 'c': 
      return 12;
    case 'D': 
    case 'd': 
      return 13;
    case 'E': 
    case 'e': 
      return 14;
    }
    return 15;
  }
  
  public static j a()
  {
    return a;
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    char[] arrayOfChar = new char[paramArrayOfByte.length * 2];
    int i1 = 0;
    while (i1 < paramArrayOfByte.length)
    {
      int i2 = paramArrayOfByte[i1] & 0xFF;
      arrayOfChar[(i1 * 2)] = A[(i2 >>> 4)];
      arrayOfChar[(i1 * 2 + 1)] = A[(i2 & 0xF)];
      i1 += 1;
    }
    return new String(arrayOfChar);
  }
  
  public static void a(String paramString, int paramInt)
  {
    FromServiceMsg localFromServiceMsg = new FromServiceMsg("0", "cmd_pushSetConfig");
    localFromServiceMsg.setAppId(paramInt);
    localFromServiceMsg.setMsfCommand(MsfCommand.pushSetConfig);
    MsfSdkUtils.addFromMsgProcessName(paramString, localFromServiceMsg);
    localFromServiceMsg.addAttribute("_attr_socket_connstate", Integer.valueOf(NetConnInfoCenter.socketConnState));
    localFromServiceMsg.addAttribute("_attr_server", Long.valueOf(NetConnInfoCenter.servetTimeSecondInterv));
    localFromServiceMsg.setMsgSuccess();
    com.tencent.qalsdk.service.c.a("*", null, localFromServiceMsg);
  }
  
  public static byte[] a(FromServiceMsg paramFromServiceMsg)
  {
    byte[] arrayOfByte = paramFromServiceMsg.getWupBuffer();
    paramFromServiceMsg = null;
    if (arrayOfByte.length - 4 >= 0)
    {
      paramFromServiceMsg = new byte[arrayOfByte.length - 4];
      System.arraycopy(arrayOfByte, 4, paramFromServiceMsg, 0, arrayOfByte.length - 4);
    }
    return paramFromServiceMsg;
  }
  
  public static byte[] a(String paramString)
  {
    int i2 = 0;
    int i3 = paramString.length() / 2;
    byte[] arrayOfByte = new byte[i3];
    int i1 = 0;
    while (i2 < i3)
    {
      arrayOfByte[i1] = ((byte)(a(paramString.charAt(i2 * 2)) << 4 | a(paramString.charAt(i2 * 2 + 1))));
      i2 += 1;
      i1 += 1;
    }
    return arrayOfByte;
  }
  
  public static int f()
  {
    try
    {
      int i1 = B.incrementAndGet();
      if (i1 > 1000000) {
        B.set(new Random().nextInt(100000) + 60000);
      }
      return i1;
    }
    finally {}
  }
  
  private void o()
  {
    String str = l.a().getConfig("_key_set_log_level");
    if (str != null)
    {
      int i1 = Integer.parseInt(str);
      if ((i1 >= 1) && (i1 <= 5))
      {
        QLog.setOutputLogLevel(i1);
        QLog.i("MSF.C.MsfCore", "set saved log level:" + i1);
      }
    }
  }
  
  public int a(ToServiceMsg paramToServiceMsg)
  {
    if (paramToServiceMsg == null) {
      return -1;
    }
    this.c.b(paramToServiceMsg);
    return paramToServiceMsg.getRequestSsoSeq();
  }
  
  public void a(int paramInt)
  {
    l.a().setConfig("_key_set_log_level", String.valueOf(paramInt));
  }
  
  public void a(ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg)
  {
    if (paramToServiceMsg != null)
    {
      String str;
      if (paramToServiceMsg.getAttributes().containsKey("to_login_changeuin"))
      {
        str = (String)paramToServiceMsg.getAttribute("to_login_changeuin");
        paramFromServiceMsg.addAttribute("to_login_changeuin", paramFromServiceMsg.getUin());
        paramToServiceMsg.setUin(str);
      }
      if (paramToServiceMsg.getAttributes().containsKey("to_srcCmd"))
      {
        str = (String)paramToServiceMsg.getAttribute("to_srcCmd");
        paramToServiceMsg.setServiceCmd(str);
        paramFromServiceMsg.setServiceCmd(str);
      }
    }
    if ((paramToServiceMsg == null) && (paramFromServiceMsg.isSuccess()) && (!paramFromServiceMsg.getUin().equals("0")) && (0 != 0)) {
      paramFromServiceMsg.addAttribute("__attribute_tag_sid", null);
    }
    if (paramToServiceMsg != null) {
      paramToServiceMsg.getAttributes().remove("to_timeoutCallbacker");
    }
    paramFromServiceMsg.addAttribute("__timestamp_msf2app", Long.valueOf(System.currentTimeMillis()));
    QLog.d("MSF.C.MsfCore", 4, "recv msg.ssoCmd:" + paramFromServiceMsg.getServiceCmd() + " ssoSeq:" + paramFromServiceMsg.getRequestSsoSeq());
    this.j.add(new w(paramToServiceMsg, paramFromServiceMsg));
  }
  
  /* Error */
  public boolean a(Context paramContext, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc 15
    //   2: iconst_1
    //   3: ldc_w 377
    //   6: invokestatic 365	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   9: aload_0
    //   10: aload_1
    //   11: putfield 142	com/tencent/qalsdk/core/j:r	Landroid/content/Context;
    //   14: aload_0
    //   15: new 270	java/lang/StringBuilder
    //   18: dup
    //   19: invokespecial 271	java/lang/StringBuilder:<init>	()V
    //   22: aload_1
    //   23: invokevirtual 383	android/content/Context:getFilesDir	()Ljava/io/File;
    //   26: invokevirtual 388	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   29: invokevirtual 277	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: ldc_w 390
    //   35: invokevirtual 277	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: invokevirtual 284	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   41: putfield 104	com/tencent/qalsdk/core/j:g	Ljava/lang/String;
    //   44: aload_0
    //   45: new 270	java/lang/StringBuilder
    //   48: dup
    //   49: invokespecial 271	java/lang/StringBuilder:<init>	()V
    //   52: aload_0
    //   53: getfield 104	com/tencent/qalsdk/core/j:g	Ljava/lang/String;
    //   56: invokevirtual 277	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: ldc_w 392
    //   62: invokevirtual 277	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: invokevirtual 284	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   68: putfield 106	com/tencent/qalsdk/core/j:h	Ljava/lang/String;
    //   71: aload_1
    //   72: invokestatic 397	com/tencent/qalsdk/core/d:a	(Landroid/content/Context;)V
    //   75: new 385	java/io/File
    //   78: dup
    //   79: aload_0
    //   80: getfield 104	com/tencent/qalsdk/core/j:g	Ljava/lang/String;
    //   83: invokespecial 399	java/io/File:<init>	(Ljava/lang/String;)V
    //   86: astore_3
    //   87: aload_3
    //   88: invokevirtual 402	java/io/File:exists	()Z
    //   91: ifne +8 -> 99
    //   94: aload_3
    //   95: invokevirtual 405	java/io/File:mkdirs	()Z
    //   98: pop
    //   99: aload_1
    //   100: invokestatic 408	com/tencent/qalsdk/core/k:a	(Landroid/content/Context;)V
    //   103: aload_0
    //   104: new 250	com/tencent/qalsdk/core/l
    //   107: dup
    //   108: invokespecial 409	com/tencent/qalsdk/core/l:<init>	()V
    //   111: putfield 411	com/tencent/qalsdk/core/j:b	Lcom/tencent/qalsdk/core/l;
    //   114: aload_0
    //   115: getfield 411	com/tencent/qalsdk/core/j:b	Lcom/tencent/qalsdk/core/l;
    //   118: aload_1
    //   119: invokevirtual 414	com/tencent/qalsdk/core/l:a	(Landroid/content/Context;)Z
    //   122: ifne +44 -> 166
    //   125: ldc 15
    //   127: iconst_1
    //   128: ldc_w 416
    //   131: invokestatic 418	com/tencent/qalsdk/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   134: iconst_0
    //   135: ireturn
    //   136: astore_3
    //   137: ldc 15
    //   139: iconst_1
    //   140: new 270	java/lang/StringBuilder
    //   143: dup
    //   144: invokespecial 271	java/lang/StringBuilder:<init>	()V
    //   147: ldc_w 420
    //   150: invokevirtual 277	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: aload_3
    //   154: invokevirtual 423	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   157: invokevirtual 284	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   160: invokestatic 418	com/tencent/qalsdk/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   163: goto -64 -> 99
    //   166: aload_0
    //   167: invokespecial 425	com/tencent/qalsdk/core/j:o	()V
    //   170: aload_0
    //   171: new 427	com/tencent/qalsdk/core/a
    //   174: dup
    //   175: invokespecial 428	com/tencent/qalsdk/core/a:<init>	()V
    //   178: putfield 430	com/tencent/qalsdk/core/j:u	Lcom/tencent/qalsdk/core/a;
    //   181: aload_0
    //   182: getfield 430	com/tencent/qalsdk/core/j:u	Lcom/tencent/qalsdk/core/a;
    //   185: invokevirtual 432	com/tencent/qalsdk/core/a:a	()V
    //   188: aload_0
    //   189: new 434	com/tencent/qalsdk/core/q
    //   192: dup
    //   193: aload_0
    //   194: invokespecial 437	com/tencent/qalsdk/core/q:<init>	(Lcom/tencent/qalsdk/core/j;)V
    //   197: putfield 439	com/tencent/qalsdk/core/j:w	Lcom/tencent/qalsdk/core/q;
    //   200: aload_0
    //   201: new 441	com/tencent/qalsdk/core/i
    //   204: dup
    //   205: aload_0
    //   206: invokespecial 442	com/tencent/qalsdk/core/i:<init>	(Lcom/tencent/qalsdk/core/j;)V
    //   209: putfield 444	com/tencent/qalsdk/core/j:k	Lcom/tencent/qalsdk/core/i;
    //   212: aload_0
    //   213: getfield 444	com/tencent/qalsdk/core/j:k	Lcom/tencent/qalsdk/core/i;
    //   216: invokevirtual 445	com/tencent/qalsdk/core/i:a	()V
    //   219: aload_0
    //   220: new 447	qalsdk/ah
    //   223: dup
    //   224: aload_0
    //   225: invokespecial 448	qalsdk/ah:<init>	(Lcom/tencent/qalsdk/core/j;)V
    //   228: putfield 450	com/tencent/qalsdk/core/j:e	Lqalsdk/ah;
    //   231: aload_0
    //   232: getfield 450	com/tencent/qalsdk/core/j:e	Lqalsdk/ah;
    //   235: invokevirtual 451	qalsdk/ah:a	()V
    //   238: aload_0
    //   239: new 453	qalsdk/ak
    //   242: dup
    //   243: aload_0
    //   244: invokespecial 454	qalsdk/ak:<init>	(Lcom/tencent/qalsdk/core/j;)V
    //   247: putfield 456	com/tencent/qalsdk/core/j:f	Lqalsdk/ak;
    //   250: aload_0
    //   251: getfield 456	com/tencent/qalsdk/core/j:f	Lqalsdk/ak;
    //   254: invokevirtual 457	qalsdk/ak:a	()V
    //   257: aload_0
    //   258: new 186	com/tencent/qalsdk/core/NetConnInfoCenter
    //   261: dup
    //   262: invokespecial 458	com/tencent/qalsdk/core/NetConnInfoCenter:<init>	()V
    //   265: putfield 460	com/tencent/qalsdk/core/j:p	Lcom/tencent/qalsdk/core/NetConnInfoCenter;
    //   268: aload_0
    //   269: invokestatic 463	com/tencent/qalsdk/core/NetConnInfoCenter:init	(Lcom/tencent/qalsdk/core/j;)V
    //   272: aload_1
    //   273: iconst_1
    //   274: invokestatic 467	com/tencent/qalsdk/core/NetConnInfoCenter:checkConnInfo	(Landroid/content/Context;Z)V
    //   277: aload_0
    //   278: new 469	qalsdk/u
    //   281: dup
    //   282: invokespecial 470	qalsdk/u:<init>	()V
    //   285: putfield 472	com/tencent/qalsdk/core/j:o	Lqalsdk/u;
    //   288: aload_0
    //   289: new 291	com/tencent/qalsdk/core/o
    //   292: dup
    //   293: aload_0
    //   294: invokespecial 473	com/tencent/qalsdk/core/o:<init>	(Lcom/tencent/qalsdk/core/j;)V
    //   297: putfield 289	com/tencent/qalsdk/core/j:c	Lcom/tencent/qalsdk/core/o;
    //   300: aload_0
    //   301: getfield 289	com/tencent/qalsdk/core/j:c	Lcom/tencent/qalsdk/core/o;
    //   304: aload_1
    //   305: invokevirtual 474	com/tencent/qalsdk/core/o:a	(Landroid/content/Context;)Z
    //   308: ifne +193 -> 501
    //   311: ldc 15
    //   313: iconst_1
    //   314: ldc_w 476
    //   317: invokestatic 418	com/tencent/qalsdk/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   320: iconst_0
    //   321: ireturn
    //   322: astore_1
    //   323: ldc 15
    //   325: iconst_1
    //   326: new 270	java/lang/StringBuilder
    //   329: dup
    //   330: invokespecial 271	java/lang/StringBuilder:<init>	()V
    //   333: ldc_w 478
    //   336: invokevirtual 277	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   339: aload_1
    //   340: invokevirtual 423	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   343: invokevirtual 284	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   346: invokestatic 418	com/tencent/qalsdk/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   349: iconst_0
    //   350: ireturn
    //   351: astore_1
    //   352: ldc 15
    //   354: iconst_1
    //   355: new 270	java/lang/StringBuilder
    //   358: dup
    //   359: invokespecial 271	java/lang/StringBuilder:<init>	()V
    //   362: ldc_w 480
    //   365: invokevirtual 277	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   368: aload_1
    //   369: invokevirtual 423	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   372: invokevirtual 284	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   375: invokestatic 418	com/tencent/qalsdk/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   378: iconst_0
    //   379: ireturn
    //   380: astore_3
    //   381: ldc 15
    //   383: iconst_1
    //   384: new 270	java/lang/StringBuilder
    //   387: dup
    //   388: invokespecial 271	java/lang/StringBuilder:<init>	()V
    //   391: ldc_w 482
    //   394: invokevirtual 277	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   397: aload_3
    //   398: invokevirtual 423	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   401: invokevirtual 284	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   404: invokestatic 418	com/tencent/qalsdk/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   407: goto -188 -> 219
    //   410: astore_3
    //   411: ldc 15
    //   413: iconst_1
    //   414: new 270	java/lang/StringBuilder
    //   417: dup
    //   418: invokespecial 271	java/lang/StringBuilder:<init>	()V
    //   421: ldc_w 484
    //   424: invokevirtual 277	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   427: aload_3
    //   428: invokevirtual 423	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   431: invokevirtual 284	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   434: invokestatic 418	com/tencent/qalsdk/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   437: goto -199 -> 238
    //   440: astore_3
    //   441: ldc 15
    //   443: iconst_1
    //   444: new 270	java/lang/StringBuilder
    //   447: dup
    //   448: invokespecial 271	java/lang/StringBuilder:<init>	()V
    //   451: ldc_w 486
    //   454: invokevirtual 277	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   457: aload_3
    //   458: invokevirtual 423	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   461: invokevirtual 284	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   464: invokestatic 418	com/tencent/qalsdk/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   467: goto -210 -> 257
    //   470: astore_3
    //   471: ldc 15
    //   473: iconst_1
    //   474: new 270	java/lang/StringBuilder
    //   477: dup
    //   478: invokespecial 271	java/lang/StringBuilder:<init>	()V
    //   481: ldc_w 488
    //   484: invokevirtual 277	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   487: aload_3
    //   488: invokevirtual 423	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   491: invokevirtual 284	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   494: aload_3
    //   495: invokestatic 491	com/tencent/qalsdk/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   498: goto -221 -> 277
    //   501: ldc 15
    //   503: iconst_1
    //   504: ldc_w 493
    //   507: invokestatic 365	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   510: aload_0
    //   511: new 495	qalsdk/aj
    //   514: dup
    //   515: aload_0
    //   516: invokespecial 496	qalsdk/aj:<init>	(Lcom/tencent/qalsdk/core/j;)V
    //   519: putfield 498	com/tencent/qalsdk/core/j:d	Lqalsdk/aj;
    //   522: aload_0
    //   523: getfield 498	com/tencent/qalsdk/core/j:d	Lqalsdk/aj;
    //   526: aload_1
    //   527: iload_2
    //   528: invokevirtual 500	qalsdk/aj:a	(Landroid/content/Context;Z)V
    //   531: aload_0
    //   532: getfield 138	com/tencent/qalsdk/core/j:n	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   535: iconst_1
    //   536: invokevirtual 502	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   539: ldc 15
    //   541: iconst_1
    //   542: ldc_w 504
    //   545: invokestatic 365	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   548: iconst_1
    //   549: ireturn
    //   550: astore_1
    //   551: ldc 15
    //   553: iconst_1
    //   554: new 270	java/lang/StringBuilder
    //   557: dup
    //   558: invokespecial 271	java/lang/StringBuilder:<init>	()V
    //   561: ldc_w 506
    //   564: invokevirtual 277	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   567: aload_1
    //   568: invokevirtual 510	java/lang/Exception:getStackTrace	()[Ljava/lang/StackTraceElement;
    //   571: invokevirtual 423	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   574: invokevirtual 284	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   577: invokestatic 418	com/tencent/qalsdk/util/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   580: goto -49 -> 531
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	583	0	this	j
    //   0	583	1	paramContext	Context
    //   0	583	2	paramBoolean	boolean
    //   86	9	3	localFile	java.io.File
    //   136	18	3	localException1	Exception
    //   380	18	3	localException2	Exception
    //   410	18	3	localException3	Exception
    //   440	18	3	localException4	Exception
    //   470	25	3	localException5	Exception
    // Exception table:
    //   from	to	target	type
    //   75	99	136	java/lang/Exception
    //   288	320	322	java/lang/Exception
    //   501	510	322	java/lang/Exception
    //   103	134	351	java/lang/Exception
    //   166	170	351	java/lang/Exception
    //   200	219	380	java/lang/Exception
    //   219	238	410	java/lang/Exception
    //   238	257	440	java/lang/Exception
    //   257	277	470	java/lang/Exception
    //   510	531	550	java/lang/Exception
  }
  
  public int b(String paramString)
  {
    return this.d.a(paramString);
  }
  
  public a b()
  {
    return this.u;
  }
  
  public void b(ToServiceMsg paramToServiceMsg)
  {
    com.tencent.qalsdk.sdk.a locala = ai.c(paramToServiceMsg);
    this.u.a(locala);
    this.i = locala.b;
    this.d.a(paramToServiceMsg, qalsdk.o.b);
  }
  
  public void c(ToServiceMsg paramToServiceMsg)
  {
    com.tencent.qalsdk.sdk.ah localah = ai.b(paramToServiceMsg);
    this.d.a(localah, paramToServiceMsg);
    this.u.a(paramToServiceMsg.getUin());
  }
  
  public byte[] c()
  {
    return d.a();
  }
  
  public u d()
  {
    return this.o;
  }
  
  public void d(ToServiceMsg paramToServiceMsg)
  {
    this.d.a(paramToServiceMsg);
  }
  
  public LinkedBlockingQueue<w> e()
  {
    return this.j;
  }
  
  public void e(ToServiceMsg paramToServiceMsg)
  {
    com.tencent.qalsdk.sdk.c localc = ai.a(paramToServiceMsg);
    this.d.b(localc, paramToServiceMsg);
  }
  
  public void f(ToServiceMsg paramToServiceMsg)
  {
    com.tencent.qalsdk.sdk.c localc = ai.a(paramToServiceMsg);
    this.d.a(localc, paramToServiceMsg);
  }
  
  public q g()
  {
    return this.w;
  }
  
  public void g(ToServiceMsg paramToServiceMsg)
  {
    this.c.b(paramToServiceMsg);
  }
  
  public ak h()
  {
    return this.f;
  }
  
  public int i()
  {
    return this.v;
  }
  
  public void j()
  {
    this.t.set(true);
  }
  
  public void k()
  {
    this.t.set(false);
  }
  
  public boolean l()
  {
    return this.t.get();
  }
  
  public i m()
  {
    return this.k;
  }
  
  public int n()
  {
    return this.z;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\core\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */