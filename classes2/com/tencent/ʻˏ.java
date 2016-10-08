package com.tencent;

import android.os.Handler;
import java.util.List;

final class ʻˏ
  extends ʼʼ<TIMValueCallBack<byte[]>>
{
  ʻˏ(TIMFileElem paramTIMFileElem, TIMValueCallBack paramTIMValueCallBack, Handler paramHandler)
  {
    super(paramTIMValueCallBack);
  }
  
  public final void a(int paramInt, String paramString)
  {
    ((TIMValueCallBack)this.a).onError(paramInt, paramString);
  }
  
  public final void a(List<String> paramList)
  {
    new Thread(new ʻˑ(this, paramList)).start();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ʻˏ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */