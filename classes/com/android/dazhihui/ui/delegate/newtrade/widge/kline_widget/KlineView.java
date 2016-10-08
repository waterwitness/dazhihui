package com.android.dazhihui.ui.delegate.newtrade.widge.kline_widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import com.android.dazhihui.d;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.delegate.newtrade.TradeDetialScreen;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.stockchart.s;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KlineView
  extends FrameLayout
  implements View.OnClickListener, View.OnLongClickListener
{
  private int A;
  private int B;
  private int C;
  private int D;
  private int E = 0;
  private int[] F = { 5, 10 };
  private int[] G = { 5, 10, 20, 30 };
  private int[] H = { -1, -409087, -65281, -16711936, -12686651, -3770608 };
  private int I = -1369560;
  private int J = -11753174;
  private int K = -1369560;
  private int L = -11753174;
  private int M = -65536;
  private int N = -1;
  private int O = -5395027;
  private int P = 2130838628;
  private int Q = 2130838118;
  private int R = 2130838119;
  private int S = -11907497;
  private int T = 2130838247;
  private int U = -1291845632;
  private long[][] V;
  private long[][] W;
  boolean a = false;
  private int aa = -1;
  private i ab = i.a;
  private PopupWindow ac;
  private ImageView ad;
  private ImageView ae;
  private RelativeLayout af;
  private TextView ag;
  private TextView ah;
  private SimpleDateFormat ai = new SimpleDateFormat("yyyyMMdd");
  private DateFormat aj = new SimpleDateFormat("yyyy/MM/dd");
  private int ak = -1889114522;
  private int al = -15657958;
  private int am;
  private int an;
  private int ao;
  private String ap;
  private String aq;
  private int ar = -1;
  private int as = -1;
  private int at;
  private int au;
  private Handler av = new f(this);
  private Runnable aw = new g(this);
  private Runnable ax = new h(this);
  private int b = -5395027;
  private int c;
  private int d;
  private Context e;
  private ScrollView f;
  private LinearLayout g;
  private KlineContentLayout h;
  private b i;
  private FrameLayout j;
  private FrameLayout k;
  private KlineLineView l;
  private KlineAverageView m;
  private FrameLayout n;
  private KlineParamView o;
  private KlineParamView p;
  private TextView q;
  private TextView r;
  private TextView s;
  private TextView t;
  private KlineMoveLineView u;
  private KlinePeriodView v;
  private TradeDetialScreen w;
  private StockVo x;
  private int y;
  private int z;
  
  public KlineView(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public KlineView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  private void a(Context paramContext)
  {
    this.e = paramContext;
    Resources localResources = getResources();
    this.am = localResources.getDimensionPixelSize(2131230780);
    this.an = localResources.getDimensionPixelSize(2131230774);
    this.ao = localResources.getDimensionPixelSize(2131230798);
    a(y.b);
    l();
    b(paramContext);
    a();
  }
  
  private void a(Context paramContext, String[] paramArrayOfString)
  {
    this.af = new RelativeLayout(paramContext);
    LinearLayout localLinearLayout = new LinearLayout(paramContext);
    localLinearLayout.setOrientation(1);
    localLinearLayout.setId(localLinearLayout.hashCode());
    localLinearLayout.setGravity(17);
    localLinearLayout.setBackgroundResource(this.P);
    int i1 = 0;
    if (i1 < 9)
    {
      TextView localTextView = new TextView(paramContext);
      localTextView.setTextColor(this.O);
      localTextView.setTextSize(12.0F);
      localTextView.setGravity(17);
      localTextView.setText(paramArrayOfString[i1]);
      localLinearLayout.addView(localTextView, new LinearLayout.LayoutParams(this.an * 6, this.an * 3));
      localTextView.setOnClickListener(this);
      if (paramArrayOfString[i1].equals("VOL"))
      {
        localTextView.setTag(Integer.valueOf(536870912));
        this.q = localTextView;
      }
      for (;;)
      {
        i1 += 1;
        break;
        if (paramArrayOfString[i1].equals("MACD")) {
          localTextView.setTag(Integer.valueOf(536870913));
        } else if (paramArrayOfString[i1].equals("KDJ")) {
          localTextView.setTag(Integer.valueOf(536870914));
        } else if (paramArrayOfString[i1].equals("RSI")) {
          localTextView.setTag(Integer.valueOf(536870915));
        } else if (paramArrayOfString[i1].equals("BIAS")) {
          localTextView.setTag(Integer.valueOf(536870916));
        } else if (paramArrayOfString[i1].equals("CCI")) {
          localTextView.setTag(Integer.valueOf(536870917));
        } else if (paramArrayOfString[i1].equals("W&R")) {
          localTextView.setTag(Integer.valueOf(536870918));
        } else if (paramArrayOfString[i1].equals("BOLL")) {
          localTextView.setTag(Integer.valueOf(536870919));
        } else if (paramArrayOfString[i1].equals("DMA")) {
          localTextView.setTag(Integer.valueOf(536870920));
        }
      }
    }
    this.s = new TextView(paramContext);
    this.s.setTextColor(this.O);
    this.s.setTextSize(12.0F);
    this.s.setGravity(17);
    this.s.setText("参数设置");
    paramArrayOfString = new LinearLayout.LayoutParams(this.an * 6, this.an * 3);
    localLinearLayout.addView(this.s, paramArrayOfString);
    this.s.setOnClickListener(this);
    this.s.setTag(Integer.valueOf(536870927));
    this.ad = new ImageView(paramContext);
    this.ad.setId(this.ad.hashCode());
    this.ad.setImageResource(this.Q);
    paramArrayOfString = new RelativeLayout.LayoutParams(this.an * 6, -2);
    paramArrayOfString.addRule(3, this.ad.getId());
    this.af.addView(localLinearLayout, paramArrayOfString);
    paramArrayOfString = new RelativeLayout.LayoutParams(this.am, this.an);
    paramArrayOfString.bottomMargin = (-this.ao);
    paramArrayOfString.leftMargin = (this.an * 2);
    paramArrayOfString.addRule(10);
    this.af.addView(this.ad, paramArrayOfString);
    this.ae = new ImageView(paramContext);
    this.ae.setImageResource(this.R);
    paramContext = new RelativeLayout.LayoutParams(this.am, this.an);
    paramContext.addRule(3, localLinearLayout.getId());
    paramContext.topMargin = (-this.ao);
    paramContext.leftMargin = (this.an * 2);
    this.af.addView(this.ae, paramContext);
  }
  
  private void a(y paramy)
  {
    if (paramy == y.b)
    {
      this.b = -14540254;
      this.H[0] = -14540254;
      this.H[1] = 34816;
      this.H[2] = -2943766;
      this.H[3] = -13070532;
      this.H[4] = -12686651;
      this.H[5] = -9233261;
      this.I = -1900544;
      this.J = -14901175;
      this.M = -14540254;
      this.T = 2130838252;
      this.N = -12686651;
      this.K = -1168340;
      this.L = -14901175;
      this.O = -14540254;
      this.U = -1275068417;
      this.P = 2130838629;
      this.Q = 2130838121;
      this.R = 2130838120;
      this.S = -3618616;
      this.ak = -1882601015;
      this.al = -7292952;
      return;
    }
    this.b = -5395027;
    this.H[0] = -1;
    this.H[1] = -409087;
    this.H[2] = -65281;
    this.H[3] = -16711936;
    this.H[4] = -12686651;
    this.H[5] = -3770608;
    this.I = -1369560;
    this.J = -11753174;
    this.M = -65536;
    this.T = 2130838247;
    this.N = -1;
    this.K = -1369560;
    this.L = -11753174;
    this.O = -5395027;
    this.U = -1291845632;
    this.P = 2130838628;
    this.Q = 2130838118;
    this.R = 2130838119;
    this.S = -11907497;
    this.ak = -1889114522;
    this.al = -15657958;
  }
  
  private void b(Context paramContext)
  {
    a(paramContext, d.a().g());
    this.ac = new PopupWindow();
    this.ac.setWidth(-2);
    this.ac.setHeight(-2);
    this.ac.setOutsideTouchable(true);
    this.ac.setBackgroundDrawable(new ColorDrawable(0));
    this.ac.setFocusable(true);
  }
  
  private void l()
  {
    Object localObject1 = getResources();
    this.y = ((Resources)localObject1).getDimensionPixelSize(2131230829);
    this.B = ((Resources)localObject1).getDimensionPixelSize(2131230799);
    this.C = ((Resources)localObject1).getDimensionPixelSize(2131230829);
    this.D = ((Resources)localObject1).getDimensionPixelSize(2131230773);
    this.z = this.y;
    int i1 = ((Resources)localObject1).getDimensionPixelSize(2131230798);
    int i2 = ((Resources)localObject1).getDimensionPixelSize(2131230806);
    this.c = ((Resources)localObject1).getDimensionPixelSize(2131230827);
    this.g = new LinearLayout(this.e);
    this.g.setOrientation(1);
    this.j = new FrameLayout(this.e);
    localObject1 = new LinearLayout.LayoutParams(-1, -1);
    this.g.addView(this.j, (ViewGroup.LayoutParams)localObject1);
    this.h = new KlineContentLayout(this.e);
    this.h.setOrientation(1);
    localObject1 = new FrameLayout.LayoutParams(-1, -1);
    this.h.setWeightSum(4.0F);
    this.j.addView(this.h, (ViewGroup.LayoutParams)localObject1);
    this.k = new FrameLayout(this.e);
    localObject1 = new LinearLayout.LayoutParams(-1, 0, 3.0F);
    this.h.addView(this.k, (ViewGroup.LayoutParams)localObject1);
    this.h.setHolder(this);
    this.l = new KlineLineView(this.e);
    this.l.setAverageViewHeight(i2);
    this.l.setRightDistance(this.c);
    localObject1 = new FrameLayout.LayoutParams(-1, -1);
    this.k.addView(this.l, (ViewGroup.LayoutParams)localObject1);
    this.l.setOnClickListener(this);
    this.l.setOnLongClickListener(this);
    this.l.setPadding(this.d, 0, 0, 0);
    this.l.setHolder(this);
    this.m = new KlineAverageView(this.e);
    localObject1 = new FrameLayout.LayoutParams(-1, i2);
    this.k.addView(this.m, (ViewGroup.LayoutParams)localObject1);
    this.m.setHolder(this);
    localObject1 = new FrameLayout(this.e);
    Object localObject2 = new LinearLayout.LayoutParams(-1, i2);
    this.h.addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
    this.i = new b(this.e);
    localObject2 = new FrameLayout.LayoutParams(-1, -1);
    ((FrameLayout)localObject1).addView(this.i, (ViewGroup.LayoutParams)localObject2);
    this.i.setHolder(this);
    this.p = new KlineParamView(this.e, true);
    this.p.setRightDistance(this.c);
    this.p.setVisibility(8);
    localObject1 = new LinearLayout.LayoutParams(-1, 0, 1.0F);
    this.h.addView(this.p, (ViewGroup.LayoutParams)localObject1);
    this.p.setHolder(this);
    this.p.setPadding(this.d, 0, 0, 0);
    this.n = new FrameLayout(this.e);
    localObject1 = new LinearLayout.LayoutParams(-1, 0, 1.0F);
    this.h.addView(this.n, (ViewGroup.LayoutParams)localObject1);
    this.o = new KlineParamView(this.e);
    this.o.setRightDistance(this.c);
    localObject1 = new FrameLayout.LayoutParams(-1, -1);
    this.n.addView(this.o, (ViewGroup.LayoutParams)localObject1);
    this.o.setHolder(this);
    this.o.setPadding(this.d, 0, 0, 0);
    this.r = new TextView(this.e);
    this.r.setGravity(17);
    this.r.setBackgroundResource(this.T);
    this.r.setTextColor(this.b);
    this.r.setTextSize(12.0F);
    this.r.setText("VOL");
    this.r.setOnClickListener(this);
    localObject1 = new FrameLayout.LayoutParams(this.C * 9, i2);
    ((FrameLayout.LayoutParams)localObject1).topMargin = i1;
    ((FrameLayout.LayoutParams)localObject1).leftMargin = i1;
    this.n.addView(this.r, (ViewGroup.LayoutParams)localObject1);
    this.t = new TextView(this.e);
    this.t.setTextColor(this.b);
    this.t.setTextSize(14.0F);
    this.t.setText(a("VOL"));
    this.t.setPadding(0, i1, 0, i1);
    localObject1 = new FrameLayout.LayoutParams(-2, -2);
    ((FrameLayout.LayoutParams)localObject1).topMargin = i1;
    ((FrameLayout.LayoutParams)localObject1).leftMargin = (i1 + this.C * 9 + this.C * 2);
    this.n.addView(this.t, (ViewGroup.LayoutParams)localObject1);
    localObject1 = new RelativeLayout(this.e);
    localObject2 = new LinearLayout.LayoutParams(-1, -2);
    this.h.addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
    this.ag = new TextView(this.e);
    this.ag.setTextColor(this.b);
    this.ag.setTextSize(10.0F);
    localObject2 = new RelativeLayout.LayoutParams(-2, -2);
    ((RelativeLayout.LayoutParams)localObject2).addRule(9);
    ((RelativeLayout)localObject1).addView(this.ag, (ViewGroup.LayoutParams)localObject2);
    this.ah = new TextView(this.e);
    this.ah.setTextColor(this.b);
    this.ah.setTextSize(10.0F);
    localObject2 = new RelativeLayout.LayoutParams(-2, -2);
    ((RelativeLayout.LayoutParams)localObject2).addRule(11);
    ((RelativeLayout)localObject1).addView(this.ah, (ViewGroup.LayoutParams)localObject2);
    this.u = new KlineMoveLineView(this.e);
    this.u.setVisibility(4);
    this.u.setAverageViewHeight(i2);
    this.u.setRightDistance(this.c);
    localObject1 = new FrameLayout.LayoutParams(-1, -1);
    this.j.addView(this.u, (ViewGroup.LayoutParams)localObject1);
    this.u.setHolder(this);
    this.v = new KlinePeriodView(this.e);
    this.v.setVisibility(0);
    this.v.setAverageViewHeight(i2);
    this.v.setRightDistance(this.c);
    localObject1 = new FrameLayout.LayoutParams(-1, -1);
    this.j.addView(this.v, (ViewGroup.LayoutParams)localObject1);
    this.v.setHolder(this);
    localObject1 = new FrameLayout.LayoutParams(-1, -1);
    addView(this.g, (ViewGroup.LayoutParams)localObject1);
    onFinishInflate();
  }
  
  private void m()
  {
    Object localObject = (FrameLayout.LayoutParams)this.h.getLayoutParams();
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.u.getLayoutParams();
    int i1 = this.au;
    if (getResources().getConfiguration().orientation == 1)
    {
      ((FrameLayout.LayoutParams)localObject).width = this.at;
      localLayoutParams.width = this.at;
      ((LinearLayout.LayoutParams)this.k.getLayoutParams()).weight = 3.0F;
      this.t.setText(a("VOL"));
      this.t.setVisibility(0);
      this.n.setVisibility(0);
      if ((this.x != null) && (!n.i(this.x.getType(), n.o(this.x.getCode()))) && (!n.m(this.x.getCode())) && (!n.g(this.x.getType())))
      {
        ((FrameLayout.LayoutParams)localObject).height = i1;
        localLayoutParams.height = i1;
        i1 = this.au;
        localObject = (LinearLayout.LayoutParams)this.p.getLayoutParams();
        this.p.setVisibility(0);
      }
    }
    for (;;)
    {
      int i2 = View.MeasureSpec.makeMeasureSpec(this.at, 1073741824);
      int i3 = View.MeasureSpec.makeMeasureSpec(i1, 1073741824);
      this.h.measure(i2, i3);
      i1 = 0;
      while (i1 < this.h.getChildCount())
      {
        this.h.getChildAt(i1).measure(i2, 0);
        i1 += 1;
        continue;
        if ((this.x != null) && (n.i(this.x.getType(), n.o(this.x.getCode()))))
        {
          ((FrameLayout.LayoutParams)localObject).height = (i1 - this.B);
          localLayoutParams.height = (i1 - this.B);
          i1 -= this.B;
        }
        for (;;)
        {
          this.p.setVisibility(8);
          break;
          ((FrameLayout.LayoutParams)localObject).height = i1;
          localLayoutParams.height = i1;
        }
      }
      this.p.measure(i2, 0);
      this.n.measure(i2, 0);
      this.l.measure(i2, 0);
      this.g.measure(i2, 0);
      this.u.measure(i2, i3);
      n();
      return;
    }
  }
  
  private void n()
  {
    this.z = this.y;
    int i1 = getWidth();
    int i2 = this.d;
    int i3 = this.c;
    int i4 = this.A;
    this.A = ((i1 - i2 - i3) / this.z);
    if (i4 != this.A)
    {
      o();
      a(false);
    }
  }
  
  private void o()
  {
    this.x = this.w.a();
    if (this.x != null)
    {
      this.x.getKLineOffset();
      int[][] arrayOfInt = this.x.getKData();
      if ((arrayOfInt != null) && (arrayOfInt.length > 0)) {
        setKLineOffset(Math.max(0, arrayOfInt.length - this.A));
      }
    }
  }
  
  private void p()
  {
    if (this.x == null) {
      return;
    }
    int i3 = this.x.getKLineOffset();
    Object localObject = this.x.getKData();
    int i1;
    int i2;
    if ((localObject != null) && (localObject.length > 0)) {
      if (i3 == 0)
      {
        i1 = localObject.length - 1;
        i2 = 0;
      }
    }
    for (;;)
    {
      i2 = localObject[i2][0];
      i1 = localObject[i1][0];
      try
      {
        localObject = this.ai.parse(String.valueOf(i2));
        this.ag.setText(this.aj.format((Date)localObject));
        try
        {
          localObject = this.ai.parse(String.valueOf(i1));
          this.ah.setText(this.aj.format((Date)localObject));
          return;
        }
        catch (ParseException localParseException1)
        {
          return;
        }
        if (i3 > localParseException1.length - 1) {}
        for (i1 = 0;; i1 = i3)
        {
          if (this.A + i3 <= localParseException1.length) {
            break label158;
          }
          i3 = localParseException1.length;
          i2 = i1;
          i1 = i3 - 1;
          break;
        }
        label158:
        int i4 = this.A;
        i2 = i1;
        i1 = i3 + i4 - 1;
        continue;
        this.ag.setText(" ");
        this.ah.setText(" ");
        return;
      }
      catch (ParseException localParseException2)
      {
        for (;;) {}
      }
    }
  }
  
  private void q()
  {
    if (this.u.getVisibility() == 0)
    {
      this.u.invalidate();
      c();
    }
  }
  
  private void r()
  {
    this.G = d.a().A();
    this.x = this.w.a();
    int[][] arrayOfInt = this.x.getKData();
    int i1 = arrayOfInt.length;
    int i2 = this.G.length;
    this.V = ((long[][])Array.newInstance(Long.TYPE, new int[] { i1, i2 }));
    i1 = 0;
    long l1;
    long l2;
    while (i1 < this.G.length)
    {
      i2 = 0;
      l1 = 0L;
      while (i2 < arrayOfInt.length)
      {
        l2 = l1;
        if (i2 >= this.G[i1]) {
          l2 = l1 - arrayOfInt[(i2 - this.G[i1])][4];
        }
        l1 = l2 + arrayOfInt[i2][4];
        if (i2 >= this.G[i1] - 1) {
          this.V[i2][i1] = (10L * l1 / Math.min(i2 + 1, this.G[i1]));
        }
        i2 += 1;
      }
      i1 += 1;
    }
    this.F = d.a().i();
    i1 = arrayOfInt.length;
    i2 = this.F.length;
    this.W = ((long[][])Array.newInstance(Long.TYPE, new int[] { i1, i2 }));
    long[] arrayOfLong = this.x.getKVolData();
    i1 = 0;
    while (i1 < this.F.length)
    {
      i2 = 0;
      l1 = 0L;
      while (i2 < arrayOfInt.length)
      {
        l2 = l1;
        if (i2 >= this.F[i1]) {
          l2 = l1 - arrayOfLong[(i2 - this.F[i1])];
        }
        l1 = l2 + arrayOfLong[i2];
        if (i2 >= this.F[i1] - 1) {
          this.W[i2][i1] = (l1 / Math.min(i2 + 1, this.F[i1]));
        }
        i2 += 1;
      }
      i1 += 1;
    }
  }
  
  public String a(String paramString)
  {
    paramString = d.a().i();
    StringBuffer localStringBuffer = new StringBuffer();
    if (paramString != null)
    {
      localStringBuffer.append("(");
      int i2 = paramString.length;
      int i1 = 0;
      while (i1 < i2)
      {
        int i3 = paramString[i1];
        if (localStringBuffer.length() != 1) {
          localStringBuffer.append(",");
        }
        localStringBuffer.append(i3);
        i1 += 1;
      }
      localStringBuffer.append(")");
      return localStringBuffer.toString();
    }
    return "";
  }
  
  public void a()
  {
    this.V = ((long[][])null);
    this.W = ((long[][])null);
    this.aa = -1;
    if (this.w != null) {
      this.x = this.w.a();
    }
    if (this.x == null) {
      return;
    }
    this.E = 0;
    this.p.setVisibility(0);
    m();
    k();
  }
  
  public void a(int paramInt)
  {
    this.x = this.w.a();
    if ((this.x != null) && (this.x.getKData() != null))
    {
      paramInt = this.x.getKLineOffset() - paramInt;
      if (this.A + paramInt <= this.x.getKData().length) {
        break label112;
      }
      this.aa = (this.x.getKData().length - 1);
      paramInt = Math.max(this.x.getKData().length - this.A, 0);
      if (paramInt <= 0) {
        break label125;
      }
      setKLineOffset(paramInt);
      label96:
      if (paramInt <= 50) {
        break label135;
      }
      this.a = false;
    }
    for (;;)
    {
      j();
      return;
      label112:
      this.aa = (this.A - 1);
      break;
      label125:
      setKLineOffset(0);
      paramInt = 0;
      break label96;
      label135:
      if (!this.a)
      {
        this.a = true;
        this.w.b(false);
      }
    }
  }
  
  public void a(String paramString1, String paramString2)
  {
    this.ap = paramString1;
    this.aq = paramString2;
    d();
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      b();
    }
    j();
  }
  
  public void a(String[][] paramArrayOfString, int[] paramArrayOfInt)
  {
    this.w.b();
    if (paramArrayOfString != null) {
      this.i.a(paramArrayOfString, paramArrayOfInt);
    }
  }
  
  public void b()
  {
    this.x = this.w.a();
    int i1;
    int[][] arrayOfInt;
    if (this.x != null)
    {
      i1 = this.x.getKLineOffset();
      arrayOfInt = this.x.getKData();
      if ((arrayOfInt == null) || (arrayOfInt.length <= 0)) {
        break label68;
      }
      if (i1 <= 0) {
        break label53;
      }
    }
    for (;;)
    {
      setKLineOffset(i1);
      return;
      label53:
      i1 = Math.max(0, arrayOfInt.length - this.A);
    }
    label68:
    this.ag.setText(" ");
    this.ah.setText(" ");
  }
  
  public void c()
  {
    a(this.e, d.a().g());
    if ((getResources().getConfiguration().orientation != 1) || (this.W == null) || (this.x == null)) {}
    for (;;)
    {
      return;
      int i1 = this.W.length - 1;
      if (this.aa != -1) {
        i1 = this.aa + this.x.getKLineOffset();
      }
      int i2 = i1;
      if (i1 > this.W.length - 1) {
        i2 = this.W.length - 1;
      }
      long[] arrayOfLong = this.W[i2];
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
      i1 = localSpannableStringBuilder.length();
      localSpannableStringBuilder.append("MA ");
      i2 = localSpannableStringBuilder.length();
      localSpannableStringBuilder.setSpan(new ForegroundColorSpan(this.H[0]), i1, i2, 33);
      this.F = d.a().i();
      i1 = 0;
      while (i1 < this.F.length)
      {
        i2 = localSpannableStringBuilder.length();
        localSpannableStringBuilder.append(" " + this.F[i1] + ":" + com.android.dazhihui.d.b.g(arrayOfLong[i1]));
        int i3 = localSpannableStringBuilder.length();
        localSpannableStringBuilder.setSpan(new ForegroundColorSpan(this.H[i1]), i2, i3, 33);
        i1 += 1;
      }
    }
  }
  
  public void d()
  {
    this.ar = -1;
    this.as = -1;
    if ((this.x == null) || (this.ap == null) || (this.aq == null)) {}
    int[][] arrayOfInt;
    do
    {
      return;
      arrayOfInt = this.x.getKData();
    } while (arrayOfInt == null);
    int i1 = 0;
    for (;;)
    {
      if (i1 < arrayOfInt.length)
      {
        if (n.i(arrayOfInt[i1][0] + "", this.ap).intValue() != 0) {
          break label160;
        }
        this.ar = i1;
        if (n.i(arrayOfInt[i1][0] + "", this.aq).intValue() != 0) {
          break label254;
        }
        this.as = i1;
      }
      for (;;)
      {
        if ((this.as == -1) || (this.ar == -1)) {
          break label404;
        }
        this.v.invalidate();
        return;
        label160:
        if ((i1 >= arrayOfInt.length - 1) || (n.i(arrayOfInt[i1][0] + "", this.ap).intValue() >= 0) || (n.i(arrayOfInt[(i1 + 1)][0] + "", this.ap).intValue() <= 0)) {
          break;
        }
        this.ar = (i1 + 1);
        break;
        label254:
        if ((i1 < arrayOfInt.length - 1) && (n.i(arrayOfInt[i1][0] + "", this.aq).intValue() < 0) && (n.i(arrayOfInt[(i1 + 1)][0] + "", this.aq).intValue() > 0)) {
          this.as = (i1 + 1);
        } else if ((i1 == arrayOfInt.length - 1) && (n.i(arrayOfInt[i1][0] + "", this.aq).intValue() < 0)) {
          this.as = (arrayOfInt.length - 1);
        }
      }
      label404:
      i1 += 1;
    }
  }
  
  public void e()
  {
    this.x = this.w.a();
    if ((this.x == null) || (this.x.getKData() == null)) {
      return;
    }
    int i1 = this.A;
    int i2 = this.x.getKLineOffset();
    if (this.z < this.y + 11) {
      this.z += 1;
    }
    this.A = ((getWidth() - this.d - this.c) / this.z);
    i2 += i1 - this.A;
    int i3 = Math.max(0, this.x.getKData().length - this.A);
    if (i2 < 0) {
      i1 = 0;
    }
    for (;;)
    {
      setKLineOffset(i1);
      a(false);
      return;
      i1 = i3;
      if (i2 <= i3) {
        i1 = i2;
      }
    }
  }
  
  public void f()
  {
    this.x = this.w.a();
    if ((this.x == null) || (this.x.getKData() == null)) {
      return;
    }
    int i1 = this.A;
    int i2 = this.x.getKLineOffset();
    if (this.z > this.D * 2) {
      this.z -= 1;
    }
    this.A = ((getWidth() - this.d - this.c) / this.z);
    i2 += i1 - this.A;
    int i3 = Math.max(0, this.x.getKData().length - this.A);
    if (i2 < 0)
    {
      this.av.removeMessages(0);
      this.av.sendEmptyMessageDelayed(0, 50L);
      i1 = 0;
    }
    for (;;)
    {
      setKLineOffset(i1);
      a(false);
      return;
      i1 = i3;
      if (i2 <= i3) {
        i1 = i2;
      }
    }
  }
  
  public void g()
  {
    String str = "";
    this.x = this.w.a();
    if (this.x != null) {
      str = this.x.getCode();
    }
    n.a(str, 1225);
    post(this.aw);
  }
  
  public long[][] getAvgPrice()
  {
    return this.V;
  }
  
  public long[][] getAvgVol()
  {
    return this.W;
  }
  
  public int[] getAvgs()
  {
    return this.F;
  }
  
  public int[] getAvgsColors()
  {
    return this.H;
  }
  
  public int getDDEDownColor()
  {
    return this.L;
  }
  
  public int getDDEUpColor()
  {
    return this.K;
  }
  
  public StockVo getDataModel()
  {
    return this.w.a();
  }
  
  public int getDefaultKLineWidth()
  {
    return this.y;
  }
  
  public i getDisplayModel()
  {
    return this.ab;
  }
  
  public int getDownColor()
  {
    return this.J;
  }
  
  public int getEndDateOffset()
  {
    return this.as;
  }
  
  public int getIndexModel()
  {
    return this.E;
  }
  
  public s getKLinePeriod()
  {
    return s.g;
  }
  
  public int getKLineSize()
  {
    return this.A;
  }
  
  public int getKLineViewHeight()
  {
    return this.l.getHeight();
  }
  
  public long getKLineViewMaxValue()
  {
    return this.l.getMaxValue();
  }
  
  public long getKLineViewMinValue()
  {
    return this.l.getMinValue();
  }
  
  public int getKLineWidth()
  {
    return this.z;
  }
  
  public int getKlineRightPartColor()
  {
    return this.M;
  }
  
  public int[] getMAs()
  {
    return this.G;
  }
  
  public int getMiddleLayoutHeight()
  {
    return this.i.getHeight();
  }
  
  public int getMoveLineColor()
  {
    return this.N;
  }
  
  public int[] getParamSettingBtnLocation()
  {
    int[] arrayOfInt = new int[2];
    arrayOfInt[1] -= this.an;
    return arrayOfInt;
  }
  
  public int getParamViewVol()
  {
    return this.n.getHeight();
  }
  
  public int getParamsViewHeight()
  {
    return this.o.getHeight();
  }
  
  public int getScreenIndex()
  {
    return this.aa;
  }
  
  public int getStartDateOffset()
  {
    return this.ar;
  }
  
  public int getTextColor()
  {
    return this.b;
  }
  
  public int getUpColor()
  {
    return this.I;
  }
  
  public ScrollView getmScrollView()
  {
    return this.f;
  }
  
  public void h()
  {
    String str = "";
    this.x = this.w.a();
    if (this.x != null) {
      str = this.x.getCode();
    }
    n.a(str, 1225);
    post(this.ax);
  }
  
  public void i()
  {
    setMoveViewVisibility(8);
    removeCallbacks(this.aw);
    removeCallbacks(this.ax);
  }
  
  public void j()
  {
    this.l.c();
    this.o.b();
    this.p.b();
    this.m.invalidate();
    this.v.invalidate();
    if (this.ab == i.b) {
      this.u.invalidate();
    }
  }
  
  public void k()
  {
    Object localObject = this.w.a();
    if (localObject == null) {}
    do
    {
      return;
      localObject = ((StockVo)localObject).getKData();
    } while ((localObject == null) || (localObject.length <= 0));
    r();
  }
  
  public void onClick(View paramView) {}
  
  public boolean onLongClick(View paramView)
  {
    if ((paramView == this.l) && (this.h.getTouchModel() == 1) && (this.w.a() != null) && (this.w.a().getKData() != null))
    {
      setMoveViewVisibility(0);
      this.l.b();
    }
    return true;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (((paramInt2 > 0) && (paramInt2 != paramInt4)) || ((paramInt1 > 0) && (paramInt1 != paramInt3)))
    {
      this.at = paramInt1;
      this.au = paramInt2;
      if ((this.ac != null) && (this.ac.isShowing())) {
        this.ac.dismiss();
      }
      m();
    }
  }
  
  public void setHolder(TradeDetialScreen paramTradeDetialScreen)
  {
    this.w = paramTradeDetialScreen;
  }
  
  public void setKLineOffset(int paramInt)
  {
    if (this.w != null) {
      this.x = this.w.a();
    }
    if (this.x == null) {
      return;
    }
    this.x.setKLineOffset(paramInt);
    p();
  }
  
  public void setMoveViewVisibility(int paramInt)
  {
    if (paramInt == 0)
    {
      this.ab = i.b;
      this.u.setVisibility(0);
      this.u.getParent().requestDisallowInterceptTouchEvent(true);
      if (this.n.getVisibility() == 0) {
        this.i.setIndexDetailViewVisible(true);
      }
      this.w.a(true);
    }
    for (;;)
    {
      c();
      return;
      this.aa = -1;
      this.ab = i.a;
      this.u.setVisibility(8);
      this.u.getParent().requestDisallowInterceptTouchEvent(false);
      this.i.setIndexDetailViewVisible(false);
      this.w.a(false);
    }
  }
  
  public void setScreenIndex(int paramInt)
  {
    int i2 = this.A - 1;
    this.x = this.w.a();
    int i1 = i2;
    if (this.x != null)
    {
      i1 = i2;
      if (this.x.getKData() != null)
      {
        int i3 = this.x.getKData().length;
        i1 = i2;
        if (this.A > i3) {
          i1 = i3 - 1;
        }
      }
    }
    if (paramInt > i1) {}
    for (this.aa = i1;; this.aa = paramInt)
    {
      q();
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\widge\kline_widget\KlineView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */