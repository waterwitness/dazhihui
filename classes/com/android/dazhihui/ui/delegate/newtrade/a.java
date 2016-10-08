package com.android.dazhihui.ui.delegate.newtrade;

import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.k;
import com.android.dazhihui.a.b.l;
import com.android.dazhihui.ui.delegate.b.g;

public class a
  extends com.android.dazhihui.ui.delegate.newtrade.screen.b
{
  private View a = null;
  private TextView d;
  private Button e;
  private k f = null;
  
  private void c()
  {
    this.d = ((TextView)this.a.findViewById(2131558645));
    this.e = ((Button)this.a.findViewById(2131558520));
  }
  
  private void d()
  {
    this.e.setOnClickListener(new b(this));
  }
  
  private void e()
  {
    String str = ((CaptialAnalMainScreen)getActivity()).a;
    TextView localTextView = this.d;
    if (str != null) {}
    for (;;)
    {
      localTextView.setText(str);
      return;
      str = "";
    }
  }
  
  public void b()
  {
    this.f = new k(new com.android.dazhihui.ui.delegate.newtrade.a.b[] { new com.android.dazhihui.ui.delegate.newtrade.a.b(com.android.dazhihui.ui.delegate.newtrade.a.a.a("18800").a("1026", "0").i()) });
    registRequestListener(this.f);
    a(this.f, true);
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    paramj = ((l)paramj).b();
    if (com.android.dazhihui.ui.delegate.newtrade.a.b.a(paramj, getActivity()))
    {
      g.b(paramj.d());
      paramj = com.android.dazhihui.ui.delegate.b.h.a(paramj.d());
      if (paramh == this.f)
      {
        if (paramj.b()) {
          break label65;
        }
        showShortToast(paramj.d());
      }
    }
    return;
    label65:
    new AlertDialog.Builder(getActivity()).setTitle("提示").setMessage(paramj.a("1208")).setPositiveButton("确定", new c(this)).setCancelable(false).show();
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    super.handleTimeout(paramh);
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    this.a = paramLayoutInflater.inflate(2130903066, paramViewGroup, false);
    c();
    d();
    e();
    return this.a;
  }
  
  public void show()
  {
    super.show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */