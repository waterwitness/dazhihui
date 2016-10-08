package android.support.v4.content;

import android.support.v4.c.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class e<D>
{
  int a;
  g<D> b;
  f<D> c;
  boolean d;
  boolean e;
  boolean f;
  boolean g;
  boolean h;
  
  public String a(D paramD)
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    d.a(paramD, localStringBuilder);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public final void a()
  {
    this.d = true;
    this.f = false;
    this.e = false;
    b();
  }
  
  public void a(int paramInt, g<D> paramg)
  {
    if (this.b != null) {
      throw new IllegalStateException("There is already a listener registered");
    }
    this.b = paramg;
    this.a = paramInt;
  }
  
  public void a(f<D> paramf)
  {
    if (this.c != null) {
      throw new IllegalStateException("There is already a listener registered");
    }
    this.c = paramf;
  }
  
  public void a(g<D> paramg)
  {
    if (this.b == null) {
      throw new IllegalStateException("No listener register");
    }
    if (this.b != paramg) {
      throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    }
    this.b = null;
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mId=");
    paramPrintWriter.print(this.a);
    paramPrintWriter.print(" mListener=");
    paramPrintWriter.println(this.b);
    if ((this.d) || (this.g) || (this.h))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStarted=");
      paramPrintWriter.print(this.d);
      paramPrintWriter.print(" mContentChanged=");
      paramPrintWriter.print(this.g);
      paramPrintWriter.print(" mProcessingChange=");
      paramPrintWriter.println(this.h);
    }
    if ((this.e) || (this.f))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mAbandoned=");
      paramPrintWriter.print(this.e);
      paramPrintWriter.print(" mReset=");
      paramPrintWriter.println(this.f);
    }
  }
  
  protected void b() {}
  
  public void b(f<D> paramf)
  {
    if (this.c == null) {
      throw new IllegalStateException("No listener register");
    }
    if (this.c != paramf) {
      throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    }
    this.c = null;
  }
  
  public boolean c()
  {
    return d();
  }
  
  protected boolean d()
  {
    return false;
  }
  
  public void e()
  {
    this.d = false;
    f();
  }
  
  protected void f() {}
  
  public void g()
  {
    h();
    this.f = true;
    this.d = false;
    this.e = false;
    this.g = false;
    this.h = false;
  }
  
  protected void h() {}
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    d.a(this, localStringBuilder);
    localStringBuilder.append(" id=");
    localStringBuilder.append(this.a);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\content\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */