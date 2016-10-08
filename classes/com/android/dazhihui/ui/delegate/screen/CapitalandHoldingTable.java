package com.android.dazhihui.ui.delegate.screen;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.b.b;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.delegate.b.o;
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

public class CapitalandHoldingTable
  extends DelegateBaseActivity
  implements cp, cs
{
  private String[] A;
  private String[] B;
  private String[] C;
  private String[] D;
  private int E;
  private DzhHeader F;
  private int G;
  private mh H;
  private com.android.dazhihui.a.b.u I;
  private com.android.dazhihui.a.b.u J;
  private boolean K;
  private boolean L;
  private int M;
  protected boolean a;
  protected int b;
  protected int c;
  protected int d;
  boolean[] e;
  String[] f;
  String[] g;
  TextView[] h;
  TextView[] i;
  int j;
  private Button m;
  private ImageView n;
  private Button o;
  private ImageView p;
  private Button q;
  private ImageView r;
  private int s;
  private int t;
  private TableLayout u;
  private TableLayout v;
  private int w;
  private int x = m.a().H();
  private int y = 0;
  private TableLayoutGroup z;
  
  public CapitalandHoldingTable()
  {
    String[] arrayOfString;
    if (com.android.dazhihui.ui.delegate.c.a.e == null)
    {
      arrayOfString = new String[8];
      arrayOfString[0] = "股票名称";
      arrayOfString[1] = "股票余额";
      arrayOfString[2] = "可用股数";
      arrayOfString[3] = "最新价";
      arrayOfString[4] = "成本价";
      arrayOfString[5] = "买卖盈亏";
      arrayOfString[6] = "股票市值";
      arrayOfString[7] = "股票代码";
      this.A = arrayOfString;
      if (com.android.dazhihui.ui.delegate.c.a.f != null) {
        break label375;
      }
      arrayOfString = new String[8];
      arrayOfString[0] = "1037";
      arrayOfString[1] = "1060";
      arrayOfString[2] = "1061";
      arrayOfString[3] = "1181";
      arrayOfString[4] = "1062";
      arrayOfString[5] = "1064";
      arrayOfString[6] = "1065";
      arrayOfString[7] = "1036";
      label132:
      this.B = arrayOfString;
      if (com.android.dazhihui.ui.delegate.c.a.c != null) {
        break label382;
      }
      arrayOfString = new String[5];
      arrayOfString[0] = "币种名称";
      arrayOfString[1] = "资金余额";
      arrayOfString[2] = "可用资金";
      arrayOfString[3] = "股票市值";
      arrayOfString[4] = "资产总值";
      label173:
      this.C = arrayOfString;
      if (com.android.dazhihui.ui.delegate.c.a.d != null) {
        break label389;
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
      this.D = arrayOfString;
      this.a = true;
      this.b = 0;
      this.c = 0;
      this.d = 0;
      this.e = new boolean[] { 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1 };
      this.E = 0;
      this.I = null;
      this.J = null;
      this.K = false;
      this.L = false;
      this.M = 0;
      return;
      arrayOfString = com.android.dazhihui.ui.delegate.c.a.e;
      break;
      label375:
      arrayOfString = com.android.dazhihui.ui.delegate.c.a.f;
      break label132;
      label382:
      arrayOfString = com.android.dazhihui.ui.delegate.c.a.c;
      break label173;
      label389:
      arrayOfString = com.android.dazhihui.ui.delegate.c.a.d;
    }
  }
  
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
  
  private void f()
  {
    int i3 = this.D.length;
    int i1 = -1;
    this.g = new String[i3 - 1];
    this.f = new String[i3 - 1];
    int i2 = 0;
    int k = 0;
    if (k < i3)
    {
      if ("1028".equals(this.D[k])) {
        i1 = k;
      }
      for (;;)
      {
        k += 1;
        break;
        this.g[i2] = this.D[k];
        this.f[i2] = this.C[k];
        i2 += 1;
      }
    }
    if (i1 == -1) {}
    for (k = i3;; k = i3 - 1)
    {
      this.h = new TextView[k];
      this.i = new TextView[k];
      i1 = 0;
      while (i1 < k)
      {
        localObject = new TextView(this);
        ((TextView)localObject).setTextColor(-16777216);
        ((TextView)localObject).setTextSize(14.0F);
        ((TextView)localObject).setGravity(1);
        ((TextView)localObject).setPadding(10, 5, 10, 5);
        this.i[i1] = localObject;
        localObject = new TextView(this);
        ((TextView)localObject).setTextColor(-16777216);
        ((TextView)localObject).setTextSize(14.0F);
        ((TextView)localObject).setGravity(1);
        ((TextView)localObject).setPadding(10, 5, 10, 5);
        this.h[i1] = localObject;
        i1 += 1;
      }
    }
    TableRow[] arrayOfTableRow;
    if (k % 2 == 0)
    {
      i1 = k / 2;
      arrayOfTableRow = new TableRow[i1];
    }
    for (Object localObject = new TableRow[i1];; localObject = new TableRow[i1 - 1])
    {
      i2 = 0;
      for (;;)
      {
        if (i2 >= i1) {
          break label613;
        }
        i3 = 0;
        if (i3 < 2)
        {
          if (i3 != 0) {
            break label478;
          }
          if (i2 * 2 + i3 < k) {
            break;
          }
        }
        label315:
        i2 += 1;
      }
      i1 = k / 2 + 1;
      arrayOfTableRow = new TableRow[i1];
    }
    arrayOfTableRow[i2] = new TableRow(this);
    TextView localTextView1 = this.i[(i2 * 2 + i3)];
    localTextView1.setPadding(10, 5, 10, 5);
    localTextView1.setGravity(3);
    TextView localTextView2 = this.h[(i2 * 2 + i3)];
    localTextView2.setPadding(10, 5, 10, 5);
    localTextView2.setGravity(3);
    if (localTextView1 != null)
    {
      arrayOfTableRow[i2].addView(localTextView1);
      localTextView1.setText(this.f[(i2 * 2 + i3)]);
    }
    if (localTextView2 != null)
    {
      arrayOfTableRow[i2].addView(localTextView2);
      localTextView2.setText("--");
    }
    for (;;)
    {
      i3 += 1;
      break;
      label478:
      if (i2 * 2 + i3 >= k) {
        break label315;
      }
      localObject[i2] = new TableRow(this);
      localTextView1 = this.i[(i2 * 2 + i3)];
      localTextView1.setPadding(10, 5, 10, 5);
      localTextView1.setGravity(3);
      localTextView2 = this.h[(i2 * 2 + i3)];
      localTextView2.setPadding(10, 5, 10, 5);
      localTextView2.setGravity(3);
      if (localTextView1 != null)
      {
        localObject[i2].addView(localTextView1);
        localTextView1.setText(this.f[(i2 * 2 + i3)]);
      }
      if (localTextView2 != null)
      {
        localObject[i2].addView(localTextView2);
        localTextView2.setText("--");
      }
    }
    label613:
    k = 0;
    while (k < i1)
    {
      this.u.addView(arrayOfTableRow[k]);
      if ((k < localObject.length) && (localObject[k] != null)) {
        this.v.addView(localObject[k]);
      }
      k += 1;
    }
  }
  
  private void g()
  {
    if ((this.M == 0) && (this.L))
    {
      a(false);
      this.L = false;
      this.M += 1;
    }
    this.z.postInvalidate();
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
      if (com.android.dazhihui.c.a.a.z.contains("湘财证券")) {
        startActivity(new Intent(this, TransferMenuNew.class));
      } else {
        startActivity(new Intent(this, TransferMenu.class));
      }
    }
  }
  
  public void a()
  {
    if (!o.r()) {
      return;
    }
    this.I = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11104").a("1028", "" + this.E).a("1234", "1").h()) });
    registRequestListener(this.I);
    a(this.I, true);
  }
  
  public void a(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    this.J = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11146").a("1019", "").a("1036", "").a("1206", this.y).a("1277", this.x).h()) });
    registRequestListener(this.J);
    a(this.J, paramBoolean);
  }
  
  public void b()
  {
    if (this.b == 0) {
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putInt("screenId", 1);
    localBundle.putString("scode", n.t((String)c(this.w).get("1036")));
    localBundle.putString("saccount", n.t((String)c(this.w).get("1019")));
    startActivity(EntrustNew.class, localBundle);
  }
  
  public void c()
  {
    if ((this.b == 0) || (this.H == null)) {}
    String[] arrayOfString;
    StringBuffer localStringBuffer;
    do
    {
      return;
      arrayOfString = this.H.a;
      localStringBuffer = new StringBuffer();
    } while (arrayOfString == null);
    int k = 0;
    while (k < arrayOfString.length)
    {
      String str = arrayOfString[k];
      localObject = str;
      if (str == null) {
        localObject = "-";
      }
      localStringBuffer.append("\n").append(this.A[k]).append(": ").append((String)localObject);
      k += 1;
    }
    Object localObject = new Bundle();
    ((Bundle)localObject).putString("str", localStringBuffer.toString());
    startActivity(TradeText.class, (Bundle)localObject);
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (w.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.F == null);
      this.F.a(paramy);
      return;
    } while (this.F == null);
    this.F.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramContext = paramContext.getResources().getString(2131165334);
    paramct.a = 16424;
    paramct.d = paramContext;
    paramct.p = this;
    paramct.e = "银证转账";
  }
  
  public void d()
  {
    openOptionsMenu();
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.F = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    boolean bool = ah.a().c().booleanValue();
    Object localObject1;
    int i1;
    int k;
    Object localObject2;
    if (paramh == this.I)
    {
      localObject1 = ((com.android.dazhihui.a.b.v)paramj).b();
      if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, this))
      {
        localObject1 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
        if (!((com.android.dazhihui.ui.delegate.b.h)localObject1).b())
        {
          paramh = Toast.makeText(this, ((com.android.dazhihui.ui.delegate.b.h)localObject1).d(), 0);
          paramh.setGravity(17, 0, 0);
          paramh.show();
          paramh = this.h;
          i1 = paramh.length;
          k = 0;
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
            break label950;
          }
          localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(k, "1415");
          if ((localObject2 == null) || (!((String)localObject2).equals("1"))) {}
        }
      }
    }
    for (;;)
    {
      int i3 = this.g.length;
      i1 = 0;
      for (;;)
      {
        i2 = k;
        if (i1 >= i3) {
          break;
        }
        localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(k, this.g[i1]);
        this.h[i1].setTextColor(-16777216);
        this.h[i1].setText((CharSequence)localObject2);
        i1 += 1;
      }
      k += 1;
      break;
      localObject2 = this.h;
      i1 = localObject2.length;
      k = 0;
      while (k < i1)
      {
        localObject2[k].setText("--");
        k += 1;
      }
      int i2 = 0;
      Object localObject3;
      if (bool)
      {
        localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i2, "1078");
        localObject3 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i2, "1087");
        localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i2, "1065");
        ah.a().c((String)localObject2);
        ah.a().a((String)localObject3, (String)localObject2, (String)localObject1);
      }
      this.L = true;
      g();
      if (paramh == this.J)
      {
        paramh = ((com.android.dazhihui.a.b.v)paramj).b();
        if (com.android.dazhihui.ui.delegate.b.u.a(paramh, this))
        {
          localObject1 = com.android.dazhihui.ui.delegate.b.h.b(paramh.e());
          if (((com.android.dazhihui.ui.delegate.b.h)localObject1).b()) {
            break label414;
          }
          paramh = Toast.makeText(this, ((com.android.dazhihui.ui.delegate.b.h)localObject1).d(), 0);
          paramh.setGravity(17, 0, 0);
          paramh.show();
        }
      }
      label414:
      do
      {
        do
        {
          do
          {
            return;
            this.G = ((com.android.dazhihui.ui.delegate.b.h)localObject1).g();
            this.d = ((com.android.dazhihui.ui.delegate.b.h)localObject1).b("1289");
            if ((this.G != 0) || (this.z.getDataModel().size() != 0)) {
              break;
            }
            this.z.setBackgroundResource(2130838490);
          } while (!bool);
          ah.a().d();
          return;
          this.z.setBackgroundColor(getResources().getColor(2131493677));
        } while (this.G <= 0);
        paramh = new ArrayList();
        k = 0;
        while (k < this.G)
        {
          paramj = new mh();
          localObject2 = new String[this.A.length];
          localObject3 = new int[this.A.length];
          i1 = 0;
          for (;;)
          {
            if (i1 < this.A.length) {
              try
              {
                localObject2[i1] = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(k, this.B[i1]).trim();
                if (localObject2[i1] == null) {
                  localObject2[i1] = "--";
                }
                if ((!this.B[i1].equals("1064")) || (localObject2[i1].equals("--"))) {}
              }
              catch (Exception localException)
              {
                try
                {
                  this.j = a(Double.parseDouble(localObject2[i1]));
                  this.K = true;
                  localObject2[i1] = o.c(this.B[i1], localObject2[i1]);
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
          while (i1 < this.A.length)
          {
            localObject3[i1] = getResources().getColor(2131493235);
            i1 += 1;
          }
          paramj.a = ((String[])localObject2);
          paramj.b = ((int[])localObject3);
          paramh.add(paramj);
          k += 1;
        }
        a((com.android.dazhihui.ui.delegate.b.h)localObject1, this.y);
        this.z.a(paramh, this.y);
      } while (!bool);
      ah.a().d();
      k = 0;
      while (k < this.G)
      {
        localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(k, "1036");
        localObject3 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(k, "1037");
        String str1 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(k, "1060");
        String str2 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(k, "1062");
        paramj = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(k, "1021");
        String str3 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(k, "1064");
        String str4 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(k, "1181");
        String str5 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(k, "1061");
        if (paramj != null)
        {
          paramh = paramj;
          if (!paramj.equals("")) {}
        }
        else
        {
          paramh = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(k, "1004");
        }
        ah.a().a((String)localObject3, (String)localObject2, paramh, str2, str1, str5, str3, str4);
        k += 1;
      }
      ah.a().m();
      return;
      label950:
      k = 0;
    }
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    super.handleTimeout(paramh);
    if (paramh == this.J) {
      this.z.d();
    }
    if (this == b.a().f()) {
      b(1);
    }
  }
  
  public void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    setContentView(2130903137);
    this.F = ((DzhHeader)findViewById(2131558643));
    this.F.a(this, this);
    this.m = ((Button)findViewById(2131559071));
    this.n = ((ImageView)findViewById(2131559072));
    this.o = ((Button)findViewById(2131559073));
    this.p = ((ImageView)findViewById(2131559074));
    this.q = ((Button)findViewById(2131559075));
    this.r = ((ImageView)findViewById(2131559076));
    this.s = getResources().getColor(2131493480);
    this.t = getResources().getColor(2131493479);
    this.m.setOnClickListener(new r(this));
    this.o.setOnClickListener(new s(this));
    this.q.setOnClickListener(new t(this));
    this.z = ((TableLayoutGroup)findViewById(2131558644));
    this.z.setHeaderColumn(this.A);
    this.z.setPullDownLoading(false);
    this.z.setColumnClickable(null);
    this.z.setContinuousLoading(false);
    this.z.setHeaderBackgroundColor(getResources().getColor(2131493234));
    this.z.setDrawHeaderSeparateLine(false);
    this.z.setHeaderTextColor(getResources().getColor(2131493235));
    this.z.setHeaderHeight(56);
    this.z.setContentRowHeight(96);
    this.z.setLeftPadding(25);
    this.z.setListDivideDrawable(getResources().getDrawable(2130838328));
    this.z.setRowHighLightBackgroudDrawable(getResources().getDrawable(2130838067));
    this.z.setStockNameColor(getResources().getColor(2131493235));
    this.z.setOnLoadingListener(new u(this));
    this.z.setOnTableLayoutClickListener(new v(this));
    this.m.setTextColor(this.s);
    this.o.setTextColor(this.t);
    this.q.setTextColor(this.t);
    this.n.setBackgroundResource(2130838694);
    this.p.setBackgroundColor(-1);
    this.r.setBackgroundColor(-1);
    this.u = ((TableLayout)findViewById(2131559079));
    this.v = ((TableLayout)findViewById(2131559081));
    f();
    a();
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (paramh == this.J) {
      this.z.d();
    }
    if (this == b.a().f()) {
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
      c();
      return;
    }
    b();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\CapitalandHoldingTable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */