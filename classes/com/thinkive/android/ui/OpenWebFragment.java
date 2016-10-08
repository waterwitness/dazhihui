package com.thinkive.android.ui;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Toast;
import be;
import bf;
import bg;
import bh;
import bi;
import bj;
import bk;
import bl;
import bm;
import bn;
import bp;
import com.android.thinkive.framework.fragment.BaseWebFragment;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.IMessageHandler;
import com.android.thinkive.framework.message.MessageManager;
import com.android.thinkive.framework.module.IWebModule;
import com.android.thinkive.framework.module.ModuleManager;
import com.android.thinkive.framework.util.Log;
import com.android.thinkive.framework.view.MyWebView;

public class OpenWebFragment
  extends BaseWebFragment
  implements IWebModule
{
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    if (getWebView() != null)
    {
      getWebView().setWebViewClient(new bp(getActivity()));
      getWebView().setDownloadListener(new OpenWebFragment.a(this));
    }
    if ((getArguments() != null) && (!TextUtils.isEmpty(getArguments().getString("url"))))
    {
      loadUrl(getArguments().getString("url"));
      return;
    }
    Toast.makeText(getActivity(), "url不能为空！", 0).show();
  }
  
  @SuppressLint({"NewApi"})
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ModuleManager.getInstance().registerModule(this);
    if (Build.VERSION.SDK_INT >= 19) {
      WebView.setWebContentsDebuggingEnabled(true);
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
  }
  
  public String onMessageReceive(AppMessage paramAppMessage)
  {
    String str = null;
    int i = paramAppMessage.getMsgId();
    Log.d("msgId == " + i);
    Log.d("home module message = " + paramAppMessage.getContent());
    Object localObject;
    switch (i)
    {
    default: 
      localObject = null;
    case 50101: 
    case 60000: 
    case 60001: 
    case 60002: 
    case 60003: 
    case 60004: 
    case 60005: 
    case 60006: 
    case 60008: 
    case 60013: 
      for (;;)
      {
        if (localObject != null) {
          str = ((IMessageHandler)localObject).handlerMessage(getActivity(), paramAppMessage);
        }
        return str;
        localObject = new be();
        continue;
        localObject = new bf();
        continue;
        localObject = new bg();
        continue;
        localObject = new bh();
        continue;
        localObject = new bi();
        continue;
        localObject = new bj();
        continue;
        localObject = new bk();
        continue;
        localObject = new bl();
        continue;
        localObject = new bm();
        continue;
        localObject = new bn();
      }
    case 60050: 
      sendMessageToH5(paramAppMessage);
      return MessageManager.getInstance(getActivity()).buildMessageReturn(1, null, null);
    case 60051: 
      sendMessageToH5(paramAppMessage);
      return MessageManager.getInstance(getActivity()).buildMessageReturn(1, null, null);
    case 60053: 
      sendMessageToH5(paramAppMessage);
      return MessageManager.getInstance(getActivity()).buildMessageReturn(1, null, null);
    case 60054: 
      sendMessageToH5(paramAppMessage);
      return MessageManager.getInstance(getActivity()).buildMessageReturn(1, null, null);
    case 60055: 
      sendMessageToH5(paramAppMessage);
      return MessageManager.getInstance(getActivity()).buildMessageReturn(1, null, null);
    }
    sendMessageToH5(paramAppMessage);
    return MessageManager.getInstance(getActivity()).buildMessageReturn(1, null, null);
  }
  
  public String returnWebViewName()
  {
    return "open";
  }
  
  public void sendMessageByWebModule(AppMessage paramAppMessage)
  {
    Log.d("loan module send message = " + paramAppMessage.getContent());
    sendMessageToH5(paramAppMessage);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\android\ui\OpenWebFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */