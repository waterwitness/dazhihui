package com.tencent.connect.common;

import com.tencent.tauth.IUiListener;

public class UIListenerManager$ApiTask
{
  public IUiListener mListener;
  public int mRequestCode;
  
  public UIListenerManager$ApiTask(UIListenerManager paramUIListenerManager, int paramInt, IUiListener paramIUiListener)
  {
    this.mRequestCode = paramInt;
    this.mListener = paramIUiListener;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\connect\common\UIListenerManager$ApiTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */