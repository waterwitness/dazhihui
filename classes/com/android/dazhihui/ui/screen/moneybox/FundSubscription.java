package com.android.dazhihui.ui.screen.moneybox;

import android.content.Context;
import android.content.Intent;
import android.inputmethodservice.KeyboardView.OnKeyboardActionListener;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.dazhihui.a.b.g;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.b.b;
import com.android.dazhihui.c.a.a;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public class FundSubscription
  extends DelegateBaseActivity
{
  private KeyboardView.OnKeyboardActionListener A = new z(this);
  com.android.dazhihui.a.b.u a;
  com.android.dazhihui.a.b.u b;
  com.android.dazhihui.a.b.u c;
  com.android.dazhihui.a.b.u d;
  com.android.dazhihui.a.b.u e;
  m f;
  Handler g = new v(this);
  RadioGroup h;
  RadioButton i;
  RadioButton j;
  Button m;
  EditText n;
  TextView o;
  TextView p;
  private RelativeLayout q;
  private ImageView r;
  private TextView s;
  private boolean t;
  private double u = 0.0D;
  private String v = "";
  private int w = 0;
  private String x;
  private String y = "";
  private String z = "";
  
  private void a(double paramDouble)
  {
    this.i.setText("全仓    " + o.p(String.valueOf(paramDouble)));
    int k = (int)paramDouble / 2 / 100;
    this.j.setText("半仓    " + k * 100);
    b(paramDouble);
  }
  
  private void b(double paramDouble)
  {
    int k = (int)paramDouble / 100;
    this.n.setText(o.p(String.valueOf(k * 100)));
    this.n.setSelection(this.n.getText().length());
  }
  
  private void d(String paramString)
  {
    if (!o.r()) {}
    do
    {
      do
      {
        return;
      } while (paramString == null);
      if (paramString.equals("11140"))
      {
        paramString = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g(paramString).a("1206", "0").a("1277", "100").a("1217", "1").a("1036", "").a("1026", "2").h()) });
        registRequestListener(paramString);
        a(paramString, true);
        this.t = true;
        return;
      }
      if (paramString.equals("11134"))
      {
        paramString = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g(paramString).a("1206", "0").a("1277", "100").a("1036", "").a("1026", "2").h()) });
        registRequestListener(paramString);
        a(paramString, true);
        this.t = true;
        return;
      }
      if (paramString.equals("12426"))
      {
        paramString = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g(paramString).h()) });
        registRequestListener(paramString);
        a(paramString, true);
        this.t = true;
        return;
      }
      if (paramString.equals("12432"))
      {
        paramString = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g(paramString).h()) });
        registRequestListener(paramString);
        a(paramString, true);
        this.t = true;
        return;
      }
    } while (!paramString.equals("12344"));
    paramString = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g(paramString).h()) });
    registRequestListener(paramString);
    a(paramString, true);
    this.t = true;
  }
  
  private void f()
  {
    this.q = ((RelativeLayout)findViewById(2131560063));
    this.r = ((ImageView)this.q.findViewById(2131560068));
    this.r.setVisibility(0);
    this.s = ((TextView)this.q.findViewById(2131560069));
    this.s.setVisibility(0);
    this.h = ((RadioGroup)findViewById(2131560075));
    this.m = ((Button)findViewById(2131559744));
    this.m.setOnClickListener(new x(this));
    this.n = ((EditText)findViewById(2131559741));
    this.o = ((TextView)findViewById(2131559592));
    int k = 0;
    for (;;)
    {
      if (k < ae.g.size())
      {
        if (((String[])ae.g.get(k))[1].equals(ae.k))
        {
          this.o.setText(((String[])ae.g.get(k))[0] + "(" + ((String[])ae.g.get(k))[1] + ")");
          this.v = ((String[])ae.g.get(k))[1];
        }
      }
      else
      {
        this.p = ((TextView)findViewById(2131559621));
        this.p.setText(o.p());
        this.i = ((RadioButton)findViewById(2131560076));
        this.j = ((RadioButton)findViewById(2131560077));
        y localy = new y(this);
        this.i.setOnClickListener(localy);
        this.j.setOnClickListener(localy);
        this.i.performClick();
        return;
      }
      k += 1;
    }
  }
  
  private void g()
  {
    this.s.setText("申购");
    this.r.setOnClickListener(new aa(this));
  }
  
  private void h()
  {
    com.android.dazhihui.a.b.x localx1 = new com.android.dazhihui.a.b.x(3007);
    localx1.b(2);
    com.android.dazhihui.a.b.x localx2 = new com.android.dazhihui.a.b.x(161);
    localx2.a(com.android.dazhihui.w.a().f());
    localx2.a(com.android.dazhihui.w.a().j(), 0);
    localx2.a(this.z);
    localx2.a("304");
    localx2.a(o.z[this.w][1]);
    localx1.a(localx2);
    this.f = new m(localx1);
    registRequestListener(this.f);
    sendRequest(this.f);
    this.t = true;
  }
  
  public void a()
  {
    ah localah = new ah(this, "提示", o.p() + "暂未开通权限，您可尝试其他券商。");
    localah.a("了解详情", new w(this, localah));
    localah.show();
  }
  
  public void a(Context paramContext, String paramString1, String paramString2, int paramInt)
  {
    paramContext = new ah(paramContext, paramString1, paramString2);
    paramContext.a("确定", new ac(this, paramInt, paramContext));
    paramContext.b("取消", new ad(this, paramInt, paramContext));
    paramContext.show();
  }
  
  public void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt)
  {
    paramContext = new ah(paramContext, paramString1, paramString2);
    paramContext.a(paramString3, new ab(this, paramInt, paramContext));
    paramContext.show();
  }
  
  public void a(Class<?> paramClass)
  {
    Intent localIntent = new Intent();
    localIntent.setClass(this, paramClass);
    startActivity(localIntent);
  }
  
  public void b()
  {
    if (!o.r()) {
      return;
    }
    this.d = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11104").a("1028", "0").a("1234", "1").h()) });
    registRequestListener(this.d);
    a(this.d, true);
  }
  
  public void c()
  {
    if (!o.r()) {
      return;
    }
    this.c = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11102").a("1003", "").a("1036", this.v).h()) });
    registRequestListener(this.c);
    a(this.c, true);
  }
  
  public void d()
  {
    if (!o.r()) {}
    Object localObject2;
    String str;
    do
    {
      do
      {
        return;
      } while ((ae.i <= -1) || (ae.j <= -1));
      localObject2 = ae.h[ae.i].b[ae.j][1];
      double d1 = Double.parseDouble(ae.h[ae.i].b[ae.j][2]);
      str = BigDecimal.valueOf(Double.parseDouble(this.n.getText().toString())).multiply(BigDecimal.valueOf(d1)).toString();
      if (((String)localObject2).equals("1"))
      {
        localObject2 = o.g("12018").a("1026", 0).a("1021", o.z[this.w][0]).a("1019", o.z[this.w][1]);
        if (this.x == null) {}
        for (localObject1 = "0";; localObject1 = this.x)
        {
          this.b = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(((com.android.dazhihui.ui.delegate.b.h)localObject2).a("1003", (String)localObject1).a("1036", this.v).a("1041", "").a("1040", str).h()) });
          registRequestListener(this.b);
          a(this.b, true);
          return;
        }
      }
      if (((String)localObject2).equals("2"))
      {
        localObject2 = o.g("11116").a("1026", 0).a("1021", o.z[this.w][0]).a("1019", o.z[this.w][1]);
        if (this.x == null) {}
        for (localObject1 = "0";; localObject1 = this.x)
        {
          this.a = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(((com.android.dazhihui.ui.delegate.b.h)localObject2).a("1003", (String)localObject1).a("1036", this.v).a("1041", this.y).a("1029", "1").a("1040", str).h()) });
          registRequestListener(this.a);
          a(this.a, true);
          return;
        }
      }
      if (((String)localObject2).equals("3"))
      {
        this.e = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("12342").a("1026", 0).a("1021", o.z[this.w][0]).a("1019", o.z[this.w][1]).a("1036", this.v).a("1040", str).a("1945", "1").h()) });
        registRequestListener(this.e);
        a(this.e, true);
        return;
      }
    } while ((!((String)localObject2).equals("4")) && (!((String)localObject2).equals("5")) && (!((String)localObject2).equals("6")));
    Object localObject1 = "1";
    if (((String)localObject2).equals("5")) {
      localObject1 = "4";
    }
    for (;;)
    {
      localObject1 = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("12424").a("1026", 0).a("1906", (String)localObject1).a("1021", o.z[this.w][0]).a("1019", o.z[this.w][1]).a("1036", this.v).a("1040", str).h()) });
      registRequestListener((com.android.dazhihui.a.b.h)localObject1);
      a((com.android.dazhihui.a.b.h)localObject1, true);
      return;
      if (((String)localObject2).equals("6")) {
        localObject1 = "3";
      }
    }
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    int i2 = 1;
    int i1 = 1;
    int k = 0;
    super.handleResponse(paramh, paramj);
    if (paramh == this.f)
    {
      paramh = ((g)paramj).a();
      if (paramh != null)
      {
        paramh = new q(paramh);
        paramh.b();
        k = paramh.e();
        paramh.e();
        paramh.e();
        if (k != 161) {
          return;
        }
        this.t = false;
        k = paramh.b();
        if ((k == 0) || (k == 2))
        {
          paramh = paramh.l();
          try
          {
            paramj = new JSONObject(paramh).getJSONObject("BizData").getString("CoinQuantity");
            paramh = paramj;
            if (paramj == null) {
              paramh = "";
            }
            paramj = "恭喜您获赠" + paramh + "智慧币！";
            if (k == 2) {
              paramj = "您已经获赠" + paramh + "智慧币！";
            }
            a(this, "提示", paramj, "确定", 1);
            if (a.J == null) {
              a.J = (String[][])Array.newInstance(String.class, new int[] { 1, 2 });
            }
            for (;;)
            {
              a.J[(a.J.length - 1)][0] = o.p();
              a.J[(a.J.length - 1)][1] = o.z[this.w][1];
              paramh = new a(this);
              paramh.a(45);
              paramh.close();
              return;
              paramh = a.J;
              a.J = (String[][])null;
              a.J = (String[][])Array.newInstance(String.class, new int[] { paramh.length + 1, 2 });
              System.arraycopy(paramh, 0, a.J, 0, paramh.length);
            }
            finish();
          }
          catch (JSONException paramh)
          {
            paramh.printStackTrace();
            finish();
            return;
          }
        }
        return;
      }
    }
    this.t = false;
    if ((paramj instanceof com.android.dazhihui.a.b.v))
    {
      paramh = ((com.android.dazhihui.a.b.v)paramj).b();
      if (com.android.dazhihui.ui.delegate.b.u.a(paramh, this))
      {
        paramh = com.android.dazhihui.ui.delegate.b.h.b(paramh.e());
        switch (Integer.parseInt(paramh.a()))
        {
        default: 
          return;
        case 11103: 
          if (paramh.g() == 0) {
            return;
          }
          paramj = paramh.a(0, "1021");
          i2 = o.z.length;
          k = 0;
          if (k < i2) {
            if (o.z[k][0].equals(paramj))
            {
              String str = o.z[k][2];
              if ((str != null) && (str.equals("1")))
              {
                this.w = k;
                k = i1;
                if (k == 0)
                {
                  k = 0;
                  if (k < i2)
                  {
                    if (!o.z[k][0].equals(paramj)) {
                      break label972;
                    }
                    this.w = k;
                  }
                }
                this.x = paramh.a(0, "1021");
                paramh.a(0, "1156");
                this.y = paramh.a(0, "1167");
                if ((this.y == null) || (this.y.length() == 0) || (Double.parseDouble(this.y) == 0.0D)) {
                  this.y = paramh.a(0, "1181");
                }
                if ((this.y == null) || (this.y.length() == 0) || (Double.parseDouble(this.y) == 0.0D)) {
                  this.y = paramh.a(0, "1178");
                }
                if ((this.y != null) && (this.y.length() != 0) && (Double.parseDouble(this.y) != 0.0D)) {
                  return;
                }
                this.y = "";
                return;
              }
            }
          }
          break;
        case 11105: 
          label648:
          label656:
          i1 = paramh.g();
          if (i1 > 0)
          {
            k = 0;
            if (k >= i1) {
              break label1221;
            }
            paramj = paramh.a(k, "1415");
            if ((paramj == null) || (!paramj.equals("1"))) {
              break label935;
            }
          }
          break;
        }
        for (;;)
        {
          paramh = paramh.a(k, "1078");
          if (paramh != null)
          {
            this.u = Double.parseDouble(paramh);
            this.u = ((int)this.u / 100 * 100);
            a(this.u);
          }
          for (;;)
          {
            this.g.sendEmptyMessage(0);
            return;
            label935:
            k += 1;
            break;
            this.u = 0.0D;
            a(0.0D);
          }
          this.w = k;
          k += 1;
          break;
          label972:
          k += 1;
          break label656;
          if (paramh.b())
          {
            paramh = "　　下单成功，您可在委托中查询成交。";
            if (a.J == null) {
              break label1209;
            }
            k = 0;
            if (k >= a.J.length) {
              break label1209;
            }
            if ((a.J[k][0].equals(o.p())) && (a.J[k][1].equals(o.z[this.w][1]))) {
              k = i2;
            }
          }
          for (;;)
          {
            paramj = paramh;
            if (paramh == null) {
              paramj = "";
            }
            a(this, "提示", paramj, "确定", k);
            return;
            k += 1;
            break;
            paramh = paramh.d();
            k = i2;
            continue;
            if (!paramh.b())
            {
              paramj = paramh.d();
              paramh = paramj;
              if (paramj == null) {
                paramh = "";
              }
              a(this, "提示", paramh, "确定", 1);
              return;
            }
            i1 = paramh.g();
            if (i1 > 0) {
              while (k < i1)
              {
                paramj = paramh.a(k, "1036");
                if ((paramj != null) && (paramj.equals(this.v)))
                {
                  this.g.sendEmptyMessage(1);
                  return;
                }
                k += 1;
              }
            }
            a(this, "提示", "未成交，是否重新下单？", 3);
            return;
            label1209:
            k = 2;
          }
          k = 0;
          break label648;
          label1221:
          k = 0;
        }
      }
    }
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    super.handleTimeout(paramh);
    if (this == b.a().f()) {
      b(1);
    }
    if (this.t)
    {
      this.t = false;
      a(this, "提示", "查询超时，请稍后重试。", 4);
    }
  }
  
  public void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    if (!ae.a(o.p()))
    {
      a();
      return;
    }
    setContentView(2130903325);
    f();
    g();
    b();
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (this == b.a().f()) {
      b(9);
    }
    if (this.t)
    {
      this.t = false;
      a(this, "提示", "查询超时，请稍后重试。", 4);
    }
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
  }
  
  public void onOptionMenuSelect(int paramInt) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\moneybox\FundSubscription.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */