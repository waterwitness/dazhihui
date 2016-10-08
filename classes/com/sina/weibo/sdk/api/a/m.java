package com.sina.weibo.sdk.api.a;

import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.sina.weibo.sdk.b.c;

public class m
  implements f
{
  private Context a;
  private String b;
  private b c = null;
  private boolean d = true;
  private e e;
  private Dialog f = null;
  
  public m(Context paramContext, String paramString, boolean paramBoolean)
  {
    this.a = paramContext;
    this.b = paramString;
    this.d = paramBoolean;
    this.c = a.a(this.a);
    if (this.c != null)
    {
      com.sina.weibo.sdk.b.a.a("WeiboApiImpl", this.c.toString());
      return;
    }
    com.sina.weibo.sdk.b.a.a("WeiboApiImpl", "WeiboInfo: is null");
  }
  
  private void a(Context paramContext, String paramString1, String paramString2, String paramString3, Bundle paramBundle)
  {
    paramString1 = new Intent(paramString1);
    String str = paramContext.getPackageName();
    paramString1.putExtra("_weibo_sdkVersion", 22);
    paramString1.putExtra("_weibo_appPackage", str);
    paramString1.putExtra("_weibo_appKey", paramString2);
    paramString1.putExtra("_weibo_flag", 538116905);
    paramString1.putExtra("_weibo_sign", com.sina.weibo.sdk.b.b.a(c.a(paramContext, str)));
    if (!TextUtils.isEmpty(paramString3)) {
      paramString1.setPackage(paramString3);
    }
    if (paramBundle != null) {
      paramString1.putExtras(paramBundle);
    }
    com.sina.weibo.sdk.b.a.a("WeiboApiImpl", "intent=" + paramString1 + ", extra=" + paramString1.getExtras());
    paramContext.sendBroadcast(paramString1, "com.sina.weibo.permission.WEIBO_SDK_PERMISSION");
  }
  
  private boolean a(Activity paramActivity, String paramString1, String paramString2, String paramString3, Bundle paramBundle)
  {
    if ((paramActivity == null) || (TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)) || (TextUtils.isEmpty(paramString3)))
    {
      com.sina.weibo.sdk.b.a.b("ActivityHandler", "send fail, invalid arguments");
      return false;
    }
    Intent localIntent = new Intent();
    localIntent.setPackage(paramString2);
    localIntent.setAction(paramString1);
    paramString1 = paramActivity.getPackageName();
    localIntent.putExtra("_weibo_sdkVersion", 22);
    localIntent.putExtra("_weibo_appPackage", paramString1);
    localIntent.putExtra("_weibo_appKey", paramString3);
    localIntent.putExtra("_weibo_flag", 538116905);
    localIntent.putExtra("_weibo_sign", com.sina.weibo.sdk.b.b.a(c.a(paramActivity, paramString1)));
    if (paramBundle != null) {
      localIntent.putExtras(paramBundle);
    }
    try
    {
      com.sina.weibo.sdk.b.a.a("WeiboApiImpl", "intent=" + localIntent + ", extra=" + localIntent.getExtras());
      paramActivity.startActivityForResult(localIntent, 765);
      return true;
    }
    catch (ActivityNotFoundException paramActivity)
    {
      com.sina.weibo.sdk.b.a.b("WeiboApiImpl", "Failed, target ActivityNotFound");
    }
    return false;
  }
  
  public boolean a()
  {
    return a.a(b());
  }
  
  public boolean a(d paramd)
  {
    if (paramd == null) {
      com.sina.weibo.sdk.b.a.b("WeiboApiImpl", "sendRequest faild act == null or request == null");
    }
    while (!a(this.d)) {
      return false;
    }
    Object localObject = new i(this.c.a);
    if (!paramd.a(this.a, (i)localObject))
    {
      com.sina.weibo.sdk.b.a.b("WeiboApiImpl", "sendRequest faild request check faild");
      return false;
    }
    localObject = new Bundle();
    paramd.a((Bundle)localObject);
    return a((Activity)this.a, "com.sina.weibo.sdk.action.ACTION_WEIBO_ACTIVITY", this.c.a, this.b, (Bundle)localObject);
  }
  
  public boolean a(boolean paramBoolean)
  {
    if (this.c == null)
    {
      if (paramBoolean)
      {
        if (this.f == null)
        {
          this.f = j.a(this.a, this.e);
          this.f.show();
        }
        for (;;)
        {
          return false;
          if (!this.f.isShowing()) {
            this.f.show();
          }
        }
      }
      throw new com.sina.weibo.sdk.a.b("Weibo is NOT installed!");
    }
    if (!a.a(this.c.b)) {
      throw new com.sina.weibo.sdk.a.b("Weibo do NOT support Share API!");
    }
    if (!a.b(this.a, this.c.a)) {
      throw new com.sina.weibo.sdk.a.b("Weibo signature is incorrect!");
    }
    return true;
  }
  
  public int b()
  {
    if (this.c == null) {
      return -1;
    }
    return this.c.b;
  }
  
  public boolean c()
  {
    if (!a(this.d)) {
      return false;
    }
    a(this.a, "com.sina.weibo.sdk.Intent.ACTION_WEIBO_REGISTER", this.b, null, null);
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\sina\weibo\sdk\api\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */