package com.android.dazhihui.ui.model;

import com.android.dazhihui.a.b.h;

public abstract interface IRequestAdapterListener
{
  public abstract void registRequestListener(h paramh);
  
  public abstract void removeRequest(h paramh);
  
  public abstract void sendRequest(h paramh);
  
  public abstract void setAutoRequest(h paramh);
  
  public abstract void setAutoRequestPeriod(long paramLong);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\IRequestAdapterListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */