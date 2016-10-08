package com.tencent;

import android.text.TextUtils;
import com.tencent.imcore.BytesMap;
import com.tencent.imcore.BytesVec;
import com.tencent.imcore.ComStatus;
import com.tencent.imcore.GetGroupBaseInfoOption;
import com.tencent.imcore.GroupManager;
import com.tencent.imcore.GroupMemRoleFilter;
import com.tencent.imcore.IMCoreUser;
import com.tencent.imcore.ModifyGroupBaseInfoOption;
import com.tencent.imcore.ModifyGroupFlag;
import com.tencent.imcore.ModifyGroupMemberFlag;
import com.tencent.imcore.ModifyGroupMemberInfoOption;
import com.tencent.imcore.NewGroupInfo;
import com.tencent.imcore.NewGroupMemVec;
import com.tencent.imcore.NewGroupMemberInfo;
import com.tencent.imcore.StrVec;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class TIMGroupManager
{
  public static final int TIM_GET_GROUP_BASE_INFO_FLAG_ADD_OPTION = 8192;
  public static final int TIM_GET_GROUP_BASE_INFO_FLAG_APP_ID = 128;
  public static final int TIM_GET_GROUP_BASE_INFO_FLAG_CREATE_TIME = 2;
  public static final int TIM_GET_GROUP_BASE_INFO_FLAG_FACE_URL = 4096;
  public static final int TIM_GET_GROUP_BASE_INFO_FLAG_GROUP_TYPE = 16384;
  public static final int TIM_GET_GROUP_BASE_INFO_FLAG_INTRODUCTION = 2048;
  public static final int TIM_GET_GROUP_BASE_INFO_FLAG_LAST_MSG = 32768;
  public static final int TIM_GET_GROUP_BASE_INFO_FLAG_LAST_MSG_TIME = 64;
  public static final int TIM_GET_GROUP_BASE_INFO_FLAG_MAX_MEMBER_NUM = 512;
  public static final int TIM_GET_GROUP_BASE_INFO_FLAG_MEMBER_NUM = 256;
  public static final int TIM_GET_GROUP_BASE_INFO_FLAG_NAME = 1;
  public static final int TIM_GET_GROUP_BASE_INFO_FLAG_NEXT_MSG_SEQ = 32;
  public static final int TIM_GET_GROUP_BASE_INFO_FLAG_NOTIFICATION = 1024;
  public static final int TIM_GET_GROUP_BASE_INFO_FLAG_OWNER_UIN = 4;
  public static final int TIM_GET_GROUP_BASE_INFO_FLAG_SEQ = 8;
  public static final int TIM_GET_GROUP_BASE_INFO_FLAG_TIME = 16;
  public static final int TIM_GET_GROUP_MEM_INFO_FLAG_JOIN_TIME = 1;
  public static final int TIM_GET_GROUP_MEM_INFO_FLAG_MSG_FLAG = 2;
  public static final int TIM_GET_GROUP_MEM_INFO_FLAG_NAME_CARD = 32;
  public static final int TIM_GET_GROUP_MEM_INFO_FLAG_ROLE_INFO = 8;
  public static final int TIM_GET_GROUP_MEM_INFO_FLAG_SHUTUP_TIME = 16;
  static String defaultId = "";
  static ConcurrentHashMap<String, TIMGroupManager> mutiMap = new ConcurrentHashMap();
  private static final String tag = "MSF.C.TIMGroupManager";
  private String identifier = "";
  
  private TIMGroupManager(String paramString)
  {
    this.identifier = paramString;
  }
  
  private GroupManager getGroupManager()
  {
    if (TextUtils.isEmpty(this.identifier)) {
      return TIMManager.getInstance().getCoreUser().getGroupMgr();
    }
    return TIMManager.getInstanceById(this.identifier).getCoreUser().getGroupMgr();
  }
  
  public static TIMGroupManager getInstance()
  {
    return getInstanceById(TIMManager.getInstance().getIdentification());
  }
  
  public static TIMGroupManager getInstanceById(String paramString)
  {
    return new TIMGroupManager(paramString);
  }
  
  public void applyJoinGroup(String paramString1, String paramString2, TIMCallBack paramTIMCallBack)
  {
    if (paramTIMCallBack == null) {
      return;
    }
    if ((paramString1 == null) || (paramString2 == null))
    {
      paramTIMCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramTIMCallBack = new ʿˎ(this, paramTIMCallBack);
    getGroupManager().applyJoinGroup(paramString1, paramString2, paramTIMCallBack);
  }
  
  public void createAVChatroomGroup(String paramString, TIMValueCallBack<String> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if (paramString == null)
    {
      paramTIMValueCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    Object localObject = null;
    try
    {
      paramString = paramString.getBytes("UTF-8");
      getGroupManager().createGroup("AVChatRoom", new StrVec(), paramString, new ʾˋ(this, paramTIMValueCallBack));
      return;
    }
    catch (UnsupportedEncodingException paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
        paramString = (String)localObject;
      }
    }
  }
  
  public void createGroup(TIMGroupManager.CreateGroupParam paramCreateGroupParam, TIMValueCallBack<String> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if ((paramCreateGroupParam == null) || (paramCreateGroupParam.groupType == null) || (paramCreateGroupParam.groupName == null))
    {
      paramTIMValueCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    NewGroupInfo localNewGroupInfo = new NewGroupInfo();
    localNewGroupInfo.setGroup_type(paramCreateGroupParam.groupType);
    try
    {
      localNewGroupInfo.setGroup_name(paramCreateGroupParam.groupName.getBytes("utf-8"));
      if (paramCreateGroupParam.groupId != null) {
        localNewGroupInfo.setGroup_id(paramCreateGroupParam.groupId.getBytes("utf-8"));
      }
      if (paramCreateGroupParam.notification != null) {
        localNewGroupInfo.setNotification(paramCreateGroupParam.notification.getBytes("utf-8"));
      }
      if (paramCreateGroupParam.introduction != null) {
        localNewGroupInfo.setIntroduction(paramCreateGroupParam.introduction.getBytes("utf-8"));
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException1)
    {
      Object localObject1;
      for (;;)
      {
        BytesMap localBytesMap1;
        localUnsupportedEncodingException1.printStackTrace();
      }
      localNewGroupInfo.setBase_custom_info(localUnsupportedEncodingException1);
      if (paramCreateGroupParam.members == null) {
        break label525;
      }
      NewGroupMemVec localNewGroupMemVec = new NewGroupMemVec();
      paramCreateGroupParam = paramCreateGroupParam.members.iterator();
      while (paramCreateGroupParam.hasNext())
      {
        Object localObject2 = (TIMGroupMemberInfo)paramCreateGroupParam.next();
        localObject1 = new NewGroupMemberInfo();
        ((NewGroupMemberInfo)localObject1).setIdentifier(((TIMGroupMemberInfo)localObject2).getUser());
        ((NewGroupMemberInfo)localObject1).setMember_role((int)((TIMGroupMemberInfo)localObject2).getRole().getValue());
        if (((TIMGroupMemberInfo)localObject2).getCustomInfo().size() > 0)
        {
          BytesMap localBytesMap2 = new BytesMap();
          localObject2 = ((TIMGroupMemberInfo)localObject2).getCustomInfo().entrySet().iterator();
          while (((Iterator)localObject2).hasNext())
          {
            Map.Entry localEntry2 = (Map.Entry)((Iterator)localObject2).next();
            try
            {
              localBytesMap2.set(((String)localEntry2.getKey()).getBytes("utf-8"), (byte[])localEntry2.getValue());
            }
            catch (UnsupportedEncodingException localUnsupportedEncodingException3)
            {
              localUnsupportedEncodingException3.printStackTrace();
            }
          }
          ((NewGroupMemberInfo)localObject1).setCustom_info(localBytesMap2);
        }
        localNewGroupMemVec.pushBack((NewGroupMemberInfo)localObject1);
      }
      localNewGroupInfo.setGroup_members(localNewGroupMemVec);
      label525:
      TIMManager.getInstanceById(this.identifier).getCoreUser().getGroupMgr().createGroup(localNewGroupInfo, new ʽﹳ(this, paramTIMValueCallBack));
    }
    if (paramCreateGroupParam.faceUrl != null) {
      localNewGroupInfo.setFace_url(paramCreateGroupParam.faceUrl);
    }
    if (paramCreateGroupParam.addOption != null)
    {
      localNewGroupInfo.setSet_add_option(true);
      localNewGroupInfo.setAdd_option(paramCreateGroupParam.addOption.ordinal());
    }
    if (paramCreateGroupParam.maxMemberNum != 0L) {
      localNewGroupInfo.setMax_member_num(paramCreateGroupParam.maxMemberNum);
    }
    if (paramCreateGroupParam.customInfo.size() > 0)
    {
      localBytesMap1 = new BytesMap();
      localObject1 = paramCreateGroupParam.customInfo.entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Map.Entry localEntry1 = (Map.Entry)((Iterator)localObject1).next();
        try
        {
          localBytesMap1.set(((String)localEntry1.getKey()).getBytes("utf-8"), (byte[])localEntry1.getValue());
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          localUnsupportedEncodingException2.printStackTrace();
        }
      }
    }
  }
  
  public void createGroup(String paramString1, List<String> paramList, String paramString2, TIMValueCallBack<String> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if ((paramString1 == null) || (paramList == null) || (paramString2 == null))
    {
      paramTIMValueCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    StrVec localStrVec = new StrVec();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      if (!TextUtils.isEmpty(str)) {
        localStrVec.pushBack(str);
      }
    }
    paramTIMValueCallBack = new ʾᵢ(this, paramTIMValueCallBack);
    paramList = null;
    try
    {
      paramString2 = paramString2.getBytes("UTF-8");
      paramList = paramString2;
    }
    catch (UnsupportedEncodingException paramString2)
    {
      for (;;)
      {
        paramString2.printStackTrace();
      }
    }
    getGroupManager().createGroup(paramString1, localStrVec, paramList, paramTIMValueCallBack);
  }
  
  public void createGroup(String paramString1, List<String> paramList, String paramString2, String paramString3, TIMValueCallBack<String> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if ((paramString1 == null) || (paramList == null) || (paramString2 == null) || (paramString3 == null))
    {
      paramTIMValueCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    NewGroupMemVec localNewGroupMemVec = new NewGroupMemVec();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      NewGroupMemberInfo localNewGroupMemberInfo = new NewGroupMemberInfo();
      localNewGroupMemberInfo.setIdentifier(str);
      localNewGroupMemVec.pushBack(localNewGroupMemberInfo);
    }
    paramList = new ʿˆ(this, paramTIMValueCallBack);
    paramTIMValueCallBack = new NewGroupInfo();
    try
    {
      paramTIMValueCallBack.setGroup_name(paramString2.getBytes("utf-8"));
      paramTIMValueCallBack.setGroup_id(paramString3.getBytes("utf-8"));
      paramTIMValueCallBack.setGroup_type(paramString1);
      paramTIMValueCallBack.setGroup_members(localNewGroupMemVec);
      getGroupManager().createGroup(paramTIMValueCallBack, paramList);
      return;
    }
    catch (UnsupportedEncodingException paramString2)
    {
      for (;;)
      {
        paramString2.printStackTrace();
      }
    }
  }
  
  public void deleteGroup(String paramString, TIMCallBack paramTIMCallBack)
  {
    if (paramTIMCallBack == null) {
      return;
    }
    if (paramString == null)
    {
      paramTIMCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramTIMCallBack = new ʿˈ(this, paramTIMCallBack);
    getGroupManager().deleteGroup(paramString, paramTIMCallBack);
  }
  
  public void deleteGroupMember(String paramString, List<String> paramList, TIMValueCallBack<List<TIMGroupMemberResult>> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if ((paramString == null) || (paramList == null))
    {
      paramTIMValueCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramTIMValueCallBack = new ʿˉ(this, paramTIMValueCallBack);
    StrVec localStrVec = new StrVec();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      if (!TextUtils.isEmpty(str)) {
        localStrVec.pushBack(str);
      }
    }
    getGroupManager().deleteGroupMember(paramString, localStrVec, paramTIMValueCallBack);
  }
  
  public void deleteGroupMemberWithReason(String paramString1, String paramString2, List<String> paramList, TIMValueCallBack<List<TIMGroupMemberResult>> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if ((paramString1 == null) || (paramList == null))
    {
      paramTIMValueCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramTIMValueCallBack = new ʿˊ(this, paramTIMValueCallBack);
    StrVec localStrVec = new StrVec();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      if (!TextUtils.isEmpty(str)) {
        localStrVec.pushBack(str);
      }
    }
    paramList = null;
    try
    {
      paramString2 = paramString2.getBytes("utf-8");
      getGroupManager().deleteGroupMember(paramString1, localStrVec, paramTIMValueCallBack, paramString2);
      return;
    }
    catch (Exception paramString2)
    {
      for (;;)
      {
        paramString2.printStackTrace();
        paramString2 = paramList;
      }
    }
  }
  
  public void getGroupDetailInfo(List<String> paramList, TIMValueCallBack<List<TIMGroupDetailInfo>> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if (paramList == null)
    {
      paramTIMValueCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramTIMValueCallBack = new ʾˏ(this, paramTIMValueCallBack);
    StrVec localStrVec = new StrVec();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      if (!TextUtils.isEmpty(str)) {
        localStrVec.pushBack(str);
      }
    }
    getGroupManager().getGroupBaseInfo(localStrVec, paramTIMValueCallBack);
  }
  
  public void getGroupFTDetailInfo(List<String> paramList, TIMValueCallBack<List<TIMGroupDetailInfo>> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if (paramList == null)
    {
      paramTIMValueCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramTIMValueCallBack = new ʾˑ(this, paramTIMValueCallBack);
    GetGroupBaseInfoOption localGetGroupBaseInfoOption = new GetGroupBaseInfoOption();
    localGetGroupBaseInfoOption.setFlag(-1L);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      if (!TextUtils.isEmpty(str)) {
        localGetGroupBaseInfoOption.getGroups().pushBack(str);
      }
    }
    getGroupManager().getGroupBaseInfo(localGetGroupBaseInfoOption, paramTIMValueCallBack);
  }
  
  public void getGroupList(TIMValueCallBack<List<TIMGroupBaseInfo>> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramTIMValueCallBack = new ʽﾞ(this, paramTIMValueCallBack);
    getGroupManager().getGroupList(false, paramTIMValueCallBack);
  }
  
  public void getGroupMembers(String paramString, TIMValueCallBack<List<TIMGroupMemberInfo>> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if (paramString == null)
    {
      paramTIMValueCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramTIMValueCallBack = new ʾﹳ(this, paramTIMValueCallBack);
    getGroupManager().getGroupMembers(paramString, paramTIMValueCallBack);
  }
  
  public void getGroupMembersByFilter(String paramString, long paramLong1, TIMGroupMemberRoleFilter paramTIMGroupMemberRoleFilter, List<String> paramList, long paramLong2, TIMValueCallBack<TIMGroupMemberSuccV2> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if ((paramString == null) || (paramTIMGroupMemberRoleFilter == null))
    {
      paramTIMValueCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramTIMValueCallBack = new ʿʻ(this, paramTIMValueCallBack);
    BytesVec localBytesVec = new BytesVec();
    if (paramList != null)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        String str = (String)paramList.next();
        try
        {
          localBytesVec.pushBack(str.getBytes("utf-8"));
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          localUnsupportedEncodingException.printStackTrace();
        }
      }
    }
    paramList = GroupMemRoleFilter.kGroupMemberAll;
    if (paramTIMGroupMemberRoleFilter == TIMGroupMemberRoleFilter.Owner) {
      paramList = GroupMemRoleFilter.kGroupMemRoleOwner;
    }
    for (;;)
    {
      getGroupManager().getGroupMembersByFilter(paramString, paramLong1, paramList, localBytesVec, paramLong2, paramTIMValueCallBack);
      return;
      if (paramTIMGroupMemberRoleFilter == TIMGroupMemberRoleFilter.Admin) {
        paramList = GroupMemRoleFilter.kGroupMemRoleAdmin;
      } else if (paramTIMGroupMemberRoleFilter == TIMGroupMemberRoleFilter.Normal) {
        paramList = GroupMemRoleFilter.kGroupMemRoleCommon_member;
      }
    }
  }
  
  public void getGroupMembersInfo(String paramString, List<String> paramList, TIMValueCallBack<List<TIMGroupMemberInfo>> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if ((TextUtils.isEmpty(paramString)) || (paramList == null) || (paramList.size() == 0))
    {
      paramTIMValueCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramTIMValueCallBack = new ʾﹶ(this, paramTIMValueCallBack);
    StrVec localStrVec = new StrVec();
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localStrVec.pushBack((String)paramList.next());
    }
    getGroupManager().getGroupMembersInfo(paramString, localStrVec, paramTIMValueCallBack);
  }
  
  public void getGroupMembersV2(String paramString, long paramLong1, List<String> paramList, long paramLong2, TIMValueCallBack<TIMGroupMemberSuccV2> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if (paramString == null)
    {
      paramTIMValueCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramTIMValueCallBack = new ʾﾞ(this, paramTIMValueCallBack);
    BytesVec localBytesVec = new BytesVec();
    if (paramList != null)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        String str = (String)paramList.next();
        try
        {
          localBytesVec.pushBack(str.getBytes("utf-8"));
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          localUnsupportedEncodingException.printStackTrace();
        }
      }
    }
    getGroupManager().getGroupMembersV2(paramString, paramLong1, localBytesVec, paramLong2, paramTIMValueCallBack);
  }
  
  public void getGroupPendencyList(TIMGroupPendencyGetParam paramTIMGroupPendencyGetParam, TIMValueCallBack<TIMGroupPendencyListGetSucc> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if (paramTIMGroupPendencyGetParam == null)
    {
      paramTIMValueCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    getGroupManager().getPendency(paramTIMGroupPendencyGetParam.toOption(), new ʿʽ(this, paramTIMValueCallBack));
  }
  
  public void getGroupPublicInfo(List<String> paramList, TIMValueCallBack<List<TIMGroupDetailInfo>> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if (paramList == null)
    {
      paramTIMValueCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramTIMValueCallBack = new ʾـ(this, paramTIMValueCallBack);
    StrVec localStrVec = new StrVec();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      if (!TextUtils.isEmpty(str)) {
        localStrVec.pushBack(str);
      }
    }
    getGroupManager().getGroupPublicInfo(localStrVec, paramTIMValueCallBack);
  }
  
  public void getGroupPublicInfoV2(List<String> paramList1, long paramLong, List<String> paramList2, TIMValueCallBack<List<TIMGroupDetailInfo>> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if (paramList1 == null)
    {
      paramTIMValueCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramTIMValueCallBack = new ʾٴ(this, paramTIMValueCallBack);
    StrVec localStrVec = new StrVec();
    paramList1 = paramList1.iterator();
    String str;
    while (paramList1.hasNext())
    {
      str = (String)paramList1.next();
      if (!TextUtils.isEmpty(str)) {
        localStrVec.pushBack(str);
      }
    }
    paramList1 = new BytesVec();
    if (paramList2 != null)
    {
      paramList2 = paramList2.iterator();
      while (paramList2.hasNext())
      {
        str = (String)paramList2.next();
        if (!TextUtils.isEmpty(str)) {
          try
          {
            paramList1.pushBack(str.getBytes("utf-8"));
          }
          catch (UnsupportedEncodingException localUnsupportedEncodingException)
          {
            localUnsupportedEncodingException.printStackTrace();
          }
        }
      }
    }
    getGroupManager().getGroupPublicInfoV2(localStrVec, paramLong, paramList1, paramTIMValueCallBack);
  }
  
  public String getIdentifier()
  {
    return this.identifier;
  }
  
  public void getSelfInfo(String paramString, TIMValueCallBack<TIMGroupSelfInfo> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if (paramString == null)
    {
      paramTIMValueCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramTIMValueCallBack = new ʿʼ(this, paramTIMValueCallBack);
    getGroupManager().getSelfInfo(paramString, paramTIMValueCallBack);
  }
  
  public void inviteGroupMember(String paramString, List<String> paramList, TIMValueCallBack<List<TIMGroupMemberResult>> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if ((paramString == null) || (paramList == null))
    {
      paramTIMValueCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramTIMValueCallBack = new ʿˋ(this, paramTIMValueCallBack);
    StrVec localStrVec = new StrVec();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      if (!TextUtils.isEmpty(str)) {
        localStrVec.pushBack(str);
      }
    }
    getGroupManager().inviteGroupMember(paramString, localStrVec, paramTIMValueCallBack);
  }
  
  public void modifyGroupAddOpt(String paramString, TIMGroupAddOpt paramTIMGroupAddOpt, TIMCallBack paramTIMCallBack)
  {
    if (paramTIMCallBack == null) {
      return;
    }
    if ((paramString == null) || (paramTIMGroupAddOpt == null))
    {
      paramTIMCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramTIMCallBack = new ʾˈ(this, paramTIMCallBack);
    getGroupManager().modifyGroupBaseInfo(paramString, TIMGroupManager.ˈ.c.ordinal(), "".getBytes(), paramTIMGroupAddOpt.ordinal(), paramTIMCallBack);
  }
  
  public void modifyGroupCustomInfo(String paramString1, String paramString2, byte[] paramArrayOfByte, TIMCallBack paramTIMCallBack)
  {
    if (paramTIMCallBack == null) {
      return;
    }
    if ((paramString1 == null) || (paramString2 == null) || (paramArrayOfByte == null))
    {
      paramTIMCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMCallBack.onError(6013, "sdk not initialized");
      return;
    }
    ModifyGroupBaseInfoOption localModifyGroupBaseInfoOption = new ModifyGroupBaseInfoOption();
    localModifyGroupBaseInfoOption.setGroup_id(paramString1);
    paramString1 = new BytesMap();
    try
    {
      paramString1.set(paramString2.getBytes("utf-8"), paramArrayOfByte);
      localModifyGroupBaseInfoOption.setCustom_info(paramString1);
      getGroupManager().modifyGroupBaseInfo(localModifyGroupBaseInfoOption, new ʾˉ(this, paramTIMCallBack));
      return;
    }
    catch (UnsupportedEncodingException paramString2)
    {
      for (;;)
      {
        paramString2.printStackTrace();
      }
    }
  }
  
  public void modifyGroupFaceUrl(String paramString1, String paramString2, TIMCallBack paramTIMCallBack)
  {
    if (paramTIMCallBack == null) {
      return;
    }
    if ((paramString1 == null) || (paramString2 == null))
    {
      paramTIMCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMCallBack.onError(6013, "sdk not initialized");
      return;
    }
    ʾʿ localʾʿ = new ʾʿ(this, paramTIMCallBack);
    paramTIMCallBack = null;
    try
    {
      paramString2 = paramString2.getBytes("UTF-8");
      getGroupManager().modifyGroupBaseInfo(paramString1, TIMGroupManager.ˈ.e.a(), paramString2, 0L, localʾʿ);
      return;
    }
    catch (UnsupportedEncodingException paramString2)
    {
      for (;;)
      {
        paramString2.printStackTrace();
        paramString2 = paramTIMCallBack;
      }
    }
  }
  
  public void modifyGroupIntroduction(String paramString1, String paramString2, TIMCallBack paramTIMCallBack)
  {
    if (paramTIMCallBack == null) {
      return;
    }
    if ((paramString1 == null) || (paramString2 == null))
    {
      paramTIMCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMCallBack.onError(6013, "sdk not initialized");
      return;
    }
    ʾʼ localʾʼ = new ʾʼ(this, paramTIMCallBack);
    paramTIMCallBack = null;
    try
    {
      paramString2 = paramString2.getBytes("UTF-8");
      getGroupManager().modifyGroupBaseInfo(paramString1, TIMGroupManager.ˈ.b.a(), paramString2, 0L, localʾʼ);
      return;
    }
    catch (UnsupportedEncodingException paramString2)
    {
      for (;;)
      {
        paramString2.printStackTrace();
        paramString2 = paramTIMCallBack;
      }
    }
  }
  
  public void modifyGroupMemberInfoSetCustomInfo(String paramString1, String paramString2, String paramString3, byte[] paramArrayOfByte, TIMCallBack paramTIMCallBack)
  {
    if (paramTIMCallBack == null) {
      return;
    }
    if ((paramString1 == null) || (paramString2 == null) || (paramString3 == null) || (paramArrayOfByte == null))
    {
      paramTIMCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMCallBack.onError(6013, "sdk not initialized");
      return;
    }
    ModifyGroupMemberInfoOption localModifyGroupMemberInfoOption = new ModifyGroupMemberInfoOption();
    localModifyGroupMemberInfoOption.setGroup_id(paramString1);
    localModifyGroupMemberInfoOption.setMember(paramString2);
    try
    {
      paramString1 = new BytesMap();
      paramString1.set(paramString3.getBytes("utf-8"), paramArrayOfByte);
      localModifyGroupMemberInfoOption.setCustom_info(paramString1);
      getGroupManager().modifyGroupMemberInfo(localModifyGroupMemberInfoOption, new ʾᵔ(this, paramTIMCallBack));
      return;
    }
    catch (UnsupportedEncodingException paramString1)
    {
      for (;;)
      {
        paramString1.printStackTrace();
      }
    }
  }
  
  public void modifyGroupMemberInfoSetNameCard(String paramString1, String paramString2, String paramString3, TIMCallBack paramTIMCallBack)
  {
    if (paramTIMCallBack == null) {
      return;
    }
    if ((paramString1 == null) || (paramString2 == null) || (paramString3 == null))
    {
      paramTIMCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMCallBack.onError(6013, "sdk not initialized");
      return;
    }
    ModifyGroupMemberInfoOption localModifyGroupMemberInfoOption = new ModifyGroupMemberInfoOption();
    localModifyGroupMemberInfoOption.setGroup_id(paramString1);
    localModifyGroupMemberInfoOption.setMember(paramString2);
    localModifyGroupMemberInfoOption.setFlag(ModifyGroupMemberFlag.kModifyGroupMemberNameCard.swigValue());
    paramString1 = null;
    try
    {
      paramString2 = paramString3.getBytes("utf-8");
      paramString1 = paramString2;
    }
    catch (UnsupportedEncodingException paramString2)
    {
      for (;;)
      {
        paramString2.printStackTrace();
      }
    }
    localModifyGroupMemberInfoOption.setName_card(paramString1);
    getGroupManager().modifyGroupMemberInfo(localModifyGroupMemberInfoOption, new ʾᵎ(this, paramTIMCallBack));
  }
  
  public void modifyGroupMemberInfoSetRole(String paramString1, String paramString2, TIMGroupMemberRoleType paramTIMGroupMemberRoleType, TIMCallBack paramTIMCallBack)
  {
    if (paramTIMCallBack == null) {
      return;
    }
    if ((paramString1 == null) || (paramString2 == null))
    {
      paramTIMCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramTIMCallBack = new ʾᐧ(this, paramTIMCallBack);
    getGroupManager().modifyGroupMemberInfo(paramString2, paramString1, TIMGroupManager.ˎ.b.a(), paramTIMGroupMemberRoleType.getValue(), paramTIMCallBack);
  }
  
  public void modifyGroupMemberInfoSetSilence(String paramString1, String paramString2, long paramLong, TIMCallBack paramTIMCallBack)
  {
    if (paramTIMCallBack == null) {
      return;
    }
    if ((paramString1 == null) || (paramString2 == null))
    {
      paramTIMCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramTIMCallBack = new ʾᴵ(this, paramTIMCallBack);
    getGroupManager().modifyGroupMemberInfo(paramString2, paramString1, TIMGroupManager.ˎ.c.a(), paramLong, paramTIMCallBack);
  }
  
  public void modifyGroupName(String paramString1, String paramString2, TIMCallBack paramTIMCallBack)
  {
    if (paramTIMCallBack == null) {
      return;
    }
    if ((paramString1 == null) || (paramString2 == null))
    {
      paramTIMCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMCallBack.onError(6013, "sdk not initialized");
      return;
    }
    ʾʻ localʾʻ = new ʾʻ(this, paramTIMCallBack);
    paramTIMCallBack = null;
    try
    {
      paramString2 = paramString2.getBytes("UTF-8");
      getGroupManager().modifyGroupBaseInfo(paramString1, TIMGroupManager.ˈ.a.a(), paramString2, 0L, localʾʻ);
      return;
    }
    catch (UnsupportedEncodingException paramString2)
    {
      for (;;)
      {
        paramString2.printStackTrace();
        paramString2 = paramTIMCallBack;
      }
    }
  }
  
  public void modifyGroupNotification(String paramString1, String paramString2, TIMCallBack paramTIMCallBack)
  {
    if (paramTIMCallBack == null) {
      return;
    }
    if ((paramString1 == null) || (paramString2 == null))
    {
      paramTIMCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMCallBack.onError(6013, "sdk not initialized");
      return;
    }
    ʾʽ localʾʽ = new ʾʽ(this, paramTIMCallBack);
    paramTIMCallBack = null;
    try
    {
      paramString2 = paramString2.getBytes("UTF-8");
      getGroupManager().modifyGroupBaseInfo(paramString1, TIMGroupManager.ˈ.d.a(), paramString2, 0L, localʾʽ);
      return;
    }
    catch (UnsupportedEncodingException paramString2)
    {
      for (;;)
      {
        paramString2.printStackTrace();
        paramString2 = paramTIMCallBack;
      }
    }
  }
  
  public void modifyGroupOwner(String paramString1, String paramString2, TIMCallBack paramTIMCallBack)
  {
    if (paramTIMCallBack == null) {
      return;
    }
    if ((paramString1 == null) || (paramString2 == null))
    {
      paramTIMCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMCallBack.onError(6013, "sdk not initialized");
      return;
    }
    getGroupManager().modifyGroupOwner(paramString1, paramString2, new ʾˆ(this, paramTIMCallBack));
  }
  
  public void modifyGroupSearchable(String paramString, boolean paramBoolean, TIMCallBack paramTIMCallBack)
  {
    if (paramTIMCallBack == null) {
      return;
    }
    if (paramString == null)
    {
      paramTIMCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMCallBack.onError(6013, "sdk not initialized");
      return;
    }
    ModifyGroupBaseInfoOption localModifyGroupBaseInfoOption = new ModifyGroupBaseInfoOption();
    localModifyGroupBaseInfoOption.setGroup_id(paramString);
    localModifyGroupBaseInfoOption.setFlag(ModifyGroupFlag.kModifyGroupSearchable.swigValue());
    if (paramBoolean) {}
    for (paramString = ComStatus.kOpen;; paramString = ComStatus.kClose)
    {
      localModifyGroupBaseInfoOption.setSearchable(paramString);
      getGroupManager().modifyGroupBaseInfo(localModifyGroupBaseInfoOption, new ʾˎ(this, paramTIMCallBack));
      return;
    }
  }
  
  public void modifyGroupVisible(String paramString, boolean paramBoolean, TIMCallBack paramTIMCallBack)
  {
    if (paramTIMCallBack == null) {
      return;
    }
    if (paramString == null)
    {
      paramTIMCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMCallBack.onError(6013, "sdk not initialized");
      return;
    }
    ModifyGroupBaseInfoOption localModifyGroupBaseInfoOption = new ModifyGroupBaseInfoOption();
    localModifyGroupBaseInfoOption.setGroup_id(paramString);
    localModifyGroupBaseInfoOption.setFlag(ModifyGroupFlag.kModifyGroupVisible.swigValue());
    if (paramBoolean) {}
    for (paramString = ComStatus.kOpen;; paramString = ComStatus.kClose)
    {
      localModifyGroupBaseInfoOption.setVisible(paramString);
      getGroupManager().modifyGroupBaseInfo(localModifyGroupBaseInfoOption, new ʾˊ(this, paramTIMCallBack));
      return;
    }
  }
  
  public void modifyReceiveMessageOpt(String paramString, TIMGroupReceiveMessageOpt paramTIMGroupReceiveMessageOpt, TIMCallBack paramTIMCallBack)
  {
    if (paramTIMCallBack == null) {
      return;
    }
    if (paramString == null)
    {
      paramTIMCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMCallBack.onError(6013, "sdk not initialized");
      return;
    }
    ʾⁱ localʾⁱ = new ʾⁱ(this, paramTIMCallBack);
    paramTIMCallBack = this.identifier;
    if (TextUtils.isEmpty(this.identifier)) {
      paramTIMCallBack = TIMManager.getInstance().getIdentification();
    }
    getGroupManager().modifyGroupMemberInfo(paramTIMCallBack, paramString, TIMGroupManager.ˎ.a.a(), paramTIMGroupReceiveMessageOpt.getValue(), localʾⁱ);
  }
  
  public void quitGroup(String paramString, TIMCallBack paramTIMCallBack)
  {
    if (paramTIMCallBack == null) {
      return;
    }
    if (paramString == null)
    {
      paramTIMCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramTIMCallBack = new ʽﹶ(this, paramTIMCallBack);
    getGroupManager().quitGroup(paramString, paramTIMCallBack);
  }
  
  public void reportGroupPendency(long paramLong, TIMCallBack paramTIMCallBack)
  {
    getGroupManager().pendencyReport(paramLong, new ʿʾ(this, paramTIMCallBack));
  }
  
  public void searchGroup(String paramString, long paramLong, List<String> paramList, int paramInt1, int paramInt2, TIMValueCallBack<TIMGroupSearchSucc> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if (paramString == null)
    {
      paramTIMValueCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramTIMValueCallBack = new ʾי(this, paramTIMValueCallBack);
    BytesVec localBytesVec = new BytesVec();
    if (paramList != null)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        String str = (String)paramList.next();
        try
        {
          localBytesVec.pushBack(str.getBytes("utf-8"));
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          localUnsupportedEncodingException.printStackTrace();
        }
      }
    }
    getGroupManager().searchGroupByName(paramString, paramLong, localBytesVec, paramInt1, paramInt2, paramTIMValueCallBack);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGroupManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */