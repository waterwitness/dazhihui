package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.c.q;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class ac<E>
  extends aa
{
  private final Activity a;
  final Context b;
  final int c;
  final af d = new af();
  private final Handler e;
  private q<String, bb> f;
  private boolean g;
  private bd h;
  private boolean i;
  private boolean j;
  
  ac(Activity paramActivity, Context paramContext, Handler paramHandler, int paramInt)
  {
    this.a = paramActivity;
    this.b = paramContext;
    this.e = paramHandler;
    this.c = paramInt;
  }
  
  ac(FragmentActivity paramFragmentActivity)
  {
    this(paramFragmentActivity, paramFragmentActivity, paramFragmentActivity.mHandler, 0);
  }
  
  bd a(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.f == null) {
      this.f = new q();
    }
    bd localbd = (bd)this.f.get(paramString);
    if (localbd == null)
    {
      if (paramBoolean2)
      {
        localbd = new bd(paramString, this, paramBoolean1);
        this.f.put(paramString, localbd);
      }
      return localbd;
    }
    localbd.a(this);
    return localbd;
  }
  
  public View a(int paramInt)
  {
    return null;
  }
  
  public void a(Fragment paramFragment, Intent paramIntent, int paramInt)
  {
    if (paramInt != -1) {
      throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }
    this.b.startActivity(paramIntent);
  }
  
  public void a(Fragment paramFragment, String[] paramArrayOfString, int paramInt) {}
  
  void a(q<String, bb> paramq)
  {
    this.f = paramq;
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {}
  
  void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
    if (this.h == null) {}
    while (!this.j) {
      return;
    }
    this.j = false;
    if (paramBoolean)
    {
      this.h.d();
      return;
    }
    this.h.c();
  }
  
  public boolean a()
  {
    return true;
  }
  
  public boolean a(Fragment paramFragment)
  {
    return true;
  }
  
  public boolean a(String paramString)
  {
    return false;
  }
  
  public LayoutInflater b()
  {
    return (LayoutInflater)this.b.getSystemService("layout_inflater");
  }
  
  void b(Fragment paramFragment) {}
  
  void b(String paramString)
  {
    if (this.f != null)
    {
      bd localbd = (bd)this.f.get(paramString);
      if ((localbd != null) && (!localbd.f))
      {
        localbd.h();
        this.f.remove(paramString);
      }
    }
  }
  
  void b(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mLoadersStarted=");
    paramPrintWriter.println(this.j);
    if (this.h != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("Loader Manager ");
      paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this.h)));
      paramPrintWriter.println(":");
      this.h.a(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  public void d() {}
  
  public boolean e()
  {
    return true;
  }
  
  public int f()
  {
    return this.c;
  }
  
  public abstract E g();
  
  Activity h()
  {
    return this.a;
  }
  
  Context i()
  {
    return this.b;
  }
  
  Handler j()
  {
    return this.e;
  }
  
  af k()
  {
    return this.d;
  }
  
  bd l()
  {
    if (this.h != null) {
      return this.h;
    }
    this.i = true;
    this.h = a("(root)", this.j, true);
    return this.h;
  }
  
  boolean m()
  {
    return this.g;
  }
  
  void n()
  {
    if (this.j) {
      return;
    }
    this.j = true;
    if (this.h != null) {
      this.h.b();
    }
    for (;;)
    {
      this.i = true;
      return;
      if (!this.i)
      {
        this.h = a("(root)", this.j, false);
        if ((this.h != null) && (!this.h.e)) {
          this.h.b();
        }
      }
    }
  }
  
  void o()
  {
    if (this.h == null) {
      return;
    }
    this.h.h();
  }
  
  void p()
  {
    if (this.f != null)
    {
      int m = this.f.size();
      bd[] arrayOfbd = new bd[m];
      int k = m - 1;
      while (k >= 0)
      {
        arrayOfbd[k] = ((bd)this.f.c(k));
        k -= 1;
      }
      k = 0;
      while (k < m)
      {
        bd localbd = arrayOfbd[k];
        localbd.e();
        localbd.g();
        k += 1;
      }
    }
  }
  
  q<String, bb> q()
  {
    int m = 0;
    int n;
    if (this.f != null)
    {
      int i1 = this.f.size();
      bd[] arrayOfbd = new bd[i1];
      int k = i1 - 1;
      while (k >= 0)
      {
        arrayOfbd[k] = ((bd)this.f.c(k));
        k -= 1;
      }
      k = 0;
      n = k;
      if (m < i1)
      {
        bd localbd = arrayOfbd[m];
        if (localbd.f) {
          k = 1;
        }
        for (;;)
        {
          m += 1;
          break;
          localbd.h();
          this.f.remove(localbd.d);
        }
      }
    }
    else
    {
      n = 0;
    }
    if (n != 0) {
      return this.f;
    }
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */