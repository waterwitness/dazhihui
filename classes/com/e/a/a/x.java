package com.e.a.a;

import android.os.Looper;
import java.lang.ref.WeakReference;

public class x
{
  private final WeakReference<h> a;
  
  public x(h paramh)
  {
    this.a = new WeakReference(paramh);
  }
  
  public boolean a()
  {
    h localh = (h)this.a.get();
    return (localh == null) || (localh.b());
  }
  
  public boolean b()
  {
    h localh = (h)this.a.get();
    return (localh == null) || (localh.a());
  }
  
  public boolean c()
  {
    if ((!b()) && (!a())) {}
    for (boolean bool = false;; bool = true)
    {
      if (bool) {
        this.a.clear();
      }
      return bool;
    }
  }
  
  public boolean cancel(boolean paramBoolean)
  {
    h localh = (h)this.a.get();
    if (localh != null)
    {
      if (Looper.myLooper() != Looper.getMainLooper()) {
        break label46;
      }
      new Thread(new y(this, localh, paramBoolean)).start();
    }
    for (;;)
    {
      return false;
      label46:
      localh.cancel(paramBoolean);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\e\a\a\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */