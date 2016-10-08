package com.baidu.location.e;

import android.os.Handler;
import android.os.Message;
import com.baidu.location.BDLocation;
import com.baidu.location.Jni;
import com.baidu.location.b.j;
import com.baidu.location.b.l;
import com.baidu.location.b.m;
import com.baidu.location.b.q;
import com.baidu.location.h.g;
import com.baidu.location.h.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

class c
  extends com.baidu.location.b.n
{
  String a = null;
  String k = null;
  
  public c(b paramb)
  {
    this.f = new ArrayList();
  }
  
  public void a()
  {
    this.c = l.b();
    Object localObject = com.baidu.location.b.c.a().b();
    if ((b == com.baidu.location.b.f.e) || (b == com.baidu.location.b.f.f)) {
      this.c = ("http://" + (String)localObject + "/sdk.php");
    }
    if (localObject != null) {
      q.a().b().b("&host=" + (String)localObject);
    }
    localObject = Jni.f(this.k);
    this.k = null;
    if (this.a == null) {
      this.a = y.b();
    }
    this.f.add(new BasicNameValuePair("bloc", (String)localObject));
    if (this.a != null) {
      this.f.add(new BasicNameValuePair("up", this.a));
    }
    localObject = new StringBuffer(512);
    ((StringBuffer)localObject).append(String.format(Locale.CHINA, "&ki=%s&sn=%s", new Object[] { j.b(com.baidu.location.f.b()), j.a(com.baidu.location.f.b()) }));
    if (((StringBuffer)localObject).length() > 0) {
      this.f.add(new BasicNameValuePair("ext", Jni.a(((StringBuffer)localObject).toString())));
    }
    localObject = String.format(Locale.CHINA, "%d", new Object[] { Long.valueOf(System.currentTimeMillis()) });
    this.f.add(new BasicNameValuePair("trtm", (String)localObject));
  }
  
  public void a(String paramString)
  {
    this.k = paramString;
    f();
  }
  
  public void a(boolean paramBoolean)
  {
    if ((this.l.b != null) && (this.l.b.a() == 0)) {}
    for (;;)
    {
      return;
      if ((paramBoolean) && (this.e != null))
      {
        for (;;)
        {
          try
          {
            localObject1 = EntityUtils.toString(this.e, "utf-8");
            b.c = (String)localObject1;
          }
          catch (Exception localException2)
          {
            Object localObject1;
            localMessage = this.l.d.obtainMessage(63);
            localMessage.obj = "HttpStatus error";
            localMessage.sendToTarget();
            continue;
            Object localObject2 = this.l.d.obtainMessage(21);
            ((Message)localObject2).obj = localMessage;
            ((Message)localObject2).sendToTarget();
            continue;
          }
          try
          {
            localObject2 = new BDLocation((String)localObject1);
            ((BDLocation)localObject2).d(g.a().g());
            localObject1 = localObject2;
            if (t.a().d())
            {
              ((BDLocation)localObject2).c(t.a().f());
              localObject1 = localObject2;
            }
          }
          catch (Exception localException1)
          {
            localBDLocation = new BDLocation();
            localBDLocation.a(0);
          }
        }
        this.a = null;
        if ((((BDLocation)localObject1).h() == 0) && (((BDLocation)localObject1).c() == Double.MIN_VALUE) && (((BDLocation)localObject1).d() == Double.MIN_VALUE))
        {
          localObject1 = this.l.d.obtainMessage(63);
          ((Message)localObject1).obj = "HttpStatus error";
          ((Message)localObject1).sendToTarget();
        }
      }
      while (this.f != null)
      {
        this.f.clear();
        return;
        BDLocation localBDLocation;
        Message localMessage = this.l.d.obtainMessage(63);
        localMessage.obj = "HttpStatus error";
        localMessage.sendToTarget();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\e\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */