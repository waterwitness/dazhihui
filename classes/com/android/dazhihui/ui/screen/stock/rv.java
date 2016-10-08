package com.android.dazhihui.ui.screen.stock;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.dazhihui.d.q;
import com.android.dazhihui.ui.screen.y;

class rv
  extends BaseAdapter
{
  private LayoutInflater b;
  private String[] c;
  private String[] d;
  private boolean[] e;
  private String[] f;
  private int[] g;
  
  public rv(SearchStockScreen paramSearchStockScreen, String[] paramArrayOfString1, String[] paramArrayOfString2, boolean[] paramArrayOfBoolean, String[] paramArrayOfString3, int[] paramArrayOfInt)
  {
    this.c = paramArrayOfString1;
    this.d = paramArrayOfString2;
    this.f = paramArrayOfString3;
    this.e = paramArrayOfBoolean;
    this.b = LayoutInflater.from(paramSearchStockScreen);
    this.g = paramArrayOfInt;
  }
  
  public void a(String[] paramArrayOfString1, String[] paramArrayOfString2, boolean[] paramArrayOfBoolean, String[] paramArrayOfString3, int[] paramArrayOfInt)
  {
    this.c = paramArrayOfString1;
    this.d = paramArrayOfString2;
    this.e = paramArrayOfBoolean;
    this.f = paramArrayOfString3;
    this.g = paramArrayOfInt;
    notifyDataSetChanged();
    notifyDataSetInvalidated();
  }
  
  public int getCount()
  {
    return this.c.length;
  }
  
  public Object getItem(int paramInt)
  {
    return this.c[paramInt];
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    label241:
    String str;
    if (paramView == null)
    {
      paramView = this.b.inflate(2130903404, null);
      paramViewGroup = new ry(this);
      paramViewGroup.a = ((TextView)paramView.findViewById(2131560311));
      paramViewGroup.b = ((TextView)paramView.findViewById(2131560312));
      paramViewGroup.c = ((TextView)paramView.findViewById(2131560314));
      paramViewGroup.d = ((ImageView)paramView.findViewById(2131560315));
      paramViewGroup.e = ((ImageView)paramView.findViewById(2131560316));
      paramViewGroup.f = ((TextView)paramView.findViewById(2131560310));
      paramViewGroup.g = ((LinearLayout)paramView.findViewById(2131560313));
      paramView.setTag(paramViewGroup);
      if (SearchStockScreen.u(this.a) != y.b) {
        break label452;
      }
      paramView.setBackgroundResource(2130838826);
      paramViewGroup.a.setTextColor(this.a.getResources().getColor(2131493609));
      paramViewGroup.b.setTextColor(this.a.getResources().getColor(2131493609));
      paramViewGroup.f.setTextColor(-10066330);
      paramViewGroup.f.setBackgroundColor(-1184271);
      paramViewGroup.d.setImageDrawable(q.a(this.a, 2130838562, SearchStockScreen.v(this.a)));
      paramViewGroup.e.setImageDrawable(q.a(this.a, 2130838564, SearchStockScreen.v(this.a)));
      paramViewGroup.a.setText(this.c[paramInt]);
      paramViewGroup.b.setText(this.d[paramInt]);
      paramViewGroup.a.setTextSize(1, SearchStockScreen.w(this.a) / SearchStockScreen.x(this.a));
      paramViewGroup.b.setTextSize(1, SearchStockScreen.w(this.a) / SearchStockScreen.x(this.a));
      if ((this.g == null) || (this.g.length <= paramInt) || (this.f == null) || (this.f.length <= paramInt)) {
        break label568;
      }
      str = SearchStockScreen.a(this.a, this.g[paramInt], this.f[paramInt]);
      if (!TextUtils.isEmpty(str)) {
        break label548;
      }
      paramViewGroup.f.setVisibility(4);
    }
    for (;;)
    {
      if (SearchStockScreen.l(this.a) != 1) {
        break label579;
      }
      paramViewGroup.d.setVisibility(8);
      paramViewGroup.e.setVisibility(8);
      paramViewGroup.c.setVisibility(8);
      if (SearchStockScreen.g(this.a) == 3) {
        paramViewGroup.g.setVisibility(4);
      }
      return paramView;
      paramViewGroup = (ry)paramView.getTag();
      break;
      label452:
      paramView.setBackgroundResource(2130838746);
      paramViewGroup.a.setTextColor(this.a.getResources().getColor(2131493546));
      paramViewGroup.b.setTextColor(this.a.getResources().getColor(2131493546));
      paramViewGroup.f.setTextColor(-1);
      paramViewGroup.f.setBackgroundColor(-13616832);
      paramViewGroup.d.setImageDrawable(q.a(this.a, 2130838562));
      paramViewGroup.e.setImageDrawable(q.a(this.a, 2130838564));
      break label241;
      label548:
      paramViewGroup.f.setVisibility(0);
      paramViewGroup.f.setText(str);
      continue;
      label568:
      paramViewGroup.f.setVisibility(4);
    }
    label579:
    if (this.e[paramInt] != 0)
    {
      paramViewGroup.d.setVisibility(8);
      paramViewGroup.e.setVisibility(0);
      paramViewGroup.c.setVisibility(0);
      paramViewGroup.c.setText(this.a.getString(2131165259));
      paramViewGroup.c.setTextSize(1, SearchStockScreen.y(this.a) / SearchStockScreen.x(this.a));
    }
    for (;;)
    {
      paramViewGroup.d.setOnClickListener(new rw(this, paramInt));
      paramViewGroup.e.setOnClickListener(new rx(this, paramInt));
      break;
      paramViewGroup.d.setVisibility(0);
      paramViewGroup.e.setVisibility(8);
      paramViewGroup.c.setVisibility(8);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\rv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */