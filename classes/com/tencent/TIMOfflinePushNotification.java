package com.tencent;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.support.v4.app.bn;
import android.text.TextUtils;

public class TIMOfflinePushNotification
{
  private String content;
  private String conversationId;
  private TIMConversationType conversationType;
  private byte[] ext;
  private String groupName;
  private boolean isValid = false;
  private String senderIdentifier;
  private String senderNickName;
  private String tag;
  private String title;
  
  TIMOfflinePushNotification() {}
  
  TIMOfflinePushNotification(TIMMessage paramTIMMessage)
  {
    Object localObject1 = paramTIMMessage.getConversation().getType();
    if ((localObject1 != TIMConversationType.C2C) && (localObject1 != TIMConversationType.Group)) {
      return;
    }
    setTag(paramTIMMessage.getConversation().getPeer());
    setConversationType(paramTIMMessage.getConversation().getType());
    setConversationId(paramTIMMessage.getConversation().getPeer());
    if (paramTIMMessage.getSenderProfile() != null)
    {
      if (!TextUtils.isEmpty(paramTIMMessage.getSenderProfile().getIdentifier())) {
        setSenderIdentifier(paramTIMMessage.getSenderProfile().getIdentifier());
      }
      if (!TextUtils.isEmpty(paramTIMMessage.getSenderProfile().getNickName())) {
        setSenderNickName(paramTIMMessage.getSenderProfile().getNickName());
      }
    }
    setGroupName(paramTIMMessage.getGroupName());
    int i;
    Object localObject2;
    label172:
    Object localObject3;
    if (this.conversationType == TIMConversationType.C2C)
    {
      setTitle(this.senderNickName);
      localObject1 = "";
      if (TextUtils.isEmpty(this.title)) {
        setTitle(this.conversationId);
      }
      i = 0;
      localObject2 = localObject1;
      if (i >= paramTIMMessage.getElementCount()) {
        break label591;
      }
      localObject3 = paramTIMMessage.getElement(i);
      if (((TIMElem)localObject3).getType() != TIMElemType.Sound) {
        break label288;
      }
      localObject1 = (String)localObject2 + "[语音]";
    }
    for (;;)
    {
      i += 1;
      localObject2 = localObject1;
      break label172;
      setTitle(this.groupName);
      localObject2 = this.senderNickName;
      localObject1 = localObject2;
      if (TextUtils.isEmpty((CharSequence)localObject2)) {
        localObject1 = this.senderIdentifier;
      }
      localObject1 = "" + (String)localObject1 + ": ";
      break;
      label288:
      if (((TIMElem)localObject3).getType() == TIMElemType.File)
      {
        localObject1 = (String)localObject2 + "[文件]";
      }
      else if (((TIMElem)localObject3).getType() == TIMElemType.Text)
      {
        localObject1 = (TIMTextElem)localObject3;
        localObject1 = (String)localObject2 + ((TIMTextElem)localObject1).getText();
      }
      else if (((TIMElem)localObject3).getType() == TIMElemType.Image)
      {
        localObject1 = (String)localObject2 + "[图片]";
      }
      else if (((TIMElem)localObject3).getType() == TIMElemType.Face)
      {
        localObject1 = (String)localObject2 + "[表情]";
      }
      else if (((TIMElem)localObject3).getType() == TIMElemType.Custom)
      {
        localObject3 = (TIMCustomElem)localObject3;
        localObject1 = localObject2;
        if (TextUtils.isEmpty(((TIMCustomElem)localObject3).getDesc())) {
          localObject1 = (String)localObject2 + "[" + ((TIMCustomElem)localObject3).getDesc() + "]";
        }
        setExt(((TIMCustomElem)localObject3).getExt());
      }
      else if (((TIMElem)localObject3).getType() == TIMElemType.Location)
      {
        localObject1 = (TIMLocationElem)localObject3;
        localObject1 = (String)localObject2 + "[位置信息]" + ((TIMLocationElem)localObject1).getDesc();
      }
      else
      {
        localObject1 = localObject2;
        if (((TIMElem)localObject3).getType() == TIMElemType.Video) {
          localObject1 = (String)localObject2 + "[视频]";
        }
      }
    }
    label591:
    setContent((String)localObject2);
    setIsValid(true);
  }
  
  public void doNotify(Context paramContext, int paramInt)
  {
    bn localbn = new bn(paramContext.getApplicationContext());
    localbn.a(getTitle());
    localbn.b(getContent());
    localbn.a(paramInt);
    localbn.c("收到一条新消息");
    localbn.a(true);
    Intent localIntent = paramContext.getApplicationContext().getPackageManager().getLaunchIntentForPackage(paramContext.getPackageName());
    localbn.a(PendingIntent.getActivity(paramContext, (int)SystemClock.uptimeMillis(), localIntent, 134217728));
    ((NotificationManager)paramContext.getApplicationContext().getSystemService("notification")).notify(this.tag, 520, localbn.a());
  }
  
  public String getContent()
  {
    if (this.content == null) {
      return "";
    }
    return this.content;
  }
  
  public String getConversationId()
  {
    return this.conversationId;
  }
  
  public TIMConversationType getConversationType()
  {
    return this.conversationType;
  }
  
  public byte[] getExt()
  {
    if (this.ext == null) {
      return "".getBytes();
    }
    return this.ext;
  }
  
  public String getGroupName()
  {
    return this.groupName;
  }
  
  public String getSenderIdentifier()
  {
    return this.senderIdentifier;
  }
  
  public String getSenderNickName()
  {
    return this.senderNickName;
  }
  
  public String getTitle()
  {
    if (this.title == null) {
      return "";
    }
    return this.title;
  }
  
  boolean isValid()
  {
    return this.isValid;
  }
  
  void setContent(String paramString)
  {
    this.content = paramString;
  }
  
  void setConversationId(String paramString)
  {
    this.conversationId = paramString;
  }
  
  void setConversationType(TIMConversationType paramTIMConversationType)
  {
    this.conversationType = paramTIMConversationType;
  }
  
  void setExt(byte[] paramArrayOfByte)
  {
    this.ext = paramArrayOfByte;
  }
  
  void setGroupName(String paramString)
  {
    this.groupName = paramString;
  }
  
  void setIsValid(boolean paramBoolean)
  {
    this.isValid = paramBoolean;
  }
  
  void setSenderIdentifier(String paramString)
  {
    this.senderIdentifier = paramString;
  }
  
  void setSenderNickName(String paramString)
  {
    this.senderNickName = paramString;
  }
  
  void setTag(String paramString)
  {
    this.tag = paramString;
  }
  
  void setTitle(String paramString)
  {
    this.title = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMOfflinePushNotification.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */