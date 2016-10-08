package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.e;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.t;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.a.f;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.delegate.c.a;
import com.android.dazhihui.ui.delegate.screen.ad;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinZhengRequestData;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse.Ans_Comm_Data;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse.Ans_Msg_Hdr;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse.Answer;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.screen.stock.offlinecapital.ah;
import com.android.dazhihui.ui.widget.DropDownEditTextView;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.gr;
import com.android.dazhihui.ui.widget.mh;
import com.c.a.k;
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

public class ax
  extends ad
{
  public static final Comparator<String[]> c = new bh();
  private ImageView A;
  private ImageView B;
  private DropDownEditTextView C;
  private LinearLayout D;
  private LinearLayout E;
  private TableLayoutGroup F;
  private TextView G;
  private TextView H;
  private TextView I;
  private TextView J;
  private TextView K;
  private TextView L;
  private TextView M;
  private TextView N;
  private TextView O;
  private TextView P;
  private TextView Q;
  private TextView R;
  private TextView S;
  private TextView T;
  private TextView U;
  private TextView V;
  private TextView W;
  private TextView X;
  private TextView Y;
  private TextView Z;
  private String aA;
  private String aB;
  private int aC;
  private int aD;
  private boolean aE;
  private String aF;
  private String aG;
  private String aH;
  private String aI;
  private com.android.dazhihui.ui.delegate.b.h aJ;
  private String aK;
  private String aL;
  private String aM;
  private boolean aN;
  private String aO;
  private String aP;
  private String aQ;
  private String aR;
  private gr aS;
  private View aT;
  private View aU;
  private int aV;
  private int aW;
  private com.android.dazhihui.a.b.m aX;
  private String aY;
  private com.android.dazhihui.a.b.u aZ;
  private LinearLayout aa;
  private LinearLayout ab;
  private LinearLayout ac;
  private LinearLayout ad;
  private LinearLayout ae;
  private LinearLayout af;
  private LinearLayout ag;
  private LinearLayout ah;
  private LinearLayout ai;
  private LinearLayout aj;
  private ListView ak;
  private ImageView al;
  private String[] am = { "名称", "市值", "盈亏", "收益率", "持仓", "可用", "成本", "现价" };
  private String[] an = { "1037", "1065", "1064", "1320", "1060", "1061", "1062", "1181" };
  private String[] ao = { "1037", "1065", "1064", "1320", "1060", "1061", "1062", "1181", "1036", "1019", "1021" };
  private String[] ap = { "证券名称", "市值", "最新市值", "证券数量", "证券代码", "成本价格", "当前价", "浮动盈亏", "盈亏比例", "股东代码" };
  private String[] aq = { "1037", "1065", "1064", "1060", "1036", "1062", "1181", "1065", "1320", "1019" };
  private String[] ar = { "1091", "1065", "1064", "shouyilv", "1060", "1061", "1062", "1181", "6111", "6116" };
  private String[] as;
  private Vector<Integer> at;
  private Vector<String[]> au;
  private Vector<String[]> av;
  private bs aw;
  private LayoutInflater ax;
  private bu ay;
  private int az;
  private com.android.dazhihui.a.b.u ba;
  private com.android.dazhihui.a.b.u bb;
  private t bc;
  private t bd;
  private com.android.dazhihui.a.b.u be;
  private t bf;
  private boolean bg;
  public Comparator<mh> d;
  private e e;
  private String f;
  private e g;
  private e h;
  private e i;
  private e j;
  private e k;
  private String[] l = { "stock_name", "market_value", "income_balance", "syl", "current_amount", "enable_amount", "cost_price", "last_price" };
  private String[] m = { "stock_name", "market_value", "current_amount", "money_type", "stock_code", "enable_amount", "last_price", "cost_price", "income_balance", "stock_account", "exchange_type" };
  private int n = -1;
  private EditText o;
  private TextView p;
  private LinearLayout q;
  private LinearLayout r;
  private TextView s;
  private TextView t;
  private EditText u;
  private EditText v;
  private TextView w;
  private TextView x;
  private View y;
  private Button z;
  
  public ax()
  {
    String[] arrayOfString;
    if (a.bT == null)
    {
      arrayOfString = new String[6];
      arrayOfString[0] = "1091";
      arrayOfString[1] = "1092";
      arrayOfString[2] = "1098";
      arrayOfString[3] = "1065";
      arrayOfString[4] = "1123";
      arrayOfString[5] = "1090";
    }
    for (;;)
    {
      this.as = arrayOfString;
      this.aE = true;
      this.aH = "1";
      this.aI = "0";
      this.aN = false;
      this.aZ = null;
      this.ba = null;
      this.bb = null;
      this.be = null;
      this.d = new bi(this);
      this.bg = true;
      return;
      arrayOfString = a.bT;
    }
  }
  
  public ax(int paramInt)
  {
    String[] arrayOfString;
    if (a.bT == null)
    {
      arrayOfString = new String[6];
      arrayOfString[0] = "1091";
      arrayOfString[1] = "1092";
      arrayOfString[2] = "1098";
      arrayOfString[3] = "1065";
      arrayOfString[4] = "1123";
      arrayOfString[5] = "1090";
    }
    for (;;)
    {
      this.as = arrayOfString;
      this.aE = true;
      this.aH = "1";
      this.aI = "0";
      this.aN = false;
      this.aZ = null;
      this.ba = null;
      this.bb = null;
      this.be = null;
      this.d = new bi(this);
      this.bg = true;
      this.az = paramInt;
      return;
      arrayOfString = a.bT;
    }
  }
  
  private BigDecimal a(String paramString1, String paramString2)
  {
    String str = paramString1;
    if (TextUtils.isEmpty(paramString1)) {
      str = "0";
    }
    return new BigDecimal(str).multiply(new BigDecimal(paramString2)).setScale(2, 4);
  }
  
  private void b(boolean paramBoolean)
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    this.be = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("11146").a("1019", "").a("1036", "").a("1206", "").a("1277", "").h()) });
    registRequestListener(this.be);
    a(this.be, paramBoolean);
  }
  
  private void i(String paramString)
  {
    if (paramString == null) {}
    while (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    this.g = new e();
    this.g.c("https://sandbox.hs.net/quote/v1/real");
    this.g.b("UTF-8");
    this.g.a("Bearer " + com.android.dazhihui.ui.delegate.b.o.e);
    this.g.a("targetcomp_id", com.android.dazhihui.c.a.a.C[com.android.dazhihui.ui.a.e.a().j()][6]);
    this.g.a("sendercomp_id", "90013");
    this.g.a("en_prod_code", paramString);
    this.g.a("fields", "preclose_px,last_px,up_px,down_px");
    registRequestListener(this.g);
    a(this.g, true);
  }
  
  private void j(String paramString)
  {
    getActivity().runOnUiThread(new bk(this, paramString));
  }
  
  private void k()
  {
    this.aS = new gr(this.aU, getActivity(), this.v, this.aT);
  }
  
  private void l()
  {
    this.y = this.aU.findViewById(2131560665);
    this.o = ((EditText)this.aU.findViewById(2131559140));
    this.p = ((TextView)this.aU.findViewById(2131559141));
    this.q = ((LinearLayout)this.aU.findViewById(2131560667));
    this.r = ((LinearLayout)this.aU.findViewById(2131560669));
    this.t = ((TextView)this.aU.findViewById(2131560670));
    this.s = ((TextView)this.aU.findViewById(2131560668));
    this.u = ((EditText)this.aU.findViewById(2131559145));
    this.x = ((TextView)this.aU.findViewById(2131560676));
    this.A = ((ImageView)this.aU.findViewById(2131559146));
    this.B = ((ImageView)this.aU.findViewById(2131559144));
    this.v = ((EditText)this.aU.findViewById(2131560674));
    this.w = ((TextView)this.aU.findViewById(2131560675));
    this.z = ((Button)this.aU.findViewById(2131559153));
    this.ak = ((ListView)this.aU.findViewById(2131560137));
    this.al = ((ImageView)this.aU.findViewById(2131558778));
    this.C = ((DropDownEditTextView)this.aU.findViewById(2131559139));
    this.D = ((LinearLayout)this.aU.findViewById(2131560680));
    this.aa = ((LinearLayout)this.aU.findViewById(2131560681));
    this.G = ((TextView)this.aU.findViewById(2131560682));
    this.Q = ((TextView)this.aU.findViewById(2131560683));
    this.ab = ((LinearLayout)this.aU.findViewById(2131560684));
    this.H = ((TextView)this.aU.findViewById(2131560685));
    this.R = ((TextView)this.aU.findViewById(2131560686));
    this.ac = ((LinearLayout)this.aU.findViewById(2131560687));
    this.I = ((TextView)this.aU.findViewById(2131560688));
    this.S = ((TextView)this.aU.findViewById(2131560689));
    this.ad = ((LinearLayout)this.aU.findViewById(2131560690));
    this.J = ((TextView)this.aU.findViewById(2131560691));
    this.T = ((TextView)this.aU.findViewById(2131560692));
    this.ae = ((LinearLayout)this.aU.findViewById(2131560693));
    this.K = ((TextView)this.aU.findViewById(2131560694));
    this.U = ((TextView)this.aU.findViewById(2131560695));
    this.aj = ((LinearLayout)this.aU.findViewById(2131560696));
    this.P = ((TextView)this.aU.findViewById(2131560697));
    this.Z = ((TextView)this.aU.findViewById(2131560698));
    this.ai = ((LinearLayout)this.aU.findViewById(2131560699));
    this.O = ((TextView)this.aU.findViewById(2131560700));
    this.Y = ((TextView)this.aU.findViewById(2131560701));
    this.ah = ((LinearLayout)this.aU.findViewById(2131560702));
    this.N = ((TextView)this.aU.findViewById(2131560703));
    this.X = ((TextView)this.aU.findViewById(2131560704));
    this.ag = ((LinearLayout)this.aU.findViewById(2131560705));
    this.M = ((TextView)this.aU.findViewById(2131560706));
    this.W = ((TextView)this.aU.findViewById(2131560707));
    this.af = ((LinearLayout)this.aU.findViewById(2131560708));
    this.L = ((TextView)this.aU.findViewById(2131560709));
    this.V = ((TextView)this.aU.findViewById(2131560710));
    this.aT = this.aU.findViewById(2131560664);
    this.E = ((LinearLayout)this.aU.findViewById(2131558888));
    this.F = ((TableLayoutGroup)this.aU.findViewById(2131558887));
  }
  
  private void n()
  {
    Object localObject = new RelativeLayout.LayoutParams(c() / 7 * 4, -2);
    this.y.setLayoutParams((ViewGroup.LayoutParams)localObject);
    this.ay = new bu(this);
    if (this.bg)
    {
      this.ay.start();
      this.bg = false;
    }
    q();
    if (((TradeCommonStock)getActivity()).b != null)
    {
      this.aO = ((TradeCommonStock)getActivity()).b;
      this.aP = ((TradeCommonStock)getActivity()).c;
      this.aQ = ((TradeCommonStock)getActivity()).d;
      ((TradeCommonStock)getActivity()).b = null;
      ((TradeCommonStock)getActivity()).c = null;
      ((TradeCommonStock)getActivity()).d = null;
    }
    if ((com.android.dazhihui.ui.delegate.b.o.l()) || (com.android.dazhihui.ui.delegate.b.o.m())) {
      this.C.setVisibility(8);
    }
    this.C.setEditable(false);
    localObject = new ArrayList();
    if (com.android.dazhihui.ui.delegate.b.o.z != null)
    {
      int i1 = 0;
      while (i1 < com.android.dazhihui.ui.delegate.b.o.z.length)
      {
        ((ArrayList)localObject).add(com.android.dazhihui.ui.delegate.b.o.q(com.android.dazhihui.ui.delegate.b.o.z[i1][0]) + " " + com.android.dazhihui.ui.delegate.b.o.z[i1][1]);
        i1 += 1;
      }
    }
    this.C.a((ArrayList)localObject, 0, true);
    if (this.az == 0)
    {
      this.u.setHint("买入价");
      this.v.setHint("买入量");
      this.z.setText("买入");
      this.C.setBackgroundResource(2130839034);
      this.D.setBackgroundResource(2130839034);
      this.o.setBackgroundResource(2130839032);
      this.u.setBackgroundResource(2130839032);
      this.v.setBackgroundResource(2130839032);
      this.A.setBackgroundResource(2130839069);
      this.B.setBackgroundResource(2130839057);
      this.z.setBackgroundResource(2130839023);
      if (isAdded()) {
        this.z.setTextColor(getResources().getColorStateList(2130839024));
      }
      this.q.setBackgroundResource(2130839083);
      this.r.setBackgroundResource(2130839083);
      this.aa.setBackgroundResource(2130839083);
      this.ab.setBackgroundResource(2130839083);
      this.ac.setBackgroundResource(2130839083);
      this.ad.setBackgroundResource(2130839083);
      this.ae.setBackgroundResource(2130839083);
      this.aj.setBackgroundResource(2130839083);
      this.ai.setBackgroundResource(2130839083);
      this.ah.setBackgroundResource(2130839083);
      this.ag.setBackgroundResource(2130839083);
      this.af.setBackgroundResource(2130839083);
      if (!com.android.dazhihui.ui.delegate.b.o.i()) {
        break label1107;
      }
      this.E.setVisibility(8);
      this.F.setVisibility(0);
      this.am = a.e;
      this.an = a.f;
      if ((this.am != null) && (this.an != null)) {
        break label1100;
      }
      this.am = new String[] { "" };
      this.an = new String[] { "" };
    }
    for (;;)
    {
      this.F.setHeaderColumn(this.am);
      this.F.setPullDownLoading(false);
      this.F.setLoadingDown(false);
      this.F.setColumnClickable(null);
      this.F.setContinuousLoading(false);
      this.F.setHeaderBackgroundColor(getResources().getColor(2131493677));
      this.F.setDrawHeaderSeparateLine(false);
      this.F.setHeaderTextColor(getResources().getColor(2131493099));
      this.F.setHeaderFontSize(getResources().getDimension(2131230899));
      this.F.setHeaderHeight((int)getResources().getDimension(2131230814));
      this.F.setContentRowHeight(this.F.getContentHeight() / 5 * 4);
      this.F.setLeftPadding(25);
      this.F.setHeaderDivideDrawable(getResources().getDrawable(2130838328));
      this.F.setListDivideDrawable(getResources().getDrawable(2130838328));
      this.F.setRowHighLightBackgroudDrawable(getResources().getDrawable(2130838067));
      this.F.setStockNameColor(getResources().getColor(2131493235));
      this.F.setFirstColumnColorDifferent(true);
      this.F.setOnTableLayoutClickListener(new ay(this));
      return;
      this.u.setHint("卖出价");
      this.v.setHint("卖出量");
      this.z.setText("卖出");
      this.C.setBackgroundResource(2130839033);
      this.D.setBackgroundResource(2130839033);
      this.o.setBackgroundResource(2130839031);
      this.u.setBackgroundResource(2130839031);
      this.v.setBackgroundResource(2130839031);
      this.A.setBackgroundResource(2130839059);
      this.B.setBackgroundResource(2130839047);
      this.z.setBackgroundResource(2130839025);
      if (isAdded()) {
        this.z.setTextColor(getResources().getColorStateList(2130839026));
      }
      this.q.setBackgroundResource(2130839085);
      this.r.setBackgroundResource(2130839085);
      this.aa.setBackgroundResource(2130839085);
      this.ab.setBackgroundResource(2130839085);
      this.ac.setBackgroundResource(2130839085);
      this.ad.setBackgroundResource(2130839085);
      this.ae.setBackgroundResource(2130839085);
      this.aj.setBackgroundResource(2130839085);
      this.ai.setBackgroundResource(2130839085);
      this.ah.setBackgroundResource(2130839085);
      this.ag.setBackgroundResource(2130839085);
      this.af.setBackgroundResource(2130839085);
      break;
      label1100:
      p();
    }
    label1107:
    this.E.setVisibility(0);
    this.F.setVisibility(8);
    this.at = new Vector();
    this.au = new Vector();
    this.av = new Vector();
    this.ax = LayoutInflater.from(getActivity());
    this.aw = new bs(this);
    this.ak.setAdapter(this.aw);
    this.al.setVisibility(8);
  }
  
  private void o()
  {
    bt localbt = new bt(this);
    this.z.setOnClickListener(localbt);
    this.A.setOnClickListener(localbt);
    this.B.setOnClickListener(localbt);
    this.q.setOnClickListener(localbt);
    this.r.setOnClickListener(localbt);
    this.aa.setOnClickListener(localbt);
    this.ab.setOnClickListener(localbt);
    this.ac.setOnClickListener(localbt);
    this.ad.setOnClickListener(localbt);
    this.ae.setOnClickListener(localbt);
    this.aj.setOnClickListener(localbt);
    this.ai.setOnClickListener(localbt);
    this.ah.setOnClickListener(localbt);
    this.ag.setOnClickListener(localbt);
    this.af.setOnClickListener(localbt);
    this.ak.setOnItemClickListener(new bj(this));
    this.C.setOnItemChangeListener(new bl(this));
    this.o.addTextChangedListener(new bm(this));
    this.u.addTextChangedListener(new bn(this));
    this.v.addTextChangedListener(new bo(this));
    this.v.setOnTouchListener(new bp(this));
    this.v.setOnFocusChangeListener(new bq(this));
  }
  
  private void p()
  {
    if ((this.am == null) || (this.an == null)) {}
    int i3;
    int i2;
    do
    {
      return;
      i1 = 0;
      i3 = -1;
      i2 = -1;
      while (i1 < this.an.length)
      {
        if (this.an[i1].equals("1036")) {
          i3 = i1;
        }
        if (this.an[i1].equals("1037")) {
          i2 = i1;
        }
        i1 += 1;
      }
    } while ((i2 == -1) || (i3 == -1));
    ArrayList localArrayList = new ArrayList();
    Object localObject = this.am;
    int i4 = localObject.length;
    int i1 = 0;
    while (i1 < i4)
    {
      localArrayList.add(localObject[i1]);
      i1 += 1;
    }
    localObject = new ArrayList();
    String[] arrayOfString = this.an;
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
      this.am = ((String[])localArrayList.toArray(new String[localArrayList.size()]));
      this.an = ((String[])((List)localObject).toArray(new String[((List)localObject).size()]));
      return;
      localArrayList.remove(i3);
      ((List)localObject).remove(i3);
      localArrayList.remove(i2);
      ((List)localObject).remove(i2);
    }
  }
  
  private void q()
  {
    this.aR = null;
    if (this.aS != null) {
      this.aS.a(0);
    }
    this.aQ = null;
    this.aO = null;
    this.aP = null;
    this.aA = null;
    this.aB = null;
    this.aE = true;
    this.aC = 0;
    this.aD = 0;
    this.ay.d = true;
    this.aM = null;
    this.aN = false;
    this.p.setText("");
    this.t.setText("--");
    this.s.setText("--");
    this.w.setVisibility(8);
    this.x.setText("");
    this.x.setVisibility(4);
    this.u.setText("");
    this.v.setText("");
    this.G.setText("--");
    this.G.setTextColor(-16777216);
    this.Q.setText("--");
    this.H.setText("--");
    this.H.setTextColor(-16777216);
    this.R.setText("--");
    this.I.setText("--");
    this.I.setTextColor(-16777216);
    this.S.setText("--");
    this.J.setText("--");
    this.J.setTextColor(-16777216);
    this.T.setText("--");
    this.K.setText("--");
    this.K.setTextColor(-16777216);
    this.U.setText("--");
    this.P.setText("--");
    this.P.setTextColor(-16777216);
    this.Z.setText("--");
    this.O.setText("--");
    this.O.setTextColor(-16777216);
    this.Y.setText("--");
    this.N.setText("--");
    this.N.setTextColor(-16777216);
    this.X.setText("--");
    this.M.setText("--");
    this.M.setTextColor(-16777216);
    this.W.setText("--");
    this.L.setText("--");
    this.L.setTextColor(-16777216);
    this.V.setText("--");
  }
  
  private void r()
  {
    if (com.android.dazhihui.ui.delegate.b.o.i)
    {
      if ((this.o.getText().length() == 0) || (this.u.getText().length() == 0) || (this.v.getText().length() == 0) || (this.u.getText().toString().equals(".")))
      {
        c(0);
        return;
      }
      if (this.aA == null) {
        c(1);
      }
    }
    else
    {
      if ((this.o.getText().length() == 0) || (this.u.getText().length() == 0) || (this.v.getText().length() == 0) || (this.u.getText().toString().equals(".")))
      {
        c(0);
        return;
      }
      if (this.aA == null)
      {
        c(1);
        return;
      }
      if (this.aF == null)
      {
        c(2);
        return;
      }
    }
    Object localObject2 = "";
    Object localObject1 = localObject2;
    if (!com.android.dazhihui.ui.delegate.b.o.l())
    {
      localObject1 = localObject2;
      if (!com.android.dazhihui.ui.delegate.b.o.l()) {
        localObject1 = "" + "股东账号:" + this.aF + "\n";
      }
    }
    localObject1 = (String)localObject1 + "证券代码:" + this.aA + "\n";
    localObject1 = (String)localObject1 + "证券名称:" + this.p.getText().toString() + "\n";
    localObject1 = (String)localObject1 + "委托价格:" + this.u.getText().toString() + "\n";
    localObject2 = (String)localObject1 + "委托数量:" + this.v.getText().toString() + "\n";
    localObject1 = localObject2;
    if (!this.t.getText().toString().equals(""))
    {
      localObject1 = localObject2;
      if (!this.t.getText().toString().equals("--"))
      {
        localObject1 = localObject2;
        if (Float.parseFloat(this.u.getText().toString()) > Float.parseFloat(this.t.getText().toString()))
        {
          localObject2 = new StringBuilder().append((String)localObject2);
          if (this.az != 0) {
            break label809;
          }
          localObject1 = "买入";
          localObject1 = (String)localObject1 + "的价格高于涨停价,交易可能不会成功!\n";
        }
      }
    }
    localObject2 = localObject1;
    if (!this.s.getText().toString().equals(""))
    {
      localObject2 = localObject1;
      if (!this.s.getText().toString().equals("--"))
      {
        localObject2 = localObject1;
        if (Float.parseFloat(this.u.getText().toString()) < Float.parseFloat(this.s.getText().toString()))
        {
          localObject2 = new StringBuilder().append((String)localObject1);
          if (this.az != 0) {
            break label816;
          }
          localObject1 = "买入";
          label618:
          localObject2 = (String)localObject1 + "的价格低于跌停价,交易可能不会成功!\n";
        }
      }
    }
    localObject1 = localObject2;
    if (this.aR != null)
    {
      localObject1 = localObject2;
      if (!this.aR.equals(""))
      {
        localObject1 = localObject2;
        if (Integer.parseInt(this.v.getText().toString()) > (int)Float.parseFloat(this.aR))
        {
          localObject2 = new StringBuilder().append((String)localObject2);
          if (this.az != 0) {
            break label823;
          }
          localObject1 = "买入";
          label706:
          localObject2 = ((StringBuilder)localObject2).append((String)localObject1).append("数量大于最大");
          if (this.az != 0) {
            break label830;
          }
          localObject1 = "可买";
          label729:
          localObject1 = (String)localObject1 + ",交易可能不会成功!\n";
        }
      }
    }
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(getActivity());
    if (this.az == 0) {}
    for (localObject2 = "您确认买入吗？";; localObject2 = "您确认卖出吗？")
    {
      localBuilder.setTitle((CharSequence)localObject2).setMessage((CharSequence)localObject1).setPositiveButton(2131165363, new az(this)).setNegativeButton(2131165331, new br(this)).show();
      return;
      label809:
      localObject1 = "卖出";
      break;
      label816:
      localObject1 = "卖出";
      break label618;
      label823:
      localObject1 = "卖出";
      break label706;
      label830:
      localObject1 = "可卖";
      break label729;
    }
  }
  
  private void s()
  {
    String str = this.aA;
    if (str == null) {}
    while (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    this.aZ = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("11102").a("1003", "0").a("1036", str).h()) });
    registRequestListener(this.aZ);
    a(this.aZ, true);
  }
  
  private void t()
  {
    String str = this.aA;
    this.h = new e();
    this.h.c("https://sandbox.hs.net/quote/v1/wizard");
    this.h.b("UTF-8");
    this.h.a("Bearer " + com.android.dazhihui.ui.delegate.b.o.e);
    this.h.a("targetcomp_id", com.android.dazhihui.c.a.a.C[com.android.dazhihui.ui.a.e.a().j()][6]);
    this.h.a("sendercomp_id", "90013");
    this.h.a("prod_code", str);
    this.h.a("en_finance_mic", "SS,SZ");
    registRequestListener(this.h);
    a(this.h, false);
  }
  
  private int u()
  {
    int i1 = 1;
    if ((this.aK == null) || (this.aK.equals(""))) {
      i1 = -1;
    }
    int i2;
    do
    {
      return i1;
      i2 = n.o(this.aK);
    } while ((i2 == 0) && (this.aV == 1));
    if ((i2 == 0) && (this.aV == 16)) {
      return 3;
    }
    if ((i2 == 1) && (this.aV == 1)) {
      return 0;
    }
    if ((i2 == 1) && (this.aV == 16)) {
      return 2;
    }
    return -1;
  }
  
  private void v()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    this.k = new e();
    this.k.c("https://uatopen.hs.net/secu/v1/stockposition_qry");
    this.k.b("UTF-8");
    this.k.a("Bearer " + com.android.dazhihui.ui.delegate.b.o.d);
    this.k.a("targetcomp_id", com.android.dazhihui.c.a.a.C[com.android.dazhihui.ui.a.e.a().j()][6]);
    this.k.a("sendercomp_id", "90013");
    this.k.a("exchange_type", "");
    this.k.a("stock_account", "");
    this.k.a("stock_code", "");
    this.k.a("position_str", "");
    this.k.a("request_num", "");
    registRequestListener(this.k);
    a(this.k, true);
  }
  
  public String a(int paramInt1, int paramInt2)
  {
    Object localObject;
    if (paramInt1 == 0) {
      localObject = "--";
    }
    String str;
    do
    {
      return (String)localObject;
      for (str = String.valueOf(Math.abs(paramInt1)); str.length() <= paramInt2; str = "0" + str) {}
      localObject = str;
    } while (paramInt2 == 0);
    return str.substring(0, str.length() - paramInt2) + "." + str.substring(str.length() - paramInt2);
  }
  
  public void a(boolean paramBoolean)
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {}
    do
    {
      return;
      if (!com.android.dazhihui.ui.delegate.b.o.i) {
        break;
      }
      localObject1 = this.aK;
    } while ((localObject1 == null) || (this.p.getText().toString().equals("")));
    label43:
    Object localObject2;
    if (!this.aN)
    {
      localObject2 = new x[2];
      localObject2[0] = new x(2939);
      localObject2[0].a((String)localObject1);
      localObject2[1] = new x(2940);
      localObject2[1].a((String)localObject1);
    }
    for (Object localObject1 = localObject2;; localObject1 = localObject2)
    {
      localObject1 = new com.android.dazhihui.a.b.m((x[])localObject1);
      registRequestListener((com.android.dazhihui.a.b.h)localObject1);
      a((com.android.dazhihui.a.b.h)localObject1, paramBoolean);
      this.ay.c = 0;
      return;
      localObject2 = this.aA;
      if ((localObject2 == null) || (this.p.getText().toString().equals(""))) {
        break;
      }
      if ((this.aG == null) || (this.aG.equals("1")) || (this.aG.equals("")) || (this.aG.trim().equals("3")) || (this.aG.trim().equals("5")) || (this.aG.trim().equals("7")))
      {
        localObject1 = "SH" + (String)localObject2;
        break label43;
      }
      if ((!this.aG.trim().equals("2")) && (!this.aG.trim().equals("4")) && (!this.aG.trim().equals("6")) && (!this.aG.trim().equals("8")) && (!this.aG.trim().equals("9")))
      {
        localObject1 = localObject2;
        if (!this.aG.trim().equals("10")) {
          break label43;
        }
      }
      localObject1 = "SZ" + (String)localObject2;
      break label43;
      localObject2 = new x[1];
      localObject2[0] = new x(2940);
      localObject2[0].a((String)localObject1);
    }
  }
  
  public void b()
  {
    this.o.setText("");
  }
  
  public int c()
  {
    return ((WindowManager)getActivity().getSystemService("window")).getDefaultDisplay().getWidth();
  }
  
  public void c(int paramInt)
  {
    if (paramInt == 0)
    {
      localToast = Toast.makeText(getActivity(), "　　股票代码、价格、数量都必须填写。", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
      return;
    }
    if (paramInt == 1)
    {
      localToast = Toast.makeText(getActivity(), "　　股票代码须为完整 6 位。", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
      return;
    }
    if (paramInt == 2)
    {
      localToast = Toast.makeText(getActivity(), "　　没有匹配的股东账号，无法交易。", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
      return;
    }
    if (paramInt == 3)
    {
      localToast = Toast.makeText(getActivity(), "　　正在获取数据中，请稍候……", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
      return;
    }
    Toast localToast = Toast.makeText(getActivity(), "　　委托请求提交中，请稍候……", 0);
    localToast.setGravity(17, 0, 0);
    localToast.show();
  }
  
  public void c(String paramString)
  {
    this.aK = null;
    x localx = new x(2939);
    this.aY = paramString.toUpperCase();
    localx.a(this.aY);
    this.aX = new com.android.dazhihui.a.b.m(localx);
    this.aX.a(this);
    com.android.dazhihui.a.g.a().a(this.aX);
    m().show();
  }
  
  public void d()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {}
    do
    {
      return;
      this.ay.b = false;
    } while ((this.aA == null) || (this.aA.length() != 6) || (this.aF == null) || (this.aG == null));
    com.android.dazhihui.ui.delegate.b.h localh;
    if (this.az == 0)
    {
      localh = com.android.dazhihui.ui.delegate.b.o.g("11110").a("1021", this.aG).a("1019", this.aF);
      if (this.aM == null) {
        localObject = "0";
      }
    }
    for (Object localObject = localh.a("1003", (String)localObject).a("1036", this.aA).a("1041", this.u.getText().toString()).a("1078", "0").a("1247", "0");; localObject = com.android.dazhihui.ui.delegate.b.o.g("11146").a("1019", this.aF).a("1036", this.aA).a("1206", "0").a("1277", "1"))
    {
      this.ba = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(((com.android.dazhihui.ui.delegate.b.h)localObject).h()) });
      registRequestListener(this.ba);
      a(this.ba, false);
      return;
      localObject = this.aM;
      break;
    }
  }
  
  public void d(String paramString)
  {
    int i1 = u();
    if ((!com.android.dazhihui.ui.delegate.b.o.r()) || (this.aA == null) || (i1 == -1) || (this.aK == null) || (this.aK.equals(""))) {
      return;
    }
    JinZhengRequestData localJinZhengRequestData = new JinZhengRequestData();
    localJinZhengRequestData.setService_id("600140");
    localJinZhengRequestData.setType("JinzhengEntrust_600140");
    localJinZhengRequestData.setSession(paramString);
    localJinZhengRequestData.setUser_id_cls("2");
    localJinZhengRequestData.setUser_id(com.android.dazhihui.ui.delegate.b.o.p);
    localJinZhengRequestData.setCompany_id(com.android.dazhihui.ui.delegate.b.o.q);
    localJinZhengRequestData.setMarket(String.valueOf(i1));
    if (this.az == 0) {
      localJinZhengRequestData.setTrd_id("0B");
    }
    for (;;)
    {
      localJinZhengRequestData.setSecu_code(this.aA);
      localJinZhengRequestData.setOrder_price(this.u.getText().toString());
      localJinZhengRequestData.setOrder_qty(this.v.getText().toString());
      localJinZhengRequestData.setExt_serial_no(com.android.dazhihui.ui.delegate.b.o.b(getActivity()));
      paramString = localJinZhengRequestData.jinzhengJson();
      System.out.println("委托买卖请求数据" + paramString);
      this.bc = new t();
      this.bc.c(f.Q);
      this.bc.c("Content-Type", "application/json");
      try
      {
        paramString = new StringEntity(paramString, "UTF-8");
        this.bc.a(paramString);
        this.bc.a(this);
        com.android.dazhihui.a.g.a().a(this.bc);
        return;
      }
      catch (UnsupportedEncodingException paramString)
      {
        paramString.printStackTrace();
        return;
      }
      if (this.az == 1) {
        localJinZhengRequestData.setTrd_id("0S");
      }
    }
  }
  
  public void e()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {}
    do
    {
      return;
      this.ay.b = false;
    } while ((this.aA == null) || (this.aA.length() != 6) || (this.aF == null) || (this.aG == null));
    this.i = new e();
    this.i.b("UTF-8");
    this.i.a("Bearer " + com.android.dazhihui.ui.delegate.b.o.d);
    this.i.a("targetcomp_id", com.android.dazhihui.c.a.a.C[com.android.dazhihui.ui.a.e.a().j()][6]);
    this.i.a("sendercomp_id", "90013");
    if (this.az == 0)
    {
      this.i.c("https://uatopen.hs.net/secu/v1/almostbuy_qry");
      this.i.a("exchange_type", this.aG);
      this.i.a("stock_account", "");
      this.i.a("stock_code", this.f);
      this.i.a("entrust_price", this.u.getText().toString());
      this.i.a("entrust_prop", "0");
    }
    for (;;)
    {
      registRequestListener(this.i);
      a(this.i, false);
      return;
      this.i.c("https://uatopen.hs.net/secu/v1/stockcode_enter");
      this.i.a("exchange_type", this.aG);
      this.i.a("stock_account", "");
      this.i.a("stock_code", this.aA);
      this.i.a("entrust_prop", "0");
    }
  }
  
  public void e(String paramString)
  {
    int i1 = u();
    if ((!com.android.dazhihui.ui.delegate.b.o.r()) || (this.aA == null) || (i1 == -1) || (this.aK == null) || (this.aK.equals(""))) {
      return;
    }
    JinZhengRequestData localJinZhengRequestData = new JinZhengRequestData();
    localJinZhengRequestData.setService_id("600130");
    localJinZhengRequestData.setType("JinzhengAmount_600130");
    localJinZhengRequestData.setSession(paramString);
    localJinZhengRequestData.setUser_id_cls("2");
    localJinZhengRequestData.setUser_id(com.android.dazhihui.ui.delegate.b.o.p);
    localJinZhengRequestData.setCompany_id(com.android.dazhihui.ui.delegate.b.o.q);
    localJinZhengRequestData.setMarket(String.valueOf(i1));
    if (this.az == 0) {
      localJinZhengRequestData.setTrd_id("0B");
    }
    for (;;)
    {
      localJinZhengRequestData.setSecu_code(this.aA);
      localJinZhengRequestData.setOrder_price(this.u.getText().toString());
      paramString = localJinZhengRequestData.jinzhengJson();
      System.out.println("最大可交易数量请求数据" + paramString);
      this.bd = new t();
      this.bd.c(f.Q);
      this.bd.c("Content-Type", "application/json");
      try
      {
        paramString = new StringEntity(paramString, "UTF-8");
        this.bd.a(paramString);
        this.bd.a(this);
        com.android.dazhihui.a.g.a().a(this.bd);
        return;
      }
      catch (UnsupportedEncodingException paramString)
      {
        paramString.printStackTrace();
        return;
      }
      if (this.az == 1) {
        localJinZhengRequestData.setTrd_id("0S");
      }
    }
  }
  
  public void f()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {}
    while ((this.aA == null) || (this.aF == null) || (this.aG == null)) {
      return;
    }
    this.n = 1;
    com.android.dazhihui.ui.delegate.b.h localh = com.android.dazhihui.ui.delegate.b.o.g("11116").a("1026", String.valueOf(this.az)).a("1021", this.aG).a("1019", this.aF);
    if (this.aM == null) {}
    for (Object localObject = "0";; localObject = this.aM)
    {
      localObject = localh.a("1003", (String)localObject).a("1036", this.aA).a("1041", this.u.getText().toString()).a("1029", "1").a("1040", this.v.getText().toString()).a("1396", this.aH).a("1515", this.aI);
      this.aJ = ((com.android.dazhihui.ui.delegate.b.h)localObject);
      this.bb = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(((com.android.dazhihui.ui.delegate.b.h)localObject).h()) });
      registRequestListener(this.bb);
      a(this.bb, true);
      return;
    }
  }
  
  public void f(String paramString)
  {
    JinZhengRequestData localJinZhengRequestData = new JinZhengRequestData();
    localJinZhengRequestData.setService_id("600200");
    localJinZhengRequestData.setType("JinzhengCapital_600200");
    localJinZhengRequestData.setCompany_id(com.android.dazhihui.ui.delegate.b.o.q);
    localJinZhengRequestData.setUser_id_cls("2");
    localJinZhengRequestData.setUser_id(com.android.dazhihui.ui.delegate.b.o.p);
    localJinZhengRequestData.setSession(paramString);
    paramString = localJinZhengRequestData.jinzhengJson();
    System.out.println("持仓请求数据" + paramString);
    this.bf = new t();
    this.bf.c(f.Q);
    this.bf.c("Content-Type", "application/json");
    try
    {
      paramString = new StringEntity(paramString, "UTF-8");
      this.bf.a(paramString);
      this.bf.a(this);
      com.android.dazhihui.a.g.a().a(this.bf);
      return;
    }
    catch (UnsupportedEncodingException paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public String g(String paramString)
  {
    if (paramString.endsWith("SS")) {
      return "1";
    }
    if (paramString.endsWith("SZ")) {
      return "2";
    }
    return "";
  }
  
  public void g()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {}
    while ((this.aA == null) || (this.aF == null) || (this.aG == null)) {
      return;
    }
    this.n = 1;
    this.j = new e();
    this.j.c("https://uatopen.hs.net/secu/v1/entrust_enter");
    this.j.b("UTF-8");
    this.j.a("Bearer " + com.android.dazhihui.ui.delegate.b.o.d);
    this.j.a("targetcomp_id", com.android.dazhihui.c.a.a.C[com.android.dazhihui.ui.a.e.a().j()][6]);
    this.j.a("sendercomp_id", "90013");
    this.j.a("exchange_type", this.aG);
    this.j.a("stock_account", "");
    this.j.a("stock_code", this.aA);
    this.j.a("entrust_amount", this.v.getText().toString());
    this.j.a("entrust_price", this.u.getText().toString());
    this.j.a("entrust_bs", String.valueOf(this.az + 1));
    this.j.a("entrust_prop", "0");
    registRequestListener(this.j);
    a(this.j, true);
  }
  
  public JSONArray h(String paramString)
  {
    try
    {
      paramString = new JSONObject(paramString).getJSONObject("data").getJSONObject("snapshot");
      paramString.getJSONArray("fields");
      paramString = paramString.getJSONArray(this.f);
      return paramString;
    }
    catch (JSONException paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
  
  public void h()
  {
    this.n = 1;
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    this.aJ.a("1396", this.aH).a("1515", this.aI);
    this.bb = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(this.aJ.h()) });
    registRequestListener(this.bb);
    a(this.bb, true);
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    if ((!isAdded()) || (paramj == null)) {}
    boolean bool1;
    int i1;
    label345:
    label368:
    label422:
    int i3;
    Object localObject10;
    Object localObject11;
    Object localObject12;
    Object localObject13;
    Object localObject14;
    int i4;
    label2726:
    label2738:
    label2747:
    label2756:
    label3067:
    double d1;
    label3722:
    label4148:
    label4224:
    label4329:
    label4374:
    label4408:
    Object localObject9;
    label4622:
    label4765:
    label4809:
    label5095:
    label5180:
    label5380:
    label5523:
    Object localObject17;
    for (;;)
    {
      return;
      bool1 = ah.a().c().booleanValue();
      Object localObject1;
      if ((paramj instanceof com.android.dazhihui.a.b.o))
      {
        localObject1 = ((com.android.dazhihui.a.b.o)paramj).h();
        if (localObject1 != null)
        {
          if (((p)localObject1).a != 2939) {
            break label422;
          }
          localObject1 = ((p)localObject1).b;
          if ((localObject1 != null) && (localObject1.length > 0))
          {
            localObject1 = new q((byte[])localObject1);
            this.aK = ((q)localObject1).l();
            this.aL = ((q)localObject1).l();
            this.aV = ((q)localObject1).b();
            this.aC = ((q)localObject1).b();
            ((q)localObject1).e();
            this.aD = ((q)localObject1).h();
            i1 = ((q)localObject1).h();
            i2 = ((q)localObject1).h();
            this.p.setText(this.aL);
            this.aN = true;
            if (com.android.dazhihui.ui.delegate.b.o.i)
            {
              a(true);
              if (this.aY.equals(this.o.getText().toString()))
              {
                this.t.setText(a(i1, this.aC));
                this.s.setText(a(i2, this.aC));
              }
            }
            if (this.az != 0) {
              break label368;
            }
            if (this.aC != 3) {
              break label345;
            }
            this.A.setBackgroundResource(2130839070);
            this.B.setBackgroundResource(2130839058);
          }
        }
      }
      Object localObject8;
      Object localObject5;
      for (;;)
      {
        if (paramh == this.aZ)
        {
          localObject1 = ((v)paramj).b();
          if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, getActivity()))
          {
            localObject8 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
            if (!((com.android.dazhihui.ui.delegate.b.h)localObject8).b())
            {
              paramh = Toast.makeText(getActivity(), ((com.android.dazhihui.ui.delegate.b.h)localObject8).d(), 0);
              paramh.setGravity(17, 0, 0);
              paramh.show();
              return;
              this.A.setBackgroundResource(2130839069);
              this.B.setBackgroundResource(2130839057);
              continue;
              if (this.aC == 3)
              {
                this.A.setBackgroundResource(2130839060);
                this.B.setBackgroundResource(2130839048);
                continue;
              }
              this.A.setBackgroundResource(2130839059);
              this.B.setBackgroundResource(2130839047);
              continue;
              if (((p)localObject1).a == 2943)
              {
                if (localObject1 == null) {
                  continue;
                }
                localObject1 = ((p)localObject1).b;
                if ((localObject1 == null) || (localObject1.length <= 0)) {
                  continue;
                }
                localObject1 = new q((byte[])localObject1);
                i3 = ((q)localObject1).e();
                localObject5 = new String[i3];
                localObject8 = new String[i3];
                localObject10 = new String[i3];
                localObject11 = new int[i3];
                localObject12 = new boolean[i3];
                i2 = 0;
                i1 = 0;
                while (i1 < i3)
                {
                  localObject13 = ((q)localObject1).l();
                  localObject14 = ((q)localObject1).l();
                  i4 = ((q)localObject1).b();
                  localObject10[i2] = localObject13;
                  localObject5[i2] = localObject14;
                  localObject8[i2] = n.e(localObject10[i2]);
                  localObject12[i2] = com.android.dazhihui.ui.a.m.a().b().exitSelfStock(localObject10[i2]);
                  localObject11[i2] = i4;
                  i2 += 1;
                  i1 += 1;
                }
                if (!com.android.dazhihui.ui.delegate.b.o.i) {
                  continue;
                }
                i1 = 0;
                while (i1 < i3)
                {
                  this.aK = localObject10[i1];
                  this.aL = localObject5[i1];
                  this.aV = localObject11[i1];
                  if (u() != -1)
                  {
                    this.p.setText(this.aL);
                    a(true);
                    return;
                  }
                  i1 += 1;
                }
                continue;
              }
              if (((p)localObject1).a != 2940) {
                continue;
              }
              localObject1 = ((p)localObject1).b;
              if ((localObject1 == null) || (localObject1.length <= 0)) {
                continue;
              }
              localObject1 = new q((byte[])localObject1);
              i1 = ((q)localObject1).b();
              i2 = ((q)localObject1).h();
              ((q)localObject1).h();
              ((q)localObject1).h();
              ((q)localObject1).h();
              ((q)localObject1).h();
              ((q)localObject1).h();
              ((q)localObject1).h();
              ((q)localObject1).h();
              ((q)localObject1).h();
              if (i1 == 1)
              {
                ((q)localObject1).h();
                ((q)localObject1).h();
                ((q)localObject1).h();
              }
              ((q)localObject1).e();
              i3 = ((q)localObject1).e();
              localObject5 = new String[i3];
              localObject8 = new String[i3];
              localObject10 = new int[i3];
              i1 = 0;
              if (i1 < i3)
              {
                i4 = ((q)localObject1).h();
                int i5 = ((q)localObject1).h();
                localObject5[i1] = a(i4, this.aC);
                localObject8[i1] = (i5 + "");
                if (i4 > this.aD) {
                  localObject10[i1] = -65536;
                }
                for (;;)
                {
                  i1 += 1;
                  break;
                  if (i4 == this.aD) {
                    localObject10[i1] = -7829368;
                  } else if (isAdded()) {
                    localObject10[i1] = getResources().getColor(2131493100);
                  }
                }
              }
              if (this.aA == null) {
                break;
              }
              i1 = 0;
              if (i1 < i3 / 2)
              {
                switch (i1)
                {
                }
                for (;;)
                {
                  i1 += 1;
                  break;
                  this.K.setText(localObject5[(i3 / 2 - 1 - i1)]);
                  this.U.setText(localObject8[(i3 / 2 - 1 - i1)]);
                  this.K.setTextColor(localObject10[(i3 / 2 - 1 - i1)]);
                  this.P.setText(localObject5[(i3 / 2 + i1)]);
                  this.Z.setText(localObject8[(i3 / 2 + i1)]);
                  this.P.setTextColor(localObject10[(i3 / 2 + i1)]);
                  continue;
                  this.J.setText(localObject5[(i3 / 2 - 1 - i1)]);
                  this.T.setText(localObject8[(i3 / 2 - 1 - i1)]);
                  this.J.setTextColor(localObject10[(i3 / 2 - 1 - i1)]);
                  this.O.setText(localObject5[(i3 / 2 + i1)]);
                  this.Y.setText(localObject8[(i3 / 2 + i1)]);
                  this.O.setTextColor(localObject10[(i3 / 2 + i1)]);
                  continue;
                  this.I.setText(localObject5[(i3 / 2 - 1 - i1)]);
                  this.S.setText(localObject8[(i3 / 2 - 1 - i1)]);
                  this.I.setTextColor(localObject10[(i3 / 2 - 1 - i1)]);
                  this.N.setText(localObject5[(i3 / 2 + i1)]);
                  this.X.setText(localObject8[(i3 / 2 + i1)]);
                  this.N.setTextColor(localObject10[(i3 / 2 + i1)]);
                  continue;
                  this.H.setText(localObject5[(i3 / 2 - 1 - i1)]);
                  this.R.setText(localObject8[(i3 / 2 - 1 - i1)]);
                  this.H.setTextColor(localObject10[(i3 / 2 - 1 - i1)]);
                  this.M.setText(localObject5[(i3 / 2 + i1)]);
                  this.W.setText(localObject8[(i3 / 2 + i1)]);
                  this.M.setTextColor(localObject10[(i3 / 2 + i1)]);
                  continue;
                  this.G.setText(localObject5[(i3 / 2 - 1 - i1)]);
                  this.Q.setText(localObject8[(i3 / 2 - 1 - i1)]);
                  this.G.setTextColor(localObject10[(i3 / 2 - 1 - i1)]);
                  this.L.setText(localObject5[(i3 / 2 + i1)]);
                  this.V.setText(localObject8[(i3 / 2 + i1)]);
                  this.L.setTextColor(localObject10[(i3 / 2 + i1)]);
                }
              }
              this.aB = a(i2, this.aC);
              if (this.aQ != null)
              {
                this.u.setText(this.aQ);
                this.aQ = null;
                this.aE = false;
              }
              if (!this.aE) {
                break;
              }
              if (this.az == 1)
              {
                if ((this.P.getText().toString().equals("--")) && (this.aB.equals("--")))
                {
                  localObject5 = a(this.aD, this.aC);
                  localObject8 = this.u;
                  localObject1 = localObject5;
                  if (((String)localObject5).equals("--")) {
                    localObject1 = "";
                  }
                  ((EditText)localObject8).setText((CharSequence)localObject1);
                }
                for (;;)
                {
                  this.aE = false;
                  break;
                  if (this.P.getText().toString().equals("--"))
                  {
                    localObject5 = this.u;
                    if (this.aB.equals("--")) {}
                    for (localObject1 = "";; localObject1 = this.aB)
                    {
                      ((EditText)localObject5).setText((CharSequence)localObject1);
                      break;
                    }
                  }
                  localObject5 = this.P.getText().toString();
                  localObject8 = this.u;
                  localObject1 = localObject5;
                  if (((String)localObject5).equals("--")) {
                    localObject1 = "";
                  }
                  ((EditText)localObject8).setText((CharSequence)localObject1);
                }
              }
              if ((this.K.getText().toString().equals("--")) && (this.aB.equals("--")))
              {
                localObject5 = a(this.aD, this.aC);
                localObject8 = this.u;
                if (((String)localObject5).equals("--")) {}
                for (localObject1 = "";; localObject1 = localObject5)
                {
                  ((EditText)localObject8).setText((CharSequence)localObject1);
                  System.out.println("买入价格1" + (String)localObject5);
                  break;
                }
              }
              if (this.K.getText().toString().equals("--"))
              {
                localObject5 = this.u;
                if (this.aB.equals("--")) {}
                for (localObject1 = "";; localObject1 = this.aB)
                {
                  ((EditText)localObject5).setText((CharSequence)localObject1);
                  System.out.println("买入价格2" + this.aB);
                  break;
                }
              }
              localObject5 = this.K.getText().toString();
              localObject8 = this.u;
              if (((String)localObject5).equals("--")) {}
              for (localObject1 = "";; localObject1 = localObject5)
              {
                ((EditText)localObject8).setText((CharSequence)localObject1);
                System.out.println("买入价格3" + (String)localObject5);
                break;
              }
            }
          }
        }
      }
      for (;;)
      {
        try
        {
          boolean bool2 = TextUtils.isEmpty(((com.android.dazhihui.ui.delegate.b.h)localObject8).a(0, "1036"));
          if (bool2) {
            break;
          }
          localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject8).a(0, "1037");
          if (localObject1 != null) {
            this.p.setText((CharSequence)localObject1);
          }
          this.aM = ((com.android.dazhihui.ui.delegate.b.h)localObject8).a(0, "1021");
          this.aG = ((com.android.dazhihui.ui.delegate.b.h)localObject8).a(0, "1021");
          if (com.android.dazhihui.ui.delegate.b.o.z != null)
          {
            i1 = com.android.dazhihui.ui.delegate.b.o.z.length - 1;
            if (i1 >= 0)
            {
              if (!com.android.dazhihui.ui.delegate.b.o.z[i1][0].equals(this.aG)) {
                break label2738;
              }
              localObject1 = com.android.dazhihui.ui.delegate.b.o.z[i1][2];
              if ((localObject1 == null) || (!((String)localObject1).equals("1"))) {
                break label2726;
              }
              this.aF = com.android.dazhihui.ui.delegate.b.o.z[i1][1];
            }
          }
          if ((this.aP != null) && (!this.aP.equals(""))) {
            this.aF = this.aP;
          }
          localObject1 = this.C.getDataList();
          if ((this.aF != null) && (localObject1 != null) && (((ArrayList)localObject1).size() > 0) && (!this.C.getCurrentItem().contains(this.aF)))
          {
            i1 = 0;
            if (i1 < ((ArrayList)localObject1).size())
            {
              if (!((String)((ArrayList)localObject1).get(i1)).contains(this.aF)) {
                break label2747;
              }
              this.C.a(this.C.getDataList(), i1, false);
            }
          }
          localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject8).a(0, "1178");
          localObject5 = ((com.android.dazhihui.ui.delegate.b.h)localObject8).a(0, "1181");
          localObject10 = ((com.android.dazhihui.ui.delegate.b.h)localObject8).a(0, "1172");
          localObject11 = ((com.android.dazhihui.ui.delegate.b.h)localObject8).a(0, "1173");
          localObject12 = ((com.android.dazhihui.ui.delegate.b.h)localObject8).a(0, "1156");
          localObject8 = ((com.android.dazhihui.ui.delegate.b.h)localObject8).a(0, "1167");
          this.t.setText((CharSequence)localObject10);
          this.s.setText((CharSequence)localObject11);
          if (this.aQ != null)
          {
            this.u.setText(this.aQ);
            this.aQ = null;
            this.aE = false;
          }
          if (this.aE) {
            break label2756;
          }
          this.aE = false;
          a(false);
          this.ay.c = 0;
          this.ay.d = true;
          if (!(paramj instanceof com.android.dazhihui.a.b.g)) {
            break label4329;
          }
          localObject8 = (com.android.dazhihui.a.b.g)paramj;
          if (paramh != this.bf) {
            break label3722;
          }
          localObject1 = new String(((com.android.dazhihui.a.b.g)localObject8).a());
          System.out.println("持仓返回数据" + (String)localObject1);
          localObject10 = (JinzhengResponse)new k().a((String)localObject1, JinzhengResponse.class);
          localObject1 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject10).ANSWERS.get(0)).ANS_COMM_DATA;
          localObject5 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject10).ANSWERS.get(0)).ANS_MSG_HDR.MSG_CODE;
          localObject10 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject10).ANSWERS.get(0)).ANS_MSG_HDR.MSG_TEXT;
          if (((String)localObject5).equals("0")) {
            break label3067;
          }
          Toast.makeText(getActivity(), (CharSequence)localObject10, 1).show();
          return;
        }
        catch (Exception paramh)
        {
          paramh.printStackTrace();
          return;
        }
        this.aF = com.android.dazhihui.ui.delegate.b.o.z[i1][1];
        i1 -= 1;
        continue;
        i1 += 1;
        continue;
        if (this.az == 1)
        {
          if (((localObject12 == null) || (((String)localObject12).equals("")) || (Float.parseFloat((String)localObject12) == 0.0F)) && ((localObject5 == null) || (((String)localObject5).equals("")) || (Float.parseFloat((String)localObject5) == 0.0F)))
          {
            localObject8 = this.u;
            localObject5 = localObject1;
            if (localObject1 == null) {
              localObject5 = "";
            }
            ((EditText)localObject8).setText((CharSequence)localObject5);
          }
          else
          {
            if ((localObject12 == null) || (((String)localObject12).equals("")) || (Float.parseFloat((String)localObject12) == 0.0F))
            {
              localObject8 = this.u;
              if (localObject5 == null) {}
              for (localObject1 = "";; localObject1 = localObject5)
              {
                ((EditText)localObject8).setText((CharSequence)localObject1);
                break;
              }
            }
            this.u.setText((CharSequence)localObject12);
          }
        }
        else if (((localObject8 == null) || (((String)localObject8).equals("")) || (Float.parseFloat((String)localObject8) == 0.0F)) && ((localObject5 == null) || (((String)localObject5).equals("")) || (Float.parseFloat((String)localObject5) == 0.0F)))
        {
          localObject8 = this.u;
          localObject5 = localObject1;
          if (localObject1 == null) {
            localObject5 = "";
          }
          ((EditText)localObject8).setText((CharSequence)localObject5);
        }
        else if ((localObject8 == null) || (((String)localObject8).equals("")) || (Float.parseFloat((String)localObject8) == 0.0F))
        {
          localObject8 = this.u;
          localObject1 = localObject5;
          if (localObject5 == null) {
            localObject1 = "";
          }
          ((EditText)localObject8).setText((CharSequence)localObject1);
        }
        else
        {
          this.u.setText((CharSequence)localObject8);
        }
      }
      i1 = ((ArrayList)localObject1).size();
      this.aw.a(i1);
      if ((i1 == 0) && (this.au.size() == 0))
      {
        this.al.setVisibility(0);
        if ((this.aO != null) && (this.aO.length() == 6))
        {
          this.o.setText(this.aO);
          return;
        }
        a(false);
        return;
      }
      this.al.setVisibility(4);
      if (i1 > 0)
      {
        if (bool1) {
          ah.a().d();
        }
        i1 = 0;
        while (i1 < ((ArrayList)localObject1).size())
        {
          localObject5 = new String[this.ao.length];
          localObject10 = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject1).get(i1)).MKT_PRICE;
          localObject11 = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject1).get(i1)).CURRENT_COST;
          d1 = new BigDecimal(Double.valueOf((Double.parseDouble((String)localObject10) - Double.parseDouble((String)localObject11)) / Double.parseDouble((String)localObject11)).doubleValue()).setScale(4, 4).doubleValue();
          localObject5[0] = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject1).get(i1)).SECU_NAME;
          localObject5[1] = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject1).get(i1)).MKT_VAL;
          localObject5[2] = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject1).get(i1)).INCOME_AMT;
          localObject5[3] = (String.valueOf(d1 * 100.0D) + "%");
          localObject5[4] = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject1).get(i1)).SHARE_QTY;
          localObject5[5] = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject1).get(i1)).SHARE_AVL;
          localObject5[6] = localObject11;
          localObject5[7] = localObject10;
          localObject5[8] = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject1).get(i1)).SECU_ACC;
          localObject5[9] = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject1).get(i1)).SECU_CODE;
          localObject5[10] = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject1).get(i1)).MARKET;
          this.au.add(localObject5);
          this.av.add(localObject5);
          if (bool1) {
            ah.a().a(localObject5[0], localObject5[9], localObject5[10], localObject5[6], localObject5[4], localObject5[5], localObject5[2], localObject5[7]);
          }
          i1 += 1;
        }
        if (bool1) {
          ah.a().m();
        }
        Collections.sort(this.av, c);
        Collections.sort(this.au, c);
        i2 = 0;
        if (i2 < this.au.size())
        {
          localObject5 = ((String[])this.au.get(i2))[2];
          if (localObject5 != null)
          {
            localObject1 = localObject5;
            if (!((String)localObject5).equals("--")) {}
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
            this.at.add(new Integer(i1));
            i2 += 1;
            break;
            if (d1 > 0.0D) {
              i1 = -65536;
            } else {
              i1 = getResources().getColor(2131492932);
            }
          }
        }
        this.aw.notifyDataSetChanged();
      }
      this.aw.notifyDataSetChanged();
      if ((this.aO != null) && (this.aO.length() == 6)) {
        this.o.setText(this.aO);
      }
      while (paramh == this.bc)
      {
        localObject1 = new String(((com.android.dazhihui.a.b.g)localObject8).a());
        localObject11 = (JinzhengResponse)new k().a((String)localObject1, JinzhengResponse.class);
        localObject5 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject11).ANSWERS.get(0)).ANS_COMM_DATA;
        localObject10 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject11).ANSWERS.get(0)).ANS_MSG_HDR.MSG_CODE;
        localObject11 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject11).ANSWERS.get(0)).ANS_MSG_HDR.MSG_TEXT;
        if (!((String)localObject10).equals("0"))
        {
          Toast.makeText(getActivity(), (CharSequence)localObject11, 1).show();
          return;
          a(false);
        }
        else
        {
          if (this.az != 0) {
            break label4148;
          }
          System.out.println("买入返回数据" + (String)localObject1);
          localObject1 = ((JinzhengResponse.Ans_Comm_Data)((ArrayList)localObject5).get(0)).ORDER_ID;
          new AlertDialog.Builder(getActivity()).setMessage("　　委托请求提交成功。合同号为：" + (String)localObject1).setPositiveButton("确定", new ba(this)).setCancelable(false).show();
          this.aJ = null;
        }
      }
      if (paramh == this.bd)
      {
        localObject1 = new String(((com.android.dazhihui.a.b.g)localObject8).a());
        if (this.az == 0) {
          System.out.println("买入最大数量返回数据" + (String)localObject1);
        }
        for (;;)
        {
          localObject1 = (JinzhengResponse)new k().a((String)localObject1, JinzhengResponse.class);
          localObject5 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA;
          localObject5 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_MSG_HDR.MSG_CODE;
          localObject8 = ((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_MSG_HDR.MSG_TEXT;
          if (((String)localObject5).equals("0")) {
            break label4224;
          }
          Toast.makeText(getActivity(), (String)localObject8 + "  " + this.aA, 1).show();
          return;
          if (this.az != 1) {
            break;
          }
          System.out.println("卖出返回数据" + (String)localObject1);
          break;
          if (this.az == 1) {
            System.out.println("卖出最大数量返回数据" + (String)localObject1);
          }
        }
        this.aR = ((JinzhengResponse.Ans_Comm_Data)((JinzhengResponse.Answer)((JinzhengResponse)localObject1).ANSWERS.get(0)).ANS_COMM_DATA.get(0)).TRD_QTY;
        if (this.aR == null) {
          continue;
        }
        this.w.setVisibility(0);
        this.aS.a(Integer.valueOf(this.aR).intValue());
        if (this.az != 1) {
          break label4408;
        }
        this.w.setText("可卖" + this.aR + "股");
      }
      for (;;)
      {
        if (paramh != this.g) {
          break label4622;
        }
        localObject1 = h(new String(((com.android.dazhihui.a.b.g)paramj).a()));
        localObject5 = new ArrayList();
        if (localObject1 != null)
        {
          i1 = 0;
          if (i1 < ((JSONArray)localObject1).length()) {
            try
            {
              ((List)localObject5).add(((JSONArray)localObject1).getString(i1));
              i1 += 1;
              break label4374;
              this.w.setText("可买" + this.aR + "股");
            }
            catch (JSONException localJSONException7)
            {
              for (;;)
              {
                localJSONException7.printStackTrace();
              }
            }
          }
        }
      }
      this.aF = "70000176";
      this.aG = g(this.f);
      if (this.aP != null) {
        this.aF = this.aP;
      }
      localObject10 = (String[])((List)localObject5).toArray(new String[((List)localObject5).size()]);
      if (localObject10.length != 0)
      {
        localObject1 = localObject10[2];
        localObject5 = localObject10[3];
        localObject9 = localObject10[4];
        localObject10 = localObject10[5];
        this.t.setText((CharSequence)localObject9);
        this.s.setText((CharSequence)localObject10);
        if (this.aQ != null)
        {
          this.u.setText(this.aQ);
          this.aQ = null;
          this.aE = false;
        }
        if (!this.aE)
        {
          this.aE = false;
          a(false);
          this.ay.c = 0;
          this.ay.d = true;
          if (paramh == this.ba)
          {
            localObject1 = ((v)paramj).b();
            if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, getActivity()))
            {
              localObject1 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
              if ((!((com.android.dazhihui.ui.delegate.b.h)localObject1).b()) || (((com.android.dazhihui.ui.delegate.b.h)localObject1).g() == 0)) {
                continue;
              }
              this.aR = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1061");
              if (this.aR == null) {
                continue;
              }
              this.w.setVisibility(0);
              this.aS.a(Integer.valueOf(this.aR).intValue());
              if (this.az != 1) {
                break label5095;
              }
              this.w.setText("可卖" + this.aR + "股");
            }
          }
          if (paramh != this.i) {
            break label5180;
          }
          localObject1 = new String(((com.android.dazhihui.a.b.g)paramj).a());
        }
        try
        {
          localObject1 = new JSONObject((String)localObject1).getJSONArray("data");
          i1 = 0;
          if (i1 < ((JSONArray)localObject1).length())
          {
            this.aR = ((JSONObject)((JSONArray)localObject1).get(i1)).getString("enable_amount");
            if (this.aR == null) {
              continue;
            }
            this.w.setVisibility(0);
            localObject5 = this.aR.split("\\.");
            this.aS.a(Integer.valueOf(localObject5[0]).intValue());
            if (this.az == 1) {
              this.w.setText("可卖" + this.aR + "股");
            }
            for (;;)
            {
              i1 += 1;
              break label4809;
              if (this.az == 1)
              {
                if ((localObject5 == null) || (Float.parseFloat((String)localObject5) == 0.0F))
                {
                  localObject5 = this.u;
                  if (localObject1 == null) {
                    localObject1 = "";
                  }
                  for (;;)
                  {
                    ((EditText)localObject5).setText((CharSequence)localObject1);
                    break;
                  }
                }
                localObject9 = this.u;
                if (localObject5 == null) {}
                for (localObject1 = "";; localObject1 = localObject5)
                {
                  ((EditText)localObject9).setText((CharSequence)localObject1);
                  break;
                }
              }
              if ((localObject5 == null) || (Float.parseFloat((String)localObject5) == 0.0F))
              {
                localObject9 = this.u;
                localObject5 = localObject1;
                if (localObject1 == null) {
                  localObject5 = "";
                }
                ((EditText)localObject9).setText((CharSequence)localObject5);
                break;
              }
              localObject9 = this.u;
              localObject1 = localObject5;
              if (localObject5 == null) {
                localObject1 = "";
              }
              ((EditText)localObject9).setText((CharSequence)localObject1);
              break;
              this.w.setText("可买" + this.aR + "股");
              break label4765;
              this.w.setText("可买" + this.aR + "股");
            }
          }
          if (paramh != this.bb) {
            break label5380;
          }
        }
        catch (JSONException localJSONException1)
        {
          localJSONException1.printStackTrace();
        }
        Object localObject2 = ((v)paramj).b();
        if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject2, getActivity()))
        {
          this.n = -1;
          localObject2 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject2).e());
          if (!((com.android.dazhihui.ui.delegate.b.h)localObject2).b()) {
            break label5523;
          }
          localObject5 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1208");
          if (localObject5 != null)
          {
            new AlertDialog.Builder(getActivity()).setTitle("提示信息").setMessage((CharSequence)localObject5).setPositiveButton("确定", new bc(this)).setNegativeButton("取消", new bb(this)).setCancelable(false).show();
            return;
          }
          localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(0, "1042");
          new AlertDialog.Builder(getActivity()).setMessage("　　委托请求提交成功。合同号为：" + (String)localObject2).setPositiveButton("确定", new bd(this)).setCancelable(false).show();
          this.aJ = null;
        }
        for (;;)
        {
          if (paramh == this.j)
          {
            localObject2 = new String(((com.android.dazhihui.a.b.g)paramj).a());
            try
            {
              localObject5 = new JSONObject((String)localObject2).getJSONArray("data");
              i1 = 0;
              while (i1 < ((JSONArray)localObject5).length())
              {
                localObject9 = ((JSONObject)((JSONArray)localObject5).get(i1)).getString("entrust_no");
                new AlertDialog.Builder(getActivity()).setMessage("　　委托请求提交成功。合同号为：" + (String)localObject9).setPositiveButton("确定", new be(this)).setCancelable(false).show();
                this.aJ = null;
                i1 += 1;
                continue;
                a(((com.android.dazhihui.ui.delegate.b.h)localObject2).d());
              }
            }
            catch (JSONException localJSONException5) {}
          }
        }
        try
        {
          a(((JSONObject)new JSONTokener((String)localObject2).nextValue()).getString("error_info"));
          localJSONException5.printStackTrace();
          if (paramh != this.be) {
            break label6398;
          }
          localObject2 = ((v)paramj).b();
          if (!com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject2, getActivity())) {
            break label6398;
          }
          localObject17 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject2).e());
          if (!((com.android.dazhihui.ui.delegate.b.h)localObject17).b())
          {
            paramh = Toast.makeText(getActivity(), ((com.android.dazhihui.ui.delegate.b.h)localObject17).d(), 0);
            paramh.setGravity(17, 0, 0);
            paramh.show();
            return;
          }
        }
        catch (JSONException localJSONException2)
        {
          for (;;)
          {
            new AlertDialog.Builder(getActivity()).setIcon(2130837525).setTitle("访问令牌无效或已过期,请重新登录！").setPositiveButton(2131165363, new bf(this)).show();
            localJSONException2.printStackTrace();
          }
          i3 = ((com.android.dazhihui.ui.delegate.b.h)localObject17).g();
          i1 = ((com.android.dazhihui.ui.delegate.b.h)localObject17).b("1289");
          if (!com.android.dazhihui.ui.delegate.b.o.i()) {
            break label6773;
          }
        }
        i4 = ((com.android.dazhihui.ui.delegate.b.h)localObject17).g();
        if ((i4 != 0) || (this.F.getDataModel().size() != 0)) {
          break;
        }
        this.F.setBackgroundResource(2130838490);
        if ((this.aO != null) && (this.aO.length() == 6)) {
          this.o.setText(this.aO);
        }
        while (bool1)
        {
          ah.a().d();
          return;
          a(true);
        }
      }
    }
    this.F.setBackgroundColor(getResources().getColor(2131493677));
    Object localObject3;
    label6066:
    Object localObject6;
    Object localObject15;
    if (i4 > 0)
    {
      this.aW = -1;
      localObject9 = new ArrayList();
      i2 = 0;
      while (i2 < i4)
      {
        localObject10 = new mh();
        localObject3 = new String[this.am.length];
        localObject11 = new int[this.am.length];
        i3 = 0;
        for (;;)
        {
          if (i3 >= this.am.length) {
            break label6066;
          }
          try
          {
            localObject3[i3] = ((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i2, this.an[i3]).trim();
            if (localObject3[i3] == null) {
              localObject3[i3] = "--";
            }
          }
          catch (Exception localException)
          {
            for (;;)
            {
              String str2;
              localObject3[i3] = "--";
              continue;
              if ((localException != null) && (Double.parseDouble(localException) < 0.0D)) {
                i1 = getResources().getColor(2131492932);
              } else {
                i1 = -16777216;
              }
            }
          }
          if (this.an[i3].equals("1065")) {
            this.aW = i3;
          }
          str2 = ((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i2, "1064");
          if ((str2 == null) || (Double.parseDouble(str2) <= 0.0D)) {
            break;
          }
          i1 = -65536;
          localObject3[i3] = com.android.dazhihui.ui.delegate.b.o.c(this.an[i3], localObject3[i3]);
          localObject11[i3] = i1;
          i3 += 1;
        }
        localObject6 = ((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i2, "1036");
        ((mh)localObject10).a = ((String[])localObject3);
        ((mh)localObject10).b = ((int[])localObject11);
        localObject3 = localObject6;
        if (localObject6 == null) {
          localObject3 = "";
        }
        ((mh)localObject10).d = ((String)localObject3);
        ((List)localObject9).add(localObject10);
        i2 += 1;
      }
      if (this.aW != -1) {
        Collections.sort((List)localObject9, this.d);
      }
      this.F.a((List)localObject9, 0);
      if (bool1)
      {
        ah.a().d();
        i1 = 0;
        while (i1 < i4)
        {
          localObject10 = ((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i1, "1036");
          localObject11 = ((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i1, "1037");
          localObject12 = ((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i1, "1062");
          localObject9 = ((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i1, "1021");
          localObject13 = ((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i1, "1064");
          localObject14 = ((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i1, "1181");
          localObject6 = ((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i1, "1461");
          if (localObject6 != null)
          {
            localObject3 = localObject6;
            if (!((String)localObject6).equals("")) {}
          }
          else
          {
            localObject3 = ((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i1, "1060");
          }
          localObject15 = ((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i1, "1061");
          if (localObject9 != null)
          {
            localObject6 = localObject9;
            if (!((String)localObject9).equals("")) {}
          }
          else
          {
            localObject6 = ((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i1, "1004");
          }
          ah.a().a((String)localObject11, (String)localObject10, (String)localObject6, (String)localObject12, (String)localObject3, (String)localObject15, (String)localObject13, (String)localObject14);
          i1 += 1;
        }
        ah.a().m();
      }
    }
    label6368:
    if ((this.aO != null) && (this.aO.length() == 6))
    {
      this.o.setText(this.aO);
      label6398:
      if (paramh == this.k)
      {
        localObject9 = new String(((com.android.dazhihui.a.b.g)paramj).a());
        localObject3 = null;
      }
    }
    label6628:
    Object localObject4;
    Object localObject7;
    for (;;)
    {
      try
      {
        localObject10 = new JSONObject((String)localObject9).getJSONArray("data");
        i3 = ((JSONArray)localObject10).length();
        this.aw.a(i3);
        if ((i3 != 0) || (this.au.size() != 0)) {
          break label7972;
        }
        this.al.setVisibility(0);
        if ((this.aO == null) || (this.aO.length() != 6)) {
          break label7964;
        }
        this.o.setText(this.aO);
        if (!bool1) {
          break;
        }
        ah.a().d();
        return;
      }
      catch (JSONException localJSONException3)
      {
        try
        {
          localObject6 = ((JSONObject)new JSONTokener((String)localObject9).nextValue()).getString("error_info");
          localObject6 = Toast.makeText(getActivity(), (CharSequence)localObject6, 0);
          ((Toast)localObject6).setGravity(17, 0, 0);
          ((Toast)localObject6).show();
          return;
        }
        catch (JSONException localJSONException6)
        {
          new AlertDialog.Builder(getActivity()).setIcon(2130837525).setTitle("访问令牌无效或已过期,请重新登录！").setPositiveButton(2131165363, new bg(this)).show();
          localJSONException6.printStackTrace();
          localJSONException3.printStackTrace();
        }
      }
      if (paramh != this.h) {
        break label8768;
      }
      localObject4 = new String(((com.android.dazhihui.a.b.g)paramj).a());
      try
      {
        localObject4 = new JSONObject((String)localObject4).getJSONArray("data");
        i1 = 0;
        while (i1 < ((JSONArray)localObject4).length())
        {
          localObject9 = (JSONObject)((JSONArray)localObject4).get(i1);
          localObject7 = ((JSONObject)localObject9).getString("prod_code");
          localObject9 = ((JSONObject)localObject9).getString("prod_name");
          if ((((String)localObject7).endsWith("SS")) || (((String)localObject7).endsWith("SZ")))
          {
            this.f = ((String)localObject7);
            if (localObject9 != null) {
              this.p.setText((CharSequence)localObject9);
            }
            i(this.f);
          }
          i1 += 1;
        }
        label6773:
        this.aw.a(i1);
        if ((i3 == 0) && (this.au.size() == 0))
        {
          this.al.setVisibility(0);
          if ((this.aO != null) && (this.aO.length() == 6)) {
            this.o.setText(this.aO);
          }
          while (bool1)
          {
            ah.a().d();
            return;
            a(true);
          }
        }
        this.al.setVisibility(4);
        if (i3 <= 0) {
          break label6368;
        }
        i1 = 0;
        while (i1 < i3)
        {
          localObject7 = new String[this.an.length];
          localObject9 = new String[this.aq.length];
          i2 = 0;
          if (i2 < this.an.length)
          {
            if (this.an[i2].equals("1320"))
            {
              if (((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i1, this.an[i2]) == null) {}
              for (localObject4 = "";; localObject4 = ((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i1, this.an[i2]) + "%")
              {
                localObject7[i2] = localObject4;
                i2 += 1;
                break;
              }
            }
            if (((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i1, this.an[i2]) == null) {}
            for (localObject4 = "";; localObject4 = ((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i1, this.an[i2]))
            {
              localObject7[i2] = localObject4;
              break;
            }
          }
          i2 = 0;
          if (i2 < this.aq.length)
          {
            if (((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i1, this.aq[i2]) == null) {}
            for (localObject4 = "";; localObject4 = ((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i1, this.aq[i2]))
            {
              localObject9[i2] = localObject4;
              i2 += 1;
              break;
            }
          }
          this.av.add(localObject9);
          this.au.add(localObject7);
          i1 += 1;
        }
        Collections.sort(this.av, c);
        Collections.sort(this.au, c);
        i2 = 0;
        if (i2 < this.au.size())
        {
          localObject7 = ((String[])this.au.get(i2))[2];
          if (localObject7 != null)
          {
            localObject4 = localObject7;
            if (!((String)localObject7).equals("--")) {}
          }
          else
          {
            localObject4 = "0";
          }
          d1 = Double.parseDouble((String)localObject4);
          i1 = 0;
          if (isAdded())
          {
            if (d1 != 0.0D) {
              break label7281;
            }
            i1 = -16777216;
          }
          for (;;)
          {
            this.at.add(new Integer(i1));
            i2 += 1;
            break;
            label7281:
            if (d1 > 0.0D) {
              i1 = -65536;
            } else {
              i1 = getResources().getColor(2131492932);
            }
          }
        }
        this.aw.notifyDataSetChanged();
        localObject7 = "";
        localObject16 = "";
        localObject4 = "";
        localObject14 = "";
        localObject15 = "";
        localObject13 = "";
        localObject12 = "";
        localObject11 = "";
        if (!bool1) {
          break label6368;
        }
        ah.a().d();
        i1 = 0;
        while (i1 < i3)
        {
          i2 = 0;
          if (i2 < this.ao.length)
          {
            localObject9 = localObject16;
            if (this.ao[i2].equals("1036"))
            {
              if (((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i1, this.ao[i2]) == null) {
                localObject9 = "";
              }
            }
            else
            {
              label7432:
              if (!this.ao[i2].equals("1037")) {
                break label8798;
              }
              if (((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i1, this.ao[i2]) != null) {
                break label7747;
              }
              localObject7 = "";
              label7469:
              if (this.ao[i2].equals("1060"))
              {
                if (((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i1, this.ao[i2]) != null) {
                  break label7766;
                }
                localObject10 = "";
                label7506:
                localObject15 = localObject10;
              }
              if (this.ao[i2].equals("1062"))
              {
                if (((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i1, this.ao[i2]) != null) {
                  break label7785;
                }
                localObject10 = "";
                label7547:
                localObject14 = localObject10;
              }
              if (!this.ao[i2].equals("1021")) {
                break label8795;
              }
              if (((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i1, this.ao[i2]) != null) {
                break label7804;
              }
              localObject4 = "";
              label7588:
              if (this.ao[i2].equals("1061"))
              {
                if (((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i1, this.ao[i2]) != null) {
                  break label7823;
                }
                localObject10 = "";
                label7625:
                localObject13 = localObject10;
              }
              if (this.ao[i2].equals("1064"))
              {
                if (((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i1, this.ao[i2]) != null) {
                  break label7842;
                }
                localObject10 = "";
                label7666:
                localObject12 = localObject10;
              }
              localObject10 = localObject11;
              if (this.ao[i2].equals("1181")) {
                if (((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i1, this.ao[i2]) != null) {
                  break label7861;
                }
              }
            }
            label7747:
            label7766:
            label7785:
            label7804:
            label7823:
            label7842:
            label7861:
            for (localObject10 = "";; localObject10 = ((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i1, this.ao[i2]))
            {
              i2 += 1;
              localObject16 = localObject9;
              localObject11 = localObject10;
              break;
              localObject9 = ((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i1, this.ao[i2]);
              break label7432;
              localObject7 = ((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i1, this.ao[i2]);
              break label7469;
              localObject10 = ((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i1, this.ao[i2]);
              break label7506;
              localObject10 = ((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i1, this.ao[i2]);
              break label7547;
              localObject4 = ((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i1, this.ao[i2]);
              break label7588;
              localObject10 = ((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i1, this.ao[i2]);
              break label7625;
              localObject10 = ((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i1, this.ao[i2]);
              break label7666;
            }
          }
          if (localObject4 != null)
          {
            localObject9 = localObject4;
            if (!((String)localObject4).equals("")) {}
          }
          else
          {
            localObject9 = ((com.android.dazhihui.ui.delegate.b.h)localObject17).a(i1, "1004");
          }
          ah.a().a((String)localObject7, (String)localObject16, (String)localObject9, (String)localObject14, (String)localObject15, (String)localObject13, (String)localObject12, (String)localObject11);
          i1 += 1;
          localObject4 = localObject9;
        }
        ah.a().m();
      }
      catch (JSONException localJSONException4)
      {
        Object localObject16;
        label7964:
        float f1;
        float f2;
        localJSONException4.printStackTrace();
      }
      a(true);
      break label6398;
      a(true);
    }
    label7972:
    this.al.setVisibility(4);
    if (i3 > 0)
    {
      if (!bool1) {
        break label8801;
      }
      ah.a().d();
      break label8801;
      label7999:
      if (i1 < i3)
      {
        localObject11 = (JSONObject)((JSONArray)localObject10).get(i1);
        f1 = Float.parseFloat(((JSONObject)localObject11).getString("cost_price"));
        f2 = Float.parseFloat(((JSONObject)localObject11).getString("last_price"));
        if (f1 == 0.0F) {
          break label8792;
        }
        f1 = (f2 - f1) / f1;
        localObject4 = new DecimalFormat("0.00");
        localObject4 = "" + ((DecimalFormat)localObject4).format(f1 * 100.0F);
        label8104:
        localObject15 = new String[8];
        localObject15[0] = ((JSONObject)localObject11).getString("stock_name");
        localObject15[1] = ((JSONObject)localObject11).getString("market_value");
        localObject15[2] = ((JSONObject)localObject11).getString("income_balance");
        localObject15[3] = localObject4;
        localObject15[4] = ((JSONObject)localObject11).getString("current_amount");
        localObject15[5] = ((JSONObject)localObject11).getString("enable_amount");
        localObject15[6] = ((JSONObject)localObject11).getString("cost_price");
        localObject15[7] = ((JSONObject)localObject11).getString("last_price");
        localObject12 = new String[11];
        localObject12[0] = ((JSONObject)localObject11).getString("stock_name");
        localObject12[1] = ((JSONObject)localObject11).getString("market_value");
        localObject12[2] = ((JSONObject)localObject11).getString("current_amount");
        localObject12[3] = ((JSONObject)localObject11).getString("money_type");
        localObject12[4] = ((JSONObject)localObject11).getString("stock_code");
        localObject12[5] = ((JSONObject)localObject11).getString("enable_amount");
        localObject12[6] = ((JSONObject)localObject11).getString("last_price");
        localObject12[7] = ((JSONObject)localObject11).getString("cost_price");
        localObject12[8] = ((JSONObject)localObject11).getString("income_balance");
        localObject12[9] = ((JSONObject)localObject11).getString("stock_account");
        localObject12[10] = ((JSONObject)localObject11).getString("exchange_type");
        localObject13 = new String[this.l.length];
        localObject14 = new String[this.m.length];
        i2 = 0;
        label8352:
        if (i2 >= this.l.length) {
          break label8856;
        }
        if (!this.l[i2].equals("syl")) {
          break label8823;
        }
        if (localObject15[i2] == null)
        {
          localObject7 = "";
          break label8807;
        }
        localObject7 = localObject15[i2] + "%";
        break label8807;
        label8422:
        if (i2 < this.m.length)
        {
          if (localObject12[i2] != null) {
            break label8878;
          }
          localObject7 = "";
          break label8862;
        }
        this.av.add(localObject14);
        this.au.add(localObject13);
        if (!bool1) {
          break label8888;
        }
        localObject7 = ((JSONObject)localObject11).getString("cost_price");
        localObject12 = ((JSONObject)localObject11).getString("stock_code");
        localObject13 = ((JSONObject)localObject11).getString("stock_name");
        localObject14 = ((JSONObject)localObject11).getString("current_amount");
        localObject15 = ((JSONObject)localObject11).getString("exchange_type");
        localObject16 = ((JSONObject)localObject11).getString("enable_amount");
        localObject17 = ((JSONObject)localObject11).getString("income_balance");
        localObject11 = ((JSONObject)localObject11).getString("last_price");
        ah.a().a((String)localObject13, (String)localObject12, (String)localObject15, (String)localObject7, (String)localObject14, (String)localObject16, (String)localObject17, (String)localObject11);
        break label8888;
      }
      if (bool1) {
        ah.a().m();
      }
    }
    Collections.sort(this.av, c);
    Collections.sort(this.au, c);
    int i2 = 0;
    label8604:
    if (i2 < this.au.size())
    {
      localObject7 = ((String[])this.au.get(i2))[2];
      if (localObject7 == null) {
        break label8897;
      }
      localObject4 = localObject7;
      if (((String)localObject7).equals("--")) {
        break label8897;
      }
      label8655:
      d1 = Double.parseDouble((String)localObject4);
      if (d1 != 0.0D) {
        break label8905;
      }
      i1 = -16777216;
    }
    for (;;)
    {
      label8672:
      this.at.add(new Integer(i1));
      i2 += 1;
      break label8604;
      label8768:
      label8792:
      label8795:
      label8798:
      label8801:
      label8807:
      label8823:
      label8856:
      label8862:
      label8878:
      label8888:
      label8897:
      label8905:
      do
      {
        i1 = getResources().getColor(2131492932);
        break label8672;
        this.aw.notifyDataSetChanged();
        if ((this.aO != null) && (this.aO.length() == 6))
        {
          this.o.setText(this.aO);
          break label6628;
        }
        a(true);
        break label6628;
        if (paramh != this.e) {
          break;
        }
        new String(((com.android.dazhihui.a.b.g)paramj).a());
        return;
        break label8104;
        break label7588;
        break label7469;
        i1 = 0;
        break label7999;
        localObject13[i2] = localObject7;
        i2 += 1;
        break label8352;
        if (localObject15[i2] == null) {}
        for (localObject7 = "";; localObject7 = localObject15[i2])
        {
          localObject13[i2] = localObject7;
          break;
        }
        i2 = 0;
        break label8422;
        for (;;)
        {
          localObject14[i2] = localObject7;
          i2 += 1;
          break;
          localObject7 = localObject12[i2];
        }
        i1 += 1;
        break label7999;
        String str1 = "0";
        break label8655;
      } while (d1 <= 0.0D);
      i1 = -65536;
    }
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    if (!isAdded()) {
      return;
    }
    m().dismiss();
    switch (this.n)
    {
    }
    for (;;)
    {
      this.n = -1;
      return;
      j("请求超时，请查看委托查询，确认是否成功提交 。");
    }
  }
  
  public void i()
  {
    if (com.android.dazhihui.ui.delegate.b.o.i()) {
      this.F.a();
    }
    while (com.android.dazhihui.ui.delegate.b.o.l())
    {
      v();
      return;
      this.at.removeAllElements();
      this.au.removeAllElements();
      this.av.removeAllElements();
      this.aw.notifyDataSetChanged();
    }
    if (com.android.dazhihui.ui.delegate.b.o.m())
    {
      f(com.android.dazhihui.ui.delegate.b.o.g);
      return;
    }
    b(true);
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    if (!isAdded()) {
      return;
    }
    m().dismiss();
    switch (this.n)
    {
    }
    for (;;)
    {
      this.n = -1;
      return;
      j("请求超时，请查看委托查询，确认是否成功提交 。");
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.aU = paramLayoutInflater.inflate(2130903475, paramViewGroup, false);
    l();
    n();
    k();
    o();
    if (com.android.dazhihui.ui.delegate.b.o.l()) {
      v();
    }
    for (;;)
    {
      return this.aU;
      if (com.android.dazhihui.ui.delegate.b.o.m()) {
        f(com.android.dazhihui.ui.delegate.b.o.g);
      } else {
        b(true);
      }
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.bg = true;
  }
  
  public void show()
  {
    if ((!com.android.dazhihui.ui.delegate.b.o.i()) && (this.at != null) && (this.au != null) && (this.av != null))
    {
      this.at.removeAllElements();
      this.au.removeAllElements();
      this.av.removeAllElements();
      this.aw.notifyDataSetChanged();
      if (com.android.dazhihui.ui.delegate.b.o.l()) {
        v();
      }
    }
    for (;;)
    {
      if ((this.o != null) && (((TradeCommonStock)getActivity()).b != null))
      {
        this.aO = ((TradeCommonStock)getActivity()).b;
        this.aP = ((TradeCommonStock)getActivity()).c;
        this.aQ = ((TradeCommonStock)getActivity()).d;
        ((TradeCommonStock)getActivity()).b = null;
        ((TradeCommonStock)getActivity()).c = null;
        ((TradeCommonStock)getActivity()).d = null;
      }
      return;
      if (com.android.dazhihui.ui.delegate.b.o.m())
      {
        f(com.android.dazhihui.ui.delegate.b.o.g);
      }
      else
      {
        b(true);
        continue;
        if ((com.android.dazhihui.ui.delegate.b.o.i()) && (this.F != null))
        {
          this.F.a();
          b(true);
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */