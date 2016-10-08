package tencent.tls.account;

import tencent.tls.tools.util;

public class TLSOpenAccountInfo
{
  public String access_token;
  public String identifer;
  public int openAccountType;
  public String openappid;
  public String openid;
  public long sdkAppid;
  public TLSOpenAccountInfo.OpenAccountStatus status;
  public int userAccountType;
  public String usersig;
  
  public TLSOpenAccountInfo(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    this.openAccountType = paramInt;
    this.openappid = paramString1;
    this.openid = paramString2;
    this.access_token = paramString3;
    this.status = TLSOpenAccountInfo.OpenAccountStatus.UNKNOWN;
  }
  
  public boolean checkInvalid()
  {
    return (this.openAccountType < 1) || (util.checkInvalid(this.openappid)) || (util.checkInvalid(this.openid)) || (util.checkInvalid(this.access_token));
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\account\TLSOpenAccountInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */