package com.android.thinkive.framework.compatible;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.thinkive.framework.ThinkiveInitializer;
import com.android.thinkive.framework.util.Log;

public class MessageAction
{
  private Handler mHandler;
  private int mTaskSerialNo = 0;
  
  public MessageAction(Handler paramHandler, int paramInt)
  {
    this.mHandler = paramHandler;
    this.mTaskSerialNo = paramInt;
  }
  
  public void transferAction(int paramInt, Bundle paramBundle, CallBack.MessageCallBack paramMessageCallBack)
  {
    if (Looper.myLooper() != Looper.getMainLooper())
    {
      paramMessageCallBack = this.mHandler.obtainMessage(paramInt, paramMessageCallBack);
      paramBundle.putLong("sendTime", System.currentTimeMillis());
      paramMessageCallBack.setData(paramBundle);
      paramMessageCallBack.arg1 = this.mTaskSerialNo;
      this.mHandler.sendMessageAtTime(paramMessageCallBack, 0L);
      Log.d("Handler 已消息发送");
    }
    do
    {
      return;
      Log.d("msg callback from mainThread!");
    } while (paramMessageCallBack == null);
    paramMessageCallBack.handler(ThinkiveInitializer.getInstance().getContext(), new Integer(paramInt).intValue(), paramBundle);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\compatible\MessageAction.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */