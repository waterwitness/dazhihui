package com.tencent.mm.sdk.modelmsg;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.mm.sdk.b.a;
import java.io.ByteArrayOutputStream;

public final class WXMediaMessage
{
  public static final String ACTION_WXAPPMESSAGE = "com.tencent.mm.sdk.openapi.Intent.ACTION_WXAPPMESSAGE";
  private static final int DESCRIPTION_LENGTH_LIMIT = 1024;
  private static final int MEDIA_TAG_NAME_LENGTH_LIMIT = 64;
  private static final int MESSAGE_ACTION_LENGTH_LIMIT = 2048;
  private static final int MESSAGE_EXT_LENGTH_LIMIT = 2048;
  private static final String TAG = "MicroMsg.SDK.WXMediaMessage";
  public static final int THUMB_LENGTH_LIMIT = 32768;
  private static final int TITLE_LENGTH_LIMIT = 512;
  public String description;
  public WXMediaMessage.IMediaObject mediaObject;
  public String mediaTagName;
  public String messageAction;
  public String messageExt;
  public int sdkVer;
  public byte[] thumbData;
  public String title;
  
  public WXMediaMessage()
  {
    this(null);
  }
  
  public WXMediaMessage(WXMediaMessage.IMediaObject paramIMediaObject)
  {
    this.mediaObject = paramIMediaObject;
  }
  
  final boolean checkArgs()
  {
    if ((getType() == 8) && ((this.thumbData == null) || (this.thumbData.length == 0)))
    {
      a.a("MicroMsg.SDK.WXMediaMessage", "checkArgs fail, thumbData should not be null when send emoji");
      return false;
    }
    if ((this.thumbData != null) && (this.thumbData.length > 32768))
    {
      a.a("MicroMsg.SDK.WXMediaMessage", "checkArgs fail, thumbData is invalid");
      return false;
    }
    if ((this.title != null) && (this.title.length() > 512))
    {
      a.a("MicroMsg.SDK.WXMediaMessage", "checkArgs fail, title is invalid");
      return false;
    }
    if ((this.description != null) && (this.description.length() > 1024))
    {
      a.a("MicroMsg.SDK.WXMediaMessage", "checkArgs fail, description is invalid");
      return false;
    }
    if (this.mediaObject == null)
    {
      a.a("MicroMsg.SDK.WXMediaMessage", "checkArgs fail, mediaObject is null");
      return false;
    }
    if ((this.mediaTagName != null) && (this.mediaTagName.length() > 64))
    {
      a.a("MicroMsg.SDK.WXMediaMessage", "checkArgs fail, mediaTagName is too long");
      return false;
    }
    if ((this.messageAction != null) && (this.messageAction.length() > 2048))
    {
      a.a("MicroMsg.SDK.WXMediaMessage", "checkArgs fail, messageAction is too long");
      return false;
    }
    if ((this.messageExt != null) && (this.messageExt.length() > 2048))
    {
      a.a("MicroMsg.SDK.WXMediaMessage", "checkArgs fail, messageExt is too long");
      return false;
    }
    return this.mediaObject.checkArgs();
  }
  
  public final int getType()
  {
    if (this.mediaObject == null) {
      return 0;
    }
    return this.mediaObject.type();
  }
  
  public final void setThumbImage(Bitmap paramBitmap)
  {
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      paramBitmap.compress(Bitmap.CompressFormat.JPEG, 85, localByteArrayOutputStream);
      this.thumbData = localByteArrayOutputStream.toByteArray();
      localByteArrayOutputStream.close();
      return;
    }
    catch (Exception paramBitmap)
    {
      paramBitmap.printStackTrace();
      a.a("MicroMsg.SDK.WXMediaMessage", "put thumb failed");
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\mm\sdk\modelmsg\WXMediaMessage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */