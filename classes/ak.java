import com.android.thinkive.framework.compatible.CallBack.SchedulerCallBack;
import com.android.thinkive.framework.compatible.MessageAction;
import com.android.thinkive.framework.network.ResponseListener;
import com.android.thinkive.framework.network.http.HttpService;
import java.util.HashMap;
import org.json.JSONObject;

public final class ak
  implements CallBack.SchedulerCallBack
{
  private HashMap<String, String> a;
  private ResponseListener<JSONObject> b;
  
  public ak(HashMap<String, String> paramHashMap, ResponseListener<JSONObject> paramResponseListener)
  {
    this.a = paramHashMap;
    this.b = paramResponseListener;
  }
  
  public final void handler(MessageAction paramMessageAction)
  {
    paramMessageAction = (String)this.a.get("url");
    this.a.remove("url");
    this.a.put("funcNo", "501301");
    HttpService.getInstance().jsonRequest(paramMessageAction, this.a, 15000, 0, this.b);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */