package com.tencent.feedback.upload;

import android.content.Context;
import com.tencent.feedback.common.c;
import com.tencent.feedback.common.e;
import com.tencent.feedback.proguard.C;
import com.tencent.feedback.proguard.a;
import com.tencent.feedback.proguard.t;
import com.tencent.feedback.proguard.w;
import com.tencent.feedback.proguard.w.a;

public abstract class AbstractUploadDatas
{
  protected final int a;
  protected final int b;
  protected Context c;
  
  public AbstractUploadDatas(Context paramContext, int paramInt1, int paramInt2)
  {
    this.c = paramContext;
    this.a = paramInt2;
    this.b = paramInt1;
  }
  
  public static C a(Context paramContext, int paramInt, byte[] paramArrayOfByte)
  {
    int i = -1;
    if (paramArrayOfByte != null) {}
    for (;;)
    {
      try
      {
        Object localObject = t.a(paramContext).b();
        int k = ((w)localObject).f();
        int m = ((w)localObject).g();
        localObject = a.a(paramArrayOfByte, m, k, ((w)localObject).d());
        i = m;
        j = k;
        paramArrayOfByte = (byte[])localObject;
        if (localObject == null)
        {
          e.c("rqdp{  enzp error! }%d %d ", new Object[] { Integer.valueOf(m), Integer.valueOf(k) });
          return null;
        }
        paramContext = a.a(paramInt, c.a(paramContext), paramArrayOfByte, i, j);
        return paramContext;
      }
      catch (Throwable paramContext)
      {
        e.c("rqdp{  imposiable comStrategy error} %s", new Object[] { paramContext.toString() });
        paramContext.printStackTrace();
        return null;
      }
      int j = -1;
    }
  }
  
  public static void d()
  {
    e.c("rqdp{  encode failed, clear db data}", new Object[0]);
  }
  
  public abstract C a();
  
  public final byte[] a(boolean paramBoolean)
  {
    byte[] arrayOfByte = null;
    try
    {
      C localC = a();
      if (localC != null) {
        arrayOfByte = localC.a();
      }
      return arrayOfByte;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
      e.d("rqdp{  encode to bytes failed}", new Object[0]);
    }
    return null;
  }
  
  public final int b()
  {
    return this.a;
  }
  
  public final String c()
  {
    try
    {
      if (this.b == 1111) {
        return t.a(this.c).b().a();
      }
      String str = t.a(this.c).b().e(this.b).a();
      return str;
    }
    catch (Throwable localThrowable)
    {
      e.c("rqdp{  imposiable comStrategy error }%s", new Object[] { localThrowable.toString() });
      localThrowable.printStackTrace();
    }
    return null;
  }
  
  public abstract void done(boolean paramBoolean);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\upload\AbstractUploadDatas.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */