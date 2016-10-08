package com.cairh.app.sjkh.util;

import android.widget.Toast;
import com.cairh.app.sjkh.MainActivity;
import com.cairh.app.sjkh.common.WriteLogFile;
import com.e.a.a.i;
import java.io.PrintStream;
import org.apache.http.Header;
import org.json.JSONException;
import org.json.JSONObject;

class FileUploadUtilOld$1
  extends i
{
  FileUploadUtilOld$1(FileUploadUtilOld paramFileUploadUtilOld, String paramString) {}
  
  public void onFailure(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte, Throwable paramThrowable)
  {
    if (FileUploadUtilOld.access$2(this.this$0) == 1)
    {
      FileUploadUtilOld.access$0(this.this$0).dismissProgressDialog();
      Toast.makeText(FileUploadUtilOld.access$1(this.this$0), "服务器无响应，请稍后再试", 1).show();
      paramThrowable.printStackTrace();
    }
    switch (FileUploadUtilOld.access$2(this.this$0))
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
          FileUploadUtilOld.access$0(this.this$0).dismissProgressDialog();
          paramArrayOfByte = paramArrayOfHeader;
          paramInt = paramArrayOfHeader.getInt("errorNo");
          if (paramInt != 0) {
            break;
          }
          Toast.makeText(FileUploadUtilOld.access$1(this.this$0), "上传成功", 1).show();
          ((MainActivity)FileUploadUtilOld.access$1(this.this$0)).callJSFunc("parsePicUrl('" + str + "')");
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
    Toast.makeText(FileUploadUtilOld.access$1(this.this$0), paramArrayOfHeader, 1).show();
    ((MainActivity)FileUploadUtilOld.access$1(this.this$0)).callJSFunc("parsePicUrl('" + str + "')");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\util\FileUploadUtilOld$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */