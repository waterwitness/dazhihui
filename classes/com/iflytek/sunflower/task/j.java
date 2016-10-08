package com.iflytek.sunflower.task;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.sunflower.OnlineConfigListener;
import org.json.JSONObject;

class j
  extends Handler
{
  j(i parami, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (i.a(this.a) != null)
    {
      JSONObject localJSONObject = (JSONObject)paramMessage.obj;
      i.a(this.a).onDataReceived(localJSONObject);
    }
    super.handleMessage(paramMessage);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\sunflower\task\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */