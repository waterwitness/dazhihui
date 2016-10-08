package com.alipay.b.b.a.a.a;

import com.alipay.a.a.f;
import com.alipay.b.b.a.a.c;
import java.util.ArrayList;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

public final class e
  extends b
{
  private int c;
  private Object d;
  
  public e(int paramInt, String paramString, Object paramObject)
  {
    super(paramString, paramObject);
    this.c = paramInt;
  }
  
  public final void a(Object paramObject)
  {
    this.d = paramObject;
  }
  
  public final byte[] a()
  {
    String str;
    try
    {
      ArrayList localArrayList = new ArrayList();
      if (this.d != null) {
        localArrayList.add(new BasicNameValuePair("extParam", f.a(this.d)));
      }
      localArrayList.add(new BasicNameValuePair("operationType", this.a));
      localArrayList.add(new BasicNameValuePair("id", this.c));
      new StringBuilder("mParams is:").append(this.b);
      if (this.b == null) {}
      for (str = "[]";; str = f.a(this.b))
      {
        localArrayList.add(new BasicNameValuePair("requestData", str));
        return URLEncodedUtils.format(localArrayList, "utf-8").getBytes();
      }
      str = "";
    }
    catch (Exception localException)
    {
      if ("request  =" + this.b + ":" + localException != null) {}
    }
    for (;;)
    {
      throw new c(Integer.valueOf(9), str, localException);
      str = localException.getMessage();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\b\b\a\a\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */