package com.sina.weibo.sdk.api;

import android.os.Bundle;
import com.sina.weibo.sdk.b.a;

public final class h
{
  public BaseMediaObject a;
  
  public Bundle a(Bundle paramBundle)
  {
    if (this.a != null)
    {
      paramBundle.putParcelable("_weibo_message_media", this.a);
      paramBundle.putString("_weibo_message_media_extra", this.a.b());
    }
    return paramBundle;
  }
  
  public boolean a()
  {
    if (this.a == null)
    {
      a.b("Weibo.WeiboMessage", "checkArgs fail, mediaObject is null");
      return false;
    }
    if ((this.a != null) && (!this.a.a()))
    {
      a.b("Weibo.WeiboMessage", "checkArgs fail, mediaObject is invalid");
      return false;
    }
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\sina\weibo\sdk\api\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */