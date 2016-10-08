package com.tencent;

import java.util.List;

final class ˈᵎ
  extends ʼʼ<TIMCallBack>
{
  ˈᵎ(TIMVideo paramTIMVideo, TIMCallBack paramTIMCallBack, String paramString)
  {
    super(paramTIMCallBack);
  }
  
  public final void a(int paramInt, String paramString)
  {
    ((TIMCallBack)this.a).onError(paramInt, paramString);
  }
  
  public final void a(List<String> paramList)
  {
    new Thread(new ˈᵔ(this, paramList)).start();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ˈᵎ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */