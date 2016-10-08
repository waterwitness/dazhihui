package com.android.dazhihui.ui.delegate.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.android.dazhihui.d.a;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.widget.kf;
import java.util.ArrayList;

public class b
  extends View
{
  private ArrayList<String> a = new ArrayList();
  private int b = 0;
  private int c = 20;
  private kf d;
  
  public b(Context paramContext, String paramString, int paramInt, float paramFloat)
  {
    super(paramContext);
    setText(paramString);
    this.c = (g.a().m() / 16);
    this.d = new kf();
    this.d.a(new kf(0, 0, g.a().m(), (int)(this.a.size() * this.c * paramFloat)));
    paramContext = new ViewGroup.LayoutParams(-1, -2);
    paramContext.height = (this.d.d + 5);
    paramContext.width = this.d.c;
    setLayoutParams(paramContext);
    this.b = paramInt;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    this.c = (g.a().m() / 16);
    a.a.setTextSize(this.c);
    a.a.setStyle(Paint.Style.FILL);
    int i = 0;
    while (i < this.a.size())
    {
      a.a((String)this.a.get(i), this.d.a + 5, this.d.b + 5 + this.c * i, -16777216, Paint.Align.LEFT, paramCanvas);
      i += 1;
    }
  }
  
  public void setText(String paramString)
  {
    this.a.clear();
    this.a = a.a(paramString, g.a().m() - 10, g.a().m() - 10);
    invalidate();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\view\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */