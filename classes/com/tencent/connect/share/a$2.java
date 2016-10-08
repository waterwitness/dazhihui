package com.tencent.connect.share;

import android.graphics.Bitmap;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import com.tencent.open.a.f;
import com.tencent.open.utils.Util;

final class a$2
  implements Runnable
{
  a$2(String paramString, Handler paramHandler) {}
  
  public void run()
  {
    Object localObject1 = a.a(this.a, 140);
    if (localObject1 != null)
    {
      Object localObject2 = Environment.getExternalStorageDirectory() + "/tmp/";
      String str = Util.encrypt(this.a);
      str = "share2qq_temp" + str + ".jpg";
      if (!a.a(this.a, 140, 140)) {
        f.b("openSDK_LOG.AsynScaleCompressImage", "not out of bound,not compress!");
      }
      for (localObject1 = this.a;; localObject1 = a.a((Bitmap)localObject1, (String)localObject2, str))
      {
        f.b("openSDK_LOG.AsynScaleCompressImage", "-->destFilePath: " + (String)localObject1);
        if (localObject1 == null) {
          break;
        }
        localObject2 = this.b.obtainMessage(101);
        ((Message)localObject2).obj = localObject1;
        this.b.sendMessage((Message)localObject2);
        return;
        f.b("openSDK_LOG.AsynScaleCompressImage", "out of bound,compress!");
      }
    }
    localObject1 = this.b.obtainMessage(102);
    ((Message)localObject1).arg1 = 3;
    this.b.sendMessage((Message)localObject1);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\connect\share\a$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */