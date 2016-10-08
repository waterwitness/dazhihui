package com.android.dazhihui.ui.delegate.screen.margin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import com.android.dazhihui.ui.delegate.b.e;

class n
  extends BaseAdapter
{
  private LayoutInflater b;
  
  public n(h paramh, Context paramContext)
  {
    this.b = LayoutInflater.from(paramContext);
  }
  
  public int getCount()
  {
    return 3;
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
    View localView;
    if (paramView == null)
    {
      paramViewGroup = new p(this);
      localView = this.b.inflate(2130903591, null);
      paramViewGroup.a = ((TextView)localView.findViewById(2131560799));
      paramViewGroup.b = ((Button)localView.findViewById(2131561346));
      paramViewGroup.c = ((TextView)localView.findViewById(2131560801));
      paramViewGroup.d = ((TextView)localView.findViewById(2131560802));
      paramViewGroup.e = ((TextView)localView.findViewById(2131560804));
      paramViewGroup.f = ((TextView)localView.findViewById(2131561347));
      localView.setTag(paramViewGroup);
      if (paramInt != 0) {
        break label234;
      }
      paramView = h.f(this.a);
    }
    for (;;)
    {
      label127:
      paramViewGroup.b.setText("银证转账");
      if ((paramView != null) && (paramView.a() != null))
      {
        paramViewGroup.a.setText(paramView.a());
        paramViewGroup.c.setText(paramView.b());
        paramViewGroup.d.setText(paramView.c());
        paramViewGroup.e.setText(paramView.d());
        paramViewGroup.f.setText(paramView.e());
      }
      for (;;)
      {
        paramViewGroup.b.setOnClickListener(new o(this));
        return localView;
        paramViewGroup = (p)paramView.getTag();
        localView = paramView;
        break;
        label234:
        if (paramInt == 1)
        {
          paramView = h.g(this.a);
          break label127;
        }
        if (paramInt != 2) {
          break label314;
        }
        paramView = h.h(this.a);
        break label127;
        paramViewGroup.a.setText("--");
        paramViewGroup.c.setText("--");
        paramViewGroup.d.setText("--");
        paramViewGroup.e.setText("--");
        paramViewGroup.f.setText("--");
      }
      label314:
      paramView = null;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */