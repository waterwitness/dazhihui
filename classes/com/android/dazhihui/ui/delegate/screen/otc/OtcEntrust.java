package com.android.dazhihui.ui.delegate.screen.otc;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.b.b;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.mh;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OtcEntrust
  extends DelegateBaseActivity
  implements cp, cs
{
  public static boolean f = false;
  private String A = "1";
  private String B = "";
  private int C = 20;
  private int D = 0;
  private int E;
  private String F;
  private String G;
  private String H = "";
  private String I = "";
  private ArrayList<v> J;
  private String K;
  private String L;
  private String M;
  private String N;
  private String O;
  private int P = 1;
  private com.android.dazhihui.a.b.u Q;
  private com.android.dazhihui.a.b.u R;
  private com.android.dazhihui.a.b.u S;
  private com.android.dazhihui.a.b.u T;
  private com.android.dazhihui.a.b.u U;
  private com.android.dazhihui.a.b.u V;
  private com.android.dazhihui.a.b.u W;
  private com.android.dazhihui.a.b.u X;
  private com.android.dazhihui.a.b.u Y;
  protected int a = 0;
  protected int b = 0;
  protected int c = 0;
  public String[][] d = (String[][])null;
  public int[][] e = (int[][])null;
  public ArrayList<String> g;
  private DzhHeader h;
  private TableLayoutGroup i;
  private LinearLayout j;
  private CheckBox m;
  private TextView n;
  private TextView o;
  private TextView p;
  private TextView q;
  private EditText r;
  private EditText s;
  private EditText t;
  private EditText u;
  private EditText v;
  private Button w;
  private Button x;
  private String[] y = w.a;
  private String[] z = w.b;
  
  private void a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      Toast.makeText(this, "请输入" + this.o.getText() + "。", 0).show();
      return;
    }
    Toast.makeText(this, "请输入6位产品代码。", 0).show();
  }
  
  private void a(v paramv)
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    this.V = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("12384").a("1090", com.android.dazhihui.d.n.t(this.O)).a("1115", com.android.dazhihui.d.n.t(this.N)).a("1868", com.android.dazhihui.d.n.t(paramv.b)).a("1800", com.android.dazhihui.d.n.t(this.M)).a("2315", "2").h()) });
    registRequestListener(this.V);
    a(this.V, true);
  }
  
  private void a(Object paramObject)
  {
    v localv = (v)paramObject;
    if (localv.c.equals("0")) {
      a((v)paramObject);
    }
    while (!localv.c.equals("1")) {
      return;
    }
    TradeBrowser.a(this, localv.d);
  }
  
  private void a(boolean paramBoolean)
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    if ((this.E == 16385) || (this.E == 16386)) {}
    for (com.android.dazhihui.ui.delegate.b.h localh = com.android.dazhihui.ui.delegate.b.o.g("12692").a("1395", this.A);; localh = com.android.dazhihui.ui.delegate.b.o.g("12696"))
    {
      localh.a("1206", this.D).a("1277", this.C).a("2315", "2");
      this.Q = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.h()) });
      registRequestListener(this.Q);
      a(this.Q, paramBoolean);
      return;
    }
  }
  
  private void c()
  {
    this.i = ((TableLayoutGroup)findViewById(2131558886));
    this.i.setHeaderColumn(this.y);
    this.i.setPullDownLoading(false);
    this.i.setLoadingDown(false);
    this.i.setColumnClickable(null);
    this.i.setContinuousLoading(false);
    this.i.setHeaderBackgroundColor(getResources().getColor(2131493677));
    this.i.setDrawHeaderSeparateLine(false);
    this.i.setHeaderTextColor(getResources().getColor(2131493099));
    this.i.setHeaderFontSize(getResources().getDimension(2131230899));
    this.i.setHeaderHeight((int)getResources().getDimension(2131230814));
    this.i.setContentRowHeight(this.i.getContentHeight() / 5 * 4);
    this.i.setLeftPadding(25);
    this.i.setHeaderDivideDrawable(getResources().getDrawable(2130838328));
    this.i.setListDivideDrawable(getResources().getDrawable(2130838328));
    this.i.setRowHighLightBackgroudDrawable(getResources().getDrawable(2130838067));
    this.i.setStockNameColor(getResources().getColor(2131493235));
    this.i.setFirstColumnColorDifferent(true);
  }
  
  public static ArrayList<v> d(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    paramString = paramString.split("\\" + String.valueOf('\002'), -1);
    int i1 = paramString.length / 4;
    int k = 0;
    while (k < i1)
    {
      v localv = new v();
      localv.a = paramString[(k * 4 + 0)];
      localv.b = paramString[(k * 4 + 1)];
      localv.c = paramString[(k * 4 + 2)];
      localv.d = paramString[(k * 4 + 3)];
      localArrayList.add(localv);
      k += 1;
    }
    return localArrayList;
  }
  
  private void d()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {}
    while (this.r.getText().toString().length() != 6) {
      return;
    }
    this.U = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("12382").a("1026", "").a("6002", this.r.getText().toString()).a("2315", "2").h()) });
    registRequestListener(this.U);
    a(this.U, true);
  }
  
  private void e(String paramString)
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    this.T = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("12692").a("1206", 0).a("1277", 1).a("6002", paramString).a("2315", "2").h()) });
    registRequestListener(this.T);
    a(this.T, true);
  }
  
  private void f()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    this.W = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("12386").a("1090", com.android.dazhihui.d.n.t(this.O)).a("1115", com.android.dazhihui.d.n.t(this.N)).a("1026", "0").a("1800", com.android.dazhihui.d.n.t(this.M)).a("2315", "2").h()) });
    registRequestListener(this.W);
    a(this.W, true);
  }
  
  private void g()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    this.X = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("12694").a("6002", this.r.getText().toString()).a("1040", this.v.getText().toString()).a("1026", this.B).a("1021", "").a("1019", "").a("1041", this.v.getText().toString()).a("1396", this.P).a("2315", "2").h()) });
    registRequestListener(this.X);
    a(this.X, true);
  }
  
  private void h()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    this.Y = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("11926").a("1206", "0").a("1277", "1000").a("2315", "2").h()) });
    registRequestListener(this.Y);
    a(this.Y, true);
  }
  
  private void i()
  {
    if (this.r.getText().toString().length() < 6)
    {
      a(1);
      return;
    }
    if (this.v.getText().toString().equals(""))
    {
      a(0);
      return;
    }
    if ((this.E != 16387) && (!this.m.isChecked()))
    {
      new AlertDialog.Builder(this).setTitle("温馨提示").setMessage("本业务需要用户阅读并确认业务规则后方可继续。").setPositiveButton("确认", null).show();
      return;
    }
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    localBuilder.setTitle("交易确认");
    localBuilder.setMessage("产品代码：" + this.r.getText().toString() + "\n" + "产品名称：" + this.s.getText().toString() + "\n" + this.o.getText() + "：" + this.v.getText().toString() + "\n" + "\t\t是否继续交易？");
    localBuilder.setPositiveButton("确认", new g(this));
    localBuilder.setNegativeButton("返回", new n(this));
    localBuilder.create().show();
  }
  
  private void j()
  {
    this.r.addTextChangedListener(new o(this));
    this.w.setOnClickListener(new p(this));
    this.x.setOnClickListener(new q(this));
    this.i.setOnLoadingListener(new r(this));
    this.i.setOnTableLayoutClickListener(new s(this));
    this.u.setOnClickListener(new t(this));
    this.v.addTextChangedListener(new u(this));
  }
  
  private void k()
  {
    this.h = ((DzhHeader)findViewById(2131558513));
    this.n = ((TextView)findViewById(2131560952));
    this.o = ((TextView)findViewById(2131560956));
    this.p = ((TextView)findViewById(2131560676));
    this.r = ((EditText)findViewById(2131559140));
    this.s = ((EditText)findViewById(2131560950));
    this.t = ((EditText)findViewById(2131560951));
    this.u = ((EditText)findViewById(2131560953));
    this.q = ((TextView)findViewById(2131560955));
    this.v = ((EditText)findViewById(2131560957));
    this.w = ((Button)findViewById(2131560962));
    this.x = ((Button)findViewById(2131560963));
    this.j = ((LinearLayout)findViewById(2131560958));
    this.m = ((CheckBox)findViewById(2131560959));
  }
  
  private void l()
  {
    Bundle localBundle = getIntent().getExtras();
    this.E = localBundle.getInt("screenId");
    this.F = localBundle.getString("scode");
    switch (this.E)
    {
    }
    for (;;)
    {
      this.h.setOnHeaderButtonClickListener(this);
      this.h.a(this, this);
      return;
      this.n.setText("可用资金");
      this.o.setText("认购金额");
      this.w.setText("认购");
      this.u.setEnabled(false);
      this.G = "产品认购";
      this.A = "1";
      this.B = "100";
      continue;
      this.n.setText("可用资金");
      this.o.setText("申购金额");
      this.w.setText("申购");
      this.u.setEnabled(false);
      this.G = "产品申购";
      this.A = "2";
      this.B = "101";
      continue;
      this.n.setText("可赎份额");
      this.o.setText("赎回份额");
      this.w.setText("赎回");
      this.u.setEnabled(true);
      this.j.setVisibility(8);
      this.m.setVisibility(8);
      this.G = "产品赎回";
      this.B = "102";
      this.y = w.m;
      this.z = w.n;
    }
  }
  
  private void m()
  {
    this.s.setText("");
    this.t.setText("");
    this.u.setText("");
    this.v.setText("");
    this.q.setText("");
    this.m.setChecked(false);
    this.j.setVisibility(8);
    this.J = null;
    this.O = null;
    this.N = null;
    this.M = null;
    this.F = null;
    this.P = 1;
  }
  
  private void n()
  {
    this.j.removeAllViews();
    if (this.J != null)
    {
      int i1 = this.J.size();
      int k = 0;
      while (k < i1)
      {
        TextView localTextView = new TextView(this);
        localTextView.setTextSize(18.0F);
        localTextView.setTextColor(-65536);
        localTextView.getPaint().setFlags(8);
        localTextView.setClickable(true);
        localTextView.setText(((v)this.J.get(k)).a);
        localTextView.setOnClickListener(new l(this, k));
        localTextView.setPadding(20, 0, 20, 0);
        this.j.addView(localTextView);
        k += 1;
      }
      this.j.setVisibility(0);
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
  
  public BigDecimal a(String paramString1, String paramString2)
  {
    return new BigDecimal(paramString1).multiply(new BigDecimal(paramString2)).setScale(2, 4);
  }
  
  public void a()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    String str = "";
    if (this.E == 16385) {
      str = "65";
    }
    for (;;)
    {
      this.R = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("12124").a("1026", str).a("1021", "").a("1019", "").a("1036", "").a("1041", "").a("6002", this.r.getText().toString()).a("2315", "2").h()) });
      registRequestListener(this.R);
      a(this.R, true);
      return;
      if (this.E == 16386) {
        str = "66";
      } else if (this.E == 16387) {
        str = "67";
      }
    }
  }
  
  public void a(mh parammh)
  {
    if (this.a == 0) {
      return;
    }
    String[] arrayOfString = parammh.a;
    parammh = "";
    int k = 0;
    while (k < this.z.length)
    {
      if (this.z[k].equals("6002")) {
        parammh = arrayOfString[k];
      }
      k += 1;
    }
    b();
    this.r.setText(parammh);
  }
  
  public void b()
  {
    this.r.setText("");
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (m.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.h == null);
      this.h.a(paramy);
      return;
    } while (this.h == null);
    this.h.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 16424;
    paramct.d = this.G;
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.h = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, com.android.dazhihui.a.b.j paramj)
  {
    super.handleResponse(paramh, paramj);
    Object localObject1;
    if (paramh == this.Q)
    {
      localObject1 = ((com.android.dazhihui.a.b.v)paramj).b();
      if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, this))
      {
        localObject1 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
        if (((com.android.dazhihui.ui.delegate.b.h)localObject1).b())
        {
          this.a = ((com.android.dazhihui.ui.delegate.b.h)localObject1).g();
          this.c = ((com.android.dazhihui.ui.delegate.b.h)localObject1).b("1289");
          if ((this.a == 0) && (this.i.getDataModel().size() == 0))
          {
            this.i.setBackgroundDrawable(getResources().getDrawable(2130838490));
            h();
          }
        }
      }
    }
    label405:
    label425:
    label441:
    label468:
    label511:
    label583:
    label610:
    label616:
    label734:
    label859:
    label918:
    label931:
    label944:
    label958:
    label972:
    label1036:
    label1046:
    label1059:
    label1106:
    label1119:
    label1126:
    label1158:
    label1180:
    label1198:
    do
    {
      do
      {
        do
        {
          Object localObject3;
          int i1;
          do
          {
            do
            {
              return;
              if (this.a > 0)
              {
                localObject2 = new ArrayList();
                k = 0;
                while (k < this.a)
                {
                  localObject3 = new mh();
                  String[] arrayOfString = new String[this.y.length];
                  int[] arrayOfInt = new int[this.y.length];
                  i1 = 0;
                  while (i1 < this.y.length)
                  {
                    try
                    {
                      arrayOfString[i1] = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(k, this.z[i1]).trim();
                      if (arrayOfString[i1] == null) {
                        arrayOfString[i1] = "--";
                      }
                    }
                    catch (Exception localException)
                    {
                      for (;;)
                      {
                        arrayOfString[i1] = "--";
                      }
                    }
                    arrayOfString[i1] = com.android.dazhihui.ui.delegate.b.o.c(this.z[i1], arrayOfString[i1]);
                    arrayOfInt[i1] = getResources().getColor(2131493235);
                    i1 += 1;
                  }
                  ((mh)localObject3).a = arrayOfString;
                  ((mh)localObject3).b = arrayOfInt;
                  ((List)localObject2).add(localObject3);
                  k += 1;
                }
                this.i.a((List)localObject2, this.D);
              }
              h();
              if (paramh != this.T) {
                break;
              }
              localObject1 = ((com.android.dazhihui.a.b.v)paramj).b();
              if (!com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, this)) {
                break;
              }
              localObject3 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
              if (!((com.android.dazhihui.ui.delegate.b.h)localObject3).b()) {
                break label1036;
              }
            } while (((com.android.dazhihui.ui.delegate.b.h)localObject3).g() == 0);
            if (((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "2363") != null) {
              break;
            }
            localObject1 = "";
            this.H = ((String)localObject1);
            if (((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "2421") != null) {
              break label918;
            }
            localObject1 = "";
            this.I = ((String)localObject1);
            if (((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "6003") != null) {
              break label931;
            }
            localObject1 = "";
            if (((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "6002") != null) {
              break label944;
            }
            localObject2 = "";
            this.O = ((String)localObject2);
            this.N = ((String)localObject1);
            if (((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "2364") != null) {
              break label958;
            }
            localObject2 = "";
            this.L = ((String)localObject2);
            if (!this.g.contains(localObject1)) {
              break label972;
            }
            a();
            this.s.setText(this.H);
            this.t.setText(this.I);
            if (paramh == this.R)
            {
              localObject1 = ((com.android.dazhihui.a.b.v)paramj).b();
              if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, this))
              {
                localObject2 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
                if (!((com.android.dazhihui.ui.delegate.b.h)localObject2).b()) {
                  break label1119;
                }
                if (this.E != 16387) {
                  break label1059;
                }
                localObject3 = this.u;
                if (((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1462") != null) {
                  break label1046;
                }
                localObject1 = "";
                ((EditText)localObject3).setText((CharSequence)localObject1);
                localObject3 = this.q;
                if (((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "6090") != null) {
                  break label1106;
                }
                localObject1 = "";
                ((TextView)localObject3).setText((CharSequence)localObject1);
              }
            }
            if (paramh == this.X)
            {
              localObject1 = ((com.android.dazhihui.a.b.v)paramj).b();
              if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, this))
              {
                localObject2 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
                if (!((com.android.dazhihui.ui.delegate.b.h)localObject2).b()) {
                  break label1158;
                }
                localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1208");
                localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1042");
                if (localObject1 == null) {
                  break label1126;
                }
                new AlertDialog.Builder(this).setTitle("提示").setMessage((CharSequence)localObject1).setPositiveButton("确定", new k(this)).setNegativeButton("取消", new j(this)).create().show();
              }
            }
            if (paramh == this.S)
            {
              localObject1 = ((com.android.dazhihui.a.b.v)paramj).b();
              if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, this))
              {
                localObject1 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
                if (((com.android.dazhihui.ui.delegate.b.h)localObject1).b()) {
                  this.u.setText(((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1078"));
                }
              }
              d();
            }
            if (paramh != this.Y) {
              break label1198;
            }
            this.g = new ArrayList();
            localObject1 = ((com.android.dazhihui.a.b.v)paramj).b();
            if (!com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, this)) {
              break label1180;
            }
            localObject2 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
            if (!((com.android.dazhihui.ui.delegate.b.h)localObject2).b()) {
              break label1180;
            }
            i1 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).g();
          } while (i1 == 0);
          int k = 0;
          if (k < i1)
          {
            localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(k, "1115");
            localObject3 = this.g;
            if (localObject1 == null) {}
            for (localObject1 = "";; localObject1 = ((String)localObject1).trim())
            {
              ((ArrayList)localObject3).add(localObject1);
              k += 1;
              break label859;
              localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "2363");
              break;
              localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "2421");
              break label405;
              localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "6003");
              break label425;
              localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "6002");
              break label441;
              localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "2364");
              break label468;
              this.K = ((String)localObject1);
              new AlertDialog.Builder(this).setTitle("温馨提示").setMessage("您尚未开通理财账户，请点击“开户”按钮进入开户流程。").setPositiveButton("开户", new i(this)).setNegativeButton("返回", new h(this)).setCancelable(false).show();
              break label511;
              c(((com.android.dazhihui.ui.delegate.b.h)localObject3).d());
              return;
              localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1462");
              break label583;
              localObject3 = this.u;
              if (((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1078") == null) {}
              for (localObject1 = "";; localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1078"))
              {
                ((EditText)localObject3).setText((CharSequence)localObject1);
                d();
                break;
              }
              localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "6090");
              break label610;
              d();
              break label616;
              c("　　委托请求提交成功。合同号为：" + (String)localObject2);
              b();
              break label734;
              c(((com.android.dazhihui.ui.delegate.b.h)localObject2).d());
              b();
              return;
            }
          }
          if (this.F != null) {
            this.r.setText(this.F);
          }
          if (paramh != this.U) {
            break;
          }
          localObject1 = ((com.android.dazhihui.a.b.v)paramj).b();
          if (!com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, this)) {
            break;
          }
          localObject1 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
          if (!((com.android.dazhihui.ui.delegate.b.h)localObject1).b()) {
            break;
          }
        } while (((com.android.dazhihui.ui.delegate.b.h)localObject1).g() == 0);
        ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1819");
        ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1021");
        ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1862");
        ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1043");
        this.O = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1090");
        this.N = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1115");
        ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1864");
        ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1865");
        ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1866");
        Object localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1867");
        this.M = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1800");
        if (localObject2 != null) {
          this.J = d((String)localObject2);
        }
        n();
        if (paramh == this.V)
        {
          localObject1 = ((com.android.dazhihui.a.b.v)paramj).b();
          if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, this))
          {
            localObject1 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
            if (((com.android.dazhihui.ui.delegate.b.h)localObject1).b()) {
              c(((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1208"));
            }
          }
        }
      } while (paramh != this.W);
      paramh = ((com.android.dazhihui.a.b.v)paramj).b();
    } while (!com.android.dazhihui.ui.delegate.b.u.a(paramh, this));
    paramh = com.android.dazhihui.ui.delegate.b.h.b(paramh.e());
    if (paramh.b())
    {
      g();
      return;
    }
    c(paramh.d());
    b();
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    super.handleTimeout(paramh);
    if (paramh == this.Q) {
      this.i.d();
    }
    if (this == b.a().f()) {
      b(1);
    }
  }
  
  public void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    setContentView(2130903519);
    k();
    l();
    c();
    j();
    a(true);
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (paramh == this.Q) {
      this.i.d();
    }
    if (this == b.a().f()) {
      b(9);
    }
  }
  
  public void onOptionMenuSelect(int paramInt) {}
  
  public void onResume()
  {
    super.onResume();
    if (f)
    {
      this.s.setText(this.H);
      this.t.setText(this.I);
      this.g.add(this.K);
      if ((this.E == 16385) || (this.E == 16386)) {
        a();
      }
      f = false;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\otc\OtcEntrust.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */