package com.d.a.b;

import java.util.ArrayList;
import java.util.Iterator;

class i
  implements g<T>
{
  i(h paramh) {}
  
  public void a(Exception paramException, T paramT)
  {
    ArrayList localArrayList;
    synchronized (this.a)
    {
      localArrayList = this.a.a;
      this.a.a = null;
      if (localArrayList == null) {
        return;
      }
    }
    ??? = localArrayList.iterator();
    while (((Iterator)???).hasNext()) {
      ((g)((Iterator)???).next()).a(paramException, paramT);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\b\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */