package com.h.a.b.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Environment;
import com.h.a.a.a.h;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class e
{
  private String a = "";
  private String b = "";
  private boolean c = false;
  private boolean d = false;
  private boolean e = false;
  private SharedPreferences f = null;
  private b g = null;
  private SharedPreferences.Editor h = null;
  private c i = null;
  private Context j = null;
  private f k = null;
  private boolean l = false;
  
  public e(Context paramContext, String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.c = paramBoolean1;
    this.l = paramBoolean2;
    this.a = paramString2;
    this.b = paramString1;
    this.j = paramContext;
    l1 = 0L;
    if (paramContext != null)
    {
      this.f = paramContext.getSharedPreferences(paramString2, 0);
      l1 = this.f.getLong("t", 0L);
    }
    localObject = null;
    try
    {
      String str = Environment.getExternalStorageState();
      localObject = str;
    }
    catch (Exception localException)
    {
      long l2;
      long l3;
      long l4;
      for (;;)
      {
        try
        {
          this.g = this.k.a(paramString2, 0);
          l2 = this.g.a("t", 0L);
          if (!paramBoolean2) {
            if (l1 <= l2) {}
          }
        }
        catch (Exception paramContext)
        {
          l2 = l1;
          l1 = 0L;
        }
        try
        {
          a(this.f, this.g);
          this.g = this.k.a(paramString2, 0);
          l3 = l2;
          l2 = l1;
          l1 = l3;
          if ((l2 != l1) || ((l2 == 0L) && (l1 == 0L)))
          {
            l3 = System.currentTimeMillis();
            if ((!this.l) || ((this.l) && (l2 == 0L) && (l1 == 0L))) {
              if (this.f != null)
              {
                paramContext = this.f.edit();
                paramContext.putLong("t2", l3);
                paramContext.commit();
              }
            }
          }
          try
          {
            if (this.g != null)
            {
              paramContext = this.g.c();
              paramContext.a("t2", l3);
              paramContext.b();
            }
            return;
          }
          catch (Exception paramContext)
          {
            return;
          }
          localException = localException;
          localException.printStackTrace();
        }
        catch (Exception paramContext)
        {
          l3 = l1;
          l1 = l2;
          l2 = l3;
          break label911;
        }
        if (((String)localObject).equals("mounted"))
        {
          this.e = true;
          this.d = true;
        }
        else if (((String)localObject).equals("mounted_ro"))
        {
          this.d = true;
          this.e = false;
        }
        else
        {
          this.e = false;
          this.d = false;
          continue;
          if (l1 < l2)
          {
            a(this.g, this.f);
            this.f = paramContext.getSharedPreferences(paramString2, 0);
            l3 = l1;
            l1 = l2;
            l2 = l3;
          }
          else if (l1 == l2)
          {
            a(this.f, this.g);
            this.g = this.k.a(paramString2, 0);
            l3 = l1;
            l1 = l2;
            l2 = l3;
            continue;
            l3 = this.f.getLong("t2", 0L);
            try
            {
              l4 = this.g.a("t2", 0L);
              if ((l3 >= l4) || (l3 <= 0L)) {}
            }
            catch (Exception paramContext)
            {
              l1 = l2;
              l2 = l3;
            }
          }
          else
          {
            try
            {
              a(this.f, this.g);
              this.g = this.k.a(paramString2, 0);
              l1 = l4;
              l2 = l3;
            }
            catch (Exception paramContext)
            {
              l2 = l3;
              l1 = l4;
            }
            if ((l3 > l4) && (l4 > 0L))
            {
              a(this.g, this.f);
              this.f = paramContext.getSharedPreferences(paramString2, 0);
              l1 = l4;
              l2 = l3;
            }
            else if ((l3 == 0L) && (l4 > 0L))
            {
              a(this.g, this.f);
              this.f = paramContext.getSharedPreferences(paramString2, 0);
              l1 = l4;
              l2 = l3;
            }
            else if ((l4 == 0L) && (l3 > 0L))
            {
              a(this.f, this.g);
              this.g = this.k.a(paramString2, 0);
              l1 = l4;
              l2 = l3;
            }
            else
            {
              l1 = l4;
              l2 = l3;
              if (l3 == l4)
              {
                a(this.f, this.g);
                this.g = this.k.a(paramString2, 0);
                l1 = l4;
                l2 = l3;
                continue;
                l3 = l1;
                l1 = l2;
                l2 = l3;
                continue;
                l2 = l1;
                l1 = 0L;
              }
            }
          }
        }
      }
    }
    if (h.a((String)localObject))
    {
      this.e = false;
      this.d = false;
      if (((!this.d) && (!this.e)) || (paramContext == null) || (h.a(paramString1))) {
        break label892;
      }
      this.k = c(paramString1);
      if (this.k == null) {
        break label892;
      }
    }
  }
  
  private void a(SharedPreferences paramSharedPreferences, b paramb)
  {
    if ((paramSharedPreferences != null) && (paramb != null))
    {
      paramb = paramb.c();
      if (paramb != null)
      {
        paramb.a();
        paramSharedPreferences = paramSharedPreferences.getAll().entrySet().iterator();
      }
    }
    for (;;)
    {
      if (!paramSharedPreferences.hasNext())
      {
        paramb.b();
        return;
      }
      Object localObject = (Map.Entry)paramSharedPreferences.next();
      String str = (String)((Map.Entry)localObject).getKey();
      localObject = ((Map.Entry)localObject).getValue();
      if ((localObject instanceof String)) {
        paramb.a(str, (String)localObject);
      } else if ((localObject instanceof Integer)) {
        paramb.a(str, ((Integer)localObject).intValue());
      } else if ((localObject instanceof Long)) {
        paramb.a(str, ((Long)localObject).longValue());
      } else if ((localObject instanceof Float)) {
        paramb.a(str, ((Float)localObject).floatValue());
      } else if ((localObject instanceof Boolean)) {
        paramb.a(str, ((Boolean)localObject).booleanValue());
      }
    }
  }
  
  private void a(b paramb, SharedPreferences paramSharedPreferences)
  {
    if ((paramb != null) && (paramSharedPreferences != null))
    {
      paramSharedPreferences = paramSharedPreferences.edit();
      if (paramSharedPreferences != null)
      {
        paramSharedPreferences.clear();
        paramb = paramb.b().entrySet().iterator();
      }
    }
    for (;;)
    {
      if (!paramb.hasNext())
      {
        paramSharedPreferences.commit();
        return;
      }
      Object localObject = (Map.Entry)paramb.next();
      String str = (String)((Map.Entry)localObject).getKey();
      localObject = ((Map.Entry)localObject).getValue();
      if ((localObject instanceof String)) {
        paramSharedPreferences.putString(str, (String)localObject);
      } else if ((localObject instanceof Integer)) {
        paramSharedPreferences.putInt(str, ((Integer)localObject).intValue());
      } else if ((localObject instanceof Long)) {
        paramSharedPreferences.putLong(str, ((Long)localObject).longValue());
      } else if ((localObject instanceof Float)) {
        paramSharedPreferences.putFloat(str, ((Float)localObject).floatValue());
      } else if ((localObject instanceof Boolean)) {
        paramSharedPreferences.putBoolean(str, ((Boolean)localObject).booleanValue());
      }
    }
  }
  
  private boolean b()
  {
    if (this.g != null)
    {
      boolean bool = this.g.a();
      if (!bool) {
        a();
      }
      return bool;
    }
    return false;
  }
  
  private f c(String paramString)
  {
    paramString = d(paramString);
    if (paramString != null)
    {
      this.k = new f(paramString.getAbsolutePath());
      return this.k;
    }
    return null;
  }
  
  private void c()
  {
    if ((this.h == null) && (this.f != null)) {
      this.h = this.f.edit();
    }
    if ((this.e) && (this.i == null) && (this.g != null)) {
      this.i = this.g.c();
    }
    b();
  }
  
  private File d(String paramString)
  {
    File localFile = Environment.getExternalStorageDirectory();
    if (localFile != null)
    {
      paramString = new File(String.format("%s%s%s", new Object[] { localFile.getAbsolutePath(), File.separator, paramString }));
      if ((paramString != null) && (!paramString.exists())) {
        paramString.mkdirs();
      }
      return paramString;
    }
    return null;
  }
  
  public void a(String paramString)
  {
    if ((!h.a(paramString)) && (!paramString.equals("t")))
    {
      c();
      if (this.h != null) {
        this.h.remove(paramString);
      }
      if (this.i != null) {
        this.i.a(paramString);
      }
    }
  }
  
  public void a(String paramString1, String paramString2)
  {
    if ((!h.a(paramString1)) && (!paramString1.equals("t")))
    {
      c();
      if (this.h != null) {
        this.h.putString(paramString1, paramString2);
      }
      if (this.i != null) {
        this.i.a(paramString1, paramString2);
      }
    }
  }
  
  public boolean a()
  {
    boolean bool2 = true;
    long l1 = System.currentTimeMillis();
    boolean bool1 = bool2;
    if (this.h != null)
    {
      if ((!this.l) && (this.f != null)) {
        this.h.putLong("t", l1);
      }
      bool1 = bool2;
      if (!this.h.commit()) {
        bool1 = false;
      }
    }
    if ((this.f != null) && (this.j != null)) {
      this.f = this.j.getSharedPreferences(this.a, 0);
    }
    Object localObject1 = null;
    try
    {
      localObject2 = Environment.getExternalStorageState();
      localObject1 = localObject2;
    }
    catch (Exception localException2)
    {
      for (;;)
      {
        try
        {
          Object localObject2;
          boolean bool3;
          if (this.k != null)
          {
            this.g = this.k.a(this.a, 0);
            bool3 = bool2;
          }
          return bool3;
        }
        catch (Exception localException1) {}
        localException2 = localException2;
        localException2.printStackTrace();
        continue;
        a(this.g, this.f);
        continue;
        bool2 = bool1;
        if (this.i != null)
        {
          bool2 = bool1;
          if (!this.i.b()) {
            bool2 = false;
          }
        }
      }
    }
    bool3 = bool1;
    if (!h.a((String)localObject1))
    {
      bool2 = bool1;
      if (((String)localObject1).equals("mounted"))
      {
        if (this.g != null) {
          break label289;
        }
        localObject2 = c(this.b);
        bool2 = bool1;
        if (localObject2 != null)
        {
          this.g = ((f)localObject2).a(this.a, 0);
          if (this.l) {
            break label274;
          }
          a(this.f, this.g);
          this.i = this.g.c();
          bool2 = bool1;
        }
      }
      if (!((String)localObject1).equals("mounted"))
      {
        bool3 = bool2;
        if (((String)localObject1).equals("mounted_ro"))
        {
          bool3 = bool2;
          if (this.g == null) {}
        }
      }
      else
      {
        bool3 = bool2;
      }
    }
    label274:
    label289:
    return bool2;
  }
  
  public String b(String paramString)
  {
    b();
    if (this.f != null)
    {
      String str = this.f.getString(paramString, "");
      if (!h.a(str)) {
        return str;
      }
    }
    if (this.g != null) {
      return this.g.a(paramString, "");
    }
    return "";
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\h\a\b\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */