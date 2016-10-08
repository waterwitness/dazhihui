package qalsdk;

import android.os.Handler;
import android.os.Message;
import com.tencent.qalsdk.util.QLog;

class f
  extends Handler
{
  f(e parame) {}
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return;
    }
    paramMessage = (String)paramMessage.obj;
    QLog.d("WifiDetector", 1, "WIFI detect delayed try!");
    e.a(this.a, paramMessage);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\qalsdk\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */