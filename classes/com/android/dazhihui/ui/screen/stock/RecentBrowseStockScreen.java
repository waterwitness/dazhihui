package com.android.dazhihui.ui.screen.stock;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Paint.Align;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.d.b;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.mh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class RecentBrowseStockScreen
  extends BaseActivity
  implements i, cp, cs
{
  private int a = 33273;
  private String[] b = null;
  private boolean[] c;
  private byte d;
  private int e = -1;
  private DzhHeader f;
  private TableLayoutGroup g;
  private List<mh> h = new LinkedList();
  private com.android.dazhihui.ui.a.m i = com.android.dazhihui.ui.a.m.a();
  private SelfSelectedStockManager j = SelfSelectedStockManager.getInstance();
  private BroadcastReceiver k = new pz(this);
  private com.android.dazhihui.a.b.m l;
  
  private mh a(String paramString)
  {
    Object localObject2 = this.h.iterator();
    Object localObject1;
    do
    {
      if (!((Iterator)localObject2).hasNext()) {
        break;
      }
      localObject1 = (mh)((Iterator)localObject2).next();
    } while (!paramString.equals(localObject1.k[0]));
    for (;;)
    {
      localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = new mh();
        ((mh)localObject2).k = new Object[] { paramString };
        paramString = new String[this.b.length];
        localObject1 = new int[this.b.length];
        ((mh)localObject2).a = paramString;
        ((mh)localObject2).b = ((int[])localObject1);
        this.h.add(localObject2);
      }
      Arrays.fill(((mh)localObject2).a, "--");
      Arrays.fill(((mh)localObject2).b, -1);
      return (mh)localObject2;
      localObject1 = null;
    }
  }
  
  private void a(mh parammh)
  {
    if ((this.e < 0) || (this.e >= this.c.length) || (this.c[this.e] == 0)) {}
    for (;;)
    {
      return;
      int n = this.h.indexOf(parammh);
      int m = 0;
      String str1;
      double d1;
      double d2;
      label357:
      label388:
      while (m < n)
      {
        String str2 = ((mh)this.h.get(m)).a[this.e];
        str1 = parammh.a[this.e];
        for (;;)
        {
          try
          {
            if (str2.endsWith("万"))
            {
              d1 = Double.parseDouble(str2.substring(0, str2.length() - 1));
              d1 *= 10000.0D;
              d2 = d1;
            }
          }
          catch (NumberFormatException localNumberFormatException2)
          {
            d2 = 0.0D;
            continue;
            if (str1.endsWith("亿"))
            {
              d1 = Double.parseDouble(str1.substring(0, str1.length() - 1)) * 1.0E8D;
              continue;
            }
            if (str1.endsWith("%"))
            {
              d1 = Double.parseDouble(str1.substring(0, str1.length() - 1));
              continue;
            }
            d1 = Double.parseDouble(str1);
            continue;
          }
          try
          {
            if (!str1.endsWith("万")) {
              continue;
            }
            d1 = Double.parseDouble(str1.substring(0, str1.length() - 1));
            d1 *= 10000.0D;
          }
          catch (NumberFormatException localNumberFormatException1)
          {
            d1 = 0.0D;
            continue;
            if (d2 <= d1) {
              break label388;
            }
            this.h.remove(parammh);
            this.h.add(m, parammh);
            return;
            m += 1;
          }
          if (this.d != 0) {
            break label357;
          }
          if (d2 >= d1) {
            break label388;
          }
          this.h.remove(parammh);
          this.h.add(m, parammh);
          return;
          if (str2.endsWith("亿")) {
            d1 = Double.parseDouble(str2.substring(0, str2.length() - 1)) * 1.0E8D;
          } else if (str2.endsWith("%")) {
            d1 = Double.parseDouble(str2.substring(0, str2.length() - 1));
          } else {
            d1 = Double.parseDouble(str2);
          }
        }
      }
    }
  }
  
  private void b()
  {
    boolean bool = false;
    com.android.dazhihui.d.n.a("", 1001);
    this.a = 33273;
    if (this.e != -1) {
      this.e = 1;
    }
    this.c = new boolean[] { 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1 };
    this.b = getResources().getStringArray(2131361799);
    this.h.clear();
    this.g.b();
    this.g.setHeaderColumn(this.b);
    this.g.setColumnAlign(Paint.Align.CENTER);
    this.g.setFirstColumnHeadAlign(Paint.Align.CENTER);
    this.g.setColumnClickable(this.c);
    this.d = 0;
    TableLayoutGroup localTableLayoutGroup = this.g;
    int m = this.e;
    if (this.d == 0) {}
    for (;;)
    {
      localTableLayoutGroup.a(m, bool);
      return;
      bool = true;
    }
  }
  
  private void c()
  {
    if ((this.e < 0) || (this.e >= this.c.length) || (this.c[this.e] == 0)) {
      return;
    }
    int m = 0;
    while (m < this.h.size() - 1)
    {
      int n = m + 1;
      Object localObject;
      double d1;
      double d2;
      if (n < this.h.size())
      {
        String str = ((mh)this.h.get(m)).a[this.e];
        localObject = ((mh)this.h.get(n)).a[this.e];
        for (;;)
        {
          try
          {
            if (str.endsWith("万"))
            {
              d1 = Double.parseDouble(str.substring(0, str.length() - 1));
              d1 *= 10000.0D;
              d2 = d1;
            }
          }
          catch (NumberFormatException localNumberFormatException2)
          {
            d2 = 0.0D;
            continue;
            if (((String)localObject).endsWith("亿"))
            {
              d1 = Double.parseDouble(((String)localObject).substring(0, ((String)localObject).length() - 1)) * 1.0E8D;
              continue;
            }
            if (((String)localObject).endsWith("%"))
            {
              d1 = Double.parseDouble(((String)localObject).substring(0, ((String)localObject).length() - 1));
              continue;
            }
            d1 = Double.parseDouble((String)localObject);
            continue;
          }
          try
          {
            if (!((String)localObject).endsWith("万")) {
              continue;
            }
            d1 = Double.parseDouble(((String)localObject).substring(0, ((String)localObject).length() - 1));
            d1 *= 10000.0D;
          }
          catch (NumberFormatException localNumberFormatException1)
          {
            d1 = 0.0D;
            continue;
            if (d2 <= d1) {
              continue;
            }
            mh localmh = (mh)this.h.get(m);
            this.h.set(m, this.h.get(n));
            this.h.set(n, localmh);
            continue;
          }
          if (this.d != 0) {
            break label422;
          }
          if (d2 < d1)
          {
            localObject = (mh)this.h.get(m);
            this.h.set(m, this.h.get(n));
            this.h.set(n, localObject);
          }
          n += 1;
          break;
          if (str.endsWith("亿")) {
            d1 = Double.parseDouble(str.substring(0, str.length() - 1)) * 1.0E8D;
          } else if (str.endsWith("%")) {
            d1 = Double.parseDouble(str.substring(0, str.length() - 1));
          } else {
            d1 = Double.parseDouble(str);
          }
        }
      }
      label422:
      m += 1;
    }
    this.g.a(this.h, 0);
  }
  
  public boolean OnChildClick(View paramView)
  {
    switch (((Integer)paramView.getTag()).intValue())
    {
    case 1: 
    default: 
      return true;
    case 0: 
      finish();
      return true;
    case 3: 
      startActivity(new Intent(this, SearchStockScreen.class));
      return true;
    }
    this.f.setMoreRefresh(true);
    this.f.a();
    a();
    return true;
  }
  
  public void a()
  {
    int i1 = 50;
    ArrayList localArrayList;
    x localx;
    Vector localVector1;
    if (this.j.getBrowseStockVector().size() > 0)
    {
      localArrayList = new ArrayList();
      localx = new x(2955);
      localx.c(107);
      localx.c(this.a);
      Vector localVector2 = this.j.getBrowseStockCodeVector();
      if (localVector2.size() <= 50) {
        break label283;
      }
      Vector localVector3 = new Vector();
      localVector1 = new Vector();
      int m = 0;
      int n;
      for (;;)
      {
        n = i1;
        if (m >= 50) {
          break;
        }
        localVector3.add(localVector2.get(m));
        m += 1;
      }
      while (n < localVector2.size())
      {
        localVector1.add(localVector2.get(n));
        n += 1;
      }
      localx.a(localVector3);
      localx.c("最新浏览-列表前50个");
      localArrayList.add(localx);
      localx = new x(2955);
      localx.c(107);
      localx.c(this.a);
      localx.a(localVector1);
      localx.c("最新浏览-列表后50个");
      localArrayList.add(localx);
    }
    for (;;)
    {
      this.l = new com.android.dazhihui.a.b.m();
      this.l.a("最新浏览-列表 NioRequest");
      this.l.a(com.android.dazhihui.a.b.n.a);
      registRequestListener(this.l);
      this.l.a(localArrayList);
      setAutoRequest(this.l);
      sendRequest(this.l);
      return;
      label283:
      localVector1 = this.j.getBrowseStockCodeVector();
      localx.a(localVector1);
      localx.c("最新浏览-列表 Vector=" + localVector1);
      localArrayList.add(localx);
    }
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (qe.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
        if (this.g != null)
        {
          this.g.setBackgroundColor(getResources().getColor(2131493542));
          this.g.a(paramy);
        }
      } while (this.f == null);
      this.f.a(paramy);
      return;
      if (this.g != null)
      {
        this.g.setBackgroundColor(getResources().getColor(2131493605));
        this.g.a(paramy);
      }
    } while (this.f == null);
    this.f.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 8232;
    paramct.d = paramContext.getResources().getString(2131165547);
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.f = paramDzhHeader;
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    paramj = (o)paramj;
    if (paramj == null) {}
    do
    {
      return;
      if (paramh == this.l) {
        this.f.b();
      }
      paramh = paramj.h();
    } while (paramh == null);
    for (;;)
    {
      try
      {
        if (paramh.a == 2955)
        {
          paramh = new q(paramh.b);
          int m = paramh.e();
          int n = paramh.e();
          if (m != 107) {
            break;
          }
          paramh.e();
          int i1 = paramh.e();
          if (n == 33273)
          {
            m = 0;
            if (m < i1)
            {
              paramj = paramh.l();
              mh localmh = a(paramj);
              String[] arrayOfString = localmh.a;
              int[] arrayOfInt = localmh.b;
              arrayOfString[0] = paramh.l();
              arrayOfInt[0] = 39936;
              int i2 = paramh.b();
              int i3 = paramh.b();
              int i4 = paramh.h();
              paramh.h();
              int i5 = paramh.h();
              int i6 = paramh.h();
              int i7 = paramh.h();
              int i8 = paramh.h();
              paramh.e();
              int i9 = paramh.h();
              int i10 = paramh.e();
              int i11 = paramh.e();
              int i12 = paramh.d();
              int i13 = paramh.d();
              int i14 = paramh.b();
              int i15 = paramh.f();
              int i16 = paramh.f();
              bool = false;
              if ((n >>> 15 & 0x1) != 0)
              {
                if ((paramh.b() & 0x1) != 1) {
                  break label711;
                }
                bool = true;
              }
              arrayOfString[1] = b.a(i5, i2);
              arrayOfInt[1] = b.h(i5, i4);
              arrayOfString[2] = b.c(i5, i4);
              arrayOfInt[2] = arrayOfInt[1];
              arrayOfString[3] = b.d(i5, i4, i2);
              arrayOfInt[3] = arrayOfInt[1];
              arrayOfString[4] = b.a(i4, i2);
              arrayOfInt[4] = -1;
              arrayOfString[5] = com.android.dazhihui.d.n.a(b.b(i9));
              arrayOfInt[5] = 65280;
              arrayOfString[6] = com.android.dazhihui.d.n.a(b.b(i8) * 10000L);
              arrayOfInt[6] = -16711681;
              arrayOfString[7] = b.a(i6, i2);
              arrayOfInt[7] = b.h(i6, i4);
              arrayOfString[8] = b.a(i7, i2);
              arrayOfInt[8] = b.h(i7, i4);
              arrayOfString[9] = b.k(i6 - i7, i4);
              arrayOfInt[9] = -1;
              arrayOfString[10] = b.a(i12, arrayOfString[1]);
              arrayOfInt[10] = b.h(i12 + 10000, 10000);
              arrayOfString[11] = b.d(i11);
              arrayOfInt[11] = 65280;
              arrayOfString[12] = b.a(i10, 2);
              arrayOfInt[12] = -1;
              arrayOfString[13] = b.a(i13 / 100.0F, 2);
              arrayOfInt[13] = b.g(i13);
              arrayOfString[14] = b.d(i15);
              arrayOfInt[14] = 65280;
              arrayOfString[15] = b.d(i16);
              arrayOfInt[15] = -1;
              if (i14 == 1) {
                arrayOfInt[0] = -1;
              }
              localmh.d = com.android.dazhihui.d.n.e(paramj);
              localmh.g = i3;
              localmh.h = bool;
              if (i14 <= 0) {
                break label717;
              }
              bool = true;
              localmh.i = bool;
              a(localmh);
              m += 1;
              continue;
            }
          }
        }
        if ((this.j.getBrowseStockVector().size() <= 0) || ((this.h.size() != this.j.getBrowseStockVector().size()) && (this.h.size() <= 50))) {
          break;
        }
        this.g.a(this.h, 0);
        return;
      }
      catch (Exception paramh)
      {
        paramh.printStackTrace();
        return;
      }
      label711:
      boolean bool = false;
      continue;
      label717:
      bool = false;
    }
  }
  
  public void handleTimeout(h paramh)
  {
    if (paramh == this.l)
    {
      this.f.b();
      if (g.a().L()) {
        showShortToast(2131166193);
      }
    }
  }
  
  protected void init(Bundle paramBundle)
  {
    setContentView(2130903457);
    this.f = ((DzhHeader)findViewById(2131559836));
    this.f.setOnHeaderButtonClickListener(this);
    this.f.a(this, this);
    this.g = ((TableLayoutGroup)findViewById(2131559838));
    this.g.setContinuousLoading(true);
    this.g.setOnLoadingListener(new qa(this));
    this.g.setOnContentScrollChangeListener(new qb(this));
    this.g.setOnTableLayoutClickListener(new qc(this));
    paramBundle = d.a();
    if (this.i.y() == 0) {
      this.i.v(paramBundle.c("SHOW_MINE_STOCK_POP"));
    }
    if (this.i.y() == 0)
    {
      new Handler().postDelayed(new qd(this), 100L);
      this.i.v(1);
      paramBundle.a("SHOW_MINE_STOCK_POP", this.i.y());
    }
    paramBundle.g();
    registerReceiver(this.k, new IntentFilter("com.android.dazhihui.action.SELF_STOCK_CHANGED"));
    changeLookFace(this.mLookFace);
  }
  
  public void netException(h paramh, Exception paramException)
  {
    if (paramh == this.l)
    {
      this.f.b();
      showShortToast(2131166192);
    }
  }
  
  public void onDestroy()
  {
    unregisterReceiver(this.k);
    super.onDestroy();
  }
  
  public void onResume()
  {
    super.onResume();
    b();
    if (this.j.getBrowseStockVector().size() > 0)
    {
      this.f.a();
      a();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\RecentBrowseStockScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */