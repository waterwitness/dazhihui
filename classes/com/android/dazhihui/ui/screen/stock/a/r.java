package com.android.dazhihui.ui.screen.stock.a;

import android.os.Handler;
import android.os.Message;
import com.android.dazhihui.ui.model.stock.market.MarketListAdapter;
import java.util.ArrayList;
import java.util.HashMap;

class r
  extends Handler
{
  r(l paraml) {}
  
  public void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    int i = paramMessage.what;
    paramMessage = (ArrayList)paramMessage.obj;
    this.a.C.put(Integer.valueOf(i), paramMessage);
    if ((i != this.a.j.length) && (this.a.z != null) && (i < this.a.z.length)) {
      this.a.z[i].setData(paramMessage, this.a.z[i]);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\a\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */