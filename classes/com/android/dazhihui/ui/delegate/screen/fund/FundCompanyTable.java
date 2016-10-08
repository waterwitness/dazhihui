package com.android.dazhihui.ui.delegate.screen.fund;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.b.b;
import com.android.dazhihui.ui.delegate.a.a;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import java.lang.reflect.Array;

public class FundCompanyTable
  extends DelegateBaseActivity
  implements cp, cs
{
  protected int a = 0;
  protected int b = 0;
  String[] c = { "名称" };
  String[] d = { "1089" };
  public boolean e = true;
  private ListView f;
  private a g;
  private String[] h;
  private DzhHeader i;
  private com.android.dazhihui.a.b.u j;
  
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
    this.j = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11924").a("1011", "").h()) });
    registRequestListener(this.j);
    a(this.j, true);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.d = "基金公司";
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.i = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    paramj = ((v)paramj).b();
    if (paramj == null)
    {
      paramh = Toast.makeText(this, "　　连接失败，请重试!", 0);
      paramh.setGravity(17, 0, 0);
      paramh.show();
    }
    while (paramh != this.j) {
      return;
    }
    paramh = (String[][])null;
    paramh = (int[][])null;
    paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
    if (!paramh.b())
    {
      paramh = Toast.makeText(this, paramh.d() + "　　读取失败", 0);
      paramh.setGravity(17, 0, 0);
      paramh.show();
      return;
    }
    int n = paramh.g();
    paramj = (String[][])Array.newInstance(String.class, new int[] { n, this.c.length });
    int k = this.c.length;
    paramj = (int[][])Array.newInstance(Integer.TYPE, new int[] { n, k });
    String[] arrayOfString = new String[n];
    if (n > 0)
    {
      this.b = paramh.b("1289");
      String[][] arrayOfString1 = (String[][])Array.newInstance(String.class, new int[] { n, this.c.length });
      k = 0;
      int m;
      while (k < n)
      {
        m = 0;
        while (m < this.c.length)
        {
          arrayOfString1[k][m] = paramh.a(k, this.d[m]);
          if (arrayOfString1[k][m] == null) {
            arrayOfString1[k][m] = "--";
          }
          m += 1;
        }
        k += 1;
      }
      a(paramh, this.a);
      k = 0;
      while (k < n)
      {
        paramj[k][0] = o.a(k, 0);
        m = 1;
        while (m < this.c.length)
        {
          paramj[k][m] = o.a(k, m);
          m += 1;
        }
        arrayOfString1[k][0] = (this.a + k + 1 + "、" + arrayOfString1[k][0]);
        arrayOfString[k] = arrayOfString1[k][0];
        k += 1;
      }
    }
    this.h = arrayOfString;
    if (this.h.length != 0) {}
    for (this.g = new a(this, this.h);; this.g = new a(this, this.h))
    {
      this.f.setAdapter(this.g);
      return;
      this.h = new String[1];
      this.h[0] = "- 无记录 -";
    }
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    super.handleTimeout(paramh);
    if (this == b.a().f()) {
      b(1);
    }
  }
  
  public void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    setContentView(2130903529);
    this.i = ((DzhHeader)findViewById(2131558513));
    this.i.a(this, this);
    this.f = ((ListView)findViewById(2131560250));
    this.h = new String[1];
    this.h[0] = "";
    this.g = new a(this, this.h);
    this.f.setAdapter(this.g);
    this.f.setOnItemClickListener(new af(this));
    a();
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (this == b.a().f()) {
      b(9);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\FundCompanyTable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */