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

public class CorrelationStockScreen
  extends BaseActivity
  implements i, cp, cs
{
  private int a = 33273;
  private Vector<String> b = new Vector();
  private String[] c = null;
  private boolean[] d;
  private byte e;
  private int f;
  private DzhHeader g;
  private String h = "";
  private TableLayoutGroup i;
  private List<mh> j = new LinkedList();
  private com.android.dazhihui.ui.a.m k = com.android.dazhihui.ui.a.m.a();
  private BroadcastReceiver l = new av(this);
  private com.android.dazhihui.a.b.m m;
  
  private mh a(String paramString)
  {
    Object localObject2 = this.j.iterator();
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
        paramString = new String[this.c.length];
        localObject1 = new int[this.c.length];
        ((mh)localObject2).a = paramString;
        ((mh)localObject2).b = ((int[])localObject1);
        this.j.add(localObject2);
      }
      Arrays.fill(((mh)localObject2).a, "--");
      Arrays.fill(((mh)localObject2).b, -1);
      return (mh)localObject2;
      localObject1 = null;
    }
  }
  
  private void a(mh parammh)
  {
    if ((this.f < 0) || (this.f >= this.d.length) || (this.d[this.f] == 0)) {}
    for (;;)
    {
      return;
      int i1 = this.j.indexOf(parammh);
      int n = 0;
      String str1;
      double d1;
      double d2;
      label357:
      label388:
      while (n < i1)
      {
        String str2 = ((mh)this.j.get(n)).a[this.f];
        str1 = parammh.a[this.f];
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
            this.j.remove(parammh);
            this.j.add(n, parammh);
            return;
            n += 1;
          }
          if (this.e != 0) {
            break label357;
          }
          if (d2 >= d1) {
            break label388;
          }
          this.j.remove(parammh);
          this.j.add(n, parammh);
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
    this.a = 33273;
    this.f = 2;
    this.d = new boolean[] { 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1 };
    this.c = getResources().getStringArray(2131361799);
    this.j.clear();
    this.i.b();
    this.i.setHeaderColumn(this.c);
    this.i.setColumnClickable(this.d);
    this.e = 0;
    TableLayoutGroup localTableLayoutGroup = this.i;
    int n = this.f;
    if (this.e == 0) {}
    for (;;)
    {
      localTableLayoutGroup.a(n, bool);
      return;
      bool = true;
    }
  }
  
  private void c()
  {
    if ((this.f < 0) || (this.f >= this.d.length) || (this.d[this.f] == 0)) {
      return;
    }
    int n = 0;
    while (n < this.j.size() - 1)
    {
      int i1 = n + 1;
      Object localObject;
      double d1;
      double d2;
      if (i1 < this.j.size())
      {
        String str = ((mh)this.j.get(n)).a[this.f];
        localObject = ((mh)this.j.get(i1)).a[this.f];
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
            mh localmh = (mh)this.j.get(n);
            this.j.set(n, this.j.get(i1));
            this.j.set(i1, localmh);
            continue;
          }
          if (this.e != 0) {
            break label422;
          }
          if (d2 < d1)
          {
            localObject = (mh)this.j.get(n);
            this.j.set(n, this.j.get(i1));
            this.j.set(i1, localObject);
          }
          i1 += 1;
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
      n += 1;
    }
    this.i.a(this.j, 0);
  }
  
  public boolean OnChildClick(View paramView)
  {
    switch (((Integer)paramView.getTag()).intValue())
    {
    }
    for (;;)
    {
      return true;
      finish();
      continue;
      this.g.a();
      a();
    }
  }
  
  public Vector<String> a(int paramInt1, int paramInt2)
  {
    Vector localVector = new Vector();
    while ((paramInt1 <= paramInt2) && (paramInt1 < this.b.size()))
    {
      localVector.add(this.b.get(paramInt1));
      paramInt1 += 1;
    }
    return localVector;
  }
  
  public void a()
  {
    int i2 = this.b.size();
    if (i2 > 0)
    {
      ArrayList localArrayList = new ArrayList();
      int n = 0;
      int i1;
      do
      {
        x localx = new x(2955);
        localx.c(107);
        localx.c(this.a);
        localx.a(a(n, n + 50 - 1));
        localArrayList.add(localx);
        i1 = n + 50;
        n = i1;
      } while (i1 < i2);
      if (this.m == null)
      {
        this.m = new com.android.dazhihui.a.b.m();
        this.m.a(com.android.dazhihui.a.b.n.a);
        registRequestListener(this.m);
        setAutoRequest(this.m);
      }
      this.m.a(localArrayList);
      sendRequest(this.m);
    }
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (ba.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
        if (this.i != null)
        {
          this.i.setBackgroundColor(getResources().getColor(2131493542));
          this.i.a(paramy);
        }
      } while (this.g == null);
      this.g.a(paramy);
      return;
      if (this.i != null)
      {
        this.i.setBackgroundColor(getResources().getColor(2131493605));
        this.i.a(paramy);
      }
    } while (this.g == null);
    this.g.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 8232;
    this.h = paramContext.getResources().getString(2131166419);
    paramct.f = paramContext.getResources().getDrawable(2130838123);
    paramct.d = this.h;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.g = paramDzhHeader;
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    paramj = (o)paramj;
    if (paramj == null) {}
    int n;
    int i1;
    do
    {
      do
      {
        return;
        if (paramh == this.m) {
          this.g.b();
        }
        paramh = paramj.h();
      } while (paramh == null);
      if (paramh.a != 2955) {
        break;
      }
      paramh = new q(paramh.b);
      n = paramh.e();
      i1 = paramh.e();
    } while (n != 107);
    paramh.e();
    int i2 = paramh.e();
    if (i1 == 33273)
    {
      n = 0;
      if (n < i2)
      {
        paramj = paramh.l();
        mh localmh = a(paramj);
        String[] arrayOfString = localmh.a;
        int[] arrayOfInt = localmh.b;
        arrayOfString[0] = paramh.l();
        arrayOfInt[0] = 39936;
        int i3 = paramh.b();
        int i4 = paramh.b();
        int i5 = paramh.h();
        paramh.h();
        int i6 = paramh.h();
        int i7 = paramh.h();
        int i8 = paramh.h();
        int i9 = paramh.h();
        paramh.e();
        int i10 = paramh.h();
        int i11 = paramh.e();
        int i12 = paramh.e();
        int i13 = paramh.d();
        int i14 = paramh.d();
        int i15 = paramh.b();
        int i16 = paramh.f();
        int i17 = paramh.f();
        boolean bool = false;
        if ((i1 >>> 15 & 0x1) != 0)
        {
          if ((paramh.b() & 0x1) == 1) {
            bool = true;
          }
        }
        else
        {
          label267:
          arrayOfString[1] = b.a(i6, i3);
          arrayOfInt[1] = b.h(i6, i5);
          arrayOfString[2] = b.c(i6, i5);
          arrayOfInt[2] = arrayOfInt[1];
          arrayOfString[3] = b.d(i6, i5, i3);
          arrayOfInt[3] = arrayOfInt[1];
          arrayOfString[4] = b.a(i5, i3);
          arrayOfInt[4] = -1;
          arrayOfString[5] = com.android.dazhihui.d.n.a(b.b(i10));
          arrayOfInt[5] = 65280;
          arrayOfString[6] = com.android.dazhihui.d.n.a(b.b(i9) * 10000L);
          arrayOfInt[6] = -16711681;
          arrayOfString[7] = b.a(i7, i3);
          arrayOfInt[7] = b.h(i7, i5);
          arrayOfString[8] = b.a(i8, i3);
          arrayOfInt[8] = b.h(i8, i5);
          arrayOfString[9] = b.k(i7 - i8, i5);
          arrayOfInt[9] = -1;
          arrayOfString[10] = b.a(i13, arrayOfString[1]);
          arrayOfInt[10] = b.h(i13 + 10000, 10000);
          arrayOfString[11] = b.d(i12);
          arrayOfInt[11] = 65280;
          arrayOfString[12] = b.a(i11, 2);
          arrayOfInt[12] = -1;
          arrayOfString[13] = b.a(i14 / 100.0F, 2);
          arrayOfInt[13] = b.g(i14);
          arrayOfString[14] = b.d(i16);
          arrayOfInt[14] = 65280;
          arrayOfString[15] = b.d(i17);
          arrayOfInt[15] = -1;
          if (i15 == 1) {
            arrayOfInt[0] = -1;
          }
          localmh.d = com.android.dazhihui.d.n.e(paramj);
          localmh.g = i4;
          localmh.h = bool;
          if (i15 <= 0) {
            break label649;
          }
        }
        label649:
        for (bool = true;; bool = false)
        {
          localmh.i = bool;
          a(localmh);
          n += 1;
          break;
          bool = false;
          break label267;
        }
      }
    }
    this.i.a(this.j, 0);
  }
  
  public void handleTimeout(h paramh)
  {
    if (paramh == this.m)
    {
      this.g.b();
      if (g.a().L()) {
        showShortToast(2131166193);
      }
    }
  }
  
  protected void init(Bundle paramBundle)
  {
    setContentView(2130903457);
    this.g = ((DzhHeader)findViewById(2131559836));
    this.g.setOnHeaderButtonClickListener(this);
    this.g.a(this, this);
    this.i = ((TableLayoutGroup)findViewById(2131559838));
    this.i.setContinuousLoading(true);
    this.i.setColumnAlign(Paint.Align.CENTER);
    this.i.setFirstColumnHeadAlign(Paint.Align.CENTER);
    this.i.setOnLoadingListener(new aw(this));
    this.i.setOnContentScrollChangeListener(new ax(this));
    this.i.setOnTableLayoutClickListener(new ay(this));
    paramBundle = d.a();
    if (this.k.y() == 0) {
      this.k.v(paramBundle.c("SHOW_MINE_STOCK_POP"));
    }
    if (this.k.y() == 0)
    {
      new Handler().postDelayed(new az(this), 100L);
      this.k.v(1);
      paramBundle.a("SHOW_MINE_STOCK_POP", this.k.y());
    }
    paramBundle.g();
    paramBundle = getIntent();
    if (paramBundle != null)
    {
      paramBundle = paramBundle.getSerializableExtra("data");
      if (paramBundle != null)
      {
        paramBundle = ((ArrayList)paramBundle).iterator();
        while (paramBundle.hasNext())
        {
          String str = (String)paramBundle.next();
          this.b.add(str);
        }
      }
    }
    b();
    registerReceiver(this.l, new IntentFilter("com.android.dazhihui.action.SELF_STOCK_CHANGED"));
    changeLookFace(this.mLookFace);
  }
  
  public void netException(h paramh, Exception paramException)
  {
    if (paramh == this.m)
    {
      this.g.b();
      showShortToast(2131166192);
    }
  }
  
  public void onDestroy()
  {
    unregisterReceiver(this.l);
    super.onDestroy();
  }
  
  public void onResume()
  {
    super.onResume();
    this.g.a();
    a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\CorrelationStockScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */