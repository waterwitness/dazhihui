package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader.TileMode;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.d.a;
import com.android.dazhihui.d.b;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class FundLineView
  extends View
{
  private Path A = new Path();
  private Handler B = new dq(this);
  private dr C;
  private int a = 0;
  private byte b;
  private boolean c;
  private int[][] d = (int[][])null;
  private int e = 0;
  private int f = -1;
  private int g;
  private int h;
  private int i;
  private int j;
  private int k = 0;
  private int l = 0;
  private int m = 0;
  private int n = 0;
  private int o = 0;
  private boolean p;
  private ArrayList<String> q = new ArrayList();
  private ArrayList<Integer> r = new ArrayList();
  private long s = 0L;
  private boolean t = true;
  private int u = 0;
  private int v = 0;
  private int w = 0;
  private int x = 0;
  private int y;
  private Paint z = new Paint(1);
  
  public FundLineView(Context paramContext)
  {
    this(paramContext, null, 0);
  }
  
  public FundLineView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public FundLineView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.y = paramContext.getResources().getDimensionPixelSize(2131231088);
  }
  
  private int a(int paramInt1, int paramInt2)
  {
    return this.i + this.j - 4 - (this.j - 4) * paramInt1 / paramInt2;
  }
  
  private void a()
  {
    int i1 = 1;
    try
    {
      if (i1 < this.d.length - 1)
      {
        if (this.d[i1] == null) {
          break label174;
        }
        if (this.d[i1][1] == 0) {
          this.d[i1][1] = this.d[(i1 - 1)][1];
        }
        if (this.d[i1][2] != 0) {
          break label174;
        }
        this.d[i1][2] = this.d[(i1 - 1)][2];
      }
    }
    catch (Exception localException1) {}
    for (;;)
    {
      try
      {
        i1 = this.d.length - 1;
        if (i1 >= 0)
        {
          if (this.d[i1] == null) {
            break label181;
          }
          if (this.d[i1][1] == 0) {
            this.d[i1][1] = this.d[(i1 + 1)][1];
          }
          if (this.d[i1][2] != 0) {
            break label181;
          }
          this.d[i1][2] = this.d[(i1 + 1)][2];
        }
      }
      catch (Exception localException2) {}
      return;
      label174:
      i1 += 1;
      break;
      label181:
      i1 -= 1;
    }
  }
  
  private void a(Canvas paramCanvas)
  {
    int i3 = 0;
    a.a.setColor(-10000537);
    a.d.setColor(-10000537);
    a.a(this.u + 1, this.v + this.i - 1, this.w - 2, this.j, paramCanvas);
    int i1 = 0;
    int i2;
    for (;;)
    {
      i2 = i3;
      if (i1 >= 3) {
        break;
      }
      i2 = this.u + this.g + 1;
      while (i2 < this.w - 1)
      {
        a.b(i2, this.v + this.i + this.j / 4 * (i1 + 1), i2, this.v + this.i + this.j / 4 * (i1 + 1), paramCanvas);
        i2 += 3;
      }
      i1 += 1;
    }
    for (;;)
    {
      i2 += 1;
      if (i2 >= 2) {
        break;
      }
      i1 = this.v + this.i + 1;
      while (i1 < this.x - this.y * 2 - 1)
      {
        a.b(this.u + this.g + this.h / 3 * (i2 + 1), i1, this.u + this.g + this.h / 3 * (i2 + 1), i1, paramCanvas);
        i1 += 3;
      }
    }
  }
  
  private void a(Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i1 = 0;
    if (i1 < 5)
    {
      int i2 = paramInt1 - (paramInt1 - paramInt2) * i1 / 4;
      if (i2 < 0) {}
      for (;;)
      {
        i1 += 1;
        break;
        int i3 = this.i;
        int i4 = (this.j - this.y - 4) * i1 / 4;
        str = b.d(i2, paramInt3);
        a.b.setColor(-65536);
        b.b(paramCanvas, str, this.u + this.g + 3, i3 + 2 + i4 + this.v, 20, this.y);
      }
    }
    a.b.setColor(-1);
    String str = b.d(this.d[(this.e - 1)][1], paramInt3);
    paramInt1 = this.u;
    b.b(paramCanvas, str, this.g + paramInt1, this.v + this.i - 3, 36, this.y);
  }
  
  private void b()
  {
    this.k = Integer.MIN_VALUE;
    this.l = Integer.MAX_VALUE;
    int i1 = 0;
    while (i1 < this.e)
    {
      if (this.d[i1][1] > this.k) {
        this.k = this.d[i1][1];
      }
      if (this.d[i1][1] < this.l) {
        this.l = this.d[i1][1];
      }
      if (!this.p)
      {
        if (this.d[i1][2] > this.k) {
          this.k = this.d[i1][2];
        }
        if (this.d[i1][2] < this.l) {
          this.l = this.d[i1][2];
        }
      }
      i1 += 1;
    }
  }
  
  private void b(Canvas paramCanvas)
  {
    a(paramCanvas, this.k, this.l, this.b, true);
  }
  
  private void c()
  {
    if (this.f != -1)
    {
      this.q.clear();
      this.r.clear();
      if (this.d[this.f][0] != 0) {
        break label105;
      }
      this.q.addAll(Arrays.asList(new String[] { "-", "-", "-" }));
      this.r.addAll(Arrays.asList(new Integer[] { Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(65280) }));
    }
    label105:
    do
    {
      return;
      this.q.add(String.valueOf(this.d[this.f][0]));
      this.q.add(b.a(this.d[this.f][1], this.b));
      if (!this.p) {
        this.q.add(b.a(this.d[this.f][2], this.b));
      }
      this.r.add(Integer.valueOf(-1));
      this.r.add(Integer.valueOf(-1));
    } while (this.p);
    this.r.add(Integer.valueOf(65280));
  }
  
  private void c(Canvas paramCanvas)
  {
    int i4 = this.g + 2;
    int i3 = a(this.d[0][1] - this.l, this.k - this.l);
    int i2 = a(this.d[0][2] - this.l, this.k - this.l);
    this.A.reset();
    this.z.setShader(new LinearGradient(i4, this.i + this.j, i4, this.i, 6243092, -295746796, Shader.TileMode.MIRROR));
    this.A.moveTo(i4, this.i + this.j);
    this.A.lineTo(this.u + i4, this.v + i2);
    int i1 = 0;
    while (i1 < this.e)
    {
      int i5 = this.g + 2 + this.h * i1 / this.d.length;
      int i6 = a(this.d[i1][1] - this.l, this.k - this.l);
      int i7 = a(this.d[i1][2] - this.l, this.k - this.l);
      if (!this.p)
      {
        a.d.setColor(65280);
        a.b(this.u + i4, i2 + this.v, this.u + i5, this.v + i7, paramCanvas);
      }
      a.d.setColor(-1);
      a.b(this.u + i4, i3 + this.v, this.u + i5, this.v + i6, paramCanvas);
      this.A.lineTo(this.u + i5, this.v + i6);
      i1 += 1;
      i2 = i7;
      i3 = i6;
      i4 = i5;
    }
    this.A.lineTo(this.u + this.g + 2 + this.h * this.e / this.d.length, this.i + this.j);
    this.A.close();
    paramCanvas.drawPath(this.A, this.z);
  }
  
  private void d(Canvas paramCanvas)
  {
    a.b.setColor(-2236963);
    int i1 = this.d[this.o][0];
    int i2 = this.u;
    b.b(paramCanvas, String.valueOf(i1), this.g + i2, this.v + this.i + this.x - 5, 36, this.y);
    b.b(paramCanvas, String.valueOf(this.d[(this.d.length - 1)][0]), this.u + this.w - 2, this.v + this.i + this.x - 5, 40, this.y);
  }
  
  private void e(Canvas paramCanvas)
  {
    if (this.f != -1)
    {
      int i1 = this.g + this.h * this.f / this.d.length;
      a.a(this.u + i1, this.v + this.i, this.u + i1, this.v + this.i + this.j - 2, -9994619, paramCanvas);
      a.a(this.u + i1 + 1, this.v + this.i, this.u + i1 + 1, this.v + this.i + this.j - 2, -15255217, paramCanvas);
    }
  }
  
  public void a(byte[] paramArrayOfByte, byte paramByte)
  {
    paramArrayOfByte = new q(paramArrayOfByte);
    this.b = paramByte;
    int i1 = paramArrayOfByte.e();
    this.e = i1;
    this.d = ((int[][])Array.newInstance(Integer.TYPE, new int[] { i1, 3 }));
    i1 = 0;
    if (i1 < this.d.length)
    {
      if (this.p)
      {
        this.d[i1][0] = paramArrayOfByte.h();
        this.d[i1][1] = paramArrayOfByte.h();
      }
      for (;;)
      {
        i1 += 1;
        break;
        this.d[i1][0] = paramArrayOfByte.h();
        this.d[i1][1] = paramArrayOfByte.h();
        this.d[i1][2] = paramArrayOfByte.h();
      }
    }
    a();
  }
  
  public boolean getHasInfo()
  {
    return this.c;
  }
  
  public int getLastPositionAvgPrice()
  {
    try
    {
      int i1 = this.d[(this.e - 1)][2];
      return i1;
    }
    catch (Exception localException) {}
    return 0;
  }
  
  public int getPosition()
  {
    return this.a;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    a(paramCanvas);
    if (this.e == 0) {
      return;
    }
    b();
    c(paramCanvas);
    b(paramCanvas);
    d(paramCanvas);
    e(paramCanvas);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getSize(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt2);
    if (View.MeasureSpec.getMode(paramInt2) != 1073741824) {
      paramInt1 = 200;
    }
    setMeasuredDimension(i1, paramInt1);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.w = paramInt1;
    this.x = paramInt2;
    this.g = 0;
    this.h = (this.w - this.g);
    this.i = 0;
    this.j = (this.x - this.i - this.y * 2);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = (int)paramMotionEvent.getX();
    switch (paramMotionEvent.getAction())
    {
    }
    do
    {
      return super.onTouchEvent(paramMotionEvent);
    } while (this.d == null);
    int i2 = i1 * this.d.length / this.h;
    i1 = i2;
    if (i2 < 0) {
      i1 = 0;
    }
    setIndex(i1);
    invalidate();
    return true;
  }
  
  public void setIndex(int paramInt)
  {
    if (this.e == 0) {
      return;
    }
    int i1;
    if (paramInt < -1) {
      i1 = this.e - 1;
    }
    for (;;)
    {
      this.f = i1;
      if (i1 == -1) {
        break;
      }
      c();
      this.C.a(this.q, this.r);
      this.B.removeMessages(1000);
      this.B.sendMessageDelayed(this.B.obtainMessage(1000), 2000L);
      return;
      i1 = paramInt;
      if (paramInt >= this.e) {
        i1 = -1;
      }
    }
    this.C.a(null, null);
  }
  
  public void setIsCurrency(boolean paramBoolean)
  {
    this.p = paramBoolean;
  }
  
  public void setOnChangeListener(dr paramdr)
  {
    this.C = paramdr;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\FundLineView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */