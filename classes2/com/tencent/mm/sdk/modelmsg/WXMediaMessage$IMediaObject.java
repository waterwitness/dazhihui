package com.tencent.mm.sdk.modelmsg;

import android.os.Bundle;

public abstract interface WXMediaMessage$IMediaObject
{
  public static final int TYPE_APPDATA = 7;
  public static final int TYPE_CARD_SHARE = 16;
  public static final int TYPE_DEVICE_ACCESS = 12;
  public static final int TYPE_EMOJI = 8;
  public static final int TYPE_EMOTICON_GIFT = 11;
  public static final int TYPE_EMOTICON_SHARED = 15;
  public static final int TYPE_FILE = 6;
  public static final int TYPE_IMAGE = 2;
  public static final int TYPE_LOCATION_SHARE = 17;
  public static final int TYPE_MALL_PRODUCT = 13;
  public static final int TYPE_MUSIC = 3;
  public static final int TYPE_OLD_TV = 14;
  public static final int TYPE_PRODUCT = 10;
  public static final int TYPE_RECORD = 19;
  public static final int TYPE_TEXT = 1;
  public static final int TYPE_TV = 20;
  public static final int TYPE_UNKNOWN = 0;
  public static final int TYPE_URL = 5;
  public static final int TYPE_VIDEO = 4;
  
  public abstract boolean checkArgs();
  
  public abstract void serialize(Bundle paramBundle);
  
  public abstract int type();
  
  public abstract void unserialize(Bundle paramBundle);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\mm\sdk\modelmsg\WXMediaMessage$IMediaObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */