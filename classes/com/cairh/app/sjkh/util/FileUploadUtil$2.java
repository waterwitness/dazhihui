package com.cairh.app.sjkh.util;

import com.cairh.app.sjkh.common.WriteLogFile;
import com.e.a.a.i;
import java.io.PrintStream;
import org.apache.http.Header;
import org.json.JSONException;
import org.json.JSONObject;

class FileUploadUtil$2
  extends i
{
  FileUploadUtil$2(FileUploadUtil paramFileUploadUtil, String paramString) {}
  
  public void onFailure(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte, Throwable paramThrowable)
  {
    if (FileUploadUtil.access$1(this.this$0) == 1)
    {
      FileUploadUtil.access$0(this.this$0).onUploadFailure("IMAGE", "服务器无响应，请稍后再试");
      paramThrowable.printStackTrace();
    }
    switch (FileUploadUtil.access$1(this.this$0))
    {
    default: 
      paramArrayOfHeader = "上传照片异常，服务无响应";
    }
    for (;;)
    {
      WriteLogFile.witeLog(paramArrayOfHeader);
      WriteLogFile.witeLog(paramThrowable.getMessage());
      return;
      paramArrayOfHeader = "上传照片异常，服务无响应：" + this.val$url;
      continue;
      paramArrayOfHeader = "上传日志文件异常，服务无响应：https://sjkh.cairenhui.com/uploadlog/";
    }
  }
  
  public void onSuccess(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte)
  {
    String str = new String(paramArrayOfByte);
    for (;;)
    {
      try
      {
        JSONObject localJSONObject = new JSONObject(str);
        paramArrayOfHeader = localJSONObject;
        paramArrayOfByte = localJSONObject;
        System.out.println("Json parse error");
      }
      catch (JSONException paramArrayOfHeader)
      {
        try
        {
          if (localJSONObject.has("resMap"))
          {
            paramArrayOfByte = localJSONObject;
            paramArrayOfHeader = localJSONObject.getJSONObject("resMap");
          }
          paramArrayOfByte = paramArrayOfHeader;
          if ("0".equals(paramArrayOfHeader.optString("fileType")))
          {
            paramArrayOfByte = paramArrayOfHeader;
            WriteLogFile.clearLog();
            return;
          }
          paramArrayOfByte = paramArrayOfHeader;
          paramInt = paramArrayOfHeader.getInt("errorNo");
          if (paramInt != 0) {
            break;
          }
          FileUploadUtil.access$0(this.this$0).onUploadSuccess("IMAGE", str);
          return;
        }
        catch (JSONException paramArrayOfHeader)
        {
          for (;;) {}
        }
        paramArrayOfHeader = paramArrayOfHeader;
        paramArrayOfByte = null;
      }
      paramArrayOfHeader.printStackTrace();
      if ("".equals("")) {}
      WriteLogFile.witeLog("解析服务响应数据异常，请检查返回的数据：" + str);
      paramInt = -1;
      paramArrayOfHeader = paramArrayOfByte;
    }
    paramArrayOfHeader = paramArrayOfHeader.optString("errorInfo");
    WriteLogFile.witeLog("上传图片有响应：" + this.val$url + "\n\t但是errorNo非零:" + paramArrayOfHeader);
    FileUploadUtil.access$0(this.this$0).onUploadFailure("IMAGE", paramArrayOfHeader);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\util\FileUploadUtil$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */