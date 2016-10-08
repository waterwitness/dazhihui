package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

class w
  extends BaseAdapter
{
  private LayoutInflater b;
  
  public w(DailyEarningDetail paramDailyEarningDetail, Context paramContext)
  {
    this.b = LayoutInflater.from(paramContext);
  }
  
  public int getCount()
  {
    if (DailyEarningDetail.b(this.a).size() == 0) {
      return 0;
    }
    return DailyEarningDetail.b(this.a).size();
  }
  
  public Object getItem(int paramInt)
  {
    return DailyEarningDetail.b(this.a).get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramViewGroup = new x(this, null);
    Object localObject;
    String str1;
    if (paramView == null)
    {
      paramView = this.b.inflate(2130903088, null);
      paramViewGroup.a = ((ImageView)paramView.findViewById(2131558781));
      paramViewGroup.b = ((TextView)paramView.findViewById(2131558782));
      paramViewGroup.c = ((TextView)paramView.findViewById(2131558783));
      paramViewGroup.d = ((TextView)paramView.findViewById(2131558784));
      paramView.setTag(paramViewGroup);
      localObject = (v)DailyEarningDetail.b(this.a).get(paramInt);
      str1 = v.a((v)localObject);
      String str2 = v.b((v)localObject);
      paramViewGroup.c.setText(str1 + " " + str2);
      str1 = v.c((v)localObject);
      localObject = v.d((v)localObject);
      if (!str1.equals("申购申请")) {
        break label235;
      }
      paramViewGroup.a.setBackgroundResource(2130837667);
      paramViewGroup.b.setText("转入");
      paramViewGroup.d.setText("+" + (String)localObject);
      paramViewGroup.d.setTextColor(-56541);
    }
    label235:
    do
    {
      return paramView;
      paramViewGroup = (x)paramView.getTag();
      break;
      if (str1.equals("赎回申请"))
      {
        paramViewGroup.a.setBackgroundResource(2130837668);
        paramViewGroup.b.setText("转出");
        paramViewGroup.d.setText("-" + (String)localObject);
        paramViewGroup.d.setTextColor(-13274383);
        return paramView;
      }
    } while (!str1.equals("基金账户开户"));
    paramViewGroup.a.setBackgroundResource(0);
    paramViewGroup.b.setText("基金账户开户");
    paramViewGroup.d.setText((CharSequence)localObject);
    paramViewGroup.d.setTextColor(-16053233);
    return paramView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */