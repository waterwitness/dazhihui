package com.android.dazhihui.ui.screen.stock;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.model.stock.WarningItem;
import java.util.List;

class jm
  implements AdapterView.OnItemClickListener
{
  jm(MessageWarnScreen paramMessageWarnScreen) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = new Bundle();
    paramAdapterView.putInt("screenId", 8002);
    paramAdapterView.putString("name", ((WarningItem)MessageWarnScreen.b(this.a).e().get(paramInt)).getmWarningName());
    paramAdapterView.putString("code", ((WarningItem)MessageWarnScreen.b(this.a).e().get(paramInt)).getmWarningCode());
    paramAdapterView.putInt("index", paramInt);
    MessageWarnScreen.b(this.a).a((WarningItem)MessageWarnScreen.b(this.a).e().get(paramInt));
    this.a.startActivity(AddWarningActivity.class, paramAdapterView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\jm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */