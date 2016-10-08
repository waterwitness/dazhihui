package com.android.dazhihui.ui.delegate.screen.structuredfund;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.ui.delegate.c.a;
import com.android.dazhihui.ui.delegate.screen.ad;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.gr;
import com.android.dazhihui.ui.widget.mh;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Vector;

public class i
  extends ad
{
  private static int aP;
  private static int aQ;
  private static int aR;
  private static int aS;
  private static int aT;
  private static int aU;
  private static int aV;
  private static int aW;
  private static int aX;
  public static final Comparator<String[]> c = new m();
  public static final Comparator<String[]> d = new n();
  public static final Comparator<String[]> e = new p();
  private TextView A;
  private TextView B;
  private TextView C;
  private TextView D;
  private TextView E;
  private TextView F;
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
  private LinearLayout S;
  private LinearLayout T;
  private LinearLayout U;
  private LinearLayout V;
  private LinearLayout W;
  private LinearLayout X;
  private LinearLayout Y;
  private LinearLayout Z;
  private String aA;
  private com.android.dazhihui.ui.delegate.b.h aB;
  private String aC;
  private String aD;
  private String aE;
  private boolean aF;
  private String aG;
  private String aH;
  private String aI;
  private String aJ;
  private gr aK;
  private View aL;
  private View aM;
  private int aN;
  private int aO;
  private com.android.dazhihui.a.b.u aY;
  private com.android.dazhihui.a.b.u aZ;
  private LinearLayout aa;
  private LinearLayout ab;
  private ListView ac;
  private ImageView ad;
  private String[] ae = { "名称", "市值", "盈亏", "收益率", "持仓", "可用", "成本", "现价" };
  private String[] af = { "1037", "1065", "1064", "1320", "1060", "1061", "1062", "1181" };
  private String[] ag = { "1037", "1065", "1064", "1320", "1060", "1061", "1062", "1181", "1036", "1019", "1021" };
  private String[] ah = { "证券名称", "市值", "最新市值", "证券数量", "证券代码", "成本价格", "当前价", "浮动盈亏", "盈亏比例", "股东代码" };
  private String[] ai = { "1037", "1065", "1064", "1060", "1036", "1062", "1181", "1065", "1320", "1019" };
  private String[] aj = { "1091", "1065", "1064", "shouyilv", "1060", "1061", "1062", "1181", "6111", "6116" };
  private String[] ak;
  private Vector<Integer> al;
  private Vector<String[]> am;
  private Vector<String[]> an;
  private aa ao;
  private LayoutInflater ap;
  private ac aq;
  private int ar;
  private String as;
  private String at;
  private int au;
  private int av;
  private boolean aw;
  private String ax;
  private String ay;
  private String az;
  private com.android.dazhihui.a.b.u ba;
  private int bb;
  private com.android.dazhihui.a.b.u bc;
  private String[] bd;
  private int be;
  private ArrayList<Map.Entry<String, Double>> bf;
  private double bg;
  private Map<String, Double> bh;
  private Vector<String[]> bi;
  private boolean bj;
  public Comparator<mh> f;
  private int g = -1;
  private EditText h;
  private TextView i;
  private LinearLayout j;
  private LinearLayout k;
  private TextView l;
  private TextView m;
  private EditText n;
  private EditText o;
  private TextView p;
  private TextView q;
  private View r;
  private Button s;
  private ImageView t;
  private ImageView u;
  private LinearLayout v;
  private LinearLayout w;
  private TableLayoutGroup x;
  private TextView y;
  private TextView z;
  
  public i()
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
      this.ak = arrayOfString;
      this.aw = true;
      this.az = "1";
      this.aA = "0";
      this.aF = false;
      this.aY = null;
      this.aZ = null;
      this.f = new q(this);
      this.bj = true;
      return;
      arrayOfString = a.bT;
    }
  }
  
  public i(int paramInt)
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
      this.ak = arrayOfString;
      this.aw = true;
      this.az = "1";
      this.aA = "0";
      this.aF = false;
      this.aY = null;
      this.aZ = null;
      this.f = new q(this);
      this.bj = true;
      this.ar = paramInt;
      return;
      arrayOfString = a.bT;
    }
  }
  
  private BigDecimal a(String paramString1, String paramString2)
  {
    return new BigDecimal(paramString1).multiply(new BigDecimal(paramString2)).setScale(2, 4);
  }
  
  private void c(String paramString)
  {
    getActivity().runOnUiThread(new r(this, paramString));
  }
  
  private void n()
  {
    this.aK = new gr(this.aM, getActivity(), this.o, this.aL);
  }
  
  private void o()
  {
    this.r = this.aM.findViewById(2131560665);
    this.h = ((EditText)this.aM.findViewById(2131559140));
    this.i = ((TextView)this.aM.findViewById(2131559141));
    this.j = ((LinearLayout)this.aM.findViewById(2131560667));
    this.k = ((LinearLayout)this.aM.findViewById(2131560669));
    this.m = ((TextView)this.aM.findViewById(2131560670));
    this.l = ((TextView)this.aM.findViewById(2131560668));
    this.n = ((EditText)this.aM.findViewById(2131559145));
    this.q = ((TextView)this.aM.findViewById(2131560676));
    this.t = ((ImageView)this.aM.findViewById(2131559146));
    this.u = ((ImageView)this.aM.findViewById(2131559144));
    this.o = ((EditText)this.aM.findViewById(2131560674));
    this.p = ((TextView)this.aM.findViewById(2131560675));
    this.s = ((Button)this.aM.findViewById(2131559153));
    this.ac = ((ListView)this.aM.findViewById(2131560137));
    this.ad = ((ImageView)this.aM.findViewById(2131558778));
    this.v = ((LinearLayout)this.aM.findViewById(2131560678));
    this.S = ((LinearLayout)this.aM.findViewById(2131560681));
    this.y = ((TextView)this.aM.findViewById(2131560682));
    this.I = ((TextView)this.aM.findViewById(2131560683));
    this.T = ((LinearLayout)this.aM.findViewById(2131560684));
    this.z = ((TextView)this.aM.findViewById(2131560685));
    this.J = ((TextView)this.aM.findViewById(2131560686));
    this.U = ((LinearLayout)this.aM.findViewById(2131560687));
    this.A = ((TextView)this.aM.findViewById(2131560688));
    this.K = ((TextView)this.aM.findViewById(2131560689));
    this.V = ((LinearLayout)this.aM.findViewById(2131560690));
    this.B = ((TextView)this.aM.findViewById(2131560691));
    this.L = ((TextView)this.aM.findViewById(2131560692));
    this.W = ((LinearLayout)this.aM.findViewById(2131560693));
    this.C = ((TextView)this.aM.findViewById(2131560694));
    this.M = ((TextView)this.aM.findViewById(2131560695));
    this.ab = ((LinearLayout)this.aM.findViewById(2131560696));
    this.H = ((TextView)this.aM.findViewById(2131560697));
    this.R = ((TextView)this.aM.findViewById(2131560698));
    this.aa = ((LinearLayout)this.aM.findViewById(2131560699));
    this.G = ((TextView)this.aM.findViewById(2131560700));
    this.Q = ((TextView)this.aM.findViewById(2131560701));
    this.Z = ((LinearLayout)this.aM.findViewById(2131560702));
    this.F = ((TextView)this.aM.findViewById(2131560703));
    this.P = ((TextView)this.aM.findViewById(2131560704));
    this.Y = ((LinearLayout)this.aM.findViewById(2131560705));
    this.E = ((TextView)this.aM.findViewById(2131560706));
    this.O = ((TextView)this.aM.findViewById(2131560707));
    this.X = ((LinearLayout)this.aM.findViewById(2131560708));
    this.D = ((TextView)this.aM.findViewById(2131560709));
    this.N = ((TextView)this.aM.findViewById(2131560710));
    this.aL = this.aM.findViewById(2131560664);
    this.w = ((LinearLayout)this.aM.findViewById(2131558888));
    this.x = ((TableLayoutGroup)this.aM.findViewById(2131558887));
  }
  
  private void p()
  {
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(c() / 7 * 4, -2);
    this.r.setLayoutParams(localLayoutParams);
    this.aq = new ac(this);
    if (this.bj)
    {
      this.aq.start();
      this.bj = false;
    }
    r();
    if (((StructuredFundCommonActivity)getActivity()).b != null)
    {
      this.aG = ((StructuredFundCommonActivity)getActivity()).b;
      this.aH = ((StructuredFundCommonActivity)getActivity()).c;
      this.aI = ((StructuredFundCommonActivity)getActivity()).d;
      ((StructuredFundCommonActivity)getActivity()).b = null;
      ((StructuredFundCommonActivity)getActivity()).c = null;
      ((StructuredFundCommonActivity)getActivity()).d = null;
    }
    if (this.ar == 0)
    {
      this.n.setHint("买入价");
      this.o.setHint("买入量");
      this.s.setText("买入");
      this.v.setBackgroundResource(2130839034);
      this.h.setBackgroundResource(2130839032);
      this.n.setBackgroundResource(2130839032);
      this.o.setBackgroundResource(2130839032);
      this.t.setBackgroundResource(2130839069);
      this.u.setBackgroundResource(2130839057);
      this.s.setBackgroundResource(2130839023);
      if (isAdded()) {
        this.s.setTextColor(getResources().getColorStateList(2130839024));
      }
      this.j.setBackgroundResource(2130839083);
      this.k.setBackgroundResource(2130839083);
      this.S.setBackgroundResource(2130839083);
      this.T.setBackgroundResource(2130839083);
      this.U.setBackgroundResource(2130839083);
      this.V.setBackgroundResource(2130839083);
      this.W.setBackgroundResource(2130839083);
      this.ab.setBackgroundResource(2130839083);
      this.aa.setBackgroundResource(2130839083);
      this.Z.setBackgroundResource(2130839083);
      this.Y.setBackgroundResource(2130839083);
      this.X.setBackgroundResource(2130839083);
    }
    for (;;)
    {
      this.w.setVisibility(0);
      this.x.setVisibility(8);
      this.al = new Vector();
      this.am = new Vector();
      this.an = new Vector();
      this.ap = LayoutInflater.from(getActivity());
      this.ao = new aa(this);
      this.ac.setAdapter(this.ao);
      this.ad.setVisibility(8);
      return;
      this.n.setHint("卖出价");
      this.o.setHint("卖出量");
      this.s.setText("卖出");
      this.v.setBackgroundResource(2130839033);
      this.h.setBackgroundResource(2130839031);
      this.n.setBackgroundResource(2130839031);
      this.o.setBackgroundResource(2130839031);
      this.t.setBackgroundResource(2130839059);
      this.u.setBackgroundResource(2130839047);
      this.s.setBackgroundResource(2130839025);
      if (isAdded()) {
        this.s.setTextColor(getResources().getColorStateList(2130839026));
      }
      this.j.setBackgroundResource(2130839085);
      this.k.setBackgroundResource(2130839085);
      this.S.setBackgroundResource(2130839085);
      this.T.setBackgroundResource(2130839085);
      this.U.setBackgroundResource(2130839085);
      this.V.setBackgroundResource(2130839085);
      this.W.setBackgroundResource(2130839085);
      this.ab.setBackgroundResource(2130839085);
      this.aa.setBackgroundResource(2130839085);
      this.Z.setBackgroundResource(2130839085);
      this.Y.setBackgroundResource(2130839085);
      this.X.setBackgroundResource(2130839085);
    }
  }
  
  private void q()
  {
    ab localab = new ab(this);
    this.s.setOnClickListener(localab);
    this.t.setOnClickListener(localab);
    this.u.setOnClickListener(localab);
    this.j.setOnClickListener(localab);
    this.k.setOnClickListener(localab);
    this.S.setOnClickListener(localab);
    this.T.setOnClickListener(localab);
    this.U.setOnClickListener(localab);
    this.V.setOnClickListener(localab);
    this.W.setOnClickListener(localab);
    this.ab.setOnClickListener(localab);
    this.aa.setOnClickListener(localab);
    this.Z.setOnClickListener(localab);
    this.Y.setOnClickListener(localab);
    this.X.setOnClickListener(localab);
    this.ac.setOnItemClickListener(new j(this));
    this.h.addTextChangedListener(new s(this));
    this.n.addTextChangedListener(new t(this));
    this.o.addTextChangedListener(new u(this));
    this.o.setOnTouchListener(new v(this));
    this.o.setOnFocusChangeListener(new w(this));
  }
  
  private void r()
  {
    this.aJ = null;
    if (this.aK != null) {
      this.aK.a(0);
    }
    this.aI = null;
    this.aG = null;
    this.aH = null;
    this.as = null;
    this.at = null;
    this.aw = true;
    this.au = 0;
    this.av = 0;
    this.aq.d = true;
    this.aE = null;
    this.aF = false;
    this.i.setText("");
    this.m.setText("--");
    this.l.setText("--");
    this.p.setVisibility(8);
    this.q.setText("");
    this.q.setVisibility(4);
    this.n.setText("");
    this.o.setText("");
    this.y.setText("--");
    this.y.setTextColor(-16777216);
    this.I.setText("--");
    this.z.setText("--");
    this.z.setTextColor(-16777216);
    this.J.setText("--");
    this.A.setText("--");
    this.A.setTextColor(-16777216);
    this.K.setText("--");
    this.B.setText("--");
    this.B.setTextColor(-16777216);
    this.L.setText("--");
    this.C.setText("--");
    this.C.setTextColor(-16777216);
    this.M.setText("--");
    this.H.setText("--");
    this.H.setTextColor(-16777216);
    this.R.setText("--");
    this.G.setText("--");
    this.G.setTextColor(-16777216);
    this.Q.setText("--");
    this.F.setText("--");
    this.F.setTextColor(-16777216);
    this.P.setText("--");
    this.E.setText("--");
    this.E.setTextColor(-16777216);
    this.O.setText("--");
    this.D.setText("--");
    this.D.setTextColor(-16777216);
    this.N.setText("--");
  }
  
  private void s()
  {
    if ((this.h.getText().length() == 0) || (this.n.getText().length() == 0) || (this.o.getText().length() == 0))
    {
      c(0);
      return;
    }
    if (this.as == null)
    {
      c(1);
      return;
    }
    if (this.ax == null)
    {
      c(2);
      return;
    }
    Object localObject1 = "" + "证券代码:" + this.as + "\n";
    localObject1 = (String)localObject1 + "证券名称:" + this.i.getText().toString() + "\n";
    localObject1 = (String)localObject1 + "委托价格:" + this.n.getText().toString() + "\n";
    Object localObject2 = (String)localObject1 + "委托数量:" + this.o.getText().toString() + "\n";
    localObject1 = localObject2;
    if (!this.m.getText().toString().equals(""))
    {
      localObject1 = localObject2;
      if (!this.m.getText().toString().equals("--"))
      {
        localObject1 = localObject2;
        if (Float.parseFloat(this.n.getText().toString()) > Float.parseFloat(this.m.getText().toString()))
        {
          localObject2 = new StringBuilder().append((String)localObject2);
          if (this.ar != 0) {
            break label647;
          }
          localObject1 = "买入";
          localObject1 = (String)localObject1 + "的价格高于涨停价,交易可能不会成功!\n";
        }
      }
    }
    localObject2 = localObject1;
    if (!this.l.getText().toString().equals(""))
    {
      localObject2 = localObject1;
      if (!this.l.getText().toString().equals("--"))
      {
        localObject2 = localObject1;
        if (Float.parseFloat(this.n.getText().toString()) < Float.parseFloat(this.l.getText().toString()))
        {
          localObject2 = new StringBuilder().append((String)localObject1);
          if (this.ar != 0) {
            break label654;
          }
          localObject1 = "买入";
          label456:
          localObject2 = (String)localObject1 + "的价格低于跌停价,交易可能不会成功!\n";
        }
      }
    }
    localObject1 = localObject2;
    if (this.aJ != null)
    {
      localObject1 = localObject2;
      if (!this.aJ.equals(""))
      {
        localObject1 = localObject2;
        if (Integer.parseInt(this.o.getText().toString()) > (int)Float.parseFloat(this.aJ))
        {
          localObject2 = new StringBuilder().append((String)localObject2);
          if (this.ar != 0) {
            break label661;
          }
          localObject1 = "买入";
          label544:
          localObject2 = ((StringBuilder)localObject2).append((String)localObject1).append("数量大于最大");
          if (this.ar != 0) {
            break label668;
          }
          localObject1 = "可买";
          label567:
          localObject1 = (String)localObject1 + ",交易可能不会成功!\n";
        }
      }
    }
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(getActivity());
    if (this.ar == 0) {}
    for (localObject2 = "您确认买入吗？";; localObject2 = "您确认卖出吗？")
    {
      localBuilder.setTitle((CharSequence)localObject2).setMessage((CharSequence)localObject1).setPositiveButton(2131165363, new y(this)).setNegativeButton(2131165331, new x(this)).show();
      return;
      label647:
      localObject1 = "卖出";
      break;
      label654:
      localObject1 = "卖出";
      break label456;
      label661:
      localObject1 = "卖出";
      break label544;
      label668:
      localObject1 = "可卖";
      break label567;
    }
  }
  
  private void t()
  {
    String str = this.as;
    if (str == null) {}
    while (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    this.aY = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("11102").a("1003", "0").a("1036", str).h()) });
    registRequestListener(this.aY);
    a(this.aY, true);
  }
  
  private void u()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {}
    while ((this.as == null) || (this.ax == null) || (this.ay == null)) {
      return;
    }
    this.g = 1;
    if (this.ar == 0) {
      this.bb = 4;
    }
    for (;;)
    {
      com.android.dazhihui.ui.delegate.b.h localh = com.android.dazhihui.ui.delegate.b.o.g("12906").a("1026", String.valueOf(this.bb)).a("1021", this.ay).a("1019", this.ax).a("1090", this.as).a("1041", this.n.getText().toString()).a("1040", this.o.getText().toString()).a("1396", this.az).a("2315", "0");
      this.aB = localh;
      this.ba = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.h()) });
      registRequestListener(this.ba);
      a(this.ba, true);
      return;
      if (this.ar == 1) {
        this.bb = 5;
      }
    }
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
  
  public Vector<String[]> a(Vector<String[]> paramVector, int paramInt1, int paramInt2)
  {
    if (paramVector == null) {
      return null;
    }
    this.bi = new Vector();
    this.bd = new String[paramVector.size()];
    this.bh = new HashMap();
    this.be = 0;
    this.bd[this.be] = ((String[])paramVector.get(0))[paramInt1];
    int i1 = 0;
    while (i1 < paramVector.size())
    {
      if ((i1 < paramVector.size() - 1) && (!((String[])paramVector.get(i1))[paramInt1].equals(((String[])paramVector.get(i1 + 1))[paramInt1])))
      {
        this.be += 1;
        this.bd[this.be] = ((String[])paramVector.get(i1 + 1))[paramInt1];
      }
      i1 += 1;
    }
    i1 = 0;
    while (i1 < this.be + 1)
    {
      this.bg = 0.0D;
      int i2 = 0;
      while (i2 < paramVector.size())
      {
        if (this.bd[i1].equals(((String[])paramVector.get(i2))[paramInt1])) {
          this.bg += Double.parseDouble(((String[])paramVector.get(i2))[paramInt2]);
        }
        i2 += 1;
      }
      this.bh.put(this.bd[i1], Double.valueOf(this.bg));
      i1 += 1;
    }
    this.bf = new ArrayList(this.bh.entrySet());
    Collections.sort(this.bf, new o(this));
    paramInt2 = 0;
    while (paramInt2 < this.bf.size())
    {
      String str = (String)((Map.Entry)this.bf.get(paramInt2)).getKey();
      i1 = 0;
      if (i1 < paramVector.size())
      {
        if (str.equals(((String[])paramVector.get(i1))[paramInt1])) {
          this.bi.add(paramVector.get(i1));
        }
        while (i1 != paramVector.size() - 1)
        {
          i1 += 1;
          break;
        }
      }
      paramInt2 += 1;
    }
    return this.bi;
  }
  
  public void a(boolean paramBoolean)
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {}
    Object localObject2;
    do
    {
      return;
      localObject2 = this.as;
    } while ((localObject2 == null) || (this.i.getText().toString().equals("")));
    if ((this.ay == null) || (this.ay.equals("1")) || (this.ay.equals("")) || (this.ay.trim().equals("3")) || (this.ay.trim().equals("5")) || (this.ay.trim().equals("7")))
    {
      localObject1 = "SH" + (String)localObject2;
      if (this.aF) {
        break label344;
      }
      localObject2 = new com.android.dazhihui.a.b.x[2];
      localObject2[0] = new com.android.dazhihui.a.b.x(2939);
      localObject2[0].a((String)localObject1);
      localObject2[1] = new com.android.dazhihui.a.b.x(2940);
      localObject2[1].a((String)localObject1);
    }
    for (Object localObject1 = localObject2;; localObject1 = localObject2)
    {
      localObject1 = new com.android.dazhihui.a.b.m((com.android.dazhihui.a.b.x[])localObject1);
      registRequestListener((com.android.dazhihui.a.b.h)localObject1);
      a((com.android.dazhihui.a.b.h)localObject1, paramBoolean);
      this.aq.c = 0;
      return;
      if ((!this.ay.trim().equals("2")) && (!this.ay.trim().equals("4")) && (!this.ay.trim().equals("6")) && (!this.ay.trim().equals("8")) && (!this.ay.trim().equals("9")))
      {
        localObject1 = localObject2;
        if (!this.ay.trim().equals("10")) {
          break;
        }
      }
      localObject1 = "SZ" + (String)localObject2;
      break;
      label344:
      localObject2 = new com.android.dazhihui.a.b.x[1];
      localObject2[0] = new com.android.dazhihui.a.b.x(2940);
      localObject2[0].a((String)localObject1);
    }
  }
  
  public void b()
  {
    this.h.setText("");
  }
  
  public void b(boolean paramBoolean)
  {
    if ((!com.android.dazhihui.ui.delegate.b.o.r()) && (!com.android.dazhihui.ui.delegate.b.o.s())) {
      return;
    }
    this.bc = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("12902").a("1206", "").a("1277", "").a("1972", "").a("2315", "0").h()) });
    registRequestListener(this.bc);
    a(this.bc, paramBoolean);
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
  
  public void d()
  {
    if ((this.aC != null) && (this.aD != null) && (this.aC.length() > 6))
    {
      com.android.dazhihui.ui.a.m.a().b().addSelfStock(this.aC, this.aD);
      this.aC = null;
      this.aD = null;
    }
  }
  
  public void e()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {}
    do
    {
      return;
      this.aq.b = false;
    } while ((this.as == null) || (this.as.length() != 6) || (this.ax == null) || (this.ay == null));
    com.android.dazhihui.ui.delegate.b.h localh;
    if (this.ar == 0)
    {
      localh = com.android.dazhihui.ui.delegate.b.o.g("11110").a("1021", this.ay).a("1019", this.ax);
      if (this.aE == null) {
        localObject = "0";
      }
    }
    for (Object localObject = localh.a("1003", (String)localObject).a("1036", this.as).a("1041", this.n.getText().toString()).a("1078", "0").a("1247", "0");; localObject = com.android.dazhihui.ui.delegate.b.o.g("11146").a("1019", this.ax).a("1036", this.as).a("1206", "0").a("1277", "1"))
    {
      this.aZ = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(((com.android.dazhihui.ui.delegate.b.h)localObject).h()) });
      registRequestListener(this.aZ);
      a(this.aZ, false);
      return;
      localObject = this.aE;
      break;
    }
  }
  
  public void f()
  {
    this.al.removeAllElements();
    this.am.removeAllElements();
    this.an.removeAllElements();
    this.ao.notifyDataSetChanged();
    b(true);
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, com.android.dazhihui.a.b.j paramj)
  {
    super.handleResponse(paramh, paramj);
    if (paramj == null) {}
    Object localObject1;
    Object localObject3;
    label260:
    label283:
    label337:
    label344:
    int i1;
    int i2;
    int i3;
    Object localObject2;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    label2074:
    label2100:
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              return;
              if ((paramj instanceof com.android.dazhihui.a.b.o))
              {
                localObject1 = ((com.android.dazhihui.a.b.o)paramj).h();
                if (localObject1 != null)
                {
                  if (((com.android.dazhihui.a.b.p)localObject1).a != 2939) {
                    break label344;
                  }
                  localObject1 = ((com.android.dazhihui.a.b.p)localObject1).b;
                  if ((localObject1 == null) || (localObject1.length <= 0)) {
                    break label337;
                  }
                  localObject1 = new com.android.dazhihui.a.b.q((byte[])localObject1);
                  this.aC = ((com.android.dazhihui.a.b.q)localObject1).l();
                  this.aD = ((com.android.dazhihui.a.b.q)localObject1).l();
                  this.aN = ((com.android.dazhihui.a.b.q)localObject1).b();
                  this.au = ((com.android.dazhihui.a.b.q)localObject1).b();
                  ((com.android.dazhihui.a.b.q)localObject1).e();
                  this.av = ((com.android.dazhihui.a.b.q)localObject1).h();
                  ((com.android.dazhihui.a.b.q)localObject1).h();
                  ((com.android.dazhihui.a.b.q)localObject1).h();
                  this.i.setText(this.aD);
                  this.aF = true;
                  if (this.ar != 0) {
                    break label283;
                  }
                  if (this.au != 3) {
                    break label260;
                  }
                  this.t.setBackgroundResource(2130839070);
                  this.u.setBackgroundResource(2130839058);
                }
              }
              do
              {
                do
                {
                  for (;;)
                  {
                    if (paramh != this.aY) {
                      break label2100;
                    }
                    localObject1 = ((com.android.dazhihui.a.b.v)paramj).b();
                    if (!com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, getActivity())) {
                      break label2100;
                    }
                    localObject3 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
                    if (((com.android.dazhihui.ui.delegate.b.h)localObject3).b()) {
                      break;
                    }
                    paramh = Toast.makeText(getActivity(), ((com.android.dazhihui.ui.delegate.b.h)localObject3).d(), 0);
                    paramh.setGravity(17, 0, 0);
                    paramh.show();
                    return;
                    this.t.setBackgroundResource(2130839069);
                    this.u.setBackgroundResource(2130839057);
                    continue;
                    if (this.au == 3)
                    {
                      this.t.setBackgroundResource(2130839060);
                      this.u.setBackgroundResource(2130839048);
                    }
                    else
                    {
                      this.t.setBackgroundResource(2130839059);
                      this.u.setBackgroundResource(2130839047);
                      continue;
                      r();
                    }
                  }
                } while (((com.android.dazhihui.a.b.p)localObject1).a != 2940);
                localObject1 = ((com.android.dazhihui.a.b.p)localObject1).b;
              } while ((localObject1 == null) || (localObject1.length <= 0));
              localObject1 = new com.android.dazhihui.a.b.q((byte[])localObject1);
              i1 = ((com.android.dazhihui.a.b.q)localObject1).b();
              i2 = ((com.android.dazhihui.a.b.q)localObject1).h();
              ((com.android.dazhihui.a.b.q)localObject1).h();
              ((com.android.dazhihui.a.b.q)localObject1).h();
              ((com.android.dazhihui.a.b.q)localObject1).h();
              ((com.android.dazhihui.a.b.q)localObject1).h();
              ((com.android.dazhihui.a.b.q)localObject1).h();
              ((com.android.dazhihui.a.b.q)localObject1).h();
              ((com.android.dazhihui.a.b.q)localObject1).h();
              ((com.android.dazhihui.a.b.q)localObject1).h();
              if (i1 == 1)
              {
                ((com.android.dazhihui.a.b.q)localObject1).h();
                ((com.android.dazhihui.a.b.q)localObject1).h();
                ((com.android.dazhihui.a.b.q)localObject1).h();
              }
              ((com.android.dazhihui.a.b.q)localObject1).e();
              i3 = ((com.android.dazhihui.a.b.q)localObject1).e();
              localObject2 = new String[i3];
              localObject3 = new String[i3];
              localObject4 = new int[i3];
              i1 = 0;
              if (i1 < i3)
              {
                int i4 = ((com.android.dazhihui.a.b.q)localObject1).h();
                int i5 = ((com.android.dazhihui.a.b.q)localObject1).h();
                localObject2[i1] = a(i4, this.au);
                localObject3[i1] = (i5 + "");
                if (i4 > this.av) {
                  localObject4[i1] = -65536;
                }
                for (;;)
                {
                  i1 += 1;
                  break;
                  if (i4 == this.av) {
                    localObject4[i1] = -7829368;
                  } else if (isAdded()) {
                    localObject4[i1] = getResources().getColor(2131493100);
                  }
                }
              }
            } while (this.as == null);
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
                this.C.setText(localObject2[(i3 / 2 - 1 - i1)]);
                this.M.setText(localObject3[(i3 / 2 - 1 - i1)]);
                this.C.setTextColor(localObject4[(i3 / 2 - 1 - i1)]);
                this.H.setText(localObject2[(i3 / 2 + i1)]);
                this.R.setText(localObject3[(i3 / 2 + i1)]);
                this.H.setTextColor(localObject4[(i3 / 2 + i1)]);
                continue;
                this.B.setText(localObject2[(i3 / 2 - 1 - i1)]);
                this.L.setText(localObject3[(i3 / 2 - 1 - i1)]);
                this.B.setTextColor(localObject4[(i3 / 2 - 1 - i1)]);
                this.G.setText(localObject2[(i3 / 2 + i1)]);
                this.Q.setText(localObject3[(i3 / 2 + i1)]);
                this.G.setTextColor(localObject4[(i3 / 2 + i1)]);
                continue;
                this.A.setText(localObject2[(i3 / 2 - 1 - i1)]);
                this.K.setText(localObject3[(i3 / 2 - 1 - i1)]);
                this.A.setTextColor(localObject4[(i3 / 2 - 1 - i1)]);
                this.F.setText(localObject2[(i3 / 2 + i1)]);
                this.P.setText(localObject3[(i3 / 2 + i1)]);
                this.F.setTextColor(localObject4[(i3 / 2 + i1)]);
                continue;
                this.z.setText(localObject2[(i3 / 2 - 1 - i1)]);
                this.J.setText(localObject3[(i3 / 2 - 1 - i1)]);
                this.z.setTextColor(localObject4[(i3 / 2 - 1 - i1)]);
                this.E.setText(localObject2[(i3 / 2 + i1)]);
                this.O.setText(localObject3[(i3 / 2 + i1)]);
                this.E.setTextColor(localObject4[(i3 / 2 + i1)]);
                continue;
                this.y.setText(localObject2[(i3 / 2 - 1 - i1)]);
                this.I.setText(localObject3[(i3 / 2 - 1 - i1)]);
                this.y.setTextColor(localObject4[(i3 / 2 - 1 - i1)]);
                this.D.setText(localObject2[(i3 / 2 + i1)]);
                this.N.setText(localObject3[(i3 / 2 + i1)]);
                this.D.setTextColor(localObject4[(i3 / 2 + i1)]);
              }
            }
            this.at = a(i2, this.au);
            if (this.aI != null)
            {
              this.n.setText(this.aI);
              this.aI = null;
              this.aw = false;
            }
          } while (!this.aw);
          if (this.ar == 1)
          {
            if ((this.H.getText().toString().equals("--")) && (this.at.equals("--")))
            {
              localObject2 = a(this.av, this.au);
              localObject3 = this.n;
              localObject1 = localObject2;
              if (((String)localObject2).equals("--")) {
                localObject1 = "";
              }
              ((EditText)localObject3).setText((CharSequence)localObject1);
            }
            for (;;)
            {
              this.aw = false;
              break;
              if (this.H.getText().toString().equals("--"))
              {
                localObject2 = this.n;
                if (this.at.equals("--")) {}
                for (localObject1 = "";; localObject1 = this.at)
                {
                  ((EditText)localObject2).setText((CharSequence)localObject1);
                  break;
                }
              }
              localObject2 = this.H.getText().toString();
              localObject3 = this.n;
              localObject1 = localObject2;
              if (((String)localObject2).equals("--")) {
                localObject1 = "";
              }
              ((EditText)localObject3).setText((CharSequence)localObject1);
            }
          }
          if ((this.C.getText().toString().equals("--")) && (this.at.equals("--")))
          {
            localObject2 = a(this.av, this.au);
            localObject3 = this.n;
            if (((String)localObject2).equals("--")) {}
            for (localObject1 = "";; localObject1 = localObject2)
            {
              ((EditText)localObject3).setText((CharSequence)localObject1);
              System.out.println("买入价格1" + (String)localObject2);
              break;
            }
          }
          if (this.C.getText().toString().equals("--"))
          {
            localObject2 = this.n;
            if (this.at.equals("--")) {}
            for (localObject1 = "";; localObject1 = this.at)
            {
              ((EditText)localObject2).setText((CharSequence)localObject1);
              System.out.println("买入价格2" + this.at);
              break;
            }
          }
          localObject2 = this.C.getText().toString();
          localObject3 = this.n;
          if (((String)localObject2).equals("--")) {}
          for (localObject1 = "";; localObject1 = localObject2)
          {
            ((EditText)localObject3).setText((CharSequence)localObject1);
            System.out.println("买入价格3" + (String)localObject2);
            break;
          }
        } while (((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "1036").equals(""));
        localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "1037");
        if (localObject1 != null) {
          this.i.setText((CharSequence)localObject1);
        }
        this.aE = ((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "1021");
        this.ay = ((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "1021");
        i1 = com.android.dazhihui.ui.delegate.b.o.z.length - 1;
        if (i1 >= 0)
        {
          if (!com.android.dazhihui.ui.delegate.b.o.z[i1][0].equals(this.ay)) {
            break label2329;
          }
          localObject1 = com.android.dazhihui.ui.delegate.b.o.z[i1][2];
          if ((localObject1 == null) || (!((String)localObject1).equals("1"))) {
            break label2317;
          }
          this.ax = com.android.dazhihui.ui.delegate.b.o.z[i1][1];
        }
        if (this.aH != null) {
          this.ax = this.aH;
        }
        localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "1178");
        localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "1181");
        localObject4 = ((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "1172");
        localObject5 = ((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "1173");
        localObject6 = ((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "1156");
        localObject3 = ((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "1167");
        this.m.setText((CharSequence)localObject4);
        this.l.setText((CharSequence)localObject5);
        if (this.aI != null)
        {
          this.n.setText(this.aI);
          this.aI = null;
          this.aw = false;
        }
        if (this.aw) {
          break label2338;
        }
        this.aw = false;
        a(false);
        this.aq.c = 0;
        this.aq.d = true;
        if (paramh != this.aZ) {
          break;
        }
        localObject1 = ((com.android.dazhihui.a.b.v)paramj).b();
        if (!com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, getActivity())) {
          break;
        }
        localObject1 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
      } while ((!((com.android.dazhihui.ui.delegate.b.h)localObject1).b()) || (((com.android.dazhihui.ui.delegate.b.h)localObject1).g() == 0));
      this.aJ = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1061");
    } while (this.aJ == null);
    this.p.setVisibility(0);
    this.aK.a(Integer.valueOf(this.aJ).intValue());
    if (this.ar == 1) {
      this.p.setText("可卖" + this.aJ + "股");
    }
    label2317:
    label2329:
    label2338:
    label2807:
    label2929:
    label2973:
    double d1;
    for (;;)
    {
      if (paramh == this.bc)
      {
        localObject1 = ((com.android.dazhihui.a.b.v)paramj).b();
        if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, getActivity()))
        {
          localObject4 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
          if (!((com.android.dazhihui.ui.delegate.b.h)localObject4).b())
          {
            paramh = Toast.makeText(getActivity(), ((com.android.dazhihui.ui.delegate.b.h)localObject4).d(), 0);
            paramh.setGravity(17, 0, 0);
            paramh.show();
            return;
            this.ax = com.android.dazhihui.ui.delegate.b.o.z[i1][1];
            i1 -= 1;
            break;
            if (this.ar == 1)
            {
              if (((localObject6 == null) || (((String)localObject6).equals("")) || (Float.parseFloat((String)localObject6) == 0.0F)) && ((localObject2 == null) || (((String)localObject2).equals("")) || (Float.parseFloat((String)localObject2) == 0.0F)))
              {
                localObject3 = this.n;
                localObject2 = localObject1;
                if (localObject1 == null) {
                  localObject2 = "";
                }
                ((EditText)localObject3).setText((CharSequence)localObject2);
                break label2074;
              }
              if ((localObject6 == null) || (((String)localObject6).equals("")) || (Float.parseFloat((String)localObject6) == 0.0F))
              {
                localObject3 = this.n;
                if (localObject2 == null) {}
                for (localObject1 = "";; localObject1 = localObject2)
                {
                  ((EditText)localObject3).setText((CharSequence)localObject1);
                  break;
                }
              }
              this.n.setText((CharSequence)localObject6);
              break label2074;
            }
            if (((localObject3 == null) || (((String)localObject3).equals("")) || (Float.parseFloat((String)localObject3) == 0.0F)) && ((localObject2 == null) || (((String)localObject2).equals("")) || (Float.parseFloat((String)localObject2) == 0.0F)))
            {
              localObject3 = this.n;
              localObject2 = localObject1;
              if (localObject1 == null) {
                localObject2 = "";
              }
              ((EditText)localObject3).setText((CharSequence)localObject2);
              break label2074;
            }
            if ((localObject3 == null) || (((String)localObject3).equals("")) || (Float.parseFloat((String)localObject3) == 0.0F))
            {
              localObject3 = this.n;
              localObject1 = localObject2;
              if (localObject2 == null) {
                localObject1 = "";
              }
              ((EditText)localObject3).setText((CharSequence)localObject1);
              break label2074;
            }
            this.n.setText((CharSequence)localObject3);
            break label2074;
            this.p.setText("可买" + this.aJ + "股");
            continue;
          }
          i3 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).g();
          this.an.removeAllElements();
          this.al.removeAllElements();
          this.am.removeAllElements();
          this.ao.a(i3);
          if ((i3 == 0) && (this.am.size() == 0))
          {
            this.ad.setVisibility(0);
            if ((this.aG != null) && (this.aG.length() == 6))
            {
              this.h.setText(this.aG);
              return;
            }
            a(true);
            return;
          }
          this.ad.setVisibility(4);
          if (i3 > 0)
          {
            localObject1 = null;
            localObject2 = null;
            i1 = 0;
            if (i1 < i3)
            {
              localObject5 = new String[this.aj.length];
              localObject6 = new String[this.ak.length];
              i2 = 0;
              if (i2 < this.aj.length)
              {
                if (this.aj[i2].equals("6111")) {
                  aS = i2;
                }
                if (this.aj[i2].equals("6116")) {
                  aT = i2;
                }
                if (this.aj[i2].equals("1065")) {
                  aU = i2;
                }
                if (((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.aj[i2]) == null)
                {
                  localObject3 = "";
                  localObject5[i2] = localObject3;
                  if (this.aj[i2].equals("1181"))
                  {
                    if (((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.aj[i2]) != null) {
                      break label3114;
                    }
                    localObject1 = "";
                  }
                  if (this.aj[i2].equals("1062")) {
                    if (((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.aj[i2]) != null) {
                      break label3133;
                    }
                  }
                }
                label3114:
                label3133:
                for (localObject2 = "";; localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.aj[i2]))
                {
                  if ((localObject1 != null) && (localObject2 != null))
                  {
                    d1 = (Double.parseDouble((String)localObject1) - Double.parseDouble((String)localObject2)) / Double.parseDouble((String)localObject2);
                    localObject3 = new DecimalFormat("#.##").format(Double.valueOf(d1 * 100.0D));
                    localObject5[3] = ((String)localObject3 + "%");
                  }
                  i2 += 1;
                  break;
                  localObject3 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.aj[i2]);
                  break label2929;
                  localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.aj[i2]);
                  break label2973;
                }
              }
              i2 = 0;
            }
          }
        }
      }
    }
    for (;;)
    {
      if (i2 < this.ak.length)
      {
        if (this.ak[i2].equals("1090")) {
          aV = i2;
        }
        if (this.ak[i2].equals("6111")) {
          aP = i2;
        }
        if (this.ak[i2].equals("6116")) {
          aQ = i2;
        }
        if (this.ak[i2].equals("1065")) {
          aR = i2;
        }
        if (this.ak[i2].equals("1021")) {
          aW = i2;
        }
        if (this.ak[i2].equals("1019")) {
          aX = i2;
        }
        try
        {
          if (((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.ak[i2]).trim() == null) {
            localObject3 = "";
          } else {
            localObject3 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, this.ak[i2]);
          }
        }
        catch (Exception localException)
        {
          localObject6[i2] = "-";
          break label3837;
        }
      }
      this.an.add(localObject6);
      this.am.add(localObject5);
      i1 += 1;
      break label2807;
      Collections.sort(this.an, c);
      Collections.sort(this.am, d);
      this.an = a(this.an, aP, aR);
      this.am = a(this.am, aS, aU);
      i2 = 0;
      if (i2 < this.am.size())
      {
        localObject2 = ((String[])this.am.get(i2))[2];
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
          this.al.add(new Integer(i1));
          i2 += 1;
          break;
          if (d1 > 0.0D) {
            i1 = -65536;
          } else {
            i1 = getResources().getColor(2131492932);
          }
        }
      }
      this.ao.notifyDataSetChanged();
      if ((this.aG != null) && (this.aG.length() == 6)) {
        this.h.setText(this.aG);
      }
      for (;;)
      {
        if (paramh != this.ba) {
          break label3675;
        }
        paramh = ((com.android.dazhihui.a.b.v)paramj).b();
        if (!com.android.dazhihui.ui.delegate.b.u.a(paramh, getActivity())) {
          break;
        }
        this.g = -1;
        paramh = com.android.dazhihui.ui.delegate.b.h.b(paramh.e());
        if (paramh.b()) {
          break label3677;
        }
        paramh = Toast.makeText(getActivity(), paramh.d(), 0);
        paramh.setGravity(17, 0, 0);
        paramh.show();
        return;
        a(true);
      }
      label3675:
      break;
      label3677:
      if (!paramh.b()) {
        break;
      }
      paramj = paramh.a(0, "1208");
      if (paramj != null)
      {
        new AlertDialog.Builder(getActivity()).setTitle("提示信息").setMessage(paramj).setPositiveButton("确定", new k(this)).setNegativeButton("取消", new z(this)).setCancelable(false).show();
        return;
      }
      paramh = paramh.a(0, "1042");
      new AlertDialog.Builder(getActivity()).setMessage("　　委托请求提交成功。合同号为：" + paramh).setPositiveButton("确定", new l(this)).setCancelable(false).show();
      this.aB = null;
      d();
      return;
      localObject6[i2] = localException;
      label3837:
      i2 += 1;
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
    }
    for (;;)
    {
      this.g = -1;
      return;
      c("请求超时，请查看委托查询，确认是否成功提交 。");
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
    }
    for (;;)
    {
      this.g = -1;
      return;
      c("请求超时，请查看委托查询，确认是否成功提交 。");
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.aM = paramLayoutInflater.inflate(2130903532, paramViewGroup, false);
    o();
    p();
    n();
    q();
    b(true);
    return this.aM;
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.bj = true;
  }
  
  public void show()
  {
    if ((this.al != null) && (this.am != null) && (this.an != null))
    {
      this.al.removeAllElements();
      this.am.removeAllElements();
      this.an.removeAllElements();
      this.ao.notifyDataSetChanged();
      b(true);
    }
    if ((this.h != null) && (((StructuredFundCommonActivity)getActivity()).b != null))
    {
      this.aG = ((StructuredFundCommonActivity)getActivity()).b;
      this.aH = ((StructuredFundCommonActivity)getActivity()).c;
      this.aI = ((StructuredFundCommonActivity)getActivity()).d;
      ((StructuredFundCommonActivity)getActivity()).b = null;
      ((StructuredFundCommonActivity)getActivity()).c = null;
      ((StructuredFundCommonActivity)getActivity()).d = null;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\structuredfund\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */