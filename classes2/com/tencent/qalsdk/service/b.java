package com.tencent.qalsdk.service;

import android.text.TextUtils;
import com.tencent.qalsdk.base.remote.FromServiceMsg;
import com.tencent.qalsdk.base.remote.IMsfServiceCallbacker;
import com.tencent.qalsdk.base.remote.ToServiceMsg;
import com.tencent.qalsdk.core.j;
import com.tencent.qalsdk.sdk.w;
import com.tencent.qalsdk.util.QLog;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class b
{
  private static final String h = "MSF.S.AppProcessInfo";
  volatile boolean a = true;
  volatile long b = 0L;
  volatile boolean c = false;
  volatile long d = 0L;
  String e;
  String f;
  ConcurrentLinkedQueue<w> g = new ConcurrentLinkedQueue();
  private IMsfServiceCallbacker i;
  
  public static byte[] a(FromServiceMsg paramFromServiceMsg)
  {
    byte[] arrayOfByte = paramFromServiceMsg.getWupBuffer();
    paramFromServiceMsg = null;
    if (arrayOfByte.length - 4 >= 0)
    {
      paramFromServiceMsg = new byte[arrayOfByte.length - 4];
      System.arraycopy(arrayOfByte, 4, paramFromServiceMsg, 0, arrayOfByte.length - 4);
    }
    return paramFromServiceMsg;
  }
  
  public String a()
  {
    return this.e + "," + b() + "," + this.a;
  }
  
  public void a(IMsfServiceCallbacker paramIMsfServiceCallbacker)
  {
    this.i = paramIMsfServiceCallbacker;
  }
  
  public void a(ToServiceMsg paramToServiceMsg, FromServiceMsg paramFromServiceMsg)
  {
    this.g.add(new w(paramToServiceMsg, paramFromServiceMsg));
    c.d.a();
  }
  
  public void a(String paramString)
  {
    this.f = paramString;
  }
  
  public void a(String paramString, FromServiceMsg paramFromServiceMsg)
  {
    if (!TextUtils.isEmpty(this.f))
    {
      int j = c.e.b(paramString);
      paramString = (com.tencent.qalsdk.sdk.a)j.a().b().d().get(paramString);
      if (paramString != null) {
        g.a(QalService.context, this.e, paramString.a, this.f, j, paramFromServiceMsg.getServiceCmd(), a(paramFromServiceMsg));
      }
    }
  }
  
  public void a(String paramString1, String paramString2, IMsfServiceCallbacker paramIMsfServiceCallbacker)
  {
    this.e = paramString1;
    a(paramString2);
    if (paramIMsfServiceCallbacker != null)
    {
      a(paramIMsfServiceCallbacker);
      this.a = true;
    }
    for (;;)
    {
      this.d = 0L;
      this.c = false;
      if (QLog.isColorLevel()) {
        QLog.d("MSF.S.AppProcessInfo", 2, paramString1 + " onAppBind, isAppConnected " + this.a);
      }
      return;
      if (c() == null) {
        this.a = false;
      } else {
        this.a = true;
      }
    }
  }
  
  public String b()
  {
    return this.f;
  }
  
  public IMsfServiceCallbacker c()
  {
    return this.i;
  }
  
  public void d()
  {
    a(null);
    this.a = false;
    this.c = false;
    if (QLog.isColorLevel()) {
      QLog.d("MSF.S.AppProcessInfo", 2, this.e + " setAppDisConnected, isAppConnected " + this.a);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\service\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */