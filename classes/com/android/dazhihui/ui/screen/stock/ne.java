package com.android.dazhihui.ui.screen.stock;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.dazhihui.a.f;
import com.android.dazhihui.d.n;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.screen.a;
import com.android.dazhihui.ui.screen.y;

public class ne
  extends a
  implements View.OnClickListener
{
  int a = 0;
  private ViewPager b;
  private TextView c;
  private TextView d;
  private TextView e;
  private LayoutInflater f;
  private String[] g = { "全部", "公告", "研报" };
  private String h;
  private int i;
  private String j;
  private View k;
  private View l;
  private View m;
  private View n;
  
  public String a(String paramString1, String paramString2)
  {
    if ((this.i == 2) || (this.i == 10) || (this.i == 11)) {
      return f.O + "/" + paramString1.substring(paramString1.length() - 2) + "/" + paramString1.substring(2) + "/" + "jjgg/1.json";
    }
    if (n.o(this.j) == 4) {
      return f.R + paramString1.substring(0, 2) + "/" + paramString1.substring(paramString1.length() - 2) + "/" + paramString1.substring(2) + "/" + paramString2;
    }
    return f.N + paramString1.substring(0, 2) + "/" + paramString1.substring(paramString1.length() - 2) + "/" + paramString1.substring(2) + "/" + paramString2;
  }
  
  public void a(int paramInt)
  {
    if (g.a().b() == y.a) {
      if (paramInt == 0)
      {
        this.c.setTextColor(-13857561);
        this.d.setTextColor(-8553091);
        this.e.setTextColor(-8553091);
      }
    }
    do
    {
      do
      {
        return;
        if (paramInt == 1)
        {
          this.c.setTextColor(-8553091);
          this.d.setTextColor(-13857561);
          this.e.setTextColor(-8553091);
          return;
        }
      } while (paramInt != 2);
      this.c.setTextColor(-8553091);
      this.d.setTextColor(-8553091);
      this.e.setTextColor(-13857561);
      return;
      if (paramInt == 0)
      {
        this.c.setTextColor(-12686651);
        this.d.setTextColor(-10066330);
        this.e.setTextColor(-10066330);
        return;
      }
      if (paramInt == 1)
      {
        this.c.setTextColor(-10066330);
        this.d.setTextColor(-12686651);
        this.e.setTextColor(-10066330);
        return;
      }
    } while (paramInt != 2);
    this.c.setTextColor(-10066330);
    this.d.setTextColor(-10066330);
    this.e.setTextColor(-12686651);
  }
  
  protected void a(View paramView)
  {
    this.c = ((TextView)paramView.findViewById(2131558598));
    this.d = ((TextView)paramView.findViewById(2131560123));
    this.e = ((TextView)paramView.findViewById(2131558599));
    this.b = ((ViewPager)paramView.findViewById(2131558600));
    this.k = paramView.findViewById(2131560120);
    this.l = paramView.findViewById(2131560121);
    this.m = paramView.findViewById(2131560122);
    this.n = paramView.findViewById(2131560124);
    this.c.setOnClickListener(this);
    this.d.setOnClickListener(this);
    this.e.setOnClickListener(this);
    this.b.setAdapter(new nh(this, getActivity().getSupportFragmentManager()));
    this.b.setOnPageChangeListener(new nf(this));
    a(0);
  }
  
  public void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (ng.a[paramy.ordinal()])
      {
      }
    }
    for (;;)
    {
      a(this.a);
      return;
      this.m.setBackgroundColor(-12961474);
      this.n.setBackgroundColor(-12961474);
      this.k.setBackgroundColor(0);
      this.l.setBackgroundResource(2130838484);
      continue;
      this.m.setBackgroundColor(-2697514);
      this.n.setBackgroundColor(-2697514);
      this.k.setBackgroundColor(-789513);
      this.l.setBackgroundResource(2130838485);
    }
  }
  
  public View getScroolView()
  {
    return ((lp)((nh)this.b.getAdapter()).a()).getScroolView();
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131558598: 
      this.b.setCurrentItem(0);
      return;
    case 2131560123: 
      this.b.setCurrentItem(1);
      return;
    }
    this.b.setCurrentItem(2);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.h = getArguments().getString("stockCode");
    this.i = getArguments().getInt("modelType");
    this.j = getArguments().getString("modelCode");
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.f = paramLayoutInflater;
    paramLayoutInflater = paramLayoutInflater.inflate(2130903348, paramViewGroup, false);
    a(paramLayoutInflater);
    changeLookFace(this.mLookFace);
    return paramLayoutInflater;
  }
  
  public void onPulledrefresh(boolean paramBoolean)
  {
    ((lp)((nh)this.b.getAdapter()).a()).onPulledrefresh(paramBoolean);
  }
  
  public void refresh()
  {
    if ((-1 < this.a) && (this.a < 3)) {
      ((lp)((nh)this.b.getAdapter()).a()).refresh();
    }
    super.refresh();
  }
  
  public void show()
  {
    super.show();
    if ((-1 < this.a) && (this.a < 3)) {
      ((lp)((nh)this.b.getAdapter()).a()).show();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ne.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */