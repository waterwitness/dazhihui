package com.tencent.open.utils;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import com.tencent.open.a.f;
import java.io.File;

class AsynLoadImg$2
  implements Runnable
{
  AsynLoadImg$2(AsynLoadImg paramAsynLoadImg) {}
  
  public void run()
  {
    f.a("AsynLoadImg", "saveFileRunnable:");
    String str1 = Util.encrypt(AsynLoadImg.b(this.a));
    str1 = "share_qq_" + str1 + ".jpg";
    String str2 = AsynLoadImg.a() + str1;
    Object localObject = new File(str2);
    Message localMessage = AsynLoadImg.c(this.a).obtainMessage();
    if (((File)localObject).exists())
    {
      localMessage.arg1 = 0;
      localMessage.obj = str2;
      f.a("AsynLoadImg", "file exists: time:" + (System.currentTimeMillis() - AsynLoadImg.d(this.a)));
      AsynLoadImg.c(this.a).sendMessage(localMessage);
      return;
    }
    localObject = AsynLoadImg.getbitmap(AsynLoadImg.b(this.a));
    boolean bool;
    if (localObject != null)
    {
      bool = this.a.saveFile((Bitmap)localObject, str1);
      label179:
      if (!bool) {
        break label244;
      }
      localMessage.arg1 = 0;
      localMessage.obj = str2;
    }
    for (;;)
    {
      f.a("AsynLoadImg", "file not exists: download time:" + (System.currentTimeMillis() - AsynLoadImg.d(this.a)));
      break;
      f.a("AsynLoadImg", "saveFileRunnable:get bmp fail---");
      bool = false;
      break label179;
      label244:
      localMessage.arg1 = 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\utils\AsynLoadImg$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */