package com.android.dazhihui.ui.screen.stock.offlinecapital;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.e;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.t;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.a.f;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.d.b;
import com.android.dazhihui.ui.delegate.c.c;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinZhengRequestData;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse.Ans_Comm_Data;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse.Ans_Msg_Hdr;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse.Answer;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.c.a.k;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Vector;
import org.apache.http.entity.StringEntity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class OfflineCapitalMine
  extends BaseActivity
  implements cp, cs
{
  private c A;
  private String[] B;
  private int C;
  private int D;
  private int E;
  private String F;
  private com.android.dazhihui.a.b.u G;
  private com.android.dazhihui.a.b.u H;
  private e I;
  private e J;
  private t K;
  private t L;
  private boolean M = true;
  private String N = "0";
  private String[] O = { "名称", "市值", "盈亏", "收益率", "持仓", "可用", "成本", "现价" };
  private String[] P = { "1037", "1065", "1064", "1320", "1060", "1061", "1062", "1181", "1036", "1019", "1021" };
  private String Q;
  private String R;
  private String S;
  private String T;
  private String U;
  private String V;
  private ag W;
  private int X;
  private String Y;
  private String Z;
  x a = new x(this);
  private String aa;
  private String ab;
  private String ac;
  private boolean ad;
  private String ae;
  private String af;
  private String ag;
  private String ah;
  private String ai;
  private String aj;
  private String ak;
  private int al;
  private boolean am = false;
  private n an;
  private Vector<n> ao = new Vector();
  private Vector<ag> ap = new Vector();
  private Vector<Vector<ag>> aq = new Vector();
  u b = new u(this);
  String c;
  String[] d;
  private DzhHeader e;
  private ListView f;
  private BaseAdapter g;
  private d h;
  private Vector<n> i;
  private ArrayList<String> j;
  private ArrayList<String> k;
  private n l;
  private ArrayList<n> m = new ArrayList();
  private Vector<ag> n;
  private ArrayList<String> o = new ArrayList();
  private Vector<Map<String, String>> p = new Vector();
  private Map<String, String> q = new HashMap();
  private Vector<Map<String, String>> r = new Vector();
  private Map<String, String> s = new HashMap();
  private Vector<Map<String, String>> t = new Vector();
  private Map<String, String> u = new HashMap();
  private Vector<Map<String, String>> v = new Vector();
  private Map<String, String> w = new HashMap();
  private m x;
  private ArrayList<ag> y;
  private ArrayList<ag> z;
  
  private void p()
  {
    Vector localVector = d();
    if (localVector.size() > 0)
    {
      com.android.dazhihui.a.b.x[] arrayOfx = new com.android.dazhihui.a.b.x[1];
      arrayOfx[0] = new com.android.dazhihui.a.b.x(2955);
      arrayOfx[0].c(107);
      arrayOfx[0].c(32897);
      arrayOfx[0].a(localVector);
      arrayOfx[0].c("2955-107-离线持仓-" + localVector);
      if (this.x == null)
      {
        this.x = new m(arrayOfx);
        this.x.a("2955--离线持仓--自动包 NioRequest");
        registRequestListener(this.x);
      }
      for (;;)
      {
        setAutoRequest(this.x);
        sendRequest(this.x);
        return;
        this.x.a(arrayOfx);
      }
    }
    this.x = null;
    setAutoRequest(null);
  }
  
  private void q()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    this.J = new e();
    this.J.c("https://uatopen.hs.net/secu/v1/stockposition_qry");
    this.J.b("UTF-8");
    this.J.a("Bearer " + com.android.dazhihui.ui.delegate.b.o.d);
    this.J.a("targetcomp_id", com.android.dazhihui.c.a.a.C[com.android.dazhihui.ui.a.e.a().j()][6]);
    this.J.a("sendercomp_id", "90013");
    this.J.a("exchange_type", "");
    this.J.a("stock_account", "");
    this.J.a("stock_code", "");
    this.J.a("position_str", "");
    this.J.a("request_num", "");
    registRequestListener(this.J);
    sendRequest(this.J);
  }
  
  public boolean OnChildClick(View paramView)
  {
    if (((Integer)paramView.getTag()).intValue() == 0) {
      finish();
    }
    return false;
  }
  
  public void a()
  {
    this.i = new Vector();
    this.j = new ArrayList();
    this.k = new ArrayList();
    ArrayList localArrayList = new ArrayList();
    if ((com.android.dazhihui.c.a.a.E != null) && (com.android.dazhihui.c.a.a.E.length != 0))
    {
      i1 = 0;
      while (i1 < com.android.dazhihui.c.a.a.E.length)
      {
        this.ai = (com.android.dazhihui.c.a.a.E[i1][0] + "_" + com.android.dazhihui.c.a.a.E[i1][2]);
        if (!this.j.contains(com.android.dazhihui.c.a.a.E[i1][0])) {
          this.j.add(com.android.dazhihui.c.a.a.E[i1][0]);
        }
        if (!localArrayList.contains(this.ai)) {
          localArrayList.add(com.android.dazhihui.c.a.a.E[i1][0] + "_" + com.android.dazhihui.c.a.a.E[i1][2]);
        }
        i1 += 1;
      }
    }
    this.m = this.h.l();
    this.h.g();
    int i1 = 0;
    while (i1 < this.m.size())
    {
      this.k.add(((n)this.m.get(i1)).c());
      i1 += 1;
    }
    i1 = 0;
    while (i1 < localArrayList.size())
    {
      if (!this.k.contains(localArrayList.get(i1)))
      {
        String[] arrayOfString = ((String)localArrayList.get(i1)).split("_");
        this.l = new n((String)localArrayList.get(i1), "0", ah.a().n(), arrayOfString[1], "0", "0", "0");
        this.h.b(this.l);
        this.h.g();
      }
      i1 += 1;
    }
    g();
  }
  
  public void a(View paramView, int paramInt)
  {
    LinearLayout localLinearLayout = (LinearLayout)paramView.findViewById(2131560146);
    Object localObject2 = (TextView)paramView.findViewById(2131560147);
    Object localObject1 = (TextView)paramView.findViewById(2131560148);
    TextView localTextView1 = (TextView)paramView.findViewById(2131560149);
    TextView localTextView2 = (TextView)paramView.findViewById(2131560150);
    TextView localTextView3 = (TextView)paramView.findViewById(2131560152);
    paramView = (TextView)paramView.findViewById(2131560153);
    ((TextView)localObject2).setText("--");
    ((TextView)localObject1).setText("--");
    localTextView1.setText("--");
    localTextView2.setText("--");
    localTextView3.setText("--");
    paramView.setText("--");
    if (this.i.size() != 0)
    {
      this.c = ((n)this.i.get(paramInt)).c();
      this.d = ((n)this.i.get(paramInt)).c().split("_");
      ((TextView)localObject2).setText(this.d[0]);
      localObject2 = this.d[1];
      int i1;
      if (((String)localObject2).length() > 4)
      {
        int i2 = ((String)localObject2).length() - 4;
        localObject2 = ((String)localObject2).substring(i2, ((String)localObject2).length());
        this.aj = "";
        i1 = 0;
        while (i1 < i2)
        {
          this.aj += "*";
          i1 += 1;
        }
        ((TextView)localObject1).setText(this.aj + (String)localObject2);
        if (this.p.size() == 0) {
          break label787;
        }
        i1 = 0;
        label325:
        if (i1 >= this.p.size()) {
          break label844;
        }
        if (!((Map)this.p.get(i1)).containsKey(this.c)) {
          break label707;
        }
        if (Double.valueOf(Double.parseDouble((String)((Map)this.p.get(i1)).get(this.c))).doubleValue() >= 0.0D) {
          break label696;
        }
        localTextView1.setTextColor(getResources().getColor(2131492932));
        label414:
        localTextView1.setText((String)((Map)this.p.get(i1)).get(this.c));
        label443:
        if (!((Map)this.r.get(i1)).containsKey(this.c)) {
          break label737;
        }
        if (Double.valueOf(Double.parseDouble((String)((Map)this.r.get(i1)).get(this.c))).doubleValue() >= 0.0D) {
          break label726;
        }
        localTextView2.setTextColor(getResources().getColor(2131492932));
        label520:
        localObject1 = (String)((Map)this.r.get(i1)).get(this.c);
        localTextView2.setText((String)localObject1 + "%");
        label572:
        if (!((Map)this.t.get(i1)).containsKey(this.c)) {
          break label756;
        }
        localTextView3.setText((String)((Map)this.t.get(i1)).get(this.c));
        label625:
        if (!((Map)this.v.get(i1)).containsKey(this.c)) {
          break label777;
        }
        paramView.setText((String)((Map)this.v.get(i1)).get(this.c));
      }
      for (;;)
      {
        i1 += 1;
        break label325;
        ((TextView)localObject1).setText((CharSequence)localObject2);
        break;
        label696:
        localTextView1.setTextColor(-65536);
        break label414;
        label707:
        localTextView1.setTextColor(-65536);
        localTextView1.setText("0.00");
        break label443;
        label726:
        localTextView2.setTextColor(-65536);
        break label520;
        label737:
        localTextView2.setTextColor(-65536);
        localTextView2.setText("0.00%");
        break label572;
        label756:
        localTextView3.setText(d.a().i(this.c).a());
        break label625;
        label777:
        paramView.setText("0.00%");
      }
      label787:
      localTextView1.setTextColor(-65536);
      localTextView1.setText("0.00");
      localTextView2.setTextColor(-65536);
      localTextView2.setText("0.00%");
      localTextView3.setText(d.a().i(this.c).a());
      paramView.setText("0.00%");
    }
    label844:
    localLinearLayout.setTag(Integer.valueOf(paramInt));
    localLinearLayout.setOnClickListener(this.a);
    localLinearLayout.setOnLongClickListener(this.b);
  }
  
  public void a(String paramString)
  {
    JinZhengRequestData localJinZhengRequestData = new JinZhengRequestData();
    localJinZhengRequestData.setService_id("600120");
    localJinZhengRequestData.setType("JinzhengCapital_600120");
    localJinZhengRequestData.setCompany_id(com.android.dazhihui.ui.delegate.b.o.q);
    localJinZhengRequestData.setUser_id_cls("2");
    localJinZhengRequestData.setUser_id(this.F);
    localJinZhengRequestData.setCurrency("0");
    localJinZhengRequestData.setSession(paramString);
    paramString = localJinZhengRequestData.jinzhengJson();
    System.out.println("客户资金信息请求数据" + paramString);
    this.K = new t();
    this.K.c(f.Q);
    this.K.c("Content-Type", "application/json");
    try
    {
      paramString = new StringEntity(paramString, "UTF-8");
      this.K.a(paramString);
      this.K.a(this);
      com.android.dazhihui.a.g.a().a(this.K);
      return;
    }
    catch (UnsupportedEncodingException paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public void b()
  {
    this.n = new Vector();
    this.y = new ArrayList();
    this.m = this.h.l();
    this.h.g();
    int i1 = 0;
    while (i1 < this.o.size())
    {
      this.n = this.h.c((String)this.o.get(i1), 1);
      this.h.g();
      this.y.addAll(this.n);
      i1 += 1;
    }
    k();
  }
  
  public void b(View paramView, int paramInt)
  {
    TextView localTextView1 = (TextView)paramView.findViewById(2131560155);
    TextView localTextView2 = (TextView)paramView.findViewById(2131560156);
    paramView = (Button)paramView.findViewById(2131560157);
    if (this.i == null)
    {
      localTextView1.setText("--");
      localTextView2.setText("--");
    }
    for (;;)
    {
      paramView.setTag(Integer.valueOf(paramInt));
      paramView.setOnClickListener(this.a);
      return;
      localTextView1.setText(((n)this.i.get(paramInt)).c().split("_")[0]);
      localTextView2.setText(((n)this.i.get(paramInt)).b());
    }
  }
  
  public void b(String paramString)
  {
    JinZhengRequestData localJinZhengRequestData = new JinZhengRequestData();
    localJinZhengRequestData.setService_id("600200");
    localJinZhengRequestData.setType("JinzhengCapital_600200");
    localJinZhengRequestData.setCompany_id(com.android.dazhihui.ui.delegate.b.o.q);
    localJinZhengRequestData.setUser_id_cls("2");
    localJinZhengRequestData.setUser_id(this.F);
    localJinZhengRequestData.setSession(paramString);
    paramString = localJinZhengRequestData.jinzhengJson();
    System.out.println("持仓请求数据" + paramString);
    this.L = new t();
    this.L.c(f.Q);
    this.L.c("Content-Type", "application/json");
    try
    {
      paramString = new StringEntity(paramString, "UTF-8");
      this.L.a(paramString);
      this.L.a(this);
      com.android.dazhihui.a.g.a().a(this.L);
      return;
    }
    catch (UnsupportedEncodingException paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public void c()
  {
    b();
    p();
  }
  
  protected void changeLookFace(com.android.dazhihui.ui.screen.y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {}
    switch (t.a[paramy.ordinal()])
    {
    default: 
      return;
    case 1: 
      this.e.setBackgroundColor(getResources().getColor(2131493291));
      return;
    }
    this.e.setBackgroundColor(getResources().getColor(2131493599));
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.p = this;
    paramct.d = "我的资产";
  }
  
  public Vector<String> d()
  {
    Vector localVector = new Vector();
    int i1 = 0;
    while (i1 < this.y.size())
    {
      localVector.add(((ag)this.y.get(i1)).a());
      i1 += 1;
    }
    return localVector;
  }
  
  public void e()
  {
    ah.a().m();
    b();
    p();
    this.g.notifyDataSetChanged();
  }
  
  public void f()
  {
    this.h.a("offline_capital_state", 2);
    this.h.g();
    this.A = com.android.dazhihui.ui.delegate.a.a().c();
    if (this.A != null)
    {
      this.Q = this.A.c();
      this.R = this.A.d();
    }
    this.ak = (this.Q + "_" + this.R);
    ah.a().a(this.ag, this.N, this.ah);
    ah.a();
    ah.e.put(this.ak, Boolean.valueOf(true));
    this.h.a("hadTongbu_entrust_name", this.ak);
    this.h.g();
    if (this.ad)
    {
      this.ak = (this.ae + "_" + this.af);
      this.l = new n(this.ak, "1", m(), this.af, this.N, "0", "1");
      if (this.h.i(this.ak) == null) {
        break label357;
      }
      this.h.a(this.l);
    }
    for (;;)
    {
      this.h.g();
      this.h.a("hadTongbu_entrust_name", this.ak);
      this.h.g();
      g();
      return;
      this.ak = ((n)this.i.get(this.X)).c();
      this.l = new n(this.ak, "1", m(), ((n)this.i.get(this.X)).b(), this.N, "0", "1");
      break;
      label357:
      this.h.b(this.l);
    }
  }
  
  public void g()
  {
    int i3 = 0;
    this.E = 0;
    this.al = 0;
    this.i.clear();
    this.o.clear();
    this.m = this.h.l();
    this.h.g();
    this.ak = this.h.b("hadTongbu_entrust_name");
    this.h.g();
    if (this.ak != null)
    {
      n localn = this.h.i(this.ak);
      this.h.g();
      if (localn != null)
      {
        if (!localn.e().equals("1")) {
          break label286;
        }
        this.i.add(0, localn);
        this.o.add(0, localn.c());
        this.E += 1;
        this.am = true;
      }
    }
    int i1 = 0;
    label147:
    int i2 = i3;
    if (i1 < this.m.size())
    {
      if (((n)this.m.get(i1)).e().equals("1"))
      {
        if (!this.am) {
          break label294;
        }
        if (!((n)this.m.get(i1)).c().equals(this.ak))
        {
          this.al += 1;
          this.i.add(this.al, this.m.get(i1));
          this.o.add(this.al, ((n)this.m.get(i1)).c());
        }
      }
      for (this.E += 1;; this.E += 1)
      {
        i1 += 1;
        break label147;
        label286:
        this.am = false;
        break;
        label294:
        this.i.add(this.m.get(i1));
        this.o.add(((n)this.m.get(i1)).c());
      }
    }
    while (i2 < this.m.size())
    {
      if (((n)this.m.get(i2)).e().equals("0")) {
        this.i.add(this.m.get(i2));
      }
      i2 += 1;
    }
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.e = paramDzhHeader;
  }
  
  public void h()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    this.G = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("11104").a("1028", "").a("1234", "1").h()) });
    registRequestListener(this.G);
    sendRequest(this.G);
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    if (this == null) {
      break label10;
    }
    label10:
    while (paramj == null) {
      return;
    }
    Object localObject1;
    int i1;
    int i2;
    Object localObject3;
    if ((paramj instanceof com.android.dazhihui.a.b.o))
    {
      System.out.println("行情回来了");
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
            this.z = new ArrayList();
            i1 = 0;
            while (i1 < i2)
            {
              localObject3 = new ag();
              ((ag)localObject3).a((q)localObject1);
              this.z.add(localObject3);
              i1 += 1;
            }
            l();
          }
          this.g.notifyDataSetChanged();
          System.out.println("刷新界面了");
        }
      }
    }
    this.A = com.android.dazhihui.ui.delegate.a.a().c();
    if (paramh == this.G)
    {
      localObject1 = ((v)paramj).b();
      if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, this))
      {
        if (this.M) {
          i();
        }
        this.M = false;
        localObject1 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
        if (!((com.android.dazhihui.ui.delegate.b.h)localObject1).b())
        {
          paramh = Toast.makeText(this, ((com.android.dazhihui.ui.delegate.b.h)localObject1).d(), 0);
          paramh.setGravity(17, 0, 0);
          paramh.show();
          return;
        }
        this.C = ((com.android.dazhihui.ui.delegate.b.h)localObject1).g();
        if (this.C > 0)
        {
          i1 = 0;
          label299:
          if (i1 >= this.C) {
            break label3306;
          }
          localObject3 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1415");
          if ((localObject3 == null) || (!((String)localObject3).equals("1"))) {
            break label3312;
          }
          label335:
          this.N = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1078");
          this.ag = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1087");
          this.ah = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1065");
        }
        f();
      }
    }
    if (paramh == this.I)
    {
      localObject1 = new String(((com.android.dazhihui.a.b.g)paramj).a());
      if (this.M) {
        q();
      }
      this.M = false;
    }
    for (;;)
    {
      Object localObject5;
      Object localObject2;
      try
      {
        localObject3 = new JSONObject((String)localObject1).getJSONArray("data");
        int i3 = ((JSONArray)localObject3).length();
        if (i3 > 0)
        {
          i1 = 0;
          if (i1 < ((JSONArray)localObject3).length())
          {
            localObject5 = (JSONObject)((JSONArray)localObject3).get(i1);
            i2 = i3 - 1;
            if (i2 < 0) {
              break label3321;
            }
            this.N = ((JSONObject)localObject5).getString("enable_balance");
            this.ag = ((JSONObject)localObject5).getString("asset_balance");
            this.ah = ((JSONObject)localObject5).getString("market_value");
            i2 -= 1;
            continue;
          }
          f();
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
          new AlertDialog.Builder(this).setIcon(2130837525).setTitle("访问令牌无效或已过期,请重新登录！").setPositiveButton(2131165363, new r(this)).show();
          localJSONException1.printStackTrace();
          localJSONException2.printStackTrace();
        }
        continue;
        if (!((String)localObject5).equals("0")) {
          continue;
        }
        if (!this.M) {
          continue;
        }
        b(com.android.dazhihui.ui.delegate.b.o.g);
        this.M = false;
        this.C = ((JinzhengResponse.Answer)localJSONException1.ANSWERS.get(0)).ANS_COMM_DATA.size();
        if (this.C <= 0) {
          continue;
        }
        i1 = this.C - 1;
        if (i1 < 0) {
          continue;
        }
        this.N = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)localJSONException1.ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).AVAILABLE;
        this.ag = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)localJSONException1.ANSWERS.get(0)).ANS_COMM_DATA.get(0)).ASSERT_VAL;
        this.ah = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)localJSONException1.ANSWERS.get(0)).ANS_COMM_DATA.get(0)).MKT_VAL;
        i1 -= 1;
        continue;
        f();
        if (paramh != this.L) {
          continue;
        }
        if (this.A == null) {
          continue;
        }
        this.Q = this.A.c();
        this.R = this.A.d();
        localObject2 = this.Q + "_" + this.R;
        this.h.h((String)localObject2);
        this.h.g();
        localObject4 = new String(localJSONException2.a());
        System.out.println("持仓返回数据" + (String)localObject4);
        Object localObject6 = (JinzhengResponse)new k().a((String)localObject4, JinzhengResponse.class);
        localObject4 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject6).ANSWERS.get(0)).ANS_COMM_DATA;
        localObject5 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject6).ANSWERS.get(0)).ANS_MSG_HDR.MSG_CODE;
        localObject6 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject6).ANSWERS.get(0)).ANS_MSG_HDR.MSG_TEXT;
        if (((String)localObject5).equals("0")) {
          continue;
        }
        Toast.makeText(this, (CharSequence)localObject6, 1).show();
        return;
        this.D = ((ArrayList)localObject4).size();
        if (this.D <= 0) {
          continue;
        }
        i1 = 0;
        if (i1 >= ((ArrayList)localObject4).size()) {
          continue;
        }
        this.S = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject4).get(i1)).SECU_CODE;
        this.T = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject4).get(i1)).SECU_NAME;
        this.U = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject4).get(i1)).SHARE_QTY;
        this.V = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject4).get(i1)).CURRENT_COST;
        this.Y = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject4).get(i1)).MARKET;
        this.Z = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject4).get(i1)).INCOME_AMT;
        this.ab = ah.a().b(this.S, this.Y);
        this.ac = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject4).get(i1)).SHARE_AVL;
        this.aa = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject4).get(i1)).MKT_PRICE;
        localObject5 = ah.a().a(this.Z, this.V, this.aa, this.U);
        this.W = new ag((String)localObject2, this.T, this.ab, this.V, Integer.valueOf(this.U).intValue(), Integer.valueOf(this.ac).intValue(), 1, this.Z, (String)localObject5);
        this.h.a(this.W);
        this.h.g();
        i1 += 1;
        continue;
        e();
        if (paramh != this.H) {
          break label2109;
        }
        localObject2 = ((v)paramj).b();
        if (!com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject2, this)) {
          break label2109;
        }
        localObject4 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject2).e());
        if (((com.android.dazhihui.ui.delegate.b.h)localObject4).b()) {
          continue;
        }
        paramh = Toast.makeText(this, ((com.android.dazhihui.ui.delegate.b.h)localObject4).d(), 0);
        paramh.setGravity(17, 0, 0);
        paramh.show();
        return;
        this.D = ((com.android.dazhihui.ui.delegate.b.h)localObject4).g();
        if (!com.android.dazhihui.ui.delegate.b.o.i()) {
          break label2470;
        }
        this.O = com.android.dazhihui.ui.delegate.c.a.e;
        this.P = com.android.dazhihui.ui.delegate.c.a.f;
        if ((this.O != null) && (this.P != null)) {
          continue;
        }
        this.O = new String[] { "" };
        this.P = new String[] { "" };
        if (this.A == null) {
          continue;
        }
        this.Q = this.A.c();
        this.R = this.A.d();
        localObject2 = this.Q + "_" + this.R;
        this.h.h((String)localObject2);
        this.h.g();
        i2 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).g();
        if (i2 <= 0) {
          continue;
        }
        i1 = 0;
        if (i1 >= i2) {
          continue;
        }
        this.S = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1036");
        this.T = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1037");
        this.V = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1062");
        this.Y = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1021");
        this.Z = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1064");
        this.U = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1461");
        if ((this.U != null) && (!this.U.equals(""))) {
          continue;
        }
        this.U = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1060");
        if ((this.Y != null) && (!this.Y.equals(""))) {
          continue;
        }
        this.Y = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1004");
        System.out.println("profitOrLoss = " + this.Z);
        this.ab = ah.a().b(this.S, this.Y);
        this.ac = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1061");
        this.aa = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1181");
        localObject5 = ah.a().a(this.Z, this.V, this.aa, this.U);
        this.W = new ag((String)localObject2, this.T, this.ab, this.V, Integer.valueOf(this.U).intValue(), Integer.valueOf(this.ac).intValue(), 1, this.Z, (String)localObject5);
        this.h.a(this.W);
        this.h.g();
        i1 += 1;
        continue;
        if (!this.Q.contains("湘财证券")) {
          continue;
        }
        localObject2 = ah.a().a((com.android.dazhihui.ui.delegate.b.h)localObject4);
        ah.a().a(this.ag, this.N, String.valueOf(localObject2));
        ah.a().a(String.valueOf(this.ah), (com.android.dazhihui.ui.delegate.b.h)localObject4);
        e();
        if (!this.Q.contains("湘财证券")) {
          continue;
        }
        localObject2 = ah.a().a((com.android.dazhihui.ui.delegate.b.h)localObject4);
        ah.a().a(this.ag, this.N, String.valueOf(localObject2));
        ah.a().a(String.valueOf(this.ah), (com.android.dazhihui.ui.delegate.b.h)localObject4);
        e();
      }
      if ((paramj instanceof com.android.dazhihui.a.b.g))
      {
        localObject3 = (com.android.dazhihui.a.b.g)paramj;
        if (paramh == this.K)
        {
          localObject1 = new String(((com.android.dazhihui.a.b.g)localObject3).a());
          System.out.println("查询客户资金返回数据" + (String)localObject1);
          localObject1 = (JinzhengResponse)new k().a((String)localObject1, JinzhengResponse.class);
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
      label2109:
      if (paramh != this.J) {
        break;
      }
      paramh = new String(((com.android.dazhihui.a.b.g)paramj).a());
      if (this.A != null)
      {
        this.Q = this.A.c();
        this.R = this.A.d();
      }
      paramj = this.Q + "_" + this.R;
      this.h.h(paramj);
      this.h.g();
      try
      {
        localObject2 = new JSONObject(paramh).getJSONArray("data");
        i2 = ((JSONArray)localObject2).length();
        if (i2 > 0)
        {
          i1 = 0;
          for (;;)
          {
            if (i1 < i2)
            {
              localObject4 = (JSONObject)((JSONArray)localObject2).get(i1);
              this.V = ((JSONObject)localObject4).getString("cost_price");
              this.S = ((JSONObject)localObject4).getString("stock_code");
              this.T = ((JSONObject)localObject4).getString("stock_name");
              this.U = ((JSONObject)localObject4).getString("current_amount");
              this.Y = ((JSONObject)localObject4).getString("exchange_type");
              this.Z = ((JSONObject)localObject4).getString("income_balance");
              this.ab = ah.a().b(this.S, this.Y);
              this.ac = ((JSONObject)localObject4).getString("enable_amount");
              this.aa = ((JSONObject)localObject4).getString("last_price");
              localObject4 = ah.a().a(this.Z, this.V, this.aa, this.U);
              this.W = new ag(paramj, this.T, this.ab, this.V, Integer.valueOf(this.U).intValue(), Integer.valueOf(this.ac).intValue(), 1, this.Z, (String)localObject4);
              this.h.a(this.W);
              this.h.g();
              i1 += 1;
              continue;
              label2470:
              if (this.D <= 0) {
                break;
              }
              if (this.A != null)
              {
                this.Q = this.A.c();
                this.R = this.A.d();
              }
              localObject5 = this.Q + "_" + this.R;
              this.h.h((String)localObject5);
              this.h.g();
              i1 = 0;
              while (i1 < this.D)
              {
                i2 = 0;
                if (i2 < this.P.length)
                {
                  if (this.P[i2].equals("1036"))
                  {
                    if (((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.P[i2]) == null)
                    {
                      localObject2 = "";
                      label2615:
                      this.S = ((String)localObject2);
                    }
                  }
                  else
                  {
                    if (this.P[i2].equals("1037"))
                    {
                      if (((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.P[i2]) != null) {
                        break label2934;
                      }
                      localObject2 = "";
                      label2656:
                      this.T = ((String)localObject2);
                    }
                    if (this.P[i2].equals("1060"))
                    {
                      if (((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.P[i2]) != null) {
                        break label2952;
                      }
                      localObject2 = "";
                      label2697:
                      this.U = ((String)localObject2);
                    }
                    if (this.P[i2].equals("1062"))
                    {
                      if (((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.P[i2]) != null) {
                        break label2970;
                      }
                      localObject2 = "";
                      label2738:
                      this.V = ((String)localObject2);
                    }
                    if (this.P[i2].equals("1021"))
                    {
                      if (((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.P[i2]) != null) {
                        break label2988;
                      }
                      localObject2 = "";
                      label2779:
                      this.Y = ((String)localObject2);
                    }
                    if (this.P[i2].equals("1061"))
                    {
                      if (((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.P[i2]) != null) {
                        break label3006;
                      }
                      localObject2 = "";
                      label2820:
                      this.ac = ((String)localObject2);
                    }
                    if (this.P[i2].equals("1064"))
                    {
                      if (((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.P[i2]) != null) {
                        break label3024;
                      }
                      localObject2 = "";
                      label2861:
                      this.Z = ((String)localObject2);
                    }
                    if (this.P[i2].equals("1181")) {
                      if (((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.P[i2]) != null) {
                        break label3042;
                      }
                    }
                  }
                  label2934:
                  label2952:
                  label2970:
                  label2988:
                  label3006:
                  label3024:
                  label3042:
                  for (localObject2 = "";; localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.P[i2]))
                  {
                    this.aa = ((String)localObject2);
                    i2 += 1;
                    break;
                    localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.P[i2]);
                    break label2615;
                    localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.P[i2]);
                    break label2656;
                    localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.P[i2]);
                    break label2697;
                    localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.P[i2]);
                    break label2738;
                    localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.P[i2]);
                    break label2779;
                    localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.P[i2]);
                    break label2820;
                    localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.P[i2]);
                    break label2861;
                  }
                }
                if ((this.Y == null) || (this.Y.equals(""))) {
                  this.Y = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1004");
                }
                this.ab = ah.a().b(this.S, this.Y);
                localObject2 = ah.a().a(this.Z, this.V, this.aa, this.U);
                this.W = new ag((String)localObject5, this.T, this.ab, this.V, Integer.valueOf(this.U).intValue(), Integer.valueOf(this.ac).intValue(), 1, this.Z, (String)localObject2);
                this.h.a(this.W);
                this.h.g();
                i1 += 1;
              }
            }
          }
        }
        e();
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
          new AlertDialog.Builder(this).setIcon(2130837525).setTitle("访问令牌无效或已过期,请重新登录！").setPositiveButton(2131165363, new s(this)).show();
          paramh.printStackTrace();
          paramj.printStackTrace();
          return;
        }
      }
      label3306:
      i1 = 0;
      break label335;
      label3312:
      i1 += 1;
      break label299;
      label3321:
      i1 += 1;
    }
  }
  
  public void i()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    this.H = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("11146").a("1019", "").a("1036", "").a("1206", "0").a("1277", "0").h()) });
    registRequestListener(this.H);
    sendRequest(this.H);
  }
  
  protected void init(Bundle paramBundle)
  {
    setContentView(2130903356);
    this.e = ((DzhHeader)findViewById(2131558585));
    this.e.a(this, this);
    this.f = ((ListView)findViewById(2131560144));
    this.A = com.android.dazhihui.ui.delegate.a.a().c();
    paramBundle = getIntent().getExtras();
    if (paramBundle != null) {
      this.ad = paramBundle.getBoolean("isMineRequest");
    }
    this.h = d.a();
    a();
    if ((com.android.dazhihui.ui.delegate.b.o.s != null) && (com.android.dazhihui.ui.delegate.b.o.r()) && (com.android.dazhihui.ui.delegate.b.o.s.equals(this.A.c())) && (this.ad))
    {
      this.ae = this.A.c();
      this.af = this.A.d();
      if (!com.android.dazhihui.ui.delegate.b.o.l()) {
        break label193;
      }
      j();
    }
    for (;;)
    {
      this.M = true;
      c();
      o();
      this.g = new y(this, this);
      this.f.setAdapter(this.g);
      return;
      label193:
      if (com.android.dazhihui.ui.delegate.b.o.m())
      {
        this.F = com.android.dazhihui.ui.delegate.b.o.p;
        a(com.android.dazhihui.ui.delegate.b.o.g);
      }
      else
      {
        h();
      }
    }
  }
  
  public void j()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    this.I = new e();
    this.I.c("https://uatopen.hs.net/secu/v1/balancefast_qry");
    this.I.b("UTF-8");
    this.I.a("Bearer " + com.android.dazhihui.ui.delegate.b.o.d);
    this.I.a("targetcomp_id", com.android.dazhihui.c.a.a.C[com.android.dazhihui.ui.a.e.a().j()][6]);
    this.I.a("sendercomp_id", "90013");
    this.I.a("money_type", "");
    registRequestListener(this.I);
    sendRequest(this.I);
  }
  
  public void k()
  {
    this.ao.clear();
    this.ap.clear();
    this.aq.clear();
    int i1 = 0;
    while (i1 < this.o.size())
    {
      String str = (String)this.o.get(i1);
      this.ap = this.h.c(str, 1);
      this.h.g();
      this.aq.add(this.ap);
      this.an = this.h.i(str);
      this.h.g();
      this.ao.add(this.an);
      i1 += 1;
    }
  }
  
  public void l()
  {
    this.p.clear();
    this.r.clear();
    this.t.clear();
    this.v.clear();
    int i1 = 0;
    Object localObject2 = Double.valueOf(0.0D);
    String str2;
    String str1;
    Object localObject5;
    Object localObject4;
    label95:
    Object localObject6;
    if (i1 < this.o.size())
    {
      str2 = (String)this.o.get(i1);
      Object localObject3;
      int i2;
      String str3;
      int i4;
      int i3;
      if (this.ao == null)
      {
        str1 = "0";
        localObject5 = Double.valueOf(0.0D);
        localObject3 = Double.valueOf(0.0D);
        localObject4 = Double.valueOf(0.0D);
        i2 = 0;
        if (i2 < ((Vector)this.aq.get(i1)).size())
        {
          str3 = ((ag)((Vector)this.aq.get(i1)).get(i2)).a();
          i4 = ((ag)((Vector)this.aq.get(i1)).get(i2)).m();
          i3 = 0;
        }
      }
      else
      {
        for (;;)
        {
          Object localObject7 = localObject4;
          localObject1 = localObject3;
          localObject6 = localObject5;
          if (i3 < this.z.size())
          {
            localObject7 = (ag)this.z.get(i3);
            if (!str3.equals(((ag)localObject7).a())) {
              break label431;
            }
            localObject1 = localObject3;
            if (((ag)localObject7).d() - ((ag)localObject7).e() != 0)
            {
              localObject1 = b.a(((ag)localObject7).d() - ((ag)localObject7).e(), ((ag)localObject7).c());
              if (!((String)localObject1).equals("--")) {
                break label405;
              }
            }
          }
          label405:
          for (localObject1 = Double.valueOf(0.0D);; localObject1 = Double.valueOf(((Double)localObject3).doubleValue() + Double.valueOf((String)localObject1).doubleValue() * i4))
          {
            localObject6 = Double.valueOf(((Double)localObject5).doubleValue() + Double.parseDouble(b.a(((ag)localObject7).e(), ((ag)localObject7).c())) * i4);
            localObject5 = b.a(((ag)localObject7).d(), ((ag)localObject7).c());
            localObject3 = localObject5;
            if (((String)localObject5).equals("--")) {
              localObject3 = "0";
            }
            double d1 = ((Double)localObject4).doubleValue();
            double d2 = Double.parseDouble((String)localObject3);
            localObject7 = Double.valueOf(i4 * d2 + d1);
            i2 += 1;
            localObject4 = localObject7;
            localObject3 = localObject1;
            localObject5 = localObject6;
            break label95;
            str1 = ((n)this.ao.get(i1)).a();
            break;
          }
          label431:
          i3 += 1;
        }
      }
      localObject6 = new DecimalFormat("0.00");
      localObject1 = ah.a().a(str2, this.y);
      ah.a();
      ah.f.put(str2, localObject1);
      ah.a();
      ah.e.put(str2, Boolean.valueOf(false));
      localObject1 = Double.valueOf(((Double)localObject3).doubleValue() + ((Double)localObject1).doubleValue());
      this.q.put(str2, ((DecimalFormat)localObject6).format(localObject1).toString());
      this.p.add(this.q);
      if (Math.abs(((Double)localObject1).doubleValue()) < 1.0E-4D)
      {
        localObject1 = Double.valueOf(0.0D);
        label573:
        this.s.put(str2, ((DecimalFormat)localObject6).format(localObject1).toString());
        this.r.add(this.s);
        localObject1 = "zzcdev" + str2;
        localObject1 = d.a().b((String)localObject1);
        if (TextUtils.isEmpty((CharSequence)localObject1)) {
          break label879;
        }
      }
    }
    label879:
    for (Object localObject1 = Double.valueOf((String)localObject1);; localObject1 = Double.valueOf(0.0D))
    {
      if (str1 != null) {}
      for (localObject1 = Double.valueOf(((Double)localObject4).doubleValue() + Double.valueOf(str1).doubleValue() + ((Double)localObject1).doubleValue());; localObject1 = localObject2)
      {
        this.u.put(str2, ((DecimalFormat)localObject6).format(localObject1).toString());
        this.t.add(this.u);
        if (Math.abs(((Double)localObject4).doubleValue()) < 1.0E-4D) {}
        for (localObject2 = Double.valueOf(0.0D);; localObject2 = Double.valueOf(((Double)localObject4).doubleValue() / ((Double)localObject1).doubleValue() * 100.0D))
        {
          this.w.put(str2, ((DecimalFormat)localObject6).format(localObject2).toString() + "%");
          this.v.add(this.w);
          i1 += 1;
          localObject2 = localObject1;
          break;
          if (((Double)localObject5).doubleValue() == 0.0D)
          {
            localObject1 = Double.valueOf(0.0D);
            break label573;
          }
          localObject1 = Double.valueOf(((Double)localObject1).doubleValue() / ((Double)localObject5).doubleValue() * 100.0D);
          break label573;
        }
        return;
      }
    }
  }
  
  public String m()
  {
    Date localDate = new Date(System.currentTimeMillis());
    return new SimpleDateFormat("MM-dd HH:mm", Locale.getDefault()).format(localDate);
  }
  
  public void n()
  {
    int i3 = 0;
    this.E = 0;
    this.i.clear();
    this.m = this.h.l();
    this.h.g();
    int i1 = 0;
    int i2;
    for (;;)
    {
      i2 = i3;
      if (i1 >= this.m.size()) {
        break;
      }
      if (((n)this.m.get(i1)).e().equals("1"))
      {
        this.i.add(this.m.get(i1));
        this.E += 1;
      }
      i1 += 1;
    }
    while (i2 < this.m.size())
    {
      if (((n)this.m.get(i2)).e().equals("0")) {
        this.i.add(this.m.get(i2));
      }
      i2 += 1;
    }
  }
  
  public void o()
  {
    int i1 = 0;
    while (i1 < this.o.size())
    {
      ah.a();
      ah.e.put(this.o.get(i1), Boolean.valueOf(true));
      i1 += 1;
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    this.M = true;
    g();
    c();
    o();
    this.g.notifyDataSetChanged();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\offlinecapital\OfflineCapitalMine.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */