package com.tencent.avsdkhost.control;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.util.Log;
import java.net.URLDecoder;
import org.json.JSONObject;

class IlvbHostPhotoManage$1
  extends AsyncTask<String, Void, String>
{
  IlvbHostPhotoManage$1(IlvbHostPhotoManage paramIlvbHostPhotoManage) {}
  
  protected String doInBackground(String... paramVarArgs)
  {
    return this.this$0.httpPost(paramVarArgs[0]);
  }
  
  protected void onPostExecute(String paramString)
  {
    boolean bool1 = false;
    if (IlvbHostPhotoManage.access$000(this.this$0) != null) {
      IlvbHostPhotoManage.access$000(this.this$0).dismiss();
    }
    Log.i("ilvb", "result=" + paramString);
    try
    {
      paramString = new JSONObject(paramString);
      paramString.optString("redirect", "");
      URLDecoder.decode("", "utf-8");
      boolean bool2 = paramString.optBoolean("rs", false);
      bool1 = bool2;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
      }
      this.this$0.showToast("图片上传失败!");
    }
    if (IlvbHostPhotoManage.access$100(this.this$0) != null) {
      IlvbHostPhotoManage.access$100(this.this$0).uploadEnd(bool1);
    }
    if (bool1)
    {
      this.this$0.showToast("图片上传成功!");
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\control\IlvbHostPhotoManage$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */