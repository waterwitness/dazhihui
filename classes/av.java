import android.content.Context;
import com.android.thinkive.framework.compatible.CallBack.SchedulerCallBack;
import com.android.thinkive.framework.compatible.MessageAction;
import com.android.thinkive.framework.compatible.Parameter;
import com.android.thinkive.framework.network.RequestBean;
import com.android.thinkive.framework.network.http.HttpService;
import java.util.HashMap;

public final class av
  implements CallBack.SchedulerCallBack
{
  private Parameter a;
  private int b;
  private String c;
  
  public av(Context paramContext, Parameter paramParameter)
  {
    this.a = paramParameter;
  }
  
  public final void handler(MessageAction paramMessageAction)
  {
    String str = this.a.getString("url").replace("?", "") + ";jsessionid=" + this.a.getString("jsessionid").toString().trim() + "?";
    this.a.addParameter("funcNo", "501581");
    ab localab = new ab();
    Object localObject = new RequestBean();
    ((RequestBean)localObject).setUrlName(str);
    ((RequestBean)localObject).setParam(this.a.getParams());
    localObject = ((RequestBean)localObject).getParam();
    HttpService.getInstance().jsonRequest(str, (HashMap)localObject, 15000, 0, new aw(this, paramMessageAction, localab));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */