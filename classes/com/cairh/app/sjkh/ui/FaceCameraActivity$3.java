package com.cairh.app.sjkh.ui;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.hardware.Camera;
import android.hardware.Camera.PictureCallback;
import com.cairh.app.sjkh.common.WriteLogFile;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class FaceCameraActivity$3
  implements Camera.PictureCallback
{
  FaceCameraActivity$3(FaceCameraActivity paramFaceCameraActivity) {}
  
  public void onPictureTaken(byte[] paramArrayOfByte, Camera paramCamera)
  {
    paramArrayOfByte = BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length);
    Object localObject = new File(FaceCameraActivity.access$0(this.this$0));
    try
    {
      ((File)localObject).createNewFile();
      localObject = new FileOutputStream((File)localObject);
      int i = paramArrayOfByte.getHeight();
      int j = paramArrayOfByte.getWidth();
      Matrix localMatrix = new Matrix();
      localMatrix.postRotate(270.0F);
      Bitmap.createBitmap(paramArrayOfByte, 0, 0, j, i, localMatrix, true).compress(Bitmap.CompressFormat.JPEG, 100, (OutputStream)localObject);
      ((FileOutputStream)localObject).close();
      paramCamera.stopPreview();
      this.this$0.setResult(-1);
      this.this$0.finish();
      return;
    }
    catch (IOException paramArrayOfByte)
    {
      for (;;)
      {
        paramArrayOfByte.printStackTrace();
        WriteLogFile.witeLog("拍照后保存图片出错，目录[" + FaceCameraActivity.access$0(this.this$0) + "]");
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\ui\FaceCameraActivity$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */