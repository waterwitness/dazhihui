package com.android.thinkive.framework.message.handler;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.android.thinkive.framework.ThinkiveInitializer;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.IMessageHandler;
import com.android.thinkive.framework.message.MessageManager;
import com.android.thinkive.framework.view.InfoDialog;
import org.json.JSONObject;

public class Message50110
  implements IMessageHandler
{
  private String mContent;
  private String mFlag;
  private String mHeight;
  private InfoDialog mInfoDialog;
  private String mSourceModule;
  private String mTitle;
  private String mType;
  private String mWidth;
  
  private void showInfoDialog(Context paramContext)
  {
    ThinkiveInitializer.getInstance().getHandler().post(new Message50110.1(this, paramContext));
  }
  
  public String handlerMessage(Context paramContext, AppMessage paramAppMessage)
  {
    JSONObject localJSONObject = paramAppMessage.getContent();
    this.mSourceModule = paramAppMessage.getContent().optString("moduleName");
    this.mTitle = localJSONObject.optString("title");
    this.mContent = localJSONObject.optString("content");
    this.mType = localJSONObject.optString("type");
    this.mFlag = localJSONObject.optString("flag");
    this.mWidth = localJSONObject.optString("width");
    this.mHeight = localJSONObject.optString("height");
    if (TextUtils.isEmpty(this.mContent)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(-5011001, "内容不能为空", null);
    }
    showInfoDialog(paramContext);
    return MessageManager.getInstance(paramContext).buildMessageReturn(1, null, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\handler\Message50110.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */