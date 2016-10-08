package com.tencent.open;

import android.net.Uri;
import android.webkit.WebView;
import com.tencent.open.a.f;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class a
{
  protected HashMap<String, a.b> a = new HashMap();
  
  public void a(a.b paramb, String paramString)
  {
    this.a.put(paramString, paramb);
  }
  
  public void a(String paramString1, String paramString2, List<String> paramList, a.a parama)
  {
    f.a("openSDK_LOG.JsBridge", "getResult---objName = " + paramString1 + " methodName = " + paramString2);
    int j = paramList.size();
    int i = 0;
    for (;;)
    {
      if (i < j) {
        try
        {
          paramList.set(i, URLDecoder.decode((String)paramList.get(i), "UTF-8"));
          i += 1;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          for (;;)
          {
            localUnsupportedEncodingException.printStackTrace();
          }
        }
      }
    }
    paramString1 = (a.b)this.a.get(paramString1);
    if (paramString1 != null)
    {
      f.b("openSDK_LOG.JsBridge", "call----");
      paramString1.call(paramString2, paramList, parama);
    }
    do
    {
      return;
      f.b("openSDK_LOG.JsBridge", "not call----objName NOT FIND");
    } while (parama == null);
    parama.a();
  }
  
  public boolean a(WebView paramWebView, String paramString)
  {
    f.a("openSDK_LOG.JsBridge", "-->canHandleUrl---url = " + paramString);
    if (paramString == null) {}
    do
    {
      do
      {
        return false;
      } while (!Uri.parse(paramString).getScheme().equals("jsbridge"));
      localObject = new ArrayList(Arrays.asList((paramString + "/#").split("/")));
    } while (((ArrayList)localObject).size() < 6);
    String str1 = (String)((ArrayList)localObject).get(2);
    String str2 = (String)((ArrayList)localObject).get(3);
    Object localObject = ((ArrayList)localObject).subList(4, ((ArrayList)localObject).size() - 1);
    paramString = new a.a(paramWebView, 4L, paramString);
    paramWebView.getUrl();
    a(str1, str2, (List)localObject, paramString);
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */