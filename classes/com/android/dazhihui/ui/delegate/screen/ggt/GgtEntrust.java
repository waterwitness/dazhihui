package com.android.dazhihui.ui.delegate.screen.ggt;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.b.b;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class GgtEntrust
  extends DelegateBaseActivity
  implements cp, cs
{
  private CustomTextView A;
  private CustomTextView B;
  private CustomTextView C;
  private CustomTextView D;
  private int E = 20;
  private int F = 0;
  private int G = 0;
  private int H = 0;
  private int I = 0;
  private String[][] J = (String[][])null;
  private int[][] K = (int[][])null;
  private int L = 0;
  private int M = 0;
  private String N;
  private String O;
  private String P = "0";
  private String Q = "0";
  private String R = "";
  private String S = "";
  private String T = "";
  private int U = 0;
  private String V = "";
  private String W = "";
  private String X = "";
  private boolean Y = true;
  private DzhHeader a;
  private boolean aa = false;
  private int ab = 0;
  private int ac;
  private String ad;
  private com.android.dazhihui.a.b.u ae;
  private com.android.dazhihui.a.b.u af;
  private com.android.dazhihui.a.b.u ag;
  private com.android.dazhihui.a.b.u ah;
  private Handler ai = new n(this);
  private Spinner b;
  private EditText c;
  private CustomTextView d;
  private Spinner e;
  private EditText f;
  private EditText g;
  private ImageView h;
  private ImageView i;
  private ImageView j;
  private ImageView m;
  private TextView n;
  private TextView o;
  private TextView p;
  private Button q;
  private Button r;
  private CustomTextView s;
  private CustomTextView t;
  private CustomTextView u;
  private CustomTextView v;
  private ImageView w;
  private TextView x;
  private TextView y;
  private TextView z;
  
  private String a(double paramDouble)
  {
    BigDecimal localBigDecimal;
    if (paramDouble > 1.0E8D)
    {
      localBigDecimal = new BigDecimal(paramDouble / 1.0E8D);
      return "￥" + localBigDecimal.setScale(4, 4).doubleValue() + "亿";
    }
    if (paramDouble > 10000.0D)
    {
      localBigDecimal = new BigDecimal(paramDouble / 10000.0D);
      return "￥" + localBigDecimal.setScale(2, 4).doubleValue() + "万";
    }
    return "￥" + paramDouble;
  }
  
  private void a()
  {
    this.a = ((DzhHeader)findViewById(2131558513));
    this.b = ((Spinner)findViewById(2131559139));
    this.c = ((EditText)findViewById(2131559140));
    this.d = ((CustomTextView)findViewById(2131559141));
    this.e = ((Spinner)findViewById(2131559142));
    this.f = ((EditText)findViewById(2131559145));
    this.g = ((EditText)findViewById(2131559151));
    this.h = ((ImageView)findViewById(2131559144));
    this.i = ((ImageView)findViewById(2131559146));
    this.j = ((ImageView)findViewById(2131559150));
    this.m = ((ImageView)findViewById(2131559152));
    this.n = ((TextView)findViewById(2131559147));
    this.o = ((TextView)findViewById(2131559148));
    this.p = ((TextView)findViewById(2131559149));
    this.q = ((Button)findViewById(2131559153));
    this.r = ((Button)findViewById(2131559154));
    this.s = ((CustomTextView)findViewById(2131559166));
    this.t = ((CustomTextView)findViewById(2131559164));
    this.u = ((CustomTextView)findViewById(2131559165));
    this.v = ((CustomTextView)findViewById(2131559167));
    this.w = ((ImageView)findViewById(2131559156));
    this.x = ((TextView)findViewById(2131559157));
    this.y = ((TextView)findViewById(2131559158));
    this.z = ((TextView)findViewById(2131559159));
    this.A = ((CustomTextView)findViewById(2131559162));
    this.B = ((CustomTextView)findViewById(2131559163));
    this.C = ((CustomTextView)findViewById(2131559160));
    this.D = ((CustomTextView)findViewById(2131559161));
  }
  
  private void a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      Toast.makeText(this, "请输入股票代码、价格和数量。", 0).show();
      return;
    case 1: 
      Toast.makeText(this, "请输入5位股票代码。", 0).show();
      return;
    }
    Toast.makeText(this, "没有股东账号，无法完成委托。", 0).show();
  }
  
  private void b()
  {
    c();
    d();
    this.ac = 3050;
    Object localObject2 = getIntent().getExtras();
    this.M = ((Bundle)localObject2).getInt("type");
    Button localButton = this.q;
    if (this.M == 0)
    {
      localObject1 = "买入";
      localButton.setText((CharSequence)localObject1);
      this.N = ((Bundle)localObject2).getString("codes");
      this.O = ((Bundle)localObject2).getString("saccount");
      if (this.M != 0) {
        break label229;
      }
      localObject1 = "委托买入";
      label88:
      this.ad = ((String)localObject1);
      localObject2 = this.q;
      if (this.M != 0) {
        break label236;
      }
      localObject1 = "买入";
      label109:
      ((Button)localObject2).setText((CharSequence)localObject1);
      localObject2 = this.n;
      if (this.M != 0) {
        break label243;
      }
    }
    int k;
    label229:
    label236:
    label243:
    for (Object localObject1 = "可买数量";; localObject1 = "可卖数量")
    {
      ((TextView)localObject2).setText((CharSequence)localObject1);
      if (GgtTradeMenu.a == null) {
        GgtTradeMenu.a();
      }
      if (GgtTradeMenu.a == null) {
        break label397;
      }
      localObject1 = new String[GgtTradeMenu.a.length];
      k = 0;
      while (k < localObject1.length)
      {
        localObject1[k] = (o.q(GgtTradeMenu.a[k][0]) + " " + GgtTradeMenu.a[k][1]);
        k += 1;
      }
      localObject1 = "卖出";
      break;
      localObject1 = "委托卖出";
      break label88;
      localObject1 = "卖出";
      break label109;
    }
    localObject2 = new ArrayAdapter(this, 17367048, (Object[])localObject1);
    ((ArrayAdapter)localObject2).setDropDownViewResource(17367049);
    this.b.setAdapter((SpinnerAdapter)localObject2);
    if (this.O != null)
    {
      k = 0;
      if (k >= localObject1.length) {
        break label457;
      }
      if (!localObject1[k].contains(this.O)) {
        break label388;
      }
    }
    for (;;)
    {
      this.b.setSelection(k);
      label318:
      if (this.M == 0)
      {
        localObject1 = new String[2];
        localObject1[0] = "竞价限价";
        localObject1[1] = "增强限价";
      }
      for (;;)
      {
        localObject1 = new ArrayAdapter(this, 17367048, (Object[])localObject1);
        ((ArrayAdapter)localObject1).setDropDownViewResource(17367049);
        this.e.setAdapter((SpinnerAdapter)localObject1);
        this.e.setSelection(1);
        this.a.a(this, this);
        return;
        label388:
        k += 1;
        break;
        label397:
        localObject1 = new ArrayAdapter(this, 17367048, new String[0]);
        ((ArrayAdapter)localObject1).setDropDownViewResource(17367049);
        this.b.setAdapter((SpinnerAdapter)localObject1);
        break label318;
        localObject1 = new String[3];
        localObject1[0] = "竞价限价";
        localObject1[1] = "增强限价";
        localObject1[2] = "零股限价";
      }
      label457:
      k = 0;
    }
  }
  
  private void b(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    this.af = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("12678").a("6028", "2").a("2315", "3").h()) });
    registRequestListener(this.af);
    sendRequest(this.af);
  }
  
  private void c()
  {
    this.c.setText("");
  }
  
  private int d(String paramString1, String paramString2)
  {
    float f1 = b(paramString1, paramString2).floatValue();
    if (f1 > 0.0F) {
      return -65536;
    }
    if (f1 < 0.0F) {
      return -16711936;
    }
    return -1;
  }
  
  private void d()
  {
    this.d.setText("");
    this.f.setText("");
    this.g.setText("");
    this.o.setText("");
    this.p.setText("");
    this.p.setVisibility(4);
    this.s.setText("");
    this.t.setText("");
    this.u.setText("");
    this.v.setText("");
    this.w = ((ImageView)findViewById(2131559156));
    this.w.setVisibility(4);
    this.x.setText("");
    this.y.setText("");
    this.z.setText("");
    this.A.setText("");
    this.B.setText("");
    this.C.setText("");
    this.D.setText("");
    this.N = null;
    this.R = "";
    this.S = "";
    this.aa = false;
    this.ab = 0;
    this.O = null;
    this.Y = true;
  }
  
  private void d(int paramInt)
  {
    this.P = "0";
    label24:
    String str;
    int k;
    if (this.f.getText().toString().equals(""))
    {
      return;
    }
    else
    {
      str = this.f.getText().toString();
      k = 0;
      label40:
      if (k >= GgtTradeMenu.b.length) {
        break label580;
      }
      if ((b(str, GgtTradeMenu.b[k][0]).doubleValue() <= 0.0D) || (b(str, GgtTradeMenu.b[k][1]).doubleValue() >= 0.0D)) {}
    }
    label484:
    label580:
    for (Object localObject1 = GgtTradeMenu.b[k][2];; localObject1 = "0")
    {
      if (!((String)localObject1).equals("0"))
      {
        this.P = ((String)localObject1);
        this.Q = this.P;
        return;
        k += 1;
        break label40;
      }
      int i1 = 0;
      int i2 = 0;
      Object localObject3 = "";
      Object localObject2 = "";
      k = 0;
      while (k < GgtTradeMenu.b.length)
      {
        Object localObject4 = localObject3;
        if (k == 0)
        {
          localObject4 = GgtTradeMenu.b[k][0];
          localObject2 = GgtTradeMenu.b[k][1];
        }
        localObject3 = localObject4;
        if (b((String)localObject4, GgtTradeMenu.b[k][0]).doubleValue() > 0.0D)
        {
          localObject3 = GgtTradeMenu.b[k][0];
          i2 = k;
        }
        localObject4 = localObject2;
        if (b((String)localObject2, GgtTradeMenu.b[k][1]).doubleValue() < 0.0D)
        {
          localObject4 = GgtTradeMenu.b[k][1];
          i1 = k;
        }
        k += 1;
        localObject2 = localObject4;
      }
      if (b(str, (String)localObject3).doubleValue() == 0.0D) {
        localObject1 = GgtTradeMenu.b[i2][2];
      }
      while (!((String)localObject1).equals("0"))
      {
        this.P = ((String)localObject1);
        this.Q = this.P;
        return;
        if (b(str, (String)localObject2).doubleValue() == 0.0D) {
          localObject1 = GgtTradeMenu.b[i1][2];
        }
      }
      i1 = 0;
      int i3 = 0;
      k = 0;
      for (;;)
      {
        localObject2 = localObject1;
        if (k < GgtTradeMenu.b.length)
        {
          i2 = i3;
          if (b(str, GgtTradeMenu.b[k][0]).doubleValue() < 0.0D) {
            break label484;
          }
          i2 = i3;
          if (b(str, GgtTradeMenu.b[k][1]).doubleValue() >= 0.0D) {
            break label484;
          }
          if ((paramInt == 0) || (paramInt == 1))
          {
            localObject2 = GgtTradeMenu.b[k][2];
            this.P = ((String)localObject2);
          }
        }
        else
        {
          if (((String)localObject2).equals("0")) {
            break label24;
          }
          this.Q = ((String)localObject2);
          return;
        }
        this.P = GgtTradeMenu.b[k][2];
        i2 = 1;
        localObject2 = localObject1;
        if (i1 != 0) {
          break;
        }
        i3 = i1;
        localObject2 = localObject1;
        if (b(str, GgtTradeMenu.b[k][0]).doubleValue() > 0.0D)
        {
          i3 = i1;
          localObject2 = localObject1;
          if (b(str, GgtTradeMenu.b[k][1]).doubleValue() <= 0.0D)
          {
            localObject1 = GgtTradeMenu.b[k][2];
            i3 = 1;
            localObject2 = localObject1;
            if (i2 != 0) {
              break;
            }
            localObject2 = localObject1;
          }
        }
        k += 1;
        i1 = i3;
        i3 = i2;
        localObject1 = localObject2;
      }
    }
  }
  
  private void f()
  {
    this.c.setFilters(new InputFilter[] { new InputFilter.LengthFilter(5) });
    this.c.addTextChangedListener(new g(this));
    this.f.addTextChangedListener(new h(this));
    this.g.addTextChangedListener(new i(this));
    this.e.setOnItemSelectedListener(new j(this));
    p localp = new p(this);
    this.h.setOnClickListener(localp);
    this.i.setOnClickListener(localp);
    this.j.setOnClickListener(localp);
    this.m.setOnClickListener(localp);
    this.r.setOnClickListener(localp);
    this.q.setOnClickListener(localp);
  }
  
  private void g()
  {
    if ((GgtTradeMenu.a == null) || (GgtTradeMenu.a.length == 0) || (this.N == null) || (this.N.length() != 5)) {}
    while (!o.r()) {
      return;
    }
    com.android.dazhihui.ui.delegate.b.h localh = o.g("12124");
    if (this.M == 0) {}
    for (String str = "54";; str = "55")
    {
      this.ag = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.a("1026", str).a("1021", GgtTradeMenu.a[this.b.getSelectedItemPosition()][0]).a("1019", GgtTradeMenu.a[this.b.getSelectedItemPosition()][1]).a("1036", this.N).a("1041", this.f.getText().toString()).a("2315", "3").h()) });
      registRequestListener(this.ag);
      sendRequest(this.ag);
      return;
    }
  }
  
  private void h()
  {
    if ((GgtTradeMenu.a == null) || (GgtTradeMenu.a.length == 0)) {}
    while (!o.r()) {
      return;
    }
    com.android.dazhihui.ui.delegate.b.h localh = o.g("12650");
    if (this.U == 0) {}
    for (Object localObject = "0";; localObject = "1")
    {
      localObject = localh.a("1026", (String)localObject).a("1021", GgtTradeMenu.a[this.b.getSelectedItemPosition()][0]).a("1019", GgtTradeMenu.a[this.b.getSelectedItemPosition()][1]).a("1036", this.X).a("1041", this.V).a("1040", this.W).a("6014", this.e.getSelectedItemPosition() + 1).a("6015", "1");
      int k = this.ab + 1;
      this.ab = k;
      this.ah = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(((com.android.dazhihui.ui.delegate.b.h)localObject).a("1396", k).a("2315", "3").h()) });
      registRequestListener(this.ah);
      sendRequest(this.ah);
      return;
    }
  }
  
  private void i()
  {
    if (this.c.getText().length() < 5)
    {
      a(1);
      return;
    }
    if ((this.c.getText().toString().equals("")) || (this.f.getText().toString().equals("")) || (this.g.getText().toString().equals("")))
    {
      a(0);
      return;
    }
    if ((GgtTradeMenu.a == null) || (GgtTradeMenu.a.length == 0))
    {
      a(2);
      return;
    }
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    if (this.M == 0) {}
    for (String str1 = "你确认买入吗？";; str1 = "你确认卖出吗？")
    {
      Object localObject = "" + "证券代码:" + this.c.getText().toString() + "\n";
      String str2 = (String)localObject + "证券名称:" + this.d.getText().toString() + "\n";
      localObject = str2;
      if (GgtTradeMenu.a != null) {
        localObject = str2 + "股东账号:" + GgtTradeMenu.a[this.b.getSelectedItemPosition()][1] + "\n";
      }
      localObject = (String)localObject + "委托价格:" + this.f.getText().toString() + "HKD\n";
      localObject = (String)localObject + "委托数量:" + this.g.getText().toString() + "\n";
      localObject = (String)localObject + j();
      this.V = this.f.getText().toString();
      this.W = this.g.getText().toString();
      this.X = this.N;
      this.U = this.M;
      localBuilder.setTitle(str1).setMessage((CharSequence)localObject).setPositiveButton("确定", new k(this)).setNegativeButton("取消", null).show();
      return;
    }
  }
  
  private String j()
  {
    String str1 = this.o.getText().toString();
    String str2 = this.g.getText().toString();
    if (!str1.equals(""))
    {
      if (com.android.dazhihui.d.n.y(str1) - com.android.dazhihui.d.n.y(str2) < 0.0D) {
        return "\n\t委托数量超过最大可委托数量，交易可能不成功。";
      }
      return "";
    }
    return "";
  }
  
  private void k()
  {
    if ((this.g.getText().length() != 0) && (this.f.getText().length() != 0) && (this.s.getText().length() != 0) && (com.android.dazhihui.d.n.w(this.f.getText().toString()) != 0.0F) && (com.android.dazhihui.d.n.w(this.g.getText().toString()) != 0.0F) && (com.android.dazhihui.d.n.w(this.s.getText().toString()) != 0.0F))
    {
      float f1 = com.android.dazhihui.d.n.w(this.f.getText().toString());
      float f2 = com.android.dazhihui.d.n.w(this.g.getText().toString());
      float f3 = com.android.dazhihui.d.n.w(this.s.getText().toString());
      NumberFormat localNumberFormat = NumberFormat.getInstance();
      localNumberFormat.setGroupingUsed(false);
      this.p.setText("￥" + localNumberFormat.format(f1 * f2 * f3) + "");
      this.p.setVisibility(0);
      return;
    }
    this.p.setText("");
    this.p.setVisibility(4);
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
  
  public BigDecimal a(String paramString1, String paramString2)
  {
    return new BigDecimal(paramString1).add(new BigDecimal(paramString2));
  }
  
  public void a(boolean paramBoolean)
  {
    if (this.N == null) {}
    while (!o.r()) {
      return;
    }
    if (GgtTradeMenu.b == null) {
      b(true);
    }
    this.ae = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("12670").a("1036", this.N).a("1021", "17").a("2315", "3").h()) });
    registRequestListener(this.ae);
    sendRequest(this.ae);
  }
  
  public BigDecimal b(String paramString1, String paramString2)
  {
    return new BigDecimal(paramString1).subtract(new BigDecimal(paramString2));
  }
  
  public BigDecimal c(String paramString1, String paramString2)
  {
    return new BigDecimal(paramString1).divide(new BigDecimal(paramString2), 4, 4);
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (o.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.a == null);
      this.a.a(paramy);
      return;
    } while (this.a == null);
    this.a.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 16424;
    paramct.d = this.ad;
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.a = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, com.android.dazhihui.a.b.j paramj)
  {
    super.handleResponse(paramh, paramj);
    Object localObject1;
    com.android.dazhihui.ui.delegate.b.h localh;
    int i1;
    label99:
    Object localObject2;
    if (paramh == this.ae)
    {
      localObject1 = ((v)paramj).b();
      if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, this))
      {
        localh = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
        if ((localh.b()) || (localh.g() == 0)) {
          return;
        }
        localObject1 = localh.a(0, "1021");
        if ((localObject1 != null) && (GgtTradeMenu.a != null) && (GgtTradeMenu.a.length != 0) && (this.O == null))
        {
          i1 = GgtTradeMenu.a.length;
          k = 0;
          if (k >= i1) {
            break label1562;
          }
          if (!GgtTradeMenu.a[k][0].equals(localObject1)) {
            break label864;
          }
          localObject2 = GgtTradeMenu.a[k][2];
          if ((localObject2 == null) || (!((String)localObject2).equals("1"))) {
            break label855;
          }
          this.b.setSelection(k);
        }
      }
    }
    label167:
    label247:
    label259:
    label334:
    label414:
    label450:
    label472:
    label514:
    label536:
    label597:
    label630:
    label674:
    label855:
    label864:
    label873:
    label893:
    label999:
    label1043:
    label1070:
    label1083:
    label1110:
    label1123:
    label1136:
    label1155:
    label1203:
    label1216:
    label1225:
    label1255:
    label1314:
    label1439:
    label1455:
    label1457:
    label1559:
    label1562:
    for (int k = 1;; k = 0)
    {
      if (k == 0)
      {
        k = 0;
        if (k < i1)
        {
          if (!GgtTradeMenu.a[k][0].equals(localObject1)) {
            break label873;
          }
          this.b.setSelection(k);
        }
      }
      this.d.setText(localh.a(0, "1037"));
      localObject1 = localh.a(0, "1181");
      if ((localObject1 == null) || (((String)localObject1).equals("")))
      {
        this.x.setText("--");
        if (((String)localObject1).split("\\.").length != 1) {
          break label893;
        }
        localObject2 = localh.a(0, "1178");
        if ((localObject2 != null) && (!((String)localObject2).equals(""))) {
          break label1559;
        }
        localObject2 = "0";
      }
      for (;;)
      {
        Object localObject3;
        Object localObject4;
        if ((localObject1 == null) || (((String)localObject1).equals("")) || (com.android.dazhihui.d.n.w((String)localObject1) == 0.0F))
        {
          this.y.setText("--");
          this.z.setText("--");
          localObject1 = "0";
          this.x.setTextColor(d((String)localObject1, (String)localObject2));
          this.y.setTextColor(d((String)localObject1, (String)localObject2));
          this.z.setTextColor(d((String)localObject1, (String)localObject2));
          this.w.setVisibility(0);
          if (d((String)localObject1, (String)localObject2) != -65536) {
            break label999;
          }
          this.w.setImageDrawable(getResources().getDrawable(2130837534));
          localObject3 = localh.a(0, "1156");
          if ((localObject3 != null) && (!((String)localObject3).equals(""))) {
            break label1043;
          }
          this.A.setText("--");
          localObject4 = this.B;
          if (localh.a(0, "1151") != null) {
            break label1070;
          }
          localObject1 = "--";
          ((CustomTextView)localObject4).setText((CharSequence)localObject1);
          localObject4 = localh.a(0, "1167");
          if ((localObject4 != null) && (!((String)localObject4).equals(""))) {
            break label1083;
          }
          this.C.setText("--");
          localObject2 = this.D;
          if (localh.a(0, "1162") != null) {
            break label1110;
          }
          localObject1 = "--";
          ((CustomTextView)localObject2).setText((CharSequence)localObject1);
          this.u.setText(localh.a(0, "1224"));
          this.v.setText(a(com.android.dazhihui.d.n.y(localh.a(0, "6023"))));
          if (localh.a(0, "6068") != null) {
            break label1123;
          }
          localObject1 = "2";
          if (this.M != 0) {
            break label1155;
          }
          if (!((String)localObject1).equals("2")) {
            break label1136;
          }
          this.s.setText(localh.a(0, "6024"));
          if (!this.aa)
          {
            if (this.M != 0) {
              break label1225;
            }
            if ((localObject4 != null) && (!((String)localObject4).equals(""))) {
              break label1216;
            }
            if (localh.a(0, "1181") != null) {
              break label1203;
            }
            localObject1 = "";
          }
        }
        for (this.T = ((String)localObject1);; this.T = ((String)localObject4))
        {
          this.f.setText(this.T);
          if (this.N == null) {
            d();
          }
          k();
          if (paramh != this.af) {
            break label1314;
          }
          localObject1 = ((v)paramj).b();
          if (!com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, this)) {
            break label1314;
          }
          localObject1 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
          if (!((com.android.dazhihui.ui.delegate.b.h)localObject1).b()) {
            break;
          }
          i1 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).g();
          GgtTradeMenu.b = new String[i1][];
          k = 0;
          while (k < i1)
          {
            GgtTradeMenu.b[k] = new String[4];
            GgtTradeMenu.b[k][0] = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(k, "1175");
            GgtTradeMenu.b[k][1] = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(k, "1174");
            GgtTradeMenu.b[k][2] = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(k, "6027");
            GgtTradeMenu.b[k][3] = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(k, "6028");
            k += 1;
          }
          this.b.setSelection(k);
          k += 1;
          break label99;
          k += 1;
          break label167;
          this.x.setText((CharSequence)localObject1);
          break label247;
          localObject1.split("\\.")[1].length();
          break label259;
          localObject3 = b((String)localObject1, (String)localObject2);
          this.y.setText(((BigDecimal)localObject3).toString());
          if (com.android.dazhihui.d.n.w((String)localObject2) == 0.0F)
          {
            this.z.setText("--%");
            break label334;
          }
          localObject3 = c(((BigDecimal)localObject3).toString(), (String)localObject2);
          localObject4 = (DecimalFormat)DecimalFormat.getInstance();
          ((DecimalFormat)localObject4).applyPattern("##.##%");
          this.z.setText(((DecimalFormat)localObject4).format(localObject3));
          break label334;
          if (d((String)localObject1, (String)localObject2) == -16711936)
          {
            this.w.setImageDrawable(getResources().getDrawable(2130837532));
            break label414;
          }
          this.w.setVisibility(4);
          break label414;
          this.A.setText((CharSequence)localObject3);
          this.A.setTextColor(d((String)localObject3, (String)localObject2));
          break label450;
          localObject1 = localh.a(0, "1151");
          break label472;
          this.C.setText((CharSequence)localObject4);
          this.C.setTextColor(d((String)localObject4, (String)localObject2));
          break label514;
          localObject1 = localh.a(0, "1162");
          break label536;
          localObject1 = localh.a(0, "6068");
          break label597;
          this.s.setText(localh.a(0, "6025"));
          break label630;
          if (((String)localObject1).equals("2"))
          {
            this.s.setText(localh.a(0, "6025"));
            break label630;
          }
          this.s.setText(localh.a(0, "6024"));
          break label630;
          localObject1 = localh.a(0, "1181");
          break label674;
        }
        if ((localObject3 == null) || (((String)localObject3).equals(""))) {
          if (localh.a(0, "1181") == null) {
            localObject1 = "";
          }
        }
        for (this.T = ((String)localObject1);; this.T = ((String)localObject3))
        {
          this.f.setText(this.T);
          break;
          localObject1 = localh.a(0, "1181");
          break label1255;
        }
        if (this.N != null) {
          this.c.setText(this.N);
        }
        if (paramh == this.ag)
        {
          localObject1 = ((v)paramj).b();
          if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, this))
          {
            localObject1 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
            if (!((com.android.dazhihui.ui.delegate.b.h)localObject1).b()) {
              break;
            }
            if ((this.e.getSelectedItemPosition() != 2) || (this.M != 1)) {
              break label1439;
            }
            this.o.setText(((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "6066"));
          }
        }
        for (;;)
        {
          if (paramh != this.ah) {
            break label1455;
          }
          paramh = ((v)paramj).b();
          if (!com.android.dazhihui.ui.delegate.b.u.a(paramh, this)) {
            break;
          }
          paramh = com.android.dazhihui.ui.delegate.b.h.b(paramh.e());
          if (paramh.b()) {
            break label1457;
          }
          c(paramh.d());
          c();
          return;
          this.o.setText(((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1462"));
        }
        break;
        paramj = paramh.a(0, "1042");
        if (paramj == null)
        {
          paramh = paramh.a(0, "1208");
          new AlertDialog.Builder(this).setTitle("提示").setMessage(paramh).setPositiveButton("确定", new m(this)).setNegativeButton("取消", new l(this)).show();
          return;
        }
        c("　　委托请求提交成功。合同号为：" + paramj);
        c();
        return;
      }
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
    setContentView(2130903148);
    a();
    b();
    f();
    if (GgtTradeMenu.b == null) {
      b(false);
    }
    while (this.N == null) {
      return;
    }
    this.c.setText(this.N);
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (this == b.a().f()) {
      b(9);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ggt\GgtEntrust.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */