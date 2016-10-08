package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import com.android.dazhihui.a.b.h;
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
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.MyWebView;
import com.android.dazhihui.ui.widget.PlateLinkageView;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PlateLinkageActivity
  extends BaseActivity
  implements cp, cs
{
  private PlateLinkageView a;
  private List<PlateItem> b = new ArrayList();
  private String c;
  private String d;
  private int e;
  private com.android.dazhihui.a.b.f f;
  private MyWebView g;
  private DzhHeader h;
  private ScrollView i;
  private String j = "#ffffff";
  private String k = "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\"><html><head><meta name=\"viewport\" content=\"width=device-width,minimum-scale=1.0, maximum-scale=1.0\" /><meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\"><meta http-equiv=\"Content-Style-Type\" content=\"text/css\"><title></title><meta name=\"Generator\" content=\"Cocoa HTML Writer\"><meta name=\"CocoaVersion\" content=\"1138.47\"><style type=\"text/css\"> body {font-size:";
  private String l = "px;color:#ffffff;line-height:150%;padding-bottom:10px;padding-top:10px;} img { max-width: 300px; width: expression(this.width > 300 ? 300: true);}</style></head><body>";
  private String m = "</body></html>";
  
  private String a(int paramInt, String paramString)
  {
    String str = this.k + paramInt + this.l.replace("#ffffff", this.j);
    paramString = str + paramString;
    return paramString + this.m;
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
      this.f = new com.android.dazhihui.a.b.f();
      this.f.c((String)localObject);
      this.f.a(this);
      sendRequest(this.f);
    }
  }
  
  private void a(String paramString)
  {
    if ((paramString == null) || (paramString.isEmpty())) {
      this.g.setVisibility(8);
    }
    do
    {
      return;
      try
      {
        paramString = new JSONArray(paramString).getJSONObject(0).getJSONObject("data").getJSONArray("gntcArray");
        StringBuilder localStringBuilder = new StringBuilder();
        n = 0;
        while (n < paramString.length())
        {
          String str = paramString.getString(n).replace("*", "");
          localStringBuilder.append(str + "<br>" + "<br>");
          n += 1;
        }
        this.g.loadDataWithBaseURL("http://www.gw.com.cn/", a(16, localStringBuilder.toString()), "text/html", "utf-8", "");
        this.g.setVisibility(0);
        this.g.setBackgroundColor(0);
        this.g.setWebViewLoadListener(new od(this));
        this.g.requestLayout();
        this.g.postInvalidate();
        n = 1;
      }
      catch (JSONException paramString)
      {
        for (;;)
        {
          paramString.printStackTrace();
          int n = 0;
        }
      }
    } while (n != 0);
    this.g.setVisibility(8);
  }
  
  public boolean OnChildClick(View paramView)
  {
    switch (((Integer)paramView.getTag()).intValue())
    {
    }
    for (;;)
    {
      return true;
      finish();
      continue;
      startActivity(new Intent(this, SearchStockScreen.class));
    }
  }
  
  public void a(p paramp)
  {
    if (paramp == null) {}
    int i1;
    do
    {
      Object localObject;
      do
      {
        return;
        localObject = paramp.b;
      } while ((paramp.a != 2973) || (localObject == null));
      paramp = new q((byte[])localObject);
      i1 = paramp.e();
      if (((i1 >>> 0 & 0x1) == 0) || ((i1 >>> 1 & 0x1) != 0))
      {
        this.b.clear();
        int i2 = paramp.e();
        int n = 0;
        while (n < i2)
        {
          localObject = paramp.l();
          String str = paramp.l();
          int i3 = paramp.b();
          int i4 = paramp.h();
          int i5 = paramp.h();
          int i6 = paramp.e();
          long l1 = b.a(paramp.h());
          PlateItem localPlateItem = new PlateItem();
          localPlateItem.code = ((String)localObject);
          localPlateItem.name = str;
          localPlateItem.zf = b.b(i5 + 10000, 10000);
          localPlateItem.bid = i6;
          localPlateItem.zjlr = b.b(l1);
          i6 = (int)(i4 - i4 / (1.0F + i5 / 10000.0F));
          localPlateItem.zxj = b.a(i4 / 100.0F, i3);
          localPlateItem.zd = b.a(i6 / 100.0F, i3);
          localPlateItem.color = b.h(i5 + 10000, 10000);
          this.b.add(localPlateItem);
          n += 1;
        }
        this.a.setData(this.b);
      }
    } while (((i1 >>> 2 & 0x1) != 0) && ((i1 >>> 3 & 0x1) == 0));
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (oe.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.h == null);
      this.h.a(paramy);
      return;
    } while (this.h == null);
    this.h.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 8232;
    paramct.k = paramContext.getResources().getDrawable(2130838123);
    if ((this.c != null) && (!this.c.isEmpty()))
    {
      paramct.d = (this.c + "\n" + this.d);
      return;
    }
    paramct.d = ("板块联动\n" + this.d);
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.h = paramDzhHeader;
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
        } while (paramh != this.f);
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
  
  public void handleTimeout(h paramh)
  {
    super.handleTimeout(paramh);
  }
  
  public void init(Bundle paramBundle)
  {
    setContentView(2130903369);
    this.i = ((ScrollView)findViewById(2131560199));
    this.a = ((PlateLinkageView)findViewById(2131560200));
    this.g = ((MyWebView)findViewById(2131560201));
    this.g.setLayerType(0, null);
    paramBundle = getIntent().getExtras();
    if (paramBundle != null)
    {
      this.c = paramBundle.getString("name");
      this.d = paramBundle.getString("code");
      this.e = paramBundle.getInt("type");
    }
    a();
    this.h = ((DzhHeader)findViewById(2131558567));
    this.h.setOnHeaderButtonClickListener(this);
    this.h.a(this, this);
    changeLookFace(this.mLookFace);
  }
  
  public void netException(h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
  }
  
  protected void onResume()
  {
    super.onResume();
    if (this.mLookFace == y.b)
    {
      this.i.setBackgroundColor(getResources().getColor(2131493677));
      this.j = "#000000";
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\PlateLinkageActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */