package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.app.AlertDialog.Builder;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.e;
import com.android.dazhihui.a.b.g;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.t;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.a.f;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.a;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.delegate.screen.TradeText;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinZhengRequestData;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse.Ans_Comm_Data;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse.Ans_Msg_Hdr;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse.Answer;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.mh;
import com.c.a.k;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import org.apache.http.HttpEntity;
import org.apache.http.entity.StringEntity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class TradeQuery
  extends DelegateBaseActivity
  implements cp, cs
{
  public static final String[] a = { "人民币", "美元", "港币" };
  private String[] A;
  private final String[] B = { "委托时间", "价格/均价", "数量/成交", "状态" };
  private final String[] C = { "成交时间", "成交价", "成交量", "成交金额" };
  private final String[] D = { "委托日期", "价格/均价", "数量/成交", "状态" };
  private final String[] E = { "成交日期", "成交价", "成交量", "成交金额" };
  private final String[] F = { "配号日期", "证券", "起始配号", "配号数量" };
  private final String[] G = { "中签日期", "证券名称", "证券代码", "中签股数" };
  private final String[] H = { "证券名称", "委托时间", "价格", "均价", "数量", "成交", "状态" };
  private final String[] I = { "1037", "1039", "1041", "1048", "1040", "1047", "1043" };
  private final String[] J = { "未发送", "已发送", "部分成交", "全部成交", "部分撤单", "全部撤单", "废单" };
  private final String[] K = { "stock_name", "entrust_time", "entrust_price", "business_price", "entrust_amount", "business_amount", "entrust_status" };
  private final String[] L = { "证券名称", "成交时间", "成交价", "成交量", "成交金额" };
  private final String[] M = { "1037", "1046", "1048", "1047", "1049" };
  private final String[] N = { "stock_name", "business_time", "business_price", "business_amount", "business_balance" };
  private final String[] O = { "证券名称", "委托日期", "价格", "均价", "数量", "成交", "状态" };
  private final String[] P = { "1037", "1038", "1041", "1048", "1040", "1047", "1043" };
  private final String[] Q = { "stock_name", "entrust_date", "entrust_price", "business_price", "entrust_amount", "business_amount", "entrust_status" };
  private final String[] R = { "证券名称", "成交日期", "成交价", "成交量", "成交金额" };
  private final String[] S = { "1037", "1045", "1048", "1047", "1049" };
  private final String[] T = { "stock_name", "business_time", "business_price", "occur_amount", "business_balance" };
  private final String[] U = { "配号日期", "证券名称", "证券代码", "起始配号", "配号数量" };
  private final String[] V = { "1045", "1037", "1036", "1057", "1058" };
  private final String[] W = { "", "", "stock_code", "start_no", "occur_amount" };
  private final String[] X = { "中签日期", "证券名称", "证券代码", "中签数量" };
  private final String[] Y = { "1279", "1037", "1036", "1047" };
  private final String[] aa = { "init_date", "", "stock_code", "occur_amount" };
  private int ab;
  private int ac;
  private String ad;
  private String[] ae;
  private String[] af;
  private Vector<Integer> ag;
  private Vector<String[]> ah;
  private cl ai;
  private LayoutInflater aj;
  private int ak;
  private int al;
  private int am;
  private String an;
  private int ao;
  private int ap;
  private int aq;
  private String ar;
  private int as;
  private int at;
  private t au;
  private String av;
  private com.android.dazhihui.a.b.u aw = null;
  private DatePickerDialog.OnDateSetListener ax = new ci(this);
  private DatePickerDialog.OnDateSetListener ay = new cj(this);
  private e b;
  private String c = "";
  private String d = "";
  private int e = 20;
  private boolean f = false;
  private DzhHeader g;
  private LinearLayout h;
  private LinearLayout i;
  private LinearLayout j;
  private LinearLayout m;
  private TableLayoutGroup n;
  private TextView o;
  private TextView p;
  private Button q;
  private TextView r;
  private TextView s;
  private TextView t;
  private TextView u;
  private ListView v;
  private LinearLayout w;
  private Spinner x;
  private ImageView y;
  private ImageView z;
  
  private void a()
  {
    this.g = ((DzhHeader)findViewById(2131558643));
    this.h = ((LinearLayout)findViewById(2131558774));
    this.i = ((LinearLayout)findViewById(2131558775));
    this.j = ((LinearLayout)findViewById(2131558776));
    this.m = ((LinearLayout)findViewById(2131558888));
    this.n = ((TableLayoutGroup)findViewById(2131558887));
    this.w = ((LinearLayout)findViewById(2131560928));
    this.x = ((Spinner)findViewById(2131559748));
    this.o = ((TextView)findViewById(2131558687));
    this.p = ((TextView)findViewById(2131558688));
    this.q = ((Button)findViewById(2131558777));
    this.r = ((TextView)findViewById(2131558890));
    this.s = ((TextView)findViewById(2131558891));
    this.t = ((TextView)findViewById(2131558892));
    this.u = ((TextView)findViewById(2131558893));
    this.v = ((ListView)findViewById(2131558780));
    this.y = ((ImageView)findViewById(2131558778));
    this.z = ((ImageView)findViewById(2131558889));
  }
  
  private void a(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    int i1;
    int k;
    com.android.dazhihui.ui.delegate.b.h localh;
    if ((o.i()) || (this.ab == 11152))
    {
      i1 = this.as;
      k = this.at;
      localh = o.g(this.ab + "");
      switch (this.ab)
      {
      }
    }
    for (;;)
    {
      this.aw = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.h()) });
      registRequestListener(this.aw);
      a(this.aw, paramBoolean);
      return;
      i1 = this.ah.size();
      k = 20;
      break;
      localh.a("1206", i1).a("1277", k).a("1036", "").a("1026", "2");
      continue;
      localh.a("1206", i1).a("1277", k).a("1036", "").a("1026", "2").a("1217", 1);
      continue;
      localh.a("1022", this.an).a("1023", this.ar).a("1206", i1).a("1277", k);
      continue;
      int i2 = 9;
      if (au.a == "1")
      {
        i2 = this.x.getSelectedItemPosition();
        i2 = o.k(a[i2]);
      }
      localh.a("1022", this.an).a("1023", this.ar).a("1206", i1).a("1277", k).a("1028", "" + i2);
    }
  }
  
  private void b()
  {
    if ((o.i()) || (this.ab == 11152))
    {
      this.as = 0;
      this.at = 20;
      this.n.a();
      return;
    }
    this.ah = new Vector();
    this.ag = new Vector();
    this.v.addFooterView(this.ai.a());
  }
  
  private void b(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    this.b = new e();
    this.b.b("UTF-8");
    this.b.a("Bearer " + o.d);
    this.b.a("position_str", this.c);
    this.b.a("request_num", "20");
    switch (this.ab)
    {
    }
    for (;;)
    {
      registRequestListener(this.b);
      a(this.b, paramBoolean);
      return;
      this.b.c("https://uatopen.hs.net/secu/v1/entrust_qry");
      this.b.a("targetcomp_id", com.android.dazhihui.c.a.a.C[com.android.dazhihui.ui.a.e.a().j()][6]);
      this.b.a("sendercomp_id", "90013");
      this.b.a("action_in", "0");
      this.b.a("exchange_type", "");
      this.b.a("stock_account", "");
      this.b.a("stock_code", "");
      this.b.a("locate_entrust_no", "");
      continue;
      this.b.c("https://uatopen.hs.net/secu/v1/business_qry");
      this.b.a("targetcomp_id", com.android.dazhihui.c.a.a.C[com.android.dazhihui.ui.a.e.a().j()][6]);
      this.b.a("sendercomp_id", "90013");
      this.b.a("exchange_type", "");
      this.b.a("stock_account", "");
      this.b.a("stock_code", "");
      continue;
      this.b.c("https://uatopen.hs.net/secu/v1/businesshis_qry");
      this.b.a("targetcomp_id", com.android.dazhihui.c.a.a.C[com.android.dazhihui.ui.a.e.a().j()][6]);
      this.b.a("sendercomp_id", "90013");
      this.b.a("start_date", this.an);
      this.b.a("end_date", this.ar);
      this.b.a("exchange_type", "");
      this.b.a("stock_account", "");
      this.b.a("stock_code", "");
      continue;
      this.b.c("https://uatopen.hs.net/secu/v1/entrusthis_qry");
      this.b.a("targetcomp_id", com.android.dazhihui.c.a.a.C[com.android.dazhihui.ui.a.e.a().j()][6]);
      this.b.a("sendercomp_id", "90013");
      this.b.a("start_date", this.an);
      this.b.a("end_date", this.ar);
      this.b.a("exchange_type", "");
      this.b.a("stock_account", "");
      this.b.a("stock_code", "");
      continue;
      this.b.c("https://uatopen.hs.net/secu/v1/matchinfo_qry");
      this.b.a("targetcomp_id", com.android.dazhihui.c.a.a.C[com.android.dazhihui.ui.a.e.a().j()][6]);
      this.b.a("sendercomp_id", "90013");
      this.b.a("start_date", this.an);
      this.b.a("end_date", this.ar);
      continue;
      this.b.c("https://uatopen.hs.net/secu/v1/luckyinfo_qry");
      this.b.a("targetcomp_id", com.android.dazhihui.c.a.a.C[com.android.dazhihui.ui.a.e.a().j()][6]);
      this.b.a("sendercomp_id", "90013");
      this.b.a("start_date", this.an);
      this.b.a("end_date", this.ar);
    }
  }
  
  private void c()
  {
    Object localObject = getIntent().getExtras();
    if (localObject != null) {
      this.ab = ((Bundle)localObject).getInt("category");
    }
    switch (this.ab)
    {
    default: 
      this.g.a(this, this);
      if ((this.ab == 11142) || (this.ab == 11136) || (this.ab == 11148) || (this.ab == 12024) || (this.ab == 11152))
      {
        this.an = o.x();
        this.ak = Integer.parseInt(this.an.substring(0, 4));
        this.al = Integer.parseInt(this.an.substring(4, 6));
        this.am = Integer.parseInt(this.an.substring(6, 8));
        this.o.setText(this.ak + "-" + this.al + "-" + this.am);
        this.ar = o.y();
        this.ao = Integer.parseInt(this.ar.substring(0, 4));
        this.ap = Integer.parseInt(this.ar.substring(4, 6));
        this.aq = Integer.parseInt(this.ar.substring(6, 8));
        this.p.setText(this.ao + "-" + this.ap + "-" + this.aq);
      }
      if (this.ab == 11152)
      {
        if (!au.a.equals("0")) {
          break label1284;
        }
        this.w.setVisibility(8);
      }
      break;
    }
    for (;;)
    {
      if ((!o.i()) && (this.ab != 11152)) {
        break label1337;
      }
      this.n.setVisibility(0);
      this.m.setVisibility(8);
      if ((this.ae == null) || (this.af == null))
      {
        this.ae = new String[] { "" };
        this.af = new String[] { "" };
      }
      this.n.setHeaderColumn(this.ae);
      this.n.setPullDownLoading(false);
      this.n.setColumnClickable(null);
      this.n.setContinuousLoading(false);
      this.n.setHeaderBackgroundColor(getResources().getColor(2131493677));
      this.n.setHeaderDivideDrawable(getResources().getDrawable(2130838328));
      this.n.setHeaderFontSize(getResources().getDimension(2131230899));
      this.n.setHeaderHeight((int)getResources().getDimension(2131230814));
      this.n.setLeftPadding(25);
      this.n.setDrawHeaderSeparateLine(false);
      this.n.setHeaderTextColor(getResources().getColor(2131493099));
      this.n.setListDivideDrawable(getResources().getDrawable(2130838328));
      this.n.setRowHighLightBackgroudDrawable(getResources().getDrawable(2130838067));
      this.n.setStockNameColor(getResources().getColor(2131493235));
      this.n.setFirstColumnColorDifferent(true);
      this.n.setOnLoadingListener(new ce(this));
      this.n.setOnTableLayoutClickListener(new cf(this));
      return;
      this.ad = "当日委托";
      this.h.setVisibility(8);
      this.z.setVisibility(4);
      this.A = this.B;
      this.ae = this.H;
      if (o.l())
      {
        this.af = this.K;
        break;
      }
      if (o.i())
      {
        this.ae = a.g;
        this.af = a.h;
        break;
      }
      this.af = this.I;
      break;
      this.ad = "当日成交";
      this.h.setVisibility(8);
      this.z.setVisibility(4);
      this.A = this.C;
      this.ae = this.L;
      if (o.l())
      {
        this.af = this.N;
        break;
      }
      if (o.i())
      {
        this.ae = a.i;
        this.af = a.j;
        break;
      }
      this.af = this.M;
      break;
      this.ad = "历史委托";
      this.h.setVisibility(0);
      this.z.setVisibility(4);
      this.A = this.D;
      this.ae = this.O;
      if (o.l())
      {
        this.af = this.Q;
        break;
      }
      if (o.i())
      {
        this.ae = a.C;
        this.af = a.D;
        break;
      }
      this.af = this.P;
      break;
      this.ad = "历史成交";
      this.h.setVisibility(0);
      this.z.setVisibility(4);
      this.A = this.E;
      this.ae = this.R;
      if (o.l())
      {
        this.af = this.T;
        break;
      }
      if (o.i())
      {
        this.ae = a.k;
        this.af = a.l;
        break;
      }
      this.af = this.S;
      break;
      this.ad = "新股配号";
      this.h.setVisibility(0);
      this.z.setVisibility(8);
      this.A = this.F;
      this.ae = this.U;
      if (o.l())
      {
        this.af = this.W;
        break;
      }
      if (o.i())
      {
        this.ae = a.m;
        this.af = a.n;
        break;
      }
      this.af = this.V;
      break;
      this.ad = "新股中签";
      this.h.setVisibility(0);
      this.z.setVisibility(8);
      this.A = this.G;
      this.ae = this.X;
      if (o.l())
      {
        this.af = this.aa;
        break;
      }
      if (o.i())
      {
        this.ae = a.G;
        this.af = a.H;
        break;
      }
      this.af = this.Y;
      break;
      this.ad = "交割单";
      this.h.setVisibility(0);
      this.z.setVisibility(8);
      this.ae = a.I;
      this.af = a.J;
      break;
      label1284:
      if (au.a.equals("1"))
      {
        this.w.setVisibility(0);
        localObject = new ArrayAdapter(this, 17367048, a);
        ((ArrayAdapter)localObject).setDropDownViewResource(17367049);
        this.x.setAdapter((SpinnerAdapter)localObject);
      }
    }
    label1337:
    this.n.setVisibility(8);
    this.m.setVisibility(0);
    if (this.A != null)
    {
      this.r.setText(this.A[0]);
      this.s.setText(this.A[1]);
      this.t.setText(this.A[2]);
      this.u.setText(this.A[3]);
    }
    this.ah = new Vector();
    this.ag = new Vector();
    this.aj = LayoutInflater.from(this);
    this.ai = new cl(this, this.ab);
    this.v.addFooterView(this.ai.a());
    this.v.setAdapter(this.ai);
    this.y.setVisibility(8);
  }
  
  private void c(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    Object localObject = new JinZhengRequestData();
    switch (this.ab)
    {
    }
    for (;;)
    {
      try
      {
        if (this.av == null) {
          break;
        }
        System.out.println("requestData = " + this.av);
        this.au = new t();
        this.au.c(f.Q);
        this.au.c("Content-Type", "application/json");
        localObject = new StringEntity(this.av, "UTF-8");
        this.au.a((HttpEntity)localObject);
        this.au.a(this);
        a(this.au, paramBoolean);
        return;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        localUnsupportedEncodingException.printStackTrace();
        return;
      }
      localUnsupportedEncodingException.setType("JinzhengDRWT_600160");
      localUnsupportedEncodingException.setService_id("600160");
      localUnsupportedEncodingException.setCompany_id(o.q);
      localUnsupportedEncodingException.setUser_id(o.p);
      localUnsupportedEncodingException.setUser_id_cls("2");
      localUnsupportedEncodingException.setSession(o.g);
      localUnsupportedEncodingException.setKey_str(this.d);
      localUnsupportedEncodingException.setRec_count("" + this.e);
      this.av = localUnsupportedEncodingException.jinzhengJson();
      continue;
      localUnsupportedEncodingException.setType("JinzhengDRCJ_600180");
      localUnsupportedEncodingException.setService_id("600180");
      localUnsupportedEncodingException.setCompany_id(o.q);
      localUnsupportedEncodingException.setUser_id(o.p);
      localUnsupportedEncodingException.setUser_id_cls("2");
      localUnsupportedEncodingException.setSession(o.g);
      localUnsupportedEncodingException.setKey_str(this.d);
      localUnsupportedEncodingException.setRec_count("" + this.e);
      this.av = localUnsupportedEncodingException.jinzhengJson();
      continue;
      localUnsupportedEncodingException.setType("JinzhengLSCJ_600190");
      localUnsupportedEncodingException.setService_id("600190");
      localUnsupportedEncodingException.setCompany_id(o.q);
      localUnsupportedEncodingException.setUser_id(o.p);
      localUnsupportedEncodingException.setUser_id_cls("2");
      localUnsupportedEncodingException.setSession(o.g);
      localUnsupportedEncodingException.setKey_str(this.d);
      localUnsupportedEncodingException.setRec_count("" + this.e);
      localUnsupportedEncodingException.setBegin_date(this.an);
      localUnsupportedEncodingException.setEnd_date(this.ar);
      this.av = localUnsupportedEncodingException.jinzhengJson();
      continue;
      localUnsupportedEncodingException.setType("JinzhengLSWT_600170");
      localUnsupportedEncodingException.setService_id("600170");
      localUnsupportedEncodingException.setCompany_id(o.q);
      localUnsupportedEncodingException.setUser_id(o.p);
      localUnsupportedEncodingException.setUser_id_cls("2");
      localUnsupportedEncodingException.setSession(o.g);
      localUnsupportedEncodingException.setKey_str(this.d);
      localUnsupportedEncodingException.setRec_count("" + this.e);
      localUnsupportedEncodingException.setBegin_date(this.an);
      localUnsupportedEncodingException.setEnd_date(this.ar);
      this.av = localUnsupportedEncodingException.jinzhengJson();
      continue;
      localUnsupportedEncodingException.setType("JinzhengXGPH_600330");
      localUnsupportedEncodingException.setService_id("600330");
      localUnsupportedEncodingException.setCompany_id(o.q);
      localUnsupportedEncodingException.setUser_id(o.p);
      localUnsupportedEncodingException.setUser_id_cls("2");
      localUnsupportedEncodingException.setSession(o.g);
      localUnsupportedEncodingException.setBegin_date(this.an);
      localUnsupportedEncodingException.setEnd_date(this.ar);
      this.av = localUnsupportedEncodingException.jinzhengJson();
      continue;
      localUnsupportedEncodingException.setType("JinzhengXGZQ_600340");
      localUnsupportedEncodingException.setService_id("600340");
      localUnsupportedEncodingException.setCompany_id(o.q);
      localUnsupportedEncodingException.setUser_id(o.p);
      localUnsupportedEncodingException.setUser_id_cls("2");
      localUnsupportedEncodingException.setSession(o.g);
      localUnsupportedEncodingException.setBegin_date(this.an);
      localUnsupportedEncodingException.setEnd_date(this.ar);
      this.av = localUnsupportedEncodingException.jinzhengJson();
    }
  }
  
  public static String d(String paramString)
  {
    if (paramString.equals("0")) {
      return "未报";
    }
    if (paramString.equals("1")) {
      return "待报";
    }
    if (paramString.equals("2")) {
      return "已报";
    }
    if (paramString.equals("3")) {
      return "已报待撤";
    }
    if (paramString.equals("4")) {
      return "部成待撤";
    }
    if (paramString.equals("6")) {
      return "已撤";
    }
    if (paramString.equals("7")) {
      return "部成";
    }
    if (paramString.equals("8")) {
      return "已成";
    }
    if (paramString.equals("9")) {
      return "废单";
    }
    return "";
  }
  
  private void d()
  {
    cm localcm = new cm(this);
    this.q.setOnClickListener(localcm);
    this.i.setOnClickListener(localcm);
    this.j.setOnClickListener(localcm);
    if ((!o.i()) || (11152 == this.ab)) {
      this.v.setOnScrollListener(new cg(this));
    }
  }
  
  public boolean OnChildClick(View paramView)
  {
    switch (((Integer)paramView.getTag()).intValue())
    {
    }
    for (;;)
    {
      return true;
      finish();
    }
  }
  
  public BigDecimal a(String paramString1, String paramString2)
  {
    return new BigDecimal(paramString1).multiply(new BigDecimal(paramString2)).setScale(2, 0);
  }
  
  public void a(mh parammh, int paramInt, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    String[] arrayOfString = parammh.a;
    StringBuffer localStringBuffer = new StringBuffer();
    paramInt = 0;
    while (paramInt < arrayOfString.length)
    {
      paramArrayOfString2 = arrayOfString[paramInt];
      parammh = paramArrayOfString2;
      if (paramArrayOfString2 == null) {
        parammh = "-";
      }
      localStringBuffer.append("\n").append(paramArrayOfString1[paramInt]).append(": ").append(parammh);
      paramInt += 1;
    }
    parammh = new Bundle();
    parammh.putString("str", localStringBuffer.toString());
    startActivity(TradeText.class, parammh);
  }
  
  public void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (ck.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.g == null);
      this.g.a(paramy);
      return;
    } while (this.g == null);
    this.g.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.p = this;
    paramct.d = this.ad;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.g = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    if (paramj == null) {}
    Object localObject1;
    Object localObject2;
    int i2;
    int k;
    Object localObject3;
    Object localObject4;
    int i1;
    for (;;)
    {
      return;
      if (paramh == this.aw)
      {
        localObject1 = ((v)paramj).b();
        if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, this))
        {
          localObject2 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
          if (!((com.android.dazhihui.ui.delegate.b.h)localObject2).b())
          {
            paramh = Toast.makeText(this, ((com.android.dazhihui.ui.delegate.b.h)localObject2).d(), 0);
            paramh.setGravity(17, 0, 0);
            paramh.show();
            return;
          }
          i2 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).g();
          this.ac = ((com.android.dazhihui.ui.delegate.b.h)localObject2).b("1289");
          if ((!o.i()) && (this.ab != 11152)) {
            break label585;
          }
          int i3 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).g();
          if ((i3 == 0) && (this.n.getDataModel().size() == 0))
          {
            this.n.setBackgroundResource(2130838490);
            return;
          }
          this.n.setBackgroundColor(getResources().getColor(2131493677));
          if (i3 > 0)
          {
            localObject1 = new ArrayList();
            k = 0;
            while (k < i3)
            {
              localObject3 = new mh();
              localObject4 = new String[this.ae.length];
              int[] arrayOfInt = new int[this.ae.length];
              i1 = 0;
              for (;;)
              {
                if (i1 >= this.ae.length) {
                  break label365;
                }
                try
                {
                  localObject4[i1] = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(k, this.af[i1]).trim();
                  if (localObject4[i1] == null) {
                    localObject4[i1] = "--";
                  }
                }
                catch (Exception localException)
                {
                  for (;;)
                  {
                    String str;
                    localObject4[i1] = "--";
                    continue;
                    i2 = getResources().getColor(2131492932);
                  }
                }
                str = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(k, "1026");
                if ((str == null) || (!str.equals("0"))) {
                  break;
                }
                i2 = -65536;
                localObject4[i1] = o.c(this.af[i1], localObject4[i1]);
                arrayOfInt[i1] = i2;
                i1 += 1;
              }
              label365:
              ((mh)localObject3).a = ((String[])localObject4);
              ((mh)localObject3).b = arrayOfInt;
              ((List)localObject1).add(localObject3);
              k += 1;
            }
            this.n.a((List)localObject1, this.as);
          }
        }
      }
      while (paramh == this.b)
      {
        paramj = new String(((g)paramj).a());
        try
        {
          localObject1 = new JSONObject(paramj).getJSONArray("data");
          k = ((JSONArray)localObject1).length();
          this.ai.a(k);
          if ((k != 0) || (this.ah.size() != 0)) {
            break label4070;
          }
          this.y.setVisibility(0);
          this.v.removeFooterView(this.ai.a());
          return;
        }
        catch (JSONException paramh)
        {
          try
          {
            paramh = Toast.makeText(this, ((JSONObject)new JSONTokener(paramj).nextValue()).getString("error_info"), 0);
            paramh.setGravity(17, 0, 0);
            paramh.show();
            return;
          }
          catch (JSONException paramh)
          {
            new AlertDialog.Builder(this).setIcon(2130837525).setTitle("访问令牌无效或已过期,请重新登录！").setPositiveButton(2131165363, new ch(this)).show();
            paramh.printStackTrace();
            return;
          }
        }
        label585:
        this.ai.a(this.ac);
        if ((i2 == 0) && (this.ah.size() == 0))
        {
          this.y.setVisibility(0);
          this.v.removeFooterView(this.ai.a());
          return;
        }
        this.y.setVisibility(4);
        if (this.ah.size() + i2 >= this.ac) {
          this.v.removeFooterView(this.ai.a());
        }
        if (i2 > 0)
        {
          k = 0;
          if (k < i2)
          {
            localObject3 = new String[this.af.length];
            i1 = 0;
            if (i1 < this.af.length)
            {
              if (((com.android.dazhihui.ui.delegate.b.h)localObject2).a(k, this.af[i1]) == null) {}
              for (localObject1 = "";; localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(k, this.af[i1]))
              {
                localObject3[i1] = localObject1;
                i1 += 1;
                break;
              }
            }
            localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(k, "1026");
            if ((localObject1 != null) && (((String)localObject1).equals("0"))) {}
            for (i1 = -65536;; i1 = getResources().getColor(2131492932))
            {
              if (this.ab == 11142) {
                localObject3[4] = a(localObject3[2], localObject3[3]).toString();
              }
              this.ah.add(localObject3);
              this.ag.add(new Integer(i1));
              k += 1;
              break;
            }
          }
        }
        this.ai.notifyDataSetChanged();
        continue;
        if (paramh == this.au)
        {
          localObject2 = new String(((g)paramj).a());
          localObject1 = (JinzhengResponse)new k().a((String)localObject2, JinzhengResponse.class);
          localObject3 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_MSG_HDR.MSG_CODE;
          localObject4 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_MSG_HDR.MSG_TEXT;
          System.out.println("code = " + (String)localObject3);
          System.out.println("text = " + (String)localObject4);
          System.out.println("data = " + (String)localObject2);
          switch (this.ab)
          {
          default: 
            break;
          case 11134: 
            System.out.println("当日委托...");
            if (((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA == null) {}
            for (k = 0;; k = ((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.size())
            {
              this.ai.a(k);
              if ((k != 0) || (this.ah.size() != 0)) {
                break;
              }
              this.y.setVisibility(0);
              this.v.removeFooterView(this.ai.a());
              return;
            }
            this.y.setVisibility(4);
            if (k < this.e)
            {
              this.v.removeFooterView(this.ai.a());
              this.f = false;
              if (k <= 0) {
                break label1621;
              }
              i1 = 0;
              if (i1 >= k) {
                break label1621;
              }
              localObject2 = new String[this.af.length];
              this.d = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).KEY_STR;
              localObject2[0] = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).SECU_NAME;
              localObject2[1] = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).ORDER_TIME;
              localObject2[2] = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).PRICE;
              localObject2[3] = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).MATCHED_PRICE;
              localObject2[4] = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).QTY;
              localObject2[5] = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).MATCHED_QTY;
              localObject2[6] = this.J[((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)localObject1.ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).DCL_FLAG];
              localObject3 = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).TRD_ID;
              if ((localObject3 == null) || (!((String)localObject3).endsWith("B"))) {
                break label1606;
              }
            }
            for (i2 = -65536;; i2 = getResources().getColor(2131492932))
            {
              this.ah.add(localObject2);
              this.ag.add(new Integer(i2));
              i1 += 1;
              break label1259;
              this.f = true;
              break;
            }
            this.ai.notifyDataSetChanged();
            break;
          case 11140: 
            System.out.println("当日成交...");
            if (((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA == null) {}
            for (k = 0;; k = ((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.size())
            {
              this.ai.a(k);
              if ((k != 0) || (this.ah.size() != 0)) {
                break;
              }
              this.y.setVisibility(0);
              this.v.removeFooterView(this.ai.a());
              return;
            }
            this.y.setVisibility(4);
            if (k < this.e)
            {
              this.v.removeFooterView(this.ai.a());
              this.f = false;
              if (k <= 0) {
                break label2127;
              }
              i1 = 0;
              if (i1 >= k) {
                break label2127;
              }
              localObject2 = new String[this.af.length];
              this.d = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).KEY_STR;
              localObject2[0] = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).SECU_NAME;
              localObject2[1] = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).MATCHED_TIME;
              localObject2[2] = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).MATCHED_PRICE;
              localObject2[3] = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).MATCHED_QTY;
              localObject2[4] = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).MATCHED_AMT;
              localObject3 = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).TRD_ID;
              if ((localObject3 == null) || (!((String)localObject3).endsWith("B"))) {
                break label2112;
              }
            }
            for (i2 = -65536;; i2 = getResources().getColor(2131492932))
            {
              this.ah.add(localObject2);
              this.ag.add(new Integer(i2));
              localObject2 = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).KEY_STR;
              System.out.println("定位串 key_str = " + (String)localObject2);
              i1 += 1;
              break label1775;
              this.f = true;
              break;
            }
            this.ai.notifyDataSetChanged();
            break;
          case 11136: 
            System.out.println("历史委托...");
            if (((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA == null) {}
            for (k = 0;; k = ((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.size())
            {
              this.ai.a(k);
              if ((k != 0) || (this.ah.size() != 0)) {
                break;
              }
              this.y.setVisibility(0);
              this.v.removeFooterView(this.ai.a());
              return;
            }
            this.y.setVisibility(4);
            if (k < this.e)
            {
              this.v.removeFooterView(this.ai.a());
              this.f = false;
              if (k <= 0) {
                break label2643;
              }
              i1 = 0;
              if (i1 >= k) {
                break label2643;
              }
              localObject2 = new String[this.af.length];
              this.d = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).KEY_STR;
              localObject2[0] = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).SECU_NAME;
              localObject2[1] = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).ORDER_DATE;
              localObject2[2] = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).PRICE;
              localObject2[3] = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).MATCHED_AMT;
              localObject2[4] = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).QTY;
              localObject2[5] = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).MATCHED_QTY;
              localObject2[6] = this.J[((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)localObject1.ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).DCL_FLAG];
              localObject3 = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).TRD_ID;
              if ((localObject3 == null) || (!((String)localObject3).endsWith("B"))) {
                break label2628;
              }
            }
            for (i2 = -65536;; i2 = getResources().getColor(2131492932))
            {
              this.ah.add(localObject2);
              this.ag.add(new Integer(i2));
              i1 += 1;
              break label2281;
              this.f = true;
              break;
            }
            this.ai.notifyDataSetChanged();
            break;
          case 11142: 
            System.out.println("历史成交...");
            if (((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA == null) {}
            for (k = 0;; k = ((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.size())
            {
              this.ai.a(k);
              if ((k != 0) || (this.ah.size() != 0)) {
                break;
              }
              this.y.setVisibility(0);
              this.v.removeFooterView(this.ai.a());
              return;
            }
            this.y.setVisibility(4);
            if (k < this.e)
            {
              this.v.removeFooterView(this.ai.a());
              this.f = false;
              if (k <= 0) {
                break label3149;
              }
              i1 = 0;
              if (i1 >= k) {
                break label3149;
              }
              localObject2 = new String[this.af.length];
              this.d = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).KEY_STR;
              localObject2[0] = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).SECU_NAME;
              localObject2[1] = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).MATCHED_DATE;
              localObject2[2] = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).MATCHED_PRICE;
              localObject2[3] = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).MATCHED_QTY;
              localObject2[4] = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).MATCHED_AMT;
              localObject3 = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).TRD_ID;
              if ((localObject3 == null) || (!((String)localObject3).endsWith("B"))) {
                break label3134;
              }
            }
            for (i2 = -65536;; i2 = getResources().getColor(2131492932))
            {
              this.ah.add(localObject2);
              this.ag.add(new Integer(i2));
              localObject2 = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).KEY_STR;
              System.out.println("定位串 key_str = " + (String)localObject2);
              i1 += 1;
              break label2797;
              this.f = true;
              break;
            }
            this.ai.notifyDataSetChanged();
            break;
          case 11148: 
            System.out.println("新股配号...");
            if (((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA == null) {}
            for (k = 0;; k = ((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.size())
            {
              this.ai.a(k);
              if ((k != 0) || (this.ah.size() != 0)) {
                break;
              }
              this.y.setVisibility(0);
              this.v.removeFooterView(this.ai.a());
              return;
            }
            this.y.setVisibility(4);
            if (this.ah.size() + k >= k) {
              this.v.removeFooterView(this.ai.a());
            }
            if (k > 0)
            {
              i1 = 0;
              if (i1 < k)
              {
                localObject2 = new String[this.af.length];
                localObject2[0] = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).ASSIGN_DATE;
                localObject2[1] = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).SECU_NAME;
                localObject2[2] = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).SECU_CODE;
                localObject2[3] = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).ASSIGN_SN;
                localObject2[4] = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).ASSIGN_COUNT;
                localObject3 = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).TRD_ID;
                if ((localObject3 != null) && (((String)localObject3).endsWith("B"))) {}
                for (i2 = -65536;; i2 = getResources().getColor(2131492932))
                {
                  this.ah.add(localObject2);
                  this.ag.add(new Integer(i2));
                  localObject2 = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).KEY_STR;
                  System.out.println("定位串 key_str = " + (String)localObject2);
                  i1 += 1;
                  break;
                }
              }
            }
            this.ai.notifyDataSetChanged();
            break;
          case 12024: 
            label1259:
            label1606:
            label1621:
            label1775:
            label2112:
            label2127:
            label2281:
            label2628:
            label2643:
            label2797:
            label3134:
            label3149:
            System.out.println("新股中签...");
            if (((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA == null) {}
            for (k = 0;; k = ((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.size())
            {
              this.ai.a(k);
              if ((k != 0) || (this.ah.size() != 0)) {
                break;
              }
              this.y.setVisibility(0);
              this.v.removeFooterView(this.ai.a());
              return;
            }
            this.y.setVisibility(4);
            if (this.ah.size() + k >= k) {
              this.v.removeFooterView(this.ai.a());
            }
            if (k > 0)
            {
              i1 = 0;
              if (i1 < k)
              {
                localObject2 = new String[this.af.length];
                localObject2[0] = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).ASSIGN_DATE;
                localObject2[1] = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).SECU_NAME;
                localObject2[2] = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).SECU_CODE;
                localObject2[3] = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).MATCHED_QTY;
                localObject3 = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).TRD_ID;
                if ((localObject3 != null) && (((String)localObject3).endsWith("B"))) {}
                for (i2 = -65536;; i2 = getResources().getColor(2131492932))
                {
                  this.ah.add(localObject2);
                  this.ag.add(new Integer(i2));
                  localObject2 = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).KEY_STR;
                  System.out.println("定位串 key_str = " + (String)localObject2);
                  i1 += 1;
                  break;
                }
              }
            }
            this.ai.notifyDataSetChanged();
          }
        }
      }
    }
    label4070:
    this.y.setVisibility(4);
    if (k < 20)
    {
      this.v.removeFooterView(this.ai.a());
      this.f = false;
      break label4423;
      if (i1 >= ((JSONArray)localObject1).length()) {
        break label4415;
      }
      localObject2 = (JSONObject)((JSONArray)localObject1).get(i1);
      localObject4 = new String[this.af.length];
      k = 0;
    }
    for (;;)
    {
      if (k < localObject4.length)
      {
        if (this.af[k].equals(""))
        {
          localObject4[k] = "";
          break label4434;
          this.f = true;
        }
        else
        {
          if (this.af[k].equals("entrust_status"))
          {
            localObject4[k] = d(((JSONObject)localObject2).getString(this.af[k]));
            break label4434;
          }
          localObject4[k] = ((JSONObject)localObject2).getString(this.af[k]);
          break label4434;
        }
      }
      else
      {
        localObject3 = new String[this.af.length];
        i2 = 0;
        k = 0;
        if (k < this.af.length)
        {
          if (localObject4[k] != null) {
            break label4458;
          }
          paramh = "";
          break label4443;
        }
        if ((this.ab != 11134) && (this.ab != 11140) && (this.ab != 11136))
        {
          k = i2;
          if (this.ab != 11142) {}
        }
        else
        {
          paramh = ((JSONObject)localObject2).getString("entrust_bs");
          if ((paramh == null) || (!paramh.equals("1"))) {
            break label4400;
          }
          k = -65536;
        }
        this.ah.add(localObject3);
        this.ag.add(new Integer(k));
        this.c = ((JSONObject)localObject2).getString("position_str");
        i1 += 1;
        break;
        label4400:
        k = getResources().getColor(2131492932);
      }
      label4415:
      label4423:
      while (k <= 0)
      {
        this.ai.notifyDataSetChanged();
        return;
      }
      i1 = 0;
      break;
      label4434:
      k += 1;
    }
    for (;;)
    {
      label4443:
      localObject3[k] = paramh;
      k += 1;
      break;
      label4458:
      paramh = localObject4[k];
    }
  }
  
  protected void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    setContentView(2130903523);
    a();
    c();
    d();
    if (o.l())
    {
      b(true);
      return;
    }
    if (o.m())
    {
      c(true);
      return;
    }
    a(true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\TradeQuery.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */