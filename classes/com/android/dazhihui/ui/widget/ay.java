package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.dazhihui.ui.screen.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ay
  extends BaseAdapter
  implements nf
{
  private int a = 125;
  private int b = 0;
  private int c;
  private int d;
  private boolean e = false;
  private Context f;
  private LayoutInflater g;
  private List<HashMap<Integer, String>> h;
  private y i = y.a;
  private int j = -1;
  
  public ay(Context paramContext, int paramInt1, int paramInt2, List<HashMap<Integer, String>> paramList)
  {
    this.f = paramContext;
    this.d = paramInt1;
    this.c = paramInt2;
    this.h = paramList;
    if (this.h == null) {
      this.h = new ArrayList();
    }
    this.g = LayoutInflater.from(paramContext);
    paramList = new DisplayMetrics();
    ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getMetrics(paramList);
    this.a = ((int)(this.a * paramList.density));
  }
  
  private int a(String paramString)
  {
    double d1;
    do
    {
      try
      {
        d1 = Double.parseDouble(paramString);
        if (d1 <= 0.0D) {
          continue;
        }
        return -65536;
      }
      catch (NumberFormatException paramString)
      {
        int k;
        return this.j;
      }
      k = this.j;
      return k;
    } while (d1 >= 0.0D);
    return -16711936;
  }
  
  public void a(int paramInt)
  {
    this.b = paramInt;
  }
  
  public void a(y paramy)
  {
    if (paramy != null)
    {
      this.i = paramy;
      switch (az.a[paramy.ordinal()])
      {
      }
    }
    for (;;)
    {
      notifyDataSetChanged();
      return;
      this.j = -1;
      continue;
      this.j = -16777216;
    }
  }
  
  public int getCount()
  {
    return this.h.size();
  }
  
  public Object getItem(int paramInt)
  {
    return this.h.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int k;
    String str;
    if (paramView != null)
    {
      localObject = (LinearLayout)paramView.findViewById(2131561252);
      k = 2;
      paramViewGroup = paramView;
      if (k < this.c)
      {
        paramViewGroup = (TextView)((LinearLayout)localObject).findViewWithTag(Integer.valueOf(k));
        if (((HashMap)this.h.get(paramInt)).get(Integer.valueOf(k)) != null)
        {
          str = (String)((HashMap)this.h.get(paramInt)).get(Integer.valueOf(k));
          paramViewGroup.setText(str);
          switch (k)
          {
          }
        }
        for (;;)
        {
          k += 1;
          break;
          paramViewGroup.setTextColor(this.j);
          continue;
          paramViewGroup.setTextColor(a(str));
          continue;
          paramViewGroup.setTextColor(this.j);
          continue;
          paramViewGroup.setTextColor(a(str));
          continue;
          paramViewGroup.setTextColor(this.j);
          continue;
          paramViewGroup.setText("--");
          paramViewGroup.setTextColor(this.j);
        }
      }
    }
    else
    {
      paramView = this.g.inflate(this.d, paramViewGroup, false);
      localObject = (LinearLayout)paramView.findViewById(2131561252);
      paramViewGroup = ((LinearLayout)localObject).getLayoutParams();
      paramViewGroup.width = (this.a * this.c + 20);
      ((LinearLayout)localObject).setLayoutParams(paramViewGroup);
      k = 2;
      paramViewGroup = paramView;
      if (k < this.c)
      {
        paramViewGroup = new TextView(this.f);
        paramViewGroup.setWidth(this.a);
        paramViewGroup.setTag(Integer.valueOf(k));
        paramViewGroup.setGravity(1);
        paramViewGroup.setSingleLine(true);
        paramViewGroup.setTypeface(Typeface.DEFAULT_BOLD);
        paramViewGroup.setTextSize(1, 18.0F);
        if (((HashMap)this.h.get(paramInt)).get(Integer.valueOf(k)) != null)
        {
          str = (String)((HashMap)this.h.get(paramInt)).get(Integer.valueOf(k));
          paramViewGroup.setText(str);
          switch (k)
          {
          }
        }
        for (;;)
        {
          ((LinearLayout)localObject).addView(paramViewGroup);
          k += 1;
          break;
          paramViewGroup.setTextColor(this.j);
          continue;
          paramViewGroup.setTextColor(a(str));
          continue;
          paramViewGroup.setTextColor(this.j);
          continue;
          paramViewGroup.setTextColor(a(str));
          continue;
          paramViewGroup.setTextColor(this.j);
          continue;
          paramViewGroup.setText("--");
          paramViewGroup.setTextColor(this.j);
        }
      }
    }
    paramView = (TextView)paramViewGroup.findViewById(2131561250);
    Object localObject = (TextView)paramViewGroup.findViewById(2131561251);
    if (this.i == y.b)
    {
      paramView.setTextColor(this.f.getResources().getColor(2131493626));
      ((TextView)localObject).setTextColor(this.f.getResources().getColor(2131493625));
      paramViewGroup.setBackgroundResource(2130838826);
      if ((this.h.get(paramInt) == null) || (((HashMap)this.h.get(paramInt)).get(Integer.valueOf(0)) == null)) {
        break label778;
      }
      paramView.setText((CharSequence)((HashMap)this.h.get(paramInt)).get(Integer.valueOf(0)));
      label656:
      if ((this.h.get(paramInt) == null) || (((HashMap)this.h.get(paramInt)).get(Integer.valueOf(1)) == null)) {
        break label787;
      }
      ((TextView)localObject).setText((CharSequence)((HashMap)this.h.get(paramInt)).get(Integer.valueOf(1)));
    }
    for (;;)
    {
      paramViewGroup.findViewById(2131561252).scrollTo(this.b, 0);
      return paramViewGroup;
      paramView.setTextColor(this.f.getResources().getColor(2131493563));
      ((TextView)localObject).setTextColor(this.f.getResources().getColor(2131493562));
      paramViewGroup.setBackgroundResource(2130838746);
      break;
      label778:
      paramView.setText("--");
      break label656;
      label787:
      ((TextView)localObject).setText("--");
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */