package com.tencent.mm.sdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.modelbase.BaseReq;

public class SendAuth$Req
  extends BaseReq
{
  private static final int LENGTH_LIMIT = 1024;
  private static final String TAG = "MicroMsg.SDK.SendAuth.Req";
  public String scope;
  public String state;
  
  public SendAuth$Req() {}
  
  public SendAuth$Req(Bundle paramBundle)
  {
    fromBundle(paramBundle);
  }
  
  public boolean checkArgs()
  {
    if ((this.scope == null) || (this.scope.length() == 0) || (this.scope.length() > 1024))
    {
      a.a("MicroMsg.SDK.SendAuth.Req", "checkArgs fail, scope is invalid");
      return false;
    }
    if ((this.state != null) && (this.state.length() > 1024))
    {
      a.a("MicroMsg.SDK.SendAuth.Req", "checkArgs fail, state is invalid");
      return false;
    }
    return true;
  }
  
  public void fromBundle(Bundle paramBundle)
  {
    super.fromBundle(paramBundle);
    this.scope = paramBundle.getString("_wxapi_sendauth_req_scope");
    this.state = paramBundle.getString("_wxapi_sendauth_req_state");
  }
  
  public int getType()
  {
    return 1;
  }
  
  public void toBundle(Bundle paramBundle)
  {
    super.toBundle(paramBundle);
    paramBundle.putString("_wxapi_sendauth_req_scope", this.scope);
    paramBundle.putString("_wxapi_sendauth_req_state", this.state);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\mm\sdk\modelmsg\SendAuth$Req.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */