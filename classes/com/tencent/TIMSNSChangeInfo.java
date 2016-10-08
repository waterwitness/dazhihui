package com.tencent;

import com.tencent.imcore.AddFriendReq;
import com.tencent.imcore.FriendChangeUserInfo;
import java.io.UnsupportedEncodingException;

public class TIMSNSChangeInfo
{
  private String identifier = "";
  private String nickName = "";
  private String remark = "";
  private String source = "";
  private String wording = "";
  
  TIMSNSChangeInfo(AddFriendReq paramAddFriendReq)
  {
    if (paramAddFriendReq == null) {
      return;
    }
    setIdentifier(paramAddFriendReq.getIdentifier());
    try
    {
      setSource(new String(paramAddFriendReq.getSource(), "utf-8"));
      setWording(new String(paramAddFriendReq.getWording(), "utf-8"));
      setNickName(new String(paramAddFriendReq.getNickname(), "utf-8"));
      return;
    }
    catch (UnsupportedEncodingException paramAddFriendReq)
    {
      paramAddFriendReq.printStackTrace();
    }
  }
  
  TIMSNSChangeInfo(FriendChangeUserInfo paramFriendChangeUserInfo)
  {
    if (paramFriendChangeUserInfo == null) {
      return;
    }
    setIdentifier(paramFriendChangeUserInfo.getIdentifier());
    try
    {
      setSource(new String(paramFriendChangeUserInfo.getAdd_source(), "utf-8"));
      setWording(new String(paramFriendChangeUserInfo.getAdd_wording(), "utf-8"));
      setNickName(new String(paramFriendChangeUserInfo.getNick(), "utf-8"));
      setRemark(new String(paramFriendChangeUserInfo.getRemark(), "utf-8"));
      return;
    }
    catch (UnsupportedEncodingException paramFriendChangeUserInfo)
    {
      paramFriendChangeUserInfo.printStackTrace();
    }
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
  
  public String getSource()
  {
    return this.source;
  }
  
  public String getWording()
  {
    return this.wording;
  }
  
  void setIdentifier(String paramString)
  {
    this.identifier = paramString;
  }
  
  void setNickName(String paramString)
  {
    this.nickName = paramString;
  }
  
  void setRemark(String paramString)
  {
    this.remark = paramString;
  }
  
  void setSource(String paramString)
  {
    this.source = paramString;
  }
  
  void setWording(String paramString)
  {
    this.wording = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMSNSChangeInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */