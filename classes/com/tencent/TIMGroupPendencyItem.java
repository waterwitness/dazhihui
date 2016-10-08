package com.tencent;

import com.tencent.imcore.GroupManager;
import com.tencent.imcore.GroupPendencyItem;
import com.tencent.imcore.IMCoreUser;
import java.io.UnsupportedEncodingException;

public class TIMGroupPendencyItem
{
  private static final String tag = "TIMGroupPendencyItem";
  private long addTime;
  private byte[] auth;
  private String fromUser;
  private String groupId;
  private String handledMsg;
  private long handledStatus;
  private String handledUserData;
  private String identifer;
  private byte[] key;
  private long operationType;
  private long pendencyType;
  private String requestMsg;
  private String requestUserData;
  private String toUser;
  
  TIMGroupPendencyItem(GroupPendencyItem paramGroupPendencyItem)
  {
    this(TIMManager.getInstance().getIdentification(), paramGroupPendencyItem);
  }
  
  TIMGroupPendencyItem(String paramString, GroupPendencyItem paramGroupPendencyItem)
  {
    this.identifer = paramString;
    if (paramGroupPendencyItem == null) {
      return;
    }
    this.groupId = paramGroupPendencyItem.getGroup_id();
    this.fromUser = paramGroupPendencyItem.getFrom_id();
    this.toUser = paramGroupPendencyItem.getTo_id();
    this.addTime = paramGroupPendencyItem.getAdd_time();
    this.pendencyType = paramGroupPendencyItem.getPendency_type();
    this.handledStatus = paramGroupPendencyItem.getHandled();
    this.operationType = paramGroupPendencyItem.getHandle_result();
    try
    {
      this.requestMsg = new String(paramGroupPendencyItem.getApply_invite_msg(), "utf-8");
      this.requestUserData = new String(paramGroupPendencyItem.getFrom_user_defined_data(), "utf-8");
      this.handledMsg = new String(paramGroupPendencyItem.getApproval_msg(), "utf-8");
      this.handledUserData = new String(paramGroupPendencyItem.getTo_user_defined_data(), "utf-8");
      this.key = paramGroupPendencyItem.getKey();
      this.auth = paramGroupPendencyItem.getAuthentication();
      return;
    }
    catch (UnsupportedEncodingException paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
      }
    }
  }
  
  private String getHandledUserData()
  {
    return this.handledUserData;
  }
  
  private String getRequestUserData()
  {
    return this.requestUserData;
  }
  
  public void accept(String paramString, TIMCallBack paramTIMCallBack)
  {
    paramTIMCallBack = new ˆˉ(this, paramTIMCallBack);
    if (paramString != null) {}
    for (;;)
    {
      try
      {
        if (getPendencyType() == TIMGroupPendencyGetType.APPLY_BY_SELF)
        {
          TIMManager.getInstanceById(this.identifer).getCoreUser().getGroupMgr().handleJoinRequest(this.groupId, this.fromUser, paramString.getBytes("utf-8"), "".getBytes("utf-8"), 1L, 0L, this.auth, paramTIMCallBack);
          return;
        }
        if (getPendencyType() != TIMGroupPendencyGetType.INVITED_BY_OTHER) {
          break;
        }
        TIMManager.getInstanceById(this.identifer).getCoreUser().getGroupMgr().handleInviteRequest(this.groupId, this.fromUser, paramString.getBytes("utf-8"), "".getBytes("utf-8"), 1L, 0L, this.auth, paramTIMCallBack);
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
  
  public long getAddTime()
  {
    return this.addTime / 1000L;
  }
  
  public String getFromUser()
  {
    return this.fromUser;
  }
  
  public String getGroupId()
  {
    return this.groupId;
  }
  
  public String getHandledMsg()
  {
    return this.handledMsg;
  }
  
  public TIMGroupPendencyHandledStatus getHandledStatus()
  {
    if (this.handledStatus == TIMGroupPendencyHandledStatus.NOT_HANDLED.getValue()) {
      return TIMGroupPendencyHandledStatus.NOT_HANDLED;
    }
    if (this.handledStatus == TIMGroupPendencyHandledStatus.HANDLED_BY_SELF.getValue()) {
      return TIMGroupPendencyHandledStatus.HANDLED_BY_SELF;
    }
    if (this.handledStatus == TIMGroupPendencyHandledStatus.HANDLED_BY_OTHER.getValue()) {
      return TIMGroupPendencyHandledStatus.HANDLED_BY_OTHER;
    }
    return TIMGroupPendencyHandledStatus.NOT_HANDLED;
  }
  
  public TIMGroupPendencyOperationType getOperationType()
  {
    if (this.operationType == TIMGroupPendencyOperationType.ACCEPT.getValue()) {
      return TIMGroupPendencyOperationType.ACCEPT;
    }
    if (this.operationType == TIMGroupPendencyOperationType.REFUSE.getValue()) {
      return TIMGroupPendencyOperationType.REFUSE;
    }
    return TIMGroupPendencyOperationType.REFUSE;
  }
  
  public TIMGroupPendencyGetType getPendencyType()
  {
    if (this.pendencyType == TIMGroupPendencyGetType.APPLY_BY_SELF.getValue()) {
      return TIMGroupPendencyGetType.APPLY_BY_SELF;
    }
    if (this.pendencyType == TIMGroupPendencyGetType.INVITED_BY_OTHER.getValue()) {
      return TIMGroupPendencyGetType.INVITED_BY_OTHER;
    }
    if (this.pendencyType == TIMGroupPendencyGetType.BOTH_SELFAPPLY_AND_INVITED.getValue()) {
      return TIMGroupPendencyGetType.BOTH_SELFAPPLY_AND_INVITED;
    }
    return TIMGroupPendencyGetType.APPLY_BY_SELF;
  }
  
  public String getRequestMsg()
  {
    return this.requestMsg;
  }
  
  public String getToUser()
  {
    return this.toUser;
  }
  
  public void refuse(String paramString, TIMCallBack paramTIMCallBack)
  {
    paramTIMCallBack = new ˆˊ(this, paramTIMCallBack);
    if (paramString != null) {}
    for (;;)
    {
      try
      {
        if (getPendencyType() == TIMGroupPendencyGetType.APPLY_BY_SELF)
        {
          TIMManager.getInstanceById(this.identifer).getCoreUser().getGroupMgr().handleJoinRequest(this.groupId, this.fromUser, paramString.getBytes("utf-8"), "".getBytes("utf-8"), 0L, 0L, this.auth, paramTIMCallBack);
          return;
        }
        if (getPendencyType() != TIMGroupPendencyGetType.INVITED_BY_OTHER) {
          break;
        }
        TIMManager.getInstanceById(this.identifer).getCoreUser().getGroupMgr().handleInviteRequest(this.groupId, this.fromUser, paramString.getBytes("utf-8"), "".getBytes("utf-8"), 0L, 0L, this.auth, paramTIMCallBack);
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
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGroupPendencyItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */