package qalsdk;

import android.content.Context;
import android.net.Proxy;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.tencent.qalsdk.base.CloseConnReason;
import com.tencent.qalsdk.base.remote.FromServiceMsg;
import com.tencent.qalsdk.base.remote.ToServiceMsg;
import com.tencent.qalsdk.core.NetConnInfoCenter;
import com.tencent.qalsdk.core.c;
import com.tencent.qalsdk.core.j;
import com.tencent.qalsdk.core.m;
import com.tencent.qalsdk.core.o;
import com.tencent.qalsdk.sdk.MsfCommand;
import com.tencent.qalsdk.util.QLog;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class av
{
  private static String A = "UTF-8";
  public static String y = "";
  Runnable a = null;
  j b;
  public i c;
  String d = "";
  String[] e = null;
  String[] f = null;
  long g = 0L;
  ArrayList<al> h = new ArrayList();
  long i = 0L;
  long j = 0L;
  long k = 0L;
  public AtomicBoolean l = new AtomicBoolean(false);
  public int m = 2;
  ArrayList<aw> n = new ArrayList();
  ArrayList<aw> o = new ArrayList();
  Thread p = null;
  long q = 0L;
  boolean r = false;
  long s = 0L;
  AtomicBoolean t = new AtomicBoolean(false);
  int u = 0;
  boolean v = false;
  boolean w = false;
  long x = 0L;
  private at z = null;
  
  public av(j paramj)
  {
    this.b = paramj;
    this.z = new at(paramj, true);
    this.c = new e(paramj);
  }
  
  private al a(ArrayList<al> paramArrayList, boolean paramBoolean, c paramc)
  {
    al localal = new al();
    localal.i = System.currentTimeMillis();
    localal.b = paramc.a();
    localal.g = m.n();
    localal.j = 0;
    localal.k = 0;
    localal.l = 0;
    localal.m = 0;
    a(paramc, paramBoolean, localal);
    paramArrayList.add(localal);
    return localal;
  }
  
  private void a(c paramc, boolean paramBoolean, al paramal)
  {
    if (paramc.b().equalsIgnoreCase("http")) {
      this.z.a(paramc, 2048, 30000, new am(this.b), paramBoolean, paramal);
    }
    for (;;)
    {
      y = paramal.f;
      return;
      this.z.a(paramc, 2048, 30000, new bc(this.b), paramBoolean, paramal);
    }
  }
  
  private boolean a(CopyOnWriteArrayList<c> paramCopyOnWriteArrayList1, CopyOnWriteArrayList<c> paramCopyOnWriteArrayList2, ArrayList<al> paramArrayList, boolean paramBoolean)
  {
    if (QLog.isColorLevel()) {
      QLog.d("MSF.C.NetConnTag", 2, "NetChanged selectAndConnect...");
    }
    int i1 = 1;
    int i2;
    label49:
    int i3;
    label199:
    label253:
    label329:
    label367:
    int i4;
    for (;;)
    {
      if (i1 != 0)
      {
        if (QLog.isColorLevel()) {
          QLog.d("MSF.C.NetConnTag", 2, "NetChanged start connect...");
        }
        try
        {
          if (q())
          {
            i2 = 0;
            i1 = 0;
            if (i2 >= paramCopyOnWriteArrayList1.size()) {
              break label1073;
            }
            localObject = a(paramArrayList, paramBoolean, (c)paramCopyOnWriteArrayList1.get(i2));
            if (((al)localObject).e == bd.c)
            {
              if (!this.t.get()) {
                break label1091;
              }
              this.t.set(false);
              return true;
            }
            if (((al)localObject).e == bd.m)
            {
              i2 -= 1;
              i3 = i1 + 1;
              i1 = i3;
              if (i3 > 2)
              {
                this.t.set(false);
                return false;
              }
            }
            else
            {
              if (((((al)localObject).e != bd.t) && (((al)localObject).e != bd.q)) || (i2 != 0) || (this.t.get())) {
                break label1093;
              }
              b(((al)localObject).b);
              break label1093;
            }
            if (((al)localObject).h <= 0) {
              break label1102;
            }
            Thread.sleep(((al)localObject).h);
            if (q()) {
              break label1102;
            }
            if (!QLog.isColorLevel()) {
              break label1096;
            }
            QLog.d("MSF.C.NetConnTag", 2, "NetChanged from wifi to mobile connect again");
            break label1096;
          }
          if (p() == null) {
            break label794;
          }
          i2 = 0;
          i1 = 0;
          if (i2 >= paramCopyOnWriteArrayList2.size()) {
            break label1085;
          }
          Object localObject = (c)paramCopyOnWriteArrayList2.get(i2);
          if (((c)localObject).g != 1) {
            break label623;
          }
          localObject = a(paramArrayList, paramBoolean, (c)localObject);
          if (((al)localObject).e != bd.c) {
            break label367;
          }
          if (!this.t.get()) {
            break label1091;
          }
          this.t.set(false);
          return true;
        }
        catch (Exception localException1)
        {
          i1 = 0;
        }
        if (QLog.isColorLevel()) {
          QLog.d("MSF.C.NetConnTag", 2, "selectAndConnect error " + localException1, localException1);
        }
        continue;
        bd localbd1 = localException1.e;
        bd localbd2 = bd.m;
        if (localbd1 == localbd2)
        {
          i4 = i2 - 1;
          i1 += 1;
          i3 = i1;
          if (i1 <= 2) {
            break label562;
          }
          i1 = 0;
          label411:
          i4 = 0;
        }
        for (i3 = 0;; i3 = i2)
        {
          i2 = i1;
          try
          {
            if (i4 >= paramCopyOnWriteArrayList2.size()) {
              break label774;
            }
            al localal1 = a(paramArrayList, paramBoolean, (c)paramCopyOnWriteArrayList2.get(i4));
            if (localal1.e != bd.c) {
              break label632;
            }
            if (!this.t.get()) {
              break label1091;
            }
            this.t.set(false);
            return true;
          }
          catch (Exception localException2) {}
          break label329;
          if (localException2.e != bd.t)
          {
            i4 = i2;
            i3 = i1;
            if (localException2.e != bd.q) {}
          }
          else
          {
            i4 = i2;
            i3 = i1;
            if (i2 == 0)
            {
              i4 = i2;
              i3 = i1;
              if (!this.t.get())
              {
                b(localException2.b);
                i3 = i1;
                i4 = i2;
              }
            }
          }
          label562:
          i2 = i4;
          i1 = i3;
          if (localException2.h > 0)
          {
            Thread.sleep(localException2.h);
            i2 = i4;
            i1 = i3;
            if (q())
            {
              if (QLog.isColorLevel()) {
                QLog.d("MSF.C.NetConnTag", 2, "NetChanged from mobile to wifi connect again");
              }
              i1 = 1;
              break label411;
            }
          }
          label623:
          i2 += 1;
          break label253;
          label632:
          if (localException2.e == bd.m)
          {
            i2 = i4 - 1;
            i4 = i3 + 1;
            i3 = i2;
            i2 = i4;
            if (i4 > 2)
            {
              this.t.set(false);
              return false;
            }
          }
          else
          {
            if (((localException2.e != bd.t) && (localException2.e != bd.q)) || (i4 != 0) || (this.t.get())) {
              break label1111;
            }
            b(localException2.b);
            break label1111;
          }
          label728:
          if (localException2.h > 0)
          {
            Thread.sleep(localException2.h);
            boolean bool = q();
            if (!bool) {}
          }
          try
          {
            if (!QLog.isColorLevel()) {
              break label1079;
            }
            QLog.d("MSF.C.NetConnTag", 2, "NetChanged from mobile to wifi connect again");
            i2 = 1;
            label774:
            i1 = i2;
          }
          catch (Exception localException3)
          {
            al localal2;
            i1 = 1;
          }
          i4 = i3 + 1;
        }
        label794:
        i2 = 0;
        i1 = 0;
        label800:
        if (i2 >= paramCopyOnWriteArrayList2.size()) {
          break label1073;
        }
        localal2 = a(paramArrayList, paramBoolean, (c)paramCopyOnWriteArrayList2.get(i2));
        if (localal2.e == bd.c)
        {
          if (!this.t.get()) {
            break label1091;
          }
          this.t.set(false);
          return true;
        }
        if (localal2.e == bd.m)
        {
          i2 -= 1;
          i3 = i1 + 1;
          i1 = i3;
          if (i3 > 2)
          {
            this.t.set(false);
            return false;
          }
        }
        else
        {
          if (((localal2.e != bd.t) && (localal2.e != bd.q)) || (i2 != 0) || (this.t.get())) {
            break label1122;
          }
          b(localal2.b);
          break label1122;
        }
      }
    }
    label1073:
    label1079:
    label1085:
    label1091:
    label1093:
    label1096:
    label1102:
    label1111:
    label1122:
    for (;;)
    {
      if (localal2.h > 0)
      {
        Thread.sleep(localal2.h);
        if (q())
        {
          if (QLog.isColorLevel()) {
            QLog.d("MSF.C.NetConnTag", 2, "NetChanged from mobile to wifi connect again");
          }
          i1 = 1;
          break;
        }
      }
      i2 += 1;
      break label800;
      if ((this.t.get()) && (this.v) && (!this.w) && (this.o.size() > 0))
      {
        this.t.set(false);
        this.v = false;
        this.w = false;
        this.o.clear();
      }
      return false;
      break label329;
      i1 = 0;
      break;
      i2 = 1;
      break label774;
      i1 = 0;
      break label411;
      return true;
      break label199;
      i1 = 1;
      break;
      i2 += 1;
      break label49;
      i2 = i3;
      i3 = i4;
      break label728;
    }
  }
  
  private int b(int paramInt1, int paramInt2, String paramString1, String paramString2, MsfCommand paramMsfCommand, String paramString3, int paramInt3, byte[] paramArrayOfByte)
  {
    if (!this.z.n.get()) {
      e();
    }
    return this.z.a(paramInt1, paramInt2, paramInt3, paramString3, paramString1, paramString2, paramMsfCommand, paramArrayOfByte);
  }
  
  /* Error */
  private static void b(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_1
    //   4: invokestatic 201	com/tencent/qalsdk/util/QLog:isColorLevel	()Z
    //   7: ifeq +12 -> 19
    //   10: ldc -53
    //   12: iconst_2
    //   13: ldc_w 294
    //   16: invokestatic 208	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   19: aload_0
    //   20: invokevirtual 300	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   23: ldc_w 302
    //   26: invokevirtual 308	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   29: astore_3
    //   30: aload_3
    //   31: astore_1
    //   32: new 310	java/io/FileOutputStream
    //   35: dup
    //   36: new 261	java/lang/StringBuilder
    //   39: dup
    //   40: invokespecial 262	java/lang/StringBuilder:<init>	()V
    //   43: aload_0
    //   44: invokevirtual 314	android/content/Context:getFilesDir	()Ljava/io/File;
    //   47: invokevirtual 319	java/io/File:getParent	()Ljava/lang/String;
    //   50: invokevirtual 268	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: ldc_w 321
    //   56: invokevirtual 268	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: invokevirtual 274	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   62: invokespecial 323	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   65: astore_0
    //   66: sipush 1024
    //   69: newarray <illegal type>
    //   71: astore_2
    //   72: aload_1
    //   73: aload_2
    //   74: invokevirtual 329	java/io/InputStream:read	([B)I
    //   77: istore 4
    //   79: iload 4
    //   81: ifle +65 -> 146
    //   84: aload_0
    //   85: aload_2
    //   86: iconst_0
    //   87: iload 4
    //   89: invokevirtual 335	java/io/OutputStream:write	([BII)V
    //   92: goto -20 -> 72
    //   95: astore_2
    //   96: invokestatic 201	com/tencent/qalsdk/util/QLog:isColorLevel	()Z
    //   99: ifeq +30 -> 129
    //   102: ldc -53
    //   104: iconst_2
    //   105: new 261	java/lang/StringBuilder
    //   108: dup
    //   109: invokespecial 262	java/lang/StringBuilder:<init>	()V
    //   112: ldc_w 337
    //   115: invokevirtual 268	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   118: aload_2
    //   119: invokevirtual 271	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   122: invokevirtual 274	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   125: aload_2
    //   126: invokestatic 277	com/tencent/qalsdk/util/QLog:d	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V
    //   129: aload_1
    //   130: ifnull +7 -> 137
    //   133: aload_1
    //   134: invokevirtual 340	java/io/InputStream:close	()V
    //   137: aload_0
    //   138: ifnull +7 -> 145
    //   141: aload_0
    //   142: invokevirtual 341	java/io/OutputStream:close	()V
    //   145: return
    //   146: aload_1
    //   147: ifnull +7 -> 154
    //   150: aload_1
    //   151: invokevirtual 340	java/io/InputStream:close	()V
    //   154: aload_0
    //   155: ifnull -10 -> 145
    //   158: aload_0
    //   159: invokevirtual 341	java/io/OutputStream:close	()V
    //   162: return
    //   163: astore_0
    //   164: aconst_null
    //   165: astore_1
    //   166: aload_1
    //   167: ifnull +7 -> 174
    //   170: aload_1
    //   171: invokevirtual 340	java/io/InputStream:close	()V
    //   174: aload_2
    //   175: ifnull +7 -> 182
    //   178: aload_2
    //   179: invokevirtual 341	java/io/OutputStream:close	()V
    //   182: aload_0
    //   183: athrow
    //   184: astore_0
    //   185: goto -19 -> 166
    //   188: astore_3
    //   189: aload_0
    //   190: astore_2
    //   191: aload_3
    //   192: astore_0
    //   193: goto -27 -> 166
    //   196: astore_3
    //   197: aload_0
    //   198: astore_2
    //   199: aload_3
    //   200: astore_0
    //   201: goto -35 -> 166
    //   204: astore_2
    //   205: aconst_null
    //   206: astore_0
    //   207: goto -111 -> 96
    //   210: astore_2
    //   211: aconst_null
    //   212: astore_0
    //   213: goto -117 -> 96
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	216	0	paramContext	Context
    //   3	168	1	localObject1	Object
    //   1	85	2	arrayOfByte	byte[]
    //   95	84	2	localException1	Exception
    //   190	9	2	localContext	Context
    //   204	1	2	localException2	Exception
    //   210	1	2	localException3	Exception
    //   29	2	3	localInputStream	java.io.InputStream
    //   188	4	3	localObject2	Object
    //   196	4	3	localObject3	Object
    //   77	11	4	i1	int
    // Exception table:
    //   from	to	target	type
    //   66	72	95	java/lang/Exception
    //   72	79	95	java/lang/Exception
    //   84	92	95	java/lang/Exception
    //   19	30	163	finally
    //   32	66	184	finally
    //   66	72	188	finally
    //   72	79	188	finally
    //   84	92	188	finally
    //   96	129	196	finally
    //   19	30	204	java/lang/Exception
    //   32	66	210	java/lang/Exception
  }
  
  public static boolean h()
  {
    return i() != null;
  }
  
  public static String i()
  {
    try
    {
      localBufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("ps").getInputStream()));
      localObject = localBufferedReader.readLine().split("\\s+");
      i4 = localObject.length;
      i2 = 0;
      i3 = 1;
      i1 = 0;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        BufferedReader localBufferedReader;
        Object localObject;
        int i4;
        int i2;
        int i3;
        int i1;
        if (QLog.isColorLevel())
        {
          QLog.d("MSF.C.NetConnTag", 2, "Error killing tcpdump, msg=" + localIOException.getMessage());
          continue;
          i2 += 1;
          i1 += 1;
        }
      }
    }
    if (i2 < i4)
    {
      if (localObject[i2].equalsIgnoreCase("PID")) {
        i3 = i1;
      }
    }
    else
    {
      do
      {
        localObject = localBufferedReader.readLine();
        if (localObject == null) {
          break;
        }
      } while ((!((String)localObject).contains(j.a().r.getFilesDir().getParent() + "/txlib/" + "tcpdump")) || (((String)localObject).contains("sh -c")));
      localObject = ((String)localObject).split("\\s+");
      if (QLog.isColorLevel()) {
        QLog.d("MSF.C.NetConnTag", 2, "tcpdump uid:" + localObject[i3]);
      }
      localBufferedReader.close();
      return localObject[i3];
      localBufferedReader.close();
      return null;
    }
  }
  
  public static void j()
  {
    if (QLog.isColorLevel()) {
      QLog.d("MSF.C.NetConnTag", 2, "tcpdump: stopTCPDump begin");
    }
    try
    {
      Object localObject = i();
      if (localObject == null)
      {
        if (QLog.isColorLevel()) {
          QLog.d("MSF.C.NetConnTag", 2, "tcpdump: stopTCPDump pid not find");
        }
      }
      else
      {
        localObject = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(new String[] { "su", "-c", "kill " + (String)localObject }).getErrorStream()));
        for (;;)
        {
          String str = ((BufferedReader)localObject).readLine();
          if (str == null) {
            break;
          }
          if (QLog.isColorLevel()) {
            QLog.d("MSF.C.NetConnTag", 2, "tcpdump kill error=" + str);
          }
        }
      }
      return;
    }
    catch (IOException localIOException)
    {
      if (QLog.isColorLevel())
      {
        QLog.d("MSF.C.NetConnTag", 2, "tcpdump Error killing tcpdump, msg=" + localIOException.getMessage());
        return;
        localIOException.close();
      }
    }
  }
  
  private String p()
  {
    if (Build.VERSION.SDK_INT >= 14) {
      return System.getProperty("http.proxyHost");
    }
    return Proxy.getDefaultHost();
  }
  
  private boolean q()
  {
    return (m.e()) || ((!m.d()) && (m.l() == null));
  }
  
  public void a(CloseConnReason paramCloseConnReason)
  {
    this.z.a(paramCloseConnReason);
  }
  
  public void a(FromServiceMsg paramFromServiceMsg, ToServiceMsg paramToServiceMsg)
  {
    long l1;
    if (this.i != 0L)
    {
      if (QLog.isColorLevel()) {
        QLog.d("MSF.C.NetConnTag", 2, "firstResponseGetted getted Report now");
      }
      l1 = -1L;
      if (this.j >= this.i) {
        l1 = this.j - this.i;
      }
      if (paramFromServiceMsg.getAttribute("__timestamp_net2msf") == null)
      {
        if (QLog.isColorLevel()) {
          QLog.d("MSF.C.NetConnTag", 2, "from msg TIMESTAMP_NET2MSF not find return");
        }
        b();
      }
    }
    else
    {
      return;
    }
    ((Long)paramFromServiceMsg.getAttribute("__timestamp_net2msf")).longValue();
    long l2 = this.j;
    if (paramToServiceMsg.getAttribute("__timestamp_msf2net") == null) {
      if (QLog.isColorLevel()) {
        QLog.d("MSF.C.NetConnTag", 2, "to msg TIMESTAMP_MSF2NET not find set nFirstPacketTimeElapse to 0");
      }
    }
    for (;;)
    {
      if ((!paramFromServiceMsg.getServiceCmd().equals("login.auth")) || (this.h.size() > 0))
      {
        paramFromServiceMsg = (al)this.h.get(this.h.size() - 1);
        paramFromServiceMsg.m = 1;
        paramFromServiceMsg.l = 1;
        this.b.d().a(1, l1, this.h, this.m);
      }
      b();
      NetConnInfoCenter.onRecvFirstResp();
      return;
      l2 = ((Long)paramToServiceMsg.getAttribute("__timestamp_msf2net")).longValue();
      long l3 = ((Long)paramFromServiceMsg.getAttribute("__timestamp_net2msf")).longValue() - l2;
      if (((l3 < 0L) || (l2 == 0L)) && (QLog.isColorLevel())) {
        QLog.d("MSF.C.NetConnTag", 2, "nFirstPacketTimeElapse:" + l3 + " reset 0 now TIMESTAMP_NET2MSF:" + this.b.m.format(paramFromServiceMsg.getAttribute("__timestamp_net2msf")) + " TIMESTAMP_MSF2NET:" + this.b.m.format(paramToServiceMsg.getAttribute("__timestamp_msf2net")));
      }
    }
  }
  
  public void a(String paramString)
  {
    if (paramString != null)
    {
      this.d = paramString;
      com.tencent.qalsdk.base.a.ao = true;
    }
  }
  
  public void a(String paramString, int paramInt)
  {
    paramString = new ax(this, paramString, paramInt);
    paramString.setName("checkNetConnectBySocketThread");
    paramString.start();
  }
  
  public void a(String[] paramArrayOfString)
  {
    if (paramArrayOfString != null)
    {
      this.e = paramArrayOfString;
      com.tencent.qalsdk.base.a.ao = false;
    }
  }
  
  public boolean a()
  {
    return this.z.n.get();
  }
  
  public boolean a(int paramInt1, int paramInt2, String paramString1, String paramString2, MsfCommand paramMsfCommand, String paramString3, int paramInt3, byte[] paramArrayOfByte)
  {
    int i1 = b(paramInt1, paramInt2, paramString1, paramString2, paramMsfCommand, paramString3, paramInt3, paramArrayOfByte);
    if (i1 == -100)
    {
      e();
      if (this.z.a(paramInt1, paramInt2, paramInt3, paramString3, paramString1, paramString2, paramMsfCommand, paramArrayOfByte) == -100) {
        return false;
      }
      if ((this.k == 0L) && (this.i != 0L) && (this.j != 0L)) {
        this.k = System.currentTimeMillis();
      }
      return true;
    }
    if (i1 == 65336) {
      return true;
    }
    if ((this.k == 0L) && (this.i != 0L) && (this.j != 0L)) {
      this.k = System.currentTimeMillis();
    }
    return true;
  }
  
  public void b()
  {
    this.k = 0L;
    this.i = 0L;
    this.j = 0L;
    this.h.clear();
    this.m = 2;
    this.l.set(false);
    this.b.d().c();
    if (this.a != null)
    {
      this.b.m().a(this.a);
      this.a = null;
    }
  }
  
  public void b(String paramString)
  {
    long l1 = System.currentTimeMillis();
    if (l1 - this.q > 180000L)
    {
      k();
      this.q = l1;
      l();
      a("3gimg.qq.com", 80);
      a("120.33.50.146", 80);
      g();
      c(paramString.split(":")[0].trim());
    }
  }
  
  public void b(String[] paramArrayOfString)
  {
    if (paramArrayOfString != null)
    {
      this.f = paramArrayOfString;
      com.tencent.qalsdk.base.a.ao = false;
    }
  }
  
  public void c()
  {
    int i1 = 2;
    if (this.i != 0L)
    {
      if (QLog.isColorLevel()) {
        QLog.d("MSF.C.NetConnTag", 2, "loginConnectTimeOut Report now");
      }
      long l1 = -1L;
      if (this.j >= this.i)
      {
        if (this.k == 0L)
        {
          if (QLog.isColorLevel()) {
            QLog.d("MSF.C.NetConnTag", 2, "loginConnectTimeOut. m_firstPacketSendTimeAfterConnect == 0");
          }
          b();
          return;
        }
        l1 = this.j - this.i;
        this.b.c.a.c.c();
      }
      if (this.m == 1) {}
      for (;;)
      {
        this.b.d().a(i1, l1, this.h, this.m);
        b();
        return;
        i1 = 3;
      }
    }
    if (QLog.isColorLevel()) {
      QLog.d("MSF.C.NetConnTag", 2, "loginConnectTimeOut m_startConnectTime : " + this.i + "no need Report");
    }
    b();
  }
  
  public void c(String paramString)
  {
    paramString = new ba(this, paramString);
    paramString.setName("pingServerThread");
    paramString.start();
  }
  
  public void d()
  {
    if (this.h.size() > 0)
    {
      al localal = (al)this.h.get(this.h.size() - 1);
      if (localal != null)
      {
        localal.e = bd.y;
        localal.d = false;
        localal.l = 0;
        localal.m = 1;
      }
      f();
    }
  }
  
  protected boolean e()
  {
    if (((this.e != null) && (this.e.length > 0)) || ((this.f != null) && (this.f.length > 0))) {}
    Object localObject3;
    boolean bool1;
    label742:
    long l1;
    do
    {
      do
      {
        int i1;
        try
        {
          if (QLog.isColorLevel()) {
            QLog.d("MSF.C.NetConnTag", 2, "start to connect lmassigned server " + Arrays.toString(this.e) + " " + Arrays.toString(this.f));
          }
          this.i = System.currentTimeMillis();
          this.j = this.i;
          CopyOnWriteArrayList localCopyOnWriteArrayList = new CopyOnWriteArrayList();
          localObject2 = new CopyOnWriteArrayList();
          int i2;
          if (this.e != null)
          {
            localObject3 = this.e;
            i2 = localObject3.length;
            i1 = 0;
            while (i1 < i2)
            {
              ((CopyOnWriteArrayList)localObject2).add(c.a(localObject3[i1]));
              i1 += 1;
            }
          }
          if (this.f != null)
          {
            localObject3 = this.f;
            i2 = localObject3.length;
            i1 = 0;
            while (i1 < i2)
            {
              localCopyOnWriteArrayList.add(c.a(localObject3[i1]));
              i1 += 1;
            }
          }
          bool2 = a(localCopyOnWriteArrayList, (CopyOnWriteArrayList)localObject2, new ArrayList(), false);
          if (bool2) {
            return bool2;
          }
        }
        catch (Exception localException1)
        {
          if (QLog.isColorLevel()) {
            QLog.d("MSF.C.NetConnTag", 2, "conn assigned server " + Arrays.toString(this.e) + " " + Arrays.toString(this.f) + " error " + localException1, localException1);
          }
        }
        if (this.d.length() > 0) {
          try
          {
            SystemClock.elapsedRealtime();
            this.i = System.currentTimeMillis();
            this.j = this.i;
            al localal = new al();
            localal.b = this.d;
            localal.g = m.n();
            localal.j = 0;
            localal.k = 0;
            localal.l = 0;
            localal.m = 0;
            a(c.a(this.d), true, localal);
            new ArrayList().add(localal);
            SystemClock.elapsedRealtime();
            return true;
          }
          catch (Exception localException2)
          {
            if (QLog.isColorLevel()) {
              QLog.d("MSF.C.NetConnTag", 2, "conn assigned server " + this.d + " error " + localException2, localException2);
            }
            return false;
          }
        }
        SystemClock.elapsedRealtime();
        localObject1 = new ArrayList();
        this.i = System.currentTimeMillis();
        this.j = this.i;
        this.b.d().b();
        if ((this.b.h().k().size() > 0) || (this.b.h().l().size() > 0))
        {
          bool1 = a(this.b.h().k(), this.b.h().l(), (ArrayList)localObject1, false);
          SystemClock.elapsedRealtime();
          i1 = 1;
          localObject1 = ((ArrayList)localObject1).iterator();
        }
        for (;;)
        {
          if (!((Iterator)localObject1).hasNext()) {
            break label742;
          }
          localObject2 = (al)((Iterator)localObject1).next();
          if ((((al)localObject2).e == bd.m) || (((al)localObject2).e == bd.s) || (((al)localObject2).e == bd.i) || (((al)localObject2).e == bd.o) || (((al)localObject2).e == bd.p) || (((al)localObject2).e == bd.q) || (((al)localObject2).e == bd.y))
          {
            b();
            continue;
            if (QLog.isColorLevel()) {
              QLog.d("MSF.C.NetConnTag", 2, "sso list is null.");
            }
            bool1 = false;
            i1 = 0;
            break;
          }
          if (this.i == 0L)
          {
            this.i = ((al)localObject2).i;
            this.j = this.i;
          }
          if (this.a == null) {
            this.a = this.b.m().a(this, 300000L);
          }
          this.h.add(localObject2);
        }
        if (bool1) {
          break label992;
        }
        SystemClock.elapsedRealtime();
        if ((m.d()) && (i1 != 0)) {
          f();
        }
        NetConnInfoCenter.onOepnConnAllFailed();
        l1 = System.currentTimeMillis();
        if ((!m.e()) && ((m.d()) || (m.l() != null))) {
          break;
        }
        bool2 = bool1;
      } while (l1 - ah.i >= 60000L);
      localObject1 = new StringBuffer();
      localObject2 = this.b.h().k().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (c)((Iterator)localObject2).next();
        if (localObject3 != null) {
          ((StringBuffer)localObject1).append(((c)localObject3).toString() + ";");
        }
      }
      ah.i = 0L;
      return bool1;
      boolean bool2 = bool1;
    } while (l1 - ah.j >= 60000L);
    Object localObject1 = new StringBuffer();
    Object localObject2 = this.b.h().l().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (c)((Iterator)localObject2).next();
      if (localObject3 != null) {
        ((StringBuffer)localObject1).append(((c)localObject3).toString() + ";");
      }
    }
    ah.j = 0L;
    return bool1;
    label992:
    this.b.d().c();
    NetConnInfoCenter.checkConnInfo(this.b.r, true);
    if (!m.d()) {
      m.a();
    }
    return true;
  }
  
  public void f()
  {
    long l1 = SystemClock.elapsedRealtime();
    StringBuffer localStringBuffer;
    if ((this.g == 0L) || (l1 - this.g > Long.parseLong(ah.e())))
    {
      this.g = l1;
      localStringBuffer = new StringBuffer();
      c localc;
      if (m.e())
      {
        localIterator = this.b.h().k().iterator();
        while (localIterator.hasNext())
        {
          localc = (c)localIterator.next();
          localStringBuffer.append(localc.b() + "//" + localc.c() + ":" + localc.d() + ",");
        }
      }
      Iterator localIterator = this.b.h().l().iterator();
      while (localIterator.hasNext())
      {
        localc = (c)localIterator.next();
        localStringBuffer.append(localc.b() + "//" + localc.c() + ":" + localc.d() + ",");
      }
    }
    try
    {
      this.b.e.a(this.b.c.j(), this.b.i, 60000L, m.e(), localStringBuffer.toString());
      return;
    }
    catch (Exception localException)
    {
      while (!QLog.isColorLevel()) {}
      QLog.d("MSF.C.NetConnTag", 2, localException.toString(), localException);
    }
  }
  
  public void g()
  {
    if (this.p != null) {}
    do
    {
      do
      {
        return;
      } while (ah.p() == 0);
      localObject = ah.o();
      if (localObject != null) {
        break;
      }
    } while (!QLog.isColorLevel());
    QLog.d("MSF.C.NetConnTag", 2, "TcpdumpSSOVip is empty");
    return;
    this.n.clear();
    Object localObject = ((String)localObject).split(";");
    int i2 = localObject.length;
    int i1 = 0;
    while (i1 < i2)
    {
      String str = localObject[i1];
      aw localaw = new aw(this);
      localaw.a = str;
      localaw.b = 1;
      localaw.c = "";
      this.n.add(localaw);
      i1 += 1;
    }
    this.p = new ay(this);
    this.p.setName("checkNetConnectByConnectSSOThread");
    this.p.start();
  }
  
  public void k()
  {
    if (h())
    {
      if (System.currentTimeMillis() - this.s > 120000L) {
        j();
      }
      if (QLog.isColorLevel()) {
        QLog.d("MSF.C.NetConnTag", 2, "tcpdump is running return");
      }
      return;
    }
    az localaz = new az(this);
    localaz.setName("tcpDumpThread");
    localaz.start();
  }
  
  public void l()
  {
    bb localbb = new bb(this);
    localbb.setName("checkNetConnectByHttpThread");
    localbb.start();
    this.t.set(true);
  }
  
  public at m()
  {
    return this.z;
  }
  
  public String n()
  {
    return this.d;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\qalsdk\av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */