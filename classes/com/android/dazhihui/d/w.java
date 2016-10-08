package com.android.dazhihui.d;

import android.util.Log;
import android.widget.Toast;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.tencent.avsdkhost.control.IlvbHostPhotoManage.UploadListener;

class w
  implements IlvbHostPhotoManage.UploadListener
{
  w(v paramv) {}
  
  public void uploadEnd(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      ((BrowserActivity)this.a.c).refresh();
      return;
    }
    Log.e("ilvb", "上传图片 失败");
    Toast.makeText(this.a.c, "图片上传失败!", 1).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */