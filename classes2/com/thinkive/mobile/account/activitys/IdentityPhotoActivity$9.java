package com.thinkive.mobile.account.activitys;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import bq;
import com.android.thinkive.framework.config.ConfigManager;

final class IdentityPhotoActivity$9
  implements Runnable
{
  IdentityPhotoActivity$9(IdentityPhotoActivity paramIdentityPhotoActivity, Bitmap paramBitmap) {}
  
  public final void run()
  {
    Object localObject1 = this.a;
    localObject1 = this.b;
    Object localObject2 = IdentityPhotoActivity.f(this.a);
    String str = IdentityPhotoActivity.g(this.a);
    localObject1 = bq.a((Bitmap)localObject1, Integer.parseInt(ConfigManager.getInstance().getSystemConfigValue("IMG_SIZE")), new String[] { localObject2, str });
    if (!TextUtils.isEmpty((CharSequence)localObject1))
    {
      localObject2 = Message.obtain();
      ((Message)localObject2).what = 0;
      ((Message)localObject2).obj = localObject1;
      IdentityPhotoActivity.h(this.a).sendMessage((Message)localObject2);
      return;
    }
    IdentityPhotoActivity.h(this.a).sendEmptyMessage(1);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\mobile\account\activitys\IdentityPhotoActivity$9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */