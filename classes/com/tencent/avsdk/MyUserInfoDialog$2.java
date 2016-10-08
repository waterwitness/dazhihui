package com.tencent.avsdk;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.dazhihui.ui.screen.stock.LoginMainScreen;
import com.tencent.avsdk.Model.ReportVo;
import com.tencent.avsdk.Model.ReportVo.DataMsg;
import java.io.PrintStream;

class MyUserInfoDialog$2
  extends AsyncTask<String, Void, String>
{
  MyUserInfoDialog$2(MyUserInfoDialog paramMyUserInfoDialog) {}
  
  protected String doInBackground(String... paramVarArgs)
  {
    try
    {
      paramVarArgs = HttpUtil.httpGet(paramVarArgs[0]);
      return paramVarArgs;
    }
    catch (Exception paramVarArgs)
    {
      paramVarArgs.printStackTrace();
    }
    return null;
  }
  
  protected void onPostExecute(String paramString)
  {
    MyUserInfoDialog.access$102(this.this$0, false);
    if (!TextUtils.isEmpty(paramString))
    {
      System.out.println("report result = " + paramString);
      ReportVo localReportVo = new ReportVo();
      localReportVo.parseData(paramString);
      if (localReportVo.Err == 0)
      {
        Toast.makeText(MyUserInfoDialog.access$200(this.this$0), "举报成功", 0).show();
        return;
      }
      if ((localReportVo.Data != null) && (localReportVo.Data.Code == 1))
      {
        Toast.makeText(MyUserInfoDialog.access$200(this.this$0), "未登录", 0).show();
        paramString = new Intent();
        paramString.setClass(MyUserInfoDialog.access$200(this.this$0), LoginMainScreen.class);
        paramString.putExtra("REGISTER_FROM_TYPE", "FROM_STOCK");
        MyUserInfoDialog.access$200(this.this$0).startActivity(paramString);
        return;
      }
      if ((localReportVo.Data != null) && (localReportVo.Data.Code == 2))
      {
        Toast.makeText(MyUserInfoDialog.access$200(this.this$0), "参数错误", 0).show();
        return;
      }
      if ((localReportVo.Data != null) && (localReportVo.Data.Code == 3))
      {
        Toast.makeText(MyUserInfoDialog.access$200(this.this$0), "举报失败", 0).show();
        return;
      }
      Toast.makeText(MyUserInfoDialog.access$200(this.this$0), "返回格式错误", 0).show();
      return;
    }
    Toast.makeText(MyUserInfoDialog.access$200(this.this$0), "网络异常", 0).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\MyUserInfoDialog$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */