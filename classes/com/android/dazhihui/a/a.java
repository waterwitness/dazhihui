package com.android.dazhihui.a;

import android.content.Context;
import android.net.Proxy;
import android.os.Message;
import android.text.TextUtils;
import com.android.dazhihui.a.b.c;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.jni.DzhNative;
import com.android.dazhihui.jni.DzhNative.IDispatchReceive;
import java.util.Iterator;
import java.util.List;

public class a
  implements c, DzhNative.IDispatchReceive
{
  private Context a;
  private String b;
  private int c;
  private String d = null;
  private int e = -1;
  private int f = Integer.MIN_VALUE;
  private int g = 0;
  private m h;
  private Thread i = null;
  
  public a(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public a(Context paramContext, String paramString, int paramInt)
  {
    this.a = paramContext;
    a(paramString, paramInt);
  }
  
  private void c()
  {
    try
    {
      if ((this.i != null) && (this.i.isAlive()))
      {
        this.i.join(500L);
        if (this.i != null) {
          this.i.interrupt();
        }
      }
      this.i = null;
      return;
    }
    finally {}
  }
  
  public void a()
  {
    for (;;)
    {
      try
      {
        if (this.f >= 0) {
          b();
        }
        if (g.b)
        {
          this.d = System.getProperty("http.proxyHost");
          Object localObject1 = System.getProperty("http.proxyPort");
          if (localObject1 != null)
          {
            this.e = Integer.parseInt((String)localObject1);
            localObject1 = g.a().r();
            r localr = g.a().s();
            if ((TextUtils.isEmpty(this.d)) || (this.e == -1)) {
              break label188;
            }
            if (((localObject1 == w.c) && (localr == r.a)) || (localObject1 == w.b))
            {
              this.g = 1;
              this.i = new Thread(new b(this));
              this.i.start();
            }
          }
          else
          {
            localObject1 = "-1";
            continue;
          }
        }
        else
        {
          this.d = Proxy.getHost(this.a);
          this.e = Proxy.getPort(this.a);
          continue;
        }
        this.d = "";
      }
      finally {}
      this.e = 0;
      this.g = 0;
      continue;
      label188:
      this.d = "";
      this.e = 0;
      this.g = 0;
    }
  }
  
  public void a(int paramInt)
  {
    b();
  }
  
  public void a(m paramm)
  {
    this.h = paramm;
    paramm.a(this);
  }
  
  protected void a(Exception paramException) {}
  
  public void a(String paramString, int paramInt)
  {
    this.b = paramString;
    this.c = paramInt;
  }
  
  public void b()
  {
    try
    {
      c();
      if (this.f >= 0) {
        DzhNative.getInstance().closeConnection(this.f);
      }
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        localInterruptedException.printStackTrace();
      }
    }
    finally {}
  }
  
  public void exception(int paramInt)
  {
    Exception localException = new Exception();
    if (this.h != null)
    {
      Message localMessage = Message.obtain();
      localMessage.what = 1;
      localMessage.obj = localException;
      this.h.a(localMessage);
    }
    b();
    a(localException);
  }
  
  public void receiveData(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = o.d(paramArrayOfByte).iterator();
    while (paramArrayOfByte.hasNext())
    {
      o localo = (o)paramArrayOfByte.next();
      g.a().a(localo);
      g.a().a(this.h, localo);
      Message localMessage = Message.obtain();
      localMessage.what = 2;
      localMessage.obj = localo;
      this.h.a(localMessage);
    }
    b();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */