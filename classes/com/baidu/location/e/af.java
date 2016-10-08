package com.baidu.location.e;

import com.baidu.location.BDLocation;
import com.baidu.location.Jni;
import com.baidu.location.b.j;
import com.baidu.location.b.l;
import com.baidu.location.b.n;
import com.baidu.location.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

class af
  extends n
{
  String a = null;
  
  af(aa paramaa)
  {
    this.f = new ArrayList();
  }
  
  public void a()
  {
    this.c = l.b();
    Object localObject = Jni.a(this.a);
    this.a = null;
    this.f.add(new BasicNameValuePair("bloc", (String)localObject));
    localObject = new StringBuffer(512);
    ((StringBuffer)localObject).append(String.format(Locale.CHINA, "&ki=%s&sn=%s", new Object[] { j.b(aa.a(this.k)), j.a(aa.a(this.k)) }));
    if (((StringBuffer)localObject).length() > 0) {
      this.f.add(new BasicNameValuePair("ext", Jni.a(((StringBuffer)localObject).toString())));
    }
    localObject = String.format(Locale.CHINA, "%d", new Object[] { Long.valueOf(System.currentTimeMillis()) });
    this.f.add(new BasicNameValuePair("trtm", (String)localObject));
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
    f();
  }
  
  public void a(boolean paramBoolean)
  {
    if ((paramBoolean) && (this.e != null)) {}
    for (;;)
    {
      try
      {
        localObject = EntityUtils.toString(this.e, "utf-8");
      }
      catch (Exception localException2)
      {
        Object localObject;
        BDLocation localBDLocation;
        continue;
      }
      try
      {
        localObject = new BDLocation((String)localObject);
        if ((localObject != null) && (((BDLocation)localObject).h() == 161))
        {
          ((BDLocation)localObject).b(aa.b(this.k).a);
          aa.c(this.k).a((BDLocation)localObject);
        }
        if (this.f != null) {
          this.f.clear();
        }
        return;
      }
      catch (Exception localException1)
      {
        localBDLocation = new BDLocation();
        localBDLocation.a(63);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\e\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */