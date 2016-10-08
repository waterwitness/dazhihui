package com.baidu.location.e;

import com.baidu.location.BDLocation;
import com.baidu.location.Jni;
import com.baidu.location.b.c;
import com.baidu.location.b.f;
import com.baidu.location.b.n;
import com.baidu.location.c.i;
import com.baidu.location.c.k;
import com.baidu.location.h.g;
import com.baidu.location.h.p;
import com.baidu.location.h.q;
import com.baidu.location.h.r;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

class am
  extends n
{
  private String k = null;
  
  am(al paramal)
  {
    this.f = new ArrayList();
  }
  
  public void a()
  {
    this.d = 1;
    this.c = com.baidu.location.b.l.b();
    String str = c.a().b();
    if ((b == f.e) || (b == f.f)) {
      this.c = ("http://" + str + "/sdk.php");
    }
    str = Jni.a(this.k);
    this.k = null;
    this.f.add(new BasicNameValuePair("bloc", str));
  }
  
  public void a(String paramString)
  {
    this.k = paramString;
    f();
  }
  
  public void a(boolean paramBoolean)
  {
    if ((paramBoolean) && (this.e != null)) {}
    label175:
    for (;;)
    {
      try
      {
        BDLocation localBDLocation1 = new BDLocation(EntityUtils.toString(this.e, "utf-8"));
        al.a(this.a, localBDLocation1.p());
        if (this.f != null) {
          this.f.clear();
        }
        return;
      }
      catch (Exception localException)
      {
        al.a(this.a, null);
        continue;
      }
      paramBoolean = com.baidu.location.b.l.g;
      com.baidu.location.b.l.g = true;
      BDLocation localBDLocation2;
      if ((i.a().d()) && (i.a().e()))
      {
        localBDLocation2 = i.a().a(g.a().f(), r.a().j(), null, com.baidu.location.c.l.b, k.a);
        if ((localBDLocation2 == null) || (localBDLocation2.h() == 67)) {
          al.a(this.a, null);
        }
      }
      for (;;)
      {
        if (paramBoolean) {
          break label175;
        }
        com.baidu.location.b.l.g = false;
        break;
        al.a(this.a, localBDLocation2.p());
        continue;
        al.a(this.a, null);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\e\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */