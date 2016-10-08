package com.android.dazhihui.ui.screen.stock;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.widget.ScrollView;
import android.widget.TextView;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.d.b;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.PlateItem;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.e;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.MyWebView;
import com.android.dazhihui.ui.widget.PlateLinkageView;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class of
  extends e
  implements i
{
  private PlateLinkageView a;
  private List<PlateItem> b = new ArrayList();
  private String c;
  private String d;
  private int e;
  private ScrollView f;
  private BaseActivity g;
  private com.android.dazhihui.a.b.f h;
  private MyWebView i;
  private View j;
  private TextView k;
  private String l = "#ffffff";
  private String m = "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\"><html><head><meta name=\"viewport\" content=\"width=device-width,minimum-scale=1.0, maximum-scale=1.0\" /><meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\"><meta http-equiv=\"Content-Style-Type\" content=\"text/css\"><title></title><meta name=\"Generator\" content=\"Cocoa HTML Writer\"><meta name=\"CocoaVersion\" content=\"1138.47\"><style type=\"text/css\"> body {font-size:";
  private String n = "px;color:#ffffff;line-height:150%;padding-bottom:10px;padding-top:10px;} img { max-width: 300px; width: expression(this.width > 300 ? 300: true);}</style></head><body>";
  private String o = "</body></html>";
  
  private String a(int paramInt, String paramString)
  {
    String str = this.m + paramInt + this.n.replace("#ffffff", this.l);
    paramString = str + paramString;
    return paramString + this.o;
  }
  
  private void a()
  {
    new x();
    Object localObject = new x(2973);
    ((x)localObject).c(2);
    ((x)localObject).a(this.d);
    localObject = new m((x)localObject);
    ((m)localObject).a(this);
    com.android.dazhihui.a.g.a().a((h)localObject);
    n.a(this.d, 1141);
    if ((this.d != null) && (this.d.length() > 2))
    {
      localObject = com.android.dazhihui.a.f.G + this.d.substring(0, 2) + "/" + this.d.substring(this.d.length() - 2) + "/" + this.d.substring(2) + "/" + com.android.dazhihui.a.f.H;
      this.h = new com.android.dazhihui.a.b.f();
      this.h.c((String)localObject);
      this.h.a(this);
      sendRequest(this.h);
    }
  }
  
  private void a(String paramString)
  {
    if ((paramString == null) || (paramString.isEmpty())) {
      this.i.setVisibility(8);
    }
    do
    {
      return;
      try
      {
        Object localObject = new JSONArray(paramString).getJSONObject(0).getJSONObject("data");
        paramString = ((JSONObject)localObject).getJSONArray("gntcArray");
        localObject = ((JSONObject)localObject).getString("gntcDzhbk");
        StringBuilder localStringBuilder = new StringBuilder();
        i1 = 0;
        while (i1 < paramString.length())
        {
          String str = paramString.getString(i1).replace("*", "");
          localStringBuilder.append(str + "<br>" + "<br>");
          i1 += 1;
        }
        this.k.setVisibility(0);
        this.k.setText((CharSequence)localObject);
        this.i.setVisibility(0);
        this.i.setFocusable(false);
        this.i.getSettings().setBuiltInZoomControls(false);
        this.i.setHorizontalFadingEdgeEnabled(false);
        this.i.setHorizontalScrollBarEnabled(false);
        this.i.setHorizontalScrollbarOverlay(false);
        this.i.setVerticalFadingEdgeEnabled(false);
        this.i.setVerticalScrollBarEnabled(false);
        this.i.setVerticalScrollbarOverlay(false);
        this.i.setBackgroundColor(0);
        this.i.setWebViewLoadListener(new og(this));
        this.i.setLayerType(0, null);
        this.i.loadDataWithBaseURL("http://www.gw.com.cn/", a(16, localStringBuilder.toString()), "text/html", "utf-8", "");
        this.i.requestLayout();
        this.i.postInvalidate();
        i1 = 1;
      }
      catch (JSONException paramString)
      {
        for (;;)
        {
          paramString.printStackTrace();
          int i1 = 0;
        }
      }
    } while (i1 != 0);
    this.i.setVisibility(8);
  }
  
  public void a(p paramp)
  {
    if (paramp == null) {}
    int i2;
    do
    {
      Object localObject;
      do
      {
        return;
        localObject = paramp.b;
      } while ((paramp.a != 2973) || (localObject == null));
      paramp = new q((byte[])localObject);
      i2 = paramp.e();
      if (((i2 >>> 0 & 0x1) == 0) || ((i2 >>> 1 & 0x1) != 0))
      {
        this.b.clear();
        int i3 = paramp.e();
        int i1 = 0;
        while (i1 < i3)
        {
          localObject = paramp.l();
          String str = paramp.l();
          int i4 = paramp.b();
          int i5 = paramp.h();
          int i6 = paramp.h();
          int i7 = paramp.e();
          long l1 = b.a(paramp.h());
          PlateItem localPlateItem = new PlateItem();
          localPlateItem.code = ((String)localObject);
          localPlateItem.name = str;
          localPlateItem.zf = b.b(i6 + 10000, 10000);
          localPlateItem.bid = i7;
          localPlateItem.zjlr = b.b(l1);
          i7 = (int)(i5 - i5 / (1.0F + i6 / 10000.0F));
          localPlateItem.zxj = b.a(i5 / 100.0F, i4);
          localPlateItem.zd = b.a(i7 / 100.0F, i4);
          localPlateItem.color = b.h(i6 + 10000, 10000);
          this.b.add(localPlateItem);
          i1 += 1;
        }
        this.a.setData(this.b);
      }
    } while (((i2 >>> 2 & 0x1) != 0) && ((i2 >>> 3 & 0x1) == 0));
  }
  
  public View getScroolView()
  {
    return this.f;
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    if ((paramj instanceof com.android.dazhihui.a.b.g))
    {
      paramj = (com.android.dazhihui.a.b.g)paramj;
      if (paramh != null) {}
    }
    while (!(paramj instanceof o))
    {
      do
      {
        do
        {
          return;
        } while (paramh != this.h);
        paramh = paramj.a();
      } while (paramh == null);
      try
      {
        a(new String(paramh, "UTF-8"));
        return;
      }
      catch (UnsupportedEncodingException paramh)
      {
        paramh.printStackTrace();
        return;
      }
    }
    a(((o)paramj).h());
  }
  
  public void handleTimeout(h paramh) {}
  
  public void netException(h paramh, Exception paramException) {}
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    paramBundle = getBundle();
    if (paramBundle != null)
    {
      this.c = paramBundle.getString("name");
      this.d = paramBundle.getString("code");
      this.e = paramBundle.getInt("type");
    }
    a();
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    this.g = ((BaseActivity)paramActivity);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.j = paramLayoutInflater.inflate(2130903370, paramViewGroup, false);
    this.a = ((PlateLinkageView)this.j.findViewById(2131560200));
    this.i = ((MyWebView)this.j.findViewById(2131560201));
    this.f = ((ScrollView)this.j.findViewById(2131560202));
    this.k = ((TextView)this.j.findViewById(2131560203));
    return this.j;
  }
  
  public void onResume()
  {
    super.onResume();
    if (this.mLookFace == y.b)
    {
      this.j.setBackgroundColor(getResources().getColor(2131493677));
      this.l = "#000000";
      this.k.setTextColor(-16777216);
    }
  }
  
  public void refresh()
  {
    a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\of.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */