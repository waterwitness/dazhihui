package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Iterator;

class h
  implements Runnable
{
  h(g paramg, ArrayList paramArrayList) {}
  
  public void run()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      q localq = (q)localIterator.next();
      g.a(this.b, localq.a, localq.b, localq.c, localq.d, localq.e);
    }
    this.a.clear();
    g.a(this.b).remove(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */