package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.g;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import java.text.DecimalFormat;
import org.json.JSONException;
import org.json.JSONObject;

public class DailyEarning
  extends DelegateBaseActivity
  implements View.OnClickListener, cp, cs
{
  private com.android.dazhihui.a.b.u A;
  private com.android.dazhihui.a.b.u B;
  private com.android.dazhihui.a.b.f C;
  private com.android.dazhihui.a.b.u D;
  private com.android.dazhihui.a.b.u E;
  TextWatcher a = new q(this);
  private DzhHeader b;
  private TextView c;
  private TextView d;
  private TextView e;
  private TextView f;
  private EditText g;
  private Button h;
  private String i = "1000";
  private String j;
  private String m;
  private String n;
  private String o;
  private String p;
  private String q;
  private String r;
  private String s;
  private String t;
  private String u;
  private float v;
  private float w;
  private float x;
  private float y;
  private DecimalFormat z;
  
  private void b(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    this.B = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("12300").a("1552", "").h()) });
    registRequestListener(this.B);
    a(this.B, paramBoolean);
  }
  
  private void c(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    this.D = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("12298").a("1552", "").h()) });
    registRequestListener(this.D);
    a(this.D, paramBoolean);
  }
  
  private void d(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    this.E = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("12310").a("1552", "").h()) });
    registRequestListener(this.E);
    a(this.E, paramBoolean);
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
      continue;
      paramView = new Intent();
      paramView.setClass(this, DailyEarningDetail.class);
      startActivity(paramView);
    }
  }
  
  public void a()
  {
    this.h.setBackgroundDrawable(getResources().getDrawable(2130838909));
    this.h.setOnClickListener(this);
  }
  
  public void a(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    com.android.dazhihui.ui.delegate.b.h localh = o.g("12308");
    localh.a("1042", n.t(this.j)).a("1598", "").a("1737", this.i).a("1800", n.t(this.m)).a("1090", n.t(this.n)).a("1115", "").a("2002", "").a("1025", "").a("1552", "");
    this.A = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.h()) });
    registRequestListener(this.A);
    a(this.A, paramBoolean);
  }
  
  public void b()
  {
    this.h.setClickable(false);
    this.h.setBackgroundDrawable(getResources().getDrawable(2130839075));
  }
  
  public void c()
  {
    this.C = new com.android.dazhihui.a.b.f();
    this.C.c(com.android.dazhihui.a.f.x);
    registRequestListener(this.C);
    sendRequest(this.C);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 16424;
    paramct.d = "余额增值";
    paramct.e = "明细";
    paramct.p = this;
  }
  
  public void d()
  {
    if ((this.p == null) || (this.p.equals("")) || (this.q == null) || (this.q.equals("")))
    {
      this.f.setText("--");
      return;
    }
    this.w = Float.parseFloat(this.p);
    this.x = Float.parseFloat(this.q);
    this.v = (this.x * this.w / 10000.0F);
    String str = String.valueOf(this.z.format(this.v));
    this.d.setText(this.p + "元");
    this.f.setText(str);
  }
  
  public void d(String paramString)
  {
    paramString = this.r + "<font color='#FF0000'>" + paramString + "</font>" + this.t;
    this.c.setText(Html.fromHtml(paramString));
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.b = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    Object localObject1;
    if (paramh == this.C) {
      localObject1 = new String(((g)paramj).a());
    }
    try
    {
      localObject1 = new JSONObject((String)localObject1);
      JSONObject localJSONObject = ((JSONObject)localObject1).optJSONObject("data");
      this.q = localJSONObject.getString("mwfsy");
      this.u = localJSONObject.getString("espsy");
      double d1 = Double.parseDouble(this.u);
      this.e.setText(this.z.format(Double.valueOf(d1)) + "%");
      ((JSONObject)localObject1).optJSONObject("header").getString("vs");
      d(false);
      d();
      if (paramh == this.A)
      {
        localObject1 = ((v)paramj).b();
        if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, this))
        {
          localObject1 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
          if (!((com.android.dazhihui.ui.delegate.b.h)localObject1).b())
          {
            paramh = Toast.makeText(this, ((com.android.dazhihui.ui.delegate.b.h)localObject1).d(), 0);
            paramh.setGravity(17, 0, 0);
            paramh.show();
            return;
          }
        }
      }
    }
    catch (JSONException localJSONException)
    {
      do
      {
        do
        {
          do
          {
            for (;;)
            {
              localJSONException.printStackTrace();
            }
            this.g.setText("");
            b();
            d(this.i);
            Object localObject2 = Toast.makeText(this, localJSONException.a(0, "1208"), 0);
            ((Toast)localObject2).setGravity(17, 0, 0);
            ((Toast)localObject2).show();
            b(false);
            if (paramh == this.B)
            {
              localObject2 = ((v)paramj).b();
              if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject2, this))
              {
                localObject2 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject2).e());
                c(false);
                if (!((com.android.dazhihui.ui.delegate.b.h)localObject2).b())
                {
                  paramh = Toast.makeText(this, ((com.android.dazhihui.ui.delegate.b.h)localObject2).d(), 0);
                  paramh.setGravity(17, 0, 0);
                  paramh.show();
                  return;
                }
                if (((com.android.dazhihui.ui.delegate.b.h)localObject2).f() != null)
                {
                  this.m = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1800");
                  this.n = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1090");
                  this.o = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1737");
                }
                d(this.o);
              }
            }
            if (paramh == this.D)
            {
              localObject2 = ((v)paramj).b();
              if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject2, this))
              {
                localObject2 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject2).e());
                if (!((com.android.dazhihui.ui.delegate.b.h)localObject2).b())
                {
                  paramh = Toast.makeText(this, ((com.android.dazhihui.ui.delegate.b.h)localObject2).d(), 0);
                  paramh.setGravity(17, 0, 0);
                  paramh.show();
                  return;
                }
                this.j = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1042");
              }
            }
          } while (paramh != this.E);
          paramh = ((v)paramj).b();
        } while (!com.android.dazhihui.ui.delegate.b.u.a(paramh, this));
        paramh = com.android.dazhihui.ui.delegate.b.h.b(paramh.e());
        if (!paramh.b())
        {
          paramh = Toast.makeText(this, paramh.d(), 0);
          paramh.setGravity(17, 0, 0);
          paramh.show();
          return;
        }
      } while (!paramh.b());
      if (paramh.g() == 0)
      {
        this.p = null;
        return;
      }
      this.p = paramh.a(0, "1266");
      d();
    }
  }
  
  protected void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    setContentView(2130903085);
    this.b = ((DzhHeader)findViewById(2131558567));
    this.b.a(this, this);
    c();
    b(false);
    this.e = ((TextView)findViewById(2131558767));
    this.f = ((TextView)findViewById(2131558768));
    this.g = ((EditText)findViewById(2131558770));
    this.c = ((TextView)findViewById(2131558771));
    this.d = ((TextView)findViewById(2131558769));
    this.z = new DecimalFormat("0.00");
    this.r = "可取资金中超出";
    this.s = "1000.00";
    this.t = "元的闲散资金每日16:00后会自动买入天天盈产品";
    d(this.s);
    this.h = ((Button)findViewById(2131558583));
    this.h.setClickable(false);
    if (!this.h.isClickable()) {
      this.h.setBackgroundDrawable(getResources().getDrawable(2130839075));
    }
    for (;;)
    {
      this.g.addTextChangedListener(this.a);
      return;
      a();
    }
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    }
    this.y = Float.parseFloat(this.i);
    if (this.y < 1000.0F)
    {
      Toast.makeText(this, "预留金额最少为1000~~", 1).show();
      return;
    }
    a(true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\DailyEarning.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */