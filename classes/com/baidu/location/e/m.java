package com.baidu.location.e;

import com.baidu.location.Jni;
import com.baidu.location.b.b;
import com.baidu.location.b.n;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

class m
  extends n
{
  String a = null;
  
  public m(l paraml)
  {
    this.f = new ArrayList();
  }
  
  public void a()
  {
    this.c = "http://loc.map.baidu.com/cc.php";
    String str = Jni.a(this.a);
    this.a = null;
    this.f.add(new BasicNameValuePair("q", str));
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
    f();
  }
  
  public void a(boolean paramBoolean)
  {
    if ((paramBoolean) && (this.e != null)) {}
    try
    {
      JSONObject localJSONObject = new JSONObject(EntityUtils.toString(this.e, "utf-8"));
      localJSONObject.put("prod", b.c);
      localJSONObject.put("uptime", System.currentTimeMillis());
      l.a(this.k, localJSONObject.toString());
      if (this.f != null) {
        this.f.clear();
      }
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\e\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */