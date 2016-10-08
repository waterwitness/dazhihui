package com.cairh.app.sjkh.ui;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.hardware.Camera;
import android.hardware.Camera.PictureCallback;
import com.cairh.app.sjkh.common.WriteLogFile;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class CameraMainActivity$3
  implements Camera.PictureCallback
{
  CameraMainActivity$3(CameraMainActivity paramCameraMainActivity) {}
  
  public void onPictureTaken(byte[] paramArrayOfByte, Camera paramCamera)
  {
    Bitmap localBitmap = BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length);
    paramArrayOfByte = new File(CameraMainActivity.access$0(this.this$0));
    try
    {
      paramArrayOfByte.createNewFile();
      FileOutputStream localFileOutputStream = new FileOutputStream(paramArrayOfByte);
      paramArrayOfByte = localBitmap;
      if (CameraMainActivity.access$1())
      {
        int i = localBitmap.getHeight();
        int j = localBitmap.getWidth();
        paramArrayOfByte = Bitmap.createBitmap(localBitmap, i / 6, (j - i) / 2, i, i * 2 / 3);
      }
      paramArrayOfByte.compress(Bitmap.CompressFormat.JPEG, 100, localFileOutputStream);
      localFileOutputStream.close();
    }
    catch (IOException paramArrayOfByte)
    {
      for (;;)
      {
        paramArrayOfByte.printStackTrace();
        WriteLogFile.witeLog("拍照后保存图片出错，目录[" + CameraMainActivity.access$0(this.this$0) + "]");
      }
    }
    paramCamera.stopPreview();
    this.this$0.setResult(-1);
    this.this$0.finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\ui\CameraMainActivity$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */