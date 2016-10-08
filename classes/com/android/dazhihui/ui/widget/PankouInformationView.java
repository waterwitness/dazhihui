package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import com.android.dazhihui.d.a;
import com.android.dazhihui.d.b;
import com.android.dazhihui.g;

public class PankouInformationView
  extends View
{
  private ScrollView a;
  private Context b;
  private String[] c;
  private int[] d;
  private String[][] e;
  private int[][] f;
  private Paint g = new Paint(1);
  private String h = "盘口信息";
  private String i = "分时成交";
  private String[] j = { "最新", "均价", "涨跌", "涨幅", "今开", "昨收", "总手", "现手", "换手", "振幅", "总额", "量比", "内盘", "外盘", "总市值", "流通", "最高", "最低", "涨停", "跌停" };
  private String[] k = { "时间", "价格", "成交量" };
  
  public PankouInformationView(Context paramContext)
  {
    super(paramContext);
    this.b = paramContext;
  }
  
  public PankouInformationView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.b = paramContext;
  }
  
  public PankouInformationView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.b = paramContext;
  }
  
  private int a(Canvas paramCanvas)
  {
    int i2 = g.a().m();
    int i3 = (int)TypedValue.applyDimension(1, 11.0F, this.b.getResources().getDisplayMetrics());
    int i4 = (int)TypedValue.applyDimension(1, 5.0F, this.b.getResources().getDisplayMetrics());
    int i1 = (int)TypedValue.applyDimension(1, 3.0F, this.b.getResources().getDisplayMetrics());
    if ((this.c == null) || (this.c.length != 20)) {
      return 0;
    }
    int i5 = (i2 - i4 * 2) / 4;
    this.g.setTextSize(TypedValue.applyDimension(1, 14.0F, this.b.getResources().getDisplayMetrics()));
    a.b(0, 0, i2, b.a + i3 * 2, -12499378, paramCanvas);
    int m = 0 + i3;
    this.g.setColor(-1);
    a.a(this.h, i4, m + 2, Paint.Align.LEFT, paramCanvas, this.g);
    int n = m + (b.a + i3 + i1);
    m = 0;
    while (m < this.c.length / 2)
    {
      a.a(i4, n, i2 - i4 * 2, i3 * 2 + b.a, -14144978, paramCanvas);
      a.a(i4 + i5, n, i4 + i5, b.a + n + i3 * 2, -14144978, paramCanvas);
      a.a(i5 * 2 + i4, n, i5 * 2 + i4, b.a + n + i3 * 2, -14144978, paramCanvas);
      a.a(i5 * 3 + i4, n, i5 * 3 + i4, b.a + n + i3 * 2, -14144978, paramCanvas);
      n += i3;
      this.g.setColor(-1);
      a.a(this.j[(m * 2)], i5 / 2 + i4, n + 2, Paint.Align.CENTER, paramCanvas, this.g);
      this.g.setColor(this.d[(m * 2)]);
      a.a(this.c[(m * 2)], i5 * 3 / 2 + i4, n + 2, Paint.Align.CENTER, paramCanvas, this.g);
      this.g.setColor(-1);
      a.a(this.j[(m * 2 + 1)], i5 * 5 / 2 + i4, n + 2, Paint.Align.CENTER, paramCanvas, this.g);
      this.g.setColor(this.d[(m * 2 + 1)]);
      a.a(this.c[(m * 2 + 1)], i5 * 7 / 2 + i4, n + 2, Paint.Align.CENTER, paramCanvas, this.g);
      n += b.a + i3;
      m += 1;
    }
    i5 = n + i1;
    a.b(0, i5, i2, b.a + i3 * 2, -12499378, paramCanvas);
    m = i5 + i3;
    this.g.setColor(-1);
    a.a(this.i, i4, m + 2, Paint.Align.LEFT, paramCanvas, this.g);
    m += b.a + i3 + i1;
    int i6 = (i2 - i4 * 2) / 3;
    a.a(i4, m, i2 - i4 * 2, i3 * 2 + b.a, -14144978, paramCanvas);
    a.a(i4 + i6, m, i4 + i6, b.a + m + i3 * 2, -14144978, paramCanvas);
    a.a(i6 * 2 + i4, m, i6 * 2 + i4, b.a + m + i3 * 2, -14144978, paramCanvas);
    m += i3;
    a.a(this.k[0], i6 / 2 + i4, m + 2, Paint.Align.CENTER, paramCanvas, this.g);
    a.a(this.k[1], i6 * 3 / 2 + i4, m + 2, Paint.Align.CENTER, paramCanvas, this.g);
    a.a(this.k[2], i6 * 5 / 2 + i4, m + 2, Paint.Align.CENTER, paramCanvas, this.g);
    m += b.a + i3;
    i1 = m;
    if (this.e != null)
    {
      n = 0;
      for (;;)
      {
        i1 = m;
        if (n >= this.e.length) {
          break;
        }
        a.a(i4, m, i2 - i4 * 2, b.a + i3 * 2, -14144978, paramCanvas);
        a.a(i4 + i6, m, i4 + i6, b.a + m + i3 * 2, -14144978, paramCanvas);
        a.a(i6 * 2 + i4, m, i6 * 2 + i4, b.a + m + i3 * 2, -14144978, paramCanvas);
        m += i3;
        this.g.setColor(this.f[n][0]);
        a.a(this.e[n][0], i6 / 2 + i4, m + 2, Paint.Align.CENTER, paramCanvas, this.g);
        this.g.setColor(this.f[n][1]);
        a.a(this.e[n][1], i6 * 3 / 2 + i4, m + 2, Paint.Align.CENTER, paramCanvas, this.g);
        this.g.setColor(this.f[n][2]);
        a.a(this.e[n][2], i6 * 5 / 2 + i4, m + 2, Paint.Align.CENTER, paramCanvas, this.g);
        m += b.a + i3;
        n += 1;
      }
    }
    m = this.a.getScrollY();
    if (i5 - m <= 0)
    {
      a.b(0, m, i2, i3 * 2 + b.a, -12499378, paramCanvas);
      this.g.setColor(-1);
      a.a(this.i, i4, m + i3 + 2, Paint.Align.LEFT, paramCanvas, this.g);
    }
    return i1 + i3;
  }
  
  public void a(String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length != 20)) {
      return;
    }
    this.c = paramArrayOfString;
    this.d = paramArrayOfInt;
    int m = a(new Canvas());
    paramArrayOfString = getLayoutParams();
    paramArrayOfString.height = m;
    setLayoutParams(paramArrayOfString);
    requestLayout();
    invalidate();
  }
  
  public void a(String[][] paramArrayOfString, int[][] paramArrayOfInt)
  {
    if (paramArrayOfString == null) {
      return;
    }
    this.e = paramArrayOfString;
    this.f = paramArrayOfInt;
    int m = a(new Canvas());
    paramArrayOfString = getLayoutParams();
    paramArrayOfString.height = m;
    setLayoutParams(paramArrayOfString);
    requestLayout();
    invalidate();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    a(paramCanvas);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setOwnScrollView(ScrollView paramScrollView)
  {
    this.a = paramScrollView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\PankouInformationView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */