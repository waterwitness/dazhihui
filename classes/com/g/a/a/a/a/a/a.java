package com.g.a.a.a.a.a;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class a
  implements Closeable
{
  static final Pattern a = Pattern.compile("[a-z0-9_-]{1,64}");
  private static final OutputStream r = new c();
  final ThreadPoolExecutor b = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
  private final File c;
  private final File d;
  private final File e;
  private final File f;
  private final int g;
  private long h;
  private int i;
  private final int j;
  private long k = 0L;
  private int l = 0;
  private Writer m;
  private final LinkedHashMap<String, f> n = new LinkedHashMap(0, 0.75F, true);
  private int o;
  private long p = 0L;
  private final Callable<Void> q = new b(this);
  
  private a(File paramFile, int paramInt1, int paramInt2, long paramLong, int paramInt3)
  {
    this.c = paramFile;
    this.g = paramInt1;
    this.d = new File(paramFile, "journal");
    this.e = new File(paramFile, "journal.tmp");
    this.f = new File(paramFile, "journal.bkp");
    this.j = paramInt2;
    this.h = paramLong;
    this.i = paramInt3;
  }
  
  public static a a(File paramFile, int paramInt1, int paramInt2, long paramLong, int paramInt3)
  {
    if (paramLong <= 0L) {
      throw new IllegalArgumentException("maxSize <= 0");
    }
    if (paramInt3 <= 0) {
      throw new IllegalArgumentException("maxFileCount <= 0");
    }
    if (paramInt2 <= 0) {
      throw new IllegalArgumentException("valueCount <= 0");
    }
    Object localObject = new File(paramFile, "journal.bkp");
    File localFile;
    if (((File)localObject).exists())
    {
      localFile = new File(paramFile, "journal");
      if (!localFile.exists()) {
        break label165;
      }
      ((File)localObject).delete();
    }
    for (;;)
    {
      localObject = new a(paramFile, paramInt1, paramInt2, paramLong, paramInt3);
      if (!((a)localObject).d.exists()) {
        break label226;
      }
      try
      {
        ((a)localObject).f();
        ((a)localObject).g();
        ((a)localObject).m = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(((a)localObject).d, true), k.a));
        return (a)localObject;
      }
      catch (IOException localIOException)
      {
        label165:
        System.out.println("DiskLruCache " + paramFile + " is corrupt: " + localIOException.getMessage() + ", removing");
        ((a)localObject).d();
      }
      a((File)localObject, localFile, false);
    }
    label226:
    paramFile.mkdirs();
    paramFile = new a(paramFile, paramInt1, paramInt2, paramLong, paramInt3);
    paramFile.h();
    return paramFile;
  }
  
  private d a(String paramString, long paramLong)
  {
    for (;;)
    {
      d locald;
      try
      {
        j();
        e(paramString);
        f localf = (f)this.n.get(paramString);
        if (paramLong != -1L) {
          if (localf != null)
          {
            long l1 = f.e(localf);
            if (l1 == paramLong) {}
          }
          else
          {
            paramString = null;
            return paramString;
          }
        }
        if (localf == null)
        {
          localf = new f(this, paramString, null);
          this.n.put(paramString, localf);
          locald = new d(this, localf, null);
          f.a(localf, locald);
          this.m.write("DIRTY " + paramString + '\n');
          this.m.flush();
          paramString = locald;
          continue;
        }
        locald = f.a(localf);
      }
      finally {}
      if (locald != null) {
        paramString = null;
      }
    }
  }
  
  private void a(d paramd, boolean paramBoolean)
  {
    int i3 = 0;
    f localf;
    try
    {
      localf = d.a(paramd);
      if (f.a(localf) != paramd) {
        throw new IllegalStateException();
      }
    }
    finally {}
    int i2 = i3;
    if (paramBoolean)
    {
      i2 = i3;
      if (!f.d(localf))
      {
        int i1 = 0;
        for (;;)
        {
          i2 = i3;
          if (i1 >= this.j) {
            break;
          }
          if (d.b(paramd)[i1] == 0)
          {
            paramd.b();
            throw new IllegalStateException("Newly created entry didn't create value for index " + i1);
          }
          if (!localf.b(i1).exists())
          {
            paramd.b();
            return;
          }
          i1 += 1;
        }
      }
    }
    for (;;)
    {
      long l1;
      if (i2 < this.j)
      {
        paramd = localf.b(i2);
        if (paramBoolean)
        {
          if (paramd.exists())
          {
            File localFile = localf.a(i2);
            paramd.renameTo(localFile);
            l1 = f.b(localf)[i2];
            long l2 = localFile.length();
            f.b(localf)[i2] = l2;
            this.k = (this.k - l1 + l2);
            this.l += 1;
          }
        }
        else {
          a(paramd);
        }
      }
      else
      {
        this.o += 1;
        f.a(localf, null);
        if ((f.d(localf) | paramBoolean))
        {
          f.a(localf, true);
          this.m.write("CLEAN " + f.c(localf) + localf.a() + '\n');
          if (paramBoolean)
          {
            l1 = this.p;
            this.p = (1L + l1);
            f.a(localf, l1);
          }
        }
        for (;;)
        {
          this.m.flush();
          if ((this.k <= this.h) && (this.l <= this.i) && (!i())) {
            break;
          }
          this.b.submit(this.q);
          break;
          this.n.remove(f.c(localf));
          this.m.write("REMOVE " + f.c(localf) + '\n');
        }
      }
      i2 += 1;
    }
  }
  
  private static void a(File paramFile)
  {
    if ((paramFile.exists()) && (!paramFile.delete())) {
      throw new IOException();
    }
  }
  
  private static void a(File paramFile1, File paramFile2, boolean paramBoolean)
  {
    if (paramBoolean) {
      a(paramFile2);
    }
    if (!paramFile1.renameTo(paramFile2)) {
      throw new IOException();
    }
  }
  
  private void d(String paramString)
  {
    int i1 = paramString.indexOf(' ');
    if (i1 == -1) {
      throw new IOException("unexpected journal line: " + paramString);
    }
    int i2 = i1 + 1;
    int i3 = paramString.indexOf(' ', i2);
    String str;
    if (i3 == -1)
    {
      str = paramString.substring(i2);
      if ((i1 == "REMOVE".length()) && (paramString.startsWith("REMOVE"))) {
        this.n.remove(str);
      }
    }
    else
    {
      str = paramString.substring(i2, i3);
    }
    for (;;)
    {
      f localf2 = (f)this.n.get(str);
      f localf1 = localf2;
      if (localf2 == null)
      {
        localf1 = new f(this, str, null);
        this.n.put(str, localf1);
      }
      if ((i3 != -1) && (i1 == "CLEAN".length()) && (paramString.startsWith("CLEAN")))
      {
        paramString = paramString.substring(i3 + 1).split(" ");
        f.a(localf1, true);
        f.a(localf1, null);
        f.a(localf1, paramString);
        return;
      }
      if ((i3 == -1) && (i1 == "DIRTY".length()) && (paramString.startsWith("DIRTY")))
      {
        f.a(localf1, new d(this, localf1, null));
        return;
      }
      if ((i3 == -1) && (i1 == "READ".length()) && (paramString.startsWith("READ"))) {
        break;
      }
      throw new IOException("unexpected journal line: " + paramString);
    }
  }
  
  private void e(String paramString)
  {
    if (!a.matcher(paramString).matches()) {
      throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + paramString + "\"");
    }
  }
  
  private void f()
  {
    i locali = new i(new FileInputStream(this.d), k.a);
    int i1;
    try
    {
      String str1 = locali.a();
      String str2 = locali.a();
      String str3 = locali.a();
      String str4 = locali.a();
      String str5 = locali.a();
      if ((!"libcore.io.DiskLruCache".equals(str1)) || (!"1".equals(str2)) || (!Integer.toString(this.g).equals(str3)) || (!Integer.toString(this.j).equals(str4)) || (!"".equals(str5))) {
        throw new IOException("unexpected journal header: [" + str1 + ", " + str2 + ", " + str4 + ", " + str5 + "]");
      }
    }
    finally
    {
      k.a(locali);
      throw ((Throwable)localObject);
    }
  }
  
  private void g()
  {
    a(this.e);
    Iterator localIterator = this.n.values().iterator();
    while (localIterator.hasNext())
    {
      f localf = (f)localIterator.next();
      int i1;
      if (f.a(localf) == null)
      {
        i1 = 0;
        while (i1 < this.j)
        {
          this.k += f.b(localf)[i1];
          this.l += 1;
          i1 += 1;
        }
      }
      else
      {
        f.a(localf, null);
        i1 = 0;
        while (i1 < this.j)
        {
          a(localf.a(i1));
          a(localf.b(i1));
          i1 += 1;
        }
        localIterator.remove();
      }
    }
  }
  
  private void h()
  {
    for (;;)
    {
      try
      {
        if (this.m != null) {
          this.m.close();
        }
        BufferedWriter localBufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.e), k.a));
        f localf;
        try
        {
          localBufferedWriter.write("libcore.io.DiskLruCache");
          localBufferedWriter.write("\n");
          localBufferedWriter.write("1");
          localBufferedWriter.write("\n");
          localBufferedWriter.write(Integer.toString(this.g));
          localBufferedWriter.write("\n");
          localBufferedWriter.write(Integer.toString(this.j));
          localBufferedWriter.write("\n");
          localBufferedWriter.write("\n");
          Iterator localIterator = this.n.values().iterator();
          if (!localIterator.hasNext()) {
            break;
          }
          localf = (f)localIterator.next();
          if (f.a(localf) != null)
          {
            localBufferedWriter.write("DIRTY " + f.c(localf) + '\n');
            continue;
            localObject1 = finally;
          }
        }
        finally
        {
          localBufferedWriter.close();
        }
        ((Writer)localObject1).write("CLEAN " + f.c(localf) + localf.a() + '\n');
      }
      finally {}
    }
    ((Writer)localObject1).close();
    if (this.d.exists()) {
      a(this.d, this.f, true);
    }
    a(this.e, this.d, false);
    this.f.delete();
    this.m = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.d, true), k.a));
  }
  
  private boolean i()
  {
    return (this.o >= 2000) && (this.o >= this.n.size());
  }
  
  private void j()
  {
    if (this.m == null) {
      throw new IllegalStateException("cache is closed");
    }
  }
  
  private void k()
  {
    while (this.k > this.h) {
      c((String)((Map.Entry)this.n.entrySet().iterator().next()).getKey());
    }
  }
  
  private void l()
  {
    while (this.l > this.i) {
      c((String)((Map.Entry)this.n.entrySet().iterator().next()).getKey());
    }
  }
  
  /* Error */
  public g a(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: invokespecial 222	com/g/a/a/a/a/a/a:j	()V
    //   8: aload_0
    //   9: aload_1
    //   10: invokespecial 224	com/g/a/a/a/a/a/a:e	(Ljava/lang/String;)V
    //   13: aload_0
    //   14: getfield 69	com/g/a/a/a/a/a/a:n	Ljava/util/LinkedHashMap;
    //   17: aload_1
    //   18: invokevirtual 228	java/util/LinkedHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   21: checkcast 230	com/g/a/a/a/a/a/f
    //   24: astore 5
    //   26: aload 5
    //   28: ifnonnull +9 -> 37
    //   31: aload_3
    //   32: astore_2
    //   33: aload_0
    //   34: monitorexit
    //   35: aload_2
    //   36: areturn
    //   37: aload_3
    //   38: astore_2
    //   39: aload 5
    //   41: invokestatic 280	com/g/a/a/a/a/a/f:d	(Lcom/g/a/a/a/a/a/f;)Z
    //   44: ifeq -11 -> 33
    //   47: aload_0
    //   48: getfield 119	com/g/a/a/a/a/a/a:j	I
    //   51: anewarray 102	java/io/File
    //   54: astore_2
    //   55: aload_0
    //   56: getfield 119	com/g/a/a/a/a/a/a:j	I
    //   59: anewarray 487	java/io/InputStream
    //   62: astore 4
    //   64: iconst_0
    //   65: istore 7
    //   67: iload 7
    //   69: aload_0
    //   70: getfield 119	com/g/a/a/a/a/a/a:j	I
    //   73: if_icmpge +83 -> 156
    //   76: aload 5
    //   78: iload 7
    //   80: invokevirtual 296	com/g/a/a/a/a/a/f:a	(I)Ljava/io/File;
    //   83: astore 6
    //   85: aload_2
    //   86: iload 7
    //   88: aload 6
    //   90: aastore
    //   91: aload 4
    //   93: iload 7
    //   95: new 404	java/io/FileInputStream
    //   98: dup
    //   99: aload 6
    //   101: invokespecial 406	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   104: aastore
    //   105: iload 7
    //   107: iconst_1
    //   108: iadd
    //   109: istore 7
    //   111: goto -44 -> 67
    //   114: astore_1
    //   115: iconst_0
    //   116: istore 7
    //   118: aload_3
    //   119: astore_2
    //   120: iload 7
    //   122: aload_0
    //   123: getfield 119	com/g/a/a/a/a/a/a:j	I
    //   126: if_icmpge -93 -> 33
    //   129: aload_3
    //   130: astore_2
    //   131: aload 4
    //   133: iload 7
    //   135: aaload
    //   136: ifnull -103 -> 33
    //   139: aload 4
    //   141: iload 7
    //   143: aaload
    //   144: invokestatic 433	com/g/a/a/a/a/a/k:a	(Ljava/io/Closeable;)V
    //   147: iload 7
    //   149: iconst_1
    //   150: iadd
    //   151: istore 7
    //   153: goto -35 -> 118
    //   156: aload_0
    //   157: aload_0
    //   158: getfield 126	com/g/a/a/a/a/a/a:o	I
    //   161: iconst_1
    //   162: iadd
    //   163: putfield 126	com/g/a/a/a/a/a/a:o	I
    //   166: aload_0
    //   167: getfield 175	com/g/a/a/a/a/a/a:m	Ljava/io/Writer;
    //   170: new 186	java/lang/StringBuilder
    //   173: dup
    //   174: invokespecial 187	java/lang/StringBuilder:<init>	()V
    //   177: ldc_w 489
    //   180: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: aload_1
    //   184: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: bipush 10
    //   189: invokevirtual 255	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   192: invokevirtual 207	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   195: invokevirtual 492	java/io/Writer:append	(Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   198: pop
    //   199: aload_0
    //   200: invokespecial 325	com/g/a/a/a/a/a/a:i	()Z
    //   203: ifeq +15 -> 218
    //   206: aload_0
    //   207: getfield 89	com/g/a/a/a/a/a/a:b	Ljava/util/concurrent/ThreadPoolExecutor;
    //   210: aload_0
    //   211: getfield 96	com/g/a/a/a/a/a/a:q	Ljava/util/concurrent/Callable;
    //   214: invokevirtual 329	java/util/concurrent/ThreadPoolExecutor:submit	(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    //   217: pop
    //   218: new 494	com/g/a/a/a/a/a/g
    //   221: dup
    //   222: aload_0
    //   223: aload_1
    //   224: aload 5
    //   226: invokestatic 235	com/g/a/a/a/a/a/f:e	(Lcom/g/a/a/a/a/a/f;)J
    //   229: aload_2
    //   230: aload 4
    //   232: aload 5
    //   234: invokestatic 303	com/g/a/a/a/a/a/f:b	(Lcom/g/a/a/a/a/a/f;)[J
    //   237: aconst_null
    //   238: invokespecial 497	com/g/a/a/a/a/a/g:<init>	(Lcom/g/a/a/a/a/a/a;Ljava/lang/String;J[Ljava/io/File;[Ljava/io/InputStream;[JLcom/g/a/a/a/a/a/b;)V
    //   241: astore_2
    //   242: goto -209 -> 33
    //   245: astore_1
    //   246: aload_0
    //   247: monitorexit
    //   248: aload_1
    //   249: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	250	0	this	a
    //   0	250	1	paramString	String
    //   32	210	2	localObject1	Object
    //   1	129	3	localObject2	Object
    //   62	169	4	arrayOfInputStream	java.io.InputStream[]
    //   24	209	5	localf	f
    //   83	17	6	localFile	File
    //   65	87	7	i1	int
    // Exception table:
    //   from	to	target	type
    //   67	85	114	java/io/FileNotFoundException
    //   91	105	114	java/io/FileNotFoundException
    //   4	26	245	finally
    //   39	64	245	finally
    //   67	85	245	finally
    //   91	105	245	finally
    //   120	129	245	finally
    //   139	147	245	finally
    //   156	218	245	finally
    //   218	242	245	finally
  }
  
  public File a()
  {
    return this.c;
  }
  
  public long b()
  {
    try
    {
      long l1 = this.h;
      return l1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public d b(String paramString)
  {
    return a(paramString, -1L);
  }
  
  public int c()
  {
    try
    {
      int i1 = this.i;
      return i1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean c(String paramString)
  {
    int i1 = 0;
    for (;;)
    {
      try
      {
        j();
        e(paramString);
        f localf = (f)this.n.get(paramString);
        Object localObject;
        if (localf != null)
        {
          localObject = f.a(localf);
          if (localObject == null) {}
        }
        else
        {
          bool = false;
          return bool;
          this.k -= f.b(localf)[i1];
          this.l -= 1;
          f.b(localf)[i1] = 0L;
          i1 += 1;
        }
        if (i1 < this.j)
        {
          localObject = localf.a(i1);
          if ((!((File)localObject).exists()) || (((File)localObject).delete())) {
            continue;
          }
          throw new IOException("failed to delete " + localObject);
        }
      }
      finally {}
      this.o += 1;
      this.m.append("REMOVE " + paramString + '\n');
      this.n.remove(paramString);
      if (i()) {
        this.b.submit(this.q);
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
        Object localObject1 = this.m;
        if (localObject1 == null) {
          return;
        }
        localObject1 = new ArrayList(this.n.values()).iterator();
        if (((Iterator)localObject1).hasNext())
        {
          f localf = (f)((Iterator)localObject1).next();
          if (f.a(localf) == null) {
            continue;
          }
          f.a(localf).b();
          continue;
        }
        k();
      }
      finally {}
      l();
      this.m.close();
      this.m = null;
    }
  }
  
  public void d()
  {
    close();
    k.a(this.c);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\g\a\a\a\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */