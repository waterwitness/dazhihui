package com.android.dazhihui.ui.widget;

import android.util.Log;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import org.json.JSONArray;
import org.json.JSONObject;

class nj
  implements Runnable
{
  nj(WebViewJsAndAndroid paramWebViewJsAndAndroid, String paramString1, String paramString2, String paramString3) {}
  
  public void run()
  {
    Log.d(WebViewJsAndAndroid.a(), "js调用了Android方法");
    if (this.a.equals("3005"))
    {
      WebViewJsAndAndroid.a(this.d, this.b);
      WebViewJsAndAndroid.b(this.d, this.c);
      WebViewJsAndAndroid.c(this.d, WebViewJsAndAndroid.d(this.d));
      Log.d(WebViewJsAndAndroid.a(), "js调用了Android方法   " + this.b);
      Log.d(WebViewJsAndAndroid.a(), "js调用了Android方法   " + WebViewJsAndAndroid.e(this.d));
    }
    for (;;)
    {
      return;
      if (this.a.equals("rtmenu"))
      {
        try
        {
          WebViewJsAndAndroid.a(this.d, new JSONArray(this.b));
          Log.i("ceshi", "返回json   " + this.b.toString());
          WebViewJsAndAndroid.a(this.d, WebViewJsAndAndroid.f(this.d).length());
          WebViewJsAndAndroid.a(this.d, new String[WebViewJsAndAndroid.a(this.d)]);
          WebViewJsAndAndroid.b(this.d, new String[WebViewJsAndAndroid.a(this.d)]);
          if (WebViewJsAndAndroid.a(this.d) == 0)
          {
            WebViewJsAndAndroid.b(this.d).setVisibility(0);
            WebViewJsAndAndroid.g(this.d).setVisibility(8);
            return;
          }
        }
        catch (Exception localException)
        {
          localException.printStackTrace();
          return;
        }
        Object localObject2;
        if (WebViewJsAndAndroid.a(this.d) == 1)
        {
          localObject1 = new LinearLayout.LayoutParams(-2, -2);
          WebViewJsAndAndroid.g(this.d).setLayoutParams((ViewGroup.LayoutParams)localObject1);
          WebViewJsAndAndroid.g(this.d).setMaxEms(6);
          WebViewJsAndAndroid.g(this.d).setGravity(17);
          WebViewJsAndAndroid.g(this.d).requestLayout();
          WebViewJsAndAndroid.b(this.d).setVisibility(8);
          WebViewJsAndAndroid.g(this.d).setVisibility(0);
          localObject2 = WebViewJsAndAndroid.f(this.d).getJSONObject(0);
          localObject1 = ((JSONObject)localObject2).getString("label");
          WebViewJsAndAndroid.g(this.d).setText((CharSequence)localObject1);
          localObject2 = ((JSONObject)localObject2).getString("link");
          WebViewJsAndAndroid.h(this.d)[0] = localObject1;
          WebViewJsAndAndroid.i(this.d)[0] = localObject2;
          return;
        }
        if (WebViewJsAndAndroid.a(this.d) <= 1) {
          break;
        }
        Object localObject1 = (LinearLayout.LayoutParams)WebViewJsAndAndroid.g(this.d).getLayoutParams();
        ((LinearLayout.LayoutParams)localObject1).width = 50;
        ((LinearLayout.LayoutParams)localObject1).height = 15;
        WebViewJsAndAndroid.g(this.d).setLayoutParams((ViewGroup.LayoutParams)localObject1);
        ((LinearLayout.LayoutParams)localObject1).rightMargin = 50;
        WebViewJsAndAndroid.g(this.d).requestLayout();
        WebViewJsAndAndroid.b(this.d).setVisibility(8);
        WebViewJsAndAndroid.g(this.d).setVisibility(0);
        WebViewJsAndAndroid.g(this.d).setText("");
        WebViewJsAndAndroid.g(this.d).setBackgroundResource(2130837527);
        int i = 0;
        while (i < WebViewJsAndAndroid.a(this.d))
        {
          localObject2 = WebViewJsAndAndroid.f(this.d).getJSONObject(i);
          localObject1 = ((JSONObject)localObject2).getString("label");
          localObject2 = ((JSONObject)localObject2).getString("link");
          WebViewJsAndAndroid.h(this.d)[i] = localObject1;
          WebViewJsAndAndroid.i(this.d)[i] = localObject2;
          Log.i("ceshi", "第" + i + "个   " + WebViewJsAndAndroid.h(this.d)[i]);
          i += 1;
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\nj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */