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
import com.android.dazhihui.ui.model.stock.UpDownItem;
import java.util.Vector;

public class UpDownView
  extends View
{
  private int a = 15;
  private int b = 0;
  private int c = 0;
  private int d = 0;
  private int e = 0;
  private Vector<UpDownItem> f;
  private Vector<UpDownItem> g;
  private String[] h = { "名称", "涨幅", "名称", "跌幅" };
  private String[] i = { "名称", "5分钟涨幅", "名称", "5分钟跌幅" };
  private String[] j = { "板块", "涨幅", "个股", "5分钟跌幅" };
  private Paint k = new Paint(1);
  private Bitmap l;
  private NinePatch m;
  private int n = 0;
  private int o = 0;
  private int p = -1;
  private ne q;
  
  public UpDownView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public UpDownView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = paramContext.getResources();
    this.e = paramContext.getDimensionPixelSize(2131231088);
    this.b = (this.e + this.a);
    this.l = BitmapFactory.decodeResource(paramContext, 2130838065);
    this.m = new NinePatch(this.l, this.l.getNinePatchChunk(), null);
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
  
  public Vector<UpDownItem> getMinContrs()
  {
    return this.g;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.save();
    Object localObject;
    int i5;
    int i6;
    int i3;
    int i4;
    if (this.p >= 0)
    {
      if (this.o == 0)
      {
        i1 = 0;
        i2 = (this.p + 1) * (this.b + this.a);
        localObject = new RectF(i1, i2, i1 + this.c / 2, i2 + this.b + this.a);
        this.m.draw(paramCanvas, (RectF)localObject);
        this.p = -1;
      }
    }
    else
    {
      a.d.setColor(-10000537);
      this.k.setTextSize(this.e);
      this.k.setColor(-1);
      i1 = this.a;
      i5 = this.c / 8;
      i6 = this.c * 3 / 8;
      i3 = this.c * 5 / 8;
      i4 = this.c * 7 / 8;
      if (this.n != 0) {
        break label436;
      }
      localObject = this.h;
    }
    String str;
    for (;;)
    {
      a.b(0, 1, this.c, 1, paramCanvas);
      a.a(localObject[0], i5, i1, Paint.Align.CENTER, paramCanvas, this.k);
      a.a(localObject[1], i6, i1, Paint.Align.CENTER, paramCanvas, this.k);
      a.a(localObject[2], i3, i1, Paint.Align.CENTER, paramCanvas, this.k);
      a.a(localObject[3], i4, i1, Paint.Align.CENTER, paramCanvas, this.k);
      i2 = i1 + this.b;
      a.b(0, i2, this.c, i2, paramCanvas);
      if (this.f == null) {
        break label460;
      }
      i1 = 0;
      while (i1 < this.f.size())
      {
        localObject = (UpDownItem)this.f.get(i1);
        str = ((UpDownItem)localObject).getName();
        i2 += this.a;
        this.k.setColor(-7829368);
        a.a(str, i5, i2, Paint.Align.CENTER, paramCanvas, this.k);
        this.k.setColor(-65536);
        a.a(((UpDownItem)localObject).getRate(), i6, i2, Paint.Align.CENTER, paramCanvas, this.k);
        i2 += this.b;
        a.b(0, i2, this.c / 2, i2, paramCanvas);
        i1 += 1;
      }
      i1 = this.c / 2;
      break;
      label436:
      if (this.n == 4) {
        localObject = this.j;
      } else {
        localObject = this.i;
      }
    }
    label460:
    int i1 = this.b;
    int i2 = this.a + i1;
    if (this.g != null)
    {
      i1 = 0;
      if (i1 < this.g.size())
      {
        localObject = (UpDownItem)this.g.get(i1);
        str = ((UpDownItem)localObject).getName();
        i2 = this.a + i2;
        this.k.setColor(-7829368);
        a.a(str, i3, i2, Paint.Align.CENTER, paramCanvas, this.k);
        if (this.n != 4) {
          this.k.setColor(-16711936);
        }
        for (;;)
        {
          a.a(((UpDownItem)localObject).getRate(), i4, i2, Paint.Align.CENTER, paramCanvas, this.k);
          i2 += this.b;
          a.b(this.c / 2, i2, this.c, i2, paramCanvas);
          i1 += 1;
          break;
          this.k.setColor(-65536);
        }
      }
    }
    this.k.setColor(-7829368);
    this.k.setStrokeWidth(2.0F);
    paramCanvas.drawLine(this.c / 2, 0.0F, this.c / 2, this.d, this.k);
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
        break label49;
      }
    }
    label49:
    for (paramInt1 = this.b + this.a;; paramInt1 = (paramInt1 + 1) * (this.b + this.a))
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
    int i1 = paramMotionEvent.getAction();
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    boolean bool1 = bool2;
    switch (i1 & 0xFF)
    {
    case 2: 
    default: 
      bool1 = super.onTouchEvent(paramMotionEvent);
    }
    label116:
    do
    {
      do
      {
        return bool1;
        if (f1 >= this.c / 2) {
          break label231;
        }
        i1 = 0;
        this.o = i1;
        i1 = (int)f2 / (this.b + this.a);
        if ((int)f2 % (this.b + this.a) != 0) {
          break label237;
        }
        this.p = i1;
        if ((this.q == null) || (this.p < 0)) {
          break;
        }
        bool1 = bool2;
      } while (this.f == null);
      bool1 = bool2;
    } while (this.g == null);
    if (this.o == 0) {
      this.q.a(((UpDownItem)this.f.get(this.p)).getCode(), ((UpDownItem)this.f.get(this.p)).getName(), ((UpDownItem)this.f.get(this.p)).getType());
    }
    for (;;)
    {
      postInvalidate();
      return true;
      label231:
      i1 = 1;
      break;
      label237:
      i1 -= 1;
      break label116;
      this.q.a(((UpDownItem)this.g.get(this.p)).getCode(), ((UpDownItem)this.g.get(this.p)).getName(), ((UpDownItem)this.f.get(this.p)).getType());
    }
  }
  
  public void setMaxContrs(Vector<UpDownItem> paramVector)
  {
    this.f = paramVector;
    requestLayout();
  }
  
  public void setMinContrs(Vector<UpDownItem> paramVector)
  {
    this.g = paramVector;
    requestLayout();
  }
  
  public void setOnClickListener(ne paramne)
  {
    this.q = paramne;
  }
  
  public void setType(int paramInt)
  {
    this.n = paramInt;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\UpDownView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */