package com.android.dazhihui.ui.widget.stockchart;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
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
import com.android.dazhihui.d.b;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.stock.klineindicator.SettingKlineIndicator;
import com.android.dazhihui.ui.screen.stock.uv;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.adv.AdvertView;
import com.android.dazhihui.ui.widget.dzhrefresh.LoadAndRefreshView;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KChartContainer
  extends LoadAndRefreshView
  implements View.OnClickListener, View.OnLongClickListener
{
  private TextView A;
  private TextView B;
  private TextView C;
  private TextView D;
  private TextView E;
  private KChartDDEView F;
  private KChartMoveLineView G;
  private t H;
  private StockCostView I;
  private String[] J = null;
  private String[] K = null;
  private StockChartContainer L;
  private StockVo M;
  private int N;
  private int O;
  private int P;
  private int Q;
  private int R;
  private int S;
  private int T;
  private int U = 0;
  private int[] V = { 5, 10 };
  private int[] W = { 5, 10, 20, 30 };
  private PopupWindow aA;
  private int aB;
  private ImageView aC;
  private ImageView aD;
  private ImageView aE;
  private RelativeLayout aF;
  private RelativeLayout aG;
  private LinearLayout aH;
  private LinearLayout aI;
  private String[] aJ = { "前复权", "后复权", "除权" };
  private TextView aK;
  private TextView aL;
  private SimpleDateFormat aM = new SimpleDateFormat("yyyyMMdd");
  private DateFormat aN = new SimpleDateFormat("yyyy/MM/dd");
  private TextView aO;
  private int aP = -1889114522;
  private int aQ = -15657958;
  private int aR;
  private int aS;
  private int aT;
  private int aU;
  private int aV;
  private final int aW = 0;
  private final int aX = 1;
  private Handler aY = new i(this);
  private Runnable aZ = new j(this);
  private int[] aa = { -1, -409087, -65281, -16711936, -12686651, -3770608 };
  private int ab = -1369560;
  private int ac = -11753174;
  private int ad = -1369560;
  private int ae = -11753174;
  private int af = -65536;
  private int ag = -1;
  private int ah = -5395027;
  private int ai = 2130838628;
  private int aj = 2130838118;
  private int ak = 2130838119;
  private int al = -11907497;
  private int am = 2130838247;
  private int an = -1291845632;
  private long[][] ao;
  private long[][] ap;
  private int[][] aq;
  private int[][] ar;
  private int[][] as;
  private int[][] at;
  private int[][] au;
  private int[] av;
  private int[][] aw;
  private int[][] ax;
  private int ay = -1;
  private m az = m.a;
  private Runnable ba = new k(this);
  private Runnable bb = new l(this);
  private final int bc = 1000;
  private int[][] bd;
  public AdvertView f;
  AlertDialog g = null;
  boolean h = false;
  boolean i;
  private int j = -5395027;
  private int k;
  private int l;
  private Context m;
  private ScrollView n;
  private LinearLayout o;
  private KChartContentLayout p;
  private RelativeLayout q;
  private FrameLayout r;
  private FrameLayout s;
  private KChartLineView t;
  private KChartAverageView u;
  private TextView v;
  private p w;
  private FrameLayout x;
  private KChartParamView y;
  private KChartParamView z;
  
  public KChartContainer(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public KChartContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  private void A()
  {
    this.O = this.N;
    int i1 = getWidth();
    int i2 = this.l;
    int i3 = this.k;
    int i4 = this.P;
    this.P = ((i1 - i2 - i3) / this.O);
    if (i4 != this.P)
    {
      B();
      d(false);
    }
  }
  
  private void B()
  {
    this.M = this.L.getDataModel();
    if (this.M != null)
    {
      this.M.getKLineOffset();
      int[][] arrayOfInt = this.M.getKData();
      if ((arrayOfInt != null) && (arrayOfInt.length > 0)) {
        setKLineOffset(Math.max(0, arrayOfInt.length - this.P));
      }
    }
  }
  
  private void C()
  {
    if (this.M == null) {
      return;
    }
    int i3 = this.M.getKLineOffset();
    Object localObject = this.M.getKData();
    int i1;
    int i2;
    if ((localObject != null) && (localObject.length > 0))
    {
      if (i3 == 0)
      {
        i1 = localObject.length - 1;
        i2 = 0;
      }
      for (;;)
      {
        i2 = localObject[i2][0];
        i1 = localObject[i1][0];
        if (getKLinePeriodValue() > 5) {
          break;
        }
        this.aK.setText(com.android.dazhihui.d.n.a(i2));
        this.aL.setText(com.android.dazhihui.d.n.a(i1));
        return;
        if (i3 > localObject.length - 1) {}
        for (i1 = 0;; i1 = i3)
        {
          if (this.P + i3 <= localObject.length) {
            break label132;
          }
          i3 = localObject.length;
          i2 = i1;
          i1 = i3 - 1;
          break;
        }
        label132:
        int i4 = this.P;
        i2 = i1;
        i1 = i3 + i4 - 1;
      }
    }
    try
    {
      localObject = this.aM.parse(String.valueOf(i2));
      this.aK.setText(this.aN.format((Date)localObject));
      try
      {
        localObject = this.aM.parse(String.valueOf(i1));
        this.aL.setText(this.aN.format((Date)localObject));
        return;
      }
      catch (ParseException localParseException1)
      {
        return;
      }
      this.aK.setText(" ");
      this.aL.setText(" ");
      return;
    }
    catch (ParseException localParseException2)
    {
      for (;;) {}
    }
  }
  
  private void D()
  {
    if (this.L != null) {
      this.M = this.L.getDataModel();
    }
    if (this.M == null) {
      return;
    }
    int i1 = getResources().getDimensionPixelSize(2131230774);
    int[] arrayOfInt = new int[2];
    if (getResources().getConfiguration().orientation == 1)
    {
      if ((com.android.dazhihui.d.n.i(this.M.getType(), com.android.dazhihui.d.n.o(this.M.getCode()))) || (com.android.dazhihui.d.n.m(this.M.getCode())) || (com.android.dazhihui.d.n.g(this.M.getType()))) {
        this.A.setVisibility(0);
      }
      for (this.aB = (i1 * 31);; this.aB = (i1 * 25))
      {
        this.aA.setContentView(this.aG);
        this.C.getLocationOnScreen(arrayOfInt);
        if (arrayOfInt[1] <= this.aB) {
          break;
        }
        this.aD.setVisibility(8);
        this.aE.setVisibility(0);
        this.aA.showAsDropDown(this.C, 0, -this.aB - this.C.getHeight());
        return;
        this.A.setVisibility(8);
      }
      this.aD.setVisibility(0);
      this.aE.setVisibility(8);
      this.aA.showAsDropDown(this.C);
      return;
    }
    if ((com.android.dazhihui.d.n.i(this.M.getType(), com.android.dazhihui.d.n.o(this.M.getCode()))) || (com.android.dazhihui.d.n.m(this.M.getCode())) || (com.android.dazhihui.d.n.g(this.M.getType())))
    {
      this.aB = (i1 * 13);
      this.aA.setContentView(this.aH);
      this.E.getLocationOnScreen(arrayOfInt);
      if (arrayOfInt[1] > this.aB)
      {
        this.aA.showAsDropDown(this.E, 0, -this.aB - this.E.getHeight());
        return;
      }
      this.aA.showAsDropDown(this.E);
      return;
    }
    this.aB = (i1 * 10);
    this.aA.setContentView(this.aI);
    this.E.getLocationOnScreen(arrayOfInt);
    if (arrayOfInt[1] > this.aB)
    {
      this.aA.showAsDropDown(this.E, 0, -this.aB - this.E.getHeight());
      return;
    }
    this.aA.showAsDropDown(this.E);
  }
  
  private void E()
  {
    if (this.G.getVisibility() == 0)
    {
      if ((this.M != null) && (d.a().d()) && (getKLinePeriod().a() == 7))
      {
        this.aY.removeMessages(1);
        Message localMessage = new Message();
        localMessage.what = 1;
        int i1 = this.M.getKData().length - 1;
        if (this.ay != -1) {
          i1 = this.ay + this.M.getKLineOffset();
        }
        int[][] arrayOfInt = this.M.getKData();
        int i2 = i1;
        if (i1 > arrayOfInt.length - 1) {
          i2 = arrayOfInt.length - 1;
        }
        localMessage.arg1 = arrayOfInt[i2][0];
        this.aY.sendMessageDelayed(localMessage, 1000L);
      }
      this.G.invalidate();
      m();
      if (this.ay >= this.P / 2 + 3) {
        break label194;
      }
      if (this.i)
      {
        ((FrameLayout.LayoutParams)this.I.getLayoutParams()).gravity = 5;
        this.i = false;
      }
    }
    label194:
    while (this.i) {
      return;
    }
    ((FrameLayout.LayoutParams)this.I.getLayoutParams()).gravity = 3;
    this.i = true;
  }
  
  private void F()
  {
    this.W = d.a().A();
    this.M = this.L.getDataModel();
    int[][] arrayOfInt = this.M.getKData();
    int i1 = arrayOfInt.length;
    int i2 = this.W.length;
    this.ao = ((long[][])Array.newInstance(Long.TYPE, new int[] { i1, i2 }));
    i1 = 0;
    long l1;
    long l2;
    while (i1 < this.W.length)
    {
      i2 = 0;
      l1 = 0L;
      while (i2 < arrayOfInt.length)
      {
        l2 = l1;
        if (i2 >= this.W[i1]) {
          l2 = l1 - arrayOfInt[(i2 - this.W[i1])][4];
        }
        l1 = l2 + arrayOfInt[i2][4];
        if (i2 >= this.W[i1] - 1) {
          this.ao[i2][i1] = (10L * l1 / Math.min(i2 + 1, this.W[i1]));
        }
        i2 += 1;
      }
      i1 += 1;
    }
    this.V = d.a().i();
    i1 = arrayOfInt.length;
    i2 = this.V.length;
    this.ap = ((long[][])Array.newInstance(Long.TYPE, new int[] { i1, i2 }));
    long[] arrayOfLong = this.M.getKVolData();
    i1 = 0;
    while (i1 < this.V.length)
    {
      i2 = 0;
      l1 = 0L;
      while (i2 < arrayOfInt.length)
      {
        l2 = l1;
        if (i2 >= this.V[i1]) {
          l2 = l1 - arrayOfLong[(i2 - this.V[i1])];
        }
        l1 = l2 + arrayOfLong[i2];
        if (i2 >= this.V[i1] - 1) {
          this.ap[i2][i1] = (l1 / Math.min(i2 + 1, this.V[i1]));
        }
        i2 += 1;
      }
      i1 += 1;
    }
  }
  
  private void G()
  {
    int[] arrayOfInt = d.a().w();
    this.M = this.L.getDataModel();
    int[][] arrayOfInt1 = this.M.getKData();
    int i3 = arrayOfInt[0];
    int i5 = arrayOfInt[1];
    int i1 = arrayOfInt1.length;
    this.aq = ((int[][])Array.newInstance(Integer.TYPE, new int[] { i1, 3 }));
    i1 = 0;
    while (i1 < i3)
    {
      this.aq[i1][0] = 0;
      this.aq[i1][1] = 0;
      this.aq[i1][2] = 0;
      i1 += 1;
    }
    i1 = i3;
    if (i1 < arrayOfInt1.length)
    {
      double d1 = 0.0D;
      int i2 = i1 - i3 + 1;
      while (i2 <= i1)
      {
        d1 += arrayOfInt1[i2][4];
        i2 += 1;
      }
      double d2 = (int)(10.0D * d1 / i3);
      d1 = 0.0D;
      i2 = i1 - i3 + 1;
      while (i2 <= i1)
      {
        d1 += (arrayOfInt1[i2][4] * 10 - d2) * (arrayOfInt1[i2][4] * 10 - d2);
        i2 += 1;
      }
      label247:
      int i4;
      if (d1 > 0.0D)
      {
        i2 = 1;
        i4 = (int)Math.sqrt(Math.abs(d1) * 100.0D / i3);
        if (i2 == 0) {
          break label350;
        }
      }
      label350:
      for (i2 = i4;; i2 = i4 * -1)
      {
        i4 = (int)(i5 * i2 / 10 + d2);
        i2 = (int)(d2 - i2 * i5 / 10);
        this.aq[i1][0] = ((int)d2);
        this.aq[i1][1] = i4;
        this.aq[i1][2] = i2;
        i1 += 1;
        break;
        i2 = 0;
        break label247;
      }
    }
  }
  
  private void H()
  {
    int[] arrayOfInt = d.a().u();
    this.M = this.L.getDataModel();
    int[][] arrayOfInt1 = this.M.getKData();
    int i7 = arrayOfInt[0];
    int i8 = arrayOfInt[1];
    int i1 = arrayOfInt1.length;
    this.aw = ((int[][])Array.newInstance(Integer.TYPE, new int[] { i1, 2 }));
    i1 = 0;
    if (i1 < arrayOfInt1.length)
    {
      if (i1 < i7)
      {
        this.aw[i1][0] = 0;
        label86:
        if (i1 >= i8) {
          break label222;
        }
        this.aw[i1][1] = 0;
      }
      for (;;)
      {
        i1 += 1;
        break;
        int i3 = 100000;
        int i2 = i1 - i7 + 1;
        int i5 = 0;
        int i4;
        int i6;
        while (i2 <= i1)
        {
          i4 = i5;
          if (i5 < arrayOfInt1[i2][2]) {
            i4 = arrayOfInt1[i2][2];
          }
          i6 = i3;
          if (i3 > arrayOfInt1[i2][3]) {
            i6 = arrayOfInt1[i2][3];
          }
          i2 += 1;
          i5 = i4;
          i3 = i6;
        }
        this.aw[i1][0] = ((i5 - arrayOfInt1[i1][4]) * 10000 / (i5 - i3));
        break label86;
        label222:
        i3 = 100000;
        i2 = i1 - i8 + 1;
        i5 = 0;
        while (i2 <= i1)
        {
          i4 = i5;
          if (i5 < arrayOfInt1[i2][2]) {
            i4 = arrayOfInt1[i2][2];
          }
          i6 = i3;
          if (i3 > arrayOfInt1[i2][3]) {
            i6 = arrayOfInt1[i2][3];
          }
          i2 += 1;
          i5 = i4;
          i3 = i6;
        }
        this.aw[i1][1] = ((i5 - arrayOfInt1[i1][4]) * 10000 / (i5 - i3));
      }
    }
  }
  
  private void I()
  {
    int[] arrayOfInt = d.a().y();
    this.M = this.L.getDataModel();
    int[][] arrayOfInt1 = this.M.getKData();
    int i5 = arrayOfInt[0];
    int i6 = arrayOfInt[1];
    int i7 = arrayOfInt[2];
    int i1 = arrayOfInt1.length;
    this.ax = ((int[][])Array.newInstance(Integer.TYPE, new int[] { i1, 2 }));
    i1 = 0;
    if (i1 < arrayOfInt1.length)
    {
      int i2;
      label93:
      int i4;
      label103:
      int i3;
      if (i1 < i5)
      {
        i2 = 0;
        if (i1 >= i6) {
          break label213;
        }
        i4 = 0;
        if (i6 <= i5) {
          break label262;
        }
        i3 = i6;
        label114:
        if (i1 >= i3) {
          break label269;
        }
        i2 = 0;
        label124:
        this.ax[i1][0] = i2;
        if (i1 >= i3 + i7) {
          break label279;
        }
        this.ax[i1][1] = 0;
      }
      for (;;)
      {
        i1 += 1;
        break;
        double d = 0.0D;
        i2 = i1 - i5 + 1;
        while (i2 <= i1)
        {
          d += arrayOfInt1[i2][4];
          i2 += 1;
        }
        i2 = (int)(d / i5);
        break label93;
        label213:
        d = 0.0D;
        i3 = i1 - i6 + 1;
        while (i3 <= i1)
        {
          d += arrayOfInt1[i3][4];
          i3 += 1;
        }
        i4 = (int)(d / i6);
        break label103;
        label262:
        i3 = i5;
        break label114;
        label269:
        i2 -= i4;
        break label124;
        label279:
        d = 0.0D;
        i2 = i1 - i7 + 1;
        while (i2 <= i1)
        {
          d += this.ax[i2][0];
          i2 += 1;
        }
        this.ax[i1][1] = ((int)(d / i7));
      }
    }
  }
  
  private void J()
  {
    Object localObject = d.a().k();
    int i2 = localObject[0];
    int i3 = localObject[1];
    int i4 = localObject[2];
    this.M = this.L.getDataModel();
    localObject = this.M.getKData();
    double[] arrayOfDouble1 = new double[localObject.length];
    double[] arrayOfDouble2 = new double[localObject.length];
    double[] arrayOfDouble3 = new double[localObject.length];
    double[] arrayOfDouble4 = new double[localObject.length];
    double[] arrayOfDouble5 = new double[localObject.length];
    int i1 = localObject.length;
    this.ar = ((int[][])Array.newInstance(Integer.TYPE, new int[] { i1, 5 }));
    this.ar[0][0] = (localObject[0][4] * 10);
    this.ar[0][1] = (localObject[0][4] * 10);
    this.ar[0][2] = (this.ar[0][0] - this.ar[0][1]);
    this.ar[0][3] = this.ar[0][2];
    this.ar[0][4] = (this.ar[0][2] - this.ar[0][3]);
    arrayOfDouble1[0] = this.ar[0][0];
    arrayOfDouble2[0] = this.ar[0][0];
    arrayOfDouble1[0] -= arrayOfDouble2[0];
    arrayOfDouble4[0] = arrayOfDouble3[0];
    arrayOfDouble3[0] -= arrayOfDouble4[0];
    i1 = 1;
    while (i1 < localObject.length)
    {
      arrayOfDouble1[i1] = ((arrayOfDouble1[(i1 - 1)] * (i2 - 1) + localObject[i1][4] * 10 * 2) / (i2 + 1));
      arrayOfDouble2[i1] = ((arrayOfDouble2[(i1 - 1)] * (i3 - 1) + localObject[i1][4] * 10 * 2) / (i3 + 1));
      arrayOfDouble1[i1] -= arrayOfDouble2[i1];
      arrayOfDouble4[i1] = ((arrayOfDouble4[(i1 - 1)] * (i4 - 1) + arrayOfDouble3[i1] * 2.0D) / (i4 + 1));
      arrayOfDouble3[i1] -= arrayOfDouble4[i1];
      this.ar[i1][0] = ((int)arrayOfDouble1[i1]);
      this.ar[i1][1] = ((int)arrayOfDouble2[i1]);
      this.ar[i1][2] = ((int)arrayOfDouble3[i1]);
      this.ar[i1][3] = ((int)arrayOfDouble4[i1]);
      this.ar[i1][4] = ((int)(arrayOfDouble5[i1] * 2.0D));
      i1 += 1;
    }
  }
  
  private void K()
  {
    int[] arrayOfInt = d.a().m();
    this.M = this.L.getDataModel();
    int[][] arrayOfInt1 = this.M.getKData();
    int i2 = 0;
    int i1 = 0;
    int i3 = arrayOfInt1.length;
    this.as = ((int[][])Array.newInstance(Integer.TYPE, new int[] { i3, 3 }));
    this.as[0][0] = 'ᎈ';
    this.as[0][1] = 'ᎈ';
    this.as[0][2] = 'ᎈ';
    int i5 = 1;
    int i6;
    if (i5 < arrayOfInt1.length)
    {
      i6 = 0;
      label106:
      if (i6 < arrayOfInt[0])
      {
        if (i6 != 0) {
          break label372;
        }
        i1 = arrayOfInt1[(i5 - i6)][3];
        i3 = arrayOfInt1[(i5 - i6)][2];
      }
    }
    for (;;)
    {
      int i4 = i1;
      if (i5 - i6 >= 0)
      {
        i2 = i1;
        if (i1 > arrayOfInt1[(i5 - i6)][3]) {
          i2 = arrayOfInt1[(i5 - i6)][3];
        }
        i4 = i2;
        if (i3 < arrayOfInt1[(i5 - i6)][2]) {
          i3 = arrayOfInt1[(i5 - i6)][2];
        }
      }
      for (i1 = i2;; i1 = i4)
      {
        i6 += 1;
        i2 = i1;
        i1 = i3;
        break label106;
        i6 = arrayOfInt1[i5][4];
        i4 = i1 - i2;
        i3 = i4;
        if (i4 == 0) {
          i3 = 1;
        }
        i3 = ((int)((i6 - i2) * 10000.0D / i3) + this.as[(i5 - 1)][0] * (arrayOfInt[1] - 1)) / arrayOfInt[1];
        i4 = (this.as[(i5 - 1)][1] * (arrayOfInt[2] - 1) + i3) / arrayOfInt[2];
        this.as[i5][0] = i3;
        this.as[i5][1] = i4;
        this.as[i5][2] = (i3 * 3 - i4 * 2);
        i5 += 1;
        break;
        return;
      }
      label372:
      i3 = i1;
      i1 = i2;
    }
  }
  
  private void L()
  {
    Object localObject = d.a().o();
    this.M = this.L.getDataModel();
    int[][] arrayOfInt = this.M.getKData();
    double d1 = 0.0D;
    double d2 = 0.0D;
    int i4 = localObject[0];
    int i5 = localObject[1];
    int i6 = localObject[2];
    int i1 = arrayOfInt.length;
    this.at = ((int[][])Array.newInstance(Integer.TYPE, new int[] { i1, 3 }));
    localObject = new double[arrayOfInt.length];
    double[] arrayOfDouble1 = new double[arrayOfInt.length];
    double[] arrayOfDouble2 = new double[arrayOfInt.length];
    double[] arrayOfDouble3 = new double[arrayOfInt.length];
    double[] arrayOfDouble4 = new double[arrayOfInt.length];
    double[] arrayOfDouble5 = new double[arrayOfInt.length];
    i1 = 1;
    if (i1 < arrayOfInt.length)
    {
      int i3 = arrayOfInt[i1][4] - arrayOfInt[(i1 - 1)][4];
      label163:
      int i2;
      if (i3 > 0)
      {
        d1 += i3;
        if (i3 <= 0) {
          break label254;
        }
        i2 = i3;
        label172:
        i3 = Math.abs(i3);
        if (i1 >= i4) {
          break label260;
        }
        localObject[i1] = 0.0D;
        arrayOfDouble2[i1] = 0.0D;
        label198:
        if (i1 >= i5) {
          break label350;
        }
        arrayOfDouble1[i1] = 0.0D;
        arrayOfDouble3[i1] = 0.0D;
        label217:
        if (i1 >= i6) {
          break label440;
        }
        arrayOfDouble4[i1] = 0.0D;
        arrayOfDouble5[i1] = 0.0D;
      }
      for (;;)
      {
        i1 += 1;
        break;
        d2 += i3;
        break label163;
        label254:
        i2 = 0;
        break label172;
        label260:
        if (i1 == i4)
        {
          localObject[i1] = (d1 / i4);
          arrayOfDouble2[i1] = ((Math.abs(d2) + d1) / i4);
          break label198;
        }
        localObject[i1] = ((i2 + (i4 - 1) * localObject[(i1 - 1)]) / i4);
        arrayOfDouble2[i1] = ((i3 + (i4 - 1) * arrayOfDouble2[(i1 - 1)]) / i4);
        break label198;
        label350:
        if (i1 == i5)
        {
          arrayOfDouble1[i1] = (d1 / i5);
          arrayOfDouble3[i1] = ((Math.abs(d2) + d1) / i5);
          break label217;
        }
        arrayOfDouble1[i1] = ((i2 + (i5 - 1) * arrayOfDouble1[(i1 - 1)]) / i5);
        arrayOfDouble3[i1] = ((i3 + (i5 - 1) * arrayOfDouble3[(i1 - 1)]) / i5);
        break label217;
        label440:
        if (i1 == i6)
        {
          arrayOfDouble4[i1] = (d1 / i6);
          arrayOfDouble5[i1] = ((Math.abs(d2) + d1) / i6);
        }
        else
        {
          arrayOfDouble4[i1] = ((i2 + (i6 - 1) * arrayOfDouble4[(i1 - 1)]) / i6);
          arrayOfDouble5[i1] = ((i3 + (i6 - 1) * arrayOfDouble5[(i1 - 1)]) / i6);
        }
      }
    }
    i1 = 1;
    if (i1 < arrayOfInt.length)
    {
      if ((i1 < i4) || (arrayOfDouble2[i1] == 0.0D))
      {
        this.at[i1][0] = 0;
        label568:
        if ((i1 >= i5) && (arrayOfDouble3[i1] != 0.0D)) {
          break label662;
        }
        this.at[i1][1] = 0;
        label595:
        if ((i1 >= i6) && (arrayOfDouble5[i1] != 0.0D)) {
          break label693;
        }
        this.at[i1][2] = 0;
      }
      for (;;)
      {
        i1 += 1;
        break;
        this.at[i1][0] = a(1000.0D * localObject[i1] / arrayOfDouble2[i1]);
        break label568;
        label662:
        this.at[i1][1] = a(1000.0D * arrayOfDouble1[i1] / arrayOfDouble3[i1]);
        break label595;
        label693:
        this.at[i1][2] = a(1000.0D * arrayOfDouble4[i1] / arrayOfDouble5[i1]);
      }
    }
  }
  
  private void M()
  {
    int[] arrayOfInt = d.a().q();
    this.M = this.L.getDataModel();
    int[][] arrayOfInt1 = this.M.getKData();
    int i5 = 0;
    int i4 = 0;
    int i3 = 0;
    int i1 = arrayOfInt1.length;
    this.au = ((int[][])Array.newInstance(Integer.TYPE, new int[] { i1, 3 }));
    this.au[0][0] = 0;
    this.au[0][1] = 0;
    this.au[0][2] = 0;
    int i7 = Math.max(Math.max(arrayOfInt[0], arrayOfInt[1]), arrayOfInt[2]);
    i1 = 1;
    if (i1 < arrayOfInt1.length)
    {
      int i8 = arrayOfInt1[i1][4];
      int i6 = 0;
      int i2 = 0;
      for (;;)
      {
        if ((i2 >= i7) || (i1 - i2 <= 0))
        {
          this.au[i1][0] = ((int)(1000.0D * (i8 - i5) / i5));
          this.au[i1][1] = ((int)(1000.0D * (i8 - i4) / i4));
          this.au[i1][2] = ((int)(1000.0D * (i8 - i3) / i3));
          i1 += 1;
          break;
        }
        i6 += arrayOfInt1[(i1 - i2)][4];
        if (i2 < arrayOfInt[0]) {
          i5 = i6 / (i2 + 1);
        }
        if (i2 < arrayOfInt[1]) {
          i4 = i6 / (i2 + 1);
        }
        if (i2 < arrayOfInt[2]) {
          i3 = i6 / (i2 + 1);
        }
        i2 += 1;
      }
    }
  }
  
  private void N()
  {
    int i3 = d.a().s()[0];
    this.M = this.L.getDataModel();
    int[][] arrayOfInt = this.M.getKData();
    double[] arrayOfDouble1 = new double[arrayOfInt.length];
    double[] arrayOfDouble2 = new double[arrayOfInt.length];
    this.av = new int[arrayOfInt.length];
    int i1 = 0;
    while (i1 < arrayOfInt.length)
    {
      arrayOfDouble1[i1] = ((arrayOfInt[i1][2] + arrayOfInt[i1][3] + arrayOfInt[i1][4]) / 3.0D);
      i1 += 1;
    }
    i1 = i3 - 1;
    if (i1 < arrayOfInt.length)
    {
      double d2 = 0.0D;
      int i2 = 0;
      double d1 = 0.0D;
      label129:
      if ((i2 >= i3) || (i1 - i2 < 0))
      {
        arrayOfDouble2[i1] = (d1 / i3);
        i2 = 0;
        d1 = d2;
        label159:
        if ((i2 < i3) && (i1 - i2 >= 0)) {
          break label247;
        }
        d1 /= i3;
        if (d1 == 0.0D) {
          break label276;
        }
        this.av[i1] = a(2000.0D * (arrayOfDouble1[i1] - arrayOfDouble2[i1]) / 3.0D / d1);
      }
      for (;;)
      {
        i1 += 1;
        break;
        d1 += arrayOfDouble1[(i1 - i2)];
        i2 += 1;
        break label129;
        label247:
        d1 += Math.abs(arrayOfDouble1[(i1 - i2)] - arrayOfDouble2[i1]);
        i2 += 1;
        break label159;
        label276:
        this.av[i1] = 0;
      }
    }
  }
  
  private void O()
  {
    this.v.setTextColor(this.j);
    this.v.setBackgroundResource(this.am);
    this.E.setTextColor(this.j);
    this.E.setBackgroundResource(this.am);
    this.C.setTextColor(this.j);
    this.D.setTextColor(this.j);
    this.C.setBackgroundResource(this.am);
    this.aK.setTextColor(this.j);
    this.aL.setTextColor(this.j);
    this.aO.setBackgroundColor(this.aP);
    this.aO.setTextColor(this.aQ);
    b(this.m);
  }
  
  private int a(double paramDouble)
  {
    return new BigDecimal(paramDouble).setScale(0, 4).intValue();
  }
  
  private void a(Context paramContext)
  {
    this.m = paramContext;
    Resources localResources = getResources();
    this.aR = localResources.getDimensionPixelSize(2131230780);
    this.aS = localResources.getDimensionPixelSize(2131230774);
    this.aT = localResources.getDimensionPixelSize(2131230798);
    b(com.android.dazhihui.g.a().b());
    y();
    b(paramContext);
  }
  
  private void a(Context paramContext, String[] paramArrayOfString)
  {
    this.aG = new RelativeLayout(paramContext);
    LinearLayout localLinearLayout = new LinearLayout(paramContext);
    localLinearLayout.setOrientation(1);
    localLinearLayout.setId(localLinearLayout.hashCode());
    localLinearLayout.setGravity(17);
    localLinearLayout.setBackgroundResource(this.ai);
    int i1 = 0;
    if (i1 < 9)
    {
      TextView localTextView = new TextView(paramContext);
      localTextView.setTextColor(this.ah);
      localTextView.setTextSize(12.0F);
      localTextView.setGravity(17);
      localTextView.setText(paramArrayOfString[i1]);
      localLinearLayout.addView(localTextView, new LinearLayout.LayoutParams(this.aS * 6, this.aS * 3));
      localTextView.setOnClickListener(this);
      if (paramArrayOfString[i1].equals("VOL"))
      {
        localTextView.setTag(Integer.valueOf(536870912));
        this.A = localTextView;
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
    this.B = new TextView(paramContext);
    this.B.setTextColor(this.ah);
    this.B.setTextSize(12.0F);
    this.B.setGravity(17);
    this.B.setText("参数设置");
    paramArrayOfString = new LinearLayout.LayoutParams(this.aS * 6, this.aS * 3);
    localLinearLayout.addView(this.B, paramArrayOfString);
    this.B.setOnClickListener(this);
    this.B.setTag(Integer.valueOf(536870927));
    this.aD = new ImageView(paramContext);
    this.aD.setId(this.aD.hashCode());
    this.aD.setImageResource(this.aj);
    paramArrayOfString = new RelativeLayout.LayoutParams(this.aS * 6, -2);
    paramArrayOfString.addRule(3, this.aD.getId());
    this.aG.addView(localLinearLayout, paramArrayOfString);
    paramArrayOfString = new RelativeLayout.LayoutParams(this.aR, this.aS);
    paramArrayOfString.bottomMargin = (-this.aT);
    paramArrayOfString.leftMargin = (this.aS * 2);
    paramArrayOfString.addRule(10);
    this.aG.addView(this.aD, paramArrayOfString);
    this.aE = new ImageView(paramContext);
    this.aE.setImageResource(this.ak);
    paramContext = new RelativeLayout.LayoutParams(this.aR, this.aS);
    paramContext.addRule(3, localLinearLayout.getId());
    paramContext.topMargin = (-this.aT);
    paramContext.leftMargin = (this.aS * 2);
    this.aG.addView(this.aE, paramContext);
  }
  
  private void b(Context paramContext)
  {
    c(paramContext);
    a(paramContext, d.a().g());
    d(paramContext);
    e(paramContext);
    this.aA = new PopupWindow();
    this.aA.setWidth(-2);
    this.aA.setHeight(-2);
    this.aA.setOutsideTouchable(true);
    this.aA.setBackgroundDrawable(new ColorDrawable(0));
    this.aA.setFocusable(true);
  }
  
  private void b(y paramy)
  {
    if (paramy == y.b)
    {
      this.j = -14540254;
      this.aa[0] = -14540254;
      this.aa[1] = 34816;
      this.aa[2] = -2943766;
      this.aa[3] = -13070532;
      this.aa[4] = -12686651;
      this.aa[5] = -9233261;
      this.ab = -1900544;
      this.ac = -14901175;
      this.af = -14540254;
      this.am = 2130838252;
      this.ag = -12686651;
      this.ad = -1168340;
      this.ae = -14901175;
      this.ah = -14540254;
      this.an = -1275068417;
      this.ai = 2130838629;
      this.aj = 2130838121;
      this.ak = 2130838120;
      this.al = -3618616;
      this.aP = -1882601015;
      this.aQ = -7292952;
      return;
    }
    this.j = -5395027;
    this.aa[0] = -1;
    this.aa[1] = -409087;
    this.aa[2] = -65281;
    this.aa[3] = -16711936;
    this.aa[4] = -12686651;
    this.aa[5] = -3770608;
    this.ab = -1369560;
    this.ac = -11753174;
    this.af = -65536;
    this.am = 2130838247;
    this.ag = -1;
    this.ad = -1369560;
    this.ae = -11753174;
    this.ah = -5395027;
    this.an = -1291845632;
    this.ai = 2130838628;
    this.aj = 2130838118;
    this.ak = 2130838119;
    this.al = -11907497;
    this.aP = -1889114522;
    this.aQ = -15657958;
  }
  
  private void c(Context paramContext)
  {
    this.aF = new RelativeLayout(paramContext);
    this.aC = new ImageView(paramContext);
    this.aC.setId(this.aC.hashCode());
    this.aC.setImageResource(this.aj);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(this.aS * 6, this.aS * 3);
    LinearLayout localLinearLayout = new LinearLayout(paramContext);
    localLinearLayout.setOrientation(1);
    localLinearLayout.setGravity(17);
    localLinearLayout.setBackgroundResource(this.ai);
    int i1 = 0;
    if (i1 < 3)
    {
      TextView localTextView = new TextView(paramContext);
      localTextView.setTextColor(this.ah);
      localTextView.setTextSize(12.0F);
      localTextView.setGravity(17);
      localTextView.setText(this.aJ[i1]);
      localLinearLayout.addView(localTextView, localLayoutParams);
      localTextView.setOnClickListener(this);
      if (i1 == 0) {
        localTextView.setTag(Integer.valueOf(268435456));
      }
      for (;;)
      {
        i1 += 1;
        break;
        if (i1 == 1) {
          localTextView.setTag(Integer.valueOf(268435457));
        } else if (i1 == 2) {
          localTextView.setTag(Integer.valueOf(268435458));
        }
      }
    }
    paramContext = new RelativeLayout.LayoutParams(this.aS * 6, this.aS * 9);
    paramContext.addRule(3, this.aC.getId());
    this.aF.addView(localLinearLayout, paramContext);
    paramContext = new RelativeLayout.LayoutParams(this.aR, this.aS);
    paramContext.addRule(10);
    paramContext.bottomMargin = (-this.aT);
    paramContext.leftMargin = (this.aS * 2);
    this.aF.addView(this.aC, paramContext);
  }
  
  private void d(Context paramContext)
  {
    this.aH = new LinearLayout(paramContext);
    this.aH.setOrientation(1);
    Object localObject1 = new LinearLayout(paramContext);
    ((LinearLayout)localObject1).setOrientation(1);
    ((LinearLayout)localObject1).setGravity(17);
    ((LinearLayout)localObject1).setBackgroundResource(this.ai);
    int i1 = 0;
    while (i1 < 4)
    {
      localObject2 = new LinearLayout(paramContext);
      ((LinearLayout)localObject2).setOrientation(0);
      int i2 = 0;
      int i3;
      if (i2 < 4)
      {
        i3 = i1 * 4 + i2;
        if (i3 <= this.K.length - 1) {}
      }
      else
      {
        ((LinearLayout)localObject1).addView((View)localObject2, new LinearLayout.LayoutParams(this.aS * 5 * 4, this.aS * 3));
        i1 += 1;
        continue;
      }
      TextView localTextView = new TextView(paramContext);
      localTextView.setTextColor(this.ah);
      localTextView.setTextSize(12.0F);
      localTextView.setGravity(17);
      localTextView.setText(this.K[i3]);
      ((LinearLayout)localObject2).addView(localTextView, new LinearLayout.LayoutParams(this.aS * 5, this.aS * 3));
      localTextView.setOnClickListener(this);
      if (i3 == 0) {
        localTextView.setTag(Integer.valueOf(536870912));
      }
      for (;;)
      {
        i2 += 1;
        break;
        if (i3 == 1) {
          localTextView.setTag(Integer.valueOf(536870913));
        } else if (i3 == 2) {
          localTextView.setTag(Integer.valueOf(536870914));
        } else if (i3 == 3) {
          localTextView.setTag(Integer.valueOf(536870915));
        } else if (i3 == 4) {
          localTextView.setTag(Integer.valueOf(536870916));
        } else if (i3 == 5) {
          localTextView.setTag(Integer.valueOf(536870917));
        } else if (i3 == 6) {
          localTextView.setTag(Integer.valueOf(536870918));
        } else if (i3 == 7) {
          localTextView.setTag(Integer.valueOf(536870919));
        } else if (i3 == 8) {
          localTextView.setTag(Integer.valueOf(536870920));
        } else if (i3 == 9) {
          localTextView.setTag(Integer.valueOf(536870921));
        } else if (i3 == 10) {
          localTextView.setTag(Integer.valueOf(536870922));
        } else if (i3 == 11) {
          localTextView.setTag(Integer.valueOf(536870923));
        } else if (i3 == 12) {
          localTextView.setTag(Integer.valueOf(536870924));
        } else if (i3 == 13) {
          localTextView.setTag(Integer.valueOf(536870925));
        }
      }
    }
    Object localObject2 = new LinearLayout.LayoutParams(this.aS * 5 * 4, this.aS * 3 * 4);
    this.aH.addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
    paramContext = new ImageView(paramContext);
    paramContext.setImageResource(this.ak);
    localObject1 = new LinearLayout.LayoutParams(this.aR, this.aS);
    ((LinearLayout.LayoutParams)localObject1).topMargin = (-this.aT);
    ((LinearLayout.LayoutParams)localObject1).leftMargin = (this.aS * 2);
    this.aH.addView(paramContext, (ViewGroup.LayoutParams)localObject1);
  }
  
  private void e(Context paramContext)
  {
    this.aI = new LinearLayout(paramContext);
    this.aI.setOrientation(1);
    Object localObject1 = new LinearLayout(paramContext);
    ((LinearLayout)localObject1).setOrientation(1);
    ((LinearLayout)localObject1).setGravity(17);
    ((LinearLayout)localObject1).setBackgroundResource(this.ai);
    int i1 = 0;
    while (i1 < 3)
    {
      localObject2 = new LinearLayout(paramContext);
      ((LinearLayout)localObject2).setOrientation(0);
      int i2 = 0;
      int i3;
      if (i2 < 4)
      {
        i3 = i1 * 4 + i2;
        if (i3 <= this.J.length - 2) {}
      }
      else
      {
        ((LinearLayout)localObject1).addView((View)localObject2, new LinearLayout.LayoutParams(this.aS * 5 * 4, this.aS * 3));
        i1 += 1;
        continue;
      }
      TextView localTextView = new TextView(paramContext);
      localTextView.setTextColor(this.ah);
      localTextView.setTextSize(12.0F);
      localTextView.setGravity(17);
      localTextView.setText(this.J[i3]);
      ((LinearLayout)localObject2).addView(localTextView, new LinearLayout.LayoutParams(this.aS * 5, this.aS * 3));
      localTextView.setOnClickListener(this);
      if (i3 == 0) {
        localTextView.setTag(Integer.valueOf(536870912));
      }
      for (;;)
      {
        i2 += 1;
        break;
        if (i3 == 1) {
          localTextView.setTag(Integer.valueOf(536870913));
        } else if (i3 == 2) {
          localTextView.setTag(Integer.valueOf(536870914));
        } else if (i3 == 3) {
          localTextView.setTag(Integer.valueOf(536870915));
        } else if (i3 == 4) {
          localTextView.setTag(Integer.valueOf(536870916));
        } else if (i3 == 5) {
          localTextView.setTag(Integer.valueOf(536870917));
        } else if (i3 == 6) {
          localTextView.setTag(Integer.valueOf(536870918));
        } else if (i3 == 7) {
          localTextView.setTag(Integer.valueOf(536870919));
        } else if (i3 == 8) {
          localTextView.setTag(Integer.valueOf(536870920));
        }
      }
    }
    Object localObject2 = new LinearLayout.LayoutParams(this.aS * 5 * 4, this.aS * 3 * 3);
    this.aI.addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
    paramContext = new ImageView(paramContext);
    paramContext.setImageResource(this.ak);
    localObject1 = new LinearLayout.LayoutParams(this.aR, this.aS);
    ((LinearLayout.LayoutParams)localObject1).topMargin = (-this.aT);
    ((LinearLayout.LayoutParams)localObject1).leftMargin = (this.aS * 2);
    this.aI.addView(paramContext, (ViewGroup.LayoutParams)localObject1);
  }
  
  private boolean h(int paramInt)
  {
    com.android.dazhihui.d.n.a(this.M.getCode(), 1061);
    if ((paramInt == 7) && (d.a().f())) {
      d.a().e(false);
    }
    Object localObject;
    if (getResources().getConfiguration().orientation == 1)
    {
      if (paramInt != 15)
      {
        this.U = paramInt;
        this.C.setText(this.J[paramInt]);
        this.D.setText(a(this.J[paramInt]));
        if ((com.android.dazhihui.d.n.i(this.M.getType(), com.android.dazhihui.d.n.o(this.M.getCode()))) || (com.android.dazhihui.d.n.m(this.M.getCode())) || (com.android.dazhihui.d.n.g(this.M.getType())))
        {
          this.F.setVisibility(0);
          this.x.setVisibility(0);
          v();
          this.y.invalidate();
          this.x.invalidate();
        }
      }
      for (;;)
      {
        this.t.invalidate();
        return true;
        this.z.setVisibility(0);
        break;
        localObject = new Intent();
        ((Intent)localObject).setClass(this.L.getHolder().getActivity(), SettingKlineIndicator.class);
        this.L.getHolder().getActivity().startActivity((Intent)localObject);
      }
    }
    this.E.setText(this.K[paramInt]);
    this.w.setParamSettingData(a(this.K[paramInt]));
    if (paramInt < 9)
    {
      if ((paramInt != 0) || (com.android.dazhihui.d.n.i(this.M.getType(), com.android.dazhihui.d.n.o(this.M.getCode()))) || (com.android.dazhihui.d.n.m(this.M.getCode())) || (com.android.dazhihui.d.n.g(this.M.getType())))
      {
        this.U = paramInt;
        this.x.setVisibility(0);
        this.z.setVisibility(8);
      }
      for (;;)
      {
        this.F.setVisibility(8);
        v();
        this.y.invalidate();
        this.x.invalidate();
        break;
        this.x.setVisibility(8);
        this.z.setVisibility(0);
      }
    }
    if ((com.android.dazhihui.d.n.i(this.M.getType(), com.android.dazhihui.d.n.o(this.M.getCode()))) || (com.android.dazhihui.d.n.m(this.M.getCode())) || (com.android.dazhihui.d.n.g(this.M.getType())))
    {
      this.U = 0;
      label452:
      this.U = 0;
      localObject = n.a;
      switch (paramInt - 9)
      {
      }
    }
    for (;;)
    {
      if ((!b((n)localObject)) && (this.L != null)) {
        this.L.a((n)localObject);
      }
      this.F.setVisibility(0);
      this.x.setVisibility(8);
      if (this.w.getKLinePeriodValue() != 7) {
        localObject = n.f;
      }
      this.F.setDDEModel((n)localObject);
      this.F.invalidate();
      break;
      this.U = 1;
      break label452;
      localObject = n.a;
      continue;
      localObject = n.b;
      continue;
      localObject = n.c;
      continue;
      localObject = n.d;
      continue;
      localObject = n.e;
    }
  }
  
  private void y()
  {
    Object localObject1 = getResources();
    this.N = ((Resources)localObject1).getDimensionPixelSize(2131230829);
    this.Q = ((Resources)localObject1).getDimensionPixelSize(2131230799);
    this.S = ((Resources)localObject1).getDimensionPixelSize(2131230829);
    this.T = ((Resources)localObject1).getDimensionPixelSize(2131230773);
    this.O = this.N;
    this.J = ((Resources)localObject1).getStringArray(2131361878);
    this.K = ((Resources)localObject1).getStringArray(2131361879);
    int i1 = ((Resources)localObject1).getDimensionPixelSize(2131230798);
    this.R = ((Resources)localObject1).getDimensionPixelSize(2131230806);
    this.k = ((Resources)localObject1).getDimensionPixelSize(2131230827);
    this.o = new LinearLayout(this.m);
    this.o.setOrientation(1);
    this.r = new FrameLayout(this.m);
    localObject1 = new LinearLayout.LayoutParams(-1, -2);
    this.o.addView(this.r, (ViewGroup.LayoutParams)localObject1);
    this.p = new KChartContentLayout(this.m);
    this.p.setOrientation(1);
    localObject1 = new FrameLayout.LayoutParams(-1, -2);
    this.r.addView(this.p, (ViewGroup.LayoutParams)localObject1);
    this.s = new FrameLayout(this.m);
    localObject1 = new LinearLayout.LayoutParams(-1, 0, 3.0F);
    this.p.addView(this.s, (ViewGroup.LayoutParams)localObject1);
    this.p.setHolder(this);
    this.t = new KChartLineView(this.m);
    this.t.setAverageViewHeight(this.R);
    this.t.setRightDistance(this.k);
    localObject1 = new FrameLayout.LayoutParams(-1, -1);
    this.s.addView(this.t, (ViewGroup.LayoutParams)localObject1);
    this.t.setOnClickListener(this);
    this.t.setOnLongClickListener(this);
    this.t.setPadding(this.l, 0, 0, 0);
    this.t.setHolder(this);
    this.u = new KChartAverageView(this.m);
    localObject1 = new FrameLayout.LayoutParams(-1, this.R);
    this.s.addView(this.u, (ViewGroup.LayoutParams)localObject1);
    this.u.setHolder(this);
    this.v = new TextView(this.m);
    this.v.setGravity(17);
    this.v.setBackgroundResource(this.am);
    this.v.setTextColor(this.j);
    this.v.setTextSize(12.0F);
    this.v.setText(2131165462);
    this.v.setOnClickListener(this);
    localObject1 = new FrameLayout.LayoutParams(this.S * 9, this.R);
    ((FrameLayout.LayoutParams)localObject1).topMargin = this.R;
    ((FrameLayout.LayoutParams)localObject1).leftMargin = i1;
    this.s.addView(this.v, (ViewGroup.LayoutParams)localObject1);
    localObject1 = new FrameLayout(this.m);
    Object localObject2 = new LinearLayout.LayoutParams(-1, this.R);
    this.p.addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
    this.w = new p(this.m);
    localObject2 = new FrameLayout.LayoutParams(-1, -1);
    ((FrameLayout)localObject1).addView(this.w, (ViewGroup.LayoutParams)localObject2);
    this.w.setHolder(this);
    this.E = new TextView(this.m);
    this.E.setGravity(17);
    this.E.setBackgroundResource(this.am);
    this.E.setTextColor(this.j);
    this.E.setTextSize(12.0F);
    this.E.setText(this.K[0]);
    this.E.setOnClickListener(this);
    this.E.setVisibility(8);
    localObject2 = new FrameLayout.LayoutParams(this.S * 9, -1);
    ((FrameLayout.LayoutParams)localObject2).leftMargin = i1;
    ((FrameLayout)localObject1).addView(this.E, (ViewGroup.LayoutParams)localObject2);
    this.z = new KChartParamView(this.m, true);
    this.z.setRightDistance(this.k);
    this.z.setVisibility(8);
    localObject1 = new LinearLayout.LayoutParams(-1, 0, 1.0F);
    this.p.addView(this.z, (ViewGroup.LayoutParams)localObject1);
    this.z.setHolder(this);
    this.z.setPadding(this.l, 0, 0, 0);
    this.x = new FrameLayout(this.m);
    localObject1 = new LinearLayout.LayoutParams(-1, 0, 1.0F);
    this.p.addView(this.x, (ViewGroup.LayoutParams)localObject1);
    this.y = new KChartParamView(this.m);
    this.y.setRightDistance(this.k);
    localObject1 = new FrameLayout.LayoutParams(-1, -1);
    this.x.addView(this.y, (ViewGroup.LayoutParams)localObject1);
    this.y.setHolder(this);
    this.y.setPadding(this.l, 0, 0, 0);
    this.C = new TextView(this.m);
    this.C.setGravity(17);
    this.C.setBackgroundResource(this.am);
    this.C.setTextColor(this.j);
    this.C.setTextSize(12.0F);
    this.C.setText(this.J[0]);
    this.C.setOnClickListener(this);
    localObject1 = new FrameLayout.LayoutParams(this.S * 9, this.R);
    ((FrameLayout.LayoutParams)localObject1).topMargin = i1;
    ((FrameLayout.LayoutParams)localObject1).leftMargin = i1;
    this.x.addView(this.C, (ViewGroup.LayoutParams)localObject1);
    this.D = new TextView(this.m);
    this.D.setTextColor(this.j);
    this.D.setTextSize(14.0F);
    this.D.setText(a(this.J[0]));
    this.D.setPadding(0, i1, 0, i1);
    localObject1 = new FrameLayout.LayoutParams(-2, -2);
    ((FrameLayout.LayoutParams)localObject1).topMargin = i1;
    ((FrameLayout.LayoutParams)localObject1).leftMargin = (i1 + this.S * 9 + this.S * 2);
    this.x.addView(this.D, (ViewGroup.LayoutParams)localObject1);
    this.F = new KChartDDEView(this.m);
    this.F.setRightDistance(this.k);
    localObject1 = new LinearLayout.LayoutParams(-1, 0, 1.0F);
    this.p.addView(this.F, (ViewGroup.LayoutParams)localObject1);
    this.F.setPadding(this.l, 0, 0, 0);
    this.F.setHolder(this);
    this.q = new RelativeLayout(this.m);
    localObject1 = new LinearLayout.LayoutParams(-1, -2);
    this.p.addView(this.q, (ViewGroup.LayoutParams)localObject1);
    this.aK = new TextView(this.m);
    this.aK.setTextColor(this.j);
    this.aK.setTextSize(10.0F);
    localObject1 = new RelativeLayout.LayoutParams(-2, -2);
    ((RelativeLayout.LayoutParams)localObject1).addRule(9);
    this.q.addView(this.aK, (ViewGroup.LayoutParams)localObject1);
    this.aL = new TextView(this.m);
    this.aL.setTextColor(this.j);
    this.aL.setTextSize(10.0F);
    localObject1 = new RelativeLayout.LayoutParams(-2, -2);
    ((RelativeLayout.LayoutParams)localObject1).addRule(11);
    this.q.addView(this.aL, (ViewGroup.LayoutParams)localObject1);
    this.G = new KChartMoveLineView(this.m);
    this.G.setVisibility(4);
    this.G.setAverageViewHeight(this.R);
    this.G.setRightDistance(this.k);
    localObject1 = new FrameLayout.LayoutParams(-1, -1);
    this.r.addView(this.G, (ViewGroup.LayoutParams)localObject1);
    this.G.setHolder(this);
    this.aO = new TextView(this.m);
    this.aO.setId(this.aO.hashCode());
    this.aO.setBackgroundColor(this.aP);
    this.aO.setTextColor(this.aQ);
    this.aO.setPadding(this.S, this.S, this.S, this.S);
    this.aO.setTextSize(10.0F);
    this.aO.setText("横屏");
    this.aO.setOnClickListener(this);
    localObject1 = new FrameLayout.LayoutParams(-2, -2);
    ((FrameLayout.LayoutParams)localObject1).gravity = 83;
    this.q.measure(-1, -2);
    ((FrameLayout.LayoutParams)localObject1).bottomMargin = this.q.getMeasuredHeight();
    this.r.addView(this.aO, (ViewGroup.LayoutParams)localObject1);
    this.I = new StockCostView(this.m);
    this.I.setVisibility(8);
    localObject1 = new FrameLayout.LayoutParams(com.android.dazhihui.g.a().m() / 3, -1);
    ((FrameLayout.LayoutParams)localObject1).gravity = 3;
    ((FrameLayout.LayoutParams)localObject1).topMargin = this.R;
    ((FrameLayout.LayoutParams)localObject1).bottomMargin = this.q.getMeasuredHeight();
    this.i = true;
    this.r.addView(this.I, (ViewGroup.LayoutParams)localObject1);
    localObject1 = new FrameLayout.LayoutParams(-1, -2);
    this.n = new ScrollView(this.m);
    this.n.setVerticalScrollBarEnabled(false);
    this.n.setVerticalFadingEdgeEnabled(false);
    this.n.setHorizontalFadingEdgeEnabled(false);
    this.n.addView(this.o, (ViewGroup.LayoutParams)localObject1);
    this.n.setOverScrollMode(2);
    this.H = new t(getContext());
    this.o.addView(this.H, -1, -2);
    this.f = new AdvertView(getContext());
    this.f.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    this.f.setAdvCode(123);
    this.f.setOnAdvertStateChangeListener(new g(this));
    this.o.addView(this.f);
    localObject1 = new FrameLayout.LayoutParams(-1, -1);
    addView(this.n, (ViewGroup.LayoutParams)localObject1);
    onFinishInflate();
    a(true, false);
    setOnHeaderRefreshListener(new h(this));
  }
  
  private void z()
  {
    int i1 = getResources().getDimensionPixelOffset(2131230839);
    Object localObject = (FrameLayout.LayoutParams)this.p.getLayoutParams();
    FrameLayout.LayoutParams localLayoutParams2 = (FrameLayout.LayoutParams)this.G.getLayoutParams();
    FrameLayout.LayoutParams localLayoutParams1 = (FrameLayout.LayoutParams)this.I.getLayoutParams();
    int i2 = this.aV;
    if (getResources().getConfiguration().orientation == 1)
    {
      i1 = i2 - i1;
      ((FrameLayout.LayoutParams)localObject).width = this.aU;
      localLayoutParams2.width = this.aU;
      localLayoutParams1.width = (this.aU / 3);
      ((LinearLayout.LayoutParams)this.s.getLayoutParams()).weight = 3.0F;
      LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.F.getLayoutParams();
      this.C.setText(this.J[this.U]);
      this.C.setVisibility(0);
      this.D.setText(a(this.J[this.U]));
      this.D.setVisibility(0);
      this.E.setVisibility(8);
      this.x.setVisibility(0);
      this.aO.setVisibility(0);
      if ((this.M != null) && (!com.android.dazhihui.d.n.i(this.M.getType(), com.android.dazhihui.d.n.o(this.M.getCode()))) && (!com.android.dazhihui.d.n.m(this.M.getCode())) && (!com.android.dazhihui.d.n.g(this.M.getType())))
      {
        ((FrameLayout.LayoutParams)localObject).height = i1;
        localLayoutParams2.height = i1;
        this.q.measure(-1, -2);
        localLayoutParams1.height = (i1 - this.R - this.q.getMeasuredHeight());
        i1 = this.aV;
        localObject = (LinearLayout.LayoutParams)this.z.getLayoutParams();
        this.z.setVisibility(0);
        this.F.setVisibility(8);
        this.H.setVisibility(0);
        i2 = i1;
        if (this.f.getTag() != null)
        {
          i2 = i1;
          if (Boolean.parseBoolean(String.valueOf(this.f.getTag())))
          {
            this.f.setVisibility(0);
            i2 = i1;
          }
        }
      }
    }
    int i3;
    for (;;)
    {
      i3 = View.MeasureSpec.makeMeasureSpec(this.aU, 1073741824);
      i2 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
      this.p.measure(i3, i2);
      i1 = 0;
      while (i1 < this.p.getChildCount())
      {
        this.p.getChildAt(i1).measure(i3, 0);
        i1 += 1;
      }
      this.q.measure(-1, -2);
      if ((this.M != null) && (com.android.dazhihui.d.n.i(this.M.getType(), com.android.dazhihui.d.n.o(this.M.getCode()))))
      {
        ((FrameLayout.LayoutParams)localObject).height = (i1 - this.Q);
        localLayoutParams2.height = (i1 - this.Q);
        localLayoutParams1.height = (i1 - this.R - this.q.getMeasuredHeight() - this.Q);
        i1 -= this.Q;
      }
      for (;;)
      {
        this.F.setVisibility(0);
        this.z.setVisibility(8);
        break;
        ((FrameLayout.LayoutParams)localObject).height = i1;
        localLayoutParams2.height = i1;
        localLayoutParams1.height = (i1 - this.R - this.q.getMeasuredHeight());
      }
      ((FrameLayout.LayoutParams)localObject).width = this.aU;
      ((FrameLayout.LayoutParams)localObject).height = this.aV;
      localLayoutParams2.width = this.aU;
      localLayoutParams2.height = this.aV;
      i2 = this.aV;
      ((LinearLayout.LayoutParams)this.s.getLayoutParams()).weight = 2.0F;
      this.E.setText(this.J[this.U]);
      this.w.setParamSettingData(a(this.J[this.U]));
      this.C.setVisibility(8);
      this.D.setVisibility(8);
      this.E.setVisibility(0);
      this.x.setVisibility(0);
      this.F.setVisibility(8);
      ((LinearLayout.LayoutParams)this.z.getLayoutParams()).bottomMargin = 0;
      this.z.setVisibility(8);
      this.H.setVisibility(8);
      this.aO.setVisibility(8);
      if (this.f.getVisibility() == 0)
      {
        this.f.setVisibility(8);
        this.f.setTag(Boolean.valueOf(true));
      }
      ((LinearLayout.LayoutParams)this.F.getLayoutParams()).topMargin = 0;
    }
    this.z.measure(i3, 0);
    this.x.measure(i3, 0);
    this.t.measure(i3, 0);
    this.o.measure(i3, 0);
    this.G.measure(i3, i2);
    this.I.a(this.t.getMeasuredHeight() - this.R, localLayoutParams1.height - (this.t.getMeasuredHeight() - this.R));
    A();
  }
  
  public String a(String paramString)
  {
    int[] arrayOfInt = null;
    if (paramString.equals("VOL")) {
      arrayOfInt = d.a().i();
    }
    for (;;)
    {
      paramString = new StringBuffer();
      if (arrayOfInt == null) {
        break label279;
      }
      paramString.append("(");
      int i2 = arrayOfInt.length;
      int i1 = 0;
      while (i1 < i2)
      {
        int i3 = arrayOfInt[i1];
        if (paramString.length() != 1) {
          paramString.append(",");
        }
        paramString.append(i3);
        i1 += 1;
      }
      if (paramString.equals("MACD")) {
        arrayOfInt = d.a().k();
      } else if (paramString.equals("KDJ")) {
        arrayOfInt = d.a().m();
      } else if (paramString.equals("RSI")) {
        arrayOfInt = d.a().o();
      } else if (paramString.equals("BIAS")) {
        arrayOfInt = d.a().q();
      } else if (paramString.equals("CCI")) {
        arrayOfInt = d.a().s();
      } else if (paramString.equals("W&R")) {
        arrayOfInt = d.a().u();
      } else if (paramString.equals("BOLL")) {
        arrayOfInt = d.a().w();
      } else if (paramString.equals("DMA")) {
        arrayOfInt = d.a().y();
      } else if (paramString.equals("MA")) {
        arrayOfInt = d.a().A();
      }
    }
    paramString.append(")");
    return paramString.toString();
    label279:
    return "";
  }
  
  public void a(y paramy)
  {
    b(paramy);
    O();
    this.u.postInvalidate();
    this.t.a(paramy);
    this.w.a(paramy);
    this.F.a(paramy);
    this.H.a(paramy);
    this.y.a(paramy);
    this.z.a(paramy);
    this.I.a(paramy);
  }
  
  public void a(n paramn)
  {
    this.F.a(paramn);
  }
  
  public void a(s params)
  {
    if (this.M == null) {
      return;
    }
    com.android.dazhihui.d.n.a(this.M.getCode(), 1060);
    this.ao = ((long[][])null);
    this.ap = ((long[][])null);
    this.aq = ((int[][])null);
    this.ar = ((int[][])null);
    this.as = ((int[][])null);
    this.at = ((int[][])null);
    this.au = ((int[][])null);
    this.av = null;
    this.aw = ((int[][])null);
    this.ax = ((int[][])null);
    this.ay = -1;
    this.F.a(params);
    if (params.a() != 7) {
      this.v.setVisibility(8);
    }
    for (;;)
    {
      this.L.a(params);
      return;
      if (com.android.dazhihui.d.n.l(this.M.getType(), this.M.getMarketType())) {
        this.v.setVisibility(0);
      }
    }
  }
  
  public void a(s params, boolean paramBoolean)
  {
    this.w.a(params, paramBoolean);
  }
  
  public void a(String[][] paramArrayOfString, int[] paramArrayOfInt)
  {
    this.L.j();
    if (paramArrayOfString != null) {
      this.w.a(paramArrayOfString, paramArrayOfInt);
    }
  }
  
  public boolean b(n paramn)
  {
    boolean bool = true;
    Object localObject = getDataModel();
    if (localObject == null) {
      return false;
    }
    if (paramn == n.a)
    {
      paramn = ((StockVo)localObject).getKDDX();
      localObject = ((StockVo)localObject).getKData();
      if ((paramn == null) || (paramn.length < localObject.length)) {
        break label133;
      }
    }
    for (;;)
    {
      return bool;
      if (paramn == n.b)
      {
        paramn = ((StockVo)localObject).getKDDY();
        localObject = ((StockVo)localObject).getKData();
        if ((paramn == null) || (paramn.length < localObject.length)) {
          break;
        }
        return true;
      }
      if (paramn == n.c)
      {
        paramn = ((StockVo)localObject).getKDDZ();
        localObject = ((StockVo)localObject).getKData();
        if ((paramn == null) || (paramn.length < localObject.length)) {
          break;
        }
        return true;
      }
      if (paramn != n.d) {
        break;
      }
      paramn = ((StockVo)localObject).getKSupl();
      localObject = ((StockVo)localObject).getKData();
      if ((paramn == null) || (paramn.length < localObject.length)) {
        break;
      }
      return true;
      label133:
      bool = false;
    }
  }
  
  public void c(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (getDDEModel() == n.e)
      {
        n localn = n.a;
        if (this.w.getKLinePeriodValue() != 7) {
          localn = n.f;
        }
        this.F.setDDEModel(localn);
        this.F.invalidate();
      }
      if (this.U == 7)
      {
        if ((!com.android.dazhihui.d.n.i(this.M.getType(), com.android.dazhihui.d.n.o(this.M.getCode()))) && (!com.android.dazhihui.d.n.m(this.M.getCode())) && (!com.android.dazhihui.d.n.g(this.M.getType()))) {
          break label121;
        }
        h(0);
      }
      for (;;)
      {
        this.t.invalidate();
        return;
        label121:
        h(1);
      }
    }
    this.t.invalidate();
  }
  
  public void d(boolean paramBoolean)
  {
    if (paramBoolean) {
      l();
    }
    t();
  }
  
  public void e(int paramInt)
  {
    f(paramInt);
    StockVo.setExRights(paramInt);
  }
  
  public void f(int paramInt)
  {
    if (paramInt == 0)
    {
      this.v.setText(this.aJ[0]);
      return;
    }
    if (paramInt == 1)
    {
      this.v.setText(this.aJ[1]);
      return;
    }
    this.v.setText(this.aJ[2]);
  }
  
  public void g(int paramInt)
  {
    this.M = this.L.getDataModel();
    if ((this.M != null) && (this.M.getKData() != null))
    {
      paramInt = this.M.getKLineOffset() - paramInt;
      if (this.P + paramInt <= this.M.getKData().length) {
        break label112;
      }
      this.ay = (this.M.getKData().length - 1);
      paramInt = Math.max(this.M.getKData().length - this.P, 0);
      if (paramInt <= 0) {
        break label125;
      }
      setKLineOffset(paramInt);
      label96:
      if (paramInt <= 50) {
        break label135;
      }
      this.h = false;
    }
    for (;;)
    {
      t();
      return;
      label112:
      this.ay = (this.P - 1);
      break;
      label125:
      setKLineOffset(0);
      paramInt = 0;
      break label96;
      label135:
      if (!this.h)
      {
        this.h = true;
        this.L.a(false);
      }
    }
  }
  
  public long[][] getAvgPrice()
  {
    return this.ao;
  }
  
  public long[][] getAvgVol()
  {
    return this.ap;
  }
  
  public int[] getAvgs()
  {
    return this.V;
  }
  
  public int[] getAvgsColors()
  {
    return this.aa;
  }
  
  public int[][] getBias()
  {
    return this.au;
  }
  
  public int[][] getBoll()
  {
    return this.aq;
  }
  
  public int[] getCci()
  {
    return this.av;
  }
  
  public int getDDEDownColor()
  {
    return this.ae;
  }
  
  public n getDDEModel()
  {
    return this.F.getDDEModel();
  }
  
  public int getDDEUpColor()
  {
    return this.ad;
  }
  
  public int getDDEViewHeight()
  {
    return this.F.getHeight();
  }
  
  public int[][] getDSignal()
  {
    return this.bd;
  }
  
  public StockVo getDataModel()
  {
    return this.L.getDataModel();
  }
  
  public int getDefaultKLineWidth()
  {
    return this.N;
  }
  
  public m getDisplayModel()
  {
    return this.az;
  }
  
  public int[][] getDma()
  {
    return this.ax;
  }
  
  public int getDownColor()
  {
    return this.ac;
  }
  
  public int getIndexModel()
  {
    return this.U;
  }
  
  public s getKLinePeriod()
  {
    if (this.w != null) {
      return this.w.getKLinePeriod();
    }
    return s.g;
  }
  
  public int getKLinePeriodValue()
  {
    return this.w.getKLinePeriodValue();
  }
  
  public int getKLineSize()
  {
    return this.P;
  }
  
  public int getKLineViewHeight()
  {
    return this.t.getHeight();
  }
  
  public long getKLineViewMaxValue()
  {
    return this.t.getMaxValue();
  }
  
  public long getKLineViewMinValue()
  {
    return this.t.getMinValue();
  }
  
  public int getKLineWidth()
  {
    return this.O;
  }
  
  public int[][] getKdj()
  {
    return this.as;
  }
  
  public int getKlineRightPartColor()
  {
    return this.af;
  }
  
  public int[] getMAs()
  {
    return this.W;
  }
  
  public int[][] getMacd()
  {
    return this.ar;
  }
  
  public int getMiddleLayoutHeight()
  {
    return this.w.getHeight();
  }
  
  public int getMoveLineColor()
  {
    return this.ag;
  }
  
  public int[] getParamSettingBtnLocation()
  {
    int[] arrayOfInt = new int[2];
    this.C.getLocationOnScreen(arrayOfInt);
    arrayOfInt[1] -= this.aS;
    return arrayOfInt;
  }
  
  public int getParamsViewHeight()
  {
    return this.y.getHeight();
  }
  
  public int[][] getRsi()
  {
    return this.at;
  }
  
  public int getScreenIndex()
  {
    return this.ay;
  }
  
  public StockCostView getStockCostView()
  {
    return this.I;
  }
  
  public int getTextColor()
  {
    return this.j;
  }
  
  public int getUpColor()
  {
    return this.ab;
  }
  
  public int[][] getWr()
  {
    return this.aw;
  }
  
  public ScrollView getmScrollView()
  {
    return this.n;
  }
  
  public void j()
  {
    if (this.H != null) {
      this.H.a(this.M);
    }
  }
  
  public void k()
  {
    this.ao = ((long[][])null);
    this.ap = ((long[][])null);
    this.aq = ((int[][])null);
    this.ar = ((int[][])null);
    this.as = ((int[][])null);
    this.at = ((int[][])null);
    this.au = ((int[][])null);
    this.av = null;
    this.aw = ((int[][])null);
    this.ax = ((int[][])null);
    this.bd = ((int[][])null);
    this.ay = -1;
    e(StockVo.getExRights());
    this.M = this.L.getDataModel();
    if (this.M == null) {
      return;
    }
    if ((com.android.dazhihui.d.n.l(this.M.getType(), this.M.getMarketType())) && (getKLinePeriod().a() == 7))
    {
      this.v.setVisibility(0);
      if ((!com.android.dazhihui.d.n.i(this.M.getType(), com.android.dazhihui.d.n.o(this.M.getCode()))) && (!com.android.dazhihui.d.n.m(this.M.getCode())) && (!com.android.dazhihui.d.n.g(this.M.getType()))) {
        break label257;
      }
      this.U = 0;
      this.z.setVisibility(8);
      this.F.setVisibility(0);
    }
    for (;;)
    {
      z();
      a(getKLinePeriod(), true);
      v();
      return;
      this.v.setVisibility(8);
      break;
      label257:
      this.U = 1;
      this.z.setVisibility(0);
      this.F.setVisibility(8);
    }
  }
  
  public void l()
  {
    this.M = this.L.getDataModel();
    int i1;
    int[][] arrayOfInt;
    if (this.M != null)
    {
      i1 = this.M.getKLineOffset();
      arrayOfInt = this.M.getKData();
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
      i1 = Math.max(0, arrayOfInt.length - this.P);
    }
    label68:
    this.aK.setText(" ");
    this.aL.setText(" ");
  }
  
  public void m()
  {
    Object localObject;
    if (this.M != null)
    {
      localObject = this.M;
      f(StockVo.getExRights());
    }
    a(this.m, d.a().g());
    if (getResources().getConfiguration().orientation == 1)
    {
      if ((this.J[this.U].equals("VOL")) && (this.az == m.b))
      {
        if ((this.ap == null) || (this.M == null)) {
          return;
        }
        int i1 = this.ap.length - 1;
        if (this.ay != -1) {
          i1 = this.ay + this.M.getKLineOffset();
        }
        int i2 = i1;
        if (i1 > this.ap.length - 1) {
          i2 = this.ap.length - 1;
        }
        localObject = this.ap[i2];
        SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
        i1 = localSpannableStringBuilder.length();
        localSpannableStringBuilder.append("MA ");
        i2 = localSpannableStringBuilder.length();
        localSpannableStringBuilder.setSpan(new ForegroundColorSpan(this.aa[0]), i1, i2, 33);
        this.V = d.a().i();
        i1 = 0;
        while (i1 < this.V.length)
        {
          i2 = localSpannableStringBuilder.length();
          localSpannableStringBuilder.append(" " + this.V[i1] + ":" + b.g(localObject[i1]));
          int i3 = localSpannableStringBuilder.length();
          localSpannableStringBuilder.setSpan(new ForegroundColorSpan(this.aa[i1]), i2, i3, 33);
          i1 += 1;
        }
        this.D.setText(localSpannableStringBuilder);
        this.D.setBackgroundColor(this.an);
        return;
      }
      this.D.setText(a(this.J[this.U]));
      this.D.setBackgroundColor(0);
      return;
    }
    this.w.setParamSettingData(a(this.E.getText().toString()));
  }
  
  public void n()
  {
    this.M = this.L.getDataModel();
    if ((this.M == null) || (this.M.getKData() == null)) {
      return;
    }
    int i1 = this.P;
    int i2 = this.M.getKLineOffset();
    if (this.O < this.N + 11) {
      this.O += 1;
    }
    this.P = ((getWidth() - this.l - this.k) / this.O);
    i2 += i1 - this.P;
    int i3 = Math.max(0, this.M.getKData().length - this.P);
    if (i2 < 0) {
      i1 = 0;
    }
    for (;;)
    {
      setKLineOffset(i1);
      d(false);
      return;
      i1 = i3;
      if (i2 <= i3) {
        i1 = i2;
      }
    }
  }
  
  public void o()
  {
    this.M = this.L.getDataModel();
    if ((this.M == null) || (this.M.getKData() == null)) {
      return;
    }
    int i1 = this.P;
    int i2 = this.M.getKLineOffset();
    if (this.O > this.T * 2) {
      this.O -= 1;
    }
    this.P = ((getWidth() - this.l - this.k) / this.O);
    i2 += i1 - this.P;
    int i3 = Math.max(0, this.M.getKData().length - this.P);
    if (i2 < 0)
    {
      this.aY.removeMessages(0);
      this.aY.sendEmptyMessageDelayed(0, 50L);
      i1 = 0;
    }
    for (;;)
    {
      setKLineOffset(i1);
      d(false);
      return;
      i1 = i3;
      if (i2 <= i3) {
        i1 = i2;
      }
    }
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.t) {
      if ((this.L != null) && (getResources().getConfiguration().orientation == 1)) {
        this.L.a(av.a);
      }
    }
    int i1;
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            if (paramView == this.F)
            {
              paramView = (n)paramView.getTag();
              if ((!b(paramView)) && (this.L != null)) {
                this.L.a(paramView);
              }
              if ((paramView == n.e) && (d.a().f())) {
                d.a().e(false);
              }
              this.t.invalidate();
              return;
            }
            if (paramView != this.v) {
              break;
            }
          } while (getKLinePeriodValue() < 7);
          this.aA.setContentView(this.aF);
          this.aA.showAsDropDown(this.v);
          return;
          if ((paramView == this.C) || (paramView == this.E))
          {
            D();
            return;
          }
          if (paramView == this.aO)
          {
            this.L.getHolder().getActivity().setRequestedOrientation(0);
            return;
          }
        } while (!(paramView instanceof TextView));
        paramView = paramView.getTag();
      } while (paramView == null);
      i1 = ((Integer)paramView).intValue();
      if ((i1 & 0x10000000) == 268435456)
      {
        e(i1 & 0xFFFFFFF);
        this.L.d();
        com.android.dazhihui.d.n.a(this.M.getCode(), 1226);
        this.aA.dismiss();
        return;
      }
    } while ((i1 & 0x20000000) != 536870912);
    h(i1 & 0xFFFFFFF);
    this.aA.dismiss();
  }
  
  public boolean onLongClick(View paramView)
  {
    if ((paramView == this.t) && (this.p.getTouchModel() == 1) && (this.L.getDataModel() != null) && (this.L.getDataModel().getKData() != null))
    {
      setMoveViewVisibility(0);
      this.t.b();
    }
    return true;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (((paramInt2 > 0) && (paramInt2 != paramInt4)) || ((paramInt1 > 0) && (paramInt1 != paramInt3)))
    {
      this.aU = paramInt1;
      this.aV = paramInt2;
      if ((this.aA != null) && (this.aA.isShowing())) {
        this.aA.dismiss();
      }
      z();
    }
  }
  
  public void p()
  {
    String str = "";
    this.M = this.L.getDataModel();
    if (this.M != null) {
      str = this.M.getCode();
    }
    com.android.dazhihui.d.n.a(str, 1225);
    post(this.ba);
  }
  
  public void q()
  {
    String str = "";
    this.M = this.L.getDataModel();
    if (this.M != null) {
      str = this.M.getCode();
    }
    com.android.dazhihui.d.n.a(str, 1225);
    post(this.bb);
  }
  
  public void r()
  {
    this.M = this.L.getDataModel();
    if ((this.M != null) && (this.M.getKData() != null))
    {
      int i1 = this.M.getKLineOffset();
      if (i1 >= 0) {
        if (i1 + this.P > this.M.getKData().length) {
          break label89;
        }
      }
    }
    label89:
    for (this.ay = (this.P - 1);; this.ay = (this.M.getKData().length - 1))
    {
      setMoveViewVisibility(0);
      t();
      postDelayed(this.aZ, 1500L);
      return;
    }
  }
  
  public void s()
  {
    setMoveViewVisibility(8);
    removeCallbacks(this.ba);
    removeCallbacks(this.bb);
  }
  
  public void setHolder(StockChartContainer paramStockChartContainer)
  {
    this.L = paramStockChartContainer;
    if (this.I != null) {
      this.I.a(paramStockChartContainer, av.b);
    }
  }
  
  public void setKLineOffset(int paramInt)
  {
    if (this.L != null) {
      this.M = this.L.getDataModel();
    }
    if (this.M == null) {
      return;
    }
    this.M.setKLineOffset(paramInt);
    C();
  }
  
  public void setMoveViewVisibility(int paramInt)
  {
    if (paramInt == 0)
    {
      this.az = m.b;
      this.G.setVisibility(0);
      this.G.getParent().requestDisallowInterceptTouchEvent(true);
      if (this.x.getVisibility() == 0) {
        this.w.setIndexDetailViewVisible(true);
      }
      this.L.setKChartDetailViewVisible(true);
      if ((getResources().getConfiguration().orientation == 1) && (d.a().d()) && (getKLinePeriod().a() == 7))
      {
        this.aY.removeMessages(1);
        this.I.setVisibility(0);
        if (this.M != null)
        {
          int[][] arrayOfInt = this.M.getKData();
          paramInt = arrayOfInt.length - 1;
          if (this.ay != -1) {
            paramInt = this.ay + this.M.getKLineOffset();
          }
          int i1 = paramInt;
          if (paramInt > arrayOfInt.length - 1) {
            i1 = arrayOfInt.length - 1;
          }
          if (arrayOfInt != null)
          {
            Message localMessage = new Message();
            localMessage.what = 1;
            localMessage.arg1 = arrayOfInt[i1][0];
            this.aY.sendMessage(localMessage);
          }
        }
      }
    }
    for (;;)
    {
      m();
      return;
      this.I.setVisibility(8);
      continue;
      this.ay = -1;
      this.az = m.a;
      this.G.setVisibility(8);
      this.I.setVisibility(8);
      this.G.getParent().requestDisallowInterceptTouchEvent(false);
      this.w.setIndexDetailViewVisible(false);
      this.L.setKChartDetailViewVisible(false);
      this.L.getHolder().s().setVisibility(8);
    }
  }
  
  public void setScreenIndex(int paramInt)
  {
    int i2 = this.P - 1;
    this.M = this.L.getDataModel();
    int i1 = i2;
    if (this.M != null)
    {
      i1 = i2;
      if (this.M.getKData() != null)
      {
        int i3 = this.M.getKData().length;
        i1 = i2;
        if (this.P > i3) {
          i1 = i3 - 1;
        }
      }
    }
    i2 = paramInt;
    if (paramInt > i1) {
      i2 = i1;
    }
    if (i2 != this.ay)
    {
      this.ay = i2;
      E();
      t();
    }
  }
  
  public void t()
  {
    this.t.c();
    this.y.b();
    this.z.b();
    this.F.b();
    this.u.invalidate();
    if (this.az == m.b) {
      this.G.invalidate();
    }
  }
  
  public void u()
  {
    this.t.invalidate();
  }
  
  public void v()
  {
    Object localObject = this.L.getDataModel();
    if (localObject == null) {}
    for (;;)
    {
      return;
      localObject = ((StockVo)localObject).getKData();
      if ((localObject != null) && (localObject.length > 0))
      {
        F();
        try
        {
          if (this.U == 7)
          {
            if ((!com.android.dazhihui.d.n.i(this.M.getType(), com.android.dazhihui.d.n.o(this.M.getCode()))) && (!com.android.dazhihui.d.n.m(this.M.getCode())) && (!com.android.dazhihui.d.n.g(this.M.getType()))) {
              J();
            }
            G();
            this.t.c();
          }
          if (this.U == 6) {
            H();
          }
          if (this.U == 8) {
            I();
          }
          if (this.U == 1) {
            J();
          }
          if (this.U == 2) {
            K();
          }
          if (this.U == 3) {
            L();
          }
          if (this.U == 4) {
            M();
          }
          if (this.U == 5)
          {
            N();
            return;
          }
        }
        catch (Exception localException) {}
      }
    }
  }
  
  public void w()
  {
    int[][] arrayOfInt3;
    int[] arrayOfInt;
    double[] arrayOfDouble1;
    double[] arrayOfDouble2;
    float[] arrayOfFloat;
    int i8;
    int i4;
    int i5;
    int i6;
    int i3;
    int i2;
    double d;
    float f1;
    label230:
    int[][] arrayOfInt2;
    label249:
    int i9;
    int i7;
    label463:
    int i10;
    for (;;)
    {
      try
      {
        this.M = this.L.getDataModel();
        int[][] arrayOfInt1 = this.M.getKDDX();
        arrayOfInt3 = this.M.getKData();
        i1 = arrayOfInt3.length;
        this.bd = ((int[][])Array.newInstance(Integer.TYPE, new int[] { i1, 4 }));
        arrayOfInt = new int[arrayOfInt3.length];
        arrayOfDouble1 = new double[arrayOfInt3.length];
        arrayOfDouble2 = new double[arrayOfInt3.length];
        arrayOfFloat = new float[arrayOfInt3.length];
        i8 = 0;
        i4 = 0;
        i5 = 0;
        i6 = 0;
        i3 = 0;
        if ((arrayOfInt1 == null) || (arrayOfInt3 == null) || (arrayOfInt1.length > arrayOfInt3.length)) {
          break label1317;
        }
        if (arrayOfInt3.length >= 20) {
          break label1318;
        }
        return;
      }
      catch (Exception localException)
      {
        Object localObject1;
        Object localObject2;
        localException.printStackTrace();
        return;
      }
      if (i2 < 10)
      {
        localObject1 += arrayOfInt3[(i1 - i2)][4];
        localObject2 += 1.0F * (arrayOfInt3[(i1 - i2)][2] - arrayOfInt3[(i1 - i2)][3]) / arrayOfInt3[(i1 - i2)][4];
        i2 += 1;
      }
      else
      {
        arrayOfDouble1[i1] = (d / 10.0D);
        arrayOfFloat[i1] = (f1 / 10.0F);
        break label1347;
        if (localException.length < arrayOfInt3.length)
        {
          arrayOfInt2 = com.android.dazhihui.d.n.a(localException, arrayOfInt3.length);
          if (arrayOfInt2.length <= 20) {
            break label1317;
          }
          i9 = 19;
          i7 = 0;
          i2 = 1;
          if (i9 < arrayOfInt2.length)
          {
            d = 0.0D;
            f1 = 0.0F;
            i1 = 0;
            while (i1 < 10)
            {
              d += arrayOfInt3[(i9 - i1)][4];
              f1 += 1.0F * (arrayOfInt3[(i9 - i1)][2] - arrayOfInt3[(i9 - i1)][3]) / arrayOfInt3[(i9 - i1)][4];
              i1 += 1;
            }
            arrayOfDouble1[i9] = (d / 10.0D);
            arrayOfFloat[i9] = (f1 / 10.0F);
            d = 0.0D;
            i1 = 0;
            while (i1 < 20)
            {
              d += Math.abs(arrayOfInt2[(i9 - i1)][1]);
              i1 += 1;
            }
            arrayOfDouble2[i9] = (d / 20.0D);
            if ((i8 == 0) && (i4 == 0) && (arrayOfInt2[i9][1] < -arrayOfDouble2[i9] * 1.5D))
            {
              i1 = arrayOfInt3[i9][2];
              break label1372;
              if (arrayOfInt3[i9][3] >= Math.min(arrayOfInt3[(i9 - 1)][3], arrayOfInt3[(i9 - 2)][3])) {
                break label689;
              }
            }
            label689:
            for (i10 = arrayOfInt3[i9][3]; i4 == 0; i10 = Math.min(arrayOfInt3[(i9 - 1)][3], arrayOfInt3[(i9 - 2)][3]))
            {
              if ((arrayOfInt[i9] != 1) || (arrayOfFloat[i9] >= 0.07D)) {
                break label1283;
              }
              i5 = 1;
              i3 = arrayOfInt3[i9][2];
              i2 = 1;
              i4 = 0;
              i8 = Math.max(arrayOfInt3[i9][1], i1);
              i7 = (int)Math.max(i8 * (1.0D - 1.5D * arrayOfFloat[i9]), i10);
              this.bd[i9][0] = 1;
              this.bd[i9][1] = 0;
              this.bd[i9][2] = i8;
              this.bd[i9][3] = i7;
              i6 = i1;
              i1 = i8;
              break label1423;
              if ((i8 == 0) || (i4 != 0) || (arrayOfInt2[i9][1] >= -arrayOfDouble2[i9] * 1.5D)) {
                break label1460;
              }
              i1 = Math.min(i8, arrayOfInt3[i9][2]);
              break label1372;
            }
            i8 = i2 + 1;
            if ((arrayOfInt2[i9][1] < -arrayOfDouble2[i9] * 1.5D) && (arrayOfInt3[i9][2] > i6) && ((arrayOfInt3[i9][2] - arrayOfInt3[i9][3]) * 1.0F / arrayOfInt3[i9][4] > arrayOfFloat[i9]) && (arrayOfInt3[i9][2] > i3 * (1.0D + arrayOfFloat[i9] * 1.5D))) {
              i2 = Math.max(i7, arrayOfInt3[i9][3]);
            }
            for (;;)
            {
              i6 = Math.max(arrayOfInt3[i9][2], i6);
              i2 = Math.max(i2, (int)(i6 * 0.9D));
              if (i4 != 1) {
                break;
              }
              this.bd[i9][0] = i4;
              this.bd[i9][1] = i5;
              this.bd[i9][2] = i3;
              this.bd[i9][3] = i2;
              break;
              if ((arrayOfInt3[i9][2] > i6) && (arrayOfInt3[i9][4] > arrayOfInt3[i9][1]) && (arrayOfInt2[i9][1] < arrayOfDouble2[i9] * 1.5D) && (arrayOfInt2[i9][1] > -arrayOfDouble2[i9] * 1.5D))
              {
                i2 = Math.max(i7, i10);
              }
              else if ((arrayOfInt2[i9][1] > arrayOfDouble2[i9] * 1.5D) && (arrayOfInt3[i9][2] > i6) && ((arrayOfInt3[i9][2] - arrayOfInt3[i9][3]) * 1.0F / arrayOfInt3[i9][4] > arrayOfFloat[i9]))
              {
                i2 = Math.max(i7, arrayOfInt3[i9][3]);
              }
              else if ((arrayOfInt2[i9][1] < -arrayOfDouble2[i9] * 1.5D) && (arrayOfInt3[i9][4] > arrayOfInt3[i9][1]))
              {
                i2 = Math.max(i7, arrayOfInt3[i9][3]);
              }
              else
              {
                i2 = i7;
                if (arrayOfInt3[i9][2] < i6)
                {
                  i2 = i7;
                  if (arrayOfInt3[i9][2] > i3 * (1.0F + 3.0F * arrayOfFloat[i9]))
                  {
                    i2 = i7;
                    if (arrayOfInt2[i9][1] > arrayOfDouble2[i9] * 1.5D) {
                      i2 = Math.max(i7, arrayOfInt3[i9][4]);
                    }
                  }
                }
              }
            }
          }
          if (!d.a().f()) {
            break label1317;
          }
          t();
        }
      }
    }
    label1283:
    label1317:
    label1318:
    label1347:
    label1362:
    label1372:
    label1423:
    label1460:
    label1509:
    while ((arrayOfInt3[i9][4] >= i2) && ((i8 < 13) || (arrayOfInt3[i9][4] >= arrayOfInt3[(i9 - 1)][4]) || (arrayOfInt3[i9][3] >= arrayOfInt3[(i9 - 1)][3])))
    {
      i10 = i4;
      int i11 = i1;
      i7 = i2;
      i1 = i3;
      i2 = i8;
      i3 = i6;
      i4 = i5;
      i5 = i10;
      i6 = i11;
      break label1423;
      i8 = i4;
      i10 = i1;
      i1 = i3;
      i3 = i6;
      i4 = i5;
      i5 = i8;
      i6 = i10;
      break label1423;
      break label249;
      return;
      i1 = 0;
      while (i1 < 20)
      {
        if (i1 >= 10) {
          break label1362;
        }
        arrayOfDouble1[i1] = 0.0D;
        arrayOfFloat[i1] = 0.0F;
        arrayOfDouble2[i1] = 0.0D;
        i1 += 1;
      }
      break label230;
      d = 0.0D;
      f1 = 0.0F;
      i2 = 0;
      break;
      for (;;)
      {
        if ((arrayOfInt3[i9][2] <= i1) || (arrayOfInt3[(i9 - 1)][2] > i1) || (arrayOfDouble1[i9] <= arrayOfDouble1[(i9 - 1)])) {
          break label1509;
        }
        arrayOfInt[i9] = 1;
        break label463;
        i10 = i9 + 1;
        i8 = i6;
        i9 = i5;
        i6 = i3;
        i3 = i1;
        i5 = i4;
        i4 = i9;
        i9 = i10;
        break;
        i1 = i8;
        if (i8 != 0)
        {
          i1 = i8;
          if (i4 == 0)
          {
            i1 = i8;
            if (arrayOfInt2[i9][1] > arrayOfDouble2[i9] * 1.5D) {
              i1 = 0;
            }
          }
        }
      }
      arrayOfInt[i9] = 0;
      break label463;
    }
    int i1 = arrayOfInt3[i9][4];
    if (arrayOfInt2[i9][1] < -arrayOfDouble2[i9] * 1.5D) {}
    for (i1 = arrayOfInt3[i9][2];; i1 = 0)
    {
      i4 = i6;
      i10 = 1;
      i5 = 0;
      i6 = i1;
      i7 = i2;
      i1 = i3;
      i2 = i8;
      i3 = i4;
      i4 = i10;
      break;
    }
  }
  
  public void x()
  {
    this.n.scrollTo(0, 0);
    this.t.invalidate();
    this.u.invalidate();
    this.y.invalidate();
    this.z.invalidate();
    this.F.invalidate();
    if (this.H != null) {
      this.H.removeAllViews();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\KChartContainer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */