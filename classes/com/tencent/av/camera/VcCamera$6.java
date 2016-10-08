package com.tencent.av.camera;

import android.annotation.TargetApi;
import android.graphics.ImageFormat;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import android.view.Display;
import com.tencent.av.sdk.AVUILoopProxy;
import com.tencent.av.utils.QLog;
import java.util.Iterator;
import java.util.List;

class VcCamera$6
  implements Camera.PreviewCallback
{
  VcCamera$6(VcCamera paramVcCamera) {}
  
  @TargetApi(8)
  public void onPreviewFrame(byte[] paramArrayOfByte, Camera paramCamera)
  {
    int m = 1;
    int k = 1;
    int i;
    if (VcCamera.nInFPS > 0)
    {
      if (!VcCamera.access$500(this.this$0)) {
        break label476;
      }
      if (this.this$0.CUR_CAMERA != 0) {
        break label228;
      }
      i = (360 - (this.this$0.devDisplay.getRotation() * 90 + this.this$0.getOrientation()) % 360) % 360;
    }
    for (;;)
    {
      int j = i + this.this$0.getRotation();
      if ((this.this$0.getOrientation() == 270) || (this.this$0.getOrientation() == 90))
      {
        i = j;
        if (this.this$0.getRotation() % 180 == 0)
        {
          i = j;
          if (this.this$0.CUR_CAMERA == 0)
          {
            i = j;
            if (!VcCamera.get(this.this$0.mContext, "ro.qq.orientation").equalsIgnoreCase("ZTE")) {
              i = j + 180;
            }
          }
        }
        label168:
        if (this.this$0.CUR_CAMERA != 0) {
          break label429;
        }
        if (this.this$0.mFrontCameraAngle <= 0) {
          break label407;
        }
        i += 360 - this.this$0.mFrontCameraAngle;
      }
      int n;
      for (;;)
      {
        n = i % 360 / 90;
        if (paramArrayOfByte != null) {
          break label718;
        }
        QLog.d("VcCamera", 0, "onPreviewFrame data null");
        return;
        label228:
        if (this.this$0.CUR_CAMERA != 1) {
          break label1265;
        }
        i = this.this$0.devDisplay.getRotation();
        i = (this.this$0.getOrientation() - i * 90 + 360) % 360;
        break;
        if (this.this$0.getOrientation() != 0)
        {
          i = j;
          if (this.this$0.getOrientation() != 180) {
            break label168;
          }
        }
        if ((this.this$0.getRotation() == 90) || (this.this$0.getRotation() == 270))
        {
          i = j;
          if (this.this$0.CUR_CAMERA != 0) {
            break label168;
          }
          i = j;
          if (this.this$0.mbIsTablet) {
            break label168;
          }
          i = j + 180;
          break label168;
        }
        i = j;
        if (this.this$0.CUR_CAMERA != 0) {
          break label168;
        }
        i = j;
        if (!this.this$0.mbIsTablet) {
          break label168;
        }
        i = j + 180;
        break label168;
        label407:
        i += this.this$0.getRemoteAngleForFrontCamera(this.this$0.getRotation());
        continue;
        label429:
        if (this.this$0.mBackCameraAngle > 0)
        {
          i += this.this$0.mBackCameraAngle;
        }
        else
        {
          i += this.this$0.getRemoteAngleForBackCamera(this.this$0.getRotation());
          continue;
          label476:
          j = (this.this$0.getRotation() + this.this$0.CompenSateRecvAngle + 90) % 360;
          if (this.this$0.getOrientation() != 270)
          {
            i = j;
            if (this.this$0.getOrientation() != 90) {}
          }
          else
          {
            if (this.this$0.CUR_CAMERA != 0) {
              break label627;
            }
            i = j + 90;
          }
          label546:
          if (this.this$0.CUR_CAMERA == 0)
          {
            j = i;
            if (!VcCamera.get(this.this$0.mContext, "ro.qq.orientation").equalsIgnoreCase("ZTE")) {
              j = i + 180;
            }
          }
          for (;;)
          {
            if (this.this$0.CUR_CAMERA == 0)
            {
              if (this.this$0.mFrontCameraAngle > 0)
              {
                i = j + (360 - this.this$0.mFrontCameraAngle);
                break;
                label627:
                i = j + 180;
                break label546;
                j = i + 180;
                continue;
              }
              i = j + this.this$0.getRemoteAngleForFrontCamera(this.this$0.getRotation());
              break;
            }
          }
          if (this.this$0.mBackCameraAngle > 0) {
            i = j + this.this$0.mBackCameraAngle;
          } else {
            i = j + this.this$0.getRemoteAngleForBackCamera(this.this$0.getRotation());
          }
        }
      }
      label718:
      if (this.this$0.LAST_CAMERA != this.this$0.CUR_CAMERA)
      {
        AVUILoopProxy.postTaskToMainLooper(new VcCamera.CameraPreviewChangeRunnable(this.this$0, this.this$0.CUR_CAMERA));
        this.this$0.LAST_CAMERA = this.this$0.CUR_CAMERA;
      }
      int i1 = paramArrayOfByte.length;
      if (i1 != VideoChatSettings.width * VideoChatSettings.height * ImageFormat.getBitsPerPixel(VideoChatSettings.format) / 8)
      {
        QLog.d("VcCamera", 0, "camera param is not the same as setting, real data_width:" + VideoChatSettings.width + "data_height:" + VideoChatSettings.height + "data_format:" + VideoChatSettings.format + "real length: " + i1);
        if (this.this$0.mFrameSizes == null) {
          break label1259;
        }
        Iterator localIterator = this.this$0.mFrameSizes.iterator();
        while (localIterator.hasNext())
        {
          Camera.Size localSize = (Camera.Size)localIterator.next();
          if (localSize.height * localSize.width * ImageFormat.getBitsPerPixel(VideoChatSettings.format) / 8 == i1)
          {
            QLog.d("VcCamera", 0, "get real size form support sizes, width: " + localSize.width + "data_height:" + localSize.height + "data_format:" + VideoChatSettings.format + "real length: " + i1);
            this.this$0.onCaptureFrame(paramArrayOfByte, i1, localSize.width, localSize.height, n, VideoChatSettings.format);
          }
        }
      }
      label1259:
      for (i = 1;; i = 0)
      {
        j = i;
        if (i == 0)
        {
          j = i;
          if (paramCamera == null) {}
        }
        for (;;)
        {
          try
          {
            paramCamera = paramCamera.getParameters();
            j = i;
            if (paramCamera != null)
            {
              i2 = paramCamera.getPreviewSize().width;
              i3 = paramCamera.getPreviewSize().height;
              i4 = paramCamera.getPreviewFormat();
              QLog.d("VcCamera", 0, "get preview camera info, data_width: " + i2 + "data_height: " + i3 + "data_format: " + i4 + "real length: " + i1);
              int i5 = i2 * i3 * ImageFormat.getBitsPerPixel(i4) / 8;
              j = i;
              if (i5 != i1) {}
            }
          }
          catch (Exception paramArrayOfByte)
          {
            try
            {
              int i2;
              int i3;
              int i4;
              this.this$0.onCaptureFrame(paramArrayOfByte, i1, i2, i3, n, i4);
              i = k;
              j = i;
              if (j == 0) {
                QLog.d("VcCamera", 0, "data len is not matched");
              }
              if (this.this$0.mPreBuffer == null) {
                break;
              }
              this.this$0.mCamera.addCallbackBuffer(this.this$0.mPreBuffer);
              return;
            }
            catch (Exception paramArrayOfByte)
            {
              for (;;)
              {
                i = m;
              }
            }
            paramArrayOfByte = paramArrayOfByte;
          }
          paramArrayOfByte.printStackTrace();
          continue;
          this.this$0.onCaptureFrame(paramArrayOfByte, i1, VideoChatSettings.width, VideoChatSettings.height, n, VideoChatSettings.format);
        }
      }
      label1265:
      i = 0;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\camera\VcCamera$6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */