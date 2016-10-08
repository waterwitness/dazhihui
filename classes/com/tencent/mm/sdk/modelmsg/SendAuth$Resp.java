package com.tencent.mm.sdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.modelbase.BaseResp;

public class SendAuth$Resp
  extends BaseResp
{
  private static final int LENGTH_LIMIT = 1024;
  private static final String TAG = "MicroMsg.SDK.SendAuth.Resp";
  public String code;
  public String country;
  public String lang;
  public String state;
  public String url;
  
  public SendAuth$Resp() {}
  
  public SendAuth$Resp(Bundle paramBundle)
  {
    fromBundle(paramBundle);
  }
  
  public boolean checkArgs()
  {
    if ((this.state != null) && (this.state.length() > 1024))
    {
      a.a("MicroMsg.SDK.SendAuth.Resp", "checkArgs fail, state is invalid");
      return false;
    }
    return true;
  }
  
  public void fromBundle(Bundle paramBundle)
  {
    super.fromBundle(paramBundle);
    this.code = paramBundle.getString("_wxapi_sendauth_resp_token");
    this.state = paramBundle.getString("_wxapi_sendauth_resp_state");
    this.url = paramBundle.getString("_wxapi_sendauth_resp_url");
    this.lang = paramBundle.getString("_wxapi_sendauth_resp_lang");
    this.country = paramBundle.getString("_wxapi_sendauth_resp_country");
  }
  
  public int getType()
  {
    return 1;
  }
  
  public void toBundle(Bundle paramBundle)
  {
    super.toBundle(paramBundle);
    paramBundle.putString("_wxapi_sendauth_resp_token", this.code);
    paramBundle.putString("_wxapi_sendauth_resp_state", this.state);
    paramBundle.putString("_wxapi_sendauth_resp_url", this.url);
    paramBundle.putString("_wxapi_sendauth_resp_lang", this.lang);
    paramBundle.putString("_wxapi_sendauth_resp_country", this.country);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\mm\sdk\modelmsg\SendAuth$Resp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */