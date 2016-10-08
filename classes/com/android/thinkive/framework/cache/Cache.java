package com.android.thinkive.framework.cache;

public abstract interface Cache
{
  public abstract void clear();
  
  public abstract Cache.Entry get(String paramString);
  
  public abstract void initialize();
  
  public abstract void invalidate(String paramString, boolean paramBoolean);
  
  public abstract void put(String paramString, Cache.Entry paramEntry);
  
  public abstract void remove(String paramString);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\cache\Cache.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */