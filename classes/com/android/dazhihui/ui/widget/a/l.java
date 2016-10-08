package com.android.dazhihui.ui.widget.a;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class l
  implements Closeable
{
  private static final Charset a = Charset.forName("UTF-8");
  private final File b;
  private final File c;
  private final File d;
  private final int e;
  private final long f;
  private final int g;
  private long h = 0L;
  private Writer i;
  private final LinkedHashMap<String, p> j = new LinkedHashMap(0, 0.75F, true);
  private int k;
  private long l = 0L;
  private final ExecutorService m = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
  private final Callable<Void> n = new m(this);
  
  private l(File paramFile, int paramInt1, int paramInt2, long paramLong)
  {
    this.b = paramFile;
    this.e = paramInt1;
    this.c = new File(paramFile, "journal");
    this.d = new File(paramFile, "journal.tmp");
    this.g = paramInt2;
    this.f = paramLong;
  }
  
  public static l a(File paramFile, int paramInt1, int paramInt2, long paramLong)
  {
    if (paramLong <= 0L) {
      throw new IllegalArgumentException("maxSize <= 0");
    }
    if (paramInt2 <= 0) {
      throw new IllegalArgumentException("valueCount <= 0");
    }
    l locall = new l(paramFile, paramInt1, paramInt2, paramLong);
    if (locall.c.exists()) {
      try
      {
        locall.c();
        locall.d();
        locall.i = new BufferedWriter(new FileWriter(locall.c, true), 8192);
        return locall;
      }
      catch (IOException localIOException) {}
    }
    try
    {
      locall.b();
      paramFile.mkdirs();
      paramFile = new l(paramFile, paramInt1, paramInt2, paramLong);
      paramFile.e();
      return paramFile;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
  }
  
  private n a(String paramString, long paramLong)
  {
    for (;;)
    {
      n localn;
      try
      {
        g();
        e(paramString);
        p localp = (p)this.j.get(paramString);
        if (paramLong != -1L) {
          if (localp != null)
          {
            long l1 = p.e(localp);
            if (l1 == paramLong) {}
          }
          else
          {
            paramString = null;
            return paramString;
          }
        }
        if (localp == null)
        {
          localp = new p(this, paramString, null);
          this.j.put(paramString, localp);
          localn = new n(this, localp, null);
          p.a(localp, localn);
          this.i.write("DIRTY " + paramString + '\n');
          this.i.flush();
          paramString = localn;
          continue;
        }
        localn = p.a(localp);
      }
      finally {}
      if (localn != null) {
        paramString = null;
      }
    }
  }
  
  public static String a(InputStream paramInputStream)
  {
    StringBuilder localStringBuilder = new StringBuilder(80);
    for (;;)
    {
      int i1 = paramInputStream.read();
      if (i1 == -1) {
        throw new EOFException();
      }
      if (i1 == 10)
      {
        i1 = localStringBuilder.length();
        if ((i1 > 0) && (localStringBuilder.charAt(i1 - 1) == '\r')) {
          localStringBuilder.setLength(i1 - 1);
        }
        return localStringBuilder.toString();
      }
      localStringBuilder.append((char)i1);
    }
  }
  
  private void a(n paramn, boolean paramBoolean)
  {
    int i3 = 0;
    p localp;
    try
    {
      localp = n.a(paramn);
      if (p.a(localp) != paramn) {
        throw new IllegalStateException();
      }
    }
    finally {}
    int i2 = i3;
    int i1;
    if (paramBoolean)
    {
      i2 = i3;
      if (!p.d(localp))
      {
        i1 = 0;
        i2 = i3;
        if (i1 < this.g)
        {
          if (localp.b(i1).exists()) {
            break label385;
          }
          paramn.b();
          throw new IllegalStateException("edit didn't create file " + i1);
        }
      }
    }
    for (;;)
    {
      long l1;
      if (i2 < this.g)
      {
        paramn = localp.b(i2);
        if (paramBoolean)
        {
          if (paramn.exists())
          {
            File localFile = localp.a(i2);
            paramn.renameTo(localFile);
            l1 = p.b(localp)[i2];
            long l2 = localFile.length();
            p.b(localp)[i2] = l2;
            this.h = (this.h - l1 + l2);
          }
        }
        else {
          b(paramn);
        }
      }
      else
      {
        this.k += 1;
        p.a(localp, null);
        if ((p.d(localp) | paramBoolean))
        {
          p.a(localp, true);
          this.i.write("CLEAN " + p.c(localp) + localp.a() + '\n');
          if (paramBoolean)
          {
            l1 = this.l;
            this.l = (1L + l1);
            p.a(localp, l1);
          }
        }
        for (;;)
        {
          if ((this.h > this.f) || (f())) {
            this.m.submit(this.n);
          }
          return;
          this.j.remove(p.c(localp));
          this.i.write("REMOVE " + p.c(localp) + '\n');
        }
        label385:
        i1 += 1;
        break;
      }
      i2 += 1;
    }
  }
  
  public static void a(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (RuntimeException paramCloseable)
    {
      throw paramCloseable;
    }
    catch (Exception paramCloseable) {}
  }
  
  public static void a(File paramFile)
  {
    File[] arrayOfFile = paramFile.listFiles();
    if (arrayOfFile == null) {
      throw new IllegalArgumentException("not a directory: " + paramFile);
    }
    int i2 = arrayOfFile.length;
    int i1 = 0;
    while (i1 < i2)
    {
      paramFile = arrayOfFile[i1];
      if (paramFile.isDirectory()) {
        a(paramFile);
      }
      if (!paramFile.delete()) {
        throw new IOException("failed to delete file: " + paramFile);
      }
      i1 += 1;
    }
  }
  
  private static <T> T[] a(T[] paramArrayOfT, int paramInt1, int paramInt2)
  {
    int i1 = paramArrayOfT.length;
    if (paramInt1 > paramInt2) {
      throw new IllegalArgumentException();
    }
    if ((paramInt1 < 0) || (paramInt1 > i1)) {
      throw new ArrayIndexOutOfBoundsException();
    }
    paramInt2 -= paramInt1;
    i1 = Math.min(paramInt2, i1 - paramInt1);
    Object[] arrayOfObject = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), paramInt2);
    System.arraycopy(paramArrayOfT, paramInt1, arrayOfObject, 0, i1);
    return arrayOfObject;
  }
  
  private static void b(File paramFile)
  {
    if ((paramFile.exists()) && (!paramFile.delete())) {
      throw new IOException();
    }
  }
  
  private void c()
  {
    BufferedInputStream localBufferedInputStream = new BufferedInputStream(new FileInputStream(this.c), 8192);
    try
    {
      String str1 = a(localBufferedInputStream);
      String str2 = a(localBufferedInputStream);
      String str3 = a(localBufferedInputStream);
      String str4 = a(localBufferedInputStream);
      String str5 = a(localBufferedInputStream);
      if ((!"libcore.io.DiskLruCache".equals(str1)) || (!"1".equals(str2)) || (!Integer.toString(this.e).equals(str3)) || (!Integer.toString(this.g).equals(str4)) || (!"".equals(str5))) {
        throw new IOException("unexpected journal header: [" + str1 + ", " + str2 + ", " + str4 + ", " + str5 + "]");
      }
    }
    finally
    {
      a(localBufferedInputStream);
    }
  }
  
  private void d()
  {
    b(this.d);
    Iterator localIterator = this.j.values().iterator();
    while (localIterator.hasNext())
    {
      p localp = (p)localIterator.next();
      int i1;
      if (p.a(localp) == null)
      {
        i1 = 0;
        while (i1 < this.g)
        {
          this.h += p.b(localp)[i1];
          i1 += 1;
        }
      }
      else
      {
        p.a(localp, null);
        i1 = 0;
        while (i1 < this.g)
        {
          b(localp.a(i1));
          b(localp.b(i1));
          i1 += 1;
        }
        localIterator.remove();
      }
    }
  }
  
  private void d(String paramString)
  {
    String[] arrayOfString = paramString.split(" ");
    if (arrayOfString.length < 2) {
      throw new IOException("unexpected journal line: " + paramString);
    }
    String str = arrayOfString[1];
    if ((arrayOfString[0].equals("REMOVE")) && (arrayOfString.length == 2))
    {
      this.j.remove(str);
      return;
    }
    p localp = (p)this.j.get(str);
    if (localp == null)
    {
      localp = new p(this, str, null);
      this.j.put(str, localp);
    }
    for (;;)
    {
      if ((arrayOfString[0].equals("CLEAN")) && (arrayOfString.length == this.g + 2))
      {
        p.a(localp, true);
        p.a(localp, null);
        p.a(localp, (String[])a(arrayOfString, 2, arrayOfString.length));
        return;
      }
      if ((arrayOfString[0].equals("DIRTY")) && (arrayOfString.length == 2))
      {
        p.a(localp, new n(this, localp, null));
        return;
      }
      if ((arrayOfString[0].equals("READ")) && (arrayOfString.length == 2)) {
        break;
      }
      throw new IOException("unexpected journal line: " + paramString);
    }
  }
  
  private void e()
  {
    for (;;)
    {
      try
      {
        if (this.i != null) {
          this.i.close();
        }
        BufferedWriter localBufferedWriter = new BufferedWriter(new FileWriter(this.d), 8192);
        localBufferedWriter.write("libcore.io.DiskLruCache");
        localBufferedWriter.write("\n");
        localBufferedWriter.write("1");
        localBufferedWriter.write("\n");
        localBufferedWriter.write(Integer.toString(this.e));
        localBufferedWriter.write("\n");
        localBufferedWriter.write(Integer.toString(this.g));
        localBufferedWriter.write("\n");
        localBufferedWriter.write("\n");
        Iterator localIterator = this.j.values().iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        p localp = (p)localIterator.next();
        if (p.a(localp) != null) {
          localBufferedWriter.write("DIRTY " + p.c(localp) + '\n');
        } else {
          ((Writer)localObject).write("CLEAN " + p.c(localp) + localp.a() + '\n');
        }
      }
      finally {}
    }
    ((Writer)localObject).close();
    this.d.renameTo(this.c);
    this.i = new BufferedWriter(new FileWriter(this.c, true), 8192);
  }
  
  private void e(String paramString)
  {
    if ((paramString.contains(" ")) || (paramString.contains("\n")) || (paramString.contains("\r"))) {
      throw new IllegalArgumentException("keys must not contain spaces or newlines: \"" + paramString + "\"");
    }
  }
  
  private boolean f()
  {
    return (this.k >= 2000) && (this.k >= this.j.size());
  }
  
  private void g()
  {
    if (this.i == null) {
      throw new IllegalStateException("cache is closed");
    }
  }
  
  private void h()
  {
    while (this.h > this.f) {
      c((String)((Map.Entry)this.j.entrySet().iterator().next()).getKey());
    }
  }
  
  /* Error */
  public q a(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: invokespecial 157	com/android/dazhihui/ui/widget/a/l:g	()V
    //   8: aload_0
    //   9: aload_1
    //   10: invokespecial 159	com/android/dazhihui/ui/widget/a/l:e	(Ljava/lang/String;)V
    //   13: aload_0
    //   14: getfield 57	com/android/dazhihui/ui/widget/a/l:j	Ljava/util/LinkedHashMap;
    //   17: aload_1
    //   18: invokevirtual 163	java/util/LinkedHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   21: checkcast 165	com/android/dazhihui/ui/widget/a/p
    //   24: astore 4
    //   26: aload 4
    //   28: ifnonnull +9 -> 37
    //   31: aload_3
    //   32: astore_2
    //   33: aload_0
    //   34: monitorexit
    //   35: aload_2
    //   36: areturn
    //   37: aload_3
    //   38: astore_2
    //   39: aload 4
    //   41: invokestatic 249	com/android/dazhihui/ui/widget/a/p:d	(Lcom/android/dazhihui/ui/widget/a/p;)Z
    //   44: ifeq -11 -> 33
    //   47: aload_0
    //   48: getfield 103	com/android/dazhihui/ui/widget/a/l:g	I
    //   51: anewarray 219	java/io/InputStream
    //   54: astore_2
    //   55: iconst_0
    //   56: istore 5
    //   58: iload 5
    //   60: aload_0
    //   61: getfield 103	com/android/dazhihui/ui/widget/a/l:g	I
    //   64: if_icmpge +30 -> 94
    //   67: aload_2
    //   68: iload 5
    //   70: new 369	java/io/FileInputStream
    //   73: dup
    //   74: aload 4
    //   76: iload 5
    //   78: invokevirtual 261	com/android/dazhihui/ui/widget/a/p:a	(I)Ljava/io/File;
    //   81: invokespecial 371	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   84: aastore
    //   85: iload 5
    //   87: iconst_1
    //   88: iadd
    //   89: istore 5
    //   91: goto -33 -> 58
    //   94: aload_0
    //   95: aload_0
    //   96: getfield 108	com/android/dazhihui/ui/widget/a/l:k	I
    //   99: iconst_1
    //   100: iadd
    //   101: putfield 108	com/android/dazhihui/ui/widget/a/l:k	I
    //   104: aload_0
    //   105: getfield 144	com/android/dazhihui/ui/widget/a/l:i	Ljava/io/Writer;
    //   108: new 187	java/lang/StringBuilder
    //   111: dup
    //   112: invokespecial 188	java/lang/StringBuilder:<init>	()V
    //   115: ldc_w 489
    //   118: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: aload_1
    //   122: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: bipush 10
    //   127: invokevirtual 197	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   130: invokevirtual 201	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   133: invokevirtual 492	java/io/Writer:append	(Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   136: pop
    //   137: aload_0
    //   138: invokespecial 289	com/android/dazhihui/ui/widget/a/l:f	()Z
    //   141: ifeq +17 -> 158
    //   144: aload_0
    //   145: getfield 77	com/android/dazhihui/ui/widget/a/l:m	Ljava/util/concurrent/ExecutorService;
    //   148: aload_0
    //   149: getfield 84	com/android/dazhihui/ui/widget/a/l:n	Ljava/util/concurrent/Callable;
    //   152: invokeinterface 295 2 0
    //   157: pop
    //   158: new 494	com/android/dazhihui/ui/widget/a/q
    //   161: dup
    //   162: aload_0
    //   163: aload_1
    //   164: aload 4
    //   166: invokestatic 170	com/android/dazhihui/ui/widget/a/p:e	(Lcom/android/dazhihui/ui/widget/a/p;)J
    //   169: aload_2
    //   170: aconst_null
    //   171: invokespecial 497	com/android/dazhihui/ui/widget/a/q:<init>	(Lcom/android/dazhihui/ui/widget/a/l;Ljava/lang/String;J[Ljava/io/InputStream;Lcom/android/dazhihui/ui/widget/a/m;)V
    //   174: astore_2
    //   175: goto -142 -> 33
    //   178: astore_1
    //   179: aload_0
    //   180: monitorexit
    //   181: aload_1
    //   182: athrow
    //   183: astore_1
    //   184: aload_3
    //   185: astore_2
    //   186: goto -153 -> 33
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	189	0	this	l
    //   0	189	1	paramString	String
    //   32	154	2	localObject1	Object
    //   1	184	3	localObject2	Object
    //   24	141	4	localp	p
    //   56	34	5	i1	int
    // Exception table:
    //   from	to	target	type
    //   4	26	178	finally
    //   39	55	178	finally
    //   58	85	178	finally
    //   94	158	178	finally
    //   158	175	178	finally
    //   58	85	183	java/io/FileNotFoundException
  }
  
  public boolean a()
  {
    return this.i == null;
  }
  
  public n b(String paramString)
  {
    return a(paramString, -1L);
  }
  
  public void b()
  {
    close();
    a(this.b);
  }
  
  public boolean c(String paramString)
  {
    int i1 = 0;
    for (;;)
    {
      try
      {
        g();
        e(paramString);
        p localp = (p)this.j.get(paramString);
        Object localObject;
        if (localp != null)
        {
          localObject = p.a(localp);
          if (localObject == null) {}
        }
        else
        {
          bool = false;
          return bool;
          this.h -= p.b(localp)[i1];
          p.b(localp)[i1] = 0L;
          i1 += 1;
        }
        if (i1 < this.g)
        {
          localObject = localp.a(i1);
          if (((File)localObject).delete()) {
            continue;
          }
          throw new IOException("failed to delete " + localObject);
        }
      }
      finally {}
      this.k += 1;
      this.i.append("REMOVE " + paramString + '\n');
      this.j.remove(paramString);
      if (f()) {
        this.m.submit(this.n);
      }
      boolean bool = true;
    }
  }
  
  public void close()
  {
    for (;;)
    {
      try
      {
        Object localObject1 = this.i;
        if (localObject1 == null) {
          return;
        }
        localObject1 = new ArrayList(this.j.values()).iterator();
        if (((Iterator)localObject1).hasNext())
        {
          p localp = (p)((Iterator)localObject1).next();
          if (p.a(localp) == null) {
            continue;
          }
          p.a(localp).b();
          continue;
        }
        h();
      }
      finally {}
      this.i.close();
      this.i = null;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */