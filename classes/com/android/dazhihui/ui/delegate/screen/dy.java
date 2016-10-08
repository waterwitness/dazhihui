package com.android.dazhihui.ui.delegate.screen;

import android.annotation.SuppressLint;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.t;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.a.f;
import com.android.dazhihui.b.b;
import com.android.dazhihui.d.au;
import com.android.dazhihui.ui.a.e;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.c;
import com.android.dazhihui.ui.delegate.r;
import com.android.dazhihui.ui.delegate.screen.fund.FundAtone;
import com.android.dazhihui.ui.delegate.screen.fund.FundEntrust;
import com.android.dazhihui.ui.delegate.screen.fund.IFundEntrust;
import com.android.dazhihui.ui.delegate.screen.ggt.GgtEntrust;
import com.android.dazhihui.ui.delegate.screen.ggt.GgtQuiry;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinZhengRequestData;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengAccountSign;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengAccountSign.dataHaveBackListener;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse.Ans_Msg_Hdr;
import com.android.dazhihui.ui.delegate.screen.jinzheng.JinzhengResponse.Answer;
import com.android.dazhihui.ui.delegate.screen.margin.MarginCommonScreen;
import com.android.dazhihui.ui.delegate.screen.newstock.NewStockMainActivity;
import com.android.dazhihui.ui.delegate.screen.otc.OtcEntrust;
import com.android.dazhihui.ui.delegate.screen.xc.trade.TradeCommonStock;
import com.android.dazhihui.ui.delegate.screen.xc.trade.TradeQuery;
import com.android.dazhihui.ui.delegate.view.TradeHeader;
import com.android.dazhihui.ui.model.stock.LeftMenuVo;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.moneybox.FundHome;
import com.android.dazhihui.ui.screen.moneybox.FundRedemption;
import com.android.dazhihui.ui.screen.moneybox.FundSubscription;
import com.android.dazhihui.ui.screen.moneybox.ae;
import com.android.dazhihui.ui.screen.stock.MainScreen;
import com.android.dazhihui.ui.screen.stock.offlinecapital.OfflineCapitalDetailActivity;
import com.android.dazhihui.ui.screen.stock.offlinecapital.OfflineCapitalMine;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DropDownEditTextView;
import com.android.dazhihui.ui.widget.DropDownEditTextView2;
import com.android.dazhihui.ui.widget.adv.AdvertView;
import com.android.dazhihui.ui.widget.gn;
import com.c.a.k;
import com.kingdom.mt.jni.kdencode.KDEnCode;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import org.apache.http.HttpEntity;
import org.apache.http.entity.StringEntity;

@SuppressLint({"ValidFragment"})
public class dy
  extends com.android.dazhihui.ui.screen.a
  implements com.android.dazhihui.ui.a.g, r, JinzhengAccountSign.dataHaveBackListener
{
  private RelativeLayout A;
  private RelativeLayout B;
  private LinearLayout C;
  private LinearLayout D;
  private RelativeLayout E;
  private String F;
  private String G = "0";
  private View H;
  private View I;
  private TextView J;
  private TextView K;
  private ImageView L;
  private TextView M;
  private gn N;
  private AdvertView O;
  private AdvertView P;
  private AdvertView Q;
  private AdvertView R;
  private String S = "";
  private String T = "";
  private String U = "";
  private TradeHeader V;
  private boolean W;
  private Toast X;
  private JinzhengAccountSign Y;
  private String Z;
  String[] a = null;
  private int aA = 2;
  private PopupWindow aB;
  private String aC;
  private boolean aD = false;
  private boolean aE = false;
  private boolean aF = true;
  private byte[] aG;
  private String aH = "";
  private com.android.dazhihui.a.b.u aI = null;
  private String[] aJ;
  private String[] aK;
  private com.android.dazhihui.a.b.u aL = null;
  private String[] aM;
  private String[] aN;
  private Handler aO;
  private String aP;
  private String aa;
  private String ab;
  private int ac = -1;
  private Boolean ad = Boolean.valueOf(false);
  private boolean ae = false;
  private c af;
  private t ag;
  private SeekBar ah;
  private TextView ai;
  private Button aj;
  private TextView ak;
  private TextView al;
  private ImageView am;
  private LinearLayout an;
  private TextView ao;
  private ImageView ap;
  private LinearLayout aq;
  private TextView ar;
  private TextView as;
  private boolean at;
  private final int au = 180;
  private final int av = 5;
  private int aw = 365;
  private int ax = 1;
  private int ay = 0;
  private int az = 175;
  String[] b = null;
  private com.android.dazhihui.c.a.a c;
  private String d = "";
  private String e = "";
  private boolean f = false;
  private boolean g = false;
  private Button h;
  private int i;
  private TextView j;
  private ScrollView k;
  private DropDownEditTextView l;
  private EditText m;
  private DropDownEditTextView n;
  private RelativeLayout o;
  private RadioGroup p;
  private RadioButton q;
  private RadioButton r;
  private DropDownEditTextView s;
  private String t;
  private String u;
  private DropDownEditTextView2 v;
  private EditText w;
  private LinearLayout x;
  private TextView y;
  private View z;
  
  private void A()
  {
    if (this.h.getText().equals("打开委托")) {
      break label15;
    }
    label15:
    while (this.h.getText().equals("进入交易")) {
      return;
    }
    if ((!this.ad.booleanValue()) || (this.f)) {
      t();
    }
    if (this.ad.booleanValue())
    {
      this.K.setVisibility(0);
      if (this.f)
      {
        this.v.setEditable(true);
        label85:
        if (!o.a(this.n.getCurrentItem())) {
          break label813;
        }
        this.o.setVisibility(0);
        if ((!this.U.equals("1")) || (!this.S.equals(this.n.getCurrentItem()))) {
          break label383;
        }
        this.p.check(this.r.getId());
        e(this.n.getCurrentItem());
      }
    }
    label282:
    int i2;
    for (;;)
    {
      if ((!this.f) || (!this.g))
      {
        this.g = false;
        e.a().a(this.n.getCurrentItem(), false, this);
      }
      i1 = this.ac;
      if (i1 == -1) {
        break;
      }
      if ((!"1".equals(com.android.dazhihui.c.a.a.C[i1][4])) && (!o.n()) && (!o.l()) && (!o.m())) {
        break label853;
      }
      localObject1 = (RelativeLayout)this.z.findViewById(2131560889);
      localObject2 = (RelativeLayout)this.z.findViewById(2131560892);
      ((RelativeLayout)localObject1).setVisibility(8);
      ((RelativeLayout)localObject2).setVisibility(8);
      localObject1 = o.c(i1);
      i2 = localObject1.length;
      localObject2 = new ArrayList();
      this.b = new String[i2];
      i1 = 0;
      while (i1 < i2)
      {
        ((ArrayList)localObject2).add(localObject1[i1][0]);
        this.b[i1] = localObject1[i1][1];
        i1 += 1;
      }
      this.v.setEditable(false);
      break label85;
      this.K.setVisibility(8);
      this.v.setEditable(true);
      break label85;
      label383:
      if ((!this.U.equals("0")) || (!this.S.equals(this.n.getCurrentItem()))) {
        break label440;
      }
      this.p.check(this.q.getId());
      e(this.n.getCurrentItem());
    }
    label440:
    Object localObject1 = "0";
    Object localObject2 = localObject1;
    label467:
    label512:
    Object localObject3;
    if (com.android.dazhihui.c.a.a.E != null)
    {
      localObject2 = localObject1;
      if (com.android.dazhihui.c.a.a.E.length > 0)
      {
        localObject1 = "-1";
        i1 = 0;
        if (i1 < com.android.dazhihui.c.a.a.E.length)
        {
          if (!this.n.getCurrentItem().contains(com.android.dazhihui.c.a.a.E[i1][0])) {
            break label725;
          }
          if (com.android.dazhihui.c.a.a.E[i1].length >= 7) {
            break label712;
          }
          localObject2 = "0";
          localObject3 = localObject2;
          if (((String)localObject1).equals("-1")) {
            break label727;
          }
          localObject3 = localObject2;
          if (((String)localObject2).equals(localObject1)) {
            break label727;
          }
        }
        localObject2 = localObject1;
        if (((String)localObject1).equals("-1")) {
          localObject2 = "0";
        }
      }
    }
    if (this.aD) {
      localObject2 = "0";
    }
    for (int i1 = 1;; i1 = 0)
    {
      if (((this.p.getCheckedRadioButtonId() == this.q.getId()) && (((String)localObject2).equals("0"))) || ((this.p.getCheckedRadioButtonId() == this.r.getId()) && (((String)localObject2).equals("1")))) {}
      for (i2 = 1;; i2 = 0)
      {
        if (((String)localObject2).equals("0"))
        {
          this.p.check(this.q.getId());
          label641:
          if (i1 == 0) {
            break label794;
          }
          if (!((String)localObject2).equals("0")) {
            break label765;
          }
          this.q.setEnabled(true);
          this.r.setEnabled(false);
        }
        for (;;)
        {
          this.G = ((String)localObject2);
          if ((i2 == 0) || ((this.f) && (this.ad.booleanValue()))) {
            break;
          }
          e(this.n.getCurrentItem());
          break;
          label712:
          localObject2 = com.android.dazhihui.c.a.a.E[i1][6];
          break label512;
          label725:
          localObject3 = localObject1;
          label727:
          i1 += 1;
          localObject1 = localObject3;
          break label467;
          if (!((String)localObject2).equals("1")) {
            break label641;
          }
          this.p.check(this.r.getId());
          break label641;
          label765:
          if (((String)localObject2).equals("1"))
          {
            this.q.setEnabled(false);
            this.r.setEnabled(true);
            continue;
            label794:
            this.q.setEnabled(true);
            this.r.setEnabled(true);
          }
        }
        label813:
        this.o.setVisibility(8);
        if ((this.f) && (this.ad.booleanValue())) {
          break;
        }
        e(this.n.getCurrentItem());
        break;
        label853:
        localObject1 = (RelativeLayout)this.z.findViewById(2131560889);
        localObject2 = (RelativeLayout)this.z.findViewById(2131560892);
        ((RelativeLayout)localObject1).setVisibility(0);
        ((RelativeLayout)localObject2).setVisibility(0);
        break label282;
        this.l.a((ArrayList)localObject2, 0, true);
        this.l.setEditable(false);
        this.j.setOnClickListener(new ev(this));
        return;
      }
    }
  }
  
  private void B()
  {
    if (o.a(this.n.getCurrentItem()))
    {
      this.o.setVisibility(0);
      return;
    }
    this.o.setVisibility(8);
  }
  
  private void C()
  {
    Log.d("trade", "TradeLoginTab:send_D()");
    o.u();
    com.android.dazhihui.a.g.a().A();
    com.android.dazhihui.ui.delegate.b.u.a();
    this.aG = com.android.dazhihui.ui.delegate.b.u.b(16);
    com.android.dazhihui.ui.delegate.b.g localg = new com.android.dazhihui.ui.delegate.b.g();
    int i1 = 0;
    for (;;)
    {
      Object localObject;
      if (i1 < com.android.dazhihui.c.a.a.i.length)
      {
        if (com.android.dazhihui.c.a.a.i[i1][2].equals(this.n.getCurrentItem()))
        {
          localObject = com.android.dazhihui.c.a.a.i[i1][0];
          this.aH = com.android.dazhihui.c.a.a.i[i1][1];
          localg.a(com.android.dazhihui.ui.delegate.b.u.a(o.f(this.n.getCurrentItem()), 20));
          localg.g(0);
          localg.a(com.android.dazhihui.ui.delegate.b.u.a((String)localObject, 20));
          localg.a(this.aG);
          i1 = com.android.dazhihui.ui.delegate.b.u.h();
        }
      }
      else {
        for (;;)
        {
          try
          {
            localObject = com.android.dazhihui.ui.delegate.c.d.a(i1);
            i1 = 0;
            if (i1 < localObject.length)
            {
              if (localObject[i1] != 0) {
                break label234;
              }
              localObject[i1] = 1;
              break label234;
            }
            i1 = com.android.dazhihui.ui.delegate.c.d.a((byte[])localObject);
          }
          catch (Exception localException)
          {
            i1 = 2139062143;
            continue;
          }
          localg.g(i1);
          this.aI = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(13, localg.a()) });
          this.aI.a(this);
          com.android.dazhihui.a.g.a().a(this.aI);
          return;
          String str = "";
          break;
          label234:
          i1 += 1;
        }
      }
      i1 += 1;
    }
  }
  
  private void D()
  {
    if (o.z())
    {
      C();
      return;
    }
    this.aL = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(new com.android.dazhihui.ui.delegate.b.h("12010").a("1205", "13").a("1208", "0").h()) });
    registRequestListener(this.aL);
    sendRequest(this.aL);
    ((BaseActivity)getActivity()).getLoadingDialog().show();
  }
  
  private void a(EditText paramEditText)
  {
    if (Build.VERSION.SDK_INT <= 10)
    {
      paramEditText.setInputType(0);
      return;
    }
    getActivity().getWindow().setSoftInputMode(3);
    try
    {
      Method localMethod = EditText.class.getMethod("setSoftInputShownOnFocus", new Class[] { Boolean.TYPE });
      localMethod.setAccessible(true);
      localMethod.invoke(paramEditText, new Object[] { Boolean.valueOf(false) });
      return;
    }
    catch (Exception paramEditText)
    {
      paramEditText.printStackTrace();
    }
  }
  
  private boolean a(String paramString1, String paramString2)
  {
    boolean bool2 = false;
    ArrayList localArrayList = new ArrayList();
    String str1 = "";
    int i1 = 0;
    while (i1 < this.aK.length)
    {
      if (paramString2.equals(this.aK[i1])) {
        str1 = this.aJ[i1];
      }
      i1 += 1;
    }
    int i3;
    int i2;
    if (o.a(this.n.getCurrentItem()))
    {
      if ((com.android.dazhihui.c.a.a.E != null) && (com.android.dazhihui.c.a.a.E.length > 0))
      {
        i3 = 0;
        i2 = -1;
        i1 = i2;
        if (i3 >= com.android.dazhihui.c.a.a.E.length) {
          break label350;
        }
        if (com.android.dazhihui.c.a.a.E[i3].length < 7) {}
        for (paramString2 = "0";; paramString2 = com.android.dazhihui.c.a.a.E[i3][6])
        {
          i1 = i2;
          if (paramString1.equals(com.android.dazhihui.c.a.a.E[i3][0]))
          {
            i1 = i2;
            if (paramString2.equals(this.G))
            {
              localArrayList.add(com.android.dazhihui.c.a.a.E[i3][2]);
              i1 = i2;
              if (i2 == -1)
              {
                i1 = i2;
                if (str1.equals(com.android.dazhihui.c.a.a.E[i3][3])) {
                  i1 = localArrayList.size() - 1;
                }
              }
            }
          }
          i3 += 1;
          i2 = i1;
          break;
        }
      }
    }
    else if ((com.android.dazhihui.c.a.a.E != null) && (com.android.dazhihui.c.a.a.E.length > 0))
    {
      i3 = 0;
      for (i2 = -1;; i2 = i1)
      {
        i1 = i2;
        if (i3 >= com.android.dazhihui.c.a.a.E.length) {
          break;
        }
        i1 = i2;
        if (paramString1.equals(com.android.dazhihui.c.a.a.E[i3][0]))
        {
          localArrayList.add(com.android.dazhihui.c.a.a.E[i3][2]);
          i1 = i2;
          if (i2 == -1)
          {
            i1 = i2;
            if (str1.equals(com.android.dazhihui.c.a.a.E[i3][3])) {
              i1 = localArrayList.size() - 1;
            }
          }
        }
        i3 += 1;
      }
    }
    i1 = -1;
    label350:
    boolean bool1 = bool2;
    if (localArrayList.size() != 0)
    {
      bool1 = bool2;
      if (i1 != -1)
      {
        this.v.a(localArrayList, i1, false);
        x();
        if ((com.android.dazhihui.c.a.a.E != null) && (com.android.dazhihui.c.a.a.E.length > 0))
        {
          if (!o.a(this.n.getCurrentItem())) {
            break label719;
          }
          if (this.p.getCheckedRadioButtonId() == this.q.getId()) {
            paramString1 = "0";
          }
        }
      }
    }
    label445:
    label470:
    label699:
    label708:
    label719:
    for (str1 = paramString1;; str1 = "0")
    {
      paramString1 = "";
      paramString2 = "";
      i2 = 0;
      String str2;
      if (i2 < com.android.dazhihui.c.a.a.E.length) {
        if (com.android.dazhihui.c.a.a.E[i2].length < 7)
        {
          str2 = "0";
          if ((!this.n.getCurrentItem().equals(com.android.dazhihui.c.a.a.E[i2][0])) || (!((String)localArrayList.get(i1)).equals(com.android.dazhihui.c.a.a.E[i2][2])) || (!str2.equals(str1))) {
            break label708;
          }
          paramString2 = com.android.dazhihui.c.a.a.E[i2][1];
          paramString1 = com.android.dazhihui.c.a.a.E[i2][4];
        }
      }
      for (;;)
      {
        i2 += 1;
        str2 = paramString2;
        paramString2 = paramString1;
        paramString1 = str2;
        break label445;
        paramString1 = "1";
        break;
        str2 = com.android.dazhihui.c.a.a.E[i2][6];
        break label470;
        if (!TextUtils.isEmpty(paramString1))
        {
          this.d = paramString1;
          if (TextUtils.isEmpty(paramString2)) {
            break label699;
          }
        }
        for (this.e = paramString2;; this.e = "")
        {
          paramString1 = com.android.dazhihui.ui.delegate.a.a().b();
          if (paramString1 != null)
          {
            paramString1 = paramString1.iterator();
            while (paramString1.hasNext())
            {
              paramString2 = (c)paramString1.next();
              if ((paramString2.c().equals(this.n.getCurrentItem())) && (paramString2.d().equals(this.v.getCurrentItem()))) {
                this.w.setText(paramString2.e());
              }
            }
          }
          bool1 = true;
          return bool1;
          this.d = "";
          break;
        }
        str2 = paramString1;
        paramString1 = paramString2;
        paramString2 = str2;
      }
    }
  }
  
  private void b(int paramInt)
  {
    View localView = getActivity().getLayoutInflater().inflate(2130903363, null);
    boolean bool;
    if (paramInt < 1440)
    {
      bool = true;
      this.at = bool;
      if (this.aB == null)
      {
        this.aB = new PopupWindow(localView, -1, -1, true);
        this.an = ((LinearLayout)localView.findViewById(2131560172));
        this.al = ((TextView)localView.findViewById(2131560174));
        this.am = ((ImageView)localView.findViewById(2131560173));
        this.aq = ((LinearLayout)localView.findViewById(2131560175));
        this.ao = ((TextView)localView.findViewById(2131560177));
        this.ap = ((ImageView)localView.findViewById(2131560176));
        this.ak = ((TextView)localView.findViewById(2131560182));
        this.ar = ((TextView)localView.findViewById(2131560178));
        this.as = ((TextView)localView.findViewById(2131560179));
        this.ah = ((SeekBar)localView.findViewById(2131560180));
        this.ai = ((TextView)localView.findViewById(2131560181));
        this.aj = ((Button)localView.findViewById(2131560183));
        this.aj.setOnClickListener(new er(this));
        this.aB.setFocusable(true);
        this.aB.setTouchable(true);
        this.aB.setOutsideTouchable(true);
        this.aB.setBackgroundDrawable(new ColorDrawable(-1308622848));
        this.ah.setOnSeekBarChangeListener(new es(this));
        this.an.setOnClickListener(new et(this));
        this.aq.setOnClickListener(new eu(this));
        if (!this.at) {
          break label451;
        }
        this.ak.setText("分钟");
        this.ar.setText("5");
        this.as.setText("180");
        this.al.setTextColor(-16777216);
        this.am.setImageResource(2130838253);
        this.ao.setTextColor(getResources().getColor(2131493178));
        this.ap.setImageResource(2130838254);
        this.ah.setMax(175);
        this.ah.setProgress(paramInt - 5);
      }
    }
    for (;;)
    {
      this.aB.showAtLocation(getActivity().getWindow().getDecorView(), 49, 0, 0);
      return;
      bool = false;
      break;
      label451:
      this.ak.setText("天");
      this.ar.setText(this.ax + "");
      this.as.setText(this.aw + "");
      this.ao.setTextColor(-16777216);
      this.ap.setImageResource(2130838253);
      this.al.setTextColor(getResources().getColor(2131493178));
      this.am.setImageResource(2130838254);
      this.ah.setMax(this.aw - this.ax);
      this.ah.setProgress(paramInt / 24 / 60 - this.ax);
    }
  }
  
  private void b(String paramString)
  {
    z();
    com.android.dazhihui.c.a.a.z = paramString;
    this.c.a(34);
    this.c.close();
    this.g = false;
    a(paramString);
    A();
  }
  
  private void c(String paramString)
  {
    int i6 = 0;
    String[][] arrayOfString = (String[][])Array.newInstance(String.class, new int[] { com.android.dazhihui.c.a.a.E.length - 1, 3 });
    Object localObject = this.n.getCurrentItem() + "_" + paramString;
    com.android.dazhihui.c.a.d.a().h((String)localObject);
    com.android.dazhihui.c.a.d.a().g();
    com.android.dazhihui.c.a.d.a().k((String)localObject);
    com.android.dazhihui.c.a.d.a().g();
    localObject = com.android.dazhihui.c.a.d.a().l();
    com.android.dazhihui.c.a.d.a().g();
    int i1 = 0;
    for (int i2 = 0; i1 < ((ArrayList)localObject).size(); i2 = i3)
    {
      i3 = i2;
      if (((com.android.dazhihui.ui.screen.stock.offlinecapital.n)((ArrayList)localObject).get(i1)).e().equals("1")) {
        i3 = i2 + 1;
      }
      i1 += 1;
    }
    if (i2 == 0)
    {
      i1 = com.android.dazhihui.c.a.d.a().c("offline_capital_state");
      com.android.dazhihui.c.a.d.a().g();
      if (i1 == 2)
      {
        com.android.dazhihui.c.a.d.a().a("offline_capital_state", 0);
        com.android.dazhihui.c.a.d.a().g();
      }
    }
    i2 = 0;
    int i3 = 0;
    int i4 = 0;
    if (i2 < com.android.dazhihui.c.a.a.E.length)
    {
      if (this.n.getCurrentItem().equals(com.android.dazhihui.c.a.a.E[i2][0]))
      {
        i5 = i3;
        i1 = i4;
        if (!paramString.equals(com.android.dazhihui.c.a.a.E[i2][2]))
        {
          arrayOfString[i4] = com.android.dazhihui.c.a.a.E[i2];
          i1 = i4 + 1;
        }
      }
      for (int i5 = i3 + 1;; i5 = i3)
      {
        i2 += 1;
        i3 = i5;
        i4 = i1;
        break;
        arrayOfString[i4] = com.android.dazhihui.c.a.a.E[i2];
        i1 = i4 + 1;
      }
    }
    if (arrayOfString != null)
    {
      com.android.dazhihui.c.a.a.E = arrayOfString;
      this.c.a(39);
      this.c.close();
    }
    if (i3 == 0) {
      if (com.android.dazhihui.c.a.a.i != null)
      {
        i1 = 0;
        if (i1 < com.android.dazhihui.c.a.a.i.length)
        {
          if (com.android.dazhihui.c.a.a.i[i1][2].equals(this.n.getCurrentItem()))
          {
            com.android.dazhihui.c.a.a.i[i1][0] = "";
            com.android.dazhihui.c.a.a.i[i1][1] = "";
          }
        }
        else
        {
          this.c.a(19);
          this.c.close();
        }
      }
      else
      {
        if (com.android.dazhihui.c.a.a.A.length <= 1) {
          break label931;
        }
      }
    }
    label862:
    label926:
    label931:
    for (paramString = new String[com.android.dazhihui.c.a.a.A.length - 1];; paramString = null)
    {
      if ((paramString != null) && (paramString.length > 0))
      {
        i1 = 0;
        i2 = 0;
        for (;;)
        {
          if (i1 < com.android.dazhihui.c.a.a.A.length)
          {
            i3 = i2;
            if (!com.android.dazhihui.c.a.a.A[i1].equals(this.n.getCurrentItem()))
            {
              paramString[i2] = com.android.dazhihui.c.a.a.A[i1];
              i3 = i2 + 1;
            }
            i1 += 1;
            i2 = i3;
            continue;
            i1 += 1;
            break;
          }
        }
        com.android.dazhihui.c.a.a.A = paramString;
        this.c.a(35);
        this.c.close();
        if (com.android.dazhihui.c.a.a.M.length <= 1) {
          break label926;
        }
      }
      for (paramString = new String[com.android.dazhihui.c.a.a.M.length - 1];; paramString = null)
      {
        if ((paramString != null) && (paramString.length > 0))
        {
          i2 = 0;
          i1 = i6;
          for (;;)
          {
            if (i1 < com.android.dazhihui.c.a.a.M.length)
            {
              i3 = i2;
              if (!com.android.dazhihui.c.a.a.M[i1].equals(this.n.getCurrentItem()))
              {
                paramString[i2] = com.android.dazhihui.c.a.a.M[i1];
                i3 = i2 + 1;
              }
              i1 += 1;
              i2 = i3;
              continue;
              paramString = new String[1];
              paramString[0] = "无";
              break;
            }
          }
          com.android.dazhihui.c.a.a.M = paramString;
          this.c.a(49);
          this.c.close();
          if (com.android.dazhihui.ui.delegate.a.a().e().equals(this.n.getCurrentItem()))
          {
            com.android.dazhihui.ui.delegate.a.a().a("");
            com.android.dazhihui.ui.delegate.a.a().b("");
            com.android.dazhihui.ui.delegate.a.a().c("");
            this.S = "";
            this.T = "";
            this.U = "";
          }
        }
        for (;;)
        {
          y();
          u();
          return;
          paramString = new String[0];
          break;
          if (o.a(this.n.getCurrentItem()))
          {
            i1 = 0;
            i2 = 0;
            if (i1 < com.android.dazhihui.c.a.a.E.length)
            {
              i3 = i2;
              if (this.n.getCurrentItem().equals(com.android.dazhihui.c.a.a.E[i1][0])) {
                if (com.android.dazhihui.c.a.a.E[i1].length >= 7) {
                  break label862;
                }
              }
              for (paramString = "0";; paramString = com.android.dazhihui.c.a.a.E[i1][6])
              {
                i3 = i2;
                if (paramString.equals(this.G)) {
                  i3 = i2 + 1;
                }
                i1 += 1;
                i2 = i3;
                break;
              }
            }
            if (i2 == 0) {
              if (this.G.equals("0")) {
                this.p.check(this.r.getId());
              } else {
                this.p.check(this.q.getId());
              }
            }
          }
        }
      }
    }
  }
  
  private void d(String paramString)
  {
    Log.e("trade", "TradeLoginTab:filterEntrust()");
    this.E.setVisibility(0);
    this.x.setVisibility(8);
    this.h.setText("登录");
    if (o.r)
    {
      paramString = o.s;
      System.out.println("TradeHelper.isFromSynchronous = true;" + o.r + "  name = TradeHelper.fromSynchronousName = " + paramString);
    }
    a(paramString);
    ArrayList localArrayList = new ArrayList();
    if ((com.android.dazhihui.c.a.a.M != null) && (com.android.dazhihui.c.a.a.M.length > 0))
    {
      i1 = 0;
      while (i1 < com.android.dazhihui.c.a.a.M.length)
      {
        if (!o.b(com.android.dazhihui.c.a.a.M[i1])) {
          localArrayList.add(com.android.dazhihui.c.a.a.M[i1]);
        }
        i1 += 1;
      }
    }
    if (localArrayList.contains(paramString))
    {
      i1 = localArrayList.indexOf(paramString);
      this.n.a(localArrayList, i1, false);
      this.n.setEditable(false);
      b(this.n.getCurrentItem());
      return;
    }
    if (this.f)
    {
      if (!localArrayList.contains(o.q())) {
        localArrayList.add(o.q());
      }
      if (!localArrayList.contains(paramString)) {
        break label305;
      }
    }
    label305:
    for (int i1 = localArrayList.indexOf(paramString);; i1 = 0)
    {
      this.n.a(localArrayList, i1, false);
      break;
      if (TextUtils.isEmpty(this.S)) {
        break;
      }
      if (!localArrayList.contains(o.q())) {
        localArrayList.add(o.q());
      }
      if (localArrayList.contains(paramString)) {}
      for (i1 = localArrayList.indexOf(paramString);; i1 = 0)
      {
        this.n.a(localArrayList, i1, false);
        break;
      }
    }
  }
  
  private void e(String paramString)
  {
    Log.e("trade", "TradeLoginTab:filterAccount()");
    if (o.r)
    {
      paramString = o.s;
      System.out.println("TradeHelper.isFromSynchronous = true;" + o.r + "  name = TradeHelper.fromSynchronousName = " + paramString);
    }
    ArrayList localArrayList = new ArrayList();
    if (o.a(this.n.getCurrentItem()))
    {
      if ((com.android.dazhihui.c.a.a.E != null) && (com.android.dazhihui.c.a.a.E.length > 0))
      {
        i1 = 0;
        if (i1 < com.android.dazhihui.c.a.a.E.length)
        {
          if (com.android.dazhihui.c.a.a.E[i1].length < 7) {}
          for (String str = "0";; str = com.android.dazhihui.c.a.a.E[i1][6])
          {
            if ((paramString.equals(com.android.dazhihui.c.a.a.E[i1][0])) && (str.equals(this.G))) {
              localArrayList.add(com.android.dazhihui.c.a.a.E[i1][2]);
            }
            i1 += 1;
            break;
          }
        }
      }
    }
    else if ((com.android.dazhihui.c.a.a.E != null) && (com.android.dazhihui.c.a.a.E.length > 0))
    {
      i1 = 0;
      while (i1 < com.android.dazhihui.c.a.a.E.length)
      {
        if (paramString.equals(com.android.dazhihui.c.a.a.E[i1][0])) {
          localArrayList.add(com.android.dazhihui.c.a.a.E[i1][2]);
        }
        i1 += 1;
      }
    }
    if (localArrayList.contains(this.T)) {}
    for (int i1 = localArrayList.indexOf(this.T);; i1 = 0)
    {
      this.v.a(localArrayList, i1, true);
      if ((this.ad.booleanValue()) && (localArrayList.size() != 0)) {
        this.v.setEditable(false);
      }
      for (;;)
      {
        if ((o.a(this.n.getCurrentItem())) && (localArrayList.size() == 0) && (this.ad.booleanValue()))
        {
          this.v.setEditable(false);
          this.v.a();
        }
        this.v.setCanDelItem(true);
        return;
        this.v.setEditable(true);
      }
    }
  }
  
  private void l()
  {
    this.c = new com.android.dazhihui.c.a.a(getActivity());
    this.c.close();
    this.Q = ((AdvertView)this.z.findViewById(2131560902));
    this.Q.setAdvCode(111);
    this.R = ((AdvertView)this.z.findViewById(2131560903));
    this.R.setAdvCode(112);
    this.O = ((AdvertView)this.z.findViewById(2131560901));
    this.O.a(2131492903, 2131492903, 0);
    this.O.setAdvCode(141);
    this.P = ((AdvertView)this.z.findViewById(2131560896));
    this.P.setAdvCode(142);
    addAdvert(this.Q);
    addAdvert(this.R);
    addAdvert(this.O);
    addAdvert(this.P);
    this.n = ((DropDownEditTextView)this.z.findViewById(2131560714));
    this.n.setEditable(false);
    this.E = ((RelativeLayout)this.z.findViewById(2131560864));
    this.E.setVisibility(0);
    this.s = ((DropDownEditTextView)this.z.findViewById(2131560888));
    this.v = ((DropDownEditTextView2)this.z.findViewById(2131560868));
    this.v.setTransformationMethod(null);
    this.w = ((EditText)this.z.findViewById(2131560872));
    this.l = ((DropDownEditTextView)this.z.findViewById(2131560891));
    this.m = ((EditText)this.z.findViewById(2131560894));
    this.j = ((TextView)this.z.findViewById(2131560895));
    this.H = this.z.findViewById(2131560874);
    this.J = ((TextView)this.z.findViewById(2131560863));
    this.K = ((TextView)this.z.findViewById(2131560869));
    this.x = ((LinearLayout)this.z.findViewById(2131560878));
    this.y = ((TextView)this.z.findViewById(2131558534));
    this.H.setOnClickListener(new dz(this));
    this.I = this.z.findViewById(2131560876);
    this.I.setOnClickListener(new eo(this));
    this.M = ((TextView)this.z.findViewById(2131560877));
    this.L = ((ImageView)this.z.findViewById(2131560875));
    this.A = ((RelativeLayout)this.z.findViewById(2131560881));
    this.B = ((RelativeLayout)this.z.findViewById(2131560897));
    this.C = ((LinearLayout)this.z.findViewById(2131560898));
    this.C.setOnClickListener(new fa(this));
    if (m.a().J() != null) {
      this.F = m.a().J().getUrl_Link();
    }
    this.D = ((LinearLayout)this.z.findViewById(2131560860));
    this.D.setOnClickListener(new fc(this));
    this.o = ((RelativeLayout)this.z.findViewById(2131560882));
    this.p = ((RadioGroup)this.z.findViewById(2131560884));
    this.q = ((RadioButton)this.z.findViewById(2131560885));
    this.r = ((RadioButton)this.z.findViewById(2131560886));
    this.o.setVisibility(8);
    this.p.setOnCheckedChangeListener(new fd(this));
    this.s.setOnItemChangeListener(new fe(this));
    this.J.setOnClickListener(new ff(this));
    this.K.setOnClickListener(new fg(this));
    this.n.setOnItemChangeListener(new fh(this));
    this.v.setOnItemChangeListener(new ea(this));
    this.v.setOnListItemImageClickListener(new eb(this));
    this.l.setOnItemChangeListener(new ee(this));
    this.h = ((Button)this.z.findViewById(2131560879));
    this.h.setFocusable(true);
    this.h.setOnClickListener(new ef(this));
    this.aO = new eg(this);
    this.k = ((ScrollView)this.z.findViewById(2131558978));
  }
  
  private void m()
  {
    a(this.m);
    this.N = new gn(getActivity(), getActivity(), this.m, this.k);
    this.N.c();
    this.m.setOnTouchListener(new eh(this));
    this.m.setOnFocusChangeListener(new ei(this));
    a(this.w);
    this.w.setOnTouchListener(new ek(this));
    this.w.setOnFocusChangeListener(new el(this));
    a(this.v.getMEditText());
    this.v.getMEditText().setOnTouchListener(new en(this));
    this.v.getMEditText().setOnFocusChangeListener(new ep(this));
  }
  
  private void n()
  {
    if (this.h.getText().toString().equals("打开委托"))
    {
      o.a(this.n.getCurrentItem(), this.aC, getActivity(), false);
      return;
    }
    if (this.h.getText().toString().equals("进入交易"))
    {
      Bundle localBundle = new Bundle();
      Intent localIntent = new Intent();
      localBundle.putInt("loginfragmentfalg", 1);
      localBundle.putString("gotoQsName", this.n.getCurrentItem());
      if ((this.aC != null) && ((this.aC.equals("138")) || (this.aC.equals("139")) || (this.aC.equals("chedan")) || (this.aC.equals("chicang")))) {
        localBundle.putString("gotoFlag", this.aC);
      }
      localIntent.putExtras(localBundle);
      localIntent.setClass(getActivity(), TradeOutsideScreen.class);
      startActivity(localIntent);
      o();
      return;
    }
    if ((TextUtils.isEmpty(this.v.getCurrentItem())) || (this.w.getText().toString().length() == 0))
    {
      a(0);
      return;
    }
    if (TextUtils.isEmpty(this.s.getCurrentItem()))
    {
      a(7);
      return;
    }
    if ((this.b != null) && (this.b.length > 0) && (this.b[this.l.getSelectedItemPosition()].equals("b")) && (!String.valueOf(this.i).equals(this.m.getText().toString())))
    {
      this.i = new au().a();
      this.j.setText(String.valueOf(this.i));
      a(2);
      return;
    }
    a(6);
    ((InputMethodManager)getActivity().getSystemService("input_method")).hideSoftInputFromWindow(this.w.getWindowToken(), 0);
    if (o.a(this.n.getCurrentItem()))
    {
      if (o.y != o.w) {
        break label411;
      }
      com.android.dazhihui.d.n.a("", 1344);
    }
    for (;;)
    {
      f();
      return;
      label411:
      com.android.dazhihui.d.n.a("", 1348);
    }
  }
  
  private void o()
  {
    this.aC = null;
    this.aD = false;
    this.f = false;
    this.ae = false;
    o.r = false;
    e.a().a(true);
  }
  
  private void p()
  {
    this.Y = JinzhengAccountSign.getInstance();
    this.Y.setUser_id(this.v.getCurrentItem());
    this.Y.setCompany_id(o.q);
    this.Y.setLogin_type(this.aa);
    this.Y.setLogin_code(this.v.getCurrentItem());
    String str = new KDEnCode().KDEncode(6, this.ab, "410301");
    this.Y.setTrd_pwd(str);
    this.Y.registerDataHaveBackListener(this);
    this.Y.sendRequestJinzhengSign_600001();
  }
  
  private void q()
  {
    Object localObject = new JinZhengRequestData();
    ((JinZhengRequestData)localObject).setService_id("600003");
    ((JinZhengRequestData)localObject).setType("JinzhengAccountSignInfo_600003");
    ((JinZhengRequestData)localObject).setUser_id_cls("2");
    ((JinZhengRequestData)localObject).setCompany_id(o.q);
    ((JinZhengRequestData)localObject).setUser_id(this.v.getCurrentItem());
    localObject = ((JinZhengRequestData)localObject).jinzhengJson();
    System.out.println("客户签约信息请求数据" + (String)localObject);
    this.ag = new t();
    this.ag.c(f.Q);
    this.ag.c("Content-Type", "application/json");
    try
    {
      localObject = new StringEntity((String)localObject, "UTF-8");
      this.ag.a((HttpEntity)localObject);
      this.ag.a(this);
      com.android.dazhihui.a.g.a().a(this.ag);
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      localUnsupportedEncodingException.printStackTrace();
    }
  }
  
  private void r()
  {
    if (this.ay != com.android.dazhihui.c.a.a.L)
    {
      com.android.dazhihui.c.a.a.L = this.ay;
      this.c.a(47);
      this.c.close();
    }
    if (this.ay != 0)
    {
      this.L.setImageResource(2130838901);
      if (this.ay >= 1440) {
        this.M.setText(String.valueOf(this.ay / 24 / 60) + "天");
      }
      for (;;)
      {
        this.I.setVisibility(0);
        return;
        this.M.setText(String.valueOf(this.ay) + "分钟");
      }
    }
    this.L.setImageResource(2130838900);
    this.I.setVisibility(8);
  }
  
  private void s()
  {
    t();
  }
  
  private void t()
  {
    if ((this.aJ == null) || (this.aK == null))
    {
      this.aJ = new String[com.android.dazhihui.ui.delegate.c.d.g.length];
      this.aK = new String[com.android.dazhihui.ui.delegate.c.d.f.length];
      this.aJ = com.android.dazhihui.ui.delegate.c.d.g;
      this.aK = com.android.dazhihui.ui.delegate.c.d.f;
    }
    ArrayList localArrayList = new ArrayList();
    int i1 = 0;
    while (i1 < this.aK.length)
    {
      localArrayList.add(this.aK[i1]);
      i1 += 1;
    }
    if ((com.android.dazhihui.c.a.a.E != null) && (com.android.dazhihui.c.a.a.E.length > 0))
    {
      int i2 = 0;
      for (i1 = 0;; i1 = i3)
      {
        i3 = i1;
        if (i2 >= com.android.dazhihui.c.a.a.E.length) {
          break;
        }
        i3 = i1;
        if (this.n.getCurrentItem() != null)
        {
          i3 = i1;
          if (this.n.getCurrentItem().equals(com.android.dazhihui.c.a.a.E[i2][0]))
          {
            i3 = i1;
            if (this.v.getCurrentItem() != null)
            {
              i3 = i1;
              if (this.v.getCurrentItem().equals(com.android.dazhihui.c.a.a.E[i2][2]))
              {
                i3 = i1;
                if (localArrayList.contains(com.android.dazhihui.c.a.a.E[i2][5])) {
                  i3 = localArrayList.indexOf(com.android.dazhihui.c.a.a.E[i2][5]);
                }
              }
            }
          }
        }
        i2 += 1;
      }
    }
    int i3 = 0;
    this.s.a(localArrayList, i3, false);
    this.s.setEditable(false);
  }
  
  private void u()
  {
    if (("".equals(com.android.dazhihui.c.a.a.z)) && ((com.android.dazhihui.c.a.a.M == null) || (com.android.dazhihui.c.a.a.M.length == 0)))
    {
      this.A.setVisibility(8);
      this.B.setVisibility(0);
      this.O.c = true;
      this.P.c = false;
      this.Q.c = true;
      this.R.c = true;
      return;
    }
    if (this.f)
    {
      o.r = false;
      this.A.setVisibility(0);
      this.B.setVisibility(8);
      this.O.c = false;
      this.P.c = true;
      this.Q.c = false;
      this.R.c = false;
      d(com.android.dazhihui.c.a.a.z);
      return;
    }
    if (!TextUtils.isEmpty(this.S))
    {
      this.A.setVisibility(0);
      this.B.setVisibility(8);
      this.O.c = false;
      this.P.c = true;
      this.Q.c = false;
      this.R.c = false;
      d(this.S);
      return;
    }
    if (((com.android.dazhihui.c.a.a.E == null) || (com.android.dazhihui.c.a.a.E.length == 0)) && ((com.android.dazhihui.c.a.a.M == null) || (com.android.dazhihui.c.a.a.M.length == 0)))
    {
      this.A.setVisibility(8);
      this.B.setVisibility(0);
      this.O.c = true;
      this.P.c = false;
      this.Q.c = true;
      this.R.c = true;
      return;
    }
    String[] arrayOfString = com.android.dazhihui.c.a.a.M;
    int i2 = arrayOfString.length;
    int i1 = 0;
    if (i1 < i2) {
      if (o.b(arrayOfString[i1])) {}
    }
    for (i1 = 1;; i1 = 0)
    {
      if (i1 == 0)
      {
        this.A.setVisibility(8);
        this.B.setVisibility(0);
        this.O.c = true;
        this.P.c = false;
        this.Q.c = true;
        this.R.c = true;
        return;
        i1 += 1;
        break;
      }
      this.A.setVisibility(0);
      this.B.setVisibility(8);
      this.O.c = false;
      this.P.c = true;
      this.Q.c = false;
      this.R.c = false;
      try
      {
        i();
        return;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        a(4);
        return;
      }
    }
  }
  
  private void v()
  {
    Log.e("trade", "TradeLoginTab:refreshView()");
    if (o.b(com.android.dazhihui.c.a.a.z))
    {
      com.android.dazhihui.c.a.a.z = "";
      this.c.a(34);
      this.c.close();
    }
    r();
    this.S = "";
    this.T = "";
    this.U = "";
    int i1;
    String str;
    if ((this.aD) && (!this.f)) {
      if ((com.android.dazhihui.c.a.a.E != null) && (com.android.dazhihui.c.a.a.E.length > 0))
      {
        i1 = 0;
        if (i1 < com.android.dazhihui.c.a.a.E.length)
        {
          if (!com.android.dazhihui.c.a.a.E[i1][0].contains("湘财证券")) {
            break label220;
          }
          if (com.android.dazhihui.c.a.a.E[i1].length >= 7) {
            break label208;
          }
          str = "0";
          label129:
          if (!str.equals("0")) {
            break label220;
          }
          com.android.dazhihui.c.a.a.z = com.android.dazhihui.c.a.a.E[i1][0];
          this.c.a(34);
          this.c.close();
          this.S = com.android.dazhihui.c.a.a.z;
        }
      }
    }
    for (;;)
    {
      if (o.b(this.S))
      {
        this.S = "";
        this.T = "";
        this.U = "";
      }
      y();
      u();
      return;
      label208:
      str = com.android.dazhihui.c.a.a.E[i1][6];
      break label129;
      label220:
      i1 += 1;
      break;
      this.S = com.android.dazhihui.ui.delegate.a.a().e();
      this.T = com.android.dazhihui.ui.delegate.a.a().f();
      this.U = com.android.dazhihui.ui.delegate.a.a().g();
    }
  }
  
  private void w()
  {
    Object localObject;
    int i1;
    int i2;
    if ((com.android.dazhihui.c.a.a.O != null) && (com.android.dazhihui.c.a.a.O.length != 0))
    {
      localObject = new SimpleDateFormat("yyyyMMdd").format(new Date());
      i1 = 0;
      if (i1 < com.android.dazhihui.c.a.a.O.length) {
        if (com.android.dazhihui.c.a.a.O[i1][0].equals(this.n.getCurrentItem())) {
          if (!com.android.dazhihui.c.a.a.O[i1][2].equals(localObject)) {
            i2 = 1;
          }
        }
      }
    }
    for (;;)
    {
      label80:
      if (i1 == -1)
      {
        if (com.android.dazhihui.c.a.a.O != null) {
          break label189;
        }
        com.android.dazhihui.c.a.a.O = (String[][])Array.newInstance(String.class, new int[] { 1, 3 });
        com.android.dazhihui.c.a.a.O[0][0] = this.n.getCurrentItem();
        com.android.dazhihui.c.a.a.O[0][1] = "";
        com.android.dazhihui.c.a.a.O[0][2] = "0";
      }
      for (;;)
      {
        this.c.a(51);
        this.c.close();
        if (i2 == 0) {
          break label268;
        }
        if (!o.l()) {
          break label252;
        }
        j();
        return;
        i2 = 0;
        break label80;
        i1 += 1;
        break;
        label189:
        localObject = new ArrayList(Arrays.asList(com.android.dazhihui.c.a.a.O));
        ((ArrayList)localObject).add(new String[] { this.n.getCurrentItem(), "", "0" });
        com.android.dazhihui.c.a.a.O = (String[][])((ArrayList)localObject).toArray(new String[((ArrayList)localObject).size()][]);
      }
      label252:
      if (o.m())
      {
        k();
        return;
      }
      D();
      return;
      label268:
      this.aJ = com.android.dazhihui.c.a.a.O[i1][1].split(",");
      this.aK = new String[this.aJ.length];
      i1 = 0;
      while (i1 < this.aJ.length)
      {
        this.aK[i1] = com.android.dazhihui.ui.delegate.c.d.a(this.aJ[i1]);
        i1 += 1;
      }
      localObject = new ArrayList();
      i1 = 0;
      while (i1 < this.aK.length)
      {
        ((ArrayList)localObject).add(this.aK[i1]);
        i1 += 1;
      }
      if ((com.android.dazhihui.c.a.a.E != null) && (com.android.dazhihui.c.a.a.E.length > 0))
      {
        i2 = 0;
        for (i1 = 0;; i1 = i3)
        {
          i3 = i1;
          if (i2 >= com.android.dazhihui.c.a.a.E.length) {
            break;
          }
          i3 = i1;
          if (this.n.getCurrentItem().equals(com.android.dazhihui.c.a.a.E[i2][0]))
          {
            i3 = i1;
            if (this.v.getCurrentItem().equals(com.android.dazhihui.c.a.a.E[i2][2]))
            {
              i3 = i1;
              if (((ArrayList)localObject).contains(com.android.dazhihui.c.a.a.E[i2][5])) {
                i3 = ((ArrayList)localObject).indexOf(com.android.dazhihui.c.a.a.E[i2][5]);
              }
            }
          }
          i2 += 1;
        }
      }
      int i3 = 0;
      this.s.a((ArrayList)localObject, i3, false);
      this.s.setEditable(false);
      return;
      i1 = -1;
      i2 = 1;
    }
  }
  
  private void x()
  {
    this.w.setText("");
    this.m.setText("");
  }
  
  private void y()
  {
    this.n.b();
    this.s.b();
    this.v.a();
    this.l.b();
    this.w.setText("");
    this.m.setText("");
    this.aJ = null;
    this.aK = null;
  }
  
  private void z()
  {
    this.s.b();
    this.v.a();
    this.l.b();
    this.w.setText("");
    this.m.setText("");
    this.aJ = null;
    this.aK = null;
  }
  
  public void a()
  {
    w();
  }
  
  public void a(int paramInt)
  {
    if (this.X == null)
    {
      this.X = Toast.makeText(getActivity(), "", 0);
      this.X.setGravity(17, 0, 0);
    }
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      this.X.setText("　　账号密码都必须填写。");
    }
    for (;;)
    {
      this.X.show();
      return;
      this.X.setText("  网络连接超时请重试......");
      continue;
      this.X.setText("　　验证码输入错误。");
      continue;
      this.X.setText("　　未读取到服务器IP。");
      continue;
      this.X.setText("　　数据读取出现错误，请重新添加账号或者清空委托数据。");
      continue;
      this.X.setText("  网络连接异常请重试......");
      continue;
      this.X.setText("　　正在登录，请稍候……");
      continue;
      this.X.setText("　　账号类型不正确。");
      continue;
      this.X.setText("　　暂不支持该券商。");
    }
  }
  
  public void a(String paramString)
  {
    boolean bool = false;
    if (o.r)
    {
      paramString = o.s;
      System.out.println("TradeHelper.isFromSynchronous = true;" + o.r + "  name = TradeHelper.fromSynchronousName = " + paramString);
    }
    int i1;
    if (com.android.dazhihui.c.a.a.i != null) {
      i1 = 0;
    }
    for (;;)
    {
      if (i1 < com.android.dazhihui.c.a.a.i.length)
      {
        if (com.android.dazhihui.c.a.a.i[i1][2].equals(paramString)) {
          this.ac = i1;
        }
      }
      else
      {
        if (this.ac != -1) {
          break;
        }
        return;
      }
      i1 += 1;
    }
    if ((com.android.dazhihui.c.a.a.C[this.ac].length < 6) || (!com.android.dazhihui.c.a.a.C[this.ac][5].equals("1"))) {
      bool = true;
    }
    this.ad = Boolean.valueOf(bool);
  }
  
  public void b() {}
  
  public void beforeHidden()
  {
    this.aE = true;
    if (this.N != null)
    {
      this.N.a();
      this.N.c();
    }
    super.beforeHidden();
  }
  
  public void c()
  {
    Intent localIntent;
    int i1;
    Object localObject1;
    Object localObject2;
    if (isAdded())
    {
      ((BaseActivity)getActivity()).getLoadingDialog().dismiss();
      localIntent = new Intent();
      if ((this.ae) || ((o.r) && (o.s.equals(com.android.dazhihui.c.a.a.z)))) {
        i1 = 0;
      }
    }
    else
    {
      for (;;)
      {
        if (i1 < com.android.dazhihui.c.a.a.E.length)
        {
          if (com.android.dazhihui.c.a.a.z.equals(com.android.dazhihui.c.a.a.E[i1][0])) {
            this.aP = com.android.dazhihui.c.a.a.E[i1][2];
          }
        }
        else
        {
          localObject1 = com.android.dazhihui.c.a.a.z + "_" + this.aP;
          com.android.dazhihui.c.a.d.a().a("offline_capital_state", 2);
          com.android.dazhihui.c.a.d.a().g();
          com.android.dazhihui.c.a.d.a().a("hadTongbu_entrust_name", (String)localObject1);
          com.android.dazhihui.c.a.d.a().g();
          localObject2 = new Bundle();
          ((Bundle)localObject2).putString("entrustName", (String)localObject1);
          ((Bundle)localObject2).putBoolean("isRequest", true);
          localIntent.putExtras((Bundle)localObject2);
          localIntent.setClass(getActivity(), OfflineCapitalDetailActivity.class);
          startActivity(localIntent);
          this.aO.sendEmptyMessageDelayed(222, 10L);
          return;
        }
        i1 += 1;
      }
    }
    if ((o.r) && (com.android.dazhihui.c.a.a.E.length > 1))
    {
      localObject1 = new Bundle();
      ((Bundle)localObject1).putBoolean("isMineRequest", true);
      localIntent.putExtras((Bundle)localObject1);
      localIntent.setClass(getActivity(), OfflineCapitalMine.class);
      startActivity(localIntent);
      this.aO.sendEmptyMessageDelayed(222, 10L);
      return;
    }
    if ((this.aC != null) && (this.aC.equals("138")) && (o.y != o.x))
    {
      localObject1 = new Bundle();
      localObject2 = e.a().g();
      if ((o.y == o.v) && ((com.android.dazhihui.c.a.a.z.contains("湘财证券")) || (o.k()) || (o.l()) || (o.m()) || (o.i())))
      {
        ((Bundle)localObject1).putInt("type", 0);
        ((Bundle)localObject1).putString("scode", (String)localObject2);
        localIntent.setClass(getActivity(), TradeCommonStock.class);
        localIntent.putExtras((Bundle)localObject1);
      }
    }
    for (;;)
    {
      e.a().b(null);
      e.a().e(null);
      e.a().f(null);
      e.a().b(null);
      e.a().c(null);
      e.a().d(null);
      e.a().a(null);
      e.a().g(null);
      e.a().i(null);
      startActivity(localIntent);
      o();
      return;
      if ((o.y == o.w) && (o.a(this.n.getCurrentItem())))
      {
        ((Bundle)localObject1).putInt("type", 0);
        ((Bundle)localObject1).putString("scode", (String)localObject2);
        localIntent.setClass(getActivity(), MarginCommonScreen.class);
        localIntent.putExtras((Bundle)localObject1);
      }
      else if (o.y == o.v)
      {
        ((Bundle)localObject1).putInt("screenId", 0);
        ((Bundle)localObject1).putString("scode", (String)localObject2);
        localIntent.setClass(getActivity(), EntrustNew.class);
        localIntent.putExtras((Bundle)localObject1);
        continue;
        if ((this.aC != null) && (this.aC.equals("139")) && (o.y != o.x))
        {
          localObject1 = new Bundle();
          localObject2 = e.a().g();
          if ((o.y == o.v) && ((com.android.dazhihui.c.a.a.z.contains("湘财证券")) || (o.k()) || (o.l()) || (o.m()) || (o.i())))
          {
            ((Bundle)localObject1).putInt("type", 1);
            ((Bundle)localObject1).putString("scode", (String)localObject2);
            localIntent.setClass(getActivity(), TradeCommonStock.class);
            localIntent.putExtras((Bundle)localObject1);
          }
          else if ((o.y == o.w) && (o.a(this.n.getCurrentItem())))
          {
            ((Bundle)localObject1).putInt("type", 1);
            ((Bundle)localObject1).putString("scode", (String)localObject2);
            localIntent.setClass(getActivity(), MarginCommonScreen.class);
            localIntent.putExtras((Bundle)localObject1);
          }
          else if (o.y == o.v)
          {
            ((Bundle)localObject1).putInt("screenId", 1);
            ((Bundle)localObject1).putString("scode", (String)localObject2);
            localIntent.setClass(getActivity(), EntrustNew.class);
            localIntent.putExtras((Bundle)localObject1);
          }
        }
        else if ((this.aC != null) && (this.aC.equals("chedan")) && (o.y != o.x))
        {
          localObject1 = new Bundle();
          if ((o.y == o.v) && ((com.android.dazhihui.c.a.a.z.contains("湘财证券")) || (o.k()) || (o.l()) || (o.m()) || (o.i())))
          {
            ((Bundle)localObject1).putInt("type", 2);
            localIntent.setClass(getActivity(), TradeCommonStock.class);
            localIntent.putExtras((Bundle)localObject1);
          }
          else if ((o.y == o.w) && (o.a(this.n.getCurrentItem())))
          {
            ((Bundle)localObject1).putInt("type", 2);
            localIntent.setClass(getActivity(), MarginCommonScreen.class);
            localIntent.putExtras((Bundle)localObject1);
          }
          else if (o.y == o.v)
          {
            localIntent.setClass(getActivity(), CancelTable.class);
          }
        }
        else if ((this.aC != null) && (this.aC.equals("chicang")) && (o.y != o.x))
        {
          localObject1 = new Bundle();
          if ((o.y == o.v) && ((com.android.dazhihui.c.a.a.z.contains("湘财证券")) || (o.k()) || (o.l()) || (o.i())))
          {
            ((Bundle)localObject1).putInt("type", 3);
            localIntent.setClass(getActivity(), TradeCommonStock.class);
            localIntent.putExtras((Bundle)localObject1);
          }
          else if ((o.y == o.w) && (o.a(this.n.getCurrentItem())))
          {
            ((Bundle)localObject1).putInt("type", 3);
            localIntent.setClass(getActivity(), MarginCommonScreen.class);
            localIntent.putExtras((Bundle)localObject1);
          }
          else if (o.y == o.v)
          {
            localIntent.setClass(getActivity(), CapitalandHoldingTable.class);
          }
        }
        else if ((this.aC != null) && (this.aC.equals("137")) && (o.y == o.v) && (o.e()))
        {
          localObject1 = new Bundle();
          ((Bundle)localObject1).putInt("screenId", 16385);
          ((Bundle)localObject1).putString("scode", e.a().c());
          localIntent.setClass(getActivity(), OtcEntrust.class);
          localIntent.putExtras((Bundle)localObject1);
        }
        else if ((this.aC != null) && (this.aC.equals("142")) && (o.y == o.v) && (o.g()))
        {
          localObject1 = new Bundle();
          ((Bundle)localObject1).putInt("screenId", 0);
          ((Bundle)localObject1).putString("scode", e.a().e());
          localIntent.setClass(getActivity(), IFundEntrust.class);
          localIntent.putExtras((Bundle)localObject1);
        }
        else if ((this.aC != null) && (this.aC.equals("140")) && (o.y == o.v) && (o.d()))
        {
          localObject1 = new Bundle();
          ((Bundle)localObject1).putInt("screenId", 1);
          ((Bundle)localObject1).putString("scode", e.a().f());
          localIntent.setClass(getActivity(), FundEntrust.class);
          localIntent.putExtras((Bundle)localObject1);
        }
        else if ((this.aC != null) && (this.aC.equals("183")) && (o.y == o.v) && ((o.i()) || (com.android.dazhihui.c.a.a.z.contains("湘财证券")) || (o.k())))
        {
          localObject1 = new Bundle();
          ((Bundle)localObject1).putInt("category", 12024);
          localIntent.setClass(getActivity(), TradeQuery.class);
          localIntent.putExtras((Bundle)localObject1);
        }
        else if ((this.aC != null) && (this.aC.equals("184")) && (o.y == o.v) && ((o.i()) || (com.android.dazhihui.c.a.a.z.contains("湘财证券")) || (o.k())))
        {
          localObject1 = new Bundle();
          ((Bundle)localObject1).putInt("category", 11148);
          localIntent.setClass(getActivity(), TradeQuery.class);
          localIntent.putExtras((Bundle)localObject1);
        }
        else if ((this.aC != null) && (this.aC.equals("fundchedan")) && (o.y == o.v) && (o.d()))
        {
          localObject1 = new Bundle();
          ((Bundle)localObject1).putString("codes", e.a().f());
          localIntent.setClass(getActivity(), FundAtone.class);
          localIntent.putExtras((Bundle)localObject1);
        }
        else if ((this.aC != null) && (this.aC.equals("ggtbuy")) && (o.y == o.v) && (o.h()))
        {
          localObject1 = new Bundle();
          ((Bundle)localObject1).putInt("type", 0);
          ((Bundle)localObject1).putString("codes", e.a().h());
          localIntent.setClass(getActivity(), GgtEntrust.class);
          localIntent.putExtras((Bundle)localObject1);
        }
        else if ((this.aC != null) && (this.aC.equals("ggtsell")) && (o.y == o.v) && (o.h()))
        {
          localObject1 = new Bundle();
          ((Bundle)localObject1).putInt("type", 1);
          ((Bundle)localObject1).putString("codes", e.a().h());
          localIntent.setClass(getActivity(), GgtEntrust.class);
          localIntent.putExtras((Bundle)localObject1);
        }
        else if ((this.aC != null) && (this.aC.equals("ggtchedan")) && (o.y == o.v) && (o.h()))
        {
          localObject1 = new Bundle();
          ((Bundle)localObject1).putInt("screenId", 12656);
          localIntent.setClass(getActivity(), GgtQuiry.class);
          localIntent.putExtras((Bundle)localObject1);
        }
        else if ((this.aC != null) && (this.aC.equals("141")) && (o.y != o.x))
        {
          if (o.y == o.v)
          {
            if (o.a())
            {
              localObject1 = new Bundle();
              ((Bundle)localObject1).putInt("type", 0);
              ((Bundle)localObject1).putString("scode", e.a().d());
              localIntent.setClass(getActivity(), NewStockMainActivity.class);
              localIntent.putExtras((Bundle)localObject1);
            }
            else if ((com.android.dazhihui.c.a.a.z.contains("湘财证券")) || (o.k()) || (o.l()) || (o.m()) || (o.i()))
            {
              localObject1 = new Bundle();
              ((Bundle)localObject1).putInt("type", 0);
              ((Bundle)localObject1).putString("scode", e.a().d());
              localIntent.setClass(getActivity(), TradeCommonStock.class);
              localIntent.putExtras((Bundle)localObject1);
            }
            else
            {
              localObject1 = new Bundle();
              ((Bundle)localObject1).putInt("screenId", 0);
              ((Bundle)localObject1).putString("scode", e.a().d());
              localIntent.setClass(getActivity(), EntrustNew.class);
              localIntent.putExtras((Bundle)localObject1);
            }
          }
          else if (o.y == o.w) {
            if (o.c())
            {
              localObject1 = new Bundle();
              ((Bundle)localObject1).putInt("type", 0);
              ((Bundle)localObject1).putString("scode", e.a().d());
              localIntent.setClass(getActivity(), NewStockMainActivity.class);
              localIntent.putExtras((Bundle)localObject1);
            }
            else
            {
              localObject1 = new Bundle();
              ((Bundle)localObject1).putInt("type", 0);
              ((Bundle)localObject1).putString("scode", e.a().d());
              localIntent.setClass(getActivity(), MarginCommonScreen.class);
              localIntent.putExtras((Bundle)localObject1);
            }
          }
        }
        else if (this.aD)
        {
          localObject1 = new Bundle();
          ((Bundle)localObject1).putInt("TAB_ID", 1073741824);
          localIntent.setClass(getActivity(), MainScreen.class);
          localIntent.putExtras((Bundle)localObject1);
        }
        else if (ae.l == 1)
        {
          ae.l = 0;
          localIntent.setClass(getActivity(), FundSubscription.class);
        }
        else if (ae.l == 2)
        {
          ae.l = 0;
          localIntent.setClass(getActivity(), FundRedemption.class);
        }
        else if (ae.l == 3)
        {
          ae.l = 0;
          localIntent.setClass(getActivity(), FundHome.class);
        }
        else
        {
          localObject1 = new Bundle();
          ((Bundle)localObject1).putInt("TAB_ID", 805306368);
          localIntent.setClass(getActivity(), MainScreen.class);
          localIntent.putExtras((Bundle)localObject1);
          if (o.y == o.w) {
            com.android.dazhihui.d.n.a("", 1344);
          }
        }
      }
    }
  }
  
  public void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (fb.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.V == null);
      this.V.a(paramy);
      return;
    } while (this.V == null);
    this.V.a(paramy);
  }
  
  public void d()
  {
    if (isAdded())
    {
      ((BaseActivity)getActivity()).getLoadingDialog().dismiss();
      o.r = false;
    }
  }
  
  public boolean e()
  {
    boolean bool1 = false;
    boolean bool2 = false;
    if (this.N != null)
    {
      bool1 = bool2;
      if (this.N.d()) {
        bool1 = true;
      }
      this.N.c();
    }
    return bool1;
  }
  
  protected void f()
  {
    int i1 = e.a().j();
    if (i1 == -1)
    {
      a(8);
      return;
    }
    c localc = new c();
    this.af = new c();
    if (o.l())
    {
      localc.a(com.android.dazhihui.c.a.a.i[i1][0]);
      localc.b(com.android.dazhihui.c.a.a.i[i1][1]);
      localc.d(this.v.getCurrentItem());
      localc.e(this.w.getText().toString());
      localc.i("");
      localc.j("");
      localc.f(this.aJ[this.s.getSelectedItemPosition()]);
      localc.k(this.s.getCurrentItem());
      if ((this.o.getVisibility() == 0) && (o.a(this.n.getCurrentItem())) && (this.p.getCheckedRadioButtonId() == this.r.getId())) {
        localc.a(true);
      }
      for (;;)
      {
        localc.c(this.n.getCurrentItem());
        localc.g("");
        localc.h("");
        com.android.dazhihui.ui.delegate.a.a().a(this, localc, this.aD);
        ((BaseActivity)getActivity()).getLoadingDialog().show();
        return;
        localc.a(false);
      }
    }
    if (o.m())
    {
      g();
      q();
      return;
    }
    localc.a(com.android.dazhihui.c.a.a.i[i1][0]);
    localc.b(com.android.dazhihui.c.a.a.i[i1][1]);
    if (o.n())
    {
      localc.d(this.v.getCurrentItem().toUpperCase());
      localc.e(this.w.getText().toString());
      localc.i(this.d);
      localc.j(this.e);
      localc.f(this.aJ[this.s.getSelectedItemPosition()]);
      localc.k(this.s.getCurrentItem());
      if ((this.o.getVisibility() != 0) || (!o.a(this.n.getCurrentItem())) || (this.p.getCheckedRadioButtonId() != this.r.getId())) {
        break label476;
      }
      localc.a(true);
      label391:
      localc.c(this.n.getCurrentItem());
      if (!"1".equals(com.android.dazhihui.c.a.a.C[i1][4])) {
        break label484;
      }
      localc.g("");
      localc.h("");
    }
    for (;;)
    {
      com.android.dazhihui.ui.delegate.a.a().a(this, localc, this.aD);
      try
      {
        ((BaseActivity)getActivity()).getLoadingDialog().show();
        return;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        return;
      }
      localException.d(this.v.getCurrentItem());
      break;
      label476:
      localException.a(false);
      break label391;
      label484:
      localException.g(this.b[this.l.getSelectedItemPosition()]);
      localException.h(this.m.getText().toString());
    }
  }
  
  public void g()
  {
    int i1 = e.a().j();
    this.af.a(com.android.dazhihui.c.a.a.i[i1][0]);
    o.h = com.android.dazhihui.c.a.a.i[i1][1];
    this.af.b(com.android.dazhihui.c.a.a.i[i1][1]);
    this.af.d(this.v.getCurrentItem());
    this.ab = this.w.getText().toString();
    this.af.e(this.ab);
    this.af.i("");
    this.af.j("");
    label203:
    String str;
    if ((this.f) || (!this.ad.booleanValue()))
    {
      this.aa = this.aM[this.s.getSelectedItemPosition()];
      this.af.f(this.aM[this.s.getSelectedItemPosition()]);
      this.af.k(this.s.getCurrentItem());
      if ((this.o.getVisibility() != 0) || (this.p.getCheckedRadioButtonId() != this.r.getId())) {
        break label293;
      }
      this.af.a(true);
      this.af.c(this.n.getCurrentItem());
      str = this.v.getCurrentItem();
      if (!str.equals("10000910")) {
        break label331;
      }
    }
    for (o.q = "16300";; o.q = "11900") {
      label293:
      label331:
      do
      {
        this.af.g("");
        this.af.h("");
        return;
        this.aa = this.u;
        this.af.f(this.u);
        this.af.k(this.t);
        break;
        if ((this.o.getVisibility() != 0) || (this.p.getCheckedRadioButtonId() != this.q.getId())) {
          break label203;
        }
        this.af.a(false);
        break label203;
      } while ((!str.equals("7600000088")) && (!str.equals("1b21f9cf45948885564776593560")));
    }
  }
  
  public String getmessage()
  {
    this.Z = JinzhengAccountSign.getInstance().getMes_code();
    if (this.Z.equals("0"))
    {
      com.android.dazhihui.ui.delegate.a.a().a(this, this.af, this.aD);
      ((BaseActivity)getActivity()).getLoadingDialog().show();
    }
    for (;;)
    {
      return this.Z;
      Toast.makeText(getActivity(), this.Y.getMes_text(), 1).show();
    }
  }
  
  protected void h()
  {
    if (this.I.getVisibility() == 0)
    {
      this.ay = 0;
      r();
      return;
    }
    b(180);
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, com.android.dazhihui.a.b.j paramj)
  {
    Object localObject1;
    Object localObject2;
    int i1;
    int i2;
    if (isAdded())
    {
      ((BaseActivity)getActivity()).getLoadingDialog().dismiss();
      Object localObject3;
      if (paramh == this.aI)
      {
        localObject1 = ((v)paramj).b();
        if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, getActivity()))
        {
          localObject3 = new com.android.dazhihui.ui.delegate.b.g(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
          boolean bool = ((com.android.dazhihui.ui.delegate.b.g)localObject3).g();
          localObject1 = ((com.android.dazhihui.ui.delegate.b.g)localObject3).h(16);
          localObject2 = ((com.android.dazhihui.ui.delegate.b.g)localObject3).h(16);
          i1 = ((com.android.dazhihui.ui.delegate.b.g)localObject3).f();
          if (!bool) {
            break label399;
          }
          localObject3 = this.aH.getBytes();
          byte[] arrayOfByte1 = new byte[localObject1.length + localObject3.length + this.aG.length];
          System.arraycopy(localObject1, 0, arrayOfByte1, 0, localObject1.length);
          System.arraycopy(localObject3, 0, arrayOfByte1, localObject1.length, localObject3.length);
          byte[] arrayOfByte2 = this.aG;
          i2 = localObject1.length;
          System.arraycopy(arrayOfByte2, 0, arrayOfByte1, localObject3.length + i2, this.aG.length);
          localObject3 = com.android.dazhihui.ui.delegate.b.j.a(arrayOfByte1);
          if (com.android.dazhihui.ui.delegate.b.u.a((byte[])localObject1, com.android.dazhihui.ui.delegate.b.a.b((byte[])localObject2, (byte[])localObject3))) {
            break label385;
          }
          new AlertDialog.Builder(getActivity()).setTitle("　　通信密码错误。").setPositiveButton(2131165363, new ex(this)).setOnCancelListener(new ew(this)).show();
        }
      }
      for (;;)
      {
        if (paramh != this.aL) {
          break label1119;
        }
        localObject1 = ((v)paramj).b();
        if (!com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, getActivity())) {
          break label1119;
        }
        localObject1 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
        if (((com.android.dazhihui.ui.delegate.b.h)localObject1).b()) {
          break label619;
        }
        paramh = Toast.makeText(getActivity(), ((com.android.dazhihui.ui.delegate.b.h)localObject1).d(), 0);
        paramh.setGravity(17, 0, 0);
        paramh.show();
        this.aJ = new String[com.android.dazhihui.ui.delegate.c.d.g.length];
        this.aK = new String[com.android.dazhihui.ui.delegate.c.d.f.length];
        this.aJ = com.android.dazhihui.ui.delegate.c.d.g;
        this.aK = com.android.dazhihui.ui.delegate.c.d.f;
        paramh = new ArrayList();
        i1 = 0;
        while (i1 < this.aK.length)
        {
          paramh.add(this.aK[i1]);
          i1 += 1;
        }
        label385:
        com.android.dazhihui.ui.delegate.b.u.a((byte[])localObject3, i1);
        w();
      }
      label399:
      if (!o.n()) {
        break label419;
      }
      o.e(b.a().f(), this.ae);
    }
    label419:
    label619:
    label1119:
    do
    {
      do
      {
        return;
        new AlertDialog.Builder(getActivity()).setTitle("验证失败").setPositiveButton(2131165363, new ez(this)).setOnCancelListener(new ey(this)).show();
        break;
        if ((com.android.dazhihui.c.a.a.E != null) && (com.android.dazhihui.c.a.a.E.length > 0))
        {
          i2 = 0;
          for (i1 = 0;; i1 = i3)
          {
            i3 = i1;
            if (i2 >= com.android.dazhihui.c.a.a.E.length) {
              break;
            }
            i3 = i1;
            if (this.n.getCurrentItem().equals(com.android.dazhihui.c.a.a.E[i2][0]))
            {
              i3 = i1;
              if (this.v.getCurrentItem().equals(com.android.dazhihui.c.a.a.E[i2][2]))
              {
                i3 = i1;
                if (paramh.contains(com.android.dazhihui.c.a.a.E[i2][5])) {
                  i3 = paramh.indexOf(com.android.dazhihui.c.a.a.E[i2][5]);
                }
              }
            }
            i2 += 1;
          }
        }
        int i3 = 0;
        this.s.a(paramh, i3, false);
        this.s.setEditable(false);
        return;
        i2 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).g();
        this.aJ = new String[i2];
        this.aK = new String[i2];
        i1 = 0;
        while (i1 < i2)
        {
          this.aJ[i1] = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1021");
          this.aK[i1] = com.android.dazhihui.ui.delegate.c.d.a(this.aJ[i1]);
          i1 += 1;
        }
        if (o.n())
        {
          this.aJ = new String[1];
          this.aJ[0] = "1";
          this.aK = new String[1];
          this.aK[0] = "客户号";
        }
        localObject1 = new ArrayList();
        i1 = 0;
        while (i1 < this.aK.length)
        {
          ((ArrayList)localObject1).add(this.aK[i1]);
          i1 += 1;
        }
        if ((com.android.dazhihui.c.a.a.E != null) && (com.android.dazhihui.c.a.a.E.length > 0))
        {
          i2 = 0;
          for (i1 = 0;; i1 = i3)
          {
            i3 = i1;
            if (i2 >= com.android.dazhihui.c.a.a.E.length) {
              break;
            }
            i3 = i1;
            if (this.n.getCurrentItem().equals(com.android.dazhihui.c.a.a.E[i2][0]))
            {
              i3 = i1;
              if (this.v.getCurrentItem().equals(com.android.dazhihui.c.a.a.E[i2][2]))
              {
                i3 = i1;
                if (((ArrayList)localObject1).contains(com.android.dazhihui.c.a.a.E[i2][5])) {
                  i3 = ((ArrayList)localObject1).indexOf(com.android.dazhihui.c.a.a.E[i2][5]);
                }
              }
            }
            i2 += 1;
          }
        }
        i3 = 0;
        this.s.a((ArrayList)localObject1, i3, false);
        this.s.setEditable(false);
        localObject1 = new SimpleDateFormat("yyyyMMdd").format(new Date());
        i1 = 0;
        while (i1 < com.android.dazhihui.c.a.a.O.length)
        {
          if (com.android.dazhihui.c.a.a.O[i1][0].equals(this.n.getCurrentItem()))
          {
            localObject2 = new StringBuilder();
            i2 = 0;
            if (i2 < this.aJ.length)
            {
              if (i2 == this.aJ.length - 1) {
                ((StringBuilder)localObject2).append(this.aJ[i2]);
              }
              for (;;)
              {
                i2 += 1;
                break;
                ((StringBuilder)localObject2).append(this.aJ[i2] + ",");
              }
            }
            com.android.dazhihui.c.a.a.O[i1][1] = ((StringBuilder)localObject2).toString();
            com.android.dazhihui.c.a.a.O[i1][2] = localObject1;
          }
          i1 += 1;
        }
        this.c.a(51);
        this.c.close();
      } while (!(paramj instanceof com.android.dazhihui.a.b.g));
      paramj = (com.android.dazhihui.a.b.g)paramj;
    } while (paramh != this.ag);
    paramh = new String(paramj.a());
    System.out.println("查询客户签约信息返回数据" + paramh);
    paramj = (JinzhengResponse)new k().a(paramh, JinzhengResponse.class);
    paramh = ((JinzhengResponse.Answer)paramj.ANSWERS.get(0)).ANS_MSG_HDR.MSG_CODE;
    paramj = ((JinzhengResponse.Answer)paramj.ANSWERS.get(0)).ANS_MSG_HDR.MSG_TEXT;
    if (paramh.equals("0"))
    {
      com.android.dazhihui.ui.delegate.a.a().a(this, this.af, this.aD);
      ((BaseActivity)getActivity()).getLoadingDialog().show();
      return;
    }
    p();
    Toast.makeText(getActivity(), paramj, 1).show();
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    if (paramh == this.aL) {
      C();
    }
    if (isAdded())
    {
      if (((BaseActivity)getActivity()).getLoadingDialog().isShowing()) {
        ((BaseActivity)getActivity()).getLoadingDialog().dismiss();
      }
      if (getActivity() == b.a().f()) {
        a(1);
      }
    }
  }
  
  public void i()
  {
    int i2 = 0;
    Log.e("trade", "TradeLoginTab:filterBrokers()");
    ArrayList localArrayList = new ArrayList();
    System.out.println("TradeHelper.isFromSynchronous      " + o.r);
    String str;
    if (o.r)
    {
      str = o.s;
      System.out.println("TradeHelper.isFromSynchronous = true;" + o.r + "  name = TradeHelper.fromSynchronousName = " + str);
    }
    for (;;)
    {
      i1 = 0;
      while (i1 < com.android.dazhihui.c.a.a.M.length)
      {
        if (!o.b(com.android.dazhihui.c.a.a.M[i1])) {
          localArrayList.add(com.android.dazhihui.c.a.a.M[i1]);
        }
        i1 += 1;
      }
      str = "";
    }
    int i1 = i2;
    if (!TextUtils.isEmpty(str)) {
      i1 = localArrayList.indexOf(str);
    }
    this.n.a(localArrayList, i1, true);
    B();
  }
  
  public void j()
  {
    this.aJ = new String[com.android.dazhihui.ui.delegate.c.d.i.length];
    this.aK = new String[com.android.dazhihui.ui.delegate.c.d.h.length];
    this.aJ = com.android.dazhihui.ui.delegate.c.d.i;
    this.aK = com.android.dazhihui.ui.delegate.c.d.h;
    ArrayList localArrayList = new ArrayList();
    int i1 = 0;
    while (i1 < this.aK.length)
    {
      localArrayList.add(this.aK[i1]);
      i1 += 1;
    }
    this.s.a(localArrayList, 0, false);
    this.s.setEditable(false);
  }
  
  public void k()
  {
    this.aM = new String[com.android.dazhihui.ui.delegate.c.d.j.length];
    this.aN = new String[com.android.dazhihui.ui.delegate.c.d.k.length];
    this.aM = com.android.dazhihui.ui.delegate.c.d.k;
    this.aN = com.android.dazhihui.ui.delegate.c.d.j;
    ArrayList localArrayList = new ArrayList();
    int i1 = 0;
    while (i1 < this.aN.length)
    {
      localArrayList.add(this.aN[i1]);
      i1 += 1;
    }
    this.s.a(localArrayList, 0, false);
    this.s.setEditable(false);
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    if (paramh == this.aL) {
      C();
    }
    if (isAdded())
    {
      if (((BaseActivity)getActivity()).getLoadingDialog().isShowing()) {
        ((BaseActivity)getActivity()).getLoadingDialog().dismiss();
      }
      if (getActivity() == b.a().f()) {
        a(5);
      }
    }
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    this.ay = com.android.dazhihui.c.a.a.L;
    if (e.a().b() != null)
    {
      paramBundle = e.a().b();
      if (paramBundle != null)
      {
        this.ae = paramBundle.getBoolean("haveNoLoginSorHaveOne");
        this.d = paramBundle.getString("depart");
        if (this.d == null) {
          this.d = "";
        }
        this.e = paramBundle.getString("depart_hz");
        if (this.e == null) {
          this.e = "";
        }
        this.aC = paramBundle.getString("gotoFlag");
        this.aD = paramBundle.getBoolean("xcLoginProcedure");
        this.f = paramBundle.getBoolean("fromBrokerList");
        this.g = true;
      }
      e.a().a(null);
      System.out.println("进入TradeLoginTab了        onActivityCreated  setLoginBundle(null)   ");
      System.out.println("进入TradeLoginTab了      onActivityCreated   haveNoLoginSorHaveOne   " + this.ae);
    }
    if (this.aF) {
      v();
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.z = paramLayoutInflater.inflate(2130903127, paramViewGroup, false);
    int i1;
    if ((com.android.dazhihui.c.a.a.E != null) && (com.android.dazhihui.c.a.a.E.length > 0) && ((com.android.dazhihui.c.a.a.M == null) || (com.android.dazhihui.c.a.a.M.length < 1)))
    {
      paramLayoutInflater = new ArrayList();
      i1 = 0;
      while (i1 < com.android.dazhihui.c.a.a.E.length)
      {
        if (!paramLayoutInflater.contains(com.android.dazhihui.c.a.a.E[i1][0])) {
          paramLayoutInflater.add(com.android.dazhihui.c.a.a.E[i1][0]);
        }
        i1 += 1;
      }
      i1 = paramLayoutInflater.size() - 1;
      while (i1 >= 0)
      {
        o.a(((String)paramLayoutInflater.get(i1)).toString(), getActivity());
        i1 -= 1;
      }
    }
    paramLayoutInflater = com.android.dazhihui.c.a.a.M;
    int i2;
    if ((paramLayoutInflater == null) || (paramLayoutInflater.length > 0))
    {
      i2 = 0;
      if (i2 < paramLayoutInflater.length)
      {
        i1 = 0;
        label164:
        if (i1 >= com.android.dazhihui.c.a.a.F.length) {
          break label273;
        }
        if ((!com.android.dazhihui.c.a.a.F[i1].contains(paramLayoutInflater[i2])) || (com.android.dazhihui.c.a.a.C[i1].length < 5) || (!com.android.dazhihui.c.a.a.C[i1][4].trim().equals("11"))) {}
      }
    }
    for (;;)
    {
      if (i1 != -1) {
        o.b(paramLayoutInflater[i2], getActivity());
      }
      i2 += 1;
      break;
      i1 += 1;
      break label164;
      l();
      m();
      this.W = true;
      return this.z;
      label273:
      i1 = -1;
    }
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
    this.aE = paramBoolean;
  }
  
  public void onResume()
  {
    super.onResume();
    if ((!o.r()) && (this.aF) && (!this.aE) && (!this.W)) {
      v();
    }
    this.W = false;
  }
  
  public void refresh()
  {
    if ((this.A.getVisibility() == 0) && (this.n != null) && (this.aF)) {
      v();
    }
  }
  
  public void setUserVisibleHint(boolean paramBoolean)
  {
    super.setUserVisibleHint(paramBoolean);
    if (paramBoolean) {
      show();
    }
    this.aF = paramBoolean;
  }
  
  public void show()
  {
    super.show();
    this.aC = null;
    this.aD = false;
    this.f = false;
    this.ae = false;
    this.W = true;
    if (this.z != null)
    {
      if (e.a().b() != null)
      {
        Bundle localBundle = e.a().b();
        if (localBundle != null)
        {
          this.d = localBundle.getString("depart");
          if (this.d == null) {
            this.d = "";
          }
          this.e = localBundle.getString("depart_hz");
          if (this.e == null) {
            this.e = "";
          }
          this.aC = localBundle.getString("gotoFlag");
          this.ae = localBundle.getBoolean("haveNoLoginSorHaveOne");
          System.out.println("进入TradeLoginTab了        show  haveNoLoginSorHaveOne   " + this.ae);
          this.aD = localBundle.getBoolean("xcLoginProcedure");
          this.f = localBundle.getBoolean("fromBrokerList");
          this.g = true;
        }
        e.a().a(null);
      }
      v();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\dy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */