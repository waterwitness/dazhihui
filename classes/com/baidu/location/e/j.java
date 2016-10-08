package com.baidu.location.e;

import com.baidu.location.Jni;
import com.baidu.location.b.l;
import com.baidu.location.b.n;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

class j
  extends n
{
  String a = null;
  boolean k = false;
  boolean l = false;
  
  public j(i parami)
  {
    this.f = new ArrayList();
  }
  
  public void a()
  {
    this.c = l.b();
    this.d = 2;
    String str = Jni.a(this.a);
    this.a = null;
    if (this.k) {
      this.f.add(new BasicNameValuePair("qt", "grid"));
    }
    for (;;)
    {
      this.f.add(new BasicNameValuePair("req", str));
      return;
      this.f.add(new BasicNameValuePair("qt", "conf"));
    }
  }
  
  public void a(String paramString, boolean paramBoolean)
  {
    if (this.l) {
      return;
    }
    this.l = true;
    this.a = paramString;
    this.k = paramBoolean;
    if (paramBoolean)
    {
      e();
      return;
    }
    f();
  }
  
  public void a(boolean paramBoolean)
  {
    if ((paramBoolean) && (this.e != null)) {
      if (this.k) {
        i.a(this.m, this.e);
      }
    }
    for (;;)
    {
      if (this.f != null) {
        this.f.clear();
      }
      this.l = false;
      return;
      i.b(this.m, this.e);
      continue;
      i.b(this.m, null);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\e\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */