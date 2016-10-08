package com.android.dazhihui.ui.widget.a;

import java.io.FileOutputStream;
import java.io.OutputStream;

public final class n
{
  private final p b;
  private boolean c;
  
  private n(l paraml, p paramp)
  {
    this.b = paramp;
  }
  
  public OutputStream a(int paramInt)
  {
    synchronized (this.a)
    {
      if (p.a(this.b) != this) {
        throw new IllegalStateException();
      }
    }
    o localo = new o(this, new FileOutputStream(this.b.b(paramInt)), null);
    return localo;
  }
  
  public void a()
  {
    if (this.c)
    {
      l.a(this.a, this, false);
      this.a.c(p.c(this.b));
      return;
    }
    l.a(this.a, this, true);
  }
  
  public void b()
  {
    l.a(this.a, this, false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */