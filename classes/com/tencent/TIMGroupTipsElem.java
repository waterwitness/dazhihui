package com.tencent;

import com.tencent.imcore.BytesMemberInfoParser;
import com.tencent.imcore.BytesProfileMapParser;
import com.tencent.imcore.GroupInfoChangeType;
import com.tencent.imcore.GroupTipsElem;
import com.tencent.imcore.GroupTipsElem_GroupInfo;
import com.tencent.imcore.GroupTipsElem_GroupInfoVec;
import com.tencent.imcore.GroupTipsElem_MemberInfo;
import com.tencent.imcore.GroupTipsElem_MemberInfoVec;
import com.tencent.imcore.StrVec;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TIMGroupTipsElem
  extends TIMElem
{
  private Map<String, TIMGroupMemberInfo> changedGroupMemberInfo = new HashMap();
  private Map<String, TIMUserProfile> changedUserInfo = new HashMap();
  private String groupId;
  private List<TIMGroupTipsElemGroupInfo> groupInfoList = new ArrayList();
  private String groupName;
  private List<TIMGroupTipsElemMemberInfo> memberInfoList = new ArrayList();
  private TIMGroupMemberInfo opGroupMemberInfo;
  private String opUser;
  private TIMUserProfile opUserInfo;
  private String platform = "";
  private TIMGroupTipsType tipsType;
  private List<String> userList = new ArrayList();
  
  public TIMGroupTipsElem()
  {
    this.type = TIMElemType.GroupTips;
  }
  
  TIMGroupTipsElem(GroupTipsElem paramGroupTipsElem)
  {
    this.type = TIMElemType.GroupTips;
    Object localObject1 = TIMGroupTipsType.Join;
    switch (paramGroupTipsElem.getType())
    {
    }
    Object localObject2;
    label208:
    label483:
    label497:
    for (;;)
    {
      setOpUser(paramGroupTipsElem.getOp_user());
      setTipsType((TIMGroupTipsType)localObject1);
      localObject2 = "";
      try
      {
        localObject1 = new String(paramGroupTipsElem.getGroup_name(), "utf-8");
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        for (;;)
        {
          String str1;
          Object localObject3;
          String str2 = "";
          localObject1 = localObject2;
          localObject2 = str2;
          localUnsupportedEncodingException1.printStackTrace();
          Object localObject4 = localObject2;
          localObject2 = "";
        }
        setOpUserInfo(new TIMUserProfile(paramGroupTipsElem.getOp_user_info()));
        setOpGroupMemberInfo(new TIMGroupMemberInfo(paramGroupTipsElem.getOp_group_member_info()));
        localObject1 = new BytesProfileMapParser();
        ((BytesProfileMapParser)localObject1).fetchMapKeys(paramGroupTipsElem.getChanged_user_info());
        int i = 0;
        while (i < ((BytesProfileMapParser)localObject1).getKeys().size())
        {
          localObject2 = new TIMUserProfile(((BytesProfileMapParser)localObject1).getValue(paramGroupTipsElem.getChanged_user_info(), i));
          getChangedUserInfo().put(((TIMUserProfile)localObject2).getIdentifier(), localObject2);
          i += 1;
        }
        localObject1 = new BytesMemberInfoParser();
        ((BytesMemberInfoParser)localObject1).fetchMapKeys(paramGroupTipsElem.getChanged_group_member_info());
        i = j;
        while (i < ((BytesMemberInfoParser)localObject1).getKeys().size())
        {
          localObject2 = new TIMGroupMemberInfo(((BytesMemberInfoParser)localObject1).getValue(paramGroupTipsElem.getChanged_group_member_info(), i));
          getChangedGroupMemberInfo().put(((TIMGroupMemberInfo)localObject2).getUser(), localObject2);
          i += 1;
        }
        return;
      }
      try
      {
        localObject2 = new String(paramGroupTipsElem.getGroup_id(), "utf-8");
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException2)
      {
        localObject2 = "";
        break label483;
      }
      try
      {
        str1 = new String(paramGroupTipsElem.getPlatform(), "utf-8");
        localObject3 = localObject2;
        localObject2 = str1;
        setGroupName((String)localObject1);
        setGroupId((String)localObject3);
        setPlatform((String)localObject2);
        i = 0;
        if (i >= paramGroupTipsElem.getUser_list().size()) {
          break label497;
        }
        getUserList().add(paramGroupTipsElem.getUser_list().get(i));
        i += 1;
        break label208;
        localObject1 = TIMGroupTipsType.Join;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException3)
      {
        break label483;
      }
      localObject1 = TIMGroupTipsType.Quit;
      continue;
      localObject1 = TIMGroupTipsType.Kick;
      continue;
      localObject1 = TIMGroupTipsType.SetAdmin;
      continue;
      localObject1 = TIMGroupTipsType.CancelAdmin;
      continue;
      localObject1 = TIMGroupTipsType.ModifyGroupInfo;
      localObject2 = paramGroupTipsElem.getGroup_change_list();
      i = 0;
      for (;;)
      {
        if (i < ((GroupTipsElem_GroupInfoVec)localObject2).size())
        {
          localObject3 = new TIMGroupTipsElemGroupInfo();
          ((TIMGroupTipsElemGroupInfo)localObject3).setType(((GroupTipsElem_GroupInfoVec)localObject2).get(i).getType().swigValue());
          try
          {
            ((TIMGroupTipsElemGroupInfo)localObject3).setContent(new String(((GroupTipsElem_GroupInfoVec)localObject2).get(i).getValue(), "utf-8"));
            getGroupInfoList().add(localObject3);
            i += 1;
          }
          catch (UnsupportedEncodingException localUnsupportedEncodingException4)
          {
            for (;;)
            {
              localUnsupportedEncodingException4.printStackTrace();
            }
          }
        }
      }
      continue;
      localObject1 = TIMGroupTipsType.ModifyMemberInfo;
      localObject2 = paramGroupTipsElem.getMember_change_list();
      i = 0;
      while (i < ((GroupTipsElem_MemberInfoVec)localObject2).size())
      {
        localObject3 = new TIMGroupTipsElemMemberInfo();
        ((TIMGroupTipsElemMemberInfo)localObject3).setIdentifier(((GroupTipsElem_MemberInfoVec)localObject2).get(i).getIdentifier());
        ((TIMGroupTipsElemMemberInfo)localObject3).setShutupTime(((GroupTipsElem_MemberInfoVec)localObject2).get(i).getShutup_time());
        getMemberInfoList().add(localObject3);
        i += 1;
      }
    }
  }
  
  public Map<String, TIMGroupMemberInfo> getChangedGroupMemberInfo()
  {
    return this.changedGroupMemberInfo;
  }
  
  public Map<String, TIMUserProfile> getChangedUserInfo()
  {
    return this.changedUserInfo;
  }
  
  public String getGroupId()
  {
    return this.groupId;
  }
  
  public List<TIMGroupTipsElemGroupInfo> getGroupInfoList()
  {
    return this.groupInfoList;
  }
  
  public String getGroupName()
  {
    return this.groupName;
  }
  
  public List<TIMGroupTipsElemMemberInfo> getMemberInfoList()
  {
    return this.memberInfoList;
  }
  
  public TIMGroupMemberInfo getOpGroupMemberInfo()
  {
    return this.opGroupMemberInfo;
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
  
  public TIMGroupTipsType getTipsType()
  {
    return this.tipsType;
  }
  
  public List<String> getUserList()
  {
    return this.userList;
  }
  
  void setGroupId(String paramString)
  {
    this.groupId = paramString;
  }
  
  void setGroupName(String paramString)
  {
    this.groupName = paramString;
  }
  
  void setOpGroupMemberInfo(TIMGroupMemberInfo paramTIMGroupMemberInfo)
  {
    this.opGroupMemberInfo = paramTIMGroupMemberInfo;
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
  
  void setTipsType(TIMGroupTipsType paramTIMGroupTipsType)
  {
    this.tipsType = paramTIMGroupTipsType;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGroupTipsElem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */