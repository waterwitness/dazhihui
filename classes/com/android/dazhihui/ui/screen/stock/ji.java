package com.android.dazhihui.ui.screen.stock;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.dazhihui.d.n;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.model.stock.WarningItem;
import java.util.List;

class ji
  extends BaseAdapter
{
  private LayoutInflater b;
  private boolean c = false;
  
  public ji(MessageWarnScreen paramMessageWarnScreen)
  {
    this.b = LayoutInflater.from(paramMessageWarnScreen);
  }
  
  public int getCount()
  {
    if (MessageWarnScreen.b(this.a).e() == null) {
      return 0;
    }
    return MessageWarnScreen.b(this.a).e().size();
  }
  
  public Object getItem(int paramInt)
  {
    if (MessageWarnScreen.b(this.a).e() == null) {
      return null;
    }
    return MessageWarnScreen.b(this.a).e().get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int j;
    WarningItem localWarningItem;
    if (paramView == null)
    {
      paramView = this.b.inflate(2130903308, null);
      paramViewGroup = new jk(this);
      i = 0;
      while (i < paramViewGroup.a.length)
      {
        j = this.a.getResources().getIdentifier("message_warn_listitem_tv" + i, "id", "com.android.dazhihui");
        paramViewGroup.a[i] = ((TextView)paramView.findViewById(j));
        paramViewGroup.a[i].setTextSize(1, this.a.getResources().getDimension(2131230877) / g.a().o());
        i += 1;
      }
      paramViewGroup.b = ((ImageView)paramView.findViewById(2131559986));
      paramViewGroup.c = ((Button)paramView.findViewById(2131559987));
      paramView.setTag(paramViewGroup);
      localWarningItem = (WarningItem)MessageWarnScreen.b(this.a).e().get(paramInt);
      paramViewGroup.a[0].setText(localWarningItem.getmWarningName() + "(" + n.e(localWarningItem.getmWarningCode()) + ")");
      j = localWarningItem.getmDecimalNum();
      if (localWarningItem.getmOverPrice() < 0.0F) {
        break label771;
      }
      paramViewGroup.a[1].setText(MessageWarnScreen.c(this.a)[0] + n.a(Float.valueOf(localWarningItem.getmOverPrice()), j));
      paramViewGroup.a[1].setVisibility(0);
    }
    label771:
    for (int i = 2;; i = 1)
    {
      paramInt = i;
      if (localWarningItem.getmBelowPrice() >= 0.0F)
      {
        paramViewGroup.a[i].setText(MessageWarnScreen.c(this.a)[1] + n.a(Float.valueOf(localWarningItem.getmBelowPrice()), j));
        paramViewGroup.a[i].setVisibility(0);
        paramInt = i + 1;
      }
      i = paramInt;
      if (localWarningItem.getmDayIncrease() >= 0.0F)
      {
        paramViewGroup.a[paramInt].setText(MessageWarnScreen.c(this.a)[2] + n.a(Float.valueOf(localWarningItem.getmDayIncrease()), 2) + "%");
        paramViewGroup.a[paramInt].setVisibility(0);
        i = paramInt + 1;
      }
      paramInt = i;
      if (localWarningItem.getmDayFall() >= 0.0F)
      {
        paramViewGroup.a[i].setText(MessageWarnScreen.c(this.a)[3] + n.a(Float.valueOf(localWarningItem.getmDayFall()), 2) + "%");
        paramViewGroup.a[i].setVisibility(0);
        paramInt = i + 1;
      }
      i = paramInt;
      if (localWarningItem.getmDayHandOver() >= 0.0F)
      {
        paramViewGroup.a[paramInt].setText(MessageWarnScreen.c(this.a)[4] + n.a(Float.valueOf(localWarningItem.getmDayHandOver()), 2) + "%");
        paramViewGroup.a[paramInt].setVisibility(0);
        i = paramInt + 1;
      }
      paramInt = i;
      if (localWarningItem.getmDayLandMine() == 1)
      {
        paramViewGroup.a[i].setText(MessageWarnScreen.c(this.a)[5]);
        paramViewGroup.a[i].setVisibility(0);
        paramInt = i + 1;
      }
      for (;;)
      {
        if (paramInt < 7)
        {
          paramViewGroup.a[paramInt].setVisibility(8);
          paramInt += 1;
          continue;
          paramViewGroup = (jk)paramView.getTag();
          break;
        }
      }
      if (this.c)
      {
        paramViewGroup.c.setVisibility(0);
        paramViewGroup.b.setVisibility(8);
      }
      for (;;)
      {
        paramInt = localWarningItem.getmWarningId();
        paramViewGroup.c.setOnClickListener(new jj(this, paramInt));
        return paramView;
        paramViewGroup.c.setVisibility(8);
        paramViewGroup.b.setVisibility(0);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ji.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */