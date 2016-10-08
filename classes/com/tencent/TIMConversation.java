package com.tencent;

import com.tencent.imcore.IMCoreUser;
import com.tencent.imcore.Msg;
import com.tencent.imcore.MsgVec;
import com.tencent.imcore.Session;
import com.tencent.imcore.SessionType;
import com.tencent.imsdk.QLog;
import java.util.ArrayList;
import java.util.List;

public class TIMConversation
{
  private static final String tag = "MSF.C.IMConversation";
  private String identifer = "";
  private String peer = "";
  private TIMConversationType type = TIMConversationType.Invalid;
  
  public TIMConversation()
  {
    this.identifer = TIMManager.getInstance().getIdentification();
  }
  
  public TIMConversation(String paramString)
  {
    this.identifer = paramString;
  }
  
  public static String getTag()
  {
    return "MSF.C.IMConversation";
  }
  
  public void deleteLocalMessage(TIMCallBack paramTIMCallBack)
  {
    if (paramTIMCallBack == null) {
      return;
    }
    if (!valid())
    {
      paramTIMCallBack.onError(6004, "invalid conversation");
      return;
    }
    getSession().deleteLocalMsg(null, new ˆˆ(this, paramTIMCallBack));
  }
  
  void fromSession(Session paramSession)
  {
    this.type = TIMConversationType.Invalid;
    if (paramSession != null) {
      if (paramSession.isValid()) {
        break label34;
      }
    }
    label34:
    for (this.type = TIMConversationType.Invalid;; this.type = TIMConversationType.getType(paramSession.type()))
    {
      setPeer(paramSession.sid());
      return;
    }
  }
  
  public String getIdentifer()
  {
    return this.identifer;
  }
  
  public List<TIMMessage> getLastMsgs(long paramLong)
  {
    Object localObject;
    if (!valid())
    {
      QLog.e("MSF.C.IMConversation", 1, "getLastMsgs, invalid conversation");
      localObject = null;
    }
    ArrayList localArrayList;
    MsgVec localMsgVec;
    do
    {
      return (List<TIMMessage>)localObject;
      localArrayList = new ArrayList();
      localMsgVec = getSession().getMsgsFromCache(paramLong);
      localObject = localArrayList;
    } while (localMsgVec == null);
    paramLong = localMsgVec.size();
    int i = 0;
    for (;;)
    {
      localObject = localArrayList;
      if (i >= paramLong) {
        break;
      }
      localArrayList.add(new TIMMessage(localMsgVec.get(i)));
      i += 1;
    }
  }
  
  public void getLocalMessage(int paramInt, TIMMessage paramTIMMessage, TIMValueCallBack<List<TIMMessage>> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    if (!valid())
    {
      paramTIMValueCallBack.onError(6004, "invalid conversation");
      return;
    }
    Msg localMsg = null;
    if (paramTIMMessage != null) {
      localMsg = paramTIMMessage.getMsg();
    }
    getSession().getLocalMsgs(paramInt, localMsg, new יי(this, paramTIMValueCallBack));
  }
  
  public void getMessage(int paramInt, TIMMessage paramTIMMessage, TIMValueCallBack<List<TIMMessage>> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    if (!valid())
    {
      paramTIMValueCallBack.onError(6004, "invalid conversation");
      return;
    }
    Msg localMsg = null;
    if (paramTIMMessage != null) {
      localMsg = paramTIMMessage.getMsg();
    }
    if (TIMManager.getInstanceById(this.identifer).getNetworkStatus() == TIMNetworkStatus.TIM_NETWORK_STATUS_DISCONNECTED)
    {
      QLog.d("MSF.C.IMConversation", 1, "network disconnected, get Msgs from local");
      getSession().getLocalMsgs(paramInt, localMsg, new ˏˏ(this, paramTIMValueCallBack));
      return;
    }
    getSession().getMsgs(paramInt, localMsg, new ˎˎ(this, paramTIMValueCallBack));
  }
  
  public void getMessageForward(int paramInt, TIMMessage paramTIMMessage, TIMValueCallBack<List<TIMMessage>> paramTIMValueCallBack)
  {
    if ((paramTIMValueCallBack == null) || (paramTIMMessage == null)) {
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    if (!valid())
    {
      paramTIMValueCallBack.onError(6004, "invalid conversation");
      return;
    }
    paramTIMMessage = paramTIMMessage.getMsg();
    getSession().getMsgsForward(paramInt, paramTIMMessage, new ˑˑ(this, paramTIMValueCallBack));
  }
  
  public String getPeer()
  {
    return this.peer;
  }
  
  Session getSession()
  {
    SessionType localSessionType = TIMConversationType.getType(this.type);
    Session localSession2 = TIMManager.getInstanceById(this.identifer).getCoreUser().getSession(localSessionType, this.peer);
    Session localSession1 = localSession2;
    if (!localSession2.isValid()) {
      localSession1 = TIMManager.getInstanceById(this.identifer).getCoreUser().newSession(localSessionType, this.peer);
    }
    return localSession1;
  }
  
  public TIMConversationType getType()
  {
    return this.type;
  }
  
  public long getUnreadMessageNum()
  {
    if (!IMCoreWrapper.get().isReady())
    {
      QLog.e("MSF.C.IMConversation", 1, "sdk not initialized");
      return 0L;
    }
    if (!valid())
    {
      QLog.e("MSF.C.IMConversation", 1, "invalid conversation");
      return 0L;
    }
    return getSession().msgUnread();
  }
  
  public int saveMessage(TIMMessage paramTIMMessage, String paramString, boolean paramBoolean)
  {
    int j = 6004;
    int i;
    if ((paramTIMMessage == null) || (paramTIMMessage.getMsg() == null) || (paramString == null) || (paramString.length() == 0)) {
      i = 6017;
    }
    Session localSession;
    do
    {
      do
      {
        do
        {
          return i;
          if (!IMCoreWrapper.get().isReady()) {
            return 6013;
          }
          i = j;
        } while (!valid());
        localSession = getSession();
        i = j;
      } while (localSession == null);
      i = j;
    } while (!localSession.isValid());
    return localSession.saveMsg(paramTIMMessage.getMsg(), paramString, paramBoolean);
  }
  
  public void sendLikeMessage(TIMMessage paramTIMMessage, TIMValueCallBack<TIMMessage> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if (paramTIMMessage == null)
    {
      paramTIMValueCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    if (!valid())
    {
      paramTIMValueCallBack.onError(6004, "invalid conversation");
      return;
    }
    paramTIMMessage.setConversation(this);
    getSession().sendLikeMsg(paramTIMMessage.getMsg(), new ˊˊ(this, paramTIMMessage, paramTIMValueCallBack));
  }
  
  public void sendMessage(TIMMessage paramTIMMessage, TIMValueCallBack<TIMMessage> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if (paramTIMMessage == null)
    {
      paramTIMValueCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    if (!valid())
    {
      paramTIMValueCallBack.onError(6004, "invalid conversation");
      return;
    }
    paramTIMMessage.setConversation(this);
    getSession().sendMsg(paramTIMMessage.getMsg(), new ــ(this, paramTIMMessage, paramTIMValueCallBack));
  }
  
  public void sendOnlineMessage(TIMMessage paramTIMMessage, TIMValueCallBack<TIMMessage> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if (paramTIMMessage == null)
    {
      paramTIMValueCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    if (!valid())
    {
      paramTIMValueCallBack.onError(6004, "invalid conversation");
      return;
    }
    paramTIMMessage.setConversation(this);
    getSession().sendCustomMsg(paramTIMMessage.getMsg(), new ˈˈ(this, paramTIMMessage, paramTIMValueCallBack), 0L);
  }
  
  public void sendRedPacketMessage(TIMMessage paramTIMMessage, TIMValueCallBack<TIMMessage> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if (paramTIMMessage == null)
    {
      paramTIMValueCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    if (!valid())
    {
      paramTIMValueCallBack.onError(6004, "invalid conversation");
      return;
    }
    paramTIMMessage.setConversation(this);
    getSession().sendRedPacketMsg(paramTIMMessage.getMsg(), new ˋˋ(this, paramTIMMessage, paramTIMValueCallBack));
  }
  
  public void setIdentifer(String paramString)
  {
    this.identifer = paramString;
  }
  
  void setPeer(String paramString)
  {
    this.peer = paramString;
  }
  
  public void setReadMessage()
  {
    if (!IMCoreWrapper.get().isReady())
    {
      QLog.e("MSF.C.IMConversation", 1, "sdk not initialized");
      return;
    }
    if (!valid())
    {
      QLog.e("MSF.C.IMConversation", 1, "invalid conversation");
      return;
    }
    getSession().reportReaded();
  }
  
  public void setReadMessage(TIMMessage paramTIMMessage)
  {
    if (!IMCoreWrapper.get().isReady())
    {
      QLog.e("MSF.C.IMConversation", 1, "sdk not initialized");
      return;
    }
    if (!valid())
    {
      QLog.e("MSF.C.IMConversation", 1, "invalid conversation");
      return;
    }
    getSession().reportReaded(paramTIMMessage.getMsg());
  }
  
  public void setReadMessage(TIMMessage paramTIMMessage, TIMCallBack paramTIMCallBack)
  {
    if (paramTIMCallBack == null) {
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMCallBack.onError(6013, "sdk not initialized");
      return;
    }
    if (!valid())
    {
      paramTIMCallBack.onError(6004, "invalid conversation");
      return;
    }
    getSession().reportReaded(paramTIMMessage.getMsg(), new ᵔᵔ(this, paramTIMCallBack));
  }
  
  void setType(TIMConversationType paramTIMConversationType)
  {
    this.type = paramTIMConversationType;
  }
  
  boolean valid()
  {
    return this.type != TIMConversationType.Invalid;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMConversation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */