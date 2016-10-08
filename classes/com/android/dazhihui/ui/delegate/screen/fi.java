package com.android.dazhihui.ui.delegate.screen;

import android.annotation.SuppressLint;
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
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.b.b;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.a.e;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.c;
import com.android.dazhihui.ui.delegate.r;
import com.android.dazhihui.ui.delegate.screen.hk.bk;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.stock.MainScreen;
import com.android.dazhihui.ui.screen.stock.offlinecapital.OfflineCapitalDetailActivity;
import com.android.dazhihui.ui.screen.stock.offlinecapital.OfflineCapitalMine;
import com.android.dazhihui.ui.widget.DropDownEditTextView;
import com.android.dazhihui.ui.widget.DropDownEditTextView2;
import com.android.dazhihui.ui.widget.adv.AdvertView;
import com.android.dazhihui.ui.widget.gn;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;

@SuppressLint({"ValidFragment"})
public class fi
  extends com.android.dazhihui.ui.screen.a
  implements r
{
  private ImageView A;
  private LinearLayout B;
  private TextView C;
  private ImageView D;
  private LinearLayout E;
  private TextView F;
  private TextView G;
  private boolean H;
  private final int I = 180;
  private final int J = 5;
  private int K = 365;
  private int L = 1;
  private int M = 0;
  private int N = 175;
  private int O = 2;
  private PopupWindow P;
  private boolean Q = false;
  private boolean R = true;
  private Handler S;
  private String T;
  private com.android.dazhihui.c.a.a a;
  private Button b;
  private ScrollView c;
  private DropDownEditTextView d;
  private DropDownEditTextView2 e;
  private EditText f;
  private LinearLayout g;
  private TextView h;
  private View i;
  private RelativeLayout j;
  private View k;
  private View l;
  private ImageView m;
  private TextView n;
  private gn o;
  private boolean p;
  private Toast q;
  private String r = "";
  private String s = "";
  private boolean t = false;
  private com.android.dazhihui.a.b.u u;
  private SeekBar v;
  private TextView w;
  private Button x;
  private TextView y;
  private TextView z;
  
  private long a(String paramString, int paramInt)
  {
    if (paramInt == 0) {}
    try
    {
      return Long.parseLong(paramString);
    }
    catch (Exception paramString)
    {
      long l1;
      paramString.printStackTrace();
    }
    l1 = Long.parseLong(paramString, paramInt);
    return l1;
    return 0L;
  }
  
  private String a(String paramString1, String paramString2)
  {
    for (;;)
    {
      try
      {
        arrayOfString = new String[paramString2.length() / 2];
        i1 = 0;
        if (i1 >= paramString2.length()) {
          break label197;
        }
        arrayOfString[(i1 / 2)] = (a(paramString2.substring(i1, i1 + 2), 16) + "");
        i1 += 2;
        continue;
        if (paramString2.length() < arrayOfString.length)
        {
          paramString2 = paramString2 + paramString1;
          continue;
        }
        str = paramString2.substring(0, arrayOfString.length);
        paramString1 = "";
        i1 = 0;
      }
      catch (Exception paramString2)
      {
        try
        {
          String[] arrayOfString;
          int i1;
          String str;
          if (i1 >= arrayOfString.length) {
            break label191;
          }
          paramString2 = paramString1 + (a(str.substring(i1, i1 + 1), 0) ^ a(arrayOfString[i1], 0));
          i1 += 1;
          paramString1 = paramString2;
        }
        catch (Exception paramString2)
        {
          continue;
        }
        paramString2 = paramString2;
        paramString1 = "";
        paramString2.printStackTrace();
        paramString2 = paramString1;
      }
      paramString2 = paramString1;
      label191:
      return paramString2;
      label197:
      paramString2 = paramString1;
    }
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
  
  private void a(String paramString)
  {
    g();
    com.android.dazhihui.c.a.a.z = paramString;
    this.a.a(34);
    this.a.close();
    q();
  }
  
  private void b(int paramInt)
  {
    View localView = getActivity().getLayoutInflater().inflate(2130903363, null);
    boolean bool;
    if (paramInt < 1440)
    {
      bool = true;
      this.H = bool;
      if (this.P == null)
      {
        this.P = new PopupWindow(localView, -1, -1, true);
        this.B = ((LinearLayout)localView.findViewById(2131560172));
        this.z = ((TextView)localView.findViewById(2131560174));
        this.A = ((ImageView)localView.findViewById(2131560173));
        this.E = ((LinearLayout)localView.findViewById(2131560175));
        this.C = ((TextView)localView.findViewById(2131560177));
        this.D = ((ImageView)localView.findViewById(2131560176));
        this.y = ((TextView)localView.findViewById(2131560182));
        this.F = ((TextView)localView.findViewById(2131560178));
        this.G = ((TextView)localView.findViewById(2131560179));
        this.v = ((SeekBar)localView.findViewById(2131560180));
        this.w = ((TextView)localView.findViewById(2131560181));
        this.x = ((Button)localView.findViewById(2131560183));
        this.x.setOnClickListener(new fn(this));
        this.P.setFocusable(true);
        this.P.setTouchable(true);
        this.P.setOutsideTouchable(true);
        this.P.setBackgroundDrawable(new ColorDrawable(-1308622848));
        this.v.setOnSeekBarChangeListener(new fo(this));
        this.B.setOnClickListener(new fp(this));
        this.E.setOnClickListener(new fq(this));
        if (!this.H) {
          break label449;
        }
        this.y.setText("分钟");
        this.F.setText("5");
        this.G.setText("180");
        this.z.setTextColor(-16777216);
        this.A.setImageResource(2130838253);
        this.C.setTextColor(getResources().getColor(2131493178));
        this.D.setImageResource(2130838254);
        this.v.setMax(175);
        this.v.setProgress(paramInt - 5);
      }
    }
    for (;;)
    {
      this.P.showAtLocation(getActivity().getWindow().getDecorView(), 49, 0, 0);
      return;
      bool = false;
      break;
      label449:
      this.y.setText("天");
      this.F.setText(this.L + "");
      this.G.setText(this.K + "");
      this.C.setTextColor(-16777216);
      this.D.setImageResource(2130838253);
      this.z.setTextColor(getResources().getColor(2131493178));
      this.A.setImageResource(2130838254);
      this.v.setMax(this.K - this.L);
      this.v.setProgress(paramInt / 24 / 60 - this.L);
    }
  }
  
  private void b(String paramString)
  {
    int i6 = 0;
    String[][] arrayOfString = (String[][])Array.newInstance(String.class, new int[] { com.android.dazhihui.c.a.a.E.length - 1, 3 });
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i1;
    if (i2 < com.android.dazhihui.c.a.a.E.length)
    {
      if (this.d.getCurrentItem().equals(com.android.dazhihui.c.a.a.E[i2][0]))
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
      this.a.a(39);
      this.a.close();
    }
    if (i3 == 0) {
      if (com.android.dazhihui.c.a.a.i != null)
      {
        i1 = 0;
        if (i1 < com.android.dazhihui.c.a.a.i.length)
        {
          if (com.android.dazhihui.c.a.a.i[i1][2].equals(this.d.getCurrentItem()))
          {
            com.android.dazhihui.c.a.a.i[i1][0] = "";
            com.android.dazhihui.c.a.a.i[i1][1] = "";
          }
        }
        else
        {
          this.a.a(19);
          this.a.close();
        }
      }
      else
      {
        if (com.android.dazhihui.c.a.a.A.length <= 1) {
          break label542;
        }
      }
    }
    label537:
    label542:
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
            if (!com.android.dazhihui.c.a.a.A[i1].equals(this.d.getCurrentItem()))
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
        this.a.a(35);
        this.a.close();
        if (com.android.dazhihui.c.a.a.M.length <= 1) {
          break label537;
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
              if (!com.android.dazhihui.c.a.a.M[i1].equals(this.d.getCurrentItem()))
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
        }
        for (;;)
        {
          com.android.dazhihui.c.a.a.M = paramString;
          this.a.a(49);
          this.a.close();
          if (com.android.dazhihui.ui.delegate.a.a().e().equals(this.d.getCurrentItem()))
          {
            com.android.dazhihui.ui.delegate.a.a().a("");
            com.android.dazhihui.ui.delegate.a.a().b("");
          }
          p();
          f();
          return;
          paramString = new String[0];
        }
      }
    }
  }
  
  private void c(String paramString)
  {
    int i2 = 0;
    if (o.r) {
      paramString = o.s;
    }
    ArrayList localArrayList = new ArrayList();
    if ((com.android.dazhihui.c.a.a.E != null) && (com.android.dazhihui.c.a.a.E.length > 0))
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
    int i1 = i2;
    if (this.s != null)
    {
      i1 = i2;
      if (localArrayList.contains(this.s)) {
        i1 = localArrayList.indexOf(this.s);
      }
    }
    this.e.a(localArrayList, i1, true);
    this.e.setEditable(true);
    this.e.setCanDelItem(true);
  }
  
  private void h()
  {
    this.a = new com.android.dazhihui.c.a.a(getActivity());
    this.a.close();
    AdvertView localAdvertView = (AdvertView)this.i.findViewById(2131560880);
    localAdvertView.setAdvCode(140);
    addAdvert(localAdvertView);
    this.d = ((DropDownEditTextView)this.i.findViewById(2131560714));
    this.d.setEditable(false);
    this.j = ((RelativeLayout)this.i.findViewById(2131560864));
    this.j.setVisibility(0);
    this.e = ((DropDownEditTextView2)this.i.findViewById(2131560868));
    this.f = ((EditText)this.i.findViewById(2131560872));
    this.k = this.i.findViewById(2131560874);
    this.g = ((LinearLayout)this.i.findViewById(2131560878));
    this.h = ((TextView)this.i.findViewById(2131558534));
    this.k.setOnClickListener(new fj(this));
    this.l = this.i.findViewById(2131560876);
    this.l.setOnClickListener(new fr(this));
    this.n = ((TextView)this.i.findViewById(2131560877));
    this.m = ((ImageView)this.i.findViewById(2131560875));
    this.d.setOnItemChangeListener(new fs(this));
    this.e.setOnItemChangeListener(new ft(this));
    this.e.setOnListItemImageClickListener(new fu(this));
    this.b = ((Button)this.i.findViewById(2131560879));
    this.b.setFocusable(true);
    this.b.setOnClickListener(new fx(this));
    this.S = new fy(this);
    this.c = ((ScrollView)this.i.findViewById(2131558978));
  }
  
  private void i()
  {
    a(this.f);
    this.o = new gn(getActivity(), getActivity(), this.f, this.c);
    this.o.c();
    this.f.setOnTouchListener(new fz(this));
    this.f.setOnFocusChangeListener(new ga(this));
    a(this.e.getMEditText());
    this.e.getMEditText().setOnTouchListener(new fk(this));
    this.e.getMEditText().setOnFocusChangeListener(new fl(this));
  }
  
  private void j()
  {
    if (this.b.getText().toString().equals("打开券商"))
    {
      o.a(this.d.getCurrentItem(), "", getActivity(), false);
      return;
    }
    if ((TextUtils.isEmpty(this.e.getCurrentItem())) || (this.f.getText().toString().length() == 0))
    {
      a(0);
      return;
    }
    a(6);
    ((InputMethodManager)getActivity().getSystemService("input_method")).hideSoftInputFromWindow(this.f.getWindowToken(), 0);
    l();
  }
  
  private void k()
  {
    e.a().a(true);
  }
  
  private void l()
  {
    this.a = new com.android.dazhihui.c.a.a(getActivity());
    int i1 = e.a().j();
    if (o.c)
    {
      b();
      return;
    }
    if ((com.android.dazhihui.c.a.a.i != null) && (com.android.dazhihui.c.a.a.i[i1][0] != null) && (!com.android.dazhihui.c.a.a.i[i1][0].equals("")))
    {
      b();
      return;
    }
    this.u = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(15, new com.android.dazhihui.ui.delegate.b.h("13064").h()) });
    registRequestListener(this.u);
    sendRequest(this.u);
    ((BaseActivity)getActivity()).getLoadingDialog().show();
  }
  
  private void m()
  {
    if (this.M != com.android.dazhihui.c.a.a.L)
    {
      com.android.dazhihui.c.a.a.L = this.M;
      this.a.a(47);
      this.a.close();
    }
    if (this.M != 0)
    {
      this.m.setImageResource(2130838901);
      if (this.M >= 1440) {
        this.n.setText(String.valueOf(this.M / 24 / 60) + "天");
      }
      for (;;)
      {
        this.l.setVisibility(0);
        return;
        this.n.setText(String.valueOf(this.M) + "分钟");
      }
    }
    this.m.setImageResource(2130838900);
    this.l.setVisibility(8);
  }
  
  private void n()
  {
    if (!o.b(com.android.dazhihui.c.a.a.z))
    {
      com.android.dazhihui.c.a.a.z = "";
      this.a.a(34);
      this.a.close();
    }
    m();
    this.r = com.android.dazhihui.ui.delegate.a.a().e();
    this.s = com.android.dazhihui.ui.delegate.a.a().f();
    p();
    f();
    e.a().a(null);
    this.e.setTransformationMethod(new com.android.dazhihui.ui.delegate.screen.hk.a());
  }
  
  private void o()
  {
    this.f.setText("");
  }
  
  private void p()
  {
    this.d.b();
    this.e.a();
    this.f.setText("");
  }
  
  private void q()
  {
    if (this.b.getText().equals("打开券商")) {
      return;
    }
    c(this.d.getCurrentItem());
    e.a().a(this.d.getCurrentItem(), false, null);
  }
  
  public void a(int paramInt)
  {
    if (this.q == null)
    {
      this.q = Toast.makeText(getActivity(), "", 0);
      this.q.setGravity(17, 0, 0);
    }
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      this.q.setText("　　账号密码都必须填写。");
    }
    for (;;)
    {
      this.q.show();
      return;
      this.q.setText("  网络连接超时请重试......");
      continue;
      this.q.setText("　　验证码输入错误。");
      continue;
      this.q.setText("　　未读取到服务器IP。");
      continue;
      this.q.setText("　　数据读取出现错误，请重新添加账号或者清空委托数据。");
      continue;
      this.q.setText("  网络连接异常请重试......");
      continue;
      this.q.setText("　　正在登录，请稍候……");
      continue;
      this.q.setText("　　账号类型不正确。");
      continue;
      this.q.setText("　　暂不支持该券商。");
    }
  }
  
  public boolean a()
  {
    boolean bool1 = false;
    boolean bool2 = false;
    if (this.o != null)
    {
      bool1 = bool2;
      if (this.o.d()) {
        bool1 = true;
      }
      this.o.c();
    }
    return bool1;
  }
  
  protected void b()
  {
    int i1 = e.a().j();
    if (i1 == -1)
    {
      a(8);
      return;
    }
    c localc = new c();
    localc.a(com.android.dazhihui.c.a.a.i[i1][0]);
    localc.b(com.android.dazhihui.c.a.a.i[i1][1]);
    localc.d(this.e.getCurrentItem().toUpperCase());
    localc.e(this.f.getText().toString());
    localc.a(false);
    localc.b(true);
    localc.c(this.d.getCurrentItem());
    if (o.c)
    {
      localc.a("11111111111");
      localc.b("111111");
      localc.c("南华证券");
      String[] arrayOfString = new String[1];
      arrayOfString[0] = "10.15.108.95:19989";
      if ((arrayOfString != null) && (arrayOfString.length > 0))
      {
        Log.d("trade", "委托地址: " + arrayOfString[0]);
        arrayOfString = n.d(arrayOfString[0]);
        com.android.dazhihui.g.a().f(arrayOfString[0]);
        com.android.dazhihui.g.a().h(Integer.parseInt(arrayOfString[1]));
        com.android.dazhihui.a.g.a().d(false);
      }
    }
    com.android.dazhihui.ui.delegate.a.a().a(this, localc, false);
    ((BaseActivity)getActivity()).getLoadingDialog().show();
  }
  
  public void beforeHidden()
  {
    this.Q = true;
    super.beforeHidden();
  }
  
  public void c()
  {
    bk.c(true);
    Intent localIntent;
    int i1;
    if (isAdded())
    {
      ((BaseActivity)getActivity()).getLoadingDialog().dismiss();
      localIntent = new Intent();
      if ((this.t) || ((o.r) && (o.s.equals(com.android.dazhihui.c.a.a.z)))) {
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
            this.T = com.android.dazhihui.c.a.a.E[i1][2];
          }
        }
        else
        {
          localObject = com.android.dazhihui.c.a.a.z + "_" + this.T;
          d.a().a("offline_capital_state", 2);
          d.a().g();
          Bundle localBundle = new Bundle();
          localBundle.putString("entrustName", (String)localObject);
          localBundle.putBoolean("isRequest", true);
          localIntent.putExtras(localBundle);
          localIntent.setClass(getActivity(), OfflineCapitalDetailActivity.class);
          startActivity(localIntent);
          this.S.sendEmptyMessageDelayed(222, 1000L);
          return;
        }
        i1 += 1;
      }
    }
    if ((o.r) && (com.android.dazhihui.c.a.a.E.length > 1))
    {
      localObject = new Bundle();
      ((Bundle)localObject).putBoolean("isMineRequest", true);
      localIntent.putExtras((Bundle)localObject);
      localIntent.setClass(getActivity(), OfflineCapitalMine.class);
      startActivity(localIntent);
      this.S.sendEmptyMessageDelayed(222, 1000L);
      return;
    }
    Object localObject = new Bundle();
    ((Bundle)localObject).putInt("TAB_ID", 805306368);
    localIntent.setClass(getActivity(), MainScreen.class);
    localIntent.putExtras((Bundle)localObject);
    startActivity(localIntent);
    k();
  }
  
  public void d()
  {
    if (isAdded())
    {
      ((BaseActivity)getActivity()).getLoadingDialog().dismiss();
      o.r = false;
    }
  }
  
  protected void e()
  {
    if (this.l.getVisibility() == 0)
    {
      this.M = 0;
      m();
      return;
    }
    b(180);
  }
  
  public void f()
  {
    int i2 = 0;
    for (;;)
    {
      int i1;
      try
      {
        ArrayList localArrayList = new ArrayList();
        String str;
        if (o.r)
        {
          str = o.s;
          if (com.android.dazhihui.c.a.a.F != null)
          {
            String[] arrayOfString = com.android.dazhihui.c.a.a.F;
            i1 = 0;
            if (i1 < arrayOfString.length)
            {
              if (!o.b(i1)) {
                break label145;
              }
              localArrayList.add(arrayOfString[i1]);
              break label145;
            }
          }
        }
        else
        {
          if ((this.r != null) && (!this.r.equals("")))
          {
            str = this.r;
            continue;
          }
          str = com.android.dazhihui.c.a.a.z;
          continue;
        }
        i1 = i2;
        if (str != null)
        {
          i1 = i2;
          if (localArrayList.contains(str)) {
            i1 = localArrayList.indexOf(str);
          }
        }
        this.d.a(localArrayList, i1, true);
        return;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        a(4);
        return;
      }
      label145:
      i1 += 1;
    }
  }
  
  public void g()
  {
    this.e.a();
    this.f.setText("");
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    int i1;
    if (isAdded())
    {
      ((BaseActivity)getActivity()).getLoadingDialog().dismiss();
      i1 = e.a().j();
      if (paramh == this.u)
      {
        paramh = ((v)paramj).b();
        if (com.android.dazhihui.ui.delegate.b.u.a(paramh, getActivity()))
        {
          paramj = com.android.dazhihui.ui.delegate.b.h.b(paramh.e());
          if (paramj.b()) {
            break label89;
          }
          o.a(null);
          Toast.makeText(getActivity(), paramj.d(), 1).show();
        }
      }
    }
    return;
    label89:
    paramh = paramj.a("2002");
    paramj = a(paramh, paramj.a("2007").trim());
    com.android.dazhihui.c.a.a.z = com.android.dazhihui.c.a.a.i[i1][2];
    com.android.dazhihui.c.a.a.i[i1] = { paramh, paramj, com.android.dazhihui.c.a.a.z };
    this.a.a(19);
    if (com.android.dazhihui.c.a.a.A[0].equals("无"))
    {
      com.android.dazhihui.c.a.a.A[0] = com.android.dazhihui.c.a.a.z;
      this.a.a(35);
    }
    label200:
    label292:
    for (;;)
    {
      this.a.close();
      b();
      return;
      i1 = 0;
      if (i1 < com.android.dazhihui.c.a.a.A.length) {
        if (!com.android.dazhihui.c.a.a.A[i1].equals(com.android.dazhihui.c.a.a.z)) {}
      }
      for (i1 = 0;; i1 = 1)
      {
        if (i1 == 0) {
          break label292;
        }
        paramh = com.android.dazhihui.c.a.a.A;
        com.android.dazhihui.c.a.a.A = null;
        com.android.dazhihui.c.a.a.A = new String[paramh.length + 1];
        System.arraycopy(paramh, 0, com.android.dazhihui.c.a.a.A, 0, paramh.length);
        com.android.dazhihui.c.a.a.A[(com.android.dazhihui.c.a.a.A.length - 1)] = com.android.dazhihui.c.a.a.z;
        this.a.a(35);
        break;
        i1 += 1;
        break label200;
      }
    }
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    if (isAdded())
    {
      if (((BaseActivity)getActivity()).getLoadingDialog().isShowing())
      {
        a(1);
        ((BaseActivity)getActivity()).getLoadingDialog().dismiss();
      }
      if (getActivity() == b.a().f()) {
        a(1);
      }
    }
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
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
    this.M = com.android.dazhihui.c.a.a.L;
    if (this.R) {
      n();
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.i = paramLayoutInflater.inflate(2130903504, paramViewGroup, false);
    if ((com.android.dazhihui.c.a.a.E != null) && (com.android.dazhihui.c.a.a.E.length > 0) && ((com.android.dazhihui.c.a.a.M == null) || (com.android.dazhihui.c.a.a.M.length < 1)))
    {
      paramLayoutInflater = new ArrayList();
      int i1 = 0;
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
    h();
    i();
    this.p = true;
    return this.i;
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
    this.Q = paramBoolean;
  }
  
  public void onResume()
  {
    super.onResume();
    if ((!o.r()) && (this.R) && (!this.Q) && (!this.p)) {
      n();
    }
    this.p = false;
  }
  
  public void refresh()
  {
    if ((this.d != null) && (this.R)) {
      n();
    }
  }
  
  public void setUserVisibleHint(boolean paramBoolean)
  {
    super.setUserVisibleHint(paramBoolean);
    if (paramBoolean) {
      show();
    }
    this.R = paramBoolean;
  }
  
  public void show()
  {
    super.show();
    if (this.i != null) {
      n();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */