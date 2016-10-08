package com.tencent;

import android.os.Handler;
import java.util.List;

final class ʻˆ
  extends ʼʼ<TIMCallBack>
{
  ʻˆ(TIMFileElem paramTIMFileElem, TIMCallBack paramTIMCallBack, Handler paramHandler, String paramString)
  {
    super(paramTIMCallBack);
  }
  
  public final void a(int paramInt, String paramString)
  {
    ((TIMCallBack)this.a).onError(paramInt, paramString);
  }
  
  public final void a(List<String> paramList)
  {
    new Thread(new ʻˈ(this, paramList)).start();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ʻˆ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */