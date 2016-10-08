package com.tencent.qalsdk.sdk;

import com.tencent.qalsdk.base.remote.FromServiceMsg;
import java.util.concurrent.LinkedBlockingQueue;

class ad
{
  private String a;
  private Object b = new Object();
  protected int c;
  protected String d;
  protected String e;
  protected final LinkedBlockingQueue<w> f = new LinkedBlockingQueue();
  qalsdk.w g;
  
  public void a(String paramString1, int paramInt, String paramString2, qalsdk.w paramw)
  {
    this.c = paramInt;
    c(paramString2);
    this.e = paramString1;
    this.g = paramw;
  }
  
  public boolean a(FromServiceMsg arg1)
  {
    boolean bool = this.f.add(new w(null, ???));
    if ((??? != null) && (???.getServiceCmd() != null) && (???.getServiceCmd().equals("SharpSvr.s2c"))) {}
    synchronized (this.b)
    {
      this.b.notify();
      return bool;
    }
  }
  
  public boolean a(w arg1)
  {
    boolean bool = this.f.add(???);
    synchronized (this.b)
    {
      this.b.notify();
      return bool;
    }
  }
  
  public void c(String paramString)
  {
    this.a = paramString;
  }
  
  public LinkedBlockingQueue<w> j()
  {
    return this.f;
  }
  
  public String k()
  {
    return this.a;
  }
  
  public qalsdk.w l()
  {
    return this.g;
  }
  
  public void m()
  {
    try
    {
      synchronized (this.b)
      {
        if (this.f.size() == 0) {
          this.b.wait();
        }
        return;
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  public w n()
  {
    return (w)this.f.poll();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\sdk\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */