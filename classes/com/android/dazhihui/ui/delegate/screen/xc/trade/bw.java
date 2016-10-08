package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.e;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.t;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.c.a.a;
import com.android.dazhihui.ui.delegate.b.c;
import com.android.dazhihui.ui.delegate.b.n;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.b;
import com.android.dazhihui.ui.delegate.domain.UserInfo;
import com.android.dazhihui.ui.delegate.screen.ad;
import com.android.dazhihui.ui.delegate.screen.gc;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinZhengRequestData;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse.Ans_Comm_Data;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse.Ans_Msg_Hdr;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse.Answer;
import com.android.dazhihui.ui.delegate.view.TradeAccountSwitchView;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.android.dazhihui.ui.screen.stock.offlinecapital.ah;
import com.android.dazhihui.ui.widget.NoScrollListView;
import com.android.dazhihui.ui.widget.adv.AdvertView;
import com.android.dazhihui.ui.widget.dc;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.ArrayList;
import org.apache.http.entity.StringEntity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class bw
  extends ad
  implements com.android.dazhihui.ui.delegate.view.d, dc
{
  private LinearLayout.LayoutParams[] A;
  private NoScrollListView[] B;
  private b[][] C;
  private ca[] D;
  private boolean E;
  private String F;
  private String G;
  private String H;
  private String I = "";
  private String J = "";
  private String K = "";
  private String L = "";
  private String M = "";
  private String N;
  private String O = "";
  private String P = "";
  private boolean Q = false;
  private boolean R = true;
  private com.android.dazhihui.a.b.u S = null;
  private t T;
  private com.android.dazhihui.a.b.u U;
  String c = "";
  String d = "";
  String e = "";
  com.android.dazhihui.a.b.f f;
  com.android.dazhihui.a.b.f g;
  t h;
  private e i;
  private LayoutInflater j;
  private View k;
  private TradeAccountSwitchView l;
  private TextView m;
  private TextView n;
  private TextView o;
  private TextView p;
  private TextView q;
  private Button r;
  private LinearLayout s;
  private LinearLayout t;
  private LinearLayout u;
  private LinearLayout v;
  private LinearLayout w;
  private ScrollView x;
  private Button y;
  private LinearLayout z;
  
  private String a(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = c.a(n.a(paramString1.getBytes("UTF-8"), paramString2));
      return paramString1;
    }
    catch (Exception paramString1)
    {
      paramString1.printStackTrace();
    }
    return "";
  }
  
  private void a(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    this.U = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("12298").a("1552", "").h()) });
    registRequestListener(this.U);
    a(this.U, paramBoolean);
  }
  
  private String b(String paramString1, String paramString2, String paramString3)
  {
    String str = "";
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString1);
      localStringBuilder.append(paramString2);
      localStringBuilder.append(paramString3);
      localStringBuilder.append(paramString1);
      paramString1 = c.a(localMessageDigest.digest(localStringBuilder.toString().getBytes("UTF-8")));
      return paramString1.toLowerCase();
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        paramString1.printStackTrace();
        paramString1 = str;
      }
    }
  }
  
  private void c(int paramInt)
  {
    new AlertDialog.Builder(getActivity()).setTitle("提示").setMessage("请求超时，是否重试提交?").setPositiveButton("确定", new by(this, paramInt)).setNegativeButton("取消", null).show();
  }
  
  private void d(String paramString)
  {
    JinZhengRequestData localJinZhengRequestData = new JinZhengRequestData();
    localJinZhengRequestData.setService_id("600120");
    localJinZhengRequestData.setType("JinzhengCapital_600120");
    localJinZhengRequestData.setUser_id_cls("2");
    localJinZhengRequestData.setCompany_id(o.q);
    localJinZhengRequestData.setUser_id(o.p);
    localJinZhengRequestData.setSession(paramString);
    localJinZhengRequestData.setCurrency("0");
    paramString = localJinZhengRequestData.jinzhengJson();
    System.out.println("资金信息查询请求数据" + paramString);
    this.h = new t();
    this.h.c(com.android.dazhihui.a.f.Q);
    this.h.c("Content-Type", "application/json");
    try
    {
      paramString = new StringEntity(paramString, "UTF-8");
      this.h.a(paramString);
      this.h.a(this);
      com.android.dazhihui.a.g.a().a(this.h);
      return;
    }
    catch (UnsupportedEncodingException paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  private void h()
  {
    this.l = ((TradeAccountSwitchView)this.k.findViewById(2131559768));
    this.m = ((TextView)this.k.findViewById(2131559770));
    this.n = ((TextView)this.k.findViewById(2131559772));
    this.o = ((TextView)this.k.findViewById(2131559778));
    this.p = ((TextView)this.k.findViewById(2131559776));
    this.q = ((TextView)this.k.findViewById(2131559774));
    this.r = ((Button)this.k.findViewById(2131560921));
    this.s = ((LinearLayout)this.k.findViewById(2131560828));
    this.t = ((LinearLayout)this.k.findViewById(2131560829));
    this.u = ((LinearLayout)this.k.findViewById(2131559788));
    this.v = ((LinearLayout)this.k.findViewById(2131560832));
    this.w = ((LinearLayout)this.k.findViewById(2131560830));
    this.z = ((LinearLayout)this.k.findViewById(2131559789));
    this.x = ((ScrollView)this.k.findViewById(2131559766));
  }
  
  private void i()
  {
    if (o.t == -1) {
      d();
    }
    this.l.a(1, this.k);
    this.j = LayoutInflater.from(getActivity());
    this.z.removeAllViews();
    this.C = o.e(a.z);
    if (this.C != null)
    {
      int i2 = this.C.length;
      this.B = new NoScrollListView[i2];
      this.D = new ca[i2];
      this.A = new LinearLayout.LayoutParams[i2];
      localObject = new cc(this);
      int i1 = 0;
      if (i1 < i2)
      {
        if (this.C[i1].length == 0) {}
        for (;;)
        {
          i1 += 1;
          break;
          this.D[i1] = new ca(this);
          this.D[i1].a(this.C[i1]);
          this.B[i1] = new NoScrollListView(getActivity());
          this.B[i1].setAdapter(this.D[i1]);
          this.B[i1].setBackgroundColor(-1);
          this.B[i1].setDivider(getResources().getDrawable(2131493268));
          this.B[i1].setDividerHeight((int)getResources().getDimension(2131230773));
          this.B[i1].setPadding((int)getResources().getDimension(2131230788), 0, 0, 0);
          this.A[i1] = new LinearLayout.LayoutParams(-1, -2);
          localView1 = new View(getActivity());
          localView1.setBackgroundResource(2131493268);
          LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-1, (int)getResources().getDimension(2131230773));
          if (i1 != 0) {
            localLayoutParams1.setMargins(0, (int)getResources().getDimension(2131230774), 0, 0);
          }
          View localView2 = new View(getActivity());
          localView2.setBackgroundResource(2131493268);
          LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-1, (int)getResources().getDimension(2131230773));
          this.z.addView(localView1, localLayoutParams1);
          this.z.addView(this.B[i1], this.A[i1]);
          this.z.addView(localView2, localLayoutParams2);
          this.B[i1].setOnItemClickListener((AdapterView.OnItemClickListener)localObject);
        }
      }
    }
    Object localObject = new LinearLayout.LayoutParams(-1, -2);
    View localView1 = this.j.inflate(2130903590, null);
    this.y = ((Button)localView1.findViewById(2131559790));
    this.z.addView(localView1, (ViewGroup.LayoutParams)localObject);
    this.y.setOnClickListener(new bx(this));
  }
  
  private void k()
  {
    cb localcb = new cb(this);
    this.s.setOnClickListener(localcb);
    this.t.setOnClickListener(localcb);
    this.u.setOnClickListener(localcb);
    this.v.setOnClickListener(localcb);
    this.w.setOnClickListener(localcb);
    this.r.setOnClickListener(localcb);
  }
  
  public void a(String paramString1, String paramString2, String paramString3)
  {
    ((gc)getParentFragment()).a(paramString1, paramString2, paramString3);
  }
  
  public void b()
  {
    this.m.setText("--");
    this.n.setText("--");
    this.o.setText("--");
    this.p.setText("--");
    this.q.setText("--");
  }
  
  public void beforeHidden()
  {
    super.beforeHidden();
    this.R = false;
  }
  
  public void c()
  {
    if (this.k != null)
    {
      if (o.l()) {
        g();
      }
    }
    else {
      return;
    }
    if (o.m())
    {
      d(o.g);
      return;
    }
    f();
  }
  
  public void c(String paramString)
  {
    JinZhengRequestData localJinZhengRequestData = new JinZhengRequestData();
    localJinZhengRequestData.setService_id("600200");
    localJinZhengRequestData.setType("JinzhengCapital_600200");
    localJinZhengRequestData.setCompany_id(o.q);
    localJinZhengRequestData.setUser_id_cls("2");
    localJinZhengRequestData.setUser_id(o.p);
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
  
  public void d()
  {
    this.f = new com.android.dazhihui.a.b.f();
    this.f.c(com.android.dazhihui.a.f.r);
    registRequestListener(this.f);
    sendRequest(this.f);
  }
  
  public void e()
  {
    this.g = new com.android.dazhihui.a.b.f();
    String str = this.K + "?partnerId=" + this.M;
    this.g.c(str);
    this.g.a(10000L);
    registRequestListener(this.g);
    a(this.g, true);
  }
  
  public void f()
  {
    if (!o.r()) {
      return;
    }
    this.S = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11104").a("1028", "0").a("1234", "1").h()) });
    registRequestListener(this.S);
    a(this.S, false);
  }
  
  public void g()
  {
    if (!o.r()) {
      return;
    }
    this.i = new e();
    this.i.c("https://uatopen.hs.net/secu/v1/balancefast_qry");
    this.i.b("UTF-8");
    this.i.a("Bearer " + o.d);
    this.i.a("targetcomp_id", a.C[com.android.dazhihui.ui.a.e.a().j()][6]);
    this.i.a("sendercomp_id", "90013");
    this.i.a("money_type", "");
    registRequestListener(this.i);
    a(this.i, false);
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    if (paramj == null) {
      return;
    }
    boolean bool = ah.a().c().booleanValue();
    Object localObject1;
    Object localObject5;
    String str;
    if ((paramj instanceof com.android.dazhihui.a.b.g))
    {
      localObject1 = (com.android.dazhihui.a.b.g)paramj;
      if (paramh != this.h) {
        break label398;
      }
      localObject1 = new String(((com.android.dazhihui.a.b.g)localObject1).a());
      System.out.println("资金信息返回数据" + (String)localObject1);
      localObject1 = (JinzhengResponse)new com.c.a.k().a((String)localObject1, JinzhengResponse.class);
      localObject5 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_MSG_HDR.MSG_CODE;
      str = ((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_MSG_HDR.MSG_TEXT;
      if ((((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA == null) && (((String)localObject5).equals("0")))
      {
        c(o.g);
        return;
      }
      if (!((String)localObject5).equals("0"))
      {
        Toast.makeText(getActivity(), str, 1).show();
        return;
      }
      localObject5 = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(0)).ASSERT_VAL;
      str = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(0)).MKT_VAL;
      localObject1 = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(0)).AVAILABLE;
      this.m.setText((CharSequence)localObject5);
      this.n.setText(str);
      this.p.setText((CharSequence)localObject1);
      c(o.g);
      if (bool)
      {
        ah.a().c((String)localObject1);
        ah.a().a((String)localObject5, (String)localObject1, str);
      }
    }
    label330:
    label398:
    Object localObject7;
    if (paramh == this.S)
    {
      localObject1 = ((v)paramj).b();
      if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, getActivity()))
      {
        localObject1 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
        if (!((com.android.dazhihui.ui.delegate.b.h)localObject1).b())
        {
          paramh = Toast.makeText(getActivity(), ((com.android.dazhihui.ui.delegate.b.h)localObject1).d(), 0);
          paramh.setGravity(17, 0, 0);
          paramh.show();
          return;
          if (paramh == this.i) {
            localObject7 = new String(((com.android.dazhihui.a.b.g)localObject1).a());
          }
        }
      }
    }
    for (;;)
    {
      int i1;
      try
      {
        JSONArray localJSONArray = new JSONObject((String)localObject7).getJSONArray("data");
        i1 = 0;
        if (i1 >= localJSONArray.length()) {
          break label330;
        }
        localObject1 = (JSONObject)localJSONArray.get(i1);
        this.F = ((JSONObject)localObject1).getString("enable_balance");
        localObject5 = ((JSONObject)localObject1).getString("asset_balance");
        str = ((JSONObject)localObject1).getString("market_value");
        TextView localTextView = this.p;
        if (this.F == null)
        {
          localObject1 = "";
          localTextView.setText((CharSequence)localObject1);
          localTextView = this.m;
          if (localObject5 == null)
          {
            localObject1 = "";
            localTextView.setText((CharSequence)localObject1);
            localTextView = this.n;
            if (str != null) {
              continue;
            }
            localObject1 = "";
            localTextView.setText((CharSequence)localObject1);
            if (!bool) {
              break label1697;
            }
            ah.a().c(this.F);
            ah.a().a((String)localObject5, this.F, str);
            break label1697;
          }
        }
        else
        {
          localObject1 = this.F;
          continue;
        }
        localObject1 = localObject5;
        continue;
        localObject1 = str;
        continue;
      }
      catch (JSONException localJSONException1)
      {
        try
        {
          localObject5 = ((JSONObject)new JSONTokener((String)localObject7).nextValue()).getString("error_info");
          localObject5 = Toast.makeText(getActivity(), (CharSequence)localObject5, 0);
          ((Toast)localObject5).setGravity(17, 0, 0);
          ((Toast)localObject5).show();
          return;
        }
        catch (JSONException localJSONException3)
        {
          new AlertDialog.Builder(getActivity()).setIcon(2130837525).setTitle("访问令牌无效或已过期,请重新登录！").setPositiveButton(2131165363, new bz(this)).show();
          localJSONException3.printStackTrace();
          localJSONException1.printStackTrace();
        }
      }
      if (paramh == this.f)
      {
        Object localObject2 = new String(localJSONException1.a());
        try
        {
          o.t = new JSONObject((String)localObject2).optJSONArray("data").length();
          if (this.D == null) {
            break label330;
          }
          localObject2 = this.D;
          i2 = localObject2.length;
          i1 = 0;
          while (i1 < i2)
          {
            localObject6 = localObject2[i1];
            if (localObject6 != null) {
              ((ca)localObject6).notifyDataSetChanged();
            }
            i1 += 1;
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            localException.printStackTrace();
          }
        }
      }
      if (paramh != this.g) {
        break label330;
      }
      Object localObject3 = new String(localException.a());
      try
      {
        localObject3 = new JSONObject((String)localObject3);
        if (!((JSONObject)localObject3).getString("responseCode").equals("0")) {
          break label1113;
        }
        this.c = ((JSONObject)localObject3).getString("timestamp");
        localObject3 = ((JSONObject)localObject3).getString("rsaPublicKey");
        if ((!TextUtils.isEmpty(this.c)) && (!TextUtils.isEmpty((CharSequence)localObject3))) {
          break label912;
        }
        Toast.makeText(getActivity(), "数据有误，请检查...", 0).show();
        return;
      }
      catch (JSONException localJSONException2)
      {
        localJSONException2.printStackTrace();
      }
      break label330;
      label912:
      this.d = b(this.O, this.M, this.c);
      Object localObject6 = new UserInfo("", "", "", "", "", "", "", this.J, "");
      this.e = a(new com.c.a.k().a(localObject6), localJSONException2);
      Object localObject4 = this.L + "?partnerId=" + this.M + "&timestamp=" + this.c + "&signature=" + this.d + "&userInfo=" + this.e + "&paramType=H5&os=android" + "&pageCode=" + this.P;
      localObject6 = new Bundle();
      ((Bundle)localObject6).putString("nexturl", (String)localObject4);
      ((Bundle)localObject6).putString("names", this.N);
      a(BrowserActivity.class, (Bundle)localObject6);
      break label330;
      label1113:
      a(((JSONObject)localObject4).getString("responseMsg"));
      break label330;
      int i2 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).g();
      if (i2 > 0)
      {
        i1 = 0;
        label1141:
        if (i1 >= i2) {
          break label1691;
        }
        localObject6 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1415");
        if ((localObject6 == null) || (!((String)localObject6).equals("1"))) {
          break label1478;
        }
      }
      for (;;)
      {
        this.F = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1078");
        this.G = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1087");
        localObject6 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1064");
        this.H = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1065");
        str = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1079");
        localObject7 = this.p;
        if (this.F == null)
        {
          localObject4 = "";
          label1252:
          ((TextView)localObject7).setText((CharSequence)localObject4);
          localObject7 = this.m;
          if (this.G != null) {
            break label1495;
          }
          localObject4 = "";
          label1274:
          ((TextView)localObject7).setText((CharSequence)localObject4);
          localObject7 = this.n;
          if (this.H != null) {
            break label1503;
          }
          localObject4 = "";
          label1296:
          ((TextView)localObject7).setText((CharSequence)localObject4);
          localObject7 = this.q;
          if (localObject6 != null) {
            break label1511;
          }
          localObject4 = "";
          label1316:
          ((TextView)localObject7).setText((CharSequence)localObject4);
          localObject7 = this.o;
          if (str != null) {
            break label1517;
          }
          localObject4 = "";
          label1336:
          ((TextView)localObject7).setText((CharSequence)localObject4);
          if ((localObject6 == null) || (((String)localObject6).equals("")) || (Double.parseDouble((String)localObject6) <= 0.0D)) {
            break label1523;
          }
          this.q.setTextColor(-65536);
        }
        for (;;)
        {
          if (bool)
          {
            ah.a().c(this.F);
            ah.a().a(this.G, this.F, this.H);
          }
          if (paramh != this.U) {
            break;
          }
          paramh = ((v)paramj).b();
          if (!com.android.dazhihui.ui.delegate.b.u.a(paramh, getActivity())) {
            break;
          }
          paramh = com.android.dazhihui.ui.delegate.b.h.b(paramh.e());
          if (paramh.b()) {
            break label1588;
          }
          paramh = Toast.makeText(getActivity(), paramh.d(), 0);
          paramh.setGravity(17, 0, 0);
          paramh.show();
          return;
          label1478:
          i1 += 1;
          break label1141;
          localObject4 = this.F;
          break label1252;
          label1495:
          localObject4 = this.G;
          break label1274;
          label1503:
          localObject4 = this.H;
          break label1296;
          label1511:
          localObject4 = localObject6;
          break label1316;
          label1517:
          localObject4 = str;
          break label1336;
          label1523:
          if ((isAdded()) && (localObject6 != null) && (!((String)localObject6).equals("")) && (Double.parseDouble((String)localObject6) < 0.0D)) {
            this.q.setTextColor(getResources().getColor(2131492932));
          } else {
            this.q.setTextColor(-16777216);
          }
        }
        label1588:
        paramh = paramh.a(0, "1011");
        if (paramh.equals("0"))
        {
          paramh = new Intent();
          paramh.setClass(getActivity(), DailyEarningsCanYu.class);
          paramj = new Bundle();
          paramj.putBoolean("fromGP", true);
          paramh.putExtras(paramj);
          startActivity(paramh);
          return;
        }
        if (!paramh.equals("1")) {
          break;
        }
        paramh = new Intent();
        paramh.setClass(getActivity(), DailyEarning.class);
        startActivity(paramh);
        return;
        label1691:
        i1 = 0;
      }
      label1697:
      i1 += 1;
    }
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    super.handleTimeout(paramh);
    if (paramh == this.g) {
      c(1);
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.k = paramLayoutInflater.inflate(2130903511, paramViewGroup, false);
    paramLayoutInflater = (AdvertView)this.k.findViewById(2131560920);
    paramLayoutInflater.setAdvCode(148);
    addAdvert(paramLayoutInflater);
    h();
    i();
    k();
    b();
    if (o.l()) {
      g();
    }
    for (;;)
    {
      this.l.a();
      this.l.setAccountSwitchItemClick(this);
      this.I = a.z;
      this.J = com.android.dazhihui.ui.delegate.c.d.a;
      this.E = true;
      return this.k;
      if (o.m()) {
        d(o.g);
      } else {
        f();
      }
    }
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
    this.Q = paramBoolean;
  }
  
  public void onPause()
  {
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
    if ((this.R) && (!isHidden()) && (!this.Q) && (!this.E) && (!com.android.dazhihui.ui.delegate.b.k.a(getActivity()).b()))
    {
      this.l.a();
      if ((!this.I.equals(a.z)) || (!this.J.equals(com.android.dazhihui.ui.delegate.c.d.a)))
      {
        this.I = a.z;
        this.J = com.android.dazhihui.ui.delegate.c.d.a;
        b();
      }
      if (o.r())
      {
        if (!o.l()) {
          break label127;
        }
        g();
      }
    }
    for (;;)
    {
      this.x.scrollTo(0, 0);
      this.E = false;
      return;
      label127:
      if (o.m()) {
        d(o.g);
      } else {
        f();
      }
    }
  }
  
  public void show()
  {
    super.show();
    this.R = true;
    if (this.k != null)
    {
      i();
      this.l.a();
      if ((!this.I.equals(a.z)) || (!this.J.equals(com.android.dazhihui.ui.delegate.c.d.a)))
      {
        this.I = a.z;
        this.J = com.android.dazhihui.ui.delegate.c.d.a;
        b();
      }
      if (!o.l()) {
        break label91;
      }
      g();
    }
    for (;;)
    {
      this.x.scrollTo(0, 0);
      return;
      label91:
      if (o.m()) {
        d(o.g);
      } else {
        f();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\bw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */