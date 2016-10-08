package com.sina.weibo.sdk.api;

import android.os.Bundle;
import com.sina.weibo.sdk.b.a;

public final class i
{
  public TextObject a;
  public ImageObject b;
  public BaseMediaObject c;
  
  public Bundle a(Bundle paramBundle)
  {
    if (this.a != null)
    {
      paramBundle.putParcelable("_weibo_message_text", this.a);
      paramBundle.putString("_weibo_message_text_extra", this.a.b());
    }
    if (this.b != null)
    {
      paramBundle.putParcelable("_weibo_message_image", this.b);
      paramBundle.putString("_weibo_message_image_extra", this.b.b());
    }
    if (this.c != null)
    {
      paramBundle.putParcelable("_weibo_message_media", this.c);
      paramBundle.putString("_weibo_message_media_extra", this.c.b());
    }
    return paramBundle;
  }
  
  public boolean a()
  {
    if ((this.a != null) && (!this.a.a()))
    {
      a.b("WeiboMultiMessage", "checkArgs fail, textObject is invalid");
      return false;
    }
    if ((this.b != null) && (!this.b.a()))
    {
      a.b("WeiboMultiMessage", "checkArgs fail, imageObject is invalid");
      return false;
    }
    if ((this.c != null) && (!this.c.a()))
    {
      a.b("WeiboMultiMessage", "checkArgs fail, mediaObject is invalid");
      return false;
    }
    if ((this.a == null) && (this.b == null) && (this.c == null))
    {
      a.b("WeiboMultiMessage", "checkArgs fail, textObject and imageObject and mediaObject is null");
      return false;
    }
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\sina\weibo\sdk\api\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */