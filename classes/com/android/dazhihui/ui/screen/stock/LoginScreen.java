package com.android.dazhihui.ui.screen.stock;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.f;
import com.android.dazhihui.b;
import com.android.dazhihui.c;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.d.a.a;
import com.android.dazhihui.d.n;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.w;

public class LoginScreen
  extends BaseActivity
  implements View.OnClickListener, b, cp, cs
{
  private String a = "FROM_STOCK";
  private EditText b;
  private EditText c;
  private ImageView d;
  private ImageView e;
  private d f;
  private String g;
  private String h;
  private final String i = "******";
  private DzhHeader j;
  private w k;
  
  private void a()
  {
    if (!TextUtils.isEmpty(this.b.getText())) {
      this.d.setVisibility(0);
    }
    this.b.addTextChangedListener(new hb(this));
    this.c.addTextChangedListener(new hc(this));
  }
  
  private void b()
  {
    w.a().b(this.g);
    if (!w.a().i().equals(a.a("******"))) {
      w.a().e(this.h);
    }
    w.a().b(false);
    c();
    getLoadingDialog().show();
  }
  
  private void c()
  {
    if (this.j != null) {
      this.j.a();
    }
  }
  
  private void d()
  {
    if (this.j != null) {
      this.j.b();
    }
  }
  
  public boolean OnChildClick(View paramView)
  {
    switch (((Integer)paramView.getTag()).intValue())
    {
    }
    for (;;)
    {
      return false;
      finish();
    }
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (hd.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.j == null);
      this.j.a(paramy);
      return;
    } while (this.j == null);
    this.j.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 4392;
    paramct.p = this;
    paramct.d = getResources().getString(2131165410);
  }
  
  public void getTitle(DzhHeader paramDzhHeader) {}
  
  public void handleResponse(h paramh, j paramj)
  {
    d();
    getLoadingDialog().dismiss();
  }
  
  public void handleTimeout(h paramh)
  {
    d();
    getLoadingDialog().dismiss();
  }
  
  protected void init(Bundle paramBundle)
  {
    setContentView(2130903247);
    paramBundle = getIntent();
    this.f = d.a();
    this.k = w.a();
    w.a().a(c.a);
    w.a().a(this);
    if (paramBundle != null) {
      this.a = paramBundle.getStringExtra("REGISTER_FROM_TYPE");
    }
    this.j = ((DzhHeader)findViewById(2131558567));
    this.j.setOnHeaderButtonClickListener(this);
    this.j.a(this, this);
    if ((!TextUtils.isEmpty(this.a)) && (this.a.equals("FROM_LOTTERY"))) {
      this.j.setBackgroundResource(2130838345);
    }
    paramBundle = (TextView)findViewById(2131559707);
    paramBundle.getPaint().setFlags(8);
    paramBundle.getPaint().setAntiAlias(true);
    paramBundle.setOnClickListener(this);
    paramBundle = (TextView)findViewById(2131559711);
    this.d = ((ImageView)findViewById(2131559701));
    this.e = ((ImageView)findViewById(2131559704));
    paramBundle.setOnClickListener(this);
    this.d.setOnClickListener(this);
    this.e.setOnClickListener(this);
    m.a().e(0);
    g.a().f(0);
    paramBundle = (Button)findViewById(2131559710);
    TextView localTextView1 = (TextView)findViewById(2131559709);
    TextView localTextView2 = (TextView)findViewById(2131559708);
    localTextView2.getPaint().setFlags(8);
    localTextView2.getPaint().setAntiAlias(true);
    localTextView1.setOnClickListener(this);
    localTextView2.setOnClickListener(this);
    this.b = ((EditText)findViewById(2131559702));
    this.c = ((EditText)findViewById(2131559705));
    if (!TextUtils.isEmpty(w.a().f())) {
      this.b.setText(w.a().f());
    }
    a();
    paramBundle.setOnClickListener(this);
  }
  
  public void loginStatusChange(c paramc)
  {
    int m;
    if (paramc == c.b)
    {
      d();
      getLoadingDialog().dismiss();
      m = this.k.m();
      if (m != 0) {
        break label35;
      }
      finish();
    }
    label35:
    while (m != 1) {
      return;
    }
  }
  
  public void netException(h paramh, Exception paramException)
  {
    d();
    getLoadingDialog().dismiss();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 == -1) {
      finish();
    }
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    case 2131559702: 
    case 2131559703: 
    case 2131559705: 
    case 2131559706: 
    default: 
    case 2131559710: 
      do
      {
        return;
        n.a("", 1315);
        this.g = this.b.getText().toString().trim();
        this.h = this.c.getText().toString().trim();
        this.f.a("MARK_NAME", m.a().j());
        this.f.g();
        this.f.a("AUTO_LOGIN", g.a().p());
        this.f.g();
        if ((this.g.length() > 50) || (this.h.length() > 20))
        {
          showShortToast(2131166368);
          this.b.setText("");
          this.c.setText("");
          return;
        }
        if ((this.g.length() <= 0) || (this.h.length() <= 0))
        {
          showShortToast(2131165681);
          return;
        }
        paramView = (InputMethodManager)getSystemService("input_method");
        paramView.hideSoftInputFromWindow(this.c.getWindowToken(), 2);
        paramView.hideSoftInputFromWindow(this.b.getWindowToken(), 2);
        b();
      } while (!o.r());
      o.u();
      return;
    case 2131559711: 
      startActivity(new Intent("android.intent.action.DIAL", Uri.parse(getResources().getString(2131165304))));
      return;
    case 2131559701: 
      this.b.setText("");
      return;
    case 2131559704: 
      this.c.setText("");
      return;
    case 2131559709: 
      paramView = new Intent(this, SetPwdScreen.class);
      paramView.putExtra("REGISTER_FROM_TYPE", this.a);
      paramView.putExtra(SetPwdScreen.h, true);
      startActivity(paramView);
      return;
    case 2131559708: 
      n.a("", 1314);
      new gx().a(this);
      return;
    }
    paramView = new Intent(this, BrowserActivity.class);
    Bundle localBundle = new Bundle();
    localBundle.putString("nexturl", f.d);
    localBundle.putString("names", getResources().getString(2131166195));
    localBundle.putInt("api_type", 100);
    paramView.putExtras(localBundle);
    startActivity(paramView);
  }
  
  protected void onDestroy()
  {
    w.a().b(this);
    super.onDestroy();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\LoginScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */