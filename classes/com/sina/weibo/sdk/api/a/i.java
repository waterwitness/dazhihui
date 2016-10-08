package com.sina.weibo.sdk.api.a;

import android.content.Context;
import com.sina.weibo.sdk.api.CmdObject;
import com.sina.weibo.sdk.api.VoiceObject;
import com.sina.weibo.sdk.api.h;

public class i
{
  private String a;
  
  public i() {}
  
  public i(String paramString)
  {
    this.a = paramString;
  }
  
  public boolean a(Context paramContext, h paramh)
  {
    com.sina.weibo.sdk.b.a.a("VersionCheckHandler", "check WeiboMessage package : " + this.a);
    if ((this.a == null) || (this.a.length() == 0)) {}
    do
    {
      return false;
      paramContext = a.a(paramContext, this.a);
    } while (paramContext == null);
    com.sina.weibo.sdk.b.a.a("VersionCheckHandler", "check WeiboMessage WeiboInfo supportApi : " + paramContext.b);
    if ((paramContext.b < 10351) && (paramh.a != null) && ((paramh.a instanceof VoiceObject))) {
      paramh.a = null;
    }
    if ((paramContext.b < 10352) && (paramh.a != null) && ((paramh.a instanceof CmdObject))) {
      paramh.a = null;
    }
    return true;
  }
  
  public boolean a(Context paramContext, com.sina.weibo.sdk.api.i parami)
  {
    com.sina.weibo.sdk.b.a.a("VersionCheckHandler", "check WeiboMultiMessage package : " + this.a);
    if ((this.a == null) || (this.a.length() == 0)) {}
    do
    {
      do
      {
        return false;
        paramContext = a.a(paramContext, this.a);
      } while (paramContext == null);
      com.sina.weibo.sdk.b.a.a("VersionCheckHandler", "check WeiboMultiMessage WeiboInfo supportApi : " + paramContext.b);
    } while (paramContext.b < 10351);
    if ((paramContext.b < 10352) && (parami.c != null) && ((parami.c instanceof CmdObject))) {
      parami.c = null;
    }
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\sina\weibo\sdk\api\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */