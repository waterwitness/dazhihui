package com.thinkive.mobile.account.activitys;

import android.os.Handler;
import android.os.Message;
import android.widget.Toast;

final class FacePhotographActivity$1
  extends Handler
{
  FacePhotographActivity$1(FacePhotographActivity paramFacePhotographActivity) {}
  
  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return;
    case 1: 
      try
      {
        Toast.makeText(this.a, "获取图片失败,请重新从相册选择", 1).show();
        this.a.finish();
        return;
      }
      catch (Exception paramMessage)
      {
        paramMessage.printStackTrace();
        return;
      }
    }
    try
    {
      Toast.makeText(this.a, "获取图片失败，请重新调用系统相机进行拍摄", 1).show();
      this.a.finish();
      return;
    }
    catch (Exception paramMessage)
    {
      paramMessage.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\mobile\account\activitys\FacePhotographActivity$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */