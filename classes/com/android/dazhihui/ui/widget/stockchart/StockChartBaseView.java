package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.screen.y;

public abstract class StockChartBaseView
  extends View
{
  private boolean a = false;
  protected Paint j;
  protected int k;
  public int l = 1;
  public int m = getResources().getDimensionPixelOffset(2131230820);
  
  public StockChartBaseView(Context paramContext)
  {
    super(paramContext);
    a();
  }
  
  public StockChartBaseView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  public StockChartBaseView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }
  
  protected void a()
  {
    this.j = new Paint(1);
  }
  
  protected void a(int paramInt1, int paramInt2)
  {
    if (g.a().b() == y.b) {}
    for (this.k = getResources().getColor(2131493297);; this.k = getResources().getColor(2131493296))
    {
      this.a = false;
      if ((paramInt1 > 0) && (paramInt2 > 0)) {}
      try
      {
        Bitmap localBitmap = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
        a(new Canvas(localBitmap));
        setBackgroundDrawable(new BitmapDrawable(localBitmap));
        this.a = true;
        return;
      }
      catch (Exception localException)
      {
        this.a = false;
        localException.printStackTrace();
      }
    }
  }
  
  protected abstract void a(Canvas paramCanvas);
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (!this.a) {
      a(paramCanvas);
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (getResources().getConfiguration().orientation == 1) {}
    for (this.l = 1;; this.l = 2)
    {
      a(paramInt1, paramInt2);
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\StockChartBaseView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */