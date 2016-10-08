package com.android.thinkive.framework;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.android.thinkive.framework.compatible.CallBack.MessageCallBack;
import com.android.thinkive.framework.util.Log;

class ThinkiveInitializer$1
  extends Handler
{
  ThinkiveInitializer$1(ThinkiveInitializer paramThinkiveInitializer) {}
  
  public void handleMessage(Message paramMessage)
  {
    CallBack.MessageCallBack localMessageCallBack = (CallBack.MessageCallBack)paramMessage.obj;
    long l1 = paramMessage.getData().getLong("sendTime");
    long l2 = System.currentTimeMillis();
    if (localMessageCallBack != null) {}
    try
    {
      localMessageCallBack.handler(ThinkiveInitializer.access$0(), new Integer(paramMessage.what).intValue(), paramMessage.getData());
      long l3 = System.currentTimeMillis();
      Log.i("tran message use time:" + (l2 - l1) + " ms" + " handler message use time:" + (l3 - l2) + " ms");
      return;
    }
    catch (Throwable paramMessage)
    {
      for (;;)
      {
        Log.w("线程回调Action发生错误：" + paramMessage.getLocalizedMessage());
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\ThinkiveInitializer$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */