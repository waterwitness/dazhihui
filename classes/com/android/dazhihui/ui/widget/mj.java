package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.android.dazhihui.ui.screen.y;

class mj
  extends View
  implements ma
{
  private Paint b = new Paint(1);
  private float c = 0.0F;
  private int d;
  private int e = 0;
  
  public mj(TableLayoutGroup paramTableLayoutGroup, Context paramContext)
  {
    super(paramContext);
    this.b.setTextSize(this.c);
    paramContext = this.b.getFontMetrics();
    this.d = ((int)getResources().getDimension(2131230837));
    this.e = ((int)(paramContext.descent - paramContext.ascent) + this.d * 5);
    setOnTouchListener(new mk(this, paramTableLayoutGroup));
  }
  
  private void a(Canvas paramCanvas, String paramString, int paramInt1, int paramInt2, int paramInt3, Paint.Align paramAlign, int paramInt4)
  {
    if (paramString == null) {}
    do
    {
      return;
      this.b.setFakeBoldText(false);
      this.b.setColor(paramInt4);
      if (paramAlign == Paint.Align.CENTER)
      {
        paramInt3 /= 2;
        this.a.a(paramString, paramInt1 + paramInt3, paramInt2 + (this.e - (int)this.c) / 2, Paint.Align.CENTER, paramCanvas, this.b);
        return;
      }
      if (paramAlign == Paint.Align.RIGHT)
      {
        this.a.a(paramString, paramInt1 + paramInt3 - 5, paramInt2 + (this.e - (int)this.c) / 2, Paint.Align.RIGHT, paramCanvas, this.b);
        return;
      }
    } while (paramAlign != Paint.Align.LEFT);
    this.a.a(paramString, paramInt1, paramInt2 + (this.e - (int)this.c) / 2, Paint.Align.LEFT, paramCanvas, this.b);
  }
  
  private void a(mh parammh)
  {
    if ((parammh != null) && (TableLayoutGroup.v(this.a) == null)) {
      TableLayoutGroup.a(this.a, new int[parammh.a.length]);
    }
    if (TableLayoutGroup.h(this.a).length > 3)
    {
      TableLayoutGroup.c(this.a, 0);
      int j = 1;
      if (j < parammh.a.length)
      {
        int k = (int)this.b.measureText(parammh.a[j]) + TableLayoutGroup.y(this.a) * 2;
        i = k;
        Object localObject;
        String str;
        if (TableLayoutGroup.D(this.a) != null)
        {
          i = k;
          if (j < TableLayoutGroup.D(this.a).length)
          {
            i = k;
            if (TableLayoutGroup.D(this.a)[j] != 0)
            {
              i = k;
              if (parammh.a[j].contains("#"))
              {
                localObject = parammh.a[j].split("#");
                str = localObject[0];
                localObject = localObject[1] + " " + localObject[2];
                if (this.b.measureText(str) <= this.b.measureText((String)localObject)) {
                  break label277;
                }
              }
            }
          }
        }
        label277:
        for (i = (int)this.b.measureText(str) + TableLayoutGroup.y(this.a) * 2;; i = (int)this.b.measureText((String)localObject) + TableLayoutGroup.y(this.a) * 2)
        {
          TableLayoutGroup.v(this.a)[j] = Math.max(TableLayoutGroup.v(this.a)[j], i);
          j += 1;
          break;
        }
      }
      int i = 0;
      while (i < TableLayoutGroup.v(this.a).length)
      {
        TableLayoutGroup.e(this.a, TableLayoutGroup.v(this.a)[i]);
        i += 1;
      }
    }
  }
  
  public void a()
  {
    if (TableLayoutGroup.z(this.a) != null) {
      TableLayoutGroup.z(this.a).a(TableLayoutGroup.B(this.a));
    }
  }
  
  public void a(y paramy) {}
  
  public int b()
  {
    return this.e;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((TableLayoutGroup.B(this.a).a == null) || (TableLayoutGroup.B(this.a).a.length == 0)) {
      return;
    }
    paramCanvas.save();
    int i = TableLayoutGroup.a(this.a, 0);
    int j = getHeight();
    this.b.setTextSize(this.c);
    paramCanvas.clipRect(0, 0, i, j);
    if ((TableLayoutGroup.u(this.a) == y.b) && (TableLayoutGroup.B(this.a).b[0] == 34816)) {
      TableLayoutGroup.B(this.a).b[0] = -13418915;
    }
    this.b.setTextSize(this.c + 7.0F);
    a(paramCanvas, TableLayoutGroup.B(this.a).a[0], TableLayoutGroup.s(this.a), 0, i, TableLayoutGroup.C(this.a), TableLayoutGroup.B(this.a).b[0]);
    paramCanvas.restore();
    paramCanvas.save();
    paramCanvas.clipRect(i, 0, TableLayoutGroup.b(this.a, TableLayoutGroup.h(this.a).length) + i, j);
    i = TableLayoutGroup.j(this.a) + 1;
    if (i <= TableLayoutGroup.t(this.a))
    {
      if (i == 0) {}
      for (;;)
      {
        i += 1;
        break;
        int k = TableLayoutGroup.B(this.a).b[i];
        j = k;
        if (TableLayoutGroup.u(this.a) == y.b) {
          if ((k != -1) && (k != 65280))
          {
            j = k;
            if (k != -16711681) {}
          }
          else
          {
            j = -16777216;
          }
        }
        this.b.setTextSize(this.c);
        a(paramCanvas, TableLayoutGroup.B(this.a).a[i], this.a.a + TableLayoutGroup.b(this.a, i - 1), 0, TableLayoutGroup.a(this.a, i), TableLayoutGroup.p(this.a), j);
      }
    }
    paramCanvas.restore();
    if (TableLayoutGroup.u(this.a) == y.b) {
      this.b.setColor(-3618616);
    }
    for (;;)
    {
      this.b.setStrokeWidth(1.0F);
      paramCanvas.drawLine(TableLayoutGroup.s(this.a), this.e - 1, getWidth(), this.e - 1, this.b);
      this.b.setStrokeWidth(1.0F);
      return;
      this.b.setColor(-7829368);
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return TableLayoutGroup.a(this.a, this, paramMotionEvent);
  }
  
  public void scrollBy(int paramInt1, int paramInt2)
  {
    TableLayoutGroup.a(this.a, paramInt1, paramInt2);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\mj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */