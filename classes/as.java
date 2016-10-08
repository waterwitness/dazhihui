import com.android.thinkive.framework.compatible.MessageAction;
import com.android.thinkive.framework.network.ResponseListener;
import com.android.volley.VolleyError;
import org.json.JSONObject;

final class as
  implements ResponseListener<JSONObject>
{
  as(ar paramar, MessageAction paramMessageAction, x paramx) {}
  
  public final void onErrorResponse(Exception paramException)
  {
    if ((paramException instanceof VolleyError)) {
      this.b.transferAction(2, null, this.c.a());
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */