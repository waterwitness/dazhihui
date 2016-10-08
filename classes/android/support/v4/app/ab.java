package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.support.v4.c.q;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ab
{
  private final ac<?> a;
  
  private ab(ac<?> paramac)
  {
    this.a = paramac;
  }
  
  public static final ab a(ac<?> paramac)
  {
    return new ab(paramac);
  }
  
  public ad a()
  {
    return this.a.k();
  }
  
  public View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return this.a.d.a(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  public List<Fragment> a(List<Fragment> paramList)
  {
    if (this.a.d.f == null) {
      return null;
    }
    Object localObject = paramList;
    if (paramList == null) {
      localObject = new ArrayList(c());
    }
    ((List)localObject).addAll(this.a.d.f);
    return (List<Fragment>)localObject;
  }
  
  public void a(Configuration paramConfiguration)
  {
    this.a.d.a(paramConfiguration);
  }
  
  public void a(Parcelable paramParcelable, List<Fragment> paramList)
  {
    this.a.d.a(paramParcelable, paramList);
  }
  
  public void a(Fragment paramFragment)
  {
    this.a.d.a(this.a, this.a, paramFragment);
  }
  
  public void a(q<String, bb> paramq)
  {
    this.a.a(paramq);
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    this.a.b(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  public void a(boolean paramBoolean)
  {
    this.a.a(paramBoolean);
  }
  
  public boolean a(Menu paramMenu)
  {
    return this.a.d.a(paramMenu);
  }
  
  public boolean a(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    return this.a.d.a(paramMenu, paramMenuInflater);
  }
  
  public boolean a(MenuItem paramMenuItem)
  {
    return this.a.d.a(paramMenuItem);
  }
  
  public bb b()
  {
    return this.a.l();
  }
  
  public void b(Menu paramMenu)
  {
    this.a.d.b(paramMenu);
  }
  
  public boolean b(MenuItem paramMenuItem)
  {
    return this.a.d.b(paramMenuItem);
  }
  
  public int c()
  {
    ArrayList localArrayList = this.a.d.f;
    if (localArrayList == null) {
      return 0;
    }
    return localArrayList.size();
  }
  
  public void d()
  {
    this.a.d.k();
  }
  
  public Parcelable e()
  {
    return this.a.d.j();
  }
  
  public List<Fragment> f()
  {
    return this.a.d.i();
  }
  
  public void g()
  {
    this.a.d.l();
  }
  
  public void h()
  {
    this.a.d.m();
  }
  
  public void i()
  {
    this.a.d.n();
  }
  
  public void j()
  {
    this.a.d.o();
  }
  
  public void k()
  {
    this.a.d.p();
  }
  
  public void l()
  {
    this.a.d.q();
  }
  
  public void m()
  {
    this.a.d.r();
  }
  
  public void n()
  {
    this.a.d.t();
  }
  
  public void o()
  {
    this.a.d.u();
  }
  
  public boolean p()
  {
    return this.a.d.g();
  }
  
  public void q()
  {
    this.a.n();
  }
  
  public void r()
  {
    this.a.o();
  }
  
  public void s()
  {
    this.a.p();
  }
  
  public q<String, bb> t()
  {
    return this.a.q();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */