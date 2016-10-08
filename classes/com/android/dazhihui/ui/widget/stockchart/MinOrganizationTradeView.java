package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.WindowManager;
import com.android.dazhihui.d.a;
import com.android.dazhihui.d.b;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.LargeTradeInfo;
import com.android.dazhihui.ui.model.stock.StockVo.Api2931Item;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.kf;
import java.util.Vector;

public class MinOrganizationTradeView
  extends View
{
  protected DisplayMetrics a = null;
  private int b = 0;
  private int c = 0;
  private int d = 0;
  private int e = 0;
  private int f;
  private int g;
  private int h;
  private int i;
  private kf j;
  private int k = 10;
  private int[] l = { -1099463, -11753174, -1099463, -11753174, -1099463, -11753174 };
  private int m = -12961221;
  private int n = -12961221;
  private Paint o = new Paint(1);
  private String[] p = null;
  private al q = null;
  private MinListTabView r;
  private int s = 0;
  private int t = 0;
  private int u;
  private int v = 0;
  
  public MinOrganizationTradeView(Context paramContext)
  {
    this(paramContext, null, 0);
  }
  
  public MinOrganizationTradeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public MinOrganizationTradeView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramAttributeSet = (WindowManager)paramContext.getSystemService("window");
    this.a = new DisplayMetrics();
    paramAttributeSet.getDefaultDisplay().getMetrics(this.a);
    paramContext = paramContext.getResources();
    this.c = paramContext.getDimensionPixelSize(2131230967);
    this.b = paramContext.getDimensionPixelSize(2131230986);
    this.d = 12;
    this.e = (this.b + this.d);
    this.p = paramContext.getStringArray(2131361795);
    a(g.a().b());
  }
  
  public void a(y paramy)
  {
    if (paramy == y.b)
    {
      this.u = -14540254;
      this.l[2] = getResources().getColor(2131493333);
      this.l[3] = getResources().getColor(2131493330);
      this.m = -3618616;
    }
    for (this.n = -2697514;; this.n = -12961221)
    {
      postInvalidate();
      return;
      this.u = getResources().getColor(2131493677);
      this.l[2] = -1099463;
      this.l[3] = -11753174;
      this.m = -12961221;
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.save();
    if ((this.h == 0) || (this.i == 0))
    {
      paramCanvas.restore();
      return;
    }
    if ((this.r != null) && (this.r.getTradeInfo() != null)) {
      this.s = this.r.getTradeInfo().getFoodNum();
    }
    int i3;
    int i2;
    for (this.t = this.r.getTradeInfo().getSpitNum();; this.t = 0)
    {
      i3 = this.h / 2;
      a.c(this.f, this.g, this.h, this.i, paramCanvas);
      a.a.setColor(this.m);
      a.a(this.f, this.g, this.h, this.i, paramCanvas);
      i1 = this.g;
      a.b.setColor(this.u);
      a.b.setTextSize(this.b);
      this.o.setColor(this.u);
      this.o.setTextSize(this.b);
      b.a(paramCanvas, "机构吃货", this.f + 5, i1, this.b, 4);
      a.a(this.s + "笔", i3 - 5, i1, Paint.Align.RIGHT, paramCanvas, this.o);
      b.a(paramCanvas, "机构吐货", i3 + 5, i1, this.b, 4);
      a.a(this.t + "笔", this.h - 5, i1, Paint.Align.RIGHT, paramCanvas, this.o);
      i1 += this.e;
      a.a(this.f, i1, this.h, i1, this.n, paramCanvas);
      i2 = i1 + this.d;
      if ((this.r != null) && (this.r.getTradeInfo() != null)) {
        break;
      }
      paramCanvas.restore();
      return;
      this.s = 0;
    }
    if ((this.r.getTradeInfo().getTradeElems() == null) || (this.r.getTradeInfo().getTradeElems().size() == 0))
    {
      paramCanvas.restore();
      return;
    }
    int i1 = this.r.getTradeInfo().getTradeElems().size() - 1;
    for (;;)
    {
      if (i1 >= 0)
      {
        int i4 = ((StockVo.Api2931Item)this.r.getTradeInfo().getTradeElems().get(i1)).type;
        if ((i4 < 0) || (i4 >= this.p.length)) {
          break label789;
        }
        this.o.setColor(this.l[i4]);
        a.a(this.p[i4], i3, i2, Paint.Align.CENTER, paramCanvas, this.o);
        a.a(((StockVo.Api2931Item)this.r.getTradeInfo().getTradeElems().get(i1)).time, this.f + 10, i2, Paint.Align.LEFT, paramCanvas, this.o);
        a.a(((StockVo.Api2931Item)this.r.getTradeInfo().getTradeElems().get(i1)).vol + "", this.h - 6, i2, Paint.Align.RIGHT, paramCanvas, this.o);
      }
      while (i2 > this.i - this.e - this.d)
      {
        this.o.setColor(-2628628);
        if (this.r.d)
        {
          i2 = this.i - this.e;
          i1 = a.b("点击查看更多", this.b);
          a.a("点击查看更多", this.h / 2, i2, Paint.Align.CENTER, paramCanvas, this.o);
          this.j = new kf((this.h - i1) / 2, i2, i1, this.e);
          i2 = (this.h - i1 - 4) / 2;
          i3 = this.i - this.d - this.b / 2;
          a.b(this.f, i3, i2, i3, paramCanvas);
          a.b(i2 + this.f + i1 + 4, i3, this.h, i3, paramCanvas);
        }
        a.a(this.f, this.i, this.h, this.i, this.m, paramCanvas);
        paramCanvas.restore();
        return;
        label789:
        this.o.setColor(this.l[0]);
        a.a("", i3, i2, Paint.Align.CENTER, paramCanvas, this.o);
        a.a(((StockVo.Api2931Item)this.r.getTradeInfo().getTradeElems().get(i1)).time, this.f + 10, i2, Paint.Align.LEFT, paramCanvas, this.o);
        a.a(((StockVo.Api2931Item)this.r.getTradeInfo().getTradeElems().get(i1)).vol + "", this.h - 6, i2, Paint.Align.RIGHT, paramCanvas, this.o);
      }
      i2 += this.e + this.d;
      i1 -= 1;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getSize(paramInt1);
    int i2 = View.MeasureSpec.getMode(paramInt2);
    paramInt1 = View.MeasureSpec.getSize(paramInt2);
    if (i2 != 1073741824)
    {
      if ((this.r != null) && (this.r.getTradeInfo() != null) && ((this.r.getTradeInfo() == null) || (this.r.getTradeInfo().getTradeElems() != null))) {
        break label81;
      }
      paramInt1 = this.e + this.d;
    }
    for (;;)
    {
      setMeasuredDimension(i1, paramInt1);
      return;
      label81:
      if ((this.r != null) && (this.r.d))
      {
        this.k = this.r.getTradeInfo().getTradeElems().size();
        paramInt1 = this.c + (this.e + this.d) * (this.k + 2);
      }
      else
      {
        this.k = this.r.getTradeInfo().getTradeElems().size();
        paramInt1 = (this.e + this.d) * (this.k + 1);
      }
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.h = paramInt1;
    this.i = paramInt2;
    this.f = 0;
    this.g = 0;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    }
    int i1;
    int i2;
    do
    {
      return super.onTouchEvent(paramMotionEvent);
      i1 = (int)paramMotionEvent.getX();
      i2 = (int)paramMotionEvent.getY();
    } while ((this.j == null) || (!this.j.a(i1, i2)) || (this.q == null));
    this.q.a();
    return true;
  }
  
  public void setHolder(MinListTabView paramMinListTabView)
  {
    this.r = paramMinListTabView;
  }
  
  public void setOnMoreClickListener(al paramal)
  {
    this.q = paramal;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\MinOrganizationTradeView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */