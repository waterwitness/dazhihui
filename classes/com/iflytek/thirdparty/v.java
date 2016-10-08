package com.iflytek.thirdparty;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.iflytek.cloud.SpeechError;
import java.io.IOException;

public abstract class v
  extends Handler
{
  private aa a = new aa();
  private volatile v.b b = v.b.a;
  private HandlerThread c;
  private long d = 0L;
  protected int p = 60000;
  public int q = 16000;
  protected Context r = null;
  protected volatile boolean s = false;
  protected long t = 0L;
  protected int u = 20000;
  
  public v(Context paramContext)
  {
    super(paramContext.getMainLooper());
    this.r = paramContext;
    this.s = false;
  }
  
  public v(Context paramContext, HandlerThread paramHandlerThread)
  {
    super(paramHandlerThread.getLooper());
    this.c = paramHandlerThread;
    this.r = paramContext;
    this.s = false;
  }
  
  private void a()
  {
    if (this.c.isAlive())
    {
      w();
      this.c.quit();
      this.c = null;
    }
  }
  
  private void b()
  {
    this.d = System.currentTimeMillis();
  }
  
  private void c(SpeechError paramSpeechError)
  {
    for (;;)
    {
      try
      {
        if (!aQ.b()) {
          break;
        }
        aQ localaQ = aQ.d();
        if (localaQ == null) {
          break;
        }
        Object localObject = g();
        if (TextUtils.isEmpty((CharSequence)localObject)) {
          break;
        }
        localaQ.a(aQ.b, (String)localObject);
        localaQ.a(aQ.c, h());
        localObject = v();
        if ((localObject != null) && ("local".equals(((aa)localObject).e("engine_type"))))
        {
          localaQ.a(aQ.a, "csid:" + e());
          break label177;
          localaQ.a(aQ.e, i);
          localaQ.a(aQ.d, System.currentTimeMillis());
          localaQ.e();
        }
        else
        {
          localaQ.a(aQ.a, "sid:" + f());
        }
      }
      catch (Exception paramSpeechError)
      {
        X.b("DC exception:");
        X.a(paramSpeechError);
        return;
      }
      label177:
      do
      {
        i = paramSpeechError.getErrorCode();
        break;
      } while (paramSpeechError != null);
      int i = 0;
    }
  }
  
  private long h()
  {
    return this.d;
  }
  
  protected void a(int paramInt)
  {
    a(obtainMessage(paramInt), v.a.b, false, 0);
  }
  
  protected void a(int paramInt1, v.a parama, boolean paramBoolean, int paramInt2)
  {
    a(obtainMessage(paramInt1), parama, paramBoolean, paramInt2);
  }
  
  protected void a(Message paramMessage) {}
  
  protected void a(Message paramMessage, v.a parama, boolean paramBoolean, int paramInt)
  {
    if ((u() == v.b.f) || (u() == v.b.e)) {
      return;
    }
    switch (paramMessage.what)
    {
    }
    while ((parama == v.a.a) && (paramInt <= 0))
    {
      sendMessageAtFrontOfQueue(paramMessage);
      return;
      b();
      a(v.b.b);
      continue;
      a(v.b.d);
      continue;
      a(v.b.e);
    }
    sendMessageDelayed(paramMessage, paramInt);
  }
  
  protected void a(SpeechError paramSpeechError)
  {
    a(v.b.f);
    w();
    Z.a(this.r).b();
  }
  
  protected void a(aa paramaa)
  {
    this.a = paramaa.b();
    c();
  }
  
  /* Error */
  protected void a(v.b paramb)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 140	java/lang/StringBuilder
    //   5: dup
    //   6: invokespecial 141	java/lang/StringBuilder:<init>	()V
    //   9: ldc -16
    //   11: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   14: aload_0
    //   15: getfield 54	com/iflytek/thirdparty/v:b	Lcom/iflytek/thirdparty/v$b;
    //   18: invokevirtual 243	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   21: ldc -11
    //   23: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: aload_1
    //   27: invokevirtual 243	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   30: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   33: invokestatic 247	com/iflytek/thirdparty/X:a	(Ljava/lang/String;)V
    //   36: aload_0
    //   37: getfield 54	com/iflytek/thirdparty/v:b	Lcom/iflytek/thirdparty/v$b;
    //   40: astore_2
    //   41: getstatic 202	com/iflytek/thirdparty/v$b:f	Lcom/iflytek/thirdparty/v$b;
    //   44: astore_3
    //   45: aload_2
    //   46: aload_3
    //   47: if_acmpne +6 -> 53
    //   50: aload_0
    //   51: monitorexit
    //   52: return
    //   53: aload_0
    //   54: getfield 54	com/iflytek/thirdparty/v:b	Lcom/iflytek/thirdparty/v$b;
    //   57: getstatic 204	com/iflytek/thirdparty/v$b:e	Lcom/iflytek/thirdparty/v$b;
    //   60: if_acmpne +10 -> 70
    //   63: aload_1
    //   64: getstatic 202	com/iflytek/thirdparty/v$b:f	Lcom/iflytek/thirdparty/v$b;
    //   67: if_acmpne -17 -> 50
    //   70: new 140	java/lang/StringBuilder
    //   73: dup
    //   74: invokespecial 141	java/lang/StringBuilder:<init>	()V
    //   77: ldc -7
    //   79: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: aload_1
    //   83: invokevirtual 243	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   86: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   89: invokestatic 247	com/iflytek/thirdparty/X:a	(Ljava/lang/String;)V
    //   92: aload_0
    //   93: aload_1
    //   94: putfield 54	com/iflytek/thirdparty/v:b	Lcom/iflytek/thirdparty/v$b;
    //   97: aload_0
    //   98: invokestatic 254	android/os/SystemClock:elapsedRealtime	()J
    //   101: putfield 56	com/iflytek/thirdparty/v:t	J
    //   104: goto -54 -> 50
    //   107: astore_1
    //   108: aload_0
    //   109: monitorexit
    //   110: aload_1
    //   111: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	112	0	this	v
    //   0	112	1	paramb	v.b
    //   40	6	2	localb1	v.b
    //   44	3	3	localb2	v.b
    // Exception table:
    //   from	to	target	type
    //   2	45	107	finally
    //   53	70	107	finally
    //   70	104	107	finally
  }
  
  protected void a_()
  {
    a(0, v.a.a, false, 0);
  }
  
  protected void b(SpeechError paramSpeechError)
  {
    if (paramSpeechError != null) {}
    try
    {
      w();
      c(paramSpeechError);
      d(obtainMessage(21, paramSpeechError));
      return;
    }
    finally {}
  }
  
  public void b(boolean paramBoolean)
  {
    this.s = true;
    w();
    b(null);
  }
  
  protected void c()
  {
    this.u = this.a.a("timeout", this.u);
    this.q = this.a.a("sample_rate", this.q);
  }
  
  protected void d(Message paramMessage)
  {
    a(paramMessage, v.a.b, false, 0);
  }
  
  public abstract String e();
  
  public abstract String f();
  
  protected abstract String g();
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      try
      {
        switch (paramMessage.what)
        {
        case 8: 
          a(paramMessage);
        }
      }
      catch (IOException paramMessage)
      {
        X.a(paramMessage);
        paramMessage = new SpeechError(20010);
        if (paramMessage == null) {
          continue;
        }
        X.a(x() + " occur Error = " + paramMessage.toString());
        b(paramMessage);
        return;
      }
      catch (SpeechError paramMessage)
      {
        X.a(paramMessage);
        if (paramMessage == null) {
          continue;
        }
        X.a(x() + " occur Error = " + paramMessage.toString());
        b(paramMessage);
        return;
      }
      catch (Exception paramMessage)
      {
        X.a(paramMessage);
        paramMessage = new SpeechError(paramMessage);
        if (paramMessage == null) {
          continue;
        }
        X.a(x() + " occur Error = " + paramMessage.toString());
        b(paramMessage);
        return;
      }
      catch (UnsatisfiedLinkError paramMessage)
      {
        X.a(paramMessage);
        paramMessage = new SpeechError(20021);
        if (paramMessage == null) {
          continue;
        }
        X.a(x() + " occur Error = " + paramMessage.toString());
        b(paramMessage);
        return;
      }
      catch (Throwable paramMessage)
      {
        X.a(paramMessage);
        paramMessage = new SpeechError(20999);
        if (paramMessage == null) {
          continue;
        }
        X.a(x() + " occur Error = " + paramMessage.toString());
        b(paramMessage);
        return;
      }
      finally
      {
        if (0 == 0) {
          continue;
        }
        new StringBuilder().append(x()).append(" occur Error = ");
        throw new NullPointerException();
      }
      return;
      a((SpeechError)paramMessage.obj);
      a();
      return;
      throw new SpeechError(20002);
    }
  }
  
  public boolean m()
  {
    return false;
  }
  
  protected void o()
  {
    removeMessages(8);
    a(8, v.a.b, false, this.u);
  }
  
  public String p()
  {
    return this.a.b("pte", "utf-8");
  }
  
  public String q()
  {
    return this.a.b("text_encoding", "utf-8");
  }
  
  public String r()
  {
    return this.a.b("rse", "utf-8");
  }
  
  public int s()
  {
    return this.q;
  }
  
  public boolean t()
  {
    return (this.b != v.b.f) && (this.b != v.b.e) && (this.b != v.b.a);
  }
  
  protected v.b u()
  {
    try
    {
      v.b localb = this.b;
      return localb;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public aa v()
  {
    return this.a;
  }
  
  protected void w()
  {
    X.a("clear all message");
    int i = 0;
    while (i < 20)
    {
      removeMessages(i);
      i += 1;
    }
  }
  
  protected String x()
  {
    return getClass().toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */