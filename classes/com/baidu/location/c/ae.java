package com.baidu.location.c;

import com.baidu.location.b.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.ParseException;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

class ae
  extends n
{
  private int k;
  private long l;
  private String m;
  private boolean n;
  private boolean o;
  private ad p;
  
  ae(ad paramad1, ad paramad2)
  {
    this.p = paramad2;
    this.m = null;
    this.n = false;
    this.o = false;
    this.f = new ArrayList();
    this.k = 0;
    this.l = -1L;
  }
  
  private void b()
  {
    if (!this.n)
    {
      this.m = ad.a(this.p);
      if ((this.l != -1L) && (this.l + 86400000L <= System.currentTimeMillis()))
      {
        this.k = 0;
        this.l = -1L;
      }
      if ((this.m != null) && (this.k < 2))
      {
        this.n = true;
        f();
      }
    }
  }
  
  public void a()
  {
    this.f.clear();
    this.f.add(new BasicNameValuePair("qt", "ofbh"));
    this.f.add(new BasicNameValuePair("req", this.m));
    this.c = i.a;
  }
  
  public void a(boolean paramBoolean)
  {
    this.o = false;
    if ((paramBoolean) && (this.e != null)) {}
    try
    {
      JSONObject localJSONObject = new JSONObject(EntityUtils.toString(this.e, "utf-8"));
      if ((localJSONObject != null) && (localJSONObject.has("error")) && (localJSONObject.getInt("error") == 161)) {
        this.o = true;
      }
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
    catch (ParseException localParseException)
    {
      for (;;) {}
    }
    this.n = false;
    if (!this.o)
    {
      this.k += 1;
      this.l = System.currentTimeMillis();
    }
    new af(this).start();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\c\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */