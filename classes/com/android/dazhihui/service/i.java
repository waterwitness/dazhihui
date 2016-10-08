package com.android.dazhihui.service;

import android.os.Message;
import android.text.format.DateFormat;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.c.b.a;
import com.android.dazhihui.d.n;
import com.d.a.a.e;
import com.d.a.ai;
import com.d.a.al;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

class i
  implements e
{
  i(f paramf) {}
  
  public void a(al paramal, ai paramai)
  {
    try
    {
      paramal = new String(paramai.a(), "UTF-8");
      n.d("pushService", "requestPushData --------->data" + paramal);
      paramai = DateFormat.format("yyyy-MM-dd", System.currentTimeMillis()).toString();
      DzhApplication.a().b().a(paramai, "PushAd", paramal, 7);
      JSONObject localJSONObject = new JSONObject(paramal);
      paramai = localJSONObject.getString("Qid");
      int i = localJSONObject.getInt("Err");
      if (paramai.equals("DzhAdPush"))
      {
        Message localMessage = this.a.a.S.obtainMessage(DzhPushService.u, paramal);
        this.a.a.S.sendMessage(localMessage);
      }
      if (i != 0)
      {
        n.d("pushService", "requestPushData ---------> error --->" + paramai);
        if (paramai.equals("DzhAdPush"))
        {
          this.a.a.S.removeMessages(DzhPushService.p);
          paramal = this.a.a.S.obtainMessage(DzhPushService.p, paramai);
          this.a.a.S.sendMessageDelayed(paramal, DzhPushService.d(this.a.a));
          return;
        }
        if ((!paramai.equals("DzhHotsVideo")) && (!paramai.equals("DzhHotsVideoStock"))) {
          break label579;
        }
        paramal = localJSONObject.getJSONObject("Data");
        try
        {
          if (paramal.getString("code").equals("104")) {
            break label579;
          }
          if (!paramai.equals("DzhHotsVideo")) {
            break label315;
          }
          DzhPushService.e(this.a.a);
          return;
        }
        catch (JSONException paramal)
        {
          if (!paramai.equals("DzhHotsVideo")) {
            break label326;
          }
        }
        DzhPushService.e(this.a.a);
        return;
      }
    }
    catch (UnsupportedEncodingException paramal)
    {
      return;
      label315:
      DzhPushService.f(this.a.a);
      return;
      label326:
      DzhPushService.f(this.a.a);
      return;
      if ("DzhAdPush".equals(paramai))
      {
        DzhPushService.a(this.a.a, paramal);
        return;
      }
      if ("DzhRedPoint".equals(paramai))
      {
        DzhPushService.b(this.a.a, paramal);
        return;
      }
      if ("DzhRpcircle".equals(paramai))
      {
        DzhPushService.c(this.a.a, paramal);
        return;
      }
      if ("DzhSpecialNews".equals(paramai))
      {
        DzhPushService.a(this.a.a, paramal, DzhPushService.P);
        return;
      }
      if ("DzhHotsVideo".equals(paramai))
      {
        DzhPushService.d(this.a.a, paramal);
        return;
      }
      if (DzhPushService.h.equals(paramai))
      {
        DzhPushService.e(this.a.a, paramal);
        return;
      }
      if ("DzhHotsVideoStock".equals(paramai))
      {
        DzhPushService.f(this.a.a, paramal);
        return;
      }
      if (this.a.a.i.equals(paramai))
      {
        DzhPushService.a(this.a.a, paramal, DzhPushService.Q);
        return;
      }
      if (DzhPushService.j.equals(paramai))
      {
        DzhPushService.g(this.a.a, paramal);
        return;
      }
      paramai = this.a.a.S.obtainMessage(DzhPushService.z);
      paramai.obj = paramal;
      this.a.a.S.sendMessage(paramai);
      label579:
      return;
    }
    catch (JSONException paramal) {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\service\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */