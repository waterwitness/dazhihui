package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.n;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.a.u;
import com.android.dazhihui.d.b;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.IRequestAdapterListener;
import com.android.dazhihui.ui.model.RequestAdapter;
import com.android.dazhihui.ui.model.stock.Stock2955Vo;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.adv.AdvertView;
import com.android.dazhihui.ui.widget.flip.ViewFlow;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IndexBottomWidget
  extends RelativeLayout
  implements View.OnClickListener, i, IRequestAdapterListener
{
  private static final String[] C = { "SH000001", "SZ399001", "SZ399006" };
  private static final String[] D = { "上证指数", "深证成指", "创业板指" };
  private Animation A;
  private Animation B;
  private int E = 0;
  private Vector<String> F = new Vector();
  private List<es> G = new ArrayList();
  private er H = new er(this, null);
  private m I;
  private m J;
  private int K;
  private int L = 241;
  private int M;
  private int[] N;
  private int[][] O;
  private int P = Integer.MIN_VALUE;
  private int Q = Integer.MAX_VALUE;
  private int[] R;
  private int S;
  private int T;
  private int[] U;
  private int[] V;
  private int[] W;
  protected RequestAdapter a = new eo(this);
  private int[] aa;
  private int[] ab;
  private int ac;
  private Handler ad = new Handler();
  private boolean ae;
  private u af;
  private AdvertView ag;
  private y ah = y.a;
  private Runnable ai = new el(this);
  private int b;
  private int c;
  private Context d;
  private View e;
  private LinearLayout f;
  private ViewFlow g;
  private RelativeLayout h;
  private RelativeLayout i;
  private TextView j;
  private TextView k;
  private TextView l;
  private View m;
  private View n;
  private ImageView o;
  private LinearLayout p;
  private RelativeLayout q;
  private LinearLayout r;
  private TextView s;
  private TextView t;
  private TextView u;
  private TextView v;
  private TextView w;
  private TextView x;
  private MinutePriceView y;
  private MinuteTradeVolumeView z;
  
  public IndexBottomWidget(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public IndexBottomWidget(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private int a(int paramInt)
  {
    return paramInt / 100;
  }
  
  private int a(es parames, eq parameq)
  {
    int i3 = 0;
    int i1;
    switch (ep.a[parameq.ordinal()])
    {
    default: 
      i1 = 0;
      i2 = i3;
      if (i1 != 0) {
        if (parames.f != 0) {
          break label101;
        }
      }
      break;
    }
    label101:
    for (int i2 = i3;; i2 = i1 - parames.f)
    {
      if (i2 != 0) {
        break label112;
      }
      return -8616044;
      i1 = parames.e;
      break;
      i1 = parames.h;
      break;
      i1 = parames.i;
      break;
      i1 = parames.g;
      break;
    }
    label112:
    if (i2 > 0) {
      return -1689801;
    }
    return -11753174;
  }
  
  private SpannableStringBuilder a(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(paramString1);
    localSpannableStringBuilder.setSpan(new ForegroundColorSpan(paramInt1), 0, paramString1.length(), 33);
    paramString1 = Pattern.compile(paramString2).matcher(localSpannableStringBuilder);
    if (paramString1.find())
    {
      paramInt1 = paramString1.start();
      int i1 = paramString1.end();
      localSpannableStringBuilder.setSpan(new ForegroundColorSpan(paramInt2), paramInt1, i1, 33);
    }
    return localSpannableStringBuilder;
  }
  
  private es a(String paramString)
  {
    Object localObject = this.G.iterator();
    while (((Iterator)localObject).hasNext())
    {
      es locales = (es)((Iterator)localObject).next();
      if ((!TextUtils.isEmpty(locales.a)) && (locales.a.equals(paramString))) {
        return locales;
      }
    }
    localObject = new es(this, null);
    ((es)localObject).a = paramString;
    this.G.add(localObject);
    return (es)localObject;
  }
  
  private String a(es parames)
  {
    if ((parames.e == 0) && (parames.f == 0)) {
      parames = "0000.00";
    }
    String str;
    do
    {
      do
      {
        do
        {
          return parames;
          str = b.a(parames.e, parames.c);
          parames = str;
        } while (!str.contains("."));
        parames = str;
      } while (str.length() < 8);
      parames = str;
    } while (str.split("\\.")[1].length() <= 1);
    return str.substring(0, str.length() - 1);
  }
  
  private void a(int paramInt, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    int i4;
    int i1;
    int i2;
    int i9;
    int i8;
    int i3;
    int i7;
    label168:
    label212:
    label251:
    label349:
    do
    {
      try
      {
        q localq = new q(paramArrayOfByte);
        i4 = localq.b();
        localq.b();
        localq.b();
        this.K = localq.e();
        i1 = localq.e();
        paramInt = i1;
        if (!paramBoolean) {
          break label836;
        }
        int i5 = localq.b();
        int i6 = localq.e();
        i2 = 0;
        for (paramInt = 0;; paramInt = i3 + paramInt)
        {
          if (i2 >= i6) {
            break label816;
          }
          i9 = localq.e();
          i8 = localq.e();
          i3 = a(i9);
          i7 = a(i8);
          i9 = b(i9);
          i8 = b(i8);
          if (i3 > i7) {
            break;
          }
          i3 = i8 - i9 + (i7 - i3) * 60;
          i3 /= i5;
          i2 += 1;
        }
        this.L = (i2 + 1);
        paramInt = i1;
        if (i1 > this.L) {
          paramInt = this.L;
        }
        if ((this.O != null) && (this.O.length == this.L))
        {
          paramArrayOfByte = (int[][])null;
          if ((paramInt == 0) && (i4 != 1)) {
            break label349;
          }
          paramArrayOfByte = (int[][])Array.newInstance(Integer.TYPE, new int[] { paramInt, 5 });
          break label831;
        }
        for (;;)
        {
          if (paramInt < paramArrayOfByte.length)
          {
            paramArrayOfByte[paramInt][0] = localq.h();
            paramArrayOfByte[paramInt][1] = localq.h();
            paramArrayOfByte[paramInt][3] = localq.h();
            paramArrayOfByte[paramInt][2] = localq.h();
            if (i4 == 1) {
              paramArrayOfByte[paramInt][4] = localq.h();
            }
            try
            {
              if (this.M == 0) {
                this.N[paramInt] = paramArrayOfByte[paramInt][3];
              }
              for (;;)
              {
                paramInt += 1;
                break;
                setDataLen(this.L);
                break label836;
                paramArrayOfByte = (int[][])Array.newInstance(Integer.TYPE, new int[] { paramInt, 4 });
                break label831;
                this.N[(this.M - 1 + paramInt)] = paramArrayOfByte[paramInt][3];
              }
            }
            catch (Exception localException)
            {
              for (;;)
              {
                localException.printStackTrace();
              }
            }
          }
        }
        i1 = paramArrayOfByte.length;
      }
      catch (Exception paramArrayOfByte)
      {
        paramArrayOfByte.printStackTrace();
        return;
      }
    } while (this.O == null);
    if (i1 > 0) {
      if (this.M == 0)
      {
        System.arraycopy(paramArrayOfByte, 0, this.O, 0, i1);
        this.M = i1;
        f();
        break label839;
        label458:
        if (paramInt >= this.M) {
          break label650;
        }
        this.V[paramInt] = this.O[paramInt][0];
        this.U[paramInt] = this.O[paramInt][2];
        this.W[paramInt] = this.O[paramInt][1];
        if (paramInt == 0)
        {
          this.aa[paramInt] = this.O[paramInt][3];
          label526:
          if (i4 != 1) {
            break label844;
          }
          this.ab[paramInt] = this.O[paramInt][4];
          break label844;
        }
      }
      else
      {
        i2 = paramArrayOfByte[0][0];
        this.T = this.M;
        paramInt = this.M - 1;
      }
    }
    for (;;)
    {
      if (paramInt >= 0)
      {
        if (this.O[paramInt][0] == i2) {
          this.T = paramInt;
        }
      }
      else
      {
        System.arraycopy(paramArrayOfByte, 0, this.O, this.T, i1);
        f();
        this.M = (this.T + i1);
        break label839;
        this.aa[paramInt] = (this.N[paramInt] - this.N[(paramInt - 1)]);
        break label526;
        label650:
        getMaxAndMinValue();
        this.y.setdecLen(this.ac);
        this.y.setDataAverage(this.U);
        this.y.setData(this.W);
        this.y.setDataTimes(this.V);
        this.y.setTradeData(this.aa);
        this.y.setDataCj(this.ab);
        this.y.setDetailstag(i4);
        this.y.setLength(this.M);
        this.z.setData(this.W);
        this.z.setTradeData(this.aa);
        this.z.setLength(this.M);
        this.y.postInvalidate();
        this.z.postInvalidate();
        return;
        i3 = 60 - i9 + (23 - i3) * 60 + (i8 + i7 * 60);
        break;
        label816:
        i2 = paramInt;
        if (paramInt >= 0) {
          break label168;
        }
        i2 = 241;
        break label168;
        label831:
        paramInt = 0;
        break label251;
        label836:
        break label212;
        label839:
        paramInt = 0;
        break label458;
        label844:
        paramInt += 1;
        break label458;
      }
      paramInt -= 1;
    }
  }
  
  private void a(Context paramContext)
  {
    this.d = paramContext;
    this.b = paramContext.getResources().getColor(2131493563);
    this.c = -14868442;
    this.F.clear();
    int i1 = 0;
    while (i1 < C.length)
    {
      this.F.add(C[i1]);
      a(C[i1]);
      i1 += 1;
    }
    this.A = AnimationUtils.loadAnimation(getContext().getApplicationContext(), 2130968610);
    this.B = AnimationUtils.loadAnimation(getContext().getApplicationContext(), 2130968611);
    this.e = new View(this.d);
    this.e.setBackgroundColor(0);
    this.e.setVisibility(8);
    this.e.setOnClickListener(this);
    paramContext = new RelativeLayout.LayoutParams(-1, -1);
    addView(this.e, paramContext);
    this.f = new LinearLayout(this.d);
    this.f.setOrientation(0);
    this.f.setBackgroundResource(2130838700);
    this.g = new ViewFlow(this.d);
    paramContext = new LinearLayout.LayoutParams(0, -1, 2.0F);
    this.f.addView(this.g, paramContext);
    this.g.setAdapter(this.H);
    this.g.setOnItemClickListener(new em(this));
    paramContext = new RelativeLayout.LayoutParams(-1, getResources().getDimensionPixelSize(2131230814));
    paramContext.addRule(12);
    addView(this.f, paramContext);
    this.h = new RelativeLayout(this.d);
    this.h.setBackgroundColor(this.d.getResources().getColor(2131493538));
    this.h.setVisibility(8);
    this.m = new View(this.d);
    this.m.setId(this.m.hashCode());
    this.m.setBackgroundColor(getResources().getColor(2131493548));
    paramContext = new RelativeLayout.LayoutParams(-1, 1);
    paramContext.addRule(10);
    this.h.addView(this.m, paramContext);
    this.i = new RelativeLayout(this.d);
    this.i.setId(2130838889);
    this.i.setBackgroundColor(0);
    paramContext = new RelativeLayout.LayoutParams(-1, getResources().getDimensionPixelSize(2131230820));
    paramContext.addRule(3, this.m.getId());
    this.h.addView(this.i, paramContext);
    this.j = new TextView(this.d);
    this.j.setId(2131165222);
    this.j.setTextColor(this.b);
    this.j.setTextSize(14.0F);
    this.j.setText(2131165222);
    this.j.setGravity(17);
    this.j.setOnClickListener(this);
    paramContext = new RelativeLayout.LayoutParams(getResources().getDimensionPixelSize(2131230845), -1);
    paramContext.addRule(9);
    this.i.addView(this.j, paramContext);
    this.k = new TextView(this.d);
    this.k.setId(2131165223);
    this.k.setTextColor(this.b);
    this.k.setTextSize(14.0F);
    this.k.setText(2131165223);
    this.k.setGravity(17);
    this.k.setOnClickListener(this);
    paramContext = new RelativeLayout.LayoutParams(getResources().getDimensionPixelSize(2131230845), -1);
    paramContext.addRule(1, 2131165222);
    this.i.addView(this.k, paramContext);
    this.l = new TextView(this.d);
    this.l.setTextColor(this.b);
    this.l.setTextSize(14.0F);
    this.l.setText(2131165224);
    this.l.setGravity(17);
    this.l.setOnClickListener(this);
    paramContext = new RelativeLayout.LayoutParams(getResources().getDimensionPixelSize(2131230845), -1);
    paramContext.addRule(1, 2131165223);
    this.i.addView(this.l, paramContext);
    this.o = new ImageView(this.d);
    this.o.setImageResource(2130838701);
    this.o.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    this.o.setId(2130838701);
    this.o.setOnClickListener(this);
    paramContext = new RelativeLayout.LayoutParams(getResources().getDimensionPixelSize(2131230838), -1);
    paramContext.addRule(11);
    this.i.addView(this.o, paramContext);
    this.n = new View(this.d);
    this.n.setId(this.n.hashCode());
    this.n.setBackgroundColor(getResources().getColor(2131493548));
    paramContext = new RelativeLayout.LayoutParams(-1, 1);
    paramContext.addRule(3, this.i.getId());
    this.h.addView(this.n, paramContext);
    this.p = new LinearLayout(this.d);
    this.p.setOrientation(0);
    this.p.setOnClickListener(this);
    paramContext = new RelativeLayout.LayoutParams(-1, -1);
    paramContext.addRule(3, this.n.getId());
    this.h.addView(this.p, paramContext);
    this.q = new RelativeLayout(this.d);
    paramContext = new LinearLayout.LayoutParams(0, -1);
    paramContext.weight = 2.0F;
    MinuteControlView localMinuteControlView = new MinuteControlView(getContext());
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
    i1 = getResources().getDimensionPixelOffset(2131230829);
    localLayoutParams.setMargins(i1, i1, 0, i1);
    this.q.addView(localMinuteControlView, localLayoutParams);
    this.y = localMinuteControlView.c;
    this.z = localMinuteControlView.d;
    this.p.addView(this.q, paramContext);
    this.r = new LinearLayout(this.d);
    this.r.setOrientation(1);
    this.r.setPadding(getResources().getDimensionPixelSize(2131230829), 0, 0, 0);
    paramContext = new LinearLayout.LayoutParams(0, -1);
    paramContext.weight = 1.0F;
    this.p.addView(this.r, paramContext);
    this.s = new TextView(this.d);
    this.s.setTextSize(22.0F);
    this.s.setGravity(19);
    paramContext = new LinearLayout.LayoutParams(-1, 0);
    paramContext.weight = 1.5F;
    this.r.addView(this.s, paramContext);
    this.t = new TextView(this.d);
    this.t.setTextSize(13.0F);
    this.t.setGravity(19);
    paramContext = new LinearLayout.LayoutParams(-1, 0);
    paramContext.weight = 1.0F;
    this.r.addView(this.t, paramContext);
    this.u = new TextView(this.d);
    this.u.setTextSize(14.0F);
    this.u.setGravity(19);
    paramContext = new LinearLayout.LayoutParams(-1, 0);
    paramContext.weight = 1.0F;
    this.r.addView(this.u, paramContext);
    this.v = new TextView(this.d);
    this.v.setTextSize(14.0F);
    this.v.setGravity(19);
    paramContext = new LinearLayout.LayoutParams(-1, 0);
    paramContext.weight = 1.0F;
    this.r.addView(this.v, paramContext);
    this.w = new TextView(this.d);
    this.w.setTextSize(14.0F);
    this.w.setGravity(19);
    paramContext = new LinearLayout.LayoutParams(-1, 0);
    paramContext.weight = 1.0F;
    this.r.addView(this.w, paramContext);
    this.x = new TextView(this.d);
    this.x.setTextSize(14.0F);
    this.x.setGravity(19);
    paramContext = new LinearLayout.LayoutParams(-1, 0);
    paramContext.weight = 1.0F;
    this.r.addView(this.x, paramContext);
    paramContext = new RelativeLayout.LayoutParams(-1, getResources().getDimensionPixelSize(2131230800));
    paramContext.addRule(12);
    addView(this.h, paramContext);
    g();
    e();
    this.af = new en(this);
  }
  
  private int b(int paramInt)
  {
    return paramInt % 100;
  }
  
  private String b(es parames)
  {
    if (parames.h == 0) {
      return "0000.00";
    }
    return b.a(parames.h, parames.c);
  }
  
  private void b()
  {
    this.ae = true;
    this.ad.removeCallbacks(this.ai);
    this.ad.post(this.ai);
  }
  
  private String c(es parames)
  {
    if (parames.i == 0) {
      return "0000.00";
    }
    return b.a(parames.i, parames.c);
  }
  
  private void c()
  {
    this.ae = false;
    this.ad.removeCallbacks(this.ai);
  }
  
  private String d(es parames)
  {
    if (parames.g == 0) {
      return "0000.00";
    }
    return b.a(parames.g, parames.c);
  }
  
  private void d()
  {
    x[] arrayOfx = new x[1];
    arrayOfx[0] = new x(2942);
    arrayOfx[0].a(C[this.E]);
    arrayOfx[0].c(this.K);
    arrayOfx[0].c("2942-跑马灯-IndexBottomWidget-" + C[this.E]);
    this.J = new m(arrayOfx);
    this.J.a(n.d);
    this.J.a(this.a);
    this.J.a(C[this.E]);
    sendRequest(this.J);
  }
  
  private String e(es parames)
  {
    if (parames.f == 0) {
      return "0000.00";
    }
    return b.a(parames.f, parames.c);
  }
  
  private void e()
  {
    x localx = new x(2955);
    localx.c(106);
    localx.c(0);
    localx.a(this.F);
    localx.c("2955_106-跑马灯-IndexBottomWidget-" + this.F);
    this.I = new m(localx, n.d);
    registRequestListener(this.I);
    setAutoRequest(this.I);
    sendRequest(this.I);
    this.a.setAutoRequestPeriod(4000L);
  }
  
  private String f(es parames)
  {
    if ((parames.e == 0) && (parames.f == 0)) {
      return "00.00";
    }
    if (parames.e > parames.f) {
      return "+" + b.b(parames.e, parames.f, parames.c);
    }
    return b.b(parames.e, parames.f, parames.c);
  }
  
  private void f()
  {
    int i2 = 1;
    int i1 = i2;
    try
    {
      if (this.O[0][1] == 0)
      {
        this.O[0][1] = this.S;
        this.O[0][2] = this.S;
        i1 = i2;
      }
      if (i1 < this.O.length - 1)
      {
        if (this.O[i1] == null) {
          break label367;
        }
        if (this.O[i1][1] == 0) {
          this.O[i1][1] = this.O[(i1 - 1)][1];
        }
        if (this.O[i1][2] == 0) {
          this.O[i1][2] = this.O[(i1 - 1)][2];
        }
        if (this.N[i1] != 0) {
          break label367;
        }
        this.N[i1] = this.N[(i1 - 1)];
      }
    }
    catch (Exception localException1) {}
    for (;;)
    {
      try
      {
        i1 = this.O.length - 1;
        if (i1 >= 0)
        {
          if (this.O[i1] == null) {
            break label374;
          }
          if (this.O[i1][1] == 0) {
            this.O[i1][1] = this.O[(i1 + 1)][1];
          }
          if (this.O[i1][2] == 0) {
            this.O[i1][2] = this.O[(i1 + 1)][2];
          }
          if (this.N[i1] != 0) {
            break label374;
          }
          this.N[i1] = this.N[(i1 + 1)];
        }
      }
      catch (Exception localException2)
      {
        i1 = this.O.length - 1;
      }
      while (i1 > 0)
      {
        try
        {
          if (this.O[i1][1] == 0) {
            this.O[i1][1] = this.S;
          }
          if (this.O[i1][2] == 0) {
            this.O[i1][2] = this.S;
          }
          this.O[i1][3] = (this.N[i1] - this.N[(i1 - 1)]);
        }
        catch (Exception localException3)
        {
          for (;;) {}
        }
        i1 -= 1;
      }
      this.O[0][3] = this.O[0][3];
      return;
      label367:
      i1 += 1;
      break;
      label374:
      i1 -= 1;
    }
  }
  
  private String g(es parames)
  {
    if ((parames.e == 0) && (parames.f == 0)) {
      return "0.00%";
    }
    return b.b(parames.e, parames.f);
  }
  
  private void g()
  {
    this.K = 0;
    this.O = ((int[][])null);
    this.aa = null;
    this.S = -1;
    this.T = 0;
    this.M = 0;
    this.P = Integer.MIN_VALUE;
    this.Q = Integer.MAX_VALUE;
    this.y.b();
    this.z.a();
    this.y.postInvalidate();
    this.z.postInvalidate();
  }
  
  private void getMaxAndMinValue()
  {
    if (this.O == null) {
      return;
    }
    int i1 = 0;
    while (i1 < this.M)
    {
      if (this.O[i1][1] > this.P) {
        this.P = this.O[i1][1];
      }
      if (this.O[i1][1] < this.Q) {
        this.Q = this.O[i1][1];
      }
      if (this.O[i1][2] > this.P) {
        this.P = this.O[i1][2];
      }
      if (this.O[i1][2] < this.Q) {
        this.Q = this.O[i1][2];
      }
      i1 += 1;
    }
    int i2 = Math.max(Math.abs(this.P - this.S), Math.abs(this.Q - this.S));
    i1 = i2;
    if (i2 == this.S) {
      i1 = 28;
    }
    i2 = this.S;
    if (i2 == 0) {
      this.P = 2;
    }
    for (this.Q = 0;; this.Q = (i2 - i1 * i2 / 100))
    {
      this.z.setClosePrice(this.S);
      this.y.setClosePrice(this.S);
      this.y.a(this.P, this.Q);
      return;
      i1 = i1 * 100 / i2 + 1;
      this.P = (i2 * i1 / 100 + i2);
    }
  }
  
  private void h()
  {
    i();
    j();
  }
  
  private void i()
  {
    switch (this.E)
    {
    default: 
      this.j.setBackgroundColor(0);
      this.k.setBackgroundColor(0);
      this.l.setBackgroundColor(0);
      return;
    case 0: 
      this.j.setBackgroundColor(this.c);
      this.k.setBackgroundColor(0);
      this.l.setBackgroundColor(0);
      return;
    case 1: 
      this.j.setBackgroundColor(0);
      this.k.setBackgroundColor(this.c);
      this.l.setBackgroundColor(0);
      return;
    }
    this.j.setBackgroundColor(0);
    this.k.setBackgroundColor(0);
    this.l.setBackgroundColor(this.c);
  }
  
  private void j()
  {
    Object localObject;
    if (this.G.size() > this.E)
    {
      localObject = (es)this.G.get(this.E);
      i1 = a((es)localObject, eq.a);
      this.s.setTextColor(i1);
      this.s.setText(a((es)localObject));
      this.t.setTextColor(i1);
      this.t.setText(f((es)localObject) + "  " + g((es)localObject));
      i1 = a((es)localObject, eq.b);
      SpannableStringBuilder localSpannableStringBuilder = a("最高   " + b((es)localObject), "最高", i1, -7829368);
      this.u.setText(localSpannableStringBuilder);
      i1 = a((es)localObject, eq.c);
      localSpannableStringBuilder = a("最低   " + c((es)localObject), "最低", i1, -7829368);
      this.v.setText(localSpannableStringBuilder);
      i1 = a((es)localObject, eq.d);
      localSpannableStringBuilder = a("今开   " + d((es)localObject), "今开", i1, -7829368);
      this.w.setText(localSpannableStringBuilder);
      if (this.ah != y.b) {
        break label327;
      }
    }
    label327:
    for (int i1 = -10066330;; i1 = -1)
    {
      localObject = a("昨收   " + e((es)localObject), "昨收", i1, -7829368);
      this.x.setText((CharSequence)localObject);
      return;
    }
  }
  
  private void setDataLen(int paramInt)
  {
    this.O = new int[paramInt][];
    this.N = new int[paramInt];
    this.U = new int[paramInt];
    this.W = new int[paramInt];
    this.aa = new int[paramInt];
    this.V = new int[paramInt];
    this.ab = new int[paramInt];
    if (this.y != null)
    {
      this.y.set2942TotalPoint(paramInt);
      this.z.set2942TotalPoint(paramInt);
    }
    if (this.z != null) {
      this.z.set2942TotalPoint(paramInt);
    }
  }
  
  public void a()
  {
    if (this.h.getVisibility() == 0)
    {
      this.h.startAnimation(this.B);
      this.h.setVisibility(8);
      this.e.setVisibility(8);
      c();
    }
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    if (paramj == null) {}
    label4:
    Object localObject;
    byte[] arrayOfByte;
    do
    {
      p localp;
      do
      {
        break label4;
        for (;;)
        {
          return;
          if ((paramj instanceof o))
          {
            localObject = (o)paramj;
            localp = ((o)localObject).h();
            if (localp == null) {
              break;
            }
            try
            {
              arrayOfByte = localp.b;
              if (arrayOfByte != null)
              {
                paramj = new q(arrayOfByte);
                if (localp.a == 2955)
                {
                  if (arrayOfByte == null) {
                    continue;
                  }
                  int i2 = paramj.e();
                  int i3 = paramj.e();
                  paramj.e();
                  int i4 = paramj.e();
                  if (this.I != paramh) {
                    continue;
                  }
                  this.R = new int[i4];
                  paramh = new Stock2955Vo();
                  int i1 = 0;
                  while (i1 < i4)
                  {
                    paramh.decode(paramj, i2, i3);
                    localObject = a(paramh.code);
                    ((es)localObject).b = paramh.name;
                    ((es)localObject).c = paramh.decLen;
                    this.ac = ((es)localObject).c;
                    ((es)localObject).d = paramh.type;
                    ((es)localObject).f = paramh.zshou;
                    this.R[i1] = ((es)localObject).f;
                    ((es)localObject).g = paramh.kp;
                    ((es)localObject).e = paramh.zx;
                    ((es)localObject).h = paramh.zg;
                    ((es)localObject).i = paramh.zd;
                    ((es)localObject).j = paramh.cje;
                    i1 += 1;
                  }
                  this.H.notifyDataSetChanged();
                  h();
                }
              }
            }
            catch (Exception paramh)
            {
              paramh.printStackTrace();
              return;
            }
          }
        }
      } while (localp.a != 2942);
      paramh = (String)paramh.j();
    } while ((paramh == null) || (!paramh.equals(C[this.E])) || (this.R == null) || (this.E < 0) || (this.E >= this.R.length));
    this.S = this.R[this.E];
    a(this.K, arrayOfByte, ((o)localObject).i());
  }
  
  public void handleTimeout(h paramh) {}
  
  public void netException(h paramh, Exception paramException) {}
  
  public void onClick(View paramView)
  {
    if (paramView == this.o) {
      a();
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
            if (paramView != this.j) {
              break;
            }
          } while (this.E == 0);
          this.E = 0;
          h();
          g();
          b();
          this.H.notifyDataSetChanged();
          return;
          if (paramView != this.k) {
            break;
          }
        } while (this.E == 1);
        this.E = 1;
        h();
        g();
        b();
        this.H.notifyDataSetChanged();
        return;
        if (paramView != this.l) {
          break;
        }
      } while (this.E == 2);
      this.E = 2;
      h();
      g();
      b();
      this.H.notifyDataSetChanged();
      return;
      if (paramView == this.p)
      {
        paramView = new Vector();
        int i1 = 0;
        while (i1 < this.G.size())
        {
          localObject = (es)this.G.get(i1);
          paramView.add(new StockVo(((es)localObject).b, ((es)localObject).a, ((es)localObject).d, false));
          i1 += 1;
        }
        Object localObject = new Bundle();
        ((Bundle)localObject).putParcelable("stock_vo", (Parcelable)paramView.get(this.E));
        r.a(this.d, paramView, this.E, (Bundle)localObject);
        return;
      }
    } while (paramView != this.e);
    a();
  }
  
  public void registRequestListener(h paramh)
  {
    this.a.registRequestListener(paramh);
  }
  
  public void removeRequest(h paramh)
  {
    this.a.removeRequest(paramh);
  }
  
  public void sendRequest(h paramh)
  {
    this.a.sendRequest(paramh);
  }
  
  public void setAutoRequest(h paramh)
  {
    this.a.setAutoRequest(paramh);
  }
  
  public void setAutoRequestPeriod(long paramLong)
  {
    this.a.setAutoRequestPeriod(paramLong);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\IndexBottomWidget.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */