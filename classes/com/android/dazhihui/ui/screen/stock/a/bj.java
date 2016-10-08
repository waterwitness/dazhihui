package com.android.dazhihui.ui.screen.stock.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.android.dazhihui.d.a;
import com.android.dazhihui.d.b;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.ly;

class bj
  implements ly
{
  bj(bf parambf) {}
  
  public void a(Canvas paramCanvas, Paint paramPaint, Rect paramRect, String paramString, int paramInt)
  {
    paramCanvas.save();
    Object localObject1;
    String str;
    int i;
    int j;
    if (paramString.contains("#"))
    {
      localObject1 = paramString.split("#");
      str = localObject1[0];
      paramString = localObject1[1] + " " + localObject1[2];
      paramInt = paramRect.left + paramRect.width() / 2;
      paramRect.left += 10;
      paramRect.top += 10;
      paramRect.right -= 10;
      paramRect.bottom -= 10;
      if ((localObject1[2].equals("-")) || (localObject1[2].equals("0.00%")))
      {
        bf.d(this.a).setBounds(paramRect);
        bf.d(this.a).draw(paramCanvas);
        paramPaint.setFakeBoldText(false);
        paramPaint.setColor(-1);
        paramPaint.setTextSize(bf.g(this.a));
        i = (int)(paramRect.height() - bf.g(this.a) - bf.h(this.a)) / 3;
        bf.c(this.a).a(str, paramInt, paramRect.top + i, Paint.Align.CENTER, paramCanvas, paramPaint);
        paramPaint.setTextSize(bf.h(this.a));
        localObject1 = bf.c(this.a);
        j = paramRect.top;
        ((TableLayoutGroup)localObject1).a(paramString, paramInt, (int)bf.g(this.a) + (j + i * 2), Paint.Align.CENTER, paramCanvas, paramPaint);
      }
    }
    for (;;)
    {
      paramCanvas.restore();
      return;
      if (localObject1[2].contains("-"))
      {
        bf.e(this.a).setBounds(paramRect);
        bf.e(this.a).draw(paramCanvas);
        break;
      }
      bf.f(this.a).setBounds(paramRect);
      bf.f(this.a).draw(paramCanvas);
      break;
      if (paramString.contains("/"))
      {
        Object localObject2 = paramString.split("/");
        localObject1 = localObject2[0];
        str = "/" + localObject2[1] + "/";
        localObject2 = localObject2[2];
        paramPaint.setFakeBoldText(false);
        paramPaint.setTextSize(bf.i(this.a));
        paramInt = paramRect.left;
        i = (paramRect.width() - a.a(paramString, paramPaint)) / 2 + paramInt;
        paramInt = paramRect.top;
        paramInt = (int)(paramRect.height() - bf.i(this.a)) / 2 + paramInt;
        paramPaint.setColor(b.g(1));
        bf.c(this.a).a((String)localObject1, i, paramInt, Paint.Align.LEFT, paramCanvas, paramPaint);
        i += a.a((String)localObject1, paramPaint);
        paramPaint.setColor(b.g(0));
        bf.c(this.a).a(str, i, paramInt, Paint.Align.LEFT, paramCanvas, paramPaint);
        j = a.a(str, paramPaint);
        paramPaint.setColor(b.g(-1));
        bf.c(this.a).a((String)localObject2, i + j, paramInt, Paint.Align.LEFT, paramCanvas, paramPaint);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\a\bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */