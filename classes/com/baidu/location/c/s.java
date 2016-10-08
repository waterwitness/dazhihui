package com.baidu.location.c;

import android.database.sqlite.SQLiteDatabase;
import java.util.Locale;

final class s
{
  private final i a;
  private final SQLiteDatabase b;
  private final u c;
  private boolean d;
  private boolean e;
  private boolean f;
  private boolean g;
  private boolean h;
  private String[] i;
  private boolean j;
  private int k;
  private int l;
  private int m;
  private double n;
  private double o;
  private double p;
  private double q;
  private double r;
  private int s;
  private boolean t = true;
  private long u = 8000L;
  private long v = 5000L;
  private long w = 5000L;
  private long x = 5000L;
  private long y = 5000L;
  
  s(i parami, SQLiteDatabase paramSQLiteDatabase)
  {
    this.a = parami;
    this.d = false;
    this.e = false;
    this.f = false;
    this.g = false;
    this.h = false;
    this.j = false;
    this.k = 6;
    this.l = 30;
    this.m = 30;
    this.n = 0.0D;
    this.o = 0.0D;
    this.p = 0.0D;
    this.q = 0.0D;
    this.r = 0.0D;
    this.s = 8;
    this.i = new String[0];
    this.b = paramSQLiteDatabase;
    this.c = new u(this, null);
    if ((this.b != null) && (this.b.isOpen())) {
      this.b.execSQL("CREATE TABLE IF NOT EXISTS BLACK (name VARCHAR(100) PRIMARY KEY);");
    }
    g();
  }
  
  int a()
  {
    return this.s;
  }
  
  long a(String paramString)
  {
    long l1 = 5000L;
    if (paramString.equals("2G")) {
      l1 = this.u;
    }
    do
    {
      return l1;
      if (paramString.equals("3G")) {
        return this.v;
      }
      if (paramString.equals("4G")) {
        return this.w;
      }
      if (paramString.equals("WIFI")) {
        return this.x;
      }
    } while (!paramString.equals("unknown"));
    return this.y;
  }
  
  void a(String[] paramArrayOfString)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i1 = 0;
    while (i1 < paramArrayOfString.length)
    {
      if (i1 > 0) {
        localStringBuffer.append(",");
      }
      localStringBuffer.append("(\"");
      localStringBuffer.append(paramArrayOfString[i1]);
      localStringBuffer.append("\")");
      i1 += 1;
    }
    if ((this.b != null) && (this.b.isOpen()) && (localStringBuffer.length() > 0)) {
      paramArrayOfString = String.format(Locale.US, "INSERT OR IGNORE INTO BLACK VALUES %s;", new Object[] { localStringBuffer.toString() });
    }
    try
    {
      this.b.execSQL(paramArrayOfString);
      return;
    }
    catch (Exception paramArrayOfString) {}
  }
  
  double b()
  {
    return this.n;
  }
  
  double c()
  {
    return this.o;
  }
  
  double d()
  {
    return this.p;
  }
  
  double e()
  {
    return this.q;
  }
  
  double f()
  {
    return this.r;
  }
  
  void g()
  {
    u.a(this.c);
  }
  
  boolean h()
  {
    return this.d;
  }
  
  boolean i()
  {
    return this.f;
  }
  
  boolean j()
  {
    return this.g;
  }
  
  boolean k()
  {
    return this.e;
  }
  
  boolean l()
  {
    return this.j;
  }
  
  boolean m()
  {
    return this.t;
  }
  
  int n()
  {
    return this.k;
  }
  
  String[] o()
  {
    return this.i;
  }
  
  int p()
  {
    return this.m;
  }
  
  int q()
  {
    return this.l;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\c\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */