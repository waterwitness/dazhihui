package com.android.dazhihui.a.b;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class m
  extends a
{
  protected byte h = 123;
  protected n i = n.c;
  protected int j = 0;
  protected int k = 0;
  private CopyOnWriteArrayList<x> l = new CopyOnWriteArrayList();
  private boolean m = true;
  private boolean n = false;
  private String o = "";
  
  public m() {}
  
  public m(x paramx)
  {
    this.l.add(paramx);
    int i1 = this.l.size();
    this.j = i1;
    this.k = i1;
  }
  
  public m(x paramx, n paramn)
  {
    this.l.add(paramx);
    this.i = paramn;
    int i1 = this.l.size();
    this.j = i1;
    this.k = i1;
  }
  
  public m(x[] paramArrayOfx)
  {
    b(paramArrayOfx);
  }
  
  private void b(x[] paramArrayOfx)
  {
    if (paramArrayOfx != null)
    {
      int i2 = paramArrayOfx.length;
      i1 = 0;
      while (i1 < i2)
      {
        x localx = paramArrayOfx[i1];
        this.l.add(localx);
        i1 += 1;
      }
    }
    int i1 = this.l.size();
    this.j = i1;
    this.k = i1;
  }
  
  private byte[] c(x[] paramArrayOfx)
  {
    localObject = new ByteArrayOutputStream();
    try
    {
      bool = com.android.dazhihui.g.a().ab();
      ((ByteArrayOutputStream)localObject).write(this.h);
      i1 = 0;
    }
    catch (Exception paramArrayOfx)
    {
      paramArrayOfx.printStackTrace();
    }
    finally
    {
      for (;;)
      {
        int i1;
        int i4;
        try
        {
          ((ByteArrayOutputStream)localObject).close();
          if (!this.n) {
            t();
          }
          localObject = null;
          return (byte[])localObject;
          if (paramArrayOfx[i1].a() == 3000)
          {
            byte[] arrayOfByte = paramArrayOfx[i1].b();
            i3 = (short)arrayOfByte[2];
            i4 = (short)arrayOfByte[1];
            int i2 = i3;
            if (i3 >= 0) {
              break label436;
            }
            i2 = (short)(i3 + 256);
            break label436;
            if ((i3 << 8 | i2 << 16) >>> 8 == 104) {
              if (bool)
              {
                ((ByteArrayOutputStream)localObject).write(80);
                continue;
                paramArrayOfx = finally;
              }
            }
          }
        }
        catch (IOException paramArrayOfx)
        {
          try
          {
            boolean bool;
            ((ByteArrayOutputStream)localObject).close();
            if (!this.n) {
              t();
            }
            throw paramArrayOfx;
            ((ByteArrayOutputStream)localObject).write(16);
            continue;
            if (bool)
            {
              ((ByteArrayOutputStream)localObject).write(64);
              continue;
            }
            ((ByteArrayOutputStream)localObject).write(0);
            continue;
            if (bool)
            {
              ((ByteArrayOutputStream)localObject).write(64);
              continue;
            }
            ((ByteArrayOutputStream)localObject).write(0);
            continue;
            paramArrayOfx = ((ByteArrayOutputStream)localObject).toByteArray();
            try
            {
              ((ByteArrayOutputStream)localObject).close();
              localObject = paramArrayOfx;
              if (this.n) {
                continue;
              }
              t();
              return paramArrayOfx;
            }
            catch (IOException localIOException1)
            {
              continue;
            }
            paramArrayOfx = paramArrayOfx;
          }
          catch (IOException localIOException2)
          {
            continue;
          }
        }
        i1 += 1;
        continue;
        int i3 = i4;
        if (i4 < 0) {
          i3 = (short)(i4 + 256);
        }
      }
    }
    if (i1 < paramArrayOfx.length)
    {
      ((ByteArrayOutputStream)localObject).write(paramArrayOfx[i1].a() & 0xFF);
      ((ByteArrayOutputStream)localObject).write(paramArrayOfx[i1].a() >>> 8 & 0xFF);
      if ((paramArrayOfx[i1].a() == 2942) || (paramArrayOfx[i1].a() == 2944) || (paramArrayOfx[i1].a() == 2933) || (paramArrayOfx[i1].a() == 2951))
      {
        if (bool) {
          ((ByteArrayOutputStream)localObject).write(66);
        }
        for (;;)
        {
          ((ByteArrayOutputStream)localObject).write(0);
          ((ByteArrayOutputStream)localObject).write(paramArrayOfx[i1].b().length & 0xFF);
          ((ByteArrayOutputStream)localObject).write(paramArrayOfx[i1].b().length >>> 8 & 0xFF);
          ((ByteArrayOutputStream)localObject).write(paramArrayOfx[i1].b());
          if (i1 >= paramArrayOfx.length - 1) {
            break;
          }
          ((ByteArrayOutputStream)localObject).write(this.h);
          break;
          ((ByteArrayOutputStream)localObject).write(2);
        }
      }
    }
  }
  
  public void a(byte paramByte)
  {
    if (this.e == null)
    {
      this.h = 0;
      return;
    }
    this.h = paramByte;
  }
  
  public void a(Message paramMessage)
  {
    l();
    Object localObject = paramMessage.obj;
    if ((localObject != null) && ((localObject instanceof o)))
    {
      int i1 = this.k;
      int i2 = this.j;
      ((o)localObject).a(Integer.valueOf(i1 - i2 - 1));
    }
    this.g.sendMessage(paramMessage);
  }
  
  public void a(n paramn)
  {
    this.i = paramn;
  }
  
  public void a(x paramx)
  {
    this.l.add(paramx);
    int i1 = this.l.size();
    this.j = i1;
    this.k = i1;
  }
  
  public void a(String paramString)
  {
    this.o = paramString;
  }
  
  public void a(List<x> paramList)
  {
    t();
    if (paramList != null)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        x localx = (x)paramList.next();
        this.l.add(localx);
      }
    }
    int i1 = this.l.size();
    this.j = i1;
    this.k = i1;
  }
  
  public void a(x[] paramArrayOfx)
  {
    t();
    b(paramArrayOfx);
  }
  
  public void d(boolean paramBoolean)
  {
    this.m = paramBoolean;
  }
  
  public void e(boolean paramBoolean)
  {
    this.n = paramBoolean;
  }
  
  protected void k()
  {
    if (!this.m) {
      f();
    }
  }
  
  public void l()
  {
    this.j -= 1;
  }
  
  public byte[] n()
  {
    int i1 = 1;
    int i2 = 0;
    int i5 = 0;
    int i3 = 0;
    int i4 = 0;
    Object localObject = this.l.iterator();
    while (((Iterator)localObject).hasNext())
    {
      x localx = (x)((Iterator)localObject).next();
      if (com.android.dazhihui.g.a().L()) {
        Log.d("Protocol", localx.a() + " " + localx.g());
      } else {
        Log.d("Protocol", localx.a() + "");
      }
    }
    if ((this.i == n.a) || (this.i == n.d))
    {
      localObject = new x[this.l.size()];
      i1 = i4;
      while (i1 < this.l.size())
      {
        localObject[i1] = ((x)this.l.get(i1));
        i1 += 1;
      }
    }
    for (;;)
    {
      return c((x[])localObject);
      if (com.android.dazhihui.a.g.a().c() == 0L)
      {
        if (this.i == n.c)
        {
          localObject = new x[this.l.size() + 2];
          i1 = 0;
          while (i2 < this.l.size())
          {
            localObject[i1] = ((x)this.l.get(i2));
            i2 += 1;
            i1 += 1;
          }
          localObject[i1] = new x(2946);
          localObject[i1].d(com.android.dazhihui.ui.a.m.a().l());
          i1 += 1;
          localObject[i1] = new x(2963);
        }
        else
        {
          localObject = new x[this.l.size()];
          i1 = i5;
          while (i1 < this.l.size())
          {
            localObject[i1] = ((x)this.l.get(i1));
            i1 += 1;
          }
        }
      }
      else if (this.i == n.c)
      {
        i2 = this.l.size() + 3;
        i1 = i2;
        if (com.android.dazhihui.g.a().U()) {
          i1 = i2 + 1;
        }
        i2 = i1;
        if (com.android.dazhihui.g.a().V()) {
          i2 = i1 + 1;
        }
        localObject = new x[i2];
        localObject[0] = new x(2925);
        localObject[0].a(com.android.dazhihui.a.g.a().c());
        i1 = 1;
        i2 = 0;
        while (i2 < this.l.size())
        {
          localObject[i1] = ((x)this.l.get(i2));
          i2 += 1;
          i1 += 1;
        }
        localObject[i1] = new x(2946);
        localObject[i1].d(com.android.dazhihui.ui.a.m.a().l());
        i1 += 1;
        i2 = i1 + 1;
        localObject[i1] = new x(2963);
        i1 = i2;
        if (com.android.dazhihui.g.a().U())
        {
          localObject[i2] = new x(2602);
          localObject[i2].a("SH600859");
          localObject[i2].c(0);
          localObject[i2].c(com.android.dazhihui.g.a().W());
          localObject[i2].c(com.android.dazhihui.g.a().Y());
          i1 = i2 + 1;
        }
        if (com.android.dazhihui.g.a().V())
        {
          localObject[i1] = new x(2948);
          localObject[i1].b(2);
          localObject[i1].a(com.android.dazhihui.g.a().Z());
        }
      }
      else
      {
        localObject = new x[this.l.size() + 2];
        localObject[0] = new x(2925);
        localObject[0].a(com.android.dazhihui.a.g.a().c());
        i2 = i3;
        while (i2 < this.l.size())
        {
          localObject[i1] = ((x)this.l.get(i2));
          i2 += 1;
          i1 += 1;
        }
        localObject[i1] = new x(2963);
      }
    }
  }
  
  public void o()
  {
    int i1 = this.l.size();
    this.j = i1;
    this.k = i1;
  }
  
  public byte p()
  {
    return this.h;
  }
  
  public boolean q()
  {
    return this.j > 0;
  }
  
  public boolean r()
  {
    return this.m;
  }
  
  public List<x> s()
  {
    return this.l;
  }
  
  public void t()
  {
    try
    {
      Iterator localIterator = this.l.iterator();
      while (localIterator.hasNext())
      {
        x localx = (x)localIterator.next();
        if (localx != null) {
          localx.c();
        }
      }
      this.l.clear();
    }
    finally {}
  }
  
  public Handler u()
  {
    return this.g;
  }
  
  public String v()
  {
    return this.o;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\a\b\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */