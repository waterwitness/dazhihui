package com.android.dazhihui.ui.widget.adv;

import android.util.SparseArray;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.ui.model.stock.RedPointVo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ah
{
  public static Map<String, RedPointVo> d = new ConcurrentHashMap();
  public static Map<String, RedPointVo> e = new ConcurrentHashMap();
  public static Map<String, RedPointVo> f = new ConcurrentHashMap();
  public static Map<String, RedPointVo> g = new ConcurrentHashMap();
  public static Map<String, RedPointVo> h = new ConcurrentHashMap();
  public static Map<String, RedPointVo> i = new ConcurrentHashMap();
  public static int j = 10;
  public static int k = 11;
  public static int l = 12;
  public static int m = 20;
  public static int n = 30;
  public static int o = 40;
  private static ah p;
  public ArrayList<ai> a = new ArrayList();
  public ArrayList<aj> b = new ArrayList();
  SparseArray<List<String>> c = new SparseArray();
  
  public static ah a()
  {
    if (p == null) {
      p = new ah();
    }
    return p;
  }
  
  public static boolean c(int paramInt, String paramString)
  {
    if (paramString == null) {
      return true;
    }
    String str = paramInt + paramString;
    d locald = d.a();
    str = locald.b(str);
    locald.g();
    return paramString.equals(str);
  }
  
  public static void d(int paramInt, String paramString)
  {
    String str = paramInt + paramString;
    d locald = d.a();
    locald.a(str, paramString);
    locald.g();
  }
  
  public void a(int paramInt)
  {
    int i2 = 0;
    int i1 = this.c.indexOfKey(paramInt);
    if (i1 > -1) {
      this.c.removeAt(i1);
    }
    i1 = 0;
    if (i1 < this.a.size()) {
      if (ai.a((ai)this.a.get(i1)) != paramInt) {}
    }
    for (String str = ai.b((ai)this.a.get(i1));; str = null)
    {
      if (!c(paramInt, str))
      {
        i1 = i2;
        for (;;)
        {
          if (i1 < this.a.size())
          {
            if (ai.a((ai)this.a.get(i1)) == paramInt) {
              ((ai)this.a.get(i1)).b(ai.b((ai)this.a.get(i1)));
            }
            i1 += 1;
            continue;
            i1 += 1;
            break;
          }
        }
      }
      return;
    }
  }
  
  public void a(int paramInt, String paramString)
  {
    if (!c(paramInt, paramString))
    {
      int i1 = this.c.indexOfKey(paramInt);
      if (i1 > -1) {
        ((List)this.c.valueAt(i1)).add(paramString);
      }
      for (;;)
      {
        i1 = 0;
        while (i1 < this.a.size())
        {
          if (ai.a((ai)this.a.get(i1)) == paramInt) {
            ((ai)this.a.get(i1)).a(paramString);
          }
          i1 += 1;
        }
        ArrayList localArrayList = new ArrayList();
        localArrayList.add(paramString);
        this.c.put(paramInt, localArrayList);
      }
    }
  }
  
  public void a(ai paramai)
  {
    if (!this.a.contains(paramai))
    {
      int i1 = ai.a(paramai);
      this.a.add(paramai);
      i1 = this.c.indexOfKey(i1);
      if (i1 > -1)
      {
        Iterator localIterator = ((List)this.c.valueAt(i1)).iterator();
        while (localIterator.hasNext()) {
          paramai.a((String)localIterator.next());
        }
      }
    }
  }
  
  public void a(aj paramaj)
  {
    if ((paramaj != null) && (!this.b.contains(paramaj))) {
      this.b.add(paramaj);
    }
  }
  
  public void b(int paramInt)
  {
    if (this.b.size() > 0)
    {
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext()) {
        ((aj)localIterator.next()).a(paramInt);
      }
    }
  }
  
  public void b(int paramInt, String paramString)
  {
    int i1 = this.c.indexOfKey(paramInt);
    if (i1 > -1)
    {
      List localList = (List)this.c.valueAt(i1);
      localList.remove(paramString);
      if (localList.size() == 0) {
        this.c.removeAt(i1);
      }
    }
    if (!c(paramInt, paramString))
    {
      i1 = 0;
      while (i1 < this.a.size())
      {
        if (ai.a((ai)this.a.get(i1)) == paramInt) {
          ((ai)this.a.get(i1)).b(paramString);
        }
        i1 += 1;
      }
    }
  }
  
  public void b(ai paramai)
  {
    this.a.remove(paramai);
  }
  
  public void b(aj paramaj)
  {
    if ((paramaj != null) && (this.b.contains(paramaj))) {
      this.b.remove(paramaj);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\adv\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */