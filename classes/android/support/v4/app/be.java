package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.c.d;
import android.support.v4.c.r;
import android.support.v4.content.e;
import android.support.v4.content.f;
import android.support.v4.content.g;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

final class be
  implements f<Object>, g<Object>
{
  final int a;
  final Bundle b;
  bc<Object> c;
  e<Object> d;
  boolean e;
  boolean f;
  Object g;
  boolean h;
  boolean i;
  boolean j;
  boolean k;
  boolean l;
  boolean m;
  be n;
  
  void a()
  {
    if ((this.i) && (this.j)) {
      this.h = true;
    }
    do
    {
      do
      {
        return;
      } while (this.h);
      this.h = true;
      if (bd.a) {
        Log.v("LoaderManager", "  Starting: " + this);
      }
      if ((this.d == null) && (this.c != null)) {
        this.d = this.c.a(this.a, this.b);
      }
    } while (this.d == null);
    if ((this.d.getClass().isMemberClass()) && (!Modifier.isStatic(this.d.getClass().getModifiers()))) {
      throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.d);
    }
    if (!this.m)
    {
      this.d.a(this.a, this);
      this.d.a(this);
      this.m = true;
    }
    this.d.a();
  }
  
  public void a(e<Object> parame)
  {
    if (bd.a) {
      Log.v("LoaderManager", "onLoadCanceled: " + this);
    }
    if (this.l) {
      if (bd.a) {
        Log.v("LoaderManager", "  Ignoring load canceled -- destroyed");
      }
    }
    do
    {
      do
      {
        return;
        if (this.o.b.a(this.a) == this) {
          break;
        }
      } while (!bd.a);
      Log.v("LoaderManager", "  Ignoring load canceled -- not active");
      return;
      parame = this.n;
    } while (parame == null);
    if (bd.a) {
      Log.v("LoaderManager", "  Switching to pending loader: " + parame);
    }
    this.n = null;
    this.o.b.b(this.a, null);
    f();
    this.o.a(parame);
  }
  
  void a(e<Object> parame, Object paramObject)
  {
    String str;
    if (this.c != null)
    {
      if (bd.a(this.o) == null) {
        break label158;
      }
      str = bd.a(this.o).d.v;
      bd.a(this.o).d.v = "onLoadFinished";
    }
    for (;;)
    {
      try
      {
        if (bd.a) {
          Log.v("LoaderManager", "  onLoadFinished in " + parame + ": " + parame.a(paramObject));
        }
        this.c.a(parame, paramObject);
        if (bd.a(this.o) != null) {
          bd.a(this.o).d.v = str;
        }
        this.f = true;
        return;
      }
      finally
      {
        if (bd.a(this.o) != null) {
          bd.a(this.o).d.v = str;
        }
      }
      label158:
      str = null;
    }
  }
  
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mId=");
    paramPrintWriter.print(this.a);
    paramPrintWriter.print(" mArgs=");
    paramPrintWriter.println(this.b);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mCallbacks=");
    paramPrintWriter.println(this.c);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mLoader=");
    paramPrintWriter.println(this.d);
    if (this.d != null) {
      this.d.a(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    if ((this.e) || (this.f))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mHaveData=");
      paramPrintWriter.print(this.e);
      paramPrintWriter.print("  mDeliveredData=");
      paramPrintWriter.println(this.f);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mData=");
      paramPrintWriter.println(this.g);
    }
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mStarted=");
    paramPrintWriter.print(this.h);
    paramPrintWriter.print(" mReportNextStart=");
    paramPrintWriter.print(this.k);
    paramPrintWriter.print(" mDestroyed=");
    paramPrintWriter.println(this.l);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mRetaining=");
    paramPrintWriter.print(this.i);
    paramPrintWriter.print(" mRetainingStarted=");
    paramPrintWriter.print(this.j);
    paramPrintWriter.print(" mListenerRegistered=");
    paramPrintWriter.println(this.m);
    if (this.n != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Pending Loader ");
      paramPrintWriter.print(this.n);
      paramPrintWriter.println(":");
      this.n.a(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  void b()
  {
    if (bd.a) {
      Log.v("LoaderManager", "  Retaining: " + this);
    }
    this.i = true;
    this.j = this.h;
    this.h = false;
    this.c = null;
  }
  
  void c()
  {
    if (this.i)
    {
      if (bd.a) {
        Log.v("LoaderManager", "  Finished Retaining: " + this);
      }
      this.i = false;
      if ((this.h != this.j) && (!this.h)) {
        e();
      }
    }
    if ((this.h) && (this.e) && (!this.k)) {
      a(this.d, this.g);
    }
  }
  
  void cancel()
  {
    if (bd.a) {
      Log.v("LoaderManager", "  Canceling: " + this);
    }
    if ((this.h) && (this.d != null) && (this.m) && (!this.d.c())) {
      a(this.d);
    }
  }
  
  void d()
  {
    if ((this.h) && (this.k))
    {
      this.k = false;
      if (this.e) {
        a(this.d, this.g);
      }
    }
  }
  
  void e()
  {
    if (bd.a) {
      Log.v("LoaderManager", "  Stopping: " + this);
    }
    this.h = false;
    if ((!this.i) && (this.d != null) && (this.m))
    {
      this.m = false;
      this.d.a(this);
      this.d.b(this);
      this.d.e();
    }
  }
  
  void f()
  {
    if (bd.a) {
      Log.v("LoaderManager", "  Destroying: " + this);
    }
    this.l = true;
    boolean bool = this.f;
    this.f = false;
    String str;
    if ((this.c != null) && (this.d != null) && (this.e) && (bool))
    {
      if (bd.a) {
        Log.v("LoaderManager", "  Reseting: " + this);
      }
      if (bd.a(this.o) == null) {
        break label280;
      }
      str = bd.a(this.o).d.v;
      bd.a(this.o).d.v = "onLoaderReset";
    }
    for (;;)
    {
      try
      {
        this.c.a(this.d);
        if (bd.a(this.o) != null) {
          bd.a(this.o).d.v = str;
        }
        this.c = null;
        this.g = null;
        this.e = false;
        if (this.d != null)
        {
          if (this.m)
          {
            this.m = false;
            this.d.a(this);
            this.d.b(this);
          }
          this.d.g();
        }
        if (this.n != null) {
          this.n.f();
        }
        return;
      }
      finally
      {
        if (bd.a(this.o) != null) {
          bd.a(this.o).d.v = str;
        }
      }
      label280:
      str = null;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    localStringBuilder.append("LoaderInfo{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" #");
    localStringBuilder.append(this.a);
    localStringBuilder.append(" : ");
    d.a(this.d, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */