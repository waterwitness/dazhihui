package com.baidu.location.e;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Message;
import android.os.Messenger;
import com.baidu.location.BDLocation;
import com.baidu.location.Jni;
import com.baidu.location.b.b;
import com.baidu.location.b.l;
import com.baidu.location.k;

class g
{
  public String a = null;
  public Messenger b = null;
  public k c = new k();
  public int d = 0;
  
  public g(f paramf, Message paramMessage)
  {
    this.b = paramMessage.replyTo;
    this.a = paramMessage.getData().getString("packName");
    this.c.f = paramMessage.getData().getString("prodName");
    b.a().a(this.c.f, this.a);
    this.c.a = paramMessage.getData().getString("coorType");
    this.c.b = paramMessage.getData().getString("addrType");
    this.c.j = paramMessage.getData().getBoolean("enableSimulateGps", false);
    if ((l.k) || (this.c.j))
    {
      bool1 = true;
      l.k = bool1;
      if (!l.f.equals("all")) {
        l.f = this.c.b;
      }
      this.c.c = paramMessage.getData().getBoolean("openGPS");
      this.c.d = paramMessage.getData().getInt("scanSpan");
      this.c.e = paramMessage.getData().getInt("timeOut");
      this.c.g = paramMessage.getData().getInt("priority");
      this.c.h = paramMessage.getData().getBoolean("location_change_notify");
      this.c.n = paramMessage.getData().getBoolean("needDirect", false);
      this.c.s = paramMessage.getData().getBoolean("isneedaltitude", false);
      if ((!l.g) && (!paramMessage.getData().getBoolean("isneedaptag", false))) {
        break label428;
      }
    }
    label428:
    for (boolean bool1 = true;; bool1 = false)
    {
      l.g = bool1;
      if (!l.h)
      {
        bool1 = bool2;
        if (!paramMessage.getData().getBoolean("isneedaptagd", false)) {}
      }
      else
      {
        bool1 = true;
      }
      l.h = bool1;
      if (this.c.d >= 1000) {
        n.a().b();
      }
      if ((this.c.n) || (this.c.s))
      {
        t.a().a(this.c.n);
        t.a().b(this.c.s);
        t.a().b();
      }
      return;
      bool1 = false;
      break;
    }
  }
  
  private void a(int paramInt)
  {
    Message localMessage = Message.obtain(null, paramInt);
    try
    {
      if (this.b != null) {
        this.b.send(localMessage);
      }
      this.d = 0;
      return;
    }
    catch (Exception localException)
    {
      while (!(localException instanceof DeadObjectException)) {}
      this.d += 1;
    }
  }
  
  private void a(int paramInt, Bundle paramBundle)
  {
    Message localMessage = Message.obtain(null, paramInt);
    localMessage.setData(paramBundle);
    try
    {
      if (this.b != null) {
        this.b.send(localMessage);
      }
      this.d = 0;
      return;
    }
    catch (Exception paramBundle)
    {
      if ((paramBundle instanceof DeadObjectException)) {
        this.d += 1;
      }
      paramBundle.printStackTrace();
    }
  }
  
  private void a(int paramInt, String paramString, BDLocation paramBDLocation)
  {
    Bundle localBundle = new Bundle();
    localBundle.putParcelable(paramString, paramBDLocation);
    paramString = Message.obtain(null, paramInt);
    paramString.setData(localBundle);
    try
    {
      if (this.b != null) {
        this.b.send(paramString);
      }
      this.d = 0;
      return;
    }
    catch (Exception paramString)
    {
      while (!(paramString instanceof DeadObjectException)) {}
      this.d += 1;
    }
  }
  
  public void a()
  {
    if (this.c.h == true)
    {
      if (l.b) {
        a(54);
      }
    }
    else {
      return;
    }
    a(55);
  }
  
  public void a(BDLocation paramBDLocation)
  {
    a(paramBDLocation, 21);
  }
  
  public void a(BDLocation paramBDLocation, int paramInt)
  {
    paramBDLocation = new BDLocation(paramBDLocation);
    if ((t.a().e()) && ((paramBDLocation.h() == 161) || (paramBDLocation.h() == 66))) {
      paramBDLocation.c(t.a().g());
    }
    if (paramInt == 21) {
      a(27, "locStr", paramBDLocation);
    }
    double d1;
    double d2;
    double[] arrayOfDouble;
    if ((this.c.a != null) && (!this.c.a.equals("gcj02")))
    {
      d1 = paramBDLocation.d();
      d2 = paramBDLocation.c();
      if ((d1 != Double.MIN_VALUE) && (d2 != Double.MIN_VALUE))
      {
        if (((paramBDLocation.g() == null) || (!paramBDLocation.g().equals("gcj02"))) && (paramBDLocation.g() != null)) {
          break label192;
        }
        arrayOfDouble = Jni.a(d1, d2, this.c.a);
        paramBDLocation.b(arrayOfDouble[0]);
        paramBDLocation.a(arrayOfDouble[1]);
        paramBDLocation.b(this.c.a);
      }
    }
    for (;;)
    {
      a(paramInt, "locStr", paramBDLocation);
      return;
      label192:
      if ((paramBDLocation.g() != null) && (paramBDLocation.g().equals("wgs84")) && (!this.c.a.equals("bd09ll")))
      {
        arrayOfDouble = Jni.a(d1, d2, "wgs842mc");
        paramBDLocation.b(arrayOfDouble[0]);
        paramBDLocation.a(arrayOfDouble[1]);
        paramBDLocation.b("wgs84mc");
      }
    }
  }
  
  public void b(BDLocation paramBDLocation)
  {
    if (this.c.h == true) {
      a(paramBDLocation);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\e\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */