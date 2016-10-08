package qalsdk;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import com.qq.taf.jce.HexUtil;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.tencent.qalsdk.base.CloseConnReason;
import com.tencent.qalsdk.base.remote.FromServiceMsg;
import com.tencent.qalsdk.base.remote.ToServiceMsg;
import com.tencent.qalsdk.config.NativeConfigStore;
import com.tencent.qalsdk.core.a;
import com.tencent.qalsdk.core.b;
import com.tencent.qalsdk.sdk.MsfCommand;
import com.tencent.qalsdk.sdk.MsfSdkUtils;
import com.tencent.qalsdk.sdk.ai;
import com.tencent.qalsdk.sdk.c;
import com.tencent.qalsdk.sdk.x;
import com.tencent.qalsdk.service.g;
import com.tencent.qalsdk.util.QLog;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class aj
  extends BroadcastReceiver
{
  static SimpleDateFormat d;
  public static boolean k = false;
  public static String l = "0";
  private static final int[] p = { 1, 1, 1, 5, 5, 10, 10, 30, 30, 60, 60, 900, 900 };
  private static int q = 0;
  private static AtomicInteger v;
  com.tencent.qalsdk.core.j a;
  String b = "";
  String c = "";
  public ConcurrentHashMap<String, j> e = new ConcurrentHashMap();
  public ConcurrentHashMap<String, Boolean> f = new ConcurrentHashMap();
  public k g;
  AlarmManager h;
  l i = new l(this);
  boolean j = false;
  volatile Object m = new Object();
  final long n = 270000L;
  long o = 0L;
  private final int r = 1;
  private PendingIntent s;
  private Context t = null;
  private String u = null;
  private Handler w = new m(this);
  
  static
  {
    d = new SimpleDateFormat("dd HH:mm:ss");
    v = new AtomicInteger();
  }
  
  public aj(com.tencent.qalsdk.core.j paramj)
  {
    this.a = paramj;
    this.g = new k(this);
    this.i.setName("MsfCorePushManager");
  }
  
  private void a(String paramString, j paramj)
  {
    if ((paramj != null) && (paramj.k != null) && (paramj.c != 0L)) {
      try
      {
        if ((((Boolean)this.f.get(paramj.k.c())).booleanValue()) && (paramj.i != null) && (this.a.s != null) && (paramj.i.equals(this.a.s)))
        {
          this.g.a(paramString, paramj, false);
          return;
        }
        if (this.a.s == null)
        {
          QLog.i("MSF.C.PushManager", "doQueryMsgPush no conn,send open conn");
          paramString = x.a("");
          MsfSdkUtils.addToMsgProcessName("", paramString);
          this.a.a(paramString);
          return;
        }
      }
      catch (Exception paramString)
      {
        if (QLog.isColorLevel())
        {
          QLog.w("MSF.C.PushManager", 2, paramString.toString(), paramString);
          return;
          a(paramj, o.e);
        }
      }
    }
  }
  
  private void e(String paramString)
  {
    j localj = (j)this.e.get(paramString);
    localj.n = String.valueOf(b.b(this.t));
    JceOutputStream localJceOutputStream = new JceOutputStream();
    localj.writeTo(localJceOutputStream);
    com.tencent.qalsdk.core.l.a().setConfig("app_push_info_" + paramString, HexUtil.bytes2HexStr(localJceOutputStream.toByteArray()));
  }
  
  private void f()
  {
    Iterator localIterator = this.f.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      this.f.put(str, Boolean.valueOf(false));
    }
  }
  
  private void f(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0))
    {
      com.tencent.qalsdk.core.l.a().removeConfig("app_push_info_" + paramString);
      QLog.i("MSF.C.PushManager", "remove AppPushInfo:" + paramString);
    }
  }
  
  public int a(String paramString)
  {
    Iterator localIterator = this.e.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      localObject = (j)this.e.get(localObject);
      if ((localObject != null) && (((j)localObject).k != null) && (((j)localObject).k.c().equals(paramString)))
      {
        if (((j)localObject).c == 0L) {
          return -2;
        }
        return ((j)localObject).k.c;
      }
    }
    return -1;
  }
  
  public void a()
  {
    try
    {
      if (!this.j)
      {
        this.i.start();
        this.j = true;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void a(long paramLong, String paramString)
  {
    long l1;
    if (paramLong < 30000L)
    {
      if (!QLog.isColorLevel()) {
        break label221;
      }
      QLog.d("MSF.C.PushManager", 2, "queryPushIntervTime less than 30000,change to 30000.");
      l1 = 30000L;
    }
    for (;;)
    {
      Intent localIntent = new Intent(this.c);
      localIntent.setAction(this.c);
      localIntent.putExtra("appInfoKey", paramString);
      this.s = PendingIntent.getBroadcast(this.t, v.incrementAndGet(), localIntent, 0);
      this.h = ((AlarmManager)this.t.getSystemService("alarm"));
      this.h.set(0, System.currentTimeMillis() + l1, this.s);
      if (QLog.isColorLevel()) {
        QLog.d("hello", 2, "register " + paramString + ":" + this.c + " alarm alive send at " + d.format(Long.valueOf(System.currentTimeMillis() + l1)));
      }
      return;
      l1 = paramLong;
      if (paramLong > 3600000L)
      {
        if (QLog.isColorLevel()) {
          QLog.d("MSF.C.PushManager", 2, "queryPushIntervTime greater than 600000 ,change to 600000.");
        }
        l1 = 3600000L;
        continue;
        label221:
        l1 = 30000L;
      }
    }
  }
  
  public void a(Context paramContext, boolean paramBoolean)
  {
    this.t = paramContext;
    this.b = (Build.MODEL + "|" + Build.VERSION.RELEASE);
    this.c = (MsfSdkUtils.getProcessName(paramContext) + "_" + getClass().hashCode());
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction(this.c);
    paramContext.registerReceiver(this, localIntentFilter);
    this.h = ((AlarmManager)paramContext.getSystemService("alarm"));
    a(paramBoolean);
  }
  
  public void a(CloseConnReason paramCloseConnReason)
  {
    QLog.i("MSF.C.PushManager", "onConnClosed send open conn,net is ok: " + com.tencent.qalsdk.core.m.b());
    f();
    this.o = 0L;
    if (paramCloseConnReason == CloseConnReason.unRegisterPush)
    {
      QLog.i("MSF.C.PushManager", "onConnClosed by" + paramCloseConnReason + ",no need auto retry conn");
      return;
    }
    if ((paramCloseConnReason == CloseConnReason.readError) && (com.tencent.qalsdk.core.m.e()) && (e.a.get()))
    {
      QLog.i("MSF.C.PushManager", "onConnClosed by " + paramCloseConnReason + " need wifi auth,no need auto retry conn");
      return;
    }
    paramCloseConnReason = new n(this);
    paramCloseConnReason.setName("onConnClosedPushThread");
    paramCloseConnReason.start();
  }
  
  public void a(FromServiceMsg paramFromServiceMsg)
  {
    if (paramFromServiceMsg.getServiceCmd().equals("qalsdk.logUpload")) {
      new com.tencent.qalsdk.sdk.o().a(paramFromServiceMsg);
    }
    int i1;
    do
    {
      return;
      Iterator localIterator = this.e.keySet().iterator();
      i1 = 0;
      if (localIterator.hasNext())
      {
        Object localObject = (String)localIterator.next();
        localObject = (j)this.e.get(localObject);
        if (localObject != null) {
          if (paramFromServiceMsg.getServiceCmd().equals("im_open_status.stat_queryhb")) {
            if (ah.b)
            {
              ((j)localObject).i = this.a.s;
              ((j)localObject).f = System.currentTimeMillis();
              a((j)localObject, o.f);
              i1 = 1;
            }
          }
        }
        for (;;)
        {
          break;
          if (QLog.isColorLevel())
          {
            QLog.d("MSF.C.PushManager", 2, "recv push im_open_status.stat_queryhb, but do not support useAnyPacketAsPushHB ");
            continue;
            if (paramFromServiceMsg.isSuccess())
            {
              if (a((j)localObject, paramFromServiceMsg)) {
                i1 = 1;
              }
            }
            else if (QLog.isColorLevel()) {
              QLog.d("MSF.C.PushManager", 2, "recv error onRecvPushMsg FromServiceMsg  " + paramFromServiceMsg);
            }
          }
        }
      }
    } while ((i1 != 0) || (!QLog.isColorLevel()));
    QLog.w("MSF.C.PushManager", 2, "found not handle push msg " + paramFromServiceMsg);
  }
  
  public void a(ToServiceMsg paramToServiceMsg)
  {
    String str = g.b(paramToServiceMsg);
    str = str + paramToServiceMsg.getUin();
    if (!this.e.containsKey(str)) {
      return;
    }
    this.g.a((j)this.e.get(str), paramToServiceMsg, false, o.i);
  }
  
  public void a(ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg)
  {
    this.g.a(paramToServiceMsg, paramFromServiceMsg);
  }
  
  public void a(ToServiceMsg paramToServiceMsg, o paramo)
  {
    if (this.w.hasMessages(1))
    {
      if (QLog.isColorLevel()) {
        QLog.d("MSF.C.PushManager", 2, "remove message handler mLoadPushInfoHandler");
      }
      this.w.removeMessages(1);
    }
    Object localObject1 = g.b(paramToServiceMsg);
    String str = (String)localObject1 + paramToServiceMsg.getUin();
    if (!this.e.containsKey(str)) {
      this.e.putIfAbsent(str, new j((String)localObject1));
    }
    QLog.d("MSF.C.PushManager", "recv regPush:" + (String)localObject1 + ":" + str);
    Object localObject2 = ai.b(paramToServiceMsg);
    if (QLog.isColorLevel()) {
      QLog.d("MSF.C.PushManager", 2, "recv processName:" + str + " recv regPush ");
    }
    localObject1 = (j)this.e.get(str);
    if ((localObject1 != null) && (((j)localObject1).k != null) && (((j)localObject1).c != 0L) && (((j)localObject1).k.a.equals(((com.tencent.qalsdk.sdk.ah)localObject2).a)) && (((j)localObject1).k.c == ((com.tencent.qalsdk.sdk.ah)localObject2).c) && (((j)localObject1).k.d == ((com.tencent.qalsdk.sdk.ah)localObject2).d) && (((j)localObject1).k.e == ((com.tencent.qalsdk.sdk.ah)localObject2).e) && (((j)localObject1).k.f == ((com.tencent.qalsdk.sdk.ah)localObject2).f))
    {
      QLog.i("MSF.C.PushManager", 2, "handlerPush also register Push iStatus:" + ((com.tencent.qalsdk.sdk.ah)localObject2).c);
      paramo = g.a(paramToServiceMsg);
      paramo.setMsgSuccess();
      this.a.a(paramToServiceMsg, paramo);
      return;
    }
    if (QLog.isColorLevel()) {
      QLog.d("MSF.C.PushManager", 2, "handlerPush not found the same register Push  iStatus:" + ((com.tencent.qalsdk.sdk.ah)localObject2).c);
    }
    ((j)localObject1).k = ((com.tencent.qalsdk.sdk.ah)localObject2);
    ((j)localObject1).a = paramToServiceMsg.getAppId();
    localObject2 = ((com.tencent.qalsdk.sdk.ah)localObject2).b.iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((j)localObject1).c = (((Long)((Iterator)localObject2).next()).longValue() | ((j)localObject1).c);
    }
    e(str);
    this.g.a((j)localObject1, paramToServiceMsg, false, paramo);
  }
  
  public void a(com.tencent.qalsdk.sdk.ah paramah, ToServiceMsg paramToServiceMsg)
  {
    try
    {
      String str1 = g.b(paramToServiceMsg);
      String str2 = str1 + paramToServiceMsg.getUin();
      QLog.d("MSF.C.PushManager", "recv unRegisterPush:" + str1 + ":" + str2);
      if (!this.e.containsKey(str2)) {
        this.e.putIfAbsent(str2, new j(str1));
      }
      ((j)this.e.get(str2)).k = paramah;
      ((j)this.e.get(str2)).a = paramToServiceMsg.getAppId();
      ((j)this.e.get(str2)).c = 0L;
      this.g.a((j)this.e.get(str2), paramToServiceMsg, true, o.b);
      if (((j)this.e.get(str2)).c == 0L) {
        ((j)this.e.get(str2)).k = null;
      }
      f(str2);
      return;
    }
    finally {}
  }
  
  public void a(c paramc, ToServiceMsg paramToServiceMsg)
  {
    try
    {
      String str2 = g.b(paramToServiceMsg);
      if (QLog.isColorLevel()) {
        QLog.d("MSF.C.PushManager", 2, "recv processName:" + str2 + " appCmdCallbacker " + paramc);
      }
      String str1 = str2 + paramToServiceMsg.getUin();
      if (!this.e.containsKey(str1)) {
        this.e.putIfAbsent(str1, new j(str2));
      }
      ((j)this.e.get(str1)).m = paramc;
      paramc = g.a(paramToServiceMsg);
      paramc.setMsgSuccess();
      this.a.a(paramToServiceMsg, paramc);
      e(str1);
      return;
    }
    finally {}
  }
  
  public void a(String paramString, long paramLong)
  {
    this.a.b().a(paramString, paramLong);
  }
  
  public void a(j paramj, o paramo)
  {
    if (paramj.c > 0L)
    {
      if (QLog.isColorLevel()) {
        QLog.d("MSF.C.PushManager", 2, "send " + paramj.b + " push register, pushId is " + paramj.c);
      }
      this.g.a(paramj, null, false, paramo);
      return;
    }
    QLog.d("MSF.C.PushManager", 2, paramj.b + " queryPushId is " + paramj.c + " ,skip register.");
  }
  
  public void a(boolean paramBoolean)
  {
    String[] arrayOfString = com.tencent.qalsdk.core.l.a().getConfigList("app_push_info_");
    Object localObject1;
    if ((true == paramBoolean) && (arrayOfString == null) && (q < p.length))
    {
      if (QLog.isColorLevel()) {
        QLog.d("MSF.C.PushManager", 2, "loop to loadAppPushInfo with time " + p[q] + " seconds");
      }
      localObject1 = this.w.obtainMessage();
      ((Message)localObject1).what = 1;
      ((Message)localObject1).obj = Boolean.valueOf(paramBoolean);
      this.w.sendMessageDelayed((Message)localObject1, p[q] * 1000);
      q += 1;
    }
    int i2 = b.b(this.t);
    int i3 = arrayOfString.length;
    int i1 = 0;
    Object localObject2;
    boolean bool;
    if (i1 < i3)
    {
      localObject2 = HexUtil.hexStr2Bytes(arrayOfString[i1]);
      localObject1 = new j();
      ((j)localObject1).readFrom(new JceInputStream((byte[])localObject2));
      ((j)localObject1).o = 0;
      QLog.d("MSF.C.PushManager", "load AppPushInfo:" + ((j)localObject1).b + ":" + ((j)localObject1).k + ":" + i2);
      if ((((j)localObject1).k != null) && (((j)localObject1).c > 0L))
      {
        if (i2 != -1) {
          break label424;
        }
        if (!QLog.isColorLevel()) {
          break label765;
        }
        QLog.d("MSF.C.PushManager", 2, "nVersionCode:" + i2 + " sendMsgPushRegister now");
        bool = true;
      }
    }
    for (;;)
    {
      label296:
      QLog.i("MSF.C.PushManager", "load AppPushInfo:" + ((j)localObject1).b + ":" + ((j)localObject1).k.a + ":" + paramBoolean + ":" + bool);
      if (bool)
      {
        this.e.put(((j)localObject1).b + ((j)localObject1).k.a, localObject1);
        this.g.a((j)localObject1, null, false, o.a);
      }
      for (;;)
      {
        i1 += 1;
        break;
        label424:
        localObject2 = String.valueOf(i2);
        if (((j)localObject1).n != null)
        {
          if (((j)localObject1).n.equals(localObject2))
          {
            if (!QLog.isColorLevel()) {
              break label765;
            }
            QLog.d("MSF.C.PushManager", 2, "info.installVersion :" + ((j)localObject1).n + " strVersionCode:" + (String)localObject2 + " sendMsgPushRegister now");
            bool = true;
            break label296;
          }
          if (paramBoolean)
          {
            if (!QLog.isColorLevel()) {
              break label765;
            }
            QLog.d("MSF.C.PushManager", 2, "info.installVersion :" + ((j)localObject1).n + " bBoot:" + paramBoolean + " strVersionCode:" + (String)localObject2 + " sendMsgPushRegister now");
            bool = true;
            break label296;
          }
          if (!QLog.isColorLevel()) {
            break label750;
          }
          QLog.d("MSF.C.PushManager", 2, "info.installVersion :" + ((j)localObject1).n + " strVersionCode:" + (String)localObject2 + " no need sendMsgPushRegister");
          bool = false;
          break label296;
        }
        if (paramBoolean)
        {
          if (!QLog.isColorLevel()) {
            break label765;
          }
          QLog.d("MSF.C.PushManager", 2, "info.installVersion :" + ((j)localObject1).n + " bBoot:" + paramBoolean + " sendMsgPushRegister now");
          bool = true;
          break label296;
        }
        if (QLog.isColorLevel()) {
          QLog.d("MSF.C.PushManager", 2, "info.installVersion :" + ((j)localObject1).n + " bBoot:" + paramBoolean + " no need sendMsgPushRegister");
        }
        label750:
        bool = false;
        break label296;
        ((j)localObject1).c = 0L;
      }
      return;
      label765:
      bool = true;
    }
  }
  
  public boolean a(j paramj, FromServiceMsg paramFromServiceMsg)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    Object localObject;
    if (paramj.m != null)
    {
      bool1 = bool2;
      if (paramj.m.a.equals(paramFromServiceMsg.getUin()))
      {
        localObject = paramj.m.b.iterator();
        bool1 = false;
        if (((Iterator)localObject).hasNext())
        {
          if (!((String)((Iterator)localObject).next()).equals(paramFromServiceMsg.getServiceCmd())) {
            break label329;
          }
          paramFromServiceMsg.addAttribute("resp_needBootApp", Integer.valueOf(1));
          MsfSdkUtils.addFromMsgProcessName(paramj.b, paramFromServiceMsg);
          paramFromServiceMsg.setMsfCommand(MsfCommand.onRecvPushMsg);
          this.a.a(null, paramFromServiceMsg);
          QLog.d("MSF.C.PushManager", 2, "recv push " + paramj.b + " " + paramFromServiceMsg);
          bool1 = true;
        }
      }
    }
    label329:
    for (;;)
    {
      break;
      if (paramFromServiceMsg.getServiceCmd().equals("im_open_status.stat_forceoffline"))
      {
        localObject = new com.tencent.qalsdk.sdk.ah();
        ((com.tencent.qalsdk.sdk.ah)localObject).d = 0;
        ((com.tencent.qalsdk.sdk.ah)localObject).e = 0;
        ArrayList localArrayList = new ArrayList();
        localArrayList.add(Long.valueOf(1L));
        ((com.tencent.qalsdk.sdk.ah)localObject).b = localArrayList;
        ((com.tencent.qalsdk.sdk.ah)localObject).f = 0L;
        ((com.tencent.qalsdk.sdk.ah)localObject).a = paramFromServiceMsg.getUin();
        paramFromServiceMsg = new ToServiceMsg("", ((com.tencent.qalsdk.sdk.ah)localObject).a, "im_open_status.stat_reg");
        paramFromServiceMsg.setMsfCommand(MsfCommand.unRegisterPush);
        paramFromServiceMsg.setAppId(537046243);
        paramFromServiceMsg.setTimeout(15000L);
        MsfSdkUtils.addToMsgProcessName(paramj.b, paramFromServiceMsg);
        QLog.i("MSF.C.PushManager", "service recv force_offline,send unregister." + paramj.b + ":" + ((com.tencent.qalsdk.sdk.ah)localObject).a);
        a((com.tencent.qalsdk.sdk.ah)localObject, paramFromServiceMsg);
        bool1 = true;
        return bool1;
      }
      return bool1;
    }
  }
  
  public void b(ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg)
  {
    this.g.b(paramToServiceMsg, paramFromServiceMsg);
  }
  
  public void b(c paramc, ToServiceMsg paramToServiceMsg)
  {
    try
    {
      String str2 = g.b(paramToServiceMsg);
      if (QLog.isColorLevel()) {
        QLog.d("MSF.C.PushManager", 2, "recv processName:" + str2 + " recv unRegisterCmdCall ");
      }
      String str1 = str2 + paramToServiceMsg.getUin();
      if (!this.e.containsKey(str1)) {
        this.e.putIfAbsent(str1, new j(str2));
      }
      ((j)this.e.get(str1)).m = paramc;
      paramc = g.a(paramToServiceMsg);
      paramc.setMsgSuccess();
      this.a.a(paramToServiceMsg, paramc);
      e(str1);
      return;
    }
    finally {}
  }
  
  public void b(String paramString)
  {
    try
    {
      Object localObject = this.t.getPackageName();
      String str = (String)localObject + paramString;
      if (QLog.isColorLevel()) {
        QLog.d("MSF.C.PushManager", 2, "recv processName:" + (String)localObject + " recv KickedMsg ");
      }
      localObject = (j)this.e.get(str);
      if ((localObject != null) && (((j)localObject).k != null) && (((j)localObject).k.a.equals(paramString)))
      {
        ((j)localObject).c = 0L;
        ((j)localObject).k = null;
        e(str);
      }
      return;
    }
    finally {}
  }
  
  public boolean b()
  {
    Iterator localIterator = this.e.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      localObject = (j)this.e.get(localObject);
      if ((localObject != null) && (((j)localObject).k != null) && (((j)localObject).c != 0L)) {
        return true;
      }
    }
    return false;
  }
  
  public void c()
  {
    QLog.i("MSF.C.PushManager", "onConnResumed doQueryMsgPush");
    c(null);
  }
  
  void c(String paramString)
  {
    if (paramString == null)
    {
      paramString = this.e.keySet().iterator();
      while (paramString.hasNext())
      {
        localObject = (String)paramString.next();
        a((String)localObject, (j)this.e.get(localObject));
      }
    }
    Object localObject = (j)this.e.get(paramString);
    if (localObject != null) {
      a(paramString, (j)localObject);
    }
  }
  
  public long d(String paramString)
  {
    return this.a.b().d(paramString);
  }
  
  public void d()
  {
    f();
    QLog.i("MSF.C.PushManager", "onConnOpened doQueryMsgPush");
    c(null);
  }
  
  public long e()
  {
    if (this.o == 0L) {
      return 270000L;
    }
    return this.o;
  }
  
  public void onReceive(Context arg1, Intent paramIntent)
  {
    QLog.d("MSF.C.PushManager", 2, "alarm receive: " + paramIntent.getStringExtra("appInfoKey"));
    synchronized (this.m)
    {
      this.u = paramIntent.getStringExtra("appInfoKey");
      this.m.notify();
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\qalsdk\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */