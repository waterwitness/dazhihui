package com.tencent;

public abstract interface TIMValueCallBack<T>
{
  public abstract void onError(int paramInt, String paramString);
  
  public abstract void onSuccess(T paramT);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMValueCallBack.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */