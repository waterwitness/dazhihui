package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Iterator;

class j
  implements Runnable
{
  j(g paramg, ArrayList paramArrayList) {}
  
  public void run()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      bk localbk = (bk)localIterator.next();
      g.a(this.b, localbk);
    }
    this.a.clear();
    g.c(this.b).remove(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */