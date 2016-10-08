package com.android.thinkive.framework.notice;

import com.android.thinkive.framework.network.ResponseListener;
import com.android.thinkive.framework.storage.DatabaseStorage;
import com.android.thinkive.framework.util.JsonParseUtil;
import com.android.thinkive.framework.util.Log;
import java.util.ArrayList;
import org.json.JSONObject;

class NoticeManager$1
  implements ResponseListener<JSONObject>
{
  NoticeManager$1(NoticeManager paramNoticeManager) {}
  
  public void onErrorResponse(Exception paramException)
  {
    Log.e(paramException.getMessage(), paramException);
    if (NoticeManager.access$0(this.this$0) != null)
    {
      NoticeManager.access$0(this.this$0).onErrorResponse(paramException);
      return;
    }
    NoticeManager.access$1(this.this$0);
  }
  
  public void onResponse(JSONObject paramJSONObject)
  {
    Log.d("notice info = " + paramJSONObject);
    if (NoticeManager.access$0(this.this$0) != null) {
      NoticeManager.access$0(this.this$0).onResponse(paramJSONObject);
    }
    do
    {
      return;
      paramJSONObject = (NoticeInfoBean)JsonParseUtil.parseJsonToObject(paramJSONObject, NoticeInfoBean.class);
      if (paramJSONObject == null)
      {
        Log.d("parse notice info json data error !!!");
        NoticeManager.access$1(this.this$0);
        return;
      }
      if ((paramJSONObject.getResults() == null) || (paramJSONObject.getResults().size() <= 0)) {
        break;
      }
      paramJSONObject = (NoticeInfoBean.NoticeBean)paramJSONObject.getResults().get(0);
      if (paramJSONObject.getShowType().equals("0"))
      {
        NoticeManager.access$1(this.this$0);
        return;
      }
    } while (NoticeManager.access$2(this.this$0).loadData(paramJSONObject.getId()) != null);
    NoticeManager.access$3(this.this$0, paramJSONObject);
    return;
    NoticeManager.access$1(this.this$0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\notice\NoticeManager$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */