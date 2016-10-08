package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.d.a.a;
import com.android.dazhihui.d.a.b;
import com.android.dazhihui.d.n;
import com.android.dazhihui.d.r;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.w;

public class NormalRegisterScreen
  extends BaseActivity
  implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, cp, cs
{
  private EditText a;
  private EditText b;
  private ImageView c;
  private CheckBox d;
  private CheckBox e;
  private TextView f;
  private TextView g;
  private boolean h = false;
  private String i = "FROM_STOCK";
  private String j;
  private String k;
  private String l;
  private byte[] m;
  private Button n;
  private DzhHeader o;
  private m p = null;
  private m q = null;
  
  private void a()
  {
    this.a.addTextChangedListener(new nn(this));
    this.b.addTextChangedListener(new no(this));
    this.a.setOnFocusChangeListener(new np(this));
  }
  
  private void a(String paramString)
  {
    x localx1 = new x(2972);
    localx1.b(2);
    x localx2 = new x(143);
    localx2.a(paramString);
    localx1.a(localx2);
    this.p = new m(localx1);
    registRequestListener(this.p);
    sendRequest(this.p);
  }
  
  private void b() {}
  
  private void c()
  {
    x localx1 = new x(2972);
    localx1.b(2);
    x localx2 = new x(126);
    localx2.a(this.j);
    if (this.m == null) {}
    for (byte[] arrayOfByte = "".getBytes();; arrayOfByte = this.m)
    {
      this.m = arrayOfByte;
      localx2.a(this.m, 0);
      localx1.a(localx2);
      this.q = new m(localx1);
      registRequestListener(this.q);
      sendRequest(this.q);
      return;
    }
  }
  
  private void d()
  {
    if (this.n == null) {
      return;
    }
    this.n.setBackgroundResource(2130838338);
    this.n.setTextColor(getResources().getColor(2131493077));
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
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 4392;
    paramct.p = this;
    paramct.d = getResources().getString(2131166399);
  }
  
  public void getTitle(DzhHeader paramDzhHeader) {}
  
  public void handleResponse(h paramh, j paramj)
  {
    if ((paramj instanceof o))
    {
      paramh = ((o)paramj).h();
      if ((paramh != null) && (paramh.b != null) && (paramh.a == 2972))
      {
        paramh = new q(paramh.b);
        paramh.b();
        i1 = paramh.e();
        paramh.e();
        paramh.e();
        if (i1 != 143) {
          break label141;
        }
        i1 = paramh.b();
        n.c("nickReslut: " + i1);
        this.h = false;
        if (i1 == 1)
        {
          this.f.setVisibility(0);
          this.f.setText(getResources().getString(2131165999));
          d();
        }
      }
    }
    label141:
    while (i1 != 126) {
      return;
    }
    int i1 = paramh.b();
    if (i1 == 0)
    {
      w.a().b(this.j);
      w.a().e(this.l);
      paramj = d.a();
      paramj.a("USER_RSA_PWD", w.a().j());
      paramj.g();
      paramj.a("USER_MD5_PWD", w.a().i());
      paramj.g();
      paramj.a("USER_NAME", w.a().f());
      paramj.g();
      w.a().a(-1);
      w.a().g("");
      w.a().b(0);
      paramh.l();
      i1 = paramh.h();
      paramh = new Intent(this, RegisterSuccessScreen.class);
      paramh.putExtra("type", 0);
      paramh.putExtra("REGISTER_FROM_TYPE", this.i);
      paramh.putExtra("COINS", i1);
      startActivity(paramh);
      finish();
      return;
    }
    if (i1 == 1)
    {
      this.f.setVisibility(0);
      this.f.setText(getResources().getString(2131165999));
      d();
      return;
    }
    if (i1 == 3)
    {
      paramh = w.a().s();
      paramh.a(new nq(this, this));
      sendRequest(paramh);
      return;
    }
    showShortToast(getResources().getString(2131166388));
  }
  
  public void handleTimeout(h paramh) {}
  
  public void init(Bundle paramBundle)
  {
    setContentView(2130903580);
    paramBundle = getIntent();
    if (paramBundle != null) {
      this.i = paramBundle.getStringExtra("REGISTER_FROM_TYPE");
    }
    this.o = ((DzhHeader)findViewById(2131558567));
    this.o.setOnHeaderButtonClickListener(this);
    this.o.a(this, this);
    if ((!TextUtils.isEmpty(this.i)) && (this.i.equals("FROM_LOTTERY"))) {
      this.o.setBackgroundResource(2130838345);
    }
    this.a = ((EditText)findViewById(2131561318));
    this.b = ((EditText)findViewById(2131561319));
    this.d = ((CheckBox)findViewById(2131560396));
    this.e = ((CheckBox)findViewById(2131560399));
    this.f = ((TextView)findViewById(2131561320));
    this.g = ((TextView)findViewById(2131561321));
    this.c = ((ImageView)findViewById(2131559701));
    this.d.setOnCheckedChangeListener(this);
    paramBundle = (TextView)findViewById(2131560398);
    TextView localTextView = (TextView)findViewById(2131559711);
    ImageView localImageView = (ImageView)findViewById(2131559701);
    this.n = ((Button)findViewById(2131561322));
    paramBundle.setOnClickListener(this);
    localTextView.setOnClickListener(this);
    localImageView.setOnClickListener(this);
    this.n.setOnClickListener(this);
    a();
    b();
  }
  
  public void netException(h paramh, Exception paramException) {}
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    switch (paramCompoundButton.getId())
    {
    default: 
      return;
    }
    if (this.d.isChecked()) {
      this.b.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
    }
    for (;;)
    {
      this.b.postInvalidate();
      return;
      this.b.setTransformationMethod(PasswordTransformationMethod.getInstance());
    }
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
    case 2131561322: 
    case 2131559701: 
      do
      {
        do
        {
          return;
        } while ((this.f.getVisibility() == 0) || (this.g.getVisibility() == 0));
        if (!this.e.isChecked())
        {
          showShortToast(getResources().getString(2131165257));
          return;
        }
        if ((this.a == null) || (TextUtils.isEmpty(this.a.getText())))
        {
          this.f.setVisibility(0);
          this.f.setText(getResources().getString(2131166395));
          d();
          return;
        }
        if ((this.b == null) || (TextUtils.isEmpty(this.b.getText())))
        {
          this.g.setVisibility(0);
          this.g.setText(getResources().getString(2131166152));
          d();
          return;
        }
        paramView = this.b.getText().toString().trim();
        if ((paramView.length() < 4) || (paramView.length() > 19))
        {
          this.g.setVisibility(0);
          this.g.setText(getResources().getString(2131166154));
          d();
          return;
        }
        if (n.s(paramView))
        {
          this.g.setVisibility(0);
          this.g.setText("格式错误");
          d();
          return;
        }
        this.j = this.a.getText().toString();
        if ((this.j.length() < 4) || (this.j.length() > 20))
        {
          this.f.setVisibility(0);
          this.f.setText(getResources().getString(2131166000));
          d();
          return;
        }
        this.l = this.b.getText().toString();
        paramView = g.a().k();
        this.k = a.a(this.l);
        this.m = paramView.a(this.l.getBytes());
        c();
        n.a("", 1318);
        return;
      } while (this.a == null);
      this.a.setText("");
      return;
    case 2131560398: 
      r.a(this, null, "http://pay.gw.com.cn/rulesregister.jsp", null);
      return;
    }
    startActivity(new Intent("android.intent.action.DIAL", Uri.parse(getResources().getString(2131165304))));
  }
  
  protected void onFinish() {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\NormalRegisterScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */