package com.tencent;

import java.util.List;

final class ˆﾞ
  extends ʼʼ<TIMCallBack>
{
  ˆﾞ(TIMSnapshot paramTIMSnapshot, TIMCallBack paramTIMCallBack, String paramString)
  {
    super(paramTIMCallBack);
  }
  
  public final void a(int paramInt, String paramString)
  {
    ((TIMCallBack)this.a).onError(paramInt, paramString);
  }
  
  public final void a(List<String> paramList)
  {
    new Thread(new ˈʻ(this, paramList)).start();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ˆﾞ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */