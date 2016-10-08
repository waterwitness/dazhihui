package com.android.thinkive.framework.network;

public abstract interface ResponseListener<T>
{
  public abstract void onErrorResponse(Exception paramException);
  
  public abstract void onResponse(T paramT);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\ResponseListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */