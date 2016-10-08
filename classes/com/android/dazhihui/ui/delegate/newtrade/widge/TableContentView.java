package com.android.dazhihui.ui.delegate.newtrade.widge;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.util.AttributeSet;
import android.view.View;
import com.android.dazhihui.d.a;

public class TableContentView
  extends View
{
  private Paint a = new Paint();
  private int b;
  private int c;
  private String[][] d;
  private int[] e;
  private int f;
  private int g;
  private int h;
  private int i;
  private int j;
  private int k;
  private int l;
  
  public TableContentView(Context paramContext)
  {
    super(paramContext);
    a();
  }
  
  public TableContentView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  private void a()
  {
    this.b = getResources().getDimensionPixelSize(2131230879);
    this.c = getResources().getDimensionPixelSize(2131230877);
    this.l = getResources().getColor(2131492961);
    this.j = getResources().getColor(2131492962);
    this.k = getResources().getColor(2131492970);
    this.i = getResources().getColor(2131492975);
    this.f = getResources().getColor(2131492955);
    this.g = getResources().getDimensionPixelOffset(2131230814);
    this.h = getResources().getDimensionPixelOffset(2131230830);
  }
  
  private void b()
  {
    int i1;
    int m;
    if (this.e != null)
    {
      i1 = 0;
      m = 0;
      for (;;)
      {
        n = m;
        if (i1 >= this.e.length) {
          break;
        }
        m += this.e[i1];
        i1 += 1;
      }
    }
    int n = 0;
    int i2;
    if (this.d != null)
    {
      i1 = 0;
      m = 0;
      i2 = m;
      if (i1 < this.d.length)
      {
        i2 = this.d[i1].length;
        if ((this.d[i1][0].equals("")) && (!this.d[i1][(i2 - 1)].equals(""))) {
          m += this.g;
        }
        for (;;)
        {
          i1 += 1;
          break;
          m += this.h;
        }
      }
    }
    else
    {
      i2 = 0;
    }
    setMeasuredDimension(n, i2);
  }
  
  public int getTextSize()
  {
    return this.b;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.d == null) || (this.d.length == 0) || (this.e == null) || (this.e.length == 0)) {
      return;
    }
    int m = 0;
    for (int n = 0; m < this.e.length; n = i1 + n)
    {
      i1 = this.e[m];
      m += 1;
    }
    int i1 = 0;
    m = 0;
    label83:
    int i3;
    label181:
    int i2;
    String str;
    float f1;
    if (i1 < this.d.length)
    {
      i3 = this.d[i1].length;
      if ((!this.d[i1][0].equals("")) || (this.d[i1][(i3 - 1)].equals(""))) {
        break label374;
      }
      this.a.setTextAlign(Paint.Align.LEFT);
      if (!this.d[i1][(i3 - 1)].contains("T")) {
        break label306;
      }
      this.a.setColor(this.i);
      this.a.setTextSize(this.c);
      i2 = a.c(this.d[i1][(i3 - 1)], this.c);
      str = this.d[i1][(i3 - 1)];
      f1 = 0;
      i3 = this.g / 2;
      paramCanvas.drawText(str, f1, i2 / 2 + (i3 + m), this.a);
      m += this.g;
    }
    for (;;)
    {
      this.a.setColor(this.f);
      paramCanvas.drawLine(0.0F, m, n, m, this.a);
      i1 += 1;
      break label83;
      break;
      label306:
      if (this.d[i1][(i3 - 1)].contains("买"))
      {
        this.a.setColor(this.k);
        break label181;
      }
      if (!this.d[i1][(i3 - 1)].contains("卖")) {
        break label181;
      }
      this.a.setColor(this.j);
      break label181;
      label374:
      this.a.setTextAlign(Paint.Align.CENTER);
      this.a.setTextSize(this.b);
      i2 = 0;
      i3 = 0;
      if (i2 < this.d[i1].length - 1)
      {
        label457:
        int i4;
        int i5;
        if (i2 == 0)
        {
          str = "";
          if (this.d[i1][i2].equals("1"))
          {
            this.a.setColor(this.k);
            str = "证券买入";
            i4 = a.c(str, this.b);
            f1 = this.e[i2] / 2 + i3;
            i5 = this.h / 2;
            paramCanvas.drawText(str, f1, i4 / 2 + (i5 + m), this.a);
          }
        }
        for (;;)
        {
          i3 += this.e[i2];
          i2 += 1;
          break;
          if (!this.d[i1][i2].equals("2")) {
            break label457;
          }
          this.a.setColor(this.j);
          str = "证券卖出";
          break label457;
          this.a.setColor(this.l);
          i4 = a.c(this.d[i1][i2], this.b);
          str = this.d[i1][i2];
          f1 = this.e[i2] / 2 + i3;
          i5 = this.h / 2;
          paramCanvas.drawText(str, f1, i4 / 2 + (i5 + m), this.a);
        }
      }
      m += this.h;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    b();
  }
  
  public void setData(String[][] paramArrayOfString)
  {
    this.d = paramArrayOfString;
  }
  
  public void setWidths(int[] paramArrayOfInt)
  {
    this.e = paramArrayOfInt;
    requestLayout();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\widge\TableContentView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */