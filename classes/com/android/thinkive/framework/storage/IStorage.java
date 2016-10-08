package com.android.thinkive.framework.storage;

public abstract interface IStorage
{
  public abstract void clear();
  
  public abstract String loadData(String paramString);
  
  public abstract void removeData(String paramString);
  
  public abstract void saveData(String paramString1, String paramString2);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\storage\IStorage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */