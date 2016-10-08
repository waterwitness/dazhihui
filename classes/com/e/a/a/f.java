package com.e.a.a;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class f
  implements Runnable
{
  f(b paramb, Context paramContext, boolean paramBoolean) {}
  
  public void run()
  {
    Object localObject = (List)b.b(this.a).get(this.b);
    if (localObject != null) {
      localObject = ((List)localObject).iterator();
    }
    for (;;)
    {
      if (!((Iterator)localObject).hasNext())
      {
        b.b(this.a).remove(this.b);
        return;
      }
      ((x)((Iterator)localObject).next()).cancel(this.c);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\e\a\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */