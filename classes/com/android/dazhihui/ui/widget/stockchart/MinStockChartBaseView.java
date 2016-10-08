package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewParent;
import com.android.dazhihui.d;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.stock.uv;

public abstract class MinStockChartBaseView
  extends StockChartBaseView
{
  protected MinChartContainer a;
  protected StockVo b;
  public int c = -1;
  public int d = 10;
  public int e = 11;
  private int f;
  private float g;
  private VelocityTracker h = null;
  private Runnable i = new am(this);
  private Handler n = new an(this);
  
  public MinStockChartBaseView(Context paramContext)
  {
    super(paramContext);
  }
  
  public MinStockChartBaseView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public MinStockChartBaseView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private void a(int paramInt)
  {
    this.b = this.a.getDataModel();
    if (this.b != null)
    {
      this.c = (this.b.getMinTotalPoint() * paramInt / getWidth());
      this.a.setScreenIndex(this.c);
      if (d.a().d())
      {
        Message localMessage = this.n.obtainMessage(this.d);
        localMessage.obj = Integer.valueOf(this.c);
        this.n.sendMessageDelayed(localMessage, 1000L);
      }
    }
  }
  
  public void h()
  {
    this.b = this.a.getDataModel();
    if (this.b != null)
    {
      this.c = (this.f * this.b.getMinTotalPoint() / getWidth());
      this.a.setScreenIndex(this.c);
      if (d.a().d())
      {
        Message localMessage = this.n.obtainMessage(this.e);
        localMessage.obj = Integer.valueOf(this.c);
        this.n.sendMessage(localMessage);
      }
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int j = (int)paramMotionEvent.getX();
    this.f = j;
    if (this.a.getDisplayModel() == ae.a) {
      return super.onTouchEvent(paramMotionEvent);
    }
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    }
    for (;;)
    {
      a(j);
      return true;
      if (this.h == null)
      {
        this.h = VelocityTracker.obtain();
        label89:
        this.a.getHolder().getHolder().b(true);
        this.h.addMovement(paramMotionEvent);
        if (this.h != null) {
          break label186;
        }
        this.h = VelocityTracker.obtain();
      }
      for (;;)
      {
        this.h.addMovement(paramMotionEvent);
        this.h.computeCurrentVelocity(1000);
        this.g = this.h.getXVelocity();
        getParent().requestDisallowInterceptTouchEvent(true);
        removeCallbacks(this.i);
        break;
        this.h.clear();
        break label89;
        label186:
        this.h.clear();
      }
      postDelayed(this.i, 1500L);
      this.a.getHolder().getHolder().b(false);
      if (d.a().d())
      {
        this.n.removeMessages(this.d);
        paramMotionEvent = this.n.obtainMessage(this.e);
        paramMotionEvent.obj = Integer.valueOf(this.a.getDataModel().getMinIndex());
        this.n.sendMessage(paramMotionEvent);
      }
    }
  }
  
  public void setCurrentPosition(int paramInt)
  {
    this.c = paramInt;
    postInvalidate();
  }
  
  public void setHolder(MinChartContainer paramMinChartContainer)
  {
    this.a = paramMinChartContainer;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\MinStockChartBaseView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */