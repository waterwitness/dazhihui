package com.tencent;

import com.tencent.imcore.BytesMap;
import com.tencent.imcore.ComStatus;
import com.tencent.imcore.GroupDetailInfo;
import com.tencent.imcore.MapKeyFetcher;
import com.tencent.imsdk.QLog;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public class TIMGroupDetailInfo
{
  private static final String tag = "TIMGroupDetailInfo";
  private long createTime;
  private Map<String, byte[]> custom = new HashMap();
  TIMGroupAddOpt groupAddOpt = TIMGroupAddOpt.TIM_GROUP_ADD_AUTH;
  private String groupFaceUrl = "";
  private String groupId = "";
  private String groupIntroduction = "";
  private String groupName = "";
  private String groupNotice = "";
  private String groupOwner = "";
  private String groupType = "";
  private long lastInfoTime;
  private TIMMessage lastMsg = null;
  private long lastMsgTime;
  private long maxMemberNum;
  private long memberNum;
  private ComStatus searchable = ComStatus.kNotSet;
  private ComStatus visible = ComStatus.kNotSet;
  
  TIMGroupDetailInfo(GroupDetailInfo paramGroupDetailInfo)
  {
    if (paramGroupDetailInfo == null) {}
    for (;;)
    {
      return;
      setGroupId(paramGroupDetailInfo.getSGroupId());
      try
      {
        localObject1 = new String(paramGroupDetailInfo.getSGroupName(), "UTF-8");
        str = new String(paramGroupDetailInfo.getSIntroduction(), "UTF-8");
        localObject2 = new String(paramGroupDetailInfo.getSNotification(), "UTF-8");
        setIntroduction(str);
        setNotice((String)localObject2);
        setGroupName((String)localObject1);
        setGroupOwner(paramGroupDetailInfo.getSOwner());
        setFaceUrl(paramGroupDetailInfo.getSFaceUrl());
        setGroupType(paramGroupDetailInfo.getSGroupType());
        setAddOption(paramGroupDetailInfo.getDwAddOption());
        setCreateTime(paramGroupDetailInfo.getDwCreateTime());
        setLastInfoTime(paramGroupDetailInfo.getDwLastInfoTime());
        setLastMsgTime(paramGroupDetailInfo.getDwLastMsgTime());
        setMemberNum(paramGroupDetailInfo.getDwMemberNum());
        setMaxMemberNum(paramGroupDetailInfo.getDwMaxMemberNum());
        setLastMsg(new TIMMessage(paramGroupDetailInfo.getLastMsg()));
        setVisible(paramGroupDetailInfo.getEVisible());
        setSearchable(paramGroupDetailInfo.getESearchable());
        int j = (int)paramGroupDetailInfo.getCustom_info().size();
        localObject1 = new MapKeyFetcher();
        ((MapKeyFetcher)localObject1).fetchMapKeys(paramGroupDetailInfo.getCustom_info());
        getCustom().clear();
        i = 0;
        if (i >= j) {
          continue;
        }
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        try
        {
          for (;;)
          {
            Object localObject1;
            int i;
            String str = new String(((MapKeyFetcher)localObject1).getKey(i), "utf-8");
            Object localObject2 = ((MapKeyFetcher)localObject1).getValue(paramGroupDetailInfo.getCustom_info(), i);
            QLog.i("TIMGroupDetailInfo", 1, "custom|" + str + "|" + new String((byte[])localObject2, "utf-8"));
            getCustom().put(str, localObject2);
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
  
  public long getCreateTime()
  {
    return this.createTime;
  }
  
  public Map<String, byte[]> getCustom()
  {
    return this.custom;
  }
  
  public String getFaceUrl()
  {
    return this.groupFaceUrl;
  }
  
  public TIMGroupAddOpt getGroupAddOpt()
  {
    return this.groupAddOpt;
  }
  
  public String getGroupId()
  {
    return this.groupId;
  }
  
  public String getGroupIntroduction()
  {
    return this.groupIntroduction;
  }
  
  public String getGroupName()
  {
    return this.groupName;
  }
  
  public String getGroupNotification()
  {
    return this.groupNotice;
  }
  
  public String getGroupOwner()
  {
    return this.groupOwner;
  }
  
  public String getGroupType()
  {
    return this.groupType;
  }
  
  public long getLastInfoTime()
  {
    return this.lastInfoTime;
  }
  
  public TIMMessage getLastMsg()
  {
    return this.lastMsg;
  }
  
  public long getLastMsgTime()
  {
    return this.lastMsgTime;
  }
  
  public long getMaxMemberNum()
  {
    return this.maxMemberNum;
  }
  
  public long getMemberNum()
  {
    return this.memberNum;
  }
  
  public ComStatus getSearchable()
  {
    return this.searchable;
  }
  
  public ComStatus getVisible()
  {
    return this.visible;
  }
  
  void setAddOption(long paramLong)
  {
    TIMGroupAddOpt[] arrayOfTIMGroupAddOpt = TIMGroupAddOpt.values();
    int j = arrayOfTIMGroupAddOpt.length;
    int i = 0;
    while (i < j)
    {
      TIMGroupAddOpt localTIMGroupAddOpt = arrayOfTIMGroupAddOpt[i];
      if (localTIMGroupAddOpt.getValue() == paramLong) {
        this.groupAddOpt = localTIMGroupAddOpt;
      }
      i += 1;
    }
  }
  
  void setCreateTime(long paramLong)
  {
    this.createTime = paramLong;
  }
  
  void setFaceUrl(String paramString)
  {
    this.groupFaceUrl = paramString;
  }
  
  void setGroupId(String paramString)
  {
    this.groupId = paramString;
  }
  
  void setGroupName(String paramString)
  {
    this.groupName = paramString;
  }
  
  void setGroupOwner(String paramString)
  {
    this.groupOwner = paramString;
  }
  
  void setGroupType(String paramString)
  {
    this.groupType = paramString;
  }
  
  void setIntroduction(String paramString)
  {
    this.groupIntroduction = paramString;
  }
  
  void setLastInfoTime(long paramLong)
  {
    this.lastInfoTime = paramLong;
  }
  
  void setLastMsg(TIMMessage paramTIMMessage)
  {
    this.lastMsg = paramTIMMessage;
  }
  
  void setLastMsgTime(long paramLong)
  {
    this.lastMsgTime = paramLong;
  }
  
  void setMaxMemberNum(long paramLong)
  {
    this.maxMemberNum = paramLong;
  }
  
  void setMemberNum(long paramLong)
  {
    this.memberNum = paramLong;
  }
  
  void setNotice(String paramString)
  {
    this.groupNotice = paramString;
  }
  
  public void setSearchable(ComStatus paramComStatus)
  {
    this.searchable = paramComStatus;
  }
  
  protected void setVisible(ComStatus paramComStatus)
  {
    this.visible = paramComStatus;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGroupDetailInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */