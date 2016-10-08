package com.iflytek.sunflower;

import com.iflytek.sunflower.a.a;
import com.iflytek.sunflower.a.b;
import com.iflytek.sunflower.a.c;
import com.iflytek.sunflower.a.d;
import com.iflytek.sunflower.c.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
import org.json.JSONException;
import org.json.JSONObject;

public class f
{
  public static Stack<com.iflytek.sunflower.a.e> a = new Stack();
  public static ArrayList<com.iflytek.sunflower.a.e> b = new ArrayList();
  public static Object c = new Object();
  private static ArrayList<a> d = new ArrayList();
  private static ArrayList<d> e = new ArrayList();
  private static HashMap<String, d> f = new HashMap();
  private static ArrayList<b> g = new ArrayList();
  private static ArrayList<c> h = new ArrayList();
  
  public static ArrayList<d> a()
  {
    return e;
  }
  
  public static void a(a parama)
  {
    d.add(parama);
  }
  
  public static void a(b paramb)
  {
    g.add(paramb);
  }
  
  public static void a(c paramc)
  {
    h.add(paramc);
  }
  
  public static void a(d paramd)
  {
    f.put(paramd.b, paramd);
  }
  
  public static void a(com.iflytek.sunflower.a.e parame)
  {
    b.add(parame);
  }
  
  public static ArrayList<c> b()
  {
    return h;
  }
  
  public static void b(d paramd)
  {
    if (f.containsKey(paramd.b))
    {
      d locald = (d)f.get(paramd.b);
      locald.e = (paramd.f - locald.f);
      c(locald);
      f.remove(paramd.b);
      return;
    }
    g.a("Collector", "Call onEventEnd before onEventBegin");
  }
  
  public static ArrayList<a> c()
  {
    return d;
  }
  
  public static void c(d paramd)
  {
    synchronized (c)
    {
      try
      {
        g.b("Collector", "Add an event:" + e.a(paramd).toString());
        e.add(paramd);
        return;
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          g.a("Collector", "Add an event error", localJSONException);
        }
      }
    }
  }
  
  public static ArrayList<b> d()
  {
    return g;
  }
  
  public static void e()
  {
    synchronized (c)
    {
      e.clear();
      return;
    }
  }
  
  public static void f()
  {
    h.clear();
  }
  
  public static void g()
  {
    b.clear();
  }
  
  public static void h()
  {
    d.clear();
  }
  
  public static void i()
  {
    g.clear();
  }
  
  public static void j()
  {
    e();
    f();
    h();
    i();
  }
  
  public static int k()
  {
    return 0 + d.size() + g.size() + e.size() + h.size();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\sunflower\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */