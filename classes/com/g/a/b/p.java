package com.g.a.b;

import android.graphics.Bitmap;
import android.os.Handler;
import com.g.a.b.a.g;
import com.g.a.b.a.i;
import com.g.a.b.f.b;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

final class p
  implements com.g.a.c.d, Runnable
{
  final String a;
  final com.g.a.b.e.a b;
  final d c;
  final com.g.a.b.f.a d;
  final b e;
  private final m f;
  private final o g;
  private final Handler h;
  private final h i;
  private final com.g.a.b.d.c j;
  private final com.g.a.b.d.c k;
  private final com.g.a.b.d.c l;
  private final com.g.a.b.b.d m;
  private final String n;
  private final com.g.a.b.a.f o;
  private final boolean p;
  private g q = g.a;
  
  public p(m paramm, o paramo, Handler paramHandler)
  {
    this.f = paramm;
    this.g = paramo;
    this.h = paramHandler;
    this.i = paramm.a;
    this.j = this.i.p;
    this.k = this.i.s;
    this.l = this.i.t;
    this.m = this.i.q;
    this.a = paramo.a;
    this.n = paramo.b;
    this.b = paramo.c;
    this.o = paramo.d;
    this.c = paramo.e;
    this.d = paramo.f;
    this.e = paramo.g;
    this.p = this.c.s();
  }
  
  private Bitmap a(String paramString)
  {
    i locali = this.b.c();
    paramString = new com.g.a.b.b.e(this.n, paramString, this.a, this.o, locali, h(), this.c);
    return this.m.a(paramString);
  }
  
  private void a(com.g.a.b.a.c paramc, Throwable paramThrowable)
  {
    if ((this.p) || (p()) || (j())) {
      return;
    }
    a(new r(this, paramc, paramThrowable), false, this.h, this.f);
  }
  
  static void a(Runnable paramRunnable, boolean paramBoolean, Handler paramHandler, m paramm)
  {
    if (paramBoolean)
    {
      paramRunnable.run();
      return;
    }
    if (paramHandler == null)
    {
      paramm.a(paramRunnable);
      return;
    }
    paramHandler.post(paramRunnable);
  }
  
  private boolean b()
  {
    AtomicBoolean localAtomicBoolean = this.f.a();
    if (localAtomicBoolean.get()) {}
    synchronized (this.f.b())
    {
      if (localAtomicBoolean.get()) {
        com.g.a.c.e.a("ImageLoader is paused. Waiting...  [%s]", new Object[] { this.n });
      }
      try
      {
        this.f.b().wait();
        com.g.a.c.e.a(".. Resume loading [%s]", new Object[] { this.n });
        return j();
      }
      catch (InterruptedException localInterruptedException)
      {
        com.g.a.c.e.d("Task was interrupted [%s]", new Object[] { this.n });
        return true;
      }
    }
  }
  
  private boolean b(int paramInt1, int paramInt2)
  {
    Object localObject1 = this.i.o.a(this.a);
    if ((localObject1 != null) && (((File)localObject1).exists()))
    {
      Object localObject2 = new com.g.a.b.a.f(paramInt1, paramInt2);
      d locald = new f().a(this.c).a(com.g.a.b.a.e.d).a();
      localObject1 = new com.g.a.b.b.e(this.n, com.g.a.b.d.d.c.b(((File)localObject1).getAbsolutePath()), this.a, (com.g.a.b.a.f)localObject2, i.a, h(), locald);
      localObject2 = this.m.a((com.g.a.b.b.e)localObject1);
      localObject1 = localObject2;
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if (this.i.f != null)
        {
          com.g.a.c.e.a("Process image before cache on disk [%s]", new Object[] { this.n });
          localObject2 = this.i.f.a((Bitmap)localObject2);
          localObject1 = localObject2;
          if (localObject2 == null)
          {
            com.g.a.c.e.d("Bitmap processor for disk cache returned null [%s]", new Object[] { this.n });
            localObject1 = localObject2;
          }
        }
      }
      if (localObject1 != null)
      {
        boolean bool = this.i.o.a(this.a, (Bitmap)localObject1);
        ((Bitmap)localObject1).recycle();
        return bool;
      }
    }
    return false;
  }
  
  private boolean c()
  {
    if (this.c.f())
    {
      com.g.a.c.e.a("Delay %d ms before loading...  [%s]", new Object[] { Integer.valueOf(this.c.l()), this.n });
      try
      {
        Thread.sleep(this.c.l());
        return j();
      }
      catch (InterruptedException localInterruptedException)
      {
        com.g.a.c.e.d("Task was interrupted [%s]", new Object[] { this.n });
        return true;
      }
    }
    return false;
  }
  
  private boolean c(int paramInt1, int paramInt2)
  {
    if ((p()) || (j())) {
      return false;
    }
    if (this.e != null) {
      a(new q(this, paramInt1, paramInt2), false, this.h, this.f);
    }
    return true;
  }
  
  private Bitmap d()
  {
    for (;;)
    {
      try
      {
        Object localObject1 = this.i.o.a(this.a);
        Object localObject3;
        Object localObject4;
        Object localObject5;
        Object localObject6;
        if ((localObject1 != null) && (((File)localObject1).exists()) && (((File)localObject1).length() > 0L))
        {
          com.g.a.c.e.a("Load image from disk cache [%s]", new Object[] { this.n });
          this.q = g.b;
          i();
          localObject1 = a(com.g.a.b.d.d.c.b(((File)localObject1).getAbsolutePath()));
          if (localObject1 != null)
          {
            localObject3 = localObject1;
            localObject4 = localObject1;
            localObject5 = localObject1;
            localObject6 = localObject1;
          }
        }
        Object localObject7;
        String str;
        File localFile;
        Object localObject2 = null;
      }
      catch (IllegalStateException localIllegalStateException1)
      {
        try
        {
          if (((Bitmap)localObject1).getWidth() > 0)
          {
            localObject7 = localObject1;
            localObject3 = localObject1;
            localObject4 = localObject1;
            localObject5 = localObject1;
            localObject6 = localObject1;
            if (((Bitmap)localObject1).getHeight() > 0) {}
          }
          else
          {
            localObject3 = localObject1;
            localObject4 = localObject1;
            localObject5 = localObject1;
            localObject6 = localObject1;
            com.g.a.c.e.a("Load image from network [%s]", new Object[] { this.n });
            localObject3 = localObject1;
            localObject4 = localObject1;
            localObject5 = localObject1;
            localObject6 = localObject1;
            this.q = g.a;
            localObject3 = localObject1;
            localObject4 = localObject1;
            localObject5 = localObject1;
            localObject6 = localObject1;
            str = this.a;
            localObject7 = str;
            localObject3 = localObject1;
            localObject4 = localObject1;
            localObject5 = localObject1;
            localObject6 = localObject1;
            if (this.c.i())
            {
              localObject7 = str;
              localObject3 = localObject1;
              localObject4 = localObject1;
              localObject5 = localObject1;
              localObject6 = localObject1;
              if (e())
              {
                localObject3 = localObject1;
                localObject4 = localObject1;
                localObject5 = localObject1;
                localObject6 = localObject1;
                localFile = this.i.o.a(this.a);
                localObject7 = str;
                if (localFile != null)
                {
                  localObject3 = localObject1;
                  localObject4 = localObject1;
                  localObject5 = localObject1;
                  localObject6 = localObject1;
                  localObject7 = com.g.a.b.d.d.c.b(localFile.getAbsolutePath());
                }
              }
            }
            localObject3 = localObject1;
            localObject4 = localObject1;
            localObject5 = localObject1;
            localObject6 = localObject1;
            i();
            localObject3 = localObject1;
            localObject4 = localObject1;
            localObject5 = localObject1;
            localObject6 = localObject1;
            localObject1 = a((String)localObject7);
            if (localObject1 != null)
            {
              localObject3 = localObject1;
              localObject4 = localObject1;
              localObject5 = localObject1;
              localObject6 = localObject1;
              if (((Bitmap)localObject1).getWidth() > 0)
              {
                localObject7 = localObject1;
                localObject3 = localObject1;
                localObject4 = localObject1;
                localObject5 = localObject1;
                localObject6 = localObject1;
                if (((Bitmap)localObject1).getHeight() > 0) {
                  continue;
                }
              }
            }
            localObject3 = localObject1;
            localObject4 = localObject1;
            localObject5 = localObject1;
            localObject6 = localObject1;
            a(com.g.a.b.a.c.b, null);
            localObject7 = localObject1;
          }
          return (Bitmap)localObject7;
        }
        catch (Throwable localThrowable2)
        {
          continue;
        }
        catch (OutOfMemoryError localOutOfMemoryError2)
        {
          continue;
        }
        catch (IOException localIOException2)
        {
          continue;
        }
        catch (IllegalStateException localIllegalStateException2)
        {
          continue;
        }
        localIllegalStateException1 = localIllegalStateException1;
        localObject6 = null;
        a(com.g.a.b.a.c.c, null);
        return (Bitmap)localObject6;
      }
      catch (t localt)
      {
        throw localt;
      }
      catch (IOException localIOException1)
      {
        localObject5 = null;
        com.g.a.c.e.a(localIOException1);
        a(com.g.a.b.a.c.a, localIOException1);
        return (Bitmap)localObject5;
      }
      catch (OutOfMemoryError localOutOfMemoryError1)
      {
        localObject4 = null;
        com.g.a.c.e.a(localOutOfMemoryError1);
        a(com.g.a.b.a.c.d, localOutOfMemoryError1);
        return (Bitmap)localObject4;
      }
      catch (Throwable localThrowable1)
      {
        localObject3 = null;
        com.g.a.c.e.a(localThrowable1);
        a(com.g.a.b.a.c.e, localThrowable1);
        return (Bitmap)localObject3;
      }
    }
  }
  
  private boolean e()
  {
    com.g.a.c.e.a("Cache image on disk [%s]", new Object[] { this.n });
    try
    {
      boolean bool = f();
      if (bool)
      {
        int i1 = this.i.d;
        int i2 = this.i.e;
        if ((i1 > 0) || (i2 > 0))
        {
          com.g.a.c.e.a("Resize image in disk cache [%s]", new Object[] { this.n });
          b(i1, i2);
        }
      }
      return bool;
    }
    catch (IOException localIOException)
    {
      com.g.a.c.e.a(localIOException);
    }
    return false;
  }
  
  private boolean f()
  {
    InputStream localInputStream = h().a(this.a, this.c.n());
    if (localInputStream == null)
    {
      com.g.a.c.e.d("No stream for image [%s]", new Object[] { this.n });
      return false;
    }
    try
    {
      boolean bool = this.i.o.a(this.a, localInputStream, this);
      return bool;
    }
    finally
    {
      com.g.a.c.c.a(localInputStream);
    }
  }
  
  private void g()
  {
    if ((this.p) || (p())) {
      return;
    }
    a(new s(this), false, this.h, this.f);
  }
  
  private com.g.a.b.d.c h()
  {
    if (this.f.c()) {
      return this.k;
    }
    if (this.f.d()) {
      return this.l;
    }
    return this.j;
  }
  
  private void i()
  {
    k();
    m();
  }
  
  private boolean j()
  {
    return (l()) || (n());
  }
  
  private void k()
  {
    if (l()) {
      throw new t(this);
    }
  }
  
  private boolean l()
  {
    if (this.b.e())
    {
      com.g.a.c.e.a("ImageAware was collected by GC. Task is cancelled. [%s]", new Object[] { this.n });
      return true;
    }
    return false;
  }
  
  private void m()
  {
    if (n()) {
      throw new t(this);
    }
  }
  
  private boolean n()
  {
    String str = this.f.a(this.b);
    if (!this.n.equals(str)) {}
    for (int i1 = 1; i1 != 0; i1 = 0)
    {
      com.g.a.c.e.a("ImageAware is reused for another image. Task is cancelled. [%s]", new Object[] { this.n });
      return true;
    }
    return false;
  }
  
  private void o()
  {
    if (p()) {
      throw new t(this);
    }
  }
  
  private boolean p()
  {
    if (Thread.interrupted())
    {
      com.g.a.c.e.a("Task was interrupted [%s]", new Object[] { this.n });
      return true;
    }
    return false;
  }
  
  String a()
  {
    return this.a;
  }
  
  public boolean a(int paramInt1, int paramInt2)
  {
    return (this.p) || (c(paramInt1, paramInt2));
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 411	com/g/a/b/p:b	()Z
    //   4: ifeq +4 -> 8
    //   7: return
    //   8: aload_0
    //   9: invokespecial 412	com/g/a/b/p:c	()Z
    //   12: ifne -5 -> 7
    //   15: aload_0
    //   16: getfield 54	com/g/a/b/p:g	Lcom/g/a/b/o;
    //   19: getfield 415	com/g/a/b/o:h	Ljava/util/concurrent/locks/ReentrantLock;
    //   22: astore_3
    //   23: ldc_w 417
    //   26: iconst_1
    //   27: anewarray 4	java/lang/Object
    //   30: dup
    //   31: iconst_0
    //   32: aload_0
    //   33: getfield 91	com/g/a/b/p:n	Ljava/lang/String;
    //   36: aastore
    //   37: invokestatic 184	com/g/a/c/e:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   40: aload_3
    //   41: invokevirtual 422	java/util/concurrent/locks/ReentrantLock:isLocked	()Z
    //   44: ifeq +20 -> 64
    //   47: ldc_w 424
    //   50: iconst_1
    //   51: anewarray 4	java/lang/Object
    //   54: dup
    //   55: iconst_0
    //   56: aload_0
    //   57: getfield 91	com/g/a/b/p:n	Ljava/lang/String;
    //   60: aastore
    //   61: invokestatic 184	com/g/a/c/e:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   64: aload_3
    //   65: invokevirtual 427	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   68: aload_0
    //   69: invokespecial 311	com/g/a/b/p:i	()V
    //   72: aload_0
    //   73: getfield 62	com/g/a/b/p:i	Lcom/g/a/b/h;
    //   76: getfield 430	com/g/a/b/h:n	Lcom/g/a/a/b/b;
    //   79: aload_0
    //   80: getfield 91	com/g/a/b/p:n	Ljava/lang/String;
    //   83: invokeinterface 433 2 0
    //   88: astore_2
    //   89: aload_2
    //   90: ifnull +10 -> 100
    //   93: aload_2
    //   94: invokevirtual 436	android/graphics/Bitmap:isRecycled	()Z
    //   97: ifeq +270 -> 367
    //   100: aload_0
    //   101: invokespecial 438	com/g/a/b/p:d	()Landroid/graphics/Bitmap;
    //   104: astore_2
    //   105: aload_2
    //   106: ifnonnull +8 -> 114
    //   109: aload_3
    //   110: invokevirtual 441	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   113: return
    //   114: aload_0
    //   115: invokespecial 311	com/g/a/b/p:i	()V
    //   118: aload_0
    //   119: invokespecial 443	com/g/a/b/p:o	()V
    //   122: aload_2
    //   123: astore_1
    //   124: aload_0
    //   125: getfield 103	com/g/a/b/p:c	Lcom/g/a/b/d;
    //   128: invokevirtual 444	com/g/a/b/d:d	()Z
    //   131: ifeq +59 -> 190
    //   134: ldc_w 446
    //   137: iconst_1
    //   138: anewarray 4	java/lang/Object
    //   141: dup
    //   142: iconst_0
    //   143: aload_0
    //   144: getfield 91	com/g/a/b/p:n	Ljava/lang/String;
    //   147: aastore
    //   148: invokestatic 184	com/g/a/c/e:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   151: aload_0
    //   152: getfield 103	com/g/a/b/p:c	Lcom/g/a/b/d;
    //   155: invokevirtual 449	com/g/a/b/d:o	()Lcom/g/a/b/g/a;
    //   158: aload_2
    //   159: invokeinterface 256 2 0
    //   164: astore_2
    //   165: aload_2
    //   166: astore_1
    //   167: aload_2
    //   168: ifnonnull +22 -> 190
    //   171: ldc_w 451
    //   174: iconst_1
    //   175: anewarray 4	java/lang/Object
    //   178: dup
    //   179: iconst_0
    //   180: aload_0
    //   181: getfield 91	com/g/a/b/p:n	Ljava/lang/String;
    //   184: aastore
    //   185: invokestatic 193	com/g/a/c/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   188: aload_2
    //   189: astore_1
    //   190: aload_1
    //   191: astore_2
    //   192: aload_1
    //   193: ifnull +52 -> 245
    //   196: aload_1
    //   197: astore_2
    //   198: aload_0
    //   199: getfield 103	com/g/a/b/p:c	Lcom/g/a/b/d;
    //   202: invokevirtual 453	com/g/a/b/d:h	()Z
    //   205: ifeq +40 -> 245
    //   208: ldc_w 455
    //   211: iconst_1
    //   212: anewarray 4	java/lang/Object
    //   215: dup
    //   216: iconst_0
    //   217: aload_0
    //   218: getfield 91	com/g/a/b/p:n	Ljava/lang/String;
    //   221: aastore
    //   222: invokestatic 184	com/g/a/c/e:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   225: aload_0
    //   226: getfield 62	com/g/a/b/p:i	Lcom/g/a/b/h;
    //   229: getfield 430	com/g/a/b/h:n	Lcom/g/a/a/b/b;
    //   232: aload_0
    //   233: getfield 91	com/g/a/b/p:n	Ljava/lang/String;
    //   236: aload_1
    //   237: invokeinterface 456 3 0
    //   242: pop
    //   243: aload_1
    //   244: astore_2
    //   245: aload_2
    //   246: astore_1
    //   247: aload_2
    //   248: ifnull +71 -> 319
    //   251: aload_2
    //   252: astore_1
    //   253: aload_0
    //   254: getfield 103	com/g/a/b/p:c	Lcom/g/a/b/d;
    //   257: invokevirtual 457	com/g/a/b/d:e	()Z
    //   260: ifeq +59 -> 319
    //   263: ldc_w 459
    //   266: iconst_1
    //   267: anewarray 4	java/lang/Object
    //   270: dup
    //   271: iconst_0
    //   272: aload_0
    //   273: getfield 91	com/g/a/b/p:n	Ljava/lang/String;
    //   276: aastore
    //   277: invokestatic 184	com/g/a/c/e:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   280: aload_0
    //   281: getfield 103	com/g/a/b/p:c	Lcom/g/a/b/d;
    //   284: invokevirtual 461	com/g/a/b/d:p	()Lcom/g/a/b/g/a;
    //   287: aload_2
    //   288: invokeinterface 256 2 0
    //   293: astore_2
    //   294: aload_2
    //   295: astore_1
    //   296: aload_2
    //   297: ifnonnull +22 -> 319
    //   300: ldc_w 463
    //   303: iconst_1
    //   304: anewarray 4	java/lang/Object
    //   307: dup
    //   308: iconst_0
    //   309: aload_0
    //   310: getfield 91	com/g/a/b/p:n	Ljava/lang/String;
    //   313: aastore
    //   314: invokestatic 193	com/g/a/c/e:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   317: aload_2
    //   318: astore_1
    //   319: aload_0
    //   320: invokespecial 311	com/g/a/b/p:i	()V
    //   323: aload_0
    //   324: invokespecial 443	com/g/a/b/p:o	()V
    //   327: aload_3
    //   328: invokevirtual 441	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   331: new 465	com/g/a/b/c
    //   334: dup
    //   335: aload_1
    //   336: aload_0
    //   337: getfield 54	com/g/a/b/p:g	Lcom/g/a/b/o;
    //   340: aload_0
    //   341: getfield 52	com/g/a/b/p:f	Lcom/g/a/b/m;
    //   344: aload_0
    //   345: getfield 50	com/g/a/b/p:q	Lcom/g/a/b/a/g;
    //   348: invokespecial 468	com/g/a/b/c:<init>	(Landroid/graphics/Bitmap;Lcom/g/a/b/o;Lcom/g/a/b/m;Lcom/g/a/b/a/g;)V
    //   351: aload_0
    //   352: getfield 118	com/g/a/b/p:p	Z
    //   355: aload_0
    //   356: getfield 56	com/g/a/b/p:h	Landroid/os/Handler;
    //   359: aload_0
    //   360: getfield 52	com/g/a/b/p:f	Lcom/g/a/b/m;
    //   363: invokestatic 152	com/g/a/b/p:a	(Ljava/lang/Runnable;ZLandroid/os/Handler;Lcom/g/a/b/m;)V
    //   366: return
    //   367: aload_0
    //   368: getstatic 470	com/g/a/b/a/g:c	Lcom/g/a/b/a/g;
    //   371: putfield 50	com/g/a/b/p:q	Lcom/g/a/b/a/g;
    //   374: ldc_w 472
    //   377: iconst_1
    //   378: anewarray 4	java/lang/Object
    //   381: dup
    //   382: iconst_0
    //   383: aload_0
    //   384: getfield 91	com/g/a/b/p:n	Ljava/lang/String;
    //   387: aastore
    //   388: invokestatic 184	com/g/a/c/e:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   391: goto -146 -> 245
    //   394: astore_1
    //   395: aload_0
    //   396: invokespecial 474	com/g/a/b/p:g	()V
    //   399: aload_3
    //   400: invokevirtual 441	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   403: return
    //   404: astore_1
    //   405: aload_3
    //   406: invokevirtual 441	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   409: aload_1
    //   410: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	411	0	this	p
    //   123	213	1	localObject1	Object
    //   394	1	1	localt	t
    //   404	6	1	localObject2	Object
    //   88	230	2	localObject3	Object
    //   22	384	3	localReentrantLock	java.util.concurrent.locks.ReentrantLock
    // Exception table:
    //   from	to	target	type
    //   68	89	394	com/g/a/b/t
    //   93	100	394	com/g/a/b/t
    //   100	105	394	com/g/a/b/t
    //   114	122	394	com/g/a/b/t
    //   124	165	394	com/g/a/b/t
    //   171	188	394	com/g/a/b/t
    //   198	243	394	com/g/a/b/t
    //   253	294	394	com/g/a/b/t
    //   300	317	394	com/g/a/b/t
    //   319	327	394	com/g/a/b/t
    //   367	391	394	com/g/a/b/t
    //   68	89	404	finally
    //   93	100	404	finally
    //   100	105	404	finally
    //   114	122	404	finally
    //   124	165	404	finally
    //   171	188	404	finally
    //   198	243	404	finally
    //   253	294	404	finally
    //   300	317	404	finally
    //   319	327	404	finally
    //   367	391	404	finally
    //   395	399	404	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\g\a\b\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */