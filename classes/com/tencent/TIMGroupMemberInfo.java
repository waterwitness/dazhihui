package com.tencent;

import com.tencent.imcore.BytesMap;
import com.tencent.imcore.MapKeyFetcher;
import com.tencent.imcore.MemberInfo;
import com.tencent.imcore.NewGroupMemberInfo;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public class TIMGroupMemberInfo
{
  private Map<String, byte[]> custom = new HashMap();
  private long joinTime;
  private String nameCard = "";
  private TIMGroupMemberRoleType role = TIMGroupMemberRoleType.NotMember;
  private long silenceSeconds;
  private String user = "";
  
  public TIMGroupMemberInfo() {}
  
  TIMGroupMemberInfo(MemberInfo paramMemberInfo)
  {
    if (paramMemberInfo == null) {}
    for (;;)
    {
      return;
      setUser(paramMemberInfo.getMember());
      setJoinTime(paramMemberInfo.getJoin_time());
      setRole(paramMemberInfo.getRole());
      try
      {
        setNameCard(new String(paramMemberInfo.getName_card(), "utf-8"));
        setSilenceSeconds(paramMemberInfo.getShutup_time());
        paramMemberInfo = paramMemberInfo.getCustom_info();
        localMapKeyFetcher = new MapKeyFetcher();
        localMapKeyFetcher.fetchMapKeys(paramMemberInfo);
        i = 0;
        if (i >= paramMemberInfo.size()) {
          continue;
        }
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        try
        {
          for (;;)
          {
            MapKeyFetcher localMapKeyFetcher;
            int i;
            getCustomInfo().put(new String(localMapKeyFetcher.getKey(i), "utf-8"), localMapKeyFetcher.getValue(paramMemberInfo, i));
            i += 1;
          }
          localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
          localUnsupportedEncodingException1.printStackTrace();
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          for (;;)
          {
            localUnsupportedEncodingException2.printStackTrace();
          }
        }
      }
    }
  }
  
  TIMGroupMemberInfo(NewGroupMemberInfo paramNewGroupMemberInfo)
  {
    if (paramNewGroupMemberInfo == null) {}
    for (;;)
    {
      return;
      setUser(paramNewGroupMemberInfo.getIdentifier());
      setRole(paramNewGroupMemberInfo.getMember_role());
      try
      {
        setNameCard(new String(paramNewGroupMemberInfo.getName_card(), "utf-8"));
        paramNewGroupMemberInfo = paramNewGroupMemberInfo.getCustom_info();
        localMapKeyFetcher = new MapKeyFetcher();
        localMapKeyFetcher.fetchMapKeys(paramNewGroupMemberInfo);
        i = 0;
        if (i >= paramNewGroupMemberInfo.size()) {
          continue;
        }
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        try
        {
          for (;;)
          {
            MapKeyFetcher localMapKeyFetcher;
            int i;
            getCustomInfo().put(new String(localMapKeyFetcher.getKey(i), "utf-8"), localMapKeyFetcher.getValue(paramNewGroupMemberInfo, i));
            i += 1;
          }
          localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
          localUnsupportedEncodingException1.printStackTrace();
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          for (;;)
          {
            localUnsupportedEncodingException2.printStackTrace();
          }
        }
      }
    }
  }
  
  public Map<String, byte[]> getCustomInfo()
  {
    return this.custom;
  }
  
  public long getJoinTime()
  {
    return this.joinTime;
  }
  
  public String getNameCard()
  {
    return this.nameCard;
  }
  
  public TIMGroupMemberRoleType getRole()
  {
    return this.role;
  }
  
  public long getSilenceSeconds()
  {
    return this.silenceSeconds;
  }
  
  public String getUser()
  {
    return this.user;
  }
  
  public void setCustomInfo(String paramString, byte[] paramArrayOfByte)
  {
    this.custom.put(paramString, paramArrayOfByte);
  }
  
  void setJoinTime(long paramLong)
  {
    this.joinTime = paramLong;
  }
  
  void setNameCard(String paramString)
  {
    this.nameCard = paramString;
  }
  
  void setRole(long paramLong)
  {
    TIMGroupMemberRoleType[] arrayOfTIMGroupMemberRoleType = TIMGroupMemberRoleType.values();
    int j = arrayOfTIMGroupMemberRoleType.length;
    int i = 0;
    while (i < j)
    {
      TIMGroupMemberRoleType localTIMGroupMemberRoleType = arrayOfTIMGroupMemberRoleType[i];
      if (paramLong == localTIMGroupMemberRoleType.getValue())
      {
        this.role = localTIMGroupMemberRoleType;
        return;
      }
      i += 1;
    }
    this.role = TIMGroupMemberRoleType.NotMember;
  }
  
  public void setRoleType(TIMGroupMemberRoleType paramTIMGroupMemberRoleType)
  {
    if (paramTIMGroupMemberRoleType == TIMGroupMemberRoleType.Admin)
    {
      this.role = paramTIMGroupMemberRoleType;
      return;
    }
    this.role = TIMGroupMemberRoleType.NotMember;
  }
  
  void setSilenceSeconds(long paramLong)
  {
    this.silenceSeconds = paramLong;
  }
  
  public void setUser(String paramString)
  {
    this.user = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGroupMemberInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */