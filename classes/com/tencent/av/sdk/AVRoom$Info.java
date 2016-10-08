package com.tencent.av.sdk;

import android.util.Log;

public class AVRoom$Info
{
  static final String TAG = "SdkJni";
  public int audio_category;
  public long auth_bits;
  public byte[] auth_buffer;
  public String av_control_role;
  public int mode;
  public String peer_identifier;
  public int relation_id;
  public int relation_type;
  public long room_id;
  public int room_type;
  public int video_recv_mode;
  
  public AVRoom$Info()
  {
    this.relation_id = 0;
    this.room_id = 0L;
    this.auth_bits = -1L;
    this.auth_buffer = null;
    this.audio_category = 0;
    this.video_recv_mode = 0;
  }
  
  public AVRoom$Info(int paramInt1, long paramLong1, int paramInt2, int paramInt3, String paramString1, long paramLong2, byte[] paramArrayOfByte, String paramString2, int paramInt4, int paramInt5)
  {
    this.room_type = paramInt1;
    this.room_id = paramLong1;
    this.relation_type = 6;
    this.mode = paramInt3;
    this.relation_id = paramInt2;
    this.peer_identifier = paramString1;
    this.auth_bits = paramLong2;
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0)) {
      this.auth_buffer = null;
    }
    for (;;)
    {
      this.av_control_role = paramString2;
      this.audio_category = paramInt4;
      this.video_recv_mode = paramInt5;
      return;
      this.auth_buffer = new byte[paramArrayOfByte.length];
      System.arraycopy(paramArrayOfByte, 0, this.auth_buffer, 0, paramArrayOfByte.length);
      Log.d("SdkJni", "_auth_buffer = " + new String(paramArrayOfByte));
      Log.d("SdkJni", "auth_buffer = " + new String(this.auth_buffer));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\sdk\AVRoom$Info.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */