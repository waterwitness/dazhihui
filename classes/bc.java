import android.content.Context;
import com.android.thinkive.framework.compatible.CallBack.SchedulerCallBack;
import com.android.thinkive.framework.compatible.MessageAction;
import com.android.thinkive.framework.compatible.Parameter;
import com.android.thinkive.framework.network.http.HttpService;
import java.util.HashMap;
import org.apache.http.entity.mime.content.FileBody;

public final class bc
  implements CallBack.SchedulerCallBack
{
  private Parameter a;
  private int b;
  private String c;
  
  public bc(Context paramContext, Parameter paramParameter)
  {
    this.a = paramParameter;
  }
  
  public final void handler(MessageAction paramMessageAction)
  {
    af localaf = new af();
    String str = this.a.getString("url").replace("?", "") + ";jsessionid=" + this.a.getString("jsessionid") + "?";
    HashMap localHashMap1 = new HashMap();
    localHashMap1.put("user_id", this.a.getString("user_id"));
    localHashMap1.put("fileType", this.a.getString("fileType"));
    localHashMap1.put("videoExist", this.a.getString("videoExist"));
    localHashMap1.put("start_time", this.a.getString("start_time"));
    localHashMap1.put("suffix", this.a.getString("suffix"));
    localHashMap1.put("video_length", this.a.getString("video_length"));
    localHashMap1.put("jsessionid", this.a.getString("jsessionid"));
    localHashMap1.put("saveVideo", this.a.getString("saveVideo"));
    localHashMap1.put("autentication_type", this.a.getString("autentication_type"));
    localHashMap1.put("funcNo", "501933");
    HashMap localHashMap2 = new HashMap();
    localHashMap2.put("media_stream", (FileBody)this.a.getObject("media_stream"));
    HttpService.getInstance().multiPartRequest(str, localHashMap2, localHashMap1, 15000, 1, new bd(this, paramMessageAction, localaf));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */