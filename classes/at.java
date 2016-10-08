import android.content.Context;
import com.android.thinkive.framework.compatible.CallBack.SchedulerCallBack;
import com.android.thinkive.framework.compatible.MessageAction;
import com.android.thinkive.framework.compatible.Parameter;
import com.android.thinkive.framework.network.RequestBean;
import com.android.thinkive.framework.network.http.HttpService;
import com.android.thinkive.framework.util.Log;
import java.util.HashMap;

public final class at
  implements CallBack.SchedulerCallBack
{
  private Parameter a;
  private int b;
  private String c;
  
  public at(Context paramContext, Parameter paramParameter)
  {
    this.a = paramParameter;
  }
  
  public final void handler(MessageAction paramMessageAction)
  {
    String str = this.a.getString("url").replace("?", "") + ";jsessionid=" + this.a.getString("jsessionid").toString().trim() + "?";
    this.a.addParameter("funcNo", "501585");
    z localz = new z();
    try
    {
      Object localObject = new RequestBean();
      ((RequestBean)localObject).setUrlName(str);
      ((RequestBean)localObject).setParam(this.a.getParams());
      localObject = ((RequestBean)localObject).getParam();
      HttpService.getInstance().jsonRequest(str, (HashMap)localObject, 15000, 0, new au(this, paramMessageAction, localz));
      return;
    }
    catch (Exception localException)
    {
      Log.e("异常", localException);
      paramMessageAction.transferAction(2, null, localz.a());
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */