package com.android.thinkive.framework.module;

import android.content.Context;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.IMessageHandler;
import com.android.thinkive.framework.message.handler.Message50000;
import com.android.thinkive.framework.message.handler.Message50001;
import com.android.thinkive.framework.message.handler.Message50010;
import com.android.thinkive.framework.message.handler.Message50011;
import com.android.thinkive.framework.message.handler.Message50020;
import com.android.thinkive.framework.message.handler.Message50021;
import com.android.thinkive.framework.message.handler.Message50022;
import com.android.thinkive.framework.message.handler.Message50023;
import com.android.thinkive.framework.message.handler.Message50024;
import com.android.thinkive.framework.message.handler.Message50030;
import com.android.thinkive.framework.message.handler.Message50031;
import com.android.thinkive.framework.message.handler.Message50040;
import com.android.thinkive.framework.message.handler.Message50041;
import com.android.thinkive.framework.message.handler.Message50042;
import com.android.thinkive.framework.message.handler.Message50043;
import com.android.thinkive.framework.message.handler.Message50100;
import com.android.thinkive.framework.message.handler.Message50105;
import com.android.thinkive.framework.message.handler.Message50106;
import com.android.thinkive.framework.message.handler.Message50109;
import com.android.thinkive.framework.message.handler.Message50110;
import com.android.thinkive.framework.message.handler.Message50111;
import com.android.thinkive.framework.message.handler.Message50112;
import com.android.thinkive.framework.message.handler.Message50116;
import com.android.thinkive.framework.message.handler.Message50118;
import com.android.thinkive.framework.message.handler.Message50200;
import com.android.thinkive.framework.message.handler.Message50201;
import com.android.thinkive.framework.message.handler.Message50202;
import com.android.thinkive.framework.message.handler.Message50203;
import com.android.thinkive.framework.message.handler.Message50210;
import com.android.thinkive.framework.message.handler.Message50211;
import com.android.thinkive.framework.message.handler.Message50212;
import com.android.thinkive.framework.message.handler.Message50220;
import com.android.thinkive.framework.message.handler.Message50223;
import com.android.thinkive.framework.message.handler.Message50224;
import com.android.thinkive.framework.message.handler.Message50232;
import com.android.thinkive.framework.message.handler.Message50250;
import com.android.thinkive.framework.message.handler.Message50251;
import com.android.thinkive.framework.message.handler.Message50262;
import com.android.thinkive.framework.message.handler.Message50272;
import com.android.thinkive.framework.message.handler.Message60301;
import com.android.thinkive.framework.util.Log;

public class CommonModule
  implements IModule
{
  public Context mContext;
  
  public CommonModule(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  public String onMessageReceive(AppMessage paramAppMessage)
  {
    String str = null;
    Log.d("common module receive message id = " + paramAppMessage.getMsgId() + " content = " + paramAppMessage.getContent());
    Object localObject;
    switch (paramAppMessage.getMsgId())
    {
    default: 
      localObject = null;
    }
    for (;;)
    {
      if (localObject != null) {
        str = ((IMessageHandler)localObject).handlerMessage(this.mContext, paramAppMessage);
      }
      return str;
      localObject = new Message50000();
      continue;
      localObject = new Message50001();
      continue;
      localObject = new Message50010();
      continue;
      localObject = new Message50011();
      continue;
      localObject = new Message50020();
      continue;
      localObject = new Message50021();
      continue;
      localObject = new Message50022();
      continue;
      localObject = new Message50023();
      continue;
      localObject = new Message50024();
      continue;
      localObject = new Message50030();
      continue;
      localObject = new Message50031();
      continue;
      localObject = new Message50040();
      continue;
      localObject = new Message50041();
      continue;
      localObject = new Message50042();
      continue;
      localObject = new Message50043();
      continue;
      localObject = new Message50100();
      continue;
      localObject = null;
      continue;
      localObject = null;
      continue;
      localObject = null;
      continue;
      localObject = null;
      continue;
      localObject = new Message50105();
      continue;
      localObject = new Message50106();
      continue;
      localObject = null;
      continue;
      localObject = new Message50109();
      continue;
      localObject = new Message50110();
      continue;
      localObject = new Message50111();
      continue;
      localObject = new Message50112();
      continue;
      localObject = new Message50116();
      continue;
      localObject = new Message50200();
      continue;
      localObject = new Message50201();
      continue;
      localObject = new Message50202();
      continue;
      localObject = new Message50203();
      continue;
      localObject = new Message50210();
      continue;
      localObject = new Message50211();
      continue;
      localObject = new Message50212();
      continue;
      localObject = new Message50220();
      continue;
      localObject = new Message50223();
      continue;
      localObject = new Message50224();
      continue;
      localObject = new Message50232();
      continue;
      localObject = new Message50250();
      continue;
      localObject = new Message50251();
      continue;
      localObject = new Message50262();
      continue;
      localObject = new Message50272();
      continue;
      localObject = new Message50118();
      continue;
      localObject = new Message60301();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\module\CommonModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */