import android.content.Context;
import com.android.thinkive.framework.compatible.CallBack.SchedulerCallBack;
import com.android.thinkive.framework.compatible.MessageAction;
import com.android.thinkive.framework.compatible.Parameter;
import com.android.thinkive.framework.network.RequestBean;
import com.android.thinkive.framework.network.http.HttpService;
import com.android.thinkive.framework.util.Log;
import java.util.HashMap;

public final class ar
  implements CallBack.SchedulerCallBack
{
  private Parameter a;
  private int b;
  private String c;
  
  public ar(Context paramContext, Parameter paramParameter)
  {
    this.a = paramParameter;
  }
  
  public final void handler(MessageAction paramMessageAction)
  {
    String str = this.a.getString("url").replace("?", "") + ";jsessionid=" + this.a.getString("jsessionid") + "?";
    this.a.addParameter("funcNo", "501932");
    this.a.addParameter("access_channel", "5");
    x localx = new x();
    try
    {
      Object localObject = new RequestBean();
      ((RequestBean)localObject).setUrlName(str);
      ((RequestBean)localObject).setParam(this.a.getParams());
      localObject = ((RequestBean)localObject).getParam();
      HttpService.getInstance().jsonRequest(str, (HashMap)localObject, 15000, 0, new as(this, paramMessageAction, localx));
      return;
    }
    catch (Exception localException)
    {
      Log.e("异常", localException);
      paramMessageAction.transferAction(2, null, localx.a());
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */