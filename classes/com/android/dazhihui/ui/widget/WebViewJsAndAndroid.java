package com.android.dazhihui.ui.widget;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.webkit.JavascriptInterface;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.a.a.a.a.a;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.b.b;
import com.android.dazhihui.d.r;
import com.android.dazhihui.w;
import java.io.PrintStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WebViewJsAndAndroid
  implements View.OnClickListener, i
{
  private static String e = "WebViewJsAndAndroid";
  private static String u = "";
  Handler a = new Handler();
  ImageView b;
  ListView c;
  LinearLayout d;
  private MyWebView f;
  private String g;
  private String h;
  private TextView i;
  private RelativeLayout j;
  private ImageView k;
  private TextView l;
  private LinearLayout m;
  public LayoutInflater mLayoutInflater;
  public View mView;
  private View n;
  private int o = -1;
  private JSONArray p;
  private String[] q;
  private String[] r;
  private PopupWindow s;
  private ho t;
  private m v;
  
  private void a(String paramString)
  {
    x localx = new x(3005);
    localx.b(2);
    localx.a(paramString.getBytes());
    this.v = new m(localx);
    this.v.a(this);
    com.android.dazhihui.a.g.a().a(this.v);
  }
  
  public static String getUseruserInfoJson()
  {
    JSONObject localJSONObject = new JSONObject();
    String str1 = w.a().g();
    String str2 = w.a().f();
    String str3 = com.android.dazhihui.g.a().v();
    String str4 = w.a().o();
    String str5 = com.android.dazhihui.g.a().r();
    try
    {
      localJSONObject.put("nick", str1);
      localJSONObject.put("user", str2);
      localJSONObject.put("mac", str3);
      localJSONObject.put("token", str4);
      localJSONObject.put("client", "2");
      localJSONObject.put("clientVersion", str5);
      u = localJSONObject.toString();
      return u;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        localJSONException.printStackTrace();
      }
    }
  }
  
  @JavascriptInterface
  public void callAppWithChannelAndJsonAndCallbackFunc(String paramString1, String paramString2, String paramString3)
  {
    this.a.post(new nj(this, paramString1, paramString2, paramString3));
  }
  
  @JavascriptInterface
  public void closeWebView()
  {
    if (this.f != null)
    {
      if (this.f.getOnCloseWebViewListener() == null) {
        break label30;
      }
      this.f.getOnCloseWebViewListener().closeWebView();
    }
    label30:
    while (!(this.f.getContext() instanceof Activity)) {
      return;
    }
    ((Activity)this.f.getContext()).finish();
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    if (paramh == this.v)
    {
      paramj = ((o)paramj).h();
      if (paramj != null)
      {
        paramh = paramj.b;
        if ((paramj.a != 3005) || (paramh == null)) {}
      }
    }
    try
    {
      paramj = new q(paramh);
      int i1 = paramh.length;
      paramj.b();
      paramh = new String(paramh, 1, i1 - 1);
      Log.d(e, "Android调用了js方法  contents" + paramh + "contentS 长度  " + paramh.length());
      paramh = a.c(paramh.getBytes("UTF-8"));
      this.f.loadUrl("javascript:" + this.g + "('" + paramh + "')");
      Log.d(e, "Android调用了js方法  " + paramh);
      System.out.println(paramh);
      return;
    }
    catch (Exception paramh)
    {
      paramh.printStackTrace();
    }
  }
  
  public void handleTimeout(h paramh) {}
  
  public void initTitle()
  {
    if (this.n != null)
    {
      this.j = ((RelativeLayout)this.n.findViewById(2131558585));
      this.i = ((TextView)this.n.findViewById(2131558634));
      this.k = ((ImageView)this.n.findViewById(2131558637));
      this.l = ((TextView)this.n.findViewById(2131558636));
      this.m = ((LinearLayout)this.n.findViewById(2131558635));
      this.k.setVisibility(0);
      this.k.setOnClickListener(this);
      this.m.setOnClickListener(this);
    }
    for (;;)
    {
      Object localObject = this.m.getLayoutParams();
      this.m.setPadding(10, 10, 10, 10);
      this.m.setLayoutParams((ViewGroup.LayoutParams)localObject);
      this.m.requestLayout();
      new Handler().postDelayed(new ni(this), 3000L);
      return;
      localObject = (RelativeLayout)LayoutInflater.from(b.a().f()).inflate(2130903060, null);
      View localView = LayoutInflater.from(b.a().f()).inflate(2130903062, null);
      this.j = ((RelativeLayout)localView.findViewById(2131558585));
      this.i = ((TextView)localView.findViewById(2131558634));
      this.k = ((ImageView)localView.findViewById(2131558637));
      this.l = ((TextView)localView.findViewById(2131558636));
      this.m = ((LinearLayout)localView.findViewById(2131558635));
      this.k.setVisibility(0);
      this.k.setOnClickListener(this);
      this.m.setOnClickListener(this);
      ((RelativeLayout)localObject).addView(localView);
    }
  }
  
  public void jumpGoto(String paramString)
  {
    r.a(paramString, b.a().f(), "", null);
  }
  
  public void netException(h paramh, Exception paramException) {}
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    }
    do
    {
      do
      {
        return;
      } while ((this.o != 0) && (this.o != -1));
      this.f.reload();
      return;
      if (this.o == 1)
      {
        jumpGoto(this.r[0]);
        return;
      }
    } while (this.o <= 1);
    showPopwindows(this.q, this.r);
  }
  
  public void setTitle(View paramView)
  {
    this.n = paramView;
    initTitle();
  }
  
  public void setWebView(MyWebView paramMyWebView)
  {
    this.f = paramMyWebView;
  }
  
  public void showPopwindows(String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    if (this.s == null)
    {
      this.s = new PopupWindow(b.a().f());
      this.s.setWidth(-1);
      this.s.setHeight(-1);
      this.d = ((LinearLayout)LayoutInflater.from(b.a().f()).inflate(2130903574, null));
      this.b = ((ImageView)this.d.findViewById(2131561262));
      this.c = ((ListView)this.d.findViewById(2131561263));
      this.t = new ho(b.a().f(), paramArrayOfString1, "js");
      this.c.setAdapter(this.t);
      this.s.setFocusable(true);
      this.s.setTouchable(true);
      this.s.setOutsideTouchable(true);
      this.s.setBackgroundDrawable(new ColorDrawable(0));
      this.s.setWindowLayoutMode(-2, -2);
      this.d.setGravity(5);
      this.c.setOnItemClickListener(new nk(this, paramArrayOfString2));
    }
    int i1 = this.n.getMeasuredHeight();
    ((LinearLayout.LayoutParams)this.b.getLayoutParams()).rightMargin = 80;
    this.d.requestLayout();
    this.s.setContentView(this.d);
    this.s.showAtLocation(this.n, 53, 0, i1 + 70);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\WebViewJsAndAndroid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */