package com.android.dazhihui.ui.screen.stock;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.a.g;
import com.android.dazhihui.d.b;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.screen.e;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.KlineTechnicalLay;
import com.android.dazhihui.ui.widget.PageLoadTip;
import com.android.dazhihui.ui.widget.PartScrollView;
import java.lang.reflect.Array;

public class dh
  extends e
{
  protected String a;
  private String b;
  private int c;
  private PartScrollView d;
  private KlineTechnicalLay e;
  private RelativeLayout f;
  private PageLoadTip g;
  private int h = Integer.MIN_VALUE;
  private int i = Integer.MAX_VALUE;
  private int j = 0;
  private int k = 0;
  private int l = Integer.MIN_VALUE;
  private int m = Integer.MAX_VALUE;
  private int n = 0;
  private int o = 0;
  private int p;
  private View q;
  
  private void c()
  {
    a();
    d();
  }
  
  private void d()
  {
    Object localObject = new x[1];
    localObject[0] = new x(2939);
    localObject[0].a(this.a);
    localObject = new m((x[])localObject);
    ((m)localObject).a(this);
    g.a().a((h)localObject);
  }
  
  private void e()
  {
    Object localObject = new x[1];
    localObject[0] = new x(2944);
    localObject[0].a(this.a);
    localObject[0].b(7);
    localObject[0].d(0);
    localObject[0].c(150);
    localObject = new m((x[])localObject);
    ((m)localObject).a(this);
    g.a().a((h)localObject);
  }
  
  public void a()
  {
    Object localObject = new x[1];
    localObject[0] = new x(2973);
    localObject[0].c(15);
    localObject[0].a(this.a);
    localObject = new m((x[])localObject);
    ((m)localObject).a(this);
    g.a().a((h)localObject);
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    this.e.setData(paramArrayOfByte);
  }
  
  public void a(String[] paramArrayOfString)
  {
    this.e.setFiveAndThirtyDayData(paramArrayOfString);
  }
  
  public void b(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0)) {}
    for (;;)
    {
      return;
      n.c("set data begin");
      paramArrayOfByte = new q(paramArrayOfByte);
      int i2 = paramArrayOfByte.b();
      int i3 = paramArrayOfByte.e();
      if (i3 > 0)
      {
        int[][] arrayOfInt = (int[][])Array.newInstance(Integer.TYPE, new int[] { i3, 8 });
        long[] arrayOfLong = new long[i3];
        int i1 = 0;
        while (i1 < i3)
        {
          arrayOfInt[i1][0] = paramArrayOfByte.h();
          arrayOfInt[i1][1] = paramArrayOfByte.h();
          arrayOfInt[i1][2] = paramArrayOfByte.h();
          arrayOfInt[i1][3] = paramArrayOfByte.h();
          arrayOfInt[i1][4] = paramArrayOfByte.h();
          arrayOfLong[i1] = b.b(paramArrayOfByte.h());
          arrayOfInt[i1][5] = ((int)(arrayOfLong[i1] / 10000L));
          arrayOfInt[i1][6] = ((int)(b.b(paramArrayOfByte.h()) / 100L));
          if (i2 == 1) {
            arrayOfInt[i1][7] = paramArrayOfByte.h();
          }
          if (i3 - i1 <= 5)
          {
            if (arrayOfInt[i1][2] > this.h) {
              this.h = arrayOfInt[i1][2];
            }
            if (arrayOfInt[i1][3] < this.i) {
              this.i = arrayOfInt[i1][3];
            }
            this.j += arrayOfInt[i1][4];
            this.k += 1;
          }
          if (i3 - i1 <= 30)
          {
            if (arrayOfInt[i1][2] > this.l) {
              this.l = arrayOfInt[i1][2];
            }
            if (arrayOfInt[i1][3] < this.m) {
              this.m = arrayOfInt[i1][3];
            }
            this.n += arrayOfInt[i1][4];
            this.o += 1;
          }
          i1 += 1;
        }
      }
    }
  }
  
  public String[] b()
  {
    String[] arrayOfString = new String[6];
    if (this.h == Integer.MIN_VALUE)
    {
      arrayOfString[0] = "0";
      if (this.i != Integer.MAX_VALUE) {
        break label105;
      }
      arrayOfString[1] = "0";
      label34:
      if (this.k != 0) {
        break label122;
      }
      arrayOfString[2] = "0";
      label46:
      if (this.l != Integer.MIN_VALUE) {
        break label144;
      }
      arrayOfString[3] = "0";
      label60:
      if (this.m != Integer.MAX_VALUE) {
        break label161;
      }
      arrayOfString[4] = "0";
    }
    for (;;)
    {
      if (this.o != 0) {
        break label178;
      }
      arrayOfString[5] = "0";
      return arrayOfString;
      arrayOfString[0] = b.a(this.h, this.p);
      break;
      label105:
      arrayOfString[1] = b.a(this.i, this.p);
      break label34;
      label122:
      arrayOfString[2] = b.a(this.j / this.k, this.p);
      break label46;
      label144:
      arrayOfString[3] = b.a(this.l, this.p);
      break label60;
      label161:
      arrayOfString[4] = b.a(this.m, this.p);
    }
    label178:
    arrayOfString[5] = b.a(this.n / this.o, this.p);
    return arrayOfString;
  }
  
  public View getScroolView()
  {
    return this.d;
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    try
    {
      paramh = ((o)paramj).h();
      if (paramh == null) {
        return;
      }
      if (paramh.a == 2939)
      {
        paramh = new q(paramh.b);
        paramj = paramh.l();
        String str = paramh.l();
        if (!paramj.equals(this.a)) {
          return;
        }
        this.a = paramj;
        this.b = str;
        this.c = paramh.b();
        this.p = paramh.b();
        e();
        return;
      }
    }
    catch (Exception paramh)
    {
      paramh.printStackTrace();
      return;
    }
    if (paramh.a == 2973)
    {
      a(paramh.b);
      return;
    }
    if (paramh.a == 2944)
    {
      b(paramh.b);
      a(b());
    }
  }
  
  public void handleTimeout(h paramh)
  {
    super.handleTimeout(paramh);
  }
  
  public void netException(h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getArguments();
    this.a = paramBundle.getString("code");
    this.b = paramBundle.getString("name");
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.q = paramLayoutInflater.inflate(2130903124, paramViewGroup, false);
    this.d = ((PartScrollView)this.q.findViewById(2131558939));
    this.f = ((RelativeLayout)this.q.findViewById(2131558940));
    this.e = ((KlineTechnicalLay)this.q.findViewById(2131558977));
    this.g = ((PageLoadTip)this.q.findViewById(2131558942));
    this.e.setVisibility(0);
    if (this.mLookFace == y.a) {}
    for (;;)
    {
      return this.q;
      this.q.setBackgroundColor(getResources().getColor(2131493677));
    }
  }
  
  public void onResume()
  {
    super.onResume();
    if (this.mLookFace == y.b) {
      this.q.setBackgroundColor(getResources().getColor(2131493677));
    }
    for (;;)
    {
      c();
      return;
      this.q.setBackgroundColor(-15789289);
    }
  }
  
  public void refresh()
  {
    if (isVisible()) {
      c();
    }
  }
  
  public void setUserVisibleHint(boolean paramBoolean)
  {
    super.setUserVisibleHint(paramBoolean);
    if (paramBoolean) {
      c();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\dh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */