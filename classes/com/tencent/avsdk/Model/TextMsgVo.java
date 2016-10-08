package com.tencent.avsdk.Model;

import com.tencent.avsdk.UserInfo;
import java.util.List;

public class TextMsgVo
{
  public String Account;
  public String AccountImg;
  public String AccountLevel;
  public String AccountName;
  public String Msg;
  public List<String> Tags;
  public int Type;
  
  public TextMsgVo(UserInfo paramUserInfo, int paramInt)
  {
    this.Account = paramUserInfo.getUserPhone();
    this.AccountName = paramUserInfo.getUserName();
    this.AccountLevel = paramUserInfo.getAccountLevel();
    this.AccountImg = paramUserInfo.getHeadImagePath();
    this.Type = paramInt;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\Model\TextMsgVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */