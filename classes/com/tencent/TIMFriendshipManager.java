package com.tencent;

import android.text.TextUtils;
import com.tencent.imcore.BytesMap;
import com.tencent.imcore.BytesVec;
import com.tencent.imcore.FriendDeleteType;
import com.tencent.imcore.FriendMetaInfo;
import com.tencent.imcore.FriendProfile;
import com.tencent.imcore.FriendProfileVec;
import com.tencent.imcore.FriendshipManager;
import com.tencent.imcore.GetProfileOption;
import com.tencent.imcore.IMCoreUser;
import com.tencent.imcore.ProfileFlag;
import com.tencent.imcore.SNSProfileItem;
import com.tencent.imcore.SNSProfileItemVec;
import com.tencent.imcore.SetProfileOption;
import com.tencent.imcore.StrVec;
import com.tencent.imsdk.QLog;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TIMFriendshipManager
{
  public static final int TIM_FUTURE_FRIEND_DECIDE_TYPE = 8;
  public static final int TIM_FUTURE_FRIEND_PENDENCY_IN_TYPE = 1;
  public static final int TIM_FUTURE_FRIEND_PENDENCY_OUT_TYPE = 2;
  public static final int TIM_FUTURE_FRIEND_RECOMMEND_TYPE = 4;
  public static final int TIM_PROFILE_FLAG_ALLOW_TYPE = 2;
  public static final int TIM_PROFILE_FLAG_FACE_URL = 4;
  public static final int TIM_PROFILE_FLAG_GROUP = 16;
  public static final int TIM_PROFILE_FLAG_NICK = 1;
  public static final int TIM_PROFILE_FLAG_REMARK = 8;
  public static final int TIM_PROFILE_FLAG_SELF_SIGNATURE = 32;
  private static final String tag = "TIMFriendshipManager";
  private String identifier = "";
  private TIMFriendshipProxy proxy;
  
  private TIMFriendshipManager(String paramString)
  {
    this.identifier = paramString;
  }
  
  private FriendshipManager getFriendShipMgr()
  {
    if (TextUtils.isEmpty(this.identifier))
    {
      QLog.w("TIMFriendshipManager", 1, "TIMFriendshipManager|getFriendShipMgr id is empty");
      return TIMManager.getInstance().getCoreUser().getFriendShipMgr();
    }
    return TIMManager.getInstanceById(this.identifier).getCoreUser().getFriendShipMgr();
  }
  
  public static TIMFriendshipManager getInstance()
  {
    return getInstanceById(TIMManager.getInstance().getIdentification());
  }
  
  public static TIMFriendshipManager getInstanceById(String paramString)
  {
    return new TIMFriendshipManager(paramString);
  }
  
  public void addBlackList(List<String> paramList, TIMValueCallBack<List<TIMFriendResult>> paramTIMValueCallBack)
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
    paramTIMValueCallBack = new ʼʽ(this, paramTIMValueCallBack);
    StrVec localStrVec = new StrVec();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      if (!TextUtils.isEmpty(str)) {
        localStrVec.pushBack(str);
      }
    }
    getFriendShipMgr().addBlackList(localStrVec, paramTIMValueCallBack);
  }
  
  public void addFriend(List<TIMAddFriendRequest> paramList, TIMValueCallBack<List<TIMFriendResult>> paramTIMValueCallBack)
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
    paramTIMValueCallBack = new ʻⁱ(this, paramTIMValueCallBack);
    FriendProfileVec localFriendProfileVec = new FriendProfileVec();
    paramList = paramList.iterator();
    for (;;)
    {
      if (paramList.hasNext())
      {
        TIMAddFriendRequest localTIMAddFriendRequest = (TIMAddFriendRequest)paramList.next();
        FriendProfile localFriendProfile = new FriendProfile();
        localFriendProfile.setSIdentifier(localTIMAddFriendRequest.getIdentifier());
        try
        {
          localFriendProfile.setSRemark(localTIMAddFriendRequest.getRemark().getBytes("utf-8"));
          localFriendProfile.setSAddSource(localTIMAddFriendRequest.getAddSource().getBytes("utf-8"));
          localFriendProfile.setSAddWording(localTIMAddFriendRequest.getAddWording().getBytes("utf-8"));
          BytesVec localBytesVec = new BytesVec();
          localBytesVec.pushBack(localTIMAddFriendRequest.getFriendGroup().getBytes("utf-8"));
          localFriendProfile.setSGroupNames(localBytesVec);
          localFriendProfileVec.pushBack(localFriendProfile);
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          for (;;)
          {
            localUnsupportedEncodingException.printStackTrace();
          }
        }
      }
    }
    getFriendShipMgr().addFriend(localFriendProfileVec, paramTIMValueCallBack);
  }
  
  public void addFriendResponse(TIMFriendAddResponse paramTIMFriendAddResponse, TIMValueCallBack<TIMFriendResult> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if (paramTIMFriendAddResponse == null)
    {
      paramTIMValueCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramTIMValueCallBack = new ʻﹳ(this, paramTIMValueCallBack);
    FriendProfileVec localFriendProfileVec = new FriendProfileVec();
    FriendProfile localFriendProfile = new FriendProfile();
    localFriendProfile.setSIdentifier(paramTIMFriendAddResponse.getIdentifier());
    try
    {
      localFriendProfile.setSRemark(paramTIMFriendAddResponse.getRemark().getBytes("utf-8"));
      localFriendProfile.setSResponseAction(paramTIMFriendAddResponse.getType().getAction());
      localFriendProfileVec.pushBack(localFriendProfile);
      getFriendShipMgr().doResponse(localFriendProfileVec, paramTIMValueCallBack);
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
  
  public void addFriendsToFriendGroup(String paramString, List<String> paramList, TIMValueCallBack<List<TIMFriendResult>> paramTIMValueCallBack)
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
    StrVec localStrVec = new StrVec();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      if ((str != null) && (str.length() != 0)) {
        localStrVec.pushBack(str);
      }
    }
    paramList = null;
    try
    {
      paramString = paramString.getBytes("utf-8");
      getFriendShipMgr().addFriends2Group(paramString, localStrVec, new ʼᐧ(this, paramTIMValueCallBack));
      return;
    }
    catch (UnsupportedEncodingException paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
        paramString = paramList;
      }
    }
  }
  
  public void checkFriends(TIMFriendCheckParam paramTIMFriendCheckParam, TIMValueCallBack<List<TIMFriendCheckResult>> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if ((paramTIMFriendCheckParam == null) || (paramTIMFriendCheckParam.identifiers == null) || (paramTIMFriendCheckParam.identifiers.size() == 0))
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
    Iterator localIterator = paramTIMFriendCheckParam.identifiers.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (!TextUtils.isEmpty(str)) {
        localStrVec.pushBack(str);
      }
    }
    if (paramTIMFriendCheckParam.isBidirection()) {}
    for (paramTIMFriendCheckParam = "CheckResult_Type_Both";; paramTIMFriendCheckParam = "CheckResult_Type_Singal")
    {
      getFriendShipMgr().checkFriend(localStrVec, paramTIMFriendCheckParam, new ʼⁱ(this, paramTIMValueCallBack));
      return;
    }
  }
  
  public void createFriendGroup(List<String> paramList1, List<String> paramList2, TIMValueCallBack<List<TIMFriendResult>> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if ((paramList1 == null) || (paramList2 == null))
    {
      paramTIMValueCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    BytesVec localBytesVec = new BytesVec();
    paramList1 = paramList1.iterator();
    while (paramList1.hasNext())
    {
      String str1 = (String)paramList1.next();
      if ((str1 != null) && (str1.length() != 0)) {
        try
        {
          localBytesVec.pushBack(str1.getBytes("utf-8"));
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          localUnsupportedEncodingException.printStackTrace();
        }
      }
    }
    paramList1 = new StrVec();
    paramList2 = paramList2.iterator();
    while (paramList2.hasNext())
    {
      String str2 = (String)paramList2.next();
      if ((str2 != null) && (str2.length() != 0)) {
        paramList1.pushBack(str2);
      }
    }
    paramList2 = new ʼי(this, paramTIMValueCallBack);
    getFriendShipMgr().createFriendGroup(localBytesVec, paramList1, paramList2);
  }
  
  public void delBlackList(List<String> paramList, TIMValueCallBack<List<TIMFriendResult>> paramTIMValueCallBack)
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
    paramTIMValueCallBack = new ʼʾ(this, paramTIMValueCallBack);
    StrVec localStrVec = new StrVec();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      if (!TextUtils.isEmpty(str)) {
        localStrVec.pushBack(str);
      }
    }
    getFriendShipMgr().delBlackList(localStrVec, paramTIMValueCallBack);
  }
  
  public void delFriend(TIMDelFriendType paramTIMDelFriendType, List<TIMAddFriendRequest> paramList, TIMValueCallBack<List<TIMFriendResult>> paramTIMValueCallBack)
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
    paramTIMValueCallBack = new ʻﹶ(this, paramTIMValueCallBack);
    FriendProfileVec localFriendProfileVec = new FriendProfileVec();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      TIMAddFriendRequest localTIMAddFriendRequest = (TIMAddFriendRequest)paramList.next();
      FriendProfile localFriendProfile = new FriendProfile();
      localFriendProfile.setSIdentifier(localTIMAddFriendRequest.getIdentifier());
      localFriendProfileVec.pushBack(localFriendProfile);
    }
    getFriendShipMgr().delFriend(FriendDeleteType.swigToEnum(paramTIMDelFriendType.ordinal()), localFriendProfileVec, paramTIMValueCallBack);
  }
  
  public void delFriendsFromFriendGroup(String paramString, List<String> paramList, TIMValueCallBack<List<TIMFriendResult>> paramTIMValueCallBack)
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
    StrVec localStrVec = new StrVec();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      if ((str != null) && (str.length() != 0)) {
        localStrVec.pushBack(str);
      }
    }
    paramList = null;
    try
    {
      paramString = paramString.getBytes("utf-8");
      getFriendShipMgr().delFriendsFromGroup(paramString, localStrVec, new ʼᴵ(this, paramTIMValueCallBack));
      return;
    }
    catch (UnsupportedEncodingException paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
        paramString = paramList;
      }
    }
  }
  
  public void deleteDecide(List<String> paramList, TIMValueCallBack<List<TIMFriendResult>> paramTIMValueCallBack)
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
    StrVec localStrVec = new StrVec();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      if ((str != null) && (str.length() != 0)) {
        localStrVec.pushBack(str);
      }
    }
    paramList = new ʼˑ(this, paramTIMValueCallBack);
    getFriendShipMgr().deleteDecide(localStrVec, paramList);
  }
  
  public void deleteFriendGroup(List<String> paramList, TIMCallBack paramTIMCallBack)
  {
    if (paramTIMCallBack == null) {
      return;
    }
    if (paramList == null)
    {
      paramTIMCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMCallBack.onError(6013, "sdk not initialized");
      return;
    }
    BytesVec localBytesVec = new BytesVec();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      if ((str != null) && (str.length() != 0)) {
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
    getFriendShipMgr().deleteFriendGroup(localBytesVec, new ʼـ(this, paramTIMCallBack));
  }
  
  public void deletePendency(TIMPendencyGetType paramTIMPendencyGetType, List<String> paramList, TIMValueCallBack<List<TIMFriendResult>> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if ((paramTIMPendencyGetType == null) || (paramList == null))
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
      if ((str != null) && (str.length() != 0)) {
        localStrVec.pushBack(str);
      }
    }
    paramList = new ʼˏ(this, paramTIMValueCallBack);
    getFriendShipMgr().deletePendency(TIMPendencyGetType.getType(paramTIMPendencyGetType), localStrVec, paramList);
  }
  
  public void deleteRecommend(List<String> paramList, TIMValueCallBack<List<TIMFriendResult>> paramTIMValueCallBack)
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
    StrVec localStrVec = new StrVec();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      if ((str != null) && (str.length() != 0)) {
        localStrVec.pushBack(str);
      }
    }
    paramList = new ʼˎ(this, paramTIMValueCallBack);
    getFriendShipMgr().deleteRecommend(localStrVec, paramList);
  }
  
  public void getBlackList(TIMValueCallBack<List<String>> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramTIMValueCallBack = new ʼˆ(this, paramTIMValueCallBack);
    getFriendShipMgr().getBlackList(paramTIMValueCallBack);
  }
  
  public void getFriendGroups(List<String> paramList, TIMValueCallBack<List<TIMFriendGroup>> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    BytesVec localBytesVec = new BytesVec();
    if (paramList != null)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        String str = (String)paramList.next();
        if ((str != null) && (str.length() != 0)) {
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
    }
    getFriendShipMgr().getFriendGroup(localBytesVec, true, new ʼᵢ(this, paramTIMValueCallBack));
  }
  
  public void getFriendList(TIMValueCallBack<List<TIMUserProfile>> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramTIMValueCallBack = new ʻﾞ(this, paramTIMValueCallBack);
    getFriendShipMgr().getFriendList(paramTIMValueCallBack);
  }
  
  public void getFriendListV2(long paramLong, List<String> paramList, TIMFriendMetaInfo paramTIMFriendMetaInfo, TIMValueCallBack<TIMGetFriendListV2Succ> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramTIMValueCallBack = new ʼʻ(this, paramTIMValueCallBack);
    StrVec localStrVec = new StrVec();
    if (paramList != null)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        String str = (String)paramList.next();
        if (!TextUtils.isEmpty(str)) {
          localStrVec.pushBack(str);
        }
      }
    }
    paramList = new FriendMetaInfo();
    paramList.setRecover(paramTIMFriendMetaInfo.isRecover());
    paramList.setDdwInfoSeq(paramTIMFriendMetaInfo.getInfoSeq());
    paramList.setDdwNextSeq(paramTIMFriendMetaInfo.getNextSeq());
    paramList.setDdwTimestamp(paramTIMFriendMetaInfo.getTimestamp());
    getFriendShipMgr().getFriendListV2(paramLong, localStrVec, paramList, paramTIMValueCallBack);
  }
  
  public void getFriendsProfile(List<String> paramList, TIMValueCallBack<List<TIMUserProfile>> paramTIMValueCallBack)
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
    paramTIMValueCallBack = new ʻᵔ(this, paramTIMValueCallBack);
    StrVec localStrVec = new StrVec();
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localStrVec.pushBack((String)paramList.next());
    }
    paramList = new GetProfileOption();
    Object localObject = TIMManager.getInstanceById(this.identifier).getFriendshipSettings();
    paramList.setFlag(((TIMFriendshipSettings)localObject).getFlags());
    BytesMap localBytesMap = new BytesMap();
    localObject = ((TIMFriendshipSettings)localObject).getCustomFields();
    if (localObject != null)
    {
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str = (String)((Iterator)localObject).next();
        try
        {
          localBytesMap.set(str.getBytes("utf-8"), "".getBytes("utf-8"));
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          localUnsupportedEncodingException.printStackTrace();
        }
      }
    }
    paramList.setCustom_info(localBytesMap);
    getFriendShipMgr().getFriendProfile(localStrVec, paramList, paramTIMValueCallBack);
  }
  
  public void getFutureFriends(long paramLong1, long paramLong2, List<String> paramList, TIMFriendFutureMeta paramTIMFriendFutureMeta, TIMValueCallBack<TIMGetFriendFutureListSucc> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if (paramTIMFriendFutureMeta == null)
    {
      paramTIMValueCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramTIMValueCallBack = new ʼˋ(this, paramTIMValueCallBack);
    StrVec localStrVec = new StrVec();
    if (paramList != null)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        String str = (String)paramList.next();
        if (!TextUtils.isEmpty(str)) {
          localStrVec.pushBack(str);
        }
      }
    }
    getFriendShipMgr().getFutureFriends(paramLong1, paramLong2, localStrVec, paramTIMFriendFutureMeta.getFutureFriendMeta(), paramTIMValueCallBack);
  }
  
  public String getIdentifier()
  {
    return this.identifier;
  }
  
  public void getPendencyFromServer(TIMFriendPendencyMeta paramTIMFriendPendencyMeta, TIMPendencyGetType paramTIMPendencyGetType, TIMValueCallBack<TIMGetFriendPendencyListSucc> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if ((paramTIMFriendPendencyMeta == null) || (paramTIMPendencyGetType == null))
    {
      paramTIMValueCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramTIMValueCallBack = new ʼˊ(this, paramTIMValueCallBack);
    getFriendShipMgr().getPendencyFromServer(paramTIMFriendPendencyMeta.toFriendPendencyMeta(), TIMPendencyGetType.getType(paramTIMPendencyGetType), paramTIMValueCallBack);
  }
  
  public void getSelfProfile(TIMValueCallBack<TIMUserProfile> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramTIMValueCallBack = new ʽʼ(this, paramTIMValueCallBack);
    StrVec localStrVec = new StrVec();
    if (TextUtils.isEmpty(this.identifier)) {
      localStrVec.pushBack(TIMManager.getInstance().getIdentification());
    }
    GetProfileOption localGetProfileOption;
    BytesMap localBytesMap;
    for (;;)
    {
      localGetProfileOption = new GetProfileOption();
      Object localObject = TIMManager.getInstanceById(this.identifier).getFriendshipSettings();
      localGetProfileOption.setFlag(((TIMFriendshipSettings)localObject).getFlags());
      localBytesMap = new BytesMap();
      localObject = ((TIMFriendshipSettings)localObject).getCustomFields();
      if (localObject == null) {
        break;
      }
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str = (String)((Iterator)localObject).next();
        try
        {
          localBytesMap.set(str.getBytes("utf-8"), "".getBytes("utf-8"));
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          localUnsupportedEncodingException.printStackTrace();
        }
      }
      localStrVec.pushBack(this.identifier);
    }
    localGetProfileOption.setCustom_info(localBytesMap);
    getFriendShipMgr().getProfile(localStrVec, localGetProfileOption, paramTIMValueCallBack);
  }
  
  public void getUsersProfile(List<String> paramList, TIMValueCallBack<List<TIMUserProfile>> paramTIMValueCallBack)
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
    paramTIMValueCallBack = new ʻᵢ(this, paramTIMValueCallBack);
    StrVec localStrVec = new StrVec();
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localStrVec.pushBack((String)paramList.next());
    }
    paramList = new GetProfileOption();
    Object localObject = TIMManager.getInstanceById(this.identifier).getFriendshipSettings();
    paramList.setFlag(((TIMFriendshipSettings)localObject).getFlags());
    BytesMap localBytesMap = new BytesMap();
    localObject = ((TIMFriendshipSettings)localObject).getCustomFields();
    if (localObject != null)
    {
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str = (String)((Iterator)localObject).next();
        try
        {
          localBytesMap.set(str.getBytes("utf-8"), "".getBytes("utf-8"));
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          localUnsupportedEncodingException.printStackTrace();
        }
      }
    }
    paramList.setCustom_info(localBytesMap);
    getFriendShipMgr().getProfile(localStrVec, paramList, paramTIMValueCallBack);
  }
  
  public void pendencyReport(long paramLong, TIMCallBack paramTIMCallBack)
  {
    if (paramTIMCallBack == null) {
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramTIMCallBack = new ʼˈ(this, paramTIMCallBack);
    getFriendShipMgr().pendencyReport(paramLong, paramTIMCallBack);
  }
  
  public void recommendReport(long paramLong, TIMCallBack paramTIMCallBack)
  {
    if (paramTIMCallBack == null) {
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramTIMCallBack = new ʼˉ(this, paramTIMCallBack);
    getFriendShipMgr().recommendReport(paramLong, paramTIMCallBack);
  }
  
  public void renameFriendGroupName(String paramString1, String paramString2, TIMCallBack paramTIMCallBack)
  {
    Object localObject = null;
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
    paramTIMCallBack = new ʼᵔ(this, new ʼᵎ(this, paramTIMCallBack));
    for (;;)
    {
      try
      {
        paramString1 = paramString1.getBytes("utf-8");
        paramString2.printStackTrace();
      }
      catch (UnsupportedEncodingException paramString2)
      {
        try
        {
          paramString2 = paramString2.getBytes("utf-8");
          getFriendShipMgr().modifyFriendGroupName(paramString1, paramString2, paramTIMCallBack);
          return;
        }
        catch (UnsupportedEncodingException paramString2)
        {
          for (;;) {}
        }
        paramString2 = paramString2;
        paramString1 = null;
      }
      paramString2 = (String)localObject;
    }
  }
  
  public void searchFriend(String paramString, TIMValueCallBack<TIMUserProfile> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if (TextUtils.isEmpty(paramString))
    {
      paramTIMValueCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramTIMValueCallBack = new ʽʾ(this, paramTIMValueCallBack);
    StrVec localStrVec = new StrVec();
    localStrVec.pushBack(paramString);
    GetProfileOption localGetProfileOption = new GetProfileOption();
    Object localObject = TIMManager.getInstanceById(paramString).getFriendshipSettings();
    localGetProfileOption.setFlag(((TIMFriendshipSettings)localObject).getFlags());
    paramString = new BytesMap();
    localObject = ((TIMFriendshipSettings)localObject).getCustomFields();
    if (localObject != null)
    {
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str = (String)((Iterator)localObject).next();
        try
        {
          paramString.set(str.getBytes("utf-8"), "".getBytes("utf-8"));
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          localUnsupportedEncodingException.printStackTrace();
        }
      }
    }
    localGetProfileOption.setCustom_info(paramString);
    getFriendShipMgr().getProfile(localStrVec, localGetProfileOption, paramTIMValueCallBack);
  }
  
  public void searchUser(String paramString, long paramLong1, long paramLong2, TIMValueCallBack<TIMUserSearchSucc> paramTIMValueCallBack)
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
    paramTIMValueCallBack = new ʻᵎ(this, paramTIMValueCallBack);
    getFriendShipMgr().searchFriendsUseNickName(paramString, paramLong1, paramLong2, paramTIMValueCallBack);
  }
  
  public void setAllowType(TIMFriendAllowType paramTIMFriendAllowType, TIMCallBack paramTIMCallBack)
  {
    if (paramTIMCallBack == null) {
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramTIMCallBack = new ʽʻ(this, paramTIMCallBack);
    getFriendShipMgr().setProfile(TIMFriendshipManager.ˊ.a.ordinal(), paramTIMFriendAllowType.getType(), 0L, paramTIMCallBack);
  }
  
  public void setCustomInfo(String paramString, byte[] paramArrayOfByte, TIMCallBack paramTIMCallBack)
  {
    if (paramTIMCallBack == null) {
      return;
    }
    if ((paramString == null) || (paramArrayOfByte == null))
    {
      paramTIMCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramTIMCallBack = new ʼﹳ(this, paramTIMCallBack);
    SetProfileOption localSetProfileOption = new SetProfileOption();
    BytesMap localBytesMap = new BytesMap();
    try
    {
      localBytesMap.set(paramString.getBytes("utf-8"), paramArrayOfByte);
      localSetProfileOption.setCustom_info(localBytesMap);
      getFriendShipMgr().setProfile(localSetProfileOption, paramTIMCallBack);
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
  
  public void setFaceUrl(String paramString, TIMCallBack paramTIMCallBack)
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
    paramTIMCallBack = new ʼʿ(this, paramTIMCallBack);
    SetProfileOption localSetProfileOption = new SetProfileOption();
    localSetProfileOption.setFlag(ProfileFlag.kProfileFlagFaceUrl.swigValue());
    try
    {
      localSetProfileOption.setFace_url(paramString.getBytes("utf-8"));
      getFriendShipMgr().setProfile(localSetProfileOption, paramTIMCallBack);
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
  
  public void setFriendCustom(String paramString, Map<byte[], byte[]> paramMap, TIMCallBack paramTIMCallBack)
  {
    if (paramTIMCallBack == null) {
      return;
    }
    if ((TextUtils.isEmpty(paramString)) || (paramMap == null))
    {
      paramTIMCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMCallBack.onError(6013, "sdk not initialized");
      return;
    }
    SNSProfileItem localSNSProfileItem = new SNSProfileItem();
    localSNSProfileItem.setSIdentifier(paramString);
    paramString = new BytesMap();
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      paramString.set((byte[])localEntry.getKey(), (byte[])localEntry.getValue());
    }
    localSNSProfileItem.setMpCustom(paramString);
    paramString = new SNSProfileItemVec();
    paramString.pushBack(localSNSProfileItem);
    getFriendShipMgr().setSnsProfile(paramString, new ʼﾞ(this, paramTIMCallBack));
  }
  
  public void setFriendRemark(String paramString1, String paramString2, TIMCallBack paramTIMCallBack)
  {
    Object localObject = null;
    if (paramTIMCallBack == null) {
      return;
    }
    if ((TextUtils.isEmpty(paramString1)) || (paramString2 == null))
    {
      paramTIMCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMCallBack.onError(6013, "sdk not initialized");
      return;
    }
    SNSProfileItem localSNSProfileItem = new SNSProfileItem();
    localSNSProfileItem.setSIdentifier(paramString1);
    for (;;)
    {
      try
      {
        paramString1 = "Tag_SNS_IM_Remark".getBytes("utf-8");
        paramString2.printStackTrace();
      }
      catch (UnsupportedEncodingException paramString2)
      {
        try
        {
          paramString2 = paramString2.getBytes("utf-8");
          localSNSProfileItem.getMpProfiles().set(paramString1, paramString2);
          paramString1 = new SNSProfileItemVec();
          paramString1.pushBack(localSNSProfileItem);
          getFriendShipMgr().setSnsProfile(paramString1, new ʼﹶ(this, paramTIMCallBack));
          return;
        }
        catch (UnsupportedEncodingException paramString2)
        {
          for (;;) {}
        }
        paramString2 = paramString2;
        paramString1 = null;
      }
      paramString2 = (String)localObject;
    }
  }
  
  public void setNickName(String paramString, TIMCallBack paramTIMCallBack)
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
    paramTIMCallBack = new ʻᴵ(this, paramTIMCallBack);
    SetProfileOption localSetProfileOption = new SetProfileOption();
    localSetProfileOption.setFlag(ProfileFlag.kProfileFlagNick.swigValue());
    try
    {
      localSetProfileOption.setNick(paramString.getBytes("utf-8"));
      getFriendShipMgr().setProfile(localSetProfileOption, paramTIMCallBack);
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
  
  public void setSelfSignature(String paramString, TIMCallBack paramTIMCallBack)
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
    paramTIMCallBack = new ʼٴ(this, paramTIMCallBack);
    SetProfileOption localSetProfileOption = new SetProfileOption();
    localSetProfileOption.setFlag(ProfileFlag.kProfileFlagSelfSignature.swigValue());
    try
    {
      localSetProfileOption.setSelf_signature(paramString.getBytes("utf-8"));
      getFriendShipMgr().setProfile(localSetProfileOption, paramTIMCallBack);
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
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMFriendshipManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */