package com.alipay.sdk.a;

import android.widget.Toast;
import java.util.Timer;
import org.json.JSONException;
import org.json.JSONObject;

final class e
  implements Runnable
{
  e(d paramd, a parama) {}
  
  public final void run()
  {
    d locald = this.b;
    a locala = this.a;
    if ((locala != null) && ("toast".equals(locala.c)))
    {
      JSONObject localJSONObject = locala.e;
      String str = localJSONObject.optString("content");
      int j = localJSONObject.optInt("duration");
      i = 1;
      if (j < 2500) {
        i = 0;
      }
      Toast.makeText(locald.b, str, i).show();
      new Timer().schedule(new f(locald, locala), i);
    }
    int i = b.a;
    if (i != b.a) {}
    try
    {
      this.b.a(this.a.a, i);
      return;
    }
    catch (JSONException localJSONException) {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */