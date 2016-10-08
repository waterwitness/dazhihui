import com.android.thinkive.framework.compatible.CallBack.SchedulerCallBack;
import com.android.thinkive.framework.compatible.MessageAction;
import com.android.thinkive.framework.network.ResponseListener;
import com.android.thinkive.framework.network.http.HttpService;
import java.io.File;
import java.util.HashMap;
import org.apache.http.entity.mime.content.FileBody;
import org.json.JSONObject;

public final class p
  implements CallBack.SchedulerCallBack
{
  private HashMap<String, String> a;
  private ResponseListener<JSONObject> b;
  
  public p(HashMap<String, String> paramHashMap, ResponseListener<JSONObject> paramResponseListener)
  {
    this.a = paramHashMap;
    this.b = paramResponseListener;
  }
  
  public final void handler(MessageAction paramMessageAction)
  {
    paramMessageAction = (String)this.a.get("url");
    this.a.remove("url");
    HashMap localHashMap = new HashMap();
    localHashMap.put("file_data", new FileBody(new File((String)this.a.get("filePath"))));
    HttpService.getInstance().multiPartRequest(paramMessageAction, localHashMap, this.a, 15000, 1, this.b);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */