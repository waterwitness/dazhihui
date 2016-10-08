package com.android.dazhihui.ui.delegate.newtrade.widge.kline_widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.dazhihui.ui.screen.y;
import java.util.Vector;

public class b
  extends LinearLayout
  implements View.OnClickListener, View.OnTouchListener
{
  private int A = -5395027;
  private int B = -13486781;
  private int C = -5395027;
  private int D = -12961221;
  private int E = 2130838265;
  private int F = 2130838267;
  private int G = 2130838628;
  private int H = 2130838118;
  private int I = 2130838119;
  private int J = -11907497;
  private Vector<View> K = new Vector();
  private Context L;
  private e a = e.g;
  private FrameLayout b;
  private LinearLayout c;
  private LinearLayout d;
  private d e;
  private TextView f;
  private TextView g;
  private TextView h;
  private TextView i;
  private TextView j;
  private Button k;
  private Button l;
  private KlineView m;
  private LinearLayout n;
  private String[] o = { "1分钟", "5分钟", "15分钟", "30分钟", "60分钟" };
  private PopupWindow p;
  private int q;
  private int r;
  private ImageView s;
  private ImageView t;
  private int u;
  private int v;
  private int w;
  private String[][] x;
  private int[] y;
  private int z = -13749961;
  
  public b(Context paramContext)
  {
    super(paramContext);
    this.L = paramContext;
    a(paramContext);
  }
  
  private void a(Context paramContext)
  {
    Object localObject = getResources();
    a(y.b);
    int i1 = ((Resources)localObject).getDimensionPixelSize(2131230829);
    this.u = ((Resources)localObject).getDimensionPixelSize(2131230773);
    this.v = ((Resources)localObject).getDimensionPixelSize(2131230774);
    this.w = ((Resources)localObject).getDimensionPixelSize(2131230830);
    setOrientation(0);
    this.b = new FrameLayout(paramContext);
    localObject = new LinearLayout.LayoutParams(0, -1, 4.0F);
    addView(this.b, (ViewGroup.LayoutParams)localObject);
    this.c = new LinearLayout(paramContext);
    this.c.setOrientation(0);
    localObject = new LinearLayout.LayoutParams(0, -1, 2.2F);
    addView(this.c, (ViewGroup.LayoutParams)localObject);
    this.d = new LinearLayout(paramContext);
    this.d.setOrientation(0);
    localObject = new FrameLayout.LayoutParams(-1, -1);
    this.b.addView(this.d, (ViewGroup.LayoutParams)localObject);
    this.e = new d(this, paramContext);
    this.e.setBackgroundColor(this.z);
    this.e.setVisibility(8);
    localObject = new FrameLayout.LayoutParams(-1, -1);
    this.b.addView(this.e, (ViewGroup.LayoutParams)localObject);
    this.f = new TextView(this.L);
    this.f.setGravity(17);
    this.f.setTextColor(this.A);
    this.f.setTextSize(16.0F);
    this.f.setText("");
    this.f.setVisibility(8);
    localObject = new FrameLayout.LayoutParams(-2, -1);
    ((FrameLayout.LayoutParams)localObject).leftMargin = (this.u * 2);
    this.b.addView(this.f, (ViewGroup.LayoutParams)localObject);
    this.k = new Button(paramContext);
    this.k.setBackgroundResource(this.E);
    localObject = new LinearLayout.LayoutParams(0, -1, 1.0F);
    ((LinearLayout.LayoutParams)localObject).leftMargin = i1;
    this.c.addView(this.k, (ViewGroup.LayoutParams)localObject);
    this.k.setOnTouchListener(this);
    this.l = new Button(paramContext);
    this.l.setBackgroundResource(this.F);
    localObject = new LinearLayout.LayoutParams(0, -1, 1.0F);
    ((LinearLayout.LayoutParams)localObject).leftMargin = (i1 * 2);
    this.c.addView(this.l, (ViewGroup.LayoutParams)localObject);
    this.l.setOnTouchListener(this);
    b(paramContext);
  }
  
  private void a(e parame, boolean paramBoolean)
  {
    if ((this.a == parame) && (!paramBoolean)) {
      return;
    }
    this.a = parame;
    switch (c.a[parame.ordinal()])
    {
    default: 
      return;
    case 1: 
      this.g.setBackgroundColor(this.B);
      this.h.setBackgroundColor(0);
      this.i.setBackgroundColor(0);
      this.j.setBackgroundColor(0);
      this.j.setText("分钟");
      return;
    case 2: 
      this.g.setBackgroundColor(0);
      this.h.setBackgroundColor(this.B);
      this.i.setBackgroundColor(0);
      this.j.setBackgroundColor(0);
      this.j.setText("分钟");
      return;
    case 3: 
      this.g.setBackgroundColor(0);
      this.h.setBackgroundColor(0);
      this.i.setBackgroundColor(this.B);
      this.j.setBackgroundColor(0);
      this.j.setText("分钟");
      return;
    case 4: 
      this.g.setBackgroundColor(0);
      this.h.setBackgroundColor(0);
      this.i.setBackgroundColor(0);
      this.j.setBackgroundColor(this.B);
      this.j.setText("1分钟");
      return;
    case 5: 
      this.g.setBackgroundColor(0);
      this.h.setBackgroundColor(0);
      this.i.setBackgroundColor(0);
      this.j.setBackgroundColor(this.B);
      this.j.setText("5分钟");
      return;
    case 6: 
      this.g.setBackgroundColor(0);
      this.h.setBackgroundColor(0);
      this.i.setBackgroundColor(0);
      this.j.setBackgroundColor(this.B);
      this.j.setText("15分钟");
      return;
    case 7: 
      this.g.setBackgroundColor(0);
      this.h.setBackgroundColor(0);
      this.i.setBackgroundColor(0);
      this.j.setBackgroundColor(this.B);
      this.j.setText("30分钟");
      return;
    }
    this.g.setBackgroundColor(0);
    this.h.setBackgroundColor(0);
    this.i.setBackgroundColor(0);
    this.j.setBackgroundColor(this.B);
    this.j.setText("60分钟");
  }
  
  private void a(y paramy)
  {
    if (paramy == y.b)
    {
      this.z = -789513;
      this.A = -14540254;
      this.B = -2037513;
      this.C = -14540254;
      this.D = getResources().getColor(2131493297);
      this.E = 2130838266;
      this.F = 2130838268;
      this.G = 2130838629;
      this.H = 2130838121;
      this.I = 2130838120;
      this.J = -3618616;
      return;
    }
    this.z = -13749961;
    this.A = -5395027;
    this.B = -13486781;
    this.C = -5395027;
    this.D = getResources().getColor(2131493326);
    this.E = 2130838265;
    this.F = 2130838267;
    this.G = 2130838628;
    this.H = 2130838118;
    this.I = 2130838119;
    this.J = -11907497;
  }
  
  private void b(Context paramContext)
  {
    Object localObject1 = getResources();
    int i2 = ((Resources)localObject1).getDimensionPixelSize(2131230780);
    int i3 = ((Resources)localObject1).getDimensionPixelSize(2131230798);
    this.n = new LinearLayout(paramContext);
    this.n.setOrientation(1);
    this.n.setGravity(17);
    this.s = new ImageView(paramContext);
    this.s.setImageResource(this.H);
    localObject1 = new LinearLayout.LayoutParams(i2, this.v);
    ((LinearLayout.LayoutParams)localObject1).bottomMargin = (-i3);
    this.n.addView(this.s, (ViewGroup.LayoutParams)localObject1);
    localObject1 = new LinearLayout(paramContext);
    ((LinearLayout)localObject1).setOrientation(1);
    ((LinearLayout)localObject1).setGravity(17);
    ((LinearLayout)localObject1).setBackgroundResource(this.G);
    int i1 = 0;
    if (i1 < 5)
    {
      localObject2 = new TextView(paramContext);
      ((TextView)localObject2).setTextColor(this.C);
      ((TextView)localObject2).setTextSize(12.0F);
      ((TextView)localObject2).setGravity(17);
      ((TextView)localObject2).setText(this.o[i1]);
      ((LinearLayout)localObject1).addView((View)localObject2, new LinearLayout.LayoutParams(this.v * 6 + this.v / 2, this.v * 4));
      ((TextView)localObject2).setOnClickListener(this);
      if (i1 == 0) {
        ((TextView)localObject2).setTag(e.a);
      }
      for (;;)
      {
        if (i1 < 4)
        {
          localObject2 = new View(paramContext);
          ((View)localObject2).setBackgroundColor(this.J);
          ((LinearLayout)localObject1).addView((View)localObject2, new LinearLayout.LayoutParams(-1, this.u));
        }
        i1 += 1;
        break;
        if (i1 == 1) {
          ((TextView)localObject2).setTag(e.b);
        } else if (i1 == 2) {
          ((TextView)localObject2).setTag(e.c);
        } else if (i1 == 3) {
          ((TextView)localObject2).setTag(e.d);
        } else if (i1 == 4) {
          ((TextView)localObject2).setTag(e.e);
        }
      }
    }
    Object localObject2 = new LinearLayout.LayoutParams(this.v * 6 + this.v / 2, this.v * 20);
    this.n.addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
    this.t = new ImageView(paramContext);
    this.t.setImageResource(this.I);
    paramContext = new LinearLayout.LayoutParams(i2, this.v);
    paramContext.topMargin = (-i3);
    this.n.addView(this.t, paramContext);
    this.q = (this.v * 21);
    this.r = (this.v * 6 + this.v / 2);
    this.p = new PopupWindow(this.n);
    this.p.setWidth(-2);
    this.p.setHeight(-2);
    this.p.setOutsideTouchable(true);
    this.p.setBackgroundDrawable(new ColorDrawable(0));
    this.p.setFocusable(true);
  }
  
  public void a(String[][] paramArrayOfString, int[] paramArrayOfInt)
  {
    this.x = paramArrayOfString;
    this.y = paramArrayOfInt;
    this.e.invalidate();
  }
  
  public e getKLinePeriod()
  {
    return this.a;
  }
  
  public int getKLinePeriodValue()
  {
    return this.a.a();
  }
  
  public void onClick(View paramView)
  {
    if ((paramView == this.g) || (paramView == this.h) || (paramView == this.i) || (paramView == this.j)) {
      if (paramView == this.j)
      {
        paramView = new int[2];
        this.j.getLocationOnScreen(paramView);
        if (paramView[1] > this.q)
        {
          this.s.setVisibility(8);
          this.t.setVisibility(0);
          this.p.showAsDropDown(this.j, (this.j.getWidth() - this.r) / 2, -this.q - this.j.getHeight());
        }
      }
    }
    do
    {
      do
      {
        do
        {
          return;
          this.s.setVisibility(0);
          this.t.setVisibility(8);
          this.p.showAsDropDown(this.j, (this.j.getWidth() - this.r) / 2, 0);
          return;
          if (paramView == this.g)
          {
            a(e.g, false);
            return;
          }
          if (paramView == this.h)
          {
            a(e.h, false);
            return;
          }
        } while (paramView != this.i);
        a(e.i, false);
        return;
      } while (!(paramView instanceof TextView));
      paramView = paramView.getTag();
    } while (paramView == null);
    a((e)paramView, false);
    this.p.dismiss();
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    LinearLayout.LayoutParams localLayoutParams;
    if (((paramInt2 > 0) && (paramInt2 != paramInt4)) || ((paramInt1 > 0) && (paramInt1 != paramInt3)))
    {
      localLayoutParams = (LinearLayout.LayoutParams)this.b.getLayoutParams();
      if ((localLayoutParams.weight == 4.0F) || (getResources().getConfiguration().orientation != 1)) {
        break label160;
      }
      localLayoutParams.weight = 4.0F;
      this.d.setVisibility(4);
      this.d.setVisibility(0);
      this.f.setVisibility(8);
      ((FrameLayout.LayoutParams)this.e.getLayoutParams()).leftMargin = 0;
      paramInt3 = 1;
    }
    for (;;)
    {
      if (paramInt3 != 0)
      {
        if ((this.p != null) && (this.p.isShowing())) {
          this.p.dismiss();
        }
        measure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824));
      }
      return;
      label160:
      if ((localLayoutParams.weight != 8.0F) && (getResources().getConfiguration().orientation != 1))
      {
        localLayoutParams.weight = 8.0F;
        this.d.setVisibility(4);
        this.f.setVisibility(0);
        ((FrameLayout.LayoutParams)this.e.getLayoutParams()).leftMargin = this.w;
        ((FrameLayout.LayoutParams)this.f.getLayoutParams()).leftMargin = this.w;
        paramInt3 = 1;
      }
      else
      {
        paramInt3 = 0;
      }
    }
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getAction();
    if ((paramView == this.k) || (paramView == this.l))
    {
      if (i1 != 0) {
        break label60;
      }
      if (paramView != this.k) {
        break label42;
      }
      this.m.h();
    }
    for (;;)
    {
      return false;
      label42:
      if (paramView == this.l)
      {
        this.m.g();
        continue;
        label60:
        if ((i1 == 3) || (i1 == 1)) {
          this.m.i();
        }
      }
    }
  }
  
  public void setHolder(KlineView paramKlineView)
  {
    this.m = paramKlineView;
  }
  
  public void setIndexDetailViewVisible(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.e.setVisibility(0);
      this.f.setVisibility(8);
    }
    do
    {
      return;
      this.e.setVisibility(8);
    } while (getResources().getConfiguration().orientation != 2);
    this.f.setVisibility(0);
  }
  
  public void setParamSettingData(String paramString)
  {
    this.f.setText(paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\widge\kline_widget\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */