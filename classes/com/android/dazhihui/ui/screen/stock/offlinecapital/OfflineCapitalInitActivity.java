package com.android.dazhihui.ui.screen.stock.offlinecapital;

import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.t;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.a.f;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.delegate.c.c;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinZhengRequestData;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse.Ans_Comm_Data;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse.Ans_Msg_Hdr;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse.Answer;
import com.android.dazhihui.ui.model.stock.LeftMenuVo;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.android.dazhihui.ui.screen.stock.MainScreen;
import com.android.dazhihui.ui.screen.y;
import com.c.a.k;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import org.apache.http.entity.StringEntity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class OfflineCapitalInitActivity
  extends BaseActivity
  implements View.OnClickListener
{
  private t A;
  private boolean B = true;
  private String C = "0";
  private String D;
  private String E;
  private String F;
  private String G;
  private String[] H = { "名称", "市值", "盈亏", "收益率", "持仓", "可用", "成本", "现价" };
  private String[] I = { "1037", "1065", "1064", "1320", "1060", "1061", "1062", "1181", "1036", "1019", "1021" };
  private String J;
  private String K;
  private String L;
  private String M;
  private String N;
  private String O;
  private String P;
  private String Q;
  private int R;
  private boolean S = false;
  private String T;
  private String U;
  private String V;
  int a = 0;
  int b = 0;
  private View c;
  private RelativeLayout d;
  private TextView e;
  private Button f;
  private TextView g;
  private Button h;
  private d i;
  private n j;
  private ag k;
  private ArrayList<n> l;
  private ArrayList<String> m;
  private ArrayList<String> n;
  private String o;
  private String p;
  private c q;
  private int r;
  private int s;
  private int t;
  private String u;
  private com.android.dazhihui.a.b.u v;
  private com.android.dazhihui.a.b.u w;
  private com.android.dazhihui.a.b.e x;
  private com.android.dazhihui.a.b.e y;
  private t z;
  
  private void g()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    this.y = new com.android.dazhihui.a.b.e();
    this.y.c("https://uatopen.hs.net/secu/v1/stockposition_qry");
    this.y.b("UTF-8");
    this.y.a("Bearer " + com.android.dazhihui.ui.delegate.b.o.d);
    this.y.a("targetcomp_id", com.android.dazhihui.c.a.a.C[com.android.dazhihui.ui.a.e.a().j()][6]);
    this.y.a("sendercomp_id", "90013");
    this.y.a("exchange_type", "");
    this.y.a("stock_account", "");
    this.y.a("stock_code", "");
    this.y.a("position_str", "");
    this.y.a("request_num", "");
    registRequestListener(this.y);
    sendRequest(this.y);
  }
  
  public void a()
  {
    this.l = this.i.l();
    this.i.g();
    this.m = new ArrayList();
    this.n = new ArrayList();
    this.a = 0;
    this.b = 0;
    this.R = this.i.b("offline_capital_state", 0);
    int i1 = 0;
    while (i1 < this.l.size())
    {
      if (((n)this.l.get(i1)).e().equals("1")) {
        this.a += 1;
      }
      if (((n)this.l.get(i1)).e().equals("0")) {
        this.b += 1;
      }
      i1 += 1;
    }
    if (com.android.dazhihui.c.a.a.E != null)
    {
      if (com.android.dazhihui.c.a.a.E.length != 0)
      {
        i1 = 0;
        while (i1 < com.android.dazhihui.c.a.a.E.length)
        {
          this.V = (com.android.dazhihui.c.a.a.E[i1][0] + "_" + com.android.dazhihui.c.a.a.E[i1][2]);
          if (!this.m.contains(com.android.dazhihui.c.a.a.E[i1][0])) {
            this.m.add(com.android.dazhihui.c.a.a.E[i1][0]);
          }
          if (!this.n.contains(this.V)) {
            this.n.add(com.android.dazhihui.c.a.a.E[i1][0] + "_" + com.android.dazhihui.c.a.a.E[i1][2]);
          }
          i1 += 1;
        }
      }
      if (this.R != 2)
      {
        if (this.l.size() == 0)
        {
          i1 = 0;
          while (i1 < this.n.size())
          {
            localObject = ((String)this.n.get(i1)).split("_");
            this.j = new n((String)this.n.get(i1), "0", ah.a().n(), localObject[1], "0", "0", "0");
            this.i.b(this.j);
            i1 += 1;
          }
        }
        Object localObject = new ArrayList();
        i1 = 0;
        while (i1 < this.l.size())
        {
          ((ArrayList)localObject).add(((n)this.l.get(i1)).c());
          i1 += 1;
        }
        i1 = 0;
        while (i1 < this.n.size())
        {
          if (!((ArrayList)localObject).contains(this.n.get(i1)))
          {
            String[] arrayOfString = ((String)this.n.get(i1)).split("_");
            this.j = new n((String)this.n.get(i1), "0", ah.a().n(), arrayOfString[1], "0", "0", "0");
            this.i.b(this.j);
          }
          i1 += 1;
        }
        this.l = this.i.l();
        this.i.g();
      }
    }
    if (this.a == 0) {
      this.i.a("offline_capital_state", 0);
    }
  }
  
  public void a(String paramString)
  {
    JinZhengRequestData localJinZhengRequestData = new JinZhengRequestData();
    localJinZhengRequestData.setService_id("600120");
    localJinZhengRequestData.setType("JinzhengCapital_600120");
    localJinZhengRequestData.setCompany_id(com.android.dazhihui.ui.delegate.b.o.q);
    localJinZhengRequestData.setUser_id_cls("2");
    localJinZhengRequestData.setUser_id(this.u);
    localJinZhengRequestData.setCurrency("0");
    localJinZhengRequestData.setSession(paramString);
    paramString = localJinZhengRequestData.jinzhengJson();
    System.out.println("客户资金信息请求数据" + paramString);
    this.z = new t();
    this.z.c(f.Q);
    this.z.c("Content-Type", "application/json");
    try
    {
      paramString = new StringEntity(paramString, "UTF-8");
      this.z.a(paramString);
      this.z.a(this);
      com.android.dazhihui.a.g.a().a(this.z);
      return;
    }
    catch (UnsupportedEncodingException paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public void b()
  {
    ah.a().m();
    int i1 = 0;
    while (i1 < com.android.dazhihui.c.a.a.E.length)
    {
      if (com.android.dazhihui.c.a.a.E[i1][0].equals(this.m.get(0))) {
        this.p = com.android.dazhihui.c.a.a.E[i1][2];
      }
      i1 += 1;
    }
    String str = (String)this.m.get(0) + "_" + this.p;
    Intent localIntent = new Intent();
    localIntent.putExtra("entrustName", str);
    localIntent.setClass(this, OfflineCapitalDetailActivity.class);
    startActivity(localIntent);
  }
  
  public void b(String paramString)
  {
    JinZhengRequestData localJinZhengRequestData = new JinZhengRequestData();
    localJinZhengRequestData.setService_id("600200");
    localJinZhengRequestData.setType("JinzhengCapital_600200");
    localJinZhengRequestData.setCompany_id(com.android.dazhihui.ui.delegate.b.o.q);
    localJinZhengRequestData.setUser_id_cls("2");
    localJinZhengRequestData.setUser_id(this.u);
    localJinZhengRequestData.setSession(paramString);
    paramString = localJinZhengRequestData.jinzhengJson();
    System.out.println("持仓请求数据" + paramString);
    this.A = new t();
    this.A.c(f.Q);
    this.A.c("Content-Type", "application/json");
    try
    {
      paramString = new StringEntity(paramString, "UTF-8");
      this.A.a(paramString);
      this.A.a(this);
      com.android.dazhihui.a.g.a().a(this.A);
      return;
    }
    catch (UnsupportedEncodingException paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public void c()
  {
    this.q = com.android.dazhihui.ui.delegate.a.a().c();
    if (this.q != null)
    {
      this.J = this.q.c();
      this.K = this.q.d();
    }
    this.Q = (this.J + "_" + this.K);
    ah.a().a(this.T, this.C, this.U);
    this.j = new n(this.Q, "1", ah.a().n(), this.K, this.C, "0", "1");
    n localn = this.i.i(this.Q);
    this.i.g();
    if (localn == null)
    {
      this.i.b(this.j);
      this.i.g();
    }
    for (;;)
    {
      this.i.a("hadTongbu_entrust_name", this.Q);
      this.i.a("offline_capital_state", 2);
      return;
      this.i.a(this.j);
      this.i.g();
    }
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {}
    switch (q.a[paramy.ordinal()])
    {
    default: 
      return;
    case 1: 
      this.d.setBackgroundColor(getResources().getColor(2131493291));
      return;
    }
    this.d.setBackgroundColor(getResources().getColor(2131493599));
  }
  
  public void d()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    this.v = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("11104").a("1028", "").a("1234", "1").h()) });
    registRequestListener(this.v);
    sendRequest(this.v);
  }
  
  public void e()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    this.w = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("11146").a("1019", "").a("1036", "").a("1206", "0").a("1277", "0").h()) });
    registRequestListener(this.w);
    sendRequest(this.w);
  }
  
  public void f()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    this.x = new com.android.dazhihui.a.b.e();
    this.x.c("https://uatopen.hs.net/secu/v1/balancefast_qry");
    this.x.b("UTF-8");
    this.x.a("Bearer " + com.android.dazhihui.ui.delegate.b.o.d);
    this.x.a("targetcomp_id", com.android.dazhihui.c.a.a.C[com.android.dazhihui.ui.a.e.a().j()][6]);
    this.x.a("sendercomp_id", "90013");
    this.x.a("money_type", "");
    registRequestListener(this.x);
    sendRequest(this.x);
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    this.q = com.android.dazhihui.ui.delegate.a.a().c();
    Object localObject1;
    int i1;
    Object localObject3;
    if (paramh == this.v)
    {
      localObject1 = ((v)paramj).b();
      if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, this))
      {
        if (this.B) {
          e();
        }
        this.B = false;
        localObject1 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
        if (!((com.android.dazhihui.ui.delegate.b.h)localObject1).b())
        {
          paramh = Toast.makeText(this, ((com.android.dazhihui.ui.delegate.b.h)localObject1).d(), 0);
          paramh.setGravity(17, 0, 0);
          paramh.show();
          return;
        }
        this.r = ((com.android.dazhihui.ui.delegate.b.h)localObject1).g();
        if (this.r > 0)
        {
          i1 = 0;
          if (i1 >= this.r) {
            break label3051;
          }
          localObject3 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1415");
          if ((localObject3 == null) || (!((String)localObject3).equals("1"))) {
            break label3057;
          }
          label147:
          this.C = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1078");
          this.T = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1087");
          this.U = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1065");
        }
        c();
      }
    }
    if (paramh == this.x)
    {
      localObject1 = new String(((com.android.dazhihui.a.b.g)paramj).a());
      if (this.B) {
        g();
      }
      this.B = false;
    }
    for (;;)
    {
      int i2;
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
              break label3066;
            }
            this.C = ((JSONObject)localObject5).getString("enable_balance");
            this.T = ((JSONObject)localObject5).getString("asset_balance");
            this.U = ((JSONObject)localObject5).getString("market_value");
            i2 -= 1;
            continue;
          }
          c();
        }
      }
      catch (JSONException localJSONException2)
      {
        try
        {
          String str;
          localObject1 = Toast.makeText(this, ((JSONObject)new JSONTokener((String)localObject1).nextValue()).getString("error_info"), 0);
          ((Toast)localObject1).setGravity(17, 0, 0);
          ((Toast)localObject1).show();
          return;
        }
        catch (JSONException localJSONException1)
        {
          new AlertDialog.Builder(this).setIcon(2130837525).setTitle("访问令牌无效或已过期,请重新登录！").setPositiveButton(2131165363, new o(this)).show();
          localJSONException1.printStackTrace();
          localJSONException2.printStackTrace();
        }
        continue;
        if (!((String)localObject5).equals("0")) {
          continue;
        }
        if (!this.B) {
          continue;
        }
        b(com.android.dazhihui.ui.delegate.b.o.g);
        this.B = false;
        this.r = ((JinzhengResponse.Answer)localJSONException2.ANSWERS.get(0)).ANS_COMM_DATA.size();
        if (this.r <= 0) {
          continue;
        }
        i1 = this.r - 1;
        if (i1 < 0) {
          continue;
        }
        this.C = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)localJSONException2.ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).AVAILABLE;
        this.T = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)localJSONException2.ANSWERS.get(0)).ANS_COMM_DATA.get(0)).ASSERT_VAL;
        this.U = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)localJSONException2.ANSWERS.get(0)).ANS_COMM_DATA.get(0)).MKT_VAL;
        i1 -= 1;
        continue;
        c();
        if (paramh != this.A) {
          continue;
        }
        if (this.q == null) {
          continue;
        }
        this.J = this.q.c();
        this.K = this.q.d();
        this.Q = (this.J + "_" + this.K);
        this.i.h(this.Q);
        localObject2 = new String(localJSONException1.a());
        System.out.println("持仓返回数据" + (String)localObject2);
        Object localObject5 = (JinzhengResponse)new k().a((String)localObject2, JinzhengResponse.class);
        localObject2 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject5).ANSWERS.get(0)).ANS_COMM_DATA;
        localObject4 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject5).ANSWERS.get(0)).ANS_MSG_HDR.MSG_CODE;
        localObject5 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject5).ANSWERS.get(0)).ANS_MSG_HDR.MSG_TEXT;
        if (((String)localObject4).equals("0")) {
          continue;
        }
        Toast.makeText(this, (CharSequence)localObject5, 1).show();
        return;
        this.s = ((ArrayList)localObject2).size();
        if (this.s <= 0) {
          continue;
        }
        i1 = 0;
        if (i1 >= ((ArrayList)localObject2).size()) {
          continue;
        }
        this.L = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject2).get(i1)).SECU_CODE;
        this.M = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject2).get(i1)).SECU_NAME;
        this.N = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject2).get(i1)).SHARE_QTY;
        this.O = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject2).get(i1)).CURRENT_COST;
        this.E = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject2).get(i1)).INCOME_AMT;
        this.D = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject2).get(i1)).MARKET;
        this.G = ah.a().b(this.L, this.D);
        this.P = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject2).get(i1)).SHARE_AVL;
        this.F = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject2).get(i1)).MKT_PRICE;
        localObject4 = ah.a().a(this.E, this.O, this.F, this.N);
        this.k = new ag(this.Q, this.M, this.G, this.O, Integer.valueOf(this.N).intValue(), Integer.valueOf(this.P).intValue(), 1, this.E, (String)localObject4);
        this.i.a(this.k);
        i1 += 1;
        continue;
        b();
        if (paramh != this.w) {
          continue;
        }
        localObject2 = ((v)paramj).b();
        if (!com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject2, this)) {
          continue;
        }
        localObject4 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject2).e());
        if (((com.android.dazhihui.ui.delegate.b.h)localObject4).b()) {
          continue;
        }
        paramh = Toast.makeText(this, ((com.android.dazhihui.ui.delegate.b.h)localObject4).d(), 0);
        paramh.setGravity(17, 0, 0);
        paramh.show();
        return;
        this.s = ((com.android.dazhihui.ui.delegate.b.h)localObject4).g();
        this.t = ((com.android.dazhihui.ui.delegate.b.h)localObject4).b("1289");
        if (!com.android.dazhihui.ui.delegate.b.o.i()) {
          break label2162;
        }
        this.H = com.android.dazhihui.ui.delegate.c.a.e;
        this.I = com.android.dazhihui.ui.delegate.c.a.f;
        if ((this.H != null) && (this.I != null)) {
          continue;
        }
        this.H = new String[] { "" };
        this.I = new String[] { "" };
        if (this.q == null) {
          continue;
        }
        this.J = this.q.c();
        this.K = this.q.d();
        this.Q = (this.J + "_" + this.K);
        this.i.h(this.Q);
        i2 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).g();
        if (i2 <= 0) {
          continue;
        }
        i1 = 0;
        if (i1 >= i2) {
          continue;
        }
        this.L = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1036");
        this.M = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1037");
        this.O = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1062");
        this.D = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1021");
        this.P = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1061");
        this.E = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1064");
        this.N = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1461");
        if ((this.N != null) && (!this.N.equals(""))) {
          continue;
        }
        this.N = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1060");
        if ((this.D != null) && (!this.D.equals(""))) {
          continue;
        }
        this.D = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1004");
        this.F = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1181");
        localObject2 = ah.a().a(this.E, this.O, this.F, this.N);
        this.G = ah.a().b(this.L, this.D);
        this.k = new ag(this.Q, this.M, this.G, this.O, Integer.valueOf(this.N).intValue(), Integer.valueOf(this.P).intValue(), 1, this.E, (String)localObject2);
        this.i.a(this.k);
        i1 += 1;
        continue;
        if (!this.J.contains("湘财证券")) {
          continue;
        }
        localObject2 = ah.a().a((com.android.dazhihui.ui.delegate.b.h)localObject4);
        ah.a().a(this.T, this.C, String.valueOf(localObject2));
        ah.a().a(String.valueOf(this.U), (com.android.dazhihui.ui.delegate.b.h)localObject4);
        b();
        if (paramh != this.y) {
          break label2953;
        }
        paramh = new String(((com.android.dazhihui.a.b.g)paramj).a());
        if (this.q == null) {
          continue;
        }
        this.J = this.q.c();
        this.K = this.q.d();
        this.Q = (this.J + "_" + this.K);
        this.i.h(this.Q);
      }
      if ((paramj instanceof com.android.dazhihui.a.b.g))
      {
        localObject1 = (com.android.dazhihui.a.b.g)paramj;
        if (paramh == this.z)
        {
          localObject3 = new String(((com.android.dazhihui.a.b.g)localObject1).a());
          System.out.println("查询客户资金返回数据" + (String)localObject3);
          localObject3 = (JinzhengResponse)new k().a((String)localObject3, JinzhengResponse.class);
          localObject5 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject3).ANSWERS.get(0)).ANS_MSG_HDR.MSG_CODE;
          str = ((JinzhengResponse.Answer)((JinzhengResponse)localObject3).ANSWERS.get(0)).ANS_MSG_HDR.MSG_TEXT;
          if (!((String)localObject5).equals("0"))
          {
            Toast.makeText(this, str, 1).show();
            return;
          }
        }
      }
      try
      {
        Object localObject2;
        Object localObject4;
        paramj = new JSONObject(paramh).getJSONArray("data");
        i2 = paramj.length();
        if (i2 > 0)
        {
          i1 = 0;
          for (;;)
          {
            if (i1 < i2)
            {
              localObject2 = (JSONObject)paramj.get(i1);
              this.O = ((JSONObject)localObject2).getString("cost_price");
              this.L = ((JSONObject)localObject2).getString("stock_code");
              this.M = ((JSONObject)localObject2).getString("stock_name");
              this.N = ((JSONObject)localObject2).getString("current_amount");
              this.D = ((JSONObject)localObject2).getString("exchange_type");
              this.E = ((JSONObject)localObject2).getString("income_balance");
              this.G = ah.a().b(this.L, this.D);
              this.P = ((JSONObject)localObject2).getString("enable_amount");
              this.F = ((JSONObject)localObject2).getString("last_price");
              localObject2 = ah.a().a(this.E, this.O, this.F, this.N);
              this.k = new ag(this.Q, this.M, this.G, this.O, Integer.valueOf(this.N).intValue(), Integer.valueOf(this.P).intValue(), 1, this.E, (String)localObject2);
              this.i.a(this.k);
              i1 += 1;
              continue;
              label2162:
              if (this.s > 0)
              {
                if (this.q != null)
                {
                  this.J = this.q.c();
                  this.K = this.q.d();
                }
                this.Q = (this.J + "_" + this.K);
                this.i.h(this.Q);
                i1 = 0;
                while (i1 < this.s)
                {
                  i2 = 0;
                  if (i2 < this.I.length)
                  {
                    if (this.I[i2].equals("1036"))
                    {
                      if (((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.I[i2]) == null)
                      {
                        localObject2 = "";
                        label2302:
                        this.L = ((String)localObject2);
                      }
                    }
                    else
                    {
                      if (this.I[i2].equals("1037"))
                      {
                        if (((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.I[i2]) != null) {
                          break label2614;
                        }
                        localObject2 = "";
                        label2342:
                        this.M = ((String)localObject2);
                      }
                      if (this.I[i2].equals("1060"))
                      {
                        if (((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.I[i2]) != null) {
                          break label2632;
                        }
                        localObject2 = "";
                        label2382:
                        this.N = ((String)localObject2);
                      }
                      if (this.I[i2].equals("1062"))
                      {
                        if (((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.I[i2]) != null) {
                          break label2650;
                        }
                        localObject2 = "";
                        label2422:
                        this.O = ((String)localObject2);
                      }
                      if (this.I[i2].equals("1021"))
                      {
                        if (((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.I[i2]) != null) {
                          break label2668;
                        }
                        localObject2 = "";
                        label2462:
                        this.D = ((String)localObject2);
                      }
                      if (this.I[i2].equals("1061"))
                      {
                        if (((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.I[i2]) != null) {
                          break label2686;
                        }
                        localObject2 = "";
                        label2502:
                        this.P = ((String)localObject2);
                      }
                      if (this.I[i2].equals("1064"))
                      {
                        if (((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.I[i2]) != null) {
                          break label2704;
                        }
                        localObject2 = "";
                        label2542:
                        this.E = ((String)localObject2);
                      }
                      if (this.I[i2].equals("1181")) {
                        if (((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.I[i2]) != null) {
                          break label2722;
                        }
                      }
                    }
                    label2614:
                    label2632:
                    label2650:
                    label2668:
                    label2686:
                    label2704:
                    label2722:
                    for (localObject2 = "";; localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.I[i2]))
                    {
                      this.F = ((String)localObject2);
                      i2 += 1;
                      break;
                      localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.I[i2]);
                      break label2302;
                      localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.I[i2]);
                      break label2342;
                      localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.I[i2]);
                      break label2382;
                      localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.I[i2]);
                      break label2422;
                      localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.I[i2]);
                      break label2462;
                      localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.I[i2]);
                      break label2502;
                      localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.I[i2]);
                      break label2542;
                    }
                  }
                  if ((this.D == null) || (this.D.equals(""))) {
                    this.D = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1004");
                  }
                  localObject2 = ah.a().a(this.E, this.O, this.F, this.N);
                  this.G = ah.a().b(this.L, this.D);
                  this.k = new ag(this.Q, this.M, this.G, this.O, Integer.valueOf(this.N).intValue(), Integer.valueOf(this.P).intValue(), 1, this.E, (String)localObject2);
                  this.i.a(this.k);
                  i1 += 1;
                }
              }
              if (this.J.contains("湘财证券"))
              {
                localObject2 = ah.a().a((com.android.dazhihui.ui.delegate.b.h)localObject4);
                ah.a().a(this.T, this.C, String.valueOf(localObject2));
                ah.a().a(String.valueOf(this.U), (com.android.dazhihui.ui.delegate.b.h)localObject4);
              }
              b();
              break;
            }
          }
        }
        b();
      }
      catch (JSONException paramj)
      {
        for (;;)
        {
          try
          {
            label2953:
            paramh = Toast.makeText(this, ((JSONObject)new JSONTokener(paramh).nextValue()).getString("error_info"), 0);
            paramh.setGravity(17, 0, 0);
            paramh.show();
            return;
          }
          catch (JSONException paramh)
          {
            new AlertDialog.Builder(this).setIcon(2130837525).setTitle("访问令牌无效或已过期,请重新登录！").setPositiveButton(2131165363, new p(this)).show();
            paramh.printStackTrace();
            paramj.printStackTrace();
          }
        }
      }
      this.i.g();
      return;
      label3051:
      i1 = 0;
      break label147;
      label3057:
      i1 += 1;
      break;
      label3066:
      i1 += 1;
    }
  }
  
  protected void init(Bundle paramBundle)
  {
    setContentView(2130903355);
    this.i = d.a();
    this.i.a("offline_capital_my_show_quanshang_is_set", "0");
    this.i.g();
    this.d = ((RelativeLayout)findViewById(2131558585));
    this.c = findViewById(2131558586);
    this.c.setOnClickListener(this);
    this.h = ((Button)findViewById(2131560141));
    this.h.setOnClickListener(this);
    this.e = ((TextView)findViewById(2131560142));
    this.e.setOnClickListener(this);
    this.f = ((Button)findViewById(2131560143));
    this.f.setOnClickListener(this);
    paramBundle = m.a().J();
    if ((paramBundle != null) && (paramBundle.getcChangType().equals("1")))
    {
      this.e.setVisibility(8);
      this.h.setVisibility(8);
      this.f.setVisibility(0);
    }
    for (;;)
    {
      this.g = ((TextView)findViewById(2131560140));
      this.g.setOnClickListener(this);
      this.i = d.a();
      this.l = new ArrayList();
      a();
      return;
      this.e.setVisibility(0);
      this.h.setVisibility(0);
      this.f.setVisibility(8);
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
    case 2131560141: 
      com.android.dazhihui.d.n.a("", 20118);
      if (this.R == 2) {
        if ((this.a == 1) && (this.m.size() == 1) && (this.n.size() == 1))
        {
          if ((com.android.dazhihui.c.a.a.E != null) && (com.android.dazhihui.c.a.a.E.length != 0))
          {
            int i1 = 0;
            while (i1 < com.android.dazhihui.c.a.a.E.length)
            {
              if (((String)this.m.get(0)).equals(com.android.dazhihui.c.a.a.E[i1][0])) {
                this.o = com.android.dazhihui.c.a.a.E[i1][2];
              }
              i1 += 1;
            }
          }
          paramView = (String)this.m.get(0) + "_" + this.o;
          localObject = new Intent();
          ((Intent)localObject).setClass(this, OfflineCapitalDetailActivity.class);
          ((Intent)localObject).putExtra("entrustName", paramView);
          startActivity((Intent)localObject);
        }
      }
      for (;;)
      {
        if ((this.m.size() > 1) && (this.R == 2))
        {
          paramView = new Intent();
          paramView.setClass(this, OfflineCapitalMine.class);
          startActivity(paramView);
        }
        this.i.g();
        return;
        paramView = new Intent();
        paramView.setClass(this, OfflineCapitalMine.class);
        startActivity(paramView);
        continue;
        if ((this.m.size() <= 1) && (this.n.size() <= 1))
        {
          if (!com.android.dazhihui.ui.delegate.b.o.r())
          {
            if (this.m.size() != 0) {}
            for (com.android.dazhihui.ui.delegate.b.o.s = (String)this.m.get(0);; com.android.dazhihui.ui.delegate.b.o.s = "")
            {
              paramView = new Intent();
              localObject = new Bundle();
              ((Bundle)localObject).putInt("TAB_ID", 805306368);
              ((Bundle)localObject).putInt("fragment_index", 0);
              Bundle localBundle = new Bundle();
              localBundle.putBoolean("haveNoLoginSorHaveOne", true);
              localBundle.putString("gotoFlag", "login");
              com.android.dazhihui.ui.a.e.a().a(localBundle);
              paramView.setClass(this, MainScreen.class);
              paramView.putExtras((Bundle)localObject);
              paramView.addFlags(67108864);
              startActivity(paramView);
              break;
            }
          }
          if (com.android.dazhihui.ui.delegate.b.o.l())
          {
            f();
          }
          else if (com.android.dazhihui.ui.delegate.b.o.m())
          {
            this.u = com.android.dazhihui.ui.delegate.b.o.p;
            a(com.android.dazhihui.ui.delegate.b.o.g);
          }
          else
          {
            d();
          }
        }
        else
        {
          paramView = new Intent();
          paramView.setClass(this, OfflineCapitalMine.class);
          startActivity(paramView);
        }
      }
    case 2131560142: 
    case 2131560143: 
      com.android.dazhihui.d.n.a("", 20119);
      d.a().j();
      d.a().g();
      startActivity(new Intent(this, OfflineCapitalSettingActivity.class));
      return;
    }
    paramView = new Intent();
    Object localObject = new Bundle();
    ((Bundle)localObject).putString("nexturl", "http://mnews.gw.com.cn/wap/style/other/qa/service.html");
    ((Bundle)localObject).putString("names", "服务协议");
    paramView.putExtras((Bundle)localObject);
    paramView.setClass(this, BrowserActivity.class);
    startActivity(paramView);
  }
  
  protected void onResume()
  {
    d locald = d.a();
    int i1 = locald.b("offline_capital_state", 0);
    locald.g();
    if ((i1 == 1) || (i1 == 2)) {
      finish();
    }
    super.onResume();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\offlinecapital\OfflineCapitalInitActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */