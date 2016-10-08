package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.android.dazhihui.d.a;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.MarketVo;
import com.android.dazhihui.ui.model.stock.PlateItem;
import com.android.dazhihui.ui.screen.stock.PlateListScreen;
import com.android.dazhihui.ui.screen.y;
import java.util.Iterator;
import java.util.List;

public class PlateLinkageView
  extends View
{
  private Context a;
  private List<PlateItem> b;
  private Paint c = new Paint(1);
  private int d;
  private int e;
  
  public PlateLinkageView(Context paramContext)
  {
    super(paramContext);
    this.a = paramContext;
    a();
  }
  
  public PlateLinkageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = paramContext;
    a();
  }
  
  public PlateLinkageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a = paramContext;
    a();
  }
  
  private int a(Canvas paramCanvas)
  {
    int j = g.a().m();
    int k = (int)TypedValue.applyDimension(1, 11.0F, this.a.getResources().getDisplayMetrics());
    int m = (int)TypedValue.applyDimension(1, 5.0F, this.a.getResources().getDisplayMetrics());
    if (this.b == null) {
      return 0;
    }
    int n = (j - m * 2) / 4;
    this.c.setTextSize(TypedValue.applyDimension(1, 14.0F, this.a.getResources().getDisplayMetrics()));
    int i1 = (int)(this.c.descent() - this.c.ascent());
    a.b(m, k, j - m * 2, k * 2 + i1, this.e, paramCanvas);
    int i = k + k;
    this.c.setColor(this.d);
    a.a(this.a.getResources().getString(2131166047), m + m, i + 2, Paint.Align.LEFT, paramCanvas, this.c);
    i += k * 2 + i1;
    a.a(m, i, j - m * 2, k * 2 + i1, -14144978, paramCanvas);
    a.a(m + n, i, m + n, i + i1 + k * 2, -14144978, paramCanvas);
    a.a(n * 2 + m, i, n * 2 + m, i + i1 + k * 2, -14144978, paramCanvas);
    a.a(n * 3 + m, i, n * 3 + m, i + i1 + k * 2, -14144978, paramCanvas);
    i += k;
    a.a(this.a.getResources().getString(2131166043), n / 2 + m, i + 2, Paint.Align.CENTER, paramCanvas, this.c);
    a.a(this.a.getResources().getString(2131166044), n * 3 / 2 + m, i + 2, Paint.Align.CENTER, paramCanvas, this.c);
    a.a(this.a.getResources().getString(2131166045), n * 5 / 2 + m, i + 2, Paint.Align.CENTER, paramCanvas, this.c);
    a.a(this.a.getResources().getString(2131166046), n * 7 / 2 + m, i + 2, Paint.Align.CENTER, paramCanvas, this.c);
    i += i1 + k;
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      PlateItem localPlateItem = (PlateItem)localIterator.next();
      a.a(m, i, j - m * 2, k * 2 + i1, -14144978, paramCanvas);
      localPlateItem.rect = new kf(m, i, j - m * 2, k * 2 + i1);
      a.a(m + n, i, m + n, i + i1 + k * 2, -14144978, paramCanvas);
      a.a(n * 2 + m, i, n * 2 + m, i + i1 + k * 2, -14144978, paramCanvas);
      a.a(n * 3 + m, i, n * 3 + m, i + i1 + k * 2, -14144978, paramCanvas);
      i += k;
      this.c.setColor(this.d);
      a.a(localPlateItem.name, n / 2 + m, i + 2, Paint.Align.CENTER, paramCanvas, this.c);
      this.c.setColor(localPlateItem.color);
      a.a(localPlateItem.zxj, n * 3 / 2 + m, i + 2, Paint.Align.CENTER, paramCanvas, this.c);
      a.a(localPlateItem.zd, n * 5 / 2 + m, i + 2, Paint.Align.CENTER, paramCanvas, this.c);
      a.a(localPlateItem.zf, n * 7 / 2 + m, i + 2, Paint.Align.CENTER, paramCanvas, this.c);
      i += i1 + k;
    }
    return i + k;
  }
  
  public void a()
  {
    if (g.a().b() == y.a)
    {
      this.d = getResources().getColor(2131493677);
      this.e = -12499378;
      return;
    }
    this.d = getResources().getColor(2131492903);
    this.e = getResources().getColor(2131493677);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    a(paramCanvas);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    int j = (int)paramMotionEvent.getX();
    int k = (int)paramMotionEvent.getY();
    switch (i)
    {
    }
    do
    {
      while (!((Iterator)localObject).hasNext())
      {
        do
        {
          return true;
        } while (this.b == null);
        localObject = this.b.iterator();
      }
      paramMotionEvent = (PlateItem)((Iterator)localObject).next();
    } while (!paramMotionEvent.rect.a(j, k));
    Object localObject = new Bundle();
    ((Bundle)localObject).putParcelable("market_vo", new MarketVo(paramMotionEvent.name, false, false, paramMotionEvent.bid));
    ((Bundle)localObject).putString("code", paramMotionEvent.code);
    paramMotionEvent = new Intent(this.a, PlateListScreen.class);
    paramMotionEvent.putExtras((Bundle)localObject);
    this.a.startActivity(paramMotionEvent);
    return false;
  }
  
  public void setData(List<PlateItem> paramList)
  {
    this.b = paramList;
    int i = a(new Canvas());
    paramList = getLayoutParams();
    paramList.height = i;
    setLayoutParams(paramList);
    requestLayout();
    invalidate();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\PlateLinkageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */