package com.android.dazhihui.ui.delegate.screen.margin;

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
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.ui.delegate.c.a;
import com.android.dazhihui.ui.widget.DropDownEditTextView;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.gr;
import com.android.dazhihui.ui.widget.mh;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class aa
  extends com.android.dazhihui.ui.delegate.screen.ad
{
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
  private TextView S;
  private TextView T;
  private LinearLayout U;
  private LinearLayout V;
  private LinearLayout W;
  private LinearLayout X;
  private LinearLayout Y;
  private LinearLayout Z;
  private boolean aA = false;
  private String aB;
  private String aC;
  private String aD;
  private String aE;
  private gr aF;
  private View aG;
  private View aH;
  private int aI;
  private int aJ;
  private com.android.dazhihui.a.b.u aK = null;
  private com.android.dazhihui.a.b.u aL = null;
  private com.android.dazhihui.a.b.u aM = null;
  private com.android.dazhihui.a.b.u aN = null;
  private boolean aO = true;
  private LinearLayout aa;
  private LinearLayout ab;
  private LinearLayout ac;
  private LinearLayout ad;
  private ListView ae;
  private ImageView af;
  private String[] ag = { "名称", "市值", "盈亏", "收益率", "持仓", "可用", "成本", "现价" };
  private String[] ah = { "1037", "1065", "1064", "1320", "1060", "1061", "1062", "1181" };
  private String[] ai = { "1037", "1065", "1064", "1320", "1060", "1061", "1062", "1181", "1036", "1019", "1021" };
  private String[] aj = { "证券名称", "市值", "最新市值", "证券数量", "证券代码", "成本价格", "当前价", "浮动盈亏", "盈亏比例", "股东代码" };
  private String[] ak = { "1037", "1065", "1064", "1060", "1036", "1062", "1181", "1065", "1320", "1019" };
  private ar al;
  private int am;
  private String an;
  private String ao;
  private int ap;
  private int aq;
  private boolean ar = true;
  private String as;
  private String at;
  private String au = "1";
  private String av = "0";
  private com.android.dazhihui.ui.delegate.b.h aw;
  private String ax;
  private String ay;
  private String az;
  public Comparator<mh> c = new ag(this);
  private int d = -1;
  private DropDownEditTextView e;
  private DropDownEditTextView f;
  private EditText g;
  private TextView h;
  private LinearLayout i;
  private LinearLayout j;
  private RelativeLayout k;
  private TextView l;
  private TextView m;
  private RelativeLayout n;
  private TextView o;
  private EditText p;
  private EditText q;
  private TextView r;
  private TextView s;
  private View t;
  private Button u;
  private ImageView v;
  private ImageView w;
  private LinearLayout x;
  private LinearLayout y;
  private TableLayoutGroup z;
  
  public aa(int paramInt)
  {
    this.am = paramInt;
  }
  
  private BigDecimal a(String paramString1, String paramString2)
  {
    return new BigDecimal(paramString1).multiply(new BigDecimal(paramString2)).setScale(2, 4);
  }
  
  private void b(boolean paramBoolean)
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    this.aN = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("12130").a("1019", "").a("1036", "").a("1206", "").a("1277", "").h()) });
    registRequestListener(this.aN);
    a(this.aN, paramBoolean);
  }
  
  private void c(String paramString)
  {
    getActivity().runOnUiThread(new ah(this, paramString));
  }
  
  private void h()
  {
    this.aF = new gr(this.aH, getActivity(), this.q, this.aG);
  }
  
  private void i()
  {
    this.t = this.aH.findViewById(2131560665);
    this.e = ((DropDownEditTextView)this.aH.findViewById(2131559139));
    this.g = ((EditText)this.aH.findViewById(2131559140));
    this.h = ((TextView)this.aH.findViewById(2131559141));
    this.i = ((LinearLayout)this.aH.findViewById(2131560667));
    this.j = ((LinearLayout)this.aH.findViewById(2131560669));
    this.m = ((TextView)this.aH.findViewById(2131560670));
    this.l = ((TextView)this.aH.findViewById(2131560668));
    this.k = ((RelativeLayout)this.aH.findViewById(2131560666));
    this.n = ((RelativeLayout)this.aH.findViewById(2131560671));
    this.o = ((TextView)this.aH.findViewById(2131560673));
    this.p = ((EditText)this.aH.findViewById(2131559145));
    this.s = ((TextView)this.aH.findViewById(2131560676));
    this.v = ((ImageView)this.aH.findViewById(2131559146));
    this.w = ((ImageView)this.aH.findViewById(2131559144));
    this.q = ((EditText)this.aH.findViewById(2131560674));
    this.r = ((TextView)this.aH.findViewById(2131560675));
    this.u = ((Button)this.aH.findViewById(2131559153));
    this.ae = ((ListView)this.aH.findViewById(2131560137));
    this.af = ((ImageView)this.aH.findViewById(2131558778));
    this.x = ((LinearLayout)this.aH.findViewById(2131560680));
    this.f = ((DropDownEditTextView)this.aH.findViewById(2131560679));
    this.U = ((LinearLayout)this.aH.findViewById(2131560681));
    this.A = ((TextView)this.aH.findViewById(2131560682));
    this.K = ((TextView)this.aH.findViewById(2131560683));
    this.V = ((LinearLayout)this.aH.findViewById(2131560684));
    this.B = ((TextView)this.aH.findViewById(2131560685));
    this.L = ((TextView)this.aH.findViewById(2131560686));
    this.W = ((LinearLayout)this.aH.findViewById(2131560687));
    this.C = ((TextView)this.aH.findViewById(2131560688));
    this.M = ((TextView)this.aH.findViewById(2131560689));
    this.X = ((LinearLayout)this.aH.findViewById(2131560690));
    this.D = ((TextView)this.aH.findViewById(2131560691));
    this.N = ((TextView)this.aH.findViewById(2131560692));
    this.Y = ((LinearLayout)this.aH.findViewById(2131560693));
    this.E = ((TextView)this.aH.findViewById(2131560694));
    this.O = ((TextView)this.aH.findViewById(2131560695));
    this.ad = ((LinearLayout)this.aH.findViewById(2131560696));
    this.J = ((TextView)this.aH.findViewById(2131560697));
    this.T = ((TextView)this.aH.findViewById(2131560698));
    this.ac = ((LinearLayout)this.aH.findViewById(2131560699));
    this.I = ((TextView)this.aH.findViewById(2131560700));
    this.S = ((TextView)this.aH.findViewById(2131560701));
    this.ab = ((LinearLayout)this.aH.findViewById(2131560702));
    this.H = ((TextView)this.aH.findViewById(2131560703));
    this.R = ((TextView)this.aH.findViewById(2131560704));
    this.aa = ((LinearLayout)this.aH.findViewById(2131560705));
    this.G = ((TextView)this.aH.findViewById(2131560706));
    this.Q = ((TextView)this.aH.findViewById(2131560707));
    this.Z = ((LinearLayout)this.aH.findViewById(2131560708));
    this.F = ((TextView)this.aH.findViewById(2131560709));
    this.P = ((TextView)this.aH.findViewById(2131560710));
    this.aG = this.aH.findViewById(2131560664);
    this.y = ((LinearLayout)this.aH.findViewById(2131558888));
    this.z = ((TableLayoutGroup)this.aH.findViewById(2131558887));
  }
  
  private void k()
  {
    Object localObject = new RelativeLayout.LayoutParams(c() / 7 * 4, -2);
    this.t.setLayoutParams((ViewGroup.LayoutParams)localObject);
    this.al = new ar(this);
    if (this.aO)
    {
      this.al.start();
      this.aO = false;
    }
    o();
    if ((this.am == 0) || (this.am == 1))
    {
      if (((MarginCommonScreen)getActivity()).b != null)
      {
        this.aB = ((MarginCommonScreen)getActivity()).b;
        this.aC = ((MarginCommonScreen)getActivity()).c;
        this.aD = ((MarginCommonScreen)getActivity()).d;
        ((MarginCommonScreen)getActivity()).b = null;
        ((MarginCommonScreen)getActivity()).c = null;
        ((MarginCommonScreen)getActivity()).d = null;
      }
      if ((this.am != 5) && (this.am != 4)) {
        break label413;
      }
      this.k.setVisibility(8);
      this.n.setVisibility(0);
    }
    for (;;)
    {
      this.f.setVisibility(8);
      this.e.setEditable(false);
      localObject = new ArrayList();
      if (com.android.dazhihui.ui.delegate.b.o.z == null) {
        break label433;
      }
      int i1 = 0;
      while (i1 < com.android.dazhihui.ui.delegate.b.o.z.length)
      {
        ((ArrayList)localObject).add(com.android.dazhihui.ui.delegate.b.o.q(com.android.dazhihui.ui.delegate.b.o.z[i1][0]) + " " + com.android.dazhihui.ui.delegate.b.o.z[i1][1]);
        i1 += 1;
      }
      if (((this.am != 2) && (this.am != 3) && (this.am != 5) && (this.am != 4)) || (((MarginCommonScreen2)getActivity()).b == null)) {
        break;
      }
      this.aB = ((MarginCommonScreen2)getActivity()).b;
      this.aC = ((MarginCommonScreen2)getActivity()).c;
      this.aD = ((MarginCommonScreen2)getActivity()).d;
      ((MarginCommonScreen2)getActivity()).b = null;
      ((MarginCommonScreen2)getActivity()).c = null;
      ((MarginCommonScreen2)getActivity()).d = null;
      break;
      label413:
      this.k.setVisibility(0);
      this.n.setVisibility(8);
    }
    label433:
    this.e.a((ArrayList)localObject, 0, true);
    if ((this.am == 0) || (this.am == 2) || (this.am == 4))
    {
      this.p.setHint("买入价");
      this.q.setHint("买入量");
      this.u.setText("买入");
      this.e.setBackgroundResource(2130839034);
      this.f.setBackgroundResource(2130839034);
      this.x.setBackgroundResource(2130839034);
      this.g.setBackgroundResource(2130839032);
      this.p.setBackgroundResource(2130839032);
      this.q.setBackgroundResource(2130839032);
      this.v.setBackgroundResource(2130839069);
      this.w.setBackgroundResource(2130839057);
      this.u.setBackgroundResource(2130839023);
      if (isAdded()) {
        this.u.setTextColor(getResources().getColorStateList(2130839024));
      }
      this.i.setBackgroundResource(2130839083);
      this.j.setBackgroundResource(2130839083);
      this.U.setBackgroundResource(2130839083);
      this.V.setBackgroundResource(2130839083);
      this.W.setBackgroundResource(2130839083);
      this.X.setBackgroundResource(2130839083);
      this.Y.setBackgroundResource(2130839083);
      this.ad.setBackgroundResource(2130839083);
      this.ac.setBackgroundResource(2130839083);
      this.ab.setBackgroundResource(2130839083);
      this.aa.setBackgroundResource(2130839083);
      this.Z.setBackgroundResource(2130839083);
      this.y.setVisibility(8);
      this.z.setVisibility(0);
      this.ag = a.aG;
      this.ah = a.aH;
      if ((this.ag != null) && (this.ah != null)) {
        break label1309;
      }
      this.ag = new String[] { "" };
      this.ah = new String[] { "" };
    }
    for (;;)
    {
      this.z.setHeaderColumn(this.ag);
      this.z.setPullDownLoading(false);
      this.z.setLoadingDown(false);
      this.z.setColumnClickable(null);
      this.z.setContinuousLoading(false);
      this.z.setHeaderBackgroundColor(getResources().getColor(2131493677));
      this.z.setDrawHeaderSeparateLine(false);
      this.z.setHeaderTextColor(getResources().getColor(2131493099));
      this.z.setHeaderFontSize(getResources().getDimension(2131230899));
      this.z.setHeaderHeight((int)getResources().getDimension(2131230814));
      this.z.setContentRowHeight(this.z.getContentHeight() / 5 * 4);
      this.z.setLeftPadding(25);
      this.z.setHeaderDivideDrawable(getResources().getDrawable(2130838328));
      this.z.setListDivideDrawable(getResources().getDrawable(2130838328));
      this.z.setRowHighLightBackgroudDrawable(getResources().getDrawable(2130838067));
      this.z.setStockNameColor(getResources().getColor(2131493235));
      this.z.setFirstColumnColorDifferent(true);
      this.z.setOnTableLayoutClickListener(new ab(this));
      return;
      this.p.setHint("卖出价");
      this.q.setHint("卖出量");
      this.u.setText("卖出");
      this.e.setBackgroundResource(2130839033);
      this.f.setBackgroundResource(2130839033);
      this.x.setBackgroundResource(2130839033);
      this.g.setBackgroundResource(2130839031);
      this.p.setBackgroundResource(2130839031);
      this.q.setBackgroundResource(2130839031);
      this.v.setBackgroundResource(2130839059);
      this.w.setBackgroundResource(2130839047);
      this.u.setBackgroundResource(2130839025);
      if (isAdded()) {
        this.u.setTextColor(getResources().getColorStateList(2130839026));
      }
      this.i.setBackgroundResource(2130839085);
      this.j.setBackgroundResource(2130839085);
      this.U.setBackgroundResource(2130839085);
      this.V.setBackgroundResource(2130839085);
      this.W.setBackgroundResource(2130839085);
      this.X.setBackgroundResource(2130839085);
      this.Y.setBackgroundResource(2130839085);
      this.ad.setBackgroundResource(2130839085);
      this.ac.setBackgroundResource(2130839085);
      this.ab.setBackgroundResource(2130839085);
      this.aa.setBackgroundResource(2130839085);
      this.Z.setBackgroundResource(2130839085);
      break;
      label1309:
      n();
    }
  }
  
  private void l()
  {
    aq localaq = new aq(this);
    this.u.setOnClickListener(localaq);
    this.v.setOnClickListener(localaq);
    this.w.setOnClickListener(localaq);
    this.i.setOnClickListener(localaq);
    this.j.setOnClickListener(localaq);
    this.U.setOnClickListener(localaq);
    this.V.setOnClickListener(localaq);
    this.W.setOnClickListener(localaq);
    this.X.setOnClickListener(localaq);
    this.Y.setOnClickListener(localaq);
    this.ad.setOnClickListener(localaq);
    this.ac.setOnClickListener(localaq);
    this.ab.setOnClickListener(localaq);
    this.aa.setOnClickListener(localaq);
    this.Z.setOnClickListener(localaq);
    this.e.setOnItemChangeListener(new ai(this));
    this.f.setOnItemChangeListener(new aj(this));
    this.g.addTextChangedListener(new ak(this));
    this.p.addTextChangedListener(new al(this));
    this.q.addTextChangedListener(new am(this));
    this.q.setOnTouchListener(new an(this));
    this.q.setOnFocusChangeListener(new ao(this));
  }
  
  private void n()
  {
    if ((this.ag == null) || (this.ah == null)) {}
    int i3;
    int i2;
    do
    {
      return;
      i1 = 0;
      i3 = -1;
      i2 = -1;
      while (i1 < this.ah.length)
      {
        if (this.ah[i1].equals("1036")) {
          i3 = i1;
        }
        if (this.ah[i1].equals("1037")) {
          i2 = i1;
        }
        i1 += 1;
      }
    } while ((i2 == -1) || (i3 == -1));
    ArrayList localArrayList = new ArrayList();
    Object localObject = this.ag;
    int i4 = localObject.length;
    int i1 = 0;
    while (i1 < i4)
    {
      localArrayList.add(localObject[i1]);
      i1 += 1;
    }
    localObject = new ArrayList();
    String[] arrayOfString = this.ah;
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
      this.ag = ((String[])localArrayList.toArray(new String[localArrayList.size()]));
      this.ah = ((String[])((List)localObject).toArray(new String[((List)localObject).size()]));
      return;
      localArrayList.remove(i3);
      ((List)localObject).remove(i3);
      localArrayList.remove(i2);
      ((List)localObject).remove(i2);
    }
  }
  
  private void o()
  {
    this.aE = null;
    if (this.aF != null) {
      this.aF.a(0);
    }
    this.aD = null;
    this.aB = null;
    this.aC = null;
    this.an = null;
    this.ao = null;
    this.ar = true;
    this.ap = 0;
    this.aq = 0;
    this.al.d = true;
    this.az = null;
    this.aA = false;
    this.h.setText("");
    this.m.setText("--");
    this.l.setText("--");
    this.o.setText("--");
    this.r.setVisibility(8);
    this.s.setText("");
    this.s.setVisibility(4);
    this.p.setText("");
    this.q.setText("");
    this.A.setText("--");
    this.A.setTextColor(-16777216);
    this.K.setText("--");
    this.B.setText("--");
    this.B.setTextColor(-16777216);
    this.L.setText("--");
    this.C.setText("--");
    this.C.setTextColor(-16777216);
    this.M.setText("--");
    this.D.setText("--");
    this.D.setTextColor(-16777216);
    this.N.setText("--");
    this.E.setText("--");
    this.E.setTextColor(-16777216);
    this.O.setText("--");
    this.J.setText("--");
    this.J.setTextColor(-16777216);
    this.T.setText("--");
    this.I.setText("--");
    this.I.setTextColor(-16777216);
    this.S.setText("--");
    this.H.setText("--");
    this.H.setTextColor(-16777216);
    this.R.setText("--");
    this.G.setText("--");
    this.G.setTextColor(-16777216);
    this.Q.setText("--");
    this.F.setText("--");
    this.F.setTextColor(-16777216);
    this.P.setText("--");
  }
  
  private void p()
  {
    if ((this.p.isEnabled()) && ((this.g.getText().length() == 0) || (this.p.getText().length() == 0) || (this.q.getText().length() == 0) || (this.p.getText().toString().equals("."))))
    {
      c(0);
      return;
    }
    if (this.an == null)
    {
      c(1);
      return;
    }
    if (this.as == null)
    {
      c(2);
      return;
    }
    if (this.q.getText().length() == 0)
    {
      c(4);
      return;
    }
    Object localObject1 = "" + "股东账号:" + this.as + "\n";
    localObject1 = (String)localObject1 + "证券代码:" + this.an + "\n";
    localObject1 = (String)localObject1 + "证券名称:" + this.h.getText().toString() + "\n";
    localObject1 = (String)localObject1 + "委托价格:" + this.p.getText().toString() + "\n";
    Object localObject2 = (String)localObject1 + "委托数量:" + this.q.getText().toString() + "\n";
    localObject1 = localObject2;
    if (!this.m.getText().toString().equals(""))
    {
      localObject1 = localObject2;
      if (!this.m.getText().toString().equals("--"))
      {
        localObject1 = localObject2;
        if (Float.parseFloat(this.p.getText().toString()) > Float.parseFloat(this.m.getText().toString()))
        {
          localObject2 = new StringBuilder().append((String)localObject2);
          if ((this.am != 0) && (this.am != 2) && (this.am != 4)) {
            break label811;
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
        if (Float.parseFloat(this.p.getText().toString()) < Float.parseFloat(this.l.getText().toString()))
        {
          localObject2 = new StringBuilder().append((String)localObject1);
          if ((this.am != 0) && (this.am != 2) && (this.am != 4)) {
            break label818;
          }
          localObject1 = "买入";
          label572:
          localObject2 = (String)localObject1 + "的价格低于跌停价,交易可能不会成功!\n";
        }
      }
    }
    localObject1 = localObject2;
    if (this.aE != null)
    {
      localObject1 = localObject2;
      if (!this.aE.equals(""))
      {
        localObject1 = localObject2;
        if (Integer.parseInt(this.q.getText().toString()) > (int)Float.parseFloat(this.aE))
        {
          localObject2 = new StringBuilder().append((String)localObject2);
          if ((this.am != 0) && (this.am != 2) && (this.am != 4)) {
            break label825;
          }
          localObject1 = "买入";
          label676:
          localObject2 = ((StringBuilder)localObject2).append((String)localObject1).append("数量大于最大");
          if ((this.am != 0) && (this.am != 2) && (this.am != 4)) {
            break label832;
          }
          localObject1 = "可买";
          label715:
          localObject1 = (String)localObject1 + ",交易可能不会成功!\n";
        }
      }
    }
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(getActivity());
    if ((this.am == 0) || (this.am == 2) || (this.am == 4)) {}
    for (localObject2 = "您确认买入吗？";; localObject2 = "您确认卖出吗？")
    {
      localBuilder.setTitle((CharSequence)localObject2).setMessage((CharSequence)localObject1).setPositiveButton(2131165363, new ac(this)).setNegativeButton(2131165331, new ap(this)).show();
      return;
      label811:
      localObject1 = "卖出";
      break;
      label818:
      localObject1 = "卖出";
      break label572;
      label825:
      localObject1 = "卖出";
      break label676;
      label832:
      localObject1 = "可卖";
      break label715;
    }
  }
  
  private void q()
  {
    String str = this.an;
    if (str == null) {}
    while (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    this.aK = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("11102").a("1003", "0").a("1036", str).h()) });
    registRequestListener(this.aK);
    a(this.aK, true);
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
    Object localObject2;
    do
    {
      return;
      localObject2 = this.an;
    } while ((localObject2 == null) || (this.h.getText().toString().equals("")));
    if ((this.at == null) || (this.at.equals("1")) || (this.at.equals("")) || (this.at.trim().equals("3")) || (this.at.trim().equals("5")) || (this.at.trim().equals("7")))
    {
      localObject1 = "SH" + (String)localObject2;
      if (this.aA) {
        break label343;
      }
      localObject2 = new x[2];
      localObject2[0] = new x(2939);
      localObject2[0].a((String)localObject1);
      localObject2[1] = new x(2940);
      localObject2[1].a((String)localObject1);
    }
    for (Object localObject1 = localObject2;; localObject1 = localObject2)
    {
      localObject1 = new m((x[])localObject1);
      registRequestListener((com.android.dazhihui.a.b.h)localObject1);
      a((com.android.dazhihui.a.b.h)localObject1, paramBoolean);
      this.al.c = 0;
      return;
      if ((!this.at.trim().equals("2")) && (!this.at.trim().equals("4")) && (!this.at.trim().equals("6")) && (!this.at.trim().equals("8")) && (!this.at.trim().equals("9")))
      {
        localObject1 = localObject2;
        if (!this.at.trim().equals("10")) {
          break;
        }
      }
      localObject1 = "SZ" + (String)localObject2;
      break;
      label343:
      localObject2 = new x[1];
      localObject2[0] = new x(2940);
      localObject2[0].a((String)localObject1);
    }
  }
  
  public void b()
  {
    this.g.setText("");
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
    if (paramInt == 4)
    {
      localToast = Toast.makeText(getActivity(), "　　请输入委托数量", 0);
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
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {}
    do
    {
      return;
      this.al.b = false;
    } while ((this.an == null) || (this.an.length() != 6) || (this.as == null) || (this.at == null));
    Object localObject;
    if (this.am == 0)
    {
      com.android.dazhihui.ui.delegate.b.h localh = com.android.dazhihui.ui.delegate.b.o.g("11110").a("1021", this.at).a("1019", this.as);
      if (this.az == null)
      {
        localObject = "0";
        label90:
        localObject = localh.a("1003", (String)localObject).a("1036", this.an).a("1041", this.p.getText().toString()).a("1078", "0").a("1247", "0");
      }
    }
    for (;;)
    {
      this.aL = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(((com.android.dazhihui.ui.delegate.b.h)localObject).h()) });
      registRequestListener(this.aL);
      a(this.aL, false);
      return;
      localObject = this.az;
      break label90;
      if (this.am == 1)
      {
        localObject = com.android.dazhihui.ui.delegate.b.o.g("12130").a("1019", this.as).a("1036", this.an).a("1206", "0").a("1277", "1").a("1026", "2");
      }
      else if (this.am == 2)
      {
        localObject = com.android.dazhihui.ui.delegate.b.o.g("12124").a("1021", this.at).a("1019", this.as).a("1036", this.an).a("1041", this.p.getText().toString()).a("1026", "1");
      }
      else if (this.am == 3)
      {
        localObject = com.android.dazhihui.ui.delegate.b.o.g("12124").a("1021", this.at).a("1019", this.as).a("1036", this.an).a("1041", this.p.getText().toString()).a("1026", "2");
      }
      else if (this.am == 5)
      {
        localObject = com.android.dazhihui.ui.delegate.b.o.g("12124").a("1021", this.at).a("1019", this.as).a("1036", this.an).a("1041", this.p.getText().toString()).a("1026", "3");
      }
      else
      {
        if (this.am != 4) {
          break;
        }
        localObject = com.android.dazhihui.ui.delegate.b.o.g("12124").a("1021", this.at).a("1019", this.as).a("1036", this.an).a("1041", this.p.getText().toString()).a("1026", "4");
      }
    }
  }
  
  public void e()
  {
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {}
    while ((this.an == null) || (this.as == null) || (this.at == null)) {
      return;
    }
    this.d = 1;
    Object localObject = null;
    com.android.dazhihui.ui.delegate.b.h localh;
    if ((this.am == 0) || (this.am == 1))
    {
      localObject = "";
      if (this.am == 0)
      {
        localObject = "0";
        localh = com.android.dazhihui.ui.delegate.b.o.g("12134").a("1026", (String)localObject).a("1021", this.at).a("1019", this.as);
        if (this.az != null) {
          break label250;
        }
        localObject = "0";
        localObject = localh.a("1003", (String)localObject).a("1036", this.an).a("1041", this.p.getText().toString()).a("1029", "1").a("1040", this.q.getText().toString()).a("1396", this.au).a("1515", this.av);
      }
    }
    label250:
    while ((this.am != 2) && (this.am != 3) && (this.am != 5) && (this.am != 4)) {
      for (;;)
      {
        this.aw = ((com.android.dazhihui.ui.delegate.b.h)localObject);
        this.aM = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(((com.android.dazhihui.ui.delegate.b.h)localObject).h()) });
        registRequestListener(this.aM);
        a(this.aM, true);
        return;
        if (this.am == 1)
        {
          localObject = "1";
          continue;
          localObject = this.az;
        }
      }
    }
    localObject = "";
    if (this.am == 2)
    {
      localObject = "1";
      label305:
      localh = com.android.dazhihui.ui.delegate.b.o.g("12026").a("1026", (String)localObject).a("1021", this.at).a("1019", this.as);
      if (this.az != null) {
        break label465;
      }
    }
    label465:
    for (localObject = "0";; localObject = this.az)
    {
      localObject = localh.a("1003", (String)localObject).a("1036", this.an).a("1041", this.p.getText().toString()).a("1040", this.q.getText().toString()).a("1396", this.au).a("1515", this.av);
      break;
      if (this.am == 3)
      {
        localObject = "2";
        break label305;
      }
      if (this.am == 5)
      {
        localObject = "3";
        break label305;
      }
      if (this.am != 4) {
        break label305;
      }
      localObject = "4";
      break label305;
    }
  }
  
  public void f()
  {
    this.d = 1;
    if (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    this.aw.a("1396", this.au).a("1515", this.av);
    this.aM = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(this.aw.h()) });
    registRequestListener(this.aM);
    a(this.aM, true);
  }
  
  public void g()
  {
    if (this.z != null) {
      this.z.a();
    }
    b(true);
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    if (paramj == null) {}
    Object localObject1;
    Object localObject3;
    label256:
    label279:
    label333:
    int i1;
    int i2;
    int i3;
    Object localObject2;
    Object localObject4;
    label1837:
    label1920:
    label2082:
    label2183:
    label2446:
    label2458:
    label2467:
    label2476:
    label2785:
    label2830:
    label2832:
    label2933:
    label3003:
    label3071:
    label3080:
    for (;;)
    {
      return;
      if ((paramj instanceof com.android.dazhihui.a.b.o))
      {
        localObject1 = ((com.android.dazhihui.a.b.o)paramj).h();
        if (localObject1 != null)
        {
          if (((p)localObject1).a != 2939) {
            break label333;
          }
          localObject1 = ((p)localObject1).b;
          if ((localObject1 != null) && (localObject1.length > 0))
          {
            localObject1 = new q((byte[])localObject1);
            this.ax = ((q)localObject1).l();
            this.ay = ((q)localObject1).l();
            this.aI = ((q)localObject1).b();
            this.ap = ((q)localObject1).b();
            ((q)localObject1).e();
            this.aq = ((q)localObject1).h();
            ((q)localObject1).h();
            ((q)localObject1).h();
            this.h.setText(this.ay);
            this.aA = true;
            if ((this.am != 0) && (this.am != 2) && (this.am != 4)) {
              break label279;
            }
            if (this.ap != 3) {
              break label256;
            }
            this.v.setBackgroundResource(2130839070);
            this.w.setBackgroundResource(2130839058);
          }
        }
      }
      String str2;
      for (;;)
      {
        if (paramh == this.aK)
        {
          localObject1 = ((v)paramj).b();
          if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, getActivity()))
          {
            localObject3 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
            if (!((com.android.dazhihui.ui.delegate.b.h)localObject3).b())
            {
              paramh = Toast.makeText(getActivity(), ((com.android.dazhihui.ui.delegate.b.h)localObject3).d(), 0);
              paramh.setGravity(17, 0, 0);
              paramh.show();
              return;
              this.v.setBackgroundResource(2130839069);
              this.w.setBackgroundResource(2130839057);
              continue;
              if (this.ap == 3)
              {
                this.v.setBackgroundResource(2130839060);
                this.w.setBackgroundResource(2130839048);
                continue;
              }
              this.v.setBackgroundResource(2130839059);
              this.w.setBackgroundResource(2130839047);
              continue;
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
              localObject2 = new String[i3];
              localObject3 = new String[i3];
              localObject4 = new int[i3];
              i1 = 0;
              if (i1 < i3)
              {
                i4 = ((q)localObject1).h();
                int i5 = ((q)localObject1).h();
                localObject2[i1] = a(i4, this.ap);
                localObject3[i1] = (i5 + "");
                if (i4 > this.aq) {
                  localObject4[i1] = -65536;
                }
                for (;;)
                {
                  i1 += 1;
                  break;
                  if (i4 == this.aq) {
                    localObject4[i1] = -7829368;
                  } else if (isAdded()) {
                    localObject4[i1] = getResources().getColor(2131493100);
                  }
                }
              }
              if (this.an == null) {
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
                  this.E.setText(localObject2[(i3 / 2 - 1 - i1)]);
                  this.O.setText(localObject3[(i3 / 2 - 1 - i1)]);
                  this.E.setTextColor(localObject4[(i3 / 2 - 1 - i1)]);
                  this.J.setText(localObject2[(i3 / 2 + i1)]);
                  this.T.setText(localObject3[(i3 / 2 + i1)]);
                  this.J.setTextColor(localObject4[(i3 / 2 + i1)]);
                  continue;
                  this.D.setText(localObject2[(i3 / 2 - 1 - i1)]);
                  this.N.setText(localObject3[(i3 / 2 - 1 - i1)]);
                  this.D.setTextColor(localObject4[(i3 / 2 - 1 - i1)]);
                  this.I.setText(localObject2[(i3 / 2 + i1)]);
                  this.S.setText(localObject3[(i3 / 2 + i1)]);
                  this.I.setTextColor(localObject4[(i3 / 2 + i1)]);
                  continue;
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
                }
              }
              this.ao = a(i2, this.ap);
              if (this.aD != null)
              {
                this.p.setText(this.aD);
                this.aD = null;
                this.ar = false;
              }
              if (!this.ar) {
                break;
              }
              if ((this.am == 1) || (this.am == 5))
              {
                if ((this.J.getText().toString().equals("--")) && (this.ao.equals("--")))
                {
                  localObject2 = a(this.aq, this.ap);
                  localObject3 = this.p;
                  localObject1 = localObject2;
                  if (((String)localObject2).equals("--")) {
                    localObject1 = "";
                  }
                  ((EditText)localObject3).setText((CharSequence)localObject1);
                }
                for (;;)
                {
                  this.ar = false;
                  break;
                  if (this.J.getText().toString().equals("--"))
                  {
                    localObject2 = this.p;
                    if (this.ao.equals("--")) {}
                    for (localObject1 = "";; localObject1 = this.ao)
                    {
                      ((EditText)localObject2).setText((CharSequence)localObject1);
                      break;
                    }
                  }
                  localObject2 = this.J.getText().toString();
                  localObject3 = this.p;
                  localObject1 = localObject2;
                  if (((String)localObject2).equals("--")) {
                    localObject1 = "";
                  }
                  ((EditText)localObject3).setText((CharSequence)localObject1);
                }
              }
              if ((this.E.getText().toString().equals("--")) && (this.ao.equals("--")))
              {
                localObject2 = a(this.aq, this.ap);
                localObject3 = this.p;
                if (((String)localObject2).equals("--")) {}
                for (localObject1 = "";; localObject1 = localObject2)
                {
                  ((EditText)localObject3).setText((CharSequence)localObject1);
                  System.out.println("买入价格1" + (String)localObject2);
                  break;
                }
              }
              if (this.E.getText().toString().equals("--"))
              {
                localObject2 = this.p;
                if (this.ao.equals("--")) {}
                for (localObject1 = "";; localObject1 = this.ao)
                {
                  ((EditText)localObject2).setText((CharSequence)localObject1);
                  System.out.println("买入价格2" + this.ao);
                  break;
                }
              }
              localObject2 = this.E.getText().toString();
              localObject3 = this.p;
              if (((String)localObject2).equals("--")) {}
              for (localObject1 = "";; localObject1 = localObject2)
              {
                ((EditText)localObject3).setText((CharSequence)localObject1);
                System.out.println("买入价格3" + (String)localObject2);
                break;
              }
            }
            if (((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "1036").equals("")) {
              break;
            }
            localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "1037");
            if (localObject1 != null) {
              this.h.setText((CharSequence)localObject1);
            }
            this.az = ((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "1021");
            this.at = ((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "1021");
            if (com.android.dazhihui.ui.delegate.b.o.z != null)
            {
              i1 = com.android.dazhihui.ui.delegate.b.o.z.length - 1;
              if (i1 >= 0)
              {
                if (!com.android.dazhihui.ui.delegate.b.o.z[i1][0].equals(this.at)) {
                  break label2458;
                }
                localObject1 = com.android.dazhihui.ui.delegate.b.o.z[i1][2];
                if ((localObject1 == null) || (!((String)localObject1).equals("1"))) {
                  break label2446;
                }
                this.as = com.android.dazhihui.ui.delegate.b.o.z[i1][1];
              }
            }
            if (this.aC != null) {
              this.as = this.aC;
            }
            localObject1 = this.e.getDataList();
            i1 = 0;
            if (i1 < ((ArrayList)localObject1).size())
            {
              if (!((String)((ArrayList)localObject1).get(i1)).contains(this.as)) {
                break label2467;
              }
              this.e.a(this.e.getDataList(), i1, true);
            }
            localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "1178");
            localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "1181");
            localObject4 = ((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "1172");
            String str1 = ((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "1173");
            str2 = ((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "1156");
            localObject3 = ((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "1167");
            this.m.setText((CharSequence)localObject4);
            this.l.setText(str1);
            if (this.aD != null)
            {
              this.p.setText(this.aD);
              this.aD = null;
              this.ar = false;
            }
            if (this.ar) {
              break label2476;
            }
            this.ar = false;
            a(false);
            this.al.c = 0;
            this.al.d = true;
          }
        }
      }
      if (paramh == this.aL)
      {
        localObject1 = ((v)paramj).b();
        if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, getActivity()))
        {
          localObject1 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
          if ((!((com.android.dazhihui.ui.delegate.b.h)localObject1).b()) || (((com.android.dazhihui.ui.delegate.b.h)localObject1).g() == 0)) {
            continue;
          }
          if ((this.am != 0) && (this.am != 1)) {
            break label2785;
          }
          this.aE = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1061");
          if (this.aE == null) {
            break label2830;
          }
          this.r.setVisibility(0);
          this.aF.a(Integer.valueOf(this.aE).intValue());
          if ((this.am != 1) && (this.am != 3) && (this.am != 5)) {
            break label2832;
          }
          this.r.setText("可卖" + this.aE + "股");
        }
      }
      for (;;)
      {
        if ((this.am == 5) || (this.am == 4))
        {
          localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1463");
          localObject3 = this.o;
          localObject1 = localObject2;
          if (localObject2 == null) {
            localObject1 = "--";
          }
          ((TextView)localObject3).setText((CharSequence)localObject1);
        }
        if (paramh != this.aM) {
          break label3003;
        }
        localObject1 = ((v)paramj).b();
        if (!com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, getActivity())) {
          break label3003;
        }
        this.d = -1;
        localObject1 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
        if (!((com.android.dazhihui.ui.delegate.b.h)localObject1).b()) {
          break label3071;
        }
        localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1208");
        if (localObject2 == null) {
          break label2933;
        }
        new AlertDialog.Builder(getActivity()).setTitle("提示信息").setMessage((CharSequence)localObject2).setPositiveButton("确定", new ae(this)).setNegativeButton("取消", new ad(this)).setCancelable(false).show();
        return;
        this.as = com.android.dazhihui.ui.delegate.b.o.z[i1][1];
        i1 -= 1;
        break label1837;
        i1 += 1;
        break label1920;
        if ((this.am == 1) || (this.am == 5))
        {
          if (((str2 == null) || (str2.equals("")) || (Float.parseFloat(str2) == 0.0F)) && ((localObject2 == null) || (((String)localObject2).equals("")) || (Float.parseFloat((String)localObject2) == 0.0F)))
          {
            localObject3 = this.p;
            localObject2 = localObject1;
            if (localObject1 == null) {
              localObject2 = "";
            }
            ((EditText)localObject3).setText((CharSequence)localObject2);
            break label2082;
          }
          if ((str2 == null) || (str2.equals("")) || (Float.parseFloat(str2) == 0.0F))
          {
            localObject3 = this.p;
            if (localObject2 == null) {}
            for (localObject1 = "";; localObject1 = localObject2)
            {
              ((EditText)localObject3).setText((CharSequence)localObject1);
              break;
            }
          }
          this.p.setText(str2);
          break label2082;
        }
        if (((localObject3 == null) || (((String)localObject3).equals("")) || (Float.parseFloat((String)localObject3) == 0.0F)) && ((localObject2 == null) || (((String)localObject2).equals("")) || (Float.parseFloat((String)localObject2) == 0.0F)))
        {
          localObject3 = this.p;
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = "";
          }
          ((EditText)localObject3).setText((CharSequence)localObject2);
          break label2082;
        }
        if ((localObject3 == null) || (((String)localObject3).equals("")) || (Float.parseFloat((String)localObject3) == 0.0F))
        {
          localObject3 = this.p;
          localObject1 = localObject2;
          if (localObject2 == null) {
            localObject1 = "";
          }
          ((EditText)localObject3).setText((CharSequence)localObject1);
          break label2082;
        }
        this.p.setText((CharSequence)localObject3);
        break label2082;
        if ((this.am != 2) && (this.am != 3) && (this.am != 5) && (this.am != 4)) {
          break label2183;
        }
        this.aE = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1462");
        break label2183;
        break;
        if ((this.am == 0) || (this.am == 4)) {
          this.r.setText("可买" + this.aE + "股");
        } else if (this.am == 2) {
          this.r.setText("可融" + this.aE + "股");
        }
      }
      localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1042");
      new AlertDialog.Builder(getActivity()).setMessage("　　委托请求提交成功。合同号为：" + (String)localObject1).setPositiveButton("确定", new af(this)).setCancelable(false).show();
      this.aw = null;
      for (;;)
      {
        if (paramh != this.aN) {
          break label3080;
        }
        paramh = ((v)paramj).b();
        if (!com.android.dazhihui.ui.delegate.b.u.a(paramh, getActivity())) {
          break;
        }
        localObject1 = com.android.dazhihui.ui.delegate.b.h.b(paramh.e());
        if (((com.android.dazhihui.ui.delegate.b.h)localObject1).b()) {
          break label3082;
        }
        paramh = Toast.makeText(getActivity(), ((com.android.dazhihui.ui.delegate.b.h)localObject1).d(), 0);
        paramh.setGravity(17, 0, 0);
        paramh.show();
        return;
        a(((com.android.dazhihui.ui.delegate.b.h)localObject1).d());
      }
    }
    label3082:
    ((com.android.dazhihui.ui.delegate.b.h)localObject1).g();
    ((com.android.dazhihui.ui.delegate.b.h)localObject1).b("1289");
    int i4 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).g();
    if ((i4 == 0) && (this.z.getDataModel().size() == 0))
    {
      this.z.setBackgroundResource(2130838490);
      if ((this.aB != null) && (this.aB.length() == 6))
      {
        this.g.setText(this.aB);
        return;
      }
      a(true);
      return;
    }
    if (isAdded()) {
      this.z.setBackgroundColor(getResources().getColor(2131493677));
    }
    if (i4 > 0)
    {
      this.aJ = -1;
      localObject2 = new ArrayList();
      i2 = 0;
      while (i2 < i4)
      {
        localObject3 = new mh();
        paramh = new String[this.ag.length];
        localObject4 = new int[this.ag.length];
        i3 = 0;
        for (;;)
        {
          if (i3 >= this.ag.length) {
            break label3434;
          }
          try
          {
            paramh[i3] = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i2, this.ah[i3]).trim();
            if (paramh[i3] == null) {
              paramh[i3] = "--";
            }
          }
          catch (Exception paramj)
          {
            for (;;)
            {
              paramh[i3] = "--";
              continue;
              if ((paramj != null) && (Double.parseDouble(paramj) < 0.0D))
              {
                if (isAdded()) {
                  i1 = getResources().getColor(2131492932);
                }
              }
              else {
                i1 = -16777216;
              }
            }
          }
          if (this.ah[i3].equals("1065")) {
            this.aJ = i3;
          }
          i1 = 0;
          paramj = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i2, "1064");
          if ((paramj == null) || (Double.parseDouble(paramj) <= 0.0D)) {
            break;
          }
          i1 = -65536;
          paramh[i3] = com.android.dazhihui.ui.delegate.b.o.c(this.ah[i3], paramh[i3]);
          localObject4[i3] = i1;
          i3 += 1;
        }
        label3434:
        paramj = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i2, "1036");
        ((mh)localObject3).a = paramh;
        ((mh)localObject3).b = ((int[])localObject4);
        paramh = paramj;
        if (paramj == null) {
          paramh = "";
        }
        ((mh)localObject3).d = paramh;
        ((List)localObject2).add(localObject3);
        i2 += 1;
      }
      if (this.aJ != -1) {
        Collections.sort((List)localObject2, this.c);
      }
      this.z.a((List)localObject2, 0);
    }
    if ((this.aB != null) && (this.aB.length() == 6))
    {
      this.g.setText(this.aB);
      return;
    }
    a(true);
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    m().dismiss();
    switch (this.d)
    {
    }
    for (;;)
    {
      this.d = -1;
      return;
      c("请求超时，请查看委托查询，确认是否成功提交 。");
    }
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    m().dismiss();
    switch (this.d)
    {
    }
    for (;;)
    {
      this.d = -1;
      return;
      c("请求超时，请查看委托查询，确认是否成功提交 。");
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.aH = paramLayoutInflater.inflate(2130903475, paramViewGroup, false);
    i();
    l();
    k();
    h();
    b(true);
    return this.aH;
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.aO = true;
  }
  
  public void show()
  {
    if (this.z != null)
    {
      this.z.a();
      b(true);
    }
    if ((this.am == 0) || (this.am == 1)) {
      if ((this.g != null) && (((MarginCommonScreen)getActivity()).b != null))
      {
        this.aB = ((MarginCommonScreen)getActivity()).b;
        this.aC = ((MarginCommonScreen)getActivity()).c;
        this.aD = ((MarginCommonScreen)getActivity()).d;
        ((MarginCommonScreen)getActivity()).b = null;
        ((MarginCommonScreen)getActivity()).c = null;
        ((MarginCommonScreen)getActivity()).d = null;
      }
    }
    while (((this.am != 2) && (this.am != 3)) || (this.g == null) || (((MarginCommonScreen2)getActivity()).b == null)) {
      return;
    }
    this.aB = ((MarginCommonScreen2)getActivity()).b;
    this.aC = ((MarginCommonScreen2)getActivity()).c;
    this.aD = ((MarginCommonScreen2)getActivity()).d;
    ((MarginCommonScreen2)getActivity()).b = null;
    ((MarginCommonScreen2)getActivity()).c = null;
    ((MarginCommonScreen2)getActivity()).d = null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */