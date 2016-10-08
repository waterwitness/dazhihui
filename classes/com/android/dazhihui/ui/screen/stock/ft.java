package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout.LayoutParams;
import com.android.dazhihui.d.c;
import com.android.dazhihui.g;

class ft
  extends BaseAdapter
{
  public ft(LeadScreen paramLeadScreen, Context paramContext) {}
  
  public int getCount()
  {
    return c.g.length;
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
    Object localObject;
    RelativeLayout.LayoutParams localLayoutParams;
    if (paramView == null)
    {
      paramViewGroup = new fs(this.a, null);
      paramView = LeadScreen.a(this.a).inflate(2130903566, null);
      paramViewGroup.a = ((ImageView)paramView.findViewById(2131561246));
      paramViewGroup.b = ((Button)paramView.findViewById(2131561247));
      paramView.setTag(paramViewGroup);
      if (paramInt != c.g.length - 1) {
        break label279;
      }
      localObject = g.a();
      paramViewGroup.b.setVisibility(0);
      int i = ((g)localObject).m() * 2 / 5;
      localLayoutParams = new RelativeLayout.LayoutParams(i, i / 3);
      int j = ((g)localObject).n();
      int k = (i / 3 + this.a.getResources().getDimensionPixelSize(2131230845)) / 2;
      localLayoutParams.setMargins((((g)localObject).m() - i) / 2, j - k, 0, 0);
      paramViewGroup.b.setLayoutParams(localLayoutParams);
      paramViewGroup.b.setText("");
      paramViewGroup.b.setTextColor(-1);
      paramViewGroup.b.setBackgroundResource(2130837586);
      paramViewGroup.b.setOnClickListener(this.a);
    }
    for (;;)
    {
      localObject = BitmapFactory.decodeResource(this.a.getResources(), c.g[paramInt].intValue());
      localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
      paramViewGroup.a.setImageBitmap((Bitmap)localObject);
      paramViewGroup.a.setScaleType(ImageView.ScaleType.FIT_XY);
      paramViewGroup.a.setLayoutParams(localLayoutParams);
      return paramView;
      paramViewGroup = (fs)paramView.getTag();
      break;
      label279:
      paramViewGroup.b.setVisibility(8);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ft.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */