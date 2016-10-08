package com.alipay.c.g;

import android.content.Context;
import com.alipay.c.f.d;
import com.alipay.c.f.g;
import com.alipay.c.f.h;
import com.alipay.c.f.i;
import java.util.HashMap;
import java.util.Map;

public class a
{
  private static a a;
  private static Object c = new Object();
  private Context b;
  
  private a(Context paramContext)
  {
    this.b = paramContext;
  }
  
  public static a a(Context paramContext)
  {
    if (a == null) {}
    synchronized (c)
    {
      if (a == null) {
        a = new a(paramContext);
      }
      return a;
    }
  }
  
  /* Error */
  public d a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 32	com/alipay/c/g/d
    //   5: dup
    //   6: aload_0
    //   7: invokespecial 35	com/alipay/c/g/d:<init>	(Lcom/alipay/c/g/a;)V
    //   10: astore_1
    //   11: aload_1
    //   12: aload_0
    //   13: getfield 21	com/alipay/c/g/a:b	Landroid/content/Context;
    //   16: ldc 37
    //   18: invokestatic 42	com/alipay/c/a/a:a	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   21: putfield 45	com/alipay/c/g/d:a	Ljava/lang/String;
    //   24: aload_1
    //   25: aload_0
    //   26: getfield 21	com/alipay/c/g/a:b	Landroid/content/Context;
    //   29: invokestatic 50	com/alipay/c/f/h:c	(Landroid/content/Context;)Ljava/lang/String;
    //   32: putfield 52	com/alipay/c/g/d:b	Ljava/lang/String;
    //   35: aload_1
    //   36: aload_0
    //   37: getfield 21	com/alipay/c/g/a:b	Landroid/content/Context;
    //   40: invokestatic 54	com/alipay/c/a/a:a	(Landroid/content/Context;)Ljava/lang/String;
    //   43: putfield 56	com/alipay/c/g/d:c	Ljava/lang/String;
    //   46: aload_0
    //   47: getfield 21	com/alipay/c/g/a:b	Landroid/content/Context;
    //   50: astore_2
    //   51: aload_1
    //   52: invokestatic 61	com/alipay/c/e/a:a	()Ljava/lang/String;
    //   55: putfield 64	com/alipay/c/g/d:d	Ljava/lang/String;
    //   58: aload_0
    //   59: monitorexit
    //   60: aload_1
    //   61: areturn
    //   62: astore_1
    //   63: aload_0
    //   64: monitorexit
    //   65: aload_1
    //   66: athrow
    //   67: astore_2
    //   68: goto -10 -> 58
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	71	0	this	a
    //   10	51	1	locald	d
    //   62	4	1	localObject	Object
    //   50	1	2	localContext	Context
    //   67	1	2	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   2	11	62	finally
    //   11	58	62	finally
    //   11	58	67	java/lang/Throwable
  }
  
  public void a(int paramInt, Map<String, String> paramMap, c paramc)
  {
    com.alipay.c.b.a.a().a(paramInt);
    Object localObject = h.a(this.b);
    String str1 = com.alipay.c.b.a.a().c();
    if ((com.alipay.d.a.a.a.a.b((String)localObject)) && (!com.alipay.d.a.a.a.a.a((String)localObject, str1)))
    {
      com.alipay.c.f.a.a(this.b);
      d.a(this.b);
      g.a(this.b);
      i.h();
    }
    if (!com.alipay.d.a.a.a.a.a((String)localObject, str1)) {
      h.a(this.b, str1);
    }
    localObject = com.alipay.d.a.a.a.a.a(paramMap, "utdid", "");
    str1 = com.alipay.d.a.a.a.a.a(paramMap, "tid", "");
    String str2 = com.alipay.d.a.a.a.a.a(paramMap, "userId", "");
    paramMap = (Map<String, String>)localObject;
    if (com.alipay.d.a.a.a.a.a((String)localObject))
    {
      paramMap = this.b;
      paramMap = "";
    }
    localObject = new HashMap();
    ((Map)localObject).put("utdid", paramMap);
    ((Map)localObject).put("tid", str1);
    ((Map)localObject).put("userId", str2);
    ((Map)localObject).put("appName", "");
    ((Map)localObject).put("appKeyClient", "");
    ((Map)localObject).put("appchannel", "");
    ((Map)localObject).put("rpcVersion", "3");
    com.alipay.c.h.b.a().a(new b(this, (Map)localObject, paramc));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\c\g\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */