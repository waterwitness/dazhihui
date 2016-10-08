package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import com.android.dazhihui.d.a;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.ContributeItem;
import com.android.dazhihui.ui.screen.y;
import java.util.Vector;

public class ContributeView
  extends View
{
  private int a = 15;
  private int b = 0;
  private int c = 0;
  private int d = 0;
  private int e = 0;
  private Vector<ContributeItem> f;
  private Vector<ContributeItem> g;
  private String[] h = { "名称", "涨幅", "跌幅", "点数" };
  private Paint i = new Paint(1);
  private Bitmap j;
  private NinePatch k;
  private int l = 0;
  private int m = -1;
  private y n;
  private int o;
  private int p;
  private float q;
  private float r;
  private ax s;
  private int t;
  
  public ContributeView(Context paramContext)
  {
    this(paramContext, null, 0);
  }
  
  public ContributeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ContributeView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = paramContext.getResources();
    this.e = paramContext.getDimensionPixelSize(2131231088);
    this.b = (this.e + this.a);
    this.j = BitmapFactory.decodeResource(paramContext, 2130838065);
    this.k = new NinePatch(this.j, this.j.getNinePatchChunk(), null);
    this.n = g.a().b();
    if (this.n == y.a)
    {
      this.o = getResources().getColor(2131493677);
      this.p = -12499378;
      return;
    }
    this.o = getResources().getColor(2131492903);
    this.p = getResources().getColor(2131493677);
  }
  
  public void a()
  {
    if (g.a().b() == y.a)
    {
      this.o = getResources().getColor(2131493677);
      this.p = -12499378;
      this.t = -10000537;
      return;
    }
    this.o = getResources().getColor(2131492903);
    this.p = getResources().getColor(2131493677);
    this.t = -2697514;
  }
  
  public int getLength()
  {
    if ((this.f == null) && (this.g == null)) {
      return 0;
    }
    if (this.f == null) {
      return this.g.size();
    }
    if (this.g == null) {
      return this.f.size();
    }
    if (this.f.size() > this.g.size()) {
      return this.f.size();
    }
    return this.g.size();
  }
  
  public Vector<ContributeItem> getMinContrs()
  {
    return this.g;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i3;
    do
    {
      i3 = a.b("浦发银行*", this.e);
      i1 = a.b("+00.00%", this.e);
      i2 = a.b("+0.00", this.e);
      this.e -= 2;
    } while (i3 + i1 + i2 > this.c / 2 - 8);
    this.e += 2;
    int i4 = (this.c / 2 - i3 - i1 - i2 - 8) / 2;
    paramCanvas.save();
    if (this.m >= 0) {
      if (this.l != 0) {
        break label615;
      }
    }
    Object localObject;
    ContributeItem localContributeItem;
    label615:
    for (int i1 = 0;; i1 = this.c / 2)
    {
      i2 = (this.m + 1) * (this.b + this.a);
      localObject = new RectF(i1, i2, i1 + this.c / 2, i2 + this.b + this.a);
      this.k.draw(paramCanvas, (RectF)localObject);
      this.m = -1;
      a.d.setColor(this.t);
      this.i.setTextSize(this.e);
      this.i.setColor(this.o);
      i1 = this.a;
      a.a(this.h[0], 4, i1, Paint.Align.LEFT, paramCanvas, this.i);
      a.a(this.h[1], i3 + 4 + i4, i1, Paint.Align.LEFT, paramCanvas, this.i);
      a.a(this.h[3], this.c / 2 - 10, i1, Paint.Align.RIGHT, paramCanvas, this.i);
      a.a(this.h[0], this.c / 2 + 4, i1, Paint.Align.LEFT, paramCanvas, this.i);
      a.a(this.h[2], this.c / 2 + 4 + i3 + i4, i1, Paint.Align.LEFT, paramCanvas, this.i);
      a.a(this.h[3], this.c - 10, i1, Paint.Align.RIGHT, paramCanvas, this.i);
      i2 = i1 + this.b;
      a.b(0, i2, this.c, i2, paramCanvas);
      if (this.f == null) {
        break;
      }
      i1 = 0;
      while (i1 < this.f.size())
      {
        localContributeItem = (ContributeItem)this.f.get(i1);
        localObject = localContributeItem.getName();
        if (localContributeItem.getName().length() > 4) {
          localObject = localContributeItem.getName().substring(0, 4) + "*";
        }
        i2 = this.a + i2;
        this.i.setColor(-7829368);
        a.a((String)localObject, 4, i2, Paint.Align.LEFT, paramCanvas, this.i);
        this.i.setColor(-65536);
        a.a(localContributeItem.getRise(), i3 + 4 + i4, i2, Paint.Align.LEFT, paramCanvas, this.i);
        a.a(localContributeItem.getPoint(), this.c / 2 - 4, i2, Paint.Align.RIGHT, paramCanvas, this.i);
        i2 += this.b;
        a.b(0, i2, this.c / 2, i2, paramCanvas);
        i1 += 1;
      }
    }
    i1 = this.b;
    int i2 = this.a + i1;
    if (this.g != null)
    {
      i1 = 0;
      while (i1 < this.g.size())
      {
        localContributeItem = (ContributeItem)this.g.get(i1);
        localObject = localContributeItem.getName();
        if (localContributeItem.getName().length() > 4) {
          localObject = localContributeItem.getName().substring(0, 4) + "*";
        }
        i2 = this.a + i2;
        this.i.setColor(-7829368);
        a.a((String)localObject, this.c / 2 + 4, i2, Paint.Align.LEFT, paramCanvas, this.i);
        this.i.setColor(-16711936);
        a.a(localContributeItem.getRise(), this.c / 2 + 4 + i3 + i4, i2, Paint.Align.LEFT, paramCanvas, this.i);
        a.a(localContributeItem.getPoint(), this.c - 4, i2, Paint.Align.RIGHT, paramCanvas, this.i);
        i2 += this.b;
        a.b(this.c / 2, i2, this.c, i2, paramCanvas);
        i1 += 1;
      }
    }
    this.i.setColor(this.t);
    this.i.setStrokeWidth(2.0F);
    paramCanvas.drawLine(this.c / 2, 0.0F, this.c / 2, this.d, this.i);
    paramCanvas.restore();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getSize(paramInt1);
    int i2 = View.MeasureSpec.getMode(paramInt2);
    paramInt1 = View.MeasureSpec.getSize(paramInt2);
    if (i2 != 1073741824)
    {
      paramInt1 = getLength();
      if (paramInt1 != 0) {
        break label53;
      }
    }
    label53:
    for (paramInt1 = (this.b + this.a) * 21;; paramInt1 = (paramInt1 + 1) * (this.b + this.a))
    {
      setMeasuredDimension(i1, paramInt1);
      return;
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.c = paramInt1;
    this.d = paramInt2;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool2 = true;
    boolean bool1;
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    case 2: 
    default: 
      bool1 = super.onTouchEvent(paramMotionEvent);
    }
    float f1;
    float f2;
    do
    {
      do
      {
        return bool1;
        this.q = paramMotionEvent.getX();
        this.r = paramMotionEvent.getY();
        return true;
        f1 = paramMotionEvent.getX();
        f2 = paramMotionEvent.getY();
        bool1 = bool2;
      } while (Math.abs(f2 - this.r) > 5.0F);
      bool1 = bool2;
    } while (Math.abs(f1 - this.q) > 5.0F);
    int i1;
    if (f1 < this.c / 2)
    {
      i1 = 0;
      this.l = i1;
      i1 = (int)f2 / (this.b + this.a);
      if ((int)f2 % (this.b + this.a) != 0) {
        break label253;
      }
      label164:
      this.m = i1;
      if ((this.s != null) && (this.m >= 0))
      {
        if (this.l != 0) {
          break label262;
        }
        if (this.f != null) {
          this.s.a(((ContributeItem)this.f.get(this.m)).getCode(), ((ContributeItem)this.f.get(this.m)).getName());
        }
      }
    }
    for (;;)
    {
      postInvalidate();
      return true;
      i1 = 1;
      break;
      label253:
      i1 -= 1;
      break label164;
      label262:
      if (this.g != null) {
        this.s.a(((ContributeItem)this.g.get(this.m)).getCode(), ((ContributeItem)this.g.get(this.m)).getName());
      }
    }
  }
  
  public void setMaxContrs(Vector<ContributeItem> paramVector)
  {
    this.f = paramVector;
    postInvalidate();
  }
  
  public void setMinContrs(Vector<ContributeItem> paramVector)
  {
    this.g = paramVector;
    postInvalidate();
  }
  
  public void setOnClickListener(ax paramax)
  {
    this.s = paramax;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ContributeView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */