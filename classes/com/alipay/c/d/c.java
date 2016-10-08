package com.alipay.c.d;

import android.content.Context;
import com.alipay.c.f.e;
import com.alipay.c.f.f;
import com.alipay.d.a.a.b.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c
{
  public static Map<String, String> a(Context paramContext)
  {
    b localb = b.a();
    HashMap localHashMap = new HashMap();
    Object localObject7 = e.a(paramContext);
    Object localObject2 = b.a(paramContext);
    Object localObject3 = b.b(paramContext);
    Object localObject4 = b.l(paramContext);
    Object localObject5 = b.o(paramContext);
    Object localObject6 = b.n(paramContext);
    Object localObject1;
    if (localObject7 != null)
    {
      localObject1 = localObject2;
      if (com.alipay.d.a.a.a.a.a((String)localObject2)) {
        localObject1 = ((f)localObject7).a();
      }
      localObject2 = localObject3;
      if (com.alipay.d.a.a.a.a.a((String)localObject3)) {
        localObject2 = ((f)localObject7).b();
      }
      localObject3 = localObject4;
      if (com.alipay.d.a.a.a.a.a((String)localObject4)) {
        localObject3 = ((f)localObject7).c();
      }
      localObject4 = localObject5;
      if (com.alipay.d.a.a.a.a.a((String)localObject5)) {
        localObject4 = ((f)localObject7).d();
      }
      localObject5 = localObject6;
      if (!com.alipay.d.a.a.a.a.a((String)localObject6)) {}
    }
    for (localObject5 = ((f)localObject7).e();; localObject5 = localException)
    {
      localObject6 = new f((String)localObject1, (String)localObject2, (String)localObject3, (String)localObject4, (String)localObject5);
      if (paramContext != null) {}
      try
      {
        localObject7 = new JSONObject();
        ((JSONObject)localObject7).put("imei", ((f)localObject6).a());
        ((JSONObject)localObject7).put("imsi", ((f)localObject6).b());
        ((JSONObject)localObject7).put("mac", ((f)localObject6).c());
        ((JSONObject)localObject7).put("bluetoothmac", ((f)localObject6).d());
        ((JSONObject)localObject7).put("gsi", ((f)localObject6).e());
        localObject6 = ((JSONObject)localObject7).toString();
        com.alipay.c.h.a.a("device_feature_file_name", "device_feature_file_key", (String)localObject6);
        com.alipay.c.h.a.a(paramContext, "device_feature_prefs_name", "device_feature_prefs_key", (String)localObject6);
        localHashMap.put("AD1", localObject1);
        localHashMap.put("AD2", localObject2);
        localHashMap.put("AD3", b.g(paramContext));
        localHashMap.put("AD5", b.i(paramContext));
        localHashMap.put("AD6", b.j(paramContext));
        localHashMap.put("AD7", b.k(paramContext));
        localHashMap.put("AD8", localObject3);
        localHashMap.put("AD9", b.m(paramContext));
        localHashMap.put("AD10", localObject5);
        localHashMap.put("AD11", b.d());
        localHashMap.put("AD12", localb.e());
        localHashMap.put("AD13", b.f());
        localHashMap.put("AD14", b.h());
        localHashMap.put("AD15", b.i());
        localHashMap.put("AD16", b.j());
        localHashMap.put("AD17", "");
        localHashMap.put("AD18", localObject4);
        localHashMap.put("AD19", b.p(paramContext));
        localHashMap.put("AD20", b.k());
        localHashMap.put("AD21", b.f(paramContext));
        localHashMap.put("AD22", "");
        localHashMap.put("AD23", b.l());
        localHashMap.put("AD24", com.alipay.d.a.a.a.a.f(b.h(paramContext)));
        localHashMap.put("AD26", b.e(paramContext));
        localHashMap.put("AD27", b.q());
        localHashMap.put("AD28", b.s());
        localHashMap.put("AD29", b.u());
        localHashMap.put("AD30", b.r());
        localHashMap.put("AD31", b.t());
        localHashMap.put("AD32", b.o());
        localHashMap.put("AD33", b.p());
        localHashMap.put("AD34", b.s(paramContext));
        localHashMap.put("AD35", b.t(paramContext));
        localHashMap.put("AD36", b.r(paramContext));
        localHashMap.put("AD37", b.n());
        localHashMap.put("AD38", b.m());
        localHashMap.put("AD39", b.c(paramContext));
        localHashMap.put("AD40", b.d(paramContext));
        localHashMap.put("AD41", b.b());
        localHashMap.put("AD42", b.c());
        localHashMap.put("AL3", b.q(paramContext));
        return localHashMap;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          com.alipay.c.c.a.a(localException);
        }
      }
      localObject1 = localObject2;
      localObject2 = localObject3;
      localObject3 = localObject4;
      localObject4 = localObject5;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\c\d\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */