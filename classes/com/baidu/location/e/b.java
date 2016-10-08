package com.baidu.location.e;

import android.location.Location;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.baidu.location.h.g;
import com.baidu.location.h.h;
import com.baidu.location.h.n;
import com.baidu.location.h.p;
import com.baidu.location.h.r;
import java.util.Locale;

public abstract class b
{
  public static String c = null;
  public com.baidu.location.h.l a = null;
  public n b = null;
  final Handler d = new d(this);
  private boolean e = true;
  private boolean f = false;
  
  public String a(String paramString)
  {
    if ((this.b == null) || (!this.b.b())) {
      this.b = g.a().f();
    }
    if ((this.a == null) || (!this.a.f())) {
      this.a = r.a().k();
    }
    if (h.a().j()) {}
    for (Location localLocation = h.a().h();; localLocation = null)
    {
      if (((this.b == null) || (this.b.d())) && ((this.a == null) || (this.a.a() == 0)) && (localLocation == null)) {
        return null;
      }
      String str1 = f.a().c();
      Object localObject1;
      String str2;
      Object localObject2;
      if (r.a().g())
      {
        localObject1 = "&cn=32";
        if (!this.e) {
          break label300;
        }
        this.e = false;
        com.baidu.location.b.q.a().b().a(true);
        str2 = r.a().m();
        localObject2 = localObject1;
        if (!TextUtils.isEmpty(str2))
        {
          localObject2 = str2.replace(":", "");
          localObject2 = String.format(Locale.CHINA, "%s&mac=%s", new Object[] { localObject1, localObject2 });
        }
        if (Build.VERSION.SDK_INT <= 17) {}
      }
      for (;;)
      {
        localObject2 = (String)localObject2 + str1;
        localObject1 = localObject2;
        if (paramString != null) {
          localObject1 = paramString + (String)localObject2;
        }
        return com.baidu.location.b.l.a(this.b, this.a, localLocation, (String)localObject1, 0);
        localObject1 = String.format(Locale.CHINA, "&cn=%d", new Object[] { Integer.valueOf(g.a().e()) });
        break;
        label300:
        localObject2 = localObject1;
        if (!this.f)
        {
          str2 = y.f();
          localObject2 = localObject1;
          if (str2 != null) {
            localObject2 = (String)localObject1 + str2;
          }
          this.f = true;
        }
      }
    }
  }
  
  public abstract void a();
  
  public abstract void a(Message paramMessage);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\e\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */