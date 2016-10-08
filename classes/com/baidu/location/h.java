package com.baidu.location;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import com.baidu.location.d.a;
import com.baidu.location.e.aa;
import com.baidu.location.e.ac;
import java.util.ArrayList;
import java.util.Iterator;

public final class h
  implements ac
{
  private boolean A;
  private aa B = null;
  private boolean C = false;
  private boolean D = false;
  private ServiceConnection E = new o(this);
  private long a = 0L;
  private String b = null;
  private k c = new k();
  private boolean d = false;
  private Context e = null;
  private Messenger f = null;
  private i g = new i(this, null);
  private final Messenger h = new Messenger(this.g);
  private ArrayList i = null;
  private BDLocation j = null;
  private boolean k = false;
  private boolean l = false;
  private boolean m = false;
  private j n = null;
  private boolean o = false;
  private final Object p = new Object();
  private long q = 0L;
  private long r = 0L;
  private a s = null;
  private d t = null;
  private String u = null;
  private boolean v = false;
  private boolean w = true;
  private Boolean x = Boolean.valueOf(false);
  private Boolean y = Boolean.valueOf(false);
  private Boolean z = Boolean.valueOf(true);
  
  public h(Context paramContext)
  {
    this.e = paramContext;
    this.c = new k();
  }
  
  private void a(int paramInt)
  {
    if (this.j.g() == null) {
      this.j.b(this.c.a);
    }
    if ((this.k == true) || ((this.c.h == true) && (this.j.h() == 61)) || (this.j.h() == 66) || (this.j.h() == 67) || (this.v) || (this.j.h() == 161))
    {
      if (this.i != null)
      {
        Iterator localIterator = this.i.iterator();
        while (localIterator.hasNext()) {
          ((d)localIterator.next()).onReceiveLocation(this.j);
        }
      }
      if ((this.j.h() != 66) && (this.j.h() != 67)) {}
    }
    else
    {
      return;
    }
    this.k = false;
    this.r = System.currentTimeMillis();
  }
  
  private void a(Message paramMessage)
  {
    if ((paramMessage == null) || (paramMessage.obj == null)) {
      return;
    }
    paramMessage = (e)paramMessage.obj;
    if (this.s == null) {
      this.s = new a(this.e, this);
    }
    this.s.a(paramMessage);
  }
  
  private void a(Message paramMessage, int paramInt)
  {
    if (!this.d) {
      return;
    }
    paramMessage = paramMessage.getData();
    paramMessage.setClassLoader(BDLocation.class.getClassLoader());
    this.j = ((BDLocation)paramMessage.getParcelable("locStr"));
    if (this.j.h() == 61) {
      this.q = System.currentTimeMillis();
    }
    a(paramInt);
  }
  
  private void b(Message paramMessage)
  {
    if ((paramMessage == null) || (paramMessage.obj == null)) {}
    do
    {
      return;
      paramMessage = (e)paramMessage.obj;
    } while (this.s == null);
    this.s.b(paramMessage);
  }
  
  private void b(BDLocation paramBDLocation)
  {
    if (this.w) {}
    for (;;)
    {
      return;
      this.j = paramBDLocation;
      if ((!this.D) && (paramBDLocation.h() == 161)) {
        this.C = true;
      }
      if (this.i != null)
      {
        Iterator localIterator = this.i.iterator();
        while (localIterator.hasNext()) {
          ((d)localIterator.next()).onReceiveLocation(paramBDLocation);
        }
      }
    }
  }
  
  /* Error */
  private void c(Message paramMessage)
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: putfield 95	com/baidu/location/h:l	Z
    //   5: aload_1
    //   6: ifnull +10 -> 16
    //   9: aload_1
    //   10: getfield 196	android/os/Message:obj	Ljava/lang/Object;
    //   13: ifnonnull +4 -> 17
    //   16: return
    //   17: aload_1
    //   18: getfield 196	android/os/Message:obj	Ljava/lang/Object;
    //   21: checkcast 64	com/baidu/location/k
    //   24: astore_1
    //   25: aload_0
    //   26: getfield 67	com/baidu/location/h:c	Lcom/baidu/location/k;
    //   29: aload_1
    //   30: invokevirtual 252	com/baidu/location/k:a	(Lcom/baidu/location/k;)Z
    //   33: ifne -17 -> 16
    //   36: aload_0
    //   37: getfield 67	com/baidu/location/h:c	Lcom/baidu/location/k;
    //   40: getfield 255	com/baidu/location/k:d	I
    //   43: aload_1
    //   44: getfield 255	com/baidu/location/k:d	I
    //   47: if_icmpeq +95 -> 142
    //   50: aload_0
    //   51: getfield 103	com/baidu/location/h:p	Ljava/lang/Object;
    //   54: astore_2
    //   55: aload_2
    //   56: monitorenter
    //   57: aload_0
    //   58: getfield 97	com/baidu/location/h:m	Z
    //   61: iconst_1
    //   62: if_icmpne +19 -> 81
    //   65: aload_0
    //   66: getfield 80	com/baidu/location/h:g	Lcom/baidu/location/i;
    //   69: aload_0
    //   70: getfield 99	com/baidu/location/h:n	Lcom/baidu/location/j;
    //   73: invokevirtual 259	com/baidu/location/i:removeCallbacks	(Ljava/lang/Runnable;)V
    //   76: aload_0
    //   77: iconst_0
    //   78: putfield 97	com/baidu/location/h:m	Z
    //   81: aload_1
    //   82: getfield 255	com/baidu/location/k:d	I
    //   85: sipush 1000
    //   88: if_icmplt +52 -> 140
    //   91: aload_0
    //   92: getfield 97	com/baidu/location/h:m	Z
    //   95: ifne +45 -> 140
    //   98: aload_0
    //   99: getfield 99	com/baidu/location/h:n	Lcom/baidu/location/j;
    //   102: ifnonnull +16 -> 118
    //   105: aload_0
    //   106: new 261	com/baidu/location/j
    //   109: dup
    //   110: aload_0
    //   111: aconst_null
    //   112: invokespecial 262	com/baidu/location/j:<init>	(Lcom/baidu/location/h;Lcom/baidu/location/o;)V
    //   115: putfield 99	com/baidu/location/h:n	Lcom/baidu/location/j;
    //   118: aload_0
    //   119: getfield 80	com/baidu/location/h:g	Lcom/baidu/location/i;
    //   122: aload_0
    //   123: getfield 99	com/baidu/location/h:n	Lcom/baidu/location/j;
    //   126: aload_1
    //   127: getfield 255	com/baidu/location/k:d	I
    //   130: i2l
    //   131: invokevirtual 266	com/baidu/location/i:postDelayed	(Ljava/lang/Runnable;J)Z
    //   134: pop
    //   135: aload_0
    //   136: iconst_1
    //   137: putfield 97	com/baidu/location/h:m	Z
    //   140: aload_2
    //   141: monitorexit
    //   142: aload_0
    //   143: new 64	com/baidu/location/k
    //   146: dup
    //   147: aload_1
    //   148: invokespecial 269	com/baidu/location/k:<init>	(Lcom/baidu/location/k;)V
    //   151: putfield 67	com/baidu/location/h:c	Lcom/baidu/location/k;
    //   154: aload_0
    //   155: getfield 73	com/baidu/location/h:f	Landroid/os/Messenger;
    //   158: ifnull -142 -> 16
    //   161: aconst_null
    //   162: bipush 15
    //   164: invokestatic 273	android/os/Message:obtain	(Landroid/os/Handler;I)Landroid/os/Message;
    //   167: astore_1
    //   168: aload_1
    //   169: aload_0
    //   170: getfield 87	com/baidu/location/h:h	Landroid/os/Messenger;
    //   173: putfield 276	android/os/Message:replyTo	Landroid/os/Messenger;
    //   176: aload_1
    //   177: aload_0
    //   178: invokespecial 278	com/baidu/location/h:h	()Landroid/os/Bundle;
    //   181: invokevirtual 282	android/os/Message:setData	(Landroid/os/Bundle;)V
    //   184: aload_0
    //   185: getfield 73	com/baidu/location/h:f	Landroid/os/Messenger;
    //   188: aload_1
    //   189: invokevirtual 285	android/os/Messenger:send	(Landroid/os/Message;)V
    //   192: return
    //   193: astore_1
    //   194: aload_1
    //   195: invokevirtual 288	java/lang/Exception:printStackTrace	()V
    //   198: return
    //   199: astore_3
    //   200: aload_2
    //   201: monitorexit
    //   202: aload_3
    //   203: athrow
    //   204: astore_2
    //   205: goto -63 -> 142
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	208	0	this	h
    //   0	208	1	paramMessage	Message
    //   204	1	2	localException	Exception
    //   199	4	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   161	192	193	java/lang/Exception
    //   57	81	199	finally
    //   81	118	199	finally
    //   118	140	199	finally
    //   140	142	199	finally
    //   200	202	199	finally
    //   50	57	204	java/lang/Exception
    //   202	204	204	java/lang/Exception
  }
  
  private void d(Message paramMessage)
  {
    if ((paramMessage == null) || (paramMessage.obj == null)) {
      return;
    }
    this.t = ((d)paramMessage.obj);
  }
  
  private void e()
  {
    Message localMessage = Message.obtain(null, 28);
    try
    {
      localMessage.replyTo = this.h;
      this.f.send(localMessage);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  private void e(Message paramMessage)
  {
    if ((paramMessage == null) || (paramMessage.obj == null)) {}
    do
    {
      return;
      paramMessage = (d)paramMessage.obj;
      if (this.i == null) {
        this.i = new ArrayList();
      }
    } while (this.i.contains(paramMessage));
    this.i.add(paramMessage);
  }
  
  private void f()
  {
    if (this.d == true) {
      return;
    }
    if (this.z.booleanValue())
    {
      if (this.B == null)
      {
        this.B = new aa(this.e, this.c, this);
        this.B.b();
      }
      this.B.c();
      this.z = Boolean.valueOf(false);
    }
    this.b = this.e.getPackageName();
    this.u = (this.b + "_bdls_v2.9");
    Intent localIntent = new Intent(this.e, f.class);
    try
    {
      localIntent.putExtra("debug_dev", this.A);
      if (this.c == null) {
        this.c = new k();
      }
      localIntent.putExtra("cache_exception", this.c.l);
      localIntent.putExtra("kill_process", this.c.m);
      try
      {
        this.e.bindService(localIntent, this.E, 1);
        return;
      }
      catch (Exception localException1)
      {
        localException1.printStackTrace();
        this.d = false;
        return;
      }
    }
    catch (Exception localException2)
    {
      for (;;) {}
    }
  }
  
  private void f(Message paramMessage)
  {
    if ((paramMessage == null) || (paramMessage.obj == null)) {}
    do
    {
      return;
      paramMessage = (d)paramMessage.obj;
    } while ((this.i == null) || (!this.i.contains(paramMessage)));
    this.i.remove(paramMessage);
  }
  
  /* Error */
  private void g()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 69	com/baidu/location/h:d	Z
    //   4: ifeq +10 -> 14
    //   7: aload_0
    //   8: getfield 73	com/baidu/location/h:f	Landroid/os/Messenger;
    //   11: ifnonnull +4 -> 15
    //   14: return
    //   15: aconst_null
    //   16: bipush 12
    //   18: invokestatic 273	android/os/Message:obtain	(Landroid/os/Handler;I)Landroid/os/Message;
    //   21: astore_1
    //   22: aload_1
    //   23: aload_0
    //   24: getfield 87	com/baidu/location/h:h	Landroid/os/Messenger;
    //   27: putfield 276	android/os/Message:replyTo	Landroid/os/Messenger;
    //   30: aload_0
    //   31: getfield 73	com/baidu/location/h:f	Landroid/os/Messenger;
    //   34: aload_1
    //   35: invokevirtual 285	android/os/Messenger:send	(Landroid/os/Message;)V
    //   38: aload_0
    //   39: getfield 71	com/baidu/location/h:e	Landroid/content/Context;
    //   42: aload_0
    //   43: getfield 142	com/baidu/location/h:E	Landroid/content/ServiceConnection;
    //   46: invokevirtual 368	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   49: aload_0
    //   50: getfield 103	com/baidu/location/h:p	Ljava/lang/Object;
    //   53: astore_1
    //   54: aload_1
    //   55: monitorenter
    //   56: aload_0
    //   57: getfield 97	com/baidu/location/h:m	Z
    //   60: iconst_1
    //   61: if_icmpne +19 -> 80
    //   64: aload_0
    //   65: getfield 80	com/baidu/location/h:g	Lcom/baidu/location/i;
    //   68: aload_0
    //   69: getfield 99	com/baidu/location/h:n	Lcom/baidu/location/j;
    //   72: invokevirtual 259	com/baidu/location/i:removeCallbacks	(Ljava/lang/Runnable;)V
    //   75: aload_0
    //   76: iconst_0
    //   77: putfield 97	com/baidu/location/h:m	Z
    //   80: aload_1
    //   81: monitorexit
    //   82: aload_0
    //   83: getfield 109	com/baidu/location/h:s	Lcom/baidu/location/d/a;
    //   86: ifnull +10 -> 96
    //   89: aload_0
    //   90: getfield 109	com/baidu/location/h:s	Lcom/baidu/location/d/a;
    //   93: invokevirtual 370	com/baidu/location/d/a:a	()V
    //   96: aload_0
    //   97: aconst_null
    //   98: putfield 73	com/baidu/location/h:f	Landroid/os/Messenger;
    //   101: aload_0
    //   102: iconst_0
    //   103: putfield 95	com/baidu/location/h:l	Z
    //   106: aload_0
    //   107: iconst_0
    //   108: putfield 115	com/baidu/location/h:v	Z
    //   111: aload_0
    //   112: iconst_0
    //   113: putfield 69	com/baidu/location/h:d	Z
    //   116: aload_0
    //   117: iconst_0
    //   118: putfield 133	com/baidu/location/h:C	Z
    //   121: aload_0
    //   122: iconst_0
    //   123: putfield 135	com/baidu/location/h:D	Z
    //   126: return
    //   127: astore_1
    //   128: aload_1
    //   129: invokevirtual 288	java/lang/Exception:printStackTrace	()V
    //   132: goto -94 -> 38
    //   135: astore_2
    //   136: aload_1
    //   137: monitorexit
    //   138: aload_2
    //   139: athrow
    //   140: astore_2
    //   141: goto -61 -> 80
    //   144: astore_1
    //   145: goto -96 -> 49
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	148	0	this	h
    //   127	10	1	localException1	Exception
    //   144	1	1	localException2	Exception
    //   135	4	2	localObject2	Object
    //   140	1	2	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   30	38	127	java/lang/Exception
    //   56	80	135	finally
    //   80	82	135	finally
    //   136	138	135	finally
    //   56	80	140	java/lang/Exception
    //   38	49	144	java/lang/Exception
  }
  
  private void g(Message paramMessage)
  {
    paramMessage = paramMessage.getData();
    paramMessage.setClassLoader(BDLocation.class.getClassLoader());
    paramMessage = (BDLocation)paramMessage.getParcelable("locStr");
    if ((this.t == null) || ((this.c != null) && (this.c.c()) && (paramMessage.h() == 65))) {
      return;
    }
    this.t.onReceiveLocation(paramMessage);
  }
  
  private Bundle h()
  {
    if (this.c == null) {
      return null;
    }
    Bundle localBundle = new Bundle();
    localBundle.putString("packName", this.b);
    localBundle.putString("prodName", this.c.f);
    localBundle.putString("coorType", this.c.a);
    localBundle.putString("addrType", this.c.b);
    localBundle.putBoolean("openGPS", this.c.c);
    localBundle.putBoolean("location_change_notify", this.c.h);
    localBundle.putInt("scanSpan", this.c.d);
    localBundle.putInt("timeOut", this.c.e);
    localBundle.putInt("priority", this.c.g);
    localBundle.putBoolean("map", this.x.booleanValue());
    localBundle.putBoolean("import", this.y.booleanValue());
    localBundle.putBoolean("needDirect", this.c.n);
    localBundle.putBoolean("isneedaptag", this.c.o);
    localBundle.putBoolean("isneedpoiregion", this.c.q);
    localBundle.putBoolean("isneedregular", this.c.r);
    localBundle.putBoolean("isneedaptagd", this.c.p);
    localBundle.putBoolean("isneedaltitude", this.c.s);
    return localBundle;
  }
  
  private void i()
  {
    if (this.f == null) {
      return;
    }
    Message localMessage = Message.obtain(null, 22);
    try
    {
      localMessage.replyTo = this.h;
      this.f.send(localMessage);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  private void j()
  {
    if (this.f == null) {
      return;
    }
    if (((System.currentTimeMillis() - this.q > 3000L) || (!this.c.h) || (this.l)) && ((!this.v) || (System.currentTimeMillis() - this.r > 20000L) || (this.l)))
    {
      ??? = Message.obtain(null, 22);
      if (this.l)
      {
        Bundle localBundle = new Bundle();
        localBundle.putBoolean("isWaitingLocTag", this.l);
        ((Message)???).setData(localBundle);
      }
    }
    try
    {
      ((Message)???).replyTo = this.h;
      this.f.send((Message)???);
      this.a = System.currentTimeMillis();
      this.k = true;
      synchronized (this.p)
      {
        if ((this.c != null) && (this.c.d >= 1000) && (!this.m))
        {
          if (this.n == null) {
            this.n = new j(this, null);
          }
          this.g.postDelayed(this.n, this.c.d);
          this.m = true;
        }
        return;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
  }
  
  public void a()
  {
    this.g.obtainMessage(11).sendToTarget();
  }
  
  public void a(BDLocation paramBDLocation)
  {
    if ((this.D == true) && (!this.C)) {}
    while (paramBDLocation == null) {
      return;
    }
    Message localMessage = this.g.obtainMessage(701);
    localMessage.obj = paramBDLocation;
    localMessage.sendToTarget();
  }
  
  public void a(d paramd)
  {
    Message localMessage = this.g.obtainMessage(8);
    localMessage.obj = paramd;
    localMessage.sendToTarget();
  }
  
  public void a(k paramk)
  {
    k localk = paramk;
    if (paramk == null) {
      localk = new k();
    }
    if (this.B == null)
    {
      this.B = new aa(this.e, localk, this);
      this.B.b();
    }
    paramk = this.g.obtainMessage(3);
    paramk.obj = localk;
    paramk.sendToTarget();
  }
  
  public int b()
  {
    if ((this.f == null) || (this.h == null)) {
      return 1;
    }
    if ((this.i == null) || (this.i.size() < 1)) {
      return 2;
    }
    if (System.currentTimeMillis() - this.a < 1000L) {
      return 6;
    }
    Message localMessage = this.g.obtainMessage(4);
    localMessage.arg1 = 0;
    localMessage.sendToTarget();
    return 0;
  }
  
  public void b(d paramd)
  {
    if (paramd == null) {
      throw new IllegalStateException("please set a non-null listener");
    }
    Message localMessage = this.g.obtainMessage(5);
    localMessage.obj = paramd;
    localMessage.sendToTarget();
  }
  
  public void c()
  {
    this.w = false;
    this.g.obtainMessage(1).sendToTarget();
  }
  
  public void d()
  {
    this.w = true;
    this.g.obtainMessage(2).sendToTarget();
    this.B = null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */