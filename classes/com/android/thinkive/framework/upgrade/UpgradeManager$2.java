package com.android.thinkive.framework.upgrade;

import com.android.thinkive.framework.network.ResponseListener;
import com.android.thinkive.framework.util.JsonParseUtil;
import com.android.thinkive.framework.util.Log;
import java.util.ArrayList;
import org.json.JSONObject;

class UpgradeManager$2
  implements ResponseListener<JSONObject>
{
  UpgradeManager$2(UpgradeManager paramUpgradeManager) {}
  
  public void onErrorResponse(Exception paramException)
  {
    if (UpgradeManager.access$9(this.this$0) != null) {
      UpgradeManager.access$9(this.this$0).onReceiveUpgradeError(paramException);
    }
    Log.e(paramException.getMessage(), paramException);
  }
  
  public void onResponse(JSONObject paramJSONObject)
  {
    Log.d("upgrade version info = " + paramJSONObject);
    paramJSONObject = (UpgradeInfoBean)JsonParseUtil.parseJsonToObject(paramJSONObject, UpgradeInfoBean.class);
    if (paramJSONObject == null) {
      Log.d("parse upgrage version info json data error !!!");
    }
    Object localObject;
    do
    {
      do
      {
        return;
        localObject = paramJSONObject.getResults();
      } while ((localObject == null) || (((ArrayList)localObject).size() <= 0));
      localObject = (UpgradeInfoBean.VersionInfoBean)((ArrayList)localObject).get(0);
      UpgradeManager.access$3(this.this$0, ((UpgradeInfoBean.VersionInfoBean)localObject).getUpdate_flag());
      UpgradeManager.access$4(this.this$0, ((UpgradeInfoBean.VersionInfoBean)localObject).getVersion_code());
      UpgradeManager.access$5(this.this$0, ((UpgradeInfoBean.VersionInfoBean)localObject).getVersion_name());
    } while (UpgradeManager.access$6(this.this$0) <= UpgradeManager.access$7(this.this$0));
    if (((UpgradeInfoBean.VersionInfoBean)localObject).getIsH5() == 0) {
      UpgradeManager.access$8(this.this$0, UpgradeManager.UpgradeType.NATIVE);
    }
    while (UpgradeManager.access$9(this.this$0) != null)
    {
      UpgradeManager.access$9(this.this$0).onReceiveUpgradeInfo(paramJSONObject);
      return;
      if (((UpgradeInfoBean.VersionInfoBean)localObject).getIsH5() == 1) {
        UpgradeManager.access$8(this.this$0, UpgradeManager.UpgradeType.H5);
      }
    }
    UpgradeManager.access$10(this.this$0, (UpgradeInfoBean.VersionInfoBean)localObject);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\upgrade\UpgradeManager$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */