package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.android.dazhihui.d.a;
import java.util.ArrayList;

public class MinuteDetailCtrl
  extends View
{
  private int a;
  private int b;
  private int c;
  private Paint d = new Paint(1);
  private int e;
  private String[] f;
  private String[] g = null;
  private String[] h = null;
  private String[] i = null;
  private String[] j = null;
  private ArrayList<String> k;
  private ArrayList<String> l = new ArrayList();
  private ArrayList<Integer> m;
  private ArrayList<Integer> n = null;
  private ArrayList<String> o = new ArrayList();
  private ArrayList<Integer> p = null;
  private int q = 0;
  private Context r;
  
  public MinuteDetailCtrl(Context paramContext)
  {
    this(paramContext, null, 0);
  }
  
  public MinuteDetailCtrl(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public MinuteDetailCtrl(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.r = paramContext;
    paramContext = paramContext.getResources();
    this.a = paramContext.getDimensionPixelSize(2131230820);
    this.e = paramContext.getDimensionPixelSize(2131231088);
    this.g = paramContext.getStringArray(2131361876);
    this.h = paramContext.getStringArray(2131361821);
    this.i = paramContext.getStringArray(2131361822);
    this.j = paramContext.getStringArray(2131361877);
  }
  
  public void a(ArrayList<String> paramArrayList, ArrayList<Integer> paramArrayList1)
  {
    this.l = paramArrayList;
    this.n = paramArrayList1;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    this.k = this.l;
    this.m = this.n;
    if (this.q == 1) {
      this.f = this.h;
    }
    while (this.k == null)
    {
      return;
      if (this.q == 2)
      {
        this.f = this.i;
      }
      else if (this.q == 3)
      {
        this.f = this.j;
        this.k = this.o;
        this.m = this.p;
      }
      else if (this.q == 0)
      {
        this.f = this.g;
      }
    }
    int i2;
    int i1;
    if ((this.q == 2) || (this.q == 1))
    {
      i2 = this.k.size();
      i1 = 0;
    }
    for (;;)
    {
      int i4 = 0;
      int i5;
      for (int i3 = i1; i4 < i2; i3 = i1)
      {
        i1 = i3;
        if (this.k != null)
        {
          i1 = this.e;
          i5 = this.f[i4].length();
          i1 = a.b((String)this.k.get(i4), this.e) + (i1 * i5 + i3);
        }
        i4 += 1;
      }
      this.e -= 2;
      i1 = i3;
      if (i3 <= this.b - (this.k.size() * 2 + 1) * 2)
      {
        this.e += 2;
        i4 = (this.b - i3) / (this.k.size() * 2 + 1);
        i5 = (this.c - this.e) / 2;
        this.d.setTextSize(this.e);
        i1 = 0;
        int i6;
        for (i3 = i4; i1 < i2; i3 = i6 + i4 + i3)
        {
          this.d.setColor(-1);
          a.a(this.f[i1], i3, i5, Paint.Align.LEFT, paramCanvas, this.d);
          i3 += this.e * this.f[i1].length() + i4;
          this.d.setColor(((Integer)this.m.get(i1)).intValue());
          a.a((String)this.k.get(i1), i3, i5, Paint.Align.LEFT, paramCanvas, this.d);
          i6 = a.b((String)this.k.get(i1), this.e);
          i1 += 1;
        }
        break;
        i2 = 5;
        i1 = 0;
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getSize(paramInt1);
    int i2 = View.MeasureSpec.getMode(paramInt2);
    paramInt1 = View.MeasureSpec.getSize(paramInt2);
    if (i2 == 1073741824) {}
    for (;;)
    {
      setMeasuredDimension(i1, paramInt1);
      return;
      paramInt1 = Math.min(this.a, paramInt1);
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.b = paramInt1;
    this.c = paramInt2;
  }
  
  public void setType(int paramInt)
  {
    this.q = paramInt;
    if (this.q == 3) {
      setBackgroundColor(this.r.getResources().getColor(2131493180));
    }
    while (this.q != 0) {
      return;
    }
    setBackgroundColor(this.r.getResources().getColor(2131493291));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\MinuteDetailCtrl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */