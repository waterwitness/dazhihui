package com.android.thinkive.framework.cache;

import android.support.v4.c.g;

class DataMemoryCache$1
  extends g<String, Cache.Entry>
{
  DataMemoryCache$1(DataMemoryCache paramDataMemoryCache, int paramInt)
  {
    super(paramInt);
  }
  
  protected int sizeOf(String paramString, Cache.Entry paramEntry)
  {
    return DataMemoryCache.access$0(this.this$0, paramEntry);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\cache\DataMemoryCache$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */