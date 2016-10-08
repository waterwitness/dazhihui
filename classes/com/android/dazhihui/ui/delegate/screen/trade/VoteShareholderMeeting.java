package com.android.dazhihui.ui.delegate.screen.trade;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.b.b;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import java.util.Vector;

public class VoteShareholderMeeting
  extends DelegateBaseActivity
  implements cp, cs
{
  private DzhHeader a;
  private ListView b;
  private LinearLayout c;
  private Vector<s> d;
  private q e;
  private LayoutInflater f;
  private com.android.dazhihui.a.b.u g;
  
  private void a()
  {
    this.f = LayoutInflater.from(this);
    this.a = ((DzhHeader)findViewById(2131558513));
    this.a.a(this, this);
    this.b = ((ListView)findViewById(2131560485));
    this.c = ((LinearLayout)findViewById(2131558668));
  }
  
  private void b()
  {
    if (!o.r()) {
      return;
    }
    this.g = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("12880").a("1026", "1").a("2315", "0").h()) });
    registRequestListener(this.g);
    a(this.g, true);
  }
  
  public boolean OnChildClick(View paramView)
  {
    if (((Integer)paramView.getTag()).intValue() == 0) {
      finish();
    }
    return true;
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 4392;
    paramct.d = "投票";
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.a = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    if (paramh == this.g)
    {
      paramh = ((v)paramj).b();
      if (!com.android.dazhihui.ui.delegate.b.u.a(paramh, this)) {
        break label317;
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
    int j = paramj.g();
    if (j == 0)
    {
      this.c.setBackgroundResource(2130838490);
      return;
    }
    this.d = new Vector();
    int i = 0;
    if (i < j)
    {
      s locals = new s(this);
      if (paramj.a(i, "2532") == null)
      {
        paramh = "";
        label119:
        locals.a = paramh;
        if (paramj.a(i, "2527") != null) {
          break label230;
        }
        paramh = "";
        label138:
        locals.b = paramh;
        if (paramj.a(i, "1022") != null) {
          break label242;
        }
        paramh = "";
        label157:
        locals.d = paramh;
        if (paramj.a(i, "1023") != null) {
          break label254;
        }
        paramh = "";
        label176:
        locals.c = paramh;
        if (paramj.a(i, "6075") != null) {
          break label266;
        }
      }
      label230:
      label242:
      label254:
      label266:
      for (paramh = "";; paramh = paramj.a(i, "6075"))
      {
        locals.e = paramh;
        this.d.add(locals);
        i += 1;
        break;
        paramh = paramj.a(i, "2532");
        break label119;
        paramh = paramj.a(i, "2527");
        break label138;
        paramh = paramj.a(i, "1022");
        break label157;
        paramh = paramj.a(i, "1023");
        break label176;
      }
    }
    if (this.e == null)
    {
      this.e = new q(this);
      this.b.setAdapter(this.e);
      return;
    }
    this.b.postInvalidate();
    return;
    label317:
    paramh = Toast.makeText(this, "　　连接失败，请重试!", 0);
    paramh.setGravity(17, 0, 0);
    paramh.show();
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
    setContentView(2130903586);
    a();
    b();
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (this == b.a().f()) {
      b(9);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\trade\VoteShareholderMeeting.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */