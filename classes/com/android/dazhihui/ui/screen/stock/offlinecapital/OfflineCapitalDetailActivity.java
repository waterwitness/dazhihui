package com.android.dazhihui.ui.screen.stock.offlinecapital;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.t;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinZhengRequestData;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse.Ans_Comm_Data;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse.Ans_Msg_Hdr;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse.Answer;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.android.dazhihui.ui.screen.y;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;
import org.apache.http.entity.StringEntity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class OfflineCapitalDetailActivity
  extends BaseActivity
  implements View.OnClickListener, AdapterView.OnItemClickListener
{
  public static final String[] a = { "设置我的持仓股票", "删除手工记账", "常见问题" };
  public static String[] b = { "同步持仓股", "取消同步当前账户", "在“我”显示", "常见问题" };
  private m A;
  private ArrayList<ag> B;
  private n C;
  private String[] D;
  private com.android.dazhihui.ui.delegate.c.c E;
  private String F;
  private String G;
  private int H;
  private String I;
  private String J;
  private int K;
  private int L;
  private int M;
  private String N;
  private com.android.dazhihui.a.b.u O;
  private com.android.dazhihui.a.b.u P;
  private com.android.dazhihui.a.b.e Q;
  private com.android.dazhihui.a.b.e R;
  private t S;
  private t T;
  private boolean U = true;
  private String V = "0";
  private String[] W = { "名称", "市值", "盈亏", "收益率", "持仓", "可用", "成本", "现价" };
  private String[] X = { "1037", "1065", "1064", "1320", "1060", "1061", "1062", "1181", "1036", "1019", "1021" };
  private String Y;
  private String Z;
  private String aa;
  private String ab;
  private String ac;
  private String ad;
  private String ae;
  private ag af;
  private String ag;
  private String ah;
  private String ai;
  private String aj;
  private ArrayList<n> ak = new ArrayList();
  private boolean al;
  private Double am = Double.valueOf(0.0D);
  private String an;
  private String ao;
  private y ap = y.a;
  k c;
  AlertDialog d = null;
  AlertDialog e = null;
  AlertDialog f = null;
  public Comparator<ag> g = new i(this);
  private RelativeLayout h;
  private View i;
  private View j;
  private TextView k;
  private TextView l;
  private TextView m;
  private TextView n;
  private TextView o;
  private TextView p;
  private TextView q;
  private TextView r;
  private ImageView s;
  private ImageView t;
  private PopupWindow u;
  private ListView v;
  private LayoutInflater w;
  private l x;
  private com.android.dazhihui.c.a.d y;
  private String z = "0";
  
  private void a(Context paramContext, String paramString)
  {
    View localView = LayoutInflater.from(paramContext).inflate(2130903354, null);
    Object localObject = (TextView)localView.findViewById(2131558565);
    paramString = paramString.split("_");
    paramString = "****" + paramString[1].substring(paramString[1].length() - 4, paramString[1].length()) + "(" + paramString[0] + ")";
    ((TextView)localObject).setText("账户" + paramString + "已在“我”页面显示");
    paramString = (Button)localView.findViewById(2131558581);
    localObject = (Button)localView.findViewById(2131560127);
    h localh = new h(this);
    paramString.setOnClickListener(localh);
    ((Button)localObject).setOnClickListener(localh);
    paramContext = new AlertDialog.Builder(new ContextThemeWrapper(paramContext, 2131296289));
    paramContext.setView(localView);
    this.f = paramContext.create();
    this.f.show();
  }
  
  private void b(Context paramContext)
  {
    View localView = LayoutInflater.from(paramContext).inflate(2130903351, null);
    Object localObject = (TextView)localView.findViewById(2131558565);
    if (this.H == 1) {
      ((TextView)localObject).setText("你的数据会被删除，是否确定要删除该资产？");
    }
    for (;;)
    {
      localObject = (Button)localView.findViewById(2131558581);
      Button localButton = (Button)localView.findViewById(2131560127);
      f localf = new f(this);
      ((Button)localObject).setOnClickListener(localf);
      localButton.setOnClickListener(localf);
      paramContext = new AlertDialog.Builder(new ContextThemeWrapper(paramContext, 2131296289));
      paramContext.setView(localView);
      this.d = paramContext.create();
      this.d.show();
      return;
      if (this.H == 2) {
        ((TextView)localObject).setText("确定取消该同步数据？");
      }
    }
  }
  
  private void m()
  {
    if (this.ap == y.b) {}
    for (View localView = LayoutInflater.from(this).inflate(2130903360, null);; localView = LayoutInflater.from(this).inflate(2130903359, null))
    {
      GridView localGridView = (GridView)localView.findViewById(2131560018);
      LinearLayout localLinearLayout = (LinearLayout)localView.findViewById(2131560016);
      this.c = new k(this);
      localLinearLayout.requestLayout();
      localGridView.setNumColumns(1);
      localGridView.setAdapter(this.c);
      localGridView.setOnItemClickListener(new b(this));
      this.u = new PopupWindow(localView);
      this.u.setOutsideTouchable(true);
      this.u.setOnDismissListener(new c(this));
      this.u.setFocusable(true);
      this.u.setBackgroundDrawable(new ColorDrawable(0));
      this.u.setWidth((int)(com.android.dazhihui.g.a().m() / 3 * 1.3D));
      this.u.setHeight(-2);
      return;
    }
  }
  
  private void n()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    this.R = new com.android.dazhihui.a.b.e();
    this.R.c("https://uatopen.hs.net/secu/v1/stockposition_qry");
    this.R.b("UTF-8");
    this.R.a("Bearer " + com.android.dazhihui.ui.delegate.b.o.d);
    this.R.a("targetcomp_id", com.android.dazhihui.c.a.a.C[com.android.dazhihui.ui.a.e.a().j()][6]);
    this.R.a("sendercomp_id", "90013");
    this.R.a("exchange_type", "");
    this.R.a("stock_account", "");
    this.R.a("stock_code", "");
    this.R.a("position_str", "");
    this.R.a("request_num", "");
    registRequestListener(this.R);
    sendRequest(this.R);
  }
  
  private void o()
  {
    Vector localVector = f();
    if (localVector.size() > 0)
    {
      x[] arrayOfx = new x[1];
      arrayOfx[0] = new x(2955);
      arrayOfx[0].c(107);
      arrayOfx[0].c(32897);
      arrayOfx[0].a(localVector);
      arrayOfx[0].c("2955-107-离线持仓-" + localVector);
      if (this.A == null)
      {
        this.A = new m(arrayOfx);
        this.A.a("2955--离线持仓--自动包 NioRequest");
        registRequestListener(this.A);
      }
      for (;;)
      {
        setAutoRequest(this.A);
        sendRequest(this.A);
        return;
        this.A.a(arrayOfx);
      }
    }
    this.A = null;
    setAutoRequest(null);
  }
  
  private void p()
  {
    Collections.sort(this.B, this.g);
    this.x.notifyDataSetChanged();
    Object localObject2;
    Object localObject1;
    Object localObject3;
    if (this.B.size() <= 0)
    {
      this.s.setVisibility(0);
      this.v.setVisibility(8);
      localObject2 = a(i());
      localObject1 = localObject2;
      if (((String)localObject2).equals(".00")) {
        localObject1 = "0.00";
      }
      this.o.setText((CharSequence)localObject1);
      localObject2 = Double.valueOf(0.0D);
      localObject1 = localObject2;
      if (this.H == 2)
      {
        this.y = com.android.dazhihui.c.a.d.a();
        localObject3 = this.y.b("zszdev" + this.I);
        this.y.g();
        localObject1 = localObject2;
        if (!TextUtils.isEmpty((CharSequence)localObject3)) {
          localObject1 = Double.valueOf((String)localObject3);
        }
      }
      System.out.println("zszdev = " + localObject1);
      double d1 = j().doubleValue();
      localObject2 = a(Double.valueOf(((Double)localObject1).doubleValue() + d1));
      localObject1 = localObject2;
      if (((String)localObject2).equals(".00")) {
        localObject1 = "0.00";
      }
      this.p.setText((CharSequence)localObject1);
      localObject2 = a(k());
      localObject1 = localObject2;
      if (((String)localObject2).equals(".00")) {
        localObject1 = "0.00";
      }
      localObject2 = localObject1;
      if (k().doubleValue() > 0.0D) {
        localObject2 = "+" + (String)localObject1;
      }
      this.q.setText((CharSequence)localObject2);
      if (k().doubleValue() >= 0.0D) {
        break label517;
      }
      this.q.setTextColor(getResources().getColor(2131492932));
    }
    for (;;)
    {
      localObject2 = a(Double.valueOf(this.z));
      localObject1 = localObject2;
      if (((String)localObject2).equals(".00")) {
        localObject1 = "0.00";
      }
      this.r.setText((CharSequence)localObject1);
      localObject3 = l();
      localObject2 = a((Double)localObject3);
      localObject1 = localObject2;
      if (!((String)localObject2).startsWith("-"))
      {
        localObject1 = localObject2;
        if (!((String)localObject2).equals("0.00")) {
          localObject1 = "+" + (String)localObject2;
        }
      }
      localObject2 = localObject1;
      if (((String)localObject1).equals("+.00")) {
        localObject2 = "0.00";
      }
      this.n.setText((CharSequence)localObject2);
      if (((Double)localObject3).doubleValue() >= 0.0D) {
        break label530;
      }
      this.n.setTextColor(getResources().getColor(2131492932));
      return;
      this.v.setVisibility(0);
      this.s.setVisibility(8);
      break;
      label517:
      this.q.setTextColor(-65536);
    }
    label530:
    this.n.setTextColor(-65536);
  }
  
  private void q()
  {
    if (this.B.size() <= 0)
    {
      this.s.setVisibility(0);
      this.v.setVisibility(8);
    }
    for (;;)
    {
      this.o.setText("0.00");
      this.p.setText("0.00");
      this.q.setText("0.00");
      this.q.setTextColor(-65536);
      this.r.setText("0.00");
      this.n.setText("0.00");
      this.n.setTextColor(-65536);
      return;
      this.v.setVisibility(0);
      this.s.setVisibility(8);
    }
  }
  
  private void r()
  {
    Intent localIntent = new Intent();
    Bundle localBundle = new Bundle();
    localBundle.putString("nexturl", "http://mnews.gw.com.cn/wap/style/other/qa/problemQa.html");
    localBundle.putString("names", "常见问题");
    localIntent.putExtras(localBundle);
    localIntent.setClass(this, BrowserActivity.class);
    startActivity(localIntent);
  }
  
  public String a(Double paramDouble)
  {
    return String.valueOf(new DecimalFormat("0.00").format(paramDouble).toString());
  }
  
  public void a()
  {
    this.y = com.android.dazhihui.c.a.d.a();
    if (this.H == 1)
    {
      this.B = this.y.k();
      this.y.g();
    }
    do
    {
      return;
      if (this.H != 2) {
        break;
      }
      this.B = new ArrayList();
      this.B.addAll(this.y.c(this.I, 1));
      this.y.g();
    } while (!com.android.dazhihui.g.a().L());
    System.out.println("mDb.queryOfflineCapitalStock()size = " + this.y.k().size());
    this.y.g();
    return;
    finish();
  }
  
  public void a(Context paramContext)
  {
    View localView = LayoutInflater.from(paramContext).inflate(2130903095, null);
    ((Button)localView.findViewById(2131558581)).setOnClickListener(new g(this));
    paramContext = new AlertDialog.Builder(new ContextThemeWrapper(paramContext, 2131296289));
    paramContext.setView(localView);
    this.e = paramContext.create();
    this.e.show();
  }
  
  public void a(ag paramag)
  {
    int i1;
    if (paramag != null) {
      i1 = 0;
    }
    for (;;)
    {
      ag localag;
      double d1;
      if (i1 < this.B.size())
      {
        localag = (ag)this.B.get(i1);
        if (!localag.a().equals(paramag.a())) {
          break label111;
        }
        localag.a(paramag);
        d1 = Double.parseDouble(localag.q());
        if (d1 != 0.0D) {
          break label82;
        }
        i1 = -16777216;
      }
      for (;;)
      {
        localag.c(i1);
        return;
        label82:
        if (d1 > 0.0D) {
          i1 = -65536;
        } else {
          i1 = getResources().getColor(2131492932);
        }
      }
      label111:
      i1 += 1;
    }
  }
  
  public void a(String paramString)
  {
    JinZhengRequestData localJinZhengRequestData = new JinZhengRequestData();
    localJinZhengRequestData.setService_id("600120");
    localJinZhengRequestData.setType("JinzhengCapital_600120");
    localJinZhengRequestData.setCompany_id(com.android.dazhihui.ui.delegate.b.o.q);
    localJinZhengRequestData.setUser_id_cls("2");
    localJinZhengRequestData.setUser_id(this.N);
    localJinZhengRequestData.setCurrency("0");
    localJinZhengRequestData.setSession(paramString);
    paramString = localJinZhengRequestData.jinzhengJson();
    System.out.println("客户资金信息请求数据" + paramString);
    this.S = new t();
    this.S.c(com.android.dazhihui.a.f.Q);
    this.S.c("Content-Type", "application/json");
    try
    {
      paramString = new StringEntity(paramString, "UTF-8");
      this.S.a(paramString);
      this.S.a(this);
      com.android.dazhihui.a.g.a().a(this.S);
      return;
    }
    catch (UnsupportedEncodingException paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public void b()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    this.O = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("11104").a("1028", "").a("1234", "1").h()) });
    registRequestListener(this.O);
    sendRequest(this.O);
  }
  
  public void b(String paramString)
  {
    JinZhengRequestData localJinZhengRequestData = new JinZhengRequestData();
    localJinZhengRequestData.setService_id("600200");
    localJinZhengRequestData.setType("JinzhengCapital_600200");
    localJinZhengRequestData.setCompany_id(com.android.dazhihui.ui.delegate.b.o.q);
    localJinZhengRequestData.setUser_id_cls("2");
    localJinZhengRequestData.setUser_id(this.N);
    localJinZhengRequestData.setSession(paramString);
    paramString = localJinZhengRequestData.jinzhengJson();
    System.out.println("持仓请求数据" + paramString);
    this.T = new t();
    this.T.c(com.android.dazhihui.a.f.Q);
    this.T.c("Content-Type", "application/json");
    try
    {
      paramString = new StringEntity(paramString, "UTF-8");
      this.T.a(paramString);
      this.T.a(this);
      com.android.dazhihui.a.g.a().a(this.T);
      return;
    }
    catch (UnsupportedEncodingException paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public void c()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    this.P = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("11146").a("1019", "").a("1036", "").a("1206", "0").a("1277", "0").h()) });
    registRequestListener(this.P);
    sendRequest(this.P);
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      this.ap = paramy;
    }
    switch (j.a[paramy.ordinal()])
    {
    default: 
      return;
    case 1: 
      this.h.setBackgroundColor(getResources().getColor(2131493291));
      return;
    }
    this.h.setBackgroundColor(getResources().getColor(2131493599));
  }
  
  public void d()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    this.Q = new com.android.dazhihui.a.b.e();
    this.Q.c("https://uatopen.hs.net/secu/v1/balancefast_qry");
    this.Q.b("UTF-8");
    this.Q.a("Bearer " + com.android.dazhihui.ui.delegate.b.o.d);
    this.Q.a("targetcomp_id", com.android.dazhihui.c.a.a.C[com.android.dazhihui.ui.a.e.a().j()][6]);
    this.Q.a("sendercomp_id", "90013");
    this.Q.a("money_type", "");
    registRequestListener(this.Q);
    sendRequest(this.Q);
  }
  
  public void e()
  {
    Object localObject;
    if (this.H == 1)
    {
      this.k.setText("手工记账");
      this.l.setText("持仓股创建于");
      localObject = this.y.b("offline_capital_update_time");
      this.y.g();
      this.m.setText((CharSequence)localObject);
      this.z = this.y.b("offline_capital_shengyuzijin");
      this.y.g();
      this.r.setText(this.z);
      return;
    }
    if (this.H == 2)
    {
      this.C = this.y.i(this.I);
      this.y.g();
      if (this.I.contains("_"))
      {
        localObject = this.I.split("_");
        this.k.setText(localObject[0]);
      }
      while (this.C == null)
      {
        System.out.println("数据库获取当前券商失败");
        return;
        this.k.setText(this.I);
      }
      this.l.setText("持仓股同步于");
      this.m.setText(this.C.d());
      this.z = this.C.a();
      if (this.z == null) {
        this.z = "0";
      }
      this.r.setText(this.z);
      return;
    }
    finish();
  }
  
  public Vector<String> f()
  {
    Vector localVector = new Vector();
    int i1 = 0;
    while (i1 < this.B.size())
    {
      localVector.add(((ag)this.B.get(i1)).a());
      i1 += 1;
    }
    return localVector;
  }
  
  public void g()
  {
    ah.a().m();
    Toast.makeText(this, "同步更新完毕", 1).show();
    a();
    e();
    if (this.B.isEmpty()) {
      p();
    }
    o();
  }
  
  public void h()
  {
    if (this.E != null)
    {
      this.Y = this.E.c();
      this.Z = this.E.d();
    }
    String str = this.Y + "_" + this.Z;
    ah.a().a(this.an, this.V, this.ao);
    this.C = new n(str, "1", ah.a().n(), this.Z, this.V, "0", "1");
    n localn = this.y.i(str);
    this.y.g();
    if (localn == null)
    {
      this.y.b(this.C);
      this.y.g();
    }
    for (;;)
    {
      this.y.a("hadTongbu_entrust_name", str);
      this.y.g();
      this.y.a("offline_capital_state", 2);
      this.y.g();
      return;
      this.y.a(this.C);
      this.y.g();
    }
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    if (this == null) {
      break label4;
    }
    label4:
    while (paramj == null) {
      return;
    }
    Object localObject1;
    int i1;
    int i2;
    Object localObject3;
    if ((paramj instanceof com.android.dazhihui.a.b.o))
    {
      localObject1 = ((com.android.dazhihui.a.b.o)paramj).h();
      if ((localObject1 != null) && (((p)localObject1).a == 2955))
      {
        localObject1 = ((p)localObject1).b;
        if (localObject1 != null)
        {
          localObject1 = new q((byte[])localObject1);
          i1 = ((q)localObject1).e();
          ((q)localObject1).e();
          ((q)localObject1).e();
          i2 = ((q)localObject1).e();
          if (i1 == 107)
          {
            if (com.android.dazhihui.g.a().L()) {
              System.out.println("OfflineCapitalDetailActivity 离线持仓-处理返回的2955_107");
            }
            i1 = 0;
            while (i1 < i2)
            {
              localObject3 = new ag();
              ((ag)localObject3).a((q)localObject1);
              a((ag)localObject3);
              i1 += 1;
            }
          }
          p();
        }
      }
    }
    this.E = com.android.dazhihui.ui.delegate.a.a().c();
    if (paramh == this.O)
    {
      localObject1 = ((v)paramj).b();
      if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, this))
      {
        if (this.U) {
          c();
        }
        this.U = false;
        localObject1 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
        if (!((com.android.dazhihui.ui.delegate.b.h)localObject1).b())
        {
          paramh = Toast.makeText(this, ((com.android.dazhihui.ui.delegate.b.h)localObject1).d(), 0);
          paramh.setGravity(17, 0, 0);
          paramh.show();
          return;
        }
        this.K = ((com.android.dazhihui.ui.delegate.b.h)localObject1).g();
        if (this.K > 0)
        {
          i1 = 0;
          label253:
          if (i1 >= this.K) {
            break label3458;
          }
          localObject3 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1415");
          if ((localObject3 == null) || (!((String)localObject3).equals("1"))) {
            break label3464;
          }
          label289:
          this.V = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1078");
          this.an = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1087");
          this.ao = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1065");
        }
        h();
      }
    }
    if (paramh == this.Q)
    {
      localObject1 = new String(((com.android.dazhihui.a.b.g)paramj).a());
      if (this.U) {
        n();
      }
      this.U = false;
    }
    for (;;)
    {
      int i3;
      Object localObject5;
      Object localObject2;
      try
      {
        localObject3 = new JSONObject((String)localObject1).getJSONArray("data");
        i3 = ((JSONArray)localObject3).length();
        if (i3 > 0)
        {
          i1 = 0;
          if (i1 < ((JSONArray)localObject3).length())
          {
            localObject5 = (JSONObject)((JSONArray)localObject3).get(i1);
            i2 = i3 - 1;
            if (i2 < 0) {
              break label3473;
            }
            this.V = ((JSONObject)localObject5).getString("enable_balance");
            this.an = ((JSONObject)localObject5).getString("asset_balance");
            this.ao = ((JSONObject)localObject5).getString("market_value");
            i2 -= 1;
            continue;
          }
          h();
        }
      }
      catch (JSONException localJSONException2)
      {
        try
        {
          localObject1 = Toast.makeText(this, ((JSONObject)new JSONTokener((String)localObject1).nextValue()).getString("error_info"), 0);
          ((Toast)localObject1).setGravity(17, 0, 0);
          ((Toast)localObject1).show();
          return;
        }
        catch (JSONException localJSONException1)
        {
          new AlertDialog.Builder(this).setIcon(2130837525).setTitle("访问令牌无效或已过期,请重新登录！").setPositiveButton(2131165363, new d(this)).show();
          localJSONException1.printStackTrace();
          localJSONException2.printStackTrace();
        }
        continue;
        if (!((String)localObject5).equals("0")) {
          continue;
        }
        if (!this.U) {
          continue;
        }
        b(com.android.dazhihui.ui.delegate.b.o.g);
        this.U = false;
        this.K = ((JinzhengResponse.Answer)localJSONException1.ANSWERS.get(0)).ANS_COMM_DATA.size();
        if (this.K <= 0) {
          continue;
        }
        i1 = this.K - 1;
        if (i1 < 0) {
          continue;
        }
        this.V = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)localJSONException1.ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).AVAILABLE;
        this.an = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)localJSONException1.ANSWERS.get(0)).ANS_COMM_DATA.get(0)).ASSERT_VAL;
        this.ao = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)localJSONException1.ANSWERS.get(0)).ANS_COMM_DATA.get(0)).MKT_VAL;
        i1 -= 1;
        continue;
        h();
        if (paramh != this.T) {
          continue;
        }
        if (this.E == null) {
          continue;
        }
        this.Y = this.E.c();
        this.Z = this.E.d();
        localObject2 = this.Y + "_" + this.Z;
        this.y.h((String)localObject2);
        this.y.g();
        localObject4 = new String(localJSONException2.a());
        System.out.println("持仓返回数据" + (String)localObject4);
        Object localObject6 = (JinzhengResponse)new com.c.a.k().a((String)localObject4, JinzhengResponse.class);
        localObject4 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject6).ANSWERS.get(0)).ANS_COMM_DATA;
        localObject5 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject6).ANSWERS.get(0)).ANS_MSG_HDR.MSG_CODE;
        localObject6 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject6).ANSWERS.get(0)).ANS_MSG_HDR.MSG_TEXT;
        if (((String)localObject5).equals("0")) {
          continue;
        }
        Toast.makeText(this, (CharSequence)localObject6, 1).show();
        return;
        this.L = ((ArrayList)localObject4).size();
        if (this.L <= 0) {
          continue;
        }
        i1 = 0;
        if (i1 >= ((ArrayList)localObject4).size()) {
          continue;
        }
        this.aa = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject4).get(i1)).SECU_CODE;
        this.ab = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject4).get(i1)).SECU_NAME;
        this.ac = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject4).get(i1)).SHARE_QTY;
        this.ad = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject4).get(i1)).CURRENT_COST;
        this.ah = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject4).get(i1)).INCOME_AMT;
        this.ag = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject4).get(i1)).MARKET;
        this.ai = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject4).get(i1)).SHARE_AVL;
        this.aj = ah.a().b(this.aa, this.ag);
        this.ae = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject4).get(i1)).MKT_PRICE;
        localObject5 = ah.a().a(this.ah, this.ad, this.ae, this.ac);
        this.af = new ag((String)localObject2, this.ab, this.aj, this.ad, Integer.valueOf(this.ac).intValue(), Integer.valueOf(this.ai).intValue(), 1, this.ah, (String)localObject5);
        this.y.a(this.af);
        this.y.a("offline_capital_state", 2);
        i1 += 1;
        continue;
        g();
        this.y.g();
        if (paramh != this.P) {
          break label1995;
        }
        localObject2 = ((v)paramj).b();
        if (!com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject2, this)) {
          break label1995;
        }
        localObject4 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject2).e());
        if (((com.android.dazhihui.ui.delegate.b.h)localObject4).b()) {
          continue;
        }
        paramh = Toast.makeText(this, ((com.android.dazhihui.ui.delegate.b.h)localObject4).d(), 0);
        paramh.setGravity(17, 0, 0);
        paramh.show();
        return;
        this.L = ((com.android.dazhihui.ui.delegate.b.h)localObject4).g();
        if (!com.android.dazhihui.ui.delegate.b.o.i()) {
          break label2359;
        }
        this.W = com.android.dazhihui.ui.delegate.c.a.e;
        this.X = com.android.dazhihui.ui.delegate.c.a.f;
        if ((this.W != null) && (this.X != null)) {
          continue;
        }
        this.W = new String[] { "" };
        this.X = new String[] { "" };
        if (this.E == null) {
          continue;
        }
        this.Y = this.E.c();
        this.Z = this.E.d();
        localObject2 = this.Y + "_" + this.Z;
        this.y.h((String)localObject2);
        this.y.g();
        i2 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).g();
        if (i2 <= 0) {
          break label1995;
        }
        i1 = 0;
        if (i1 >= i2) {
          continue;
        }
        this.aa = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1036");
        this.ab = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1037");
        this.ad = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1062");
        this.ag = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1021");
        this.ai = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1061");
        this.ah = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1064");
        this.ac = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1461");
        if ((this.ac != null) && (!this.ac.equals(""))) {
          continue;
        }
        this.ac = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1060");
        if ((this.ag != null) && (!this.ag.equals(""))) {
          continue;
        }
        this.ag = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1004");
        this.aj = ah.a().b(this.aa, this.ag);
        this.ae = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1181");
        localObject5 = ah.a().a(this.ah, this.ad, this.ae, this.ac);
        this.af = new ag((String)localObject2, this.ab, this.aj, this.ad, Integer.valueOf(this.ac).intValue(), Integer.valueOf(this.ai).intValue(), 1, this.ah, (String)localObject5);
        this.y.a(this.af);
        this.y.a("offline_capital_state", 2);
        i1 += 1;
        continue;
        this.y.g();
        if (!this.Y.contains("湘财证券")) {
          continue;
        }
        localObject2 = ah.a().a((com.android.dazhihui.ui.delegate.b.h)localObject4);
        ah.a().a(this.an, this.V, String.valueOf(localObject2));
        ah.a().a(String.valueOf(this.ao), (com.android.dazhihui.ui.delegate.b.h)localObject4);
        g();
      }
      if ((paramj instanceof com.android.dazhihui.a.b.g))
      {
        localObject3 = (com.android.dazhihui.a.b.g)paramj;
        if (paramh == this.S)
        {
          localObject1 = new String(((com.android.dazhihui.a.b.g)localObject3).a());
          System.out.println("查询客户资金返回数据" + (String)localObject1);
          localObject1 = (JinzhengResponse)new com.c.a.k().a((String)localObject1, JinzhengResponse.class);
          localObject5 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_MSG_HDR.MSG_CODE;
          localObject6 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_MSG_HDR.MSG_TEXT;
          if (!((String)localObject5).equals("0"))
          {
            Toast.makeText(this, (CharSequence)localObject6, 1).show();
            return;
          }
        }
      }
      Object localObject4;
      label1995:
      if (paramh != this.R) {
        break;
      }
      paramh = new String(((com.android.dazhihui.a.b.g)paramj).a());
      if (this.E != null)
      {
        this.Y = this.E.c();
        this.Z = this.E.d();
      }
      paramj = this.Y + "_" + this.Z;
      this.y.h(paramj);
      this.y.g();
      try
      {
        localObject2 = new JSONObject(paramh).getJSONArray("data");
        i2 = ((JSONArray)localObject2).length();
        if (i2 <= 0) {
          break label4;
        }
        i1 = 0;
        for (;;)
        {
          if (i1 < i2)
          {
            localObject4 = (JSONObject)((JSONArray)localObject2).get(i1);
            this.ad = ((JSONObject)localObject4).getString("cost_price");
            this.aa = ((JSONObject)localObject4).getString("stock_code");
            this.ab = ((JSONObject)localObject4).getString("stock_name");
            this.ac = ((JSONObject)localObject4).getString("current_amount");
            this.ag = ((JSONObject)localObject4).getString("exchange_type");
            this.ai = ((JSONObject)localObject4).getString("enable_amount");
            this.ah = ((JSONObject)localObject4).getString("income_balance");
            this.aj = ah.a().b(this.aa, this.ag);
            this.ae = ((JSONObject)localObject4).getString("last_price");
            localObject4 = ah.a().a(this.ah, this.ad, this.ae, this.ac);
            this.af = new ag(paramj, this.ab, this.aj, this.ad, Integer.valueOf(this.ac).intValue(), Integer.valueOf(this.ai).intValue(), 1, this.ah, (String)localObject4);
            this.y.a(this.af);
            this.y.a("offline_capital_state", 2);
            i1 += 1;
            continue;
            label2359:
            if (this.L <= 0) {
              break;
            }
            if (this.E != null)
            {
              this.Y = this.E.c();
              this.Z = this.E.d();
            }
            localObject5 = this.Y + "_" + this.Z;
            this.y.h((String)localObject5);
            this.y.g();
            i1 = 0;
            i2 = 0;
            while (i1 < this.L)
            {
              i3 = 0;
              if (i3 < this.X.length)
              {
                if (this.X[i3].equals("1036"))
                {
                  if (((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.X[i3]) == null)
                  {
                    localObject2 = "";
                    label2506:
                    this.aa = ((String)localObject2);
                  }
                }
                else
                {
                  if (this.X[i3].equals("1037"))
                  {
                    if (((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.X[i3]) != null) {
                      break label2929;
                    }
                    localObject2 = "";
                    label2547:
                    this.ab = ((String)localObject2);
                  }
                  if (this.X[i3].equals("1060"))
                  {
                    if (((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.X[i3]) != null) {
                      break label2947;
                    }
                    localObject2 = "";
                    label2588:
                    this.ac = ((String)localObject2);
                  }
                  if (this.X[i3].equals("1062"))
                  {
                    if (((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.X[i3]) != null) {
                      break label2965;
                    }
                    localObject2 = "";
                    label2629:
                    this.ad = ((String)localObject2);
                  }
                  if (this.X[i3].equals("1021"))
                  {
                    if (((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.X[i3]) != null) {
                      break label2983;
                    }
                    localObject2 = "";
                    label2670:
                    this.ag = ((String)localObject2);
                    System.out.println("marketType   " + this.ag);
                  }
                  if (this.X[i3].equals("1061"))
                  {
                    if (((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.X[i3]) != null) {
                      break label3001;
                    }
                    localObject2 = "";
                    label2740:
                    this.ai = ((String)localObject2);
                  }
                  if (this.X[i3].equals("1064"))
                  {
                    if (((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.X[i3]) != null) {
                      break label3019;
                    }
                    localObject2 = "";
                    label2781:
                    this.ah = ((String)localObject2);
                  }
                  if (this.X[i3].equals("1064"))
                  {
                    if (((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.X[i3]) != null) {
                      break label3037;
                    }
                    localObject2 = "";
                    label2822:
                    this.ah = ((String)localObject2);
                  }
                  if (this.X[i3].equals("1181")) {
                    if (((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.X[i3]) != null) {
                      break label3055;
                    }
                  }
                }
                label2929:
                label2947:
                label2965:
                label2983:
                label3001:
                label3019:
                label3037:
                label3055:
                for (localObject2 = "";; localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.X[i3]))
                {
                  this.ae = ((String)localObject2);
                  if ((this.ag == null) || (this.ag.equals(""))) {
                    this.ag = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1004");
                  }
                  i3 += 1;
                  break;
                  localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.X[i3]);
                  break label2506;
                  localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.X[i3]);
                  break label2547;
                  localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.X[i3]);
                  break label2588;
                  localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.X[i3]);
                  break label2629;
                  localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.X[i3]);
                  break label2670;
                  localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.X[i3]);
                  break label2740;
                  localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.X[i3]);
                  break label2781;
                  localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.X[i3]);
                  break label2822;
                }
              }
              i2 += 1;
              System.out.println("codeName = " + this.ab + "count = " + i2 + "profitOrLoss = " + this.ah);
              this.aj = ah.a().b(this.aa, this.ag);
              localObject2 = ah.a().a(this.ah, this.ad, this.ae, this.ac);
              this.af = new ag((String)localObject5, this.ab, this.aj, this.ad, Integer.valueOf(this.ac).intValue(), Integer.valueOf(this.ai).intValue(), 1, this.ah, (String)localObject2);
              this.y.a(this.af);
              this.y.a("offline_capital_state", 2);
              System.out.println((String)localObject5 + "  持仓返回被插入数据库  " + this.ab);
              i1 += 1;
            }
            this.y.g();
            if (this.Y.contains("湘财证券"))
            {
              localObject2 = ah.a().a((com.android.dazhihui.ui.delegate.b.h)localObject4);
              ah.a().a(this.an, this.V, String.valueOf(localObject2));
              ah.a().a(String.valueOf(this.ao), (com.android.dazhihui.ui.delegate.b.h)localObject4);
            }
            g();
            break;
          }
        }
        this.y.g();
        g();
        return;
      }
      catch (JSONException paramj)
      {
        try
        {
          paramh = Toast.makeText(this, ((JSONObject)new JSONTokener(paramh).nextValue()).getString("error_info"), 0);
          paramh.setGravity(17, 0, 0);
          paramh.show();
          return;
        }
        catch (JSONException paramh)
        {
          new AlertDialog.Builder(this).setIcon(2130837525).setTitle("访问令牌无效或已过期,请重新登录！").setPositiveButton(2131165363, new e(this)).show();
          paramh.printStackTrace();
          paramj.printStackTrace();
          return;
        }
      }
      label3458:
      i1 = 0;
      break label289;
      label3464:
      i1 += 1;
      break label253;
      label3473:
      i1 += 1;
    }
  }
  
  public Double i()
  {
    Double localDouble2 = Double.valueOf(0.0D);
    Double localDouble1 = localDouble2;
    if (this.H == 2)
    {
      this.y = com.android.dazhihui.c.a.d.a();
      String str = this.y.b("zzcdev" + this.I);
      this.y.g();
      localDouble1 = localDouble2;
      if (!TextUtils.isEmpty(str)) {
        localDouble1 = Double.valueOf(str);
      }
    }
    System.out.println("zzcdev = " + localDouble1);
    if (this.z == null) {
      this.z = "0";
    }
    double d1 = Double.valueOf(this.z).doubleValue();
    double d2 = j().doubleValue();
    return Double.valueOf(localDouble1.doubleValue() + (d1 + d2));
  }
  
  protected void init(Bundle paramBundle)
  {
    setContentView(2130903352);
    this.w = LayoutInflater.from(this);
    this.y = com.android.dazhihui.c.a.d.a();
    this.H = this.y.b("offline_capital_state", 0);
    this.J = this.y.b("offline_capital_my_show_quanshang");
    this.y.g();
    this.h = ((RelativeLayout)findViewById(2131558585));
    this.i = findViewById(2131558586);
    this.j = findViewById(2131560128);
    this.k = ((TextView)findViewById(2131558587));
    this.l = ((TextView)findViewById(2131560133));
    this.m = ((TextView)findViewById(2131560134));
    this.n = ((TextView)findViewById(2131560132));
    this.o = ((TextView)findViewById(2131559770));
    this.p = ((TextView)findViewById(2131559772));
    this.q = ((TextView)findViewById(2131560135));
    this.r = ((TextView)findViewById(2131560136));
    this.v = ((ListView)findViewById(2131560137));
    this.s = ((ImageView)findViewById(2131558778));
    this.t = ((ImageView)findViewById(2131560131));
    this.v.setOnItemClickListener(this);
    this.t.setOnClickListener(this);
    this.i.setOnClickListener(this);
    this.j.setOnClickListener(this);
    paramBundle = getIntent();
    Bundle localBundle = paramBundle.getExtras();
    if (localBundle != null) {
      this.al = localBundle.getBoolean("isRequest");
    }
    if ((com.android.dazhihui.ui.delegate.b.o.r()) && (this.al))
    {
      if (com.android.dazhihui.ui.delegate.b.o.l()) {
        d();
      }
    }
    else if (this.H == 2)
    {
      if ((paramBundle == null) || (paramBundle.getStringExtra("entrustName") == null) || (paramBundle.getStringExtra("entrustName").equals(""))) {
        break label672;
      }
      this.I = paramBundle.getStringExtra("entrustName");
      if ((this.I != null) && (this.I.contains("_")))
      {
        this.D = this.I.split("_");
        this.F = this.D[0];
        this.G = this.D[1];
      }
      this.y = com.android.dazhihui.c.a.d.a();
      paramBundle = this.y.b("offline_capital_my_show_quanshang_is_set");
      if ((this.I == null) || ((paramBundle != null) && (paramBundle.equals("1")))) {
        break label638;
      }
      this.y.a("offline_capital_my_show_quanshang", this.I);
      this.y.g();
      this.y.a("offline_capital_my_show_quanshang_is_set", "1");
      this.y.g();
      this.J = this.I;
      label517:
      if ((this.J == null) || (!this.J.equals(this.I))) {
        break label662;
      }
      b[2] = "取消在“我”显示";
    }
    for (;;)
    {
      ah.a();
      ah.b = true;
      a();
      e();
      this.x = new l(this);
      this.v.setAdapter(this.x);
      q();
      if (this.B.isEmpty()) {
        p();
      }
      o();
      return;
      if (com.android.dazhihui.ui.delegate.b.o.m())
      {
        this.N = com.android.dazhihui.ui.delegate.b.o.p;
        a(com.android.dazhihui.ui.delegate.b.o.g);
        break;
      }
      b();
      break;
      label638:
      this.J = this.y.b("offline_capital_my_show_quanshang");
      this.y.g();
      break label517;
      label662:
      b[2] = "在“我”显示";
      continue;
      label672:
      System.out.println("entrustName 获取失败 ");
    }
  }
  
  public Double j()
  {
    Iterator localIterator = this.B.iterator();
    ag localag;
    double d1;
    for (Double localDouble = Double.valueOf(0.0D); localIterator.hasNext(); localDouble = Double.valueOf(Double.valueOf(localag.p()).doubleValue() + d1))
    {
      localag = (ag)localIterator.next();
      d1 = localDouble.doubleValue();
    }
    return localDouble;
  }
  
  public Double k()
  {
    Iterator localIterator = this.B.iterator();
    ag localag;
    double d1;
    for (Double localDouble = Double.valueOf(0.0D); localIterator.hasNext(); localDouble = Double.valueOf(Double.valueOf(localag.q()).doubleValue() + d1))
    {
      localag = (ag)localIterator.next();
      d1 = localDouble.doubleValue();
    }
    return localDouble;
  }
  
  public Double l()
  {
    Iterator localIterator = this.B.iterator();
    Double localDouble = Double.valueOf(0.0D);
    if (localIterator.hasNext())
    {
      ag localag = (ag)localIterator.next();
      if (localag.d() - localag.e() == 0) {
        break label279;
      }
      System.out.println("itm.getLatestPrice() = " + localag.d());
      System.out.println("itm.getClosePrice() = " + localag.e());
      String str = com.android.dazhihui.d.b.a(localag.d() - localag.e(), localag.c());
      System.out.println("chajia_tmp = " + str);
      double d1 = localDouble.doubleValue();
      double d2 = Double.valueOf(str).doubleValue();
      localDouble = Double.valueOf(localag.m() * d2 + d1);
    }
    label279:
    for (;;)
    {
      break;
      if (this.H == 1) {}
      for (this.am = Double.valueOf(0.0D);; this.am = ah.a().a(this.I, this.B, this.am))
      {
        System.out.println("---DRYKDeviation = " + this.am);
        return Double.valueOf(localDouble.doubleValue() + this.am.doubleValue());
      }
    }
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131558586: 
      finish();
      return;
    case 2131560128: 
      if (this.u == null) {
        m();
      }
      this.u.showAsDropDown(paramView);
      return;
    }
    a(this);
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = new Bundle();
    paramView = ((ag)this.B.get(paramInt)).a();
    String str = ((ag)this.B.get(paramInt)).b();
    if (TextUtils.isEmpty(paramView)) {
      return;
    }
    paramView = new StockVo(str, paramView, 1, false);
    paramAdapterView.putParcelable("stock_vo", paramView);
    r.a(this, paramView, paramAdapterView);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    a();
    e();
    q();
    if (this.B.isEmpty()) {
      p();
    }
    o();
    if (com.android.dazhihui.g.a().L()) {
      System.out.println("onNewIntent --OfflineCapitalDetailActivity");
    }
    super.onNewIntent(paramIntent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\offlinecapital\OfflineCapitalDetailActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */