import android.content.Context;
import android.widget.Toast;
import com.android.thinkive.framework.compatible.CallBack.SchedulerCallBack;
import com.android.thinkive.framework.compatible.MessageAction;
import com.android.thinkive.framework.compatible.Parameter;
import com.android.thinkive.framework.network.RequestBean;
import com.android.thinkive.framework.network.http.HttpService;
import com.android.thinkive.framework.util.Log;
import java.util.HashMap;

public final class al
  implements CallBack.SchedulerCallBack
{
  public int a;
  private Parameter b;
  private Context c;
  
  public al(Context paramContext, Parameter paramParameter)
  {
    this.c = paramContext;
    this.b = paramParameter;
  }
  
  public final void handler(MessageAction paramMessageAction)
  {
    paramMessageAction = this.b.getString("url").replace("?", "") + ";jsessionid=" + this.b.getString("jsessionid").toString().trim() + "?";
    this.b.addParameter("funcNo", "501597");
    try
    {
      Object localObject = new RequestBean();
      ((RequestBean)localObject).setUrlName(paramMessageAction);
      ((RequestBean)localObject).setParam(this.b.getParams());
      localObject = ((RequestBean)localObject).getParam();
      HttpService.getInstance().jsonRequest(paramMessageAction, (HashMap)localObject, 15000, 0, new am(this));
      return;
    }
    catch (Exception paramMessageAction)
    {
      Log.e("异常", paramMessageAction);
      Toast.makeText(this.c, "取消排队失败", 0).show();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */