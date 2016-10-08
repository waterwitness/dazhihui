package com.tencent.mm.sdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.modelbase.BaseResp;

public class GetMessageFromWX$Resp
  extends BaseResp
{
  private static final String TAG = "MicroMsg.SDK.GetMessageFromWX.Resp";
  public WXMediaMessage message;
  
  public GetMessageFromWX$Resp() {}
  
  public GetMessageFromWX$Resp(Bundle paramBundle)
  {
    fromBundle(paramBundle);
  }
  
  public boolean checkArgs()
  {
    if (this.message == null)
    {
      a.a("MicroMsg.SDK.GetMessageFromWX.Resp", "checkArgs fail, message is null");
      return false;
    }
    return this.message.checkArgs();
  }
  
  public void fromBundle(Bundle paramBundle)
  {
    super.fromBundle(paramBundle);
    this.message = WXMediaMessage.Builder.fromBundle(paramBundle);
  }
  
  public int getType()
  {
    return 3;
  }
  
  public void toBundle(Bundle paramBundle)
  {
    super.toBundle(paramBundle);
    paramBundle.putAll(WXMediaMessage.Builder.toBundle(this.message));
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\mm\sdk\modelmsg\GetMessageFromWX$Resp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */