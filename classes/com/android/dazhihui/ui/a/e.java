package com.android.dazhihui.ui.a;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.s;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.b.b;
import com.android.dazhihui.ui.delegate.c.c;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.w;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class e
  implements i
{
  private static e v;
  private String a;
  private int b = -1;
  private String c = null;
  private String d = null;
  private int e = -1;
  private int f = 14;
  private boolean g = false;
  private List<WeakReference<BaseActivity>> h = new ArrayList();
  private g i;
  private String j = "";
  private String k;
  private String l;
  private String m;
  private String n;
  private String o;
  private String p;
  private String q;
  private String r;
  private Map<String, String> s = new HashMap();
  private String t = "";
  private Bundle u = null;
  private m w = null;
  private m x = null;
  private Handler y = new f(this, Looper.getMainLooper());
  
  public static e a()
  {
    if (v == null) {
      v = new e();
    }
    return v;
  }
  
  private void y()
  {
    String str = (String)this.s.get(this.t);
    if (str != null)
    {
      int i1 = Integer.parseInt(str);
      this.s.put(this.t, String.valueOf(i1 + 1));
    }
    for (;;)
    {
      this.y.sendEmptyMessage(0);
      return;
      this.s.put(this.t, "1");
    }
  }
  
  public void a(int paramInt)
  {
    this.e = paramInt;
  }
  
  public void a(Bundle paramBundle)
  {
    this.u = paramBundle;
  }
  
  public void a(s params)
  {
    this.x = o();
    this.x.e(true);
    this.x.a(20000L);
    this.x.a(this);
    this.x.a(params);
    com.android.dazhihui.a.g.a().a(this.x);
  }
  
  public void a(g paramg)
  {
    this.i = paramg;
    if ((!com.android.dazhihui.a.g.a().o()) && (this.i != null))
    {
      this.i.b();
      this.i = null;
    }
  }
  
  public void a(BaseActivity paramBaseActivity)
  {
    int i2 = 0;
    int i1 = 0;
    if (i1 < this.h.size())
    {
      WeakReference localWeakReference = (WeakReference)this.h.get(i1);
      if ((localWeakReference != null) && (localWeakReference.get() != null)) {
        if (localWeakReference.get() != paramBaseActivity) {
          break label92;
        }
      }
    }
    for (i1 = i2;; i1 = 1)
    {
      if (i1 != 0) {
        this.h.add(new WeakReference(paramBaseActivity));
      }
      return;
      this.h.remove(i1);
      i1 -= 1;
      label92:
      i1 += 1;
      break;
    }
  }
  
  public void a(String paramString)
  {
    this.j = paramString;
  }
  
  public void a(String paramString, boolean paramBoolean, g paramg)
  {
    int i3 = 0;
    Log.d("trade", "initDelegateDispatchAddress:qsnamestr=" + paramString);
    if (TextUtils.isEmpty(paramString)) {}
    label145:
    label301:
    label310:
    label314:
    for (;;)
    {
      return;
      int i4 = a().j();
      int i1 = i3;
      int i2;
      if (com.android.dazhihui.c.a.a.i != null)
      {
        i2 = 0;
        i1 = i3;
        if (i2 < com.android.dazhihui.c.a.a.i.length)
        {
          if (!com.android.dazhihui.c.a.a.i[i2][2].equals(paramString)) {
            break label301;
          }
          a().a(i2);
          if ((i4 == -1) || (i4 != i2) || (com.android.dazhihui.g.a().H() == null) || (paramBoolean)) {
            break label145;
          }
          if (paramg == null) {
            break label310;
          }
          paramg.a();
          i1 = 1;
        }
      }
      for (;;)
      {
        if (i1 != 0) {
          break label314;
        }
        a().a(-1);
        return;
        i1 = a().j();
        if (!TextUtils.isEmpty(com.android.dazhihui.c.a.a.B[i1][0]))
        {
          if (com.android.dazhihui.c.a.a.K != null)
          {
            com.android.dazhihui.g.a().a(com.android.dazhihui.c.a.a.B[i1], com.android.dazhihui.c.a.a.K[i1], null);
            a().a(paramg);
            i1 = 1;
            continue;
          }
          if (paramg != null)
          {
            paramg.b();
            i1 = 1;
          }
        }
        else
        {
          paramString = com.android.dazhihui.d.n.a(com.android.dazhihui.c.a.a.D[i1], null);
          if (!TextUtils.isEmpty(paramString))
          {
            paramString = com.android.dazhihui.d.n.d(paramString);
            com.android.dazhihui.a.g.a().d(false);
            com.android.dazhihui.g.a().f(paramString[0]);
            com.android.dazhihui.g.a().h(Integer.parseInt(paramString[1]));
            if (paramg != null) {
              paramg.a();
            }
          }
          for (;;)
          {
            i1 = 1;
            break;
            if (paramg != null) {
              paramg.b();
            }
          }
          i2 += 1;
          break;
        }
        i1 = 1;
      }
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
    if (paramBoolean) {
      b(true);
    }
  }
  
  public Bundle b()
  {
    return this.u;
  }
  
  public void b(int paramInt)
  {
    this.f = paramInt;
  }
  
  public void b(s params)
  {
    com.android.dazhihui.a.b.f localf = new com.android.dazhihui.a.b.f();
    localf.c(com.android.dazhihui.a.f.t);
    localf.a(this);
    localf.a(params);
    com.android.dazhihui.a.g.a().a(localf);
  }
  
  public void b(BaseActivity paramBaseActivity)
  {
    int i1 = 0;
    if (i1 < this.h.size())
    {
      WeakReference localWeakReference = (WeakReference)this.h.get(i1);
      if ((localWeakReference != null) && (localWeakReference.get() != null))
      {
        i2 = i1;
        if (localWeakReference.get() == paramBaseActivity) {
          this.h.remove(i1);
        }
      }
      for (int i2 = i1 - 1;; i2 = i1 - 1)
      {
        i1 = i2 + 1;
        break;
        this.h.remove(i1);
      }
    }
  }
  
  public void b(String paramString)
  {
    this.l = paramString;
  }
  
  public void b(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      int i1 = 0;
      while (i1 < this.h.size())
      {
        WeakReference localWeakReference = (WeakReference)this.h.get(i1);
        if ((localWeakReference != null) && (localWeakReference.get() != null)) {
          ((BaseActivity)localWeakReference.get()).finish();
        }
        i1 += 1;
      }
      this.h.clear();
    }
  }
  
  public String c()
  {
    return this.j;
  }
  
  public void c(String paramString)
  {
    this.n = paramString;
  }
  
  public String d()
  {
    return this.l;
  }
  
  public void d(String paramString)
  {
    this.o = paramString;
  }
  
  public String e()
  {
    return this.n;
  }
  
  public void e(String paramString)
  {
    this.k = paramString;
  }
  
  public String f()
  {
    return this.o;
  }
  
  public void f(String paramString)
  {
    this.m = paramString;
  }
  
  public String g()
  {
    return this.p;
  }
  
  public void g(String paramString)
  {
    this.p = paramString;
  }
  
  public String h()
  {
    return this.r;
  }
  
  public void h(String paramString)
  {
    this.q = paramString;
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    Object localObject1;
    if ((paramj instanceof com.android.dazhihui.a.b.g)) {
      localObject1 = new String(((com.android.dazhihui.a.b.g)paramj).a());
    }
    Object localObject3;
    int i1;
    Object localObject4;
    Object localObject5;
    try
    {
      localObject1 = new JSONArray((String)localObject1).getJSONObject(0).optJSONArray("data");
      localObject3 = new com.android.dazhihui.c.a.a(b.a().f());
      ((com.android.dazhihui.c.a.a)localObject3).close();
      com.android.dazhihui.c.a.a.N = (String[][])Array.newInstance(String.class, new int[] { ((JSONArray)localObject1).length(), 5 });
      com.android.dazhihui.c.a.a.P = (String[][])Array.newInstance(String.class, new int[] { ((JSONArray)localObject1).length(), 3 });
      i1 = 0;
      while (i1 < ((JSONArray)localObject1).length())
      {
        localObject4 = ((JSONArray)localObject1).getJSONObject(i1);
        com.android.dazhihui.c.a.a.N[i1][0] = ((JSONObject)localObject4).optString("id");
        com.android.dazhihui.c.a.a.P[i1][0] = ((JSONObject)localObject4).optString("id");
        com.android.dazhihui.c.a.a.N[i1][1] = ((JSONObject)localObject4).optString("content");
        localObject5 = ((JSONObject)localObject4).optJSONArray("submit").getJSONObject(0);
        com.android.dazhihui.c.a.a.N[i1][2] = (((JSONObject)localObject5).optInt("type") + "");
        com.android.dazhihui.c.a.a.N[i1][3] = ((JSONObject)localObject5).optString("linkname");
        com.android.dazhihui.c.a.a.N[i1][4] = ((JSONObject)localObject5).optString("linkurl");
        localObject5 = ((JSONObject)localObject4).optJSONArray("groupCommon");
        com.android.dazhihui.c.a.a.P[i1][1] = ((JSONArray)localObject5).toString();
        localObject4 = ((JSONObject)localObject4).optJSONArray("groupRaise");
        com.android.dazhihui.c.a.a.P[i1][2] = ((JSONArray)localObject4).toString();
        i1 += 1;
      }
      ((com.android.dazhihui.c.a.a)localObject3).a(50);
      ((com.android.dazhihui.c.a.a)localObject3).close();
      ((com.android.dazhihui.c.a.a)localObject3).a(52);
    }
    catch (Exception localException)
    {
      do
      {
        do
        {
          for (;;)
          {
            localException.printStackTrace();
            continue;
            this.a = null;
            this.b = -1;
          }
        } while (paramj.a != 1003);
        localObject3 = new q(paramj.b);
        s1 = (short)((q)localObject3).e();
        paramj = b.a().f();
      } while ((s1 == 0) || (paramj == null));
    }
    if (paramh.g() != null) {
      paramh.g().invokeNextHandle();
    }
    if ((paramj instanceof com.android.dazhihui.a.b.o))
    {
      paramj = ((com.android.dazhihui.a.b.o)paramj).h();
      if ((paramj != null) && (paramj.b != null))
      {
        if (paramj.a != 1000) {
          break label582;
        }
        paramh = new q(paramj.b);
        paramj = paramh.m();
        if ((paramj == null) || (paramj.length <= 0)) {
          break label569;
        }
        paramj = com.android.dazhihui.d.n.d(paramj[0]);
        this.a = paramj[0];
        this.b = Integer.parseInt(paramj[1]);
        Log.d("tradelogin", "handleresponse   1000");
        paramh = paramh.m();
        if ((paramh != null) && (paramh.length > 0))
        {
          paramh = com.android.dazhihui.d.n.a(paramh, null);
          Log.d("trade", "委托地址: " + paramh);
          paramh = com.android.dazhihui.d.n.d(paramh);
          com.android.dazhihui.g.a().f(paramh[0]);
          com.android.dazhihui.g.a().h(Integer.parseInt(paramh[1]));
          com.android.dazhihui.a.g.a().d(false);
          v();
        }
        if (this.i != null)
        {
          this.i.a();
          this.i = null;
        }
      }
    }
    label569:
    label582:
    Object localObject2;
    int i5;
    int i2;
    Object localObject6;
    int i4;
    label869:
    Object localObject7;
    int i3;
    String[] arrayOfString1;
    String[] arrayOfString2;
    String[] arrayOfString3;
    label983:
    label1113:
    label1202:
    label1292:
    label1314:
    label1370:
    label1477:
    label1711:
    do
    {
      return;
      short s1;
      while (paramh.g() == null) {
        try
        {
          paramj = new com.android.dazhihui.c.a.a(b.a().f());
          paramj.close();
          int i6 = ((q)localObject3).e();
          localObject2 = new String[i6];
          a().b(i6);
          i5 = a().k();
          com.android.dazhihui.c.a.a.B = (String[][])Array.newInstance(String.class, new int[] { i5, 10 });
          com.android.dazhihui.c.a.a.K = (int[][])Array.newInstance(Integer.TYPE, new int[] { i5, 10 });
          localObject4 = new int[i5][];
          localObject5 = new int[i5][];
          com.android.dazhihui.c.a.a.D = (String[][])Array.newInstance(String.class, new int[] { i5, 10 });
          com.android.dazhihui.c.a.a.I = new String[i5];
          i1 = 8;
          i2 = 0;
          if (i2 >= i6) {
            break label1370;
          }
          localObject6 = ((q)localObject3).l();
          if ((i2 == 0) && (com.android.dazhihui.c.a.a.I.length != i6))
          {
            com.android.dazhihui.c.a.a.I = null;
            com.android.dazhihui.c.a.a.I = new String[i6];
          }
          localObject2[i2] = localObject6;
          com.android.dazhihui.c.a.a.I[i2] = "";
          char c1 = (char)((q)localObject3).b();
          com.android.dazhihui.c.a.a.I[i2] = String.valueOf(c1);
          i4 = ((q)localObject3).e();
          if (i1 >= i4) {
            break label2455;
          }
          i1 = i4;
          localObject6 = new int[i4];
          localObject7 = new int[i4];
          i3 = 0;
          while (i3 < i4)
          {
            localObject6[i3] = ((q)localObject3).b();
            localObject7[i3] = ((q)localObject3).b();
            i3 += 1;
          }
          localObject4[i2] = localObject6;
          localObject5[i2] = localObject7;
          int i7 = ((q)localObject3).e();
          arrayOfString1 = new String[i7];
          short[] arrayOfShort = new short[i7];
          int[] arrayOfInt1 = new int[i7];
          int[] arrayOfInt2 = new int[i7];
          arrayOfString2 = new String[i7];
          arrayOfString3 = new String[i7];
          i3 = 0;
          if (i3 >= 10) {
            break;
          }
          if (i3 >= i7)
          {
            com.android.dazhihui.c.a.a.B[i2][i3] = "";
            com.android.dazhihui.c.a.a.K[i2][i3] = 0;
          }
          else
          {
            arrayOfString1[i3] = ((q)localObject3).l();
            arrayOfShort[i3] = ((short)((q)localObject3).e());
            arrayOfInt1[i3] = ((byte)((q)localObject3).b());
            arrayOfInt2[i3] = ((byte)((q)localObject3).b());
            if (1 == arrayOfInt2[i3])
            {
              arrayOfString2[i3] = (arrayOfString1[i3] + ":" + arrayOfShort[i3]);
              i4 = 0;
              if (i4 < localObject6.length)
              {
                if (localObject6[i4] != 5) {
                  break label2477;
                }
                if (localObject7[i4] == 10) {
                  break label2467;
                }
                if (localObject7[i4] != 11) {
                  break label2477;
                }
                break label2467;
              }
            }
            if (2 == arrayOfInt2[i3])
            {
              arrayOfString3[i3] = (arrayOfString1[i3] + ":" + arrayOfShort[i3]);
              i4 = 0;
              if (i4 < localObject6.length)
              {
                if (localObject6[i4] != 5) {
                  break label2496;
                }
                if (localObject7[i4] == 10) {
                  break label2486;
                }
                if (localObject7[i4] != 11) {
                  break label2496;
                }
                break label2486;
              }
            }
            com.android.dazhihui.c.a.a.D[i2][i3] = arrayOfString2[i3];
            com.android.dazhihui.c.a.a.B[i2][i3] = arrayOfString3[i3];
            com.android.dazhihui.c.a.a.K[i2][i3] = arrayOfInt1[i3];
          }
        }
        catch (Exception paramj)
        {
          paramj.printStackTrace();
        }
      }
      paramh.g().invokeNextHandle();
      return;
      i3 = 0;
      if (i3 >= 10) {
        break label2514;
      }
      if (com.android.dazhihui.c.a.a.D[i2][i3] == null) {
        com.android.dazhihui.c.a.a.D[i2][i3] = "";
      }
      if (com.android.dazhihui.c.a.a.B[i2][i3] != null) {
        break label2505;
      }
      com.android.dazhihui.c.a.a.B[i2][i3] = "";
      break label2505;
      localObject3 = com.android.dazhihui.c.a.a.C;
      com.android.dazhihui.c.a.a.C = (String[][])Array.newInstance(String.class, new int[] { i5, i1 });
      i2 = 0;
      break label2523;
      if (i4 < localObject4[i2].length)
      {
        if (localObject4[i2][i4] != i3 + 1) {
          break label2555;
        }
        com.android.dazhihui.c.a.a.C[i2][i3] = String.valueOf(localObject5[i2][i4]);
      }
      if (com.android.dazhihui.c.a.a.C[i2][i3] != null) {
        break label2546;
      }
      com.android.dazhihui.c.a.a.C[i2][i3] = "";
      break label2546;
      localObject4 = new String[localObject2.length];
      i1 = 0;
      if (i1 < localObject2.length)
      {
        if (!localObject2[i1].contains("#")) {
          break label2582;
        }
        localObject5 = localObject2[i1].split("[#]");
        if ((localObject5 == null) || (localObject5.length <= 0)) {
          break label2573;
        }
        localObject4[i1] = localObject5[0];
        com.android.dazhihui.c.a.a.C[i1][6] = localObject5[1];
        break label2573;
      }
      com.android.dazhihui.c.a.a.F = (String[])localObject4;
      paramj.a(46);
      paramj.close();
      paramj.a(40);
      paramj.close();
      com.android.dazhihui.c.a.a.G = s1;
      paramj.a(41);
      paramj.close();
      paramj.a(43);
      paramj.close();
      paramj.a(37);
      paramj.close();
      paramj.a(38);
      paramj.close();
      paramj.a(36);
      paramj.close();
      if (com.android.dazhihui.c.a.a.i != null) {
        break;
      }
      com.android.dazhihui.c.a.a.i = new String[i5][];
      i1 = 0;
      while (i1 < com.android.dazhihui.c.a.a.i.length)
      {
        com.android.dazhihui.c.a.a.i[i1] = { "", "", localObject4[i1] };
        i1 += 1;
      }
      paramj.a(19);
      paramj.close();
      if (com.android.dazhihui.c.a.a.M == null) {
        break label2438;
      }
      paramj = com.android.dazhihui.c.a.a.M;
      if (paramj == null) {
        break label2595;
      }
    } while (paramj.length <= 0);
    break label2595;
    label1733:
    if (i2 < paramj.length)
    {
      i1 = 0;
      label1743:
      if (i1 < com.android.dazhihui.c.a.a.F.length) {
        if ((com.android.dazhihui.c.a.a.F[i1].contains(paramj[i2])) && (com.android.dazhihui.c.a.a.C[i1].length >= 5) && (com.android.dazhihui.c.a.a.C[i1][4].trim().equals("11")))
        {
          label1799:
          if (i1 == -1) {
            break label2601;
          }
          com.android.dazhihui.ui.delegate.b.o.b(paramj[i2], b.a().f());
          break label2601;
          localObject2 = com.android.dazhihui.c.a.a.i;
          com.android.dazhihui.c.a.a.i = (String[][])null;
          com.android.dazhihui.c.a.a.i = new String[i5][];
          i2 = 0;
          label1844:
          if (i2 < localObject4.length)
          {
            i4 = 1;
            i3 = 0;
          }
        }
      }
    }
    for (;;)
    {
      i1 = i4;
      if (i3 < localObject2.length)
      {
        localObject5 = localObject2[i3][2];
        if (localObject4[i2].equals(localObject5))
        {
          i1 = 0;
          com.android.dazhihui.c.a.a.i[i2] = localObject2[i3];
        }
      }
      else
      {
        label1906:
        if (i1 == 0) {
          break label2610;
        }
        com.android.dazhihui.c.a.a.i[i2] = { "", "", localObject4[i2] };
        break label2610;
      }
      if ((com.android.dazhihui.c.a.a.C.length > i2) && (com.android.dazhihui.c.a.a.C[i2].length > 6) && (!com.android.dazhihui.c.a.a.C[i2][6].equals("")) && (localObject3.length > i3) && (localObject3[i3].length > 6) && (!localObject3[i3][6].equals("")) && (com.android.dazhihui.c.a.a.C[i2][6].equals(localObject3[i3][6])))
      {
        if ((com.android.dazhihui.c.a.a.E != null) && (com.android.dazhihui.c.a.a.E.length > 0))
        {
          i1 = 0;
          label2054:
          if (i1 < com.android.dazhihui.c.a.a.E.length)
          {
            if (com.android.dazhihui.c.a.a.E[i1][0].equals(localObject5)) {
              com.android.dazhihui.c.a.a.E[i1][0] = localObject4[i2];
            }
          }
          else
          {
            paramj.a(39);
            paramj.close();
          }
        }
        else
        {
          if ((com.android.dazhihui.c.a.a.A != null) && (com.android.dazhihui.c.a.a.A.length > 0))
          {
            i1 = 0;
            label2121:
            if (i1 < com.android.dazhihui.c.a.a.A.length)
            {
              if (!com.android.dazhihui.c.a.a.A[i1].equals(localObject5)) {
                break label2628;
              }
              com.android.dazhihui.c.a.a.A[i1] = localObject4[i2];
            }
            paramj.a(35);
            paramj.close();
          }
          if ((com.android.dazhihui.c.a.a.M != null) && (com.android.dazhihui.c.a.a.M.length > 0)) {
            i1 = 0;
          }
        }
        for (;;)
        {
          if (i1 < com.android.dazhihui.c.a.a.M.length)
          {
            if (com.android.dazhihui.c.a.a.M[i1].equals(localObject5)) {
              com.android.dazhihui.c.a.a.M[i1] = localObject4[i2];
            }
          }
          else
          {
            paramj.a(49);
            paramj.close();
            localObject6 = com.android.dazhihui.ui.delegate.a.a().e();
            if ((localObject6 != null) && (((String)localObject6).equals(localObject5))) {
              com.android.dazhihui.ui.delegate.a.a().a(localObject4[i2]);
            }
            if ((com.android.dazhihui.c.a.a.z != null) && (com.android.dazhihui.c.a.a.z.equals(localObject5)))
            {
              com.android.dazhihui.c.a.a.z = localObject4[i2];
              paramj.a(34);
              paramj.close();
            }
            localObject6 = com.android.dazhihui.ui.delegate.a.a().b();
            if (localObject6 != null)
            {
              localObject6 = ((ArrayList)localObject6).iterator();
              while (((Iterator)localObject6).hasNext())
              {
                localObject7 = (c)((Iterator)localObject6).next();
                if (((c)localObject7).c().equals(localObject5)) {
                  ((c)localObject7).c(localObject4[i2]);
                }
              }
            }
            localObject6 = com.android.dazhihui.ui.delegate.a.a().c();
            if ((localObject6 != null) && (((c)localObject6).c().equals(localObject5))) {
              ((c)localObject6).c(localObject4[i2]);
            }
            localObject2[i3][2] = localObject4[i2];
            com.android.dazhihui.c.a.a.i[i2] = localObject2[i3];
            i1 = 0;
            break label1906;
            paramj.a(19);
            paramj.close();
            break label1711;
            label2438:
            break label1292;
            i1 += 1;
            break label1743;
            i1 = -1;
            break label1799;
            label2455:
            break label869;
            i3 += 1;
            break label983;
            label2467:
            arrayOfString2[i3] = arrayOfString1[i3];
            label2477:
            i4 += 1;
            break label1113;
            label2486:
            arrayOfString3[i3] = arrayOfString1[i3];
            label2496:
            i4 += 1;
            break label1202;
            label2505:
            i3 += 1;
            break label1314;
            label2514:
            i2 += 1;
            break;
            for (;;)
            {
              label2523:
              if (i2 >= i5) {
                break label2571;
              }
              i3 = 0;
              for (;;)
              {
                if (i3 < i1)
                {
                  i4 = 0;
                  break;
                  label2546:
                  i3 += 1;
                  continue;
                  label2555:
                  i4 += 1;
                  break;
                }
              }
              i2 += 1;
            }
            label2571:
            break label1477;
            for (;;)
            {
              label2573:
              i1 += 1;
              break;
              label2582:
              localObject4[i1] = localObject2[i1];
            }
            label2595:
            i2 = 0;
            break label1733;
            label2601:
            i2 += 1;
            break label1733;
            break label1292;
            label2610:
            i2 += 1;
            break label1844;
            i1 += 1;
            break label2054;
            label2628:
            i1 += 1;
            break label2121;
          }
          i1 += 1;
        }
      }
      i3 += 1;
    }
  }
  
  public void handleTimeout(h paramh)
  {
    if (paramh == this.x)
    {
      if (paramh.g().getRequestListener() != null) {
        paramh.g().getRequestListener().handleTimeout(paramh);
      }
      return;
    }
    y();
  }
  
  public String i()
  {
    return this.c;
  }
  
  public void i(String paramString)
  {
    this.r = paramString;
  }
  
  public int j()
  {
    return this.e;
  }
  
  public void j(String paramString)
  {
    this.c = paramString;
  }
  
  public int k()
  {
    return this.f;
  }
  
  public void k(String paramString)
  {
    this.d = paramString;
  }
  
  public void l(String paramString)
  {
    this.t = paramString;
  }
  
  public boolean l()
  {
    return (com.android.dazhihui.ui.delegate.b.o.r()) && (com.android.dazhihui.ui.delegate.b.o.o);
  }
  
  public m m()
  {
    return new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.g.b("8=CTRL1.0\00121004=10\001")) });
  }
  
  public m n()
  {
    x localx = new x(1000);
    localx.a(com.android.dazhihui.g.a().r());
    localx.a(com.android.dazhihui.g.a().u());
    localx.a(com.android.dazhihui.g.a().t());
    localx.b(w.a().d());
    localx.b(0);
    if (com.android.dazhihui.g.a().G() != null) {
      localx.b(com.android.dazhihui.g.a().G());
    }
    this.w = new m(localx, com.android.dazhihui.a.b.n.a);
    this.w.e(true);
    this.w.a(20000L);
    this.w.a(this);
    return this.w;
  }
  
  public void netException(h paramh, Exception paramException)
  {
    if (paramh == this.x)
    {
      if (paramh.g().getRequestListener() != null) {
        paramh.g().getRequestListener().netException(paramh, paramException);
      }
      return;
    }
    y();
  }
  
  public m o()
  {
    x[] arrayOfx = new x[1];
    arrayOfx[0] = new x(1003);
    arrayOfx[0].c(24);
    if ((com.android.dazhihui.c.a.a.I == null) || (com.android.dazhihui.c.a.a.I.length < 1)) {
      com.android.dazhihui.c.a.a.G = 0;
    }
    arrayOfx[0].c(com.android.dazhihui.c.a.a.G);
    return new m(arrayOfx);
  }
  
  public void p()
  {
    com.android.dazhihui.a.g.a().j();
  }
  
  public void q()
  {
    if (this.i != null)
    {
      this.i.b();
      this.i = null;
    }
  }
  
  public String r()
  {
    return this.a;
  }
  
  public int s()
  {
    return this.b;
  }
  
  public String t()
  {
    return this.t;
  }
  
  public Map<String, String> u()
  {
    return this.s;
  }
  
  public void v()
  {
    this.s.clear();
  }
  
  public void w()
  {
    this.a = null;
    this.b = -1;
  }
  
  public void x()
  {
    com.android.dazhihui.ui.screen.moneybox.ae.l = 0;
    v();
    w();
    this.e = -1;
    com.android.dazhihui.ui.delegate.a.a().j();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */