package com.tencent.mm.sdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.modelbase.BaseReq;

public class SendMessageToWX$Req
  extends BaseReq
{
  private static final int FAV_CONTENT_LENGTH_LIMIT = 26214400;
  private static final String TAG = "MicroMsg.SDK.SendMessageToWX.Req";
  public static final int WXSceneFavorite = 2;
  public static final int WXSceneSession = 0;
  public static final int WXSceneTimeline = 1;
  public WXMediaMessage message;
  public int scene;
  
  public SendMessageToWX$Req() {}
  
  public SendMessageToWX$Req(Bundle paramBundle)
  {
    fromBundle(paramBundle);
  }
  
  public boolean checkArgs()
  {
    if (this.message == null)
    {
      a.a("MicroMsg.SDK.SendMessageToWX.Req", "checkArgs fail ,message is null");
      return false;
    }
    if ((this.message.mediaObject.type() == 6) && (this.scene == 2)) {
      ((WXFileObject)this.message.mediaObject).setContentLengthLimit(26214400);
    }
    return this.message.checkArgs();
  }
  
  public void fromBundle(Bundle paramBundle)
  {
    super.fromBundle(paramBundle);
    this.message = WXMediaMessage.Builder.fromBundle(paramBundle);
    this.scene = paramBundle.getInt("_wxapi_sendmessagetowx_req_scene");
  }
  
  public int getType()
  {
    return 2;
  }
  
  public void toBundle(Bundle paramBundle)
  {
    super.toBundle(paramBundle);
    paramBundle.putAll(WXMediaMessage.Builder.toBundle(this.message));
    paramBundle.putInt("_wxapi_sendmessagetowx_req_scene", this.scene);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\mm\sdk\modelmsg\SendMessageToWX$Req.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */