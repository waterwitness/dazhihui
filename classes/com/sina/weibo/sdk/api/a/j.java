package com.sina.weibo.sdk.api.a;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.sina.weibo.sdk.b.c;

public class j
{
  public static Dialog a(Context paramContext, e parame)
  {
    String str4 = "提示";
    String str3 = "未安装微博客户端，是否现在去下载？";
    String str2 = "现在下载";
    String str1 = "以后再说";
    if (!c.a(paramContext.getApplicationContext()))
    {
      str4 = "Notice";
      str3 = "Sina Weibo client is not installed, download now?";
      str2 = "Download Now";
      str1 = "Download Later";
    }
    return new AlertDialog.Builder(paramContext).setMessage(str3).setTitle(str4).setPositiveButton(str2, new k(paramContext)).setNegativeButton(str1, new l(parame)).create();
  }
  
  private static void b(Context paramContext)
  {
    Intent localIntent = new Intent();
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.setFlags(268435456);
    localIntent.setData(Uri.parse("http://app.sina.cn/appdetail.php?appID=84560"));
    try
    {
      paramContext.startActivity(localIntent);
      return;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\sina\weibo\sdk\api\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */