package com.tencent.feedback.upload;

import android.content.Context;
import com.tencent.feedback.common.c;
import com.tencent.feedback.common.e;
import com.tencent.feedback.proguard.C;

public final class a
  extends AbstractUploadDatas
{
  public a(Context paramContext, int paramInt1, int paramInt2)
  {
    super(paramContext, paramInt1, paramInt2);
  }
  
  public final C a()
  {
    Object localObject = c.a(this.c);
    byte[] arrayOfByte = "".getBytes();
    try
    {
      localObject = com.tencent.feedback.proguard.a.a(b(), (c)localObject, arrayOfByte, -1, -1);
      if (localObject != null) {
        return (C)localObject;
      }
      return null;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
      e.d("rqdp{  encode2RequestPackage failed}", new Object[0]);
    }
    return null;
  }
  
  public final void done(boolean paramBoolean) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\upload\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */