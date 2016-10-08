package com.android.dazhihui.ui.delegate.screen;

import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.d.n;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.a;
import com.android.dazhihui.ui.screen.stock.SearchStockScreen;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.mh;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class EntrustNew
  extends DelegateBaseActivity
  implements cp, cs
{
  private TextView A;
  private TextView B;
  private TextView C;
  private TextView D;
  private TextView E;
  private TextView F;
  private TextView G;
  private TextView H;
  private TextView I;
  private TextView J;
  private TextView K;
  private ImageView L;
  private ImageView M;
  private ImageView N;
  private ImageView O;
  private String[] P;
  private String Q;
  private String R = "";
  private int S = -1;
  private String T = "";
  private String U = null;
  private String V = null;
  private String W = null;
  private double X = 0.0D;
  private DzhHeader Y;
  String a = "";
  private String aa = "1";
  private String ab = "0";
  private String[] ac;
  private TableLayoutGroup ad;
  private LinearLayout ae;
  private LinearLayout af;
  private String[] ag;
  private String[] ah;
  private int ai;
  private int aj;
  private int ak;
  private Handler al;
  private com.android.dazhihui.a.b.u am;
  private com.android.dazhihui.a.b.u an;
  private com.android.dazhihui.a.b.u ao;
  private com.android.dazhihui.a.b.u ap;
  private int aq;
  private String ar;
  private String as;
  private int at;
  private int au;
  private boolean av;
  protected ProgressDialog b;
  private int c;
  private int d;
  private Spinner e;
  private TextView f;
  private EditText g;
  private EditText h;
  private EditText i;
  private TextView j;
  private TextView m;
  private TextView n;
  private TextView o;
  private TextView p;
  private TextView q;
  private TextView r;
  private TextView s;
  private TextView t;
  private TextView u;
  private TextView v;
  private TextView w;
  private TextView x;
  private TextView y;
  private TextView z;
  
  public EntrustNew()
  {
    String[] arrayOfString;
    if (a.e == null)
    {
      arrayOfString = new String[8];
      arrayOfString[0] = "股票名称";
      arrayOfString[1] = "股票余额";
      arrayOfString[2] = "可用股数";
      arrayOfString[3] = "最新价";
      arrayOfString[4] = "成本价";
      arrayOfString[5] = "买卖盈亏";
      arrayOfString[6] = "股票市值";
      arrayOfString[7] = "股票代码";
      this.ag = arrayOfString;
      if (a.f != null) {
        break label254;
      }
      arrayOfString = new String[8];
      arrayOfString[0] = "1037";
      arrayOfString[1] = "1060";
      arrayOfString[2] = "1061";
      arrayOfString[3] = "1181";
      arrayOfString[4] = "1062";
      arrayOfString[5] = "1064";
      arrayOfString[6] = "1065";
      arrayOfString[7] = "1036";
    }
    for (;;)
    {
      this.ah = arrayOfString;
      this.ai = m.a().H();
      this.aj = 0;
      this.al = new af(this);
      this.am = null;
      this.ap = null;
      this.aq = 0;
      this.ar = "SZ";
      this.as = "";
      this.at = 0;
      this.au = 0;
      this.av = false;
      return;
      arrayOfString = a.e;
      break;
      label254:
      arrayOfString = a.f;
    }
  }
  
  private int a(double paramDouble)
  {
    if (paramDouble > 0.0D) {
      return -65536;
    }
    if (paramDouble < 0.0D) {
      return -16711936;
    }
    return -1;
  }
  
  private void h()
  {
    Object localObject1 = "" + "证券代码:" + this.g.getText().toString() + "\n";
    localObject1 = (String)localObject1 + "证券名称:" + this.f.getText().toString() + "\n";
    localObject1 = (String)localObject1 + this.a + "价格:" + this.h.getText().toString() + "\n";
    Object localObject2 = (String)localObject1 + this.a + "数量:" + this.i.getText().toString() + "\n";
    localObject1 = localObject2;
    if (!this.n.getText().toString().equals(""))
    {
      localObject1 = localObject2;
      if (Float.parseFloat(this.h.getText().toString()) > Float.parseFloat(this.n.getText().toString())) {
        localObject1 = (String)localObject2 + this.a + "的价格高于涨停价,交易可能不会成功!\n";
      }
    }
    localObject2 = localObject1;
    if (!this.o.getText().toString().equals(""))
    {
      localObject2 = localObject1;
      if (Float.parseFloat(this.h.getText().toString()) < Float.parseFloat(this.o.getText().toString())) {
        localObject2 = (String)localObject1 + this.a + "的价格低于跌停价,交易可能不会成功!\n";
      }
    }
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    if (this.d == 0) {}
    for (localObject1 = "您确认买入吗？";; localObject1 = "您确认卖出吗？")
    {
      localBuilder.setTitle((CharSequence)localObject1).setMessage((CharSequence)localObject2).setPositiveButton(2131165363, new ba(this)).setNegativeButton(2131165331, new az(this)).show();
      return;
    }
  }
  
  private String[] i()
  {
    int k = (int)this.e.getSelectedItemId();
    if ((o.z == null) || (o.z.length == 0)) {
      return new String[] { "", "" };
    }
    return o.z[k];
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
  
  public void a()
  {
    if ((this.d != 1) || (this.at == 0)) {}
    String str;
    do
    {
      return;
      str = n.t((String)c(this.ak).get("1036"));
    } while ((str == null) || (str.length() <= 0));
    this.g.setText(str);
    this.R = str;
  }
  
  public void a(int paramInt)
  {
    if (paramInt == 0)
    {
      localToast = Toast.makeText(this, "　　股票代码、价格、数量都必须填写。", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
      return;
    }
    if (paramInt == 1)
    {
      localToast = Toast.makeText(this, "　　股票代码须为完整 6 位。", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
      return;
    }
    if (paramInt == 3)
    {
      localToast = Toast.makeText(this, "　　正在获取数据中，请稍候……", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
      return;
    }
    Toast localToast = Toast.makeText(this, "　　委托请求提交中，请稍候……", 0);
    localToast.setGravity(17, 0, 0);
    localToast.show();
  }
  
  public void a(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    this.an = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11146").a("1019", "").a("1036", "").a("1206", this.aj).a("1277", this.ai).h()) });
    registRequestListener(this.an);
    a(this.an, paramBoolean);
  }
  
  public void b()
  {
    if (!o.r()) {
      return;
    }
    this.am = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11102").a("1003", "0").a("1036", this.R).h()) });
    registRequestListener(this.am);
    a(this.am, true);
  }
  
  public void c()
  {
    if (!o.r()) {
      return;
    }
    this.P = i();
    com.android.dazhihui.ui.delegate.b.h localh;
    String str;
    if (this.d == 0) {
      if (this.h.getText().toString().length() > 0)
      {
        localObject = this.h.getText().toString();
        localh = o.g("11110").a("1021", this.P[0]).a("1019", this.P[1]);
        if (this.Q != null) {
          break label189;
        }
        str = "0";
      }
    }
    label90:
    for (Object localObject = localh.a("1003", str).a("1036", this.R).a("1041", (String)localObject).a("1078", "0").a("1247", "0");; localObject = o.g("11146").a("1019", this.P[1]).a("1036", this.R).a("1206", "0").a("1277", "1"))
    {
      this.ao = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(((com.android.dazhihui.ui.delegate.b.h)localObject).h()) });
      registRequestListener(this.ao);
      a(this.ao, true);
      return;
      localObject = n.t(this.T);
      break;
      label189:
      str = this.Q;
      break label90;
    }
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (be.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.Y == null);
      this.Y.a(paramy);
      return;
    } while (this.Y == null);
    this.Y.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramContext = "委托" + this.a;
    paramct.a = 16424;
    paramct.d = paramContext;
    paramct.p = this;
  }
  
  public void d()
  {
    if (!o.r()) {
      return;
    }
    String str1 = this.g.getText().toString();
    String str2 = this.h.getText().toString();
    String str3 = this.i.getText().toString();
    com.android.dazhihui.ui.delegate.b.h localh = o.g("11116").a("1026", String.valueOf(this.d)).a("1021", this.P[0]).a("1019", this.P[1]);
    if (this.Q == null) {}
    for (Object localObject = "0";; localObject = this.Q)
    {
      localObject = localh.a("1003", (String)localObject).a("1036", str1).a("1041", str2).a("1029", "1").a("1040", str3).a("1396", this.aa).a("1515", this.ab);
      this.ac = null;
      this.ac = new String[3];
      this.ac[0] = str1;
      this.ac[1] = str2;
      this.ac[2] = str3;
      this.ap = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(((com.android.dazhihui.ui.delegate.b.h)localObject).h()) });
      registRequestListener(this.ap);
      a(this.ap, false);
      if (this.b == null) {
        break;
      }
      this.b.show();
      return;
    }
  }
  
  public void f()
  {
    if (!o.r()) {
      break label6;
    }
    label6:
    while (this.ac == null) {
      return;
    }
    com.android.dazhihui.ui.delegate.b.h localh = o.g("11116").a("1026", String.valueOf(this.d)).a("1021", this.P[0]).a("1019", this.P[1]);
    if (this.Q == null) {}
    for (Object localObject = "0";; localObject = this.Q)
    {
      localObject = localh.a("1003", (String)localObject).a("1036", this.ac[0]).a("1041", this.ac[1]).a("1029", "1").a("1040", this.ac[2]).a("1396", this.aa).a("1515", this.ab);
      this.ac = null;
      this.aa = "1";
      this.ab = "0";
      this.ap = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(((com.android.dazhihui.ui.delegate.b.h)localObject).h()) });
      registRequestListener(this.ap);
      a(this.ap, false);
      if (this.b == null) {
        break;
      }
      this.b.show();
      return;
    }
  }
  
  public void g()
  {
    this.g.setText("");
    this.f.setText("");
    this.h.setText("");
    this.i.setText("");
    this.m.setText("");
    this.j.setText("");
    this.r.setText("");
    this.p.setText("");
    this.q.setText("");
    this.t.setText("");
    this.u.setText("");
    this.v.setText("");
    this.w.setText("");
    this.x.setText("");
    this.y.setText("");
    this.z.setText("");
    this.A.setText("");
    this.B.setText("");
    this.C.setText("");
    this.D.setText("");
    this.E.setText("");
    this.F.setText("");
    this.G.setText("");
    this.H.setText("");
    this.I.setText("");
    this.J.setText("");
    this.K.setText("");
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.Y = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    if (this.b != null) {
      this.b.dismiss();
    }
    Object localObject1;
    Object localObject6;
    if (paramh == this.am)
    {
      localObject1 = ((v)paramj).b();
      if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, this))
      {
        localObject6 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
        if (!((com.android.dazhihui.ui.delegate.b.h)localObject6).b()) {
          a(((com.android.dazhihui.ui.delegate.b.h)localObject6).d());
        }
        if (((com.android.dazhihui.ui.delegate.b.h)localObject6).g() != 0) {}
      }
    }
    for (;;)
    {
      return;
      localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1021");
      try
      {
        localObject4 = o.e(Integer.valueOf(((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1021")).intValue());
        this.ar = ((String)localObject4 + this.R);
        int k;
        if (o.z != null)
        {
          if ((o.z.length > 0) && (!((String)localObject1).equals(o.z[((int)this.e.getSelectedItemId())][0])))
          {
            k = 0;
            label172:
            if (k < o.z.length)
            {
              if (!((String)localObject1).equals(o.z[k][0])) {
                break label1355;
              }
              this.e.setSelection(k);
            }
          }
          if ((this.V != null) && (!this.V.equals("")))
          {
            k = 0;
            label227:
            if (k < o.z.length)
            {
              if (!this.V.equals(o.z[k][1])) {
                break label1364;
              }
              this.e.setSelection(k);
            }
          }
        }
        this.Q = ((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1003");
        String str1 = ((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1181");
        Object localObject5 = ((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1178");
        localObject1 = localObject5;
        localObject4 = str1;
        if (str1 != null)
        {
          localObject1 = localObject5;
          localObject4 = str1;
          if (localObject5 != null)
          {
            localObject4 = o.i(o.b(str1, (String)localObject5));
            localObject1 = o.i((String)localObject5);
            localObject4 = o.b((String)localObject4, (String)localObject1);
          }
        }
        this.S = com.android.dazhihui.d.b.a((String)localObject4, (String)localObject1);
        this.T = ((String)localObject4);
        this.as = ((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1037");
        this.f.setText(this.as);
        this.j.setText((CharSequence)localObject4);
        this.j.setTextColor(this.S);
        this.r.setText((CharSequence)localObject1);
        this.r.setTextColor(this.S);
        localObject4 = ((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1172");
        this.S = com.android.dazhihui.d.b.a((String)localObject4, (String)localObject1);
        this.n.setText((CharSequence)localObject4);
        this.n.setTextColor(this.S);
        localObject4 = ((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1173");
        this.S = com.android.dazhihui.d.b.a((String)localObject4, (String)localObject1);
        this.o.setText((CharSequence)localObject4);
        this.o.setTextColor(this.S);
        this.p.setText(((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1156"));
        this.p.setTextColor(com.android.dazhihui.d.b.a(((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1156"), (String)localObject1));
        this.q.setText(((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1167"));
        this.q.setTextColor(com.android.dazhihui.d.b.a(((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1167"), (String)localObject1));
        this.t.setText(((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1157"));
        this.t.setTextColor(com.android.dazhihui.d.b.a(((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1157"), (String)localObject1));
        this.u.setText(((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1168"));
        this.u.setTextColor(com.android.dazhihui.d.b.a(((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1168"), (String)localObject1));
        this.v.setText(((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1158"));
        this.v.setTextColor(com.android.dazhihui.d.b.a(((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1158"), (String)localObject1));
        this.w.setText(((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1169"));
        this.w.setTextColor(com.android.dazhihui.d.b.a(((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1169"), (String)localObject1));
        this.x.setText(((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1160"));
        this.x.setTextColor(com.android.dazhihui.d.b.a(((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1160"), (String)localObject1));
        this.y.setText(((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1170"));
        this.y.setTextColor(com.android.dazhihui.d.b.a(((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1170"), (String)localObject1));
        this.z.setText(((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1161"));
        this.z.setTextColor(com.android.dazhihui.d.b.a(((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1161"), (String)localObject1));
        this.A.setText(((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1171"));
        this.A.setTextColor(com.android.dazhihui.d.b.a(((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1171"), (String)localObject1));
        this.B.setText(((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1151"));
        this.C.setText(((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1152"));
        this.D.setText(((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1153"));
        this.E.setText(((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1154"));
        this.F.setText(((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1155"));
        this.G.setText(((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1162"));
        this.H.setText(((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1163"));
        this.I.setText(((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1164"));
        this.J.setText(((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1165"));
        this.K.setText(((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1166"));
        if (this.W != null)
        {
          this.h.setText(o.a(this.W, 2));
          this.aq += 1;
          this.W = null;
        }
        if (this.aq == 0)
        {
          if (this.d != 0) {
            break label1373;
          }
          localObject5 = ((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1167");
          localObject4 = localObject5;
        }
        for (;;)
        {
          try
          {
            if (!((String)localObject5).equals(""))
            {
              localObject1 = localObject5;
              localObject4 = localObject5;
              if (Double.parseDouble((String)localObject5) > 0.0D) {}
            }
            else
            {
              localObject4 = localObject5;
              localObject5 = ((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1181");
              localObject4 = localObject5;
              if (!((String)localObject5).equals(""))
              {
                localObject1 = localObject5;
                localObject4 = localObject5;
                if (Double.parseDouble((String)localObject5) > 0.0D) {}
              }
              else
              {
                localObject4 = localObject5;
                localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1178");
              }
            }
          }
          catch (Exception localException2)
          {
            label1355:
            label1364:
            label1373:
            Object localObject3 = localObject4;
            continue;
          }
          localObject4 = localObject1;
          if (TextUtils.isEmpty((CharSequence)localObject1)) {
            localObject4 = "0.00";
          }
          this.h.setText(o.a((String)localObject4, 2));
          this.aq += 1;
          if (paramh == this.ap)
          {
            this.ae.setVisibility(0);
            this.af.setVisibility(0);
            this.ad.setVisibility(8);
            localObject1 = ((v)paramj).b();
            if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, this))
            {
              localObject1 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
              if (!((com.android.dazhihui.ui.delegate.b.h)localObject1).b()) {
                continue;
              }
              if (this.d == 0)
              {
                localObject4 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1208");
                if (localObject4 != null)
                {
                  new AlertDialog.Builder(this).setTitle("提示信息").setMessage((CharSequence)localObject4).setPositiveButton("确定", new bd(this)).setNegativeButton("取消", new bc(this)).show();
                  return;
                  k += 1;
                  break label172;
                  k += 1;
                  break label227;
                  localObject5 = ((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1156");
                  localObject4 = localObject5;
                }
              }
            }
          }
          try
          {
            if (!((String)localObject5).equals(""))
            {
              localObject1 = localObject5;
              localObject4 = localObject5;
              if (Double.parseDouble((String)localObject5) > 0.0D) {
                continue;
              }
            }
            localObject4 = localObject5;
            localObject5 = ((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1181");
            localObject4 = localObject5;
            if (!((String)localObject5).equals(""))
            {
              localObject1 = localObject5;
              localObject4 = localObject5;
              if (Double.parseDouble((String)localObject5) > 0.0D) {
                continue;
              }
            }
            localObject4 = localObject5;
            localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject6).a(0, "1178");
          }
          catch (Exception localException1)
          {
            boolean bool;
            int i1;
            String str2;
            String str3;
            String str4;
            String str5;
            Object localObject2 = localObject4;
          }
          localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1042");
          b("　　委托请求提交成功。合同号为：" + (String)localObject1);
          if (paramh == this.ao)
          {
            localObject1 = ((v)paramj).b();
            if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, this))
            {
              localObject1 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
              if (((com.android.dazhihui.ui.delegate.b.h)localObject1).b())
              {
                if ((this.d == 1) && (this.ad.getDataModel().size() == 0)) {
                  a(false);
                }
                if (((com.android.dazhihui.ui.delegate.b.h)localObject1).g() != 0) {
                  continue;
                }
                this.m.setText("0股");
              }
            }
          }
          if (paramh != this.an) {
            break;
          }
          paramh = ((v)paramj).b();
          if (!com.android.dazhihui.ui.delegate.b.u.a(paramh, this)) {
            break;
          }
          localObject1 = com.android.dazhihui.ui.delegate.b.h.b(paramh.e());
          bool = com.android.dazhihui.ui.screen.stock.offlinecapital.ah.a().c().booleanValue();
          if (((com.android.dazhihui.ui.delegate.b.h)localObject1).b())
          {
            this.at = ((com.android.dazhihui.ui.delegate.b.h)localObject1).g();
            this.au = ((com.android.dazhihui.ui.delegate.b.h)localObject1).b("1289");
            if ((this.at == 0) && (this.ad.getDataModel().size() == 0))
            {
              this.ad.setBackgroundResource(2130838490);
              if (!bool) {
                break;
              }
              com.android.dazhihui.ui.screen.stock.offlinecapital.ah.a().d();
              return;
              if (this.b != null) {
                this.b.cancel();
              }
              a(((com.android.dazhihui.ui.delegate.b.h)localObject1).d());
              continue;
              if (Integer.parseInt(((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1061")) > 0)
              {
                this.m.setText(((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1061") + "股");
                continue;
              }
              this.m.setText("0股");
              continue;
            }
            this.ad.setBackgroundColor(getResources().getColor(2131493677));
            if (this.at <= 0) {
              break;
            }
            paramh = new ArrayList();
            k = 0;
            if (k < this.at)
            {
              paramj = new mh();
              localObject4 = new String[this.ag.length];
              localObject5 = new int[this.ag.length];
              i1 = 0;
              if (i1 < this.ag.length) {
                try
                {
                  localObject4[i1] = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(k, this.ah[i1]).trim();
                  if (localObject4[i1] == null) {
                    localObject4[i1] = "--";
                  }
                  if ((!this.ah[i1].equals("1064")) || (localObject4[i1].equals("--"))) {}
                }
                catch (Exception localException4)
                {
                  try
                  {
                    this.S = a(Double.parseDouble(localObject4[i1]));
                    this.av = true;
                    localObject4[i1] = o.c(this.ah[i1], localObject4[i1]);
                    i1 += 1;
                    continue;
                    localException4 = localException4;
                    localObject4[i1] = "--";
                  }
                  catch (NumberFormatException localNumberFormatException)
                  {
                    localNumberFormatException.printStackTrace();
                    continue;
                  }
                }
              }
              i1 = 0;
              if (i1 < this.ag.length)
              {
                localObject5[i1] = getResources().getColor(2131493235);
                i1 += 1;
                continue;
              }
              paramj.a = ((String[])localObject4);
              paramj.b = ((int[])localObject5);
              paramh.add(paramj);
              k += 1;
              continue;
            }
            a((com.android.dazhihui.ui.delegate.b.h)localObject1, this.aj);
            this.ad.a(paramh, this.aj);
            if (!bool) {
              break;
            }
            com.android.dazhihui.ui.screen.stock.offlinecapital.ah.a().d();
            k = 0;
            if (k < this.at)
            {
              localObject4 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(k, "1036");
              localObject5 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(k, "1037");
              str2 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(k, "1060");
              localObject6 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(k, "1062");
              paramj = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(k, "1021");
              str3 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(k, "1064");
              str4 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(k, "1181");
              str5 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(k, "1061");
              if (paramj != null)
              {
                paramh = paramj;
                if (!paramj.equals("")) {}
              }
              else
              {
                paramh = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(k, "1004");
              }
              com.android.dazhihui.ui.screen.stock.offlinecapital.ah.a().a((String)localObject5, (String)localObject4, paramh, (String)localObject6, str2, str5, str3, str4);
              k += 1;
              continue;
            }
            com.android.dazhihui.ui.screen.stock.offlinecapital.ah.a().m();
            return;
          }
          paramh = Toast.makeText(this, ((com.android.dazhihui.ui.delegate.b.h)localObject1).d(), 0);
          paramh.setGravity(17, 0, 0);
          paramh.show();
          return;
        }
      }
      catch (Exception localException3)
      {
        Object localObject4;
        for (;;) {}
      }
    }
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    super.handleTimeout(paramh);
    if (paramh == this.an) {
      this.ad.d();
    }
    if (this == com.android.dazhihui.b.b.a().f()) {
      b(1);
    }
    this.b.dismiss();
  }
  
  public void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    paramBundle = getIntent().getExtras();
    this.d = paramBundle.getInt("screenId");
    this.U = paramBundle.getString("scode");
    this.V = paramBundle.getString("saccount");
    this.W = paramBundle.getString("sprice");
    if (this.d == 0)
    {
      paramBundle = "买入";
      this.a = paramBundle;
      if (this.d != 0) {
        break label287;
      }
    }
    label287:
    for (paramBundle = "可买";; paramBundle = "可卖")
    {
      setContentView(2130903538);
      this.Y = ((DzhHeader)findViewById(2131558643));
      this.Y.a(this, this);
      localObject1 = (TextView)findViewById(2131561015);
      localObject2 = (TextView)findViewById(2131561023);
      localObject3 = (TextView)findViewById(2131561021);
      this.f = ((TextView)findViewById(2131561014));
      ((TextView)localObject1).setText(this.a + "价格");
      ((TextView)localObject2).setText(this.a + "数量");
      ((TextView)localObject3).setText(paramBundle + "数量");
      paramBundle = new String[o.z.length];
      int k = 0;
      while (k < paramBundle.length)
      {
        paramBundle[k] = o.z[k][1];
        k += 1;
      }
      paramBundle = "卖出";
      break;
    }
    paramBundle = new ArrayAdapter(this, 17367048, paramBundle);
    paramBundle.setDropDownViewResource(17367049);
    this.e = ((Spinner)findViewById(2131561011));
    this.e.setVisibility(1);
    this.e.setAdapter(paramBundle);
    this.e.setOnItemSelectedListener(new aq(this));
    paramBundle = (Button)findViewById(2131561027);
    if (this.a != null) {
      paramBundle.setText(this.a);
    }
    paramBundle.setOnClickListener(new bb(this));
    this.g = ((EditText)findViewById(2131561013));
    this.h = ((EditText)findViewById(2131561016));
    this.i = ((EditText)findViewById(2131561024));
    this.j = ((TextView)findViewById(2131561032));
    this.r = ((TextView)findViewById(2131561035));
    this.m = ((TextView)findViewById(2131561022));
    this.n = ((TextView)findViewById(2131561038));
    this.o = ((TextView)findViewById(2131561041));
    this.p = ((TextView)findViewById(2131561044));
    this.q = ((TextView)findViewById(2131561047));
    this.t = ((TextView)findViewById(2131561050));
    this.u = ((TextView)findViewById(2131561053));
    this.v = ((TextView)findViewById(2131561056));
    this.w = ((TextView)findViewById(2131561059));
    this.x = ((TextView)findViewById(2131561062));
    this.y = ((TextView)findViewById(2131561065));
    this.z = ((TextView)findViewById(2131561068));
    this.A = ((TextView)findViewById(2131561071));
    this.B = ((TextView)findViewById(2131561045));
    this.C = ((TextView)findViewById(2131561051));
    this.D = ((TextView)findViewById(2131561057));
    this.E = ((TextView)findViewById(2131561063));
    this.F = ((TextView)findViewById(2131561069));
    this.G = ((TextView)findViewById(2131561048));
    this.H = ((TextView)findViewById(2131561054));
    this.I = ((TextView)findViewById(2131561060));
    this.J = ((TextView)findViewById(2131561066));
    this.K = ((TextView)findViewById(2131561072));
    this.s = ((TextView)findViewById(2131561020));
    this.L = ((ImageView)findViewById(2131561025));
    this.M = ((ImageView)findViewById(2131561026));
    this.N = ((ImageView)findViewById(2131561017));
    this.O = ((ImageView)findViewById(2131561018));
    this.ae = ((LinearLayout)findViewById(2131561029));
    this.af = ((LinearLayout)findViewById(2131561042));
    this.ad = ((TableLayoutGroup)findViewById(2131561073));
    this.ad.setVisibility(8);
    this.ad.setHeaderColumn(this.ag);
    this.ad.setPullDownLoading(false);
    this.ad.setColumnClickable(null);
    this.ad.setContinuousLoading(false);
    this.ad.setHeaderBackgroundColor(getResources().getColor(2131493234));
    this.ad.setDrawHeaderSeparateLine(false);
    this.ad.setHeaderTextColor(getResources().getColor(2131493235));
    this.ad.setHeaderHeight(56);
    this.ad.setContentRowHeight(96);
    this.ad.setLeftPadding(25);
    this.ad.setListDivideDrawable(getResources().getDrawable(2130838328));
    this.ad.setRowHighLightBackgroudDrawable(getResources().getDrawable(2130838067));
    this.ad.setStockNameColor(getResources().getColor(2131493235));
    this.ad.setOnLoadingListener(new bf(this));
    this.ad.setOnTableLayoutClickListener(new bg(this));
    ((Button)findViewById(2131561028)).setOnClickListener(new bh(this));
    paramBundle = (TextView)findViewById(2131561019);
    this.s.setVisibility(8);
    paramBundle.setVisibility(8);
    this.L.setOnClickListener(new bi(this));
    this.M.setOnClickListener(new bj(this));
    this.N.setOnClickListener(new bk(this));
    this.O.setOnClickListener(new ag(this));
    this.h.setOnEditorActionListener(new ah(this));
    this.g.setFilters(new InputFilter[] { new InputFilter.LengthFilter(6) });
    this.n.setFocusable(false);
    this.o.setFocusable(false);
    if (this.U != null)
    {
      this.g.setText(this.U);
      this.R = this.U;
      b();
    }
    this.g.addTextChangedListener(new ai(this));
    this.h.addTextChangedListener(new aj(this));
    paramBundle = (LinearLayout)findViewById(2131560696);
    Object localObject1 = (LinearLayout)findViewById(2131560699);
    Object localObject2 = (LinearLayout)findViewById(2131560702);
    Object localObject3 = (LinearLayout)findViewById(2131560705);
    LinearLayout localLinearLayout1 = (LinearLayout)findViewById(2131560708);
    LinearLayout localLinearLayout2 = (LinearLayout)findViewById(2131560693);
    LinearLayout localLinearLayout3 = (LinearLayout)findViewById(2131560690);
    LinearLayout localLinearLayout4 = (LinearLayout)findViewById(2131560687);
    LinearLayout localLinearLayout5 = (LinearLayout)findViewById(2131560684);
    LinearLayout localLinearLayout6 = (LinearLayout)findViewById(2131560681);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(g.a().m() / 2, -2);
    paramBundle.setLayoutParams(localLayoutParams);
    ((LinearLayout)localObject1).setLayoutParams(localLayoutParams);
    ((LinearLayout)localObject2).setLayoutParams(localLayoutParams);
    ((LinearLayout)localObject3).setLayoutParams(localLayoutParams);
    localLinearLayout1.setLayoutParams(localLayoutParams);
    paramBundle.setOnClickListener(new ak(this));
    ((LinearLayout)localObject1).setOnClickListener(new al(this));
    ((LinearLayout)localObject2).setOnClickListener(new am(this));
    ((LinearLayout)localObject3).setOnClickListener(new an(this));
    localLinearLayout1.setOnClickListener(new ao(this));
    localLinearLayout2.setOnClickListener(new ap(this));
    localLinearLayout3.setOnClickListener(new ar(this));
    localLinearLayout4.setOnClickListener(new as(this));
    localLinearLayout5.setOnClickListener(new at(this));
    localLinearLayout6.setOnClickListener(new au(this));
    paramBundle = (LinearLayout)findViewById(2131561030);
    localObject1 = (LinearLayout)findViewById(2131561033);
    localObject2 = (LinearLayout)findViewById(2131561036);
    localObject3 = (LinearLayout)findViewById(2131561039);
    paramBundle.setOnClickListener(new av(this));
    ((LinearLayout)localObject1).setOnClickListener(new aw(this));
    ((LinearLayout)localObject2).setOnClickListener(new ax(this));
    ((LinearLayout)localObject3).setOnClickListener(new ay(this));
    this.b = new ProgressDialog(this);
    this.b.setCancelable(true);
    this.b.setIndeterminate(true);
    this.b.setTitle("请稍后...");
    this.b.setMessage("正在连接网络...");
    if (this.d == 1)
    {
      if (this.g.getText().toString().length() != 6) {
        break label1817;
      }
      this.ae.setVisibility(0);
      this.af.setVisibility(0);
      this.ad.setVisibility(8);
    }
    for (;;)
    {
      if (this.U == null) {
        a(false);
      }
      return;
      label1817:
      this.ae.setVisibility(8);
      this.af.setVisibility(8);
      this.ad.setVisibility(0);
    }
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (paramh == this.an) {
      this.ad.d();
    }
    if (this == com.android.dazhihui.b.b.a().f()) {
      b(9);
    }
    this.b.dismiss();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 84) {
      startActivity(SearchStockScreen.class);
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\EntrustNew.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */