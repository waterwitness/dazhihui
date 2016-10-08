package com.thinkive.mobile.account.activitys;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import bq;
import br;
import com.android.thinkive.framework.compatible.CallBack.SchedulerCallBack;
import com.android.thinkive.framework.compatible.DialogFrame;
import com.android.thinkive.framework.compatible.MessageAction;

final class CameraActivity$5
  implements CallBack.SchedulerCallBack
{
  CameraActivity$5(CameraActivity paramCameraActivity, Intent paramIntent, DialogFrame paramDialogFrame) {}
  
  public final void handler(MessageAction paramMessageAction)
  {
    try
    {
      paramMessageAction = this.b.getData();
      System.gc();
      try
      {
        str = br.a(this.a, paramMessageAction);
        localBitmap = null;
        paramMessageAction = localBitmap;
      }
      catch (Exception paramMessageAction)
      {
        String str;
        Bitmap localBitmap;
        label74:
        paramMessageAction.printStackTrace();
        CameraActivity.c(this.a).sendEmptyMessage(1);
        return;
      }
    }
    catch (Exception paramMessageAction)
    {
      CameraActivity.c(this.a).sendEmptyMessage(1);
      return;
    }
    try
    {
      System.gc();
      paramMessageAction = localBitmap;
      localBitmap = bq.a(str, 500, 500);
      paramMessageAction = localBitmap;
      CameraActivity.c = br.a(localBitmap);
      paramMessageAction = localBitmap;
      CameraActivity.c = "data:image/jpg;base64," + CameraActivity.c;
      paramMessageAction = localBitmap;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      break label74;
      CameraActivity.c(this.a).post(new CameraActivity.5.1(this, paramMessageAction));
      if (this.c == null) {
        return;
      }
      this.c.unWaitDialog();
    }
    paramMessageAction = bq.a(paramMessageAction, CameraActivity.d(this.a), new String[] { CameraActivity.f(), CameraActivity.e(this.a) });
    if (TextUtils.isEmpty(paramMessageAction))
    {
      CameraActivity.c(this.a).sendEmptyMessage(2);
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\mobile\account\activitys\CameraActivity$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */