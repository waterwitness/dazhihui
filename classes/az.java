import com.android.thinkive.framework.compatible.CallBack.SchedulerCallBack;
import com.android.thinkive.framework.compatible.MessageAction;
import com.android.thinkive.framework.compatible.Parameter;
import com.android.thinkive.framework.network.ResponseListener;
import com.android.thinkive.framework.network.http.HttpService;
import org.json.JSONObject;

public final class az
  implements CallBack.SchedulerCallBack
{
  private Parameter a;
  private ResponseListener<JSONObject> b;
  
  public az(Parameter paramParameter, ResponseListener<JSONObject> paramResponseListener)
  {
    this.a = paramParameter;
    this.b = paramResponseListener;
  }
  
  public final void handler(MessageAction paramMessageAction)
  {
    paramMessageAction = this.a.getString("url").replace("?", "") + ";jsessionid=" + this.a.getString("jsessionid") + "?";
    this.a.addParameter("funcNo", "501323");
    HttpService.getInstance().jsonRequest(paramMessageAction, this.a.getParams(), 15000, 0, this.b);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */