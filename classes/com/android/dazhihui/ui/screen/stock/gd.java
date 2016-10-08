package com.android.dazhihui.ui.screen.stock;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.dazhihui.DzhApplication;
import com.g.a.a.a.b.c;
import com.g.a.b.a.h;
import com.g.a.b.g;
import com.g.a.b.j;
import java.util.ArrayList;

class gd
  extends BaseAdapter
{
  ge a;
  private ArrayList<gf> c;
  
  gd(fu paramfu) {}
  
  public void a(ArrayList<gf> paramArrayList)
  {
    this.c = paramArrayList;
  }
  
  public int getCount()
  {
    return this.c.size();
  }
  
  public Object getItem(int paramInt)
  {
    return this.c.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = fu.i(this.b).inflate(2130903303, null);
      this.a = new ge(this);
      this.a.a = ((ImageView)paramView.findViewById(2131559951));
      this.a.b = ((TextView)paramView.findViewById(2131559953));
      this.a.c = ((TextView)paramView.findViewById(2131559952));
      paramView.setTag(this.a);
      if (TextUtils.isEmpty(((gf)this.c.get(paramInt)).d)) {
        break label306;
      }
      if (!g.a().b())
      {
        paramViewGroup = new j(DzhApplication.a().getApplicationContext()).a(3).a().a(new c()).a(h.b).b();
        g.a().a(paramViewGroup);
      }
      g.a().a(((gf)this.c.get(paramInt)).d, this.a.a, fu.j(this.b));
    }
    for (;;)
    {
      this.a.b.setText(((gf)this.c.get(paramInt)).a);
      if (((gf)this.c.get(paramInt)).b <= 0) {
        break label380;
      }
      this.a.c.setText(((gf)this.c.get(paramInt)).b + "");
      this.a.c.setVisibility(0);
      return paramView;
      this.a = ((ge)paramView.getTag());
      break;
      label306:
      if ((TextUtils.isEmpty(((gf)this.c.get(paramInt)).d)) && (((gf)this.c.get(paramInt)).c > 0)) {
        this.a.a.setImageDrawable(this.b.getResources().getDrawable(((gf)this.c.get(paramInt)).c));
      }
    }
    label380:
    this.a.c.setVisibility(8);
    return paramView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\gd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */