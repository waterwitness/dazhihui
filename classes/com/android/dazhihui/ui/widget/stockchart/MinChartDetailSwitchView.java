package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.d.b;
import com.android.dazhihui.d.n;
import com.android.dazhihui.d.r;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.AdvertVo;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvItem;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvertData;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.stock.uv;
import com.android.dazhihui.ui.screen.y;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinChartDetailSwitchView
  extends StockChartBaseView
  implements View.OnClickListener
{
  private String[] A;
  private String[] B;
  private String[] C;
  private String[] D;
  private String[] E;
  private String[] F;
  private int[] G;
  private String[] H;
  private String[] I;
  private int[] J;
  private int[] K;
  private aj L = aj.a;
  private Bitmap M;
  private Bitmap N;
  private int O;
  private Rect P = new Rect();
  private Bitmap Q;
  private int R;
  private RectF S = new RectF();
  private Drawable T;
  private int U = -1;
  private int V = -1;
  private int W;
  public int a;
  private boolean aA = false;
  private int aa;
  private int ab;
  private Paint ac;
  private boolean ad = false;
  private Bitmap ae;
  private int af;
  private int ag;
  private int ah;
  private int ai = -2849024;
  private int aj = -409087;
  private int ak;
  private int al;
  private int am;
  private int an;
  private int ao;
  private int ap;
  private Drawable aq;
  private int ar;
  private y as = y.a;
  private DecimalFormat at = new DecimalFormat(".#");
  private boolean au = true;
  private Rect av;
  private int aw;
  private AdvertVo.AdvertData ax;
  private boolean ay;
  private String az = "请长按试试";
  public int b;
  int c;
  int d;
  int[][] e;
  int[][] f;
  String g = "--";
  String h = "--";
  int i;
  private String[] n = { "卖一", "卖二", "卖三", "卖四", "卖五" };
  private String[] o = { "买一", "买二", "买三", "买四", "买五" };
  private String[] p = { "卖一", "卖二", "卖三", "卖四", "卖五", "卖六", "卖七", "卖八", "卖九", "卖十" };
  private String[] q = { "买一", "买二", "买三", "买四", "买五", "买六", "买七", "买八", "买九", "买十" };
  private MinChartContainer r;
  private StockVo s;
  private int t;
  private int u;
  private int v;
  private PopupWindow w;
  private int x;
  private Rect y = new Rect();
  private String[] z;
  
  public MinChartDetailSwitchView(Context paramContext)
  {
    super(paramContext);
  }
  
  public MinChartDetailSwitchView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public MinChartDetailSwitchView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private String a(String paramString)
  {
    try
    {
      long l = Long.parseLong(paramString);
      String str;
      if ((l >= 10000L) && (l < 100000000L))
      {
        double d1 = (float)l * 1.0F / 10000.0F;
        str = this.at.format(d1);
        return str + "万";
      }
      if (l >= 100000000L)
      {
        l /= 100000000L;
        str = l + "亿";
        return str;
      }
    }
    catch (Exception localException) {}
    return paramString;
  }
  
  private void a(Canvas paramCanvas, int paramInt, boolean paramBoolean)
  {
    float f1 = this.ac.getStrokeWidth();
    int j = this.ac.getColor();
    this.ac.setStyle(Paint.Style.STROKE);
    this.ac.setStrokeWidth(2.0F);
    this.ac.setColor(this.ak);
    if (paramBoolean) {
      paramCanvas.drawRect(0.0F, getHeight() * paramInt / 10, getWidth(), getHeight() * (paramInt + 1) / 10, this.ac);
    }
    for (;;)
    {
      this.ac.setStrokeWidth(f1);
      this.ac.setStyle(Paint.Style.FILL);
      this.ac.setColor(j);
      return;
      paramCanvas.drawRect(0.0F, getHeight() * paramInt / 20, getWidth(), getHeight() * (paramInt + 1) / 20, this.ac);
    }
  }
  
  private void b(Canvas paramCanvas)
  {
    int j = getWidth();
    int i1 = getHeight();
    int i2 = getPaddingTop();
    int k = getPaddingLeft();
    int m = getPaddingRight();
    int i3 = getPaddingBottom();
    paramCanvas.save();
    this.ac.setColor(this.k);
    this.ac.setStyle(Paint.Style.STROKE);
    this.ac.setStrokeWidth(1.0F);
    i1 = (i1 - i2 - i3) / 2 + i2 - 1;
    this.aA = false;
    if (this.aA)
    {
      i2 = com.android.dazhihui.d.a.b(this.az, this.v);
      this.ac.setTextSize(this.v);
      this.ac.setColor(this.ai);
      this.ac.setAntiAlias(true);
      this.ac.setStyle(Paint.Style.FILL);
      if (this.T != null)
      {
        this.T.setBounds(j / 2 - i2 / 2 - this.v / 2, i1 - this.v / 2, j / 2 - i2 / 2 + this.v / 2, this.v / 2 + i1);
        this.T.draw(paramCanvas);
      }
      com.android.dazhihui.d.a.a(this.az, j / 2 + this.v / 2, i1 - this.v / 2, Paint.Align.CENTER, paramCanvas, this.ac);
      this.ac.setColor(this.k);
      paramCanvas.drawLine(k, i1, j / 2 - i2 / 2 - 5 - this.v / 2, i1, this.ac);
      paramCanvas.drawLine(j / 2 + i2 / 2 + 5 + this.v / 2, i1, j - m, i1, this.ac);
    }
    for (;;)
    {
      paramCanvas.restore();
      return;
      paramCanvas.drawLine(k, i1, j - m, i1, this.ac);
    }
  }
  
  private void c(Canvas paramCanvas)
  {
    if (this.s == null) {
      return;
    }
    int j = getHeight() / 12;
    boolean bool;
    int m;
    if (this.l != 1)
    {
      bool = true;
      this.ay = bool;
      if (((this.s.getMarketType() != 2) && (this.s.getMarketType() != 15)) || (this.ay)) {
        break label1727;
      }
      m = (int)(this.M.getHeight() + (int)com.android.dazhihui.d.a.a.getTextSize() + 2.6D * this.O);
      j = (getHeight() - m) / 13;
    }
    for (;;)
    {
      int i4 = this.s.getType();
      if ((n.e(i4)) || (n.d(i4))) {
        j = getHeight() / 13;
      }
      this.D = this.s.getDetailData();
      this.G = this.s.getDetailDataColor();
      Object localObject;
      if (n.e(i4))
      {
        j = getHeight() / 13;
        c();
        if (this.L == aj.c)
        {
          this.D = this.H;
          this.G = this.J;
          localObject = this.A;
        }
      }
      for (;;)
      {
        label213:
        int k = (j - this.t) / 2;
        int i3 = getWidth();
        this.ac.setTextSize(this.t);
        this.ac.setColor(this.ag);
        this.ac.setStyle(Paint.Style.FILL);
        if ((this.D == null) || (this.G == null)) {
          break;
        }
        int i2 = 0;
        int i1;
        for (;;)
        {
          i1 = k;
          if (i2 < localObject.length)
          {
            if (!n.e(i4)) {
              break label976;
            }
            if (this.G == null)
            {
              this.G = new int[15];
              Arrays.fill(this.G, getResources().getColor(2131493099));
            }
            if (i2 >= 2) {
              break label911;
            }
            com.android.dazhihui.d.a.a(localObject[i2], 4, 0 + k, Paint.Align.LEFT, paramCanvas, this.ac);
            com.android.dazhihui.d.a.b.setColor(this.G[(i2 * 2)]);
            b.b(paramCanvas, this.D[(i2 * 2)], i3 - 4 - this.t * 2, 0 + k, 24, this.t);
            com.android.dazhihui.d.a.b.setColor(this.G[(i2 * 2 + 1)]);
            b.b(paramCanvas, this.D[(i2 * 2 + 1)], i3 - 4, 0 + k, 24, this.t);
          }
          for (;;)
          {
            k += j;
            if (k <= getHeight()) {
              break label1037;
            }
            i1 = k;
            if ((this.s.getMarketType() != 15) || (this.ay)) {
              break label1046;
            }
            j = (j - this.t) / 2;
            j = getHeight() - m;
            k = (i3 - this.M.getWidth()) / 2;
            com.android.dazhihui.d.a.a(this.Q, 0, 0, i3, 2, 2, j, paramCanvas);
            this.S = new RectF((i3 - this.M.getWidth()) / 2, this.O + j + 10, i3 - (i3 - this.M.getWidth()) / 2, this.M.getHeight() + j);
            this.P = new Rect(k, this.O + j, i3 - k, (int)(j + 1.5D * this.O + this.M.getHeight() + com.android.dazhihui.d.a.a.getTextSize()));
            paramCanvas.drawBitmap(this.M, null, this.S, this.ac);
            com.android.dazhihui.d.a.a.setStyle(Paint.Style.FILL);
            com.android.dazhihui.d.a.a.setTextSize(this.R);
            com.android.dazhihui.d.a.a.setColor(getResources().getColor(2131493677));
            com.android.dazhihui.d.a.a("预警", i3 / 2, (int)(this.M.getHeight() + j + 0.6D * this.O), Paint.Align.CENTER, paramCanvas);
            return;
            bool = false;
            break;
            if (this.L != aj.d) {
              break label1722;
            }
            this.D = this.I;
            this.G = this.K;
            localObject = this.B;
            break label213;
            if (n.d(i4))
            {
              localObject = this.C;
              break label213;
            }
            if (n.c(i4))
            {
              localObject = this.C;
              break label213;
            }
            if (n.h(i4, this.s.getMarketType()))
            {
              this.D = this.s.getHkDetailData();
              this.G = this.s.getDetailDataColor();
              localObject = this.z;
              break label213;
            }
            if (n.d(i4, this.s.getMarketType()))
            {
              localObject = this.E;
              break label213;
            }
            if (i4 == 5)
            {
              localObject = this.F;
              break label213;
            }
            localObject = this.C;
            break label213;
            label911:
            com.android.dazhihui.d.a.a(localObject[i2], 4, 0 + k, Paint.Align.LEFT, paramCanvas, this.ac);
            com.android.dazhihui.d.a.b.setColor(this.G[(i2 + 2)]);
            b.b(paramCanvas, this.D[(i2 + 2)], i3 - 4, 0 + k, 24, this.t);
            continue;
            label976:
            com.android.dazhihui.d.a.a(localObject[i2], 4, 0 + k, Paint.Align.LEFT, paramCanvas, this.ac);
            com.android.dazhihui.d.a.b.setColor(this.G[i2]);
            b.b(paramCanvas, this.D[i2], i3 - 4, 0 + k, 24, this.t);
          }
          label1037:
          i2 += 1;
        }
        label1046:
        if ((!n.f(this.s.getType(), this.s.getMarketType())) || (this.ay)) {
          break;
        }
        localObject = com.android.dazhihui.ui.a.a.c().b();
        if ((localObject == null) || (uv.c(this.s))) {
          break;
        }
        this.ax = ((AdvertVo)localObject).getAdvert(150);
        if (this.ax == null) {
          break;
        }
        String str = ((AdvertVo.AdvItem)this.ax.advList.get(0)).text;
        localObject = ((AdvertVo.AdvItem)this.ax.advList.get(0)).colour;
        if (TextUtils.isEmpty(str)) {
          break;
        }
        if (str.contains("\\n")) {}
        for (localObject = str.split("\\\\n");; localObject = null)
        {
          com.android.dazhihui.d.a.a.setStyle(Paint.Style.FILL);
          com.android.dazhihui.d.a.a.setTextSize(this.R);
          com.android.dazhihui.d.a.a.setColor(getResources().getColor(2131493677));
          j = (int)com.android.dazhihui.d.a.a.measureText("text");
          k = (int)(com.android.dazhihui.d.a.a.descent() - com.android.dazhihui.d.a.a.ascent());
          this.N.getHeight();
          k = this.O;
          i2 = this.N.getWidth();
          k = getHeight() - m;
          j = (i3 - i2 - 10 - j) / 2;
          com.android.dazhihui.d.a.a(this.Q, 0, 0, i3, 2, 2, k, paramCanvas);
          com.android.dazhihui.d.a.a(this.Q, 0, 0, i3, 2, 2, k + m / 2, paramCanvas);
          if (localObject == null)
          {
            j = (int)com.android.dazhihui.d.a.a.measureText(str);
            this.av = new Rect();
            this.av.left = 0;
            this.av.right = i3;
            this.av.bottom = getHeight();
            k = getHeight() - i1;
            if (this.aw <= getHeight() - i1) {
              break label1515;
            }
            this.av.top = (getHeight() - k);
          }
          for (;;)
          {
            this.ac.setStyle(Paint.Style.FILL);
            this.ac.setColor(getResources().getColor(2131493119));
            paramCanvas.drawRect(this.av, this.ac);
            while (j >= i3 - this.O / 2)
            {
              this.R -= 1;
              com.android.dazhihui.d.a.a.setTextSize(this.R);
              j = (int)com.android.dazhihui.d.a.a.measureText(localObject[0]);
            }
            j = (int)com.android.dazhihui.d.a.a.measureText(localObject[0]);
            break;
            label1515:
            this.av.top = (getHeight() - this.aw);
            k = this.aw;
          }
          if (TextUtils.isEmpty(((AdvertVo.AdvItem)this.ax.advList.get(0)).colour)) {}
          for (;;)
          {
            com.android.dazhihui.d.a.a.setTextSize(this.R);
            if (localObject != null) {
              break;
            }
            com.android.dazhihui.d.a.a(str, i3 / 2, getHeight() - k / 2, Paint.Align.CENTER, paramCanvas);
            return;
            com.android.dazhihui.d.a.a.setColor(Color.parseColor("#" + ((AdvertVo.AdvItem)this.ax.advList.get(0)).colour));
          }
          j = (k - this.R * 2) / 3;
          com.android.dazhihui.d.a.a(localObject[0], i3 / 2, getHeight() - k + j, Paint.Align.CENTER, paramCanvas);
          com.android.dazhihui.d.a.a(localObject[1], i3 / 2, j * 2 + (getHeight() - k) + this.R, Paint.Align.CENTER, paramCanvas);
          return;
        }
        label1722:
        localObject = null;
      }
      label1727:
      m = 0;
    }
  }
  
  private void d(Canvas paramCanvas)
  {
    b(paramCanvas);
    this.s = this.r.getDataModel();
    if (this.s != null)
    {
      this.e = this.s.getMinFiveRange();
      if (this.e == null) {
        this.e = new int[0][];
      }
      paramCanvas.save();
      int i1 = getWidth();
      int i2 = getHeight();
      String[] arrayOfString = this.n;
      int j = this.u;
      while ((j + 2) * 10 > i2) {
        j -= 2;
      }
      this.ac.setTextSize(j);
      this.ac.setStyle(Paint.Style.FILL);
      int i3 = this.x;
      int i4 = this.x;
      int i5 = (i2 / 2 - 5 * j) / 5;
      int m = i5 / 2;
      int k = m;
      if (m <= 0) {
        k = 1;
      }
      this.ac.getTextBounds(arrayOfString[0], 0, arrayOfString[0].length(), this.y);
      this.ac.setTextSize(j);
      int i6 = (int)this.ac.getFontMetrics().ascent;
      this.a = (k + j);
      this.b = (k / 2 + j);
      m = 0;
      int i7;
      if (m < 5)
      {
        this.ac.setColor(this.af);
        this.ac.setTextAlign(Paint.Align.LEFT);
        i7 = (i5 + j) * m + k;
        if (m == this.V) {
          a(paramCanvas, this.V, true);
        }
        paramCanvas.drawText(arrayOfString[(5 - m - 1)], i3, i7 - i6, this.ac);
        this.ac.setTextAlign(Paint.Align.RIGHT);
        if (m < this.e.length)
        {
          this.g = az.c(this.e[m][1]);
          this.h = az.a(this.e[m][0], this.s.getmDecimalLen());
          this.g = a(this.g);
        }
        for (this.i = this.e[m][2];; this.i = this.af)
        {
          paramCanvas.drawText(this.g, i1 - i4, i7 - i6, this.ac);
          this.ac.setColor(this.i);
          this.ac.setTextAlign(Paint.Align.CENTER);
          paramCanvas.drawText(this.h, (i1 - 5) / 2, i7 - i6, this.ac);
          if (this.U == m) {
            a(paramCanvas, this.U, true);
          }
          m += 1;
          break;
          this.g = "--";
          this.h = "--";
        }
      }
      arrayOfString = this.o;
      m = 0;
      if (m < 5)
      {
        this.ac.setColor(this.af);
        i7 = (i5 + j) * m + i2 / 2 + k;
        this.ac.setTextAlign(Paint.Align.LEFT);
        paramCanvas.drawText(arrayOfString[m], i3, i7 - i6, this.ac);
        this.ac.setTextAlign(Paint.Align.RIGHT);
        if (m + 5 < this.e.length)
        {
          this.g = az.c(this.e[(m + 5)][1]);
          this.h = az.a(this.e[(m + 5)][0], this.s.getmDecimalLen());
          this.g = a(this.g);
        }
        for (this.i = this.e[(m + 5)][2];; this.i = this.af)
        {
          paramCanvas.drawText(this.g, i1 - i4, i7 - i6, this.ac);
          this.ac.setColor(this.i);
          this.ac.setTextAlign(Paint.Align.CENTER);
          paramCanvas.drawText(this.h, i1 / 2, i7 - i6, this.ac);
          if (this.V - 5 == m) {
            a(paramCanvas, this.V, true);
          }
          if (this.U - 5 == m) {
            a(paramCanvas, this.U, true);
          }
          m += 1;
          break;
          this.g = "--";
          this.h = "--";
        }
      }
      paramCanvas.restore();
    }
  }
  
  private void e(Canvas paramCanvas)
  {
    b(paramCanvas);
    this.s = this.r.getDataModel();
    this.e = this.s.getMinFiveRange();
    this.f = this.s.getMinLevel2Range();
    if (this.e == null) {
      this.e = new int[0][];
    }
    if (this.f == null) {
      this.f = new int[0][];
    }
    paramCanvas.save();
    int i3 = getWidth();
    int i4 = getHeight();
    String[] arrayOfString = this.p;
    int k = this.t;
    while ((k + 2) * 20 > i4) {
      k -= 2;
    }
    this.ac.setTextSize(k);
    this.ac.setStyle(Paint.Style.FILL);
    int i5 = this.x;
    int i6 = this.x;
    int i7 = (i4 / 2 - 10 * k) / 10;
    int j = i7 / 2;
    int m = j;
    if (j <= 0) {
      m = 1;
    }
    this.ac.getTextBounds(arrayOfString[0], 0, arrayOfString[0].length(), this.y);
    this.ac.setTextSize(k);
    int i8 = (int)this.ac.getFontMetrics().ascent;
    this.a = (m + k);
    this.b = (m / 2 + k);
    int i1 = 0;
    j = k;
    int i9;
    int i10;
    int i2;
    if (i1 < 10)
    {
      this.ac.setColor(this.af);
      this.ac.setTextAlign(Paint.Align.LEFT);
      i9 = (i7 + k) * i1 + m;
      if (i1 == this.V) {
        a(paramCanvas, this.V, false);
      }
      paramCanvas.drawText(arrayOfString[(10 - i1 - 1)], i5, i9 - i8, this.ac);
      this.ac.setTextAlign(Paint.Align.RIGHT);
      if (i1 < 5)
      {
        if (i1 < this.f.length)
        {
          this.g = az.c(this.f[i1][1]);
          this.h = az.a(this.f[i1][0], this.s.getmDecimalLen());
          this.g = a(this.g);
        }
        for (this.i = this.f[i1][2];; this.i = this.af)
        {
          this.ac.setColor(this.i);
          this.ac.setTextAlign(Paint.Align.CENTER);
          paramCanvas.drawText(this.h, (i3 - i6 * 4) / 2, i9 - i8, this.ac);
          this.ac.setColor(this.af);
          this.ac.setTextAlign(Paint.Align.RIGHT);
          i10 = com.android.dazhihui.d.a.a(this.h, this.ac);
          this.ac.setTextSize(j);
          for (i2 = com.android.dazhihui.d.a.a(this.g, this.ac); i2 + ((i3 - i6 * 4) / 2 + i10 / 2 + this.x * 3) > i3; i2 = com.android.dazhihui.d.a.a(this.g, this.ac))
          {
            j -= 1;
            this.ac.setTextSize(j);
          }
          this.g = "--";
          this.h = "--";
        }
        paramCanvas.drawText(this.g, i3 - i6, i9 - i8, this.ac);
      }
      for (;;)
      {
        if (this.U == i1) {
          a(paramCanvas, this.U, false);
        }
        i1 += 1;
        break;
        if (i1 - 5 < this.e.length)
        {
          this.g = az.c(this.e[(i1 - 5)][1]);
          this.h = az.a(this.e[(i1 - 5)][0], this.s.getmDecimalLen());
          this.g = a(this.g);
        }
        for (this.i = this.e[(i1 - 5)][2];; this.i = this.af)
        {
          this.ac.setColor(this.i);
          this.ac.setTextAlign(Paint.Align.CENTER);
          paramCanvas.drawText(this.h, (i3 - i6 * 4) / 2, i9 - i8, this.ac);
          this.ac.setColor(this.af);
          this.ac.setTextAlign(Paint.Align.RIGHT);
          paramCanvas.drawText(this.g, i3 - i6, i9 - i8, this.ac);
          i10 = com.android.dazhihui.d.a.a(this.h, this.ac);
          this.ac.setTextSize(j);
          for (i2 = com.android.dazhihui.d.a.a(this.g, this.ac); i2 + ((i3 - i6 * 4) / 2 + i10 / 2 + this.x * 3) > i3; i2 = com.android.dazhihui.d.a.a(this.g, this.ac))
          {
            j -= 1;
            this.ac.setTextSize(j);
          }
          this.g = "--";
          this.h = "--";
        }
        paramCanvas.drawText(this.g, i3 - i6, i9 - i8, this.ac);
      }
    }
    arrayOfString = this.q;
    i1 = 0;
    if (i1 < 10)
    {
      this.ac.setColor(this.af);
      i9 = (i7 + k) * i1 + i4 / 2 + m;
      this.ac.setTextAlign(Paint.Align.LEFT);
      paramCanvas.drawText(arrayOfString[i1], i5, i9 - i8, this.ac);
      this.ac.setTextAlign(Paint.Align.RIGHT);
      if (i1 < 5)
      {
        if (i1 + 5 < this.e.length)
        {
          this.g = az.c(this.e[(i1 + 5)][1]);
          this.h = az.a(this.e[(i1 + 5)][0], this.s.getmDecimalLen());
          this.g = a(this.g);
        }
        for (this.i = this.e[(i1 + 5)][2];; this.i = this.af)
        {
          this.ac.setColor(this.i);
          this.ac.setTextAlign(Paint.Align.CENTER);
          paramCanvas.drawText(this.h, (i3 - i6 * 3) / 2, i9 - i8, this.ac);
          this.ac.setColor(this.af);
          this.ac.setTextAlign(Paint.Align.RIGHT);
          i10 = com.android.dazhihui.d.a.a(this.h, this.ac);
          this.ac.setTextSize(j);
          for (i2 = com.android.dazhihui.d.a.a(this.g, this.ac); i2 + ((i3 - i6 * 4) / 2 + i10 / 2 + this.x * 3) > i3; i2 = com.android.dazhihui.d.a.a(this.g, this.ac))
          {
            j -= 1;
            this.ac.setTextSize(j);
          }
          this.g = "--";
          this.h = "--";
        }
        paramCanvas.drawText(this.g, i3 - i6, i9 - i8, this.ac);
      }
      for (;;)
      {
        if (this.U - 10 == i1) {
          a(paramCanvas, this.U, false);
        }
        if (this.V - 10 == i1) {
          a(paramCanvas, this.V, false);
        }
        i1 += 1;
        break;
        if (i1 < this.f.length)
        {
          this.g = az.c(this.f[i1][1]);
          this.h = az.a(this.f[i1][0], this.s.getmDecimalLen());
          this.g = a(this.g);
        }
        for (this.i = this.f[i1][2];; this.i = this.af)
        {
          this.ac.setColor(this.i);
          this.ac.setTextAlign(Paint.Align.CENTER);
          paramCanvas.drawText(this.h, (i3 - i6 * 3) / 2, i9 - i8, this.ac);
          this.ac.setColor(this.af);
          this.ac.setTextAlign(Paint.Align.RIGHT);
          i10 = com.android.dazhihui.d.a.a(this.h, this.ac);
          this.ac.setTextSize(j);
          for (i2 = com.android.dazhihui.d.a.a(this.g, this.ac); i2 + ((i3 - i6 * 4) / 2 + i10 / 2 + this.x * 3) > i3; i2 = com.android.dazhihui.d.a.a(this.g, this.ac))
          {
            j -= 1;
            this.ac.setTextSize(j);
          }
          this.g = "--";
          this.h = "--";
        }
        this.ac.setTextSize(j + 1);
        paramCanvas.drawText(this.g, i3 - i6, i9 - i8, this.ac);
      }
    }
    paramCanvas.restore();
  }
  
  private boolean e()
  {
    boolean bool = true;
    this.s = this.r.getDataModel();
    int k;
    if ((this.L == aj.a) && (this.s != null))
    {
      int j = this.s.getType();
      k = this.s.getMarketType();
      if ((j == 1) || (j == 16) || (j == 10) || (j == 11) || (j == 2)) {}
    }
    else
    {
      return false;
    }
    if ((k != 2) && (k != 15)) {}
    for (;;)
    {
      return bool;
      bool = false;
    }
  }
  
  private void f(Canvas paramCanvas)
  {
    this.s = this.r.getDataModel();
    if (this.s != null)
    {
      List localList = this.s.getMinDealData();
      if ((localList != null) && (localList.size() > 0))
      {
        paramCanvas.save();
        int i3 = getWidth();
        int m = getHeight();
        int k = getPaddingTop();
        int i4 = getPaddingLeft();
        int i5 = this.x;
        this.ac.setStyle(Paint.Style.FILL);
        int j = this.t + 3;
        int i6 = (m - j * 20) / 21;
        while ((i6 + j) * localList.size() + i6 > m) {
          j -= 1;
        }
        this.ac.setTextSize(j);
        int i7 = (int)this.ac.getFontMetrics().ascent;
        int i1 = j;
        k += i6;
        m = 0;
        while (m < localList.size())
        {
          this.ac.setTextSize(j);
          this.ac.setColor(this.aj);
          String str = az.d(((int[])localList.get(m))[0]);
          this.ac.setTextAlign(Paint.Align.LEFT);
          paramCanvas.drawText(str, i4 + i5, k - i7, this.ac);
          this.ac.setColor(((int[])localList.get(m))[3]);
          str = az.a(((int[])localList.get(m))[1], this.s.getmDecimalLen());
          this.ac.setTextAlign(Paint.Align.CENTER);
          paramCanvas.drawText(str, (i3 - this.x * 3) / 2, k - i7, this.ac);
          this.ac.setColor(((int[])localList.get(m))[4]);
          this.ac.setTextAlign(Paint.Align.RIGHT);
          int i8 = com.android.dazhihui.d.a.a(str, this.ac);
          str = a(az.c(((int[])localList.get(m))[2]));
          this.ac.setTextSize(i1);
          for (int i2 = com.android.dazhihui.d.a.a(str, this.ac); i2 + ((i3 - this.x * 3) / 2 + i8 / 2 + this.x * 2) > i3; i2 = com.android.dazhihui.d.a.a(str, this.ac))
          {
            i1 -= 1;
            this.ac.setTextSize(i1);
          }
          paramCanvas.drawText(str, i3 - this.x, k - i7, this.ac);
          k += i6 + j;
          m += 1;
        }
        paramCanvas.restore();
      }
    }
  }
  
  protected void a()
  {
    super.a();
    this.ac = new Paint(1);
    this.T = getResources().getDrawable(2130837526);
    this.t = getResources().getDimensionPixelSize(2131231088);
    this.u = getResources().getDimensionPixelSize(2131230876);
    this.v = getResources().getDimensionPixelSize(2131230871);
    this.ab = getResources().getDimensionPixelOffset(2131230820);
    this.x = getResources().getDimensionPixelSize(2131230773);
    this.W = getResources().getDimensionPixelSize(2131230781);
    this.aa = getResources().getDimensionPixelSize(2131230830);
    this.aw = getResources().getDimensionPixelOffset(2131230824);
    setOnClickListener(this);
    setOnLongClickListener(new ag(this));
    this.z = getResources().getStringArray(2131361861);
    this.A = getResources().getStringArray(2131361868);
    this.B = getResources().getStringArray(2131361869);
    this.C = getResources().getStringArray(2131361866);
    this.E = getResources().getStringArray(2131361870);
    this.M = BitmapFactory.decodeResource(getResources(), 2130838523);
    this.N = BitmapFactory.decodeResource(getResources(), 2130838127);
    this.ae = BitmapFactory.decodeResource(getResources(), 2130838124);
    this.F = getResources().getStringArray(2131361867);
    this.O = getResources().getDimensionPixelSize(2131230774);
    this.Q = BitmapFactory.decodeResource(getResources(), 2130838888);
    a(g.a().b());
  }
  
  protected void a(Canvas paramCanvas)
  {
    int j = getWidth();
    int k = getHeight();
    int m = getPaddingTop();
    int i1 = getPaddingLeft();
    int i2 = getPaddingRight();
    int i3 = getPaddingBottom();
    paramCanvas.save();
    this.ac.setColor(this.k);
    this.ac.setStyle(Paint.Style.STROKE);
    float f1 = this.ac.getStrokeWidth();
    this.ac.setStrokeWidth(getResources().getDimensionPixelSize(2131230773));
    if (this.l == 1)
    {
      paramCanvas.drawLine(i1, m, i1, k - i3, this.ac);
      paramCanvas.drawLine(i1, k - i3, j - i2, k - i3, this.ac);
      return;
    }
    paramCanvas.drawRect(i1, m, j - i2, k - i3, this.ac);
    this.ac.setStrokeWidth(f1);
    paramCanvas.restore();
  }
  
  public void a(y paramy)
  {
    this.as = paramy;
    if (paramy == y.a)
    {
      this.k = getResources().getColor(2131493296);
      this.af = -4144960;
      this.ag = this.al;
      this.ah = getResources().getColor(2131493677);
      this.ai = -2849024;
      this.aj = -409087;
      this.ak = -526064;
      this.al = -2628628;
      this.am = 65280;
      this.an = 65362;
      this.ap = getResources().getColor(2131493323);
      this.ah = getResources().getColor(2131493677);
      this.ao = getResources().getColor(2131493677);
      this.N = BitmapFactory.decodeResource(getResources(), 2130838127);
      this.ae = BitmapFactory.decodeResource(getResources(), 2130838124);
      this.aq = getResources().getDrawable(2130838269);
      this.ar = -11776948;
    }
    for (;;)
    {
      a(getWidth(), getHeight());
      postInvalidate();
      return;
      this.ao = -2697514;
      this.ah = -12686651;
      this.ap = -1;
      this.k = getResources().getColor(2131493297);
      this.af = -14540254;
      this.ag = getResources().getColor(2131492903);
      this.ai = getResources().getColor(2131493332);
      this.aj = -14540254;
      this.ak = 41472;
      this.al = -10066330;
      this.am = -10066330;
      this.an = -10066330;
      this.ar = -3618616;
      this.N = BitmapFactory.decodeResource(getResources(), 2130838128);
      this.ae = BitmapFactory.decodeResource(getResources(), 2130838125);
      this.aq = getResources().getDrawable(2130838270);
    }
  }
  
  public void a(aj paramaj)
  {
    if (this.L == paramaj) {
      postInvalidate();
    }
  }
  
  public void a(String paramString1, String paramString2, int paramInt)
  {
    Object localObject1;
    Object localObject2;
    if (this.w == null)
    {
      this.w = new PopupWindow(this);
      localObject1 = (LinearLayout)LayoutInflater.from(getContext()).inflate(2130903411, null);
      localObject2 = ((LinearLayout)localObject1).findViewById(2131560366);
      this.w.setContentView((View)localObject1);
      this.w.setBackgroundDrawable(new BitmapDrawable());
      this.w.setWidth(this.W);
      this.w.setHeight(this.aa);
      this.w.setOutsideTouchable(true);
      this.w.setFocusable(true);
      this.w.setOnDismissListener(new ah(this));
    }
    for (;;)
    {
      ((LinearLayout)localObject1).setBackgroundDrawable(this.aq);
      ((View)localObject2).setBackgroundColor(this.ar);
      localObject2 = (TextView)((LinearLayout)localObject1).findViewById(2131560365);
      TextView localTextView1 = (TextView)((LinearLayout)localObject1).findViewById(2131560367);
      TextView localTextView2 = (TextView)((LinearLayout)localObject1).findViewById(2131560089);
      TextView localTextView3 = (TextView)((LinearLayout)localObject1).findViewById(2131560370);
      ((LinearLayout)localObject1).findViewById(2131560366);
      View localView = ((LinearLayout)localObject1).findViewById(2131560368);
      localObject1 = ((LinearLayout)localObject1).findViewById(2131560369);
      localTextView3.setVisibility(8);
      ((View)localObject1).setVisibility(8);
      localView.setVisibility(8);
      localTextView2.setVisibility(8);
      localTextView2.setText("撤");
      paramString1 = new ai(this, paramString1, paramString2);
      ((TextView)localObject2).setOnClickListener(paramString1);
      localTextView1.setOnClickListener(paramString1);
      localTextView2.setOnClickListener(paramString1);
      this.w.showAsDropDown(this, 0, paramInt);
      return;
      localObject1 = (LinearLayout)this.w.getContentView();
      localObject2 = ((LinearLayout)localObject1).findViewById(2131560366);
    }
  }
  
  public void b()
  {
    if (this.au) {}
    Object localObject1;
    int j;
    do
    {
      for (;;)
      {
        return;
        localObject1 = this.s.getMinFiveRange();
        int[][] arrayOfInt = this.s.getMinLevel2Range();
        if ((localObject1 != null) && (localObject1.length != 0))
        {
          if ((arrayOfInt == null) || (arrayOfInt.length == 0)) {
            break;
          }
          j = this.d * 20 / getHeight();
          if (j > -1)
          {
            Object localObject2 = null;
            if ((j < 5) && (j < arrayOfInt.length)) {
              localObject1 = az.a(arrayOfInt[j][0], this.s.getmDecimalLen());
            }
            while (localObject1 != null)
            {
              this.V = j;
              invalidate();
              return;
              if ((j >= 5) && (j < 10) && (j - 5 < localObject1.length))
              {
                localObject1 = az.a(localObject1[(j - 5)][0], this.s.getmDecimalLen());
              }
              else if ((j >= 10) && (j < 15) && (j - 5 < localObject1.length))
              {
                localObject1 = az.a(localObject1[(j - 5)][0], this.s.getmDecimalLen());
              }
              else
              {
                localObject1 = localObject2;
                if (j >= 15)
                {
                  localObject1 = localObject2;
                  if (j < 20)
                  {
                    localObject1 = localObject2;
                    if (j - 10 < arrayOfInt.length) {
                      localObject1 = az.a(arrayOfInt[(j - 10)][0], this.s.getmDecimalLen());
                    }
                  }
                }
              }
            }
          }
        }
      }
      j = this.d * 10 / getHeight();
    } while ((j <= -1) || (j >= localObject1.length));
    this.V = j;
    invalidate();
  }
  
  public void c()
  {
    int[] arrayOfInt = this.s.getmData2939();
    if ((arrayOfInt == null) || (arrayOfInt.length == 0)) {
      return;
    }
    if (this.H == null)
    {
      this.H = new String[15];
      Arrays.fill(this.H, "--");
      this.J = new int[15];
      Arrays.fill(this.J, getResources().getColor(2131493099));
    }
    if (this.I == null)
    {
      this.I = new String[15];
      Arrays.fill(this.I, "--");
      this.K = new int[15];
      Arrays.fill(this.K, getResources().getColor(2131493099));
    }
    int k = this.s.getZxj();
    if (arrayOfInt[7] == 0) {}
    for (int j = arrayOfInt[3];; j = arrayOfInt[7])
    {
      Object localObject1 = this.I;
      Object localObject2 = this.H;
      Object localObject3 = b.d(k, arrayOfInt[1]);
      localObject2[4] = localObject3;
      localObject1[4] = localObject3;
      localObject1 = this.K;
      localObject2 = this.J;
      int m = b.h(k, j);
      localObject2[4] = m;
      localObject1[4] = m;
      localObject1 = this.I;
      localObject2 = this.H;
      localObject3 = b.b(k, j);
      localObject2[5] = localObject3;
      localObject1[5] = localObject3;
      localObject1 = this.K;
      localObject2 = this.J;
      m = this.J[4];
      localObject2[5] = m;
      localObject1[5] = m;
      this.H[6] = b.b(k, j, arrayOfInt[1]);
      this.J[6] = this.J[5];
      this.I[6] = b.d(this.s.getmUp(), arrayOfInt[1]);
      this.K[6] = b.h(this.s.getmUp(), j);
      this.I[7] = b.d(this.s.getmDp(), arrayOfInt[1]);
      this.K[7] = b.h(this.s.getmDp(), j);
      this.I[8] = b.d(arrayOfInt[3], arrayOfInt[1]);
      this.K[8] = this.al;
      this.I[9] = b.j(this.s.getmUp() - this.s.getmDp(), j);
      this.K[9] = this.al;
      this.H[8] = String.valueOf(this.s.getmVol());
      this.J[8] = this.an;
      this.I[11] = String.valueOf(this.s.getmNpVol());
      this.K[11] = -16711936;
      k = this.s.getmVol();
      m = this.s.getmNpVol();
      this.I[12] = String.valueOf(k - m);
      this.K[12] = -65536;
      this.H[9] = String.valueOf(this.s.getmXsVol());
      this.J[9] = this.an;
      this.H[7] = b.d(this.s.getmJj(), arrayOfInt[1]);
      this.J[7] = this.al;
      k = this.s.getmJs();
      m = this.s.getmCc();
      int i1 = this.s.getmZc();
      this.H[13] = b.d(k, arrayOfInt[1]);
      this.J[13] = this.al;
      this.H[10] = b.j(m);
      this.J[10] = this.al;
      this.H[11] = b.j(i1);
      this.J[11] = this.al;
      this.H[12] = b.c(m, arrayOfInt[6], 0);
      this.J[12] = this.al;
      this.I[10] = b.d(this.s.getmLb(), 2);
      this.K[10] = this.al;
      localObject1 = this.s.get2940DealsData();
      if (localObject1 != null)
      {
        k = localObject1.length >> 2;
        m = k - 1;
        localObject2 = this.I;
        localObject3 = this.H;
        String str = b.d(localObject1[(m * 2)], arrayOfInt[1]);
        localObject3[0] = str;
        localObject2[0] = str;
        localObject2 = this.J;
        localObject3 = this.K;
        i1 = b.h(localObject1[(m * 2)], j);
        localObject3[0] = i1;
        localObject2[0] = i1;
        localObject2 = this.I;
        localObject3 = this.H;
        str = String.valueOf(localObject1[(m * 2 + 1)]);
        localObject3[1] = str;
        localObject2[1] = str;
        localObject2 = this.J;
        localObject3 = this.K;
        m = this.am;
        localObject3[1] = m;
        localObject2[1] = m;
        localObject2 = this.I;
        localObject3 = this.H;
        str = b.d(localObject1[(k * 2)], arrayOfInt[1]);
        localObject3[2] = str;
        localObject2[2] = str;
        localObject2 = this.J;
        localObject3 = this.K;
        j = b.h(localObject1[(k * 2)], j);
        localObject3[2] = j;
        localObject2[2] = j;
        localObject2 = this.I;
        localObject3 = this.H;
        localObject1 = String.valueOf(localObject1[(k * 2 + 1)]);
        localObject3[3] = localObject1;
        localObject2[3] = localObject1;
        localObject1 = this.J;
        localObject2 = this.K;
        j = this.am;
        localObject2[3] = j;
        localObject1[3] = j;
      }
      this.H[14] = b.d(arrayOfInt[7], arrayOfInt[1]);
      this.J[14] = this.al;
      this.I[13] = b.d(arrayOfInt[4], arrayOfInt[1]);
      this.K[13] = -65536;
      this.I[14] = b.d(arrayOfInt[5], arrayOfInt[1]);
      this.K[14] = -16711936;
      return;
    }
  }
  
  public void d()
  {
    if (this.w != null) {
      this.w.dismiss();
    }
  }
  
  public String getClickPositonPrice()
  {
    Object localObject1 = null;
    Object localObject3 = null;
    int[][] arrayOfInt2 = this.s.getMinFiveRange();
    int[][] arrayOfInt1 = this.s.getMinLevel2Range();
    Object localObject2 = localObject1;
    int j;
    if (arrayOfInt2 != null)
    {
      localObject2 = localObject1;
      if (arrayOfInt2.length != 0)
      {
        if ((arrayOfInt1 == null) || (arrayOfInt1.length == 0)) {
          break label273;
        }
        j = this.d * 20 / getHeight();
        localObject2 = localObject1;
        if (j > -1)
        {
          if ((j >= 5) || (j >= arrayOfInt1.length)) {
            break label125;
          }
          localObject1 = az.a(arrayOfInt1[j][0], this.s.getmDecimalLen());
          localObject2 = localObject1;
          if (localObject1 != null)
          {
            localObject2 = localObject1;
            if (((String)localObject1).equals("--")) {
              localObject2 = "0";
            }
          }
        }
      }
    }
    label125:
    label273:
    do
    {
      do
      {
        do
        {
          return (String)localObject2;
          if ((j >= 5) && (j < 10) && (j - 5 < arrayOfInt2.length))
          {
            localObject1 = az.a(arrayOfInt2[(j - 5)][0], this.s.getmDecimalLen());
            break;
          }
          if ((j >= 10) && (j < 15) && (j - 5 < arrayOfInt2.length))
          {
            localObject1 = az.a(arrayOfInt2[(j - 5)][0], this.s.getmDecimalLen());
            break;
          }
          localObject1 = localObject3;
          if (j < 15) {
            break;
          }
          localObject1 = localObject3;
          if (j >= 20) {
            break;
          }
          localObject1 = localObject3;
          if (j - 10 >= arrayOfInt1.length) {
            break;
          }
          localObject1 = az.a(arrayOfInt1[(j - 10)][0], this.s.getmDecimalLen());
          break;
          j = this.d * 10 / getHeight();
          localObject2 = localObject1;
        } while (j <= -1);
        localObject2 = localObject1;
      } while (j >= arrayOfInt2.length);
      localObject1 = az.a(arrayOfInt2[j][0], this.s.getmDecimalLen());
      localObject2 = localObject1;
    } while (!((String)localObject1).equals("--"));
    return "0";
  }
  
  public int getTheItemWidth()
  {
    return this.b;
  }
  
  public int getTheTopoffSet()
  {
    return this.a;
  }
  
  public void onClick(View paramView)
  {
    if (this.s == null) {}
    do
    {
      do
      {
        do
        {
          return;
          if ((this.s.getMarketType() != 2) || (this.ay) || (this.av == null) || (uv.c(this.s)) || (!this.av.contains(this.c, this.d))) {
            break;
          }
        } while ((this.ax == null) || (this.ax.advList == null) || (this.ax.advList.size() == 0) || (this.ax.advList.get(0) == null));
        paramView = ((AdvertVo.AdvItem)this.ax.advList.get(0)).callurl;
      } while (TextUtils.isEmpty(paramView));
      r.a(paramView, this.r.getHolder().getHolder().getActivity(), "", null);
      return;
      n.a(this.s.getCode(), 1218);
      if ((!this.au) && (this.L == aj.a))
      {
        paramView = getClickPositonPrice();
        this.r.getHolder().getHolder().a(paramView);
        return;
      }
    } while (paramView != this);
    if (this.L == aj.a) {
      this.L = aj.b;
    }
    for (;;)
    {
      a(this.L);
      return;
      if (this.L == aj.b)
      {
        if (n.g(this.s.getType(), this.s.getMarketType())) {
          break;
        }
        if ((this.s.getType() == 5) || (n.f(this.s.getType(), this.s.getMarketType())))
        {
          this.L = aj.c;
          continue;
        }
        this.L = aj.a;
        this.r.b();
        continue;
      }
      if (n.e(this.s.getType()))
      {
        if (this.L == aj.c) {
          this.L = aj.d;
        } else if (this.L == aj.d) {
          this.L = aj.c;
        }
      }
      else if (this.L == aj.c) {
        if (this.s.getType() == 5) {
          this.L = aj.a;
        } else if ((n.f(this.s.getType(), this.s.getMarketType())) && (uv.c(this.s))) {
          this.L = aj.a;
        }
      }
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    this.R = getResources().getDimensionPixelSize(2131231088);
    if (this.r == null) {}
    do
    {
      do
      {
        do
        {
          return;
          this.s = this.r.getDataModel();
        } while ((this.s == null) || (this.s.getMinData() == null));
        if (this.L != aj.a) {
          break;
        }
      } while (this.s == null);
      this.s.getMinFiveRange();
      this.s.getMinLevel2Range();
      if (uv.c(this.s))
      {
        e(paramCanvas);
        return;
      }
      d(paramCanvas);
      return;
      if (this.L == aj.b)
      {
        f(paramCanvas);
        return;
      }
    } while ((this.L != aj.c) && (this.L != aj.d));
    c(paramCanvas);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int j = (int)paramMotionEvent.getX();
    int k = (int)paramMotionEvent.getY();
    this.c = j;
    this.d = k;
    if (paramMotionEvent.getAction() == 1)
    {
      this.V = -1;
      if (!this.au) {
        postInvalidate();
      }
    }
    for (;;)
    {
      return super.onTouchEvent(paramMotionEvent);
      if (paramMotionEvent.getAction() == 0) {
        b();
      }
    }
  }
  
  public void setEnableChange(boolean paramBoolean)
  {
    this.au = paramBoolean;
  }
  
  public void setHolder(MinChartContainer paramMinChartContainer)
  {
    this.r = paramMinChartContainer;
  }
  
  public void setSwitchType(aj paramaj)
  {
    boolean bool = false;
    this.L = paramaj;
    if (e())
    {
      paramaj = d.a();
      int j = paramaj.b("isHaveMakeLongClick", 0);
      paramaj.g();
      if (j == 0) {
        bool = true;
      }
      this.aA = bool;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\MinChartDetailSwitchView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */