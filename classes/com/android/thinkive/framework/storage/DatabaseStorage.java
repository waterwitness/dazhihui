package com.android.thinkive.framework.storage;

import android.content.Context;
import com.android.thinkive.framework.db.ThinkiveDatabase;

public class DatabaseStorage
  implements IStorage
{
  private Context mContext;
  private ThinkiveDatabase mThinkiveDatabase;
  
  public DatabaseStorage(Context paramContext)
  {
    this.mContext = paramContext;
    this.mThinkiveDatabase = ThinkiveDatabase.getInstance(paramContext);
  }
  
  public void clear()
  {
    this.mThinkiveDatabase.deleteAllMapData();
  }
  
  public String loadData(String paramString)
  {
    return this.mThinkiveDatabase.getMapData(paramString);
  }
  
  public void removeData(String paramString)
  {
    this.mThinkiveDatabase.deleteMapData(paramString);
  }
  
  public void saveData(String paramString1, String paramString2)
  {
    this.mThinkiveDatabase.insertMapData(paramString1, paramString2);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\storage\DatabaseStorage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */