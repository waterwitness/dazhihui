package com.android.dazhihui.ui.delegate.screen.hk;

import android.app.AlertDialog.Builder;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.android.dazhihui.b.b;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.delegate.domain.HKMarketInfo;
import com.android.dazhihui.ui.delegate.screen.ad;
import com.android.dazhihui.ui.delegate.screen.ggt.CustomTextView;
import com.android.dazhihui.ui.widget.gr;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class HKEntrust
  extends ad
{
  public static final Comparator<String[]> c = new ao();
  private LinearLayout A;
  private CustomTextView B;
  private CustomTextView C;
  private CustomTextView D;
  private CustomTextView E;
  private ImageView F;
  private ListView G;
  private ax H;
  private RelativeLayout I;
  private Vector<String[]> J;
  private Vector<String[]> K;
  private Vector<Integer> L;
  private int M = 0;
  private String N = "";
  private String O;
  private String P = "0";
  private String Q = "0";
  private String R = "";
  private String S = "";
  private String T = "";
  private int U = 0;
  private String V = "";
  private String W = "";
  private String X = "";
  private boolean Y = true;
  private boolean Z = false;
  private com.android.dazhihui.a.b.u aA;
  private int aB = 0;
  private int aC = 0;
  private float aD = 0.0F;
  private float aE = 0.0F;
  private float aF = 0.0F;
  private String aG = "0";
  private String aH = null;
  private Handler aI = new am(this);
  private Handler aJ = new an(this);
  private String aa;
  private String ab;
  private String ac = null;
  private int ad = 0;
  private ArrayList<HKMarketInfo> ae = null;
  private boolean af = true;
  private boolean ag = true;
  private boolean ah = true;
  private ImageView ai = null;
  private gr aj;
  private View ak;
  private int al = -1;
  private String am = null;
  private boolean an = true;
  private boolean ao = false;
  private String[] ap = { "1037", "1065", "1064", "1320", "1060", "1061", "1062", "1181", "1036", "1003" };
  private ba aq;
  private String ar = null;
  private View as;
  private com.android.dazhihui.a.b.u at = null;
  private com.android.dazhihui.a.b.u au = null;
  private com.android.dazhihui.a.b.u av;
  private com.android.dazhihui.a.b.u aw;
  private com.android.dazhihui.a.b.u ax = null;
  private com.android.dazhihui.a.b.u ay = null;
  private com.android.dazhihui.a.b.u az;
  private EditText d;
  private EditText e;
  private CustomTextView f;
  private DropDownTextView g;
  private EditText h;
  private EditText i;
  private EditText j;
  private ImageView k;
  private ImageView l;
  private TextView m;
  private TextView n;
  private ImageView o;
  private ImageView p;
  private TextView q;
  private Button r;
  private Button s;
  private TextView t;
  private TextView u;
  private TextView v;
  private TextView w;
  private TextView x;
  private TextView y;
  private LinearLayout z;
  
  private int a(String paramString1, String paramString2)
  {
    int i1 = -16744448;
    if (("--".equals(paramString1)) || ("--".equals(paramString2))) {
      i1 = -16777216;
    }
    do
    {
      float f1;
      do
      {
        return i1;
        f1 = bk.d(paramString1, paramString2).floatValue();
        if (f1 <= 0.0F) {
          break;
        }
        if (this.af) {
          return -65536;
        }
      } while (!isAdded());
      return getResources().getColor(2131493100);
      if (f1 >= 0.0F) {
        break label109;
      }
      if (!this.af) {
        break;
      }
    } while (!isAdded());
    return getResources().getColor(2131493100);
    return -65536;
    label109:
    return -16777216;
  }
  
  private String a(int paramInt, boolean paramBoolean)
  {
    if (this.h.getText().toString().length() == 0) {
      localObject = "";
    }
    int i1;
    String str;
    do
    {
      return (String)localObject;
      if (((this.ac == null) && (this.M == 0)) || (this.ad == 0) || (this.am == null)) {
        return "";
      }
      int i2 = this.ad;
      i1 = i2;
      if (paramBoolean)
      {
        i1 = i2;
        if (this.al == 2) {
          i1 = 1;
        }
      }
      if (this.M != 0) {
        break;
      }
      if (this.ac.length() == 0) {
        this.ac = "0";
      }
      str = bk.b(bk.b(bk.b(bk.b(this.ac, this.am).toString(), this.h.getText().toString()).toString(), String.valueOf(paramInt)).toString(), String.valueOf(i1)).toString();
      localObject = str;
      if (str.contains(".")) {
        localObject = str.substring(0, str.indexOf("."));
      }
      str = bk.a((String)localObject, String.valueOf(i1)).toString();
      localObject = str;
    } while (!str.contains("-"));
    return "0";
    Object localObject = this.ar;
    if ((localObject == null) || (((String)localObject).length() == 0)) {}
    for (paramInt = 0;; paramInt = i1 * (int)(Float.parseFloat((String)localObject) / paramInt / i1))
    {
      i1 = paramInt;
      if (paramInt < 0) {
        i1 = 0;
      }
      return String.valueOf(i1);
    }
  }
  
  private void a(boolean paramBoolean, String paramString1, String paramString2)
  {
    x[] arrayOfx = new x[2];
    arrayOfx[0] = new x(2939);
    arrayOfx[0].a(paramString1);
    arrayOfx[1] = new x(2939);
    arrayOfx[1].a(paramString2);
    paramString1 = new m(arrayOfx);
    registRequestListener(paramString1);
    a(paramString1, paramBoolean);
  }
  
  private void a(boolean paramBoolean1, boolean paramBoolean2, String paramString)
  {
    x[] arrayOfx;
    if (paramBoolean1)
    {
      arrayOfx = new x[2];
      arrayOfx[0] = new x(2939);
      arrayOfx[0].a(paramString);
      arrayOfx[1] = new x(2940);
      arrayOfx[1].a(paramString);
    }
    for (paramString = arrayOfx;; paramString = arrayOfx)
    {
      paramString = new m(paramString);
      registRequestListener(paramString);
      a(paramString, paramBoolean2);
      return;
      arrayOfx = new x[1];
      arrayOfx[0] = new x(2940);
      arrayOfx[0].a(paramString);
    }
  }
  
  private void b(boolean paramBoolean)
  {
    this.av = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("15064").a("5006", "0").h()) });
    registRequestListener(this.av);
    a(this.av, paramBoolean);
  }
  
  private void c(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      Toast.makeText(getActivity(), "请输入股票代码。", 0).show();
      return;
    case 1: 
      Toast.makeText(getActivity(), "请输入5位股票代码。", 0).show();
      return;
    case 2: 
      Toast.makeText(getActivity(), "没有股东账号，无法完成委托。", 0).show();
      return;
    case 3: 
      Toast.makeText(getActivity(), "委托价格必须大于0。", 0).show();
      return;
    case 4: 
      Toast.makeText(getActivity(), "委托数量必须大于0。", 0).show();
      return;
    case 5: 
      Toast.makeText(getActivity(), "请输入委托价格。", 0).show();
      return;
    }
    Toast.makeText(getActivity(), "请输入委托数量。", 0).show();
  }
  
  private void d(int paramInt)
  {
    label6:
    String str;
    int i1;
    if (bk.j == null)
    {
      return;
    }
    else
    {
      do
      {
        this.P = "0";
      } while ((this.aG == null) || ("0".equals(this.aG)) || ("--".equals(this.aG)));
      str = this.aG;
      i1 = 0;
      label53:
      if (i1 >= bk.j.length) {
        break label588;
      }
      if ((bk.d(str, bk.j[i1][0]).doubleValue() <= 0.0D) || (bk.d(str, bk.j[i1][1]).doubleValue() >= 0.0D)) {}
    }
    label494:
    label588:
    for (Object localObject1 = bk.j[i1][2];; localObject1 = "0")
    {
      if (!((String)localObject1).equals("0"))
      {
        this.P = ((String)localObject1);
        this.Q = this.P;
        return;
        i1 += 1;
        break label53;
      }
      int i2 = 0;
      int i3 = 0;
      Object localObject3 = "";
      Object localObject2 = "";
      i1 = 0;
      while (i1 < bk.j.length)
      {
        Object localObject4 = localObject3;
        if (i1 == 0)
        {
          localObject4 = bk.j[i1][0];
          localObject2 = bk.j[i1][1];
        }
        localObject3 = localObject4;
        if (bk.d((String)localObject4, bk.j[i1][0]).doubleValue() > 0.0D)
        {
          localObject3 = bk.j[i1][0];
          i3 = i1;
        }
        localObject4 = localObject2;
        if (bk.d((String)localObject2, bk.j[i1][1]).doubleValue() < 0.0D)
        {
          localObject4 = bk.j[i1][1];
          i2 = i1;
        }
        i1 += 1;
        localObject2 = localObject4;
      }
      if (bk.d(str, (String)localObject3).doubleValue() == 0.0D) {
        localObject1 = bk.j[i3][2];
      }
      while (!((String)localObject1).equals("0"))
      {
        this.P = ((String)localObject1);
        this.Q = this.P;
        return;
        if (bk.d(str, (String)localObject2).doubleValue() == 0.0D) {
          localObject1 = bk.j[i2][2];
        }
      }
      i2 = 0;
      int i4 = 0;
      i1 = 0;
      for (;;)
      {
        localObject2 = localObject1;
        if (i1 < bk.j.length)
        {
          i3 = i4;
          if (bk.d(str, bk.j[i1][0]).doubleValue() < 0.0D) {
            break label494;
          }
          i3 = i4;
          if (bk.d(str, bk.j[i1][1]).doubleValue() >= 0.0D) {
            break label494;
          }
          if ((paramInt == 0) || (paramInt == 1))
          {
            localObject2 = bk.j[i1][2];
            this.P = ((String)localObject2);
          }
        }
        else
        {
          if (((String)localObject2).equals("0")) {
            break label6;
          }
          this.Q = ((String)localObject2);
          this.P = ((String)localObject2);
          return;
        }
        this.P = bk.j[i1][2];
        i3 = 1;
        localObject2 = localObject1;
        if (i2 != 0) {
          break;
        }
        i4 = i2;
        localObject2 = localObject1;
        if (bk.d(str, bk.j[i1][0]).doubleValue() > 0.0D)
        {
          i4 = i2;
          localObject2 = localObject1;
          if (bk.d(str, bk.j[i1][1]).doubleValue() <= 0.0D)
          {
            localObject1 = bk.j[i1][2];
            i4 = 1;
            localObject2 = localObject1;
            if (i3 != 0) {
              break;
            }
            localObject2 = localObject1;
          }
        }
        i1 += 1;
        i2 = i4;
        i4 = i3;
        localObject1 = localObject2;
      }
    }
  }
  
  private void e(String paramString)
  {
    if (paramString == null) {}
    for (;;)
    {
      return;
      if (bk.k == null)
      {
        s();
        return;
      }
      this.ae = new ArrayList();
      int i1 = 0;
      while (i1 < bk.k.size())
      {
        if (paramString.equals(((HKMarketInfo)bk.k.get(i1)).getMarketId()))
        {
          this.ae.add(bk.k.get(i1));
          this.aa = paramString;
        }
        i1 += 1;
      }
    }
  }
  
  private void f()
  {
    this.as = this.as.findViewById(2131560783);
    this.ak = this.as.findViewById(2131560784);
    this.d = ((EditText)this.as.findViewById(2131560787));
    this.d.setEnabled(false);
    this.e = ((EditText)this.as.findViewById(2131559140));
    this.e.setTransformationMethod(new a());
    this.f = ((CustomTextView)this.as.findViewById(2131559141));
    this.g = ((DropDownTextView)this.as.findViewById(2131559142));
    g();
    this.h = ((EditText)this.as.findViewById(2131559145));
    this.i = ((EditText)this.as.findViewById(2131560789));
    this.j = ((EditText)this.as.findViewById(2131559151));
    this.k = ((ImageView)this.as.findViewById(2131559144));
    this.l = ((ImageView)this.as.findViewById(2131559146));
    this.o = ((ImageView)this.as.findViewById(2131559150));
    this.p = ((ImageView)this.as.findViewById(2131559152));
    this.q = ((TextView)this.as.findViewById(2131559102));
    this.y = ((TextView)this.as.findViewById(2131560782));
    this.r = ((Button)this.as.findViewById(2131559153));
    this.s = ((Button)this.as.findViewById(2131559154));
    this.n = ((TextView)this.as.findViewById(2131560791));
    this.m = ((TextView)this.as.findViewById(2131560792));
    this.u = ((TextView)this.as.findViewById(2131560794));
    this.t = ((TextView)this.as.findViewById(2131560793));
    this.v = ((TextView)this.as.findViewById(2131559157));
    this.w = ((TextView)this.as.findViewById(2131559158));
    this.x = ((TextView)this.as.findViewById(2131559159));
    this.B = ((CustomTextView)this.as.findViewById(2131559162));
    this.C = ((CustomTextView)this.as.findViewById(2131559163));
    this.D = ((CustomTextView)this.as.findViewById(2131559160));
    this.E = ((CustomTextView)this.as.findViewById(2131559161));
    this.ai = ((ImageView)this.as.findViewById(2131560786));
    this.z = ((LinearLayout)this.as.findViewById(2131560788));
    this.A = ((LinearLayout)this.as.findViewById(2131560790));
    this.G = ((ListView)this.as.findViewById(2131560795));
    this.F = ((ImageView)this.as.findViewById(2131558778));
    this.I = ((RelativeLayout)this.as.findViewById(2131559060));
  }
  
  private void f(String paramString)
  {
    if (bk.g(paramString))
    {
      this.al = 2;
      this.am = bk.a("USD");
      this.ad = 100;
      this.aq.d = false;
      this.u.setText(this.ad + "");
      this.u.setVisibility(0);
      this.t.setText(this.ad + "");
      this.t.setVisibility(0);
      switch (this.al)
      {
      default: 
        label140:
        this.aa = bk.b(paramString);
        e(this.aa);
        if ((this.ae != null) && (this.ae.size() != 0)) {
          break label408;
        }
        if (paramString.startsWith("90"))
        {
          e("SHB");
          if ((this.ae == null) || (this.ae.size() == 0)) {
            e("SH");
          }
        }
        break;
      }
    }
    for (;;)
    {
      if ((this.ae != null) && (this.ae.size() != 0)) {
        break label395;
      }
      this.z.setVisibility(8);
      return;
      if (paramString.length() == 5)
      {
        this.al = 1;
        this.am = "1";
        this.aq.d = false;
        break;
      }
      this.al = 3;
      this.am = bk.a("CNY");
      this.ad = 100;
      this.aq.d = true;
      this.aq.c = 0;
      break;
      this.y.setText("港币");
      break label140;
      this.y.setText("人民币");
      break label140;
      this.y.setText("美元");
      break label140;
      if (paramString.startsWith("20"))
      {
        e("SZB");
        if ((this.ae == null) || (this.ae.size() == 0)) {
          e("SZ");
        }
      }
    }
    label395:
    this.z.setVisibility(0);
    k();
    return;
    label408:
    this.z.setVisibility(0);
    k();
  }
  
  private void g()
  {
    Object localObject = this.g.getDropDownMainView();
    ((View)localObject).setBackgroundResource(2130837697);
    ((View)localObject).setPadding(2, 0, 2, 2);
    localObject = this.g.getMainView();
    ((View)localObject).setBackgroundDrawable(null);
    ((View)localObject).setPadding(0, 0, 0, 0);
    this.g.getTextView().setGravity(19);
    localObject = this.g.getLlCenter();
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)((LinearLayout)localObject).getLayoutParams();
    localLayoutParams.width = -1;
    ((LinearLayout)localObject).setLayoutParams(localLayoutParams);
    ((LinearLayout)localObject).setGravity(19);
  }
  
  private void h()
  {
    l();
    o();
    if (bk.k != null) {
      e("");
    }
    this.aa = "";
  }
  
  private void i()
  {
    if (com.android.dazhihui.ui.delegate.b.o.z != null) {
      this.d.setText(com.android.dazhihui.ui.delegate.b.o.z[0][1]);
    }
    Object localObject1 = getArguments();
    if (localObject1 == null) {
      return;
    }
    this.M = ((Bundle)localObject1).getInt("type");
    Object localObject2 = this.r;
    if (this.M == 0)
    {
      localObject1 = "买入";
      ((Button)localObject2).setText((CharSequence)localObject1);
      if (this.M != 0) {
        break label284;
      }
      localObject1 = "委托买入";
      label73:
      this.ab = ((String)localObject1);
      localObject2 = this.r;
      if (this.M != 0) {
        break label291;
      }
      localObject1 = "买入";
      label94:
      ((Button)localObject2).setText((CharSequence)localObject1);
      localObject2 = this.q;
      if (this.M != 0) {
        break label298;
      }
    }
    label284:
    label291:
    label298:
    for (localObject1 = "买入数量";; localObject1 = "卖出数量")
    {
      ((TextView)localObject2).setText((CharSequence)localObject1);
      this.aq = new ba(this);
      if (this.an)
      {
        this.aq.start();
        this.an = false;
      }
      this.L = new Vector();
      this.J = new Vector();
      this.K = new Vector();
      this.H = new ax(this, getActivity());
      this.G.setAdapter(this.H);
      this.G.setEmptyView(this.F);
      k();
      localObject1 = PreferenceManager.getDefaultSharedPreferences(getActivity());
      this.af = ((SharedPreferences)localObject1).getBoolean("HK_SETTING_QUOTE_COLOR", true);
      this.ag = ((SharedPreferences)localObject1).getBoolean("HK_SETTING_TRADE_CONFIRM", true);
      this.ah = ((SharedPreferences)localObject1).getBoolean("HK_SETTING_TRADE_COST", false);
      return;
      localObject1 = "卖出";
      break;
      localObject1 = "委托卖出";
      break label73;
      localObject1 = "卖出";
      break label94;
    }
  }
  
  private void k()
  {
    if (this.ae == null) {
      return;
    }
    ArrayList localArrayList = new ArrayList();
    int i1 = 0;
    int i3;
    for (int i2 = 0; i1 < this.ae.size(); i2 = i3)
    {
      localArrayList.add(((HKMarketInfo)this.ae.get(i1)).getOfferName());
      i3 = i2;
      if (this.al == 1)
      {
        i3 = i2;
        if ("增强限价盘".equals(((HKMarketInfo)this.ae.get(i1)).getOfferName())) {
          i3 = i1;
        }
      }
      i1 += 1;
    }
    this.g.a(localArrayList, i2);
    this.g.setCanDropDown(false);
    this.g.setCanDelItem(false);
  }
  
  private void l()
  {
    this.e.setText("");
  }
  
  private void n()
  {
    this.aj = new gr(this.as, getActivity(), this.j, this.ak);
  }
  
  private void o()
  {
    if (this.aj != null) {
      this.aj.a(0);
    }
    this.f.setText("");
    this.h.setText("");
    this.j.setText("");
    this.n.setText("");
    this.n.setVisibility(8);
    this.m.setText("");
    this.m.setVisibility(8);
    this.t.setText("");
    this.t.setVisibility(8);
    this.u.setText("");
    this.u.setVisibility(8);
    this.v.setText("");
    this.w.setText("");
    this.x.setText("");
    this.B.setText("");
    this.C.setText("");
    this.D.setText("");
    this.E.setText("");
    this.y.setText("");
    this.j.setHint("");
    this.O = null;
    this.R = "";
    this.S = "";
    this.Z = false;
    this.Y = true;
    this.aB = 0;
    this.aC = 0;
    this.aD = 0.0F;
    this.aE = 0.0F;
    this.aF = 0.0F;
    this.ad = 0;
    this.al = -1;
    this.am = null;
    this.aH = null;
    this.ar = null;
    this.aa = "";
    if (this.aq != null) {
      this.aq.d = false;
    }
    this.A.setVisibility(0);
    this.i.setVisibility(8);
    p();
  }
  
  private void p()
  {
    this.ae = new ArrayList();
    k();
  }
  
  private void q()
  {
    this.N = "";
  }
  
  private void r()
  {
    this.e.addTextChangedListener(new ai(this));
    this.h.addTextChangedListener(new ap(this));
    this.j.addTextChangedListener(new aq(this));
    this.j.setOnFocusChangeListener(new ar(this));
    this.j.setOnTouchListener(new as(this));
    this.aj.a(new at(this));
    this.g.setOnItemChangeListener(new au(this));
    this.ai.setOnClickListener(new av(this));
    az localaz = new az(this);
    this.k.setOnClickListener(localaz);
    this.l.setOnClickListener(localaz);
    this.o.setOnClickListener(localaz);
    this.p.setOnClickListener(localaz);
    this.s.setOnClickListener(localaz);
    this.r.setOnClickListener(localaz);
    this.G.setOnItemClickListener(new aw(this));
  }
  
  private void s()
  {
    this.aw = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("15048").h()) });
    registRequestListener(this.aw);
    sendRequest(this.aw);
  }
  
  private void t()
  {
    String str1;
    com.android.dazhihui.ui.delegate.b.h localh;
    if ((this.ae == null) || (this.ae.size() == 0) || (this.g.getSelectedItemPosition() < 0))
    {
      str1 = "E";
      localh = com.android.dazhihui.ui.delegate.b.o.g("15006");
      if (this.U != 0) {
        break label273;
      }
      str2 = "0";
      label48:
      localh = localh.a("1026", str2).a("1004", this.aa);
      if (this.X != null) {
        break label280;
      }
      str2 = this.e.getText().toString();
      label85:
      localh = localh.a("1036", str2);
      if (this.V != null) {
        break label288;
      }
      str2 = this.h.getText().toString();
      label111:
      localh = localh.a("1041", str2);
      if (this.W != null) {
        break label296;
      }
    }
    label273:
    label280:
    label288:
    label296:
    for (String str2 = this.j.getText().toString();; str2 = this.W)
    {
      localh = localh.a("1040", str2).a("1314", "N").a("1315", "N");
      str2 = str1;
      if (str1 == null) {
        str2 = "E";
      }
      this.aA = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.a("1316", str2).a("1317", "").a("5004", "0").h()) });
      registRequestListener(this.aA);
      a(this.aA, true);
      l();
      return;
      str1 = ((HKMarketInfo)this.ae.get(this.g.getSelectedItemPosition())).getOfferType();
      break;
      str2 = "1";
      break label48;
      str2 = this.X;
      break label85;
      str2 = this.V;
      break label111;
    }
  }
  
  private void u()
  {
    if ("".equals(this.e.getText().toString()))
    {
      c(0);
      return;
    }
    if ("".equals(this.j.getText().toString()))
    {
      c(6);
      return;
    }
    if (("".equals(this.h.getText().toString())) && (this.ae != null) && (this.ae.size() > 0) && (this.g.getSelectedItemPosition() >= 0) && (!"A".equals(((HKMarketInfo)this.ae.get(this.g.getSelectedItemPosition())).getOfferType())))
    {
      c(5);
      return;
    }
    if ("0".equals(this.h.getText().toString()))
    {
      c(3);
      return;
    }
    if ("0".equals(this.j.getText().toString()))
    {
      c(4);
      return;
    }
    this.V = this.h.getText().toString();
    this.W = this.j.getText().toString();
    this.X = this.e.getText().toString().toUpperCase();
    this.U = this.M;
    if (!this.ag)
    {
      t();
      return;
    }
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(getActivity());
    String str;
    label408:
    Object localObject2;
    if (this.M == 0)
    {
      str = "你确认买入吗？";
      localObject1 = "" + "证券代码:" + this.e.getText().toString().toUpperCase() + "\n";
      localObject1 = (String)localObject1 + "证券名称:" + this.f.getText().toString() + "\n";
      if ((this.ae == null) || (this.ae.size() <= 0) || (this.g.getSelectedItemPosition() < 0) || (!"A".equals(((HKMarketInfo)this.ae.get(this.g.getSelectedItemPosition())).getOfferType()))) {
        break label793;
      }
      localObject1 = (String)localObject1 + "交易币种:" + this.y.getText().toString() + "\n";
      localObject2 = (String)localObject1 + "委托数量:" + this.j.getText().toString() + "\n";
      localObject1 = localObject2;
      if (this.ah)
      {
        localObject1 = (String)localObject2 + "\n";
        localObject1 = (String)localObject1 + "---------------------------------\n\n";
        localObject1 = (String)localObject1 + "佣        金:" + this.aD + "\n";
        localObject1 = (String)localObject1 + "印  花  税:" + this.aE + "\n";
        localObject1 = (String)localObject1 + "其它费用:" + this.aF + "\n";
        localObject1 = (String)localObject1 + "（费用仅供参考，以实际成交回报为准）\n";
        localObject1 = (String)localObject1 + "\n---------------------------------\n";
        localObject1 = (String)localObject1 + "\n";
      }
      localObject2 = new StringBuilder().append((String)localObject1).append("\n是否确认");
      if (this.M != 0) {
        break label836;
      }
    }
    label793:
    label836:
    for (Object localObject1 = "买入";; localObject1 = "卖出")
    {
      localObject1 = (String)localObject1 + "？";
      localBuilder.setTitle(str).setMessage((CharSequence)localObject1).setPositiveButton("确定", new aj(this)).setNegativeButton("取消", null).show();
      return;
      str = "你确认卖出吗？";
      break;
      localObject1 = (String)localObject1 + "委托价格:" + this.h.getText().toString() + "\n";
      break label408;
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
  
  public void a(boolean paramBoolean)
  {
    this.at = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("15002").h()) });
    registRequestListener(this.at);
    a(this.at, true);
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.N = this.e.getText().toString().toUpperCase();
    String str;
    if (((bk.i(this.N)) && (this.N.length() >= 5)) || (bk.g(this.N)))
    {
      if (bk.j == null) {
        b(true);
      }
      str = bk.h(this.N) + this.N;
      if (!bk.g(this.N)) {
        break label223;
      }
      if (paramBoolean1) {
        break label171;
      }
      if (this.aH != null) {
        a(paramBoolean1, paramBoolean2, this.aH);
      }
    }
    else
    {
      return;
    }
    a(paramBoolean2, "NS" + this.N, "NY" + this.N);
    return;
    label171:
    a(paramBoolean2, "NS" + this.N, "NY" + this.N);
    return;
    label223:
    a(paramBoolean1, paramBoolean2, str);
  }
  
  public void b()
  {
    this.au = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("15050").h()) });
    registRequestListener(this.au);
    a(this.au, true);
  }
  
  public void c()
  {
    this.ax = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("15002").h()) });
    registRequestListener(this.ax);
    a(this.ax, false);
  }
  
  public void c(String paramString)
  {
    this.N = paramString;
    if ((!TextUtils.isEmpty(this.N)) && (this.e != null))
    {
      this.ao = true;
      this.e.setText(this.N);
      Selection.setSelection(this.e.getText(), this.e.getText().length());
    }
  }
  
  public void d()
  {
    this.ay = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("15004").h()) });
    registRequestListener(this.ay);
    a(this.ay, true);
  }
  
  public void d(String paramString)
  {
    this.O = paramString;
    if ((!TextUtils.isEmpty(this.O)) && (this.h != null)) {
      this.h.setText(this.O);
    }
  }
  
  public void e()
  {
    this.L.removeAllElements();
    this.J.removeAllElements();
    this.K.removeAllElements();
    this.H.notifyDataSetChanged();
    a(true);
    a(false, true);
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    if (paramj == null) {
      return;
    }
    if ((paramj instanceof com.android.dazhihui.a.b.o))
    {
      localObject1 = ((com.android.dazhihui.a.b.o)paramj).h();
      if (localObject1 != null)
      {
        if (((p)localObject1).a != 2939) {
          break label809;
        }
        localObject1 = ((p)localObject1).b;
        if ((localObject1 != null) && (localObject1.length != 0))
        {
          localObject1 = new q((byte[])localObject1);
          this.aH = ((q)localObject1).l();
          if (bk.g(this.N))
          {
            if ((!("NS" + this.N).equals(this.aH)) && (!("NY" + this.N).equals(this.aH)))
            {
              this.aH = null;
              return;
            }
            a(false, true);
          }
          localObject2 = ((q)localObject1).l();
          ((q)localObject1).b();
          this.aB = ((q)localObject1).b();
          ((q)localObject1).e();
          this.aC = ((q)localObject1).h();
          ((q)localObject1).h();
          ((q)localObject1).h();
          ((q)localObject1).h();
          ((q)localObject1).h();
          ((q)localObject1).b();
          this.ad = ((q)localObject1).h();
          this.f.setText((CharSequence)localObject2);
          this.u.setText(this.ad + "");
          this.u.setVisibility(0);
          this.t.setText(this.ad + "");
          this.t.setVisibility(0);
          if (!TextUtils.isEmpty(this.N)) {
            f(this.N);
          }
        }
      }
    }
    int i4;
    label406:
    label477:
    label713:
    label737:
    label761:
    label785:
    label809:
    do
    {
      do
      {
        if (paramh == this.ax)
        {
          localObject1 = ((v)paramj).b();
          if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, getActivity()))
          {
            localObject1 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
            if (!((com.android.dazhihui.ui.delegate.b.h)localObject1).b()) {
              break;
            }
            i4 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).g();
            i3 = 0;
            i1 = 0;
            i2 = i3;
            if (i1 < i4)
            {
              if (!this.N.equals(((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1036"))) {
                break label2001;
              }
              this.ar = n.t(((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1061"));
              if (this.ar.length() != 0) {
                break label1962;
              }
              this.ar = "0";
              this.j.setHint("");
              i2 = 1;
            }
            if (i2 == 0)
            {
              this.ar = "0";
              this.j.setHint("");
            }
          }
        }
        if (paramh == this.ay)
        {
          localObject1 = ((v)paramj).b();
          if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, getActivity()))
          {
            localObject1 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
            if (!((com.android.dazhihui.ui.delegate.b.h)localObject1).b()) {
              break;
            }
            this.ac = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1078");
            localObject2 = a(1, true);
            localObject1 = localObject2;
            if (TextUtils.isEmpty((CharSequence)localObject2)) {
              localObject1 = "0";
            }
            this.j.setHint("可买" + (String)localObject1 + "股");
          }
        }
        if (paramh != this.aw) {
          break label2093;
        }
        localObject1 = ((v)paramj).b();
        if (!com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, getActivity())) {
          break label2093;
        }
        localObject2 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
        if (!((com.android.dazhihui.ui.delegate.b.h)localObject2).b()) {
          break;
        }
        localObject3 = new ArrayList();
        i1 = 0;
        for (;;)
        {
          if (i1 >= ((com.android.dazhihui.ui.delegate.b.h)localObject2).g()) {
            break label2070;
          }
          localObject4 = new HKMarketInfo();
          if (((com.android.dazhihui.ui.delegate.b.h)localObject2).a(i1, "1004") != null) {
            break;
          }
          localObject1 = "";
          ((HKMarketInfo)localObject4).setMarketId((String)localObject1);
          if (((com.android.dazhihui.ui.delegate.b.h)localObject2).a(i1, "9030") != null) {
            break label2025;
          }
          localObject1 = "";
          ((HKMarketInfo)localObject4).setMarketName((String)localObject1);
          if (((com.android.dazhihui.ui.delegate.b.h)localObject2).a(i1, "9031") != null) {
            break label2040;
          }
          localObject1 = "";
          ((HKMarketInfo)localObject4).setOfferType((String)localObject1);
          if (((com.android.dazhihui.ui.delegate.b.h)localObject2).a(i1, "9032") != null) {
            break label2055;
          }
          localObject1 = "";
          ((HKMarketInfo)localObject4).setOfferName((String)localObject1);
          ((ArrayList)localObject3).add(localObject4);
          i1 += 1;
        }
      } while (((p)localObject1).a != 2940);
      localObject1 = ((p)localObject1).b;
    } while ((localObject1 == null) || (localObject1.length == 0));
    Object localObject2 = new q((byte[])localObject1);
    int i1 = ((q)localObject2).b();
    int i2 = ((q)localObject2).h();
    ((q)localObject2).h();
    ((q)localObject2).h();
    ((q)localObject2).h();
    ((q)localObject2).h();
    ((q)localObject2).h();
    ((q)localObject2).h();
    ((q)localObject2).h();
    ((q)localObject2).h();
    if (i1 == 1)
    {
      ((q)localObject2).h();
      ((q)localObject2).h();
      ((q)localObject2).h();
    }
    ((q)localObject2).e();
    int i3 = ((q)localObject2).e();
    if ((this.N == null) || (this.N.length() == 0))
    {
      o();
      return;
    }
    if ((this.al == 3) && (this.e.getText().toString().length() == 6))
    {
      this.aq.d = true;
      this.aq.c = 0;
    }
    Object localObject3 = new String[i3];
    Object localObject4 = new String[i3];
    int[] arrayOfInt = new int[i3];
    i1 = 0;
    if (i1 < i3)
    {
      i4 = ((q)localObject2).h();
      int i5 = ((q)localObject2).h();
      localObject3[i1] = a(i4, this.aB);
      if (i5 == 0)
      {
        localObject1 = "--";
        label1080:
        localObject4[i1] = localObject1;
        if (i4 <= this.aC) {
          break label1170;
        }
        if (!this.af) {
          break label1145;
        }
        arrayOfInt[i1] = -65536;
      }
      for (;;)
      {
        i1 += 1;
        break;
        localObject1 = i5 + "";
        break label1080;
        label1145:
        if (isAdded())
        {
          arrayOfInt[i1] = getResources().getColor(2131493100);
          continue;
          label1170:
          if (i4 == this.aC) {
            arrayOfInt[i1] = -7829368;
          } else if (this.af)
          {
            if (isAdded()) {
              arrayOfInt[i1] = getResources().getColor(2131493100);
            }
          }
          else {
            arrayOfInt[i1] = -65536;
          }
        }
      }
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
        this.D.setText(localObject3[(i3 / 2 - 1 - i1)]);
        this.E.setText(localObject4[(i3 / 2 - 1 - i1)]);
        this.D.setTextColor(arrayOfInt[(i3 / 2 - 1 - i1)]);
        this.B.setText(localObject3[(i3 / 2 + i1)]);
        this.C.setText(localObject4[(i3 / 2 + i1)]);
        this.B.setTextColor(arrayOfInt[(i3 / 2 + i1)]);
      }
    }
    this.aG = a(i2, this.aB);
    this.v.setText(this.aG);
    if (this.O != null)
    {
      this.h.setText(this.O);
      this.O = null;
      this.Z = true;
    }
    if (!this.Z)
    {
      if (this.M != 0) {
        break label1714;
      }
      if ((!"--".equals(this.D.getText().toString())) && (!"".equals(this.D.getText().toString()))) {
        break label1692;
      }
      if ("--".equals(this.aG)) {
        break label1680;
      }
      this.h.setText(this.aG);
    }
    for (;;)
    {
      localObject2 = a(this.aC, this.aB) + "";
      if ((this.aG != null) && (!"".equals(this.aG)) && (!"--".equals(this.aG)) && (localObject2 != null) && (!"".equals(localObject2)) && (!"--".equals(localObject2))) {
        break label1814;
      }
      this.w.setText("--");
      this.x.setText("--");
      this.aG = "0";
      label1626:
      this.v.setTextColor(a(this.aG, (String)localObject2));
      this.w.setTextColor(a(this.aG, (String)localObject2));
      this.x.setTextColor(a(this.aG, (String)localObject2));
      break;
      label1680:
      this.h.setText("");
      continue;
      label1692:
      this.h.setText(this.D.getText().toString());
      continue;
      label1714:
      if (("--".equals(this.B.getText().toString())) || ("".equals(this.B.getText().toString())))
      {
        if (!"--".equals(this.aG)) {
          this.h.setText(this.aG);
        } else {
          this.h.setText("");
        }
      }
      else {
        this.h.setText(this.B.getText().toString());
      }
    }
    label1814:
    localObject3 = bk.d(this.aG, (String)localObject2);
    if (Float.parseFloat(this.aG) > Float.parseFloat((String)localObject2)) {}
    for (Object localObject1 = "+";; localObject1 = "")
    {
      this.w.setText((String)localObject1 + ((BigDecimal)localObject3).toString());
      if (Float.parseFloat((String)localObject2) == 0.0F)
      {
        this.x.setText("--%");
        break label1626;
      }
      localObject3 = bk.b(((BigDecimal)localObject3).toString(), (String)localObject2);
      localObject4 = (DecimalFormat)DecimalFormat.getInstance();
      ((DecimalFormat)localObject4).applyPattern("##.##%");
      this.x.setText((String)localObject1 + ((DecimalFormat)localObject4).format(localObject3));
      break label1626;
      label1962:
      this.j.setHint("可卖" + this.ar + "股");
      break label477;
      label2001:
      i1 += 1;
      break label406;
      localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(i1, "1004");
      break label713;
      label2025:
      localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(i1, "9030");
      break label737;
      label2040:
      localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(i1, "9031");
      break label761;
      label2055:
      localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(i1, "9032");
      break label785;
      label2070:
      if (((ArrayList)localObject3).size() != 0)
      {
        bk.k = (ArrayList)localObject3;
        e("");
        k();
      }
      label2093:
      if (paramh == this.az)
      {
        localObject1 = ((v)paramj).b();
        if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, getActivity()))
        {
          localObject1 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
          if (!((com.android.dazhihui.ui.delegate.b.h)localObject1).b()) {
            break;
          }
          if ((((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1066") != null) && (((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1066").length() != 0)) {
            break label2403;
          }
          this.aD = 0.0F;
          label2172:
          if ((((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1070") != null) && (((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1070").length() != 0)) {
            break label2422;
          }
          this.aE = 0.0F;
          label2204:
          if ((((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1076") != null) && (((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1076").length() != 0)) {
            break label2441;
          }
        }
      }
      label2403:
      label2422:
      label2441:
      for (this.aF = 0.0F;; this.aF = Float.parseFloat(((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1076")))
      {
        u();
        if (paramh != this.av) {
          break label2499;
        }
        localObject1 = ((v)paramj).b();
        if (!com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, getActivity())) {
          break label2499;
        }
        localObject1 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
        if (!((com.android.dazhihui.ui.delegate.b.h)localObject1).b()) {
          break;
        }
        i2 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).g();
        bk.j = new String[i2][];
        i1 = 0;
        while (i1 < i2)
        {
          bk.j[i1] = new String[4];
          bk.j[i1][0] = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1175");
          bk.j[i1][1] = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1174");
          bk.j[i1][2] = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "5005");
          bk.j[i1][3] = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "5006");
          i1 += 1;
        }
        this.aD = Float.parseFloat(((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1066"));
        break label2172;
        this.aE = Float.parseFloat(((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1070"));
        break label2204;
      }
      if ((this.N != null) && (this.e.getText().toString().length() == 0))
      {
        this.ao = true;
        this.e.setText(this.N);
      }
      label2499:
      if (paramh == this.aA)
      {
        localObject1 = ((v)paramj).b();
        if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, getActivity()))
        {
          localObject1 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
          if (!((com.android.dazhihui.ui.delegate.b.h)localObject1).b())
          {
            b(((com.android.dazhihui.ui.delegate.b.h)localObject1).d());
            l();
            return;
          }
          localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1042");
          if (localObject2 != null) {
            break label2702;
          }
          localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1208");
          new AlertDialog.Builder(getActivity()).setTitle("提示").setMessage((CharSequence)localObject1).setPositiveButton("确定", new al(this)).setNegativeButton("取消", new ak(this)).show();
        }
      }
      while (paramh == this.au)
      {
        localObject1 = ((v)paramj).b();
        if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, getActivity()))
        {
          localObject1 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
          if (!((com.android.dazhihui.ui.delegate.b.h)localObject1).b())
          {
            b(((com.android.dazhihui.ui.delegate.b.h)localObject1).d());
            l();
            return;
            label2702:
            b("　　委托请求提交成功。合同号为：" + (String)localObject2);
            this.ac = null;
            l();
            e();
          }
          else
          {
            bk.a((com.android.dazhihui.ui.delegate.b.h)localObject1);
            if ((this.N != null) && (this.e.getText().toString().length() == 0))
            {
              this.ao = true;
              this.e.setText(this.N);
            }
          }
        }
      }
      if (paramh != this.at) {
        break;
      }
      paramh = ((v)paramj).b();
      if (!com.android.dazhihui.ui.delegate.b.u.a(paramh, getActivity())) {
        break;
      }
      paramj = com.android.dazhihui.ui.delegate.b.h.b(paramh.e());
      if (!paramj.b())
      {
        paramh = Toast.makeText(getActivity(), paramj.d(), 0);
        paramh.setGravity(17, 0, 0);
        paramh.show();
        return;
      }
      i3 = paramj.g();
      i1 = paramj.b("1289");
      this.H.a(i1);
      if (i3 == 0)
      {
        this.G.setBackgroundResource(2130838490);
        return;
      }
      if (isAdded()) {
        this.G.setBackgroundColor(getResources().getColor(2131493677));
      }
      if (this.H.a() != null) {
        this.G.removeFooterView(this.H.a());
      }
      if (i3 > 0)
      {
        i1 = 0;
        while (i1 < i3)
        {
          localObject1 = new String[this.ap.length];
          i2 = 0;
          if (i2 < this.ap.length)
          {
            if (paramj.a(i1, this.ap[i2]) == null) {}
            for (paramh = "";; paramh = paramj.a(i1, this.ap[i2]))
            {
              localObject1[i2] = paramh;
              i2 += 1;
              break;
            }
          }
          if (localObject1[1].length() == 0) {
            localObject1[1] = bk.c(localObject1[2], bk.a(localObject1[4], localObject1[6]).toString()).toString();
          }
          this.J.add(localObject1);
          this.K.add(localObject1);
          i1 += 1;
        }
        Collections.sort(this.J, c);
        i2 = 0;
        if (i2 < this.J.size())
        {
          paramj = ((String[])this.J.get(i2))[2];
          if (paramj != null)
          {
            paramh = paramj;
            if (!paramj.equals("--")) {}
          }
          else
          {
            paramh = "0";
          }
          double d1 = Double.parseDouble(paramh);
          i1 = -16777216;
          if (isAdded())
          {
            if (d1 != 0.0D) {
              break label3213;
            }
            i1 = -16777216;
          }
          for (;;)
          {
            this.L.add(new Integer(i1));
            i2 += 1;
            break;
            label3213:
            if (d1 > 0.0D) {
              i1 = -65536;
            } else {
              i1 = getResources().getColor(2131492932);
            }
          }
        }
      }
      this.H.notifyDataSetInvalidated();
      return;
    }
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    super.handleTimeout(paramh);
    if (getActivity() == b.a().f()) {
      a(1);
    }
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (getActivity() == b.a().f()) {
      a(9);
    }
  }
  
  public void onBackPressed()
  {
    super.onBackPressed();
    if ((this.aj != null) && (this.aj.d()))
    {
      this.aj.c();
      return;
    }
    getActivity().finish();
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.as = paramLayoutInflater.inflate(2130903491, paramViewGroup, false);
    f();
    n();
    h();
    i();
    r();
    if (bk.k == null) {
      s();
    }
    if ((bk.l == null) || (bk.l.size() == 0)) {
      b();
    }
    if (bk.j == null) {
      b(false);
    }
    for (;;)
    {
      a(true);
      return this.as;
      if ((this.N != null) && (this.N.length() > 0))
      {
        this.ao = true;
        this.e.setText(this.N);
        Selection.setSelection(this.e.getText(), this.e.getText().length());
      }
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.an = true;
  }
  
  public void show()
  {
    super.show();
    if (this.as != null)
    {
      h();
      if ((this.K != null) && (this.J != null) && (this.L != null) && (this.H != null)) {
        e();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\HKEntrust.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */