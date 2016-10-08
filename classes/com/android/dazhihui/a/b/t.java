package com.android.dazhihui.a.b;

import java.util.HashMap;
import java.util.Map;
import org.apache.http.HttpEntity;

public class t
  extends f
{
  protected Map<String, String> h = new HashMap();
  private HttpEntity i;
  
  public void a(HttpEntity paramHttpEntity)
  {
    this.i = paramHttpEntity;
  }
  
  public void c(String paramString1, String paramString2)
  {
    this.h.put(paramString1, paramString2);
  }
  
  public HttpEntity n()
  {
    return this.i;
  }
  
  public Map<String, String> q()
  {
    return this.h;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\a\b\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */