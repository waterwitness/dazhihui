package com.cairh.app.sjkh.util;

import com.cairh.app.sjkh.base.BaseFileUploadCallbackActivity;
import com.e.a.a.i;
import java.io.PrintStream;
import org.apache.http.Header;
import org.json.JSONException;
import org.json.JSONObject;

class FileUploadUtilOld$2
  extends i
{
  FileUploadUtilOld$2(FileUploadUtilOld paramFileUploadUtilOld, BaseFileUploadCallbackActivity paramBaseFileUploadCallbackActivity) {}
  
  public void onFailure(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte, Throwable paramThrowable)
  {
    System.out.println(">>>>>>>>>>arg0>>>>>>>>>>>>>>>>" + paramInt);
    System.out.println(">>>>>>>>>>arg2>>>>>>>>>>>>>>>>" + new String(paramArrayOfByte));
    System.out.println(">>>>>>>>>>arg3.getMessage()>>>>>>>>>>>>>>>>" + paramThrowable.getMessage());
    this.val$fileUploadCallbackActivity.failDo(-1, "可能网络问题，上传不成功");
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
      paramArrayOfHeader = paramArrayOfHeader.optString("errorInfo");
      this.val$fileUploadCallbackActivity.successDo(paramInt, paramArrayOfHeader);
      return;
    }
    catch (JSONException paramArrayOfHeader)
    {
      paramArrayOfHeader.printStackTrace();
      this.val$fileUploadCallbackActivity.failDo(-10, "解析服务响应数据异常");
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\util\FileUploadUtilOld$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */