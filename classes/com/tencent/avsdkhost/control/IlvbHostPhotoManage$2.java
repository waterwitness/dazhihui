package com.tencent.avsdkhost.control;

import android.app.ProgressDialog;
import android.text.TextUtils;
import android.util.Log;
import com.android.dazhihui.ui.model.stock.HttpPostAsyncTask.PostListener;

class IlvbHostPhotoManage$2
  implements HttpPostAsyncTask.PostListener
{
  IlvbHostPhotoManage$2(IlvbHostPhotoManage paramIlvbHostPhotoManage) {}
  
  public void onCancelled(String paramString)
  {
    Log.i("ilvb", "onCancelled result=" + paramString);
  }
  
  public void onPostExecute(String paramString)
  {
    Log.i("ilvb", "upload result=" + paramString);
    if (IlvbHostPhotoManage.access$000(this.this$0) != null) {
      IlvbHostPhotoManage.access$000(this.this$0).dismiss();
    }
    if ((!TextUtils.isEmpty(paramString)) && ("ok".equals(paramString))) {}
    for (boolean bool = true;; bool = false)
    {
      if (IlvbHostPhotoManage.access$100(this.this$0) != null) {
        IlvbHostPhotoManage.access$100(this.this$0).uploadEnd(bool);
      }
      if (!bool) {
        break;
      }
      this.this$0.showToast("图片上传成功!");
      return;
    }
    this.this$0.showToast("图片上传失败!");
  }
  
  public void onPreExecute() {}
  
  public void onProgressUpdate(int paramInt) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\control\IlvbHostPhotoManage$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */