package com.tencent.open;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.open.a.f;
import java.lang.ref.WeakReference;

class TDialog$THandler
  extends Handler
{
  private TDialog.OnTimeListener mL;
  
  public TDialog$THandler(TDialog paramTDialog, TDialog.OnTimeListener paramOnTimeListener, Looper paramLooper)
  {
    super(paramLooper);
    this.mL = paramOnTimeListener;
  }
  
  public void handleMessage(Message paramMessage)
  {
    f.b("openSDK_LOG.TDialog", "--handleMessage--msg.WHAT = " + paramMessage.what);
    switch (paramMessage.what)
    {
    }
    do
    {
      do
      {
        return;
        TDialog.OnTimeListener.access$000(this.mL, (String)paramMessage.obj);
        return;
        this.mL.onCancel();
        return;
      } while ((TDialog.a(this.this$0) == null) || (TDialog.a(this.this$0).get() == null));
      TDialog.a((Context)TDialog.a(this.this$0).get(), (String)paramMessage.obj);
      return;
    } while ((TDialog.a(this.this$0) == null) || (TDialog.a(this.this$0).get() == null));
    TDialog.b((Context)TDialog.a(this.this$0).get(), (String)paramMessage.obj);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\TDialog$THandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */