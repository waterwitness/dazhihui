package com.android.dazhihui.ui.delegate.screen.fund;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.b.b;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;

public class FundDividend
  extends DelegateBaseActivity
  implements cp, cs
{
  private String a = "";
  private EditText b;
  private EditText c;
  private Spinner d;
  private Button e;
  private int f = 0;
  private String[] g = { "1", "4" };
  private String[] h = { "现金分红", "红利再投" };
  private DzhHeader i;
  private com.android.dazhihui.a.b.u j;
  private com.android.dazhihui.a.b.u m;
  
  private void a()
  {
    this.b.setText("");
    this.c.setText("");
  }
  
  private void b()
  {
    if (!o.r()) {
      return;
    }
    this.j = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11916").a("1090", this.a).a("1206", "0").a("1277", "1").h()) });
    registRequestListener(this.j);
    a(this.j, true);
  }
  
  private void c()
  {
    if (!o.r()) {
      return;
    }
    String str = this.g[this.f];
    this.m = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11914").a("1090", this.a).a("1096", str).h()) });
    registRequestListener(this.m);
    a(this.m, true);
    a();
  }
  
  public boolean OnChildClick(View paramView)
  {
    if (((Integer)paramView.getTag()).intValue() == 0) {
      finish();
    }
    return false;
  }
  
  public void b(int paramInt)
  {
    Toast localToast;
    if (paramInt == 0)
    {
      localToast = Toast.makeText(this, "　　基金代码必须填写。", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
    }
    if (paramInt == 1)
    {
      localToast = Toast.makeText(this, "　　基金代码必须为完整的6位。", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
    }
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {}
    switch (al.a[paramy.ordinal()])
    {
    default: 
      return;
    case 1: 
      this.i.setBackgroundColor(getResources().getColor(2131493291));
      return;
    }
    this.i.setBackgroundColor(getResources().getColor(2131493599));
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.d = "分红方式";
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
    if (paramj == null) {}
    do
    {
      do
      {
        return;
        if (paramh != this.j) {
          break;
        }
        paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
      } while ((!paramh.b()) || (paramh.g() <= 0));
      this.c.setText(paramh.a(0, "1091"));
      return;
    } while (paramh != this.m);
    paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
    a();
    if (paramh.b())
    {
      a(paramh.a(0, "1208"), true);
      return;
    }
    c(paramh.d());
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
    setContentView(2130903481);
    this.i = ((DzhHeader)findViewById(2131558513));
    this.i.a(this, this);
    this.b = ((EditText)findViewById(2131560730));
    this.c = ((EditText)findViewById(2131560732));
    this.c.setFocusable(false);
    this.d = ((Spinner)findViewById(2131560734));
    paramBundle = new ArrayAdapter(this, 17367048, this.h);
    paramBundle.setDropDownViewResource(17367049);
    this.d.setAdapter(paramBundle);
    this.d.setVisibility(1);
    this.d.setOnItemSelectedListener(new ag(this));
    this.b.setFilters(new InputFilter[] { new InputFilter.LengthFilter(6) });
    this.b.addTextChangedListener(new ah(this));
    this.e = ((Button)findViewById(2131560743));
    this.e.setOnClickListener(new ai(this));
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (this == b.a().f()) {
      b(9);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\FundDividend.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */