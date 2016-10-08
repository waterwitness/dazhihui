import android.content.Context;
import com.android.thinkive.framework.compatible.CallBack.SchedulerCallBack;
import com.android.thinkive.framework.compatible.MessageAction;
import com.android.thinkive.framework.compatible.Parameter;
import com.android.thinkive.framework.network.RequestBean;
import com.android.thinkive.framework.network.http.HttpService;
import java.util.HashMap;

public final class ap
  implements CallBack.SchedulerCallBack
{
  private Parameter a;
  private int b;
  private String c;
  
  public ap(Context paramContext, Parameter paramParameter)
  {
    this.a = paramParameter;
  }
  
  public final void handler(MessageAction paramMessageAction)
  {
    String str = this.a.getString("url").replace("?", "") + ";jsessionid=" + this.a.getString("jsessionid") + "?";
    this.a.addParameter("funcNo", "501575");
    v localv = new v();
    Object localObject = new RequestBean();
    ((RequestBean)localObject).setUrlName(str);
    ((RequestBean)localObject).setParam(this.a.getParams());
    localObject = ((RequestBean)localObject).getParam();
    HttpService.getInstance().jsonRequest(str, (HashMap)localObject, 15000, 0, new aq(this, paramMessageAction, localv));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */