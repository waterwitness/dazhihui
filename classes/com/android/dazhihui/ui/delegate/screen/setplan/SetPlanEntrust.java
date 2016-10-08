package com.android.dazhihui.ui.delegate.screen.setplan;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextPaint;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.b.b;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.delegate.screen.otc.TradeBrowser;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.mh;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SetPlanEntrust
  extends DelegateBaseActivity
  implements cp, cs
{
  public static boolean f = false;
  public static boolean g = false;
  private TextView A;
  private TextView B;
  private TextView C;
  private EditText D;
  private EditText E;
  private EditText F;
  private EditText G;
  private EditText H;
  private EditText I;
  private EditText J;
  private EditText K;
  private EditText L;
  private EditText M;
  private Button N;
  private Button O;
  private String[] P;
  private String[] Q;
  private String[] R = x.a;
  private String[] S = x.b;
  private String[] T = x.i;
  private String[] U = x.j;
  private String V = "";
  private String W = "";
  private int X = 20;
  private int Y = 0;
  protected int a = 0;
  private com.android.dazhihui.a.b.u aA;
  private com.android.dazhihui.a.b.u aB;
  private com.android.dazhihui.a.b.u aC;
  private com.android.dazhihui.a.b.u aD;
  private com.android.dazhihui.a.b.u aE;
  private com.android.dazhihui.a.b.u aF;
  private com.android.dazhihui.a.b.u aG;
  private int aa;
  private String ab;
  private String ac;
  private String ad;
  private String ae = "";
  private String af = "";
  private ArrayList<w> ag;
  private String ah;
  private String ai;
  private String aj;
  private String ak;
  private String al;
  private String am;
  private String an;
  private int ao = 1;
  private Spinner ap;
  private int aq;
  private String[] ar = { "份额分红", "现金分红" };
  private ScrollView as;
  private int at;
  private int au;
  private boolean av = false;
  private com.android.dazhihui.a.b.u aw;
  private com.android.dazhihui.a.b.u ax;
  private com.android.dazhihui.a.b.u ay;
  private com.android.dazhihui.a.b.u az;
  protected int b = 0;
  protected int c = 0;
  public String[][] d = (String[][])null;
  public int[][] e = (int[][])null;
  public ArrayList<String> h;
  private DzhHeader i;
  private TableLayoutGroup j;
  private LinearLayout m;
  private LinearLayout n;
  private LinearLayout o;
  private LinearLayout p;
  private LinearLayout q;
  private LinearLayout r;
  private LinearLayout s;
  private LinearLayout t;
  private LinearLayout u;
  private CheckBox v;
  private TextView w;
  private TextView x;
  private TextView y;
  private TextView z;
  
  private void a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      Toast.makeText(this, "请输入" + this.x.getText() + "。", 0).show();
      return;
    }
    Toast.makeText(this, "请输入6位产品代码。", 0).show();
  }
  
  private void a(w paramw)
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    this.aD = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("12384").a("1090", com.android.dazhihui.d.n.t(this.al)).a("1115", com.android.dazhihui.d.n.t(this.ak)).a("1868", com.android.dazhihui.d.n.t(paramw.b)).a("1800", com.android.dazhihui.d.n.t(this.aj)).a("2315", "2").h()) });
    registRequestListener(this.aD);
    a(this.aD, true);
  }
  
  private void a(Object paramObject)
  {
    w localw = (w)paramObject;
    if (localw.c.equals("0")) {
      a((w)paramObject);
    }
    while (!localw.c.equals("1")) {
      return;
    }
    paramObject = localw.d;
    if ((!((String)paramObject).contains("http://")) && (!((String)paramObject).contains("https://")))
    {
      TradeBrowser.a(this, "http://" + (String)paramObject);
      return;
    }
    TradeBrowser.a(this, (String)paramObject);
  }
  
  private void a(boolean paramBoolean)
  {
    com.android.dazhihui.ui.delegate.b.h localh = null;
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    if (this.aa == 20481) {
      localh = com.android.dazhihui.ui.delegate.b.o.g("12848").a("1395", "1");
    }
    for (;;)
    {
      localh.a("6002", "").a("6003", "").a("1552", "").a("2315", "2");
      this.aw = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.h()) });
      registRequestListener(this.aw);
      a(this.aw, paramBoolean);
      return;
      if (this.aa == 20482) {
        localh = com.android.dazhihui.ui.delegate.b.o.g("12848").a("1395", "2");
      } else if ((this.aa == 20483) || (this.aa == 20485) || (this.aa == 20486)) {
        localh = com.android.dazhihui.ui.delegate.b.o.g("12854").a("1395", "0");
      }
    }
  }
  
  public static ArrayList<w> d(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    paramString = paramString.split("\\" + String.valueOf('\002'), -1);
    int i1 = paramString.length / 4;
    int k = 0;
    while (k < i1)
    {
      w localw = new w();
      localw.a = paramString[(k * 4 + 0)];
      localw.b = paramString[(k * 4 + 1)];
      localw.c = paramString[(k * 4 + 2)];
      localw.d = paramString[(k * 4 + 3)];
      localArrayList.add(localw);
      k += 1;
    }
    return localArrayList;
  }
  
  private void e(String paramString)
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    com.android.dazhihui.ui.delegate.b.h localh = com.android.dazhihui.ui.delegate.b.o.g("12848");
    localh.a("6002", paramString).a("6003", "").a("1552", "").a("2315", "2");
    this.aB = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.h()) });
    registRequestListener(this.aB);
    a(this.aB, true);
  }
  
  private void f()
  {
    this.i = ((DzhHeader)findViewById(2131558513));
    this.A = ((TextView)findViewById(2131560977));
    this.B = ((TextView)findViewById(2131560978));
    this.C = ((TextView)findViewById(2131560979));
    this.w = ((TextView)findViewById(2131560952));
    this.x = ((TextView)findViewById(2131560956));
    this.y = ((TextView)findViewById(2131560676));
    this.D = ((EditText)findViewById(2131559140));
    this.E = ((EditText)findViewById(2131560950));
    this.F = ((EditText)findViewById(2131560951));
    this.G = ((EditText)findViewById(2131560953));
    this.z = ((TextView)findViewById(2131560954));
    this.I = ((EditText)findViewById(2131560955));
    this.H = ((EditText)findViewById(2131560957));
    this.N = ((Button)findViewById(2131560962));
    this.O = ((Button)findViewById(2131560963));
    this.n = ((LinearLayout)findViewById(2131560986));
    this.o = ((LinearLayout)findViewById(2131560987));
    this.ap = ((Spinner)findViewById(2131560989));
    this.m = ((LinearLayout)findViewById(2131560958));
    this.v = ((CheckBox)findViewById(2131560959));
    this.p = ((LinearLayout)findViewById(2131560994));
    this.L = ((EditText)findViewById(2131560996));
    this.q = ((LinearLayout)findViewById(2131560983));
    this.J = ((EditText)findViewById(2131560985));
    this.t = ((LinearLayout)findViewById(2131560990));
    this.M = ((EditText)findViewById(2131560992));
    this.u = ((LinearLayout)findViewById(2131560993));
    this.r = ((LinearLayout)findViewById(2131560997));
    this.s = ((LinearLayout)findViewById(2131560980));
    this.K = ((EditText)findViewById(2131560999));
    this.as = ((ScrollView)findViewById(2131559734));
  }
  
  private void g()
  {
    switch (this.aa)
    {
    }
    for (;;)
    {
      this.i.setOnHeaderButtonClickListener(this);
      this.i.a(this, this);
      return;
      this.w.setText("可用资金");
      this.x.setText("认购金额");
      this.N.setText("认购");
      this.G.setEnabled(false);
      this.ad = "产品认购";
      this.V = "1";
      this.W = "2";
      continue;
      this.w.setText("可用资金");
      this.x.setText("申购金额");
      this.N.setText("申购");
      this.G.setEnabled(false);
      this.ad = "产品申购";
      this.V = "1";
      this.W = "1";
      continue;
      this.w.setText("可用份额");
      this.x.setText("赎回份额");
      this.N.setText("赎回");
      this.G.setEnabled(true);
      this.m.setVisibility(8);
      this.v.setVisibility(8);
      this.ad = "产品赎回";
      this.V = "2";
      this.W = "3";
      continue;
      this.w.setText("当前市值");
      this.x.setText("持仓份额");
      this.H.setEnabled(false);
      this.N.setText("确认");
      this.G.setEnabled(true);
      this.o.setVisibility(0);
      this.m.setVisibility(8);
      this.v.setVisibility(8);
      this.s.setVisibility(8);
      ArrayAdapter localArrayAdapter = new ArrayAdapter(this, 17367048, this.ar);
      localArrayAdapter.setDropDownViewResource(17367049);
      this.ap.setAdapter(localArrayAdapter);
      this.ap.setSelection(0);
      this.aq = 0;
      this.ad = "分红方式设置";
      this.W = "102";
      continue;
      this.A.setText("转出代码        ");
      this.B.setText("产品名称        ");
      this.C.setText("产品净值        ");
      this.w.setText("当前市值        ");
      this.t.setVisibility(0);
      this.u.setVisibility(8);
      this.r.setVisibility(0);
      this.N.setText("确认");
      this.G.setEnabled(true);
      this.q.setVisibility(0);
      this.m.setVisibility(8);
      this.v.setVisibility(8);
      this.s.setVisibility(8);
      this.p.setVisibility(0);
      this.ad = "集合计划转换";
      this.W = "102";
    }
  }
  
  private void h()
  {
    this.j = ((TableLayoutGroup)findViewById(2131558886));
    this.j.setHeaderColumn(this.P);
    this.j.setPullDownLoading(false);
    this.j.setLoadingDown(false);
    this.j.setColumnClickable(null);
    this.j.setContinuousLoading(false);
    this.j.setHeaderBackgroundColor(getResources().getColor(2131493677));
    this.j.setDrawHeaderSeparateLine(false);
    this.j.setHeaderTextColor(getResources().getColor(2131493099));
    this.j.setHeaderFontSize(getResources().getDimension(2131230899));
    this.j.setHeaderHeight((int)getResources().getDimension(2131230814));
    this.j.setContentRowHeight(this.j.getContentHeight() / 5 * 4);
    this.j.setLeftPadding(25);
    this.j.setHeaderDivideDrawable(getResources().getDrawable(2130838328));
    this.j.setListDivideDrawable(getResources().getDrawable(2130838328));
    this.j.setRowHighLightBackgroudDrawable(getResources().getDrawable(2130838067));
    this.j.setStockNameColor(getResources().getColor(2131493235));
    this.j.setFirstColumnColorDifferent(true);
  }
  
  private void i()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {}
    while (this.D.getText().toString().length() != 6) {
      return;
    }
    this.ac = this.D.getText().toString();
    this.aC = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("12382").a("1026", "").a("6002", this.ac).a("2315", "2").h()) });
    registRequestListener(this.aC);
    a(this.aC, true);
  }
  
  private void j()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    this.aE = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("12386").a("1090", com.android.dazhihui.d.n.t(this.al)).a("1115", com.android.dazhihui.d.n.t(this.ak)).a("1026", "0").a("1800", com.android.dazhihui.d.n.t(this.aj)).a("2315", "2").h()) });
    registRequestListener(this.aE);
    a(this.aE, true);
  }
  
  private void k()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    com.android.dazhihui.ui.delegate.b.h localh = com.android.dazhihui.ui.delegate.b.o.g("12850").a("1026", this.W).a("6002", this.D.getText().toString()).a("6003", this.an).a("1040", this.H.getText().toString()).a("1945", this.V).a("1396", this.ao).a("1800", "").a("1552", "").a("2315", "2");
    if (this.aa == 20483) {
      localh.a("1583", "2");
    }
    this.aF = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.h()) });
    registRequestListener(this.aF);
    a(this.aF, true);
  }
  
  private void l()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    this.aG = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("11926").a("1206", "0").a("1277", "1000").a("2315", "").h()) });
    registRequestListener(this.aG);
    a(this.aG, true);
  }
  
  private void m()
  {
    if (this.D.getText().toString().length() < 6)
    {
      a(1);
      return;
    }
    if ((this.aa != 20486) && (this.aa != 20485) && (this.H.getText().toString().equals("")))
    {
      a(0);
      return;
    }
    if (((this.aa == 20481) || (this.aa == 20482)) && (!this.v.isChecked()))
    {
      new AlertDialog.Builder(this).setTitle("温馨提示").setMessage("本业务需要用户阅读并确认业务规则后方可继续。").setPositiveButton("确认", null).show();
      return;
    }
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    localBuilder.setTitle("交易确认");
    StringBuffer localStringBuffer = new StringBuffer().append("产品代码：").append(this.D.getText().toString()).append("\n").append("产品名称：").append(this.E.getText().toString()).append("\n");
    if (this.aa == 20486) {
      localStringBuffer.append("转入产品代码：").append(this.M.getText().toString()).append("\n").append("转入产品名称：").append(this.K.getText().toString()).append("\n").append("转入份额：").append(this.L.getText().toString()).append("\n");
    }
    for (;;)
    {
      localStringBuffer.append("\t\t是否继续交易？");
      localBuilder.setMessage(localStringBuffer.toString());
      localBuilder.setPositiveButton("确认", new o(this));
      localBuilder.setNegativeButton("返回", new p(this));
      localBuilder.create().show();
      return;
      if (this.aa == 20485)
      {
        if (this.aq == 0) {
          localStringBuffer.append("分红方式：").append("份额分红").append("\n");
        } else if (this.aq == 1) {
          localStringBuffer.append("分红方式：").append("现金分红\t").append("\n");
        }
      }
      else {
        localStringBuffer.append(this.x.getText()).append("：").append(this.H.getText().toString()).append("\n");
      }
    }
  }
  
  private void n()
  {
    this.D.addTextChangedListener(new q(this));
    this.M.addTextChangedListener(new r(this));
    this.ap.setOnItemSelectedListener(new s(this));
    this.N.setOnClickListener(new t(this));
    this.O.setOnClickListener(new u(this));
    this.j.setOnLoadingListener(new v(this));
    this.j.setOnTableLayoutClickListener(new g(this));
    this.G.setOnClickListener(new h(this));
    this.H.addTextChangedListener(new i(this));
  }
  
  private void o()
  {
    this.E.setText("");
    this.F.setText("");
    this.G.setText("");
    this.H.setText("");
    this.I.setText("");
    this.J.setText("");
    this.v.setChecked(false);
    this.m.setVisibility(8);
    this.ag = null;
    this.al = null;
    this.ak = null;
    this.aj = null;
    this.ab = null;
    this.ao = 1;
    this.M.setText("");
    this.K.setText("");
    this.L.setText("");
  }
  
  private void p()
  {
    this.m.removeAllViews();
    if (this.ag != null)
    {
      int i1 = this.ag.size();
      int k = 0;
      while (k < i1)
      {
        TextView localTextView = new TextView(this);
        localTextView.setTextSize(18.0F);
        localTextView.setTextColor(-65536);
        localTextView.getPaint().setFlags(8);
        localTextView.setClickable(true);
        localTextView.setText(((w)this.ag.get(k)).a);
        localTextView.setOnClickListener(new n(this, k));
        localTextView.setPadding(20, 0, 20, 0);
        this.m.addView(localTextView);
        k += 1;
      }
      this.m.setVisibility(0);
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
    this.L.getText().toString();
    com.android.dazhihui.ui.delegate.b.h localh = com.android.dazhihui.ui.delegate.b.o.g("12866");
    localh.a("6002", this.D.getText().toString()).a("6003", "").a("6067", this.M.getText().toString()).a("1040", this.L.getText().toString()).a("1583", "2").a("1396", this.ao).a("2315", "2");
    this.ax = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.h()) });
    registRequestListener(this.ax);
    a(this.ax, true);
  }
  
  public void a(mh parammh)
  {
    if (this.a == 0) {}
    String str5;
    String str3;
    String str2;
    do
    {
      return;
      String[] arrayOfString = parammh.a;
      String str1 = "";
      String str4 = "";
      String str7 = "";
      String str8 = "";
      String str6 = "";
      str5 = "";
      str3 = "";
      str2 = "";
      parammh = "";
      int k = 0;
      while (k < this.Q.length)
      {
        if (this.Q[k].equals("6002")) {
          str1 = arrayOfString[k];
        }
        if (this.Q[k].equals("2363")) {
          str4 = arrayOfString[k];
        }
        if (this.Q[k].equals("1250")) {
          str7 = arrayOfString[k];
        }
        if (this.Q[k].equals("1336")) {
          str8 = arrayOfString[k];
        }
        if (this.Q[k].equals("1098")) {
          str6 = arrayOfString[k];
        }
        if (this.Q[k].equals("1065")) {
          str5 = arrayOfString[k];
        }
        if (this.Q[k].equals("1110")) {
          str3 = arrayOfString[k];
        }
        if (this.Q[k].equals("1062")) {
          str2 = arrayOfString[k];
        }
        if (this.Q[k].equals("1094")) {
          parammh = arrayOfString[k];
        }
        if (this.Q[k].equals("6003")) {
          this.an = arrayOfString[k];
        }
        k += 1;
      }
      d();
      this.D.setText(str1);
      this.E.setText(str4);
      if ((this.aa == 20481) || (this.aa == 20482))
      {
        this.F.setText(str7);
        this.I.setText(str8);
        return;
      }
      if (this.aa == 20483)
      {
        this.G.setText(str6);
        this.F.setText(parammh);
        return;
      }
      if (this.aa == 20485)
      {
        this.F.setText(parammh);
        this.G.setText(str5);
        this.H.setText(str3);
        return;
      }
    } while (this.aa != 20486);
    this.F.setText(parammh);
    this.G.setText(str5);
    this.I.setText(str3);
    float f1 = Float.parseFloat(str5);
    float f2 = Float.parseFloat(str3);
    float f3 = Float.parseFloat(str2);
    this.J.setText(String.valueOf(Float.valueOf(f1 - f2 * f3)));
  }
  
  public void b()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    com.android.dazhihui.ui.delegate.b.h localh = com.android.dazhihui.ui.delegate.b.o.g("12868");
    localh.a("6002", this.D.getText().toString()).a("6003", this.an).a("1096", this.aq).a("1552", "").a("2315", "2");
    this.ay = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.h()) });
    registRequestListener(this.ay);
    a(this.ay, true);
  }
  
  public void c()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    String str = "";
    if (this.aa == 20481) {
      str = "2";
    }
    for (;;)
    {
      this.az = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("12856").a("1026", str).a("6002", this.D.getText().toString()).a("2315", "2").h()) });
      registRequestListener(this.az);
      a(this.az, true);
      return;
      if (this.aa == 20482) {
        str = "1";
      } else if (this.aa == 20483) {
        str = "3";
      } else if (this.aa == 20486) {
        str = "4";
      }
    }
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 16424;
    paramct.d = this.ad;
    paramct.p = this;
  }
  
  public void d()
  {
    this.D.setText("");
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.i = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, com.android.dazhihui.a.b.j paramj)
  {
    super.handleResponse(paramh, paramj);
    Object localObject1;
    if (paramh == this.aw)
    {
      localObject1 = ((com.android.dazhihui.a.b.v)paramj).b();
      if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, this))
      {
        localObject1 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
        if (((com.android.dazhihui.ui.delegate.b.h)localObject1).b())
        {
          this.a = ((com.android.dazhihui.ui.delegate.b.h)localObject1).g();
          this.c = ((com.android.dazhihui.ui.delegate.b.h)localObject1).b("1289");
          if ((this.a == 0) && (this.j.getDataModel().size() == 0))
          {
            this.j.setBackgroundDrawable(getResources().getDrawable(2130838490));
            l();
          }
        }
      }
    }
    label431:
    label453:
    label469:
    label503:
    label525:
    label541:
    label557:
    label573:
    label604:
    label667:
    label727:
    label754:
    label894:
    label1028:
    label1093:
    label1107:
    label1121:
    label1135:
    label1149:
    label1163:
    label1177:
    label1191:
    label1205:
    label1277:
    label1342:
    label1352:
    label1366:
    label1436:
    label1463:
    label1495:
    label1519:
    label1537:
    do
    {
      do
      {
        Object localObject2;
        Object localObject3;
        Object localObject4;
        Object localObject5;
        int i1;
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
              localObject4 = new String[this.P.length];
              localObject5 = new int[this.P.length];
              i1 = 0;
              while (i1 < this.P.length)
              {
                try
                {
                  localObject4[i1] = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(k, this.Q[i1]).trim();
                  if (localObject4[i1] == null) {
                    localObject4[i1] = "--";
                  }
                }
                catch (Exception localException)
                {
                  for (;;)
                  {
                    localObject4[i1] = "--";
                  }
                }
                localObject4[i1] = com.android.dazhihui.ui.delegate.b.o.c(this.Q[i1], localObject4[i1]);
                localObject5[i1] = getResources().getColor(2131493235);
                i1 += 1;
              }
              ((mh)localObject3).a = ((String[])localObject4);
              ((mh)localObject3).b = ((int[])localObject5);
              ((List)localObject2).add(localObject3);
              k += 1;
            }
            this.j.a((List)localObject2, this.Y);
          }
          l();
          if (paramh == this.aB)
          {
            localObject1 = ((com.android.dazhihui.a.b.v)paramj).b();
            if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, this))
            {
              localObject5 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
              if (!((com.android.dazhihui.ui.delegate.b.h)localObject5).b()) {
                break label1342;
              }
              if (((com.android.dazhihui.ui.delegate.b.h)localObject5).g() == 0)
              {
                Toast.makeText(this, "取不到产品信息", 1).show();
                return;
              }
              if (((com.android.dazhihui.ui.delegate.b.h)localObject5).a(0, "2363") != null) {
                break;
              }
              localObject1 = "";
              this.ae = ((String)localObject1);
              if (((com.android.dazhihui.ui.delegate.b.h)localObject5).a(0, "2421") != null) {
                break label1093;
              }
              localObject1 = "";
              this.af = ((String)localObject1);
              if (((com.android.dazhihui.ui.delegate.b.h)localObject5).a(0, "6003") != null) {
                break label1107;
              }
              localObject1 = "";
              if (((com.android.dazhihui.ui.delegate.b.h)localObject5).a(0, "6002") != null) {
                break label1121;
              }
              localObject2 = "";
              this.al = ((String)localObject2);
              this.ak = ((String)localObject1);
              this.an = ((String)localObject1);
              if (((com.android.dazhihui.ui.delegate.b.h)localObject5).a(0, "2364") != null) {
                break label1135;
              }
              localObject2 = "";
              this.ai = ((String)localObject2);
              if (((com.android.dazhihui.ui.delegate.b.h)localObject5).a(0, "1250") != null) {
                break label1149;
              }
              localObject2 = "";
              if (((com.android.dazhihui.ui.delegate.b.h)localObject5).a(0, "1065") != null) {
                break label1163;
              }
              localObject3 = "";
              if (((com.android.dazhihui.ui.delegate.b.h)localObject5).a(0, "1110") != null) {
                break label1177;
              }
              localObject4 = "";
              if (((com.android.dazhihui.ui.delegate.b.h)localObject5).a(0, "1062") != null) {
                break label1191;
              }
              localObject5 = "";
              if (this.aa == 20486)
              {
                if (!g) {
                  break label1205;
                }
                g = false;
                this.K.setText(this.ae);
              }
              localObject3 = this.M.getText().toString();
              if ((localObject3 == null) || (((String)localObject3).equals(""))) {
                this.E.setText(this.ae);
              }
              this.F.setText((CharSequence)localObject2);
              if (!this.h.contains(localObject1)) {
                break label1277;
              }
              c();
            }
          }
          if (paramh == this.az)
          {
            localObject1 = ((com.android.dazhihui.a.b.v)paramj).b();
            if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, this))
            {
              localObject2 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
              if (!((com.android.dazhihui.ui.delegate.b.h)localObject2).b()) {
                break label1436;
              }
              if (((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1462") != null) {
                break label1352;
              }
              localObject1 = "";
              this.am = ((String)localObject1);
              if (this.aa != 20483) {
                break label1366;
              }
              this.G.setText(this.am);
            }
          }
          if ((paramh == this.aF) || (paramh == this.ax) || (paramh == this.ay))
          {
            localObject1 = ((com.android.dazhihui.a.b.v)paramj).b();
            if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, this))
            {
              localObject2 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
              if (!((com.android.dazhihui.ui.delegate.b.h)localObject2).b()) {
                break label1495;
              }
              localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1208");
              localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1042");
              if (localObject1 == null) {
                break label1463;
              }
              new AlertDialog.Builder(this).setTitle("提示").setMessage((CharSequence)localObject1).setPositiveButton("确定", new m(this)).setNegativeButton("取消", new l(this)).create().show();
            }
          }
          if (paramh == this.aA)
          {
            localObject1 = ((com.android.dazhihui.a.b.v)paramj).b();
            if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, this))
            {
              localObject1 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
              if (((com.android.dazhihui.ui.delegate.b.h)localObject1).b()) {
                this.G.setText(((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1078"));
              }
            }
            i();
          }
          if (paramh != this.aG) {
            break label1537;
          }
          this.h = new ArrayList();
          localObject1 = ((com.android.dazhihui.a.b.v)paramj).b();
          if (!com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, this)) {
            break label1519;
          }
          localObject2 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
          if (!((com.android.dazhihui.ui.delegate.b.h)localObject2).b()) {
            break label1519;
          }
          i1 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).g();
        } while (i1 == 0);
        int k = 0;
        if (k < i1)
        {
          localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(k, "1115");
          localObject3 = this.h;
          if (localObject1 == null) {}
          for (localObject1 = "";; localObject1 = ((String)localObject1).trim())
          {
            ((ArrayList)localObject3).add(localObject1);
            k += 1;
            break label1028;
            localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject5).a(0, "2363");
            break;
            localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject5).a(0, "2421");
            break label431;
            localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject5).a(0, "6003");
            break label453;
            localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject5).a(0, "6002");
            break label469;
            localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject5).a(0, "2364");
            break label503;
            localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject5).a(0, "1250");
            break label525;
            localObject3 = ((com.android.dazhihui.ui.delegate.b.h)localObject5).a(0, "1065");
            break label541;
            localObject4 = ((com.android.dazhihui.ui.delegate.b.h)localObject5).a(0, "1110");
            break label557;
            localObject5 = ((com.android.dazhihui.ui.delegate.b.h)localObject5).a(0, "1062");
            break label573;
            this.E.setText(this.al);
            this.F.setText((CharSequence)localObject2);
            this.G.setText((CharSequence)localObject3);
            float f1 = Float.parseFloat((String)localObject3);
            float f2 = Float.parseFloat((String)localObject4);
            float f3 = Float.parseFloat((String)localObject5);
            this.J.setText(String.valueOf(Float.valueOf(f1 - f2 * f3)));
            break label604;
            this.ah = ((String)localObject1);
            new AlertDialog.Builder(this).setTitle("温馨提示").setMessage("您尚未开通理财账户，请点击“开户”按钮进入开户流程。").setPositiveButton("开户", new k(this)).setNegativeButton("返回", new j(this)).setCancelable(false).show();
            break label667;
            c(((com.android.dazhihui.ui.delegate.b.h)localObject5).d());
            return;
            localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1462");
            break label727;
            if ((this.aa != 20481) && (this.aa != 20482)) {
              break label754;
            }
            localObject3 = this.G;
            if (((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1078") == null) {}
            for (localObject1 = "";; localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1078"))
            {
              ((EditText)localObject3).setText((CharSequence)localObject1);
              i();
              break;
            }
            if ((this.aa != 20481) && (this.aa != 20482)) {
              break label754;
            }
            i();
            break label754;
            c("　　委托请求提交成功。合同号为：" + (String)localObject2);
            d();
            break label894;
            c(((com.android.dazhihui.ui.delegate.b.h)localObject2).d());
            d();
            return;
          }
        }
        if (this.ab != null) {
          this.D.setText(this.ab);
        }
        if (paramh == this.aC)
        {
          localObject1 = ((com.android.dazhihui.a.b.v)paramj).b();
          if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, this))
          {
            localObject1 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
            if (((com.android.dazhihui.ui.delegate.b.h)localObject1).b())
            {
              if (((com.android.dazhihui.ui.delegate.b.h)localObject1).g() == 0)
              {
                this.av = true;
                return;
              }
              this.av = false;
              ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1819");
              ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1021");
              ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1862");
              ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1043");
              this.al = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1090");
              this.ak = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1115");
              ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1864");
              ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1865");
              ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1866");
              localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1867");
              this.aj = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1800");
              if (localObject2 != null) {
                this.ag = d((String)localObject2);
              }
              p();
            }
          }
        }
        if (paramh == this.aD)
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
      } while (paramh != this.aE);
      paramh = ((com.android.dazhihui.a.b.v)paramj).b();
    } while (!com.android.dazhihui.ui.delegate.b.u.a(paramh, this));
    paramh = com.android.dazhihui.ui.delegate.b.h.b(paramh.e());
    if (paramh.b())
    {
      k();
      return;
    }
    c(paramh.d());
    d();
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    super.handleTimeout(paramh);
    if (paramh == this.aw) {
      this.j.d();
    }
    if (this == b.a().f()) {
      b(1);
    }
  }
  
  public void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    setContentView(2130903531);
    this.aa = getIntent().getExtras().getInt("screenId");
    if ((this.aa == 20481) || (this.aa == 20482)) {
      this.P = this.R;
    }
    for (this.Q = this.S;; this.Q = this.U)
    {
      do
      {
        f();
        g();
        h();
        n();
        a(true);
        this.au = (com.android.dazhihui.g.a().n() / 3 * 2);
        new Handler().postDelayed(new f(this), 500L);
        return;
      } while ((this.aa != 20483) && (this.aa != 20485) && (this.aa != 20486));
      this.P = this.T;
    }
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (paramh == this.aw) {
      this.j.d();
    }
    if (this == b.a().f()) {
      b(9);
    }
  }
  
  public void onResume()
  {
    super.onResume();
    if (f)
    {
      this.E.setText(this.ae);
      this.F.setText(this.af);
      this.h.add(this.ah);
      if ((this.aa == 20481) || (this.aa == 20482)) {
        c();
      }
      f = false;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\setplan\SetPlanEntrust.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */