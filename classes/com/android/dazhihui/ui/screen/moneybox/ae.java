package com.android.dazhihui.ui.screen.moneybox;

import com.android.dazhihui.a.b.f;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.ui.screen.BaseActivity;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ae
{
  public static final String a = "http://mnews.gw.com.cn/wap/data/lottery/buy_funds.json?keytime=" + a();
  public static String b;
  public static String c;
  public static String d;
  public static boolean e;
  public static long f = 0L;
  public static ArrayList<String[]> g;
  public static ag[] h;
  public static int i = -1;
  public static int j = -1;
  public static String k;
  public static byte l = 0;
  
  public static long a()
  {
    long l1 = System.currentTimeMillis();
    if ((f == 0L) || (l1 - f >= 60000L)) {
      f = l1;
    }
    return f;
  }
  
  public static String a(String paramString, d paramd, BaseActivity paramBaseActivity)
  {
    try
    {
      paramString = b(paramString, paramd, paramBaseActivity);
      return paramString;
    }
    catch (JSONException paramString)
    {
      paramString.printStackTrace();
      paramString = paramd.b("FUNDSJSON");
      paramd.g();
      if (paramString == null) {}
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        try
        {
          paramString = b(paramString, paramd, paramBaseActivity);
          return paramString;
        }
        catch (JSONException paramString)
        {
          paramString.printStackTrace();
          return "";
        }
        catch (IOException paramString)
        {
          paramString.printStackTrace();
          continue;
        }
        paramString = paramString;
        paramString.printStackTrace();
      }
    }
  }
  
  public static void a(BaseActivity paramBaseActivity)
  {
    if ((c == null) || (c.length() == 0)) {
      return;
    }
    f localf = new f();
    localf.c(c);
    localf.a(new af());
    paramBaseActivity.sendRequest(localf);
  }
  
  public static boolean a(String paramString)
  {
    i = -1;
    j = -1;
    if (paramString == null) {
      return false;
    }
    if (h != null)
    {
      int m = 0;
      while (m < h.length)
      {
        if (h[m].a.equals(paramString))
        {
          i = m;
          m = 0;
          while (m < h[i].b.length)
          {
            if (h[i].b[m][6].equals("1"))
            {
              j = m;
              k = h[i].b[m][0];
              return true;
            }
            m += 1;
          }
        }
        m += 1;
      }
    }
    i = -1;
    j = -1;
    return false;
  }
  
  public static String b(String paramString, d paramd, BaseActivity paramBaseActivity)
  {
    int n = 0;
    JSONObject localJSONObject = new JSONObject(paramString);
    JSONArray localJSONArray = localJSONObject.getJSONObject("data").getJSONArray("funds");
    g = new ArrayList();
    int m = 0;
    while (m < localJSONArray.length())
    {
      String str1 = localJSONArray.getJSONObject(m).getString("fname");
      String str2 = localJSONArray.getJSONObject(m).getString("fcode");
      String str3 = localJSONArray.getJSONObject(m).getString("fdate");
      String str4 = localJSONArray.getJSONObject(m).getString("jjjz");
      String str5 = localJSONArray.getJSONObject(m).getString("nhsyl");
      g.add(new String[] { str1, str2, str3, str4, str5 });
      m += 1;
    }
    localJSONArray = localJSONObject.getJSONObject("data").getJSONArray("fundsInfo");
    h = new ag[localJSONArray.length()];
    m = n;
    while (m < localJSONArray.length())
    {
      h[m] = new ag();
      h[m].a = localJSONArray.getJSONObject(m).getString("bname");
      h[m].a(localJSONArray.getJSONObject(m).getJSONArray("buys"));
      m += 1;
    }
    localJSONObject.getJSONObject("header").getString("vs");
    c = localJSONObject.getJSONObject("header").getJSONObject("images").getString("url");
    d = localJSONObject.getJSONObject("header").getJSONObject("images").getString("page_url");
    b = localJSONObject.getJSONObject("header").getJSONObject("images").getString("ivs");
    paramd = paramd.b("FUNDSJSON_IMGVS");
    if ((paramd == null) || (paramd.length() == 0)) {
      a(paramBaseActivity);
    }
    while ((b == null) || (b.equals(paramd))) {
      return paramString;
    }
    a(paramBaseActivity);
    return paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\moneybox\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */