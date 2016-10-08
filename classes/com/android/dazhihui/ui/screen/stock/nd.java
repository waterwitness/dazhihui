package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.android.dazhihui.ui.model.stock.SpecialReportVo.ImageItem;
import com.android.dazhihui.ui.widget.a.r;
import java.util.ArrayList;

public class nd
  extends BaseAdapter
{
  private Context a;
  private ArrayList<SpecialReportVo.ImageItem> b;
  
  public nd(Context paramContext, ArrayList<SpecialReportVo.ImageItem> paramArrayList)
  {
    this.a = paramContext;
    this.b = paramArrayList;
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
      paramViewGroup = new ImageView(this.a);
      paramViewGroup.setScaleType(ImageView.ScaleType.CENTER_CROP);
      paramView = paramViewGroup;
      localObject = paramViewGroup;
      paramViewGroup = paramView;
    }
    for (;;)
    {
      r.a(this.a).a(((SpecialReportVo.ImageItem)this.b.get(paramInt)).path, paramViewGroup);
      return (View)localObject;
      paramViewGroup = (ImageView)paramView;
      localObject = paramView;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\nd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */