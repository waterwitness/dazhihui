package com.android.dazhihui.ui.widget.stockchart;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.ui.model.stock.StockVo;

class ag
  implements View.OnLongClickListener
{
  ag(MinChartDetailSwitchView paramMinChartDetailSwitchView) {}
  
  public boolean onLongClick(View paramView)
  {
    int[][] arrayOfInt;
    int i;
    if (MinChartDetailSwitchView.a(this.a))
    {
      if (MinChartDetailSwitchView.b(this.a))
      {
        paramView = d.a();
        paramView.a("isHaveMakeLongClick", 1);
        paramView.g();
        MinChartDetailSwitchView.a(this.a, false);
      }
      paramView = MinChartDetailSwitchView.c(this.a).getMinFiveRange();
      arrayOfInt = MinChartDetailSwitchView.c(this.a).getMinLevel2Range();
      if ((paramView != null) && (paramView.length != 0))
      {
        if ((arrayOfInt == null) || (arrayOfInt.length == 0)) {
          break label380;
        }
        i = this.a.d * 20 / this.a.getHeight();
        if (i > -1)
        {
          localObject = null;
          if ((i >= 5) || (i >= arrayOfInt.length)) {
            break label229;
          }
          paramView = az.a(arrayOfInt[i][0], MinChartDetailSwitchView.c(this.a).getmDecimalLen());
          if (paramView != null)
          {
            MinChartDetailSwitchView.a(this.a, i);
            localObject = paramView;
            if (paramView.equals("--")) {
              localObject = "0";
            }
            this.a.a(MinChartDetailSwitchView.c(this.a).getCode(), (String)localObject, i * (this.a.getHeight() / 20) - this.a.getHeight() - MinChartDetailSwitchView.d(this.a));
            this.a.invalidate();
          }
        }
      }
    }
    label229:
    label380:
    do
    {
      return true;
      if ((i >= 5) && (i < 10) && (i - 5 < paramView.length))
      {
        paramView = az.a(paramView[(i - 5)][0], MinChartDetailSwitchView.c(this.a).getmDecimalLen());
        break;
      }
      if ((i >= 10) && (i < 15) && (i - 5 < paramView.length))
      {
        paramView = az.a(paramView[(i - 5)][0], MinChartDetailSwitchView.c(this.a).getmDecimalLen());
        break;
      }
      paramView = (View)localObject;
      if (i < 15) {
        break;
      }
      paramView = (View)localObject;
      if (i >= 20) {
        break;
      }
      paramView = (View)localObject;
      if (i - 10 >= arrayOfInt.length) {
        break;
      }
      paramView = az.a(arrayOfInt[(i - 10)][0], MinChartDetailSwitchView.c(this.a).getmDecimalLen());
      break;
      i = this.a.d * 10 / this.a.getHeight();
    } while ((i <= -1) || (i >= paramView.length));
    Object localObject = az.a(paramView[i][0], MinChartDetailSwitchView.c(this.a).getmDecimalLen());
    MinChartDetailSwitchView.a(this.a, i);
    paramView = (View)localObject;
    if (((String)localObject).equals("--")) {
      paramView = "0";
    }
    this.a.a(MinChartDetailSwitchView.c(this.a).getCode(), paramView, i * (this.a.getHeight() / 10) - this.a.getHeight() - MinChartDetailSwitchView.d(this.a));
    this.a.invalidate();
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */