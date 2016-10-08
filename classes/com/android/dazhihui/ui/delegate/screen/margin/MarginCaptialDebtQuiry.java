package com.android.dazhihui.ui.delegate.screen.margin;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.b.b;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.a;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class MarginCaptialDebtQuiry
  extends DelegateBaseActivity
  implements cp, cs
{
  private ListView a;
  private LinearLayout b;
  private String[][] c;
  private HashMap<String, String> d;
  private ArrayList<Integer> e;
  private ArrayList<TextView> f;
  private DzhHeader g;
  private String[] h;
  private String[] i;
  private com.android.dazhihui.a.b.u j;
  
  private void a()
  {
    this.d = new HashMap();
    this.e = new ArrayList();
    this.f = new ArrayList();
    this.h = a.bm;
    this.i = a.bn;
    if ((this.h == null) || (this.i == null))
    {
      this.h = new String[] { "" };
      this.i = new String[] { "" };
    }
    int m = this.h.length;
    this.c = ((String[][])Array.newInstance(String.class, new int[] { m, 2 }));
    int k = 0;
    while (k < m)
    {
      this.c[k][0] = this.i[k];
      this.c[k][1] = this.h[k];
      k += 1;
    }
    Object localObject1 = "1";
    k = 0;
    while (k < m)
    {
      Object localObject2 = localObject1;
      if (this.c[k][0].equals(localObject1))
      {
        this.e.add(Integer.valueOf(k));
        localObject2 = String.valueOf(Integer.parseInt((String)localObject1) + 1);
      }
      k += 1;
      localObject1 = localObject2;
    }
  }
  
  private void a(int paramInt)
  {
    int m = paramInt - 1;
    if (m >= 0)
    {
      int k = 0;
      if (k < this.f.size())
      {
        if (k == m)
        {
          ((TextView)this.f.get(k)).setTextColor(getResources().getColor(2131492932));
          ((TextView)this.f.get(k)).setTextSize(18.0F);
        }
        for (;;)
        {
          k += 1;
          break;
          ((TextView)this.f.get(k)).setTextColor(-16777216);
          ((TextView)this.f.get(k)).setTextSize(15.0F);
        }
      }
    }
    r localr = new r(this, this, d(paramInt));
    this.a.setAdapter(localr);
  }
  
  private void b()
  {
    int m = this.e.size();
    int k = 0;
    if (k < m)
    {
      int n = k + 1;
      TextView localTextView = new TextView(this);
      localTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 0.1F));
      localTextView.setGravity(17);
      localTextView.setOnClickListener(new q(this, n));
      localTextView.setText(e(n));
      this.b.addView(localTextView);
      this.f.add(localTextView);
      if (k == 0)
      {
        localTextView.setTextColor(getResources().getColor(2131492932));
        localTextView.setTextSize(18.0F);
      }
      for (;;)
      {
        k += 1;
        break;
        localTextView.setTextColor(-16777216);
        localTextView.setTextSize(15.0F);
      }
    }
  }
  
  private void c()
  {
    if (!o.r()) {
      return;
    }
    this.j = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("12326").a("1028", "0").h()) });
    registRequestListener(this.j);
    a(this.j, true);
  }
  
  private String[][] d(int paramInt)
  {
    int m = this.e.size();
    Object localObject;
    if ((paramInt < 1) && (paramInt - 1 >= m))
    {
      localObject = (String[][])null;
      return (String[][])localObject;
    }
    int k = ((Integer)this.e.get(paramInt - 1)).intValue();
    if (paramInt >= m) {}
    for (paramInt = this.c.length;; paramInt = ((Integer)this.e.get(paramInt)).intValue())
    {
      m = paramInt - k - 1;
      String[][] arrayOfString = (String[][])Array.newInstance(String.class, new int[] { m, 2 });
      paramInt = 0;
      for (;;)
      {
        localObject = arrayOfString;
        if (paramInt >= m) {
          break;
        }
        arrayOfString[paramInt][0] = this.c[(k + paramInt + 1)][1];
        arrayOfString[paramInt][1] = ((String)this.d.get(this.c[(k + paramInt + 1)][0]));
        paramInt += 1;
      }
    }
  }
  
  private String e(int paramInt)
  {
    int k = this.e.size();
    if ((paramInt < 1) && (paramInt - 1 >= k)) {
      return "";
    }
    paramInt = ((Integer)this.e.get(paramInt - 1)).intValue();
    return this.c[paramInt][1];
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
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.d = "资产负债查询";
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.g = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    if (paramh == this.j)
    {
      paramh = ((v)paramj).b();
      if (!com.android.dazhihui.ui.delegate.b.u.a(paramh, this)) {
        break label163;
      }
      paramj = com.android.dazhihui.ui.delegate.b.h.b(paramh.e());
      if (!paramj.b()) {
        c(paramj.d());
      }
    }
    else
    {
      return;
    }
    if (this.c != null)
    {
      this.d.clear();
      int k = 0;
      if (k < this.c.length)
      {
        if (paramj.a(0, this.c[k][0]) == null) {}
        for (paramh = "";; paramh = paramj.a(0, this.c[k][0]))
        {
          this.d.put(this.c[k][0], paramh);
          k += 1;
          break;
        }
      }
    }
    paramh = new r(this, this, d(1));
    this.a.setAdapter(paramh);
    return;
    label163:
    c("　　连接失败，请重试!");
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
    setContentView(2130903253);
    a();
    this.g = ((DzhHeader)findViewById(2131558513));
    this.g.a(this, this);
    this.b = ((LinearLayout)findViewById(2131559728));
    this.a = ((ListView)findViewById(2131559729));
    b();
    c();
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (this == b.a().f()) {
      b(9);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\MarginCaptialDebtQuiry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */