package com.android.dazhihui.ui.delegate.screen.setplan;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.delegate.screen.TradeText;
import com.android.dazhihui.ui.screen.stock.SearchStockScreen;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.mh;
import java.util.ArrayList;
import java.util.List;

public class SetPlanCaptialShare
  extends DelegateBaseActivity
  implements cp, cs
{
  private int A;
  private int B;
  private int C;
  private mh D;
  private int E;
  private String F;
  private com.android.dazhihui.a.b.u G;
  private com.android.dazhihui.a.b.u H;
  private boolean I;
  private boolean J;
  private int K;
  protected boolean a;
  protected int b;
  protected int c;
  protected int d;
  TextView[] e;
  TextView[] f;
  int g;
  private Button h;
  private ImageView i;
  private Button j;
  private ImageView m;
  private Button n;
  private ImageView o;
  private LinearLayout p;
  private int q = m.a().H();
  private int r = 0;
  private TableLayoutGroup s;
  private String[] t = x.i;
  private String[] u = x.j;
  private String[] v;
  private String[] w;
  private int x;
  private DzhHeader y;
  private TableLayout z;
  
  public SetPlanCaptialShare()
  {
    String[] arrayOfString;
    if (com.android.dazhihui.ui.delegate.c.a.c == null)
    {
      arrayOfString = new String[5];
      arrayOfString[0] = "币种名称";
      arrayOfString[1] = "资金余额";
      arrayOfString[2] = "可用资金";
      arrayOfString[3] = "股票市值";
      arrayOfString[4] = "资产总值";
      this.v = arrayOfString;
      if (com.android.dazhihui.ui.delegate.c.a.d != null) {
        break label173;
      }
      arrayOfString = new String[5];
      arrayOfString[0] = "1028";
      arrayOfString[1] = "1077";
      arrayOfString[2] = "1078";
      arrayOfString[3] = "1065";
      arrayOfString[4] = "1087";
    }
    for (;;)
    {
      this.w = arrayOfString;
      this.a = true;
      this.b = 0;
      this.c = 0;
      this.d = 0;
      this.x = 0;
      this.G = null;
      this.H = null;
      this.I = false;
      this.J = false;
      this.K = 0;
      return;
      arrayOfString = com.android.dazhihui.ui.delegate.c.a.c;
      break;
      label173:
      arrayOfString = com.android.dazhihui.ui.delegate.c.a.d;
    }
  }
  
  private int a(double paramDouble)
  {
    if (paramDouble > 0.0D) {
      return -56541;
    }
    if (paramDouble < 0.0D) {
      return -12934322;
    }
    return -8553091;
  }
  
  private void d()
  {
    int i3 = 0;
    int i4 = this.w.length;
    this.f = new TextView[i4];
    this.e = new TextView[i4];
    int k = 0;
    Object localObject;
    while (k < i4)
    {
      localObject = new TextView(this);
      ((TextView)localObject).setTextColor(-16777216);
      ((TextView)localObject).setTextSize(14.0F);
      ((TextView)localObject).setGravity(3);
      ((TextView)localObject).setPadding(10, 5, 10, 5);
      this.e[k] = localObject;
      localObject = new TextView(this);
      ((TextView)localObject).setTextColor(-16777216);
      ((TextView)localObject).setTextSize(14.0F);
      ((TextView)localObject).setGravity(3);
      ((TextView)localObject).setPadding(10, 5, 10, 5);
      this.f[k] = localObject;
      k += 1;
    }
    int i1;
    label157:
    int i2;
    if (i4 % 2 == 0)
    {
      k = i4 / 2;
      localObject = new TableRow[k];
      i1 = 0;
      i2 = i3;
      if (i1 < k)
      {
        localObject[i1] = new TableRow(this);
        i2 = 0;
      }
    }
    else
    {
      for (;;)
      {
        if ((i2 >= 2) || (i1 * 2 + i2 >= i4))
        {
          i1 += 1;
          break label157;
          k = i4 / 2 + 1;
          break;
        }
        if (i1 * 2 + i2 < i4)
        {
          TextView localTextView1 = this.e[(i1 * 2 + i2)];
          TextView localTextView2 = this.f[(i1 * 2 + i2)];
          if (localTextView1 != null)
          {
            localObject[i1].addView(localTextView1);
            localTextView1.setText(this.v[(i1 * 2 + i2)]);
          }
          if (localTextView2 != null)
          {
            localObject[i1].addView(localTextView2);
            localTextView2.setText("--");
          }
        }
        i2 += 1;
      }
    }
    while (i2 < k)
    {
      this.z.addView(localObject[i2]);
      i2 += 1;
    }
  }
  
  private void f()
  {
    if ((this.K == 0) && (this.J))
    {
      a(false);
      this.J = false;
      this.K += 1;
    }
    this.s.postInvalidate();
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
    }
  }
  
  public void a()
  {
    if (!o.r()) {
      return;
    }
    this.G = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11104").a("1028", "" + this.x).a("1234", "2").h()) });
    registRequestListener(this.G);
    a(this.G, true);
  }
  
  public void a(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    this.H = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("12854").a("6002", "").a("6003", "").a("1552", "").a("1206", this.r).a("1277", this.q).a("2315", "2").h()) });
    registRequestListener(this.H);
    a(this.H, paramBoolean);
  }
  
  public void b()
  {
    if (this.b == 0) {
      return;
    }
    String[] arrayOfString = this.D.a;
    StringBuffer localStringBuffer = new StringBuffer();
    int k = 0;
    while (k < arrayOfString.length)
    {
      String str = arrayOfString[k];
      localObject = str;
      if (str == null) {
        localObject = "-";
      }
      localStringBuffer.append("\n").append(this.t[k]).append(": ").append((String)localObject);
      k += 1;
    }
    Object localObject = new Bundle();
    ((Bundle)localObject).putString("str", localStringBuffer.toString());
    startActivity(TradeText.class, (Bundle)localObject);
  }
  
  public void c()
  {
    b();
  }
  
  public void c(String paramString)
  {
    new AlertDialog.Builder(this).setTitle(2131166406).setMessage(paramString).setPositiveButton(2131165363, null).show();
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.d = "份额查询";
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.y = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    int k = 0;
    super.handleResponse(paramh, paramj);
    paramj = ((v)paramj).b();
    Object localObject1;
    int i1;
    Object localObject2;
    if (com.android.dazhihui.ui.delegate.b.u.a(paramj, this)) {
      if (paramh == this.G)
      {
        localObject1 = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
        if (!((com.android.dazhihui.ui.delegate.b.h)localObject1).b())
        {
          c(((com.android.dazhihui.ui.delegate.b.h)localObject1).d());
          paramh = this.f;
          i1 = paramh.length;
          while (k < i1)
          {
            paramh[k].setText("--");
            k += 1;
          }
        }
        this.b = ((com.android.dazhihui.ui.delegate.b.h)localObject1).g();
        if (this.b > 0)
        {
          k = 0;
          if (k >= this.b) {
            break label685;
          }
          localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(k, "1415");
          if ((localObject2 == null) || (!((String)localObject2).equals("1"))) {}
        }
      }
    }
    for (;;)
    {
      int i2 = this.w.length;
      i1 = 0;
      for (;;)
      {
        if (i1 < i2)
        {
          localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(k, this.w[i1]);
          localObject2 = o.c(this.w[i1], (String)localObject2);
          this.f[i1].setTextColor(-16777216);
          this.f[i1].setText((CharSequence)localObject2);
          if (this.w[i1].equals("1078")) {
            this.F = ((String)localObject2);
          }
          i1 += 1;
          continue;
          k += 1;
          break;
          localObject1 = this.f;
          i1 = localObject1.length;
          k = 0;
          while (k < i1)
          {
            localObject1[k].setText("--");
            k += 1;
          }
        }
      }
      this.J = true;
      f();
      if (paramh == this.H)
      {
        paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
        if (paramh.b()) {
          break label331;
        }
        c(paramh.d());
      }
      label331:
      do
      {
        return;
        this.C = paramh.g();
        if ((this.C == 0) && (this.s.getDataModel().size() <= 0))
        {
          this.s.setBackgroundResource(2130838490);
          return;
        }
        this.s.setBackgroundColor(17170443);
      } while (this.C <= 0);
      this.d = paramh.b("1289");
      paramj = new ArrayList();
      k = 0;
      while (k < this.C)
      {
        localObject1 = new mh();
        localObject2 = new String[this.t.length];
        int[] arrayOfInt = new int[this.t.length];
        i1 = 0;
        for (;;)
        {
          if (i1 < this.t.length) {
            try
            {
              localObject2[i1] = paramh.a(k, this.u[i1]).trim();
              if (localObject2[i1] == null) {
                localObject2[i1] = "--";
              }
              if ((!this.u[i1].equals("1064")) || (localObject2[i1].equals("--"))) {}
            }
            catch (Exception localException)
            {
              try
              {
                this.g = a(Double.parseDouble(localObject2[i1]));
                this.I = true;
                localObject2[i1] = o.c(this.u[i1], localObject2[i1]);
                i1 += 1;
                continue;
                localException = localException;
                localObject2[i1] = "--";
              }
              catch (NumberFormatException localNumberFormatException)
              {
                for (;;)
                {
                  localNumberFormatException.printStackTrace();
                }
              }
            }
          }
        }
        i1 = 0;
        while (i1 < this.t.length)
        {
          arrayOfInt[i1] = getResources().getColor(2131493235);
          i1 += 1;
        }
        ((mh)localObject1).a = ((String[])localObject2);
        ((mh)localObject1).b = arrayOfInt;
        paramj.add(localObject1);
        k += 1;
      }
      a(paramh, this.r);
      this.s.a(paramj, this.r);
      return;
      label685:
      k = 0;
    }
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    super.handleTimeout(paramh);
    if (paramh == this.H) {
      this.s.d();
    }
    if (this == com.android.dazhihui.b.b.a().f()) {
      b(1);
    }
  }
  
  public void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    setContentView(2130903521);
    this.y = ((DzhHeader)findViewById(2131558643));
    this.y.setOnHeaderButtonClickListener(this);
    this.y.a(this, this);
    this.h = ((Button)findViewById(2131559071));
    this.i = ((ImageView)findViewById(2131559072));
    this.j = ((Button)findViewById(2131559073));
    this.m = ((ImageView)findViewById(2131559074));
    this.n = ((Button)findViewById(2131559075));
    this.o = ((ImageView)findViewById(2131559076));
    this.p = ((LinearLayout)findViewById(2131559070));
    this.p.setVisibility(8);
    paramBundle = getResources();
    this.A = paramBundle.getColor(2131493480);
    this.B = paramBundle.getColor(2131493479);
    this.h.setOnClickListener(new a(this));
    this.j.setOnClickListener(new b(this));
    this.n.setOnClickListener(new c(this));
    this.s = ((TableLayoutGroup)findViewById(2131558644));
    this.s.setHeaderColumn(this.t);
    this.s.setPullDownLoading(false);
    this.s.setColumnClickable(null);
    this.s.setContinuousLoading(false);
    this.s.setHeaderBackgroundColor(getResources().getColor(2131493234));
    this.s.setDrawHeaderSeparateLine(false);
    this.s.setHeaderTextColor(getResources().getColor(2131493235));
    this.s.setHeaderHeight(56);
    this.s.setContentRowHeight(96);
    this.s.setListDivideDrawable(getResources().getDrawable(2130838328));
    this.s.setStockNameColor(getResources().getColor(2131493235));
    this.s.setOnLoadingListener(new d(this));
    this.s.setOnTableLayoutClickListener(new e(this));
    this.h.setTextColor(this.A);
    this.j.setTextColor(this.B);
    this.n.setTextColor(this.B);
    this.i.setBackgroundResource(2130838694);
    this.m.setBackgroundColor(-1);
    this.o.setBackgroundColor(-1);
    this.z = ((TableLayout)findViewById(2131559079));
    d();
    a();
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (paramh == this.H) {
      this.s.d();
    }
    if (this == com.android.dazhihui.b.b.a().f()) {
      b(9);
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 84) {
      startActivity(SearchStockScreen.class);
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\setplan\SetPlanCaptialShare.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */