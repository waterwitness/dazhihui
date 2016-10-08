package com.android.dazhihui.ui.screen.stock;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.a.g;
import com.android.dazhihui.d.b;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.e;
import com.android.dazhihui.ui.widget.PankouInformationView;
import com.android.dazhihui.ui.widget.stockchart.az;
import java.lang.reflect.Array;

public class nz
  extends e
  implements i
{
  oc a;
  private PankouInformationView b;
  private ScrollView c;
  private Button d;
  private Button e;
  private int f;
  private int g = -1;
  private int h = -20;
  private int i;
  private int j;
  private int k;
  private long l = 0L;
  private int m = 0;
  private int n = 0;
  private String o;
  private String p;
  private int q;
  private int r;
  private int s = 0;
  private long t = 0L;
  private BaseActivity u;
  private m v;
  private int w = 2;
  
  public void a(p paramp)
  {
    Object localObject1 = new String[20];
    Object localObject2 = new int[20];
    Object localObject3 = new String[14];
    Object localObject4 = new int[14];
    int i1 = 0;
    while (i1 < localObject1.length)
    {
      localObject1[i1] = "";
      i1 += 1;
    }
    i1 = 0;
    while (i1 < localObject3.length)
    {
      localObject3[i1] = "";
      i1 += 1;
    }
    i1 = paramp.a;
    paramp = paramp.b;
    if (i1 == 2939) {
      if (paramp != null)
      {
        paramp = new q(paramp);
        paramp.l();
        paramp.l();
        this.k = paramp.b();
        this.w = paramp.b();
        paramp.e();
        this.s = paramp.h();
        this.m = paramp.h();
        this.n = paramp.h();
        this.t = b.b(paramp.h());
        this.l = b.b(paramp.h());
      }
    }
    int i2;
    int i5;
    int i6;
    int i7;
    int i8;
    int i9;
    do
    {
      for (;;)
      {
        return;
        if (i1 == 2940)
        {
          if (paramp != null)
          {
            paramp = new q(paramp);
            i1 = paramp.b();
            i3 = paramp.h();
            i2 = paramp.h();
            i4 = paramp.h();
            i5 = paramp.h();
            long l1 = b.b(paramp.h());
            long l2 = b.b(paramp.h());
            i6 = paramp.h();
            i7 = paramp.h();
            i8 = paramp.h();
            if (i1 == 1)
            {
              paramp.h();
              paramp.h();
              paramp.h();
            }
            i9 = paramp.e();
            int i10 = paramp.e();
            i1 = 0;
            while (i1 < i10)
            {
              paramp.h();
              paramp.h();
              i1 += 1;
            }
            localObject1[0] = b.a(i3, this.w);
            localObject2[0] = b.h(i3, this.s);
            localObject1[1] = b.a(i8, this.w);
            localObject2[1] = -1;
            localObject1[2] = b.b(i3, this.s, this.w);
            localObject2[2] = b.h(i3, this.s);
            localObject1[3] = b.b(i3, this.s);
            localObject2[3] = b.h(i3, this.s);
            localObject1[4] = b.a(i2, this.w);
            localObject2[4] = b.h(i2, this.s);
            localObject1[5] = b.a(this.s, this.w);
            localObject2[5] = -1;
            localObject1[6] = b.e(l1);
            localObject2[6] = -11403265;
            localObject1[7] = b.j(i7);
            localObject2[7] = -11403265;
            localObject1[8] = b.a((int)l1 + this.t, this.t);
            if (localObject1[8].startsWith("+")) {
              localObject1[8] = localObject1[6].substring(1);
            }
            localObject2[8] = 65280;
            localObject1[9] = az.f(i4 - i5, this.s);
            localObject2[9] = -1;
            localObject1[10] = b.f(l2);
            localObject2[10] = 65280;
            localObject1[11] = b.a(i9, 2);
            localObject2[11] = -1;
            localObject1[12] = b.j(i6);
            localObject2[12] = -16711936;
            localObject1[13] = b.j((int)(l1 - i6));
            localObject2[13] = -65536;
            i2 = (int)Math.pow(10.0D, this.w);
            i1 = i2;
            if (i2 <= 0) {
              i1 = 1;
            }
            l1 = (i3 * 1.0F / i1 * ((float)this.l * 1.0F / 100.0F));
            if (this.q == 1)
            {
              localObject1[14] = b.f(l1);
              localObject2[14] = 65280;
              localObject1[15] = b.f((i3 * 1.0F / i1 * ((float)this.t * 1.0F / 100.0F)));
              localObject2[15] = 65280;
            }
            localObject1[16] = b.a(i4, this.w);
            localObject2[16] = b.h(i4, this.s);
            localObject1[17] = b.a(i5, this.w);
            localObject2[17] = b.h(i5, this.s);
            localObject1[18] = b.a(this.m, this.w);
            localObject2[18] = b.h(this.m, this.s);
            localObject1[19] = b.a(this.n, this.w);
            localObject2[19] = b.h(this.n, this.s);
            this.b.a((String[])localObject1, (int[])localObject2);
          }
        }
        else if (i1 == 2206)
        {
          if (paramp != null)
          {
            paramp = new q(paramp);
            localObject3[9] = ("" + paramp.e());
            localObject3[11] = ("" + paramp.e());
            localObject3[13] = ("" + paramp.e());
            localObject4[9] = -65536;
            localObject4[11] = -11337729;
            localObject4[13] = -16711936;
            paramp.h();
            paramp.h();
            localObject1[15] = b.k(paramp.h());
            localObject1[14] = b.k(paramp.h());
          }
        }
        else
        {
          if (i1 != 2942) {
            break;
          }
          if (paramp != null)
          {
            paramp = new q(paramp);
            paramp.b();
            paramp.b();
            paramp.b();
            paramp.e();
            localObject1 = (int[][])null;
            i1 = paramp.e();
            if (i1 == 0) {}
            localObject1 = (int[][])Array.newInstance(Integer.TYPE, new int[] { i1, 4 });
            i1 = 0;
            while (i1 < localObject1.length)
            {
              localObject1[i1][0] = paramp.h();
              localObject1[i1][1] = paramp.h();
              localObject1[i1][3] = paramp.h();
              localObject1[i1][2] = paramp.h();
              i1 += 1;
            }
          }
        }
      }
    } while ((i1 != 2941) || (paramp == null));
    localObject2 = new q(paramp);
    int i3 = ((q)localObject2).b();
    i1 = ((q)localObject2).h();
    this.i = i1;
    if (this.g <= 0)
    {
      this.j = i1;
      this.g = i1;
    }
    int i4 = ((q)localObject2).e();
    localObject3 = new int[i4];
    localObject4 = new String[i4];
    String[][] arrayOfString;
    int[][] arrayOfInt;
    if (i4 - 1 > 0)
    {
      i1 = i4 - 1;
      arrayOfString = (String[][])Array.newInstance(String.class, new int[] { i1, 3 });
      arrayOfInt = (int[][])Array.newInstance(Integer.TYPE, new int[] { i1, 3 });
      i2 = 0;
      label1299:
      if (i2 >= i4) {
        break label1554;
      }
      i8 = ((q)localObject2).h();
      i5 = ((q)localObject2).h();
      i9 = i5 & 0x7FFFFFFF;
      localObject3[i2] = i9;
      i6 = ((q)localObject2).h();
      if (i3 == 1) {
        ((q)localObject2).h();
      }
      if (i2 > 0)
      {
        i7 = Math.abs(i2 - i1);
        localObject4[i2] = b.f(i8);
        arrayOfString[i7][0] = localObject4[i2];
        arrayOfInt[i7][0] = -1;
        localObject1 = b.d(i9, this.w);
        arrayOfInt[i7][1] = b.h(i9, this.s);
        i8 = localObject3[i2] - localObject3[(i2 - 1)];
        if (i8 <= 0) {
          break label1512;
        }
        paramp = (String)localObject1 + "↑";
        label1460:
        arrayOfString[i7][1] = paramp;
        arrayOfString[i7][2] = String.valueOf(i6);
        if (i5 >> 31 != 0) {
          break label1542;
        }
        arrayOfInt[i7][2] = -16711936;
      }
    }
    for (;;)
    {
      i2 += 1;
      break label1299;
      i1 = 0;
      break;
      label1512:
      paramp = (p)localObject1;
      if (i8 >= 0) {
        break label1460;
      }
      paramp = (String)localObject1 + "↓";
      break label1460;
      label1542:
      arrayOfInt[i7][2] = -65536;
    }
    label1554:
    this.b.a(arrayOfString, arrayOfInt);
  }
  
  public boolean a()
  {
    if (this.f == 3)
    {
      this.g = this.i;
      this.h = -20;
      c();
    }
    for (;;)
    {
      return false;
      this.g += Math.abs(this.h);
      this.h = 20;
      if (this.g >= this.j)
      {
        this.g = -1;
        this.h = -20;
      }
      c();
    }
  }
  
  public m b()
  {
    x[] arrayOfx = new x[4];
    if (this.q == 1)
    {
      arrayOfx = new x[4];
      arrayOfx[0] = new x(2939);
      arrayOfx[0].a(this.p);
      arrayOfx[1] = new x(2940);
      arrayOfx[1].a(this.p);
      arrayOfx[2] = new x(2942);
      arrayOfx[2].a(this.p);
      arrayOfx[2].c(this.r);
      arrayOfx[3] = new x(2941);
      arrayOfx[3].a(this.p);
      arrayOfx[3].d(this.g);
      arrayOfx[3].c(this.h);
    }
    for (;;)
    {
      this.v = new m(arrayOfx);
      return this.v;
      arrayOfx = new x[5];
      arrayOfx[0] = new x(2939);
      arrayOfx[0].a(this.p);
      arrayOfx[1] = new x(2206);
      arrayOfx[1].a(this.p);
      arrayOfx[2] = new x(2940);
      arrayOfx[2].a(this.p);
      arrayOfx[3] = new x(2942);
      arrayOfx[3].a(this.p);
      arrayOfx[3].c(this.r);
      arrayOfx[4] = new x(2941);
      arrayOfx[4].a(this.p);
      arrayOfx[4].d(this.g);
      arrayOfx[4].c(this.h);
    }
  }
  
  public void c()
  {
    b();
    this.v.a(this);
    g.a().a(this.v);
    n.a(this.p, 1143);
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    if ((paramj instanceof o)) {
      a(((o)paramj).h());
    }
  }
  
  public void handleTimeout(h paramh) {}
  
  public void netException(h paramh, Exception paramException) {}
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    paramBundle = getBundle();
    this.o = paramBundle.getString("name");
    this.p = paramBundle.getString("code");
    this.q = paramBundle.getInt("type");
    this.r = paramBundle.getInt("position");
    c();
    this.a = new oc(this, 5000);
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    this.u = ((BaseActivity)paramActivity);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130903365, paramViewGroup, false);
    this.b = ((PankouInformationView)paramLayoutInflater.findViewById(2131560192));
    this.c = ((ScrollView)paramLayoutInflater.findViewById(2131560191));
    this.b.setOwnScrollView(this.c);
    this.d = ((Button)paramLayoutInflater.findViewById(2131560193));
    this.e = ((Button)paramLayoutInflater.findViewById(2131560194));
    this.d.setOnClickListener(new oa(this));
    this.e.setOnClickListener(new ob(this));
    return paramLayoutInflater;
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
    if (!paramBoolean)
    {
      Bundle localBundle = getBundle();
      this.o = localBundle.getString("name");
      this.p = localBundle.getString("code");
      this.q = localBundle.getInt("type");
      this.r = localBundle.getInt("position");
      c();
    }
  }
  
  public void onPause()
  {
    super.onPause();
    this.a.a();
  }
  
  public void onResume()
  {
    super.onResume();
    this.a.b();
  }
  
  public void refresh()
  {
    c();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\nz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */