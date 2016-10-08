import android.widget.Toast;
import com.android.thinkive.framework.network.ResponseListener;
import com.thinkive.mobile.account.base.PluginCallback;
import org.json.JSONObject;

final class d
  implements ResponseListener<JSONObject>
{
  d(c paramc) {}
  
  public final void onErrorResponse(Exception paramException)
  {
    Toast.makeText(c.b(this.a), "网络异常了，请检查您的网络设置", 0).show();
    c.c(this.a).onFair();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */