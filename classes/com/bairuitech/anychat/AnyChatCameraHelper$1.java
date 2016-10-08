package com.bairuitech.anychat;

import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;

class AnyChatCameraHelper$1
  implements Camera.PreviewCallback
{
  AnyChatCameraHelper$1(AnyChatCameraHelper paramAnyChatCameraHelper) {}
  
  public void onPreviewFrame(byte[] paramArrayOfByte, Camera paramCamera)
  {
    if ((paramArrayOfByte.length != 0) && (AnyChatCameraHelper.access$0(this.this$0))) {
      AnyChatCoreSDK.InputVideoData(paramArrayOfByte, paramArrayOfByte.length, 0);
    }
    AnyChatCameraHelper.access$1(this.this$0).addCallbackBuffer(paramArrayOfByte);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\bairuitech\anychat\AnyChatCameraHelper$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */