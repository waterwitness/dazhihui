package com.tencent.av.camera;

public class VideoChatSettings
{
  public static int format;
  public static int height = initial_height;
  private static int initial_height;
  private static int initial_width = 640;
  public static int width;
  
  static
  {
    initial_height = 480;
    format = 0;
    width = initial_width;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\camera\VideoChatSettings.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */