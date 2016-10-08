package com.alipay.b.b.a.a;

import android.os.Looper;
import com.alipay.b.b.a.a.a.d;
import com.alipay.b.b.a.a.a.e;
import com.alipay.b.b.a.a.a.f;
import com.alipay.e.a.a.a.a;
import com.alipay.e.a.a.a.b;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class aj
{
  private static final ThreadLocal<Object> a = new ThreadLocal();
  private static final ThreadLocal<Map<String, Object>> b = new ThreadLocal();
  private byte c = 0;
  private AtomicInteger d;
  private ah e;
  
  public aj(ah paramah)
  {
    this.e = paramah;
    this.d = new AtomicInteger();
  }
  
  public final Object a(Method paramMethod, Object[] paramArrayOfObject)
  {
    boolean bool = true;
    if ((Looper.myLooper() != null) && (Looper.myLooper() == Looper.getMainLooper())) {}
    for (int i = 1; i != 0; i = 0) {
      throw new IllegalThreadStateException("can't in main thread call rpc .");
    }
    Object localObject = (a)paramMethod.getAnnotation(a.class);
    if (paramMethod.getAnnotation(b.class) != null) {}
    Type localType;
    for (;;)
    {
      localType = paramMethod.getGenericReturnType();
      paramMethod.getAnnotations();
      a.set(null);
      b.set(null);
      if (localObject != null) {
        break;
      }
      throw new IllegalStateException("OperationType must be set.");
      bool = false;
    }
    localObject = ((a)localObject).a();
    i = this.d.incrementAndGet();
    try
    {
      if (this.c == 0)
      {
        paramArrayOfObject = new e(i, (String)localObject, paramArrayOfObject);
        if (b.get() != null) {
          paramArrayOfObject.a(b.get());
        }
        paramArrayOfObject = paramArrayOfObject.a();
        paramMethod = (byte[])new s(this.e.a(), paramMethod, i, (String)localObject, paramArrayOfObject, bool).a();
        b.set(null);
        paramMethod = new d(localType, paramMethod).a();
        if (localType != Void.TYPE) {
          a.set(paramMethod);
        }
      }
      return a.get();
    }
    catch (c paramMethod)
    {
      paramMethod.a((String)localObject);
      throw paramMethod;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\b\b\a\a\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */