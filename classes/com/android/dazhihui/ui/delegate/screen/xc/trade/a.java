package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.app.AlertDialog.Builder;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.t;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.ad;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinZhengRequestData;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse.Ans_Comm_Data;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse.Ans_Msg_Hdr;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse.Answer;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.flip.CircleFlowIndicator;
import com.android.dazhihui.ui.widget.flip.ViewFlow;
import com.android.dazhihui.ui.widget.mh;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;
import org.apache.http.entity.StringEntity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class a
  extends ad
{
  public static final Comparator<String[]> d = new h();
  private CircleFlowIndicator A;
  private int B = -1;
  private RelativeLayout C;
  private boolean D = true;
  private boolean E = false;
  private int F = 0;
  private String[] G = { "名称", "市值", "盈亏", "收益率", "持仓", "可用", "成本", "现价" };
  private String[] H = { "1037", "1065", "1064", "1320", "1060", "1061", "1062", "1181", "1036", "1019", "1021" };
  private String[] I;
  private View J;
  private String K;
  private int L;
  private PopupWindow M;
  private com.android.dazhihui.a.b.u N;
  private t O;
  private t P;
  private String Q;
  private String R;
  private String S;
  public int c;
  public Comparator<mh> e;
  Handler f;
  private com.android.dazhihui.a.b.e g;
  private com.android.dazhihui.a.b.e h;
  private String[] i = { "stock_name", "market_value", "income_balance", "syl", "current_amount", "enable_amount", "cost_price", "last_price", "stock_code", "stock_account", "exchange_type" };
  private LinearLayout j;
  private TableLayoutGroup k;
  private ViewFlow l;
  private ListView m;
  private n n;
  private k o;
  private com.android.dazhihui.a.b.u p;
  private int q;
  private int r;
  private int s;
  private com.android.dazhihui.ui.delegate.b.e t;
  private com.android.dazhihui.ui.delegate.b.e u;
  private com.android.dazhihui.ui.delegate.b.e v;
  private Vector<String[]> w;
  private Vector<Integer> x;
  private ImageView y;
  private TextView z;
  
  public a()
  {
    String[] arrayOfString;
    if (com.android.dazhihui.ui.delegate.c.a.d == null)
    {
      arrayOfString = new String[5];
      arrayOfString[0] = "1028";
      arrayOfString[1] = "1077";
      arrayOfString[2] = "1078";
      arrayOfString[3] = "1065";
      arrayOfString[4] = "1087";
    }
    for (;;)
    {
      this.I = arrayOfString;
      this.N = null;
      this.e = new i(this);
      this.f = new j(this);
      return;
      arrayOfString = com.android.dazhihui.ui.delegate.c.a.d;
    }
  }
  
  private void e()
  {
    if ((this.G == null) || (this.H == null)) {}
    int i3;
    int i2;
    do
    {
      return;
      i1 = 0;
      i3 = -1;
      i2 = -1;
      while (i1 < this.H.length)
      {
        if (this.H[i1].equals("1036")) {
          i3 = i1;
        }
        if (this.H[i1].equals("1037")) {
          i2 = i1;
        }
        i1 += 1;
      }
    } while ((i2 == -1) || (i3 == -1));
    ArrayList localArrayList = new ArrayList();
    Object localObject = this.G;
    int i4 = localObject.length;
    int i1 = 0;
    while (i1 < i4)
    {
      localArrayList.add(localObject[i1]);
      i1 += 1;
    }
    localObject = new ArrayList();
    String[] arrayOfString = this.H;
    i4 = arrayOfString.length;
    i1 = 0;
    while (i1 < i4)
    {
      ((List)localObject).add(arrayOfString[i1]);
      i1 += 1;
    }
    if (i2 > i3)
    {
      localArrayList.remove(i2);
      ((List)localObject).remove(i2);
      localArrayList.remove(i3);
      ((List)localObject).remove(i3);
    }
    for (;;)
    {
      localArrayList.add(0, "名称");
      ((List)localObject).add(0, "1037");
      this.G = ((String[])localArrayList.toArray(new String[localArrayList.size()]));
      this.H = ((String[])((List)localObject).toArray(new String[((List)localObject).size()]));
      return;
      localArrayList.remove(i3);
      ((List)localObject).remove(i3);
      localArrayList.remove(i2);
      ((List)localObject).remove(i2);
    }
  }
  
  private void f()
  {
    if (!o.r()) {
      return;
    }
    this.h = new com.android.dazhihui.a.b.e();
    this.h.c("https://uatopen.hs.net/secu/v1/stockposition_qry");
    this.h.b("UTF-8");
    this.h.a("Bearer " + o.d);
    this.h.a("targetcomp_id", com.android.dazhihui.c.a.a.C[com.android.dazhihui.ui.a.e.a().j()][6]);
    this.h.a("sendercomp_id", "90013");
    this.h.a("exchange_type", "");
    this.h.a("stock_account", "");
    this.h.a("stock_code", "");
    this.h.a("position_str", "");
    this.h.a("request_num", "");
    registRequestListener(this.h);
    a(this.h, true);
  }
  
  public void a(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    LinearLayout localLinearLayout1;
    if (this.M == null)
    {
      this.M = new PopupWindow(getActivity());
      localLinearLayout1 = (LinearLayout)LayoutInflater.from(getActivity()).inflate(2130903528, null);
      this.M.setContentView(localLinearLayout1);
      this.M.setBackgroundDrawable(new BitmapDrawable());
      this.M.setWidth(this.k.getWidth());
      this.M.setHeight(this.k.getContentHeight() + 30);
      this.M.setOutsideTouchable(true);
      this.M.setFocusable(true);
      this.M.setOnDismissListener(new d(this));
    }
    for (;;)
    {
      LinearLayout localLinearLayout2 = (LinearLayout)localLinearLayout1.findViewById(2131560711);
      LinearLayout localLinearLayout3 = (LinearLayout)localLinearLayout1.findViewById(2131560712);
      localLinearLayout1 = (LinearLayout)localLinearLayout1.findViewById(2131560713);
      paramString1 = new e(this, paramString1, paramString3, paramString2);
      localLinearLayout2.setOnClickListener(paramString1);
      localLinearLayout3.setOnClickListener(paramString1);
      localLinearLayout1.setOnClickListener(paramString1);
      int i2 = this.k.getHeight() - this.k.getHeaderHeight() - (this.k.getContentHeight() * (paramInt + 1) + this.k.getScrllY());
      int i1 = i2;
      if (i2 < this.k.getContentHeight())
      {
        if (paramInt == this.k.getDataModel().size() - 1) {
          this.c = (i2 - this.k.getContentHeight());
        }
        this.k.a(0, i2 - this.k.getContentHeight());
        this.k.invalidate();
        i1 = this.k.getContentHeight();
      }
      this.M.showAsDropDown(this.k, 0, -i1 - 30);
      return;
      localLinearLayout1 = (LinearLayout)this.M.getContentView();
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    this.N = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11146").a("1019", "").a("1036", "").a("1206", "").a("1277", "").h()) });
    registRequestListener(this.N);
    a(this.N, paramBoolean);
  }
  
  public void b()
  {
    if (!o.r()) {
      return;
    }
    this.p = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11104").a("1028", "").a("1234", "1").h()) });
    registRequestListener(this.p);
    a(this.p, true);
  }
  
  public void c()
  {
    if (!o.r()) {
      return;
    }
    this.g = new com.android.dazhihui.a.b.e();
    this.g.c("https://uatopen.hs.net/secu/v1/balancefast_qry");
    this.g.b("UTF-8");
    this.g.a("Bearer " + o.d);
    this.g.a("targetcomp_id", com.android.dazhihui.c.a.a.C[com.android.dazhihui.ui.a.e.a().j()][6]);
    this.g.a("sendercomp_id", "90013");
    this.g.a("money_type", "");
    registRequestListener(this.g);
    a(this.g, true);
  }
  
  public void c(String paramString)
  {
    JinZhengRequestData localJinZhengRequestData = new JinZhengRequestData();
    localJinZhengRequestData.setService_id("600200");
    localJinZhengRequestData.setType("JinzhengCapital_600200");
    localJinZhengRequestData.setCompany_id(o.q);
    localJinZhengRequestData.setUser_id_cls("2");
    localJinZhengRequestData.setUser_id(this.K);
    localJinZhengRequestData.setSession(paramString);
    paramString = localJinZhengRequestData.jinzhengJson();
    System.out.println("持仓请求数据" + paramString);
    this.O = new t();
    this.O.c(com.android.dazhihui.a.f.Q);
    this.O.c("Content-Type", "application/json");
    try
    {
      paramString = new StringEntity(paramString, "UTF-8");
      this.O.a(paramString);
      this.O.a(this);
      com.android.dazhihui.a.g.a().a(this.O);
      return;
    }
    catch (UnsupportedEncodingException paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public void d()
  {
    this.B = -1;
    this.D = true;
    if (o.i()) {
      this.k.a();
    }
    while (o.l())
    {
      c();
      return;
      this.x.removeAllElements();
      this.w.removeAllElements();
      this.n.notifyDataSetChanged();
    }
    if (o.m())
    {
      d(o.g);
      return;
    }
    b();
  }
  
  public void d(String paramString)
  {
    JinZhengRequestData localJinZhengRequestData = new JinZhengRequestData();
    localJinZhengRequestData.setService_id("600120");
    localJinZhengRequestData.setType("JinzhengCapital_600120");
    localJinZhengRequestData.setCompany_id(o.q);
    localJinZhengRequestData.setUser_id_cls("2");
    localJinZhengRequestData.setUser_id(this.K);
    localJinZhengRequestData.setCurrency("0");
    localJinZhengRequestData.setSession(paramString);
    paramString = localJinZhengRequestData.jinzhengJson();
    System.out.println("客户资金信息请求数据" + paramString);
    this.P = new t();
    this.P.c(com.android.dazhihui.a.f.Q);
    this.P.c("Content-Type", "application/json");
    try
    {
      paramString = new StringEntity(paramString, "UTF-8");
      this.P.a(paramString);
      this.P.a(this);
      com.android.dazhihui.a.g.a().a(this.P);
      return;
    }
    catch (UnsupportedEncodingException paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, com.android.dazhihui.a.b.j paramj)
  {
    if ((getActivity() == null) || (getActivity().isFinishing())) {}
    int i1;
    int i2;
    Object localObject3;
    Object localObject4;
    int i3;
    label976:
    label1054:
    label1104:
    label1285:
    double d1;
    label2920:
    JSONArray localJSONArray;
    for (;;)
    {
      return;
      super.handleResponse(paramh, paramj);
      Object localObject1;
      Object localObject7;
      String str2;
      Object localObject5;
      Object localObject6;
      if (paramh == this.p)
      {
        localObject1 = ((v)paramj).b();
        if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, getActivity()))
        {
          if (this.D) {
            a(true);
          }
          this.D = false;
          localObject1 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
          if (!((com.android.dazhihui.ui.delegate.b.h)localObject1).b())
          {
            paramh = Toast.makeText(getActivity(), ((com.android.dazhihui.ui.delegate.b.h)localObject1).d(), 0);
            paramh.setGravity(17, 0, 0);
            paramh.show();
            return;
          }
          this.q = ((com.android.dazhihui.ui.delegate.b.h)localObject1).g();
          if (this.q > 0)
          {
            this.t = new com.android.dazhihui.ui.delegate.b.e();
            this.u = new com.android.dazhihui.ui.delegate.b.e();
            this.v = new com.android.dazhihui.ui.delegate.b.e();
            i1 = this.q;
            i2 = 0;
            i1 -= 1;
            if (i1 >= 0)
            {
              localObject7 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1028");
              str2 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1087");
              localObject3 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1065");
              localObject4 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1064");
              localObject5 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1078");
              localObject6 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1079");
              if ((((String)localObject7).equals("0")) && (i2 == 0))
              {
                localObject7 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1415");
                this.t.a(str2);
                this.t.b((String)localObject3);
                this.t.c((String)localObject4);
                this.t.d((String)localObject5);
                this.t.e((String)localObject6);
                i3 = i2;
                if (localObject7 != null)
                {
                  i3 = i2;
                  if (((String)localObject7).equals("1")) {
                    i3 = 1;
                  }
                }
              }
              for (;;)
              {
                i1 -= 1;
                i2 = i3;
                break;
                if (((String)localObject7).equals("1"))
                {
                  localObject7 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1415");
                  this.u.a(str2);
                  this.u.b((String)localObject3);
                  this.u.c((String)localObject4);
                  this.u.d((String)localObject5);
                  this.u.e((String)localObject6);
                  i3 = i2;
                  if (localObject7 != null)
                  {
                    i3 = i2;
                    if (((String)localObject7).equals("1")) {
                      i3 = i2;
                    }
                  }
                }
                else
                {
                  i3 = i2;
                  if (((String)localObject7).equals("2"))
                  {
                    localObject7 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1415");
                    this.v.a(str2);
                    this.v.b((String)localObject3);
                    this.v.c((String)localObject4);
                    this.v.d((String)localObject5);
                    this.v.e((String)localObject6);
                    i3 = i2;
                    if (localObject7 != null)
                    {
                      i3 = i2;
                      if (((String)localObject7).equals("1")) {
                        i3 = i2;
                      }
                    }
                  }
                }
              }
            }
          }
          this.o.notifyDataSetChanged();
        }
      }
      Object localObject8;
      Object localObject2;
      if (paramh == this.N)
      {
        localObject1 = ((v)paramj).b();
        if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, getActivity()))
        {
          localObject5 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
          if (!((com.android.dazhihui.ui.delegate.b.h)localObject5).b())
          {
            paramh = Toast.makeText(getActivity(), ((com.android.dazhihui.ui.delegate.b.h)localObject5).d(), 0);
            paramh.setGravity(17, 0, 0);
            paramh.show();
            return;
          }
          this.r = ((com.android.dazhihui.ui.delegate.b.h)localObject5).g();
          this.s = ((com.android.dazhihui.ui.delegate.b.h)localObject5).b("1289");
          if (!o.i()) {
            break label1285;
          }
          int i4 = ((com.android.dazhihui.ui.delegate.b.h)localObject5).g();
          if ((i4 == 0) && (this.k.getDataModel().size() == 0))
          {
            this.k.setBackgroundResource(2130838490);
            return;
          }
          this.k.setBackgroundColor(getResources().getColor(2131493677));
          if (i4 > 0)
          {
            this.L = -1;
            localObject6 = new ArrayList();
            i2 = 0;
            if (i2 < i4)
            {
              localObject7 = new mh();
              localObject1 = new String[this.G.length];
              localObject8 = new int[this.G.length];
              i3 = 0;
              for (;;)
              {
                if (i3 >= this.G.length) {
                  break label976;
                }
                try
                {
                  localObject1[i3] = ((com.android.dazhihui.ui.delegate.b.h)localObject5).a(i2, this.H[i3]).trim();
                  if (localObject1[i3] == null) {
                    localObject1[i3] = "--";
                  }
                }
                catch (Exception localException)
                {
                  for (;;)
                  {
                    localObject1[i3] = "--";
                    continue;
                    if ((localException != null) && (Double.parseDouble(localException) < 0.0D)) {
                      i1 = getResources().getColor(2131492932);
                    } else {
                      i1 = -16777216;
                    }
                  }
                }
                if (this.H[i3].equals("1065")) {
                  this.L = i3;
                }
                str2 = ((com.android.dazhihui.ui.delegate.b.h)localObject5).a(i2, "1064");
                if ((str2 == null) || (Double.parseDouble(str2) <= 0.0D)) {
                  break;
                }
                i1 = -65536;
                localObject1[i3] = o.c(this.H[i3], localObject1[i3]);
                localObject8[i3] = i1;
                i3 += 1;
              }
              localObject4 = ((com.android.dazhihui.ui.delegate.b.h)localObject5).a(i2, "1036");
              localObject3 = ((com.android.dazhihui.ui.delegate.b.h)localObject5).a(i2, "1021");
              localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject5).a(i2, "1019");
              ((mh)localObject7).a = ((String[])localObject1);
              ((mh)localObject7).b = ((int[])localObject8);
              localObject1 = localObject4;
              if (localObject4 == null) {
                localObject1 = "";
              }
              ((mh)localObject7).d = ((String)localObject1);
              if (localObject3 == null)
              {
                localObject1 = "";
                ((mh)localObject7).e = ((String)localObject1);
                if (localObject2 != null) {
                  break label1104;
                }
              }
              for (localObject1 = "";; localObject1 = localObject2)
              {
                ((mh)localObject7).f = ((String)localObject1);
                ((List)localObject6).add(localObject7);
                i2 += 1;
                break;
                localObject1 = localObject3;
                break label1054;
              }
            }
            if (this.L != -1) {
              Collections.sort((List)localObject6, this.e);
            }
            this.k.a((List)localObject6, 0);
          }
        }
      }
      while ((paramj instanceof com.android.dazhihui.a.b.g))
      {
        localObject1 = (com.android.dazhihui.a.b.g)paramj;
        if (paramh == this.P)
        {
          localObject2 = new String(((com.android.dazhihui.a.b.g)localObject1).a());
          System.out.println("查询客户资金返回数据" + (String)localObject2);
          localObject2 = (JinzhengResponse)new com.c.a.k().a((String)localObject2, JinzhengResponse.class);
          localObject3 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject2).ANSWERS.get(0)).ANS_MSG_HDR.MSG_CODE;
          localObject4 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject2).ANSWERS.get(0)).ANS_MSG_HDR.MSG_TEXT;
          if (!((String)localObject3).equals("0"))
          {
            Toast.makeText(getActivity(), (CharSequence)localObject4, 1).show();
            return;
            this.n.a(this.s);
            if (this.r == 0)
            {
              this.m.setBackgroundResource(2130838490);
              return;
            }
            this.m.setBackgroundColor(getResources().getColor(2131493677));
            if (this.r > 0)
            {
              i1 = 0;
              while (i1 < this.r)
              {
                localObject2 = new String[this.H.length];
                i2 = 0;
                if (i2 < this.H.length)
                {
                  if (this.H[i2].equals("1320"))
                  {
                    if (((com.android.dazhihui.ui.delegate.b.h)localObject5).a(i1, this.H[i2]) == null) {}
                    for (localObject1 = "";; localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject5).a(i1, this.H[i2]) + "%")
                    {
                      localObject2[i2] = localObject1;
                      i2 += 1;
                      break;
                    }
                  }
                  if (((com.android.dazhihui.ui.delegate.b.h)localObject5).a(i1, this.H[i2]) == null) {}
                  for (localObject1 = "";; localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject5).a(i1, this.H[i2]))
                  {
                    localObject2[i2] = localObject1;
                    break;
                  }
                }
                this.w.add(localObject2);
                i1 += 1;
              }
              Collections.sort(this.w, d);
              i2 = 0;
              if (i2 < this.w.size())
              {
                localObject2 = ((String[])this.w.get(i2))[2];
                if (localObject2 != null)
                {
                  localObject1 = localObject2;
                  if (!((String)localObject2).equals("--")) {}
                }
                else
                {
                  localObject1 = "0";
                }
                d1 = Double.parseDouble((String)localObject1);
                if (d1 == 0.0D) {
                  i1 = -16777216;
                }
                for (;;)
                {
                  this.x.add(new Integer(i1));
                  i2 += 1;
                  break;
                  if (d1 > 0.0D) {
                    i1 = -65536;
                  } else {
                    i1 = getResources().getColor(2131492932);
                  }
                }
              }
            }
            this.n.notifyDataSetChanged();
            continue;
          }
          if (((String)localObject3).equals("0"))
          {
            if (this.D) {
              c(o.g);
            }
            this.D = false;
            this.q = ((JinzhengResponse.Answer)((JinzhengResponse)localObject2).ANSWERS.get(0)).ANS_COMM_DATA.size();
            if (this.q > 0)
            {
              this.t = new com.android.dazhihui.ui.delegate.b.e();
              this.u = new com.android.dazhihui.ui.delegate.b.e();
              this.v = new com.android.dazhihui.ui.delegate.b.e();
              i1 = this.q - 1;
              if (i1 >= 0)
              {
                localObject3 = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject2).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).CURRENCY;
                localObject4 = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject2).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).ASSERT_VAL;
                localObject5 = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject2).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).MKT_VAL;
                localObject6 = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject2).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).OUTSTANDING;
                localObject7 = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject2).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).AVAILABLE;
                localObject8 = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject2).ANSWERS.get(0)).ANS_COMM_DATA.get(i1)).DRAW_AMT;
                if (((String)localObject3).equals("0"))
                {
                  this.t.a((String)localObject4);
                  this.t.b((String)localObject5);
                  this.t.c((String)localObject6);
                  this.t.d((String)localObject7);
                  this.t.e((String)localObject8);
                }
                for (;;)
                {
                  i1 -= 1;
                  break;
                  if (((String)localObject3).equals("1"))
                  {
                    this.u.a((String)localObject4);
                    this.u.b((String)localObject5);
                    this.u.c((String)localObject6);
                    this.u.d((String)localObject7);
                    this.u.e((String)localObject8);
                  }
                  else if (((String)localObject3).equals("2"))
                  {
                    this.v.a((String)localObject4);
                    this.v.b((String)localObject5);
                    this.v.c((String)localObject6);
                    this.v.d((String)localObject7);
                    this.v.e((String)localObject8);
                  }
                }
              }
            }
            this.o.notifyDataSetChanged();
          }
        }
        if (paramh == this.O)
        {
          localObject1 = new String(((com.android.dazhihui.a.b.g)localObject1).a());
          System.out.println("持仓返回数据" + (String)localObject1);
          localObject3 = (JinzhengResponse)new com.c.a.k().a((String)localObject1, JinzhengResponse.class);
          localObject1 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject3).ANSWERS.get(0)).ANS_COMM_DATA;
          localObject2 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject3).ANSWERS.get(0)).ANS_MSG_HDR.MSG_CODE;
          localObject3 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject3).ANSWERS.get(0)).ANS_MSG_HDR.MSG_TEXT;
          if (!((String)localObject2).equals("0"))
          {
            Toast.makeText(getActivity(), (CharSequence)localObject3, 1).show();
            return;
          }
          this.r = ((ArrayList)localObject1).size();
          if (this.r == 0)
          {
            this.m.setBackgroundResource(2130838490);
            return;
          }
          this.m.setBackgroundColor(getResources().getColor(2131493677));
          if (this.r > 0)
          {
            i1 = 0;
            while (i1 < ((ArrayList)localObject1).size())
            {
              localObject2 = new String[this.H.length];
              localObject3 = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject1).get(i1)).MKT_PRICE;
              localObject4 = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject1).get(i1)).CURRENT_COST;
              d1 = new BigDecimal(Double.valueOf((Double.parseDouble((String)localObject3) - Double.parseDouble((String)localObject4)) / Double.parseDouble((String)localObject4)).doubleValue()).setScale(4, 4).doubleValue();
              localObject2[0] = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject1).get(i1)).SECU_NAME;
              localObject2[1] = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject1).get(i1)).MKT_VAL;
              localObject2[2] = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject1).get(i1)).INCOME_AMT;
              localObject2[3] = (String.valueOf(d1 * 100.0D) + "%");
              localObject2[4] = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject1).get(i1)).SHARE_QTY;
              localObject2[5] = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject1).get(i1)).SHARE_AVL;
              localObject2[6] = localObject4;
              localObject2[7] = localObject3;
              localObject2[8] = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject1).get(i1)).SECU_ACC;
              localObject2[9] = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject1).get(i1)).SECU_CODE;
              localObject2[10] = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject1).get(i1)).MARKET;
              this.w.add(localObject2);
              i1 += 1;
            }
            Collections.sort(this.w, d);
            i2 = 0;
            if (i2 < this.w.size())
            {
              localObject2 = ((String[])this.w.get(i2))[2];
              if (localObject2 != null)
              {
                localObject1 = localObject2;
                if (!((String)localObject2).equals("--")) {}
              }
              else
              {
                localObject1 = "0";
              }
              d1 = Double.parseDouble((String)localObject1);
              if (d1 == 0.0D) {
                i1 = -16777216;
              }
              for (;;)
              {
                this.x.add(new Integer(i1));
                i2 += 1;
                break;
                if (d1 > 0.0D) {
                  i1 = -65536;
                } else {
                  i1 = getResources().getColor(2131492932);
                }
              }
            }
          }
          this.n.notifyDataSetChanged();
        }
      }
      if (paramh == this.g)
      {
        localObject1 = new String(((com.android.dazhihui.a.b.g)paramj).a());
        if (this.D) {
          f();
        }
        this.D = false;
        try
        {
          localObject2 = new JSONObject((String)localObject1).getJSONArray("data");
          i3 = ((JSONArray)localObject2).length();
          if (i3 > 0)
          {
            i1 = 0;
            if (i1 < ((JSONArray)localObject2).length())
            {
              localObject3 = (JSONObject)((JSONArray)localObject2).get(i1);
              this.t = new com.android.dazhihui.ui.delegate.b.e();
              this.u = new com.android.dazhihui.ui.delegate.b.e();
              this.v = new com.android.dazhihui.ui.delegate.b.e();
              i2 = i3 - 1;
              if (i2 < 0) {
                break label3925;
              }
              localObject4 = ((JSONObject)localObject3).getString("money_type");
              localObject5 = ((JSONObject)localObject3).getString("asset_balance");
              localObject6 = ((JSONObject)localObject3).getString("market_value");
              localObject7 = ((JSONObject)localObject3).getString("enable_balance");
              localObject8 = ((JSONObject)localObject3).getString("fetch_balance");
              if (((String)localObject4).equals("0"))
              {
                this.t.a((String)localObject5);
                this.t.b((String)localObject6);
                this.t.c("");
                this.t.d((String)localObject7);
                this.t.e((String)localObject8);
              }
              else if (((String)localObject4).equals("1"))
              {
                this.u.a((String)localObject5);
                this.u.b((String)localObject6);
                this.u.c("");
                this.u.d((String)localObject7);
                this.u.e((String)localObject8);
              }
            }
          }
        }
        catch (JSONException localJSONException2)
        {
          try
          {
            localObject1 = ((JSONObject)new JSONTokener((String)localObject1).nextValue()).getString("error_info");
            localObject1 = Toast.makeText(getActivity(), (CharSequence)localObject1, 0);
            ((Toast)localObject1).setGravity(17, 0, 0);
            ((Toast)localObject1).show();
            return;
          }
          catch (JSONException localJSONException1)
          {
            new AlertDialog.Builder(getActivity()).setIcon(2130837525).setTitle("访问令牌无效或已过期,请重新登录！").setPositiveButton(2131165363, new f(this)).show();
            localJSONException1.printStackTrace();
            localJSONException2.printStackTrace();
          }
        }
      }
      while (paramh == this.h)
      {
        String str1 = new String(((com.android.dazhihui.a.b.g)paramj).a());
        try
        {
          localJSONArray = new JSONObject(str1).getJSONArray("data");
          i3 = localJSONArray.length();
          this.n.a(i3);
          if ((i3 != 0) || (this.w.size() != 0)) {
            break label3449;
          }
          this.m.setBackgroundResource(2130838490);
          return;
        }
        catch (JSONException paramh)
        {
          try
          {
            paramj = ((JSONObject)new JSONTokener(str1).nextValue()).getString("error_info");
            paramj = Toast.makeText(getActivity(), paramj, 0);
            paramj.setGravity(17, 0, 0);
            paramj.show();
            return;
          }
          catch (JSONException paramj)
          {
            new AlertDialog.Builder(getActivity()).setIcon(2130837525).setTitle("访问令牌无效或已过期,请重新登录！").setPositiveButton(2131165363, new g(this)).show();
            paramj.printStackTrace();
            paramh.printStackTrace();
            return;
          }
        }
        if (!((String)localObject4).equals("2")) {
          break label3916;
        }
        this.v.a((String)localObject5);
        this.v.b((String)localObject6);
        this.v.c("");
        this.v.d((String)localObject7);
        this.v.e((String)localObject8);
        break label3916;
        this.o.notifyDataSetChanged();
      }
    }
    label3449:
    this.m.setBackgroundColor(getResources().getColor(2131493677));
    if (i3 > 0)
    {
      paramh = null;
      i1 = 0;
      while (i1 < i3)
      {
        paramj = (JSONObject)localJSONArray.get(i1);
        float f1 = Float.parseFloat(paramj.getString("cost_price"));
        float f2 = Float.parseFloat(paramj.getString("last_price"));
        if (f1 != 0.0F)
        {
          f1 = (f2 - f1) / f1;
          paramh = new DecimalFormat("0.00");
          paramh = "" + paramh.format(f1 * 100.0F);
        }
        localObject3 = new String[11];
        localObject3[0] = paramj.getString("stock_name");
        localObject3[1] = paramj.getString("market_value");
        localObject3[2] = paramj.getString("income_balance");
        localObject3[3] = paramh;
        localObject3[4] = paramj.getString("current_amount");
        localObject3[5] = paramj.getString("enable_amount");
        localObject3[6] = paramj.getString("cost_price");
        localObject3[7] = paramj.getString("last_price");
        localObject3[8] = paramj.getString("stock_code");
        localObject3[9] = paramj.getString("stock_account");
        localObject3[10] = paramj.getString("exchange_type");
        localObject4 = new String[this.i.length];
        i2 = 0;
        label3705:
        if (i2 < this.i.length)
        {
          if (!this.i[i2].equals("syl")) {
            break label3949;
          }
          if (localObject3[i2] == null)
          {
            paramj = "";
            break label3934;
          }
          paramj = localObject3[i2] + "%";
          break label3934;
        }
        this.w.add(localObject4);
        i1 += 1;
      }
      Collections.sort(this.w, d);
      i2 = 0;
      label3805:
      if (i2 < this.w.size())
      {
        paramj = ((String[])this.w.get(i2))[2];
        if (paramj == null) {
          break label3979;
        }
        paramh = paramj;
        if (paramj.equals("--")) {
          break label3979;
        }
        label3851:
        d1 = Double.parseDouble(paramh);
        if (d1 != 0.0D) {
          break label3986;
        }
        i1 = -16777216;
      }
    }
    for (;;)
    {
      label3867:
      this.x.add(new Integer(i1));
      i2 += 1;
      break label3805;
      label3916:
      label3925:
      label3934:
      label3949:
      label3979:
      label3986:
      do
      {
        i1 = getResources().getColor(2131492932);
        break label3867;
        this.n.notifyDataSetChanged();
        return;
        i2 -= 1;
        break label2920;
        i1 += 1;
        break;
        localObject4[i2] = paramj;
        i2 += 1;
        break label3705;
        if (localObject3[i2] == null) {}
        for (paramj = "";; paramj = localObject3[i2])
        {
          localObject4[i2] = paramj;
          break;
        }
        paramh = "0";
        break label3851;
      } while (d1 <= 0.0D);
      i1 = -65536;
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.J = paramLayoutInflater.inflate(2130903592, paramViewGroup, false);
    this.l = ((ViewFlow)this.J.findViewById(2131561352));
    this.A = ((CircleFlowIndicator)this.J.findViewById(2131561353));
    this.m = ((ListView)this.J.findViewById(2131560795));
    this.y = ((ImageView)this.J.findViewById(2131561349));
    this.z = ((TextView)this.J.findViewById(2131561350));
    this.C = ((RelativeLayout)this.J.findViewById(2131559060));
    if (o.l())
    {
      c();
      this.y.setBackgroundDrawable(getResources().getDrawable(2130837606));
      this.z.setText("人民币账户");
      this.j = ((LinearLayout)this.J.findViewById(2131558888));
      this.k = ((TableLayoutGroup)this.J.findViewById(2131558887));
      if (!o.i()) {
        break label580;
      }
      this.j.setVisibility(8);
      this.k.setVisibility(0);
      this.G = com.android.dazhihui.ui.delegate.c.a.e;
      this.H = com.android.dazhihui.ui.delegate.c.a.f;
      if ((this.G != null) && (this.H != null)) {
        break label573;
      }
      this.G = new String[] { "" };
      this.H = new String[] { "" };
      label265:
      this.k.setHeaderColumn(this.G);
      this.k.setPullDownLoading(false);
      this.k.setLoadingDown(false);
      this.k.setColumnClickable(null);
      this.k.setContinuousLoading(false);
      this.k.setHeaderBackgroundColor(getResources().getColor(2131493677));
      this.k.setDrawHeaderSeparateLine(false);
      this.k.setHeaderTextColor(getResources().getColor(2131493099));
      this.k.setHeaderFontSize(getResources().getDimension(2131230899));
      this.k.setHeaderHeight((int)getResources().getDimension(2131230814));
      this.k.setLeftPadding(25);
      this.k.setHeaderDivideDrawable(getResources().getDrawable(2130838328));
      this.k.setListDivideDrawable(getResources().getDrawable(2130838328));
      this.k.setRowHighLightBackgroudDrawable(getResources().getDrawable(2130838067));
      this.k.setStockNameColor(getResources().getColor(2131493235));
      this.k.setFirstColumnColorDifferent(true);
      this.k.setOnTableLayoutClickListener(new b(this));
    }
    for (;;)
    {
      this.o = new k(this, getActivity());
      this.l.setAdapter(this.o);
      this.l.setFlowIndicator(this.A);
      this.l.setOnViewSwitchListener(new c(this));
      return this.J;
      if (o.m())
      {
        this.K = o.p;
        d(o.g);
        break;
      }
      b();
      break;
      label573:
      e();
      break label265;
      label580:
      this.j.setVisibility(0);
      this.k.setVisibility(8);
      this.x = new Vector();
      this.w = new Vector();
      this.n = new n(this, getActivity());
      this.m.setAdapter(this.n);
    }
  }
  
  public void onResume()
  {
    super.onResume();
    if (this.E)
    {
      d();
      this.E = false;
    }
  }
  
  public void show()
  {
    super.show();
    if (((!o.i()) && (this.w != null) && (this.x != null)) || ((o.i()) && (this.k != null))) {
      d();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */