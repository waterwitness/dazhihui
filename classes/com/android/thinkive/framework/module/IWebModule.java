package com.android.thinkive.framework.module;

import com.android.thinkive.framework.message.AppMessage;

public abstract interface IWebModule
  extends IModule
{
  @Deprecated
  public abstract void sendMessageByWebModule(AppMessage paramAppMessage);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\module\IWebModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */