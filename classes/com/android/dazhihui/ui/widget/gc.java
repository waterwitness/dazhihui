package com.android.dazhihui.ui.widget;

import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.dazhihui.ui.model.stock.GroupAdvertVo.AdvList;
import java.util.List;

public class gc
  extends BaseAdapter
{
  public gc(IndexTopWidget paramIndexTopWidget) {}
  
  public int getCount()
  {
    if (IndexTopWidget.j(this.a) == 1) {
      return IndexTopWidget.b().size();
    }
    if ((IndexTopWidget.j(this.a) == 3) && (IndexTopWidget.g(this.a) != null)) {
      return IndexTopWidget.g(this.a).size();
    }
    return 0;
  }
  
  public Object getItem(int paramInt)
  {
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramViewGroup = new gg(this);
      paramView = new LinearLayout(this.a.getContext());
      paramView.setOrientation(1);
      paramView.setGravity(17);
      localObject = new TextView(this.a.getContext());
      ((TextView)localObject).setTextColor(-4932146);
      ((TextView)localObject).setTextSize(14.0F);
      ((TextView)localObject).setLines(2);
      ((TextView)localObject).setEllipsize(TextUtils.TruncateAt.END);
      ((TextView)localObject).setGravity(17);
      paramView.addView((View)localObject);
      gb localgb = new gb(this.a, this.a.getContext());
      paramView.addView(localgb);
      paramViewGroup.a = ((TextView)localObject);
      paramViewGroup.b = localgb;
      paramView.setTag(paramViewGroup);
      if (IndexTopWidget.j(this.a) != 1) {
        break label218;
      }
      paramViewGroup.a.setVisibility(8);
      paramViewGroup.b.setVisibility(0);
      paramViewGroup.b.a(((ga)IndexTopWidget.b().get(paramInt)).a);
      paramViewGroup.b.setOnClickListener(new gd(this, paramInt));
    }
    label218:
    while (IndexTopWidget.j(this.a) != 3)
    {
      return paramView;
      paramViewGroup = (gg)paramView.getTag();
      break;
    }
    Object localObject = (GroupAdvertVo.AdvList)IndexTopWidget.g(this.a).get(paramInt);
    if (((GroupAdvertVo.AdvList)localObject).type == 2)
    {
      paramViewGroup.a.setVisibility(8);
      paramViewGroup.b.setVisibility(0);
      paramViewGroup.b.a(((GroupAdvertVo.AdvList)localObject).content);
      paramViewGroup.b.setOnClickListener(new ge(this, (GroupAdvertVo.AdvList)localObject));
      return paramView;
    }
    paramViewGroup.a.setVisibility(0);
    paramViewGroup.b.setVisibility(8);
    paramViewGroup.a.setText(((GroupAdvertVo.AdvList)localObject).content);
    paramViewGroup.a.setOnClickListener(new gf(this, (GroupAdvertVo.AdvList)localObject));
    return paramView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\gc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */