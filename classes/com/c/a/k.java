package com.c.a;

import com.c.a.b.a.t;
import com.c.a.b.a.v;
import com.c.a.b.ag;
import com.c.a.b.f;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class k
{
  final u a = new l(this);
  final ac b = new m(this);
  private final ThreadLocal<Map<com.c.a.c.a<?>, q<?>>> c = new ThreadLocal();
  private final Map<com.c.a.c.a<?>, al<?>> d = Collections.synchronizedMap(new HashMap());
  private final List<am> e;
  private final f f;
  private final boolean g;
  private final boolean h;
  private final boolean i;
  private final boolean j;
  
  public k()
  {
    this(com.c.a.b.s.a, d.a, Collections.emptyMap(), false, false, false, true, false, false, af.a, Collections.emptyList());
  }
  
  k(com.c.a.b.s params, j paramj, Map<Type, s<?>> paramMap, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, af paramaf, List<am> paramList)
  {
    this.f = new f(paramMap);
    this.g = paramBoolean1;
    this.i = paramBoolean3;
    this.h = paramBoolean4;
    this.j = paramBoolean5;
    paramMap = new ArrayList();
    paramMap.add(com.c.a.b.a.y.Q);
    paramMap.add(com.c.a.b.a.m.a);
    paramMap.add(params);
    paramMap.addAll(paramList);
    paramMap.add(com.c.a.b.a.y.x);
    paramMap.add(com.c.a.b.a.y.m);
    paramMap.add(com.c.a.b.a.y.g);
    paramMap.add(com.c.a.b.a.y.i);
    paramMap.add(com.c.a.b.a.y.k);
    paramMap.add(com.c.a.b.a.y.a(Long.TYPE, Long.class, a(paramaf)));
    paramMap.add(com.c.a.b.a.y.a(Double.TYPE, Double.class, a(paramBoolean6)));
    paramMap.add(com.c.a.b.a.y.a(Float.TYPE, Float.class, b(paramBoolean6)));
    paramMap.add(com.c.a.b.a.y.r);
    paramMap.add(com.c.a.b.a.y.t);
    paramMap.add(com.c.a.b.a.y.z);
    paramMap.add(com.c.a.b.a.y.B);
    paramMap.add(com.c.a.b.a.y.a(BigDecimal.class, com.c.a.b.a.y.v));
    paramMap.add(com.c.a.b.a.y.a(BigInteger.class, com.c.a.b.a.y.w));
    paramMap.add(com.c.a.b.a.y.D);
    paramMap.add(com.c.a.b.a.y.F);
    paramMap.add(com.c.a.b.a.y.J);
    paramMap.add(com.c.a.b.a.y.O);
    paramMap.add(com.c.a.b.a.y.H);
    paramMap.add(com.c.a.b.a.y.d);
    paramMap.add(com.c.a.b.a.e.a);
    paramMap.add(com.c.a.b.a.y.M);
    paramMap.add(v.a);
    paramMap.add(t.a);
    paramMap.add(com.c.a.b.a.y.K);
    paramMap.add(com.c.a.b.a.a.a);
    paramMap.add(com.c.a.b.a.y.R);
    paramMap.add(com.c.a.b.a.y.b);
    paramMap.add(new com.c.a.b.a.c(this.f));
    paramMap.add(new com.c.a.b.a.k(this.f, paramBoolean2));
    paramMap.add(new com.c.a.b.a.p(this.f, paramj, params));
    this.e = Collections.unmodifiableList(paramMap);
  }
  
  private al<Number> a(af paramaf)
  {
    if (paramaf == af.a) {
      return com.c.a.b.a.y.n;
    }
    return new p(this);
  }
  
  private al<Number> a(boolean paramBoolean)
  {
    if (paramBoolean) {
      return com.c.a.b.a.y.p;
    }
    return new n(this);
  }
  
  private com.c.a.d.d a(Writer paramWriter)
  {
    if (this.i) {
      paramWriter.write(")]}'\n");
    }
    paramWriter = new com.c.a.d.d(paramWriter);
    if (this.j) {
      paramWriter.c("  ");
    }
    paramWriter.d(this.g);
    return paramWriter;
  }
  
  private void a(double paramDouble)
  {
    if ((Double.isNaN(paramDouble)) || (Double.isInfinite(paramDouble))) {
      throw new IllegalArgumentException(paramDouble + " is not a valid double value as per JSON specification. To override this" + " behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }
  }
  
  private static void a(Object paramObject, com.c.a.d.a parama)
  {
    if (paramObject != null) {
      try
      {
        if (parama.f() != com.c.a.d.c.j) {
          throw new x("JSON document was not fully consumed.");
        }
      }
      catch (com.c.a.d.e paramObject)
      {
        throw new ae((Throwable)paramObject);
      }
      catch (IOException paramObject)
      {
        throw new x((Throwable)paramObject);
      }
    }
  }
  
  private al<Number> b(boolean paramBoolean)
  {
    if (paramBoolean) {
      return com.c.a.b.a.y.o;
    }
    return new o(this);
  }
  
  public <T> al<T> a(am paramam, com.c.a.c.a<T> parama)
  {
    Iterator localIterator = this.e.iterator();
    int k = 0;
    while (localIterator.hasNext())
    {
      Object localObject = (am)localIterator.next();
      if (k == 0)
      {
        if (localObject == paramam) {
          k = 1;
        }
      }
      else
      {
        localObject = ((am)localObject).a(this, parama);
        if (localObject != null) {
          return (al<T>)localObject;
        }
      }
    }
    throw new IllegalArgumentException("GSON cannot serialize " + parama);
  }
  
  public <T> al<T> a(com.c.a.c.a<T> parama)
  {
    Object localObject1 = (al)this.d.get(parama);
    if (localObject1 != null) {
      return (al<T>)localObject1;
    }
    Object localObject3 = (Map)this.c.get();
    int k = 0;
    if (localObject3 == null)
    {
      localObject3 = new HashMap();
      this.c.set(localObject3);
      k = 1;
    }
    for (;;)
    {
      Object localObject4 = (q)((Map)localObject3).get(parama);
      localObject1 = localObject4;
      if (localObject4 != null) {
        break;
      }
      try
      {
        localObject1 = new q();
        ((Map)localObject3).put(parama, localObject1);
        Iterator localIterator = this.e.iterator();
        for (;;)
        {
          if (localIterator.hasNext())
          {
            localObject4 = ((am)localIterator.next()).a(this, parama);
            if (localObject4 != null)
            {
              ((q)localObject1).a((al)localObject4);
              this.d.put(parama, localObject4);
              ((Map)localObject3).remove(parama);
              localObject1 = localObject4;
              if (k == 0) {
                break;
              }
              this.c.remove();
              return (al<T>)localObject4;
            }
          }
        }
        throw new IllegalArgumentException("GSON cannot handle " + parama);
      }
      finally
      {
        ((Map)localObject3).remove(parama);
        if (k != 0) {
          this.c.remove();
        }
      }
    }
  }
  
  public <T> al<T> a(Class<T> paramClass)
  {
    return a(com.c.a.c.a.get(paramClass));
  }
  
  /* Error */
  public <T> T a(com.c.a.d.a parama, Type paramType)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aload_1
    //   3: invokevirtual 421	com/c/a/d/a:p	()Z
    //   6: istore 4
    //   8: aload_1
    //   9: iconst_1
    //   10: invokevirtual 423	com/c/a/d/a:a	(Z)V
    //   13: aload_1
    //   14: invokevirtual 324	com/c/a/d/a:f	()Lcom/c/a/d/c;
    //   17: pop
    //   18: iconst_0
    //   19: istore_3
    //   20: aload_0
    //   21: aload_2
    //   22: invokestatic 426	com/c/a/c/a:get	(Ljava/lang/reflect/Type;)Lcom/c/a/c/a;
    //   25: invokevirtual 413	com/c/a/k:a	(Lcom/c/a/c/a;)Lcom/c/a/al;
    //   28: aload_1
    //   29: invokevirtual 429	com/c/a/al:b	(Lcom/c/a/d/a;)Ljava/lang/Object;
    //   32: astore_2
    //   33: aload_1
    //   34: iload 4
    //   36: invokevirtual 423	com/c/a/d/a:a	(Z)V
    //   39: aload_2
    //   40: areturn
    //   41: astore_2
    //   42: iload_3
    //   43: ifeq +11 -> 54
    //   46: aload_1
    //   47: iload 4
    //   49: invokevirtual 423	com/c/a/d/a:a	(Z)V
    //   52: aconst_null
    //   53: areturn
    //   54: new 336	com/c/a/ae
    //   57: dup
    //   58: aload_2
    //   59: invokespecial 339	com/c/a/ae:<init>	(Ljava/lang/Throwable;)V
    //   62: athrow
    //   63: astore_2
    //   64: aload_1
    //   65: iload 4
    //   67: invokevirtual 423	com/c/a/d/a:a	(Z)V
    //   70: aload_2
    //   71: athrow
    //   72: astore_2
    //   73: new 336	com/c/a/ae
    //   76: dup
    //   77: aload_2
    //   78: invokespecial 339	com/c/a/ae:<init>	(Ljava/lang/Throwable;)V
    //   81: athrow
    //   82: astore_2
    //   83: new 336	com/c/a/ae
    //   86: dup
    //   87: aload_2
    //   88: invokespecial 339	com/c/a/ae:<init>	(Ljava/lang/Throwable;)V
    //   91: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	92	0	this	k
    //   0	92	1	parama	com.c.a.d.a
    //   0	92	2	paramType	Type
    //   1	42	3	k	int
    //   6	60	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   13	18	41	java/io/EOFException
    //   20	33	41	java/io/EOFException
    //   13	18	63	finally
    //   20	33	63	finally
    //   54	63	63	finally
    //   73	82	63	finally
    //   83	92	63	finally
    //   13	18	72	java/lang/IllegalStateException
    //   20	33	72	java/lang/IllegalStateException
    //   13	18	82	java/io/IOException
    //   20	33	82	java/io/IOException
  }
  
  public <T> T a(Reader paramReader, Type paramType)
  {
    paramReader = new com.c.a.d.a(paramReader);
    paramType = a(paramReader, paramType);
    a(paramType, paramReader);
    return paramType;
  }
  
  public <T> T a(String paramString, Class<T> paramClass)
  {
    paramString = a(paramString, paramClass);
    return (T)com.c.a.b.af.a(paramClass).cast(paramString);
  }
  
  public <T> T a(String paramString, Type paramType)
  {
    if (paramString == null) {
      return null;
    }
    return (T)a(new StringReader(paramString), paramType);
  }
  
  public String a(w paramw)
  {
    StringWriter localStringWriter = new StringWriter();
    a(paramw, localStringWriter);
    return localStringWriter.toString();
  }
  
  public String a(Object paramObject)
  {
    if (paramObject == null) {
      return a(y.a);
    }
    return a(paramObject, paramObject.getClass());
  }
  
  public String a(Object paramObject, Type paramType)
  {
    StringWriter localStringWriter = new StringWriter();
    a(paramObject, paramType, localStringWriter);
    return localStringWriter.toString();
  }
  
  public void a(w paramw, com.c.a.d.d paramd)
  {
    boolean bool1 = paramd.g();
    paramd.b(true);
    boolean bool2 = paramd.h();
    paramd.c(this.h);
    boolean bool3 = paramd.i();
    paramd.d(this.g);
    try
    {
      ag.a(paramw, paramd);
      return;
    }
    catch (IOException paramw)
    {
      throw new x(paramw);
    }
    finally
    {
      paramd.b(bool1);
      paramd.c(bool2);
      paramd.d(bool3);
    }
  }
  
  public void a(w paramw, Appendable paramAppendable)
  {
    try
    {
      a(paramw, a(ag.a(paramAppendable)));
      return;
    }
    catch (IOException paramw)
    {
      throw new RuntimeException(paramw);
    }
  }
  
  public void a(Object paramObject, Type paramType, com.c.a.d.d paramd)
  {
    paramType = a(com.c.a.c.a.get(paramType));
    boolean bool1 = paramd.g();
    paramd.b(true);
    boolean bool2 = paramd.h();
    paramd.c(this.h);
    boolean bool3 = paramd.i();
    paramd.d(this.g);
    try
    {
      paramType.a(paramd, paramObject);
      return;
    }
    catch (IOException paramObject)
    {
      throw new x((Throwable)paramObject);
    }
    finally
    {
      paramd.b(bool1);
      paramd.c(bool2);
      paramd.d(bool3);
    }
  }
  
  public void a(Object paramObject, Type paramType, Appendable paramAppendable)
  {
    try
    {
      a(paramObject, paramType, a(ag.a(paramAppendable)));
      return;
    }
    catch (IOException paramObject)
    {
      throw new x((Throwable)paramObject);
    }
  }
  
  public String toString()
  {
    return "{serializeNulls:" + this.g + "factories:" + this.e + ",instanceCreators:" + this.f + "}";
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */