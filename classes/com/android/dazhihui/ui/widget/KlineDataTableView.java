package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.android.dazhihui.d.a;
import com.android.dazhihui.d.b;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.KLineCjhbVo;
import com.android.dazhihui.ui.model.stock.KLineCjhbVo.CjhbItem;
import com.android.dazhihui.ui.model.stock.KLineCjhbVo.MinData;
import com.android.dazhihui.ui.model.stock.KLineGdzjcVo.GdzjcItem;
import com.android.dazhihui.ui.widget.stockchart.x;
import com.android.dazhihui.ui.widget.stockchart.z;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class KlineDataTableView
  extends View
{
  private Context a;
  private DisplayMetrics b;
  private Paint c = new Paint(1);
  private z d;
  private x e;
  private KLineGdzjcVo.GdzjcItem f;
  private KLineCjhbVo.CjhbItem g;
  private KLineCjhbVo h;
  private String i;
  private String j;
  private String k;
  private Map<String, String> l = new LinkedHashMap();
  private int m;
  
  public KlineDataTableView(Context paramContext)
  {
    super(paramContext);
    this.a = paramContext;
    b();
  }
  
  public KlineDataTableView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = paramContext;
    b();
  }
  
  public KlineDataTableView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a = paramContext;
    b();
  }
  
  private int a(Canvas paramCanvas)
  {
    int n = (int)(this.b.density * 11.0F);
    int i3 = (int)(this.b.density * 5.0F);
    int i4 = (this.m - i3 * 2) / 5;
    this.c.setTextSize(14.0F * this.b.density);
    int i2;
    int i1;
    Object localObject1;
    if (this.i.equals("1"))
    {
      if (this.g == null) {
        return 0;
      }
      a.a(this.g.jzrq, i3, n + 2, Paint.Align.LEFT, paramCanvas, this.c);
      i2 = a.a(this.g.jzrq, this.c);
      i1 = this.m - i3 * 2 - i2 - 10;
      localObject1 = this.g.zdfname + this.g.zdfvalue + this.a.getResources().getString(2131165624);
      if (a.a((String)localObject1, this.c) < i1)
      {
        a.a((String)localObject1, this.m - i3, n + 2, Paint.Align.RIGHT, paramCanvas, this.c);
        i1 = n + (b.a + n);
      }
    }
    for (;;)
    {
      a.a(i3, i1, this.m - i3 * 2, n * 2 + b.a, -5592406, paramCanvas);
      a.a(i4 * 3 + i3, i1, i4 * 3 + i3, b.a + i1 + n * 2, -5592406, paramCanvas);
      a.a(i4 * 4 + i3, i1, i4 * 4 + i3, b.a + i1 + n * 2, -5592406, paramCanvas);
      i1 += n;
      a.a(this.a.getResources().getString(2131165626), i4 * 3 / 2 + i3, i1 + 2, Paint.Align.CENTER, paramCanvas, this.c);
      a.a(this.a.getResources().getString(2131165623) + "(" + this.h.getDw() + ")", i4 * 7 / 2 + i3, i1 + 2, Paint.Align.CENTER, paramCanvas, this.c);
      a.a(this.a.getResources().getString(2131165625) + "(" + this.h.getDw() + ")", i4 * 9 / 2 + i3, i1 + 2, Paint.Align.CENTER, paramCanvas, this.c);
      i1 = b.a + n + i1;
      localObject1 = this.g.minDataItems.iterator();
      Object localObject2;
      List localList;
      for (;;)
      {
        i2 = i1;
        if (!((Iterator)localObject1).hasNext()) {
          break;
        }
        localObject2 = (KLineCjhbVo.MinData)((Iterator)localObject1).next();
        localList = a.a(((KLineCjhbVo.MinData)localObject2).yybmc, i4 * 3 - i3 * 2, this.c);
        i2 = localList.size();
        a.a(i3, i1, this.m - i3 * 2, (b.a + n) * i2 + n, -5592406, paramCanvas);
        a.a(i4 * 3 + i3, i1, i4 * 3 + i3, (b.a + n) * i2 + i1 + n, -5592406, paramCanvas);
        a.a(i4 * 4 + i3, i1, i4 * 4 + i3, (b.a + n) * i2 + i1 + n, -5592406, paramCanvas);
        this.c.setColor(-4558075);
        a.a(((KLineCjhbVo.MinData)localObject2).mrje, i4 * 7 / 2 + i3, ((b.a + n) * i2 + n - b.a) / 2 + i1, Paint.Align.CENTER, paramCanvas, this.c);
        a.a(((KLineCjhbVo.MinData)localObject2).mcje, i3 + i4 * 9 / 2, i1 + ((b.a + n) * i2 + n - b.a) / 2, Paint.Align.CENTER, paramCanvas, this.c);
        this.c.setColor(-1);
        i1 += n;
        localObject2 = localList.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          a.a((String)((Iterator)localObject2).next(), i4 * 3 / 2 + i3, i1 + 2, Paint.Align.CENTER, paramCanvas, this.c);
          i1 += b.a + n;
          continue;
          localObject1 = a.a((String)localObject1, i1, this.c).iterator();
          i1 = n;
          while (((Iterator)localObject1).hasNext())
          {
            a.a((String)((Iterator)localObject1).next(), i3 + i2 + 10, i1 + 2, Paint.Align.LEFT, paramCanvas, this.c);
            i1 += b.a + n;
          }
        }
      }
      if ((this.i.equals("2")) || (this.i.equals("3")) || (this.i.equals("4")))
      {
        i4 = (int)(this.b.density * 100.0F);
        if ((this.d == null) && (this.f == null) && (this.e == null)) {
          return 0;
        }
        i1 = a.a(this.j, this.c);
        i2 = this.m - i3 * 2;
        if (i1 > i2)
        {
          localObject1 = a.a(this.j, i2, this.c).iterator();
          for (i1 = n; ((Iterator)localObject1).hasNext(); i1 = b.a + n + i1) {
            a.a((String)((Iterator)localObject1).next(), i3, i1 + 2, Paint.Align.LEFT, paramCanvas, this.c);
          }
          a.b(i3, i1, this.m - i3 * 2, n * 2 + b.a, -10000537, paramCanvas);
          localObject1 = this.l.entrySet().iterator();
        }
        for (;;)
        {
          i2 = i1;
          if (!((Iterator)localObject1).hasNext()) {
            break label1473;
          }
          localObject2 = (Map.Entry)((Iterator)localObject1).next();
          i2 = this.m;
          localList = a.a((String)((Map.Entry)localObject2).getValue(), i2 - i3 * 4 - i4, this.c);
          i2 = localList.size();
          a.a(i3, i1, this.m - i3 * 2, (b.a + n) * i2 + n, -5592406, paramCanvas);
          a.a(i3 + i4, i1, i3 + i4, (b.a + n) * i2 + i1 + n, -5592406, paramCanvas);
          a.a((String)((Map.Entry)localObject2).getKey(), i3 + i3, i1 + ((b.a + n) * i2 + n - b.a) / 2, Paint.Align.LEFT, paramCanvas, this.c);
          i1 += n;
          localObject2 = localList.iterator();
          for (;;)
          {
            if (((Iterator)localObject2).hasNext())
            {
              a.a((String)((Iterator)localObject2).next(), i3 + i4 + i3, i1 + 2, Paint.Align.LEFT, paramCanvas, this.c);
              i1 += b.a + n;
              continue;
              a.a(this.j, this.m / 2, n + 2, Paint.Align.CENTER, paramCanvas, this.c);
              i1 = n + (b.a + n);
              break;
            }
          }
        }
      }
      i2 = n;
      label1473:
      return n * 2 + i2;
    }
  }
  
  private void b()
  {
    this.m = g.a().m();
    this.b = this.a.getResources().getDisplayMetrics();
    this.c.setColor(-1);
    this.i = "2";
  }
  
  private void c()
  {
    int n = a(new Canvas());
    ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
    localLayoutParams.height = n;
    setLayoutParams(localLayoutParams);
    invalidate();
  }
  
  public void a()
  {
    this.i = "0";
    invalidate();
  }
  
  public void a(String paramString1, String paramString2, String paramString3, KLineCjhbVo paramKLineCjhbVo, String paramString4)
  {
    this.h = paramKLineCjhbVo;
    this.i = paramString1;
    this.j = paramString2;
    this.k = paramString3;
    paramString1 = this.h.getItems();
    this.g = null;
    paramString1 = paramString1.iterator();
    while (paramString1.hasNext())
    {
      paramString2 = (KLineCjhbVo.CjhbItem)paramString1.next();
      if (paramString2.newsid.equals(paramString4)) {
        this.g = paramString2;
      }
    }
    c();
  }
  
  public void a(String paramString1, String paramString2, String paramString3, KLineGdzjcVo.GdzjcItem paramGdzjcItem)
  {
    this.l.clear();
    this.i = paramString1;
    this.j = paramString2;
    this.k = paramString3;
    this.f = paramGdzjcItem;
    if (this.f == null) {
      return;
    }
    try
    {
      paramString1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(this.k);
      this.k = new SimpleDateFormat("yyyy-MM-dd").format(paramString1);
      this.l.put(this.a.getResources().getString(2131165642), this.k);
      this.l.put(this.a.getResources().getString(2131165635), this.f.bdfx);
      this.l.put(this.a.getResources().getString(2131165636), this.f.bdjz);
      this.l.put(this.a.getResources().getString(2131165637), this.f.bdsl);
      this.l.put(this.a.getResources().getString(2131165638), this.f.gdlx);
      this.l.put(this.a.getResources().getString(2131165639), this.f.gdmc);
      this.l.put(this.a.getResources().getString(2131165640), this.f.zzgb);
      c();
      return;
    }
    catch (ParseException paramString1)
    {
      for (;;) {}
    }
  }
  
  public void a(String paramString1, String paramString2, String paramString3, x paramx)
  {
    this.l.clear();
    this.i = paramString1;
    this.j = paramString2;
    this.k = paramString3;
    this.e = paramx;
    if (this.e == null) {
      return;
    }
    try
    {
      paramString1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(this.k);
      this.k = new SimpleDateFormat("yyyy-MM-dd").format(paramString1);
      this.l.put(this.a.getResources().getString(2131165642), this.k);
      this.l.put(this.a.getResources().getString(2131165627), this.e.a);
      this.l.put(this.a.getResources().getString(2131165628), this.e.b);
      this.l.put(this.a.getResources().getString(2131165629), this.e.c);
      this.l.put(this.a.getResources().getString(2131165630), this.e.d);
      this.l.put(this.a.getResources().getString(2131165631), this.e.e);
      this.l.put(this.a.getResources().getString(2131165632), this.e.f);
      this.l.put(this.a.getResources().getString(2131165633), this.e.g);
      this.l.put(this.a.getResources().getString(2131165634), this.e.i);
      c();
      return;
    }
    catch (ParseException paramString1)
    {
      for (;;) {}
    }
  }
  
  public void a(String paramString1, String paramString2, String paramString3, z paramz)
  {
    this.l.clear();
    this.i = paramString1;
    this.j = paramString2;
    this.k = paramString3;
    this.d = paramz;
    if (this.d == null) {
      return;
    }
    try
    {
      paramString1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(this.k);
      this.k = new SimpleDateFormat("yyyy-MM-dd").format(paramString1);
      this.l.put(this.a.getResources().getString(2131165642), this.k);
      this.l.put(this.a.getResources().getString(2131165641), this.d.a);
      this.l.put(this.a.getResources().getString(2131165643), this.d.c);
      this.l.put(this.a.getResources().getString(2131165644), this.d.d);
      this.l.put(this.a.getResources().getString(2131165645), this.d.e);
      this.l.put(this.a.getResources().getString(2131165646), this.d.f);
      this.l.put(this.a.getResources().getString(2131165647), this.d.g);
      c();
      return;
    }
    catch (ParseException paramString1)
    {
      for (;;) {}
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    a(paramCanvas);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\KlineDataTableView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */