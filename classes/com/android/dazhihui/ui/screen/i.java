package com.android.dazhihui.ui.screen;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.android.dazhihui.d.r;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.ExitHandle;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.model.stock.SelfStock;
import com.android.dazhihui.ui.screen.stock.LoginMainScreen;
import com.android.dazhihui.ui.screen.stock.MainScreen;
import com.android.dazhihui.ui.screen.stock.hv;
import com.android.dazhihui.ui.widget.MyWebView;
import com.android.dazhihui.ui.widget.dzhrefresh.DzhRefreshWebView;
import com.android.dazhihui.ui.widget.kb;
import com.android.dazhihui.ui.widget.kf;
import com.android.dazhihui.v;
import com.android.dazhihui.w;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Vector;

public class i
  extends a
  implements hv, v
{
  private y A;
  byte[] a;
  ViewGroup b;
  boolean c;
  boolean d = false;
  boolean e = true;
  public boolean f = false;
  private RelativeLayout g;
  private TextView h;
  private View i;
  private MyWebView j;
  private String k = "";
  private String l = "";
  private boolean m = false;
  private String n;
  private int o = 0;
  private View p;
  private ImageView q;
  private DzhRefreshWebView r;
  private kb s;
  private FrameLayout t;
  private View u;
  private int v = -1;
  private int w = 2131493678;
  private int x = 2131493678;
  private boolean y = false;
  private boolean z = false;
  
  public static i a(Bundle paramBundle)
  {
    i locali = new i();
    locali.setArguments(paramBundle);
    return locali;
  }
  
  public static i a(String paramString1, String paramString2, byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    i locali = new i();
    Bundle localBundle = new Bundle();
    localBundle.putString("nexturl", paramString1);
    localBundle.putString("names", paramString2);
    localBundle.putInt("api_type", paramInt);
    localBundle.putByteArray("post_data", paramArrayOfByte);
    localBundle.putBoolean("ISSHOWTITLE", paramBoolean);
    locali.setArguments(localBundle);
    return locali;
  }
  
  private void a(String paramString1, String paramString2)
  {
    String str;
    if (this.j != null)
    {
      str = this.l;
      if ((str != null) && (!str.isEmpty())) {
        break label24;
      }
    }
    label24:
    do
    {
      do
      {
        return;
      } while (!str.contains(paramString1));
      paramString1 = MyWebView.a(str, paramString1, paramString2);
    } while (paramString1.equals(str));
    this.j.clearHistory();
    this.j.loadUrl(paramString1);
  }
  
  private void b(String paramString)
  {
    try
    {
      paramString = new URL(paramString).getFile();
      if (paramString.startsWith("/exchange/store"))
      {
        this.h.setText(2131165456);
        return;
      }
      if (paramString.startsWith("/adsFrontv/adsMoney.php?service=coinrecord"))
      {
        this.h.setText(2131166340);
        return;
      }
    }
    catch (MalformedURLException paramString)
    {
      this.h.setText(this.n);
      return;
    }
    if (paramString.startsWith("/adsFrontv/moneyCenterCtrl.php"))
    {
      this.h.setText(2131165437);
      return;
    }
    if (paramString.startsWith("/adsFrontv/financialStreet.php?service=index"))
    {
      this.h.setText(2131165603);
      return;
    }
    this.h.setText(this.n);
  }
  
  private void c()
  {
    if ((w.a().l()) && (this.o == 1))
    {
      if (getResources().getString(2131166340).equals(this.h.getText())) {
        this.i.setVisibility(8);
      }
    }
    else {
      return;
    }
    this.i.setVisibility(0);
    this.i.setOnClickListener(new j(this));
  }
  
  private void d()
  {
    this.g = ((RelativeLayout)this.b.findViewById(2131558585));
    this.h = ((TextView)this.b.findViewById(2131558634));
    this.p = this.b.findViewById(2131558633);
    this.q = ((ImageView)this.b.findViewById(2131558637));
    this.i = this.b.findViewById(2131558636);
    if ((this.n != null) && (!this.n.equals(""))) {
      this.h.setText(this.n);
    }
    for (;;)
    {
      this.p.setOnClickListener(new l(this));
      this.q.setOnClickListener(new m(this));
      c();
      this.t = ((FrameLayout)this.b.findViewById(2131558632));
      this.s = new kb(getActivity());
      this.t.addView(this.s);
      return;
      this.n = getResources().getString(2131165355);
      this.h.setText(this.n);
    }
  }
  
  private void e()
  {
    String str2;
    if (this.f)
    {
      str2 = this.l;
      if ((str2 != null) && (!str2.isEmpty())) {
        break label24;
      }
    }
    label24:
    String str1;
    do
    {
      return;
      Vector localVector = SelfSelectedStockManager.getInstance().getSpecialBrowseStockVector();
      str1 = "";
      int i1 = 0;
      if (i1 < localVector.size())
      {
        if (i1 == 0) {}
        for (str1 = ((SelfStock)localVector.get(i1)).getCode();; str1 = str1 + "," + ((SelfStock)localVector.get(i1)).getCode())
        {
          i1 += 1;
          break;
        }
      }
      str1 = MyWebView.a(str2, "code=", str1);
    } while (str1.equals(str2));
    this.j.clearHistory();
    this.j.loadUrl(str1);
  }
  
  private void f()
  {
    this.j.clearHistory();
    String str = "gphcloud";
    if ("app_dzh".equals("app_sb")) {
      str = g.a().t();
    }
    str = "http://ads.gw.com.cn/adsFrontv/adsMoney.php?service=coinrecord" + "&token=" + w.a().o() + "&marked=" + str + "&version=" + g.a().r() + "&deviceId=" + g.a().v();
    this.j.loadUrl(str);
  }
  
  public MyWebView a()
  {
    return this.j;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.x = paramInt2;
    this.w = paramInt1;
  }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    MyWebView localMyWebView;
    if ((this != null) && (a() != null))
    {
      localMyWebView = a();
      if (paramInt1 != 2456) {
        break label151;
      }
      if ((localMyWebView != null) && (localMyWebView.a != null)) {}
    }
    else
    {
      return;
    }
    if ((paramIntent != null) && (paramInt2 == -1)) {}
    for (Uri localUri1 = paramIntent.getData();; localUri1 = null)
    {
      Uri localUri2 = localUri1;
      if (localUri1 == null)
      {
        localUri2 = localUri1;
        if (paramIntent == null)
        {
          localUri2 = localUri1;
          if (paramInt2 == -1)
          {
            localUri2 = localUri1;
            if (localMyWebView.c != null) {
              localUri2 = localMyWebView.c;
            }
          }
        }
      }
      Log.i("GUH", "MyWebVeiw FILECHOOSER_RESULTCODE result=" + localUri2);
      localMyWebView.a.onReceiveValue(localUri2);
      localMyWebView.a = null;
      localMyWebView.c = null;
      return;
      label151:
      if ((paramInt1 != 2457) || (localMyWebView == null) || (localMyWebView.b == null)) {
        break;
      }
      if ((paramIntent != null) && (paramInt2 == -1)) {}
      for (paramIntent = paramIntent.getData();; paramIntent = null)
      {
        Log.i("GUH", "MyWebVeiw FILECHOOSER_RESULTCODE result=" + paramIntent);
        if (paramIntent != null) {
          localMyWebView.b.onReceiveValue(new Uri[] { paramIntent });
        }
        for (;;)
        {
          localMyWebView.b = null;
          return;
          localMyWebView.b.onReceiveValue(new Uri[0]);
        }
      }
    }
  }
  
  public void a(String paramString)
  {
    a("token=", paramString);
  }
  
  public void a(boolean paramBoolean)
  {
    if (this.j != null)
    {
      if (paramBoolean) {}
      try
      {
        this.j.onPause();
        return;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
      this.j.onResume();
      return;
    }
  }
  
  public void b()
  {
    Bundle localBundle = getArguments();
    if (getArguments() != null)
    {
      this.k = localBundle.getString("nexturl");
      this.n = localBundle.getString("names");
      this.o = localBundle.getInt("api_type", 0);
      this.a = localBundle.getByteArray("post_data");
      this.c = localBundle.getBoolean("ISSHOWTITLE", true);
      this.f = localBundle.getBoolean("ISHUITOUGU", false);
      this.v = localBundle.getInt("BROWSER_COUNT_ID", -1);
    }
  }
  
  public void b(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }
  
  public void c(boolean paramBoolean)
  {
    this.m = paramBoolean;
  }
  
  public void changeLookFace(y paramy)
  {
    if ((getActivity() == null) || (getActivity().isFinishing())) {}
    do
    {
      do
      {
        do
        {
          return;
          super.changeLookFace(paramy);
        } while (paramy == null);
        switch (p.a[paramy.ordinal()])
        {
        default: 
          return;
        }
      } while (this.g == null);
      this.g.setBackgroundColor(getResources().getColor(2131493291));
      return;
    } while (this.g == null);
    this.g.setBackgroundColor(getResources().getColor(2131493599));
  }
  
  public View getScroolView()
  {
    return this.j;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    b();
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    if (this.e)
    {
      this.b = ((ViewGroup)paramLayoutInflater.inflate(2130903060, paramViewGroup, false));
      this.u = this.b.findViewById(2131558629);
      if (g.a().b() != y.a) {
        break label418;
      }
      this.u.setBackgroundColor(getResources().getColor(this.x));
      label67:
      paramLayoutInflater = this.b.findViewById(2131558630);
      if (!this.c) {
        break label439;
      }
      paramLayoutInflater.setVisibility(0);
      label90:
      paramLayoutInflater = r.a(this.k, "");
      if ((Boolean.parseBoolean(paramLayoutInflater[2])) && (!w.a().l()))
      {
        paramViewGroup = new Intent(getContext(), LoginMainScreen.class);
        paramViewGroup.putExtra("REGISTER_FROM_TYPE", "FROM_STOCK");
        getContext().startActivity(paramViewGroup);
      }
      this.l = paramLayoutInflater[1];
      this.A = g.a().b();
      this.l = MyWebView.a(this.l, this.A);
      d();
      this.r = ((DzhRefreshWebView)this.b.findViewById(2131558631));
      this.r.setScrollingWhileRefreshingEnabled(true);
      if (!this.e) {
        break label448;
      }
      this.r.setMode(com.handmark.pulltorefresh.library.j.b);
    }
    for (;;)
    {
      this.r.setOnRefreshListener(new n(this));
      this.j = ((MyWebView)this.r.getRefreshableView());
      this.j.setWebViewLoadListener(new o(this));
      this.j.setStatisticsCountId(this.v);
      com.android.dazhihui.o.a().a(this);
      this.j.addJavascriptInterface(new ExitHandle(getActivity()), "jtoJHandle");
      if (this.k.startsWith("http://sq.gw.com.cn/market/register")) {
        this.j.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
      }
      this.s.setRect(new kf(0, 0, g.a().m(), 6));
      this.s.a();
      if ((getActivity() instanceof MainScreen)) {
        ((MainScreen)getActivity()).a(this);
      }
      return this.b;
      this.b = ((ViewGroup)paramLayoutInflater.inflate(2130903061, paramViewGroup, false));
      break;
      label418:
      this.u.setBackgroundColor(getResources().getColor(this.w));
      break label67;
      label439:
      paramLayoutInflater.setVisibility(8);
      break label90;
      label448:
      this.r.setMode(com.handmark.pulltorefresh.library.j.a);
    }
  }
  
  public void onDestroy()
  {
    if (this.j != null)
    {
      if (this.b != null) {
        this.b.removeView(this.j);
      }
      this.j.removeAllViews();
      this.j.destroy();
    }
    com.android.dazhihui.o.a().b(this);
    super.onDestroy();
  }
  
  public void onDestroyView()
  {
    super.onDestroyView();
    this.z = false;
    this.m = false;
    if ((getActivity() instanceof MainScreen)) {
      ((MainScreen)getActivity()).a(null);
    }
  }
  
  public void onFragmentChanged(boolean paramBoolean)
  {
    a(paramBoolean);
    String str;
    if (!paramBoolean)
    {
      e();
      if (this.z) {
        break label174;
      }
      this.z = true;
      this.m = false;
      if (this.a != null) {
        this.j.postUrl(this.l, this.a);
      }
    }
    else if ((!paramBoolean) && (g.a().b() != this.A))
    {
      this.A = g.a().b();
      if (this.j != null)
      {
        str = MyWebView.a(this.l, this.A);
        if (!str.equals(this.l))
        {
          if (g.a().b() != y.a) {
            break label193;
          }
          this.u.setBackgroundColor(getResources().getColor(this.x));
        }
      }
    }
    for (;;)
    {
      this.l = str;
      this.j.clearHistory();
      this.j.loadUrl(str);
      return;
      this.j.loadUrl(this.l);
      break;
      label174:
      if (!this.m) {
        break;
      }
      this.m = false;
      refresh();
      break;
      label193:
      this.u.setBackgroundColor(getResources().getColor(this.w));
    }
  }
  
  public void onPause()
  {
    super.onPause();
  }
  
  public void onPulledrefresh(boolean paramBoolean)
  {
    super.onPulledrefresh(paramBoolean);
    this.y = paramBoolean;
    refresh();
  }
  
  public void onResume()
  {
    super.onResume();
  }
  
  public void refresh()
  {
    if (this.j != null) {
      this.j.reload();
    }
    e();
  }
  
  public void setUserVisibleHint(boolean paramBoolean)
  {
    super.setUserVisibleHint(paramBoolean);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */