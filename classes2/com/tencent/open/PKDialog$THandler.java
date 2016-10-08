package com.tencent.open;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.open.a.f;
import java.lang.ref.WeakReference;

class PKDialog$THandler
  extends Handler
{
  private PKDialog.OnTimeListener mL;
  
  public PKDialog$THandler(PKDialog paramPKDialog, PKDialog.OnTimeListener paramOnTimeListener, Looper paramLooper)
  {
    super(paramLooper);
    this.mL = paramOnTimeListener;
  }
  
  public void handleMessage(Message paramMessage)
  {
    f.b("openSDK_LOG.PKDialog", "msg = " + paramMessage.what);
    switch (paramMessage.what)
    {
    }
    do
    {
      do
      {
        return;
        PKDialog.OnTimeListener.access$600(this.mL, (String)paramMessage.obj);
        return;
        this.mL.onCancel();
        return;
      } while ((PKDialog.access$300(this.this$0) == null) || (PKDialog.access$300(this.this$0).get() == null));
      PKDialog.access$700((Context)PKDialog.access$300(this.this$0).get(), (String)paramMessage.obj);
      return;
    } while ((PKDialog.access$300(this.this$0) == null) || (PKDialog.access$300(this.this$0).get() == null));
    PKDialog.access$800((Context)PKDialog.access$300(this.this$0).get(), (String)paramMessage.obj);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\PKDialog$THandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */