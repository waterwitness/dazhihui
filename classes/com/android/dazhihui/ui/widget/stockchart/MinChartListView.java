package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import com.android.dazhihui.d.r;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.stock.uv;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.mh;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

class MinChartListView
  extends View
{
  public static int a = 0;
  public static int b = 1;
  private MinChartContainer c;
  private int d;
  private List<mh> e;
  private List<mh> f;
  private int g;
  private int h;
  private String[] i = getResources().getStringArray(2131361871);
  private String[] j = getResources().getStringArray(2131361863);
  private Drawable k = getResources().getDrawable(2130838406);
  private Drawable l = getResources().getDrawable(2130838404);
  private int m = getResources().getDimensionPixelOffset(2131230827);
  private int n = getResources().getDimensionPixelOffset(2131230829);
  private int o = getResources().getDimensionPixelSize(2131230780);
  private int p = getResources().getDimensionPixelSize(2131230788);
  private int q = getResources().getDimensionPixelSize(2131230820);
  private Paint r = new Paint(1);
  private Rect s = new Rect();
  private Paint.FontMetricsInt t;
  private int u = -7829368;
  private int v;
  private int w;
  private y x;
  
  public MinChartListView(Context paramContext)
  {
    this(paramContext, null, 0);
  }
  
  public MinChartListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public MinChartListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(g.a().b());
  }
  
  public int a(Canvas paramCanvas)
  {
    int i3 = this.h;
    this.r.setStrokeWidth(1.0F);
    this.k.setBounds(this.n + 0, (this.m - this.k.getMinimumWidth()) / 2, this.n + this.k.getMinimumWidth(), (this.m - this.k.getMinimumWidth()) / 2 + this.k.getMinimumHeight());
    this.k.draw(paramCanvas);
    this.r.setTextSize(this.o);
    this.r.setColor(this.v);
    this.r.setTextAlign(Paint.Align.LEFT);
    this.r.getTextBounds("板块资金", 0, "板块资金".length(), this.s);
    this.t = this.r.getFontMetricsInt();
    paramCanvas.drawText("板块资金", this.n * 2 + 0 + this.k.getMinimumWidth(), this.m / 2 - this.s.height() / 2 + 0 - this.t.ascent - 3, this.r);
    int i1 = i3 - this.l.getMinimumWidth() - this.n;
    this.l.setBounds(i1, (this.m - this.l.getMinimumHeight()) / 2, i3 - this.n, (this.m - this.l.getMinimumHeight()) / 2 + this.l.getMinimumHeight());
    this.l.draw(paramCanvas);
    this.r.setTextAlign(Paint.Align.LEFT);
    paramCanvas.drawText("更多", i1 - this.n * 2 - this.k.getMinimumWidth(), this.m / 2 - this.s.height() / 2 + 0 - this.t.ascent - 3, this.r);
    i1 = this.m;
    this.r.setTextSize(this.p);
    this.r.setColor(this.u);
    paramCanvas.drawLine(0.0F, i1, i3, i1, this.r);
    this.r.setTextAlign(Paint.Align.LEFT);
    this.t = this.r.getFontMetricsInt();
    this.r.setColor(this.v);
    this.r.getTextBounds(this.i[0], 0, this.i[0].length(), this.s);
    paramCanvas.drawText(this.i[0], this.n + 0, (this.m - this.s.height()) / 2 + i1 - this.t.ascent, this.r);
    this.r.setTextAlign(Paint.Align.CENTER);
    paramCanvas.drawText(this.i[2], i3 / 2, (this.m - this.s.height()) / 2 + i1 - this.t.ascent, this.r);
    paramCanvas.drawText(this.i[1], i3 / 2 - this.q * 2, (this.m - this.s.height()) / 2 + i1 - this.t.ascent, this.r);
    paramCanvas.drawText(this.i[3], i3 / 2 + this.q * 2, (this.m - this.s.height()) / 2 + i1 - this.t.ascent, this.r);
    this.r.setTextAlign(Paint.Align.RIGHT);
    paramCanvas.drawText(this.i[4], i3 - this.n, (this.m - this.s.height()) / 2 + i1 - this.t.ascent, this.r);
    int i2 = i1 + this.m;
    this.r.setColor(this.u);
    paramCanvas.drawLine(0.0F, i2, i3, i2, this.r);
    this.r.setTextSize(this.o);
    i1 = 0;
    while (i1 < this.e.size())
    {
      this.r.setTextAlign(Paint.Align.LEFT);
      this.t = this.r.getFontMetricsInt();
      this.r.setColor(this.v);
      paramCanvas.drawText(((mh)this.e.get(i1)).a[0], this.n + 0, (this.m - this.o * 2) / 3 + i2 + this.o, this.r);
      paramCanvas.drawText(((mh)this.e.get(i1)).d, this.n + 0, (this.m - this.o * 2) * 2 / 3 + i2 + this.o * 2, this.r);
      this.r.setTextAlign(Paint.Align.CENTER);
      this.r.setColor(((mh)this.e.get(i1)).b[2]);
      paramCanvas.drawText(((mh)this.e.get(i1)).a[2], i3 / 2, (this.m - this.o) / 2 + i2 + this.o, this.r);
      this.r.setColor(((mh)this.e.get(i1)).b[1]);
      paramCanvas.drawText(((mh)this.e.get(i1)).a[1], i3 / 2 - this.q * 2, (this.m - this.o) / 2 + i2 + this.o, this.r);
      this.r.setColor(((mh)this.e.get(i1)).b[3]);
      paramCanvas.drawText(((mh)this.e.get(i1)).a[3], i3 / 2 + this.q * 2, (this.m - this.o) / 2 + i2 + this.o, this.r);
      this.r.setTextAlign(Paint.Align.RIGHT);
      this.r.setColor(((mh)this.e.get(i1)).b[4]);
      if (this.x == y.b) {
        this.r.setColor(this.w);
      }
      paramCanvas.drawText(((mh)this.e.get(i1)).a[4], i3 - this.n, (this.m - this.o) / 2 + i2 + this.o, this.r);
      i2 += this.m;
      this.r.setColor(this.u);
      paramCanvas.drawLine(0.0F, i2, i3, i2, this.r);
      i1 += 1;
    }
    return i2;
  }
  
  public void a()
  {
    if (this.e != null) {
      this.e.clear();
    }
    if (this.f != null) {
      this.f.clear();
    }
    this.g = 0;
  }
  
  public void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  public void a(y paramy)
  {
    this.x = paramy;
    if (paramy == y.a)
    {
      this.u = -12961221;
      this.v = getResources().getColor(2131493099);
      this.l = getResources().getDrawable(2130838404);
    }
    for (;;)
    {
      postInvalidate();
      return;
      this.v = -14540254;
      this.u = -2697514;
      this.l = getResources().getDrawable(2130838405);
      this.w = -10066330;
    }
  }
  
  public void a(MinChartContainer paramMinChartContainer)
  {
    this.c = paramMinChartContainer;
  }
  
  public void a(List<mh> paramList)
  {
    this.e = paramList;
  }
  
  public int b(Canvas paramCanvas)
  {
    int i4 = this.h;
    this.k.getMinimumHeight();
    int i6 = this.k.getMinimumWidth();
    int i5 = this.l.getMinimumHeight();
    int i7 = this.l.getMinimumWidth();
    this.r.setStrokeWidth(1.0F);
    this.k.setBounds(this.n + 0, (this.m - this.k.getMinimumHeight()) / 2, this.n + 0 + this.k.getMinimumWidth(), (this.m - this.k.getMinimumHeight()) / 2 + this.k.getMinimumHeight());
    this.k.draw(paramCanvas);
    this.r.setTextSize(this.o);
    this.r.setColor(this.v);
    this.r.setTextAlign(Paint.Align.LEFT);
    this.r.getTextBounds("板块资金", 0, "板块资金".length(), this.s);
    this.t = this.r.getFontMetricsInt();
    paramCanvas.drawText("板块资金", 0 + this.n * 2 + this.k.getMinimumWidth(), this.m / 2 - this.s.height() / 2 + 0 - this.t.ascent - 3, this.r);
    int i1 = i4 - this.l.getMinimumWidth() - this.n;
    this.l.setBounds(i1, (this.m - this.l.getMinimumHeight()) / 2, i4 - this.n, (this.m - this.l.getMinimumHeight()) / 2 + this.l.getMinimumHeight());
    this.l.draw(paramCanvas);
    this.r.setTextAlign(Paint.Align.LEFT);
    paramCanvas.drawText("更多", i1 - this.n * 2 - this.k.getMinimumWidth(), 0 + (this.m / 2 - this.s.height() / 2) - this.t.ascent - 3, this.r);
    i1 = this.m;
    this.r.setTextSize(this.p);
    this.r.setColor(this.u);
    paramCanvas.drawLine(0.0F, i1, i4, i1, this.r);
    this.r.setColor(this.v);
    this.r.setTextAlign(Paint.Align.LEFT);
    this.t = this.r.getFontMetricsInt();
    this.r.getTextBounds(this.i[0], 0, this.i[0].length(), this.s);
    paramCanvas.drawText(this.j[0], this.n + 0, (this.m - this.s.height()) / 2 + i1 - this.t.ascent, this.r);
    this.r.setTextAlign(Paint.Align.RIGHT);
    paramCanvas.drawText(this.j[3], i4 - this.n, (this.m - this.s.height()) / 2 + i1 - this.t.ascent, this.r);
    this.r.setTextAlign(Paint.Align.CENTER);
    paramCanvas.drawText(this.j[2], i4 / 2 + this.q * 3 / 2, (this.m - this.s.height()) / 2 + i1 - this.t.ascent, this.r);
    paramCanvas.drawText(this.j[1], i4 / 2 - this.q * 3 / 2, (this.m - this.s.height()) / 2 + i1 - this.t.ascent, this.r);
    i1 += this.m;
    this.r.setColor(this.u);
    paramCanvas.drawLine(0.0F, i1, i4, i1, this.r);
    this.r.setTextSize(this.o);
    int i2;
    if (this.e != null)
    {
      i2 = 0;
      for (;;)
      {
        i3 = i1;
        if (i2 >= this.e.size()) {
          break;
        }
        this.r.setTextAlign(Paint.Align.LEFT);
        this.t = this.r.getFontMetricsInt();
        this.r.setColor(this.v);
        paramCanvas.drawText(((mh)this.e.get(i2)).a[0], this.n + 0, (this.m - this.o * 2) / 3 + i1 + this.o, this.r);
        paramCanvas.drawText(((mh)this.e.get(i2)).d, this.n + 0, (this.m - this.o * 2) * 2 / 3 + i1 + this.o * 2, this.r);
        this.r.setTextAlign(Paint.Align.CENTER);
        this.r.setColor(((mh)this.e.get(i2)).b[1]);
        paramCanvas.drawText(((mh)this.e.get(i2)).a[1], i4 / 2 - this.q * 3 / 2, (this.m - this.o) / 2 + i1 + this.o, this.r);
        this.r.setColor(((mh)this.e.get(i2)).b[2]);
        paramCanvas.drawText(((mh)this.e.get(i2)).a[2], i4 / 2 + this.q * 3 / 2, (this.m - this.o) / 2 + i1 + this.o, this.r);
        this.r.setTextAlign(Paint.Align.RIGHT);
        this.r.setColor(((mh)this.e.get(i2)).b[3]);
        paramCanvas.drawText(((mh)this.e.get(i2)).a[3], i4 - this.n, (this.m - this.o) / 2 + i1 + this.o, this.r);
        i1 += this.m;
        this.r.setColor(this.u);
        paramCanvas.drawLine(0.0F, i1, i4, i1, this.r);
        i2 += 1;
      }
    }
    int i3 = i1;
    this.k.setBounds(this.n + 0, (this.m - i6) / 2 + i3, this.n + 0 + this.k.getMinimumWidth(), (this.m - this.k.getMinimumHeight()) / 2 + i3 + this.k.getMinimumHeight());
    this.k.draw(paramCanvas);
    this.r.setTextSize(this.o);
    this.r.setColor(this.v);
    this.r.setTextAlign(Paint.Align.LEFT);
    this.r.getTextBounds("个股资金", 0, "板块资金".length(), this.s);
    this.t = this.r.getFontMetricsInt();
    paramCanvas.drawText("个股资金", 0 + this.n * 2 + this.k.getMinimumWidth(), this.m / 2 - this.s.height() / 2 + i3 - this.t.ascent - 3, this.r);
    i1 = i4 - i7 - this.n;
    this.l.setBounds(i1, (this.m - i5) / 2 + i3, i4 - this.n, (this.m - i5) / 2 + i3 + i5);
    this.l.draw(paramCanvas);
    this.r.setTextAlign(Paint.Align.LEFT);
    paramCanvas.drawText("更多", i1 - this.n * 2 - this.k.getMinimumWidth(), this.m / 2 - this.s.height() / 2 + i3 - this.t.ascent - 3, this.r);
    i1 = i3 + this.m;
    this.r.setTextSize(this.p);
    this.r.setColor(this.u);
    paramCanvas.drawLine(0.0F, i1, i4, i1, this.r);
    this.r.setTextAlign(Paint.Align.LEFT);
    this.r.setColor(this.v);
    this.t = this.r.getFontMetricsInt();
    this.r.getTextBounds(this.i[0], 0, this.i[0].length(), this.s);
    paramCanvas.drawText(this.j[0], this.n + 0, (this.m - this.s.height()) / 2 + i1 - this.t.ascent, this.r);
    this.r.setTextAlign(Paint.Align.RIGHT);
    paramCanvas.drawText(this.j[3], i4 - this.n, (this.m - this.s.height()) / 2 + i1 - this.t.ascent, this.r);
    this.r.setTextAlign(Paint.Align.CENTER);
    paramCanvas.drawText(this.j[2], i4 / 2 + this.q * 3 / 2, (this.m - this.s.height()) / 2 + i1 - this.t.ascent, this.r);
    paramCanvas.drawText(this.j[1], i4 / 2 - this.q * 3 / 2, (this.m - this.s.height()) / 2 + i1 - this.t.ascent, this.r);
    i1 += this.m;
    this.r.setColor(this.u);
    paramCanvas.drawLine(0.0F, i1, i4, i1, this.r);
    this.r.setTextSize(this.o);
    if (this.f != null)
    {
      i2 = 0;
      for (;;)
      {
        i3 = i1;
        if (i2 >= this.f.size()) {
          break;
        }
        this.r.setTextAlign(Paint.Align.LEFT);
        this.t = this.r.getFontMetricsInt();
        this.r.setColor(this.v);
        paramCanvas.drawText(((mh)this.f.get(i2)).a[0], this.n + 0, (this.m - this.o * 2) / 3 + i1 + this.o, this.r);
        paramCanvas.drawText(((mh)this.f.get(i2)).d, this.n + 0, (this.m - this.o * 2) * 2 / 3 + i1 + this.o * 2, this.r);
        this.r.setTextAlign(Paint.Align.CENTER);
        this.r.setColor(((mh)this.f.get(i2)).b[1]);
        paramCanvas.drawText(((mh)this.f.get(i2)).a[1], i4 / 2 - this.q * 3 / 2, (this.m - this.o) / 2 + i1 + this.o, this.r);
        this.r.setColor(((mh)this.f.get(i2)).b[2]);
        paramCanvas.drawText(((mh)this.f.get(i2)).a[2], i4 / 2 + this.q * 3 / 2, (this.m - this.o) / 2 + i1 + this.o, this.r);
        this.r.setTextAlign(Paint.Align.RIGHT);
        this.r.setColor(((mh)this.f.get(i2)).b[3]);
        paramCanvas.drawText(((mh)this.f.get(i2)).a[3], i4 - this.n, (this.m - this.o) / 2 + i1 + this.o, this.r);
        i1 += this.m;
        this.r.setColor(this.u);
        paramCanvas.drawLine(0.0F, i1, i4, i1, this.r);
        i2 += 1;
      }
    }
    i3 = i1;
    return i3;
  }
  
  public void b(List<mh> paramList)
  {
    this.f = paramList;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.d == a) {
      if ((this.e != null) && (this.e.size() != 0)) {}
    }
    label94:
    for (;;)
    {
      return;
      for (int i1 = a(paramCanvas);; i1 = b(paramCanvas))
      {
        if (i1 == this.g) {
          break label94;
        }
        this.g = i1;
        ((LinearLayout.LayoutParams)getLayoutParams()).height = this.g;
        requestLayout();
        return;
        if ((this.f == null) && (this.e == null)) {
          break;
        }
      }
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.h = paramInt1;
    this.g = paramInt2;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getAction();
    int i2 = (int)paramMotionEvent.getX();
    i2 = (int)paramMotionEvent.getY();
    switch (i1)
    {
    default: 
      return true;
    }
    i1 = i2 / this.m + 1;
    if (this.d == a)
    {
      if ((this.e == null) || (this.e.size() == 0)) {
        return false;
      }
      if (i1 == 2) {
        return false;
      }
      if (i1 == 1) {
        r.a(this.c.getHolder().getHolder().getActivity(), null, 34);
      }
    }
    for (;;)
    {
      return false;
      if (i1 >= 3)
      {
        paramMotionEvent = new Vector();
        Object localObject = this.e.iterator();
        mh localmh;
        while (((Iterator)localObject).hasNext())
        {
          localmh = (mh)((Iterator)localObject).next();
          paramMotionEvent.add(new StockVo(localmh.a[0], (String)localmh.k[0], localmh.g, localmh.h));
        }
        localObject = new Bundle();
        ((Bundle)localObject).putParcelable("stock_vo", (Parcelable)paramMotionEvent.get(i1 - 3));
        r.a(getRootView().getContext(), paramMotionEvent, i1 - 3, (Bundle)localObject);
        continue;
        if ((this.e == null) || (this.e.size() == 0)) {
          return false;
        }
        if ((i1 == 2) || (i1 == 10)) {
          return false;
        }
        if (i1 == 1)
        {
          r.a(this.c.getHolder().getHolder().getActivity(), null, 38);
        }
        else if (i1 == 9)
        {
          r.a(this.c.getHolder().getHolder().getActivity(), null, 34);
        }
        else if (i1 > 8)
        {
          i1 -= 10;
          paramMotionEvent = new Vector();
          localObject = this.f.iterator();
          while (((Iterator)localObject).hasNext())
          {
            localmh = (mh)((Iterator)localObject).next();
            paramMotionEvent.add(new StockVo(localmh.a[0], (String)localmh.k[0], localmh.g, localmh.h));
          }
          localObject = new Bundle();
          ((Bundle)localObject).putParcelable("stock_vo", (Parcelable)paramMotionEvent.get(i1 - 1));
          r.a(getRootView().getContext(), paramMotionEvent, i1 - 1, (Bundle)localObject);
        }
        else if ((i1 >= 3) && (i1 <= 8))
        {
          if ((this.e != null) && (this.e.size() > 0))
          {
            paramMotionEvent = new Vector();
            localObject = this.e.iterator();
            while (((Iterator)localObject).hasNext())
            {
              localmh = (mh)((Iterator)localObject).next();
              paramMotionEvent.add(new StockVo(localmh.a[0], (String)localmh.k[0], localmh.g, localmh.h));
            }
            localObject = new Bundle();
            ((Bundle)localObject).putParcelable("stock_vo", (Parcelable)paramMotionEvent.get(i1 - 3));
            r.a(getRootView().getContext(), paramMotionEvent, i1 - 3, (Bundle)localObject);
          }
          else if ((this.f != null) && (this.f.size() > 0))
          {
            paramMotionEvent = new Vector();
            localObject = this.f.iterator();
            while (((Iterator)localObject).hasNext())
            {
              localmh = (mh)((Iterator)localObject).next();
              paramMotionEvent.add(new StockVo(localmh.a[0], (String)localmh.k[0], localmh.g, localmh.h));
            }
            localObject = new Bundle();
            ((Bundle)localObject).putParcelable("stock_vo", (Parcelable)paramMotionEvent.get(i1 - 3));
            r.a(getRootView().getContext(), paramMotionEvent, i1 - 3, (Bundle)localObject);
          }
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\MinChartListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */