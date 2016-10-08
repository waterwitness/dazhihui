package com.android.dazhihui.ui.widget.stockchart;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.android.dazhihui.ui.model.stock.StockVo;

class an
  extends Handler
{
  an(MinStockChartBaseView paramMinStockChartBaseView) {}
  
  public void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    int i = ((Integer)paramMessage.obj).intValue();
    if (paramMessage.what == this.a.d) {
      if (((Integer)paramMessage.obj).intValue() == this.a.c)
      {
        paramMessage = this.a.b.getMinTime();
        if ((i >= 1) && (paramMessage != null) && (i <= paramMessage.length - 1)) {}
      }
    }
    do
    {
      do
      {
        return;
        i = paramMessage[this.a.c];
        Log.d("cost", "requestStockCost----->" + i);
        this.a.a.getHolder().a(0, i, 0, av.a);
        return;
        Log.d("cost", "c:" + this.a.c + "n:" + paramMessage.obj);
        return;
      } while (paramMessage.what != this.a.e);
      paramMessage = this.a.b.getMinTime();
    } while ((i < 1) || (paramMessage == null) || (i > paramMessage.length - 1));
    i = paramMessage[i];
    Log.d("cost", "requestStockCost----->" + i);
    this.a.a.getHolder().a(0, i, 0, av.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */