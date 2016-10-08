package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.n;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.a.u;
import com.android.dazhihui.d.b;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.IRequestAdapterListener;
import com.android.dazhihui.ui.model.RequestAdapter;
import com.android.dazhihui.ui.model.stock.StockVo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class IndexWidget
  extends RelativeLayout
  implements View.OnClickListener, i, IRequestAdapterListener
{
  private static String[] i = { "SH000001", "SZ399001", "SZ399006" };
  protected RequestAdapter a = new gj(this);
  private Context b;
  private LinearLayout c;
  private MarqueeView d;
  private TextView e;
  private TextView f;
  private TextView g;
  private TextView h;
  private String j = "洪书敏解读创业板走向直播中 》》》》》》》》》》》》》》》欢迎收看！";
  private int k = 0;
  private Vector<String> l = new Vector();
  private List<gm> m = new ArrayList();
  private m n;
  private u o;
  private Runnable p = new gi(this);
  
  public IndexWidget(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public IndexWidget(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private int a(gm paramgm, gl paramgl)
  {
    int i3 = 0;
    int i1;
    switch (gk.a[paramgl.ordinal()])
    {
    default: 
      i1 = 0;
      i2 = i3;
      if (i1 != 0) {
        if (paramgm.f != 0) {
          break label101;
        }
      }
      break;
    }
    label101:
    for (int i2 = i3;; i2 = i1 - paramgm.f)
    {
      if (i2 != 0) {
        break label112;
      }
      return -8616044;
      i1 = paramgm.e;
      break;
      i1 = paramgm.h;
      break;
      i1 = paramgm.i;
      break;
      i1 = paramgm.g;
      break;
    }
    label112:
    if (i2 > 0) {
      return -1689801;
    }
    return -11753174;
  }
  
  private gm a(String paramString)
  {
    Object localObject = this.m.iterator();
    while (((Iterator)localObject).hasNext())
    {
      gm localgm = (gm)((Iterator)localObject).next();
      if (localgm.a.equals(paramString)) {
        return localgm;
      }
    }
    localObject = new gm(this, null);
    ((gm)localObject).a = paramString;
    this.m.add(localObject);
    return (gm)localObject;
  }
  
  private String a(gm paramgm)
  {
    if ((paramgm.e == 0) && (paramgm.f == 0)) {
      paramgm = "0000.00";
    }
    String str;
    do
    {
      do
      {
        do
        {
          return paramgm;
          str = b.a(paramgm.e, paramgm.c);
          paramgm = str;
        } while (!str.contains("."));
        paramgm = str;
      } while (str.length() < 8);
      paramgm = str;
    } while (str.split("\\.")[1].length() <= 1);
    return str.substring(0, str.length() - 1);
  }
  
  private void a(Context paramContext)
  {
    int i1 = 0;
    this.b = paramContext;
    setBackgroundColor(-13749961);
    this.c = new LinearLayout(this.b);
    paramContext = new RelativeLayout.LayoutParams(-1, -1);
    addView(this.c, paramContext);
    this.d = new MarqueeView(this.b);
    this.d.setEllipsize(TextUtils.TruncateAt.MARQUEE);
    this.d.setSingleLine();
    this.d.setFocusable(true);
    this.d.setFocusableInTouchMode(true);
    this.d.setTextColor(65280);
    this.d.setMarqueeRepeatLimit(-1);
    this.d.setTextSize(14.0F);
    this.d.setText(this.j);
    this.d.setGravity(16);
    this.d.setVisibility(8);
    paramContext = new RelativeLayout.LayoutParams(-1, -1);
    addView(this.d, paramContext);
    this.e = new TextView(this.b);
    paramContext = new LinearLayout.LayoutParams(0, -1);
    paramContext.weight = 1.0F;
    this.e.setGravity(17);
    this.e.setTextSize(14.0F);
    this.e.setTextColor(-2892312);
    this.c.addView(this.e, paramContext);
    this.f = new TextView(this.b);
    paramContext = new LinearLayout.LayoutParams(0, -1);
    paramContext.weight = 1.0F;
    this.f.setGravity(17);
    this.f.setTextSize(14.0F);
    this.c.addView(this.f, paramContext);
    this.g = new TextView(this.b);
    paramContext = new LinearLayout.LayoutParams(0, -1);
    paramContext.weight = 1.0F;
    this.g.setGravity(17);
    this.g.setTextSize(14.0F);
    this.c.addView(this.g, paramContext);
    this.h = new TextView(this.b);
    paramContext = new LinearLayout.LayoutParams(0, -1);
    paramContext.weight = 1.0F;
    this.h.setGravity(17);
    this.h.setTextSize(14.0F);
    this.c.addView(this.h, paramContext);
    this.c.setOnClickListener(this);
    this.l.clear();
    while (i1 < i.length)
    {
      this.l.add(i[i1]);
      a(i[i1]);
      i1 += 1;
    }
    b();
    this.o = new gh(this);
  }
  
  private String b(gm paramgm)
  {
    if ((paramgm.e == 0) && (paramgm.f == 0)) {
      return "00.00";
    }
    if (paramgm.e > paramgm.f) {
      return "+" + b.b(paramgm.e, paramgm.f, paramgm.c);
    }
    return b.b(paramgm.e, paramgm.f, paramgm.c);
  }
  
  private void b()
  {
    x localx = new x(2955);
    localx.c(106);
    localx.c(0);
    localx.a(this.l);
    localx.c("2955_106-IndexWidget-" + this.l);
    this.n = new m(localx, n.d);
    registRequestListener(this.n);
    setAutoRequest(this.n);
    sendRequest(this.n);
    this.a.setAutoRequestPeriod(5000L);
  }
  
  private String c(gm paramgm)
  {
    if ((paramgm.e == 0) && (paramgm.f == 0)) {
      return "0.00%";
    }
    return b.b(paramgm.e, paramgm.f);
  }
  
  private void c()
  {
    if (this.k == i.length)
    {
      this.c.setVisibility(8);
      this.d.setVisibility(0);
      return;
    }
    this.c.setVisibility(0);
    this.d.setVisibility(8);
    gm localgm = (gm)this.m.get(this.k);
    this.e.setText(localgm.b);
    int i1 = a(localgm, gl.a);
    this.f.setTextColor(i1);
    this.f.setText(a(localgm));
    this.g.setTextColor(i1);
    this.g.setText(b(localgm));
    this.h.setTextColor(i1);
    this.h.setText(c(localgm));
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    if (paramj == null) {}
    label4:
    int i2;
    do
    {
      p localp;
      byte[] arrayOfByte;
      do
      {
        do
        {
          do
          {
            break label4;
            break label4;
            do
            {
              return;
            } while (!(paramj instanceof o));
            localp = ((o)paramj).h();
          } while (localp == null);
          arrayOfByte = localp.b;
        } while (arrayOfByte == null);
        paramj = new q(arrayOfByte);
      } while ((localp.a != 2955) || (arrayOfByte == null));
      paramj.e();
      paramj.e();
      paramj.e();
      i2 = paramj.e();
    } while (this.n != paramh);
    int i1 = 0;
    while (i1 < i2)
    {
      paramh = a(paramj.l());
      paramh.b = paramj.l();
      paramh.c = paramj.b();
      paramh.d = paramj.b();
      paramh.f = paramj.h();
      paramh.g = paramj.h();
      paramh.e = paramj.h();
      paramh.h = paramj.h();
      paramh.i = paramj.h();
      paramh.j = paramj.h();
      i1 += 1;
    }
    c();
  }
  
  public void handleTimeout(h paramh) {}
  
  public void netException(h paramh, Exception paramException) {}
  
  public void onClick(View paramView)
  {
    if ((paramView == this.c) && (this.k >= 0) && (this.k < i.length))
    {
      paramView = (gm)this.m.get(this.k);
      paramView = new StockVo(paramView.b, paramView.a, paramView.d, false);
      Bundle localBundle = new Bundle();
      localBundle.putParcelable("stock_vo", paramView);
      r.a(this.b, paramView, localBundle);
    }
  }
  
  public void registRequestListener(h paramh)
  {
    this.a.registRequestListener(paramh);
  }
  
  public void removeRequest(h paramh)
  {
    this.a.removeRequest(paramh);
  }
  
  public void sendRequest(h paramh)
  {
    this.a.sendRequest(paramh);
  }
  
  public void setAutoRequest(h paramh)
  {
    this.a.setAutoRequest(paramh);
  }
  
  public void setAutoRequestPeriod(long paramLong)
  {
    this.a.setAutoRequestPeriod(paramLong);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\IndexWidget.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */