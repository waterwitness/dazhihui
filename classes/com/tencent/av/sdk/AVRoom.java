package com.tencent.av.sdk;

public class AVRoom
{
  public static final int AUDIO_CATEGORY_MEDIA_PLAYBACK = 2;
  public static final int AUDIO_CATEGORY_MEDIA_PLAY_AND_RECORD = 1;
  public static final int AUDIO_CATEGORY_VOICECHAT = 0;
  public static final long AUTH_BITS_CREATE_ROOM = 1L;
  public static final long AUTH_BITS_DEFAULT = -1L;
  public static final long AUTH_BITS_JOIN_ROOM = 2L;
  public static final long AUTH_BITS_RECV_AUDIO = 8L;
  public static final long AUTH_BITS_RECV_CAMERA_VIDEO = 32L;
  public static final long AUTH_BITS_RECV_SCREEN_VIDEO = 128L;
  public static final long AUTH_BITS_SEND_AUDIO = 4L;
  public static final long AUTH_BITS_SEND_CAMERA_VIDEO = 16L;
  public static final long AUTH_BITS_SEND_SCREEN_VIDEO = 64L;
  public static final int AV_MODE_AUDIO = 0;
  public static final int AV_MODE_VIDEO = 1;
  public static final int AV_ROOM_MULTI = 2;
  public static final int AV_ROOM_NONE = 0;
  public static final int AV_ROOM_PAIR = 1;
  static final String TAG = "SdkJni";
  public static final int VIDEO_RECV_MODE_MANUAL = 0;
  public static final int VIDEO_RECV_MODE_SEMI_AUTO_RECV_CAMERA_VIDEO = 1;
  protected int nativeObj = 0;
  
  public native String getQualityParam();
  
  public native String getQualityTips();
  
  public native long getRoomId();
  
  public native AVRoom.Info getRoomInfo();
  
  public native int getRoomType();
  
  public native String getStatisticsParam();
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\sdk\AVRoom.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */