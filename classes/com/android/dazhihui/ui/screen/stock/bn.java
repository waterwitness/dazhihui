package com.android.dazhihui.ui.screen.stock;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.JsonCommentItem;
import java.util.List;

class bn
  extends BaseAdapter
{
  private List<JsonCommentItem> b;
  
  public bn(DynamicDetailScreen paramDynamicDetailScreen) {}
  
  public void a(List<JsonCommentItem> paramList)
  {
    DynamicDetailScreen.a(this.a);
    this.b = paramList;
    notifyDataSetChanged();
  }
  
  public int getCount()
  {
    if (this.b == null) {
      return 0;
    }
    return this.b.size();
  }
  
  public Object getItem(int paramInt)
  {
    return Integer.valueOf(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramViewGroup = paramView;
    if (paramView == null)
    {
      paramView = new bo(this);
      paramViewGroup = LayoutInflater.from(this.a).inflate(2130903554, null);
      paramView.b = ((TextView)paramViewGroup.findViewById(2131561215));
      paramView.a = ((TextView)paramViewGroup.findViewById(2131559125));
      bo.a(paramView, (TextView)paramViewGroup.findViewById(2131558645));
      paramViewGroup.setTag(paramView);
    }
    paramView = (bo)paramViewGroup.getTag();
    Object localObject = (JsonCommentItem)this.b.get(paramInt);
    String str = ((JsonCommentItem)localObject).getContent().trim();
    if (localObject != null)
    {
      bo.a(paramView).setVisibility(0);
      bo.a(paramView).setText(str);
      paramView.a.setText(((JsonCommentItem)localObject).getIp());
      localObject = n.q(((JsonCommentItem)localObject).getCtime());
      paramView.b.setText((CharSequence)localObject);
      return paramViewGroup;
    }
    paramView.a.setText("none");
    paramView.b.setText("none");
    return paramViewGroup;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */