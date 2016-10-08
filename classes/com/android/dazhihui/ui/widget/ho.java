package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ho
  extends BaseAdapter
{
  private LayoutInflater a;
  private String[] b;
  private Context c;
  private int d;
  private String e;
  
  public ho(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    this.a = LayoutInflater.from(paramContext);
    this.c = paramContext;
    this.b = paramArrayOfString;
    this.e = paramString;
  }
  
  public void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  public String b(int paramInt)
  {
    return this.b[paramInt];
  }
  
  public int getCount()
  {
    return this.b.length;
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView;
    if (paramView == null)
    {
      localView = this.a.inflate(2130903575, null);
      paramView = new hq();
      paramView.a = ((TextView)localView.findViewById(2131558567));
      paramView.b = ((LinearLayout)localView.findViewById(2131561264));
      paramView.c = ((ImageView)localView.findViewById(2131561265));
      localView.setTag(paramView);
      paramViewGroup = paramView;
      if (!this.b[paramInt].equals("股价预警")) {
        break label175;
      }
      paramViewGroup.b.setVisibility(0);
      paramViewGroup.b.setOnClickListener(new hp(this));
      label111:
      if ((this.e == null) || (!this.e.equals("js"))) {
        break label187;
      }
      localView.setBackgroundResource(2131493660);
      paramViewGroup.a.setTextColor(-1);
    }
    for (;;)
    {
      paramViewGroup.a.setText(this.b[paramInt]);
      return localView;
      paramViewGroup = (hq)paramView.getTag();
      localView = paramView;
      break;
      label175:
      paramViewGroup.b.setVisibility(8);
      break label111;
      label187:
      if ((this.e != null) && (this.e.equals("messageCenter"))) {
        if (paramInt == this.d)
        {
          localView.setBackgroundResource(2130838386);
          paramViewGroup.a.setTextColor(41472);
        }
        else
        {
          localView.setBackgroundResource(2131493660);
          paramViewGroup.a.setTextColor(-1);
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ho.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */