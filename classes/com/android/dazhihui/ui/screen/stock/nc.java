package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.SpecialReportVo.Stock;
import com.android.dazhihui.ui.model.stock.StockVo;
import java.util.ArrayList;

public class nc
  extends BaseAdapter
  implements AdapterView.OnItemClickListener
{
  private Context a;
  private ArrayList<SpecialReportVo.Stock> b;
  
  public nc(Context paramContext, ArrayList<SpecialReportVo.Stock> paramArrayList)
  {
    this.a = paramContext;
    this.b = paramArrayList;
  }
  
  public int getCount()
  {
    if (this.b == null) {
      return 0;
    }
    return this.b.size() + 1;
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
    Object localObject;
    if (paramView == null)
    {
      paramViewGroup = new TextView(this.a);
      paramView = paramViewGroup;
      localObject = paramViewGroup;
      paramViewGroup = paramView;
    }
    while (paramInt == 0)
    {
      paramViewGroup.setText("相关股票:");
      paramViewGroup.setTextColor(-16777216);
      paramViewGroup.setGravity(3);
      paramViewGroup.setGravity(17);
      paramViewGroup.setMaxLines(1);
      paramViewGroup.setPadding(0, 3, 0, 3);
      paramViewGroup.setTextSize(2, 16.0F);
      paramViewGroup.setBackgroundColor(17170445);
      return (View)localObject;
      paramViewGroup = (TextView)paramView;
      localObject = paramView;
    }
    paramViewGroup.setText(((SpecialReportVo.Stock)this.b.get(paramInt - 1)).stockname);
    paramViewGroup.setTextColor(-12940073);
    paramViewGroup.setGravity(17);
    paramViewGroup.setTextColor(this.a.getResources().getColorStateList(2130838481));
    paramViewGroup.setTextSize(2, 15.0F);
    paramViewGroup.setPadding(0, 3, 0, 3);
    paramViewGroup.setBackgroundResource(2130838480);
    return (View)localObject;
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt == 0) {
      return;
    }
    paramAdapterView = new StockVo(((SpecialReportVo.Stock)this.b.get(paramInt - 1)).stockname, ((SpecialReportVo.Stock)this.b.get(paramInt - 1)).stockcode, 1, false);
    paramView = new Bundle();
    paramView.putString("code", ((SpecialReportVo.Stock)this.b.get(paramInt - 1)).stockcode);
    r.a(this.a, paramAdapterView, paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\nc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */