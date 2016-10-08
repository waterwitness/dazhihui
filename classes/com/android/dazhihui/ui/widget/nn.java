package com.android.dazhihui.ui.widget;

import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.dazhihui.ui.model.stock.WisdomHostVo.HotMsgs;
import java.util.List;

class nn
  extends BaseAdapter
{
  nn(WisdomHot paramWisdomHot) {}
  
  public int getCount()
  {
    return this.a.a.size();
  }
  
  public Object getItem(int paramInt)
  {
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = new TextView(this.a.getContext());
      paramView.setTextSize(2, 16.0F);
      paramView.setTextColor(-16777216);
      paramView.setSingleLine();
      paramView.setEllipsize(TextUtils.TruncateAt.END);
      paramView.setGravity(19);
    }
    for (paramViewGroup = paramView;; paramViewGroup = (TextView)paramView)
    {
      WisdomHostVo.HotMsgs localHotMsgs = (WisdomHostVo.HotMsgs)this.a.a.get(paramInt);
      String str = localHotMsgs.getUrlPage();
      paramViewGroup.setText(localHotMsgs.getContent());
      paramViewGroup.setOnClickListener(new no(this, str, localHotMsgs));
      return paramView;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\nn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */