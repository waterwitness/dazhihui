package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
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
import com.android.dazhihui.ui.model.IRequestAdapterListener;
import com.android.dazhihui.ui.model.RequestAdapter;
import com.android.dazhihui.ui.model.stock.GroupAdvertVo.AdvList;
import com.android.dazhihui.ui.screen.a;
import com.android.dazhihui.ui.screen.stock.qg;
import com.android.dazhihui.ui.screen.stock.sk;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.flip.ViewFlow;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class IndexTopWidget
  extends RelativeLayout
  implements i, IRequestAdapterListener
{
  public static final String[] a = { "SH000001", "SZ399006" };
  public static final String[] b = { "上证指数", "创业板指" };
  private static List<ga> l = new ArrayList();
  public fw c = null;
  protected RequestAdapter d = new ft(this);
  private int e = 5000;
  private String[] f;
  private TextView g;
  private int h = 1;
  private m i;
  private u j;
  private List<GroupAdvertVo.AdvList> k;
  private ViewFlow m;
  private qg n;
  private gc o;
  private a p;
  private y q = y.a;
  
  public IndexTopWidget(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public IndexTopWidget(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private int a(ga paramga, fv paramfv)
  {
    int i3 = 0;
    int i1;
    switch (fu.a[paramfv.ordinal()])
    {
    default: 
      i1 = 0;
      i2 = i3;
      if (i1 != 0) {
        if (paramga.f != 0) {
          break label101;
        }
      }
      break;
    }
    label101:
    for (int i2 = i3;; i2 = i1 - paramga.f)
    {
      if (i2 != 0) {
        break label112;
      }
      return -8616044;
      i1 = paramga.e;
      break;
      i1 = paramga.h;
      break;
      i1 = paramga.i;
      break;
      i1 = paramga.g;
      break;
    }
    label112:
    if (i2 > 0) {
      return -1689801;
    }
    return -11753174;
  }
  
  private String a(ga paramga)
  {
    if ((paramga.e == 0) && (paramga.f == 0)) {
      paramga = "0000.00";
    }
    String str;
    do
    {
      do
      {
        do
        {
          return paramga;
          str = b.a(paramga.e, paramga.c);
          paramga = str;
        } while (!str.contains("."));
        paramga = str;
      } while (str.length() < 8);
      paramga = str;
    } while (str.split("\\.")[1].length() <= 1);
    return str.substring(0, str.length() - 1);
  }
  
  private void a(Context paramContext)
  {
    int i1 = 0;
    while (i1 < a.length)
    {
      b(a[i1]);
      i1 += 1;
    }
    this.g = new TextView(getContext());
    this.g.setTextColor(-1734144);
    this.g.setTextSize(14.0F);
    this.g.setLines(2);
    this.g.setEllipsize(TextUtils.TruncateAt.END);
    this.g.setGravity(17);
    this.g.setVisibility(8);
    addView(this.g, -1, -1);
    this.m = new ViewFlow(getContext());
    this.o = new gc(this);
    this.m.setAdapter(this.o);
    this.m.a(this.e);
    addView(this.m, -1, -1);
    c();
    this.j = new fs(this);
  }
  
  public static boolean a(String paramString)
  {
    Iterator localIterator = l.iterator();
    while (localIterator.hasNext()) {
      if (((ga)localIterator.next()).a.equals(paramString)) {
        return true;
      }
    }
    return false;
  }
  
  private ga b(String paramString)
  {
    Object localObject = l.iterator();
    while (((Iterator)localObject).hasNext())
    {
      ga localga = (ga)((Iterator)localObject).next();
      if ((paramString != null) && (paramString.equals(localga.a))) {
        return localga;
      }
    }
    localObject = new ga(this, null);
    if (a[0].equals(paramString)) {
      ((ga)localObject).b = b[0];
    }
    for (;;)
    {
      ((ga)localObject).a = paramString;
      l.add(localObject);
      return (ga)localObject;
      if (a[1].equals(paramString)) {
        ((ga)localObject).b = b[1];
      }
    }
  }
  
  private String b(ga paramga)
  {
    if ((paramga.e == 0) && (paramga.f == 0)) {
      return "00.00";
    }
    if (paramga.e > paramga.f) {
      return "+" + b.b(paramga.e, paramga.f, paramga.c);
    }
    return b.b(paramga.e, paramga.f, paramga.c);
  }
  
  private String c(ga paramga)
  {
    if ((paramga.e == 0) && (paramga.f == 0)) {
      return "0.00%";
    }
    return b.b(paramga.e, paramga.f);
  }
  
  private void c()
  {
    Vector localVector = new Vector();
    Object localObject = l.iterator();
    while (((Iterator)localObject).hasNext()) {
      localVector.add(((ga)((Iterator)localObject).next()).a);
    }
    localObject = new x(2955);
    ((x)localObject).c(106);
    ((x)localObject).c(0);
    ((x)localObject).a(localVector);
    ((x)localObject).c("2955_106-跑马灯-IndexTopWidget-" + localVector);
    this.i = new m((x)localObject, n.d);
    registRequestListener(this.i);
    setAutoRequest(this.i);
    sendRequest(this.i);
    this.d.setAutoRequestPeriod(5000L);
  }
  
  public void a()
  {
    this.d.stop();
    this.d.destory();
    this.m.a();
    l.clear();
    if (this.k != null) {
      this.k.clear();
    }
    this.o.notifyDataSetChanged();
  }
  
  public void a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    paramString = b(paramString);
    paramString.c = paramInt1;
    paramString.e = paramInt2;
    paramString.h = paramInt3;
    paramString.i = paramInt4;
    paramString.j = paramInt5;
    this.o.notifyDataSetChanged();
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    if (paramj == null) {
      break label4;
    }
    for (;;)
    {
      label4:
      return;
      if (this.i != paramh) {
        continue;
      }
      paramj = ((o)paramj).h();
      if (paramj == null) {
        break;
      }
      try
      {
        byte[] arrayOfByte = paramj.b;
        if (arrayOfByte == null) {
          continue;
        }
        paramh = new q(arrayOfByte);
        if ((paramj.a != 2955) || (arrayOfByte == null)) {
          continue;
        }
        paramh.e();
        paramh.e();
        paramh.e();
        int i2 = paramh.e();
        int i1 = 0;
        while (i1 < i2)
        {
          paramj = b(paramh.l());
          paramj.b = paramh.l();
          paramj.c = paramh.b();
          paramj.d = paramh.b();
          paramj.f = paramh.h();
          paramj.g = paramh.h();
          paramj.e = paramh.h();
          paramj.h = paramh.h();
          paramj.i = paramh.h();
          paramj.j = paramh.h();
          i1 += 1;
        }
        this.o.notifyDataSetChanged();
        return;
      }
      catch (Exception paramh)
      {
        paramh = paramh;
        paramh.printStackTrace();
        return;
      }
      finally {}
    }
  }
  
  public void handleTimeout(h paramh) {}
  
  public void netException(h paramh, Exception paramException) {}
  
  public void registRequestListener(h paramh)
  {
    this.d.registRequestListener(paramh);
  }
  
  public void removeRequest(h paramh)
  {
    this.d.removeRequest(paramh);
  }
  
  public void sendRequest(h paramh)
  {
    this.d.sendRequest(paramh);
  }
  
  public void setAutoRequest(h paramh)
  {
    this.d.setAutoRequest(paramh);
  }
  
  public void setAutoRequestPeriod(long paramLong)
  {
    this.d.setAutoRequestPeriod(paramLong);
  }
  
  public void setHomeFragment(sk paramsk)
  {
    this.p = paramsk;
    if (this.c == null) {
      this.c = new fw(this, 118);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\IndexTopWidget.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */