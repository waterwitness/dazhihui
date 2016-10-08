package com.android.dazhihui.ui.widget.stockchart;

import android.os.Handler;
import android.os.Message;
import com.android.dazhihui.ui.model.stock.StockVo;

class i
  extends Handler
{
  i(KChartContainer paramKChartContainer) {}
  
  public void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    switch (paramMessage.what)
    {
    }
    do
    {
      return;
      KChartContainer.a(this.a).a(true);
      return;
    } while (KChartContainer.b(this.a).getVisibility() != 0);
    KChartContainer.a(this.a).a(paramMessage.arg1, 0, StockVo.getExRights(), av.b);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */