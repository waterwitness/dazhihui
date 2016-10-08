package com.tencent;

public class TIMGroupTipsElemGroupInfo
{
  private String content;
  private TIMGroupTipsGroupInfoType type;
  
  public String getContent()
  {
    return this.content;
  }
  
  public TIMGroupTipsGroupInfoType getType()
  {
    return this.type;
  }
  
  void setContent(String paramString)
  {
    this.content = paramString;
  }
  
  void setType(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 1: 
      this.type = TIMGroupTipsGroupInfoType.ModifyName;
      return;
    case 2: 
      this.type = TIMGroupTipsGroupInfoType.ModifyIntroduction;
      return;
    case 3: 
      this.type = TIMGroupTipsGroupInfoType.ModifyNotification;
      return;
    case 4: 
      this.type = TIMGroupTipsGroupInfoType.ModifyFaceUrl;
      return;
    }
    this.type = TIMGroupTipsGroupInfoType.ModifyOwner;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGroupTipsElemGroupInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */