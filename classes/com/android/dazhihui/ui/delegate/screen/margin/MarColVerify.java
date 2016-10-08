package com.android.dazhihui.ui.delegate.screen.margin;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.b.b;
import com.android.dazhihui.ui.a.e;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.d;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import java.util.ArrayList;

public class MarColVerify
  extends DelegateBaseActivity
  implements cp, cs
{
  public static boolean a = false;
  private EditText b;
  private EditText c;
  private Button d;
  private com.android.dazhihui.a.b.u e;
  
  public static boolean a()
  {
    return (bg.e != null) && (!bg.e.equals(""));
  }
  
  private void b()
  {
    String str2 = this.b.getText().toString();
    String str3 = this.c.getText().toString();
    if (bg.f != null) {}
    for (String str1 = bg.f;; str1 = "")
    {
      int i = e.a().j();
      this.e = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(new com.android.dazhihui.ui.delegate.b.h("12234").a("21010", d.e).a("1203", com.android.dazhihui.c.a.a.i[i][0]).a("1205", "13").a("1207", "0").a("1016", str2).a("1019", str2).a("1005", "").a("1030", str3).a("1330", "1").a("1021", str1).a("1202", "android " + com.android.dazhihui.g.a().r()).a("6129", "20000").a("6130", o.k).a("6131", o.j).h()) });
      registRequestListener(this.e);
      a(this.e, true);
      return;
    }
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
    paramct.d = "担保品划转";
  }
  
  public void getTitle(DzhHeader paramDzhHeader) {}
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    if (paramh == this.e)
    {
      paramh = ((v)paramj).b();
      if (!com.android.dazhihui.ui.delegate.b.u.a(paramh, this)) {
        break label240;
      }
      com.android.dazhihui.ui.delegate.b.g.c(paramh.e());
      paramh = com.android.dazhihui.ui.delegate.b.h.b(paramh.e());
      if (!paramh.b()) {
        c(paramh.d());
      }
    }
    else
    {
      return;
    }
    int j = paramh.g();
    if (j == 0)
    {
      c("网络连接超时请重试......");
      return;
    }
    paramj = new ArrayList();
    int i = 0;
    while (i < j)
    {
      bh localbh = new bh();
      localbh.a = paramh.a(i, "1020");
      localbh.b = paramh.a(i, "1016");
      localbh.c = paramh.a(i, "1021");
      localbh.d = paramh.a(i, "1019");
      localbh.e = paramh.a(i, "1394");
      localbh.f = paramh.a(i, "1005");
      localbh.g = paramh.a(i, "1059");
      localbh.h = this.c.getText().toString();
      paramj.add(localbh);
      i += 1;
    }
    bg.g = paramj;
    a = true;
    startActivity(MarginColScreen.class);
    finish();
    return;
    label240:
    c("　　网络连接异常..");
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
    setContentView(2130903256);
    paramBundle = (DzhHeader)findViewById(2131558513);
    paramBundle.setOnHeaderButtonClickListener(this);
    paramBundle.a(this, this);
    this.b = ((EditText)findViewById(2131559741));
    this.c = ((EditText)findViewById(2131559743));
    this.d = ((Button)findViewById(2131559744));
    if (a())
    {
      this.b.setFocusable(false);
      this.b.setText(bg.e);
    }
    this.d.setOnClickListener(new a(this));
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (this == b.a().f()) {
      b(9);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\MarColVerify.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */