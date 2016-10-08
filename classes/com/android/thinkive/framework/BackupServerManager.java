package com.android.thinkive.framework;

import android.content.Context;
import com.android.thinkive.framework.config.AddressConfigBean;
import com.android.thinkive.framework.config.ConfigManager;
import com.android.thinkive.framework.db.ThinkiveDatabase;
import com.android.thinkive.framework.network.ResponseListener;
import com.android.thinkive.framework.network.http.HttpService;
import com.android.thinkive.framework.util.Log;
import com.android.thinkive.framework.util.RandomUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONObject;

public class BackupServerManager
{
  private static final String ADDRESS_NAME = "BACKUP_SERVER_URL";
  private static BackupServerManager sInstance;
  private ResponseListener<JSONObject> listener = new BackupServerManager.1(this);
  private Context mContext = ThinkiveInitializer.getInstance().getContext();
  private HashMap<String, String> mServerConfigMap = new HashMap();
  
  private BackupServerManager()
  {
    initData();
  }
  
  private ArrayList<String> getAddressList(String paramString)
  {
    paramString = paramString.split("\\|");
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    for (;;)
    {
      if (i >= paramString.length) {
        return localArrayList;
      }
      localArrayList.add(paramString[i]);
      i += 1;
    }
  }
  
  public static BackupServerManager getInstance()
  {
    try
    {
      if (sInstance == null) {
        sInstance = new BackupServerManager();
      }
      BackupServerManager localBackupServerManager = sInstance;
      return localBackupServerManager;
    }
    finally {}
  }
  
  private void initData()
  {
    Object localObject1 = ThinkiveDatabase.getInstance(this.mContext).getAllServerUrlData();
    Log.e("saveConfig size = " + ((HashMap)localObject1).size());
    localObject1 = ((HashMap)localObject1).entrySet().iterator();
    for (;;)
    {
      if (!((Iterator)localObject1).hasNext()) {
        return;
      }
      Object localObject3 = (Map.Entry)((Iterator)localObject1).next();
      Object localObject2 = (String)((Map.Entry)localObject3).getKey();
      localObject3 = (String)((Map.Entry)localObject3).getValue();
      Log.e("key = " + (String)localObject2 + " value = " + (String)localObject3);
      localObject2 = ConfigManager.getInstance().getAddressConfigBean((String)localObject2);
      if (localObject2 != null)
      {
        ((AddressConfigBean)localObject2).setValue(getAddressList((String)localObject3));
        int i = RandomUtil.getRandom(((AddressConfigBean)localObject2).getValue().size());
        ((AddressConfigBean)localObject2).setPriorityValue((String)((AddressConfigBean)localObject2).getValue().get(i));
      }
    }
  }
  
  public void release()
  {
    if (this.mServerConfigMap != null)
    {
      this.mServerConfigMap.clear();
      this.mServerConfigMap = null;
    }
    if (sInstance != null) {
      sInstance = null;
    }
  }
  
  public void requestBackupServerUrl()
  {
    try
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("funcNo", "902102");
      localHashMap.put("soft_no", ThinkiveInitializer.getInstance().getContext().getPackageName());
      this.mServerConfigMap.clear();
      if (ConfigManager.getInstance().getAddressConfigBean("BACKUP_SERVER_URL") != null) {
        HttpService.getInstance().jsonRequest("BACKUP_SERVER_URL", localHashMap, this.listener);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\BackupServerManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */