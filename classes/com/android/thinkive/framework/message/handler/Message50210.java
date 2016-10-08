package com.android.thinkive.framework.message.handler;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.android.thinkive.framework.ThinkiveInitializer;
import com.android.thinkive.framework.keyboard.KeyboardEventListener;
import com.android.thinkive.framework.keyboard.KeyboardManager;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.IMessageHandler;
import com.android.thinkive.framework.message.MessageManager;
import com.android.thinkive.framework.view.MyWebView;
import org.json.JSONObject;

public class Message50210
  implements IMessageHandler
{
  private static String syncObject = new String();
  private Context mContext;
  private String mDoneLable;
  private String mEleId;
  private KeyboardEventListener mKeyboardEventListener = new Message50210.1(this);
  private KeyboardManager mKeyboardManager;
  private String mKeyboardType;
  private String mPageId;
  private String mSourceModule;
  private MyWebView mWebView;
  
  public String handlerMessage(Context paramContext, AppMessage paramAppMessage)
  {
    synchronized (syncObject)
    {
      this.mContext = paramContext;
      this.mWebView = paramAppMessage.getWebView();
      JSONObject localJSONObject = paramAppMessage.getContent();
      this.mSourceModule = paramAppMessage.getContent().optString("moduleName");
      this.mPageId = localJSONObject.optString("pageId");
      this.mEleId = localJSONObject.optString("eleId");
      this.mDoneLable = localJSONObject.optString("doneLable");
      this.mKeyboardType = localJSONObject.optString("keyboardType");
      if ("9".equals(this.mKeyboardType))
      {
        paramContext = MessageManager.getInstance(paramContext).buildMessageReturn(1, "键盘类型为9,不处理", null);
        return paramContext;
      }
      if (TextUtils.isEmpty(this.mPageId))
      {
        paramContext = MessageManager.getInstance(paramContext).buildMessageReturn(-5021001, "页面id不能为空", null);
        return paramContext;
      }
    }
    if (TextUtils.isEmpty(this.mEleId))
    {
      paramContext = MessageManager.getInstance(paramContext).buildMessageReturn(-5021002, "元素id不能为空", null);
      return paramContext;
    }
    if (TextUtils.isEmpty(this.mKeyboardType))
    {
      paramContext = MessageManager.getInstance(paramContext).buildMessageReturn(-5021003, "键盘类型不能为空", null);
      return paramContext;
    }
    short s = Short.parseShort(this.mKeyboardType);
    ThinkiveInitializer.getInstance().getHandler().post(new Message50210.2(this, s));
    paramContext = MessageManager.getInstance(paramContext).buildMessageReturn(1, null, null);
    return paramContext;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\handler\Message50210.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */