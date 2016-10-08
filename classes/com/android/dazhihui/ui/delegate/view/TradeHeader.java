package com.android.dazhihui.ui.delegate.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.delegate.screen.ggt.CustomTextView;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhMainHeader;
import com.android.dazhihui.ui.widget.TradeSwitchButton;
import com.android.dazhihui.ui.widget.nd;
import java.util.ArrayList;

public class TradeHeader
  extends RelativeLayout
  implements View.OnClickListener
{
  private float A;
  private float B;
  private y C;
  private PopupWindow a;
  private View b;
  private View c;
  private View d;
  private View e;
  private CustomTextView f;
  private CustomTextView g;
  private TextView h;
  private TextView i;
  private TextView j;
  private TextView k;
  private ImageButton l;
  private RelativeLayout m;
  private ListView n;
  private TextView o;
  private ImageView p;
  private p q;
  private r r;
  private n s;
  private o t;
  private m u;
  private TextView v;
  private TradeSwitchButton w;
  private DzhMainHeader x;
  private ArrayList<t> y;
  private ArrayList<String> z;
  
  public TradeHeader(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    LayoutInflater.from(paramContext).inflate(2130903508, this);
    this.A = (paramContext.getResources().getDimension(2131230898) / g.a().o());
    this.B = (paramContext.getResources().getDimension(2131230895) / g.a().o());
    this.b = findViewById(2131560907);
    this.e = findViewById(2131560906);
    this.v = ((TextView)findViewById(2131560916));
    this.w = ((TradeSwitchButton)findViewById(2131560917));
    this.x = ((DzhMainHeader)findViewById(2131560918));
    this.k = ((TextView)findViewById(2131560915));
    this.c = findViewById(2131560910);
    this.f = ((CustomTextView)findViewById(2131560908));
    this.g = ((CustomTextView)findViewById(2131560909));
    this.h = ((TextView)findViewById(2131560912));
    this.i = ((TextView)findViewById(2131560913));
    this.j = ((TextView)findViewById(2131560914));
    this.l = ((ImageButton)findViewById(2131560911));
    this.b.setOnClickListener(new h(this));
    this.e.setOnClickListener(new i(this));
    this.h.setOnClickListener(this);
    this.i.setOnClickListener(this);
    this.j.setOnClickListener(this);
    this.l.setOnClickListener(this);
    setCurrentSelectedItem(0);
    this.a = new PopupWindow(paramContext);
    this.a.setWidth(-2);
    this.a.setHeight(-2);
    this.a.setFocusable(true);
    this.a.setBackgroundDrawable(new ColorDrawable(0));
    this.m = ((RelativeLayout)inflate(getContext(), 2130903537, null));
    this.n = ((ListView)this.m.findViewById(2131561005));
    this.d = this.m.findViewById(2131561006);
    this.o = ((TextView)this.m.findViewById(2131561008));
    this.p = ((ImageView)this.m.findViewById(2131561007));
    this.d.setOnClickListener(new j(this));
    this.n.setOnItemClickListener(new k(this));
    this.q = new p(this, getContext());
    this.r = new r(this, getContext());
    this.a.setContentView(this.m);
    setShowTitleItems(false);
  }
  
  private void a()
  {
    int i2 = 5;
    int i1;
    if (com.android.dazhihui.ui.delegate.b.o.r())
    {
      this.o.setText("添加账户");
      this.p.setVisibility(0);
      this.n.setAdapter(this.q);
      i1 = this.q.getCount();
      if (i1 <= 5) {
        break label154;
      }
      i1 = i2;
    }
    label154:
    for (;;)
    {
      this.n.getLayoutParams();
      this.n.getLayoutParams().height = (i1 * (int)getResources().getDimension(2131230951));
      if (this.a.isShowing())
      {
        this.a.dismiss();
        return;
        this.o.setText("券商设置");
        this.p.setVisibility(8);
        this.n.setAdapter(this.r);
        i1 = this.r.getCount();
        break;
      }
      this.a.showAsDropDown(this.b);
      return;
    }
  }
  
  private void setShowTitleItems(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.v.setVisibility(8);
      this.w.setVisibility(8);
      this.x.setVisibility(8);
      this.c.setVisibility(0);
      this.h.setVisibility(0);
      this.i.setVisibility(0);
      this.j.setVisibility(0);
      return;
    }
    if (!com.android.dazhihui.ui.delegate.b.o.r())
    {
      this.v.setVisibility(8);
      this.w.setVisibility(8);
      this.x.setVisibility(0);
    }
    for (;;)
    {
      this.c.setVisibility(8);
      return;
      this.v.setVisibility(0);
      this.w.setVisibility(8);
      this.x.setVisibility(8);
    }
  }
  
  public void a(y paramy)
  {
    if (paramy != null) {
      switch (l.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            setBackgroundColor(getResources().getColor(2131493536));
          } while ((this.m == null) || (this.n == null));
          this.m.setBackgroundResource(2131493536);
          this.n.setBackgroundResource(2131493536);
          this.n.setDivider(new ColorDrawable(-13750218));
          this.n.setDividerHeight(2);
          this.d.setBackgroundColor(getResources().getColor(2131493536));
          this.o.setTextColor(-13274383);
          this.p.setBackgroundResource(2130838896);
        } while (this.c.getVisibility() != 0);
        this.h.setBackgroundResource(2130839081);
        this.i.setBackgroundResource(2130839081);
        this.j.setBackgroundResource(2130839081);
        return;
        setBackgroundColor(getResources().getColor(2131493599));
      } while ((this.m == null) || (this.n == null));
      this.m.setBackgroundResource(2130838788);
      this.n.setBackgroundColor(getResources().getColor(2131493599));
      this.n.setDivider(new ColorDrawable(-13750218));
      this.n.setDividerHeight(2);
      this.d.setBackgroundColor(getResources().getColor(2131493599));
      this.o.setTextColor(getResources().getColor(2131493677));
      this.p.setBackgroundResource(2130838897);
    } while (this.c.getVisibility() != 0);
    this.h.setBackgroundResource(2130839082);
    this.i.setBackgroundResource(2130839082);
    this.j.setBackgroundResource(2130839082);
  }
  
  public TextView getRightText()
  {
    return this.k;
  }
  
  public DzhMainHeader getTradeLoginChildPapeIndicator()
  {
    return this.x;
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    }
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            setCurrentSelectedItem(1);
          } while (this.s == null);
          this.s.a(1);
          return;
          setCurrentSelectedItem(2);
        } while (this.s == null);
        this.s.a(2);
        return;
        setCurrentSelectedItem(3);
      } while (this.s == null);
      this.s.a(3);
      return;
      setCurrentSelectedItem(4);
    } while (this.s == null);
    this.s.a(4);
  }
  
  public void setBackClickListener(m paramm)
  {
    this.u = paramm;
  }
  
  public void setChildClickedListener(n paramn)
  {
    this.s = paramn;
  }
  
  public void setCurrentSelectedItem(int paramInt)
  {
    this.C = g.a().b();
    switch (paramInt)
    {
    default: 
      this.h.setSelected(false);
      this.i.setSelected(false);
      this.j.setSelected(false);
      this.h.setTextSize(this.A);
      this.i.setTextSize(this.A);
      this.j.setTextSize(this.A);
      this.l.setSelected(false);
    case 1: 
    case 2: 
    case 3: 
      do
      {
        do
        {
          do
          {
            return;
            this.h.setSelected(true);
            this.i.setSelected(false);
            this.j.setSelected(false);
            this.h.setTextSize(this.B);
            this.i.setTextSize(this.A);
            this.j.setTextSize(this.A);
            this.l.setSelected(false);
            if (this.C == y.a)
            {
              this.h.setBackgroundResource(2130839081);
              return;
            }
          } while (this.C != y.b);
          this.h.setBackgroundResource(2130839082);
          return;
          this.h.setSelected(false);
          this.i.setSelected(true);
          this.j.setSelected(false);
          this.h.setTextSize(this.A);
          this.i.setTextSize(this.B);
          this.j.setTextSize(this.A);
          this.l.setSelected(false);
          if (this.C == y.a)
          {
            this.i.setBackgroundResource(2130839081);
            return;
          }
        } while (this.C != y.b);
        this.i.setBackgroundResource(2130839082);
        return;
        this.h.setSelected(false);
        this.i.setSelected(false);
        this.j.setSelected(true);
        this.h.setTextSize(this.A);
        this.i.setTextSize(this.A);
        this.j.setTextSize(this.B);
        this.l.setSelected(false);
        if (this.C == y.a)
        {
          this.j.setBackgroundResource(2130839081);
          return;
        }
      } while (this.C != y.b);
      this.j.setBackgroundResource(2130839082);
      return;
    case 4: 
      this.h.setSelected(false);
      this.i.setSelected(false);
      this.j.setSelected(false);
      this.h.setTextSize(this.A);
      this.i.setTextSize(this.A);
      this.j.setTextSize(this.A);
      this.l.setSelected(true);
      return;
    }
    this.h.setSelected(false);
    this.i.setSelected(false);
    this.j.setSelected(false);
    this.l.setSelected(false);
  }
  
  public void setOnSwitchButtonListener(nd paramnd)
  {
    this.w.setButtonSwitchListener(paramnd);
  }
  
  public void setPopItemClickedListener(o paramo)
  {
    this.t = paramo;
  }
  
  public void setSelectButton(int paramInt)
  {
    this.w.setSelectButton(paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\view\TradeHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */