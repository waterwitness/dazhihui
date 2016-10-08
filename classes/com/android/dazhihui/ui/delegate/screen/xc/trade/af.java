package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;
import com.android.dazhihui.a.b.e;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.t;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.a.f;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.a;
import com.android.dazhihui.ui.delegate.screen.ad;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinZhengRequestData;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse.Ans_Comm_Data;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse.Ans_Msg_Hdr;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse.Answer;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.mh;
import com.c.a.k;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;
import org.apache.http.entity.StringEntity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class af
  extends ad
{
  private int A = -1;
  private View B;
  private int C;
  private int D;
  private int E;
  private int F;
  private mh G;
  private String H;
  private String I;
  private String J;
  private String K;
  private String L;
  private t M;
  private t N;
  private com.android.dazhihui.a.b.u O;
  private com.android.dazhihui.a.b.u P;
  private e c;
  private e d;
  private String e = "";
  private boolean f = false;
  private int g = -1;
  private DzhHeader h;
  private ListView i;
  private ImageView j;
  private LinearLayout k;
  private TableLayoutGroup l;
  private String[] m;
  private String[] n;
  private String[] o = { "名称", "委托时间", "价格", "状态", "委托", "成交" };
  private String[] p = { "stock_name", "entrust_time", "entrust_price", "entrust_status", "entrust_amount", "business_amount" };
  private String[] q = { "SECU_NAME", "ORDER_TIME", "PRICE", "DCL_FLAG", "QTY", "MATCHED_QTY", "TRD_ID", "ORDER_ID", "MARKET" };
  private String[] r = { "1037", "1039", "1041", "1043", "1040", "1047" };
  private String[] s = { "名称", "委托时间", "价格", "状态", "委托", "成交", "合同号", "买卖标志", "代码", "股东代码", "交易所代码", "撤单回调参数" };
  private String[] t = { "1037", "1039", "1041", "", "1040", "1047", "1042", "1026", "1036", "1019", "1003", "1800" };
  private String[] u = { "stock_name", "entrust_time", "", "", "", "", "entrust_no", "entrust_bs" };
  private Vector<Integer> v;
  private Vector<String[]> w;
  private Vector<String[]> x;
  private ar y;
  private LayoutInflater z;
  
  private void a(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    int i2;
    if (o.i()) {
      i2 = this.E;
    }
    for (int i1 = this.D;; i1 = 20)
    {
      this.O = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11132").a("1206", i2).a("1277", i1).a("1036", "").a("1026", "").h()) });
      registRequestListener(this.O);
      a(this.O, paramBoolean);
      return;
      i2 = this.w.size();
    }
  }
  
  private void b(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    this.d = new e();
    this.d.c("https://uatopen.hs.net/secu/v1/entrust_qry");
    this.d.b("UTF-8");
    this.d.a("Bearer " + o.d);
    this.d.a("targetcomp_id", com.android.dazhihui.c.a.a.C[com.android.dazhihui.ui.a.e.a().j()][6]);
    this.d.a("sendercomp_id", "90013");
    this.d.a("position_str", this.e);
    this.d.a("request_num", "20");
    this.d.a("action_in", "1");
    this.d.a("exchange_type", "");
    this.d.a("stock_account", "");
    this.d.a("stock_code", "");
    this.d.a("locate_entrust_no", "");
    registRequestListener(this.d);
    a(this.d, paramBoolean);
  }
  
  private void c()
  {
    this.h = ((DzhHeader)this.B.findViewById(2131558643));
    this.i = ((ListView)this.B.findViewById(2131558780));
    this.j = ((ImageView)this.B.findViewById(2131558778));
    this.l = ((TableLayoutGroup)this.B.findViewById(2131558887));
    this.k = ((LinearLayout)this.B.findViewById(2131558888));
  }
  
  private void c(int paramInt)
  {
    if ((!o.i()) && (this.x == null)) {}
    while ((o.i()) && ((this.F < 0) || (this.F >= this.l.getDataModel().size()))) {
      return;
    }
    this.A = paramInt;
    Hashtable localHashtable;
    String str;
    if (o.i())
    {
      localHashtable = b(paramInt);
      StringBuilder localStringBuilder = new StringBuilder().append("").append("证券名称:");
      if (localHashtable.get("1037") == null)
      {
        str = "";
        str = str + "\n";
        localStringBuilder = new StringBuilder().append(str).append("委托时间:");
        if (localHashtable.get("1039") != null) {
          break label272;
        }
        str = "";
        label142:
        str = str + "\n";
        localStringBuilder = new StringBuilder().append(str).append("合同号:");
        if (localHashtable.get("1042") != null) {
          break label285;
        }
        str = "";
        label189:
        str = str + "\n";
      }
    }
    for (;;)
    {
      new AlertDialog.Builder(getActivity()).setTitle(2131165568).setMessage(str).setPositiveButton(2131165363, new am(this)).setNegativeButton(2131165331, new al(this)).show();
      return;
      str = (String)localHashtable.get("1037");
      break;
      label272:
      str = (String)localHashtable.get("1039");
      break label142;
      label285:
      str = (String)localHashtable.get("1042");
      break label189;
      if (o.i)
      {
        this.H = ((String[])this.x.get(paramInt))[0];
        this.I = ((String[])this.x.get(paramInt))[1];
        this.J = ((String[])this.x.get(paramInt))[6];
        this.K = ((String[])this.x.get(paramInt))[7];
        this.L = ((String[])this.x.get(paramInt))[8];
        str = "" + "证券名称:" + this.H + "\n";
        str = str + "委托时间:" + this.I + "\n";
        str = str + "合同号:" + this.K + "\n";
      }
      else
      {
        str = "" + "证券名称:" + ((String[])this.x.get(paramInt))[0] + "\n";
        str = str + "委托时间:" + ((String[])this.x.get(paramInt))[1] + "\n";
        str = str + "合同号:" + ((String[])this.x.get(paramInt))[6] + "\n";
      }
    }
  }
  
  private void d()
  {
    if (o.i())
    {
      this.l.setVisibility(0);
      this.k.setVisibility(8);
      this.o = a.a;
      this.r = a.b;
      this.m = this.o;
      this.n = this.r;
      if ((this.m == null) || (this.n == null))
      {
        this.m = new String[] { "" };
        this.n = new String[] { "" };
      }
      this.l.setHeaderColumn(this.m);
      this.l.setPullDownLoading(false);
      this.l.setColumnClickable(null);
      this.l.setContinuousLoading(false);
      this.l.setHeaderBackgroundColor(getResources().getColor(2131493677));
      this.l.setHeaderDivideDrawable(getResources().getDrawable(2130838328));
      this.l.setDrawHeaderSeparateLine(false);
      this.l.setHeaderTextColor(getResources().getColor(2131493099));
      this.l.setHeaderFontSize(getResources().getDimension(2131230899));
      this.l.setHeaderHeight((int)getResources().getDimension(2131230814));
      this.l.setLeftPadding(25);
      this.l.setListDivideDrawable(getResources().getDrawable(2130838328));
      this.l.setRowHighLightBackgroudDrawable(getResources().getDrawable(2130838067));
      this.l.setStockNameColor(getResources().getColor(2131493235));
      this.l.setFirstColumnColorDifferent(true);
      this.l.setOnLoadingListener(new ag(this));
      this.l.setOnTableLayoutClickListener(new aj(this));
      return;
    }
    this.l.setVisibility(8);
    this.k.setVisibility(0);
    this.j.setVisibility(8);
    this.v = new Vector();
    this.w = new Vector();
    this.x = new Vector();
    this.z = LayoutInflater.from(getActivity());
    this.y = new ar(this);
    this.i.addFooterView(this.y.a());
    this.i.setAdapter(this.y);
  }
  
  private void d(String paramString)
  {
    getActivity().runOnUiThread(new ai(this, paramString));
  }
  
  private void e()
  {
    if (!o.i()) {
      this.i.setOnScrollListener(new ak(this));
    }
  }
  
  private void f()
  {
    if (!o.r()) {}
    while (((!o.i()) && ((this.x == null) || (this.x.size() == 0))) || (this.A == -1) || ((o.i()) && ((this.F < 0) || (this.F >= this.l.getDataModel().size())))) {
      return;
    }
    Object localObject;
    String str1;
    String str2;
    label112:
    String str3;
    label125:
    String str4;
    label139:
    String str5;
    label153:
    String str6;
    if (o.i())
    {
      localObject = b(this.A);
      if (((Hashtable)localObject).get("1036") == null)
      {
        str1 = "";
        if (((Hashtable)localObject).get("1037") != null) {
          break label307;
        }
        str2 = "";
        if (((Hashtable)localObject).get("1026") != null) {
          break label321;
        }
        str3 = "";
        if (((Hashtable)localObject).get("1042") != null) {
          break label335;
        }
        str4 = "";
        if (((Hashtable)localObject).get("1019") != null) {
          break label350;
        }
        str5 = "";
        if (((Hashtable)localObject).get("1003") != null) {
          break label365;
        }
        str6 = "";
        label167:
        if (((Hashtable)localObject).get("1800") != null) {
          break label380;
        }
        localObject = "";
      }
    }
    for (;;)
    {
      this.g = 1;
      this.P = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11114").a("1212", "1").a("1036", str1).a("1037", str2).a("1026", str3).a("1042", str4).a("1019", str5).a("1003", str6).a("1800", (String)localObject).h()) });
      registRequestListener(this.P);
      a(this.P, true);
      return;
      str1 = (String)((Hashtable)localObject).get("1036");
      break;
      label307:
      str2 = (String)((Hashtable)localObject).get("1037");
      break label112;
      label321:
      str3 = (String)((Hashtable)localObject).get("1026");
      break label125;
      label335:
      str4 = (String)((Hashtable)localObject).get("1042");
      break label139;
      label350:
      str5 = (String)((Hashtable)localObject).get("1019");
      break label153;
      label365:
      str6 = (String)((Hashtable)localObject).get("1003");
      break label167;
      label380:
      localObject = (String)((Hashtable)localObject).get("1800");
      continue;
      str1 = ((String[])this.x.get(this.A))[8];
      str2 = ((String[])this.x.get(this.A))[0];
      str3 = ((String[])this.x.get(this.A))[7];
      str4 = ((String[])this.x.get(this.A))[6];
      str5 = ((String[])this.x.get(this.A))[9];
      str6 = ((String[])this.x.get(this.A))[10];
      localObject = ((String[])this.x.get(this.A))[11];
    }
  }
  
  private void g()
  {
    if (!o.r()) {}
    while ((this.x == null) || (this.A == -1)) {
      return;
    }
    this.g = 1;
    this.c = new e();
    this.c.c("https://uatopen.hs.net/secu/v1/withdraw_enter");
    this.c.b("UTF-8");
    this.c.a("Bearer " + o.d);
    this.c.a("targetcomp_id", com.android.dazhihui.c.a.a.C[com.android.dazhihui.ui.a.e.a().j()][6]);
    this.c.a("sendercomp_id", "90013");
    this.c.a("entrust_no", ((String[])this.x.get(this.A))[6]);
    this.c.a("exchange_type", "");
    this.c.a("stock_account", "");
    this.c.a("entrust_date", "");
    registRequestListener(this.c);
    a(this.c, true);
  }
  
  public void a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    JinZhengRequestData localJinZhengRequestData = new JinZhengRequestData();
    localJinZhengRequestData.setService_id("600150");
    localJinZhengRequestData.setType("JinzhengCancel_600150");
    localJinZhengRequestData.setSession(paramString1);
    localJinZhengRequestData.setUser_id_cls("2");
    localJinZhengRequestData.setUser_id(o.p);
    localJinZhengRequestData.setCompany_id(o.q);
    localJinZhengRequestData.setMarket(paramString2);
    localJinZhengRequestData.setTrd_id(paramString3);
    localJinZhengRequestData.setCharacter_ter(o.h);
    localJinZhengRequestData.setOrder_id(paramString4);
    paramString1 = localJinZhengRequestData.jinzhengJson();
    System.out.println("撤单操作请求数据" + paramString1);
    this.N = new t();
    this.N.c(f.Q);
    this.N.c("Content-Type", "application/json");
    try
    {
      paramString1 = new StringEntity(paramString1, "UTF-8");
      this.N.a(paramString1);
      this.N.a(this);
      com.android.dazhihui.a.g.a().a(this.N);
      return;
    }
    catch (UnsupportedEncodingException paramString1)
    {
      paramString1.printStackTrace();
    }
  }
  
  public void b()
  {
    if (o.i())
    {
      this.E = 0;
      this.D = 20;
      this.l.a();
    }
    while (o.l())
    {
      this.e = "";
      b(true);
      return;
      this.v.removeAllElements();
      this.w.removeAllElements();
      this.x.removeAllElements();
      this.i.addFooterView(this.y.a());
    }
    if (o.m())
    {
      c(o.g);
      return;
    }
    a(true);
  }
  
  public void c(String paramString)
  {
    JinZhengRequestData localJinZhengRequestData = new JinZhengRequestData();
    localJinZhengRequestData.setService_id("600160");
    localJinZhengRequestData.setType("JinzhengDRWT_600160");
    localJinZhengRequestData.setCompany_id(o.q);
    localJinZhengRequestData.setUser_id_cls("2");
    localJinZhengRequestData.setUser_id(o.p);
    localJinZhengRequestData.setSession(paramString);
    paramString = localJinZhengRequestData.jinzhengJson();
    System.out.println("撤单列表请求数据" + paramString);
    this.M = new t();
    this.M.c(f.Q);
    this.M.c("Content-Type", "application/json");
    try
    {
      paramString = new StringEntity(paramString, "UTF-8");
      this.M.a(paramString);
      this.M.a(this);
      com.android.dazhihui.a.g.a().a(this.M);
      return;
    }
    catch (UnsupportedEncodingException paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    if ((paramj == null) || (getActivity() == null) || (getActivity().isFinishing())) {}
    int i1;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    int i2;
    int i3;
    for (;;)
    {
      return;
      Object localObject1;
      Object localObject2;
      int i4;
      if (paramh == this.O)
      {
        localObject1 = ((v)paramj).b();
        if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, getActivity()))
        {
          localObject2 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
          if (!((com.android.dazhihui.ui.delegate.b.h)localObject2).b())
          {
            paramh = Toast.makeText(getActivity(), ((com.android.dazhihui.ui.delegate.b.h)localObject2).d(), 0);
            paramh.setGravity(17, 0, 0);
            paramh.show();
            return;
          }
          i4 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).g();
          this.C = ((com.android.dazhihui.ui.delegate.b.h)localObject2).b("1289");
          if (!o.i()) {
            break label663;
          }
          i4 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).g();
          if ((i4 == 0) && (this.l.getDataModel().size() == 0))
          {
            this.l.setBackgroundResource(2130838490);
            return;
          }
          this.l.setBackgroundColor(getResources().getColor(2131493677));
          if (i4 > 0)
          {
            localObject1 = new ArrayList();
            i1 = 0;
            while (i1 < i4)
            {
              localObject3 = new mh();
              localObject4 = new String[this.o.length];
              localObject5 = new int[this.o.length];
              i2 = 0;
              for (;;)
              {
                if (i2 >= this.o.length) {
                  break label377;
                }
                try
                {
                  localObject4[i2] = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(i1, this.r[i2]).trim();
                  if (localObject4[i2] == null) {
                    localObject4[i2] = "--";
                  }
                }
                catch (Exception localException)
                {
                  for (;;)
                  {
                    String str;
                    localObject4[i2] = "--";
                    continue;
                    i3 = getResources().getColor(2131492932);
                  }
                }
                str = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(i1, "1026");
                if ((str == null) || (!str.equals("0"))) {
                  break;
                }
                i3 = -65536;
                localObject4[i2] = o.c(this.r[i2], localObject4[i2]);
                localObject5[i2] = i3;
                i2 += 1;
              }
              label377:
              ((mh)localObject3).a = ((String[])localObject4);
              ((mh)localObject3).b = ((int[])localObject5);
              ((List)localObject1).add(localObject3);
              i1 += 1;
            }
            a((com.android.dazhihui.ui.delegate.b.h)localObject2, this.E);
            this.l.a((List)localObject1, this.E);
          }
        }
      }
      if (paramh == this.P)
      {
        localObject1 = ((v)paramj).b();
        if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, getActivity()))
        {
          this.g = -1;
          localObject1 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
          if (!((com.android.dazhihui.ui.delegate.b.h)localObject1).b()) {
            break label1021;
          }
          new AlertDialog.Builder(getActivity()).setMessage(((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1208")).setPositiveButton("确定", new an(this)).setCancelable(false).show();
        }
      }
      for (;;)
      {
        if ((paramj instanceof com.android.dazhihui.a.b.g))
        {
          localObject2 = (com.android.dazhihui.a.b.g)paramj;
          if (paramh == this.M)
          {
            localObject1 = new String(((com.android.dazhihui.a.b.g)localObject2).a());
            System.out.println("撤单列表返回数据" + (String)localObject1);
            localObject1 = (JinzhengResponse)new k().a((String)localObject1, JinzhengResponse.class);
            localObject3 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_MSG_HDR.MSG_CODE;
            localObject4 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_MSG_HDR.MSG_TEXT;
            if (!((String)localObject3).equals("0"))
            {
              Toast.makeText(getActivity(), (CharSequence)localObject4, 1).show();
              return;
              label663:
              this.y.a(this.C);
              if ((i4 == 0) && (this.w.size() == 0))
              {
                this.j.setVisibility(0);
                this.i.removeFooterView(this.y.a());
                return;
              }
              this.j.setVisibility(4);
              if (this.w.size() + i4 >= this.C) {
                this.i.removeFooterView(this.y.a());
              }
              if (i4 > 0)
              {
                i2 = 0;
                while (i2 < i4)
                {
                  localObject3 = new String[this.r.length];
                  localObject4 = new String[this.t.length];
                  i1 = 0;
                  if (i1 < this.r.length)
                  {
                    if (((com.android.dazhihui.ui.delegate.b.h)localObject2).a(i2, this.r[i1]) == null) {}
                    for (localObject1 = "";; localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(i2, this.r[i1]))
                    {
                      localObject3[i1] = localObject1;
                      i1 += 1;
                      break;
                    }
                  }
                  i3 = 0;
                  i1 = 0;
                  if (i3 < this.t.length)
                  {
                    if (((com.android.dazhihui.ui.delegate.b.h)localObject2).a(i2, this.t[i3]) == null)
                    {
                      localObject1 = "";
                      label890:
                      localObject4[i3] = localObject1;
                      if (this.t[i3].equals("1026")) {
                        if (!localObject4[i3].equals("0")) {
                          break label957;
                        }
                      }
                    }
                    label957:
                    for (i1 = -65536;; i1 = -16776961)
                    {
                      i3 += 1;
                      break;
                      localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(i2, this.t[i3]);
                      break label890;
                    }
                  }
                  this.x.add(localObject4);
                  this.w.add(localObject3);
                  this.v.add(new Integer(i1));
                  i2 += 1;
                }
              }
              this.y.notifyDataSetChanged();
              break;
              label1021:
              localObject1 = Toast.makeText(getActivity(), ((com.android.dazhihui.ui.delegate.b.h)localObject1).d(), 0);
              ((Toast)localObject1).setGravity(17, 0, 0);
              ((Toast)localObject1).show();
              continue;
            }
            if (((String)localObject3).equals("0"))
            {
              localObject3 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA;
              if ((localObject3 == null) && (this.w.size() == 0))
              {
                this.j.setVisibility(0);
                this.i.removeFooterView(this.y.a());
                return;
              }
              this.j.setVisibility(4);
              i4 = ((ArrayList)localObject3).size();
              localObject1 = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(0)).IS_WITHDRAW;
              this.y.a(i4);
              if (i4 < 20)
              {
                this.i.removeFooterView(this.y.a());
                this.f = false;
                if (i4 > 0) {
                  i2 = 0;
                }
              }
              else
              {
                for (;;)
                {
                  if (i2 >= i4) {
                    break label1824;
                  }
                  localObject4 = new String[this.q.length];
                  localObject5 = new String[this.q.length];
                  String[] arrayOfString = new String[9];
                  arrayOfString[0] = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject3).get(i2)).SECU_NAME;
                  arrayOfString[1] = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject3).get(i2)).ORDER_TIME;
                  arrayOfString[2] = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject3).get(i2)).PRICE;
                  arrayOfString[3] = String.valueOf(((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject3).get(i2)).DCL_FLAG);
                  arrayOfString[4] = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject3).get(i2)).QTY;
                  arrayOfString[5] = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject3).get(i2)).MATCHED_QTY;
                  arrayOfString[6] = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject3).get(i2)).TRD_ID;
                  arrayOfString[7] = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject3).get(i2)).ORDER_ID;
                  arrayOfString[8] = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject3).get(i2)).MARKET;
                  i1 = 0;
                  label1395:
                  if (i1 < this.q.length)
                  {
                    if (arrayOfString[i1] == null)
                    {
                      localObject1 = "";
                      label1416:
                      localObject4[i1] = localObject1;
                      if (this.q[i1].equals("DCL_FLAG"))
                      {
                        if (!arrayOfString[i1].equals("0")) {
                          break label1485;
                        }
                        localObject4[i1] = "未发送";
                      }
                    }
                    for (;;)
                    {
                      i1 += 1;
                      break label1395;
                      this.f = true;
                      break;
                      localObject1 = arrayOfString[i1];
                      break label1416;
                      label1485:
                      if (arrayOfString[i1].equals("1")) {
                        localObject4[i1] = "已发送";
                      } else if (arrayOfString[i1].equals("2")) {
                        localObject4[i1] = "部分成交";
                      } else if (arrayOfString[i1].equals("3")) {
                        localObject4[i1] = "全部成交";
                      } else if (arrayOfString[i1].equals("4")) {
                        localObject4[i1] = "部分撤单";
                      } else if (arrayOfString[i1].equals("5")) {
                        localObject4[i1] = "全部撤单";
                      } else if (arrayOfString[i1].equals("6")) {
                        localObject4[i1] = "废单";
                      } else if (arrayOfString[i1].equals("7")) {
                        localObject4[i1] = "已报待撤";
                      } else if (arrayOfString[i1].equals("8")) {
                        localObject4[i1] = "部分待撤";
                      }
                    }
                  }
                  i3 = 0;
                  i1 = 0;
                  if (i3 < this.q.length)
                  {
                    if (arrayOfString[i3] == null)
                    {
                      localObject1 = "";
                      label1712:
                      localObject5[i3] = localObject1;
                      if (this.q[i3].equals("TRD_ID")) {
                        if (!localObject5[i3].equals("0B")) {
                          break label1770;
                        }
                      }
                    }
                    label1770:
                    for (i1 = -65536;; i1 = -16776961)
                    {
                      i3 += 1;
                      break;
                      localObject1 = arrayOfString[i3];
                      break label1712;
                    }
                  }
                  this.x.add(localObject5);
                  this.w.add(localObject4);
                  this.v.add(new Integer(i1));
                  i2 += 1;
                }
              }
              label1824:
              this.y.notifyDataSetChanged();
            }
          }
          if (paramh == this.N)
          {
            localObject1 = new String(((com.android.dazhihui.a.b.g)localObject2).a());
            System.out.println("撤单操作返回数据" + (String)localObject1);
            localObject3 = (JinzhengResponse)new k().a((String)localObject1, JinzhengResponse.class);
            localObject1 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject3).ANSWERS.get(0)).ANS_COMM_DATA;
            localObject2 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject3).ANSWERS.get(0)).ANS_MSG_HDR.MSG_CODE;
            localObject3 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject3).ANSWERS.get(0)).ANS_MSG_HDR.MSG_TEXT;
            if (!((String)localObject2).equals("0"))
            {
              Toast.makeText(getActivity(), (CharSequence)localObject3, 1).show();
              return;
            }
            localObject1 = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject1).get(0)).ORDER_ID;
            new AlertDialog.Builder(getActivity()).setMessage("已成功撤单，合同号为：" + (String)localObject1).setPositiveButton("确定", new ao(this)).setCancelable(false).show();
          }
        }
      }
      if (paramh == this.c)
      {
        localObject2 = new String(((com.android.dazhihui.a.b.g)paramj).a());
        try
        {
          localObject1 = new JSONObject((String)localObject2).getJSONArray("data");
          i1 = 0;
          while (i1 < ((JSONArray)localObject1).length())
          {
            localObject3 = ((JSONObject)((JSONArray)localObject1).get(i1)).getString("entrust_no");
            new AlertDialog.Builder(getActivity()).setMessage("已成功撤单，合同号为：" + (String)localObject3).setPositiveButton("确定", new ap(this)).setCancelable(false).show();
            i1 += 1;
          }
          if (paramh != this.d) {}
        }
        catch (JSONException localJSONException1)
        {
          try
          {
            localObject2 = ((JSONObject)new JSONTokener((String)localObject2).nextValue()).getString("error_info");
            localObject2 = Toast.makeText(getActivity(), (CharSequence)localObject2, 0);
            ((Toast)localObject2).setGravity(17, 0, 0);
            ((Toast)localObject2).show();
            return;
          }
          catch (JSONException localJSONException2)
          {
            new AlertDialog.Builder(getActivity()).setIcon(2130837525).setTitle("访问令牌无效或已过期,请重新登录！").setPositiveButton(2131165363, new aq(this)).show();
            localJSONException2.printStackTrace();
            localJSONException1.printStackTrace();
          }
        }
      }
    }
    paramj = new String(((com.android.dazhihui.a.b.g)paramj).a());
    JSONArray localJSONArray;
    try
    {
      localJSONArray = new JSONObject(paramj).getJSONArray("data");
      i1 = localJSONArray.length();
      this.y.a(i1);
      if ((i1 == 0) && (this.w.size() == 0))
      {
        this.j.setVisibility(0);
        this.i.removeFooterView(this.y.a());
        return;
      }
    }
    catch (JSONException paramh)
    {
      try
      {
        paramj = ((JSONObject)new JSONTokener(paramj).nextValue()).getString("error_info");
        paramj = Toast.makeText(getActivity(), paramj, 0);
        paramj.setGravity(17, 0, 0);
        paramj.show();
        return;
      }
      catch (JSONException paramj)
      {
        new AlertDialog.Builder(getActivity()).setIcon(2130837525).setTitle("访问令牌无效或已过期,请重新登录！").setPositiveButton(2131165363, new ah(this)).show();
        paramj.printStackTrace();
        paramh.printStackTrace();
        return;
      }
      this.j.setVisibility(4);
      if (i1 >= 20) {
        break label2652;
      }
    }
    this.i.removeFooterView(this.y.a());
    this.f = false;
    for (;;)
    {
      if (i2 < localJSONArray.length())
      {
        JSONObject localJSONObject = (JSONObject)localJSONArray.get(i2);
        localObject5 = new String[6];
        localObject5[0] = localJSONObject.getString("stock_name");
        localObject5[1] = localJSONObject.getString("entrust_time");
        localObject5[2] = localJSONObject.getString("entrust_price");
        localObject5[3] = TradeQuery.d(localJSONObject.getString("entrust_status"));
        localObject5[4] = localJSONObject.getString("entrust_amount");
        localObject5[5] = localJSONObject.getString("business_amount");
        localObject3 = new String[this.p.length];
        localObject4 = new String[this.u.length];
        i1 = 0;
        if (i1 < this.p.length)
        {
          if (localObject5[i1] != null) {
            break label2899;
          }
          paramh = "";
          break;
          label2652:
          this.f = true;
          break label2873;
        }
        localObject5 = new String[8];
        localObject5[0] = localJSONObject.getString("stock_name");
        localObject5[1] = localJSONObject.getString("entrust_time");
        localObject5[2] = "";
        localObject5[3] = "";
        localObject5[4] = "";
        localObject5[5] = "";
        localObject5[6] = localJSONObject.getString("entrust_no");
        localObject5[7] = localJSONObject.getString("entrust_bs");
        i3 = 0;
        i1 = 0;
        if (i3 < this.u.length)
        {
          if (localObject5[i3] != null) {
            break label2917;
          }
          paramh = "";
          label2764:
          localObject4[i3] = paramh;
          if (!this.u[i3].equals("entrust_bs")) {
            break label2908;
          }
          if (!localObject4[i3].equals("1")) {
            break label2926;
          }
          i1 = -65536;
          break label2908;
        }
        this.x.add(localObject4);
        this.w.add(localObject3);
        this.v.add(new Integer(i1));
        this.e = localJSONObject.getString("position_str");
        i2 += 1;
      }
      label2873:
      while (i1 <= 0)
      {
        this.y.notifyDataSetChanged();
        return;
      }
      i2 = 0;
    }
    for (;;)
    {
      localObject3[i1] = paramh;
      i1 += 1;
      break;
      label2899:
      paramh = localObject5[i1];
    }
    for (;;)
    {
      label2908:
      i3 += 1;
      break;
      label2917:
      paramh = localObject5[i3];
      break label2764;
      label2926:
      i1 = -16776961;
    }
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    if (!isAdded()) {
      return;
    }
    m().dismiss();
    switch (this.g)
    {
    default: 
      if ((this.y != null) && (this.i != null)) {
        this.i.removeFooterView(this.y.a());
      }
      break;
    }
    for (;;)
    {
      this.g = -1;
      return;
      d("请求超时，请查看委托查询，确认是否成功提交 。");
    }
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    if (!isAdded()) {
      return;
    }
    m().dismiss();
    switch (this.g)
    {
    default: 
      if ((this.y != null) && (this.i != null)) {
        this.i.removeFooterView(this.y.a());
      }
      break;
    }
    for (;;)
    {
      this.g = -1;
      return;
      d("请求超时，请查看委托查询，确认是否成功提交 。");
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.B = paramLayoutInflater.inflate(2130903466, paramViewGroup, false);
    c();
    d();
    e();
    if (o.l()) {
      b(true);
    }
    for (;;)
    {
      return this.B;
      if (o.m()) {
        c(o.g);
      } else {
        a(true);
      }
    }
  }
  
  public void show()
  {
    super.show();
    if (((!o.i()) && (this.x != null) && (this.w != null) && (this.v != null)) || ((o.i()) && (this.l != null))) {
      b();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */