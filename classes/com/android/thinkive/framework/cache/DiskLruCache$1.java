package com.android.thinkive.framework.cache;

import java.util.concurrent.Callable;

class DiskLruCache$1
  implements Callable<Void>
{
  DiskLruCache$1(DiskLruCache paramDiskLruCache) {}
  
  public Void call()
  {
    synchronized (this.this$0)
    {
      if (DiskLruCache.access$0(this.this$0) == null) {
        return null;
      }
      DiskLruCache.access$1(this.this$0);
      if (DiskLruCache.access$2(this.this$0))
      {
        DiskLruCache.access$3(this.this$0);
        DiskLruCache.access$4(this.this$0, 0);
      }
      return null;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\cache\DiskLruCache$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */