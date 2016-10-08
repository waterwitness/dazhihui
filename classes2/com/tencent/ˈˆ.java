package com.tencent;

import android.os.Handler;
import java.util.List;

final class ˈˆ
  extends ʼʼ<TIMCallBack>
{
  ˈˆ(TIMSoundElem paramTIMSoundElem, TIMCallBack paramTIMCallBack, Handler paramHandler, String paramString)
  {
    super(paramTIMCallBack);
  }
  
  public final void a(int paramInt, String paramString)
  {
    ((TIMCallBack)this.a).onError(paramInt, paramString);
  }
  
  public final void a(List<String> paramList)
  {
    new Thread(new ˈˉ(this, paramList)).start();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ˈˆ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */