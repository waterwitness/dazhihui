package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.model.stock.StockVo.Api3010;
import com.android.dazhihui.ui.screen.stock.uv;
import com.android.dazhihui.ui.screen.y;
import java.util.ArrayList;
import java.util.Iterator;

public class StockCostDistributionView
  extends View
{
  private StockChartContainer a;
  private av b;
  private int c;
  private int d;
  private Paint e = new Paint();
  private Context f;
  private int g;
  private int h;
  private int i;
  private int j;
  private int k;
  private y l;
  private float m;
  
  public StockCostDistributionView(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public StockCostDistributionView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public StockCostDistributionView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private float a(int paramInt1, int paramInt2)
  {
    float f1 = 0.0F;
    int i1 = getHeight();
    int n = paramInt1;
    if (paramInt1 < 0) {
      n = 0;
    }
    float f2 = (i1 - 2) * n * 1.0F / paramInt2;
    if (i1 - f2 - 2.0F > 0.0F) {
      f1 = i1 - f2 - 2.0F;
    }
    return f1;
  }
  
  public void a(Context paramContext)
  {
    this.f = paramContext;
    if (g.a().m() >= 1080) {
      this.m = 3.0F;
    }
    for (;;)
    {
      this.e.setStrokeWidth(this.m);
      this.e.setStyle(Paint.Style.FILL);
      this.e.setColor(getResources().getColor(2131493689));
      a(g.a().b());
      return;
      if (g.a().m() >= 720)
      {
        this.m = 2.6F;
        if (g.a().b() != y.b) {
          this.m = 2.2F;
        }
      }
      else if (g.a().m() != 0)
      {
        this.m = 1.7F;
        if (g.a().b() != y.b) {
          this.m = 1.55F;
        }
      }
    }
  }
  
  public void a(y paramy)
  {
    this.l = paramy;
    if (paramy == y.a)
    {
      this.j = -14276556;
      this.i = -64512;
      this.g = -409082;
      this.h = -16732935;
    }
    for (this.k = -11839121;; this.k = -2697514)
    {
      setBackgroundColor(this.j);
      postInvalidate();
      return;
      this.j = -1;
      this.i = -65536;
      this.g = -409082;
      this.h = -16732992;
    }
  }
  
  public void a(StockChartContainer paramStockChartContainer, av paramav)
  {
    this.a = paramStockChartContainer;
    this.b = paramav;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.a == null) || (this.a.getHolder() == null)) {}
    label71:
    label87:
    label232:
    label401:
    label416:
    label419:
    label429:
    for (;;)
    {
      return;
      StockVo localStockVo = this.a.getHolder().u();
      if (localStockVo != null)
      {
        Object localObject1;
        int n;
        int i1;
        if (this.b == av.a)
        {
          localObject1 = localStockVo.getmApi3010_MinChart();
          n = localStockVo.getMinChartMaxShowPrice();
          i1 = localStockVo.getMinChartMinShowPrice();
        }
        for (;;)
        {
          if (localObject1 == null) {
            break label429;
          }
          Object localObject2 = ((ArrayList)localObject1).iterator();
          int i2 = Integer.MIN_VALUE;
          if (((Iterator)localObject2).hasNext())
          {
            StockVo.Api3010 localApi3010 = (StockVo.Api3010)((Iterator)localObject2).next();
            if (localApi3010.vol <= i2) {
              break label416;
            }
            i2 = localApi3010.vol;
          }
          for (;;)
          {
            break label87;
            if (this.b != av.b) {
              break label419;
            }
            localObject1 = localStockVo.getmApi3010_KChart();
            n = localStockVo.getKChartMaxShowPrice();
            i1 = localStockVo.getKChartMinShowPrice();
            break label71;
            this.e.setStyle(Paint.Style.STROKE);
            this.e.setStrokeWidth(1.0F);
            this.e.setColor(this.k);
            paramCanvas.drawRect(1.0F, 1.0F, this.c, this.d - 1, this.e);
            this.e.setStrokeWidth(this.m);
            localObject1 = ((ArrayList)localObject1).iterator();
            float f1;
            float f2;
            float f3;
            float f4;
            if (((Iterator)localObject1).hasNext())
            {
              localObject2 = (StockVo.Api3010)((Iterator)localObject1).next();
              f1 = a(((StockVo.Api3010)localObject2).price - i1, n - i1);
              f2 = 1.0F * ((StockVo.Api3010)localObject2).vol / i2 * this.c;
              f3 = 1.0F * ((StockVo.Api3010)localObject2).bigVol / i2;
              f4 = this.c;
              this.e.setColor(this.g);
              if (((StockVo.Api3010)localObject2).price != localStockVo.getCp()) {
                break label401;
              }
              this.e.setColor(this.h);
              paramCanvas.drawLine(0.0F, getHeight() / 2, f2, getHeight() / 2, this.e);
            }
            for (;;)
            {
              this.e.setColor(this.i);
              paramCanvas.drawLine(0.0F, f1, f3 * f4, f1, this.e);
              break label232;
              break;
              paramCanvas.drawLine(0.0F, f1, f2, f1, this.e);
            }
          }
          i1 = 0;
          localObject1 = null;
          n = 0;
        }
      }
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.c = paramInt1;
    this.d = paramInt2;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\StockCostDistributionView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */