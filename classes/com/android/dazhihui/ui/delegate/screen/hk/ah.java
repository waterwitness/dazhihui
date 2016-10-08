package com.android.dazhihui.ui.delegate.screen.hk;

import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.Toast;
import java.util.Vector;

class ah
  implements View.OnClickListener
{
  int a;
  
  ah(HKCaptialHolding paramHKCaptialHolding) {}
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131560807: 
      if (HKCaptialHolding.c(this.b) != this.a) {
        HKCaptialHolding.a(this.b, this.a);
      }
      for (;;)
      {
        HKCaptialHolding.d(this.b).notifyDataSetChanged();
        if (HKCaptialHolding.c(this.b) == HKCaptialHolding.a(this.b).size() - 1) {
          HKCaptialHolding.e(this.b).setSelection(HKCaptialHolding.c(this.b));
        }
        if ((HKCaptialHolding.c(this.b) != -1) || (this.a != HKCaptialHolding.a(this.b).size() - 1)) {
          break;
        }
        this.b.g.postDelayed(this.b.h, 100L);
        return;
        HKCaptialHolding.a(this.b, -1);
      }
    case 2131560711: 
      ((HKTradeCommon)this.b.getActivity()).d(((String[])HKCaptialHolding.a(this.b).get(this.a))[8]);
      ((HKTradeCommon)this.b.getActivity()).a(0, false);
      return;
    case 2131560712: 
      ((HKTradeCommon)this.b.getActivity()).d(((String[])HKCaptialHolding.a(this.b).get(this.a))[8]);
      ((HKTradeCommon)this.b.getActivity()).a(1, false);
      return;
    }
    if (!bk.d(((String[])HKCaptialHolding.a(this.b).get(this.a))[9]))
    {
      paramView = Toast.makeText(this.b.getActivity(), "该品种暂不支持行情分析界面", 0);
      paramView.setGravity(17, 0, 0);
      paramView.show();
      return;
    }
    paramView = bk.h(((String[])HKCaptialHolding.a(this.b).get(this.a))[8]) + ((String[])HKCaptialHolding.a(this.b).get(this.a))[8];
    if (!bk.g(((String[])HKCaptialHolding.a(this.b).get(this.a))[8]))
    {
      HKCaptialHolding.a(this.b, paramView);
      return;
    }
    HKCaptialHolding.a(this.b, "NS" + ((String[])HKCaptialHolding.a(this.b).get(this.a))[8], "NY" + ((String[])HKCaptialHolding.a(this.b).get(this.a))[8], true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */