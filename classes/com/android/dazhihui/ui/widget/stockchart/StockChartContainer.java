package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ad;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.android.dazhihui.a.f;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.delegate.screen.hk.o;
import com.android.dazhihui.ui.model.stock.MinuteMenuVo;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.model.stock.adapter.StockChartVideoAdapter;
import com.android.dazhihui.ui.screen.e;
import com.android.dazhihui.ui.screen.i;
import com.android.dazhihui.ui.screen.stock.StockChartScreen;
import com.android.dazhihui.ui.screen.stock.bs;
import com.android.dazhihui.ui.screen.stock.cn;
import com.android.dazhihui.ui.screen.stock.dh;
import com.android.dazhihui.ui.screen.stock.lp;
import com.android.dazhihui.ui.screen.stock.of;
import com.android.dazhihui.ui.screen.stock.oh;
import com.android.dazhihui.ui.screen.stock.uv;
import com.android.dazhihui.ui.screen.stock.vr;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.EmojiInputView;
import com.android.dazhihui.ui.widget.StockChartViewflow;
import com.android.dazhihui.ui.widget.TabTextView;
import com.android.dazhihui.ui.widget.adv.AdvertView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class StockChartContainer
  extends FrameLayout
  implements View.OnClickListener
{
  public static final String[] d = { "板块联动", "技术面", "数据面" };
  public static final String[] e = { "龙虎榜", "指数贡献" };
  private TabTextView A;
  private TabTextView B;
  private TabTextView C;
  private View D;
  private View E;
  private View F;
  private View G;
  private View H;
  private View I;
  private View J;
  private View K;
  private View L;
  private View M;
  private View N;
  private View O;
  private av P = av.f;
  private m Q = m.a();
  private StockVo R;
  private e S;
  private Bundle T;
  private PopupWindow U;
  private List<MinuteMenuVo> V;
  private int W;
  public StockChartFrameLayout a;
  private int aa = -1;
  private int ab = -4932146;
  private int ac = -13486781;
  private int ad = 0;
  private int ae = -13750218;
  private int af = 2130838418;
  private int ag = -12961221;
  private int ah = -13157550;
  private y ai = null;
  private StockChartPriceView aj;
  private StockChartDetaisView ak;
  private Vector<View> al = new Vector();
  private Vector<View> am = new Vector();
  private WindowManager.LayoutParams an;
  private int ao;
  private int ap;
  private boolean aq = false;
  private View ar;
  private View as;
  private View at;
  private View au;
  private int av = 0;
  private boolean aw = false;
  private StockVo ax;
  public MinChartContainer b;
  public KChartContainer c;
  public LinearLayout f;
  public StockChartViewflow g;
  public GridView h;
  public StockChartVideoAdapter i;
  public FrameLayout j;
  public TextView k;
  public TextView l;
  public TextView m;
  public View n;
  private Context o;
  private uv p;
  private vr q = vr.d;
  private LinearLayout r;
  private FrameLayout s;
  private View t;
  private KChartDetailView u;
  private MinChartDetailView v;
  private View w;
  private TabTextView x;
  private TabTextView y;
  private TabTextView z;
  
  public StockChartContainer(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public StockChartContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public StockChartContainer(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private void a(int paramInt, boolean paramBoolean)
  {
    if (this.R == null) {
      return;
    }
    if (this.T != null)
    {
      this.T.putString("name", this.R.getName());
      this.T.putInt("type", this.R.getType());
    }
    e locale = this.S;
    android.support.v4.app.at localat = getHolder().getActivity().getSupportFragmentManager().a();
    if (this.p != null) {
      this.p.h(e(paramInt));
    }
    if (locale != null)
    {
      locale.beforeHidden();
      localat.b(locale);
    }
    locale = (e)getHolder().getActivity().getSupportFragmentManager().a(String.valueOf(paramInt));
    if ((locale == null) || (locale.getFragmentId() != this.s.getId()))
    {
      locale = d(paramInt);
      if ((locale instanceof bs))
      {
        ((bs)locale).c(true);
        ((bs)locale).a(this);
        ((bs)locale).a(getHolder().x());
      }
      locale.setBundle(this.T);
      localat.a(this.s.getId(), locale, String.valueOf(paramInt));
    }
    for (;;)
    {
      this.S = locale;
      localat.b();
      return;
      locale.setBundle(this.T);
      localat.c(locale);
      locale.show();
    }
  }
  
  private void a(Context paramContext)
  {
    this.o = paramContext;
    this.w = LayoutInflater.from(this.o).inflate(2130903448, null);
    this.an = new WindowManager.LayoutParams();
    Resources localResources = getResources();
    this.W = localResources.getDimensionPixelSize(2131230829);
    int i1 = localResources.getDimensionPixelSize(2131230773);
    setPadding(0, 0, 0, 0);
    Object localObject1 = new FrameLayout.LayoutParams(-1, -1);
    this.a = new StockChartFrameLayout(paramContext);
    addView(this.a, (ViewGroup.LayoutParams)localObject1);
    localObject1 = new RelativeLayout(paramContext);
    this.j = new FrameLayout(paramContext);
    Object localObject3 = new RelativeLayout.LayoutParams(-1, localResources.getDimensionPixelSize(2131230827));
    ((RelativeLayout.LayoutParams)localObject3).addRule(10);
    this.f = new LinearLayout(paramContext);
    this.f.setOrientation(0);
    this.f.setId(2131560614);
    Object localObject2 = new RelativeLayout.LayoutParams(-1, localResources.getDimensionPixelSize(2131230839));
    ((RelativeLayout.LayoutParams)localObject3).addRule(10);
    this.aj = new StockChartPriceView(paramContext);
    this.ak = new StockChartDetaisView(paramContext);
    localObject3 = new LinearLayout.LayoutParams(0, -1, 15.0F);
    this.f.addView(this.aj, (ViewGroup.LayoutParams)localObject3);
    localObject3 = new LinearLayout.LayoutParams(0, -1, 26.0F);
    this.f.addView(this.ak, (ViewGroup.LayoutParams)localObject3);
    this.g = new StockChartViewflow(paramContext);
    this.h = this.g.getmHotViewFlow();
    this.i = this.g.getAdapter();
    this.g.setVisibility(8);
    this.g.setHolder(this);
    this.j.addView(this.f, -1, -1);
    this.j.addView(this.g, -1, -1);
    this.a.addView(this.j, (ViewGroup.LayoutParams)localObject2);
    this.a.addView((View)localObject1, -1, -1);
    this.O = new View(paramContext);
    this.O.setId(this.O.hashCode());
    this.O.setBackgroundColor(-12961221);
    localObject2 = new RelativeLayout.LayoutParams(-1, localResources.getDimensionPixelSize(2131230772));
    ((RelativeLayout.LayoutParams)localObject2).addRule(10);
    ((RelativeLayout)localObject1).addView(this.O, (ViewGroup.LayoutParams)localObject2);
    this.N = new View(paramContext);
    this.N.setId(this.N.hashCode());
    this.N.setBackgroundColor(0);
    localObject2 = new RelativeLayout.LayoutParams(-1, this.W);
    ((RelativeLayout.LayoutParams)localObject2).addRule(3, this.O.getId());
    ((RelativeLayout)localObject1).addView(this.N, (ViewGroup.LayoutParams)localObject2);
    this.t = new View(paramContext);
    this.t.setId(this.t.hashCode());
    this.t.setBackgroundColor(-12961221);
    localObject2 = new RelativeLayout.LayoutParams(-1, localResources.getDimensionPixelSize(2131230772));
    ((RelativeLayout.LayoutParams)localObject2).addRule(3, this.N.getId());
    ((RelativeLayout)localObject1).addView(this.t, (ViewGroup.LayoutParams)localObject2);
    localObject2 = new RelativeLayout.LayoutParams(-1, localResources.getDimensionPixelSize(2131230820));
    this.r = new LinearLayout(paramContext);
    this.r.setId(this.r.hashCode());
    this.r.setPadding(0, 0, 0, 0);
    this.r.setOrientation(0);
    ((RelativeLayout.LayoutParams)localObject2).topMargin = 0;
    ((RelativeLayout.LayoutParams)localObject2).addRule(3, this.t.getId());
    ((RelativeLayout)localObject1).addView(this.r, (ViewGroup.LayoutParams)localObject2);
    localObject2 = new LinearLayout.LayoutParams(0, -1, 1.0F);
    this.x = new TabTextView(paramContext, null);
    this.x.getPaint().setFlags(0);
    this.x.getPaint().setAntiAlias(true);
    this.x.setGravity(17);
    this.x.setTextSize(16.0F);
    this.x.setTextColor(this.aa);
    this.x.setText("分时");
    this.x.setBackgroundColor(this.ac);
    this.x.setOnClickListener(this);
    this.r.addView(this.x, (ViewGroup.LayoutParams)localObject2);
    this.al.clear();
    this.am.clear();
    this.D = new View(paramContext);
    this.D.setBackgroundColor(this.ag);
    this.al.add(this.D);
    this.I = new View(paramContext);
    this.I.setBackgroundColor(this.ah);
    this.am.add(this.I);
    localObject2 = new LinearLayout.LayoutParams(i1 / 2, -1);
    this.r.addView(this.D, (ViewGroup.LayoutParams)localObject2);
    localObject2 = new LinearLayout.LayoutParams(i1 / 2, -1);
    this.r.addView(this.I, (ViewGroup.LayoutParams)localObject2);
    localObject2 = new LinearLayout.LayoutParams(0, -1, 1.0F);
    this.y = new TabTextView(paramContext, null);
    this.y.setGravity(17);
    this.y.setTextSize(16.0F);
    this.y.setTextColor(this.ab);
    this.y.setText("K线");
    this.y.setOnClickListener(this);
    this.r.addView(this.y, (ViewGroup.LayoutParams)localObject2);
    this.E = new View(paramContext);
    this.E.setBackgroundColor(this.ag);
    this.al.add(this.E);
    this.J = new View(paramContext);
    this.J.setBackgroundColor(this.ah);
    this.am.add(this.J);
    localObject2 = new LinearLayout.LayoutParams(i1 / 2, -1);
    this.r.addView(this.E, (ViewGroup.LayoutParams)localObject2);
    localObject2 = new LinearLayout.LayoutParams(i1 / 2, -1);
    this.r.addView(this.J, (ViewGroup.LayoutParams)localObject2);
    localObject2 = new LinearLayout.LayoutParams(0, -1, 1.0F);
    this.z = new TabTextView(paramContext, null);
    this.z.setGravity(17);
    this.z.setTextSize(16.0F);
    this.z.setTextColor(this.ab);
    this.z.setText("资讯");
    this.z.setOnClickListener(this);
    this.r.addView(this.z, (ViewGroup.LayoutParams)localObject2);
    this.F = new View(paramContext);
    this.F.setBackgroundColor(this.ag);
    this.al.add(this.F);
    localObject2 = new LinearLayout.LayoutParams(i1 / 2, -1);
    this.r.addView(this.F, (ViewGroup.LayoutParams)localObject2);
    this.K = new View(paramContext);
    this.K.setBackgroundColor(this.ah);
    this.am.add(this.K);
    localObject2 = new LinearLayout.LayoutParams(i1 / 2, -1);
    this.r.addView(this.K, (ViewGroup.LayoutParams)localObject2);
    localObject2 = new LinearLayout.LayoutParams(0, -1, 1.0F);
    this.A = new TabTextView(paramContext, null);
    this.A.setGravity(17);
    this.A.setTextSize(16.0F);
    this.A.setTextColor(this.ab);
    this.A.setText("股吧");
    this.A.setOnClickListener(this);
    this.r.addView(this.A, (ViewGroup.LayoutParams)localObject2);
    this.G = new View(paramContext);
    this.G.setBackgroundColor(this.ag);
    this.al.add(this.G);
    localObject2 = new LinearLayout.LayoutParams(i1 / 2, -1);
    this.r.addView(this.G, (ViewGroup.LayoutParams)localObject2);
    this.L = new View(paramContext);
    this.L.setBackgroundColor(this.ah);
    this.am.add(this.L);
    localObject2 = new LinearLayout.LayoutParams(i1 / 2, -1);
    this.r.addView(this.L, (ViewGroup.LayoutParams)localObject2);
    localObject2 = new LinearLayout.LayoutParams(0, -1, 1.0F);
    this.B = new TabTextView(paramContext, null);
    this.B.setGravity(17);
    this.B.setTextSize(16.0F);
    this.B.setTextColor(this.ab);
    this.B.setText("F10");
    this.B.setOnClickListener(this);
    this.r.addView(this.B, (ViewGroup.LayoutParams)localObject2);
    this.H = new View(paramContext);
    this.H.setBackgroundColor(this.ag);
    this.al.add(this.H);
    localObject2 = new LinearLayout.LayoutParams(i1 / 2, -1);
    this.r.addView(this.H, (ViewGroup.LayoutParams)localObject2);
    this.M = new View(paramContext);
    this.M.setBackgroundColor(this.ah);
    this.am.add(this.M);
    localObject2 = new LinearLayout.LayoutParams(i1 / 2, -1);
    this.r.addView(this.M, (ViewGroup.LayoutParams)localObject2);
    localObject2 = new LinearLayout.LayoutParams(0, -1, 1.0F);
    this.C = new TabTextView(paramContext, null);
    this.C.setGravity(17);
    this.C.setTextSize(16.0F);
    this.C.setTextColor(this.ab);
    this.C.setText("更多");
    this.C.setOnClickListener(this);
    this.r.addView(this.C, (ViewGroup.LayoutParams)localObject2);
    this.n = LayoutInflater.from(paramContext).inflate(2130903439, null);
    this.k = ((TextView)this.n.findViewById(2131558598));
    this.l = ((TextView)this.n.findViewById(2131560123));
    this.m = ((TextView)this.n.findViewById(2131558599));
    this.ar = this.n.findViewById(2131560120);
    this.as = this.n.findViewById(2131560121);
    this.at = this.n.findViewById(2131560122);
    this.au = this.n.findViewById(2131560124);
    this.n.setId(this.n.hashCode());
    this.k.setOnClickListener(this);
    this.l.setOnClickListener(this);
    this.m.setOnClickListener(this);
    this.b = new MinChartContainer(paramContext);
    this.b.setId(this.b.hashCode());
    this.b.setHolder(this);
    localObject2 = new RelativeLayout.LayoutParams(-1, -1);
    ((RelativeLayout.LayoutParams)localObject2).addRule(3, this.r.getId());
    ((RelativeLayout)localObject1).addView(this.b, (ViewGroup.LayoutParams)localObject2);
    this.c = new KChartContainer(paramContext);
    this.c.setHolder(this);
    this.c.setVisibility(4);
    localObject2 = new RelativeLayout.LayoutParams(-1, -1);
    ((RelativeLayout.LayoutParams)localObject2).addRule(3, this.r.getId());
    ((RelativeLayout)localObject1).addView(this.c, (ViewGroup.LayoutParams)localObject2);
    localObject2 = new RelativeLayout.LayoutParams(-1, -2);
    ((RelativeLayout.LayoutParams)localObject2).addRule(3, this.r.getId());
    ((RelativeLayout)localObject1).addView(this.n, (ViewGroup.LayoutParams)localObject2);
    this.s = new FrameLayout(paramContext);
    this.s.setId(this.s.hashCode());
    this.s.setVisibility(0);
    localObject2 = new RelativeLayout.LayoutParams(-1, -1);
    ((RelativeLayout.LayoutParams)localObject2).addRule(3, this.r.getId());
    ((RelativeLayout.LayoutParams)localObject2).topMargin = getResources().getDimensionPixelOffset(2131230828);
    ((RelativeLayout)localObject1).addView(this.s, (ViewGroup.LayoutParams)localObject2);
    this.u = new KChartDetailView(paramContext);
    this.u.setBackgroundColor(this.ae);
    this.u.setVisibility(8);
    localObject2 = new RelativeLayout.LayoutParams(-1, localResources.getDimensionPixelSize(2131230820));
    ((RelativeLayout.LayoutParams)localObject2).addRule(3, this.f.getId());
    ((RelativeLayout.LayoutParams)localObject2).topMargin = this.W;
    ((RelativeLayout)localObject1).addView(this.u, (ViewGroup.LayoutParams)localObject2);
    this.u.setHolder(this);
    this.v = new MinChartDetailView(paramContext);
    this.v.setBackgroundColor(this.ae);
    this.v.setVisibility(8);
    paramContext = new RelativeLayout.LayoutParams(-1, localResources.getDimensionPixelSize(2131230820));
    paramContext.addRule(10);
    ((RelativeLayout)localObject1).addView(this.v, paramContext);
    this.v.setHolder(this);
    this.aj.setHolder(this);
    this.ak.setHolder(this);
    this.ak.setOnClickListener(this);
    a(this.q, true);
    a(g.a().b());
  }
  
  private void a(View paramView)
  {
    if (this.R == null) {}
    do
    {
      return;
      if (paramView == this.x)
      {
        a(av.a);
        return;
      }
      if (paramView == this.y)
      {
        a(av.b);
        return;
      }
      if (paramView == this.z)
      {
        a(av.c);
        return;
      }
      if (paramView == this.A)
      {
        a(av.d);
        return;
      }
      if (paramView == this.B)
      {
        a(av.e);
        return;
      }
    } while (paramView != this.C);
    a(av.f);
  }
  
  private void b(y paramy)
  {
    this.ai = paramy;
    if (paramy == y.b)
    {
      this.aa = -12686651;
      this.ab = -14540254;
      this.ad = -657158;
      this.ac = 16777215;
      this.ag = -2697514;
      this.ah = 0;
      this.af = 2130838421;
      this.ae = -789513;
      this.ao = -2697514;
      this.ap = -1118225;
      return;
    }
    this.aa = -1;
    this.ab = -4932146;
    this.ad = -14276556;
    this.ac = -14803418;
    this.ag = -15657958;
    this.ah = -13157550;
    this.ae = -13750218;
    this.af = 2130838420;
    this.ao = -15657958;
    this.ap = 0;
  }
  
  private void b(av paramav)
  {
    int i3 = 0;
    int i2 = 0;
    if (paramav != av.f) {
      this.P = paramav;
    }
    switch (as.a[paramav.ordinal()])
    {
    }
    for (;;)
    {
      if ((this.R != null) && (paramav != av.f)) {
        this.p.q();
      }
      do
      {
        return;
        this.n.setVisibility(8);
        ((RelativeLayout.LayoutParams)this.s.getLayoutParams()).topMargin = 0;
        this.x.setBackgroundDrawable(new ColorDrawable(this.ac));
        this.x.setTextColor(this.aa);
        this.y.setBackgroundDrawable(getResources().getDrawable(this.af));
        this.z.setBackgroundDrawable(getResources().getDrawable(this.af));
        this.A.setBackgroundDrawable(getResources().getDrawable(this.af));
        this.B.setBackgroundDrawable(getResources().getDrawable(this.af));
        this.C.setBackgroundDrawable(getResources().getDrawable(this.af));
        this.y.setTextColor(this.ab);
        this.z.setTextColor(this.ab);
        this.A.setTextColor(this.ab);
        this.B.setTextColor(this.ab);
        this.C.setTextColor(this.ab);
        this.c.setVisibility(8);
        this.s.setVisibility(8);
        this.b.setVisibility(0);
        if ((this.p != null) && (this.p.getActivity() != null)) {
          ((StockChartScreen)this.p.getActivity()).a(true);
        }
        if (this.R != null) {
          com.android.dazhihui.d.n.a(this.R.getCode(), 1052);
        }
        if (this.p == null) {
          break;
        }
        this.p.h(1);
        break;
        this.n.setVisibility(8);
        ((RelativeLayout.LayoutParams)this.s.getLayoutParams()).topMargin = 0;
        this.x.setBackgroundColor(this.ad);
        this.x.setTextColor(this.ab);
        this.y.setTextColor(this.aa);
        this.y.setBackgroundDrawable(new ColorDrawable(this.ac));
        this.x.setBackgroundDrawable(getResources().getDrawable(this.af));
        this.z.setBackgroundDrawable(getResources().getDrawable(this.af));
        this.A.setBackgroundDrawable(getResources().getDrawable(this.af));
        this.B.setBackgroundDrawable(getResources().getDrawable(this.af));
        this.C.setBackgroundDrawable(getResources().getDrawable(this.af));
        this.z.setTextColor(this.ab);
        this.A.setTextColor(this.ab);
        this.B.setTextColor(this.ab);
        this.C.setTextColor(this.ab);
        if ((this.p != null) && (this.p.getActivity() != null)) {
          ((StockChartScreen)this.p.getActivity()).a(true);
        }
        this.b.setVisibility(8);
        this.s.setVisibility(8);
        this.c.setVisibility(0);
        this.c.j();
        if (this.R != null) {
          com.android.dazhihui.d.n.a(this.R.getCode(), 1053);
        }
        if (this.p == null) {
          break;
        }
        this.p.h(2);
        break;
        if ((this.p != null) && (this.p.getActivity() != null)) {
          ((StockChartScreen)this.p.getActivity()).a(false);
        }
        this.x.setTextColor(this.ab);
        this.y.setTextColor(this.ab);
        this.z.setTextColor(this.aa);
        this.A.setTextColor(this.ab);
        this.B.setTextColor(this.ab);
        this.C.setTextColor(this.ab);
        this.z.setBackgroundDrawable(new ColorDrawable(this.ac));
        this.x.setBackgroundDrawable(getResources().getDrawable(this.af));
        this.y.setBackgroundDrawable(getResources().getDrawable(this.af));
        this.A.setBackgroundDrawable(getResources().getDrawable(this.af));
        this.B.setBackgroundDrawable(getResources().getDrawable(this.af));
        this.C.setBackgroundDrawable(getResources().getDrawable(this.af));
        this.b.setVisibility(8);
        this.c.setVisibility(8);
        this.s.setVisibility(0);
        a(3, false);
      } while (this.R == null);
      if (com.android.dazhihui.d.n.j(this.R.getCode()))
      {
        com.android.dazhihui.d.n.a(this.R.getCode(), 1008);
        continue;
      }
      if (com.android.dazhihui.d.n.g(this.R.getType()))
      {
        com.android.dazhihui.d.n.a(this.R.getCode(), 1412);
        continue;
      }
      com.android.dazhihui.d.n.a(this.R.getCode(), 1144);
      continue;
      this.n.setVisibility(8);
      ((RelativeLayout.LayoutParams)this.s.getLayoutParams()).topMargin = 0;
      this.x.setTextColor(this.ab);
      this.y.setTextColor(this.ab);
      this.z.setTextColor(this.ab);
      this.A.setTextColor(this.aa);
      this.B.setTextColor(this.ab);
      this.A.setBackgroundDrawable(new ColorDrawable(this.ac));
      this.x.setBackgroundDrawable(getResources().getDrawable(this.af));
      this.y.setBackgroundDrawable(getResources().getDrawable(this.af));
      this.z.setBackgroundDrawable(getResources().getDrawable(this.af));
      this.B.setBackgroundDrawable(getResources().getDrawable(this.af));
      this.C.setBackgroundDrawable(getResources().getDrawable(this.af));
      this.b.setVisibility(8);
      this.c.setVisibility(8);
      this.s.setVisibility(0);
      ((StockChartScreen)this.p.getActivity()).a(false);
      a(4, false);
      continue;
      this.n.setVisibility(8);
      ((RelativeLayout.LayoutParams)this.s.getLayoutParams()).topMargin = 0;
      ((StockChartScreen)this.p.getActivity()).a(false);
      if (this.R != null) {
        com.android.dazhihui.d.n.a(this.R.getCode(), 1156);
      }
      int i1;
      if (com.android.dazhihui.d.n.m(this.R.getCode()))
      {
        if (this.U == null) {
          r();
        }
        Object localObject1;
        if (this.V == null)
        {
          this.V = new ArrayList();
          if (com.android.dazhihui.d.n.m(this.R.getCode()))
          {
            i1 = e.length;
            if (i2 >= i1) {
              break label1498;
            }
            localObject1 = new MinuteMenuVo();
            if (!com.android.dazhihui.d.n.k(this.R.getCode())) {
              break label1446;
            }
            ((MinuteMenuVo)localObject1).setIfDeafaule(true);
            if (i2 != 0) {
              break label1430;
            }
            ((MinuteMenuVo)localObject1).setFragmentName(oh.class);
          }
          for (;;)
          {
            this.V.add(localObject1);
            i2 += 1;
            break;
            i1 = d.length;
            break;
            label1430:
            if (i2 == 1)
            {
              ((MinuteMenuVo)localObject1).setFragmentName(com.android.dazhihui.ui.screen.stock.at.class);
              continue;
              label1446:
              ((MinuteMenuVo)localObject1).setIfDeafaule(true);
              if (i2 == 0) {
                ((MinuteMenuVo)localObject1).setFragmentName(of.class);
              } else if (i2 == 1) {
                ((MinuteMenuVo)localObject1).setFragmentName(dh.class);
              } else if (i2 == 2) {
                ((MinuteMenuVo)localObject1).setFragmentName(cn.class);
              }
            }
          }
        }
        try
        {
          label1498:
          localObject1 = (RelativeLayout.LayoutParams)((ImageView)this.U.getContentView().findViewById(2131560017)).getLayoutParams();
          ((RelativeLayout.LayoutParams)localObject1).addRule(14, 0);
          ((RelativeLayout.LayoutParams)localObject1).addRule(11);
          ((RelativeLayout.LayoutParams)localObject1).rightMargin = ((this.B.getWidth() - getResources().getDimensionPixelSize(2131230795)) / 2);
          this.U.showAsDropDown(this.B);
        }
        catch (Exception localException1)
        {
          localException1.printStackTrace();
        }
        continue;
      }
      this.x.setTextColor(this.ab);
      this.y.setTextColor(this.ab);
      this.z.setTextColor(this.ab);
      this.A.setTextColor(this.ab);
      this.C.setTextColor(this.ab);
      this.B.setTextColor(this.aa);
      this.B.setBackgroundDrawable(new ColorDrawable(this.ac));
      this.x.setBackgroundDrawable(getResources().getDrawable(this.af));
      this.y.setBackgroundDrawable(getResources().getDrawable(this.af));
      this.z.setBackgroundDrawable(getResources().getDrawable(this.af));
      this.A.setBackgroundDrawable(getResources().getDrawable(this.af));
      this.C.setBackgroundDrawable(getResources().getDrawable(this.af));
      this.b.setVisibility(8);
      this.c.setVisibility(8);
      this.s.setVisibility(0);
      a(5, false);
      continue;
      if (this.R != null) {
        com.android.dazhihui.d.n.a(this.R.getCode(), 20209);
      }
      if (this.U == null) {
        r();
      }
      Object localObject2;
      if (this.V == null)
      {
        this.V = new ArrayList();
        if (com.android.dazhihui.d.n.m(this.R.getCode()))
        {
          i1 = e.length;
          i2 = i3;
          if (i2 >= i1) {
            break label2004;
          }
          localObject2 = new MinuteMenuVo();
          if (!com.android.dazhihui.d.n.k(this.R.getCode())) {
            break label1952;
          }
          ((MinuteMenuVo)localObject2).setIfDeafaule(true);
          if (i2 != 0) {
            break label1936;
          }
          ((MinuteMenuVo)localObject2).setFragmentName(oh.class);
        }
        for (;;)
        {
          this.V.add(localObject2);
          i2 += 1;
          break;
          i1 = d.length;
          i2 = i3;
          break;
          label1936:
          if (i2 == 1)
          {
            ((MinuteMenuVo)localObject2).setFragmentName(com.android.dazhihui.ui.screen.stock.at.class);
            continue;
            label1952:
            ((MinuteMenuVo)localObject2).setIfDeafaule(true);
            if (i2 == 0) {
              ((MinuteMenuVo)localObject2).setFragmentName(of.class);
            } else if (i2 == 1) {
              ((MinuteMenuVo)localObject2).setFragmentName(dh.class);
            } else if (i2 == 2) {
              ((MinuteMenuVo)localObject2).setFragmentName(cn.class);
            }
          }
        }
      }
      try
      {
        label2004:
        localObject2 = (RelativeLayout.LayoutParams)((ImageView)this.U.getContentView().findViewById(2131560017)).getLayoutParams();
        ((RelativeLayout.LayoutParams)localObject2).addRule(14, 0);
        ((RelativeLayout.LayoutParams)localObject2).addRule(11);
        ((RelativeLayout.LayoutParams)localObject2).rightMargin = ((this.C.getWidth() - getResources().getDimensionPixelSize(2131230795)) / 2);
        this.U.showAsDropDown(this.C);
        this.p.o();
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          localException2.printStackTrace();
        }
      }
    }
  }
  
  private e d(int paramInt)
  {
    int i1 = this.R.getType();
    int i2 = com.android.dazhihui.d.n.o(this.R.getCode());
    switch (paramInt)
    {
    case 2: 
    default: 
      return null;
    case 3: 
      if (i1 == 0)
      {
        if (i2 == 4)
        {
          localObject = new oh();
          this.T.putInt("requestType", 0);
          ((e)localObject).setArguments(this.T);
          return (e)localObject;
        }
        localObject = bs.a(this.R.getCode(), this.R.getName());
        ((e)localObject).setBundle(this.T);
        return (e)localObject;
      }
      if ((i1 == 2) || (i1 == 10) || (i1 == 11))
      {
        this.n.setVisibility(8);
        ((RelativeLayout.LayoutParams)this.s.getLayoutParams()).topMargin = 0;
        localObject = this.T.getString("code");
        return lp.a(4, a((String)localObject, "gsgg/1.json"), "", false, (String)localObject);
      }
      if ((this.q == vr.g) || (com.android.dazhihui.d.n.e(this.R.getType())))
      {
        localObject = com.android.dazhihui.d.n.a(this.T.getString("code"), this.R.getType(), true);
        this.T.putString("nexturl", (String)localObject);
        this.T.putBoolean("ISSHOWTITLE", false);
        this.T.putInt("BACK_GROUND_COLOR", 1);
        localObject = i.a(this.T);
        ((i)localObject).a(2131493677, 2131493180);
        return (e)localObject;
      }
      if (com.android.dazhihui.d.n.h(this.R.getMarketType()))
      {
        ((RelativeLayout.LayoutParams)this.s.getLayoutParams()).topMargin = 0;
        this.n.setVisibility(8);
        localObject = this.T.getString("code");
        if (g.a().b() == y.a) {}
        for (localObject = f.an + "stock=" + (String)localObject;; localObject = f.an + "stock=" + (String)localObject + "&themeStyleVs=1")
        {
          this.T.putString("nexturl", (String)localObject);
          this.T.putBoolean("ISSHOWTITLE", false);
          this.T.putInt("BACK_GROUND_COLOR", 1);
          localObject = i.a(this.T);
          ((i)localObject).a(2131493677, 2131493180);
          return (e)localObject;
        }
      }
      a(this.av);
      ((RelativeLayout.LayoutParams)this.s.getLayoutParams()).topMargin = getResources().getDimensionPixelOffset(2131230828);
      this.n.setVisibility(0);
      localObject = this.T.getString("code");
      return lp.a(4, a((String)localObject, "list/1.json"), "", false, (String)localObject);
    case 4: 
      if ((i1 == 2) || (i1 == 10) || (i1 == 11))
      {
        localObject = com.android.dazhihui.d.n.a(this.T.getString("code"), this.R.getType(), true);
        this.T.putString("nexturl", (String)localObject);
        this.T.putBoolean("ISSHOWTITLE", false);
        this.T.putInt("BACK_GROUND_COLOR", 1);
        localObject = i.a(this.T);
        ((i)localObject).a(2131493677, 2131493180);
        return (e)localObject;
      }
      if (i1 == 0)
      {
        localObject = this.T.getString("code");
        return lp.a(4, a((String)localObject, "list/1.json"), "", false, (String)localObject);
      }
      if (com.android.dazhihui.d.n.h(this.R.getMarketType()))
      {
        localObject = com.android.dazhihui.d.n.a(this.T.getString("code"), this.R.getType(), true);
        this.T.putString("nexturl", (String)localObject);
        this.T.putBoolean("ISSHOWTITLE", false);
        this.T.putInt("BACK_GROUND_COLOR", 1);
        localObject = i.a(this.T);
        ((i)localObject).a(2131493677, 2131493180);
        return (e)localObject;
      }
      localObject = bs.a(this.R.getCode(), this.R.getName());
      ((e)localObject).setBundle(this.T);
      return (e)localObject;
    }
    Object localObject = com.android.dazhihui.d.n.a(this.T.getString("code"), this.R.getType(), true);
    this.T.putString("nexturl", (String)localObject);
    this.T.putBoolean("ISSHOWTITLE", false);
    this.T.putInt("BACK_GROUND_COLOR", 1);
    localObject = i.a(this.T);
    ((i)localObject).a(2131493677, 2131493180);
    return (e)localObject;
  }
  
  private int e(int paramInt)
  {
    int i1 = this.R.getType();
    int i2 = com.android.dazhihui.d.n.o(this.R.getCode());
    switch (paramInt)
    {
    case 2: 
    case 6: 
    default: 
    case 3: 
    case 4: 
      do
      {
        do
        {
          do
          {
            return 0;
            if (i1 != 0) {
              break;
            }
          } while (i2 != 4);
          return 0;
        } while ((i1 == 2) || (i1 == 10) || (i1 == 11));
        if ((this.q == vr.g) || (com.android.dazhihui.d.n.e(this.R.getType()))) {
          return 4;
        }
        if (com.android.dazhihui.d.n.h(this.R.getMarketType())) {
          return 3;
        }
        return 3;
        if ((i1 == 2) || (i1 == 10) || (i1 == 11)) {
          return 4;
        }
        if (i1 == 0) {
          return 3;
        }
      } while (!com.android.dazhihui.d.n.h(this.R.getMarketType()));
      return 4;
    }
    return 4;
  }
  
  private void o()
  {
    this.b.c();
    this.c.k();
    this.ak.postInvalidate();
    this.aj.postInvalidate();
  }
  
  private void p()
  {
    a(this.p.p());
  }
  
  private void q()
  {
    int i1;
    int i2;
    String str;
    if ((this.R != null) && (this.r.getVisibility() == 0))
    {
      i1 = this.R.getType();
      i2 = this.R.getMarketType();
      str = this.R.getCode();
      this.x.setRedHot(0);
      this.y.setRedHot(0);
      this.z.setRedHot(0);
      this.A.setRedHot(0);
      this.B.setRedHot(0);
      this.C.setRedHot(0);
      if (!com.android.dazhihui.d.n.g(i1)) {
        break label303;
      }
      this.x.setText("分时");
      this.x.setVisibility(0);
      this.D.setVisibility(0);
      this.I.setVisibility(0);
      this.y.setText("K线");
      this.y.setVisibility(0);
      this.E.setVisibility(0);
      this.J.setVisibility(0);
      this.z.setText("公告");
      this.z.setVisibility(0);
      this.A.setText("F10");
      this.y.setOnClickListener(this);
      this.x.setOnClickListener(this);
      this.z.setOnClickListener(this);
      this.A.setOnClickListener(this);
      this.A.setVisibility(0);
      this.F.setVisibility(0);
      this.K.setVisibility(0);
      this.B.setVisibility(8);
      this.G.setVisibility(8);
      this.L.setVisibility(8);
      this.C.setVisibility(8);
      this.H.setVisibility(8);
      this.M.setVisibility(8);
    }
    label303:
    do
    {
      return;
      if (i1 == 0)
      {
        if (i2 == 4)
        {
          this.x.setText("分时");
          this.x.setVisibility(0);
          this.D.setVisibility(0);
          this.I.setVisibility(0);
          this.y.setText("K线");
          this.y.setVisibility(0);
          this.E.setVisibility(0);
          this.J.setVisibility(0);
          this.z.setText("资金流");
          this.z.setVisibility(0);
          this.F.setVisibility(0);
          this.K.setVisibility(0);
          this.A.setText("资讯");
          this.A.setVisibility(0);
          this.G.setVisibility(8);
          this.L.setVisibility(8);
          this.y.setOnClickListener(this);
          this.x.setOnClickListener(this);
          this.z.setOnClickListener(this);
          this.A.setOnClickListener(this);
          this.B.setVisibility(8);
          this.C.setVisibility(8);
          this.H.setVisibility(8);
          this.M.setVisibility(8);
          return;
        }
        if (com.android.dazhihui.d.n.m(str))
        {
          this.x.setText("分时");
          this.x.setVisibility(0);
          this.D.setVisibility(0);
          this.I.setVisibility(0);
          this.y.setText("K线");
          this.y.setVisibility(0);
          this.E.setVisibility(0);
          this.J.setVisibility(0);
          this.z.setText("股吧");
          this.z.setVisibility(0);
          this.F.setVisibility(0);
          this.K.setVisibility(0);
          this.A.setText("资讯");
          this.A.setVisibility(0);
          this.G.setVisibility(0);
          this.L.setVisibility(0);
          this.B.setText("更多");
          this.B.setVisibility(0);
          this.y.setOnClickListener(this);
          this.x.setOnClickListener(this);
          this.z.setOnClickListener(this);
          this.A.setOnClickListener(this);
          this.B.setOnClickListener(this);
          this.H.setVisibility(8);
          this.M.setVisibility(8);
          this.C.setVisibility(8);
          return;
        }
        if (com.android.dazhihui.d.n.l(str))
        {
          this.x.setText("分时");
          this.D.setVisibility(0);
          this.I.setVisibility(0);
          this.x.setVisibility(0);
          this.y.setText("K线");
          this.E.setVisibility(0);
          this.J.setVisibility(0);
          this.y.setVisibility(0);
          this.z.setText("股吧");
          this.z.setVisibility(0);
          this.y.setOnClickListener(this);
          this.x.setOnClickListener(this);
          this.z.setOnClickListener(this);
          this.A.setVisibility(8);
          this.F.setVisibility(8);
          this.H.setVisibility(8);
          this.G.setVisibility(8);
          this.K.setVisibility(8);
          this.M.setVisibility(8);
          this.L.setVisibility(8);
          this.B.setVisibility(8);
          this.C.setVisibility(8);
          return;
        }
        this.x.setText("分时");
        this.D.setVisibility(0);
        this.I.setVisibility(0);
        this.x.setVisibility(0);
        this.y.setText("K线");
        this.E.setVisibility(8);
        this.J.setVisibility(8);
        this.y.setVisibility(0);
        this.z.setVisibility(8);
        this.y.setOnClickListener(this);
        this.x.setOnClickListener(this);
        this.z.setOnClickListener(this);
        this.A.setVisibility(8);
        this.F.setVisibility(8);
        this.H.setVisibility(8);
        this.G.setVisibility(8);
        this.K.setVisibility(8);
        this.M.setVisibility(8);
        this.L.setVisibility(8);
        this.B.setVisibility(8);
        this.C.setVisibility(8);
        return;
      }
      if ((this.q == vr.h) || (com.android.dazhihui.d.n.c(this.R.getType(), this.R.getMarketType())) || (com.android.dazhihui.d.n.c(i1)))
      {
        this.x.setText("分时");
        this.D.setVisibility(0);
        this.x.setVisibility(0);
        this.y.setText("K线");
        this.E.setVisibility(8);
        this.y.setVisibility(0);
        this.z.setVisibility(8);
        this.y.setOnClickListener(this);
        this.x.setOnClickListener(this);
        this.z.setOnClickListener(this);
        this.A.setVisibility(8);
        this.F.setVisibility(8);
        this.H.setVisibility(8);
        this.G.setVisibility(8);
        this.B.setVisibility(8);
        this.C.setVisibility(8);
        return;
      }
      if ((this.q == vr.g) || (com.android.dazhihui.d.n.e(this.R.getType())))
      {
        this.x.setText("分时");
        this.D.setVisibility(0);
        this.x.setVisibility(0);
        this.y.setText("K线");
        this.E.setVisibility(0);
        this.y.setVisibility(0);
        this.z.setText("F10");
        this.z.setVisibility(0);
        this.y.setOnClickListener(this);
        this.x.setOnClickListener(this);
        this.z.setOnClickListener(this);
        this.A.setVisibility(8);
        this.F.setVisibility(8);
        this.H.setVisibility(8);
        this.G.setVisibility(8);
        this.B.setVisibility(8);
        this.C.setVisibility(8);
        return;
      }
      if (com.android.dazhihui.d.n.j(i1, i2))
      {
        this.x.setText("分时");
        this.x.setVisibility(0);
        this.D.setVisibility(0);
        this.y.setText("K线");
        this.y.setVisibility(0);
        this.E.setVisibility(0);
        this.z.setText("资讯");
        this.z.setVisibility(0);
        this.F.setVisibility(0);
        this.A.setText("股吧");
        this.A.setVisibility(0);
        this.G.setVisibility(8);
        this.B.setVisibility(8);
        this.H.setVisibility(8);
        this.C.setText("更多");
        this.C.setVisibility(0);
        this.y.setOnClickListener(this);
        this.x.setOnClickListener(this);
        this.z.setOnClickListener(this);
        this.A.setOnClickListener(this);
        this.B.setOnClickListener(this);
        this.C.setOnClickListener(this);
        return;
      }
      if (com.android.dazhihui.d.n.i(this.R.getType(), this.R.getMarketType()))
      {
        this.x.setText("分时");
        this.x.setVisibility(0);
        this.D.setVisibility(0);
        this.y.setText("K线");
        this.y.setVisibility(0);
        this.E.setVisibility(0);
        this.z.setText("资讯");
        this.z.setVisibility(0);
        this.F.setVisibility(0);
        this.A.setText("股吧");
        this.A.setVisibility(0);
        this.G.setVisibility(0);
        this.B.setText("F10");
        this.B.setVisibility(0);
        this.H.setVisibility(0);
        this.C.setText("更多");
        this.C.setVisibility(0);
        this.y.setOnClickListener(this);
        this.x.setOnClickListener(this);
        this.z.setOnClickListener(this);
        this.A.setOnClickListener(this);
        this.B.setOnClickListener(this);
        this.C.setOnClickListener(this);
        return;
      }
      if (com.android.dazhihui.d.n.f(this.R.getType()))
      {
        this.x.setText("分时");
        this.D.setVisibility(0);
        this.x.setVisibility(0);
        this.y.setText("K线");
        this.E.setVisibility(8);
        this.y.setVisibility(0);
        this.z.setVisibility(8);
        this.y.setOnClickListener(this);
        this.x.setOnClickListener(this);
        this.z.setOnClickListener(this);
        this.A.setVisibility(8);
        this.F.setVisibility(8);
        this.H.setVisibility(8);
        this.G.setVisibility(8);
        this.B.setVisibility(8);
        this.C.setVisibility(8);
        return;
      }
    } while (!com.android.dazhihui.d.n.h(this.R.getMarketType()));
    this.x.setText("分时");
    this.x.setVisibility(0);
    this.D.setVisibility(0);
    this.y.setText("K线");
    this.y.setVisibility(0);
    this.E.setVisibility(0);
    this.z.setText("资讯");
    this.z.setVisibility(0);
    this.F.setVisibility(0);
    this.A.setText("F10");
    this.A.setVisibility(0);
    this.G.setVisibility(8);
    this.B.setVisibility(8);
    this.H.setVisibility(8);
    this.C.setVisibility(8);
    this.y.setOnClickListener(this);
    this.x.setOnClickListener(this);
    this.z.setOnClickListener(this);
    this.A.setOnClickListener(this);
  }
  
  private void r()
  {
    int i1 = this.R.getType();
    String str1 = this.R.getName();
    String str2 = this.R.getCode();
    if (this.ai == y.b) {}
    for (View localView = LayoutInflater.from(this.o).inflate(2130903444, null);; localView = LayoutInflater.from(this.o).inflate(2130903443, null))
    {
      GridView localGridView = (GridView)localView.findViewById(2131560018);
      RelativeLayout localRelativeLayout = (RelativeLayout)localView.findViewById(2131560016);
      at localat = new at(this);
      localRelativeLayout.requestLayout();
      localGridView.setNumColumns(1);
      localGridView.setAdapter(localat);
      localGridView.setOnItemClickListener(new aq(this, i1, str1, str2));
      this.U = new PopupWindow(localView);
      this.U.setOutsideTouchable(true);
      this.U.setOnDismissListener(new ar(this));
      this.U.setFocusable(true);
      this.U.setBackgroundDrawable(new ColorDrawable(0));
      this.U.setWidth((int)(g.a().m() / 5 * 1.3D));
      this.U.setHeight(-2);
      return;
    }
  }
  
  private void s()
  {
    b(av.a);
    Iterator localIterator;
    if (this.al != null)
    {
      localIterator = this.al.iterator();
      while (localIterator.hasNext()) {
        ((View)localIterator.next()).setBackgroundColor(this.ag);
      }
    }
    if (this.am != null)
    {
      localIterator = this.am.iterator();
      while (localIterator.hasNext()) {
        ((View)localIterator.next()).setBackgroundColor(this.ah);
      }
    }
    this.N.setBackgroundColor(this.ap);
    this.t.setBackgroundColor(this.ao);
    this.O.setBackgroundColor(this.ao);
    this.u.setBackgroundColor(this.ae);
    this.v.setBackgroundColor(this.ae);
  }
  
  public String a(String paramString1, String paramString2)
  {
    if ((this.R.getType() == 2) || (this.R.getType() == 10) || (this.R.getType() == 11)) {
      return f.O + "/" + paramString1.substring(paramString1.length() - 2) + "/" + paramString1.substring(2) + "/" + "jjgg/1.json";
    }
    if (com.android.dazhihui.d.n.o(this.R.getCode()) == 4) {
      return f.R + paramString1.substring(0, 2) + "/" + paramString1.substring(paramString1.length() - 2) + "/" + paramString1.substring(2) + "/" + paramString2;
    }
    return f.N + paramString1.substring(0, 2) + "/" + paramString1.substring(paramString1.length() - 2) + "/" + paramString1.substring(2) + "/" + paramString2;
  }
  
  public void a()
  {
    this.b.h();
  }
  
  public void a(int paramInt)
  {
    if (g.a().b() == y.a)
    {
      this.at.setBackgroundColor(-12961474);
      this.au.setBackgroundColor(-12961474);
      this.ar.setBackgroundColor(0);
      this.as.setBackgroundResource(2130838484);
      if (paramInt == 0)
      {
        this.k.setTextColor(-13857561);
        this.l.setTextColor(-8553091);
        this.m.setTextColor(-8553091);
      }
    }
    do
    {
      do
      {
        return;
        if (paramInt == 1)
        {
          this.k.setTextColor(-8553091);
          this.l.setTextColor(-13857561);
          this.m.setTextColor(-8553091);
          return;
        }
      } while (paramInt != 2);
      this.k.setTextColor(-8553091);
      this.l.setTextColor(-8553091);
      this.m.setTextColor(-13857561);
      return;
      this.at.setBackgroundColor(-2697514);
      this.au.setBackgroundColor(-2697514);
      this.ar.setBackgroundColor(-789513);
      this.as.setBackgroundResource(2130838485);
      if (paramInt == 0)
      {
        this.k.setTextColor(-12686651);
        this.l.setTextColor(-10066330);
        this.m.setTextColor(-10066330);
        return;
      }
      if (paramInt == 1)
      {
        this.k.setTextColor(-10066330);
        this.l.setTextColor(-12686651);
        this.m.setTextColor(-10066330);
        return;
      }
    } while (paramInt != 2);
    this.k.setTextColor(-10066330);
    this.l.setTextColor(-10066330);
    this.m.setTextColor(-12686651);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, av paramav)
  {
    this.p.a(paramInt1, paramInt2, paramInt3, paramav);
  }
  
  public void a(vr paramvr, boolean paramBoolean)
  {
    if ((this.q != paramvr) || (paramBoolean) || (this.r.getVisibility() == 8))
    {
      this.q = paramvr;
      this.r.setVisibility(0);
      this.a.setVisibility(0);
      this.f.setVisibility(0);
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.r.getLayoutParams();
      localLayoutParams.addRule(3, this.t.getId());
      localLayoutParams.topMargin = 0;
      o();
      if (paramvr == vr.d)
      {
        this.r.setVisibility(8);
        this.a.setVisibility(8);
        this.f.setVisibility(8);
      }
      if (getResources().getConfiguration().orientation != 1)
      {
        this.r.setVisibility(8);
        this.f.setVisibility(8);
      }
      q();
      if (this.aw)
      {
        m();
        this.aw = false;
      }
    }
    this.v.setVisibility(8);
  }
  
  protected void a(y paramy)
  {
    if ((paramy != null) && (paramy != this.ai))
    {
      b(paramy);
      s();
      this.b.a(paramy);
      this.c.a(paramy);
      this.u.a(paramy);
      this.v.a(paramy);
      this.ak.a(paramy);
      this.U = null;
      this.g.a(paramy);
    }
  }
  
  public void a(av paramav)
  {
    if ((this.p == null) || (this.p.getActivity() == null)) {}
    do
    {
      return;
      if ((this.P != paramav) || (this.P == av.f) || ((this.P == av.e) && (com.android.dazhihui.d.n.m(this.R.getCode()))))
      {
        b(paramav);
        m();
      }
    } while (this.R == null);
    l();
  }
  
  public void a(n paramn)
  {
    this.p.a(paramn);
  }
  
  public void a(s params)
  {
    this.p.a(params);
  }
  
  public void a(Class<? extends e> paramClass, Bundle paramBundle, int paramInt)
  {
    paramClass = (e)Fragment.instantiate(getContext(), paramClass.getName(), paramBundle);
    paramClass.setBundle(paramBundle);
    paramBundle = getHolder().getActivity().getSupportFragmentManager().a(String.valueOf(paramInt));
    android.support.v4.app.at localat = getHolder().getActivity().getSupportFragmentManager().a();
    if (this.S != null) {
      localat.b(this.S);
    }
    if (paramBundle != null) {
      localat.a(paramBundle);
    }
    this.S = paramClass;
    this.b.setVisibility(8);
    this.c.setVisibility(8);
    this.P = av.f;
    this.s.setVisibility(0);
    if ((this.S instanceof cn)) {
      ((cn)this.S).a(this);
    }
    localat.a(this.s.getId(), paramClass, String.valueOf(paramInt));
    localat.b();
    l();
  }
  
  public void a(boolean paramBoolean)
  {
    this.p.c(paramBoolean);
  }
  
  public void b()
  {
    this.b.g();
  }
  
  public void b(int paramInt)
  {
    this.b.a(paramInt);
  }
  
  public void c()
  {
    this.v.invalidate();
  }
  
  public void c(int paramInt)
  {
    int i1;
    int i2;
    String str2;
    String str1;
    d locald;
    if (this.R != null)
    {
      i1 = this.R.getType();
      i2 = this.R.getMarketType();
      str2 = this.R.getCode();
      str1 = "DL" + str2;
      locald = d.a();
      int i3 = locald.b(str1, 0);
      locald.g();
      if (i3 != paramInt) {
        break label84;
      }
    }
    for (;;)
    {
      return;
      label84:
      Object localObject2 = null;
      Object localObject1 = localObject2;
      if (i1 != 2)
      {
        localObject1 = localObject2;
        if (i1 != 10)
        {
          if (i1 != 11) {
            break label139;
          }
          localObject1 = localObject2;
        }
      }
      while (localObject1 != null)
      {
        ((TabTextView)localObject1).setRedHot(1);
        ((TabTextView)localObject1).setOnRedDotCloseClickListener(new ap(this, locald, str1, paramInt));
        return;
        label139:
        if (i1 == 0)
        {
          if (i2 == 4)
          {
            localObject1 = this.A;
          }
          else
          {
            localObject1 = localObject2;
            if (com.android.dazhihui.d.n.m(str2)) {
              localObject1 = this.A;
            }
          }
        }
        else {
          localObject1 = this.z;
        }
      }
    }
  }
  
  public void d()
  {
    this.R.setNeedExRight(true);
    this.p.k();
  }
  
  public void e()
  {
    this.p.refresh();
  }
  
  public void f()
  {
    if (this.R != null)
    {
      this.R.cleanData();
      this.R = null;
    }
    if (this.ax != null)
    {
      this.ax.cleanData();
      this.ax = null;
    }
    if (this.b != null) {
      this.b.a();
    }
    if (this.c != null) {
      this.c.x();
    }
    this.a.scrollTo(0, 0);
  }
  
  public void g()
  {
    this.aj.a();
    this.ak.a();
  }
  
  public e getCurrentFragment()
  {
    return this.S;
  }
  
  public StockVo getCurrentStockVo()
  {
    if (this.p == null) {
      return null;
    }
    return this.p.u();
  }
  
  public StockVo getDataModel()
  {
    return this.R;
  }
  
  public uv getHolder()
  {
    return this.p;
  }
  
  public KChartContainer getKChartContainer()
  {
    return this.c;
  }
  
  public boolean getLevel2Limit()
  {
    return uv.c(getCurrentStockVo());
  }
  
  public MinChartContainer getMinChartContainer()
  {
    return this.b;
  }
  
  public View getScroolView()
  {
    if (this.P == av.a) {
      return this.b.getmScoolView();
    }
    if (this.P == av.b) {
      return this.c.getmScrollView();
    }
    if (this.S == null) {
      return null;
    }
    if ((this.S instanceof lp)) {
      return ((lp)this.S).getScroolView();
    }
    return this.S.getScroolView();
  }
  
  public vr getStockType()
  {
    return this.q;
  }
  
  public StockVo getStockVo()
  {
    return this.ax;
  }
  
  public av getSwitchType()
  {
    return this.P;
  }
  
  public StockChartDetaisView getmDetailView()
  {
    return this.ak;
  }
  
  public StockChartVideoAdapter getmHotVideoAdapter()
  {
    return this.i;
  }
  
  public GridView getmHotViewFlow()
  {
    return this.h;
  }
  
  public StockChartPriceView getmPriceView()
  {
    return this.aj;
  }
  
  public void h()
  {
    if (this.R == null) {}
    while ((!com.android.dazhihui.d.n.h(this.R.getType(), this.R.getMarketType())) || (this.R.getCode().equals("HKHSI"))) {
      return;
    }
    com.android.dazhihui.d.n.a(this.R.getCode(), 20215);
    new o(getHolder().getActivity()).show();
    d locald = d.a();
    locald.a("IS_FIRST_MINUTE_HK", 1);
    locald.g();
  }
  
  public void i()
  {
    d locald = d.a();
    int i1 = locald.b("IS_FIRST_MINUTE_HK", 0);
    locald.g();
    if (i1 == 0) {
      h();
    }
  }
  
  public void j()
  {
    if (getResources().getConfiguration().orientation == 1)
    {
      this.u.a();
      return;
    }
    ((StockChartScreen)getHolder().getActivity()).a().s().a();
  }
  
  public void k()
  {
    this.x.setTextColor(this.ab);
    this.y.setTextColor(this.ab);
    this.z.setTextColor(this.ab);
    this.A.setTextColor(this.ab);
    this.B.setTextColor(this.ab);
    this.C.setTextColor(this.aa);
    if ((this.R != null) && (!com.android.dazhihui.d.n.m(this.R.getCode())))
    {
      this.C.setBackgroundDrawable(new ColorDrawable(this.ac));
      this.x.setBackgroundDrawable(getResources().getDrawable(this.af));
      this.y.setBackgroundDrawable(getResources().getDrawable(this.af));
      this.z.setBackgroundDrawable(getResources().getDrawable(this.af));
      this.B.setBackgroundDrawable(getResources().getDrawable(this.af));
      this.A.setBackgroundDrawable(getResources().getDrawable(this.af));
      return;
    }
    this.B.setBackgroundDrawable(new ColorDrawable(this.ac));
    this.x.setBackgroundDrawable(getResources().getDrawable(this.af));
    this.y.setBackgroundDrawable(getResources().getDrawable(this.af));
    this.z.setBackgroundDrawable(getResources().getDrawable(this.af));
    this.A.setBackgroundDrawable(getResources().getDrawable(this.af));
  }
  
  public void l()
  {
    if ((this.p != null) && (this.s != null))
    {
      this.p.x().setVisibility(8);
      this.p.x().requestLayout();
      if ((this.S != null) && ((this.S instanceof bs)) && (this.s.getVisibility() == 0)) {
        this.p.v();
      }
    }
    else
    {
      return;
    }
    this.p.w();
  }
  
  public void m()
  {
    if (this.P == av.a) {
      if ((this.b.b != null) && (this.b.b.getVisibility() == 0) && (this.b.c != null) && (this.b.c.getVisibility() == 0)) {
        this.b.b.h();
      }
    }
    while (this.P != av.b) {
      return;
    }
    this.c.f.h();
    Log.i("advert", "k线");
  }
  
  public void n()
  {
    if (this.r != null) {
      this.r.setVisibility(8);
    }
    if (this.f != null) {
      this.f.setVisibility(8);
    }
  }
  
  public void onClick(View paramView)
  {
    if ((paramView == this.x) || (paramView == this.y) || (paramView == this.z) || (paramView == this.A) || (paramView == this.B) || (paramView == this.C)) {
      a(paramView);
    }
    do
    {
      do
      {
        do
        {
          return;
          if ((paramView instanceof MinChartContainerTop))
          {
            this.p.onClick(paramView);
            return;
          }
          if ((paramView instanceof StockChartDetaisView))
          {
            this.p.onClick(paramView);
            return;
          }
          if (paramView != this.k) {
            break;
          }
        } while (this.av == 0);
        com.android.dazhihui.d.n.a(this.R.getCode(), 1144);
        a(3, false);
        a(0);
        this.av = 0;
        return;
        if (paramView != this.l) {
          break;
        }
      } while (this.av == 1);
      if (this.R != null) {
        com.android.dazhihui.d.n.a(this.R.getCode(), 20319);
      }
      paramView = a(this.T.getString("code"), "gsgg/1.json");
      this.T.putInt("type", 4);
      this.T.putString("firstUrl", paramView);
      this.T.putString("titleName", "");
      this.T.putBoolean("isNeedCache", false);
      a(lp.class, this.T, 500);
      a(1);
      this.av = 1;
      return;
    } while ((paramView != this.m) || (this.av == 2));
    if (this.R != null) {
      com.android.dazhihui.d.n.a(this.R.getCode(), 20320);
    }
    paramView = a(this.T.getString("code"), "yjbg/1.json");
    this.T.putInt("type", 4);
    this.T.putString("firstUrl", paramView);
    this.T.putString("titleName", "");
    this.T.putBoolean("isNeedCache", false);
    a(lp.class, this.T, 500);
    a(2);
    this.av = 2;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (((paramInt2 > 0) && (paramInt2 != paramInt4)) || ((paramInt1 > 0) && (paramInt1 != paramInt3) && (this.U != null) && (this.U.isShowing()))) {
      this.U.dismiss();
    }
  }
  
  public void setCurrentPageIndex(int paramInt)
  {
    setStockVo(this.Q.t(paramInt));
    a(az.a(this.Q.t(paramInt)), false);
  }
  
  public void setDataModel(StockVo paramStockVo)
  {
    if ((paramStockVo != null) && (this.R != paramStockVo))
    {
      this.R = paramStockVo;
      this.ax = paramStockVo;
      m.a().b().addBrowseStock(this.R.getCode(), this.R.getName(), this.R.getType());
      if (this.T == null) {
        this.T = new Bundle();
      }
      this.T.putString("code", paramStockVo.getCode());
      this.T.putString("name", paramStockVo.getName());
      this.T.putInt("type", paramStockVo.getType());
      o();
      this.V = null;
      this.U = null;
      i();
    }
    q();
    p();
  }
  
  public void setHolder(uv paramuv)
  {
    this.p = paramuv;
  }
  
  public void setIsCurrentContainer(boolean paramBoolean)
  {
    this.aw = paramBoolean;
  }
  
  public void setKChartDetailViewVisible(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (getResources().getConfiguration().orientation == 1)
      {
        this.u.a();
        this.u.setVisibility(0);
        this.u.invalidate();
        return;
      }
      ((StockChartScreen)getHolder().getActivity()).a().t();
      return;
    }
    this.u.setVisibility(8);
  }
  
  public void setMinChartDetailViewVisible(boolean paramBoolean)
  {
    RelativeLayout.LayoutParams localLayoutParams;
    if (this.q == vr.c)
    {
      if (this.v.getVisibility() == 8)
      {
        localLayoutParams = new RelativeLayout.LayoutParams(-1, getResources().getDimensionPixelSize(2131230820));
        localLayoutParams.addRule(3, this.f.getId());
        localLayoutParams.topMargin = this.W;
        this.v.setLayoutParams(localLayoutParams);
      }
      if (paramBoolean)
      {
        this.v.setVisibility(0);
        return;
      }
      this.v.setVisibility(8);
      return;
    }
    if (this.v.getVisibility() == 8)
    {
      localLayoutParams = new RelativeLayout.LayoutParams(-1, getResources().getDimensionPixelSize(2131230820));
      localLayoutParams.addRule(3, this.f.getId());
      localLayoutParams.topMargin = this.W;
      this.v.setLayoutParams(localLayoutParams);
      this.v.requestLayout();
    }
    if (paramBoolean)
    {
      this.v.setVisibility(0);
      return;
    }
    this.v.setVisibility(8);
  }
  
  public void setStockVo(StockVo paramStockVo)
  {
    this.ax = paramStockVo;
  }
  
  public void setmDetailView(StockChartDetaisView paramStockChartDetaisView)
  {
    this.ak = paramStockChartDetaisView;
  }
  
  public void setmPriceView(StockChartPriceView paramStockChartPriceView)
  {
    this.aj = paramStockChartPriceView;
  }
  
  public void setmSwitchType(av paramav)
  {
    this.P = paramav;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\StockChartContainer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */