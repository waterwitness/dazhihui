package com.android.dazhihui.ui.widget;

import android.app.Activity;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.android.dazhihui.d.a;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.screen.BaseActivity;
import java.util.ArrayList;

public class hi
{
  private Activity a;
  private View b;
  private LayoutInflater c;
  private PopupWindow d;
  private ListView e;
  private hm f;
  private ArrayList<String> g = new ArrayList();
  private hl h;
  private int i = 0;
  private int j = -1;
  
  public hi(BaseActivity paramBaseActivity, ArrayList<String> paramArrayList)
  {
    if (paramArrayList != null) {
      this.g = paramArrayList;
    }
    a(paramBaseActivity);
  }
  
  private void a(Activity paramActivity)
  {
    this.a = paramActivity;
    this.c = this.a.getLayoutInflater();
    int m = g.a().n() * 15 / 320;
    this.b = this.c.inflate(2130903301, null);
    this.e = ((ListView)this.b.findViewById(2131559948));
    int k = 0;
    while (k < this.g.size())
    {
      if (this.i < a.b((String)this.g.get(k), m)) {
        this.i = a.b((String)this.g.get(k), m);
      }
      k += 1;
    }
    this.e.setLayoutParams(new LinearLayout.LayoutParams(this.i, -2));
    this.f = new hm(this);
    this.e.setAdapter(this.f);
    this.e.setOnItemClickListener(new hk(this));
    this.d = new PopupWindow(this.b, -2, -2);
    this.d.setFocusable(true);
    this.d.setTouchable(true);
    this.d.setBackgroundDrawable(this.a.getResources().getDrawable(2130837563));
  }
  
  public void a(int paramInt)
  {
    this.j = paramInt;
  }
  
  public void a(View paramView)
  {
    if (this.f != null) {
      this.f.a();
    }
    this.d.showAsDropDown(paramView, 0, 0);
  }
  
  public void a(hl paramhl)
  {
    this.h = paramhl;
  }
  
  public void a(ArrayList<String> paramArrayList)
  {
    this.g = paramArrayList;
  }
  
  public void b(int paramInt)
  {
    this.d.setBackgroundDrawable(this.a.getResources().getDrawable(paramInt));
  }
  
  public void c(int paramInt)
  {
    if ((this.e != null) && (paramInt >= this.i)) {
      this.e.setLayoutParams(new LinearLayout.LayoutParams(paramInt, -2));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\hi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */