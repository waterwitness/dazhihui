package com.g.a.a.a.a.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public final class d
{
  private final f b;
  private final boolean[] c;
  private boolean d;
  private boolean e;
  
  private d(a parama, f paramf)
  {
    this.b = paramf;
    if (f.d(paramf)) {}
    for (parama = null;; parama = new boolean[a.f(parama)])
    {
      this.c = parama;
      return;
    }
  }
  
  public OutputStream a(int paramInt)
  {
    synchronized (this.a)
    {
      if (f.a(this.b) != this) {
        throw new IllegalStateException();
      }
    }
    if (!f.d(this.b)) {
      this.c[paramInt] = true;
    }
    File localFile = this.b.b(paramInt);
    try
    {
      Object localObject2 = new FileOutputStream(localFile);
      localObject2 = new e(this, (OutputStream)localObject2, null);
      return (OutputStream)localObject2;
    }
    catch (FileNotFoundException localFileNotFoundException1)
    {
      for (;;)
      {
        a.g(this.a).mkdirs();
        try
        {
          FileOutputStream localFileOutputStream = new FileOutputStream(localFile);
        }
        catch (FileNotFoundException localFileNotFoundException2)
        {
          OutputStream localOutputStream = a.e();
          return localOutputStream;
        }
      }
    }
  }
  
  public void a()
  {
    if (this.d)
    {
      a.a(this.a, this, false);
      this.a.c(f.c(this.b));
    }
    for (;;)
    {
      this.e = true;
      return;
      a.a(this.a, this, true);
    }
  }
  
  public void b()
  {
    a.a(this.a, this, false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\g\a\a\a\a\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */