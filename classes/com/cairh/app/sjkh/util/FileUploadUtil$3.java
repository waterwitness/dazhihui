package com.cairh.app.sjkh.util;

import com.e.a.a.i;
import org.apache.http.Header;
import org.json.JSONException;
import org.json.JSONObject;

class FileUploadUtil$3
  extends i
{
  FileUploadUtil$3(FileUploadUtil paramFileUploadUtil) {}
  
  public void onFailure(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte, Throwable paramThrowable)
  {
    FileUploadUtil.access$0(this.this$0).onUploadFailure("VIDEO", "上传失败，请检查网络\n" + paramThrowable.getMessage());
  }
  
  public void onSuccess(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte)
  {
    paramArrayOfHeader = new String(paramArrayOfByte);
    try
    {
      paramArrayOfByte = new JSONObject(paramArrayOfHeader);
      paramArrayOfHeader = paramArrayOfByte;
      if (paramArrayOfByte.has("resMap")) {
        paramArrayOfHeader = paramArrayOfByte.getJSONObject("resMap");
      }
      paramInt = paramArrayOfHeader.getInt("errorNo");
      paramArrayOfHeader.optString("errorInfo");
      if (paramInt == 0)
      {
        FileUploadUtil.access$0(this.this$0).onUploadSuccess("VIDEO", "");
        return;
      }
      FileUploadUtil.access$0(this.this$0).onUploadFailure("VIDEO", "上传失败，请稍后重试");
      return;
    }
    catch (JSONException paramArrayOfHeader)
    {
      paramArrayOfHeader.printStackTrace();
      FileUploadUtil.access$0(this.this$0).onUploadFailure("VIDEO", "解析服务响应数据异常");
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\util\FileUploadUtil$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */