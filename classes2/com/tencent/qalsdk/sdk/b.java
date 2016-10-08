package com.tencent.qalsdk.sdk;

import com.tencent.qalsdk.base.remote.ToServiceMsg;
import java.util.concurrent.ConcurrentHashMap;

public class b
{
  static ConcurrentHashMap<String, aj> a = new ConcurrentHashMap();
  
  public static int a(ToServiceMsg paramToServiceMsg)
  {
    if (paramToServiceMsg == null) {
      return -1;
    }
    if (paramToServiceMsg.getServiceName().equals(ac.a().b())) {
      return ac.a().b(paramToServiceMsg);
    }
    if (!a.containsKey(paramToServiceMsg.getServiceName())) {
      a.putIfAbsent(paramToServiceMsg.getServiceName(), new aj(paramToServiceMsg.getServiceName()));
    }
    return ((aj)a.get(paramToServiceMsg.getServiceName())).c(paramToServiceMsg);
  }
  
  public static void a(String paramString)
  {
    if (paramString == null) {
      return;
    }
    if (paramString.equals(ac.a().b()))
    {
      ac.a().c();
      return;
    }
    if (!a.containsKey(paramString)) {
      a.putIfAbsent(paramString, new aj(paramString));
    }
    ((aj)a.get(paramString)).i();
  }
  
  public static void b(String paramString)
  {
    if (paramString == null) {
      return;
    }
    if (paramString.equals(ac.a().b()))
    {
      ac.a().d();
      return;
    }
    if (!a.containsKey(paramString)) {
      a.putIfAbsent(paramString, new aj(paramString));
    }
    ((aj)a.get(paramString)).a();
  }
  
  public static void c(String paramString)
  {
    if (paramString == null) {
      return;
    }
    if (paramString.equals(ac.a().b()))
    {
      ac.a().e();
      return;
    }
    if (!a.containsKey(paramString)) {
      a.putIfAbsent(paramString, new aj(paramString));
    }
    ((aj)a.get(paramString)).b();
  }
  
  public static boolean d(String paramString)
  {
    if (paramString == null) {}
    do
    {
      return false;
      if (paramString.equals(ac.a().b()))
      {
        ac.a().h();
        return true;
      }
    } while (!a.containsKey(paramString));
    ((aj)a.get(paramString)).g();
    return true;
  }
  
  public static boolean e(String paramString)
  {
    if (paramString == null) {}
    do
    {
      return false;
      if (paramString.equals(ac.a().b()))
      {
        ac.a().i();
        return true;
      }
    } while (!a.containsKey(paramString));
    ((aj)a.get(paramString)).c();
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\sdk\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */