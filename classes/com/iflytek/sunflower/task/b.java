package com.iflytek.sunflower.task;

import com.iflytek.sunflower.a.c;
import com.iflytek.sunflower.c.g;
import com.iflytek.sunflower.f;

public class b
  extends Thread
{
  private c a;
  
  public b(c paramc)
  {
    this.a = paramc;
  }
  
  private void a()
  {
    f.a(this.a);
  }
  
  public void run()
  {
    try
    {
      a();
      return;
    }
    catch (Exception localException)
    {
      g.d("Collector", "call onError error:" + localException);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\sunflower\task\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */