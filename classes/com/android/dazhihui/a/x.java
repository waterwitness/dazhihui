package com.android.dazhihui.a;

import android.os.Process;
import com.android.dazhihui.a.b.m;
import java.util.Vector;

public abstract class x
  implements Runnable
{
  private Vector<m> a = new Vector(255);
  private Vector<m> b = new Vector(255);
  private boolean c = true;
  private Thread d = null;
  
  public x()
  {
    new Thread(this).start();
  }
  
  private boolean f()
  {
    return (this.d != null) && (this.d.isAlive());
  }
  
  protected abstract void a(m paramm);
  
  protected boolean a()
  {
    return this.b.size() < 5;
  }
  
  public void b()
  {
    try
    {
      this.b.clear();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  protected abstract boolean b(m paramm);
  
  public void c()
  {
    try
    {
      this.a.clear();
      this.b.clear();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void c(m paramm)
  {
    try
    {
      if (!f())
      {
        this.a.clear();
        this.b.clear();
        this.c = true;
        notifyAll();
        new Thread(this).start();
      }
      if (paramm != null)
      {
        this.a.add(paramm);
        notifyAll();
      }
      return;
    }
    finally {}
  }
  
  /* Error */
  public void d()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 20	com/android/dazhihui/a/x:c	Z
    //   4: ifeq +221 -> 225
    //   7: aload_0
    //   8: getfield 29	com/android/dazhihui/a/x:a	Ljava/util/Vector;
    //   11: invokevirtual 50	java/util/Vector:size	()I
    //   14: ifgt +11 -> 25
    //   17: aload_0
    //   18: monitorenter
    //   19: aload_0
    //   20: invokevirtual 70	java/lang/Object:wait	()V
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_0
    //   26: invokevirtual 72	com/android/dazhihui/a/x:a	()Z
    //   29: ifeq +118 -> 147
    //   32: aload_0
    //   33: getfield 29	com/android/dazhihui/a/x:a	Ljava/util/Vector;
    //   36: invokevirtual 50	java/util/Vector:size	()I
    //   39: ifle +108 -> 147
    //   42: aload_0
    //   43: monitorenter
    //   44: aload_0
    //   45: getfield 29	com/android/dazhihui/a/x:a	Ljava/util/Vector;
    //   48: invokevirtual 50	java/util/Vector:size	()I
    //   51: ifle +175 -> 226
    //   54: aload_0
    //   55: getfield 29	com/android/dazhihui/a/x:a	Ljava/util/Vector;
    //   58: iconst_0
    //   59: invokevirtual 76	java/util/Vector:remove	(I)Ljava/lang/Object;
    //   62: checkcast 78	com/android/dazhihui/a/b/m
    //   65: astore_2
    //   66: aload_2
    //   67: astore_1
    //   68: aload_2
    //   69: ifnull +33 -> 102
    //   72: aload_2
    //   73: astore_1
    //   74: aload_2
    //   75: invokevirtual 81	com/android/dazhihui/a/b/m:r	()Z
    //   78: ifeq +24 -> 102
    //   81: aload_2
    //   82: astore_1
    //   83: aload_0
    //   84: aload_2
    //   85: invokevirtual 83	com/android/dazhihui/a/x:b	(Lcom/android/dazhihui/a/b/m;)Z
    //   88: ifne +14 -> 102
    //   91: aload_0
    //   92: getfield 31	com/android/dazhihui/a/x:b	Ljava/util/Vector;
    //   95: aload_2
    //   96: invokevirtual 63	java/util/Vector:add	(Ljava/lang/Object;)Z
    //   99: pop
    //   100: aload_2
    //   101: astore_1
    //   102: aload_0
    //   103: monitorexit
    //   104: aload_1
    //   105: ifnull -105 -> 0
    //   108: aload_0
    //   109: aload_1
    //   110: invokevirtual 85	com/android/dazhihui/a/x:a	(Lcom/android/dazhihui/a/b/m;)V
    //   113: goto -113 -> 0
    //   116: astore_2
    //   117: aload_2
    //   118: invokevirtual 88	java/lang/Exception:printStackTrace	()V
    //   121: aload_0
    //   122: aload_1
    //   123: invokevirtual 90	com/android/dazhihui/a/x:d	(Lcom/android/dazhihui/a/b/m;)V
    //   126: goto -126 -> 0
    //   129: astore_1
    //   130: aload_0
    //   131: monitorexit
    //   132: aload_1
    //   133: athrow
    //   134: astore_1
    //   135: aload_1
    //   136: invokevirtual 91	java/lang/InterruptedException:printStackTrace	()V
    //   139: goto -114 -> 25
    //   142: astore_1
    //   143: aload_0
    //   144: monitorexit
    //   145: aload_1
    //   146: athrow
    //   147: aload_0
    //   148: monitorenter
    //   149: aload_0
    //   150: getfield 31	com/android/dazhihui/a/x:b	Ljava/util/Vector;
    //   153: invokevirtual 50	java/util/Vector:size	()I
    //   156: ifle +44 -> 200
    //   159: aload_0
    //   160: getfield 31	com/android/dazhihui/a/x:b	Ljava/util/Vector;
    //   163: iconst_0
    //   164: invokevirtual 94	java/util/Vector:get	(I)Ljava/lang/Object;
    //   167: checkcast 78	com/android/dazhihui/a/b/m
    //   170: astore_1
    //   171: aload_1
    //   172: ifnull +28 -> 200
    //   175: invokestatic 100	java/lang/System:currentTimeMillis	()J
    //   178: aload_1
    //   179: invokevirtual 102	com/android/dazhihui/a/b/m:d	()J
    //   182: aload_1
    //   183: invokevirtual 104	com/android/dazhihui/a/b/m:c	()J
    //   186: ladd
    //   187: lcmp
    //   188: ifle +12 -> 200
    //   191: aload_0
    //   192: getfield 31	com/android/dazhihui/a/x:b	Ljava/util/Vector;
    //   195: aload_1
    //   196: invokevirtual 106	java/util/Vector:remove	(Ljava/lang/Object;)Z
    //   199: pop
    //   200: aload_0
    //   201: ldc2_w 107
    //   204: invokevirtual 111	java/lang/Object:wait	(J)V
    //   207: aload_0
    //   208: monitorexit
    //   209: goto -209 -> 0
    //   212: astore_1
    //   213: aload_0
    //   214: monitorexit
    //   215: aload_1
    //   216: athrow
    //   217: astore_1
    //   218: aload_1
    //   219: invokevirtual 91	java/lang/InterruptedException:printStackTrace	()V
    //   222: goto -15 -> 207
    //   225: return
    //   226: aconst_null
    //   227: astore_1
    //   228: goto -126 -> 102
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	231	0	this	x
    //   67	56	1	localm1	m
    //   129	4	1	localObject1	Object
    //   134	2	1	localInterruptedException1	InterruptedException
    //   142	4	1	localObject2	Object
    //   170	26	1	localm2	m
    //   212	4	1	localObject3	Object
    //   217	2	1	localInterruptedException2	InterruptedException
    //   227	1	1	localObject4	Object
    //   65	36	2	localm3	m
    //   116	2	2	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   108	113	116	java/lang/Exception
    //   19	25	129	finally
    //   130	132	129	finally
    //   7	19	134	java/lang/InterruptedException
    //   132	134	134	java/lang/InterruptedException
    //   44	66	142	finally
    //   74	81	142	finally
    //   83	100	142	finally
    //   102	104	142	finally
    //   143	145	142	finally
    //   149	171	212	finally
    //   175	200	212	finally
    //   200	207	212	finally
    //   207	209	212	finally
    //   213	215	212	finally
    //   218	222	212	finally
    //   200	207	217	java/lang/InterruptedException
  }
  
  public void d(m paramm)
  {
    try
    {
      if (this.a.contains(paramm)) {
        this.a.remove(paramm);
      }
      if (this.b.contains(paramm)) {
        this.b.remove(paramm);
      }
      e();
      return;
    }
    finally {}
  }
  
  public void e()
  {
    try
    {
      notifyAll();
      return;
    }
    finally {}
  }
  
  public void e(m paramm)
  {
    try
    {
      if (this.b.contains(paramm)) {
        this.b.remove(paramm);
      }
      e();
      return;
    }
    finally {}
  }
  
  public void run()
  {
    Process.setThreadPriority(10);
    Thread.currentThread().setName("RequestHandler");
    this.d = Thread.currentThread();
    d();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\a\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */