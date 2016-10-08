package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import com.android.dazhihui.d.b;
import com.android.dazhihui.d.n;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.LargeTradeInfo;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.model.stock.StockVo.Api2206;
import com.android.dazhihui.ui.model.stock.StockVo.Api2917;
import com.android.dazhihui.ui.model.stock.StockVo.Api2930;
import com.android.dazhihui.ui.model.stock.StockVo.Api2931;
import com.android.dazhihui.ui.model.stock.StockVo.Api2955_4416;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.android.dazhihui.ui.screen.stock.uv;
import com.android.dazhihui.ui.screen.stock.vr;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.MinuteTradeCtrl;
import com.android.dazhihui.ui.widget.adv.AdvertView;
import com.android.dazhihui.ui.widget.mh;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MinChartContainer
  extends FrameLayout
  implements View.OnClickListener, View.OnLongClickListener
{
  private int A = -1;
  private MinuteChartChildView B;
  private LinearLayout C;
  private RelativeLayout D;
  private TextView E;
  private TextView F;
  private LinearLayout G;
  private TextView H;
  private TextView I;
  private int J;
  private int K;
  private int L;
  private int M;
  private PopupWindow N;
  private int O;
  private int P;
  private vr Q;
  private ImageView R;
  private ImageView S;
  private TextView T;
  private af U;
  private y V;
  private FrameLayout W;
  public LinearLayout a;
  private RelativeLayout aa;
  private int ab;
  private int ac;
  private List<mh> ad;
  private List<mh> ae;
  private int af;
  private int ag;
  private int ah;
  private int ai;
  private ImageView aj;
  private TextView ak;
  private StockVo al;
  public AdvertView b;
  public LinearLayout c;
  private Context d;
  private ScrollView e;
  private FrameLayout f;
  private View g;
  private MinChartContainerTop h;
  private MinChartTRView i;
  private LinearLayout j;
  private LinearLayout k;
  private FrameLayout l;
  private LinearLayout m;
  private RelativeLayout n;
  private MinChartMoveLineView o;
  private FrameLayout p;
  private StockCostView q;
  private MinChartDetailSwitchView r;
  private MinChartTreadPrice s;
  private MinChartTradeVolumnView t;
  private ImageView u;
  private TextView v;
  private MinChartIndexSwitchView w;
  private StockChartDetaisView x;
  private StockChartContainer y;
  private ae z = ae.a;
  
  public MinChartContainer(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public MinChartContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  private int a(long paramLong, int paramInt)
  {
    return (int)(paramInt * paramLong / 10000L);
  }
  
  private void a(Context paramContext)
  {
    this.d = paramContext;
    k();
  }
  
  private void a(boolean paramBoolean)
  {
    if (this.y != null)
    {
      this.al = this.y.getStockVo();
      this.Q = this.y.getStockType();
    }
    int i2;
    if ((this.Q == vr.e) && (!this.y.getLevel2Limit()))
    {
      i1 = this.ai + getResources().getDimensionPixelSize(2131230829);
      if (this.Q != vr.a)
      {
        i2 = i1;
        if (this.Q != vr.f) {
          break label1145;
        }
      }
      i2 = i1;
      if (this.y != null)
      {
        i2 = i1;
        if (this.al != null)
        {
          i2 = i1;
          if (!TextUtils.isEmpty(this.al.getCode()))
          {
            i2 = i1;
            if (n.n(this.al.getCode()))
            {
              i2 = i1;
              if (!n.m(this.al.getCode())) {
                i2 = this.ai + getResources().getDimensionPixelSize(2131230829);
              }
            }
          }
        }
      }
      if (this.Q != vr.f) {
        break label1145;
      }
    }
    label603:
    label1145:
    for (int i1 = this.ai + getResources().getDimensionPixelSize(2131230829);; i1 = i2)
    {
      Object localObject = (FrameLayout.LayoutParams)this.k.getLayoutParams();
      LinearLayout.LayoutParams localLayoutParams;
      int i3;
      if (getResources().getConfiguration().orientation == 2)
      {
        localLayoutParams = (LinearLayout.LayoutParams)this.l.getLayoutParams();
        i1 = this.P - this.J;
        ((FrameLayout.LayoutParams)localObject).width = this.O;
        ((FrameLayout.LayoutParams)localObject).height = i1;
        localLayoutParams.width = this.O;
        localLayoutParams.height = i1;
        i2 = View.MeasureSpec.makeMeasureSpec(this.O, 1073741824);
        i3 = View.MeasureSpec.makeMeasureSpec(((FrameLayout.LayoutParams)localObject).height, 1073741824);
        this.k.measure(i2, i3);
        this.j.measure(i2, 0);
        if (this.y != null) {
          this.y.n();
        }
        localObject = (FrameLayout.LayoutParams)this.o.getLayoutParams();
        ((FrameLayout.LayoutParams)localObject).width = this.O;
        ((FrameLayout.LayoutParams)localObject).height = i1;
        this.o.measure(i2, i3);
        this.a.setVisibility(8);
        this.B.setVisibility(8);
        this.D.setVisibility(8);
        this.v.setVisibility(8);
        ((LinearLayout.LayoutParams)this.D.getLayoutParams()).topMargin = 0;
        if ((this.al != null) && ((n.i(this.al.getType(), this.al.getMarketType())) || (n.g(this.al.getType()))))
        {
          this.C.setVisibility(0);
          this.E.setText("量:" + this.w.getLastVol());
          this.F.setText("现手:" + this.al.getmXsVol());
        }
        if ((this.Q == vr.b) || ((this.al != null) && (n.i(this.al.getType(), this.al.getMarketType()))))
        {
          if (this.b.getVisibility() == 0)
          {
            this.b.setVisibility(8);
            this.b.setTag(Boolean.valueOf(true));
          }
          this.n.setVisibility(0);
          this.x.setVisibility(8);
          this.w.setVisibility(0);
          this.w.setMode(ak.d);
          this.E.setVisibility(0);
          this.F.setVisibility(0);
          ((LinearLayout.LayoutParams)this.m.getLayoutParams()).weight = 4.0F;
          ((LinearLayout.LayoutParams)this.p.getLayoutParams()).weight = 1.0F;
          ((LinearLayout.LayoutParams)this.n.getLayoutParams()).topMargin = 0;
        }
      }
      for (;;)
      {
        this.a.setVisibility(8);
        return;
        if (this.Q == vr.b)
        {
          i1 = getResources().getDimensionPixelSize(2131230775);
          break;
        }
        if ((this.al != null) && (n.m(this.al.getCode())))
        {
          i1 = this.ai + getResources().getDimensionPixelSize(2131230829) + getResources().getDimensionPixelOffset(2131230820) * 2;
          break;
        }
        i1 = this.ai + getResources().getDimensionPixelSize(2131230829);
        break;
        this.c.setVisibility(8);
        this.b.setVisibility(8);
        break label603;
        localLayoutParams = (LinearLayout.LayoutParams)this.l.getLayoutParams();
        localLayoutParams.width = this.O;
        localLayoutParams.height = (this.P - i1);
        ((FrameLayout.LayoutParams)localObject).width = this.O;
        ((FrameLayout.LayoutParams)localObject).height = (this.P - i1);
        i2 = View.MeasureSpec.makeMeasureSpec(this.O, 1073741824);
        i3 = View.MeasureSpec.makeMeasureSpec(((FrameLayout.LayoutParams)localObject).height, 1073741824);
        this.k.measure(i2, i3);
        this.j.measure(i2, 0);
        localObject = (FrameLayout.LayoutParams)this.o.getLayoutParams();
        ((FrameLayout.LayoutParams)localObject).width = this.O;
        ((FrameLayout.LayoutParams)localObject).height = (this.P - i1);
        this.o.measure(i2, i3);
        localObject = (LinearLayout.LayoutParams)this.m.getLayoutParams();
        ((LinearLayout.LayoutParams)localObject).weight = 2.0F;
        this.m.setLayoutParams((ViewGroup.LayoutParams)localObject);
        localObject = (LinearLayout.LayoutParams)this.p.getLayoutParams();
        ((LinearLayout.LayoutParams)localObject).weight = 1.0F;
        this.k.requestLayout();
        this.p.setLayoutParams((ViewGroup.LayoutParams)localObject);
        this.v.setVisibility(0);
        this.C.setVisibility(8);
        this.D.setVisibility(0);
        if ((this.Q == vr.b) && ((this.b.getVisibility() == 0) || ((this.b.getTag() != null) && (((Boolean)this.b.getTag()).booleanValue()))))
        {
          this.b.setVisibility(0);
          this.c.setVisibility(0);
          this.b.setTag(Boolean.valueOf(false));
        }
        this.B.setVisibility(0);
        if (paramBoolean) {
          a(this.Q);
        }
        this.w.b();
        requestLayout();
      }
    }
  }
  
  private void k()
  {
    Object localObject1 = getResources();
    this.af = ((Resources)localObject1).getDimensionPixelSize(2131230828);
    this.ag = ((Resources)localObject1).getDimensionPixelSize(2131230820);
    this.ah = ((Resources)localObject1).getDimensionPixelOffset(2131230835);
    this.ai = ((Resources)localObject1).getDimensionPixelOffset(2131230839);
    this.J = ((Resources)localObject1).getDimensionPixelSize(2131230829);
    this.L = ((Resources)localObject1).getDimensionPixelSize(2131230824);
    this.M = ((Resources)localObject1).getDimensionPixelSize(2131230820);
    this.K = ((Resources)localObject1).getDimensionPixelOffset(2131230772);
    this.j = new LinearLayout(this.d);
    this.j.setOrientation(1);
    this.f = new FrameLayout(this.d);
    this.f.setVisibility(8);
    this.f.setPadding(0, 0, 0, this.J);
    this.f.setOnClickListener(this);
    localObject1 = new LinearLayout.LayoutParams(-1, this.J * 8);
    this.j.addView(this.f, (ViewGroup.LayoutParams)localObject1);
    this.V = g.a().b();
    this.aa = new RelativeLayout(this.d);
    localObject1 = new FrameLayout.LayoutParams(-1, -1);
    this.f.addView(this.aa, (ViewGroup.LayoutParams)localObject1);
    this.R = new ImageView(this.d);
    this.R.setScaleType(ImageView.ScaleType.CENTER);
    this.R.setImageResource(2130838391);
    this.R.setId(2130839013);
    this.R.setOnClickListener(this);
    this.R.setVisibility(8);
    localObject1 = new RelativeLayout.LayoutParams(this.L, -1);
    ((RelativeLayout.LayoutParams)localObject1).addRule(9, -1);
    ((RelativeLayout.LayoutParams)localObject1).addRule(15);
    this.aa.addView(this.R, (ViewGroup.LayoutParams)localObject1);
    this.S = new ImageView(this.d);
    this.S.setScaleType(ImageView.ScaleType.CENTER);
    this.S.setImageResource(2130838514);
    this.S.setId(2130838514);
    localObject1 = new RelativeLayout.LayoutParams(this.L, -1);
    ((RelativeLayout.LayoutParams)localObject1).addRule(11, -1);
    ((RelativeLayout.LayoutParams)localObject1).addRule(15);
    this.aa.addView(this.S, (ViewGroup.LayoutParams)localObject1);
    this.T = new TextView(this.d);
    this.T.setGravity(19);
    this.T.setSingleLine(true);
    this.T.setTextColor(41472);
    this.T.setTextSize(14.0F);
    localObject1 = new RelativeLayout.LayoutParams(-1, -1);
    ((RelativeLayout.LayoutParams)localObject1).addRule(0, 2130838514);
    ((RelativeLayout.LayoutParams)localObject1).addRule(1, 2130839013);
    ((RelativeLayout.LayoutParams)localObject1).leftMargin = (this.J * 2);
    ((RelativeLayout.LayoutParams)localObject1).rightMargin = (this.J * 2);
    this.aa.addView(this.T, (ViewGroup.LayoutParams)localObject1);
    if (this.V == y.a) {
      this.aa.setBackgroundColor(-14539477);
    }
    for (;;)
    {
      this.a = new LinearLayout(this.d);
      this.a.setOrientation(0);
      localObject1 = new LinearLayout.LayoutParams(-1, this.L);
      ((LinearLayout.LayoutParams)localObject1).bottomMargin = this.J;
      this.j.addView(this.a, (ViewGroup.LayoutParams)localObject1);
      this.h = new MinChartContainerTop(this.d);
      this.h.setOnClickListener(this);
      localObject1 = new LinearLayout.LayoutParams(0, -1, 2.0F);
      this.a.addView(this.h, (ViewGroup.LayoutParams)localObject1);
      this.h.setHolder(this);
      this.W = new FrameLayout(this.d);
      localObject1 = new LinearLayout.LayoutParams(0, -1, 1.0F);
      this.a.addView(this.W, (ViewGroup.LayoutParams)localObject1);
      this.a.setVisibility(8);
      this.i = new MinChartTRView(this.d);
      localObject1 = new FrameLayout.LayoutParams(-1, -1);
      this.W.addView(this.i, (ViewGroup.LayoutParams)localObject1);
      this.i.setHolder(this);
      this.l = new FrameLayout(this.d);
      localObject1 = new LinearLayout.LayoutParams(-1, -2);
      this.j.addView(this.l, (ViewGroup.LayoutParams)localObject1);
      this.k = new LinearLayout(this.d);
      this.k.setOrientation(0);
      localObject1 = new FrameLayout.LayoutParams(-1, -2);
      this.l.addView(this.k, (ViewGroup.LayoutParams)localObject1);
      this.m = new LinearLayout(this.d);
      this.m.setOrientation(1);
      localObject1 = new LinearLayout.LayoutParams(0, -1, 2.0F);
      this.k.addView(this.m, (ViewGroup.LayoutParams)localObject1);
      this.p = new FrameLayout(this.d);
      this.r = new MinChartDetailSwitchView(this.d);
      localObject1 = new LinearLayout.LayoutParams(0, -1, 1.0F);
      ((LinearLayout.LayoutParams)localObject1).leftMargin = this.K;
      Object localObject2 = new FrameLayout.LayoutParams(-1, -1);
      this.p.addView(this.r, (ViewGroup.LayoutParams)localObject2);
      this.r.setHolder(this);
      this.q = new StockCostView(this.d);
      this.p.addView(this.q, (ViewGroup.LayoutParams)localObject2);
      this.q.setOnClickListener(this);
      this.k.addView(this.p, (ViewGroup.LayoutParams)localObject1);
      localObject1 = new FrameLayout(this.d);
      localObject2 = new LinearLayout.LayoutParams(-1, 0, 2.0F);
      this.m.addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
      this.s = new MinChartTreadPrice(this.d);
      this.s.setOnClickListener(this);
      localObject2 = new FrameLayout.LayoutParams(-1, -1);
      ((FrameLayout)localObject1).addView(this.s, (ViewGroup.LayoutParams)localObject2);
      this.s.setHolder(this);
      this.s.setOnLongClickListener(this);
      this.G = new LinearLayout(this.d);
      this.G.setOrientation(0);
      this.G.setVisibility(8);
      localObject2 = new FrameLayout.LayoutParams(-2, -2);
      ((FrameLayout.LayoutParams)localObject2).gravity = 81;
      ((FrameLayout)localObject1).addView(this.G, (ViewGroup.LayoutParams)localObject2);
      int i1 = (int)getResources().getDimension(2131230871);
      localObject1 = new ImageView(this.d);
      ((ImageView)localObject1).setBackgroundDrawable(getResources().getDrawable(2130837526));
      localObject2 = new LinearLayout.LayoutParams(i1, i1);
      ((LinearLayout.LayoutParams)localObject2).gravity = 16;
      this.G.addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
      this.H = new TextView(this.d);
      this.H.setText("点击切换到K线");
      this.H.setTextColor(-2849024);
      this.H.setTextSize(i1 / getResources().getDisplayMetrics().density);
      localObject1 = new LinearLayout.LayoutParams(-2, -2);
      ((LinearLayout.LayoutParams)localObject1).gravity = 16;
      this.G.addView(this.H, (ViewGroup.LayoutParams)localObject1);
      this.D = new RelativeLayout(this.d);
      localObject1 = new LinearLayout.LayoutParams(-1, 0, 1.0F);
      this.m.addView(this.D, (ViewGroup.LayoutParams)localObject1);
      this.t = new MinChartTradeVolumnView(this.d);
      localObject1 = new RelativeLayout.LayoutParams(-1, -1);
      this.D.addView(this.t, (ViewGroup.LayoutParams)localObject1);
      this.t.setHolder(this);
      this.t.setOnClickListener(this);
      this.u = new ImageView(this.d);
      this.u.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
      localObject1 = new RelativeLayout.LayoutParams(-2, -2);
      ((RelativeLayout.LayoutParams)localObject1).addRule(11, -1);
      ((RelativeLayout.LayoutParams)localObject1).addRule(15);
      ((RelativeLayout.LayoutParams)localObject1).rightMargin = 1;
      this.D.addView(this.u, (ViewGroup.LayoutParams)localObject1);
      this.u.setOnClickListener(this);
      this.ak = new TextView(this.d);
      this.ak.setId(this.ak.hashCode());
      this.ak.setBackgroundColor(-13684426);
      this.ak.setPadding(this.J, this.J, this.J, this.J);
      this.ak.setText("横屏");
      this.ak.setTextSize(10.0F);
      this.ak.setVisibility(8);
      this.ak.setOnClickListener(this);
      localObject1 = new RelativeLayout.LayoutParams(-2, -2);
      ((RelativeLayout.LayoutParams)localObject1).addRule(12, -1);
      ((RelativeLayout.LayoutParams)localObject1).addRule(9, -1);
      ((RelativeLayout.LayoutParams)localObject1).addRule(15);
      this.D.addView(this.ak, (ViewGroup.LayoutParams)localObject1);
      this.C = new LinearLayout(this.d);
      this.C.setOrientation(0);
      this.C.setGravity(16);
      this.I = new TextView(this.d);
      this.I.setBackgroundDrawable(getResources().getDrawable(2130838258));
      this.I.setText("成交量");
      this.I.setPadding(this.J, this.J, this.J, this.J);
      this.I.setGravity(16);
      this.I.setTextColor(getResources().getColor(2131493677));
      localObject1 = getResources().getDrawable(2130838701);
      ((Drawable)localObject1).setBounds(0, 0, ((Drawable)localObject1).getMinimumWidth(), ((Drawable)localObject1).getMinimumHeight());
      this.I.setCompoundDrawables(null, null, (Drawable)localObject1, null);
      localObject1 = new LinearLayout.LayoutParams(-2, -2);
      this.I.setOnClickListener(this);
      this.C.addView(this.I, (ViewGroup.LayoutParams)localObject1);
      this.E = new TextView(this.d);
      this.E.setText("量");
      this.E.setGravity(17);
      this.E.setTextColor(getResources().getColor(2131493322));
      localObject1 = new LinearLayout.LayoutParams(-2, -2);
      ((LinearLayout.LayoutParams)localObject1).leftMargin = (this.J * 2);
      this.C.addView(this.E, (ViewGroup.LayoutParams)localObject1);
      this.F = new TextView(this.d);
      this.F.setText("现手");
      this.F.setTextColor(getResources().getColor(2131493322));
      this.F.setGravity(17);
      localObject1 = new LinearLayout.LayoutParams(-2, -2);
      ((LinearLayout.LayoutParams)localObject1).leftMargin = (this.J * 2);
      this.C.addView(this.F, (ViewGroup.LayoutParams)localObject1);
      localObject1 = new LinearLayout.LayoutParams(-1, getResources().getDimensionPixelSize(2131230820));
      ((LinearLayout.LayoutParams)localObject1).leftMargin = this.M;
      this.m.addView(this.C, (ViewGroup.LayoutParams)localObject1);
      this.C.setVisibility(8);
      this.n = new RelativeLayout(this.d);
      localObject1 = new LinearLayout.LayoutParams(-1, 0, 1.0F);
      this.m.addView(this.n, (ViewGroup.LayoutParams)localObject1);
      this.w = new MinChartIndexSwitchView(this.d);
      localObject1 = new RelativeLayout.LayoutParams(-1, -1);
      this.n.addView(this.w, (ViewGroup.LayoutParams)localObject1);
      this.w.setHolder(this);
      this.x = new StockChartDetaisView(this.d);
      localObject1 = new RelativeLayout.LayoutParams(-1, -1);
      this.x.setVisibility(8);
      this.n.addView(this.x, (ViewGroup.LayoutParams)localObject1);
      this.v = new TextView(this.d);
      this.v.setBackgroundColor(-13684426);
      this.v.setPadding(this.J, this.J, this.J, this.J);
      this.v.setTextSize(10.0F);
      this.v.setText("横屏");
      localObject1 = new RelativeLayout.LayoutParams(-2, -2);
      ((RelativeLayout.LayoutParams)localObject1).addRule(9, -1);
      ((RelativeLayout.LayoutParams)localObject1).addRule(12, -1);
      ((RelativeLayout.LayoutParams)localObject1).rightMargin = 1;
      this.n.addView(this.v, (ViewGroup.LayoutParams)localObject1);
      this.v.setOnClickListener(this);
      this.o = new MinChartMoveLineView(this.d);
      this.o.setVisibility(4);
      localObject1 = new FrameLayout.LayoutParams(-1, -1);
      this.l.addView(this.o, (ViewGroup.LayoutParams)localObject1);
      this.o.setHolder(this);
      this.c = new LinearLayout(this.d);
      this.c.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
      this.b = new AdvertView(this.d);
      this.b.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
      this.b.setAdvCode(146);
      this.b.setOnAdvertStateChangeListener(new aa(this));
      localObject1 = new LinearLayout.LayoutParams(-1, -2);
      this.c.addView(this.b, (ViewGroup.LayoutParams)localObject1);
      this.j.addView(this.c, (ViewGroup.LayoutParams)localObject1);
      this.B = new MinuteChartChildView(this.d);
      localObject1 = new LinearLayout.LayoutParams(-1, -2);
      this.j.addView(this.B, (ViewGroup.LayoutParams)localObject1);
      this.B.setHolder(this);
      localObject1 = new LinearLayout.LayoutParams(-1, -2);
      this.e = new ScrollView(this.d);
      this.e.setVerticalScrollBarEnabled(false);
      this.e.addView(this.j, (ViewGroup.LayoutParams)localObject1);
      this.e.setVerticalFadingEdgeEnabled(false);
      this.e.setHorizontalFadingEdgeEnabled(false);
      this.e.setOverScrollMode(2);
      localObject1 = new FrameLayout.LayoutParams(-1, -1);
      addView(this.e, (ViewGroup.LayoutParams)localObject1);
      a(this.V);
      return;
      this.aa.setBackgroundColor(-1);
      this.T.setTextColor(-14540254);
    }
  }
  
  private void l()
  {
    com.android.dazhihui.c.a.d locald = com.android.dazhihui.c.a.d.a();
    int i1 = locald.b("minClickToKline", 0);
    locald.g();
    if (i1 < 3)
    {
      this.G.setVisibility(0);
      return;
    }
    this.G.setVisibility(8);
  }
  
  private void m()
  {
    com.android.dazhihui.c.a.d locald = com.android.dazhihui.c.a.d.a();
    int i2 = locald.b("minClickToKline", 0);
    int i1 = i2;
    if (i2 < 3)
    {
      i1 = i2 + 1;
      locald.a("minClickToKline", i1);
    }
    locald.g();
    if (i1 < 3)
    {
      this.G.setVisibility(0);
      return;
    }
    this.G.setVisibility(8);
  }
  
  private void n()
  {
    RelativeLayout localRelativeLayout;
    if (this.V == y.b) {
      localRelativeLayout = (RelativeLayout)LayoutInflater.from(this.d).inflate(2130903444, null);
    }
    for (ArrayAdapter localArrayAdapter = new ArrayAdapter(this.d, 2130903383, 2131560226, getResources().getStringArray(2131361865));; localArrayAdapter = new ArrayAdapter(this.d, 2130903382, 2131560226, getResources().getStringArray(2131361865)))
    {
      localRelativeLayout.setGravity(19);
      GridView localGridView = (GridView)localRelativeLayout.findViewById(2131560018);
      localGridView.setAdapter(localArrayAdapter);
      localGridView.setNumColumns(4);
      this.aj = ((ImageView)localRelativeLayout.findViewById(2131560019));
      this.aj.setVisibility(0);
      localRelativeLayout.findViewById(2131560017).setVisibility(8);
      this.N = new PopupWindow(localRelativeLayout, -2, (int)(getResources().getDimension(2131230814) * 2.0F));
      this.N.setBackgroundDrawable(new ColorDrawable(0));
      this.N.setFocusable(true);
      this.N.setOutsideTouchable(true);
      localGridView.setOnItemClickListener(new ac(this));
      return;
      localRelativeLayout = (RelativeLayout)LayoutInflater.from(this.d).inflate(2130903443, null);
    }
  }
  
  private void setStockType(vr paramvr)
  {
    if ((this.al == null) && (this.y != null)) {
      this.al = this.y.getStockVo();
    }
    this.Q = paramvr;
    if (this.Q == vr.d) {
      return;
    }
    l();
    this.c.setVisibility(8);
    this.ak.setVisibility(8);
    this.q.setVisibility(8);
    FrameLayout.LayoutParams localLayoutParams;
    int i1;
    int i2;
    if (getResources().getConfiguration().orientation == 1)
    {
      localLayoutParams = (FrameLayout.LayoutParams)this.k.getLayoutParams();
      i1 = getMeasuredHeight();
      i2 = getMeasuredWidth();
    }
    int i3;
    int i4;
    switch (ad.a[paramvr.ordinal()])
    {
    default: 
    case 1: 
    case 6: 
    case 7: 
      for (;;)
      {
        this.a.setVisibility(8);
        this.w.b();
        d();
        post(new ab(this));
        a(false);
        return;
        this.n.setVisibility(8);
        this.x.setVisibility(8);
        this.x.setVisibility(8);
        this.ak.setVisibility(0);
        this.B.setVisibility(0);
        this.u.setVisibility(8);
        this.p.setVisibility(8);
        this.w.setVisibility(8);
        if ((this.y != null) && (this.al != null) && (n.k(this.al.getCode())))
        {
          this.n.setVisibility(0);
          this.w.setVisibility(0);
          this.ak.setVisibility(8);
          this.w.b();
        }
        i1 = View.MeasureSpec.makeMeasureSpec(this.k.getWidth(), 1073741824);
        i2 = View.MeasureSpec.makeMeasureSpec(this.k.getHeight(), 1073741824);
        this.m.measure(i1, i2);
        this.m.layout(0, 0, this.k.getWidth(), this.k.getHeight());
        continue;
        this.u.setVisibility(8);
        this.x.setVisibility(8);
        this.n.setVisibility(0);
        this.w.setVisibility(8);
        this.p.setVisibility(0);
        this.r.setSwitchType(aj.c);
        this.x.setHolder(this.y);
        this.x.setShowMode(StockChartDetaisView.b);
        continue;
        this.x.setShowMode(StockChartDetaisView.c);
        this.u.setVisibility(0);
        this.x.setVisibility(8);
        this.x.setHolder(this.y);
        this.n.setVisibility(0);
        this.w.setVisibility(8);
        this.p.setVisibility(0);
        this.r.setSwitchType(aj.b);
      }
    case 2: 
      this.x.setVisibility(8);
      this.w.setVisibility(0);
      this.n.setVisibility(0);
      this.B.setVisibility(0);
      this.B.getmListTable().setVisibility(8);
      this.u.setVisibility(0);
      this.p.setVisibility(0);
      if (this.V == y.a) {
        this.u.setImageResource(2130838410);
      }
      for (;;)
      {
        this.r.setSwitchType(aj.a);
        paramvr = (LinearLayout.LayoutParams)this.p.getLayoutParams();
        localLayoutParams.width = i2;
        localLayoutParams.height = i1;
        i2 = i2 - this.p.getWidth() - paramvr.leftMargin;
        i3 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        i4 = View.MeasureSpec.makeMeasureSpec(i1, 1073741824);
        this.m.measure(i3, i4);
        this.m.layout(0, 0, i2, i1);
        break;
        this.u.setImageResource(2130839010);
      }
    case 3: 
    case 4: 
      if (com.android.dazhihui.d.a().d()) {
        this.q.setVisibility(0);
      }
      this.c.setVisibility(0);
      this.x.setVisibility(8);
      this.w.setVisibility(0);
      this.n.setVisibility(0);
      this.B.setVisibility(0);
      this.u.setVisibility(0);
      this.p.setVisibility(0);
      if (this.V == y.a) {
        this.u.setImageResource(2130838410);
      }
      for (;;)
      {
        this.r.setSwitchType(aj.a);
        paramvr = (LinearLayout.LayoutParams)this.p.getLayoutParams();
        i1 = this.k.getWidth() - this.p.getWidth() - paramvr.leftMargin;
        i2 = View.MeasureSpec.makeMeasureSpec(i1, 1073741824);
        i3 = View.MeasureSpec.makeMeasureSpec(this.k.getHeight(), 1073741824);
        this.m.measure(i2, i3);
        this.m.layout(0, 0, i1, this.k.getHeight());
        break;
        this.u.setImageResource(2130839010);
      }
    }
    this.q.setVisibility(8);
    this.a.setVisibility(8);
    this.x.setVisibility(8);
    this.p.setVisibility(8);
    this.u.setVisibility(8);
    if ((this.al != null) && ((this.al.getType() == 5) || (n.e(this.al.getType()))))
    {
      this.p.setVisibility(0);
      this.u.setVisibility(0);
      if (this.al.getType() == 5) {
        this.r.setSwitchType(aj.a);
      }
    }
    for (;;)
    {
      this.a.setVisibility(8);
      this.n.setVisibility(8);
      this.w.setVisibility(8);
      this.B.setVisibility(8);
      this.ak.setVisibility(0);
      localLayoutParams.width = i2;
      localLayoutParams.height = i1;
      i3 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
      i4 = View.MeasureSpec.makeMeasureSpec(i1, 1073741824);
      this.m.measure(i3, i4);
      this.m.layout(0, 0, i2, i1);
      this.j.measure(i3, 0);
      ((FrameLayout.LayoutParams)this.o.getLayoutParams()).height = i1;
      this.o.measure(i3, i4);
      break;
      this.r.setSwitchType(aj.c);
      continue;
      this.r.setSwitchType(aj.c);
    }
  }
  
  public void a()
  {
    this.i.invalidate();
    this.s.invalidate();
    this.t.invalidate();
    this.w.g();
    this.w.invalidate();
    this.r.invalidate();
    this.r.d();
    this.B.getmListTable().a();
    this.B.getmMintueTradeCtrl().a();
    this.U = null;
    this.f.setVisibility(8);
  }
  
  public void a(int paramInt)
  {
    if ((this.y != null) && (this.y.getCurrentStockVo() != null))
    {
      if (paramInt != 0) {
        break label106;
      }
      this.B.getmMinChartListView().a(MinChartListView.a);
      if (this.ae == null) {
        this.ae = new ArrayList();
      }
      this.ae.clear();
      this.ae.addAll(this.y.getCurrentStockVo().getPlate2955Data());
      this.B.getmMinChartListView().a(this.ae);
    }
    for (;;)
    {
      this.B.getmMinChartListView().postInvalidate();
      return;
      label106:
      if (paramInt == 1)
      {
        this.B.getmMinChartListView().a(MinChartListView.b);
        if (this.ae == null) {
          this.ae = new ArrayList();
        }
        this.ae.clear();
        this.ae.addAll(this.y.getCurrentStockVo().getPlate2955Data());
        this.B.getmMinChartListView().a(this.ae);
      }
      else if (paramInt == 2)
      {
        this.B.getmMinChartListView().a(MinChartListView.b);
        if (this.ad == null) {
          this.ad = new ArrayList();
        }
        this.ad.clear();
        this.ad.addAll(this.y.getCurrentStockVo().getHsIndex2955Data());
        this.B.getmMinChartListView().b(this.ad);
      }
    }
  }
  
  public void a(vr paramvr)
  {
    switch (ad.a[paramvr.ordinal()])
    {
    default: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
      for (;;)
      {
        d();
        return;
        this.B.setVisibility(0);
        this.u.setVisibility(8);
        this.p.setVisibility(8);
        this.n.setVisibility(8);
        this.w.setVisibility(8);
        this.ak.setVisibility(0);
        if ((this.y != null) && (this.al != null) && (n.k(this.al.getCode())))
        {
          this.n.setVisibility(0);
          this.w.setVisibility(0);
          this.ak.setVisibility(8);
          this.w.b();
          continue;
          this.n.setVisibility(0);
          this.x.setVisibility(8);
          this.w.setVisibility(0);
          this.B.setVisibility(0);
          this.B.getmListTable().setVisibility(8);
          this.u.setVisibility(0);
          this.p.setVisibility(0);
          continue;
          this.n.setVisibility(0);
          this.x.setVisibility(8);
          this.w.setVisibility(0);
          this.B.setVisibility(0);
          this.u.setVisibility(0);
          this.p.setVisibility(0);
          if (this.V == y.a) {
            this.u.setImageResource(2130838410);
          } else {
            this.u.setImageResource(2130839010);
          }
        }
      }
    }
    this.p.setVisibility(8);
    if ((this.al != null) && ((this.al.getType() == 5) || (n.e(this.al.getType()))))
    {
      this.p.setVisibility(0);
      if (this.al.getType() == 5) {
        this.r.setSwitchType(aj.a);
      }
    }
    for (;;)
    {
      this.ak.setVisibility(0);
      this.a.setVisibility(8);
      this.w.setVisibility(8);
      this.n.setVisibility(8);
      this.x.setVisibility(8);
      this.B.setVisibility(8);
      break;
      this.r.setSwitchType(aj.c);
      continue;
      this.r.setSwitchType(aj.c);
    }
  }
  
  public void a(y paramy)
  {
    this.V = paramy;
    if (paramy == y.a)
    {
      this.I.setBackgroundDrawable(getResources().getDrawable(2130838258));
      this.I.setTextColor(-1);
      this.ac = -12961221;
      this.ab = getResources().getColor(2131493099);
      this.W.setBackgroundResource(2130838418);
      this.h.setBackgroundResource(2130838403);
      this.u.setImageResource(2130838410);
      this.H.setTextColor(-2849024);
      this.E.setTextColor(getResources().getColor(2131493322));
      this.F.setTextColor(getResources().getColor(2131493322));
      this.v.setBackgroundColor(-1889114522);
      this.v.setTextColor(-15657958);
      this.ak.setBackgroundColor(-1889114522);
      this.ak.setTextColor(-15657958);
      this.aa.setBackgroundColor(-14539477);
      this.T.setTextColor(41472);
    }
    for (;;)
    {
      this.x.a(paramy);
      this.o.a(paramy);
      this.r.a(paramy);
      this.s.a(paramy);
      this.t.a(paramy);
      this.w.a(paramy);
      this.h.a(paramy);
      this.B.a(paramy);
      this.i.a(paramy);
      this.q.a(paramy);
      n();
      return;
      this.I.setBackgroundDrawable(new ColorDrawable(-3155216));
      this.I.setTextColor(-14540254);
      this.ab = -14540254;
      this.ac = -2697514;
      this.aa.setBackgroundColor(-1);
      this.T.setTextColor(-14540254);
      this.W.setBackgroundResource(2130838419);
      this.h.setBackgroundResource(2130838419);
      this.u.setImageResource(2130839010);
      this.H.setTextColor(getResources().getColor(2131493332));
      this.E.setTextColor(-14540254);
      this.F.setTextColor(-14540254);
      this.v.setBackgroundColor(-1882601015);
      this.v.setTextColor(-7292952);
      this.ak.setBackgroundColor(-1882601015);
      this.ak.setTextColor(-7292952);
    }
  }
  
  public void a(af paramaf, boolean paramBoolean)
  {
    this.U = paramaf;
    if ((paramBoolean) && (paramaf != null))
    {
      this.f.setVisibility(0);
      this.T.setText(paramaf.b + "  " + paramaf.c);
      return;
    }
    this.f.setVisibility(8);
  }
  
  public void b()
  {
    if ((this.q.getVisibility() == 8) && (com.android.dazhihui.d.a().d()))
    {
      this.q.setVisibility(0);
      this.r.setVisibility(8);
    }
  }
  
  public void c()
  {
    setStockType(az.a(this.y.getCurrentStockVo()));
  }
  
  public void d()
  {
    if (this.B.getmMintueTradeCtrl() == null) {}
    label284:
    label391:
    label405:
    label815:
    for (;;)
    {
      return;
      this.B.getmMinDealsView().a(this);
      this.B.getmMinDealsView().setVisibility(8);
      this.B.getmMinChartListView().a(this);
      this.B.getmMintueTradeCtrl().setVisibility(8);
      this.B.getmListTable().setVisibility(8);
      this.B.getmZdMountView().setVisibility(8);
      this.B.getmFlowView().setVisibility(8);
      this.B.getmMinChartListView().a();
      this.B.getmMinChartListView().setVisibility(8);
      if (this.al == null)
      {
        if (this.y != null) {
          this.al = this.y.getStockVo();
        }
        if (this.al == null) {}
      }
      else
      {
        if (this.y.getLevel2Limit())
        {
          ((LinearLayout.LayoutParams)this.B.getLayoutParams()).topMargin = this.J;
          this.B.getmMintueTradeCtrl().setVisibility(0);
          ((LinearLayout.LayoutParams)this.B.getmListTable().getLayoutParams()).topMargin = this.J;
          if ((this.Q != vr.a) || (!n.m(this.al.getCode()))) {
            break label405;
          }
          ((LinearLayout.LayoutParams)this.B.getLayoutParams()).topMargin = this.J;
          this.B.getmZdMountView().setVisibility(0);
          if (!this.al.getCode().contains("399006")) {
            break label391;
          }
          this.B.getmFlowView().setVisibility(8);
          this.B.getmFlowTv().setText("--");
          this.B.getmMinChartListView().setVisibility(0);
          this.B.getmMinChartListView().a(MinChartListView.b);
          this.B.getmListTable().setVisibility(8);
        }
        for (;;)
        {
          if (this.Q == vr.c) {
            break label815;
          }
          this.h.setVisibility(0);
          this.h.postInvalidate();
          return;
          this.B.getmMintueTradeCtrl().setVisibility(8);
          ((LinearLayout.LayoutParams)this.B.getmListTable().getLayoutParams()).topMargin = 0;
          break;
          this.B.getmFlowView().setVisibility(0);
          break label284;
          if (n.j(this.al.getCode()))
          {
            this.B.getmMinChartListView().setVisibility(0);
            this.B.getmMinChartListView().a(MinChartListView.a);
            this.B.getmZdMountView().setVisibility(0);
            this.B.getmFlowView().setVisibility(8);
            this.B.getmListTable().setVisibility(8);
            ((LinearLayout.LayoutParams)this.B.getLayoutParams()).topMargin = this.J;
          }
          else if (n.i(this.al.getType(), n.o(this.al.getCode())))
          {
            this.B.getmZdMountView().setVisibility(8);
            this.B.getmFlowView().setVisibility(8);
            this.B.getmMinChartListView().setVisibility(8);
            this.B.getmListTable().setVisibility(0);
            ((LinearLayout.LayoutParams)this.B.getLayoutParams()).topMargin = this.J;
            g();
          }
          else if (n.g(this.al.getType()))
          {
            ((LinearLayout.LayoutParams)this.B.getLayoutParams()).topMargin = 0;
            this.B.getmZdMountView().setVisibility(8);
            this.B.getmFlowView().setVisibility(8);
            this.B.getmListTable().setVisibility(8);
            this.B.getmMinChartListView().setVisibility(8);
          }
          else if ((n.e(this.al.getType())) && (this.al.getMarketType() != 10))
          {
            ((LinearLayout.LayoutParams)this.B.getLayoutParams()).topMargin = this.J;
            this.B.setVisibility(0);
            this.B.getmMinDealsView().setVisibility(0);
            this.B.getmZdMountView().setVisibility(8);
            this.B.getmFlowView().setVisibility(8);
            this.B.getmListTable().setVisibility(8);
            this.B.getmMinChartListView().setVisibility(8);
          }
          else
          {
            ((LinearLayout.LayoutParams)this.B.getLayoutParams()).topMargin = 0;
            this.B.setVisibility(8);
            this.r.a(aj.c);
          }
        }
      }
    }
  }
  
  public void e()
  {
    if (this.y.getCurrentStockVo() != null)
    {
      this.B.b.a(this.y.getCurrentStockVo().getApi2917Data().selldata, this.y.getCurrentStockVo().getApi2917Data().sellList, this.y.getCurrentStockVo().getApi2917Data().buydata, this.y.getCurrentStockVo().getApi2917Data().buyList);
      this.B.b.postInvalidate();
    }
  }
  
  public void f() {}
  
  public void g()
  {
    if ((this.y == null) || (this.y.getCurrentStockVo() == null)) {
      return;
    }
    Object localObject2 = this.y.getCurrentStockVo().getApi2976();
    int[] arrayOfInt = new int[16];
    arrayOfInt[0] = ((StockVo.Api2931)localObject2).buyMiddleRate;
    arrayOfInt[1] = ((StockVo.Api2931)localObject2).buyBigRate;
    arrayOfInt[2] = ((StockVo.Api2931)localObject2).buyBBigRate;
    arrayOfInt[3] = ((StockVo.Api2931)localObject2).sellMiddleRate;
    arrayOfInt[4] = ((StockVo.Api2931)localObject2).sellBigRate;
    arrayOfInt[5] = ((StockVo.Api2931)localObject2).sellBBigRate;
    arrayOfInt[6] = ((StockVo.Api2931)localObject2).OrgBuyNum;
    arrayOfInt[7] = ((StockVo.Api2931)localObject2).OrgSellNum;
    arrayOfInt[8] = ((StockVo.Api2931)localObject2).buyNum4Large;
    arrayOfInt[9] = ((StockVo.Api2931)localObject2).sellNum4Large;
    arrayOfInt[10] = (10000 - arrayOfInt[0] - arrayOfInt[1] - arrayOfInt[2]);
    arrayOfInt[11] = (10000 - arrayOfInt[3] - arrayOfInt[4] - arrayOfInt[5]);
    arrayOfInt[12] = ((StockVo.Api2931)localObject2).buyNum4Middle;
    arrayOfInt[13] = ((StockVo.Api2931)localObject2).sellNum4Middle;
    arrayOfInt[14] = ((StockVo.Api2931)localObject2).buyNum4Small;
    arrayOfInt[15] = ((StockVo.Api2931)localObject2).sellNum4Small;
    int i1 = 0;
    int i2 = 0;
    if (arrayOfInt != null)
    {
      i1 = arrayOfInt[6] + arrayOfInt[8] + arrayOfInt[10] + arrayOfInt[12];
      i2 = arrayOfInt[7] + arrayOfInt[9] + arrayOfInt[11] + arrayOfInt[13];
    }
    Object localObject1 = b.a(0 / i2, 1);
    String str = b.a(0 / i1, 1);
    if (i2 == 0) {
      localObject1 = "--";
    }
    if (i1 == 0) {
      str = "--";
    }
    int i3 = ((StockVo.Api2931)localObject2).position;
    Vector localVector = ((StockVo.Api2931)localObject2).items;
    i3 = this.y.getCurrentStockVo().getmVol();
    float[] arrayOfFloat = new float[4];
    localObject2 = new float[4];
    arrayOfFloat[0] = b.e(arrayOfInt[2]);
    arrayOfFloat[1] = b.e(arrayOfInt[1]);
    arrayOfFloat[2] = b.e(arrayOfInt[0]);
    arrayOfFloat[3] = (100.0F - arrayOfFloat[0] - arrayOfFloat[1] - arrayOfFloat[2]);
    localObject2[0] = b.e(arrayOfInt[5]);
    localObject2[1] = b.e(arrayOfInt[4]);
    localObject2[2] = b.e(arrayOfInt[3]);
    localObject2[3] = (100.0F - localObject2[0] - localObject2[1] - localObject2[2]);
    int i4 = a(i3, arrayOfInt[2]);
    int i5 = a(i3, arrayOfInt[1]);
    int i6 = a(i3, arrayOfInt[5]);
    int i7 = a(i3, arrayOfInt[4]);
    int i8 = arrayOfInt[6];
    int i9 = arrayOfInt[7];
    localObject1 = new LargeTradeInfo("-万", i1, i2, str, (String)localObject1, new int[] { i4, i5 }, arrayOfFloat, new int[] { i6, i7 }, (float[])localObject2, i8, i9, i3, localVector);
    long l1 = b.b(arrayOfInt[2] + arrayOfInt[1] - arrayOfInt[5] - arrayOfInt[4] + 10000L, 10000L) * this.y.getCurrentStockVo().getmTotalAmount() / 10000L;
    ((LargeTradeInfo)localObject1).setInFlow(l1 + "万");
    ((LargeTradeInfo)localObject1).setSellAll((float[])localObject2);
    this.B.getmListTable().a((LargeTradeInfo)localObject1, true);
    localObject1 = this.y.getCurrentStockVo().getApi2930();
    i1 = ((StockVo.Api2930)localObject1).totalSell;
    i2 = ((StockVo.Api2930)localObject1).sellAvgPrice;
    i3 = ((StockVo.Api2930)localObject1).totalBuy;
    i4 = ((StockVo.Api2930)localObject1).buyAvgPrice;
    i5 = ((StockVo.Api2930)localObject1).ddx;
    i6 = ((StockVo.Api2930)localObject1).orderNumCha;
    i7 = ((StockVo.Api2930)localObject1).buyOrder4BBig;
    i8 = ((StockVo.Api2930)localObject1).sellOrder4BBig;
    i9 = ((StockVo.Api2930)localObject1).buyOrder4Big;
    int i10 = ((StockVo.Api2930)localObject1).sellOrder4Big;
    int i11 = ((StockVo.Api2930)localObject1).buyOrder4Middle;
    int i12 = ((StockVo.Api2930)localObject1).sellOrder4Middle;
    int i13 = ((StockVo.Api2930)localObject1).buyOrder4Small;
    int i14 = ((StockVo.Api2930)localObject1).sellOrder4Small;
    this.B.getmListTable().setBigTradeData(new int[] { i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14 });
  }
  
  public StockVo getDataModel()
  {
    return this.y.getDataModel();
  }
  
  public MinChartDetailSwitchView getDetailSwitchView()
  {
    return this.r;
  }
  
  public ae getDisplayModel()
  {
    return this.z;
  }
  
  public StockChartContainer getHolder()
  {
    return this.y;
  }
  
  public MinChartIndexSwitchView getIndexSwitchView()
  {
    return this.w;
  }
  
  public MinChartTRView getMinChartTopRightView()
  {
    return this.i;
  }
  
  public MinChartContainerTop getMinChartTopView()
  {
    return this.h;
  }
  
  public int[] getMinChartTreadCurrentPrice()
  {
    return this.s.getCurrentPrices();
  }
  
  public int getMinChartTreadPriceMaxValue()
  {
    return this.s.getMaxPrice();
  }
  
  public int getMinChartTreadPriceMinValue()
  {
    return this.s.getMinPrice();
  }
  
  public int getScreenIndex()
  {
    return this.A;
  }
  
  public StockCostView getStockCostView()
  {
    return this.q;
  }
  
  public MinChartTradeVolumnView getTradeVolumnView()
  {
    return this.t;
  }
  
  public MinChartTreadPrice getTreadPriceView()
  {
    return this.s;
  }
  
  public int getTreadPriceViewWidth()
  {
    return this.s.getWidth();
  }
  
  public MinuteChartChildView getmBottomView()
  {
    return this.B;
  }
  
  public View getmHkCruitView()
  {
    return this.g;
  }
  
  public View getmIndexLayoutView()
  {
    return this.n;
  }
  
  public ScrollView getmScoolView()
  {
    return this.e;
  }
  
  public void h()
  {
    if ((this.y != null) && (this.y.getCurrentStockVo() != null))
    {
      this.B.getmUpTv().setText(this.y.getCurrentStockVo().getApi2206Data().riseNum + "");
      this.B.getmUpTv().setTextColor(-65536);
      this.B.getmFairTv().setText(this.y.getCurrentStockVo().getApi2206Data().equalNum + "");
      this.B.getmDownTv().setText(this.y.getCurrentStockVo().getApi2206Data().downNum + "");
    }
  }
  
  public void i()
  {
    if ((this.y != null) && (this.y.getCurrentStockVo() != null))
    {
      long l1 = this.y.getCurrentStockVo().getApi2955_4416Data().zjlrDay - this.y.getCurrentStockVo().getApi2955_4416Data().zjlcDay;
      if (l1 != 0L)
      {
        String str = n.d(l1);
        int i1 = b.g(this.y.getCurrentStockVo().getApi2955_4416Data().zjlrDay - this.y.getCurrentStockVo().getApi2955_4416Data().zjlcDay);
        this.B.getmFlowTv().setText(str);
        this.B.getmFlowTv().setTextColor(i1);
      }
    }
  }
  
  public void j()
  {
    this.r.postInvalidate();
    if ((getResources().getConfiguration().orientation == 2) && (this.w.getMode() == ak.d))
    {
      this.E.setText("量:" + this.w.getLastVol());
      this.F.setText("现手:" + this.y.getCurrentStockVo().getmXsVol());
    }
    this.x.postInvalidate();
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.u) {
      if (this.p.getVisibility() == 0)
      {
        this.p.setVisibility(8);
        if (this.V == y.a)
        {
          this.u.setImageResource(2130838409);
          this.x.setShowMode(StockChartDetaisView.b);
          this.x.postInvalidate();
        }
      }
    }
    label316:
    do
    {
      do
      {
        Object localObject;
        do
        {
          return;
          this.u.setImageResource(2130839009);
          break;
          this.p.setVisibility(0);
          if (this.V == y.a) {
            this.u.setImageResource(2130838410);
          }
          for (;;)
          {
            this.x.setShowMode(StockChartDetaisView.c);
            this.x.postInvalidate();
            return;
            this.u.setImageResource(2130839010);
          }
          if (paramView == this.I)
          {
            if (this.N == null) {
              n();
            }
            paramView = new int[2];
            this.I.getLocationOnScreen(paramView);
            int i1 = this.N.getHeight();
            localObject = (RelativeLayout.LayoutParams)this.aj.getLayoutParams();
            ((RelativeLayout.LayoutParams)localObject).addRule(14, 0);
            ((RelativeLayout.LayoutParams)localObject).addRule(9);
            ((RelativeLayout.LayoutParams)localObject).leftMargin = ((this.I.getWidth() - getResources().getDimensionPixelSize(2131230795)) / 2);
            this.N.showAtLocation(this.I, 0, paramView[0], paramView[1] - i1);
            return;
          }
          if (paramView != this.R) {
            break label316;
          }
          this.f.setVisibility(8);
        } while ((this.y == null) || (this.y.getCurrentStockVo() == null) || (this.y.getCurrentStockVo().getCode() == null));
        g.a().a(this.y.getCurrentStockVo().getCode(), this.U.a);
        return;
        if (paramView == this.f)
        {
          paramView = new Intent();
          localObject = new Bundle();
          ((Bundle)localObject).putString("nexturl", this.U.d);
          paramView.putExtras((Bundle)localObject);
          paramView.setClass(getRootView().getContext(), BrowserActivity.class);
          getRootView().getContext().startActivity(paramView);
          return;
        }
        if ((paramView == this.v) || (paramView == this.ak))
        {
          if (this.y != null) {
            this.y.a.scrollTo(0, 0);
          }
          this.y.getHolder().getActivity().setRequestedOrientation(0);
          return;
        }
        if (paramView == this.q)
        {
          this.q.setVisibility(8);
          this.r.setVisibility(0);
          return;
        }
      } while (this.y == null);
      if (((paramView == this.s) || (paramView == this.t)) && (getResources().getConfiguration().orientation == 1))
      {
        m();
        this.y.a(av.b);
        return;
      }
    } while (paramView != this.h);
    this.y.onClick(paramView);
  }
  
  public boolean onLongClick(View paramView)
  {
    if (((paramView == this.s) || (paramView == this.t) || (paramView == this.w)) && (this.y.getCurrentStockVo() != null) && (this.y.getCurrentStockVo().getMinData() != null))
    {
      setMoveViewVisibility(0);
      ((MinStockChartBaseView)paramView).h();
    }
    return true;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (((paramInt2 > 0) && (paramInt2 != paramInt4)) || ((paramInt1 > 0) && (paramInt1 != paramInt3)))
    {
      this.O = paramInt1;
      this.P = paramInt2;
      if ((this.N != null) && (this.N.isShowing())) {
        this.N.dismiss();
      }
      this.Q = this.y.getStockType();
      a(true);
    }
  }
  
  public void setHolder(StockChartContainer paramStockChartContainer)
  {
    this.y = paramStockChartContainer;
    if (this.q != null) {
      this.q.a(paramStockChartContainer, av.a);
    }
  }
  
  public void setMoveViewVisibility(int paramInt)
  {
    if (paramInt == 0)
    {
      this.o.setVisibility(0);
      this.z = ae.b;
      this.o.getParent().requestDisallowInterceptTouchEvent(true);
      if (this.V == y.a) {
        this.h.setBackgroundColor(getResources().getColor(2131493291));
      }
      for (;;)
      {
        this.h.postInvalidate();
        this.y.setMinChartDetailViewVisible(true);
        return;
        this.h.setBackgroundColor(-789513);
      }
    }
    this.o.setVisibility(8);
    this.z = ae.a;
    this.o.getParent().requestDisallowInterceptTouchEvent(false);
    if (g.a().b() == y.a)
    {
      this.h.setBackgroundColor(getResources().getColor(2131493180));
      this.h.setBackgroundResource(2130838403);
    }
    for (;;)
    {
      this.y.setMinChartDetailViewVisible(false);
      this.h.postInvalidate();
      this.y.getHolder().r().setVisibility(8);
      this.t.setCurrentPosition(-1);
      this.w.setCurrentPosition(-1);
      return;
      this.h.setBackgroundColor(getResources().getColor(2131493660));
      this.h.setBackgroundResource(2130838419);
    }
  }
  
  public void setScreenIndex(int paramInt)
  {
    int i2 = getDataModel().getMinLength();
    int i1 = paramInt;
    if (paramInt >= i2) {
      i1 = i2 - 1;
    }
    this.A = i1;
    if (this.o.getVisibility() == 0)
    {
      this.o.invalidate();
      if (getResources().getConfiguration().orientation != 2) {
        break label113;
      }
      this.y.setMinChartDetailViewVisible(false);
      this.y.getHolder().r().setVisibility(0);
      this.y.getHolder().r().postInvalidate();
    }
    for (;;)
    {
      this.t.setCurrentPosition(this.A);
      this.w.setCurrentPosition(this.A);
      return;
      label113:
      this.y.setMinChartDetailViewVisible(true);
      this.y.c();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\MinChartContainer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */