package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.dazhihui.ui.screen.y;

public class DoubleDragTitle
  extends RelativeLayout
  implements View.OnClickListener, ng
{
  private static String[] v = { "1日变动%↓", "3日变动%↓", "1周变动%↓", "2周变动%↓", "1月变动%↓", "3月变动%↓" };
  private static String[] w = { "1日变动%", "3日变动%", "1周变动%", "2周变动%", "1月变动%", "3月变动%" };
  private boolean a = true;
  private ImageView b;
  private ImageView c;
  private LayoutInflater d;
  private View e;
  private WindowManager f;
  private Display g;
  private DisplayMetrics h;
  private View i;
  private View j;
  private VHDragListView k;
  private TextView l;
  private TextView m;
  private TextView n;
  private TextView o;
  private TextView p;
  private TextView q;
  private TextView r;
  private TextView s;
  private int t = -5392698;
  private int u;
  
  public DoubleDragTitle(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.d = LayoutInflater.from(paramContext);
    this.f = ((WindowManager)paramContext.getSystemService("window"));
    this.g = this.f.getDefaultDisplay();
    this.h = new DisplayMetrics();
    this.g.getMetrics(this.h);
    a();
  }
  
  private void a()
  {
    this.d.inflate(2130903555, this);
    this.b = ((ImageView)findViewById(2131561217));
    this.b.setEnabled(false);
    this.c = ((ImageView)findViewById(2131560288));
    this.i = findViewById(2131561219);
    this.j = findViewById(2131561218);
    this.l = ((TextView)findViewById(2131561220));
    this.m = ((TextView)findViewById(2131561223));
    this.n = ((TextView)findViewById(2131561222));
    this.o = ((TextView)findViewById(2131561225));
    this.p = ((TextView)findViewById(2131561226));
    this.q = ((TextView)findViewById(2131561221));
    this.r = ((TextView)findViewById(2131561224));
    this.s = ((TextView)findViewById(2131561216));
    setBackgroundColor(getResources().getColor(2131493544));
  }
  
  private void a(int paramInt) {}
  
  public void a(y paramy)
  {
    if (paramy != null) {}
    switch (bg.a[paramy.ordinal()])
    {
    default: 
      return;
    case 1: 
      this.t = -5392698;
      this.u = getResources().getColor(2131493545);
      this.l.setTextColor(this.t);
      this.m.setTextColor(this.t);
      this.n.setTextColor(this.t);
      this.o.setTextColor(this.t);
      this.p.setTextColor(this.t);
      this.q.setTextColor(this.t);
      this.r.setTextColor(this.t);
      this.s.setTextColor(this.t);
      setBackgroundColor(getResources().getColor(2131493544));
      return;
    }
    this.t = -10066330;
    this.u = getResources().getColor(2131493608);
    this.l.setTextColor(this.t);
    this.m.setTextColor(this.t);
    this.n.setTextColor(this.t);
    this.o.setTextColor(this.t);
    this.p.setTextColor(this.t);
    this.q.setTextColor(this.t);
    this.r.setTextColor(this.t);
    this.s.setTextColor(this.t);
    setBackgroundColor(getResources().getColor(2131493607));
  }
  
  public void a(String paramString1, String paramString2)
  {
    this.l.setText(paramString1);
    this.m.setText(paramString2);
  }
  
  public void onClick(View paramView)
  {
    if (this.e == paramView) {
      if (this.a)
      {
        this.a = false;
        paramView.setBackgroundResource(2130838612);
      }
    }
    for (;;)
    {
      a(((Integer)paramView.getTag()).intValue());
      return;
      this.a = true;
      paramView.setBackgroundResource(2130838617);
      continue;
      this.a = true;
      paramView.setBackgroundResource(2130838617);
      if (this.e != null) {
        this.e.setBackgroundResource(2130838615);
      }
      this.e = paramView;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (this.k != null)
    {
      paramInt1 = this.i.getMeasuredWidth() - this.j.getMeasuredWidth() + 1;
      if (paramInt1 <= 0) {
        break label44;
      }
    }
    for (;;)
    {
      this.k.setMaxScrollX(paramInt1);
      return;
      label44:
      paramInt1 = 0;
    }
  }
  
  public void setArrowLeftEnable(boolean paramBoolean)
  {
    this.b.setEnabled(paramBoolean);
  }
  
  public void setArrowRightEnable(boolean paramBoolean)
  {
    this.c.setEnabled(paramBoolean);
  }
  
  public void setListView(VHDragListView paramVHDragListView)
  {
    this.k = paramVHDragListView;
  }
  
  public void setTitleScale(int paramInt)
  {
    this.n.setText(v[paramInt]);
    this.o.setText(w[paramInt]);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\DoubleDragTitle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */