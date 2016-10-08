package com.android.dazhihui.ui.model.stock;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Vector;

class SelfSelectedStockManager$1
  extends Handler
{
  SelfSelectedStockManager$1(SelfSelectedStockManager paramSelfSelectedStockManager, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return;
    case 0: 
      SelfSelectedStockManager.access$000(this.this$0);
      return;
    }
    paramMessage = (Vector)paramMessage.obj;
    this.this$0.requestSyncSelfStockToServerByType(0, paramMessage);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\SelfSelectedStockManager$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */