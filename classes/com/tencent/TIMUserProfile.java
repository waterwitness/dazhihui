package com.tencent;

import com.tencent.imcore.BytesMap;
import com.tencent.imcore.BytesVec;
import com.tencent.imcore.BytesVecFetcher;
import com.tencent.imcore.FriendProfile;
import com.tencent.imcore.MapKeyFetcher;
import com.tencent.imsdk.QLog;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TIMUserProfile
{
  private String allowType = "";
  private Map<String, byte[]> customInfo = new HashMap();
  private String faceUrl = "";
  private List<String> groupNames = new ArrayList();
  private String identifier = "";
  private String nickName = "";
  private String remark = "";
  private String selfSignature = "";
  
  public TIMUserProfile(FriendProfile paramFriendProfile)
  {
    if (paramFriendProfile == null) {}
    for (;;)
    {
      return;
      this.identifier = paramFriendProfile.getSIdentifier();
      this.allowType = paramFriendProfile.getSAllowType();
      try
      {
        this.nickName = new String(paramFriendProfile.getSNickname(), "utf-8");
        this.remark = new String(paramFriendProfile.getSRemark(), "utf-8");
        this.faceUrl = new String(paramFriendProfile.getSFaceURL(), "utf-8");
        this.selfSignature = new String(paramFriendProfile.getSSelfSignature(), "utf-8");
        int j = (int)paramFriendProfile.getSGroupNames().size();
        Object localObject = new BytesVecFetcher(paramFriendProfile.getSGroupNames());
        this.groupNames.clear();
        int i = 0;
        while (i < j)
        {
          this.groupNames.add(new String(((BytesVecFetcher)localObject).getBytesByIndex(i), "utf-8"));
          i += 1;
        }
        paramFriendProfile = paramFriendProfile.getCustom_info();
        localObject = new MapKeyFetcher();
        ((MapKeyFetcher)localObject).fetchMapKeys(paramFriendProfile);
        i = 0;
        for (;;)
        {
          long l1 = i;
          long l2 = paramFriendProfile.size();
          if (l1 >= l2) {
            break;
          }
          try
          {
            getCustomInfo().put(new String(((MapKeyFetcher)localObject).getKey(i), "utf-8"), ((MapKeyFetcher)localObject).getValue(paramFriendProfile, i));
            i += 1;
          }
          catch (UnsupportedEncodingException localUnsupportedEncodingException)
          {
            for (;;)
            {
              localUnsupportedEncodingException.printStackTrace();
            }
          }
        }
        return;
      }
      catch (UnsupportedEncodingException paramFriendProfile)
      {
        paramFriendProfile.printStackTrace();
      }
    }
  }
  
  public TIMFriendAllowType getAllowType()
  {
    QLog.e("TIMUserProfile", 1, "allowType " + this.allowType);
    if (this.allowType.equals(TIMFriendAllowType.TIM_FRIEND_ALLOW_ANY.getType())) {
      return TIMFriendAllowType.TIM_FRIEND_ALLOW_ANY;
    }
    if (this.allowType.equals(TIMFriendAllowType.TIM_FRIEND_DENY_ANY.getType())) {
      return TIMFriendAllowType.TIM_FRIEND_DENY_ANY;
    }
    if (this.allowType.equals(TIMFriendAllowType.TIM_FRIEND_NEED_CONFIRM.getType())) {
      return TIMFriendAllowType.TIM_FRIEND_NEED_CONFIRM;
    }
    return TIMFriendAllowType.TIM_FRIEND_INVALID;
  }
  
  public Map<String, byte[]> getCustomInfo()
  {
    return this.customInfo;
  }
  
  public String getFaceUrl()
  {
    return this.faceUrl;
  }
  
  public List<String> getFriendGroups()
  {
    return this.groupNames;
  }
  
  public String getIdentifier()
  {
    return this.identifier;
  }
  
  public String getNickName()
  {
    return this.nickName;
  }
  
  public String getRemark()
  {
    return this.remark;
  }
  
  public String getSelfSignature()
  {
    return this.selfSignature;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMUserProfile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */