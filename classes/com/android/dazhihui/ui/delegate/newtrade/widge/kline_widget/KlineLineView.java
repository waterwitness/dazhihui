package com.android.dazhihui.ui.delegate.newtrade.widge.kline_widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.stockchart.az;
import java.lang.reflect.Array;

public class KlineLineView
  extends KlineStockChartBaseView
{
  private int[] A = { -409087, -829460 };
  private int B;
  private Bitmap C;
  private Bitmap D;
  private Path E = new Path();
  private Path F = new Path();
  private Runnable G = new a(this);
  private int e;
  private int f;
  private int g;
  private long h = -2147483648L;
  private long i = 2147483647L;
  private KlineView j;
  private StockVo k;
  private int l;
  private float m;
  private float n;
  private float o;
  private float p;
  private float q;
  private float r;
  private Rect s = new Rect();
  private Path t = new Path();
  private int u;
  private int v;
  private int w;
  private int x;
  private int y;
  private int z;
  
  public KlineLineView(Context paramContext)
  {
    super(paramContext);
  }
  
  public KlineLineView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public KlineLineView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private int a(long paramLong1, long paramLong2, int paramInt1, int paramInt2)
  {
    return (int)(paramInt2 - 1 - (paramInt2 - 1) * paramLong1 / paramLong2) + paramInt1;
  }
  
  private void a(int paramInt)
  {
    this.j.setScreenIndex((paramInt - getPaddingLeft()) / this.j.getKLineWidth());
    this.j.j();
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Canvas paramCanvas)
  {
    int i1 = this.j.getIndexModel();
    this.k = this.j.getDataModel();
    int i4 = this.j.getKLineSize();
    int i5 = this.k.getKLineOffset();
    int i6 = this.j.getKLineWidth();
    int[][] arrayOfInt = this.k.getKData();
    int[] arrayOfInt1 = this.j.getMAs();
    long[][] arrayOfLong = this.j.getAvgPrice();
    int[] arrayOfInt2 = this.j.getAvgsColors();
    int i7 = getHeight() - paramInt2 - paramInt4;
    if ((i1 == 7) || (arrayOfLong == null)) {
      return;
    }
    paramCanvas.save();
    paramCanvas.clipRect(paramInt1, paramInt2, getWidth() - paramInt3, getHeight() - paramInt4);
    paramInt3 = 0;
    if (paramInt3 < arrayOfInt1.length) {
      if (arrayOfInt.length >= arrayOfInt1[paramInt3]) {}
    }
    for (;;)
    {
      paramInt3 += 1;
      break;
      this.a.setColor(arrayOfInt2[paramInt3]);
      int i2 = Math.max(i5, arrayOfInt1[paramInt3] - 1);
      if (i2 >= arrayOfLong.length)
      {
        paramCanvas.restore();
        return;
      }
      float f1 = (i2 - i5) * i6 + i6 / 2 + paramInt1;
      i1 = a(arrayOfLong[i2][paramInt3] - this.i * 10L, 10L * (this.h - this.i), paramInt2, i7);
      if (i4 + i5 > arrayOfInt.length) {
        paramInt4 = arrayOfInt.length;
      }
      while (i2 < paramInt4)
      {
        float f2 = (i2 - i5) * i6 + i6 / 2 + paramInt1;
        int i3 = a(arrayOfLong[i2][paramInt3] - this.i * 10L, (this.h - this.i) * 10L, paramInt2, i7);
        if (arrayOfLong[i2][paramInt3] > 0L) {
          paramCanvas.drawLine(f1, i1, f2, i3, this.a);
        }
        i2 += 1;
        f1 = f2;
        i1 = i3;
        continue;
        paramInt4 = i4 + i5;
      }
    }
  }
  
  private void a(int paramInt1, int paramInt2, Canvas paramCanvas)
  {
    int i1 = 0;
    paramCanvas.save();
    this.a.setTextAlign(Paint.Align.RIGHT);
    this.a.setColor(this.j.getKlineRightPartColor());
    this.a.setTextSize(this.l);
    this.a.setStyle(Paint.Style.FILL);
    float f1 = this.a.getFontMetrics().ascent;
    this.a.getTextBounds("1234567890", 0, 10, this.s);
    int i2 = this.s.height();
    i2 = (getHeight() - 2 - paramInt1 - paramInt2 - i2 * 2) / 4;
    paramInt2 = paramInt1 + 1;
    paramInt1 = i1;
    while (paramInt1 < 5)
    {
      i1 = (int)(this.h - (this.h - this.i) * paramInt1 / 4L);
      if (i1 < 0) {
        return;
      }
      paramCanvas.drawText(az.b(i1, this.k.getmDecimalLen()), getWidth() - 1, paramInt2 - f1, this.a);
      paramInt2 += i2;
      paramInt1 += 1;
    }
    paramCanvas.restore();
  }
  
  private void a(y paramy)
  {
    if (this.A == null) {
      this.A = new int[2];
    }
    if (paramy == y.b)
    {
      this.v = 34816;
      this.w = -13070532;
      this.x = 34816;
      this.y = -6642515;
      this.z = -6642515;
      this.A[0] = -3129345;
      this.A[1] = -12686651;
      this.B = -65536;
      this.C = BitmapFactory.decodeResource(getResources(), 2130838260);
      this.D = BitmapFactory.decodeResource(getResources(), 2130838262);
      return;
    }
    this.v = -409087;
    this.w = -16711936;
    this.x = -409087;
    this.y = -65281;
    this.z = -8947849;
    this.A[0] = -409087;
    this.A[1] = -829460;
    this.B = 64841;
    this.C = BitmapFactory.decodeResource(getResources(), 2130838259);
    this.D = BitmapFactory.decodeResource(getResources(), 2130838261);
  }
  
  private void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Canvas paramCanvas)
  {
    paramCanvas.save();
    int i5 = getWidth() - paramInt1 - paramInt3;
    int i6 = getHeight() - paramInt2 - paramInt4;
    int i1 = this.j.getKLineSize();
    int i4 = this.k.getKLineOffset();
    this.k.getBsTag();
    Object localObject = this.k.getKData();
    int i7 = this.j.getKLineWidth();
    int[] arrayOfInt1 = this.k.getExRightsId();
    int i8 = StockVo.getExRights();
    float f3 = i7 - this.o;
    if (f3 < this.o) {
      f3 = this.o;
    }
    for (;;)
    {
      float f4 = f3 / 2.0F;
      int i9 = this.j.getDefaultKLineWidth();
      paramCanvas.clipRect(paramInt1, paramInt2, getWidth() - paramInt3, getHeight() - paramInt4);
      int[][] arrayOfInt;
      label209:
      int i10;
      if (i1 + i4 > localObject.length)
      {
        paramInt4 = localObject.length;
        arrayOfInt = (int[][])Array.newInstance(Integer.TYPE, new int[] { 2, 3 });
        paramInt3 = (int)this.m;
        if (i7 > i9 - 3) {
          break label398;
        }
        this.a.setTextSize(paramInt3);
        this.a.setTextAlign(Paint.Align.CENTER);
        i1 = i4;
        if (i1 >= paramInt4) {
          break label1426;
        }
        i10 = (i1 - i4) * i7 + paramInt1;
        if (localObject[i1][1] >= localObject[i1][4]) {
          break label483;
        }
        paramInt3 = 1;
        label261:
        if ((i1 <= 0) || (localObject[i1][1] != localObject[i1][4])) {
          break label1978;
        }
        if (localObject[i1][4] < localObject[(i1 - 1)][4]) {
          break label488;
        }
        paramInt3 = 1;
      }
      label304:
      label398:
      label483:
      label488:
      label758:
      label886:
      label933:
      label1124:
      label1191:
      label1426:
      label1882:
      label1978:
      for (int i2 = paramInt3;; i2 = paramInt3)
      {
        if (i2 != 0) {}
        int[] arrayOfInt2;
        for (paramInt3 = this.j.getUpColor();; paramInt3 = this.j.getDownColor())
        {
          this.a.setColor(paramInt3);
          arrayOfInt2 = new int[4];
          i3 = 0;
          while (i3 < 4)
          {
            arrayOfInt2[i3] = a(localObject[i1][(i3 + 1)] - this.i, this.h - this.i, paramInt2, i6);
            i3 += 1;
          }
          paramInt4 = i1 + i4;
          break;
          if (i7 == i9)
          {
            this.a.setTextSize(paramInt3 + 4);
            break label209;
          }
          if (i7 <= i9 + 4)
          {
            this.a.setTextSize(paramInt3 + 8);
            break label209;
          }
          if (i7 <= i9 + 12)
          {
            this.a.setTextSize(paramInt3 + 14);
            break label209;
          }
          this.a.setTextSize(paramInt3 + 18);
          break label209;
          paramInt3 = 0;
          break label261;
          paramInt3 = 0;
          break label304;
        }
        if (localObject[i1][1] != 0)
        {
          if (i7 > i9 - 3) {
            break label758;
          }
          f1 = this.n;
        }
        for (;;)
        {
          this.a.setStrokeWidth(f1);
          paramCanvas.drawLine(i10 + f4, arrayOfInt2[0], i10 + f4, arrayOfInt2[2], this.a);
          paramCanvas.drawLine(i10 + f4, arrayOfInt2[1], i10 + f4, arrayOfInt2[3], this.a);
          f1 = this.o;
          this.a.setStrokeWidth(f1);
          if ((arrayOfInt[0][0] == 0) || (arrayOfInt[0][0] >= localObject[i1][3]))
          {
            arrayOfInt[0][0] = localObject[i1][3];
            arrayOfInt[0][1] = ((int)(i10 + f4));
            arrayOfInt[0][2] = arrayOfInt2[2];
          }
          if ((arrayOfInt[1][0] == 0) || (arrayOfInt[1][0] <= localObject[i1][2]))
          {
            arrayOfInt[1][0] = localObject[i1][2];
            arrayOfInt[1][1] = ((int)(i10 + f4));
            arrayOfInt[1][2] = arrayOfInt2[1];
          }
          if (i2 == 0) {
            break label1124;
          }
          if (localObject[i1][1] != 0) {
            break;
          }
          paramCanvas.restore();
          return;
          if (i7 <= i9 + 4) {
            f1 = this.o;
          } else if (i7 <= i9 + 8) {
            f1 = this.p;
          } else if (i7 == i9 + 10) {
            f1 = this.q;
          } else {
            f1 = this.r;
          }
        }
        int i3 = arrayOfInt2[0] - arrayOfInt2[3];
        i2 = i3;
        if (i3 == 0) {
          i2 = 1;
        }
        this.a.setColor(paramInt3);
        float f1 = 0.0F;
        float f2 = 0.0F;
        if (f3 <= this.o)
        {
          f1 = 0.0F;
          this.a.setStyle(Paint.Style.FILL);
          f2 = 0.0F;
          paramCanvas.drawRect(i10 + f1, arrayOfInt2[3], i10 + f3 - f2, i2 + arrayOfInt2[3], this.a);
          this.a.setStyle(Paint.Style.FILL);
          if ((arrayOfInt1 != null) && (i1 < arrayOfInt1.length) && (arrayOfInt1[i1] == 1))
          {
            paramInt3 = i9 + 5;
            i2 = (paramInt3 >> 1) + i10;
            i3 = i6 + 1 + paramInt2;
            this.t.reset();
            if (i8 != 2) {
              break label1191;
            }
            this.a.setColor(this.z);
            this.a.setStyle(Paint.Style.FILL);
            this.t.moveTo(i2, i3 - paramInt3);
            this.t.lineTo(i2 - (paramInt3 >> 1), i3);
            this.t.lineTo((paramInt3 >> 1) + i2, i3);
            this.t.lineTo(i2, i3 - paramInt3);
            paramCanvas.drawPath(this.t, this.a);
          }
        }
        for (;;)
        {
          i1 += 1;
          break;
          if (f3 - 1.0F > 0.0F)
          {
            f1 = 1.0F;
            f2 = 1.0F;
          }
          this.a.setStyle(Paint.Style.STROKE);
          break label886;
          if (localObject[i1][1] == 0)
          {
            paramCanvas.restore();
            return;
          }
          this.a.setColor(paramInt3);
          this.a.setStyle(Paint.Style.FILL);
          paramCanvas.drawRect(i10, arrayOfInt2[0], i10 + f3, arrayOfInt2[3] + 1, this.a);
          break label933;
          if (i8 == 0)
          {
            this.a.setColor(this.y);
            this.a.setStyle(Paint.Style.FILL);
            this.t.moveTo(i2 - (paramInt3 >> 1), i3 - (paramInt3 >> 1));
            this.t.lineTo((paramInt3 >> 1) + i2, i3 - paramInt3);
            this.t.lineTo((paramInt3 >> 1) + i2, i3);
            this.t.lineTo(i2 - (paramInt3 >> 1), i3 - (paramInt3 >> 1));
            paramCanvas.drawPath(this.t, this.a);
          }
          else
          {
            this.a.setColor(this.y);
            this.a.setStyle(Paint.Style.FILL);
            this.t.moveTo((paramInt3 >> 1) + i2, i3 - (paramInt3 >> 1));
            this.t.lineTo(i2 - (paramInt3 >> 1), i3 - paramInt3);
            this.t.lineTo(i2 - (paramInt3 >> 1), i3);
            this.t.lineTo(i2 + (paramInt3 >> 1), i3 - (paramInt3 >> 1));
            paramCanvas.drawPath(this.t, this.a);
          }
        }
        this.a.setStyle(Paint.Style.FILL);
        paramInt1 = (int)getResources().getDimension(2131230788);
        localObject = az.b(arrayOfInt[0][0], this.k.getmDecimalLen());
        this.a.setTextSize(this.l);
        this.a.getTextBounds((String)localObject, 0, ((String)localObject).length(), this.s);
        paramInt2 = this.s.width();
        this.a.setColor(this.x);
        paramInt3 = this.l;
        if (paramInt2 + paramInt1 + arrayOfInt[0][1] < i5)
        {
          paramCanvas.drawLine(arrayOfInt[0][1], arrayOfInt[0][2], arrayOfInt[0][1] + paramInt1, arrayOfInt[0][2] - paramInt3 / 2, this.a);
          this.a.setTextAlign(Paint.Align.LEFT);
          paramCanvas.drawText((String)localObject, arrayOfInt[0][1] + paramInt1, arrayOfInt[0][2] - paramInt3 - this.a.getFontMetrics().ascent, this.a);
          localObject = az.b(arrayOfInt[1][0], this.k.getmDecimalLen());
          this.a.getTextBounds((String)localObject, 0, ((String)localObject).length(), this.s);
          if (this.s.width() + paramInt1 + arrayOfInt[1][1] >= i5) {
            break label1882;
          }
          paramCanvas.drawLine(arrayOfInt[1][1], arrayOfInt[1][2], arrayOfInt[1][1] + paramInt1, arrayOfInt[1][2] + paramInt3 / 2, this.a);
          this.a.setTextAlign(Paint.Align.LEFT);
          paramCanvas.drawText((String)localObject, arrayOfInt[1][1] + paramInt1, arrayOfInt[1][2] + 1 - this.a.getFontMetrics().ascent, this.a);
        }
        for (;;)
        {
          paramCanvas.restore();
          return;
          paramCanvas.drawLine(arrayOfInt[0][1], arrayOfInt[0][2], arrayOfInt[0][1] - paramInt1, arrayOfInt[0][2] - paramInt3 / 2, this.a);
          this.a.setTextAlign(Paint.Align.RIGHT);
          paramCanvas.drawText((String)localObject, arrayOfInt[0][1] - paramInt1, arrayOfInt[0][2] - paramInt3 - this.a.getFontMetrics().ascent, this.a);
          break;
          paramCanvas.drawLine(arrayOfInt[1][1], arrayOfInt[1][2], arrayOfInt[1][1] - paramInt1, arrayOfInt[1][2] + paramInt3 / 2, this.a);
          this.a.setTextAlign(Paint.Align.RIGHT);
          paramCanvas.drawText((String)localObject, arrayOfInt[1][1] - paramInt1, arrayOfInt[1][2] + 1 - this.a.getFontMetrics().ascent, this.a);
        }
      }
    }
  }
  
  protected void a()
  {
    super.a();
    a(g.a().b());
    this.e = getResources().getDimensionPixelSize(2131230799);
    this.f = getResources().getDimensionPixelSize(2131230829);
    this.g = getResources().getDimensionPixelSize(2131230845);
    this.l = getResources().getDimensionPixelSize(2131231088);
    DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
    this.m = TypedValue.applyDimension(1, 6.0F, localDisplayMetrics);
    this.n = TypedValue.applyDimension(1, 1.0F, localDisplayMetrics);
    this.o = TypedValue.applyDimension(1, 1.0F, localDisplayMetrics);
    this.p = TypedValue.applyDimension(1, 1.2F, localDisplayMetrics);
    this.q = TypedValue.applyDimension(1, 1.4F, localDisplayMetrics);
    this.r = TypedValue.applyDimension(1, 1.6F, localDisplayMetrics);
  }
  
  protected void a(Canvas paramCanvas)
  {
    int i3 = getWidth();
    int i1 = getHeight();
    int i4 = getPaddingTop();
    int i5 = getPaddingLeft();
    int i6 = getPaddingRight();
    int i2 = getPaddingBottom();
    paramCanvas.save();
    this.a.setColor(this.b);
    this.a.setStyle(Paint.Style.STROKE);
    float f1 = this.a.getStrokeWidth();
    this.a.setStrokeWidth(getResources().getDimensionPixelSize(2131230773));
    int i7;
    if (getResources().getConfiguration().orientation == 1)
    {
      paramCanvas.drawLine(i5, i1 - i2, i3 - i6, i1 - i2, this.a);
      i7 = (i1 - this.e - this.f - i4 - i2) / 4;
      i1 = 1;
    }
    for (;;)
    {
      if (i1 > 3) {
        break label259;
      }
      int i8 = this.e + i4 + i7 * i1;
      i2 = i5 + 6;
      for (;;)
      {
        if (i2 < i3 - i6 - this.g)
        {
          paramCanvas.drawLine(i2, i8, i2 + 1, i8, this.a);
          i2 += 6;
          continue;
          paramCanvas.drawRect(i5, i4, i3 - i6, i1 - i2, this.a);
          break;
        }
      }
      i1 += 1;
    }
    label259:
    this.a.setStrokeWidth(f1);
    paramCanvas.restore();
  }
  
  public void b()
  {
    a(this.u);
  }
  
  public void c()
  {
    this.h = -2147483648L;
    this.i = 2147483647L;
    this.k = this.j.getDataModel();
    if (this.k == null) {}
    int i1;
    int i2;
    int[][] arrayOfInt;
    do
    {
      return;
      i1 = this.j.getKLineSize();
      i2 = this.k.getKLineOffset();
      arrayOfInt = this.k.getKData();
    } while (arrayOfInt == null);
    this.j.getIndexModel();
    if (i1 + i2 > arrayOfInt.length) {
      i1 = arrayOfInt.length;
    }
    while (i2 < i1)
    {
      if (arrayOfInt[i2][2] > this.h) {
        this.h = arrayOfInt[i2][2];
      }
      if (arrayOfInt[i2][3] < this.i) {
        this.i = arrayOfInt[i2][3];
      }
      if (arrayOfInt[i2][2] == 0) {
        arrayOfInt[i2][2] = arrayOfInt[i2][4];
      }
      i2 += 1;
      continue;
      i1 += i2;
    }
    if (this.h - this.i < 4L) {
      this.i = (this.h - 4L);
    }
    invalidate();
  }
  
  public long getMaxValue()
  {
    return this.h;
  }
  
  public long getMinValue()
  {
    return this.i;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.save();
    this.k = this.j.getDataModel();
    if (this.k != null)
    {
      int[][] arrayOfInt = this.k.getKData();
      if ((arrayOfInt != null) && (arrayOfInt.length > 0))
      {
        int i2 = getWidth();
        int i3 = getHeight();
        int i4 = getPaddingTop();
        int i1 = getPaddingLeft();
        paramCanvas.clipRect(i1, i4, i2 - getPaddingRight(), i3 - getPaddingBottom());
        i2 = getPaddingTop();
        i2 = this.e + i2;
        i3 = getPaddingRight();
        i3 = this.g + i3;
        i4 = getPaddingBottom();
        i4 = this.f + i4;
        a(i2, i4, paramCanvas);
        b(i1, i2, i3, i4, paramCanvas);
        a(i1, i2, i3, i4, paramCanvas);
      }
    }
    paramCanvas.restore();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    this.u = ((int)paramMotionEvent.getX());
    if (this.j.getDisplayModel() == i.a) {
      return super.onTouchEvent(paramMotionEvent);
    }
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    }
    for (;;)
    {
      a(this.u);
      return true;
      getParent().requestDisallowInterceptTouchEvent(true);
      removeCallbacks(this.G);
      continue;
      postDelayed(this.G, 1500L);
    }
  }
  
  public void setAverageViewHeight(int paramInt)
  {
    this.e = paramInt;
  }
  
  public void setHolder(KlineView paramKlineView)
  {
    this.j = paramKlineView;
  }
  
  public void setRightDistance(int paramInt)
  {
    this.g = paramInt;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\widge\kline_widget\KlineLineView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */