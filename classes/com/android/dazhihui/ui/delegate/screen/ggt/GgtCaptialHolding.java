package com.android.dazhihui.ui.delegate.screen.ggt;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
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
import com.android.dazhihui.ui.screen.stock.offlinecapital.ah;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.mh;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class GgtCaptialHolding
  extends DelegateBaseActivity
  implements cp, cs
{
  private int A;
  private int B;
  private int C;
  private mh D;
  private int E;
  private com.android.dazhihui.a.b.u F = null;
  private com.android.dazhihui.a.b.u G = null;
  private boolean H = false;
  private boolean I = false;
  private int J = 0;
  private boolean K = false;
  protected boolean a = true;
  protected int b = 0;
  protected int c = 0;
  protected int d = 0;
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
  private String[] t = GgtTradeMenu.t;
  private String[] u = GgtTradeMenu.u;
  private String[] v = GgtTradeMenu.v;
  private String[] w = GgtTradeMenu.w;
  private int x = 0;
  private DzhHeader y;
  private TableLayout z;
  
  private int a(double paramDouble)
  {
    if (paramDouble > 0.0D) {
      return -65536;
    }
    if (paramDouble < 0.0D) {
      return -16711936;
    }
    return -1;
  }
  
  private void g()
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
  
  public boolean OnChildClick(View paramView)
  {
    if (((Integer)paramView.getTag()).intValue() == 0) {
      finish();
    }
    return false;
  }
  
  public void a()
  {
    if (!o.r()) {
      return;
    }
    this.F = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("12666").a("1028", "" + this.x).a("2315", "3").h()) });
    registRequestListener(this.F);
    a(this.F, true);
  }
  
  public void a(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    this.G = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("12654").a("1026", 1).a("1206", this.r).a("1277", this.q).a("2315", "3").h()) });
    registRequestListener(this.G);
    a(this.G, true);
  }
  
  public void b()
  {
    this.s.postInvalidate();
    if ((this.J == 0) && (this.I))
    {
      a(false);
      this.I = false;
      this.J += 1;
    }
    this.s.postInvalidate();
  }
  
  public void c()
  {
    if (this.C == 0) {
      return;
    }
    int k = this.E;
    Bundle localBundle = new Bundle();
    localBundle.putInt("screenId", 16387);
    localBundle.putInt("type", 1);
    localBundle.putString("codes", (String)c(this.E).get("1036"));
    localBundle.putString("saccount", (String)c(this.E).get("1019"));
    startActivity(GgtEntrust.class, localBundle);
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (f.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.y == null);
      this.y.a(paramy);
      return;
    } while (this.y == null);
    this.y.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.d = "资金股份";
    paramct.p = this;
  }
  
  public void d()
  {
    openOptionsMenu();
  }
  
  public void f()
  {
    if (this.C == 0) {
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
    if (com.android.dazhihui.ui.delegate.b.u.a(paramj, this))
    {
      if (paramh != this.F) {
        break label281;
      }
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
        this.I = true;
        b();
      }
    }
    else
    {
      return;
    }
    this.b = ((com.android.dazhihui.ui.delegate.b.h)localObject1).g();
    Object localObject2;
    if (this.b > 0)
    {
      k = 0;
      if (k >= this.b) {
        break label706;
      }
      localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(k, "1415");
      if ((localObject2 == null) || (!((String)localObject2).equals("1"))) {}
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
          this.f[i1].setTextColor(-16777216);
          this.f[i1].setText((CharSequence)localObject2);
          i1 += 1;
          continue;
          k += 1;
          break;
          c("没有资金显示");
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
      this.I = true;
      b();
      label281:
      if (paramh != this.G) {
        break;
      }
      paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
      if (!paramh.b())
      {
        c(paramh.d());
        return;
      }
      this.C = paramh.g();
      if ((this.C == 0) && (this.s.getDataModel().size() <= 0))
      {
        this.s.setBackgroundResource(2130838490);
        return;
      }
      this.s.setBackgroundColor(17170443);
      if (this.C <= 0) {
        break;
      }
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
              if ((this.u[i1].equals("1064")) || (this.u[i1].equals("1233"))) {
                if (localObject2[i1].equals("--")) {}
              }
            }
            catch (Exception localException)
            {
              try
              {
                this.g = a(Double.parseDouble(localObject2[i1]));
                this.H = true;
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
      if (!ah.a().c().booleanValue()) {
        break;
      }
      ah.a().a(this.C, paramh);
      return;
      label706:
      k = 0;
    }
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    super.handleTimeout(paramh);
    if (paramh == this.G) {
      this.s.d();
    }
    if (this == com.android.dazhihui.b.b.a().f()) {
      b(1);
    }
  }
  
  public void init(Bundle paramBundle)
  {
    setContentView(2130903488);
    this.y = ((DzhHeader)findViewById(2131558643));
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
    this.s.setContinuousLoading(true);
    this.s.setHeaderBackgroundColor(getResources().getColor(2131493677));
    this.s.setHeaderDivideDrawable(getResources().getDrawable(2130838328));
    this.s.setDrawHeaderSeparateLine(false);
    this.s.setHeaderTextColor(getResources().getColor(2131493099));
    this.s.setHeaderFontSize(getResources().getDimension(2131230899));
    this.s.setHeaderHeight((int)getResources().getDimension(2131230814));
    this.s.setLeftPadding(25);
    this.s.setListDivideDrawable(getResources().getDrawable(2130838328));
    this.s.setRowHighLightBackgroudDrawable(getResources().getDrawable(2130838067));
    this.s.setStockNameColor(getResources().getColor(2131493235));
    this.s.setFirstColumnColorDifferent(true);
    this.s.setOnLoadingListener(new d(this));
    this.s.setOnTableLayoutClickListener(new e(this));
    this.h.setTextColor(this.A);
    this.j.setTextColor(this.B);
    this.n.setTextColor(this.B);
    this.i.setBackgroundResource(2130838694);
    this.m.setBackgroundColor(-1);
    this.o.setBackgroundColor(-1);
    this.z = ((TableLayout)findViewById(2131559079));
    g();
    a();
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (paramh == this.G) {
      this.s.d();
    }
    if (this == com.android.dazhihui.b.b.a().f()) {
      b(9);
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131689472, paramMenu);
    return true;
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 84) {
      startActivity(SearchStockScreen.class);
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onOptionMenuSelect(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 2131561363: 
      f();
      return;
    }
    c();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ggt\GgtCaptialHolding.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */