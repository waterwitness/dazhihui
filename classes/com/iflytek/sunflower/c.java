package com.iflytek.sunflower;

import com.iflytek.sunflower.a.e;
import com.iflytek.sunflower.c.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

class c
  implements Runnable
{
  c(a parama, String paramString) {}
  
  public void run()
  {
    try
    {
      if ((f.a.isEmpty()) || (!((e)f.a.peek()).a.equals(this.a))) {
        break label142;
      }
      Object localObject = (e)f.a.pop();
      ((e)localObject).b = (System.currentTimeMillis() - ((e)localObject).b);
      f.a((e)localObject);
      localObject = new StringBuilder();
      Iterator localIterator = f.b.iterator();
      while (localIterator.hasNext())
      {
        ((StringBuilder)localObject).append(((e)localIterator.next()).a);
        ((StringBuilder)localObject).append(",");
      }
      g.b("Collector", "page list:" + localException.toString());
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      return;
    }
    return;
    label142:
    g.a("Collector", "onPageEnd called without 'PageName' from corresponding onPageStart");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\sunflower\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */