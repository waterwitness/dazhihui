package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.a.g;
import com.android.dazhihui.a.u;
import com.android.dazhihui.d.b;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.IRequestAdapterListener;
import com.android.dazhihui.ui.model.RequestAdapter;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.model.stock.Stock2955Vo;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.stock.uv;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.flip.ViewFlow;
import com.android.dazhihui.ui.widget.stockchart.StockChartContainer;
import com.android.dazhihui.ui.widget.stockchart.av;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IndexStockChartBottomWidget
  extends RelativeLayout
  implements View.OnClickListener, i, IRequestAdapterListener
{
  private static final String[] V = { "SH000001", "SZ399001", "SZ399006" };
  private static final String[] W = { "上证指数", "深证成指", "创业板指" };
  private View A;
  private View B;
  private View C;
  private IndexStockChartBottomItem D;
  private IndexStockChartBottomItem E;
  private IndexStockChartBottomItem F;
  private IndexStockChartBottomItem G;
  private ImageView H;
  private LinearLayout I;
  private RelativeLayout J;
  private LinearLayout K;
  private TextView L;
  private TextView M;
  private TextView N;
  private TextView O;
  private TextView P;
  private TextView Q;
  private MinutePriceView R;
  private MinuteTradeVolumeView S;
  private Animation T;
  private Animation U;
  protected RequestAdapter a = new ex(this);
  private int aA;
  private Handler aB = new Handler();
  private boolean aC;
  private u aD;
  private y aE = y.a;
  private uv aF;
  private Runnable aG = new eu(this);
  private ez aH;
  private int aa = 0;
  private Vector<String> ab = new Vector();
  private List<fk> ac = new ArrayList();
  private fj ad = new fj(this, null);
  private com.android.dazhihui.a.b.m ae;
  private com.android.dazhihui.a.b.m af;
  private int ag;
  private int ah = 241;
  private int ai;
  private int[] aj;
  private RelativeLayout ak;
  private TextView al;
  private ListView am;
  private TextView an;
  private int ao;
  private int[][] ap;
  private int aq = Integer.MIN_VALUE;
  private int ar = Integer.MAX_VALUE;
  private int[] as;
  private int at;
  private int au;
  private int[] av;
  private int[] aw;
  private int[] ax;
  private int[] ay;
  private int[] az;
  private final String[] b = { "Level2", "主力筹码追踪", "双突战法", "神奇D信号" };
  private String[] c = { "Level2", "双突战法", "神奇D信号" };
  private int d = this.c.length;
  private int e;
  private int f;
  private int g;
  private Context h;
  private int i = 0;
  private View j;
  private LinearLayout k;
  private ViewFlow l;
  private ImageView m;
  private LinearLayout n;
  private RelativeLayout o;
  private RelativeLayout p;
  private TextView q;
  private TextView r;
  private TextView s;
  private View t;
  private View u;
  private View v;
  private View w;
  private View x;
  private View y;
  private View z;
  
  public IndexStockChartBottomWidget(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public IndexStockChartBottomWidget(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public IndexStockChartBottomWidget(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private int a(fk paramfk, fi paramfi)
  {
    int i3 = 0;
    int i1;
    switch (ey.a[paramfi.ordinal()])
    {
    default: 
      i1 = 0;
      i2 = i3;
      if (i1 != 0) {
        if (paramfk.f != 0) {
          break label101;
        }
      }
      break;
    }
    label101:
    for (int i2 = i3;; i2 = i1 - paramfk.f)
    {
      if (i2 != 0) {
        break label112;
      }
      return -8616044;
      i1 = paramfk.e;
      break;
      i1 = paramfk.h;
      break;
      i1 = paramfk.i;
      break;
      i1 = paramfk.g;
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
  
  private fk a(String paramString)
  {
    Object localObject = this.ac.iterator();
    while (((Iterator)localObject).hasNext())
    {
      fk localfk = (fk)((Iterator)localObject).next();
      if ((!TextUtils.isEmpty(localfk.a)) && (localfk.a.equals(paramString))) {
        return localfk;
      }
    }
    localObject = new fk(this, null);
    ((fk)localObject).a = paramString;
    this.ac.add(localObject);
    return (fk)localObject;
  }
  
  private String a(fk paramfk)
  {
    if ((paramfk.e == 0) && (paramfk.f == 0)) {
      paramfk = "0000.00";
    }
    String str;
    do
    {
      do
      {
        do
        {
          return paramfk;
          str = b.a(paramfk.e, paramfk.c);
          paramfk = str;
        } while (!str.contains("."));
        paramfk = str;
      } while (str.length() < 8);
      paramfk = str;
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
        this.ag = localq.e();
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
          i3 = b(i9);
          i7 = b(i8);
          i9 = c(i9);
          i8 = c(i8);
          if (i3 > i7) {
            break;
          }
          i3 = i8 - i9 + (i7 - i3) * 60;
          i3 /= i5;
          i2 += 1;
        }
        this.ah = (i2 + 1);
        paramInt = i1;
        if (i1 > this.ah) {
          paramInt = this.ah;
        }
        if ((this.ap != null) && (this.ap.length == this.ah))
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
              if (this.ai == 0) {
                this.aj[paramInt] = paramArrayOfByte[paramInt][3];
              }
              for (;;)
              {
                paramInt += 1;
                break;
                setDataLen(this.ah);
                break label836;
                paramArrayOfByte = (int[][])Array.newInstance(Integer.TYPE, new int[] { paramInt, 4 });
                break label831;
                this.aj[(this.ai - 1 + paramInt)] = paramArrayOfByte[paramInt][3];
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
    } while (this.ap == null);
    if (i1 > 0) {
      if (this.ai == 0)
      {
        System.arraycopy(paramArrayOfByte, 0, this.ap, 0, i1);
        this.ai = i1;
        k();
        break label839;
        label458:
        if (paramInt >= this.ai) {
          break label650;
        }
        this.aw[paramInt] = this.ap[paramInt][0];
        this.av[paramInt] = this.ap[paramInt][2];
        this.ax[paramInt] = this.ap[paramInt][1];
        if (paramInt == 0)
        {
          this.ay[paramInt] = this.ap[paramInt][3];
          label526:
          if (i4 != 1) {
            break label844;
          }
          this.az[paramInt] = this.ap[paramInt][4];
          break label844;
        }
      }
      else
      {
        i2 = paramArrayOfByte[0][0];
        this.au = this.ai;
        paramInt = this.ai - 1;
      }
    }
    for (;;)
    {
      if (paramInt >= 0)
      {
        if (this.ap[paramInt][0] == i2) {
          this.au = paramInt;
        }
      }
      else
      {
        System.arraycopy(paramArrayOfByte, 0, this.ap, this.au, i1);
        k();
        this.ai = (this.au + i1);
        break label839;
        this.ay[paramInt] = (this.aj[paramInt] - this.aj[(paramInt - 1)]);
        break label526;
        label650:
        getMaxAndMinValue();
        this.R.setdecLen(this.aA);
        this.R.setDataAverage(this.av);
        this.R.setData(this.ax);
        this.R.setDataTimes(this.aw);
        this.R.setTradeData(this.ay);
        this.R.setDataCj(this.az);
        this.R.setDetailstag(i4);
        this.R.setLength(this.ai);
        this.S.setData(this.ax);
        this.S.setTradeData(this.ay);
        this.S.setLength(this.ai);
        this.R.postInvalidate();
        this.S.postInvalidate();
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
    this.h = paramContext;
    this.ao = paramContext.getResources().getDimensionPixelSize(2131230829);
    this.e = paramContext.getResources().getColor(2131493563);
    this.f = -14868442;
    this.ab.clear();
    int i1 = 0;
    while (i1 < V.length)
    {
      this.ab.add(V[i1]);
      a(V[i1]);
      i1 += 1;
    }
    this.T = AnimationUtils.loadAnimation(getContext().getApplicationContext(), 2130968610);
    this.U = AnimationUtils.loadAnimation(getContext().getApplicationContext(), 2130968611);
    this.j = new View(this.h);
    this.j.setBackgroundColor(0);
    this.j.setVisibility(8);
    this.j.setOnClickListener(this);
    paramContext = new RelativeLayout.LayoutParams(-1, -1);
    addView(this.j, paramContext);
    this.o = new RelativeLayout(this.h);
    this.o.setId(this.o.hashCode());
    this.o.setBackgroundColor(this.h.getResources().getColor(2131493538));
    this.o.setVisibility(8);
    this.t = new View(this.h);
    this.t.setId(this.t.hashCode());
    this.t.setBackgroundColor(getResources().getColor(2131493548));
    paramContext = new RelativeLayout.LayoutParams(-1, 1);
    paramContext.addRule(10);
    this.o.addView(this.t, paramContext);
    this.p = new RelativeLayout(this.h);
    this.p.setId(this.p.hashCode());
    this.p.setBackgroundColor(0);
    paramContext = new RelativeLayout.LayoutParams(-1, getResources().getDimensionPixelSize(2131230820));
    paramContext.addRule(3, this.t.getId());
    this.o.addView(this.p, paramContext);
    this.q = new TextView(this.h);
    this.q.setId(this.q.hashCode());
    this.q.setTextColor(this.e);
    this.q.setTextSize(14.0F);
    this.q.setText(2131165222);
    this.q.setGravity(17);
    this.q.setOnClickListener(this);
    paramContext = new RelativeLayout.LayoutParams(getResources().getDimensionPixelSize(2131230845), -1);
    paramContext.addRule(9);
    this.p.addView(this.q, paramContext);
    this.r = new TextView(this.h);
    this.r.setId(this.r.hashCode());
    this.r.setTextColor(this.e);
    this.r.setTextSize(14.0F);
    this.r.setText(2131165223);
    this.r.setGravity(17);
    this.r.setOnClickListener(this);
    paramContext = new RelativeLayout.LayoutParams(getResources().getDimensionPixelSize(2131230845), -1);
    paramContext.addRule(1, this.q.getId());
    this.p.addView(this.r, paramContext);
    this.s = new TextView(this.h);
    this.s.setTextColor(this.e);
    this.s.setTextSize(14.0F);
    this.s.setText(2131165224);
    this.s.setGravity(17);
    this.s.setOnClickListener(this);
    paramContext = new RelativeLayout.LayoutParams(getResources().getDimensionPixelSize(2131230845), -1);
    paramContext.addRule(1, this.r.getId());
    this.p.addView(this.s, paramContext);
    this.H = new ImageView(this.h);
    this.H.setImageResource(2130838701);
    this.H.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    this.H.setId(this.H.hashCode());
    this.H.setOnClickListener(this);
    paramContext = new RelativeLayout.LayoutParams(getResources().getDimensionPixelSize(2131230838), -1);
    paramContext.addRule(11);
    this.p.addView(this.H, paramContext);
    this.u = new View(this.h);
    this.u.setId(this.u.hashCode());
    this.u.setBackgroundColor(getResources().getColor(2131493548));
    paramContext = new RelativeLayout.LayoutParams(-1, 1);
    paramContext.addRule(3, this.p.getId());
    this.o.addView(this.u, paramContext);
    this.I = new LinearLayout(this.h);
    this.I.setOrientation(0);
    this.I.setOnClickListener(this);
    paramContext = new RelativeLayout.LayoutParams(-1, -1);
    paramContext.addRule(3, this.u.getId());
    this.o.addView(this.I, paramContext);
    this.J = new RelativeLayout(this.h);
    paramContext = new LinearLayout.LayoutParams(0, -1);
    paramContext.weight = 2.0F;
    Object localObject = new MinuteControlView(getContext());
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
    i1 = getResources().getDimensionPixelOffset(2131230829);
    localLayoutParams.setMargins(i1, i1, 0, i1);
    this.J.addView((View)localObject, localLayoutParams);
    this.R = ((MinuteControlView)localObject).c;
    this.S = ((MinuteControlView)localObject).d;
    this.I.addView(this.J, paramContext);
    this.K = new LinearLayout(this.h);
    this.K.setOrientation(1);
    this.K.setPadding(getResources().getDimensionPixelSize(2131230829), 0, 0, 0);
    paramContext = new LinearLayout.LayoutParams(0, -1);
    paramContext.weight = 1.0F;
    this.I.addView(this.K, paramContext);
    this.L = new TextView(this.h);
    this.L.setTextSize(22.0F);
    this.L.setGravity(19);
    paramContext = new LinearLayout.LayoutParams(-1, 0);
    paramContext.weight = 1.5F;
    this.K.addView(this.L, paramContext);
    this.M = new TextView(this.h);
    this.M.setTextSize(13.0F);
    this.M.setGravity(19);
    paramContext = new LinearLayout.LayoutParams(-1, 0);
    paramContext.weight = 1.0F;
    this.K.addView(this.M, paramContext);
    this.N = new TextView(this.h);
    this.N.setTextSize(14.0F);
    this.N.setGravity(19);
    paramContext = new LinearLayout.LayoutParams(-1, 0);
    paramContext.weight = 1.0F;
    this.K.addView(this.N, paramContext);
    this.O = new TextView(this.h);
    this.O.setTextSize(14.0F);
    this.O.setGravity(19);
    paramContext = new LinearLayout.LayoutParams(-1, 0);
    paramContext.weight = 1.0F;
    this.K.addView(this.O, paramContext);
    this.P = new TextView(this.h);
    this.P.setTextSize(14.0F);
    this.P.setGravity(19);
    paramContext = new LinearLayout.LayoutParams(-1, 0);
    paramContext.weight = 1.0F;
    this.K.addView(this.P, paramContext);
    this.Q = new TextView(this.h);
    this.Q.setTextSize(14.0F);
    this.Q.setGravity(19);
    paramContext = new LinearLayout.LayoutParams(-1, 0);
    paramContext.weight = 1.0F;
    this.K.addView(this.Q, paramContext);
    this.k = new LinearLayout(this.h);
    this.k.setOrientation(0);
    this.k.setId(this.k.hashCode());
    this.k.setBackgroundResource(2130838700);
    this.l = new ViewFlow(this.h);
    paramContext = new RelativeLayout(this.h);
    localObject = new RelativeLayout.LayoutParams(-1, -1);
    paramContext.addView(this.l, (ViewGroup.LayoutParams)localObject);
    this.m = new ImageView(this.h);
    this.m.setImageResource(2130838246);
    localObject = new RelativeLayout.LayoutParams(-2, -2);
    ((RelativeLayout.LayoutParams)localObject).addRule(10);
    ((RelativeLayout.LayoutParams)localObject).addRule(14);
    ((RelativeLayout.LayoutParams)localObject).topMargin = this.ao;
    paramContext.addView(this.m, (ViewGroup.LayoutParams)localObject);
    this.ak = new RelativeLayout(this.h);
    localObject = new RelativeLayout.LayoutParams(-1, -1);
    paramContext.addView(this.ak, (ViewGroup.LayoutParams)localObject);
    this.ak.setVisibility(8);
    this.ak.setOnClickListener(this);
    localObject = new RelativeLayout.LayoutParams(-2, -2);
    ((RelativeLayout.LayoutParams)localObject).addRule(13);
    this.al = new TextView(this.h);
    this.al.setId(this.al.hashCode());
    this.al.setGravity(17);
    this.al.setTextSize(15.0F);
    this.al.setTextColor(this.g);
    this.al.setText("VIP决策");
    this.al.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2130838246, 0);
    this.al.setCompoundDrawablePadding(this.ao);
    this.al.setPadding(this.ao, this.ao, this.ao, this.ao);
    this.ak.addView(this.al, (ViewGroup.LayoutParams)localObject);
    this.an = new TextView(this.h);
    this.an.setGravity(17);
    this.an.setPadding(0, 0, 0, this.ao / 2);
    this.an.setTextSize(10.0F);
    this.an.setBackgroundResource(2130838545);
    localObject = new RelativeLayout.LayoutParams(this.ao * 3, this.ao * 3);
    ((RelativeLayout.LayoutParams)localObject).topMargin = getResources().getDimensionPixelOffset(2131230829);
    ((RelativeLayout.LayoutParams)localObject).rightMargin = getResources().getDimensionPixelOffset(2131230829);
    ((RelativeLayout.LayoutParams)localObject).addRule(10);
    ((RelativeLayout.LayoutParams)localObject).addRule(7, this.al.getId());
    this.ak.addView(this.an, (ViewGroup.LayoutParams)localObject);
    localObject = new LinearLayout.LayoutParams(0, -1, 2.0F);
    this.k.addView(paramContext, (ViewGroup.LayoutParams)localObject);
    this.l.setAdapter(this.ad);
    this.l.setOnItemClickListener(new ev(this));
    this.n = new LinearLayout(this.h);
    this.n.setOrientation(0);
    this.n.setBackgroundColor(0);
    i1 = getResources().getDimensionPixelOffset(2131230773);
    this.v = new View(this.h);
    this.v.setBackgroundColor(getResources().getColor(2131493565));
    paramContext = new LinearLayout.LayoutParams(i1 / 2, -1);
    this.n.addView(this.v, paramContext);
    this.z = new View(this.h);
    this.z.setBackgroundColor(getResources().getColor(2131493566));
    paramContext = new LinearLayout.LayoutParams(i1 / 2, -1);
    this.n.addView(this.z, paramContext);
    this.D = new IndexStockChartBottomItem(this.h);
    this.D.setOnClickListener(this);
    this.D.setBackgroundResource(2130837568);
    paramContext = new LinearLayout.LayoutParams(0, -1, 1.0F);
    this.n.addView(this.D, paramContext);
    this.w = new View(this.h);
    this.w.setBackgroundColor(getResources().getColor(2131493565));
    paramContext = new LinearLayout.LayoutParams(i1 / 2, -1);
    this.n.addView(this.w, paramContext);
    this.A = new View(this.h);
    this.A.setBackgroundColor(getResources().getColor(2131493566));
    paramContext = new LinearLayout.LayoutParams(i1 / 2, -1);
    this.n.addView(this.A, paramContext);
    this.E = new IndexStockChartBottomItem(this.h);
    this.E.setOnClickListener(this);
    this.E.setBackgroundResource(2130837568);
    paramContext = new LinearLayout.LayoutParams(0, -1, 1.0F);
    this.n.addView(this.E, paramContext);
    this.x = new View(this.h);
    this.x.setBackgroundColor(getResources().getColor(2131493565));
    paramContext = new LinearLayout.LayoutParams(i1 / 2, -1);
    this.n.addView(this.x, paramContext);
    this.B = new View(this.h);
    this.B.setBackgroundColor(getResources().getColor(2131493566));
    paramContext = new LinearLayout.LayoutParams(i1 / 2, -1);
    this.n.addView(this.B, paramContext);
    this.F = new IndexStockChartBottomItem(this.h);
    this.F.setOnClickListener(this);
    this.F.setBackgroundResource(2130837568);
    paramContext = new LinearLayout.LayoutParams(0, -1, 1.0F);
    this.n.addView(this.F, paramContext);
    this.y = new View(this.h);
    this.y.setBackgroundColor(getResources().getColor(2131493565));
    paramContext = new LinearLayout.LayoutParams(i1 / 2, -1);
    this.n.addView(this.y, paramContext);
    this.C = new View(this.h);
    this.C.setBackgroundColor(getResources().getColor(2131493566));
    paramContext = new LinearLayout.LayoutParams(i1 / 2, -1);
    this.n.addView(this.C, paramContext);
    this.G = new IndexStockChartBottomItem(this.h);
    this.G.setOnClickListener(this);
    this.G.setBackgroundResource(2130837568);
    paramContext = new LinearLayout.LayoutParams(0, -1, 1.0F);
    this.n.addView(this.G, paramContext);
    paramContext = new LinearLayout.LayoutParams(0, -1, 5.0F);
    this.k.addView(this.n, paramContext);
    a(this.i);
    paramContext = new RelativeLayout.LayoutParams(-1, getResources().getDimensionPixelSize(2131230800));
    paramContext.addRule(2, this.k.getId());
    addView(this.o, paramContext);
    this.am = new ListView(this.h);
    this.am.setSelector(new ColorDrawable(getResources().getColor(2131493660)));
    this.am.setDivider(null);
    paramContext = new RelativeLayout.LayoutParams(-1, -2);
    paramContext.addRule(2, this.k.getId());
    addView(this.am, paramContext);
    this.aH = new ez(this, null);
    this.am.setAdapter(this.aH);
    this.am.setVisibility(8);
    paramContext = new RelativeLayout.LayoutParams(-1, getResources().getDimensionPixelSize(2131230835));
    paramContext.addRule(12);
    addView(this.k, paramContext);
    l();
    j();
    this.aD = new ew(this);
    paramContext = this.h;
    localObject = this.h;
    i1 = paramContext.getSharedPreferences("advanceanalysis", 0).getInt("advanceanalysis_new_num", this.d);
    if (i1 > 0)
    {
      this.an.setText(String.valueOf(i1));
      this.an.setVisibility(0);
      return;
    }
    this.an.setVisibility(8);
  }
  
  private int b(int paramInt)
  {
    return paramInt / 100;
  }
  
  private String b(fk paramfk)
  {
    if (paramfk.h == 0) {
      return "0000.00";
    }
    return b.a(paramfk.h, paramfk.c);
  }
  
  private int c(int paramInt)
  {
    return paramInt % 100;
  }
  
  private String c(fk paramfk)
  {
    if (paramfk.i == 0) {
      return "0000.00";
    }
    return b.a(paramfk.i, paramfk.c);
  }
  
  private String d(fk paramfk)
  {
    if (paramfk.g == 0) {
      return "0000.00";
    }
    return b.a(paramfk.g, paramfk.c);
  }
  
  private String e(fk paramfk)
  {
    if (paramfk.f == 0) {
      return "0000.00";
    }
    return b.a(paramfk.f, paramfk.c);
  }
  
  private String f(fk paramfk)
  {
    if ((paramfk.e == 0) && (paramfk.f == 0)) {
      return "--";
    }
    if (paramfk.e > paramfk.f) {
      return "+" + b.b(paramfk.e, paramfk.f, paramfk.c);
    }
    return b.b(paramfk.e, paramfk.f, paramfk.c);
  }
  
  private String g(fk paramfk)
  {
    if ((paramfk.e == 0) && (paramfk.f == 0)) {
      return "--";
    }
    if (paramfk.e > paramfk.f) {
      return "+" + b.b(paramfk.e, paramfk.f);
    }
    return b.b(paramfk.e, paramfk.f);
  }
  
  private void g()
  {
    this.aC = true;
    this.aB.removeCallbacks(this.aG);
    this.aB.post(this.aG);
  }
  
  private void getMaxAndMinValue()
  {
    if (this.ap == null) {
      return;
    }
    int i2 = Integer.MIN_VALUE;
    int i1 = Integer.MAX_VALUE;
    int i5 = 0;
    while (i5 < this.ai)
    {
      int i3 = i2;
      if (this.ap[i5][1] > i2) {
        i3 = this.ap[i5][1];
      }
      int i4 = i1;
      if (this.ap[i5][1] < i1) {
        i4 = this.ap[i5][1];
      }
      i2 = i3;
      if (this.ap[i5][2] > i3) {
        i2 = this.ap[i5][2];
      }
      i1 = i4;
      if (this.ap[i5][2] < i4) {
        i1 = this.ap[i5][2];
      }
      i5 += 1;
    }
    this.aq = Math.max(this.aq, i2);
    this.ar = Math.min(i1, this.ar);
    i2 = Math.max(Math.abs(this.aq - this.at), Math.abs(this.ar - this.at));
    i1 = i2;
    if (i2 == this.at) {
      i1 = 28;
    }
    i2 = this.at;
    if (i2 == 0) {
      this.aq = 2;
    }
    for (this.ar = 0;; this.ar = (i2 - i1 * i2 / 100))
    {
      this.S.setClosePrice(this.at);
      this.R.setClosePrice(this.at);
      this.R.a(this.aq, this.ar);
      return;
      i1 = i1 * 100 / i2 + 1;
      this.aq = (i2 * i1 / 100 + i2);
    }
  }
  
  private void h()
  {
    this.aC = false;
    this.aB.removeCallbacks(this.aG);
  }
  
  private void i()
  {
    x[] arrayOfx = new x[1];
    arrayOfx[0] = new x(2942);
    arrayOfx[0].a(V[this.aa]);
    arrayOfx[0].c(this.ag);
    arrayOfx[0].c("2942-跑马灯-IndexBottomWidget-" + V[this.aa]);
    this.af = new com.android.dazhihui.a.b.m(arrayOfx);
    this.af.a(com.android.dazhihui.a.b.n.d);
    this.af.a(this.a);
    this.af.a(V[this.aa]);
    sendRequest(this.af);
  }
  
  private void j()
  {
    x localx = new x(2955);
    localx.c(106);
    localx.c(0);
    localx.a(this.ab);
    localx.c("2955_106-跑马灯-IndexBottomWidget-" + this.ab);
    this.ae = new com.android.dazhihui.a.b.m(localx, com.android.dazhihui.a.b.n.d);
    registRequestListener(this.ae);
    setAutoRequest(this.ae);
    sendRequest(this.ae);
    this.a.setAutoRequestPeriod(4000L);
  }
  
  private void k()
  {
    int i2 = 1;
    int i1 = i2;
    try
    {
      if (this.ap[0][1] == 0)
      {
        this.ap[0][1] = this.at;
        this.ap[0][2] = this.at;
        i1 = i2;
      }
      if (i1 < this.ap.length - 1)
      {
        if (this.ap[i1] == null) {
          break label367;
        }
        if (this.ap[i1][1] == 0) {
          this.ap[i1][1] = this.ap[(i1 - 1)][1];
        }
        if (this.ap[i1][2] == 0) {
          this.ap[i1][2] = this.ap[(i1 - 1)][2];
        }
        if (this.aj[i1] != 0) {
          break label367;
        }
        this.aj[i1] = this.aj[(i1 - 1)];
      }
    }
    catch (Exception localException1) {}
    for (;;)
    {
      try
      {
        i1 = this.ap.length - 1;
        if (i1 >= 0)
        {
          if (this.ap[i1] == null) {
            break label374;
          }
          if (this.ap[i1][1] == 0) {
            this.ap[i1][1] = this.ap[(i1 + 1)][1];
          }
          if (this.ap[i1][2] == 0) {
            this.ap[i1][2] = this.ap[(i1 + 1)][2];
          }
          if (this.aj[i1] != 0) {
            break label374;
          }
          this.aj[i1] = this.aj[(i1 + 1)];
        }
      }
      catch (Exception localException2)
      {
        i1 = this.ap.length - 1;
      }
      while (i1 > 0)
      {
        try
        {
          if (this.ap[i1][1] == 0) {
            this.ap[i1][1] = this.at;
          }
          if (this.ap[i1][2] == 0) {
            this.ap[i1][2] = this.at;
          }
          this.ap[i1][3] = (this.aj[i1] - this.aj[(i1 - 1)]);
        }
        catch (Exception localException3)
        {
          for (;;) {}
        }
        i1 -= 1;
      }
      this.ap[0][3] = this.ap[0][3];
      return;
      label367:
      i1 += 1;
      break;
      label374:
      i1 -= 1;
    }
  }
  
  private void l()
  {
    this.ag = 0;
    this.ap = ((int[][])null);
    this.ay = null;
    this.at = -1;
    this.au = 0;
    this.ai = 0;
    this.aq = Integer.MIN_VALUE;
    this.ar = Integer.MAX_VALUE;
    this.R.b();
    this.S.a();
    this.R.postInvalidate();
    this.S.postInvalidate();
  }
  
  private void m()
  {
    if (this.am.getVisibility() == 0)
    {
      this.al.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2130838246, 0);
      this.am.startAnimation(this.U);
      this.am.setVisibility(8);
      this.j.setVisibility(8);
    }
  }
  
  private void n()
  {
    o();
    p();
  }
  
  private void o()
  {
    switch (this.aa)
    {
    default: 
      this.q.setBackgroundColor(0);
      this.r.setBackgroundColor(0);
      this.s.setBackgroundColor(0);
      return;
    case 0: 
      this.q.setBackgroundColor(this.f);
      this.r.setBackgroundColor(0);
      this.s.setBackgroundColor(0);
      return;
    case 1: 
      this.q.setBackgroundColor(0);
      this.r.setBackgroundColor(this.f);
      this.s.setBackgroundColor(0);
      return;
    }
    this.q.setBackgroundColor(0);
    this.r.setBackgroundColor(0);
    this.s.setBackgroundColor(this.f);
  }
  
  private void p()
  {
    Object localObject;
    if (this.ac.size() > this.aa)
    {
      localObject = (fk)this.ac.get(this.aa);
      i1 = a((fk)localObject, fi.a);
      this.L.setTextColor(i1);
      this.L.setText(a((fk)localObject));
      this.M.setTextColor(i1);
      this.M.setText(f((fk)localObject) + "  " + g((fk)localObject));
      i1 = a((fk)localObject, fi.b);
      SpannableStringBuilder localSpannableStringBuilder = a("最高   " + b((fk)localObject), "最高", i1, -7829368);
      this.N.setText(localSpannableStringBuilder);
      i1 = a((fk)localObject, fi.c);
      localSpannableStringBuilder = a("最低   " + c((fk)localObject), "最低", i1, -7829368);
      this.O.setText(localSpannableStringBuilder);
      i1 = a((fk)localObject, fi.d);
      localSpannableStringBuilder = a("今开   " + d((fk)localObject), "今开", i1, -7829368);
      this.P.setText(localSpannableStringBuilder);
      if (this.aE != y.b) {
        break label327;
      }
    }
    label327:
    for (int i1 = -10066330;; i1 = -1)
    {
      localObject = a("昨收   " + e((fk)localObject), "昨收", i1, -7829368);
      this.Q.setText((CharSequence)localObject);
      return;
    }
  }
  
  private void setDataLen(int paramInt)
  {
    this.ap = new int[paramInt][];
    this.aj = new int[paramInt];
    this.av = new int[paramInt];
    this.ax = new int[paramInt];
    this.ay = new int[paramInt];
    this.aw = new int[paramInt];
    this.az = new int[paramInt];
    if (this.R != null)
    {
      this.R.set2942TotalPoint(paramInt);
      this.S.set2942TotalPoint(paramInt);
    }
    if (this.S != null) {
      this.S.set2942TotalPoint(paramInt);
    }
  }
  
  public void a()
  {
    if ((this.aF.f().getSwitchType() != av.b) && (getResources().getConfiguration().orientation == 1))
    {
      this.a.startAutoRequestPeriod();
      this.l.a(5000);
      g.a().a(this.aD);
    }
  }
  
  public void a(int paramInt)
  {
    if (this.aF == null) {}
    while (this.aF.u() == null) {
      return;
    }
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
    case 1: 
    case 2: 
      this.D.setText(2131166286);
      this.E.setText(2131166279);
      if ((this.aF != null) && (com.android.dazhihui.ui.a.m.a().b().exitSelfStock(this.aF.u().getCode())))
      {
        this.F.setText(2131166283);
        this.G.setVisibility(0);
        this.G.setText(2131166281);
        if (this.aE != y.b) {
          break label244;
        }
        this.D.setImage(2130838655);
        this.E.setImage(2130838641);
        if ((this.aF == null) || (!com.android.dazhihui.ui.a.m.a().b().exitSelfStock(this.aF.u().getCode()))) {
          break label231;
        }
        this.F.setImage(2130838647);
      }
      for (;;)
      {
        this.G.setImage(2130838639);
        return;
        this.F.setText(2131166284);
        break;
        this.F.setImage(2130838645);
      }
      this.D.setImage(2130838654);
      this.E.setImage(2130838640);
      if ((this.aF != null) && (com.android.dazhihui.ui.a.m.a().b().exitSelfStock(this.aF.u().getCode()))) {
        this.F.setImage(2130838646);
      }
      for (;;)
      {
        this.G.setImage(2130838638);
        return;
        this.F.setImage(2130838644);
      }
    case 3: 
      this.D.setText(2131166287);
      this.E.setText(2131166282);
      if ((this.aF != null) && (com.android.dazhihui.ui.a.m.a().b().exitSelfStock(this.aF.u().getCode())))
      {
        this.F.setText(2131166283);
        this.G.setVisibility(0);
        this.G.setText(2131166280);
        if (this.aE != y.b) {
          break label510;
        }
        this.D.setImage(2130838657);
        this.E.setImage(2130838643);
        if ((this.aF == null) || (!com.android.dazhihui.ui.a.m.a().b().exitSelfStock(this.aF.u().getCode()))) {
          break label497;
        }
        this.F.setImage(2130838647);
      }
      for (;;)
      {
        this.G.setImage(2130838637);
        return;
        this.F.setText(2131166284);
        break;
        this.F.setImage(2130838645);
      }
      this.D.setImage(2130838656);
      this.E.setImage(2130838642);
      if ((this.aF != null) && (com.android.dazhihui.ui.a.m.a().b().exitSelfStock(this.aF.u().getCode()))) {
        this.F.setImage(2130838646);
      }
      for (;;)
      {
        this.G.setImage(2130838636);
        return;
        this.F.setImage(2130838644);
      }
    case 5: 
      label231:
      label244:
      label497:
      label510:
      this.D.setText(2131166287);
      this.E.setText(2131166282);
      this.F.setText(2131166285);
      this.G.setVisibility(0);
      if ((this.aF != null) && (com.android.dazhihui.ui.a.m.a().b().exitSelfStock(this.aF.u().getCode()))) {
        this.G.setText(2131166283);
      }
      while (this.aE == y.b)
      {
        this.D.setImage(2130838657);
        this.E.setImage(2130838643);
        this.F.setImage(2130838651);
        if ((this.aF != null) && (com.android.dazhihui.ui.a.m.a().b().exitSelfStock(this.aF.u().getCode())))
        {
          this.G.setImage(2130838647);
          return;
          this.G.setText(2131166284);
        }
        else
        {
          this.G.setImage(2130838645);
          return;
        }
      }
      this.D.setImage(2130838656);
      this.E.setImage(2130838642);
      this.F.setImage(2130838650);
      if ((this.aF != null) && (com.android.dazhihui.ui.a.m.a().b().exitSelfStock(this.aF.u().getCode())))
      {
        this.G.setImage(2130838646);
        return;
      }
      this.G.setImage(2130838644);
      return;
    }
    this.D.setText(2131166282);
    this.E.setText(2131166285);
    if ((this.aF != null) && (com.android.dazhihui.ui.a.m.a().b().exitSelfStock(this.aF.u().getCode()))) {
      this.F.setText(2131166283);
    }
    for (;;)
    {
      this.G.setVisibility(8);
      if (this.aE != y.b) {
        break label1017;
      }
      this.D.setImage(2130838643);
      this.E.setImage(2130838651);
      if ((this.aF == null) || (!com.android.dazhihui.ui.a.m.a().b().exitSelfStock(this.aF.u().getCode()))) {
        break;
      }
      this.F.setImage(2130838647);
      return;
      this.F.setText(2131166284);
    }
    this.F.setImage(2130838645);
    return;
    label1017:
    this.D.setImage(2130838642);
    this.E.setImage(2130838650);
    if ((this.aF != null) && (com.android.dazhihui.ui.a.m.a().b().exitSelfStock(this.aF.u().getCode())))
    {
      this.F.setImage(2130838646);
      return;
    }
    this.F.setImage(2130838644);
  }
  
  public void a(y paramy)
  {
    if (paramy != null)
    {
      this.aE = paramy;
      switch (ey.b[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
        if (this.k != null) {
          this.k.setBackgroundResource(2130838700);
        }
        if (this.o != null)
        {
          this.o.setBackgroundColor(-13749961);
          this.t.setBackgroundColor(getResources().getColor(2131493548));
          this.u.setBackgroundColor(getResources().getColor(2131493548));
        }
        if (this.ad != null)
        {
          this.ad.a(paramy);
          this.f = -14868442;
          this.e = this.h.getResources().getColor(2131493563);
          o();
          this.q.setTextColor(this.e);
          this.r.setTextColor(this.e);
          this.s.setTextColor(this.e);
          n();
        }
        if (this.R != null) {
          this.R.a(paramy);
        }
        if (this.S != null) {
          this.S.a(paramy);
        }
        if (this.H != null) {
          this.H.setImageResource(2130838701);
        }
        this.g = getResources().getColor(2131493564);
        this.D.setTextColor(this.g);
        this.E.setTextColor(this.g);
        this.F.setTextColor(this.g);
        this.G.setTextColor(this.g);
        a(this.i);
        this.v.setBackgroundColor(getResources().getColor(2131493565));
        this.w.setBackgroundColor(getResources().getColor(2131493565));
        this.x.setBackgroundColor(getResources().getColor(2131493565));
        this.y.setBackgroundColor(getResources().getColor(2131493565));
        this.z.setBackgroundColor(getResources().getColor(2131493566));
        this.A.setBackgroundColor(getResources().getColor(2131493566));
        this.B.setBackgroundColor(getResources().getColor(2131493566));
        this.C.setBackgroundColor(getResources().getColor(2131493566));
        this.al.setTextColor(this.g);
      } while (this.aH == null);
      this.aH.a();
      return;
      if (this.k != null) {
        this.k.setBackgroundResource(2130838785);
      }
      if (this.o != null)
      {
        this.o.setBackgroundColor(-1);
        this.t.setBackgroundColor(getResources().getColor(2131493611));
        this.u.setBackgroundColor(getResources().getColor(2131493611));
      }
      if (this.ad != null)
      {
        this.ad.a(paramy);
        this.f = -3155216;
        this.e = this.h.getResources().getColor(2131493626);
        o();
        this.q.setTextColor(this.e);
        this.r.setTextColor(this.e);
        this.s.setTextColor(this.e);
        n();
      }
      if (this.R != null) {
        this.R.a(paramy);
      }
      if (this.S != null) {
        this.S.a(paramy);
      }
      if (this.H != null) {
        this.H.setImageResource(2130838786);
      }
      this.g = getResources().getColor(2131493627);
      this.D.setTextColor(this.g);
      this.E.setTextColor(this.g);
      this.F.setTextColor(this.g);
      this.G.setTextColor(this.g);
      a(this.i);
      this.v.setBackgroundColor(getResources().getColor(2131493628));
      this.w.setBackgroundColor(getResources().getColor(2131493628));
      this.x.setBackgroundColor(getResources().getColor(2131493628));
      this.y.setBackgroundColor(getResources().getColor(2131493628));
      this.z.setBackgroundColor(getResources().getColor(2131493629));
      this.A.setBackgroundColor(getResources().getColor(2131493629));
      this.B.setBackgroundColor(getResources().getColor(2131493629));
      this.C.setBackgroundColor(getResources().getColor(2131493629));
      this.al.setTextColor(this.g);
    } while (this.aH == null);
    this.aH.a();
  }
  
  public void a(String paramString, int paramInt)
  {
    switch (paramInt)
    {
    case 2: 
    default: 
      return;
    case 1: 
      com.android.dazhihui.d.n.a(paramString, 20305);
      return;
    case 3: 
      com.android.dazhihui.d.n.a(paramString, 20321);
      return;
    }
    com.android.dazhihui.d.n.a(paramString, 20326);
  }
  
  public void b()
  {
    g.a().b(this.aD);
    this.a.stop();
    this.l.a();
    h();
  }
  
  public void b(String paramString, int paramInt)
  {
    com.android.dazhihui.d.n.a(paramString, 1142);
    switch (paramInt)
    {
    default: 
      return;
    case 1: 
      com.android.dazhihui.d.n.a(paramString, 20306);
      return;
    case 2: 
      com.android.dazhihui.d.n.a(paramString, 20315);
      return;
    case 3: 
      com.android.dazhihui.d.n.a(paramString, 20322);
      return;
    }
    com.android.dazhihui.d.n.a(paramString, 20327);
  }
  
  public void c()
  {
    g.a().b(this.aD);
    this.a.destory();
    h();
  }
  
  public void c(String paramString, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 1: 
      com.android.dazhihui.d.n.a(paramString, 20307);
      return;
    case 2: 
      com.android.dazhihui.d.n.a(paramString, 20316);
      return;
    case 3: 
      com.android.dazhihui.d.n.a(paramString, 20323);
      return;
    }
    com.android.dazhihui.d.n.a(paramString, 20328);
  }
  
  public void d()
  {
    if (this.o.getVisibility() == 0)
    {
      this.o.startAnimation(this.U);
      this.m.setImageResource(2130838246);
      this.o.setVisibility(8);
      this.j.setVisibility(8);
      h();
    }
  }
  
  public void d(String paramString, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 1: 
      com.android.dazhihui.d.n.a(paramString, 20308);
      return;
    case 2: 
      com.android.dazhihui.d.n.a(paramString, 20317);
      return;
    case 3: 
      com.android.dazhihui.d.n.a(paramString, 20324);
      return;
    }
    com.android.dazhihui.d.n.a(paramString, 20329);
  }
  
  public void e()
  {
    if (this.aF.f().getSwitchType() == av.b)
    {
      this.l.setVisibility(8);
      this.m.setVisibility(8);
      this.ak.setVisibility(0);
      b();
      return;
    }
    this.l.setVisibility(0);
    this.m.setVisibility(0);
    this.ak.setVisibility(8);
    a();
  }
  
  public void e(String paramString, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 1: 
      com.android.dazhihui.d.n.a(paramString, 20309);
      return;
    case 2: 
      com.android.dazhihui.d.n.a(paramString, 20318);
      return;
    case 3: 
      com.android.dazhihui.d.n.a(paramString, 20325);
      return;
    }
    com.android.dazhihui.d.n.a(paramString, 20330);
  }
  
  public void f()
  {
    if (this.aF == null) {
      return;
    }
    StockVo localStockVo = this.aF.u();
    if (localStockVo != null)
    {
      if (!com.android.dazhihui.d.n.i(localStockVo.getType(), localStockVo.getMarketType())) {
        break label52;
      }
      this.i = 0;
    }
    for (;;)
    {
      a(this.i);
      e();
      return;
      label52:
      if (com.android.dazhihui.d.n.g(localStockVo.getType())) {
        this.i = 1;
      } else if (com.android.dazhihui.d.n.g(localStockVo.getType(), localStockVo.getMarketType())) {
        this.i = 4;
      } else if (com.android.dazhihui.d.n.f(localStockVo.getType(), localStockVo.getMarketType())) {
        this.i = 3;
      } else if (com.android.dazhihui.d.n.k(localStockVo.getType(), localStockVo.getMarketType())) {
        this.i = 2;
      } else if (com.android.dazhihui.d.n.f(localStockVo.getType())) {
        this.i = 5;
      } else {
        this.i = 6;
      }
    }
  }
  
  public int getmTabType()
  {
    return this.i;
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    if (paramj == null) {}
    label4:
    Object localObject2;
    byte[] arrayOfByte;
    do
    {
      do
      {
        break label4;
        for (;;)
        {
          return;
          if ((paramj instanceof com.android.dazhihui.a.b.o))
          {
            paramj = (com.android.dazhihui.a.b.o)paramj;
            localObject2 = paramj.h();
            if (localObject2 == null) {
              break;
            }
            try
            {
              arrayOfByte = ((p)localObject2).b;
              if (arrayOfByte != null)
              {
                localObject1 = new q(arrayOfByte);
                if (((p)localObject2).a == 2955)
                {
                  if (arrayOfByte == null) {
                    continue;
                  }
                  int i2 = ((q)localObject1).e();
                  int i3 = ((q)localObject1).e();
                  ((q)localObject1).e();
                  int i4 = ((q)localObject1).e();
                  if (this.ae != paramh) {
                    continue;
                  }
                  this.as = new int[i4];
                  paramh = new Stock2955Vo();
                  int i1 = 0;
                  while (i1 < i4)
                  {
                    paramh.decode((q)localObject1, i2, i3);
                    paramj = a(paramh.code);
                    paramj.b = paramh.name;
                    paramj.c = paramh.decLen;
                    this.aA = paramj.c;
                    paramj.d = paramh.type;
                    paramj.f = paramh.zshou;
                    this.as[i1] = paramj.f;
                    paramj.g = paramh.kp;
                    paramj.e = paramh.zx;
                    paramj.h = paramh.zg;
                    paramj.i = paramh.zd;
                    paramj.j = paramh.cje;
                    i1 += 1;
                  }
                  this.ad.notifyDataSetChanged();
                  n();
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
      } while (((p)localObject2).a != 2942);
      paramh = (String)paramh.j();
    } while ((paramh == null) || (!paramh.equals(V[this.aa])) || (this.as == null) || (this.aa < 0) || (this.aa >= this.as.length));
    this.at = this.as[this.aa];
    Object localObject1 = this.ac.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (fk)((Iterator)localObject1).next();
      if (((fk)localObject2).a.equals(paramh))
      {
        this.aq = ((fk)localObject2).h;
        this.ar = ((fk)localObject2).i;
      }
    }
    a(this.ag, arrayOfByte, paramj.i());
  }
  
  public void handleTimeout(h paramh) {}
  
  public void netException(h paramh, Exception paramException) {}
  
  public void onClick(View paramView)
  {
    Object localObject;
    if (paramView == this.ak) {
      if (this.am.getVisibility() != 0)
      {
        com.android.dazhihui.d.n.a(this.aF.u().getCode(), 20310);
        this.al.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2130838245, 0);
        this.j.setVisibility(0);
        this.am.startAnimation(this.T);
        this.aH.notifyDataSetChanged();
        this.am.setVisibility(0);
        if (this.an.getVisibility() == 0)
        {
          paramView = this.h;
          localObject = this.h;
          paramView.getSharedPreferences("advanceanalysis", 0).edit().putInt("advanceanalysis_new_num", 0).commit();
          this.an.setVisibility(8);
        }
      }
    }
    label199:
    label240:
    label281:
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            m();
            break;
            if (paramView == this.H)
            {
              d();
              return;
            }
            if (paramView != this.q) {
              break label199;
            }
          } while (this.aa == 0);
          this.aa = 0;
          n();
          l();
          g();
          this.ad.notifyDataSetChanged();
          return;
          if (paramView != this.r) {
            break label240;
          }
        } while (this.aa == 1);
        this.aa = 1;
        n();
        l();
        g();
        this.ad.notifyDataSetChanged();
        return;
        if (paramView != this.s) {
          break label281;
        }
      } while (this.aa == 2);
      this.aa = 2;
      n();
      l();
      g();
      this.ad.notifyDataSetChanged();
      return;
      if (paramView == this.I)
      {
        paramView = new Vector();
        int i1 = 0;
        while (i1 < this.ac.size())
        {
          localObject = (fk)this.ac.get(i1);
          paramView.add(new StockVo(((fk)localObject).b, ((fk)localObject).a, ((fk)localObject).d, false));
          i1 += 1;
        }
        localObject = new Bundle();
        ((Bundle)localObject).putParcelable("stock_vo", (Parcelable)paramView.get(this.aa));
        r.a(this.h, paramView, this.aa, (Bundle)localObject);
        return;
      }
      if (paramView == this.j)
      {
        d();
        m();
        return;
      }
      if (paramView == this.D)
      {
        switch (this.i)
        {
        }
        for (;;)
        {
          d();
          m();
          return;
          if (this.aF != null)
          {
            b(this.aF.u().getCode(), this.aF.y());
            com.android.dazhihui.d.n.a(this.aF.u().getCode(), 1142);
            this.aF.b(paramView);
            continue;
            if (this.aF != null)
            {
              b(this.aF.u().getCode(), this.aF.y());
              com.android.dazhihui.d.n.a(this.aF.u().getCode(), 1142);
              com.android.dazhihui.ui.delegate.b.o.a(this.aF.getActivity());
              continue;
              if (this.aF != null)
              {
                this.aF.g();
                continue;
                if (this.aF != null)
                {
                  this.aF.refresh();
                  continue;
                  if (this.aF != null)
                  {
                    this.aF.g();
                    continue;
                    if (this.aF != null) {
                      this.aF.refresh();
                    }
                  }
                }
              }
            }
          }
        }
      }
      if (paramView == this.E)
      {
        switch (this.i)
        {
        }
        for (;;)
        {
          d();
          m();
          return;
          if (this.aF != null)
          {
            this.aF.h();
            continue;
            if (this.aF != null)
            {
              com.android.dazhihui.d.n.a("", 20230);
              this.aF.refresh();
              continue;
              if (this.aF != null)
              {
                this.aF.i();
                continue;
                if (this.aF != null)
                {
                  com.android.dazhihui.d.n.a("", 20230);
                  this.aF.refresh();
                  continue;
                  if (this.aF != null) {
                    this.aF.i();
                  }
                }
              }
            }
          }
        }
      }
      if (paramView == this.F)
      {
        switch (this.i)
        {
        }
        for (;;)
        {
          d();
          m();
          return;
          if (this.aF != null)
          {
            this.aF.b();
            a(this.i);
            continue;
            if (this.aF != null)
            {
              this.aF.b();
              a(this.i);
              continue;
              if (this.aF != null)
              {
                this.aF.b();
                a(this.i);
                continue;
                if (this.aF != null)
                {
                  this.aF.i();
                  continue;
                  if (this.aF != null)
                  {
                    this.aF.b();
                    a(this.i);
                  }
                }
              }
            }
          }
        }
      }
    } while (paramView != this.G);
    switch (this.i)
    {
    }
    for (;;)
    {
      d();
      m();
      return;
      if (this.aF != null)
      {
        this.aF.c(paramView);
        continue;
        if (this.aF != null)
        {
          this.aF.f().h();
          continue;
          if (this.aF != null)
          {
            this.aF.b();
            a(this.i);
          }
        }
      }
    }
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
  
  public void setHolder(uv paramuv)
  {
    this.aF = paramuv;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\IndexStockChartBottomWidget.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */