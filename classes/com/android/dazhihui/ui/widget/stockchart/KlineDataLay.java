package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.android.dazhihui.d.a;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.KLineDataLayVo;
import com.android.dazhihui.ui.model.stock.KLineDataLayVo.DataLayItem;
import com.android.dazhihui.ui.screen.e;
import com.android.dazhihui.ui.screen.stock.TemplateActivity;
import com.android.dazhihui.ui.screen.stock.fq;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.kf;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class KlineDataLay
  extends View
{
  private Context a;
  private DisplayMetrics b;
  private KLineDataLayVo c;
  private Paint d = new Paint(1);
  private e e;
  private String f;
  private String g;
  private FrameLayout h;
  private int i;
  private int j;
  private int k;
  private int l;
  private int m = -13421773;
  
  public KlineDataLay(Context paramContext)
  {
    this(paramContext, null, 0);
  }
  
  public KlineDataLay(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public KlineDataLay(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a = paramContext;
    this.b = this.a.getResources().getDisplayMetrics();
    a(g.a().b());
    this.d.setColor(this.i);
    this.l = (g.a().n() * 14 / 480);
  }
  
  private int a(Canvas paramCanvas)
  {
    int i2 = (int)(this.b.density * 11.0F);
    int i3 = (int)(this.b.density * 5.0F);
    if (this.c == null) {
      return 0;
    }
    Object localObject1 = this.c.getItems();
    this.d.setTextSize(14.0F * this.b.density);
    Map localMap = this.c.getMap();
    localObject1 = ((List)localObject1).iterator();
    int i1 = 0;
    int n = i2;
    while (((Iterator)localObject1).hasNext())
    {
      KLineDataLayVo.DataLayItem localDataLayItem = (KLineDataLayVo.DataLayItem)((Iterator)localObject1).next();
      Object localObject2 = (String)localMap.get(localDataLayItem.type);
      this.d.setColor(this.j);
      a.a((String)localObject2, i3, n + 2, Paint.Align.LEFT, paramCanvas, this.d);
      int i4 = a.a((String)localObject2, this.d);
      this.d.setColor(this.i);
      int i5 = this.b.widthPixels;
      localObject2 = a.a(localDataLayItem.title, i5 - i3 * 4 - i4, this.d).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        a.a((String)((Iterator)localObject2).next(), i3 + i4 + i3 * 2, n + 2, Paint.Align.LEFT, paramCanvas, this.d);
        n += this.l + i2;
      }
      n -= i2;
      this.d.setColor(this.k);
      a.a(localDataLayItem.foramtDate, this.b.widthPixels - i3 * 2, n + 2, Paint.Align.RIGHT, paramCanvas, this.d);
      n += this.l;
      a.a(i3, n, this.b.widthPixels + i3 - i3 * 2, n, this.m, paramCanvas);
      localDataLayItem.rect = new kf(i3, i1, this.b.widthPixels - i3 * 2, n - i1);
      i1 = n;
      n += i2;
    }
    return n + i2;
  }
  
  public void a(KLineDataLayVo paramKLineDataLayVo, e parame)
  {
    this.c = paramKLineDataLayVo;
    this.e = parame;
    int n = a(new Canvas());
    paramKLineDataLayVo = getLayoutParams();
    paramKLineDataLayVo.height = n;
    setLayoutParams(paramKLineDataLayVo);
    invalidate();
  }
  
  public void a(y paramy)
  {
    if (g.a().b() == y.b)
    {
      this.i = getResources().getColor(2131492903);
      this.j = -4558075;
      this.k = -8355712;
      this.m = -2697514;
      return;
    }
    this.i = getResources().getColor(2131493677);
    this.j = 41472;
    this.k = getResources().getColor(2131493677);
    this.m = -13421773;
  }
  
  public void a(String paramString1, String paramString2)
  {
    this.f = paramString1;
    this.g = paramString2;
  }
  
  public boolean a()
  {
    return this.c != null;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    a(paramCanvas);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int n = paramMotionEvent.getAction();
    int i1 = (int)paramMotionEvent.getX();
    int i2 = (int)paramMotionEvent.getY();
    switch (n)
    {
    }
    do
    {
      while (!((Iterator)localObject).hasNext())
      {
        do
        {
          return true;
        } while (this.c == null);
        localObject = this.c.getItems().iterator();
      }
      paramMotionEvent = (KLineDataLayVo.DataLayItem)((Iterator)localObject).next();
    } while (!paramMotionEvent.rect.a(i1, i2));
    Object localObject = new Bundle();
    ((Bundle)localObject).putString("newsid", paramMotionEvent.newsid);
    ((Bundle)localObject).putString("title", paramMotionEvent.title);
    ((Bundle)localObject).putString("type", paramMotionEvent.type);
    ((Bundle)localObject).putString("newsDate", paramMotionEvent.newsDate);
    ((Bundle)localObject).putString("url", paramMotionEvent.url);
    ((Bundle)localObject).putString("code", this.f);
    ((Bundle)localObject).putString("name", this.g);
    ((Bundle)localObject).putString("templateTitle", this.g);
    ((Bundle)localObject).putString("name", fq.class.getName());
    paramMotionEvent = new Intent(getContext(), TemplateActivity.class);
    paramMotionEvent.putExtras((Bundle)localObject);
    getContext().startActivity(paramMotionEvent);
    return false;
  }
  
  public void setParetView(ViewParent paramViewParent)
  {
    this.h = ((FrameLayout)paramViewParent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\KlineDataLay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */