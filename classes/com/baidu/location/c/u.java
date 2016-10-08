package com.baidu.location.c;

import com.baidu.location.Jni;
import com.baidu.location.b.b;
import com.baidu.location.b.l;
import com.baidu.location.b.n;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

final class u
  extends n
{
  private int k = 0;
  private long l = -1L;
  private long m = -1L;
  private boolean n = false;
  private final String o = Jni.e(String.format(Locale.US, "&ver=%s&cuid=%s&prod=%s:%s&sdk=%.2f", new Object[] { "1", b.a().b, b.d, b.c, Float.valueOf(6.12F) }));
  
  private u(s params)
  {
    this.f = new ArrayList();
  }
  
  private void b()
  {
    if (this.n) {}
    do
    {
      return;
      int j = 0;
      try
      {
        File localFile = new File(s.u(this.a).c(), "ofl.config");
        if ((this.m == -1L) && (localFile.exists()))
        {
          Object localObject1 = new Scanner(localFile);
          Object localObject2 = ((Scanner)localObject1).next();
          ((Scanner)localObject1).close();
          localObject1 = new JSONObject((String)localObject2);
          s.a(this.a, ((JSONObject)localObject1).getBoolean("ol"));
          s.b(this.a, ((JSONObject)localObject1).getBoolean("fl"));
          s.c(this.a, ((JSONObject)localObject1).getBoolean("on"));
          s.d(this.a, ((JSONObject)localObject1).getBoolean("wn"));
          s.e(this.a, ((JSONObject)localObject1).getBoolean("oc"));
          this.m = ((JSONObject)localObject1).getLong("t");
          if (((JSONObject)localObject1).has("cplist")) {
            s.a(this.a, ((JSONObject)localObject1).getString("cplist").split(";"));
          }
          if (((JSONObject)localObject1).has("rgcgp")) {
            s.a(this.a, ((JSONObject)localObject1).getInt("rgcgp"));
          }
          if (((JSONObject)localObject1).has("rgcon")) {
            s.f(this.a, ((JSONObject)localObject1).getBoolean("rgcon"));
          }
          if (((JSONObject)localObject1).has("addrup")) {
            s.b(this.a, ((JSONObject)localObject1).getInt("addrup"));
          }
          if (((JSONObject)localObject1).has("poiup")) {
            s.c(this.a, ((JSONObject)localObject1).getInt("poiup"));
          }
          if (((JSONObject)localObject1).has("oflp"))
          {
            localObject2 = ((JSONObject)localObject1).getJSONObject("oflp");
            if (((JSONObject)localObject2).has("0")) {
              s.a(this.a, ((JSONObject)localObject2).getDouble("0"));
            }
            if (((JSONObject)localObject2).has("1")) {
              s.b(this.a, ((JSONObject)localObject2).getDouble("1"));
            }
            if (((JSONObject)localObject2).has("2")) {
              s.c(this.a, ((JSONObject)localObject2).getDouble("2"));
            }
            if (((JSONObject)localObject2).has("3")) {
              s.d(this.a, ((JSONObject)localObject2).getDouble("3"));
            }
            if (((JSONObject)localObject2).has("4")) {
              s.e(this.a, ((JSONObject)localObject2).getDouble("4"));
            }
          }
          if (((JSONObject)localObject1).has("onlt"))
          {
            localObject2 = ((JSONObject)localObject1).getJSONObject("onlt");
            if (((JSONObject)localObject2).has("0")) {
              s.a(this.a, ((JSONObject)localObject2).getLong("0"));
            }
            if (((JSONObject)localObject2).has("1")) {
              s.b(this.a, ((JSONObject)localObject2).getLong("1"));
            }
            if (((JSONObject)localObject2).has("2")) {
              s.c(this.a, ((JSONObject)localObject2).getLong("2"));
            }
            if (((JSONObject)localObject2).has("3")) {
              s.d(this.a, ((JSONObject)localObject2).getLong("3"));
            }
            if (((JSONObject)localObject2).has("4")) {
              s.e(this.a, ((JSONObject)localObject2).getLong("4"));
            }
          }
          if (((JSONObject)localObject1).has("minapn")) {
            s.d(this.a, ((JSONObject)localObject1).getInt("minapn"));
          }
        }
        if ((this.m == -1L) && (!localFile.exists())) {}
        i = j;
        if (this.m != -1L)
        {
          long l1 = this.m;
          long l2 = System.currentTimeMillis();
          i = j;
          if (l1 + 86400000L <= l2) {
            i = 1;
          }
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          int i = j;
        }
      }
    } while (((this.m != -1L) && (i == 0)) || (!c()) || (!l.a(s.u(this.a).b())));
    this.n = true;
    f();
  }
  
  private boolean c()
  {
    boolean bool = true;
    if (this.k < 2) {}
    for (;;)
    {
      if (!bool) {}
      return bool;
      if (this.l + 86400000L < System.currentTimeMillis())
      {
        this.k = 0;
        this.l = -1L;
      }
      else
      {
        bool = false;
      }
    }
  }
  
  public void a()
  {
    this.f.clear();
    this.f.add(new BasicNameValuePair("qt", "conf"));
    this.f.add(new BasicNameValuePair("req", this.o));
    this.c = i.a;
  }
  
  public void a(boolean paramBoolean)
  {
    if ((paramBoolean) && (this.e != null)) {}
    for (;;)
    {
      try
      {
        JSONObject localJSONObject2 = new JSONObject(EntityUtils.toString(this.e, "utf-8"));
        Object localObject1 = "1";
        long l1 = 0L;
        if (localJSONObject2.has("ofl")) {
          l1 = localJSONObject2.getLong("ofl");
        }
        if (localJSONObject2.has("ver")) {
          localObject1 = localJSONObject2.getString("ver");
        }
        if ((l1 & 1L) == 1L) {
          s.a(this.a, true);
        }
        if ((l1 & 0x2) == 2L) {
          s.b(this.a, true);
        }
        if ((l1 & 0x4) == 4L) {
          s.c(this.a, true);
        }
        if ((l1 & 0x8) == 8L) {
          s.d(this.a, true);
        }
        if ((0x10 & l1) == 16L) {
          s.e(this.a, true);
        }
        if ((l1 & 0x20) == 32L) {
          s.f(this.a, true);
        }
        JSONObject localJSONObject1 = new JSONObject();
        if (localJSONObject2.has("cplist"))
        {
          s.a(this.a, localJSONObject2.getString("cplist").split(";"));
          localJSONObject1.put("cplist", localJSONObject2.getString("cplist"));
        }
        Object localObject2;
        if (localJSONObject2.has("bklist"))
        {
          localObject2 = localJSONObject2.getString("bklist").split(";");
          this.a.a((String[])localObject2);
        }
        if (localJSONObject2.has("para"))
        {
          localJSONObject2 = localJSONObject2.getJSONObject("para");
          if (localJSONObject2.has("rgcgp")) {
            s.a(this.a, localJSONObject2.getInt("rgcgp"));
          }
          if (localJSONObject2.has("addrup")) {
            s.b(this.a, localJSONObject2.getInt("addrup"));
          }
          if (localJSONObject2.has("poiup")) {
            s.c(this.a, localJSONObject2.getInt("poiup"));
          }
          if (localJSONObject2.has("oflp"))
          {
            localObject2 = localJSONObject2.getJSONObject("oflp");
            if (((JSONObject)localObject2).has("0")) {
              s.a(this.a, ((JSONObject)localObject2).getDouble("0"));
            }
            if (((JSONObject)localObject2).has("1")) {
              s.b(this.a, ((JSONObject)localObject2).getDouble("1"));
            }
            if (((JSONObject)localObject2).has("2")) {
              s.c(this.a, ((JSONObject)localObject2).getDouble("2"));
            }
            if (((JSONObject)localObject2).has("3")) {
              s.d(this.a, ((JSONObject)localObject2).getDouble("3"));
            }
            if (((JSONObject)localObject2).has("4")) {
              s.e(this.a, ((JSONObject)localObject2).getDouble("4"));
            }
          }
          if (localJSONObject2.has("onlt"))
          {
            localObject2 = localJSONObject2.getJSONObject("onlt");
            if (((JSONObject)localObject2).has("0")) {
              s.a(this.a, ((JSONObject)localObject2).getLong("0"));
            }
            if (((JSONObject)localObject2).has("1")) {
              s.b(this.a, ((JSONObject)localObject2).getLong("1"));
            }
            if (((JSONObject)localObject2).has("2")) {
              s.c(this.a, ((JSONObject)localObject2).getLong("2"));
            }
            if (((JSONObject)localObject2).has("3")) {
              s.d(this.a, ((JSONObject)localObject2).getLong("3"));
            }
            if (((JSONObject)localObject2).has("4")) {
              s.e(this.a, ((JSONObject)localObject2).getLong("4"));
            }
          }
          if (localJSONObject2.has("minapn")) {
            s.d(this.a, localJSONObject2.getInt("minapn"));
          }
        }
        localJSONObject1.put("ol", s.a(this.a));
        localJSONObject1.put("fl", s.b(this.a));
        localJSONObject1.put("on", s.c(this.a));
        localJSONObject1.put("wn", s.d(this.a));
        localJSONObject1.put("oc", s.e(this.a));
        this.m = System.currentTimeMillis();
        localJSONObject1.put("t", this.m);
        localJSONObject1.put("ver", localObject1);
        localJSONObject1.put("rgcon", s.f(this.a));
        localJSONObject1.put("rgcgp", s.g(this.a));
        localObject1 = new JSONObject();
        ((JSONObject)localObject1).put("0", s.h(this.a));
        ((JSONObject)localObject1).put("1", s.i(this.a));
        ((JSONObject)localObject1).put("2", s.j(this.a));
        ((JSONObject)localObject1).put("3", s.k(this.a));
        ((JSONObject)localObject1).put("4", s.l(this.a));
        localJSONObject1.put("oflp", localObject1);
        localObject1 = new JSONObject();
        ((JSONObject)localObject1).put("0", s.m(this.a));
        ((JSONObject)localObject1).put("1", s.n(this.a));
        ((JSONObject)localObject1).put("2", s.o(this.a));
        ((JSONObject)localObject1).put("3", s.p(this.a));
        ((JSONObject)localObject1).put("4", s.q(this.a));
        localJSONObject1.put("onlt", localObject1);
        localJSONObject1.put("addrup", s.r(this.a));
        localJSONObject1.put("poiup", s.s(this.a));
        localJSONObject1.put("minapn", s.t(this.a));
        localObject1 = new File(s.u(this.a).c(), "ofl.config");
        if (!((File)localObject1).exists()) {
          ((File)localObject1).createNewFile();
        }
        localObject1 = new FileWriter((File)localObject1);
        ((FileWriter)localObject1).write(localJSONObject1.toString());
        ((FileWriter)localObject1).close();
      }
      catch (Exception localException)
      {
        this.k += 1;
        this.l = System.currentTimeMillis();
        continue;
      }
      this.n = false;
      return;
      this.k += 1;
      this.l = System.currentTimeMillis();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\c\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */