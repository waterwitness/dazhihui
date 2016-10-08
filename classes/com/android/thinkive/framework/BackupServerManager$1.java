package com.android.thinkive.framework;

import android.text.TextUtils;
import com.android.thinkive.framework.db.ThinkiveDatabase;
import com.android.thinkive.framework.network.ResponseListener;
import com.android.thinkive.framework.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class BackupServerManager$1
  implements ResponseListener<JSONObject>
{
  BackupServerManager$1(BackupServerManager paramBackupServerManager) {}
  
  public void onErrorResponse(Exception paramException)
  {
    Log.e("request 902102 error = " + paramException.getMessage());
  }
  
  public void onResponse(JSONObject paramJSONObject)
  {
    if ((paramJSONObject == null) || (TextUtils.isEmpty(paramJSONObject.toString())))
    {
      Log.d("902102 request response content = null!");
      return;
    }
    Log.d("902102 request response content = " + paramJSONObject.toString());
    for (;;)
    {
      int i;
      try
      {
        paramJSONObject = paramJSONObject.getJSONArray("results");
        i = 0;
        if (i >= paramJSONObject.length())
        {
          if (BackupServerManager.access$0(this.this$0).size() <= 0) {
            break;
          }
          paramJSONObject = BackupServerManager.access$0(this.this$0).entrySet().iterator();
          if (!paramJSONObject.hasNext()) {
            break;
          }
          localObject = (Map.Entry)paramJSONObject.next();
          str = (String)((Map.Entry)localObject).getKey();
          localObject = (String)((Map.Entry)localObject).getValue();
          Log.e("insert key = " + str + " value = " + (String)localObject);
          ThinkiveDatabase.getInstance(BackupServerManager.access$1(this.this$0)).insertServerUrlData(str, (String)localObject);
          continue;
        }
        localObject = paramJSONObject.getJSONObject(i);
      }
      catch (JSONException paramJSONObject)
      {
        paramJSONObject.printStackTrace();
        return;
      }
      String str = ((JSONObject)localObject).optString("config_name");
      Object localObject = ((JSONObject)localObject).optString("config_value");
      BackupServerManager.access$0(this.this$0).put(str, localObject);
      i += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\BackupServerManager$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */