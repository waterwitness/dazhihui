package com.android.dazhihui.c.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.android.dazhihui.ui.delegate.b.g;

public class a
  extends SQLiteOpenHelper
{
  public static String[] A = { "无" };
  public static String[][] B = (String[][])null;
  public static String[][] C = (String[][])null;
  public static String[][] D = (String[][])null;
  public static String[][] E = (String[][])null;
  public static String[] F = null;
  public static short G = 0;
  public static String H = "";
  public static String[] I = null;
  public static String[][] J = (String[][])null;
  public static int[][] K = (int[][])null;
  public static int L = -1;
  public static String[] M = new String[0];
  public static String[][] N;
  public static String[][] O;
  public static String[][] P;
  private static int[] S = { 0, 3, 5, 8, 9, 11, 12, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 52 };
  private static int[] T = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
  public static String[] a = { "", "" };
  public static int[] b = { 20, 20, 20, 20 };
  public static String[] c = { "SH000001", "SZ399001" };
  public static int d = 0;
  public static String[] e = new String[0];
  public static int f = 3;
  public static int g = -1;
  public static int h = 0;
  public static String[][] i = (String[][])null;
  public static String[] j = null;
  public static int k = 3;
  public static int l = 120;
  public static int m = -1;
  public static int n = 0;
  public static int o = 0;
  public static int p = -1;
  public static String[][] q = (String[][])null;
  public static int r = -1;
  public static String[] s = { "", "" };
  public static int t = 0;
  public static String u = "";
  public static String[][] v = (String[][])null;
  public static String[][] w = (String[][])null;
  public static String[] x = new String[0];
  public static int y = 1;
  public static String z = "";
  private SQLiteDatabase Q;
  private Cursor R;
  
  public a(Context paramContext)
  {
    super(paramContext, "GTJA", null, 1);
    a();
  }
  
  private static int b(int paramInt)
  {
    int i1 = 0;
    while (i1 < S.length)
    {
      if (paramInt == S[i1]) {
        return i1;
      }
      i1 += 1;
    }
    return -1;
  }
  
  public void a()
  {
    try
    {
      this.Q = getReadableDatabase();
      this.R = this.Q.query("gwm_table", null, null, null, null, null, null);
      this.R.moveToFirst();
      int i4 = 0;
      i1 = -1;
      for (;;)
      {
        i2 = i1;
        try
        {
          if (i4 >= this.R.getCount()) {
            break label1145;
          }
          i2 = i1;
          i3 = Integer.parseInt(this.R.getString(0));
          i2 = i1;
          g localg = new g(this.R.getBlob(1));
          i2 = i1;
          localg.a(true);
          i2 = i1;
          i5 = localg.d();
          i2 = i1;
          int i6 = b(i5);
          if (i6 != -1)
          {
            i2 = i1;
            T[i6] = i3;
          }
          if (i5 == 0)
          {
            i2 = i1;
            a = localg.l();
            i3 = i1;
          }
          for (;;)
          {
            i2 = i3;
            this.R.moveToNext();
            i4 += 1;
            i1 = i3;
            break;
            if (i5 != 2) {
              break label259;
            }
            i3 = i1;
            i2 = i1;
            if (r == -1)
            {
              i2 = i1;
              r = localg.d() + 1;
              i3 = i1;
            }
          }
          if (r != -1) {
            break label232;
          }
        }
        catch (Throwable localThrowable1)
        {
          i1 = i2;
        }
      }
    }
    catch (Throwable localThrowable2)
    {
      for (;;)
      {
        int i2;
        int i3;
        int i5;
        label215:
        label232:
        label259:
        label1145:
        label1157:
        int i1 = -1;
      }
    }
    r = 0;
    a(26);
    if (L == -1) {
      if (i1 == -1) {
        break label1157;
      }
    }
    for (L = i1;; L = 180)
    {
      a(47);
      close();
      return;
      if (i5 == 3)
      {
        i2 = i1;
        b = localThrowable1.k();
        i3 = i1;
        break;
      }
      if (i5 == 5)
      {
        i2 = i1;
        c = localThrowable1.l();
        i3 = i1;
        break;
      }
      if (i5 == 8)
      {
        i2 = i1;
        d = localThrowable1.d();
        i3 = i1;
        break;
      }
      if (i5 == 9)
      {
        i2 = i1;
        e = localThrowable1.l();
        i3 = i1;
        break;
      }
      if (i5 == 11)
      {
        i2 = i1;
        f = localThrowable1.d();
        i3 = i1;
        break;
      }
      if (i5 == 12)
      {
        i2 = i1;
        g = localThrowable1.d();
        i3 = i1;
        break;
      }
      if (i5 == 18)
      {
        i2 = i1;
        h = localThrowable1.d();
        i3 = i1;
        break;
      }
      if (i5 == 19)
      {
        i2 = i1;
        i = localThrowable1.m();
        i3 = i1;
        break;
      }
      if (i5 == 20)
      {
        i2 = i1;
        l = localThrowable1.d();
        i2 = i1;
        i3 = l;
        break;
      }
      if (i5 == 21)
      {
        i2 = i1;
        m = localThrowable1.d();
        i3 = i1;
        break;
      }
      if (i5 == 22)
      {
        i2 = i1;
        n = localThrowable1.d();
        i3 = i1;
        break;
      }
      if (i5 == 23)
      {
        i2 = i1;
        o = localThrowable1.d();
        i3 = i1;
        break;
      }
      if (i5 == 24)
      {
        i2 = i1;
        p = localThrowable1.d();
        i3 = i1;
        break;
      }
      if (i5 == 25)
      {
        i2 = i1;
        q = localThrowable1.m();
        i3 = i1;
        break;
      }
      if (i5 == 26)
      {
        i2 = i1;
        r = localThrowable1.d();
        i3 = i1;
        break;
      }
      if (i5 == 27)
      {
        i2 = i1;
        s = localThrowable1.l();
        i3 = i1;
        break;
      }
      if (i5 == 28)
      {
        i2 = i1;
        t = localThrowable1.d();
        i3 = i1;
        break;
      }
      if (i5 == 29)
      {
        i2 = i1;
        u = localThrowable1.h();
        i3 = i1;
        break;
      }
      if (i5 == 30)
      {
        i2 = i1;
        v = localThrowable1.m();
        i3 = i1;
        break;
      }
      if (i5 == 31)
      {
        i2 = i1;
        w = localThrowable1.m();
        i3 = i1;
        break;
      }
      if (i5 == 32)
      {
        i2 = i1;
        x = localThrowable1.l();
        i3 = i1;
        break;
      }
      if (i5 == 33)
      {
        i2 = i1;
        y = localThrowable1.d();
        i3 = i1;
        break;
      }
      if (i5 == 34)
      {
        i2 = i1;
        z = localThrowable1.h();
        i3 = i1;
        break;
      }
      if (i5 == 35)
      {
        i2 = i1;
        A = localThrowable1.l();
        i3 = i1;
        break;
      }
      if (i5 == 36)
      {
        i2 = i1;
        B = localThrowable1.m();
        i3 = i1;
        break;
      }
      if (i5 == 37)
      {
        i2 = i1;
        C = localThrowable1.m();
        i3 = i1;
        break;
      }
      if (i5 == 38)
      {
        i2 = i1;
        D = localThrowable1.m();
        i3 = i1;
        break;
      }
      if (i5 == 39)
      {
        i2 = i1;
        E = localThrowable1.m();
        i3 = i1;
        break;
      }
      if (i5 == 40)
      {
        i2 = i1;
        F = localThrowable1.l();
        i3 = i1;
        break;
      }
      if (i5 == 41)
      {
        i2 = i1;
        G = (short)localThrowable1.e();
        i3 = i1;
        break;
      }
      if (i5 == 42)
      {
        i2 = i1;
        H = localThrowable1.h();
        i3 = i1;
        break;
      }
      if (i5 == 43)
      {
        i2 = i1;
        I = localThrowable1.l();
        i3 = i1;
        break;
      }
      if (i5 == 44)
      {
        i2 = i1;
        j = localThrowable1.l();
        i3 = i1;
        break;
      }
      if (i5 == 45)
      {
        i2 = i1;
        J = localThrowable1.m();
        i3 = i1;
        break;
      }
      if (i5 == 46)
      {
        i2 = i1;
        K = localThrowable1.j();
        i3 = i1;
        break;
      }
      if (i5 == 47)
      {
        i2 = i1;
        L = localThrowable1.f();
        i3 = i1;
        break;
      }
      if (i5 == 49)
      {
        i2 = i1;
        M = localThrowable1.l();
        i3 = i1;
        break;
      }
      if (i5 == 50)
      {
        i2 = i1;
        N = localThrowable1.m();
        i3 = i1;
        break;
      }
      if (i5 == 51)
      {
        i2 = i1;
        O = localThrowable1.m();
        i3 = i1;
        break;
      }
      i3 = i1;
      if (i5 != 52) {
        break;
      }
      i2 = i1;
      P = localThrowable1.m();
      i3 = i1;
      break;
      i2 = i1;
      this.Q.close();
      break label215;
    }
  }
  
  public void a(int paramInt)
  {
    int i1 = b(paramInt);
    if (i1 == -1) {
      return;
    }
    int i2 = T[i1];
    Object localObject1 = new g();
    ((g)localObject1).a(true);
    ((g)localObject1).e(paramInt);
    if (paramInt == 0)
    {
      ((g)localObject1).a(a);
      localObject1 = ((g)localObject1).a();
    }
    for (;;)
    {
      try
      {
        this.Q = getReadableDatabase();
        if (i2 != -1) {
          break label761;
        }
        this.Q = getWritableDatabase();
        localObject2 = new ContentValues();
        ((ContentValues)localObject2).put("data", (byte[])localObject1);
        paramInt = (int)this.Q.insert("gwm_table", null, (ContentValues)localObject2);
        T[i1] = paramInt;
        this.Q.close();
        return;
      }
      catch (Throwable localThrowable)
      {
        return;
      }
      if (paramInt == 3)
      {
        localThrowable.b(b);
        break;
      }
      if (paramInt == 5)
      {
        localThrowable.a(c);
        break;
      }
      if (paramInt == 8)
      {
        localThrowable.e(d);
        break;
      }
      if (paramInt == 9)
      {
        localThrowable.a(e);
        break;
      }
      if (paramInt == 11)
      {
        localThrowable.e(f);
        break;
      }
      if (paramInt == 12)
      {
        localThrowable.e(g);
        break;
      }
      if (paramInt == 18)
      {
        localThrowable.e(h);
        break;
      }
      if (paramInt == 19)
      {
        localThrowable.a(i);
        break;
      }
      if (paramInt == 20)
      {
        localThrowable.e(l);
        break;
      }
      if (paramInt == 21)
      {
        localThrowable.e(m);
        break;
      }
      if (paramInt == 22)
      {
        localThrowable.e(n);
        break;
      }
      if (paramInt == 23)
      {
        localThrowable.e(o);
        break;
      }
      if (paramInt == 24)
      {
        localThrowable.e(p);
        break;
      }
      if (paramInt == 25)
      {
        localThrowable.a(q);
        break;
      }
      if (paramInt == 26)
      {
        localThrowable.e(r);
        break;
      }
      if (paramInt == 27)
      {
        localThrowable.a(s);
        break;
      }
      if (paramInt == 28)
      {
        localThrowable.e(t);
        break;
      }
      if (paramInt == 29)
      {
        localThrowable.a(u);
        break;
      }
      if (paramInt == 30)
      {
        localThrowable.a(v);
        break;
      }
      if (paramInt == 31)
      {
        localThrowable.a(w);
        break;
      }
      if (paramInt == 32)
      {
        localThrowable.a(x);
        break;
      }
      if (paramInt == 33)
      {
        localThrowable.e(y);
        break;
      }
      if (paramInt == 34)
      {
        localThrowable.a(z);
        break;
      }
      if (paramInt == 35)
      {
        localThrowable.a(A);
        break;
      }
      if (paramInt == 36)
      {
        localThrowable.a(B);
        break;
      }
      if (paramInt == 37)
      {
        localThrowable.a(C);
        break;
      }
      if (paramInt == 38)
      {
        localThrowable.a(D);
        break;
      }
      if (paramInt == 39)
      {
        localThrowable.a(E);
        break;
      }
      if (paramInt == 40)
      {
        localThrowable.a(F);
        break;
      }
      if (paramInt == 41)
      {
        localThrowable.f(G);
        break;
      }
      if (paramInt == 42)
      {
        localThrowable.a(H);
        break;
      }
      if (paramInt == 43)
      {
        localThrowable.a(I);
        break;
      }
      if (paramInt == 44)
      {
        localThrowable.a(j);
        break;
      }
      if (paramInt == 45)
      {
        localThrowable.a(J);
        break;
      }
      if (paramInt == 46)
      {
        localThrowable.a(K);
        break;
      }
      if (paramInt == 47)
      {
        localThrowable.g(L);
        break;
      }
      if (paramInt == 49)
      {
        localThrowable.a(M);
        break;
      }
      if (paramInt == 50)
      {
        localThrowable.a(N);
        break;
      }
      if (paramInt == 51)
      {
        localThrowable.a(O);
        break;
      }
      if (paramInt != 52) {
        break;
      }
      localThrowable.a(P);
      break;
      label761:
      this.Q = getWritableDatabase();
      Object localObject2 = i2 + "";
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("data", localThrowable);
      this.Q.update("gwm_table", localContentValues, "_id = ?", new String[] { localObject2 });
    }
  }
  
  public void b()
  {
    c = new String[] { "SH000001", "SZ399001" };
    a(5);
    close();
    e = new String[0];
    a(9);
    close();
    i = (String[][])null;
    a(19);
    close();
    q = (String[][])null;
    a(25);
    close();
    t = 0;
    a(28);
    close();
    u = "";
    a(29);
    close();
    v = (String[][])null;
    a(30);
    close();
    w = (String[][])null;
    a(31);
    close();
    x = new String[0];
    a(32);
    close();
    y = 1;
    a(33);
    close();
    z = "";
    a(34);
    A = new String[] { "无" };
    a(35);
    close();
    E = (String[][])null;
    a(39);
    F = new String[0];
    a(40);
    G = 0;
    a(41);
    H = "";
    a(42);
    I = new String[0];
    a(43);
    j = new String[0];
    a(44);
    K = (int[][])null;
    a(46);
    M = new String[0];
    a(49);
    N = (String[][])null;
    a(50);
    O = (String[][])null;
    a(51);
    P = (String[][])null;
    a(52);
    close();
  }
  
  public void close()
  {
    if (this.Q != null) {
      this.Q.close();
    }
    if (this.R != null) {}
    try
    {
      this.R.deactivate();
      this.R.close();
      return;
    }
    catch (Exception localException) {}
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("create table gwm_table (_id integer primary key autoincrement, data text not null);");
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS gwm_table");
    onCreate(paramSQLiteDatabase);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\c\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */