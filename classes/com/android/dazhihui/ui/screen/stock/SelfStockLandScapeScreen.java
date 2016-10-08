package com.android.dazhihui.ui.screen.stock;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Paint.Align;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.d.b;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.mh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SelfStockLandScapeScreen
  extends BaseActivity
  implements AdapterView.OnItemClickListener
{
  private int a = 101;
  private int b = 33273;
  private String[] c = null;
  private boolean[] d;
  private byte e;
  private int f = -1;
  private TableLayoutGroup g;
  private List<mh> h = new LinkedList();
  private com.android.dazhihui.ui.a.m i = com.android.dazhihui.ui.a.m.a();
  private SelfSelectedStockManager j = SelfSelectedStockManager.getInstance();
  private com.android.dazhihui.a.b.m k;
  private PopupWindow l;
  private String[] m;
  private int[] n;
  private BroadcastReceiver o = new tb(this);
  
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
        paramString = new String[this.c.length];
        localObject1 = new int[this.c.length];
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
    if ((this.f < 0) || (this.f >= this.d.length) || (this.d[this.f] == 0)) {}
    for (;;)
    {
      return;
      int i2 = this.h.indexOf(parammh);
      int i1 = 0;
      String str1;
      double d1;
      double d2;
      label357:
      label388:
      while (i1 < i2)
      {
        String str2 = ((mh)this.h.get(i1)).a[this.f];
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
            this.h.remove(parammh);
            this.h.add(i1, parammh);
            return;
            i1 += 1;
          }
          if (this.e != 0) {
            break label357;
          }
          if (d2 >= d1) {
            break label388;
          }
          this.h.remove(parammh);
          this.h.add(i1, parammh);
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
    TableLayoutGroup localTableLayoutGroup;
    int i1;
    if (this.a == 101)
    {
      com.android.dazhihui.d.n.a("", 1001);
      this.b = 33273;
      if (this.f != -1) {
        this.f = 1;
      }
      this.d = new boolean[] { 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1 };
      this.c = getResources().getStringArray(2131361799);
      this.c[0] = this.m[0];
      this.h.clear();
      this.g.b();
      this.g.setHeaderColumn(this.c);
      this.g.setColumnClickable(this.d);
      this.e = 0;
      localTableLayoutGroup = this.g;
      i1 = this.f;
      if (this.e != 0) {
        break label453;
      }
    }
    for (;;)
    {
      localTableLayoutGroup.a(i1, bool);
      return;
      if (this.a == 106)
      {
        com.android.dazhihui.d.n.a("", 1126);
        this.b = 34944;
        this.f = 8;
        this.c = getResources().getStringArray(2131361837);
        this.d = new boolean[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        this.c[0] = this.m[1];
        break;
      }
      if (this.a != 107) {
        break;
      }
      com.android.dazhihui.d.n.a("", 1125);
      this.b = 38032;
      this.f = -1;
      this.c = getResources().getStringArray(2131361923);
      this.d = new boolean[] { 1, 1, 1, 1, 1, 1, 1, 1 };
      this.c[0] = this.m[2];
      break;
      label453:
      bool = true;
    }
  }
  
  private void c()
  {
    if ((this.f < 0) || (this.f >= this.d.length) || (this.d[this.f] == 0)) {
      return;
    }
    int i1 = 0;
    while (i1 < this.h.size() - 1)
    {
      int i2 = i1 + 1;
      Object localObject;
      double d1;
      double d2;
      if (i2 < this.h.size())
      {
        String str = ((mh)this.h.get(i1)).a[this.f];
        localObject = ((mh)this.h.get(i2)).a[this.f];
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
            mh localmh = (mh)this.h.get(i1);
            this.h.set(i1, this.h.get(i2));
            this.h.set(i2, localmh);
            continue;
          }
          if (this.e != 0) {
            break label422;
          }
          if (d2 < d1)
          {
            localObject = (mh)this.h.get(i1);
            this.h.set(i1, this.h.get(i2));
            this.h.set(i2, localObject);
          }
          i2 += 1;
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
      i1 += 1;
    }
    this.g.a(this.h, 0);
  }
  
  public void a()
  {
    int i3 = this.j.getSelfStockVectorSize();
    if (i3 > 0)
    {
      ArrayList localArrayList = new ArrayList();
      int i1 = 0;
      int i2;
      do
      {
        x localx = new x(2955);
        localx.c(107);
        localx.c(this.b);
        localx.a(this.j.getSelfStockCodeVector(i1, i1 + 50 - 1));
        localArrayList.add(localx);
        i2 = i1 + 50;
        i1 = i2;
      } while (i2 < i3);
      this.k = new com.android.dazhihui.a.b.m();
      this.k.a(com.android.dazhihui.a.b.n.a);
      registRequestListener(this.k);
      this.k.a(localArrayList);
      setAutoRequest(this.k);
      sendRequest(this.k);
    }
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (tf.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.g == null);
      this.g.setBackgroundColor(getResources().getColor(2131493542));
      this.g.a(paramy);
      return;
    } while (this.g == null);
    this.g.setBackgroundColor(getResources().getColor(2131493605));
    this.g.a(paramy);
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    paramh = (o)paramj;
    label9:
    int i1;
    int i3;
    int[] arrayOfInt;
    int i2;
    boolean bool;
    if (paramh == null)
    {
      return;
    }
    else
    {
      do
      {
        paramh = paramh.h();
      } while (paramh == null);
      for (;;)
      {
        try
        {
          if (paramh.a != 2955) {
            break label1569;
          }
          paramh = new q(paramh.b);
          i1 = paramh.e();
          i3 = paramh.e();
          if (i1 != 107) {
            break;
          }
          paramh.e();
          i4 = paramh.e();
          if (i3 != 33273) {
            break label1604;
          }
          i1 = 0;
          if (i1 >= i4) {
            break label1569;
          }
          paramj = paramh.l();
          localmh = a(paramj);
          arrayOfString = localmh.a;
          arrayOfInt = localmh.b;
          arrayOfString[0] = paramh.l();
          arrayOfInt[0] = 39936;
          i2 = paramh.b();
          i5 = paramh.b();
          i6 = paramh.h();
          paramh.h();
          i7 = paramh.h();
          i8 = paramh.h();
          i9 = paramh.h();
          i10 = paramh.h();
          paramh.e();
          i11 = paramh.h();
          i12 = paramh.e();
          i13 = paramh.e();
          i14 = paramh.d();
          i15 = paramh.d();
          i16 = paramh.b();
          i17 = paramh.f();
          int i18 = paramh.f();
          bool = false;
          if ((i3 >>> 15 & 0x1) != 0)
          {
            if ((paramh.b() & 0x1) != 1) {
              break label1592;
            }
            bool = true;
          }
          label252:
          arrayOfString[1] = b.a(i7, i2);
          arrayOfInt[1] = b.h(i7, i6);
          arrayOfString[2] = b.c(i7, i6);
          arrayOfInt[2] = arrayOfInt[1];
          arrayOfString[3] = b.d(i7, i6, i2);
          arrayOfInt[3] = arrayOfInt[1];
          arrayOfString[4] = b.a(i6, i2);
          arrayOfInt[4] = -1;
          arrayOfString[5] = com.android.dazhihui.d.n.a(b.b(i11));
          arrayOfInt[5] = 65280;
          arrayOfString[6] = com.android.dazhihui.d.n.a(b.b(i10) * 10000L);
          arrayOfInt[6] = -16711681;
          arrayOfString[7] = b.a(i8, i2);
          arrayOfInt[7] = b.h(i8, i6);
          arrayOfString[8] = b.a(i9, i2);
          arrayOfInt[8] = b.h(i9, i6);
          arrayOfString[9] = b.k(i8 - i9, i6);
          arrayOfInt[9] = -1;
          arrayOfString[10] = b.a(i14, arrayOfString[1]);
          arrayOfInt[10] = b.h(i14 + 10000, 10000);
          arrayOfString[11] = b.d(i13);
          arrayOfInt[11] = 65280;
          arrayOfString[12] = b.a(i12, 2);
          arrayOfInt[12] = -1;
          arrayOfString[13] = b.a(i15 / 100.0F, 2);
          arrayOfInt[13] = b.g(i15);
          arrayOfString[14] = b.d(i17);
          arrayOfInt[14] = 65280;
          arrayOfString[15] = b.d(i18);
          arrayOfInt[15] = -1;
          if (i16 == 1) {
            arrayOfInt[0] = -1;
          }
          localmh.d = com.android.dazhihui.d.n.e(paramj);
          localmh.g = i5;
          localmh.h = bool;
          if (i16 <= 0) {
            break label1598;
          }
          bool = true;
          label608:
          localmh.i = bool;
          a(localmh);
          i1 += 1;
          continue;
          label628:
          if (i1 >= i4) {
            break label1569;
          }
          paramj = paramh.l();
          localmh = a(paramj);
          arrayOfString = localmh.a;
          arrayOfInt = localmh.b;
          arrayOfString[0] = paramh.l();
          arrayOfInt[0] = 39936;
          i5 = paramh.b();
          i6 = paramh.b();
          i7 = paramh.h();
          paramh.h();
          i8 = paramh.h();
          paramh.h();
          paramh.h();
          paramh.h();
          i9 = paramh.b();
          arrayOfString[1] = b.a(paramh.d(), 3);
          arrayOfString[2] = b.a(paramh.d(), 3);
          arrayOfString[3] = b.a(paramh.f(), 3);
          arrayOfString[4] = b.a(paramh.f(), 3);
          arrayOfString[5] = b.a(paramh.f(), 3);
          arrayOfString[6] = b.a(paramh.b(), 0);
          arrayOfString[7] = b.a(paramh.b(), 0);
          i2 = 1;
        }
        catch (Exception paramh)
        {
          int i4;
          mh localmh;
          String[] arrayOfString;
          int i5;
          int i6;
          int i7;
          int i8;
          int i9;
          int i10;
          int i11;
          int i12;
          int i13;
          int i14;
          int i15;
          int i16;
          int i17;
          label815:
          label898:
          label926:
          paramh.printStackTrace();
          return;
        }
        arrayOfString[8] = b.a(i8, i5);
        arrayOfInt[8] = b.h(i8, i7);
        arrayOfString[9] = b.c(i8, i7);
        arrayOfInt[9] = arrayOfInt[8];
        if (i9 == 1) {
          arrayOfInt[0] = -1;
        }
        bool = false;
        if ((i3 >>> 15 & 0x1) != 0)
        {
          if ((paramh.b() & 0x1) != 1) {
            break label1641;
          }
          bool = true;
        }
        localmh.d = com.android.dazhihui.d.n.e(paramj);
        localmh.g = i6;
        localmh.h = bool;
        if (i9 <= 0) {
          break label1647;
        }
        bool = true;
        localmh.i = bool;
        a(localmh);
        i1 += 1;
      }
    }
    for (;;)
    {
      if (i1 < i4)
      {
        paramj = paramh.l();
        localmh = a(paramj);
        arrayOfString = localmh.a;
        arrayOfInt = localmh.b;
        arrayOfString[0] = paramh.l();
        arrayOfInt[0] = 39936;
        i5 = paramh.b();
        i6 = paramh.b();
        i7 = paramh.h();
        paramh.h();
        i8 = paramh.h();
        paramh.h();
        paramh.h();
        long l3 = b.b(paramh.h());
        long l2 = 0L;
        long l1 = 0L;
        i2 = 0;
        if ((i3 >>> 4 & 0x1) != 0) {
          i2 = paramh.e();
        }
        i9 = paramh.b();
        if ((i3 >>> 10 & 0x1) != 0)
        {
          paramh.h();
          paramh.h();
          paramh.h();
          paramh.h();
        }
        if ((i3 >>> 12 & 0x1) != 0)
        {
          i10 = paramh.h();
          i11 = paramh.h();
          i12 = paramh.h();
          i13 = paramh.h();
          i14 = paramh.h();
          i15 = paramh.h();
          i16 = paramh.h();
          i17 = paramh.h();
          l2 = b.a(i10);
          l1 = b.a(i11);
          b.a(i12);
          b.a(i13);
          b.a(i14);
          b.a(i15);
          b.a(i16);
          b.a(i17);
        }
        long l4 = l2 - l1;
        String str = b.d(Math.abs(l4), l3);
        if (i9 == 1) {
          arrayOfInt[0] = -1;
        }
        arrayOfString[1] = com.android.dazhihui.d.n.c(l4);
        arrayOfInt[1] = b.d(l4);
        arrayOfString[3] = com.android.dazhihui.d.n.c(l2);
        arrayOfInt[3] = -65536;
        arrayOfString[4] = com.android.dazhihui.d.n.c(l1);
        arrayOfInt[4] = -16711936;
        arrayOfString[2] = str;
        arrayOfInt[2] = arrayOfInt[1];
        arrayOfString[5] = com.android.dazhihui.d.n.a(10000L * l3);
        arrayOfInt[5] = -16711681;
        if (b.a(i8, i5).equals("--"))
        {
          arrayOfString[7] = "--";
          label1343:
          if (!"--".equals(arrayOfString[7])) {
            arrayOfString[7] = (arrayOfString[7] + "%");
          }
          arrayOfInt[7] = -16711681;
          arrayOfString[6] = b.c(i8, i7);
          if (!"--".equals(arrayOfString[6])) {
            arrayOfString[6] = (arrayOfString[6] + "%");
          }
          arrayOfInt[6] = b.h(i8, i7);
          bool = false;
          if ((i3 >>> 15 & 0x1) != 0)
          {
            if ((paramh.b() & 0x1) != 1) {
              break label1557;
            }
            bool = true;
          }
          label1483:
          localmh.d = com.android.dazhihui.d.n.e(paramj);
          localmh.g = i6;
          localmh.h = bool;
          if (i9 <= 0) {
            break label1563;
          }
        }
        label1557:
        label1563:
        for (bool = true;; bool = false)
        {
          localmh.i = bool;
          a(localmh);
          i1 += 1;
          break;
          arrayOfString[7] = b.c(i2 + 10000, 10000);
          break label1343;
          bool = false;
          break label1483;
        }
      }
      label1569:
      if (this.j.getSelfStockVectorSize() <= 0) {
        break label9;
      }
      this.g.a(this.h, 0);
      return;
      label1592:
      bool = false;
      break label252;
      label1598:
      bool = false;
      break label608;
      label1604:
      if (i3 == 34944)
      {
        i1 = 0;
        break label628;
        while (i2 < 8)
        {
          arrayOfInt[i2] = -4144960;
          i2 += 1;
        }
        break label815;
        label1641:
        bool = false;
        break label898;
        label1647:
        bool = false;
        break label926;
      }
      if (i3 != 38032) {
        break;
      }
      i1 = 0;
    }
  }
  
  public void handleTimeout(h paramh)
  {
    if ((paramh == this.k) && (g.a().L())) {
      showShortToast(2131166193);
    }
  }
  
  protected void init(Bundle paramBundle)
  {
    setContentView(2130903413);
    if (getResources().getConfiguration().orientation == 1) {
      finish();
    }
    this.g = ((TableLayoutGroup)findViewById(2131560371));
    this.g.setContinuousLoading(true);
    this.g.setColumnAlign(Paint.Align.CENTER);
    this.g.setFirstColumnHeadAlign(Paint.Align.CENTER);
    this.g.setFirstHeaderWidth((int)getResources().getDimension(2131230853));
    this.g.setOnLoadingListener(new tc(this));
    this.g.setOnContentScrollChangeListener(new td(this));
    this.g.setOnTableLayoutClickListener(new te(this));
    this.m = getResources().getStringArray(2131361852);
    this.l = new PopupWindow(this);
    this.l.setWidth(-2);
    this.l.setHeight(-2);
    this.l.setFocusable(false);
    this.l.setOutsideTouchable(true);
    this.l.setBackgroundDrawable(new ColorDrawable(0));
    int i2 = com.android.dazhihui.ui.a.m.a().d();
    int i1 = i2;
    if (i2 == 0) {
      i1 = 5;
    }
    setAutoRequestPeriod(i1 * 1000);
    registerReceiver(this.o, new IntentFilter("com.android.dazhihui.action.SELF_STOCK_CHANGED"));
    changeLookFace(this.mLookFace);
  }
  
  public void netException(h paramh, Exception paramException)
  {
    if (paramh == this.k) {
      showShortToast(2131166192);
    }
  }
  
  public void onBackPressed() {}
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if (paramConfiguration.orientation == 1) {
      finish();
    }
  }
  
  public void onDestroy()
  {
    unregisterReceiver(this.o);
    super.onDestroy();
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.l.dismiss();
    if (paramInt == this.n.length - 1)
    {
      paramAdapterView = new Intent();
      paramAdapterView.setClass(this, SelfStockEditScreen.class);
      startActivity(paramAdapterView);
    }
    while (this.a == this.n[paramInt]) {
      return;
    }
    this.a = this.n[paramInt];
    b();
    a();
  }
  
  public void onResume()
  {
    super.onResume();
    b();
    if (this.j.getSelfStockVectorSize() > 0) {
      a();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\SelfStockLandScapeScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */