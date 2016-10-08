package com.baidu.location.b;

import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

class r
  extends n
{
  private String k = null;
  private boolean l = false;
  
  r(q paramq)
  {
    this.f = new ArrayList();
  }
  
  public void a()
  {
    this.f.clear();
    this.f.add(new BasicNameValuePair("qt", "stat"));
    this.f.add(new BasicNameValuePair("req", this.k));
    this.c = "http://loc.map.baidu.com/statloc";
  }
  
  public void a(String paramString)
  {
    this.k = paramString;
    if (this.k != null)
    {
      f();
      this.l = true;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.l = false;
    if ((paramBoolean) && (this.e != null)) {}
    try
    {
      EntityUtils.toString(this.e, "utf-8");
      return;
    }
    catch (Exception localException) {}
    q.a(this.a, System.currentTimeMillis());
    return;
  }
  
  public boolean b()
  {
    return this.l;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\b\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */