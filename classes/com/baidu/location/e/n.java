package com.baidu.location.e;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.os.Handler;
import com.baidu.location.b.l;
import com.baidu.location.f;

public class n
{
  private static n b = null;
  final Handler a = new Handler();
  private p c = null;
  private boolean d = false;
  private boolean e = false;
  private boolean f = false;
  private boolean g = true;
  private boolean h = false;
  
  public static n a()
  {
    if (b == null) {
      b = new n();
    }
    return b;
  }
  
  private void f()
  {
    Object localObject = NetworkInfo.State.UNKNOWN;
    try
    {
      NetworkInfo.State localState = ((ConnectivityManager)f.b().getSystemService("connectivity")).getNetworkInfo(1).getState();
      localObject = localState;
    }
    catch (Exception localException)
    {
      for (;;) {}
      this.d = true;
      this.a.postDelayed(new q(this, null), l.N);
      this.f = true;
      return;
    }
    if (NetworkInfo.State.CONNECTED == localObject) {
      if (this.d) {
        return;
      }
    }
    this.d = false;
  }
  
  /* Error */
  public void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 100	com/baidu/location/f:f	Z
    //   5: istore_2
    //   6: iload_2
    //   7: ifne +6 -> 13
    //   10: aload_0
    //   11: monitorexit
    //   12: return
    //   13: aload_0
    //   14: getfield 36	com/baidu/location/e/n:h	Z
    //   17: istore_2
    //   18: iload_2
    //   19: ifne -9 -> 10
    //   22: aload_0
    //   23: new 102	com/baidu/location/e/p
    //   26: dup
    //   27: aload_0
    //   28: aconst_null
    //   29: invokespecial 103	com/baidu/location/e/p:<init>	(Lcom/baidu/location/e/n;Lcom/baidu/location/e/o;)V
    //   32: putfield 26	com/baidu/location/e/n:c	Lcom/baidu/location/e/p;
    //   35: new 105	android/content/IntentFilter
    //   38: dup
    //   39: invokespecial 106	android/content/IntentFilter:<init>	()V
    //   42: astore_1
    //   43: aload_1
    //   44: ldc 108
    //   46: invokevirtual 112	android/content/IntentFilter:addAction	(Ljava/lang/String;)V
    //   49: invokestatic 61	com/baidu/location/f:b	()Landroid/content/Context;
    //   52: aload_0
    //   53: getfield 26	com/baidu/location/e/n:c	Lcom/baidu/location/e/p;
    //   56: aload_1
    //   57: invokevirtual 116	android/content/Context:registerReceiver	(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //   60: pop
    //   61: aload_0
    //   62: iconst_1
    //   63: putfield 30	com/baidu/location/e/n:e	Z
    //   66: aload_0
    //   67: invokespecial 48	com/baidu/location/e/n:f	()V
    //   70: aload_0
    //   71: iconst_1
    //   72: putfield 34	com/baidu/location/e/n:g	Z
    //   75: aload_0
    //   76: iconst_1
    //   77: putfield 36	com/baidu/location/e/n:h	Z
    //   80: goto -70 -> 10
    //   83: astore_1
    //   84: aload_0
    //   85: monitorexit
    //   86: aload_1
    //   87: athrow
    //   88: astore_1
    //   89: goto -19 -> 70
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	92	0	this	n
    //   42	15	1	localIntentFilter	android.content.IntentFilter
    //   83	4	1	localObject	Object
    //   88	1	1	localException	Exception
    //   5	14	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	6	83	finally
    //   13	18	83	finally
    //   22	70	83	finally
    //   70	80	83	finally
    //   22	70	88	java/lang/Exception
  }
  
  /* Error */
  public void c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 36	com/baidu/location/e/n:h	Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifne +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: invokestatic 61	com/baidu/location/f:b	()Landroid/content/Context;
    //   17: aload_0
    //   18: getfield 26	com/baidu/location/e/n:c	Lcom/baidu/location/e/p;
    //   21: invokevirtual 120	android/content/Context:unregisterReceiver	(Landroid/content/BroadcastReceiver;)V
    //   24: aload_0
    //   25: iconst_0
    //   26: putfield 34	com/baidu/location/e/n:g	Z
    //   29: aload_0
    //   30: iconst_0
    //   31: putfield 36	com/baidu/location/e/n:h	Z
    //   34: aload_0
    //   35: aconst_null
    //   36: putfield 26	com/baidu/location/e/n:c	Lcom/baidu/location/e/p;
    //   39: goto -28 -> 11
    //   42: astore_1
    //   43: aload_0
    //   44: monitorexit
    //   45: aload_1
    //   46: athrow
    //   47: astore_1
    //   48: goto -24 -> 24
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	51	0	this	n
    //   42	4	1	localObject	Object
    //   47	1	1	localException	Exception
    //   6	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	42	finally
    //   14	24	42	finally
    //   24	39	42	finally
    //   14	24	47	java/lang/Exception
  }
  
  public void d()
  {
    if (!this.h) {}
    do
    {
      return;
      this.g = true;
    } while ((this.f) || (!this.g));
    this.a.postDelayed(new q(this, null), l.N);
    this.f = true;
  }
  
  public void e()
  {
    this.g = false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\e\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */