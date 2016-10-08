package com.tencent;

import com.tencent.imcore.GroupManager;
import com.tencent.imcore.GroupReportElem;
import com.tencent.imcore.IMCoreUser;
import java.io.UnsupportedEncodingException;

public class TIMGroupSystemElem
  extends TIMElem
{
  private byte[] authKey;
  private String groupId = "";
  private long msgKey;
  private TIMGroupMemberInfo opGroupMemberInfo;
  private String opReason = "";
  private String opUser = "";
  private TIMUserProfile opUserInfo;
  private String platform = "";
  private long subtype;
  private byte[] userData = null;
  
  public TIMGroupSystemElem()
  {
    this.type = TIMElemType.GroupSystem;
  }
  
  public TIMGroupSystemElem(GroupReportElem paramGroupReportElem)
  {
    this.type = TIMElemType.GroupSystem;
    setAuthKey(paramGroupReportElem.getAuthentication());
    setGroupId(paramGroupReportElem.getGroup());
    setMsgKey(paramGroupReportElem.getMsg_key());
    try
    {
      setOpReason(new String(paramGroupReportElem.getMsg(), "utf-8"));
      setPlatform(new String(paramGroupReportElem.getPlatform(), "utf-8"));
      setSubtype(paramGroupReportElem.getType());
      setOpUser(paramGroupReportElem.getOperator_user());
      setUserData(paramGroupReportElem.getUser_data());
      setOpUserInfo(new TIMUserProfile(paramGroupReportElem.getOperator_user_info()));
      setOpGroupMemberInfo(new TIMGroupMemberInfo(paramGroupReportElem.getOperator_group_member_info()));
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        localUnsupportedEncodingException.printStackTrace();
      }
    }
  }
  
  public void accept(String paramString, TIMCallBack paramTIMCallBack)
  {
    paramTIMCallBack = new ˆˋ(this, paramTIMCallBack);
    if (paramString != null) {}
    for (;;)
    {
      try
      {
        if (getSubtype() == TIMGroupSystemElemType.TIM_GROUP_SYSTEM_ADD_GROUP_REQUEST_TYPE)
        {
          TIMManager.getInstance().getCoreUser().getGroupMgr().handleJoinRequest(this.groupId, this.opUser, paramString.getBytes("utf-8"), "".getBytes("utf-8"), 1L, this.msgKey, this.authKey, paramTIMCallBack);
          return;
        }
        if (getSubtype() != TIMGroupSystemElemType.TIM_GROUP_SYSTEM_INVITE_TO_GROUP_REQUEST_TYPE) {
          break;
        }
        TIMManager.getInstance().getCoreUser().getGroupMgr().handleInviteRequest(this.groupId, this.opUser, paramString.getBytes("utf-8"), "".getBytes("utf-8"), 1L, this.msgKey, this.authKey, paramTIMCallBack);
        return;
      }
      catch (UnsupportedEncodingException paramString)
      {
        paramString.printStackTrace();
        return;
      }
      paramString = "";
    }
  }
  
  public String getGroupId()
  {
    return this.groupId;
  }
  
  public TIMGroupMemberInfo getOpGroupMemberInfo()
  {
    return this.opGroupMemberInfo;
  }
  
  public String getOpReason()
  {
    return this.opReason;
  }
  
  public String getOpUser()
  {
    return this.opUser;
  }
  
  public TIMUserProfile getOpUserInfo()
  {
    return this.opUserInfo;
  }
  
  public String getPlatform()
  {
    return this.platform;
  }
  
  public TIMGroupSystemElemType getSubtype()
  {
    TIMGroupSystemElemType[] arrayOfTIMGroupSystemElemType = TIMGroupSystemElemType.values();
    int j = arrayOfTIMGroupSystemElemType.length;
    int i = 0;
    while (i < j)
    {
      TIMGroupSystemElemType localTIMGroupSystemElemType = arrayOfTIMGroupSystemElemType[i];
      if (this.subtype == localTIMGroupSystemElemType.getValue()) {
        return localTIMGroupSystemElemType;
      }
      i += 1;
    }
    return TIMGroupSystemElemType.INVALID;
  }
  
  public byte[] getUserData()
  {
    return this.userData;
  }
  
  public void refuse(String paramString, TIMCallBack paramTIMCallBack)
  {
    paramTIMCallBack = new ˆˎ(this, paramTIMCallBack);
    if (paramString != null) {}
    for (;;)
    {
      try
      {
        if (getSubtype() == TIMGroupSystemElemType.TIM_GROUP_SYSTEM_ADD_GROUP_REQUEST_TYPE)
        {
          TIMManager.getInstance().getCoreUser().getGroupMgr().handleJoinRequest(this.groupId, this.opUser, paramString.getBytes("utf-8"), "".getBytes("utf-8"), 0L, this.msgKey, this.authKey, paramTIMCallBack);
          return;
        }
        if (getSubtype() != TIMGroupSystemElemType.TIM_GROUP_SYSTEM_INVITE_TO_GROUP_REQUEST_TYPE) {
          break;
        }
        TIMManager.getInstance().getCoreUser().getGroupMgr().handleInviteRequest(this.groupId, this.opUser, paramString.getBytes("utf-8"), "".getBytes("utf-8"), 0L, this.msgKey, this.authKey, paramTIMCallBack);
        return;
      }
      catch (UnsupportedEncodingException paramString)
      {
        paramString.printStackTrace();
        return;
      }
      paramString = "";
    }
  }
  
  void setAuthKey(byte[] paramArrayOfByte)
  {
    this.authKey = paramArrayOfByte;
  }
  
  void setGroupId(String paramString)
  {
    this.groupId = paramString;
  }
  
  void setMsgKey(long paramLong)
  {
    this.msgKey = paramLong;
  }
  
  void setOpGroupMemberInfo(TIMGroupMemberInfo paramTIMGroupMemberInfo)
  {
    this.opGroupMemberInfo = paramTIMGroupMemberInfo;
  }
  
  void setOpReason(String paramString)
  {
    this.opReason = paramString;
  }
  
  void setOpUser(String paramString)
  {
    this.opUser = paramString;
  }
  
  void setOpUserInfo(TIMUserProfile paramTIMUserProfile)
  {
    this.opUserInfo = paramTIMUserProfile;
  }
  
  void setPlatform(String paramString)
  {
    this.platform = paramString;
  }
  
  void setSubtype(long paramLong)
  {
    this.subtype = paramLong;
  }
  
  void setUserData(byte[] paramArrayOfByte)
  {
    this.userData = paramArrayOfByte;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGroupSystemElem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */