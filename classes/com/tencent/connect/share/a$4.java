package com.tencent.connect.share;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import com.tencent.open.a.f;
import com.tencent.open.utils.Util;
import java.util.ArrayList;

final class a$4
  implements Runnable
{
  a$4(ArrayList paramArrayList, Handler paramHandler) {}
  
  public void run()
  {
    int i = 0;
    if (i < this.a.size())
    {
      localObject1 = (String)this.a.get(i);
      String str1;
      String str2;
      if ((!Util.isValidUrl((String)localObject1)) && (Util.fileExists((String)localObject1)))
      {
        localObject2 = a.a((String)localObject1, 10000);
        if (localObject2 != null)
        {
          str1 = Environment.getExternalStorageDirectory() + "/tmp/";
          str2 = Util.encrypt((String)localObject1);
          str2 = "share2qzone_temp" + str2 + ".jpg";
          if (a.a((String)localObject1, 640, 10000)) {
            break label153;
          }
          f.b("openSDK_LOG.AsynScaleCompressImage", "not out of bound,not compress!");
        }
      }
      for (;;)
      {
        if (localObject1 != null) {
          this.a.set(i, localObject1);
        }
        i += 1;
        break;
        label153:
        f.b("openSDK_LOG.AsynScaleCompressImage", "out of bound, compress!");
        localObject1 = a.a((Bitmap)localObject2, str1, str2);
      }
    }
    Object localObject1 = this.b.obtainMessage(101);
    Object localObject2 = new Bundle();
    ((Bundle)localObject2).putStringArrayList("images", this.a);
    ((Message)localObject1).setData((Bundle)localObject2);
    this.b.sendMessage((Message)localObject1);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\connect\share\a$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */