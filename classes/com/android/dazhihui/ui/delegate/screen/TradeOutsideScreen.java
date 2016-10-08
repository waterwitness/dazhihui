package com.android.dazhihui.ui.delegate.screen;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputFilter;
import android.text.InputFilter.AllCaps;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LayoutAnimationController;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.b.b;
import com.android.dazhihui.c.a.a;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.view.MyLetterListView;
import com.android.dazhihui.ui.model.stock.MenuConfigVo.FirstMenuItem;
import com.android.dazhihui.ui.model.stock.MenuManager;
import com.android.dazhihui.ui.screen.AdvertBaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.DzhMainHeader;
import com.android.dazhihui.ui.widget.adv.AdvertView;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.dd;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TradeOutsideScreen
  extends AdvertBaseActivity
  implements com.android.dazhihui.ui.a.g, cp, cs, dd
{
  Short a = Short.valueOf((short)0);
  List<com.android.dazhihui.ui.delegate.c.e> b = new ArrayList();
  List<com.android.dazhihui.ui.delegate.c.e> c = new ArrayList();
  String[] d = null;
  private AutoCompleteTextView e;
  private ListView f;
  private DzhHeader g;
  private DzhMainHeader h;
  private String i = "湘财证券";
  private boolean j;
  private boolean k = false;
  private int l = 0;
  private boolean m;
  private String n;
  private boolean o;
  private String p;
  private MyLetterListView q;
  private ArrayList<Map<String, Object>> r;
  private gr s;
  private HashMap<String, Object> t;
  private String[] u;
  private TextView v;
  private Handler w;
  private gq x;
  private HashMap<String, Integer> y;
  private int z = 0;
  
  private void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      getLoadingDialog().show();
    }
    com.android.dazhihui.ui.a.e.a().a(new gk(this, this));
  }
  
  private void b(String paramString)
  {
    if ((paramString == null) || (paramString.equals(""))) {
      break label13;
    }
    label13:
    while (o.a(paramString, this.n, this, true)) {
      return;
    }
    a.z = paramString;
    if (a.i != null)
    {
      if ((!this.j) && (a.E != null) && (a.E.length > 0))
      {
        i1 = 0;
        while (i1 < a.E.length)
        {
          if (a.E[i1][0].equals(paramString))
          {
            Bundle localBundle = com.android.dazhihui.ui.a.e.a().b();
            paramString = localBundle;
            if (localBundle == null) {
              paramString = new Bundle();
            }
            paramString.putBoolean("fromBrokerList", true);
            com.android.dazhihui.ui.a.e.a().a(paramString);
            o.a(this);
            return;
          }
          i1 += 1;
        }
      }
      int i2 = com.android.dazhihui.ui.a.e.a().j();
      int i1 = 0;
      for (;;)
      {
        if (i1 >= a.i.length) {
          break label448;
        }
        if (a.i[i1][2].equals(paramString))
        {
          com.android.dazhihui.ui.a.e.a().a(i1);
          if ((i2 != -1) && (i2 == i1))
          {
            if (com.android.dazhihui.g.a().H() != null)
            {
              f();
              return;
            }
            if ((o.l()) || (o.m()))
            {
              f();
              return;
            }
            i1 = com.android.dazhihui.ui.a.e.a().j();
            if (!TextUtils.isEmpty(a.B[i1][0]))
            {
              com.android.dazhihui.g.a().a(a.B[i1], a.K[i1], null);
              com.android.dazhihui.ui.a.e.a().a(this);
              getLoadingDialog().show();
              return;
            }
            paramString = n.a(a.D[i1], null);
            if (TextUtils.isEmpty(paramString)) {
              break;
            }
            paramString = n.d(paramString);
            com.android.dazhihui.a.g.a().d(false);
            com.android.dazhihui.g.a().f(paramString[0]);
            com.android.dazhihui.g.a().h(Integer.parseInt(paramString[1]));
            f();
            return;
          }
          i1 = com.android.dazhihui.ui.a.e.a().j();
          if (!TextUtils.isEmpty(a.B[i1][0]))
          {
            com.android.dazhihui.g.a().a(a.B[i1], a.K[i1], null);
            com.android.dazhihui.ui.a.e.a().a(this);
            getLoadingDialog().show();
            return;
          }
          if ((o.l()) || (o.m()))
          {
            f();
            return;
          }
          paramString = n.a(a.D[i1], null);
          if (TextUtils.isEmpty(paramString)) {
            break;
          }
          paramString = n.d(paramString);
          com.android.dazhihui.a.g.a().d(false);
          com.android.dazhihui.g.a().f(paramString[0]);
          com.android.dazhihui.g.a().h(Integer.parseInt(paramString[1]));
          f();
          return;
        }
        i1 += 1;
      }
    }
    label448:
    a(3);
  }
  
  private String c(String paramString)
  {
    if (paramString == null) {
      return "#";
    }
    if (paramString.trim().length() == 0) {
      return "#";
    }
    char c1 = paramString.trim().substring(0, 1).charAt(0);
    if (Pattern.compile("^[A-Za-z]+$").matcher(c1 + "").matches()) {
      return (c1 + "").toUpperCase();
    }
    return "#";
  }
  
  private void e()
  {
    int i2 = 0;
    int i1 = 0;
    if ((this.m) || (this.o))
    {
      if ((a.F == null) || (a.F.length <= 0)) {
        break label141;
      }
      if (i1 >= a.F.length) {
        break label141;
      }
      if (!a.F[i1].contains("湘财证券")) {}
    }
    label133:
    label141:
    for (String str = a.F[i1];; str = "湘财证券")
    {
      b(str);
      return;
      i1 += 1;
      break;
      if (this.p != null)
      {
        i1 = 0;
        if (i1 >= a.F.length) {
          break label133;
        }
        if (a.F[i1].contains(this.p)) {
          str = a.F[i1];
        }
      }
      for (i1 = 1;; i1 = i2)
      {
        if (i1 != 0)
        {
          b(str);
          return;
          i1 += 1;
          break;
        }
        i();
        return;
        str = "";
      }
    }
  }
  
  private void f()
  {
    int i1 = 1;
    if ((!isFinishing()) && (getLoadingDialog().isShowing())) {
      getLoadingDialog().dismiss();
    }
    int i2 = com.android.dazhihui.ui.a.e.a().j();
    o.t();
    o.a(null);
    if ((i2 < 0) || (i2 >= a.i.length)) {}
    for (;;)
    {
      return;
      if (a.i[i2][2] != null)
      {
        if ((a.i[i2][0].length() != 0) && (a.i[i2][1].length() != 0)) {
          break;
        }
        try
        {
          i2 = Integer.valueOf(a.C[i2][3]).intValue();
          i1 = i2;
        }
        catch (NumberFormatException localNumberFormatException)
        {
          for (;;)
          {
            localNumberFormatException.printStackTrace();
            System.out.println("Unknown mobile auth mode detected, reset to normal auth routine");
          }
          switch (i1)
          {
          default: 
            new AlertDialog.Builder(this).setTitle(2131166406).setMessage("目前版本不支持该券商，请升级至最新版本！").setPositiveButton(2131165363, new gl(this)).create().show();
          }
        }
        if ((o.l()) || (o.m()))
        {
          o.a(this, this.k);
          return;
        }
        while (this.p != null)
        {
          finish();
          return;
          o.a(this, this.n, this.o, this.k);
          if ((this.m) || (this.o))
          {
            finish();
            continue;
            o.f(this, this.k);
            continue;
            o.d(this, this.k);
            continue;
            o.c(this, this.k);
            continue;
            o.e(this, this.k);
            continue;
            o.b(this, this.k);
          }
        }
      }
    }
    o.b(this, this.n, this.o, this.k);
  }
  
  private void g()
  {
    this.h = this.g.getTradeLoginChildPapeIndicator();
    this.h.setOnCheckedChangeListener(this);
    this.h.e();
    Object localObject1 = "A股";
    Object localObject2 = "港美";
    Object localObject5 = MenuManager.getInstance().getTradeMenu();
    Object localObject3 = localObject2;
    Object localObject4 = localObject1;
    if (localObject5 != null)
    {
      localObject5 = ((List)localObject5).iterator();
      localObject3 = localObject2;
      localObject4 = localObject1;
      if (((Iterator)localObject5).hasNext())
      {
        localObject3 = (MenuConfigVo.FirstMenuItem)((Iterator)localObject5).next();
        if (((MenuConfigVo.FirstMenuItem)localObject3).id == 22)
        {
          localObject3 = ((MenuConfigVo.FirstMenuItem)localObject3).fname;
          localObject1 = localObject2;
          localObject2 = localObject3;
        }
      }
    }
    for (;;)
    {
      localObject3 = localObject2;
      localObject2 = localObject1;
      localObject1 = localObject3;
      break;
      if (((MenuConfigVo.FirstMenuItem)localObject3).id == 23)
      {
        localObject3 = ((MenuConfigVo.FirstMenuItem)localObject3).fname;
        localObject2 = localObject1;
        localObject1 = localObject3;
        continue;
        localObject1 = new ArrayList();
        ((List)localObject1).add(localObject4);
        ((List)localObject1).add(localObject3);
        if (this.h != null)
        {
          this.h.a(this, 7, (List)localObject1);
          this.h.a(this.l, -1);
        }
      }
      else
      {
        localObject3 = localObject1;
        localObject1 = localObject2;
        localObject2 = localObject3;
      }
    }
  }
  
  private void h()
  {
    int i1 = Integer.parseInt(getSharedPreferences("NoticeListRefreshTime", 0).getString("NoticeListRefreshTime", "0"));
    int i2 = m.a().p() * 10000 + m.a().n() * 100 + m.a().o();
    if ((a.N == null) || (i2 > i1)) {
      com.android.dazhihui.ui.a.e.a().b(new gn(this, this, i2));
    }
  }
  
  private void i()
  {
    int i2 = 0;
    this.b.clear();
    this.c.clear();
    Object localObject1;
    Object localObject2;
    if (a.F != null)
    {
      localObject1 = a.F;
      localObject2 = a.I;
      i1 = 0;
      if (i1 < localObject1.length)
      {
        localObject2 = localObject1[i1];
        String str1 = a.I[i1];
        String str2 = a.I[i1];
        localObject2 = new com.android.dazhihui.ui.delegate.c.e((String)localObject2, new String[] { str1 }, str2);
        if (this.l == 1) {
          if (o.b(i1))
          {
            this.b.add(localObject2);
            this.c.add(localObject2);
          }
        }
        for (;;)
        {
          i1 += 1;
          break;
          if (!o.b(i1))
          {
            this.b.add(localObject2);
            this.c.add(localObject2);
          }
        }
      }
    }
    Collections.sort(this.b);
    Collections.sort(this.c);
    this.y = new HashMap();
    this.u = new String[this.c.size()];
    int i1 = i2;
    if (i1 < this.c.size())
    {
      localObject2 = c(((com.android.dazhihui.ui.delegate.c.e)this.c.get(i1)).b());
      if (i1 - 1 >= 0) {}
      for (localObject1 = c(((com.android.dazhihui.ui.delegate.c.e)this.c.get(i1 - 1)).b());; localObject1 = " ")
      {
        if (!((String)localObject1).equals(localObject2))
        {
          localObject1 = c(((com.android.dazhihui.ui.delegate.c.e)this.c.get(i1)).b());
          this.y.put(localObject1, Integer.valueOf(i1));
          this.u[i1] = localObject1;
        }
        i1 += 1;
        break;
      }
    }
    c();
  }
  
  private void j()
  {
    this.v = ((TextView)findViewById(2131561078));
    this.v.setVisibility(4);
  }
  
  public boolean OnChildClick(View paramView)
  {
    switch (((Integer)paramView.getTag()).intValue())
    {
    }
    for (;;)
    {
      return true;
      if (this.z != 0) {
        com.android.dazhihui.ui.a.e.a().a(false);
      }
      finish();
    }
  }
  
  public void a()
  {
    f();
  }
  
  public void a(int paramInt)
  {
    Toast localToast;
    if (paramInt == 0)
    {
      localToast = Toast.makeText(this, "未从服务器上取到数据请重试！", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
    }
    if (paramInt == 1)
    {
      localToast = Toast.makeText(this, "  网络连接超时请重试......", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
    }
    if (paramInt == 2)
    {
      localToast = Toast.makeText(this, "未取到券商列表，请重试......", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
    }
    if (paramInt == 3)
    {
      localToast = Toast.makeText(this, "未获取到服务器地址，请重试......", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
    }
    if (paramInt == 4)
    {
      localToast = Toast.makeText(this, "  网络连接异常请重试......", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
    }
  }
  
  public void a(CompoundButton paramCompoundButton, int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.l = paramInt;
      if ((a.F != null) && (a.F.length > 0)) {
        i();
      }
      this.e.setText("");
      ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(this.e.getWindowToken(), 0);
    }
  }
  
  protected void a(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      d();
      c();
      return;
    }
    paramString = paramString.toString().toUpperCase();
    this.c.clear();
    int i2 = this.b.size();
    int i1 = 0;
    label51:
    com.android.dazhihui.ui.delegate.c.e locale;
    String str;
    if (i1 < i2)
    {
      locale = (com.android.dazhihui.ui.delegate.c.e)this.b.get(i1);
      str = locale.a().toUpperCase();
      if (!paramString.equals("")) {
        break label110;
      }
      this.c.add(locale);
    }
    for (;;)
    {
      i1 += 1;
      break label51;
      break;
      label110:
      if ((str.startsWith(paramString)) || (locale.a(paramString)))
      {
        this.c.add(locale);
        Collections.sort(this.c);
      }
    }
  }
  
  public void b()
  {
    if (getLoadingDialog().isShowing()) {
      getLoadingDialog().dismiss();
    }
  }
  
  public void c()
  {
    int i2 = 0;
    this.r = new ArrayList();
    this.d = new String[this.c.size()];
    this.u = new String[this.c.size()];
    int i1 = 0;
    String str2;
    String str1;
    if (i1 < this.c.size())
    {
      this.d[i1] = ((com.android.dazhihui.ui.delegate.c.e)this.c.get(i1)).a();
      str2 = c(((com.android.dazhihui.ui.delegate.c.e)this.c.get(i1)).b());
      if (i1 - 1 >= 0) {}
      for (str1 = c(((com.android.dazhihui.ui.delegate.c.e)this.c.get(i1 - 1)).b());; str1 = "")
      {
        if (!str1.equals(str2))
        {
          str1 = c(((com.android.dazhihui.ui.delegate.c.e)this.c.get(i1)).b());
          this.y.put(str1, Integer.valueOf(i1));
          this.u[i1] = str1;
          this.t = new HashMap();
          this.t.put("title", str1);
          this.t.put("id", Integer.valueOf(-1));
          this.r.add(this.t);
        }
        this.t = new HashMap();
        this.t.put("title", this.d[i1]);
        this.t.put("id", Integer.valueOf(i1));
        this.r.add(this.t);
        i1 += 1;
        break;
      }
    }
    this.s = new gr(this, this, this.r);
    this.f.setAdapter(this.s);
    i1 = i2;
    if (i1 < this.c.size())
    {
      str2 = c(((com.android.dazhihui.ui.delegate.c.e)this.c.get(i1)).b());
      if (i1 - 1 >= 0) {}
      for (str1 = c(((com.android.dazhihui.ui.delegate.c.e)this.c.get(i1 - 1)).b());; str1 = " ")
      {
        if (!str1.equals(str2))
        {
          str1 = c(((com.android.dazhihui.ui.delegate.c.e)this.c.get(i1)).b());
          this.y.put(str1, Integer.valueOf(i1));
          this.u[i1] = str1;
        }
        i1 += 1;
        break;
      }
    }
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (go.a[paramy.ordinal()])
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
    paramct.a = 56;
  }
  
  public void d()
  {
    this.c.clear();
    int i1 = 0;
    while (i1 < this.b.size())
    {
      this.c.add(this.b.get(i1));
      i1 += 1;
    }
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.g = paramDzhHeader;
  }
  
  public void handleResponse(h paramh, j paramj) {}
  
  public void handleTimeout(h paramh)
  {
    if (getLoadingDialog().isShowing()) {
      getLoadingDialog().dismiss();
    }
    if (this == b.a().f()) {
      a(1);
    }
  }
  
  public void init(Bundle paramBundle)
  {
    int i1 = 0;
    int i2 = 1;
    paramBundle = getIntent().getExtras();
    boolean bool;
    Object localObject;
    if (paramBundle != null)
    {
      this.l = paramBundle.getInt("mode");
      this.z = paramBundle.getInt("loginfragmentfalg");
      this.n = paramBundle.getString("gotoFlag");
      if ((this.n != null) && (!this.n.equals("138")) && (!this.n.equals("139")) && (!this.n.equals("chedan")) && (!this.n.equals("chicang")))
      {
        bool = true;
        this.m = bool;
        this.o = paramBundle.getBoolean("xcLoginProcedure");
        this.j = paramBundle.getBoolean("isaddqs");
        this.p = paramBundle.getString("gotoQsName");
        this.k = paramBundle.getBoolean("haveNoLoginSorHaveOne");
        System.out.println("TradeOutsideScreen  haveNoLoginSorHaveOne   " + this.k);
      }
    }
    else
    {
      h();
      com.android.dazhihui.ui.a.e.a().a(this);
      setContentView(2130903540);
      paramBundle = (AdvertView)findViewById(2131561075);
      paramBundle.setAdvCode(143);
      a(paramBundle);
      this.g = ((DzhHeader)findViewById(2131558869));
      this.g.setOnHeaderButtonClickListener(this);
      this.g.a(this, this);
      this.f = ((ListView)findViewById(2131561076));
      this.f.setOnItemClickListener(new gt(this));
      this.e = ((AutoCompleteTextView)findViewById(2131561074));
      this.e.setFilters(new InputFilter[] { new InputFilter.AllCaps() });
      this.e.addTextChangedListener(new gm(this));
      paramBundle = new AnimationSet(true);
      localObject = new AlphaAnimation(0.0F, 1.0F);
      ((Animation)localObject).setDuration(50L);
      paramBundle.addAnimation((Animation)localObject);
      localObject = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, -1.0F, 1, 0.0F);
      ((Animation)localObject).setDuration(200L);
      paramBundle.addAnimation((Animation)localObject);
      paramBundle = new LayoutAnimationController(paramBundle, 0.5F);
      this.f.setLayoutAnimation(paramBundle);
      this.q = ((MyLetterListView)findViewById(2131561077));
      this.q.setOnTouchingLetterChangedListener(new gp(this, null));
      this.w = new Handler();
      this.x = new gq(this, null);
      j();
      g();
      if ((a.F == null) || (a.F.length <= 0)) {
        break label635;
      }
      if ((!this.m) && (!this.o)) {
        break label563;
      }
      localObject = "湘财证券";
    }
    for (;;)
    {
      paramBundle = (Bundle)localObject;
      if (i1 < a.F.length)
      {
        if (a.F[i1].contains("湘财证券")) {
          paramBundle = a.F[i1];
        }
      }
      else
      {
        b(paramBundle);
        return;
        bool = false;
        break;
      }
      i1 += 1;
    }
    label563:
    if (this.p != null)
    {
      i1 = 0;
      if (i1 >= a.F.length) {
        break label643;
      }
      if (a.F[i1].contains(this.p))
      {
        paramBundle = a.F[i1];
        i1 = i2;
      }
    }
    for (;;)
    {
      if (i1 != 0)
      {
        b(paramBundle);
        return;
        i1 += 1;
        break;
      }
      a(false);
      for (;;)
      {
        n.a("", 1027);
        return;
        label635:
        a(true);
      }
      label643:
      i1 = 0;
      paramBundle = "";
    }
  }
  
  public void netException(h paramh, Exception paramException)
  {
    if (getLoadingDialog().isShowing()) {
      getLoadingDialog().dismiss();
    }
    if (this == b.a().f()) {
      a(4);
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    com.android.dazhihui.ui.a.e.a().b(this);
  }
  
  protected void onFinish() {}
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      if (this.z != 0)
      {
        com.android.dazhihui.ui.a.e.a().a(false);
        finish();
      }
    }
    else {
      return false;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\TradeOutsideScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */