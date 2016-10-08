package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Iterator;

class i
  implements Runnable
{
  i(g paramg, ArrayList paramArrayList) {}
  
  public void run()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      p localp = (p)localIterator.next();
      g.a(this.b, localp);
    }
    this.a.clear();
    g.b(this.b).remove(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */