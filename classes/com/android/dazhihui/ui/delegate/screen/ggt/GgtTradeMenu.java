package com.android.dazhihui.ui.delegate.screen.ggt;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import com.android.dazhihui.ui.delegate.b.h;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;

public class GgtTradeMenu
  extends DelegateBaseActivity
  implements cp, cs
{
  public static String[] A;
  public static String[] B;
  public static String[] C;
  public static String[] D;
  public static String[] E;
  public static String[] F;
  public static String[] G;
  public static String[] H;
  public static String[] I;
  public static String[] J;
  public static String[] K;
  public static String[] L;
  public static String[] M;
  public static String[] N;
  public static String[] O;
  public static String[] P;
  public static String[] Q;
  public static String[] R;
  public static String[] S;
  public static String[] T;
  public static String[] U;
  public static String[] V;
  public static String[] W;
  public static String[] X;
  public static String[] Y;
  public static String[][] a;
  public static String[][] b;
  public static String c = "港股通";
  public static String d = "委托买入";
  public static String e = "委托卖出";
  public static String f = "委托撤单";
  public static String g = "资金股份";
  public static String h = "当日成交";
  public static String i = "当日委托";
  public static String j = "历史成交";
  public static String m = "历史委托";
  public static String n = "交割单";
  public static String o = "公司行为申报";
  public static String p = "公司行为申报结果";
  public static String q = "投票申报";
  public static String r = "投票申报结果";
  public static String s = "港股通标的";
  public static String[] t;
  public static String[] u;
  public static String[] v;
  public static String[] w;
  public static String[] x;
  public static String[] y;
  public static String[] z;
  private int aa = 2;
  private String[] ab;
  private String[] ac = { d, e, f };
  private String[] ad = { g, i, h, m, j, n };
  private String[] ae = { d, e, f, g, i, h, m, j, n };
  private DzhHeader af;
  private ae ag;
  
  public static h a(h paramh)
  {
    String str1 = paramh.a("1325");
    int k = str1.indexOf(",");
    String str2 = str1.substring(0, k);
    StringBuilder localStringBuilder1 = new StringBuilder();
    StringBuilder localStringBuilder2 = new StringBuilder();
    localStringBuilder2.append("12655").append(",");
    localStringBuilder2.append("12657").append(",");
    localStringBuilder2.append("12667").append(",");
    localStringBuilder2.append("12659").append(",");
    localStringBuilder2.append("12661").append(",");
    localStringBuilder2.append("12663").append(",");
    localStringBuilder2.append("12665").append(",");
    localStringBuilder2.append("12677").append(",");
    localStringBuilder2.append("12775").append(",");
    localStringBuilder2.append("12777").append(",");
    localStringBuilder2.append("12779").append(",");
    localStringBuilder2.append("12815").append(",");
    localStringBuilder2.append("12817").append(",");
    localStringBuilder2.append("12819").append(",");
    localStringBuilder2.append("12821").append(",");
    localStringBuilder2.append("12823");
    int i1 = Integer.valueOf(str2).intValue();
    str1 = str1.substring(k + 1, str1.length());
    localStringBuilder1.append(i1 + 16).append(",");
    localStringBuilder1.append(str1).append(",");
    localStringBuilder1.append(localStringBuilder2);
    paramh.a("1325", localStringBuilder1.toString());
    return paramh;
  }
  
  public static void a()
  {
    int k = 0;
    int i2;
    for (int i1 = 0; k < o.z.length; i1 = i2)
    {
      i2 = i1;
      if (Integer.parseInt(o.z[k][0]) > 16) {
        i2 = i1 + 1;
      }
      k += 1;
    }
    if (i1 == 0) {}
    for (;;)
    {
      return;
      a = new String[i1][];
      k = 0;
      for (i1 = 0; k < o.z.length; i1 = i2)
      {
        i2 = i1;
        if (Integer.parseInt(o.z[k][0]) > 16)
        {
          a[i1] = o.z[k];
          i2 = i1 + 1;
        }
        k += 1;
      }
    }
  }
  
  public static void a(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    if (paramString.equals("12655"))
    {
      t = paramArrayOfString1;
      u = paramArrayOfString2;
    }
    do
    {
      return;
      if (paramString.equals("12657"))
      {
        x = paramArrayOfString1;
        y = paramArrayOfString2;
        return;
      }
      if (paramString.equals("12667"))
      {
        v = paramArrayOfString1;
        w = paramArrayOfString2;
        return;
      }
      if (paramString.equals("12659"))
      {
        B = paramArrayOfString1;
        C = paramArrayOfString2;
        return;
      }
      if (paramString.equals("12661"))
      {
        z = paramArrayOfString1;
        A = paramArrayOfString2;
        return;
      }
      if (paramString.equals("12663"))
      {
        F = paramArrayOfString1;
        G = paramArrayOfString2;
        return;
      }
      if (paramString.equals("12665"))
      {
        D = paramArrayOfString1;
        E = paramArrayOfString2;
        return;
      }
      if (paramString.equals("12677"))
      {
        H = paramArrayOfString1;
        I = paramArrayOfString2;
        return;
      }
      if (paramString.equals("12775"))
      {
        J = paramArrayOfString1;
        K = paramArrayOfString2;
        return;
      }
      if (paramString.equals("12777"))
      {
        L = paramArrayOfString1;
        M = paramArrayOfString2;
        return;
      }
      if (paramString.equals("12779"))
      {
        N = paramArrayOfString1;
        O = paramArrayOfString2;
        return;
      }
      if (paramString.equals("12815"))
      {
        P = paramArrayOfString1;
        Q = paramArrayOfString2;
        return;
      }
      if (paramString.equals("12817"))
      {
        R = paramArrayOfString1;
        S = paramArrayOfString2;
        return;
      }
      if (paramString.equals("12819"))
      {
        T = paramArrayOfString1;
        U = paramArrayOfString2;
        return;
      }
      if (paramString.equals("12821"))
      {
        V = paramArrayOfString1;
        W = paramArrayOfString2;
        return;
      }
    } while (!paramString.equals("12823"));
    X = paramArrayOfString1;
    Y = paramArrayOfString2;
  }
  
  private void d(String paramString)
  {
    if (paramString.equals(d))
    {
      paramString = new Bundle();
      paramString.putInt("type", 0);
      startActivity(GgtEntrust.class, paramString);
    }
    do
    {
      return;
      if (paramString.equals(e))
      {
        paramString = new Bundle();
        paramString.putInt("type", 1);
        startActivity(GgtEntrust.class, paramString);
        return;
      }
      if (paramString.equals(f))
      {
        paramString = new Bundle();
        paramString.putInt("screenId", 12656);
        startActivity(GgtQuiry.class, paramString);
        return;
      }
      if (paramString.equals(g))
      {
        startActivity(GgtCaptialHolding.class);
        return;
      }
      if (paramString.equals(h))
      {
        paramString = new Bundle();
        paramString.putInt("screenId", 12660);
        startActivity(GgtQuiry.class, paramString);
        return;
      }
      if (paramString.equals(i))
      {
        paramString = new Bundle();
        paramString.putInt("screenId", 12658);
        startActivity(GgtQuiry.class, paramString);
        return;
      }
      if (paramString.equals(j))
      {
        paramString = new Bundle();
        paramString.putInt("screenId", 12664);
        startActivity(GgtQuiry.class, paramString);
        return;
      }
      if (paramString.equals(m))
      {
        paramString = new Bundle();
        paramString.putInt("screenId", 12662);
        startActivity(GgtQuiry.class, paramString);
        return;
      }
    } while (!paramString.equals(n));
    paramString = new Bundle();
    paramString.putInt("screenId", 12676);
    startActivity(GgtQuiry.class, paramString);
  }
  
  public boolean OnChildClick(View paramView)
  {
    if (((Integer)paramView.getTag()).intValue() == 0) {
      finish();
    }
    return false;
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (ac.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.af == null);
      this.af.a(paramy);
      return;
    } while (this.af == null);
    this.af.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramContext = "港股通";
    paramct.a = 40;
    if (this.aa == 0) {
      paramContext = "委托下单";
    }
    for (;;)
    {
      paramct.d = paramContext;
      paramct.p = this;
      return;
      if (this.aa == 1) {
        paramContext = "查询";
      } else if (this.aa == 2) {
        paramContext = "港股通";
      }
    }
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.af = paramDzhHeader;
  }
  
  public void init(Bundle paramBundle)
  {
    setContentView(2130903539);
    this.aa = getIntent().getExtras().getInt("type");
    if (this.aa == 0) {
      this.ab = this.ac;
    }
    for (;;)
    {
      this.af = ((DzhHeader)findViewById(2131558643));
      this.af.a(this, this);
      paramBundle = (ListView)findViewById(2131560919);
      int k = 0;
      while (k < this.ab.length)
      {
        this.ab[k] = (k + 1 + "." + this.ab[k]);
        k += 1;
      }
      if (this.aa == 1) {
        this.ab = this.ad;
      } else if (this.aa == 2) {
        this.ab = this.ae;
      }
    }
    this.ag = new ae(this, this, this.ab);
    paramBundle.setAdapter(this.ag);
    paramBundle.setOnItemClickListener(new ad(this, null));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ggt\GgtTradeMenu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */