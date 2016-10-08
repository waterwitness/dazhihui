package com.android.dazhihui.ui.delegate.newtrade.widge;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.delegate.c.c;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

public class CaptialTrendChart
  extends View
{
  private float A;
  private float B;
  private float C = 0.0F;
  private float D;
  private int E;
  private float[] F;
  private List<f> G;
  private String H;
  private String I;
  private int J;
  private List<g> K;
  private List<g> L;
  private Path M;
  private Path N;
  private int O;
  private int P;
  private int Q;
  private int R;
  private int S;
  private int T;
  private int U;
  private int V;
  private float W;
  private final int a = 5;
  private float aa;
  private float ab;
  private Handler ac;
  private int ad;
  private int ae;
  private int af = -1;
  private int ag = -1;
  private float ah;
  private ScrollView ai;
  private final int b = 6;
  private float c;
  private float d;
  private Paint e = new Paint(1);
  private Context f;
  private SimpleDateFormat g;
  private int h;
  private int i;
  private int j;
  private int k;
  private int l;
  private int m;
  private int n;
  private int o;
  private int p;
  private int q;
  private int r;
  private int s;
  private int t;
  private int u;
  private int v;
  private int w;
  private int x;
  private int y;
  private List<com.android.dazhihui.ui.delegate.newtrade.b.a> z;
  
  public CaptialTrendChart(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public CaptialTrendChart(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  private int a(String paramString1, String paramString2)
  {
    Calendar localCalendar = Calendar.getInstance();
    try
    {
      localCalendar.setTime(this.g.parse(paramString1));
      l1 = localCalendar.getTimeInMillis();
    }
    catch (ParseException paramString1)
    {
      try
      {
        localCalendar.setTime(this.g.parse(paramString2));
        long l1 = (localCalendar.getTimeInMillis() - l1) / 86400000L;
        return new BigDecimal(l1 + "").intValue();
        paramString1 = paramString1;
        paramString1.printStackTrace();
      }
      catch (ParseException paramString1)
      {
        for (;;)
        {
          paramString1.printStackTrace();
        }
      }
    }
  }
  
  public static String a(String paramString)
  {
    Calendar localCalendar = Calendar.getInstance();
    Object localObject = null;
    try
    {
      paramString = new SimpleDateFormat("yyyyMMdd").parse(paramString);
      localCalendar.setTime(paramString);
      localCalendar.set(5, localCalendar.get(5) - 1);
      return new SimpleDateFormat("yyyyMMdd").format(localCalendar.getTime());
    }
    catch (ParseException paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
        paramString = (String)localObject;
      }
    }
  }
  
  private void a()
  {
    int i7 = 0;
    int i5 = 250;
    Object localObject1 = "0";
    int i1 = 0;
    Object localObject2 = "0";
    String str1;
    Object localObject3;
    if (i1 < this.z.size())
    {
      String str2 = ((com.android.dazhihui.ui.delegate.newtrade.b.a)this.z.get(i1)).d;
      str1 = ((com.android.dazhihui.ui.delegate.newtrade.b.a)this.z.get(i1)).c;
      localObject3 = localObject2;
      if (new BigDecimal(str2).floatValue() - new BigDecimal((String)localObject2).floatValue() > 0.0F) {
        localObject3 = str2;
      }
      if (new BigDecimal(str2).floatValue() - new BigDecimal((String)localObject1).floatValue() >= 0.0F) {
        break label636;
      }
      localObject1 = str2;
      label135:
      if (new BigDecimal(str1).floatValue() - new BigDecimal((String)localObject3).floatValue() <= 0.0F) {
        break label642;
      }
    }
    label380:
    label395:
    label482:
    label496:
    label511:
    label636:
    label642:
    for (localObject2 = str1;; localObject2 = localObject3)
    {
      if (new BigDecimal(str1).floatValue() - new BigDecimal((String)localObject1).floatValue() < 0.0F) {
        localObject1 = str1;
      }
      for (;;)
      {
        i1 += 1;
        break;
        localObject3 = localObject2;
        if (new BigDecimal((String)localObject2).floatValue() < 0.0F) {
          localObject3 = "0";
        }
        localObject2 = localObject1;
        if (new BigDecimal((String)localObject1).floatValue() > 0.0F) {
          localObject2 = "0";
        }
        int i3 = n.j((String)localObject3, "10000").intValue();
        int i4 = n.j((String)localObject2, "10000").intValue();
        int i2;
        if (((i3 != 0) || (i4 != 0)) && ((i3 != 0) || (i4 < 65286)))
        {
          i2 = i4;
          i1 = i3;
          if (i4 == 0)
          {
            i2 = i4;
            i1 = i3;
            if (i3 > 250) {}
          }
        }
        else
        {
          i2 = 65286;
          i1 = 250;
        }
        int i6;
        int i8;
        if (i1 % 250 != 0)
        {
          i4 = (i1 / 250 + 1) * 250;
          if (i2 % 250 == 0) {
            break label482;
          }
          i3 = (i2 / 250 - 1) * 250;
          i6 = i4;
          i8 = 1;
          i4 = i5;
          i5 = i8;
        }
        for (;;)
        {
          if (i6 / i4 - i3 / i4 <= 5) {
            break label511;
          }
          i5 += 1;
          i8 = i5 * 250;
          if (i1 % i8 != 0) {}
          for (i4 = (i1 / i8 + 1) * i8;; i4 = i1)
          {
            if (i2 % i8 == 0) {
              break label496;
            }
            i3 = (i2 / i8 - 1) * i8;
            i6 = i4;
            i4 = i8;
            break label395;
            i4 = i1;
            break;
            i3 = i2;
            break label380;
          }
          i3 = i2;
          i6 = i4;
          i4 = i8;
        }
        this.D = n.a(i4 + "", "10000", 4).floatValue();
        this.E = (i6 / i4 - i3 / i4 + 1);
        this.F = new float[this.E];
        i1 = i7;
        while (i1 < this.E)
        {
          this.F[i1] = n.a(i4 * i1 + i3 + "", "10000", 4).floatValue();
          i1 += 1;
        }
        return;
        break label135;
      }
    }
  }
  
  private void a(Context paramContext)
  {
    this.M = new Path();
    this.N = new Path();
    this.f = paramContext;
    this.h = getResources().getColor(2131492970);
    this.i = getResources().getColor(2131492962);
    this.c = getResources().getDimensionPixelOffset(2131230829);
    this.d = getResources().getDimensionPixelOffset(2131230774);
    this.v = getResources().getDimensionPixelOffset(2131230829);
    this.w = getResources().getDimensionPixelOffset(2131230773);
    this.x = getResources().getDimensionPixelOffset(2131230823);
    this.k = getResources().getColor(2131492976);
    this.m = getResources().getColor(2131492979);
    this.l = getResources().getColor(2131492979);
    this.n = getResources().getColor(2131492978);
    this.o = getResources().getColor(2131492977);
    this.j = getResources().getColor(2131492970);
    this.p = getResources().getColor(2131492961);
    this.q = getResources().getColor(2131492961);
    this.r = getResources().getDimensionPixelSize(2131230873);
    this.s = getResources().getDimensionPixelSize(2131230875);
    this.t = getResources().getDimensionPixelSize(2131230871);
    this.u = getResources().getDimensionPixelSize(2131230873);
    this.S = getResources().getDimensionPixelSize(2131230829);
    this.V = getResources().getDimensionPixelOffset(2131230774);
    this.W = 5.1F;
    this.aa = 1.0F;
    this.ab = 2.5F;
    this.G = new ArrayList();
    this.K = new ArrayList();
    this.L = new ArrayList();
    this.g = new SimpleDateFormat("yyyyMMdd");
    this.ac = new e(this);
  }
  
  private void a(Canvas paramCanvas)
  {
    int i1 = getWidth();
    int i2 = getHeight();
    int i3 = getPaddingTop();
    int i4 = getPaddingLeft();
    int i5 = getPaddingRight();
    this.O = (i2 - i3 - getPaddingBottom());
    this.P = (i1 - i4 - i5);
    paramCanvas.save();
    this.e.setStrokeWidth(this.aa);
    this.e.setPathEffect(null);
    this.e.setAntiAlias(true);
    Object localObject1 = NumberFormat.getPercentInstance();
    ((NumberFormat)localObject1).setMaximumFractionDigits(2);
    this.Q = 0;
    this.R = 0;
    i1 = 0;
    Object localObject2;
    if (i1 < this.E)
    {
      localObject2 = ((NumberFormat)localObject1).format(new BigDecimal(this.F[i1] + "").doubleValue());
      i2 = com.android.dazhihui.d.a.b((String)localObject2, this.t);
      this.R = com.android.dazhihui.d.a.a((String)localObject2, this.t);
      if (i2 > this.Q) {}
      for (;;)
      {
        this.Q = i2;
        i1 += 1;
        break;
        i2 = this.Q;
      }
    }
    this.U = (this.P - this.Q - this.V);
    this.T = (com.android.dazhihui.d.a.a("0", this.u) + getResources().getDimensionPixelOffset(2131230844));
    this.e.setStyle(Paint.Style.FILL);
    i1 = 0;
    if (i1 < this.E)
    {
      this.e.setTextSize(this.t);
      this.e.setColor(this.n);
      i2 = this.O - this.T - (this.O - this.T) / (this.E - 1) * i1;
      com.android.dazhihui.d.a.a(((NumberFormat)localObject1).format(new BigDecimal(this.F[i1] + "").doubleValue()), this.Q + getPaddingLeft(), i2, Paint.Align.RIGHT, paramCanvas, this.e);
      if (i1 == 0) {
        this.e.setColor(this.k);
      }
      for (;;)
      {
        paramCanvas.drawLine(this.Q + getPaddingLeft() + this.V, this.R / 2 + i2, this.P + getPaddingLeft(), this.R / 2 + i2, this.e);
        i1 += 1;
        break;
        this.e.setColor(this.m);
      }
    }
    paramCanvas.restore();
    paramCanvas.save();
    this.U = (this.P - (this.Q + this.V));
    this.B = 0.0F;
    if (this.J > 0) {
      this.B = n.a(this.U + "", this.J + "", 4).floatValue();
    }
    localObject1 = this.G.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (f)((Iterator)localObject1).next();
      i1 = ((f)localObject2).b;
      localObject2 = ((f)localObject2).a;
      this.e.setColor(this.k);
      float f1 = this.Q + getPaddingLeft() + this.V;
      float f2 = this.B;
      float f3 = i1;
      float f4 = this.O - this.T + this.R / 2;
      float f5 = this.Q + getPaddingLeft() + this.V;
      paramCanvas.drawLine(f2 * f3 + f1, f4, this.B * i1 + f5, this.O - this.T + this.R / 2 + this.S, this.e);
      this.e.setColor(this.o);
      this.e.setTextSize(this.u);
      com.android.dazhihui.d.a.a((String)localObject2, (int)(this.Q + getPaddingLeft() + this.V + this.B * i1), this.O - com.android.dazhihui.d.a.a("0", this.u) / 2, Paint.Align.CENTER, paramCanvas, this.e);
    }
    paramCanvas.restore();
  }
  
  private String b(String paramString)
  {
    return paramString.substring(0, 4) + "-" + paramString.substring(4, 6) + "-" + paramString.substring(6, 8);
  }
  
  private void b()
  {
    int i1 = 7;
    int i2 = 1;
    Object localObject = Calendar.getInstance();
    Calendar localCalendar = Calendar.getInstance();
    switch (this.y)
    {
    }
    for (;;)
    {
      localCalendar.set(5, localCalendar.getActualMaximum(5));
      this.I = this.g.format(localCalendar.getTime());
      this.J = (a(this.H, this.I) + 1);
      localObject = this.H;
      this.G.clear();
      label109:
      if (n.i((String)localObject, this.I).intValue() <= 0)
      {
        localObject = new f(this, ((String)localObject).substring(4, 6) + "-" + ((String)localObject).substring(6), i2);
        this.G.add(localObject);
        i2 += i1;
        localObject = Calendar.getInstance();
        try
        {
          ((Calendar)localObject).setTime(this.g.parse(this.H));
          ((Calendar)localObject).add(5, i2 - 1);
          localObject = this.g.format(((Calendar)localObject).getTime());
          break label109;
          ((Calendar)localObject).add(2, 0);
          ((Calendar)localObject).set(5, 1);
          this.H = this.g.format(((Calendar)localObject).getTime());
          continue;
          ((Calendar)localObject).add(2, -1);
          ((Calendar)localObject).set(5, 1);
          this.H = this.g.format(((Calendar)localObject).getTime());
          i1 = 14;
          continue;
          ((Calendar)localObject).add(2, -2);
          ((Calendar)localObject).set(5, 1);
          this.H = this.g.format(((Calendar)localObject).getTime());
          i1 = 21;
          continue;
          ((Calendar)localObject).add(2, -5);
          ((Calendar)localObject).set(5, 1);
          this.H = this.g.format(((Calendar)localObject).getTime());
          i1 = 60;
          continue;
          ((Calendar)localObject).add(2, -11);
          ((Calendar)localObject).set(5, 1);
          this.H = this.g.format(((Calendar)localObject).getTime());
          i1 = 90;
        }
        catch (ParseException localParseException)
        {
          for (;;)
          {
            localParseException.printStackTrace();
          }
        }
      }
    }
  }
  
  private void b(Canvas paramCanvas)
  {
    if ((this.z == null) || (this.L.size() != this.K.size()) || (this.L.size() != this.z.size())) {}
    do
    {
      return;
      this.A = 0.0F;
      this.C = 0.0F;
      int i1 = 0;
      for (;;)
      {
        if (i1 < this.F.length)
        {
          if (this.F[i1] == 0.0F)
          {
            this.A = n.a((this.O - this.T) / (this.E - 1) + "", this.D + "", 4).floatValue();
            this.C = (this.O - this.T - i1 * ((this.O - this.T) / (this.E - 1)) + this.R / 2);
          }
        }
        else
        {
          if (this.C == 0.0F) {
            break;
          }
          paramCanvas.save();
          this.e.setStyle(Paint.Style.STROKE);
          this.e.setStrokeWidth(this.W);
          this.e.setAntiAlias(true);
          float f1 = this.Q + getPaddingLeft() + this.V;
          float f2 = this.C;
          float f3 = this.C;
          if (this.ad > this.L.size()) {
            this.ad = this.L.size();
          }
          this.M.reset();
          this.N.reset();
          this.M.moveTo(f1, f2);
          this.N.moveTo(f1, f3);
          i1 = 0;
          while (i1 < this.ad)
          {
            g localg = (g)this.K.get(i1);
            this.M.lineTo(localg.b * this.B + f1, this.C - localg.a * this.A);
            localg = (g)this.L.get(i1);
            this.N.lineTo(localg.b * this.B + f1, this.C - localg.a * this.A);
            i1 += 1;
          }
        }
        i1 += 1;
      }
      this.e.setColor(this.i);
      paramCanvas.drawPath(this.M, this.e);
      this.e.setColor(this.h);
      paramCanvas.drawPath(this.N, this.e);
      paramCanvas.restore();
    } while (this.ad >= this.L.size());
    this.ac.sendEmptyMessageDelayed(0, this.ae);
  }
  
  private String c(String paramString)
  {
    String str = "";
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Calendar localCalendar = Calendar.getInstance();
    try
    {
      localCalendar.setTime(localSimpleDateFormat.parse(paramString));
      if (localCalendar.get(7) == 1) {
        str = "" + "星期天";
      }
      paramString = str;
      if (localCalendar.get(7) == 2) {
        paramString = str + "星期一";
      }
      str = paramString;
      if (localCalendar.get(7) == 3) {
        str = paramString + "星期二";
      }
      paramString = str;
      if (localCalendar.get(7) == 4) {
        paramString = str + "星期三";
      }
      str = paramString;
      if (localCalendar.get(7) == 5) {
        str = paramString + "星期四";
      }
      paramString = str;
      if (localCalendar.get(7) == 6) {
        paramString = str + "星期五";
      }
      str = paramString;
      if (localCalendar.get(7) == 7) {
        str = paramString + "星期六";
      }
      return str;
    }
    catch (ParseException paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
      }
    }
  }
  
  private void c()
  {
    this.K.clear();
    this.L.clear();
    int i1 = 0;
    while (i1 < this.z.size())
    {
      Object localObject2 = ((com.android.dazhihui.ui.delegate.newtrade.b.a)this.z.get(i1)).d;
      Object localObject1 = ((com.android.dazhihui.ui.delegate.newtrade.b.a)this.z.get(i1)).c;
      int i2 = a(this.H, ((com.android.dazhihui.ui.delegate.newtrade.b.a)this.z.get(i1)).a);
      localObject2 = new g(this, new BigDecimal((String)localObject2).floatValue(), i2 + 1);
      localObject1 = new g(this, new BigDecimal((String)localObject1).floatValue(), i2 + 1);
      this.K.add(localObject2);
      this.L.add(localObject1);
      i1 += 1;
    }
  }
  
  private void c(Canvas paramCanvas)
  {
    paramCanvas.save();
    float f1 = this.Q + getPaddingLeft() + this.V;
    int i1 = this.O;
    int i2 = this.T;
    int i3 = this.R / 2;
    int i4 = this.O;
    int i5 = this.T;
    int i6 = (this.O - this.T) / (this.E - 1);
    int i7 = this.E;
    int i8 = this.R / 2;
    this.e.setStrokeWidth(this.ab);
    this.e.setColor(this.l);
    paramCanvas.drawLine(this.B * this.af + f1, i3 + (i1 - i2), this.B * this.af + f1, i4 - i5 - i6 * (i7 - 1) + i8, this.e);
    Object localObject2 = NumberFormat.getPercentInstance();
    ((NumberFormat)localObject2).setMaximumFractionDigits(2);
    String str = b(((com.android.dazhihui.ui.delegate.newtrade.b.a)this.z.get(this.ag)).a) + " " + c(b(((com.android.dazhihui.ui.delegate.newtrade.b.a)this.z.get(this.ag)).a));
    i1 = com.android.dazhihui.d.a.c(str, this.s);
    i2 = com.android.dazhihui.d.a.b(str, this.s);
    Object localObject1 = com.android.dazhihui.ui.delegate.a.a().c();
    label445:
    float f3;
    float f4;
    g localg;
    float f2;
    if (this.ag == 0)
    {
      f1 = new BigDecimal(((com.android.dazhihui.ui.delegate.newtrade.b.a)this.z.get(this.ag)).c).floatValue();
      localObject1 = ((c)localObject1).c() + "-" + "*" + ((c)localObject1).d().substring(((c)localObject1).d().length() - 3) + ":" + ((NumberFormat)localObject2).format(f1);
      i3 = com.android.dazhihui.d.a.c((String)localObject1, this.r);
      i4 = com.android.dazhihui.d.a.b((String)localObject1, this.r);
      if (this.ag != 0) {
        break label1316;
      }
      f1 = new BigDecimal(((com.android.dazhihui.ui.delegate.newtrade.b.a)this.z.get(this.ag)).d).floatValue();
      localObject2 = "上证指数:" + ((NumberFormat)localObject2).format(f1);
      i5 = com.android.dazhihui.d.a.c((String)localObject2, this.r);
      com.android.dazhihui.d.a.b((String)localObject2, this.r);
      f3 = Math.max(i2, i4) + this.c * 2.0F;
      f4 = i5 + (i1 + i3) + this.c * 4.0F;
      localg = (g)this.K.get(this.ag);
      if (localg.b * this.B < this.d + f3) {
        break label1366;
      }
      f2 = this.Q + getPaddingLeft() + this.V + localg.b * this.B - this.d - f3;
      label607:
      if (this.ah >= f4 / 2.0F) {
        break label1410;
      }
      f1 = 0.0F;
    }
    for (;;)
    {
      this.e.setColor(-1);
      this.e.setStyle(Paint.Style.FILL);
      paramCanvas.drawRect(f2, f1, f2 + f3, f1 + f4, this.e);
      this.e.setColor(this.j);
      this.e.setStyle(Paint.Style.STROKE);
      paramCanvas.drawRect(f2, f1, f2 + f3, f1 + f4, this.e);
      this.e.setStyle(Paint.Style.FILL);
      this.e.setColor(this.q);
      this.e.setTextSize(this.s);
      this.e.setFakeBoldText(true);
      com.android.dazhihui.d.a.a(str, (int)(this.c + f2), (int)(this.c + f1), Paint.Align.LEFT, paramCanvas, this.e);
      this.e.setFakeBoldText(false);
      this.e.setTextSize(this.r);
      this.e.setColor(this.p);
      com.android.dazhihui.d.a.a((String)localObject1, (int)(this.c + f2), (int)(i1 + f1 + this.c * 2.0F), Paint.Align.LEFT, paramCanvas, this.e);
      com.android.dazhihui.d.a.a((String)localObject2, (int)(this.c + f2), (int)(i1 + f1 + i3 + this.c * 3.0F), Paint.Align.LEFT, paramCanvas, this.e);
      f1 = this.Q + getPaddingLeft() + this.V;
      f1 = localg.b * this.B + f1;
      f2 = this.C - ((g)this.L.get(this.ag)).a * this.A;
      f3 = this.C - ((g)this.K.get(this.ag)).a * this.A;
      this.e.setAntiAlias(true);
      this.e.setStyle(Paint.Style.FILL);
      this.e.setColor(this.i);
      paramCanvas.drawCircle(f1, f3, this.v, this.e);
      this.e.setStrokeWidth(this.w);
      this.e.setStyle(Paint.Style.STROKE);
      this.e.setColor(-1);
      paramCanvas.drawCircle(f1, f3, this.v + this.w / 2, this.e);
      this.e.setStrokeWidth(this.x);
      this.e.setColor(getResources().getColor(2131492963));
      paramCanvas.drawCircle(f1, f3, this.v + this.w + this.x / 2, this.e);
      this.e.setAntiAlias(true);
      this.e.setStyle(Paint.Style.FILL);
      this.e.setColor(this.h);
      paramCanvas.drawCircle(f1, f2, this.v, this.e);
      this.e.setStrokeWidth(this.w);
      this.e.setStyle(Paint.Style.STROKE);
      this.e.setColor(-1);
      paramCanvas.drawCircle(f1, f2, this.v + this.w / 2, this.e);
      this.e.setStrokeWidth(this.x);
      this.e.setColor(getResources().getColor(2131492971));
      paramCanvas.drawCircle(f1, f2, this.v + this.w + this.x / 2, this.e);
      return;
      f1 = n.i(((com.android.dazhihui.ui.delegate.newtrade.b.a)this.z.get(this.ag)).c, ((com.android.dazhihui.ui.delegate.newtrade.b.a)this.z.get(this.ag - 1)).c).floatValue();
      break;
      label1316:
      f1 = n.i(((com.android.dazhihui.ui.delegate.newtrade.b.a)this.z.get(this.ag)).d, ((com.android.dazhihui.ui.delegate.newtrade.b.a)this.z.get(this.ag - 1)).d).floatValue();
      break label445;
      label1366:
      f1 = this.Q + getPaddingLeft() + this.V;
      f2 = localg.b;
      float f5 = this.B;
      f2 = this.d + (f1 + f2 * f5);
      break label607;
      label1410:
      if (this.ah > this.O - this.T - f4 / 2.0F) {
        f1 = this.O - this.T - f4;
      } else {
        f1 = this.ah - f4 / 2.0F;
      }
    }
  }
  
  private void setParentScrollAble(boolean paramBoolean)
  {
    ScrollView localScrollView = this.ai;
    if (!paramBoolean) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      localScrollView.requestDisallowInterceptTouchEvent(paramBoolean);
      return;
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    a(paramCanvas);
    b(paramCanvas);
    if ((this.af != -1) && (this.ag != -1)) {
      c(paramCanvas);
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = -1;
    float f1 = paramMotionEvent.getX();
    this.ah = (paramMotionEvent.getY() - paramMotionEvent.getFlags());
    if ((this.z == null) || (this.L.size() != this.K.size()) || (this.L.size() != this.z.size()) || (this.B == 0.0F)) {}
    float f2;
    do
    {
      return true;
      if (paramMotionEvent.getAction() != 0) {
        break;
      }
      this.ac.sendEmptyMessageDelayed(6, 180L);
      this.ac.sendEmptyMessageDelayed(5, 2000L);
      f2 = this.Q + getPaddingLeft() + this.V;
    } while ((f1 <= f2) || (f1 >= this.P + getPaddingRight()));
    f1 = n.a(f1 - f2 + "", this.B + "", 2).floatValue();
    int i2 = 0;
    label205:
    if (i2 < this.K.size()) {
      if ((i2 == 0) && (f1 <= ((g)this.K.get(i2)).b)) {
        i1 = ((g)this.K.get(i2)).b;
      }
    }
    for (;;)
    {
      this.af = i1;
      this.ag = i2;
      invalidate();
      return true;
      if (paramMotionEvent.getAction() == 1)
      {
        this.ac.removeMessages(6);
        setParentScrollAble(true);
        this.ac.removeMessages(5);
        this.ac.sendEmptyMessageDelayed(5, 2000L);
        break;
      }
      if (paramMotionEvent.getAction() != 2) {
        break;
      }
      break;
      if ((i2 == this.K.size() - 1) && (f1 >= ((g)this.K.get(i2)).b))
      {
        i1 = ((g)this.K.get(i2)).b;
      }
      else if ((f1 >= ((g)this.K.get(i2)).b) && (f1 <= ((g)this.K.get(i2 + 1)).b))
      {
        if (f1 - ((g)this.K.get(i2)).b <= ((g)this.K.get(i2 + 1)).b - f1)
        {
          i1 = ((g)this.K.get(i2)).b;
        }
        else
        {
          i1 = ((g)this.K.get(i2 + 1)).b;
          i2 += 1;
        }
      }
      else
      {
        i2 += 1;
        break label205;
        i2 = -1;
      }
    }
  }
  
  public void setParentScroll(ScrollView paramScrollView)
  {
    this.ai = paramScrollView;
  }
  
  public void setPeriodDate(int paramInt)
  {
    this.y = paramInt;
    this.af = -1;
    invalidate();
  }
  
  public void setReturnRateList(List<com.android.dazhihui.ui.delegate.newtrade.b.a> paramList)
  {
    this.af = -1;
    this.ag = -1;
    this.ac.removeMessages(0);
    b();
    this.z = paramList;
    this.z.add(0, new com.android.dazhihui.ui.delegate.newtrade.b.a(a(this.H), "0", "0", "0"));
    this.ad = 0;
    this.ae = 100;
    a();
    c();
    invalidate();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\widge\CaptialTrendChart.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */