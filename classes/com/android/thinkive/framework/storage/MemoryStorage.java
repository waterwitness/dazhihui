package com.android.thinkive.framework.storage;

import android.text.TextUtils;
import com.android.thinkive.framework.util.Log;
import java.util.HashMap;

public class MemoryStorage
  implements IStorage
{
  private static HashMap<String, String> dataCache = new HashMap();
  
  public void clear()
  {
    dataCache.clear();
  }
  
  public String loadData(String paramString)
  {
    return (String)dataCache.get(paramString);
  }
  
  public void removeData(String paramString)
  {
    dataCache.remove(paramString);
  }
  
  public void saveData(String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (!TextUtils.isEmpty(paramString1)))
    {
      dataCache.put(paramString1, paramString2);
      return;
    }
    Log.d("error,save data key = null 0r key = empty");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\storage\MemoryStorage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */